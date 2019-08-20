/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.set.clear_set;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_element_list;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.set.set_p;
import static com.cyc.cycjava.cycl.set.set_remove;
import static com.cyc.cycjava.cycl.set.set_size;
import static com.cyc.cycjava.cycl.set_utilities.set_arbitrary_element;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-INDEXING-DATASTRUCTURES
 * source file: /cyc/top/cycl/kb-indexing-datastructures.lisp
 * created:     2019/07/03 17:37:23
 */
public final class kb_indexing_datastructures extends SubLTranslatedFile implements V12 {
    public static final SubLObject intermediate_index_dictionary_set(SubLObject intermediate_index, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(value, SUBINDEX_P);
        return dictionary.dictionary_enter(intermediate_index_dictionary(intermediate_index), key, value);
    }

    public static final SubLObject intermediate_index_dictionary_delete_key(SubLObject intermediate_index, SubLObject key) {
        return dictionary.dictionary_remove(intermediate_index_dictionary(intermediate_index), key);
    }

    /**
     * assumes INTERMEDIATE-INDEX is dictionary-style
     */
    @LispMethod(comment = "assumes INTERMEDIATE-INDEX is dictionary-style")
    public static final SubLObject intermediate_index_dictionary(SubLObject intermediate_index) {
        return intermediate_index.rest();
    }

    /**
     * returns the set datastructure in FINAL-INDEX.
     * Currently a final index _is_ a set, so this is the identity function.
     */
    @LispMethod(comment = "returns the set datastructure in FINAL-INDEX.\r\nCurrently a final index _is_ a set, so this is the identity function.\nreturns the set datastructure in FINAL-INDEX.\nCurrently a final index _is_ a set, so this is the identity function.")
    public static final SubLObject final_index_set(SubLObject final_index) {
        return final_index;
    }

    public static final SubLObject do_final_index_valid_index_p(SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    public static final SubLFile me = new kb_indexing_datastructures();



    // deflexical
    // The estimated percentage of assertions that have meta-assertions
    /**
     * The estimated percentage of assertions that have meta-assertions
     */
    @LispMethod(comment = "The estimated percentage of assertions that have meta-assertions\ndeflexical")
    private static final SubLSymbol $meta_assertion_frequency$ = makeSymbol("*META-ASSERTION-FREQUENCY*");

    // deflexical
    /**
     * Constants which are part of the syntax and which therefore are not fully
     * indexed.
     */
    @LispMethod(comment = "Constants which are part of the syntax and which therefore are not fully\r\nindexed.\ndeflexical\nConstants which are part of the syntax and which therefore are not fully\nindexed.")
    private static final SubLSymbol $unindexed_syntax_constants$ = makeSymbol("*UNINDEXED-SYNTAX-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_complex_index_keys_in_orderP$ = makeSymbol("*CURRENT-COMPLEX-INDEX-KEYS-IN-ORDER?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $ordered_final_index_resource$ = makeSymbol("*ORDERED-FINAL-INDEX-RESOURCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $recent_final_topn_indices$ = makeSymbol("*RECENT-FINAL-TOPN-INDICES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $with_final_topn_index_tracking$ = makeSymbol("*WITH-FINAL-TOPN-INDEX-TRACKING*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $assertion_indexing_store$ = makeSymbol("*ASSERTION-INDEXING-STORE*");

    private static final SubLFloat $float$0_05 = makeDouble(0.05);

    static private final SubLList $list3 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list4 = list($DONE, makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym8$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");

    private static final SubLSymbol DO_ASSERTIONS_WITH_META_ASSERTIONS = makeSymbol("DO-ASSERTIONS-WITH-META-ASSERTIONS");

    private static final SubLSymbol $sym11$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym12$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLList $list13 = list(list(makeSymbol("ASSERTIONS-WITH-META-ASSERTIONS-COUNT")));

    private static final SubLList $list14 = list(ZERO_INTEGER);

    private static final SubLList $list19 = list(makeSymbol("NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR"));

    private static final SubLSymbol NEW_ASSERTIONS_WITH_META_ASSERTIONS_ITERATOR = makeSymbol("NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR");

    private static final SubLList $list21 = list(reader_make_constant_shell("implies"), reader_make_constant_shell("and"), reader_make_constant_shell("or"), reader_make_constant_shell("not"));

    private static final SubLList $list23 = list(makeSymbol("OBJECT"));

    private static final SubLString $str24$Returns_T_iff_OBJECT_is_an_indexe = makeString("Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.");

    static private final SubLList $list25 = list(makeSymbol("BOOLEANP"));

    private static final SubLList $list26 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc indexed terms"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$mapping_Cyc_indexed_terms = makeString("mapping Cyc indexed terms");

    private static final SubLSymbol DO_FORTS = makeSymbol("DO-FORTS");

    private static final SubLString $str31$_A__forts_ = makeString("~A (forts)");

    private static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

    private static final SubLString $str33$_A__assertions_ = makeString("~A (assertions)");

    private static final SubLSymbol DO_KB_UNREPRESENTED_TERMS = makeSymbol("DO-KB-UNREPRESENTED-TERMS");

    private static final SubLString $str35$_A__unrepresented_terms_ = makeString("~A (unrepresented terms)");

    private static final SubLString $str36$_S_is_not_indexed = makeString("~S is not indexed");

    private static final SubLSymbol INDEXING_LEAF_INSTALLED_P = makeSymbol("INDEXING-LEAF-INSTALLED-P");

    private static final SubLSymbol SIMPLE_INDEXED_TERM_P = makeSymbol("SIMPLE-INDEXED-TERM-P");

    private static final SubLSymbol DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = makeSymbol("DO-SIMPLE-INDEX-TERM-ASSERTION-LIST");

    private static final SubLSymbol DO_SIMPLE_INDEX = makeSymbol("DO-SIMPLE-INDEX");

    private static final SubLSymbol SIMPLE_INDEX_P = makeSymbol("SIMPLE-INDEX-P");

    private static final SubLList $list42 = list(list(makeSymbol("TERM"), makeSymbol("KEYS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $current_complex_index_term$ = makeSymbol("*CURRENT-COMPLEX-INDEX-TERM*");

    public static final SubLSymbol $current_complex_index_keys$ = makeSymbol("*CURRENT-COMPLEX-INDEX-KEYS*");

    private static final SubLSymbol COMPLEX_INDEX_P = makeSymbol("COMPLEX-INDEX-P");

    private static final SubLSymbol $sym46$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str47$_s_is_not_a_SUBINDEX_P = makeString("~s is not a SUBINDEX-P");

    private static final SubLSymbol INTERMEDIATE_INDEX_P = makeSymbol("INTERMEDIATE-INDEX-P");

    private static final SubLString $str49$Cannot_reserve_a_TOP_N_index_for_ = makeString("Cannot reserve a TOP-N index for ~A if that term is not complexly indexed.~%");

    private static final SubLString $str50$Cannot_merge__A_onto__A__incommen = makeString("Cannot merge ~A onto ~A, incommensurate.~%");

    private static final SubLString $str51$Dont_know_how_to_merge_sub_index_ = makeString("Dont know how to merge sub-index ~A and ~A.~%");

    private static final SubLList $list52 = list(list(makeSymbol("KEY-VAR"), makeSymbol("SUBINDEX-VAR"), makeSymbol("INTERMEDIATE-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list53 = list($DONE);

    private static final SubLSymbol $sym54$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol DO_INTERMEDIATE_INDEX_VALID_INDEX_P = makeSymbol("DO-INTERMEDIATE-INDEX-VALID-INDEX-P");

    private static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");

    private static final SubLSymbol INTERMEDIATE_INDEX_MAP = makeSymbol("INTERMEDIATE-INDEX-MAP");

    private static final SubLSymbol DO_INTERMEDIATE_INDEX = makeSymbol("DO-INTERMEDIATE-INDEX");

    private static final SubLList $list60 = list(list(makeSymbol("SET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $changed_index_entry_hints$ = makeSymbol("*CHANGED-INDEX-ENTRY-HINTS*");

    private static final SubLList $list62 = list(list(makeSymbol("KEY-VAR"), makeSymbol("SUBINDEX-VAR"), makeSymbol("INTERMEDIATE-INDEX"), makeSymbol("UNCHANGED-PART"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym63$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol $sym64$KEY_SET = makeUninternedSymbol("KEY-SET");

    private static final SubLSymbol SEGREGATE_INDEX_CHANGES_AND_PRISTINES = makeSymbol("SEGREGATE-INDEX-CHANGES-AND-PRISTINES");

    private static final SubLSymbol INTERMEDIATE_INDEX_LOOKUP = makeSymbol("INTERMEDIATE-INDEX-LOOKUP");

    private static final SubLSymbol DO_CHANGED_INTERMEDIATE_INDEX = makeSymbol("DO-CHANGED-INTERMEDIATE-INDEX");

    private static final SubLList $list70 = list(makeSymbol("KEY"), makeSymbol("SUBINDEX"));

    private static final SubLSymbol SUBINDEX_P = makeSymbol("SUBINDEX-P");

    public static final SubLSymbol $final_topn_index_cutoff_size$ = makeSymbol("*FINAL-TOPN-INDEX-CUTOFF-SIZE*");

    private static final SubLList $list73 = cons(makeSymbol("KEY"), makeSymbol("REST-KEYS"));

    private static final SubLSymbol FINAL_INDEX_P = makeSymbol("FINAL-INDEX-P");

    private static final SubLList $list75 = cons(makeSymbol("BASE-COUNT"), makeSymbol("BASE-MAP"));

    private static final SubLList $list76 = cons(makeSymbol("AUGMENT-COUNT"), makeSymbol("AUGMENT-MAP"));

    private static final SubLList $list77 = list(makeSymbol("AUG-KEY"), makeSymbol("AUG-INDEX"));

    private static final SubLList $list78 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("FINAL-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym79$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol FINAL_UNIFIED_INDEX_P = makeSymbol("FINAL-UNIFIED-INDEX-P");

    private static final SubLSymbol DO_FINAL_UNIFIED_INDEX_INTERNAL = makeSymbol("DO-FINAL-UNIFIED-INDEX-INTERNAL");

    private static final SubLSymbol FINAL_SHARDED_INDEX_P = makeSymbol("FINAL-SHARDED-INDEX-P");

    private static final SubLSymbol DO_FINAL_SHARDED_INDEX_INTERNAL = makeSymbol("DO-FINAL-SHARDED-INDEX-INTERNAL");

    private static final SubLSymbol FINAL_TOPN_INDEX_P = makeSymbol("FINAL-TOPN-INDEX-P");

    private static final SubLSymbol DO_FINAL_TOPN_INDEX_INTERNAL = makeSymbol("DO-FINAL-TOPN-INDEX-INTERNAL");

    private static final SubLList $list89 = list(makeSymbol("FINAL-INDEX-P"));

    private static final SubLSymbol $sym90$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLList $list91 = list(makeSymbol("*ORDERED-FINAL-INDEX-RESOURCE*"));

    private static final SubLSymbol DO_ORDERED_FINAL_UNIFIED_INDEX_INTERNAL = makeSymbol("DO-ORDERED-FINAL-UNIFIED-INDEX-INTERNAL");

    private static final SubLSymbol DO_ORDERED_FINAL_SHARDED_INDEX_INTERNAL = makeSymbol("DO-ORDERED-FINAL-SHARDED-INDEX-INTERNAL");

    private static final SubLSymbol DO_ORDERED_FINAL_TOPN_INDEX_INTERNAL = makeSymbol("DO-ORDERED-FINAL-TOPN-INDEX-INTERNAL");

    private static final SubLList $list95 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("FINAL-UNIFIED-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol FINAL_UNIFIED_INDEX_SET = makeSymbol("FINAL-UNIFIED-INDEX-SET");

    private static final SubLSymbol $sym98$LEAF_ITEMS = makeUninternedSymbol("LEAF-ITEMS");

    private static final SubLSymbol SET_ELEMENT_LIST = makeSymbol("SET-ELEMENT-LIST");

    private static final SubLSymbol SORT_ASSERTIONS = makeSymbol("SORT-ASSERTIONS");

    private static final SubLSymbol DO_FINAL_UNIFIED_INDEX = makeSymbol("DO-FINAL-UNIFIED-INDEX");

    public static final SubLSymbol $final_sharded_index_shard_size$ = makeSymbol("*FINAL-SHARDED-INDEX-SHARD-SIZE*");

    private static final SubLList $list105 = list(makeSymbol("KEY"), makeSymbol("SHARD"));

    private static final SubLList $list106 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("FINAL-SHARDED-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym107$IGNORED_KEY = makeUninternedSymbol("IGNORED-KEY");

    private static final SubLSymbol $sym108$SHARD = makeUninternedSymbol("SHARD");

    private static final SubLSymbol FINAL_SHARDED_INDEX_SHARD_MAP = makeSymbol("FINAL-SHARDED-INDEX-SHARD-MAP");

    private static final SubLSymbol $sym111$SHARD_KEY_LIST = makeUninternedSymbol("SHARD-KEY-LIST");

    private static final SubLSymbol $sym112$KEY = makeUninternedSymbol("KEY");

    private static final SubLSymbol $sym113$SHARD = makeUninternedSymbol("SHARD");

    private static final SubLSymbol $sym114$SHARD_CONTENTS = makeUninternedSymbol("SHARD-CONTENTS");

    private static final SubLSymbol MAP_KEYS = makeSymbol("MAP-KEYS");

    private static final SubLList $list117 = list(list(QUOTE, makeSymbol("<")));

    private static final SubLSymbol MAP_GET = makeSymbol("MAP-GET");

    private static final SubLSymbol ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS = makeSymbol("ORDERED-FINAL-SHARDED-INDEX-EXTRACT-CONTENTS");

    private static final SubLSymbol $sym122$POSSIBLE_ASSERTION_ = makeSymbol("POSSIBLE-ASSERTION<");

    private static final SubLString $str123$Index_count_was__A__yet_we_copied = makeString("Index count was ~A, yet we copied ~A items.");

    private static final SubLSymbol $sym124$_ = makeSymbol("<");

    private static final SubLSymbol INDEXING_LEAF_SUID = makeSymbol("INDEXING-LEAF-SUID");

    private static final SubLString $str126$Implementation_error__shard_count = makeString("Implementation error: shard count of ~A does not match keys length of ~A.");

    private static final SubLString $str129$Shard_count_of__A_does_not_match_ = makeString("Shard count of ~A does not match keys length of ~A.");

    private static final SubLString $str130$Shard_key___A_is_wrong____we_expe = makeString("Shard key #~A is wrong -- we expected ~A, but got ~A.");

    private static final SubLList $list131 = list(makeSymbol("MAX-SUID"), makeSymbol("SHARD"));

    private static final SubLString $str132$Shard_with_max_ID__A_contains_lea = makeString("Shard with max ID ~A contains leaf ~A with ID ~A.");

    private static final SubLString $str133$We_expected_to_find__A_leaves__bu = makeString("We expected to find ~A leaves, but the count was off by ~A.");

    private static final SubLSymbol FINAL_SHARDED_INDEX_SET = makeSymbol("FINAL-SHARDED-INDEX-SET");

    private static final SubLSymbol DO_FINAL_SHARDED_INDEX = makeSymbol("DO-FINAL-SHARDED-INDEX");

    private static final SubLList $list136 = list(list(makeSymbol("NEWBIES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list137 = list(list(makeSymbol("*RECENT-FINAL-TOPN-INDICES*")), list(makeSymbol("*WITH-FINAL-TOPN-INDEX-TRACKING*"), T));

    private static final SubLList $list138 = list(list(makeSymbol("COPY-TREE"), makeSymbol("*RECENT-FINAL-TOPN-INDICES*")));

    private static final SubLList $list139 = list(list(makeSymbol("*WITH-FINAL-TOPN-INDEX-TRACKING*")));

    private static final SubLString $str141$__Creating_empty_TOP_N_index__A_o = makeString("~&Creating empty TOP-N index ~A on ~A.~%");

    private static final SubLString $str142$Upgrading_index__A_on__A___A_item = makeString("Upgrading index ~A on ~A (~A items) to TOP-N index.~%");

    private static final SubLString $str144$Final_Top_N_index_iterator_for__A = makeString("Final Top-N index iterator for ~A requested.~%");

    private static final SubLString $str145$_A__ = makeString("~A~%");

    private static final SubLSymbol $sym146$ASSERTION_MATCHES_FINAL_TOPN_INDEXKEY_PATH_ = makeSymbol("ASSERTION-MATCHES-FINAL-TOPN-INDEXKEY-PATH?");

    private static final SubLSymbol $SIMPLE_MATCH_FUNCTION = makeKeyword("SIMPLE-MATCH-FUNCTION");

    private static final SubLString $str148$No_match_function_available_for_d = makeString("No match function available for description ~S on ~S.~%");

    private static final SubLList $list149 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("FINAL-TOPN-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol NEW_FINAL_TOPN_INDEX_ITERATOR = makeSymbol("NEW-FINAL-TOPN-INDEX-ITERATOR");

    private static final SubLSymbol NEW_ORDERED_FINAL_TOPN_INDEX_ITERATOR = makeSymbol("NEW-ORDERED-FINAL-TOPN-INDEX-ITERATOR");

    private static final SubLList $list152 = list(makeSymbol("MATCHER-FN"), makeSymbol("ARGS"));

    private static final SubLString $str153$Could_not_merge_final_indices__A_ = makeString("Could not merge final indices ~A and ~A.~%~A~%");

    private static final SubLString $str154$Merging_indices__A_on__A___A_item = makeString("Merging indices ~A on ~A (~A items and ~A) into TOP-N index.~%");

    private static final SubLList $list155 = list(makeUninternedSymbol("IGNORED-KEY"), makeUninternedSymbol("SHARD"));

    static final boolean assertionsDisabledSynth = true;

    // Definitions
    /**
     * sets up all tables needed for the KB indexing
     *
     * @param estimated-size;
     * 		estimated # of constants
     */
    @LispMethod(comment = "sets up all tables needed for the KB indexing\r\n\r\n@param estimated-size;\r\n\t\testimated # of constants")
    public static final SubLObject setup_indexing_tables_alt(SubLObject estimated_size) {
        {
            SubLObject estimated_assertion_count = multiply(TEN_INTEGER, estimated_size);
            assertion_indexing_store_initialize(estimated_assertion_count);
        }
        return NIL;
    }

    // Definitions
    /**
     * sets up all tables needed for the KB indexing
     *
     * @param estimated-size;
     * 		estimated # of constants
     */
    @LispMethod(comment = "sets up all tables needed for the KB indexing\r\n\r\n@param estimated-size;\r\n\t\testimated # of constants")
    public static SubLObject setup_indexing_tables(final SubLObject estimated_size) {
        final SubLObject estimated_assertion_count = multiply(TEN_INTEGER, estimated_size);
        assertion_indexing_store_initialize(estimated_assertion_count);
        return NIL;
    }

    public static final SubLObject assertion_indexing_store_alt() {
        return $assertion_indexing_store$.getGlobalValue();
    }

    public static SubLObject assertion_indexing_store() {
        return $assertion_indexing_store$.getGlobalValue();
    }

    public static SubLObject assertions_with_meta_assertions_count() {
        return hash_table_count($assertion_indexing_store$.getGlobalValue());
    }

    public static final SubLObject assertion_indexing_store_reset_alt(SubLObject store) {
        $assertion_indexing_store$.setGlobalValue(store);
        return store;
    }

    public static SubLObject assertion_indexing_store_reset(final SubLObject store) {
        $assertion_indexing_store$.setGlobalValue(store);
        return store;
    }

    public static final SubLObject assertion_indexing_store_initial_size_alt(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == UNPROVIDED) {
            estimated_assertion_count = NIL;
        }
        if (NIL != estimated_assertion_count) {
            return round(multiply(estimated_assertion_count, $meta_assertion_frequency$.getGlobalValue()), UNPROVIDED);
        } else {
            if (NIL != kb_loaded()) {
                return round(multiply(assertion_handles.assertion_count(), $meta_assertion_frequency$.getGlobalValue()), UNPROVIDED);
            } else {
                return $int$64;
            }
        }
    }

    public static SubLObject assertion_indexing_store_initial_size(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == UNPROVIDED) {
            estimated_assertion_count = NIL;
        }
        if (NIL != estimated_assertion_count) {
            return round(multiply(estimated_assertion_count, $meta_assertion_frequency$.getGlobalValue()), UNPROVIDED);
        }
        if (NIL != kb_loaded()) {
            return round(multiply(assertion_handles.assertion_count(), $meta_assertion_frequency$.getGlobalValue()), UNPROVIDED);
        }
        return $int$64;
    }

    public static final SubLObject assertion_indexing_store_initialize_alt(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == UNPROVIDED) {
            estimated_assertion_count = NIL;
        }
        {
            SubLObject initial_size = assertion_indexing_store_initial_size(estimated_assertion_count);
            assertion_indexing_store_reset(make_hash_table(initial_size, symbol_function(EQ), UNPROVIDED));
        }
        return $assertion_indexing_store$.getGlobalValue();
    }

    public static SubLObject assertion_indexing_store_initialize(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == UNPROVIDED) {
            estimated_assertion_count = NIL;
        }
        final SubLObject initial_size = assertion_indexing_store_initial_size(estimated_assertion_count);
        assertion_indexing_store_reset(make_hash_table(initial_size, symbol_function(EQL), UNPROVIDED));
        return $assertion_indexing_store$.getGlobalValue();
    }

    public static SubLObject clear_assertion_indexing() {
        return clear_assertion_indexing_store();
    }

    public static SubLObject clear_assertion_indexing_store() {
        return clrhash($assertion_indexing_store$.getGlobalValue());
    }

    public static final SubLObject assertion_indexing_store_get_alt(SubLObject assertion) {
        return values(gethash(assertion, $assertion_indexing_store$.getGlobalValue(), new_simple_index()));
    }

    public static SubLObject assertion_indexing_store_get(final SubLObject assertion) {
        return gethash_without_values(assertion, $assertion_indexing_store$.getGlobalValue(), new_simple_index());
    }

    public static final SubLObject assertion_indexing_store_remove_alt(SubLObject assertion) {
        return remhash(assertion, $assertion_indexing_store$.getGlobalValue());
    }

    public static SubLObject assertion_indexing_store_remove(final SubLObject assertion) {
        BeanShellCntrl.removeThis(((AbstractSubLStruct) (assertion)));
        return remhash(assertion, $assertion_indexing_store$.getGlobalValue());
    }

    public static final SubLObject assertion_indexing_store_set_alt(SubLObject assertion, SubLObject index) {
        if (index == new_simple_index()) {
            return assertion_indexing_store_remove(assertion);
        } else {
            return sethash(assertion, $assertion_indexing_store$.getGlobalValue(), index);
        }
    }

    public static SubLObject assertion_indexing_store_set(final SubLObject assertion, final SubLObject index) {
        try {
            final SubLObject new_simple_index = new_simple_index();
            if (index.eql(new_simple_index)) {
                return assertion_indexing_store_remove(assertion);
            }
            final SubLObject hashTable = $assertion_indexing_store$.getGlobalValue();
            final SubLObject retVal = sethash(assertion, hashTable, index);
            return retVal;
        } finally {
            BeanShellCntrl.addThis(((AbstractSubLStruct) (assertion)));
        }
    }

    public static SubLObject do_assertions_with_meta_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        assertion_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list3);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list3);
            if (NIL == member(current_$1, $list4, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list3);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = $sym8$PROGRESS_MESSAGE_VAR;
            list(CLET, list(list(progress_message_var, progress_message)), listS(DO_ASSERTIONS_WITH_META_ASSERTIONS, list(assertion_var, $DONE, done, $PROGRESS_MESSAGE, progress_message_var), append(body, NIL)));
        }
        if (NIL != progress_message) {
            final SubLObject sofar = $sym11$SOFAR;
            final SubLObject total = $sym12$TOTAL;
            return list(CLET, list(bq_cons(total, $list13), bq_cons(sofar, $list14)), list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_ASSERTIONS_WITH_META_ASSERTIONS, list(assertion_var, $DONE, done), append(body, list(list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total))))));
        }
        return listS(DO_ITERATOR, list(assertion_var, $list19, $DONE, done), append(body, NIL));
    }

    public static SubLObject new_assertions_with_meta_assertions_iterator() {
        final SubLObject hashTable = $assertion_indexing_store$.getGlobalValue();
        return iteration.new_hash_table_keys_iterator(hashTable);
    }

    public static final SubLObject unindexed_syntax_constants_alt() {
        return $unindexed_syntax_constants$.getGlobalValue();
    }

    public static SubLObject unindexed_syntax_constants() {
        return $unindexed_syntax_constants$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a constants which is part of the syntax and therefore not fully indexed.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constants which is part of the syntax and therefore not fully indexed.")
    public static final SubLObject unindexed_syntax_constant_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $unindexed_syntax_constants$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a constants which is part of the syntax and therefore not fully indexed.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constants which is part of the syntax and therefore not fully indexed.")
    public static SubLObject unindexed_syntax_constant_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $unindexed_syntax_constants$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.
     */
    @LispMethod(comment = "Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.")
    public static final SubLObject indexed_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_utilities.reified_term_p(v_object)) || (NIL != indexed_unrepresented_term_p(v_object)));
    }

    /**
     * Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.
     */
    @LispMethod(comment = "Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.")
    public static SubLObject indexed_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_utilities.reified_term_p(v_object)) || (NIL != indexed_unrepresented_term_p(v_object)));
    }

    /**
     * Returns T iff OBJECT is an indexed unrepresented CycL term, e.g., a string or number.
     */
    @LispMethod(comment = "Returns T iff OBJECT is an indexed unrepresented CycL term, e.g., a string or number.")
    public static final SubLObject indexed_unrepresented_term_p_alt(SubLObject v_object) {
        return cycl_grammar.cycl_unrepresented_term_p(v_object);
    }

    /**
     * Returns T iff OBJECT is an indexed unrepresented CycL term, e.g., a string or number.
     */
    @LispMethod(comment = "Returns T iff OBJECT is an indexed unrepresented CycL term, e.g., a string or number.")
    public static SubLObject indexed_unrepresented_term_p(final SubLObject v_object) {
        return cycl_grammar.cycl_unrepresented_term_p(v_object);
    }

    /**
     * Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.")
    public static final SubLObject valid_indexed_termP_alt(SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return forts.valid_fortP(v_object);
        } else {
            if (NIL != assertion_handles.assertion_p(v_object)) {
                return assertion_handles.valid_assertionP(v_object, UNPROVIDED);
            } else {
                if (NIL != indexed_unrepresented_term_p(v_object)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.")
    public static SubLObject valid_indexed_termP(final SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return forts.valid_fortP(v_object);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return assertion_handles.valid_assertionP(v_object, UNPROVIDED);
        }
        if (NIL != indexed_unrepresented_term_p(v_object)) {
            return T;
        }
        return NIL;
    }

    /**
     * Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.
     * Performs more robust checking than @xref VALID-INDEXED-TERM?
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.\r\nPerforms more robust checking than @xref VALID-INDEXED-TERM?\nReturns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.\nPerforms more robust checking than @xref VALID-INDEXED-TERM?")
    public static final SubLObject valid_indexed_term_robustP_alt(SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return forts.valid_fort_robustP(v_object);
        } else {
            if (NIL != assertion_handles.assertion_p(v_object)) {
                return assertions_low.valid_assertion_robustP(v_object);
            } else {
                if (NIL != indexed_unrepresented_term_p(v_object)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.
     * Performs more robust checking than @xref VALID-INDEXED-TERM?
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.\r\nPerforms more robust checking than @xref VALID-INDEXED-TERM?\nReturns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion.\nPerforms more robust checking than @xref VALID-INDEXED-TERM?")
    public static SubLObject valid_indexed_term_robustP(final SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return forts.valid_fort_robustP(v_object);
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_low.valid_assertion_robustP(v_object);
        }
        if (NIL != indexed_unrepresented_term_p(v_object)) {
            return T;
        }
        return NIL;
    }

    /**
     * Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.
     */
    @LispMethod(comment = "Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.")
    public static final SubLObject invalid_indexed_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL == valid_indexed_termP(v_object)));
    }

    /**
     * Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.
     */
    @LispMethod(comment = "Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.")
    public static SubLObject invalid_indexed_termP(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL == valid_indexed_termP(v_object)));
    }

    /**
     * Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.
     * Performs more robust checking than @xref INVALID-INDEXED-TERM?
     */
    @LispMethod(comment = "Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.\r\nPerforms more robust checking than @xref INVALID-INDEXED-TERM?\nReturns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.\nPerforms more robust checking than @xref INVALID-INDEXED-TERM?")
    public static final SubLObject invalid_indexed_term_robustP_alt(SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL == valid_indexed_term_robustP(v_object)));
    }

    /**
     * Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.
     * Performs more robust checking than @xref INVALID-INDEXED-TERM?
     */
    @LispMethod(comment = "Returns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.\r\nPerforms more robust checking than @xref INVALID-INDEXED-TERM?\nReturns T iff OBJECT is an invalid indexed CycL term, i.e. a fort or an assertion.\nPerforms more robust checking than @xref INVALID-INDEXED-TERM?")
    public static SubLObject invalid_indexed_term_robustP(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL == valid_indexed_term_robustP(v_object)));
    }

