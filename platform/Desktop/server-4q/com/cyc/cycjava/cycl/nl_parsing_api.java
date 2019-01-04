package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_parsing_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_parsing_api";
    public static final String myFingerPrint = "ab447f5b890824145bb0a89307071b6e77df70c830d018bd38a2241a8a2ed456";
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLSymbol $dtp_tag_relations_iterator_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5182L)
    private static SubLSymbol $sentence_cyclifiers$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLSymbol $dtp_sentence_cyclifier$;
    private static final SubLSymbol $sym0$TAG_RELATIONS;
    private static final SubLSymbol $kw1$OUTPUT_SPEC;
    private static final SubLSymbol $kw2$SIMPLE;
    private static final SubLSymbol $kw3$FILTER;
    private static final SubLSymbol $kw4$SENSE_TAGGER;
    private static final SubLSymbol $kw5$SENTENCE_CYCLIFIER;
    private static final SubLSymbol $sym6$LINK_CYCLIFIER;
    private static final SubLSymbol $kw7$DOMAIN_MT;
    private static final SubLSymbol $sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P;
    private static final SubLSymbol $sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT;
    private static final SubLSymbol $sym10$TAG_RELATIONS_OPTIONAL_ARGS_P;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$TAG_RELATIONS_ITERATOR_STATE;
    private static final SubLSymbol $sym13$TAG_RELATIONS_ITERATOR_STATE_P;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym19$TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR;
    private static final SubLSymbol $sym22$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR;
    private static final SubLSymbol $sym23$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER;
    private static final SubLSymbol $sym24$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER;
    private static final SubLSymbol $sym25$TAG_RELATIONS_ITERATOR_STATE_DOCUMENT;
    private static final SubLSymbol $sym26$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT;
    private static final SubLSymbol $sym27$TAG_RELATIONS_ITERATOR_STATE_LEXICON;
    private static final SubLSymbol $sym28$_CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON;
    private static final SubLSymbol $sym29$TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER;
    private static final SubLSymbol $sym30$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER;
    private static final SubLSymbol $sym31$TAG_RELATIONS_ITERATOR_STATE_TIMEOUT;
    private static final SubLSymbol $sym32$_CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT;
    private static final SubLSymbol $sym33$TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym34$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym35$TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC;
    private static final SubLSymbol $sym36$_CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC;
    private static final SubLSymbol $sym37$TAG_RELATIONS_ITERATOR_STATE_FILTER;
    private static final SubLSymbol $sym38$_CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER;
    private static final SubLSymbol $sym39$TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT;
    private static final SubLSymbol $sym40$_CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT;
    private static final SubLSymbol $kw41$SENTENCE_ITERATOR;
    private static final SubLSymbol $kw42$DOCUMENT;
    private static final SubLSymbol $kw43$LEXICON;
    private static final SubLSymbol $kw44$TIMEOUT;
    private static final SubLSymbol $kw45$PREPARED_SENTENCE_OUTPUT;
    private static final SubLString $str46$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw47$BEGIN;
    private static final SubLSymbol $sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE;
    private static final SubLSymbol $kw49$SLOT;
    private static final SubLSymbol $kw50$END;
    private static final SubLSymbol $sym51$VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD;
    private static final SubLSymbol $sym52$LEARN;
    private static final SubLSymbol $sym53$SENTENCE_CYCLIFIER;
    private static final SubLSymbol $sym54$SENTENCE_CYCLIFIER_P;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$PRINT_SENTENCE_CYCLIFIER;
    private static final SubLSymbol $sym60$SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$SENTENCE_CYCLIFIER_NAME;
    private static final SubLSymbol $sym63$_CSETF_SENTENCE_CYCLIFIER_NAME;
    private static final SubLSymbol $sym64$SENTENCE_CYCLIFIER_CYCLIFY_METHOD;
    private static final SubLSymbol $sym65$_CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD;
    private static final SubLSymbol $sym66$SENTENCE_CYCLIFIER_LEXICON_METHOD;
    private static final SubLSymbol $sym67$_CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD;
    private static final SubLSymbol $kw68$NAME;
    private static final SubLSymbol $kw69$CYCLIFY_METHOD;
    private static final SubLSymbol $kw70$LEXICON_METHOD;
    private static final SubLSymbol $sym71$MAKE_SENTENCE_CYCLIFIER;
    private static final SubLSymbol $sym72$VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD;
    private static final SubLString $str73$__Cyclifier___A_;
    private static final SubLString $str74$_S_is_not_a_registered_cyclifier_;
    private static final SubLString $str75$_;
    private static final SubLSymbol $kw76$CYCL;
    private static final SubLSymbol $kw77$WEIGHT;
    private static final SubLSymbol $kw78$JUSTIFICATION;
    private static final SubLSymbol $sym79$EBMT_CYCLIFIER;
    private static final SubLSymbol $sym80$NEW_SEMTRANS_LEXICON;
    private static final SubLSymbol $kw81$PARSER;
    private static final SubLSymbol $sym82$STANFORD_CYCLIFIER;
    private static final SubLSymbol $sym83$NEW_CYCLIFIER_LEXICON;
    private static final SubLSymbol $sym84$API_CYCLIFIER_DONE_;
    private static final SubLSymbol $sym85$API_CYCLIFIER_GET_NEXT;
    private static final SubLSymbol $kw86$CYCLIFIER;
    private static final SubLSymbol $sym87$HAS_NEXT_;
    private static final SubLSymbol $sym88$NEXT;
    private static final SubLSymbol $sym89$DIRECTORY_P;
    private static final SubLString $str90$cdolist;
    private static final SubLString $str91$table;
    private static final SubLList $list92;
    private static final SubLString $str93$CycL___S__;
    private static final SubLSymbol $sym94$STRING_PHRASAL_MEANINGS;
    private static final SubLSymbol $sym95$STRINGP;
    private static final SubLSymbol $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P;
    private static final SubLSymbol $sym97$STRING_PHRASAL_MEANINGS_ITERATOR;
    private static final SubLSymbol $kw98$STRING;
    private static final SubLSymbol $sym99$PHRASAL_MEANINGS;
    private static final SubLSymbol $sym100$PHRASE_P;
    private static final SubLSymbol $sym101$PHRASAL_MEANINGS_ITERATOR;
    private static final SubLSymbol $kw102$SUBL;
    private static final SubLSymbol $kw103$LEARNERS;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$SYNTACTIC_RESTRICTION;
    private static final SubLSymbol $kw106$PHRASE_CYCLIFIER;
    private static final SubLSymbol $sym107$LEXICAL_PHRASE_CYCLIFIER;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$DEFAULT;
    private static final SubLSymbol $sym110$NL_INTERP_TO_XML;
    private static final SubLSymbol $sym111$GET;
    private static final SubLSymbol $sym112$PREDICATE_P;
    private static final SubLSymbol $sym113$SPEECH_PART_;
    private static final SubLSymbol $kw114$PREDICATE;
    private static final SubLSymbol $kw115$INFLECTIONS;
    private static final SubLSymbol $kw116$CYC_POS;
    private static final SubLSymbol $sym117$GET_NL_INTERP_CYCL;
    private static final SubLSymbol $sym118$STRING_PHRASAL_MEANINGS_TEST;
    private static final SubLSymbol $kw119$TEST;
    private static final SubLSymbol $sym120$SETS_EQUAL_EQUAL_;
    private static final SubLSymbol $kw121$OWNER;
    private static final SubLSymbol $kw122$CLASSES;
    private static final SubLList $list123;
    private static final SubLSymbol $kw124$KB;
    private static final SubLSymbol $kw125$FULL;
    private static final SubLSymbol $kw126$WORKING_;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$STRING_PHRASAL_MEANINGS_WITH_ARGS;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES;
    private static final SubLList $list135;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 927L)
    public static SubLObject tag_relations(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == nl_parsing_api.UNPROVIDED) {
            optional_arg_plist = (SubLObject)nl_parsing_api.NIL;
        }
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, (SubLObject)ConsesLow.list(new SubLObject[] { nl_parsing_api.$kw1$OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec((SubLObject)nl_parsing_api.$kw2$SIMPLE, nl_api_datastructures.new_nl_interpretation_spec((SubLObject)nl_parsing_api.UNPROVIDED)), nl_parsing_api.$kw3$FILTER, nl_parsing_api.NIL, nl_parsing_api.$kw4$SENSE_TAGGER, nl_parsing_api.NIL, nl_parsing_api.$kw5$SENTENCE_CYCLIFIER, nl_parsing_api.$sym6$LINK_CYCLIFIER, nl_parsing_api.$kw7$DOMAIN_MT, default_relation_tagging_domain_mt() }));
        final SubLObject result_iter = iteration.new_iterator(new_tag_relations_iterator_state(v_document, optional_arg_plist), (SubLObject)nl_parsing_api.$sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P, (SubLObject)nl_parsing_api.$sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT, (SubLObject)nl_parsing_api.UNPROVIDED);
        return result_iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 1627L)
    public static SubLObject tag_relations_optional_args_p(final SubLObject obj) {
        return list_utilities.plist_restricted_to_indicatorsP(obj, (SubLObject)nl_parsing_api.$list11);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)nl_parsing_api.ZERO_INTEGER);
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tag_relations_iterator_state_native.class) ? nl_parsing_api.T : nl_parsing_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_sentence_iterator(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_document(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_lexicon(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_sense_tagger(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_timeout(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_domain_mt(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_output_spec(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_filter(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_sentence_iterator(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_document(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_timeout(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_output_spec(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_filter(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject _csetf_tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != tag_relations_iterator_state_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject make_tag_relations_iterator_state(SubLObject arglist) {
        if (arglist == nl_parsing_api.UNPROVIDED) {
            arglist = (SubLObject)nl_parsing_api.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tag_relations_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)nl_parsing_api.NIL, next = arglist; nl_parsing_api.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)nl_parsing_api.$kw41$SENTENCE_ITERATOR)) {
                _csetf_tag_relations_iterator_state_sentence_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw5$SENTENCE_CYCLIFIER)) {
                _csetf_tag_relations_iterator_state_sentence_cyclifier(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw42$DOCUMENT)) {
                _csetf_tag_relations_iterator_state_document(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw43$LEXICON)) {
                _csetf_tag_relations_iterator_state_lexicon(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw4$SENSE_TAGGER)) {
                _csetf_tag_relations_iterator_state_sense_tagger(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw44$TIMEOUT)) {
                _csetf_tag_relations_iterator_state_timeout(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw7$DOMAIN_MT)) {
                _csetf_tag_relations_iterator_state_domain_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC)) {
                _csetf_tag_relations_iterator_state_output_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw3$FILTER)) {
                _csetf_tag_relations_iterator_state_filter(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw45$PREPARED_SENTENCE_OUTPUT)) {
                _csetf_tag_relations_iterator_state_prepared_sentence_output(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)nl_parsing_api.$str46$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject visit_defstruct_tag_relations_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw47$BEGIN, (SubLObject)nl_parsing_api.$sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE, (SubLObject)nl_parsing_api.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw41$SENTENCE_ITERATOR, tag_relations_iterator_state_sentence_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw5$SENTENCE_CYCLIFIER, tag_relations_iterator_state_sentence_cyclifier(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw42$DOCUMENT, tag_relations_iterator_state_document(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw43$LEXICON, tag_relations_iterator_state_lexicon(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw4$SENSE_TAGGER, tag_relations_iterator_state_sense_tagger(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw44$TIMEOUT, tag_relations_iterator_state_timeout(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw7$DOMAIN_MT, tag_relations_iterator_state_domain_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC, tag_relations_iterator_state_output_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw3$FILTER, tag_relations_iterator_state_filter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw45$PREPARED_SENTENCE_OUTPUT, tag_relations_iterator_state_prepared_sentence_output(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw50$END, (SubLObject)nl_parsing_api.$sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE, (SubLObject)nl_parsing_api.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2098L)
    public static SubLObject visit_defstruct_object_tag_relations_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tag_relations_iterator_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 2296L)
    public static SubLObject new_tag_relations_iterator_state(final SubLObject v_document, final SubLObject optional_arg_plist) {
        final SubLObject iter = make_tag_relations_iterator_state((SubLObject)nl_parsing_api.UNPROVIDED);
        _csetf_tag_relations_iterator_state_sentence_iterator(iter, document.new_sentence_iterator(v_document));
        _csetf_tag_relations_iterator_state_document(iter, v_document);
        _csetf_tag_relations_iterator_state_sentence_cyclifier(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw5$SENTENCE_CYCLIFIER, (SubLObject)nl_parsing_api.UNPROVIDED));
        _csetf_tag_relations_iterator_state_lexicon(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw43$LEXICON, default_lexicon_for_sentence_cyclifier(conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw5$SENTENCE_CYCLIFIER, (SubLObject)nl_parsing_api.UNPROVIDED))));
        _csetf_tag_relations_iterator_state_sense_tagger(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw4$SENSE_TAGGER, (SubLObject)nl_parsing_api.UNPROVIDED));
        _csetf_tag_relations_iterator_state_timeout(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw44$TIMEOUT, (SubLObject)nl_parsing_api.UNPROVIDED));
        _csetf_tag_relations_iterator_state_domain_mt(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw7$DOMAIN_MT, (SubLObject)nl_parsing_api.UNPROVIDED));
        _csetf_tag_relations_iterator_state_output_spec(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC, (SubLObject)nl_parsing_api.UNPROVIDED));
        _csetf_tag_relations_iterator_state_filter(iter, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw3$FILTER, (SubLObject)nl_parsing_api.UNPROVIDED));
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 3377L)
    public static SubLObject tag_relations_iterator_state_done_p(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_parsing_api.NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state)) && nl_parsing_api.NIL == tag_relations_iterator_state_prepared_sentence_output(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 3609L)
    public static SubLObject tag_relations_iterator_state_next(final SubLObject state) {
        SubLObject result = (SubLObject)nl_parsing_api.NIL;
        if (nl_parsing_api.NIL != tag_relations_iterator_state_prepared_sentence_output(state)) {
            result = tag_relations_iterator_state_prepared_sentence_output(state).first();
            _csetf_tag_relations_iterator_state_prepared_sentence_output(state, tag_relations_iterator_state_prepared_sentence_output(state).rest());
            return Values.values(result, state, (SubLObject)nl_parsing_api.NIL);
        }
        if (nl_parsing_api.NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state))) {
            return Values.values((SubLObject)nl_parsing_api.NIL, state, (SubLObject)nl_parsing_api.T);
        }
        final SubLObject sentence = iteration.iteration_next(tag_relations_iterator_state_sentence_iterator(state));
        final SubLObject lexicon = tag_relations_iterator_state_lexicon(state);
        final SubLObject filter = tag_relations_iterator_state_filter(state);
        final SubLObject output_spec = tag_relations_iterator_state_output_spec(state);
        final SubLObject learned_entities = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)nl_parsing_api.$sym52$LEARN, document.sentence_string(sentence));
        final SubLObject v_cyclifier = tag_relations_iterator_state_sentence_cyclifier(state);
        final SubLObject discourse = (SubLObject)nl_parsing_api.NIL;
        final SubLObject domain_mt = tag_relations_iterator_state_domain_mt(state);
        final SubLObject timeout = tag_relations_iterator_state_timeout(state);
        final SubLObject sentence_result = Functions.funcall(v_cyclifier, sentence, lexicon, output_spec, domain_mt, timeout, discourse);
        _csetf_tag_relations_iterator_state_prepared_sentence_output(state, (SubLObject)ConsesLow.cons(sentence_result, tag_relations_iterator_state_prepared_sentence_output(state)));
        result = tag_relations_iterator_state_prepared_sentence_output(state).first();
        _csetf_tag_relations_iterator_state_prepared_sentence_output(state, tag_relations_iterator_state_prepared_sentence_output(state).rest());
        return Values.values(result, state, (SubLObject)nl_parsing_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject sentence_cyclifier_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sentence_cyclifier(v_object, stream, (SubLObject)nl_parsing_api.ZERO_INTEGER);
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject sentence_cyclifier_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sentence_cyclifier_native.class) ? nl_parsing_api.T : nl_parsing_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject sentence_cyclifier_name(final SubLObject v_object) {
        assert nl_parsing_api.NIL != sentence_cyclifier_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject sentence_cyclifier_cyclify_method(final SubLObject v_object) {
        assert nl_parsing_api.NIL != sentence_cyclifier_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject sentence_cyclifier_lexicon_method(final SubLObject v_object) {
        assert nl_parsing_api.NIL != sentence_cyclifier_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject _csetf_sentence_cyclifier_name(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != sentence_cyclifier_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject _csetf_sentence_cyclifier_cyclify_method(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != sentence_cyclifier_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject _csetf_sentence_cyclifier_lexicon_method(final SubLObject v_object, final SubLObject value) {
        assert nl_parsing_api.NIL != sentence_cyclifier_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject make_sentence_cyclifier(SubLObject arglist) {
        if (arglist == nl_parsing_api.UNPROVIDED) {
            arglist = (SubLObject)nl_parsing_api.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sentence_cyclifier_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)nl_parsing_api.NIL, next = arglist; nl_parsing_api.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)nl_parsing_api.$kw68$NAME)) {
                _csetf_sentence_cyclifier_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw69$CYCLIFY_METHOD)) {
                _csetf_sentence_cyclifier_cyclify_method(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_parsing_api.$kw70$LEXICON_METHOD)) {
                _csetf_sentence_cyclifier_lexicon_method(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)nl_parsing_api.$str46$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject visit_defstruct_sentence_cyclifier(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw47$BEGIN, (SubLObject)nl_parsing_api.$sym71$MAKE_SENTENCE_CYCLIFIER, (SubLObject)nl_parsing_api.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw68$NAME, sentence_cyclifier_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw69$CYCLIFY_METHOD, sentence_cyclifier_cyclify_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw49$SLOT, (SubLObject)nl_parsing_api.$kw70$LEXICON_METHOD, sentence_cyclifier_lexicon_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_parsing_api.$kw50$END, (SubLObject)nl_parsing_api.$sym71$MAKE_SENTENCE_CYCLIFIER, (SubLObject)nl_parsing_api.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5246L)
    public static SubLObject visit_defstruct_object_sentence_cyclifier_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sentence_cyclifier(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5364L)
    public static SubLObject print_sentence_cyclifier(final SubLObject v_cyclifier, SubLObject stream, SubLObject depth) {
        if (stream == nl_parsing_api.UNPROVIDED) {
            stream = (SubLObject)nl_parsing_api.T;
        }
        if (depth == nl_parsing_api.UNPROVIDED) {
            depth = (SubLObject)nl_parsing_api.NIL;
        }
        PrintLow.format(stream, (SubLObject)nl_parsing_api.$str73$__Cyclifier___A_, sentence_cyclifier_name(v_cyclifier));
        return v_cyclifier;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 5554L)
    public static SubLObject declare_sentence_cyclifier(final SubLObject cyclifier_name, final SubLObject cyclify_method, SubLObject lexicon_method) {
        if (lexicon_method == nl_parsing_api.UNPROVIDED) {
            lexicon_method = (SubLObject)nl_parsing_api.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = make_sentence_cyclifier((SubLObject)nl_parsing_api.UNPROVIDED);
        _csetf_sentence_cyclifier_name(v_cyclifier, cyclifier_name);
        _csetf_sentence_cyclifier_cyclify_method(v_cyclifier, cyclify_method);
        _csetf_sentence_cyclifier_lexicon_method(v_cyclifier, lexicon_method);
        dictionary.dictionary_enter(nl_parsing_api.$sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, v_cyclifier);
        return v_cyclifier;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6006L)
    public static SubLObject sentence_cyclifier_get_cyclify_method(final SubLObject cyclifier_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = dictionary.dictionary_lookup(nl_parsing_api.$sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, (SubLObject)nl_parsing_api.UNPROVIDED);
        if (nl_parsing_api.NIL == v_cyclifier) {
            Errors.error((SubLObject)nl_parsing_api.$str74$_S_is_not_a_registered_cyclifier_, cyclifier_name);
        }
        return sentence_cyclifier_cyclify_method(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6300L)
    public static SubLObject sentence_cyclifier_get_lexicon_method(final SubLObject cyclifier_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = dictionary.dictionary_lookup(nl_parsing_api.$sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, (SubLObject)nl_parsing_api.UNPROVIDED);
        if (nl_parsing_api.NIL == v_cyclifier) {
            Errors.error((SubLObject)nl_parsing_api.$str74$_S_is_not_a_registered_cyclifier_, cyclifier_name);
        }
        return sentence_cyclifier_lexicon_method(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6594L)
    public static SubLObject default_lexicon_for_sentence_cyclifier(final SubLObject cyclifier_name) {
        return Functions.funcall(sentence_cyclifier_get_lexicon_method(cyclifier_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6743L)
    public static SubLObject default_relation_tagging_domain_mt() {
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 6813L)
    public static SubLObject ebmt_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = document.sentence_string(sentence);
        SubLObject nl_interps = (SubLObject)nl_parsing_api.NIL;
        if (nl_parsing_api.NIL == string_utilities.substringP((SubLObject)nl_parsing_api.$str75$_, string, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED)) {
            return iteration.new_list_iterator(nl_interps);
        }
        thread.resetMultipleValues();
        final SubLObject cycls = ebmt_template_parser.ebmt_parse(string, lexicon, domain_mt);
        final SubLObject justs = thread.secondMultipleValue();
        final SubLObject weights = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cycl = (SubLObject)nl_parsing_api.NIL;
        SubLObject cycl_$1 = (SubLObject)nl_parsing_api.NIL;
        SubLObject just = (SubLObject)nl_parsing_api.NIL;
        SubLObject just_$2 = (SubLObject)nl_parsing_api.NIL;
        SubLObject weight = (SubLObject)nl_parsing_api.NIL;
        SubLObject weight_$3 = (SubLObject)nl_parsing_api.NIL;
        cycl = cycls;
        cycl_$1 = cycl.first();
        just = justs;
        just_$2 = just.first();
        weight = weights;
        weight_$3 = weight.first();
        while (nl_parsing_api.NIL != weight || nl_parsing_api.NIL != just || nl_parsing_api.NIL != cycl) {
            final SubLObject interp = nl_api_datastructures.new_nl_interpretation((SubLObject)ConsesLow.list((SubLObject)nl_parsing_api.$kw76$CYCL, cycl_$1, (SubLObject)nl_parsing_api.$kw77$WEIGHT, weight_$3, (SubLObject)nl_parsing_api.$kw78$JUSTIFICATION, just_$2));
            nl_interps = (SubLObject)ConsesLow.cons(interp, nl_interps);
            cycl = cycl.rest();
            cycl_$1 = cycl.first();
            just = just.rest();
            just_$2 = just.first();
            weight = weight.rest();
            weight_$3 = weight.first();
        }
        return iteration.new_list_iterator(nl_interps);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 7512L)
    public static SubLObject stanford_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse) {
        final SubLObject string = document.sentence_string(sentence);
        final SubLObject v_parser = parser.new_stanford_parser((SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED);
        SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)nl_parsing_api.$kw81$PARSER, v_parser);
        if (nl_parsing_api.NIL != lexicon) {
            v_properties = conses_high.putf(v_properties, (SubLObject)nl_parsing_api.$kw43$LEXICON, lexicon);
        }
        return new_api_cyclifier(string, output_spec, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 7952L)
    public static SubLObject link_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse) {
        final SubLObject string = document.sentence_string(sentence);
        final SubLObject v_parser = parser.new_link_parser((SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED);
        SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)nl_parsing_api.$kw81$PARSER, v_parser);
        if (nl_parsing_api.NIL != lexicon) {
            v_properties = conses_high.putf(v_properties, (SubLObject)nl_parsing_api.$kw43$LEXICON, lexicon);
        }
        return new_api_cyclifier(string, output_spec, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 8375L)
    public static SubLObject new_api_cyclifier(final SubLObject english, final SubLObject output_spec, SubLObject v_properties) {
        if (v_properties == nl_parsing_api.UNPROVIDED) {
            v_properties = (SubLObject)nl_parsing_api.NIL;
        }
        final SubLObject cyclifier_iter = cyclifier.new_cyclifier(english, v_properties);
        return iteration.new_iterator(api_cyclifier_iterator_state(cyclifier_iter, output_spec), (SubLObject)nl_parsing_api.$sym84$API_CYCLIFIER_DONE_, (SubLObject)nl_parsing_api.$sym85$API_CYCLIFIER_GET_NEXT, (SubLObject)nl_parsing_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 8670L)
    public static SubLObject api_cyclifier_iterator_state(final SubLObject v_cyclifier, final SubLObject output_spec) {
        final SubLObject iter = (SubLObject)ConsesLow.list((SubLObject)nl_parsing_api.$kw86$CYCLIFIER, v_cyclifier, (SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC, output_spec);
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 8825L)
    public static SubLObject api_cyclifier_doneP(final SubLObject iterator_state) {
        final SubLObject v_cyclifier = conses_high.getf(iterator_state, (SubLObject)nl_parsing_api.$kw86$CYCLIFIER, (SubLObject)nl_parsing_api.UNPROVIDED);
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(nl_parsing_api.NIL == methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)nl_parsing_api.$sym87$HAS_NEXT_)), iterator_state, (SubLObject)nl_parsing_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9018L)
    public static SubLObject api_cyclifier_get_next(final SubLObject iterator_state) {
        final SubLObject v_cyclifier = conses_high.getf(iterator_state, (SubLObject)nl_parsing_api.$kw86$CYCLIFIER, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject cycl = methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)nl_parsing_api.$sym88$NEXT);
        final SubLObject output_spec = conses_high.getf(iterator_state, (SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC, (SubLObject)nl_parsing_api.UNPROVIDED);
        return Values.values(nl_api_datastructures.new_nl_interpretation((SubLObject)ConsesLow.list((SubLObject)nl_parsing_api.$kw76$CYCL, cycl)), iterator_state, (SubLObject)nl_parsing_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9322L)
    public static SubLObject tag_directory_relations(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nl_parsing_api.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)nl_parsing_api.T);
        final SubLObject progress_message_var = (SubLObject)nl_parsing_api.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (nl_parsing_api.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)nl_parsing_api.NIL, (SubLObject)nl_parsing_api.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$4 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((nl_parsing_api.NIL != progress_message_var) ? progress_message_var : nl_parsing_api.$str90$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)nl_parsing_api.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)nl_parsing_api.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nl_parsing_api.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nl_parsing_api.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)nl_parsing_api.NIL;
                    file = csome_list_var.first();
                    while (nl_parsing_api.NIL != csome_list_var) {
                        if (nl_parsing_api.NIL == Filesys.directory_p(file)) {
                            tag_relations_from_file(file);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)nl_parsing_api.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_parsing_api.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9607L)
    public static SubLObject tag_relations_from_files(final SubLObject file_list) {
        SubLObject cdolist_list_var = file_list;
        SubLObject file = (SubLObject)nl_parsing_api.NIL;
        file = cdolist_list_var.first();
        while (nl_parsing_api.NIL != cdolist_list_var) {
            if (nl_parsing_api.NIL == Filesys.directory_p(file) || nl_parsing_api.NIL == string_utilities.substringP((SubLObject)nl_parsing_api.$str91$table, file, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED)) {
                tag_relations_from_file(file);
            }
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        }
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 9811L)
    public static SubLObject tag_relations_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doc = document.new_document_from_file(file, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject iter = tag_relations(doc, (SubLObject)nl_parsing_api.$list92);
        SubLObject sentence_count = (SubLObject)nl_parsing_api.ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)nl_parsing_api.NIL; nl_parsing_api.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_parsing_api.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject sentence = iteration.iteration_next(iter);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (nl_parsing_api.NIL != valid) {
                if (sentence_count.numG((SubLObject)nl_parsing_api.TEN_INTEGER)) {
                    return file;
                }
                sentence_count = Numbers.add(sentence_count, (SubLObject)nl_parsing_api.ONE_INTEGER);
                SubLObject valid_$7;
                for (SubLObject done_var_$6 = (SubLObject)nl_parsing_api.NIL; nl_parsing_api.NIL == done_var_$6; done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(nl_parsing_api.NIL == valid_$7)) {
                    thread.resetMultipleValues();
                    final SubLObject cycl = iteration.iteration_next(sentence);
                    valid_$7 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (nl_parsing_api.NIL != valid_$7) {
                        PrintLow.format((SubLObject)nl_parsing_api.T, (SubLObject)nl_parsing_api.$str93$CycL___S__, cycl);
                    }
                }
            }
        }
        return file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 10179L)
    public static SubLObject sentencifications_from_file(final SubLObject file, SubLObject stream) {
        if (stream == nl_parsing_api.UNPROVIDED) {
            stream = (SubLObject)nl_parsing_api.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doc = document.new_document_from_file(file, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject sentences = document.new_sentence_iterator(doc);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)nl_parsing_api.NIL; nl_parsing_api.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_parsing_api.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject sentence = iteration.iteration_next(sentences);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (nl_parsing_api.NIL != valid) {
                print_high.princ(document.sentence_string(sentence), stream);
                streams_high.terpri(stream);
                streams_high.terpri(stream);
            }
        }
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 10495L)
    public static SubLObject string_phrasal_meanings(final SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == nl_parsing_api.UNPROVIDED) {
            optional_arg_plist = (SubLObject)nl_parsing_api.NIL;
        }
        enforceType(string, nl_parsing_api.$sym95$STRINGP);
        enforceType(optional_arg_plist, nl_parsing_api.$sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(string_phrasal_meanings_iterator(string, optional_arg_plist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 11016L)
    public static SubLObject string_phrasal_meanings_iterator(final SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == nl_parsing_api.UNPROVIDED) {
            optional_arg_plist = (SubLObject)nl_parsing_api.NIL;
        }
        enforceType(string, nl_parsing_api.$sym95$STRINGP);
        enforceType(optional_arg_plist, nl_parsing_api.$sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return phrasal_meanings_iterator(document.new_phrase((SubLObject)ConsesLow.list((SubLObject)nl_parsing_api.$kw98$STRING, string)), optional_arg_plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 11526L)
    public static SubLObject phrasal_meanings(final SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == nl_parsing_api.UNPROVIDED) {
            optional_arg_plist = (SubLObject)nl_parsing_api.NIL;
        }
        enforceType(phrase, nl_parsing_api.$sym100$PHRASE_P);
        enforceType(optional_arg_plist, nl_parsing_api.$sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(phrasal_meanings_iterator(phrase, optional_arg_plist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 12030L)
    public static SubLObject phrasal_meanings_iterator(final SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == nl_parsing_api.UNPROVIDED) {
            optional_arg_plist = (SubLObject)nl_parsing_api.NIL;
        }
        enforceType(phrase, nl_parsing_api.$sym100$PHRASE_P);
        enforceType(optional_arg_plist, nl_parsing_api.$sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, (SubLObject)ConsesLow.listS((SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC, new SubLObject[] { nl_api_datastructures.new_nl_output_spec((SubLObject)nl_parsing_api.$kw102$SUBL, nl_api_datastructures.new_nl_interpretation_spec((SubLObject)nl_parsing_api.UNPROVIDED)), nl_parsing_api.$kw103$LEARNERS, nl_parsing_api.$list104, nl_parsing_api.$kw3$FILTER, nl_parsing_api.NIL, nl_parsing_api.$kw105$SYNTACTIC_RESTRICTION, nl_parsing_api.NIL, nl_parsing_api.$kw106$PHRASE_CYCLIFIER, nl_parsing_api.$sym107$LEXICAL_PHRASE_CYCLIFIER, nl_parsing_api.$kw43$LEXICON, term_lexicon.new_case_sensitivity_preferred_term_lexicon(), nl_parsing_api.$kw7$DOMAIN_MT, default_relation_tagging_domain_mt(), nl_parsing_api.$list108 }));
        return iteration.new_list_iterator(Functions.funcall(conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw106$PHRASE_CYCLIFIER, (SubLObject)nl_parsing_api.UNPROVIDED), phrase, optional_arg_plist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 13101L)
    public static SubLObject phrasal_meanings_optional_args_p(final SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 14225L)
    public static SubLObject lexical_phrase_cyclifier(final SubLObject phrase, final SubLObject optional_arg_plist) {
        final SubLObject string = document.phrase_string(phrase);
        final SubLObject lex = conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw43$LEXICON, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject domain_mt = conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw7$DOMAIN_MT, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject output_spec = conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw1$OUTPUT_SPEC, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject interp_spec = nl_api_datastructures.output_spec_interp_spec(output_spec);
        final SubLObject filter_spec = conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw3$FILTER, (SubLObject)nl_parsing_api.$kw109$DEFAULT);
        final SubLObject learners = conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw103$LEARNERS, (SubLObject)nl_parsing_api.UNPROVIDED);
        SubLObject result_interps = (SubLObject)nl_parsing_api.NIL;
        SubLObject final_result = (SubLObject)nl_parsing_api.NIL;
        if (nl_parsing_api.NIL != learners) {
            methods.funcall_instance_method_with_2_args(lex, (SubLObject)nl_parsing_api.$sym52$LEARN, document.phrase_string(phrase), learners);
        }
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lex, (SubLObject)nl_parsing_api.$sym111$GET, string);
        SubLObject lex_entry = (SubLObject)nl_parsing_api.NIL;
        lex_entry = cdolist_list_var.first();
        while (nl_parsing_api.NIL != cdolist_list_var) {
            if (nl_parsing_api.NIL != lex_entry_passes_syntactic_restrictionP(lex_entry, conses_high.getf(optional_arg_plist, (SubLObject)nl_parsing_api.$kw105$SYNTACTIC_RESTRICTION, (SubLObject)nl_parsing_api.UNPROVIDED))) {
                result_interps = Sequences.cconcatenate(concept_tagger.concept_tagger_extract_interpretations_from_lex_entry((SubLObject)ConsesLow.list(lex_entry), interp_spec, filter_spec), result_interps);
                if (nl_parsing_api.NIL != nl_api_datastructures.xml_output_spec_p(output_spec)) {
                    final_result = Mapping.mapcar((SubLObject)nl_parsing_api.$sym110$NL_INTERP_TO_XML, result_interps);
                }
                else {
                    final_result = result_interps;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        }
        return final_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15260L)
    public static SubLObject lex_entry_passes_syntactic_restrictionP(final SubLObject lex_entry, final SubLObject restriction) {
        final SubLObject allowed_preds = list_utilities.remove_if_not((SubLObject)nl_parsing_api.$sym112$PREDICATE_P, restriction, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED);
        final SubLObject allowed_poses = list_utilities.remove_if_not((SubLObject)nl_parsing_api.$sym113$SPEECH_PART_, restriction, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED);
        if (nl_parsing_api.NIL == allowed_preds && nl_parsing_api.NIL == allowed_poses) {
            return (SubLObject)nl_parsing_api.T;
        }
        if (nl_parsing_api.NIL != allowed_preds) {
            SubLObject cdolist_list_var = allowed_preds;
            SubLObject allowed_pred = (SubLObject)nl_parsing_api.NIL;
            allowed_pred = cdolist_list_var.first();
            while (nl_parsing_api.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$8 = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)nl_parsing_api.$sym111$GET, (SubLObject)nl_parsing_api.$kw114$PREDICATE), methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)nl_parsing_api.$sym111$GET, (SubLObject)nl_parsing_api.$kw115$INFLECTIONS));
                SubLObject known_pred = (SubLObject)nl_parsing_api.NIL;
                known_pred = cdolist_list_var_$8.first();
                while (nl_parsing_api.NIL != cdolist_list_var_$8) {
                    if (nl_parsing_api.NIL != lexicon_accessors.genl_pos_predP(known_pred, allowed_pred, (SubLObject)nl_parsing_api.UNPROVIDED)) {
                        return (SubLObject)nl_parsing_api.T;
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    known_pred = cdolist_list_var_$8.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_pred = cdolist_list_var.first();
            }
        }
        if (nl_parsing_api.NIL != allowed_poses) {
            SubLObject cdolist_list_var = allowed_poses;
            SubLObject allowed_pos = (SubLObject)nl_parsing_api.NIL;
            allowed_pos = cdolist_list_var.first();
            while (nl_parsing_api.NIL != cdolist_list_var) {
                if (nl_parsing_api.NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)nl_parsing_api.$sym111$GET, (SubLObject)nl_parsing_api.$kw116$CYC_POS), allowed_pos, (SubLObject)nl_parsing_api.UNPROVIDED)) {
                    return (SubLObject)nl_parsing_api.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_pos = cdolist_list_var.first();
            }
        }
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
    public static SubLObject string_phrasal_meanings_test(final SubLObject string, SubLObject optional_args) {
        if (optional_args == nl_parsing_api.UNPROVIDED) {
            optional_args = (SubLObject)nl_parsing_api.NIL;
        }
        return Mapping.mapcar((SubLObject)nl_parsing_api.$sym117$GET_NL_INTERP_CYCL, string_phrasal_meanings(string, optional_args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
    public static SubLObject string_phrasal_meanings_with_args(final SubLObject string, SubLObject optional_args) {
        if (optional_args == nl_parsing_api.UNPROVIDED) {
            optional_args = (SubLObject)nl_parsing_api.NIL;
        }
        return string_phrasal_meanings(string, Eval.eval(optional_args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
    public static SubLObject string_phrasal_meanings_with_args_non_working_cases(final SubLObject string, SubLObject optional_args) {
        if (optional_args == nl_parsing_api.UNPROVIDED) {
            optional_args = (SubLObject)nl_parsing_api.NIL;
        }
        return string_phrasal_meanings_with_args(string, optional_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
    public static SubLObject string_phrasal_meanings_with_adhoc_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == nl_parsing_api.UNPROVIDED) {
            optional_args = (SubLObject)nl_parsing_api.NIL;
        }
        optional_args = conses_high.putf(optional_args, (SubLObject)nl_parsing_api.$kw3$FILTER, concept_filter.new_adhoc_concept_filter_spec(filter_type, (SubLObject)nl_parsing_api.UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
    public static SubLObject string_phrasal_meanings_with_adhoc_genls_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == nl_parsing_api.UNPROVIDED) {
            optional_args = (SubLObject)nl_parsing_api.NIL;
        }
        optional_args = conses_high.putf(optional_args, (SubLObject)nl_parsing_api.$kw3$FILTER, concept_filter.new_adhoc_genls_concept_filter_spec(filter_type, (SubLObject)nl_parsing_api.UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-parsing-api.lisp", position = 15924L)
    public static SubLObject string_phrasal_meanings_with_adhoc_isa_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == nl_parsing_api.UNPROVIDED) {
            optional_args = (SubLObject)nl_parsing_api.NIL;
        }
        optional_args = conses_high.putf(optional_args, (SubLObject)nl_parsing_api.$kw3$FILTER, concept_filter.new_adhoc_isa_concept_filter_spec(filter_type, (SubLObject)nl_parsing_api.UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }
    
    public static SubLObject declare_nl_parsing_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations", "TAG-RELATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_optional_args_p", "TAG-RELATIONS-OPTIONAL-ARGS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_print_function_trampoline", "TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_p", "TAG-RELATIONS-ITERATOR-STATE-P", 1, 0, false);
        new $tag_relations_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_sentence_iterator", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_sentence_cyclifier", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_document", "TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_lexicon", "TAG-RELATIONS-ITERATOR-STATE-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_sense_tagger", "TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_timeout", "TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_domain_mt", "TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_output_spec", "TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_filter", "TAG-RELATIONS-ITERATOR-STATE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_prepared_sentence_output", "TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_sentence_iterator", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_sentence_cyclifier", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_document", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_lexicon", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_sense_tagger", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_timeout", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_domain_mt", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_output_spec", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_filter", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_tag_relations_iterator_state_prepared_sentence_output", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "make_tag_relations_iterator_state", "MAKE-TAG-RELATIONS-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "visit_defstruct_tag_relations_iterator_state", "VISIT-DEFSTRUCT-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "visit_defstruct_object_tag_relations_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "new_tag_relations_iterator_state", "NEW-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_done_p", "TAG-RELATIONS-ITERATOR-STATE-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_iterator_state_next", "TAG-RELATIONS-ITERATOR-STATE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_print_function_trampoline", "SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_p", "SENTENCE-CYCLIFIER-P", 1, 0, false);
        new $sentence_cyclifier_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_name", "SENTENCE-CYCLIFIER-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_cyclify_method", "SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_lexicon_method", "SENTENCE-CYCLIFIER-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_sentence_cyclifier_name", "_CSETF-SENTENCE-CYCLIFIER-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_sentence_cyclifier_cyclify_method", "_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "_csetf_sentence_cyclifier_lexicon_method", "_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "make_sentence_cyclifier", "MAKE-SENTENCE-CYCLIFIER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "visit_defstruct_sentence_cyclifier", "VISIT-DEFSTRUCT-SENTENCE-CYCLIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "visit_defstruct_object_sentence_cyclifier_method", "VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "print_sentence_cyclifier", "PRINT-SENTENCE-CYCLIFIER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "declare_sentence_cyclifier", "DECLARE-SENTENCE-CYCLIFIER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_get_cyclify_method", "SENTENCE-CYCLIFIER-GET-CYCLIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentence_cyclifier_get_lexicon_method", "SENTENCE-CYCLIFIER-GET-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "default_lexicon_for_sentence_cyclifier", "DEFAULT-LEXICON-FOR-SENTENCE-CYCLIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "default_relation_tagging_domain_mt", "DEFAULT-RELATION-TAGGING-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "ebmt_cyclifier", "EBMT-CYCLIFIER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "stanford_cyclifier", "STANFORD-CYCLIFIER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "link_cyclifier", "LINK-CYCLIFIER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "new_api_cyclifier", "NEW-API-CYCLIFIER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "api_cyclifier_iterator_state", "API-CYCLIFIER-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "api_cyclifier_doneP", "API-CYCLIFIER-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "api_cyclifier_get_next", "API-CYCLIFIER-GET-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_directory_relations", "TAG-DIRECTORY-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_from_files", "TAG-RELATIONS-FROM-FILES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "tag_relations_from_file", "TAG-RELATIONS-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "sentencifications_from_file", "SENTENCIFICATIONS-FROM-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings", "STRING-PHRASAL-MEANINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_iterator", "STRING-PHRASAL-MEANINGS-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "phrasal_meanings", "PHRASAL-MEANINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "phrasal_meanings_iterator", "PHRASAL-MEANINGS-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "phrasal_meanings_optional_args_p", "PHRASAL-MEANINGS-OPTIONAL-ARGS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "lexical_phrase_cyclifier", "LEXICAL-PHRASE-CYCLIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "lex_entry_passes_syntactic_restrictionP", "LEX-ENTRY-PASSES-SYNTACTIC-RESTRICTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_test", "STRING-PHRASAL-MEANINGS-TEST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_with_args", "STRING-PHRASAL-MEANINGS-WITH-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_with_args_non_working_cases", "STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_with_adhoc_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-FILTER-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_with_adhoc_genls_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_parsing_api", "string_phrasal_meanings_with_adhoc_isa_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE", 2, 1, false);
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    public static SubLObject init_nl_parsing_api_file() {
        nl_parsing_api.$dtp_tag_relations_iterator_state$ = SubLFiles.defconstant("*DTP-TAG-RELATIONS-ITERATOR-STATE*", (SubLObject)nl_parsing_api.$sym12$TAG_RELATIONS_ITERATOR_STATE);
        nl_parsing_api.$sentence_cyclifiers$ = SubLFiles.defparameter("*SENTENCE-CYCLIFIERS*", dictionary.new_dictionary((SubLObject)nl_parsing_api.UNPROVIDED, (SubLObject)nl_parsing_api.UNPROVIDED));
        nl_parsing_api.$dtp_sentence_cyclifier$ = SubLFiles.defconstant("*DTP-SENTENCE-CYCLIFIER*", (SubLObject)nl_parsing_api.$sym53$SENTENCE_CYCLIFIER);
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    public static SubLObject setup_nl_parsing_api_file() {
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym0$TAG_RELATIONS);
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym10$TAG_RELATIONS_OPTIONAL_ARGS_P);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), nl_parsing_api.$dtp_tag_relations_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_parsing_api.$sym19$TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)nl_parsing_api.$list20);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym21$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR, (SubLObject)nl_parsing_api.$sym22$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym23$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER, (SubLObject)nl_parsing_api.$sym24$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym25$TAG_RELATIONS_ITERATOR_STATE_DOCUMENT, (SubLObject)nl_parsing_api.$sym26$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym27$TAG_RELATIONS_ITERATOR_STATE_LEXICON, (SubLObject)nl_parsing_api.$sym28$_CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym29$TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER, (SubLObject)nl_parsing_api.$sym30$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym31$TAG_RELATIONS_ITERATOR_STATE_TIMEOUT, (SubLObject)nl_parsing_api.$sym32$_CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym33$TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT, (SubLObject)nl_parsing_api.$sym34$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym35$TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC, (SubLObject)nl_parsing_api.$sym36$_CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym37$TAG_RELATIONS_ITERATOR_STATE_FILTER, (SubLObject)nl_parsing_api.$sym38$_CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym39$TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, (SubLObject)nl_parsing_api.$sym40$_CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT);
        Equality.identity((SubLObject)nl_parsing_api.$sym12$TAG_RELATIONS_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nl_parsing_api.$dtp_tag_relations_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_parsing_api.$sym51$VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)nl_parsing_api.$sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P);
        utilities_macros.note_funcall_helper_function((SubLObject)nl_parsing_api.$sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), nl_parsing_api.$dtp_sentence_cyclifier$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_parsing_api.$sym60$SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)nl_parsing_api.$list61);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym62$SENTENCE_CYCLIFIER_NAME, (SubLObject)nl_parsing_api.$sym63$_CSETF_SENTENCE_CYCLIFIER_NAME);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym64$SENTENCE_CYCLIFIER_CYCLIFY_METHOD, (SubLObject)nl_parsing_api.$sym65$_CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD);
        Structures.def_csetf((SubLObject)nl_parsing_api.$sym66$SENTENCE_CYCLIFIER_LEXICON_METHOD, (SubLObject)nl_parsing_api.$sym67$_CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD);
        Equality.identity((SubLObject)nl_parsing_api.$sym53$SENTENCE_CYCLIFIER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nl_parsing_api.$dtp_sentence_cyclifier$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_parsing_api.$sym72$VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD));
        declare_sentence_cyclifier((SubLObject)nl_parsing_api.$sym79$EBMT_CYCLIFIER, (SubLObject)nl_parsing_api.$sym79$EBMT_CYCLIFIER, (SubLObject)nl_parsing_api.$sym80$NEW_SEMTRANS_LEXICON);
        declare_sentence_cyclifier((SubLObject)nl_parsing_api.$sym82$STANFORD_CYCLIFIER, (SubLObject)nl_parsing_api.$sym82$STANFORD_CYCLIFIER, (SubLObject)nl_parsing_api.$sym83$NEW_CYCLIFIER_LEXICON);
        declare_sentence_cyclifier((SubLObject)nl_parsing_api.$sym6$LINK_CYCLIFIER, (SubLObject)nl_parsing_api.$sym6$LINK_CYCLIFIER, (SubLObject)nl_parsing_api.$sym83$NEW_CYCLIFIER_LEXICON);
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym94$STRING_PHRASAL_MEANINGS);
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym97$STRING_PHRASAL_MEANINGS_ITERATOR);
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym99$PHRASAL_MEANINGS);
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym101$PHRASAL_MEANINGS_ITERATOR);
        access_macros.register_external_symbol((SubLObject)nl_parsing_api.$sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        generic_testing.define_test_case_table_int((SubLObject)nl_parsing_api.$sym118$STRING_PHRASAL_MEANINGS_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { nl_parsing_api.$kw119$TEST, nl_parsing_api.$sym120$SETS_EQUAL_EQUAL_, nl_parsing_api.$kw121$OWNER, nl_parsing_api.NIL, nl_parsing_api.$kw122$CLASSES, nl_parsing_api.$list123, nl_parsing_api.$kw124$KB, nl_parsing_api.$kw125$FULL, nl_parsing_api.$kw126$WORKING_, nl_parsing_api.T }), (SubLObject)nl_parsing_api.$list127);
        generic_testing.define_test_case_table_int((SubLObject)nl_parsing_api.$sym128$STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE, (SubLObject)ConsesLow.list(new SubLObject[] { nl_parsing_api.$kw119$TEST, nl_parsing_api.EQUAL, nl_parsing_api.$kw121$OWNER, nl_parsing_api.NIL, nl_parsing_api.$kw122$CLASSES, nl_parsing_api.$list123, nl_parsing_api.$kw124$KB, nl_parsing_api.$kw125$FULL, nl_parsing_api.$kw126$WORKING_, nl_parsing_api.NIL }), (SubLObject)nl_parsing_api.$list129);
        generic_testing.define_test_case_table_int((SubLObject)nl_parsing_api.$sym130$STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE, (SubLObject)ConsesLow.list(new SubLObject[] { nl_parsing_api.$kw119$TEST, nl_parsing_api.EQUAL, nl_parsing_api.$kw121$OWNER, nl_parsing_api.NIL, nl_parsing_api.$kw122$CLASSES, nl_parsing_api.$list123, nl_parsing_api.$kw124$KB, nl_parsing_api.$kw125$FULL, nl_parsing_api.$kw126$WORKING_, nl_parsing_api.T }), (SubLObject)nl_parsing_api.$list131);
        generic_testing.define_test_case_table_int((SubLObject)nl_parsing_api.$sym132$STRING_PHRASAL_MEANINGS_WITH_ARGS, (SubLObject)ConsesLow.list(new SubLObject[] { nl_parsing_api.$kw119$TEST, nl_parsing_api.$sym120$SETS_EQUAL_EQUAL_, nl_parsing_api.$kw121$OWNER, nl_parsing_api.NIL, nl_parsing_api.$kw122$CLASSES, nl_parsing_api.$list123, nl_parsing_api.$kw124$KB, nl_parsing_api.$kw125$FULL, nl_parsing_api.$kw126$WORKING_, nl_parsing_api.T }), (SubLObject)nl_parsing_api.$list133);
        generic_testing.define_test_case_table_int((SubLObject)nl_parsing_api.$sym134$STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES, (SubLObject)ConsesLow.list(new SubLObject[] { nl_parsing_api.$kw119$TEST, nl_parsing_api.$sym120$SETS_EQUAL_EQUAL_, nl_parsing_api.$kw121$OWNER, nl_parsing_api.NIL, nl_parsing_api.$kw122$CLASSES, nl_parsing_api.$list123, nl_parsing_api.$kw124$KB, nl_parsing_api.$kw125$FULL, nl_parsing_api.$kw126$WORKING_, nl_parsing_api.NIL }), (SubLObject)nl_parsing_api.$list135);
        return (SubLObject)nl_parsing_api.NIL;
    }
    
    public void declareFunctions() {
        declare_nl_parsing_api_file();
    }
    
    public void initializeVariables() {
        init_nl_parsing_api_file();
    }
    
    public void runTopLevelForms() {
        setup_nl_parsing_api_file();
    }
    
    static {
        me = (SubLFile)new nl_parsing_api();
        nl_parsing_api.$dtp_tag_relations_iterator_state$ = null;
        nl_parsing_api.$sentence_cyclifiers$ = null;
        nl_parsing_api.$dtp_sentence_cyclifier$ = null;
        $sym0$TAG_RELATIONS = SubLObjectFactory.makeSymbol("TAG-RELATIONS");
        $kw1$OUTPUT_SPEC = SubLObjectFactory.makeKeyword("OUTPUT-SPEC");
        $kw2$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $kw3$FILTER = SubLObjectFactory.makeKeyword("FILTER");
        $kw4$SENSE_TAGGER = SubLObjectFactory.makeKeyword("SENSE-TAGGER");
        $kw5$SENTENCE_CYCLIFIER = SubLObjectFactory.makeKeyword("SENTENCE-CYCLIFIER");
        $sym6$LINK_CYCLIFIER = SubLObjectFactory.makeSymbol("LINK-CYCLIFIER");
        $kw7$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $sym8$TAG_RELATIONS_ITERATOR_STATE_DONE_P = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DONE-P");
        $sym9$TAG_RELATIONS_ITERATOR_STATE_NEXT = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-NEXT");
        $sym10$TAG_RELATIONS_OPTIONAL_ARGS_P = SubLObjectFactory.makeSymbol("TAG-RELATIONS-OPTIONAL-ARGS-P");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE-CYCLIFIER"), (SubLObject)SubLObjectFactory.makeKeyword("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("SENSE-TAGGER"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"));
        $sym12$TAG_RELATIONS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE");
        $sym13$TAG_RELATIONS_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-P");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SENTENCE-ITERATOR"), SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER"), SubLObjectFactory.makeSymbol("DOCUMENT"), SubLObjectFactory.makeSymbol("LEXICON"), SubLObjectFactory.makeSymbol("SENSE-TAGGER"), SubLObjectFactory.makeSymbol("TIMEOUT"), SubLObjectFactory.makeSymbol("DOMAIN-MT"), SubLObjectFactory.makeSymbol("OUTPUT-SPEC"), SubLObjectFactory.makeSymbol("FILTER"), SubLObjectFactory.makeSymbol("PREPARED-SENTENCE-OUTPUT") });
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENTENCE-ITERATOR"), SubLObjectFactory.makeKeyword("SENTENCE-CYCLIFIER"), SubLObjectFactory.makeKeyword("DOCUMENT"), SubLObjectFactory.makeKeyword("LEXICON"), SubLObjectFactory.makeKeyword("SENSE-TAGGER"), SubLObjectFactory.makeKeyword("TIMEOUT"), SubLObjectFactory.makeKeyword("DOMAIN-MT"), SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), SubLObjectFactory.makeKeyword("FILTER"), SubLObjectFactory.makeKeyword("PREPARED-SENTENCE-OUTPUT") });
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-LEXICON"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-FILTER"), SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER"), SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });
        $sym18$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym19$TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-P"));
        $sym21$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR");
        $sym22$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR");
        $sym23$TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER");
        $sym24$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER");
        $sym25$TAG_RELATIONS_ITERATOR_STATE_DOCUMENT = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOCUMENT");
        $sym26$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT");
        $sym27$TAG_RELATIONS_ITERATOR_STATE_LEXICON = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-LEXICON");
        $sym28$_CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON");
        $sym29$TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER");
        $sym30$_CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER");
        $sym31$TAG_RELATIONS_ITERATOR_STATE_TIMEOUT = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-TIMEOUT");
        $sym32$_CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT");
        $sym33$TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT");
        $sym34$_CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT");
        $sym35$TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC");
        $sym36$_CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC");
        $sym37$TAG_RELATIONS_ITERATOR_STATE_FILTER = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-FILTER");
        $sym38$_CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER");
        $sym39$TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = SubLObjectFactory.makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");
        $sym40$_CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = SubLObjectFactory.makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");
        $kw41$SENTENCE_ITERATOR = SubLObjectFactory.makeKeyword("SENTENCE-ITERATOR");
        $kw42$DOCUMENT = SubLObjectFactory.makeKeyword("DOCUMENT");
        $kw43$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $kw44$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw45$PREPARED_SENTENCE_OUTPUT = SubLObjectFactory.makeKeyword("PREPARED-SENTENCE-OUTPUT");
        $str46$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw47$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym48$MAKE_TAG_RELATIONS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-TAG-RELATIONS-ITERATOR-STATE");
        $kw49$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw50$END = SubLObjectFactory.makeKeyword("END");
        $sym51$VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD");
        $sym52$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym53$SENTENCE_CYCLIFIER = SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER");
        $sym54$SENTENCE_CYCLIFIER_P = SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-P");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-METHOD"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CYCLIFY-METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON-METHOD"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-CYCLIFY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-LEXICON-METHOD"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SENTENCE-CYCLIFIER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD"));
        $sym59$PRINT_SENTENCE_CYCLIFIER = SubLObjectFactory.makeSymbol("PRINT-SENTENCE-CYCLIFIER");
        $sym60$SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-P"));
        $sym62$SENTENCE_CYCLIFIER_NAME = SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-NAME");
        $sym63$_CSETF_SENTENCE_CYCLIFIER_NAME = SubLObjectFactory.makeSymbol("_CSETF-SENTENCE-CYCLIFIER-NAME");
        $sym64$SENTENCE_CYCLIFIER_CYCLIFY_METHOD = SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-CYCLIFY-METHOD");
        $sym65$_CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD = SubLObjectFactory.makeSymbol("_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD");
        $sym66$SENTENCE_CYCLIFIER_LEXICON_METHOD = SubLObjectFactory.makeSymbol("SENTENCE-CYCLIFIER-LEXICON-METHOD");
        $sym67$_CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD = SubLObjectFactory.makeSymbol("_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD");
        $kw68$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw69$CYCLIFY_METHOD = SubLObjectFactory.makeKeyword("CYCLIFY-METHOD");
        $kw70$LEXICON_METHOD = SubLObjectFactory.makeKeyword("LEXICON-METHOD");
        $sym71$MAKE_SENTENCE_CYCLIFIER = SubLObjectFactory.makeSymbol("MAKE-SENTENCE-CYCLIFIER");
        $sym72$VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD");
        $str73$__Cyclifier___A_ = SubLObjectFactory.makeString("#<Cyclifier: ~A>");
        $str74$_S_is_not_a_registered_cyclifier_ = SubLObjectFactory.makeString("~S is not a registered cyclifier.");
        $str75$_ = SubLObjectFactory.makeString("$");
        $kw76$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw77$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $kw78$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $sym79$EBMT_CYCLIFIER = SubLObjectFactory.makeSymbol("EBMT-CYCLIFIER");
        $sym80$NEW_SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("NEW-SEMTRANS-LEXICON");
        $kw81$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $sym82$STANFORD_CYCLIFIER = SubLObjectFactory.makeSymbol("STANFORD-CYCLIFIER");
        $sym83$NEW_CYCLIFIER_LEXICON = SubLObjectFactory.makeSymbol("NEW-CYCLIFIER-LEXICON");
        $sym84$API_CYCLIFIER_DONE_ = SubLObjectFactory.makeSymbol("API-CYCLIFIER-DONE?");
        $sym85$API_CYCLIFIER_GET_NEXT = SubLObjectFactory.makeSymbol("API-CYCLIFIER-GET-NEXT");
        $kw86$CYCLIFIER = SubLObjectFactory.makeKeyword("CYCLIFIER");
        $sym87$HAS_NEXT_ = SubLObjectFactory.makeSymbol("HAS-NEXT?");
        $sym88$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $sym89$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str90$cdolist = SubLObjectFactory.makeString("cdolist");
        $str91$table = SubLObjectFactory.makeString("table");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE-CYCLIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-CYCLIFIER"));
        $str93$CycL___S__ = SubLObjectFactory.makeString("CycL: ~S~%");
        $sym94$STRING_PHRASAL_MEANINGS = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS");
        $sym95$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym96$PHRASAL_MEANINGS_OPTIONAL_ARGS_P = SubLObjectFactory.makeSymbol("PHRASAL-MEANINGS-OPTIONAL-ARGS-P");
        $sym97$STRING_PHRASAL_MEANINGS_ITERATOR = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS-ITERATOR");
        $kw98$STRING = SubLObjectFactory.makeKeyword("STRING");
        $sym99$PHRASAL_MEANINGS = SubLObjectFactory.makeSymbol("PHRASAL-MEANINGS");
        $sym100$PHRASE_P = SubLObjectFactory.makeSymbol("PHRASE-P");
        $sym101$PHRASAL_MEANINGS_ITERATOR = SubLObjectFactory.makeSymbol("PHRASAL-MEANINGS-ITERATOR");
        $kw102$SUBL = SubLObjectFactory.makeKeyword("SUBL");
        $kw103$LEARNERS = SubLObjectFactory.makeKeyword("LEARNERS");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-LEARN"));
        $kw105$SYNTACTIC_RESTRICTION = SubLObjectFactory.makeKeyword("SYNTACTIC-RESTRICTION");
        $kw106$PHRASE_CYCLIFIER = SubLObjectFactory.makeKeyword("PHRASE-CYCLIFIER");
        $sym107$LEXICAL_PHRASE_CYCLIFIER = SubLObjectFactory.makeSymbol("LEXICAL-PHRASE-CYCLIFIER");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)nl_parsing_api.NIL);
        $kw109$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym110$NL_INTERP_TO_XML = SubLObjectFactory.makeSymbol("NL-INTERP-TO-XML");
        $sym111$GET = SubLObjectFactory.makeSymbol("GET");
        $sym112$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $sym113$SPEECH_PART_ = SubLObjectFactory.makeSymbol("SPEECH-PART?");
        $kw114$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw115$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $kw116$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $sym117$GET_NL_INTERP_CYCL = SubLObjectFactory.makeSymbol("GET-NL-INTERP-CYCL");
        $sym118$STRING_PHRASAL_MEANINGS_TEST = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS-TEST");
        $kw119$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym120$SETS_EQUAL_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?");
        $kw121$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw122$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TEST-CASES"), (SubLObject)SubLObjectFactory.makeSymbol("NL-PARSING-TEST-CASES"));
        $kw124$KB = SubLObjectFactory.makeKeyword("KB");
        $kw125$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw126$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dog")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HotDog")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("January 20, 2000")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)nl_parsing_api.TWENTY_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))))));
        $sym128$STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE");
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dog"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)nl_parsing_api.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dog"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dog"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)nl_parsing_api.NIL));
        $sym130$STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("January 20, 2000"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)nl_parsing_api.TWENTY_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("January 20, 2000"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)nl_parsing_api.TWENTY_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("January 21, 2000"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("January 21, 2000"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))))));
        $sym132$STRING_PHRASAL_MEANINGS_WITH_ARGS = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ARGS");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bank"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("SUBL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)nl_parsing_api.T)))), (SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC-RESTRICTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BankOrganization")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BankingTurn")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bank-Topographical")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bank"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("SUBL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)nl_parsing_api.T)))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MakingABankDeposit")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pluralVerb-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BankingTurn")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pluralVerb-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BankOrganization")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BankingTurn")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bank-Topographical")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))))));
        $sym134$STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES = SubLObjectFactory.makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES");
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bank"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("SUBL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)nl_parsing_api.T)))), (SubLObject)SubLObjectFactory.makeKeyword("FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BankOrganization")), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bank"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("XML"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)nl_parsing_api.T, (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-TYPES"), (SubLObject)nl_parsing_api.T)))), (SubLObject)SubLObjectFactory.makeKeyword("FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n <PhraseType>\n  <CycLConstant>\n    <name>CountNoun</name>\n    <namespace>cyc</namespace>\n    <guid>bd588078-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd588078-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </PhraseType>\n <HeadInflections>\n  <CycLConstant>\n    <name>singular</name>\n    <namespace>cyc</namespace>\n    <guid>bd6757b8-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd6757b8-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </HeadInflections>\n</NLInterpretation>"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bank"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("XML"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)nl_parsing_api.T)))), (SubLObject)SubLObjectFactory.makeKeyword("FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n</NLInterpretation>"))));
    }
    
    public static final class $tag_relations_iterator_state_native extends SubLStructNative
    {
        public SubLObject $sentence_iterator;
        public SubLObject $sentence_cyclifier;
        public SubLObject $document;
        public SubLObject $lexicon;
        public SubLObject $sense_tagger;
        public SubLObject $timeout;
        public SubLObject $domain_mt;
        public SubLObject $output_spec;
        public SubLObject $filter;
        public SubLObject $prepared_sentence_output;
        private static final SubLStructDeclNative structDecl;
        
        public $tag_relations_iterator_state_native() {
            this.$sentence_iterator = (SubLObject)CommonSymbols.NIL;
            this.$sentence_cyclifier = (SubLObject)CommonSymbols.NIL;
            this.$document = (SubLObject)CommonSymbols.NIL;
            this.$lexicon = (SubLObject)CommonSymbols.NIL;
            this.$sense_tagger = (SubLObject)CommonSymbols.NIL;
            this.$timeout = (SubLObject)CommonSymbols.NIL;
            this.$domain_mt = (SubLObject)CommonSymbols.NIL;
            this.$output_spec = (SubLObject)CommonSymbols.NIL;
            this.$filter = (SubLObject)CommonSymbols.NIL;
            this.$prepared_sentence_output = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tag_relations_iterator_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$sentence_iterator;
        }
        
        public SubLObject getField3() {
            return this.$sentence_cyclifier;
        }
        
        public SubLObject getField4() {
            return this.$document;
        }
        
        public SubLObject getField5() {
            return this.$lexicon;
        }
        
        public SubLObject getField6() {
            return this.$sense_tagger;
        }
        
        public SubLObject getField7() {
            return this.$timeout;
        }
        
        public SubLObject getField8() {
            return this.$domain_mt;
        }
        
        public SubLObject getField9() {
            return this.$output_spec;
        }
        
        public SubLObject getField10() {
            return this.$filter;
        }
        
        public SubLObject getField11() {
            return this.$prepared_sentence_output;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$sentence_iterator = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$sentence_cyclifier = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$document = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$lexicon = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$sense_tagger = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$timeout = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$domain_mt = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$output_spec = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$filter = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$prepared_sentence_output = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tag_relations_iterator_state_native.class, nl_parsing_api.$sym12$TAG_RELATIONS_ITERATOR_STATE, nl_parsing_api.$sym13$TAG_RELATIONS_ITERATOR_STATE_P, nl_parsing_api.$list14, nl_parsing_api.$list15, new String[] { "$sentence_iterator", "$sentence_cyclifier", "$document", "$lexicon", "$sense_tagger", "$timeout", "$domain_mt", "$output_spec", "$filter", "$prepared_sentence_output" }, nl_parsing_api.$list16, nl_parsing_api.$list17, nl_parsing_api.$sym18$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $tag_relations_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $tag_relations_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TAG-RELATIONS-ITERATOR-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return nl_parsing_api.tag_relations_iterator_state_p(arg1);
        }
    }
    
    public static final class $sentence_cyclifier_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $cyclify_method;
        public SubLObject $lexicon_method;
        private static final SubLStructDeclNative structDecl;
        
        public $sentence_cyclifier_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$cyclify_method = (SubLObject)CommonSymbols.NIL;
            this.$lexicon_method = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sentence_cyclifier_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$cyclify_method;
        }
        
        public SubLObject getField4() {
            return this.$lexicon_method;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$cyclify_method = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lexicon_method = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sentence_cyclifier_native.class, nl_parsing_api.$sym53$SENTENCE_CYCLIFIER, nl_parsing_api.$sym54$SENTENCE_CYCLIFIER_P, nl_parsing_api.$list55, nl_parsing_api.$list56, new String[] { "$name", "$cyclify_method", "$lexicon_method" }, nl_parsing_api.$list57, nl_parsing_api.$list58, nl_parsing_api.$sym59$PRINT_SENTENCE_CYCLIFIER);
        }
    }
    
    public static final class $sentence_cyclifier_p$UnaryFunction extends UnaryFunction
    {
        public $sentence_cyclifier_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SENTENCE-CYCLIFIER-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return nl_parsing_api.sentence_cyclifier_p(arg1);
        }
    }
}

/*

	Total time: 349 ms
	
*/