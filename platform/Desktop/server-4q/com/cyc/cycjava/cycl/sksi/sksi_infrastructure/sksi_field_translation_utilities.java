package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_field_translation_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities";
    public static final String myFingerPrint = "0faa8c376b31e47693c38aa53a1f044df6d4e565b1160e0756bb7d64cc4246f5";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym2$GAF_ARGS;
    private static final SubLSymbol $sym3$PHYSICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $sym4$LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF;
    private static final SubLObject $const7$logicalFieldDecoding;
    private static final SubLSymbol $kw8$GAF;
    private static final SubLSymbol $kw9$TRUE;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLObject $const12$logicalFieldEncoding;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$RELEVANT_FIELD_DECODINGS;
    private static final SubLSymbol $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL;
    private static final SubLObject $const17$fieldDecoding;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$GET_FIELD_DECODING_FROM_GAF;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$RELEVANT_FIELD_ENCODINGS;
    private static final SubLSymbol $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD;
    private static final SubLSymbol $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL;
    private static final SubLObject $const25$fieldEncoding;
    private static final SubLList $list26;
    private static final SubLInteger $int27$100;
    private static final SubLSymbol $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLObject $const31$physicalFieldDecoding;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLObject $const34$physicalFieldEncoding;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P;
    private static final SubLSymbol $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P;
    private static final SubLSymbol $sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P;
    private static final SubLSymbol $kw39$SKSI_MISSING_DECODINGS;
    private static final SubLSymbol $kw40$SKSI_MISSING_ENCODINGS;
    private static final SubLString $str41$__SKSI__A_;
    private static final SubLString $str42$Decoding_loop___a_;
    private static final SubLSymbol $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL;
    private static final SubLString $str44$Encoding_loop___a_;
    private static final SubLSymbol $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL;
    private static final SubLSymbol $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED;
    private static final SubLSymbol $sym47$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P;
    private static final SubLSymbol $kw48$ENCODE;
    private static final SubLSymbol $kw49$DECODE;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym52$RELEVANT_PRED_IS_EQ;
    private static final SubLObject $const53$meaningSentenceOfSchema;
    private static final SubLString $str54$No_meaning_sentence_for__S;
    private static final SubLSymbol $kw55$PRED;
    private static final SubLSymbol $kw56$NO_NAME;
    private static final SubLString $str57$failure_on_name_for__S;
    private static final SubLSymbol $kw58$NO_VALUE;
    private static final SubLString $str59$failure_on_value_for__S;
    private static final SubLString $str60$No_physical_field_for__S;
    private static final SubLSymbol $sym61$INDEXICAL_FOR_LOGICAL_FIELD;
    private static final SubLSymbol $sym62$_PRED;
    private static final SubLString $str63$More_than_one_meaning_sentence_pr;
    private static final SubLString $str64$Meaning_sentence_not_found_for__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 1328L)
    public static SubLObject get_field_translation_from_gaf(final SubLObject field_translation_gaf) {
        return assertions_high.gaf_arg4(field_translation_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 1532L)
    public static SubLObject destructure_field_translation_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject to_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject to_field = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject from_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject field_translation = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list0);
        to_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list0);
        to_field = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list0);
        from_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list0);
        field_translation = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject field_translation_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list0);
            field_translation_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym1$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(to_schema, to_field, from_schema, field_translation), (SubLObject)ConsesLow.list((SubLObject)sksi_field_translation_utilities.$sym2$GAF_ARGS, field_translation_gaf), ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list0);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 1836L)
    public static SubLObject field_translation_fields(final SubLObject field_translation, final SubLObject test) {
        return cycl_utilities.expression_gather(field_translation, test, (SubLObject)sksi_field_translation_utilities.T, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.IDENTITY), (SubLObject)sksi_field_translation_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2044L)
    public static SubLObject decoding_physical_field_indexicals(final SubLObject decoding) {
        return field_translation_fields(decoding, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2240L)
    public static SubLObject decoding_physical_field_indexicals_ordered(final SubLObject decoding) {
        final SubLObject reconstructed_decoding = sksi_reconstruct_decoding(decoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        return list_utilities.tree_gather_ordered(reconstructed_decoding, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.IDENTITY), (SubLObject)sksi_field_translation_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2577L)
    public static SubLObject encoding_logical_fields(final SubLObject encoding) {
        return sksi_kb_accessors.logical_fields_for_indexicals(encoding_logical_field_indexicals(encoding));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2763L)
    public static SubLObject encoding_logical_field_indexicals(final SubLObject encoding) {
        return field_translation_fields(encoding, (SubLObject)sksi_field_translation_utilities.$sym4$LOGICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2955L)
    public static SubLObject encoding_logical_fields_ordered(final SubLObject encoding) {
        final SubLObject reconstructed_encoding = sksi_reconstruct_encoding(encoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        final SubLObject logical_field_indexicals = list_utilities.tree_gather_ordered(reconstructed_encoding, (SubLObject)sksi_field_translation_utilities.$sym4$LOGICAL_FIELD_INDEXICAL_P, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.IDENTITY), (SubLObject)sksi_field_translation_utilities.NIL);
        return sksi_kb_accessors.logical_fields_for_indexicals(logical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 3355L)
    public static SubLObject get_logical_field_decoding_from_gaf(final SubLObject logical_field_decoding_gaf) {
        return get_field_translation_from_gaf(logical_field_decoding_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 3603L)
    public static SubLObject destructure_logical_field_decoding_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject logical_field_decoding = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list5);
        to_logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list5);
        logical_field = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list5);
        from_logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list5);
        logical_field_decoding = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject logical_field_decoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list5);
            logical_field_decoding_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, (SubLObject)ConsesLow.list(to_logical_schema, logical_field, from_logical_schema, logical_field_decoding), logical_field_decoding_gaf, ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list5);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 3984L)
    public static SubLObject logical_field_decoding_logical_field_indexicals(final SubLObject logical_field_decoding) {
        return field_translation_fields(logical_field_decoding, (SubLObject)sksi_field_translation_utilities.$sym4$LOGICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 4232L)
    public static SubLObject get_logical_field_decoding_gafs_for_logical_field(final SubLObject logical_field, SubLObject logical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject logical_field_indexical = sksi_kb_accessors.indexical_for_logical_field(logical_field);
        return get_logical_field_decoding_gafs_for_logical_field_indexical(logical_field_indexical, logical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 4749L)
    public static SubLObject get_logical_field_decoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_field_decoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const7$logicalFieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$1 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$2 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$1) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$3) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        to_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        from_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (to_logical_field_indexical.eql(logical_field_indexical) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(to_logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(from_logical_schema, logical_schemata)) {
                                                logical_field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, logical_field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        }
                                    }
                                    done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$3);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const7$logicalFieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$2 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$3 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$2) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                    final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$4) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        to_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        from_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (to_logical_field_indexical.eql(logical_field_indexical)) {
                                                logical_field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, logical_field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list10);
                                        }
                                    }
                                    done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$4);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return logical_field_decoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 6091L)
    public static SubLObject get_logical_field_decodings_for_logical_field(final SubLObject logical_field, SubLObject logical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject logical_field_decoding_gafs = get_logical_field_decoding_gafs_for_logical_field(logical_field, logical_schemata);
        SubLObject logical_field_decodings = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = logical_field_decoding_gafs;
        SubLObject logical_field_decoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        logical_field_decoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            logical_field_decodings = (SubLObject)ConsesLow.cons(get_logical_field_decoding_from_gaf(logical_field_decoding_gaf), logical_field_decodings);
            cdolist_list_var = cdolist_list_var.rest();
            logical_field_decoding_gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(list_utilities.fast_delete_duplicates(logical_field_decodings, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 6765L)
    public static SubLObject get_logical_field_encoding_from_gaf(final SubLObject logical_field_encoding_gaf) {
        return get_field_translation_from_gaf(logical_field_encoding_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7013L)
    public static SubLObject destructure_logical_field_encoding_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject logical_field_encoding = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list11);
        to_logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list11);
        logical_field = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list11);
        from_logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list11);
        logical_field_encoding = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject logical_field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list11);
            logical_field_encoding_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, (SubLObject)ConsesLow.list(to_logical_schema, logical_field, from_logical_schema, logical_field_encoding), logical_field_encoding_gaf, ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list11);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7394L)
    public static SubLObject logical_field_encoding_logical_field_indexicals(final SubLObject logical_field_encoding) {
        return field_translation_fields(logical_field_encoding, (SubLObject)sksi_field_translation_utilities.$sym4$LOGICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7630L)
    public static SubLObject logical_field_encoding_contains_logical_field_indexicalP(final SubLObject logical_field_encoding, final SubLObject logical_field_indexical) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(logical_field_indexical, logical_field_encoding, (SubLObject)sksi_field_translation_utilities.T, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7842L)
    public static SubLObject get_logical_field_encoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_field_encoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const12$logicalFieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$9 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$10 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$9) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                    final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$11) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        from_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (to_logical_field_indexical.eql(logical_field_indexical) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(to_logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(from_logical_schema, logical_schemata)) {
                                                logical_field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, logical_field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        }
                                    }
                                    done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$11);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const12$logicalFieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$10 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$11 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$10) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                    final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$12) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        from_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (to_logical_field_indexical.eql(logical_field_indexical)) {
                                                logical_field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, logical_field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        }
                                    }
                                    done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$12);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return logical_field_encoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 9185L)
    public static SubLObject get_logical_field_encoding_gafs_from_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_field_encoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const12$logicalFieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$17 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$18 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$17) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                    final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$19) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        from_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(to_logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(from_logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != logical_field_encoding_contains_logical_field_indexicalP(encoding, logical_field_indexical)) {
                                                logical_field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, logical_field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        }
                                    }
                                    done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$19);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const12$logicalFieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$18 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$19 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$18) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                    final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$20) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        from_logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != logical_field_encoding_contains_logical_field_indexicalP(encoding, logical_field_indexical)) {
                                                logical_field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, logical_field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list13);
                                        }
                                    }
                                    done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$20);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return logical_field_encoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 10649L)
    public static SubLObject get_field_decoding_from_gaf(final SubLObject field_decoding_gaf) {
        return sksi_reconstruct_decoding(get_field_translation_from_gaf(field_decoding_gaf), (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 10893L)
    public static SubLObject destructure_field_decoding_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject field_decoding = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list14);
        logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list14);
        logical_field = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list14);
        physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list14);
        field_decoding = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject field_decoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list14);
            field_decoding_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, (SubLObject)ConsesLow.list(logical_schema, logical_field, physical_schema, field_decoding), field_decoding_gaf, ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list14);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11208L)
    public static SubLObject field_decoding_physical_field_indexicals(final SubLObject field_decoding) {
        return field_translation_fields(field_decoding, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11425L)
    public static SubLObject field_decoding_contains_physical_field_indexicalP(final SubLObject decoding, final SubLObject physical_field) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(physical_field, decoding, (SubLObject)sksi_field_translation_utilities.T, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11584L)
    public static SubLObject field_decoding_contains_physical_field_indexicalsP(final SubLObject decoding, final SubLObject physical_fields) {
        SubLObject missingP = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == missingP) {
            SubLObject csome_list_var = physical_fields;
            SubLObject physical_field = (SubLObject)sksi_field_translation_utilities.NIL;
            physical_field = csome_list_var.first();
            while (sksi_field_translation_utilities.NIL == missingP && sksi_field_translation_utilities.NIL != csome_list_var) {
                if (sksi_field_translation_utilities.NIL == field_decoding_contains_physical_field_indexicalP(decoding, physical_field)) {
                    missingP = (SubLObject)sksi_field_translation_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                physical_field = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == missingP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11894L)
    public static SubLObject relevant_field_decodings_internal(final SubLObject logical_field, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject logical_field_indexical = sksi_kb_accessors.indexical_for_logical_field(logical_field);
        return relevant_field_decodings_for_indexical(logical_field_indexical, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11894L)
    public static SubLObject relevant_field_decodings(final SubLObject logical_field, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return relevant_field_decodings_internal(logical_field, logical_schema, physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym15$RELEVANT_FIELD_DECODINGS, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym15$RELEVANT_FIELD_DECODINGS, (SubLObject)sksi_field_translation_utilities.THREE_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQ, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym15$RELEVANT_FIELD_DECODINGS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_field, logical_schema, physical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schema.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && physical_schema.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_field_decodings_internal(logical_field, logical_schema, physical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field, logical_schema, physical_schema));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 12215L)
    public static SubLObject relevant_field_decodings_for_indexical_internal(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        return get_field_decodings_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 12215L)
    public static SubLObject relevant_field_decodings_for_indexical(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return relevant_field_decodings_for_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL, (SubLObject)sksi_field_translation_utilities.THREE_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_field_decodings_for_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 12488L)
    public static SubLObject get_field_decoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        SubLObject field_decoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            if (sksi_field_translation_utilities.NIL != physical_schemata) {
                final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$25 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$26 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$25) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                    final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$27) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata)) {
                                                field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        }
                                    }
                                    done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$27);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$26 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$27 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$26) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                    final SubLObject valid_$28 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$27.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$28) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        to_logical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata)) {
                                                field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                        }
                                    }
                                    done_var_$26 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$28);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                }
            }
        }
        else if (sksi_field_translation_utilities.NIL != physical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                while (sksi_field_translation_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_field_translation_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                            SubLObject done_var_$27 = (SubLObject)sksi_field_translation_utilities.NIL;
                            final SubLObject token_var_$28 = (SubLObject)sksi_field_translation_utilities.NIL;
                            while (sksi_field_translation_utilities.NIL == done_var_$27) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                final SubLObject valid_$29 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$28.eql(assertion));
                                if (sksi_field_translation_utilities.NIL != valid_$29) {
                                    SubLObject current;
                                    final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                    SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject to_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                    logical_schema = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                    to_logical_field_indexical = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                    physical_schema = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                    decoding = current.first();
                                    current = current.rest();
                                    if (sksi_field_translation_utilities.NIL == current) {
                                        if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata)) {
                                            field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list18);
                                    }
                                }
                                done_var_$27 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$29);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                while (sksi_field_translation_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_field_translation_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                            SubLObject done_var_$28 = (SubLObject)sksi_field_translation_utilities.NIL;
                            final SubLObject token_var_$29 = (SubLObject)sksi_field_translation_utilities.NIL;
                            while (sksi_field_translation_utilities.NIL == done_var_$28) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(assertion));
                                if (sksi_field_translation_utilities.NIL != valid_$30) {
                                    field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                }
                                done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$30);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_4);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                }
            }
        }
        return field_decoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 14463L)
    public static SubLObject get_field_decodings_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical);
        final SubLObject field_decoding_gafs = get_field_decoding_gafs_for_logical_field_indexical(logical_field_indexical_fort, logical_schemata, physical_schemata);
        return list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_field_translation_utilities.$sym19$GET_FIELD_DECODING_FROM_GAF, field_decoding_gafs), (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 15125L)
    public static SubLObject get_field_decoding_gafs_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject field_decoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            if (sksi_field_translation_utilities.NIL != physical_schemata) {
                final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        while (sksi_field_translation_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_field_translation_utilities.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                    SubLObject done_var_$37 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    final SubLObject token_var_$38 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    while (sksi_field_translation_utilities.NIL == done_var_$37) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                                        final SubLObject valid_$39 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$38.eql(assertion));
                                        if (sksi_field_translation_utilities.NIL != valid_$39) {
                                            SubLObject current;
                                            final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                            SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            logical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            logical_field = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            physical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            decoding = current.first();
                                            current = current.rest();
                                            if (sksi_field_translation_utilities.NIL == current) {
                                                if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != field_decoding_contains_physical_field_indexicalP(decoding, physical_field_indexical)) {
                                                    field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            }
                                        }
                                        done_var_$37 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$39);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else {
                final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        while (sksi_field_translation_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_field_translation_utilities.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                    SubLObject done_var_$38 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    final SubLObject token_var_$39 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    while (sksi_field_translation_utilities.NIL == done_var_$38) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                                        final SubLObject valid_$40 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$39.eql(assertion));
                                        if (sksi_field_translation_utilities.NIL != valid_$40) {
                                            SubLObject current;
                                            final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                            SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            logical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            logical_field = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            physical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            decoding = current.first();
                                            current = current.rest();
                                            if (sksi_field_translation_utilities.NIL == current) {
                                                if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != field_decoding_contains_physical_field_indexicalP(decoding, physical_field_indexical)) {
                                                    field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                            }
                                        }
                                        done_var_$38 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$40);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (sksi_field_translation_utilities.NIL != physical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$39 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$40 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$39) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                    final SubLObject valid_$41 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$40.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$41) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        logical_field = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != field_decoding_contains_physical_field_indexicalP(decoding, physical_field_indexical)) {
                                                field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        }
                                    }
                                    done_var_$39 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$41);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const17$fieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$40 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$41 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$40) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                    final SubLObject valid_$42 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$41.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$42) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject logical_field = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        logical_field = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != field_decoding_contains_physical_field_indexicalP(decoding, physical_field_indexical)) {
                                                field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list20);
                                        }
                                    }
                                    done_var_$40 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$42);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return field_decoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 17428L)
    public static SubLObject get_field_decodings_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject field_decoding_gafs = get_field_decoding_gafs_from_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
        return list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_field_translation_utilities.$sym19$GET_FIELD_DECODING_FROM_GAF, field_decoding_gafs), (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18018L)
    public static SubLObject get_field_encoding_from_gaf(final SubLObject field_encoding_gaf) {
        return sksi_reconstruct_encoding(get_field_translation_from_gaf(field_encoding_gaf), (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18260L)
    public static SubLObject destructure_field_encoding_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject field_encoding = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list21);
        physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list21);
        physical_field_indexical = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list21);
        logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list21);
        field_encoding = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list21);
            field_encoding_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, (SubLObject)ConsesLow.list(physical_schema, physical_field_indexical, logical_schema, field_encoding), field_encoding_gaf, ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list21);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18595L)
    public static SubLObject field_encoding_logical_field_indexicals(final SubLObject field_encoding) {
        return field_translation_fields(field_encoding, (SubLObject)sksi_field_translation_utilities.$sym4$LOGICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18808L)
    public static SubLObject isomorphic_field_encoding_p(final SubLObject field_encoding) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(field_encoding) || sksi_field_translation_utilities.NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(field_encoding));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19231L)
    public static SubLObject field_encoding_contains_logical_field_indexicalP(final SubLObject encoding, final SubLObject logical_field_indexical) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(logical_field_indexical, encoding, (SubLObject)sksi_field_translation_utilities.T, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19469L)
    public static SubLObject relevant_field_encodings_internal(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema) {
        return get_field_encodings_for_physical_field(physical_field, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19469L)
    public static SubLObject relevant_field_encodings(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return relevant_field_encodings_internal(physical_field, physical_schema, logical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym22$RELEVANT_FIELD_ENCODINGS, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym22$RELEVANT_FIELD_ENCODINGS, (SubLObject)sksi_field_translation_utilities.THREE_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQ, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym22$RELEVANT_FIELD_ENCODINGS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(physical_field, physical_schema, logical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_field.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (physical_schema.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && logical_schema.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_field_encodings_internal(physical_field, physical_schema, logical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_field, physical_schema, logical_schema));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19678L)
    public static SubLObject get_field_encoding_gafs_for_physical_field(final SubLObject physical_field, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
        return get_field_encoding_gafs_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20336L)
    public static SubLObject get_field_encodings_for_physical_field_internal(final SubLObject physical_field, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
        return get_field_encodings_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20336L)
    public static SubLObject get_field_encodings_for_physical_field(final SubLObject physical_field, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return get_field_encodings_for_physical_field_internal(physical_field, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD, (SubLObject)sksi_field_translation_utilities.THREE_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(physical_field, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_field.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_field_encodings_for_physical_field_internal(physical_field, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_field, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20833L)
    public static SubLObject get_field_encoding_gafs_for_physical_field_indexical_internal(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        SubLObject field_encoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            if (sksi_field_translation_utilities.NIL != physical_schemata) {
                final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$53 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$54 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$53) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$54);
                                    final SubLObject valid_$55 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$54.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$55) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        to_physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata)) {
                                                field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        }
                                    }
                                    done_var_$53 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$55);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$54 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$55 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$54) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$56) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        to_physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata)) {
                                                field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                        }
                                    }
                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$56);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                }
            }
        }
        else if (sksi_field_translation_utilities.NIL != physical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                while (sksi_field_translation_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_field_translation_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                            SubLObject done_var_$55 = (SubLObject)sksi_field_translation_utilities.NIL;
                            final SubLObject token_var_$56 = (SubLObject)sksi_field_translation_utilities.NIL;
                            while (sksi_field_translation_utilities.NIL == done_var_$55) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                final SubLObject valid_$57 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$56.eql(assertion));
                                if (sksi_field_translation_utilities.NIL != valid_$57) {
                                    SubLObject current;
                                    final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                    SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                    physical_schema = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                    to_physical_field_indexical = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                    logical_schema = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                    encoding = current.first();
                                    current = current.rest();
                                    if (sksi_field_translation_utilities.NIL == current) {
                                        if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata)) {
                                            field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list26);
                                    }
                                }
                                done_var_$55 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$57);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_field_indexical, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                while (sksi_field_translation_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_field_translation_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                            SubLObject done_var_$56 = (SubLObject)sksi_field_translation_utilities.NIL;
                            final SubLObject token_var_$57 = (SubLObject)sksi_field_translation_utilities.NIL;
                            while (sksi_field_translation_utilities.NIL == done_var_$56) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                final SubLObject valid_$58 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$57.eql(assertion));
                                if (sksi_field_translation_utilities.NIL != valid_$58) {
                                    field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                }
                                done_var_$56 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$58);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_field_translation_utilities.T);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_4);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                }
            }
        }
        return field_encoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20833L)
    public static SubLObject get_field_encoding_gafs_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return get_field_encoding_gafs_for_physical_field_indexical_internal(physical_field_indexical, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.THREE_INTEGER, (SubLObject)sksi_field_translation_utilities.$int27$100, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(physical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_field_encoding_gafs_for_physical_field_indexical_internal(physical_field_indexical, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_field_indexical, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 22873L)
    public static SubLObject get_field_encodings_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical_fort = sksi_kb_accessors.pfi_fort_for_pfi(physical_field_indexical);
        final SubLObject field_encoding_gafs = get_field_encoding_gafs_for_physical_field_indexical(physical_field_indexical_fort, logical_schemata, physical_schemata);
        SubLObject field_encodings = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = field_encoding_gafs;
        SubLObject field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        field_encoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            field_encodings = (SubLObject)ConsesLow.cons(get_field_encoding_from_gaf(field_encoding_gaf), field_encodings);
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding_gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(list_utilities.fast_delete_duplicates(field_encodings, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 23746L)
    public static SubLObject get_field_encoding_gafs_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (mt_info == sksi_field_translation_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject field_encoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != logical_schemata) {
            if (sksi_field_translation_utilities.NIL != physical_schemata) {
                final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        while (sksi_field_translation_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_field_translation_utilities.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                    SubLObject done_var_$65 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    final SubLObject token_var_$66 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    while (sksi_field_translation_utilities.NIL == done_var_$65) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                        final SubLObject valid_$67 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$66.eql(assertion));
                                        if (sksi_field_translation_utilities.NIL != valid_$67) {
                                            SubLObject current;
                                            final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                            SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            physical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            physical_field_indexical = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            logical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            encoding = current.first();
                                            current = current.rest();
                                            if (sksi_field_translation_utilities.NIL == current) {
                                                if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != field_encoding_contains_logical_field_indexicalP(encoding, logical_field_indexical)) {
                                                    field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            }
                                        }
                                        done_var_$65 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$67);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else {
                final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
                if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                        while (sksi_field_translation_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_field_translation_utilities.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                    SubLObject done_var_$66 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    final SubLObject token_var_$67 = (SubLObject)sksi_field_translation_utilities.NIL;
                                    while (sksi_field_translation_utilities.NIL == done_var_$66) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                        final SubLObject valid_$68 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$67.eql(assertion));
                                        if (sksi_field_translation_utilities.NIL != valid_$68) {
                                            SubLObject current;
                                            final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                            SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                            SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            physical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            physical_field_indexical = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            logical_schema = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            encoding = current.first();
                                            current = current.rest();
                                            if (sksi_field_translation_utilities.NIL == current) {
                                                if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_schema, logical_schemata) && sksi_field_translation_utilities.NIL != field_encoding_contains_logical_field_indexicalP(encoding, logical_field_indexical)) {
                                                    field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                            }
                                        }
                                        done_var_$66 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$68);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (sksi_field_translation_utilities.NIL != physical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$67 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$68 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$67) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                                    final SubLObject valid_$69 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$68.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$69) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != field_encoding_contains_logical_field_indexicalP(encoding, logical_field_indexical)) {
                                                field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        }
                                    }
                                    done_var_$67 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$69);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const25$fieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$68 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$69 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$68) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$69);
                                    final SubLObject valid_$70 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$69.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$70) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        logical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != field_encoding_contains_logical_field_indexicalP(encoding, logical_field_indexical)) {
                                                field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list29);
                                        }
                                    }
                                    done_var_$68 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$70);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return field_encoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 23746L)
    public static SubLObject get_field_encoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (mt_info == sksi_field_translation_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return get_field_encoding_gafs_for_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.FOUR_INTEGER, (SubLObject)sksi_field_translation_utilities.$int27$100, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (physical_schemata.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_field_encoding_gafs_for_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, logical_schemata, physical_schemata, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 26199L)
    public static SubLObject get_physical_field_decoding_from_gaf(final SubLObject physical_field_decoding_gaf) {
        return get_field_translation_from_gaf(physical_field_decoding_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 26451L)
    public static SubLObject destructure_physical_field_decoding_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject to_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject from_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject physical_field_decoding = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list30);
        to_physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list30);
        physical_field_indexical = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list30);
        from_physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list30);
        physical_field_decoding = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject physical_field_decoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list30);
            physical_field_decoding_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, (SubLObject)ConsesLow.list(to_physical_schema, physical_field_indexical, from_physical_schema, physical_field_decoding), physical_field_decoding_gaf, ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list30);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 26875L)
    public static SubLObject physical_field_decoding_physical_field_indexicals(final SubLObject physical_field_decoding) {
        return field_translation_fields(physical_field_decoding, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 27128L)
    public static SubLObject get_physical_field_decoding_gafs_for_physical_field(final SubLObject physical_field, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
        return get_physical_field_decoding_gafs_for_physical_field_indexical(physical_field_indexical, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 27662L)
    public static SubLObject get_physical_field_decodings_for_physical_field(final SubLObject physical_field, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
        return get_physical_field_decodings_for_physical_field_indexical(physical_field_indexical, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 28145L)
    public static SubLObject get_physical_field_decoding_gafs_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject physical_field_decoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != physical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const31$physicalFieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$81 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$82 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$81) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$82);
                                    final SubLObject valid_$83 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$82.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$83) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        to_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        to_physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        from_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (to_physical_field_indexical.eql(physical_field_indexical) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(to_physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(from_physical_schema, physical_schemata)) {
                                                physical_field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, physical_field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        }
                                    }
                                    done_var_$81 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$83);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const31$physicalFieldDecoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$82 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$83 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$82) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                    final SubLObject valid_$84 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$83.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$84) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        to_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        to_physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        from_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        decoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (to_physical_field_indexical.eql(physical_field_indexical)) {
                                                physical_field_decoding_gafs = (SubLObject)ConsesLow.cons(assertion, physical_field_decoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list32);
                                        }
                                    }
                                    done_var_$82 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$84);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return physical_field_decoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 29557L)
    public static SubLObject get_physical_field_decodings_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_decoding_gafs = get_physical_field_decoding_gafs_for_physical_field_indexical(physical_field_indexical, physical_schemata);
        SubLObject physical_field_decodings = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_decoding_gafs;
        SubLObject physical_field_decoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        physical_field_decoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            physical_field_decodings = (SubLObject)ConsesLow.cons(get_physical_field_decoding_from_gaf(physical_field_decoding_gaf), physical_field_decodings);
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_decoding_gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(list_utilities.fast_delete_duplicates(physical_field_decodings, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 30331L)
    public static SubLObject get_physical_field_encoding_from_gaf(final SubLObject physical_field_encoding_gaf) {
        return get_field_translation_from_gaf(physical_field_encoding_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 30583L)
    public static SubLObject destructure_physical_field_encoding_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject to_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject from_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject physical_field_encoding = (SubLObject)sksi_field_translation_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list33);
        to_physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list33);
        physical_field_indexical = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list33);
        from_physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list33);
        physical_field_encoding = current.first();
        current = current.rest();
        if (sksi_field_translation_utilities.NIL == current) {
            current = temp;
            SubLObject physical_field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list33);
            physical_field_encoding_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_field_translation_utilities.$sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, (SubLObject)ConsesLow.list(to_physical_schema, physical_field_indexical, from_physical_schema, physical_field_encoding), physical_field_encoding_gaf, ConsesLow.append(body, (SubLObject)sksi_field_translation_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list33);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 31007L)
    public static SubLObject physical_field_encoding_physical_field_indexicals(final SubLObject physical_field_encoding) {
        return field_translation_fields(physical_field_encoding, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 31260L)
    public static SubLObject physical_field_encoding_contains_physical_field_indexicalP(final SubLObject physical_field_encoding, final SubLObject physical_field_indexical) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(physical_field_indexical, physical_field_encoding, (SubLObject)sksi_field_translation_utilities.T, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 31478L)
    public static SubLObject get_physical_field_encoding_gafs_from_physical_field(final SubLObject physical_field, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
        return get_physical_field_encoding_gafs_from_physical_field_indexical(physical_field_indexical, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 32015L)
    public static SubLObject get_physical_field_encodings_from_physical_field(final SubLObject physical_field, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
        return get_physical_field_encodings_from_physical_field_indexical(physical_field_indexical, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 32501L)
    public static SubLObject get_physical_field_encoding_gafs_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject physical_field_encoding_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL != physical_schemata) {
            final SubLObject pred_var = sksi_field_translation_utilities.$const34$physicalFieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$89 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$90 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$89) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$90);
                                    final SubLObject valid_$91 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$90.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$91) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        to_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        to_physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        from_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(to_physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != list_utilities.member_eqP(from_physical_schema, physical_schemata) && sksi_field_translation_utilities.NIL != physical_field_encoding_contains_physical_field_indexicalP(encoding, physical_field_indexical)) {
                                                physical_field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, physical_field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        }
                                    }
                                    done_var_$89 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$91);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            final SubLObject pred_var = sksi_field_translation_utilities.$const34$physicalFieldEncoding;
            if (sksi_field_translation_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_field_translation_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_field_translation_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_field_translation_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_field_translation_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_field_translation_utilities.NIL;
                    while (sksi_field_translation_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_field_translation_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_field_translation_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_field_translation_utilities.$kw8$GAF, (SubLObject)sksi_field_translation_utilities.$kw9$TRUE, (SubLObject)sksi_field_translation_utilities.NIL);
                                SubLObject done_var_$90 = (SubLObject)sksi_field_translation_utilities.NIL;
                                final SubLObject token_var_$91 = (SubLObject)sksi_field_translation_utilities.NIL;
                                while (sksi_field_translation_utilities.NIL == done_var_$90) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$91);
                                    final SubLObject valid_$92 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$91.eql(assertion));
                                    if (sksi_field_translation_utilities.NIL != valid_$92) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                        SubLObject to_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject to_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject from_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                                        SubLObject encoding = (SubLObject)sksi_field_translation_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        to_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        to_physical_field_indexical = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        from_physical_schema = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        encoding = current.first();
                                        current = current.rest();
                                        if (sksi_field_translation_utilities.NIL == current) {
                                            if (sksi_field_translation_utilities.NIL != physical_field_encoding_contains_physical_field_indexicalP(encoding, physical_field_indexical)) {
                                                physical_field_encoding_gafs = (SubLObject)ConsesLow.cons(assertion, physical_field_encoding_gafs);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_field_translation_utilities.$list35);
                                        }
                                    }
                                    done_var_$90 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid_$92);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_field_translation_utilities.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (sksi_field_translation_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_field_translation_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return physical_field_encoding_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 34028L)
    public static SubLObject get_physical_field_encodings_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata) {
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject physical_field_encoding_gafs = get_physical_field_encoding_gafs_from_physical_field_indexical(physical_field_indexical, physical_schemata);
        SubLObject physical_field_encodings = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_encoding_gafs;
        SubLObject physical_field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        physical_field_encoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            physical_field_encodings = (SubLObject)ConsesLow.cons(get_physical_field_encoding_from_gaf(physical_field_encoding_gaf), physical_field_encodings);
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_encoding_gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(list_utilities.fast_delete_duplicates(physical_field_encodings, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 34808L)
    public static SubLObject sksi_reconstruct_encoding(final SubLObject encoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(encoding, (SubLObject)sksi_field_translation_utilities.$sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 35174L)
    public static SubLObject sksi_reconstruct_decoding(final SubLObject decoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(decoding, (SubLObject)sksi_field_translation_utilities.$sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 35454L)
    public static SubLObject sksi_reconstruct_logical_field_encoding(final SubLObject logical_field_encoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(logical_field_encoding, (SubLObject)sksi_field_translation_utilities.$sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 35778L)
    public static SubLObject sksi_reconstruct_field_encoding(final SubLObject encoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(encoding, (SubLObject)sksi_field_translation_utilities.$sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36052L)
    public static SubLObject sksi_reconstruct_physical_field_encoding(final SubLObject physical_field_encoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(physical_field_encoding, (SubLObject)sksi_field_translation_utilities.$sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36373L)
    public static SubLObject sksi_reconstruct_logical_field_decoding(final SubLObject logical_field_decoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(logical_field_decoding, (SubLObject)sksi_field_translation_utilities.$sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36697L)
    public static SubLObject sksi_reconstruct_field_decoding(final SubLObject decoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(decoding, (SubLObject)sksi_field_translation_utilities.$sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36983L)
    public static SubLObject sksi_reconstruct_physical_field_decoding(final SubLObject physical_field_decoding, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return sksi_reconstruct_translation(physical_field_decoding, (SubLObject)sksi_field_translation_utilities.$sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 37323L)
    public static SubLObject sksi_reconstruct_translation(final SubLObject translation, final SubLObject test, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_field_translation_utilities.NIL != sksi_kb_accessors.schema_object_fn_expression_p(translation)) {
            thread.resetMultipleValues();
            final SubLObject schema_object_fn = el_utilities.unmake_binary_formula(translation);
            final SubLObject source = thread.secondMultipleValue();
            final SubLObject descriptor = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject translated_descriptor = sksi_infrastructure_utilities.sksi_reconstruct_expression(descriptor, test, memoizeP);
            return el_utilities.make_binary_formula(schema_object_fn, source, translated_descriptor);
        }
        return sksi_infrastructure_utilities.sksi_reconstruct_expression(translation, test, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 37934L)
    public static SubLObject generate_decoding_compositions_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical);
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject error_message = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject result_$97 = (SubLObject)sksi_field_translation_utilities.NIL;
        try {
            thread.throwStack.push(sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
            SubLObject result_$98 = (SubLObject)sksi_field_translation_utilities.NIL;
            try {
                thread.throwStack.push(sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
                translations = list_utilities.fast_delete_duplicates(generate_decoding_compositions_for_logical_field_indexical_recursive(logical_field_indexical_fort, logical_schemata, physical_schemata, (SubLObject)sksi_field_translation_utilities.NIL), (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            }
            catch (Throwable ccatch_env_var) {
                result_$98 = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_field_translation_utilities.NIL != result_$98) {
                error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS, result_$98);
            }
        }
        catch (Throwable ccatch_env_var2) {
            result_$97 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_field_translation_utilities.NIL != result_$97) {
            error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS, result_$97);
        }
        if (sksi_field_translation_utilities.NIL != error_message && sksi_field_translation_utilities.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_field_translation_utilities.THREE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_field_translation_utilities.$str41$__SKSI__A_, error_message), (SubLObject)sksi_field_translation_utilities.THREE_INTEGER);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        if (sksi_field_translation_utilities.NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(logical_field_indexical)) {
            SubLObject cdolist_list_var = translations;
            SubLObject translation = (SubLObject)sksi_field_translation_utilities.NIL;
            translation = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                final SubLObject translation_pfis = cycl_utilities.expression_gather(translation, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_field_translation_utilities.T, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                SubLObject translation_copy = el_utilities.copy_expression(translation);
                SubLObject cdolist_list_var_$99 = translation_pfis;
                SubLObject pfi = (SubLObject)sksi_field_translation_utilities.NIL;
                pfi = cdolist_list_var_$99.first();
                while (sksi_field_translation_utilities.NIL != cdolist_list_var_$99) {
                    translation_copy = cycl_utilities.expression_nsubst(sksi_kb_accessors.pfi_for_lfi(pfi, logical_field_indexical), pfi, translation_copy, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                    cdolist_list_var_$99 = cdolist_list_var_$99.rest();
                    pfi = cdolist_list_var_$99.first();
                }
                result = (SubLObject)ConsesLow.cons(translation_copy, result);
                cdolist_list_var = cdolist_list_var.rest();
                translation = cdolist_list_var.first();
            }
            result = Sequences.nreverse(result);
        }
        else {
            result = translations;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 39270L)
    public static SubLObject generate_decoding_compositions_for_logical_field_indexical_recursive(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject used_gafs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_field_decoding_gafs = get_logical_field_decoding_gafs_for_logical_field_indexical(logical_field_indexical, logical_schemata);
        final SubLObject field_decoding_gafs = get_field_decoding_gafs_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata);
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = logical_field_decoding_gafs;
        SubLObject gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str42$Decoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject logical_field_decoding = get_logical_field_decoding_from_gaf(gaf);
                final SubLObject decoding_logical_field_indexicals = logical_field_decoding_logical_field_indexicals(logical_field_decoding);
                final SubLObject decoding_list = sksi_reconstruct_logical_field_decoding(logical_field_decoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(gaf, used_gafs);
                SubLObject multi_alist = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject error_message = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
                try {
                    thread.throwStack.push(sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
                    SubLObject result_$100 = (SubLObject)sksi_field_translation_utilities.NIL;
                    try {
                        thread.throwStack.push(sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
                        SubLObject cdolist_list_var_$101 = decoding_logical_field_indexicals;
                        SubLObject decoding_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                        decoding_logical_field_indexical = cdolist_list_var_$101.first();
                        while (sksi_field_translation_utilities.NIL != cdolist_list_var_$101) {
                            final SubLObject sub_translations = generate_decoding_compositions_for_logical_field_indexical_recursive(decoding_logical_field_indexical, logical_schemata, physical_schemata, new_used_gafs);
                            if (sksi_field_translation_utilities.NIL != sub_translations) {
                                multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(decoding_logical_field_indexical, sub_translations), multi_alist);
                            }
                            cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                            decoding_logical_field_indexical = cdolist_list_var_$101.first();
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        result_$100 = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (sksi_field_translation_utilities.NIL != result_$100) {
                        error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS, result_$100);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    result = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (sksi_field_translation_utilities.NIL != result) {
                    error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS, result);
                }
                if (sksi_field_translation_utilities.NIL == error_message) {
                    translations = ConsesLow.append(list_utilities.multi_sublis(multi_alist, decoding_list, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED), translations);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        cdolist_list_var = field_decoding_gafs;
        gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str42$Decoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject field_decoding = get_field_decoding_from_gaf(gaf);
                final SubLObject decoding_physical_field_indexicals = field_decoding_physical_field_indexicals(field_decoding);
                final SubLObject decoding_list = sksi_reconstruct_field_decoding(field_decoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(gaf, used_gafs);
                SubLObject multi_alist = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject cdolist_list_var_$102 = decoding_physical_field_indexicals;
                SubLObject decoding_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                decoding_physical_field_indexical = cdolist_list_var_$102.first();
                while (sksi_field_translation_utilities.NIL != cdolist_list_var_$102) {
                    final SubLObject sub_translations2 = generate_decoding_compositions_for_physical_field_indexical_recursive(decoding_physical_field_indexical, physical_schemata, new_used_gafs);
                    if (sksi_field_translation_utilities.NIL != sub_translations2) {
                        multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(decoding_physical_field_indexical, sub_translations2), multi_alist);
                    }
                    cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                    decoding_physical_field_indexical = cdolist_list_var_$102.first();
                }
                translations = ConsesLow.append(list_utilities.multi_sublis(multi_alist, decoding_list, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED), translations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        if (sksi_field_translation_utilities.NIL == translations) {
            Dynamic.sublisp_throw((SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS, logical_field_indexical);
        }
        return translations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 41927L)
    public static SubLObject generate_decoding_compositions_for_physical_field_indexical_recursive(final SubLObject physical_field_indexical, final SubLObject physical_schemata, final SubLObject used_gafs) {
        final SubLObject physical_field_decoding_gafs = get_physical_field_decoding_gafs_for_physical_field_indexical(physical_field_indexical, physical_schemata);
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_decoding_gafs;
        SubLObject gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str42$Decoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject physical_field_decoding = get_physical_field_decoding_from_gaf(gaf);
                final SubLObject decoding_physical_field_indexicals = physical_field_decoding_physical_field_indexicals(physical_field_decoding);
                final SubLObject decoding_list = sksi_reconstruct_physical_field_decoding(physical_field_decoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(gaf, used_gafs);
                SubLObject multi_alist = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject cdolist_list_var_$103 = decoding_physical_field_indexicals;
                SubLObject decoding_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                decoding_physical_field_indexical = cdolist_list_var_$103.first();
                while (sksi_field_translation_utilities.NIL != cdolist_list_var_$103) {
                    final SubLObject sub_translations = generate_decoding_compositions_for_physical_field_indexical_recursive(decoding_physical_field_indexical, physical_schemata, new_used_gafs);
                    if (sksi_field_translation_utilities.NIL != sub_translations) {
                        multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(decoding_physical_field_indexical, sub_translations), multi_alist);
                    }
                    cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                    decoding_physical_field_indexical = cdolist_list_var_$103.first();
                }
                translations = ConsesLow.append(list_utilities.multi_sublis(multi_alist, decoding_list, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED), translations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return translations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 43271L)
    public static SubLObject generate_encoding_compositions_for_physical_field_indexical_internal(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (mt_info == sksi_field_translation_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject error_message = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
        try {
            thread.throwStack.push(sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
            SubLObject result_$104 = (SubLObject)sksi_field_translation_utilities.NIL;
            try {
                thread.throwStack.push(sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
                translations = list_utilities.fast_delete_duplicates(generate_encoding_compositions_for_physical_field_indexical_recursive(physical_field_indexical, logical_schemata, physical_schemata, (SubLObject)sksi_field_translation_utilities.NIL), (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            }
            catch (Throwable ccatch_env_var) {
                result_$104 = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_field_translation_utilities.NIL != result_$104) {
                error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS, result_$104);
            }
        }
        catch (Throwable ccatch_env_var2) {
            result = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_field_translation_utilities.NIL != result) {
            error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS, result);
        }
        if (sksi_field_translation_utilities.NIL != error_message && sksi_field_translation_utilities.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_field_translation_utilities.THREE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_field_translation_utilities.$str41$__SKSI__A_, error_message), (SubLObject)sksi_field_translation_utilities.THREE_INTEGER);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return translations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 43271L)
    public static SubLObject generate_encoding_compositions_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (mt_info == sksi_field_translation_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return generate_encoding_compositions_for_physical_field_indexical_internal(physical_field_indexical, logical_schemata, physical_schemata, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.FOUR_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(physical_field_indexical, logical_schemata, physical_schemata, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (physical_schemata.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_encoding_compositions_for_physical_field_indexical_internal(physical_field_indexical, logical_schemata, physical_schemata, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_field_indexical, logical_schemata, physical_schemata, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 43982L)
    public static SubLObject generate_encoding_compositions_for_physical_field_indexical_recursive(final SubLObject physical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject used_gafs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject physical_field_encoding_gafs = get_physical_field_encoding_gafs_from_physical_field_indexical(physical_field_indexical, physical_schemata);
        final SubLObject field_encoding_gafs = get_field_encoding_gafs_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_encoding_gafs;
        SubLObject gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str44$Encoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject physical_field_encoding = get_physical_field_encoding_from_gaf(gaf);
                final SubLObject encoding_physical_field_indexicals = physical_field_encoding_physical_field_indexicals(physical_field_encoding);
                final SubLObject encoding_list = sksi_reconstruct_physical_field_encoding(physical_field_encoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(gaf, used_gafs);
                SubLObject multi_alist = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject error_message = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
                try {
                    thread.throwStack.push(sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
                    SubLObject result_$105 = (SubLObject)sksi_field_translation_utilities.NIL;
                    try {
                        thread.throwStack.push(sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
                        SubLObject cdolist_list_var_$106 = encoding_physical_field_indexicals;
                        SubLObject encoding_physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                        encoding_physical_field_indexical = cdolist_list_var_$106.first();
                        while (sksi_field_translation_utilities.NIL != cdolist_list_var_$106) {
                            final SubLObject sub_translations = generate_encoding_compositions_for_physical_field_indexical_recursive(encoding_physical_field_indexical, logical_schemata, physical_schemata, new_used_gafs);
                            if (sksi_field_translation_utilities.NIL != sub_translations) {
                                multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(encoding_physical_field_indexical, sub_translations), multi_alist);
                            }
                            cdolist_list_var_$106 = cdolist_list_var_$106.rest();
                            encoding_physical_field_indexical = cdolist_list_var_$106.first();
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        result_$105 = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (sksi_field_translation_utilities.NIL != result_$105) {
                        error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS, result_$105);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    result = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (sksi_field_translation_utilities.NIL != result) {
                    error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_field_translation_utilities.$kw39$SKSI_MISSING_DECODINGS, result);
                }
                if (sksi_field_translation_utilities.NIL == error_message) {
                    translations = ConsesLow.append(list_utilities.multi_sublis(multi_alist, encoding_list, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED), translations);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        cdolist_list_var = field_encoding_gafs;
        gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str44$Encoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject field_encoding = get_field_encoding_from_gaf(gaf);
                final SubLObject logical_field_indexicals = field_encoding_logical_field_indexicals(field_encoding);
                final SubLObject encoding_list = sksi_reconstruct_field_encoding(field_encoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(gaf, used_gafs);
                SubLObject multi_alist = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject cdolist_list_var_$107 = logical_field_indexicals;
                SubLObject logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                logical_field_indexical = cdolist_list_var_$107.first();
                while (sksi_field_translation_utilities.NIL != cdolist_list_var_$107) {
                    final SubLObject sub_translations2 = generate_encoding_compositions_for_logical_field_indexical_recursive(logical_field_indexical, logical_schemata, new_used_gafs);
                    if (sksi_field_translation_utilities.NIL != sub_translations2) {
                        multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(logical_field_indexical, sub_translations2), multi_alist);
                    }
                    cdolist_list_var_$107 = cdolist_list_var_$107.rest();
                    logical_field_indexical = cdolist_list_var_$107.first();
                }
                translations = ConsesLow.append(list_utilities.multi_sublis(multi_alist, encoding_list, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED), translations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        if (sksi_field_translation_utilities.NIL == translations) {
            Dynamic.sublisp_throw((SubLObject)sksi_field_translation_utilities.$kw40$SKSI_MISSING_ENCODINGS, physical_field_indexical);
        }
        return translations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 46565L)
    public static SubLObject generate_encoding_compositions_for_logical_field_indexical_recursive(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject used_gafs) {
        final SubLObject logical_field_encoding_gafs = get_logical_field_encoding_gafs_for_logical_field_indexical(logical_field_indexical, logical_schemata);
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = logical_field_encoding_gafs;
        SubLObject gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str44$Encoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject logical_field_encoding = get_logical_field_encoding_from_gaf(gaf);
                final SubLObject encoding_logical_field_indexicals = logical_field_encoding_logical_field_indexicals(logical_field_encoding);
                final SubLObject encoding_list = sksi_reconstruct_logical_field_encoding(logical_field_encoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(gaf, used_gafs);
                SubLObject multi_alist = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject cdolist_list_var_$108 = encoding_logical_field_indexicals;
                SubLObject encoding_logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                encoding_logical_field_indexical = cdolist_list_var_$108.first();
                while (sksi_field_translation_utilities.NIL != cdolist_list_var_$108) {
                    final SubLObject sub_translations = generate_encoding_compositions_for_logical_field_indexical_recursive(encoding_logical_field_indexical, logical_schemata, new_used_gafs);
                    if (sksi_field_translation_utilities.NIL != sub_translations) {
                        multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(encoding_logical_field_indexical, sub_translations), multi_alist);
                    }
                    cdolist_list_var_$108 = cdolist_list_var_$108.rest();
                    encoding_logical_field_indexical = cdolist_list_var_$108.first();
                }
                translations = ConsesLow.append(list_utilities.multi_sublis(multi_alist, encoding_list, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQ), (SubLObject)sksi_field_translation_utilities.UNPROVIDED), translations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return translations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 47863L)
    public static SubLObject generate_encoding_compositions_from_logical_field_indexical_internal(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (mt_info == sksi_field_translation_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        }
        final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical);
        final SubLObject physical_field_indexicals = gather_lowest_physical_field_indexicals_for_logical_field_indexical(logical_field_indexical_fort, logical_schemata, physical_schemata);
        SubLObject translations = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_indexicals;
        SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
        physical_field_indexical = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            final SubLObject pfi_translations = generate_encoding_compositions_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            final SubLObject alist = (SubLObject)ConsesLow.list(reader.bq_cons(logical_field_indexical_fort, logical_field_indexical));
            SubLObject cdolist_list_var_$109 = pfi_translations;
            SubLObject pfi_translation = (SubLObject)sksi_field_translation_utilities.NIL;
            pfi_translation = cdolist_list_var_$109.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var_$109) {
                if (sksi_field_translation_utilities.NIL != sksi_query_utilities.expression_contains_logical_field_indexicalP(logical_field_indexical_fort, pfi_translation)) {
                    translations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_kb_accessors.pfi_for_lfi(physical_field_indexical, logical_field_indexical), conses_high.sublis(alist, pfi_translation, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED)), translations);
                }
                cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                pfi_translation = cdolist_list_var_$109.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_indexical = cdolist_list_var.first();
        }
        return translations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 47863L)
    public static SubLObject generate_encoding_compositions_from_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (mt_info == sksi_field_translation_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return generate_encoding_compositions_from_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_field_translation_utilities.FOUR_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (physical_schemata.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_encoding_compositions_from_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, logical_schemata, physical_schemata, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 49212L)
    public static SubLObject gather_lowest_physical_field_indexicals_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata) {
        if (logical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (physical_schemata == sksi_field_translation_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        return list_utilities.fast_delete_duplicates(gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive(logical_field_indexical, logical_schemata, physical_schemata, (SubLObject)sksi_field_translation_utilities.NIL), (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 49729L)
    public static SubLObject gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject used_gafs) {
        final SubLObject logical_field_encoding_gafs = get_logical_field_encoding_gafs_from_logical_field_indexical(logical_field_indexical, logical_schemata);
        final SubLObject field_encoding_gafs = get_field_encoding_gafs_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        SubLObject physical_field_indexicals = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = logical_field_encoding_gafs;
        SubLObject logical_field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        logical_field_encoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(logical_field_encoding_gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str44$Encoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject new_logical_field_indexical = assertions_high.gaf_arg2(logical_field_encoding_gaf);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(logical_field_encoding_gaf, used_gafs);
                final SubLObject new_pf_indexicals = gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive(new_logical_field_indexical, logical_schemata, physical_schemata, new_used_gafs);
                physical_field_indexicals = ConsesLow.append(new_pf_indexicals, physical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_field_encoding_gaf = cdolist_list_var.first();
        }
        cdolist_list_var = field_encoding_gafs;
        SubLObject field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        field_encoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(field_encoding_gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str44$Encoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject pf_indexical = assertions_high.gaf_arg2(field_encoding_gaf);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(field_encoding_gaf, used_gafs);
                final SubLObject new_pf_indexicals = gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive(pf_indexical, physical_schemata, new_used_gafs);
                physical_field_indexicals = ConsesLow.append(new_pf_indexicals, physical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding_gaf = cdolist_list_var.first();
        }
        return physical_field_indexicals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 51403L)
    public static SubLObject gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive(final SubLObject physical_field_indexical, final SubLObject physical_schemata, final SubLObject used_gafs) {
        final SubLObject physical_field_encoding_gafs = get_physical_field_encoding_gafs_from_physical_field_indexical(physical_field_indexical, physical_schemata);
        SubLObject physical_field_indexicals = (SubLObject)((sksi_field_translation_utilities.NIL != physical_field_encoding_gafs) ? sksi_field_translation_utilities.NIL : ConsesLow.list(physical_field_indexical));
        SubLObject cdolist_list_var = physical_field_encoding_gafs;
        SubLObject physical_field_encoding_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
        physical_field_encoding_gaf = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != list_utilities.member_eqP(physical_field_encoding_gaf, used_gafs)) {
                Errors.warn((SubLObject)sksi_field_translation_utilities.$str44$Encoding_loop___a_, used_gafs);
            }
            else {
                final SubLObject pf_indexical = assertions_high.gaf_arg2(physical_field_encoding_gaf);
                final SubLObject new_used_gafs = (SubLObject)ConsesLow.cons(physical_field_encoding_gaf, used_gafs);
                final SubLObject new_pf_indexicals = gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive(pf_indexical, physical_schemata, new_used_gafs);
                physical_field_indexicals = ConsesLow.append(new_pf_indexicals, physical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_encoding_gaf = cdolist_list_var.first();
        }
        return physical_field_indexicals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 52422L)
    public static SubLObject translations_equivalentP(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        if (sksi_field_translation_utilities.NIL == memoizeP) {
            return translations_equivalent_int(translation0, translation1, hl_test, el_test);
        }
        if (sksi_field_translation_utilities.NIL != kb_utilities.term_L(translation1, translation0, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED)) {
            return translations_equivalent_memoized(translation0, translation1, hl_test, el_test);
        }
        return translations_equivalent_memoized(translation0, translation1, hl_test, el_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 53012L)
    public static SubLObject translations_equivalent_memoized_internal(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test) {
        return translations_equivalent_int(translation0, translation1, hl_test, el_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 53012L)
    public static SubLObject translations_equivalent_memoized(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == v_memoization_state) {
            return translations_equivalent_memoized_internal(translation0, translation1, hl_test, el_test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (sksi_field_translation_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_field_translation_utilities.$sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED, (SubLObject)sksi_field_translation_utilities.FOUR_INTEGER, (SubLObject)sksi_field_translation_utilities.NIL, (SubLObject)sksi_field_translation_utilities.EQUAL, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_field_translation_utilities.$sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(translation0, translation1, hl_test, el_test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_field_translation_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (translation0.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (translation1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (hl_test.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_field_translation_utilities.NIL != cached_args && sksi_field_translation_utilities.NIL == cached_args.rest() && el_test.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(translations_equivalent_memoized_internal(translation0, translation1, hl_test, el_test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(translation0, translation1, hl_test, el_test));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 53205L)
    public static SubLObject translations_equivalent_int(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test) {
        if (translation0.equal(translation1)) {
            return (SubLObject)sksi_field_translation_utilities.T;
        }
        if (sksi_field_translation_utilities.NIL == translation0 || sksi_field_translation_utilities.NIL == translation1) {
            return (SubLObject)sksi_field_translation_utilities.NIL;
        }
        SubLObject modified_translation0 = sksi_reconstruct_translation(translation0, el_test, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        SubLObject modified_translation2 = sksi_reconstruct_translation(translation1, el_test, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        SubLObject possibly_equivalentP = (SubLObject)sksi_field_translation_utilities.T;
        SubLObject doneP = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject arg_count = (SubLObject)sksi_field_translation_utilities.NIL;
        arg_count = (SubLObject)sksi_field_translation_utilities.ZERO_INTEGER;
        while (sksi_field_translation_utilities.NIL != possibly_equivalentP && sksi_field_translation_utilities.NIL == doneP) {
            final SubLObject field0 = cycl_utilities.expression_find_if(hl_test, modified_translation0, (SubLObject)sksi_field_translation_utilities.T, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            final SubLObject field2 = cycl_utilities.expression_find_if(hl_test, modified_translation2, (SubLObject)sksi_field_translation_utilities.T, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            if (sksi_field_translation_utilities.NIL != field0 && sksi_field_translation_utilities.NIL != field2) {
                modified_translation0 = cycl_utilities.expression_subst(arg_count, field0, modified_translation0, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                modified_translation2 = cycl_utilities.expression_subst(arg_count, field2, modified_translation2, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            }
            else if (sksi_field_translation_utilities.NIL != field0 || sksi_field_translation_utilities.NIL != field2) {
                possibly_equivalentP = (SubLObject)sksi_field_translation_utilities.NIL;
            }
            else {
                doneP = (SubLObject)sksi_field_translation_utilities.T;
            }
            arg_count = Numbers.add(arg_count, (SubLObject)sksi_field_translation_utilities.ONE_INTEGER);
        }
        if (sksi_field_translation_utilities.NIL != possibly_equivalentP) {
            return Equality.equal(modified_translation0, modified_translation2);
        }
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 54829L)
    public static SubLObject encodings_equivalentP(final SubLObject encoding0, final SubLObject encoding1, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return translations_equivalentP(encoding0, encoding1, (SubLObject)sksi_field_translation_utilities.$sym4$LOGICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_field_translation_utilities.$sym47$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 55056L)
    public static SubLObject decodings_equivalentP(final SubLObject decoding0, final SubLObject decoding1, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.T;
        }
        return translations_equivalentP(decoding0, decoding1, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_field_translation_utilities.$sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P, memoizeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 55284L)
    public static SubLObject some_encodings_equivalentP(final SubLObject encodings0, final SubLObject encodings1, SubLObject memoizedP) {
        if (memoizedP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizedP = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        SubLObject some_equivalentP = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == some_equivalentP) {
            SubLObject csome_list_var = encodings0;
            SubLObject encoding0 = (SubLObject)sksi_field_translation_utilities.NIL;
            encoding0 = csome_list_var.first();
            while (sksi_field_translation_utilities.NIL == some_equivalentP && sksi_field_translation_utilities.NIL != csome_list_var) {
                if (sksi_field_translation_utilities.NIL == some_equivalentP) {
                    SubLObject csome_list_var_$110;
                    SubLObject encoding2;
                    for (csome_list_var_$110 = encodings1, encoding2 = (SubLObject)sksi_field_translation_utilities.NIL, encoding2 = csome_list_var_$110.first(); sksi_field_translation_utilities.NIL == some_equivalentP && sksi_field_translation_utilities.NIL != csome_list_var_$110; some_equivalentP = encodings_equivalentP(encoding0, encoding2, memoizedP), csome_list_var_$110 = csome_list_var_$110.rest(), encoding2 = csome_list_var_$110.first()) {}
                }
                csome_list_var = csome_list_var.rest();
                encoding0 = csome_list_var.first();
            }
        }
        return some_equivalentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 55698L)
    public static SubLObject some_decodings_equivalentP(final SubLObject decodings0, final SubLObject decodings1, SubLObject memoizedP) {
        if (memoizedP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizedP = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        SubLObject some_equivalentP = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == some_equivalentP) {
            SubLObject csome_list_var = decodings0;
            SubLObject decoding0 = (SubLObject)sksi_field_translation_utilities.NIL;
            decoding0 = csome_list_var.first();
            while (sksi_field_translation_utilities.NIL == some_equivalentP && sksi_field_translation_utilities.NIL != csome_list_var) {
                if (sksi_field_translation_utilities.NIL == some_equivalentP) {
                    SubLObject csome_list_var_$111;
                    SubLObject decoding2;
                    for (csome_list_var_$111 = decodings1, decoding2 = (SubLObject)sksi_field_translation_utilities.NIL, decoding2 = csome_list_var_$111.first(); sksi_field_translation_utilities.NIL == some_equivalentP && sksi_field_translation_utilities.NIL != csome_list_var_$111; some_equivalentP = decodings_equivalentP(decoding0, decoding2, memoizedP), csome_list_var_$111 = csome_list_var_$111.rest(), decoding2 = csome_list_var_$111.first()) {}
                }
                csome_list_var = csome_list_var.rest();
                decoding0 = csome_list_var.first();
            }
        }
        return some_equivalentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 56111L)
    public static SubLObject sksi_apply_encoding_and_reformulate(final SubLObject alist, final SubLObject encoding, final SubLObject sks, SubLObject mt) {
        if (mt == sksi_field_translation_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject reconstructed_encoding = sksi_reconstruct_encoding(encoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        return sksi_apply_translation_and_reformulate(alist, reconstructed_encoding, (SubLObject)sksi_field_translation_utilities.$kw48$ENCODE, sks, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 56643L)
    public static SubLObject sksi_apply_decoding_and_reformulate(final SubLObject alist, final SubLObject decoding, final SubLObject sks, SubLObject mt) {
        if (mt == sksi_field_translation_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLObject reconstructed_decoding = sksi_reconstruct_decoding(decoding, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
        return sksi_apply_translation_and_reformulate(alist, reconstructed_decoding, (SubLObject)sksi_field_translation_utilities.$kw49$DECODE, sks, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 57091L)
    public static SubLObject sksi_apply_translation_and_reformulate(final SubLObject alist, final SubLObject translation, final SubLObject direction, final SubLObject sks, SubLObject mt) {
        if (mt == sksi_field_translation_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recursedP = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject lf;
        SubLObject value;
        SubLObject result_items;
        SubLObject cdolist_list_var;
        SubLObject item;
        SubLObject new_alist;
        for (rest = (SubLObject)sksi_field_translation_utilities.NIL, rest = alist; sksi_field_translation_utilities.NIL == recursedP && sksi_field_translation_utilities.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            lf = (SubLObject)sksi_field_translation_utilities.NIL;
            value = (SubLObject)sksi_field_translation_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_field_translation_utilities.$list50);
            lf = current.first();
            current = (value = current.rest());
            if (sksi_field_translation_utilities.NIL != el_utilities.el_set_p(value)) {
                result_items = (SubLObject)sksi_field_translation_utilities.NIL;
                cdolist_list_var = el_utilities.el_set_items(value);
                item = (SubLObject)sksi_field_translation_utilities.NIL;
                item = cdolist_list_var.first();
                while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                    new_alist = list_utilities.alist_enter(el_utilities.copy_expression(alist), lf, item, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                    result_items = (SubLObject)ConsesLow.cons(sksi_apply_translation_and_reformulate(new_alist, translation, direction, sks, mt), result_items);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                result = el_utilities.make_el_set(result_items, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                recursedP = (SubLObject)sksi_field_translation_utilities.T;
            }
        }
        if (sksi_field_translation_utilities.NIL == recursedP) {
            final SubLObject applied_translation = cycl_utilities.expression_sublis(alist, translation, Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQUAL), (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                result = sksi_reformulate.sksi_reformulate(applied_translation, direction, sks);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 57918L)
    public static SubLObject filter_decodings(final SubLObject decodings, final SubLObject physical_schemata) {
        SubLObject new_decodings = (SubLObject)sksi_field_translation_utilities.NIL;
        SubLObject cdolist_list_var = decodings;
        SubLObject decoding = (SubLObject)sksi_field_translation_utilities.NIL;
        decoding = cdolist_list_var.first();
        while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
            if (sksi_field_translation_utilities.NIL != filter_decoding(decoding, physical_schemata)) {
                new_decodings = (SubLObject)ConsesLow.cons(decoding, new_decodings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_decodings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 58264L)
    public static SubLObject filter_decoding(final SubLObject decoding, final SubLObject physical_schemata) {
        final SubLObject physical_field_indexicals = field_translation_fields(decoding, (SubLObject)sksi_field_translation_utilities.$sym3$PHYSICAL_FIELD_INDEXICAL_P);
        SubLObject filterP = (SubLObject)sksi_field_translation_utilities.NIL;
        if (sksi_field_translation_utilities.NIL == filterP) {
            SubLObject csome_list_var = physical_field_indexicals;
            SubLObject physical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
            physical_field_indexical = csome_list_var.first();
            while (sksi_field_translation_utilities.NIL == filterP && sksi_field_translation_utilities.NIL != csome_list_var) {
                if (sksi_field_translation_utilities.NIL == list_utilities.member_eqP(sksi_kb_accessors.physical_field_indexical_schema(physical_field_indexical), physical_schemata)) {
                    filterP = (SubLObject)sksi_field_translation_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                physical_field_indexical = csome_list_var.first();
            }
        }
        return (SubLObject)((sksi_field_translation_utilities.NIL != filterP) ? sksi_field_translation_utilities.NIL : decoding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 58677L)
    public static SubLObject sksi_translate_logical_sentences_to_physical_sentences(final SubLObject sentences, final SubLObject sks, SubLObject memoizeP) {
        if (memoizeP == sksi_field_translation_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_field_translation_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sks);
        SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_field_translation_utilities.$sym51$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mapping_mt, thread);
            final SubLObject logical_schemata = (sksi_field_translation_utilities.NIL != sksi_sks_accessors.sks_complex_p(sks)) ? sksi_kb_accessors.sk_source_complex_logical_schemata(sks) : sksi_kb_accessors.sk_source_logical_schemata(sks);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)sksi_field_translation_utilities.NIL;
            sentence = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                final SubLObject pred = cycl_utilities.sentence_arg0(sentence);
                SubLObject meaning_sentence_gafs = sksi_meaning_sentence_utilities.relevant_logical_schemata_meaning_sentence_gafs(logical_schemata, pred, (SubLObject)sksi_field_translation_utilities.$sym52$RELEVANT_PRED_IS_EQ, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                if (sksi_field_translation_utilities.NIL != content_mt) {
                    SubLObject matching_meaning_sentence_gafs = (SubLObject)sksi_field_translation_utilities.NIL;
                    SubLObject cdolist_list_var_$112 = meaning_sentence_gafs;
                    SubLObject meaning_sentence_gaf = (SubLObject)sksi_field_translation_utilities.NIL;
                    meaning_sentence_gaf = cdolist_list_var_$112.first();
                    while (sksi_field_translation_utilities.NIL != cdolist_list_var_$112) {
                        final SubLObject mt_var = content_mt;
                        final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$114 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (sksi_field_translation_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_type_check(sentence, assertions_high.gaf_arg2(meaning_sentence_gaf), memoizeP, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED)) {
                                matching_meaning_sentence_gafs = (SubLObject)ConsesLow.cons(meaning_sentence_gaf, matching_meaning_sentence_gafs);
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$114, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$113, thread);
                        }
                        cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                        meaning_sentence_gaf = cdolist_list_var_$112.first();
                    }
                    meaning_sentence_gafs = matching_meaning_sentence_gafs;
                }
                if (sksi_field_translation_utilities.NIL == meaning_sentence_gafs) {
                    final SubLObject _prev_bind_0_$114 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$115 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_field_translation_utilities.$sym51$RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mapping_mt, thread);
                        if (sksi_field_translation_utilities.NIL != virtual_indexing.assertions_mentioning_terms((SubLObject)ConsesLow.list(pred, sksi_field_translation_utilities.$const53$meaningSentenceOfSchema), (SubLObject)sksi_field_translation_utilities.UNPROVIDED)) {
                            Errors.warn((SubLObject)sksi_field_translation_utilities.$str54$No_meaning_sentence_for__S, sentence);
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$115, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$114, thread);
                    }
                }
                else {
                    SubLObject sentence_translation = (SubLObject)sksi_field_translation_utilities.NIL;
                    SubLObject successP = (SubLObject)sksi_field_translation_utilities.NIL;
                    if (sksi_field_translation_utilities.NIL == successP) {
                        SubLObject csome_list_var = meaning_sentence_gafs;
                        SubLObject meaning_sentence_gaf2 = (SubLObject)sksi_field_translation_utilities.NIL;
                        meaning_sentence_gaf2 = csome_list_var.first();
                        while (sksi_field_translation_utilities.NIL == successP && sksi_field_translation_utilities.NIL != csome_list_var) {
                            final SubLObject meaning_sentence = assertions_high.gaf_arg2(meaning_sentence_gaf2);
                            final SubLObject logical_schema = assertions_high.gaf_arg1(meaning_sentence_gaf2);
                            final SubLObject physical_schemata = sksi_kb_accessors.logical_schema_physical_schemata(logical_schema);
                            thread.resetMultipleValues();
                            final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_logical_sentence_to_raw_tuples(sentence, logical_schema, physical_schemata.first(), mapping_mt, sks, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                            final SubLObject physical_fields = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (sksi_field_translation_utilities.NIL != raw_tuples) {
                                successP = (SubLObject)sksi_field_translation_utilities.T;
                                sentence_translation = (SubLObject)ConsesLow.cons((SubLObject)sksi_field_translation_utilities.$kw55$PRED, sentence_translation);
                                sentence_translation = (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg0(meaning_sentence), sentence_translation);
                                SubLObject cdolist_list_var_$113 = cycl_utilities.sentence_args(meaning_sentence, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                                SubLObject arg = (SubLObject)sksi_field_translation_utilities.NIL;
                                arg = cdolist_list_var_$113.first();
                                while (sksi_field_translation_utilities.NIL != cdolist_list_var_$113) {
                                    SubLObject name = (SubLObject)sksi_field_translation_utilities.NIL;
                                    SubLObject value = (SubLObject)sksi_field_translation_utilities.NIL;
                                    if (sksi_field_translation_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(arg)) {
                                        final SubLObject relevant_physical_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(arg, logical_schemata, physical_schemata);
                                        if (sksi_field_translation_utilities.NIL == value) {
                                            SubLObject csome_list_var_$118 = relevant_physical_indexicals;
                                            SubLObject relevant_physical_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                                            relevant_physical_indexical = csome_list_var_$118.first();
                                            while (sksi_field_translation_utilities.NIL == value && sksi_field_translation_utilities.NIL != csome_list_var_$118) {
                                                final SubLObject relevant_physical_field = sksi_kb_accessors.physical_field_for_indexical(relevant_physical_indexical);
                                                final SubLObject position = Sequences.position(relevant_physical_field, physical_fields, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                                                if (sksi_field_translation_utilities.NIL != position) {
                                                    name = sksi_kb_accessors.physical_field_name(relevant_physical_field);
                                                    value = ConsesLow.nth(position, raw_tuples.first().first());
                                                }
                                                csome_list_var_$118 = csome_list_var_$118.rest();
                                                relevant_physical_indexical = csome_list_var_$118.first();
                                            }
                                        }
                                    }
                                    else {
                                        value = arg;
                                    }
                                    if (sksi_field_translation_utilities.NIL == name) {
                                        value = (SubLObject)sksi_field_translation_utilities.$kw56$NO_NAME;
                                        successP = (SubLObject)sksi_field_translation_utilities.NIL;
                                        Errors.warn((SubLObject)sksi_field_translation_utilities.$str57$failure_on_name_for__S, arg);
                                    }
                                    if (sksi_field_translation_utilities.NIL == value) {
                                        value = (SubLObject)sksi_field_translation_utilities.$kw58$NO_VALUE;
                                        successP = (SubLObject)sksi_field_translation_utilities.NIL;
                                        Errors.warn((SubLObject)sksi_field_translation_utilities.$str59$failure_on_value_for__S, arg);
                                    }
                                    sentence_translation = (SubLObject)ConsesLow.cons(name, sentence_translation);
                                    sentence_translation = (SubLObject)ConsesLow.cons(value, sentence_translation);
                                    cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                                    arg = cdolist_list_var_$113.first();
                                }
                                sentence_translation = Sequences.nreverse(sentence_translation);
                                if (sksi_field_translation_utilities.NIL != successP && sksi_field_translation_utilities.NIL == Sequences.find((SubLObject)sksi_field_translation_utilities.$kw56$NO_NAME, sentence_translation, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED)) {
                                    result = (SubLObject)ConsesLow.cons(sentence_translation, result);
                                }
                                if (sksi_field_translation_utilities.NIL != Sequences.find((SubLObject)sksi_field_translation_utilities.$kw56$NO_NAME, sentence_translation, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED, (SubLObject)sksi_field_translation_utilities.UNPROVIDED)) {
                                    successP = (SubLObject)sksi_field_translation_utilities.NIL;
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            meaning_sentence_gaf2 = csome_list_var.first();
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 62423L)
    public static SubLObject sksi_translate_physical_sentence_plists_to_logical_sentences(final SubLObject raw_sentence_plists, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        SubLObject result = (SubLObject)sksi_field_translation_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_field_translation_utilities.$sym51$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mapping_mt, thread);
            final SubLObject physical_schemata = (sksi_field_translation_utilities.NIL != sksi_sks_accessors.sks_complex_p(sks)) ? sksi_kb_accessors.sk_source_complex_physical_schemata(sks) : sksi_kb_accessors.sk_source_physical_schemata(sks);
            SubLObject cdolist_list_var = raw_sentence_plists;
            SubLObject raw_sentence_plist = (SubLObject)sksi_field_translation_utilities.NIL;
            raw_sentence_plist = cdolist_list_var.first();
            while (sksi_field_translation_utilities.NIL != cdolist_list_var) {
                SubLObject logical_values = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject logical_fields = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject logical_schemata = (SubLObject)sksi_field_translation_utilities.NIL;
                SubLObject remainder;
                SubLObject pf_name;
                SubLObject raw_value;
                SubLObject physical_field;
                SubLObject physical_schema;
                SubLObject csome_list_var;
                SubLObject this_physical_schema;
                SubLObject possible_physical_field;
                SubLObject physical_field_indexical;
                SubLObject logical_field_indexicals;
                SubLObject found_logical_valueP;
                SubLObject cdolist_list_var_$119;
                SubLObject logical_field_indexical;
                SubLObject recipes;
                SubLObject csome_list_var2;
                SubLObject recipe;
                SubLObject reformulatable_expression;
                SubLObject logical_value;
                for (remainder = (SubLObject)sksi_field_translation_utilities.NIL, remainder = raw_sentence_plist; sksi_field_translation_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    pf_name = remainder.first();
                    raw_value = conses_high.cadr(remainder);
                    physical_field = (SubLObject)sksi_field_translation_utilities.NIL;
                    physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                    if (sksi_field_translation_utilities.NIL == physical_field) {
                        csome_list_var = physical_schemata;
                        this_physical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                        this_physical_schema = csome_list_var.first();
                        while (sksi_field_translation_utilities.NIL == physical_field && sksi_field_translation_utilities.NIL != csome_list_var) {
                            possible_physical_field = sksi_kb_accessors.physical_field_for_schema_and_name(this_physical_schema, pf_name);
                            if (sksi_field_translation_utilities.NIL != possible_physical_field) {
                                physical_field = possible_physical_field;
                                physical_schema = this_physical_schema;
                            }
                            csome_list_var = csome_list_var.rest();
                            this_physical_schema = csome_list_var.first();
                        }
                    }
                    if (sksi_field_translation_utilities.NIL == physical_field) {
                        Errors.warn((SubLObject)sksi_field_translation_utilities.$str60$No_physical_field_for__S, raw_value);
                    }
                    else {
                        logical_schemata = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
                        physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field(physical_field);
                        if (sksi_field_translation_utilities.NIL != physical_field_indexical) {
                            logical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
                            found_logical_valueP = (SubLObject)sksi_field_translation_utilities.NIL;
                            cdolist_list_var_$119 = logical_field_indexicals;
                            logical_field_indexical = (SubLObject)sksi_field_translation_utilities.NIL;
                            logical_field_indexical = cdolist_list_var_$119.first();
                            while (sksi_field_translation_utilities.NIL != cdolist_list_var_$119) {
                                recipes = relevant_field_decodings_for_indexical(logical_field_indexical, logical_schemata, physical_schemata);
                                if (sksi_field_translation_utilities.NIL == found_logical_valueP) {
                                    csome_list_var2 = recipes;
                                    recipe = (SubLObject)sksi_field_translation_utilities.NIL;
                                    recipe = csome_list_var2.first();
                                    while (sksi_field_translation_utilities.NIL == found_logical_valueP && sksi_field_translation_utilities.NIL != csome_list_var2) {
                                        reformulatable_expression = cycl_utilities.expression_subst(raw_value, cycl_utilities.naut_substitute(physical_field_indexical), cycl_utilities.naut_substitute(recipe), Symbols.symbol_function((SubLObject)sksi_field_translation_utilities.EQUAL), (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                                        logical_value = sksi_reformulate.sksi_reformulate(reformulatable_expression, (SubLObject)sksi_field_translation_utilities.$kw49$DECODE, sks);
                                        if (sksi_field_translation_utilities.NIL != logical_value) {
                                            found_logical_valueP = (SubLObject)sksi_field_translation_utilities.T;
                                            logical_values = (SubLObject)ConsesLow.cons(logical_value, logical_values);
                                            logical_fields = (SubLObject)ConsesLow.cons(sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical), logical_fields);
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        recipe = csome_list_var2.first();
                                    }
                                }
                                cdolist_list_var_$119 = cdolist_list_var_$119.rest();
                                logical_field_indexical = cdolist_list_var_$119.first();
                            }
                        }
                    }
                }
                logical_values = Sequences.nreverse(logical_values);
                logical_fields = Sequences.nreverse(logical_fields);
                final SubLObject logical_field_indexicals2 = Mapping.mapcar((SubLObject)sksi_field_translation_utilities.$sym61$INDEXICAL_FOR_LOGICAL_FIELD, logical_fields);
                SubLObject pred = (SubLObject)sksi_field_translation_utilities.NIL;
                if (sksi_field_translation_utilities.NIL == pred) {
                    SubLObject csome_list_var3 = logical_schemata;
                    SubLObject logical_schema = (SubLObject)sksi_field_translation_utilities.NIL;
                    logical_schema = csome_list_var3.first();
                    while (sksi_field_translation_utilities.NIL == pred && sksi_field_translation_utilities.NIL != csome_list_var3) {
                        final SubLObject preds = ask_utilities.query_variable((SubLObject)sksi_field_translation_utilities.$sym62$_PRED, (SubLObject)ConsesLow.list(sksi_field_translation_utilities.$const53$meaningSentenceOfSchema, logical_schema, reader.bq_cons((SubLObject)sksi_field_translation_utilities.$sym62$_PRED, logical_field_indexicals2)), mapping_mt, (SubLObject)sksi_field_translation_utilities.UNPROVIDED);
                        if (sksi_field_translation_utilities.NIL != list_utilities.lengthGE(preds, (SubLObject)sksi_field_translation_utilities.TWO_INTEGER, (SubLObject)sksi_field_translation_utilities.UNPROVIDED)) {
                            Errors.warn((SubLObject)sksi_field_translation_utilities.$str63$More_than_one_meaning_sentence_pr, logical_field_indexicals2, raw_sentence_plist);
                        }
                        if (sksi_field_translation_utilities.NIL != preds) {
                            pred = preds.first();
                        }
                        csome_list_var3 = csome_list_var3.rest();
                        logical_schema = csome_list_var3.first();
                    }
                }
                if (sksi_field_translation_utilities.NIL == pred) {
                    Errors.warn((SubLObject)sksi_field_translation_utilities.$str64$Meaning_sentence_not_found_for__S, logical_field_indexicals2, raw_sentence_plist);
                }
                else {
                    result = (SubLObject)ConsesLow.cons(reader.bq_cons(pred, logical_values), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                raw_sentence_plist = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_sksi_field_translation_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_translation_from_gaf", "GET-FIELD-TRANSLATION-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_field_translation_gaf", "DESTRUCTURE-FIELD-TRANSLATION-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "field_translation_fields", "FIELD-TRANSLATION-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "decoding_physical_field_indexicals", "DECODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        new $decoding_physical_field_indexicals$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "decoding_physical_field_indexicals_ordered", "DECODING-PHYSICAL-FIELD-INDEXICALS-ORDERED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "encoding_logical_fields", "ENCODING-LOGICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "encoding_logical_field_indexicals", "ENCODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "encoding_logical_fields_ordered", "ENCODING-LOGICAL-FIELDS-ORDERED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_decoding_from_gaf", "GET-LOGICAL-FIELD-DECODING-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_logical_field_decoding_gaf", "DESTRUCTURE-LOGICAL-FIELD-DECODING-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "logical_field_decoding_logical_field_indexicals", "LOGICAL-FIELD-DECODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_decoding_gafs_for_logical_field", "GET-LOGICAL-FIELD-DECODING-GAFS-FOR-LOGICAL-FIELD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_decoding_gafs_for_logical_field_indexical", "GET-LOGICAL-FIELD-DECODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_decodings_for_logical_field", "GET-LOGICAL-FIELD-DECODINGS-FOR-LOGICAL-FIELD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_encoding_from_gaf", "GET-LOGICAL-FIELD-ENCODING-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_logical_field_encoding_gaf", "DESTRUCTURE-LOGICAL-FIELD-ENCODING-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "logical_field_encoding_logical_field_indexicals", "LOGICAL-FIELD-ENCODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "logical_field_encoding_contains_logical_field_indexicalP", "LOGICAL-FIELD-ENCODING-CONTAINS-LOGICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_encoding_gafs_for_logical_field_indexical", "GET-LOGICAL-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_logical_field_encoding_gafs_from_logical_field_indexical", "GET-LOGICAL-FIELD-ENCODING-GAFS-FROM-LOGICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_decoding_from_gaf", "GET-FIELD-DECODING-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_field_decoding_gaf", "DESTRUCTURE-FIELD-DECODING-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "field_decoding_physical_field_indexicals", "FIELD-DECODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "field_decoding_contains_physical_field_indexicalP", "FIELD-DECODING-CONTAINS-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "field_decoding_contains_physical_field_indexicalsP", "FIELD-DECODING-CONTAINS-PHYSICAL-FIELD-INDEXICALS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "relevant_field_decodings_internal", "RELEVANT-FIELD-DECODINGS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "relevant_field_decodings", "RELEVANT-FIELD-DECODINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "relevant_field_decodings_for_indexical_internal", "RELEVANT-FIELD-DECODINGS-FOR-INDEXICAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "relevant_field_decodings_for_indexical", "RELEVANT-FIELD-DECODINGS-FOR-INDEXICAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_decoding_gafs_for_logical_field_indexical", "GET-FIELD-DECODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_decodings_for_logical_field_indexical", "GET-FIELD-DECODINGS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_decoding_gafs_from_physical_field_indexical", "GET-FIELD-DECODING-GAFS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_decodings_from_physical_field_indexical", "GET-FIELD-DECODINGS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encoding_from_gaf", "GET-FIELD-ENCODING-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_field_encoding_gaf", "DESTRUCTURE-FIELD-ENCODING-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "field_encoding_logical_field_indexicals", "FIELD-ENCODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "isomorphic_field_encoding_p", "ISOMORPHIC-FIELD-ENCODING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "field_encoding_contains_logical_field_indexicalP", "FIELD-ENCODING-CONTAINS-LOGICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "relevant_field_encodings_internal", "RELEVANT-FIELD-ENCODINGS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "relevant_field_encodings", "RELEVANT-FIELD-ENCODINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encoding_gafs_for_physical_field", "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encodings_for_physical_field_internal", "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encodings_for_physical_field", "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encoding_gafs_for_physical_field_indexical_internal", "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encoding_gafs_for_physical_field_indexical", "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encodings_for_physical_field_indexical", "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encoding_gafs_for_logical_field_indexical_internal", "GET-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_field_encoding_gafs_for_logical_field_indexical", "GET-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_decoding_from_gaf", "GET-PHYSICAL-FIELD-DECODING-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_physical_field_decoding_gaf", "DESTRUCTURE-PHYSICAL-FIELD-DECODING-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "physical_field_decoding_physical_field_indexicals", "PHYSICAL-FIELD-DECODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_decoding_gafs_for_physical_field", "GET-PHYSICAL-FIELD-DECODING-GAFS-FOR-PHYSICAL-FIELD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_decodings_for_physical_field", "GET-PHYSICAL-FIELD-DECODINGS-FOR-PHYSICAL-FIELD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_decoding_gafs_for_physical_field_indexical", "GET-PHYSICAL-FIELD-DECODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_decodings_for_physical_field_indexical", "GET-PHYSICAL-FIELD-DECODINGS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_encoding_from_gaf", "GET-PHYSICAL-FIELD-ENCODING-FROM-GAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "destructure_physical_field_encoding_gaf", "DESTRUCTURE-PHYSICAL-FIELD-ENCODING-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "physical_field_encoding_physical_field_indexicals", "PHYSICAL-FIELD-ENCODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "physical_field_encoding_contains_physical_field_indexicalP", "PHYSICAL-FIELD-ENCODING-CONTAINS-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_encoding_gafs_from_physical_field", "GET-PHYSICAL-FIELD-ENCODING-GAFS-FROM-PHYSICAL-FIELD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_encodings_from_physical_field", "GET-PHYSICAL-FIELD-ENCODINGS-FROM-PHYSICAL-FIELD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_encoding_gafs_from_physical_field_indexical", "GET-PHYSICAL-FIELD-ENCODING-GAFS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "get_physical_field_encodings_from_physical_field_indexical", "GET-PHYSICAL-FIELD-ENCODINGS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_encoding", "SKSI-RECONSTRUCT-ENCODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_decoding", "SKSI-RECONSTRUCT-DECODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_logical_field_encoding", "SKSI-RECONSTRUCT-LOGICAL-FIELD-ENCODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_field_encoding", "SKSI-RECONSTRUCT-FIELD-ENCODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_physical_field_encoding", "SKSI-RECONSTRUCT-PHYSICAL-FIELD-ENCODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_logical_field_decoding", "SKSI-RECONSTRUCT-LOGICAL-FIELD-DECODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_field_decoding", "SKSI-RECONSTRUCT-FIELD-DECODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_physical_field_decoding", "SKSI-RECONSTRUCT-PHYSICAL-FIELD-DECODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_reconstruct_translation", "SKSI-RECONSTRUCT-TRANSLATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_decoding_compositions_for_logical_field_indexical", "GENERATE-DECODING-COMPOSITIONS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_decoding_compositions_for_logical_field_indexical_recursive", "GENERATE-DECODING-COMPOSITIONS-FOR-LOGICAL-FIELD-INDEXICAL-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_decoding_compositions_for_physical_field_indexical_recursive", "GENERATE-DECODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_encoding_compositions_for_physical_field_indexical_internal", "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL-INTERNAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_encoding_compositions_for_physical_field_indexical", "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_encoding_compositions_for_physical_field_indexical_recursive", "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_encoding_compositions_for_logical_field_indexical_recursive", "GENERATE-ENCODING-COMPOSITIONS-FOR-LOGICAL-FIELD-INDEXICAL-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_encoding_compositions_from_logical_field_indexical_internal", "GENERATE-ENCODING-COMPOSITIONS-FROM-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "generate_encoding_compositions_from_logical_field_indexical", "GENERATE-ENCODING-COMPOSITIONS-FROM-LOGICAL-FIELD-INDEXICAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "gather_lowest_physical_field_indexicals_for_logical_field_indexical", "GATHER-LOWEST-PHYSICAL-FIELD-INDEXICALS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive", "GATHER-LOWEST-PHYSICAL-FIELD-INDEXICALS-FOR-LOGICAL-FIELD-INDEXICAL-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive", "GATHER-LOWEST-PHYSICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "translations_equivalentP", "TRANSLATIONS-EQUIVALENT?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "translations_equivalent_memoized_internal", "TRANSLATIONS-EQUIVALENT-MEMOIZED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "translations_equivalent_memoized", "TRANSLATIONS-EQUIVALENT-MEMOIZED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "translations_equivalent_int", "TRANSLATIONS-EQUIVALENT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "encodings_equivalentP", "ENCODINGS-EQUIVALENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "decodings_equivalentP", "DECODINGS-EQUIVALENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "some_encodings_equivalentP", "SOME-ENCODINGS-EQUIVALENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "some_decodings_equivalentP", "SOME-DECODINGS-EQUIVALENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_apply_encoding_and_reformulate", "SKSI-APPLY-ENCODING-AND-REFORMULATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_apply_decoding_and_reformulate", "SKSI-APPLY-DECODING-AND-REFORMULATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_apply_translation_and_reformulate", "SKSI-APPLY-TRANSLATION-AND-REFORMULATE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "filter_decodings", "FILTER-DECODINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "filter_decoding", "FILTER-DECODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_translate_logical_sentences_to_physical_sentences", "SKSI-TRANSLATE-LOGICAL-SENTENCES-TO-PHYSICAL-SENTENCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities", "sksi_translate_physical_sentence_plists_to_logical_sentences", "SKSI-TRANSLATE-PHYSICAL-SENTENCE-PLISTS-TO-LOGICAL-SENTENCES", 2, 0, false);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    public static SubLObject init_sksi_field_translation_utilities_file() {
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_field_translation_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym15$RELEVANT_FIELD_DECODINGS);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym22$RELEVANT_FIELD_ENCODINGS);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_field_translation_utilities.$sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED);
        return (SubLObject)sksi_field_translation_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_field_translation_utilities_file();
    }
    
    public void initializeVariables() {
        init_sksi_field_translation_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_field_translation_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_field_translation_utilities();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-TRANSLATION")), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-TRANSLATION-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym2$GAF_ARGS = SubLObjectFactory.makeSymbol("GAF-ARGS");
        $sym3$PHYSICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");
        $sym4$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD-DECODING")), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD-DECODING-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF = SubLObjectFactory.makeSymbol("DESTRUCTURE-FIELD-TRANSLATION-GAF");
        $const7$logicalFieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldDecoding"));
        $kw8$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw9$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD-ENCODING")), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD-ENCODING-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $const12$logicalFieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldEncoding"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-DECODING")), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-DECODING-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym15$RELEVANT_FIELD_DECODINGS = SubLObjectFactory.makeSymbol("RELEVANT-FIELD-DECODINGS");
        $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("RELEVANT-FIELD-DECODINGS-FOR-INDEXICAL");
        $const17$fieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-LOGICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING"));
        $sym19$GET_FIELD_DECODING_FROM_GAF = SubLObjectFactory.makeSymbol("GET-FIELD-DECODING-FROM-GAF");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-ENCODING")), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-ENCODING-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$RELEVANT_FIELD_ENCODINGS = SubLObjectFactory.makeSymbol("RELEVANT-FIELD-ENCODINGS");
        $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD = SubLObjectFactory.makeSymbol("GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD");
        $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL");
        $const25$fieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncoding"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $int27$100 = SubLObjectFactory.makeInteger(100);
        $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GET-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-DECODING")), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-DECODING-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $const31$physicalFieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFieldDecoding"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING"));
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-ENCODING")), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-ENCODING-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $const34$physicalFieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFieldEncoding"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("TO-PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P");
        $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P");
        $sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-EL-FORMULA-P");
        $kw39$SKSI_MISSING_DECODINGS = SubLObjectFactory.makeKeyword("SKSI-MISSING-DECODINGS");
        $kw40$SKSI_MISSING_ENCODINGS = SubLObjectFactory.makeKeyword("SKSI-MISSING-ENCODINGS");
        $str41$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str42$Decoding_loop___a_ = SubLObjectFactory.makeString("Decoding loop: ~a.");
        $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL");
        $str44$Encoding_loop___a_ = SubLObjectFactory.makeString("Encoding loop: ~a.");
        $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GENERATE-ENCODING-COMPOSITIONS-FROM-LOGICAL-FIELD-INDEXICAL");
        $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED = SubLObjectFactory.makeSymbol("TRANSLATIONS-EQUIVALENT-MEMOIZED");
        $sym47$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P");
        $kw48$ENCODE = SubLObjectFactory.makeKeyword("ENCODE");
        $kw49$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $list50 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym51$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym52$RELEVANT_PRED_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ");
        $const53$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentenceOfSchema"));
        $str54$No_meaning_sentence_for__S = SubLObjectFactory.makeString("No meaning sentence for ~S");
        $kw55$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw56$NO_NAME = SubLObjectFactory.makeKeyword("NO-NAME");
        $str57$failure_on_name_for__S = SubLObjectFactory.makeString("failure on name for ~S");
        $kw58$NO_VALUE = SubLObjectFactory.makeKeyword("NO-VALUE");
        $str59$failure_on_value_for__S = SubLObjectFactory.makeString("failure on value for ~S");
        $str60$No_physical_field_for__S = SubLObjectFactory.makeString("No physical field for ~S");
        $sym61$INDEXICAL_FOR_LOGICAL_FIELD = SubLObjectFactory.makeSymbol("INDEXICAL-FOR-LOGICAL-FIELD");
        $sym62$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $str63$More_than_one_meaning_sentence_pr = SubLObjectFactory.makeString("More than one meaning sentence pred found for ~S (from ~S)");
        $str64$Meaning_sentence_not_found_for__S = SubLObjectFactory.makeString("Meaning sentence not found for ~S (from ~S)");
    }
    
    public static final class $decoding_physical_field_indexicals$UnaryFunction extends UnaryFunction
    {
        public $decoding_physical_field_indexicals$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DECODING-PHYSICAL-FIELD-INDEXICALS"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_field_translation_utilities.decoding_physical_field_indexicals(arg1);
        }
    }
}

/*

	Total time: 2521 ms
	
*/