    /**
     * Returns T iff OBJECT is sort of indexed; i.e., a fort, assertion, or hlmt.
     */
    @LispMethod(comment = "Returns T iff OBJECT is sort of indexed; i.e., a fort, assertion, or hlmt.")
    public static final SubLObject sort_of_indexed_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) || (NIL != hlmt.hlmt_p(v_object)));
    }

    /**
     * Returns T iff OBJECT is sort of indexed; i.e., a fort, assertion, or hlmt.
     */
    @LispMethod(comment = "Returns T iff OBJECT is sort of indexed; i.e., a fort, assertion, or hlmt.")
    public static SubLObject sort_of_indexed_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) || (NIL != hlmt.hlmt_p(v_object)));
    }

    /**
     * Return T iff OBJECT is the type which will be indexed in the other index, if necessary.
     */
    @LispMethod(comment = "Return T iff OBJECT is the type which will be indexed in the other index, if necessary.")
    public static final SubLObject fully_indexed_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL == unindexed_syntax_constant_p(v_object)));
    }

    /**
     * Return T iff OBJECT is the type which will be indexed in the other index, if necessary.
     */
    @LispMethod(comment = "Return T iff OBJECT is the type which will be indexed in the other index, if necessary.")
    public static SubLObject fully_indexed_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL == unindexed_syntax_constant_p(v_object)));
    }

    /**
     * Return T iff OBJECT is the type which will be indexed in the other index, if necessary, and is valid.
     */
    @LispMethod(comment = "Return T iff OBJECT is the type which will be indexed in the other index, if necessary, and is valid.")
    public static final SubLObject valid_fully_indexed_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != valid_indexed_termP(v_object)) && (NIL == unindexed_syntax_constant_p(v_object)));
    }

    /**
     * Return T iff OBJECT is the type which will be indexed in the other index, if necessary, and is valid.
     */
    @LispMethod(comment = "Return T iff OBJECT is the type which will be indexed in the other index, if necessary, and is valid.")
    public static SubLObject valid_fully_indexed_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != valid_indexed_termP(v_object)) && (NIL == unindexed_syntax_constant_p(v_object)));
    }

    /**
     * Iterate over all indexed terms, executing BODY within the scope of VAR.
     * VAR is bound to the indexed term.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all indexed terms, executing BODY within the scope of VAR.\r\nVAR is bound to the indexed term.\r\nMESSAGE is a progress message string.\nIterate over all indexed terms, executing BODY within the scope of VAR.\nVAR is bound to the indexed term.\nMESSAGE is a progress message string.")
    public static final SubLObject do_indexed_terms_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$mapping_Cyc_indexed_terms;
                        destructuring_bind_must_listp(current, datum, $list_alt8);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PROGN, listS(DO_FORTS, list(var, message), append(body, NIL)), listS(DO_ASSERTIONS, list(var, message), append(body, NIL)), listS(DO_KB_UNREPRESENTED_TERMS, list(var, $PROGRESS_MESSAGE, message), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt8);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterate over all indexed terms, executing BODY within the scope of VAR.
     * VAR is bound to the indexed term.
     * MESSAGE is a progress message string.
     */
    @LispMethod(comment = "Iterate over all indexed terms, executing BODY within the scope of VAR.\r\nVAR is bound to the indexed term.\r\nMESSAGE is a progress message string.\nIterate over all indexed terms, executing BODY within the scope of VAR.\nVAR is bound to the indexed term.\nMESSAGE is a progress message string.")
    public static SubLObject do_indexed_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        var = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$mapping_Cyc_indexed_terms;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(DO_FORTS, list(var, list(FORMAT, NIL, $str31$_A__forts_, message)), append(body, NIL)), listS(DO_ASSERTIONS, list(var, list(FORMAT, NIL, $str33$_A__assertions_, message)), append(body, NIL)), listS(DO_KB_UNREPRESENTED_TERMS, list(var, $PROGRESS_MESSAGE, list(FORMAT, NIL, $str35$_A__unrepresented_terms_, message)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list26);
        return NIL;
    }

    public static final SubLObject index_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != simple_index_p(v_object)) || (NIL != complex_index_p(v_object)));
    }

    public static SubLObject index_p(final SubLObject v_object) {
        return makeBoolean((NIL != simple_index_p(v_object)) || (NIL != complex_index_p(v_object)));
    }

    public static final SubLObject index_installed_p_alt(SubLObject v_object) {
        if (NIL != simple_index_p(v_object)) {
            return simple_index_installed_p(v_object);
        } else {
            if (NIL != complex_index_p(v_object)) {
                return complex_index_installed_p(v_object);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject index_installed_p(final SubLObject v_object) {
        if (NIL != simple_index_p(v_object)) {
            return simple_index_installed_p(v_object);
        }
        if (NIL != complex_index_p(v_object)) {
            return complex_index_installed_p(v_object);
        }
        return NIL;
    }

    public static final SubLObject index_not_hosed_p_alt(SubLObject v_object) {
        if (NIL != simple_index_p(v_object)) {
            return simple_index_not_hosed_p(v_object);
        } else {
            if (NIL != complex_index_p(v_object)) {
                return complex_index_not_hosed_p(v_object);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject index_not_hosed_p(final SubLObject v_object) {
        if (NIL != simple_index_p(v_object)) {
            return simple_index_not_hosed_p(v_object);
        }
        if (NIL != complex_index_p(v_object)) {
            return complex_index_not_hosed_p(v_object);
        }
        return NIL;
    }

    public static final SubLObject index_leaves_alt(SubLObject index) {
        if (NIL != simple_index_p(index)) {
            return simple_index_leaves(index);
        } else {
            return complex_index_leaves(index);
        }
    }

    public static SubLObject index_leaves(final SubLObject index) {
        if (NIL != simple_index_p(index)) {
            return simple_index_leaves(index);
        }
        return complex_index_leaves(index);
    }

    public static final SubLObject index_leaf_count_alt(SubLObject index) {
        if (NIL != simple_index_p(index)) {
            return simple_index_leaf_count(index);
        } else {
            return complex_index_leaf_count(index);
        }
    }

    public static SubLObject index_leaf_count(final SubLObject index) {
        if (NIL != simple_index_p(index)) {
            return simple_index_leaf_count(index);
        }
        return complex_index_leaf_count(index);
    }

    /**
     *
     *
     * @return index-p
     */
    @LispMethod(comment = "@return index-p")
    public static final SubLObject term_index_alt(SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            if (NIL != valid_constantP(v_term, UNPROVIDED)) {
                return constants_low.constant_index(v_term);
            }
        } else {
            if (NIL != nart_handles.nart_p(v_term)) {
                if (NIL != nart_handles.valid_nartP(v_term, UNPROVIDED)) {
                    return narts_low.nart_index(v_term);
                }
            } else {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    return assertions_low.assertion_index(v_term);
                } else {
                    if (NIL != indexed_unrepresented_term_p(v_term)) {
                        return unrepresented_terms.unrepresented_term_index(v_term);
                    } else {
                        if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                            return auxiliary_indexing.get_auxiliary_index(v_term);
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
     * @return index-p
     */
    @LispMethod(comment = "@return index-p")
    public static SubLObject term_index(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            if (NIL != valid_constantP(v_term, UNPROVIDED)) {
                return constants_low.constant_index(v_term);
            }
        } else
            if (NIL != nart_handles.nart_p(v_term)) {
                if (NIL != nart_handles.valid_nartP(v_term, UNPROVIDED)) {
                    return narts_low.nart_index(v_term);
                }
            } else {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    return assertions_low.assertion_index(v_term);
                }
                if (NIL != indexed_unrepresented_term_p(v_term)) {
                    return unrepresented_terms.unrepresented_term_index(v_term);
                }
                if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                    return auxiliary_indexing.get_auxiliary_index(v_term);
                }
            }

        return NIL;
    }

    public static SubLObject term_index_swapped_inP(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            if (NIL != valid_constantP(v_term, UNPROVIDED)) {
                return constants_low.constant_index_swapped_inP(v_term);
            }
        } else
            if (NIL != nart_handles.nart_p(v_term)) {
                if (NIL != nart_handles.valid_nartP(v_term, UNPROVIDED)) {
                    return narts_low.nart_index_swapped_inP(v_term);
                }
            } else {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    return assertions_low.assertion_index_swapped_inP(v_term);
                }
                if (NIL != indexed_unrepresented_term_p(v_term)) {
                    return unrepresented_terms.unrepresented_term_index_swapped_inP(v_term);
                }
                if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                    return auxiliary_indexing.auxiliary_index_swapped_inP(v_term);
                }
            }

        return T;
    }

    /**
     * Primitively replaces TERM's index with INDEX.
     *
     * @param INDEX
    index-p
     * 		
     */
    @LispMethod(comment = "Primitively replaces TERM\'s index with INDEX.\r\n\r\n@param INDEX\nindex-p")
    public static final SubLObject reset_term_index_alt(SubLObject v_term, SubLObject index) {
        if (NIL != forts.fort_p(v_term)) {
            forts.reset_fort_index(v_term, index);
        } else {
            if (NIL != hlmt.hlmt_p(v_term)) {
            } else {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    assertions_low.reset_assertion_index(v_term, index);
                } else {
                    if (NIL != indexed_unrepresented_term_p(v_term)) {
                        unrepresented_terms.reset_unrepresented_term_index(v_term, index, T);
                    } else {
                        if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                            auxiliary_indexing.reset_auxiliary_index(v_term, index);
                        } else {
                            Errors.error($str_alt15$_S_is_not_indexed, v_term);
                        }
                    }
                }
            }
        }
        return v_term;
    }

    /**
     * Primitively replaces TERM's index with INDEX.
     *
     * @param INDEX
    		index-p
     * 		
     */
    @LispMethod(comment = "Primitively replaces TERM\'s index with INDEX.\r\n\r\n@param INDEX\n\t\tindex-p")
    public static SubLObject reset_term_index(final SubLObject v_term, final SubLObject index) {
        if (NIL != forts.fort_p(v_term)) {
            forts.reset_fort_index(v_term, index);
        } else
            if (NIL == hlmt.hlmt_p(v_term)) {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    assertions_low.reset_assertion_index(v_term, index);
                } else
                    if (NIL != indexed_unrepresented_term_p(v_term)) {
                        unrepresented_terms.reset_unrepresented_term_index(v_term, index, T);
                    } else
                        if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                            auxiliary_indexing.reset_auxiliary_index(v_term, index);
                        } else {
                            Errors.error($str36$_S_is_not_indexed, v_term);
                        }


            }

        return v_term;
    }

    public static final SubLObject clear_term_index_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            forts.clear_fort_index(v_term);
        } else {
            if (NIL != hlmt.hlmt_p(v_term)) {
            } else {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    assertions_low.clear_assertion_index(v_term);
                } else {
                    if (NIL != indexed_unrepresented_term_p(v_term)) {
                        unrepresented_terms.clear_unrepresented_term_index(v_term);
                    } else {
                        if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                            auxiliary_indexing.clear_auxiliary_index(v_term);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject clear_term_index(final SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            forts.clear_fort_index(v_term);
        } else
            if (NIL == hlmt.hlmt_p(v_term)) {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    assertions_low.clear_assertion_index(v_term);
                } else
                    if (NIL != indexed_unrepresented_term_p(v_term)) {
                        unrepresented_terms.clear_unrepresented_term_index(v_term);
                    } else
                        if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                            auxiliary_indexing.clear_auxiliary_index(v_term);
                        }


            }

        return NIL;
    }

    /**
     * Frees all resources consumed by INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by INDEX")
    public static final SubLObject free_index_alt(SubLObject index) {
        if (NIL != simple_index_p(index)) {
            return free_simple_index(index);
        } else {
            if (NIL != complex_index_p(index)) {
                return free_complex_index(index);
            }
        }
        return NIL;
    }

    /**
     * Frees all resources consumed by INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by INDEX")
    public static SubLObject free_index(final SubLObject index) {
        if (NIL != simple_index_p(index)) {
            return free_simple_index(index);
        }
        if (NIL != complex_index_p(index)) {
            return free_complex_index(index);
        }
        return NIL;
    }

    /**
     * Frees all resources consumed by the index for TERM
     */
    @LispMethod(comment = "Frees all resources consumed by the index for TERM")
    public static final SubLObject free_term_index_alt(SubLObject v_term) {
        free_index(term_index(v_term));
        reset_term_index(v_term, new_simple_index());
        return v_term;
    }

    /**
     * Frees all resources consumed by the index for TERM
     */
    @LispMethod(comment = "Frees all resources consumed by the index for TERM")
    public static SubLObject free_term_index(final SubLObject v_term) {
        free_index(term_index(v_term));
        reset_term_index(v_term, new_simple_index());
        return v_term;
    }

    /**
     * Return T iff OBJECT is a simple index.
     */
    @LispMethod(comment = "Return T iff OBJECT is a simple index.")
    public static final SubLObject simple_index_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL == complex_index_p(v_object)));
    }

    /**
     * Return T iff OBJECT is a simple index.
     */
    @LispMethod(comment = "Return T iff OBJECT is a simple index.")
    public static SubLObject simple_index_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL == complex_index_p(v_object)));
    }

    public static final SubLObject simple_index_installed_p_alt(SubLObject v_object) {
        return simple_index_p(v_object);
    }

    public static SubLObject simple_index_installed_p(final SubLObject v_object) {
        return simple_index_p(v_object);
    }

    public static final SubLObject simple_index_not_hosed_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != simple_index_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(INDEXING_LEAF_INSTALLED_P), v_object, UNPROVIDED)));
    }

    public static SubLObject simple_index_not_hosed_p(final SubLObject v_object) {
        return makeBoolean((NIL != simple_index_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(INDEXING_LEAF_INSTALLED_P), v_object, UNPROVIDED)));
    }

    public static final SubLObject simple_indexed_term_p_alt(SubLObject v_term) {
        return simple_index_p(term_index(v_term));
    }

    public static SubLObject simple_indexed_term_p(final SubLObject v_term) {
        return simple_index_p(term_index(v_term));
    }

    /**
     * Returns a new empty simple index.
     */
    @LispMethod(comment = "Returns a new empty simple index.")
    public static final SubLObject new_simple_index_alt() {
        return NIL;
    }

    /**
     * Returns a new empty simple index.
     */
    @LispMethod(comment = "Returns a new empty simple index.")
    public static SubLObject new_simple_index() {
        return NIL;
    }

    public static final SubLObject simple_index_leaves_alt(SubLObject simple_index) {
        return simple_index;
    }

    public static SubLObject simple_index_leaves(final SubLObject simple_index) {
        return simple_index;
    }

    public static final SubLObject simple_index_leaf_count_alt(SubLObject simple_index) {
        return length(simple_index);
    }

    public static SubLObject simple_index_leaf_count(final SubLObject simple_index) {
        return length(simple_index);
    }

    public static final SubLObject simple_index_memberP_alt(SubLObject simple_index, SubLObject leaf) {
        return memberP(leaf, simple_index, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject simple_index_memberP(final SubLObject simple_index, final SubLObject leaf) {
        return subl_promotions.memberP(leaf, simple_index, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject simple_num_index_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, SIMPLE_INDEXED_TERM_P);
        return length(term_index(v_term));
    }

    public static SubLObject simple_num_index(final SubLObject v_term) {
        assert NIL != simple_indexed_term_p(v_term) : "! kb_indexing_datastructures.simple_indexed_term_p(v_term) " + ("kb_indexing_datastructures.simple_indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term) ") + v_term;
        return simple_index_leaf_count(term_index(v_term));
    }

    /**
     *
     *
     * @return listp; the list of all assertions referencing TERM.
     * @unknown result is NOT destructible!
     */
    @LispMethod(comment = "@return listp; the list of all assertions referencing TERM.\r\n@unknown result is NOT destructible!")
    public static final SubLObject simple_term_assertion_list_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, SIMPLE_INDEXED_TERM_P);
        return term_index(v_term);
    }

    /**
     *
     *
     * @return listp; the list of all assertions referencing TERM.
     * @unknown result is NOT destructible!
     */
    @LispMethod(comment = "@return listp; the list of all assertions referencing TERM.\r\n@unknown result is NOT destructible!")
    public static SubLObject simple_term_assertion_list(final SubLObject v_term) {
        assert NIL != simple_indexed_term_p(v_term) : "! kb_indexing_datastructures.simple_indexed_term_p(v_term) " + ("kb_indexing_datastructures.simple_indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term) ") + v_term;
        return simple_index_leaves(term_index(v_term));
    }

    public static final SubLObject do_simple_index_term_assertion_list_alt(SubLObject v_term) {
        return simple_term_assertion_list(v_term);
    }

    public static SubLObject do_simple_index_term_assertion_list(final SubLObject v_term) {
        return simple_term_assertion_list(v_term);
    }

    public static final SubLObject reset_term_simple_index_alt(SubLObject v_term, SubLObject simple_index) {
        SubLTrampolineFile.checkType(simple_index, SIMPLE_INDEX_P);
        return reset_term_index(v_term, simple_index);
    }

    public static SubLObject reset_term_simple_index(final SubLObject v_term, final SubLObject simple_index) {
        assert NIL != simple_index_p(simple_index) : "! kb_indexing_datastructures.simple_index_p(simple_index) " + ("kb_indexing_datastructures.simple_index_p(simple_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.simple_index_p(simple_index) ") + simple_index;
        return reset_term_index(v_term, simple_index);
    }

    public static final SubLObject simple_index_insert_alt(SubLObject simple_index, SubLObject leaf) {
        if (NIL != simple_index_memberP(simple_index, leaf)) {
            return simple_index;
        } else {
            return cons(leaf, simple_index);
        }
    }

    public static SubLObject simple_index_insert(final SubLObject simple_index, final SubLObject leaf) {
        if (NIL != simple_index_memberP(simple_index, leaf)) {
            return simple_index;
        }
        return cons(leaf, simple_index);
    }

    public static final SubLObject simple_index_delete_alt(SubLObject simple_index, SubLObject leaf) {
        if (NIL != simple_index_memberP(simple_index, leaf)) {
            return list_utilities.delete_first(leaf, simple_index, UNPROVIDED);
        } else {
            return simple_index;
        }
    }

    public static SubLObject simple_index_delete(final SubLObject simple_index, final SubLObject leaf) {
        if (NIL != simple_index_memberP(simple_index, leaf)) {
            return list_utilities.delete_first(leaf, simple_index, UNPROVIDED);
        }
        return simple_index;
    }

    /**
     * Frees all resources consumed by SIMPLE-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by SIMPLE-INDEX")
    public static final SubLObject free_simple_index_alt(SubLObject simple_index) {
        return simple_index;
    }

    /**
     * Frees all resources consumed by SIMPLE-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by SIMPLE-INDEX")
    public static SubLObject free_simple_index(final SubLObject simple_index) {
        return simple_index;
    }

    public static SubLObject with_current_complex_index_path(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_term = NIL;
        SubLObject keys = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        keys = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($current_complex_index_term$, v_term), list($current_complex_index_keys$, keys)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list42);
        return NIL;
    }

    public static SubLObject current_complex_index_keys() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_complex_index_keys$.getDynamicValue(thread);
    }

    public static SubLObject copy_current_complex_index_keys() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $current_complex_index_keys_in_orderP$.getDynamicValue(thread)) {
            return copy_list($current_complex_index_keys$.getDynamicValue(thread));
        }
        return reverse($current_complex_index_keys$.getDynamicValue(thread));
    }

    public static SubLObject current_complex_index_term() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_complex_index_term$.getDynamicValue(thread);
    }

    public static SubLObject complex_index_keys_defined_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return consp($current_complex_index_keys$.getDynamicValue(thread));
    }

    public static final SubLObject complex_index_p_alt(SubLObject v_object) {
        return subindex_p(v_object);
    }

    public static SubLObject complex_index_p(final SubLObject v_object) {
        return subindex_p(v_object);
    }

    public static final SubLObject complex_index_installed_p_alt(SubLObject v_object) {
        return subindex_installed_p(v_object);
    }

    public static SubLObject complex_index_installed_p(final SubLObject v_object) {
        return subindex_installed_p(v_object);
    }

    public static final SubLObject complex_index_not_hosed_p_alt(SubLObject v_object) {
        return subindex_not_hosed_p(v_object);
    }

    public static SubLObject complex_index_not_hosed_p(final SubLObject v_object) {
        return subindex_not_hosed_p(v_object);
    }

    public static final SubLObject complex_indexed_term_p_alt(SubLObject v_term) {
        return complex_index_p(term_index(v_term));
    }

    public static SubLObject complex_indexed_term_p(final SubLObject v_term) {
        return complex_index_p(term_index(v_term));
    }

    public static final SubLObject complex_index_leaves_alt(SubLObject complex_index) {
        return subindex_leaves(complex_index);
    }

    public static SubLObject complex_index_leaves(final SubLObject complex_index) {
        return subindex_leaves(complex_index);
    }

    public static final SubLObject complex_index_leaf_count_alt(SubLObject complex_index) {
        return subindex_leaf_count(complex_index);
    }

    public static SubLObject complex_index_leaf_count(final SubLObject complex_index) {
        return subindex_leaf_count(complex_index);
    }

    /**
     *
     *
     * @return nil or subindex-p or indexing-leaf-p
     */
    @LispMethod(comment = "@return nil or subindex-p or indexing-leaf-p")
    public static final SubLObject complex_index_lookup_alt(SubLObject complex_index, SubLObject key) {
        return subindex_lookup(complex_index, key);
    }

    /**
     *
     *
     * @return nil or subindex-p or indexing-leaf-p
     */
    @LispMethod(comment = "@return nil or subindex-p or indexing-leaf-p")
    public static SubLObject complex_index_lookup(final SubLObject complex_index, final SubLObject key) {
        return subindex_lookup(complex_index, key);
    }

    /**
     *
     *
     * @return nil or subindex-p
     */
    @LispMethod(comment = "@return nil or subindex-p")
    public static final SubLObject term_complex_index_lookup_alt(SubLObject v_term, SubLObject key) {
        {
            SubLObject index = term_index(v_term);
            if (NIL == index) {
                return NIL;
            }
            SubLTrampolineFile.checkType(index, COMPLEX_INDEX_P);
            return complex_index_lookup(index, key);
        }
    }

    /**
     *
     *
     * @return nil or subindex-p
     */
    @LispMethod(comment = "@return nil or subindex-p")
    public static SubLObject term_complex_index_lookup(final SubLObject v_term, final SubLObject key) {
        final SubLObject index = term_index(v_term);
        if (NIL == index) {
            return NIL;
        }
        assert NIL != complex_index_p(index) : "! kb_indexing_datastructures.complex_index_p(index) " + ("kb_indexing_datastructures.complex_index_p(index) " + "CommonSymbols.NIL != kb_indexing_datastructures.complex_index_p(index) ") + index;
        return complex_index_lookup(index, key);
    }

    /**
     * Initializes a complex index for TERM.  Clobbers any existing
     * indexing for TERM.
     */
    @LispMethod(comment = "Initializes a complex index for TERM.  Clobbers any existing\r\nindexing for TERM.\nInitializes a complex index for TERM.  Clobbers any existing\nindexing for TERM.")
    public static final SubLObject initialize_term_complex_index_alt(SubLObject v_term) {
        return initialize_term_subindex(v_term);
    }

    /**
     * Initializes a complex index for TERM.  Clobbers any existing
     * indexing for TERM.
     */
    @LispMethod(comment = "Initializes a complex index for TERM.  Clobbers any existing\r\nindexing for TERM.\nInitializes a complex index for TERM.  Clobbers any existing\nindexing for TERM.")
    public static SubLObject initialize_term_complex_index(final SubLObject v_term) {
        return initialize_term_subindex(v_term);
    }

    public static SubLObject merge_complex_indices(final SubLObject complex_base, final SubLObject complex_augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $current_complex_index_keys$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_complex_index_keys_in_orderP$.currentBinding(thread);
        try {
            $current_complex_index_keys$.bind(NIL, thread);
            $current_complex_index_keys_in_orderP$.bind(NIL, thread);
            return merge_sub_indices(complex_base, complex_augment);
        } finally {
            $current_complex_index_keys_in_orderP$.rebind(_prev_bind_2, thread);
            $current_complex_index_keys$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject term_complex_index_set_alt(SubLObject v_term, SubLObject key, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == value) || (NIL != subindex_p(value)))) {
                    Errors.error($str_alt22$_s_is_not_a_SUBINDEX_P, value);
                }
            }
            {
                SubLObject index = term_index(v_term);
                if (NIL != value) {
                    SubLTrampolineFile.checkType(index, INTERMEDIATE_INDEX_P);
                }
                if (NIL != index) {
                    intermediate_index_set(index, key, value);
                }
            }
            return value;
        }
    }

    public static SubLObject term_complex_index_set(final SubLObject v_term, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != value)) && (NIL == subindex_p(value))) {
            Errors.error($str47$_s_is_not_a_SUBINDEX_P, value);
        }
        final SubLObject index = term_index(v_term);
        if (((NIL != value) && (!assertionsDisabledSynth)) && (NIL == intermediate_index_p(index))) {
            throw new AssertionError(index);
        }
        if (NIL != index) {
            intermediate_index_set(index, key, value);
        }
        return value;
    }

    /**
     * Delete any mapping from KEY to a subindex in the complex index for TERM
     */
    @LispMethod(comment = "Delete any mapping from KEY to a subindex in the complex index for TERM")
    public static final SubLObject term_complex_index_delete_key_alt(SubLObject v_term, SubLObject key) {
        {
            SubLObject index = term_index(v_term);
            if (NIL != index) {
                intermediate_index_delete_key(index, key);
            }
        }
        return v_term;
    }

    /**
     * Delete any mapping from KEY to a subindex in the complex index for TERM
     */
    @LispMethod(comment = "Delete any mapping from KEY to a subindex in the complex index for TERM")
    public static SubLObject term_complex_index_delete_key(final SubLObject v_term, final SubLObject key) {
        final SubLObject index = term_index(v_term);
        if (NIL != index) {
            intermediate_index_delete_key(index, key);
        }
        return v_term;
    }

    public static SubLObject reserve_final_topn_index_for_term(final SubLObject v_term, final SubLObject keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = term_index(v_term);
        final SubLObject key_count = length(keys);
        SubLObject key_history = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == complex_index_p(index))) {
            Errors.error($str49$Cannot_reserve_a_TOP_N_index_for_, v_term);
        }
        SubLObject list_var = NIL;
        SubLObject key = NIL;
        SubLObject key_number = NIL;
        list_var = keys;
        key = list_var.first();
        for (key_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , key = list_var.first() , key_number = add(ONE_INTEGER, key_number)) {
            key_history = nconc(key_history, list(key));
            if (add(ONE_INTEGER, key_number).numL(key_count)) {
                index = intermediate_index_lookup_or_create_intermediate(index, key, key_history);
            } else {
                intermediate_index_set(index, key, new_final_topn_index(v_term, keys, ZERO_INTEGER));
            }
        }
        return v_term;
    }

    /**
     * Frees all resources consumed by COMPLEX-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by COMPLEX-INDEX")
    public static final SubLObject free_complex_index_alt(SubLObject complex_index) {
        return free_subindex(complex_index);
    }

    /**
     * Frees all resources consumed by COMPLEX-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by COMPLEX-INDEX")
    public static SubLObject free_complex_index(final SubLObject complex_index) {
        return free_subindex(complex_index);
    }

    public static final SubLObject subindex_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != intermediate_index_p(v_object)) || (NIL != final_index_p(v_object)));
    }

    public static SubLObject subindex_p(final SubLObject v_object) {
        return makeBoolean((NIL != intermediate_index_p(v_object)) || (NIL != final_index_p(v_object)));
    }

    public static final SubLObject subindex_installed_p_alt(SubLObject v_object) {
        if (NIL != intermediate_index_p(v_object)) {
            return intermediate_index_installed_p(v_object);
        } else {
            if (NIL != final_index_p(v_object)) {
                return final_index_installed_p(v_object);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject subindex_installed_p(final SubLObject v_object) {
        if (NIL != intermediate_index_p(v_object)) {
            return intermediate_index_installed_p(v_object);
        }
        if (NIL != final_index_p(v_object)) {
            return final_index_installed_p(v_object);
        }
        return NIL;
    }

    public static final SubLObject subindex_not_hosed_p_alt(SubLObject v_object) {
        if (NIL != intermediate_index_p(v_object)) {
            return intermediate_index_not_hosed_p(v_object);
        } else {
            if (NIL != final_index_p(v_object)) {
                return final_index_not_hosed_p(v_object);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject subindex_not_hosed_p(final SubLObject v_object) {
        if (NIL != intermediate_index_p(v_object)) {
            return intermediate_index_not_hosed_p(v_object);
        }
        if (NIL != final_index_p(v_object)) {
            return final_index_not_hosed_p(v_object);
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or subindex-p or indexing-leaf-p
     */
    @LispMethod(comment = "@return nil or subindex-p or indexing-leaf-p")
    public static final SubLObject subindex_lookup_alt(SubLObject subindex, SubLObject key) {
        if (NIL != intermediate_index_p(subindex)) {
            return intermediate_index_lookup(subindex, key);
        } else {
            if (NIL != final_index_memberP(subindex, key)) {
                return key;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return nil or subindex-p or indexing-leaf-p
     */
    @LispMethod(comment = "@return nil or subindex-p or indexing-leaf-p")
    public static SubLObject subindex_lookup(final SubLObject subindex, final SubLObject key) {
        if (NIL != intermediate_index_p(subindex)) {
            return intermediate_index_lookup(subindex, key);
        }
        if (NIL != final_index_memberP(subindex, key)) {
            return key;
        }
        return NIL;
    }

    /**
     * gathers up all leaves under SUBINDEX
     */
    @LispMethod(comment = "gathers up all leaves under SUBINDEX")
    public static final SubLObject subindex_leaves_alt(SubLObject subindex) {
        if (NIL != intermediate_index_p(subindex)) {
            return intermediate_index_leaves(subindex);
        } else {
            return final_index_leaves(subindex);
        }
    }

    /**
     * gathers up all leaves under SUBINDEX
     */
    @LispMethod(comment = "gathers up all leaves under SUBINDEX")
    public static SubLObject subindex_leaves(final SubLObject subindex) {
        if (NIL != intermediate_index_p(subindex)) {
            return intermediate_index_leaves(subindex);
        }
        return final_index_leaves(subindex);
    }

    /**
     *
     *
     * @return integerp; the number of indexing leaves anywhere below SUBINDEX
     */
    @LispMethod(comment = "@return integerp; the number of indexing leaves anywhere below SUBINDEX")
    public static final SubLObject subindex_leaf_count_alt(SubLObject subindex) {
        if (NIL != intermediate_index_p(subindex)) {
            return intermediate_index_leaf_count(subindex);
        } else {
            return final_index_leaf_count(subindex);
        }
    }

    /**
     *
     *
     * @return integerp; the number of indexing leaves anywhere below SUBINDEX
     */
    @LispMethod(comment = "@return integerp; the number of indexing leaves anywhere below SUBINDEX")
    public static SubLObject subindex_leaf_count(final SubLObject subindex) {
        if (NIL != intermediate_index_p(subindex)) {
            return intermediate_index_leaf_count(subindex);
        }
        return final_index_leaf_count(subindex);
    }

    /**
     * Initializes a subindex for TERM.  Clobbers any existing
     * indexing for TERM.
     */
    @LispMethod(comment = "Initializes a subindex for TERM.  Clobbers any existing\r\nindexing for TERM.\nInitializes a subindex for TERM.  Clobbers any existing\nindexing for TERM.")
    public static final SubLObject initialize_term_subindex_alt(SubLObject v_term) {
        return initialize_term_intermediate_index(v_term);
    }

    /**
     * Initializes a subindex for TERM.  Clobbers any existing
     * indexing for TERM.
     */
    @LispMethod(comment = "Initializes a subindex for TERM.  Clobbers any existing\r\nindexing for TERM.\nInitializes a subindex for TERM.  Clobbers any existing\nindexing for TERM.")
    public static SubLObject initialize_term_subindex(final SubLObject v_term) {
        return initialize_term_intermediate_index(v_term);
    }

    /**
     * Frees all resources consumed by SUBINDEX
     */
    @LispMethod(comment = "Frees all resources consumed by SUBINDEX")
    public static final SubLObject free_subindex_alt(SubLObject subindex) {
        if (NIL != intermediate_index_p(subindex)) {
            return free_intermediate_index(subindex);
        } else {
            if (NIL != final_index_p(subindex)) {
                return free_final_index(subindex);
            }
        }
        return NIL;
    }

    /**
     * Frees all resources consumed by SUBINDEX
     */
    @LispMethod(comment = "Frees all resources consumed by SUBINDEX")
    public static SubLObject free_subindex(final SubLObject subindex) {
        if (NIL != intermediate_index_p(subindex)) {
            return free_intermediate_index(subindex);
        }
        if (NIL != final_index_p(subindex)) {
            return free_final_index(subindex);
        }
        return NIL;
    }

    public static SubLObject merge_sub_indices(final SubLObject subindex_base, final SubLObject subindex_augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != intermediate_index_p(subindex_base)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == intermediate_index_p(subindex_augment))) {
                Errors.error($str50$Cannot_merge__A_onto__A__incommen, subindex_augment, subindex_base);
            }
            return merge_intermediate_indices(subindex_base, subindex_augment);
        }
        if (NIL != final_index_p(subindex_base)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == final_index_p(subindex_augment))) {
                Errors.error($str50$Cannot_merge__A_onto__A__incommen, subindex_augment, subindex_base);
            }
            return merge_final_indices(subindex_base, subindex_augment);
        }
        return Errors.error($str51$Dont_know_how_to_merge_sub_index_, subindex_base, subindex_augment);
    }

    public static final SubLObject intermediate_index_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().isInteger()) && (NIL != dictionary.dictionary_p(v_object.rest())));
    }

    public static SubLObject intermediate_index_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().isInteger()) && (NIL != map_utilities.map_p(v_object.rest())));
    }

    public static final SubLObject intermediate_index_installed_p_alt(SubLObject v_object) {
        if (NIL == intermediate_index_p(v_object)) {
            return NIL;
        } else {
            return T;
        }
    }

    public static SubLObject intermediate_index_installed_p(final SubLObject v_object) {
        if (NIL == intermediate_index_p(v_object)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject intermediate_index_not_hosed_p_alt(SubLObject v_object) {
        if (NIL == intermediate_index_p(v_object)) {
            return NIL;
        } else {
            return T;
        }
    }

    public static SubLObject intermediate_index_not_hosed_p(final SubLObject v_object) {
        if (NIL == intermediate_index_p(v_object)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject new_intermediate_index_alt(SubLObject test_function) {
        return cons(ZERO_INTEGER, dictionary.new_dictionary(test_function, UNPROVIDED));
    }

    public static SubLObject new_intermediate_index(final SubLObject test_function) {
        return cons(ZERO_INTEGER, dictionary.new_dictionary(test_function, UNPROVIDED));
    }

    public static SubLObject clone_intermediate_index(final SubLObject intermediate_index) {
        final SubLObject index_test = map_utilities.map_test(intermediate_index_map(intermediate_index));
        return cons(intermediate_index_leaf_count(intermediate_index), dictionary.new_dictionary(index_test, UNPROVIDED));
    }

    /**
     * This is robust against being passed NIL for the intermediate index
     */
    @LispMethod(comment = "This is robust against being passed NIL for the intermediate index")
    public static final SubLObject do_intermediate_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key_var = NIL;
                    SubLObject subindex_var = NIL;
                    SubLObject intermediate_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    key_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    subindex_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    intermediate_index = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt24);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt24);
                            if (NIL == member(current_1, $list_alt25, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt24);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject index = $sym28$INDEX;
                                return list(CLET, list(list(index, intermediate_index)), list(PWHEN, list(DO_INTERMEDIATE_INDEX_VALID_INDEX_P, index), listS(DO_DICTIONARY, list(key_var, subindex_var, list(INTERMEDIATE_INDEX_DICTIONARY, index), done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This is robust against being passed NIL for the intermediate index
     */
    @LispMethod(comment = "This is robust against being passed NIL for the intermediate index")
    public static SubLObject do_intermediate_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list52);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = NIL;
        SubLObject subindex_var = NIL;
        SubLObject intermediate_index = NIL;
        destructuring_bind_must_consp(current, datum, $list52);
        key_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list52);
        subindex_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list52);
        intermediate_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list52);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list52);
            if (NIL == member(current_$2, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list52);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject index = $sym54$INDEX;
        return list(CLET, list(list(index, intermediate_index)), list(PWHEN, list(DO_INTERMEDIATE_INDEX_VALID_INDEX_P, index), listS(DO_MAP, list(key_var, subindex_var, list(INTERMEDIATE_INDEX_MAP, index), $DONE, done), append(body, NIL))));
    }

    public static final SubLObject do_intermediate_index_valid_index_p_alt(SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    public static SubLObject do_intermediate_index_valid_index_p(final SubLObject v_object) {
        return makeBoolean(NIL != v_object);
    }

    public static SubLObject capture_changed_index_entry_hints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        v_set = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($changed_index_entry_hints$, v_set)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject do_changed_intermediate_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = NIL;
        SubLObject subindex_var = NIL;
        SubLObject intermediate_index = NIL;
        SubLObject unchanged_part = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        key_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        subindex_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        intermediate_index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        unchanged_part = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list62);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list62);
            if (NIL == member(current_$3, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list62);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject index = $sym63$INDEX;
        final SubLObject key_set = $sym64$KEY_SET;
        return list(CLET, list(list(index, intermediate_index)), list(PWHEN, list(DO_INTERMEDIATE_INDEX_VALID_INDEX_P, index), list(CLET, list(key_set), list(CMULTIPLE_VALUE_SETQ, list(key_set, unchanged_part), list(SEGREGATE_INDEX_CHANGES_AND_PRISTINES, index)), list(CSOME, list(key_var, key_set, done), listS(CLET, list(list(subindex_var, list(INTERMEDIATE_INDEX_LOOKUP, index, key_var))), append(body, NIL))))));
    }

    public static SubLObject segregate_index_changes_and_pristines(final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unchanged_index = clone_intermediate_index(index);
        thread.resetMultipleValues();
        final SubLObject key_set = map_utilities.map_change_set(intermediate_index_map(index), intermediate_index_map(unchanged_index));
        final SubLObject delete_hints = thread.secondMultipleValue();
        final SubLObject edit_hints = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != set.set_p($changed_index_entry_hints$.getDynamicValue(thread))) {
            set_utilities.set_add_all(delete_hints, $changed_index_entry_hints$.getDynamicValue(thread));
            set_utilities.set_add_all(edit_hints, $changed_index_entry_hints$.getDynamicValue(thread));
        }
        return values(key_set, unchanged_index);
    }

    /**
     *
     *
     * @return nil or subindex-p
     */
    @LispMethod(comment = "@return nil or subindex-p")
    public static final SubLObject intermediate_index_lookup_alt(SubLObject intermediate_index, SubLObject key) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        {
            SubLObject dict = intermediate_index_dictionary(intermediate_index);
            return dictionary.dictionary_lookup_without_values(dict, key, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return nil or subindex-p
     */
    @LispMethod(comment = "@return nil or subindex-p")
    public static SubLObject intermediate_index_lookup(final SubLObject intermediate_index, final SubLObject key) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        final SubLObject map = intermediate_index_map(intermediate_index);
        return map_utilities.map_get_without_values(map, key, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of keys for INTERMEDIATE-INDEX
     */
    @LispMethod(comment = "@return listp; a list of keys for INTERMEDIATE-INDEX")
    public static final SubLObject intermediate_index_keys_alt(SubLObject intermediate_index) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        return dictionary.dictionary_keys(intermediate_index_dictionary(intermediate_index));
    }

    /**
     *
     *
     * @return listp; a list of keys for INTERMEDIATE-INDEX
     */
    @LispMethod(comment = "@return listp; a list of keys for INTERMEDIATE-INDEX")
    public static SubLObject intermediate_index_keys(final SubLObject intermediate_index) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        return map_utilities.map_keys(intermediate_index_map(intermediate_index));
    }

    /**
     *
     *
     * @return integerp; the number of indexing leaves anywhere below INTERMEDIATE-INDEX
     */
    @LispMethod(comment = "@return integerp; the number of indexing leaves anywhere below INTERMEDIATE-INDEX")
    public static final SubLObject intermediate_index_leaf_count_alt(SubLObject intermediate_index) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        return intermediate_index.first();
    }

    /**
     *
     *
     * @return integerp; the number of indexing leaves anywhere below INTERMEDIATE-INDEX
     */
    @LispMethod(comment = "@return integerp; the number of indexing leaves anywhere below INTERMEDIATE-INDEX")
    public static SubLObject intermediate_index_leaf_count(final SubLObject intermediate_index) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        return intermediate_index.first();
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static final SubLObject intermediate_index_leaves_alt(SubLObject intermediate_index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
            {
                SubLObject leaves = NIL;
                SubLObject index = intermediate_index;
                if (NIL != do_intermediate_index_valid_index_p(index)) {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(intermediate_index_dictionary(index)));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject subindex = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject cdolist_list_var = subindex_leaves(subindex);
                                    SubLObject leaf = NIL;
                                    for (leaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , leaf = cdolist_list_var.first()) {
                                        leaves = cons(leaf, leaves);
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return nreverse(leaves);
            }
        }
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static SubLObject intermediate_index_leaves(final SubLObject intermediate_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        SubLObject leaves = NIL;
        if (NIL != do_intermediate_index_valid_index_p(intermediate_index)) {
            final SubLObject iterator = map_utilities.new_map_iterator(intermediate_index_map(intermediate_index));
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject subindex = NIL;
                    destructuring_bind_must_consp(current, datum, $list70);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list70);
                    subindex = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject cdolist_list_var = subindex_leaves(subindex);
                        SubLObject leaf = NIL;
                        leaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            leaves = cons(leaf, leaves);
                            cdolist_list_var = cdolist_list_var.rest();
                            leaf = cdolist_list_var.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, $list70);
                    }
                }
            }
        }
        return nreverse(leaves);
    }

    /**
     * does not reset the counts
     */
    @LispMethod(comment = "does not reset the counts")
    public static final SubLObject intermediate_index_set_alt(SubLObject intermediate_index, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(value, SUBINDEX_P);
        intermediate_index_dictionary_set(intermediate_index, key, value);
        return intermediate_index;
    }

    /**
     * does not reset the counts
     */
    @LispMethod(comment = "does not reset the counts")
    public static SubLObject intermediate_index_set(final SubLObject intermediate_index, final SubLObject key, final SubLObject value) {
        assert NIL != subindex_p(value) : "! kb_indexing_datastructures.subindex_p(value) " + ("kb_indexing_datastructures.subindex_p(value) " + "CommonSymbols.NIL != kb_indexing_datastructures.subindex_p(value) ") + value;
        intermediate_index_map_set(intermediate_index, key, value);
        return intermediate_index;
    }

    public static SubLObject intermediate_index_replace_map(final SubLObject intermediate_index, final SubLObject new_map) {
        rplacd(intermediate_index, new_map);
        return intermediate_index;
    }

    public static SubLObject intermediate_index_touch(final SubLObject intermediate_index, final SubLObject key) {
        return intermediate_index_map_touch(intermediate_index, key);
    }

    public static SubLObject use_final_topn_indicesP() {
        return subl_promotions.non_negative_integer_p($final_topn_index_cutoff_size$.getGlobalValue());
    }

    public static SubLObject upgrade_final_indexP(final SubLObject subindex) {
        if (NIL != final_topn_index_p(subindex)) {
            return NIL;
        }
        return makeBoolean((NIL != use_final_topn_indicesP()) && $final_topn_index_cutoff_size$.getGlobalValue().numL(final_index_leaf_count(subindex)));
    }

    public static SubLObject upgrade_combined_indices_to_final_indexP(final SubLObject subindex_base, final SubLObject subindex_augment) {
        if ((NIL != final_topn_index_p(subindex_base)) || (NIL != final_topn_index_p(subindex_augment))) {
            return NIL;
        }
        return makeBoolean((NIL != use_final_topn_indicesP()) && $final_topn_index_cutoff_size$.getGlobalValue().numL(add(final_index_leaf_count(subindex_base), final_index_leaf_count(subindex_augment))));
    }

    public static final SubLFloat $float$0_015 = makeDouble(0.015);

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("implies"), reader_make_constant_shell("and"), reader_make_constant_shell("or"), reader_make_constant_shell("not"));

    /**
     *
     *
     * @return boolean; whether it actually inserted (nil if it was already there)
     */
    @LispMethod(comment = "@return boolean; whether it actually inserted (nil if it was already there)")
    public static final SubLObject intermediate_index_insert_alt(SubLObject intermediate_index, SubLObject keys, SubLObject leaf) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        return intermediate_index_insert_int(intermediate_index, keys, leaf, NIL);
    }

    /**
     *
     *
     * @return boolean; whether it actually inserted (nil if it was already there)
     */
    @LispMethod(comment = "@return boolean; whether it actually inserted (nil if it was already there)")
    public static SubLObject intermediate_index_insert(final SubLObject intermediate_index, final SubLObject keys, final SubLObject leaf) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        return intermediate_index_insert_int(intermediate_index, keys, leaf, NIL);
    }

    static private final SubLList $list_alt5 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt6$Returns_T_iff_OBJECT_is_an_indexe = makeString("Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.");

    static private final SubLList $list_alt7 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt8 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc indexed terms"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * Insert LEAF at KEYS, having already gone down the keys in KEY-HISTORY
     */
    @LispMethod(comment = "Insert LEAF at KEYS, having already gone down the keys in KEY-HISTORY")
    public static final SubLObject intermediate_index_insert_int_alt(SubLObject intermediate_index, SubLObject keys, SubLObject leaf, SubLObject key_history) {
        {
            SubLObject datum = keys;
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject rest_keys = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            key = current.first();
            current = current.rest();
            rest_keys = current;
            if (NIL != rest_keys) {
                {
                    SubLObject new_key_history = nconc(key_history, list(key));
                    SubLObject subindex = intermediate_index_lookup_or_create_intermediate(intermediate_index, key, new_key_history);
                    if (NIL != intermediate_index_insert_int(subindex, rest_keys, leaf, new_key_history)) {
                        intermediate_index_leaf_count_inc(intermediate_index, ONE_INTEGER);
                        return T;
                    }
                }
            } else {
                {
                    SubLObject subindex = intermediate_index_lookup_or_create_final(intermediate_index, key);
                    SubLTrampolineFile.checkType(subindex, FINAL_INDEX_P);
                    {
                        SubLObject old_count = final_index_leaf_count(subindex);
                        final_index_insert(subindex, leaf);
                        {
                            SubLObject new_count = final_index_leaf_count(subindex);
                            if (!old_count.numE(new_count)) {
                                intermediate_index_leaf_count_inc(intermediate_index, ONE_INTEGER);
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Insert LEAF at KEYS, having already gone down the keys in KEY-HISTORY
     */
    @LispMethod(comment = "Insert LEAF at KEYS, having already gone down the keys in KEY-HISTORY")
    public static SubLObject intermediate_index_insert_int(final SubLObject intermediate_index, final SubLObject keys, final SubLObject leaf, final SubLObject key_history) {
        SubLObject key = NIL;
        SubLObject rest_keys = NIL;
        destructuring_bind_must_consp(keys, keys, $list73);
        key = keys.first();
        final SubLObject current = rest_keys = keys.rest();
        if (NIL != rest_keys) {
            final SubLObject new_key_history = nconc(key_history, list(key));
            final SubLObject subindex = intermediate_index_lookup_or_create_intermediate(intermediate_index, key, new_key_history);
            if (NIL != intermediate_index_insert_int(subindex, rest_keys, leaf, new_key_history)) {
                intermediate_index_touch(intermediate_index, key);
                intermediate_index_leaf_count_inc(intermediate_index, ONE_INTEGER);
                return T;
            }
        } else {
            SubLObject subindex2 = intermediate_index_lookup_or_create_final(intermediate_index, key);
            if (NIL != upgrade_final_indexP(subindex2)) {
                subindex2 = upgrade_final_index(subindex2);
                intermediate_index_set(intermediate_index, key, subindex2);
            }
            final SubLObject old_count = final_index_leaf_count(subindex2);
            final_index_insert(subindex2, leaf);
            final SubLObject new_count = final_index_leaf_count(subindex2);
            if (!old_count.numE(new_count)) {
                intermediate_index_touch(intermediate_index, key);
                intermediate_index_leaf_count_inc(intermediate_index, ONE_INTEGER);
                return T;
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt15$_S_is_not_indexed = makeString("~S is not indexed");

    static private final SubLString $str_alt22$_s_is_not_a_SUBINDEX_P = makeString("~s is not a SUBINDEX-P");

    static private final SubLList $list_alt24 = list(list(makeSymbol("KEY-VAR"), makeSymbol("SUBINDEX-VAR"), makeSymbol("INTERMEDIATE-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt25 = list($DONE);

    /**
     *
     *
     * @return boolean; whether it actually deleted (nil if it was already gone)
     */
    @LispMethod(comment = "@return boolean; whether it actually deleted (nil if it was already gone)")
    public static final SubLObject intermediate_index_delete_alt(SubLObject intermediate_index, SubLObject keys, SubLObject leaf) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        {
            SubLObject datum = keys;
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject rest_keys = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            key = current.first();
            current = current.rest();
            rest_keys = current;
            {
                SubLObject result = NIL;
                SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
                if (NIL != subindex) {
                    if (NIL != rest_keys) {
                        result = intermediate_index_delete(subindex, rest_keys, leaf);
                        if (NIL != result) {
                            intermediate_index_leaf_count_inc(intermediate_index, MINUS_ONE_INTEGER);
                        }
                    } else {
                        SubLTrampolineFile.checkType(subindex, FINAL_INDEX_P);
                        {
                            SubLObject old_count = final_index_leaf_count(subindex);
                            final_index_delete(subindex, leaf);
                            {
                                SubLObject new_count = final_index_leaf_count(subindex);
                                if (!old_count.numE(new_count)) {
                                    intermediate_index_leaf_count_inc(intermediate_index, MINUS_ONE_INTEGER);
                                    result = T;
                                }
                            }
                        }
                    }
                    if (ZERO_INTEGER.numE(subindex_leaf_count(subindex))) {
                        intermediate_index_delete_key(intermediate_index, key);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return boolean; whether it actually deleted (nil if it was already gone)
     */
    @LispMethod(comment = "@return boolean; whether it actually deleted (nil if it was already gone)")
    public static SubLObject intermediate_index_delete(final SubLObject intermediate_index, final SubLObject keys, final SubLObject leaf) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        SubLObject key = NIL;
        SubLObject rest_keys = NIL;
        destructuring_bind_must_consp(keys, keys, $list73);
        key = keys.first();
        final SubLObject current = rest_keys = keys.rest();
        SubLObject result = NIL;
        final SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if (NIL != subindex) {
            if (NIL != rest_keys) {
                result = intermediate_index_delete(subindex, rest_keys, leaf);
                if (NIL != result) {
                    intermediate_index_touch(intermediate_index, key);
                    intermediate_index_leaf_count_inc(intermediate_index, MINUS_ONE_INTEGER);
                }
            } else {
                assert NIL != final_index_p(subindex) : "! kb_indexing_datastructures.final_index_p(subindex) " + ("kb_indexing_datastructures.final_index_p(subindex) " + "CommonSymbols.NIL != kb_indexing_datastructures.final_index_p(subindex) ") + subindex;
                final SubLObject old_count = final_index_leaf_count(subindex);
                final_index_delete(subindex, leaf);
                final SubLObject new_count = final_index_leaf_count(subindex);
                if (!old_count.numE(new_count)) {
                    intermediate_index_touch(intermediate_index, key);
                    intermediate_index_leaf_count_inc(intermediate_index, MINUS_ONE_INTEGER);
                    result = T;
                }
            }
            if (ZERO_INTEGER.numE(subindex_leaf_count(subindex))) {
                intermediate_index_delete_key(intermediate_index, key);
            }
        }
        return result;
    }

    static private final SubLSymbol $sym28$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol INTERMEDIATE_INDEX_DICTIONARY = makeSymbol("INTERMEDIATE-INDEX-DICTIONARY");

    static private final SubLList $list_alt36 = cons(makeSymbol("KEY"), makeSymbol("REST-KEYS"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("FINAL-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym39$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol DO_FINAL_INDEX_VALID_INDEX_P = makeSymbol("DO-FINAL-INDEX-VALID-INDEX-P");

    private static final SubLSymbol FINAL_INDEX_SET = makeSymbol("FINAL-INDEX-SET");

    private static final SubLSymbol DO_FINAL_INDEX = makeSymbol("DO-FINAL-INDEX");

    /**
     * Delete any mapping from KEY to a subindex in INTERMEDIATE-INDEX.
     */
    @LispMethod(comment = "Delete any mapping from KEY to a subindex in INTERMEDIATE-INDEX.")
    public static final SubLObject intermediate_index_delete_key_alt(SubLObject intermediate_index, SubLObject key) {
        intermediate_index_dictionary_delete_key(intermediate_index, key);
        return intermediate_index;
    }

    /**
     * Delete any mapping from KEY to a subindex in INTERMEDIATE-INDEX.
     */
    @LispMethod(comment = "Delete any mapping from KEY to a subindex in INTERMEDIATE-INDEX.")
    public static SubLObject intermediate_index_delete_key(final SubLObject intermediate_index, final SubLObject key) {
        intermediate_index_map_delete_key(intermediate_index, key);
        return intermediate_index;
    }

    public static SubLObject merge_intermediate_indices(final SubLObject base, final SubLObject augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_count = NIL;
        SubLObject base_map = NIL;
        destructuring_bind_must_consp(base, base, $list75);
        base_count = base.first();
        final SubLObject current = base_map = base.rest();
        SubLObject augment_count = NIL;
        SubLObject augment_map = NIL;
        destructuring_bind_must_consp(augment, augment, $list76);
        augment_count = augment.first();
        final SubLObject current_$5 = augment_map = augment.rest();
        final SubLObject iterator = map_utilities.new_map_iterator(augment_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current_$6;
                final SubLObject datum_$6 = current_$6 = var;
                SubLObject aug_key = NIL;
                SubLObject aug_index = NIL;
                destructuring_bind_must_consp(current_$6, datum_$6, $list77);
                aug_key = current_$6.first();
                current_$6 = current_$6.rest();
                destructuring_bind_must_consp(current_$6, datum_$6, $list77);
                aug_index = current_$6.first();
                current_$6 = current_$6.rest();
                if (NIL == current_$6) {
                    if (NIL != map_utilities.map_has_keyP(base_map, aug_key)) {
                        final SubLObject _prev_bind_0 = $current_complex_index_keys$.currentBinding(thread);
                        try {
                            $current_complex_index_keys$.bind(cons(aug_key, $current_complex_index_keys$.getDynamicValue(thread)), thread);
                            final SubLObject best_index = merge_sub_indices(map_utilities.map_get(base_map, aug_key, UNPROVIDED), aug_index);
                            map_utilities.map_put(base_map, aug_key, best_index);
                        } finally {
                            $current_complex_index_keys$.rebind(_prev_bind_0, thread);
                        }
                    } else {
                        map_utilities.map_put(base_map, aug_key, aug_index);
                    }
                } else {
                    cdestructuring_bind_error(datum_$6, $list77);
                }
            }
        }
        base_count = add(base_count, augment_count);
        set_nth(ZERO_INTEGER, base, base_count);
        return base;
    }

    /**
     * Initializes a top-level intermediate index for TERM.
     * Clobbers any existing indexing for TERM.
     */
    @LispMethod(comment = "Initializes a top-level intermediate index for TERM.\r\nClobbers any existing indexing for TERM.\nInitializes a top-level intermediate index for TERM.\nClobbers any existing indexing for TERM.")
    public static final SubLObject initialize_term_intermediate_index_alt(SubLObject v_term) {
        return reset_term_index(v_term, new_intermediate_index(symbol_function(EQ)));
    }

    /**
     * Initializes a top-level intermediate index for TERM.
     * Clobbers any existing indexing for TERM.
     */
    @LispMethod(comment = "Initializes a top-level intermediate index for TERM.\r\nClobbers any existing indexing for TERM.\nInitializes a top-level intermediate index for TERM.\nClobbers any existing indexing for TERM.")
    public static SubLObject initialize_term_intermediate_index(final SubLObject v_term) {
        return reset_term_index(v_term, new_intermediate_index(symbol_function(EQ)));
    }

    /**
     * Frees all resources consumed by INTERMEDIATE-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by INTERMEDIATE-INDEX")
    public static final SubLObject free_intermediate_index_alt(SubLObject intermediate_index) {
        return dictionary.clear_dictionary(intermediate_index_dictionary(intermediate_index));
    }

    /**
     * Frees all resources consumed by INTERMEDIATE-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by INTERMEDIATE-INDEX")
    public static SubLObject free_intermediate_index(final SubLObject intermediate_index) {
        return map_utilities.map_remove_all(intermediate_index_map(intermediate_index));
    }

    public static final SubLObject intermediate_index_leaf_count_reset_alt(SubLObject intermediate_index, SubLObject new_count) {
        return rplaca(intermediate_index, new_count);
    }

    public static SubLObject intermediate_index_leaf_count_reset(final SubLObject intermediate_index, final SubLObject new_count) {
        return rplaca(intermediate_index, new_count);
    }

    public static final SubLObject intermediate_index_leaf_count_inc_alt(SubLObject intermediate_index, SubLObject delta) {
        {
            SubLObject old_count = intermediate_index_leaf_count(intermediate_index);
            SubLObject new_count = add(old_count, delta);
            intermediate_index_leaf_count_reset(intermediate_index, new_count);
        }
        return intermediate_index;
    }

    public static SubLObject intermediate_index_leaf_count_inc(final SubLObject intermediate_index, final SubLObject delta) {
        final SubLObject old_count = intermediate_index_leaf_count(intermediate_index);
        final SubLObject new_count = add(old_count, delta);
        intermediate_index_leaf_count_reset(intermediate_index, new_count);
        return intermediate_index;
    }

    /**
     * Having already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.
     * If not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY.
     */
    @LispMethod(comment = "Having already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.\r\nIf not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY.\nHaving already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.\nIf not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY.")
    public static final SubLObject intermediate_index_lookup_or_create_intermediate_alt(SubLObject intermediate_index, SubLObject key, SubLObject key_history) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        {
            SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
            if (NIL != subindex) {
                return subindex;
            }
        }
        {
            SubLObject equality_test = kb_indexing_declarations.index_equality_test_for_keys(key_history);
            SubLObject subindex = new_intermediate_index(equality_test);
            intermediate_index_set(intermediate_index, key, subindex);
            return subindex;
        }
    }

    /**
     * Having already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.
     * If not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY.
     */
    @LispMethod(comment = "Having already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.\r\nIf not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY.\nHaving already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.\nIf not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY.")
    public static SubLObject intermediate_index_lookup_or_create_intermediate(final SubLObject intermediate_index, final SubLObject key, final SubLObject key_history) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        final SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if (NIL != subindex) {
            return subindex;
        }
        final SubLObject equality_test = kb_indexing_declarations.index_equality_test_for_keys(key_history);
        final SubLObject subindex2 = new_intermediate_index(equality_test);
        intermediate_index_set(intermediate_index, key, subindex2);
        return subindex2;
    }

    public static final SubLObject intermediate_index_lookup_or_create_final_alt(SubLObject intermediate_index, SubLObject key) {
        SubLTrampolineFile.checkType(intermediate_index, INTERMEDIATE_INDEX_P);
        {
            SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
            if (NIL != subindex) {
                return subindex;
            }
        }
        {
            SubLObject subindex = new_final_index();
            intermediate_index_set(intermediate_index, key, subindex);
            return subindex;
        }
    }

    public static SubLObject intermediate_index_lookup_or_create_final(final SubLObject intermediate_index, final SubLObject key) {
        assert NIL != intermediate_index_p(intermediate_index) : "! kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + ("kb_indexing_datastructures.intermediate_index_p(intermediate_index) " + "CommonSymbols.NIL != kb_indexing_datastructures.intermediate_index_p(intermediate_index) ") + intermediate_index;
        SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if (NIL != subindex) {
            return subindex;
        }
        subindex = new_final_index();
        intermediate_index_set(intermediate_index, key, subindex);
        return subindex;
    }

    public static SubLObject intermediate_index_map(final SubLObject intermediate_index) {
        return intermediate_index.rest();
    }

    public static SubLObject intermediate_index_map_set(final SubLObject intermediate_index, final SubLObject key, final SubLObject value) {
        assert NIL != subindex_p(value) : "! kb_indexing_datastructures.subindex_p(value) " + ("kb_indexing_datastructures.subindex_p(value) " + "CommonSymbols.NIL != kb_indexing_datastructures.subindex_p(value) ") + value;
        return map_utilities.map_put(intermediate_index_map(intermediate_index), key, value);
    }

    public static SubLObject intermediate_index_map_delete_key(final SubLObject intermediate_index, final SubLObject key) {
        return map_utilities.map_remove(intermediate_index_map(intermediate_index), key);
    }

    public static SubLObject intermediate_index_map_touch(final SubLObject intermediate_index, final SubLObject key) {
        return map_utilities.map_touch(intermediate_index_map(intermediate_index), key);
    }

    public static final SubLObject final_index_p_alt(SubLObject v_object) {
        return set_p(v_object);
    }

    public static SubLObject final_index_p(final SubLObject v_object) {
        return makeBoolean(((NIL != final_unified_index_p(v_object)) || (NIL != final_sharded_index_p(v_object))) || (NIL != final_topn_index_p(v_object)));
    }

    public static final SubLObject final_index_installed_p_alt(SubLObject v_object) {
        return final_index_p(v_object);
    }

    public static SubLObject final_index_installed_p(final SubLObject v_object) {
        return final_index_p(v_object);
    }

    public static final SubLObject final_index_not_hosed_p_alt(SubLObject v_object) {
        return final_index_p(v_object);
    }

    public static SubLObject final_index_not_hosed_p(final SubLObject v_object) {
        return final_index_p(v_object);
    }

    public static final SubLObject new_final_index_alt() {
        return new_set(EQ, UNPROVIDED);
    }

    public static SubLObject new_final_index() {
        return new_final_unified_index();
    }

    /**
     * This is robust against being passed NIL for the final index
     */
    @LispMethod(comment = "This is robust against being passed NIL for the final index")
    public static final SubLObject do_final_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject leaf_var = NIL;
                    SubLObject final_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    leaf_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    final_index = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            if (NIL == member(current_2, $list_alt25, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject index = $sym39$INDEX;
                                return list(CLET, list(list(index, final_index)), list(PWHEN, list(DO_FINAL_INDEX_VALID_INDEX_P, index), listS(DO_SET, list(leaf_var, list(FINAL_INDEX_SET, index), $DONE, done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This is robust against being passed NIL for the final index
     */
    @LispMethod(comment = "This is robust against being passed NIL for the final index")
    public static SubLObject do_final_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_index = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$8, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject index = $sym79$INDEX;
        return list(CLET, list(list(index, final_index)), list(PCOND, list(list(NULL, index)), list(list(FINAL_UNIFIED_INDEX_P, index), listS(DO_FINAL_UNIFIED_INDEX_INTERNAL, list(leaf_var, index, $DONE, done), append(body, NIL))), list(list(FINAL_SHARDED_INDEX_P, index), listS(DO_FINAL_SHARDED_INDEX_INTERNAL, list(leaf_var, index, $DONE, done), append(body, NIL))), list(list(FINAL_TOPN_INDEX_P, index), listS(DO_FINAL_TOPN_INDEX_INTERNAL, list(leaf_var, index, $DONE, done), append(body, NIL))), list(T, listS(ENFORCE_TYPE, index, $list89))));
    }

    public static SubLObject do_ordered_final_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_index = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$9, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject index = $sym90$INDEX;
        return list(CLET, list(list(index, final_index)), list(CLET, $list91, list(PCOND, list(list(NULL, index)), list(list(FINAL_UNIFIED_INDEX_P, index), listS(DO_ORDERED_FINAL_UNIFIED_INDEX_INTERNAL, list(leaf_var, index, $DONE, done), append(body, NIL))), list(list(FINAL_SHARDED_INDEX_P, index), listS(DO_ORDERED_FINAL_SHARDED_INDEX_INTERNAL, list(leaf_var, index, $DONE, done), append(body, NIL))), list(list(FINAL_TOPN_INDEX_P, index), listS(DO_ORDERED_FINAL_TOPN_INDEX_INTERNAL, list(leaf_var, index, $DONE, done), append(body, NIL))), list(T, listS(ENFORCE_TYPE, index, $list89)))));
    }

    /**
     *
     *
     * @return integerp; the number of indexing leaves in FINAL-INDEX
     */
    @LispMethod(comment = "@return integerp; the number of indexing leaves in FINAL-INDEX")
    public static final SubLObject final_index_leaf_count_alt(SubLObject final_index) {
        return set_size(final_index_set(final_index));
    }

    /**
     *
     *
     * @return integerp; the number of indexing leaves in FINAL-INDEX
     */
    @LispMethod(comment = "@return integerp; the number of indexing leaves in FINAL-INDEX")
    public static SubLObject final_index_leaf_count(final SubLObject final_index) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_leaf_count(final_index);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_leaf_count(final_index);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_leaf_count(final_index);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    /**
     *
     *
     * @return listp
     * @unknown result is NOT destructible!
     */
    @LispMethod(comment = "@return listp\r\n@unknown result is NOT destructible!")
    public static final SubLObject final_index_leaves_alt(SubLObject final_index) {
        return set_element_list(final_index_set(final_index));
    }

    /**
     *
     *
     * @return listp
     * @unknown result is NOT destructible!
     */
    @LispMethod(comment = "@return listp\r\n@unknown result is NOT destructible!")
    public static SubLObject final_index_leaves(final SubLObject final_index) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_leaves(final_index);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_leaves(final_index);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_leaves(final_index);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    public static final SubLObject final_index_memberP_alt(SubLObject final_index, SubLObject leaf) {
        return set_memberP(leaf, final_index_set(final_index));
    }

    public static SubLObject final_index_memberP(final SubLObject final_index, final SubLObject leaf) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_memberP(final_index, leaf);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_memberP(final_index, leaf);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_memberP(final_index, leaf);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    /**
     *
     *
     * @return indexing-leaf-p; an arbitrary leaf from FINAL-INDEX,
    or NIL if FINAL-INDEX has no leaves.
     */
    @LispMethod(comment = "@return indexing-leaf-p; an arbitrary leaf from FINAL-INDEX,\r\nor NIL if FINAL-INDEX has no leaves.")
    public static final SubLObject final_index_arbitrary_leaf_alt(SubLObject final_index) {
        return set_arbitrary_element(final_index_set(final_index));
    }

    /**
     *
     *
     * @return indexing-leaf-p; an arbitrary leaf from FINAL-INDEX,
    or NIL if FINAL-INDEX has no leaves.
     */
    @LispMethod(comment = "@return indexing-leaf-p; an arbitrary leaf from FINAL-INDEX,\r\nor NIL if FINAL-INDEX has no leaves.")
    public static SubLObject final_index_arbitrary_leaf(final SubLObject final_index) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_arbitrary_leaf(final_index);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_arbitrary_leaf(final_index);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_arbitrary_leaf(final_index);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    public static final SubLObject final_index_leaves_reset_alt(SubLObject final_index, SubLObject new_leaves) {
        {
            SubLObject v_set = final_index_set(final_index);
            clear_set(v_set);
            {
                SubLObject cdolist_list_var = new_leaves;
                SubLObject leaf = NIL;
                for (leaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , leaf = cdolist_list_var.first()) {
                    set_add(leaf, v_set);
                }
            }
        }
        return final_index;
    }

    public static SubLObject final_index_leaves_reset(final SubLObject final_index, final SubLObject new_leaves) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_leaves_reset(final_index, new_leaves);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_leaves_reset(final_index, new_leaves);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_leaves_reset(final_index, new_leaves);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    /**
     * Is not required to check for membership before insertion
     */
    @LispMethod(comment = "Is not required to check for membership before insertion")
    public static final SubLObject final_index_insert_alt(SubLObject final_index, SubLObject leaf) {
        set_add(leaf, final_index_set(final_index));
        return final_index;
    }

    /**
     * Is not required to check for membership before insertion
     */
    @LispMethod(comment = "Is not required to check for membership before insertion")
    public static SubLObject final_index_insert(final SubLObject final_index, final SubLObject leaf) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_insert(final_index, leaf);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_insert(final_index, leaf);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_insert(final_index, leaf);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    /**
     * Is not required to check for multiple elements to delete
     */
    @LispMethod(comment = "Is not required to check for multiple elements to delete")
    public static final SubLObject final_index_delete_alt(SubLObject final_index, SubLObject leaf) {
        set_remove(leaf, final_index_set(final_index));
        return final_index;
    }

    /**
     * Is not required to check for multiple elements to delete
     */
    @LispMethod(comment = "Is not required to check for multiple elements to delete")
    public static SubLObject final_index_delete(final SubLObject final_index, final SubLObject leaf) {
        if (NIL != final_unified_index_p(final_index)) {
            return final_unified_index_delete(final_index, leaf);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_delete(final_index, leaf);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return final_topn_index_delete(final_index, leaf);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    public static SubLObject new_final_index_base_iterator(final SubLObject final_index) {
        if (NIL != final_unified_index_p(final_index)) {
            return new_final_unified_index_iterator(final_index);
        }
        if (NIL != final_sharded_index_p(final_index)) {
            return new_final_sharded_index_iterator(final_index);
        }
        if (NIL != final_topn_index_p(final_index)) {
            return new_final_topn_index_iterator(final_index);
        }
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        return NIL;
    }

    /**
     * Frees all resources consumed by FINAL-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by FINAL-INDEX")
    public static final SubLObject free_final_index_alt(SubLObject final_index) {
        return final_index;
    }

    /**
     * Frees all resources consumed by FINAL-INDEX
     */
    @LispMethod(comment = "Frees all resources consumed by FINAL-INDEX")
    public static SubLObject free_final_index(final SubLObject final_index) {
        return final_index;
    }

    public static SubLObject final_unified_index_p(final SubLObject v_object) {
        return set.set_p(v_object);
    }

    public static SubLObject final_unified_index_installed_p(final SubLObject v_object) {
        return final_unified_index_p(v_object);
    }

    public static SubLObject final_unified_index_not_hosed_p(final SubLObject v_object) {
        return final_unified_index_p(v_object);
    }

    public static SubLObject new_final_unified_index() {
        return set.new_set(EQL, UNPROVIDED);
    }

    public static SubLObject do_final_unified_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_unified_index = NIL;
        destructuring_bind_must_consp(current, datum, $list95);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        final_unified_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list95);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list95);
            if (NIL == member(current_$10, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list95);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(leaf_var, list(FINAL_UNIFIED_INDEX_SET, final_unified_index), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_ordered_final_unified_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_unified_index = NIL;
        destructuring_bind_must_consp(current, datum, $list95);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        final_unified_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list95);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list95);
            if (NIL == member(current_$11, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list95);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject leaf_items = $sym98$LEAF_ITEMS;
        return list(CLET, list(list(leaf_items, list(SET_ELEMENT_LIST, list(FINAL_UNIFIED_INDEX_SET, final_unified_index)))), list(CSETQ, leaf_items, list(SORT_ASSERTIONS, leaf_items)), listS(CSOME, list(leaf_var, leaf_items, done), append(body, NIL)));
    }

    public static SubLObject final_unified_index_leaf_count(final SubLObject final_unified_index) {
        return set.set_size(final_unified_index_set(final_unified_index));
    }

    public static SubLObject final_unified_index_leaves(final SubLObject final_unified_index) {
        return set.set_element_list(final_unified_index_set(final_unified_index));
    }

    public static SubLObject final_unified_index_memberP(final SubLObject final_unified_index, final SubLObject leaf) {
        return set.set_memberP(leaf, final_unified_index_set(final_unified_index));
    }

    public static SubLObject final_unified_index_arbitrary_leaf(final SubLObject final_unified_index) {
        return set_utilities.set_arbitrary_element(final_unified_index_set(final_unified_index));
    }

    public static SubLObject final_unified_index_leaves_reset(final SubLObject final_unified_index, final SubLObject new_leaves) {
        final SubLObject v_set = final_unified_index_set(final_unified_index);
        set.clear_set(v_set);
        SubLObject cdolist_list_var = new_leaves;
        SubLObject leaf = NIL;
        leaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(leaf, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            leaf = cdolist_list_var.first();
        } 
        return final_unified_index;
    }

    public static SubLObject final_unified_index_insert(final SubLObject final_unified_index, final SubLObject leaf) {
        set.set_add(leaf, final_unified_index_set(final_unified_index));
        return final_unified_index;
    }

    public static SubLObject final_unified_index_delete(final SubLObject final_unified_index, final SubLObject leaf) {
        set.set_remove(leaf, final_unified_index_set(final_unified_index));
        return final_unified_index;
    }

    public static SubLObject final_unified_index_is_shardableP(final SubLObject final_unified_index) {
        return final_index_set_is_shardableP(final_unified_index);
    }

    public static SubLObject new_final_unified_index_iterator(final SubLObject final_unified_index) {
        return set.new_set_iterator(final_unified_index);
    }

    public static SubLObject free_final_unified_index(final SubLObject final_unified_index) {
        return final_unified_index;
    }

    public static SubLObject final_unified_index_set(final SubLObject final_unified_index) {
        return final_unified_index;
    }

    public static SubLObject final_index_set_is_shardableP(final SubLObject v_set) {
        return numGE(set.set_size(v_set), $final_sharded_index_shard_size$.getGlobalValue());
    }

    public static SubLObject new_final_sharded_index(final SubLObject index_count, final SubLObject keys, final SubLObject shard_map) {
        return list(index_count, keys, shard_map);
    }

    public static SubLObject finshard_index_leaf_count(final SubLObject index) {
        return index.first();
    }

    public static SubLObject set_finshard_index_leaf_count(final SubLObject index, final SubLObject count) {
        set_nth(ZERO_INTEGER, index, count);
        return index;
    }

    public static SubLObject finshard_index_keys(final SubLObject index) {
        return second(index);
    }

    public static SubLObject set_finshard_index_keys(final SubLObject index, final SubLObject new_keys) {
        set_nth(ONE_INTEGER, index, new_keys);
        return index;
    }

    public static SubLObject finshard_index_map(final SubLObject index) {
        return third(index);
    }

    public static SubLObject set_finshard_index_map(final SubLObject index, final SubLObject new_map) {
        set_nth(TWO_INTEGER, index, new_map);
        return index;
    }

    public static SubLObject final_sharded_index_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != subl_promotions.non_negative_integer_p(finshard_index_leaf_count(v_object)))) && finshard_index_keys(v_object).isVector()) && (NIL != map_utilities.map_p(finshard_index_map(v_object)))) && (NIL == fourth(v_object)));
    }

    public static SubLObject final_sharded_index_empty_p(final SubLObject v_object) {
        return makeBoolean((NIL != final_sharded_index_p(v_object)) && (NIL != map_utilities.map_empty_p(finshard_index_map(v_object))));
    }

    public static SubLObject final_sharded_index_leaf_count(final SubLObject final_sharded_index) {
        return finshard_index_leaf_count(final_sharded_index);
    }

    public static SubLObject final_sharded_index_leaves(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject leaf_count = finshard_index_leaf_count(final_sharded_index);
        SubLObject cursor;
        final SubLObject leaves = cursor = make_list(leaf_count, UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(finshard_index_map(final_sharded_index));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject shard = NIL;
                destructuring_bind_must_consp(current, datum, $list105);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list105);
                shard = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject set_contents_var = set.do_set_internal(shard);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject leaf;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        leaf = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                            rplaca(cursor, leaf);
                            cursor = cursor.rest();
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list105);
                }
            }
        }
        return leaves;
    }

    public static SubLObject final_sharded_index_memberP(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject shard = finshard_index_find_shard(final_sharded_index, leaf);
        if (NIL != set.set_p(shard)) {
            return set.set_memberP(leaf, shard);
        }
        return NIL;
    }

    public static SubLObject finshard_index_find_shard(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject key_index = finshard_index_find_shard_key_index(final_sharded_index, leaf);
        if (NIL != subl_promotions.non_negative_integer_p(key_index)) {
            final SubLObject keys = finshard_index_keys(final_sharded_index);
            final SubLObject covering_key = aref(keys, key_index);
            return map_utilities.map_get(finshard_index_map(final_sharded_index), covering_key, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject finshard_index_find_shard_key_index(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject leaf_suid = indexing_leaf_suid(leaf);
        SubLObject right_wall = subtract(length(keys), ONE_INTEGER);
        final SubLObject max_shard_suid = aref(keys, right_wall);
        if (max_shard_suid.numL(leaf_suid)) {
            return NIL;
        }
        SubLObject left_wall = ZERO_INTEGER;
        while (left_wall.numLE(right_wall)) {
            final SubLObject mid = integerDivide(add(left_wall, right_wall), TWO_INTEGER);
            final SubLObject mid_shard_suid = aref(keys, mid);
            if (mid_shard_suid.numL(leaf_suid)) {
                left_wall = add(ONE_INTEGER, mid);
            } else {
                if (!mid_shard_suid.numG(leaf_suid)) {
                    return mid;
                }
                right_wall = subtract(mid, ONE_INTEGER);
            }
        } 
        return left_wall.numL(length(keys)) ? left_wall : NIL;
    }

    public static SubLObject final_sharded_index_arbitrary_leaf(final SubLObject final_sharded_index) {
        if (NIL != final_sharded_index_empty_p(final_sharded_index)) {
            return NIL;
        }
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject leaf_key = map_utilities.map_arbitrary_key(shard_map, UNPROVIDED);
        final SubLObject leaf = set_utilities.set_arbitrary_element(map_utilities.map_get(shard_map, leaf_key, UNPROVIDED));
        return leaf;
    }

    public static SubLObject do_final_sharded_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_sharded_index = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        final_sharded_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list106);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list106);
            if (NIL == member(current_$12, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list106);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject ignored_key = $sym107$IGNORED_KEY;
        final SubLObject shard = $sym108$SHARD;
        return list(DO_MAP, list(ignored_key, shard, list(FINAL_SHARDED_INDEX_SHARD_MAP, final_sharded_index), $DONE, done), list(IGNORE, ignored_key), listS(DO_SET, list(leaf_var, shard, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_ordered_final_sharded_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_sharded_index = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        final_sharded_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list106);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list106);
            if (NIL == member(current_$13, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list106);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject shard_key_list = $sym111$SHARD_KEY_LIST;
        final SubLObject key = $sym112$KEY;
        final SubLObject shard = $sym113$SHARD;
        final SubLObject shard_contents = $sym114$SHARD_CONTENTS;
        return list(CLET, list(list(shard_key_list, listS(SORT, list(MAP_KEYS, list(FINAL_SHARDED_INDEX_SHARD_MAP, final_sharded_index)), $list117)), list(shard_contents)), list(CSOME, list(key, shard_key_list, done), list(CLET, list(list(shard, list(MAP_GET, list(FINAL_SHARDED_INDEX_SHARD_MAP, final_sharded_index), key))), list(CSETQ, shard_contents, list(ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS, shard, shard_contents)), list(DO_VECTOR, list(leaf_var, shard_contents, $DONE, done), listS(PWHEN, list(ASSERTION_P, leaf_var), append(body, NIL))))));
    }

    public static SubLObject final_sharded_index_shard_map(final SubLObject final_sharded_index) {
        return finshard_index_map(final_sharded_index);
    }

    public static SubLObject ordered_final_sharded_index_extract_contents(final SubLObject shard, SubLObject contents) {
        SubLObject contents_size = (contents.isVector()) ? ZERO_INTEGER : length(contents);
        final SubLObject shard_size = set.set_size(shard);
        if (contents_size.numL(shard_size)) {
            contents_size = shard_size;
            contents = make_vector(shard_size, UNPROVIDED);
        }
        SubLObject index = ZERO_INTEGER;
        final SubLObject set_contents_var = set.do_set_internal(shard);
        SubLObject basis_object;
        SubLObject state;
        SubLObject item;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            item = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                set_aref(contents, index, item);
                index = add(index, ONE_INTEGER);
            }
        }
        while (index.numL(contents_size)) {
            set_aref(contents, index, NIL);
            index = add(index, ONE_INTEGER);
        } 
        Sort.sort(contents, $sym122$POSSIBLE_ASSERTION_, UNPROVIDED);
        return contents;
    }

    public static SubLObject possible_assertionL(final SubLObject a1, final SubLObject a2) {
        if (NIL != assertion_handles.assertion_p(a1)) {
            if (NIL != assertion_handles.assertion_p(a2)) {
                return assertion_handles.assertion_id(a1).numL(assertion_handles.assertion_id(a2)) ? a1 : a2;
            }
            return a1;
        } else {
            if (NIL != assertion_handles.assertion_p(a2)) {
                return a2;
            }
            return a1;
        }
    }

    public static SubLObject increment_finshard_index_leaf_count(final SubLObject index, SubLObject amount) {
        if (amount == UNPROVIDED) {
            amount = ONE_INTEGER;
        }
        set_finshard_index_leaf_count(index, add(finshard_index_leaf_count(index), amount));
        return index;
    }

    public static SubLObject decrement_finshard_index_leaf_count(final SubLObject index, SubLObject amount) {
        if (amount == UNPROVIDED) {
            amount = ONE_INTEGER;
        }
        set_finshard_index_leaf_count(index, subtract(finshard_index_leaf_count(index), amount));
        return index;
    }

    public static SubLObject append_finshard_index_keys(final SubLObject index, final SubLObject new_key) {
        final SubLObject bigger_keys = vector_utilities.extend_vector(finshard_index_keys(index), ONE_INTEGER, new_key);
        set_finshard_index_keys(index, bigger_keys);
        return bigger_keys;
    }

    public static SubLObject final_sharded_index_leaves_reset(final SubLObject final_sharded_index, final SubLObject new_leaves) {
        final SubLObject new_index = create_final_sharded_index(new_leaves);
        set_finshard_index_leaf_count(final_sharded_index, finshard_index_leaf_count(new_index));
        set_finshard_index_keys(final_sharded_index, finshard_index_keys(new_index));
        set_finshard_index_map(final_sharded_index, finshard_index_map(new_index));
        return final_sharded_index;
    }

    public static SubLObject final_sharded_index_insert(final SubLObject final_sharded_index, final SubLObject leaf) {
        return final_sharded_index_insert_internal(final_sharded_index, leaf);
    }

    public static SubLObject final_sharded_index_insert_internal(final SubLObject final_sharded_index, final SubLObject leaf) {
        SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_key_index = finshard_index_find_shard_key_index(final_sharded_index, leaf);
        if (NIL != shard_key_index) {
            final SubLObject shard_key = aref(keys, shard_key_index);
            map_utilities.map_touch(shard_map, shard_key);
            return final_sharded_index_insert_into_shard(final_sharded_index, leaf, map_utilities.map_get(shard_map, shard_key, UNPROVIDED));
        }
        final SubLObject right_wall = subtract(length(keys), ONE_INTEGER);
        final SubLObject last_key = aref(keys, right_wall);
        final SubLObject shard = map_utilities.map_get(shard_map, last_key, UNPROVIDED);
        final SubLObject new_key = indexing_leaf_suid(leaf);
        if (NIL != final_index_set_is_shardableP(shard)) {
            final SubLObject new_shard = new_final_unified_index();
            keys = append_finshard_index_keys(final_sharded_index, new_key);
            map_utilities.map_put(shard_map, new_key, new_shard);
            return final_sharded_index_insert_into_shard(final_sharded_index, leaf, new_shard);
        }
        map_utilities.map_remove(shard_map, last_key);
        map_utilities.map_put(shard_map, new_key, shard);
        set_aref(keys, right_wall, new_key);
        return final_sharded_index_insert_into_shard(final_sharded_index, leaf, shard);
    }

    public static SubLObject final_sharded_index_insert_into_shard(final SubLObject final_sharded_index, final SubLObject leaf, final SubLObject shard) {
        final SubLObject pre_size = set.set_size(shard);
        set.set_add(leaf, shard);
        if (!pre_size.numE(set.set_size(shard))) {
            increment_finshard_index_leaf_count(final_sharded_index, UNPROVIDED);
        }
        return final_sharded_index;
    }

    public static SubLObject final_sharded_index_delete(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_key_index = finshard_index_find_shard_key_index(final_sharded_index, leaf);
        final SubLObject shard_key = (NIL != shard_key_index) ? aref(keys, shard_key_index) : NIL;
        final SubLObject shard = map_utilities.map_get(shard_map, shard_key, UNPROVIDED);
        if (NIL != set.set_p(shard)) {
            final SubLObject pre_size = set.set_size(shard);
            set.set_remove(leaf, shard);
            if (!pre_size.numE(set.set_size(shard))) {
                map_utilities.map_touch(shard_map, shard_key);
                decrement_finshard_index_leaf_count(final_sharded_index, UNPROVIDED);
            }
        }
        return final_sharded_index;
    }

    public static SubLObject reshard_final_sharded_index(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject leaf_count = final_sharded_index_leaf_count(final_sharded_index);
        final SubLObject leaves = make_vector(leaf_count, UNPROVIDED);
        SubLObject cursor = ZERO_INTEGER;
        final SubLObject iterator = map_utilities.new_map_iterator(finshard_index_map(final_sharded_index));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject shard = NIL;
                destructuring_bind_must_consp(current, datum, $list105);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list105);
                shard = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject set_contents_var = set.do_set_internal(shard);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject leaf;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        leaf = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                            set_aref(leaves, cursor, leaf);
                            cursor = add(cursor, ONE_INTEGER);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list105);
                }
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!cursor.numE(leaf_count))) {
            Errors.error($str123$Index_count_was__A__yet_we_copied, leaf_count, cursor);
        }
        return ncreate_final_sharded_index(leaves);
    }

    public static SubLObject convert_final_simple_index_to_sharded_index(final SubLObject final_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_set = final_unified_index_set(final_index);
        final SubLObject leaf_count = set.set_size(index_set);
        final SubLObject leaves = make_vector(leaf_count, UNPROVIDED);
        SubLObject cursor = ZERO_INTEGER;
        final SubLObject set_contents_var = set.do_set_internal(index_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject leaf;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            leaf = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                set_aref(leaves, cursor, leaf);
                cursor = add(cursor, ONE_INTEGER);
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!cursor.numE(leaf_count))) {
            Errors.error($str123$Index_count_was__A__yet_we_copied, leaf_count, cursor);
        }
        return ncreate_final_sharded_index(leaves);
    }

    public static SubLObject create_final_sharded_index(final SubLObject leaves) {
        return ncreate_final_sharded_index(list_utilities.list2vector(leaves));
    }

    public static SubLObject ncreate_final_sharded_index(final SubLObject leaves) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ordered_leaves = Sort.sort(leaves, $sym124$_, INDEXING_LEAF_SUID);
        final SubLObject index_count = length(ordered_leaves);
        final SubLObject shard_count = ceiling(index_count, $final_sharded_index_shard_size$.getGlobalValue());
        final SubLObject shard_map = dictionary.new_dictionary(EQL, shard_count);
        SubLObject shard = new_final_unified_index();
        SubLObject last_leaf = NIL;
        for (SubLObject sequence_var = ordered_leaves, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
            final SubLObject leaf = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
            set.set_add(leaf, shard);
            if (NIL != final_index_set_is_shardableP(shard)) {
                final SubLObject leaf_suid = indexing_leaf_suid(leaf);
                map_utilities.map_put(shard_map, leaf_suid, shard);
                shard = new_final_unified_index();
            }
            last_leaf = leaf;
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            element_num = add(element_num, ONE_INTEGER);
        }
        if (NIL == set.set_emptyP(shard)) {
            final SubLObject leaf_suid2 = indexing_leaf_suid(last_leaf);
            map_utilities.map_put(shard_map, leaf_suid2, shard);
        }
        final SubLObject keys = Sort.sort(list_utilities.list2vector(map_utilities.map_keys(shard_map)), $sym124$_, UNPROVIDED);
        final SubLObject key_count = length(keys);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!key_count.numE(shard_count))) {
            Errors.error($str126$Implementation_error__shard_count, shard_count, key_count);
        }
        return new_final_sharded_index(index_count, keys, shard_map);
    }

    public static SubLObject reorganize_modified_final_sharded_index(final SubLObject final_sharded_index) {
        final SubLObject index_count = final_sharded_index_leaf_count(final_sharded_index);
        final SubLObject keys = copy_seq(finshard_index_keys(final_sharded_index));
        final SubLObject old_shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_map = dictionary.new_dictionary(EQL, map_utilities.map_size(old_shard_map));
        SubLObject cdolist_list_var;
        final SubLObject changed_keys = cdolist_list_var = map_utilities.map_change_set(old_shard_map, shard_map);
        SubLObject changed_key = NIL;
        changed_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject changed_value = map_utilities.map_get(old_shard_map, changed_key, UNPROVIDED);
            map_utilities.map_put(shard_map, changed_key, changed_value);
            cdolist_list_var = cdolist_list_var.rest();
            changed_key = cdolist_list_var.first();
        } 
        return new_final_sharded_index(index_count, keys, shard_map);
    }

    public static SubLObject final_sharded_index_to_fvector_backed_sharded_index(final SubLObject final_sharded_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject paged_map = file_vector_utilities.convert_map_to_file_vector_backed_map(finshard_index_map(final_sharded_index), fvector, $SWAPPED_OUT, $COMPACT);
        final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map(paged_map, indexical);
        set_finshard_index_map(final_sharded_index, backed_map);
        return final_sharded_index;
    }

    public static SubLObject update_fvector_backed_final_sharded_index(final SubLObject final_sharded_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject paged_map = file_vector_utilities.upgrade_map_to_file_vector_backed_map(finshard_index_map(final_sharded_index), fvector, $SWAPPED_OUT);
        final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map(paged_map, indexical);
        set_finshard_index_map(final_sharded_index, backed_map);
        return final_sharded_index;
    }

    public static SubLObject validate_final_sharded_index(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject leaf_count = final_sharded_index_leaf_count(final_sharded_index);
        final SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_count = map_utilities.map_size(shard_map);
        final SubLObject keys_lenght = length(keys);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!shard_count.numE(keys_lenght))) {
            Errors.error($str129$Shard_count_of__A_does_not_match_, shard_count, keys_lenght);
        }
        SubLObject test_keys = map_utilities.map_keys(shard_map);
        test_keys = Sort.sort(test_keys, $sym124$_, UNPROVIDED);
        SubLObject i;
        SubLObject expected_key;
        SubLObject actual_key;
        for (i = NIL, i = ZERO_INTEGER; i.numL(shard_count); i = add(i, ONE_INTEGER)) {
            expected_key = elt(test_keys, i);
            actual_key = elt(keys, i);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_key.numE(actual_key))) {
                Errors.error($str130$Shard_key___A_is_wrong____we_expe, i, expected_key, actual_key);
            }
        }
        final SubLObject iterator = map_utilities.new_map_iterator(shard_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject max_suid = NIL;
                SubLObject shard = NIL;
                destructuring_bind_must_consp(current, datum, $list131);
                max_suid = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list131);
                shard = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject set_contents_var = set.do_set_internal(shard);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject leaf;
                    SubLObject leaf_suid;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        leaf = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                            leaf_suid = indexing_leaf_suid(leaf);
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!leaf_suid.numLE(max_suid))) {
                                Errors.error($str132$Shard_with_max_ID__A_contains_lea, max_suid, leaf, leaf_suid);
                            }
                            leaf_count = subtract(leaf_count, ONE_INTEGER);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list131);
                }
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!leaf_count.isZero())) {
            Errors.error($str133$We_expected_to_find__A_leaves__bu, final_sharded_index_leaf_count(final_sharded_index), leaf_count);
        }
        return final_sharded_index;
    }

    public static SubLObject new_final_sharded_index_iterator(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        SubLObject iterators = NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(shard_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject max_suid = NIL;
                SubLObject shard = NIL;
                destructuring_bind_must_consp(current, datum, $list131);
                max_suid = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list131);
                shard = current.first();
                current = current.rest();
                if (NIL == current) {
                    iterators = cons(set.new_set_iterator(shard), iterators);
                } else {
                    cdestructuring_bind_error(datum, $list131);
                }
            }
        }
        return iteration.new_iterator_iterator(iterators);
    }

    public static SubLObject free_final_sharded_index(final SubLObject final_sharded_index) {
        return final_sharded_index;
    }

    public static SubLObject final_sharded_index_set(final SubLObject final_sharded_index) {
        return final_sharded_index;
    }

    public static SubLObject with_final_topn_index_tracking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject newbies = NIL;
        destructuring_bind_must_consp(current, datum, $list136);
        newbies = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, $list137, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, newbies, $list138));
        }
        cdestructuring_bind_error(datum, $list136);
        return NIL;
    }

    public static SubLObject without_final_topn_index_tracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list139, append(body, NIL));
    }

    public static SubLObject possibly_note_new_final_topn_index(final SubLObject v_term, final SubLObject key_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $with_final_topn_index_tracking$.getDynamicValue(thread)) {
            $recent_final_topn_indices$.setDynamicValue(cons(cons(v_term, key_path), $recent_final_topn_indices$.getDynamicValue(thread)), thread);
        }
        return v_term;
    }

    public static SubLObject final_topn_index_p(final SubLObject v_object) {
        return makeBoolean((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != subl_promotions.non_negative_integer_p(v_object.first()))) && (NIL != indexed_term_p(second(v_object)))) && third(v_object).isCons());
    }

    public static SubLObject final_topn_index_count(final SubLObject final_topn_index) {
        return nth(ZERO_INTEGER, final_topn_index);
    }

    public static SubLObject set_final_topn_index_count(final SubLObject final_topn_index, final SubLObject number) {
        SubLTrampolineFile.enforceType(number, NON_NEGATIVE_INTEGER_P);
        set_nth(ZERO_INTEGER, final_topn_index, number);
        return final_topn_index;
    }

    public static SubLObject inc_final_topn_index_count(final SubLObject final_topn_index, SubLObject offset) {
        if (offset == UNPROVIDED) {
            offset = ONE_INTEGER;
        }
        set_final_topn_index_count(final_topn_index, add(offset, final_topn_index_count(final_topn_index)));
        return final_topn_index_count(final_topn_index);
    }

    public static SubLObject dec_final_topn_index_count(final SubLObject final_topn_index, SubLObject offset) {
        if (offset == UNPROVIDED) {
            offset = ONE_INTEGER;
        }
        return inc_final_topn_index_count(final_topn_index, minus(offset));
    }

    public static SubLObject final_topn_index_term(final SubLObject final_topn_index) {
        return nth(ONE_INTEGER, final_topn_index);
    }

    public static SubLObject final_topn_index_key_path(final SubLObject final_topn_index) {
        return nth(TWO_INTEGER, final_topn_index);
    }

    public static SubLObject final_topn_index_installed_p(final SubLObject final_topn_index) {
        return final_topn_index_p(final_topn_index);
    }

    public static SubLObject final_topn_index_not_hosed_p(final SubLObject final_topn_index) {
        return final_topn_index_p(final_topn_index);
    }

    public static SubLObject new_final_topn_index(final SubLObject v_term, final SubLObject key_path, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ZERO_INTEGER;
        }
        final SubLObject topn_index = list(count, v_term, key_path);
        if (count.isZero()) {
            Errors.warn($str141$__Creating_empty_TOP_N_index__A_o, key_path, v_term);
        }
        possibly_note_new_final_topn_index(v_term, key_path);
        return topn_index;
    }

    public static SubLObject upgrade_final_index(final SubLObject final_index) {
        SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
        if (NIL != final_topn_index_p(final_index)) {
            return final_index;
        }
        final SubLObject v_term = current_complex_index_term();
        final SubLObject key_path = copy_current_complex_index_keys();
        final SubLObject count = final_index_leaf_count(final_index);
        Errors.warn($str142$Upgrading_index__A_on__A___A_item, key_path, v_term, count);
        return new_final_topn_index(v_term, key_path, count);
    }

    public static SubLObject new_final_topn_index_iterator(final SubLObject final_topn_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Errors.error($str144$Final_Top_N_index_iterator_for__A, final_topn_index);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        Errors.warn($str145$_A__, msg);
        return iteration.new_filter_iterator(assertion_handles.new_assertions_iterator(), $sym146$ASSERTION_MATCHES_FINAL_TOPN_INDEXKEY_PATH_, final_topn_index_iterator_build_filter_args(final_topn_index));
    }

    public static SubLObject final_topn_index_iterator_build_filter_args(final SubLObject final_topn_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = final_topn_index_term(final_topn_index);
        final SubLObject keys = final_topn_index_key_path(final_topn_index);
        final SubLObject top_key = keys.first();
        final SubLObject index = kb_indexing_declarations.find_index_by_top_level_key(top_key);
        final SubLObject subkeys = keys.rest();
        final SubLObject matcher_fn = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!matcher_fn.isFunctionSpec())) {
            Errors.error($str148$No_match_function_available_for_d, keys, v_term);
        }
        final SubLObject args = cons(v_term, subkeys);
        return list(matcher_fn, args);
    }

    public static SubLObject assertion_matches_final_topn_indexkey_pathP(final SubLObject assertion, final SubLObject matcher_fn, final SubLObject args) {
        return apply(matcher_fn, assertion, args);
    }

    public static SubLObject new_ordered_final_topn_index_iterator(final SubLObject final_topn_index) {
        return new_final_topn_index_iterator(final_topn_index);
    }

    public static SubLObject do_final_topn_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_topn_index = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final_topn_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list149);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list149);
            if (NIL == member(current_$14, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list149);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ITERATOR, list(leaf_var, list(NEW_FINAL_TOPN_INDEX_ITERATOR, final_topn_index), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_ordered_final_topn_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = NIL;
        SubLObject final_topn_index = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        leaf_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final_topn_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$15 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list149);
            current_$15 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list149);
            if (NIL == member(current_$15, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$15 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list149);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ITERATOR, list(leaf_var, list(NEW_ORDERED_FINAL_TOPN_INDEX_ITERATOR, final_topn_index), $DONE, done), append(body, NIL));
    }

    public static SubLObject final_topn_index_leaf_count(final SubLObject final_topn_index) {
        return final_topn_index_count(final_topn_index);
    }

    public static SubLObject final_topn_index_leaves(final SubLObject final_topn_index) {
        return iteration.iterator_value_list(new_final_topn_index_iterator(final_topn_index));
    }

    public static SubLObject final_topn_index_memberP(final SubLObject final_topn_index, final SubLObject leaf) {
        SubLObject current;
        final SubLObject datum = current = final_topn_index_iterator_build_filter_args(final_topn_index);
        SubLObject matcher_fn = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list152);
        matcher_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list152);
        args = current.first();
        current = current.rest();
        if (NIL == current) {
            return assertion_matches_final_topn_indexkey_pathP(leaf, matcher_fn, args);
        }
        cdestructuring_bind_error(datum, $list152);
        return NIL;
    }

    public static SubLObject final_topn_index_arbitrary_leaf(final SubLObject final_topn_index) {
        return iteration.iteration_next(new_final_topn_index_iterator(final_topn_index));
    }

    public static SubLObject final_topn_index_leaves_reset(final SubLObject final_topn_index, final SubLObject new_leaves) {
        set_final_topn_index_count(final_topn_index, length(new_leaves));
        return final_topn_index;
    }

    public static SubLObject final_topn_index_insert(final SubLObject final_topn_index, final SubLObject leaf) {
        inc_final_topn_index_count(final_topn_index, UNPROVIDED);
        return final_topn_index;
    }

    public static SubLObject final_topn_index_delete(final SubLObject final_topn_index, final SubLObject leaf) {
        dec_final_topn_index_count(final_topn_index, UNPROVIDED);
        return final_topn_index;
    }

    public static SubLObject free_final_topn_index(final SubLObject final_topn_index) {
        return final_topn_index;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a possible leaf for indexing
     * @unknown NIL can never be an indexing-leaf
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a possible leaf for indexing\r\n@unknown NIL can never be an indexing-leaf")
    public static final SubLObject indexing_leaf_p_alt(SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a possible leaf for indexing
     * @unknown NIL can never be an indexing-leaf
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a possible leaf for indexing\r\n@unknown NIL can never be an indexing-leaf")
    public static SubLObject indexing_leaf_p(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static final SubLObject indexing_leaf_installed_p_alt(SubLObject v_object) {
        return assertions_high.valid_assertion(v_object, NIL);
    }

    public static SubLObject indexing_leaf_installed_p(final SubLObject v_object) {
        return assertions_high.valid_assertion(v_object, NIL);
    }

    public static final SubLObject indexing_leaf_not_hosed_p_alt(SubLObject v_object) {
        return assertions_high.valid_assertion(v_object, T);
    }

    public static SubLObject indexing_leaf_not_hosed_p(final SubLObject v_object) {
        return assertions_high.valid_assertion(v_object, T);
    }

    public static SubLObject indexing_leaf_suid(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == api_control_vars.$cfasl_assertion_handle_func$.getDynamicValue(thread)) {
            return assertion_handles.assertion_id(v_object);
        }
        return funcall(api_control_vars.$cfasl_assertion_handle_func$.getDynamicValue(thread), v_object);
    }

    public static SubLObject merge_final_indices(final SubLObject base, final SubLObject augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_index = NIL;
        SubLObject msg = NIL;
        SubLObject flippedP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (final_index_leaf_count(base).numL(final_index_leaf_count(augment))) {
                        best_index = merge_final_indices_internal(augment, base);
                        flippedP = T;
                    } else {
                        best_index = merge_final_indices_internal(base, augment);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (msg.isString()) {
            Errors.error($str153$Could_not_merge_final_indices__A_, NIL != flippedP ? augment : base, NIL != flippedP ? base : augment, msg);
        }
        return best_index;
    }

    public static SubLObject merge_final_indices_internal(final SubLObject base, final SubLObject augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != final_topn_index_p(base)) {
            inc_final_topn_index_count(base, final_index_leaf_count(augment));
            return base;
        }
        if (NIL != upgrade_combined_indices_to_final_indexP(base, augment)) {
            final SubLObject v_term = current_complex_index_term();
            final SubLObject key_path = copy_current_complex_index_keys();
            final SubLObject base_count = final_index_leaf_count(base);
            final SubLObject augment_count = final_index_leaf_count(augment);
            final SubLObject total_count = add(base_count, augment_count);
            Errors.warn($str154$Merging_indices__A_on__A___A_item, new SubLObject[]{ key_path, v_term, base_count, augment_count });
            return new_final_topn_index(v_term, key_path, total_count);
        }
        if (NIL != augment) {
            if (NIL != final_unified_index_p(augment)) {
                final SubLObject set_var = final_unified_index_set(augment);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject leaf;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    leaf = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                        final_index_insert(base, leaf);
                    }
                }
            } else
                if (NIL != final_sharded_index_p(augment)) {
                    final SubLObject iterator = map_utilities.new_map_iterator(final_sharded_index_shard_map(augment));
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject ignored_key = NIL;
                            SubLObject shard = NIL;
                            destructuring_bind_must_consp(current, datum, $list155);
                            ignored_key = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list155);
                            shard = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject set_contents_var2 = set.do_set_internal(shard);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject leaf2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    leaf2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, leaf2)) {
                                        final_index_insert(base, leaf2);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list155);
                            }
                        }
                    }
                } else
                    if (NIL != final_topn_index_p(augment)) {
                        final SubLObject iterator_var = new_final_topn_index_iterator(augment);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject leaf3 = iteration.iteration_next(iterator_var);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                final_index_insert(base, leaf3);
                            }
                        }
                    } else {
                        SubLTrampolineFile.enforceType(augment, FINAL_INDEX_P);
                    }


        }
        return base;
    }

    public static final SubLObject declare_kb_indexing_datastructures_file_alt() {
        declareFunction("setup_indexing_tables", "SETUP-INDEXING-TABLES", 1, 0, false);
        declareFunction("assertion_indexing_store", "ASSERTION-INDEXING-STORE", 0, 0, false);
        declareFunction("assertion_indexing_store_reset", "ASSERTION-INDEXING-STORE-RESET", 1, 0, false);
        declareFunction("assertion_indexing_store_initial_size", "ASSERTION-INDEXING-STORE-INITIAL-SIZE", 0, 1, false);
        declareFunction("assertion_indexing_store_initialize", "ASSERTION-INDEXING-STORE-INITIALIZE", 0, 1, false);
        declareFunction("assertion_indexing_store_get", "ASSERTION-INDEXING-STORE-GET", 1, 0, false);
        declareFunction("assertion_indexing_store_remove", "ASSERTION-INDEXING-STORE-REMOVE", 1, 0, false);
        declareFunction("assertion_indexing_store_set", "ASSERTION-INDEXING-STORE-SET", 2, 0, false);
        declareFunction("unindexed_syntax_constants", "UNINDEXED-SYNTAX-CONSTANTS", 0, 0, false);
        declareFunction("unindexed_syntax_constant_p", "UNINDEXED-SYNTAX-CONSTANT-P", 1, 0, false);
        declareFunction("indexed_term_p", "INDEXED-TERM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_indexing_datastructures.$indexed_term_p$UnaryFunction();
        declareFunction("indexed_unrepresented_term_p", "INDEXED-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction("valid_indexed_termP", "VALID-INDEXED-TERM?", 1, 0, false);
        declareFunction("valid_indexed_term_robustP", "VALID-INDEXED-TERM-ROBUST?", 1, 0, false);
        declareFunction("invalid_indexed_termP", "INVALID-INDEXED-TERM?", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_indexing_datastructures.$invalid_indexed_termP$UnaryFunction();
        declareFunction("invalid_indexed_term_robustP", "INVALID-INDEXED-TERM-ROBUST?", 1, 0, false);
        declareFunction("sort_of_indexed_term_p", "SORT-OF-INDEXED-TERM-P", 1, 0, false);
        declareFunction("fully_indexed_term_p", "FULLY-INDEXED-TERM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_indexing_datastructures.$fully_indexed_term_p$UnaryFunction();
        declareFunction("valid_fully_indexed_term_p", "VALID-FULLY-INDEXED-TERM-P", 1, 0, false);
        declareMacro("do_indexed_terms", "DO-INDEXED-TERMS");
        declareFunction("index_p", "INDEX-P", 1, 0, false);
        declareFunction("index_installed_p", "INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("index_not_hosed_p", "INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("index_leaves", "INDEX-LEAVES", 1, 0, false);
        declareFunction("index_leaf_count", "INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("term_index", "TERM-INDEX", 1, 0, false);
        declareFunction("reset_term_index", "RESET-TERM-INDEX", 2, 0, false);
        declareFunction("clear_term_index", "CLEAR-TERM-INDEX", 1, 0, false);
        declareFunction("free_index", "FREE-INDEX", 1, 0, false);
        declareFunction("free_term_index", "FREE-TERM-INDEX", 1, 0, false);
        declareFunction("simple_index_p", "SIMPLE-INDEX-P", 1, 0, false);
        declareFunction("simple_index_installed_p", "SIMPLE-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("simple_index_not_hosed_p", "SIMPLE-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("simple_indexed_term_p", "SIMPLE-INDEXED-TERM-P", 1, 0, false);
        declareFunction("new_simple_index", "NEW-SIMPLE-INDEX", 0, 0, false);
        declareFunction("simple_index_leaves", "SIMPLE-INDEX-LEAVES", 1, 0, false);
        declareFunction("simple_index_leaf_count", "SIMPLE-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("simple_index_memberP", "SIMPLE-INDEX-MEMBER?", 2, 0, false);
        declareFunction("simple_num_index", "SIMPLE-NUM-INDEX", 1, 0, false);
        declareFunction("simple_term_assertion_list", "SIMPLE-TERM-ASSERTION-LIST", 1, 0, false);
        declareFunction("do_simple_index_term_assertion_list", "DO-SIMPLE-INDEX-TERM-ASSERTION-LIST", 1, 0, false);
        declareFunction("reset_term_simple_index", "RESET-TERM-SIMPLE-INDEX", 2, 0, false);
        declareFunction("simple_index_insert", "SIMPLE-INDEX-INSERT", 2, 0, false);
        declareFunction("simple_index_delete", "SIMPLE-INDEX-DELETE", 2, 0, false);
        declareFunction("free_simple_index", "FREE-SIMPLE-INDEX", 1, 0, false);
        declareFunction("complex_index_p", "COMPLEX-INDEX-P", 1, 0, false);
        declareFunction("complex_index_installed_p", "COMPLEX-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("complex_index_not_hosed_p", "COMPLEX-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("complex_indexed_term_p", "COMPLEX-INDEXED-TERM-P", 1, 0, false);
        declareFunction("complex_index_leaves", "COMPLEX-INDEX-LEAVES", 1, 0, false);
        declareFunction("complex_index_leaf_count", "COMPLEX-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("complex_index_lookup", "COMPLEX-INDEX-LOOKUP", 2, 0, false);
        declareFunction("term_complex_index_lookup", "TERM-COMPLEX-INDEX-LOOKUP", 2, 0, false);
        declareFunction("initialize_term_complex_index", "INITIALIZE-TERM-COMPLEX-INDEX", 1, 0, false);
        declareFunction("term_complex_index_set", "TERM-COMPLEX-INDEX-SET", 3, 0, false);
        declareFunction("term_complex_index_delete_key", "TERM-COMPLEX-INDEX-DELETE-KEY", 2, 0, false);
        declareFunction("free_complex_index", "FREE-COMPLEX-INDEX", 1, 0, false);
        declareFunction("subindex_p", "SUBINDEX-P", 1, 0, false);
        declareFunction("subindex_installed_p", "SUBINDEX-INSTALLED-P", 1, 0, false);
        declareFunction("subindex_not_hosed_p", "SUBINDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("subindex_lookup", "SUBINDEX-LOOKUP", 2, 0, false);
        declareFunction("subindex_leaves", "SUBINDEX-LEAVES", 1, 0, false);
        declareFunction("subindex_leaf_count", "SUBINDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("initialize_term_subindex", "INITIALIZE-TERM-SUBINDEX", 1, 0, false);
        declareFunction("free_subindex", "FREE-SUBINDEX", 1, 0, false);
        declareFunction("intermediate_index_p", "INTERMEDIATE-INDEX-P", 1, 0, false);
        declareFunction("intermediate_index_installed_p", "INTERMEDIATE-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("intermediate_index_not_hosed_p", "INTERMEDIATE-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("new_intermediate_index", "NEW-INTERMEDIATE-INDEX", 1, 0, false);
        declareMacro("do_intermediate_index", "DO-INTERMEDIATE-INDEX");
        declareFunction("do_intermediate_index_valid_index_p", "DO-INTERMEDIATE-INDEX-VALID-INDEX-P", 1, 0, false);
        declareFunction("intermediate_index_lookup", "INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
        declareFunction("intermediate_index_keys", "INTERMEDIATE-INDEX-KEYS", 1, 0, false);
        declareFunction("intermediate_index_leaf_count", "INTERMEDIATE-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("intermediate_index_leaves", "INTERMEDIATE-INDEX-LEAVES", 1, 0, false);
        declareFunction("intermediate_index_set", "INTERMEDIATE-INDEX-SET", 3, 0, false);
        declareFunction("intermediate_index_insert", "INTERMEDIATE-INDEX-INSERT", 3, 0, false);
        declareFunction("intermediate_index_insert_int", "INTERMEDIATE-INDEX-INSERT-INT", 4, 0, false);
        declareFunction("intermediate_index_delete", "INTERMEDIATE-INDEX-DELETE", 3, 0, false);
        declareFunction("intermediate_index_delete_key", "INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
        declareFunction("initialize_term_intermediate_index", "INITIALIZE-TERM-INTERMEDIATE-INDEX", 1, 0, false);
        declareFunction("free_intermediate_index", "FREE-INTERMEDIATE-INDEX", 1, 0, false);
        declareFunction("intermediate_index_leaf_count_reset", "INTERMEDIATE-INDEX-LEAF-COUNT-RESET", 2, 0, false);
        declareFunction("intermediate_index_leaf_count_inc", "INTERMEDIATE-INDEX-LEAF-COUNT-INC", 2, 0, false);
        declareFunction("intermediate_index_lookup_or_create_intermediate", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-INTERMEDIATE", 3, 0, false);
        declareFunction("intermediate_index_lookup_or_create_final", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-FINAL", 2, 0, false);
        declareFunction("intermediate_index_dictionary", "INTERMEDIATE-INDEX-DICTIONARY", 1, 0, false);
        declareFunction("intermediate_index_dictionary_set", "INTERMEDIATE-INDEX-DICTIONARY-SET", 3, 0, false);
        declareFunction("intermediate_index_dictionary_delete_key", "INTERMEDIATE-INDEX-DICTIONARY-DELETE-KEY", 2, 0, false);
        declareFunction("final_index_p", "FINAL-INDEX-P", 1, 0, false);
        declareFunction("final_index_installed_p", "FINAL-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("final_index_not_hosed_p", "FINAL-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("new_final_index", "NEW-FINAL-INDEX", 0, 0, false);
        declareMacro("do_final_index", "DO-FINAL-INDEX");
        declareFunction("do_final_index_valid_index_p", "DO-FINAL-INDEX-VALID-INDEX-P", 1, 0, false);
        declareFunction("final_index_leaf_count", "FINAL-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("final_index_leaves", "FINAL-INDEX-LEAVES", 1, 0, false);
        declareFunction("final_index_memberP", "FINAL-INDEX-MEMBER?", 2, 0, false);
        declareFunction("final_index_arbitrary_leaf", "FINAL-INDEX-ARBITRARY-LEAF", 1, 0, false);
        declareFunction("final_index_leaves_reset", "FINAL-INDEX-LEAVES-RESET", 2, 0, false);
        declareFunction("final_index_insert", "FINAL-INDEX-INSERT", 2, 0, false);
        declareFunction("final_index_delete", "FINAL-INDEX-DELETE", 2, 0, false);
        declareFunction("free_final_index", "FREE-FINAL-INDEX", 1, 0, false);
        declareFunction("final_index_set", "FINAL-INDEX-SET", 1, 0, false);
        declareFunction("indexing_leaf_p", "INDEXING-LEAF-P", 1, 0, false);
        declareFunction("indexing_leaf_installed_p", "INDEXING-LEAF-INSTALLED-P", 1, 0, false);
        declareFunction("indexing_leaf_not_hosed_p", "INDEXING-LEAF-NOT-HOSED-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_kb_indexing_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("setup_indexing_tables", "SETUP-INDEXING-TABLES", 1, 0, false);
            declareFunction("assertion_indexing_store", "ASSERTION-INDEXING-STORE", 0, 0, false);
            declareFunction("assertions_with_meta_assertions_count", "ASSERTIONS-WITH-META-ASSERTIONS-COUNT", 0, 0, false);
            declareFunction("assertion_indexing_store_reset", "ASSERTION-INDEXING-STORE-RESET", 1, 0, false);
            declareFunction("assertion_indexing_store_initial_size", "ASSERTION-INDEXING-STORE-INITIAL-SIZE", 0, 1, false);
            declareFunction("assertion_indexing_store_initialize", "ASSERTION-INDEXING-STORE-INITIALIZE", 0, 1, false);
            declareFunction("clear_assertion_indexing", "CLEAR-ASSERTION-INDEXING", 0, 0, false);
            declareFunction("clear_assertion_indexing_store", "CLEAR-ASSERTION-INDEXING-STORE", 0, 0, false);
            declareFunction("assertion_indexing_store_get", "ASSERTION-INDEXING-STORE-GET", 1, 0, false);
            declareFunction("assertion_indexing_store_remove", "ASSERTION-INDEXING-STORE-REMOVE", 1, 0, false);
            declareFunction("assertion_indexing_store_set", "ASSERTION-INDEXING-STORE-SET", 2, 0, false);
            declareMacro("do_assertions_with_meta_assertions", "DO-ASSERTIONS-WITH-META-ASSERTIONS");
            declareFunction("new_assertions_with_meta_assertions_iterator", "NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR", 0, 0, false);
            declareFunction("unindexed_syntax_constants", "UNINDEXED-SYNTAX-CONSTANTS", 0, 0, false);
            declareFunction("unindexed_syntax_constant_p", "UNINDEXED-SYNTAX-CONSTANT-P", 1, 0, false);
            declareFunction("indexed_term_p", "INDEXED-TERM-P", 1, 0, false);
            new kb_indexing_datastructures.$indexed_term_p$UnaryFunction();
            declareFunction("indexed_unrepresented_term_p", "INDEXED-UNREPRESENTED-TERM-P", 1, 0, false);
            declareFunction("valid_indexed_termP", "VALID-INDEXED-TERM?", 1, 0, false);
            declareFunction("valid_indexed_term_robustP", "VALID-INDEXED-TERM-ROBUST?", 1, 0, false);
            declareFunction("invalid_indexed_termP", "INVALID-INDEXED-TERM?", 1, 0, false);
            new kb_indexing_datastructures.$invalid_indexed_termP$UnaryFunction();
            declareFunction("invalid_indexed_term_robustP", "INVALID-INDEXED-TERM-ROBUST?", 1, 0, false);
            declareFunction("sort_of_indexed_term_p", "SORT-OF-INDEXED-TERM-P", 1, 0, false);
            declareFunction("fully_indexed_term_p", "FULLY-INDEXED-TERM-P", 1, 0, false);
            new kb_indexing_datastructures.$fully_indexed_term_p$UnaryFunction();
            declareFunction("valid_fully_indexed_term_p", "VALID-FULLY-INDEXED-TERM-P", 1, 0, false);
            declareMacro("do_indexed_terms", "DO-INDEXED-TERMS");
            declareFunction("index_p", "INDEX-P", 1, 0, false);
            declareFunction("index_installed_p", "INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("index_not_hosed_p", "INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("index_leaves", "INDEX-LEAVES", 1, 0, false);
            declareFunction("index_leaf_count", "INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("term_index", "TERM-INDEX", 1, 0, false);
            declareFunction("term_index_swapped_inP", "TERM-INDEX-SWAPPED-IN?", 1, 0, false);
            declareFunction("reset_term_index", "RESET-TERM-INDEX", 2, 0, false);
            declareFunction("clear_term_index", "CLEAR-TERM-INDEX", 1, 0, false);
            declareFunction("free_index", "FREE-INDEX", 1, 0, false);
            declareFunction("free_term_index", "FREE-TERM-INDEX", 1, 0, false);
            declareFunction("simple_index_p", "SIMPLE-INDEX-P", 1, 0, false);
            declareFunction("simple_index_installed_p", "SIMPLE-INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("simple_index_not_hosed_p", "SIMPLE-INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("simple_indexed_term_p", "SIMPLE-INDEXED-TERM-P", 1, 0, false);
            declareFunction("new_simple_index", "NEW-SIMPLE-INDEX", 0, 0, false);
            declareFunction("simple_index_leaves", "SIMPLE-INDEX-LEAVES", 1, 0, false);
            declareFunction("simple_index_leaf_count", "SIMPLE-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("simple_index_memberP", "SIMPLE-INDEX-MEMBER?", 2, 0, false);
            declareFunction("simple_num_index", "SIMPLE-NUM-INDEX", 1, 0, false);
            declareFunction("simple_term_assertion_list", "SIMPLE-TERM-ASSERTION-LIST", 1, 0, false);
            declareFunction("do_simple_index_term_assertion_list", "DO-SIMPLE-INDEX-TERM-ASSERTION-LIST", 1, 0, false);
            declareFunction("reset_term_simple_index", "RESET-TERM-SIMPLE-INDEX", 2, 0, false);
            declareFunction("simple_index_insert", "SIMPLE-INDEX-INSERT", 2, 0, false);
            declareFunction("simple_index_delete", "SIMPLE-INDEX-DELETE", 2, 0, false);
            declareFunction("free_simple_index", "FREE-SIMPLE-INDEX", 1, 0, false);
            declareMacro("with_current_complex_index_path", "WITH-CURRENT-COMPLEX-INDEX-PATH");
            declareFunction("current_complex_index_keys", "CURRENT-COMPLEX-INDEX-KEYS", 0, 0, false);
            declareFunction("copy_current_complex_index_keys", "COPY-CURRENT-COMPLEX-INDEX-KEYS", 0, 0, false);
            declareFunction("current_complex_index_term", "CURRENT-COMPLEX-INDEX-TERM", 0, 0, false);
            declareFunction("complex_index_keys_defined_p", "COMPLEX-INDEX-KEYS-DEFINED-P", 0, 0, false);
            declareFunction("complex_index_p", "COMPLEX-INDEX-P", 1, 0, false);
            declareFunction("complex_index_installed_p", "COMPLEX-INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("complex_index_not_hosed_p", "COMPLEX-INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("complex_indexed_term_p", "COMPLEX-INDEXED-TERM-P", 1, 0, false);
            declareFunction("complex_index_leaves", "COMPLEX-INDEX-LEAVES", 1, 0, false);
            declareFunction("complex_index_leaf_count", "COMPLEX-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("complex_index_lookup", "COMPLEX-INDEX-LOOKUP", 2, 0, false);
            declareFunction("term_complex_index_lookup", "TERM-COMPLEX-INDEX-LOOKUP", 2, 0, false);
            declareFunction("initialize_term_complex_index", "INITIALIZE-TERM-COMPLEX-INDEX", 1, 0, false);
            declareFunction("merge_complex_indices", "MERGE-COMPLEX-INDICES", 2, 0, false);
            declareFunction("term_complex_index_set", "TERM-COMPLEX-INDEX-SET", 3, 0, false);
            declareFunction("term_complex_index_delete_key", "TERM-COMPLEX-INDEX-DELETE-KEY", 2, 0, false);
            declareFunction("reserve_final_topn_index_for_term", "RESERVE-FINAL-TOPN-INDEX-FOR-TERM", 2, 0, false);
            declareFunction("free_complex_index", "FREE-COMPLEX-INDEX", 1, 0, false);
            declareFunction("subindex_p", "SUBINDEX-P", 1, 0, false);
            declareFunction("subindex_installed_p", "SUBINDEX-INSTALLED-P", 1, 0, false);
            declareFunction("subindex_not_hosed_p", "SUBINDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("subindex_lookup", "SUBINDEX-LOOKUP", 2, 0, false);
            declareFunction("subindex_leaves", "SUBINDEX-LEAVES", 1, 0, false);
            declareFunction("subindex_leaf_count", "SUBINDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("initialize_term_subindex", "INITIALIZE-TERM-SUBINDEX", 1, 0, false);
            declareFunction("free_subindex", "FREE-SUBINDEX", 1, 0, false);
            declareFunction("merge_sub_indices", "MERGE-SUB-INDICES", 2, 0, false);
            declareFunction("intermediate_index_p", "INTERMEDIATE-INDEX-P", 1, 0, false);
            declareFunction("intermediate_index_installed_p", "INTERMEDIATE-INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("intermediate_index_not_hosed_p", "INTERMEDIATE-INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("new_intermediate_index", "NEW-INTERMEDIATE-INDEX", 1, 0, false);
            declareFunction("clone_intermediate_index", "CLONE-INTERMEDIATE-INDEX", 1, 0, false);
            declareMacro("do_intermediate_index", "DO-INTERMEDIATE-INDEX");
            declareFunction("do_intermediate_index_valid_index_p", "DO-INTERMEDIATE-INDEX-VALID-INDEX-P", 1, 0, false);
            declareMacro("capture_changed_index_entry_hints", "CAPTURE-CHANGED-INDEX-ENTRY-HINTS");
            declareMacro("do_changed_intermediate_index", "DO-CHANGED-INTERMEDIATE-INDEX");
            declareFunction("segregate_index_changes_and_pristines", "SEGREGATE-INDEX-CHANGES-AND-PRISTINES", 1, 0, false);
            declareFunction("intermediate_index_lookup", "INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
            declareFunction("intermediate_index_keys", "INTERMEDIATE-INDEX-KEYS", 1, 0, false);
            declareFunction("intermediate_index_leaf_count", "INTERMEDIATE-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("intermediate_index_leaves", "INTERMEDIATE-INDEX-LEAVES", 1, 0, false);
            declareFunction("intermediate_index_set", "INTERMEDIATE-INDEX-SET", 3, 0, false);
            declareFunction("intermediate_index_replace_map", "INTERMEDIATE-INDEX-REPLACE-MAP", 2, 0, false);
            declareFunction("intermediate_index_touch", "INTERMEDIATE-INDEX-TOUCH", 2, 0, false);
            declareFunction("use_final_topn_indicesP", "USE-FINAL-TOPN-INDICES?", 0, 0, false);
            declareFunction("upgrade_final_indexP", "UPGRADE-FINAL-INDEX?", 1, 0, false);
            declareFunction("upgrade_combined_indices_to_final_indexP", "UPGRADE-COMBINED-INDICES-TO-FINAL-INDEX?", 2, 0, false);
            declareFunction("intermediate_index_insert", "INTERMEDIATE-INDEX-INSERT", 3, 0, false);
            declareFunction("intermediate_index_insert_int", "INTERMEDIATE-INDEX-INSERT-INT", 4, 0, false);
            declareFunction("intermediate_index_delete", "INTERMEDIATE-INDEX-DELETE", 3, 0, false);
            declareFunction("intermediate_index_delete_key", "INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
            declareFunction("merge_intermediate_indices", "MERGE-INTERMEDIATE-INDICES", 2, 0, false);
            declareFunction("initialize_term_intermediate_index", "INITIALIZE-TERM-INTERMEDIATE-INDEX", 1, 0, false);
            declareFunction("free_intermediate_index", "FREE-INTERMEDIATE-INDEX", 1, 0, false);
            declareFunction("intermediate_index_leaf_count_reset", "INTERMEDIATE-INDEX-LEAF-COUNT-RESET", 2, 0, false);
            declareFunction("intermediate_index_leaf_count_inc", "INTERMEDIATE-INDEX-LEAF-COUNT-INC", 2, 0, false);
            declareFunction("intermediate_index_lookup_or_create_intermediate", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-INTERMEDIATE", 3, 0, false);
            declareFunction("intermediate_index_lookup_or_create_final", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-FINAL", 2, 0, false);
            declareFunction("intermediate_index_map", "INTERMEDIATE-INDEX-MAP", 1, 0, false);
            declareFunction("intermediate_index_map_set", "INTERMEDIATE-INDEX-MAP-SET", 3, 0, false);
            declareFunction("intermediate_index_map_delete_key", "INTERMEDIATE-INDEX-MAP-DELETE-KEY", 2, 0, false);
            declareFunction("intermediate_index_map_touch", "INTERMEDIATE-INDEX-MAP-TOUCH", 2, 0, false);
            declareFunction("final_index_p", "FINAL-INDEX-P", 1, 0, false);
            declareFunction("final_index_installed_p", "FINAL-INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("final_index_not_hosed_p", "FINAL-INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("new_final_index", "NEW-FINAL-INDEX", 0, 0, false);
            declareMacro("do_final_index", "DO-FINAL-INDEX");
            declareMacro("do_ordered_final_index", "DO-ORDERED-FINAL-INDEX");
            declareFunction("final_index_leaf_count", "FINAL-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("final_index_leaves", "FINAL-INDEX-LEAVES", 1, 0, false);
            declareFunction("final_index_memberP", "FINAL-INDEX-MEMBER?", 2, 0, false);
            declareFunction("final_index_arbitrary_leaf", "FINAL-INDEX-ARBITRARY-LEAF", 1, 0, false);
            declareFunction("final_index_leaves_reset", "FINAL-INDEX-LEAVES-RESET", 2, 0, false);
            declareFunction("final_index_insert", "FINAL-INDEX-INSERT", 2, 0, false);
            declareFunction("final_index_delete", "FINAL-INDEX-DELETE", 2, 0, false);
            declareFunction("new_final_index_base_iterator", "NEW-FINAL-INDEX-BASE-ITERATOR", 1, 0, false);
            declareFunction("free_final_index", "FREE-FINAL-INDEX", 1, 0, false);
            declareFunction("final_unified_index_p", "FINAL-UNIFIED-INDEX-P", 1, 0, false);
            declareFunction("final_unified_index_installed_p", "FINAL-UNIFIED-INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("final_unified_index_not_hosed_p", "FINAL-UNIFIED-INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("new_final_unified_index", "NEW-FINAL-UNIFIED-INDEX", 0, 0, false);
            declareMacro("do_final_unified_index_internal", "DO-FINAL-UNIFIED-INDEX-INTERNAL");
            declareMacro("do_ordered_final_unified_index_internal", "DO-ORDERED-FINAL-UNIFIED-INDEX-INTERNAL");
            declareFunction("final_unified_index_leaf_count", "FINAL-UNIFIED-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("final_unified_index_leaves", "FINAL-UNIFIED-INDEX-LEAVES", 1, 0, false);
            declareFunction("final_unified_index_memberP", "FINAL-UNIFIED-INDEX-MEMBER?", 2, 0, false);
            declareFunction("final_unified_index_arbitrary_leaf", "FINAL-UNIFIED-INDEX-ARBITRARY-LEAF", 1, 0, false);
            declareFunction("final_unified_index_leaves_reset", "FINAL-UNIFIED-INDEX-LEAVES-RESET", 2, 0, false);
            declareFunction("final_unified_index_insert", "FINAL-UNIFIED-INDEX-INSERT", 2, 0, false);
            declareFunction("final_unified_index_delete", "FINAL-UNIFIED-INDEX-DELETE", 2, 0, false);
            declareFunction("final_unified_index_is_shardableP", "FINAL-UNIFIED-INDEX-IS-SHARDABLE?", 1, 0, false);
            declareFunction("new_final_unified_index_iterator", "NEW-FINAL-UNIFIED-INDEX-ITERATOR", 1, 0, false);
            declareFunction("free_final_unified_index", "FREE-FINAL-UNIFIED-INDEX", 1, 0, false);
            declareFunction("final_unified_index_set", "FINAL-UNIFIED-INDEX-SET", 1, 0, false);
            declareFunction("final_index_set_is_shardableP", "FINAL-INDEX-SET-IS-SHARDABLE?", 1, 0, false);
            declareFunction("new_final_sharded_index", "NEW-FINAL-SHARDED-INDEX", 3, 0, false);
            declareFunction("finshard_index_leaf_count", "FINSHARD-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("set_finshard_index_leaf_count", "SET-FINSHARD-INDEX-LEAF-COUNT", 2, 0, false);
            declareFunction("finshard_index_keys", "FINSHARD-INDEX-KEYS", 1, 0, false);
            declareFunction("set_finshard_index_keys", "SET-FINSHARD-INDEX-KEYS", 2, 0, false);
            declareFunction("finshard_index_map", "FINSHARD-INDEX-MAP", 1, 0, false);
            declareFunction("set_finshard_index_map", "SET-FINSHARD-INDEX-MAP", 2, 0, false);
            declareFunction("final_sharded_index_p", "FINAL-SHARDED-INDEX-P", 1, 0, false);
            declareFunction("final_sharded_index_empty_p", "FINAL-SHARDED-INDEX-EMPTY-P", 1, 0, false);
            declareFunction("final_sharded_index_leaf_count", "FINAL-SHARDED-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("final_sharded_index_leaves", "FINAL-SHARDED-INDEX-LEAVES", 1, 0, false);
            declareFunction("final_sharded_index_memberP", "FINAL-SHARDED-INDEX-MEMBER?", 2, 0, false);
            declareFunction("finshard_index_find_shard", "FINSHARD-INDEX-FIND-SHARD", 2, 0, false);
            declareFunction("finshard_index_find_shard_key_index", "FINSHARD-INDEX-FIND-SHARD-KEY-INDEX", 2, 0, false);
            declareFunction("final_sharded_index_arbitrary_leaf", "FINAL-SHARDED-INDEX-ARBITRARY-LEAF", 1, 0, false);
            declareMacro("do_final_sharded_index_internal", "DO-FINAL-SHARDED-INDEX-INTERNAL");
            declareMacro("do_ordered_final_sharded_index_internal", "DO-ORDERED-FINAL-SHARDED-INDEX-INTERNAL");
            declareFunction("final_sharded_index_shard_map", "FINAL-SHARDED-INDEX-SHARD-MAP", 1, 0, false);
            declareFunction("ordered_final_sharded_index_extract_contents", "ORDERED-FINAL-SHARDED-INDEX-EXTRACT-CONTENTS", 2, 0, false);
            declareFunction("possible_assertionL", "POSSIBLE-ASSERTION<", 2, 0, false);
            declareFunction("increment_finshard_index_leaf_count", "INCREMENT-FINSHARD-INDEX-LEAF-COUNT", 1, 1, false);
            declareFunction("decrement_finshard_index_leaf_count", "DECREMENT-FINSHARD-INDEX-LEAF-COUNT", 1, 1, false);
            declareFunction("append_finshard_index_keys", "APPEND-FINSHARD-INDEX-KEYS", 2, 0, false);
            declareFunction("final_sharded_index_leaves_reset", "FINAL-SHARDED-INDEX-LEAVES-RESET", 2, 0, false);
            declareFunction("final_sharded_index_insert", "FINAL-SHARDED-INDEX-INSERT", 2, 0, false);
            declareFunction("final_sharded_index_insert_internal", "FINAL-SHARDED-INDEX-INSERT-INTERNAL", 2, 0, false);
            declareFunction("final_sharded_index_insert_into_shard", "FINAL-SHARDED-INDEX-INSERT-INTO-SHARD", 3, 0, false);
            declareFunction("final_sharded_index_delete", "FINAL-SHARDED-INDEX-DELETE", 2, 0, false);
            declareFunction("reshard_final_sharded_index", "RESHARD-FINAL-SHARDED-INDEX", 1, 0, false);
            declareFunction("convert_final_simple_index_to_sharded_index", "CONVERT-FINAL-SIMPLE-INDEX-TO-SHARDED-INDEX", 1, 0, false);
            declareFunction("create_final_sharded_index", "CREATE-FINAL-SHARDED-INDEX", 1, 0, false);
            declareFunction("ncreate_final_sharded_index", "NCREATE-FINAL-SHARDED-INDEX", 1, 0, false);
            declareFunction("reorganize_modified_final_sharded_index", "REORGANIZE-MODIFIED-FINAL-SHARDED-INDEX", 1, 0, false);
            declareFunction("final_sharded_index_to_fvector_backed_sharded_index", "FINAL-SHARDED-INDEX-TO-FVECTOR-BACKED-SHARDED-INDEX", 3, 0, false);
            declareFunction("update_fvector_backed_final_sharded_index", "UPDATE-FVECTOR-BACKED-FINAL-SHARDED-INDEX", 3, 0, false);
            declareFunction("validate_final_sharded_index", "VALIDATE-FINAL-SHARDED-INDEX", 1, 0, false);
            declareFunction("new_final_sharded_index_iterator", "NEW-FINAL-SHARDED-INDEX-ITERATOR", 1, 0, false);
            declareFunction("free_final_sharded_index", "FREE-FINAL-SHARDED-INDEX", 1, 0, false);
            declareFunction("final_sharded_index_set", "FINAL-SHARDED-INDEX-SET", 1, 0, false);
            declareMacro("with_final_topn_index_tracking", "WITH-FINAL-TOPN-INDEX-TRACKING");
            declareMacro("without_final_topn_index_tracking", "WITHOUT-FINAL-TOPN-INDEX-TRACKING");
            declareFunction("possibly_note_new_final_topn_index", "POSSIBLY-NOTE-NEW-FINAL-TOPN-INDEX", 2, 0, false);
            declareFunction("final_topn_index_p", "FINAL-TOPN-INDEX-P", 1, 0, false);
            declareFunction("final_topn_index_count", "FINAL-TOPN-INDEX-COUNT", 1, 0, false);
            declareFunction("set_final_topn_index_count", "SET-FINAL-TOPN-INDEX-COUNT", 2, 0, false);
            declareFunction("inc_final_topn_index_count", "INC-FINAL-TOPN-INDEX-COUNT", 1, 1, false);
            declareFunction("dec_final_topn_index_count", "DEC-FINAL-TOPN-INDEX-COUNT", 1, 1, false);
            declareFunction("final_topn_index_term", "FINAL-TOPN-INDEX-TERM", 1, 0, false);
            declareFunction("final_topn_index_key_path", "FINAL-TOPN-INDEX-KEY-PATH", 1, 0, false);
            declareFunction("final_topn_index_installed_p", "FINAL-TOPN-INDEX-INSTALLED-P", 1, 0, false);
            declareFunction("final_topn_index_not_hosed_p", "FINAL-TOPN-INDEX-NOT-HOSED-P", 1, 0, false);
            declareFunction("new_final_topn_index", "NEW-FINAL-TOPN-INDEX", 2, 1, false);
            declareFunction("upgrade_final_index", "UPGRADE-FINAL-INDEX", 1, 0, false);
            declareFunction("new_final_topn_index_iterator", "NEW-FINAL-TOPN-INDEX-ITERATOR", 1, 0, false);
            declareFunction("final_topn_index_iterator_build_filter_args", "FINAL-TOPN-INDEX-ITERATOR-BUILD-FILTER-ARGS", 1, 0, false);
            declareFunction("assertion_matches_final_topn_indexkey_pathP", "ASSERTION-MATCHES-FINAL-TOPN-INDEXKEY-PATH?", 3, 0, false);
            declareFunction("new_ordered_final_topn_index_iterator", "NEW-ORDERED-FINAL-TOPN-INDEX-ITERATOR", 1, 0, false);
            declareMacro("do_final_topn_index_internal", "DO-FINAL-TOPN-INDEX-INTERNAL");
            declareMacro("do_ordered_final_topn_index_internal", "DO-ORDERED-FINAL-TOPN-INDEX-INTERNAL");
            declareFunction("final_topn_index_leaf_count", "FINAL-TOPN-INDEX-LEAF-COUNT", 1, 0, false);
            declareFunction("final_topn_index_leaves", "FINAL-TOPN-INDEX-LEAVES", 1, 0, false);
            declareFunction("final_topn_index_memberP", "FINAL-TOPN-INDEX-MEMBER?", 2, 0, false);
            declareFunction("final_topn_index_arbitrary_leaf", "FINAL-TOPN-INDEX-ARBITRARY-LEAF", 1, 0, false);
            declareFunction("final_topn_index_leaves_reset", "FINAL-TOPN-INDEX-LEAVES-RESET", 2, 0, false);
            declareFunction("final_topn_index_insert", "FINAL-TOPN-INDEX-INSERT", 2, 0, false);
            declareFunction("final_topn_index_delete", "FINAL-TOPN-INDEX-DELETE", 2, 0, false);
            declareFunction("free_final_topn_index", "FREE-FINAL-TOPN-INDEX", 1, 0, false);
            declareFunction("indexing_leaf_p", "INDEXING-LEAF-P", 1, 0, false);
            declareFunction("indexing_leaf_installed_p", "INDEXING-LEAF-INSTALLED-P", 1, 0, false);
            declareFunction("indexing_leaf_not_hosed_p", "INDEXING-LEAF-NOT-HOSED-P", 1, 0, false);
            declareFunction("indexing_leaf_suid", "INDEXING-LEAF-SUID", 1, 0, false);
            declareFunction("merge_final_indices", "MERGE-FINAL-INDICES", 2, 0, false);
            declareFunction("merge_final_indices_internal", "MERGE-FINAL-INDICES-INTERNAL", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("intermediate_index_dictionary", "INTERMEDIATE-INDEX-DICTIONARY", 1, 0, false);
            declareFunction("intermediate_index_dictionary_set", "INTERMEDIATE-INDEX-DICTIONARY-SET", 3, 0, false);
            declareFunction("intermediate_index_dictionary_delete_key", "INTERMEDIATE-INDEX-DICTIONARY-DELETE-KEY", 2, 0, false);
            declareFunction("do_final_index_valid_index_p", "DO-FINAL-INDEX-VALID-INDEX-P", 1, 0, false);
            declareFunction("final_index_set", "FINAL-INDEX-SET", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_kb_indexing_datastructures_file_Previous() {
        declareFunction("setup_indexing_tables", "SETUP-INDEXING-TABLES", 1, 0, false);
        declareFunction("assertion_indexing_store", "ASSERTION-INDEXING-STORE", 0, 0, false);
        declareFunction("assertions_with_meta_assertions_count", "ASSERTIONS-WITH-META-ASSERTIONS-COUNT", 0, 0, false);
        declareFunction("assertion_indexing_store_reset", "ASSERTION-INDEXING-STORE-RESET", 1, 0, false);
        declareFunction("assertion_indexing_store_initial_size", "ASSERTION-INDEXING-STORE-INITIAL-SIZE", 0, 1, false);
        declareFunction("assertion_indexing_store_initialize", "ASSERTION-INDEXING-STORE-INITIALIZE", 0, 1, false);
        declareFunction("clear_assertion_indexing", "CLEAR-ASSERTION-INDEXING", 0, 0, false);
        declareFunction("clear_assertion_indexing_store", "CLEAR-ASSERTION-INDEXING-STORE", 0, 0, false);
        declareFunction("assertion_indexing_store_get", "ASSERTION-INDEXING-STORE-GET", 1, 0, false);
        declareFunction("assertion_indexing_store_remove", "ASSERTION-INDEXING-STORE-REMOVE", 1, 0, false);
        declareFunction("assertion_indexing_store_set", "ASSERTION-INDEXING-STORE-SET", 2, 0, false);
        declareMacro("do_assertions_with_meta_assertions", "DO-ASSERTIONS-WITH-META-ASSERTIONS");
        declareFunction("new_assertions_with_meta_assertions_iterator", "NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR", 0, 0, false);
        declareFunction("unindexed_syntax_constants", "UNINDEXED-SYNTAX-CONSTANTS", 0, 0, false);
        declareFunction("unindexed_syntax_constant_p", "UNINDEXED-SYNTAX-CONSTANT-P", 1, 0, false);
        declareFunction("indexed_term_p", "INDEXED-TERM-P", 1, 0, false);
        new kb_indexing_datastructures.$indexed_term_p$UnaryFunction();
        declareFunction("indexed_unrepresented_term_p", "INDEXED-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction("valid_indexed_termP", "VALID-INDEXED-TERM?", 1, 0, false);
        declareFunction("valid_indexed_term_robustP", "VALID-INDEXED-TERM-ROBUST?", 1, 0, false);
        declareFunction("invalid_indexed_termP", "INVALID-INDEXED-TERM?", 1, 0, false);
        new kb_indexing_datastructures.$invalid_indexed_termP$UnaryFunction();
        declareFunction("invalid_indexed_term_robustP", "INVALID-INDEXED-TERM-ROBUST?", 1, 0, false);
        declareFunction("sort_of_indexed_term_p", "SORT-OF-INDEXED-TERM-P", 1, 0, false);
        declareFunction("fully_indexed_term_p", "FULLY-INDEXED-TERM-P", 1, 0, false);
        new kb_indexing_datastructures.$fully_indexed_term_p$UnaryFunction();
        declareFunction("valid_fully_indexed_term_p", "VALID-FULLY-INDEXED-TERM-P", 1, 0, false);
        declareMacro("do_indexed_terms", "DO-INDEXED-TERMS");
        declareFunction("index_p", "INDEX-P", 1, 0, false);
        declareFunction("index_installed_p", "INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("index_not_hosed_p", "INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("index_leaves", "INDEX-LEAVES", 1, 0, false);
        declareFunction("index_leaf_count", "INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("term_index", "TERM-INDEX", 1, 0, false);
        declareFunction("term_index_swapped_inP", "TERM-INDEX-SWAPPED-IN?", 1, 0, false);
        declareFunction("reset_term_index", "RESET-TERM-INDEX", 2, 0, false);
        declareFunction("clear_term_index", "CLEAR-TERM-INDEX", 1, 0, false);
        declareFunction("free_index", "FREE-INDEX", 1, 0, false);
        declareFunction("free_term_index", "FREE-TERM-INDEX", 1, 0, false);
        declareFunction("simple_index_p", "SIMPLE-INDEX-P", 1, 0, false);
        declareFunction("simple_index_installed_p", "SIMPLE-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("simple_index_not_hosed_p", "SIMPLE-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("simple_indexed_term_p", "SIMPLE-INDEXED-TERM-P", 1, 0, false);
        declareFunction("new_simple_index", "NEW-SIMPLE-INDEX", 0, 0, false);
        declareFunction("simple_index_leaves", "SIMPLE-INDEX-LEAVES", 1, 0, false);
        declareFunction("simple_index_leaf_count", "SIMPLE-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("simple_index_memberP", "SIMPLE-INDEX-MEMBER?", 2, 0, false);
        declareFunction("simple_num_index", "SIMPLE-NUM-INDEX", 1, 0, false);
        declareFunction("simple_term_assertion_list", "SIMPLE-TERM-ASSERTION-LIST", 1, 0, false);
        declareFunction("do_simple_index_term_assertion_list", "DO-SIMPLE-INDEX-TERM-ASSERTION-LIST", 1, 0, false);
        declareFunction("reset_term_simple_index", "RESET-TERM-SIMPLE-INDEX", 2, 0, false);
        declareFunction("simple_index_insert", "SIMPLE-INDEX-INSERT", 2, 0, false);
        declareFunction("simple_index_delete", "SIMPLE-INDEX-DELETE", 2, 0, false);
        declareFunction("free_simple_index", "FREE-SIMPLE-INDEX", 1, 0, false);
        declareMacro("with_current_complex_index_path", "WITH-CURRENT-COMPLEX-INDEX-PATH");
        declareFunction("current_complex_index_keys", "CURRENT-COMPLEX-INDEX-KEYS", 0, 0, false);
        declareFunction("copy_current_complex_index_keys", "COPY-CURRENT-COMPLEX-INDEX-KEYS", 0, 0, false);
        declareFunction("current_complex_index_term", "CURRENT-COMPLEX-INDEX-TERM", 0, 0, false);
        declareFunction("complex_index_keys_defined_p", "COMPLEX-INDEX-KEYS-DEFINED-P", 0, 0, false);
        declareFunction("complex_index_p", "COMPLEX-INDEX-P", 1, 0, false);
        declareFunction("complex_index_installed_p", "COMPLEX-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("complex_index_not_hosed_p", "COMPLEX-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("complex_indexed_term_p", "COMPLEX-INDEXED-TERM-P", 1, 0, false);
        declareFunction("complex_index_leaves", "COMPLEX-INDEX-LEAVES", 1, 0, false);
        declareFunction("complex_index_leaf_count", "COMPLEX-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("complex_index_lookup", "COMPLEX-INDEX-LOOKUP", 2, 0, false);
        declareFunction("term_complex_index_lookup", "TERM-COMPLEX-INDEX-LOOKUP", 2, 0, false);
        declareFunction("initialize_term_complex_index", "INITIALIZE-TERM-COMPLEX-INDEX", 1, 0, false);
        declareFunction("merge_complex_indices", "MERGE-COMPLEX-INDICES", 2, 0, false);
        declareFunction("term_complex_index_set", "TERM-COMPLEX-INDEX-SET", 3, 0, false);
        declareFunction("term_complex_index_delete_key", "TERM-COMPLEX-INDEX-DELETE-KEY", 2, 0, false);
        declareFunction("reserve_final_topn_index_for_term", "RESERVE-FINAL-TOPN-INDEX-FOR-TERM", 2, 0, false);
        declareFunction("free_complex_index", "FREE-COMPLEX-INDEX", 1, 0, false);
        declareFunction("subindex_p", "SUBINDEX-P", 1, 0, false);
        declareFunction("subindex_installed_p", "SUBINDEX-INSTALLED-P", 1, 0, false);
        declareFunction("subindex_not_hosed_p", "SUBINDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("subindex_lookup", "SUBINDEX-LOOKUP", 2, 0, false);
        declareFunction("subindex_leaves", "SUBINDEX-LEAVES", 1, 0, false);
        declareFunction("subindex_leaf_count", "SUBINDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("initialize_term_subindex", "INITIALIZE-TERM-SUBINDEX", 1, 0, false);
        declareFunction("free_subindex", "FREE-SUBINDEX", 1, 0, false);
        declareFunction("merge_sub_indices", "MERGE-SUB-INDICES", 2, 0, false);
        declareFunction("intermediate_index_p", "INTERMEDIATE-INDEX-P", 1, 0, false);
        declareFunction("intermediate_index_installed_p", "INTERMEDIATE-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("intermediate_index_not_hosed_p", "INTERMEDIATE-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("new_intermediate_index", "NEW-INTERMEDIATE-INDEX", 1, 0, false);
        declareFunction("clone_intermediate_index", "CLONE-INTERMEDIATE-INDEX", 1, 0, false);
        declareMacro("do_intermediate_index", "DO-INTERMEDIATE-INDEX");
        declareFunction("do_intermediate_index_valid_index_p", "DO-INTERMEDIATE-INDEX-VALID-INDEX-P", 1, 0, false);
        declareMacro("capture_changed_index_entry_hints", "CAPTURE-CHANGED-INDEX-ENTRY-HINTS");
        declareMacro("do_changed_intermediate_index", "DO-CHANGED-INTERMEDIATE-INDEX");
        declareFunction("segregate_index_changes_and_pristines", "SEGREGATE-INDEX-CHANGES-AND-PRISTINES", 1, 0, false);
        declareFunction("intermediate_index_lookup", "INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
        declareFunction("intermediate_index_keys", "INTERMEDIATE-INDEX-KEYS", 1, 0, false);
        declareFunction("intermediate_index_leaf_count", "INTERMEDIATE-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("intermediate_index_leaves", "INTERMEDIATE-INDEX-LEAVES", 1, 0, false);
        declareFunction("intermediate_index_set", "INTERMEDIATE-INDEX-SET", 3, 0, false);
        declareFunction("intermediate_index_replace_map", "INTERMEDIATE-INDEX-REPLACE-MAP", 2, 0, false);
        declareFunction("intermediate_index_touch", "INTERMEDIATE-INDEX-TOUCH", 2, 0, false);
        declareFunction("use_final_topn_indicesP", "USE-FINAL-TOPN-INDICES?", 0, 0, false);
        declareFunction("upgrade_final_indexP", "UPGRADE-FINAL-INDEX?", 1, 0, false);
        declareFunction("upgrade_combined_indices_to_final_indexP", "UPGRADE-COMBINED-INDICES-TO-FINAL-INDEX?", 2, 0, false);
        declareFunction("intermediate_index_insert", "INTERMEDIATE-INDEX-INSERT", 3, 0, false);
        declareFunction("intermediate_index_insert_int", "INTERMEDIATE-INDEX-INSERT-INT", 4, 0, false);
        declareFunction("intermediate_index_delete", "INTERMEDIATE-INDEX-DELETE", 3, 0, false);
        declareFunction("intermediate_index_delete_key", "INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
        declareFunction("merge_intermediate_indices", "MERGE-INTERMEDIATE-INDICES", 2, 0, false);
        declareFunction("initialize_term_intermediate_index", "INITIALIZE-TERM-INTERMEDIATE-INDEX", 1, 0, false);
        declareFunction("free_intermediate_index", "FREE-INTERMEDIATE-INDEX", 1, 0, false);
        declareFunction("intermediate_index_leaf_count_reset", "INTERMEDIATE-INDEX-LEAF-COUNT-RESET", 2, 0, false);
        declareFunction("intermediate_index_leaf_count_inc", "INTERMEDIATE-INDEX-LEAF-COUNT-INC", 2, 0, false);
        declareFunction("intermediate_index_lookup_or_create_intermediate", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-INTERMEDIATE", 3, 0, false);
        declareFunction("intermediate_index_lookup_or_create_final", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-FINAL", 2, 0, false);
        declareFunction("intermediate_index_map", "INTERMEDIATE-INDEX-MAP", 1, 0, false);
        declareFunction("intermediate_index_map_set", "INTERMEDIATE-INDEX-MAP-SET", 3, 0, false);
        declareFunction("intermediate_index_map_delete_key", "INTERMEDIATE-INDEX-MAP-DELETE-KEY", 2, 0, false);
        declareFunction("intermediate_index_map_touch", "INTERMEDIATE-INDEX-MAP-TOUCH", 2, 0, false);
        declareFunction("final_index_p", "FINAL-INDEX-P", 1, 0, false);
        declareFunction("final_index_installed_p", "FINAL-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("final_index_not_hosed_p", "FINAL-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("new_final_index", "NEW-FINAL-INDEX", 0, 0, false);
        declareMacro("do_final_index", "DO-FINAL-INDEX");
        declareMacro("do_ordered_final_index", "DO-ORDERED-FINAL-INDEX");
        declareFunction("final_index_leaf_count", "FINAL-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("final_index_leaves", "FINAL-INDEX-LEAVES", 1, 0, false);
        declareFunction("final_index_memberP", "FINAL-INDEX-MEMBER?", 2, 0, false);
        declareFunction("final_index_arbitrary_leaf", "FINAL-INDEX-ARBITRARY-LEAF", 1, 0, false);
        declareFunction("final_index_leaves_reset", "FINAL-INDEX-LEAVES-RESET", 2, 0, false);
        declareFunction("final_index_insert", "FINAL-INDEX-INSERT", 2, 0, false);
        declareFunction("final_index_delete", "FINAL-INDEX-DELETE", 2, 0, false);
        declareFunction("new_final_index_base_iterator", "NEW-FINAL-INDEX-BASE-ITERATOR", 1, 0, false);
        declareFunction("free_final_index", "FREE-FINAL-INDEX", 1, 0, false);
        declareFunction("final_unified_index_p", "FINAL-UNIFIED-INDEX-P", 1, 0, false);
        declareFunction("final_unified_index_installed_p", "FINAL-UNIFIED-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("final_unified_index_not_hosed_p", "FINAL-UNIFIED-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("new_final_unified_index", "NEW-FINAL-UNIFIED-INDEX", 0, 0, false);
        declareMacro("do_final_unified_index_internal", "DO-FINAL-UNIFIED-INDEX-INTERNAL");
        declareMacro("do_ordered_final_unified_index_internal", "DO-ORDERED-FINAL-UNIFIED-INDEX-INTERNAL");
        declareFunction("final_unified_index_leaf_count", "FINAL-UNIFIED-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("final_unified_index_leaves", "FINAL-UNIFIED-INDEX-LEAVES", 1, 0, false);
        declareFunction("final_unified_index_memberP", "FINAL-UNIFIED-INDEX-MEMBER?", 2, 0, false);
        declareFunction("final_unified_index_arbitrary_leaf", "FINAL-UNIFIED-INDEX-ARBITRARY-LEAF", 1, 0, false);
        declareFunction("final_unified_index_leaves_reset", "FINAL-UNIFIED-INDEX-LEAVES-RESET", 2, 0, false);
        declareFunction("final_unified_index_insert", "FINAL-UNIFIED-INDEX-INSERT", 2, 0, false);
        declareFunction("final_unified_index_delete", "FINAL-UNIFIED-INDEX-DELETE", 2, 0, false);
        declareFunction("final_unified_index_is_shardableP", "FINAL-UNIFIED-INDEX-IS-SHARDABLE?", 1, 0, false);
        declareFunction("new_final_unified_index_iterator", "NEW-FINAL-UNIFIED-INDEX-ITERATOR", 1, 0, false);
        declareFunction("free_final_unified_index", "FREE-FINAL-UNIFIED-INDEX", 1, 0, false);
        declareFunction("final_unified_index_set", "FINAL-UNIFIED-INDEX-SET", 1, 0, false);
        declareFunction("final_index_set_is_shardableP", "FINAL-INDEX-SET-IS-SHARDABLE?", 1, 0, false);
        declareFunction("new_final_sharded_index", "NEW-FINAL-SHARDED-INDEX", 3, 0, false);
        declareFunction("finshard_index_leaf_count", "FINSHARD-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("set_finshard_index_leaf_count", "SET-FINSHARD-INDEX-LEAF-COUNT", 2, 0, false);
        declareFunction("finshard_index_keys", "FINSHARD-INDEX-KEYS", 1, 0, false);
        declareFunction("set_finshard_index_keys", "SET-FINSHARD-INDEX-KEYS", 2, 0, false);
        declareFunction("finshard_index_map", "FINSHARD-INDEX-MAP", 1, 0, false);
        declareFunction("set_finshard_index_map", "SET-FINSHARD-INDEX-MAP", 2, 0, false);
        declareFunction("final_sharded_index_p", "FINAL-SHARDED-INDEX-P", 1, 0, false);
        declareFunction("final_sharded_index_empty_p", "FINAL-SHARDED-INDEX-EMPTY-P", 1, 0, false);
        declareFunction("final_sharded_index_leaf_count", "FINAL-SHARDED-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("final_sharded_index_leaves", "FINAL-SHARDED-INDEX-LEAVES", 1, 0, false);
        declareFunction("final_sharded_index_memberP", "FINAL-SHARDED-INDEX-MEMBER?", 2, 0, false);
        declareFunction("finshard_index_find_shard", "FINSHARD-INDEX-FIND-SHARD", 2, 0, false);
        declareFunction("finshard_index_find_shard_key_index", "FINSHARD-INDEX-FIND-SHARD-KEY-INDEX", 2, 0, false);
        declareFunction("final_sharded_index_arbitrary_leaf", "FINAL-SHARDED-INDEX-ARBITRARY-LEAF", 1, 0, false);
        declareMacro("do_final_sharded_index_internal", "DO-FINAL-SHARDED-INDEX-INTERNAL");
        declareMacro("do_ordered_final_sharded_index_internal", "DO-ORDERED-FINAL-SHARDED-INDEX-INTERNAL");
        declareFunction("final_sharded_index_shard_map", "FINAL-SHARDED-INDEX-SHARD-MAP", 1, 0, false);
        declareFunction("ordered_final_sharded_index_extract_contents", "ORDERED-FINAL-SHARDED-INDEX-EXTRACT-CONTENTS", 2, 0, false);
        declareFunction("possible_assertionL", "POSSIBLE-ASSERTION<", 2, 0, false);
        declareFunction("increment_finshard_index_leaf_count", "INCREMENT-FINSHARD-INDEX-LEAF-COUNT", 1, 1, false);
        declareFunction("decrement_finshard_index_leaf_count", "DECREMENT-FINSHARD-INDEX-LEAF-COUNT", 1, 1, false);
        declareFunction("append_finshard_index_keys", "APPEND-FINSHARD-INDEX-KEYS", 2, 0, false);
        declareFunction("final_sharded_index_leaves_reset", "FINAL-SHARDED-INDEX-LEAVES-RESET", 2, 0, false);
        declareFunction("final_sharded_index_insert", "FINAL-SHARDED-INDEX-INSERT", 2, 0, false);
        declareFunction("final_sharded_index_insert_internal", "FINAL-SHARDED-INDEX-INSERT-INTERNAL", 2, 0, false);
        declareFunction("final_sharded_index_insert_into_shard", "FINAL-SHARDED-INDEX-INSERT-INTO-SHARD", 3, 0, false);
        declareFunction("final_sharded_index_delete", "FINAL-SHARDED-INDEX-DELETE", 2, 0, false);
        declareFunction("reshard_final_sharded_index", "RESHARD-FINAL-SHARDED-INDEX", 1, 0, false);
        declareFunction("convert_final_simple_index_to_sharded_index", "CONVERT-FINAL-SIMPLE-INDEX-TO-SHARDED-INDEX", 1, 0, false);
        declareFunction("create_final_sharded_index", "CREATE-FINAL-SHARDED-INDEX", 1, 0, false);
        declareFunction("ncreate_final_sharded_index", "NCREATE-FINAL-SHARDED-INDEX", 1, 0, false);
        declareFunction("reorganize_modified_final_sharded_index", "REORGANIZE-MODIFIED-FINAL-SHARDED-INDEX", 1, 0, false);
        declareFunction("final_sharded_index_to_fvector_backed_sharded_index", "FINAL-SHARDED-INDEX-TO-FVECTOR-BACKED-SHARDED-INDEX", 3, 0, false);
        declareFunction("update_fvector_backed_final_sharded_index", "UPDATE-FVECTOR-BACKED-FINAL-SHARDED-INDEX", 3, 0, false);
        declareFunction("validate_final_sharded_index", "VALIDATE-FINAL-SHARDED-INDEX", 1, 0, false);
        declareFunction("new_final_sharded_index_iterator", "NEW-FINAL-SHARDED-INDEX-ITERATOR", 1, 0, false);
        declareFunction("free_final_sharded_index", "FREE-FINAL-SHARDED-INDEX", 1, 0, false);
        declareFunction("final_sharded_index_set", "FINAL-SHARDED-INDEX-SET", 1, 0, false);
        declareMacro("with_final_topn_index_tracking", "WITH-FINAL-TOPN-INDEX-TRACKING");
        declareMacro("without_final_topn_index_tracking", "WITHOUT-FINAL-TOPN-INDEX-TRACKING");
        declareFunction("possibly_note_new_final_topn_index", "POSSIBLY-NOTE-NEW-FINAL-TOPN-INDEX", 2, 0, false);
        declareFunction("final_topn_index_p", "FINAL-TOPN-INDEX-P", 1, 0, false);
        declareFunction("final_topn_index_count", "FINAL-TOPN-INDEX-COUNT", 1, 0, false);
        declareFunction("set_final_topn_index_count", "SET-FINAL-TOPN-INDEX-COUNT", 2, 0, false);
        declareFunction("inc_final_topn_index_count", "INC-FINAL-TOPN-INDEX-COUNT", 1, 1, false);
        declareFunction("dec_final_topn_index_count", "DEC-FINAL-TOPN-INDEX-COUNT", 1, 1, false);
        declareFunction("final_topn_index_term", "FINAL-TOPN-INDEX-TERM", 1, 0, false);
        declareFunction("final_topn_index_key_path", "FINAL-TOPN-INDEX-KEY-PATH", 1, 0, false);
        declareFunction("final_topn_index_installed_p", "FINAL-TOPN-INDEX-INSTALLED-P", 1, 0, false);
        declareFunction("final_topn_index_not_hosed_p", "FINAL-TOPN-INDEX-NOT-HOSED-P", 1, 0, false);
        declareFunction("new_final_topn_index", "NEW-FINAL-TOPN-INDEX", 2, 1, false);
        declareFunction("upgrade_final_index", "UPGRADE-FINAL-INDEX", 1, 0, false);
        declareFunction("new_final_topn_index_iterator", "NEW-FINAL-TOPN-INDEX-ITERATOR", 1, 0, false);
        declareFunction("final_topn_index_iterator_build_filter_args", "FINAL-TOPN-INDEX-ITERATOR-BUILD-FILTER-ARGS", 1, 0, false);
        declareFunction("assertion_matches_final_topn_indexkey_pathP", "ASSERTION-MATCHES-FINAL-TOPN-INDEXKEY-PATH?", 3, 0, false);
        declareFunction("new_ordered_final_topn_index_iterator", "NEW-ORDERED-FINAL-TOPN-INDEX-ITERATOR", 1, 0, false);
        declareMacro("do_final_topn_index_internal", "DO-FINAL-TOPN-INDEX-INTERNAL");
        declareMacro("do_ordered_final_topn_index_internal", "DO-ORDERED-FINAL-TOPN-INDEX-INTERNAL");
        declareFunction("final_topn_index_leaf_count", "FINAL-TOPN-INDEX-LEAF-COUNT", 1, 0, false);
        declareFunction("final_topn_index_leaves", "FINAL-TOPN-INDEX-LEAVES", 1, 0, false);
        declareFunction("final_topn_index_memberP", "FINAL-TOPN-INDEX-MEMBER?", 2, 0, false);
        declareFunction("final_topn_index_arbitrary_leaf", "FINAL-TOPN-INDEX-ARBITRARY-LEAF", 1, 0, false);
        declareFunction("final_topn_index_leaves_reset", "FINAL-TOPN-INDEX-LEAVES-RESET", 2, 0, false);
        declareFunction("final_topn_index_insert", "FINAL-TOPN-INDEX-INSERT", 2, 0, false);
        declareFunction("final_topn_index_delete", "FINAL-TOPN-INDEX-DELETE", 2, 0, false);
        declareFunction("free_final_topn_index", "FREE-FINAL-TOPN-INDEX", 1, 0, false);
        declareFunction("indexing_leaf_p", "INDEXING-LEAF-P", 1, 0, false);
        declareFunction("indexing_leaf_installed_p", "INDEXING-LEAF-INSTALLED-P", 1, 0, false);
        declareFunction("indexing_leaf_not_hosed_p", "INDEXING-LEAF-NOT-HOSED-P", 1, 0, false);
        declareFunction("indexing_leaf_suid", "INDEXING-LEAF-SUID", 1, 0, false);
        declareFunction("merge_final_indices", "MERGE-FINAL-INDICES", 2, 0, false);
        declareFunction("merge_final_indices_internal", "MERGE-FINAL-INDICES-INTERNAL", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_kb_indexing_datastructures_file_alt() {
        deflexical("*ASSERTION-INDEXING-STORE*", NIL != boundp($assertion_indexing_store$) ? ((SubLObject) ($assertion_indexing_store$.getGlobalValue())) : NIL);
        deflexical("*META-ASSERTION-FREQUENCY*", $float$0_015);
        deflexical("*UNINDEXED-SYNTAX-CONSTANTS*", $list_alt3);
        return NIL;
    }

    public static SubLObject init_kb_indexing_datastructures_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ASSERTION-INDEXING-STORE*", NIL != boundp($assertion_indexing_store$) ? $assertion_indexing_store$.getGlobalValue() : NIL);
            deflexical("*META-ASSERTION-FREQUENCY*", $float$0_05);
            deflexical("*UNINDEXED-SYNTAX-CONSTANTS*", $list21);
            defparameter("*CURRENT-COMPLEX-INDEX-TERM*", NIL);
            defparameter("*CURRENT-COMPLEX-INDEX-KEYS*", NIL);
            defparameter("*CURRENT-COMPLEX-INDEX-KEYS-IN-ORDER?*", T);
            defparameter("*CHANGED-INDEX-ENTRY-HINTS*", NIL);
            deflexical("*FINAL-TOPN-INDEX-CUTOFF-SIZE*", NIL);
            defparameter("*ORDERED-FINAL-INDEX-RESOURCE*", NIL);
            deflexical("*FINAL-SHARDED-INDEX-SHARD-SIZE*", NIL != boundp($final_sharded_index_shard_size$) ? $final_sharded_index_shard_size$.getGlobalValue() : $int$1000);
            defparameter("*RECENT-FINAL-TOPN-INDICES*", NIL);
            defparameter("*WITH-FINAL-TOPN-INDEX-TRACKING*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ASSERTION-INDEXING-STORE*", NIL != boundp($assertion_indexing_store$) ? ((SubLObject) ($assertion_indexing_store$.getGlobalValue())) : NIL);
            deflexical("*META-ASSERTION-FREQUENCY*", $float$0_015);
            deflexical("*UNINDEXED-SYNTAX-CONSTANTS*", $list_alt3);
        }
        return NIL;
    }

    public static SubLObject init_kb_indexing_datastructures_file_Previous() {
        deflexical("*ASSERTION-INDEXING-STORE*", NIL != boundp($assertion_indexing_store$) ? $assertion_indexing_store$.getGlobalValue() : NIL);
        deflexical("*META-ASSERTION-FREQUENCY*", $float$0_05);
        deflexical("*UNINDEXED-SYNTAX-CONSTANTS*", $list21);
        defparameter("*CURRENT-COMPLEX-INDEX-TERM*", NIL);
        defparameter("*CURRENT-COMPLEX-INDEX-KEYS*", NIL);
        defparameter("*CURRENT-COMPLEX-INDEX-KEYS-IN-ORDER?*", T);
        defparameter("*CHANGED-INDEX-ENTRY-HINTS*", NIL);
        deflexical("*FINAL-TOPN-INDEX-CUTOFF-SIZE*", NIL);
        defparameter("*ORDERED-FINAL-INDEX-RESOURCE*", NIL);
        deflexical("*FINAL-SHARDED-INDEX-SHARD-SIZE*", NIL != boundp($final_sharded_index_shard_size$) ? $final_sharded_index_shard_size$.getGlobalValue() : $int$1000);
        defparameter("*RECENT-FINAL-TOPN-INDICES*", NIL);
        defparameter("*WITH-FINAL-TOPN-INDEX-TRACKING*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kb_indexing_datastructures_file_alt() {
        declare_defglobal($assertion_indexing_store$);
        register_cyc_api_function(INDEXED_TERM_P, $list_alt5, $str_alt6$Returns_T_iff_OBJECT_is_an_indexe, NIL, $list_alt7);
        register_macro_helper(DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, DO_SIMPLE_INDEX);
        register_macro_helper(DO_INTERMEDIATE_INDEX_VALID_INDEX_P, DO_INTERMEDIATE_INDEX);
        register_macro_helper(INTERMEDIATE_INDEX_DICTIONARY, DO_INTERMEDIATE_INDEX);
        register_macro_helper(DO_FINAL_INDEX_VALID_INDEX_P, DO_FINAL_INDEX);
        register_macro_helper(FINAL_INDEX_SET, DO_FINAL_INDEX);
        return NIL;
    }

    public static SubLObject setup_kb_indexing_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($assertion_indexing_store$);
            register_macro_helper(NEW_ASSERTIONS_WITH_META_ASSERTIONS_ITERATOR, DO_ASSERTIONS_WITH_META_ASSERTIONS);
            register_cyc_api_function(INDEXED_TERM_P, $list23, $str24$Returns_T_iff_OBJECT_is_an_indexe, NIL, $list25);
            register_macro_helper(DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, DO_SIMPLE_INDEX);
            register_macro_helper(DO_INTERMEDIATE_INDEX_VALID_INDEX_P, DO_INTERMEDIATE_INDEX);
            register_macro_helper(SEGREGATE_INDEX_CHANGES_AND_PRISTINES, DO_CHANGED_INTERMEDIATE_INDEX);
            register_external_symbol($final_topn_index_cutoff_size$);
            register_macro_helper(INTERMEDIATE_INDEX_MAP, DO_INTERMEDIATE_INDEX);
            register_macro_helper(FINAL_UNIFIED_INDEX_SET, DO_FINAL_UNIFIED_INDEX);
            declare_defglobal($final_sharded_index_shard_size$);
            register_macro_helper(FINAL_SHARDED_INDEX_SHARD_MAP, DO_FINAL_SHARDED_INDEX_INTERNAL);
            register_macro_helper(ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS, DO_FINAL_SHARDED_INDEX_INTERNAL);
            register_macro_helper(FINAL_SHARDED_INDEX_SET, DO_FINAL_SHARDED_INDEX);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(INDEXED_TERM_P, $list_alt5, $str_alt6$Returns_T_iff_OBJECT_is_an_indexe, NIL, $list_alt7);
            register_macro_helper(INTERMEDIATE_INDEX_DICTIONARY, DO_INTERMEDIATE_INDEX);
            register_macro_helper(DO_FINAL_INDEX_VALID_INDEX_P, DO_FINAL_INDEX);
            register_macro_helper(FINAL_INDEX_SET, DO_FINAL_INDEX);
        }
        return NIL;
    }

    public static SubLObject setup_kb_indexing_datastructures_file_Previous() {
        declare_defglobal($assertion_indexing_store$);
        register_macro_helper(NEW_ASSERTIONS_WITH_META_ASSERTIONS_ITERATOR, DO_ASSERTIONS_WITH_META_ASSERTIONS);
        register_cyc_api_function(INDEXED_TERM_P, $list23, $str24$Returns_T_iff_OBJECT_is_an_indexe, NIL, $list25);
        register_macro_helper(DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, DO_SIMPLE_INDEX);
        register_macro_helper(DO_INTERMEDIATE_INDEX_VALID_INDEX_P, DO_INTERMEDIATE_INDEX);
        register_macro_helper(SEGREGATE_INDEX_CHANGES_AND_PRISTINES, DO_CHANGED_INTERMEDIATE_INDEX);
        register_external_symbol($final_topn_index_cutoff_size$);
        register_macro_helper(INTERMEDIATE_INDEX_MAP, DO_INTERMEDIATE_INDEX);
        register_macro_helper(FINAL_UNIFIED_INDEX_SET, DO_FINAL_UNIFIED_INDEX);
        declare_defglobal($final_sharded_index_shard_size$);
        register_macro_helper(FINAL_SHARDED_INDEX_SHARD_MAP, DO_FINAL_SHARDED_INDEX_INTERNAL);
        register_macro_helper(ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS, DO_FINAL_SHARDED_INDEX_INTERNAL);
        register_macro_helper(FINAL_SHARDED_INDEX_SET, DO_FINAL_SHARDED_INDEX);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_indexing_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_indexing_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_indexing_datastructures_file();
    }

    static {
    }

    public static final class $indexed_term_p$UnaryFunction extends UnaryFunction {
        public $indexed_term_p$UnaryFunction() {
            super(extractFunctionNamed("INDEXED-TERM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return indexed_term_p(arg1);
        }
    }

    public static final class $invalid_indexed_termP$UnaryFunction extends UnaryFunction {
        public $invalid_indexed_termP$UnaryFunction() {
            super(extractFunctionNamed("INVALID-INDEXED-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_indexed_termP(arg1);
        }
    }

    public static final class $fully_indexed_term_p$UnaryFunction extends UnaryFunction {
        public $fully_indexed_term_p$UnaryFunction() {
            super(extractFunctionNamed("FULLY-INDEXED-TERM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fully_indexed_term_p(arg1);
        }
    }
}

/**
 * Total time: 750 ms synthetic
 */
