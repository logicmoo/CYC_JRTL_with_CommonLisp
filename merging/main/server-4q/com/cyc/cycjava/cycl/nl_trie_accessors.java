/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.file_vector_utilities.$current_backed_map_cache_strategy$;
import static com.cyc.cycjava.cycl.file_vector_utilities.swap_out_all_pristine_backed_map_objects;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$resourced_sbhl_marking_space_limit$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$resourced_sbhl_marking_spaces$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.determine_resource_limit;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.possibly_new_marking_resource;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-TRIE-ACCESSORS
 * source file: /cyc/top/cycl/nl-trie-accessors.lisp
 * created:     2019/07/03 17:38:16
 */
public final class nl_trie_accessors extends SubLTranslatedFile implements V12 {
    public static final class $nl_trie_index_item_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.this.$term;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.this.$phrase;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.this.$mt;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.this.$term = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.this.$phrase = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.this.$mt = value;
        }

        public SubLObject $term = Lisp.NIL;

        public SubLObject $phrase = Lisp.NIL;

        public SubLObject $mt = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.class, NL_TRIE_INDEX_ITEM, NL_TRIE_INDEX_ITEM_P, $list_alt122, $list_alt123, new String[]{ "$term", "$phrase", "$mt" }, $list_alt124, $list_alt125, PRINT_NL_TRIE_INDEX_ITEM);
    }

    public static final SubLFile me = new nl_trie_accessors();

 public static final String myName = "com.cyc.cycjava.cycl.nl_trie_accessors";


    // deflexical
    /**
     * punctuation characters that appear only between words--does not include
     * characters that can appear internally to words
     */
    @LispMethod(comment = "punctuation characters that appear only between words--does not include\r\ncharacters that can appear internally to words\ndeflexical\npunctuation characters that appear only between words--does not include\ncharacters that can appear internally to words")
    public static final SubLSymbol $word_external_punctuation_chars$ = makeSymbol("*WORD-EXTERNAL-PUNCTUATION-CHARS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $denotation_mapping_break_chars$ = makeSymbol("*DENOTATION-MAPPING-BREAK-CHARS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_trie_check_semantic_mtP$ = makeSymbol("*NL-TRIE-CHECK-SEMANTIC-MT?*");

    // deflexical
    // Characters that will be used for tokenizing the phrase during rotations
    /**
     * Characters that will be used for tokenizing the phrase during rotations
     */
    @LispMethod(comment = "Characters that will be used for tokenizing the phrase during rotations\ndeflexical")
    private static final SubLSymbol $nl_trie_rotate_characters$ = makeSymbol("*NL-TRIE-ROTATE-CHARACTERS*");

    // defconstant
    // Character (e.g., ^G) that will be inserted at the rotation point
    /**
     * Character (e.g., ^G) that will be inserted at the rotation point
     */
    @LispMethod(comment = "Character (e.g., ^G) that will be inserted at the rotation point\ndefconstant")
    private static final SubLSymbol $nl_trie_rotate_point_char$ = makeSymbol("*NL-TRIE-ROTATE-POINT-CHAR*");

    // defconstant
    // String representation of @xref *nl-trie-rotate-point-char*
    /**
     * String representation of @xref *nl-trie-rotate-point-char*
     */
    @LispMethod(comment = "String representation of @xref *nl-trie-rotate-point-char*\ndefconstant")
    private static final SubLSymbol $nl_trie_rotate_point_string$ = makeSymbol("*NL-TRIE-ROTATE-POINT-STRING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_nl_trie_index_item$ = makeSymbol("*DTP-NL-TRIE-INDEX-ITEM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_number_of_concurrent_test_threads$ = makeSymbol("*DEFAULT-NUMBER-OF-CONCURRENT-TEST-THREADS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_string_test_count$ = makeSymbol("*DEFAULT-STRING-TEST-COUNT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("ENTRY"), makeSymbol("&KEY"), makeSymbol("STRING"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("STRING"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym5$KEY = makeUninternedSymbol("KEY");

    static private final SubLSymbol $sym6$ENTRIES = makeUninternedSymbol("ENTRIES");

    private static final SubLSymbol DO_NL_TRIE = makeSymbol("DO-NL-TRIE");

    private static final SubLSymbol NL_TRIE_ENTRY_STRING = makeSymbol("NL-TRIE-ENTRY-STRING");

    static private final SubLList $list11 = list(list(new SubLObject[]{ makeSymbol("ENTRY-VAR"), makeSymbol("STRING"), makeSymbol("LOOKUP-MT"), makeSymbol("&KEY"), list(makeSymbol("ENTRY-TYPE"), makeKeyword("ANY")), list(makeSymbol("CHECK-PERIOD?"), T), list(makeSymbol("MISSPELLINGS?"), list(QUOTE, makeSymbol("*MISSPELLINGS?*"))), list(makeSymbol("CASE-SENSITIVITY"), list(QUOTE, makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"))), list(makeSymbol("CHECK-SEMANTIC-MT?"), NIL) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list12 = list(makeKeyword("ENTRY-TYPE"), makeKeyword("CHECK-PERIOD?"), makeKeyword("MISSPELLINGS?"), makeKeyword("CASE-SENSITIVITY"), makeKeyword("CHECK-SEMANTIC-MT?"));

    private static final SubLSymbol $kw15$CHECK_PERIOD_ = makeKeyword("CHECK-PERIOD?");

    public static final SubLSymbol $misspellingsP$ = makeSymbol("*MISSPELLINGS?*");

    public static final SubLSymbol $nl_trie_accessor_default_case_sensitivity$ = makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*");

    private static final SubLSymbol $kw20$CHECK_SEMANTIC_MT_ = makeKeyword("CHECK-SEMANTIC-MT?");

    static private final SubLSymbol $sym21$ENTRIES = makeUninternedSymbol("ENTRIES");

    public static final SubLSymbol $lexicon_lookup_mt$ = makeSymbol("*LEXICON-LOOKUP-MT*");

    private static final SubLSymbol GATED_NL_TRIE_SEARCH = makeSymbol("GATED-NL-TRIE-SEARCH");

    private static final SubLSymbol NL_TRIE_ENTRY_TYPE = makeSymbol("NL-TRIE-ENTRY-TYPE");

    static private final SubLSymbol $sym31$PERIOD_CONST_SATISFIED_ = makeSymbol("PERIOD-CONST-SATISFIED?");

    static private final SubLSymbol $sym32$CONTAINS_PERIOD_ = makeSymbol("CONTAINS-PERIOD?");

    static private final SubLSymbol $sym33$SPELLING_CONST_SATISFIED_ = makeSymbol("SPELLING-CONST-SATISFIED?");

    static private final SubLList $list34 = list(list(makeSymbol("ENTRY-VAR"), makeSymbol("STRING"), makeSymbol("LOOKUP-MT"), makeSymbol("&KEY"), list(makeSymbol("CHECK-PERIOD?"), T), list(makeSymbol("MISSPELLINGS?"), list(QUOTE, makeSymbol("*MISSPELLINGS?*"))), list(makeSymbol("CASE-SENSITIVITY"), list(QUOTE, makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"))), list(makeSymbol("CHECK-SEMANTIC-MT?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list35 = list(makeKeyword("CHECK-PERIOD?"), makeKeyword("MISSPELLINGS?"), makeKeyword("CASE-SENSITIVITY"), makeKeyword("CHECK-SEMANTIC-MT?"));

    private static final SubLSymbol DO_NL_TRIE_ENTRIES_FOR_STRING = makeSymbol("DO-NL-TRIE-ENTRIES-FOR-STRING");

    static private final SubLList $list38 = list(list(makeSymbol("ENTRY-VAR"), makeSymbol("STRING"), makeSymbol("LOOKUP-MT"), makeSymbol("&KEY"), list(makeSymbol("CHECK-PERIOD?"), NIL), list(makeSymbol("MISSPELLINGS?"), list(QUOTE, makeSymbol("*MISSPELLINGS?*"))), list(makeSymbol("CASE-SENSITIVITY"), list(QUOTE, makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list39 = list(makeKeyword("CHECK-PERIOD?"), makeKeyword("MISSPELLINGS?"), makeKeyword("CASE-SENSITIVITY"));

    static private final SubLList $list41 = list(makeSymbol("NEW-ENTRY"), makeSymbol("DENOT-LIST"), makeSymbol("PRED-LIST"), makeSymbol("&KEY"), list(makeSymbol("SKIP-CONSTRAINTS?"), NIL), list(makeSymbol("ABBREV-TYPES"), NIL), list(makeSymbol("DENOT-TYPE"), makeKeyword("DENOT")), list(makeSymbol("SKIP-NAMESTRINGS?"), NIL));

    static private final SubLList $list42 = list(makeKeyword("SKIP-CONSTRAINTS?"), makeKeyword("ABBREV-TYPES"), makeKeyword("DENOT-TYPE"), makeKeyword("SKIP-NAMESTRINGS?"));

    private static final SubLSymbol $kw43$SKIP_CONSTRAINTS_ = makeKeyword("SKIP-CONSTRAINTS?");

    private static final SubLSymbol $kw47$SKIP_NAMESTRINGS_ = makeKeyword("SKIP-NAMESTRINGS?");

    private static final SubLSymbol ADD_NEW_ENTRY = makeSymbol("ADD-NEW-ENTRY");

    static private final SubLList $list50 = list(makeSymbol("NEW-DENOTS"), makeSymbol("DENOT-LIST"), makeSymbol("NEW-PREDS"), makeSymbol("PRED-LIST"));

    private static final SubLSymbol ADD_NEW_DENOTS_AND_PREDS = makeSymbol("ADD-NEW-DENOTS-AND-PREDS");

    static private final SubLSymbol $sym52$NL_TRIE_STRING_IS_POS_ = makeSymbol("NL-TRIE-STRING-IS-POS?");



    private static final SubLList $list55 = list(new SubLObject[]{ CHAR_comma, CHAR_period, CHAR_question, CHAR_exclamation, CHAR_ampersand, CHAR_exclamation, CHAR_quotation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_slash });

    private static final SubLList $list57 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

    private static final SubLSymbol $sym58$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLString $$$the_ = makeString("the ");









    private static final SubLSymbol $sym66$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    private static final SubLSymbol $sym67$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");



    private static final SubLList $list75 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("denotationRelatedTo"), reader_make_constant_shell("denotationPlaceholder"));

    private static final SubLSymbol $sym79$_ = makeSymbol(">");

    private static final SubLSymbol INTERVAL_TOKEN_LENGTH = makeSymbol("INTERVAL-TOKEN-LENGTH");

    private static final SubLSymbol $sym81$_ = makeSymbol("<");

    private static final SubLSymbol INTERVAL_TOKEN_START = makeSymbol("INTERVAL-TOKEN-START");

    private static final SubLList $list83 = cons(makeSymbol("INDEX"), makeSymbol("NUM-TOKENS"));

    private static final SubLSymbol NL_TRIE_P = makeSymbol("NL-TRIE-P");

    private static final SubLList $list85 = list(makeKeyword("ON"), makeKeyword("PREFERRED"));

    private static final SubLString $str86$Invalid_case_sensitivity_value_fo = makeString("Invalid case-sensitivity value for NL-TRIE-PREFIXES: ~S");

    private static final SubLSymbol NL_TRIE_PREFIXES_MEMOIZED = makeSymbol("NL-TRIE-PREFIXES-MEMOIZED");



    private static final SubLSymbol INDEX_COVERED_BY_TOKEN_P = makeSymbol("INDEX-COVERED-BY-TOKEN-P");



    private static final SubLList $list92 = list(reader_make_constant_shell("EverythingPSC"), reader_make_constant_shell("InferencePSC"));

    private static final SubLSymbol $sym95$NL_TRIE_INAPPROPRIATE_ENTRY_ = makeSymbol("NL-TRIE-INAPPROPRIATE-ENTRY?");

    private static final SubLSymbol $sym96$PRAGMATICALLY_ACCEPTABLE_ = makeSymbol("PRAGMATICALLY-ACCEPTABLE?");

    private static final SubLList $list98 = list(makeSymbol("KEY"), makeSymbol("SUBNODE"));

    private static final SubLString $str99$Found_non_matching_string___S_vs_ = makeString("Found non-matching string: ~S vs. ~S");

    private static final SubLList $list100 = list(list(makeSymbol("WORD"), makeSymbol("SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list101 = list($DONE);

    private static final SubLSymbol $sym102$ASENT = makeUninternedSymbol("ASENT");

    private static final SubLSymbol $sym103$MT = makeUninternedSymbol("MT");

    private static final SubLSymbol DO_NL_TRIE_WORD_ENTRIES_FOR_STRING = makeSymbol("DO-NL-TRIE-WORD-ENTRIES-FOR-STRING");

    private static final SubLSymbol ATOMIC_SENTENCE_ARG2 = makeSymbol("ATOMIC-SENTENCE-ARG2");

    private static final SubLSymbol $sym109$MATCHING_WORD_STRINGS_ENTRY_ = makeSymbol("MATCHING-WORD-STRINGS-ENTRY?");

    private static final SubLSymbol DO_SUPPORTING_TRIE_WORDS = makeSymbol("DO-SUPPORTING-TRIE-WORDS");

    private static final SubLList $list111 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    static private final SubLList $list112 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLSymbol $sym113$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLList $list114 = list(reader_make_constant_shell("CharacterString"), reader_make_constant_shell("SententialConstituent"));







    private static final SubLObject $$phrase_Bar1 = reader_make_constant_shell("phrase-Bar1");

    private static final SubLString $str119$Don_t_know_how_to_check__S_agains = makeString("Don't know how to check ~S against ~S");

    private static final SubLSymbol $nl_trie_rotation_index$ = makeSymbol("*NL-TRIE-ROTATION-INDEX*");

    private static final SubLList $list121 = list(CHAR_space, CHAR_hyphen);

    private static final SubLSymbol $nl_trie_stoplist_trie$ = makeSymbol("*NL-TRIE-STOPLIST-TRIE*");

    private static final SubLString $str123$tried_to_determine_rotations_for_ = makeString("tried to determine rotations for a non-string: ~S~%");

    private static final SubLSymbol NL_TRIE_INDEX_ITEM = makeSymbol("NL-TRIE-INDEX-ITEM");

    private static final SubLSymbol NL_TRIE_INDEX_ITEM_P = makeSymbol("NL-TRIE-INDEX-ITEM-P");

    private static final SubLList $list126 = list(makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT"));

    private static final SubLList $list127 = list($TERM, makeKeyword("PHRASE"), makeKeyword("MT"));

    private static final SubLList $list128 = list(makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("NL-TRIE-INDEX-ITEM-PHRASE"), makeSymbol("NL-TRIE-INDEX-ITEM-MT"));

    private static final SubLList $list129 = list(makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-PHRASE"), makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-MT"));

    private static final SubLSymbol PRINT_NL_TRIE_INDEX_ITEM = makeSymbol("PRINT-NL-TRIE-INDEX-ITEM");

    private static final SubLSymbol NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NL-TRIE-INDEX-ITEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list132 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NL-TRIE-INDEX-ITEM-P"));

    private static final SubLSymbol NL_TRIE_INDEX_ITEM_TERM = makeSymbol("NL-TRIE-INDEX-ITEM-TERM");

    private static final SubLSymbol _CSETF_NL_TRIE_INDEX_ITEM_TERM = makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-TERM");

    private static final SubLSymbol NL_TRIE_INDEX_ITEM_PHRASE = makeSymbol("NL-TRIE-INDEX-ITEM-PHRASE");

    private static final SubLSymbol _CSETF_NL_TRIE_INDEX_ITEM_PHRASE = makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-PHRASE");

    private static final SubLSymbol NL_TRIE_INDEX_ITEM_MT = makeSymbol("NL-TRIE-INDEX-ITEM-MT");

    private static final SubLSymbol _CSETF_NL_TRIE_INDEX_ITEM_MT = makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-MT");

    private static final SubLString $str142$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_NL_TRIE_INDEX_ITEM = makeSymbol("MAKE-NL-TRIE-INDEX-ITEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NL-TRIE-INDEX-ITEM-METHOD");

    private static final SubLString $str148$_NL_TRIE_INDEX_ITEM__s__s__a_ = makeString("<NL-TRIE-INDEX-ITEM:~s:~s:~a>");

    private static final SubLString $$$nl_trie_rotation_stop_list = makeString("nl trie rotation stop list");

    private static final SubLString $$$nl_trie_rotation_index = makeString("nl trie rotation index");

    private static final SubLString $str152$Creating_NL_trie_rotation_index__ = makeString("Creating NL trie rotation index...");

    private static final SubLList $list153 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    private static final SubLList $list154 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    private static final SubLSymbol TRIE_REMOVE = makeSymbol("TRIE-REMOVE");

    private static final SubLSymbol TRIE_INSERT = makeSymbol("TRIE-INSERT");

    private static final SubLSymbol STARTS_WITH = makeSymbol("STARTS-WITH");

    private static final SubLSymbol $sym162$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol LESSER_LENGTH_P = makeSymbol("LESSER-LENGTH-P");

    private static final SubLString $str164$The_NL_Trie_must_be_initialized_b = makeString("The NL Trie must be initialized before it can be dumped.");

    private static final SubLString $str165$Dumping_NL_Trie_spellchecker_stri = makeString("Dumping NL Trie spellchecker strings...");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str167$Concurrent_NL_Trie_Search_Stress_ = makeString("Concurrent NL-Trie Search Stress Test Problems");



    private static final SubLString $$$Concurrent_NL_Trie_Searches_ = makeString("Concurrent NL Trie Searches ");

    private static final SubLSymbol STRESS_TEST_NL_TRIE_SEARCH = makeSymbol("STRESS-TEST-NL-TRIE-SEARCH");

    private static final SubLSymbol VALID_PROCESS_P = makeSymbol("VALID-PROCESS-P");

    private static final SubLString $str174$Concurrent_NL_Trie_Prefixes_Stres = makeString("Concurrent NL-Trie Prefixes Stress Test Problems");

    private static final SubLString $$$Concurrent_NL_Trie_Prefixes_ = makeString("Concurrent NL Trie Prefixes ");

    private static final SubLSymbol STRESS_TEST_NL_TRIE_PREFIXES = makeSymbol("STRESS-TEST-NL-TRIE-PREFIXES");

    // Definitions
    /**
     * Execute BODY with ENTRY successively bound to each trie entry in *NL-TRIE*,
     * binding STRING, when present, to the string for ENTRY,
     * and halting when DONE is non-NIL.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with ENTRY successively bound to each trie entry in *NL-TRIE*,\r\nbinding STRING, when present, to the string for ENTRY,\r\nand halting when DONE is non-NIL.\r\n\r\n@unknown baxter\nExecute BODY with ENTRY successively bound to each trie entry in *NL-TRIE*,\nbinding STRING, when present, to the string for ENTRY,\nand halting when DONE is non-NIL.")
    public static final SubLObject do_nl_trie_entries_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject entry = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    entry = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject string_tail = property_list_member($STRING, current);
                            SubLObject string = (NIL != string_tail) ? ((SubLObject) (cadr(string_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject key = $sym5$KEY;
                                SubLObject entries = $sym6$ENTRIES;
                                if (NIL != string) {
                                    return list(DO_NL_TRIE, list(key, entries, $DONE, done), listS(CSOME, list(entry, entries, done), list(CSETQ, string, list(NL_TRIE_ENTRY_STRING, entry)), append(body, NIL)));
                                } else {
                                    return list(DO_NL_TRIE, list(key, entries, $DONE, done), listS(CSOME, list(entry, entries, done), append(body, NIL)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    /**
     * Execute BODY with ENTRY successively bound to each trie entry in *NL-TRIE*,
     * binding STRING, when present, to the string for ENTRY,
     * and halting when DONE is non-NIL.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with ENTRY successively bound to each trie entry in *NL-TRIE*,\r\nbinding STRING, when present, to the string for ENTRY,\r\nand halting when DONE is non-NIL.\r\n\r\n@unknown baxter\nExecute BODY with ENTRY successively bound to each trie entry in *NL-TRIE*,\nbinding STRING, when present, to the string for ENTRY,\nand halting when DONE is non-NIL.")
    public static SubLObject do_nl_trie_entries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list0);
        entry = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list0);
            if (NIL == member(current_$1, nl_trie_accessors.$list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == nl_trie_accessors.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list0);
        }
        final SubLObject string_tail = property_list_member($STRING, current);
        final SubLObject string = (NIL != string_tail) ? cadr(string_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key = nl_trie_accessors.$sym5$KEY;
        final SubLObject entries = nl_trie_accessors.$sym6$ENTRIES;
        if (NIL != string) {
            return list(nl_trie_accessors.DO_NL_TRIE, list(key, entries, $DONE, done), listS(CSOME, list(entry, entries, done), list(CSETQ, string, list(nl_trie_accessors.NL_TRIE_ENTRY_STRING, entry)), append(body, NIL)));
        }
        return list(nl_trie_accessors.DO_NL_TRIE, list(key, entries, $DONE, done), listS(CSOME, list(entry, entries, done), append(body, NIL)));
    }

    public static final SubLObject do_nl_trie_entries_for_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject entry_var = NIL;
                    SubLObject string = NIL;
                    SubLObject lookup_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    entry_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    lookup_mt = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt11);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt11);
                            if (NIL == member(current_2, $list_alt12, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt11);
                        }
                        {
                            SubLObject entry_type_tail = property_list_member($ENTRY_TYPE, current);
                            SubLObject entry_type = (NIL != entry_type_tail) ? ((SubLObject) (cadr(entry_type_tail))) : $ANY;
                            SubLObject check_periodP_tail = property_list_member($kw15$CHECK_PERIOD_, current);
                            SubLObject check_periodP = (NIL != check_periodP_tail) ? ((SubLObject) (cadr(check_periodP_tail))) : T;
                            SubLObject misspellingsP_tail = property_list_member($MISSPELLINGS_, current);
                            SubLObject misspellingsP = (NIL != misspellingsP_tail) ? ((SubLObject) (cadr(misspellingsP_tail))) : $misspellingsP$;
                            SubLObject case_sensitivity_tail = property_list_member($CASE_SENSITIVITY, current);
                            SubLObject case_sensitivity = (NIL != case_sensitivity_tail) ? ((SubLObject) (cadr(case_sensitivity_tail))) : $nl_trie_accessor_default_case_sensitivity$;
                            SubLObject check_semantic_mtP_tail = property_list_member($kw20$CHECK_SEMANTIC_MT_, current);
                            SubLObject check_semantic_mtP = (NIL != check_semantic_mtP_tail) ? ((SubLObject) (cadr(check_semantic_mtP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject entries = $sym21$ENTRIES;
                                return list(CLET, list(list($lexicon_lookup_mt$, lookup_mt), list(entries, list(GATED_NL_TRIE_SEARCH, string, case_sensitivity, check_semantic_mtP))), list(CDOLIST, list(entry_var, entries), listS(PWHEN, list(CAND, list(COR, list(EQ, $ANY, entry_type), list(EQ, list(NL_TRIE_ENTRY_TYPE, entry_var), entry_type)), list(FIMPLIES, check_periodP, list($sym31$PERIOD_CONST_SATISFIED_, list($sym32$CONTAINS_PERIOD_, string), entry_var, string)), list($sym33$SPELLING_CONST_SATISFIED_, misspellingsP, entry_var)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_nl_trie_entries_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry_var = NIL;
        SubLObject string = NIL;
        SubLObject lookup_mt = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list11);
        entry_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list11);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list11);
        lookup_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list11);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list11);
            if (NIL == member(current_$2, nl_trie_accessors.$list12, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == nl_trie_accessors.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list11);
        }
        final SubLObject entry_type_tail = property_list_member($ENTRY_TYPE, current);
        final SubLObject entry_type = (NIL != entry_type_tail) ? cadr(entry_type_tail) : $ANY;
        final SubLObject check_periodP_tail = property_list_member(nl_trie_accessors.$kw15$CHECK_PERIOD_, current);
        final SubLObject check_periodP = (NIL != check_periodP_tail) ? cadr(check_periodP_tail) : T;
        final SubLObject misspellingsP_tail = property_list_member($MISSPELLINGS_, current);
        final SubLObject misspellingsP = (NIL != misspellingsP_tail) ? cadr(misspellingsP_tail) : nl_trie_accessors.$misspellingsP$;
        final SubLObject case_sensitivity_tail = property_list_member($CASE_SENSITIVITY, current);
        final SubLObject case_sensitivity = (NIL != case_sensitivity_tail) ? cadr(case_sensitivity_tail) : nl_trie_accessors.$nl_trie_accessor_default_case_sensitivity$;
        final SubLObject check_semantic_mtP_tail = property_list_member(nl_trie_accessors.$kw20$CHECK_SEMANTIC_MT_, current);
        final SubLObject check_semantic_mtP = (NIL != check_semantic_mtP_tail) ? cadr(check_semantic_mtP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject entries = nl_trie_accessors.$sym21$ENTRIES;
        return list(CLET, list(list(nl_trie_accessors.$lexicon_lookup_mt$, lookup_mt), list(entries, list(nl_trie_accessors.GATED_NL_TRIE_SEARCH, string, case_sensitivity, check_semantic_mtP))), list(CDOLIST, list(entry_var, entries), listS(PWHEN, list(CAND, list(COR, list(EQ, $ANY, entry_type), list(EQ, list(nl_trie_accessors.NL_TRIE_ENTRY_TYPE, entry_var), entry_type)), list(FIMPLIES, check_periodP, list(nl_trie_accessors.$sym31$PERIOD_CONST_SATISFIED_, list(nl_trie_accessors.$sym32$CONTAINS_PERIOD_, string), entry_var, string)), list(nl_trie_accessors.$sym33$SPELLING_CONST_SATISFIED_, misspellingsP, entry_var)), append(body, NIL))));
    }

    public static final SubLObject do_nl_trie_word_entries_for_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject entry_var = NIL;
                    SubLObject string = NIL;
                    SubLObject lookup_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    entry_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    lookup_mt = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt34);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt34);
                            if (NIL == member(current_3, $list_alt35, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt34);
                        }
                        {
                            SubLObject check_periodP_tail = property_list_member($kw15$CHECK_PERIOD_, current);
                            SubLObject check_periodP = (NIL != check_periodP_tail) ? ((SubLObject) (cadr(check_periodP_tail))) : T;
                            SubLObject misspellingsP_tail = property_list_member($MISSPELLINGS_, current);
                            SubLObject misspellingsP = (NIL != misspellingsP_tail) ? ((SubLObject) (cadr(misspellingsP_tail))) : $misspellingsP$;
                            SubLObject case_sensitivity_tail = property_list_member($CASE_SENSITIVITY, current);
                            SubLObject case_sensitivity = (NIL != case_sensitivity_tail) ? ((SubLObject) (cadr(case_sensitivity_tail))) : $nl_trie_accessor_default_case_sensitivity$;
                            SubLObject check_semantic_mtP_tail = property_list_member($kw20$CHECK_SEMANTIC_MT_, current);
                            SubLObject check_semantic_mtP = (NIL != check_semantic_mtP_tail) ? ((SubLObject) (cadr(check_semantic_mtP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_NL_TRIE_ENTRIES_FOR_STRING, list(new SubLObject[]{ entry_var, string, lookup_mt, $ENTRY_TYPE, $WORD, $MISSPELLINGS_, misspellingsP, $kw15$CHECK_PERIOD_, check_periodP, $CASE_SENSITIVITY, case_sensitivity, $kw20$CHECK_SEMANTIC_MT_, check_semantic_mtP }), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_nl_trie_word_entries_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry_var = NIL;
        SubLObject string = NIL;
        SubLObject lookup_mt = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list34);
        entry_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list34);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list34);
        lookup_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list34);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list34);
            if (NIL == member(current_$3, nl_trie_accessors.$list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == nl_trie_accessors.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list34);
        }
        final SubLObject check_periodP_tail = property_list_member(nl_trie_accessors.$kw15$CHECK_PERIOD_, current);
        final SubLObject check_periodP = (NIL != check_periodP_tail) ? cadr(check_periodP_tail) : T;
        final SubLObject misspellingsP_tail = property_list_member($MISSPELLINGS_, current);
        final SubLObject misspellingsP = (NIL != misspellingsP_tail) ? cadr(misspellingsP_tail) : nl_trie_accessors.$misspellingsP$;
        final SubLObject case_sensitivity_tail = property_list_member($CASE_SENSITIVITY, current);
        final SubLObject case_sensitivity = (NIL != case_sensitivity_tail) ? cadr(case_sensitivity_tail) : nl_trie_accessors.$nl_trie_accessor_default_case_sensitivity$;
        final SubLObject check_semantic_mtP_tail = property_list_member(nl_trie_accessors.$kw20$CHECK_SEMANTIC_MT_, current);
        final SubLObject check_semantic_mtP = (NIL != check_semantic_mtP_tail) ? cadr(check_semantic_mtP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(nl_trie_accessors.DO_NL_TRIE_ENTRIES_FOR_STRING, list(new SubLObject[]{ entry_var, string, lookup_mt, $ENTRY_TYPE, $WORD, $MISSPELLINGS_, misspellingsP, nl_trie_accessors.$kw15$CHECK_PERIOD_, check_periodP, $CASE_SENSITIVITY, case_sensitivity, nl_trie_accessors.$kw20$CHECK_SEMANTIC_MT_, check_semantic_mtP }), append(body, NIL));
    }

    public static final SubLObject do_nl_trie_name_entries_for_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject entry_var = NIL;
                    SubLObject string = NIL;
                    SubLObject lookup_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    entry_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    lookup_mt = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            if (NIL == member(current_4, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                        {
                            SubLObject check_periodP_tail = property_list_member($kw15$CHECK_PERIOD_, current);
                            SubLObject check_periodP = (NIL != check_periodP_tail) ? ((SubLObject) (cadr(check_periodP_tail))) : NIL;
                            SubLObject misspellingsP_tail = property_list_member($MISSPELLINGS_, current);
                            SubLObject misspellingsP = (NIL != misspellingsP_tail) ? ((SubLObject) (cadr(misspellingsP_tail))) : $misspellingsP$;
                            SubLObject case_sensitivity_tail = property_list_member($CASE_SENSITIVITY, current);
                            SubLObject case_sensitivity = (NIL != case_sensitivity_tail) ? ((SubLObject) (cadr(case_sensitivity_tail))) : $nl_trie_accessor_default_case_sensitivity$;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_NL_TRIE_ENTRIES_FOR_STRING, list(new SubLObject[]{ entry_var, string, lookup_mt, $ENTRY_TYPE, $NAME, $MISSPELLINGS_, misspellingsP, $kw15$CHECK_PERIOD_, check_periodP, $CASE_SENSITIVITY, case_sensitivity }), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_nl_trie_name_entries_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry_var = NIL;
        SubLObject string = NIL;
        SubLObject lookup_mt = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list38);
        entry_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list38);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list38);
        lookup_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list38);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list38);
            if (NIL == member(current_$4, nl_trie_accessors.$list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == nl_trie_accessors.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list38);
        }
        final SubLObject check_periodP_tail = property_list_member(nl_trie_accessors.$kw15$CHECK_PERIOD_, current);
        final SubLObject check_periodP = (NIL != check_periodP_tail) ? cadr(check_periodP_tail) : NIL;
        final SubLObject misspellingsP_tail = property_list_member($MISSPELLINGS_, current);
        final SubLObject misspellingsP = (NIL != misspellingsP_tail) ? cadr(misspellingsP_tail) : nl_trie_accessors.$misspellingsP$;
        final SubLObject case_sensitivity_tail = property_list_member($CASE_SENSITIVITY, current);
        final SubLObject case_sensitivity = (NIL != case_sensitivity_tail) ? cadr(case_sensitivity_tail) : nl_trie_accessors.$nl_trie_accessor_default_case_sensitivity$;
        final SubLObject body;
        current = body = temp;
        return listS(nl_trie_accessors.DO_NL_TRIE_ENTRIES_FOR_STRING, list(new SubLObject[]{ entry_var, string, lookup_mt, $ENTRY_TYPE, $NAME, $MISSPELLINGS_, misspellingsP, nl_trie_accessors.$kw15$CHECK_PERIOD_, check_periodP, $CASE_SENSITIVITY, case_sensitivity }), append(body, NIL));
    }

    public static final SubLObject incorporate_new_entry_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject new_entry = NIL;
            SubLObject denot_list = NIL;
            SubLObject pred_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            new_entry = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            denot_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            pred_list = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_5 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt41);
                    current_5 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt41);
                    if (NIL == member(current_5, $list_alt42, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_5 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt41);
                }
                {
                    SubLObject skip_constraintsP_tail = property_list_member($kw43$SKIP_CONSTRAINTS_, current);
                    SubLObject skip_constraintsP = (NIL != skip_constraintsP_tail) ? ((SubLObject) (cadr(skip_constraintsP_tail))) : NIL;
                    SubLObject abbrev_types_tail = property_list_member($ABBREV_TYPES, current);
                    SubLObject abbrev_types = (NIL != abbrev_types_tail) ? ((SubLObject) (cadr(abbrev_types_tail))) : NIL;
                    SubLObject denot_type_tail = property_list_member($DENOT_TYPE, current);
                    SubLObject denot_type = (NIL != denot_type_tail) ? ((SubLObject) (cadr(denot_type_tail))) : $DENOT;
                    SubLObject skip_namestringsP_tail = property_list_member($kw47$SKIP_NAMESTRINGS_, current);
                    SubLObject skip_namestringsP = (NIL != skip_namestringsP_tail) ? ((SubLObject) (cadr(skip_namestringsP_tail))) : NIL;
                    return list(CMULTIPLE_VALUE_SETQ, list(denot_list, pred_list), list(ADD_NEW_ENTRY, new_entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP));
                }
            }
        }
    }

    public static SubLObject incorporate_new_entry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_entry = NIL;
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list41);
        new_entry = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list41);
        denot_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list41);
        pred_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list41);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list41);
            if (NIL == member(current_$5, nl_trie_accessors.$list42, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == nl_trie_accessors.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list41);
        }
        final SubLObject skip_constraintsP_tail = property_list_member(nl_trie_accessors.$kw43$SKIP_CONSTRAINTS_, current);
        final SubLObject skip_constraintsP = (NIL != skip_constraintsP_tail) ? cadr(skip_constraintsP_tail) : NIL;
        final SubLObject abbrev_types_tail = property_list_member($ABBREV_TYPES, current);
        final SubLObject abbrev_types = (NIL != abbrev_types_tail) ? cadr(abbrev_types_tail) : NIL;
        final SubLObject denot_type_tail = property_list_member($DENOT_TYPE, current);
        final SubLObject denot_type = (NIL != denot_type_tail) ? cadr(denot_type_tail) : $DENOT;
        final SubLObject skip_namestringsP_tail = property_list_member(nl_trie_accessors.$kw47$SKIP_NAMESTRINGS_, current);
        final SubLObject skip_namestringsP = (NIL != skip_namestringsP_tail) ? cadr(skip_namestringsP_tail) : NIL;
        return list(CMULTIPLE_VALUE_SETQ, list(denot_list, pred_list), list(nl_trie_accessors.ADD_NEW_ENTRY, new_entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP));
    }

    public static final SubLObject incorporate_new_denots_and_preds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject new_denots = NIL;
            SubLObject denot_list = NIL;
            SubLObject new_preds = NIL;
            SubLObject pred_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            new_denots = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            denot_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            new_preds = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            pred_list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CMULTIPLE_VALUE_SETQ, list(denot_list, pred_list), list(ADD_NEW_DENOTS_AND_PREDS, new_denots, denot_list, new_preds, pred_list));
            } else {
                cdestructuring_bind_error(datum, $list_alt50);
            }
        }
        return NIL;
    }

    public static SubLObject incorporate_new_denots_and_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_denots = NIL;
        SubLObject denot_list = NIL;
        SubLObject new_preds = NIL;
        SubLObject pred_list = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list50);
        new_denots = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list50);
        denot_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list50);
        new_preds = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list50);
        pred_list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CMULTIPLE_VALUE_SETQ, list(denot_list, pred_list), list(nl_trie_accessors.ADD_NEW_DENOTS_AND_PREDS, new_denots, denot_list, new_preds, pred_list));
        }
        cdestructuring_bind_error(datum, nl_trie_accessors.$list50);
        return NIL;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos;
     * 		a #$SpeechPart
     * @param misspellings?;
    boolean
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return boolean
    Returns T if STRING is a POS on some word unit in LOOKUP-MT; nil otherwise.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos;\r\n\t\ta #$SpeechPart\r\n@param misspellings?;\nboolean\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return boolean\r\nReturns T if STRING is a POS on some word unit in LOOKUP-MT; nil otherwise.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_string_is_posP_internal_alt(SubLObject string, SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, UNPROVIDED, UNPROVIDED);
                            SubLObject input_contains_periodP = com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string);
                            if (NIL == foundP) {
                                {
                                    SubLObject csome_list_var = entries;
                                    SubLObject entry = NIL;
                                    for (entry = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , entry = csome_list_var.first()) {
                                        if ((((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(input_contains_periodP, entry, string))) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                            foundP = T;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return foundP;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos;
     * 		a #$SpeechPart
     * @param misspellings?;
    boolean
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return boolean
    Returns T if STRING is a POS on some word unit in LOOKUP-MT; nil otherwise.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos;\r\n\t\ta #$SpeechPart\r\n@param misspellings?;\nboolean\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return boolean\r\nReturns T if STRING is a POS on some word unit in LOOKUP-MT; nil otherwise.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_string_is_posP_internal(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            final SubLObject entries = nl_trie_accessors.gated_nl_trie_search(string, UNPROVIDED, UNPROVIDED);
            final SubLObject input_contains_periodP = nl_trie_accessors.contains_periodP(string);
            if (NIL == foundP) {
                SubLObject csome_list_var = entries;
                SubLObject entry = NIL;
                entry = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if ((((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != nl_trie_accessors.period_const_satisfiedP(input_contains_periodP, entry, string))) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    entry = csome_list_var.first();
                } 
            }
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }

    public static final SubLObject nl_trie_string_is_posP_alt(SubLObject string, SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_string_is_posP_internal(string, pos, misspellingsP, lookup_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym52$NL_TRIE_STRING_IS_POS_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym52$NL_TRIE_STRING_IS_POS_, FOUR_INTEGER, $int$4096, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym52$NL_TRIE_STRING_IS_POS_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, misspellingsP, lookup_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw54$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (pos.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (misspellingsP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && lookup_mt.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_string_is_posP_internal(string, pos, misspellingsP, lookup_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(string, pos, misspellingsP, lookup_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject nl_trie_string_is_posP(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_accessors.nl_trie_string_is_posP_internal(string, pos, misspellingsP, lookup_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_, FOUR_INTEGER, $int$4096, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, misspellingsP, lookup_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (misspellingsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && lookup_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_accessors.nl_trie_string_is_posP_internal(string, pos, misspellingsP, lookup_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, pos, misspellingsP, lookup_mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; list of word units associated with STRING
    Searches the NL Trie with STRING, and returns the word units associated with the NL Trie
    entries found where the contents of the entry in question holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; list of word units associated with STRING\r\nSearches the NL Trie with STRING, and returns the word units associated with the NL Trie\r\nentries found where the contents of the entry in question holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_words_of_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word_units = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (!((NIL == nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED)) || (NIL == nl_trie.nl_trie_word_head_onlyP(entry)))) {
                                        {
                                            SubLObject var = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                                            if (NIL != var) {
                                                {
                                                    SubLObject item_var = var;
                                                    if (NIL == member(item_var, word_units, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        word_units = cons(item_var, word_units);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return word_units;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; list of word units associated with STRING
    Searches the NL Trie with STRING, and returns the word units associated with the NL Trie
    entries found where the contents of the entry in question holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; list of word units associated with STRING\r\nSearches the NL Trie with STRING, and returns the word units associated with the NL Trie\r\nentries found where the contents of the entry in question holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_words_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_units = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                    final SubLObject var = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                    if (NIL != var) {
                        final SubLObject item_var = var;
                        if (NIL == member(item_var, word_units, symbol_function(EQL), symbol_function(IDENTITY))) {
                            word_units = cons(item_var, word_units);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return word_units;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pred;
     * 		fort-p (an instance of #$SpeechPartPredicate)
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; list of word units associated with the STRING-PRED pair
    Searches the NL Trie with STRING and returns the word units associated with
    the NL Trie entries found where (a spec-pred of) PRED is among the part-of-speech
    predicates associated with the entry in question and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pred;\r\n\t\tfort-p (an instance of #$SpeechPartPredicate)\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; list of word units associated with the STRING-PRED pair\r\nSearches the NL Trie with STRING and returns the word units associated with\r\nthe NL Trie entries found where (a spec-pred of) PRED is among the part-of-speech\r\npredicates associated with the entry in question and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_words_of_stringXpred_alt(SubLObject string, SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word_units = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if ((NIL != com.cyc.cycjava.cycl.nl_trie_accessors.pos_pred_const_satisfiedP(pred, nl_trie.nl_trie_word_pos_preds(entry))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                                        {
                                            SubLObject var = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                                            if (NIL != var) {
                                                {
                                                    SubLObject item_var = var;
                                                    if (NIL == member(item_var, word_units, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        word_units = cons(item_var, word_units);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return word_units;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pred;
     * 		fort-p (an instance of #$SpeechPartPredicate)
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; list of word units associated with the STRING-PRED pair
    Searches the NL Trie with STRING and returns the word units associated with
    the NL Trie entries found where (a spec-pred of) PRED is among the part-of-speech
    predicates associated with the entry in question and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pred;\r\n\t\tfort-p (an instance of #$SpeechPartPredicate)\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; list of word units associated with the STRING-PRED pair\r\nSearches the NL Trie with STRING and returns the word units associated with\r\nthe NL Trie entries found where (a spec-pred of) PRED is among the part-of-speech\r\npredicates associated with the entry in question and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_words_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_units = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != nl_trie_accessors.pos_pred_const_satisfiedP(pred, nl_trie.nl_trie_word_pos_preds(entry)))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                    final SubLObject var = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                    if (NIL != var) {
                        final SubLObject item_var = var;
                        if (NIL == member(item_var, word_units, symbol_function(EQL), symbol_function(IDENTITY))) {
                            word_units = cons(item_var, word_units);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return word_units;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos-keyword;
    keywordp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; list of word units associated with the STRING/POS-KEYWORD pair
     * @return 1 listp; list of predicates/parts-of-speech used for each such association
     * @return 2 listp; (semantic) lexical predicate used in the assertion
    Searches the NL Trie with STRING and returns the word units associated with
    the NL Trie entries found where the part-of-speech associated with the entry in question
    is one of those corresponding to POS-KEYWORD and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos-keyword;\nkeywordp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; list of word units associated with the STRING/POS-KEYWORD pair\r\n@return 1 listp; list of predicates/parts-of-speech used for each such association\r\n@return 2 listp; (semantic) lexical predicate used in the assertion\r\nSearches the NL Trie with STRING and returns the word units associated with\r\nthe NL Trie entries found where the part-of-speech associated with the entry in question\r\nis one of those corresponding to POS-KEYWORD and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_words_of_stringXpos_alt(SubLObject string, SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_list = lexicon_accessors.pos_for_keyword(pos_keyword, UNPROVIDED);
                SubLObject word_units = NIL;
                SubLObject pos_preds = NIL;
                SubLObject lex_preds = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    {
                                        SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                                        if (((NIL != wu) && (NIL != lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_word_pos(entry), pos_list))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                                            {
                                                SubLObject new_lex_pred = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                                                SubLObject new_word_unit = wu;
                                                SubLObject cdolist_list_var_6 = nl_trie.nl_trie_word_pos_preds(entry);
                                                SubLObject new_pos_pred = NIL;
                                                for (new_pos_pred = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , new_pos_pred = cdolist_list_var_6.first()) {
                                                    {
                                                        SubLObject foundP = NIL;
                                                        if (NIL == foundP) {
                                                            {
                                                                SubLObject word_unit = NIL;
                                                                SubLObject word_unit_7 = NIL;
                                                                SubLObject lex_pred = NIL;
                                                                SubLObject lex_pred_8 = NIL;
                                                                SubLObject pos_pred = NIL;
                                                                SubLObject pos_pred_9 = NIL;
                                                                for (word_unit = word_units, word_unit_7 = word_unit.first(), lex_pred = lex_preds, lex_pred_8 = lex_pred.first(), pos_pred = pos_preds, pos_pred_9 = pos_pred.first(); !((NIL != foundP) || (((NIL == pos_pred) && (NIL == lex_pred)) && (NIL == word_unit))); word_unit = word_unit.rest() , word_unit_7 = word_unit.first() , lex_pred = lex_pred.rest() , lex_pred_8 = lex_pred.first() , pos_pred = pos_pred.rest() , pos_pred_9 = pos_pred.first()) {
                                                                    foundP = makeBoolean((new_word_unit.equal(word_unit_7) && new_lex_pred.equal(lex_pred_8)) && new_pos_pred.equal(pos_pred_9));
                                                                }
                                                            }
                                                        }
                                                        if (NIL == foundP) {
                                                            word_units = cons(wu, word_units);
                                                            lex_preds = cons(new_lex_pred, lex_preds);
                                                            pos_preds = cons(new_pos_pred.eql($$partOfSpeech) ? ((SubLObject) (nl_trie.nl_trie_word_pos(entry))) : new_pos_pred, pos_preds);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(word_units, pos_preds, lex_preds);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos-keyword;
    keywordp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; list of word units associated with the STRING/POS-KEYWORD pair
     * @return 1 listp; list of predicates/parts-of-speech used for each such association
     * @return 2 listp; (semantic) lexical predicate used in the assertion
    Searches the NL Trie with STRING and returns the word units associated with
    the NL Trie entries found where the part-of-speech associated with the entry in question
    is one of those corresponding to POS-KEYWORD and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos-keyword;\nkeywordp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; list of word units associated with the STRING/POS-KEYWORD pair\r\n@return 1 listp; list of predicates/parts-of-speech used for each such association\r\n@return 2 listp; (semantic) lexical predicate used in the assertion\r\nSearches the NL Trie with STRING and returns the word units associated with\r\nthe NL Trie entries found where the part-of-speech associated with the entry in question\r\nis one of those corresponding to POS-KEYWORD and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_words_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_list = lexicon_accessors.pos_for_keyword(pos_keyword, UNPROVIDED);
        SubLObject word_units = NIL;
        SubLObject pos_preds = NIL;
        SubLObject lex_preds = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                    final SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                    if (((NIL != wu) && (NIL != lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_word_pos(entry), pos_list))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                        final SubLObject new_lex_pred = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                        final SubLObject new_word_unit = wu;
                        SubLObject cdolist_list_var_$6 = nl_trie.nl_trie_word_pos_preds(entry);
                        SubLObject new_pos_pred = NIL;
                        new_pos_pred = cdolist_list_var_$6.first();
                        while (NIL != cdolist_list_var_$6) {
                            SubLObject foundP = NIL;
                            if (NIL == foundP) {
                                SubLObject word_unit;
                                SubLObject word_unit_$7;
                                SubLObject lex_pred;
                                SubLObject lex_pred_$8;
                                SubLObject pos_pred;
                                SubLObject pos_pred_$9;
                                for (word_unit = NIL, word_unit_$7 = NIL, lex_pred = NIL, lex_pred_$8 = NIL, pos_pred = NIL, pos_pred_$9 = NIL, word_unit = word_units, word_unit_$7 = word_unit.first(), lex_pred = lex_preds, lex_pred_$8 = lex_pred.first(), pos_pred = pos_preds, pos_pred_$9 = pos_pred.first(); (NIL == foundP) && (((NIL != pos_pred) || (NIL != lex_pred)) || (NIL != word_unit)); foundP = makeBoolean((new_word_unit.equal(word_unit_$7) && new_lex_pred.equal(lex_pred_$8)) && new_pos_pred.equal(pos_pred_$9)) , word_unit = word_unit.rest() , word_unit_$7 = word_unit.first() , lex_pred = lex_pred.rest() , lex_pred_$8 = lex_pred.first() , pos_pred = pos_pred.rest() , pos_pred_$9 = pos_pred.first()) {
                                }
                            }
                            if (NIL == foundP) {
                                word_units = cons(wu, word_units);
                                lex_preds = cons(new_lex_pred, lex_preds);
                                pos_preds = cons(new_pos_pred.eql(nl_trie_accessors.$$partOfSpeech) ? nl_trie.nl_trie_word_pos(entry) : new_pos_pred, pos_preds);
                            }
                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                            new_pos_pred = cdolist_list_var_$6.first();
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(word_units, pos_preds, lex_preds);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos;
    fort-p
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; list of word units associated with the STRING/POS pair
     * @return 1 listp; list of predicates/parts-of-speech used for each such association
    Searches the NL Trie with STRING and returns the word units associated with
    the NL Trie entries found where the part-of-speech associated with the entry in question
    is one of those corresponding to POS and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos;\nfort-p\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; list of word units associated with the STRING/POS pair\r\n@return 1 listp; list of predicates/parts-of-speech used for each such association\r\nSearches the NL Trie with STRING and returns the word units associated with\r\nthe NL Trie entries found where the part-of-speech associated with the entry in question\r\nis one of those corresponding to POS and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_words_of_stringXspeech_part_alt(SubLObject string, SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word_units = NIL;
                SubLObject pos_preds = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    {
                                        SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                                        if (((NIL != wu) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                                            {
                                                SubLObject new_pos_preds = nl_trie.nl_trie_word_pos_preds(entry);
                                                SubLObject new_word_units = make_list(list_length(new_pos_preds), wu);
                                                word_units = append(new_word_units, word_units);
                                                pos_preds = append(substitute(nl_trie.nl_trie_word_pos(entry), $$partOfSpeech, new_pos_preds, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pos_preds);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject found_words = NIL;
                    SubLObject output_words = NIL;
                    SubLObject output_preds = NIL;
                    SubLObject cdotimes_end_var = length(word_units);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject word = nth(i, word_units);
                            SubLObject pos_pred = nth(i, pos_preds);
                            if (list_utilities.alist_lookup(found_words, word, UNPROVIDED, UNPROVIDED) != pos_pred) {
                                output_words = cons(word, output_words);
                                output_preds = cons(pos_pred, output_preds);
                                found_words = list_utilities.alist_enter(found_words, word, pos_pred, UNPROVIDED);
                            }
                        }
                    }
                    return values(output_words, output_preds);
                }
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos;
    fort-p
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; list of word units associated with the STRING/POS pair
     * @return 1 listp; list of predicates/parts-of-speech used for each such association
    Searches the NL Trie with STRING and returns the word units associated with
    the NL Trie entries found where the part-of-speech associated with the entry in question
    is one of those corresponding to POS and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos;\nfort-p\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; list of word units associated with the STRING/POS pair\r\n@return 1 listp; list of predicates/parts-of-speech used for each such association\r\nSearches the NL Trie with STRING and returns the word units associated with\r\nthe NL Trie entries found where the part-of-speech associated with the entry in question\r\nis one of those corresponding to POS and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_words_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_units = NIL;
        SubLObject pos_preds = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                    final SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                    if (((NIL != wu) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED))) && (NIL != nl_trie.nl_trie_word_head_onlyP(entry))) {
                        final SubLObject new_pos_preds = nl_trie.nl_trie_word_pos_preds(entry);
                        final SubLObject new_word_units = make_list(list_length(new_pos_preds), wu);
                        word_units = append(new_word_units, word_units);
                        pos_preds = append(substitute(nl_trie.nl_trie_word_pos(entry), nl_trie_accessors.$$partOfSpeech, new_pos_preds, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pos_preds);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject found_words = NIL;
        SubLObject output_words = NIL;
        SubLObject output_preds = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject word;
        SubLObject pos_pred;
        for (cdotimes_end_var = length(word_units), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            word = nth(i, word_units);
            pos_pred = nth(i, pos_preds);
            if (!list_utilities.alist_lookup(found_words, word, UNPROVIDED, UNPROVIDED).eql(pos_pred)) {
                output_words = cons(word, output_words);
                output_preds = cons(pos_pred, output_preds);
                found_words = list_utilities.alist_enter(found_words, word, pos_pred, UNPROVIDED);
            }
        }
        return values(output_words, output_preds);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param word;
    fort-p
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp;
    Searches the NL Trie with STRING, and gathers and returns the part-of-speech
    predicates associated with the NL Trie entries found where WORD is the word unit
    associated with the entry in question and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param word;\nfort-p\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp;\r\nSearches the NL Trie with STRING, and gathers and returns the part-of-speech\r\npredicates associated with the NL Trie entries found where WORD is the word unit\r\nassociated with the entry in question and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_preds_of_stringXword_alt(SubLObject string, SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_preds = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED).equal(word)) {
                                        pos_preds = union(nl_trie.nl_trie_word_pos_preds(entry), pos_preds, symbol_function(EQUAL), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return pos_preds;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param word;
    fort-p
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp;
    Searches the NL Trie with STRING, and gathers and returns the part-of-speech
    predicates associated with the NL Trie entries found where WORD is the word unit
    associated with the entry in question and the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param word;\nfort-p\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp;\r\nSearches the NL Trie with STRING, and gathers and returns the part-of-speech\r\npredicates associated with the NL Trie entries found where WORD is the word unit\r\nassociated with the entry in question and the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_preds_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_preds = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED).equal(word)) {
                    pos_preds = union(nl_trie.nl_trie_word_pos_preds(entry), pos_preds, symbol_function(EQUAL), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return pos_preds;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp;
    Searches the NL Trie with STRING, and gathers and returns the part-of-speech
    predicates associated with the NL Trie entries found where the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp;\r\nSearches the NL Trie with STRING, and gathers and returns the part-of-speech\r\npredicates associated with the NL Trie entries found where the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_preds_of_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_preds = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    pos_preds = union(nl_trie.nl_trie_word_pos_preds(entry), pos_preds, symbol_function(EQUAL), UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return pos_preds;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp;
    Searches the NL Trie with STRING, and gathers and returns the part-of-speech
    predicates associated with the NL Trie entries found where the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp;\r\nSearches the NL Trie with STRING, and gathers and returns the part-of-speech\r\npredicates associated with the NL Trie entries found where the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_preds = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                    pos_preds = union(nl_trie.nl_trie_word_pos_preds(entry), pos_preds, symbol_function(EQUAL), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return pos_preds;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp;
    Searches the NL Trie with STRING, and gathers and returns the name-string
    predicates associated with the NL Trie entries found where the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp;\r\nSearches the NL Trie with STRING, and gathers and returns the name-string\r\npredicates associated with the NL Trie entries found where the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_namestring_preds_of_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name_preds = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if ((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    {
                                        SubLObject item_var = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                                        if (NIL == member(item_var, name_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            name_preds = cons(item_var, name_preds);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return name_preds;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp;
    Searches the NL Trie with STRING, and gathers and returns the name-string
    predicates associated with the NL Trie entries found where the contents of the entry holds
    in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp;\r\nSearches the NL Trie with STRING, and gathers and returns the name-string\r\npredicates associated with the NL Trie entries found where the contents of the entry holds\r\nin LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_namestring_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name_preds = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                    final SubLObject item_var = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                    if (NIL == member(item_var, name_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                        name_preds = cons(item_var, name_preds);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return name_preds;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
    boolean
     * 		
     * @param lookup-mt;
     * 		hlmt-p
     * 		Searches the NL Trie with STRING, and returns the parts of speech associated with
     * 		the NL Trie entries found where the contents of the entry in question holds in LOOKUP-MT.
     * 		If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\nboolean\r\n\t\t\r\n@param lookup-mt;\r\n\t\thlmt-p\r\n\t\tSearches the NL Trie with STRING, and returns the parts of speech associated with\r\n\t\tthe NL Trie entries found where the contents of the entry in question holds in LOOKUP-MT.\r\n\t\tIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_pos_of_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    {
                                        SubLObject item_var = nl_trie.nl_trie_word_pos(entry);
                                        if (NIL == member(item_var, pos_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            pos_list = cons(item_var, pos_list);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return delete(NIL, pos_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
    boolean
     * 		
     * @param lookup-mt;
     * 		hlmt-p
     * 		Searches the NL Trie with STRING, and returns the parts of speech associated with
     * 		the NL Trie entries found where the contents of the entry in question holds in LOOKUP-MT.
     * 		If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\nboolean\r\n\t\t\r\n@param lookup-mt;\r\n\t\thlmt-p\r\n\t\tSearches the NL Trie with STRING, and returns the parts of speech associated with\r\n\t\tthe NL Trie entries found where the contents of the entry in question holds in LOOKUP-MT.\r\n\t\tIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_pos_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                    final SubLObject item_var = nl_trie.nl_trie_word_pos(entry);
                    if (NIL == member(item_var, pos_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                        pos_list = cons(item_var, pos_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return delete(NIL, pos_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param word;
    fort-p
     * 		
     * @param misspellings?;
    boolean
     * 		
     * @param lookup-mt;
     * 		fort-p
     * 		Searches the NL Trie with STRING, and gathers and returns the parts of speech
     * 		associated with the NL Trie entries found where WORD is the word unit associated
     * 		with the entry in question and the contents of the entry holds in LOOKUP-MT.
     * 		If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param word;\nfort-p\r\n\t\t\r\n@param misspellings?;\nboolean\r\n\t\t\r\n@param lookup-mt;\r\n\t\tfort-p\r\n\t\tSearches the NL Trie with STRING, and gathers and returns the parts of speech\r\n\t\tassociated with the NL Trie entries found where WORD is the word unit associated\r\n\t\twith the entry in question and the contents of the entry holds in LOOKUP-MT.\r\n\t\tIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_pos_of_stringXword_alt(SubLObject string, SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED).equal(word)) {
                                        {
                                            SubLObject item_var = nl_trie.nl_trie_word_pos(entry);
                                            if (NIL == member(item_var, pos_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                pos_list = cons(item_var, pos_list);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return pos_list;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param word;
    fort-p
     * 		
     * @param misspellings?;
    boolean
     * 		
     * @param lookup-mt;
     * 		fort-p
     * 		Searches the NL Trie with STRING, and gathers and returns the parts of speech
     * 		associated with the NL Trie entries found where WORD is the word unit associated
     * 		with the entry in question and the contents of the entry holds in LOOKUP-MT.
     * 		If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param word;\nfort-p\r\n\t\t\r\n@param misspellings?;\nboolean\r\n\t\t\r\n@param lookup-mt;\r\n\t\tfort-p\r\n\t\tSearches the NL Trie with STRING, and gathers and returns the parts of speech\r\n\t\tassociated with the NL Trie entries found where WORD is the word unit associated\r\n\t\twith the entry in question and the contents of the entry holds in LOOKUP-MT.\r\n\t\tIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_pos_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED).equal(word)) {
                    final SubLObject item_var = nl_trie.nl_trie_word_pos(entry);
                    if (NIL == member(item_var, pos_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                        pos_list = cons(item_var, pos_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return pos_list;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical/namestring
    predicates associated with the NL Trie entries found where the contents of the entry
    in question holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical/namestring\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nin question holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_all_denots_of_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            SubLObject abbrev_types = NIL;
            SubLObject denot_type = $DENOT;
            SubLObject skip_namestringsP = NIL;
            return com.cyc.cycjava.cycl.nl_trie_accessors.general_nl_trie_denots_of_string(string, misspellingsP, lookup_mt, T, abbrev_types, denot_type, skip_namestringsP, case_sensitivity);
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical/namestring
    predicates associated with the NL Trie entries found where the contents of the entry
    in question holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical/namestring\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nin question holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_all_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject abbrev_types = NIL;
        final SubLObject denot_type = $DENOT;
        final SubLObject skip_namestringsP = NIL;
        return nl_trie_accessors.general_nl_trie_denots_of_string(string, misspellingsP, lookup_mt, T, abbrev_types, denot_type, skip_namestringsP, case_sensitivity);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations;
     * 		if it includes :acronyms, include acronyms
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param skip-namestrings?
     * 		: T to not include name string denotations
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical/namestring
    predicates associated with the NL Trie entries found where the contents of the entry
    in question holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations;\r\n\t\tif it includes :acronyms, include acronyms\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param skip-namestrings?\r\n\t\t: T to not include name string denotations\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical/namestring\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nin question holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_string_alt(SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.nl_trie_accessors.general_nl_trie_denots_of_string(string, misspellingsP, lookup_mt, NIL, abbrev_types, denot_type, skip_namestringsP, case_sensitivity);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations;
     * 		if it includes :acronyms, include acronyms
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param skip-namestrings?
     * 		: T to not include name string denotations
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical/namestring
    predicates associated with the NL Trie entries found where the contents of the entry
    in question holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations;\r\n\t\tif it includes :acronyms, include acronyms\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param skip-namestrings?\r\n\t\t: T to not include name string denotations\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical/namestring\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nin question holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        return nl_trie_accessors.general_nl_trie_denots_of_string(string, misspellingsP, lookup_mt, NIL, abbrev_types, denot_type, skip_namestringsP, case_sensitivity);
    }

    public static final SubLObject general_nl_trie_denots_of_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP, SubLObject case_sensitivity) {
        if (skip_constraintsP == UNPROVIDED) {
            skip_constraintsP = NIL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                SubLObject starts_with_theP = com.cyc.cycjava.cycl.nl_trie_accessors.starts_with_theP(string);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject denot_list_10 = com.cyc.cycjava.cycl.nl_trie_accessors.general_nl_trie_denots_of_string_int(string, misspellingsP, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP, starts_with_theP, case_sensitivity);
                            SubLObject pred_list_11 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denot_list = denot_list_10;
                            pred_list = pred_list_11;
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    public static SubLObject general_nl_trie_denots_of_string(final SubLObject string, final SubLObject misspellingsP, final SubLObject lookup_mt, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP, SubLObject case_sensitivity) {
        if (skip_constraintsP == UNPROVIDED) {
            skip_constraintsP = NIL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject starts_with_theP = nl_trie_accessors.starts_with_theP(string);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            thread.resetMultipleValues();
            final SubLObject denot_list_$10 = nl_trie_accessors.general_nl_trie_denots_of_string_int(string, misspellingsP, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP, starts_with_theP, case_sensitivity);
            final SubLObject pred_list_$11 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$10;
            pred_list = pred_list_$11;
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    public static final SubLObject general_nl_trie_denots_of_string_int_alt(SubLObject string, SubLObject misspellingsP, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP, SubLObject starts_with_theP, SubLObject case_sensitivity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                SubLObject precise_with_theP = NIL;
                SubLObject input_contains_periodP = com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string);
                SubLObject entry_type = (NIL != skip_namestringsP) ? ((SubLObject) ($WORD)) : $ANY;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if ((($ANY == entry_type) || (nl_trie.nl_trie_entry_type(entry) == entry_type)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    {
                                        SubLObject okP = NIL;
                                        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                                            okP = makeBoolean((NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(input_contains_periodP, entry, string)) && (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), nl_trie.nl_trie_word_semantics_mt(entry))));
                                        } else {
                                            if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
                                                okP = makeBoolean((NIL == skip_namestringsP) && ((NIL == precise_with_theP) || starts_with_theP.eql(com.cyc.cycjava.cycl.nl_trie_accessors.starts_with_theP(nl_trie.nl_trie_entry_string(entry)))));
                                            }
                                        }
                                        if (NIL != okP) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject denot_list_12 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP);
                                                SubLObject pred_list_13 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                denot_list = denot_list_12;
                                                pred_list = pred_list_13;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    public static SubLObject general_nl_trie_denots_of_string_int(final SubLObject string, final SubLObject misspellingsP, final SubLObject skip_constraintsP, final SubLObject abbrev_types, final SubLObject denot_type, final SubLObject skip_namestringsP, final SubLObject starts_with_theP, final SubLObject case_sensitivity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject precise_with_theP = NIL;
        final SubLObject input_contains_periodP = nl_trie_accessors.contains_periodP(string);
        final SubLObject entry_type = (NIL != skip_namestringsP) ? $WORD : $ANY;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((($ANY == entry_type) || nl_trie.nl_trie_entry_type(entry).eql(entry_type)) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                    SubLObject okP = NIL;
                    if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                        okP = makeBoolean((NIL != nl_trie_accessors.period_const_satisfiedP(input_contains_periodP, entry, string)) && (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), nl_trie.nl_trie_word_semantics_mt(entry))));
                    } else
                        if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
                            okP = makeBoolean((NIL == skip_namestringsP) && ((NIL == precise_with_theP) || starts_with_theP.eql(nl_trie_accessors.starts_with_theP(nl_trie.nl_trie_entry_string(entry)))));
                        }

                    if (NIL != okP) {
                        thread.resetMultipleValues();
                        final SubLObject denot_list_$12 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP);
                        final SubLObject pred_list_$13 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denot_list = denot_list_$12;
                        pred_list = pred_list_$13;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string to map to its denotations
     * @param EXCLUDED-PREDS
     * 		list; a list of semantic predicates which should be ignored when computing mappings
     * @param MODE
     * 		keyword; :greedy or :diligent
     * @return LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring of STRING
    and as its STRING-TOKEN-VALUE a denotatum for that string
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string to map to its denotations\r\n@param EXCLUDED-PREDS\r\n\t\tlist; a list of semantic predicates which should be ignored when computing mappings\r\n@param MODE\r\n\t\tkeyword; :greedy or :diligent\r\n@return LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring of STRING\r\nand as its STRING-TOKEN-VALUE a denotatum for that string")
    public static final SubLObject nl_trie_denotation_mapper_alt(SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == UNPROVIDED) {
            excluded_preds = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokenizations = lexicon_utilities.sentence_tokenize(string_utilities.string_tokenize(string, $denotation_mapping_break_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), nl_trie.get_nl_trie(), $STRING, mode, UNPROVIDED, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = tokenizations;
                SubLObject tokenization = NIL;
                for (tokenization = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tokenization = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_14 = tokenization;
                        SubLObject token = NIL;
                        for (token = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , token = cdolist_list_var_14.first()) {
                            {
                                SubLObject token_string = standard_tokenization.string_token_string(token);
                                SubLObject mapping_foundP = NIL;
                                if (NIL == lexicon_accessors.skip_to_morphological_parsingP(parse_morphologically)) {
                                    {
                                        SubLObject cdolist_list_var_15 = standard_tokenization.string_token_value(token);
                                        SubLObject trie_entry = NIL;
                                        for (trie_entry = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , trie_entry = cdolist_list_var_15.first()) {
                                            if ((NIL != com.cyc.cycjava.cycl.nl_trie_accessors.pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(trie_entry, UNPROVIDED), $list_alt58, $DENOT, NIL)) && (NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(trie_entry, UNPROVIDED), excluded_preds, $sym59$GENL_POS_PRED_, UNPROVIDED))) {
                                                {
                                                    SubLObject cdolist_list_var_16 = nl_trie.nl_trie_entry_denots(trie_entry);
                                                    SubLObject denot = NIL;
                                                    for (denot = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , denot = cdolist_list_var_16.first()) {
                                                        {
                                                            SubLObject item_var = standard_tokenization.new_string_token(token_string, denot);
                                                            if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                                                result = cons(item_var, result);
                                                            }
                                                        }
                                                        mapping_foundP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL != lexicon_accessors.proceed_with_morphological_parsingP(mapping_foundP, parse_morphologically)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(token_string, UNPROVIDED);
                                        SubLObject morph_predicate_lists = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject morph_denot = NIL;
                                            SubLObject morph_denot_17 = NIL;
                                            SubLObject morph_predicate_list = NIL;
                                            SubLObject morph_predicate_list_18 = NIL;
                                            for (morph_denot = morph_denots, morph_denot_17 = morph_denot.first(), morph_predicate_list = morph_predicate_lists, morph_predicate_list_18 = morph_predicate_list.first(); !((NIL == morph_predicate_list) && (NIL == morph_denot)); morph_denot = morph_denot.rest() , morph_denot_17 = morph_denot.first() , morph_predicate_list = morph_predicate_list.rest() , morph_predicate_list_18 = morph_predicate_list.first()) {
                                                {
                                                    SubLObject includedP = NIL;
                                                    if (NIL == includedP) {
                                                        {
                                                            SubLObject csome_list_var = morph_predicate_list_18;
                                                            SubLObject pred = NIL;
                                                            for (pred = csome_list_var.first(); !((NIL != includedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                                if (NIL == subl_promotions.memberP(pred, excluded_preds, $sym59$GENL_POS_PRED_, UNPROVIDED)) {
                                                                    {
                                                                        SubLObject item_var = standard_tokenization.new_string_token(token_string, morph_denot_17);
                                                                        if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                                                            result = cons(item_var, result);
                                                                        }
                                                                    }
                                                                    mapping_foundP = T;
                                                                    includedP = T;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == mapping_foundP) {
                                    {
                                        SubLObject item_var = standard_tokenization.new_string_token(token_string, NIL);
                                        if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                            result = cons(item_var, result);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string to map to its denotations
     * @param EXCLUDED-PREDS
     * 		list; a list of semantic predicates which should be ignored when computing mappings
     * @param MODE
     * 		keyword; :greedy or :diligent
     * @return LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring of STRING
    and as its STRING-TOKEN-VALUE a denotatum for that string
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string to map to its denotations\r\n@param EXCLUDED-PREDS\r\n\t\tlist; a list of semantic predicates which should be ignored when computing mappings\r\n@param MODE\r\n\t\tkeyword; :greedy or :diligent\r\n@return LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring of STRING\r\nand as its STRING-TOKEN-VALUE a denotatum for that string")
    public static SubLObject nl_trie_denotation_mapper(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == UNPROVIDED) {
            excluded_preds = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = string_utilities.string_tokenize(string, nl_trie_accessors.$denotation_mapping_break_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject tokenizations = NIL;
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                tokenizations = lexicon_utilities.sentence_tokenize(tokens, nl_trie.get_nl_trie(), $STRING, mode, UNPROVIDED, UNPROVIDED);
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        SubLObject cdolist_list_var = tokenizations;
        SubLObject tokenization = NIL;
        tokenization = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = tokenization;
            SubLObject token = NIL;
            token = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                final SubLObject token_string = standard_tokenization.string_token_string(token);
                SubLObject mapping_foundP = NIL;
                if (NIL == lexicon_accessors.skip_to_morphological_parsingP(parse_morphologically)) {
                    SubLObject cdolist_list_var_$15 = standard_tokenization.string_token_value(token);
                    SubLObject trie_entry = NIL;
                    trie_entry = cdolist_list_var_$15.first();
                    while (NIL != cdolist_list_var_$15) {
                        if ((NIL != nl_trie_accessors.pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(trie_entry, UNPROVIDED), nl_trie_accessors.$list57, $DENOT, NIL)) && (NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(trie_entry, UNPROVIDED), excluded_preds, nl_trie_accessors.$sym58$GENL_POS_PRED_, UNPROVIDED))) {
                            SubLObject cdolist_list_var_$16 = nl_trie.nl_trie_entry_denots(trie_entry);
                            SubLObject denot = NIL;
                            denot = cdolist_list_var_$16.first();
                            while (NIL != cdolist_list_var_$16) {
                                final SubLObject item_var = standard_tokenization.new_string_token(token_string, denot);
                                if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                    result = cons(item_var, result);
                                }
                                mapping_foundP = T;
                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                denot = cdolist_list_var_$16.first();
                            } 
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        trie_entry = cdolist_list_var_$15.first();
                    } 
                }
                if (NIL != lexicon_accessors.proceed_with_morphological_parsingP(mapping_foundP, parse_morphologically)) {
                    thread.resetMultipleValues();
                    final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(token_string, UNPROVIDED);
                    final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject morph_denot = NIL;
                    SubLObject morph_denot_$17 = NIL;
                    SubLObject morph_predicate_list = NIL;
                    SubLObject morph_predicate_list_$18 = NIL;
                    morph_denot = morph_denots;
                    morph_denot_$17 = morph_denot.first();
                    morph_predicate_list = morph_predicate_lists;
                    morph_predicate_list_$18 = morph_predicate_list.first();
                    while ((NIL != morph_predicate_list) || (NIL != morph_denot)) {
                        SubLObject includedP = NIL;
                        if (NIL == includedP) {
                            SubLObject csome_list_var = morph_predicate_list_$18;
                            SubLObject pred = NIL;
                            pred = csome_list_var.first();
                            while ((NIL == includedP) && (NIL != csome_list_var)) {
                                if (NIL == subl_promotions.memberP(pred, excluded_preds, nl_trie_accessors.$sym58$GENL_POS_PRED_, UNPROVIDED)) {
                                    final SubLObject item_var2 = standard_tokenization.new_string_token(token_string, morph_denot_$17);
                                    if (NIL == member(item_var2, result, EQUAL, symbol_function(IDENTITY))) {
                                        result = cons(item_var2, result);
                                    }
                                    mapping_foundP = T;
                                    includedP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            } 
                        }
                        morph_denot = morph_denot.rest();
                        morph_denot_$17 = morph_denot.first();
                        morph_predicate_list = morph_predicate_list.rest();
                        morph_predicate_list_$18 = morph_predicate_list.first();
                    } 
                }
                if (NIL == mapping_foundP) {
                    final SubLObject item_var3 = standard_tokenization.new_string_token(token_string, NIL);
                    if (NIL == member(item_var3, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var3, result);
                    }
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                token = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            tokenization = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos-keyword;
    keywordp
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING/POS-KEYWORD pair
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical predicates
    associated with the NL Trie entries found where the part-of-speech associated
    with the entry in question is one of those corresponding to POS-KEYWORD and the
    contents of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos-keyword;\nkeywordp\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING/POS-KEYWORD pair\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical predicates\r\nassociated with the NL Trie entries found where the part-of-speech associated\r\nwith the entry in question is one of those corresponding to POS-KEYWORD and the\r\ncontents of the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_stringXpos_alt(SubLObject string, SubLObject pos_keyword, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_list = lexicon_accessors.pos_for_keyword(pos_keyword, UNPROVIDED);
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (NIL != lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_word_pos(entry), pos_list)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject denot_list_19 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL);
                                            SubLObject pred_list_20 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            denot_list = denot_list_19;
                                            pred_list = pred_list_20;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos-keyword;
    keywordp
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING/POS-KEYWORD pair
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical predicates
    associated with the NL Trie entries found where the part-of-speech associated
    with the entry in question is one of those corresponding to POS-KEYWORD and the
    contents of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos-keyword;\nkeywordp\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING/POS-KEYWORD pair\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical predicates\r\nassociated with the NL Trie entries found where the part-of-speech associated\r\nwith the entry in question is one of those corresponding to POS-KEYWORD and the\r\ncontents of the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_list = lexicon_accessors.pos_for_keyword(pos_keyword, UNPROVIDED);
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_word_pos(entry), pos_list))) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$19 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL);
                    final SubLObject pred_list_$20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$19;
                    pred_list = pred_list_$20;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; (<denotation> <pos-pred>) for STRING
    Searches the NL Trie with STRING and returns the denotations and speech part predicates
    associated with the NL Trie entries found where the
    contents of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; (<denotation> <pos-pred>) for STRING\r\nSearches the NL Trie with STRING and returns the denotations and speech part predicates\r\nassociated with the NL Trie entries found where the\r\ncontents of the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_dps_of_string_alt(SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject skip_namestringsP, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dp_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), abbrev_types, denot_type, skip_namestringsP)) {
                                        {
                                            SubLObject cdolist_list_var_21 = nl_trie.nl_trie_entry_denots(entry);
                                            SubLObject denot = NIL;
                                            for (denot = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , denot = cdolist_list_var_21.first()) {
                                                {
                                                    SubLObject cdolist_list_var_22 = nl_trie.nl_trie_word_pos_preds(entry);
                                                    SubLObject pos_pred = NIL;
                                                    for (pos_pred = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , pos_pred = cdolist_list_var_22.first()) {
                                                        {
                                                            SubLObject item_var = list(denot, pos_pred);
                                                            if (NIL == member(item_var, dp_list, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                                                dp_list = cons(item_var, dp_list);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return dp_list;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; (<denotation> <pos-pred>) for STRING
    Searches the NL Trie with STRING and returns the denotations and speech part predicates
    associated with the NL Trie entries found where the
    contents of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; (<denotation> <pos-pred>) for STRING\r\nSearches the NL Trie with STRING and returns the denotations and speech part predicates\r\nassociated with the NL Trie entries found where the\r\ncontents of the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_dps_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject skip_namestringsP, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dp_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != nl_trie_accessors.pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), abbrev_types, denot_type, skip_namestringsP))) {
                    SubLObject cdolist_list_var_$21 = nl_trie.nl_trie_entry_denots(entry);
                    SubLObject denot = NIL;
                    denot = cdolist_list_var_$21.first();
                    while (NIL != cdolist_list_var_$21) {
                        SubLObject cdolist_list_var_$22 = nl_trie.nl_trie_word_pos_preds(entry);
                        SubLObject pos_pred = NIL;
                        pos_pred = cdolist_list_var_$22.first();
                        while (NIL != cdolist_list_var_$22) {
                            final SubLObject item_var = list(denot, pos_pred);
                            if (NIL == member(item_var, dp_list, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                dp_list = cons(item_var, dp_list);
                            }
                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                            pos_pred = cdolist_list_var_$22.first();
                        } 
                        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                        denot = cdolist_list_var_$21.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return dp_list;
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos;
    fort-p
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param skip-namestrings?
     * 		: T to not include name string denotations
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING/POS pair
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical predicates
    associated with the NL Trie entries found where POS is the part-of-speech associated
    with the entry in question and the contents of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos;\nfort-p\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param skip-namestrings?\r\n\t\t: T to not include name string denotations\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING/POS pair\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical predicates\r\nassociated with the NL Trie entries found where POS is the part-of-speech associated\r\nwith the entry in question and the contents of the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_stringXspeech_part_alt(SubLObject string, SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject denot_list_23 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL);
                                            SubLObject pred_list_24 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            denot_list = denot_list_23;
                                            pred_list = pred_list_24;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos;
    fort-p
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param skip-namestrings?
     * 		: T to not include name string denotations
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING/POS pair
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical predicates
    associated with the NL Trie entries found where POS is the part-of-speech associated
    with the entry in question and the contents of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos;\nfort-p\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param skip-namestrings?\r\n\t\t: T to not include name string denotations\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING/POS pair\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical predicates\r\nassociated with the NL Trie entries found where POS is the part-of-speech associated\r\nwith the entry in question and the contents of the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED))) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$23 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL);
                    final SubLObject pred_list_$24 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$23;
                    pred_list = pred_list_$24;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos-pred;
    fort-p
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations;
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param skip-namestrings?
     * 		: T to not include name string denotations
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING/POS-PRED pair
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical predicates
    associated with the NL Trie entries found where (a spec-pred of) POS-PRED is among
    the part-of-speech predicates associated with the entry in question and the contents
    of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos-pred;\nfort-p\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations;\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param skip-namestrings?\r\n\t\t: T to not include name string denotations\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING/POS-PRED pair\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical predicates\r\nassociated with the NL Trie entries found where (a spec-pred of) POS-PRED is among\r\nthe part-of-speech predicates associated with the entry in question and the contents\r\nof the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_stringXpred_alt(SubLObject string, SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.pos_pred_const_satisfiedP(pos_pred, nl_trie.nl_trie_word_pos_preds(entry))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject denot_list_25 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL);
                                            SubLObject pred_list_26 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            denot_list = denot_list_25;
                                            pred_list = pred_list_26;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param pos-pred;
    fort-p
     * 		
     * @param abbrev-types;
     * 		listp: if it includes :abbrevs, include abbreviations;
     * @param denot-type;
     * 		keywordp:
     * 		:denot =  #$denotation assertions  (parsing)
     * 		:related = #$denotation and #$denotationRelatedTo (generation)
     * 		:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param skip-namestrings?
     * 		: T to not include name string denotations
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING/POS-PRED pair
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the denotations and lexical predicates
    associated with the NL Trie entries found where (a spec-pred of) POS-PRED is among
    the part-of-speech predicates associated with the entry in question and the contents
    of the entry holds in LOOKUP-MT.
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param pos-pred;\nfort-p\r\n\t\t\r\n@param abbrev-types;\r\n\t\tlistp: if it includes :abbrevs, include abbreviations;\r\n@param denot-type;\r\n\t\tkeywordp:\r\n\t\t:denot =  #$denotation assertions  (parsing)\r\n\t\t:related = #$denotation and #$denotationRelatedTo (generation)\r\n\t\t:any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param skip-namestrings?\r\n\t\t: T to not include name string denotations\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING/POS-PRED pair\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the denotations and lexical predicates\r\nassociated with the NL Trie entries found where (a spec-pred of) POS-PRED is among\r\nthe part-of-speech predicates associated with the entry in question and the contents\r\nof the entry holds in LOOKUP-MT.\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_stringXpred(final SubLObject string, final SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != nl_trie_accessors.pos_pred_const_satisfiedP(pos_pred, nl_trie.nl_trie_word_pos_preds(entry)))) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$25 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL);
                    final SubLObject pred_list_$26 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$25;
                    pred_list = pred_list_$26;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the name-string denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the name-string denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_name_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == UNPROVIDED) {
            precise_with_theP = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_denots_of_name_string_internal(string, misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, NIL);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the name-string denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the name-string denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_name_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == UNPROVIDED) {
            precise_with_theP = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return nl_trie_accessors.nl_trie_denots_of_name_string_internal(string, misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, NIL);
    }

    public static final SubLObject nl_trie_denots_of_name_string_internal_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject case_sensitivity, SubLObject unquotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                SubLObject starts_with_theP = makeBoolean((NIL != precise_with_theP) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.starts_with_theP(string)));
                SubLObject lookup_string = (NIL != starts_with_theP) ? ((SubLObject) (string_utilities.substring(string, FOUR_INTEGER, UNPROVIDED))) : string;
                SubLObject quotedP = makeBoolean((NIL == unquotedP) && (NIL != string_utilities.quoted_stringP(string)));
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(lookup_string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if ((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) {
                                    {
                                        SubLObject okP = T;
                                        if ((NIL != precise_with_theP) && (!starts_with_theP.eql(com.cyc.cycjava.cycl.nl_trie_accessors.starts_with_theP(nl_trie.nl_trie_entry_string(entry))))) {
                                            okP = NIL;
                                        } else {
                                            if ((NIL != unquotedP) && (NIL == com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_unquoted_entry_okP(entry))) {
                                                okP = NIL;
                                            } else {
                                                if (NIL == com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry)) {
                                                    okP = NIL;
                                                }
                                            }
                                        }
                                        if (NIL != okP) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject denot_list_27 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, T, NIL, $DENOT, NIL);
                                                SubLObject pred_list_28 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                denot_list = denot_list_27;
                                                pred_list = pred_list_28;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != quotedP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject unquoted_denots = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_denots_of_name_string_internal(string_utilities.unquote_string(string), misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, T);
                        SubLObject unquoted_preds = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject denot_list_29 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_denots_and_preds(unquoted_denots, denot_list, unquoted_preds, pred_list);
                            SubLObject pred_list_30 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denot_list = denot_list_29;
                            pred_list = pred_list_30;
                        }
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    public static SubLObject nl_trie_denots_of_name_string_internal(final SubLObject string, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject precise_with_theP, final SubLObject case_sensitivity, final SubLObject unquotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject starts_with_theP = makeBoolean((NIL != precise_with_theP) && (NIL != nl_trie_accessors.starts_with_theP(string)));
        final SubLObject lookup_string = (NIL != starts_with_theP) ? string_utilities.substring(string, FOUR_INTEGER, UNPROVIDED) : string;
        final SubLObject quotedP = makeBoolean((NIL == unquotedP) && (NIL != string_utilities.quoted_stringP(string)));
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(lookup_string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) {
                    SubLObject okP = T;
                    if ((NIL != precise_with_theP) && (!starts_with_theP.eql(nl_trie_accessors.starts_with_theP(nl_trie.nl_trie_entry_string(entry))))) {
                        okP = NIL;
                    } else
                        if ((NIL != unquotedP) && (NIL == nl_trie_accessors.nl_trie_unquoted_entry_okP(entry))) {
                            okP = NIL;
                        } else
                            if (NIL == nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry)) {
                                okP = NIL;
                            }


                    if (NIL != okP) {
                        thread.resetMultipleValues();
                        final SubLObject denot_list_$27 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, T, NIL, $DENOT, NIL);
                        final SubLObject pred_list_$28 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denot_list = denot_list_$27;
                        pred_list = pred_list_$28;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != quotedP) {
            thread.resetMultipleValues();
            final SubLObject unquoted_denots = nl_trie_accessors.nl_trie_denots_of_name_string_internal(string_utilities.unquote_string(string), misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, T);
            final SubLObject unquoted_preds = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject denot_list_$28 = nl_trie_accessors.add_new_denots_and_preds(unquoted_denots, denot_list, unquoted_preds, pred_list);
            final SubLObject pred_list_$29 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$28;
            pred_list = pred_list_$29;
        }
        return values(denot_list, pred_list);
    }

    public static final SubLObject starts_with_theP_alt(SubLObject string) {
        return string_utilities.starts_with_by_test(string, $str_alt61$the_, symbol_function(EQUALP));
    }

    public static SubLObject starts_with_theP(final SubLObject string) {
        return string_utilities.starts_with_by_test(string, nl_trie_accessors.$$$the_, symbol_function(EQUALP));
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$acronymString denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$acronymString denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_acronym_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            SubLObject namestring_pred = $$acronymString;
            return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$acronymString denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$acronymString denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_acronym_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject namestring_pred = nl_trie_accessors.$$acronymString;
        return nl_trie_accessors.nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the abbreviation-string denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the abbreviation-string denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_abbreviation_string_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $ANY) || (nl_trie.nl_trie_entry_type(entry) == $ANY)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (NIL != subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), lexicon_vars.abbreviation_predicates(), $sym59$GENL_POS_PRED_, UNPROVIDED)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject denot_list_31 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, T, NIL, $DENOT, NIL);
                                            SubLObject pred_list_32 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            denot_list = denot_list_31;
                                            pred_list = pred_list_32;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the abbreviation-string denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the abbreviation-string denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_abbreviation_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $ANY) || (nl_trie.nl_trie_entry_type(entry) == $ANY)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), lexicon_vars.abbreviation_predicates(), nl_trie_accessors.$sym58$GENL_POS_PRED_, UNPROVIDED))) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$31 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, T, NIL, $DENOT, NIL);
                    final SubLObject pred_list_$32 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$31;
                    pred_list = pred_list_$32;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    /**
     * Reinitialize the NL trie entries for STRING.
     *
     * @unknown - Assumes that all assertions affecting the trie entries for STRING
    are already indexed under STRING in the trie.
     */
    @LispMethod(comment = "Reinitialize the NL trie entries for STRING.\r\n\r\n@unknown - Assumes that all assertions affecting the trie entries for STRING\r\nare already indexed under STRING in the trie.")
    public static final SubLObject reinitialize_nl_trie_for_string_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject syntactic_assertions = NIL;
                SubLObject name_assertions = NIL;
                SubLObject lock = nl_trie.$nl_trie_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                        try {
                            lexicon_vars.$lexicon_lookup_mt$.bind($$InferencePSC, thread);
                            {
                                SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
                                SubLObject cdolist_list_var = entries;
                                SubLObject entry = NIL;
                                for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                    if (((($ANY == $ANY) || (nl_trie.nl_trie_entry_type(entry) == $ANY)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) {
                                        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                                            {
                                                SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(entry));
                                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                SubLObject state = NIL;
                                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    {
                                                        SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                                        if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                                            if (NIL != assertion_handles.assertion_p(support)) {
                                                                {
                                                                    SubLObject item_var = support;
                                                                    if (NIL == member(item_var, syntactic_assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        syntactic_assertions = cons(item_var, syntactic_assertions);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != assertion_handles.assertion_p(entry)) {
                                                name_assertions = cons(entry, name_assertions);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject key = nl_trie.nl_trie_string_tokenize(string);
                        strie.strie_remove(nl_trie.get_nl_trie(), key);
                    }
                    {
                        SubLObject cdolist_list_var = syntactic_assertions;
                        SubLObject as = NIL;
                        for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , as = cdolist_list_var.first()) {
                            nl_trie.augment_nl_trie_syntactic(as, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = name_assertions;
                        SubLObject as = NIL;
                        for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , as = cdolist_list_var.first()) {
                            nl_trie.augment_nl_trie_semantic(as, UNPROVIDED);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Reinitialize the NL trie entries for STRING.\r\n\r\n@unknown - Assumes that all assertions affecting the trie entries for STRING\r\nare already indexed under STRING in the trie.")
    public static SubLObject reinitialize_nl_trie_for_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject syntactic_assertions = NIL;
        SubLObject name_assertions = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                final SubLObject _prev_bind_0_$33 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(nl_trie_accessors.$$InferencePSC, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
                    SubLObject entry = NIL;
                    entry = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (((($ANY == $ANY) || (nl_trie.nl_trie_entry_type(entry) == $ANY)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) {
                            if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                                final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(entry);
                                final SubLObject set_contents_var = set.do_set_internal(set_var);
                                SubLObject basis_object;
                                SubLObject state;
                                SubLObject support;
                                SubLObject item_var;
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    support = set_contents.do_set_contents_next(basis_object, state);
                                    if ((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != assertion_handles.assertion_p(support))) {
                                        item_var = support;
                                        if (NIL == member(item_var, syntactic_assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            syntactic_assertions = cons(item_var, syntactic_assertions);
                                        }
                                    }
                                }
                            } else
                                if (NIL != assertion_handles.assertion_p(entry)) {
                                    name_assertions = cons(entry, name_assertions);
                                }

                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        entry = cdolist_list_var.first();
                    } 
                } finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$33, thread);
                }
                final SubLObject key = nl_trie.nl_trie_string_tokenize(string);
                strie.strie_remove(nl_trie.get_nl_trie(), key);
                SubLObject cdolist_list_var2 = syntactic_assertions;
                SubLObject as = NIL;
                as = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    nl_trie.augment_nl_trie_syntactic(as, UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    as = cdolist_list_var2.first();
                } 
                cdolist_list_var2 = name_assertions;
                as = NIL;
                as = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    nl_trie.augment_nl_trie_semantic(as, UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    as = cdolist_list_var2.first();
                } 
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
    }/**
     * Reinitialize the NL trie entries for STRING.
     *
     * @unknown - Assumes that all assertions affecting the trie entries for STRING
    are already indexed under STRING in the trie.
     */


    public static final SubLObject nl_trie_semtrans_templates_of_string_alt(SubLObject string, SubLObject frame, SubLObject misspellingsP, SubLObject pos, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (frame == UNPROVIDED) {
            frame = $ANY;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (pos == UNPROVIDED) {
            pos = $ANY;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject semtrans_template_list = NIL;
                SubLObject pred_list = NIL;
                SubLObject skip_constraintsP = NIL;
                SubLObject input_contains_periodP = com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string);
                if (NIL != possibly_naut_p(frame)) {
                    frame = narts_high.find_nart(frame);
                }
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if ((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if ((((NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(input_contains_periodP, entry, string)) && ((NIL == lexicon_accessors.speech_partP(pos, UNPROVIDED)) || (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED)))) && (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), nl_trie.nl_trie_word_semantics_mt(entry)))) && ((NIL == forts.fort_p(frame)) || nl_trie.nl_trie_word_frame(entry).eql(frame))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject semtrans_template_list_33 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, semtrans_template_list, pred_list, skip_constraintsP, NIL, $SEMTRANS_TEMPLATE, NIL);
                                            SubLObject pred_list_34 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            semtrans_template_list = semtrans_template_list_33;
                                            pred_list = pred_list_34;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(semtrans_template_list, pred_list);
            }
        }
    }

    public static SubLObject nl_trie_semtrans_templates_of_string(final SubLObject string, SubLObject frame, SubLObject misspellingsP, SubLObject pos, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (frame == UNPROVIDED) {
            frame = $ANY;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (pos == UNPROVIDED) {
            pos = $ANY;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject semtrans_template_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject skip_constraintsP = NIL;
        final SubLObject input_contains_periodP = nl_trie_accessors.contains_periodP(string);
        if (NIL != possibly_naut_p(frame)) {
            frame = narts_high.find_nart(frame);
        }
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != nl_trie_accessors.period_const_satisfiedP(input_contains_periodP, entry, string))) && ((NIL == lexicon_accessors.speech_partP(pos, UNPROVIDED)) || (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, UNPROVIDED)))) && (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), nl_trie.nl_trie_word_semantics_mt(entry)))) && ((NIL == forts.fort_p(frame)) || nl_trie.nl_trie_word_frame(entry).eql(frame))) {
                    thread.resetMultipleValues();
                    final SubLObject semtrans_template_list_$34 = nl_trie_accessors.add_new_entry(entry, semtrans_template_list, pred_list, skip_constraintsP, NIL, $SEMTRANS_TEMPLATE, NIL);
                    final SubLObject pred_list_$35 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    semtrans_template_list = semtrans_template_list_$34;
                    pred_list = pred_list_$35;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(semtrans_template_list, pred_list);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$nameSpelling denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$nameSpelling denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_names_from_spelling_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            SubLObject namestring_pred = $$nameSpelling;
            return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$nameSpelling denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$nameSpelling denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_names_from_spelling(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject namestring_pred = nl_trie_accessors.$$nameSpelling;
        return nl_trie_accessors.nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$commonNickname denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$commonNickname denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_names_from_nickname_alt(SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            SubLObject namestring_pred = $$commonNickname;
            return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$commonNickname denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$commonNickname denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_names_from_nickname(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject namestring_pred = nl_trie_accessors.$$commonNickname;
        return nl_trie_accessors.nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$acronymString denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$acronymString denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_denots_of_string_and_namestring_pred_alt(SubLObject string, SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denot_list = NIL;
                SubLObject pred_list = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if ((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if (NIL != lexicon_accessors.genl_pos_predP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), namestring_pred, UNPROVIDED)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject denot_list_35 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, T, NIL, $DENOT, NIL);
                                            SubLObject pred_list_36 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            denot_list = denot_list_35;
                                            pred_list = pred_list_36;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(denot_list, pred_list);
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return 0 listp; denotations mapped to STRING
     * @return 1 listp; list of list of semantic predicate(s) used for each mapping
    Searches the NL Trie with STRING and returns the #$acronymString denotations and lexical
    predicates associated with the NL Trie entries found where the contents of the entry
    holds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return 0 listp; denotations mapped to STRING\r\n@return 1 listp; list of list of semantic predicate(s) used for each mapping\r\nSearches the NL Trie with STRING and returns the #$acronymString denotations and lexical\r\npredicates associated with the NL Trie entries found where the contents of the entry\r\nholds in LOOKUP-MT. If MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_denots_of_string_and_namestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = NIL;
        SubLObject pred_list = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != lexicon_accessors.genl_pos_predP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), namestring_pred, UNPROVIDED))) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$36 = nl_trie_accessors.add_new_entry(entry, denot_list, pred_list, T, NIL, $DENOT, NIL);
                    final SubLObject pred_list_$37 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$36;
                    pred_list = pred_list_$37;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; assertions mapping some term to STRING via (a spec-pred of) NAMESTRING-PRED
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; assertions mapping some term to STRING via (a spec-pred of) NAMESTRING-PRED\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static final SubLObject nl_trie_assertions_with_string_and_namestring_pred_alt(SubLObject string, SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if ((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) {
                                    if ((NIL != assertion_handles.assertion_p(entry)) && (NIL != lexicon_accessors.genl_pos_predP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), namestring_pred, UNPROVIDED))) {
                                        assertions = cons(entry, assertions);
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    /**
     *
     *
     * @param string;
    stringp
     * 		
     * @param misspellings?;
     * 		boolean: T to include misspelled words
     * @param lookup-mt;
    hlmt-p
     * 		
     * @return listp; assertions mapping some term to STRING via (a spec-pred of) NAMESTRING-PRED
    If MISSPELLINGS? is T, common misspellings will be allowed.
     */
    @LispMethod(comment = "@param string;\nstringp\r\n\t\t\r\n@param misspellings?;\r\n\t\tboolean: T to include misspelled words\r\n@param lookup-mt;\nhlmt-p\r\n\t\t\r\n@return listp; assertions mapping some term to STRING via (a spec-pred of) NAMESTRING-PRED\r\nIf MISSPELLINGS? is T, common misspellings will be allowed.")
    public static SubLObject nl_trie_assertions_with_string_and_namestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, case_sensitivity, NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $NAME) || (nl_trie.nl_trie_entry_type(entry) == $NAME)) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(misspellingsP, entry))) && (NIL != assertion_handles.assertion_p(entry))) && (NIL != lexicon_accessors.genl_pos_predP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), namestring_pred, UNPROVIDED))) {
                    assertions = cons(entry, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff STRING is in the NL trie as a regularly inflected PRED
    form.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff STRING is in the NL trie as a regularly inflected PRED\r\nform.")
    public static final SubLObject nl_trie_regular_formP_alt(SubLObject string, SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            SubLTrampolineFile.checkType(pred, $sym67$SPEECH_PART_PRED_);
            {
                SubLObject regularP = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) {
                                    if (NIL != subl_promotions.memberP(pred, nl_trie.nl_trie_word_pos_preds(entry), $sym68$SPEC_POS_PRED_, UNPROVIDED)) {
                                        {
                                            SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(entry));
                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                            SubLObject state = NIL;
                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                {
                                                    SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                                        if (NIL == assertion_handles.assertion_p(support)) {
                                                            regularP = T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return regularP;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff STRING is in the NL trie as a regularly inflected PRED
    form.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff STRING is in the NL trie as a regularly inflected PRED\r\nform.")
    public static SubLObject nl_trie_regular_formP(final SubLObject string, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        assert NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) : "! lexicon_accessors.speech_part_predP(pred, .UNPROVIDED) " + ("lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) ") + pred;
        SubLObject regularP = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(entry) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) && (NIL != subl_promotions.memberP(pred, nl_trie.nl_trie_word_pos_preds(entry), nl_trie_accessors.$sym67$SPEC_POS_PRED_, UNPROVIDED))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(entry);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL == assertion_handles.assertion_p(support))) {
                            regularP = T;
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return regularP;
    }

    /**
     *
     *
     * @return 0; NIL or speech-part-pred? from NL-TRIE-WORD that entails (i.e. is a spec-pred of) SPEECH-PART-PREDICATE.
     * @return 1; NIL or listp of supports.
     * @unknown - Used in inference.
     */
    @LispMethod(comment = "@return 0; NIL or speech-part-pred? from NL-TRIE-WORD that entails (i.e. is a spec-pred of) SPEECH-PART-PREDICATE.\r\n@return 1; NIL or listp of supports.\r\n@unknown - Used in inference.")
    public static final SubLObject nl_trie_word_pred_and_supports_for_pred_alt(SubLObject nl_trie_word, SubLObject speech_part_predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entry_pred = NIL;
                SubLObject supports = NIL;
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                                {
                                    SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != entry_pred) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                                if (NIL != arguments.support_p(support)) {
                                                    if (NIL == entry_pred) {
                                                        {
                                                            SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                                            SubLObject pred = NIL;
                                                            for (pred = csome_list_var.first(); !((NIL != entry_pred) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                                if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                                                    entry_pred = pred;
                                                                    supports = cons(support, supports);
                                                                    if (!pred.equal(speech_part_predicate)) {
                                                                        supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
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
                } else {
                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                                    {
                                        SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != entry_pred) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                                    if (NIL != arguments.support_p(support)) {
                                                        if (NIL == entry_pred) {
                                                            {
                                                                SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                                                SubLObject pred = NIL;
                                                                for (pred = csome_list_var.first(); !((NIL != entry_pred) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                                    if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                                                        entry_pred = pred;
                                                                        supports = cons(support, supports);
                                                                        if (!pred.equal(speech_part_predicate)) {
                                                                            supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
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
                    } else {
                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                    if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                                        {
                                            SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word));
                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                            SubLObject state = NIL;
                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != entry_pred) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                                                {
                                                    SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                                        if (NIL != arguments.support_p(support)) {
                                                            if (NIL == entry_pred) {
                                                                {
                                                                    SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                                                    SubLObject pred = NIL;
                                                                    for (pred = csome_list_var.first(); !((NIL != entry_pred) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                                        if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                                                            entry_pred = pred;
                                                                            supports = cons(support, supports);
                                                                            if (!pred.equal(speech_part_predicate)) {
                                                                                supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                                    if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                                        {
                                            SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word));
                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                            SubLObject state = NIL;
                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != entry_pred) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                                                {
                                                    SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                                        if (NIL != arguments.support_p(support)) {
                                                            if (NIL == entry_pred) {
                                                                {
                                                                    SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                                                    SubLObject pred = NIL;
                                                                    for (pred = csome_list_var.first(); !((NIL != entry_pred) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                                        if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                                                            entry_pred = pred;
                                                                            supports = cons(support, supports);
                                                                            if (!pred.equal(speech_part_predicate)) {
                                                                                supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
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
                        }
                    }
                }
                return values(entry_pred, supports);
            }
        }
    }

    /**
     *
     *
     * @return 0; NIL or speech-part-pred? from NL-TRIE-WORD that entails (i.e. is a spec-pred of) SPEECH-PART-PREDICATE.
     * @return 1; NIL or listp of supports.
     * @unknown - Used in inference.
     */
    @LispMethod(comment = "@return 0; NIL or speech-part-pred? from NL-TRIE-WORD that entails (i.e. is a spec-pred of) SPEECH-PART-PREDICATE.\r\n@return 1; NIL or listp of supports.\r\n@unknown - Used in inference.")
    public static SubLObject nl_trie_word_pred_and_supports_for_pred(final SubLObject nl_trie_word, final SubLObject speech_part_predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry_pred = NIL;
        SubLObject supports = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(nl_trie_accessors.$$EverythingPSC, thread);
                if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == entry_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if (((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != arguments.support_p(support))) && (NIL == entry_pred)) {
                            csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                            pred = NIL;
                            pred = csome_list_var.first();
                            while ((NIL == entry_pred) && (NIL != csome_list_var)) {
                                if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                    entry_pred = pred;
                                    supports = cons(support, supports);
                                    if (!pred.equal(speech_part_predicate)) {
                                        supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            } 
                        }
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(nl_trie_accessors.$$InferencePSC, thread);
                    if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                        final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                        final SubLObject set_contents_var = set.do_set_internal(set_var);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject support;
                        SubLObject csome_list_var;
                        SubLObject pred;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == entry_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            support = set_contents.do_set_contents_next(basis_object, state);
                            if (((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != arguments.support_p(support))) && (NIL == entry_pred)) {
                                csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                pred = NIL;
                                pred = csome_list_var.first();
                                while ((NIL == entry_pred) && (NIL != csome_list_var)) {
                                    if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                        entry_pred = pred;
                                        supports = cons(support, supports);
                                        if (!pred.equal(speech_part_predicate)) {
                                            supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    pred = csome_list_var.first();
                                } 
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                            final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                            final SubLObject set_contents_var = set.do_set_internal(set_var);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject support;
                            SubLObject csome_list_var;
                            SubLObject pred;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == entry_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                support = set_contents.do_set_contents_next(basis_object, state);
                                if (((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != arguments.support_p(support))) && (NIL == entry_pred)) {
                                    csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                    pred = NIL;
                                    pred = csome_list_var.first();
                                    while ((NIL == entry_pred) && (NIL != csome_list_var)) {
                                        if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                            entry_pred = pred;
                                            supports = cons(support, supports);
                                            if (!pred.equal(speech_part_predicate)) {
                                                supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        pred = csome_list_var.first();
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        if (NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                            final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                            final SubLObject set_contents_var = set.do_set_internal(set_var);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject support;
                            SubLObject csome_list_var;
                            SubLObject pred;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == entry_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                support = set_contents.do_set_contents_next(basis_object, state);
                                if (((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != arguments.support_p(support))) && (NIL == entry_pred)) {
                                    csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                                    pred = NIL;
                                    pred = csome_list_var.first();
                                    while ((NIL == entry_pred) && (NIL != csome_list_var)) {
                                        if (NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                            entry_pred = pred;
                                            supports = cons(support, supports);
                                            if (!pred.equal(speech_part_predicate)) {
                                                supports = cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        pred = csome_list_var.first();
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return values(entry_pred, supports);
    }

    /**
     *
     *
     * @param entry;
    nl-trie-entry-p
     * 		
     * @param denot-list;
    listp
     * 		
     * @param pred-list;
    listp
     * 		
     * @param skip-constraints?;
    boolean
     * 		
     * @param abbrev-types;
    listp
     * 		
     * @param denot-type;
    keywordp
     * 		
     * @param skip-namestrings?;
    boolean
     * 		
     * @return 0 listp; denotations collected so far
     * @return 1 listp; name or syntactic predicate(s) used for each mapping
     */
    @LispMethod(comment = "@param entry;\nnl-trie-entry-p\r\n\t\t\r\n@param denot-list;\nlistp\r\n\t\t\r\n@param pred-list;\nlistp\r\n\t\t\r\n@param skip-constraints?;\nboolean\r\n\t\t\r\n@param abbrev-types;\nlistp\r\n\t\t\r\n@param denot-type;\nkeywordp\r\n\t\t\r\n@param skip-namestrings?;\nboolean\r\n\t\t\r\n@return 0 listp; denotations collected so far\r\n@return 1 listp; name or syntactic predicate(s) used for each mapping")
    public static final SubLObject add_new_entry_alt(SubLObject entry, SubLObject denot_list, SubLObject pred_list, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP) {
        if (skip_constraintsP == UNPROVIDED) {
            skip_constraintsP = NIL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != skip_constraintsP) || (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), abbrev_types, denot_type, skip_namestringsP))) {
                {
                    SubLObject new_denots = (denot_type == $SEMTRANS_TEMPLATE) ? ((SubLObject) (nl_trie.nl_trie_entry_semtrans_templates(entry))) : nl_trie.nl_trie_entry_denots(entry);
                    SubLObject new_preds = (NIL != new_denots) ? ((SubLObject) (make_list(list_length(new_denots), com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_entry_name_pred_or_syntactic_preds(entry)))) : NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject denot_list_37 = com.cyc.cycjava.cycl.nl_trie_accessors.add_new_denots_and_preds(new_denots, denot_list, new_preds, pred_list);
                        SubLObject pred_list_38 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denot_list = denot_list_37;
                        pred_list = pred_list_38;
                    }
                }
            }
            return values(denot_list, pred_list);
        }
    }

    /**
     *
     *
     * @param entry;
    nl-trie-entry-p
     * 		
     * @param denot-list;
    listp
     * 		
     * @param pred-list;
    listp
     * 		
     * @param skip-constraints?;
    boolean
     * 		
     * @param abbrev-types;
    listp
     * 		
     * @param denot-type;
    keywordp
     * 		
     * @param skip-namestrings?;
    boolean
     * 		
     * @return 0 listp; denotations collected so far
     * @return 1 listp; name or syntactic predicate(s) used for each mapping
     */
    @LispMethod(comment = "@param entry;\nnl-trie-entry-p\r\n\t\t\r\n@param denot-list;\nlistp\r\n\t\t\r\n@param pred-list;\nlistp\r\n\t\t\r\n@param skip-constraints?;\nboolean\r\n\t\t\r\n@param abbrev-types;\nlistp\r\n\t\t\r\n@param denot-type;\nkeywordp\r\n\t\t\r\n@param skip-namestrings?;\nboolean\r\n\t\t\r\n@return 0 listp; denotations collected so far\r\n@return 1 listp; name or syntactic predicate(s) used for each mapping")
    public static SubLObject add_new_entry(final SubLObject entry, SubLObject denot_list, SubLObject pred_list, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP) {
        if (skip_constraintsP == UNPROVIDED) {
            skip_constraintsP = NIL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != skip_constraintsP) || (NIL != nl_trie_accessors.pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), abbrev_types, denot_type, skip_namestringsP))) {
            final SubLObject new_denots = (denot_type == $SEMTRANS_TEMPLATE) ? nl_trie.nl_trie_entry_semtrans_templates(entry) : nl_trie.nl_trie_entry_denots(entry);
            final SubLObject new_preds = (NIL != new_denots) ? make_list(list_length(new_denots), nl_trie_accessors.nl_trie_entry_name_pred_or_syntactic_preds(entry)) : NIL;
            thread.resetMultipleValues();
            final SubLObject denot_list_$38 = nl_trie_accessors.add_new_denots_and_preds(new_denots, denot_list, new_preds, pred_list);
            final SubLObject pred_list_$39 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$38;
            pred_list = pred_list_$39;
        }
        return values(denot_list, pred_list);
    }

    public static final SubLObject nl_trie_entry_name_pred_or_syntactic_preds_alt(SubLObject entry) {
        if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
            return nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
        } else {
            if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                return nl_trie.nl_trie_entry_pos_preds(entry);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject nl_trie_entry_name_pred_or_syntactic_preds(final SubLObject entry) {
        if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
            return nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
        }
        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie.nl_trie_entry_pos_preds(entry);
        }
        return NIL;
    }

    /**
     *
     *
     * @param new-denots;
     * 		listp : new denotations to be added
     * @param denot-list;
     * 		listp : denotations collected so far
     * @param new-preds;
     * 		listp : semantic predicate(s) used for each new mapping
     * @param pred-list;
     * 		listp : semantic predicate(s) used for each mapping in DENOT-LIST
     * @return 0 listp; updated list of denotations collected so far
     * @return 1 listp; updated list of semantic predicate(s) used for each association
     */
    @LispMethod(comment = "@param new-denots;\r\n\t\tlistp : new denotations to be added\r\n@param denot-list;\r\n\t\tlistp : denotations collected so far\r\n@param new-preds;\r\n\t\tlistp : semantic predicate(s) used for each new mapping\r\n@param pred-list;\r\n\t\tlistp : semantic predicate(s) used for each mapping in DENOT-LIST\r\n@return 0 listp; updated list of denotations collected so far\r\n@return 1 listp; updated list of semantic predicate(s) used for each association")
    public static final SubLObject add_new_denots_and_preds_alt(SubLObject new_denots, SubLObject denot_list, SubLObject new_preds, SubLObject pred_list) {
        {
            SubLObject new_denot = NIL;
            SubLObject new_denot_39 = NIL;
            SubLObject new_name_pred_or_pos_preds = NIL;
            SubLObject new_name_pred_or_pos_preds_40 = NIL;
            for (new_denot = new_denots, new_denot_39 = new_denot.first(), new_name_pred_or_pos_preds = new_preds, new_name_pred_or_pos_preds_40 = new_name_pred_or_pos_preds.first(); !((NIL == new_name_pred_or_pos_preds) && (NIL == new_denot)); new_denot = new_denot.rest() , new_denot_39 = new_denot.first() , new_name_pred_or_pos_preds = new_name_pred_or_pos_preds.rest() , new_name_pred_or_pos_preds_40 = new_name_pred_or_pos_preds.first()) {
                {
                    SubLObject new_preds_41 = (new_name_pred_or_pos_preds_40.isList()) ? ((SubLObject) (new_name_pred_or_pos_preds_40)) : list(new_name_pred_or_pos_preds_40);
                    SubLObject cdolist_list_var = new_preds_41;
                    SubLObject new_pred = NIL;
                    for (new_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_pred = cdolist_list_var.first()) {
                        {
                            SubLObject index = position(new_denot_39, denot_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != index) {
                                if (NIL != new_pred) {
                                    {
                                        SubLObject item_var = new_pred;
                                        if (NIL == member(item_var, nth(index, pred_list), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            set_nth(index, pred_list, cons(item_var, nth(index, pred_list)));
                                        }
                                    }
                                }
                            } else {
                                denot_list = cons(new_denot_39, denot_list);
                                if (NIL != new_pred) {
                                    pred_list = cons(list(new_pred), pred_list);
                                } else {
                                    pred_list = cons(NIL, pred_list);
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param new-denots;
     * 		listp : new denotations to be added
     * @param denot-list;
     * 		listp : denotations collected so far
     * @param new-preds;
     * 		listp : semantic predicate(s) used for each new mapping
     * @param pred-list;
     * 		listp : semantic predicate(s) used for each mapping in DENOT-LIST
     * @return 0 listp; updated list of denotations collected so far
     * @return 1 listp; updated list of semantic predicate(s) used for each association
     */
    @LispMethod(comment = "@param new-denots;\r\n\t\tlistp : new denotations to be added\r\n@param denot-list;\r\n\t\tlistp : denotations collected so far\r\n@param new-preds;\r\n\t\tlistp : semantic predicate(s) used for each new mapping\r\n@param pred-list;\r\n\t\tlistp : semantic predicate(s) used for each mapping in DENOT-LIST\r\n@return 0 listp; updated list of denotations collected so far\r\n@return 1 listp; updated list of semantic predicate(s) used for each association")
    public static SubLObject add_new_denots_and_preds(final SubLObject new_denots, SubLObject denot_list, final SubLObject new_preds, SubLObject pred_list) {
        SubLObject new_denot = NIL;
        SubLObject new_denot_$40 = NIL;
        SubLObject new_name_pred_or_pos_preds = NIL;
        SubLObject new_name_pred_or_pos_preds_$41 = NIL;
        new_denot = new_denots;
        new_denot_$40 = new_denot.first();
        new_name_pred_or_pos_preds = new_preds;
        new_name_pred_or_pos_preds_$41 = new_name_pred_or_pos_preds.first();
        while ((NIL != new_name_pred_or_pos_preds) || (NIL != new_denot)) {
            SubLObject cdolist_list_var;
            final SubLObject new_preds_$42 = cdolist_list_var = (new_name_pred_or_pos_preds_$41.isList()) ? new_name_pred_or_pos_preds_$41 : list(new_name_pred_or_pos_preds_$41);
            SubLObject new_pred = NIL;
            new_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject index = position(new_denot_$40, denot_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != index) {
                    if (NIL != new_pred) {
                        final SubLObject item_var = new_pred;
                        if (NIL == member(item_var, nth(index, pred_list), symbol_function(EQL), symbol_function(IDENTITY))) {
                            set_nth(index, pred_list, cons(item_var, nth(index, pred_list)));
                        }
                    }
                } else {
                    denot_list = cons(new_denot_$40, denot_list);
                    if (NIL != new_pred) {
                        pred_list = cons(list(new_pred), pred_list);
                    } else {
                        pred_list = cons(NIL, pred_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_pred = cdolist_list_var.first();
            } 
            new_denot = new_denot.rest();
            new_denot_$40 = new_denot.first();
            new_name_pred_or_pos_preds = new_name_pred_or_pos_preds.rest();
            new_name_pred_or_pos_preds_$41 = new_name_pred_or_pos_preds.first();
        } 
        return values(denot_list, pred_list);
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param abbrev-types;
    listp
     * 		
     * @param denot-type;
    keywordp
     * 		
     * @param skip-namestrings?;
    boolean
     * 		
     * @return boolean : T if PRED passes the tests on abbreviation test, denotation test
    and name-string test, given ABBREV-TYPES, DENOT-TYPES and SKIP-NAMESTRINGS?;
    nil otherwise
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param abbrev-types;\nlistp\r\n\t\t\r\n@param denot-type;\nkeywordp\r\n\t\t\r\n@param skip-namestrings?;\nboolean\r\n\t\t\r\n@return boolean : T if PRED passes the tests on abbreviation test, denotation test\r\nand name-string test, given ABBREV-TYPES, DENOT-TYPES and SKIP-NAMESTRINGS?;\r\nnil otherwise")
    public static final SubLObject pred_type_okP_alt(SubLObject pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.nl_trie_accessors.abbrev_const_satisfiedP(pred, abbrev_types)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.denot_const_satisfiedP(pred, denot_type))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.namestring_const_satisfiedP(pred, skip_namestringsP)));
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param abbrev-types;
    listp
     * 		
     * @param denot-type;
    keywordp
     * 		
     * @param skip-namestrings?;
    boolean
     * 		
     * @return boolean : T if PRED passes the tests on abbreviation test, denotation test
    and name-string test, given ABBREV-TYPES, DENOT-TYPES and SKIP-NAMESTRINGS?;
    nil otherwise
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param abbrev-types;\nlistp\r\n\t\t\r\n@param denot-type;\nkeywordp\r\n\t\t\r\n@param skip-namestrings?;\nboolean\r\n\t\t\r\n@return boolean : T if PRED passes the tests on abbreviation test, denotation test\r\nand name-string test, given ABBREV-TYPES, DENOT-TYPES and SKIP-NAMESTRINGS?;\r\nnil otherwise")
    public static SubLObject pred_type_okP(final SubLObject pred, final SubLObject abbrev_types, final SubLObject denot_type, final SubLObject skip_namestringsP) {
        return makeBoolean(((NIL != nl_trie_accessors.abbrev_const_satisfiedP(pred, abbrev_types)) && (NIL != nl_trie_accessors.denot_const_satisfiedP(pred, denot_type))) && (NIL != nl_trie_accessors.namestring_const_satisfiedP(pred, skip_namestringsP)));
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param abbrev-types;
    listp
     * 		
     * @return boolean : T if PRED passes the abbreviation test, given ABBREV-TYPES;
    nil otherwise.
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param abbrev-types;\nlistp\r\n\t\t\r\n@return boolean : T if PRED passes the abbreviation test, given ABBREV-TYPES;\r\nnil otherwise.")
    public static final SubLObject abbrev_const_satisfiedP_alt(SubLObject pred, SubLObject abbrev_types) {
        if (NIL != subl_promotions.memberP(pred, lexicon_vars.acronym_predicates(), UNPROVIDED, UNPROVIDED)) {
            return NIL != subl_promotions.memberP($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
        } else {
            if (NIL != subl_promotions.memberP(pred, lexicon_vars.abbreviation_predicates(), symbol_function(EQUAL), UNPROVIDED)) {
                return NIL != subl_promotions.memberP($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
            } else {
                return T;
            }
        }
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param abbrev-types;
    listp
     * 		
     * @return boolean : T if PRED passes the abbreviation test, given ABBREV-TYPES;
    nil otherwise.
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param abbrev-types;\nlistp\r\n\t\t\r\n@return boolean : T if PRED passes the abbreviation test, given ABBREV-TYPES;\r\nnil otherwise.")
    public static SubLObject abbrev_const_satisfiedP(final SubLObject pred, final SubLObject abbrev_types) {
        if (NIL != subl_promotions.memberP(pred, lexicon_vars.acronym_predicates(), UNPROVIDED, UNPROVIDED)) {
            return NIL != subl_promotions.memberP($ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED) ? T : NIL;
        }
        if (NIL != subl_promotions.memberP(pred, lexicon_vars.abbreviation_predicates(), symbol_function(EQUAL), UNPROVIDED)) {
            return NIL != subl_promotions.memberP($ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED) ? T : NIL;
        }
        return T;
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param denot-type;
    keywordp
     * 		
     * @return boolean : T if PRED passes the denotation test, given DENOT-TYPE;
    nil otherwise.
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param denot-type;\nkeywordp\r\n\t\t\r\n@return boolean : T if PRED passes the denotation test, given DENOT-TYPE;\r\nnil otherwise.")
    public static final SubLObject denot_const_satisfiedP_alt(SubLObject pred, SubLObject denot_type) {
        if (NIL != subl_promotions.memberP(pred, $list_alt76, UNPROVIDED, UNPROVIDED)) {
            return subl_promotions.memberP(pred, lexicon_accessors.determine_denotation_preds(denot_type), UNPROVIDED, UNPROVIDED);
        } else {
            if (NIL != subl_promotions.memberP(pred, nl_trie.nl_trie_semtrans_predicates(), UNPROVIDED, UNPROVIDED)) {
                return eq(denot_type, $SEMTRANS_TEMPLATE);
            } else {
                return T;
            }
        }
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param denot-type;
    keywordp
     * 		
     * @return boolean : T if PRED passes the denotation test, given DENOT-TYPE;
    nil otherwise.
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param denot-type;\nkeywordp\r\n\t\t\r\n@return boolean : T if PRED passes the denotation test, given DENOT-TYPE;\r\nnil otherwise.")
    public static SubLObject denot_const_satisfiedP(final SubLObject pred, final SubLObject denot_type) {
        if (NIL != subl_promotions.memberP(pred, nl_trie_accessors.$list75, UNPROVIDED, UNPROVIDED)) {
            return subl_promotions.memberP(pred, lexicon_accessors.determine_denotation_preds(denot_type), UNPROVIDED, UNPROVIDED);
        }
        if (NIL != subl_promotions.memberP(pred, nl_trie.nl_trie_semtrans_predicates(), UNPROVIDED, UNPROVIDED)) {
            return eq(denot_type, $SEMTRANS_TEMPLATE);
        }
        return T;
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param skip-namestrings?;
    boolean
     * 		
     * @return boolean : T if PRED passes the name-string test, given SKIP-NAMESTRINGS?;
    nil otherwise.
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param skip-namestrings?;\nboolean\r\n\t\t\r\n@return boolean : T if PRED passes the name-string test, given SKIP-NAMESTRINGS?;\r\nnil otherwise.")
    public static final SubLObject namestring_const_satisfiedP_alt(SubLObject pred, SubLObject skip_namestringsP) {
        if (NIL != nl_trie.nl_trie_name_string_predP(pred)) {
            return makeBoolean(NIL == skip_namestringsP);
        } else {
            return T;
        }
    }

    /**
     *
     *
     * @param pred;
     * 		fort-p : semantic predicate
     * @param skip-namestrings?;
    boolean
     * 		
     * @return boolean : T if PRED passes the name-string test, given SKIP-NAMESTRINGS?;
    nil otherwise.
     */
    @LispMethod(comment = "@param pred;\r\n\t\tfort-p : semantic predicate\r\n@param skip-namestrings?;\nboolean\r\n\t\t\r\n@return boolean : T if PRED passes the name-string test, given SKIP-NAMESTRINGS?;\r\nnil otherwise.")
    public static SubLObject namestring_const_satisfiedP(final SubLObject pred, final SubLObject skip_namestringsP) {
        if (NIL != nl_trie.nl_trie_name_string_predP(pred)) {
            return makeBoolean(NIL == skip_namestringsP);
        }
        return T;
    }

    /**
     * Perform lexical lookup on WORDS using *NL-TRIE*.
     * Visibility is restricted to mts visible from *LEXICON-LOOKUP-MT*.
     * Start and end indexes are with respect to position in WORDS.
     *
     * @return LISTP of lists of tokens, same as @xref SENTENCE-TOKENIZE.
     * @unknown baxter
     */
    @LispMethod(comment = "Perform lexical lookup on WORDS using *NL-TRIE*.\r\nVisibility is restricted to mts visible from *LEXICON-LOOKUP-MT*.\r\nStart and end indexes are with respect to position in WORDS.\r\n\r\n@return LISTP of lists of tokens, same as @xref SENTENCE-TOKENIZE.\r\n@unknown baxter\nPerform lexical lookup on WORDS using *NL-TRIE*.\nVisibility is restricted to mts visible from *LEXICON-LOOKUP-MT*.\nStart and end indexes are with respect to position in WORDS.")
    public static final SubLObject nl_trie_sentence_tokenize_alt(SubLObject words, SubLObject output, SubLObject mode, SubLObject token_data, SubLObject starting_index, SubLObject case_sensitivity) {
        if (output == UNPROVIDED) {
            output = $STRING;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (token_data == UNPROVIDED) {
            token_data = symbol_function(IDENTITY);
        }
        if (starting_index == UNPROVIDED) {
            starting_index = ZERO_INTEGER;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject standardized_word_lists = nl_trie.nl_trie_standardize_strings(words);
                SubLObject alteration_lists = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject standardized_words = standardized_word_lists.first();
                    SubLObject alterations = alteration_lists.first();
                    SubLObject v_nl_trie = nl_trie.get_nl_trie();
                    SubLObject tokens = lexicon_utilities.sentence_tokenize(standardized_words, v_nl_trie, output, mode, token_data, starting_index);
                    if (output != $INTERVAL) {
                        return tokens;
                    }
                    tokens = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_remove_inappropriate_tokens(tokens);
                    if (!((case_sensitivity == $OFF) || (NIL != nl_trie.nl_trie_case_sensitive_p(v_nl_trie)))) {
                        {
                            SubLObject filtered_tokens = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_filter_tokens_for_case(tokens, standardized_words);
                            if ((case_sensitivity == $ON) || (NIL != list_utilities.non_empty_list_p(filtered_tokens))) {
                                tokens = filtered_tokens;
                            }
                        }
                    }
                    if (NIL != alterations) {
                        tokens = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_repair_token_indexes(tokens, alterations);
                    }
                    return Sort.sort(Sort.sort(tokens, symbol_function($sym80$_), INTERVAL_TOKEN_LENGTH), symbol_function($sym82$_), INTERVAL_TOKEN_START);
                }
            }
        }
    }

    @LispMethod(comment = "Perform lexical lookup on WORDS using *NL-TRIE*.\r\nVisibility is restricted to mts visible from *LEXICON-LOOKUP-MT*.\r\nStart and end indexes are with respect to position in WORDS.\r\n\r\n@return LISTP of lists of tokens, same as @xref SENTENCE-TOKENIZE.\r\n@unknown baxter\nPerform lexical lookup on WORDS using *NL-TRIE*.\nVisibility is restricted to mts visible from *LEXICON-LOOKUP-MT*.\nStart and end indexes are with respect to position in WORDS.")
    public static SubLObject nl_trie_sentence_tokenize(final SubLObject words, SubLObject output, SubLObject mode, SubLObject token_data, SubLObject starting_index, SubLObject case_sensitivity) {
        if (output == UNPROVIDED) {
            output = $STRING;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (token_data == UNPROVIDED) {
            token_data = symbol_function(IDENTITY);
        }
        if (starting_index == UNPROVIDED) {
            starting_index = ZERO_INTEGER;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject standardized_word_lists = nl_trie.nl_trie_standardize_strings(words);
        final SubLObject alteration_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject standardized_words = standardized_word_lists.first();
        final SubLObject alterations = alteration_lists.first();
        final SubLObject v_nl_trie = nl_trie.get_nl_trie();
        SubLObject tokens = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                tokens = lexicon_utilities.sentence_tokenize(standardized_words, v_nl_trie, output, mode, token_data, starting_index);
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        if (output != $INTERVAL) {
            return tokens;
        }
        tokens = nl_trie_accessors.nl_trie_remove_inappropriate_tokens(tokens);
        if ((case_sensitivity != $OFF) && (NIL == nl_trie.nl_trie_case_sensitive_p(v_nl_trie))) {
            final SubLObject filtered_tokens = nl_trie_accessors.nl_trie_filter_tokens_for_case(tokens, standardized_words);
            if ((case_sensitivity == $ON) || (NIL != list_utilities.non_empty_list_p(filtered_tokens))) {
                tokens = filtered_tokens;
            }
        }
        if (NIL != alterations) {
            tokens = nl_trie_accessors.nl_trie_repair_token_indexes(tokens, alterations);
        }
        return Sort.sort(Sort.sort(tokens, symbol_function(nl_trie_accessors.$sym79$_), nl_trie_accessors.INTERVAL_TOKEN_LENGTH), symbol_function(nl_trie_accessors.$sym81$_), nl_trie_accessors.INTERVAL_TOKEN_START);
    }/**
     * Perform lexical lookup on WORDS using *NL-TRIE*.
     * Visibility is restricted to mts visible from *LEXICON-LOOKUP-MT*.
     * Start and end indexes are with respect to position in WORDS.
     *
     * @return LISTP of lists of tokens, same as @xref SENTENCE-TOKENIZE.
     * @unknown baxter
     */


    public static final SubLObject nl_trie_filter_tokens_for_case_alt(SubLObject interval_tokens, SubLObject key) {
        {
            SubLObject cdolist_list_var = interval_tokens;
            SubLObject interval_token = NIL;
            for (interval_token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interval_token = cdolist_list_var.first()) {
                {
                    SubLObject start = standard_tokenization.interval_token_start(interval_token);
                    SubLObject end = standard_tokenization.interval_token_end(interval_token);
                    SubLObject subkey = strie.sequence_slice(key, start, end);
                    SubLObject s_token = standard_tokenization.interval_token_value(interval_token);
                    standard_tokenization.string_token_value_set(s_token, nl_trie.nl_trie_filter_entries_for_case(standard_tokenization.string_token_value(s_token), subkey));
                }
            }
        }
        return interval_tokens;
    }

    public static SubLObject nl_trie_filter_tokens_for_case(final SubLObject interval_tokens, final SubLObject key) {
        SubLObject cdolist_list_var = interval_tokens;
        SubLObject interval_token = NIL;
        interval_token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject start = standard_tokenization.interval_token_start(interval_token);
            final SubLObject end = standard_tokenization.interval_token_end(interval_token);
            final SubLObject subkey = strie.sequence_slice(key, start, end);
            final SubLObject s_token = standard_tokenization.interval_token_value(interval_token);
            standard_tokenization.string_token_value_set(s_token, nl_trie.nl_trie_filter_entries_for_case(standard_tokenization.string_token_value(s_token), subkey));
            cdolist_list_var = cdolist_list_var.rest();
            interval_token = cdolist_list_var.first();
        } 
        return interval_tokens;
    }

    public static final SubLObject nl_trie_remove_inappropriate_tokens_alt(SubLObject interval_tokens) {
        {
            SubLObject cdolist_list_var = interval_tokens;
            SubLObject interval_token = NIL;
            for (interval_token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interval_token = cdolist_list_var.first()) {
                {
                    SubLObject s_token = standard_tokenization.interval_token_value(interval_token);
                    standard_tokenization.string_token_value_set(s_token, com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_remove_inappropriate_entries(standard_tokenization.string_token_value(s_token), UNPROVIDED));
                }
            }
        }
        return interval_tokens;
    }

    public static SubLObject nl_trie_remove_inappropriate_tokens(final SubLObject interval_tokens) {
        SubLObject cdolist_list_var = interval_tokens;
        SubLObject interval_token = NIL;
        interval_token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject s_token = standard_tokenization.interval_token_value(interval_token);
            standard_tokenization.string_token_value_set(s_token, nl_trie_accessors.nl_trie_remove_inappropriate_entries(standard_tokenization.string_token_value(s_token), UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            interval_token = cdolist_list_var.first();
        } 
        return interval_tokens;
    }

    /**
     * Adjust the start and end indexes of TOKENS for ALTERATIONS.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Adjust the start and end indexes of TOKENS for ALTERATIONS.\r\n\r\n@unknown baxter")
    public static final SubLObject nl_trie_repair_token_indexes_alt(SubLObject tokens, SubLObject alterations) {
        {
            SubLObject adjustment_hash = make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
            SubLObject new_tokens = NIL;
            {
                SubLObject cdolist_list_var = alterations;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject index = NIL;
                        SubLObject num_tokens = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt84);
                        index = current.first();
                        current = current.rest();
                        num_tokens = current;
                        {
                            SubLObject old_value = gethash(index, adjustment_hash, ZERO_INTEGER);
                            SubLObject new_value = add(old_value, subtract(ONE_INTEGER, num_tokens));
                            sethash(index, adjustment_hash, new_value);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = tokens;
                SubLObject token = NIL;
                for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                    {
                        SubLObject start = standard_tokenization.interval_token_start(token);
                        SubLObject new_start = start;
                        SubLObject end = standard_tokenization.interval_token_end(token);
                        SubLObject new_end = end;
                        SubLObject value = standard_tokenization.interval_token_value(token);
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(start); i = add(i, ONE_INTEGER)) {
                                new_start = add(new_start, gethash(number_utilities.f_1X(i), adjustment_hash, ZERO_INTEGER));
                            }
                        }
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
                                new_end = add(new_end, gethash(i, adjustment_hash, ZERO_INTEGER));
                            }
                        }
                        new_tokens = cons(standard_tokenization.new_interval_token(new_start, new_end, value), new_tokens);
                    }
                }
            }
            return new_tokens;
        }
    }

    @LispMethod(comment = "Adjust the start and end indexes of TOKENS for ALTERATIONS.\r\n\r\n@unknown baxter")
    public static SubLObject nl_trie_repair_token_indexes(final SubLObject tokens, final SubLObject alterations) {
        final SubLObject adjustment_hash = make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject new_tokens = NIL;
        SubLObject cdolist_list_var = alterations;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject index = NIL;
            SubLObject num_tokens = NIL;
            destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list83);
            index = current.first();
            current = num_tokens = current.rest();
            final SubLObject old_value = gethash(index, adjustment_hash, ZERO_INTEGER);
            final SubLObject new_value = add(old_value, subtract(ONE_INTEGER, num_tokens));
            sethash(index, adjustment_hash, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_start;
            final SubLObject start = new_start = standard_tokenization.interval_token_start(token);
            SubLObject new_end;
            final SubLObject end = new_end = standard_tokenization.interval_token_end(token);
            final SubLObject value = standard_tokenization.interval_token_value(token);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(start); i = add(i, ONE_INTEGER)) {
                new_start = add(new_start, gethash(number_utilities.f_1X(i), adjustment_hash, ZERO_INTEGER));
            }
            for (i = NIL, i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
                new_end = add(new_end, gethash(i, adjustment_hash, ZERO_INTEGER));
            }
            new_tokens = cons(standard_tokenization.new_interval_token(new_start, new_end, value), new_tokens);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return new_tokens;
    }/**
     * Adjust the start and end indexes of TOKENS for ALTERATIONS.
     *
     * @unknown baxter
     */


    public static final SubLObject nl_trie_prefix_keys_from_string_alt(SubLObject trie, SubLObject string, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(trie, NL_TRIE_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_prefixes(trie, tokens, case_sensitivity);
        }
    }

    public static SubLObject nl_trie_prefix_keys_from_string(final SubLObject trie, final SubLObject string, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        assert NIL != nl_trie.nl_trie_p(trie, UNPROVIDED) : "! nl_trie.nl_trie_p(trie, .UNPROVIDED) " + ("nl_trie.nl_trie_p(trie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != nl_trie.nl_trie_p(trie, CommonSymbols.UNPROVIDED) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
        return nl_trie_accessors.nl_trie_prefixes(trie, tokens, case_sensitivity);
    }

    /**
     *
     *
     * @param TRIE
    nl-trie-p
     * 		
     * @param KEY
     * 		listp of strings.
     * @param CASE-SENSITIVITY;
     * 		keywordp - either :on (case-sensitive), :off (insensitive),
     * 		or :preferred (case-insensitive only if necessary).
     * @return list; the list of all records in STRIE in decreasing length that are indexed
    under a key which is a prefix of KEY
     */
    @LispMethod(comment = "@param TRIE\nnl-trie-p\r\n\t\t\r\n@param KEY\r\n\t\tlistp of strings.\r\n@param CASE-SENSITIVITY;\r\n\t\tkeywordp - either :on (case-sensitive), :off (insensitive),\r\n\t\tor :preferred (case-insensitive only if necessary).\r\n@return list; the list of all records in STRIE in decreasing length that are indexed\r\nunder a key which is a prefix of KEY")
    public static final SubLObject nl_trie_prefixes_alt(SubLObject trie, SubLObject key, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(trie, NL_TRIE_P);
            {
                SubLObject filtered_nodes = NIL;
                SubLObject quotedP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject standardized_keys = nl_trie.nl_trie_strings_keys(key);
                    SubLObject alteration_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject standardized_key = NIL;
                        SubLObject standardized_key_42 = NIL;
                        SubLObject alterations = NIL;
                        SubLObject alterations_43 = NIL;
                        for (standardized_key = standardized_keys, standardized_key_42 = standardized_key.first(), alterations = alteration_lists, alterations_43 = alterations.first(); !((NIL == alterations) && (NIL == standardized_key)); standardized_key = standardized_key.rest() , standardized_key_42 = standardized_key.first() , alterations = alterations.rest() , alterations_43 = alterations.first()) {
                            if ((NIL != list_utilities.singletonP(standardized_key_42)) && (NIL != string_utilities.quoted_stringP(standardized_key_42.first()))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject standardized_key_44 = nl_trie.nl_trie_string_tokenize(string_utilities.unquote_string(standardized_key_42.first()));
                                    SubLObject alterations_45 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    standardized_key_42 = standardized_key_44;
                                    alterations_43 = alterations_45;
                                }
                                quotedP = T;
                            }
                            {
                                SubLObject lock = nl_trie.$nl_trie_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    {
                                        SubLObject cdolist_list_var = strie.strie_prefixes(trie, standardized_key_42);
                                        SubLObject record = NIL;
                                        for (record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , record = cdolist_list_var.first()) {
                                            {
                                                SubLObject record_key = list_utilities.first_n(length(nl_trie.nl_trie_record_key(record)), standardized_key_42);
                                                SubLObject record_key_okP = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_prefix_key_jibes_with_alterationsP(record_key, alterations_43);
                                                SubLObject filtered_entries = (NIL != record_key_okP) ? ((SubLObject) (nl_trie.nl_trie_remove_invalid_entries(com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_remove_inappropriate_entries(nl_trie.nl_trie_record_entries(record), UNPROVIDED), trie, record_key))) : NIL;
                                                if (case_sensitivity == $OFF) {
                                                } else {
                                                    if (NIL != nl_trie.nl_trie_case_sensitive_p(trie)) {
                                                    } else {
                                                        if (NIL != member(case_sensitivity, $list_alt86, UNPROVIDED, UNPROVIDED)) {
                                                            {
                                                                SubLObject really_filtered = nl_trie.nl_trie_filter_entries_for_case(filtered_entries, record_key);
                                                                if ((case_sensitivity == $ON) || (NIL != list_utilities.non_empty_list_p(really_filtered))) {
                                                                    filtered_entries = really_filtered;
                                                                }
                                                            }
                                                        } else {
                                                            Errors.error($str_alt87$Invalid_case_sensitivity_value_fo, case_sensitivity);
                                                        }
                                                    }
                                                }
                                                if (NIL != quotedP) {
                                                    filtered_entries = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_filter_unquoted_entries(filtered_entries);
                                                }
                                                if (NIL != filtered_entries) {
                                                    if (NIL != alterations_43) {
                                                        record_key = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_find_original_prefix_key(length(record_key), key, alterations_43);
                                                    }
                                                    filtered_nodes = cons(nl_trie.new_nl_trie_record(record_key, filtered_entries), filtered_nodes);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(filtered_nodes);
            }
        }
    }

    /**
     *
     *
     * @param TRIE
    nl-trie-p
     * 		
     * @param KEY
     * 		listp of strings.
     * @param CASE-SENSITIVITY;
     * 		keywordp - either :on (case-sensitive), :off (insensitive),
     * 		or :preferred (case-insensitive only if necessary).
     * @return list; the list of all records in STRIE in decreasing length that are indexed
    under a key which is a prefix of KEY
     */
    @LispMethod(comment = "@param TRIE\nnl-trie-p\r\n\t\t\r\n@param KEY\r\n\t\tlistp of strings.\r\n@param CASE-SENSITIVITY;\r\n\t\tkeywordp - either :on (case-sensitive), :off (insensitive),\r\n\t\tor :preferred (case-insensitive only if necessary).\r\n@return list; the list of all records in STRIE in decreasing length that are indexed\r\nunder a key which is a prefix of KEY")
    public static SubLObject nl_trie_prefixes(final SubLObject trie, final SubLObject key, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != nl_trie.nl_trie_p(trie, UNPROVIDED) : "! nl_trie.nl_trie_p(trie, .UNPROVIDED) " + ("nl_trie.nl_trie_p(trie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != nl_trie.nl_trie_p(trie, CommonSymbols.UNPROVIDED) ") + trie;
        SubLObject filtered_nodes = NIL;
        SubLObject quotedP = NIL;
        thread.resetMultipleValues();
        final SubLObject standardized_keys = nl_trie.nl_trie_strings_keys(key);
        final SubLObject alteration_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject standardized_key = NIL;
        SubLObject standardized_key_$43 = NIL;
        SubLObject alterations = NIL;
        SubLObject alterations_$44 = NIL;
        standardized_key = standardized_keys;
        standardized_key_$43 = standardized_key.first();
        alterations = alteration_lists;
        alterations_$44 = alterations.first();
        while ((NIL != alterations) || (NIL != standardized_key)) {
            if ((NIL != list_utilities.singletonP(standardized_key_$43)) && (NIL != string_utilities.quoted_stringP(standardized_key_$43.first()))) {
                thread.resetMultipleValues();
                final SubLObject standardized_key_$44 = nl_trie.nl_trie_string_tokenize(string_utilities.unquote_string(standardized_key_$43.first()));
                final SubLObject alterations_$45 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                standardized_key_$43 = standardized_key_$44;
                alterations_$44 = alterations_$45;
                quotedP = T;
            }
            SubLObject release = NIL;
            try {
                release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    SubLObject cdolist_list_var = strie.strie_prefixes(trie, standardized_key_$43);
                    SubLObject record = NIL;
                    record = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject record_key = list_utilities.first_n(length(nl_trie.nl_trie_record_key(record)), standardized_key_$43);
                        final SubLObject record_key_okP = nl_trie_accessors.nl_trie_prefix_key_jibes_with_alterationsP(record_key, alterations_$44);
                        SubLObject filtered_entries = (NIL != record_key_okP) ? nl_trie.nl_trie_remove_invalid_entries(nl_trie_accessors.nl_trie_remove_inappropriate_entries(nl_trie.nl_trie_record_entries(record), UNPROVIDED), trie, record_key) : NIL;
                        if (case_sensitivity != $OFF) {
                            if (NIL == nl_trie.nl_trie_case_sensitive_p(trie)) {
                                if (NIL != member(case_sensitivity, nl_trie_accessors.$list85, UNPROVIDED, UNPROVIDED)) {
                                    final SubLObject really_filtered = nl_trie.nl_trie_filter_entries_for_case(filtered_entries, record_key);
                                    if ((case_sensitivity == $ON) || (NIL != list_utilities.non_empty_list_p(really_filtered))) {
                                        filtered_entries = really_filtered;
                                    }
                                } else {
                                    Errors.error(nl_trie_accessors.$str86$Invalid_case_sensitivity_value_fo, case_sensitivity);
                                }
                            }
                        }
                        if (NIL != quotedP) {
                            filtered_entries = nl_trie_accessors.nl_trie_filter_unquoted_entries(filtered_entries);
                        }
                        if (NIL != filtered_entries) {
                            if (NIL != alterations_$44) {
                                record_key = nl_trie_accessors.nl_trie_find_original_prefix_key(length(record_key), key, alterations_$44);
                            }
                            filtered_nodes = cons(nl_trie.new_nl_trie_record(record_key, filtered_entries), filtered_nodes);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        record = cdolist_list_var.first();
                    } 
                } finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
            standardized_key = standardized_key.rest();
            standardized_key_$43 = standardized_key.first();
            alterations = alterations.rest();
            alterations_$44 = alterations.first();
        } 
        return nreverse(filtered_nodes);
    }

    public static final SubLObject nl_trie_prefixes_memoized_internal_alt(SubLObject trie, SubLObject key, SubLObject case_sensitivity, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lexicon_lookup_mt, thread);
                        ans = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_prefixes(trie, key, case_sensitivity);
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject nl_trie_prefixes_memoized_internal(final SubLObject trie, final SubLObject key, final SubLObject case_sensitivity, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lexicon_lookup_mt, thread);
            ans = nl_trie_accessors.nl_trie_prefixes(trie, key, case_sensitivity);
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject nl_trie_prefixes_memoized_alt(SubLObject trie, SubLObject key, SubLObject case_sensitivity, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_prefixes_memoized_internal(trie, key, case_sensitivity, lexicon_lookup_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_PREFIXES_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_PREFIXES_MEMOIZED, FOUR_INTEGER, $int$512, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_PREFIXES_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(trie, key, case_sensitivity, lexicon_lookup_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw54$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (trie.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (key.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (case_sensitivity.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon_lookup_mt.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_prefixes_memoized_internal(trie, key, case_sensitivity, lexicon_lookup_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(trie, key, case_sensitivity, lexicon_lookup_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject nl_trie_prefixes_memoized(final SubLObject trie, final SubLObject key, final SubLObject case_sensitivity, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_accessors.nl_trie_prefixes_memoized_internal(trie, key, case_sensitivity, lexicon_lookup_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, nl_trie_accessors.NL_TRIE_PREFIXES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), nl_trie_accessors.NL_TRIE_PREFIXES_MEMOIZED, FOUR_INTEGER, $int$512, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, nl_trie_accessors.NL_TRIE_PREFIXES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(trie, key, case_sensitivity, lexicon_lookup_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (trie.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (key.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (case_sensitivity.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon_lookup_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_accessors.nl_trie_prefixes_memoized_internal(trie, key, case_sensitivity, lexicon_lookup_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(trie, key, case_sensitivity, lexicon_lookup_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject nl_trie_filter_unquoted_entries_alt(SubLObject entries) {
        {
            SubLObject filtered_entries = NIL;
            SubLObject cdolist_list_var = entries;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_unquoted_entry_okP(entry)) {
                    filtered_entries = cons(entry, filtered_entries);
                }
            }
            return nreverse(filtered_entries);
        }
    }

    public static SubLObject nl_trie_filter_unquoted_entries(final SubLObject entries) {
        SubLObject filtered_entries = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nl_trie_accessors.nl_trie_unquoted_entry_okP(entry)) {
                filtered_entries = cons(entry, filtered_entries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(filtered_entries);
    }

    public static final SubLObject nl_trie_unquoted_entry_okP_alt(SubLObject entry) {
        return makeBoolean((NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_entry_name_pred_or_syntactic_preds(entry), $$titleOfWork, UNPROVIDED)));
    }

    public static SubLObject nl_trie_unquoted_entry_okP(final SubLObject entry) {
        return makeBoolean((NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(nl_trie_accessors.nl_trie_entry_name_pred_or_syntactic_preds(entry), nl_trie_accessors.$$titleOfWork, UNPROVIDED)));
    }

    public static final SubLObject nl_trie_access_case_sensitive_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), $ON);
        }
    }

    public static SubLObject nl_trie_access_case_sensitive_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), $ON);
    }

    /**
     *
     *
     * @return BOOLEANP; Does PREFIX-KEY correspond to an original token that was standardized
    with ALTERATIONS? @xref NL-TRIE-STANDARDIZE-STRINGS.
     */
    @LispMethod(comment = "@return BOOLEANP; Does PREFIX-KEY correspond to an original token that was standardized\r\nwith ALTERATIONS? @xref NL-TRIE-STANDARDIZE-STRINGS.")
    public static final SubLObject nl_trie_prefix_key_jibes_with_alterationsP_alt(SubLObject prefix_key, SubLObject alterations) {
        if (NIL == alterations) {
            return T;
        }
        {
            SubLObject prefix_key_length = length(prefix_key);
            SubLObject largest_known_valid_length = ZERO_INTEGER;
            if (prefix_key_length.isZero()) {
                return T;
            }
            {
                SubLObject end_var = prefix_key_length;
                SubLObject original_token_num = NIL;
                for (original_token_num = ZERO_INTEGER; !original_token_num.numGE(end_var); original_token_num = number_utilities.f_1X(original_token_num)) {
                    {
                        SubLObject new_token_count = list_utilities.alist_lookup(alterations, original_token_num, symbol_function(EQL), ONE_INTEGER);
                        largest_known_valid_length = add(largest_known_valid_length, new_token_count);
                        if (prefix_key_length.eql(largest_known_valid_length)) {
                            return T;
                        } else {
                            if (largest_known_valid_length.numG(prefix_key_length)) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does PREFIX-KEY correspond to an original token that was standardized
    with ALTERATIONS? @xref NL-TRIE-STANDARDIZE-STRINGS.
     */
    @LispMethod(comment = "@return BOOLEANP; Does PREFIX-KEY correspond to an original token that was standardized\r\nwith ALTERATIONS? @xref NL-TRIE-STANDARDIZE-STRINGS.")
    public static SubLObject nl_trie_prefix_key_jibes_with_alterationsP(final SubLObject prefix_key, final SubLObject alterations) {
        if (NIL == alterations) {
            return T;
        }
        final SubLObject prefix_key_length = length(prefix_key);
        SubLObject largest_known_valid_length = ZERO_INTEGER;
        if (prefix_key_length.isZero()) {
            return T;
        }
        SubLObject end_var;
        SubLObject original_token_num;
        SubLObject new_token_count;
        for (end_var = prefix_key_length, original_token_num = NIL, original_token_num = ZERO_INTEGER; !original_token_num.numGE(end_var); original_token_num = number_utilities.f_1X(original_token_num)) {
            new_token_count = list_utilities.alist_lookup(alterations, original_token_num, symbol_function(EQL), ONE_INTEGER);
            largest_known_valid_length = add(largest_known_valid_length, new_token_count);
            if (prefix_key_length.eql(largest_known_valid_length)) {
                return T;
            }
            if (largest_known_valid_length.numG(prefix_key_length)) {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP; a (copied) initial sublist of ORIGINAL-STRINGS of length ENTRY-KEY-LENGTH,
    modulo ALTERATIONS. @xref NL-TRIE-STANDARDIZE-STRINGS.
     */
    @LispMethod(comment = "@return LISTP; a (copied) initial sublist of ORIGINAL-STRINGS of length ENTRY-KEY-LENGTH,\r\nmodulo ALTERATIONS. @xref NL-TRIE-STANDARDIZE-STRINGS.")
    public static final SubLObject nl_trie_find_original_prefix_key_alt(SubLObject entry_key_length, SubLObject original_strings, SubLObject alterations) {
        {
            SubLObject original_key = NIL;
            SubLObject entry_key_index = NIL;
            for (entry_key_index = ZERO_INTEGER; !entry_key_index.numGE(entry_key_length); entry_key_index = number_utilities.f_1X(entry_key_index)) {
                original_key = cons(nth(entry_key_index, original_strings), original_key);
                {
                    SubLObject alternation_length = list_utilities.alist_lookup(alterations, entry_key_index, symbol_function(EQL), ONE_INTEGER);
                    if (alternation_length.numG(ONE_INTEGER)) {
                        entry_key_length = subtract(entry_key_length, subtract(alternation_length, ONE_INTEGER));
                    }
                }
            }
            return nreverse(original_key);
        }
    }

    /**
     *
     *
     * @return LISTP; a (copied) initial sublist of ORIGINAL-STRINGS of length ENTRY-KEY-LENGTH,
    modulo ALTERATIONS. @xref NL-TRIE-STANDARDIZE-STRINGS.
     */
    @LispMethod(comment = "@return LISTP; a (copied) initial sublist of ORIGINAL-STRINGS of length ENTRY-KEY-LENGTH,\r\nmodulo ALTERATIONS. @xref NL-TRIE-STANDARDIZE-STRINGS.")
    public static SubLObject nl_trie_find_original_prefix_key(SubLObject entry_key_length, final SubLObject original_strings, final SubLObject alterations) {
        SubLObject original_key = NIL;
        SubLObject entry_key_index;
        SubLObject alternation_length;
        for (entry_key_index = NIL, entry_key_index = ZERO_INTEGER; !entry_key_index.numGE(entry_key_length); entry_key_index = number_utilities.f_1X(entry_key_index)) {
            original_key = cons(nth(entry_key_index, original_strings), original_key);
            alternation_length = list_utilities.alist_lookup(alterations, entry_key_index, symbol_function(EQL), ONE_INTEGER);
            if (alternation_length.numG(ONE_INTEGER)) {
                entry_key_length = subtract(entry_key_length, subtract(alternation_length, ONE_INTEGER));
            }
        }
        return nreverse(original_key);
    }

    /**
     *
     *
     * @param STRING
    string
     * 		
     * @param MT
    mt
     * 		
     * @return list; a list of one-word substrings of STRING that could
    not be found in the trie (from MT)
     */
    @LispMethod(comment = "@param STRING\nstring\r\n\t\t\r\n@param MT\nmt\r\n\t\t\r\n@return list; a list of one-word substrings of STRING that could\r\nnot be found in the trie (from MT)")
    public static final SubLObject nl_trie_unknown_strings_alt(SubLObject string, SubLObject mt, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            SubLObject tokens = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_unknown_string_tokens(string, mt, case_sensitivity);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                result = cons(standard_tokenization.string_token_string(standard_tokenization.interval_token_value(token)), result);
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @param STRING
    string
     * 		
     * @param MT
    mt
     * 		
     * @return list; a list of one-word substrings of STRING that could
    not be found in the trie (from MT)
     */
    @LispMethod(comment = "@param STRING\nstring\r\n\t\t\r\n@param MT\nmt\r\n\t\t\r\n@return list; a list of one-word substrings of STRING that could\r\nnot be found in the trie (from MT)")
    public static SubLObject nl_trie_unknown_strings(final SubLObject string, final SubLObject mt, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject tokens = nl_trie_accessors.nl_trie_unknown_string_tokens(string, mt, case_sensitivity);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(standard_tokenization.string_token_string(standard_tokenization.interval_token_value(token)), result);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @param STRING
    string
     * 		
     * @param MT
    mt
     * 		
     * @return list; a list of interval-tokens that correspond to one-word
    substrings of STRING that could not be found in the trie (from MT)
     * @unknown baxter
     */
    @LispMethod(comment = "@param STRING\nstring\r\n\t\t\r\n@param MT\nmt\r\n\t\t\r\n@return list; a list of interval-tokens that correspond to one-word\r\nsubstrings of STRING that could not be found in the trie (from MT)\r\n@unknown baxter")
    public static final SubLObject nl_trie_unknown_string_tokens_alt(SubLObject string, SubLObject mt, SubLObject case_sensitivity) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject word_list = standard_tokenization.standard_string_tokenize(string);
                SubLObject word_count = length(word_list);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
                        {
                            SubLObject starting_index = ZERO_INTEGER;
                            SubLObject interval_tokens = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_sentence_tokenize(word_list, $INTERVAL, $GREEDY, symbol_function(IDENTITY), starting_index, case_sensitivity);
                            SubLObject index = NIL;
                            for (index = ZERO_INTEGER; index.numL(word_count); index = add(index, ONE_INTEGER)) {
                                if (NIL == subl_promotions.memberP(index, interval_tokens, INDEX_COVERED_BY_TOKEN_P, UNPROVIDED)) {
                                    result = cons(standard_tokenization.new_interval_token(index, number_utilities.f_1X(index), standard_tokenization.new_string_token(nth(index, word_list), UNPROVIDED)), result);
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     *
     *
     * @param STRING
    string
     * 		
     * @param MT
    mt
     * 		
     * @return list; a list of interval-tokens that correspond to one-word
    substrings of STRING that could not be found in the trie (from MT)
     * @unknown baxter
     */
    @LispMethod(comment = "@param STRING\nstring\r\n\t\t\r\n@param MT\nmt\r\n\t\t\r\n@return list; a list of interval-tokens that correspond to one-word\r\nsubstrings of STRING that could not be found in the trie (from MT)\r\n@unknown baxter")
    public static SubLObject nl_trie_unknown_string_tokens(final SubLObject string, SubLObject mt, SubLObject case_sensitivity) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject word_list = standard_tokenization.standard_string_tokenize(string);
        final SubLObject word_count = length(word_list);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            final SubLObject starting_index = ZERO_INTEGER;
            final SubLObject interval_tokens = nl_trie_accessors.nl_trie_sentence_tokenize(word_list, $INTERVAL, $GREEDY, symbol_function(IDENTITY), starting_index, case_sensitivity);
            SubLObject index;
            for (index = NIL, index = ZERO_INTEGER; index.numL(word_count); index = add(index, ONE_INTEGER)) {
                if (NIL == subl_promotions.memberP(index, interval_tokens, nl_trie_accessors.INDEX_COVERED_BY_TOKEN_P, UNPROVIDED)) {
                    result = cons(standard_tokenization.new_interval_token(index, number_utilities.f_1X(index), standard_tokenization.new_string_token(nth(index, word_list), UNPROVIDED)), result);
                }
            }
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    /**
     *
     *
     * @return BOOLEAN; Does TOKEN include semantics for INDEX?
     */
    @LispMethod(comment = "@return BOOLEAN; Does TOKEN include semantics for INDEX?")
    public static final SubLObject index_covered_by_token_p_alt(SubLObject index, SubLObject token) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_token_has_meaning_p(token)) && index.numGE(standard_tokenization.interval_token_start(token))) && index.numL(standard_tokenization.interval_token_end(token)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does TOKEN include semantics for INDEX?
     */
    @LispMethod(comment = "@return BOOLEAN; Does TOKEN include semantics for INDEX?")
    public static SubLObject index_covered_by_token_p(final SubLObject index, final SubLObject token) {
        return makeBoolean(((NIL != nl_trie_accessors.nl_trie_token_has_meaning_p(token)) && index.numGE(standard_tokenization.interval_token_start(token))) && index.numL(standard_tokenization.interval_token_end(token)));
    }

    /**
     *
     *
     * @param TOKEN
    interval-token
     * 		
     * @return BOOLEAN; Does TOKEN have some meaning (denot)?
     */
    @LispMethod(comment = "@param TOKEN\ninterval-token\r\n\t\t\r\n@return BOOLEAN; Does TOKEN have some meaning (denot)?")
    public static final SubLObject nl_trie_token_has_meaning_p_alt(SubLObject token) {
        {
            SubLObject string_token = standard_tokenization.interval_token_value(token);
            return list_utilities.sublisp_boolean(standard_tokenization.string_token_value(string_token));
        }
    }

    /**
     *
     *
     * @param TOKEN
    interval-token
     * 		
     * @return BOOLEAN; Does TOKEN have some meaning (denot)?
     */
    @LispMethod(comment = "@param TOKEN\ninterval-token\r\n\t\t\r\n@return BOOLEAN; Does TOKEN have some meaning (denot)?")
    public static SubLObject nl_trie_token_has_meaning_p(final SubLObject token) {
        final SubLObject string_token = standard_tokenization.interval_token_value(token);
        return list_utilities.sublisp_boolean(standard_tokenization.string_token_value(string_token));
    }

    /**
     *
     *
     * @param misspellings?;
     * 		boolean - Do we allow misspellings?
     * @param nl-trie-entry;
    nl-trie-entry-p
     * 		
     * @return boolean : T if misspellings are to be included or the mt associated
    with NL-TRIE-ENTRY is not #$CommonEnglishMisspellingsMt;
    nil otherwise.
     */
    @LispMethod(comment = "@param misspellings?;\r\n\t\tboolean - Do we allow misspellings?\r\n@param nl-trie-entry;\nnl-trie-entry-p\r\n\t\t\r\n@return boolean : T if misspellings are to be included or the mt associated\r\nwith NL-TRIE-ENTRY is not #$CommonEnglishMisspellingsMt;\r\nnil otherwise.")
    public static final SubLObject spelling_const_satisfiedP_alt(SubLObject misspellingsP, SubLObject nl_trie_entry) {
        return makeBoolean((NIL != misspellingsP) || (!nl_trie.nl_trie_entry_mt(nl_trie_entry).eql($$CommonEnglishMisspellingsMt)));
    }

    /**
     *
     *
     * @param misspellings?;
     * 		boolean - Do we allow misspellings?
     * @param nl-trie-entry;
    nl-trie-entry-p
     * 		
     * @return boolean : T if misspellings are to be included or the mt associated
    with NL-TRIE-ENTRY is not #$CommonEnglishMisspellingsMt;
    nil otherwise.
     */
    @LispMethod(comment = "@param misspellings?;\r\n\t\tboolean - Do we allow misspellings?\r\n@param nl-trie-entry;\nnl-trie-entry-p\r\n\t\t\r\n@return boolean : T if misspellings are to be included or the mt associated\r\nwith NL-TRIE-ENTRY is not #$CommonEnglishMisspellingsMt;\r\nnil otherwise.")
    public static SubLObject spelling_const_satisfiedP(final SubLObject misspellingsP, final SubLObject nl_trie_entry) {
        return makeBoolean((NIL != misspellingsP) || (!nl_trie.nl_trie_entry_mt(nl_trie_entry).eql(nl_trie_accessors.$$CommonEnglishMisspellingsMt)));
    }

    public static final SubLObject contains_periodP_alt(SubLObject string) {
        return string_utilities.contains_charP(string, CHAR_period);
    }

    public static SubLObject contains_periodP(final SubLObject string) {
        return string_utilities.contains_charP(string, CHAR_period);
    }

    /**
     *
     *
     * @param contains-period?;
     * 		boolean: indicates whether the original search string contains a period
     * @param entry;
    nl-trie-word-entry-p
     * 		
     * @return boolean : whether the period constraint is satistied
     */
    @LispMethod(comment = "@param contains-period?;\r\n\t\tboolean: indicates whether the original search string contains a period\r\n@param entry;\nnl-trie-word-entry-p\r\n\t\t\r\n@return boolean : whether the period constraint is satistied")
    public static final SubLObject period_const_satisfiedP_alt(SubLObject contains_periodP, SubLObject entry, SubLObject string) {
        if (NIL == contains_periodP) {
            return T;
        } else {
            if (NIL != nl_trie.nl_trie_name_p(entry, T)) {
                {
                    SubLObject entry_string = nl_trie.nl_trie_name_string_macro_helper(entry);
                    if (string.equalp(entry_string)) {
                        return T;
                    }
                }
            } else {
                if (NIL != nl_trie.nl_trie_term_phrases_entry_p(entry, T)) {
                    {
                        SubLObject entry_string = assertions_high.gaf_arg3(entry);
                        if (string.equalp(entry_string)) {
                            return T;
                        }
                    }
                } else {
                    if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                        {
                            SubLObject head_string = nl_trie.nl_trie_word_head_string_macro_helper(entry);
                            SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_semantic_support_set(entry));
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject semantic_support = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                                        {
                                            SubLObject leading_strings = nl_trie.nl_trie_word_leading_strings_from_support_macro_helper(semantic_support);
                                            SubLObject following_strings = nl_trie.nl_trie_word_following_strings_from_support_macro_helper(semantic_support);
                                            SubLObject entry_string = nl_trie.nl_trie_assemble_strings_macro_helper(leading_strings, head_string, following_strings);
                                            if (string.equalp(entry_string)) {
                                                return T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (NIL != abstract_lexicon.lex_entry_p(entry)) {
                            {
                                SubLObject entry_string = nl_trie.nl_trie_lex_entry_get(entry, $STRING);
                                if (string.equalp(entry_string)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param contains-period?;
     * 		boolean: indicates whether the original search string contains a period
     * @param entry;
    nl-trie-word-entry-p
     * 		
     * @return boolean : whether the period constraint is satistied
     */
    @LispMethod(comment = "@param contains-period?;\r\n\t\tboolean: indicates whether the original search string contains a period\r\n@param entry;\nnl-trie-word-entry-p\r\n\t\t\r\n@return boolean : whether the period constraint is satistied")
    public static SubLObject period_const_satisfiedP(final SubLObject contains_periodP, final SubLObject entry, final SubLObject string) {
        if (NIL == contains_periodP) {
            return T;
        }
        if (NIL != nl_trie.nl_trie_name_p(entry, T)) {
            final SubLObject entry_string = nl_trie.nl_trie_name_string_macro_helper(entry);
            if (string.equalp(entry_string)) {
                return T;
            }
        } else
            if (NIL != nl_trie.nl_trie_term_phrases_entry_p(entry, T)) {
                final SubLObject entry_string = assertions_high.gaf_arg3(entry);
                if (string.equalp(entry_string)) {
                    return T;
                }
            } else
                if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                    final SubLObject head_string = nl_trie.nl_trie_word_head_string_macro_helper(entry);
                    final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set(entry);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject semantic_support;
                    SubLObject leading_strings;
                    SubLObject following_strings;
                    SubLObject entry_string2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        semantic_support = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                            leading_strings = nl_trie.nl_trie_word_leading_strings_from_support_macro_helper(semantic_support);
                            following_strings = nl_trie.nl_trie_word_following_strings_from_support_macro_helper(semantic_support);
                            entry_string2 = nl_trie.nl_trie_assemble_strings_macro_helper(leading_strings, head_string, following_strings);
                            if (string.equalp(entry_string2)) {
                                return T;
                            }
                        }
                    }
                } else
                    if (NIL != abstract_lexicon.lex_entry_p(entry)) {
                        final SubLObject entry_string = nl_trie.nl_trie_lex_entry_get(entry, $STRING);
                        if (string.equalp(entry_string)) {
                            return T;
                        }
                    }



        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Given that we're looking for PRED, is any of PREDS acceptable?
     */
    @LispMethod(comment = "@return BOOLEAN; Given that we\'re looking for PRED, is any of PREDS acceptable?")
    public static final SubLObject pos_pred_const_satisfiedP_alt(SubLObject pred, SubLObject preds) {
        return subl_promotions.memberP(pred, preds, $sym68$SPEC_POS_PRED_, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Given that we're looking for PRED, is any of PREDS acceptable?
     */
    @LispMethod(comment = "@return BOOLEAN; Given that we\'re looking for PRED, is any of PREDS acceptable?")
    public static SubLObject pos_pred_const_satisfiedP(final SubLObject pred, final SubLObject preds) {
        return subl_promotions.memberP(pred, preds, nl_trie_accessors.$sym67$SPEC_POS_PRED_, UNPROVIDED);
    }

    /**
     * Returns a reduced version of lexical record RECORD with only lexical words/names
     * that are visible from MT
     */
    @LispMethod(comment = "Returns a reduced version of lexical record RECORD with only lexical words/names\r\nthat are visible from MT\nReturns a reduced version of lexical record RECORD with only lexical words/names\nthat are visible from MT")
    public static final SubLObject nl_trie_record_filter_mt_alt(SubLObject record, SubLObject mt) {
        if (NIL != subl_promotions.memberP(mt, $list_alt93, UNPROVIDED, UNPROVIDED)) {
            return record;
        }
        {
            SubLObject entries = nl_trie.nl_trie_record_entries(record);
            SubLObject filtered = NIL;
            SubLObject cdolist_list_var = entries;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                {
                    SubLObject semantic_mt = nl_trie.nl_trie_entry_semantic_mt(entry);
                    SubLObject entry_mt = (NIL != semantic_mt) ? ((SubLObject) (semantic_mt)) : nl_trie.nl_trie_entry_mt(entry);
                    if (NIL != lexicon_accessors.genl_lexicon_mtP(mt, entry_mt)) {
                        filtered = cons(entry, filtered);
                    }
                }
            }
            return NIL != filtered ? ((SubLObject) (nl_trie.new_nl_trie_record(nl_trie.nl_trie_record_key(record), nreverse(filtered)))) : NIL;
        }
    }

    @LispMethod(comment = "Returns a reduced version of lexical record RECORD with only lexical words/names\r\nthat are visible from MT\nReturns a reduced version of lexical record RECORD with only lexical words/names\nthat are visible from MT")
    public static SubLObject nl_trie_record_filter_mt(final SubLObject record, final SubLObject mt) {
        if (NIL != subl_promotions.memberP(mt, nl_trie_accessors.$list92, UNPROVIDED, UNPROVIDED)) {
            return record;
        }
        final SubLObject entries = nl_trie.nl_trie_record_entries(record);
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject semantic_mt = nl_trie.nl_trie_entry_semantic_mt(entry);
            final SubLObject entry_mt = (NIL != semantic_mt) ? semantic_mt : nl_trie.nl_trie_entry_mt(entry);
            if (NIL != lexicon_accessors.genl_lexicon_mtP(mt, entry_mt)) {
                filtered = cons(entry, filtered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL != filtered ? nl_trie.new_nl_trie_record(nl_trie.nl_trie_record_key(record), nreverse(filtered)) : NIL;
    }/**
     * Returns a reduced version of lexical record RECORD with only lexical words/names
     * that are visible from MT
     */


    public static final SubLObject gated_nl_trie_search_alt(SubLObject string, SubLObject case_sensitivity, SubLObject semanticP) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (semanticP == UNPROVIDED) {
            semanticP = NIL;
        }
        {
            SubLObject ans = nl_trie.nl_trie_search(string, nl_trie.get_nl_trie(), case_sensitivity);
            if (NIL != list_utilities.non_empty_list_p(ans)) {
                ans = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_filter_pragmatics(ans, semanticP);
            }
            return (NIL != list_utilities.empty_list_p(ans)) && case_sensitivity.eql($PREFERRED) ? ((SubLObject) (com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, $OFF, UNPROVIDED))) : ans == $ABORTED ? ((SubLObject) (NIL)) : ans;
        }
    }

    public static SubLObject gated_nl_trie_search(final SubLObject string, SubLObject case_sensitivity, SubLObject semanticP) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (semanticP == UNPROVIDED) {
            semanticP = NIL;
        }
        SubLObject ans = nl_trie.nl_trie_search(string, nl_trie.get_nl_trie(), case_sensitivity);
        if (NIL != list_utilities.non_empty_list_p(ans)) {
            ans = nl_trie_accessors.nl_trie_filter_pragmatics(ans, semanticP);
        }
        return (NIL != list_utilities.empty_list_p(ans)) && case_sensitivity.eql($PREFERRED) ? nl_trie_accessors.gated_nl_trie_search(string, $OFF, UNPROVIDED) : ans == $ABORTED ? NIL : ans;
    }

    /**
     *
     *
     * @return LISTP of items in TRIE-ENTRIES that pass a pragmatic filter.
     */
    @LispMethod(comment = "@return LISTP of items in TRIE-ENTRIES that pass a pragmatic filter.")
    public static final SubLObject nl_trie_filter_pragmatics_alt(SubLObject trie_entries, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = NIL;
        }
        return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_remove_inappropriate_entries(trie_entries, semanticP);
    }

    /**
     *
     *
     * @return LISTP of items in TRIE-ENTRIES that pass a pragmatic filter.
     */
    @LispMethod(comment = "@return LISTP of items in TRIE-ENTRIES that pass a pragmatic filter.")
    public static SubLObject nl_trie_filter_pragmatics(final SubLObject trie_entries, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = NIL;
        }
        return nl_trie_accessors.nl_trie_remove_inappropriate_entries(trie_entries, semanticP);
    }

    /**
     *
     *
     * @return LISTP of those entries in TRIE-ENTRIES that are pragmatically appropriate.
     */
    @LispMethod(comment = "@return LISTP of those entries in TRIE-ENTRIES that are pragmatically appropriate.")
    public static final SubLObject nl_trie_remove_inappropriate_entries_alt(SubLObject trie_entries, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $nl_trie_check_semantic_mtP$.currentBinding(thread);
                    try {
                        $nl_trie_check_semantic_mtP$.bind(semanticP, thread);
                        ans = remove_if($sym96$NL_TRIE_INAPPROPRIATE_ENTRY_, trie_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $nl_trie_check_semantic_mtP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of those entries in TRIE-ENTRIES that are pragmatically appropriate.
     */
    @LispMethod(comment = "@return LISTP of those entries in TRIE-ENTRIES that are pragmatically appropriate.")
    public static SubLObject nl_trie_remove_inappropriate_entries(final SubLObject trie_entries, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = nl_trie_accessors.$nl_trie_check_semantic_mtP$.currentBinding(thread);
        try {
            nl_trie_accessors.$nl_trie_check_semantic_mtP$.bind(semanticP, thread);
            ans = remove_if(nl_trie_accessors.$sym95$NL_TRIE_INAPPROPRIATE_ENTRY_, trie_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            nl_trie_accessors.$nl_trie_check_semantic_mtP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     *
     *
     * @return BOOLEAN; Is TRIE-ENTRY to be considered inappropriate?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TRIE-ENTRY to be considered inappropriate?")
    public static final SubLObject nl_trie_inappropriate_entryP_alt(SubLObject trie_entry, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = $nl_trie_check_semantic_mtP$.getDynamicValue();
        }
        if ((NIL != lexicon_vars.active_pragmatic_filtersP()) && (NIL != list_utilities.find_if_not($sym97$PRAGMATICALLY_ACCEPTABLE_, nl_trie.nl_trie_entry_pragmatics(trie_entry), symbol_function(FIRST), UNPROVIDED, UNPROVIDED))) {
            return T;
        } else {
            if (NIL == com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_entry_mt_okP(trie_entry, semanticP)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is TRIE-ENTRY to be considered inappropriate?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TRIE-ENTRY to be considered inappropriate?")
    public static SubLObject nl_trie_inappropriate_entryP(final SubLObject trie_entry, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = nl_trie_accessors.$nl_trie_check_semantic_mtP$.getDynamicValue();
        }
        if ((NIL != lexicon_vars.active_lexicon_filtersP()) && (NIL != list_utilities.find_if_not(nl_trie_accessors.$sym96$PRAGMATICALLY_ACCEPTABLE_, nl_trie.nl_trie_entry_pragmatics(trie_entry), symbol_function(FIRST), UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (NIL == nl_trie_accessors.nl_trie_entry_mt_okP(trie_entry, semanticP)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject nl_trie_entry_mt_okP_alt(SubLObject entry, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = $nl_trie_check_semantic_mtP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entry_mt = (NIL != semanticP) ? ((SubLObject) (nl_trie.nl_trie_entry_semantic_mt(entry))) : nl_trie.nl_trie_entry_mt(entry);
                return makeBoolean((NIL == entry_mt) || (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), entry_mt)));
            }
        }
    }

    public static SubLObject nl_trie_entry_mt_okP(final SubLObject entry, SubLObject semanticP) {
        if (semanticP == UNPROVIDED) {
            semanticP = nl_trie_accessors.$nl_trie_check_semantic_mtP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry_mt = (NIL != semanticP) ? nl_trie.nl_trie_entry_semantic_mt(entry) : nl_trie.nl_trie_entry_mt(entry);
        return makeBoolean((NIL == entry_mt) || (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), entry_mt)));
    }

    /**
     *
     *
     * @return STRINGP; a string that matches STRING according to the string-equality test of
    the NL trie, preferably one that is already used in the trie.
     */
    @LispMethod(comment = "@return STRINGP; a string that matches STRING according to the string-equality test of\r\nthe NL trie, preferably one that is already used in the trie.")
    public static final SubLObject nl_trie_string_to_use_alt(SubLObject string) {
        {
            SubLObject node = map_utilities.map_get_without_values(nl_trie.get_nl_trie(), string, UNPROVIDED);
            SubLObject existing_string = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_match_string(string, node);
            return NIL != existing_string ? ((SubLObject) (existing_string)) : string;
        }
    }

    /**
     *
     *
     * @return STRINGP; a string that matches STRING according to the string-equality test of
    the NL trie, preferably one that is already used in the trie.
     */
    @LispMethod(comment = "@return STRINGP; a string that matches STRING according to the string-equality test of\r\nthe NL trie, preferably one that is already used in the trie.")
    public static SubLObject nl_trie_string_to_use(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                final SubLObject node = map_utilities.map_get_without_values(nl_trie.get_nl_trie(), string, UNPROVIDED);
                final SubLObject existing_string = nl_trie_accessors.nl_trie_match_string(string, node);
                result = (NIL != existing_string) ? existing_string : string;
            } finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static final SubLObject nl_trie_match_string_alt(SubLObject string, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (node.isCons()) {
                    ans = node.first().first();
                    if (ans.isString() && (ans != string)) {
                    }
                } else {
                    if (NIL != map_utilities.map_p(node)) {
                        {
                            SubLObject iterator = map_utilities.new_map_iterator(node);
                            SubLObject done_var = ans;
                            while (NIL == done_var) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject var = iteration.iteration_next(iterator);
                                    SubLObject valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        {
                                            SubLObject datum = var;
                                            SubLObject current = datum;
                                            SubLObject key = NIL;
                                            SubLObject subnode = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt99);
                                            key = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt99);
                                            subnode = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                {
                                                    SubLObject result = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_match_string(string, subnode);
                                                    if (NIL != funcall(strie.strie_test(nl_trie.get_nl_trie()), result, string)) {
                                                        ans = result;
                                                    } else {
                                                        if (result.isString()) {
                                                            Errors.warn($str_alt100$Found_non_matching_string___S_vs_, result, string);
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt99);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                }
                            } 
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject nl_trie_match_string(final SubLObject string, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (node.isCons()) {
            ans = node.first().first();
            if (ans.isString() && (!ans.eql(string))) {
            }
        } else
            if (NIL != map_utilities.map_p(node)) {
                final SubLObject iterator = map_utilities.new_map_iterator(node);
                SubLObject valid;
                for (SubLObject done_var = ans; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != ans))) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = NIL;
                        SubLObject subnode = NIL;
                        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list98);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list98);
                        subnode = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject result = nl_trie_accessors.nl_trie_match_string(string, subnode);
                            if (NIL != funcall(strie.strie_test(nl_trie.get_nl_trie()), result, string)) {
                                ans = result;
                            } else
                                if (result.isString()) {
                                    Errors.warn(nl_trie_accessors.$str99$Found_non_matching_string___S_vs_, result, string);
                                }

                        } else {
                            cdestructuring_bind_error(datum, nl_trie_accessors.$list98);
                        }
                    }
                }
            }

        return ans;
    }

    public static final SubLObject do_supporting_trie_words_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt101);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject support = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    support = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_46 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt101);
                            current_46 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt101);
                            if (NIL == member(current_46, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_46 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt101);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject asent = $sym103$ASENT;
                                SubLObject mt = $sym104$MT;
                                return list(CLET, list(list(asent, list(SUPPORT_SENTENCE, support)), list(mt, list(SUPPORT_MT, support))), list(DO_NL_TRIE_WORD_ENTRIES_FOR_STRING, list(word, list(ATOMIC_SENTENCE_ARG2, asent), mt), listS(PWHEN, list(CAND, list(CNOT, done), list($sym110$MATCHING_WORD_STRINGS_ENTRY_, word, asent)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_supporting_trie_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject support = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list100);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list100);
        support = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$47 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list100);
            current_$47 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, nl_trie_accessors.$list100);
            if (NIL == member(current_$47, nl_trie_accessors.$list101, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$47 == nl_trie_accessors.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list100);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject asent = nl_trie_accessors.$sym102$ASENT;
        final SubLObject mt = nl_trie_accessors.$sym103$MT;
        return list(CLET, list(list(asent, list(SUPPORT_SENTENCE, support)), list(mt, list(SUPPORT_MT, support))), list(nl_trie_accessors.DO_NL_TRIE_WORD_ENTRIES_FOR_STRING, list(word, list(nl_trie_accessors.ATOMIC_SENTENCE_ARG2, asent), mt), listS(PWHEN, list(CAND, list(CNOT, done), list(nl_trie_accessors.$sym109$MATCHING_WORD_STRINGS_ENTRY_, word, asent)), append(body, NIL))));
    }

    public static final SubLObject matching_word_strings_entryP_alt(SubLObject entry, SubLObject asent) {
        {
            SubLObject okP = NIL;
            SubLObject datum = cycl_utilities.formula_terms(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject pos_pred = NIL;
            SubLObject word = NIL;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            pos_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt112);
            word = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt112);
            string = current.first();
            current = current.rest();
            if (NIL == current) {
                if (word.equal(nl_trie.nl_trie_word_word_unit(entry, NIL)) && string.equal(nl_trie.nl_trie_entry_string(entry))) {
                    if (NIL == okP) {
                        {
                            SubLObject csome_list_var = nl_trie.nl_trie_entry_pos_preds(entry);
                            SubLObject entry_pos_pred = NIL;
                            for (entry_pos_pred = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , entry_pos_pred = csome_list_var.first()) {
                                okP = lexicon_accessors.genl_pos_predP(entry_pos_pred, pos_pred, UNPROVIDED);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt112);
            }
            return okP;
        }
    }

    public static SubLObject matching_word_strings_entryP(final SubLObject entry, final SubLObject asent) {
        SubLObject okP = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject pos_pred = NIL;
        SubLObject word = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list111);
        pos_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list111);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list111);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((word.equal(nl_trie.nl_trie_word_word_unit(entry, NIL)) && string.equal(nl_trie.nl_trie_entry_string(entry))) && (NIL == okP)) {
                SubLObject csome_list_var;
                SubLObject entry_pos_pred;
                for (csome_list_var = nl_trie.nl_trie_entry_pos_preds(entry), entry_pos_pred = NIL, entry_pos_pred = csome_list_var.first(); (NIL == okP) && (NIL != csome_list_var); okP = lexicon_accessors.genl_pos_predP(entry_pos_pred, pos_pred, UNPROVIDED) , csome_list_var = csome_list_var.rest() , entry_pos_pred = csome_list_var.first()) {
                }
            }
        } else {
            cdestructuring_bind_error(datum, nl_trie_accessors.$list111);
        }
        return okP;
    }

    public static final SubLObject nl_trie_hl_justify_word_strings_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                SubLObject trie_support_pos_pred = NIL;
                SubLObject asent = arguments.support_sentence(support);
                SubLObject mt = arguments.support_mt(support);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
                            SubLObject cdolist_list_var = entries;
                            SubLObject trie_word = NIL;
                            for (trie_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trie_word = cdolist_list_var.first()) {
                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(trie_word) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)), trie_word, cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), trie_word))) {
                                    if ((NIL == supports) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.matching_word_strings_entryP(trie_word, asent))) {
                                        {
                                            SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(trie_word));
                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                            SubLObject state = NIL;
                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                {
                                                    SubLObject trie_word_support = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, trie_word_support)) {
                                                        if (NIL != arguments.support_p(trie_word_support)) {
                                                            supports = cons(trie_word_support, supports);
                                                            trie_support_pos_pred = arguments.support_sentence_operator(trie_word_support);
                                                        } else {
                                                            if (NIL != nl_trie.nl_trie_word_hl_syntactic_support_p(trie_word_support, UNPROVIDED)) {
                                                                supports = nl_trie.nl_trie_justify_hl_syntactic_support(trie_word_support);
                                                                trie_support_pos_pred = cycl_utilities.formula_arg0(trie_word_support.first());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != trie_support_pos_pred) {
                    {
                        SubLObject support_pred = arguments.support_sentence_operator(support);
                        if (!support_pred.equal(trie_support_pos_pred)) {
                            supports = cons(removal_module_utilities.make_genl_preds_support(trie_support_pos_pred, support_pred), supports);
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject nl_trie_hl_justify_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject trie_support_pos_pred = NIL;
        final SubLObject asent = arguments.support_sentence(support);
        final SubLObject mt = arguments.support_mt(support);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
            SubLObject trie_word = NIL;
            trie_word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(trie_word) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)), trie_word, cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), trie_word))) && (NIL == supports)) && (NIL != nl_trie_accessors.matching_word_strings_entryP(trie_word, asent))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject trie_word_support;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        trie_word_support = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, trie_word_support)) {
                            if (NIL != arguments.support_p(trie_word_support)) {
                                supports = cons(trie_word_support, supports);
                                trie_support_pos_pred = arguments.support_sentence_operator(trie_word_support);
                            } else
                                if (NIL != nl_trie.nl_trie_word_hl_syntactic_support_p(trie_word_support, UNPROVIDED)) {
                                    supports = nl_trie.nl_trie_justify_hl_syntactic_support(trie_word_support);
                                    trie_support_pos_pred = cycl_utilities.formula_arg0(trie_word_support.first());
                                }

                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                trie_word = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != trie_support_pos_pred) {
            final SubLObject support_pred = arguments.support_sentence_operator(support);
            if (!support_pred.equal(trie_support_pos_pred)) {
                supports = cons(removal_module_utilities.make_genl_preds_support(trie_support_pos_pred, support_pred), supports);
            }
        }
        return supports;
    }

    public static final SubLObject nl_trie_hl_forward_mt_combos_word_strings_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                SubLObject mts = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject el_sentence = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt113);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt113);
                el_sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt113);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt113);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = mt;
                        if (pcase_var.eql($$InferencePSC)) {
                            {
                                SubLObject asent = arguments.support_sentence(support);
                                SubLObject mt_47 = arguments.support_mt(support);
                                {
                                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                                    try {
                                        lexicon_vars.$lexicon_lookup_mt$.bind(mt_47, thread);
                                        {
                                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), com.cyc.cycjava.cycl.lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
                                            SubLObject cdolist_list_var = entries;
                                            SubLObject trie_word = NIL;
                                            for (trie_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trie_word = cdolist_list_var.first()) {
                                                if (((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(trie_word) == $WORD)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)), trie_word, cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), trie_word))) {
                                                    if (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.matching_word_strings_entryP(trie_word, asent)) {
                                                        {
                                                            SubLObject item_var = nl_trie.nl_trie_entry_mt(trie_word);
                                                            if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                mts = cons(item_var, mts);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            supports = list(support);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
                        SubLObject mt_48 = NIL;
                        for (mt_48 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_48 = cdolist_list_var.first()) {
                            supports = cons(arguments.make_hl_support(hl_module, el_sentence, mt_48, tv), supports);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt113);
                }
                return supports;
            }
        }
    }

    public static SubLObject nl_trie_hl_forward_mt_combos_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject mts = NIL;
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, nl_trie_accessors.$list112);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, nl_trie_accessors.$list112);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, nl_trie_accessors.$list112);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, nl_trie_accessors.$list112);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = mt;
            if (pcase_var.eql(nl_trie_accessors.$$InferencePSC)) {
                final SubLObject asent = arguments.support_sentence(support);
                final SubLObject mt_$48 = arguments.support_mt(support);
                final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(mt_$48, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), NIL);
                    SubLObject trie_word = NIL;
                    trie_word = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((($ANY == $WORD) || (nl_trie.nl_trie_entry_type(trie_word) == $WORD)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)), trie_word, cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), trie_word))) && (NIL != nl_trie_accessors.matching_word_strings_entryP(trie_word, asent))) {
                            final SubLObject item_var = nl_trie.nl_trie_entry_mt(trie_word);
                            if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                mts = cons(item_var, mts);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        trie_word = cdolist_list_var.first();
                    } 
                } finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                supports = list(support);
            }
            SubLObject cdolist_list_var2 = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
            SubLObject mt_$49 = NIL;
            mt_$49 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                supports = cons(arguments.make_hl_support(hl_module, el_sentence, mt_$49, tv), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$49 = cdolist_list_var2.first();
            } 
        } else {
            cdestructuring_bind_error(support, nl_trie_accessors.$list112);
        }
        return supports;
    }

    public static final SubLObject nl_trie_get_term_phrases_supports_alt(SubLObject denot, SubLObject string, SubLObject term_phrases_constraint, SubLObject case_insensitiveP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
                        {
                            SubLObject entries = com.cyc.cycjava.cycl.nl_trie_accessors.gated_nl_trie_search(string, NIL != case_insensitiveP ? ((SubLObject) ($OFF)) : $ON, T);
                            SubLObject cdolist_list_var = entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (((($ANY == $ANY) || (nl_trie.nl_trie_entry_type(entry) == $ANY)) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.period_const_satisfiedP(com.cyc.cycjava.cycl.nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) {
                                    if (((NIL != set.empty_set_p(supports)) && (NIL != subl_promotions.memberP(denot, nl_trie.nl_trie_entry_denots(entry), symbol_function($sym114$EQUALS_EL_), UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_entry_matches_term_phrases_constraintP(entry, term_phrases_constraint, mt))) {
                                        com.cyc.cycjava.cycl.nl_trie_accessors.add_nl_trie_supports(entry, supports, denot, term_phrases_constraint, mt);
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return set.set_element_list(supports);
            }
        }
    }

    public static SubLObject nl_trie_get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject term_phrases_constraint, final SubLObject case_insensitiveP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supports = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = nl_trie_accessors.gated_nl_trie_search(string, NIL != case_insensitiveP ? $OFF : $ON, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((((($ANY == $ANY) || (nl_trie.nl_trie_entry_type(entry) == $ANY)) && (NIL != nl_trie_accessors.period_const_satisfiedP(nl_trie_accessors.contains_periodP(string), entry, string))) && (NIL != nl_trie_accessors.spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry))) && (NIL != set.empty_set_p(supports))) && (NIL != subl_promotions.memberP(denot, nl_trie.nl_trie_entry_denots(entry), symbol_function(nl_trie_accessors.$sym113$EQUALS_EL_), UNPROVIDED))) && (NIL != nl_trie_accessors.nl_trie_entry_matches_term_phrases_constraintP(entry, term_phrases_constraint, mt))) {
                    nl_trie_accessors.add_nl_trie_supports(entry, supports, denot, term_phrases_constraint, mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(supports);
    }

    public static final SubLObject add_nl_trie_supports_alt(SubLObject entry, SubLObject supports, SubLObject denot, SubLObject term_phrases_constraint, SubLObject mt) {
        if ((NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) && (NIL != arguments.support_p(entry))) {
            {
                SubLObject support_pred = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                if (((NIL != fort_types_interface.isa_predicateP(term_phrases_constraint, mt)) && (!support_pred.eql(term_phrases_constraint))) && (NIL != genl_predicates.genl_predicateP(support_pred, term_phrases_constraint, mt, UNPROVIDED))) {
                    set.set_add(removal_module_utilities.make_genl_preds_support(support_pred, term_phrases_constraint), supports);
                }
            }
            set.set_add(entry, supports);
        } else {
            if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                {
                    SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_semantic_support_set(entry));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                if (NIL != subl_promotions.memberP(denot, nl_trie.nl_trie_word_semantic_support_denots(support, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED)) {
                                    set.set_add(support, supports);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject pos_pred = NIL;
                    SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_syntactic_support_set(entry));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject support = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                                {
                                    SubLObject support_pred = nl_trie.nl_trie_word_support_predicate(support);
                                    SubLObject speech_part_predP = lexicon_accessors.speech_part_predP(support_pred, mt);
                                    if (!((NIL != speech_part_predP) && (NIL != pos_pred))) {
                                        if (((NIL != speech_part_predP) && (!support_pred.eql(term_phrases_constraint))) && (NIL != genl_predicates.genl_predicateP(support_pred, term_phrases_constraint, mt, UNPROVIDED))) {
                                            set.set_add(removal_module_utilities.make_genl_preds_support(support_pred, term_phrases_constraint), supports);
                                        }
                                        if (NIL != arguments.support_p(support)) {
                                            set.set_add(support, supports);
                                        } else {
                                            if (NIL != nl_trie.nl_trie_word_hl_syntactic_support_p(support, UNPROVIDED)) {
                                                set_utilities.set_add_all(nl_trie.nl_trie_justify_hl_syntactic_support(support), supports);
                                            }
                                        }
                                        if (NIL != speech_part_predP) {
                                            pos_pred = support_pred;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return supports;
    }

    public static SubLObject add_nl_trie_supports(final SubLObject entry, final SubLObject supports, final SubLObject denot, final SubLObject term_phrases_constraint, final SubLObject mt) {
        if ((NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) && (NIL != arguments.support_p(entry))) {
            final SubLObject support_pred = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
            if (((NIL != fort_types_interface.isa_predicateP(term_phrases_constraint, mt)) && (!support_pred.eql(term_phrases_constraint))) && (NIL != genl_predicates.genl_predicateP(support_pred, term_phrases_constraint, mt, UNPROVIDED))) {
                set.set_add(removal_module_utilities.make_genl_preds_support(support_pred, term_phrases_constraint), supports);
            }
            set.set_add(entry, supports);
        } else
            if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set(entry);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject support;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    support = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != subl_promotions.memberP(denot, nl_trie.nl_trie_word_semantic_support_denots(support, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED))) {
                        set.set_add(support, supports);
                    }
                }
                SubLObject pos_pred = NIL;
                final SubLObject set_var2 = nl_trie.nl_trie_word_syntactic_support_set(entry);
                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject support2;
                SubLObject support_pred2;
                SubLObject speech_part_predP;
                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                    support2 = set_contents.do_set_contents_next(basis_object2, state2);
                    if (NIL != set_contents.do_set_contents_element_validP(state2, support2)) {
                        support_pred2 = nl_trie.nl_trie_word_support_predicate(support2);
                        speech_part_predP = lexicon_accessors.speech_part_predP(support_pred2, mt);
                        if ((NIL == speech_part_predP) || (NIL == pos_pred)) {
                            if (((NIL != speech_part_predP) && (!support_pred2.eql(term_phrases_constraint))) && (NIL != genl_predicates.genl_predicateP(support_pred2, term_phrases_constraint, mt, UNPROVIDED))) {
                                set.set_add(removal_module_utilities.make_genl_preds_support(support_pred2, term_phrases_constraint), supports);
                            }
                            if (NIL != arguments.support_p(support2)) {
                                set.set_add(support2, supports);
                            } else
                                if (NIL != nl_trie.nl_trie_word_hl_syntactic_support_p(support2, UNPROVIDED)) {
                                    set_utilities.set_add_all(nl_trie.nl_trie_justify_hl_syntactic_support(support2), supports);
                                }

                            if (NIL != speech_part_predP) {
                                pos_pred = support_pred2;
                            }
                        }
                    }
                }
            }

        return supports;
    }

    public static final SubLObject nl_trie_entry_matches_term_phrases_constraintP_alt(SubLObject entry, SubLObject term_phrases_constraint, SubLObject mt) {
        if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
            return makeBoolean((NIL != nl_trie.nl_trie_name_string_predP(term_phrases_constraint)) && (NIL != genl_predicates.genl_predicateP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), term_phrases_constraint, mt, UNPROVIDED)));
        } else {
            if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.speech_partP(term_phrases_constraint, mt))) {
                return lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), term_phrases_constraint, mt);
            } else {
                if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.speech_part_predP(term_phrases_constraint, mt))) {
                    {
                        SubLObject csome_list_var = nl_trie.nl_trie_word_pos_preds(entry);
                        SubLObject entry_pred = NIL;
                        for (entry_pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , entry_pred = csome_list_var.first()) {
                            if (NIL != lexicon_accessors.genl_pos_predP(entry_pred, term_phrases_constraint, mt)) {
                                return T;
                            }
                        }
                    }
                    return NIL;
                } else {
                    if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != nl_trie.nl_trie_name_string_predP(term_phrases_constraint))) {
                        return NIL;
                    } else {
                        Errors.sublisp_break($str_alt115$Don_t_know_how_to_check__S_agains, new SubLObject[]{ term_phrases_constraint, entry });
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_matches_term_phrases_constraintP(final SubLObject entry, final SubLObject term_phrases_constraint, final SubLObject mt) {
        if (NIL != member(term_phrases_constraint, nl_trie_accessors.$list114, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
            return makeBoolean((((NIL != nl_trie.nl_trie_name_string_predP(term_phrases_constraint)) && (NIL != genl_predicates.genl_predicateP(nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED), term_phrases_constraint, mt, UNPROVIDED))) || (NIL != genls.genlP(nl_trie_accessors.$$NounPhrase, term_phrases_constraint, mt, UNPROVIDED))) || (NIL != genls.genlP(nl_trie_accessors.$$ProperNameString, term_phrases_constraint, mt, UNPROVIDED)));
        }
        if (NIL != genls.genlP(term_phrases_constraint, nl_trie_accessors.$$NLPhrase, mt, UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(term_phrases_constraint, nl_trie_accessors.$$phrase_Bar1, mt, TWO_INTEGER, UNPROVIDED))) {
            return nl_trie_accessors.nl_trie_entry_matches_term_phrases_constraintP(entry, kb_mapping_utilities.fpred_value_in_relevant_mts(term_phrases_constraint, nl_trie_accessors.$$phrase_Bar1, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), mt);
        }
        if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.speech_partP(term_phrases_constraint, mt))) {
            return lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), term_phrases_constraint, mt);
        }
        if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.speech_part_predP(term_phrases_constraint, mt))) {
            SubLObject csome_list_var = nl_trie.nl_trie_word_pos_preds(entry);
            SubLObject entry_pred = NIL;
            entry_pred = csome_list_var.first();
            while (NIL != csome_list_var) {
                if (NIL != lexicon_accessors.genl_pos_predP(entry_pred, term_phrases_constraint, mt)) {
                    return T;
                }
                csome_list_var = csome_list_var.rest();
                entry_pred = csome_list_var.first();
            } 
            return NIL;
        }
        if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != nl_trie.nl_trie_name_string_predP(term_phrases_constraint))) {
            return NIL;
        }
        Errors.error(nl_trie_accessors.$str119$Don_t_know_how_to_check__S_agains, term_phrases_constraint, entry);
        return NIL;
    }

    /**
     * Return all rotated versions of STRING using the nl-trie based stoplist
     */
    @LispMethod(comment = "Return all rotated versions of STRING using the nl-trie based stoplist")
    public static final SubLObject nl_trie_rotations_alt(SubLObject string) {
        if (!string.isString()) {
            Errors.warn($str_alt119$tried_to_determine_rotations_for_, string);
            return NIL;
        }
        return string_utilities.string_rotations(string, $nl_trie_stoplist_trie$.getGlobalValue(), $nl_trie_rotate_characters$.getGlobalValue(), $nl_trie_rotate_point_string$.getGlobalValue(), UNPROVIDED);
    }

    @LispMethod(comment = "Return all rotated versions of STRING using the nl-trie based stoplist")
    public static SubLObject nl_trie_rotations(final SubLObject string) {
        if (!string.isString()) {
            Errors.warn(nl_trie_accessors.$str123$tried_to_determine_rotations_for_, string);
            return NIL;
        }
        return string_utilities.string_rotations(string, nl_trie_accessors.$nl_trie_stoplist_trie$.getGlobalValue(), nl_trie_accessors.$nl_trie_rotate_characters$.getGlobalValue(), nl_trie_accessors.$nl_trie_rotate_point_string$.getGlobalValue(), UNPROVIDED);
    }/**
     * Return all rotated versions of STRING using the nl-trie based stoplist
     */


    public static final SubLObject nl_trie_index_item_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.nl_trie_accessors.print_nl_trie_index_item(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject nl_trie_index_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        nl_trie_accessors.print_nl_trie_index_item(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject nl_trie_index_item_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject nl_trie_index_item_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native.class ? T : NIL;
    }

    public static final SubLObject nl_trie_index_item_term_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NL_TRIE_INDEX_ITEM_P);
        return v_object.getField2();
    }

    public static SubLObject nl_trie_index_item_term(final SubLObject v_object) {
        assert NIL != nl_trie_accessors.nl_trie_index_item_p(v_object) : "! nl_trie_accessors.nl_trie_index_item_p(v_object) " + "nl_trie_accessors.nl_trie_index_item_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject nl_trie_index_item_phrase_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NL_TRIE_INDEX_ITEM_P);
        return v_object.getField3();
    }

    public static SubLObject nl_trie_index_item_phrase(final SubLObject v_object) {
        assert NIL != nl_trie_accessors.nl_trie_index_item_p(v_object) : "! nl_trie_accessors.nl_trie_index_item_p(v_object) " + "nl_trie_accessors.nl_trie_index_item_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject nl_trie_index_item_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NL_TRIE_INDEX_ITEM_P);
        return v_object.getField4();
    }

    public static SubLObject nl_trie_index_item_mt(final SubLObject v_object) {
        assert NIL != nl_trie_accessors.nl_trie_index_item_p(v_object) : "! nl_trie_accessors.nl_trie_index_item_p(v_object) " + "nl_trie_accessors.nl_trie_index_item_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_nl_trie_index_item_term_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NL_TRIE_INDEX_ITEM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_nl_trie_index_item_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != nl_trie_accessors.nl_trie_index_item_p(v_object) : "! nl_trie_accessors.nl_trie_index_item_p(v_object) " + "nl_trie_accessors.nl_trie_index_item_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nl_trie_index_item_phrase_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NL_TRIE_INDEX_ITEM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_nl_trie_index_item_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != nl_trie_accessors.nl_trie_index_item_p(v_object) : "! nl_trie_accessors.nl_trie_index_item_p(v_object) " + "nl_trie_accessors.nl_trie_index_item_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nl_trie_index_item_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NL_TRIE_INDEX_ITEM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_nl_trie_index_item_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != nl_trie_accessors.nl_trie_index_item_p(v_object) : "! nl_trie_accessors.nl_trie_index_item_p(v_object) " + "nl_trie_accessors.nl_trie_index_item_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_nl_trie_index_item_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TERM)) {
                        com.cyc.cycjava.cycl.nl_trie_accessors._csetf_nl_trie_index_item_term(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PHRASE)) {
                            com.cyc.cycjava.cycl.nl_trie_accessors._csetf_nl_trie_index_item_phrase(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MT)) {
                                com.cyc.cycjava.cycl.nl_trie_accessors._csetf_nl_trie_index_item_mt(v_new, current_value);
                            } else {
                                Errors.error($str_alt137$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_nl_trie_index_item(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.nl_trie_accessors.$nl_trie_index_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TERM)) {
                nl_trie_accessors._csetf_nl_trie_index_item_term(v_new, current_value);
            } else
                if (pcase_var.eql($PHRASE)) {
                    nl_trie_accessors._csetf_nl_trie_index_item_phrase(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        nl_trie_accessors._csetf_nl_trie_index_item_mt(v_new, current_value);
                    } else {
                        Errors.error(nl_trie_accessors.$str142$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_nl_trie_index_item(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, nl_trie_accessors.MAKE_NL_TRIE_INDEX_ITEM, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TERM, nl_trie_accessors.nl_trie_index_item_term(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASE, nl_trie_accessors.nl_trie_index_item_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, nl_trie_accessors.nl_trie_index_item_mt(obj));
        funcall(visitor_fn, obj, $END, nl_trie_accessors.MAKE_NL_TRIE_INDEX_ITEM, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_nl_trie_index_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return nl_trie_accessors.visit_defstruct_nl_trie_index_item(obj, visitor_fn);
    }

    /**
     *
     *
     * @return nl-trie-index-item : new structure initialized to TERM and MT
     */
    @LispMethod(comment = "@return nl-trie-index-item : new structure initialized to TERM and MT")
    public static final SubLObject new_nl_trie_index_item_alt(SubLObject v_term, SubLObject phrase, SubLObject mt) {
        {
            SubLObject new_item = com.cyc.cycjava.cycl.nl_trie_accessors.make_nl_trie_index_item(UNPROVIDED);
            com.cyc.cycjava.cycl.nl_trie_accessors._csetf_nl_trie_index_item_term(new_item, v_term);
            com.cyc.cycjava.cycl.nl_trie_accessors._csetf_nl_trie_index_item_phrase(new_item, phrase);
            com.cyc.cycjava.cycl.nl_trie_accessors._csetf_nl_trie_index_item_mt(new_item, mt);
            return new_item;
        }
    }

    /**
     *
     *
     * @return nl-trie-index-item : new structure initialized to TERM and MT
     */
    @LispMethod(comment = "@return nl-trie-index-item : new structure initialized to TERM and MT")
    public static SubLObject new_nl_trie_index_item(final SubLObject v_term, final SubLObject phrase, final SubLObject mt) {
        final SubLObject new_item = nl_trie_accessors.make_nl_trie_index_item(UNPROVIDED);
        nl_trie_accessors._csetf_nl_trie_index_item_term(new_item, v_term);
        nl_trie_accessors._csetf_nl_trie_index_item_phrase(new_item, phrase);
        nl_trie_accessors._csetf_nl_trie_index_item_mt(new_item, mt);
        return new_item;
    }

    public static final SubLObject print_nl_trie_index_item_alt(SubLObject item, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt138$_NL_TRIE_INDEX_ITEM__s__s__a_, new SubLObject[]{ com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_index_item_term(item), com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_index_item_phrase(item), com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_index_item_mt(item) });
        return item;
    }

    public static SubLObject print_nl_trie_index_item(final SubLObject item, final SubLObject stream, final SubLObject depth) {
        format(stream, nl_trie_accessors.$str148$_NL_TRIE_INDEX_ITEM__s__s__a_, new SubLObject[]{ nl_trie_accessors.nl_trie_index_item_term(item), nl_trie_accessors.nl_trie_index_item_phrase(item), nl_trie_accessors.nl_trie_index_item_mt(item) });
        return item;
    }

    /**
     *
     *
     * @return list ; nl-trie-index-item structures extracted from NL-TRIE-DATA
     */
    @LispMethod(comment = "@return list ; nl-trie-index-item structures extracted from NL-TRIE-DATA")
    public static final SubLObject extract_nl_trie_indexing_data_alt(SubLObject phrase, SubLObject nl_trie_data) {
        {
            SubLObject nl_trie_index_items = NIL;
            SubLObject cdolist_list_var = nl_trie_data;
            SubLObject nl_trie_entry = NIL;
            for (nl_trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nl_trie_entry = cdolist_list_var.first()) {
                nl_trie_index_items = cconcatenate(nl_trie_index_items, com.cyc.cycjava.cycl.nl_trie_accessors.extract_nl_trie_indexing_data_from_entry(phrase, nl_trie_entry));
            }
            return nl_trie_index_items;
        }
    }

    /**
     *
     *
     * @return list ; nl-trie-index-item structures extracted from NL-TRIE-DATA
     */
    @LispMethod(comment = "@return list ; nl-trie-index-item structures extracted from NL-TRIE-DATA")
    public static SubLObject extract_nl_trie_indexing_data(final SubLObject phrase, final SubLObject nl_trie_data) {
        SubLObject nl_trie_index_items = NIL;
        SubLObject cdolist_list_var = nl_trie_data;
        SubLObject nl_trie_entry = NIL;
        nl_trie_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            nl_trie_index_items = cconcatenate(nl_trie_index_items, nl_trie_accessors.extract_nl_trie_indexing_data_from_entry(phrase, nl_trie_entry));
            cdolist_list_var = cdolist_list_var.rest();
            nl_trie_entry = cdolist_list_var.first();
        } 
        return nl_trie_index_items;
    }

    public static final SubLObject extract_nl_trie_indexing_data_from_entry_alt(SubLObject phrase, SubLObject nl_trie_entry) {
        {
            SubLObject result = NIL;
            SubLObject mt = nl_trie.nl_trie_entry_mt(nl_trie_entry);
            if (NIL != nl_trie.nl_trie_name_p(nl_trie_entry, T)) {
                {
                    SubLObject denot = nl_trie.nl_trie_name_denot(nl_trie_entry);
                    result = cons(com.cyc.cycjava.cycl.nl_trie_accessors.new_nl_trie_index_item(denot, phrase, mt), result);
                }
            } else {
                if (NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, T)) {
                    {
                        SubLObject denot = assertions_high.gaf_arg1(nl_trie_entry);
                        result = cons(com.cyc.cycjava.cycl.nl_trie_accessors.new_nl_trie_index_item(denot, phrase, mt), result);
                    }
                } else {
                    if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
                        {
                            SubLObject pred = nl_trie.nl_trie_word_sem_pred(nl_trie_entry, NIL);
                            SubLObject denot_arg = (NIL != indexed_term_p(pred)) ? ((SubLObject) (lexicon_utilities.denotatum_arg_of_pred_cached(pred))) : NIL;
                            if (denot_arg.isInteger()) {
                                {
                                    SubLObject set_contents_var = set.do_set_internal(nl_trie.nl_trie_word_semantic_support_set(nl_trie_entry));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject semantic_support = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                                                {
                                                    SubLObject cdolist_list_var = nl_trie.nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                                                    SubLObject denot = NIL;
                                                    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                        result = cons(com.cyc.cycjava.cycl.nl_trie_accessors.new_nl_trie_index_item(denot, phrase, mt), result);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
                            {
                                SubLObject cdolist_list_var = nl_trie.nl_trie_lex_entry_get(nl_trie_entry, $DENOTS);
                                SubLObject denot = NIL;
                                for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                    result = cons(com.cyc.cycjava.cycl.nl_trie_accessors.new_nl_trie_index_item(denot, phrase, mt), result);
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject extract_nl_trie_indexing_data_from_entry(final SubLObject phrase, final SubLObject nl_trie_entry) {
        SubLObject result = NIL;
        final SubLObject mt = nl_trie.nl_trie_entry_mt(nl_trie_entry);
        if (NIL != nl_trie.nl_trie_name_p(nl_trie_entry, T)) {
            final SubLObject denot = nl_trie.nl_trie_name_denot(nl_trie_entry);
            result = cons(nl_trie_accessors.new_nl_trie_index_item(denot, phrase, mt), result);
        } else
            if (NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, T)) {
                final SubLObject denot = assertions_high.gaf_arg1(nl_trie_entry);
                result = cons(nl_trie_accessors.new_nl_trie_index_item(denot, phrase, mt), result);
            } else
                if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
                    final SubLObject pred = nl_trie.nl_trie_word_sem_pred(nl_trie_entry, NIL);
                    final SubLObject denot_arg = (NIL != indexed_term_p(pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(pred) : NIL;
                    if (denot_arg.isInteger()) {
                        final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set(nl_trie_entry);
                        final SubLObject set_contents_var = set.do_set_internal(set_var);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject semantic_support;
                        SubLObject cdolist_list_var;
                        SubLObject denot2;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            semantic_support = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                                cdolist_list_var = nl_trie.nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                                denot2 = NIL;
                                denot2 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    result = cons(nl_trie_accessors.new_nl_trie_index_item(denot2, phrase, mt), result);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    denot2 = cdolist_list_var.first();
                                } 
                            }
                        }
                    }
                } else
                    if (NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
                        SubLObject cdolist_list_var2 = nl_trie.nl_trie_lex_entry_get(nl_trie_entry, $DENOTS);
                        SubLObject denot3 = NIL;
                        denot3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            result = cons(nl_trie_accessors.new_nl_trie_index_item(denot3, phrase, mt), result);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            denot3 = cdolist_list_var2.first();
                        } 
                    }



        return result;
    }

    public static final SubLObject force_nl_trie_rotation_index_initialization_alt(SubLObject max_num) {
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        $nl_trie_rotation_index$.setGlobalValue(NIL);
        return com.cyc.cycjava.cycl.nl_trie_accessors.initialize_nl_trie_rotation_index(max_num);
    }

    public static SubLObject force_nl_trie_rotation_index_initialization(SubLObject max_num) {
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        nl_trie_accessors.$nl_trie_rotation_index$.setGlobalValue(NIL);
        return nl_trie_accessors.initialize_nl_trie_rotation_index(max_num);
    }

    /**
     * Initializes data structures used for NL trie rotation index
     */
    @LispMethod(comment = "Initializes data structures used for NL trie rotation index")
    public static final SubLObject initialize_nl_trie_rotation_index_alt(SubLObject max_num) {
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (NIL == com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_rotation_index_initializedP()) {
            $nl_trie_stoplist_trie$.setGlobalValue(tries.create_trie(T, $$$nl_trie_rotation_stop_list, T, symbol_function(EQL)));
            {
                SubLObject cdolist_list_var = lexicon_accessors.closed_lexical_class_strings(UNPROVIDED);
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    tries.trie_insert($nl_trie_stoplist_trie$.getGlobalValue(), word, word, UNPROVIDED, UNPROVIDED);
                }
            }
            $nl_trie_rotation_index$.setGlobalValue(com.cyc.cycjava.cycl.nl_trie_accessors.create_nl_trie_rotation_index(max_num, UNPROVIDED));
        }
        return T;
    }

    @LispMethod(comment = "Initializes data structures used for NL trie rotation index")
    public static SubLObject initialize_nl_trie_rotation_index(SubLObject max_num) {
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (NIL == nl_trie_accessors.nl_trie_rotation_index_initializedP()) {
            nl_trie_accessors.$nl_trie_stoplist_trie$.setGlobalValue(tries.create_trie(T, nl_trie_accessors.$$$nl_trie_rotation_stop_list, T, symbol_function(EQL)));
            SubLObject cdolist_list_var = lexicon_accessors.closed_lexical_class_strings(UNPROVIDED);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tries.trie_insert(nl_trie_accessors.$nl_trie_stoplist_trie$.getGlobalValue(), word, word, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            nl_trie_accessors.$nl_trie_rotation_index$.setGlobalValue(nl_trie_accessors.create_nl_trie_rotation_index(max_num, UNPROVIDED));
        }
        return T;
    }/**
     * Initializes data structures used for NL trie rotation index
     */


    /**
     *
     *
     * @return boolean ; whether *nl-trie-rotation-index* has been initialized
     */
    @LispMethod(comment = "@return boolean ; whether *nl-trie-rotation-index* has been initialized")
    public static final SubLObject nl_trie_rotation_index_initializedP_alt() {
        return makeBoolean((NIL != tries.trie_p($nl_trie_rotation_index$.getGlobalValue())) && tries.trie_count($nl_trie_rotation_index$.getGlobalValue()).numG(ZERO_INTEGER));
    }

    /**
     *
     *
     * @return boolean ; whether *nl-trie-rotation-index* has been initialized
     */
    @LispMethod(comment = "@return boolean ; whether *nl-trie-rotation-index* has been initialized")
    public static SubLObject nl_trie_rotation_index_initializedP() {
        return makeBoolean((NIL != tries.trie_p(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue())) && tries.trie_count(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue()).numG(ZERO_INTEGER));
    }

    /**
     *
     *
     * @return boolean ; whether we believe *nl-trie-rotation-index* can been initialized
     */
    @LispMethod(comment = "@return boolean ; whether we believe *nl-trie-rotation-index* can been initialized")
    public static final SubLObject nl_trie_rotation_index_initialization_practical_p_alt() {
        return T;
    }

    /**
     *
     *
     * @return boolean ; whether we believe *nl-trie-rotation-index* can been initialized
     */
    @LispMethod(comment = "@return boolean ; whether we believe *nl-trie-rotation-index* can been initialized")
    public static SubLObject nl_trie_rotation_index_initialization_practical_p() {
        return T;
    }

    /**
     *
     *
     * @return trie ; trie with rotation-index created from NL-TRIE
     */
    @LispMethod(comment = "@return trie ; trie with rotation-index created from NL-TRIE")
    public static final SubLObject create_nl_trie_rotation_index_alt(SubLObject max_num, SubLObject v_nl_trie) {
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = nl_trie.get_nl_trie();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject trie_index = tries.create_trie(NIL, $$$nl_trie_rotation_index, T, symbol_function(EQUALP));
                SubLObject max_count = (NIL != max_num) ? ((SubLObject) (max_num)) : nl_trie.nl_trie_size(v_nl_trie);
                SubLObject gc_every = integerDivide(max_count, TEN_INTEGER);
                SubLObject count = ZERO_INTEGER;
                SubLObject stop = NIL;
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        {
                            SubLObject lock = nl_trie.$nl_trie_lock$.getGlobalValue();
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock);
                                {
                                    SubLObject _prev_bind_0_49 = $current_backed_map_cache_strategy$.currentBinding(thread);
                                    try {
                                        $current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                                        {
                                            SubLObject stack = stacks.create_stack();
                                            SubLObject the_map = nl_trie.get_nl_trie();
                                            SubLObject mess = $str_alt142$Creating_NL_trie_rotation_index__;
                                            SubLObject sofar = ZERO_INTEGER;
                                            SubLObject total = map_utilities.map_size(the_map);
                                            SubLTrampolineFile.checkType(mess, STRINGP);
                                            {
                                                SubLObject _prev_bind_0_50 = $last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_1_51 = $last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_2_52 = $within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                    $within_noting_percent_progress$.bind(T, thread);
                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    noting_percent_progress_preamble(mess);
                                                    {
                                                        SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                                        SubLObject done_var = stop;
                                                        while (NIL == done_var) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject var = iteration.iteration_next(iterator);
                                                                SubLObject valid = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject datum = var;
                                                                        SubLObject current = datum;
                                                                        SubLObject strie_dict_key = NIL;
                                                                        SubLObject strie_dict_value = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt143);
                                                                        strie_dict_key = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt143);
                                                                        strie_dict_value = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            note_percent_progress(sofar, total);
                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                            if (NIL != map_utilities.map_p(strie_dict_value)) {
                                                                                stacks.stack_push(strie_dict_value, stack);
                                                                                while (!((NIL != stop) || (NIL != stacks.stack_empty_p(stack)))) {
                                                                                    {
                                                                                        SubLObject entry = stacks.stack_pop(stack);
                                                                                        SubLObject iterator_53 = map_utilities.new_map_iterator(entry);
                                                                                        SubLObject done_var_54 = stop;
                                                                                        while (NIL == done_var_54) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject var_55 = iteration.iteration_next(iterator_53);
                                                                                                SubLObject valid_56 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != valid_56) {
                                                                                                    {
                                                                                                        SubLObject datum_57 = var_55;
                                                                                                        SubLObject current_58 = datum_57;
                                                                                                        SubLObject dict_key = NIL;
                                                                                                        SubLObject dict_value = NIL;
                                                                                                        destructuring_bind_must_consp(current_58, datum_57, $list_alt144);
                                                                                                        dict_key = current_58.first();
                                                                                                        current_58 = current_58.rest();
                                                                                                        destructuring_bind_must_consp(current_58, datum_57, $list_alt144);
                                                                                                        dict_value = current_58.first();
                                                                                                        current_58 = current_58.rest();
                                                                                                        if (NIL == current_58) {
                                                                                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                                                                                stacks.stack_push(dict_value, stack);
                                                                                                            } else {
                                                                                                                if (dict_value.isCons()) {
                                                                                                                    {
                                                                                                                        SubLObject nl_trie_key = dict_value.first();
                                                                                                                        SubLObject nl_trie_data = dict_value.rest();
                                                                                                                        com.cyc.cycjava.cycl.nl_trie_accessors.update_nl_trie_rotation_index(nl_trie_data, NIL, trie_index);
                                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                                        stop = numGE(count, max_count);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            cdestructuring_bind_error(datum_57, $list_alt144);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                done_var_54 = makeBoolean((NIL == valid_56) || (NIL != stop));
                                                                                            }
                                                                                        } 
                                                                                    }
                                                                                } 
                                                                            } else {
                                                                                if (strie_dict_value.isCons()) {
                                                                                    {
                                                                                        SubLObject nl_trie_key = strie_dict_value.first();
                                                                                        SubLObject nl_trie_data = strie_dict_value.rest();
                                                                                        com.cyc.cycjava.cycl.nl_trie_accessors.update_nl_trie_rotation_index(nl_trie_data, NIL, trie_index);
                                                                                        count = add(count, ONE_INTEGER);
                                                                                        stop = numGE(count, max_count);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt143);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean((NIL == valid) || (NIL != stop));
                                                            }
                                                        } 
                                                    }
                                                    noting_percent_progress_postamble();
                                                } finally {
                                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                    $within_noting_percent_progress$.rebind(_prev_bind_2_52, thread);
                                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_51, thread);
                                                    $last_percent_progress_index$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        $current_backed_map_cache_strategy$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock);
                                }
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
                return trie_index;
            }
        }
    }

    /**
     *
     *
     * @return trie ; trie with rotation-index created from NL-TRIE
     */
    @LispMethod(comment = "@return trie ; trie with rotation-index created from NL-TRIE")
    public static SubLObject create_nl_trie_rotation_index(SubLObject max_num, SubLObject v_nl_trie) {
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = nl_trie.get_nl_trie();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trie_index = tries.create_trie(NIL, nl_trie_accessors.$$$nl_trie_rotation_index, T, symbol_function(EQUALP));
        final SubLObject max_count = (NIL != max_num) ? max_num : nl_trie.nl_trie_size(v_nl_trie);
        final SubLObject gc_every = integerDivide(max_count, TEN_INTEGER);
        SubLObject count = ZERO_INTEGER;
        SubLObject stop = NIL;
        final SubLObject already_resourcing_p = $resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = $resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            $resourced_sbhl_marking_space_limit$.bind(determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            $resourced_sbhl_marking_spaces$.bind(possibly_new_marking_resource(already_resourcing_p), thread);
            $resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            SubLObject release = NIL;
            try {
                release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0_$50 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_1_$51 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject the_map = nl_trie.get_nl_trie();
                    final SubLObject mess = nl_trie_accessors.$str152$Creating_NL_trie_rotation_index__;
                    SubLObject sofar = ZERO_INTEGER;
                    final SubLObject total = map_utilities.map_size(the_map);
                    assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                    final SubLObject _prev_bind_0_$51 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$52 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$54 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject iterator = map_utilities.new_map_iterator(the_map);
                            SubLObject valid;
                            for (SubLObject done_var = stop; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != stop))) {
                                thread.resetMultipleValues();
                                final SubLObject var = iteration.iteration_next(iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    SubLObject current;
                                    final SubLObject datum = current = var;
                                    SubLObject strie_dict_key = NIL;
                                    SubLObject strie_dict_value = NIL;
                                    destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list153);
                                    strie_dict_key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list153);
                                    strie_dict_value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != map_utilities.map_p(strie_dict_value)) {
                                            stacks.stack_push(strie_dict_value, stack);
                                            while ((NIL == stop) && (NIL == stacks.stack_empty_p(stack))) {
                                                final SubLObject entry = stacks.stack_pop(stack);
                                                final SubLObject iterator_$55 = map_utilities.new_map_iterator(entry);
                                                SubLObject valid_$58;
                                                for (SubLObject done_var_$56 = stop; NIL == done_var_$56; done_var_$56 = makeBoolean((NIL == valid_$58) || (NIL != stop))) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject var_$57 = iteration.iteration_next(iterator_$55);
                                                    valid_$58 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != valid_$58) {
                                                        SubLObject current_$60;
                                                        final SubLObject datum_$59 = current_$60 = var_$57;
                                                        SubLObject dict_key = NIL;
                                                        SubLObject dict_value = NIL;
                                                        destructuring_bind_must_consp(current_$60, datum_$59, nl_trie_accessors.$list154);
                                                        dict_key = current_$60.first();
                                                        current_$60 = current_$60.rest();
                                                        destructuring_bind_must_consp(current_$60, datum_$59, nl_trie_accessors.$list154);
                                                        dict_value = current_$60.first();
                                                        current_$60 = current_$60.rest();
                                                        if (NIL == current_$60) {
                                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                                stacks.stack_push(dict_value, stack);
                                                            } else
                                                                if (dict_value.isCons()) {
                                                                    final SubLObject nl_trie_key = dict_value.first();
                                                                    final SubLObject nl_trie_data = dict_value.rest();
                                                                    nl_trie_accessors.update_nl_trie_rotation_index(nl_trie_data, NIL, trie_index);
                                                                    count = add(count, ONE_INTEGER);
                                                                    stop = numGE(count, max_count);
                                                                }

                                                        } else {
                                                            cdestructuring_bind_error(datum_$59, nl_trie_accessors.$list154);
                                                        }
                                                    }
                                                }
                                            } 
                                        } else
                                            if (strie_dict_value.isCons()) {
                                                final SubLObject nl_trie_key2 = strie_dict_value.first();
                                                final SubLObject nl_trie_data2 = strie_dict_value.rest();
                                                nl_trie_accessors.update_nl_trie_rotation_index(nl_trie_data2, NIL, trie_index);
                                                count = add(count, ONE_INTEGER);
                                                stop = numGE(count, max_count);
                                            }

                                    } else {
                                        cdestructuring_bind_error(datum, nl_trie_accessors.$list153);
                                    }
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2_$54, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$52, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$51, thread);
                    }
                } finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_1_$51, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$50, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        } finally {
            $resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            $resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            $resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return trie_index;
    }

    /**
     *
     *
     * @param NL-TRIE-DATA
     * 		list-p; list of nl-trie-entries
     * 		Updates the NL trie index with the info from NL-TRIE-DATA
     */
    @LispMethod(comment = "@param NL-TRIE-DATA\r\n\t\tlist-p; list of nl-trie-entries\r\n\t\tUpdates the NL trie index with the info from NL-TRIE-DATA")
    public static final SubLObject update_nl_trie_rotation_index_alt(SubLObject nl_trie_data, SubLObject removeP, SubLObject trie_index) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        if (trie_index == UNPROVIDED) {
            trie_index = $nl_trie_rotation_index$.getGlobalValue();
        }
        if (NIL != tries.trie_p(trie_index)) {
            {
                SubLObject cdolist_list_var = nl_trie_data;
                SubLObject trie_entry = NIL;
                for (trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trie_entry = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_inappropriate_entryP(trie_entry, UNPROVIDED)) {
                        {
                            SubLObject phrase = nl_trie.nl_trie_entry_string(trie_entry);
                            SubLObject rotations = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_rotations(phrase);
                            SubLObject update_fn = (NIL != removeP) ? ((SubLObject) (symbol_function(TRIE_REMOVE))) : symbol_function(TRIE_INSERT);
                            SubLObject filtered_nl_trie_data = com.cyc.cycjava.cycl.nl_trie_accessors.extract_nl_trie_indexing_data_from_entry(phrase, trie_entry);
                            SubLObject cdolist_list_var_59 = cons(phrase, rotations);
                            SubLObject variant = NIL;
                            for (variant = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , variant = cdolist_list_var_59.first()) {
                                {
                                    SubLObject cdolist_list_var_60 = filtered_nl_trie_data;
                                    SubLObject index_item = NIL;
                                    for (index_item = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , index_item = cdolist_list_var_60.first()) {
                                        funcall(update_fn, trie_index, lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(variant)), index_item);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @param NL-TRIE-DATA
     * 		list-p; list of nl-trie-entries
     * 		Updates the NL trie index with the info from NL-TRIE-DATA
     */
    @LispMethod(comment = "@param NL-TRIE-DATA\r\n\t\tlist-p; list of nl-trie-entries\r\n\t\tUpdates the NL trie index with the info from NL-TRIE-DATA")
    public static SubLObject update_nl_trie_rotation_index(final SubLObject nl_trie_data, SubLObject removeP, SubLObject trie_index) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        if (trie_index == UNPROVIDED) {
            trie_index = nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue();
        }
        if (NIL != tries.trie_p(trie_index)) {
            SubLObject cdolist_list_var = nl_trie_data;
            SubLObject trie_entry = NIL;
            trie_entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == nl_trie_accessors.nl_trie_inappropriate_entryP(trie_entry, UNPROVIDED)) {
                    final SubLObject phrase = nl_trie.nl_trie_entry_string(trie_entry);
                    final SubLObject rotations = nl_trie_accessors.nl_trie_rotations(phrase);
                    final SubLObject update_fn = (NIL != removeP) ? symbol_function(nl_trie_accessors.TRIE_REMOVE) : symbol_function(nl_trie_accessors.TRIE_INSERT);
                    final SubLObject filtered_nl_trie_data = nl_trie_accessors.extract_nl_trie_indexing_data_from_entry(phrase, trie_entry);
                    SubLObject cdolist_list_var_$62 = cons(phrase, rotations);
                    SubLObject variant = NIL;
                    variant = cdolist_list_var_$62.first();
                    while (NIL != cdolist_list_var_$62) {
                        SubLObject cdolist_list_var_$63 = filtered_nl_trie_data;
                        SubLObject index_item = NIL;
                        index_item = cdolist_list_var_$63.first();
                        while (NIL != cdolist_list_var_$63) {
                            funcall(update_fn, trie_index, lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(variant)), index_item);
                            cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                            index_item = cdolist_list_var_$63.first();
                        } 
                        cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                        variant = cdolist_list_var_$62.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                trie_entry = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject nl_trie_matching_phrases_alt(SubLObject pattern, SubLObject search_type) {
        {
            SubLObject pcase_var = search_type;
            if (pcase_var.eql($INFIX)) {
                return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_matching_phrases_inverted_index(pattern);
            } else {
                return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_matching_phrases_substring(pattern, search_type);
            }
        }
    }

    public static SubLObject nl_trie_matching_phrases(final SubLObject pattern, final SubLObject search_type) {
        if (search_type.eql($INFIX)) {
            return nl_trie_accessors.nl_trie_matching_phrases_inverted_index(pattern);
        }
        return nl_trie_accessors.nl_trie_matching_phrases_substring(pattern, search_type);
    }

    /**
     *
     *
     * @param PATTERN
    stringp
     * 		
     * @param SEARCH-TYPE
     * 		keywordp; :PREFIX, :INFIX, or :SUFFIX.
     * @return list ; nl-trie-index-item's for lexified phrases that the pattern matches
     */
    @LispMethod(comment = "@param PATTERN\nstringp\r\n\t\t\r\n@param SEARCH-TYPE\r\n\t\tkeywordp; :PREFIX, :INFIX, or :SUFFIX.\r\n@return list ; nl-trie-index-item\'s for lexified phrases that the pattern matches")
    public static final SubLObject nl_trie_matching_phrases_substring_alt(SubLObject pattern, SubLObject search_type) {
        if ((NIL != string_utilities.non_empty_stringP(pattern)) && (NIL != tries.trie_p($nl_trie_rotation_index$.getGlobalValue()))) {
            {
                SubLObject standardized_pattern = lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(pattern));
                SubLObject index_entries = tries.trie_prefix($nl_trie_rotation_index$.getGlobalValue(), standardized_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject comparison_function = (search_type == $PREFIX) ? ((SubLObject) (symbol_function(STARTS_WITH))) : search_type == $SUFFIX ? ((SubLObject) (symbol_function(ENDS_WITH))) : NIL;
                SubLObject result = index_entries;
                if (search_type != $INFIX) {
                    result = NIL;
                    {
                        SubLObject cdolist_list_var = remove_duplicates(index_entries, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject index_entry = NIL;
                        for (index_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_entry = cdolist_list_var.first()) {
                            if (NIL != funcall(comparison_function, com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_index_item_phrase(index_entry), pattern)) {
                                result = cons(index_entry, result);
                            }
                        }
                    }
                }
                result = Sort.sort(result, symbol_function($sym152$STRING_), symbol_function(NL_TRIE_INDEX_ITEM_PHRASE));
                result = Sort.stable_sort(result, symbol_function(LESSER_LENGTH_P), symbol_function(NL_TRIE_INDEX_ITEM_PHRASE));
                return result;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PATTERN
    stringp
     * 		
     * @param SEARCH-TYPE
     * 		keywordp; :PREFIX, :INFIX, or :SUFFIX.
     * @return list ; nl-trie-index-item's for lexified phrases that the pattern matches
     */
    @LispMethod(comment = "@param PATTERN\nstringp\r\n\t\t\r\n@param SEARCH-TYPE\r\n\t\tkeywordp; :PREFIX, :INFIX, or :SUFFIX.\r\n@return list ; nl-trie-index-item\'s for lexified phrases that the pattern matches")
    public static SubLObject nl_trie_matching_phrases_substring(final SubLObject pattern, final SubLObject search_type) {
        if ((NIL != string_utilities.non_empty_stringP(pattern)) && (NIL != tries.trie_p(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue()))) {
            final SubLObject standardized_pattern = lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(pattern));
            final SubLObject index_entries = tries.trie_prefix(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue(), standardized_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject comparison_function = (search_type == $PREFIX) ? symbol_function(nl_trie_accessors.STARTS_WITH) : search_type == $SUFFIX ? symbol_function(ENDS_WITH) : NIL;
            SubLObject result = index_entries;
            if (search_type != $INFIX) {
                result = NIL;
                SubLObject cdolist_list_var = remove_duplicates(index_entries, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject index_entry = NIL;
                index_entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != funcall(comparison_function, nl_trie_accessors.nl_trie_index_item_phrase(index_entry), pattern)) {
                        result = cons(index_entry, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    index_entry = cdolist_list_var.first();
                } 
            }
            result = Sort.sort(result, symbol_function(nl_trie_accessors.$sym162$STRING_), symbol_function(nl_trie_accessors.NL_TRIE_INDEX_ITEM_PHRASE));
            result = Sort.stable_sort(result, symbol_function(nl_trie_accessors.LESSER_LENGTH_P), symbol_function(nl_trie_accessors.NL_TRIE_INDEX_ITEM_PHRASE));
            return result;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown this doesn't actually use an inverted index, but it approximates what one can get out of an inverted index.
    at present, this doesn't do anything to prefer answers where all search-terms are contiguous, or in
    the same order as they were in the input
     * @unknown double-hack: if SEARCH-STRINGS were set to a list of tokens in the search string, the above
    hack comment would be true.  Since it only returns a standardized version of the
    string, it doesn't do this, but instead looks for INPUT-STRING as a substring
    of a rotation index entry
     * @param PATTERN
    stringp
     * 		
     * @return list ; nl-trie-index-item's for lexified phrases that the pattern matches
    (e.g. every word in pattern is in lexification for term)
     */
    @LispMethod(comment = "@unknown this doesn\'t actually use an inverted index, but it approximates what one can get out of an inverted index.\r\nat present, this doesn\'t do anything to prefer answers where all search-terms are contiguous, or in\r\nthe same order as they were in the input\r\n@unknown double-hack: if SEARCH-STRINGS were set to a list of tokens in the search string, the above\r\nhack comment would be true.  Since it only returns a standardized version of the\r\nstring, it doesn\'t do this, but instead looks for INPUT-STRING as a substring\r\nof a rotation index entry\r\n@param PATTERN\nstringp\r\n\t\t\r\n@return list ; nl-trie-index-item\'s for lexified phrases that the pattern matches\r\n(e.g. every word in pattern is in lexification for term)")
    public static final SubLObject nl_trie_matching_phrases_inverted_index_alt(SubLObject input_string) {
        {
            SubLObject search_strings = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_search_strings_from_pattern(input_string);
            SubLObject dict_vector = make_vector(length(search_strings), UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject search_string = NIL;
            SubLObject num = NIL;
            for (list_var = search_strings, search_string = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , search_string = list_var.first() , num = add(ONE_INTEGER, num)) {
                set_aref(dict_vector, num, dictionary.new_dictionary(EQUAL, UNPROVIDED));
                {
                    SubLObject dict = aref(dict_vector, num);
                    SubLObject matches = com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_matching_phrases_substring(search_string, $INFIX);
                    SubLObject cdolist_list_var = matches;
                    SubLObject match = NIL;
                    for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                        dictionary_utilities.dictionary_push(dict, com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_index_item_term(match), match);
                    }
                }
            }
            return com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_matches_from_dictionary(dict_vector, search_strings);
        }
    }

    /**
     *
     *
     * @unknown this doesn't actually use an inverted index, but it approximates what one can get out of an inverted index.
    at present, this doesn't do anything to prefer answers where all search-terms are contiguous, or in
    the same order as they were in the input
     * @unknown double-hack: if SEARCH-STRINGS were set to a list of tokens in the search string, the above
    hack comment would be true.  Since it only returns a standardized version of the
    string, it doesn't do this, but instead looks for INPUT-STRING as a substring
    of a rotation index entry
     * @param PATTERN
    stringp
     * 		
     * @return list ; nl-trie-index-item's for lexified phrases that the pattern matches
    (e.g. every word in pattern is in lexification for term)
     */
    @LispMethod(comment = "@unknown this doesn\'t actually use an inverted index, but it approximates what one can get out of an inverted index.\r\nat present, this doesn\'t do anything to prefer answers where all search-terms are contiguous, or in\r\nthe same order as they were in the input\r\n@unknown double-hack: if SEARCH-STRINGS were set to a list of tokens in the search string, the above\r\nhack comment would be true.  Since it only returns a standardized version of the\r\nstring, it doesn\'t do this, but instead looks for INPUT-STRING as a substring\r\nof a rotation index entry\r\n@param PATTERN\nstringp\r\n\t\t\r\n@return list ; nl-trie-index-item\'s for lexified phrases that the pattern matches\r\n(e.g. every word in pattern is in lexification for term)")
    public static SubLObject nl_trie_matching_phrases_inverted_index(final SubLObject input_string) {
        final SubLObject search_strings = nl_trie_accessors.nl_trie_search_strings_from_pattern(input_string);
        final SubLObject dict_vector = make_vector(length(search_strings), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject search_string = NIL;
        SubLObject num = NIL;
        list_var = search_strings;
        search_string = list_var.first();
        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , search_string = list_var.first() , num = add(ONE_INTEGER, num)) {
            set_aref(dict_vector, num, dictionary.new_dictionary(EQUAL, UNPROVIDED));
            final SubLObject dict = aref(dict_vector, num);
            SubLObject cdolist_list_var;
            final SubLObject matches = cdolist_list_var = nl_trie_accessors.nl_trie_matching_phrases_substring(search_string, $INFIX);
            SubLObject match = NIL;
            match = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push(dict, nl_trie_accessors.nl_trie_index_item_term(match), match);
                cdolist_list_var = cdolist_list_var.rest();
                match = cdolist_list_var.first();
            } 
        }
        return nl_trie_accessors.nl_trie_matches_from_dictionary(dict_vector, search_strings);
    }

    /**
     * make sure that every word in SEARCH-TERMS is in the string for each index-item that is returned
     */
    @LispMethod(comment = "make sure that every word in SEARCH-TERMS is in the string for each index-item that is returned")
    public static final SubLObject nl_trie_matches_from_dictionary_alt(SubLObject dict_vector, SubLObject search_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject search_string_count = length(search_terms);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(aref(dict_vector, ZERO_INTEGER)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject matches = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject failP = NIL;
                            SubLObject cdotimes_end_var = subtract(length(dict_vector), ONE_INTEGER);
                            SubLObject n = NIL;
                            for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                                if (NIL == dictionary.dictionary_lookup_without_values(aref(dict_vector, number_utilities.f_1X(n)), v_term, UNPROVIDED)) {
                                    failP = T;
                                }
                            }
                            if (NIL == failP) {
                                {
                                    SubLObject cdolist_list_var = matches;
                                    SubLObject match = NIL;
                                    for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                                        if ((search_string_count == ONE_INTEGER) || (NIL != string_utilities.substring_every_in_list(search_terms, com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_index_item_phrase(match), UNPROVIDED))) {
                                            result = cons(match, result);
                                        }
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    @LispMethod(comment = "make sure that every word in SEARCH-TERMS is in the string for each index-item that is returned")
    public static SubLObject nl_trie_matches_from_dictionary(final SubLObject dict_vector, final SubLObject search_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject search_string_count = length(search_terms);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(aref(dict_vector, ZERO_INTEGER))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject matches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject failP = NIL;
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = subtract(length(dict_vector), ONE_INTEGER), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                if (NIL == dictionary.dictionary_lookup_without_values(aref(dict_vector, number_utilities.f_1X(n)), v_term, UNPROVIDED)) {
                    failP = T;
                }
            }
            if (NIL == failP) {
                SubLObject cdolist_list_var = matches;
                SubLObject match = NIL;
                match = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (search_string_count.eql(ONE_INTEGER) || (NIL != string_utilities.substring_every_in_list(search_terms, nl_trie_accessors.nl_trie_index_item_phrase(match), UNPROVIDED))) {
                        result = cons(match, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    match = cdolist_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }/**
     * make sure that every word in SEARCH-TERMS is in the string for each index-item that is returned
     */


    /**
     *
     *
     * @unknown to change behavior of NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX to be more like an inverted
    index, this should just return the tokenized pattern.
     */
    @LispMethod(comment = "@unknown to change behavior of NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX to be more like an inverted\r\nindex, this should just return the tokenized pattern.")
    public static final SubLObject nl_trie_search_strings_from_pattern_alt(SubLObject pattern) {
        return list(lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(pattern)));
    }

    /**
     *
     *
     * @unknown to change behavior of NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX to be more like an inverted
    index, this should just return the tokenized pattern.
     */
    @LispMethod(comment = "@unknown to change behavior of NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX to be more like an inverted\r\nindex, this should just return the tokenized pattern.")
    public static SubLObject nl_trie_search_strings_from_pattern(final SubLObject pattern) {
        return list(lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(pattern)));
    }

    /**
     * Output to STREAM all the single-word (more-or-less as a spellchecker would consider them) strings
     * from the NL trie, separated by SEPARATOR-CHAR.
     */
    @LispMethod(comment = "Output to STREAM all the single-word (more-or-less as a spellchecker would consider them) strings\r\nfrom the NL trie, separated by SEPARATOR-CHAR.\nOutput to STREAM all the single-word (more-or-less as a spellchecker would consider them) strings\nfrom the NL trie, separated by SEPARATOR-CHAR.")
    public static final SubLObject dump_nl_trie_spellchecker_strings_alt(SubLObject stream, SubLObject omit_duplicatesP, SubLObject duplicate_test, SubLObject separator_char) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (omit_duplicatesP == UNPROVIDED) {
            omit_duplicatesP = T;
        }
        if (duplicate_test == UNPROVIDED) {
            duplicate_test = symbol_function(EQUALP);
        }
        if (separator_char == UNPROVIDED) {
            separator_char = CHAR_newline;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == nl_trie.nl_trie_presentP(UNPROVIDED)) {
                    Errors.error($str_alt154$The_NL_Trie_must_be_initialized_b);
                }
            }
            {
                SubLObject lock = nl_trie.$nl_trie_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject done_strings = (NIL != omit_duplicatesP) ? ((SubLObject) (set.new_set(duplicate_test, UNPROVIDED))) : NIL;
                        SubLObject break_chars = delete_duplicates(cons(CHAR_period, union(string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject lock_61 = nl_trie.$nl_trie_lock$.getGlobalValue();
                        SubLObject release_62 = NIL;
                        try {
                            release_62 = seize_lock(lock_61);
                            {
                                SubLObject _prev_bind_0 = $current_backed_map_cache_strategy$.currentBinding(thread);
                                try {
                                    $current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                                    {
                                        SubLObject stack = stacks.create_stack();
                                        SubLObject the_map = nl_trie.get_nl_trie();
                                        SubLObject mess = $str_alt155$Dumping_NL_Trie_spellchecker_stri;
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLObject total = map_utilities.map_size(the_map);
                                        SubLTrampolineFile.checkType(mess, STRINGP);
                                        {
                                            SubLObject _prev_bind_0_63 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble(mess);
                                                {
                                                    SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                                    SubLObject done_var = NIL;
                                                    while (NIL == done_var) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject var = iteration.iteration_next(iterator);
                                                            SubLObject valid = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject datum = var;
                                                                    SubLObject current = datum;
                                                                    SubLObject strie_dict_key = NIL;
                                                                    SubLObject strie_dict_value = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt143);
                                                                    strie_dict_key = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt143);
                                                                    strie_dict_value = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        note_percent_progress(sofar, total);
                                                                        sofar = add(sofar, ONE_INTEGER);
                                                                        if (NIL != map_utilities.map_p(strie_dict_value)) {
                                                                            stacks.stack_push(strie_dict_value, stack);
                                                                            while (NIL == stacks.stack_empty_p(stack)) {
                                                                                {
                                                                                    SubLObject entry = stacks.stack_pop(stack);
                                                                                    SubLObject iterator_64 = map_utilities.new_map_iterator(entry);
                                                                                    SubLObject done_var_65 = NIL;
                                                                                    while (NIL == done_var_65) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject var_66 = iteration.iteration_next(iterator_64);
                                                                                            SubLObject valid_67 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != valid_67) {
                                                                                                {
                                                                                                    SubLObject datum_68 = var_66;
                                                                                                    SubLObject current_69 = datum_68;
                                                                                                    SubLObject dict_key = NIL;
                                                                                                    SubLObject dict_value = NIL;
                                                                                                    destructuring_bind_must_consp(current_69, datum_68, $list_alt144);
                                                                                                    dict_key = current_69.first();
                                                                                                    current_69 = current_69.rest();
                                                                                                    destructuring_bind_must_consp(current_69, datum_68, $list_alt144);
                                                                                                    dict_value = current_69.first();
                                                                                                    current_69 = current_69.rest();
                                                                                                    if (NIL == current_69) {
                                                                                                        if (NIL != map_utilities.map_p(dict_value)) {
                                                                                                            stacks.stack_push(dict_value, stack);
                                                                                                        } else {
                                                                                                            if (dict_value.isCons()) {
                                                                                                                {
                                                                                                                    SubLObject key = dict_value.first();
                                                                                                                    SubLObject entries = dict_value.rest();
                                                                                                                    SubLObject cdolist_list_var = entries;
                                                                                                                    SubLObject entry_70 = NIL;
                                                                                                                    for (entry_70 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry_70 = cdolist_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject cdolist_list_var_71 = string_utilities.string_tokenize(nl_trie.nl_trie_entry_string(entry_70), break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            SubLObject string = NIL;
                                                                                                                            for (string = cdolist_list_var_71.first(); NIL != cdolist_list_var_71; cdolist_list_var_71 = cdolist_list_var_71.rest() , string = cdolist_list_var_71.first()) {
                                                                                                                                if ((NIL == omit_duplicatesP) || (NIL == set.set_memberP(string, done_strings))) {
                                                                                                                                    princ(string, stream);
                                                                                                                                    princ(separator_char, stream);
                                                                                                                                    if (NIL != omit_duplicatesP) {
                                                                                                                                        set.set_add(string, done_strings);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum_68, $list_alt144);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_65 = makeBoolean(NIL == valid_67);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } 
                                                                        } else {
                                                                            if (strie_dict_value.isCons()) {
                                                                                {
                                                                                    SubLObject key = strie_dict_value.first();
                                                                                    SubLObject entries = strie_dict_value.rest();
                                                                                    SubLObject cdolist_list_var = entries;
                                                                                    SubLObject entry = NIL;
                                                                                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var_72 = string_utilities.string_tokenize(nl_trie.nl_trie_entry_string(entry), break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            SubLObject string = NIL;
                                                                                            for (string = cdolist_list_var_72.first(); NIL != cdolist_list_var_72; cdolist_list_var_72 = cdolist_list_var_72.rest() , string = cdolist_list_var_72.first()) {
                                                                                                if ((NIL == omit_duplicatesP) || (NIL == set.set_memberP(string, done_strings))) {
                                                                                                    princ(string, stream);
                                                                                                    princ(separator_char, stream);
                                                                                                    if (NIL != omit_duplicatesP) {
                                                                                                        set.set_add(string, done_strings);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt143);
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_63, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $current_backed_map_cache_strategy$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } finally {
                            if (NIL != release_62) {
                                release_lock(lock_61);
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return stream;
        }
    }

    @LispMethod(comment = "Output to STREAM all the single-word (more-or-less as a spellchecker would consider them) strings\r\nfrom the NL trie, separated by SEPARATOR-CHAR.\nOutput to STREAM all the single-word (more-or-less as a spellchecker would consider them) strings\nfrom the NL trie, separated by SEPARATOR-CHAR.")
    public static SubLObject dump_nl_trie_spellchecker_strings(SubLObject stream, SubLObject omit_duplicatesP, SubLObject duplicate_test, SubLObject separator_char) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (omit_duplicatesP == UNPROVIDED) {
            omit_duplicatesP = T;
        }
        if (duplicate_test == UNPROVIDED) {
            duplicate_test = symbol_function(EQUALP);
        }
        if (separator_char == UNPROVIDED) {
            separator_char = CHAR_newline;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == nl_trie.nl_trie_presentP(UNPROVIDED))) {
            Errors.error(nl_trie_accessors.$str164$The_NL_Trie_must_be_initialized_b);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                final SubLObject done_strings = (NIL != omit_duplicatesP) ? set.new_set(duplicate_test, UNPROVIDED) : NIL;
                final SubLObject break_chars = delete_duplicates(cons(CHAR_period, union(string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject release_$64 = NIL;
                try {
                    release_$64 = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0_$65 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                        final SubLObject stack = stacks.create_stack();
                        final SubLObject the_map = nl_trie.get_nl_trie();
                        final SubLObject mess = nl_trie_accessors.$str165$Dumping_NL_Trie_spellchecker_stri;
                        SubLObject sofar = ZERO_INTEGER;
                        final SubLObject total = map_utilities.map_size(the_map);
                        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                        final SubLObject _prev_bind_0_$66 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$67 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                SubLObject valid;
                                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                    thread.resetMultipleValues();
                                    final SubLObject var = iteration.iteration_next(iterator);
                                    valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        SubLObject current;
                                        final SubLObject datum = current = var;
                                        SubLObject strie_dict_key = NIL;
                                        SubLObject strie_dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list153);
                                        strie_dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, nl_trie_accessors.$list153);
                                        strie_dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (NIL != map_utilities.map_p(strie_dict_value)) {
                                                stacks.stack_push(strie_dict_value, stack);
                                                while (NIL == stacks.stack_empty_p(stack)) {
                                                    final SubLObject entry = stacks.stack_pop(stack);
                                                    final SubLObject iterator_$68 = map_utilities.new_map_iterator(entry);
                                                    SubLObject valid_$71;
                                                    for (SubLObject done_var_$69 = NIL; NIL == done_var_$69; done_var_$69 = makeBoolean(NIL == valid_$71)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject var_$70 = iteration.iteration_next(iterator_$68);
                                                        valid_$71 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid_$71) {
                                                            SubLObject current_$73;
                                                            final SubLObject datum_$72 = current_$73 = var_$70;
                                                            SubLObject dict_key = NIL;
                                                            SubLObject dict_value = NIL;
                                                            destructuring_bind_must_consp(current_$73, datum_$72, nl_trie_accessors.$list154);
                                                            dict_key = current_$73.first();
                                                            current_$73 = current_$73.rest();
                                                            destructuring_bind_must_consp(current_$73, datum_$72, nl_trie_accessors.$list154);
                                                            dict_value = current_$73.first();
                                                            current_$73 = current_$73.rest();
                                                            if (NIL == current_$73) {
                                                                if (NIL != map_utilities.map_p(dict_value)) {
                                                                    stacks.stack_push(dict_value, stack);
                                                                } else
                                                                    if (dict_value.isCons()) {
                                                                        final SubLObject key = dict_value.first();
                                                                        SubLObject cdolist_list_var;
                                                                        final SubLObject entries = cdolist_list_var = dict_value.rest();
                                                                        SubLObject entry_$74 = NIL;
                                                                        entry_$74 = cdolist_list_var.first();
                                                                        while (NIL != cdolist_list_var) {
                                                                            SubLObject cdolist_list_var_$75 = string_utilities.string_tokenize(nl_trie.nl_trie_entry_string(entry_$74), break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            SubLObject string = NIL;
                                                                            string = cdolist_list_var_$75.first();
                                                                            while (NIL != cdolist_list_var_$75) {
                                                                                if ((NIL == omit_duplicatesP) || (NIL == set.set_memberP(string, done_strings))) {
                                                                                    princ(string, stream);
                                                                                    princ(separator_char, stream);
                                                                                    if (NIL != omit_duplicatesP) {
                                                                                        set.set_add(string, done_strings);
                                                                                    }
                                                                                }
                                                                                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                                                                                string = cdolist_list_var_$75.first();
                                                                            } 
                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                            entry_$74 = cdolist_list_var.first();
                                                                        } 
                                                                    }

                                                            } else {
                                                                cdestructuring_bind_error(datum_$72, nl_trie_accessors.$list154);
                                                            }
                                                        }
                                                    }
                                                } 
                                            } else
                                                if (strie_dict_value.isCons()) {
                                                    final SubLObject key2 = strie_dict_value.first();
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject entries2 = cdolist_list_var2 = strie_dict_value.rest();
                                                    SubLObject entry2 = NIL;
                                                    entry2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        SubLObject cdolist_list_var_$76 = string_utilities.string_tokenize(nl_trie.nl_trie_entry_string(entry2), break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject string2 = NIL;
                                                        string2 = cdolist_list_var_$76.first();
                                                        while (NIL != cdolist_list_var_$76) {
                                                            if ((NIL == omit_duplicatesP) || (NIL == set.set_memberP(string2, done_strings))) {
                                                                princ(string2, stream);
                                                                princ(separator_char, stream);
                                                                if (NIL != omit_duplicatesP) {
                                                                    set.set_add(string2, done_strings);
                                                                }
                                                            }
                                                            cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                                                            string2 = cdolist_list_var_$76.first();
                                                        } 
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        entry2 = cdolist_list_var2.first();
                                                    } 
                                                }

                                        } else {
                                            cdestructuring_bind_error(datum, nl_trie_accessors.$list153);
                                        }
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$67, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$66, thread);
                        }
                    } finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$65, thread);
                    }
                } finally {
                    if (NIL != release_$64) {
                        release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return stream;
    }/**
     * Output to STREAM all the single-word (more-or-less as a spellchecker would consider them) strings
     * from the NL trie, separated by SEPARATOR-CHAR.
     */


    public static final SubLObject stress_test_nl_trie_search_concurrent_swapping_alt(SubLObject checker_count, SubLObject string_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = $default_number_of_concurrent_test_threads$.getGlobalValue();
        }
        if (string_count == UNPROVIDED) {
            string_count = $default_string_test_count$.getGlobalValue();
        }
        {
            SubLObject problem_queue = process_utilities.new_ipc_queue($str_alt157$Concurrent_NL_Trie_Search_Stress_);
            SubLObject checkers = NIL;
            SubLObject issue_list = NIL;
            SubLObject strings = NIL;
            swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
            Storage.gc(UNPROVIDED);
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject pred_var = $$nameString;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = doneP;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_73 = doneP;
                                                SubLObject token_var_74 = NIL;
                                                while (NIL == done_var_73) {
                                                    {
                                                        SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_74);
                                                        SubLObject valid_75 = makeBoolean(token_var_74 != v_assert);
                                                        if (NIL != valid_75) {
                                                            strings = cons(cycl_utilities.formula_arg2(v_assert, UNPROVIDED), strings);
                                                            if (index.numG(multiply(string_count, checker_count))) {
                                                                doneP = T;
                                                            }
                                                        }
                                                        done_var_73 = makeBoolean((NIL == valid_75) || (NIL != doneP));
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                            }
                        } 
                    }
                }
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject name = cconcatenate($str_alt160$Concurrent_NL_Trie_Searches_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
                        SubLObject checker = subl_promotions.make_process_with_args(name, STRESS_TEST_NL_TRIE_SEARCH, list(subseq(strings, multiply(i, string_count), multiply(add(ONE_INTEGER, i), string_count)), problem_queue, name));
                        checkers = cons(checker, checkers);
                    }
                }
            }
            while (position_if(VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                sleep(ONE_INTEGER);
            } 
            while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
                issue_list = cons(process_utilities.ipc_dequeue(problem_queue), issue_list);
            } 
            if (NIL != list_utilities.sublisp_boolean(issue_list)) {
                swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
            }
            return issue_list;
        }
    }

    public static SubLObject stress_test_nl_trie_search_concurrent_swapping(SubLObject checker_count, SubLObject string_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = nl_trie_accessors.$default_number_of_concurrent_test_threads$.getGlobalValue();
        }
        if (string_count == UNPROVIDED) {
            string_count = nl_trie_accessors.$default_string_test_count$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_queue = process_utilities.new_ipc_queue(nl_trie_accessors.$str167$Concurrent_NL_Trie_Search_Stress_);
        SubLObject checkers = NIL;
        SubLObject issue_list = NIL;
        SubLObject strings = NIL;
        file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        Storage.gc(UNPROVIDED);
        final SubLObject index = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject pred_var = nl_trie_accessors.$$nameString;
        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        note_progress();
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$78 = doneP;
                            final SubLObject token_var_$79 = NIL;
                            while (NIL == done_var_$78) {
                                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$79);
                                final SubLObject valid_$80 = makeBoolean(!token_var_$79.eql(v_assert));
                                if (NIL != valid_$80) {
                                    strings = cons(cycl_utilities.formula_arg2(v_assert, UNPROVIDED), strings);
                                    if (index.numG(multiply(string_count, checker_count))) {
                                        doneP = T;
                                    }
                                }
                                done_var_$78 = makeBoolean((NIL == valid_$80) || (NIL != doneP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                } 
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = NIL, i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
            name = cconcatenate(nl_trie_accessors.$$$Concurrent_NL_Trie_Searches_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, nl_trie_accessors.STRESS_TEST_NL_TRIE_SEARCH, list(subseq(strings, multiply(i, string_count), multiply(add(ONE_INTEGER, i), string_count)), problem_queue, name));
            checkers = cons(checker, checkers);
        }
        while (position_if(nl_trie_accessors.VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
            sleep(ONE_INTEGER);
        } 
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = cons(process_utilities.ipc_dequeue(problem_queue, UNPROVIDED), issue_list);
        } 
        if (NIL != list_utilities.sublisp_boolean(issue_list)) {
            file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        }
        return issue_list;
    }

    public static final SubLObject stress_test_nl_trie_search_alt(SubLObject strings, SubLObject problem_queue, SubLObject name) {
        {
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (error_message.isString()) {
                        process_utilities.ipc_enqueue(cons(string, error_message), problem_queue);
                    }
                }
            }
        }
        return $DONE;
    }

    public static SubLObject stress_test_nl_trie_search(final SubLObject strings, final SubLObject problem_queue, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                process_utilities.ipc_enqueue(cons(string, error_message), problem_queue, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static final SubLObject stress_test_nl_trie_prefixes_concurrent_swapping_alt(SubLObject checker_count, SubLObject string_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = $default_number_of_concurrent_test_threads$.getGlobalValue();
        }
        if (string_count == UNPROVIDED) {
            string_count = $default_string_test_count$.getGlobalValue();
        }
        {
            SubLObject problem_queue = process_utilities.new_ipc_queue($str_alt164$Concurrent_NL_Trie_Prefixes_Stres);
            SubLObject checkers = NIL;
            SubLObject issue_list = NIL;
            SubLObject strings = NIL;
            swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
            Storage.gc(UNPROVIDED);
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject pred_var = $$nameString;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = doneP;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_76 = doneP;
                                                SubLObject token_var_77 = NIL;
                                                while (NIL == done_var_76) {
                                                    {
                                                        SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_77);
                                                        SubLObject valid_78 = makeBoolean(token_var_77 != v_assert);
                                                        if (NIL != valid_78) {
                                                            strings = cons(cycl_utilities.formula_arg2(v_assert, UNPROVIDED), strings);
                                                            if (index.numG(multiply(string_count, checker_count))) {
                                                                doneP = T;
                                                            }
                                                        }
                                                        done_var_76 = makeBoolean((NIL == valid_78) || (NIL != doneP));
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                            }
                        } 
                    }
                }
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject name = cconcatenate($str_alt165$Concurrent_NL_Trie_Prefixes_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
                        SubLObject checker = subl_promotions.make_process_with_args(name, STRESS_TEST_NL_TRIE_PREFIXES, list(subseq(strings, multiply(i, string_count), multiply(add(ONE_INTEGER, i), string_count)), problem_queue, name));
                        checkers = cons(checker, checkers);
                    }
                }
            }
            while (position_if(VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                sleep(ONE_INTEGER);
            } 
            while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
                issue_list = cons(process_utilities.ipc_dequeue(problem_queue), issue_list);
            } 
            if (NIL != list_utilities.sublisp_boolean(issue_list)) {
                swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
            }
            return issue_list;
        }
    }

    public static SubLObject stress_test_nl_trie_prefixes_concurrent_swapping(SubLObject checker_count, SubLObject string_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = nl_trie_accessors.$default_number_of_concurrent_test_threads$.getGlobalValue();
        }
        if (string_count == UNPROVIDED) {
            string_count = nl_trie_accessors.$default_string_test_count$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_queue = process_utilities.new_ipc_queue(nl_trie_accessors.$str174$Concurrent_NL_Trie_Prefixes_Stres);
        SubLObject checkers = NIL;
        SubLObject issue_list = NIL;
        SubLObject strings = NIL;
        file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        Storage.gc(UNPROVIDED);
        final SubLObject index = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject pred_var = nl_trie_accessors.$$nameString;
        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        note_progress();
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$82 = doneP;
                            final SubLObject token_var_$83 = NIL;
                            while (NIL == done_var_$82) {
                                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                final SubLObject valid_$84 = makeBoolean(!token_var_$83.eql(v_assert));
                                if (NIL != valid_$84) {
                                    strings = cons(cycl_utilities.formula_arg2(v_assert, UNPROVIDED), strings);
                                    if (index.numG(multiply(string_count, checker_count))) {
                                        doneP = T;
                                    }
                                }
                                done_var_$82 = makeBoolean((NIL == valid_$84) || (NIL != doneP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                } 
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = NIL, i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
            name = cconcatenate(nl_trie_accessors.$$$Concurrent_NL_Trie_Prefixes_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, nl_trie_accessors.STRESS_TEST_NL_TRIE_PREFIXES, list(subseq(strings, multiply(i, string_count), multiply(add(ONE_INTEGER, i), string_count)), problem_queue, name));
            checkers = cons(checker, checkers);
        }
        while (position_if(nl_trie_accessors.VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
            sleep(ONE_INTEGER);
        } 
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = cons(process_utilities.ipc_dequeue(problem_queue, UNPROVIDED), issue_list);
        } 
        if (NIL != list_utilities.sublisp_boolean(issue_list)) {
            file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        }
        return issue_list;
    }

    public static final SubLObject stress_test_nl_trie_prefixes_alt(SubLObject strings, SubLObject problem_queue, SubLObject name) {
        {
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    com.cyc.cycjava.cycl.nl_trie_accessors.nl_trie_prefixes(nl_trie.get_nl_trie(), nl_trie.nl_trie_string_tokenize(string), UNPROVIDED);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (error_message.isString()) {
                        process_utilities.ipc_enqueue(cons(string, error_message), problem_queue);
                    }
                }
            }
        }
        return $DONE;
    }

    public static SubLObject stress_test_nl_trie_prefixes(final SubLObject strings, final SubLObject problem_queue, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_trie_accessors.nl_trie_prefixes(nl_trie.get_nl_trie(), nl_trie.nl_trie_string_tokenize(string), UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                process_utilities.ipc_enqueue(cons(string, error_message), problem_queue, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static SubLObject declare_nl_trie_accessors_file() {
        declareMacro("do_nl_trie_entries", "DO-NL-TRIE-ENTRIES");
        declareMacro("do_nl_trie_entries_for_string", "DO-NL-TRIE-ENTRIES-FOR-STRING");
        declareMacro("do_nl_trie_word_entries_for_string", "DO-NL-TRIE-WORD-ENTRIES-FOR-STRING");
        declareMacro("do_nl_trie_name_entries_for_string", "DO-NL-TRIE-NAME-ENTRIES-FOR-STRING");
        declareMacro("incorporate_new_entry", "INCORPORATE-NEW-ENTRY");
        declareMacro("incorporate_new_denots_and_preds", "INCORPORATE-NEW-DENOTS-AND-PREDS");
        declareFunction("nl_trie_string_is_posP_internal", "NL-TRIE-STRING-IS-POS?-INTERNAL", 2, 2, false);
        declareFunction("nl_trie_string_is_posP", "NL-TRIE-STRING-IS-POS?", 2, 2, false);
        declareFunction("nl_trie_words_of_string", "NL-TRIE-WORDS-OF-STRING", 1, 3, false);
        declareFunction("nl_trie_words_of_stringXpred", "NL-TRIE-WORDS-OF-STRING&PRED", 2, 3, false);
        declareFunction("nl_trie_words_of_stringXpos", "NL-TRIE-WORDS-OF-STRING&POS", 2, 3, false);
        declareFunction("nl_trie_words_of_stringXspeech_part", "NL-TRIE-WORDS-OF-STRING&SPEECH-PART", 2, 3, false);
        declareFunction("nl_trie_preds_of_stringXword", "NL-TRIE-PREDS-OF-STRING&WORD", 2, 3, false);
        declareFunction("nl_trie_preds_of_string", "NL-TRIE-PREDS-OF-STRING", 1, 3, false);
        declareFunction("nl_trie_namestring_preds_of_string", "NL-TRIE-NAMESTRING-PREDS-OF-STRING", 1, 3, false);
        declareFunction("nl_trie_pos_of_string", "NL-TRIE-POS-OF-STRING", 1, 3, false);
        declareFunction("nl_trie_pos_of_stringXword", "NL-TRIE-POS-OF-STRING&WORD", 2, 3, false);
        declareFunction("nl_trie_all_denots_of_string", "NL-TRIE-ALL-DENOTS-OF-STRING", 1, 3, false);
        declareFunction("nl_trie_denots_of_string", "NL-TRIE-DENOTS-OF-STRING", 1, 6, false);
        declareFunction("general_nl_trie_denots_of_string", "GENERAL-NL-TRIE-DENOTS-OF-STRING", 3, 5, false);
        declareFunction("general_nl_trie_denots_of_string_int", "GENERAL-NL-TRIE-DENOTS-OF-STRING-INT", 8, 0, false);
        declareFunction("nl_trie_denotation_mapper", "NL-TRIE-DENOTATION-MAPPER", 1, 3, false);
        declareFunction("nl_trie_denots_of_stringXpos", "NL-TRIE-DENOTS-OF-STRING&POS", 2, 5, false);
        declareFunction("nl_trie_dps_of_string", "NL-TRIE-DPS-OF-STRING", 1, 6, false);
        declareFunction("nl_trie_denots_of_stringXspeech_part", "NL-TRIE-DENOTS-OF-STRING&SPEECH-PART", 2, 5, false);
        declareFunction("nl_trie_denots_of_stringXpred", "NL-TRIE-DENOTS-OF-STRING&PRED", 2, 5, false);
        declareFunction("nl_trie_denots_of_name_string", "NL-TRIE-DENOTS-OF-NAME-STRING", 1, 4, false);
        declareFunction("nl_trie_denots_of_name_string_internal", "NL-TRIE-DENOTS-OF-NAME-STRING-INTERNAL", 6, 0, false);
        declareFunction("starts_with_theP", "STARTS-WITH-THE?", 1, 0, false);
        declareFunction("nl_trie_denots_of_acronym_string", "NL-TRIE-DENOTS-OF-ACRONYM-STRING", 1, 3, false);
        declareFunction("nl_trie_denots_of_abbreviation_string", "NL-TRIE-DENOTS-OF-ABBREVIATION-STRING", 1, 3, false);
        declareFunction("reinitialize_nl_trie_for_string", "REINITIALIZE-NL-TRIE-FOR-STRING", 1, 0, false);
        declareFunction("nl_trie_semtrans_templates_of_string", "NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING", 1, 5, false);
        declareFunction("nl_trie_names_from_spelling", "NL-TRIE-NAMES-FROM-SPELLING", 1, 3, false);
        declareFunction("nl_trie_names_from_nickname", "NL-TRIE-NAMES-FROM-NICKNAME", 1, 3, false);
        declareFunction("nl_trie_denots_of_string_and_namestring_pred", "NL-TRIE-DENOTS-OF-STRING-AND-NAMESTRING-PRED", 2, 3, false);
        declareFunction("nl_trie_assertions_with_string_and_namestring_pred", "NL-TRIE-ASSERTIONS-WITH-STRING-AND-NAMESTRING-PRED", 2, 3, false);
        declareFunction("nl_trie_regular_formP", "NL-TRIE-REGULAR-FORM?", 2, 1, false);
        declareFunction("nl_trie_word_pred_and_supports_for_pred", "NL-TRIE-WORD-PRED-AND-SUPPORTS-FOR-PRED", 2, 1, false);
        declareFunction("add_new_entry", "ADD-NEW-ENTRY", 3, 4, false);
        declareFunction("nl_trie_entry_name_pred_or_syntactic_preds", "NL-TRIE-ENTRY-NAME-PRED-OR-SYNTACTIC-PREDS", 1, 0, false);
        declareFunction("add_new_denots_and_preds", "ADD-NEW-DENOTS-AND-PREDS", 4, 0, false);
        declareFunction("pred_type_okP", "PRED-TYPE-OK?", 4, 0, false);
        declareFunction("abbrev_const_satisfiedP", "ABBREV-CONST-SATISFIED?", 2, 0, false);
        declareFunction("denot_const_satisfiedP", "DENOT-CONST-SATISFIED?", 2, 0, false);
        declareFunction("namestring_const_satisfiedP", "NAMESTRING-CONST-SATISFIED?", 2, 0, false);
        declareFunction("nl_trie_sentence_tokenize", "NL-TRIE-SENTENCE-TOKENIZE", 1, 5, false);
        declareFunction("nl_trie_filter_tokens_for_case", "NL-TRIE-FILTER-TOKENS-FOR-CASE", 2, 0, false);
        declareFunction("nl_trie_remove_inappropriate_tokens", "NL-TRIE-REMOVE-INAPPROPRIATE-TOKENS", 1, 0, false);
        declareFunction("nl_trie_repair_token_indexes", "NL-TRIE-REPAIR-TOKEN-INDEXES", 2, 0, false);
        declareFunction("nl_trie_prefix_keys_from_string", "NL-TRIE-PREFIX-KEYS-FROM-STRING", 2, 1, false);
        declareFunction("nl_trie_prefixes", "NL-TRIE-PREFIXES", 2, 1, false);
        declareFunction("nl_trie_prefixes_memoized_internal", "NL-TRIE-PREFIXES-MEMOIZED-INTERNAL", 3, 1, false);
        declareFunction("nl_trie_prefixes_memoized", "NL-TRIE-PREFIXES-MEMOIZED", 3, 1, false);
        declareFunction("nl_trie_filter_unquoted_entries", "NL-TRIE-FILTER-UNQUOTED-ENTRIES", 1, 0, false);
        declareFunction("nl_trie_unquoted_entry_okP", "NL-TRIE-UNQUOTED-ENTRY-OK?", 1, 0, false);
        declareFunction("nl_trie_access_case_sensitive_p", "NL-TRIE-ACCESS-CASE-SENSITIVE-P", 0, 0, false);
        declareFunction("nl_trie_prefix_key_jibes_with_alterationsP", "NL-TRIE-PREFIX-KEY-JIBES-WITH-ALTERATIONS?", 2, 0, false);
        declareFunction("nl_trie_find_original_prefix_key", "NL-TRIE-FIND-ORIGINAL-PREFIX-KEY", 3, 0, false);
        declareFunction("nl_trie_unknown_strings", "NL-TRIE-UNKNOWN-STRINGS", 2, 1, false);
        declareFunction("nl_trie_unknown_string_tokens", "NL-TRIE-UNKNOWN-STRING-TOKENS", 1, 2, false);
        declareFunction("index_covered_by_token_p", "INDEX-COVERED-BY-TOKEN-P", 2, 0, false);
        declareFunction("nl_trie_token_has_meaning_p", "NL-TRIE-TOKEN-HAS-MEANING-P", 1, 0, false);
        declareFunction("spelling_const_satisfiedP", "SPELLING-CONST-SATISFIED?", 2, 0, false);
        declareFunction("contains_periodP", "CONTAINS-PERIOD?", 1, 0, false);
        declareFunction("period_const_satisfiedP", "PERIOD-CONST-SATISFIED?", 3, 0, false);
        declareFunction("pos_pred_const_satisfiedP", "POS-PRED-CONST-SATISFIED?", 2, 0, false);
        declareFunction("nl_trie_record_filter_mt", "NL-TRIE-RECORD-FILTER-MT", 2, 0, false);
        declareFunction("gated_nl_trie_search", "GATED-NL-TRIE-SEARCH", 1, 2, false);
        declareFunction("nl_trie_filter_pragmatics", "NL-TRIE-FILTER-PRAGMATICS", 1, 1, false);
        declareFunction("nl_trie_remove_inappropriate_entries", "NL-TRIE-REMOVE-INAPPROPRIATE-ENTRIES", 1, 1, false);
        declareFunction("nl_trie_inappropriate_entryP", "NL-TRIE-INAPPROPRIATE-ENTRY?", 1, 1, false);
        new nl_trie_accessors.$nl_trie_inappropriate_entryP$UnaryFunction();
        new nl_trie_accessors.$nl_trie_inappropriate_entryP$BinaryFunction();
        declareFunction("nl_trie_entry_mt_okP", "NL-TRIE-ENTRY-MT-OK?", 1, 1, false);
        declareFunction("nl_trie_string_to_use", "NL-TRIE-STRING-TO-USE", 1, 0, false);
        declareFunction("nl_trie_match_string", "NL-TRIE-MATCH-STRING", 2, 0, false);
        declareMacro("do_supporting_trie_words", "DO-SUPPORTING-TRIE-WORDS");
        declareFunction("matching_word_strings_entryP", "MATCHING-WORD-STRINGS-ENTRY?", 2, 0, false);
        declareFunction("nl_trie_hl_justify_word_strings", "NL-TRIE-HL-JUSTIFY-WORD-STRINGS", 1, 0, false);
        declareFunction("nl_trie_hl_forward_mt_combos_word_strings", "NL-TRIE-HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false);
        declareFunction("nl_trie_get_term_phrases_supports", "NL-TRIE-GET-TERM-PHRASES-SUPPORTS", 5, 0, false);
        declareFunction("add_nl_trie_supports", "ADD-NL-TRIE-SUPPORTS", 5, 0, false);
        declareFunction("nl_trie_entry_matches_term_phrases_constraintP", "NL-TRIE-ENTRY-MATCHES-TERM-PHRASES-CONSTRAINT?", 3, 0, false);
        declareFunction("nl_trie_rotations", "NL-TRIE-ROTATIONS", 1, 0, false);
        declareFunction("nl_trie_index_item_print_function_trampoline", "NL-TRIE-INDEX-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("nl_trie_index_item_p", "NL-TRIE-INDEX-ITEM-P", 1, 0, false);
        new nl_trie_accessors.$nl_trie_index_item_p$UnaryFunction();
        declareFunction("nl_trie_index_item_term", "NL-TRIE-INDEX-ITEM-TERM", 1, 0, false);
        declareFunction("nl_trie_index_item_phrase", "NL-TRIE-INDEX-ITEM-PHRASE", 1, 0, false);
        declareFunction("nl_trie_index_item_mt", "NL-TRIE-INDEX-ITEM-MT", 1, 0, false);
        declareFunction("_csetf_nl_trie_index_item_term", "_CSETF-NL-TRIE-INDEX-ITEM-TERM", 2, 0, false);
        declareFunction("_csetf_nl_trie_index_item_phrase", "_CSETF-NL-TRIE-INDEX-ITEM-PHRASE", 2, 0, false);
        declareFunction("_csetf_nl_trie_index_item_mt", "_CSETF-NL-TRIE-INDEX-ITEM-MT", 2, 0, false);
        declareFunction("make_nl_trie_index_item", "MAKE-NL-TRIE-INDEX-ITEM", 0, 1, false);
        declareFunction("visit_defstruct_nl_trie_index_item", "VISIT-DEFSTRUCT-NL-TRIE-INDEX-ITEM", 2, 0, false);
        declareFunction("visit_defstruct_object_nl_trie_index_item_method", "VISIT-DEFSTRUCT-OBJECT-NL-TRIE-INDEX-ITEM-METHOD", 2, 0, false);
        declareFunction("new_nl_trie_index_item", "NEW-NL-TRIE-INDEX-ITEM", 3, 0, false);
        declareFunction("print_nl_trie_index_item", "PRINT-NL-TRIE-INDEX-ITEM", 3, 0, false);
        declareFunction("extract_nl_trie_indexing_data", "EXTRACT-NL-TRIE-INDEXING-DATA", 2, 0, false);
        declareFunction("extract_nl_trie_indexing_data_from_entry", "EXTRACT-NL-TRIE-INDEXING-DATA-FROM-ENTRY", 2, 0, false);
        declareFunction("force_nl_trie_rotation_index_initialization", "FORCE-NL-TRIE-ROTATION-INDEX-INITIALIZATION", 0, 1, false);
        declareFunction("initialize_nl_trie_rotation_index", "INITIALIZE-NL-TRIE-ROTATION-INDEX", 0, 1, false);
        declareFunction("nl_trie_rotation_index_initializedP", "NL-TRIE-ROTATION-INDEX-INITIALIZED?", 0, 0, false);
        declareFunction("nl_trie_rotation_index_initialization_practical_p", "NL-TRIE-ROTATION-INDEX-INITIALIZATION-PRACTICAL-P", 0, 0, false);
        declareFunction("create_nl_trie_rotation_index", "CREATE-NL-TRIE-ROTATION-INDEX", 0, 2, false);
        declareFunction("update_nl_trie_rotation_index", "UPDATE-NL-TRIE-ROTATION-INDEX", 1, 2, false);
        declareFunction("nl_trie_matching_phrases", "NL-TRIE-MATCHING-PHRASES", 2, 0, false);
        declareFunction("nl_trie_matching_phrases_substring", "NL-TRIE-MATCHING-PHRASES-SUBSTRING", 2, 0, false);
        declareFunction("nl_trie_matching_phrases_inverted_index", "NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX", 1, 0, false);
        declareFunction("nl_trie_matches_from_dictionary", "NL-TRIE-MATCHES-FROM-DICTIONARY", 2, 0, false);
        declareFunction("nl_trie_search_strings_from_pattern", "NL-TRIE-SEARCH-STRINGS-FROM-PATTERN", 1, 0, false);
        declareFunction("dump_nl_trie_spellchecker_strings", "DUMP-NL-TRIE-SPELLCHECKER-STRINGS", 0, 4, false);
        declareFunction("stress_test_nl_trie_search_concurrent_swapping", "STRESS-TEST-NL-TRIE-SEARCH-CONCURRENT-SWAPPING", 0, 2, false);
        declareFunction("stress_test_nl_trie_search", "STRESS-TEST-NL-TRIE-SEARCH", 3, 0, false);
        declareFunction("stress_test_nl_trie_prefixes_concurrent_swapping", "STRESS-TEST-NL-TRIE-PREFIXES-CONCURRENT-SWAPPING", 0, 2, false);
        declareFunction("stress_test_nl_trie_prefixes", "STRESS-TEST-NL-TRIE-PREFIXES", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_nl_trie_accessors_file_alt() {
        deflexical("*WORD-EXTERNAL-PUNCTUATION-CHARS*", $list_alt56);
        deflexical("*DENOTATION-MAPPING-BREAK-CHARS*", cconcatenate($word_external_punctuation_chars$.getGlobalValue(), string_utilities.whitespace_chars()));
        defparameter("*NL-TRIE-CHECK-SEMANTIC-MT?*", NIL);
        deflexical("*NL-TRIE-ROTATION-INDEX*", NIL != boundp($nl_trie_rotation_index$) ? ((SubLObject) ($nl_trie_rotation_index$.getGlobalValue())) : NIL);
        deflexical("*NL-TRIE-ROTATE-CHARACTERS*", $list_alt117);
        defconstant("*NL-TRIE-ROTATE-POINT-CHAR*", CHAR_vertical);
        defconstant("*NL-TRIE-ROTATE-POINT-STRING*", Strings.string($nl_trie_rotate_point_char$.getGlobalValue()));
        deflexical("*NL-TRIE-STOPLIST-TRIE*", NIL != boundp($nl_trie_stoplist_trie$) ? ((SubLObject) ($nl_trie_stoplist_trie$.getGlobalValue())) : NIL);
        defconstant("*DTP-NL-TRIE-INDEX-ITEM*", NL_TRIE_INDEX_ITEM);
        deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-TEST-THREADS*", TWENTY_INTEGER);
        deflexical("*DEFAULT-STRING-TEST-COUNT*", $int$500);
        return NIL;
    }

    public static SubLObject init_nl_trie_accessors_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*WORD-EXTERNAL-PUNCTUATION-CHARS*", nl_trie_accessors.$list55);
            deflexical("*DENOTATION-MAPPING-BREAK-CHARS*", cconcatenate(nl_trie_accessors.$word_external_punctuation_chars$.getGlobalValue(), string_utilities.whitespace_chars()));
            defparameter("*NL-TRIE-CHECK-SEMANTIC-MT?*", NIL);
            deflexical("*NL-TRIE-ROTATION-INDEX*", SubLTrampolineFile.maybeDefault(nl_trie_accessors.$nl_trie_rotation_index$, nl_trie_accessors.$nl_trie_rotation_index$, NIL));
            deflexical("*NL-TRIE-ROTATE-CHARACTERS*", nl_trie_accessors.$list121);
            defconstant("*NL-TRIE-ROTATE-POINT-CHAR*", CHAR_vertical);
            defconstant("*NL-TRIE-ROTATE-POINT-STRING*", Strings.string(nl_trie_accessors.$nl_trie_rotate_point_char$.getGlobalValue()));
            deflexical("*NL-TRIE-STOPLIST-TRIE*", SubLTrampolineFile.maybeDefault(nl_trie_accessors.$nl_trie_stoplist_trie$, nl_trie_accessors.$nl_trie_stoplist_trie$, NIL));
            defconstant("*DTP-NL-TRIE-INDEX-ITEM*", nl_trie_accessors.NL_TRIE_INDEX_ITEM);
            deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-TEST-THREADS*", TWENTY_INTEGER);
            deflexical("*DEFAULT-STRING-TEST-COUNT*", nl_trie_accessors.$int$500);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*WORD-EXTERNAL-PUNCTUATION-CHARS*", $list_alt56);
            deflexical("*NL-TRIE-ROTATION-INDEX*", NIL != boundp($nl_trie_rotation_index$) ? ((SubLObject) ($nl_trie_rotation_index$.getGlobalValue())) : NIL);
            deflexical("*NL-TRIE-ROTATE-CHARACTERS*", $list_alt117);
            deflexical("*NL-TRIE-STOPLIST-TRIE*", NIL != boundp($nl_trie_stoplist_trie$) ? ((SubLObject) ($nl_trie_stoplist_trie$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_nl_trie_accessors_file_Previous() {
        deflexical("*WORD-EXTERNAL-PUNCTUATION-CHARS*", nl_trie_accessors.$list55);
        deflexical("*DENOTATION-MAPPING-BREAK-CHARS*", cconcatenate(nl_trie_accessors.$word_external_punctuation_chars$.getGlobalValue(), string_utilities.whitespace_chars()));
        defparameter("*NL-TRIE-CHECK-SEMANTIC-MT?*", NIL);
        deflexical("*NL-TRIE-ROTATION-INDEX*", SubLTrampolineFile.maybeDefault(nl_trie_accessors.$nl_trie_rotation_index$, nl_trie_accessors.$nl_trie_rotation_index$, NIL));
        deflexical("*NL-TRIE-ROTATE-CHARACTERS*", nl_trie_accessors.$list121);
        defconstant("*NL-TRIE-ROTATE-POINT-CHAR*", CHAR_vertical);
        defconstant("*NL-TRIE-ROTATE-POINT-STRING*", Strings.string(nl_trie_accessors.$nl_trie_rotate_point_char$.getGlobalValue()));
        deflexical("*NL-TRIE-STOPLIST-TRIE*", SubLTrampolineFile.maybeDefault(nl_trie_accessors.$nl_trie_stoplist_trie$, nl_trie_accessors.$nl_trie_stoplist_trie$, NIL));
        defconstant("*DTP-NL-TRIE-INDEX-ITEM*", nl_trie_accessors.NL_TRIE_INDEX_ITEM);
        deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-TEST-THREADS*", TWENTY_INTEGER);
        deflexical("*DEFAULT-STRING-TEST-COUNT*", nl_trie_accessors.$int$500);
        return NIL;
    }

    public static final SubLObject setup_nl_trie_accessors_file_alt() {
        memoization_state.note_memoized_function($sym52$NL_TRIE_STRING_IS_POS_);
        memoization_state.note_memoized_function(NL_TRIE_PREFIXES_MEMOIZED);
        register_macro_helper($sym110$MATCHING_WORD_STRINGS_ENTRY_, DO_SUPPORTING_TRIE_WORDS);
        declare_defglobal($nl_trie_rotation_index$);
        declare_defglobal($nl_trie_stoplist_trie$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_nl_trie_index_item$.getGlobalValue(), symbol_function(NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(NL_TRIE_INDEX_ITEM_TERM, _CSETF_NL_TRIE_INDEX_ITEM_TERM);
        def_csetf(NL_TRIE_INDEX_ITEM_PHRASE, _CSETF_NL_TRIE_INDEX_ITEM_PHRASE);
        def_csetf(NL_TRIE_INDEX_ITEM_MT, _CSETF_NL_TRIE_INDEX_ITEM_MT);
        identity(NL_TRIE_INDEX_ITEM);
        return NIL;
    }

    public static SubLObject setup_nl_trie_accessors_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_);
            memoization_state.note_memoized_function(nl_trie_accessors.NL_TRIE_PREFIXES_MEMOIZED);
            register_macro_helper(nl_trie_accessors.$sym109$MATCHING_WORD_STRINGS_ENTRY_, nl_trie_accessors.DO_SUPPORTING_TRIE_WORDS);
            declare_defglobal(nl_trie_accessors.$nl_trie_rotation_index$);
            declare_defglobal(nl_trie_accessors.$nl_trie_stoplist_trie$);
            register_method($print_object_method_table$.getGlobalValue(), nl_trie_accessors.$dtp_nl_trie_index_item$.getGlobalValue(), symbol_function(nl_trie_accessors.NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(nl_trie_accessors.$list132);
            def_csetf(nl_trie_accessors.NL_TRIE_INDEX_ITEM_TERM, nl_trie_accessors._CSETF_NL_TRIE_INDEX_ITEM_TERM);
            def_csetf(nl_trie_accessors.NL_TRIE_INDEX_ITEM_PHRASE, nl_trie_accessors._CSETF_NL_TRIE_INDEX_ITEM_PHRASE);
            def_csetf(nl_trie_accessors.NL_TRIE_INDEX_ITEM_MT, nl_trie_accessors._CSETF_NL_TRIE_INDEX_ITEM_MT);
            identity(nl_trie_accessors.NL_TRIE_INDEX_ITEM);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nl_trie_accessors.$dtp_nl_trie_index_item$.getGlobalValue(), symbol_function(nl_trie_accessors.VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD));
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper($sym110$MATCHING_WORD_STRINGS_ENTRY_, DO_SUPPORTING_TRIE_WORDS);
        }
        return NIL;
    }

    public static SubLObject setup_nl_trie_accessors_file_Previous() {
        memoization_state.note_memoized_function(nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_);
        memoization_state.note_memoized_function(nl_trie_accessors.NL_TRIE_PREFIXES_MEMOIZED);
        register_macro_helper(nl_trie_accessors.$sym109$MATCHING_WORD_STRINGS_ENTRY_, nl_trie_accessors.DO_SUPPORTING_TRIE_WORDS);
        declare_defglobal(nl_trie_accessors.$nl_trie_rotation_index$);
        declare_defglobal(nl_trie_accessors.$nl_trie_stoplist_trie$);
        register_method($print_object_method_table$.getGlobalValue(), nl_trie_accessors.$dtp_nl_trie_index_item$.getGlobalValue(), symbol_function(nl_trie_accessors.NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(nl_trie_accessors.$list132);
        def_csetf(nl_trie_accessors.NL_TRIE_INDEX_ITEM_TERM, nl_trie_accessors._CSETF_NL_TRIE_INDEX_ITEM_TERM);
        def_csetf(nl_trie_accessors.NL_TRIE_INDEX_ITEM_PHRASE, nl_trie_accessors._CSETF_NL_TRIE_INDEX_ITEM_PHRASE);
        def_csetf(nl_trie_accessors.NL_TRIE_INDEX_ITEM_MT, nl_trie_accessors._CSETF_NL_TRIE_INDEX_ITEM_MT);
        identity(nl_trie_accessors.NL_TRIE_INDEX_ITEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nl_trie_accessors.$dtp_nl_trie_index_item$.getGlobalValue(), symbol_function(nl_trie_accessors.VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        nl_trie_accessors.declare_nl_trie_accessors_file();
    }

    @Override
    public void initializeVariables() {
        nl_trie_accessors.init_nl_trie_accessors_file();
    }

    @Override
    public void runTopLevelForms() {
        nl_trie_accessors.setup_nl_trie_accessors_file();
    }

    

    public static final class $nl_trie_inappropriate_entryP$UnaryFunction extends UnaryFunction {
        public $nl_trie_inappropriate_entryP$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-INAPPROPRIATE-ENTRY?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_accessors.nl_trie_inappropriate_entryP(arg1, nl_trie_accessors.$nl_trie_inappropriate_entryP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $nl_trie_inappropriate_entryP$BinaryFunction extends BinaryFunction {
        public $nl_trie_inappropriate_entryP$BinaryFunction() {
            super(extractFunctionNamed("NL-TRIE-INAPPROPRIATE-ENTRY?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return nl_trie_accessors.nl_trie_inappropriate_entryP(arg1, arg2);
        }
    }

    public static final class $nl_trie_index_item_p$UnaryFunction extends UnaryFunction {
        public $nl_trie_index_item_p$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-INDEX-ITEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_accessors.nl_trie_index_item_p(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("ENTRY"), makeSymbol("&KEY"), makeSymbol("STRING"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("STRING"), $DONE);

    static private final SubLList $list_alt11 = list(list(new SubLObject[]{ makeSymbol("ENTRY-VAR"), makeSymbol("STRING"), makeSymbol("LOOKUP-MT"), makeSymbol("&KEY"), list(makeSymbol("ENTRY-TYPE"), makeKeyword("ANY")), list(makeSymbol("CHECK-PERIOD?"), T), list(makeSymbol("MISSPELLINGS?"), list(QUOTE, makeSymbol("*MISSPELLINGS?*"))), list(makeSymbol("CASE-SENSITIVITY"), list(QUOTE, makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"))), list(makeSymbol("CHECK-SEMANTIC-MT?"), NIL) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt12 = list(makeKeyword("ENTRY-TYPE"), makeKeyword("CHECK-PERIOD?"), makeKeyword("MISSPELLINGS?"), makeKeyword("CASE-SENSITIVITY"), makeKeyword("CHECK-SEMANTIC-MT?"));

    static private final SubLList $list_alt34 = list(list(makeSymbol("ENTRY-VAR"), makeSymbol("STRING"), makeSymbol("LOOKUP-MT"), makeSymbol("&KEY"), list(makeSymbol("CHECK-PERIOD?"), T), list(makeSymbol("MISSPELLINGS?"), list(QUOTE, makeSymbol("*MISSPELLINGS?*"))), list(makeSymbol("CASE-SENSITIVITY"), list(QUOTE, makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"))), list(makeSymbol("CHECK-SEMANTIC-MT?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt35 = list(makeKeyword("CHECK-PERIOD?"), makeKeyword("MISSPELLINGS?"), makeKeyword("CASE-SENSITIVITY"), makeKeyword("CHECK-SEMANTIC-MT?"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("ENTRY-VAR"), makeSymbol("STRING"), makeSymbol("LOOKUP-MT"), makeSymbol("&KEY"), list(makeSymbol("CHECK-PERIOD?"), NIL), list(makeSymbol("MISSPELLINGS?"), list(QUOTE, makeSymbol("*MISSPELLINGS?*"))), list(makeSymbol("CASE-SENSITIVITY"), list(QUOTE, makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt39 = list(makeKeyword("CHECK-PERIOD?"), makeKeyword("MISSPELLINGS?"), makeKeyword("CASE-SENSITIVITY"));

    static private final SubLList $list_alt41 = list(makeSymbol("NEW-ENTRY"), makeSymbol("DENOT-LIST"), makeSymbol("PRED-LIST"), makeSymbol("&KEY"), list(makeSymbol("SKIP-CONSTRAINTS?"), NIL), list(makeSymbol("ABBREV-TYPES"), NIL), list(makeSymbol("DENOT-TYPE"), makeKeyword("DENOT")), list(makeSymbol("SKIP-NAMESTRINGS?"), NIL));

    static private final SubLList $list_alt42 = list(makeKeyword("SKIP-CONSTRAINTS?"), makeKeyword("ABBREV-TYPES"), makeKeyword("DENOT-TYPE"), makeKeyword("SKIP-NAMESTRINGS?"));

    static private final SubLList $list_alt50 = list(makeSymbol("NEW-DENOTS"), makeSymbol("DENOT-LIST"), makeSymbol("NEW-PREDS"), makeSymbol("PRED-LIST"));

    public static final SubLSymbol $kw54$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt56 = list(new SubLObject[]{ CHAR_comma, CHAR_period, CHAR_question, CHAR_exclamation, CHAR_ampersand, CHAR_exclamation, CHAR_quotation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_slash });

    static private final SubLList $list_alt58 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

    static private final SubLSymbol $sym59$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    static private final SubLString $str_alt61$the_ = makeString("the ");

    static private final SubLSymbol $sym67$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    static private final SubLSymbol $sym68$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");

    static private final SubLList $list_alt76 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("denotationRelatedTo"), reader_make_constant_shell("denotationPlaceholder"));

    static private final SubLSymbol $sym80$_ = makeSymbol(">");

    static private final SubLSymbol $sym82$_ = makeSymbol("<");

    static private final SubLList $list_alt84 = cons(makeSymbol("INDEX"), makeSymbol("NUM-TOKENS"));

    static private final SubLList $list_alt86 = list(makeKeyword("ON"), makeKeyword("PREFERRED"));

    static private final SubLString $str_alt87$Invalid_case_sensitivity_value_fo = makeString("Invalid case-sensitivity value for NL-TRIE-PREFIXES: ~S");

    static private final SubLList $list_alt93 = list(reader_make_constant_shell("EverythingPSC"), reader_make_constant_shell("InferencePSC"));

    static private final SubLSymbol $sym96$NL_TRIE_INAPPROPRIATE_ENTRY_ = makeSymbol("NL-TRIE-INAPPROPRIATE-ENTRY?");

    static private final SubLSymbol $sym97$PRAGMATICALLY_ACCEPTABLE_ = makeSymbol("PRAGMATICALLY-ACCEPTABLE?");

    static private final SubLList $list_alt99 = list(makeSymbol("KEY"), makeSymbol("SUBNODE"));

    static private final SubLString $str_alt100$Found_non_matching_string___S_vs_ = makeString("Found non-matching string: ~S vs. ~S");

    static private final SubLList $list_alt101 = list(list(makeSymbol("WORD"), makeSymbol("SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt102 = list($DONE);

    static private final SubLSymbol $sym103$ASENT = makeUninternedSymbol("ASENT");

    static private final SubLSymbol $sym104$MT = makeUninternedSymbol("MT");

    static private final SubLSymbol $sym110$MATCHING_WORD_STRINGS_ENTRY_ = makeSymbol("MATCHING-WORD-STRINGS-ENTRY?");

    static private final SubLList $list_alt112 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    static private final SubLList $list_alt113 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLSymbol $sym114$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLString $str_alt115$Don_t_know_how_to_check__S_agains = makeString("Don't know how to check ~S against ~S");

    static private final SubLList $list_alt117 = list(CHAR_space, CHAR_hyphen);

    static private final SubLString $str_alt119$tried_to_determine_rotations_for_ = makeString("tried to determine rotations for a non-string: ~S~%");

    static private final SubLList $list_alt122 = list(makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT"));

    static private final SubLList $list_alt123 = list($TERM, makeKeyword("PHRASE"), makeKeyword("MT"));

    static private final SubLList $list_alt124 = list(makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("NL-TRIE-INDEX-ITEM-PHRASE"), makeSymbol("NL-TRIE-INDEX-ITEM-MT"));

    static private final SubLList $list_alt125 = list(makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-PHRASE"), makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-MT"));

    static private final SubLString $str_alt137$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt138$_NL_TRIE_INDEX_ITEM__s__s__a_ = makeString("<NL-TRIE-INDEX-ITEM:~s:~s:~a>");

    static private final SubLString $str_alt142$Creating_NL_trie_rotation_index__ = makeString("Creating NL trie rotation index...");

    static private final SubLList $list_alt143 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    static private final SubLList $list_alt144 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    static private final SubLSymbol $sym152$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str_alt154$The_NL_Trie_must_be_initialized_b = makeString("The NL Trie must be initialized before it can be dumped.");

    static private final SubLString $str_alt155$Dumping_NL_Trie_spellchecker_stri = makeString("Dumping NL Trie spellchecker strings...");

    static private final SubLString $str_alt157$Concurrent_NL_Trie_Search_Stress_ = makeString("Concurrent NL-Trie Search Stress Test Problems");

    static private final SubLString $str_alt160$Concurrent_NL_Trie_Searches_ = makeString("Concurrent NL Trie Searches ");

    static private final SubLString $str_alt164$Concurrent_NL_Trie_Prefixes_Stres = makeString("Concurrent NL-Trie Prefixes Stress Test Problems");

    static private final SubLString $str_alt165$Concurrent_NL_Trie_Prefixes_ = makeString("Concurrent NL Trie Prefixes ");
}

/**
 * Total time: 1536 ms
 */
