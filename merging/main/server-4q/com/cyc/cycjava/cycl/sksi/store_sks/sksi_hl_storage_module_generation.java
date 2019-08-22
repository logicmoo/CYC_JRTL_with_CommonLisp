/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.store_sks;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-HL-STORAGE-MODULE-GENERATION
 * source file: /cyc/top/cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp
 * created:     2019/07/03 17:38:35
 */
public final class sksi_hl_storage_module_generation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_hl_storage_module_generation();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_hl_storage_modules_only_preferred_over_kb_storageP$ = makeSymbol("*SKSI-HL-STORAGE-MODULES-ONLY-PREFERRED-OVER-KB-STORAGE?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sksi_hl_storage_modules$ = makeSymbol("*SKSI-HL-STORAGE-MODULES*");

    static private final SubLList $list1 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list3 = list(makeSymbol("*SKSI-HL-STORAGE-MODULES*"));

    static private final SubLList $list5 = list(list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("*SKSI-HL-STORAGE-MODULES*")));

    public static final SubLSymbol $sksi_hl_storage_modules_by_sks$ = makeSymbol("*SKSI-HL-STORAGE-MODULES-BY-SKS*");

    private static final SubLString $str7$_S_was_not_a_valid_HL_storage_mod = makeString("~S was not a valid HL storage module parameter");

    private static final SubLString $$$sksi = makeString("sksi");

    private static final SubLString $str13$complex_non_atomic_meaning_senten = makeString("complex non-atomic meaning sentences not handled yet");

    private static final SubLSymbol SKSI_SENTENCE_HL_STORAGE_MODULE_INCOMPLETENESS = makeSymbol("SKSI-SENTENCE-HL-STORAGE-MODULE-INCOMPLETENESS");

    private static final SubLSymbol SKSI_SENTENCE_HL_STORAGE_MODULE_ASSERT = makeSymbol("SKSI-SENTENCE-HL-STORAGE-MODULE-ASSERT");

    private static final SubLSymbol SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT = makeSymbol("SKSI-SENTENCE-HL-STORAGE-MODULE-UNASSERT");

    private static final SubLList $list34 = list(makeKeyword("REGULAR-KB-ASSERTION"));

    private static final SubLString $str39$___not_ = makeString("(#$not ");

    private static final SubLString $str40$_ = makeString(")");

    static private final SubLString $str41$_FULLY_BOUND = makeString(" FULLY-BOUND");

    static private final SubLString $str42$__FULLY_BOUND_ = makeString(" <FULLY-BOUND>");

    private static final SubLString $str43$_FULLY_BOUND = makeString("(FULLY-BOUND");

    private static final SubLString $str44$__FULLY_BOUND_ = makeString("(<FULLY-BOUND>");

    private static final SubLString $str45$NOT_FULLY_BOUND = makeString("NOT-FULLY-BOUND");

    private static final SubLString $str46$_NOT_FULLY_BOUND_ = makeString("<NOT-FULLY-BOUND>");

    private static final SubLSymbol ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");

    private static final SubLString $str50$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str51$_sksi_sentence_hl_storage_module_ = makeString("(sksi-sentence-hl-storage-module-assert ~S ~S ~S ~S ~S)~%");

    private static final SubLString $str52$sksi_sentence_hl_storage_module_a = makeString("sksi-sentence-hl-storage-module-assert -> ~S~%");

    /**
     *
     *
     * @return boolean; t iff HL-MODULE is an SKSI module
     */
    @LispMethod(comment = "@return boolean; t iff HL-MODULE is an SKSI module")
    public static final SubLObject sksi_hl_storage_module_p_alt(SubLObject hl_module) {
        return set.set_memberP(hl_module, $sksi_hl_storage_modules$.getGlobalValue());
    }

    /**
     *
     *
     * @return boolean; t iff HL-MODULE is an SKSI module
     */
    @LispMethod(comment = "@return boolean; t iff HL-MODULE is an SKSI module")
    public static SubLObject sksi_hl_storage_module_p(final SubLObject hl_module) {
        return set.set_memberP(hl_module, $sksi_hl_storage_modules$.getGlobalValue());
    }

    /**
     * Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.
     *
     * @unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,
    then you should not use this macro; use @xref do-sksi-hl-storage-modules-list instead.
     */
    @LispMethod(comment = "Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.\r\n\r\n@unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,\r\nthen you should not use this macro; use @xref do-sksi-hl-storage-modules-list instead.")
    public static final SubLObject do_sksi_hl_storage_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    hl_module = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_SET, bq_cons(hl_module, $list_alt3), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.
     *
     * @unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,
    then you should not use this macro; use @xref do-sksi-hl-storage-modules-list instead.
     */
    @LispMethod(comment = "Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.\r\n\r\n@unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,\r\nthen you should not use this macro; use @xref do-sksi-hl-storage-modules-list instead.")
    public static SubLObject do_sksi_hl_storage_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_SET, bq_cons(hl_module, $list3), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    /**
     * Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.
     *
     * @unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,
    then you should use this macro; otherwise, @xref do-sksi-hl-storage-modules would be just as fine.
     */
    @LispMethod(comment = "Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.\r\n\r\n@unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,\r\nthen you should use this macro; otherwise, @xref do-sksi-hl-storage-modules would be just as fine.")
    public static final SubLObject do_sksi_hl_storage_modules_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    hl_module = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, bq_cons(hl_module, $list_alt5), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.
     *
     * @unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,
    then you should use this macro; otherwise, @xref do-sksi-hl-storage-modules would be just as fine.
     */
    @LispMethod(comment = "Execute body with HL-MODULE successively bound to each SKSI HL module in @xref *sksi-hl-storage-modules*.\r\n\r\n@unknown If you plan to modify the set @xref *sksi-hl-storage-modules* while iterating over it,\r\nthen you should use this macro; otherwise, @xref do-sksi-hl-storage-modules would be just as fine.")
    public static SubLObject do_sksi_hl_storage_modules_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, bq_cons(hl_module, $list5), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static final SubLObject sksi_hl_storage_modules_count_alt() {
        return set.set_size($sksi_hl_storage_modules$.getGlobalValue());
    }

    public static SubLObject sksi_hl_storage_modules_count() {
        return set.set_size($sksi_hl_storage_modules$.getGlobalValue());
    }

    public static final SubLObject note_sksi_hl_storage_module_alt(SubLObject hl_module) {
        return set.set_add(hl_module, $sksi_hl_storage_modules$.getGlobalValue());
    }

    public static SubLObject note_sksi_hl_storage_module(final SubLObject hl_module) {
        return set.set_add(hl_module, $sksi_hl_storage_modules$.getGlobalValue());
    }

    public static final SubLObject un_note_sksi_hl_storage_module_alt(SubLObject hl_module) {
        return set.set_remove(hl_module, $sksi_hl_storage_modules$.getGlobalValue());
    }

    public static SubLObject un_note_sksi_hl_storage_module(final SubLObject hl_module) {
        return set.set_remove(hl_module, $sksi_hl_storage_modules$.getGlobalValue());
    }

    public static final SubLObject un_note_all_sksi_hl_storage_modules_alt() {
        return set.clear_set($sksi_hl_storage_modules$.getGlobalValue());
    }

    public static SubLObject un_note_all_sksi_hl_storage_modules() {
        return set.clear_set($sksi_hl_storage_modules$.getGlobalValue());
    }

    public static final SubLObject note_sksi_hl_storage_module_by_sks_alt(SubLObject sks, SubLObject hl_module) {
        return dictionary_utilities.dictionary_pushnew($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, hl_module, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject note_sksi_hl_storage_module_by_sks(final SubLObject sks, final SubLObject hl_module) {
        return dictionary_utilities.dictionary_pushnew($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, hl_module, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject un_note_sksi_hl_storage_modules_by_sks_alt(SubLObject sks) {
        return dictionary.dictionary_remove($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks);
    }

    public static SubLObject un_note_sksi_hl_storage_modules_by_sks(final SubLObject sks) {
        return dictionary.dictionary_remove($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks);
    }

    public static final SubLObject clear_sksi_hl_storage_modules_by_sks_cache_alt() {
        return dictionary.clear_dictionary($sksi_hl_storage_modules_by_sks$.getGlobalValue());
    }

    public static SubLObject clear_sksi_hl_storage_modules_by_sks_cache() {
        return dictionary.clear_dictionary($sksi_hl_storage_modules_by_sks$.getGlobalValue());
    }

    public static final SubLObject un_note_sksi_hl_storage_modules_by_sks_for_module_alt(SubLObject hl_module) {
        {
            SubLObject cdolist_list_var = dictionary.dictionary_keys($sksi_hl_storage_modules_by_sks$.getGlobalValue());
            SubLObject sks = NIL;
            for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_delete_from_value($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, hl_module, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject un_note_sksi_hl_storage_modules_by_sks_for_module(final SubLObject hl_module) {
        SubLObject cdolist_list_var = dictionary.dictionary_keys($sksi_hl_storage_modules_by_sks$.getGlobalValue());
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_delete_from_value($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, hl_module, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_hl_storage_modules_by_sks_find_modules_alt(SubLObject sks) {
        return dictionary.dictionary_lookup_without_values($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, UNPROVIDED);
    }

    public static SubLObject sksi_hl_storage_modules_by_sks_find_modules(final SubLObject sks) {
        return dictionary.dictionary_lookup_without_values($sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, UNPROVIDED);
    }

    /**
     * With mt-relevance optionally specified by META-MT, uses the schema-defining assertions
     * for SKS, and all subKSes thereof, to automatically generate hl-storage modules
     * to store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.
     *
     * A meaning sentence relevant to SKS is one which is a meaning sentence of a
     * logical schema (#$meaningSentenceOfSchema) which is mapped onto (via #$logicalPhysicalSchemaMap)
     * by a physical schema which is instantiated in (via #$physicalSchemaSourceMap) a knowledge source
     * that is s subKS of SKS.
     */
    @LispMethod(comment = "With mt-relevance optionally specified by META-MT, uses the schema-defining assertions\r\nfor SKS, and all subKSes thereof, to automatically generate hl-storage modules\r\nto store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.\r\n\r\nA meaning sentence relevant to SKS is one which is a meaning sentence of a\r\nlogical schema (#$meaningSentenceOfSchema) which is mapped onto (via #$logicalPhysicalSchemaMap)\r\nby a physical schema which is instantiated in (via #$physicalSchemaSourceMap) a knowledge source\r\nthat is s subKS of SKS.\nWith mt-relevance optionally specified by META-MT, uses the schema-defining assertions\nfor SKS, and all subKSes thereof, to automatically generate hl-storage modules\nto store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.\n\nA meaning sentence relevant to SKS is one which is a meaning sentence of a\nlogical schema (#$meaningSentenceOfSchema) which is mapped onto (via #$logicalPhysicalSchemaMap)\nby a physical schema which is instantiated in (via #$physicalSchemaSourceMap) a knowledge source\nthat is s subKS of SKS.")
    public static final SubLObject register_sksi_hl_storage_modules_for_sks_alt(SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        return length(com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.register_sksi_hl_storage_modules_for_sks_int(sks, meta_mt));
    }

    /**
     * With mt-relevance optionally specified by META-MT, uses the schema-defining assertions
     * for SKS, and all subKSes thereof, to automatically generate hl-storage modules
     * to store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.
     *
     * A meaning sentence relevant to SKS is one which is a meaning sentence of a
     * logical schema (#$meaningSentenceOfSchema) which is mapped onto (via #$logicalPhysicalSchemaMap)
     * by a physical schema which is instantiated in (via #$physicalSchemaSourceMap) a knowledge source
     * that is s subKS of SKS.
     */
    @LispMethod(comment = "With mt-relevance optionally specified by META-MT, uses the schema-defining assertions\r\nfor SKS, and all subKSes thereof, to automatically generate hl-storage modules\r\nto store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.\r\n\r\nA meaning sentence relevant to SKS is one which is a meaning sentence of a\r\nlogical schema (#$meaningSentenceOfSchema) which is mapped onto (via #$logicalPhysicalSchemaMap)\r\nby a physical schema which is instantiated in (via #$physicalSchemaSourceMap) a knowledge source\r\nthat is s subKS of SKS.\nWith mt-relevance optionally specified by META-MT, uses the schema-defining assertions\nfor SKS, and all subKSes thereof, to automatically generate hl-storage modules\nto store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.\n\nA meaning sentence relevant to SKS is one which is a meaning sentence of a\nlogical schema (#$meaningSentenceOfSchema) which is mapped onto (via #$logicalPhysicalSchemaMap)\nby a physical schema which is instantiated in (via #$physicalSchemaSourceMap) a knowledge source\nthat is s subKS of SKS.")
    public static SubLObject register_sksi_hl_storage_modules_for_sks(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        return length(register_sksi_hl_storage_modules_for_sks_int(sks, meta_mt));
    }

    public static final SubLObject register_sksi_hl_storage_modules_for_sks_int_alt(SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_modules = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt7$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                if (NIL == meta_mt) {
                                    meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        {
                                            SubLObject mt_var = meta_mt;
                                            {
                                                SubLObject _prev_bind_0_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                                    com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.deregister_sksi_hl_storage_modules_for_sks(sks, UNPROVIDED, UNPROVIDED);
                                                    {
                                                        SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                                                        SubLObject cdolist_list_var = sub_ks_closure;
                                                        SubLObject sub_ks = NIL;
                                                        for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject new_hl_modules = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.register_sksi_hl_storage_modules_for_just_sks(sub_ks, meta_mt);
                                                                hl_modules = append(new_hl_modules, hl_modules);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        }
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return hl_modules;
            }
        }
    }

    public static SubLObject register_sksi_hl_storage_modules_for_sks_int(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_modules = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL == meta_mt) {
                    meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                final SubLObject mt_var = meta_mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    deregister_sksi_hl_storage_modules_for_sks(sks, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var;
                    final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    SubLObject sub_ks = NIL;
                    sub_ks = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject new_hl_modules = register_sksi_hl_storage_modules_for_just_sks(sub_ks, meta_mt);
                        hl_modules = append(new_hl_modules, hl_modules);
                        cdolist_list_var = cdolist_list_var.rest();
                        sub_ks = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return hl_modules;
    }

    /**
     *
     *
     * @param SK-SOURCE;
     * 		fort-p
     * 		With mt-relevance optionally specified by META-MT, uses the schema-defining assertions
     * 		for SKS to automatically generate hl-storage modules to store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.
     * @see register-sksi-hl-storage-modules-for-sks.
     */
    @LispMethod(comment = "@param SK-SOURCE;\r\n\t\tfort-p\r\n\t\tWith mt-relevance optionally specified by META-MT, uses the schema-defining assertions\r\n\t\tfor SKS to automatically generate hl-storage modules to store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.\r\n@see register-sksi-hl-storage-modules-for-sks.")
    public static final SubLObject register_sksi_hl_storage_modules_for_just_sks_alt(SubLObject sk_source, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_module_infos = NIL;
                SubLObject modifiableP = NIL;
                if (NIL == meta_mt) {
                    meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                }
                {
                    SubLObject mt_var = meta_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            modifiableP = sksi_kb_accessors.modifiable_sk_source_p(sk_source);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == modifiableP) {
                    return NIL;
                }
                sksi_access_path.external_source_access_path(sk_source, NIL, meta_mt);
                {
                    SubLObject state = memoization_state.possibly_new_memoization_state();
                    SubLObject local_state = state;
                    {
                        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            {
                                SubLObject original_memoization_process = NIL;
                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                    {
                                        SubLObject current_proc = current_process();
                                        if (NIL == original_memoization_process) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                        } else {
                                            if (original_memoization_process != current_proc) {
                                                Errors.error($str_alt7$Invalid_attempt_to_reuse_memoizat);
                                            }
                                        }
                                    }
                                }
                                try {
                                    hl_module_infos = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sks_hl_storage_module_infos(sk_source, meta_mt);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            {
                                                SubLObject cdolist_list_var = hl_module_infos;
                                                SubLObject hl_module_info = NIL;
                                                for (hl_module_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module_info = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject hl_module = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.declare_hl_storage_module_with_module_info(hl_module_info);
                                                        com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.note_sksi_hl_storage_module(hl_module);
                                                        com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.note_sksi_hl_storage_module_by_sks(sk_source, hl_module);
                                                    }
                                                }
                                            }
                                            hl_storage_modules.reclassify_hl_storage_modules();
                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return hl_module_infos;
            }
        }
    }

    /**
     *
     *
     * @param SK-SOURCE;
     * 		fort-p
     * 		With mt-relevance optionally specified by META-MT, uses the schema-defining assertions
     * 		for SKS to automatically generate hl-storage modules to store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.
     * @see register-sksi-hl-storage-modules-for-sks.
     */
    @LispMethod(comment = "@param SK-SOURCE;\r\n\t\tfort-p\r\n\t\tWith mt-relevance optionally specified by META-MT, uses the schema-defining assertions\r\n\t\tfor SKS to automatically generate hl-storage modules to store SKSI sentences of the forms defined by the meaning sentences relevant to SKS.\r\n@see register-sksi-hl-storage-modules-for-sks.")
    public static SubLObject register_sksi_hl_storage_modules_for_just_sks(final SubLObject sk_source, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module_infos = NIL;
        SubLObject modifiableP = NIL;
        if (NIL == meta_mt) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            modifiableP = sksi_kb_accessors.modifiable_sk_source_p(sk_source);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == modifiableP) {
            return NIL;
        }
        sksi_access_path.external_source_access_path(sk_source, NIL, meta_mt);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_3 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var;
                hl_module_infos = cdolist_list_var = sks_hl_storage_module_infos(sk_source, meta_mt);
                SubLObject hl_module_info = NIL;
                hl_module_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject hl_module = declare_hl_storage_module_with_module_info(hl_module_info);
                    note_sksi_hl_storage_module(hl_module);
                    note_sksi_hl_storage_module_by_sks(sk_source, hl_module);
                    cdolist_list_var = cdolist_list_var.rest();
                    hl_module_info = cdolist_list_var.first();
                } 
                hl_storage_modules.reclassify_hl_storage_modules();
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_3, thread);
        }
        return hl_module_infos;
    }

    /**
     * Unhooks all SKSI hl-storage modules from the KB store.
     */
    @LispMethod(comment = "Unhooks all SKSI hl-storage modules from the KB store.")
    public static final SubLObject deregister_all_sksi_hl_storage_modules_alt() {
        {
            SubLObject cdolist_list_var = set.set_element_list($sksi_hl_storage_modules$.getGlobalValue());
            SubLObject hl_module = NIL;
            for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                {
                    SubLObject name = hl_storage_modules.hl_storage_module_name(hl_module);
                    hl_storage_modules.undeclare_hl_storage_module(name);
                }
            }
        }
        hl_storage_modules.reclassify_hl_storage_modules();
        com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.un_note_all_sksi_hl_storage_modules();
        com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.clear_sksi_hl_storage_modules_by_sks_cache();
        return com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sksi_hl_storage_modules_count();
    }

    @LispMethod(comment = "Unhooks all SKSI hl-storage modules from the KB store.")
    public static SubLObject deregister_all_sksi_hl_storage_modules() {
        SubLObject cdolist_list_var = set.set_element_list($sksi_hl_storage_modules$.getGlobalValue());
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = hl_storage_modules.hl_storage_module_name(hl_module);
            hl_storage_modules.undeclare_hl_storage_module(name);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        hl_storage_modules.reclassify_hl_storage_modules();
        un_note_all_sksi_hl_storage_modules();
        clear_sksi_hl_storage_modules_by_sks_cache();
        return sksi_hl_storage_modules_count();
    }/**
     * Unhooks all SKSI hl-storage modules from the KB store.
     */


    /**
     *
     *
     * @param SKS;
     * 		fort-p
     * 		Unhooks all SKSI HL storage modules for SKS and its subKSes from the KB store.
     */
    @LispMethod(comment = "@param SKS;\r\n\t\tfort-p\r\n\t\tUnhooks all SKSI HL storage modules for SKS and its subKSes from the KB store.")
    public static final SubLObject deregister_sksi_hl_storage_modules_for_sks_alt(SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removed_count = ZERO_INTEGER;
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                {
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                                SubLObject cdolist_list_var = sub_ks_closure;
                                SubLObject sub_ks = NIL;
                                for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                                    removed_count = add(removed_count, com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.deregister_sksi_hl_storage_modules_for_just_sks(sub_ks, NIL));
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    hl_storage_modules.reclassify_hl_storage_modules();
                }
                return values(removed_count, com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sksi_hl_storage_modules_count());
            }
        }
    }

    /**
     *
     *
     * @param SKS;
     * 		fort-p
     * 		Unhooks all SKSI HL storage modules for SKS and its subKSes from the KB store.
     */
    @LispMethod(comment = "@param SKS;\r\n\t\tfort-p\r\n\t\tUnhooks all SKSI HL storage modules for SKS and its subKSes from the KB store.")
    public static SubLObject deregister_sksi_hl_storage_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject removed_count = ZERO_INTEGER;
        if (NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject sub_ks = NIL;
            sub_ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                removed_count = add(removed_count, deregister_sksi_hl_storage_modules_for_just_sks(sub_ks, NIL));
                cdolist_list_var = cdolist_list_var.rest();
                sub_ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            hl_storage_modules.reclassify_hl_storage_modules();
        }
        return values(removed_count, sksi_hl_storage_modules_count());
    }

    /**
     *
     *
     * @param SKS;
     * 		fort-p
     * 		Unhooks all SKSI HL storage modules for SKS (only) from the HL store.
     */
    @LispMethod(comment = "@param SKS;\r\n\t\tfort-p\r\n\t\tUnhooks all SKSI HL storage modules for SKS (only) from the HL store.")
    public static final SubLObject deregister_sksi_hl_storage_modules_for_just_sks_alt(SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            SubLObject hl_modules = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sksi_hl_storage_modules_by_sks_find_modules(sks);
            SubLObject removed_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = hl_modules;
            SubLObject hl_module = NIL;
            for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.deregister_sksi_hl_storage_module(hl_module, NIL)) {
                    removed_count = add(removed_count, ONE_INTEGER);
                }
            }
            com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.un_note_sksi_hl_storage_modules_by_sks(sks);
            if (NIL != reclassifyP) {
                hl_storage_modules.reclassify_hl_storage_modules();
            }
            return values(removed_count, com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sksi_hl_storage_modules_count());
        }
    }

    /**
     *
     *
     * @param SKS;
     * 		fort-p
     * 		Unhooks all SKSI HL storage modules for SKS (only) from the HL store.
     */
    @LispMethod(comment = "@param SKS;\r\n\t\tfort-p\r\n\t\tUnhooks all SKSI HL storage modules for SKS (only) from the HL store.")
    public static SubLObject deregister_sksi_hl_storage_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLObject hl_modules = sksi_hl_storage_modules_by_sks_find_modules(sks);
        SubLObject removed_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deregister_sksi_hl_storage_module(hl_module, NIL)) {
                removed_count = add(removed_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        un_note_sksi_hl_storage_modules_by_sks(sks);
        if (NIL != reclassifyP) {
            hl_storage_modules.reclassify_hl_storage_modules();
        }
        return values(removed_count, sksi_hl_storage_modules_count());
    }

    /**
     *
     *
     * @param HL-MODULE;
     * 		hl-storage-module-p; an SKSI HL storage module.
     * 		Unhooks the SKSI HL storage module MODULE from the KB store.
     */
    @LispMethod(comment = "@param HL-MODULE;\r\n\t\thl-storage-module-p; an SKSI HL storage module.\r\n\t\tUnhooks the SKSI HL storage module MODULE from the KB store.")
    public static final SubLObject deregister_sksi_hl_storage_module_alt(SubLObject hl_module, SubLObject reclassify_hl_storage_modulesP) {
        if (reclassify_hl_storage_modulesP == UNPROVIDED) {
            reclassify_hl_storage_modulesP = T;
        }
        if (NIL == com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sksi_hl_storage_module_p(hl_module)) {
            return NIL;
        }
        hl_storage_modules.undeclare_hl_storage_module(inference_modules.hl_module_name(hl_module));
        com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.un_note_sksi_hl_storage_module(hl_module);
        if (NIL != reclassify_hl_storage_modulesP) {
            hl_storage_modules.reclassify_hl_storage_modules();
            com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.un_note_sksi_hl_storage_modules_by_sks_for_module(hl_module);
        }
        return T;
    }

    /**
     *
     *
     * @param HL-MODULE;
     * 		hl-storage-module-p; an SKSI HL storage module.
     * 		Unhooks the SKSI HL storage module MODULE from the KB store.
     */
    @LispMethod(comment = "@param HL-MODULE;\r\n\t\thl-storage-module-p; an SKSI HL storage module.\r\n\t\tUnhooks the SKSI HL storage module MODULE from the KB store.")
    public static SubLObject deregister_sksi_hl_storage_module(final SubLObject hl_module, SubLObject reclassify_hl_storage_modulesP) {
        if (reclassify_hl_storage_modulesP == UNPROVIDED) {
            reclassify_hl_storage_modulesP = T;
        }
        if (NIL == sksi_hl_storage_module_p(hl_module)) {
            return NIL;
        }
        hl_storage_modules.undeclare_hl_storage_module(inference_modules.hl_module_name(hl_module));
        un_note_sksi_hl_storage_module(hl_module);
        if (NIL != reclassify_hl_storage_modulesP) {
            hl_storage_modules.reclassify_hl_storage_modules();
            un_note_sksi_hl_storage_modules_by_sks_for_module(hl_module);
        }
        return T;
    }

    public static final SubLObject hl_storage_module_info_p_alt(SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    public static SubLObject hl_storage_module_info_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    public static final SubLObject new_hl_storage_module_info_alt() {
        return NIL;
    }

    public static SubLObject new_hl_storage_module_info() {
        return NIL;
    }

    public static final SubLObject hl_storage_module_info_add_alt(SubLObject module_info, SubLObject property, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(property, hl_storage_modules.hl_storage_module_properties(), UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt8$_S_was_not_a_valid_HL_storage_mod, property);
                }
            }
            return putf(module_info, property, value);
        }
    }

    public static SubLObject hl_storage_module_info_add(final SubLObject module_info, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(property, hl_storage_modules.hl_storage_module_properties(), UNPROVIDED, UNPROVIDED))) {
            Errors.error($str7$_S_was_not_a_valid_HL_storage_mod, property);
        }
        return putf(module_info, property, value);
    }

    public static final SubLObject hl_storage_module_info_get_alt(SubLObject module_info, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(module_info, property, v_default);
    }

    public static SubLObject hl_storage_module_info_get(final SubLObject module_info, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(module_info, property, v_default);
    }

    public static final SubLObject hl_storage_module_info_remove_alt(SubLObject module_info, SubLObject property) {
        return remf(module_info, property);
    }

    public static SubLObject hl_storage_module_info_remove(final SubLObject module_info, final SubLObject property) {
        return remf(module_info, property);
    }

    /**
     * A wrapper around @xref hl-storage-module which takes a module-info.
     * Declares (i.e. hooks into the KB store) an HL storage module based on MODULE-INFO.
     */
    @LispMethod(comment = "A wrapper around @xref hl-storage-module which takes a module-info.\r\nDeclares (i.e. hooks into the KB store) an HL storage module based on MODULE-INFO.\nA wrapper around @xref hl-storage-module which takes a module-info.\nDeclares (i.e. hooks into the KB store) an HL storage module based on MODULE-INFO.")
    public static final SubLObject declare_hl_storage_module_with_module_info_alt(SubLObject module_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject module_name = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.determine_hl_storage_module_info_name(module_info);
                SubLObject pretty_name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $PRETTY_NAME, pretty_name);
                return hl_storage_modules.hl_storage_module(module_name, module_info);
            }
        }
    }

    @LispMethod(comment = "A wrapper around @xref hl-storage-module which takes a module-info.\r\nDeclares (i.e. hooks into the KB store) an HL storage module based on MODULE-INFO.\nA wrapper around @xref hl-storage-module which takes a module-info.\nDeclares (i.e. hooks into the KB store) an HL storage module based on MODULE-INFO.")
    public static SubLObject declare_hl_storage_module_with_module_info(SubLObject module_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject module_name = determine_hl_storage_module_info_name(module_info);
        final SubLObject pretty_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        module_info = hl_storage_module_info_add(module_info, $PRETTY_NAME, pretty_name);
        return hl_storage_modules.hl_storage_module(module_name, module_info);
    }/**
     * A wrapper around @xref hl-storage-module which takes a module-info.
     * Declares (i.e. hooks into the KB store) an HL storage module based on MODULE-INFO.
     */


    /**
     * Determines a name and a pretty-name for MODULE-INFO based on the applicability-pattern and sense.
     */
    @LispMethod(comment = "Determines a name and a pretty-name for MODULE-INFO based on the applicability-pattern and sense.")
    public static final SubLObject determine_hl_storage_module_info_name_alt(SubLObject module_info) {
        {
            SubLObject applicability_pattern = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_get(module_info, $APPLICABILITY_PATTERN, UNPROVIDED);
            SubLObject sense = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_get(module_info, $SENSE, UNPROVIDED);
            SubLObject substrings = NIL;
            SubLObject terms = cycl_utilities.formula_terms(applicability_pattern, $IGNORE);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject string_term = (NIL != constant_p(v_term)) ? ((SubLObject) (string_utilities.str(v_term))) : Strings.string_downcase(string_utilities.str(v_term), UNPROVIDED, UNPROVIDED);
                    SubLObject term_strings = string_utilities.relevant_substrings(string_term);
                    substrings = nconc(nreverse(term_strings), substrings);
                }
            }
            substrings = cons(Strings.string_downcase(string_utilities.str(sense), UNPROVIDED, UNPROVIDED), substrings);
            substrings = nreverse(substrings);
            substrings = cons($$$sksi, substrings);
            return com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.make_sksi_hl_storage_module_name(substrings);
        }
    }

    @LispMethod(comment = "Determines a name and a pretty-name for MODULE-INFO based on the applicability-pattern and sense.")
    public static SubLObject determine_hl_storage_module_info_name(final SubLObject module_info) {
        final SubLObject applicability_pattern = hl_storage_module_info_get(module_info, $APPLICABILITY_PATTERN, UNPROVIDED);
        final SubLObject sense = hl_storage_module_info_get(module_info, $SENSE, UNPROVIDED);
        SubLObject substrings = NIL;
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(applicability_pattern, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string_term = (NIL != constant_p(v_term)) ? string_utilities.str(v_term) : Strings.string_downcase(string_utilities.str(v_term), UNPROVIDED, UNPROVIDED);
            final SubLObject term_strings = string_utilities.relevant_substrings(string_term);
            substrings = nconc(nreverse(term_strings), substrings);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        substrings = cons(Strings.string_downcase(string_utilities.str(sense), UNPROVIDED, UNPROVIDED), substrings);
        substrings = nreverse(substrings);
        substrings = cons($$$sksi, substrings);
        return make_sksi_hl_storage_module_name(substrings);
    }/**
     * Determines a name and a pretty-name for MODULE-INFO based on the applicability-pattern and sense.
     */


    /**
     * From a given list of strings SUBSTRINGS, constructs a unique HL storage module name.
     */
    @LispMethod(comment = "From a given list of strings SUBSTRINGS, constructs a unique HL storage module name.")
    public static final SubLObject make_sksi_hl_storage_module_name_alt(SubLObject substrings) {
        {
            SubLObject name = string_utilities.bunge(substrings, CHAR_hyphen);
            SubLObject symbol = gensym(Strings.string_upcase(name, UNPROVIDED, UNPROVIDED));
            SubLObject keyword = make_keyword(symbol);
            return values(keyword, name);
        }
    }

    @LispMethod(comment = "From a given list of strings SUBSTRINGS, constructs a unique HL storage module name.")
    public static SubLObject make_sksi_hl_storage_module_name(final SubLObject substrings) {
        final SubLObject name = string_utilities.bunge(substrings, CHAR_hyphen);
        final SubLObject symbol = gensym(Strings.string_upcase(name, UNPROVIDED, UNPROVIDED));
        final SubLObject keyword = make_keyword(symbol);
        return values(keyword, name);
    }/**
     * From a given list of strings SUBSTRINGS, constructs a unique HL storage module name.
     */


    /**
     * Given SKS and mt relevance based on META-MT, compute all hl-storage-module-infos
     * which are recipes for the SKSI HL storage modules we need to store SKSI sentences in SKS.
     */
    @LispMethod(comment = "Given SKS and mt relevance based on META-MT, compute all hl-storage-module-infos\r\nwhich are recipes for the SKSI HL storage modules we need to store SKSI sentences in SKS.\nGiven SKS and mt relevance based on META-MT, compute all hl-storage-module-infos\nwhich are recipes for the SKSI HL storage modules we need to store SKSI sentences in SKS.")
    public static final SubLObject sks_hl_storage_module_infos_alt(SubLObject sk_source, SubLObject meta_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = meta_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
                            if (NIL != content_mt) {
                                result = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sk_source_hl_storage_module_infos(sk_source, content_mt);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Given SKS and mt relevance based on META-MT, compute all hl-storage-module-infos\r\nwhich are recipes for the SKSI HL storage modules we need to store SKSI sentences in SKS.\nGiven SKS and mt relevance based on META-MT, compute all hl-storage-module-infos\nwhich are recipes for the SKSI HL storage modules we need to store SKSI sentences in SKS.")
    public static SubLObject sks_hl_storage_module_infos(final SubLObject sk_source, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(meta_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(meta_mt), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
            if (NIL != content_mt) {
                result = sk_source_hl_storage_module_infos(sk_source, content_mt);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Given SKS and mt relevance based on META-MT, compute all hl-storage-module-infos
     * which are recipes for the SKSI HL storage modules we need to store SKSI sentences in SKS.
     */


    /**
     * Compute all hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE.
     * Uses all relevant #$physicalSchemaSourceMap gafs to iterate over each physical schema of
     * SK-SOURCE and compute some hl-storage-module-infos for each.
     */
    @LispMethod(comment = "Compute all hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE.\r\nUses all relevant #$physicalSchemaSourceMap gafs to iterate over each physical schema of\r\nSK-SOURCE and compute some hl-storage-module-infos for each.\nCompute all hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE.\nUses all relevant #$physicalSchemaSourceMap gafs to iterate over each physical schema of\nSK-SOURCE and compute some hl-storage-module-infos for each.")
    public static final SubLObject sk_source_hl_storage_module_infos_alt(SubLObject sk_source, SubLObject content_mt) {
        {
            SubLObject physical_schemas = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = physical_schemas;
            SubLObject ps = NIL;
            for (ps = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ps = cdolist_list_var.first()) {
                {
                    SubLObject module_infos = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.physical_schema_hl_storage_module_infos(ps, sk_source, content_mt);
                    result = nconc(result, module_infos);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Compute all hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE.\r\nUses all relevant #$physicalSchemaSourceMap gafs to iterate over each physical schema of\r\nSK-SOURCE and compute some hl-storage-module-infos for each.\nCompute all hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE.\nUses all relevant #$physicalSchemaSourceMap gafs to iterate over each physical schema of\nSK-SOURCE and compute some hl-storage-module-infos for each.")
    public static SubLObject sk_source_hl_storage_module_infos(final SubLObject sk_source, final SubLObject content_mt) {
        final SubLObject physical_schemas = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = physical_schemas;
        SubLObject ps = NIL;
        ps = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_infos = physical_schema_hl_storage_module_infos(ps, sk_source, content_mt);
            result = nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            ps = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Compute all hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE.
     * Uses all relevant #$physicalSchemaSourceMap gafs to iterate over each physical schema of
     * SK-SOURCE and compute some hl-storage-module-infos for each.
     */


    /**
     * Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;
     * specifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA.
     * Uses all relevant #$logicalPhysicalSchemaMap gafs to iterate over each logical schema
     * which is an interpretation of PHYSICAL-SCHEMA and compute some module-infos for each.
     */
    @LispMethod(comment = "Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\r\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA.\r\nUses all relevant #$logicalPhysicalSchemaMap gafs to iterate over each logical schema\r\nwhich is an interpretation of PHYSICAL-SCHEMA and compute some module-infos for each.\nCompute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA.\nUses all relevant #$logicalPhysicalSchemaMap gafs to iterate over each logical schema\nwhich is an interpretation of PHYSICAL-SCHEMA and compute some module-infos for each.")
    public static final SubLObject physical_schema_hl_storage_module_infos_alt(SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt) {
        {
            SubLObject logical_schemas = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = logical_schemas;
            SubLObject ls = NIL;
            for (ls = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ls = cdolist_list_var.first()) {
                {
                    SubLObject module_infos = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.logical_schema_hl_storage_module_infos(ls, physical_schema, sk_source, content_mt);
                    result = nconc(result, module_infos);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\r\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA.\r\nUses all relevant #$logicalPhysicalSchemaMap gafs to iterate over each logical schema\r\nwhich is an interpretation of PHYSICAL-SCHEMA and compute some module-infos for each.\nCompute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA.\nUses all relevant #$logicalPhysicalSchemaMap gafs to iterate over each logical schema\nwhich is an interpretation of PHYSICAL-SCHEMA and compute some module-infos for each.")
    public static SubLObject physical_schema_hl_storage_module_infos(final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLObject logical_schemas = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = logical_schemas;
        SubLObject ls = NIL;
        ls = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_infos = logical_schema_hl_storage_module_infos(ls, physical_schema, sk_source, content_mt);
            result = nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;
     * specifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA.
     * Uses all relevant #$logicalPhysicalSchemaMap gafs to iterate over each logical schema
     * which is an interpretation of PHYSICAL-SCHEMA and compute some module-infos for each.
     */


    /**
     * Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;
     * specifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA, interpreted by LOGICAL-SCHEMA.
     * Uses all relevant #$meaningSentenceOfSchema gafs to iterate over each meaning sentence of LOGICAL-SCHEMA
     * and compute some module-infos for each.
     */
    @LispMethod(comment = "Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\r\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA, interpreted by LOGICAL-SCHEMA.\r\nUses all relevant #$meaningSentenceOfSchema gafs to iterate over each meaning sentence of LOGICAL-SCHEMA\r\nand compute some module-infos for each.\nCompute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA, interpreted by LOGICAL-SCHEMA.\nUses all relevant #$meaningSentenceOfSchema gafs to iterate over each meaning sentence of LOGICAL-SCHEMA\nand compute some module-infos for each.")
    public static final SubLObject logical_schema_hl_storage_module_infos_alt(SubLObject logical_schema, SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt) {
        {
            SubLObject result = NIL;
            SubLObject meaning_sentences = append(sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED), sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject cdolist_list_var = meaning_sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject pred = cycl_utilities.formula_operator(sentence);
                    if (NIL != sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_for_storage_p(pred, content_mt)) {
                        {
                            SubLObject module_infos = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.meaning_sentence_hl_storage_module_infos(sentence, logical_schema, physical_schema, sk_source, content_mt);
                            result = nconc(result, module_infos);
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\r\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA, interpreted by LOGICAL-SCHEMA.\r\nUses all relevant #$meaningSentenceOfSchema gafs to iterate over each meaning sentence of LOGICAL-SCHEMA\r\nand compute some module-infos for each.\nCompute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;\nspecifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA, interpreted by LOGICAL-SCHEMA.\nUses all relevant #$meaningSentenceOfSchema gafs to iterate over each meaning sentence of LOGICAL-SCHEMA\nand compute some module-infos for each.")
    public static SubLObject logical_schema_hl_storage_module_infos(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        final SubLObject meaning_sentences = cdolist_list_var = append(sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED), sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(sentence);
            if (NIL != sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_for_storage_p(pred, content_mt)) {
                final SubLObject module_infos = meaning_sentence_hl_storage_module_infos(sentence, logical_schema, physical_schema, sk_source, content_mt);
                result = nconc(result, module_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Compute some hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT in the external knowledge source SK-SOURCE;
     * specifically the sentences we can store in SK-SOURCE according to PHYSICAL-SCHEMA, interpreted by LOGICAL-SCHEMA.
     * Uses all relevant #$meaningSentenceOfSchema gafs to iterate over each meaning sentence of LOGICAL-SCHEMA
     * and compute some module-infos for each.
     */


    /**
     * Compute the hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT which match the pattern of SENTENCE in the external knowledge source SK-SOURCE.
     * We can store these sentences in SK-SOURCE according to PHYSICAL-SCHEMA, and interpreting it by LOGICAL-SCHEMA.
     */
    @LispMethod(comment = "Compute the hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT which match the pattern of SENTENCE in the external knowledge source SK-SOURCE.\r\nWe can store these sentences in SK-SOURCE according to PHYSICAL-SCHEMA, and interpreting it by LOGICAL-SCHEMA.\nCompute the hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT which match the pattern of SENTENCE in the external knowledge source SK-SOURCE.\nWe can store these sentences in SK-SOURCE according to PHYSICAL-SCHEMA, and interpreting it by LOGICAL-SCHEMA.")
    public static final SubLObject meaning_sentence_hl_storage_module_infos_alt(SubLObject sentence, SubLObject logical_schema, SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt) {
        {
            SubLObject rev_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(sentence);
            if (NIL != atomic_sentenceP(rev_sentence)) {
                return com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.pos_atomic_meaning_sentence_hl_storage_module_infos(rev_sentence, logical_schema, physical_schema, sk_source, content_mt);
            } else {
                if ((NIL != el_negation_p(rev_sentence)) && (NIL != atomic_sentenceP(cycl_utilities.sentence_arg1(rev_sentence, UNPROVIDED)))) {
                    {
                        SubLObject subsentence = cycl_utilities.sentence_arg1(rev_sentence, UNPROVIDED);
                        return com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.negated_atomic_meaning_sentence_hl_storage_module_infos(subsentence, logical_schema, physical_schema, sk_source, content_mt);
                    }
                } else {
                    Errors.error($str_alt14$complex_non_atomic_meaning_senten);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Compute the hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\r\nto store the sentences in CONTENT-MT which match the pattern of SENTENCE in the external knowledge source SK-SOURCE.\r\nWe can store these sentences in SK-SOURCE according to PHYSICAL-SCHEMA, and interpreting it by LOGICAL-SCHEMA.\nCompute the hl-storage-module-infos which are recipes for the SKSI HL storage modules we need\nto store the sentences in CONTENT-MT which match the pattern of SENTENCE in the external knowledge source SK-SOURCE.\nWe can store these sentences in SK-SOURCE according to PHYSICAL-SCHEMA, and interpreting it by LOGICAL-SCHEMA.")
    public static SubLObject meaning_sentence_hl_storage_module_infos(final SubLObject sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLObject rev_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(sentence);
        if (NIL != atomic_sentenceP(rev_sentence)) {
            return pos_atomic_meaning_sentence_hl_storage_module_infos(rev_sentence, logical_schema, physical_schema, sk_source, content_mt);
        }
        if ((NIL != el_negation_p(rev_sentence)) && (NIL != atomic_sentenceP(cycl_utilities.sentence_arg1(rev_sentence, UNPROVIDED)))) {
            final SubLObject subsentence = cycl_utilities.sentence_arg1(rev_sentence, UNPROVIDED);
            return negated_atomic_meaning_sentence_hl_storage_module_infos(subsentence, logical_schema, physical_schema, sk_source, content_mt);
        }
        Errors.error($str13$complex_non_atomic_meaning_senten);
        return NIL;
    }/**
     * Compute the hl-storage-module-infos which are recipes for the SKSI HL storage modules we need
     * to store the sentences in CONTENT-MT which match the pattern of SENTENCE in the external knowledge source SK-SOURCE.
     * We can store these sentences in SK-SOURCE according to PHYSICAL-SCHEMA, and interpreting it by LOGICAL-SCHEMA.
     */


    public static final SubLObject negated_atomic_meaning_sentence_hl_storage_module_infos_alt(SubLObject pos_sentence, SubLObject logical_schema, SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt) {
        return NIL;
    }

    public static SubLObject negated_atomic_meaning_sentence_hl_storage_module_infos(final SubLObject pos_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        return NIL;
    }

    /**
     * Given a positive atomic meaning sentence and a bunch of other information,
     * compute the SKSI hl-storage module info plists for that input.
     */
    @LispMethod(comment = "Given a positive atomic meaning sentence and a bunch of other information,\r\ncompute the SKSI hl-storage module info plists for that input.\nGiven a positive atomic meaning sentence and a bunch of other information,\ncompute the SKSI hl-storage module info plists for that input.")
    public static final SubLObject pos_atomic_meaning_sentence_hl_storage_module_infos_alt(SubLObject sentence, SubLObject logical_schema, SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt) {
        {
            SubLObject module_infos = NIL;
            SubLObject logical_field_indexical_termnums = sksi_removal_module_generation.sentence_termnums_containing_logical_field_indexicals(sentence);
            SubLObject required_module_infos = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.pos_atomic_meaning_sentence_applicability_pattern_infos(sentence, logical_schema, physical_schema, sk_source, content_mt, logical_field_indexical_termnums);
            SubLObject cdolist_list_var = required_module_infos;
            SubLObject required_info = NIL;
            for (required_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , required_info = cdolist_list_var.first()) {
                {
                    SubLObject module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.required_info_hl_storage_module_info(required_info, sentence, logical_schema, physical_schema, sk_source, content_mt);
                    module_infos = cons(module_info, module_infos);
                }
            }
            return nreverse(module_infos);
        }
    }

    @LispMethod(comment = "Given a positive atomic meaning sentence and a bunch of other information,\r\ncompute the SKSI hl-storage module info plists for that input.\nGiven a positive atomic meaning sentence and a bunch of other information,\ncompute the SKSI hl-storage module info plists for that input.")
    public static SubLObject pos_atomic_meaning_sentence_hl_storage_module_infos(final SubLObject sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        SubLObject module_infos = NIL;
        final SubLObject logical_field_indexical_termnums = sksi_removal_module_generation.sentence_termnums_containing_logical_field_indexicals(sentence);
        SubLObject cdolist_list_var;
        final SubLObject required_module_infos = cdolist_list_var = pos_atomic_meaning_sentence_applicability_pattern_infos(sentence, logical_schema, physical_schema, sk_source, content_mt, logical_field_indexical_termnums);
        SubLObject required_info = NIL;
        required_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_info = required_info_hl_storage_module_info(required_info, sentence, logical_schema, physical_schema, sk_source, content_mt);
            module_infos = cons(module_info, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            required_info = cdolist_list_var.first();
        } 
        return nreverse(module_infos);
    }/**
     * Given a positive atomic meaning sentence and a bunch of other information,
     * compute the SKSI hl-storage module info plists for that input.
     */


    /**
     *
     *
     * @return listp; a list of module-info-ps containing :applicability-pattern, :sense, :predicate (or :any-predicates), :required-mt  --
    the stuff that determines the applicability.
     */
    @LispMethod(comment = "@return listp; a list of module-info-ps containing :applicability-pattern, :sense, :predicate (or :any-predicates), :required-mt  --\r\nthe stuff that determines the applicability.")
    public static final SubLObject pos_atomic_meaning_sentence_applicability_pattern_infos_alt(SubLObject meaning_sentence, SubLObject logical_schema, SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt, SubLObject logical_field_indexical_termnums) {
        {
            SubLObject module_infos = NIL;
            SubLObject meaning_sentence_predicate_is_logical_fieldP = sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(meaning_sentence);
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
            SubLObject pred_list = (NIL != meaning_sentence_predicate_is_logical_fieldP) ? ((SubLObject) (sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, UNPROVIDED))) : NIL;
            {
                SubLObject applicability_patterns = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.compute_meaning_sentence_applicability_patterns(meaning_sentence, logical_field_indexical_termnums, $POS);
                SubLObject cdolist_list_var = applicability_patterns;
                SubLObject applicability_pattern = NIL;
                for (applicability_pattern = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , applicability_pattern = cdolist_list_var.first()) {
                    {
                        SubLObject module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.new_hl_storage_module_info();
                        module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $SENSE, $POS);
                        if (NIL != meaning_sentence_predicate_is_logical_fieldP) {
                            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $ANY_PREDICATES, pred_list);
                        } else {
                            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $PREDICATE, pred);
                        }
                        module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $APPLICABILITY_PATTERN, applicability_pattern);
                        module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $REQUIRED_MT, content_mt);
                        module_infos = cons(module_info, module_infos);
                    }
                }
            }
            {
                SubLObject applicability_patterns = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.compute_meaning_sentence_applicability_patterns(meaning_sentence, logical_field_indexical_termnums, $NEG);
                SubLObject cdolist_list_var = applicability_patterns;
                SubLObject applicability_pattern = NIL;
                for (applicability_pattern = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , applicability_pattern = cdolist_list_var.first()) {
                    {
                        SubLObject module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.new_hl_storage_module_info();
                        module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $SENSE, $NEG);
                        if (NIL != meaning_sentence_predicate_is_logical_fieldP) {
                            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $ANY_PREDICATES, pred_list);
                        } else {
                            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $PREDICATE, pred);
                        }
                        module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $APPLICABILITY_PATTERN, applicability_pattern);
                        module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $REQUIRED_MT, content_mt);
                        module_infos = cons(module_info, module_infos);
                    }
                }
            }
            return nreverse(module_infos);
        }
    }

    /**
     *
     *
     * @return listp; a list of module-info-ps containing :applicability-pattern, :sense, :predicate (or :any-predicates), :required-mt  --
    the stuff that determines the applicability.
     */
    @LispMethod(comment = "@return listp; a list of module-info-ps containing :applicability-pattern, :sense, :predicate (or :any-predicates), :required-mt  --\r\nthe stuff that determines the applicability.")
    public static SubLObject pos_atomic_meaning_sentence_applicability_pattern_infos(final SubLObject meaning_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject logical_field_indexical_termnums) {
        SubLObject module_infos = NIL;
        final SubLObject meaning_sentence_predicate_is_logical_fieldP = sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(meaning_sentence);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
        final SubLObject pred_list = (NIL != meaning_sentence_predicate_is_logical_fieldP) ? sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, UNPROVIDED) : NIL;
        SubLObject cdolist_list_var;
        SubLObject applicability_patterns = cdolist_list_var = compute_meaning_sentence_applicability_patterns(meaning_sentence, logical_field_indexical_termnums, $POS);
        SubLObject applicability_pattern = NIL;
        applicability_pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject module_info = new_hl_storage_module_info();
            module_info = hl_storage_module_info_add(module_info, $SENSE, $POS);
            if (NIL != meaning_sentence_predicate_is_logical_fieldP) {
                module_info = hl_storage_module_info_add(module_info, $ANY_PREDICATES, pred_list);
            } else {
                module_info = hl_storage_module_info_add(module_info, $PREDICATE, pred);
            }
            module_info = hl_storage_module_info_add(module_info, $APPLICABILITY_PATTERN, applicability_pattern);
            module_info = hl_storage_module_info_add(module_info, $REQUIRED_MT, content_mt);
            module_infos = cons(module_info, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            applicability_pattern = cdolist_list_var.first();
        } 
        applicability_patterns = cdolist_list_var = compute_meaning_sentence_applicability_patterns(meaning_sentence, logical_field_indexical_termnums, $NEG);
        applicability_pattern = NIL;
        applicability_pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject module_info = new_hl_storage_module_info();
            module_info = hl_storage_module_info_add(module_info, $SENSE, $NEG);
            if (NIL != meaning_sentence_predicate_is_logical_fieldP) {
                module_info = hl_storage_module_info_add(module_info, $ANY_PREDICATES, pred_list);
            } else {
                module_info = hl_storage_module_info_add(module_info, $PREDICATE, pred);
            }
            module_info = hl_storage_module_info_add(module_info, $APPLICABILITY_PATTERN, applicability_pattern);
            module_info = hl_storage_module_info_add(module_info, $REQUIRED_MT, content_mt);
            module_infos = cons(module_info, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            applicability_pattern = cdolist_list_var.first();
        } 
        return nreverse(module_infos);
    }

    public static final SubLObject compute_meaning_sentence_applicability_patterns_alt(SubLObject meaning_sentence, SubLObject logical_field_indexical_termnums, SubLObject sense) {
        {
            SubLObject pattern = copy_expression(meaning_sentence);
            SubLObject cdolist_list_var = logical_field_indexical_termnums;
            SubLObject arg_pos_list = NIL;
            for (arg_pos_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_pos_list = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_4 = arg_pos_list;
                    SubLObject arg_pos = NIL;
                    for (arg_pos = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , arg_pos = cdolist_list_var_4.first()) {
                        pattern = cycl_utilities.formula_arg_position_nsubst($FULLY_BOUND, arg_pos, pattern);
                    }
                }
            }
            return list(pattern);
        }
    }

    public static SubLObject compute_meaning_sentence_applicability_patterns(final SubLObject meaning_sentence, final SubLObject logical_field_indexical_termnums, final SubLObject sense) {
        SubLObject pattern = copy_expression(meaning_sentence);
        SubLObject cdolist_list_var = logical_field_indexical_termnums;
        SubLObject arg_pos_list = NIL;
        arg_pos_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = arg_pos_list;
            SubLObject arg_pos = NIL;
            arg_pos = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                pattern = cycl_utilities.formula_arg_position_nsubst($FULLY_BOUND, arg_pos, pattern);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                arg_pos = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_list = cdolist_list_var.first();
        } 
        return list(pattern);
    }

    /**
     * takes MODULE-INFO, which on input only contains the properties :applicability-pattern
     * and other applicability properties like :sense,
     * and fleshes it out into a full-fledged module-info
     * containing all properties necessary to declare it as
     * an HL storage module.
     */
    @LispMethod(comment = "takes MODULE-INFO, which on input only contains the properties :applicability-pattern\r\nand other applicability properties like :sense,\r\nand fleshes it out into a full-fledged module-info\r\ncontaining all properties necessary to declare it as\r\nan HL storage module.\ntakes MODULE-INFO, which on input only contains the properties :applicability-pattern\nand other applicability properties like :sense,\nand fleshes it out into a full-fledged module-info\ncontaining all properties necessary to declare it as\nan HL storage module.")
    public static final SubLObject required_info_hl_storage_module_info_alt(SubLObject module_info, SubLObject sentence, SubLObject logical_schema, SubLObject physical_schema, SubLObject sk_source, SubLObject content_mt) {
        {
            SubLObject applicability_pattern = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_get(module_info, $APPLICABILITY_PATTERN, UNPROVIDED);
            SubLObject sense = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_get(module_info, $SENSE, UNPROVIDED);
            SubLObject direction = sksi_kb_accessors.get_sks_storage_direction_from_kb(sk_source);
            SubLObject documentation = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.sksi_make_documentation_string_from_applicability_pattern_and_sense(applicability_pattern, sense);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $REQUIRED_MT, content_mt);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $MODULE_SUBTYPE, $SKSI);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $MODULE_SOURCE, sk_source);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $ARGUMENT_TYPE, $ARGUMENT);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $DIRECTION, direction);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $INCOMPLETENESS, SKSI_SENTENCE_HL_STORAGE_MODULE_INCOMPLETENESS);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $ADD, SKSI_SENTENCE_HL_STORAGE_MODULE_ASSERT);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $REMOVE, SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $REMOVE_ALL, SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $PREFERRED_OVER, $list_alt35);
            module_info = com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation.hl_storage_module_info_add(module_info, $DOCUMENTATION, documentation);
            return module_info;
        }
    }

    @LispMethod(comment = "takes MODULE-INFO, which on input only contains the properties :applicability-pattern\r\nand other applicability properties like :sense,\r\nand fleshes it out into a full-fledged module-info\r\ncontaining all properties necessary to declare it as\r\nan HL storage module.\ntakes MODULE-INFO, which on input only contains the properties :applicability-pattern\nand other applicability properties like :sense,\nand fleshes it out into a full-fledged module-info\ncontaining all properties necessary to declare it as\nan HL storage module.")
    public static SubLObject required_info_hl_storage_module_info(SubLObject module_info, final SubLObject sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject applicability_pattern = hl_storage_module_info_get(module_info, $APPLICABILITY_PATTERN, UNPROVIDED);
        final SubLObject sense = hl_storage_module_info_get(module_info, $SENSE, UNPROVIDED);
        final SubLObject direction = sksi_kb_accessors.get_sks_storage_direction_from_kb(sk_source);
        final SubLObject documentation = sksi_make_documentation_string_from_applicability_pattern_and_sense(applicability_pattern, sense);
        module_info = hl_storage_module_info_add(module_info, $REQUIRED_MT, content_mt);
        module_info = hl_storage_module_info_add(module_info, $MODULE_SUBTYPE, $SKSI);
        module_info = hl_storage_module_info_add(module_info, $MODULE_SOURCE, sk_source);
        module_info = hl_storage_module_info_add(module_info, $ARGUMENT_TYPE, $ARGUMENT);
        module_info = hl_storage_module_info_add(module_info, $DIRECTION, direction);
        module_info = hl_storage_module_info_add(module_info, $INCOMPLETENESS, SKSI_SENTENCE_HL_STORAGE_MODULE_INCOMPLETENESS);
        module_info = hl_storage_module_info_add(module_info, $ADD, SKSI_SENTENCE_HL_STORAGE_MODULE_ASSERT);
        module_info = hl_storage_module_info_add(module_info, $REMOVE, SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT);
        module_info = hl_storage_module_info_add(module_info, $REMOVE_ALL, SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT);
        if (NIL != $sksi_hl_storage_modules_only_preferred_over_kb_storageP$.getDynamicValue(thread)) {
            module_info = hl_storage_module_info_add(module_info, $PREFERRED_OVER, $list34);
        } else {
            module_info = hl_storage_module_info_add(module_info, $EXCLUSIVE, TRUE);
            module_info = hl_storage_module_info_add(module_info, $SUPPLANTS, $list34);
        }
        module_info = hl_storage_module_info_add(module_info, $DOCUMENTATION, documentation);
        return module_info;
    }/**
     * takes MODULE-INFO, which on input only contains the properties :applicability-pattern
     * and other applicability properties like :sense,
     * and fleshes it out into a full-fledged module-info
     * containing all properties necessary to declare it as
     * an HL storage module.
     */


    public static final SubLObject sksi_make_documentation_string_from_applicability_pattern_and_sense_alt(SubLObject applicability_pattern, SubLObject sense) {
        {
            SubLObject string = format_nil.format_nil_a(applicability_pattern);
            if (sense == $NEG) {
                string = cconcatenate($str_alt37$___not_, new SubLObject[]{ string, $str_alt38$_ });
            }
            string = string_utilities.replace_substring(string, $str_alt39$_FULLY_BOUND, $str_alt40$__FULLY_BOUND_);
            string = string_utilities.replace_substring(string, $str_alt41$_FULLY_BOUND, $str_alt42$__FULLY_BOUND_);
            string = string_utilities.replace_substring(string, $str_alt43$NOT_FULLY_BOUND, $str_alt44$_NOT_FULLY_BOUND_);
            return string;
        }
    }

    public static SubLObject sksi_make_documentation_string_from_applicability_pattern_and_sense(final SubLObject applicability_pattern, final SubLObject sense) {
        SubLObject string = format_nil.format_nil_a(applicability_pattern);
        if (sense == $NEG) {
            string = cconcatenate($str39$___not_, new SubLObject[]{ string, $str40$_ });
        }
        string = string_utilities.replace_substring(string, $str41$_FULLY_BOUND, $str42$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, $str43$_FULLY_BOUND, $str44$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, $str45$NOT_FULLY_BOUND, $str46$_NOT_FULLY_BOUND_);
        return string;
    }

    public static final SubLObject sksi_sentence_hl_storage_module_incompleteness_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        SubLTrampolineFile.checkType(argument_spec, ASSERTED_ARGUMENT_SPEC_P);
        {
            SubLObject incompleteness = NIL;
            SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            if ($MONOTONIC != strength_spec) {
                incompleteness = cons($STRENGTH, incompleteness);
            }
            return incompleteness;
        }
    }

    public static SubLObject sksi_sentence_hl_storage_module_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "! arguments.asserted_argument_spec_p(argument_spec) " + ("arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) ") + argument_spec;
        SubLObject incompleteness = NIL;
        final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
        if ($MONOTONIC != strength_spec) {
            incompleteness = cons($STRENGTH, incompleteness);
        }
        return incompleteness;
    }

    public static final SubLObject sksi_sentence_hl_storage_module_assert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                SubLObject hl_storage_module = hl_storage_modules.currently_executing_hl_storage_module();
                SubLObject sk_source = inference_modules.hl_module_source(hl_storage_module);
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, NIL, mapping_mt);
                SubLObject successP = NIL;
                SubLObject mt_var = mapping_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject physical_schemas = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
                            SubLObject cdolist_list_var = physical_schemas;
                            SubLObject ps = NIL;
                            for (ps = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ps = cdolist_list_var.first()) {
                                {
                                    SubLObject logical_schemas = sksi_kb_accessors.physical_schema_logical_schemata(ps);
                                    SubLObject cdolist_list_var_5 = logical_schemas;
                                    SubLObject ls = NIL;
                                    for (ls = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , ls = cdolist_list_var_5.first()) {
                                        {
                                            SubLObject partial_successP = sksi_incremental_edit.sksi_store_logical_sentence(asent, sk_source, ls, ps, mapping_mt, access_path);
                                            if (NIL != partial_successP) {
                                                successP = partial_successP;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject sksi_sentence_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str50$__SKSI__A_, $str51$_sksi_sentence_hl_storage_module_), new SubLObject[]{ NINE_INTEGER, argument_spec, cnf, mt, direction, variable_map });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject hl_storage_module = hl_storage_modules.currently_executing_hl_storage_module();
        final SubLObject sk_source = inference_modules.hl_module_source(hl_storage_module);
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, NIL, mapping_mt);
        SubLObject successP = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject physical_schemas = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
            SubLObject ps = NIL;
            ps = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$5;
                final SubLObject logical_schemas = cdolist_list_var_$5 = sksi_kb_accessors.physical_schema_logical_schemata(ps);
                SubLObject ls = NIL;
                ls = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    final SubLObject partial_successP = sksi_incremental_edit.sksi_store_logical_sentence(asent, sk_source, ls, ps, mapping_mt, access_path);
                    if (NIL != partial_successP) {
                        successP = partial_successP;
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    ls = cdolist_list_var_$5.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                ps = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str50$__SKSI__A_, $str52$sksi_sentence_hl_storage_module_a), NINE_INTEGER, successP);
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return successP;
    }

    public static final SubLObject sksi_sentence_hl_storage_module_unassert_alt(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                SubLObject hl_storage_module = hl_storage_modules.currently_executing_hl_storage_module();
                SubLObject sk_source = inference_modules.hl_module_source(hl_storage_module);
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, NIL, mapping_mt);
                SubLObject successP = NIL;
                SubLObject mt_var = mapping_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject physical_schemas = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
                            SubLObject cdolist_list_var = physical_schemas;
                            SubLObject ps = NIL;
                            for (ps = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ps = cdolist_list_var.first()) {
                                {
                                    SubLObject logical_schemas = sksi_kb_accessors.physical_schema_logical_schemata(ps);
                                    SubLObject cdolist_list_var_6 = logical_schemas;
                                    SubLObject ls = NIL;
                                    for (ls = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , ls = cdolist_list_var_6.first()) {
                                        {
                                            SubLObject partial_successP = sksi_incremental_edit.sksi_delete_logical_sentence(asent, sk_source, ls, ps, mapping_mt, access_path);
                                            if (NIL != partial_successP) {
                                                successP = partial_successP;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject sksi_sentence_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject hl_storage_module = hl_storage_modules.currently_executing_hl_storage_module();
        final SubLObject sk_source = inference_modules.hl_module_source(hl_storage_module);
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, NIL, mapping_mt);
        SubLObject successP = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject physical_schemas = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
            SubLObject ps = NIL;
            ps = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$6;
                final SubLObject logical_schemas = cdolist_list_var_$6 = sksi_kb_accessors.physical_schema_logical_schemata(ps);
                SubLObject ls = NIL;
                ls = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    final SubLObject partial_successP = sksi_incremental_edit.sksi_delete_logical_sentence(asent, sk_source, ls, ps, mapping_mt, access_path);
                    if (NIL != partial_successP) {
                        successP = partial_successP;
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    ls = cdolist_list_var_$6.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                ps = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static SubLObject declare_sksi_hl_storage_module_generation_file() {
        declareFunction("sksi_hl_storage_module_p", "SKSI-HL-STORAGE-MODULE-P", 1, 0, false);
        declareMacro("do_sksi_hl_storage_modules", "DO-SKSI-HL-STORAGE-MODULES");
        declareMacro("do_sksi_hl_storage_modules_list", "DO-SKSI-HL-STORAGE-MODULES-LIST");
        declareFunction("sksi_hl_storage_modules_count", "SKSI-HL-STORAGE-MODULES-COUNT", 0, 0, false);
        declareFunction("note_sksi_hl_storage_module", "NOTE-SKSI-HL-STORAGE-MODULE", 1, 0, false);
        declareFunction("un_note_sksi_hl_storage_module", "UN-NOTE-SKSI-HL-STORAGE-MODULE", 1, 0, false);
        declareFunction("un_note_all_sksi_hl_storage_modules", "UN-NOTE-ALL-SKSI-HL-STORAGE-MODULES", 0, 0, false);
        declareFunction("note_sksi_hl_storage_module_by_sks", "NOTE-SKSI-HL-STORAGE-MODULE-BY-SKS", 2, 0, false);
        declareFunction("un_note_sksi_hl_storage_modules_by_sks", "UN-NOTE-SKSI-HL-STORAGE-MODULES-BY-SKS", 1, 0, false);
        declareFunction("clear_sksi_hl_storage_modules_by_sks_cache", "CLEAR-SKSI-HL-STORAGE-MODULES-BY-SKS-CACHE", 0, 0, false);
        declareFunction("un_note_sksi_hl_storage_modules_by_sks_for_module", "UN-NOTE-SKSI-HL-STORAGE-MODULES-BY-SKS-FOR-MODULE", 1, 0, false);
        declareFunction("sksi_hl_storage_modules_by_sks_find_modules", "SKSI-HL-STORAGE-MODULES-BY-SKS-FIND-MODULES", 1, 0, false);
        declareFunction("register_sksi_hl_storage_modules_for_sks", "REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS", 1, 1, false);
        declareFunction("register_sksi_hl_storage_modules_for_sks_int", "REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS-INT", 1, 1, false);
        declareFunction("register_sksi_hl_storage_modules_for_just_sks", "REGISTER-SKSI-HL-STORAGE-MODULES-FOR-JUST-SKS", 1, 1, false);
        declareFunction("deregister_all_sksi_hl_storage_modules", "DEREGISTER-ALL-SKSI-HL-STORAGE-MODULES", 0, 0, false);
        declareFunction("deregister_sksi_hl_storage_modules_for_sks", "DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS", 1, 2, false);
        declareFunction("deregister_sksi_hl_storage_modules_for_just_sks", "DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-JUST-SKS", 1, 1, false);
        declareFunction("deregister_sksi_hl_storage_module", "DEREGISTER-SKSI-HL-STORAGE-MODULE", 1, 1, false);
        declareFunction("hl_storage_module_info_p", "HL-STORAGE-MODULE-INFO-P", 1, 0, false);
        declareFunction("new_hl_storage_module_info", "NEW-HL-STORAGE-MODULE-INFO", 0, 0, false);
        declareFunction("hl_storage_module_info_add", "HL-STORAGE-MODULE-INFO-ADD", 3, 0, false);
        declareFunction("hl_storage_module_info_get", "HL-STORAGE-MODULE-INFO-GET", 2, 1, false);
        declareFunction("hl_storage_module_info_remove", "HL-STORAGE-MODULE-INFO-REMOVE", 2, 0, false);
        declareFunction("declare_hl_storage_module_with_module_info", "DECLARE-HL-STORAGE-MODULE-WITH-MODULE-INFO", 1, 0, false);
        declareFunction("determine_hl_storage_module_info_name", "DETERMINE-HL-STORAGE-MODULE-INFO-NAME", 1, 0, false);
        declareFunction("make_sksi_hl_storage_module_name", "MAKE-SKSI-HL-STORAGE-MODULE-NAME", 1, 0, false);
        declareFunction("sks_hl_storage_module_infos", "SKS-HL-STORAGE-MODULE-INFOS", 2, 0, false);
        declareFunction("sk_source_hl_storage_module_infos", "SK-SOURCE-HL-STORAGE-MODULE-INFOS", 2, 0, false);
        declareFunction("physical_schema_hl_storage_module_infos", "PHYSICAL-SCHEMA-HL-STORAGE-MODULE-INFOS", 3, 0, false);
        declareFunction("logical_schema_hl_storage_module_infos", "LOGICAL-SCHEMA-HL-STORAGE-MODULE-INFOS", 4, 0, false);
        declareFunction("meaning_sentence_hl_storage_module_infos", "MEANING-SENTENCE-HL-STORAGE-MODULE-INFOS", 5, 0, false);
        declareFunction("negated_atomic_meaning_sentence_hl_storage_module_infos", "NEGATED-ATOMIC-MEANING-SENTENCE-HL-STORAGE-MODULE-INFOS", 5, 0, false);
        declareFunction("pos_atomic_meaning_sentence_hl_storage_module_infos", "POS-ATOMIC-MEANING-SENTENCE-HL-STORAGE-MODULE-INFOS", 5, 0, false);
        declareFunction("pos_atomic_meaning_sentence_applicability_pattern_infos", "POS-ATOMIC-MEANING-SENTENCE-APPLICABILITY-PATTERN-INFOS", 6, 0, false);
        declareFunction("compute_meaning_sentence_applicability_patterns", "COMPUTE-MEANING-SENTENCE-APPLICABILITY-PATTERNS", 3, 0, false);
        declareFunction("required_info_hl_storage_module_info", "REQUIRED-INFO-HL-STORAGE-MODULE-INFO", 6, 0, false);
        declareFunction("sksi_make_documentation_string_from_applicability_pattern_and_sense", "SKSI-MAKE-DOCUMENTATION-STRING-FROM-APPLICABILITY-PATTERN-AND-SENSE", 2, 0, false);
        declareFunction("sksi_sentence_hl_storage_module_incompleteness", "SKSI-SENTENCE-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false);
        declareFunction("sksi_sentence_hl_storage_module_assert", "SKSI-SENTENCE-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
        declareFunction("sksi_sentence_hl_storage_module_unassert", "SKSI-SENTENCE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_sksi_hl_storage_module_generation_file_alt() {
        deflexical("*SKSI-HL-STORAGE-MODULES*", NIL != boundp($sksi_hl_storage_modules$) ? ((SubLObject) ($sksi_hl_storage_modules$.getGlobalValue())) : set.new_set(UNPROVIDED, UNPROVIDED));
        deflexical("*SKSI-HL-STORAGE-MODULES-BY-SKS*", NIL != boundp($sksi_hl_storage_modules_by_sks$) ? ((SubLObject) ($sksi_hl_storage_modules_by_sks$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_sksi_hl_storage_module_generation_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SKSI-HL-STORAGE-MODULES*", SubLTrampolineFile.maybeDefault($sksi_hl_storage_modules$, $sksi_hl_storage_modules$, () -> set.new_set(UNPROVIDED, UNPROVIDED)));
            deflexical("*SKSI-HL-STORAGE-MODULES-BY-SKS*", SubLTrampolineFile.maybeDefault($sksi_hl_storage_modules_by_sks$, $sksi_hl_storage_modules_by_sks$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
            defparameter("*SKSI-HL-STORAGE-MODULES-ONLY-PREFERRED-OVER-KB-STORAGE?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKSI-HL-STORAGE-MODULES*", NIL != boundp($sksi_hl_storage_modules$) ? ((SubLObject) ($sksi_hl_storage_modules$.getGlobalValue())) : set.new_set(UNPROVIDED, UNPROVIDED));
            deflexical("*SKSI-HL-STORAGE-MODULES-BY-SKS*", NIL != boundp($sksi_hl_storage_modules_by_sks$) ? ((SubLObject) ($sksi_hl_storage_modules_by_sks$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_sksi_hl_storage_module_generation_file_Previous() {
        deflexical("*SKSI-HL-STORAGE-MODULES*", SubLTrampolineFile.maybeDefault($sksi_hl_storage_modules$, $sksi_hl_storage_modules$, () -> set.new_set(UNPROVIDED, UNPROVIDED)));
        deflexical("*SKSI-HL-STORAGE-MODULES-BY-SKS*", SubLTrampolineFile.maybeDefault($sksi_hl_storage_modules_by_sks$, $sksi_hl_storage_modules_by_sks$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defparameter("*SKSI-HL-STORAGE-MODULES-ONLY-PREFERRED-OVER-KB-STORAGE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_hl_storage_module_generation_file() {
        declare_defglobal($sksi_hl_storage_modules$);
        declare_defglobal($sksi_hl_storage_modules_by_sks$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_hl_storage_module_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_hl_storage_module_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_hl_storage_module_generation_file();
    }

    

    static private final SubLList $list_alt1 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeSymbol("*SKSI-HL-STORAGE-MODULES*"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("*SKSI-HL-STORAGE-MODULES*")));

    static private final SubLString $str_alt7$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt8$_S_was_not_a_valid_HL_storage_mod = makeString("~S was not a valid HL storage module parameter");

    static private final SubLString $str_alt14$complex_non_atomic_meaning_senten = makeString("complex non-atomic meaning sentences not handled yet");

    static private final SubLList $list_alt35 = list(makeKeyword("REGULAR-KB-ASSERTION"));

    static private final SubLString $str_alt37$___not_ = makeString("(#$not ");

    static private final SubLString $str_alt38$_ = makeString(")");

    static private final SubLString $str_alt39$_FULLY_BOUND = makeString(" FULLY-BOUND");

    static private final SubLString $str_alt40$__FULLY_BOUND_ = makeString(" <FULLY-BOUND>");

    static private final SubLString $str_alt41$_FULLY_BOUND = makeString("(FULLY-BOUND");

    static private final SubLString $str_alt42$__FULLY_BOUND_ = makeString("(<FULLY-BOUND>");

    static private final SubLString $str_alt43$NOT_FULLY_BOUND = makeString("NOT-FULLY-BOUND");

    static private final SubLString $str_alt44$_NOT_FULLY_BOUND_ = makeString("<NOT-FULLY-BOUND>");
}

/**
 * Total time: 233 ms
 */
