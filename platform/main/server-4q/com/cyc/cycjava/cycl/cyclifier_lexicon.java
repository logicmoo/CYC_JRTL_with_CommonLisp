/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyclifier_lexicon extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyclifier_lexicon();



    static private final SubLList $list2 = list(list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("CyclifierLexiconSpecification")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NUMBER"), list(makeSymbol("STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"))));

    private static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");

    static private final SubLList $list7 = list(new SubLObject[]{ reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"), reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"), reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"), reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"), reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") });

    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical = reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-CLASS");

    static private final SubLSymbol $sym25$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");

    static private final SubLSymbol $sym27$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-INSTANCE");

    private static final SubLSymbol CREATE_LEX_ENTRIES_NUMBER = makeSymbol("CREATE-LEX-ENTRIES-NUMBER");

    static private final SubLList $list35 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list36 = list(makeSymbol("NUMBER-STRING"));

    static private final SubLList $list37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("NUMBER-STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("thereExistAtLeast"), list(makeSymbol("STRING-TO-INTERVAL"), makeSymbol("NUMBER-STRING")), list(QUOTE, list($NOUN, list(reader_make_constant_shell("and"), makeKeyword("RESTR"), makeKeyword("SCOPE")))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("Number-SP")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(QUOTE, list(makeKeyword("CD")))), list(RET, list(makeSymbol("LIST"), makeSymbol("LEX-ENTRY")))));



    static private final SubLList $list43 = list($NOUN, list(reader_make_constant_shell("and"), makeKeyword("RESTR"), makeKeyword("SCOPE")));

    private static final SubLObject $$Number_SP = reader_make_constant_shell("Number-SP");

    static private final SubLList $list47 = list(makeKeyword("CD"));

    private static final SubLSymbol CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = makeSymbol("CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD");

    private static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_WORD = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD");

    static private final SubLList $list50 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    static private final SubLList $list51 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("PRED"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY")))), list(makeSymbol("PCOND"), list(list(makeSymbol("SEMTRANS-PRED?"), makeSymbol("PRED")), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), makeSymbol("NL-TRIE-ENTRY")))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("WU"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FRAME"), list(makeSymbol("NL-TRIE-WORD-FRAME"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("FIF"), makeSymbol("WU"), list(makeSymbol("INTERSECTION"), list(makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("STRING"), makeSymbol("WU")), list(makeSymbol("PREDS-OF-POS"), makeSymbol("POS"))), list(QUOTE, list(reader_make_constant_shell("singular"))))), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("GENL-POS?"), makeSymbol("POS"), reader_make_constant_shell("Verb")), list(makeSymbol("DAVIDSONIAN-P"), makeSymbol("SEMTRANS"))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("thereExists"), makeKeyword("ACTION"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("and"), makeSymbol("SEMTRANS"), list(QUOTE, list(makeKeyword("SCOPE"))))), makeSymbol("SEMTRANS"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), makeSymbol("FRAME")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), makeSymbol("WU")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))), list(list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY")), list(QUOTE, list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString")))), list(makeSymbol("GENL-POS?"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY")), reader_make_constant_shell("Noun"))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("PUNLESS"), list(makeSymbol("ISA-PREDICATE?"), makeSymbol("DENOT")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), list(makeSymbol("FIF"), list(makeSymbol("ISA-COLLECTION?"), makeSymbol("DENOT")), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")), $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })))))), list(RET, makeSymbol("LEX-ENTRIES"))));

    static private final SubLList $list52 = list(reader_make_constant_shell("singular"));







    static private final SubLList $list57 = list(makeKeyword("SCOPE"));

    static private final SubLList $list61 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString"));











    private static final SubLSymbol CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = makeSymbol("CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD");

    private static final SubLSymbol FABRICATE_VERBAL_SEMTRANS = makeSymbol("FABRICATE-VERBAL-SEMTRANS");

    static private final SubLList $list71 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"));

    static private final SubLList $list72 = list(makeString("@param STRING string; an English word\n   @param KEYWORDS list; a list of keywords to be incorporated into the fabricated semtrans\n   @return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS"), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FABRICATE-VERBAL-SEMTRANS"), makeSymbol("SUPER"), makeSymbol("STRING"), makeSymbol("KEYWORDS"))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("thereExists"), makeKeyword("ACTION"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("and"), makeSymbol("SEMTRANS"), list(QUOTE, list(makeKeyword("SCOPE"))))), makeSymbol("SEMTRANSES"))), list(RET, makeSymbol("SEMTRANSES"))));

    private static final SubLSymbol CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = makeSymbol("CYCLIFIER-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD");



    static private final SubLSymbol $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION = makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION");

    static private final SubLList $list76 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-CLASS");

    static private final SubLSymbol $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-INSTANCE");

    static private final SubLList $list80 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list81 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"));

    static private final SubLList $list82 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PENN"), makeSymbol("KEYWORDP")), list(RET, NIL));

    static private final SubLSymbol $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD = makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION-FABRICATE-METHOD");

    // Definitions
    public static final SubLObject new_cyclifier_lexicon_alt() {
        return object.new_class_instance(CYCLIFIER_LEXICON);
    }

    // Definitions
    public static SubLObject new_cyclifier_lexicon() {
        return object.new_class_instance(CYCLIFIER_LEXICON);
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_lexicon_class_alt(SubLObject new_instance) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list_alt7);
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
            return NIL;
        }
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list7);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_lexicon_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
        return NIL;
    }

    public static final SubLObject cyclifier_lexicon_p_alt(SubLObject v_cyclifier_lexicon) {
        return classes.subloop_instanceof_class(v_cyclifier_lexicon, CYCLIFIER_LEXICON);
    }

    public static SubLObject cyclifier_lexicon_p(final SubLObject v_cyclifier_lexicon) {
        return classes.subloop_instanceof_class(v_cyclifier_lexicon, CYCLIFIER_LEXICON);
    }

    public static final SubLObject cyclifier_lexicon_create_lex_entries_number_method_alt(SubLObject self, SubLObject number_string) {
        {
            SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, number_string);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, listS($$thereExistAtLeast, numeral_parser.string_to_interval(number_string), $list_alt43));
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$Number_SP);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $PENN_TAGS, $list_alt47);
            return list(lex_entry);
        }
    }

    public static SubLObject cyclifier_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string) {
        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, number_string);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, listS($$thereExistAtLeast, numeral_parser.string_to_interval(number_string), $list43));
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$Number_SP);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PENN_TAGS, $list47);
        return list(lex_entry);
    }

    public static final SubLObject cyclifier_lexicon_create_lex_entries_nl_trie_word_method_alt(SubLObject self, SubLObject string, SubLObject nl_trie_entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lex_entries = NIL;
                SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED);
                if (NIL != lexicon_vars.semtrans_predP(pred)) {
                    {
                        SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
                        SubLObject semtrans = NIL;
                        for (semtrans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , semtrans = cdolist_list_var.first()) {
                            {
                                SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED);
                                SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
                                SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
                                SubLObject inflections = (NIL != wu) ? ((SubLObject) (intersection(lexicon_accessors.preds_of_stringXword(string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_utilities.preds_of_pos(pos, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : $list_alt52;
                                SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, (NIL != lexicon_accessors.genl_posP(pos, $$Verb, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.cyclifier_lexicon.davidsonian_p(semtrans)) ? ((SubLObject) (list($$thereExists, $ACTION, listS($$and, semtrans, $list_alt57)))) : semtrans);
                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, frame);
                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, wu);
                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
                                lex_entries = cons(lex_entry, lex_entries);
                            }
                        }
                    }
                } else {
                    if ((NIL != subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED), $list_alt61, UNPROVIDED, UNPROVIDED)) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), $$Noun, UNPROVIDED))) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                {
                                    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_entry);
                                    SubLObject denot = NIL;
                                    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                        if (NIL == fort_types_interface.isa_predicateP(denot, UNPROVIDED)) {
                                            {
                                                SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
                                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
                                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != fort_types_interface.isa_collectionP(denot, UNPROVIDED) ? ((SubLObject) ($$isa)) : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
                                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
                                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED));
                                                methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                                                lex_entries = cons(lex_entry, lex_entries);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return lex_entries;
            }
        }
    }

    public static SubLObject cyclifier_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lex_entries = NIL;
        final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED);
        if (NIL != lexicon_vars.semtrans_predP(pred)) {
            SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
            SubLObject semtrans = NIL;
            semtrans = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED);
                final SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
                final SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
                final SubLObject inflections = (NIL != wu) ? intersection(lexicon_accessors.preds_of_stringXword(string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_utilities.preds_of_pos(pos, UNPROVIDED), UNPROVIDED, UNPROVIDED) : $list52;
                final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, (NIL != lexicon_accessors.genl_posP(pos, $$Verb, UNPROVIDED)) && (NIL != davidsonian_p(semtrans)) ? list($$thereExists, $ACTION, listS($$and, semtrans, $list57)) : semtrans);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, frame);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, wu);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
                lex_entries = cons(lex_entry, lex_entries);
                cdolist_list_var = cdolist_list_var.rest();
                semtrans = cdolist_list_var.first();
            } 
        } else
            if ((NIL != subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED), $list61, UNPROVIDED, UNPROVIDED)) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), $$Noun, UNPROVIDED))) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots(nl_trie_entry);
                    SubLObject denot = NIL;
                    denot = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL == fort_types_interface.isa_predicateP(denot, UNPROVIDED)) {
                            final SubLObject lex_entry2 = object.new_class_instance(LEX_ENTRY);
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $SEMTRANS, list(NIL != fort_types_interface.isa_collectionP(denot, UNPROVIDED) ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $FRAME, $$RegularNounFrame);
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $STRING, string);
                            lex_entries = cons(lex_entry2, lex_entries);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        denot = cdolist_list_var2.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }

        return lex_entries;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("CyclifierLexiconSpecification")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NUMBER"), list(makeSymbol("STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"))));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"), reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"), reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"), reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"), reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") });

    /**
     *
     *
     * @param STRING
     * 		string; an English word
     * @param KEYWORDS
     * 		list; a list of keywords to be incorporated into the fabricated semtrans
     * @return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; an English word\r\n@param KEYWORDS\r\n\t\tlist; a list of keywords to be incorporated into the fabricated semtrans\r\n@return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS")
    public static final SubLObject cyclifier_lexicon_fabricate_verbal_semtrans_method_alt(SubLObject self, SubLObject string, SubLObject keywords) {
        {
            SubLObject semtranses = NIL;
            SubLObject cdolist_list_var = semtrans_lexicon.semtrans_lexicon_fabricate_verbal_semtrans_method(self, string, keywords);
            SubLObject semtrans = NIL;
            for (semtrans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , semtrans = cdolist_list_var.first()) {
                semtranses = cons(list($$thereExists, $ACTION, listS($$and, semtrans, $list_alt57)), semtranses);
            }
            return semtranses;
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; an English word
     * @param KEYWORDS
     * 		list; a list of keywords to be incorporated into the fabricated semtrans
     * @return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; an English word\r\n@param KEYWORDS\r\n\t\tlist; a list of keywords to be incorporated into the fabricated semtrans\r\n@return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS")
    public static SubLObject cyclifier_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
        SubLObject semtranses = NIL;
        SubLObject cdolist_list_var = semtrans_lexicon.semtrans_lexicon_fabricate_verbal_semtrans_method(self, string, keywords);
        SubLObject semtrans = NIL;
        semtrans = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semtranses = cons(list($$thereExists, $ACTION, listS($$and, semtrans, $list57)), semtranses);
            cdolist_list_var = cdolist_list_var.rest();
            semtrans = cdolist_list_var.first();
        } 
        return semtranses;
    }

    /**
     *
     *
     * @return booleanp; t if CYCL is a Davidsonian style semtrans template, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if CYCL is a Davidsonian style semtrans template, nil otherwise")
    public static final SubLObject davidsonian_p_alt(SubLObject cycl) {
        {
            SubLObject stack = stacks.create_stack();
            SubLObject literal = NIL;
            stacks.stack_push(cycl, stack);
            while (NIL == stacks.stack_empty_p(stack)) {
                {
                    SubLObject entry = stacks.stack_pop(stack);
                    if (NIL != literalP(entry)) {
                        literal = entry;
                        if (cycl_utilities.formula_arg1(literal, UNPROVIDED).eql($ACTION)) {
                            return T;
                        }
                    }
                    {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            stacks.stack_push(arg, stack);
                        }
                    }
                }
            } 
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; t if CYCL is a Davidsonian style semtrans template, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if CYCL is a Davidsonian style semtrans template, nil otherwise")
    public static SubLObject davidsonian_p(final SubLObject cycl) {
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = NIL;
        stacks.stack_push(cycl, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                literal = entry;
                if (cycl_utilities.formula_arg1(literal, UNPROVIDED).eql($ACTION)) {
                    return T;
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } 
        return NIL;
    }

    static private final SubLList $list_alt35 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt36 = list(makeSymbol("NUMBER-STRING"));

    /**
     *
     *
     * @param CYCL
    el-formula-p
     * 		
     * @return el-formula-p; a Davidsonian version of CYCL
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p\r\n\t\t\r\n@return el-formula-p; a Davidsonian version of CYCL")
    public static final SubLObject ensure_davidsonian_alt(SubLObject cycl) {
        return NIL != com.cyc.cycjava.cycl.cyclifier_lexicon.davidsonian_p(cycl) ? ((SubLObject) (cycl)) : com.cyc.cycjava.cycl.cyclifier_lexicon.make_davidsonian(cycl);
    }

    /**
     *
     *
     * @param CYCL
    el-formula-p
     * 		
     * @return el-formula-p; a Davidsonian version of CYCL
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p\r\n\t\t\r\n@return el-formula-p; a Davidsonian version of CYCL")
    public static SubLObject ensure_davidsonian(final SubLObject cycl) {
        return NIL != davidsonian_p(cycl) ? cycl : make_davidsonian(cycl);
    }

    static private final SubLList $list_alt37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("NUMBER-STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("thereExistAtLeast"), list(makeSymbol("STRING-TO-INTERVAL"), makeSymbol("NUMBER-STRING")), list(QUOTE, list($NOUN, list(reader_make_constant_shell("and"), makeKeyword("RESTR"), makeKeyword("SCOPE")))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("Number-SP")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(QUOTE, list(makeKeyword("CD")))), list(RET, list(makeSymbol("LIST"), makeSymbol("LEX-ENTRY")))));

    /**
     *
     *
     * @param CYCL
    el-formula-p
     * 		
     * @return el-formula-p; a Davidsonian version of CYCL
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p\r\n\t\t\r\n@return el-formula-p; a Davidsonian version of CYCL")
    public static final SubLObject make_davidsonian_alt(SubLObject cycl) {
        return list($$isa, $ACTION, list($$StateFn, cycl));
    }

    /**
     *
     *
     * @param CYCL
    el-formula-p
     * 		
     * @return el-formula-p; a Davidsonian version of CYCL
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p\r\n\t\t\r\n@return el-formula-p; a Davidsonian version of CYCL")
    public static SubLObject make_davidsonian(final SubLObject cycl) {
        return list($$isa, $ACTION, list($$StateFn, cycl));
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class_alt(SubLObject new_instance) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list_alt7);
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
            classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
            return NIL;
        }
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list7);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
        return NIL;
    }

    static private final SubLList $list_alt43 = list($NOUN, list(reader_make_constant_shell("and"), makeKeyword("RESTR"), makeKeyword("SCOPE")));

    static private final SubLList $list_alt47 = list(makeKeyword("CD"));

    static private final SubLList $list_alt50 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("PRED"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY")))), list(makeSymbol("PCOND"), list(list(makeSymbol("SEMTRANS-PRED?"), makeSymbol("PRED")), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), makeSymbol("NL-TRIE-ENTRY")))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("WU"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FRAME"), list(makeSymbol("NL-TRIE-WORD-FRAME"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("FIF"), makeSymbol("WU"), list(makeSymbol("INTERSECTION"), list(makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("STRING"), makeSymbol("WU")), list(makeSymbol("PREDS-OF-POS"), makeSymbol("POS"))), list(QUOTE, list(reader_make_constant_shell("singular"))))), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("GENL-POS?"), makeSymbol("POS"), reader_make_constant_shell("Verb")), list(makeSymbol("DAVIDSONIAN-P"), makeSymbol("SEMTRANS"))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("thereExists"), makeKeyword("ACTION"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("and"), makeSymbol("SEMTRANS"), list(QUOTE, list(makeKeyword("SCOPE"))))), makeSymbol("SEMTRANS"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), makeSymbol("FRAME")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), makeSymbol("WU")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))), list(list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY")), list(QUOTE, list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString")))), list(makeSymbol("GENL-POS?"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY")), reader_make_constant_shell("Noun"))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("PUNLESS"), list(makeSymbol("ISA-PREDICATE?"), makeSymbol("DENOT")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), list(makeSymbol("FIF"), list(makeSymbol("ISA-COLLECTION?"), makeSymbol("DENOT")), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")), $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })))))), list(RET, makeSymbol("LEX-ENTRIES"))));

    public static final SubLObject cyclifier_lexicon_wXo_fabrication_p_alt(SubLObject cyclifier_lexicon_wXo_fabrication) {
        return classes.subloop_instanceof_class(cyclifier_lexicon_wXo_fabrication, $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
    }

    public static SubLObject cyclifier_lexicon_wXo_fabrication_p(final SubLObject cyclifier_lexicon_wXo_fabrication) {
        return classes.subloop_instanceof_class(cyclifier_lexicon_wXo_fabrication, $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
    }

    public static final SubLObject cyclifier_lexicon_wXo_fabrication_fabricate_method_alt(SubLObject self, SubLObject string, SubLObject keywords, SubLObject penn) {
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(keywords, LISTP);
        SubLTrampolineFile.checkType(penn, KEYWORDP);
        return NIL;
    }

    public static SubLObject cyclifier_lexicon_wXo_fabrication_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        assert NIL != listp(keywords) : "! listp(keywords) " + ("Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) ") + keywords;
        assert NIL != keywordp(penn) : "! keywordp(penn) " + ("Types.keywordp(penn) " + "CommonSymbols.NIL != Types.keywordp(penn) ") + penn;
        return NIL;
    }

    public static final SubLObject new_cyclifier_lexicon_wXo_fabrication_alt() {
        return object.new_class_instance($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
    }

    public static SubLObject new_cyclifier_lexicon_wXo_fabrication() {
        return object.new_class_instance($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
    }

    public static SubLObject declare_cyclifier_lexicon_file() {
        declareFunction("new_cyclifier_lexicon", "NEW-CYCLIFIER-LEXICON", 0, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-INSTANCE", 1, 0, false);
        declareFunction("cyclifier_lexicon_p", "CYCLIFIER-LEXICON-P", 1, 0, false);
        declareFunction("cyclifier_lexicon_create_lex_entries_number_method", "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
        declareFunction("cyclifier_lexicon_create_lex_entries_nl_trie_word_method", "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
        declareFunction("cyclifier_lexicon_fabricate_verbal_semtrans_method", "CYCLIFIER-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
        declareFunction("davidsonian_p", "DAVIDSONIAN-P", 1, 0, false);
        declareFunction("ensure_davidsonian", "ENSURE-DAVIDSONIAN", 1, 0, false);
        declareFunction("make_davidsonian", "MAKE-DAVIDSONIAN", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-INSTANCE", 1, 0, false);
        declareFunction("cyclifier_lexicon_wXo_fabrication_p", "CYCLIFIER-LEXICON-W/O-FABRICATION-P", 1, 0, false);
        declareFunction("cyclifier_lexicon_wXo_fabrication_fabricate_method", "CYCLIFIER-LEXICON-W/O-FABRICATION-FABRICATE-METHOD", 4, 0, false);
        declareFunction("new_cyclifier_lexicon_wXo_fabrication", "NEW-CYCLIFIER-LEXICON-W/O-FABRICATION", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cyclifier_lexicon_file() {
        return NIL;
    }

    public static SubLObject setup_cyclifier_lexicon_file() {
        classes.subloop_new_class(CYCLIFIER_LEXICON, SEMTRANS_LEXICON, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(CYCLIFIER_LEXICON, NIL);
        classes.subloop_note_class_initialization_function(CYCLIFIER_LEXICON, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function(CYCLIFIER_LEXICON, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE);
        subloop_reserved_initialize_cyclifier_lexicon_class(CYCLIFIER_LEXICON);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NUMBER, CYCLIFIER_LEXICON, $list35, $list36, $list37);
        methods.subloop_register_instance_method(CYCLIFIER_LEXICON, CREATE_LEX_ENTRIES_NUMBER, CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_WORD, CYCLIFIER_LEXICON, $list35, $list50, $list51);
        methods.subloop_register_instance_method(CYCLIFIER_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_WORD, CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_VERBAL_SEMTRANS, CYCLIFIER_LEXICON, $list35, $list71, $list72);
        methods.subloop_register_instance_method(CYCLIFIER_LEXICON, FABRICATE_VERBAL_SEMTRANS, CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
        classes.subloop_new_class($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, CYCLIFIER_LEXICON, NIL, NIL, $list76);
        classes.class_set_implements_slot_listeners($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, NIL);
        classes.subloop_note_class_initialization_function($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA);
        classes.subloop_note_instance_initialization_function($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS);
        subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
        methods.methods_incorporate_instance_method(FABRICATE, $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $list80, $list81, $list82);
        methods.subloop_register_instance_method($sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, FABRICATE, $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt52 = list(reader_make_constant_shell("singular"));

    static private final SubLList $list_alt57 = list(makeKeyword("SCOPE"));

    static private final SubLList $list_alt61 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString"));

    @Override
    public void declareFunctions() {
        declare_cyclifier_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_cyclifier_lexicon_file();
    }

    static private final SubLList $list_alt71 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"));

    @Override
    public void runTopLevelForms() {
        setup_cyclifier_lexicon_file();
    }

    static private final SubLList $list_alt72 = list(makeString("@param STRING string; an English word\n   @param KEYWORDS list; a list of keywords to be incorporated into the fabricated semtrans\n   @return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS"), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FABRICATE-VERBAL-SEMTRANS"), makeSymbol("SUPER"), makeSymbol("STRING"), makeSymbol("KEYWORDS"))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("thereExists"), makeKeyword("ACTION"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("and"), makeSymbol("SEMTRANS"), list(QUOTE, list(makeKeyword("SCOPE"))))), makeSymbol("SEMTRANSES"))), list(RET, makeSymbol("SEMTRANSES"))));

    static {
    }

    static private final SubLList $list_alt76 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt80 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt81 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PENN"), makeSymbol("KEYWORDP")), list(RET, NIL));
}

/**
 * Total time: 310 ms
 */
