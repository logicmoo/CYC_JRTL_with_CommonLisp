package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.date_defns;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_evaluation_defns extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns";
    public static final String myFingerPrint = "bdd24d7c1956131d3c4e0dae279f079747a926570deb882434226a4776b39219";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 3101L)
    public static SubLSymbol $current_sksi_reformulate_sks$;
    private static final SubLString $str0$the_;
    private static final SubLSymbol $sym1$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING;
    private static final SubLSymbol $sym2$CYC_SKSI_SOURCE_REGISTERED;
    private static final SubLSymbol $sym3$CYC_SKSI_SOURCE_ACTIVATED;
    private static final SubLSymbol $sym4$CYC_SKSI_SOURCE_ACCESSIBLE;
    private static final SubLSymbol $sym5$CYC_SKSI_SOURCE_QUERYABLE;
    private static final SubLSymbol $sym6$CYC_PARSE_PLACE_NAME;
    private static final SubLSymbol $sym7$SKSI_PARSE_PLACE_NAME;
    private static final SubLSymbol $kw8$DENOT;
    private static final SubLSymbol $kw9$NEVER;
    private static final SubLSymbol $kw10$UNREFORMULATABLE;
    private static final SubLObject $const11$SchemaObjectIDFn;
    private static final SubLSymbol $sym12$CYC_SCHEMA_OBJECT_ID_FN;
    private static final SubLSymbol $sym13$CYC_SOURCE_SCHEMA_OBJECT_ID_FN;
    private static final SubLObject $const14$SchemaObjectFn;
    private static final SubLSymbol $sym15$CYC_SCHEMA_OBJECT_FN;
    private static final SubLObject $const16$SourceSchemaObjectFn;
    private static final SubLSymbol $sym17$CYC_SOURCE_SCHEMA_OBJECT_FN;
    private static final SubLObject $const18$SKSIDateDecodeFn;
    private static final SubLSymbol $kw19$NULL;
    private static final SubLSymbol $sym20$SKSI_DATE_DECODE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 895L)
    public static SubLObject pre_remove_definite_article_from_string(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.pre_remove(string, (SubLObject)sksi_evaluation_defns.$str0$the_, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 1202L)
    public static SubLObject cyc_sksi_source_registered(final SubLObject sks) {
        if (sksi_evaluation_defns.NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_registeredP(sks, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 1444L)
    public static SubLObject cyc_sksi_source_activated(final SubLObject sks) {
        if (sksi_evaluation_defns.NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.external_source_activated_in_imageP(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 1698L)
    public static SubLObject cyc_sksi_source_accessible(final SubLObject sks) {
        if (sksi_evaluation_defns.NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_accessibleP(sks, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 1940L)
    public static SubLObject cyc_sksi_source_queryable(final SubLObject sks) {
        if (sksi_evaluation_defns.NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_infrastructure_utilities.sk_source_queryableP(sks, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 2179L)
    public static SubLObject cyc_parse_place_name(final SubLObject name, final SubLObject type, final SubLObject domain_mt, final SubLObject parsing_mt) {
        if (!name.isString() && sksi_evaluation_defns.NIL == forts.fort_p(type) && sksi_evaluation_defns.NIL == hlmt.hlmt_p(domain_mt) && sksi_evaluation_defns.NIL == hlmt.hlmt_p(parsing_mt)) {
            relation_evaluation.throw_unevaluatable();
        }
        return sksi_parse_place_name(name, type, domain_mt, parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 2545L)
    public static SubLObject sksi_parse_place_name_internal(final SubLObject name, final SubLObject type, final SubLObject domain_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject place = lexicon_accessors.typed_denots_of_string(name, type, (SubLObject)sksi_evaluation_defns.NIL, (SubLObject)sksi_evaluation_defns.$kw8$DENOT, (SubLObject)sksi_evaluation_defns.T, (SubLObject)sksi_evaluation_defns.NIL, parsing_mt, domain_mt, (SubLObject)sksi_evaluation_defns.$kw9$NEVER, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
        if (sksi_evaluation_defns.NIL == place) {
            final SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
            try {
                parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
                place = parsing_utilities.parse_noun_compound_with_types(name, (SubLObject)ConsesLow.list(type), (SubLObject)sksi_evaluation_defns.NIL, (SubLObject)sksi_evaluation_defns.T, (SubLObject)sksi_evaluation_defns.ONE_INTEGER, (SubLObject)sksi_evaluation_defns.NIL);
                if (sksi_evaluation_defns.NIL == place && sksi_evaluation_defns.NIL != string_utilities.contains_charP(name, (SubLObject)Characters.CHAR_hyphen)) {
                    place = parsing_utilities.parse_noun_compound_with_types(Sequences.substitute(string_utilities.$space_char$.getGlobalValue(), (SubLObject)Characters.CHAR_hyphen, name, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED), (SubLObject)ConsesLow.list(type), (SubLObject)sksi_evaluation_defns.NIL, (SubLObject)sksi_evaluation_defns.T, (SubLObject)sksi_evaluation_defns.ONE_INTEGER, (SubLObject)sksi_evaluation_defns.NIL);
                }
            }
            finally {
                parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return list_utilities.fast_delete_duplicates(place, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 2545L)
    public static SubLObject sksi_parse_place_name(final SubLObject name, final SubLObject type, final SubLObject domain_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_evaluation_defns.NIL;
        if (sksi_evaluation_defns.NIL == v_memoization_state) {
            return sksi_parse_place_name_internal(name, type, domain_mt, parsing_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_evaluation_defns.$sym7$SKSI_PARSE_PLACE_NAME, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
        if (sksi_evaluation_defns.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_evaluation_defns.$sym7$SKSI_PARSE_PLACE_NAME, (SubLObject)sksi_evaluation_defns.FOUR_INTEGER, (SubLObject)sksi_evaluation_defns.NIL, (SubLObject)sksi_evaluation_defns.EQUAL, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_evaluation_defns.$sym7$SKSI_PARSE_PLACE_NAME, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(name, type, domain_mt, parsing_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_evaluation_defns.NIL;
            collision = cdolist_list_var.first();
            while (sksi_evaluation_defns.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (domain_mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_evaluation_defns.NIL != cached_args && sksi_evaluation_defns.NIL == cached_args.rest() && parsing_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_parse_place_name_internal(name, type, domain_mt, parsing_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(name, type, domain_mt, parsing_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 3544L)
    public static SubLObject cyc_schema_object_id_fn(final SubLObject logical_schema, final SubLObject cycl_input) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_evaluation_defns.NIL != sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread)) {
            if (sksi_evaluation_defns.NIL == forts.fort_p(logical_schema) || sksi_evaluation_defns.NIL == forts.fort_p(sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread))) {
                relation_evaluation.throw_unevaluatable();
            }
            final SubLObject result = sksi_reformulate.sksi_encode(cycl_input, logical_schema, sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread));
            if (result == sksi_evaluation_defns.$kw10$UNREFORMULATABLE) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
        return (SubLObject)ConsesLow.list(sksi_evaluation_defns.$const11$SchemaObjectIDFn, logical_schema, cycl_input);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 4108L)
    public static SubLObject cyc_source_schema_object_id_fn(final SubLObject sks, final SubLObject logical_schema, final SubLObject cycl_input) {
        if (sksi_evaluation_defns.NIL == forts.fort_p(sks) || sksi_evaluation_defns.NIL == forts.fort_p(logical_schema)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = sksi_reformulate.sksi_encode(cycl_input, logical_schema, sks);
        if (result == sksi_evaluation_defns.$kw10$UNREFORMULATABLE) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 4516L)
    public static SubLObject cyc_schema_object_fn(final SubLObject logical_schema, final SubLObject raw_input) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_evaluation_defns.NIL != sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread)) {
            if (sksi_evaluation_defns.NIL == forts.fort_p(logical_schema) || sksi_evaluation_defns.NIL == forts.fort_p(sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread))) {
                relation_evaluation.throw_unevaluatable();
            }
            final SubLObject result = sksi_reformulate.sksi_decode(raw_input, logical_schema, sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread), sksi_evaluation_defns.$const14$SchemaObjectFn);
            if (result == sksi_evaluation_defns.$kw10$UNREFORMULATABLE) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
        return (SubLObject)ConsesLow.list(sksi_evaluation_defns.$const14$SchemaObjectFn, logical_schema, raw_input);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 5169L)
    public static SubLObject cyc_source_schema_object_fn(final SubLObject sks, final SubLObject logical_schema, final SubLObject raw_input) {
        if (sksi_evaluation_defns.NIL == forts.fort_p(sks) || sksi_evaluation_defns.NIL == forts.fort_p(logical_schema)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = sksi_reformulate.sksi_decode(raw_input, logical_schema, sks, sksi_evaluation_defns.$const16$SourceSchemaObjectFn);
        if (result == sksi_evaluation_defns.$kw10$UNREFORMULATABLE) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-evaluation-defns.lisp", position = 5593L)
    public static SubLObject sksi_date_decode(final SubLObject pf, final SubLObject date_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_evaluation_defns.NIL == sksi_evaluation_defns.$current_sksi_reformulate_sks$.getDynamicValue(thread)) {
            return el_utilities.make_binary_formula(sksi_evaluation_defns.$const18$SKSIDateDecodeFn, pf, date_string);
        }
        if (sksi_evaluation_defns.$kw19$NULL != date_string) {
            return date_defns.cyc_date_from_string(date_string);
        }
        final SubLObject canonical_pf = czer_main.canonicalize_term(pf, (SubLObject)sksi_evaluation_defns.UNPROVIDED);
        final SubLObject null_translation = (SubLObject)((sksi_evaluation_defns.NIL != forts.fort_p(canonical_pf)) ? sksi_kb_accessors.sksi_temporal_field_null_maps_to(canonical_pf) : sksi_evaluation_defns.NIL);
        if (sksi_evaluation_defns.NIL != null_translation) {
            return null_translation;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)sksi_evaluation_defns.NIL;
    }
    
    public static SubLObject declare_sksi_evaluation_defns_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "pre_remove_definite_article_from_string", "PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_sksi_source_registered", "CYC-SKSI-SOURCE-REGISTERED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_sksi_source_activated", "CYC-SKSI-SOURCE-ACTIVATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_sksi_source_accessible", "CYC-SKSI-SOURCE-ACCESSIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_sksi_source_queryable", "CYC-SKSI-SOURCE-QUERYABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_parse_place_name", "CYC-PARSE-PLACE-NAME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "sksi_parse_place_name_internal", "SKSI-PARSE-PLACE-NAME-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "sksi_parse_place_name", "SKSI-PARSE-PLACE-NAME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_schema_object_id_fn", "CYC-SCHEMA-OBJECT-ID-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_source_schema_object_id_fn", "CYC-SOURCE-SCHEMA-OBJECT-ID-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_schema_object_fn", "CYC-SCHEMA-OBJECT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "cyc_source_schema_object_fn", "CYC-SOURCE-SCHEMA-OBJECT-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_evaluation_defns", "sksi_date_decode", "SKSI-DATE-DECODE", 2, 0, false);
        return (SubLObject)sksi_evaluation_defns.NIL;
    }
    
    public static SubLObject init_sksi_evaluation_defns_file() {
        sksi_evaluation_defns.$current_sksi_reformulate_sks$ = SubLFiles.defparameter("*CURRENT-SKSI-REFORMULATE-SKS*", (SubLObject)sksi_evaluation_defns.NIL);
        return (SubLObject)sksi_evaluation_defns.NIL;
    }
    
    public static SubLObject setup_sksi_evaluation_defns_file() {
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym1$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym2$CYC_SKSI_SOURCE_REGISTERED);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym3$CYC_SKSI_SOURCE_ACTIVATED);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym4$CYC_SKSI_SOURCE_ACCESSIBLE);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym5$CYC_SKSI_SOURCE_QUERYABLE);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym6$CYC_PARSE_PLACE_NAME);
        memoization_state.note_memoized_function((SubLObject)sksi_evaluation_defns.$sym7$SKSI_PARSE_PLACE_NAME);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym12$CYC_SCHEMA_OBJECT_ID_FN);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym13$CYC_SOURCE_SCHEMA_OBJECT_ID_FN);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym15$CYC_SCHEMA_OBJECT_FN);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym17$CYC_SOURCE_SCHEMA_OBJECT_FN);
        utilities_macros.register_kb_function((SubLObject)sksi_evaluation_defns.$sym20$SKSI_DATE_DECODE);
        return (SubLObject)sksi_evaluation_defns.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_evaluation_defns_file();
    }
    
    public void initializeVariables() {
        init_sksi_evaluation_defns_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_evaluation_defns_file();
    }
    
    static {
        me = (SubLFile)new sksi_evaluation_defns();
        sksi_evaluation_defns.$current_sksi_reformulate_sks$ = null;
        $str0$the_ = SubLObjectFactory.makeString("the ");
        $sym1$PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING = SubLObjectFactory.makeSymbol("PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING");
        $sym2$CYC_SKSI_SOURCE_REGISTERED = SubLObjectFactory.makeSymbol("CYC-SKSI-SOURCE-REGISTERED");
        $sym3$CYC_SKSI_SOURCE_ACTIVATED = SubLObjectFactory.makeSymbol("CYC-SKSI-SOURCE-ACTIVATED");
        $sym4$CYC_SKSI_SOURCE_ACCESSIBLE = SubLObjectFactory.makeSymbol("CYC-SKSI-SOURCE-ACCESSIBLE");
        $sym5$CYC_SKSI_SOURCE_QUERYABLE = SubLObjectFactory.makeSymbol("CYC-SKSI-SOURCE-QUERYABLE");
        $sym6$CYC_PARSE_PLACE_NAME = SubLObjectFactory.makeSymbol("CYC-PARSE-PLACE-NAME");
        $sym7$SKSI_PARSE_PLACE_NAME = SubLObjectFactory.makeSymbol("SKSI-PARSE-PLACE-NAME");
        $kw8$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw9$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $kw10$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
        $const11$SchemaObjectIDFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectIDFn"));
        $sym12$CYC_SCHEMA_OBJECT_ID_FN = SubLObjectFactory.makeSymbol("CYC-SCHEMA-OBJECT-ID-FN");
        $sym13$CYC_SOURCE_SCHEMA_OBJECT_ID_FN = SubLObjectFactory.makeSymbol("CYC-SOURCE-SCHEMA-OBJECT-ID-FN");
        $const14$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $sym15$CYC_SCHEMA_OBJECT_FN = SubLObjectFactory.makeSymbol("CYC-SCHEMA-OBJECT-FN");
        $const16$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn"));
        $sym17$CYC_SOURCE_SCHEMA_OBJECT_FN = SubLObjectFactory.makeSymbol("CYC-SOURCE-SCHEMA-OBJECT-FN");
        $const18$SKSIDateDecodeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIDateDecodeFn"));
        $kw19$NULL = SubLObjectFactory.makeKeyword("NULL");
        $sym20$SKSI_DATE_DECODE = SubLObjectFactory.makeSymbol("SKSI-DATE-DECODE");
    }
}

/*

	Total time: 136 ms
	
*/