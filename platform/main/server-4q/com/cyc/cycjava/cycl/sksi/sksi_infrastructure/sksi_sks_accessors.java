package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_nat_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sks_accessors extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_accessors();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors";

    public static final String myFingerPrint = "22ebc547b52a53f04e4abbb0c25bc5d6a4b19d8b96be64b3acfa0670ce08ed47";

    // defparameter
    private static final SubLSymbol $sks_inverse_lookup_preds$ = makeSymbol("*SKS-INVERSE-LOOKUP-PREDS*");

    // deflexical
    private static final SubLSymbol $sks_type_to_subtype_pred_plist$ = makeSymbol("*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*");

    private static final SubLObject $$StructuredKnowledgeSource = reader_make_constant_shell(makeString("StructuredKnowledgeSource"));

    private static final SubLObject $$StructuredKnowledgeSource_Complex = reader_make_constant_shell(makeString("StructuredKnowledgeSource-Complex"));

    private static final SubLObject $$StructuredKnowledgeSource_Atomic = reader_make_constant_shell(makeString("StructuredKnowledgeSource-Atomic"));

    public static final SubLSymbol $sym3$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    public static final SubLSymbol SKS_COMPLEX_P = makeSymbol("SKS-COMPLEX-P");



    public static final SubLSymbol SKS_TYPE_P = makeSymbol("SKS-TYPE-P");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLString $str9$No_defining_mt_found_ = makeString("No defining mt found!");

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    public static final SubLString $str13$Given_sks_type__A_conflicts_with_ = makeString("Given sks-type ~A conflicts with super-sks-type ~A");

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLObject $$subKS_Direct = reader_make_constant_shell(makeString("subKS-Direct"));

    private static final SubLObject $$structuredKnowledgeSourceName = reader_make_constant_shell(makeString("structuredKnowledgeSourceName"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$ContentMtFn = reader_make_constant_shell(makeString("ContentMtFn"));

    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));

    public static final SubLSymbol SKS_P = makeSymbol("SKS-P");

    public static final SubLString $str21$The__ = makeString("The \"");

    public static final SubLString $str22$__table_in___ = makeString("\" table in #$");

    public static final SubLString $str23$_ = makeString(".");

    public static final SubLString $str24$The_top_level_knowledge_source_fo = makeString("The top-level knowledge source for the ");

    public static final SubLString $str25$_KS = makeString("-KS");

    public static final SubLString $$$KS = makeString("KS");

    public static final SubLList $list27 = list(reader_make_constant_shell(makeString("physicalSchemaSourceMap")));





    public static final SubLString $str30$more_than_one__A_found_for__A__re = makeString("more than one ~A found for ~A, returning only one.");

    private static final SubLString $str31$ = makeString("");

    private static final SubLObject $$sksIsa = reader_make_constant_shell(makeString("sksIsa"));

    private static final SubLObject $$mappingMt = reader_make_constant_shell(makeString("mappingMt"));

    private static final SubLObject $$contentMt = reader_make_constant_shell(makeString("contentMt"));

    private static final SubLSymbol SKS_GET_TOP_SKS = makeSymbol("SKS-GET-TOP-SKS");

    private static final SubLString $str36$too_many_possible_skss_for_conten = makeString("too many possible skss for content-mt ~A");

    private static final SubLObject $const37$StructuredKnowledgeSource_TopLeve = reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel"));

    private static final SubLSymbol $sym38$FORT_NAME_ = makeSymbol("FORT-NAME<");

    private static final SubLObject $$rowCount_SKS = reader_make_constant_shell(makeString("rowCount-SKS"));



    private static final SubLObject $$MappingMtFn = reader_make_constant_shell(makeString("MappingMtFn"));

    private static final SubLObject $const42$SKSISupportedStructuredKnowledgeS = reader_make_constant_shell(makeString("SKSISupportedStructuredKnowledgeSourceType"));

    private static final SubLList $list43 = list(reader_make_constant_shell(makeString("Database-Physical")), reader_make_constant_shell(makeString("sqlProgramForSKS")));

    private static final SubLSymbol SKS_SUBTYPE_P = makeSymbol("SKS-SUBTYPE-P");

    public static SubLObject sks_p(final SubLObject sks) {
        return makeBoolean((NIL != forts.fort_p(sks)) && (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource)));
    }

    public static SubLObject sks_complex_p(final SubLObject sks) {
        return makeBoolean((NIL != sks_p(sks)) && ((NIL == sks_atomic_p(sks)) || (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource_Complex))));
    }

    public static SubLObject sks_atomic_p(final SubLObject sks) {
        return makeBoolean((NIL != forts.fort_p(sks)) && (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource_Atomic)));
    }

    public static SubLObject new_sks(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject sks_type) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        if (sks_type == UNPROVIDED) {
            sks_type = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) " + sks_name;
        if (((NIL != super_sks) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        if (((NIL != defining_mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(defining_mt))) {
            throw new AssertionError(defining_mt);
        }
        if (((NIL != sks_type) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_type_p(sks_type))) {
            throw new AssertionError(sks_type);
        }
        final SubLObject sks_description = make_new_sks_description(sks_name, super_sks);
        final SubLObject sks_constant_name = make_new_sks_constant_name(sks_name, super_sks);
        final SubLObject sks = sksi_kb_accessors.sksi_find_or_create(sks_constant_name);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource), $$UniversalVocabularyMt);
        if (NIL == hlmt.hlmt_p(defining_mt)) {
            defining_mt = (NIL != sks_p(super_sks)) ? sks_get_defining_mt(super_sks, UNPROVIDED) : NIL;
            if (NIL == hlmt.hlmt_p(defining_mt)) {
                defining_mt = make_sks_legacy_mapping_mt(sks);
                if (NIL == hlmt.hlmt_p(defining_mt)) {
                    Errors.error($str9$No_defining_mt_found_);
                }
            }
        }
        if (NIL != sks) {
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$definingMt, sks, defining_mt), $$BaseKB);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, defining_mt, $$Microtheory), $$UniversalVocabularyMt);
            if (NIL != sks_p(super_sks)) {
                sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(sks, super_sks);
                final SubLObject super_sks_type = sks_get_type(super_sks);
                if (((NIL != sks_type_p(super_sks_type)) && (NIL != sks_type_p(sks_type))) && (!super_sks_type.equal(sks_type))) {
                    Errors.error($str13$Given_sks_type__A_conflicts_with_, super_sks_type, sks_type);
                } else
                    if (NIL == sks_type) {
                        sks_type = super_sks_type;
                    }

            }
            if (NIL != sks_type_p(sks_type)) {
                sks_set_type(sks, sks_type);
            }
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$comment, sks, sks_description), defining_mt);
            if (NIL != super_sks) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$subKS_Direct, super_sks, sks), defining_mt);
            }
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$structuredKnowledgeSourceName, sks, sks_name), defining_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, make_unary_nat_formula($$ContentMtFn, sks), $$BaseKB), $$UniversalVocabularyMt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$genlMt, make_unary_nat_formula($$ContentMtFn, sks), $$SKSIMt), $$UniversalVocabularyMt);
        }
        return sks;
    }

    public static SubLObject new_sks_complex(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject sks_type) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        if (sks_type == UNPROVIDED) {
            sks_type = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) " + sks_name;
        if (((NIL != super_sks) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        if (((NIL != defining_mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(defining_mt))) {
            throw new AssertionError(defining_mt);
        }
        if (((NIL != sks_type) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_type_p(sks_type))) {
            throw new AssertionError(sks_type);
        }
        final SubLObject sks = new_sks(sks_name, super_sks, defining_mt, sks_type);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource_Complex), $$UniversalVocabularyMt);
        return sks;
    }

    public static SubLObject new_sks_atomic(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) " + sks_name;
        if (((NIL != super_sks) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        if (((NIL != defining_mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(defining_mt))) {
            throw new AssertionError(defining_mt);
        }
        final SubLObject sks = new_sks(sks_name, super_sks, defining_mt, UNPROVIDED);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource_Atomic), $$UniversalVocabularyMt);
        return sks;
    }

    public static SubLObject destroy_sks(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sksi_kb_accessors.sksi_kill(sks);
    }

    public static SubLObject make_new_sks_description(final SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) " + sks_name;
        if (((NIL != super_sks) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        SubLObject result = NIL;
        if (NIL != sks_p(super_sks)) {
            result = cconcatenate($str21$The__, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks_name), $str22$__table_in___, format_nil.format_nil_a_no_copy(sks_get_string(super_sks)), $str23$_ });
        } else {
            result = cconcatenate($str24$The_top_level_knowledge_source_fo, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks_name), $str23$_ });
        }
        return result;
    }

    public static SubLObject make_new_sks_constant_name(final SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) " + sks_name;
        if (((NIL != super_sks) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        SubLObject result = NIL;
        if (NIL != sks_p(super_sks)) {
            result = string_utilities.bunge(list(string_utilities.post_remove(sks_get_string(super_sks), $str25$_KS, UNPROVIDED), sks_name, $$$KS), CHAR_hyphen);
        } else
            if (NIL != string_utilities.ends_with(sks_name, $str25$_KS, UNPROVIDED)) {
                result = string_utilities.make_valid_constant_name(sks_name, UNPROVIDED);
            } else {
                result = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(sks_name, UNPROVIDED)), $str25$_KS);
            }

        return result;
    }

    public static SubLObject find_sks(final SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) " + sks_name;
        if (((NIL != super_sks) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        final SubLObject sks_constant_name = make_new_sks_constant_name(sks_name, super_sks);
        return sksi_kb_accessors.sksi_find(sks_constant_name);
    }

    public static SubLObject sks_get(final SubLObject sks, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (NIL == mt) {
            mt = sks_get_defining_mt(sks, T);
        }
        final SubLObject reverse_argsP = subl_promotions.memberP(pred, $sks_inverse_lookup_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject index_arg = (NIL != reverse_argsP) ? TWO_INTEGER : ONE_INTEGER;
        final SubLObject gather_arg = (NIL != reverse_argsP) ? ONE_INTEGER : TWO_INTEGER;
        SubLObject result = NIL;
        if ((NIL == mt) || (mt == $ALL)) {
            result = kb_mapping_utilities.pred_values_in_any_mt(sks, pred, index_arg, gather_arg, UNPROVIDED);
        } else {
            result = kb_mapping_utilities.pred_values_in_relevant_mts(sks, pred, mt, index_arg, gather_arg, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject sks_fget(final SubLObject sks, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject sks_get_results = sks_get(sks, pred, mt);
        if ((NIL != sks_get_results) && (NIL == list_utilities.singletonP(sks_get_results))) {
            Errors.warn($str30$more_than_one__A_found_for__A__re, pred, sks);
        }
        return sks_get_results.first();
    }

    public static SubLObject sks_fset(final SubLObject sks, final SubLObject pred, final SubLObject value, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == mt) {
            mt = sks_get_defining_mt(sks, UNPROVIDED);
        }
        final SubLObject current_value = sks_fget(sks, pred, mt);
        final SubLObject current_formula = make_binary_formula(pred, sks_get_term(sks), current_value);
        final SubLObject new_formula = make_binary_formula(pred, sks_get_term(sks), value);
        sksi_kb_accessors.sksi_unassert(current_formula, mt);
        if (NIL != value) {
            return sksi_kb_accessors.sksi_assert_if_new(new_formula, mt);
        }
        return NIL;
    }

    public static SubLObject sks_get_term(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sks;
    }

    public static SubLObject sks_get_name(final SubLObject sks, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$structuredKnowledgeSourceName;
        }
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        SubLObject result = sks_fget(sks, pred, UNPROVIDED);
        if (NIL == result) {
            result = $str31$;
        }
        return result;
    }

    public static SubLObject sks_get_string(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return constants_high.constant_name(sks);
    }

    public static SubLObject sks_get_type(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sks_fget(sks, $$sksIsa, UNPROVIDED);
    }

    public static SubLObject sks_set_type(final SubLObject sks, final SubLObject sks_type) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != sks_type_p(sks_type) : "sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) " + sks_type;
        final SubLObject defining_mt = sks_get_defining_mt(sks, UNPROVIDED);
        if (NIL != hlmt.hlmt_p(defining_mt)) {
            final SubLObject current_sks_type = sks_get_type(sks);
            if (!sks_type.equal(current_sks_type)) {
                sksi_kb_accessors.sksi_unassert(make_binary_formula($$sksIsa, sks, current_sks_type), defining_mt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksIsa, sks, sks_type), defining_mt);
            }
        }
        return NIL;
    }

    public static SubLObject sks_get_subtype(final SubLObject sks, final SubLObject sks_type) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != sks_type_p(sks_type) : "sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) " + sks_type;
        final SubLObject pred = sks_type_get_subtype_pred(sks_type);
        final SubLObject result = (NIL != pred) ? sks_fget(sks, pred, UNPROVIDED) : NIL;
        if (NIL != forts.fort_p(result)) {
            return result;
        }
        final SubLObject super_sks = sks_get_super_sks(sks);
        if (NIL != sks_p(super_sks)) {
            return sks_get_subtype(super_sks, sks_type);
        }
        return NIL;
    }

    public static SubLObject sks_get_super_sks(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return kb_mapping_utilities.fpred_value_in_any_mt(sks, $$subKS_Direct, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject sks_get_defining_mt(final SubLObject sks, SubLObject strict_definitionP) {
        if (strict_definitionP == UNPROVIDED) {
            strict_definitionP = NIL;
        }
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject defining_mt = kb_mapping_utilities.fpred_value_in_mt(sks, $$definingMt, $$BaseKB, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        if (NIL != hlmt.hlmt_p(defining_mt)) {
            return defining_mt;
        }
        if (NIL != strict_definitionP) {
            return NIL;
        }
        final SubLObject legacy_mapping_mt = sks_fget(sks_get_top_sks(sks), $$mappingMt, UNPROVIDED);
        if (NIL != hlmt.hlmt_p(legacy_mapping_mt)) {
            return legacy_mapping_mt;
        }
        return NIL;
    }

    public static SubLObject sks_get_content_mt(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sks_fget(sks, $$contentMt, UNPROVIDED);
    }

    public static SubLObject find_sks_by_content_mt(final SubLObject content_mt) {
        assert NIL != hlmt.hlmt_p(content_mt) : "hlmt.hlmt_p(content_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(content_mt) " + content_mt;
        final SubLObject skss = kb_mapping_utilities.pred_values_in_any_mt(content_mt, $$contentMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject sks_tops = Mapping.mapcar(SKS_GET_TOP_SKS, skss);
        if (length(sks_tops).numG(ONE_INTEGER)) {
            Errors.warn($str36$too_many_possible_skss_for_conten, content_mt);
        }
        return sks_tops.first();
    }

    public static SubLObject get_all_skss() {
        final SubLObject skss = isa.all_fort_instances_in_all_mts($const37$StructuredKnowledgeSource_TopLeve);
        return Sort.sort(skss, $sym38$FORT_NAME_, UNPROVIDED);
    }

    public static SubLObject sks_get_connection(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sks;
    }

    public static SubLObject sks_get_row_count(final SubLObject sks) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return sks_fget(sks, $$rowCount_SKS, UNPROVIDED);
    }

    public static SubLObject sks_set_row_count(final SubLObject sks, final SubLObject row_count) {
        assert NIL != sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != numberp(row_count) : "Types.numberp(row_count) " + "CommonSymbols.NIL != Types.numberp(row_count) " + row_count;
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$rowCount_SKS, sks, round(row_count, UNPROVIDED)), sks_get_defining_mt(sks, UNPROVIDED));
    }

    public static SubLObject sks_get_top_sks(final SubLObject sks) {
        final SubLObject super_sks = sks_get_super_sks(sks);
        if (NIL != sks_p(super_sks)) {
            return sks_get_top_sks(super_sks);
        }
        return sks;
    }

    public static SubLObject make_sks_legacy_mapping_mt(final SubLObject sks) {
        final SubLObject mt_formula = make_unary_nat_formula($$MappingMtFn, sks);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$mappingMt, sks, mt_formula), $$UniversalVocabularyMt);
        return sksi_kb_accessors.sksi_find_nart(mt_formula);
    }

    public static SubLObject sks_type_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && ((NIL == kb_loaded()) || (NIL != isa.isa_in_any_mtP(v_object, $const42$SKSISupportedStructuredKnowledgeS))));
    }

    public static SubLObject sks_type_get_name(final SubLObject sks_type) {
        assert NIL != sks_type_p(sks_type) : "sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) " + sks_type;
        return constants_high.constant_name(sks_type);
    }

    public static SubLObject sks_type_get_subtype_pred(final SubLObject sks_type) {
        assert NIL != sks_type_p(sks_type) : "sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) " + sks_type;
        return getf($sks_type_to_subtype_pred_plist$.getGlobalValue(), sks_type, UNPROVIDED);
    }

    public static SubLObject sks_subtype_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    public static SubLObject sks_subtype_get_name(final SubLObject sks_subtype) {
        assert NIL != sks_subtype_p(sks_subtype) : "sksi_sks_accessors.sks_subtype_p(sks_subtype) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_subtype_p(sks_subtype) " + sks_subtype;
        return constants_high.constant_name(sks_subtype);
    }

    public static SubLObject declare_sksi_sks_accessors_file() {
        declareFunction(me, "sks_p", "SKS-P", 1, 0, false);
        declareFunction(me, "sks_complex_p", "SKS-COMPLEX-P", 1, 0, false);
        declareFunction(me, "sks_atomic_p", "SKS-ATOMIC-P", 1, 0, false);
        declareFunction(me, "new_sks", "NEW-SKS", 1, 3, false);
        declareFunction(me, "new_sks_complex", "NEW-SKS-COMPLEX", 1, 3, false);
        declareFunction(me, "new_sks_atomic", "NEW-SKS-ATOMIC", 1, 2, false);
        declareFunction(me, "destroy_sks", "DESTROY-SKS", 1, 0, false);
        declareFunction(me, "make_new_sks_description", "MAKE-NEW-SKS-DESCRIPTION", 1, 1, false);
        declareFunction(me, "make_new_sks_constant_name", "MAKE-NEW-SKS-CONSTANT-NAME", 1, 1, false);
        declareFunction(me, "find_sks", "FIND-SKS", 1, 1, false);
        declareFunction(me, "sks_get", "SKS-GET", 2, 1, false);
        declareFunction(me, "sks_fget", "SKS-FGET", 2, 1, false);
        declareFunction(me, "sks_fset", "SKS-FSET", 3, 1, false);
        declareFunction(me, "sks_get_term", "SKS-GET-TERM", 1, 0, false);
        declareFunction(me, "sks_get_name", "SKS-GET-NAME", 1, 1, false);
        declareFunction(me, "sks_get_string", "SKS-GET-STRING", 1, 0, false);
        declareFunction(me, "sks_get_type", "SKS-GET-TYPE", 1, 0, false);
        declareFunction(me, "sks_set_type", "SKS-SET-TYPE", 2, 0, false);
        declareFunction(me, "sks_get_subtype", "SKS-GET-SUBTYPE", 2, 0, false);
        declareFunction(me, "sks_get_super_sks", "SKS-GET-SUPER-SKS", 1, 0, false);
        declareFunction(me, "sks_get_defining_mt", "SKS-GET-DEFINING-MT", 1, 1, false);
        declareFunction(me, "sks_get_content_mt", "SKS-GET-CONTENT-MT", 1, 0, false);
        declareFunction(me, "find_sks_by_content_mt", "FIND-SKS-BY-CONTENT-MT", 1, 0, false);
        declareFunction(me, "get_all_skss", "GET-ALL-SKSS", 0, 0, false);
        declareFunction(me, "sks_get_connection", "SKS-GET-CONNECTION", 1, 0, false);
        declareFunction(me, "sks_get_row_count", "SKS-GET-ROW-COUNT", 1, 0, false);
        declareFunction(me, "sks_set_row_count", "SKS-SET-ROW-COUNT", 2, 0, false);
        declareFunction(me, "sks_get_top_sks", "SKS-GET-TOP-SKS", 1, 0, false);
        declareFunction(me, "make_sks_legacy_mapping_mt", "MAKE-SKS-LEGACY-MAPPING-MT", 1, 0, false);
        declareFunction(me, "sks_type_p", "SKS-TYPE-P", 1, 0, false);
        declareFunction(me, "sks_type_get_name", "SKS-TYPE-GET-NAME", 1, 0, false);
        declareFunction(me, "sks_type_get_subtype_pred", "SKS-TYPE-GET-SUBTYPE-PRED", 1, 0, false);
        declareFunction(me, "sks_subtype_p", "SKS-SUBTYPE-P", 1, 0, false);
        declareFunction(me, "sks_subtype_get_name", "SKS-SUBTYPE-GET-NAME", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_accessors_file() {
        defparameter("*SKS-INVERSE-LOOKUP-PREDS*", $list27);
        deflexical("*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*", $list43);
        return NIL;
    }

    public static SubLObject setup_sksi_sks_accessors_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_accessors_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_accessors_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_accessors_file();
    }

    
}

/**
 * Total time: 209 ms synthetic
 */
