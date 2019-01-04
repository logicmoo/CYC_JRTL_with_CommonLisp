package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_meaning_sentence_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities";
    public static final String myFingerPrint = "f73edf48c45188997b8348b8f1d088667f11e363122551ad716ab431c339d686";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 10085L)
    private static SubLSymbol $appropriate_antecedent_literal_tmp_args$;
    private static final SubLObject $const0$meaningSentenceOfSchema;
    private static final SubLObject $const1$conditionalMeaningSentenceOfSchem;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym4$GAF_ARGS;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CLET;
    private static final SubLSymbol $sym7$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym8$GET_ANTECEDENT_MEANING_SENTENCE_FROM_GAF;
    private static final SubLSymbol $sym9$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym10$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym13$GET_ANTECEDENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym14$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym15$GET_CONSEQUENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym16$GET_RELEVANT_MEANING_SENTENCE_FROM_GAF;
    private static final SubLInteger $int17$1000;
    private static final SubLSymbol $sym18$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT;
    private static final SubLSymbol $sym19$LOGICAL_SCHEMA_SOURCES;
    private static final SubLSymbol $sym20$SINGLETON_;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$CON_LFS;
    private static final SubLSymbol $sym23$EXPRESSION_LOGICAL_FIELDS_FOR_INDEXICALS;
    private static final SubLSymbol $sym24$_APPROPRIATE_ANTECEDENT_LITERAL_TMP_ARGS_;
    private static final SubLSymbol $sym25$LIST;
    private static final SubLSymbol $sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_;
    private static final SubLSymbol $sym27$APPROPRIATE_ANTECEDENT_LITERAL_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$LOGICAL_FIELDS_JOINABLE_;
    private static final SubLSymbol $kw30$RAW;
    private static final SubLSymbol $sym31$LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED;
    private static final SubLSymbol $kw32$TRUE;
    private static final SubLSymbol $sym33$GAF_FORMULA;
    private static final SubLSymbol $sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI;
    private static final SubLSymbol $sym35$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_P;
    private static final SubLSymbol $sym36$MEANING_SENTENCE_PRED_RELEVANT_;
    private static final SubLSymbol $sym37$RELEVANT_PRED_IS_EQ;
    private static final SubLSymbol $sym38$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLSymbol $sym39$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLSymbol $sym40$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE;
    private static final SubLSymbol $sym41$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED;
    private static final SubLSymbol $sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G;
    private static final SubLSymbol $sym43$LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS;
    private static final SubLSymbol $sym44$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES;
    private static final SubLSymbol $sym45$RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES;
    private static final SubLSymbol $sym46$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF_UNWRAPPING_ISTS;
    private static final SubLSymbol $sym47$LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED;
    private static final SubLSymbol $sym48$LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $sym49$SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL;
    private static final SubLSymbol $kw50$ROBUST;
    private static final SubLSymbol $sym51$MEANING_SENTENCE_TYPE_CHECK_MEMOIZED;
    private static final SubLString $str52$__SKSI__A_;
    private static final SubLString $str53$meaning_sentence_type_check_int_f;
    private static final SubLSymbol $sym54$MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED;
    private static final SubLSymbol $kw55$WEAK;
    private static final SubLSymbol $kw56$STRICT;
    private static final SubLSymbol $kw57$PEDANTIC;
    private static final SubLSymbol $sym58$GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED;
    private static final SubLSymbol $kw59$OR;
    private static final SubLSymbol $kw60$UNIFY;
    private static final SubLSymbol $kw61$SPEC_PRED;
    private static final SubLSymbol $kw62$NOT_FULLY_BOUND;
    private static final SubLSymbol $kw63$SPEC_INVERSE;
    private static final SubLString $str64$Unknown_strength__a_;
    private static final SubLObject $const65$isa;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$_;
    private static final SubLSymbol $sym68$GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED;
    private static final SubLSymbol $sym69$EL_VARIABLE_P;
    private static final SubLSymbol $sym70$COLLECTION_P;
    private static final SubLSymbol $sym71$PREDICATE_P;
    private static final SubLSymbol $sym72$CYCL_NAT_P;
    private static final SubLSymbol $kw73$ISA_MEMOIZED;
    private static final SubLSymbol $kw74$NOT_ISA_DISJOINT_MEMOIZED;
    private static final SubLSymbol $kw75$ISA;
    private static final SubLSymbol $kw76$NOT_ISA_DISJOINT;
    private static final SubLSymbol $kw77$AND;
    private static final SubLSymbol $kw78$ANYTHING;
    private static final SubLSymbol $kw79$EL_VARIABLE;
    private static final SubLSymbol $kw80$SPEC;
    private static final SubLSymbol $kw81$NAT;
    private static final SubLSymbol $sym82$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P;
    private static final SubLSymbol $sym83$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P;
    private static final SubLSymbol $sym84$FIND_NART;
    private static final SubLSymbol $sym85$SKSI_VALID_MEANING_SENTENCE_PRED_P;
    private static final SubLSymbol $sym86$SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P;
    private static final SubLSymbol $sym87$LOGICAL_FIELD_FOR_INDEXICAL;
    private static final SubLSymbol $sym88$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLObject $const89$equals;
    private static final SubLSymbol $kw90$IGNORE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 1127L)
    public static SubLObject meaning_sentence_gaf_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != ordinary_meaning_sentence_gaf_p(v_object) || sksi_meaning_sentence_utilities.NIL != conditional_meaning_sentence_gaf_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 1369L)
    public static SubLObject ordinary_meaning_sentence_gaf_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != assertions_high.gaf_assertionP(v_object) && assertions_high.gaf_predicate(v_object).eql(sksi_meaning_sentence_utilities.$const0$meaningSentenceOfSchema));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 1529L)
    public static SubLObject conditional_meaning_sentence_gaf_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != assertions_high.gaf_assertionP(v_object) && sksi_meaning_sentence_utilities.NIL != gaf_assertion_is_conditional_meaning_sentence_gafP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 1698L)
    public static SubLObject gaf_assertion_is_conditional_meaning_sentence_gafP(final SubLObject gaf) {
        return Equality.eq(assertions_high.gaf_predicate(gaf), sksi_meaning_sentence_utilities.$const1$conditionalMeaningSentenceOfSchem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 1845L)
    public static SubLObject get_logical_schema_from_meaning_sentence_gaf(final SubLObject meaning_sentence_gaf) {
        return assertions_high.gaf_arg1(meaning_sentence_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 1971L)
    public static SubLObject get_logical_schemata_from_meaning_sentence_gaf(final SubLObject meaning_sentence_gaf) {
        return (SubLObject)ConsesLow.list(assertions_high.gaf_arg1(meaning_sentence_gaf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 2105L)
    public static SubLObject get_meaning_sentence_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meaning_sentence = assertions_high.gaf_arg2(meaning_sentence_gaf);
        if (sksi_meaning_sentence_utilities.NIL != unwrap_istsP) {
            thread.resetMultipleValues();
            final SubLObject formula = unwrap_meaning_sentence_if_ist(meaning_sentence);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            meaning_sentence = formula;
        }
        return meaning_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 2588L)
    public static SubLObject get_meaning_sentence_pred_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject meaning_sentence = get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP);
        return cycl_utilities.formula_operator(meaning_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 2832L)
    public static SubLObject destructure_meaning_sentence_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list2);
        logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list2);
        meaning_sentence = current.first();
        current = current.rest();
        if (sksi_meaning_sentence_utilities.NIL == current) {
            current = temp;
            SubLObject meaning_sentence_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list2);
            meaning_sentence_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_meaning_sentence_utilities.$sym3$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(logical_schema, meaning_sentence), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym4$GAF_ARGS, meaning_sentence_gaf), ConsesLow.append(body, (SubLObject)sksi_meaning_sentence_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_meaning_sentence_utilities.$list2);
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 3085L)
    public static SubLObject get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(final SubLObject conditional_meaning_sentence_gaf) {
        return el_utilities.el_extensional_set_elements(assertions_high.gaf_arg1(conditional_meaning_sentence_gaf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 3290L)
    public static SubLObject get_antecedent_meaning_sentence_from_gaf(final SubLObject conditional_meaning_sentence_gaf) {
        return assertions_high.gaf_arg2(conditional_meaning_sentence_gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 3435L)
    public static SubLObject get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject schemata = assertions_high.gaf_arg3(conditional_meaning_sentence_gaf);
        return (SubLObject)((sksi_meaning_sentence_utilities.NIL != el_utilities.el_set_p(schemata)) ? el_utilities.el_extensional_set_elements(schemata) : ConsesLow.list(schemata));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 3729L)
    public static SubLObject get_consequent_meaning_sentence_from_gaf(final SubLObject conditional_meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meaning_sentence = assertions_high.gaf_arg4(conditional_meaning_sentence_gaf);
        if (sksi_meaning_sentence_utilities.NIL != unwrap_istsP) {
            thread.resetMultipleValues();
            final SubLObject formula = unwrap_meaning_sentence_if_ist(meaning_sentence);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            meaning_sentence = formula;
        }
        return meaning_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 4113L)
    public static SubLObject get_consequent_meaning_sentence_from_gaf_unwrapping_ists(final SubLObject conditional_meaning_sentence_gaf) {
        return get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, (SubLObject)sksi_meaning_sentence_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 4311L)
    public static SubLObject destructure_conditional_meaning_sentence_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject antecedent_logical_schemata = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject antecedent_meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject consequent_logical_schemata = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject consequent_meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
        antecedent_logical_schemata = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
        antecedent_meaning_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
        consequent_logical_schemata = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
        consequent_meaning_sentence = current.first();
        current = current.rest();
        if (sksi_meaning_sentence_utilities.NIL == current) {
            current = temp;
            SubLObject conditional_meaning_sentence_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
            conditional_meaning_sentence_gaf = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_meaning_sentence_utilities.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(antecedent_logical_schemata, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym7$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence_gaf)), (SubLObject)ConsesLow.list(antecedent_meaning_sentence, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym8$GET_ANTECEDENT_MEANING_SENTENCE_FROM_GAF, conditional_meaning_sentence_gaf)), (SubLObject)ConsesLow.list(consequent_logical_schemata, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym9$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence_gaf)), (SubLObject)ConsesLow.list(consequent_meaning_sentence, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym10$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF, conditional_meaning_sentence_gaf))), ConsesLow.append(body, (SubLObject)sksi_meaning_sentence_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_meaning_sentence_utilities.$list5);
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 5113L)
    public static SubLObject destructure_conditional_meaning_sentence(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject antecedent_logical_schemata = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject antecedent_meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject consequent_logical_schemata = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject consequent_meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
        antecedent_logical_schemata = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
        antecedent_meaning_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
        consequent_logical_schemata = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
        consequent_meaning_sentence = current.first();
        current = current.rest();
        if (sksi_meaning_sentence_utilities.NIL == current) {
            current = temp;
            SubLObject conditional_meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
            conditional_meaning_sentence = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_meaning_sentence_utilities.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(antecedent_logical_schemata, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym12$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), (SubLObject)ConsesLow.list(antecedent_meaning_sentence, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym13$GET_ANTECEDENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), (SubLObject)ConsesLow.list(consequent_logical_schemata, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym14$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence)), (SubLObject)ConsesLow.list(consequent_meaning_sentence, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym15$GET_CONSEQUENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE, conditional_meaning_sentence))), ConsesLow.append(body, (SubLObject)sksi_meaning_sentence_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_meaning_sentence_utilities.$list11);
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 5931L)
    public static SubLObject get_antecedent_logical_schemata_from_conditional_meaning_sentence(final SubLObject cms) {
        return el_utilities.el_extensional_set_elements(cycl_utilities.formula_arg1(cms, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 6080L)
    public static SubLObject get_antecedent_meaning_sentence_from_conditional_meaning_sentence(final SubLObject cms) {
        return cycl_utilities.formula_arg2(cms, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 6199L)
    public static SubLObject get_consequent_logical_schemata_from_conditional_meaning_sentence(final SubLObject cms) {
        final SubLObject schemata = cycl_utilities.formula_arg3(cms, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        return (SubLObject)((sksi_meaning_sentence_utilities.NIL != el_utilities.el_set_p(schemata)) ? el_utilities.el_extensional_set_elements(schemata) : ConsesLow.list(schemata));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 6438L)
    public static SubLObject get_consequent_meaning_sentence_from_conditional_meaning_sentence(final SubLObject cms) {
        return cycl_utilities.formula_arg4(cms, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 6557L)
    public static SubLObject get_relevant_meaning_sentence_from_gaf_internal(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return (sksi_meaning_sentence_utilities.NIL != gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf)) ? get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP) : get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 6557L)
    public static SubLObject get_relevant_meaning_sentence_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return get_relevant_meaning_sentence_from_gaf_internal(meaning_sentence_gaf, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym16$GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym16$GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.$int17$1000, (SubLObject)sksi_meaning_sentence_utilities.EQL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym16$GET_RELEVANT_MEANING_SENTENCE_FROM_GAF, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(meaning_sentence_gaf, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (meaning_sentence_gaf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && unwrap_istsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_relevant_meaning_sentence_from_gaf_internal(meaning_sentence_gaf, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(meaning_sentence_gaf, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 7163L)
    public static SubLObject get_relevant_logical_schemata_and_meaning_sentence_from_gaf(final SubLObject meaning_sentence_gaf, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return (sksi_meaning_sentence_utilities.NIL != gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf)) ? Values.values(get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf), get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP)) : Values.values(get_logical_schemata_from_meaning_sentence_gaf(meaning_sentence_gaf), get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_istsP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 7723L)
    public static SubLObject supported_conditional_meaning_sentence_gaf_p(final SubLObject v_object, SubLObject sks) {
        if (sks == sksi_meaning_sentence_utilities.UNPROVIDED) {
            sks = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != conditional_meaning_sentence_gaf_p(v_object) && sksi_meaning_sentence_utilities.NIL != supported_conditional_meaning_sentence_gaf_int(v_object, sks, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 8270L)
    public static SubLObject supported_conditional_meaning_sentence_gaf_int_internal(final SubLObject cms_gaf, final SubLObject sks, final SubLObject mt_info) {
        final SubLObject ant_ls_set = get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject ant_ms = get_antecedent_meaning_sentence_from_gaf(cms_gaf);
        final SubLObject con_ls_set = get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject con_ms = get_consequent_meaning_sentence_from_gaf(cms_gaf, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != appropriate_logical_schemata_setsP(ant_ls_set, con_ls_set, sks) && sksi_meaning_sentence_utilities.NIL != appropriate_consequent_meaning_sentenceP(ant_ms, con_ms, ant_ls_set, con_ls_set, cms_gaf) && sksi_meaning_sentence_utilities.NIL != appropriate_antecedent_meaning_sentenceP(ant_ms, con_ms, ant_ls_set, con_ls_set, cms_gaf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 8270L)
    public static SubLObject supported_conditional_meaning_sentence_gaf_int(final SubLObject cms_gaf, final SubLObject sks, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return supported_conditional_meaning_sentence_gaf_int_internal(cms_gaf, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym18$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym18$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, (SubLObject)sksi_meaning_sentence_utilities.THREE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym18$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cms_gaf, sks, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cms_gaf.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sks.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(supported_conditional_meaning_sentence_gaf_int_internal(cms_gaf, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cms_gaf, sks, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 8756L)
    public static SubLObject appropriate_logical_schemata_setsP(final SubLObject ant_ls_set, final SubLObject con_ls_set, SubLObject sks) {
        if (sksi_meaning_sentence_utilities.NIL != list_utilities.singletonP(ant_ls_set) && sksi_meaning_sentence_utilities.NIL != list_utilities.member_eqP(ant_ls_set.first(), con_ls_set)) {
            return (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject con_ks_set = Mapping.mapcar((SubLObject)sksi_meaning_sentence_utilities.$sym19$LOGICAL_SCHEMA_SOURCES, con_ls_set);
        final SubLObject ant_ks_set = Mapping.mapcar((SubLObject)sksi_meaning_sentence_utilities.$sym19$LOGICAL_SCHEMA_SOURCES, ant_ls_set);
        if (sksi_meaning_sentence_utilities.NIL == list_utilities.every_in_list((SubLObject)sksi_meaning_sentence_utilities.$sym20$SINGLETON_, con_ks_set, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) || sksi_meaning_sentence_utilities.NIL == list_utilities.every_in_list((SubLObject)sksi_meaning_sentence_utilities.$sym20$SINGLETON_, ant_ks_set, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.sk_source_p(sks)) {
            sks = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(conses_high.union(con_ls_set, ant_ls_set, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
        }
        SubLObject inappropriateP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject con_ks_list;
            for (csome_list_var = con_ks_set, con_ks_list = (SubLObject)sksi_meaning_sentence_utilities.NIL, con_ks_list = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == inappropriateP && sksi_meaning_sentence_utilities.NIL != csome_list_var; inappropriateP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.sk_source_sub_ksP(sks, con_ks_list.first())), csome_list_var = csome_list_var.rest(), con_ks_list = csome_list_var.first()) {}
        }
        if (sksi_meaning_sentence_utilities.NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject ant_ks_list;
            for (csome_list_var = ant_ks_set, ant_ks_list = (SubLObject)sksi_meaning_sentence_utilities.NIL, ant_ks_list = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == inappropriateP && sksi_meaning_sentence_utilities.NIL != csome_list_var; inappropriateP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.sk_source_sub_ksP(sks, ant_ks_list.first())), csome_list_var = csome_list_var.rest(), ant_ks_list = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == inappropriateP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 10158L)
    public static SubLObject with_appropriate_meaning_sentence_tmp_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject meaning_sentences = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject con_ms = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject ant_ls_set = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list21);
        meaning_sentences = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list21);
        con_ms = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list21);
        ant_ls_set = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_meaning_sentence_utilities.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym22$CON_LFS, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym23$EXPRESSION_LOGICAL_FIELDS_FOR_INDEXICALS, con_ms)), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym24$_APPROPRIATE_ANTECEDENT_LITERAL_TMP_ARGS_, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$sym25$LIST, meaning_sentences, (SubLObject)sksi_meaning_sentence_utilities.$sym22$CON_LFS, ant_ls_set))), ConsesLow.append(body, (SubLObject)sksi_meaning_sentence_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 10491L)
    public static SubLObject logical_schemata_relevant_meaning_sentences(final SubLObject ls_set, final SubLObject cms_gaf) {
        SubLObject result = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = ls_set;
        SubLObject ls = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        ls = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            result = ConsesLow.nconc(result, logical_schema_meaning_sentences_relevant_to_appropriateness_check(ls, cms_gaf, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 10759L)
    public static SubLObject logical_schema_meaning_sentences_relevant_to_appropriateness_check(final SubLObject ls, final SubLObject cms_gaf, SubLObject include_consequent_cmsesP) {
        if (include_consequent_cmsesP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            include_consequent_cmsesP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (sksi_meaning_sentence_utilities.NIL != include_consequent_cmsesP) {
            return list_utilities.fast_delete_duplicates(ConsesLow.append(asserted_logical_schema_meaning_sentences(ls, (SubLObject)sksi_meaning_sentence_utilities.T), logical_schema_consequent_meaning_sentences(ls, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.T, cms_gaf, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        return list_utilities.fast_delete_duplicates(asserted_logical_schema_meaning_sentences(ls, (SubLObject)sksi_meaning_sentence_utilities.T), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 11200L)
    public static SubLObject logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check(final SubLObject ls, final SubLObject cms_gaf, SubLObject check_supportednessP) {
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return logical_schema_consequent_conditional_meaning_sentence_gafs(ls, (SubLObject)sksi_meaning_sentence_utilities.T, cms_gaf, check_supportednessP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 11455L)
    public static SubLObject appropriate_consequent_meaning_sentenceP(final SubLObject ant_ms, final SubLObject con_ms, final SubLObject ant_ls_set, final SubLObject con_ls_set, final SubLObject cms_gaf) {
        return appropriate_consequent_literalP(con_ms, con_ls_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 11658L)
    public static SubLObject appropriate_consequent_literalP(final SubLObject lit, final SubLObject con_ls_set) {
        final SubLObject lit_lfis = meaning_sentence_logical_field_indexicals(lit);
        SubLObject inappropriateP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject lfi;
            for (csome_list_var = lit_lfis, lfi = (SubLObject)sksi_meaning_sentence_utilities.NIL, lfi = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == inappropriateP && sksi_meaning_sentence_utilities.NIL != csome_list_var; inappropriateP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == subl_promotions.memberP(lfi, con_ls_set, (SubLObject)sksi_meaning_sentence_utilities.$sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)), csome_list_var = csome_list_var.rest(), lfi = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == inappropriateP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 12165L)
    public static SubLObject appropriate_antecedent_meaning_sentenceP(final SubLObject ant_ms, final SubLObject con_ms, final SubLObject ant_ls_set, final SubLObject con_ls_set, final SubLObject cms_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ant_ls_ms_list = logical_schemata_relevant_meaning_sentences(ant_ls_set, cms_gaf);
        final SubLObject con_ls_ms_list = logical_schemata_relevant_meaning_sentences(con_ls_set, cms_gaf);
        final SubLObject ms_list = list_utilities.fast_delete_duplicates(ConsesLow.nconc(ant_ls_ms_list, con_ls_ms_list), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject appropriateP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        final SubLObject con_lfs = sksi_infrastructure_utilities.expression_logical_fields_for_indexicals(con_ms);
        final SubLObject _prev_bind_0 = sksi_meaning_sentence_utilities.$appropriate_antecedent_literal_tmp_args$.currentBinding(thread);
        try {
            sksi_meaning_sentence_utilities.$appropriate_antecedent_literal_tmp_args$.bind((SubLObject)ConsesLow.list(ms_list, con_lfs, ant_ls_set), thread);
            appropriateP = cycl_grammar.cycl_boolean_combination_of_type((SubLObject)sksi_meaning_sentence_utilities.$sym27$APPROPRIATE_ANTECEDENT_LITERAL_, ant_ms);
        }
        finally {
            sksi_meaning_sentence_utilities.$appropriate_antecedent_literal_tmp_args$.rebind(_prev_bind_0, thread);
        }
        return appropriateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 12744L)
    public static SubLObject appropriate_antecedent_literalP(final SubLObject lit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = sksi_meaning_sentence_utilities.$appropriate_antecedent_literal_tmp_args$.getDynamicValue(thread);
        SubLObject meaning_sentences = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject con_lfs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject ant_ls_set = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list28);
        meaning_sentences = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list28);
        con_lfs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_meaning_sentence_utilities.$list28);
        ant_ls_set = current.first();
        current = current.rest();
        if (sksi_meaning_sentence_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_meaning_sentence_utilities.$list28);
            return (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLObject lit_lfis = meaning_sentence_logical_field_indexicals(lit);
        SubLObject inappropriateP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject lfi;
            for (csome_list_var = lit_lfis, lfi = (SubLObject)sksi_meaning_sentence_utilities.NIL, lfi = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == inappropriateP && sksi_meaning_sentence_utilities.NIL != csome_list_var; inappropriateP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == subl_promotions.memberP(lfi, ant_ls_set, (SubLObject)sksi_meaning_sentence_utilities.$sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)), csome_list_var = csome_list_var.rest(), lfi = csome_list_var.first()) {}
        }
        if (sksi_meaning_sentence_utilities.NIL != inappropriateP) {
            return (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLObject lit_lfs = sksi_kb_accessors.logical_fields_for_indexicals(lit_lfis);
        return (sksi_meaning_sentence_utilities.NIL != sksi_query_utilities.comparison_literal_p(lit) || sksi_meaning_sentence_utilities.NIL != sksi_query_utilities.evaluate_literal_p(lit)) ? appropriate_antecedent_comparison_literalP(lit, lit_lfs, meaning_sentences, con_lfs) : appropriate_antecedent_other_literalP(lit, lit_lfs, meaning_sentences, con_lfs, ant_ls_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 13691L)
    public static SubLObject appropriate_antecedent_comparison_literalP(final SubLObject lit, final SubLObject lit_lfs, final SubLObject meaning_sentences, final SubLObject con_lfs) {
        SubLObject inappropriateP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject lit_lf;
            for (csome_list_var = lit_lfs, lit_lf = (SubLObject)sksi_meaning_sentence_utilities.NIL, lit_lf = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == inappropriateP && sksi_meaning_sentence_utilities.NIL != csome_list_var; inappropriateP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == antecedent_logical_field_joinable_with_consequent_logical_fieldsP(lit_lf, meaning_sentences, con_lfs)), csome_list_var = csome_list_var.rest(), lit_lf = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == inappropriateP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 14391L)
    public static SubLObject antecedent_logical_field_joinable_with_consequent_logical_fieldsP(final SubLObject lit_lf, final SubLObject meaning_sentences, final SubLObject con_lfs) {
        if (sksi_meaning_sentence_utilities.NIL != subl_promotions.memberP(lit_lf, con_lfs, (SubLObject)sksi_meaning_sentence_utilities.$sym29$LOGICAL_FIELDS_JOINABLE_, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        SubLObject matchP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == matchP) {
            SubLObject csome_list_var = meaning_sentences;
            SubLObject ms = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            ms = csome_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL == matchP && sksi_meaning_sentence_utilities.NIL != csome_list_var) {
                final SubLObject ms_lfs = sksi_infrastructure_utilities.expression_logical_fields_for_indexicals(ms);
                matchP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != subl_promotions.memberP(lit_lf, ms_lfs, (SubLObject)sksi_meaning_sentence_utilities.$sym29$LOGICAL_FIELDS_JOINABLE_, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) && sksi_meaning_sentence_utilities.NIL != keyhash_utilities.fast_intersectP(con_lfs, ms_lfs, (SubLObject)sksi_meaning_sentence_utilities.$sym29$LOGICAL_FIELDS_JOINABLE_, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
                csome_list_var = csome_list_var.rest();
                ms = csome_list_var.first();
            }
        }
        return matchP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 14869L)
    public static SubLObject appropriate_antecedent_other_literalP(final SubLObject lit, final SubLObject lit_lfs, final SubLObject meaning_sentences, final SubLObject con_lfs, final SubLObject ant_ls_set) {
        SubLObject appropriateP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL != cycl_grammar.cycl_literal_p(lit)) {
            SubLObject foundP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            if (sksi_meaning_sentence_utilities.NIL == foundP) {
                SubLObject csome_list_var = ant_ls_set;
                SubLObject ls = (SubLObject)sksi_meaning_sentence_utilities.NIL;
                ls = csome_list_var.first();
                while (sksi_meaning_sentence_utilities.NIL == foundP && sksi_meaning_sentence_utilities.NIL != csome_list_var) {
                    final SubLObject ls_lfs = sksi_kb_accessors.logical_schema_fields(ls);
                    foundP = list_utilities.fast_subsetP(lit_lfs, ls_lfs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
                    csome_list_var = csome_list_var.rest();
                    ls = csome_list_var.first();
                }
            }
            if (sksi_meaning_sentence_utilities.NIL == foundP) {
                return (SubLObject)sksi_meaning_sentence_utilities.NIL;
            }
            final SubLObject lit_meaning_sentences = meaning_sentences_type_check(lit, meaning_sentences, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.$kw30$RAW);
            if (sksi_meaning_sentence_utilities.NIL != lit_meaning_sentences) {
                appropriateP = (SubLObject)sksi_meaning_sentence_utilities.T;
            }
        }
        return appropriateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 16372L)
    public static SubLObject logical_schema_meaning_sentence_gafs(final SubLObject logical_schema, SubLObject memoizeP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? logical_schema_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) : logical_schema_meaning_sentence_gafs_int(logical_schema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 16845L)
    public static SubLObject logical_schema_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject mt_info) {
        return logical_schema_meaning_sentence_gafs_int(logical_schema);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 16845L)
    public static SubLObject logical_schema_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym31$LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym31$LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym31$LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 17034L)
    public static SubLObject logical_schema_meaning_sentence_gafs_int(final SubLObject logical_schema) {
        return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_meaning_sentence_utilities.$const0$meaningSentenceOfSchema, (SubLObject)sksi_meaning_sentence_utilities.ONE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.$kw32$TRUE), Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQUAL), (SubLObject)sksi_meaning_sentence_utilities.$sym33$GAF_FORMULA, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 17231L)
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schema, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), ignore_cms_gaf, check_supportednessP) : logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, ignore_cms_gaf, check_supportednessP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 17908L)
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, ignore_cms_gaf, check_supportednessP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 17908L)
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, (SubLObject)sksi_meaning_sentence_utilities.FOUR_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt_info.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ignore_cms_gaf.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && check_supportednessP.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, mt_info, ignore_cms_gaf, check_supportednessP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 18229L)
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_int(final SubLObject logical_schema, SubLObject ignore_cms_gaf, SubLObject check_supportednessP) {
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject indexed_cms_gafs = kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_meaning_sentence_utilities.$const1$conditionalMeaningSentenceOfSchem, (SubLObject)sksi_meaning_sentence_utilities.THREE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.$kw32$TRUE);
        final SubLObject unindexed_cms_gafs = logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs(logical_schema);
        SubLObject cms_gafs = ConsesLow.append(unindexed_cms_gafs, indexed_cms_gafs);
        if (sksi_meaning_sentence_utilities.NIL != ignore_cms_gaf) {
            cms_gafs = Sequences.remove(ignore_cms_gaf, cms_gafs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        if (sksi_meaning_sentence_utilities.NIL != check_supportednessP) {
            return list_utilities.find_all_if((SubLObject)sksi_meaning_sentence_utilities.$sym35$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_P, cms_gafs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        return cms_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 18862L)
    public static SubLObject logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schema) {
        final SubLObject all_other_assertions = kb_mapping.gather_other_index(logical_schema);
        SubLObject cms_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = all_other_assertions;
        SubLObject assertion = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL != conditional_meaning_sentence_gaf_p(assertion)) {
                final SubLObject con_ls_list = get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(assertion);
                if (sksi_meaning_sentence_utilities.NIL != list_utilities.lengthG(con_ls_list, (SubLObject)sksi_meaning_sentence_utilities.ONE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) && sksi_meaning_sentence_utilities.NIL != list_utilities.member_eqP(logical_schema, con_ls_list)) {
                    cms_gafs = (SubLObject)ConsesLow.cons(assertion, cms_gafs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Sequences.nreverse(cms_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 19420L)
    public static SubLObject meaning_sentence_pred_relevantP_internal(final SubLObject meaning_sentence_pred, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_meaning_sentence_utilities.NIL != variables.not_fully_bound_p(pred)) {
            return sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred);
        }
        SubLObject relevantP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (pred_relevance_function.eql((SubLObject)sksi_meaning_sentence_utilities.$sym37$RELEVANT_PRED_IS_EQ)) {
            final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)sksi_meaning_sentence_utilities.$sym37$RELEVANT_PRED_IS_EQ, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pred_relevance_function.eql((SubLObject)sksi_meaning_sentence_utilities.$sym38$RELEVANT_PRED_IS_SPEC_PRED)) {
            final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)sksi_meaning_sentence_utilities.$sym38$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pred_relevance_function.eql((SubLObject)sksi_meaning_sentence_utilities.$sym39$RELEVANT_PRED_IS_SPEC_INVERSE)) {
            final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)sksi_meaning_sentence_utilities.$sym39$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pred_relevance_function.eql((SubLObject)sksi_meaning_sentence_utilities.$sym40$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE)) {
            final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)sksi_meaning_sentence_utilities.$sym40$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                relevantP = pred_relevance_macros.relevant_predP(meaning_sentence_pred);
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        return relevantP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 19420L)
    public static SubLObject meaning_sentence_pred_relevantP(final SubLObject meaning_sentence_pred, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return meaning_sentence_pred_relevantP_internal(meaning_sentence_pred, pred, pred_relevance_function, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym36$MEANING_SENTENCE_PRED_RELEVANT_, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym36$MEANING_SENTENCE_PRED_RELEVANT_, (SubLObject)sksi_meaning_sentence_utilities.FOUR_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym36$MEANING_SENTENCE_PRED_RELEVANT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(meaning_sentence_pred, pred, pred_relevance_function, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (meaning_sentence_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pred_relevance_function.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(meaning_sentence_pred_relevantP_internal(meaning_sentence_pred, pred, pred_relevance_function, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(meaning_sentence_pred, pred, pred_relevance_function, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 20035L)
    public static SubLObject relevant_logical_schema_meaning_sentence_gafs(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? relevant_logical_schema_meaning_sentence_gafs_memoized(logical_schema, pred, pred_relevance_function, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), ignore_istsP) : relevant_logical_schema_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_istsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 20839L)
    public static SubLObject relevant_logical_schema_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, final SubLObject ignore_istsP) {
        return relevant_logical_schema_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_istsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 20839L)
    public static SubLObject relevant_logical_schema_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, final SubLObject ignore_istsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return relevant_logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym41$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym41$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.FIVE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym41$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pred_relevance_function.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt_info.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && ignore_istsP.eql(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_logical_schema_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, pred, pred_relevance_function, mt_info, ignore_istsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 21130L)
    public static SubLObject relevant_logical_schema_meaning_sentence_gafs_int(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject ignore_istsP) {
        final SubLObject all_ms_gafs = logical_schema_meaning_sentence_gafs_memoized(logical_schema, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
        SubLObject relevant_ms_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = all_ms_gafs;
        SubLObject ms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        ms_gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject meaning_sentence = get_meaning_sentence_from_gaf(ms_gaf, ignore_istsP);
            final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(meaning_sentence);
            final SubLObject pred_relevantP = meaning_sentence_pred_relevantP(meaning_sentence_pred, pred, pred_relevance_function, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            if (sksi_meaning_sentence_utilities.NIL != pred_relevantP || sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred)) {
                relevant_ms_gafs = (SubLObject)ConsesLow.cons(ms_gaf, relevant_ms_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ms_gaf = cdolist_list_var.first();
        }
        return relevant_ms_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 21834L)
    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(logical_schema, pred, pred_relevance_function, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), ignore_cms_gaf, check_supportednessP, ignore_istsP) : relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_cms_gaf, check_supportednessP, ignore_istsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 23051L)
    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(logical_schema, pred, pred_relevance_function, ignore_cms_gaf, check_supportednessP, ignore_istsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 23051L)
    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, final SubLObject mt_info, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, (SubLObject)sksi_meaning_sentence_utilities.SEVEN_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pred_relevance_function.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt_info.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ignore_cms_gaf.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (check_supportednessP.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && ignore_istsP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, pred, pred_relevance_function, mt_info, ignore_cms_gaf, check_supportednessP, ignore_istsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 23556L)
    public static SubLObject logical_schema_conditional_meaning_sentence_gafs_internal(final SubLObject logical_schema, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        return kb_mapping_utilities.pred_value_gafs(logical_schema, sksi_meaning_sentence_utilities.$const1$conditionalMeaningSentenceOfSchem, (SubLObject)sksi_meaning_sentence_utilities.THREE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.$kw32$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 23556L)
    public static SubLObject logical_schema_conditional_meaning_sentence_gafs(final SubLObject logical_schema, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return logical_schema_conditional_meaning_sentence_gafs_internal(logical_schema, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym43$LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym43$LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQ, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym43$LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_conditional_meaning_sentence_gafs_internal(logical_schema, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 23790L)
    public static SubLObject relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int(final SubLObject logical_schema, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject ignore_istsP) {
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        SubLObject all_cms_gafs = logical_schema_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL != ignore_cms_gaf) {
            all_cms_gafs = Sequences.remove(ignore_cms_gaf, all_cms_gafs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        SubLObject relevant_cms_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = all_cms_gafs;
        SubLObject cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        cms_gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject consequent_meaning_sentence = get_consequent_meaning_sentence_from_gaf(cms_gaf, ignore_istsP);
            final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(consequent_meaning_sentence);
            final SubLObject pred_relevantP = meaning_sentence_pred_relevantP(meaning_sentence_pred, pred, pred_relevance_function, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            if ((sksi_meaning_sentence_utilities.NIL != pred_relevantP || sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred)) && (sksi_meaning_sentence_utilities.NIL == check_supportednessP || sksi_meaning_sentence_utilities.NIL != supported_conditional_meaning_sentence_gaf_p(cms_gaf, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED))) {
                relevant_cms_gafs = (SubLObject)ConsesLow.cons(cms_gaf, relevant_cms_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cms_gaf = cdolist_list_var.first();
        }
        return relevant_cms_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 24836L)
    public static SubLObject asserted_logical_schema_meaning_sentences(final SubLObject logical_schema, SubLObject memoizeP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.T, memoizeP, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 25172L)
    public static SubLObject logical_schema_meaning_sentences(final SubLObject logical_schema, SubLObject asserted_meaning_sentences_onlyP, SubLObject memoizeP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLObject gafs = logical_schema_meaning_sentence_gafs(logical_schema, memoizeP);
        SubLObject result = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL == asserted_meaning_sentences_onlyP || sksi_meaning_sentence_utilities.NIL != assertions_high.asserted_assertionP(gaf)) {
                sksi_hl_support_utilities.note_sksi_support(gaf);
                result = (SubLObject)ConsesLow.cons(get_meaning_sentence_from_gaf(gaf, unwrap_istsP), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 25709L)
    public static SubLObject logical_schema_consequent_meaning_sentences(final SubLObject logical_schema, SubLObject asserted_meaning_sentences_onlyP, SubLObject memoizeP, SubLObject ignore_cms_gaf, SubLObject check_supportednessP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (ignore_cms_gaf == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_cms_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLObject conditional_meaning_sentence_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, memoizeP, ignore_cms_gaf, check_supportednessP);
        SubLObject consequent_meaning_sentences = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = conditional_meaning_sentence_gafs;
        SubLObject gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL == asserted_meaning_sentences_onlyP || sksi_meaning_sentence_utilities.NIL != assertions_high.asserted_assertionP(gaf)) {
                sksi_hl_support_utilities.note_sksi_support(gaf);
                consequent_meaning_sentences = (SubLObject)ConsesLow.cons(get_consequent_meaning_sentence_from_gaf(gaf, unwrap_istsP), consequent_meaning_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(consequent_meaning_sentences, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 26519L)
    public static SubLObject logical_schemata_meaning_sentence_gafs(final SubLObject logical_schemata, SubLObject memoizeP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            meaning_sentence_gafs = ConsesLow.append(logical_schema_meaning_sentence_gafs(logical_schema, memoizeP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return meaning_sentence_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 26956L)
    public static SubLObject logical_schemata_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schemata, SubLObject memoizeP, SubLObject check_supportednessP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (check_supportednessP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            check_supportednessP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            meaning_sentence_gafs = ConsesLow.append(logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, memoizeP, (SubLObject)sksi_meaning_sentence_utilities.NIL, check_supportednessP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(meaning_sentence_gafs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 27558L)
    public static SubLObject relevant_logical_schemata_meaning_sentence_gafs(final SubLObject logical_schemata, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            meaning_sentence_gafs = ConsesLow.append(relevant_logical_schema_meaning_sentence_gafs(logical_schema, pred, pred_relevance_function, memoizeP, ignore_istsP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return meaning_sentence_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 28351L)
    public static SubLObject relevant_logical_schemata_consequent_conditional_meaning_sentence_gafs(final SubLObject logical_schemata, final SubLObject pred, final SubLObject pred_relevance_function, SubLObject memoizeP, SubLObject ignore_istsP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            meaning_sentence_gafs = ConsesLow.append(relevant_logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, pred, pred_relevance_function, memoizeP, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.T, ignore_istsP), meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return meaning_sentence_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 29291L)
    public static SubLObject relevant_logical_schema_meaning_sentences_internal(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLObject all_meaning_sentences = logical_schema_meaning_sentences(logical_schema, asserted_meaning_sentences_onlyP, unwrap_istsP, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        final SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
        final SubLObject irrelevant_logical_field_indexicals = conses_high.set_difference(all_logical_field_indexicals, relevant_logical_field_indexicals, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject relevant_sentences = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = all_meaning_sentences;
        SubLObject sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            SubLObject irrelevant = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            if (sksi_meaning_sentence_utilities.NIL == irrelevant) {
                SubLObject csome_list_var;
                SubLObject irrelevant_field_indexical;
                for (csome_list_var = irrelevant_logical_field_indexicals, irrelevant_field_indexical = (SubLObject)sksi_meaning_sentence_utilities.NIL, irrelevant_field_indexical = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == irrelevant && sksi_meaning_sentence_utilities.NIL != csome_list_var; irrelevant = cycl_utilities.expression_find(irrelevant_field_indexical, sentence, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), csome_list_var = csome_list_var.rest(), irrelevant_field_indexical = csome_list_var.first()) {}
            }
            if (sksi_meaning_sentence_utilities.NIL == irrelevant) {
                relevant_sentences = (SubLObject)ConsesLow.cons(sentence, relevant_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(relevant_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 29291L)
    public static SubLObject relevant_logical_schema_meaning_sentences(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return relevant_logical_schema_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym44$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym44$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, (SubLObject)sksi_meaning_sentence_utilities.FOUR_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym44$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && unwrap_istsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_logical_schema_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 30404L)
    public static SubLObject relevant_logical_schema_conditional_meaning_sentences_internal(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLObject all_cond_meaning_sentence_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        final SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
        final SubLObject irrelevant_logical_field_indexicals = conses_high.set_difference(all_logical_field_indexicals, relevant_logical_field_indexicals, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject relevant_sentences = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = all_cond_meaning_sentence_gafs;
        SubLObject sentence_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        sentence_gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL == asserted_meaning_sentences_onlyP || sksi_meaning_sentence_utilities.NIL != assertions_high.asserted_assertionP(sentence_gaf)) {
                final SubLObject ant_sentence = get_antecedent_meaning_sentence_from_gaf(sentence_gaf);
                final SubLObject con_sentence = get_consequent_meaning_sentence_from_gaf(sentence_gaf, unwrap_istsP);
                SubLObject irrelevantP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
                if (sksi_meaning_sentence_utilities.NIL == irrelevantP) {
                    SubLObject csome_list_var;
                    SubLObject irrelevant_field_indexical;
                    for (csome_list_var = irrelevant_logical_field_indexicals, irrelevant_field_indexical = (SubLObject)sksi_meaning_sentence_utilities.NIL, irrelevant_field_indexical = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == irrelevantP && sksi_meaning_sentence_utilities.NIL != csome_list_var; irrelevantP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != cycl_utilities.expression_find(irrelevant_field_indexical, ant_sentence, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) || sksi_meaning_sentence_utilities.NIL != cycl_utilities.expression_find(irrelevant_field_indexical, con_sentence, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)), csome_list_var = csome_list_var.rest(), irrelevant_field_indexical = csome_list_var.first()) {}
                }
                if (sksi_meaning_sentence_utilities.NIL == irrelevantP) {
                    relevant_sentences = (SubLObject)ConsesLow.cons(assertions_high.gaf_formula(sentence_gaf), relevant_sentences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence_gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(relevant_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 30404L)
    public static SubLObject relevant_logical_schema_conditional_meaning_sentences(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return relevant_logical_schema_conditional_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym45$RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym45$RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, (SubLObject)sksi_meaning_sentence_utilities.FOUR_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym45$RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && unwrap_istsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_logical_schema_conditional_meaning_sentences_internal(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, relevant_logical_field_indexicals, asserted_meaning_sentences_onlyP, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 31763L)
    public static SubLObject logical_schema_meaning_sentence_gafs_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject ls_meaning_sentence_gafs = logical_schema_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject pred_meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = ls_meaning_sentence_gafs;
        SubLObject meaning_sentence_gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        meaning_sentence_gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject meaning_sentence_pred = get_meaning_sentence_pred_from_gaf(meaning_sentence_gaf, ignore_istsP);
            if (pred.eql(meaning_sentence_pred)) {
                pred_meaning_sentence_gafs = (SubLObject)ConsesLow.cons(meaning_sentence_gaf, pred_meaning_sentence_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_gaf = cdolist_list_var.first();
        }
        return pred_meaning_sentence_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 32521L)
    public static SubLObject logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject ls_conditional_meaning_sentence_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject pred_consequent_conditional_meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = ls_conditional_meaning_sentence_gafs;
        SubLObject gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject consequent_meaning_sentence = get_consequent_meaning_sentence_from_gaf(gaf, ignore_istsP);
            final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(consequent_meaning_sentence);
            if (pred.eql(meaning_sentence_pred)) {
                pred_consequent_conditional_meaning_sentence_gafs = (SubLObject)ConsesLow.cons(gaf, pred_consequent_conditional_meaning_sentence_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return pred_consequent_conditional_meaning_sentence_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 33415L)
    public static SubLObject logical_schema_meaning_sentences_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP, SubLObject unwrap_istsP) {
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ls_meaning_sentences = logical_schema_meaning_sentences(logical_schema, unwrap_istsP, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject pred_meaning_sentences = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = ls_meaning_sentences;
        SubLObject meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        meaning_sentence = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            SubLObject ms_pred = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            if (sksi_meaning_sentence_utilities.NIL != ignore_istsP && sksi_meaning_sentence_utilities.NIL == unwrap_istsP) {
                thread.resetMultipleValues();
                final SubLObject sentence = unwrap_meaning_sentence_if_ist(meaning_sentence);
                final SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ms_pred = cycl_utilities.formula_operator(sentence);
            }
            else {
                ms_pred = cycl_utilities.formula_operator(meaning_sentence);
            }
            if (pred.eql(ms_pred)) {
                pred_meaning_sentences = (SubLObject)ConsesLow.cons(meaning_sentence, pred_meaning_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(pred_meaning_sentences, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 34239L)
    public static SubLObject logical_schema_consequent_meaning_sentences_for_pred(final SubLObject logical_schema, final SubLObject pred, SubLObject ignore_istsP, SubLObject unwrap_istsP) {
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return list_utilities.fast_delete_duplicates((sksi_meaning_sentence_utilities.NIL != unwrap_istsP) ? Mapping.mapcar((SubLObject)sksi_meaning_sentence_utilities.$sym46$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF_UNWRAPPING_ISTS, logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP)) : Mapping.mapcar((SubLObject)sksi_meaning_sentence_utilities.$sym10$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF, logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP)), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 34876L)
    public static SubLObject logical_schemata_meaning_sentence_gafs_for_pred(final SubLObject logical_schemata, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            meaning_sentence_gafs = ConsesLow.append(meaning_sentence_gafs, logical_schema_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP));
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(meaning_sentence_gafs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 35382L)
    public static SubLObject logical_schemata_consequent_conditional_meaning_sentence_gafs_for_pred(final SubLObject logical_schemata, final SubLObject pred, SubLObject ignore_istsP) {
        if (ignore_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            ignore_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        SubLObject conditional_meaning_sentence_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = logical_schemata;
        SubLObject logical_schema = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        logical_schema = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject ls_conditional_ms_gafs = logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred(logical_schema, pred, ignore_istsP);
            conditional_meaning_sentence_gafs = ConsesLow.append(ls_conditional_ms_gafs, conditional_meaning_sentence_gafs);
            cdolist_list_var = cdolist_list_var.rest();
            logical_schema = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(conditional_meaning_sentence_gafs, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 36148L)
    public static SubLObject logical_schema_meaning_sentence_preds(final SubLObject logical_schema, SubLObject include_logical_field_indexicalsP, SubLObject unwrap_istsP) {
        if (include_logical_field_indexicalsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            include_logical_field_indexicalsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject ls_meaning_sentences = logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, unwrap_istsP);
        SubLObject preds = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = ls_meaning_sentences;
        SubLObject meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        meaning_sentence = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
            if (sksi_meaning_sentence_utilities.NIL != include_logical_field_indexicalsP || sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
                preds = (SubLObject)ConsesLow.cons(pred, preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(preds, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 36842L)
    public static SubLObject logical_schema_meaning_sentence_predP(final SubLObject logical_schema, final SubLObject pred, SubLObject test, SubLObject unwrap_istsP) {
        if (test == sksi_meaning_sentence_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ);
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject ls_meaning_sentences = logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, unwrap_istsP);
        SubLObject predP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == predP) {
            SubLObject csome_list_var;
            SubLObject meaning_sentence;
            for (csome_list_var = ls_meaning_sentences, meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL, meaning_sentence = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == predP && sksi_meaning_sentence_utilities.NIL != csome_list_var; predP = Functions.funcall(test, pred, cycl_utilities.formula_operator(meaning_sentence)), csome_list_var = csome_list_var.rest(), meaning_sentence = csome_list_var.first()) {}
        }
        return predP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 37224L)
    public static SubLObject logical_schema_consequent_meaning_sentence_preds(final SubLObject logical_schema, SubLObject include_logical_field_indexicalsP, SubLObject unwrap_istsP) {
        if (include_logical_field_indexicalsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            include_logical_field_indexicalsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject ls_consequent_meaning_sentences = logical_schema_consequent_meaning_sentences(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, unwrap_istsP);
        SubLObject preds = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = ls_consequent_meaning_sentences;
        SubLObject meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        meaning_sentence = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
            if (sksi_meaning_sentence_utilities.NIL != include_logical_field_indexicalsP || sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
                preds = (SubLObject)ConsesLow.cons(pred, preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(preds, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 37882L)
    public static SubLObject logical_schema_consequent_meaning_sentence_predP(final SubLObject logical_schema, final SubLObject pred, SubLObject test, SubLObject unwrap_istsP) {
        if (test == sksi_meaning_sentence_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ);
        }
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        final SubLObject ls_consequent_meaning_sentences = logical_schema_consequent_meaning_sentences(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.NIL, unwrap_istsP);
        SubLObject predP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == predP) {
            SubLObject csome_list_var;
            SubLObject meaning_sentence;
            for (csome_list_var = ls_consequent_meaning_sentences, meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL, meaning_sentence = csome_list_var.first(); sksi_meaning_sentence_utilities.NIL == predP && sksi_meaning_sentence_utilities.NIL != csome_list_var; predP = Functions.funcall(test, pred, cycl_utilities.formula_operator(meaning_sentence)), csome_list_var = csome_list_var.rest(), meaning_sentence = csome_list_var.first()) {}
        }
        return predP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 38316L)
    public static SubLObject logical_schema_all_relevant_preds(final SubLObject logical_schema, SubLObject unwrap_istsP) {
        if (unwrap_istsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_meaning_sentence_utilities.T;
        }
        return logical_schema_all_relevant_preds_memoized(logical_schema, unwrap_istsP, mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 38505L)
    public static SubLObject logical_schema_all_relevant_preds_memoized_internal(final SubLObject logical_schema, final SubLObject unwrap_istsP, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ms_lfis = list_utilities.partition_list(ConsesLow.append(logical_schema_meaning_sentence_preds(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.T, unwrap_istsP), logical_schema_consequent_meaning_sentence_preds(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.T, unwrap_istsP)), (SubLObject)sksi_meaning_sentence_utilities.$sym48$LOGICAL_FIELD_INDEXICAL_P);
        final SubLObject ms_preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject cms_lfis = list_utilities.partition_list(logical_schema_consequent_meaning_sentence_preds(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.T, unwrap_istsP), (SubLObject)sksi_meaning_sentence_utilities.$sym48$LOGICAL_FIELD_INDEXICAL_P);
        final SubLObject cms_preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject preds = ConsesLow.append(ms_preds, cms_preds);
        SubLObject cdolist_list_var = conses_high.union(ms_lfis, cms_lfis, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject lfi = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            preds = ConsesLow.append(preds, sksi_code_mapping_predicates_for_logical_field_indexical(lfi, mt_info));
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(preds, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 38505L)
    public static SubLObject logical_schema_all_relevant_preds_memoized(final SubLObject logical_schema, final SubLObject unwrap_istsP, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return logical_schema_all_relevant_preds_memoized_internal(logical_schema, unwrap_istsP, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym47$LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym47$LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.THREE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym47$LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_schema, unwrap_istsP, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (unwrap_istsP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_schema_all_relevant_preds_memoized_internal(logical_schema, unwrap_istsP, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, unwrap_istsP, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 39329L)
    public static SubLObject sksi_code_mapping_predicates_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        final SubLObject decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(logical_field_indexical, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject preds = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = decodings;
        SubLObject decoding = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        decoding = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.schema_object_fn_expression_p(decoding) || sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(decoding)) {
                final SubLObject code_mapping_schema = (sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.schema_object_fn_expression_p(decoding)) ? cycl_utilities.formula_arg1(decoding, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) : cycl_utilities.formula_arg2(decoding, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
                if (sksi_meaning_sentence_utilities.NIL != forts.fort_p(code_mapping_schema)) {
                    preds = ConsesLow.append(preds, sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 39329L)
    public static SubLObject sksi_code_mapping_predicates_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return sksi_code_mapping_predicates_for_logical_field_indexical_internal(logical_field_indexical, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym49$SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym49$SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym49$SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_field_indexical, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_code_mapping_predicates_for_logical_field_indexical_internal(logical_field_indexical, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 40076L)
    public static SubLObject meaning_sentences_type_check(final SubLObject lit, final SubLObject meaning_sentences, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_meaning_sentence_utilities.UNPROVIDED) {
            strength = (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST;
        }
        SubLObject result = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject ms = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        ms = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL != meaning_sentence_type_check(lit, ms, memoizeP, mt, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(ms, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ms = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 40490L)
    public static SubLObject meaning_sentence_type_check(final SubLObject lit, final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength, SubLObject memoize_meaning_sentence_patternP, SubLObject use_memoized_isaP) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_meaning_sentence_utilities.UNPROVIDED) {
            strength = (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST;
        }
        if (memoize_meaning_sentence_patternP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoize_meaning_sentence_patternP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? meaning_sentence_type_check_memoized(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP) : meaning_sentence_type_check_int(lit, meaning_sentence, mt, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.NIL, memoize_meaning_sentence_patternP, use_memoized_isaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 41259L)
    public static SubLObject meaning_sentence_type_check_memoized_internal(final SubLObject lit, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, final SubLObject use_memoized_isaP) {
        return meaning_sentence_type_check_int(lit, meaning_sentence, mt, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.T, (SubLObject)sksi_meaning_sentence_utilities.NIL, use_memoized_isaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 41259L)
    public static SubLObject meaning_sentence_type_check_memoized(final SubLObject lit, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, final SubLObject use_memoized_isaP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return meaning_sentence_type_check_memoized_internal(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym51$MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym51$MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.SIX_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym51$MEANING_SENTENCE_TYPE_CHECK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lit.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (meaning_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (meta_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (strength.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && use_memoized_isaP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(meaning_sentence_type_check_memoized_internal(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lit, meaning_sentence, mt, meta_mt, strength, use_memoized_isaP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 41500L)
    public static SubLObject meaning_sentence_type_check_int(final SubLObject lit, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, SubLObject memoize_patternsP, SubLObject memoize_meaning_sentence_patternP, SubLObject use_memoized_isaP) {
        if (memoize_patternsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoize_patternsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (memoize_meaning_sentence_patternP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoize_meaning_sentence_patternP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern_matchedP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject ms_formula = unwrap_meaning_sentence_if_ist(meaning_sentence);
        final SubLObject ms_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (sksi_meaning_sentence_utilities.NIL == ms_mt || sksi_meaning_sentence_utilities.NIL != mt_relevance_macros.relevant_mtP(ms_mt)) {
                final SubLObject pattern = (sksi_meaning_sentence_utilities.NIL != memoize_meaning_sentence_patternP) ? generate_pattern_for_meaning_sentence_memoized(ms_formula, memoize_patternsP, meta_mt, strength, use_memoized_isaP, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) : generate_pattern_for_meaning_sentence(ms_formula, memoize_patternsP, meta_mt, strength, use_memoized_isaP);
                pattern_matchedP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, lit);
                if (sksi_meaning_sentence_utilities.NIL == pattern_matchedP && sksi_meaning_sentence_utilities.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_meaning_sentence_utilities.NINE_INTEGER)) {
                    PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_meaning_sentence_utilities.$str52$__SKSI__A_, (SubLObject)sksi_meaning_sentence_utilities.$str53$meaning_sentence_type_check_int_f), new SubLObject[] { sksi_meaning_sentence_utilities.NINE_INTEGER, lit, meaning_sentence });
                    streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pattern_matchedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 42442L)
    public static SubLObject meaning_sentence_arg_type_check(final SubLObject args, final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_meaning_sentence_utilities.UNPROVIDED) {
            strength = (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? meaning_sentence_arg_type_check_memoized(args, meaning_sentence, mt, meta_mt, strength) : meaning_sentence_arg_type_check_int(args, meaning_sentence, mt, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 42859L)
    public static SubLObject meaning_sentence_arg_type_check_memoized_internal(final SubLObject args, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        return meaning_sentence_arg_type_check_int(args, meaning_sentence, mt, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 42859L)
    public static SubLObject meaning_sentence_arg_type_check_memoized(final SubLObject args, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return meaning_sentence_arg_type_check_memoized_internal(args, meaning_sentence, mt, meta_mt, strength);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym54$MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym54$MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.FIVE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym54$MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(args, meaning_sentence, mt, meta_mt, strength);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (args.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (meaning_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (meta_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && strength.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(meaning_sentence_arg_type_check_memoized_internal(args, meaning_sentence, mt, meta_mt, strength)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(args, meaning_sentence, mt, meta_mt, strength));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 43070L)
    public static SubLObject meaning_sentence_arg_type_check_int(final SubLObject args, final SubLObject meaning_sentence, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength, SubLObject memoize_patternsP) {
        if (memoize_patternsP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoize_patternsP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ms_args = cycl_utilities.formula_args(meaning_sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        final SubLObject pattern = generate_pattern_for_meaning_sentence_args(ms_args, memoize_patternsP, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject pattern_matchedP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            pattern_matchedP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, args);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pattern_matchedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 43528L)
    public static SubLObject meaning_sentence_gaf_type_check(final SubLObject lit, final SubLObject meaning_sentence_gaf, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_meaning_sentence_utilities.UNPROVIDED) {
            strength = (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST;
        }
        final SubLObject meaning_sentence = get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        return meaning_sentence_type_check(lit, meaning_sentence, memoizeP, mt, meta_mt, strength, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 43856L)
    public static SubLObject meaning_sentence_gafs_type_check(final SubLObject lit, final SubLObject meaning_sentence_gafs, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_meaning_sentence_utilities.UNPROVIDED) {
            strength = (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST;
        }
        SubLObject new_gafs = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject gaf = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            if (sksi_meaning_sentence_utilities.NIL != meaning_sentence_gaf_type_check(lit, gaf, memoizeP, mt, meta_mt, strength)) {
                new_gafs = (SubLObject)ConsesLow.cons(gaf, new_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 44204L)
    public static SubLObject generate_robust_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 44482L)
    public static SubLObject generate_robust_pattern_for_meaning_sentence_args(final SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence_args(meaning_sentence_args, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 44700L)
    public static SubLObject generate_weak_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw55$WEAK, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 44894L)
    public static SubLObject generate_strict_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 45092L)
    public static SubLObject generate_strict_pattern_for_meaning_sentence_args(final SubLObject meaning_sentence_args, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence_args(meaning_sentence_args, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 45310L)
    public static SubLObject generate_strict_pattern_for_meaning_sentence_arg(final SubLObject meaning_sentence_arg, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 45524L)
    public static SubLObject generate_pedantic_pattern_for_meaning_sentence(final SubLObject meaning_sentence, SubLObject memoizeP, SubLObject mt) {
        if (memoizeP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (mt == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, (SubLObject)sksi_meaning_sentence_utilities.$kw57$PEDANTIC, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 45726L)
    public static SubLObject generate_pattern_for_meaning_sentence_memoized_internal(final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, final SubLObject use_memoized_isaP, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        return generate_pattern_for_meaning_sentence(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 45726L)
    public static SubLObject generate_pattern_for_meaning_sentence_memoized(final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, final SubLObject use_memoized_isaP, SubLObject mt_info) {
        if (mt_info == sksi_meaning_sentence_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return generate_pattern_for_meaning_sentence_memoized_internal(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym58$GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym58$GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.SIX_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym58$GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (meaning_sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (memoizeP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (strength.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (use_memoized_isaP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_pattern_for_meaning_sentence_memoized_internal(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(meaning_sentence, memoizeP, mt, strength, use_memoized_isaP, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 46039L)
    public static SubLObject generate_pattern_for_meaning_sentence(final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(meaning_sentence);
        final SubLObject args = cycl_utilities.formula_args(meaning_sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        final SubLObject transitive_args = transitive_args_for_meaning_sentence_predicate(pred);
        final SubLObject arg_pattern = generate_pattern_for_meaning_sentence_args(args, memoizeP, mt, strength, transitive_args, use_memoized_isaP);
        SubLObject pattern = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw55$WEAK)) {
                if (sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
                    final SubLObject pred_pattern = generate_pattern_for_logical_field_indexical(pred, strength, use_memoized_isaP);
                    pattern = (SubLObject)ConsesLow.cons(pred_pattern, arg_pattern);
                }
                else if (sksi_meaning_sentence_utilities.NIL != sksi_query_utilities.binary_predicate_memoized(pred)) {
                    final SubLObject spec_pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, pred), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw61$SPEC_PRED, pred)), arg_pattern);
                    final SubLObject inv_pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)sksi_meaning_sentence_utilities.$kw62$NOT_FULLY_BOUND, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw63$SPEC_INVERSE, pred)), Sequences.reverse(arg_pattern));
                    pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, spec_pattern, inv_pattern);
                }
                else {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, pred), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw61$SPEC_PRED, pred)), arg_pattern);
                }
            }
            else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw57$PEDANTIC) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw30$RAW)) {
                final SubLObject pred_pattern = (sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) ? generate_pattern_for_logical_field_indexical(pred, strength, use_memoized_isaP) : pred;
                pattern = (SubLObject)ConsesLow.cons(pred_pattern, arg_pattern);
            }
            else {
                Errors.error((SubLObject)sksi_meaning_sentence_utilities.$str64$Unknown_strength__a_, strength);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 47762L)
    public static SubLObject transitive_args_for_meaning_sentence_predicate(final SubLObject pred) {
        return (SubLObject)(pred.eql(sksi_meaning_sentence_utilities.$const65$isa) ? sksi_meaning_sentence_utilities.$list66 : sksi_meaning_sentence_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 47921L)
    public static SubLObject generate_pattern_for_meaning_sentence_args(final SubLObject meaning_sentence_args, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, SubLObject transitive_args, SubLObject use_memoized_isaP) {
        if (transitive_args == sksi_meaning_sentence_utilities.UNPROVIDED) {
            transitive_args = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        SubLObject pattern = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject list_var = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject meaning_sentence_arg = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject num = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        list_var = meaning_sentence_args;
        meaning_sentence_arg = list_var.first();
        for (num = (SubLObject)sksi_meaning_sentence_utilities.ZERO_INTEGER; sksi_meaning_sentence_utilities.NIL != list_var; list_var = list_var.rest(), meaning_sentence_arg = list_var.first(), num = Numbers.add((SubLObject)sksi_meaning_sentence_utilities.ONE_INTEGER, num)) {
            final SubLObject sub_pattern = (sksi_meaning_sentence_utilities.NIL != subl_promotions.memberP(number_utilities.f_1X(num), transitive_args, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.$sym67$_), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) ? generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, strength, (SubLObject)sksi_meaning_sentence_utilities.T, use_memoized_isaP) : generate_pattern_for_meaning_sentence_arg(meaning_sentence_arg, memoizeP, mt, strength, (SubLObject)sksi_meaning_sentence_utilities.NIL, use_memoized_isaP);
            pattern = (SubLObject)ConsesLow.cons(sub_pattern, pattern);
        }
        return Sequences.nreverse(pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 48528L)
    public static SubLObject generate_pattern_for_meaning_sentence_arg(final SubLObject meaning_sentence_arg, final SubLObject memoizeP, final SubLObject mt, final SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (transitiveP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            transitiveP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return (sksi_meaning_sentence_utilities.NIL != memoizeP) ? generate_pattern_for_meaning_sentence_arg_memoized(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP) : generate_pattern_for_meaning_sentence_arg_int(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 49012L)
    public static SubLObject generate_pattern_for_meaning_sentence_arg_memoized_internal(final SubLObject meaning_sentence_arg, final SubLObject mt, final SubLObject strength, final SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        return generate_pattern_for_meaning_sentence_arg_int(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 49012L)
    public static SubLObject generate_pattern_for_meaning_sentence_arg_memoized(final SubLObject meaning_sentence_arg, final SubLObject mt, final SubLObject strength, final SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return generate_pattern_for_meaning_sentence_arg_memoized_internal(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym68$GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym68$GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, (SubLObject)sksi_meaning_sentence_utilities.FIVE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym68$GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (meaning_sentence_arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (strength.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (transitiveP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && use_memoized_isaP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_pattern_for_meaning_sentence_arg_memoized_internal(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(meaning_sentence_arg, mt, strength, transitiveP, use_memoized_isaP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 49293L)
    public static SubLObject generate_pattern_for_meaning_sentence_arg_int(final SubLObject meaning_sentence_arg, final SubLObject mt, final SubLObject strength, SubLObject transitiveP, SubLObject use_memoized_isaP) {
        if (transitiveP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            transitiveP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject lfis = cycl_utilities.expression_gather(meaning_sentence_arg, (SubLObject)sksi_meaning_sentence_utilities.$sym48$LOGICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_meaning_sentence_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.IDENTITY), (SubLObject)sksi_meaning_sentence_utilities.NIL);
            final SubLObject el_vars = cycl_utilities.expression_gather(meaning_sentence_arg, (SubLObject)sksi_meaning_sentence_utilities.$sym69$EL_VARIABLE_P, (SubLObject)sksi_meaning_sentence_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.IDENTITY), (SubLObject)sksi_meaning_sentence_utilities.NIL);
            final SubLObject cols = cycl_utilities.expression_gather(meaning_sentence_arg, (SubLObject)sksi_meaning_sentence_utilities.$sym70$COLLECTION_P, (SubLObject)sksi_meaning_sentence_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.IDENTITY), (SubLObject)sksi_meaning_sentence_utilities.NIL);
            final SubLObject preds = cycl_utilities.expression_gather(meaning_sentence_arg, (SubLObject)sksi_meaning_sentence_utilities.$sym71$PREDICATE_P, (SubLObject)sksi_meaning_sentence_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.IDENTITY), (SubLObject)sksi_meaning_sentence_utilities.NIL);
            final SubLObject nats = cycl_utilities.expression_gather(meaning_sentence_arg, (SubLObject)sksi_meaning_sentence_utilities.$sym72$CYCL_NAT_P, (SubLObject)sksi_meaning_sentence_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.IDENTITY), (SubLObject)sksi_meaning_sentence_utilities.NIL);
            SubLObject cdolist_list_var = lfis;
            SubLObject lfi = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            lfi = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                final SubLObject lfi_pattern = generate_pattern_for_logical_field_indexical(lfi, strength, use_memoized_isaP);
                alist = (SubLObject)ConsesLow.cons(reader.bq_cons(lfi, lfi_pattern), alist);
                cdolist_list_var = cdolist_list_var.rest();
                lfi = cdolist_list_var.first();
            }
            cdolist_list_var = el_vars;
            SubLObject el_var = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            el_var = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                final SubLObject el_var_pattern = generate_pattern_for_el_variable(el_var, strength);
                alist = (SubLObject)ConsesLow.cons(reader.bq_cons(el_var, el_var_pattern), alist);
                cdolist_list_var = cdolist_list_var.rest();
                el_var = cdolist_list_var.first();
            }
            cdolist_list_var = cols;
            SubLObject col = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            col = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                if (sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(col)) {
                    final SubLObject col_pattern = generate_pattern_for_collection(col, strength, transitiveP);
                    alist = (SubLObject)ConsesLow.cons(reader.bq_cons(col, col_pattern), alist);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            cdolist_list_var = preds;
            SubLObject pred = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            pred = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                if (sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
                    final SubLObject pred_pattern = generate_pattern_for_predicate(pred, strength);
                    alist = (SubLObject)ConsesLow.cons(reader.bq_cons(pred, pred_pattern), alist);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            cdolist_list_var = nats;
            SubLObject nat = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            nat = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                if (sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(nat) && sksi_meaning_sentence_utilities.NIL == fort_types_interface.collection_p(nat) && sksi_meaning_sentence_utilities.NIL == fort_types_interface.predicate_p(nat)) {
                    final SubLObject nat_pattern = generate_pattern_for_nat(nat, strength);
                    alist = (SubLObject)ConsesLow.cons(reader.bq_cons(nat, nat_pattern), alist);
                }
                cdolist_list_var = cdolist_list_var.rest();
                nat = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return conses_high.sublis(alist, meaning_sentence_arg, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQUAL), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 51104L)
    public static SubLObject generate_pattern_for_logical_field_indexical(SubLObject logical_field_indexical, final SubLObject strength, SubLObject use_memoized_isaP) {
        if (use_memoized_isaP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            use_memoized_isaP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        SubLObject pattern = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(logical_field_indexical)) {
            logical_field_indexical = sksi_kb_accessors.lfi_alias_fn_naut_lfi(logical_field_indexical);
        }
        if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST)) {
            final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
            SubLObject cdolist_list_var;
            final SubLObject constraints = cdolist_list_var = sksi_kb_accessors.logical_field_isa(logical_field);
            SubLObject constraint = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            constraint = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                if (sksi_meaning_sentence_utilities.NIL != use_memoized_isaP) {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw73$ISA_MEMOIZED, constraint), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw74$NOT_ISA_DISJOINT_MEMOIZED, constraint)), pattern);
                }
                else {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw75$ISA, constraint), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw76$NOT_ISA_DISJOINT, constraint)), pattern);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            if (sksi_meaning_sentence_utilities.NIL != list_utilities.lengthG(pattern, (SubLObject)sksi_meaning_sentence_utilities.ONE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) {
                pattern = (SubLObject)ConsesLow.cons((SubLObject)sksi_meaning_sentence_utilities.$kw77$AND, pattern);
            }
            else {
                pattern = pattern.first();
            }
            pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)sksi_meaning_sentence_utilities.$kw62$NOT_FULLY_BOUND, pattern);
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw55$WEAK) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT)) {
            pattern = (SubLObject)sksi_meaning_sentence_utilities.$kw78$ANYTHING;
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw57$PEDANTIC)) {
            final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
            SubLObject cdolist_list_var;
            final SubLObject constraints = cdolist_list_var = sksi_kb_accessors.logical_field_isa(logical_field);
            SubLObject constraint = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            constraint = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                if (sksi_meaning_sentence_utilities.NIL != use_memoized_isaP) {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw73$ISA_MEMOIZED, constraint), pattern);
                }
                else {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw75$ISA, constraint), pattern);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            if (sksi_meaning_sentence_utilities.NIL != list_utilities.lengthG(pattern, (SubLObject)sksi_meaning_sentence_utilities.ONE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) {
                pattern = (SubLObject)ConsesLow.cons((SubLObject)sksi_meaning_sentence_utilities.$kw77$AND, pattern);
            }
            else {
                pattern = pattern.first();
            }
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw30$RAW)) {
            final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
            SubLObject cdolist_list_var;
            final SubLObject constraints = cdolist_list_var = sksi_kb_accessors.logical_field_isa(logical_field);
            SubLObject constraint = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            constraint = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                if (sksi_meaning_sentence_utilities.NIL != use_memoized_isaP) {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw73$ISA_MEMOIZED, constraint), pattern);
                }
                else {
                    pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw75$ISA, constraint), pattern);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            if (sksi_meaning_sentence_utilities.NIL != list_utilities.lengthG(pattern, (SubLObject)sksi_meaning_sentence_utilities.ONE_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED)) {
                pattern = (SubLObject)ConsesLow.cons((SubLObject)sksi_meaning_sentence_utilities.$kw77$AND, pattern);
            }
            else {
                pattern = pattern.first();
            }
            pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, logical_field_indexical, pattern);
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 52987L)
    public static SubLObject generate_pattern_for_el_variable(final SubLObject el_variable, final SubLObject strength) {
        return (SubLObject)sksi_meaning_sentence_utilities.$kw79$EL_VARIABLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 53114L)
    public static SubLObject generate_pattern_for_collection(final SubLObject collection, final SubLObject strength, SubLObject transitiveP) {
        if (transitiveP == sksi_meaning_sentence_utilities.UNPROVIDED) {
            transitiveP = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        }
        SubLObject pattern = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw55$WEAK)) {
            pattern = (SubLObject)((sksi_meaning_sentence_utilities.NIL != transitiveP) ? ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, collection), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw80$SPEC, collection)) : ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, collection));
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT)) {
            pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, collection);
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw57$PEDANTIC) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw30$RAW)) {
            pattern = collection;
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 53533L)
    public static SubLObject generate_pattern_for_predicate(final SubLObject predicate, final SubLObject strength) {
        SubLObject pattern = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw50$ROBUST) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw55$WEAK)) {
            pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw59$OR, (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, predicate), (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw61$SPEC_PRED, predicate));
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw56$STRICT)) {
            pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw60$UNIFY, predicate);
        }
        else if (strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw57$PEDANTIC) || strength.eql((SubLObject)sksi_meaning_sentence_utilities.$kw30$RAW)) {
            pattern = predicate;
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 53877L)
    public static SubLObject generate_pattern_for_nat(final SubLObject nat, final SubLObject strength) {
        SubLObject nat_patterns = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        SubLObject cdolist_list_var = cycl_utilities.nat_args(nat, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject arg = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        arg = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            nat_patterns = (SubLObject)ConsesLow.cons(generate_pattern_for_meaning_sentence_arg_int(arg, (SubLObject)sksi_meaning_sentence_utilities.NIL, strength, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), nat_patterns);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.$kw81$NAT, reader.bq_cons(cycl_utilities.nat_functor(nat), Sequences.nreverse(nat_patterns)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 54242L)
    public static SubLObject ist_meaning_sentence_gaf_p(final SubLObject gaf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != meaning_sentence_gaf_p(gaf) && sksi_meaning_sentence_utilities.NIL != el_utilities.ist_sentence_p(get_meaning_sentence_from_gaf(gaf, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 54491L)
    public static SubLObject unwrap_meaning_sentence_if_ist(final SubLObject meaning_sentence) {
        return czer_utilities.unwrap_if_ist_permissive(meaning_sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 54613L)
    public static SubLObject sksi_reconstruct_meaning_sentence(final SubLObject sentence) {
        SubLObject new_sentence = sksi_infrastructure_utilities.sksi_reconstruct_expression(sentence, (SubLObject)sksi_meaning_sentence_utilities.$sym82$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        new_sentence = cycl_utilities.expression_transform(sentence, (SubLObject)sksi_meaning_sentence_utilities.$sym83$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P, (SubLObject)sksi_meaning_sentence_utilities.$sym84$FIND_NART, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        return new_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55179L)
    public static SubLObject possibly_nart_el_formula_wXo_logical_field_indexicals_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL != sksi_infrastructure_utilities.sksi_possibly_nart_el_formula_p(v_object) && sksi_meaning_sentence_utilities.NIL == cycl_utilities.expression_find_if((SubLObject)sksi_meaning_sentence_utilities.$sym48$LOGICAL_FIELD_INDEXICAL_P, v_object, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55453L)
    public static SubLObject sksi_valid_meaning_sentence_pred_p_internal(final SubLObject pred, final SubLObject content_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == kb_accessors.backchain_requiredP(pred, content_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55453L)
    public static SubLObject sksi_valid_meaning_sentence_pred_p(final SubLObject pred, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return sksi_valid_meaning_sentence_pred_p_internal(pred, content_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym85$SKSI_VALID_MEANING_SENTENCE_PRED_P, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym85$SKSI_VALID_MEANING_SENTENCE_PRED_P, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym85$SKSI_VALID_MEANING_SENTENCE_PRED_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, content_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && content_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_valid_meaning_sentence_pred_p_internal(pred, content_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, content_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55673L)
    public static SubLObject sksi_valid_meaning_sentence_pred_for_storage_p_internal(final SubLObject pred, final SubLObject content_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_meaning_sentence_utilities.NIL == kb_accessors.not_assertible_predicateP(pred, content_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55673L)
    public static SubLObject sksi_valid_meaning_sentence_pred_for_storage_p(final SubLObject pred, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return sksi_valid_meaning_sentence_pred_for_storage_p_internal(pred, content_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym86$SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym86$SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym86$SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, content_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && content_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_valid_meaning_sentence_pred_for_storage_p_internal(pred, content_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, content_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55833L)
    public static SubLObject meaning_sentence_logical_field_indexicals(final SubLObject sentence) {
        return sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 55965L)
    public static SubLObject logical_schema_logical_field_indexicals_used_in_meaning_sentences(final SubLObject logical_schema) {
        final SubLObject result = set.new_set(Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQ), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        SubLObject meaning_sentence = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        meaning_sentence = cdolist_list_var.first();
        while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = meaning_sentence_logical_field_indexicals(meaning_sentence);
            SubLObject lfi = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            lfi = cdolist_list_var_$1.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var_$1) {
                set.set_add(lfi, result);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                lfi = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        }
        return set.set_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 56459L)
    public static SubLObject meaning_sentence_logical_fields(final SubLObject sentence) {
        return Mapping.mapcar((SubLObject)sksi_meaning_sentence_utilities.$sym87$LOGICAL_FIELD_FOR_INDEXICAL, meaning_sentence_logical_field_indexicals(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 56621L)
    public static SubLObject meaning_sentence_logical_field_indexical_p_internal(final SubLObject lfi, final SubLObject meaning_sentence) {
        return cycl_utilities.expression_find(lfi, meaning_sentence, (SubLObject)sksi_meaning_sentence_utilities.T, Symbols.symbol_function((SubLObject)sksi_meaning_sentence_utilities.EQUAL), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 56621L)
    public static SubLObject meaning_sentence_logical_field_indexical_p(final SubLObject lfi, final SubLObject meaning_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL == v_memoization_state) {
            return meaning_sentence_logical_field_indexical_p_internal(lfi, meaning_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym88$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (sksi_meaning_sentence_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_meaning_sentence_utilities.$sym88$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER, (SubLObject)sksi_meaning_sentence_utilities.NIL, (SubLObject)sksi_meaning_sentence_utilities.EQUAL, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_meaning_sentence_utilities.$sym88$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(lfi, meaning_sentence);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_meaning_sentence_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_meaning_sentence_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lfi.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_meaning_sentence_utilities.NIL != cached_args && sksi_meaning_sentence_utilities.NIL == cached_args.rest() && meaning_sentence.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(meaning_sentence_logical_field_indexical_p_internal(lfi, meaning_sentence)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lfi, meaning_sentence));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 56800L)
    public static SubLObject meaning_sentence_with_logical_field_indexical_predicateP(final SubLObject meaning_sentence) {
        return sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.formula_operator(meaning_sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 57009L)
    public static SubLObject possibly_constrain_consequent_meaning_sentence(final SubLObject antecedent_meaning_sentence, final SubLObject consequent_meaning_sentence) {
        final SubLObject new_pred = antecedent_meaning_sentence_constraining_lfi_as_non_lfi(antecedent_meaning_sentence, cycl_utilities.formula_operator(consequent_meaning_sentence));
        final SubLObject new_consequent_sentence = (sksi_meaning_sentence_utilities.NIL != new_pred) ? el_utilities.make_formula(new_pred, cycl_utilities.formula_args(consequent_meaning_sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED), (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED) : consequent_meaning_sentence;
        return Values.values(new_consequent_sentence, new_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 57511L)
    public static SubLObject antecedent_meaning_sentence_constraining_lfi_as_non_lfi(final SubLObject sentence, final SubLObject lfi) {
        SubLObject constrained_lfi = (SubLObject)sksi_meaning_sentence_utilities.NIL;
        if (sksi_meaning_sentence_utilities.NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, sksi_meaning_sentence_utilities.$const89$equals)) {
            constrained_lfi = atomic_sentence_constraining_lfi_as_non_lfi(sentence, lfi);
        }
        else if (sksi_meaning_sentence_utilities.NIL != el_utilities.el_conjunction_p(sentence)) {
            final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)sksi_meaning_sentence_utilities.$kw90$IGNORE);
            SubLObject rest;
            SubLObject subsentence;
            for (rest = (SubLObject)sksi_meaning_sentence_utilities.NIL, rest = args; sksi_meaning_sentence_utilities.NIL == constrained_lfi && sksi_meaning_sentence_utilities.NIL != rest; constrained_lfi = antecedent_meaning_sentence_constraining_lfi_as_non_lfi(subsentence, lfi), rest = rest.rest()) {
                subsentence = rest.first();
            }
        }
        return constrained_lfi;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-meaning-sentence-utilities.lisp", position = 58016L)
    public static SubLObject atomic_sentence_constraining_lfi_as_non_lfi(final SubLObject sentence, final SubLObject lfi) {
        if (cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED).eql(lfi) && sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        if (cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED).eql(lfi) && sksi_meaning_sentence_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_meaning_sentence_utilities.UNPROVIDED);
        }
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    public static SubLObject declare_sksi_meaning_sentence_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_gaf_p", "MEANING-SENTENCE-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "ordinary_meaning_sentence_gaf_p", "ORDINARY-MEANING-SENTENCE-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "conditional_meaning_sentence_gaf_p", "CONDITIONAL-MEANING-SENTENCE-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "gaf_assertion_is_conditional_meaning_sentence_gafP", "GAF-ASSERTION-IS-CONDITIONAL-MEANING-SENTENCE-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_logical_schema_from_meaning_sentence_gaf", "GET-LOGICAL-SCHEMA-FROM-MEANING-SENTENCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_logical_schemata_from_meaning_sentence_gaf", "GET-LOGICAL-SCHEMATA-FROM-MEANING-SENTENCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_meaning_sentence_from_gaf", "GET-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_meaning_sentence_pred_from_gaf", "GET-MEANING-SENTENCE-PRED-FROM-GAF", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "destructure_meaning_sentence_gaf", "DESTRUCTURE-MEANING-SENTENCE-GAF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf", "GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_antecedent_meaning_sentence_from_gaf", "GET-ANTECEDENT-MEANING-SENTENCE-FROM-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf", "GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_consequent_meaning_sentence_from_gaf", "GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_consequent_meaning_sentence_from_gaf_unwrapping_ists", "GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF-UNWRAPPING-ISTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "destructure_conditional_meaning_sentence_gaf", "DESTRUCTURE-CONDITIONAL-MEANING-SENTENCE-GAF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "destructure_conditional_meaning_sentence", "DESTRUCTURE-CONDITIONAL-MEANING-SENTENCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_antecedent_logical_schemata_from_conditional_meaning_sentence", "GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_antecedent_meaning_sentence_from_conditional_meaning_sentence", "GET-ANTECEDENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_consequent_logical_schemata_from_conditional_meaning_sentence", "GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_consequent_meaning_sentence_from_conditional_meaning_sentence", "GET-CONSEQUENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_relevant_meaning_sentence_from_gaf_internal", "GET-RELEVANT-MEANING-SENTENCE-FROM-GAF-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_relevant_meaning_sentence_from_gaf", "GET-RELEVANT-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "get_relevant_logical_schemata_and_meaning_sentence_from_gaf", "GET-RELEVANT-LOGICAL-SCHEMATA-AND-MEANING-SENTENCE-FROM-GAF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "supported_conditional_meaning_sentence_gaf_p", "SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "supported_conditional_meaning_sentence_gaf_int_internal", "SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-INT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "supported_conditional_meaning_sentence_gaf_int", "SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_logical_schemata_setsP", "APPROPRIATE-LOGICAL-SCHEMATA-SETS?", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "with_appropriate_meaning_sentence_tmp_args", "WITH-APPROPRIATE-MEANING-SENTENCE-TMP-ARGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schemata_relevant_meaning_sentences", "LOGICAL-SCHEMATA-RELEVANT-MEANING-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentences_relevant_to_appropriateness_check", "LOGICAL-SCHEMA-MEANING-SENTENCES-RELEVANT-TO-APPROPRIATENESS-CHECK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check", "LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS-RELEVANT-TO-APPROPRIATENESS-CHECK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_consequent_meaning_sentenceP", "APPROPRIATE-CONSEQUENT-MEANING-SENTENCE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_consequent_literalP", "APPROPRIATE-CONSEQUENT-LITERAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_antecedent_meaning_sentenceP", "APPROPRIATE-ANTECEDENT-MEANING-SENTENCE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_antecedent_literalP", "APPROPRIATE-ANTECEDENT-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_antecedent_comparison_literalP", "APPROPRIATE-ANTECEDENT-COMPARISON-LITERAL?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "antecedent_logical_field_joinable_with_consequent_logical_fieldsP", "ANTECEDENT-LOGICAL-FIELD-JOINABLE-WITH-CONSEQUENT-LOGICAL-FIELDS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "appropriate_antecedent_other_literalP", "APPROPRIATE-ANTECEDENT-OTHER-LITERAL?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_gafs", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_gafs_memoized_internal", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_gafs_memoized", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_gafs_int", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_conditional_meaning_sentence_gafs_memoized", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_conditional_meaning_sentence_gafs_int", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_unindexed_consequent_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMA-UNINDEXED-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_pred_relevantP_internal", "MEANING-SENTENCE-PRED-RELEVANT?-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_pred_relevantP", "MEANING-SENTENCE-PRED-RELEVANT?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_meaning_sentence_gafs_memoized_internal", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_meaning_sentence_gafs_memoized", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_meaning_sentence_gafs_int", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_consequent_conditional_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized_internal", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED-INTERNAL", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_memoized", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_conditional_meaning_sentence_gafs_internal", "LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_consequent_conditional_meaning_sentence_gafs_int", "RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-INT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "asserted_logical_schema_meaning_sentences", "ASSERTED-LOGICAL-SCHEMA-MEANING-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentences", "LOGICAL-SCHEMA-MEANING-SENTENCES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_meaning_sentences", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCES", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schemata_meaning_sentence_gafs", "LOGICAL-SCHEMATA-MEANING-SENTENCE-GAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schemata_consequent_conditional_meaning_sentence_gafs", "LOGICAL-SCHEMATA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schemata_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMATA-MEANING-SENTENCE-GAFS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schemata_consequent_conditional_meaning_sentence_gafs", "RELEVANT-LOGICAL-SCHEMATA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_meaning_sentences_internal", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_meaning_sentences", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_conditional_meaning_sentences_internal", "RELEVANT-LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCES-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "relevant_logical_schema_conditional_meaning_sentences", "RELEVANT-LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_conditional_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentences_for_pred", "LOGICAL-SCHEMA-MEANING-SENTENCES-FOR-PRED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_meaning_sentences_for_pred", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCES-FOR-PRED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schemata_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMATA-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schemata_consequent_conditional_meaning_sentence_gafs_for_pred", "LOGICAL-SCHEMATA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_preds", "LOGICAL-SCHEMA-MEANING-SENTENCE-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_meaning_sentence_predP", "LOGICAL-SCHEMA-MEANING-SENTENCE-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_meaning_sentence_preds", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCE-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_consequent_meaning_sentence_predP", "LOGICAL-SCHEMA-CONSEQUENT-MEANING-SENTENCE-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_all_relevant_preds", "LOGICAL-SCHEMA-ALL-RELEVANT-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_all_relevant_preds_memoized_internal", "LOGICAL-SCHEMA-ALL-RELEVANT-PREDS-MEMOIZED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_all_relevant_preds_memoized", "LOGICAL-SCHEMA-ALL-RELEVANT-PREDS-MEMOIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_code_mapping_predicates_for_logical_field_indexical_internal", "SKSI-CODE-MAPPING-PREDICATES-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_code_mapping_predicates_for_logical_field_indexical", "SKSI-CODE-MAPPING-PREDICATES-FOR-LOGICAL-FIELD-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentences_type_check", "MEANING-SENTENCES-TYPE-CHECK", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_type_check", "MEANING-SENTENCE-TYPE-CHECK", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_type_check_memoized_internal", "MEANING-SENTENCE-TYPE-CHECK-MEMOIZED-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_type_check_memoized", "MEANING-SENTENCE-TYPE-CHECK-MEMOIZED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_type_check_int", "MEANING-SENTENCE-TYPE-CHECK-INT", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_arg_type_check", "MEANING-SENTENCE-ARG-TYPE-CHECK", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_arg_type_check_memoized_internal", "MEANING-SENTENCE-ARG-TYPE-CHECK-MEMOIZED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_arg_type_check_memoized", "MEANING-SENTENCE-ARG-TYPE-CHECK-MEMOIZED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_arg_type_check_int", "MEANING-SENTENCE-ARG-TYPE-CHECK-INT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_gaf_type_check", "MEANING-SENTENCE-GAF-TYPE-CHECK", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_gafs_type_check", "MEANING-SENTENCE-GAFS-TYPE-CHECK", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_robust_pattern_for_meaning_sentence", "GENERATE-ROBUST-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_robust_pattern_for_meaning_sentence_args", "GENERATE-ROBUST-PATTERN-FOR-MEANING-SENTENCE-ARGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_weak_pattern_for_meaning_sentence", "GENERATE-WEAK-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_strict_pattern_for_meaning_sentence", "GENERATE-STRICT-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_strict_pattern_for_meaning_sentence_args", "GENERATE-STRICT-PATTERN-FOR-MEANING-SENTENCE-ARGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_strict_pattern_for_meaning_sentence_arg", "GENERATE-STRICT-PATTERN-FOR-MEANING-SENTENCE-ARG", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pedantic_pattern_for_meaning_sentence", "GENERATE-PEDANTIC-PATTERN-FOR-MEANING-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_memoized_internal", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-MEMOIZED-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_memoized", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-MEMOIZED", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence", "GENERATE-PATTERN-FOR-MEANING-SENTENCE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "transitive_args_for_meaning_sentence_predicate", "TRANSITIVE-ARGS-FOR-MEANING-SENTENCE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_args", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARGS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_arg", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_arg_memoized_internal", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-MEMOIZED-INTERNAL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_arg_memoized", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-MEMOIZED", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_meaning_sentence_arg_int", "GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-INT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_logical_field_indexical", "GENERATE-PATTERN-FOR-LOGICAL-FIELD-INDEXICAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_el_variable", "GENERATE-PATTERN-FOR-EL-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_collection", "GENERATE-PATTERN-FOR-COLLECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_predicate", "GENERATE-PATTERN-FOR-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "generate_pattern_for_nat", "GENERATE-PATTERN-FOR-NAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "ist_meaning_sentence_gaf_p", "IST-MEANING-SENTENCE-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "unwrap_meaning_sentence_if_ist", "UNWRAP-MEANING-SENTENCE-IF-IST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_reconstruct_meaning_sentence", "SKSI-RECONSTRUCT-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "possibly_nart_el_formula_wXo_logical_field_indexicals_p", "POSSIBLY-NART-EL-FORMULA-W/O-LOGICAL-FIELD-INDEXICALS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_valid_meaning_sentence_pred_p_internal", "SKSI-VALID-MEANING-SENTENCE-PRED-P-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_valid_meaning_sentence_pred_p", "SKSI-VALID-MEANING-SENTENCE-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_valid_meaning_sentence_pred_for_storage_p_internal", "SKSI-VALID-MEANING-SENTENCE-PRED-FOR-STORAGE-P-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "sksi_valid_meaning_sentence_pred_for_storage_p", "SKSI-VALID-MEANING-SENTENCE-PRED-FOR-STORAGE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_logical_field_indexicals", "MEANING-SENTENCE-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "logical_schema_logical_field_indexicals_used_in_meaning_sentences", "LOGICAL-SCHEMA-LOGICAL-FIELD-INDEXICALS-USED-IN-MEANING-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_logical_fields", "MEANING-SENTENCE-LOGICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_logical_field_indexical_p_internal", "MEANING-SENTENCE-LOGICAL-FIELD-INDEXICAL-P-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_logical_field_indexical_p", "MEANING-SENTENCE-LOGICAL-FIELD-INDEXICAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "meaning_sentence_with_logical_field_indexical_predicateP", "MEANING-SENTENCE-WITH-LOGICAL-FIELD-INDEXICAL-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "possibly_constrain_consequent_meaning_sentence", "POSSIBLY-CONSTRAIN-CONSEQUENT-MEANING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "antecedent_meaning_sentence_constraining_lfi_as_non_lfi", "ANTECEDENT-MEANING-SENTENCE-CONSTRAINING-LFI-AS-NON-LFI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities", "atomic_sentence_constraining_lfi_as_non_lfi", "ATOMIC-SENTENCE-CONSTRAINING-LFI-AS-NON-LFI", 2, 0, false);
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    public static SubLObject init_sksi_meaning_sentence_utilities_file() {
        sksi_meaning_sentence_utilities.$appropriate_antecedent_literal_tmp_args$ = SubLFiles.defparameter("*APPROPRIATE-ANTECEDENT-LITERAL-TMP-ARGS*", (SubLObject)sksi_meaning_sentence_utilities.NIL);
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_meaning_sentence_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym16$GET_RELEVANT_MEANING_SENTENCE_FROM_GAF);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym18$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym31$LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym36$MEANING_SENTENCE_PRED_RELEVANT_);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym41$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym43$LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym44$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym45$RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym47$LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym49$SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym51$MEANING_SENTENCE_TYPE_CHECK_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym54$MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym58$GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym68$GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym85$SKSI_VALID_MEANING_SENTENCE_PRED_P);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym86$SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P);
        memoization_state.note_memoized_function((SubLObject)sksi_meaning_sentence_utilities.$sym88$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P);
        return (SubLObject)sksi_meaning_sentence_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_meaning_sentence_utilities_file();
    }
    
    public void initializeVariables() {
        init_sksi_meaning_sentence_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_meaning_sentence_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_meaning_sentence_utilities();
        sksi_meaning_sentence_utilities.$appropriate_antecedent_literal_tmp_args$ = null;
        $const0$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentenceOfSchema"));
        $const1$conditionalMeaningSentenceOfSchem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalMeaningSentenceOfSchema"));
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCE-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym4$GAF_ARGS = SubLObjectFactory.makeSymbol("GAF-ARGS");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-MEANING-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT-LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT-MEANING-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-MEANING-SENTENCE-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym7$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF");
        $sym8$GET_ANTECEDENT_MEANING_SENTENCE_FROM_GAF = SubLObjectFactory.makeSymbol("GET-ANTECEDENT-MEANING-SENTENCE-FROM-GAF");
        $sym9$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE-GAF");
        $sym10$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF = SubLObjectFactory.makeSymbol("GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-MEANING-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT-LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT-MEANING-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-MEANING-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym12$GET_ANTECEDENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("GET-ANTECEDENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE");
        $sym13$GET_ANTECEDENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("GET-ANTECEDENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE");
        $sym14$GET_CONSEQUENT_LOGICAL_SCHEMATA_FROM_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("GET-CONSEQUENT-LOGICAL-SCHEMATA-FROM-CONDITIONAL-MEANING-SENTENCE");
        $sym15$GET_CONSEQUENT_MEANING_SENTENCE_FROM_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("GET-CONSEQUENT-MEANING-SENTENCE-FROM-CONDITIONAL-MEANING-SENTENCE");
        $sym16$GET_RELEVANT_MEANING_SENTENCE_FROM_GAF = SubLObjectFactory.makeSymbol("GET-RELEVANT-MEANING-SENTENCE-FROM-GAF");
        $int17$1000 = SubLObjectFactory.makeInteger(1000);
        $sym18$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_INT = SubLObjectFactory.makeSymbol("SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-INT");
        $sym19$LOGICAL_SCHEMA_SOURCES = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-SOURCES");
        $sym20$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("CON-MS"), (SubLObject)SubLObjectFactory.makeSymbol("ANT-LS-SET"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$CON_LFS = SubLObjectFactory.makeSymbol("CON-LFS");
        $sym23$EXPRESSION_LOGICAL_FIELDS_FOR_INDEXICALS = SubLObjectFactory.makeSymbol("EXPRESSION-LOGICAL-FIELDS-FOR-INDEXICALS");
        $sym24$_APPROPRIATE_ANTECEDENT_LITERAL_TMP_ARGS_ = SubLObjectFactory.makeSymbol("*APPROPRIATE-ANTECEDENT-LITERAL-TMP-ARGS*");
        $sym25$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym26$LOGICAL_FIELD_INDEXICAL_FOR_SCHEMA_ = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-FOR-SCHEMA?");
        $sym27$APPROPRIATE_ANTECEDENT_LITERAL_ = SubLObjectFactory.makeSymbol("APPROPRIATE-ANTECEDENT-LITERAL?");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("CON-LFS"), (SubLObject)SubLObjectFactory.makeSymbol("ANT-LS-SET"));
        $sym29$LOGICAL_FIELDS_JOINABLE_ = SubLObjectFactory.makeSymbol("LOGICAL-FIELDS-JOINABLE?");
        $kw30$RAW = SubLObjectFactory.makeKeyword("RAW");
        $sym31$LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED");
        $kw32$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym33$GAF_FORMULA = SubLObjectFactory.makeSymbol("GAF-FORMULA");
        $sym34$LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_GAFS_MEMOI = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED");
        $sym35$SUPPORTED_CONDITIONAL_MEANING_SENTENCE_GAF_P = SubLObjectFactory.makeSymbol("SUPPORTED-CONDITIONAL-MEANING-SENTENCE-GAF-P");
        $sym36$MEANING_SENTENCE_PRED_RELEVANT_ = SubLObjectFactory.makeSymbol("MEANING-SENTENCE-PRED-RELEVANT?");
        $sym37$RELEVANT_PRED_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ");
        $sym38$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $sym39$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $sym40$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE");
        $sym41$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCE_GAFS_MEMOIZED = SubLObjectFactory.makeSymbol("RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE-GAFS-MEMOIZED");
        $sym42$RELEVANT_LOGICAL_SCHEMA_CONSEQUENT_CONDITIONAL_MEANING_SENTENCE_G = SubLObjectFactory.makeSymbol("RELEVANT-LOGICAL-SCHEMA-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAFS-MEMOIZED");
        $sym43$LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCE_GAFS = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCE-GAFS");
        $sym44$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES = SubLObjectFactory.makeSymbol("RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES");
        $sym45$RELEVANT_LOGICAL_SCHEMA_CONDITIONAL_MEANING_SENTENCES = SubLObjectFactory.makeSymbol("RELEVANT-LOGICAL-SCHEMA-CONDITIONAL-MEANING-SENTENCES");
        $sym46$GET_CONSEQUENT_MEANING_SENTENCE_FROM_GAF_UNWRAPPING_ISTS = SubLObjectFactory.makeSymbol("GET-CONSEQUENT-MEANING-SENTENCE-FROM-GAF-UNWRAPPING-ISTS");
        $sym47$LOGICAL_SCHEMA_ALL_RELEVANT_PREDS_MEMOIZED = SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA-ALL-RELEVANT-PREDS-MEMOIZED");
        $sym48$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
        $sym49$SKSI_CODE_MAPPING_PREDICATES_FOR_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("SKSI-CODE-MAPPING-PREDICATES-FOR-LOGICAL-FIELD-INDEXICAL");
        $kw50$ROBUST = SubLObjectFactory.makeKeyword("ROBUST");
        $sym51$MEANING_SENTENCE_TYPE_CHECK_MEMOIZED = SubLObjectFactory.makeSymbol("MEANING-SENTENCE-TYPE-CHECK-MEMOIZED");
        $str52$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str53$meaning_sentence_type_check_int_f = SubLObjectFactory.makeString("meaning-sentence-type-check-int failed: ~S wrt ~S~%");
        $sym54$MEANING_SENTENCE_ARG_TYPE_CHECK_MEMOIZED = SubLObjectFactory.makeSymbol("MEANING-SENTENCE-ARG-TYPE-CHECK-MEMOIZED");
        $kw55$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $kw56$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $kw57$PEDANTIC = SubLObjectFactory.makeKeyword("PEDANTIC");
        $sym58$GENERATE_PATTERN_FOR_MEANING_SENTENCE_MEMOIZED = SubLObjectFactory.makeSymbol("GENERATE-PATTERN-FOR-MEANING-SENTENCE-MEMOIZED");
        $kw59$OR = SubLObjectFactory.makeKeyword("OR");
        $kw60$UNIFY = SubLObjectFactory.makeKeyword("UNIFY");
        $kw61$SPEC_PRED = SubLObjectFactory.makeKeyword("SPEC-PRED");
        $kw62$NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $kw63$SPEC_INVERSE = SubLObjectFactory.makeKeyword("SPEC-INVERSE");
        $str64$Unknown_strength__a_ = SubLObjectFactory.makeString("Unknown strength ~a.");
        $const65$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list66 = ConsesLow.list((SubLObject)sksi_meaning_sentence_utilities.TWO_INTEGER);
        $sym67$_ = SubLObjectFactory.makeSymbol("=");
        $sym68$GENERATE_PATTERN_FOR_MEANING_SENTENCE_ARG_MEMOIZED = SubLObjectFactory.makeSymbol("GENERATE-PATTERN-FOR-MEANING-SENTENCE-ARG-MEMOIZED");
        $sym69$EL_VARIABLE_P = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $sym70$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $sym71$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $sym72$CYCL_NAT_P = SubLObjectFactory.makeSymbol("CYCL-NAT-P");
        $kw73$ISA_MEMOIZED = SubLObjectFactory.makeKeyword("ISA-MEMOIZED");
        $kw74$NOT_ISA_DISJOINT_MEMOIZED = SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT-MEMOIZED");
        $kw75$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw76$NOT_ISA_DISJOINT = SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT");
        $kw77$AND = SubLObjectFactory.makeKeyword("AND");
        $kw78$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw79$EL_VARIABLE = SubLObjectFactory.makeKeyword("EL-VARIABLE");
        $kw80$SPEC = SubLObjectFactory.makeKeyword("SPEC");
        $kw81$NAT = SubLObjectFactory.makeKeyword("NAT");
        $sym82$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P");
        $sym83$POSSIBLY_NART_EL_FORMULA_W_O_LOGICAL_FIELD_INDEXICALS_P = SubLObjectFactory.makeSymbol("POSSIBLY-NART-EL-FORMULA-W/O-LOGICAL-FIELD-INDEXICALS-P");
        $sym84$FIND_NART = SubLObjectFactory.makeSymbol("FIND-NART");
        $sym85$SKSI_VALID_MEANING_SENTENCE_PRED_P = SubLObjectFactory.makeSymbol("SKSI-VALID-MEANING-SENTENCE-PRED-P");
        $sym86$SKSI_VALID_MEANING_SENTENCE_PRED_FOR_STORAGE_P = SubLObjectFactory.makeSymbol("SKSI-VALID-MEANING-SENTENCE-PRED-FOR-STORAGE-P");
        $sym87$LOGICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL");
        $sym88$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("MEANING-SENTENCE-LOGICAL-FIELD-INDEXICAL-P");
        $const89$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw90$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
    }
}

/*

	Total time: 614 ms
	
*/