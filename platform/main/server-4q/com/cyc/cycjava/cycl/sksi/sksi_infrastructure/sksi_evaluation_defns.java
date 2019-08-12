/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_evaluation_defns extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_evaluation_defns();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_sksi_reformulate_sks$ = makeSymbol("*CURRENT-SKSI-REFORMULATE-SKS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$the_ = makeString("the ");

    private static final SubLSymbol PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING = makeSymbol("PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING");

    private static final SubLSymbol CYC_SKSI_SOURCE_REGISTERED = makeSymbol("CYC-SKSI-SOURCE-REGISTERED");

    private static final SubLSymbol CYC_SKSI_SOURCE_ACTIVATED = makeSymbol("CYC-SKSI-SOURCE-ACTIVATED");

    private static final SubLSymbol CYC_SKSI_SOURCE_ACCESSIBLE = makeSymbol("CYC-SKSI-SOURCE-ACCESSIBLE");

    private static final SubLSymbol CYC_SKSI_SOURCE_QUERYABLE = makeSymbol("CYC-SKSI-SOURCE-QUERYABLE");

    private static final SubLSymbol CYC_PARSE_PLACE_NAME = makeSymbol("CYC-PARSE-PLACE-NAME");

    private static final SubLSymbol SKSI_PARSE_PLACE_NAME = makeSymbol("SKSI-PARSE-PLACE-NAME");



    private static final SubLSymbol CYC_SCHEMA_OBJECT_ID_FN = makeSymbol("CYC-SCHEMA-OBJECT-ID-FN");

    private static final SubLSymbol CYC_SOURCE_SCHEMA_OBJECT_ID_FN = makeSymbol("CYC-SOURCE-SCHEMA-OBJECT-ID-FN");



    private static final SubLSymbol CYC_SCHEMA_OBJECT_FN = makeSymbol("CYC-SCHEMA-OBJECT-FN");



    private static final SubLSymbol CYC_SOURCE_SCHEMA_OBJECT_FN = makeSymbol("CYC-SOURCE-SCHEMA-OBJECT-FN");



    private static final SubLSymbol SKSI_DATE_DECODE = makeSymbol("SKSI-DATE-DECODE");

    // Definitions
    public static final SubLObject pre_remove_definite_article_from_string_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.pre_remove(string, $str_alt0$the_, UNPROVIDED);
    }

    // Definitions
    public static SubLObject pre_remove_definite_article_from_string(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.pre_remove(string, $$$the_, UNPROVIDED);
    }

    public static final SubLObject cyc_sksi_source_registered_alt(SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_registeredP(sks, UNPROVIDED);
    }

    public static SubLObject cyc_sksi_source_registered(final SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_registeredP(sks, UNPROVIDED);
    }

    public static final SubLObject cyc_sksi_source_activated_alt(SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(sks);
    }

    public static SubLObject cyc_sksi_source_activated(final SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(sks);
    }

    public static final SubLObject cyc_sksi_source_accessible_alt(SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_accessibleP(sks, UNPROVIDED);
    }

    public static SubLObject cyc_sksi_source_accessible(final SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_accessibleP(sks, UNPROVIDED);
    }

    public static final SubLObject cyc_sksi_source_queryable_alt(SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_queryableP(sks, UNPROVIDED);
    }

    public static SubLObject cyc_sksi_source_queryable(final SubLObject sks) {
        if (NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_queryableP(sks, UNPROVIDED);
    }

    public static final SubLObject cyc_parse_place_name_alt(SubLObject name, SubLObject type, SubLObject domain_mt, SubLObject parsing_mt) {
        if (!(((name.isString() || (NIL != forts.fort_p(type))) || (NIL != hlmt.hlmt_p(domain_mt))) || (NIL != hlmt.hlmt_p(parsing_mt)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns.sksi_parse_place_name(name, type, domain_mt, parsing_mt);
    }

    public static SubLObject cyc_parse_place_name(final SubLObject name, final SubLObject type, final SubLObject domain_mt, final SubLObject parsing_mt) {
        if ((((!name.isString()) && (NIL == forts.fort_p(type))) && (NIL == hlmt.hlmt_p(domain_mt))) && (NIL == hlmt.hlmt_p(parsing_mt))) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_parse_place_name(name, type, domain_mt, parsing_mt);
    }

    public static final SubLObject sksi_parse_place_name_internal_alt(SubLObject name, SubLObject type, SubLObject domain_mt, SubLObject parsing_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject place = lexicon_accessors.typed_denots_of_string(name, type, NIL, $DENOT, T, NIL, parsing_mt, domain_mt, $NEVER, UNPROVIDED);
                if (NIL == place) {
                    {
                        SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
                        try {
                            parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
                            place = parsing_utilities.parse_noun_compound_with_types(name, list(type), NIL, T, ONE_INTEGER, NIL);
                            if (NIL == place) {
                                if (NIL != string_utilities.contains_charP(name, CHAR_hyphen)) {
                                    place = parsing_utilities.parse_noun_compound_with_types(substitute(string_utilities.$space_char$.getGlobalValue(), CHAR_hyphen, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list(type), NIL, T, ONE_INTEGER, NIL);
                                }
                            }
                        } finally {
                            parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(place, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject sksi_parse_place_name_internal(final SubLObject name, final SubLObject type, final SubLObject domain_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject place = lexicon_accessors.typed_denots_of_string(name, type, NIL, $DENOT, T, NIL, parsing_mt, domain_mt, $NEVER, UNPROVIDED);
        if (NIL == place) {
            final SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
            try {
                parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
                place = parsing_utilities.parse_noun_compound_with_types(name, list(type), NIL, T, ONE_INTEGER, NIL);
                if ((NIL == place) && (NIL != string_utilities.contains_charP(name, CHAR_hyphen))) {
                    place = parsing_utilities.parse_noun_compound_with_types(substitute(string_utilities.$space_char$.getGlobalValue(), CHAR_hyphen, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list(type), NIL, T, ONE_INTEGER, NIL);
                }
            } finally {
                parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return list_utilities.fast_delete_duplicates(place, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sksi_parse_place_name_alt(SubLObject name, SubLObject type, SubLObject domain_mt, SubLObject parsing_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns.sksi_parse_place_name_internal(name, type, domain_mt, parsing_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_PARSE_PLACE_NAME, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_PARSE_PLACE_NAME, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_PARSE_PLACE_NAME, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(name, type, domain_mt, parsing_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (name.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (type.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (domain_mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && parsing_mt.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns.sksi_parse_place_name_internal(name, type, domain_mt, parsing_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(name, type, domain_mt, parsing_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_parse_place_name(final SubLObject name, final SubLObject type, final SubLObject domain_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_parse_place_name_internal(name, type, domain_mt, parsing_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_PARSE_PLACE_NAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_PARSE_PLACE_NAME, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_PARSE_PLACE_NAME, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(name, type, domain_mt, parsing_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (domain_mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && parsing_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_parse_place_name_internal(name, type, domain_mt, parsing_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(name, type, domain_mt, parsing_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject cyc_schema_object_id_fn_alt(SubLObject logical_schema, SubLObject cycl_input) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $current_sksi_reformulate_sks$.getDynamicValue(thread)) {
                if (!((NIL != forts.fort_p(logical_schema)) && (NIL != forts.fort_p($current_sksi_reformulate_sks$.getDynamicValue(thread))))) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject result = sksi_reformulate.sksi_encode(cycl_input, logical_schema, $current_sksi_reformulate_sks$.getDynamicValue(thread));
                    if (result == $UNREFORMULATABLE) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return result;
                }
            } else {
                return list($$SchemaObjectIDFn, logical_schema, cycl_input);
            }
        }
    }

    public static SubLObject cyc_schema_object_id_fn(final SubLObject logical_schema, final SubLObject cycl_input) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $current_sksi_reformulate_sks$.getDynamicValue(thread)) {
            if ((NIL == forts.fort_p(logical_schema)) || (NIL == forts.fort_p($current_sksi_reformulate_sks$.getDynamicValue(thread)))) {
                relation_evaluation.throw_unevaluatable();
            }
            final SubLObject result = sksi_reformulate.sksi_encode(cycl_input, logical_schema, $current_sksi_reformulate_sks$.getDynamicValue(thread));
            if (result == $UNREFORMULATABLE) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
        return list($$SchemaObjectIDFn, logical_schema, cycl_input);
    }

    public static final SubLObject cyc_source_schema_object_id_fn_alt(SubLObject sks, SubLObject logical_schema, SubLObject cycl_input) {
        if (!((NIL != forts.fort_p(sks)) && (NIL != forts.fort_p(logical_schema)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject result = sksi_reformulate.sksi_encode(cycl_input, logical_schema, sks);
            if (result == $UNREFORMULATABLE) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    public static SubLObject cyc_source_schema_object_id_fn(final SubLObject sks, final SubLObject logical_schema, final SubLObject cycl_input) {
        if ((NIL == forts.fort_p(sks)) || (NIL == forts.fort_p(logical_schema))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = sksi_reformulate.sksi_encode(cycl_input, logical_schema, sks);
        if (result == $UNREFORMULATABLE) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject cyc_schema_object_fn_alt(SubLObject logical_schema, SubLObject raw_input) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $current_sksi_reformulate_sks$.getDynamicValue(thread)) {
                if (!((NIL != forts.fort_p(logical_schema)) && (NIL != forts.fort_p($current_sksi_reformulate_sks$.getDynamicValue(thread))))) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject result = sksi_reformulate.sksi_decode(raw_input, logical_schema, $current_sksi_reformulate_sks$.getDynamicValue(thread), $$SchemaObjectFn);
                    if (result == $UNREFORMULATABLE) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return result;
                }
            } else {
                return list($$SchemaObjectFn, logical_schema, raw_input);
            }
        }
    }

    public static SubLObject cyc_schema_object_fn(final SubLObject logical_schema, final SubLObject raw_input) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $current_sksi_reformulate_sks$.getDynamicValue(thread)) {
            if ((NIL == forts.fort_p(logical_schema)) || (NIL == forts.fort_p($current_sksi_reformulate_sks$.getDynamicValue(thread)))) {
                relation_evaluation.throw_unevaluatable();
            }
            final SubLObject result = sksi_reformulate.sksi_decode(raw_input, logical_schema, $current_sksi_reformulate_sks$.getDynamicValue(thread), $$SchemaObjectFn);
            if (result == $UNREFORMULATABLE) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
        return list($$SchemaObjectFn, logical_schema, raw_input);
    }

    public static final SubLObject cyc_source_schema_object_fn_alt(SubLObject sks, SubLObject logical_schema, SubLObject raw_input) {
        if (!((NIL != forts.fort_p(sks)) && (NIL != forts.fort_p(logical_schema)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject result = sksi_reformulate.sksi_decode(raw_input, logical_schema, sks, $$SourceSchemaObjectFn);
            if (result == $UNREFORMULATABLE) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    public static SubLObject cyc_source_schema_object_fn(final SubLObject sks, final SubLObject logical_schema, final SubLObject raw_input) {
        if ((NIL == forts.fort_p(sks)) || (NIL == forts.fort_p(logical_schema))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = sksi_reformulate.sksi_decode(raw_input, logical_schema, sks, $$SourceSchemaObjectFn);
        if (result == $UNREFORMULATABLE) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject sksi_date_decode(final SubLObject pf, final SubLObject date_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $current_sksi_reformulate_sks$.getDynamicValue(thread)) {
            return make_binary_formula($$SKSIDateDecodeFn, pf, date_string);
        }
        if ($NULL != date_string) {
            return date_defns.cyc_date_from_string(date_string);
        }
        final SubLObject canonical_pf = czer_main.canonicalize_term(pf, UNPROVIDED);
        final SubLObject null_translation = (NIL != forts.fort_p(canonical_pf)) ? sksi_kb_accessors.sksi_temporal_field_null_maps_to(canonical_pf) : NIL;
        if (NIL != null_translation) {
            return null_translation;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject declare_sksi_evaluation_defns_file() {
        declareFunction("pre_remove_definite_article_from_string", "PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING", 1, 0, false);
        declareFunction("cyc_sksi_source_registered", "CYC-SKSI-SOURCE-REGISTERED", 1, 0, false);
        declareFunction("cyc_sksi_source_activated", "CYC-SKSI-SOURCE-ACTIVATED", 1, 0, false);
        declareFunction("cyc_sksi_source_accessible", "CYC-SKSI-SOURCE-ACCESSIBLE", 1, 0, false);
        declareFunction("cyc_sksi_source_queryable", "CYC-SKSI-SOURCE-QUERYABLE", 1, 0, false);
        declareFunction("cyc_parse_place_name", "CYC-PARSE-PLACE-NAME", 4, 0, false);
        declareFunction("sksi_parse_place_name_internal", "SKSI-PARSE-PLACE-NAME-INTERNAL", 4, 0, false);
        declareFunction("sksi_parse_place_name", "SKSI-PARSE-PLACE-NAME", 4, 0, false);
        declareFunction("cyc_schema_object_id_fn", "CYC-SCHEMA-OBJECT-ID-FN", 2, 0, false);
        declareFunction("cyc_source_schema_object_id_fn", "CYC-SOURCE-SCHEMA-OBJECT-ID-FN", 3, 0, false);
        declareFunction("cyc_schema_object_fn", "CYC-SCHEMA-OBJECT-FN", 2, 0, false);
        declareFunction("cyc_source_schema_object_fn", "CYC-SOURCE-SCHEMA-OBJECT-FN", 3, 0, false);
        declareFunction("sksi_date_decode", "SKSI-DATE-DECODE", 2, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$the_ = makeString("the ");

    public static SubLObject init_sksi_evaluation_defns_file() {
        defparameter("*CURRENT-SKSI-REFORMULATE-SKS*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_evaluation_defns_file() {
        register_kb_function(PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING);
        register_kb_function(CYC_SKSI_SOURCE_REGISTERED);
        register_kb_function(CYC_SKSI_SOURCE_ACTIVATED);
        register_kb_function(CYC_SKSI_SOURCE_ACCESSIBLE);
        register_kb_function(CYC_SKSI_SOURCE_QUERYABLE);
        register_kb_function(CYC_PARSE_PLACE_NAME);
        memoization_state.note_memoized_function(SKSI_PARSE_PLACE_NAME);
        register_kb_function(CYC_SCHEMA_OBJECT_ID_FN);
        register_kb_function(CYC_SOURCE_SCHEMA_OBJECT_ID_FN);
        register_kb_function(CYC_SCHEMA_OBJECT_FN);
        register_kb_function(CYC_SOURCE_SCHEMA_OBJECT_FN);
        register_kb_function(SKSI_DATE_DECODE);
        return NIL;
    }

    public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    @Override
    public void declareFunctions() {
        declare_sksi_evaluation_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_evaluation_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_evaluation_defns_file();
    }

    static {
    }
}

/**
 * Total time: 136 ms
 */
