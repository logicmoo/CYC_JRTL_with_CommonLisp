/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_nat_formula;
import static com.cyc.cycjava.cycl.string_utilities.bunge;
import static com.cyc.cycjava.cycl.string_utilities.ends_with;
import static com.cyc.cycjava.cycl.string_utilities.make_valid_constant_name;
import static com.cyc.cycjava.cycl.string_utilities.post_remove;
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

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-SKS-ACCESSORS
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp
 * created:     2019/07/03 17:37:53
 */
public final class sksi_sks_accessors extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_sks_accessors();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sks_inverse_lookup_preds$ = makeSymbol("*SKS-INVERSE-LOOKUP-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sks_type_to_subtype_pred_plist$ = makeSymbol("*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*");



    private static final SubLObject $$StructuredKnowledgeSource_Complex = reader_make_constant_shell("StructuredKnowledgeSource-Complex");

    private static final SubLObject $$StructuredKnowledgeSource_Atomic = reader_make_constant_shell("StructuredKnowledgeSource-Atomic");

    static private final SubLSymbol $sym3$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    private static final SubLSymbol SKS_COMPLEX_P = makeSymbol("SKS-COMPLEX-P");

    private static final SubLSymbol SKS_TYPE_P = makeSymbol("SKS-TYPE-P");





    static private final SubLString $str9$No_defining_mt_found_ = makeString("No defining mt found!");







    static private final SubLString $str13$Given_sks_type__A_conflicts_with_ = makeString("Given sks-type ~A conflicts with super-sks-type ~A");



    private static final SubLObject $$subKS_Direct = reader_make_constant_shell("subKS-Direct");









    private static final SubLSymbol SKS_P = makeSymbol("SKS-P");

    static private final SubLString $str21$The__ = makeString("The \"");

    static private final SubLString $str22$__table_in___ = makeString("\" table in #$");

    static private final SubLString $str23$_ = makeString(".");

    static private final SubLString $str24$The_top_level_knowledge_source_fo = makeString("The top-level knowledge source for the ");

    static private final SubLString $str25$_KS = makeString("-KS");

    static private final SubLString $$$KS = makeString("KS");

    static private final SubLList $list27 = list(reader_make_constant_shell("physicalSchemaSourceMap"));

    static private final SubLString $str30$more_than_one__A_found_for__A__re = makeString("more than one ~A found for ~A, returning only one.");

    private static final SubLString $str31$ = makeString("");







    private static final SubLSymbol SKS_GET_TOP_SKS = makeSymbol("SKS-GET-TOP-SKS");

    private static final SubLString $str36$too_many_possible_skss_for_conten = makeString("too many possible skss for content-mt ~A");

    private static final SubLObject $const37$StructuredKnowledgeSource_TopLeve = reader_make_constant_shell("StructuredKnowledgeSource-TopLevel");

    private static final SubLSymbol $sym38$FORT_NAME_ = makeSymbol("FORT-NAME<");

    private static final SubLObject $$rowCount_SKS = reader_make_constant_shell("rowCount-SKS");



    private static final SubLObject $const42$SKSISupportedStructuredKnowledgeS = reader_make_constant_shell("SKSISupportedStructuredKnowledgeSourceType");

    private static final SubLList $list43 = list(reader_make_constant_shell("Database-Physical"), reader_make_constant_shell("sqlProgramForSKS"));

    private static final SubLSymbol SKS_SUBTYPE_P = makeSymbol("SKS-SUBTYPE-P");

    // Definitions
    public static final SubLObject sks_p_alt(SubLObject sks) {
        return makeBoolean((NIL != forts.fort_p(sks)) && (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource)));
    }

    // Definitions
    public static SubLObject sks_p(final SubLObject sks) {
        return makeBoolean((NIL != forts.fort_p(sks)) && (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource)));
    }

    public static final SubLObject sks_complex_p_alt(SubLObject sks) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(sks)) && ((NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_atomic_p(sks)) || (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource_Complex))));
    }

    public static SubLObject sks_complex_p(final SubLObject sks) {
        return makeBoolean((NIL != sks_p(sks)) && ((NIL == sks_atomic_p(sks)) || (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource_Complex))));
    }

    public static final SubLObject sks_atomic_p_alt(SubLObject sks) {
        return makeBoolean((NIL != forts.fort_p(sks)) && (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource_Atomic)));
    }

    public static SubLObject sks_atomic_p(final SubLObject sks) {
        return makeBoolean((NIL != forts.fort_p(sks)) && (NIL != isa.isa_in_any_mtP(sks, $$StructuredKnowledgeSource_Atomic)));
    }

    public static final SubLObject new_sks_alt(SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject sks_type) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        if (sks_type == UNPROVIDED) {
            sks_type = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym3$NON_EMPTY_STRING_);
        if (NIL != super_sks) {
            SubLTrampolineFile.checkType(super_sks, SKS_COMPLEX_P);
        }
        if (NIL != defining_mt) {
            SubLTrampolineFile.checkType(defining_mt, HLMT_P);
        }
        if (NIL != sks_type) {
            SubLTrampolineFile.checkType(sks_type, SKS_TYPE_P);
        }
        {
            SubLObject sks_description = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.make_new_sks_description(sks_name, super_sks);
            SubLObject sks_constant_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.make_new_sks_constant_name(sks_name, super_sks);
            SubLObject sks = sksi_kb_accessors.sksi_find_or_create(sks_constant_name);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource), $$UniversalVocabularyMt);
            if (NIL == hlmt.hlmt_p(defining_mt)) {
                defining_mt = (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(super_sks)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_defining_mt(super_sks, UNPROVIDED))) : NIL;
                if (NIL == hlmt.hlmt_p(defining_mt)) {
                    defining_mt = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.make_sks_legacy_mapping_mt(sks);
                    if (NIL == hlmt.hlmt_p(defining_mt)) {
                        Errors.error($str_alt9$No_defining_mt_found_);
                    }
                }
            }
            if (NIL != sks) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$definingMt, sks, defining_mt), $$BaseKB);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, defining_mt, $$Microtheory), $$UniversalVocabularyMt);
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(super_sks)) {
                    sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(sks, super_sks);
                    {
                        SubLObject super_sks_type = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_type(super_sks);
                        if (((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_type_p(super_sks_type)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_type_p(sks_type))) && (!super_sks_type.equal(sks_type))) {
                            Errors.error($str_alt13$Given_sks_type__A_conflicts_with_, super_sks_type, sks_type);
                        } else {
                            if (NIL == sks_type) {
                                sks_type = super_sks_type;
                            }
                        }
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_type_p(sks_type)) {
                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_set_type(sks, sks_type);
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
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        if (((NIL != super_sks) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        if (((NIL != defining_mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(defining_mt))) {
            throw new AssertionError(defining_mt);
        }
        if (((NIL != sks_type) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_type_p(sks_type))) {
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

    public static final SubLObject new_sks_complex_alt(SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject sks_type) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        if (sks_type == UNPROVIDED) {
            sks_type = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym3$NON_EMPTY_STRING_);
        if (NIL != super_sks) {
            SubLTrampolineFile.checkType(super_sks, SKS_COMPLEX_P);
        }
        if (NIL != defining_mt) {
            SubLTrampolineFile.checkType(defining_mt, HLMT_P);
        }
        if (NIL != sks_type) {
            SubLTrampolineFile.checkType(sks_type, SKS_TYPE_P);
        }
        {
            SubLObject sks = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.new_sks(sks_name, super_sks, defining_mt, sks_type);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource_Complex), $$UniversalVocabularyMt);
            return sks;
        }
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
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        if (((NIL != super_sks) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        if (((NIL != defining_mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(defining_mt))) {
            throw new AssertionError(defining_mt);
        }
        if (((NIL != sks_type) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_type_p(sks_type))) {
            throw new AssertionError(sks_type);
        }
        final SubLObject sks = new_sks(sks_name, super_sks, defining_mt, sks_type);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource_Complex), $$UniversalVocabularyMt);
        return sks;
    }

    public static final SubLObject new_sks_atomic_alt(SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym3$NON_EMPTY_STRING_);
        if (NIL != super_sks) {
            SubLTrampolineFile.checkType(super_sks, SKS_COMPLEX_P);
        }
        if (NIL != defining_mt) {
            SubLTrampolineFile.checkType(defining_mt, HLMT_P);
        }
        {
            SubLObject sks = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.new_sks(sks_name, super_sks, defining_mt, UNPROVIDED);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource_Atomic), $$UniversalVocabularyMt);
            return sks;
        }
    }

    public static SubLObject new_sks_atomic(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        if (((NIL != super_sks) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        if (((NIL != defining_mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(defining_mt))) {
            throw new AssertionError(defining_mt);
        }
        final SubLObject sks = new_sks(sks_name, super_sks, defining_mt, UNPROVIDED);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, sks, $$StructuredKnowledgeSource_Atomic), $$UniversalVocabularyMt);
        return sks;
    }

    public static final SubLObject destroy_sks_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return sksi_kb_accessors.sksi_kill(sks);
    }

    public static SubLObject destroy_sks(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return sksi_kb_accessors.sksi_kill(sks);
    }

    public static final SubLObject make_new_sks_description_alt(SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym3$NON_EMPTY_STRING_);
        if (NIL != super_sks) {
            SubLTrampolineFile.checkType(super_sks, SKS_P);
        }
        {
            SubLObject result = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(super_sks)) {
                result = cconcatenate($str_alt21$The__, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks_name), $str_alt22$__table_in___, format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_string(super_sks)), $str_alt23$_ });
            } else {
                result = cconcatenate($str_alt24$The_top_level_knowledge_source_fo, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks_name), $str_alt23$_ });
            }
            return result;
        }
    }

    public static SubLObject make_new_sks_description(final SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        if (((NIL != super_sks) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_p(super_sks))) {
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

    public static final SubLObject make_new_sks_constant_name_alt(SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym3$NON_EMPTY_STRING_);
        if (NIL != super_sks) {
            SubLTrampolineFile.checkType(super_sks, SKS_P);
        }
        {
            SubLObject result = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(super_sks)) {
                result = bunge(list(post_remove(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_string(super_sks), $str_alt25$_KS, UNPROVIDED), sks_name, $$$KS), CHAR_hyphen);
            } else {
                if (NIL != ends_with(sks_name, $str_alt25$_KS, UNPROVIDED)) {
                    result = make_valid_constant_name(sks_name, UNPROVIDED);
                } else {
                    result = cconcatenate(format_nil.format_nil_a_no_copy(make_valid_constant_name(sks_name, UNPROVIDED)), $str_alt25$_KS);
                }
            }
            return result;
        }
    }

    public static SubLObject make_new_sks_constant_name(final SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        if (((NIL != super_sks) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_p(super_sks))) {
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

    public static final SubLObject find_sks_alt(SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym3$NON_EMPTY_STRING_);
        if (NIL != super_sks) {
            SubLTrampolineFile.checkType(super_sks, SKS_COMPLEX_P);
        }
        {
            SubLObject sks_constant_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.make_new_sks_constant_name(sks_name, super_sks);
            return sksi_kb_accessors.sksi_find(sks_constant_name);
        }
    }

    public static SubLObject find_sks(final SubLObject sks_name, SubLObject super_sks) {
        if (super_sks == UNPROVIDED) {
            super_sks = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        if (((NIL != super_sks) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == sks_complex_p(super_sks))) {
            throw new AssertionError(super_sks);
        }
        final SubLObject sks_constant_name = make_new_sks_constant_name(sks_name, super_sks);
        return sksi_kb_accessors.sksi_find(sks_constant_name);
    }

    /**
     * MT the mt for the lookup.  Defaults to the defining-mt of the SKS, can also be specified as :all, but this is discouraged.
     */
    @LispMethod(comment = "MT the mt for the lookup.  Defaults to the defining-mt of the SKS, can also be specified as :all, but this is discouraged.")
    public static final SubLObject sks_get_alt(SubLObject sks, SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sks, SKS_P);
            SubLTrampolineFile.checkType(pred, FORT_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, HLMT_P);
            }
            if (NIL == mt) {
                mt = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_defining_mt(sks, T);
            }
            {
                SubLObject reverse_argsP = subl_promotions.memberP(pred, $sks_inverse_lookup_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject index_arg = (NIL != reverse_argsP) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                SubLObject gather_arg = (NIL != reverse_argsP) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                SubLObject result = NIL;
                if ((NIL == mt) || (mt == $ALL)) {
                    result = kb_mapping_utilities.pred_values_in_any_mt(sks, pred, index_arg, gather_arg, UNPROVIDED);
                } else {
                    result = kb_mapping_utilities.pred_values_in_mt(sks, pred, mt, index_arg, gather_arg, UNPROVIDED);
                }
                return result;
            }
        }
    }

    /**
     * MT the mt for the lookup.  Defaults to the defining-mt of the SKS, can also be specified as :all, but this is discouraged.
     */
    @LispMethod(comment = "MT the mt for the lookup.  Defaults to the defining-mt of the SKS, can also be specified as :all, but this is discouraged.")
    public static SubLObject sks_get(final SubLObject sks, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
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

    public static final SubLObject sks_fget_alt(SubLObject sks, SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject sks_get_results = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get(sks, pred, mt);
            if ((NIL != sks_get_results) && (NIL == list_utilities.singletonP(sks_get_results))) {
                Errors.warn($str_alt30$more_than_one__A_found_for__A__re, pred, sks);
            }
            return sks_get_results.first();
        }
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

    public static final SubLObject sks_fset_alt(SubLObject sks, SubLObject pred, SubLObject value, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == mt) {
            mt = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        }
        {
            SubLObject current_value = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(sks, pred, mt);
            SubLObject current_formula = make_binary_formula(pred, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_term(sks), current_value);
            SubLObject new_formula = make_binary_formula(pred, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_term(sks), value);
            sksi_kb_accessors.sksi_unassert(current_formula, mt);
            if (NIL != value) {
                return sksi_kb_accessors.sksi_assert_if_new(new_formula, mt);
            }
        }
        return NIL;
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

    public static final SubLObject sks_get_term_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return sks;
    }

    public static SubLObject sks_get_term(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return sks;
    }

    public static final SubLObject sks_get_name(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, UNPROVIDED);
    }

    public static SubLObject sks_get_name(final SubLObject sks, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$structuredKnowledgeSourceName;
        }
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        SubLObject result = sks_fget(sks, pred, UNPROVIDED);
        if (NIL == result) {
            result = $str31$;
        }
        return result;
    }

    public static final SubLObject sks_get_string_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return constants_high.constant_name(sks);
    }

    public static SubLObject sks_get_string(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return constants_high.constant_name(sks);
    }

    public static final SubLObject sks_get_type_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(sks, $$sksIsa, UNPROVIDED);
    }

    public static SubLObject sks_get_type(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return sks_fget(sks, $$sksIsa, UNPROVIDED);
    }

    public static final SubLObject sks_set_type_alt(SubLObject sks, SubLObject sks_type) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        SubLTrampolineFile.checkType(sks_type, SKS_TYPE_P);
        {
            SubLObject defining_mt = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
            if (NIL != hlmt.hlmt_p(defining_mt)) {
                {
                    SubLObject current_sks_type = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_type(sks);
                    if (!sks_type.equal(current_sks_type)) {
                        sksi_kb_accessors.sksi_unassert(make_binary_formula($$sksIsa, sks, current_sks_type), defining_mt);
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$sksIsa, sks, sks_type), defining_mt);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject sks_set_type(final SubLObject sks, final SubLObject sks_type) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        assert NIL != sks_type_p(sks_type) : "! sksi_sks_accessors.sks_type_p(sks_type) " + ("sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) ") + sks_type;
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

    public static final SubLObject sks_get_subtype_alt(SubLObject sks, SubLObject sks_type) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        SubLTrampolineFile.checkType(sks_type, SKS_TYPE_P);
        {
            SubLObject pred = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_type_get_subtype_pred(sks_type);
            SubLObject result = (NIL != pred) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(sks, pred, UNPROVIDED))) : NIL;
            if (NIL != forts.fort_p(result)) {
                return result;
            }
        }
        {
            SubLObject super_sks = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_super_sks(sks);
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(super_sks)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_subtype(super_sks, sks_type);
            }
        }
        return NIL;
    }

    public static SubLObject sks_get_subtype(final SubLObject sks, final SubLObject sks_type) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        assert NIL != sks_type_p(sks_type) : "! sksi_sks_accessors.sks_type_p(sks_type) " + ("sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) ") + sks_type;
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

    public static final SubLObject sks_get_super_sks_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return kb_mapping_utilities.fpred_value_in_any_mt(sks, $$subKS_Direct, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject sks_get_super_sks(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return kb_mapping_utilities.fpred_value_in_any_mt(sks, $$subKS_Direct, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    /**
     * if strict-definition? is true we don't try to use the legacy-mapping-mt.  this avoids some infinite loops in some cases (e.g. when called from sks-get)
     */
    @LispMethod(comment = "if strict-definition? is true we don\'t try to use the legacy-mapping-mt.  this avoids some infinite loops in some cases (e.g. when called from sks-get)")
    public static final SubLObject sks_get_defining_mt_alt(SubLObject sks, SubLObject strict_definitionP) {
        if (strict_definitionP == UNPROVIDED) {
            strict_definitionP = NIL;
        }
        SubLTrampolineFile.checkType(sks, SKS_P);
        {
            SubLObject defining_mt = kb_mapping_utilities.fpred_value_in_mt(sks, $$definingMt, $$BaseKB, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            if (NIL != hlmt.hlmt_p(defining_mt)) {
                return defining_mt;
            }
        }
        if (NIL != strict_definitionP) {
            return NIL;
        }
        {
            SubLObject legacy_mapping_mt = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_top_sks(sks), $$mappingMt, UNPROVIDED);
            if (NIL != hlmt.hlmt_p(legacy_mapping_mt)) {
                return legacy_mapping_mt;
            }
        }
        return NIL;
    }

    /**
     * if strict-definition? is true we don't try to use the legacy-mapping-mt.  this avoids some infinite loops in some cases (e.g. when called from sks-get)
     */
    @LispMethod(comment = "if strict-definition? is true we don\'t try to use the legacy-mapping-mt.  this avoids some infinite loops in some cases (e.g. when called from sks-get)")
    public static SubLObject sks_get_defining_mt(final SubLObject sks, SubLObject strict_definitionP) {
        if (strict_definitionP == UNPROVIDED) {
            strict_definitionP = NIL;
        }
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
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

    public static final SubLObject sks_get_content_mt_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(sks, $$contentMt, UNPROVIDED);
    }

    public static SubLObject sks_get_content_mt(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return sks_fget(sks, $$contentMt, UNPROVIDED);
    }

    public static final SubLObject find_sks_by_content_mt_alt(SubLObject content_mt) {
        SubLTrampolineFile.checkType(content_mt, HLMT_P);
        {
            SubLObject skss = kb_mapping_utilities.pred_values_in_any_mt(content_mt, $$contentMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject sks_tops = Mapping.mapcar(SKS_GET_TOP_SKS, skss);
            if (length(sks_tops).numG(ONE_INTEGER)) {
                Errors.warn($str_alt35$too_many_possible_skss_for_conten, content_mt);
            }
            return sks_tops.first();
        }
    }

    public static SubLObject find_sks_by_content_mt(final SubLObject content_mt) {
        assert NIL != hlmt.hlmt_p(content_mt) : "! hlmt.hlmt_p(content_mt) " + ("hlmt.hlmt_p(content_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(content_mt) ") + content_mt;
        final SubLObject skss = kb_mapping_utilities.pred_values_in_any_mt(content_mt, $$contentMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject sks_tops = Mapping.mapcar(SKS_GET_TOP_SKS, skss);
        if (length(sks_tops).numG(ONE_INTEGER)) {
            Errors.warn($str36$too_many_possible_skss_for_conten, content_mt);
        }
        return sks_tops.first();
    }

    public static final SubLObject get_all_skss_alt() {
        {
            SubLObject skss = isa.all_fort_instances_in_all_mts($const36$StructuredKnowledgeSource_TopLeve);
            return Sort.sort(skss, $sym37$FORT_NAME_, UNPROVIDED);
        }
    }

    public static SubLObject get_all_skss() {
        final SubLObject skss = isa.all_fort_instances_in_all_mts($const37$StructuredKnowledgeSource_TopLeve);
        return Sort.sort(skss, $sym38$FORT_NAME_, UNPROVIDED);
    }

    public static final SubLObject sks_get_connection_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return sks;
    }

    public static SubLObject sks_get_connection(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return sks;
    }

    public static final SubLObject sks_get_row_count_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_fget(sks, $$rowCount_SKS, UNPROVIDED);
    }

    public static SubLObject sks_get_row_count(final SubLObject sks) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        return sks_fget(sks, $$rowCount_SKS, UNPROVIDED);
    }

    public static final SubLObject sks_set_row_count_alt(SubLObject sks, SubLObject row_count) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        SubLTrampolineFile.checkType(row_count, NUMBERP);
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$rowCount_SKS, sks, round(row_count, UNPROVIDED)), com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED));
    }

    public static SubLObject sks_set_row_count(final SubLObject sks, final SubLObject row_count) {
        assert NIL != sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        assert NIL != numberp(row_count) : "! numberp(row_count) " + ("Types.numberp(row_count) " + "CommonSymbols.NIL != Types.numberp(row_count) ") + row_count;
        return sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$rowCount_SKS, sks, round(row_count, UNPROVIDED)), sks_get_defining_mt(sks, UNPROVIDED));
    }

    static private final SubLString $str_alt9$No_defining_mt_found_ = makeString("No defining mt found!");

    public static final SubLObject sks_get_top_sks_alt(SubLObject sks) {
        {
            SubLObject super_sks = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_super_sks(sks);
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p(super_sks)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_get_top_sks(super_sks);
            } else {
                return sks;
            }
        }
    }

    public static SubLObject sks_get_top_sks(final SubLObject sks) {
        final SubLObject super_sks = sks_get_super_sks(sks);
        if (NIL != sks_p(super_sks)) {
            return sks_get_top_sks(super_sks);
        }
        return sks;
    }

    public static final SubLObject make_sks_legacy_mapping_mt_alt(SubLObject sks) {
        {
            SubLObject mt_formula = make_unary_nat_formula($$MappingMtFn, sks);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$mappingMt, sks, mt_formula), $$UniversalVocabularyMt);
            return sksi_kb_accessors.sksi_find_nart(mt_formula);
        }
    }

    public static SubLObject make_sks_legacy_mapping_mt(final SubLObject sks) {
        final SubLObject mt_formula = make_unary_nat_formula($$MappingMtFn, sks);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$mappingMt, sks, mt_formula), $$UniversalVocabularyMt);
        return sksi_kb_accessors.sksi_find_nart(mt_formula);
    }

    static private final SubLString $str_alt13$Given_sks_type__A_conflicts_with_ = makeString("Given sks-type ~A conflicts with super-sks-type ~A");

    public static final SubLObject sks_type_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && ((NIL == kb_loaded()) || (NIL != isa.isa_in_any_mtP(v_object, $const41$SKSISupportedStructuredKnowledgeS))));
    }

    public static SubLObject sks_type_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && ((NIL == kb_loaded()) || (NIL != isa.isa_in_any_mtP(v_object, $const42$SKSISupportedStructuredKnowledgeS))));
    }

    public static final SubLObject sks_type_get_name_alt(SubLObject sks_type) {
        SubLTrampolineFile.checkType(sks_type, SKS_TYPE_P);
        return constants_high.constant_name(sks_type);
    }

    public static SubLObject sks_type_get_name(final SubLObject sks_type) {
        assert NIL != sks_type_p(sks_type) : "! sksi_sks_accessors.sks_type_p(sks_type) " + ("sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) ") + sks_type;
        return constants_high.constant_name(sks_type);
    }

    public static final SubLObject sks_type_get_subtype_pred_alt(SubLObject sks_type) {
        SubLTrampolineFile.checkType(sks_type, SKS_TYPE_P);
        return getf($sks_type_to_subtype_pred_plist$.getGlobalValue(), sks_type, UNPROVIDED);
    }

    public static SubLObject sks_type_get_subtype_pred(final SubLObject sks_type) {
        assert NIL != sks_type_p(sks_type) : "! sksi_sks_accessors.sks_type_p(sks_type) " + ("sksi_sks_accessors.sks_type_p(sks_type) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_type_p(sks_type) ") + sks_type;
        return getf($sks_type_to_subtype_pred_plist$.getGlobalValue(), sks_type, UNPROVIDED);
    }

    static private final SubLString $str_alt21$The__ = makeString("The \"");

    static private final SubLString $str_alt22$__table_in___ = makeString("\" table in #$");

    static private final SubLString $str_alt23$_ = makeString(".");

    static private final SubLString $str_alt24$The_top_level_knowledge_source_fo = makeString("The top-level knowledge source for the ");

    public static final SubLObject sks_subtype_p_alt(SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    public static SubLObject sks_subtype_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    static private final SubLString $str_alt25$_KS = makeString("-KS");

    public static final SubLObject sks_subtype_get_name_alt(SubLObject sks_subtype) {
        SubLTrampolineFile.checkType(sks_subtype, SKS_SUBTYPE_P);
        return constants_high.constant_name(sks_subtype);
    }

    public static SubLObject sks_subtype_get_name(final SubLObject sks_subtype) {
        assert NIL != sks_subtype_p(sks_subtype) : "! sksi_sks_accessors.sks_subtype_p(sks_subtype) " + ("sksi_sks_accessors.sks_subtype_p(sks_subtype) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_subtype_p(sks_subtype) ") + sks_subtype;
        return constants_high.constant_name(sks_subtype);
    }

    static private final SubLList $list_alt27 = list(reader_make_constant_shell("physicalSchemaSourceMap"));

    static private final SubLString $str_alt30$more_than_one__A_found_for__A__re = makeString("more than one ~A found for ~A, returning only one.");

    public static final SubLObject declare_sksi_sks_accessors_file_alt() {
        declareFunction("sks_p", "SKS-P", 1, 0, false);
        declareFunction("sks_complex_p", "SKS-COMPLEX-P", 1, 0, false);
        declareFunction("sks_atomic_p", "SKS-ATOMIC-P", 1, 0, false);
        declareFunction("new_sks", "NEW-SKS", 1, 3, false);
        declareFunction("new_sks_complex", "NEW-SKS-COMPLEX", 1, 3, false);
        declareFunction("new_sks_atomic", "NEW-SKS-ATOMIC", 1, 2, false);
        declareFunction("destroy_sks", "DESTROY-SKS", 1, 0, false);
        declareFunction("make_new_sks_description", "MAKE-NEW-SKS-DESCRIPTION", 1, 1, false);
        declareFunction("make_new_sks_constant_name", "MAKE-NEW-SKS-CONSTANT-NAME", 1, 1, false);
        declareFunction("find_sks", "FIND-SKS", 1, 1, false);
        declareFunction("sks_get", "SKS-GET", 2, 1, false);
        declareFunction("sks_fget", "SKS-FGET", 2, 1, false);
        declareFunction("sks_fset", "SKS-FSET", 3, 1, false);
        declareFunction("sks_get_term", "SKS-GET-TERM", 1, 0, false);
        declareFunction("sks_get_name", "SKS-GET-NAME", 1, 0, false);
        declareFunction("sks_get_string", "SKS-GET-STRING", 1, 0, false);
        declareFunction("sks_get_type", "SKS-GET-TYPE", 1, 0, false);
        declareFunction("sks_set_type", "SKS-SET-TYPE", 2, 0, false);
        declareFunction("sks_get_subtype", "SKS-GET-SUBTYPE", 2, 0, false);
        declareFunction("sks_get_super_sks", "SKS-GET-SUPER-SKS", 1, 0, false);
        declareFunction("sks_get_defining_mt", "SKS-GET-DEFINING-MT", 1, 1, false);
        declareFunction("sks_get_content_mt", "SKS-GET-CONTENT-MT", 1, 0, false);
        declareFunction("find_sks_by_content_mt", "FIND-SKS-BY-CONTENT-MT", 1, 0, false);
        declareFunction("get_all_skss", "GET-ALL-SKSS", 0, 0, false);
        declareFunction("sks_get_connection", "SKS-GET-CONNECTION", 1, 0, false);
        declareFunction("sks_get_row_count", "SKS-GET-ROW-COUNT", 1, 0, false);
        declareFunction("sks_set_row_count", "SKS-SET-ROW-COUNT", 2, 0, false);
        declareFunction("sks_get_top_sks", "SKS-GET-TOP-SKS", 1, 0, false);
        declareFunction("make_sks_legacy_mapping_mt", "MAKE-SKS-LEGACY-MAPPING-MT", 1, 0, false);
        declareFunction("sks_type_p", "SKS-TYPE-P", 1, 0, false);
        declareFunction("sks_type_get_name", "SKS-TYPE-GET-NAME", 1, 0, false);
        declareFunction("sks_type_get_subtype_pred", "SKS-TYPE-GET-SUBTYPE-PRED", 1, 0, false);
        declareFunction("sks_subtype_p", "SKS-SUBTYPE-P", 1, 0, false);
        declareFunction("sks_subtype_get_name", "SKS-SUBTYPE-GET-NAME", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_sksi_sks_accessors_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("sks_p", "SKS-P", 1, 0, false);
            declareFunction("sks_complex_p", "SKS-COMPLEX-P", 1, 0, false);
            declareFunction("sks_atomic_p", "SKS-ATOMIC-P", 1, 0, false);
            declareFunction("new_sks", "NEW-SKS", 1, 3, false);
            declareFunction("new_sks_complex", "NEW-SKS-COMPLEX", 1, 3, false);
            declareFunction("new_sks_atomic", "NEW-SKS-ATOMIC", 1, 2, false);
            declareFunction("destroy_sks", "DESTROY-SKS", 1, 0, false);
            declareFunction("make_new_sks_description", "MAKE-NEW-SKS-DESCRIPTION", 1, 1, false);
            declareFunction("make_new_sks_constant_name", "MAKE-NEW-SKS-CONSTANT-NAME", 1, 1, false);
            declareFunction("find_sks", "FIND-SKS", 1, 1, false);
            declareFunction("sks_get", "SKS-GET", 2, 1, false);
            declareFunction("sks_fget", "SKS-FGET", 2, 1, false);
            declareFunction("sks_fset", "SKS-FSET", 3, 1, false);
            declareFunction("sks_get_term", "SKS-GET-TERM", 1, 0, false);
            declareFunction("sks_get_name", "SKS-GET-NAME", 1, 1, false);
            declareFunction("sks_get_string", "SKS-GET-STRING", 1, 0, false);
            declareFunction("sks_get_type", "SKS-GET-TYPE", 1, 0, false);
            declareFunction("sks_set_type", "SKS-SET-TYPE", 2, 0, false);
            declareFunction("sks_get_subtype", "SKS-GET-SUBTYPE", 2, 0, false);
            declareFunction("sks_get_super_sks", "SKS-GET-SUPER-SKS", 1, 0, false);
            declareFunction("sks_get_defining_mt", "SKS-GET-DEFINING-MT", 1, 1, false);
            declareFunction("sks_get_content_mt", "SKS-GET-CONTENT-MT", 1, 0, false);
            declareFunction("find_sks_by_content_mt", "FIND-SKS-BY-CONTENT-MT", 1, 0, false);
            declareFunction("get_all_skss", "GET-ALL-SKSS", 0, 0, false);
            declareFunction("sks_get_connection", "SKS-GET-CONNECTION", 1, 0, false);
            declareFunction("sks_get_row_count", "SKS-GET-ROW-COUNT", 1, 0, false);
            declareFunction("sks_set_row_count", "SKS-SET-ROW-COUNT", 2, 0, false);
            declareFunction("sks_get_top_sks", "SKS-GET-TOP-SKS", 1, 0, false);
            declareFunction("make_sks_legacy_mapping_mt", "MAKE-SKS-LEGACY-MAPPING-MT", 1, 0, false);
            declareFunction("sks_type_p", "SKS-TYPE-P", 1, 0, false);
            declareFunction("sks_type_get_name", "SKS-TYPE-GET-NAME", 1, 0, false);
            declareFunction("sks_type_get_subtype_pred", "SKS-TYPE-GET-SUBTYPE-PRED", 1, 0, false);
            declareFunction("sks_subtype_p", "SKS-SUBTYPE-P", 1, 0, false);
            declareFunction("sks_subtype_get_name", "SKS-SUBTYPE-GET-NAME", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("sks_get_name", "SKS-GET-NAME", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_sks_accessors_file_Previous() {
        declareFunction("sks_p", "SKS-P", 1, 0, false);
        declareFunction("sks_complex_p", "SKS-COMPLEX-P", 1, 0, false);
        declareFunction("sks_atomic_p", "SKS-ATOMIC-P", 1, 0, false);
        declareFunction("new_sks", "NEW-SKS", 1, 3, false);
        declareFunction("new_sks_complex", "NEW-SKS-COMPLEX", 1, 3, false);
        declareFunction("new_sks_atomic", "NEW-SKS-ATOMIC", 1, 2, false);
        declareFunction("destroy_sks", "DESTROY-SKS", 1, 0, false);
        declareFunction("make_new_sks_description", "MAKE-NEW-SKS-DESCRIPTION", 1, 1, false);
        declareFunction("make_new_sks_constant_name", "MAKE-NEW-SKS-CONSTANT-NAME", 1, 1, false);
        declareFunction("find_sks", "FIND-SKS", 1, 1, false);
        declareFunction("sks_get", "SKS-GET", 2, 1, false);
        declareFunction("sks_fget", "SKS-FGET", 2, 1, false);
        declareFunction("sks_fset", "SKS-FSET", 3, 1, false);
        declareFunction("sks_get_term", "SKS-GET-TERM", 1, 0, false);
        declareFunction("sks_get_name", "SKS-GET-NAME", 1, 1, false);
        declareFunction("sks_get_string", "SKS-GET-STRING", 1, 0, false);
        declareFunction("sks_get_type", "SKS-GET-TYPE", 1, 0, false);
        declareFunction("sks_set_type", "SKS-SET-TYPE", 2, 0, false);
        declareFunction("sks_get_subtype", "SKS-GET-SUBTYPE", 2, 0, false);
        declareFunction("sks_get_super_sks", "SKS-GET-SUPER-SKS", 1, 0, false);
        declareFunction("sks_get_defining_mt", "SKS-GET-DEFINING-MT", 1, 1, false);
        declareFunction("sks_get_content_mt", "SKS-GET-CONTENT-MT", 1, 0, false);
        declareFunction("find_sks_by_content_mt", "FIND-SKS-BY-CONTENT-MT", 1, 0, false);
        declareFunction("get_all_skss", "GET-ALL-SKSS", 0, 0, false);
        declareFunction("sks_get_connection", "SKS-GET-CONNECTION", 1, 0, false);
        declareFunction("sks_get_row_count", "SKS-GET-ROW-COUNT", 1, 0, false);
        declareFunction("sks_set_row_count", "SKS-SET-ROW-COUNT", 2, 0, false);
        declareFunction("sks_get_top_sks", "SKS-GET-TOP-SKS", 1, 0, false);
        declareFunction("make_sks_legacy_mapping_mt", "MAKE-SKS-LEGACY-MAPPING-MT", 1, 0, false);
        declareFunction("sks_type_p", "SKS-TYPE-P", 1, 0, false);
        declareFunction("sks_type_get_name", "SKS-TYPE-GET-NAME", 1, 0, false);
        declareFunction("sks_type_get_subtype_pred", "SKS-TYPE-GET-SUBTYPE-PRED", 1, 0, false);
        declareFunction("sks_subtype_p", "SKS-SUBTYPE-P", 1, 0, false);
        declareFunction("sks_subtype_get_name", "SKS-SUBTYPE-GET-NAME", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt35$too_many_possible_skss_for_conten = makeString("too many possible skss for content-mt ~A");

    public static final SubLObject $const36$StructuredKnowledgeSource_TopLeve = reader_make_constant_shell("StructuredKnowledgeSource-TopLevel");

    static private final SubLSymbol $sym37$FORT_NAME_ = makeSymbol("FORT-NAME<");

    public static final SubLObject $const41$SKSISupportedStructuredKnowledgeS = reader_make_constant_shell("SKSISupportedStructuredKnowledgeSourceType");

    static private final SubLList $list_alt42 = list(reader_make_constant_shell("Database-Physical"), reader_make_constant_shell("sqlProgramForSKS"));

    public static final SubLObject init_sksi_sks_accessors_file_alt() {
        defparameter("*SKS-INVERSE-LOOKUP-PREDS*", $list_alt27);
        deflexical("*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*", $list_alt42);
        return NIL;
    }

    public static SubLObject init_sksi_sks_accessors_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SKS-INVERSE-LOOKUP-PREDS*", $list27);
            deflexical("*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*", $list43);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*", $list_alt42);
        }
        return NIL;
    }

    public static SubLObject init_sksi_sks_accessors_file_Previous() {
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

    static {
    }
}

/**
 * Total time: 209 ms synthetic
 */
