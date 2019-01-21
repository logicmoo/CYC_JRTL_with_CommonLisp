package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_trie_accessors extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_trie_accessors";
    public static final String myFingerPrint = "da4eb28e4277e9a83a08566126bd704d534c971190329ae2aff7a21aad1962c3";
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 26000L)
    public static SubLSymbol $word_external_punctuation_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 26335L)
    public static SubLSymbol $denotation_mapping_break_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67108L)
    private static SubLSymbol $nl_trie_check_semantic_mtP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 75514L)
    private static SubLSymbol $nl_trie_rotation_index$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 75902L)
    private static SubLSymbol $nl_trie_rotate_characters$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76043L)
    private static SubLSymbol $nl_trie_rotate_point_char$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76195L)
    private static SubLSymbol $nl_trie_rotate_point_string$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76348L)
    private static SubLSymbol $nl_trie_stoplist_trie$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLSymbol $dtp_nl_trie_index_item$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 86760L)
    public static SubLSymbol $default_number_of_concurrent_test_threads$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 86831L)
    public static SubLSymbol $default_string_test_count$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$STRING;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$KEY;
    private static final SubLSymbol $sym6$ENTRIES;
    private static final SubLSymbol $sym7$DO_NL_TRIE;
    private static final SubLSymbol $sym8$CSOME;
    private static final SubLSymbol $sym9$CSETQ;
    private static final SubLSymbol $sym10$NL_TRIE_ENTRY_STRING;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$ENTRY_TYPE;
    private static final SubLSymbol $kw14$ANY;
    private static final SubLSymbol $kw15$CHECK_PERIOD_;
    private static final SubLSymbol $kw16$MISSPELLINGS_;
    private static final SubLSymbol $sym17$_MISSPELLINGS__;
    private static final SubLSymbol $kw18$CASE_SENSITIVITY;
    private static final SubLSymbol $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
    private static final SubLSymbol $kw20$CHECK_SEMANTIC_MT_;
    private static final SubLSymbol $sym21$ENTRIES;
    private static final SubLSymbol $sym22$CLET;
    private static final SubLSymbol $sym23$_LEXICON_LOOKUP_MT_;
    private static final SubLSymbol $sym24$GATED_NL_TRIE_SEARCH;
    private static final SubLSymbol $sym25$CDOLIST;
    private static final SubLSymbol $sym26$PWHEN;
    private static final SubLSymbol $sym27$CAND;
    private static final SubLSymbol $sym28$COR;
    private static final SubLSymbol $sym29$NL_TRIE_ENTRY_TYPE;
    private static final SubLSymbol $sym30$FIMPLIES;
    private static final SubLSymbol $sym31$PERIOD_CONST_SATISFIED_;
    private static final SubLSymbol $sym32$CONTAINS_PERIOD_;
    private static final SubLSymbol $sym33$SPELLING_CONST_SATISFIED_;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$DO_NL_TRIE_ENTRIES_FOR_STRING;
    private static final SubLSymbol $kw37$WORD;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $kw40$NAME;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$SKIP_CONSTRAINTS_;
    private static final SubLSymbol $kw44$ABBREV_TYPES;
    private static final SubLSymbol $kw45$DENOT_TYPE;
    private static final SubLSymbol $kw46$DENOT;
    private static final SubLSymbol $kw47$SKIP_NAMESTRINGS_;
    private static final SubLSymbol $sym48$CMULTIPLE_VALUE_SETQ;
    private static final SubLSymbol $sym49$ADD_NEW_ENTRY;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$ADD_NEW_DENOTS_AND_PREDS;
    private static final SubLSymbol $sym52$NL_TRIE_STRING_IS_POS_;
    private static final SubLInteger $int53$4096;
    private static final SubLObject $const54$partOfSpeech;
    private static final SubLList $list55;
    private static final SubLSymbol $kw56$GREEDY;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$GENL_POS_PRED_;
    private static final SubLSymbol $sym59$STRINGP;
    private static final SubLString $str60$the_;
    private static final SubLObject $const61$acronymString;
    private static final SubLObject $const62$InferencePSC;
    private static final SubLSymbol $kw63$SEMTRANS_TEMPLATE;
    private static final SubLObject $const64$nameSpelling;
    private static final SubLObject $const65$commonNickname;
    private static final SubLSymbol $sym66$SPEECH_PART_PRED_;
    private static final SubLSymbol $sym67$SPEC_POS_PRED_;
    private static final SubLSymbol $sym68$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const69$EverythingPSC;
    private static final SubLSymbol $sym70$RELEVANT_MT_IS_ANY_MT;
    private static final SubLSymbol $sym71$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym72$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw73$ACRONYMS;
    private static final SubLSymbol $kw74$ABBREVS;
    private static final SubLList $list75;
    private static final SubLSymbol $kw76$INTERVAL;
    private static final SubLSymbol $kw77$OFF;
    private static final SubLSymbol $kw78$ON;
    private static final SubLSymbol $sym79$_;
    private static final SubLSymbol $sym80$INTERVAL_TOKEN_LENGTH;
    private static final SubLSymbol $sym81$_;
    private static final SubLSymbol $sym82$INTERVAL_TOKEN_START;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$NL_TRIE_P;
    private static final SubLList $list85;
    private static final SubLString $str86$Invalid_case_sensitivity_value_fo;
    private static final SubLSymbol $sym87$NL_TRIE_PREFIXES_MEMOIZED;
    private static final SubLInteger $int88$512;
    private static final SubLObject $const89$titleOfWork;
    private static final SubLSymbol $sym90$INDEX_COVERED_BY_TOKEN_P;
    private static final SubLObject $const91$CommonEnglishMisspellingsMt;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$PREFERRED;
    private static final SubLSymbol $kw94$ABORTED;
    private static final SubLSymbol $sym95$NL_TRIE_INAPPROPRIATE_ENTRY_;
    private static final SubLSymbol $sym96$PRAGMATICALLY_ACCEPTABLE_;
    private static final SubLSymbol $sym97$FIRST;
    private static final SubLList $list98;
    private static final SubLString $str99$Found_non_matching_string___S_vs_;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$ASENT;
    private static final SubLSymbol $sym103$MT;
    private static final SubLSymbol $sym104$SUPPORT_SENTENCE;
    private static final SubLSymbol $sym105$SUPPORT_MT;
    private static final SubLSymbol $sym106$DO_NL_TRIE_WORD_ENTRIES_FOR_STRING;
    private static final SubLSymbol $sym107$ATOMIC_SENTENCE_ARG2;
    private static final SubLSymbol $sym108$CNOT;
    private static final SubLSymbol $sym109$MATCHING_WORD_STRINGS_ENTRY_;
    private static final SubLSymbol $sym110$DO_SUPPORTING_TRIE_WORDS;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$EQUALS_EL_;
    private static final SubLList $list114;
    private static final SubLObject $const115$NounPhrase;
    private static final SubLObject $const116$ProperNameString;
    private static final SubLObject $const117$NLPhrase;
    private static final SubLObject $const118$phrase_Bar1;
    private static final SubLString $str119$Don_t_know_how_to_check__S_agains;
    private static final SubLSymbol $sym120$_NL_TRIE_ROTATION_INDEX_;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$_NL_TRIE_STOPLIST_TRIE_;
    private static final SubLString $str123$tried_to_determine_rotations_for_;
    private static final SubLSymbol $sym124$NL_TRIE_INDEX_ITEM;
    private static final SubLSymbol $sym125$NL_TRIE_INDEX_ITEM_P;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$PRINT_NL_TRIE_INDEX_ITEM;
    private static final SubLSymbol $sym131$NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$NL_TRIE_INDEX_ITEM_TERM;
    private static final SubLSymbol $sym134$_CSETF_NL_TRIE_INDEX_ITEM_TERM;
    private static final SubLSymbol $sym135$NL_TRIE_INDEX_ITEM_PHRASE;
    private static final SubLSymbol $sym136$_CSETF_NL_TRIE_INDEX_ITEM_PHRASE;
    private static final SubLSymbol $sym137$NL_TRIE_INDEX_ITEM_MT;
    private static final SubLSymbol $sym138$_CSETF_NL_TRIE_INDEX_ITEM_MT;
    private static final SubLSymbol $kw139$TERM;
    private static final SubLSymbol $kw140$PHRASE;
    private static final SubLSymbol $kw141$MT;
    private static final SubLString $str142$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw143$BEGIN;
    private static final SubLSymbol $sym144$MAKE_NL_TRIE_INDEX_ITEM;
    private static final SubLSymbol $kw145$SLOT;
    private static final SubLSymbol $kw146$END;
    private static final SubLSymbol $sym147$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD;
    private static final SubLString $str148$_NL_TRIE_INDEX_ITEM__s__s__a_;
    private static final SubLSymbol $kw149$DENOTS;
    private static final SubLString $str150$nl_trie_rotation_stop_list;
    private static final SubLString $str151$nl_trie_rotation_index;
    private static final SubLString $str152$Creating_NL_trie_rotation_index__;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$TRIE_REMOVE;
    private static final SubLSymbol $sym156$TRIE_INSERT;
    private static final SubLSymbol $kw157$INFIX;
    private static final SubLSymbol $kw158$PREFIX;
    private static final SubLSymbol $sym159$STARTS_WITH;
    private static final SubLSymbol $kw160$SUFFIX;
    private static final SubLSymbol $sym161$ENDS_WITH;
    private static final SubLSymbol $sym162$STRING_;
    private static final SubLSymbol $sym163$LESSER_LENGTH_P;
    private static final SubLString $str164$The_NL_Trie_must_be_initialized_b;
    private static final SubLString $str165$Dumping_NL_Trie_spellchecker_stri;
    private static final SubLInteger $int166$500;
    private static final SubLString $str167$Concurrent_NL_Trie_Search_Stress_;
    private static final SubLObject $const168$nameString;
    private static final SubLSymbol $kw169$GAF;
    private static final SubLString $str170$Concurrent_NL_Trie_Searches_;
    private static final SubLSymbol $sym171$STRESS_TEST_NL_TRIE_SEARCH;
    private static final SubLSymbol $sym172$VALID_PROCESS_P;
    private static final SubLSymbol $sym173$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str174$Concurrent_NL_Trie_Prefixes_Stres;
    private static final SubLString $str175$Concurrent_NL_Trie_Prefixes_;
    private static final SubLSymbol $sym176$STRESS_TEST_NL_TRIE_PREFIXES;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 5326L)
    public static SubLObject do_nl_trie_entries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list0);
        entry = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current_$1 = (SubLObject)nl_trie_accessors.NIL;
        while (nl_trie_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list0);
            if (nl_trie_accessors.NIL == conses_high.member(current_$1, (SubLObject)nl_trie_accessors.$list1, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                bad = (SubLObject)nl_trie_accessors.T;
            }
            if (current_$1 == nl_trie_accessors.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie_accessors.NIL != bad && nl_trie_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list0);
        }
        final SubLObject string_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw3$STRING, current);
        final SubLObject string = (SubLObject)((nl_trie_accessors.NIL != string_tail) ? conses_high.cadr(string_tail) : nl_trie_accessors.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((nl_trie_accessors.NIL != done_tail) ? conses_high.cadr(done_tail) : nl_trie_accessors.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject key = (SubLObject)nl_trie_accessors.$sym5$KEY;
        final SubLObject entries = (SubLObject)nl_trie_accessors.$sym6$ENTRIES;
        if (nl_trie_accessors.NIL != string) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym7$DO_NL_TRIE, (SubLObject)ConsesLow.list(key, entries, (SubLObject)nl_trie_accessors.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)nl_trie_accessors.$sym8$CSOME, (SubLObject)ConsesLow.list(entry, entries, done), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym9$CSETQ, string, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym10$NL_TRIE_ENTRY_STRING, entry)), ConsesLow.append(body, (SubLObject)nl_trie_accessors.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym7$DO_NL_TRIE, (SubLObject)ConsesLow.list(key, entries, (SubLObject)nl_trie_accessors.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)nl_trie_accessors.$sym8$CSOME, (SubLObject)ConsesLow.list(entry, entries, done), ConsesLow.append(body, (SubLObject)nl_trie_accessors.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 6169L)
    public static SubLObject do_nl_trie_entries_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry_var = (SubLObject)nl_trie_accessors.NIL;
        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
        SubLObject lookup_mt = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list11);
        entry_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list11);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list11);
        lookup_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current_$2 = (SubLObject)nl_trie_accessors.NIL;
        while (nl_trie_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list11);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list11);
            if (nl_trie_accessors.NIL == conses_high.member(current_$2, (SubLObject)nl_trie_accessors.$list12, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                bad = (SubLObject)nl_trie_accessors.T;
            }
            if (current_$2 == nl_trie_accessors.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie_accessors.NIL != bad && nl_trie_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list11);
        }
        final SubLObject entry_type_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw13$ENTRY_TYPE, current);
        final SubLObject entry_type = (SubLObject)((nl_trie_accessors.NIL != entry_type_tail) ? conses_high.cadr(entry_type_tail) : nl_trie_accessors.$kw14$ANY);
        final SubLObject check_periodP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw15$CHECK_PERIOD_, current);
        final SubLObject check_periodP = (SubLObject)((nl_trie_accessors.NIL != check_periodP_tail) ? conses_high.cadr(check_periodP_tail) : nl_trie_accessors.T);
        final SubLObject misspellingsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw16$MISSPELLINGS_, current);
        final SubLObject misspellingsP = (SubLObject)((nl_trie_accessors.NIL != misspellingsP_tail) ? conses_high.cadr(misspellingsP_tail) : nl_trie_accessors.$sym17$_MISSPELLINGS__);
        final SubLObject case_sensitivity_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw18$CASE_SENSITIVITY, current);
        final SubLObject case_sensitivity = (SubLObject)((nl_trie_accessors.NIL != case_sensitivity_tail) ? conses_high.cadr(case_sensitivity_tail) : nl_trie_accessors.$sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_);
        final SubLObject check_semantic_mtP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw20$CHECK_SEMANTIC_MT_, current);
        final SubLObject check_semantic_mtP = (SubLObject)((nl_trie_accessors.NIL != check_semantic_mtP_tail) ? conses_high.cadr(check_semantic_mtP_tail) : nl_trie_accessors.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject entries = (SubLObject)nl_trie_accessors.$sym21$ENTRIES;
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym23$_LEXICON_LOOKUP_MT_, lookup_mt), (SubLObject)ConsesLow.list(entries, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym24$GATED_NL_TRIE_SEARCH, string, case_sensitivity, check_semantic_mtP))), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym25$CDOLIST, (SubLObject)ConsesLow.list(entry_var, entries), (SubLObject)ConsesLow.listS((SubLObject)nl_trie_accessors.$sym26$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym27$CAND, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym28$COR, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.EQ, (SubLObject)nl_trie_accessors.$kw14$ANY, entry_type), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.EQ, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym29$NL_TRIE_ENTRY_TYPE, entry_var), entry_type)), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym30$FIMPLIES, check_periodP, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym31$PERIOD_CONST_SATISFIED_, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym32$CONTAINS_PERIOD_, string), entry_var, string)), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym33$SPELLING_CONST_SATISFIED_, misspellingsP, entry_var)), ConsesLow.append(body, (SubLObject)nl_trie_accessors.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 7204L)
    public static SubLObject do_nl_trie_word_entries_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry_var = (SubLObject)nl_trie_accessors.NIL;
        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
        SubLObject lookup_mt = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list34);
        entry_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list34);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list34);
        lookup_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current_$3 = (SubLObject)nl_trie_accessors.NIL;
        while (nl_trie_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list34);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list34);
            if (nl_trie_accessors.NIL == conses_high.member(current_$3, (SubLObject)nl_trie_accessors.$list35, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                bad = (SubLObject)nl_trie_accessors.T;
            }
            if (current_$3 == nl_trie_accessors.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie_accessors.NIL != bad && nl_trie_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list34);
        }
        final SubLObject check_periodP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw15$CHECK_PERIOD_, current);
        final SubLObject check_periodP = (SubLObject)((nl_trie_accessors.NIL != check_periodP_tail) ? conses_high.cadr(check_periodP_tail) : nl_trie_accessors.T);
        final SubLObject misspellingsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw16$MISSPELLINGS_, current);
        final SubLObject misspellingsP = (SubLObject)((nl_trie_accessors.NIL != misspellingsP_tail) ? conses_high.cadr(misspellingsP_tail) : nl_trie_accessors.$sym17$_MISSPELLINGS__);
        final SubLObject case_sensitivity_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw18$CASE_SENSITIVITY, current);
        final SubLObject case_sensitivity = (SubLObject)((nl_trie_accessors.NIL != case_sensitivity_tail) ? conses_high.cadr(case_sensitivity_tail) : nl_trie_accessors.$sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_);
        final SubLObject check_semantic_mtP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw20$CHECK_SEMANTIC_MT_, current);
        final SubLObject check_semantic_mtP = (SubLObject)((nl_trie_accessors.NIL != check_semantic_mtP_tail) ? conses_high.cadr(check_semantic_mtP_tail) : nl_trie_accessors.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)nl_trie_accessors.$sym36$DO_NL_TRIE_ENTRIES_FOR_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { entry_var, string, lookup_mt, nl_trie_accessors.$kw13$ENTRY_TYPE, nl_trie_accessors.$kw37$WORD, nl_trie_accessors.$kw16$MISSPELLINGS_, misspellingsP, nl_trie_accessors.$kw15$CHECK_PERIOD_, check_periodP, nl_trie_accessors.$kw18$CASE_SENSITIVITY, case_sensitivity, nl_trie_accessors.$kw20$CHECK_SEMANTIC_MT_, check_semantic_mtP }), ConsesLow.append(body, (SubLObject)nl_trie_accessors.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 7819L)
    public static SubLObject do_nl_trie_name_entries_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject entry_var = (SubLObject)nl_trie_accessors.NIL;
        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
        SubLObject lookup_mt = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list38);
        entry_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list38);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list38);
        lookup_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current_$4 = (SubLObject)nl_trie_accessors.NIL;
        while (nl_trie_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list38);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list38);
            if (nl_trie_accessors.NIL == conses_high.member(current_$4, (SubLObject)nl_trie_accessors.$list39, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                bad = (SubLObject)nl_trie_accessors.T;
            }
            if (current_$4 == nl_trie_accessors.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie_accessors.NIL != bad && nl_trie_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list38);
        }
        final SubLObject check_periodP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw15$CHECK_PERIOD_, current);
        final SubLObject check_periodP = (SubLObject)((nl_trie_accessors.NIL != check_periodP_tail) ? conses_high.cadr(check_periodP_tail) : nl_trie_accessors.NIL);
        final SubLObject misspellingsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw16$MISSPELLINGS_, current);
        final SubLObject misspellingsP = (SubLObject)((nl_trie_accessors.NIL != misspellingsP_tail) ? conses_high.cadr(misspellingsP_tail) : nl_trie_accessors.$sym17$_MISSPELLINGS__);
        final SubLObject case_sensitivity_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw18$CASE_SENSITIVITY, current);
        final SubLObject case_sensitivity = (SubLObject)((nl_trie_accessors.NIL != case_sensitivity_tail) ? conses_high.cadr(case_sensitivity_tail) : nl_trie_accessors.$sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)nl_trie_accessors.$sym36$DO_NL_TRIE_ENTRIES_FOR_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { entry_var, string, lookup_mt, nl_trie_accessors.$kw13$ENTRY_TYPE, nl_trie_accessors.$kw40$NAME, nl_trie_accessors.$kw16$MISSPELLINGS_, misspellingsP, nl_trie_accessors.$kw15$CHECK_PERIOD_, check_periodP, nl_trie_accessors.$kw18$CASE_SENSITIVITY, case_sensitivity }), ConsesLow.append(body, (SubLObject)nl_trie_accessors.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8282L)
    public static SubLObject incorporate_new_entry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_entry = (SubLObject)nl_trie_accessors.NIL;
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list41);
        new_entry = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list41);
        denot_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list41);
        pred_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current_$5 = (SubLObject)nl_trie_accessors.NIL;
        while (nl_trie_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list41);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list41);
            if (nl_trie_accessors.NIL == conses_high.member(current_$5, (SubLObject)nl_trie_accessors.$list42, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                bad = (SubLObject)nl_trie_accessors.T;
            }
            if (current_$5 == nl_trie_accessors.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie_accessors.NIL != bad && nl_trie_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list41);
        }
        final SubLObject skip_constraintsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw43$SKIP_CONSTRAINTS_, current);
        final SubLObject skip_constraintsP = (SubLObject)((nl_trie_accessors.NIL != skip_constraintsP_tail) ? conses_high.cadr(skip_constraintsP_tail) : nl_trie_accessors.NIL);
        final SubLObject abbrev_types_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw44$ABBREV_TYPES, current);
        final SubLObject abbrev_types = (SubLObject)((nl_trie_accessors.NIL != abbrev_types_tail) ? conses_high.cadr(abbrev_types_tail) : nl_trie_accessors.NIL);
        final SubLObject denot_type_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw45$DENOT_TYPE, current);
        final SubLObject denot_type = (SubLObject)((nl_trie_accessors.NIL != denot_type_tail) ? conses_high.cadr(denot_type_tail) : nl_trie_accessors.$kw46$DENOT);
        final SubLObject skip_namestringsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw47$SKIP_NAMESTRINGS_, current);
        final SubLObject skip_namestringsP = (SubLObject)((nl_trie_accessors.NIL != skip_namestringsP_tail) ? conses_high.cadr(skip_namestringsP_tail) : nl_trie_accessors.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym48$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(denot_list, pred_list), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym49$ADD_NEW_ENTRY, new_entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8682L)
    public static SubLObject incorporate_new_denots_and_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_denots = (SubLObject)nl_trie_accessors.NIL;
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject new_preds = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list50);
        new_denots = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list50);
        denot_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list50);
        new_preds = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list50);
        pred_list = current.first();
        current = current.rest();
        if (nl_trie_accessors.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym48$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(denot_list, pred_list), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym51$ADD_NEW_DENOTS_AND_PREDS, new_denots, denot_list, new_preds, pred_list));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list50);
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8975L)
    public static SubLObject nl_trie_string_is_posP_internal(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            final SubLObject entries = gated_nl_trie_search(string, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
            final SubLObject input_contains_periodP = contains_periodP(string);
            if (nl_trie_accessors.NIL == foundP) {
                SubLObject csome_list_var = entries;
                SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
                entry = csome_list_var.first();
                while (nl_trie_accessors.NIL == foundP && nl_trie_accessors.NIL != csome_list_var) {
                    if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != period_const_satisfiedP(input_contains_periodP, entry, string) && nl_trie_accessors.NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                        foundP = (SubLObject)nl_trie_accessors.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    entry = csome_list_var.first();
                }
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8975L)
    public static SubLObject nl_trie_string_is_posP(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie_accessors.NIL;
        if (nl_trie_accessors.NIL == v_memoization_state) {
            return nl_trie_string_is_posP_internal(string, pos, misspellingsP, lookup_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_, (SubLObject)nl_trie_accessors.UNPROVIDED);
        if (nl_trie_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_, (SubLObject)nl_trie_accessors.FOUR_INTEGER, (SubLObject)nl_trie_accessors.$int53$4096, (SubLObject)nl_trie_accessors.EQUAL, (SubLObject)nl_trie_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, misspellingsP, lookup_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie_accessors.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (misspellingsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (nl_trie_accessors.NIL != cached_args && nl_trie_accessors.NIL == cached_args.rest() && lookup_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_string_is_posP_internal(string, pos, misspellingsP, lookup_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, pos, misspellingsP, lookup_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 9875L)
    public static SubLObject nl_trie_words_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_units = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != nl_trie.nl_trie_word_head_onlyP(entry)) {
                    final SubLObject var = nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    if (nl_trie_accessors.NIL != var) {
                        final SubLObject item_var = var;
                        if (nl_trie_accessors.NIL == conses_high.member(item_var, word_units, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                            word_units = (SubLObject)ConsesLow.cons(item_var, word_units);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return word_units;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 11071L)
    public static SubLObject nl_trie_words_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_units = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != pos_pred_const_satisfiedP(pred, nl_trie.nl_trie_word_pos_preds(entry)) && nl_trie_accessors.NIL != nl_trie.nl_trie_word_head_onlyP(entry)) {
                    final SubLObject var = nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    if (nl_trie_accessors.NIL != var) {
                        final SubLObject item_var = var;
                        if (nl_trie_accessors.NIL == conses_high.member(item_var, word_units, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                            word_units = (SubLObject)ConsesLow.cons(item_var, word_units);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return word_units;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 12295L)
    public static SubLObject nl_trie_words_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_list = lexicon_accessors.pos_for_keyword(pos_keyword, (SubLObject)nl_trie_accessors.UNPROVIDED);
        SubLObject word_units = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pos_preds = (SubLObject)nl_trie_accessors.NIL;
        SubLObject lex_preds = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                    final SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    if (nl_trie_accessors.NIL != wu && nl_trie_accessors.NIL != lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_word_pos(entry), pos_list) && nl_trie_accessors.NIL != nl_trie.nl_trie_word_head_onlyP(entry)) {
                        final SubLObject new_lex_pred = nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
                        final SubLObject new_word_unit = wu;
                        SubLObject cdolist_list_var_$6 = nl_trie.nl_trie_word_pos_preds(entry);
                        SubLObject new_pos_pred = (SubLObject)nl_trie_accessors.NIL;
                        new_pos_pred = cdolist_list_var_$6.first();
                        while (nl_trie_accessors.NIL != cdolist_list_var_$6) {
                            SubLObject foundP = (SubLObject)nl_trie_accessors.NIL;
                            if (nl_trie_accessors.NIL == foundP) {
                                SubLObject word_unit;
                                SubLObject word_unit_$7;
                                SubLObject lex_pred;
                                SubLObject lex_pred_$8;
                                SubLObject pos_pred;
                                SubLObject pos_pred_$9;
                                for (word_unit = (SubLObject)nl_trie_accessors.NIL, word_unit_$7 = (SubLObject)nl_trie_accessors.NIL, lex_pred = (SubLObject)nl_trie_accessors.NIL, lex_pred_$8 = (SubLObject)nl_trie_accessors.NIL, pos_pred = (SubLObject)nl_trie_accessors.NIL, pos_pred_$9 = (SubLObject)nl_trie_accessors.NIL, word_unit = word_units, word_unit_$7 = word_unit.first(), lex_pred = lex_preds, lex_pred_$8 = lex_pred.first(), pos_pred = pos_preds, pos_pred_$9 = pos_pred.first(); nl_trie_accessors.NIL == foundP && (nl_trie_accessors.NIL != pos_pred || nl_trie_accessors.NIL != lex_pred || nl_trie_accessors.NIL != word_unit); foundP = (SubLObject)SubLObjectFactory.makeBoolean(new_word_unit.equal(word_unit_$7) && new_lex_pred.equal(lex_pred_$8) && new_pos_pred.equal(pos_pred_$9)), word_unit = word_unit.rest(), word_unit_$7 = word_unit.first(), lex_pred = lex_pred.rest(), lex_pred_$8 = lex_pred.first(), pos_pred = pos_pred.rest(), pos_pred_$9 = pos_pred.first()) {}
                            }
                            if (nl_trie_accessors.NIL == foundP) {
                                word_units = (SubLObject)ConsesLow.cons(wu, word_units);
                                lex_preds = (SubLObject)ConsesLow.cons(new_lex_pred, lex_preds);
                                pos_preds = (SubLObject)ConsesLow.cons(new_pos_pred.eql(nl_trie_accessors.$const54$partOfSpeech) ? nl_trie.nl_trie_word_pos(entry) : new_pos_pred, pos_preds);
                            }
                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                            new_pos_pred = cdolist_list_var_$6.first();
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(word_units, pos_preds, lex_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 14458L)
    public static SubLObject nl_trie_words_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_units = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pos_preds = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                    final SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    if (nl_trie_accessors.NIL != wu && nl_trie_accessors.NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != nl_trie.nl_trie_word_head_onlyP(entry)) {
                        final SubLObject new_pos_preds = nl_trie.nl_trie_word_pos_preds(entry);
                        final SubLObject new_word_units = (SubLObject)ConsesLow.make_list(conses_high.list_length(new_pos_preds), wu);
                        word_units = ConsesLow.append(new_word_units, word_units);
                        pos_preds = ConsesLow.append(Sequences.substitute(nl_trie.nl_trie_word_pos(entry), nl_trie_accessors.$const54$partOfSpeech, new_pos_preds, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED), pos_preds);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject found_words = (SubLObject)nl_trie_accessors.NIL;
        SubLObject output_words = (SubLObject)nl_trie_accessors.NIL;
        SubLObject output_preds = (SubLObject)nl_trie_accessors.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject word;
        SubLObject pos_pred;
        for (cdotimes_end_var = Sequences.length(word_units), i = (SubLObject)nl_trie_accessors.NIL, i = (SubLObject)nl_trie_accessors.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
            word = ConsesLow.nth(i, word_units);
            pos_pred = ConsesLow.nth(i, pos_preds);
            if (!list_utilities.alist_lookup(found_words, word, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED).eql(pos_pred)) {
                output_words = (SubLObject)ConsesLow.cons(word, output_words);
                output_preds = (SubLObject)ConsesLow.cons(pos_pred, output_preds);
                found_words = list_utilities.alist_enter(found_words, word, pos_pred, (SubLObject)nl_trie_accessors.UNPROVIDED);
            }
        }
        return Values.values(output_words, output_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 16527L)
    public static SubLObject nl_trie_preds_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_preds = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED).equal(word)) {
                    pos_preds = conses_high.union(nl_trie.nl_trie_word_pos_preds(entry), pos_preds, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return pos_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 17598L)
    public static SubLObject nl_trie_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_preds = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                    pos_preds = conses_high.union(nl_trie.nl_trie_word_pos_preds(entry), pos_preds, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return pos_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 18514L)
    public static SubLObject nl_trie_namestring_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name_preds = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw40$NAME || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw40$NAME) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                    final SubLObject item_var = nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    if (nl_trie_accessors.NIL == conses_high.member(item_var, name_preds, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                        name_preds = (SubLObject)ConsesLow.cons(item_var, name_preds);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return name_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 19420L)
    public static SubLObject nl_trie_pos_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                    final SubLObject item_var = nl_trie.nl_trie_word_pos(entry);
                    if (nl_trie_accessors.NIL == conses_high.member(item_var, pos_list, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                        pos_list = (SubLObject)ConsesLow.cons(item_var, pos_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.delete((SubLObject)nl_trie_accessors.NIL, pos_list, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 20323L)
    public static SubLObject nl_trie_pos_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.UNPROVIDED).equal(word)) {
                    final SubLObject item_var = nl_trie.nl_trie_word_pos(entry);
                    if (nl_trie_accessors.NIL == conses_high.member(item_var, pos_list, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                        pos_list = (SubLObject)ConsesLow.cons(item_var, pos_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return pos_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 21358L)
    public static SubLObject nl_trie_all_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)nl_trie_accessors.T;
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        final SubLObject skip_namestringsP = (SubLObject)nl_trie_accessors.NIL;
        return general_nl_trie_denots_of_string(string, misspellingsP, lookup_mt, (SubLObject)nl_trie_accessors.T, abbrev_types, denot_type, skip_namestringsP, case_sensitivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 22568L)
    public static SubLObject nl_trie_denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)nl_trie_accessors.T;
        }
        if (skip_namestringsP == nl_trie_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        return general_nl_trie_denots_of_string(string, misspellingsP, lookup_mt, (SubLObject)nl_trie_accessors.NIL, abbrev_types, denot_type, skip_namestringsP, case_sensitivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 23956L)
    public static SubLObject general_nl_trie_denots_of_string(final SubLObject string, final SubLObject misspellingsP, final SubLObject lookup_mt, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP, SubLObject case_sensitivity) {
        if (skip_constraintsP == nl_trie_accessors.UNPROVIDED) {
            skip_constraintsP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (skip_namestringsP == nl_trie_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject starts_with_theP = starts_with_theP(string);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            thread.resetMultipleValues();
            final SubLObject denot_list_$10 = general_nl_trie_denots_of_string_int(string, misspellingsP, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP, starts_with_theP, case_sensitivity);
            final SubLObject pred_list_$11 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$10;
            pred_list = pred_list_$11;
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 24675L)
    public static SubLObject general_nl_trie_denots_of_string_int(final SubLObject string, final SubLObject misspellingsP, final SubLObject skip_constraintsP, final SubLObject abbrev_types, final SubLObject denot_type, final SubLObject skip_namestringsP, final SubLObject starts_with_theP, final SubLObject case_sensitivity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject precise_with_theP = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject input_contains_periodP = contains_periodP(string);
        final SubLObject entry_type = (SubLObject)((nl_trie_accessors.NIL != skip_namestringsP) ? nl_trie_accessors.$kw37$WORD : nl_trie_accessors.$kw14$ANY);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == entry_type || nl_trie.nl_trie_entry_type(entry).eql(entry_type)) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry)) {
                    SubLObject okP = (SubLObject)nl_trie_accessors.NIL;
                    if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                        okP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != period_const_satisfiedP(input_contains_periodP, entry, string) && nl_trie_accessors.NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), nl_trie.nl_trie_word_semantics_mt(entry)));
                    }
                    else if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                        okP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == skip_namestringsP && (nl_trie_accessors.NIL == precise_with_theP || starts_with_theP.eql(starts_with_theP(nl_trie.nl_trie_entry_string(entry)))));
                    }
                    if (nl_trie_accessors.NIL != okP) {
                        thread.resetMultipleValues();
                        final SubLObject denot_list_$12 = add_new_entry(entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP);
                        final SubLObject pred_list_$13 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denot_list = denot_list_$12;
                        pred_list = pred_list_$13;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 26460L)
    public static SubLObject nl_trie_denotation_mapper(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == nl_trie_accessors.UNPROVIDED) {
            excluded_preds = (SubLObject)nl_trie_accessors.NIL;
        }
        if (mode == nl_trie_accessors.UNPROVIDED) {
            mode = (SubLObject)nl_trie_accessors.$kw56$GREEDY;
        }
        if (parse_morphologically == nl_trie_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = string_utilities.string_tokenize(string, nl_trie_accessors.$denotation_mapping_break_chars$.getGlobalValue(), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
        SubLObject tokenizations = (SubLObject)nl_trie_accessors.NIL;
        SubLObject result = (SubLObject)nl_trie_accessors.NIL;
        SubLObject release = (SubLObject)nl_trie_accessors.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                tokenizations = lexicon_utilities.sentence_tokenize(tokens, nl_trie.get_nl_trie(), (SubLObject)nl_trie_accessors.$kw3$STRING, mode, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie_accessors.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        SubLObject cdolist_list_var = tokenizations;
        SubLObject tokenization = (SubLObject)nl_trie_accessors.NIL;
        tokenization = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = tokenization;
            SubLObject token = (SubLObject)nl_trie_accessors.NIL;
            token = cdolist_list_var_$14.first();
            while (nl_trie_accessors.NIL != cdolist_list_var_$14) {
                final SubLObject token_string = standard_tokenization.string_token_string(token);
                SubLObject mapping_foundP = (SubLObject)nl_trie_accessors.NIL;
                if (nl_trie_accessors.NIL == lexicon_accessors.skip_to_morphological_parsingP(parse_morphologically)) {
                    SubLObject cdolist_list_var_$15 = standard_tokenization.string_token_value(token);
                    SubLObject trie_entry = (SubLObject)nl_trie_accessors.NIL;
                    trie_entry = cdolist_list_var_$15.first();
                    while (nl_trie_accessors.NIL != cdolist_list_var_$15) {
                        if (nl_trie_accessors.NIL != pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(trie_entry, (SubLObject)nl_trie_accessors.UNPROVIDED), (SubLObject)nl_trie_accessors.$list57, (SubLObject)nl_trie_accessors.$kw46$DENOT, (SubLObject)nl_trie_accessors.NIL) && nl_trie_accessors.NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(trie_entry, (SubLObject)nl_trie_accessors.UNPROVIDED), excluded_preds, (SubLObject)nl_trie_accessors.$sym58$GENL_POS_PRED_, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                            SubLObject cdolist_list_var_$16 = nl_trie.nl_trie_entry_denots(trie_entry);
                            SubLObject denot = (SubLObject)nl_trie_accessors.NIL;
                            denot = cdolist_list_var_$16.first();
                            while (nl_trie_accessors.NIL != cdolist_list_var_$16) {
                                final SubLObject item_var = standard_tokenization.new_string_token(token_string, denot);
                                if (nl_trie_accessors.NIL == conses_high.member(item_var, result, (SubLObject)nl_trie_accessors.EQUAL, Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                                    result = (SubLObject)ConsesLow.cons(item_var, result);
                                }
                                mapping_foundP = (SubLObject)nl_trie_accessors.T;
                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                denot = cdolist_list_var_$16.first();
                            }
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        trie_entry = cdolist_list_var_$15.first();
                    }
                }
                if (nl_trie_accessors.NIL != lexicon_accessors.proceed_with_morphological_parsingP(mapping_foundP, parse_morphologically)) {
                    thread.resetMultipleValues();
                    final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(token_string, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject morph_denot = (SubLObject)nl_trie_accessors.NIL;
                    SubLObject morph_denot_$17 = (SubLObject)nl_trie_accessors.NIL;
                    SubLObject morph_predicate_list = (SubLObject)nl_trie_accessors.NIL;
                    SubLObject morph_predicate_list_$18 = (SubLObject)nl_trie_accessors.NIL;
                    morph_denot = morph_denots;
                    morph_denot_$17 = morph_denot.first();
                    morph_predicate_list = morph_predicate_lists;
                    morph_predicate_list_$18 = morph_predicate_list.first();
                    while (nl_trie_accessors.NIL != morph_predicate_list || nl_trie_accessors.NIL != morph_denot) {
                        SubLObject includedP = (SubLObject)nl_trie_accessors.NIL;
                        if (nl_trie_accessors.NIL == includedP) {
                            SubLObject csome_list_var = morph_predicate_list_$18;
                            SubLObject pred = (SubLObject)nl_trie_accessors.NIL;
                            pred = csome_list_var.first();
                            while (nl_trie_accessors.NIL == includedP && nl_trie_accessors.NIL != csome_list_var) {
                                if (nl_trie_accessors.NIL == subl_promotions.memberP(pred, excluded_preds, (SubLObject)nl_trie_accessors.$sym58$GENL_POS_PRED_, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                                    final SubLObject item_var2 = standard_tokenization.new_string_token(token_string, morph_denot_$17);
                                    if (nl_trie_accessors.NIL == conses_high.member(item_var2, result, (SubLObject)nl_trie_accessors.EQUAL, Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                                        result = (SubLObject)ConsesLow.cons(item_var2, result);
                                    }
                                    mapping_foundP = (SubLObject)nl_trie_accessors.T;
                                    includedP = (SubLObject)nl_trie_accessors.T;
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
                if (nl_trie_accessors.NIL == mapping_foundP) {
                    final SubLObject item_var3 = standard_tokenization.new_string_token(token_string, (SubLObject)nl_trie_accessors.NIL);
                    if (nl_trie_accessors.NIL == conses_high.member(item_var3, result, (SubLObject)nl_trie_accessors.EQUAL, Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var3, result);
                    }
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                token = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            tokenization = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 28712L)
    public static SubLObject nl_trie_denots_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)nl_trie_accessors.T;
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_list = lexicon_accessors.pos_for_keyword(pos_keyword, (SubLObject)nl_trie_accessors.UNPROVIDED);
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_word_pos(entry), pos_list)) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$19 = add_new_entry(entry, denot_list, pred_list, (SubLObject)nl_trie_accessors.NIL, abbrev_types, denot_type, (SubLObject)nl_trie_accessors.NIL);
                    final SubLObject pred_list_$20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$19;
                    pred_list = pred_list_$20;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 30537L)
    public static SubLObject nl_trie_dps_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject skip_namestringsP, SubLObject case_sensitivity) {
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (skip_namestringsP == nl_trie_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dp_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED), abbrev_types, denot_type, skip_namestringsP)) {
                    SubLObject cdolist_list_var_$21 = nl_trie.nl_trie_entry_denots(entry);
                    SubLObject denot = (SubLObject)nl_trie_accessors.NIL;
                    denot = cdolist_list_var_$21.first();
                    while (nl_trie_accessors.NIL != cdolist_list_var_$21) {
                        SubLObject cdolist_list_var_$22 = nl_trie.nl_trie_word_pos_preds(entry);
                        SubLObject pos_pred = (SubLObject)nl_trie_accessors.NIL;
                        pos_pred = cdolist_list_var_$22.first();
                        while (nl_trie_accessors.NIL != cdolist_list_var_$22) {
                            final SubLObject item_var = (SubLObject)ConsesLow.list(denot, pos_pred);
                            if (nl_trie_accessors.NIL == conses_high.member(item_var, dp_list, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUALP), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                                dp_list = (SubLObject)ConsesLow.cons(item_var, dp_list);
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
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return dp_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 32064L)
    public static SubLObject nl_trie_denots_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)nl_trie_accessors.T;
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$23 = add_new_entry(entry, denot_list, pred_list, (SubLObject)nl_trie_accessors.NIL, abbrev_types, denot_type, (SubLObject)nl_trie_accessors.NIL);
                    final SubLObject pred_list_$24 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$23;
                    pred_list = pred_list_$24;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 33939L)
    public static SubLObject nl_trie_denots_of_stringXpred(final SubLObject string, final SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)nl_trie_accessors.T;
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != pos_pred_const_satisfiedP(pos_pred, nl_trie.nl_trie_word_pos_preds(entry))) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$25 = add_new_entry(entry, denot_list, pred_list, (SubLObject)nl_trie_accessors.NIL, abbrev_types, denot_type, (SubLObject)nl_trie_accessors.NIL);
                    final SubLObject pred_list_$26 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$25;
                    pred_list = pred_list_$26;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 35895L)
    public static SubLObject nl_trie_denots_of_name_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == nl_trie_accessors.UNPROVIDED) {
            precise_with_theP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        assert nl_trie_accessors.NIL != Types.stringp(string) : string;
        return nl_trie_denots_of_name_string_internal(string, misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 36933L)
    public static SubLObject nl_trie_denots_of_name_string_internal(final SubLObject string, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject precise_with_theP, final SubLObject case_sensitivity, final SubLObject unquotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject starts_with_theP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != precise_with_theP && nl_trie_accessors.NIL != starts_with_theP(string));
        final SubLObject lookup_string = (nl_trie_accessors.NIL != starts_with_theP) ? string_utilities.substring(string, (SubLObject)nl_trie_accessors.FOUR_INTEGER, (SubLObject)nl_trie_accessors.UNPROVIDED) : string;
        final SubLObject quotedP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == unquotedP && nl_trie_accessors.NIL != string_utilities.quoted_stringP(string));
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(lookup_string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw40$NAME || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw40$NAME) && nl_trie_accessors.NIL != spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry)) {
                    SubLObject okP = (SubLObject)nl_trie_accessors.T;
                    if (nl_trie_accessors.NIL != precise_with_theP && !starts_with_theP.eql(starts_with_theP(nl_trie.nl_trie_entry_string(entry)))) {
                        okP = (SubLObject)nl_trie_accessors.NIL;
                    }
                    else if (nl_trie_accessors.NIL != unquotedP && nl_trie_accessors.NIL == nl_trie_unquoted_entry_okP(entry)) {
                        okP = (SubLObject)nl_trie_accessors.NIL;
                    }
                    else if (nl_trie_accessors.NIL == spelling_const_satisfiedP(misspellingsP, entry)) {
                        okP = (SubLObject)nl_trie_accessors.NIL;
                    }
                    if (nl_trie_accessors.NIL != okP) {
                        thread.resetMultipleValues();
                        final SubLObject denot_list_$27 = add_new_entry(entry, denot_list, pred_list, (SubLObject)nl_trie_accessors.T, (SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.$kw46$DENOT, (SubLObject)nl_trie_accessors.NIL);
                        final SubLObject pred_list_$28 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denot_list = denot_list_$27;
                        pred_list = pred_list_$28;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (nl_trie_accessors.NIL != quotedP) {
            thread.resetMultipleValues();
            final SubLObject unquoted_denots = nl_trie_denots_of_name_string_internal(string_utilities.unquote_string(string), misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            final SubLObject unquoted_preds = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject denot_list_$28 = add_new_denots_and_preds(unquoted_denots, denot_list, unquoted_preds, pred_list);
            final SubLObject pred_list_$29 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$28;
            pred_list = pred_list_$29;
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 38244L)
    public static SubLObject starts_with_theP(final SubLObject string) {
        return string_utilities.starts_with_by_test(string, (SubLObject)nl_trie_accessors.$str60$the_, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUALP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 38343L)
    public static SubLObject nl_trie_denots_of_acronym_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject namestring_pred = nl_trie_accessors.$const61$acronymString;
        return nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 39359L)
    public static SubLObject nl_trie_denots_of_abbreviation_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw14$ANY || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw14$ANY) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED), lexicon_vars.abbreviation_predicates(), (SubLObject)nl_trie_accessors.$sym58$GENL_POS_PRED_, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$31 = add_new_entry(entry, denot_list, pred_list, (SubLObject)nl_trie_accessors.T, (SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.$kw46$DENOT, (SubLObject)nl_trie_accessors.NIL);
                    final SubLObject pred_list_$32 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$31;
                    pred_list = pred_list_$32;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 40673L)
    public static SubLObject reinitialize_nl_trie_for_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject syntactic_assertions = (SubLObject)nl_trie_accessors.NIL;
        SubLObject name_assertions = (SubLObject)nl_trie_accessors.NIL;
        SubLObject release = (SubLObject)nl_trie_accessors.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                final SubLObject _prev_bind_0_$33 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(nl_trie_accessors.$const62$InferencePSC, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), (SubLObject)nl_trie_accessors.NIL);
                    SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
                    entry = cdolist_list_var.first();
                    while (nl_trie_accessors.NIL != cdolist_list_var) {
                        if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw14$ANY || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw14$ANY) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry)) {
                            if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                                final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(entry);
                                final SubLObject set_contents_var = set.do_set_internal(set_var);
                                SubLObject basis_object;
                                SubLObject state;
                                SubLObject support;
                                SubLObject item_var;
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    support = set_contents.do_set_contents_next(basis_object, state);
                                    if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL != assertion_handles.assertion_p(support)) {
                                        item_var = support;
                                        if (nl_trie_accessors.NIL == conses_high.member(item_var, syntactic_assertions, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                                            syntactic_assertions = (SubLObject)ConsesLow.cons(item_var, syntactic_assertions);
                                        }
                                    }
                                }
                            }
                            else if (nl_trie_accessors.NIL != assertion_handles.assertion_p(entry)) {
                                name_assertions = (SubLObject)ConsesLow.cons(entry, name_assertions);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        entry = cdolist_list_var.first();
                    }
                }
                finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$33, thread);
                }
                final SubLObject key = nl_trie.nl_trie_string_tokenize(string);
                strie.strie_remove(nl_trie.get_nl_trie(), key);
                SubLObject cdolist_list_var2 = syntactic_assertions;
                SubLObject as = (SubLObject)nl_trie_accessors.NIL;
                as = cdolist_list_var2.first();
                while (nl_trie_accessors.NIL != cdolist_list_var2) {
                    nl_trie.augment_nl_trie_syntactic(as, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    as = cdolist_list_var2.first();
                }
                cdolist_list_var2 = name_assertions;
                as = (SubLObject)nl_trie_accessors.NIL;
                as = cdolist_list_var2.first();
                while (nl_trie_accessors.NIL != cdolist_list_var2) {
                    nl_trie.augment_nl_trie_semantic(as, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    as = cdolist_list_var2.first();
                }
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie_accessors.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return nl_trie.nl_trie_search(string, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 41721L)
    public static SubLObject nl_trie_semtrans_templates_of_string(final SubLObject string, SubLObject frame, SubLObject misspellingsP, SubLObject pos, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (frame == nl_trie_accessors.UNPROVIDED) {
            frame = (SubLObject)nl_trie_accessors.$kw14$ANY;
        }
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)nl_trie_accessors.T;
        }
        if (pos == nl_trie_accessors.UNPROVIDED) {
            pos = (SubLObject)nl_trie_accessors.$kw14$ANY;
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject semtrans_template_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject skip_constraintsP = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject input_contains_periodP = contains_periodP(string);
        if (nl_trie_accessors.NIL != el_utilities.possibly_naut_p(frame)) {
            frame = narts_high.find_nart(frame);
        }
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != period_const_satisfiedP(input_contains_periodP, entry, string) && (nl_trie_accessors.NIL == lexicon_accessors.speech_partP(pos, (SubLObject)nl_trie_accessors.UNPROVIDED) || nl_trie_accessors.NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), pos, (SubLObject)nl_trie_accessors.UNPROVIDED)) && nl_trie_accessors.NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), nl_trie.nl_trie_word_semantics_mt(entry)) && (nl_trie_accessors.NIL == forts.fort_p(frame) || nl_trie.nl_trie_word_frame(entry).eql(frame))) {
                    thread.resetMultipleValues();
                    final SubLObject semtrans_template_list_$34 = add_new_entry(entry, semtrans_template_list, pred_list, skip_constraintsP, (SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.$kw63$SEMTRANS_TEMPLATE, (SubLObject)nl_trie_accessors.NIL);
                    final SubLObject pred_list_$35 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    semtrans_template_list = semtrans_template_list_$34;
                    pred_list = pred_list_$35;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(semtrans_template_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 43013L)
    public static SubLObject nl_trie_names_from_spelling(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject namestring_pred = nl_trie_accessors.$const64$nameSpelling;
        return nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 44025L)
    public static SubLObject nl_trie_names_from_nickname(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject namestring_pred = nl_trie_accessors.$const65$commonNickname;
        return nl_trie_denots_of_string_and_namestring_pred(string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 45045L)
    public static SubLObject nl_trie_denots_of_string_and_namestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject pred_list = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw40$NAME || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw40$NAME) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != lexicon_accessors.genl_pos_predP(nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED), namestring_pred, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject denot_list_$36 = add_new_entry(entry, denot_list, pred_list, (SubLObject)nl_trie_accessors.T, (SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.$kw46$DENOT, (SubLObject)nl_trie_accessors.NIL);
                    final SubLObject pred_list_$37 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denot_list = denot_list_$36;
                    pred_list = pred_list_$37;
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 46264L)
    public static SubLObject nl_trie_assertions_with_string_and_namestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity) {
        if (misspellingsP == nl_trie_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, case_sensitivity, (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw40$NAME || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw40$NAME) && nl_trie_accessors.NIL != spelling_const_satisfiedP(misspellingsP, entry) && nl_trie_accessors.NIL != assertion_handles.assertion_p(entry) && nl_trie_accessors.NIL != lexicon_accessors.genl_pos_predP(nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED), namestring_pred, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    assertions = (SubLObject)ConsesLow.cons(entry, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 47163L)
    public static SubLObject nl_trie_regular_formP(final SubLObject string, final SubLObject pred, SubLObject mt) {
        if (mt == nl_trie_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nl_trie_accessors.NIL != Types.stringp(string) : string;
        assert nl_trie_accessors.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)nl_trie_accessors.UNPROVIDED) : pred;
        SubLObject regularP = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), (SubLObject)nl_trie_accessors.NIL);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry) && nl_trie_accessors.NIL != subl_promotions.memberP(pred, nl_trie.nl_trie_word_pos_preds(entry), (SubLObject)nl_trie_accessors.$sym67$SPEC_POS_PRED_, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(entry);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL == assertion_handles.assertion_p(support)) {
                            regularP = (SubLObject)nl_trie_accessors.T;
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return regularP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 47710L)
    public static SubLObject nl_trie_word_pred_and_supports_for_pred(final SubLObject nl_trie_word, final SubLObject speech_part_predicate, SubLObject mt_info) {
        if (mt_info == nl_trie_accessors.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)nl_trie_accessors.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry_pred = (SubLObject)nl_trie_accessors.NIL;
        SubLObject supports = (SubLObject)nl_trie_accessors.NIL;
        if (nl_trie_accessors.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)nl_trie_accessors.$sym68$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie_accessors.$sym68$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(nl_trie_accessors.$const69$EverythingPSC, thread);
                if (nl_trie_accessors.NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL != arguments.support_p(support) && nl_trie_accessors.NIL == entry_pred) {
                            csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                            pred = (SubLObject)nl_trie_accessors.NIL;
                            pred = csome_list_var.first();
                            while (nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL != csome_list_var) {
                                if (nl_trie_accessors.NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                    entry_pred = pred;
                                    supports = (SubLObject)ConsesLow.cons(support, supports);
                                    if (!pred.equal(speech_part_predicate)) {
                                        supports = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            }
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (nl_trie_accessors.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)nl_trie_accessors.$sym70$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie_accessors.$sym70$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(nl_trie_accessors.$const62$InferencePSC, thread);
                if (nl_trie_accessors.NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL != arguments.support_p(support) && nl_trie_accessors.NIL == entry_pred) {
                            csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                            pred = (SubLObject)nl_trie_accessors.NIL;
                            pred = csome_list_var.first();
                            while (nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL != csome_list_var) {
                                if (nl_trie_accessors.NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                    entry_pred = pred;
                                    supports = (SubLObject)ConsesLow.cons(support, supports);
                                    if (!pred.equal(speech_part_predicate)) {
                                        supports = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            }
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (nl_trie_accessors.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie_accessors.$sym71$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                if (nl_trie_accessors.NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL != arguments.support_p(support) && nl_trie_accessors.NIL == entry_pred) {
                            csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                            pred = (SubLObject)nl_trie_accessors.NIL;
                            pred = csome_list_var.first();
                            while (nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL != csome_list_var) {
                                if (nl_trie_accessors.NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                    entry_pred = pred;
                                    supports = (SubLObject)ConsesLow.cons(support, supports);
                                    if (!pred.equal(speech_part_predicate)) {
                                        supports = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            }
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie_accessors.$sym72$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                if (nl_trie_accessors.NIL != mt_relevance_macros.relevant_mtP(nl_trie.nl_trie_entry_mt(nl_trie_word))) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(nl_trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject support;
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL != arguments.support_p(support) && nl_trie_accessors.NIL == entry_pred) {
                            csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(support);
                            pred = (SubLObject)nl_trie_accessors.NIL;
                            pred = csome_list_var.first();
                            while (nl_trie_accessors.NIL == entry_pred && nl_trie_accessors.NIL != csome_list_var) {
                                if (nl_trie_accessors.NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP(pred, speech_part_predicate, mt_info)) {
                                    entry_pred = pred;
                                    supports = (SubLObject)ConsesLow.cons(support, supports);
                                    if (!pred.equal(speech_part_predicate)) {
                                        supports = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(pred, speech_part_predicate), supports);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            }
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(entry_pred, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 48647L)
    public static SubLObject add_new_entry(final SubLObject entry, SubLObject denot_list, SubLObject pred_list, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP) {
        if (skip_constraintsP == nl_trie_accessors.UNPROVIDED) {
            skip_constraintsP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (abbrev_types == nl_trie_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)nl_trie_accessors.NIL;
        }
        if (denot_type == nl_trie_accessors.UNPROVIDED) {
            denot_type = (SubLObject)nl_trie_accessors.$kw46$DENOT;
        }
        if (skip_namestringsP == nl_trie_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)nl_trie_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie_accessors.NIL != skip_constraintsP || nl_trie_accessors.NIL != pred_type_okP(nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED), abbrev_types, denot_type, skip_namestringsP)) {
            final SubLObject new_denots = (denot_type == nl_trie_accessors.$kw63$SEMTRANS_TEMPLATE) ? nl_trie.nl_trie_entry_semtrans_templates(entry) : nl_trie.nl_trie_entry_denots(entry);
            final SubLObject new_preds = (SubLObject)((nl_trie_accessors.NIL != new_denots) ? ConsesLow.make_list(conses_high.list_length(new_denots), nl_trie_entry_name_pred_or_syntactic_preds(entry)) : nl_trie_accessors.NIL);
            thread.resetMultipleValues();
            final SubLObject denot_list_$38 = add_new_denots_and_preds(new_denots, denot_list, new_preds, pred_list);
            final SubLObject pred_list_$39 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$38;
            pred_list = pred_list_$39;
        }
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 49991L)
    public static SubLObject nl_trie_entry_name_pred_or_syntactic_preds(final SubLObject entry) {
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return nl_trie.nl_trie_entry_pos_preds(entry);
        }
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 50230L)
    public static SubLObject add_new_denots_and_preds(final SubLObject new_denots, SubLObject denot_list, final SubLObject new_preds, SubLObject pred_list) {
        SubLObject new_denot = (SubLObject)nl_trie_accessors.NIL;
        SubLObject new_denot_$40 = (SubLObject)nl_trie_accessors.NIL;
        SubLObject new_name_pred_or_pos_preds = (SubLObject)nl_trie_accessors.NIL;
        SubLObject new_name_pred_or_pos_preds_$41 = (SubLObject)nl_trie_accessors.NIL;
        new_denot = new_denots;
        new_denot_$40 = new_denot.first();
        new_name_pred_or_pos_preds = new_preds;
        new_name_pred_or_pos_preds_$41 = new_name_pred_or_pos_preds.first();
        while (nl_trie_accessors.NIL != new_name_pred_or_pos_preds || nl_trie_accessors.NIL != new_denot) {
            SubLObject cdolist_list_var;
            final SubLObject new_preds_$42 = cdolist_list_var = (SubLObject)(new_name_pred_or_pos_preds_$41.isList() ? new_name_pred_or_pos_preds_$41 : ConsesLow.list(new_name_pred_or_pos_preds_$41));
            SubLObject new_pred = (SubLObject)nl_trie_accessors.NIL;
            new_pred = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                final SubLObject index = Sequences.position(new_denot_$40, denot_list, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                if (nl_trie_accessors.NIL != index) {
                    if (nl_trie_accessors.NIL != new_pred) {
                        final SubLObject item_var = new_pred;
                        if (nl_trie_accessors.NIL == conses_high.member(item_var, ConsesLow.nth(index, pred_list), Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                            ConsesLow.set_nth(index, pred_list, (SubLObject)ConsesLow.cons(item_var, ConsesLow.nth(index, pred_list)));
                        }
                    }
                }
                else {
                    denot_list = (SubLObject)ConsesLow.cons(new_denot_$40, denot_list);
                    if (nl_trie_accessors.NIL != new_pred) {
                        pred_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new_pred), pred_list);
                    }
                    else {
                        pred_list = (SubLObject)ConsesLow.cons((SubLObject)nl_trie_accessors.NIL, pred_list);
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
        return Values.values(denot_list, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 51380L)
    public static SubLObject pred_type_okP(final SubLObject pred, final SubLObject abbrev_types, final SubLObject denot_type, final SubLObject skip_namestringsP) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != abbrev_const_satisfiedP(pred, abbrev_types) && nl_trie_accessors.NIL != denot_const_satisfiedP(pred, denot_type) && nl_trie_accessors.NIL != namestring_const_satisfiedP(pred, skip_namestringsP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 51990L)
    public static SubLObject abbrev_const_satisfiedP(final SubLObject pred, final SubLObject abbrev_types) {
        if (nl_trie_accessors.NIL != subl_promotions.memberP(pred, lexicon_vars.acronym_predicates(), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return (SubLObject)((nl_trie_accessors.NIL != subl_promotions.memberP((SubLObject)nl_trie_accessors.$kw73$ACRONYMS, abbrev_types, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) ? nl_trie_accessors.T : nl_trie_accessors.NIL);
        }
        if (nl_trie_accessors.NIL != subl_promotions.memberP(pred, lexicon_vars.abbreviation_predicates(), Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return (SubLObject)((nl_trie_accessors.NIL != subl_promotions.memberP((SubLObject)nl_trie_accessors.$kw74$ABBREVS, abbrev_types, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) ? nl_trie_accessors.T : nl_trie_accessors.NIL);
        }
        return (SubLObject)nl_trie_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 52463L)
    public static SubLObject denot_const_satisfiedP(final SubLObject pred, final SubLObject denot_type) {
        if (nl_trie_accessors.NIL != subl_promotions.memberP(pred, (SubLObject)nl_trie_accessors.$list75, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return subl_promotions.memberP(pred, lexicon_accessors.determine_denotation_preds(denot_type), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
        }
        if (nl_trie_accessors.NIL != subl_promotions.memberP(pred, nl_trie.nl_trie_semtrans_predicates(), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return Equality.eq(denot_type, (SubLObject)nl_trie_accessors.$kw63$SEMTRANS_TEMPLATE);
        }
        return (SubLObject)nl_trie_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 52980L)
    public static SubLObject namestring_const_satisfiedP(final SubLObject pred, final SubLObject skip_namestringsP) {
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_string_predP(pred)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == skip_namestringsP);
        }
        return (SubLObject)nl_trie_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 53349L)
    public static SubLObject nl_trie_sentence_tokenize(final SubLObject words, SubLObject output, SubLObject mode, SubLObject token_data, SubLObject starting_index, SubLObject case_sensitivity) {
        if (output == nl_trie_accessors.UNPROVIDED) {
            output = (SubLObject)nl_trie_accessors.$kw3$STRING;
        }
        if (mode == nl_trie_accessors.UNPROVIDED) {
            mode = (SubLObject)nl_trie_accessors.$kw56$GREEDY;
        }
        if (token_data == nl_trie_accessors.UNPROVIDED) {
            token_data = Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY);
        }
        if (starting_index == nl_trie_accessors.UNPROVIDED) {
            starting_index = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
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
        SubLObject tokens = (SubLObject)nl_trie_accessors.NIL;
        SubLObject release = (SubLObject)nl_trie_accessors.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                tokens = lexicon_utilities.sentence_tokenize(standardized_words, v_nl_trie, output, mode, token_data, starting_index);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie_accessors.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        if (output != nl_trie_accessors.$kw76$INTERVAL) {
            return tokens;
        }
        tokens = nl_trie_remove_inappropriate_tokens(tokens);
        if (case_sensitivity != nl_trie_accessors.$kw77$OFF && nl_trie_accessors.NIL == nl_trie.nl_trie_case_sensitive_p(v_nl_trie)) {
            final SubLObject filtered_tokens = nl_trie_filter_tokens_for_case(tokens, standardized_words);
            if (case_sensitivity == nl_trie_accessors.$kw78$ON || nl_trie_accessors.NIL != list_utilities.non_empty_list_p(filtered_tokens)) {
                tokens = filtered_tokens;
            }
        }
        if (nl_trie_accessors.NIL != alterations) {
            tokens = nl_trie_repair_token_indexes(tokens, alterations);
        }
        return Sort.sort(Sort.sort(tokens, Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym79$_), (SubLObject)nl_trie_accessors.$sym80$INTERVAL_TOKEN_LENGTH), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym81$_), (SubLObject)nl_trie_accessors.$sym82$INTERVAL_TOKEN_START);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 55136L)
    public static SubLObject nl_trie_filter_tokens_for_case(final SubLObject interval_tokens, final SubLObject key) {
        SubLObject cdolist_list_var = interval_tokens;
        SubLObject interval_token = (SubLObject)nl_trie_accessors.NIL;
        interval_token = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 55606L)
    public static SubLObject nl_trie_remove_inappropriate_tokens(final SubLObject interval_tokens) {
        SubLObject cdolist_list_var = interval_tokens;
        SubLObject interval_token = (SubLObject)nl_trie_accessors.NIL;
        interval_token = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            final SubLObject s_token = standard_tokenization.interval_token_value(interval_token);
            standard_tokenization.string_token_value_set(s_token, nl_trie_remove_inappropriate_entries(standard_tokenization.string_token_value(s_token), (SubLObject)nl_trie_accessors.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            interval_token = cdolist_list_var.first();
        }
        return interval_tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 55936L)
    public static SubLObject nl_trie_repair_token_indexes(final SubLObject tokens, final SubLObject alterations) {
        final SubLObject adjustment_hash = Hashtables.make_hash_table((SubLObject)nl_trie_accessors.SIXTEEN_INTEGER, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
        SubLObject new_tokens = (SubLObject)nl_trie_accessors.NIL;
        SubLObject cdolist_list_var = alterations;
        SubLObject cons = (SubLObject)nl_trie_accessors.NIL;
        cons = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject index = (SubLObject)nl_trie_accessors.NIL;
            SubLObject num_tokens = (SubLObject)nl_trie_accessors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list83);
            index = current.first();
            current = (num_tokens = current.rest());
            final SubLObject old_value = Hashtables.gethash(index, adjustment_hash, (SubLObject)nl_trie_accessors.ZERO_INTEGER);
            final SubLObject new_value = Numbers.add(old_value, Numbers.subtract((SubLObject)nl_trie_accessors.ONE_INTEGER, num_tokens));
            Hashtables.sethash(index, adjustment_hash, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        cdolist_list_var = tokens;
        SubLObject token = (SubLObject)nl_trie_accessors.NIL;
        token = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            SubLObject new_start;
            final SubLObject start = new_start = standard_tokenization.interval_token_start(token);
            SubLObject new_end;
            final SubLObject end = new_end = standard_tokenization.interval_token_end(token);
            final SubLObject value = standard_tokenization.interval_token_value(token);
            SubLObject i;
            for (i = (SubLObject)nl_trie_accessors.NIL, i = (SubLObject)nl_trie_accessors.ZERO_INTEGER; i.numL(start); i = Numbers.add(i, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
                new_start = Numbers.add(new_start, Hashtables.gethash(number_utilities.f_1X(i), adjustment_hash, (SubLObject)nl_trie_accessors.ZERO_INTEGER));
            }
            for (i = (SubLObject)nl_trie_accessors.NIL, i = (SubLObject)nl_trie_accessors.ZERO_INTEGER; i.numL(end); i = Numbers.add(i, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
                new_end = Numbers.add(new_end, Hashtables.gethash(i, adjustment_hash, (SubLObject)nl_trie_accessors.ZERO_INTEGER));
            }
            new_tokens = (SubLObject)ConsesLow.cons(standard_tokenization.new_interval_token(new_start, new_end, value), new_tokens);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return new_tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 56788L)
    public static SubLObject nl_trie_prefix_keys_from_string(final SubLObject trie, final SubLObject string, SubLObject case_sensitivity) {
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        assert nl_trie_accessors.NIL != nl_trie.nl_trie_p(trie, (SubLObject)nl_trie_accessors.UNPROVIDED) : trie;
        assert nl_trie_accessors.NIL != Types.stringp(string) : string;
        final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
        return nl_trie_prefixes(trie, tokens, case_sensitivity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 57100L)
    public static SubLObject nl_trie_prefixes(final SubLObject trie, final SubLObject key, SubLObject case_sensitivity) {
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nl_trie_accessors.NIL != nl_trie.nl_trie_p(trie, (SubLObject)nl_trie_accessors.UNPROVIDED) : trie;
        SubLObject filtered_nodes = (SubLObject)nl_trie_accessors.NIL;
        SubLObject quotedP = (SubLObject)nl_trie_accessors.NIL;
        thread.resetMultipleValues();
        final SubLObject standardized_keys = nl_trie.nl_trie_strings_keys(key);
        final SubLObject alteration_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject standardized_key = (SubLObject)nl_trie_accessors.NIL;
        SubLObject standardized_key_$43 = (SubLObject)nl_trie_accessors.NIL;
        SubLObject alterations = (SubLObject)nl_trie_accessors.NIL;
        SubLObject alterations_$44 = (SubLObject)nl_trie_accessors.NIL;
        standardized_key = standardized_keys;
        standardized_key_$43 = standardized_key.first();
        alterations = alteration_lists;
        alterations_$44 = alterations.first();
        while (nl_trie_accessors.NIL != alterations || nl_trie_accessors.NIL != standardized_key) {
            if (nl_trie_accessors.NIL != list_utilities.singletonP(standardized_key_$43) && nl_trie_accessors.NIL != string_utilities.quoted_stringP(standardized_key_$43.first())) {
                thread.resetMultipleValues();
                final SubLObject standardized_key_$44 = nl_trie.nl_trie_string_tokenize(string_utilities.unquote_string(standardized_key_$43.first()));
                final SubLObject alterations_$45 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                standardized_key_$43 = standardized_key_$44;
                alterations_$44 = alterations_$45;
                quotedP = (SubLObject)nl_trie_accessors.T;
            }
            SubLObject release = (SubLObject)nl_trie_accessors.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    SubLObject cdolist_list_var = strie.strie_prefixes(trie, standardized_key_$43);
                    SubLObject record = (SubLObject)nl_trie_accessors.NIL;
                    record = cdolist_list_var.first();
                    while (nl_trie_accessors.NIL != cdolist_list_var) {
                        SubLObject record_key = list_utilities.first_n(Sequences.length(nl_trie.nl_trie_record_key(record)), standardized_key_$43);
                        final SubLObject record_key_okP = nl_trie_prefix_key_jibes_with_alterationsP(record_key, alterations_$44);
                        SubLObject filtered_entries = (SubLObject)((nl_trie_accessors.NIL != record_key_okP) ? nl_trie.nl_trie_remove_invalid_entries(nl_trie_remove_inappropriate_entries(nl_trie.nl_trie_record_entries(record), (SubLObject)nl_trie_accessors.UNPROVIDED), trie, record_key) : nl_trie_accessors.NIL);
                        if (case_sensitivity != nl_trie_accessors.$kw77$OFF) {
                            if (nl_trie_accessors.NIL == nl_trie.nl_trie_case_sensitive_p(trie)) {
                                if (nl_trie_accessors.NIL != conses_high.member(case_sensitivity, (SubLObject)nl_trie_accessors.$list85, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                                    final SubLObject really_filtered = nl_trie.nl_trie_filter_entries_for_case(filtered_entries, record_key);
                                    if (case_sensitivity == nl_trie_accessors.$kw78$ON || nl_trie_accessors.NIL != list_utilities.non_empty_list_p(really_filtered)) {
                                        filtered_entries = really_filtered;
                                    }
                                }
                                else {
                                    Errors.error((SubLObject)nl_trie_accessors.$str86$Invalid_case_sensitivity_value_fo, case_sensitivity);
                                }
                            }
                        }
                        if (nl_trie_accessors.NIL != quotedP) {
                            filtered_entries = nl_trie_filter_unquoted_entries(filtered_entries);
                        }
                        if (nl_trie_accessors.NIL != filtered_entries) {
                            if (nl_trie_accessors.NIL != alterations_$44) {
                                record_key = nl_trie_find_original_prefix_key(Sequences.length(record_key), key, alterations_$44);
                            }
                            filtered_nodes = (SubLObject)ConsesLow.cons(nl_trie.new_nl_trie_record(record_key, filtered_entries), filtered_nodes);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        record = cdolist_list_var.first();
                    }
                }
                finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (nl_trie_accessors.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
            standardized_key = standardized_key.rest();
            standardized_key_$43 = standardized_key.first();
            alterations = alterations.rest();
            alterations_$44 = alterations.first();
        }
        return Sequences.nreverse(filtered_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 59551L)
    public static SubLObject nl_trie_prefixes_memoized_internal(final SubLObject trie, final SubLObject key, final SubLObject case_sensitivity, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lexicon_lookup_mt, thread);
            ans = nl_trie_prefixes(trie, key, case_sensitivity);
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 59551L)
    public static SubLObject nl_trie_prefixes_memoized(final SubLObject trie, final SubLObject key, final SubLObject case_sensitivity, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == nl_trie_accessors.UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie_accessors.NIL;
        if (nl_trie_accessors.NIL == v_memoization_state) {
            return nl_trie_prefixes_memoized_internal(trie, key, case_sensitivity, lexicon_lookup_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie_accessors.$sym87$NL_TRIE_PREFIXES_MEMOIZED, (SubLObject)nl_trie_accessors.UNPROVIDED);
        if (nl_trie_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie_accessors.$sym87$NL_TRIE_PREFIXES_MEMOIZED, (SubLObject)nl_trie_accessors.FOUR_INTEGER, (SubLObject)nl_trie_accessors.$int88$512, (SubLObject)nl_trie_accessors.EQUAL, (SubLObject)nl_trie_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie_accessors.$sym87$NL_TRIE_PREFIXES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(trie, key, case_sensitivity, lexicon_lookup_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie_accessors.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (trie.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (key.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (case_sensitivity.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (nl_trie_accessors.NIL != cached_args && nl_trie_accessors.NIL == cached_args.rest() && lexicon_lookup_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_prefixes_memoized_internal(trie, key, case_sensitivity, lexicon_lookup_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(trie, key, case_sensitivity, lexicon_lookup_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 59878L)
    public static SubLObject nl_trie_filter_unquoted_entries(final SubLObject entries) {
        SubLObject filtered_entries = (SubLObject)nl_trie_accessors.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
        entry = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            if (nl_trie_accessors.NIL != nl_trie_unquoted_entry_okP(entry)) {
                filtered_entries = (SubLObject)ConsesLow.cons(entry, filtered_entries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_entries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 60122L)
    public static SubLObject nl_trie_unquoted_entry_okP(final SubLObject entry) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != lexicon_accessors.genl_pos_predP(nl_trie_entry_name_pred_or_syntactic_preds(entry), nl_trie_accessors.$const89$titleOfWork, (SubLObject)nl_trie_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 60308L)
    public static SubLObject nl_trie_access_case_sensitive_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), (SubLObject)nl_trie_accessors.$kw78$ON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 60424L)
    public static SubLObject nl_trie_prefix_key_jibes_with_alterationsP(final SubLObject prefix_key, final SubLObject alterations) {
        if (nl_trie_accessors.NIL == alterations) {
            return (SubLObject)nl_trie_accessors.T;
        }
        final SubLObject prefix_key_length = Sequences.length(prefix_key);
        SubLObject largest_known_valid_length = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
        if (prefix_key_length.isZero()) {
            return (SubLObject)nl_trie_accessors.T;
        }
        SubLObject end_var;
        SubLObject original_token_num;
        SubLObject new_token_count;
        for (end_var = prefix_key_length, original_token_num = (SubLObject)nl_trie_accessors.NIL, original_token_num = (SubLObject)nl_trie_accessors.ZERO_INTEGER; !original_token_num.numGE(end_var); original_token_num = number_utilities.f_1X(original_token_num)) {
            new_token_count = list_utilities.alist_lookup(alterations, original_token_num, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), (SubLObject)nl_trie_accessors.ONE_INTEGER);
            largest_known_valid_length = Numbers.add(largest_known_valid_length, new_token_count);
            if (prefix_key_length.eql(largest_known_valid_length)) {
                return (SubLObject)nl_trie_accessors.T;
            }
            if (largest_known_valid_length.numG(prefix_key_length)) {
                return (SubLObject)nl_trie_accessors.NIL;
            }
        }
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 61526L)
    public static SubLObject nl_trie_find_original_prefix_key(SubLObject entry_key_length, final SubLObject original_strings, final SubLObject alterations) {
        SubLObject original_key = (SubLObject)nl_trie_accessors.NIL;
        SubLObject entry_key_index;
        SubLObject alternation_length;
        for (entry_key_index = (SubLObject)nl_trie_accessors.NIL, entry_key_index = (SubLObject)nl_trie_accessors.ZERO_INTEGER; !entry_key_index.numGE(entry_key_length); entry_key_index = number_utilities.f_1X(entry_key_index)) {
            original_key = (SubLObject)ConsesLow.cons(ConsesLow.nth(entry_key_index, original_strings), original_key);
            alternation_length = list_utilities.alist_lookup(alterations, entry_key_index, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), (SubLObject)nl_trie_accessors.ONE_INTEGER);
            if (alternation_length.numG((SubLObject)nl_trie_accessors.ONE_INTEGER)) {
                entry_key_length = Numbers.subtract(entry_key_length, Numbers.subtract(alternation_length, (SubLObject)nl_trie_accessors.ONE_INTEGER));
            }
        }
        return Sequences.nreverse(original_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 62170L)
    public static SubLObject nl_trie_unknown_strings(final SubLObject string, final SubLObject mt, SubLObject case_sensitivity) {
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject tokens = nl_trie_unknown_string_tokens(string, mt, case_sensitivity);
        SubLObject result = (SubLObject)nl_trie_accessors.NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)nl_trie_accessors.NIL;
        token = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(standard_tokenization.string_token_string(standard_tokenization.interval_token_value(token)), result);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 62684L)
    public static SubLObject nl_trie_unknown_string_tokens(final SubLObject string, SubLObject mt, SubLObject case_sensitivity) {
        if (mt == nl_trie_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject word_list = standard_tokenization.standard_string_tokenize(string);
        final SubLObject word_count = Sequences.length(word_list);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            final SubLObject starting_index = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
            final SubLObject interval_tokens = nl_trie_sentence_tokenize(word_list, (SubLObject)nl_trie_accessors.$kw76$INTERVAL, (SubLObject)nl_trie_accessors.$kw56$GREEDY, Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY), starting_index, case_sensitivity);
            SubLObject index;
            for (index = (SubLObject)nl_trie_accessors.NIL, index = (SubLObject)nl_trie_accessors.ZERO_INTEGER; index.numL(word_count); index = Numbers.add(index, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
                if (nl_trie_accessors.NIL == subl_promotions.memberP(index, interval_tokens, (SubLObject)nl_trie_accessors.$sym90$INDEX_COVERED_BY_TOKEN_P, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(standard_tokenization.new_interval_token(index, number_utilities.f_1X(index), standard_tokenization.new_string_token(ConsesLow.nth(index, word_list), (SubLObject)nl_trie_accessors.UNPROVIDED)), result);
                }
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 63664L)
    public static SubLObject index_covered_by_token_p(final SubLObject index, final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != nl_trie_token_has_meaning_p(token) && index.numGE(standard_tokenization.interval_token_start(token)) && index.numL(standard_tokenization.interval_token_end(token)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64168L)
    public static SubLObject nl_trie_token_has_meaning_p(final SubLObject token) {
        final SubLObject string_token = standard_tokenization.interval_token_value(token);
        return list_utilities.sublisp_boolean(standard_tokenization.string_token_value(string_token));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64418L)
    public static SubLObject spelling_const_satisfiedP(final SubLObject misspellingsP, final SubLObject nl_trie_entry) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != misspellingsP || !nl_trie.nl_trie_entry_mt(nl_trie_entry).eql(nl_trie_accessors.$const91$CommonEnglishMisspellingsMt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64907L)
    public static SubLObject contains_periodP(final SubLObject string) {
        return string_utilities.contains_charP(string, (SubLObject)Characters.CHAR_period);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64988L)
    public static SubLObject period_const_satisfiedP(final SubLObject contains_periodP, final SubLObject entry, final SubLObject string) {
        if (nl_trie_accessors.NIL == contains_periodP) {
            return (SubLObject)nl_trie_accessors.T;
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(entry, (SubLObject)nl_trie_accessors.T)) {
            final SubLObject entry_string = nl_trie.nl_trie_name_string_macro_helper(entry);
            if (string.equalp(entry_string)) {
                return (SubLObject)nl_trie_accessors.T;
            }
        }
        else if (nl_trie_accessors.NIL != nl_trie.nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie_accessors.T)) {
            final SubLObject entry_string = assertions_high.gaf_arg3(entry);
            if (string.equalp(entry_string)) {
                return (SubLObject)nl_trie_accessors.T;
            }
        }
        else if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            final SubLObject head_string = nl_trie.nl_trie_word_head_string_macro_helper(entry);
            final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set(entry);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject leading_strings;
            SubLObject following_strings;
            SubLObject entry_string2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                    leading_strings = nl_trie.nl_trie_word_leading_strings_from_support_macro_helper(semantic_support);
                    following_strings = nl_trie.nl_trie_word_following_strings_from_support_macro_helper(semantic_support);
                    entry_string2 = nl_trie.nl_trie_assemble_strings_macro_helper(leading_strings, head_string, following_strings);
                    if (string.equalp(entry_string2)) {
                        return (SubLObject)nl_trie_accessors.T;
                    }
                }
            }
        }
        else if (nl_trie_accessors.NIL != abstract_lexicon.lex_entry_p(entry)) {
            final SubLObject entry_string = nl_trie.nl_trie_lex_entry_get(entry, (SubLObject)nl_trie_accessors.$kw3$STRING);
            if (string.equalp(entry_string)) {
                return (SubLObject)nl_trie_accessors.T;
            }
        }
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 65512L)
    public static SubLObject pos_pred_const_satisfiedP(final SubLObject pred, final SubLObject preds) {
        return subl_promotions.memberP(pred, preds, (SubLObject)nl_trie_accessors.$sym67$SPEC_POS_PRED_, (SubLObject)nl_trie_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 65699L)
    public static SubLObject nl_trie_record_filter_mt(final SubLObject record, final SubLObject mt) {
        if (nl_trie_accessors.NIL != subl_promotions.memberP(mt, (SubLObject)nl_trie_accessors.$list92, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return record;
        }
        final SubLObject entries = nl_trie.nl_trie_record_entries(record);
        SubLObject filtered = (SubLObject)nl_trie_accessors.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
        entry = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            final SubLObject semantic_mt = nl_trie.nl_trie_entry_semantic_mt(entry);
            final SubLObject entry_mt = (nl_trie_accessors.NIL != semantic_mt) ? semantic_mt : nl_trie.nl_trie_entry_mt(entry);
            if (nl_trie_accessors.NIL != lexicon_accessors.genl_lexicon_mtP(mt, entry_mt)) {
                filtered = (SubLObject)ConsesLow.cons(entry, filtered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)((nl_trie_accessors.NIL != filtered) ? nl_trie.new_nl_trie_record(nl_trie.nl_trie_record_key(record), Sequences.nreverse(filtered)) : nl_trie_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 66414L)
    public static SubLObject gated_nl_trie_search(final SubLObject string, SubLObject case_sensitivity, SubLObject semanticP) {
        if (case_sensitivity == nl_trie_accessors.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (semanticP == nl_trie_accessors.UNPROVIDED) {
            semanticP = (SubLObject)nl_trie_accessors.NIL;
        }
        SubLObject ans = nl_trie.nl_trie_search(string, nl_trie.get_nl_trie(), case_sensitivity);
        if (nl_trie_accessors.NIL != list_utilities.non_empty_list_p(ans)) {
            ans = nl_trie_filter_pragmatics(ans, semanticP);
        }
        return (SubLObject)((nl_trie_accessors.NIL != list_utilities.empty_list_p(ans) && case_sensitivity.eql((SubLObject)nl_trie_accessors.$kw93$PREFERRED)) ? gated_nl_trie_search(string, (SubLObject)nl_trie_accessors.$kw77$OFF, (SubLObject)nl_trie_accessors.UNPROVIDED) : ((ans == nl_trie_accessors.$kw94$ABORTED) ? nl_trie_accessors.NIL : ans));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 66886L)
    public static SubLObject nl_trie_filter_pragmatics(final SubLObject trie_entries, SubLObject semanticP) {
        if (semanticP == nl_trie_accessors.UNPROVIDED) {
            semanticP = (SubLObject)nl_trie_accessors.NIL;
        }
        return nl_trie_remove_inappropriate_entries(trie_entries, semanticP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67165L)
    public static SubLObject nl_trie_remove_inappropriate_entries(final SubLObject trie_entries, SubLObject semanticP) {
        if (semanticP == nl_trie_accessors.UNPROVIDED) {
            semanticP = (SubLObject)nl_trie_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject _prev_bind_0 = nl_trie_accessors.$nl_trie_check_semantic_mtP$.currentBinding(thread);
        try {
            nl_trie_accessors.$nl_trie_check_semantic_mtP$.bind(semanticP, thread);
            ans = Sequences.remove_if((SubLObject)nl_trie_accessors.$sym95$NL_TRIE_INAPPROPRIATE_ENTRY_, trie_entries, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
        }
        finally {
            nl_trie_accessors.$nl_trie_check_semantic_mtP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67498L)
    public static SubLObject nl_trie_inappropriate_entryP(final SubLObject trie_entry, SubLObject semanticP) {
        if (semanticP == nl_trie_accessors.UNPROVIDED) {
            semanticP = nl_trie_accessors.$nl_trie_check_semantic_mtP$.getDynamicValue();
        }
        if (nl_trie_accessors.NIL != lexicon_vars.active_lexicon_filtersP() && nl_trie_accessors.NIL != list_utilities.find_if_not((SubLObject)nl_trie_accessors.$sym96$PRAGMATICALLY_ACCEPTABLE_, nl_trie.nl_trie_entry_pragmatics(trie_entry), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym97$FIRST), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return (SubLObject)nl_trie_accessors.T;
        }
        if (nl_trie_accessors.NIL == nl_trie_entry_mt_okP(trie_entry, semanticP)) {
            return (SubLObject)nl_trie_accessors.T;
        }
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67934L)
    public static SubLObject nl_trie_entry_mt_okP(final SubLObject entry, SubLObject semanticP) {
        if (semanticP == nl_trie_accessors.UNPROVIDED) {
            semanticP = nl_trie_accessors.$nl_trie_check_semantic_mtP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry_mt = (nl_trie_accessors.NIL != semanticP) ? nl_trie.nl_trie_entry_semantic_mt(entry) : nl_trie.nl_trie_entry_mt(entry);
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == entry_mt || nl_trie_accessors.NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), entry_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 68213L)
    public static SubLObject nl_trie_string_to_use(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nl_trie_accessors.NIL;
        SubLObject release = (SubLObject)nl_trie_accessors.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                final SubLObject node = map_utilities.map_get_without_values(nl_trie.get_nl_trie(), string, (SubLObject)nl_trie_accessors.UNPROVIDED);
                final SubLObject existing_string = nl_trie_match_string(string, node);
                result = ((nl_trie_accessors.NIL != existing_string) ? existing_string : string);
            }
            finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie_accessors.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 68731L)
    public static SubLObject nl_trie_match_string(final SubLObject string, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)nl_trie_accessors.NIL;
        if (node.isCons()) {
            ans = node.first().first();
            if (ans.isString() && !ans.eql(string)) {}
        }
        else if (nl_trie_accessors.NIL != map_utilities.map_p(node)) {
            final SubLObject iterator = map_utilities.new_map_iterator(node);
            SubLObject valid;
            for (SubLObject done_var = ans; nl_trie_accessors.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid || nl_trie_accessors.NIL != ans)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (nl_trie_accessors.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)nl_trie_accessors.NIL;
                    SubLObject subnode = (SubLObject)nl_trie_accessors.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list98);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list98);
                    subnode = current.first();
                    current = current.rest();
                    if (nl_trie_accessors.NIL == current) {
                        final SubLObject result = nl_trie_match_string(string, subnode);
                        if (nl_trie_accessors.NIL != Functions.funcall(strie.strie_test(nl_trie.get_nl_trie()), result, string)) {
                            ans = result;
                        }
                        else if (result.isString()) {
                            Errors.warn((SubLObject)nl_trie_accessors.$str99$Found_non_matching_string___S_vs_, result, string);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list98);
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 69450L)
    public static SubLObject do_supporting_trie_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)nl_trie_accessors.NIL;
        SubLObject support = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list100);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list100);
        support = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current_$47 = (SubLObject)nl_trie_accessors.NIL;
        while (nl_trie_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list100);
            current_$47 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie_accessors.$list100);
            if (nl_trie_accessors.NIL == conses_high.member(current_$47, (SubLObject)nl_trie_accessors.$list101, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                bad = (SubLObject)nl_trie_accessors.T;
            }
            if (current_$47 == nl_trie_accessors.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie_accessors.NIL != bad && nl_trie_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list100);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie_accessors.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((nl_trie_accessors.NIL != done_tail) ? conses_high.cadr(done_tail) : nl_trie_accessors.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject asent = (SubLObject)nl_trie_accessors.$sym102$ASENT;
        final SubLObject mt = (SubLObject)nl_trie_accessors.$sym103$MT;
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(asent, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym104$SUPPORT_SENTENCE, support)), (SubLObject)ConsesLow.list(mt, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym105$SUPPORT_MT, support))), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym106$DO_NL_TRIE_WORD_ENTRIES_FOR_STRING, (SubLObject)ConsesLow.list(word, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym107$ATOMIC_SENTENCE_ARG2, asent), mt), (SubLObject)ConsesLow.listS((SubLObject)nl_trie_accessors.$sym26$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym27$CAND, (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym108$CNOT, done), (SubLObject)ConsesLow.list((SubLObject)nl_trie_accessors.$sym109$MATCHING_WORD_STRINGS_ENTRY_, word, asent)), ConsesLow.append(body, (SubLObject)nl_trie_accessors.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 70106L)
    public static SubLObject matching_word_strings_entryP(final SubLObject entry, final SubLObject asent) {
        SubLObject okP = (SubLObject)nl_trie_accessors.NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)nl_trie_accessors.UNPROVIDED);
        SubLObject pos_pred = (SubLObject)nl_trie_accessors.NIL;
        SubLObject word = (SubLObject)nl_trie_accessors.NIL;
        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list111);
        pos_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list111);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list111);
        string = current.first();
        current = current.rest();
        if (nl_trie_accessors.NIL == current) {
            if (word.equal(nl_trie.nl_trie_word_word_unit(entry, (SubLObject)nl_trie_accessors.NIL)) && string.equal(nl_trie.nl_trie_entry_string(entry)) && nl_trie_accessors.NIL == okP) {
                SubLObject csome_list_var;
                SubLObject entry_pos_pred;
                for (csome_list_var = nl_trie.nl_trie_entry_pos_preds(entry), entry_pos_pred = (SubLObject)nl_trie_accessors.NIL, entry_pos_pred = csome_list_var.first(); nl_trie_accessors.NIL == okP && nl_trie_accessors.NIL != csome_list_var; okP = lexicon_accessors.genl_pos_predP(entry_pos_pred, pos_pred, (SubLObject)nl_trie_accessors.UNPROVIDED), csome_list_var = csome_list_var.rest(), entry_pos_pred = csome_list_var.first()) {}
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list111);
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 70550L)
    public static SubLObject nl_trie_hl_justify_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)nl_trie_accessors.NIL;
        SubLObject trie_support_pos_pred = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject asent = arguments.support_sentence(support);
        final SubLObject mt = arguments.support_mt(support);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)nl_trie_accessors.UNPROVIDED), lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), (SubLObject)nl_trie_accessors.NIL);
            SubLObject trie_word = (SubLObject)nl_trie_accessors.NIL;
            trie_word = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(trie_word) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)nl_trie_accessors.UNPROVIDED)), trie_word, cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)nl_trie_accessors.UNPROVIDED)) && nl_trie_accessors.NIL != spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), trie_word) && nl_trie_accessors.NIL == supports && nl_trie_accessors.NIL != matching_word_strings_entryP(trie_word, asent)) {
                    final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set(trie_word);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject trie_word_support;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        trie_word_support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, trie_word_support)) {
                            if (nl_trie_accessors.NIL != arguments.support_p(trie_word_support)) {
                                supports = (SubLObject)ConsesLow.cons(trie_word_support, supports);
                                trie_support_pos_pred = arguments.support_sentence_operator(trie_word_support);
                            }
                            else if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_hl_syntactic_support_p(trie_word_support, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                                supports = nl_trie.nl_trie_justify_hl_syntactic_support(trie_word_support);
                                trie_support_pos_pred = cycl_utilities.formula_arg0(trie_word_support.first());
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                trie_word = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (nl_trie_accessors.NIL != trie_support_pos_pred) {
            final SubLObject support_pred = arguments.support_sentence_operator(support);
            if (!support_pred.equal(trie_support_pos_pred)) {
                supports = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(trie_support_pos_pred, support_pred), supports);
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 71423L)
    public static SubLObject nl_trie_hl_forward_mt_combos_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)nl_trie_accessors.NIL;
        SubLObject mts = (SubLObject)nl_trie_accessors.NIL;
        SubLObject hl_module = (SubLObject)nl_trie_accessors.NIL;
        SubLObject el_sentence = (SubLObject)nl_trie_accessors.NIL;
        SubLObject mt = (SubLObject)nl_trie_accessors.NIL;
        SubLObject tv = (SubLObject)nl_trie_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)nl_trie_accessors.$list112);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)nl_trie_accessors.$list112);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)nl_trie_accessors.$list112);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)nl_trie_accessors.$list112);
        tv = current.first();
        current = current.rest();
        if (nl_trie_accessors.NIL == current) {
            final SubLObject pcase_var = mt;
            if (pcase_var.eql(nl_trie_accessors.$const62$InferencePSC)) {
                final SubLObject asent = arguments.support_sentence(support);
                final SubLObject mt_$48 = arguments.support_mt(support);
                final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(mt_$48, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject entries = cdolist_list_var = gated_nl_trie_search(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)nl_trie_accessors.UNPROVIDED), lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread), (SubLObject)nl_trie_accessors.NIL);
                    SubLObject trie_word = (SubLObject)nl_trie_accessors.NIL;
                    trie_word = cdolist_list_var.first();
                    while (nl_trie_accessors.NIL != cdolist_list_var) {
                        if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw37$WORD || nl_trie.nl_trie_entry_type(trie_word) == nl_trie_accessors.$kw37$WORD) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)nl_trie_accessors.UNPROVIDED)), trie_word, cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)nl_trie_accessors.UNPROVIDED)) && nl_trie_accessors.NIL != spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), trie_word) && nl_trie_accessors.NIL != matching_word_strings_entryP(trie_word, asent)) {
                            final SubLObject item_var = nl_trie.nl_trie_entry_mt(trie_word);
                            if (nl_trie_accessors.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL), Symbols.symbol_function((SubLObject)nl_trie_accessors.IDENTITY))) {
                                mts = (SubLObject)ConsesLow.cons(item_var, mts);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        trie_word = cdolist_list_var.first();
                    }
                }
                finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                supports = (SubLObject)ConsesLow.list(support);
            }
            SubLObject cdolist_list_var2 = genl_mts.max_floor_mts(mts, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
            SubLObject mt_$49 = (SubLObject)nl_trie_accessors.NIL;
            mt_$49 = cdolist_list_var2.first();
            while (nl_trie_accessors.NIL != cdolist_list_var2) {
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, el_sentence, mt_$49, tv), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$49 = cdolist_list_var2.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)nl_trie_accessors.$list112);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 71949L)
    public static SubLObject nl_trie_get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject term_phrases_constraint, final SubLObject case_insensitiveP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supports = set.new_set(Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject entries = cdolist_list_var = gated_nl_trie_search(string, (SubLObject)((nl_trie_accessors.NIL != case_insensitiveP) ? nl_trie_accessors.$kw77$OFF : nl_trie_accessors.$kw78$ON), (SubLObject)nl_trie_accessors.T);
            SubLObject entry = (SubLObject)nl_trie_accessors.NIL;
            entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if ((nl_trie_accessors.$kw14$ANY == nl_trie_accessors.$kw14$ANY || nl_trie.nl_trie_entry_type(entry) == nl_trie_accessors.$kw14$ANY) && nl_trie_accessors.NIL != period_const_satisfiedP(contains_periodP(string), entry, string) && nl_trie_accessors.NIL != spelling_const_satisfiedP(lexicon_vars.$misspellingsP$.getDynamicValue(thread), entry) && nl_trie_accessors.NIL != set.empty_set_p(supports) && nl_trie_accessors.NIL != subl_promotions.memberP(denot, nl_trie.nl_trie_entry_denots(entry), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym113$EQUALS_EL_), (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != nl_trie_entry_matches_term_phrases_constraintP(entry, term_phrases_constraint, mt)) {
                    add_nl_trie_supports(entry, supports, denot, term_phrases_constraint, mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 72578L)
    public static SubLObject add_nl_trie_supports(final SubLObject entry, final SubLObject supports, final SubLObject denot, final SubLObject term_phrases_constraint, final SubLObject mt) {
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != arguments.support_p(entry)) {
            final SubLObject support_pred = nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED);
            if (nl_trie_accessors.NIL != fort_types_interface.isa_predicateP(term_phrases_constraint, mt) && !support_pred.eql(term_phrases_constraint) && nl_trie_accessors.NIL != genl_predicates.genl_predicateP(support_pred, term_phrases_constraint, mt, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                set.set_add(removal_module_utilities.make_genl_preds_support(support_pred, term_phrases_constraint), supports);
            }
            set.set_add(entry, supports);
        }
        else if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set(entry);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject support;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                support = set_contents.do_set_contents_next(basis_object, state);
                if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie_accessors.NIL != subl_promotions.memberP(denot, nl_trie.nl_trie_word_semantic_support_denots(support, (SubLObject)nl_trie_accessors.UNPROVIDED), Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    set.set_add(support, supports);
                }
            }
            SubLObject pos_pred = (SubLObject)nl_trie_accessors.NIL;
            final SubLObject set_var2 = nl_trie.nl_trie_word_syntactic_support_set(entry);
            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject support2;
            SubLObject support_pred2;
            SubLObject speech_part_predP;
            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)nl_trie_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                support2 = set_contents.do_set_contents_next(basis_object2, state2);
                if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state2, support2)) {
                    support_pred2 = nl_trie.nl_trie_word_support_predicate(support2);
                    speech_part_predP = lexicon_accessors.speech_part_predP(support_pred2, mt);
                    if (nl_trie_accessors.NIL == speech_part_predP || nl_trie_accessors.NIL == pos_pred) {
                        if (nl_trie_accessors.NIL != speech_part_predP && !support_pred2.eql(term_phrases_constraint) && nl_trie_accessors.NIL != genl_predicates.genl_predicateP(support_pred2, term_phrases_constraint, mt, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                            set.set_add(removal_module_utilities.make_genl_preds_support(support_pred2, term_phrases_constraint), supports);
                        }
                        if (nl_trie_accessors.NIL != arguments.support_p(support2)) {
                            set.set_add(support2, supports);
                        }
                        else if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_hl_syntactic_support_p(support2, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                            set_utilities.set_add_all(nl_trie.nl_trie_justify_hl_syntactic_support(support2), supports);
                        }
                        if (nl_trie_accessors.NIL != speech_part_predP) {
                            pos_pred = support_pred2;
                        }
                    }
                }
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 74084L)
    public static SubLObject nl_trie_entry_matches_term_phrases_constraintP(final SubLObject entry, final SubLObject term_phrases_constraint, final SubLObject mt) {
        if (nl_trie_accessors.NIL != conses_high.member(term_phrases_constraint, (SubLObject)nl_trie_accessors.$list114, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return (SubLObject)nl_trie_accessors.T;
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean((nl_trie_accessors.NIL != nl_trie.nl_trie_name_string_predP(term_phrases_constraint) && nl_trie_accessors.NIL != genl_predicates.genl_predicateP(nl_trie.nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie_accessors.UNPROVIDED), term_phrases_constraint, mt, (SubLObject)nl_trie_accessors.UNPROVIDED)) || nl_trie_accessors.NIL != genls.genlP(nl_trie_accessors.$const115$NounPhrase, term_phrases_constraint, mt, (SubLObject)nl_trie_accessors.UNPROVIDED) || nl_trie_accessors.NIL != genls.genlP(nl_trie_accessors.$const116$ProperNameString, term_phrases_constraint, mt, (SubLObject)nl_trie_accessors.UNPROVIDED));
        }
        if (nl_trie_accessors.NIL != genls.genlP(term_phrases_constraint, nl_trie_accessors.$const117$NLPhrase, mt, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return (SubLObject)nl_trie_accessors.NIL;
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(term_phrases_constraint, nl_trie_accessors.$const118$phrase_Bar1, mt, (SubLObject)nl_trie_accessors.TWO_INTEGER, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            return nl_trie_entry_matches_term_phrases_constraintP(entry, kb_mapping_utilities.fpred_value_in_relevant_mts(term_phrases_constraint, nl_trie_accessors.$const118$phrase_Bar1, mt, (SubLObject)nl_trie_accessors.TWO_INTEGER, (SubLObject)nl_trie_accessors.ONE_INTEGER, (SubLObject)nl_trie_accessors.UNPROVIDED), mt);
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != lexicon_accessors.speech_partP(term_phrases_constraint, mt)) {
            return lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(entry), term_phrases_constraint, mt);
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != lexicon_accessors.speech_part_predP(term_phrases_constraint, mt)) {
            SubLObject csome_list_var = nl_trie.nl_trie_word_pos_preds(entry);
            SubLObject entry_pred = (SubLObject)nl_trie_accessors.NIL;
            entry_pred = csome_list_var.first();
            while (nl_trie_accessors.NIL != csome_list_var) {
                if (nl_trie_accessors.NIL != lexicon_accessors.genl_pos_predP(entry_pred, term_phrases_constraint, mt)) {
                    return (SubLObject)nl_trie_accessors.T;
                }
                csome_list_var = csome_list_var.rest();
                entry_pred = csome_list_var.first();
            }
            return (SubLObject)nl_trie_accessors.NIL;
        }
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(entry, (SubLObject)nl_trie_accessors.UNPROVIDED) && nl_trie_accessors.NIL != nl_trie.nl_trie_name_string_predP(term_phrases_constraint)) {
            return (SubLObject)nl_trie_accessors.NIL;
        }
        Errors.error((SubLObject)nl_trie_accessors.$str119$Don_t_know_how_to_check__S_agains, term_phrases_constraint, entry);
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76481L)
    public static SubLObject nl_trie_rotations(final SubLObject string) {
        if (!string.isString()) {
            Errors.warn((SubLObject)nl_trie_accessors.$str123$tried_to_determine_rotations_for_, string);
            return (SubLObject)nl_trie_accessors.NIL;
        }
        return string_utilities.string_rotations(string, nl_trie_accessors.$nl_trie_stoplist_trie$.getGlobalValue(), nl_trie_accessors.$nl_trie_rotate_characters$.getGlobalValue(), nl_trie_accessors.$nl_trie_rotate_point_string$.getGlobalValue(), (SubLObject)nl_trie_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject nl_trie_index_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_nl_trie_index_item(v_object, stream, (SubLObject)nl_trie_accessors.ZERO_INTEGER);
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject nl_trie_index_item_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $nl_trie_index_item_native.class) ? nl_trie_accessors.T : nl_trie_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject nl_trie_index_item_term(final SubLObject v_object) {
        assert nl_trie_accessors.NIL != nl_trie_index_item_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject nl_trie_index_item_phrase(final SubLObject v_object) {
        assert nl_trie_accessors.NIL != nl_trie_index_item_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject nl_trie_index_item_mt(final SubLObject v_object) {
        assert nl_trie_accessors.NIL != nl_trie_index_item_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject _csetf_nl_trie_index_item_term(final SubLObject v_object, final SubLObject value) {
        assert nl_trie_accessors.NIL != nl_trie_index_item_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject _csetf_nl_trie_index_item_phrase(final SubLObject v_object, final SubLObject value) {
        assert nl_trie_accessors.NIL != nl_trie_index_item_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject _csetf_nl_trie_index_item_mt(final SubLObject v_object, final SubLObject value) {
        assert nl_trie_accessors.NIL != nl_trie_index_item_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject make_nl_trie_index_item(SubLObject arglist) {
        if (arglist == nl_trie_accessors.UNPROVIDED) {
            arglist = (SubLObject)nl_trie_accessors.NIL;
        }
        final SubLObject v_new = (SubLObject)new $nl_trie_index_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)nl_trie_accessors.NIL, next = arglist; nl_trie_accessors.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)nl_trie_accessors.$kw139$TERM)) {
                _csetf_nl_trie_index_item_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_trie_accessors.$kw140$PHRASE)) {
                _csetf_nl_trie_index_item_phrase(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_trie_accessors.$kw141$MT)) {
                _csetf_nl_trie_index_item_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)nl_trie_accessors.$str142$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject visit_defstruct_nl_trie_index_item(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie_accessors.$kw143$BEGIN, (SubLObject)nl_trie_accessors.$sym144$MAKE_NL_TRIE_INDEX_ITEM, (SubLObject)nl_trie_accessors.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie_accessors.$kw145$SLOT, (SubLObject)nl_trie_accessors.$kw139$TERM, nl_trie_index_item_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie_accessors.$kw145$SLOT, (SubLObject)nl_trie_accessors.$kw140$PHRASE, nl_trie_index_item_phrase(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie_accessors.$kw145$SLOT, (SubLObject)nl_trie_accessors.$kw141$MT, nl_trie_index_item_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie_accessors.$kw146$END, (SubLObject)nl_trie_accessors.$sym144$MAKE_NL_TRIE_INDEX_ITEM, (SubLObject)nl_trie_accessors.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
    public static SubLObject visit_defstruct_object_nl_trie_index_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_nl_trie_index_item(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 77427L)
    public static SubLObject new_nl_trie_index_item(final SubLObject v_term, final SubLObject phrase, final SubLObject mt) {
        final SubLObject new_item = make_nl_trie_index_item((SubLObject)nl_trie_accessors.UNPROVIDED);
        _csetf_nl_trie_index_item_term(new_item, v_term);
        _csetf_nl_trie_index_item_phrase(new_item, phrase);
        _csetf_nl_trie_index_item_mt(new_item, mt);
        return new_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 77781L)
    public static SubLObject print_nl_trie_index_item(final SubLObject item, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)nl_trie_accessors.$str148$_NL_TRIE_INDEX_ITEM__s__s__a_, new SubLObject[] { nl_trie_index_item_term(item), nl_trie_index_item_phrase(item), nl_trie_index_item_mt(item) });
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78029L)
    public static SubLObject extract_nl_trie_indexing_data(final SubLObject phrase, final SubLObject nl_trie_data) {
        SubLObject nl_trie_index_items = (SubLObject)nl_trie_accessors.NIL;
        SubLObject cdolist_list_var = nl_trie_data;
        SubLObject nl_trie_entry = (SubLObject)nl_trie_accessors.NIL;
        nl_trie_entry = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            nl_trie_index_items = Sequences.cconcatenate(nl_trie_index_items, extract_nl_trie_indexing_data_from_entry(phrase, nl_trie_entry));
            cdolist_list_var = cdolist_list_var.rest();
            nl_trie_entry = cdolist_list_var.first();
        }
        return nl_trie_index_items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78427L)
    public static SubLObject extract_nl_trie_indexing_data_from_entry(final SubLObject phrase, final SubLObject nl_trie_entry) {
        SubLObject result = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject mt = nl_trie.nl_trie_entry_mt(nl_trie_entry);
        if (nl_trie_accessors.NIL != nl_trie.nl_trie_name_p(nl_trie_entry, (SubLObject)nl_trie_accessors.T)) {
            final SubLObject denot = nl_trie.nl_trie_name_denot(nl_trie_entry);
            result = (SubLObject)ConsesLow.cons(new_nl_trie_index_item(denot, phrase, mt), result);
        }
        else if (nl_trie_accessors.NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, (SubLObject)nl_trie_accessors.T)) {
            final SubLObject denot = assertions_high.gaf_arg1(nl_trie_entry);
            result = (SubLObject)ConsesLow.cons(new_nl_trie_index_item(denot, phrase, mt), result);
        }
        else if (nl_trie_accessors.NIL != nl_trie.nl_trie_word_p(nl_trie_entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
            final SubLObject pred = nl_trie.nl_trie_word_sem_pred(nl_trie_entry, (SubLObject)nl_trie_accessors.NIL);
            final SubLObject denot_arg = (SubLObject)((nl_trie_accessors.NIL != kb_indexing_datastructures.indexed_term_p(pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(pred) : nl_trie_accessors.NIL);
            if (denot_arg.isInteger()) {
                final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set(nl_trie_entry);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject semantic_support;
                SubLObject cdolist_list_var;
                SubLObject denot2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    semantic_support = set_contents.do_set_contents_next(basis_object, state);
                    if (nl_trie_accessors.NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                        cdolist_list_var = nl_trie.nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                        denot2 = (SubLObject)nl_trie_accessors.NIL;
                        denot2 = cdolist_list_var.first();
                        while (nl_trie_accessors.NIL != cdolist_list_var) {
                            result = (SubLObject)ConsesLow.cons(new_nl_trie_index_item(denot2, phrase, mt), result);
                            cdolist_list_var = cdolist_list_var.rest();
                            denot2 = cdolist_list_var.first();
                        }
                    }
                }
            }
        }
        else if (nl_trie_accessors.NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
            SubLObject cdolist_list_var2 = nl_trie.nl_trie_lex_entry_get(nl_trie_entry, (SubLObject)nl_trie_accessors.$kw149$DENOTS);
            SubLObject denot3 = (SubLObject)nl_trie_accessors.NIL;
            denot3 = cdolist_list_var2.first();
            while (nl_trie_accessors.NIL != cdolist_list_var2) {
                result = (SubLObject)ConsesLow.cons(new_nl_trie_index_item(denot3, phrase, mt), result);
                cdolist_list_var2 = cdolist_list_var2.rest();
                denot3 = cdolist_list_var2.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78698L)
    public static SubLObject force_nl_trie_rotation_index_initialization(SubLObject max_num) {
        if (max_num == nl_trie_accessors.UNPROVIDED) {
            max_num = (SubLObject)nl_trie_accessors.NIL;
        }
        nl_trie_accessors.$nl_trie_rotation_index$.setGlobalValue((SubLObject)nl_trie_accessors.NIL);
        return initialize_nl_trie_rotation_index(max_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78871L)
    public static SubLObject initialize_nl_trie_rotation_index(SubLObject max_num) {
        if (max_num == nl_trie_accessors.UNPROVIDED) {
            max_num = (SubLObject)nl_trie_accessors.NIL;
        }
        if (nl_trie_accessors.NIL == nl_trie_rotation_index_initializedP()) {
            nl_trie_accessors.$nl_trie_stoplist_trie$.setGlobalValue(tries.create_trie((SubLObject)nl_trie_accessors.T, (SubLObject)nl_trie_accessors.$str150$nl_trie_rotation_stop_list, (SubLObject)nl_trie_accessors.T, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQL)));
            SubLObject cdolist_list_var = lexicon_accessors.closed_lexical_class_strings((SubLObject)nl_trie_accessors.UNPROVIDED);
            SubLObject word = (SubLObject)nl_trie_accessors.NIL;
            word = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                tries.trie_insert(nl_trie_accessors.$nl_trie_stoplist_trie$.getGlobalValue(), word, word, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
            nl_trie_accessors.$nl_trie_rotation_index$.setGlobalValue(create_nl_trie_rotation_index(max_num, (SubLObject)nl_trie_accessors.UNPROVIDED));
        }
        return (SubLObject)nl_trie_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 79590L)
    public static SubLObject nl_trie_rotation_index_initializedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL != tries.trie_p(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue()) && tries.trie_count(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue()).numG((SubLObject)nl_trie_accessors.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 79821L)
    public static SubLObject nl_trie_rotation_index_initialization_practical_p() {
        return (SubLObject)nl_trie_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 80015L)
    public static SubLObject create_nl_trie_rotation_index(SubLObject max_num, SubLObject v_nl_trie) {
        if (max_num == nl_trie_accessors.UNPROVIDED) {
            max_num = (SubLObject)nl_trie_accessors.NIL;
        }
        if (v_nl_trie == nl_trie_accessors.UNPROVIDED) {
            v_nl_trie = nl_trie.get_nl_trie();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trie_index = tries.create_trie((SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.$str151$nl_trie_rotation_index, (SubLObject)nl_trie_accessors.T, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUALP));
        final SubLObject max_count = (nl_trie_accessors.NIL != max_num) ? max_num : nl_trie.nl_trie_size(v_nl_trie);
        final SubLObject gc_every = Numbers.integerDivide(max_count, (SubLObject)nl_trie_accessors.TEN_INTEGER);
        SubLObject count = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
        SubLObject stop = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)nl_trie_accessors.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)nl_trie_accessors.T, thread);
            SubLObject release = (SubLObject)nl_trie_accessors.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0_$50 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_1_$51 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject the_map = nl_trie.get_nl_trie();
                    final SubLObject mess = (SubLObject)nl_trie_accessors.$str152$Creating_NL_trie_rotation_index__;
                    SubLObject sofar = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
                    final SubLObject total = map_utilities.map_size(the_map);
                    assert nl_trie_accessors.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$51 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$52 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$54 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nl_trie_accessors.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nl_trie_accessors.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject iterator = map_utilities.new_map_iterator(the_map);
                            SubLObject valid;
                            for (SubLObject done_var = stop; nl_trie_accessors.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid || nl_trie_accessors.NIL != stop)) {
                                thread.resetMultipleValues();
                                final SubLObject var = iteration.iteration_next(iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (nl_trie_accessors.NIL != valid) {
                                    SubLObject current;
                                    final SubLObject datum = current = var;
                                    SubLObject strie_dict_key = (SubLObject)nl_trie_accessors.NIL;
                                    SubLObject strie_dict_value = (SubLObject)nl_trie_accessors.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list153);
                                    strie_dict_key = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list153);
                                    strie_dict_value = current.first();
                                    current = current.rest();
                                    if (nl_trie_accessors.NIL == current) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = Numbers.add(sofar, (SubLObject)nl_trie_accessors.ONE_INTEGER);
                                        if (nl_trie_accessors.NIL != map_utilities.map_p(strie_dict_value)) {
                                            stacks.stack_push(strie_dict_value, stack);
                                            while (nl_trie_accessors.NIL == stop && nl_trie_accessors.NIL == stacks.stack_empty_p(stack)) {
                                                final SubLObject entry = stacks.stack_pop(stack);
                                                final SubLObject iterator_$55 = map_utilities.new_map_iterator(entry);
                                                SubLObject valid_$58;
                                                for (SubLObject done_var_$56 = stop; nl_trie_accessors.NIL == done_var_$56; done_var_$56 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid_$58 || nl_trie_accessors.NIL != stop)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject var_$57 = iteration.iteration_next(iterator_$55);
                                                    valid_$58 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (nl_trie_accessors.NIL != valid_$58) {
                                                        SubLObject current_$60;
                                                        final SubLObject datum_$59 = current_$60 = var_$57;
                                                        SubLObject dict_key = (SubLObject)nl_trie_accessors.NIL;
                                                        SubLObject dict_value = (SubLObject)nl_trie_accessors.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(current_$60, datum_$59, (SubLObject)nl_trie_accessors.$list154);
                                                        dict_key = current_$60.first();
                                                        current_$60 = current_$60.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(current_$60, datum_$59, (SubLObject)nl_trie_accessors.$list154);
                                                        dict_value = current_$60.first();
                                                        current_$60 = current_$60.rest();
                                                        if (nl_trie_accessors.NIL == current_$60) {
                                                            if (nl_trie_accessors.NIL != map_utilities.map_p(dict_value)) {
                                                                stacks.stack_push(dict_value, stack);
                                                            }
                                                            else if (dict_value.isCons()) {
                                                                final SubLObject nl_trie_key = dict_value.first();
                                                                final SubLObject nl_trie_data = dict_value.rest();
                                                                update_nl_trie_rotation_index(nl_trie_data, (SubLObject)nl_trie_accessors.NIL, trie_index);
                                                                count = Numbers.add(count, (SubLObject)nl_trie_accessors.ONE_INTEGER);
                                                                stop = Numbers.numGE(count, max_count);
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(datum_$59, (SubLObject)nl_trie_accessors.$list154);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (strie_dict_value.isCons()) {
                                            final SubLObject nl_trie_key2 = strie_dict_value.first();
                                            final SubLObject nl_trie_data2 = strie_dict_value.rest();
                                            update_nl_trie_rotation_index(nl_trie_data2, (SubLObject)nl_trie_accessors.NIL, trie_index);
                                            count = Numbers.add(count, (SubLObject)nl_trie_accessors.ONE_INTEGER);
                                            stop = Numbers.numGE(count, max_count);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list153);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie_accessors.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$54, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$52, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$51, thread);
                    }
                }
                finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_1_$51, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$50, thread);
                }
            }
            finally {
                if (nl_trie_accessors.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return trie_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 80857L)
    public static SubLObject update_nl_trie_rotation_index(final SubLObject nl_trie_data, SubLObject removeP, SubLObject trie_index) {
        if (removeP == nl_trie_accessors.UNPROVIDED) {
            removeP = (SubLObject)nl_trie_accessors.NIL;
        }
        if (trie_index == nl_trie_accessors.UNPROVIDED) {
            trie_index = nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue();
        }
        if (nl_trie_accessors.NIL != tries.trie_p(trie_index)) {
            SubLObject cdolist_list_var = nl_trie_data;
            SubLObject trie_entry = (SubLObject)nl_trie_accessors.NIL;
            trie_entry = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                if (nl_trie_accessors.NIL == nl_trie_inappropriate_entryP(trie_entry, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    final SubLObject phrase = nl_trie.nl_trie_entry_string(trie_entry);
                    final SubLObject rotations = nl_trie_rotations(phrase);
                    final SubLObject update_fn = (nl_trie_accessors.NIL != removeP) ? Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym155$TRIE_REMOVE) : Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym156$TRIE_INSERT);
                    final SubLObject filtered_nl_trie_data = extract_nl_trie_indexing_data_from_entry(phrase, trie_entry);
                    SubLObject cdolist_list_var_$62 = (SubLObject)ConsesLow.cons(phrase, rotations);
                    SubLObject variant = (SubLObject)nl_trie_accessors.NIL;
                    variant = cdolist_list_var_$62.first();
                    while (nl_trie_accessors.NIL != cdolist_list_var_$62) {
                        SubLObject cdolist_list_var_$63 = filtered_nl_trie_data;
                        SubLObject index_item = (SubLObject)nl_trie_accessors.NIL;
                        index_item = cdolist_list_var_$63.first();
                        while (nl_trie_accessors.NIL != cdolist_list_var_$63) {
                            Functions.funcall(update_fn, trie_index, lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(variant)), index_item);
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
            return (SubLObject)nl_trie_accessors.T;
        }
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 81770L)
    public static SubLObject nl_trie_matching_phrases(final SubLObject pattern, final SubLObject search_type) {
        if (search_type.eql((SubLObject)nl_trie_accessors.$kw157$INFIX)) {
            return nl_trie_matching_phrases_inverted_index(pattern);
        }
        return nl_trie_matching_phrases_substring(pattern, search_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 82010L)
    public static SubLObject nl_trie_matching_phrases_substring(final SubLObject pattern, final SubLObject search_type) {
        if (nl_trie_accessors.NIL != string_utilities.non_empty_stringP(pattern) && nl_trie_accessors.NIL != tries.trie_p(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue())) {
            final SubLObject standardized_pattern = lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(pattern));
            final SubLObject index_entries = tries.trie_prefix(nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue(), standardized_pattern, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
            final SubLObject comparison_function = (SubLObject)((search_type == nl_trie_accessors.$kw158$PREFIX) ? Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym159$STARTS_WITH) : ((search_type == nl_trie_accessors.$kw160$SUFFIX) ? Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym161$ENDS_WITH) : nl_trie_accessors.NIL));
            SubLObject result = index_entries;
            if (search_type != nl_trie_accessors.$kw157$INFIX) {
                result = (SubLObject)nl_trie_accessors.NIL;
                SubLObject cdolist_list_var = Sequences.remove_duplicates(index_entries, Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUAL), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                SubLObject index_entry = (SubLObject)nl_trie_accessors.NIL;
                index_entry = cdolist_list_var.first();
                while (nl_trie_accessors.NIL != cdolist_list_var) {
                    if (nl_trie_accessors.NIL != Functions.funcall(comparison_function, nl_trie_index_item_phrase(index_entry), pattern)) {
                        result = (SubLObject)ConsesLow.cons(index_entry, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    index_entry = cdolist_list_var.first();
                }
            }
            result = Sort.sort(result, Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym162$STRING_), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym135$NL_TRIE_INDEX_ITEM_PHRASE));
            result = Sort.stable_sort(result, Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym163$LESSER_LENGTH_P), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym135$NL_TRIE_INDEX_ITEM_PHRASE));
            return result;
        }
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 83208L)
    public static SubLObject nl_trie_matching_phrases_inverted_index(final SubLObject input_string) {
        final SubLObject search_strings = nl_trie_search_strings_from_pattern(input_string);
        final SubLObject dict_vector = Vectors.make_vector(Sequences.length(search_strings), (SubLObject)nl_trie_accessors.UNPROVIDED);
        SubLObject list_var = (SubLObject)nl_trie_accessors.NIL;
        SubLObject search_string = (SubLObject)nl_trie_accessors.NIL;
        SubLObject num = (SubLObject)nl_trie_accessors.NIL;
        list_var = search_strings;
        search_string = list_var.first();
        for (num = (SubLObject)nl_trie_accessors.ZERO_INTEGER; nl_trie_accessors.NIL != list_var; list_var = list_var.rest(), search_string = list_var.first(), num = Numbers.add((SubLObject)nl_trie_accessors.ONE_INTEGER, num)) {
            Vectors.set_aref(dict_vector, num, dictionary.new_dictionary((SubLObject)nl_trie_accessors.EQUAL, (SubLObject)nl_trie_accessors.UNPROVIDED));
            final SubLObject dict = Vectors.aref(dict_vector, num);
            SubLObject cdolist_list_var;
            final SubLObject matches = cdolist_list_var = nl_trie_matching_phrases_substring(search_string, (SubLObject)nl_trie_accessors.$kw157$INFIX);
            SubLObject match = (SubLObject)nl_trie_accessors.NIL;
            match = cdolist_list_var.first();
            while (nl_trie_accessors.NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push(dict, nl_trie_index_item_term(match), match);
                cdolist_list_var = cdolist_list_var.rest();
                match = cdolist_list_var.first();
            }
        }
        return nl_trie_matches_from_dictionary(dict_vector, search_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 84634L)
    public static SubLObject nl_trie_matches_from_dictionary(final SubLObject dict_vector, final SubLObject search_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject search_string_count = Sequences.length(search_terms);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(Vectors.aref(dict_vector, (SubLObject)nl_trie_accessors.ZERO_INTEGER))); nl_trie_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject matches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject failP = (SubLObject)nl_trie_accessors.NIL;
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = Numbers.subtract(Sequences.length(dict_vector), (SubLObject)nl_trie_accessors.ONE_INTEGER), n = (SubLObject)nl_trie_accessors.NIL, n = (SubLObject)nl_trie_accessors.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
                if (nl_trie_accessors.NIL == dictionary.dictionary_lookup_without_values(Vectors.aref(dict_vector, number_utilities.f_1X(n)), v_term, (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                    failP = (SubLObject)nl_trie_accessors.T;
                }
            }
            if (nl_trie_accessors.NIL == failP) {
                SubLObject cdolist_list_var = matches;
                SubLObject match = (SubLObject)nl_trie_accessors.NIL;
                match = cdolist_list_var.first();
                while (nl_trie_accessors.NIL != cdolist_list_var) {
                    if (search_string_count.eql((SubLObject)nl_trie_accessors.ONE_INTEGER) || nl_trie_accessors.NIL != string_utilities.substring_every_in_list(search_terms, nl_trie_index_item_phrase(match), (SubLObject)nl_trie_accessors.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons(match, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    match = cdolist_list_var.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 85318L)
    public static SubLObject nl_trie_search_strings_from_pattern(final SubLObject pattern) {
        return (SubLObject)ConsesLow.list(lexification_utilities.join_words(nl_trie.nl_trie_string_tokenize(pattern)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 85609L)
    public static SubLObject dump_nl_trie_spellchecker_strings(SubLObject stream, SubLObject omit_duplicatesP, SubLObject duplicate_test, SubLObject separator_char) {
        if (stream == nl_trie_accessors.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (omit_duplicatesP == nl_trie_accessors.UNPROVIDED) {
            omit_duplicatesP = (SubLObject)nl_trie_accessors.T;
        }
        if (duplicate_test == nl_trie_accessors.UNPROVIDED) {
            duplicate_test = Symbols.symbol_function((SubLObject)nl_trie_accessors.EQUALP);
        }
        if (separator_char == nl_trie_accessors.UNPROVIDED) {
            separator_char = (SubLObject)Characters.CHAR_newline;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie_accessors.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && nl_trie_accessors.NIL == nl_trie.nl_trie_presentP((SubLObject)nl_trie_accessors.UNPROVIDED)) {
            Errors.error((SubLObject)nl_trie_accessors.$str164$The_NL_Trie_must_be_initialized_b);
        }
        SubLObject release = (SubLObject)nl_trie_accessors.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                final SubLObject done_strings = (SubLObject)((nl_trie_accessors.NIL != omit_duplicatesP) ? set.new_set(duplicate_test, (SubLObject)nl_trie_accessors.UNPROVIDED) : nl_trie_accessors.NIL);
                final SubLObject break_chars = Sequences.delete_duplicates((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_period, conses_high.union(string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars(), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED)), (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                SubLObject release_$64 = (SubLObject)nl_trie_accessors.NIL;
                try {
                    release_$64 = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0_$65 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                        final SubLObject stack = stacks.create_stack();
                        final SubLObject the_map = nl_trie.get_nl_trie();
                        final SubLObject mess = (SubLObject)nl_trie_accessors.$str165$Dumping_NL_Trie_spellchecker_stri;
                        SubLObject sofar = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
                        final SubLObject total = map_utilities.map_size(the_map);
                        assert nl_trie_accessors.NIL != Types.stringp(mess) : mess;
                        final SubLObject _prev_bind_0_$66 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$67 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nl_trie_accessors.NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nl_trie_accessors.T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                            try {
                                utilities_macros.noting_percent_progress_preamble(mess);
                                final SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                SubLObject valid;
                                for (SubLObject done_var = (SubLObject)nl_trie_accessors.NIL; nl_trie_accessors.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid)) {
                                    thread.resetMultipleValues();
                                    final SubLObject var = iteration.iteration_next(iterator);
                                    valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (nl_trie_accessors.NIL != valid) {
                                        SubLObject current;
                                        final SubLObject datum = current = var;
                                        SubLObject strie_dict_key = (SubLObject)nl_trie_accessors.NIL;
                                        SubLObject strie_dict_value = (SubLObject)nl_trie_accessors.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list153);
                                        strie_dict_key = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie_accessors.$list153);
                                        strie_dict_value = current.first();
                                        current = current.rest();
                                        if (nl_trie_accessors.NIL == current) {
                                            utilities_macros.note_percent_progress(sofar, total);
                                            sofar = Numbers.add(sofar, (SubLObject)nl_trie_accessors.ONE_INTEGER);
                                            if (nl_trie_accessors.NIL != map_utilities.map_p(strie_dict_value)) {
                                                stacks.stack_push(strie_dict_value, stack);
                                                while (nl_trie_accessors.NIL == stacks.stack_empty_p(stack)) {
                                                    final SubLObject entry = stacks.stack_pop(stack);
                                                    final SubLObject iterator_$68 = map_utilities.new_map_iterator(entry);
                                                    SubLObject valid_$71;
                                                    for (SubLObject done_var_$69 = (SubLObject)nl_trie_accessors.NIL; nl_trie_accessors.NIL == done_var_$69; done_var_$69 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid_$71)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject var_$70 = iteration.iteration_next(iterator_$68);
                                                        valid_$71 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (nl_trie_accessors.NIL != valid_$71) {
                                                            SubLObject current_$73;
                                                            final SubLObject datum_$72 = current_$73 = var_$70;
                                                            SubLObject dict_key = (SubLObject)nl_trie_accessors.NIL;
                                                            SubLObject dict_value = (SubLObject)nl_trie_accessors.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(current_$73, datum_$72, (SubLObject)nl_trie_accessors.$list154);
                                                            dict_key = current_$73.first();
                                                            current_$73 = current_$73.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(current_$73, datum_$72, (SubLObject)nl_trie_accessors.$list154);
                                                            dict_value = current_$73.first();
                                                            current_$73 = current_$73.rest();
                                                            if (nl_trie_accessors.NIL == current_$73) {
                                                                if (nl_trie_accessors.NIL != map_utilities.map_p(dict_value)) {
                                                                    stacks.stack_push(dict_value, stack);
                                                                }
                                                                else if (dict_value.isCons()) {
                                                                    final SubLObject key = dict_value.first();
                                                                    SubLObject cdolist_list_var;
                                                                    final SubLObject entries = cdolist_list_var = dict_value.rest();
                                                                    SubLObject entry_$74 = (SubLObject)nl_trie_accessors.NIL;
                                                                    entry_$74 = cdolist_list_var.first();
                                                                    while (nl_trie_accessors.NIL != cdolist_list_var) {
                                                                        SubLObject cdolist_list_var_$75 = string_utilities.string_tokenize(nl_trie.nl_trie_entry_string(entry_$74), break_chars, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                                                                        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
                                                                        string = cdolist_list_var_$75.first();
                                                                        while (nl_trie_accessors.NIL != cdolist_list_var_$75) {
                                                                            if (nl_trie_accessors.NIL == omit_duplicatesP || nl_trie_accessors.NIL == set.set_memberP(string, done_strings)) {
                                                                                print_high.princ(string, stream);
                                                                                print_high.princ(separator_char, stream);
                                                                                if (nl_trie_accessors.NIL != omit_duplicatesP) {
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
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(datum_$72, (SubLObject)nl_trie_accessors.$list154);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if (strie_dict_value.isCons()) {
                                                final SubLObject key2 = strie_dict_value.first();
                                                SubLObject cdolist_list_var2;
                                                final SubLObject entries2 = cdolist_list_var2 = strie_dict_value.rest();
                                                SubLObject entry2 = (SubLObject)nl_trie_accessors.NIL;
                                                entry2 = cdolist_list_var2.first();
                                                while (nl_trie_accessors.NIL != cdolist_list_var2) {
                                                    SubLObject cdolist_list_var_$76 = string_utilities.string_tokenize(nl_trie.nl_trie_entry_string(entry2), break_chars, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                                                    SubLObject string2 = (SubLObject)nl_trie_accessors.NIL;
                                                    string2 = cdolist_list_var_$76.first();
                                                    while (nl_trie_accessors.NIL != cdolist_list_var_$76) {
                                                        if (nl_trie_accessors.NIL == omit_duplicatesP || nl_trie_accessors.NIL == set.set_memberP(string2, done_strings)) {
                                                            print_high.princ(string2, stream);
                                                            print_high.princ(separator_char, stream);
                                                            if (nl_trie_accessors.NIL != omit_duplicatesP) {
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
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie_accessors.$list153);
                                        }
                                    }
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    utilities_macros.noting_percent_progress_postamble();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                }
                            }
                        }
                        finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$67, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$66, thread);
                        }
                    }
                    finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$65, thread);
                    }
                }
                finally {
                    if (nl_trie_accessors.NIL != release_$64) {
                        Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie_accessors.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 86886L)
    public static SubLObject stress_test_nl_trie_search_concurrent_swapping(SubLObject checker_count, SubLObject string_count) {
        if (checker_count == nl_trie_accessors.UNPROVIDED) {
            checker_count = nl_trie_accessors.$default_number_of_concurrent_test_threads$.getGlobalValue();
        }
        if (string_count == nl_trie_accessors.UNPROVIDED) {
            string_count = nl_trie_accessors.$default_string_test_count$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_queue = process_utilities.new_ipc_queue((SubLObject)nl_trie_accessors.$str167$Concurrent_NL_Trie_Search_Stress_);
        SubLObject checkers = (SubLObject)nl_trie_accessors.NIL;
        SubLObject issue_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject strings = (SubLObject)nl_trie_accessors.NIL;
        file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        Storage.gc((SubLObject)nl_trie_accessors.UNPROVIDED);
        final SubLObject index = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject pred_var = nl_trie_accessors.$const168$nameString;
        if (nl_trie_accessors.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
            final SubLObject str = (SubLObject)nl_trie_accessors.NIL;
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
                utilities_macros.$progress_notification_count$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)nl_trie_accessors.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((nl_trie_accessors.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : nl_trie_accessors.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = (SubLObject)nl_trie_accessors.NIL;
                while (nl_trie_accessors.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (nl_trie_accessors.NIL != valid) {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator = (SubLObject)nl_trie_accessors.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie_accessors.$kw169$GAF, (SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.NIL);
                            SubLObject done_var_$78 = doneP;
                            final SubLObject token_var_$79 = (SubLObject)nl_trie_accessors.NIL;
                            while (nl_trie_accessors.NIL == done_var_$78) {
                                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$79);
                                final SubLObject valid_$80 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$79.eql(v_assert));
                                if (nl_trie_accessors.NIL != valid_$80) {
                                    strings = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(v_assert, (SubLObject)nl_trie_accessors.UNPROVIDED), strings);
                                    if (index.numG(Numbers.multiply(string_count, checker_count))) {
                                        doneP = (SubLObject)nl_trie_accessors.T;
                                    }
                                }
                                done_var_$78 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid_$80 || nl_trie_accessors.NIL != doneP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie_accessors.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (nl_trie_accessors.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid || nl_trie_accessors.NIL != doneP);
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
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = (SubLObject)nl_trie_accessors.NIL, i = (SubLObject)nl_trie_accessors.ZERO_INTEGER; i.numL(checker_count); i = Numbers.add(i, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)nl_trie_accessors.$str170$Concurrent_NL_Trie_Searches_, format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)nl_trie_accessors.ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, (SubLObject)nl_trie_accessors.$sym171$STRESS_TEST_NL_TRIE_SEARCH, (SubLObject)ConsesLow.list(Sequences.subseq(strings, Numbers.multiply(i, string_count), Numbers.multiply(Numbers.add((SubLObject)nl_trie_accessors.ONE_INTEGER, i), string_count)), problem_queue, name));
            checkers = (SubLObject)ConsesLow.cons(checker, checkers);
        }
        while (Sequences.position_if((SubLObject)nl_trie_accessors.$sym172$VALID_PROCESS_P, checkers, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)nl_trie_accessors.ONE_INTEGER);
        }
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = (SubLObject)ConsesLow.cons(process_utilities.ipc_dequeue(problem_queue, (SubLObject)nl_trie_accessors.UNPROVIDED), issue_list);
        }
        if (nl_trie_accessors.NIL != list_utilities.sublisp_boolean(issue_list)) {
            file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        }
        return issue_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 88571L)
    public static SubLObject stress_test_nl_trie_search(final SubLObject strings, final SubLObject problem_queue, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
        string = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            SubLObject error_message = (SubLObject)nl_trie_accessors.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)nl_trie_accessors.$sym173$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_trie.nl_trie_search(string, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)nl_trie_accessors.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                process_utilities.ipc_enqueue((SubLObject)ConsesLow.cons(string, error_message), problem_queue, (SubLObject)nl_trie_accessors.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return (SubLObject)nl_trie_accessors.$kw4$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 88896L)
    public static SubLObject stress_test_nl_trie_prefixes_concurrent_swapping(SubLObject checker_count, SubLObject string_count) {
        if (checker_count == nl_trie_accessors.UNPROVIDED) {
            checker_count = nl_trie_accessors.$default_number_of_concurrent_test_threads$.getGlobalValue();
        }
        if (string_count == nl_trie_accessors.UNPROVIDED) {
            string_count = nl_trie_accessors.$default_string_test_count$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_queue = process_utilities.new_ipc_queue((SubLObject)nl_trie_accessors.$str174$Concurrent_NL_Trie_Prefixes_Stres);
        SubLObject checkers = (SubLObject)nl_trie_accessors.NIL;
        SubLObject issue_list = (SubLObject)nl_trie_accessors.NIL;
        SubLObject strings = (SubLObject)nl_trie_accessors.NIL;
        file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        Storage.gc((SubLObject)nl_trie_accessors.UNPROVIDED);
        final SubLObject index = (SubLObject)nl_trie_accessors.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)nl_trie_accessors.NIL;
        final SubLObject pred_var = nl_trie_accessors.$const168$nameString;
        if (nl_trie_accessors.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
            final SubLObject str = (SubLObject)nl_trie_accessors.NIL;
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
                utilities_macros.$progress_notification_count$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)nl_trie_accessors.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)nl_trie_accessors.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((nl_trie_accessors.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : nl_trie_accessors.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = (SubLObject)nl_trie_accessors.NIL;
                while (nl_trie_accessors.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (nl_trie_accessors.NIL != valid) {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator = (SubLObject)nl_trie_accessors.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie_accessors.$kw169$GAF, (SubLObject)nl_trie_accessors.NIL, (SubLObject)nl_trie_accessors.NIL);
                            SubLObject done_var_$82 = doneP;
                            final SubLObject token_var_$83 = (SubLObject)nl_trie_accessors.NIL;
                            while (nl_trie_accessors.NIL == done_var_$82) {
                                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                final SubLObject valid_$84 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$83.eql(v_assert));
                                if (nl_trie_accessors.NIL != valid_$84) {
                                    strings = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(v_assert, (SubLObject)nl_trie_accessors.UNPROVIDED), strings);
                                    if (index.numG(Numbers.multiply(string_count, checker_count))) {
                                        doneP = (SubLObject)nl_trie_accessors.T;
                                    }
                                }
                                done_var_$82 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid_$84 || nl_trie_accessors.NIL != doneP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie_accessors.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (nl_trie_accessors.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie_accessors.NIL == valid || nl_trie_accessors.NIL != doneP);
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
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = (SubLObject)nl_trie_accessors.NIL, i = (SubLObject)nl_trie_accessors.ZERO_INTEGER; i.numL(checker_count); i = Numbers.add(i, (SubLObject)nl_trie_accessors.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)nl_trie_accessors.$str175$Concurrent_NL_Trie_Prefixes_, format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)nl_trie_accessors.ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, (SubLObject)nl_trie_accessors.$sym176$STRESS_TEST_NL_TRIE_PREFIXES, (SubLObject)ConsesLow.list(Sequences.subseq(strings, Numbers.multiply(i, string_count), Numbers.multiply(Numbers.add((SubLObject)nl_trie_accessors.ONE_INTEGER, i), string_count)), problem_queue, name));
            checkers = (SubLObject)ConsesLow.cons(checker, checkers);
        }
        while (Sequences.position_if((SubLObject)nl_trie_accessors.$sym172$VALID_PROCESS_P, checkers, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED, (SubLObject)nl_trie_accessors.UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)nl_trie_accessors.ONE_INTEGER);
        }
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = (SubLObject)ConsesLow.cons(process_utilities.ipc_dequeue(problem_queue, (SubLObject)nl_trie_accessors.UNPROVIDED), issue_list);
        }
        if (nl_trie_accessors.NIL != list_utilities.sublisp_boolean(issue_list)) {
            file_vector_utilities.swap_out_all_pristine_backed_map_objects(nl_trie.get_nl_trie());
        }
        return issue_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 90586L)
    public static SubLObject stress_test_nl_trie_prefixes(final SubLObject strings, final SubLObject problem_queue, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)nl_trie_accessors.NIL;
        string = cdolist_list_var.first();
        while (nl_trie_accessors.NIL != cdolist_list_var) {
            SubLObject error_message = (SubLObject)nl_trie_accessors.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)nl_trie_accessors.$sym173$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_trie_prefixes(nl_trie.get_nl_trie(), nl_trie.nl_trie_string_tokenize(string), (SubLObject)nl_trie_accessors.UNPROVIDED);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)nl_trie_accessors.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                process_utilities.ipc_enqueue((SubLObject)ConsesLow.cons(string, error_message), problem_queue, (SubLObject)nl_trie_accessors.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return (SubLObject)nl_trie_accessors.$kw4$DONE;
    }
    
    public static SubLObject declare_nl_trie_accessors_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "do_nl_trie_entries", "DO-NL-TRIE-ENTRIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "do_nl_trie_entries_for_string", "DO-NL-TRIE-ENTRIES-FOR-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "do_nl_trie_word_entries_for_string", "DO-NL-TRIE-WORD-ENTRIES-FOR-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "do_nl_trie_name_entries_for_string", "DO-NL-TRIE-NAME-ENTRIES-FOR-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "incorporate_new_entry", "INCORPORATE-NEW-ENTRY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "incorporate_new_denots_and_preds", "INCORPORATE-NEW-DENOTS-AND-PREDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_string_is_posP_internal", "NL-TRIE-STRING-IS-POS?-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_string_is_posP", "NL-TRIE-STRING-IS-POS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_words_of_string", "NL-TRIE-WORDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_words_of_stringXpred", "NL-TRIE-WORDS-OF-STRING&PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_words_of_stringXpos", "NL-TRIE-WORDS-OF-STRING&POS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_words_of_stringXspeech_part", "NL-TRIE-WORDS-OF-STRING&SPEECH-PART", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_preds_of_stringXword", "NL-TRIE-PREDS-OF-STRING&WORD", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_preds_of_string", "NL-TRIE-PREDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_namestring_preds_of_string", "NL-TRIE-NAMESTRING-PREDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_pos_of_string", "NL-TRIE-POS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_pos_of_stringXword", "NL-TRIE-POS-OF-STRING&WORD", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_all_denots_of_string", "NL-TRIE-ALL-DENOTS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_string", "NL-TRIE-DENOTS-OF-STRING", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "general_nl_trie_denots_of_string", "GENERAL-NL-TRIE-DENOTS-OF-STRING", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "general_nl_trie_denots_of_string_int", "GENERAL-NL-TRIE-DENOTS-OF-STRING-INT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denotation_mapper", "NL-TRIE-DENOTATION-MAPPER", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_stringXpos", "NL-TRIE-DENOTS-OF-STRING&POS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_dps_of_string", "NL-TRIE-DPS-OF-STRING", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_stringXspeech_part", "NL-TRIE-DENOTS-OF-STRING&SPEECH-PART", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_stringXpred", "NL-TRIE-DENOTS-OF-STRING&PRED", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_name_string", "NL-TRIE-DENOTS-OF-NAME-STRING", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_name_string_internal", "NL-TRIE-DENOTS-OF-NAME-STRING-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "starts_with_theP", "STARTS-WITH-THE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_acronym_string", "NL-TRIE-DENOTS-OF-ACRONYM-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_abbreviation_string", "NL-TRIE-DENOTS-OF-ABBREVIATION-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "reinitialize_nl_trie_for_string", "REINITIALIZE-NL-TRIE-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_semtrans_templates_of_string", "NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_names_from_spelling", "NL-TRIE-NAMES-FROM-SPELLING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_names_from_nickname", "NL-TRIE-NAMES-FROM-NICKNAME", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_denots_of_string_and_namestring_pred", "NL-TRIE-DENOTS-OF-STRING-AND-NAMESTRING-PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_assertions_with_string_and_namestring_pred", "NL-TRIE-ASSERTIONS-WITH-STRING-AND-NAMESTRING-PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_regular_formP", "NL-TRIE-REGULAR-FORM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_word_pred_and_supports_for_pred", "NL-TRIE-WORD-PRED-AND-SUPPORTS-FOR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "add_new_entry", "ADD-NEW-ENTRY", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_entry_name_pred_or_syntactic_preds", "NL-TRIE-ENTRY-NAME-PRED-OR-SYNTACTIC-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "add_new_denots_and_preds", "ADD-NEW-DENOTS-AND-PREDS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "pred_type_okP", "PRED-TYPE-OK?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "abbrev_const_satisfiedP", "ABBREV-CONST-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "denot_const_satisfiedP", "DENOT-CONST-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "namestring_const_satisfiedP", "NAMESTRING-CONST-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_sentence_tokenize", "NL-TRIE-SENTENCE-TOKENIZE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_filter_tokens_for_case", "NL-TRIE-FILTER-TOKENS-FOR-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_remove_inappropriate_tokens", "NL-TRIE-REMOVE-INAPPROPRIATE-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_repair_token_indexes", "NL-TRIE-REPAIR-TOKEN-INDEXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_prefix_keys_from_string", "NL-TRIE-PREFIX-KEYS-FROM-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_prefixes", "NL-TRIE-PREFIXES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_prefixes_memoized_internal", "NL-TRIE-PREFIXES-MEMOIZED-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_prefixes_memoized", "NL-TRIE-PREFIXES-MEMOIZED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_filter_unquoted_entries", "NL-TRIE-FILTER-UNQUOTED-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_unquoted_entry_okP", "NL-TRIE-UNQUOTED-ENTRY-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_access_case_sensitive_p", "NL-TRIE-ACCESS-CASE-SENSITIVE-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_prefix_key_jibes_with_alterationsP", "NL-TRIE-PREFIX-KEY-JIBES-WITH-ALTERATIONS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_find_original_prefix_key", "NL-TRIE-FIND-ORIGINAL-PREFIX-KEY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_unknown_strings", "NL-TRIE-UNKNOWN-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_unknown_string_tokens", "NL-TRIE-UNKNOWN-STRING-TOKENS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "index_covered_by_token_p", "INDEX-COVERED-BY-TOKEN-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_token_has_meaning_p", "NL-TRIE-TOKEN-HAS-MEANING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "spelling_const_satisfiedP", "SPELLING-CONST-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "contains_periodP", "CONTAINS-PERIOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "period_const_satisfiedP", "PERIOD-CONST-SATISFIED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "pos_pred_const_satisfiedP", "POS-PRED-CONST-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_record_filter_mt", "NL-TRIE-RECORD-FILTER-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "gated_nl_trie_search", "GATED-NL-TRIE-SEARCH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_filter_pragmatics", "NL-TRIE-FILTER-PRAGMATICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_remove_inappropriate_entries", "NL-TRIE-REMOVE-INAPPROPRIATE-ENTRIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_inappropriate_entryP", "NL-TRIE-INAPPROPRIATE-ENTRY?", 1, 1, false);
        new $nl_trie_inappropriate_entryP$UnaryFunction();
        new $nl_trie_inappropriate_entryP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_entry_mt_okP", "NL-TRIE-ENTRY-MT-OK?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_string_to_use", "NL-TRIE-STRING-TO-USE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_match_string", "NL-TRIE-MATCH-STRING", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie_accessors", "do_supporting_trie_words", "DO-SUPPORTING-TRIE-WORDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "matching_word_strings_entryP", "MATCHING-WORD-STRINGS-ENTRY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_hl_justify_word_strings", "NL-TRIE-HL-JUSTIFY-WORD-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_hl_forward_mt_combos_word_strings", "NL-TRIE-HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_get_term_phrases_supports", "NL-TRIE-GET-TERM-PHRASES-SUPPORTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "add_nl_trie_supports", "ADD-NL-TRIE-SUPPORTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_entry_matches_term_phrases_constraintP", "NL-TRIE-ENTRY-MATCHES-TERM-PHRASES-CONSTRAINT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_rotations", "NL-TRIE-ROTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_index_item_print_function_trampoline", "NL-TRIE-INDEX-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_index_item_p", "NL-TRIE-INDEX-ITEM-P", 1, 0, false);
        new $nl_trie_index_item_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_index_item_term", "NL-TRIE-INDEX-ITEM-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_index_item_phrase", "NL-TRIE-INDEX-ITEM-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_index_item_mt", "NL-TRIE-INDEX-ITEM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "_csetf_nl_trie_index_item_term", "_CSETF-NL-TRIE-INDEX-ITEM-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "_csetf_nl_trie_index_item_phrase", "_CSETF-NL-TRIE-INDEX-ITEM-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "_csetf_nl_trie_index_item_mt", "_CSETF-NL-TRIE-INDEX-ITEM-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "make_nl_trie_index_item", "MAKE-NL-TRIE-INDEX-ITEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "visit_defstruct_nl_trie_index_item", "VISIT-DEFSTRUCT-NL-TRIE-INDEX-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "visit_defstruct_object_nl_trie_index_item_method", "VISIT-DEFSTRUCT-OBJECT-NL-TRIE-INDEX-ITEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "new_nl_trie_index_item", "NEW-NL-TRIE-INDEX-ITEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "print_nl_trie_index_item", "PRINT-NL-TRIE-INDEX-ITEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "extract_nl_trie_indexing_data", "EXTRACT-NL-TRIE-INDEXING-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "extract_nl_trie_indexing_data_from_entry", "EXTRACT-NL-TRIE-INDEXING-DATA-FROM-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "force_nl_trie_rotation_index_initialization", "FORCE-NL-TRIE-ROTATION-INDEX-INITIALIZATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "initialize_nl_trie_rotation_index", "INITIALIZE-NL-TRIE-ROTATION-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_rotation_index_initializedP", "NL-TRIE-ROTATION-INDEX-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_rotation_index_initialization_practical_p", "NL-TRIE-ROTATION-INDEX-INITIALIZATION-PRACTICAL-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "create_nl_trie_rotation_index", "CREATE-NL-TRIE-ROTATION-INDEX", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "update_nl_trie_rotation_index", "UPDATE-NL-TRIE-ROTATION-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_matching_phrases", "NL-TRIE-MATCHING-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_matching_phrases_substring", "NL-TRIE-MATCHING-PHRASES-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_matching_phrases_inverted_index", "NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_matches_from_dictionary", "NL-TRIE-MATCHES-FROM-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "nl_trie_search_strings_from_pattern", "NL-TRIE-SEARCH-STRINGS-FROM-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "dump_nl_trie_spellchecker_strings", "DUMP-NL-TRIE-SPELLCHECKER-STRINGS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "stress_test_nl_trie_search_concurrent_swapping", "STRESS-TEST-NL-TRIE-SEARCH-CONCURRENT-SWAPPING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "stress_test_nl_trie_search", "STRESS-TEST-NL-TRIE-SEARCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "stress_test_nl_trie_prefixes_concurrent_swapping", "STRESS-TEST-NL-TRIE-PREFIXES-CONCURRENT-SWAPPING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie_accessors", "stress_test_nl_trie_prefixes", "STRESS-TEST-NL-TRIE-PREFIXES", 3, 0, false);
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    public static SubLObject init_nl_trie_accessors_file() {
        nl_trie_accessors.$word_external_punctuation_chars$ = SubLFiles.deflexical("*WORD-EXTERNAL-PUNCTUATION-CHARS*", (SubLObject)nl_trie_accessors.$list55);
        nl_trie_accessors.$denotation_mapping_break_chars$ = SubLFiles.deflexical("*DENOTATION-MAPPING-BREAK-CHARS*", Sequences.cconcatenate(nl_trie_accessors.$word_external_punctuation_chars$.getGlobalValue(), string_utilities.whitespace_chars()));
        nl_trie_accessors.$nl_trie_check_semantic_mtP$ = SubLFiles.defparameter("*NL-TRIE-CHECK-SEMANTIC-MT?*", (SubLObject)nl_trie_accessors.NIL);
        nl_trie_accessors.$nl_trie_rotation_index$ = SubLFiles.deflexical("*NL-TRIE-ROTATION-INDEX*", (SubLObject)((nl_trie_accessors.NIL != Symbols.boundp((SubLObject)nl_trie_accessors.$sym120$_NL_TRIE_ROTATION_INDEX_)) ? nl_trie_accessors.$nl_trie_rotation_index$.getGlobalValue() : nl_trie_accessors.NIL));
        nl_trie_accessors.$nl_trie_rotate_characters$ = SubLFiles.deflexical("*NL-TRIE-ROTATE-CHARACTERS*", (SubLObject)nl_trie_accessors.$list121);
        nl_trie_accessors.$nl_trie_rotate_point_char$ = SubLFiles.defconstant("*NL-TRIE-ROTATE-POINT-CHAR*", (SubLObject)Characters.CHAR_vertical);
        nl_trie_accessors.$nl_trie_rotate_point_string$ = SubLFiles.defconstant("*NL-TRIE-ROTATE-POINT-STRING*", Strings.string(nl_trie_accessors.$nl_trie_rotate_point_char$.getGlobalValue()));
        nl_trie_accessors.$nl_trie_stoplist_trie$ = SubLFiles.deflexical("*NL-TRIE-STOPLIST-TRIE*", (SubLObject)((nl_trie_accessors.NIL != Symbols.boundp((SubLObject)nl_trie_accessors.$sym122$_NL_TRIE_STOPLIST_TRIE_)) ? nl_trie_accessors.$nl_trie_stoplist_trie$.getGlobalValue() : nl_trie_accessors.NIL));
        nl_trie_accessors.$dtp_nl_trie_index_item$ = SubLFiles.defconstant("*DTP-NL-TRIE-INDEX-ITEM*", (SubLObject)nl_trie_accessors.$sym124$NL_TRIE_INDEX_ITEM);
        nl_trie_accessors.$default_number_of_concurrent_test_threads$ = SubLFiles.deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-TEST-THREADS*", (SubLObject)nl_trie_accessors.TWENTY_INTEGER);
        nl_trie_accessors.$default_string_test_count$ = SubLFiles.deflexical("*DEFAULT-STRING-TEST-COUNT*", (SubLObject)nl_trie_accessors.$int166$500);
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    public static SubLObject setup_nl_trie_accessors_file() {
        memoization_state.note_memoized_function((SubLObject)nl_trie_accessors.$sym52$NL_TRIE_STRING_IS_POS_);
        memoization_state.note_memoized_function((SubLObject)nl_trie_accessors.$sym87$NL_TRIE_PREFIXES_MEMOIZED);
        access_macros.register_macro_helper((SubLObject)nl_trie_accessors.$sym109$MATCHING_WORD_STRINGS_ENTRY_, (SubLObject)nl_trie_accessors.$sym110$DO_SUPPORTING_TRIE_WORDS);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie_accessors.$sym120$_NL_TRIE_ROTATION_INDEX_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie_accessors.$sym122$_NL_TRIE_STOPLIST_TRIE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), nl_trie_accessors.$dtp_nl_trie_index_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym131$NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)nl_trie_accessors.$list132);
        Structures.def_csetf((SubLObject)nl_trie_accessors.$sym133$NL_TRIE_INDEX_ITEM_TERM, (SubLObject)nl_trie_accessors.$sym134$_CSETF_NL_TRIE_INDEX_ITEM_TERM);
        Structures.def_csetf((SubLObject)nl_trie_accessors.$sym135$NL_TRIE_INDEX_ITEM_PHRASE, (SubLObject)nl_trie_accessors.$sym136$_CSETF_NL_TRIE_INDEX_ITEM_PHRASE);
        Structures.def_csetf((SubLObject)nl_trie_accessors.$sym137$NL_TRIE_INDEX_ITEM_MT, (SubLObject)nl_trie_accessors.$sym138$_CSETF_NL_TRIE_INDEX_ITEM_MT);
        Equality.identity((SubLObject)nl_trie_accessors.$sym124$NL_TRIE_INDEX_ITEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nl_trie_accessors.$dtp_nl_trie_index_item$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_trie_accessors.$sym147$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD));
        return (SubLObject)nl_trie_accessors.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_nl_trie_accessors_file();
    }
    
    @Override
	public void initializeVariables() {
        init_nl_trie_accessors_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_nl_trie_accessors_file();
    }
    
    static {
        me = (SubLFile)new nl_trie_accessors();
        nl_trie_accessors.$word_external_punctuation_chars$ = null;
        nl_trie_accessors.$denotation_mapping_break_chars$ = null;
        nl_trie_accessors.$nl_trie_check_semantic_mtP$ = null;
        nl_trie_accessors.$nl_trie_rotation_index$ = null;
        nl_trie_accessors.$nl_trie_rotate_characters$ = null;
        nl_trie_accessors.$nl_trie_rotate_point_char$ = null;
        nl_trie_accessors.$nl_trie_rotate_point_string$ = null;
        nl_trie_accessors.$nl_trie_stoplist_trie$ = null;
        nl_trie_accessors.$dtp_nl_trie_index_item$ = null;
        nl_trie_accessors.$default_number_of_concurrent_test_threads$ = null;
        nl_trie_accessors.$default_string_test_count$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym6$ENTRIES = SubLObjectFactory.makeUninternedSymbol("ENTRIES");
        $sym7$DO_NL_TRIE = SubLObjectFactory.makeSymbol("DO-NL-TRIE");
        $sym8$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym9$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym10$NL_TRIE_ENTRY_STRING = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ENTRY-VAR"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("LOOKUP-MT"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-PERIOD?"), (SubLObject)nl_trie_accessors.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*MISSPELLINGS?*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-SEMANTIC-MT?"), (SubLObject)nl_trie_accessors.NIL) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-PERIOD?"), (SubLObject)SubLObjectFactory.makeKeyword("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-SEMANTIC-MT?"));
        $kw13$ENTRY_TYPE = SubLObjectFactory.makeKeyword("ENTRY-TYPE");
        $kw14$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw15$CHECK_PERIOD_ = SubLObjectFactory.makeKeyword("CHECK-PERIOD?");
        $kw16$MISSPELLINGS_ = SubLObjectFactory.makeKeyword("MISSPELLINGS?");
        $sym17$_MISSPELLINGS__ = SubLObjectFactory.makeSymbol("*MISSPELLINGS?*");
        $kw18$CASE_SENSITIVITY = SubLObjectFactory.makeKeyword("CASE-SENSITIVITY");
        $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_ = SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*");
        $kw20$CHECK_SEMANTIC_MT_ = SubLObjectFactory.makeKeyword("CHECK-SEMANTIC-MT?");
        $sym21$ENTRIES = SubLObjectFactory.makeUninternedSymbol("ENTRIES");
        $sym22$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym23$_LEXICON_LOOKUP_MT_ = SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*");
        $sym24$GATED_NL_TRIE_SEARCH = SubLObjectFactory.makeSymbol("GATED-NL-TRIE-SEARCH");
        $sym25$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym26$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym27$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym28$COR = SubLObjectFactory.makeSymbol("COR");
        $sym29$NL_TRIE_ENTRY_TYPE = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-TYPE");
        $sym30$FIMPLIES = SubLObjectFactory.makeSymbol("FIMPLIES");
        $sym31$PERIOD_CONST_SATISFIED_ = SubLObjectFactory.makeSymbol("PERIOD-CONST-SATISFIED?");
        $sym32$CONTAINS_PERIOD_ = SubLObjectFactory.makeSymbol("CONTAINS-PERIOD?");
        $sym33$SPELLING_CONST_SATISFIED_ = SubLObjectFactory.makeSymbol("SPELLING-CONST-SATISFIED?");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-PERIOD?"), (SubLObject)nl_trie_accessors.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*MISSPELLINGS?*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-SEMANTIC-MT?"), (SubLObject)nl_trie_accessors.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHECK-PERIOD?"), (SubLObject)SubLObjectFactory.makeKeyword("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-SEMANTIC-MT?"));
        $sym36$DO_NL_TRIE_ENTRIES_FOR_STRING = SubLObjectFactory.makeSymbol("DO-NL-TRIE-ENTRIES-FOR-STRING");
        $kw37$WORD = SubLObjectFactory.makeKeyword("WORD");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-PERIOD?"), (SubLObject)nl_trie_accessors.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*MISSPELLINGS?*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHECK-PERIOD?"), (SubLObject)SubLObjectFactory.makeKeyword("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVITY"));
        $kw40$NAME = SubLObjectFactory.makeKeyword("NAME");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP-CONSTRAINTS?"), (SubLObject)nl_trie_accessors.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-TYPES"), (SubLObject)nl_trie_accessors.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP-NAMESTRINGS?"), (SubLObject)nl_trie_accessors.NIL));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKIP-CONSTRAINTS?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREV-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP-NAMESTRINGS?"));
        $kw43$SKIP_CONSTRAINTS_ = SubLObjectFactory.makeKeyword("SKIP-CONSTRAINTS?");
        $kw44$ABBREV_TYPES = SubLObjectFactory.makeKeyword("ABBREV-TYPES");
        $kw45$DENOT_TYPE = SubLObjectFactory.makeKeyword("DENOT-TYPE");
        $kw46$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw47$SKIP_NAMESTRINGS_ = SubLObjectFactory.makeKeyword("SKIP-NAMESTRINGS?");
        $sym48$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $sym49$ADD_NEW_ENTRY = SubLObjectFactory.makeSymbol("ADD-NEW-ENTRY");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-LIST"));
        $sym51$ADD_NEW_DENOTS_AND_PREDS = SubLObjectFactory.makeSymbol("ADD-NEW-DENOTS-AND-PREDS");
        $sym52$NL_TRIE_STRING_IS_POS_ = SubLObjectFactory.makeSymbol("NL-TRIE-STRING-IS-POS?");
        $int53$4096 = SubLObjectFactory.makeInteger(4096);
        $const54$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $list55 = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_exclamation, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_slash });
        $kw56$GREEDY = SubLObjectFactory.makeKeyword("GREEDY");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $sym58$GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("GENL-POS-PRED?");
        $sym59$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str60$the_ = SubLObjectFactory.makeString("the ");
        $const61$acronymString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $const62$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw63$SEMTRANS_TEMPLATE = SubLObjectFactory.makeKeyword("SEMTRANS-TEMPLATE");
        $const64$nameSpelling = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $const65$commonNickname = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commonNickname"));
        $sym66$SPEECH_PART_PRED_ = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?");
        $sym67$SPEC_POS_PRED_ = SubLObjectFactory.makeSymbol("SPEC-POS-PRED?");
        $sym68$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const69$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym70$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $sym71$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym72$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw73$ACRONYMS = SubLObjectFactory.makeKeyword("ACRONYMS");
        $kw74$ABBREVS = SubLObjectFactory.makeKeyword("ABBREVS");
        $list75 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")));
        $kw76$INTERVAL = SubLObjectFactory.makeKeyword("INTERVAL");
        $kw77$OFF = SubLObjectFactory.makeKeyword("OFF");
        $kw78$ON = SubLObjectFactory.makeKeyword("ON");
        $sym79$_ = SubLObjectFactory.makeSymbol(">");
        $sym80$INTERVAL_TOKEN_LENGTH = SubLObjectFactory.makeSymbol("INTERVAL-TOKEN-LENGTH");
        $sym81$_ = SubLObjectFactory.makeSymbol("<");
        $sym82$INTERVAL_TOKEN_START = SubLObjectFactory.makeSymbol("INTERVAL-TOKEN-START");
        $list83 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-TOKENS"));
        $sym84$NL_TRIE_P = SubLObjectFactory.makeSymbol("NL-TRIE-P");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ON"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"));
        $str86$Invalid_case_sensitivity_value_fo = SubLObjectFactory.makeString("Invalid case-sensitivity value for NL-TRIE-PREFIXES: ~S");
        $sym87$NL_TRIE_PREFIXES_MEMOIZED = SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED");
        $int88$512 = SubLObjectFactory.makeInteger(512);
        $const89$titleOfWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork"));
        $sym90$INDEX_COVERED_BY_TOKEN_P = SubLObjectFactory.makeSymbol("INDEX-COVERED-BY-TOKEN-P");
        $const91$CommonEnglishMisspellingsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt"));
        $list92 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $kw93$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $kw94$ABORTED = SubLObjectFactory.makeKeyword("ABORTED");
        $sym95$NL_TRIE_INAPPROPRIATE_ENTRY_ = SubLObjectFactory.makeSymbol("NL-TRIE-INAPPROPRIATE-ENTRY?");
        $sym96$PRAGMATICALLY_ACCEPTABLE_ = SubLObjectFactory.makeSymbol("PRAGMATICALLY-ACCEPTABLE?");
        $sym97$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUBNODE"));
        $str99$Found_non_matching_string___S_vs_ = SubLObjectFactory.makeString("Found non-matching string: ~S vs. ~S");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym102$ASENT = SubLObjectFactory.makeUninternedSymbol("ASENT");
        $sym103$MT = SubLObjectFactory.makeUninternedSymbol("MT");
        $sym104$SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $sym105$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $sym106$DO_NL_TRIE_WORD_ENTRIES_FOR_STRING = SubLObjectFactory.makeSymbol("DO-NL-TRIE-WORD-ENTRIES-FOR-STRING");
        $sym107$ATOMIC_SENTENCE_ARG2 = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG2");
        $sym108$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym109$MATCHING_WORD_STRINGS_ENTRY_ = SubLObjectFactory.makeSymbol("MATCHING-WORD-STRINGS-ENTRY?");
        $sym110$DO_SUPPORTING_TRIE_WORDS = SubLObjectFactory.makeSymbol("DO-SUPPORTING-TRIE-WORDS");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym113$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $list114 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialConstituent")));
        $const115$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $const116$ProperNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNameString"));
        $const117$NLPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPhrase"));
        $const118$phrase_Bar1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("phrase-Bar1"));
        $str119$Don_t_know_how_to_check__S_agains = SubLObjectFactory.makeString("Don't know how to check ~S against ~S");
        $sym120$_NL_TRIE_ROTATION_INDEX_ = SubLObjectFactory.makeSymbol("*NL-TRIE-ROTATION-INDEX*");
        $list121 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_hyphen);
        $sym122$_NL_TRIE_STOPLIST_TRIE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-STOPLIST-TRIE*");
        $str123$tried_to_determine_rotations_for_ = SubLObjectFactory.makeString("tried to determine rotations for a non-string: ~S~%");
        $sym124$NL_TRIE_INDEX_ITEM = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM");
        $sym125$NL_TRIE_INDEX_ITEM_P = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-P");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-MT"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-MT"));
        $sym130$PRINT_NL_TRIE_INDEX_ITEM = SubLObjectFactory.makeSymbol("PRINT-NL-TRIE-INDEX-ITEM");
        $sym131$NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-PRINT-FUNCTION-TRAMPOLINE");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-P"));
        $sym133$NL_TRIE_INDEX_ITEM_TERM = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-TERM");
        $sym134$_CSETF_NL_TRIE_INDEX_ITEM_TERM = SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-TERM");
        $sym135$NL_TRIE_INDEX_ITEM_PHRASE = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-PHRASE");
        $sym136$_CSETF_NL_TRIE_INDEX_ITEM_PHRASE = SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-PHRASE");
        $sym137$NL_TRIE_INDEX_ITEM_MT = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-MT");
        $sym138$_CSETF_NL_TRIE_INDEX_ITEM_MT = SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-INDEX-ITEM-MT");
        $kw139$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw140$PHRASE = SubLObjectFactory.makeKeyword("PHRASE");
        $kw141$MT = SubLObjectFactory.makeKeyword("MT");
        $str142$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw143$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym144$MAKE_NL_TRIE_INDEX_ITEM = SubLObjectFactory.makeSymbol("MAKE-NL-TRIE-INDEX-ITEM");
        $kw145$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw146$END = SubLObjectFactory.makeKeyword("END");
        $sym147$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-NL-TRIE-INDEX-ITEM-METHOD");
        $str148$_NL_TRIE_INDEX_ITEM__s__s__a_ = SubLObjectFactory.makeString("<NL-TRIE-INDEX-ITEM:~s:~s:~a>");
        $kw149$DENOTS = SubLObjectFactory.makeKeyword("DENOTS");
        $str150$nl_trie_rotation_stop_list = SubLObjectFactory.makeString("nl trie rotation stop list");
        $str151$nl_trie_rotation_index = SubLObjectFactory.makeString("nl trie rotation index");
        $str152$Creating_NL_trie_rotation_index__ = SubLObjectFactory.makeString("Creating NL trie rotation index...");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("STRIE-DICT-KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("STRIE-DICT-VALUE"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("DICT-KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DICT-VALUE"));
        $sym155$TRIE_REMOVE = SubLObjectFactory.makeSymbol("TRIE-REMOVE");
        $sym156$TRIE_INSERT = SubLObjectFactory.makeSymbol("TRIE-INSERT");
        $kw157$INFIX = SubLObjectFactory.makeKeyword("INFIX");
        $kw158$PREFIX = SubLObjectFactory.makeKeyword("PREFIX");
        $sym159$STARTS_WITH = SubLObjectFactory.makeSymbol("STARTS-WITH");
        $kw160$SUFFIX = SubLObjectFactory.makeKeyword("SUFFIX");
        $sym161$ENDS_WITH = SubLObjectFactory.makeSymbol("ENDS-WITH");
        $sym162$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym163$LESSER_LENGTH_P = SubLObjectFactory.makeSymbol("LESSER-LENGTH-P");
        $str164$The_NL_Trie_must_be_initialized_b = SubLObjectFactory.makeString("The NL Trie must be initialized before it can be dumped.");
        $str165$Dumping_NL_Trie_spellchecker_stri = SubLObjectFactory.makeString("Dumping NL Trie spellchecker strings...");
        $int166$500 = SubLObjectFactory.makeInteger(500);
        $str167$Concurrent_NL_Trie_Search_Stress_ = SubLObjectFactory.makeString("Concurrent NL-Trie Search Stress Test Problems");
        $const168$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $kw169$GAF = SubLObjectFactory.makeKeyword("GAF");
        $str170$Concurrent_NL_Trie_Searches_ = SubLObjectFactory.makeString("Concurrent NL Trie Searches ");
        $sym171$STRESS_TEST_NL_TRIE_SEARCH = SubLObjectFactory.makeSymbol("STRESS-TEST-NL-TRIE-SEARCH");
        $sym172$VALID_PROCESS_P = SubLObjectFactory.makeSymbol("VALID-PROCESS-P");
        $sym173$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str174$Concurrent_NL_Trie_Prefixes_Stres = SubLObjectFactory.makeString("Concurrent NL-Trie Prefixes Stress Test Problems");
        $str175$Concurrent_NL_Trie_Prefixes_ = SubLObjectFactory.makeString("Concurrent NL Trie Prefixes ");
        $sym176$STRESS_TEST_NL_TRIE_PREFIXES = SubLObjectFactory.makeSymbol("STRESS-TEST-NL-TRIE-PREFIXES");
    }
    
    public static final class $nl_trie_inappropriate_entryP$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_inappropriate_entryP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-INAPPROPRIATE-ENTRY?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_accessors.nl_trie_inappropriate_entryP(arg1, (SubLObject)$nl_trie_inappropriate_entryP$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $nl_trie_inappropriate_entryP$BinaryFunction extends BinaryFunction
    {
        public $nl_trie_inappropriate_entryP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-INAPPROPRIATE-ENTRY?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return nl_trie_accessors.nl_trie_inappropriate_entryP(arg1, arg2);
        }
    }
    
    public static final class $nl_trie_index_item_native extends SubLStructNative
    {
        public SubLObject $term;
        public SubLObject $phrase;
        public SubLObject $mt;
        private static final SubLStructDeclNative structDecl;
        
        public $nl_trie_index_item_native() {
            this.$term = (SubLObject)CommonSymbols.NIL;
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$nl_trie_index_item_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$term;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$phrase;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$mt;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$term = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$phrase = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$nl_trie_index_item_native.class, nl_trie_accessors.$sym124$NL_TRIE_INDEX_ITEM, nl_trie_accessors.$sym125$NL_TRIE_INDEX_ITEM_P, nl_trie_accessors.$list126, nl_trie_accessors.$list127, new String[] { "$term", "$phrase", "$mt" }, nl_trie_accessors.$list128, nl_trie_accessors.$list129, nl_trie_accessors.$sym130$PRINT_NL_TRIE_INDEX_ITEM);
        }
    }
    
    public static final class $nl_trie_index_item_p$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_index_item_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-INDEX-ITEM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_accessors.nl_trie_index_item_p(arg1);
        }
    }
}

/*

	Total time: 1536 ms
	
*/