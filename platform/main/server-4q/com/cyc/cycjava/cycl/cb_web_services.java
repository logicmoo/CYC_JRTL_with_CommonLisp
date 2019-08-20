/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.inference.ask_utilities.query_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-WEB-SERVICES
 * source file: /cyc/top/cycl/cb-web-services.lisp
 * created:     2019/07/03 17:38:06
 */
public final class cb_web_services extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt4$ = makeString("");

    public static final SubLFile me = new cb_web_services();



    private static final SubLString $$$createType = makeString("createType");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $str2$ = makeString("");

    private static final SubLString $str3$spec_pred = makeString("spec-pred");

    private static final SubLString $$$baseType = makeString("baseType");



    private static final SubLString $$$instance = makeString("instance");



    private static final SubLString $$$spec = makeString("spec");

    private static final SubLList $list11 = list(reader_make_constant_shell("Collection"));



    private static final SubLString $str13$spec_mt = makeString("spec-mt");

    private static final SubLList $list14 = list(reader_make_constant_shell("Microtheory"));





    private static final SubLString $$$concept = makeString("concept");

    private static final SubLString $$$externalId = makeString("externalId");

    private static final SubLString $$$url = makeString("url");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol XML_TERM_CREATE = makeSymbol("XML-TERM-CREATE");

    private static final SubLList $list23 = list(reader_make_constant_shell("Predicate"));





    private static final SubLSymbol $sym27$_X = makeSymbol("?X");



    private static final SubLList $list29 = list(makeSymbol("?X"));

    private static final SubLList $list30 = list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("PredicateTypeByArity")));

    private static final SubLObject $const31$AtemporalNecessarilyEssentialColl = reader_make_constant_shell("AtemporalNecessarilyEssentialCollectionType");

    private static final SubLSymbol $sym32$_MT = makeSymbol("?MT");



    private static final SubLList $list34 = list(makeSymbol("?MT"));





    private static final SubLString $$$assert = makeString("assert");

    private static final SubLString $$$add = makeString("add");

    private static final SubLString $$$action = makeString("action");



    private static final SubLSymbol XML_SET_GENSTRING_ASSERTION = makeSymbol("XML-SET-GENSTRING-ASSERTION");

    private static final SubLString $$$strength = makeString("strength");

    private static final SubLList $list43 = list(cons(makeString("context"), reader_make_constant_shell("ContextuallyDependentLexicalMapping")), cons(makeString("primary"), reader_make_constant_shell("PrimaryLexicalMapping")), cons(makeString("default"), makeKeyword("DEFAULT")), cons(makeString("vanishing"), reader_make_constant_shell("VanishinglyRareLexicalMapping")));



    private static final SubLSymbol XML_SET_LEXICAL_MAPPING_STRENGTH = makeSymbol("XML-SET-LEXICAL-MAPPING-STRENGTH");



    private static final SubLString $$$term = makeString("term");

    private static final SubLString $$$bookmarked = makeString("bookmarked");

    private static final SubLString $$$result = makeString("result");

    private static final SubLString $$$newClass = makeString("newClass");

    private static final SubLString $$$title = makeString("title");

    private static final SubLSymbol XML_SET_BOOKMARK = makeSymbol("XML-SET-BOOKMARK");











    private static final SubLList $list60 = list(reader_make_constant_shell("Now"));

    private static final SubLList $list61 = list(reader_make_constant_shell("TimePoint"));

    private static final SubLSymbol $sym62$_ASSERT = makeSymbol("?ASSERT");



    private static final SubLList $list64 = list(list(reader_make_constant_shell("assertionMt"), makeSymbol("?ASSERT"), makeSymbol("?MT")), list(reader_make_constant_shell("mtTimeIndex"), makeSymbol("?MT"), makeSymbol("?INTERVAL")), list(reader_make_constant_shell("temporallySubsumes"), makeSymbol("?INTERVAL"), reader_make_constant_shell("Now")));



    private static final SubLList $list66 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol $sym67$_INT = makeSymbol("?INT");



    private static final SubLSymbol $sym69$_WHEN = makeSymbol("?WHEN");

    private static final SubLList $list70 = list(reader_make_constant_shell("indexicalReferent"), reader_make_constant_shell("Now-Indexical"), makeSymbol("?WHEN"));





    private static final SubLList $list73 = list(list(reader_make_constant_shell("IntervalEndedByFn"), makeSymbol("?WHEN")));

    static private final SubLString $str_alt1$text_xml = makeString("text/xml");

    private static final SubLList $list74 = list(makeSymbol("?INT"));

    private static final SubLSymbol $sym75$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list76 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("CyclistsMt"), list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), reader_make_constant_shell("Now"), reader_make_constant_shell("TimePoint")));

    // Definitions
    /**
     * currently, 'createType' can be either 'spec' or 'instance'
     */
    @LispMethod(comment = "currently, \'createType\' can be either \'spec\' or \'instance\'")
    public static final SubLObject xml_term_create_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject create_type = html_extract_input($$$createType, args);
                SubLObject user_sugg_name = html_extract_input($$$name, args);
                SubLObject const_name = constants_high.suggest_constant_name(user_sugg_name, $str_alt4$, $str_alt4$, T, UNPROVIDED);
                SubLObject new_term = ke.ke_create_now(const_name, UNPROVIDED);
                SubLObject base_type = kb_utilities.find_object_by_compact_hl_external_id_string(html_extract_input($$$baseType, args));
                SubLObject mt = com.cyc.cycjava.cycl.cb_web_services.get_defining_mt_for_type(create_type, base_type);
                SubLObject lexical_mt = $$EnglishMt;
                if (create_type.equalp($$$instance)) {
                    ke.ke_assert(list($$isa, new_term, base_type), mt, UNPROVIDED, UNPROVIDED);
                }
                if (create_type.equalp($$$spec)) {
                    ke.ke_assert(listS($$isa, new_term, $list_alt10), mt, UNPROVIDED, UNPROVIDED);
                    ke.ke_assert(list($$genls, new_term, base_type), mt, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject cdolist_list_var = auto_lexifier.auto_lexify(user_sugg_name, new_term, lexical_mt, mt);
                    SubLObject lexical_formula = NIL;
                    for (lexical_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexical_formula = cdolist_list_var.first()) {
                        ke.ke_assert(lexical_formula, lexical_mt, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                        {
                            SubLObject _prev_bind_0_1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$concept, list($$$externalId, kb_utilities.compact_hl_external_id_string(new_term), $$$url, com.cyc.cycjava.cycl.cb_web_services.url_encoded_cb_form(new_term)), NIL);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$concept);
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                cb_tools.cb_add_to_constant_history(new_term);
                return NIL;
            }
        }
    }

    // Definitions
    /**
     * currently, 'createType' can be either 'spec' or 'instance'
     */
    @LispMethod(comment = "currently, \'createType\' can be either \'spec\' or \'instance\'")
    public static SubLObject xml_term_create(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject create_type = html_extract_input($$$createType, args);
        final SubLObject user_sugg_name = html_extract_input($$$name, args);
        final SubLObject const_name = constants_high.suggest_constant_name(user_sugg_name, $str2$, $str2$, create_type.equalp($str3$spec_pred) ? $DOWNCASE : $UPCASE, UNPROVIDED, UNPROVIDED);
        final SubLObject new_term = ke.ke_create_now(const_name, UNPROVIDED);
        final SubLObject base_type = kb_utilities.find_object_by_compact_hl_external_id_string(html_extract_input($$$baseType, args));
        final SubLObject mt = get_defining_mt_for_type(create_type, base_type);
        final SubLObject lexical_mt = $$EnglishMt;
        if (create_type.equalp($$$instance)) {
            ke.ke_assert(list($$isa, new_term, base_type), mt, UNPROVIDED, UNPROVIDED);
        } else
            if (create_type.equalp($$$spec)) {
                ke.ke_assert(listS($$isa, new_term, $list11), mt, UNPROVIDED, UNPROVIDED);
                rkf_assertion_utilities.rkf_assert_with_implicature(list($$genls, new_term, base_type), mt, T);
            } else
                if (create_type.equalp($str13$spec_mt)) {
                    ke.ke_assert(listS($$isa, new_term, $list14), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                    ke.ke_assert(list($$genlMt, new_term, base_type), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                } else
                    if (create_type.equalp($str3$spec_pred)) {
                        create_spec_pred(base_type, new_term);
                    }



        SubLObject cdolist_list_var = auto_lexifier.auto_lexify(user_sugg_name, new_term, lexical_mt, mt);
        SubLObject lexical_formula = NIL;
        lexical_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_assert(lexical_formula, lexical_mt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            lexical_formula = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$concept, list($$$externalId, kb_utilities.compact_hl_external_id_string(new_term), $$$url, url_encoded_cb_form(new_term)), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$concept);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        cb_tools.cb_add_to_constant_history(new_term);
        return NIL;
    }

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("Collection"));

    public static final SubLObject $const15$AtemporalNecessarilyEssentialColl = reader_make_constant_shell("AtemporalNecessarilyEssentialCollectionType");

    static private final SubLSymbol $sym17$_MT = makeSymbol("?MT");

    static private final SubLList $list_alt19 = list(makeSymbol("?MT"));

    public static SubLObject create_spec_pred(final SubLObject genl_pred, final SubLObject spec_pred) {
        ke.ke_assert(listS($$isa, spec_pred, $list23), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
        rkf_assertion_utilities.rkf_assert_with_implicature(list($$genlPreds, spec_pred, genl_pred), $$UniversalVocabularyMt, UNPROVIDED);
        final SubLObject pred_var = $$argIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl_pred, NIL, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl_pred, NIL, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$4 = NIL;
                        final SubLObject token_var_$5 = NIL;
                        while (NIL == done_var_$4) {
                            final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(v_assert));
                            if (NIL != valid_$6) {
                                ke.ke_assert(cycl_utilities.formula_subst(spec_pred, genl_pred, uncanonicalizer.assertion_el_formula(v_assert), UNPROVIDED, UNPROVIDED), assertions_high.assertion_mt(v_assert), UNPROVIDED, UNPROVIDED);
                            }
                            done_var_$4 = makeBoolean(NIL == valid_$6);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        final SubLObject v_arity = ask_utilities.query_variable($sym27$_X, listS($$and, listS($$isa, genl_pred, $list29), $list30), $$UniversalVocabularyMt, UNPROVIDED).first();
        ke.ke_assert(list($$isa, spec_pred, v_arity), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject url_encoded_cb_form_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject s = NIL;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                    try {
                        html_macros.$html_stream$.bind(NIL, thread);
                        try {
                            html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                            s = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                return web_utilities.html_url_encode(s, UNPROVIDED);
            }
        }
    }

    public static SubLObject url_encoded_cb_form(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject s = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind(NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                s = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        return web_utilities.html_url_encode(s, UNPROVIDED);
    }

    public static final SubLObject get_defining_mt_for_type_alt(SubLObject create_type, SubLObject cycl_type) {
        {
            SubLObject mt = NIL;
            if (create_type.equal($$$instance) && (NIL != isa.isaP(create_type, $const15$AtemporalNecessarilyEssentialColl, UNPROVIDED, UNPROVIDED))) {
                mt = $$UniversalVocabularyMt;
            } else {
                if (create_type.equal($$$instance)) {
                    mt = query_variable($sym17$_MT, listS($$defaultDefiningMtForInstances, cycl_type, $list_alt19), $$BaseKB, UNPROVIDED).first();
                } else {
                    if (create_type.equal($$$instance)) {
                        mt = query_variable($sym17$_MT, listS($$defaultDefiningMtForSpecs, cycl_type, $list_alt19), $$BaseKB, UNPROVIDED).first();
                    }
                }
            }
            if (NIL == mt) {
                mt = $$UniversalVocabularyMt;
            }
            return mt;
        }
    }

    public static SubLObject get_defining_mt_for_type(final SubLObject create_type, final SubLObject cycl_type) {
        SubLObject mt = NIL;
        if (create_type.equal($$$instance) && (NIL != isa.isaP(create_type, $const31$AtemporalNecessarilyEssentialColl, UNPROVIDED, UNPROVIDED))) {
            mt = $$UniversalVocabularyMt;
        } else
            if (create_type.equal($$$instance)) {
                mt = ask_utilities.query_variable($sym32$_MT, listS($$defaultDefiningMtForInstances, cycl_type, $list34), $$BaseKB, UNPROVIDED).first();
            } else
                if (create_type.equal($$$instance)) {
                    mt = ask_utilities.query_variable($sym32$_MT, listS($$defaultDefiningMtForSpecs, cycl_type, $list34), $$BaseKB, UNPROVIDED).first();
                }


        if (NIL == mt) {
            mt = $$UniversalVocabularyMt;
        }
        return mt;
    }

    public static SubLObject xml_set_genstring_assertion(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(html_extract_input($$$assert, args));
        final SubLObject base_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        final SubLObject mt = (NIL != assertion) ? assertions_high.assertion_mt(assertion) : NIL;
        final SubLObject denot = (NIL != assertion) ? lexicon_accessors.assertion_denotation(assertion) : NIL;
        final SubLObject addP = equal($$$add, html_extract_input($$$action, args));
        if (NIL != mt) {
            if (NIL != addP) {
                ke.ke_assert_now(list($$genStringAssertion, denot, base_formula), mt, UNPROVIDED, UNPROVIDED);
            } else {
                unassert_all(list($$genStringAssertion, denot, base_formula));
            }
        }
        return NIL;
    }

    public static SubLObject xml_set_lexical_mapping_strength(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(html_extract_input($$$assert, args));
        final SubLObject base_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        final SubLObject current_strength = cb_lexical_info.lexical_assertion_strength(assertion);
        final SubLObject mt = (NIL != assertion) ? assertions_high.assertion_mt(assertion) : NIL;
        final SubLObject strength_str = html_extract_input($$$strength, args);
        final SubLObject str = list_utilities.alist_lookup($list43, strength_str, EQUAL, UNPROVIDED);
        if ((NIL != mt) && (NIL != str)) {
            if (current_strength != $DEFAULT) {
                unassert_all(list($$strengthOfLexicalMapping, base_formula, current_strength));
            }
            if (str != $DEFAULT) {
                ke.ke_assert_now(list($$strengthOfLexicalMapping, base_formula, str), mt, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject unassert_all(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unassert_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = czer_meta.find_assertions_cycl(sentence, UNPROVIDED);
            SubLObject v_assert = NIL;
            v_assert = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                unassert_count = add(unassert_count, ONE_INTEGER);
                ke.ke_unassert_now(sentence, assertions_high.assertion_mt(v_assert));
                cdolist_list_var = cdolist_list_var.rest();
                v_assert = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return unassert_count;
    }

    public static SubLObject xml_set_bookmark(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cb_guess_term(html_extract_input($$$term, args), UNPROVIDED);
        final SubLObject addP = equal($$$add, html_extract_input($$$action, args));
        final SubLObject new_class = (NIL != addP) ? $$$bookmarked : $str2$;
        final SubLObject title = (NIL != addP) ? cb_browser.$bookmarked_term_caption$.getDynamicValue(thread) : cb_browser.$unbookmarked_term_caption$.getDynamicValue(thread);
        if (NIL != addP) {
            make_term_readily_available(v_term, api_control_vars.$the_cyclist$.getDynamicValue(thread));
        } else {
            make_term_unavailable(v_term, api_control_vars.$the_cyclist$.getDynamicValue(thread));
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$result, list($$$newClass, new_class, $$$title, title), NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$result);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return addP;
    }

    public static SubLObject make_term_readily_available(final SubLObject v_term, final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject old_asserts = czer_meta.find_assertions_cycl(list($$cyclistReadilyAvailableTerms, cyclist, v_term), UNPROVIDED);
            ke.ke_assert(list($$cyclistReadilyAvailableTerms, api_control_vars.$the_cyclist$.getDynamicValue(thread), v_term), list($$MtSpace, $$CyclistsMt, listS($$MtTimeWithGranularityDimFn, listS($$TimeIntervalInclusiveFn, date_utilities.indexical_now(), $list60), $list61)), UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = old_asserts;
            SubLObject old_assert = NIL;
            old_assert = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_unassert_assertion(old_assert);
                cdolist_list_var = cdolist_list_var.rest();
                old_assert = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject make_term_unavailable(final SubLObject v_term, final SubLObject cyclist) {
        SubLObject cdolist_list_var;
        final SubLObject old_assertions = cdolist_list_var = ask_utilities.query_variable($sym62$_ASSERT, listS($$and, list($$assertionSentence, $sym62$_ASSERT, list($$cyclistReadilyAvailableTerms, cyclist, v_term)), $list64), $$InferencePSC, $list66);
        SubLObject old_assert = NIL;
        old_assert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject old_assert_sentence = assertions_high.assertion_formula(old_assert);
            final SubLObject old_assert_mt = assertions_high.assertion_mt(old_assert);
            final SubLObject assertion_time = formula_template_utilities.mt_time_index(assertions_high.assertion_mt(old_assert));
            final SubLObject ended_time = ask_utilities.query_variable($sym67$_INT, list($$thereExists, $sym69$_WHEN, list($$and, $list70, listS($$equals, listS($$TemporalIntersectionFn, assertion_time, $list73), $list74))), $$InferencePSC, UNPROVIDED).first();
            ke.ke_edit(old_assert_sentence, old_assert_sentence, old_assert_mt, list($$MtSpace, $$CyclistsMt, listS($$MtTimeWithGranularityDimFn, list($$TimeIntervalInclusiveFn, ended_time, date_utilities.indexical_now()), $list61)), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            old_assert = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject currently_bookmarkedP(final SubLObject v_term, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
            return ask_utilities.query_boolean(list($$cyclistReadilyAvailableTerms, cyclist, narts_high.nart_substitute(v_term)), $list76, UNPROVIDED);
        } finally {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject declare_cb_web_services_file() {
        declareFunction("xml_term_create", "XML-TERM-CREATE", 1, 0, false);
        declareFunction("create_spec_pred", "CREATE-SPEC-PRED", 2, 0, false);
        declareFunction("url_encoded_cb_form", "URL-ENCODED-CB-FORM", 1, 0, false);
        declareFunction("get_defining_mt_for_type", "GET-DEFINING-MT-FOR-TYPE", 2, 0, false);
        declareFunction("xml_set_genstring_assertion", "XML-SET-GENSTRING-ASSERTION", 1, 0, false);
        declareFunction("xml_set_lexical_mapping_strength", "XML-SET-LEXICAL-MAPPING-STRENGTH", 1, 0, false);
        declareFunction("unassert_all", "UNASSERT-ALL", 1, 0, false);
        declareFunction("xml_set_bookmark", "XML-SET-BOOKMARK", 1, 0, false);
        declareFunction("make_term_readily_available", "MAKE-TERM-READILY-AVAILABLE", 2, 0, false);
        declareFunction("make_term_unavailable", "MAKE-TERM-UNAVAILABLE", 2, 0, false);
        declareFunction("currently_bookmarkedP", "CURRENTLY-BOOKMARKED?", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_web_services_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_web_services_file_alt() {
        html_macros.note_handler_mime_type(XML_TERM_CREATE, $str_alt1$text_xml);
        html_macros.note_html_handler_function(XML_TERM_CREATE);
        return NIL;
    }

    public static SubLObject setup_cb_web_services_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(XML_TERM_CREATE, $XML_HANDLER);
            html_macros.note_cgi_handler_function(XML_SET_GENSTRING_ASSERTION, $XML_HANDLER);
            html_macros.note_cgi_handler_function(XML_SET_LEXICAL_MAPPING_STRENGTH, $XML_HANDLER);
            html_macros.note_cgi_handler_function(XML_SET_BOOKMARK, $XML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_handler_mime_type(XML_TERM_CREATE, $str_alt1$text_xml);
            html_macros.note_html_handler_function(XML_TERM_CREATE);
        }
        return NIL;
    }

    public static SubLObject setup_cb_web_services_file_Previous() {
        html_macros.note_cgi_handler_function(XML_TERM_CREATE, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SET_GENSTRING_ASSERTION, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SET_LEXICAL_MAPPING_STRENGTH, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_SET_BOOKMARK, $XML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_web_services_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_web_services_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_web_services_file();
    }

    static {
    }
}

/**
 * Total time: 183 ms
 */
