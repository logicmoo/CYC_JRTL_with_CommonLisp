package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$generated_phrases_browsableP$;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_true;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_phrase extends SubLTranslatedFile {
    public static final SubLFile me = new pph_phrase();

    public static final String myName = "com.cyc.cycjava.cycl.pph_phrase";

    public static final String myFingerPrint = "179f396f5da8f1ae23f4be889d26b45d4833cc0a681045c5c762a8ccd2887860";

    // defparameter
    // Display pph-phrase-agr (of unfinished dtrs) during print-pph-phrase?
    public static final SubLSymbol $pph_phrase_display_agrP$ = makeSymbol("*PPH-PHRASE-DISPLAY-AGR?*");

    // defparameter
    public static final SubLSymbol $pph_warn_about_reverting_phrasesP$ = makeSymbol("*PPH-WARN-ABOUT-REVERTING-PHRASES?*");

    // defparameter
    private static final SubLSymbol $pph_phrase_copy_stack$ = makeSymbol("*PPH-PHRASE-COPY-STACK*");

    // defparameter
    private static final SubLSymbol $pph_phrase_copy_nesting_max$ = makeSymbol("*PPH-PHRASE-COPY-NESTING-MAX*");

    // deflexical
    private static final SubLSymbol $pph_phrase_nonlocal_feature_properties$ = makeSymbol("*PPH-PHRASE-NONLOCAL-FEATURE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $pph_special_types$ = makeSymbol("*PPH-SPECIAL-TYPES*");

    // defparameter
    private static final SubLSymbol $pph_variable_bindings$ = makeSymbol("*PPH-VARIABLE-BINDINGS*");

    // defparameter
    private static final SubLSymbol $pph_sanity_check_phrase_donenessP$ = makeSymbol("*PPH-SANITY-CHECK-PHRASE-DONENESS?*");

    // deflexical
    private static final SubLSymbol $pph_phrase_destroyer_grace_period$ = makeSymbol("*PPH-PHRASE-DESTROYER-GRACE-PERIOD*");





    // defparameter
    private static final SubLSymbol $warn_on_invalid_pph_inferencesP$ = makeSymbol("*WARN-ON-INVALID-PPH-INFERENCES?*");

    // defparameter
    public static final SubLSymbol $pph_do_alternatives_max$ = makeSymbol("*PPH-DO-ALTERNATIVES-MAX*");

    // defparameter
    // Protection against mother-daughter cycles.
    private static final SubLSymbol $pph_root_mother_list$ = makeSymbol("*PPH-ROOT-MOTHER-LIST*");

    // defparameter
    public static final SubLSymbol $pph_variant_list_max_count$ = makeSymbol("*PPH-VARIANT-LIST-MAX-COUNT*");

    // defparameter
    private static final SubLSymbol $pph_phrase_category_depth$ = makeSymbol("*PPH-PHRASE-CATEGORY-DEPTH*");



    // defconstant
    /**
     * What the CycL slot of a PPH phrase is set to if we don't know what it
     * denotes.
     */
    private static final SubLSymbol $pph_unknown_cycl$ = makeSymbol("*PPH-UNKNOWN-CYCL*");

    // defconstant
    /**
     * What the CycL slot of a PPH phrase is set to if it doesn't denote anything in
     * the input.
     */
    private static final SubLSymbol $pph_empty_cycl$ = makeSymbol("*PPH-EMPTY-CYCL*");



    // Internal Constants
    public static final SubLString $str0$Keeping_generic_arg__S_ = makeString("Keeping generic arg ~S.");

    public static final SubLString $str1$Not_keeping_generic_arg__S_ = makeString("Not keeping generic arg ~S.");

    public static final SubLList $list2 = list(list(makeSymbol("DTR"), makeSymbol("PHRASE"), makeSymbol("DTR-NUM")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list4 = list(ZERO_INTEGER);





    private static final SubLSymbol SIGN_CONSTITUENTS = makeSymbol("SIGN-CONSTITUENTS");

    private static final SubLSymbol SIGN_DO_CONSTITUENTS = makeSymbol("SIGN-DO-CONSTITUENTS");



    private static final SubLString $str10$ = makeString("");

    private static final SubLString $str11$_INVALID_PPH_PHRASE_ = makeString("<INVALID PPH PHRASE>");

    private static final SubLString $str12$___Dtr___A__ = makeString("~% Dtr #~A: ");

    private static final SubLString $str13$___PPH_PHRASE__S = makeString("~%<PPH-PHRASE ~S");

    private static final SubLList $list14 = list(cons(makeSymbol("PPH-PHRASE-NOTED-STRING"), makeString("string")), cons(makeSymbol("SIGN-CATEGORY"), makeString("category")), cons(makeSymbol("PPH-PHRASE-CYCL"), makeString("cycl")), cons(makeSymbol("PPH-PHRASE-AGR"), makeString("agr")), cons(makeSymbol("PPH-PHRASE-WU"), makeString("wu")), cons(makeSymbol("PPH-PHRASE-CASE"), makeString("case")), cons(makeSymbol("PPH-PHRASE-OUTPUT-LIST"), makeString("output list")), cons(makeSymbol("PPH-PHRASE-JUSTIFICATION"), makeString("justification")));

    private static final SubLList $list15 = cons(makeSymbol("SLOT"), makeSymbol("STRING"));



    private static final SubLString $str17$__A___S__ = makeString(" ~A: ~S~%");

    private static final SubLString $str18$__S__ = makeString(" ~S~%");

    private static final SubLString $str19$_ = makeString("-");

    private static final SubLString $str20$__head_ = makeString(" (head)");

    private static final SubLString $str21$___Dtrs_ = makeString("~& Dtrs:");

    private static final SubLString $str22$_Head_ = makeString(" Head:");

    private static final SubLString $str23$__S = makeString(" ~S");

    private static final SubLString $str24$___S__A_ = makeString(" (~S ~A)");

    private static final SubLString $str25$_ = makeString(">");

    private static final SubLSymbol PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE = makeSymbol("PPH-MAYBE-WARN-ABOUT-REVERTING-PHRASE");

    private static final SubLString $str27$Failed_to_paraphrase__S___categor = makeString("Failed to paraphrase ~S~% category: ~S preds: ~S");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLList $list30 = list(list(makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list32 = list(makeSymbol("CAND"), list(makeSymbol("STACK-P"), makeSymbol("*PPH-PHRASE-COPY-STACK*")), list(makeSymbol(">"), list(makeSymbol("STACK-SIZE"), makeSymbol("*PPH-PHRASE-COPY-STACK*")), makeSymbol("*PPH-PHRASE-COPY-NESTING-MAX*")));

    public static final SubLList $list33 = list(makeSymbol("PPH-ERROR"), ONE_INTEGER, makeString("~&Recursion limit (~S) exceeded in PPH-PHRASE-COPY."), makeSymbol("*PPH-PHRASE-COPY-NESTING-MAX*"));

    public static final SubLList $list34 = list(list(makeSymbol("*PPH-PHRASE-COPY-STACK*"), list(makeSymbol("FIND-OR-CREATE-PPH-PHRASE-COPY-STACK"))));



    private static final SubLList $list36 = list(makeSymbol("*PPH-PHRASE-COPY-STACK*"));





    private static final SubLList $list39 = list(list(makeSymbol("STACK-POP"), makeSymbol("*PPH-PHRASE-COPY-STACK*")));

    private static final SubLSymbol FIND_OR_CREATE_PPH_PHRASE_COPY_STACK = makeSymbol("FIND-OR-CREATE-PPH-PHRASE-COPY-STACK");

    private static final SubLSymbol WITH_PPH_PHRASE_COPY_RECURSION_PROTECTION = makeSymbol("WITH-PPH-PHRASE-COPY-RECURSION-PROTECTION");

    private static final SubLSymbol STACK_P = makeSymbol("STACK-P");

    private static final SubLString $str43$__Copying_phrase____S = makeString("~&Copying phrase~% ~S");

    private static final SubLString $str44$Can_t_reuse_old_phrase_____S__ = makeString("Can't reuse old phrase:~% ~S~%");

    private static final SubLSymbol $kw45$NON_LOCAL_FEATURES_IGNORED_ = makeKeyword("NON-LOCAL-FEATURES-IGNORED?");

    private static final SubLString $str46$__Copying_nonlocal_features_of___ = makeString("~&Copying nonlocal features of~% ~S from~% ~S");

    private static final SubLString $str47$__Reusing_copy_of_phrase_____S__ = makeString("~&Reusing copy of phrase:~% ~S~%");

    private static final SubLString $str48$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str49$__ = makeString(") ");

    private static final SubLString $str50$__Recursion_limit___S__exceeded_i = makeString("~&Recursion limit (~S) exceeded in PPH-PHRASE-COPY.");



    private static final SubLString $str52$__Set_top_level_demerits_to__S = makeString("~&Set top-level demerits to ~S");

    private static final SubLString $str53$__Set_output_list_to__S = makeString("~&Set output list to ~S");

    private static final SubLString $str54$__Set_category_to__S = makeString("~&Set category to ~S");

    private static final SubLString $str55$__Copied_noted_string__S = makeString("~&Copied noted string ~S");

    private static final SubLString $str56$__Setting_agr_to__S = makeString("~&Setting agr to ~S");

    private static final SubLString $str57$__Set_agr_to__S = makeString("~&Set agr to ~S");

    private static final SubLList $list58 = list(makeKeyword("MOTHER"), makeKeyword("ALTERNATIVES"));



    private static final SubLSymbol $sym60$CLOSED_LEXICAL_CLASS_STRING_ = makeSymbol("CLOSED-LEXICAL-CLASS-STRING?");



    private static final SubLList $list62 = list(makeKeyword("PERCENT-PHRASE"), makeKeyword("SYMBOL-PHRASE"), makeKeyword("CYCL-PHRASE"), makeKeyword("QUOTED-PARAPHRASE"), makeKeyword("STRING-MENTION"), makeKeyword("CLARIFYING"));



























    private static final SubLList $list76 = list(makeSymbol("QUERY-EL-FORMULA"), makeSymbol("SUB-PHRASE-NAUT"));



    private static final SubLSymbol $QUERY_EL_FORMULA = makeKeyword("QUERY-EL-FORMULA");

    private static final SubLString $str79$Couldn_t_find__S___in__S = makeString("Couldn't find ~S~% in ~S");

    private static final SubLSymbol $sym80$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA = makeSymbol("PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-QUERY-EL-FORMULA");

    private static final SubLList $list82 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("FORGET-EXTRA-RESULTS?"), T, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS") });

    private static final SubLString $str83$Couldn_t_find_bindings_for__S = makeString("Couldn't find bindings for ~S");

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLString $str85$Can_t_resolve__S_due_to__S = makeString("Can't resolve ~S due to ~S");

    private static final SubLList $list86 = list(makeSymbol("*PPH-VARIABLE-BINDINGS*"), makeSymbol("SUPPORTS"));





    private static final SubLSymbol $CHEMICAL_FORMULA_FROM_LISTS = makeKeyword("CHEMICAL-FORMULA-FROM-LISTS");

    private static final SubLList $list90 = list(makeSymbol("ELEMENT-LIST"), makeSymbol("QUANTITY-LIST"));



    private static final SubLString $str92$NEW_PPH_CONDITIONAL_PHRASE_passed = makeString("NEW-PPH-CONDITIONAL-PHRASE passed bogus phrase-naut: ~S");

    private static final SubLList $list93 = list(makeSymbol("TEST"), makeSymbol("PHRASE-NAUT-IF"), makeSymbol("&OPTIONAL"), list(makeSymbol("PHRASE-NAUT-IF-NOT"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BESTNLPHRASEOFSTRINGFN")), makeSymbol("*EMPTY-STRING*"))));



    private static final SubLString $str95$__ConditionalPhraseFn_expects_a_c = makeString("#$ConditionalPhraseFn expects a closed formula for its arg1, not ~S");





    private static final SubLList $list98 = list(makeSymbol("CONSTRAINT"), makeSymbol("LIST"), makeSymbol("LIST-TYPE"));

    private static final SubLObject $$FormulaArgFn = reader_make_constant_shell(makeString("FormulaArgFn"));









    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLSymbol $sym106$_ID_STRING = makeSymbol("?ID-STRING");

    private static final SubLObject $$htmlListTypeIdentifierString = reader_make_constant_shell(makeString("htmlListTypeIdentifierString"));

    private static final SubLList $list108 = list(makeSymbol("?ID-STRING"));

    private static final SubLObject $$HTMLRepresentationMt = reader_make_constant_shell(makeString("HTMLRepresentationMt"));

    private static final SubLObject $$CoordinatingConjunction = reader_make_constant_shell(makeString("CoordinatingConjunction"));

    private static final SubLObject $$Feminine_NLAttr = reader_make_constant_shell(makeString("Feminine-NLAttr"));

    private static final SubLObject $$ThirdPerson_NLAttr = reader_make_constant_shell(makeString("ThirdPerson-NLAttr"));



    private static final SubLObject $$Plural_NLAttr = reader_make_constant_shell(makeString("Plural-NLAttr"));

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell(makeString("Singular-NLAttr"));

    private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));

    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));



    private static final SubLList $list119 = list(makeSymbol("FIRST-ARG-SPECIFIER"), makeSymbol("FIRST-PHRASE-NAUT"));

    private static final SubLString $str120$Found_non_phrase_dtr___S = makeString("Found non-phrase dtr: ~S");



    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_LOOSE_P = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list125 = list(reader_make_constant_shell(makeString("posForms")), reader_make_constant_shell(makeString("posBaseForms")));

    public static final SubLList $list126 = list(reader_make_constant_shell(makeString("A-TheWord")), reader_make_constant_shell(makeString("An-TheWord")));

    public static final SubLList $list127 = list(reader_make_constant_shell(makeString("Indefinite-NLAttr")));

    private static final SubLObject $$The_TheWord = reader_make_constant_shell(makeString("The-TheWord"));

    private static final SubLObject $$Definite_NLAttr = reader_make_constant_shell(makeString("Definite-NLAttr"));



    private static final SubLString $str131$_S_not_considered_done_ = makeString("~S not considered done.");

    private static final SubLObject $$Between_TheWord = reader_make_constant_shell(makeString("Between-TheWord"));

    private static final SubLString $$$between = makeString("between");

    private static final SubLObject $$EnDash_TheSymbol = reader_make_constant_shell(makeString("EnDash-TheSymbol"));

    private static final SubLString $str135$Destroying_dtrs_of__S = makeString("Destroying dtrs of ~S");

    private static final SubLString $str136$Destroyed_failed_phrase_dtrs____N = makeString("Destroyed failed phrase dtrs.~% New PPH phrase count went from ~S to ~S.~%");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLSymbol $pph_phrase_destroyer$ = makeSymbol("*PPH-PHRASE-DESTROYER*");

    private static final SubLSymbol VALID_PPH_PHRASE_P = makeSymbol("VALID-PPH-PHRASE-P");

    private static final SubLSymbol DESTROY_PPH_PHRASE_LOW = makeSymbol("DESTROY-PPH-PHRASE-LOW");

    private static final SubLSymbol SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND = makeSymbol("SMITE-DOOMED-PPH-PHRASES-NEXT-TIME-AROUND");



    private static final SubLString $$$Socket_Connection_Handler = makeString("Socket Connection Handler");

    private static final SubLSymbol WARN_ABOUT_PPH_PHRASE_DESTRUCTION = makeSymbol("WARN-ABOUT-PPH-PHRASE-DESTRUCTION");

    private static final SubLString $str145$Destroy_PPH_phrases_is__S_for__S = makeString("Destroy PPH phrases is ~S for ~S");

    private static final SubLSymbol $warn_about_pph_phrase_destruction_caching_state$ = makeSymbol("*WARN-ABOUT-PPH-PHRASE-DESTRUCTION-CACHING-STATE*");





















    private static final SubLSymbol $HEAD_DTR_NUM = makeKeyword("HEAD-DTR-NUM");





    private static final SubLSymbol $RESERVED_FOR_MATRIX_ARG0 = makeKeyword("RESERVED-FOR-MATRIX-ARG0");









    private static final SubLString $str165$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");



    private static final SubLSymbol FIND_INFERENCE_BY_IDS = makeSymbol("FIND-INFERENCE-BY-IDS");

    private static final SubLString $str168$__Setting_object_dtr_agr_to_accus = makeString("~&Setting object dtr agr to accusative case.~%");



    private static final SubLString $str170$__Setting_possessive_dtr_agr_to_g = makeString("~&Setting possessive dtr agr to genitive case.~%");



    private static final SubLObject $$PossessivePhrase = reader_make_constant_shell(makeString("PossessivePhrase"));

    private static final SubLSymbol PPH_PHRASE_CATEGORY = makeSymbol("PPH-PHRASE-CATEGORY");

    private static final SubLString $str174$Dtr_2_of_phrase_is_object_of__S__ = makeString("Dtr 2 of phrase is object of ~S:~% ~S~%");

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$TransitiveNPFrame = reader_make_constant_shell(makeString("TransitiveNPFrame"));

    private static final SubLString $str177$__Setting_subject_dtr_agr_to_nomi = makeString("~&Setting subject dtr agr to nominative case.~%");



    public static final SubLList $list179 = cons(makeSymbol("PROBLEM-TYPE"), makeSymbol("OTHER-INFO"));

    private static final SubLString $$$_reported_a_ = makeString(" reported a ");

    private static final SubLString $$$_problem = makeString(" problem");

    private static final SubLString $str182$_with_this_additional_info_ = makeString(" with this additional info:");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str184$_ = makeString(".");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLList $list186 = list(list(makeSymbol("ALTERNATIVE"), makeSymbol("DIRECT-ALTERNATIVE-OF"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym187$QUEUE = makeUninternedSymbol("QUEUE");

    private static final SubLSymbol $sym188$DONE_COUNT = makeUninternedSymbol("DONE-COUNT");

    private static final SubLList $list189 = list(list(makeSymbol("CREATE-QUEUE")));











    private static final SubLSymbol PPH_PHRASE_LOCAL_ALTERNATIVES = makeSymbol("PPH-PHRASE-LOCAL-ALTERNATIVES");

    private static final SubLSymbol $sym196$__ = makeSymbol(">=");

    private static final SubLList $list197 = list(makeSymbol("*PPH-DO-ALTERNATIVES-MAX*"));

    private static final SubLSymbol PPH_ERROR = makeSymbol("PPH-ERROR");

    private static final SubLString $str199$Done__S_alternatives_of__S = makeString("Done ~S alternatives of ~S");

    private static final SubLString $str200$Setting_phrase_s_mother_to_itself = makeString("Setting phrase's mother to itself.");

    private static final SubLObject $$NLSentence = reader_make_constant_shell(makeString("NLSentence"));

    private static final SubLString $str202$Mother_is_part_of_cycle___S = makeString("Mother is part of cycle: ~S");

    private static final SubLString $str203$PPH_PHRASE_ADD_JUSTIFICATION_pass = makeString("PPH-PHRASE-ADD-JUSTIFICATION passed NIL.");











    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));



    private static final SubLSymbol $sym211$PPH_VARIANT_STRING__ = makeSymbol("PPH-VARIANT-STRING-=");

    private static final SubLString $str212$Ignoring_possible_variants_for_me = makeString("Ignoring possible variants for meta phrase~% ~S");

    private static final SubLSymbol $sym213$VARIANT_HAS_MISSING_TARGET_ = makeSymbol("VARIANT-HAS-MISSING-TARGET?");

    private static final SubLString $str214$Generated__D_dtr_variant_lists_fo = makeString("Generated ~D dtr variant lists for ~A.");

    private static final SubLString $$$current_phrase = makeString("current phrase");

    private static final SubLSymbol PPH_VARIANT_STRING = makeSymbol("PPH-VARIANT-STRING");

    private static final SubLSymbol PPH_ANCESTOR_PHRASE_OR_SELF_P = makeSymbol("PPH-ANCESTOR-PHRASE-OR-SELF-P");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");

    private static final SubLString $str219$Failed_to_get_string_for_variant_ = makeString("Failed to get string for variant~% ~S");

    private static final SubLList $list220 = cons(makeKeyword("NOSPACE"), makeKeyword("ANYTHING"));

    private static final SubLString $str221$Auto_nested_PPH_phrase_variant__M = makeString("Auto-nested PPH phrase variant. Matrix phrase: ~S");

    private static final SubLString $str222$PPH_phrase_variant_with_nesting_d = makeString("PPH phrase variant with nesting depth > 10. Matrix phrase: ~S");

    private static final SubLList $list223 = list(makeString("a"), makeString("an"));

    private static final SubLList $list224 = list(makeKeyword("A"), NIL);



    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_STRING = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");



    private static final SubLString $str228$Failed_to_note__S_on__S___Noted_s = makeString("Failed to note ~S on ~S~% Noted string: ~S.");



    private static final SubLString $$$href = makeString("href");

    private static final SubLString $str231$__Adding_new_tag_inside_old___ = makeString("~&Adding new tag inside old.~%");

    private static final SubLString $str232$__Setting_string_to__S___S_ = makeString("~&Setting string to ~S (~S)");

    private static final SubLString $str233$_S_is_a_forbidden_paraphrase_for_ = makeString("~S is a forbidden paraphrase for ~S");

    private static final SubLString $str234$__Output_list_1___S = makeString("~&Output list 1: ~S");

    private static final SubLString $str235$__Output_item____S = makeString("~&Output item : ~S");

    private static final SubLString $str236$__output_item_2____S = makeString("~&output item 2 : ~S");

    private static final SubLString $str237$__output_item_3____S = makeString("~&output item 3 : ~S");

    private static final SubLString $str238$__output_item_4____S = makeString("~&output item 4 : ~S");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_COPY = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-COPY");



    private static final SubLString $str241$NP_is_heavy_based_on_string__S = makeString("NP is heavy based on string ~S");

    private static final SubLString $str242$NP_is_heavy_based_on_dtrs_ = makeString("NP is heavy based on dtrs.");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$Be_TheWord = reader_make_constant_shell(makeString("Be-TheWord"));

    private static final SubLObject $$AuxVerb = reader_make_constant_shell(makeString("AuxVerb"));

    private static final SubLObject $$posForms = reader_make_constant_shell(makeString("posForms"));

    private static final SubLList $list247 = list(reader_make_constant_shell(makeString("AuxVerb")));

    private static final SubLList $list248 = list(reader_make_constant_shell(makeString("untensed")));

    private static final SubLObject $$OrdinalAdjective = reader_make_constant_shell(makeString("OrdinalAdjective"));

    private static final SubLSymbol $pph_phrase_category_max_depth$ = makeSymbol("*PPH-PHRASE-CATEGORY-MAX-DEPTH*");

    private static final SubLInteger $int$99 = makeInteger(99);

    private static final SubLString $str252$Excessive_recursion___S__in_PPH_P = makeString("Excessive recursion (~S) in PPH-PHRASE-CATEGORY.");

    private static final SubLString $str253$__Setting_CycL_phrase_s_category_ = makeString("~&Setting CycL phrase's category to ~S.~%");



    private static final SubLString $str255$Possessivizing_NP_ = makeString("Possessivizing NP.");

    private static final SubLString $str256$Nominalizing_a_possessive_ = makeString("Nominalizing a possessive.");





    private static final SubLString $str259$Converting_NP_to__instance_of__Nb = makeString("Converting NP to 'instance of' Nbar: ~S");

    private static final SubLList $list260 = list(reader_make_constant_shell(makeString("CountNoun")), reader_make_constant_shell(makeString("Instance-TheWord")));

    private static final SubLList $list261 = list(reader_make_constant_shell(makeString("Preposition")), reader_make_constant_shell(makeString("Of-TheWord")));

    private static final SubLString $str262$New_Nbar___S = makeString("New Nbar: ~S");



    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLString $str265$Don_t_know_how_to_reconcile__S_an = makeString("Don't know how to reconcile ~S and ~S.");

    private static final SubLSymbol $PPH_UNKNOWN_CYCL = makeKeyword("PPH-UNKNOWN-CYCL");

    private static final SubLSymbol $PPH_EMPTY_CYCL = makeKeyword("PPH-EMPTY-CYCL");

    private static final SubLString $str268$Couldn_t_find_another_reference_t = makeString("Couldn't find another reference to ~S other than~% ~S");

    private static final SubLString $str269$_S_is_not_a_dtr_of_its_mother____ = makeString("~S is not a dtr of its mother~% ~S");

    private static final SubLString $str270$__Found_another_reference_to__S__ = makeString("~&Found another reference to ~S:~% Besides: ~S~% Found: ~S~%");

    private static final SubLSymbol $KEEP_OLD_ARG_POSITION = makeKeyword("KEEP-OLD-ARG-POSITION");

    private static final SubLSymbol $sym272$PPH_ARG_POSITION_SPECIFIER_ = makeSymbol("PPH-ARG-POSITION-SPECIFIER?");



    private static final SubLString $str274$Replacing__S_____with__S__ = makeString("Replacing ~S~%   with ~S~%");

    private static final SubLString $str275$__Setting_arg_position_of__S_to__ = makeString("~&Setting arg-position of ~S to ~S~%");

    private static final SubLString $str276$cycls_of_phrases_doesn_t_know_wha = makeString("cycls-of-phrases doesn't know what to do with ~S");

    private static final SubLSymbol ALPHANUMERIC_CHAR_P = makeSymbol("ALPHANUMERIC-CHAR-P");









    private static final SubLString $str282$Bad_agr_value__S__ = makeString("Bad agr value ~S~%");

    private static final SubLString $str283$New_target__S___for_non_new_phras = makeString("New target ~S~% for non-new phrase ~S");

    private static final SubLString $str284$Don_t_careifying__S = makeString("Don't-careifying ~S");

    private static final SubLString $str285$Bad_agr_constraint___S = makeString("Bad agr-constraint: ~S");

    private static final SubLString $str286$Singleton_agr_constraint_target__ = makeString("Singleton agr-constraint target: ~S");





    private static final SubLString $str289$__Can_t_add_new_constraints__S_to = makeString("~&Can't add new constraints ~S to agr-constraint ~S~%");

    private static final SubLString $str290$__Updated_agr_preds_from__S_to__S = makeString("~&Updated agr preds from ~S to ~S.");

    private static final SubLString $str291$_S_should_be_a_list_of_speech_par = makeString("~S should be a list of speech-part or name-string preds.~%");

    private static final SubLString $str292$Impossible_phrase_____S__ = makeString("Impossible phrase:~% ~S~%");



    private static final SubLString $str294$Impossible_because_of_agr_constra = makeString("Impossible because of agr constraint:~% ~S");

    private static final SubLString $str295$Removed__S_from__S___based_on_cat = makeString("Removed ~S from ~S~% based on category ~S, leaving ~S");

    private static final SubLString $str296$Can_t_reconcile__S_and__S_and__S_ = makeString("Can't reconcile ~S and ~S and ~S~% on ~S~%");



    private static final SubLList $list298 = list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("nonSingular-Generic")), reader_make_constant_shell(makeString("nameString")));

    private static final SubLList $list299 = list(reader_make_constant_shell(makeString("nounStrings")));

    private static final SubLSymbol PPH_AGR_PREDS_FROM_CATEGORY_CACHED = makeSymbol("PPH-AGR-PREDS-FROM-CATEGORY-CACHED");

    private static final SubLObject $$pronounStrings = reader_make_constant_shell(makeString("pronounStrings"));

    private static final SubLSymbol $pph_agr_preds_from_category_cached_caching_state$ = makeSymbol("*PPH-AGR-PREDS-FROM-CATEGORY-CACHED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_PPH_AGR_PREDS_FROM_CATEGORY_CACHED = makeSymbol("CLEAR-PPH-AGR-PREDS-FROM-CATEGORY-CACHED");

    private static final SubLString $str304$__Phrase__D_is_unfinished_ = makeString("~&Phrase ~D is unfinished.");

    private static final SubLString $str305$Can_t_set_dtrs_of_non_phrase__S = makeString("Can't set dtrs of non-phrase ~S");

    private static final SubLString $str306$Adding_old_dtr_to_new_mother____M = makeString("Adding old dtr to new mother.~% Mother: ~S~% Dtr: ~S~%");

    private static final SubLString $str307$_S_is_not_terminal = makeString("~S is not terminal");

    private static final SubLSymbol $sym308$PPH_PHRASE_VERB_ = makeSymbol("PPH-PHRASE-VERB?");



    private static final SubLObject $ic310 = vector(EMPTY_SUBL_OBJECT_ARRAY);

    private static final SubLString $str311$Can_t_insert_dtr_into_position__D = makeString("Can't insert dtr into position ~D. Only ~D existing dtr~:P!");

    private static final SubLString $str312$Extraction_disparity___Expected__ = makeString("Extraction disparity.~%Expected~% ~S~%Extracted~% ~S~%");

    private static final SubLString $str313$Setting_head_dtr_to_initial_dtr__ = makeString("Setting head dtr to initial dtr:~% ~S~%");

    private static final SubLString $str314$Extracting_dtr__D___S = makeString("Extracting dtr ~D: ~S");

    private static final SubLString $str315$__Setting_head_dtr_num_from__S = makeString("~&Setting head dtr num from ~S");

    private static final SubLString $str316$_to__S__ = makeString(" to ~S~%");

    private static final SubLString $str317$Phrase_has_lost_its_head_____S__ = makeString("Phrase has lost its head:~% ~S~%");

    private static final SubLString $str318$Setting_agr_target_to_itself_ = makeString("Setting agr target to itself!");

    private static final SubLString $str319$Setting_agr_target_to_non_existen = makeString("Setting agr target to non-existent phrase!");

    private static final SubLString $str320$__Setting_agr_target_num_of_dtr__ = makeString("~&Setting agr target num of dtr ~S from ~S to ~S~%");

    private static final SubLString $$$PPH_Phrase = makeString("PPH Phrase");

    private static final SubLString $$$PPH_Phrase_Test_Suite = makeString("PPH Phrase Test Suite");

    private static final SubLList $list323 = list(makeString("PPH Phrase"));

    public static SubLObject new_pph_phrase_for_cycl(final SubLObject cycl, SubLObject arg_position_map, SubLObject keep_generic_argsP) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (keep_generic_argsP == UNPROVIDED) {
            keep_generic_argsP = pph_vars.$pph_keep_generic_argsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_types.pph_phrase_nautP(cycl)) {
            SubLObject ans = NIL;
            final SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
            try {
                pph_vars.$pph_keep_generic_argsP$.bind(keep_generic_argsP, thread);
                ans = pph_templates.pph_phrasify_phrase_naut(cycl, arg_position_map);
            } finally {
                pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_arg_position_map(phrase, arg_position_map);
        pph_phrase_set_cycl(phrase, cycl);
        if (NIL != pph_phrase_non_empty_output_list_p(pph_phrase_output_list(phrase))) {
            pph_phrase_set_output_list_cycl(phrase, cycl);
        }
        final SubLObject arg_position = pph_utilities.pph_top_level_arg_position(arg_position_map);
        pph_phrase_set_arg_position(phrase, arg_position);
        if (NIL != pph_utilities.pph_arg_position_specifierP(cycl)) {
            if (NIL != keep_generic_argsP) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str0$Keeping_generic_arg__S_, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_empty_map());
                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str1$Not_keeping_generic_arg__S_, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        }
        return phrase;
    }

    public static SubLObject pph_phrase_do_dtrs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dtr = NIL;
        SubLObject phrase = NIL;
        SubLObject dtr_num = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        phrase = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        dtr_num = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(bq_cons(dtr_num, $list4)), list(PWHEN, list(VECTORP, list(SIGN_CONSTITUENTS, phrase)), listS(SIGN_DO_CONSTITUENTS, list(dtr, phrase), append(body, list(list(CINC, dtr_num))))));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject verbose_print_pph_phrase(final SubLObject phrase, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        print_pph_phrase(phrase, stream, T);
        return NIL;
    }

    public static SubLObject terse_print_pph_phrase(final SubLObject phrase, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        print_pph_phrase(phrase, stream, NIL);
        return NIL;
    }

    public static SubLObject print_pph_phrase(final SubLObject phrase, SubLObject stream, SubLObject verboseP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        return print_pph_phrase_int(phrase, stream, $str10$, verboseP, ONE_INTEGER);
    }

    public static SubLObject print_pph_phrase_int(final SubLObject phrase, final SubLObject stream, final SubLObject phrase_num_string, final SubLObject verboseP, final SubLObject current_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_data_structures.valid_pph_phrase_p(phrase)) {
            format(stream, $str11$_INVALID_PPH_PHRASE_);
            return NIL;
        }
        final SubLObject top_levelP = eql(ONE_INTEGER, current_depth);
        SubLObject slots_done_count = ZERO_INTEGER;
        final SubLObject terse_slots_max = THREE_INTEGER;
        final SubLObject depth_max = (NIL != verboseP) ? FOUR_INTEGER : ONE_INTEGER;
        SubLObject stopP = NIL;
        if (NIL == top_levelP) {
            format(stream, $str12$___Dtr___A__, phrase_num_string);
        }
        format(stream, $str13$___PPH_PHRASE__S, pph_phrase_suid(phrase));
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject slot;
        SubLObject string;
        SubLObject slot_result;
        for (rest = NIL, rest = $list14; (NIL == stopP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            slot = NIL;
            string = NIL;
            destructuring_bind_must_consp(current, datum, $list15);
            slot = current.first();
            current = string = current.rest();
            if (NIL != fboundp(slot)) {
                slot_result = funcall(slot, phrase);
                if ((((NIL != slot_result) && (NIL == pph_unknown_cycl_p(slot_result))) && (NIL == pph_data_structures.dont_care_pph_phrase_agr_p(slot_result))) && ($NOT_FOUND != slot_result)) {
                    if (NIL != pph_string.pph_string_p(slot_result)) {
                        slot_result = pph_string.pph_string_if_non_null_to_output_format(slot_result, UNPROVIDED);
                    }
                    if (NIL != verboseP) {
                        format(stream, $str17$__A___S__, string, slot_result);
                    } else {
                        format(stream, $str18$__S__, slot_result);
                    }
                    slots_done_count = add(slots_done_count, ONE_INTEGER);
                    if (NIL == verboseP) {
                        stopP = numGE(slots_done_count, terse_slots_max);
                    }
                }
            }
        }
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            if (current_depth.numL(depth_max)) {
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject connector;
                    SubLObject dtr_num_string;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        connector = (NIL != top_levelP) ? string_utilities.$empty_string$.getGlobalValue() : $str19$_;
                        dtr_num_string = cconcatenate(phrase_num_string, new SubLObject[]{ connector, princ_to_string(dtr_num) });
                        if (dtr_num.eql(head_dtr_num)) {
                            dtr_num_string = cconcatenate(dtr_num_string, $str20$__head_);
                        }
                        print_pph_phrase_int(dtr, stream, dtr_num_string, verboseP, number_utilities.f_1X(current_depth));
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            } else
                if (NIL == stopP) {
                    format(stream, $str21$___Dtrs_);
                    SubLObject dtr_num = ZERO_INTEGER;
                    if (document.sign_constituents(phrase).isVector()) {
                        final SubLObject vector_var = document.sign_constituents(phrase);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject dtr;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            dtr = aref(vector_var, element_num);
                            if (dtr_num.eql(head_dtr_num)) {
                                princ($str22$_Head_, stream);
                            }
                            if (NIL != pph_phrase_doneP(dtr)) {
                                format(stream, $str23$__S, pph_phrase_string(dtr, UNPROVIDED));
                            } else
                                if (NIL != $pph_phrase_display_agrP$.getDynamicValue(thread)) {
                                    format(stream, $str24$___S__A_, pph_phrase_category(dtr, UNPROVIDED), pph_phrase_agr(dtr));
                                } else {
                                    format(stream, $str23$__S, pph_phrase_category(dtr, UNPROVIDED), pph_phrase_agr(dtr));
                                }

                            dtr_num = add(dtr_num, ONE_INTEGER);
                        }
                    }
                }

        }
        princ($str25$_, stream);
        return NIL;
    }

    public static SubLObject pph_phrase_create_backup(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backup_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject copy_nonlocal_featuresP = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind(T, thread);
            pph_phrase_copy(phrase, backup_phrase, copy_nonlocal_featuresP);
        } finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
        return backup_phrase;
    }

    public static SubLObject pph_phrase_revert_to_backup(final SubLObject phrase, final SubLObject backup) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_maybe_warn_about_reverting_phrase(pph_phrase_cycl(backup, UNPROVIDED), pph_phrase_category(backup, UNPROVIDED), pph_phrase_agr_preds(backup, UNPROVIDED), UNPROVIDED);
        pph_phrase_add_problems(phrase, backup);
        pph_phrase_destroy_dtrs_metered(phrase);
        pph_phrase_remove_all_dtrs(phrase);
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind(T, thread);
            pph_phrase_copy(backup, phrase, NIL);
        } finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject pph_maybe_warn_about_reverting_phrase_internal(final SubLObject cycl, final SubLObject category, final SubLObject agr_preds, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = $pph_warn_about_reverting_phrasesP$.getDynamicValue();
        }
        if (NIL != warnP) {
            Errors.warn($str27$Failed_to_paraphrase__S___categor, cycl, category, agr_preds);
        }
        return NIL;
    }

    public static SubLObject pph_maybe_warn_about_reverting_phrase(final SubLObject cycl, final SubLObject category, final SubLObject agr_preds, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = $pph_warn_about_reverting_phrasesP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_maybe_warn_about_reverting_phrase_internal(cycl, category, agr_preds, warnP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE, FOUR_INTEGER, $int$128, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, category, agr_preds, warnP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (category.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (agr_preds.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && warnP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_maybe_warn_about_reverting_phrase_internal(cycl, category, agr_preds, warnP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl, category, agr_preds, warnP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_phrase_copy(final SubLObject old_phrase, SubLObject target, SubLObject copy_nonlocal_featuresP) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (copy_nonlocal_featuresP == UNPROVIDED) {
            copy_nonlocal_featuresP = T;
        }
        if (NIL != pph_sentence.pph_sentence_p(old_phrase)) {
            return pph_sentence.pph_sentence_copy(old_phrase, target);
        }
        return pph_phrase_copy_int(old_phrase, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), target, copy_nonlocal_featuresP, UNPROVIDED);
    }

    public static SubLObject with_pph_phrase_copy_recursion_protection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, $list32, $list33, list(CLET, $list34, listS(STACK_PUSH, phrase, $list36), listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list39)));
        }
        cdestructuring_bind_error(datum, $list30);
        return NIL;
    }

    public static SubLObject find_or_create_pph_phrase_copy_stack() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != stacks.stack_p($pph_phrase_copy_stack$.getDynamicValue(thread)) ? $pph_phrase_copy_stack$.getDynamicValue(thread) : stacks.create_stack();
    }

    public static SubLObject new_pph_phrase_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stacks.stack_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread)) : "stacks.stack_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread)) " + "CommonSymbols.NIL != stacks.stack_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread)) " + pph_macros.$new_pph_phrases$.getDynamicValue(thread);
        return stacks.stack_find(v_object, pph_macros.$new_pph_phrases$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_copy_int(final SubLObject old_phrase, final SubLObject copied_phrases, SubLObject target, SubLObject copy_nonlocal_featuresP, SubLObject require_new_phrasesP) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (copy_nonlocal_featuresP == UNPROVIDED) {
            copy_nonlocal_featuresP = T;
        }
        if (require_new_phrasesP == UNPROVIDED) {
            require_new_phrasesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
            format_nil.force_format(T, $str43$__Copying_phrase____S, old_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == pph_phrase_p(target, UNPROVIDED)) {
            final SubLObject done_copy = dictionary.dictionary_lookup(copied_phrases, old_phrase, UNPROVIDED);
            if (NIL == pph_phrase_p(done_copy, UNPROVIDED)) {
                target = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if ((NIL != require_new_phrasesP) && (NIL == new_pph_phrase_p(done_copy))) {
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str44$Can_t_reuse_old_phrase_____S__, done_copy);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    target = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if ((NIL == copy_nonlocal_featuresP) || (NIL == pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(done_copy, $kw45$NON_LOCAL_FEATURES_IGNORED_, SIX_INTEGER, UNPROVIDED))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                            format_nil.force_format(T, $str47$__Reusing_copy_of_phrase_____S__, done_copy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return done_copy;
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str46$__Copying_nonlocal_features_of___, done_copy, old_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    target = done_copy;
                }

        }
        dictionary.dictionary_enter(copied_phrases, old_phrase, target);
        final SubLObject plist = pph_data_structures.pph_phrase_plist(target);
        SubLObject remainder;
        SubLObject property;
        SubLObject existing_value;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            existing_value = cadr(remainder);
            if (NIL != pph_phrase_copy_property_p(property, copy_nonlocal_featuresP)) {
                pph_data_structures.pph_phrase_info_clear(target, property);
            }
        }
        SubLObject list_var = NIL;
        SubLObject property2 = NIL;
        SubLObject n = NIL;
        list_var = pph_data_structures.pph_info_vector_slots();
        property2 = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , property2 = list_var.first() , n = add(ONE_INTEGER, n)) {
            if (NIL != pph_phrase_copy_property_p(property2, copy_nonlocal_featuresP)) {
                pph_data_structures.pph_phrase_info_vector_clear(target, n);
            }
        }
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(target, $kw45$NON_LOCAL_FEATURES_IGNORED_, SIX_INTEGER, makeBoolean(NIL == copy_nonlocal_featuresP));
        if (old_phrase.equal(target)) {
            return target;
        }
        if ((NIL != stacks.stack_p($pph_phrase_copy_stack$.getDynamicValue(thread))) && stacks.stack_size($pph_phrase_copy_stack$.getDynamicValue(thread)).numG($pph_phrase_copy_nesting_max$.getDynamicValue(thread))) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str50$__Recursion_limit___S__exceeded_i) });
            pph_error.pph_handle_error(new_format_string, list($pph_phrase_copy_nesting_max$.getDynamicValue(thread)));
        } else {
            final SubLObject _prev_bind_0 = $pph_phrase_copy_stack$.currentBinding(thread);
            try {
                $pph_phrase_copy_stack$.bind(find_or_create_pph_phrase_copy_stack(), thread);
                stacks.stack_push(old_phrase, $pph_phrase_copy_stack$.getDynamicValue(thread));
                try {
                    final SubLObject old_top_level_demerits = pph_phrase_top_level_demerits(old_phrase);
                    pph_phrase_set_top_level_demerits(target, old_top_level_demerits, $COPYING_PHRASE);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                        format_nil.force_format(T, $str52$__Set_top_level_demerits_to__S, old_top_level_demerits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase_set_output_list(target, pph_output_list_copy(pph_phrase_output_list(old_phrase)), T);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                        format_nil.force_format(T, $str53$__Set_output_list_to__S, pph_phrase_output_list(target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase_set_category(target, pph_phrase_category(old_phrase, NIL), NIL);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                        format_nil.force_format(T, $str54$__Set_category_to__S, pph_phrase_category(target, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_phrase_doneP(old_phrase)) {
                        final SubLObject string = pph_phrase_noted_string(old_phrase, NIL, $NOT_FOUND);
                        pph_phrase_note_string(target, string, NIL);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str55$__Copied_noted_string__S, NIL != pph_string.pph_string_p(string) ? pph_string.pph_string_if_non_null_to_output_format(string, UNPROVIDED) : string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    if ((NIL != copy_nonlocal_featuresP) && (NIL != pph_phrase_has_dtrsP(old_phrase))) {
                        SubLObject new_dtrs = NIL;
                        SubLObject dtr_num = ZERO_INTEGER;
                        if (document.sign_constituents(old_phrase).isVector()) {
                            final SubLObject vector_var = document.sign_constituents(old_phrase);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject old_phrase_dtr;
                            SubLObject require_newP;
                            SubLObject new_phrase_dtr;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                old_phrase_dtr = aref(vector_var, element_num);
                                require_newP = new_pph_phrase_p(target);
                                new_phrase_dtr = (NIL != pph_phrase_p(old_phrase_dtr, UNPROVIDED)) ? pph_phrase_copy_dtr(dtr_num, old_phrase_dtr, copied_phrases, require_newP) : old_phrase_dtr;
                                new_dtrs = cons(new_phrase_dtr, new_dtrs);
                                dtr_num = add(dtr_num, ONE_INTEGER);
                            }
                        }
                        set_pph_phrase_dtrs_from_list(target, nreverse(new_dtrs), UNPROVIDED);
                    } else {
                        set_pph_phrase_dtrs_from_list(target, NIL, UNPROVIDED);
                    }
                    pph_phrase_set_cycl(target, pph_phrase_cycl(old_phrase, UNPROVIDED));
                    final SubLObject old_agr = pph_phrase_agr(old_phrase);
                    if (NIL != pph_data_structures.pph_phrase_agr_p(old_agr)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                            format_nil.force_format(T, $str56$__Setting_agr_to__S, old_agr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_phrase_set_agr(target, pph_data_structures.pph_phrase_agr_copy(old_agr, copied_phrases), NIL);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(FOUR_INTEGER)) {
                            format_nil.force_format(T, $str57$__Set_agr_to__S, pph_phrase_agr(target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    pph_phrase_set_justification(target, copy_list(pph_phrase_justification(old_phrase)));
                    pph_phrase_set_arg_position_map(target, pph_phrase_arg_position_map(old_phrase));
                    final SubLObject plist2 = pph_data_structures.pph_phrase_plist(old_phrase);
                    SubLObject remainder2;
                    SubLObject property3;
                    SubLObject old_value;
                    SubLObject new_value;
                    for (remainder2 = NIL, remainder2 = plist2; NIL != remainder2; remainder2 = cddr(remainder2)) {
                        property3 = remainder2.first();
                        old_value = cadr(remainder2);
                        if (NIL != pph_phrase_copy_property_p(property3, copy_nonlocal_featuresP)) {
                            new_value = (NIL != pph_phrase_p(old_value, UNPROVIDED)) ? pph_phrase_copy_plist_phrase(property3, old_value, copied_phrases, copy_nonlocal_featuresP) : old_value;
                            pph_phrase_info_set_high(target, property3, new_value);
                        }
                    }
                    if (NIL != pph_data_structures.pph_phrase_has_info_vector_p(old_phrase)) {
                        SubLObject list_var2 = NIL;
                        SubLObject property4 = NIL;
                        SubLObject n2 = NIL;
                        list_var2 = pph_data_structures.pph_info_vector_slots();
                        property4 = list_var2.first();
                        for (n2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , property4 = list_var2.first() , n2 = add(ONE_INTEGER, n2)) {
                            if (NIL != pph_phrase_copy_property_p(property4, copy_nonlocal_featuresP)) {
                                if (NIL != pph_data_structures.pph_phrase_info_property_set_p(old_phrase, property4, n2)) {
                                    old_value = pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(old_phrase, property4, n2, UNPROVIDED);
                                    new_value = (NIL != pph_phrase_p(old_value, UNPROVIDED)) ? pph_phrase_copy_plist_phrase(property4, old_value, copied_phrases, copy_nonlocal_featuresP) : old_value;
                                    pph_data_structures.pph_phrase_info_vector_set(target, n2, new_value);
                                } else {
                                    pph_data_structures.pph_phrase_info_vector_clear(target, n2);
                                }
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        stacks.stack_pop($pph_phrase_copy_stack$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            } finally {
                $pph_phrase_copy_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return target;
    }

    public static SubLObject pph_phrase_copy_property_p(final SubLObject property, final SubLObject copy_nonlocal_featuresP) {
        if (property == $kw45$NON_LOCAL_FEATURES_IGNORED_) {
            return NIL;
        }
        if ((NIL == copy_nonlocal_featuresP) && (NIL != pph_phrase_nonlocal_feature_property_p(property))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_phrase_copy_dtr(final SubLObject dtr_num, final SubLObject old_phrase_dtr, final SubLObject copied_phrases, final SubLObject require_newP) {
        return pph_phrase_copy_int(old_phrase_dtr, copied_phrases, NIL, T, require_newP);
    }

    public static SubLObject pph_phrase_copy_plist_phrase(final SubLObject property, final SubLObject old_value, final SubLObject copied_phrases, SubLObject copy_nonlocal_featuresP) {
        if (copy_nonlocal_featuresP == UNPROVIDED) {
            copy_nonlocal_featuresP = T;
        }
        return pph_phrase_copy_int(old_value, copied_phrases, NIL, copy_nonlocal_featuresP, UNPROVIDED);
    }

    public static SubLObject pph_phrase_dtr_list(final SubLObject phrase) {
        final SubLObject dtr_vector = pph_phrase_dtrs(phrase);
        return dtr_vector.isVector() ? vector_utilities.vector_elements(dtr_vector, UNPROVIDED) : NIL;
    }

    public static SubLObject pph_phrase_nonlocal_feature_property_p(final SubLObject property) {
        return subl_promotions.memberP(property, $pph_phrase_nonlocal_feature_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_verbosity(final SubLObject phrase) {
        final SubLObject string = pph_phrase_string(phrase, NIL);
        if (NIL != string) {
            return pph_content_word_count(string);
        }
        if (NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject verbosity = ZERO_INTEGER;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject dtr_verbosity;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    dtr_verbosity = pph_phrase_verbosity(dtr);
                    if (dtr_verbosity.numG(verbosity)) {
                        verbosity = dtr_verbosity;
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return verbosity;
        }
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject verbosity = ZERO_INTEGER;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    verbosity = add(verbosity, pph_phrase_verbosity(dtr));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return verbosity;
        }
        if (NIL != pph_phrase_has_known_cyclP(phrase)) {
            return list_utilities.tree_count_if(symbol_function(ATOM), pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED);
        }
        return ONE_INTEGER;
    }

    public static SubLObject pph_content_word_count(final SubLObject string) {
        final SubLObject strings = pph_string.pph_string_tokenize(string, UNPROVIDED);
        return add(list_utilities.count_if_not($sym60$CLOSED_LEXICAL_CLASS_STRING_, list_utilities.remove_if_not(STRINGP, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.count_if_not(STRINGP, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_special_type_kwP(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $pph_special_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_special_type_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != pph_special_type_kwP(v_object)));
    }

    public static SubLObject pph_phrase_special_type(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $SPECIAL_TYPE, NINE_INTEGER, UNPROVIDED);
    }

    public static SubLObject pph_phrase_set_special_type(final SubLObject phrase, final SubLObject special_type) {
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $SPECIAL_TYPE, NINE_INTEGER, special_type);
        return phrase;
    }

    public static SubLObject pph_phrase_clear_special_type(final SubLObject phrase) {
        return pph_phrase_set_special_type(phrase, NIL);
    }

    public static SubLObject pph_phrase_focus_arg(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, $FOCUS_ARG, NIL);
    }

    public static SubLObject pph_phrase_set_focus_arg(final SubLObject phrase, final SubLObject focus_arg) {
        pph_data_structures.pph_phrase_info_set(phrase, $FOCUS_ARG, focus_arg);
        return phrase;
    }

    public static SubLObject pph_percent_phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (pph_phrase_special_type(v_object) == $PERCENT_PHRASE));
    }

    public static SubLObject new_pph_percent_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_special_type(phrase, $PERCENT_PHRASE);
        final SubLObject percent_cycl = cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED);
        pph_phrase_set_cycl(phrase, percent_cycl);
        if (NIL == pph_utilities.pph_arg_position_specifierP(percent_cycl)) {
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        }
        return phrase;
    }

    public static SubLObject pph_clarifying_phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (pph_phrase_special_type(v_object) == $CLARIFYING));
    }

    public static SubLObject new_pph_type_clarifying_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        final SubLObject clarifying_phrase_dtr = pph_templates.pph_phrasify_phrase_naut(cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED), pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG1));
        final SubLObject main_dtr = pph_templates.pph_phrasify_phrase_naut(cycl_utilities.nat_arg2(phrase_naut, UNPROVIDED), pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG2));
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_arg_position_map(phrase, arg_position_map);
        pph_phrase_set_category_to_np(phrase);
        pph_phrase_set_head_dtr_num(phrase, ONE_INTEGER);
        set_pph_phrase_dtrs_from_list(phrase, list(clarifying_phrase_dtr, main_dtr), UNPROVIDED);
        final SubLObject new_agr_target = pph_utilities.new_pph_nth_phrase(ONE_INTEGER, UNPROVIDED);
        final SubLObject new_agr = pph_utilities.new_pph_agr_constraint($CLARIFYING, new_agr_target);
        pph_phrase_set_agr_constraint(clarifying_phrase_dtr, new_agr, UNPROVIDED);
        pph_phrase_note_not_done(phrase);
        pph_phrase_note_not_done(clarifying_phrase_dtr);
        pph_phrase_set_special_type(clarifying_phrase_dtr, $CLARIFYING);
        return phrase;
    }

    public static SubLObject pph_symbol_phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (pph_phrase_special_type(v_object) == $SYMBOL_PHRASE));
    }

    public static SubLObject new_pph_symbol_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_special_type(phrase, $SYMBOL_PHRASE);
        final SubLObject symbol_cycl = cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED);
        pph_data_structures.pph_phrase_info_set(phrase, $SYMBOL, symbol_cycl);
        pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        return phrase;
    }

    public static SubLObject pph_symbol_phrase_symbol(final SubLObject v_pph_phrase) {
        return pph_data_structures.pph_phrase_info_lookup(v_pph_phrase, $SYMBOL, UNPROVIDED);
    }

    public static SubLObject pph_cycl_phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (pph_phrase_special_type(v_object) == $CYCL_PHRASE));
    }

    public static SubLObject new_pph_cycl_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject cycl = cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED);
        pph_phrase_set_special_type(phrase, $CYCL_PHRASE);
        pph_phrase_set_cycl(phrase, cycl);
        if (NIL == pph_utilities.pph_arg_position_specifierP(cycl)) {
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        }
        return phrase;
    }

    public static SubLObject pph_quoted_paraphrase_phrase_p(final SubLObject v_object) {
        return makeBoolean(((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_phrase_has_dtrsP(v_object))) && (pph_phrase_special_type(v_object) == $QUOTED_PARAPHRASE));
    }

    public static SubLObject new_pph_quoted_paraphrase_phrase(final SubLObject phrase_naut) {
        return quote_pph_phrase(pph_templates.pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject quote_pph_phrase(final SubLObject phrase) {
        final SubLObject new_mother = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_special_type(new_mother, $QUOTED_PARAPHRASE);
        pph_phrase_set_only_dtr(new_mother, phrase);
        pph_phrase_set_cycl(new_mother, pph_phrase_cycl(phrase, UNPROVIDED));
        pph_phrase_set_arg_position_map(new_mother, pph_phrase_arg_position_map(phrase));
        return new_mother;
    }

    public static SubLObject pph_string_mention_phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (pph_phrase_special_type(v_object) == $STRING_MENTION));
    }

    public static SubLObject new_pph_string_mention_phrase(final SubLObject phrase_naut) {
        return quote_pph_phrase(pph_data_structures.new_pph_phrase(NIL, cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject pph_meta_phrase_p(final SubLObject obj) {
        return makeBoolean((NIL != pph_phrase_p(obj, UNPROVIDED)) && ((((((((NIL != pph_conditional_phrase_p(obj)) || (NIL != pph_variable_binding_phrase_p(obj))) || (NIL != pph_quoted_paraphrase_phrase_p(obj))) || (NIL != pph_terse_phrase_p(obj))) || (NIL != pph_precise_phrase_p(obj))) || (NIL != pph_nospace_phrase_p(obj))) || (NIL != pph_coordination_phrase_p(obj))) || (NIL != pph_repeated_phrase_p(obj))));
    }

    public static SubLObject pph_nospace_phrase_p(final SubLObject v_object) {
        return makeBoolean(((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_phrase_has_dtrsP(v_object))) && (pph_phrase_category(v_object, NIL) == $NOSPACE));
    }

    public static SubLObject new_pph_nospace_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLObject nested_phrase = pph_templates.pph_phrase_from_concatenate_phrases_naut(phrase_naut, arg_position_map);
        final SubLObject phrase = convert_pph_phrase_to_nospace_phrase(nested_phrase);
        return phrase;
    }

    public static SubLObject convert_pph_phrase_to_nospace_phrase(final SubLObject nested_phrase) {
        final SubLObject phrase = pph_phrase_copy(nested_phrase, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_category(phrase, $NOSPACE, UNPROVIDED);
        pph_phrase_set_only_dtr(phrase, nested_phrase);
        return phrase;
    }

    public static SubLObject pph_variable_binding_phrase_p(final SubLObject v_object) {
        return makeBoolean(((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_variable_binding_phrase_query_template(v_object))) && (pph_phrase_category(v_object, NIL) == $VARIABLE_BINDING));
    }

    public static SubLObject new_pph_variable_binding_phrase(final SubLObject phrase_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, UNPROVIDED);
        SubLObject query_el_formula = NIL;
        SubLObject sub_phrase_naut = NIL;
        destructuring_bind_must_consp(current, datum, $list76);
        query_el_formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list76);
        sub_phrase_naut = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject nested_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase_set_category(phrase, $VARIABLE_BINDING, UNPROVIDED);
            pph_variable_binding_phrase_set_query_template(phrase, query_el_formula);
            pph_data_structures.pph_phrase_info_set(phrase, $PHRASE_NAUT, sub_phrase_naut);
            pph_phrase_set_only_dtr(phrase, nested_phrase);
            if (NIL == pph_utilities.pph_cycl_template_p(query_el_formula)) {
                pph_variable_binding_phrase_try_to_resolve_bindings(phrase, UNPROVIDED);
            }
            return phrase;
        }
        cdestructuring_bind_error(datum, $list76);
        return NIL;
    }

    public static SubLObject pph_variable_binding_phrase_query_template(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $QUERY_EL_FORMULA, EIGHT_INTEGER, NIL);
    }

    public static SubLObject pph_variable_binding_phrase_phrase_naut_subst(final SubLObject v_pph_phrase, final SubLObject old_term, final SubLObject new_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_phrase_naut = pph_variable_binding_phrase_phrase_naut(v_pph_phrase);
        SubLObject replacedP = NIL;
        if (NIL != cycl_utilities.expression_find(old_term, old_phrase_naut, NIL, symbol_function(EQUAL), UNPROVIDED)) {
            pph_variable_binding_phrase_set_phrase_naut(v_pph_phrase, cycl_utilities.expression_subst(new_term, old_term, old_phrase_naut, symbol_function(EQUAL), UNPROVIDED));
            replacedP = T;
        } else
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str79$Couldn_t_find__S___in__S, old_term, old_phrase_naut);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }

        return replacedP;
    }

    public static SubLObject pph_variable_binding_phrase_phrase_naut(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, $PHRASE_NAUT, NIL);
    }

    public static SubLObject pph_variable_binding_phrase_set_phrase_naut(final SubLObject phrase, final SubLObject phrase_naut) {
        return pph_data_structures.pph_phrase_info_set(phrase, $PHRASE_NAUT, phrase_naut);
    }

    public static SubLObject pph_variable_binding_phrase_set_query_template(final SubLObject phrase, final SubLObject query_template) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $QUERY_EL_FORMULA, EIGHT_INTEGER, query_template);
    }

    public static SubLObject pph_variable_binding_phrase_query_el_formula(final SubLObject phrase, final SubLObject paraphrase_formula) {
        final SubLObject template = pph_variable_binding_phrase_query_template(phrase);
        if (NIL != pph_utilities.pph_cycl_template_p(template)) {
            final SubLObject template_vars = cycl_utilities.expression_gather(template, $sym80$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject query_formula = pph_utilities.pph_apply_template(template, paraphrase_formula);
            final SubLObject query_vars = cycl_utilities.expression_gather(query_formula, $sym80$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == set_difference(query_vars, template_vars, UNPROVIDED, UNPROVIDED)) {
                return query_formula;
            }
            return NIL;
        } else {
            if (NIL != el_formula_p(template)) {
                return template;
            }
            return NIL;
        }
    }

    public static SubLObject pph_variable_bindings_and_supports_from_phrase(final SubLObject phrase, final SubLObject paraphrase_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_el_formula = pph_variable_binding_phrase_query_el_formula(phrase, paraphrase_formula);
        if (NIL == el_formula_p(query_el_formula)) {
            return values(NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject ans = pph_variable_bindings_and_supports_from_query_el_formula(query_el_formula, UNPROVIDED);
        final SubLObject successP = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            pph_phrase_add_inference(phrase, inference);
        }
        return values(ans, successP);
    }

    public static SubLObject pph_variable_bindings_and_supports_from_query_el_formula_internal(final SubLObject query_el_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = $list82;
        thread.resetMultipleValues();
        final SubLObject ask_result = pph_utilities.pph_query(query_el_formula, mt, v_properties);
        final SubLObject query_runP = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == ask_result) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str83$Couldn_t_find_bindings_for__S, query_el_formula);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return values(ask_result.first(), makeBoolean(NIL != ask_result), inference);
    }

    public static SubLObject pph_variable_bindings_and_supports_from_query_el_formula(final SubLObject query_el_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_variable_bindings_and_supports_from_query_el_formula_internal(query_el_formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA, TWO_INTEGER, $int$24, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(query_el_formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query_el_formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variable_bindings_and_supports_from_query_el_formula_internal(query_el_formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query_el_formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_variable_binding_phrase_substitute_cycl(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_cycl = bindings.apply_bindings($pph_variable_bindings$.getDynamicValue(thread), pph_phrase_cycl(phrase, UNPROVIDED));
        pph_phrase_set_cycl(phrase, new_cycl);
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_variable_binding_phrase_substitute_cycl(dtr);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_try_to_resolve_binding_phrases(final SubLObject phrase, SubLObject dont_touch) {
        if (dont_touch == UNPROVIDED) {
            dont_touch = NIL;
        }
        SubLObject failP = NIL;
        if (NIL != pph_variable_binding_phrase_p(phrase)) {
            pph_variable_binding_phrase_try_to_resolve_bindings(phrase, dont_touch);
            failP = pph_variable_binding_phrase_p(phrase);
        }
        if (NIL != pph_repeated_phrase_p(phrase)) {
            final SubLObject first_arg_position = pph_repeated_phrase_first_arg_position(phrase);
            final SubLObject first_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(first_arg_position);
            failP = pph_phrase_try_to_resolve_binding_phrases(pph_phrase_nth_dtr(phrase, ZERO_INTEGER), cons(first_cycl_template, dont_touch));
        } else
            if (NIL != pph_phrase_has_dtrsP(phrase)) {
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        if (NIL == failP) {
                            failP = pph_phrase_try_to_resolve_binding_phrases(dtr, dont_touch);
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }

        return failP;
    }

    public static SubLObject pph_variable_binding_phrase_try_to_resolve_bindings(final SubLObject phrase, SubLObject dont_touch) {
        if (dont_touch == UNPROVIDED) {
            dont_touch = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase_root_mother_cycl(phrase);
        SubLObject phrase_naut = pph_data_structures.pph_phrase_info_lookup(phrase, $PHRASE_NAUT, UNPROVIDED);
        final SubLObject map = pph_phrase_arg_position_map(phrase);
        final SubLObject query_template = pph_variable_binding_phrase_query_template(phrase);
        SubLObject cant_touch_thisP = makeBoolean(NIL == pph_vars.$pph_resolve_bindings_phrasesP$.getDynamicValue(thread));
        if (NIL == cant_touch_thisP) {
            SubLObject csome_list_var = dont_touch;
            SubLObject taboo = NIL;
            taboo = csome_list_var.first();
            while ((NIL == cant_touch_thisP) && (NIL != csome_list_var)) {
                if (NIL != cycl_utilities.expression_find(taboo, query_template, NIL, symbol_function(EQUAL), UNPROVIDED)) {
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str85$Can_t_resolve__S_due_to__S, query_template, taboo);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    cant_touch_thisP = T;
                }
                csome_list_var = csome_list_var.rest();
                taboo = csome_list_var.first();
            } 
        }
        if (NIL == cant_touch_thisP) {
            thread.resetMultipleValues();
            final SubLObject bindings_and_supports = pph_variable_bindings_and_supports_from_phrase(phrase, cycl);
            final SubLObject successP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != successP) {
                SubLObject current;
                final SubLObject datum = current = bindings_and_supports;
                final SubLObject _prev_bind_0 = $pph_variable_bindings$.currentBinding(thread);
                try {
                    $pph_variable_bindings$.bind(NIL, thread);
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list86);
                    $pph_variable_bindings$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list86);
                    supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        phrase_naut = bindings.apply_bindings($pph_variable_bindings$.getDynamicValue(thread), phrase_naut);
                        final SubLObject inferences = pph_phrase_inferences(phrase);
                        final SubLObject old_just = pph_phrase_justification(phrase);
                        pph_phrase_copy(pph_templates.pph_phrasify_phrase_naut(phrase_naut, map), phrase, UNPROVIDED);
                        pph_phrase_set_inferences(phrase, inferences);
                        SubLObject cdolist_list_var = old_just;
                        SubLObject just = NIL;
                        just = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            pph_phrase_add_justification(phrase, just);
                            cdolist_list_var = cdolist_list_var.rest();
                            just = cdolist_list_var.first();
                        } 
                        SubLObject cdolist_list_var2 = supports;
                        SubLObject support = NIL;
                        support = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            pph_phrase_add_justification(phrase, support);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            support = cdolist_list_var2.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, $list86);
                    }
                } finally {
                    $pph_variable_bindings$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return phrase;
    }

    public static SubLObject pph_terse_phrase_p(final SubLObject v_object) {
        return makeBoolean(((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_phrase_has_dtrsP(v_object))) && (pph_phrase_category(v_object, NIL) == $TERSE_PARAPHRASE));
    }

    public static SubLObject new_pph_terse_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_templates.pph_phrase_from_gentemplate_phrase(cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED), UNPROVIDED);
        final SubLObject nested_phrase = pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_category(phrase, $TERSE_PARAPHRASE, UNPROVIDED);
        pph_phrase_set_only_dtr(phrase, nested_phrase);
        return phrase;
    }

    public static SubLObject pph_precise_phrase_p(final SubLObject v_object) {
        return makeBoolean(((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_phrase_has_dtrsP(v_object))) && (pph_phrase_category(v_object, NIL) == $PRECISE_PARAPHRASE));
    }

    public static SubLObject new_pph_precise_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLObject nested_phrase_naut = cycl_utilities.nat_arg1(phrase_naut, UNPROVIDED);
        final SubLObject phrase = new_pph_phrase_for_cycl(nested_phrase_naut, arg_position_map, UNPROVIDED);
        final SubLObject nested_phrase = pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_category(phrase, $PRECISE_PARAPHRASE, UNPROVIDED);
        pph_phrase_set_only_dtr(phrase, nested_phrase);
        return phrase;
    }

    public static SubLObject pph_chemical_formula_from_lists_phrase_p(final SubLObject v_object) {
        return makeBoolean(((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_phrase_has_dtrsP(v_object))) && (pph_phrase_category(v_object, NIL) == $CHEMICAL_FORMULA_FROM_LISTS));
    }

    public static SubLObject new_pph_chemical_formula_from_lists_phrase(final SubLObject phrase_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, UNPROVIDED);
        SubLObject element_list = NIL;
        SubLObject quantity_list = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        element_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        quantity_list = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject elements_phrase = new_pph_phrase_for_cycl(element_list, UNPROVIDED, UNPROVIDED);
            final SubLObject quantities_phrase = new_pph_phrase_for_cycl(quantity_list, UNPROVIDED, UNPROVIDED);
            final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase_set_category(phrase, $CHEMICAL_FORMULA_FROM_LISTS, UNPROVIDED);
            set_pph_phrase_dtrs_from_list(phrase, list(elements_phrase, quantities_phrase), UNPROVIDED);
            return phrase;
        }
        cdestructuring_bind_error(datum, $list90);
        return NIL;
    }

    public static SubLObject pph_conditional_phrase_p(final SubLObject v_object) {
        SubLObject ans = NIL;
        if (NIL != pph_phrase_p(v_object, UNPROVIDED)) {
            final SubLObject category = pph_phrase_category(v_object, NIL);
            ans = pph_conditional_phrase_category_p(category);
        }
        return ans;
    }

    public static SubLObject pph_conditional_phrase_category_p(final SubLObject category) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(category)) && (NIL != list_utilities.lengthE(category, TWO_INTEGER, UNPROVIDED))) && (category.first() == $CONDITIONAL_PHRASE));
    }

    public static SubLObject new_pph_conditional_phrase(final SubLObject phrase_naut, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject args = cycl_utilities.nat_args(phrase_naut, UNPROVIDED);
        if (!cycl_utilities.nat_arity(phrase_naut, UNPROVIDED).numGE(TWO_INTEGER)) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str92$NEW_PPH_CONDITIONAL_PHRASE_passed) });
            pph_error.pph_handle_error(new_format_string, list(phrase_naut));
        }
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject test = NIL;
        SubLObject phrase_naut_if = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        test = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        phrase_naut_if = current.first();
        current = current.rest();
        final SubLObject phrase_naut_if_not = (current.isCons()) ? current.first() : list(pph_functions.bestnlphraseofstringfn(), string_utilities.$empty_string$.getGlobalValue());
        destructuring_bind_must_listp(current, datum, $list93);
        current = current.rest();
        if (NIL == current) {
            final SubLObject phrase_if_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG2);
            final SubLObject phrase_if_not_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG3);
            if (NIL == pph_utilities.pph_usable_condition_testP(test)) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str95$__ConditionalPhraseFn_expects_a_c, test);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return pph_templates.pph_phrase_from_gentemplate_phrase(phrase_naut_if_not, phrase_if_not_map);
            }
            pph_phrase_set_category(phrase, list($CONDITIONAL_PHRASE, test), UNPROVIDED);
            final SubLObject phrase_if = pph_templates.pph_phrase_from_gentemplate_phrase(phrase_naut_if, phrase_if_map);
            final SubLObject phrase_if_not = pph_templates.pph_phrase_from_gentemplate_phrase(phrase_naut_if_not, phrase_if_not_map);
            set_pph_phrase_dtrs_from_list(phrase, list(phrase_if, phrase_if_not), UNPROVIDED);
        } else {
            cdestructuring_bind_error(datum, $list93);
        }
        return phrase;
    }

    public static SubLObject pph_conditional_phrase_test(final SubLObject phrase) {
        return second(pph_phrase_category(phrase, NIL));
    }

    public static SubLObject pph_conditional_phrase_set_test(final SubLObject phrase, final SubLObject test) {
        pph_phrase_set_category(phrase, list($CONDITIONAL_PHRASE, test), NIL);
        return pph_conditional_phrase_test(phrase);
    }

    public static SubLObject pph_conditional_phrase_values(final SubLObject phrase) {
        return pph_phrase_dtr_list(phrase);
    }

    public static SubLObject pph_coordination_phrase_p(final SubLObject v_object) {
        final SubLObject category = pph_phrase_category(v_object, NIL);
        if (((NIL != pph_phrase_has_dtrsP(v_object)) && (NIL != list_utilities.proper_list_p(category))) && (category.first() == $COORDINATION)) {
            return keywordp(second(category));
        }
        return NIL;
    }

    public static SubLObject new_pph_coordination_phrase(final SubLObject phrase_naut) {
        final SubLObject dtr_phrase_nauts = cycl_utilities.nat_args(phrase_naut, UNPROVIDED);
        final SubLObject opr_keyword = pph_opr_key_for_fn(cycl_utilities.nat_functor(phrase_naut));
        final SubLObject list_type = $UNORDERED;
        SubLObject dtrs = NIL;
        SubLObject cdolist_list_var = dtr_phrase_nauts;
        SubLObject dtr_phrase_naut = NIL;
        dtr_phrase_naut = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dtrs = cons(pph_templates.pph_phrase_from_gentemplate_phrase(dtr_phrase_naut, UNPROVIDED), dtrs);
            cdolist_list_var = cdolist_list_var.rest();
            dtr_phrase_naut = cdolist_list_var.first();
        } 
        return new_pph_coordination_phrase_low(nreverse(dtrs), opr_keyword, list_type);
    }

    public static SubLObject new_pph_coordination_phrase_low(final SubLObject phrases, final SubLObject opr_keyword, final SubLObject list_type) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase_set_category(phrase, list($COORDINATION, opr_keyword, list_type), UNPROVIDED);
        set_pph_phrase_dtrs_from_list(phrase, phrases, UNPROVIDED);
        return phrase;
    }

    public static SubLObject new_pph_numbered_list_phrase(final SubLObject phrase_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, UNPROVIDED);
        SubLObject constraint = NIL;
        SubLObject list = NIL;
        SubLObject list_type = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        list_type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject opr_keyword = pph_opr_key_for_fn(cycl_utilities.nat_functor(phrase_naut));
            final SubLObject list_type_identifier = pph_list_type_identifier(list_type);
            pph_phrase_set_category(phrase, list($COORDINATION, opr_keyword, list_type_identifier), UNPROVIDED);
            final SubLObject dtr = pph_templates.pph_phrase_from_gentemplate_phrase(list(pph_functions.repeatforsubsequentargsfn(), list($$FormulaArgFn, ONE_INTEGER, list), list(pph_functions.phraseformfn(), constraint, list(pph_functions.termparaphrasefn(), list($$FormulaArgFn, ONE_INTEGER, list)))), UNPROVIDED);
            pph_phrase_set_only_dtr(phrase, dtr);
            return phrase;
        }
        cdestructuring_bind_error(datum, $list98);
        return NIL;
    }

    public static SubLObject pph_opr_key_for_fn(final SubLObject fn) {
        if (NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn())) {
            return $AND;
        }
        if (NIL != kb_utilities.kbeq(fn, pph_functions.nlconjunctionfn_but())) {
            return $BUT;
        }
        if (NIL != kb_utilities.kbeq(fn, pph_functions.nldisjunctionfn())) {
            return $OR;
        }
        return $NONE;
    }

    public static SubLObject pph_opr_key_for_connective(final SubLObject cycl_connective) {
        if (cycl_connective.eql($$and)) {
            return $AND;
        }
        if (cycl_connective.eql($$or)) {
            return $OR;
        }
        return $NONE;
    }

    public static SubLObject pph_list_type_identifier(final SubLObject list_type) {
        final SubLObject result = pph_utilities.pph_ask_variable($sym106$_ID_STRING, listS($$htmlListTypeIdentifierString, list_type, $list108), $$HTMLRepresentationMt, NIL, ONE_INTEGER).first();
        return NIL != result ? result : $UNORDERED;
    }

    public static SubLObject pph_bare_string_phrase_p(final SubLObject phrase) {
        return makeBoolean(((((NIL != pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase_agr(phrase))) && (NIL == pph_phrase_has_known_cyclP(phrase))) && (NIL == pph_phrase_has_dtrsP(phrase))) && (NIL != list_utilities.singletonP(pph_phrase_output_list(phrase)))) && (NIL != pph_bare_string_output_item_p(pph_phrase_output_list(phrase).first(), T)));
    }

    public static SubLObject pph_coordinated_np_info(final SubLObject phrase, SubLObject do_unification) {
        if (do_unification == UNPROVIDED) {
            do_unification = NIL;
        }
        if (NIL != pph_phrase_head_dtr_genl_other_thanP(phrase, $$CoordinatingConjunction)) {
            return NIL;
        }
        final SubLObject dtr_count = pph_phrase_dtr_count(phrase);
        if (!dtr_count.numG(TWO_INTEGER)) {
            return NIL;
        }
        final SubLObject last_dtr = pph_phrase_last_dtr(phrase);
        final SubLObject supposed_conj = (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) ? pph_phrase_nth_dtr(phrase, subtract(pph_phrase_dtr_count(phrase), TWO_INTEGER)) : NIL;
        SubLObject unified_gender = $$Feminine_NLAttr;
        SubLObject unified_person = $$ThirdPerson_NLAttr;
        if ((NIL == pph_phrase_p(supposed_conj, UNPROVIDED)) || (NIL == pph_phrase_npP(last_dtr))) {
            return NIL;
        }
        if ((NIL == pph_utilities.pph_genl_categoryP(pph_phrase_category(supposed_conj, UNPROVIDED), $$CoordinatingConjunction, UNPROVIDED)) && ((NIL == pph_phrase_string(supposed_conj, UNPROVIDED)) || (NIL == pph_variable_handling.pph_string_is_posP(pph_phrase_string(supposed_conj, UNPROVIDED), $$CoordinatingConjunction, $NEVER, UNPROVIDED)))) {
            return NIL;
        }
        if (NIL == do_unification) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (!dtr.equal(supposed_conj)) {
                        if (NIL == pph_utilities.pph_npP(pph_phrase_category(dtr, UNPROVIDED))) {
                            return NIL;
                        }
                        unified_person = pph_methods.pph_unify_person(unified_person, pph_phrase_person(dtr));
                        unified_gender = pph_methods.pph_unify_gender(unified_gender, pph_phrase_gender(dtr));
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return pph_methods_lexicon.new_pph_pronoun_agr(unified_person, $$Plural_NLAttr, unified_gender);
    }

    public static SubLObject pph_phrase_gender(final SubLObject phrase) {
        return pph_methods.pph_gender(pph_phrase_cycl(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_person(final SubLObject phrase) {
        return pph_methods.pph_person(pph_phrase_cycl(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_number(final SubLObject phrase) {
        return pph_methods.pph_number(pph_phrase_cycl(phrase, UNPROVIDED));
    }

    public static SubLObject pph_agr_pred_from_coordinated_np_number(final SubLObject phrase) {
        final SubLObject the_agr = pph_coordinated_np_info(phrase, UNPROVIDED);
        if (NIL == the_agr) {
            return NIL;
        }
        if (pph_methods_lexicon.pph_pronoun_agr_number(the_agr).eql($$Singular_NLAttr)) {
            return $$singular_Generic;
        }
        return $$plural_Generic;
    }

    public static SubLObject pph_repeated_phrase_p(final SubLObject v_object) {
        return makeBoolean((((NIL != pph_phrase_p(v_object, UNPROVIDED)) && (NIL != pph_phrase_has_dtrsP(v_object))) && pph_phrase_category(v_object, NIL).isCons()) && (pph_phrase_category(v_object, NIL).first() == $REPEATED));
    }

    public static SubLObject pph_repeated_phrase_first_arg_position(final SubLObject repeated_phrase) {
        final SubLObject first_arg_specifier = pph_phrase_category(repeated_phrase, NIL).rest();
        if (first_arg_specifier.isInteger()) {
            return list(first_arg_specifier);
        }
        if (NIL != pph_utilities.pph_arg_position_specifierP(first_arg_specifier)) {
            return pph_utilities.pph_arg_position_from_template(first_arg_specifier);
        }
        return NIL;
    }

    public static SubLObject pph_repeated_phrase_references_argP(final SubLObject phrase, final SubLObject arg) {
        final SubLObject arg_position = pph_utilities.pph_arg_position_from_template(arg);
        final SubLObject first_arg_position = pph_repeated_phrase_first_arg_position(phrase);
        return numLE(first_arg_position.first(), arg_position.first());
    }

    public static SubLObject new_pph_repeated_phrase(final SubLObject phrase_naut) {
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(phrase_naut, UNPROVIDED);
        SubLObject first_arg_specifier = NIL;
        SubLObject first_phrase_naut = NIL;
        destructuring_bind_must_consp(current, datum, $list119);
        first_arg_specifier = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        first_phrase_naut = current.first();
        current = current.rest();
        if (NIL == current) {
            pph_phrase_set_category(phrase, cons($REPEATED, first_arg_specifier), UNPROVIDED);
            pph_phrase_set_only_dtr(phrase, pph_templates.pph_phrase_from_gentemplate_phrase(first_phrase_naut, UNPROVIDED));
        } else {
            cdestructuring_bind_error(datum, $list119);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_p(final SubLObject v_object, SubLObject verify_dtrsP) {
        if (verify_dtrsP == UNPROVIDED) {
            verify_dtrsP = NIL;
        }
        return makeBoolean(((NIL != document.sign_p(v_object)) && (NIL != pph_data_structures.paraphrase_phrase_info_bundle_p(document.sign_info(v_object)))) && ((NIL == verify_dtrsP) || (NIL != pph_phrase_verify_dtrs(v_object))));
    }

    public static SubLObject pph_phrase_verify_dtrs(final SubLObject phrase) {
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject new_format_string;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (NIL != pph_phrase_p(dtr, UNPROVIDED)) {
                    pph_phrase_verify_dtrs(dtr);
                } else {
                    new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str120$Found_non_phrase_dtr___S) });
                    pph_error.pph_handle_error(new_format_string, list(dtr));
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return $VERIFIED;
    }

    public static SubLObject pph_phrase_non_empty_output_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL != pph_phrase_output_list_p(v_object)));
    }

    public static SubLObject pph_phrase_output_list_p(final SubLObject v_object) {
        return pph_utilities.pph_list_ofP(PPH_PHRASE_OUTPUT_ITEM_LOOSE_P, v_object);
    }

    public static SubLObject pph_phrase_cycl_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != sublisp_true()));
    }

    public static SubLObject pph_phrase_case_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != pph_utilities.pph_case_kwP(v_object)));
    }

    public static SubLObject pph_phrase_wu_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_admitted.generic_arg_p(v_object)) {
            return T;
        }
        SubLObject ans = sublisp_null(v_object);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if ((NIL != indexed_term_p(v_object)) && (NIL == ans)) {
                SubLObject csome_list_var;
                SubLObject pos_forms_pred;
                for (csome_list_var = $list125, pos_forms_pred = NIL, pos_forms_pred = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = kb_mapping_utilities.some_pred_value(v_object, pos_forms_pred, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , pos_forms_pred = csome_list_var.first()) {
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_phrase_head_dtr_num_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || v_object.isInteger());
    }

    public static SubLObject pph_phrase_indefinite_articleP(final SubLObject phrase) {
        return makeBoolean(((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != member(pph_phrase_wu(phrase, UNPROVIDED), $list126, UNPROVIDED, UNPROVIDED))) || (NIL != member(pph_phrase_cycl(phrase, UNPROVIDED), $list127, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_phrase_definite_articleP(final SubLObject phrase) {
        return makeBoolean(((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && pph_phrase_wu(phrase, UNPROVIDED).eql($$The_TheWord)) || pph_phrase_cycl(phrase, UNPROVIDED).eql($$Definite_NLAttr));
    }

    public static SubLObject pph_phrase_note_done(final SubLObject phrase) {
        pph_phrase_note_done_status(phrase, T);
        pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(phrase);
        return phrase;
    }

    public static SubLObject pph_phrase_note_not_done(final SubLObject phrase) {
        pph_phrase_note_done_status(phrase, NIL);
        final SubLObject mother = pph_phrase_mother(phrase);
        if (NIL != mother) {
            pph_phrase_note_not_done(mother);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_note_done_status(final SubLObject phrase, final SubLObject doneP) {
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $DONE_, SEVEN_INTEGER, doneP);
        return phrase;
    }

    public static SubLObject pph_phrase_doneP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_data_structures.valid_pph_phrase_p(phrase)) {
            return NIL;
        }
        final SubLObject doneP = pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $DONE_, SEVEN_INTEGER, NIL);
        if ((((((NIL == doneP) && (NIL != $pph_sanity_check_phrase_donenessP$.getDynamicValue(thread))) && (NIL != pph_phrase_has_stringP(phrase))) && (NIL != string_utilities.non_empty_stringP(pph_phrase_string(phrase, NIL)))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str131$_S_not_considered_done_, phrase);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return doneP;
    }

    public static SubLObject pph_phrase_has_stringP(final SubLObject phrase) {
        SubLObject csome_list_var = pph_phrase_output_list(phrase);
        SubLObject item = NIL;
        item = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != pph_string.pph_string_p(pph_data_structures.pph_phrase_output_item_string(item))) {
                return T;
            }
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_ranged_det_phrase_p(final SubLObject phrase, SubLObject recurseP) {
        if (recurseP == UNPROVIDED) {
            recurseP = T;
        }
        SubLObject dtrnum = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject this_dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                this_dtr = aref(vector_var, element_num);
                if (pph_phrase_wu(this_dtr, UNPROVIDED).eql($$Between_TheWord) || ((NIL != pph_phrase_string(this_dtr, UNPROVIDED)) && (NIL != Strings.string_equal(pph_phrase_string(this_dtr, UNPROVIDED), $$$between, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    return T;
                }
                if ((dtrnum.eql(ONE_INTEGER) && (NIL != pph_symbol_phrase_p(this_dtr))) && $$EnDash_TheSymbol.eql(pph_data_structures.pph_phrase_info_lookup(this_dtr, $SYMBOL, UNPROVIDED))) {
                    return T;
                }
                if ((NIL != recurseP) && (NIL != pph_ranged_det_phrase_p(pph_phrase_nth_dtr(phrase, ZERO_INTEGER), NIL))) {
                    return T;
                }
                dtrnum = add(dtrnum, ONE_INTEGER);
            }
        }
        return NIL;
    }

    public static SubLObject pph_phrase_destroy_dtrs_metered(final SubLObject v_pph_phrase) {
        if (NIL != pph_phrase_has_dtrsP(v_pph_phrase)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str135$Destroying_dtrs_of__S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject old_new_pph_phrase_count = pph_data_structures.pph_phrase_id_index_new_objects_count();
            final SubLObject destruction_result = pph_phrase_destroy_dtrs(v_pph_phrase, UNPROVIDED);
            final SubLObject new_new_pph_phrase_count = pph_data_structures.pph_phrase_id_index_new_objects_count();
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str136$Destroyed_failed_phrase_dtrs____N, old_new_pph_phrase_count, new_new_pph_phrase_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject pph_phrase_destroyer() {
        return $pph_phrase_destroyer$.getGlobalValue();
    }

    public static SubLObject set_pph_phrase_destruction_grace_period(final SubLObject seconds) {
        return delayed_processor.delayed_processor_set_delay_seconds($pph_phrase_destroyer$.getGlobalValue(), seconds);
    }

    public static SubLObject smite_doomed_pph_phrases_next_time_around() {
        return delayed_processor.delayed_processor_flush_next_time_around(pph_phrase_destroyer());
    }

    public static SubLObject destroy_pph_phrase(final SubLObject v_pph_phrase, SubLObject exceptions) {
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == pph_macros.$inside_destroy_new_pph_phrasesP$.getDynamicValue(thread)) || (NIL != new_pph_phrase_p(v_pph_phrase))) && (NIL != pph_phrase_p(v_pph_phrase, UNPROVIDED))) {
            pph_data_structures.pph_phrase_info_set(v_pph_phrase, $DESTRUCTION_EXCEPTIONS, exceptions);
            if (NIL != bypass_pph_phrase_destroyerP()) {
                destroy_pph_phrase_low(v_pph_phrase);
            } else {
                delayed_processor.schedule($pph_phrase_destroyer$.getGlobalValue(), v_pph_phrase);
            }
        }
        return NIL;
    }

    public static SubLObject bypass_pph_phrase_destroyerP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = makeBoolean(((NIL == http_processP(UNPROVIDED)) || (NIL == $generated_phrases_browsableP$.getDynamicValue(thread))) && (NIL != pph_vars.$bypass_pph_phrase_destroyerP$.getDynamicValue(thread)));
        warn_about_pph_phrase_destruction(value, UNPROVIDED);
        return value;
    }

    public static SubLObject http_processP(SubLObject process) {
        if (process == UNPROVIDED) {
            process = current_process();
        }
        return makeBoolean((NIL != string_utilities.starts_with(process_name(process), $$$Socket_Connection_Handler)) && (NIL != search(princ_to_string(http_kernel.http_port()), process_name(process), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject clear_warn_about_pph_phrase_destruction() {
        final SubLObject cs = $warn_about_pph_phrase_destruction_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_warn_about_pph_phrase_destruction(final SubLObject value, SubLObject process) {
        if (process == UNPROVIDED) {
            process = current_process();
        }
        return memoization_state.caching_state_remove_function_results_with_args($warn_about_pph_phrase_destruction_caching_state$.getGlobalValue(), list(value, process), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject warn_about_pph_phrase_destruction_internal(final SubLObject value, final SubLObject process) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str145$Destroy_PPH_phrases_is__S_for__S, value, process, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return value;
    }

    public static SubLObject warn_about_pph_phrase_destruction(final SubLObject value, SubLObject process) {
        if (process == UNPROVIDED) {
            process = current_process();
        }
        SubLObject caching_state = $warn_about_pph_phrase_destruction_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WARN_ABOUT_PPH_PHRASE_DESTRUCTION, $warn_about_pph_phrase_destruction_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(value, process);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (value.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && process.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(warn_about_pph_phrase_destruction_internal(value, process)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(value, process));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject destroy_pph_phrase_low(final SubLObject v_pph_phrase) {
        final SubLObject id = pph_phrase_suid(v_pph_phrase);
        final SubLObject exceptions = pph_data_structures.pph_phrase_info_lookup(v_pph_phrase, $DESTRUCTION_EXCEPTIONS, UNPROVIDED);
        try {
            destroy_pph_phrase_int(v_pph_phrase, exceptions);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (id.isInteger()) {
                    pph_data_structures.pph_phrase_id_index_remove(id);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static SubLObject destroy_all_pph_phrases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = pph_data_structures.pph_phrase_id_index();
        SubLObject phrases_to_destroy = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
        try {
            pph_vars.$bypass_pph_phrase_destroyerP$.bind(T, thread);
            SubLObject release = NIL;
            try {
                release = seize_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
                final SubLObject idx = v_id_index;
                if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                    final SubLObject idx_$2 = idx;
                    if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject phrase;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            phrase = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(phrase)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(phrase)) {
                                    phrase = $SKIP;
                                }
                                phrases_to_destroy = cons(phrase, phrases_to_destroy);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx;
                    if (NIL == id_index_sparse_objects_empty_p(idx_$3)) {
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$3);
                        SubLObject id2 = NIL;
                        SubLObject phrase2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                phrase2 = getEntryValue(cdohash_entry);
                                phrases_to_destroy = cons(phrase2, phrases_to_destroy);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                SubLObject cdolist_list_var = phrases_to_destroy;
                SubLObject phrase3 = NIL;
                phrase3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    destroy_pph_phrase(phrase3, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    phrase3 = cdolist_list_var.first();
                } 
            } finally {
                if (NIL != release) {
                    release_lock(pph_data_structures.$pph_phrase_id_index_lock$.getGlobalValue());
                }
            }
        } finally {
            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0, thread);
        }
        return pph_data_structures.pph_phrase_count();
    }

    public static SubLObject destroy_pph_phrase_int(final SubLObject v_pph_phrase, final SubLObject exceptions) {
        pph_drs.remove_phrase_from_discourse_context(v_pph_phrase, UNPROVIDED);
        if (NIL != pph_phrase_has_dtrsP(v_pph_phrase)) {
            pph_phrase_destroy_dtrs(v_pph_phrase, exceptions);
        }
        pph_phrase_free_suid(v_pph_phrase);
        pph_phrase_free_alternatives(v_pph_phrase);
        pph_phrase_free_mother(v_pph_phrase);
        pph_phrase_destroy_info_bundle(v_pph_phrase);
        return NIL;
    }

    public static SubLObject pph_phrase_destroy_info_bundle(final SubLObject v_pph_phrase) {
        final SubLObject info_bundle = document.sign_info(v_pph_phrase);
        pph_data_structures._csetf_pph_phrase_info_cycl(info_bundle, $FREE);
        pph_data_structures._csetf_pph_phrase_info_agr(info_bundle, $FREE);
        pph_data_structures._csetf_pph_phrase_info_justification(info_bundle, $FREE);
        pph_data_structures._csetf_pph_phrase_info_output_list(info_bundle, $FREE);
        pph_data_structures._csetf_pph_phrase_info_arg_position_map(info_bundle, $FREE);
        pph_data_structures._csetf_pph_phrase_info_other(info_bundle, $FREE);
        document._csetf_sign_info(v_pph_phrase, NIL);
        return $DESTROYED;
    }

    public static SubLObject pph_phrase_destroy_dtrs(final SubLObject v_pph_phrase, SubLObject exceptions) {
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(v_pph_phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if ((NIL != pph_phrase_p(dtr, UNPROVIDED)) && (NIL == find(dtr, exceptions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    destroy_pph_phrase(dtr, exceptions);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        document._csetf_sign_constituents(v_pph_phrase, NIL);
        return v_pph_phrase;
    }

    public static SubLObject pph_phrase_info_set_high(final SubLObject phrase, final SubLObject property, final SubLObject value) {
        if (property.eql($DEMERITS)) {
            return pph_phrase_set_top_level_demerits(phrase, value, UNPROVIDED);
        }
        if (property.eql($CASE)) {
            return pph_phrase_set_case(phrase, value, UNPROVIDED);
        }
        if (property.eql($PROBLEM_DICTIONARY)) {
            return pph_phrase_set_top_level_problem_dictionary(phrase, value);
        }
        if (property.eql($SUID)) {
            return pph_phrase_set_suid(phrase, value);
        }
        if (property.eql($MOTHER)) {
            return pph_phrase_set_mother(phrase, value);
        }
        if (property.eql($LINK_CYCL)) {
            return pph_phrase_set_link_cycl(phrase, value);
        }
        if (property.eql($WU)) {
            return pph_phrase_set_wu(phrase, value);
        }
        if (property.eql($HEAD_DTR_NUM)) {
            return pph_phrase_set_head_dtr_num(phrase, value);
        }
        if (property.eql($SOURCE_POS)) {
            return pph_phrase_resolution.pph_phrase_set_source_pos(phrase, value);
        }
        if (property.eql($ALTERNATIVES)) {
            return pph_phrase_set_alternatives(phrase, value);
        }
        if (property.eql($LINK_CYCL)) {
            return pph_phrase_set_link_cycl(phrase, value);
        }
        if (property.eql($DONE_)) {
            if (NIL != value) {
                return pph_phrase_note_done(phrase);
            }
            return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, SEVEN_INTEGER, value);
        } else {
            if (property.eql($QUERY_EL_FORMULA)) {
                return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, EIGHT_INTEGER, value);
            }
            if (property.eql($SPECIAL_TYPE)) {
                return pph_phrase_set_special_type(phrase, value);
            }
            if (property.eql($RESERVED_FOR_MATRIX_ARG0) || property.eql($kw45$NON_LOCAL_FEATURES_IGNORED_)) {
                return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, ONE_INTEGER, value);
            }
            if (property.eql($kw45$NON_LOCAL_FEATURES_IGNORED_)) {
                return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, property, SIX_INTEGER, value);
            }
            return pph_data_structures.pph_phrase_info_set(phrase, property, value);
        }
    }

    public static SubLObject pph_phrase_demerits(final SubLObject phrase) {
        SubLObject total_demerits = pph_phrase_top_level_demerits(phrase);
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_demerits;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                dtr_demerits = pph_phrase_demerits(dtr);
                if (dtr_demerits.isPositive()) {
                    total_demerits = add(total_demerits, dtr_demerits);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return total_demerits;
    }

    public static SubLObject pph_phrase_contextualized_demerits(final SubLObject phrase) {
        return pph_phrase_demerits(pph_phrase_root_mother(phrase));
    }

    public static SubLObject pph_phrase_top_level_demerits(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $DEMERITS, TEN_INTEGER, ZERO_INTEGER);
    }

    public static SubLObject pph_phrase_top_level_demerits_reason(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $DEMERITS_REASON, ELEVEN_INTEGER, NIL);
    }

    public static SubLObject pph_phrase_set_top_level_demerits(final SubLObject phrase, final SubLObject demerits, SubLObject why) {
        if (why == UNPROVIDED) {
            why = NIL;
        }
        assert NIL != subl_promotions.non_negative_integer_p(demerits) : "subl_promotions.non_negative_integer_p(demerits) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(demerits) " + demerits;
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $DEMERITS, TEN_INTEGER, demerits);
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $DEMERITS_REASON, ELEVEN_INTEGER, why);
    }

    public static SubLObject pph_phrase_increment_top_level_demerits(final SubLObject phrase, SubLObject delta, SubLObject why) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        pph_phrase_set_top_level_demerits(phrase, number_utilities.maximum(list(ZERO_INTEGER, add(delta, pph_phrase_top_level_demerits(phrase))), UNPROVIDED), why);
        return pph_phrase_top_level_demerits(phrase);
    }

    public static SubLObject pph_phrase_max_alternatives(final SubLObject phrase) {
        SubLObject max_alternatives = pph_phrase_local_max_alternatives(phrase);
        for (SubLObject focal_phrase = phrase; (NIL == subl_promotions.positive_integer_p(max_alternatives)) && (NIL != pph_phrase_p(pph_phrase_mother(focal_phrase), UNPROVIDED)); focal_phrase = pph_phrase_mother(focal_phrase) , max_alternatives = pph_phrase_local_max_alternatives(focal_phrase)) {
        }
        return max_alternatives;
    }

    public static SubLObject pph_phrase_local_max_alternatives(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, $MAX_ALTERNATIVES, ZERO_INTEGER);
    }

    public static SubLObject pph_phrase_set_max_alternatives(final SubLObject phrase, final SubLObject max_alternatives) {
        return pph_data_structures.pph_phrase_info_set(phrase, $MAX_ALTERNATIVES, max_alternatives);
    }

    public static SubLObject pph_phrase_set_inferences(final SubLObject phrase, final SubLObject inferences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ids_es = NIL;
        SubLObject err_msg = NIL;
        final SubLObject suppress_pph_warningsP = makeBoolean(NIL == $warn_on_invalid_pph_inferencesP$.getDynamicValue(thread));
        SubLObject cdolist_list_var = inferences;
        SubLObject inference = NIL;
        inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind(NIL, thread);
                pph_error.$pph_error_handling_onP$.bind(T, thread);
                if (NIL != pph_error.pph_break_on_errorP()) {
                    ids_es = cons(inference_datastructures_inference.inference_ids(inference), ids_es);
                } else {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                ids_es = cons(inference_datastructures_inference.inference_ids(inference), ids_es);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (err_msg.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(err_msg), $str165$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            } finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
            }
            err_msg = NIL;
            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        } 
        pph_data_structures.pph_phrase_info_set(phrase, $INFERENCES, nreverse(ids_es));
        return pph_data_structures.pph_phrase_info_lookup(phrase, $INFERENCES, NIL);
    }

    public static SubLObject pph_phrase_inferences(final SubLObject phrase) {
        SubLObject inferences = NIL;
        SubLObject cdolist_list_var = pph_data_structures.pph_phrase_info_lookup(phrase, $INFERENCES, NIL);
        SubLObject ids = NIL;
        ids = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject inference = apply(FIND_INFERENCE_BY_IDS, ids);
            if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                inferences = cons(inference, inferences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ids = cdolist_list_var.first();
        } 
        return nreverse(inferences);
    }

    public static SubLObject pph_phrase_add_inference(final SubLObject phrase, final SubLObject inference) {
        return pph_phrase_set_inferences(phrase, cons(inference, pph_phrase_inferences(phrase)));
    }

    public static SubLObject pph_phrase_case(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $CASE, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject pph_phrase_set_case(final SubLObject phrase, final SubLObject v_case, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        if ((NIL != pph_meta_phrase_p(phrase)) && (NIL != descend_into_metaP)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_phrase_set_case(dtr, v_case, descend_into_metaP);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        } else {
            pph_phrase_set_case_low(phrase, v_case);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_set_case_low(final SubLObject phrase, final SubLObject v_case) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $CASE, ZERO_INTEGER, v_case);
    }

    public static SubLObject pph_phrase_set_cases_recursively(final SubLObject phrase) {
        pph_phrase_set_object_case(phrase);
        pph_phrase_set_subject_case(phrase);
        pph_phrase_set_genitive_case(phrase);
        return phrase;
    }

    public static SubLObject pph_phrase_set_object_case(final SubLObject phrase) {
        SubLObject cdolist_list_var = pph_phrase_object_dtrs(phrase);
        SubLObject object_phrase = NIL;
        object_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_phrase_p(object_phrase, UNPROVIDED)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str168$__Setting_object_dtr_agr_to_accus, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase_set_case(object_phrase, $ACCUSATIVE, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            object_phrase = cdolist_list_var.first();
        } 
        return phrase;
    }

    public static SubLObject pph_phrase_set_genitive_case(final SubLObject phrase) {
        SubLObject cdolist_list_var = pph_phrase_possessive_dtrs(phrase);
        SubLObject possessive_phrase = NIL;
        possessive_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_phrase_p(possessive_phrase, UNPROVIDED)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str170$__Setting_possessive_dtr_agr_to_g, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase_set_case(possessive_phrase, $GENITIVE, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            possessive_phrase = cdolist_list_var.first();
        } 
        return phrase;
    }

    public static SubLObject pph_phrase_object_dtrs(final SubLObject phrase) {
        SubLObject object_dtrs = union(pph_phrase_prepositional_object_dtrs(phrase), pph_phrase_verb_object_dtrs(phrase), UNPROVIDED, UNPROVIDED);
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    object_dtrs = append(object_dtrs, pph_phrase_object_dtrs(dtr));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return object_dtrs;
    }

    public static SubLObject pph_phrase_possessive_dtrs(final SubLObject phrase) {
        SubLObject possessive_dtrs = list_utilities.find_all($$PossessivePhrase, pph_phrase_dtr_list(phrase), symbol_function(EQL), symbol_function(PPH_PHRASE_CATEGORY));
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    possessive_dtrs = append(possessive_dtrs, pph_phrase_possessive_dtrs(dtr));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return possessive_dtrs;
    }

    public static SubLObject pph_phrase_prepositional_object_dtrs(final SubLObject phrase) {
        SubLObject object_dtrs = NIL;
        if ((NIL != pph_phrase_ppP(phrase)) && TWO_INTEGER.eql(pph_phrase_dtr_count(phrase))) {
            object_dtrs = cons(pph_phrase_nth_dtr(phrase, ONE_INTEGER), object_dtrs);
        }
        return object_dtrs;
    }

    public static SubLObject pph_phrase_verb_object_dtrs(final SubLObject phrase) {
        SubLObject object_dtrs = NIL;
        if (((((((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_phrase_clauseP(phrase))) && THREE_INTEGER.eql(pph_phrase_dtr_count(phrase))) && (NIL != pph_phrase_npP(pph_phrase_nth_dtr(phrase, ZERO_INTEGER)))) && ONE_INTEGER.eql(pph_phrase_head_dtr_num(phrase))) && (NIL != pph_transitive_verb_phraseP(pph_phrase_head_dtr(phrase)))) && (NIL != pph_phrase_npP(pph_phrase_nth_dtr(phrase, TWO_INTEGER)))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str174$Dtr_2_of_phrase_is_object_of__S__, pph_phrase_wu(pph_phrase_head_dtr(phrase), UNPROVIDED), phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            object_dtrs = cons(pph_phrase_nth_dtr(phrase, TWO_INTEGER), object_dtrs);
        }
        return object_dtrs;
    }

    public static SubLObject pph_transitive_verb_phraseP(final SubLObject phrase) {
        final SubLObject wu = pph_phrase_wu(phrase, UNPROVIDED);
        return makeBoolean(((NIL != pph_phrase_wu_p(wu)) && (NIL != pph_utilities.pph_genlP(pph_phrase_category(phrase, UNPROVIDED), $$Verb, UNPROVIDED))) && (NIL != subl_promotions.memberP($$TransitiveNPFrame, lexicon_accessors.frames_of_wordXpos(wu, $$Verb), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_phrase_set_subject_case(final SubLObject phrase) {
        final SubLObject subject_phrase = pph_phrase_subject_dtr(phrase);
        if (NIL != pph_phrase_p(subject_phrase, UNPROVIDED)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str177$__Setting_subject_dtr_agr_to_nomi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase_set_case(subject_phrase, $NOMINATIVE, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_subject_dtr(final SubLObject phrase) {
        if (NIL == pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        final SubLObject head_dtr = (head_dtr_num.isInteger()) ? pph_phrase_nth_dtr(phrase, head_dtr_num) : NIL;
        if (NIL == head_dtr) {
            final SubLObject possible_subject = pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
            if (((NIL != pph_phrase_npP(possible_subject)) && pph_phrase_dtr_count(phrase).numG(ONE_INTEGER)) && (NIL != pph_phrase_starts_with_verbP(pph_phrase_nth_dtr(phrase, ONE_INTEGER)))) {
                return possible_subject;
            }
        } else {
            if (NIL != pph_phrase_head_verbP(head_dtr)) {
                return pph_phrase_resolution.pph_phrase_agr_target_phrase(head_dtr, phrase);
            }
            if (NIL != pph_phrase_sP(head_dtr)) {
                return pph_phrase_subject_dtr(head_dtr);
            }
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (pph_phrase_case(dtr).eql($NOMINATIVE)) {
                    return dtr;
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return NIL;
    }

    public static SubLObject pph_phrase_starts_with_verbP(final SubLObject phrase) {
        if (NIL != pph_phrase_verbP(phrase)) {
            return T;
        }
        if (((NIL != pph_phrase_doneP(phrase)) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) && (NIL != pph_variable_handling.pph_string_is_posP(pph_string.pph_string_tokenize(pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED).first(), $$Verb, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if ((NIL != pph_phrase_has_dtrsP(phrase)) && (NIL != pph_phrase_starts_with_verbP(pph_phrase_nth_dtr(phrase, ZERO_INTEGER)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_phrase_subjectP(final SubLObject phrase) {
        if (NIL != pph_phrase_p(phrase, UNPROVIDED)) {
            final SubLObject mother = pph_phrase_mother(phrase);
            if (NIL != mother) {
                return equal(phrase, pph_phrase_subject_dtr(mother));
            }
        }
        return NIL;
    }

    public static SubLObject pph_phrase_top_level_problem_dictionary(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup(phrase, $PROBLEM_DICTIONARY, UNPROVIDED);
    }

    public static SubLObject pph_phrase_find_or_create_top_level_problem_dictionary(final SubLObject phrase) {
        SubLObject v_dictionary = pph_phrase_top_level_problem_dictionary(phrase);
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
            pph_phrase_set_top_level_problem_dictionary(phrase, v_dictionary);
        }
        return v_dictionary;
    }

    public static SubLObject pph_phrase_set_top_level_problem_dictionary(final SubLObject phrase, final SubLObject v_dictionary) {
        pph_data_structures.pph_phrase_info_set(phrase, $PROBLEM_DICTIONARY, v_dictionary);
        return pph_phrase_top_level_problem_dictionary(phrase);
    }

    public static SubLObject pph_phrase_maybe_dump_problem_reports(final SubLObject phrase, SubLObject top_level_onlyP) {
        if (top_level_onlyP == UNPROVIDED) {
            top_level_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.dictionary_p(pph_vars.$pph_problem_reports$.getDynamicValue(thread))) {
            pph_phrase_dump_problem_reports(phrase, top_level_onlyP);
        }
        return pph_vars.$pph_problem_reports$.getDynamicValue(thread);
    }

    public static SubLObject pph_phrase_add_problems(final SubLObject from_phrase, final SubLObject to_phrase) {
        final SubLObject to_phrase_problem_dictionary = pph_phrase_find_or_create_top_level_problem_dictionary(to_phrase);
        final SubLObject from_phrase_problem_dictionary = pph_phrase_compile_problem_dictionary(from_phrase);
        pph_merge_problem_dictionary(from_phrase_problem_dictionary, to_phrase_problem_dictionary);
        return to_phrase;
    }

    public static SubLObject pph_phrase_dump_problem_reports(final SubLObject phrase, final SubLObject top_level_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase_problem_dictionary = (NIL != top_level_onlyP) ? pph_phrase_top_level_problem_dictionary(phrase) : pph_phrase_compile_problem_dictionary(phrase);
        pph_merge_problem_dictionary(phrase_problem_dictionary, pph_vars.$pph_problem_reports$.getDynamicValue(thread));
        return phrase;
    }

    public static SubLObject pph_phrase_compile_problem_dictionary(final SubLObject v_pph_phrase) {
        final SubLObject top_level_problem_dictionary = pph_phrase_top_level_problem_dictionary(v_pph_phrase);
        final SubLObject phrase_problem_dictionary = (NIL != dictionary.dictionary_p(top_level_problem_dictionary)) ? dictionary_utilities.copy_dictionary(top_level_problem_dictionary) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject phrase_num = ZERO_INTEGER;
        if (document.sign_constituents(v_pph_phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_problem_dictionary;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                dtr_problem_dictionary = pph_phrase_compile_problem_dictionary(dtr);
                pph_merge_problem_dictionary(dtr_problem_dictionary, phrase_problem_dictionary);
                phrase_num = add(phrase_num, ONE_INTEGER);
            }
        }
        return phrase_problem_dictionary;
    }

    public static SubLObject pph_merge_problem_dictionary(final SubLObject from, final SubLObject to) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(from)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject reporter = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pph_problems = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = pph_problems;
            SubLObject pph_problem = NIL;
            pph_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                note_pph_problem(to, reporter, pph_problem);
                cdolist_list_var = cdolist_list_var.rest();
                pph_problem = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return to;
    }

    public static SubLObject pph_phrase_reporter_problems(final SubLObject phrase, final SubLObject reporter) {
        final SubLObject problem_dictionary = pph_phrase_top_level_problem_dictionary(phrase);
        SubLObject problems = NIL;
        if (NIL != dictionary.dictionary_p(problem_dictionary)) {
            problems = dictionary.dictionary_lookup(problem_dictionary, reporter, NIL);
        }
        return problems;
    }

    public static SubLObject pph_phrase_maybe_note_problem(final SubLObject phrase, final SubLObject reporter, final SubLObject problem_type, SubLObject other_info) {
        if (other_info == UNPROVIDED) {
            other_info = NIL;
        }
        if (NIL != pph_vars.pph_problem_reporting_on_p()) {
            pph_phrase_note_problem(phrase, reporter, problem_type, other_info);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_note_problem(final SubLObject phrase, final SubLObject reporter, final SubLObject problem_type, final SubLObject other_info) {
        SubLObject problem_dictionary = pph_phrase_top_level_problem_dictionary(phrase);
        if (NIL == dictionary.dictionary_p(problem_dictionary)) {
            problem_dictionary = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            pph_phrase_set_top_level_problem_dictionary(phrase, problem_dictionary);
        }
        return pph_note_problem(problem_dictionary, reporter, problem_type, other_info);
    }

    public static SubLObject pph_note_problem(final SubLObject problem_dictionary, final SubLObject reporter, final SubLObject problem_type, final SubLObject other_info) {
        final SubLObject problem = new_pph_problem(problem_type, other_info);
        return note_pph_problem(problem_dictionary, reporter, problem);
    }

    public static SubLObject note_pph_problem(final SubLObject problem_dictionary, final SubLObject reporter, final SubLObject problem) {
        dictionary_utilities.dictionary_pushnew(problem_dictionary, reporter, problem, symbol_function(EQUAL), UNPROVIDED);
        return values(problem, problem_dictionary);
    }

    public static SubLObject pph_problem_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != pph_problem_type_p(v_object.first())));
    }

    public static SubLObject pph_problem_string(final SubLObject reporter, final SubLObject pph_problem) {
        SubLObject problem_type = NIL;
        SubLObject other_info = NIL;
        destructuring_bind_must_consp(pph_problem, pph_problem, $list179);
        problem_type = pph_problem.first();
        final SubLObject current = other_info = pph_problem.rest();
        return cconcatenate(format_nil.format_nil_s_no_copy(reporter), new SubLObject[]{ $$$_reported_a_, format_nil.format_nil_s_no_copy(problem_type), $$$_problem, format_nil.format_nil_a_no_copy(NIL != other_info ? cconcatenate($str182$_with_this_additional_info_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(other_info) }) : $str184$_) });
    }

    public static SubLObject new_pph_problem(final SubLObject type, SubLObject other_info) {
        if (other_info == UNPROVIDED) {
            other_info = NIL;
        }
        return cons(type, other_info);
    }

    public static SubLObject pph_problem_type_p(final SubLObject v_object) {
        return keywordp(v_object);
    }

    public static SubLObject pph_phrase_suid(final SubLObject phrase) {
        return document.sign_offset(phrase);
    }

    public static SubLObject pph_phrase_set_suid(final SubLObject phrase, final SubLObject suid) {
        if (NIL != suid) {
        }
        if (suid.isInteger()) {
            pph_data_structures.pph_phrase_id_index_enter(phrase, suid);
        }
        return pph_phrase_set_suid_low(phrase, suid);
    }

    public static SubLObject pph_phrase_set_suid_low(final SubLObject phrase, final SubLObject suid) {
        document._csetf_sign_offset(phrase, suid);
        return suid;
    }

    public static SubLObject pph_phrase_free_suid(final SubLObject phrase) {
        return pph_phrase_set_suid_low(phrase, $FREE);
    }

    public static SubLObject pph_phrase_do_alternatives(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list186);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject alternative = NIL;
        SubLObject direct_alternative_of = NIL;
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list186);
        alternative = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list186);
        direct_alternative_of = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list186);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject queue = $sym187$QUEUE;
            final SubLObject done_count = $sym188$DONE_COUNT;
            return list(CLET, list(bq_cons(queue, $list189), bq_cons(done_count, $list4)), list(ENQUEUE, phrase, queue), list(UNTIL, list(QUEUE_EMPTY_P, queue), list(CLET, list(list(direct_alternative_of, list(DEQUEUE, queue))), listS(CDOLIST, list(alternative, list(PPH_PHRASE_LOCAL_ALTERNATIVES, direct_alternative_of)), append(body, list(list(CINC, done_count), list(PWHEN, listS($sym196$__, done_count, $list197), list(PPH_ERROR, ONE_INTEGER, $str199$Done__S_alternatives_of__S, done_count, phrase)), list(ENQUEUE, alternative, queue)))))));
        }
        cdestructuring_bind_error(datum, $list186);
        return NIL;
    }

    public static SubLObject pph_phrase_alternatives(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alternatives = NIL;
        final SubLObject queue = queues.create_queue(UNPROVIDED);
        SubLObject done_count = ZERO_INTEGER;
        queues.enqueue(phrase, queue);
        while (NIL == queues.queue_empty_p(queue)) {
            final SubLObject ignore_me = queues.dequeue(queue);
            SubLObject cdolist_list_var = pph_phrase_local_alternatives(ignore_me);
            SubLObject alternative = NIL;
            alternative = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = alternative;
                if (NIL == member(item_var, alternatives, symbol_function(EQ), symbol_function(IDENTITY))) {
                    alternatives = cons(item_var, alternatives);
                }
                done_count = add(done_count, ONE_INTEGER);
                if (done_count.numGE($pph_do_alternatives_max$.getDynamicValue(thread))) {
                    final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str199$Done__S_alternatives_of__S) });
                    pph_error.pph_handle_error(new_format_string, list(done_count, phrase));
                }
                queues.enqueue(alternative, queue);
                cdolist_list_var = cdolist_list_var.rest();
                alternative = cdolist_list_var.first();
            } 
        } 
        return nreverse(alternatives);
    }

    public static SubLObject pph_phrase_local_alternatives(final SubLObject phrase) {
        if (NIL != pph_meta_phrase_p(phrase)) {
            return pph_phrase_local_alternatives(pph_phrase_nth_dtr(phrase, ZERO_INTEGER));
        }
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $ALTERNATIVES, TWO_INTEGER, NIL);
    }

    public static SubLObject pph_phrase_set_alternatives(final SubLObject phrase, final SubLObject alternatives) {
        return pph_phrase_set_alternatives_low(phrase, alternatives);
    }

    public static SubLObject pph_phrase_set_alternatives_low(final SubLObject phrase, final SubLObject alternatives) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $ALTERNATIVES, TWO_INTEGER, alternatives);
    }

    public static SubLObject pph_phrase_add_alternative(final SubLObject phrase, final SubLObject alternative) {
        pph_phrase_set_alternatives(phrase, cons(alternative, pph_phrase_local_alternatives(phrase)));
        pph_phrase_set_mother(alternative, phrase);
        pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(alternative);
        return alternative;
    }

    public static SubLObject pph_phrase_remove_alternative(final SubLObject phrase, final SubLObject alternative) {
        pph_phrase_set_alternatives(phrase, remove(alternative, pph_phrase_local_alternatives(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return alternative;
    }

    public static SubLObject pph_phrase_free_alternatives(final SubLObject phrase) {
        return pph_phrase_set_alternatives_low(phrase, $FREE);
    }

    public static SubLObject pph_phrase_mother(final SubLObject phrase) {
        return document.sign_mother(phrase);
    }

    public static SubLObject pph_phrase_set_mother(final SubLObject phrase, final SubLObject mother) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != mother) && phrase.eql(mother)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str200$Setting_phrase_s_mother_to_itself);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        pph_phrase_set_mother_low(phrase, mother);
        return phrase;
    }

    public static SubLObject pph_phrase_free_mother(final SubLObject phrase) {
        return pph_phrase_set_mother_low(phrase, $FREE);
    }

    public static SubLObject pph_phrase_set_mother_low(final SubLObject phrase, final SubLObject mother) {
        document._csetf_sign_mother(phrase, mother);
        return phrase;
    }

    public static SubLObject pph_phrase_logical_mother(final SubLObject phrase) {
        SubLObject mother = pph_phrase_mother(phrase);
        for (final SubLObject seen = set.new_set(UNPROVIDED, UNPROVIDED); (NIL != pph_meta_phrase_p(mother)) && (NIL == set.set_memberP(mother, seen)); mother = pph_phrase_mother(mother)) {
            set.set_add(mother, seen);
        }
        return mother;
    }

    public static SubLObject pph_phrase_maximal_projection(final SubLObject phrase) {
        SubLObject projection = phrase;
        SubLObject mother = pph_phrase_mother(phrase);
        final SubLObject seen = set.new_set(UNPROVIDED, UNPROVIDED);
        while (NIL != pph_phrase_head_dtrP(projection, mother)) {
            set.set_add(mother, seen);
            projection = mother;
            mother = pph_phrase_mother(projection);
        } 
        return projection;
    }

    public static SubLObject pph_verb_find_sentential_mother(final SubLObject phrase) {
        SubLObject mother = pph_phrase_logical_mother(phrase);
        for (final SubLObject seen = set.new_set(UNPROVIDED, UNPROVIDED); (((NIL != pph_phrase_p(mother, UNPROVIDED)) && (NIL == set.set_memberP(mother, seen))) && (NIL != pph_phrase_category(mother, UNPROVIDED))) && (!$$NLSentence.eql(pph_phrase_category(mother, UNPROVIDED))); mother = pph_phrase_logical_mother(mother)) {
            set.set_add(mother, seen);
        }
        if (NIL == mother) {
            mother = pph_phrase_logical_mother(phrase);
        }
        return mother;
    }

    public static SubLObject pph_phrase_root_mother(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mother = NIL;
        final SubLObject _prev_bind_0 = $pph_root_mother_list$.currentBinding(thread);
        try {
            $pph_root_mother_list$.bind(NIL, thread);
            mother = pph_phrase_find_root_mother(phrase);
        } finally {
            $pph_root_mother_list$.rebind(_prev_bind_0, thread);
        }
        return mother;
    }

    public static SubLObject pph_phrase_find_root_mother(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject my_mother = pph_phrase_mother(phrase);
        if (NIL != member(my_mother, $pph_root_mother_list$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str202$Mother_is_part_of_cycle___S, my_mother);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return my_mother;
        }
        if (NIL != pph_phrase_p(my_mother, UNPROVIDED)) {
            $pph_root_mother_list$.setDynamicValue(cons(my_mother, $pph_root_mother_list$.getDynamicValue(thread)), thread);
            return pph_phrase_find_root_mother(my_mother);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_root_mother_cycl(final SubLObject phrase) {
        final SubLObject root_mother = pph_phrase_root_mother(phrase);
        return pph_phrase_cycl(root_mother, UNPROVIDED);
    }

    public static SubLObject pph_phrase_ancestor_p(final SubLObject higher, final SubLObject lower) {
        final SubLObject mother = pph_phrase_mother(lower);
        if (NIL == pph_phrase_p(mother, UNPROVIDED)) {
            return NIL;
        }
        if (higher.eql(mother)) {
            return T;
        }
        if (NIL != pph_phrase_ancestor_p(higher, mother)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_phrase_descendant_p(final SubLObject lower, final SubLObject higher) {
        return pph_phrase_ancestor_p(higher, lower);
    }

    public static SubLObject pph_phrase_has_ancestor_of_categoryP(final SubLObject phrase, final SubLObject category) {
        final SubLObject mother = pph_phrase_mother(phrase);
        if (NIL == pph_phrase_p(mother, UNPROVIDED)) {
            return NIL;
        }
        if (category.equal(pph_phrase_category(mother, T))) {
            return T;
        }
        return pph_phrase_has_ancestor_of_categoryP(mother, category);
    }

    public static SubLObject pph_phrase_justification(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_justification(document.sign_info(phrase));
    }

    public static SubLObject pph_phrase_set_justification(final SubLObject phrase, final SubLObject just) {
        pph_data_structures._csetf_pph_phrase_info_justification(document.sign_info(phrase), just);
        return phrase;
    }

    public static SubLObject pph_phrase_add_justification(final SubLObject phrase, final SubLObject just) {
        if (NIL == just) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str203$PPH_PHRASE_ADD_JUSTIFICATION_pass) });
            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject phrase_just = pph_phrase_justification(phrase);
        if (NIL == member(just, phrase_just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
            phrase_just = cons(just, phrase_just);
        }
        pph_phrase_set_justification(phrase, nreverse(phrase_just));
        return phrase;
    }

    public static SubLObject pph_phrase_add_justifications_from_phrase(final SubLObject target_phrase, final SubLObject destination_phrase) {
        SubLObject cdolist_list_var = pph_phrase_justification(destination_phrase);
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_phrase_add_justification(target_phrase, just);
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return target_phrase;
    }

    public static SubLObject pph_phrase_add_justifications_from_item(final SubLObject target_phrase, final SubLObject output_item) {
        SubLObject cdolist_list_var = pph_data_structures.pph_phrase_output_item_justification(output_item);
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_phrase_add_justification(target_phrase, just);
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return target_phrase;
    }

    public static SubLObject pph_code_justification(final SubLObject symbol, SubLObject more_info) {
        if (more_info == UNPROVIDED) {
            more_info = NIL;
        }
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        assert NIL != listp(more_info) : "Types.listp(more_info) " + "CommonSymbols.NIL != Types.listp(more_info) " + more_info;
        return cons($CODE, cons(symbol, more_info));
    }

    public static SubLObject pph_nl_generation_cache_justification() {
        return pph_code_justification(NL_GENERATION_CACHE_METHOD, UNPROVIDED);
    }

    public static SubLObject pph_phrase_gather_supports(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_phrase_doneP(phrase)) {
            return NIL;
        }
        SubLObject supports = list_utilities.remove_if_not(SUPPORT_P, pph_phrase_justification(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                supports = nconc(supports, pph_phrase_gather_supports(dtr));
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        if ((NIL != list_utilities.empty_list_p(supports)) && (NIL != pph_types.pph_lexical_wordP(pph_phrase_wu(phrase, UNPROVIDED)))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hlmt_czer.canonicalize_hlmt(list($$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread))));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                supports = cons(removal_modules_lexicon.make_word_strings_support(make_binary_formula(pph_phrase_agr_pred(phrase), pph_phrase_wu(phrase, UNPROVIDED), pph_phrase_string(phrase, NIL))), supports);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return delete_duplicates(supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_all_variant_dtr_lists(final SubLObject phrase, SubLObject equality_test, SubLObject recursiveP) {
        if (equality_test == UNPROVIDED) {
            equality_test = $sym211$PPH_VARIANT_STRING__;
        }
        if (recursiveP == UNPROVIDED) {
            recursiveP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dtr_variants = NIL;
        SubLObject dtr_variant_lists = NIL;
        final SubLObject arbitrary_cutoff = $pph_variant_list_max_count$.getDynamicValue(thread);
        if (NIL == pph_macros.pph_timeout_time_reachedP()) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject this_dtr_variants;
                SubLObject variant_lists;
                SubLObject nospace_variant_lists;
                SubLObject cdolist_list_var;
                SubLObject variant_list;
                SubLObject nospace_variant_list;
                SubLObject cdolist_list_var_$5;
                SubLObject variant;
                SubLObject cdolist_list_var2;
                SubLObject alternate;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    this_dtr_variants = NIL;
                    if (NIL != pph_nospace_phrase_p(dtr)) {
                        variant_lists = pph_phrase_all_variant_dtr_lists(dtr, equality_test, T);
                        nospace_variant_lists = NIL;
                        cdolist_list_var = variant_lists;
                        variant_list = NIL;
                        variant_list = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            nospace_variant_list = NIL;
                            cdolist_list_var_$5 = variant_list;
                            variant = NIL;
                            variant = cdolist_list_var_$5.first();
                            while (NIL != cdolist_list_var_$5) {
                                nospace_variant_list = cons(cons($NOSPACE, variant), nospace_variant_list);
                                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                variant = cdolist_list_var_$5.first();
                            } 
                            nospace_variant_lists = cons(nreverse(nospace_variant_list), nospace_variant_lists);
                            cdolist_list_var = cdolist_list_var.rest();
                            variant_list = cdolist_list_var.first();
                        } 
                        this_dtr_variants = nreverse(nospace_variant_lists);
                    } else
                        if (NIL != pph_meta_phrase_p(dtr)) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str212$Ignoring_possible_variants_for_me, dtr);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            dtr_variants = cons(list(dtr), dtr_variants);
                        } else {
                            cdolist_list_var2 = cons(dtr, pph_phrase_alternatives(dtr));
                            alternate = NIL;
                            alternate = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                if (NIL != pph_phrase_doneP(alternate)) {
                                    if (NIL != pph_phrase_has_dtrsP(alternate)) {
                                        this_dtr_variants = append(this_dtr_variants, pph_phrase_all_variant_dtr_lists(alternate, equality_test, T));
                                    } else {
                                        this_dtr_variants = cons(alternate, this_dtr_variants);
                                    }
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                alternate = cdolist_list_var2.first();
                            } 
                        }

                    dtr_variants = cons(list_utilities.delete_duplicates_from_start(this_dtr_variants, equality_test, UNPROVIDED, UNPROVIDED, UNPROVIDED), dtr_variants);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        if (NIL == recursiveP) {
            SubLObject clean = NIL;
            SubLObject cdolist_list_var3 = dtr_variants;
            SubLObject dtr_variant = NIL;
            dtr_variant = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                clean = cons(remove_if($sym213$VARIANT_HAS_MISSING_TARGET_, dtr_variant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), clean);
                cdolist_list_var3 = cdolist_list_var3.rest();
                dtr_variant = cdolist_list_var3.first();
            } 
            dtr_variants = nreverse(clean);
        }
        SubLObject cdolist_list_var3;
        final SubLObject variant_lists2 = cdolist_list_var3 = list_utilities.cartesian_product(nreverse(dtr_variants), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject variant_list2 = NIL;
        variant_list2 = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            dtr_variant_lists = cons(variant_list2, dtr_variant_lists);
            cdolist_list_var3 = cdolist_list_var3.rest();
            variant_list2 = cdolist_list_var3.first();
        } 
        maybe_warn_about_dtr_variant_lists(dtr_variant_lists, arbitrary_cutoff, phrase);
        return subseq(dtr_variant_lists, ZERO_INTEGER, min(length(dtr_variant_lists), arbitrary_cutoff));
    }

    public static SubLObject maybe_warn_about_dtr_variant_lists(final SubLObject dtr_variant_lists, final SubLObject arbitrary_cutoff, final SubLObject phrase) {
        if (((NIL == arbitrary_cutoff) || arbitrary_cutoff.numG(TEN_INTEGER)) && (NIL != list_utilities.lengthG(dtr_variant_lists, TEN_INTEGER, UNPROVIDED))) {
            SubLObject phrase_to_try;
            SubLObject cycl;
            for (phrase_to_try = phrase, cycl = pph_phrase_cycl(phrase_to_try, UNPROVIDED); (NIL == pph_known_cycl_p(cycl)) && (NIL != pph_phrase_mother(phrase_to_try)); phrase_to_try = pph_phrase_mother(phrase_to_try) , cycl = pph_phrase_cycl(phrase_to_try, UNPROVIDED)) {
            }
            Errors.warn($str214$Generated__D_dtr_variant_lists_fo, length(dtr_variant_lists), NIL != pph_known_cycl_p(cycl) ? cycl : $$$current_phrase);
            format_nil.print_one_per_line(Mapping.mapcar(PPH_VARIANT_STRING, list_utilities.first_n(TEN_INTEGER, dtr_variant_lists)), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject variant_has_missing_targetP(final SubLObject variant, SubLObject variant_list) {
        if (variant_list == UNPROVIDED) {
            variant_list = variant;
        }
        SubLObject missingP = NIL;
        if (NIL != pph_phrase_p(variant, UNPROVIDED)) {
            if (NIL != variant_phrase_has_missing_targetP(variant, variant_list)) {
                missingP = T;
            }
        } else
            if (variant.isList() && (NIL == missingP)) {
                SubLObject csome_list_var = variant;
                SubLObject sub = NIL;
                sub = csome_list_var.first();
                while ((NIL == missingP) && (NIL != csome_list_var)) {
                    if (NIL != variant_has_missing_targetP(sub, variant_list)) {
                        missingP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    sub = csome_list_var.first();
                } 
            }

        return missingP;
    }

    public static SubLObject variant_phrase_has_missing_targetP(final SubLObject variant, final SubLObject variant_list) {
        final SubLObject missingP = makeBoolean((NIL != pph_phrase_p(pph_phrase_resolution.pph_phrase_relative_agr_target(variant), UNPROVIDED)) && (NIL == list_utilities.tree_find(pph_phrase_resolution.pph_phrase_relative_agr_target(variant), variant_list, PPH_ANCESTOR_PHRASE_OR_SELF_P, UNPROVIDED)));
        return missingP;
    }

    public static SubLObject pph_ancestor_phrase_or_self_p(final SubLObject higher, final SubLObject lower) {
        return makeBoolean((NIL != pph_phrase_p(lower, UNPROVIDED)) && (lower.eql(higher) || (NIL != pph_phrase_ancestor_p(higher, lower))));
    }

    public static SubLObject pph_phrase_all_strings(final SubLObject phrase, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = NIL;
        if (NIL != pph_phrase_doneP(phrase)) {
            if ((NIL != pph_nospace_phrase_p(phrase)) || ((NIL != pph_phrase_has_dtrsP(phrase)) && (NIL == pph_meta_phrase_p(phrase)))) {
                final SubLObject nospaceP = pph_nospace_phrase_p(phrase);
                SubLObject cdolist_list_var = pph_phrase_all_variant_dtr_lists(phrase, UNPROVIDED, UNPROVIDED);
                SubLObject big_alternative_phrase_list = NIL;
                big_alternative_phrase_list = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject dtr_strings = NIL;
                    SubLObject cdolist_list_var_$6 = big_alternative_phrase_list;
                    SubLObject variant = NIL;
                    variant = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        final SubLObject string = pph_variant_string(variant, add_tagsP, phrase);
                        dtr_strings = cons(string, dtr_strings);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        variant = cdolist_list_var_$6.first();
                    } 
                    final SubLObject string2 = pph_utilities.clean_bunge_nreverse(dtr_strings, makeBoolean(NIL == nospaceP));
                    if (NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
                        SubLObject supports = list_utilities.remove_if_not(SUPPORT_P, pph_phrase_justification(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var_$7 = list_utilities.tree_gather(big_alternative_phrase_list, PPH_PHRASE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject variant_phrase = NIL;
                        variant_phrase = cdolist_list_var_$7.first();
                        while (NIL != cdolist_list_var_$7) {
                            final SubLObject items_var = pph_phrase_gather_supports(variant_phrase);
                            if (items_var.isVector()) {
                                final SubLObject vector_var = items_var;
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject item;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    item = aref(vector_var, element_num);
                                    supports = cons(item, supports);
                                }
                            } else {
                                SubLObject cdolist_list_var_$8 = items_var;
                                SubLObject item2 = NIL;
                                item2 = cdolist_list_var_$8.first();
                                while (NIL != cdolist_list_var_$8) {
                                    supports = cons(item2, supports);
                                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                    item2 = cdolist_list_var_$8.first();
                                } 
                            }
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            variant_phrase = cdolist_list_var_$7.first();
                        } 
                        pph_phrase_resolution.maybe_throw_pph_hl_supports(pph_phrase_cycl(phrase, UNPROVIDED), string2, pph_phrase_agr_preds(phrase, UNPROVIDED), delete_duplicates(supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE), UNPROVIDED, UNPROVIDED));
                    }
                    final SubLObject item_var = string2;
                    if (NIL == member(item_var, strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        strings = cons(item_var, strings);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    big_alternative_phrase_list = cdolist_list_var.first();
                } 
            }
            final SubLObject queue = queues.create_queue(UNPROVIDED);
            SubLObject done_count = ZERO_INTEGER;
            queues.enqueue(phrase, queue);
            while (NIL == queues.queue_empty_p(queue)) {
                final SubLObject ignore_me = queues.dequeue(queue);
                SubLObject cdolist_list_var2 = pph_phrase_local_alternatives(ignore_me);
                SubLObject alternative = NIL;
                alternative = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$9 = pph_alternative_phrase_strings(alternative, add_tagsP);
                    SubLObject alternative_string = NIL;
                    alternative_string = cdolist_list_var_$9.first();
                    while (NIL != cdolist_list_var_$9) {
                        if (NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
                            final SubLObject supports2 = list_utilities.remove_if_not(SUPPORT_P, pph_phrase_gather_supports(alternative), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            pph_phrase_resolution.maybe_throw_pph_hl_supports(pph_phrase_cycl(phrase, UNPROVIDED), alternative_string, pph_phrase_agr_preds(phrase, UNPROVIDED), delete_duplicates(supports2, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE), UNPROVIDED, UNPROVIDED));
                        }
                        final SubLObject item_var2 = alternative_string;
                        if (NIL == member(item_var2, strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            strings = cons(item_var2, strings);
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        alternative_string = cdolist_list_var_$9.first();
                    } 
                    done_count = add(done_count, ONE_INTEGER);
                    if (done_count.numGE($pph_do_alternatives_max$.getDynamicValue(thread))) {
                        final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str199$Done__S_alternatives_of__S) });
                        pph_error.pph_handle_error(new_format_string, list(done_count, phrase));
                    }
                    queues.enqueue(alternative, queue);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    alternative = cdolist_list_var2.first();
                } 
            } 
            final SubLObject item_var3 = pph_phrase_string(phrase, add_tagsP);
            if (NIL == member(item_var3, strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                strings = cons(item_var3, strings);
            }
        }
        return nreverse(strings);
    }

    public static SubLObject pph_variant_string_E_internal(final SubLObject variant1, final SubLObject variant2) {
        return equal(pph_variant_string(variant1, UNPROVIDED, UNPROVIDED), pph_variant_string(variant2, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_variant_string_E(final SubLObject variant1, final SubLObject variant2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_variant_string_E_internal(variant1, variant2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym211$PPH_VARIANT_STRING__, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym211$PPH_VARIANT_STRING__, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym211$PPH_VARIANT_STRING__, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(variant1, variant2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (variant1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && variant2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variant_string_E_internal(variant1, variant2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(variant1, variant2));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_variant_string_internal(final SubLObject variant, SubLObject add_tagsP, SubLObject matrix_phrase) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = NIL;
        }
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = NIL;
        }
        if (NIL != pph_phrase_p(variant, UNPROVIDED)) {
            if (NIL == pph_phrase_doneP(variant)) {
                pph_phrase_resolution.pph_phrase_get_string(variant, pph_phrase_cycl(variant, UNPROVIDED), matrix_phrase);
            }
            final SubLObject string = pph_phrase_string(variant, add_tagsP);
            if (NIL == pph_string.pph_string_p(string)) {
                final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str219$Failed_to_get_string_for_variant_) });
                pph_error.pph_handle_error(new_format_string, list(variant));
            }
            pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(variant);
            return string;
        }
        if (NIL != pattern_match.tree_matches_pattern(variant, $list220)) {
            SubLObject result = $str10$;
            SubLObject cdolist_list_var = variant.rest();
            SubLObject sub = NIL;
            sub = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = pph_string.pph_string_concatenate(result, pph_variant_string(sub, add_tagsP, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            } 
            return result;
        }
        if (variant.first().eql(variant)) {
            final SubLObject new_format_string2 = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str221$Auto_nested_PPH_phrase_variant__M) });
            pph_error.pph_handle_error(new_format_string2, list(matrix_phrase));
        } else
            if (NIL != car_nesting_depth_G(variant, TEN_INTEGER)) {
                final SubLObject new_format_string2 = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str222$PPH_phrase_variant_with_nesting_d) });
                pph_error.pph_handle_error(new_format_string2, list(matrix_phrase));
            } else {
                if (NIL != list_utilities.singletonP(variant)) {
                    return pph_variant_string(list_utilities.only_one(variant), add_tagsP, matrix_phrase);
                }
                SubLObject first_result = pph_variant_string(variant.first(), add_tagsP, NIL);
                final SubLObject rest_result = pph_variant_string(variant.rest(), add_tagsP, NIL);
                final SubLObject no_spaceP = pph_nospace_phrase_p(matrix_phrase);
                if ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != subl_promotions.memberP(first_result, $list223, symbol_function(EQUALP), UNPROVIDED))) {
                    final SubLObject new_determiner = first_result = pph_utilities.select_determiner_string($list224, rest_result, $$singular_Generic);
                }
                return NIL != no_spaceP ? pph_string.pph_string_concatenate(first_result, rest_result) : pph_string.pph_bunge(list(first_result, rest_result));
            }

        return NIL;
    }

    public static SubLObject pph_variant_string(final SubLObject variant, SubLObject add_tagsP, SubLObject matrix_phrase) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = NIL;
        }
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_variant_string_internal(variant, add_tagsP, matrix_phrase);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VARIANT_STRING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VARIANT_STRING, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_VARIANT_STRING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(variant, add_tagsP, matrix_phrase);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (variant.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (add_tagsP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && matrix_phrase.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variant_string_internal(variant, add_tagsP, matrix_phrase)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(variant, add_tagsP, matrix_phrase));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject car_nesting_depth_G(SubLObject obj, final SubLObject n) {
        SubLObject current_depth;
        for (current_depth = ZERO_INTEGER; obj.isCons() && current_depth.numLE(n); obj = obj.first() , current_depth = add(current_depth, ONE_INTEGER)) {
        }
        return numG(current_depth, n);
    }

    public static SubLObject pph_alternative_phrase_strings(final SubLObject alternative_phrase, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = T;
        }
        return pph_phrase_all_strings(alternative_phrase, add_tagsP);
    }

    public static SubLObject pph_phrase_all_output_lists(final SubLObject phrase) {
        return pph_phrase_all_output_lists_internal(phrase, T);
    }

    public static SubLObject pph_phrase_all_output_lists_internal(final SubLObject phrase, final SubLObject top_levelP) {
        SubLObject output_lists = NIL;
        if (NIL != pph_phrase_doneP(phrase)) {
            if (((NIL != pph_meta_phrase_p(phrase)) || (NIL != top_levelP)) || (NIL == pph_phrase_has_dtrsP(phrase))) {
                final SubLObject item_var = pph_phrase_output_list(phrase);
                if (NIL == member(item_var, output_lists, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    output_lists = cons(item_var, output_lists);
                }
                SubLObject cdolist_list_var = pph_phrase_alternatives(phrase);
                SubLObject alternative = NIL;
                alternative = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$10 = pph_phrase_all_output_lists_internal(alternative, NIL);
                    SubLObject alternative_output_list = NIL;
                    alternative_output_list = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        final SubLObject item_var2 = alternative_output_list;
                        if (NIL == member(item_var2, output_lists, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            output_lists = cons(item_var2, output_lists);
                        }
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        alternative_output_list = cdolist_list_var_$10.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    alternative = cdolist_list_var.first();
                } 
            } else {
                final SubLObject nospaceP = pph_nospace_phrase_p(phrase);
                SubLObject cdolist_list_var2 = pph_phrase_all_variant_dtr_lists(phrase, UNPROVIDED, UNPROVIDED);
                SubLObject big_alternative_phrase_list = NIL;
                big_alternative_phrase_list = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject dtr_output_lists = NIL;
                    SubLObject cdolist_list_var_$11 = big_alternative_phrase_list;
                    SubLObject variant = NIL;
                    variant = cdolist_list_var_$11.first();
                    while (NIL != cdolist_list_var_$11) {
                        final SubLObject item_var3;
                        final SubLObject output_list = item_var3 = pph_variant_output_list(variant);
                        if (NIL == member(item_var3, dtr_output_lists, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            dtr_output_lists = cons(item_var3, dtr_output_lists);
                        }
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        variant = cdolist_list_var_$11.first();
                    } 
                    final SubLObject ordered_olists = nreverse(dtr_output_lists);
                    final SubLObject item_var4;
                    final SubLObject new_output_list = item_var4 = (NIL != nospaceP) ? list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(ordered_olists)) : apply(symbol_function(APPEND), ordered_olists);
                    if (NIL == member(item_var4, output_lists, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        output_lists = cons(item_var4, output_lists);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    big_alternative_phrase_list = cdolist_list_var2.first();
                } 
            }
        }
        return nreverse(output_lists);
    }

    public static SubLObject pph_variant_output_list(final SubLObject variant) {
        if (NIL != pph_phrase_p(variant, UNPROVIDED)) {
            return pph_phrase_output_list(variant);
        }
        if (NIL != pattern_match.tree_matches_pattern(variant, $list220)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = variant.rest();
            SubLObject sub = NIL;
            sub = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(pph_variant_output_list(sub), result);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            } 
            return list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(nreverse(result)));
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = variant;
        SubLObject sub = NIL;
        sub = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(result, pph_variant_output_list(sub));
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject pph_phrase_all_output_items(final SubLObject phrase) {
        SubLObject output_items = NIL;
        if (NIL != pph_phrase_doneP(phrase)) {
            if ((NIL != pph_meta_phrase_p(phrase)) || (NIL == pph_phrase_has_dtrsP(phrase))) {
                pph_phrase_consolidate_output_list(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject item_var = list_utilities.only_one(pph_phrase_output_list(phrase));
                if (NIL == member(item_var, output_items, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    output_items = cons(item_var, output_items);
                }
                SubLObject cdolist_list_var = pph_phrase_alternatives(phrase);
                SubLObject alternative = NIL;
                alternative = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$12 = pph_phrase_all_output_items(alternative);
                    SubLObject alternative_output_item = NIL;
                    alternative_output_item = cdolist_list_var_$12.first();
                    while (NIL != cdolist_list_var_$12) {
                        final SubLObject item_var2 = alternative_output_item;
                        if (NIL == member(item_var2, output_items, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            output_items = cons(item_var2, output_items);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        alternative_output_item = cdolist_list_var_$12.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    alternative = cdolist_list_var.first();
                } 
            } else {
                final SubLObject nospaceP = pph_nospace_phrase_p(phrase);
                final SubLObject head_dtr = pph_phrase_head_dtr(phrase);
                final SubLObject agr = (NIL != pph_phrase_p(head_dtr, UNPROVIDED)) ? pph_phrase_agr_pred(head_dtr) : NIL;
                SubLObject cdolist_list_var2 = pph_phrase_all_variant_dtr_lists(phrase, UNPROVIDED, UNPROVIDED);
                SubLObject big_alternative_phrase_list = NIL;
                big_alternative_phrase_list = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject backward_alternative_output_item_list = NIL;
                    SubLObject cdolist_list_var_$13 = big_alternative_phrase_list;
                    SubLObject variant = NIL;
                    variant = cdolist_list_var_$13.first();
                    while (NIL != cdolist_list_var_$13) {
                        backward_alternative_output_item_list = cons(pph_variant_output_item(variant), backward_alternative_output_item_list);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        variant = cdolist_list_var_$13.first();
                    } 
                    final SubLObject string = pph_utilities.clean_bunge_nreverse(Mapping.mapcar(PPH_PHRASE_OUTPUT_ITEM_STRING, backward_alternative_output_item_list), makeBoolean(NIL == nospaceP));
                    final SubLObject cycl = pph_phrase_cycl(phrase, UNPROVIDED);
                    final SubLObject arg_position = pph_phrase_arg_position(phrase);
                    final SubLObject html_open_tag = NIL;
                    final SubLObject html_close_tag = NIL;
                    final SubLObject item_var3 = pph_consolidate_output_items(nreverse(backward_alternative_output_item_list), string, cycl, arg_position, html_open_tag, html_close_tag, agr, UNPROVIDED);
                    if (NIL == member(item_var3, output_items, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        output_items = cons(item_var3, output_items);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    big_alternative_phrase_list = cdolist_list_var2.first();
                } 
            }
        }
        return nreverse(output_items);
    }

    public static SubLObject pph_variant_output_item(final SubLObject variant) {
        if (NIL != pph_phrase_p(variant, UNPROVIDED)) {
            return list_utilities.only_one(pph_phrase_consolidate_output_list(variant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != pattern_match.tree_matches_pattern(variant, $list220)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = variant.rest();
            SubLObject sub = NIL;
            sub = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(pph_variant_output_item(sub), result);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            } 
            return pph_data_structures.new_pph_phrase_output_item_nospace_group(nreverse(result));
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = variant.rest();
        SubLObject sub = NIL;
        sub = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(pph_variant_output_item(sub), result);
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        } 
        return pph_consolidate_output_items(nreverse(result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_string_no_tags(final SubLObject phrase) {
        return pph_phrase_string(phrase, NIL);
    }

    public static SubLObject pph_phrase_string(final SubLObject phrase, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = T;
        }
        final SubLObject phrase_doneP = pph_phrase_doneP(phrase);
        SubLObject string = (NIL != phrase_doneP) ? pph_phrase_noted_string(phrase, add_tagsP, UNPROVIDED) : NIL;
        if ((NIL == pph_string.pph_string_p(string)) && (NIL != phrase_doneP)) {
            string = pph_phrase_output_list_string(pph_phrase_output_list(phrase), add_tagsP);
            pph_phrase_note_string(phrase, string, add_tagsP);
        }
        return string;
    }

    public static SubLObject pph_phrase_clear_noted_strings(final SubLObject phrase) {
        pph_data_structures.pph_phrase_info_clear(phrase, $HTML_STRING);
        document._csetf_sign_string(phrase, NIL);
        return phrase;
    }

    public static SubLObject pph_phrase_note_string(final SubLObject phrase, final SubLObject string, final SubLObject tagsP) {
        if (NIL != tagsP) {
            pph_data_structures.pph_phrase_info_set(phrase, $HTML_STRING, string);
        } else {
            document._csetf_sign_string(phrase, string);
        }
        final SubLObject noted_string = pph_phrase_noted_string(phrase, tagsP, UNPROVIDED);
        if ((NIL != pph_string.pph_string_p(string)) && (NIL == pph_string.pph_string_equalP(string, noted_string))) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str228$Failed_to_note__S_on__S___Noted_s) });
            pph_error.pph_handle_error(new_format_string, list(string, phrase, noted_string));
        }
        return noted_string;
    }

    public static SubLObject pph_phrase_noted_string(final SubLObject phrase, SubLObject tagsP, SubLObject not_found) {
        if (tagsP == UNPROVIDED) {
            tagsP = NIL;
        }
        if (not_found == UNPROVIDED) {
            not_found = $NOT_FOUND;
        }
        if (NIL != tagsP) {
            return pph_data_structures.pph_phrase_info_lookup(phrase, $HTML_STRING, not_found);
        }
        final SubLObject noted_string = document.sign_string(phrase);
        return NIL != pph_string.pph_string_p(noted_string) ? noted_string : not_found;
    }

    public static SubLObject pph_phrase_maybe_add_anchor_tags(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_phrase_has_html_anchor_tagsP(phrase)) {
            final SubLObject v_object = pph_phrase_link_cycl(phrase);
            final SubLObject arg_position = pph_phrase_arg_position(phrase);
            if ((NIL != pph_html.pph_use_anchor_tags_for_termP(v_object)) && (NIL != pph_html.pph_use_anchor_tags_for_arg_positionP(arg_position))) {
                thread.resetMultipleValues();
                final SubLObject open_tag = pph_html.pph_anchor_tags_for_term(v_object);
                final SubLObject close_tag = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (open_tag.isString() && close_tag.isString()) {
                    pph_phrase_add_html_tags(phrase, open_tag, close_tag);
                }
            }
        }
        return pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_output_item_maybe_add_anchor_tags(final SubLObject output_item, final SubLObject item_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_html.pph_use_anchor_tags_for_termP(item_cycl)) {
            thread.resetMultipleValues();
            final SubLObject open_tag = pph_html.pph_anchor_tags_for_term(item_cycl);
            final SubLObject close_tag = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (open_tag.isString() && close_tag.isString()) {
                pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, open_tag, close_tag);
            }
        }
        return output_item;
    }

    public static SubLObject pph_phrase_has_html_anchor_tagsP(final SubLObject phrase) {
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = pph_phrase_output_list(phrase), item = NIL, item = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = makeBoolean((NIL != pph_html.pph_html_includes_anchor_open_tagP(pph_data_structures.pph_phrase_output_item_html_open_tag(item))) || (NIL != pph_html.pph_html_includes_anchor_close_tagP(pph_data_structures.pph_phrase_output_item_html_close_tag(item)))) , csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
            }
        }
        return ans;
    }

    public static SubLObject pph_phrase_output_list_string_no_tags(final SubLObject output_list) {
        return pph_phrase_output_list_string(output_list, NIL);
    }

    public static SubLObject pph_phrase_output_list_string(final SubLObject output_list, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = eql(pph_vars.$paraphrase_mode$.getDynamicValue(), $HTML);
        }
        SubLObject strings = NIL;
        SubLObject inside_anchor_tagsP = NIL;
        SubLObject cdolist_list_var = output_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_string = pph_phrase_output_item_get_string(item, add_tagsP);
            if (NIL != add_tagsP) {
                final SubLObject item_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
                final SubLObject item_open_tagP = (item_open_tag.isString()) ? string_utilities.substringP($$$href, item_open_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                final SubLObject item_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
                final SubLObject item_close_tagP = list_utilities.sublisp_boolean(stringp(item_close_tag));
                if (((NIL != item_string) && (NIL != inside_anchor_tagsP)) && (NIL != item_open_tagP)) {
                    final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str231$__Adding_new_tag_inside_old___) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                    item_string = cconcatenate(item_close_tag, item_string);
                }
                inside_anchor_tagsP = makeBoolean((NIL != item_open_tagP) && (NIL == item_close_tagP));
            }
            final SubLObject var = item_string;
            if (NIL != var) {
                strings = cons(var, strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if ((NIL != add_tagsP) && (NIL != inside_anchor_tagsP)) {
            strings = cons(html_macros.$html_anchor_tail$.getGlobalValue(), strings);
        }
        SubLObject string = pph_phrase_output_list_assemble_string(strings);
        if (NIL == add_tagsP) {
            string = pph_utilities.pph_remove_html_tags(string, UNPROVIDED);
        }
        return string;
    }

    public static SubLObject pph_phrase_output_list_assemble_string(final SubLObject strings) {
        SubLObject string = NIL;
        if (NIL != strings) {
            if (NIL != list_utilities.singletonP(strings)) {
                string = strings.first();
            } else {
                string = pph_utilities.clean_bunge_nreverse(strings, UNPROVIDED);
            }
        }
        return string;
    }

    public static SubLObject pph_phrase_output_item_get_string(final SubLObject item, final SubLObject add_tagsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject item_string = NIL;
        if (NIL != pph_data_structures.pph_phrase_output_item_p(item)) {
            final SubLObject open_tag_slot_value = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
            final SubLObject open_tag = (NIL != open_tag_slot_value) ? open_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
            final SubLObject close_tag_slot_value = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
            final SubLObject close_tag = (NIL != close_tag_slot_value) ? close_tag_slot_value : string_utilities.$empty_string$.getGlobalValue();
            final SubLObject raw_string = pph_data_structures.pph_phrase_output_item_string(item);
            final SubLObject string = ((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) && (NIL != add_tagsP)) ? pph_utilities.pph_escape(raw_string) : raw_string;
            if ((NIL != pph_string.pph_string_p(string)) || ((NIL != add_tagsP) && ((NIL != list_utilities.lengthG(open_tag, ZERO_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthG(close_tag, ZERO_INTEGER, UNPROVIDED))))) {
                if (NIL != pph_string.pph_string_p(string)) {
                    item_string = string;
                }
                if ((NIL != add_tagsP) && open_tag.isString()) {
                    item_string = (NIL != pph_string.pph_string_p(item_string)) ? pph_string.pph_string_concatenate(open_tag, item_string) : open_tag;
                }
                if ((NIL != add_tagsP) && close_tag.isString()) {
                    item_string = (NIL != pph_string.pph_string_p(item_string)) ? pph_string.pph_string_concatenate(item_string, close_tag) : close_tag;
                }
            }
        } else
            if (NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item)) {
                item_string = pph_data_structures.pph_phrase_output_item_nospace_group_get_string(item, add_tagsP);
            } else
                if (NIL != pph_data_structures.enhanced_pph_output_item_p(item)) {
                    item_string = pph_phrase_output_item_get_string(pph_data_structures.enhanced_pph_output_item_item(item), add_tagsP);
                }


        if (NIL == add_tagsP) {
            item_string = pph_utilities.pph_remove_html_tags(item_string, UNPROVIDED);
        }
        return item_string;
    }

    public static SubLObject pph_phrase_set_string(final SubLObject phrase, final SubLObject string) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str232$__Setting_string_to__S___S_, string, pph_string.pph_string_to_utf8(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != string) {
        }
        final SubLObject cycl = pph_phrase_cycl(phrase, UNPROVIDED);
        if ((NIL != pph_known_cycl_p(cycl)) && (NIL != pph_vars.pph_forbidden_string_for_termP(cycl, string))) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str233$_S_is_a_forbidden_paraphrase_for_) });
            pph_error.pph_handle_error(new_format_string, list(string, cycl));
        }
        pph_phrase_note_string(phrase, pph_utilities.pph_remove_html_tags(string, UNPROVIDED), NIL);
        if (NIL != pph_string.pph_string_p(string)) {
            final SubLObject output_list = pph_phrase_output_list(phrase);
            final SubLObject new_output_item = pph_utilities.pph_html_string_to_output_item(string);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str234$__Output_list_1___S, output_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject pcase_var = length(output_list);
            if (!pcase_var.eql(ZERO_INTEGER)) {
                if (pcase_var.eql(ONE_INTEGER)) {
                    final SubLObject old_output_item = list_utilities.only_one(output_list);
                    pph_data_structures.pph_phrase_output_item_set_cycl(new_output_item, pph_data_structures.pph_phrase_output_item_cycl(old_output_item));
                    pph_data_structures.pph_phrase_output_item_set_arg_position(new_output_item, pph_data_structures.pph_phrase_output_item_arg_position(old_output_item));
                    pph_data_structures.pph_phrase_output_item_set_agr_pred(new_output_item, pph_data_structures.pph_phrase_output_item_agr_pred(old_output_item));
                } else {
                    pph_phrase_consolidate_output_list(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    pph_phrase_set_string(phrase, string);
                }
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str235$__Output_item____S, new_output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(new_output_item)) {
                pph_data_structures.pph_phrase_output_item_set_cycl(new_output_item, pph_phrase_cycl(phrase, UNPROVIDED));
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str236$__output_item_2____S, new_output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_data_structures.pph_phrase_output_item_set_agr_pred(new_output_item, pph_phrase_agr_pred(phrase));
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str237$__output_item_3____S, new_output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL == pph_utilities.pph_known_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(new_output_item))) && (NIL == pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(new_output_item)))) {
                    final SubLObject map = pph_phrase_arg_position_map(phrase);
                    final SubLObject top_position = pph_utilities.pph_arg_position_lookup(NIL, map);
                    pph_data_structures.pph_phrase_output_item_set_arg_position(new_output_item, top_position);
                }
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str238$__output_item_4____S, new_output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase_set_output_list(phrase, list(new_output_item), T);
                pph_phrase_note_done(phrase);
            }
        } else {
            pph_phrase_set_output_list(phrase, NIL, UNPROVIDED);
        }
        return pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_arg_position(final SubLObject phrase) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
        if (NIL != list_utilities.singletonP(output_list)) {
            arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_list.first());
        }
        if ((NIL != pph_utilities.pph_unknown_arg_position_p(arg_position)) && (NIL == pph_phrase_p(pph_phrase_mother(phrase), UNPROVIDED))) {
            arg_position = pph_utilities.pph_top_level_arg_position(pph_phrase_arg_position_map(phrase));
        }
        return arg_position;
    }

    public static SubLObject pph_phrase_set_arg_position(final SubLObject phrase, SubLObject position) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        SubLObject new_output_item = NIL;
        final SubLObject pcase_var = length(output_list);
        if (pcase_var.eql(ZERO_INTEGER)) {
            new_output_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), position, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                new_output_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
                pph_data_structures.pph_phrase_output_item_set_arg_position(new_output_item, position);
            } else {
                pph_phrase_consolidate_output_list(phrase, position, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        if (NIL != new_output_item) {
            pph_phrase_set_output_list(phrase, list(new_output_item), UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_output_list_copy(final SubLObject olist) {
        return Mapping.mapcar(PPH_PHRASE_OUTPUT_ITEM_COPY, olist);
    }

    public static SubLObject pph_phrase_set_output_list_cycl(final SubLObject phrase, final SubLObject cycl) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        SubLObject new_output_item = NIL;
        final SubLObject pcase_var = length(output_list);
        if (pcase_var.eql(ZERO_INTEGER)) {
            final SubLObject arg_position = pph_phrase_arg_position(phrase);
            new_output_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), arg_position, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                new_output_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
                pph_data_structures.pph_phrase_output_item_set_cycl(new_output_item, cycl);
            } else {
                pph_phrase_set_cycl(phrase, cycl);
                pph_phrase_consolidate_output_list(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        if (NIL != new_output_item) {
            pph_phrase_set_output_list(phrase, list(new_output_item), UNPROVIDED);
        }
        return pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_sanity_check_cycl(final SubLObject phrase) {
        return phrase;
    }

    public static SubLObject pph_phrase_set_html_tags(final SubLObject phrase, final SubLObject open_tag, final SubLObject close_tag) {
        if (NIL != open_tag) {
        }
        if (NIL != close_tag) {
        }
        final SubLObject output_list = pph_phrase_output_list(phrase);
        final SubLObject pcase_var = length(output_list);
        if (pcase_var.eql(ZERO_INTEGER)) {
            final SubLObject new_output_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), NIL, NIL, open_tag, close_tag, UNPROVIDED);
            pph_phrase_set_output_list(phrase, list(new_output_item), UNPROVIDED);
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                final SubLObject new_output_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
                pph_data_structures.pph_phrase_output_item_set_html_tags(new_output_item, open_tag, close_tag);
                pph_phrase_set_output_list(phrase, list(new_output_item), UNPROVIDED);
            } else {
                final SubLObject new_first_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
                final SubLObject new_last_item = pph_data_structures.pph_phrase_output_item_copy(list_utilities.last_one(output_list));
                pph_data_structures.pph_phrase_output_item_set_html_tags(new_first_item, open_tag, NIL);
                pph_data_structures.pph_phrase_output_item_set_html_tags(new_last_item, NIL, close_tag);
                final SubLObject other_items = butlast(output_list.rest(), UNPROVIDED);
                final SubLObject new_list = cons(new_first_item, append(other_items, list(new_last_item)));
                pph_phrase_set_output_list(phrase, new_list, UNPROVIDED);
            }

        return phrase;
    }

    public static SubLObject pph_phrase_add_html_tags(final SubLObject phrase, final SubLObject open_tag, final SubLObject close_tag) {
        final SubLObject output_list = pph_phrase_output_list(phrase);
        final SubLObject old_first_item = output_list.first();
        final SubLObject old_open_tag = (NIL != pph_data_structures.pph_phrase_output_item_loose_p(old_first_item)) ? pph_data_structures.pph_phrase_output_item_html_open_tag(old_first_item) : NIL;
        final SubLObject old_last_item = list_utilities.last_one(output_list);
        final SubLObject old_close_tag = (NIL != pph_data_structures.pph_phrase_output_item_loose_p(old_last_item)) ? pph_data_structures.pph_phrase_output_item_html_close_tag(old_last_item) : NIL;
        final SubLObject new_open_tag = (old_open_tag.isString()) ? cconcatenate(open_tag, old_open_tag) : open_tag;
        final SubLObject new_close_tag = (old_close_tag.isString()) ? cconcatenate(old_close_tag, close_tag) : close_tag;
        pph_phrase_set_html_tags(phrase, new_open_tag, new_close_tag);
        return phrase;
    }

    public static SubLObject pph_phrase_find_or_set_category(final SubLObject phrase) {
        if (NIL == pph_phrase_category(phrase, UNPROVIDED)) {
            final SubLObject pred = pph_phrase_agr_pred(phrase);
            if ($ANY == pph_phrase_agr_preds(phrase, UNPROVIDED)) {
                pph_phrase_set_category(phrase, $ANY, UNPROVIDED);
            } else
                if (NIL != pph_utilities.pph_speech_part_predP(pred)) {
                    pph_phrase_set_category(phrase, lexicon_accessors.pos_of_pred(pred), UNPROVIDED);
                } else
                    if (NIL != pph_utilities.pph_name_string_predP(pred)) {
                        pph_phrase_set_category_to_np(phrase);
                    }


        }
        return pph_phrase_category(phrase, UNPROVIDED);
    }

    public static SubLObject pph_phrase_set_category_to_np(final SubLObject phrase) {
        pph_phrase_set_category(phrase, pph_utilities.pph_np_category(), UNPROVIDED);
        return pph_phrase_category(phrase, UNPROVIDED);
    }

    public static SubLObject pph_phrase_npP(final SubLObject phrase) {
        return pph_utilities.pph_npP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_heavy_npP(final SubLObject phrase) {
        if (NIL == pph_phrase_npP(phrase)) {
            return NIL;
        }
        if ((NIL != pph_phrase_doneP(phrase)) && (ONE_INTEGER.numG(count(CHAR_space, pph_string.pph_string_to_utf8(pph_phrase_string(phrase, NIL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != list_utilities.lengthG(pph_phrase_string(phrase, NIL), TWENTY_INTEGER, UNPROVIDED)))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str241$NP_is_heavy_based_on_string__S, pph_string.pph_string_to_utf8(pph_phrase_string(phrase, NIL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return T;
        }
        if ((NIL != pph_phrase_has_dtrsP(phrase)) && pph_phrase_dtr_count(phrase).numG(ONE_INTEGER)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str242$NP_is_heavy_based_on_dtrs_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_phrase_sP(final SubLObject phrase) {
        return pph_utilities.pph_sP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_nbarP(final SubLObject phrase) {
        return pph_utilities.pph_nbarP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_nominalP(final SubLObject phrase) {
        return pph_utilities.pph_genl_posP(pph_phrase_head_pos(phrase), $$Noun, UNPROVIDED);
    }

    public static SubLObject pph_phrase_possessiveP(final SubLObject phrase) {
        return pph_utilities.pph_genl_posP(pph_phrase_category(phrase, UNPROVIDED), $$PossessivePhrase, UNPROVIDED);
    }

    public static SubLObject pph_phrase_verbP(final SubLObject phrase) {
        return pph_utilities.pph_verbP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_set_category_to_pp(final SubLObject phrase) {
        pph_phrase_set_category(phrase, pph_utilities.pph_pp_category(), UNPROVIDED);
        return pph_phrase_category(phrase, UNPROVIDED);
    }

    public static SubLObject pph_phrase_ppP(final SubLObject phrase) {
        return pph_utilities.pph_ppP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_adjpP(final SubLObject phrase) {
        return pph_utilities.pph_adjpP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_adjP(final SubLObject phrase) {
        return pph_utilities.pph_adjP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_clauseP(final SubLObject phrase) {
        return pph_utilities.pph_clauseP(pph_phrase_category(phrase, UNPROVIDED));
    }

    public static SubLObject pph_copula_phraseP(final SubLObject phrase) {
        return makeBoolean((NIL != pph_phrase_p(phrase, UNPROVIDED)) && pph_phrase_wu(phrase, UNPROVIDED).eql($$Be_TheWord));
    }

    public static SubLObject pph_aux_verb_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject aux_verbP = NIL;
        if (NIL != pph_phrase_p(phrase, UNPROVIDED)) {
            aux_verbP = pph_utilities.pph_genl_posP(pph_phrase_category(phrase, UNPROVIDED), $$AuxVerb, UNPROVIDED);
            if ((NIL == aux_verbP) && (NIL != pph_utilities.pph_ask_lit(listS($$posForms, pph_phrase_wu(phrase, UNPROVIDED), $list247), pph_vars.$pph_language_mt$.getDynamicValue(thread)))) {
                final SubLObject mother = pph_phrase_mother(phrase);
                final SubLObject head_dtr_num = pph_phrase_head_dtr_num(mother);
                final SubLObject next_dtr_num = number_utilities.f_1X(head_dtr_num);
                final SubLObject next_dtr = pph_phrase_nth_dtr(mother, next_dtr_num);
                if (NIL != pph_phrase_p(next_dtr, UNPROVIDED)) {
                    final SubLObject next_dtr_string = pph_phrase_string(next_dtr, UNPROVIDED);
                    if ((NIL != pph_string.pph_string_p(next_dtr_string)) && (NIL != pph_utilities.pph_filter_preds($list248, pph_string.preds_of_pph_string(pph_string.pph_string_tokenize(next_dtr_string, UNPROVIDED).first(), UNPROVIDED), UNPROVIDED))) {
                        aux_verbP = T;
                    }
                }
            }
        }
        return aux_verbP;
    }

    public static SubLObject possibly_modal_verb_phraseP(final SubLObject phrase) {
        final SubLObject wu = pph_phrase_wu(phrase, UNPROVIDED);
        final SubLObject string = pph_phrase_string(phrase, UNPROVIDED);
        return makeBoolean(((NIL != wu) && (NIL != member(wu, pph_question.modal_words(), UNPROVIDED, UNPROVIDED))) || ((NIL != string) && (NIL != member(string, pph_question.modal_strings(), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject pph_ordinal_phraseP(final SubLObject phrase) {
        return pph_utilities.pph_genl_posP(pph_phrase_category(pph_phrase_lexical_head_dtr(phrase), UNPROVIDED), $$OrdinalAdjective, UNPROVIDED);
    }

    public static SubLObject pph_phrase_category(final SubLObject phrase, SubLObject follow_linksP) {
        if (follow_linksP == UNPROVIDED) {
            follow_linksP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject top_level_category = document.sign_category(phrase);
        SubLObject category = NIL;
        final SubLObject _prev_bind_0 = $pph_phrase_category_depth$.currentBinding(thread);
        try {
            $pph_phrase_category_depth$.bind(number_utilities.f_1X($pph_phrase_category_depth$.getDynamicValue(thread)), thread);
            if ($pph_phrase_category_depth$.getDynamicValue(thread).numG($pph_phrase_category_max_depth$.getGlobalValue())) {
                final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str252$Excessive_recursion___S__in_PPH_P) });
                pph_error.pph_handle_error(new_format_string, list($pph_phrase_category_depth$.getDynamicValue(thread)));
            } else
                if (((NIL != follow_linksP) && (NIL != pph_meta_phrase_p(phrase))) && (NIL == pph_quoted_paraphrase_phrase_p(phrase))) {
                    category = pph_phrase_category(pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED);
                } else
                    if (NIL != top_level_category) {
                        category = top_level_category;
                    } else
                        if (NIL != follow_linksP) {
                            if (NIL != pph_phrase_has_head_dtrP(phrase)) {
                                category = pph_phrase_category(pph_phrase_head_dtr(phrase), UNPROVIDED);
                            }
                        }



        } finally {
            $pph_phrase_category_depth$.rebind(_prev_bind_0, thread);
        }
        return category;
    }

    public static SubLObject pph_phrase_head_pos(final SubLObject phrase) {
        return pph_utilities.pph_pos_of_category(pph_phrase_category(phrase, T), UNPROVIDED);
    }

    public static SubLObject pph_phrase_set_category(final SubLObject phrase, SubLObject category, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        category = pph_utilities.pph_possibly_nartify(category);
        if ((((NIL != pph_cycl_phrase_p(phrase)) && (category != $CYCL_PHRASE)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str253$__Setting_CycL_phrase_s_category_, category);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        if ((NIL != pph_meta_phrase_p(phrase)) && (NIL != descend_into_metaP)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_phrase_set_category(dtr, category, descend_into_metaP);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        } else {
            document._csetf_sign_category(phrase, category);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_update_category(final SubLObject phrase, final SubLObject category, SubLObject descend_into_metaP, SubLObject override_existingP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        if (override_existingP == UNPROVIDED) {
            override_existingP = NIL;
        }
        if (NIL == pph_sentence.pph_sentence_p(phrase)) {
            if (NIL != pph_quoted_paraphrase_phrase_p(phrase)) {
                pph_phrase_set_category(phrase, category, NIL);
            } else
                if ((NIL != pph_meta_phrase_p(phrase)) && (NIL != descend_into_metaP)) {
                    SubLObject dtr_num = ZERO_INTEGER;
                    if (document.sign_constituents(phrase).isVector()) {
                        final SubLObject vector_var = document.sign_constituents(phrase);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject dtr;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            dtr = aref(vector_var, element_num);
                            if ((NIL == pph_quoted_paraphrase_phrase_p(phrase)) || (NIL != pph_find_new_category(pph_phrase_category(dtr, UNPROVIDED), category, $RETURN_NIL))) {
                                pph_phrase_update_category(dtr, category, descend_into_metaP, override_existingP);
                            }
                            dtr_num = add(dtr_num, ONE_INTEGER);
                        }
                    }
                } else
                    if ($$PossessivePhrase.eql(category) && (NIL != pph_phrase_npP(phrase))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str255$Possessivizing_NP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        final SubLObject nested_phrase = pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                        pph_phrase_set_only_dtr(phrase, nested_phrase);
                        pph_phrase_set_category(phrase, category, NIL);
                    } else
                        if ((NIL != pph_utilities.pph_genl_categoryP($$PossessivePhrase, pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED)) && (NIL != pph_utilities.pph_npP(category))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str256$Nominalizing_a_possessive_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            final SubLObject nested_phrase = pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                            pph_phrase_set_only_dtr(phrase, nested_phrase);
                            pph_phrase_set_category(phrase, category, NIL);
                        } else {
                            final SubLObject existing = pph_phrase_category(phrase, descend_into_metaP);
                            final SubLObject on_clash = (NIL != override_existingP) ? $OVERRIDE : $ERROR;
                            final SubLObject new_category = pph_find_new_category(existing, category, on_clash);
                            pph_phrase_maybe_coerce_np_to_nbar(phrase, category, existing);
                            pph_phrase_set_category(phrase, new_category, descend_into_metaP);
                        }



        }
        return pph_phrase_category(phrase, descend_into_metaP);
    }

    public static SubLObject pph_phrase_maybe_coerce_np_to_nbar(final SubLObject phrase, final SubLObject category, final SubLObject existing) {
        if (((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_utilities.pph_nbarP(category))) && (NIL != pph_utilities.pph_npP(existing))) {
            final SubLObject np_cycl = pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject nbar_cycl = (NIL != pph_det_nbarP(phrase)) ? pph_phrase_cycl(pph_phrase_nth_dtr(phrase, ONE_INTEGER), UNPROVIDED) : NIL;
            if ((NIL != pph_utilities.pph_collectionP(np_cycl)) || (NIL != pph_utilities.pph_collectionP(nbar_cycl))) {
                pph_phrase_coerce_np_to_nbar(phrase);
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_coerce_np_to_nbar(final SubLObject phrase) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str259$Converting_NP_to__instance_of__Nb, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject instance_dtr = pph_templates.pph_phrasify_phrase_naut(bq_cons(pph_functions.bestnlwordformoflexemefn_constrained(), $list260), UNPROVIDED);
        final SubLObject of_dtr = pph_templates.pph_phrasify_phrase_naut(bq_cons(pph_functions.bestnlwordformoflexemefn_constrained(), $list261), UNPROVIDED);
        final SubLObject pp_dtr = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject nbar = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_pph_phrase_dtrs_from_list(pp_dtr, list(of_dtr, phrase), ZERO_INTEGER);
        pph_phrase_set_category(pp_dtr, pph_utilities.pph_pp_category(), UNPROVIDED);
        set_pph_phrase_dtrs_from_list(nbar, list(instance_dtr, pp_dtr), ZERO_INTEGER);
        pph_phrase_set_category(nbar, pph_utilities.pph_nbar_category(), UNPROVIDED);
        pph_phrase_copy(nbar, phrase, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str262$New_Nbar___S, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_find_new_category(final SubLObject existing, final SubLObject category, SubLObject on_clash) {
        if (on_clash == UNPROVIDED) {
            on_clash = $ERROR;
        }
        SubLObject new_category = category;
        if (NIL != existing) {
            if (NIL == cycl_utilities.expression_find_if(FORT_P, existing, UNPROVIDED, UNPROVIDED)) {
                new_category = existing;
            } else
                if (!existing.equal(category)) {
                    if ((NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(existing, UNPROVIDED), $$Determiner, UNPROVIDED)) && (NIL != pph_utilities.pph_genl_posP(category, $$Noun, UNPROVIDED))) {
                        new_category = existing;
                    } else
                        if ((NIL != pph_utilities.pph_genl_posP(category, $$NLSentence, UNPROVIDED)) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(existing, UNPROVIDED), $$Verb, UNPROVIDED))) {
                            new_category = category;
                        } else {
                            final SubLObject old_head_cat = pph_utilities.pph_pos_of_category(existing, UNPROVIDED);
                            final SubLObject new_head_cat = pph_phrase_reconcile_categories(pph_utilities.pph_pos_of_category(category, UNPROVIDED), old_head_cat, on_clash);
                            final SubLObject phrase_bar_level = lexicon_utilities.maximal_bar_level(existing, category);
                            final SubLObject generic_new_cat = lexicon_utilities.make_cat_with_bar_level(new_head_cat, phrase_bar_level);
                            new_category = (old_head_cat.equal(new_head_cat) && lexicon_utilities.bar_level(existing, UNPROVIDED).eql(phrase_bar_level)) ? pph_phrase_reconcile_categories(existing, generic_new_cat, on_clash) : generic_new_cat;
                        }

                }

        }
        return new_category;
    }

    public static SubLObject pph_phrase_reconcile_categories(final SubLObject cat1, final SubLObject cat2, SubLObject on_clash) {
        if (on_clash == UNPROVIDED) {
            on_clash = $ERROR;
        }
        if (cat1.equal(cat2)) {
            return cat1;
        }
        if (NIL != pph_better_categoryP(cat1, cat2)) {
            return cat1;
        }
        if (NIL != pph_better_categoryP(cat2, cat1)) {
            return cat2;
        }
        if (lexicon_utilities.bar_level(cat2, UNPROVIDED).numE(TWO_INTEGER) && (NIL != pph_utilities.pph_genlP(pph_utilities.pph_pos_of_category(cat1, UNPROVIDED), pph_utilities.pph_pos_of_category(cat2, UNPROVIDED), UNPROVIDED))) {
            return cat2;
        }
        if (lexicon_utilities.bar_level(cat1, UNPROVIDED).numE(TWO_INTEGER) && (NIL != pph_utilities.pph_genlP(pph_utilities.pph_pos_of_category(cat2, UNPROVIDED), pph_utilities.pph_pos_of_category(cat1, UNPROVIDED), UNPROVIDED))) {
            return cat1;
        }
        final SubLObject pcase_var = on_clash;
        if (pcase_var.eql($ERROR)) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str265$Don_t_know_how_to_reconcile__S_an) });
            pph_error.pph_handle_error(new_format_string, list(cat1, cat2));
            return NIL;
        }
        if (pcase_var.eql($RETURN_NIL)) {
            return NIL;
        }
        return cat1;
    }

    public static SubLObject pph_better_categoryP(final SubLObject cat1, final SubLObject cat2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == cat2) || cat1.isKeyword()) || (((NIL != indexed_term_p(cat1)) && (NIL != indexed_term_p(cat2))) && (NIL != pph_utilities.pph_genl_posP(cat1, cat2, pph_vars.$pph_language_mt$.getDynamicValue(thread)))));
    }

    public static SubLObject pph_phrase_set_cycl(final SubLObject phrase, final SubLObject cycl) {
        if ((NIL != pph_vars.pph_blacklist_active_p()) && (NIL != pph_known_cycl_p(cycl))) {
            final SubLObject string = pph_phrase_noted_string(phrase, NIL, UNPROVIDED);
            if ((NIL != pph_string.pph_string_p(string)) && (NIL != pph_vars.pph_forbidden_string_for_termP(cycl, string))) {
                final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str233$_S_is_a_forbidden_paraphrase_for_) });
                pph_error.pph_handle_error(new_format_string, list(pph_phrase_noted_string(phrase, NIL, UNPROVIDED), cycl));
            }
        }
        pph_data_structures._csetf_pph_phrase_info_cycl(document.sign_info(phrase), cycl);
        return phrase;
    }

    public static SubLObject pph_phrase_reset_cycl(final SubLObject phrase, final SubLObject template) {
        if (NIL == pph_utilities.pph_identity_template_p(template)) {
            final SubLObject cycl = pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject arg_position_map = pph_phrase_arg_position_map(phrase);
            pph_phrase_set_cycl(phrase, template);
            pph_phrase_resolution.pph_phrase_replace_generic_args(phrase, cycl, arg_position_map);
        }
        return values(pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase_arg_position_map(phrase));
    }

    public static SubLObject pph_unknown_cycl() {
        return $pph_unknown_cycl$.getGlobalValue();
    }

    public static SubLObject pph_unknown_cycl_p(final SubLObject obj) {
        return eq(obj, $pph_unknown_cycl$.getGlobalValue());
    }

    public static SubLObject pph_known_cycl_p(final SubLObject obj) {
        return makeBoolean((NIL == pph_unknown_cycl_p(obj)) && (NIL == pph_empty_cycl_p(obj)));
    }

    public static SubLObject pph_empty_cycl() {
        return $pph_empty_cycl$.getGlobalValue();
    }

    public static SubLObject pph_empty_cycl_p(final SubLObject obj) {
        return eq(obj, $pph_empty_cycl$.getGlobalValue());
    }

    public static SubLObject pph_phrase_set_link_cycl(final SubLObject phrase, final SubLObject cycl) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $LINK_CYCL, THREE_INTEGER, cycl);
    }

    public static SubLObject pph_phrase_link_cycl(final SubLObject phrase) {
        final SubLObject explicit = pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $LINK_CYCL, THREE_INTEGER, pph_unknown_cycl());
        if (NIL != pph_unknown_cycl_p(explicit)) {
            return pph_phrase_cycl(phrase, UNPROVIDED);
        }
        return explicit;
    }

    public static SubLObject pph_phrase_cycl(final SubLObject phrase, SubLObject matrix_formula) {
        if (matrix_formula == UNPROVIDED) {
            matrix_formula = NIL;
        }
        if ((NIL != pph_conditional_phrase_p(phrase)) && (NIL != el_formula_p(matrix_formula))) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, matrix_formula, pph_phrase_mother(phrase));
            return pph_phrase_cycl(phrase, matrix_formula);
        }
        return pph_data_structures.pph_phrase_info_cycl(document.sign_info(phrase));
    }

    public static SubLObject pph_phrase_has_known_cyclP(final SubLObject phrase) {
        return pph_known_cycl_p(pph_phrase_cycl(phrase, UNPROVIDED));
    }

    public static SubLObject pph_phrase_cycl_find_if(final SubLObject phrase, final SubLObject pred) {
        SubLObject ans = cycl_utilities.expression_find_if(pred, pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        if ((NIL == ans) && (NIL != pph_phrase_has_dtrsP(phrase))) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL == ans) {
                        ans = pph_phrase_cycl_find_if(dtr, pred);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return ans;
    }

    public static SubLObject pph_phrase_cycl_gather(final SubLObject phrase, final SubLObject pred, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject ans = cycl_utilities.expression_gather(pph_phrase_cycl(phrase, UNPROVIDED), pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    ans = append(ans, pph_phrase_cycl_gather(dtr, pred, UNPROVIDED));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return list_utilities.fast_delete_duplicates(ans, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_gather(final SubLObject phrase, final SubLObject test, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject phrases = NIL;
        if (NIL != funcall(test, funcall(key, phrase))) {
            phrases = cons(phrase, phrases);
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject items_var;
            SubLObject vector_var_$14;
            SubLObject backwardP_var_$15;
            SubLObject length_$16;
            SubLObject v_iteration_$17;
            SubLObject element_num_$18;
            SubLObject item;
            SubLObject cdolist_list_var;
            SubLObject item2;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                items_var = pph_phrase_gather(dtr, test, key);
                if (items_var.isVector()) {
                    vector_var_$14 = items_var;
                    backwardP_var_$15 = NIL;
                    for (length_$16 = length(vector_var_$14), v_iteration_$17 = NIL, v_iteration_$17 = ZERO_INTEGER; v_iteration_$17.numL(length_$16); v_iteration_$17 = add(v_iteration_$17, ONE_INTEGER)) {
                        element_num_$18 = (NIL != backwardP_var_$15) ? subtract(length_$16, v_iteration_$17, ONE_INTEGER) : v_iteration_$17;
                        item = aref(vector_var_$14, element_num_$18);
                        phrases = cons(item, phrases);
                    }
                } else {
                    cdolist_list_var = items_var;
                    item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        phrases = cons(item2, phrases);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrases;
    }

    public static SubLObject pph_sole_reference_p(final SubLObject phrase, final SubLObject cycl) {
        final SubLObject mother = pph_phrase_mother(phrase);
        final SubLObject other_reference = pph_phrase_find_other_reference(mother, cycl, phrase, UNPROVIDED);
        if ((NIL == other_reference) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str268$Couldn_t_find_another_reference_t, cycl, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return sublisp_null(other_reference);
    }

    public static SubLObject pph_phrase_find_other_reference(final SubLObject phrase, final SubLObject cycl, final SubLObject besides_phrase, SubLObject done_phrases) {
        if (done_phrases == UNPROVIDED) {
            done_phrases = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terminalP = makeBoolean(NIL == pph_phrase_has_dtrsP(phrase));
        SubLObject other_reference = NIL;
        if (phrase.eql(besides_phrase)) {
            other_reference = NIL;
        } else
            if (NIL != set.set_memberP(phrase, done_phrases)) {
                other_reference = NIL;
            } else
                if ((NIL != terminalP) && cycl.equal(pph_phrase_cycl(phrase, UNPROVIDED))) {
                    other_reference = pph_phrase_found_other_reference(phrase, cycl, besides_phrase);
                } else
                    if (((NIL != terminalP) && (NIL != cycl_utilities.expression_find(cycl, pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == pph_phrase_ancestor_p(phrase, besides_phrase))) {
                        other_reference = pph_phrase_found_other_reference(phrase, cycl, besides_phrase);
                    }



        if (NIL == other_reference) {
            set.set_add(phrase, done_phrases);
            if (NIL == terminalP) {
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject found_reference;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        if ((NIL == set.set_memberP(dtr, done_phrases)) && phrase.eql(pph_phrase_mother(dtr))) {
                            found_reference = pph_phrase_find_other_reference(dtr, cycl, besides_phrase, done_phrases);
                            if (NIL != found_reference) {
                                other_reference = found_reference;
                            }
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
            if (NIL == other_reference) {
                final SubLObject mother = pph_phrase_mother(phrase);
                if ((NIL != pph_phrase_p(mother, UNPROVIDED)) && (NIL == set.set_memberP(mother, done_phrases))) {
                    if (NIL != find(phrase, pph_phrase_dtrs(mother), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        final SubLObject found_reference2 = pph_phrase_find_other_reference(mother, cycl, besides_phrase, done_phrases);
                        if (NIL != found_reference2) {
                            other_reference = found_reference2;
                        }
                    } else
                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn($str269$_S_is_not_a_dtr_of_its_mother____, phrase, mother);
                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }

                }
            }
        }
        return other_reference;
    }

    public static SubLObject pph_phrase_found_other_reference(final SubLObject phrase, final SubLObject cycl, final SubLObject besides_phrase) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str270$__Found_another_reference_to__S__, cycl, besides_phrase, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_cycl_subst(final SubLObject v_new, final SubLObject old, final SubLObject phrase, SubLObject test, SubLObject new_arg_position) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (new_arg_position == UNPROVIDED) {
            new_arg_position = $KEEP_OLD_ARG_POSITION;
        }
        SubLObject replacedP = NIL;
        final SubLObject penetrate_hl_structuresP = NIL;
        if (NIL != cycl_utilities.expression_find(old, pph_phrase_cycl(phrase, UNPROVIDED), penetrate_hl_structuresP, test, UNPROVIDED)) {
            final SubLObject old_phrase_cycl = pph_phrase_cycl(phrase, UNPROVIDED);
            pph_phrase_set_cycl(phrase, cycl_utilities.expression_subst(v_new, old, old_phrase_cycl, test, UNPROVIDED));
            SubLObject new_phrase_cycl = pph_phrase_cycl(phrase, UNPROVIDED);
            new_phrase_cycl = pph_maybe_resolve_formula_arg_expressions(phrase, new_phrase_cycl, v_new, old, old_phrase_cycl, test);
            pph_phrase_cycl_subst_update_on_change(phrase, v_new, old, new_phrase_cycl, new_arg_position);
            replacedP = T;
        }
        if (NIL != pph_conditional_phrase_p(phrase)) {
            pph_conditional_phrase_set_test(phrase, cycl_utilities.expression_subst(v_new, old, pph_conditional_phrase_test(phrase), test, UNPROVIDED));
            replacedP = cycl_utilities.expression_find(v_new, pph_conditional_phrase_test(phrase), test, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject dtr_replacedP;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    dtr_replacedP = pph_phrase_cycl_subst(v_new, old, dtr, test, new_arg_position);
                    if (NIL != dtr_replacedP) {
                        replacedP = T;
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        if (NIL != pph_variable_binding_phrase_p(phrase)) {
            final SubLObject old_query_template = pph_variable_binding_phrase_query_template(phrase);
            final SubLObject new_query_template = cycl_utilities.expression_subst(v_new, old, old_query_template, test, UNPROVIDED);
            if (!old_query_template.equal(new_query_template)) {
                pph_variable_binding_phrase_set_query_template(phrase, new_query_template);
                replacedP = T;
            }
        }
        return replacedP;
    }

    public static SubLObject pph_maybe_resolve_formula_arg_expressions(final SubLObject phrase, SubLObject new_phrase_cycl, final SubLObject v_new, final SubLObject old, final SubLObject old_phrase_cycl, final SubLObject test) {
        if ((NIL != at_admitted.generic_arg_p(old)) && (NIL == pph_utilities.pph_arg_position_specifierP(v_new))) {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(old_phrase_cycl, $sym272$PPH_ARG_POSITION_SPECIFIER_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject template = NIL;
            template = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != pph_utilities.formula_arg_nautP(template)) && (NIL != cycl_utilities.expression_find(old, template, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    new_phrase_cycl = pph_resolve_formula_arg_fn(v_new, old, template, test, new_phrase_cycl);
                }
                pph_phrase_set_cycl(phrase, new_phrase_cycl);
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
            } 
        }
        return new_phrase_cycl;
    }

    public static SubLObject pph_resolve_formula_arg_fn(final SubLObject v_new, final SubLObject old, final SubLObject formula_arg_naut, final SubLObject test, final SubLObject phrase_cycl) {
        final SubLObject formula_arg_naut_with_new = cycl_utilities.expression_subst(v_new, old, formula_arg_naut, test, UNPROVIDED);
        final SubLObject resolved = pph_utilities.pph_apply_template(cycl_utilities.expression_subst($SELF, old, formula_arg_naut, test, UNPROVIDED), v_new);
        final SubLObject new_phrase_cycl = cycl_utilities.expression_subst(resolved, formula_arg_naut_with_new, phrase_cycl, test, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str274$Replacing__S_____with__S__, formula_arg_naut_with_new, resolved, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return new_phrase_cycl;
    }

    public static SubLObject pph_phrase_cycl_subst_update_on_change(final SubLObject phrase, final SubLObject v_new, final SubLObject old, final SubLObject new_phrase_cycl, final SubLObject new_arg_position) {
        if (NIL != pph_utilities.pph_arg_position_p(new_arg_position)) {
            pph_phrase_cycl_subst_update_arg_position(phrase, v_new, new_phrase_cycl, new_arg_position);
            pph_phrase_cycl_subst_update_arg_position_map(phrase, v_new, new_phrase_cycl, new_arg_position);
        }
        pph_phrase_cycl_subst_update_output_list_cycl(phrase, v_new, old);
        return phrase;
    }

    public static SubLObject pph_phrase_cycl_subst_update_arg_position(final SubLObject phrase, final SubLObject v_new, final SubLObject new_phrase_cycl, final SubLObject new_arg_position) {
        if (new_phrase_cycl.equal(v_new)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str275$__Setting_arg_position_of__S_to__, v_new, new_arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase_set_arg_position(phrase, new_arg_position);
        }
        return pph_phrase_arg_position(phrase);
    }

    public static SubLObject pph_phrase_cycl_subst_update_arg_position_map(final SubLObject phrase, final SubLObject v_new, final SubLObject new_phrase_cycl, final SubLObject new_arg_position) {
        final SubLObject map = pph_utilities.pph_new_prefix_map(new_arg_position);
        final SubLObject arg_position_in_new_phrase_cycl = (NIL != el_formula_p(new_phrase_cycl)) ? cycl_utilities.arg_positions_bfs(v_new, new_phrase_cycl, UNPROVIDED).first() : NIL;
        final SubLObject contextualized_map = pph_utilities.pph_contextualize_map(arg_position_in_new_phrase_cycl, map);
        pph_phrase_set_arg_position_map(phrase, contextualized_map);
        return pph_phrase_arg_position_map(phrase);
    }

    public static SubLObject pph_phrase_cycl_subst_update_output_list_cycl(final SubLObject phrase, final SubLObject v_new, final SubLObject old) {
        SubLObject cdolist_list_var = pph_phrase_output_list(phrase);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_data_structures.pph_phrase_output_item_set_cycl(item, cycl_utilities.expression_subst(v_new, old, pph_data_structures.pph_phrase_output_item_cycl(item), UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_cycls_of_phrases(final SubLObject the_list) {
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = the_list;
        SubLObject this_item = NIL;
        this_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_phrase_p(this_item, UNPROVIDED)) {
                cycls = cons(pph_phrase_cycl(this_item, UNPROVIDED), cycls);
            } else
                if (NIL != pph_data_structures.pph_phrase_output_item_p(this_item)) {
                    cycls = cons(pph_data_structures.pph_phrase_output_item_cycl(this_item), cycls);
                } else
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str276$cycls_of_phrases_doesn_t_know_wha, this_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        } 
        return reverse(cycls);
    }

    public static SubLObject pph_phrase_output_list(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_output_list(document.sign_info(phrase));
    }

    public static SubLObject pph_phrase_dtr_output_lists(final SubLObject phrase) {
        SubLObject dtr_olists = NIL;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                dtr_olists = cons(pph_phrase_output_list(dtr), dtr_olists);
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return nreverse(dtr_olists);
    }

    public static SubLObject pph_phrase_set_output_list(final SubLObject phrase, SubLObject output_list, SubLObject assume_consolidatedP) {
        if (assume_consolidatedP == UNPROVIDED) {
            assume_consolidatedP = NIL;
        }
        if (NIL == assume_consolidatedP) {
            output_list = consolidate_same_arg_items(output_list);
        }
        pph_data_structures._csetf_pph_phrase_info_output_list(document.sign_info(phrase), output_list);
        pph_phrase_clear_noted_strings(phrase);
        return phrase;
    }

    public static SubLObject consolidate_same_arg_items(final SubLObject output_list) {
        if (NIL == list_utilities.lengthG(output_list, ONE_INTEGER, UNPROVIDED)) {
            return output_list;
        }
        return do_consolidate_same_arg_items(output_list);
    }

    public static SubLObject do_consolidate_same_arg_items(final SubLObject output_list) {
        SubLObject new_list = NIL;
        SubLObject queued_item = NIL;
        SubLObject queued_strings = NIL;
        SubLObject cdolist_list_var = output_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != pph_utilities.pph_nl_tagP(pph_data_structures.pph_phrase_output_item_cycl(item))) || (NIL != at_admitted.generic_arg_p(pph_data_structures.pph_phrase_output_item_cycl(item)))) {
                final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(item);
                pph_data_structures.pph_phrase_output_item_set_cycl(new_item, pph_unknown_cycl());
                item = new_item;
            }
            final SubLObject item_string = pph_data_structures.pph_phrase_output_item_string(item);
            if ((NIL != queued_item) && (NIL != pph_phrase_output_itemE(queued_item, item))) {
                if (NIL != pph_string.pph_string_p(item_string)) {
                    queued_strings = cons(item_string, queued_strings);
                }
                queued_item = pph_phrase_output_item_consolidate_slots(item, queued_item);
            } else {
                if (NIL != queued_item) {
                    if ((NIL != list_utilities.lengthG(queued_strings, ZERO_INTEGER, UNPROVIDED)) && (NIL == pph_data_structures.pph_phrase_output_item_nospace_group_p(queued_item))) {
                        queued_item = new_item_from_queued_item(queued_item, queued_strings);
                    }
                    new_list = cons(queued_item, new_list);
                }
                queued_item = item;
                queued_strings = (NIL != pph_string.pph_string_p(item_string)) ? list(item_string) : NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL != queued_item) {
            if (NIL != list_utilities.lengthG(queued_strings, ONE_INTEGER, UNPROVIDED)) {
                queued_item = new_item_from_queued_item(queued_item, queued_strings);
            }
            new_list = cons(queued_item, new_list);
        }
        return nreverse(new_list);
    }

    public static SubLObject new_item_from_queued_item(final SubLObject queued_item, final SubLObject queued_strings) {
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(queued_item);
        final SubLObject new_string = pph_utilities.pph_remove_extra_spaces(pph_utilities.clean_bunge_nreverse(queued_strings, UNPROVIDED));
        pph_data_structures.pph_phrase_output_item_set_string(new_item, new_string);
        return new_item;
    }

    public static SubLObject pph_phrase_output_item_consolidate_slots(final SubLObject item, final SubLObject queued_item) {
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(queued_item);
        final SubLObject arg_position = (NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(queued_item))) ? pph_data_structures.pph_phrase_output_item_arg_position(item) : pph_data_structures.pph_phrase_output_item_arg_position(queued_item);
        final SubLObject cycl = (NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(queued_item))) ? pph_data_structures.pph_phrase_output_item_cycl(item) : pph_data_structures.pph_phrase_output_item_cycl(queued_item);
        final SubLObject html_open_tag = (NIL != pph_data_structures.pph_phrase_output_item_html_open_tag(queued_item)) ? pph_data_structures.pph_phrase_output_item_html_open_tag(queued_item) : pph_data_structures.pph_phrase_output_item_html_open_tag(item);
        final SubLObject html_close_tag = (NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(queued_item)) ? pph_data_structures.pph_phrase_output_item_html_close_tag(queued_item) : pph_data_structures.pph_phrase_output_item_html_close_tag(item);
        final SubLObject agr_pred = (NIL != pph_data_structures.pph_phrase_output_item_agr_pred(queued_item)) ? pph_data_structures.pph_phrase_output_item_agr_pred(queued_item) : pph_data_structures.pph_phrase_output_item_agr_pred(item);
        pph_data_structures.pph_phrase_output_item_set_arg_position(new_item, arg_position);
        pph_data_structures.pph_phrase_output_item_set_cycl(new_item, cycl);
        pph_data_structures.pph_phrase_output_item_set_html_tags(new_item, html_open_tag, html_close_tag);
        pph_data_structures.pph_phrase_output_item_set_agr_pred(new_item, agr_pred);
        return new_item;
    }

    public static SubLObject pph_phrase_output_itemE(final SubLObject item1, final SubLObject item2) {
        if (NIL != pph_phrase_output_items_html_unmergeableP(item1, item2)) {
            return NIL;
        }
        if ((NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item1)) || (NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item2))) {
            return NIL;
        }
        return makeBoolean(((((((((pph_data_structures.pph_phrase_output_item_string(item2).isString() && (NIL != list_utilities.lengthE(pph_data_structures.pph_phrase_output_item_string(item2), ONE_INTEGER, UNPROVIDED))) && (NIL != pph_utilities.pph_remove_space_beforeP(pph_data_structures.pph_phrase_output_item_string(item2), UNPROVIDED))) && (NIL == pph_data_structures.pph_phrase_output_item_arg_position(item1))) && (NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item1))) && (NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item2))) && (NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item2))) || ((NIL != pph_bare_string_output_item_p(item2, NIL)) && (NIL != pph_arg0_item_p(item1)))) || ((NIL != pph_bare_string_output_item_p(item1, NIL)) && (NIL != pph_arg0_item_p(item2)))) || ((((((((NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item1))) && (NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item2)))) || (NIL != pph_arg0_item_p(item1))) || (NIL != pph_arg0_item_p(item2))) || pph_data_structures.pph_phrase_output_item_arg_position(item1).equal(pph_data_structures.pph_phrase_output_item_arg_position(item2))) && (((NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item1))) || (NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item2)))) || pph_data_structures.pph_phrase_output_item_cycl(item1).equal(pph_data_structures.pph_phrase_output_item_cycl(item2)))) && (((NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item1)) && (NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item2))) || pph_data_structures.pph_phrase_output_item_html_open_tag(item1).equal(pph_data_structures.pph_phrase_output_item_html_open_tag(item2)))) && (((NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item1)) && (NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item2))) || pph_data_structures.pph_phrase_output_item_html_close_tag(item1).equal(pph_data_structures.pph_phrase_output_item_html_close_tag(item2)))));
    }

    public static SubLObject pph_phrase_output_items_html_unmergeableP(final SubLObject item1, final SubLObject item2) {
        SubLObject okP = T;
        if (NIL != pph_phrase_output_items_have_identical_closed_htmlP(item1, item2)) {
            okP = T;
        } else
            if ((NIL != pph_phrase_output_item_has_non_anchor_tagP(item1)) || (NIL != pph_phrase_output_item_has_non_anchor_tagP(item2))) {
                okP = NIL;
            } else
                if ((NIL != pph_data_structures.pph_phrase_output_item_html_open_tag(item1)) && (NIL != pph_data_structures.pph_phrase_output_item_html_open_tag(item2))) {
                    okP = NIL;
                } else
                    if ((NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(item1)) && (NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(item2))) {
                        okP = NIL;
                    } else
                        if ((NIL == pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && ((NIL != pph_arg0_item_p(item1)) || (NIL != pph_arg0_item_p(item2)))) {
                            okP = NIL;
                        }




        return makeBoolean(NIL == okP);
    }

    public static SubLObject pph_phrase_output_item_has_non_anchor_tagP(final SubLObject item) {
        return makeBoolean((pph_data_structures.pph_phrase_output_item_html_open_tag(item).isString() && (NIL != string_utilities.non_empty_string_p(pph_utilities.pph_remove_html_tags(pph_data_structures.pph_phrase_output_item_html_open_tag(item), T)))) || (pph_data_structures.pph_phrase_output_item_html_close_tag(item).isString() && (NIL != string_utilities.non_empty_string_p(pph_utilities.pph_remove_html_tags(pph_data_structures.pph_phrase_output_item_html_close_tag(item), T)))));
    }

    public static SubLObject pph_phrase_output_items_have_identical_closed_htmlP(final SubLObject item1, final SubLObject item2) {
        final SubLObject open1 = pph_data_structures.pph_phrase_output_item_html_open_tag(item1);
        final SubLObject open2 = pph_data_structures.pph_phrase_output_item_html_open_tag(item2);
        final SubLObject close1 = pph_data_structures.pph_phrase_output_item_html_close_tag(item1);
        final SubLObject close2 = pph_data_structures.pph_phrase_output_item_html_close_tag(item2);
        return pph_identical_closed_html_tagsP(open1, open2, close1, close2);
    }

    public static SubLObject pph_identical_closed_html_tagsP(final SubLObject open1, final SubLObject open2, final SubLObject close1, final SubLObject close2) {
        return makeBoolean(((((((NIL != string_utilities.non_empty_stringP(open1)) && (NIL != string_utilities.non_empty_stringP(open2))) && (NIL != string_utilities.non_empty_stringP(close1))) && (NIL != string_utilities.non_empty_stringP(close2))) && open1.equalp(open2)) && close1.equalp(close2)) && (NIL != pph_utilities.pph_closed_html_tagsP(open1, close1)));
    }

    public static SubLObject pph_current_arg0() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_arg0 = (NIL != pph_current_arg0_specified_p()) ? pph_vars.$pph_current_arg0$.getDynamicValue(thread) : pph_unknown_cycl();
        return current_arg0;
    }

    public static SubLObject pph_current_arg0_specified_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_utilities.expression_find_if(symbol_function(FORT_P), pph_vars.$pph_current_arg0$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_current_arg0_position() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != pph_utilities.pph_arg_position_p(pph_vars.$pph_current_arg0_position$.getDynamicValue(thread)) ? pph_vars.$pph_current_arg0_position$.getDynamicValue(thread) : NIL;
    }

    public static SubLObject pph_phrase_maybe_reserve_for_arg0(final SubLObject phrase) {
        final SubLObject current_cycl = pph_phrase_cycl(phrase, UNPROVIDED);
        if ((NIL == pph_utilities.pph_arg_position_specifierP(current_cycl)) && (NIL == pph_phrase_has_dtrsP(phrase))) {
            pph_phrase_resolution.pph_phrase_reserve_matrix_arg0_cycl(phrase);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_set_cycl_to_current_arg0(final SubLObject phrase) {
        if (NIL == pph_current_arg0_specified_p()) {
            pph_phrase_set_cycl(phrase, pph_current_arg0());
            pph_phrase_set_output_list_cycl(phrase, pph_current_arg0());
        }
        return phrase;
    }

    public static SubLObject pph_arg0_item_p(final SubLObject item) {
        return pph_arg0_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item));
    }

    public static SubLObject pph_arg0_position_p(final SubLObject arg_position) {
        return makeBoolean((NIL == pph_utilities.pph_unknown_arg_position_p(arg_position)) && last(arg_position, UNPROVIDED).equal($list4));
    }

    public static SubLObject pph_bare_string_output_item_p(final SubLObject item, final SubLObject allow_punctuationP) {
        return makeBoolean(((((((NIL != allow_punctuationP) || (NIL == pph_string.pph_string_p(pph_data_structures.pph_phrase_output_item_string(item)))) || (NIL != pph_string.pph_string_find_if(ALPHANUMERIC_CHAR_P, pph_data_structures.pph_phrase_output_item_string(item)))) && (NIL == pph_data_structures.pph_phrase_output_item_html_open_tag(item))) && (NIL == pph_data_structures.pph_phrase_output_item_html_close_tag(item))) && (NIL != pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item)))) && (NIL != pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item))));
    }

    public static SubLObject pph_phrase_set_output_list_with_map(final SubLObject phrase, final SubLObject output_list) {
        pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
        final SubLObject map = pph_phrase_arg_position_map(phrase);
        SubLObject cdolist_list_var = pph_phrase_output_list(phrase);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_data_structures.pph_phrase_output_item_set_arg_position(item, pph_utilities.pph_arg_position_lookup(pph_data_structures.pph_phrase_output_item_arg_position(item), map));
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_consolidate_output_list(final SubLObject phrase, SubLObject arg_position, SubLObject html_open_tag, SubLObject html_close_tag, SubLObject agr_pred) {
        if (arg_position == UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        if (html_open_tag == UNPROVIDED) {
            html_open_tag = NIL;
        }
        if (html_close_tag == UNPROVIDED) {
            html_close_tag = NIL;
        }
        if (agr_pred == UNPROVIDED) {
            agr_pred = pph_phrase_agr_pred(phrase);
        }
        final SubLObject demerits = pph_phrase_demerits(phrase);
        final SubLObject justification = pph_phrase_justification(phrase);
        SubLObject new_list = NIL;
        if (NIL != list_utilities.singletonP(pph_phrase_output_list(phrase))) {
            final SubLObject original_item = pph_phrase_output_list(phrase).first();
            final SubLObject output_item = (NIL != pph_data_structures.enhanced_pph_output_item_p(original_item)) ? original_item : pph_data_structures.new_enhanced_pph_output_item(original_item, demerits, justification);
            if (NIL != pph_data_structures.enhanced_pph_output_item_p(original_item)) {
                pph_data_structures.enhanced_pph_output_item_set_demerits(output_item, demerits);
                pph_data_structures.enhanced_pph_output_item_set_justification(output_item, justification);
            }
            pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, arg_position);
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, html_open_tag, html_close_tag);
            pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, agr_pred);
            new_list = list(output_item);
        } else {
            final SubLObject string = pph_phrase_string(phrase, NIL);
            final SubLObject cycl = pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject item_string = (NIL != pph_string.pph_string_p(string)) ? string : string_utilities.$empty_string$.getGlobalValue();
            final SubLObject consolidated_item = pph_data_structures.new_enhanced_pph_output_item(pph_data_structures.new_pph_phrase_output_item(item_string, arg_position, cycl, html_open_tag, html_close_tag, agr_pred), demerits, justification);
            new_list = list(consolidated_item);
        }
        pph_phrase_set_output_list(phrase, new_list, UNPROVIDED);
        return pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_consolidate_output_items(final SubLObject items, SubLObject string, SubLObject cycl, SubLObject arg_position, SubLObject html_open_tag, SubLObject html_close_tag, SubLObject agr_pred, SubLObject nospaceP) {
        if (string == UNPROVIDED) {
            string = $COMPUTE;
        }
        if (cycl == UNPROVIDED) {
            cycl = pph_unknown_cycl();
        }
        if (arg_position == UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        if (html_open_tag == UNPROVIDED) {
            html_open_tag = NIL;
        }
        if (html_close_tag == UNPROVIDED) {
            html_close_tag = NIL;
        }
        if (agr_pred == UNPROVIDED) {
            agr_pred = NIL;
        }
        if (nospaceP == UNPROVIDED) {
            nospaceP = NIL;
        }
        if (NIL != list_utilities.singletonP(items)) {
            final SubLObject output_item = items.first();
            pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, arg_position);
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, html_open_tag, html_close_tag);
            pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, agr_pred);
            return output_item;
        }
        final SubLObject item_string = (NIL != pph_string.pph_string_p(string)) ? string : pph_utilities.clean_bunge_nreverse(Mapping.mapcar(PPH_PHRASE_OUTPUT_ITEM_STRING, reverse(items), new SubLObject[]{ nospaceP }), UNPROVIDED);
        return pph_data_structures.new_pph_phrase_output_item(item_string, arg_position, cycl, html_open_tag, html_close_tag, agr_pred);
    }

    public static SubLObject new_pph_phrase_output_list(final SubLObject string, SubLObject open_tag, SubLObject close_tag, SubLObject agr_pred) {
        if (open_tag == UNPROVIDED) {
            open_tag = NIL;
        }
        if (close_tag == UNPROVIDED) {
            close_tag = NIL;
        }
        if (agr_pred == UNPROVIDED) {
            agr_pred = NIL;
        }
        return list(pph_data_structures.new_pph_phrase_output_item(string, pph_utilities.pph_unknown_arg_position(), pph_unknown_cycl(), open_tag, close_tag, agr_pred));
    }

    public static SubLObject pph_phrase_agr(final SubLObject phrase) {
        final SubLObject phrase_agr = pph_data_structures.pph_phrase_info_agr(document.sign_info(phrase));
        if (NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject badP = NIL;
            SubLObject first_agr = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL == pph_data_structures.pph_phrase_agr_p(first_agr)) {
                        first_agr = pph_phrase_agr(dtr);
                    } else
                        if (!first_agr.equalp(pph_phrase_agr(dtr))) {
                            badP = T;
                        }

                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return NIL != badP ? NIL : first_agr;
        }
        if (NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            return phrase_agr;
        }
        if (NIL == pph_phrase_has_head_dtrP(phrase)) {
            return NIL;
        }
        final SubLObject head_agr = pph_phrase_agr(pph_phrase_head_dtr(phrase));
        if (NIL != pph_data_structures.pph_phrase_agr_p(head_agr)) {
            final SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(head_agr);
            final SubLObject phrase_agr_$19 = pph_data_structures.new_pph_phrase_agr(abcon, UNPROVIDED);
            pph_phrase_set_agr(phrase, phrase_agr_$19, NIL);
            return phrase_agr_$19;
        }
        return NIL;
    }

    public static SubLObject pph_phrase_absolute_agr_preds(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase_has_agr_constraint_type_p(phrase, $POS_PRED)) {
            return list(pph_phrase_agr_target_of_type(phrase, $POS_PRED));
        }
        if (NIL != pph_phrase_has_agr_constraint_type_p(phrase, $NL_PREDS)) {
            return pph_phrase_agr_target_of_type(phrase, $NL_PREDS);
        }
        if (NIL != pph_phrase_has_agr_constraint_type_p(phrase, $DONT_CARE)) {
            return $ANY;
        }
        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str282$Bad_agr_value__S__, pph_phrase_agr(phrase));
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return $ANY;
    }

    public static SubLObject pph_phrase_set_agr(final SubLObject phrase, final SubLObject agr, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(agr);
        if (((NIL != pph_utilities.pph_peer_agr_constraint_p(relative_constraint)) && (NIL != new_pph_phrase_p(pph_utilities.pph_agr_constraint_target(relative_constraint)))) && (NIL == new_pph_phrase_p(phrase))) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str283$New_target__S___for_non_new_phras) });
            pph_error.pph_handle_error(new_format_string, list(pph_utilities.pph_agr_constraint_target(relative_constraint), phrase));
        }
        if ((NIL != pph_meta_phrase_p(phrase)) && (NIL != descend_into_metaP)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_phrase_set_agr(dtr, agr, UNPROVIDED);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        } else {
            if ((((NIL != pph_phrase_agr(phrase)) && (NIL == pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase_agr(phrase)))) && (NIL != pph_data_structures.dont_care_pph_phrase_agr_p(agr))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format_nil.force_format(T, $str284$Don_t_careifying__S, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_data_structures._csetf_pph_phrase_info_agr(document.sign_info(phrase), agr);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_clear_relative_agr(final SubLObject phrase, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        final SubLObject existing = pph_phrase_agr(phrase);
        final SubLObject v_new = pph_data_structures.pph_phrase_agr_copy(existing, UNPROVIDED);
        pph_data_structures.pph_phrase_agr_set_relative_constraint(v_new, NIL);
        pph_phrase_set_agr(phrase, v_new, descend_into_metaP);
        return pph_phrase_agr(phrase);
    }

    public static SubLObject pph_phrase_set_agr_constraint(final SubLObject phrase, final SubLObject agr_constraint, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        if (((NIL == pph_utilities.pph_dont_care_agr_constraint_p(agr_constraint)) && (NIL == pph_utilities.pph_impossible_agr_constraint_p(agr_constraint))) && (NIL == pph_utilities.pph_agr_constraint_target(agr_constraint))) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str285$Bad_agr_constraint___S) });
            pph_error.pph_handle_error(new_format_string, list(agr_constraint));
        }
        if (NIL != list_utilities.singletonP(pph_utilities.pph_agr_constraint_target(agr_constraint))) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str286$Singleton_agr_constraint_target__) });
            pph_error.pph_handle_error(new_format_string, list(agr_constraint));
        }
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        if (NIL != pph_utilities.pph_absolute_agr_constraint_p(agr_constraint)) {
            if (NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
                pph_data_structures.pph_phrase_agr_set_absolute_constraint(phrase_agr, agr_constraint);
            } else {
                pph_phrase_set_agr(phrase, pph_data_structures.new_pph_phrase_agr(agr_constraint, UNPROVIDED), descend_into_metaP);
            }
        } else
            if (NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
                pph_data_structures.pph_phrase_agr_set_relative_constraint(phrase_agr, agr_constraint);
            } else
                if (NIL == pph_meta_phrase_p(phrase)) {
                    pph_phrase_set_agr(phrase, pph_data_structures.new_pph_phrase_agr(NIL, agr_constraint), UNPROVIDED);
                }


        if ((NIL != pph_meta_phrase_p(phrase)) && (NIL != descend_into_metaP)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_phrase_set_agr_constraint(dtr, agr_constraint, UNPROVIDED);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_set_agr_pred(final SubLObject phrase, final SubLObject pred, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        final SubLObject output_list = pph_phrase_output_list(phrase);
        if (NIL != list_utilities.singletonP(output_list)) {
            final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(output_list.first());
            pph_data_structures.pph_phrase_output_item_set_agr_pred(new_item, pred);
            pph_phrase_set_output_list(phrase, list(new_item), UNPROVIDED);
        }
        if ((NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) && (!$$Determiner.eql(pph_utilities.pph_pos_of_category(pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED)))) {
            final SubLObject descend_into_metaP_$20 = T;
            final SubLObject override_existingP = T;
            pph_phrase_update_category(phrase, lexicon_accessors.pos_of_pred(pred), descend_into_metaP_$20, override_existingP);
        }
        return pph_phrase_set_agr_preds(phrase, list(pred), descend_into_metaP);
    }

    public static SubLObject pph_phrase_set_agr_pred_unless_nil(final SubLObject phrase, final SubLObject agr_pred) {
        if (NIL != agr_pred) {
            pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_add_agr_pred(final SubLObject phrase, final SubLObject agr_pred) {
        return pph_phrase_add_agr_preds(phrase, list(agr_pred), UNPROVIDED);
    }

    public static SubLObject pph_phrase_add_agr_preds(final SubLObject phrase, final SubLObject agr_preds, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        if ((NIL != descend_into_metaP) && (NIL != pph_meta_phrase_p(phrase))) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_phrase_add_agr_preds(dtr, agr_preds, T);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        } else {
            pph_add_agr_preds_to_phrase_agr(agr_preds, pph_phrase_agr(phrase));
        }
        return phrase;
    }

    public static SubLObject pph_add_agr_preds_to_phrase_agr(final SubLObject agr_preds, final SubLObject phrase_agr) {
        final SubLObject absolute_constraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        final SubLObject new_constraint = pph_add_agr_preds_to_agr_constraint(agr_preds, absolute_constraint);
        pph_data_structures.pph_phrase_agr_set_absolute_constraint(phrase_agr, new_constraint);
        return phrase_agr;
    }

    public static SubLObject pph_add_agr_preds_to_agr_constraint(final SubLObject agr_preds, final SubLObject absolute_constraint) {
        if (NIL != pph_utilities.pph_dont_care_agr_constraint_p(absolute_constraint)) {
            return pph_phrase_agr_constraint_for_preds(agr_preds);
        }
        if ($ANY == agr_preds) {
            return absolute_constraint;
        }
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = pph_utilities.pph_agr_constraint_type(absolute_constraint);
        if (pcase_var.eql($DONT_CARE)) {
            return absolute_constraint;
        }
        if (pcase_var.eql($NL_PREDS)) {
            return pph_add_agr_preds_to_nl_preds(absolute_constraint, agr_preds);
        }
        if (pcase_var.eql($POS_PRED)) {
            return pph_add_agr_preds_to_pos_pred(absolute_constraint, agr_preds);
        }
        if (pcase_var.eql($SUBJECT_VERB)) {
            return pph_add_agr_preds_to_subject_verb(absolute_constraint, agr_preds);
        }
        if (pcase_var.eql($DET_NBAR)) {
            return pph_add_agr_preds_to_det_nbar(absolute_constraint, agr_preds);
        }
        return NIL;
    }

    public static SubLObject pph_add_agr_preds_to_subject_verb(final SubLObject agr_constraint, final SubLObject agr_preds) {
        return pph_add_agr_preds_to_relative_agr_constraint(agr_constraint, agr_preds);
    }

    public static SubLObject pph_add_agr_preds_to_det_nbar(final SubLObject agr_constraint, final SubLObject agr_preds) {
        return pph_add_agr_preds_to_relative_agr_constraint(agr_constraint, agr_preds);
    }

    public static SubLObject pph_add_agr_preds_to_relative_agr_constraint(final SubLObject agr_constraint, final SubLObject agr_preds) {
        final SubLObject target = pph_utilities.pph_agr_constraint_target(agr_constraint);
        if (NIL != pph_utilities.pph_nth_phrase_p(target)) {
            return pph_utilities.new_pph_agr_constraint(pph_utilities.pph_agr_constraint_type(agr_constraint), pph_utilities.pph_add_constraints_to_nth_phrase(target, agr_preds));
        }
        final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str289$__Can_t_add_new_constraints__S_to) });
        pph_error.pph_handle_error(new_format_string, list(agr_preds, agr_constraint));
        return agr_constraint;
    }

    public static SubLObject pph_add_agr_preds_to_nl_preds(final SubLObject agr_constraint, final SubLObject agr_preds) {
        return pph_utilities.new_pph_agr_constraint(pph_utilities.pph_agr_constraint_type(agr_constraint), append(pph_utilities.pph_agr_constraint_target(agr_constraint), agr_preds));
    }

    public static SubLObject pph_add_agr_preds_to_pos_pred(final SubLObject agr_constraint, final SubLObject agr_preds) {
        final SubLObject total_agr = pph_utilities.pph_filter_preds(list(pph_utilities.pph_agr_constraint_target(agr_constraint)), agr_preds, UNPROVIDED);
        if (NIL != list_utilities.singletonP(total_agr)) {
            return pph_utilities.new_pph_agr_constraint($POS_PRED, total_agr.first());
        }
        return pph_utilities.new_pph_agr_constraint($NL_PREDS, total_agr);
    }

    public static SubLObject pph_phrase_set_absolute_agr_preds(final SubLObject phrase, final SubLObject preds) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        final SubLObject absolute_contstraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        if (NIL != pph_utilities.pph_nth_phrase_p(pph_utilities.pph_agr_constraint_target(absolute_contstraint))) {
            pph_utilities.set_pph_nth_phrase_constraints(pph_utilities.pph_agr_constraint_target(absolute_contstraint), preds);
        } else {
            pph_phrase_set_agr_preds(phrase, preds, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_update_agr_preds(final SubLObject phrase, final SubLObject preds, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        if (preds.isList()) {
            if (NIL != pph_conditional_phrase_p(phrase)) {
                SubLObject cdolist_list_var = pph_conditional_phrase_values(phrase);
                SubLObject option = NIL;
                option = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    pph_phrase_update_agr_preds(option, preds, descend_into_metaP);
                    cdolist_list_var = cdolist_list_var.rest();
                    option = cdolist_list_var.first();
                } 
            } else {
                final SubLObject existing = pph_phrase_agr_preds(phrase, UNPROVIDED);
                final SubLObject v_new = pph_utilities.pph_filter_ordered_preds(preds, existing, UNPROVIDED);
                pph_phrase_set_agr_preds(phrase, v_new, descend_into_metaP);
                if ((!existing.equal(v_new)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                    format_nil.force_format(T, $str290$__Updated_agr_preds_from__S_to__S, existing, pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_set_agr_preds(final SubLObject phrase, final SubLObject preds, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        pph_phrase_set_agr_constraint(phrase, pph_phrase_agr_constraint_for_preds(preds), descend_into_metaP);
        final SubLObject olist = pph_phrase_output_list(phrase);
        if ((NIL != list_utilities.singletonP(olist)) && (NIL != list_utilities.singletonP(preds))) {
            pph_data_structures.pph_phrase_output_item_set_agr_pred(olist.first(), preds.first());
        }
        return olist;
    }

    public static SubLObject pph_phrase_set_relative_agr_target(final SubLObject phrase, final SubLObject target) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
        final SubLObject constraint_type = pph_utilities.pph_agr_constraint_type(relative_constraint);
        if (NIL != pph_utilities.pph_agr_constraint_p(relative_constraint)) {
            pph_phrase_set_agr_constraint(phrase, pph_utilities.new_pph_agr_constraint(constraint_type, target), UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_agr_constraint_for_preds(final SubLObject preds) {
        if (preds == $ANY) {
            return pph_utilities.new_pph_dont_care_agr_constraint();
        }
        if (!preds.isList()) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str291$_S_should_be_a_list_of_speech_par) });
            pph_error.pph_handle_error(new_format_string, list(preds));
            return NIL;
        }
        if (NIL != list_utilities.singletonP(preds)) {
            return pph_utilities.new_pph_agr_constraint($POS_PRED, preds.first());
        }
        if (NIL == preds) {
            return pph_utilities.new_pph_impossible_agr_constraint();
        }
        if (preds.isList()) {
            return pph_utilities.new_pph_agr_constraint($NL_PREDS, preds);
        }
        return pph_utilities.new_pph_dont_care_agr_constraint();
    }

    public static SubLObject pph_phrase_check_impossible(final SubLObject phrase, SubLObject check_dtrsP) {
        if (check_dtrsP == UNPROVIDED) {
            check_dtrsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != pph_phrase_impossible_p(phrase, check_dtrsP)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str292$Impossible_phrase_____S__, phrase);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return phrase;
    }

    public static SubLObject pph_phrase_impossible_p(final SubLObject phrase, SubLObject check_dtrsP) {
        if (check_dtrsP == UNPROVIDED) {
            check_dtrsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase_doneP(phrase)) {
            return NIL;
        }
        if (NIL != pph_phrase_special_type(phrase)) {
            return NIL;
        }
        if (NIL != pph_utilities.pph_impossible_agr_constraint_p(pph_phrase_agr_constraint_of_type(phrase, $IMPOSSIBLE))) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str294$Impossible_because_of_agr_constra, phrase);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return T;
        }
        if (NIL != pph_phrase_has_known_cyclP(phrase)) {
            return NIL;
        }
        if (NIL != pph_phrase_wu(phrase, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            if (NIL != check_dtrsP) {
                if (NIL == pph_variable_binding_phrase_p(phrase)) {
                    if (NIL == pph_repeated_phrase_p(phrase)) {
                        if (NIL != pph_conditional_phrase_p(phrase)) {
                            SubLObject possible_option = NIL;
                            SubLObject dtr_num = ZERO_INTEGER;
                            if (document.sign_constituents(phrase).isVector()) {
                                final SubLObject vector_var = document.sign_constituents(phrase);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject dtr;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    dtr = aref(vector_var, element_num);
                                    if ((NIL == possible_option) && (NIL == pph_phrase_impossible_p(dtr, check_dtrsP))) {
                                        possible_option = dtr;
                                    }
                                    dtr_num = add(dtr_num, ONE_INTEGER);
                                }
                            }
                            return makeBoolean(NIL == possible_option);
                        }
                        SubLObject dtr_num2 = ZERO_INTEGER;
                        if (document.sign_constituents(phrase).isVector()) {
                            final SubLObject vector_var2 = document.sign_constituents(phrase);
                            final SubLObject backwardP_var2 = NIL;
                            SubLObject length2;
                            SubLObject v_iteration2;
                            SubLObject element_num2;
                            SubLObject dtr2;
                            for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                element_num2 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                dtr2 = aref(vector_var2, element_num2);
                                if (NIL != pph_phrase_impossible_p(dtr2, UNPROVIDED)) {
                                    return T;
                                }
                                dtr_num2 = add(dtr_num2, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_phrase_get_absolute_agr_from_phrase(final SubLObject phrase) {
        final SubLObject new_preds = pph_phrase_agr_preds(phrase, UNPROVIDED);
        return pph_phrase_agr_constraint_for_preds(new_preds);
    }

    public static SubLObject pph_phrase_set_absolute_agr_from_phrase(final SubLObject phrase) {
        final SubLObject new_absolute_agr = pph_phrase_get_absolute_agr_from_phrase(phrase);
        final SubLObject descend_into_metaP = NIL;
        pph_phrase_set_agr_constraint(phrase, new_absolute_agr, descend_into_metaP);
        return pph_phrase_absolute_agr_preds(phrase);
    }

    public static SubLObject pph_phrase_has_agr_constraint_type_p(final SubLObject phrase, final SubLObject constraint_type) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        if (NIL == pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            return NIL;
        }
        if (NIL != pph_utilities.pph_absolute_agr_constraint_typeP(constraint_type)) {
            return eq(constraint_type, pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr)));
        }
        return eq(constraint_type, pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr)));
    }

    public static SubLObject pph_phrase_agr_constraint_of_type(final SubLObject phrase, final SubLObject constraint_type) {
        final SubLObject phrase_agr = pph_data_structures.pph_phrase_info_agr(document.sign_info(phrase));
        if (NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject badP = NIL;
            SubLObject first_agr_constraint = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL == pph_data_structures.pph_phrase_agr_p(first_agr_constraint)) {
                        first_agr_constraint = pph_phrase_agr_constraint_of_type(dtr, constraint_type);
                    } else
                        if (!first_agr_constraint.equal(pph_phrase_agr_constraint_of_type(dtr, constraint_type))) {
                            badP = T;
                        }

                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return NIL != badP ? NIL : first_agr_constraint;
        }
        if (NIL != pph_data_structures.pph_phrase_agr_p(phrase_agr)) {
            final SubLObject candidate = (NIL != pph_utilities.pph_absolute_agr_constraint_typeP(constraint_type)) ? pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr) : pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
            return (NIL != pph_utilities.pph_agr_constraint_p(candidate)) && pph_utilities.pph_agr_constraint_type(candidate).eql(constraint_type) ? candidate : NIL;
        }
        if ((NIL != pph_utilities.pph_inheritable_agr_constraint_typeP(constraint_type)) && (NIL != pph_phrase_has_head_dtrP(phrase))) {
            final SubLObject head_constraint = pph_phrase_agr_constraint_of_type(pph_phrase_head_dtr(phrase), constraint_type);
            return head_constraint;
        }
        return NIL;
    }

    public static SubLObject pph_phrase_agr_target_of_type(final SubLObject phrase, final SubLObject constraint_type) {
        if (NIL != pph_conditional_phrase_p(phrase)) {
            SubLObject badP = NIL;
            SubLObject first_target = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL == first_target) {
                        first_target = pph_phrase_agr_target_of_type(dtr, constraint_type);
                    } else
                        if (!first_target.equal(pph_phrase_agr_target_of_type(dtr, constraint_type))) {
                            badP = T;
                        }

                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return NIL != badP ? NIL : first_target;
        }
        final SubLObject agr = pph_phrase_agr_constraint_of_type(phrase, constraint_type);
        return NIL != pph_utilities.pph_agr_constraint_p(agr) ? pph_utilities.pph_agr_constraint_target(agr) : NIL;
    }

    public static SubLObject pph_phrase_agr_pred(final SubLObject phrase) {
        final SubLObject pos_pred_constraint = pph_phrase_agr_constraint_of_type(phrase, $POS_PRED);
        SubLObject agr_pred = (NIL != pph_utilities.pph_agr_constraint_p(pos_pred_constraint)) ? pph_utilities.pph_agr_constraint_target(pos_pred_constraint) : NIL;
        if ((NIL == agr_pred) && (NIL != pph_phrase_has_head_dtrP(phrase))) {
            agr_pred = pph_phrase_agr_pred(pph_phrase_head_dtr(phrase));
        }
        return agr_pred;
    }

    public static SubLObject pph_phrase_category_unknown_p(final SubLObject phrase) {
        final SubLObject phrase_category = pph_phrase_category(phrase, UNPROVIDED);
        return makeBoolean((NIL == phrase_category) || ($ANY == phrase_category));
    }

    public static SubLObject pph_phrase_agr_preds(final SubLObject phrase, SubLObject allow_coercionP) {
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = pph_vars.$pph_allow_word_form_coercionP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_conditional_phrase_p(phrase)) {
            return pph_conditional_phrase_agr_preds(phrase);
        }
        final SubLObject preds_from_agr = pph_phrase_agr_preds_from_agr(phrase);
        final SubLObject phrase_category = pph_phrase_category(phrase, UNPROVIDED);
        final SubLObject category_can_be_coercedP = makeBoolean((NIL != allow_coercionP) && ((NIL != pph_phrase_category_unknown_p(phrase)) || (ZERO_INTEGER.eql(lexicon_utilities.bar_level(phrase_category, pph_vars.$pph_language_mt$.getDynamicValue(thread))) && (NIL == lexicon_accessors.closed_lexical_classP(phrase_category, UNPROVIDED)))));
        final SubLObject preds_from_category = (NIL != category_can_be_coercedP) ? $ANY : pph_phrase_agr_preds_from_category(phrase);
        final SubLObject preds_from_head = pph_phrase_agr_preds_from_head(phrase);
        final SubLObject initial_filtered = pph_utilities.pph_filter_preds(preds_from_agr, preds_from_head, UNPROVIDED);
        final SubLObject filtered = pph_utilities.pph_filter_preds(initial_filtered, preds_from_category, UNPROVIDED);
        if ((initial_filtered.isList() && (!filtered.equal(initial_filtered))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str295$Removed__S_from__S___based_on_cat, set_difference(initial_filtered, filtered, UNPROVIDED, UNPROVIDED), initial_filtered, pph_phrase_category(phrase, UNPROVIDED), filtered, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (((NIL == filtered) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str296$Can_t_reconcile__S_and__S_and__S_, new SubLObject[]{ preds_from_agr, preds_from_head, preds_from_category, phrase });
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return filtered;
    }

    public static SubLObject pph_phrase_agr_preds_from_agr(final SubLObject phrase) {
        final SubLObject phrase_agr = pph_phrase_agr(phrase);
        final SubLObject absolute_constraint = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
        SubLObject absolute_preds = $ANY;
        SubLObject relative_preds = $ANY;
        if (NIL != pph_utilities.pph_agr_constraint_p(absolute_constraint)) {
            final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(absolute_constraint);
            if (pcase_var.eql($POS_PRED)) {
                absolute_preds = pph_utilities.pph_agr_constraint_target(absolute_constraint);
                if ((NIL != absolute_preds) && (!absolute_preds.isList())) {
                    absolute_preds = list(absolute_preds);
                }
            } else
                if (pcase_var.eql($NL_PREDS)) {
                    absolute_preds = pph_utilities.pph_agr_constraint_target(absolute_constraint);
                }

        }
        if ((NIL != pph_utilities.pph_agr_constraint_p(relative_constraint)) && ($PEER == pph_utilities.pph_agr_constraint_type(relative_constraint))) {
            final SubLObject target = pph_utilities.pph_agr_constraint_target(relative_constraint);
            if (NIL != pph_phrase_p(target, UNPROVIDED)) {
                relative_preds = pph_utilities.pph_peer_agr_preds_for_preds(pph_phrase_agr_preds(target, UNPROVIDED), UNPROVIDED);
            }
        }
        return pph_utilities.pph_filter_preds(absolute_preds, relative_preds, UNPROVIDED);
    }

    public static SubLObject pph_phrase_compatible_with_predsP(final SubLObject phrase, final SubLObject nl_preds) {
        return list_utilities.sublisp_boolean(pph_utilities.pph_filter_preds(pph_phrase_agr_preds(phrase, UNPROVIDED), nl_preds, UNPROVIDED));
    }

    public static SubLObject pph_phrase_agr_preds_from_category(final SubLObject phrase) {
        SubLObject agr_preds = $ANY;
        final SubLObject category = pph_phrase_category(phrase, UNPROVIDED);
        final SubLObject phrase_string = pph_phrase_string(phrase, NIL);
        agr_preds = ((((NIL != pph_utilities.pph_npP(category)) && (NIL == cycl_grammar.el_variable_p(pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL == cycl_grammar.cycl_nat_p(pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL == pph_phrase_has_dtrsP(phrase))) ? $list298 : pph_agr_preds_from_category(category, phrase_string);
        return agr_preds;
    }

    public static SubLObject pph_agr_preds_from_category(final SubLObject category, final SubLObject phrase_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agr_preds = $ANY;
        if (NIL != category) {
            if (NIL != lexicon_accessors.genl_posP(pph_utilities.pph_pos_of_category(category, UNPROVIDED), $$Determiner, UNPROVIDED)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                    final SubLObject _prev_bind_0_$21 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject det_agr_preds = agr_preds = (phrase_string.isString()) ? lexicon_accessors.agr_of_det_string(phrase_string) : $list299;
                        } finally {
                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$21, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                agr_preds = pph_agr_preds_from_category_cached(category, UNPROVIDED);
            }
        }
        return agr_preds;
    }

    public static SubLObject clear_pph_agr_preds_from_category_cached() {
        final SubLObject cs = $pph_agr_preds_from_category_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pph_agr_preds_from_category_cached(final SubLObject category, SubLObject language_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_agr_preds_from_category_cached_caching_state$.getGlobalValue(), list(category, language_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_agr_preds_from_category_cached_internal(final SubLObject category, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agr_preds = $ANY;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            if (NIL != lexicon_accessors.speech_partP(category, UNPROVIDED)) {
                final SubLObject best_preds = lexicon_accessors.max_preds_of_pos(category);
                final SubLObject other_preds = list_utilities.fast_set_difference(lexicon_accessors.max_preds_of_pos(category), best_preds, UNPROVIDED);
                final SubLObject max_preds = append(best_preds, other_preds);
                if (NIL != max_preds) {
                    agr_preds = max_preds;
                }
            } else
                if ($$PossessivePhrase.eql(category) || (NIL != pph_utilities.pph_npP(category))) {
                    agr_preds = cons($$pronounStrings, lexicon_accessors.max_preds_of_pos($$Noun));
                } else
                    if (NIL != indexed_term_p(category)) {
                        final SubLObject pos = pph_utilities.pph_pos_of_category(category, UNPROVIDED);
                        if (NIL != pos) {
                            agr_preds = lexicon_accessors.max_preds_of_pos(pos);
                        }
                    }


        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return agr_preds;
    }

    public static SubLObject pph_agr_preds_from_category_cached(final SubLObject category, SubLObject language_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pph_agr_preds_from_category_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_AGR_PREDS_FROM_CATEGORY_CACHED, $pph_agr_preds_from_category_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_PPH_AGR_PREDS_FROM_CATEGORY_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(category, language_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (category.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && language_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_agr_preds_from_category_cached_internal(category, language_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(category, language_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_phrase_agr_preds_from_head(final SubLObject phrase) {
        SubLObject agr_preds = $ANY;
        if (NIL != pph_phrase_has_head_dtrP(phrase)) {
            agr_preds = pph_phrase_agr_preds(pph_phrase_head_dtr(phrase), UNPROVIDED);
        }
        return agr_preds;
    }

    public static SubLObject pph_conditional_phrase_agr_preds(final SubLObject phrase) {
        SubLObject agr_preds = NIL;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                agr_preds = pph_utilities.pph_union_preds(agr_preds, pph_phrase_agr_preds(dtr, UNPROVIDED));
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return agr_preds;
    }

    public static SubLObject pph_phrase_compatible_agr_preds(final SubLObject phrase) {
        return pph_phrase_agr_preds(phrase, UNPROVIDED);
    }

    public static SubLObject pph_phrase_wu(final SubLObject phrase, SubLObject descend_into_metaP) {
        if (descend_into_metaP == UNPROVIDED) {
            descend_into_metaP = T;
        }
        if ((NIL != descend_into_metaP) && (NIL != pph_meta_phrase_p(phrase))) {
            return pph_phrase_wu(pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED);
        }
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $WU, FOUR_INTEGER, UNPROVIDED);
    }

    public static SubLObject pph_phrase_set_wu(final SubLObject phrase, final SubLObject wu) {
        return pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $WU, FOUR_INTEGER, wu);
    }

    public static SubLObject pph_phrase_has_wu_onlyP(final SubLObject phrase) {
        return makeBoolean(((NIL != pph_phrase_wu(phrase, UNPROVIDED)) && (NIL == pph_phrase_string(phrase, UNPROVIDED))) && (NIL == pph_phrase_cycl(phrase, UNPROVIDED)));
    }

    public static SubLObject pph_phrase_arg_position_map(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_arg_position_map(document.sign_info(phrase));
    }

    public static SubLObject pph_phrase_arg_position_from_map(final SubLObject phrase) {
        return pph_utilities.pph_top_level_arg_position(pph_phrase_arg_position_map(phrase));
    }

    public static SubLObject pph_phrase_set_arg_position_map(final SubLObject phrase, final SubLObject arg_position_map) {
        pph_data_structures._csetf_pph_phrase_info_arg_position_map(document.sign_info(phrase), arg_position_map);
        return phrase;
    }

    public static SubLObject pph_phrase_register_local_arg_positions(final SubLObject phrase, final SubLObject old_map) {
        final SubLObject cycl = pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(old_map, cycl);
        pph_phrase_set_arg_position_map(phrase, new_map);
        return new_map;
    }

    public static SubLObject pph_phrase_dtrs(final SubLObject phrase) {
        return document.sign_constituents(phrase);
    }

    public static SubLObject pph_phrase_dtr_count(final SubLObject phrase) {
        return document.sign_length(phrase);
    }

    public static SubLObject pph_phrase_unfinished_dtr_count(final SubLObject phrase) {
        SubLObject count = ZERO_INTEGER;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (NIL == pph_phrase_doneP(dtr)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str304$__Phrase__D_is_unfinished_, pph_phrase_suid(dtr), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    count = add(count, ONE_INTEGER);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject pph_phrase_has_dtrsP(final SubLObject phrase) {
        return makeBoolean(pph_phrase_dtrs(phrase).isVector() && pph_phrase_dtr_count(phrase).isPositive());
    }

    public static SubLObject pph_phrase_set_dtrs(final SubLObject phrase, final SubLObject dtrs) {
        if (NIL == pph_phrase_p(phrase, NIL)) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str305$Can_t_set_dtrs_of_non_phrase__S) });
            pph_error.pph_handle_error(new_format_string, list(phrase));
        }
        if (NIL != dtrs) {
        }
        document._csetf_sign_constituents(phrase, dtrs);
        final SubLObject verifyP = NIL;
        final SubLObject mother_new = makeBoolean((NIL != verifyP) && (NIL != new_pph_phrase_p(phrase)));
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject new_format_string2;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if ((NIL != mother_new) && (NIL == new_pph_phrase_p(dtr))) {
                    new_format_string2 = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str306$Adding_old_dtr_to_new_mother____M) });
                    pph_error.pph_handle_error(new_format_string2, list(phrase, dtr));
                }
                pph_phrase_set_mother(dtr, phrase);
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_set_only_dtr(final SubLObject phrase, final SubLObject dtr) {
        pph_phrase_set_dtrs(phrase, make_vector(ONE_INTEGER, dtr));
        pph_phrase_set_mother(dtr, phrase);
        return phrase;
    }

    public static SubLObject pph_phrase_add_dtr_to_terminal(final SubLObject phrase, final SubLObject dtr) {
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str307$_S_is_not_terminal) });
            pph_error.pph_handle_error(new_format_string, list(phrase));
        }
        pph_phrase_set_mother(dtr, phrase);
        pph_phrase_set_only_dtr(phrase, dtr);
        return phrase;
    }

    public static SubLObject pph_phrase_last_dtr(final SubLObject phrase) {
        if (NIL == pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        return pph_phrase_nth_dtr(phrase, subtract(pph_phrase_dtr_count(phrase), ONE_INTEGER));
    }

    public static SubLObject pph_phrase_has_multiple_verbsP(final SubLObject phrase) {
        return numGE(pph_phrase_verb_count(phrase, TWO_INTEGER), TWO_INTEGER);
    }

    public static SubLObject pph_phrase_verb_count(final SubLObject phrase, SubLObject stop_at) {
        if (stop_at == UNPROVIDED) {
            stop_at = NIL;
        }
        return pph_phrase_count_if(phrase, $sym308$PPH_PHRASE_VERB_, stop_at);
    }

    public static SubLObject pph_phrase_count_if(final SubLObject phrase, final SubLObject test, SubLObject stop_at) {
        if (stop_at == UNPROVIDED) {
            stop_at = NIL;
        }
        if (((NIL != stop_at) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(stop_at))) {
            throw new AssertionError(stop_at);
        }
        return pph_phrase_count_if_internal(phrase, test, stop_at);
    }

    public static SubLObject pph_phrase_count_if_internal(final SubLObject phrase, final SubLObject test, final SubLObject stop_at) {
        SubLObject count = (NIL != funcall(test, phrase)) ? ONE_INTEGER : ZERO_INTEGER;
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject new_minimum = (NIL != stop_at) ? subtract(stop_at, count) : NIL;
            if ((NIL != new_minimum) && new_minimum.numLE(ZERO_INTEGER)) {
                return count;
            }
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject dtr_count;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    dtr_count = pph_phrase_count_if_internal(dtr, test, new_minimum);
                    count = add(count, dtr_count);
                    if (NIL != new_minimum) {
                        new_minimum = subtract(new_minimum, dtr_count);
                        if (new_minimum.numLE(ZERO_INTEGER)) {
                            return count;
                        }
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return count;
    }

    public static SubLObject pph_phrase_find_nested_dtr_path(final SubLObject phrase, final SubLObject subphrase, SubLObject path_to_phrase) {
        if (path_to_phrase == UNPROVIDED) {
            path_to_phrase = NIL;
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject result;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (dtr.eql(subphrase)) {
                    return list_utilities.add_to_end(dtr_num, path_to_phrase);
                }
                if (NIL != pph_phrase_has_dtrsP(dtr)) {
                    result = pph_phrase_find_nested_dtr_path(dtr, subphrase, list_utilities.add_to_end(dtr_num, path_to_phrase));
                    if (NIL != result) {
                        return result;
                    }
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return NIL;
    }

    public static SubLObject pph_phrase_head_dtr_num(final SubLObject phrase) {
        if (NIL != list_utilities.lengthE(pph_phrase_dtrs(phrase), ONE_INTEGER, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $HEAD_DTR_NUM, FIVE_INTEGER, UNPROVIDED);
    }

    public static SubLObject pph_phrase_has_head_dtrP(final SubLObject phrase) {
        return pph_phrase_p(pph_phrase_head_dtr(phrase), UNPROVIDED);
    }

    public static SubLObject pph_phrase_head_dtr_numP(final SubLObject phrase, final SubLObject dtr_num) {
        return eql(pph_phrase_head_dtr_num(phrase), dtr_num);
    }

    public static SubLObject pph_phrase_set_head_dtr_num(final SubLObject phrase, final SubLObject head_dtr_num) {
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $HEAD_DTR_NUM, FIVE_INTEGER, head_dtr_num);
        return phrase;
    }

    public static SubLObject pph_phrase_nth_dtr(final SubLObject phrase, final SubLObject n) {
        if (document.sign_constituents(phrase).isVector() && (NIL != list_utilities.lengthG(document.sign_constituents(phrase), n, UNPROVIDED))) {
            return document.sign_get(phrase, n);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_head_dtr(final SubLObject phrase) {
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (head_dtr_num.isInteger()) {
            return pph_phrase_nth_dtr(phrase, head_dtr_num);
        }
        if (ONE_INTEGER.eql(pph_phrase_dtr_count(phrase))) {
            return pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_head_dtr_genlP(final SubLObject phrase, final SubLObject pos) {
        final SubLObject head = pph_phrase_head_dtr(phrase);
        if (NIL != head) {
            return pph_utilities.pph_genlP(pos, pph_phrase_category(head, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject pph_phrase_head_dtr_genl_other_thanP(final SubLObject phrase, final SubLObject pos) {
        final SubLObject head = pph_phrase_head_dtr(phrase);
        if (NIL != head) {
            return makeBoolean(NIL == pph_utilities.pph_genlP(pos, pph_phrase_category(head, UNPROVIDED), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject pph_phrase_lexical_head_dtr(final SubLObject phrase) {
        if (NIL != pph_phrase_has_head_dtrP(phrase)) {
            return pph_phrase_lexical_head_dtr(pph_phrase_head_dtr(phrase));
        }
        return phrase;
    }

    public static SubLObject pph_phrase_head_dtrP(final SubLObject embedded, SubLObject matrix) {
        if (matrix == UNPROVIDED) {
            matrix = NIL;
        }
        if (NIL == matrix) {
            matrix = pph_phrase_logical_mother(embedded);
        }
        return makeBoolean((NIL != pph_phrase_p(matrix, UNPROVIDED)) && (NIL != pph_phrase_equal(embedded, pph_phrase_head_dtr(matrix))));
    }

    public static SubLObject pph_phrase_set_nth_dtr(final SubLObject phrase, final SubLObject n, final SubLObject nth_dtr) {
        pph_phrase_set_mother(nth_dtr, phrase);
        return document.sign_set(phrase, n, nth_dtr);
    }

    public static SubLObject pph_phrase_nth_dtrP(final SubLObject phrase, final SubLObject matrix, final SubLObject num) {
        return eq(phrase, pph_phrase_nth_dtr(matrix, num));
    }

    public static SubLObject pph_phrase_head_verbP(final SubLObject phrase) {
        if (NIL != pph_phrase_has_agr_constraint_type_p(phrase, $SUBJECT_VERB)) {
            return T;
        }
        if ((NIL != pph_conditional_phrase_p(phrase)) || (NIL != pph_coordination_phrase_p(phrase))) {
            SubLObject badP = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL == pph_phrase_head_verbP(dtr)) {
                        badP = T;
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return makeBoolean(NIL == badP);
        }
        return NIL;
    }

    public static SubLObject pph_det_nbarP(final SubLObject phrase) {
        return makeBoolean((NIL != pph_phrase_p(phrase, UNPROVIDED)) && ((NIL != pph_phrase_resolution.pph_phrase_starts_with_detpP(phrase)) || (NIL != pph_phrase_resolution.pph_phrase_starts_with_detP(phrase))));
    }

    public static SubLObject pph_justification_bundle(final SubLObject phrase) {
        return list(pph_phrase_string(phrase, UNPROVIDED), pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase_justification(phrase));
    }

    public static SubLObject pph_phrase_equal(final SubLObject phrase1, final SubLObject phrase2) {
        return equal(phrase1, phrase2);
    }

    public static SubLObject new_pph_phrase_with_dtr_list(final SubLObject dtr_list) {
        final SubLObject new_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_pph_phrase_dtrs_from_list(new_phrase, dtr_list, UNPROVIDED);
        return new_phrase;
    }

    public static SubLObject set_pph_phrase_dtrs_from_list(final SubLObject phrase, final SubLObject dtr_list, SubLObject head_dtr_num) {
        if (head_dtr_num == UNPROVIDED) {
            head_dtr_num = NIL;
        }
        final SubLObject dtr_count = length(dtr_list);
        final SubLObject dtrs_vector = make_vector(dtr_count, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject dtr = NIL;
        SubLObject dtr_num = NIL;
        list_var = dtr_list;
        dtr = list_var.first();
        for (dtr_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr = list_var.first() , dtr_num = add(ONE_INTEGER, dtr_num)) {
            set_aref(dtrs_vector, dtr_num, dtr);
        }
        pph_phrase_set_dtrs(phrase, dtrs_vector);
        if (head_dtr_num.isInteger()) {
            pph_phrase_set_head_dtr_num(phrase, head_dtr_num);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_remove_all_dtrs(final SubLObject phrase) {
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pph_phrase_set_mother(dtr, NIL);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            pph_phrase_set_dtrs(phrase, $ic310);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_push(final SubLObject dtr, final SubLObject phrase) {
        final SubLObject phrase_dtrs = (NIL != pph_phrase_has_dtrsP(phrase)) ? pph_phrase_dtr_list(phrase) : NIL;
        final SubLObject dtrs = cons(dtr, phrase_dtrs);
        set_pph_phrase_dtrs_from_list(phrase, dtrs, UNPROVIDED);
        pph_phrase_increment_head_dtr_num(phrase);
        pph_phrase_add_justifications_from_phrase(phrase, dtr);
        return phrase;
    }

    public static SubLObject pph_phrase_append(final SubLObject dtr, final SubLObject phrase) {
        final SubLObject phrase_dtrs = (NIL != pph_phrase_has_dtrsP(phrase)) ? pph_phrase_dtr_list(phrase) : NIL;
        final SubLObject dtrs = append(phrase_dtrs, list(dtr));
        set_pph_phrase_dtrs_from_list(phrase, dtrs, UNPROVIDED);
        pph_phrase_add_justifications_from_phrase(phrase, dtr);
        return phrase;
    }

    public static SubLObject pph_phrase_insert_dtr(final SubLObject phrase, final SubLObject new_dtr, final SubLObject num) {
        SubLObject new_dtrs = NIL;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (num.eql(dtr_num)) {
                    new_dtrs = cons(new_dtr, new_dtrs);
                }
                new_dtrs = cons(dtr, new_dtrs);
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        if (NIL != list_utilities.lengthE(new_dtrs, num, UNPROVIDED)) {
            new_dtrs = cons(new_dtr, new_dtrs);
        } else
            if (NIL != list_utilities.lengthL(new_dtrs, num, UNPROVIDED)) {
                final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str311$Can_t_insert_dtr_into_position__D) });
                pph_error.pph_handle_error(new_format_string, list(num, length(new_dtrs)));
            }

        return set_pph_phrase_dtrs_from_list(phrase, reverse(new_dtrs), UNPROVIDED);
    }

    public static SubLObject pph_phrase_front_head_dtr(final SubLObject phrase) {
        return pph_phrase_front_subphrase(list(pph_phrase_head_dtr_num(phrase)), pph_phrase_head_dtr(phrase), phrase);
    }

    public static SubLObject pph_phrase_front_subphrase(final SubLObject front_dtr_path, final SubLObject front_dtr, final SubLObject phrase) {
        SubLObject front_dtrs_mother = phrase;
        final SubLObject head_dtrP = pph_phrase_head_dtrP(front_dtr, phrase);
        SubLObject cdolist_list_var = butlast(front_dtr_path, UNPROVIDED);
        SubLObject dtr_num = NIL;
        dtr_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            front_dtrs_mother = pph_phrase_nth_dtr(front_dtrs_mother, dtr_num);
            cdolist_list_var = cdolist_list_var.rest();
            dtr_num = cdolist_list_var.first();
        } 
        final SubLObject sanity_check = pph_phrase_extract_dtr_num(list_utilities.last_one(front_dtr_path), front_dtrs_mother);
        if (!sanity_check.eql(front_dtr)) {
            final SubLObject new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str312$Extraction_disparity___Expected__) });
            pph_error.pph_handle_error(new_format_string, list(front_dtr, sanity_check));
        }
        pph_phrase_push(front_dtr, phrase);
        if (NIL != head_dtrP) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str313$Setting_head_dtr_to_initial_dtr__, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase_set_head_dtr_num(phrase, ZERO_INTEGER);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_remove_dtr(final SubLObject phrase, final SubLObject target_dtr) {
        final SubLObject all_dtrs = pph_phrase_dtr_list(phrase);
        final SubLObject other_dtrs = remove(target_dtr, all_dtrs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return set_pph_phrase_dtrs_from_list(phrase, other_dtrs, UNPROVIDED);
    }

    public static SubLObject pph_phrase_extract_dtr_num(final SubLObject target_dtr_num, final SubLObject phrase) {
        final SubLObject target_dtr = pph_phrase_nth_dtr(phrase, target_dtr_num);
        final SubLObject other_dtrs = remove(target_dtr, pph_phrase_dtr_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str314$Extracting_dtr__D___S, target_dtr_num, target_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        set_pph_phrase_dtrs_from_list(phrase, other_dtrs, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str315$__Setting_head_dtr_num_from__S, pph_phrase_head_dtr_num(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        update_pph_head_dtr_num_after_extraction(phrase, target_dtr_num);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str316$_to__S__, pph_phrase_head_dtr_num(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return target_dtr;
    }

    public static SubLObject update_pph_head_dtr_num_after_extraction(final SubLObject phrase, final SubLObject extracted_dtr_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase_head_dtr_num(phrase)) {
            if (extracted_dtr_num.eql(pph_phrase_head_dtr_num(phrase))) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str317$Phrase_has_lost_its_head_____S__, phrase);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                pph_phrase_set_head_dtr_num(phrase, NIL);
            } else
                if (pph_phrase_head_dtr_num(phrase).numG(extracted_dtr_num)) {
                    pph_phrase_decrement_head_dtr_num(phrase);
                }

        }
        return pph_phrase_head_dtr_num(phrase);
    }

    public static SubLObject pph_phrase_decrement_head_dtr_num(final SubLObject phrase) {
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (head_dtr_num.isInteger()) {
            pph_phrase_set_head_dtr_num(phrase, number_utilities.f_1_(head_dtr_num));
        }
        return phrase;
    }

    public static SubLObject pph_phrase_increment_head_dtr_num(final SubLObject phrase) {
        final SubLObject head_dtr_num = pph_phrase_head_dtr_num(phrase);
        if (head_dtr_num.isInteger()) {
            pph_phrase_set_head_dtr_num(phrase, number_utilities.f_1X(head_dtr_num));
        }
        return phrase;
    }

    public static SubLObject update_pph_nth_phrases(final SubLObject phrase, SubLObject front_dtr_num) {
        if (front_dtr_num == UNPROVIDED) {
            front_dtr_num = NIL;
        }
        final SubLObject dtr_count = pph_phrase_dtr_count(phrase);
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject agr_constraint;
            SubLObject agr_target;
            SubLObject old_num;
            SubLObject new_num;
            SubLObject new_format_string;
            SubLObject new_target;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                agr_constraint = pph_phrase_agr(dtr);
                agr_target = pph_utilities.pph_agr_constraint_target(agr_constraint);
                if (NIL != pph_utilities.pph_nth_phrase_p(agr_target)) {
                    old_num = pph_utilities.pph_nth_phrase_num(agr_target);
                    new_num = pph_new_agr_num_from_old(old_num, front_dtr_num);
                    if (!old_num.eql(new_num)) {
                        if (dtr_num.eql(new_num)) {
                            new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str318$Setting_agr_target_to_itself_) });
                            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                        } else
                            if (new_num.numGE(dtr_count)) {
                                new_format_string = cconcatenate($str48$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str49$__, format_nil.format_nil_a_no_copy($str319$Setting_agr_target_to_non_existen) });
                                pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                            } else {
                                new_target = similar_pph_nth_phrase_with_number(agr_target, new_num);
                                pph_phrase_set_relative_agr_target(dtr, new_target);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str320$__Setting_agr_target_num_of_dtr__, dtr_num, old_num, pph_utilities.pph_nth_phrase_num(agr_target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }

                    }
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }

    public static SubLObject pph_new_agr_num_from_old(final SubLObject old_num, final SubLObject front_dtr_num) {
        if (old_num.eql(front_dtr_num)) {
            return ZERO_INTEGER;
        }
        if (NIL == front_dtr_num) {
            return number_utilities.f_1X(old_num);
        }
        if (front_dtr_num.numG(old_num)) {
            return number_utilities.f_1X(old_num);
        }
        return old_num;
    }

    public static SubLObject similar_pph_nth_phrase_with_number(final SubLObject nth_phrase, final SubLObject number) {
        return pph_utilities.new_pph_nth_phrase(number, pph_utilities.pph_nth_phrase_constraints(nth_phrase));
    }

    public static SubLObject pph_phrase_has_weak_justificationP(final SubLObject phrase) {
        final SubLObject reln = cycl_utilities.formula_operator(pph_phrase_cycl(phrase, UNPROVIDED));
        final SubLObject justification = pph_phrase_justification(phrase);
        return (NIL != reln) && (NIL != assertion_handles.assertion_p(justification)) ? makeBoolean(!reln.equal(assertions_high.gaf_arg1(justification))) : NIL;
    }

    public static SubLObject gather_weak_justifications(final SubLObject phrase, SubLObject weak_justifications) {
        if (weak_justifications == UNPROVIDED) {
            weak_justifications = NIL;
        }
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    weak_justifications = append(gather_weak_justifications(dtr, UNPROVIDED), weak_justifications);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        if (NIL != pph_phrase_has_weak_justificationP(phrase)) {
            weak_justifications = cons(pph_justification_bundle(phrase), weak_justifications);
        }
        return weak_justifications;
    }

    public static SubLObject gather_all_justifications(final SubLObject phrase, SubLObject justifications) {
        if (justifications == UNPROVIDED) {
            justifications = NIL;
        }
        if (NIL != pph_phrase_has_dtrsP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    justifications = append(gather_all_justifications(dtr, UNPROVIDED), justifications);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        if (NIL != pph_phrase_justification(phrase)) {
            justifications = cons(pph_justification_bundle(phrase), justifications);
        }
        return justifications;
    }

    public static SubLObject declare_pph_phrase_file() {
        declareFunction(me, "new_pph_phrase_for_cycl", "NEW-PPH-PHRASE-FOR-CYCL", 1, 2, false);
        declareMacro(me, "pph_phrase_do_dtrs", "PPH-PHRASE-DO-DTRS");
        declareFunction(me, "verbose_print_pph_phrase", "VERBOSE-PRINT-PPH-PHRASE", 1, 1, false);
        declareFunction(me, "terse_print_pph_phrase", "TERSE-PRINT-PPH-PHRASE", 1, 1, false);
        declareFunction(me, "print_pph_phrase", "PRINT-PPH-PHRASE", 1, 2, false);
        declareFunction(me, "print_pph_phrase_int", "PRINT-PPH-PHRASE-INT", 5, 0, false);
        declareFunction(me, "pph_phrase_create_backup", "PPH-PHRASE-CREATE-BACKUP", 1, 0, false);
        declareFunction(me, "pph_phrase_revert_to_backup", "PPH-PHRASE-REVERT-TO-BACKUP", 2, 0, false);
        declareFunction(me, "pph_maybe_warn_about_reverting_phrase_internal", "PPH-MAYBE-WARN-ABOUT-REVERTING-PHRASE-INTERNAL", 3, 1, false);
        declareFunction(me, "pph_maybe_warn_about_reverting_phrase", "PPH-MAYBE-WARN-ABOUT-REVERTING-PHRASE", 3, 1, false);
        declareFunction(me, "pph_phrase_copy", "PPH-PHRASE-COPY", 1, 2, false);
        declareMacro(me, "with_pph_phrase_copy_recursion_protection", "WITH-PPH-PHRASE-COPY-RECURSION-PROTECTION");
        declareFunction(me, "find_or_create_pph_phrase_copy_stack", "FIND-OR-CREATE-PPH-PHRASE-COPY-STACK", 0, 0, false);
        declareFunction(me, "new_pph_phrase_p", "NEW-PPH-PHRASE-P", 1, 0, false);
        declareFunction(me, "pph_phrase_copy_int", "PPH-PHRASE-COPY-INT", 2, 3, false);
        declareFunction(me, "pph_phrase_copy_property_p", "PPH-PHRASE-COPY-PROPERTY-P", 2, 0, false);
        declareFunction(me, "pph_phrase_copy_dtr", "PPH-PHRASE-COPY-DTR", 4, 0, false);
        declareFunction(me, "pph_phrase_copy_plist_phrase", "PPH-PHRASE-COPY-PLIST-PHRASE", 3, 1, false);
        declareFunction(me, "pph_phrase_dtr_list", "PPH-PHRASE-DTR-LIST", 1, 0, false);
        declareFunction(me, "pph_phrase_nonlocal_feature_property_p", "PPH-PHRASE-NONLOCAL-FEATURE-PROPERTY-P", 1, 0, false);
        declareFunction(me, "pph_phrase_verbosity", "PPH-PHRASE-VERBOSITY", 1, 0, false);
        declareFunction(me, "pph_content_word_count", "PPH-CONTENT-WORD-COUNT", 1, 0, false);
        declareFunction(me, "pph_special_type_kwP", "PPH-SPECIAL-TYPE-KW?", 1, 0, false);
        declareFunction(me, "pph_phrase_special_type_p", "PPH-PHRASE-SPECIAL-TYPE-P", 1, 0, false);
        declareFunction(me, "pph_phrase_special_type", "PPH-PHRASE-SPECIAL-TYPE", 1, 0, false);
        declareFunction(me, "pph_phrase_set_special_type", "PPH-PHRASE-SET-SPECIAL-TYPE", 2, 0, false);
        declareFunction(me, "pph_phrase_clear_special_type", "PPH-PHRASE-CLEAR-SPECIAL-TYPE", 1, 0, false);
        declareFunction(me, "pph_phrase_focus_arg", "PPH-PHRASE-FOCUS-ARG", 1, 0, false);
        declareFunction(me, "pph_phrase_set_focus_arg", "PPH-PHRASE-SET-FOCUS-ARG", 2, 0, false);
        declareFunction(me, "pph_percent_phrase_p", "PPH-PERCENT-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_percent_phrase", "NEW-PPH-PERCENT-PHRASE", 1, 0, false);
        declareFunction(me, "pph_clarifying_phrase_p", "PPH-CLARIFYING-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_type_clarifying_phrase", "NEW-PPH-TYPE-CLARIFYING-PHRASE", 1, 1, false);
        declareFunction(me, "pph_symbol_phrase_p", "PPH-SYMBOL-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_symbol_phrase", "NEW-PPH-SYMBOL-PHRASE", 1, 0, false);
        declareFunction(me, "pph_symbol_phrase_symbol", "PPH-SYMBOL-PHRASE-SYMBOL", 1, 0, false);
        declareFunction(me, "pph_cycl_phrase_p", "PPH-CYCL-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_cycl_phrase", "NEW-PPH-CYCL-PHRASE", 1, 0, false);
        declareFunction(me, "pph_quoted_paraphrase_phrase_p", "PPH-QUOTED-PARAPHRASE-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_quoted_paraphrase_phrase", "NEW-PPH-QUOTED-PARAPHRASE-PHRASE", 1, 0, false);
        declareFunction(me, "quote_pph_phrase", "QUOTE-PPH-PHRASE", 1, 0, false);
        declareFunction(me, "pph_string_mention_phrase_p", "PPH-STRING-MENTION-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_string_mention_phrase", "NEW-PPH-STRING-MENTION-PHRASE", 1, 0, false);
        declareFunction(me, "pph_meta_phrase_p", "PPH-META-PHRASE-P", 1, 0, false);
        declareFunction(me, "pph_nospace_phrase_p", "PPH-NOSPACE-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_nospace_phrase", "NEW-PPH-NOSPACE-PHRASE", 1, 1, false);
        declareFunction(me, "convert_pph_phrase_to_nospace_phrase", "CONVERT-PPH-PHRASE-TO-NOSPACE-PHRASE", 1, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_p", "PPH-VARIABLE-BINDING-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_variable_binding_phrase", "NEW-PPH-VARIABLE-BINDING-PHRASE", 1, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_query_template", "PPH-VARIABLE-BINDING-PHRASE-QUERY-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_phrase_naut_subst", "PPH-VARIABLE-BINDING-PHRASE-PHRASE-NAUT-SUBST", 3, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_phrase_naut", "PPH-VARIABLE-BINDING-PHRASE-PHRASE-NAUT", 1, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_set_phrase_naut", "PPH-VARIABLE-BINDING-PHRASE-SET-PHRASE-NAUT", 2, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_set_query_template", "PPH-VARIABLE-BINDING-PHRASE-SET-QUERY-TEMPLATE", 2, 0, false);
        declareFunction(me, "pph_variable_binding_phrase_query_el_formula", "PPH-VARIABLE-BINDING-PHRASE-QUERY-EL-FORMULA", 2, 0, false);
        declareFunction(me, "pph_variable_bindings_and_supports_from_phrase", "PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-PHRASE", 2, 0, false);
        declareFunction(me, "pph_variable_bindings_and_supports_from_query_el_formula_internal", "PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-QUERY-EL-FORMULA-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_variable_bindings_and_supports_from_query_el_formula", "PPH-VARIABLE-BINDINGS-AND-SUPPORTS-FROM-QUERY-EL-FORMULA", 1, 1, false);
        declareFunction(me, "pph_variable_binding_phrase_substitute_cycl", "PPH-VARIABLE-BINDING-PHRASE-SUBSTITUTE-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_try_to_resolve_binding_phrases", "PPH-PHRASE-TRY-TO-RESOLVE-BINDING-PHRASES", 1, 1, false);
        declareFunction(me, "pph_variable_binding_phrase_try_to_resolve_bindings", "PPH-VARIABLE-BINDING-PHRASE-TRY-TO-RESOLVE-BINDINGS", 1, 1, false);
        declareFunction(me, "pph_terse_phrase_p", "PPH-TERSE-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_terse_phrase", "NEW-PPH-TERSE-PHRASE", 1, 0, false);
        declareFunction(me, "pph_precise_phrase_p", "PPH-PRECISE-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_precise_phrase", "NEW-PPH-PRECISE-PHRASE", 1, 1, false);
        declareFunction(me, "pph_chemical_formula_from_lists_phrase_p", "PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_chemical_formula_from_lists_phrase", "NEW-PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE", 1, 0, false);
        declareFunction(me, "pph_conditional_phrase_p", "PPH-CONDITIONAL-PHRASE-P", 1, 0, false);
        declareFunction(me, "pph_conditional_phrase_category_p", "PPH-CONDITIONAL-PHRASE-CATEGORY-P", 1, 0, false);
        declareFunction(me, "new_pph_conditional_phrase", "NEW-PPH-CONDITIONAL-PHRASE", 1, 1, false);
        declareFunction(me, "pph_conditional_phrase_test", "PPH-CONDITIONAL-PHRASE-TEST", 1, 0, false);
        declareFunction(me, "pph_conditional_phrase_set_test", "PPH-CONDITIONAL-PHRASE-SET-TEST", 2, 0, false);
        declareFunction(me, "pph_conditional_phrase_values", "PPH-CONDITIONAL-PHRASE-VALUES", 1, 0, false);
        declareFunction(me, "pph_coordination_phrase_p", "PPH-COORDINATION-PHRASE-P", 1, 0, false);
        declareFunction(me, "new_pph_coordination_phrase", "NEW-PPH-COORDINATION-PHRASE", 1, 0, false);
        declareFunction(me, "new_pph_coordination_phrase_low", "NEW-PPH-COORDINATION-PHRASE-LOW", 3, 0, false);
        declareFunction(me, "new_pph_numbered_list_phrase", "NEW-PPH-NUMBERED-LIST-PHRASE", 1, 0, false);
        declareFunction(me, "pph_opr_key_for_fn", "PPH-OPR-KEY-FOR-FN", 1, 0, false);
        declareFunction(me, "pph_opr_key_for_connective", "PPH-OPR-KEY-FOR-CONNECTIVE", 1, 0, false);
        declareFunction(me, "pph_list_type_identifier", "PPH-LIST-TYPE-IDENTIFIER", 1, 0, false);
        declareFunction(me, "pph_bare_string_phrase_p", "PPH-BARE-STRING-PHRASE-P", 1, 0, false);
        declareFunction(me, "pph_coordinated_np_info", "PPH-COORDINATED-NP-INFO", 1, 1, false);
        declareFunction(me, "pph_phrase_gender", "PPH-PHRASE-GENDER", 1, 0, false);
        declareFunction(me, "pph_phrase_person", "PPH-PHRASE-PERSON", 1, 0, false);
        declareFunction(me, "pph_phrase_number", "PPH-PHRASE-NUMBER", 1, 0, false);
        declareFunction(me, "pph_agr_pred_from_coordinated_np_number", "PPH-AGR-PRED-FROM-COORDINATED-NP-NUMBER", 1, 0, false);
        declareFunction(me, "pph_repeated_phrase_p", "PPH-REPEATED-PHRASE-P", 1, 0, false);
        declareFunction(me, "pph_repeated_phrase_first_arg_position", "PPH-REPEATED-PHRASE-FIRST-ARG-POSITION", 1, 0, false);
        declareFunction(me, "pph_repeated_phrase_references_argP", "PPH-REPEATED-PHRASE-REFERENCES-ARG?", 2, 0, false);
        declareFunction(me, "new_pph_repeated_phrase", "NEW-PPH-REPEATED-PHRASE", 1, 0, false);
        declareFunction(me, "pph_phrase_p", "PPH-PHRASE-P", 1, 1, false);
        declareFunction(me, "pph_phrase_verify_dtrs", "PPH-PHRASE-VERIFY-DTRS", 1, 0, false);
        declareFunction(me, "pph_phrase_non_empty_output_list_p", "PPH-PHRASE-NON-EMPTY-OUTPUT-LIST-P", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_p", "PPH-PHRASE-OUTPUT-LIST-P", 1, 0, false);
        new pph_phrase.$pph_phrase_output_list_p$UnaryFunction();
        declareFunction(me, "pph_phrase_cycl_p", "PPH-PHRASE-CYCL-P", 1, 0, false);
        declareFunction(me, "pph_phrase_case_p", "PPH-PHRASE-CASE-P", 1, 0, false);
        declareFunction(me, "pph_phrase_wu_p", "PPH-PHRASE-WU-P", 1, 0, false);
        declareFunction(me, "pph_phrase_head_dtr_num_p", "PPH-PHRASE-HEAD-DTR-NUM-P", 1, 0, false);
        declareFunction(me, "pph_phrase_indefinite_articleP", "PPH-PHRASE-INDEFINITE-ARTICLE?", 1, 0, false);
        declareFunction(me, "pph_phrase_definite_articleP", "PPH-PHRASE-DEFINITE-ARTICLE?", 1, 0, false);
        declareFunction(me, "pph_phrase_note_done", "PPH-PHRASE-NOTE-DONE", 1, 0, false);
        declareFunction(me, "pph_phrase_note_not_done", "PPH-PHRASE-NOTE-NOT-DONE", 1, 0, false);
        declareFunction(me, "pph_phrase_note_done_status", "PPH-PHRASE-NOTE-DONE-STATUS", 2, 0, false);
        declareFunction(me, "pph_phrase_doneP", "PPH-PHRASE-DONE?", 1, 0, false);
        declareFunction(me, "pph_phrase_has_stringP", "PPH-PHRASE-HAS-STRING?", 1, 0, false);
        declareFunction(me, "pph_ranged_det_phrase_p", "PPH-RANGED-DET-PHRASE-P", 1, 1, false);
        declareFunction(me, "pph_phrase_destroy_dtrs_metered", "PPH-PHRASE-DESTROY-DTRS-METERED", 1, 0, false);
        declareFunction(me, "pph_phrase_destroyer", "PPH-PHRASE-DESTROYER", 0, 0, false);
        declareFunction(me, "set_pph_phrase_destruction_grace_period", "SET-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD", 1, 0, false);
        declareFunction(me, "smite_doomed_pph_phrases_next_time_around", "SMITE-DOOMED-PPH-PHRASES-NEXT-TIME-AROUND", 0, 0, false);
        declareFunction(me, "destroy_pph_phrase", "DESTROY-PPH-PHRASE", 1, 1, false);
        declareFunction(me, "bypass_pph_phrase_destroyerP", "BYPASS-PPH-PHRASE-DESTROYER?", 0, 0, false);
        declareFunction(me, "http_processP", "HTTP-PROCESS?", 0, 1, false);
        declareFunction(me, "clear_warn_about_pph_phrase_destruction", "CLEAR-WARN-ABOUT-PPH-PHRASE-DESTRUCTION", 0, 0, false);
        declareFunction(me, "remove_warn_about_pph_phrase_destruction", "REMOVE-WARN-ABOUT-PPH-PHRASE-DESTRUCTION", 1, 1, false);
        declareFunction(me, "warn_about_pph_phrase_destruction_internal", "WARN-ABOUT-PPH-PHRASE-DESTRUCTION-INTERNAL", 2, 0, false);
        declareFunction(me, "warn_about_pph_phrase_destruction", "WARN-ABOUT-PPH-PHRASE-DESTRUCTION", 1, 1, false);
        declareFunction(me, "destroy_pph_phrase_low", "DESTROY-PPH-PHRASE-LOW", 1, 0, false);
        declareFunction(me, "destroy_all_pph_phrases", "DESTROY-ALL-PPH-PHRASES", 0, 0, false);
        declareFunction(me, "destroy_pph_phrase_int", "DESTROY-PPH-PHRASE-INT", 2, 0, false);
        declareFunction(me, "pph_phrase_destroy_info_bundle", "PPH-PHRASE-DESTROY-INFO-BUNDLE", 1, 0, false);
        declareFunction(me, "pph_phrase_destroy_dtrs", "PPH-PHRASE-DESTROY-DTRS", 1, 1, false);
        declareFunction(me, "pph_phrase_info_set_high", "PPH-PHRASE-INFO-SET-HIGH", 3, 0, false);
        declareFunction(me, "pph_phrase_demerits", "PPH-PHRASE-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_phrase_contextualized_demerits", "PPH-PHRASE-CONTEXTUALIZED-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_phrase_top_level_demerits", "PPH-PHRASE-TOP-LEVEL-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_phrase_top_level_demerits_reason", "PPH-PHRASE-TOP-LEVEL-DEMERITS-REASON", 1, 0, false);
        declareFunction(me, "pph_phrase_set_top_level_demerits", "PPH-PHRASE-SET-TOP-LEVEL-DEMERITS", 2, 1, false);
        declareFunction(me, "pph_phrase_increment_top_level_demerits", "PPH-PHRASE-INCREMENT-TOP-LEVEL-DEMERITS", 1, 2, false);
        declareFunction(me, "pph_phrase_max_alternatives", "PPH-PHRASE-MAX-ALTERNATIVES", 1, 0, false);
        declareFunction(me, "pph_phrase_local_max_alternatives", "PPH-PHRASE-LOCAL-MAX-ALTERNATIVES", 1, 0, false);
        declareFunction(me, "pph_phrase_set_max_alternatives", "PPH-PHRASE-SET-MAX-ALTERNATIVES", 2, 0, false);
        declareFunction(me, "pph_phrase_set_inferences", "PPH-PHRASE-SET-INFERENCES", 2, 0, false);
        declareFunction(me, "pph_phrase_inferences", "PPH-PHRASE-INFERENCES", 1, 0, false);
        declareFunction(me, "pph_phrase_add_inference", "PPH-PHRASE-ADD-INFERENCE", 2, 0, false);
        declareFunction(me, "pph_phrase_case", "PPH-PHRASE-CASE", 1, 0, false);
        declareFunction(me, "pph_phrase_set_case", "PPH-PHRASE-SET-CASE", 2, 1, false);
        declareFunction(me, "pph_phrase_set_case_low", "PPH-PHRASE-SET-CASE-LOW", 2, 0, false);
        declareFunction(me, "pph_phrase_set_cases_recursively", "PPH-PHRASE-SET-CASES-RECURSIVELY", 1, 0, false);
        declareFunction(me, "pph_phrase_set_object_case", "PPH-PHRASE-SET-OBJECT-CASE", 1, 0, false);
        declareFunction(me, "pph_phrase_set_genitive_case", "PPH-PHRASE-SET-GENITIVE-CASE", 1, 0, false);
        declareFunction(me, "pph_phrase_object_dtrs", "PPH-PHRASE-OBJECT-DTRS", 1, 0, false);
        declareFunction(me, "pph_phrase_possessive_dtrs", "PPH-PHRASE-POSSESSIVE-DTRS", 1, 0, false);
        declareFunction(me, "pph_phrase_prepositional_object_dtrs", "PPH-PHRASE-PREPOSITIONAL-OBJECT-DTRS", 1, 0, false);
        declareFunction(me, "pph_phrase_verb_object_dtrs", "PPH-PHRASE-VERB-OBJECT-DTRS", 1, 0, false);
        declareFunction(me, "pph_transitive_verb_phraseP", "PPH-TRANSITIVE-VERB-PHRASE?", 1, 0, false);
        declareFunction(me, "pph_phrase_set_subject_case", "PPH-PHRASE-SET-SUBJECT-CASE", 1, 0, false);
        declareFunction(me, "pph_phrase_subject_dtr", "PPH-PHRASE-SUBJECT-DTR", 1, 0, false);
        declareFunction(me, "pph_phrase_starts_with_verbP", "PPH-PHRASE-STARTS-WITH-VERB?", 1, 0, false);
        declareFunction(me, "pph_phrase_subjectP", "PPH-PHRASE-SUBJECT?", 1, 0, false);
        declareFunction(me, "pph_phrase_top_level_problem_dictionary", "PPH-PHRASE-TOP-LEVEL-PROBLEM-DICTIONARY", 1, 0, false);
        declareFunction(me, "pph_phrase_find_or_create_top_level_problem_dictionary", "PPH-PHRASE-FIND-OR-CREATE-TOP-LEVEL-PROBLEM-DICTIONARY", 1, 0, false);
        declareFunction(me, "pph_phrase_set_top_level_problem_dictionary", "PPH-PHRASE-SET-TOP-LEVEL-PROBLEM-DICTIONARY", 2, 0, false);
        declareFunction(me, "pph_phrase_maybe_dump_problem_reports", "PPH-PHRASE-MAYBE-DUMP-PROBLEM-REPORTS", 1, 1, false);
        declareFunction(me, "pph_phrase_add_problems", "PPH-PHRASE-ADD-PROBLEMS", 2, 0, false);
        declareFunction(me, "pph_phrase_dump_problem_reports", "PPH-PHRASE-DUMP-PROBLEM-REPORTS", 2, 0, false);
        declareFunction(me, "pph_phrase_compile_problem_dictionary", "PPH-PHRASE-COMPILE-PROBLEM-DICTIONARY", 1, 0, false);
        declareFunction(me, "pph_merge_problem_dictionary", "PPH-MERGE-PROBLEM-DICTIONARY", 2, 0, false);
        declareFunction(me, "pph_phrase_reporter_problems", "PPH-PHRASE-REPORTER-PROBLEMS", 2, 0, false);
        declareFunction(me, "pph_phrase_maybe_note_problem", "PPH-PHRASE-MAYBE-NOTE-PROBLEM", 3, 1, false);
        declareFunction(me, "pph_phrase_note_problem", "PPH-PHRASE-NOTE-PROBLEM", 4, 0, false);
        declareFunction(me, "pph_note_problem", "PPH-NOTE-PROBLEM", 4, 0, false);
        declareFunction(me, "note_pph_problem", "NOTE-PPH-PROBLEM", 3, 0, false);
        declareFunction(me, "pph_problem_p", "PPH-PROBLEM-P", 1, 0, false);
        declareFunction(me, "pph_problem_string", "PPH-PROBLEM-STRING", 2, 0, false);
        declareFunction(me, "new_pph_problem", "NEW-PPH-PROBLEM", 1, 1, false);
        declareFunction(me, "pph_problem_type_p", "PPH-PROBLEM-TYPE-P", 1, 0, false);
        declareFunction(me, "pph_phrase_suid", "PPH-PHRASE-SUID", 1, 0, false);
        declareFunction(me, "pph_phrase_set_suid", "PPH-PHRASE-SET-SUID", 2, 0, false);
        new pph_phrase.$pph_phrase_set_suid$BinaryFunction();
        declareFunction(me, "pph_phrase_set_suid_low", "PPH-PHRASE-SET-SUID-LOW", 2, 0, false);
        declareFunction(me, "pph_phrase_free_suid", "PPH-PHRASE-FREE-SUID", 1, 0, false);
        declareMacro(me, "pph_phrase_do_alternatives", "PPH-PHRASE-DO-ALTERNATIVES");
        declareFunction(me, "pph_phrase_alternatives", "PPH-PHRASE-ALTERNATIVES", 1, 0, false);
        declareFunction(me, "pph_phrase_local_alternatives", "PPH-PHRASE-LOCAL-ALTERNATIVES", 1, 0, false);
        declareFunction(me, "pph_phrase_set_alternatives", "PPH-PHRASE-SET-ALTERNATIVES", 2, 0, false);
        declareFunction(me, "pph_phrase_set_alternatives_low", "PPH-PHRASE-SET-ALTERNATIVES-LOW", 2, 0, false);
        declareFunction(me, "pph_phrase_add_alternative", "PPH-PHRASE-ADD-ALTERNATIVE", 2, 0, false);
        declareFunction(me, "pph_phrase_remove_alternative", "PPH-PHRASE-REMOVE-ALTERNATIVE", 2, 0, false);
        declareFunction(me, "pph_phrase_free_alternatives", "PPH-PHRASE-FREE-ALTERNATIVES", 1, 0, false);
        declareFunction(me, "pph_phrase_mother", "PPH-PHRASE-MOTHER", 1, 0, false);
        declareFunction(me, "pph_phrase_set_mother", "PPH-PHRASE-SET-MOTHER", 2, 0, false);
        declareFunction(me, "pph_phrase_free_mother", "PPH-PHRASE-FREE-MOTHER", 1, 0, false);
        declareFunction(me, "pph_phrase_set_mother_low", "PPH-PHRASE-SET-MOTHER-LOW", 2, 0, false);
        declareFunction(me, "pph_phrase_logical_mother", "PPH-PHRASE-LOGICAL-MOTHER", 1, 0, false);
        declareFunction(me, "pph_phrase_maximal_projection", "PPH-PHRASE-MAXIMAL-PROJECTION", 1, 0, false);
        declareFunction(me, "pph_verb_find_sentential_mother", "PPH-VERB-FIND-SENTENTIAL-MOTHER", 1, 0, false);
        declareFunction(me, "pph_phrase_root_mother", "PPH-PHRASE-ROOT-MOTHER", 1, 0, false);
        declareFunction(me, "pph_phrase_find_root_mother", "PPH-PHRASE-FIND-ROOT-MOTHER", 1, 0, false);
        declareFunction(me, "pph_phrase_root_mother_cycl", "PPH-PHRASE-ROOT-MOTHER-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_ancestor_p", "PPH-PHRASE-ANCESTOR-P", 2, 0, false);
        declareFunction(me, "pph_phrase_descendant_p", "PPH-PHRASE-DESCENDANT-P", 2, 0, false);
        declareFunction(me, "pph_phrase_has_ancestor_of_categoryP", "PPH-PHRASE-HAS-ANCESTOR-OF-CATEGORY?", 2, 0, false);
        declareFunction(me, "pph_phrase_justification", "PPH-PHRASE-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "pph_phrase_set_justification", "PPH-PHRASE-SET-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "pph_phrase_add_justification", "PPH-PHRASE-ADD-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "pph_phrase_add_justifications_from_phrase", "PPH-PHRASE-ADD-JUSTIFICATIONS-FROM-PHRASE", 2, 0, false);
        declareFunction(me, "pph_phrase_add_justifications_from_item", "PPH-PHRASE-ADD-JUSTIFICATIONS-FROM-ITEM", 2, 0, false);
        declareFunction(me, "pph_code_justification", "PPH-CODE-JUSTIFICATION", 1, 1, false);
        declareFunction(me, "pph_nl_generation_cache_justification", "PPH-NL-GENERATION-CACHE-JUSTIFICATION", 0, 0, false);
        declareFunction(me, "pph_phrase_gather_supports", "PPH-PHRASE-GATHER-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_phrase_all_variant_dtr_lists", "PPH-PHRASE-ALL-VARIANT-DTR-LISTS", 1, 2, false);
        declareFunction(me, "maybe_warn_about_dtr_variant_lists", "MAYBE-WARN-ABOUT-DTR-VARIANT-LISTS", 3, 0, false);
        declareFunction(me, "variant_has_missing_targetP", "VARIANT-HAS-MISSING-TARGET?", 1, 1, false);
        declareFunction(me, "variant_phrase_has_missing_targetP", "VARIANT-PHRASE-HAS-MISSING-TARGET?", 2, 0, false);
        declareFunction(me, "pph_ancestor_phrase_or_self_p", "PPH-ANCESTOR-PHRASE-OR-SELF-P", 2, 0, false);
        new pph_phrase.$pph_ancestor_phrase_or_self_p$BinaryFunction();
        declareFunction(me, "pph_phrase_all_strings", "PPH-PHRASE-ALL-STRINGS", 1, 1, false);
        declareFunction(me, "pph_variant_string_E_internal", "PPH-VARIANT-STRING-=-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_variant_string_E", "PPH-VARIANT-STRING-=", 2, 0, false);
        declareFunction(me, "pph_variant_string_internal", "PPH-VARIANT-STRING-INTERNAL", 1, 2, false);
        declareFunction(me, "pph_variant_string", "PPH-VARIANT-STRING", 1, 2, false);
        declareFunction(me, "car_nesting_depth_G", "CAR-NESTING-DEPTH->", 2, 0, false);
        declareFunction(me, "pph_alternative_phrase_strings", "PPH-ALTERNATIVE-PHRASE-STRINGS", 1, 1, false);
        declareFunction(me, "pph_phrase_all_output_lists", "PPH-PHRASE-ALL-OUTPUT-LISTS", 1, 0, false);
        declareFunction(me, "pph_phrase_all_output_lists_internal", "PPH-PHRASE-ALL-OUTPUT-LISTS-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_variant_output_list", "PPH-VARIANT-OUTPUT-LIST", 1, 0, false);
        declareFunction(me, "pph_phrase_all_output_items", "PPH-PHRASE-ALL-OUTPUT-ITEMS", 1, 0, false);
        declareFunction(me, "pph_variant_output_item", "PPH-VARIANT-OUTPUT-ITEM", 1, 0, false);
        declareFunction(me, "pph_phrase_string_no_tags", "PPH-PHRASE-STRING-NO-TAGS", 1, 0, false);
        declareFunction(me, "pph_phrase_string", "PPH-PHRASE-STRING", 1, 1, false);
        declareFunction(me, "pph_phrase_clear_noted_strings", "PPH-PHRASE-CLEAR-NOTED-STRINGS", 1, 0, false);
        declareFunction(me, "pph_phrase_note_string", "PPH-PHRASE-NOTE-STRING", 3, 0, false);
        declareFunction(me, "pph_phrase_noted_string", "PPH-PHRASE-NOTED-STRING", 1, 2, false);
        declareFunction(me, "pph_phrase_maybe_add_anchor_tags", "PPH-PHRASE-MAYBE-ADD-ANCHOR-TAGS", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_maybe_add_anchor_tags", "PPH-PHRASE-OUTPUT-ITEM-MAYBE-ADD-ANCHOR-TAGS", 2, 0, false);
        declareFunction(me, "pph_phrase_has_html_anchor_tagsP", "PPH-PHRASE-HAS-HTML-ANCHOR-TAGS?", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_string_no_tags", "PPH-PHRASE-OUTPUT-LIST-STRING-NO-TAGS", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_string", "PPH-PHRASE-OUTPUT-LIST-STRING", 1, 1, false);
        declareFunction(me, "pph_phrase_output_list_assemble_string", "PPH-PHRASE-OUTPUT-LIST-ASSEMBLE-STRING", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_get_string", "PPH-PHRASE-OUTPUT-ITEM-GET-STRING", 2, 0, false);
        declareFunction(me, "pph_phrase_set_string", "PPH-PHRASE-SET-STRING", 2, 0, false);
        declareFunction(me, "pph_phrase_arg_position", "PPH-PHRASE-ARG-POSITION", 1, 0, false);
        declareFunction(me, "pph_phrase_set_arg_position", "PPH-PHRASE-SET-ARG-POSITION", 2, 0, false);
        declareFunction(me, "pph_output_list_copy", "PPH-OUTPUT-LIST-COPY", 1, 0, false);
        declareFunction(me, "pph_phrase_set_output_list_cycl", "PPH-PHRASE-SET-OUTPUT-LIST-CYCL", 2, 0, false);
        declareFunction(me, "pph_phrase_sanity_check_cycl", "PPH-PHRASE-SANITY-CHECK-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_set_html_tags", "PPH-PHRASE-SET-HTML-TAGS", 3, 0, false);
        declareFunction(me, "pph_phrase_add_html_tags", "PPH-PHRASE-ADD-HTML-TAGS", 3, 0, false);
        declareFunction(me, "pph_phrase_find_or_set_category", "PPH-PHRASE-FIND-OR-SET-CATEGORY", 1, 0, false);
        declareFunction(me, "pph_phrase_set_category_to_np", "PPH-PHRASE-SET-CATEGORY-TO-NP", 1, 0, false);
        declareFunction(me, "pph_phrase_npP", "PPH-PHRASE-NP?", 1, 0, false);
        declareFunction(me, "pph_heavy_npP", "PPH-HEAVY-NP?", 1, 0, false);
        declareFunction(me, "pph_phrase_sP", "PPH-PHRASE-S?", 1, 0, false);
        declareFunction(me, "pph_phrase_nbarP", "PPH-PHRASE-NBAR?", 1, 0, false);
        declareFunction(me, "pph_phrase_nominalP", "PPH-PHRASE-NOMINAL?", 1, 0, false);
        declareFunction(me, "pph_phrase_possessiveP", "PPH-PHRASE-POSSESSIVE?", 1, 0, false);
        declareFunction(me, "pph_phrase_verbP", "PPH-PHRASE-VERB?", 1, 0, false);
        declareFunction(me, "pph_phrase_set_category_to_pp", "PPH-PHRASE-SET-CATEGORY-TO-PP", 1, 0, false);
        declareFunction(me, "pph_phrase_ppP", "PPH-PHRASE-PP?", 1, 0, false);
        declareFunction(me, "pph_phrase_adjpP", "PPH-PHRASE-ADJP?", 1, 0, false);
        declareFunction(me, "pph_phrase_adjP", "PPH-PHRASE-ADJ?", 1, 0, false);
        declareFunction(me, "pph_phrase_clauseP", "PPH-PHRASE-CLAUSE?", 1, 0, false);
        declareFunction(me, "pph_copula_phraseP", "PPH-COPULA-PHRASE?", 1, 0, false);
        declareFunction(me, "pph_aux_verb_phraseP", "PPH-AUX-VERB-PHRASE?", 1, 0, false);
        declareFunction(me, "possibly_modal_verb_phraseP", "POSSIBLY-MODAL-VERB-PHRASE?", 1, 0, false);
        declareFunction(me, "pph_ordinal_phraseP", "PPH-ORDINAL-PHRASE?", 1, 0, false);
        declareFunction(me, "pph_phrase_category", "PPH-PHRASE-CATEGORY", 1, 1, false);
        declareFunction(me, "pph_phrase_head_pos", "PPH-PHRASE-HEAD-POS", 1, 0, false);
        declareFunction(me, "pph_phrase_set_category", "PPH-PHRASE-SET-CATEGORY", 2, 1, false);
        declareFunction(me, "pph_phrase_update_category", "PPH-PHRASE-UPDATE-CATEGORY", 2, 2, false);
        declareFunction(me, "pph_phrase_maybe_coerce_np_to_nbar", "PPH-PHRASE-MAYBE-COERCE-NP-TO-NBAR", 3, 0, false);
        declareFunction(me, "pph_phrase_coerce_np_to_nbar", "PPH-PHRASE-COERCE-NP-TO-NBAR", 1, 0, false);
        declareFunction(me, "pph_find_new_category", "PPH-FIND-NEW-CATEGORY", 2, 1, false);
        declareFunction(me, "pph_phrase_reconcile_categories", "PPH-PHRASE-RECONCILE-CATEGORIES", 2, 1, false);
        declareFunction(me, "pph_better_categoryP", "PPH-BETTER-CATEGORY?", 2, 0, false);
        declareFunction(me, "pph_phrase_set_cycl", "PPH-PHRASE-SET-CYCL", 2, 0, false);
        declareFunction(me, "pph_phrase_reset_cycl", "PPH-PHRASE-RESET-CYCL", 2, 0, false);
        declareFunction(me, "pph_unknown_cycl", "PPH-UNKNOWN-CYCL", 0, 0, false);
        declareFunction(me, "pph_unknown_cycl_p", "PPH-UNKNOWN-CYCL-P", 1, 0, false);
        declareFunction(me, "pph_known_cycl_p", "PPH-KNOWN-CYCL-P", 1, 0, false);
        declareFunction(me, "pph_empty_cycl", "PPH-EMPTY-CYCL", 0, 0, false);
        declareFunction(me, "pph_empty_cycl_p", "PPH-EMPTY-CYCL-P", 1, 0, false);
        declareFunction(me, "pph_phrase_set_link_cycl", "PPH-PHRASE-SET-LINK-CYCL", 2, 0, false);
        declareFunction(me, "pph_phrase_link_cycl", "PPH-PHRASE-LINK-CYCL", 1, 0, false);
        declareFunction(me, "pph_phrase_cycl", "PPH-PHRASE-CYCL", 1, 1, false);
        declareFunction(me, "pph_phrase_has_known_cyclP", "PPH-PHRASE-HAS-KNOWN-CYCL?", 1, 0, false);
        declareFunction(me, "pph_phrase_cycl_find_if", "PPH-PHRASE-CYCL-FIND-IF", 2, 0, false);
        declareFunction(me, "pph_phrase_cycl_gather", "PPH-PHRASE-CYCL-GATHER", 2, 1, false);
        declareFunction(me, "pph_phrase_gather", "PPH-PHRASE-GATHER", 2, 1, false);
        declareFunction(me, "pph_sole_reference_p", "PPH-SOLE-REFERENCE-P", 2, 0, false);
        declareFunction(me, "pph_phrase_find_other_reference", "PPH-PHRASE-FIND-OTHER-REFERENCE", 3, 1, false);
        declareFunction(me, "pph_phrase_found_other_reference", "PPH-PHRASE-FOUND-OTHER-REFERENCE", 3, 0, false);
        declareFunction(me, "pph_phrase_cycl_subst", "PPH-PHRASE-CYCL-SUBST", 3, 2, false);
        declareFunction(me, "pph_maybe_resolve_formula_arg_expressions", "PPH-MAYBE-RESOLVE-FORMULA-ARG-EXPRESSIONS", 6, 0, false);
        declareFunction(me, "pph_resolve_formula_arg_fn", "PPH-RESOLVE-FORMULA-ARG-FN", 5, 0, false);
        declareFunction(me, "pph_phrase_cycl_subst_update_on_change", "PPH-PHRASE-CYCL-SUBST-UPDATE-ON-CHANGE", 5, 0, false);
        declareFunction(me, "pph_phrase_cycl_subst_update_arg_position", "PPH-PHRASE-CYCL-SUBST-UPDATE-ARG-POSITION", 4, 0, false);
        declareFunction(me, "pph_phrase_cycl_subst_update_arg_position_map", "PPH-PHRASE-CYCL-SUBST-UPDATE-ARG-POSITION-MAP", 4, 0, false);
        declareFunction(me, "pph_phrase_cycl_subst_update_output_list_cycl", "PPH-PHRASE-CYCL-SUBST-UPDATE-OUTPUT-LIST-CYCL", 3, 0, false);
        declareFunction(me, "pph_phrase_cycls_of_phrases", "PPH-PHRASE-CYCLS-OF-PHRASES", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list", "PPH-PHRASE-OUTPUT-LIST", 1, 0, false);
        declareFunction(me, "pph_phrase_dtr_output_lists", "PPH-PHRASE-DTR-OUTPUT-LISTS", 1, 0, false);
        declareFunction(me, "pph_phrase_set_output_list", "PPH-PHRASE-SET-OUTPUT-LIST", 2, 1, false);
        declareFunction(me, "consolidate_same_arg_items", "CONSOLIDATE-SAME-ARG-ITEMS", 1, 0, false);
        declareFunction(me, "do_consolidate_same_arg_items", "DO-CONSOLIDATE-SAME-ARG-ITEMS", 1, 0, false);
        declareFunction(me, "new_item_from_queued_item", "NEW-ITEM-FROM-QUEUED-ITEM", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_consolidate_slots", "PPH-PHRASE-OUTPUT-ITEM-CONSOLIDATE-SLOTS", 2, 0, false);
        declareFunction(me, "pph_phrase_output_itemE", "PPH-PHRASE-OUTPUT-ITEM=", 2, 0, false);
        declareFunction(me, "pph_phrase_output_items_html_unmergeableP", "PPH-PHRASE-OUTPUT-ITEMS-HTML-UNMERGEABLE?", 2, 0, false);
        declareFunction(me, "pph_phrase_output_item_has_non_anchor_tagP", "PPH-PHRASE-OUTPUT-ITEM-HAS-NON-ANCHOR-TAG?", 1, 0, false);
        declareFunction(me, "pph_phrase_output_items_have_identical_closed_htmlP", "PPH-PHRASE-OUTPUT-ITEMS-HAVE-IDENTICAL-CLOSED-HTML?", 2, 0, false);
        declareFunction(me, "pph_identical_closed_html_tagsP", "PPH-IDENTICAL-CLOSED-HTML-TAGS?", 4, 0, false);
        declareFunction(me, "pph_current_arg0", "PPH-CURRENT-ARG0", 0, 0, false);
        declareFunction(me, "pph_current_arg0_specified_p", "PPH-CURRENT-ARG0-SPECIFIED-P", 0, 0, false);
        declareFunction(me, "pph_current_arg0_position", "PPH-CURRENT-ARG0-POSITION", 0, 0, false);
        declareFunction(me, "pph_phrase_maybe_reserve_for_arg0", "PPH-PHRASE-MAYBE-RESERVE-FOR-ARG0", 1, 0, false);
        declareFunction(me, "pph_phrase_set_cycl_to_current_arg0", "PPH-PHRASE-SET-CYCL-TO-CURRENT-ARG0", 1, 0, false);
        declareFunction(me, "pph_arg0_item_p", "PPH-ARG0-ITEM-P", 1, 0, false);
        declareFunction(me, "pph_arg0_position_p", "PPH-ARG0-POSITION-P", 1, 0, false);
        declareFunction(me, "pph_bare_string_output_item_p", "PPH-BARE-STRING-OUTPUT-ITEM-P", 2, 0, false);
        declareFunction(me, "pph_phrase_set_output_list_with_map", "PPH-PHRASE-SET-OUTPUT-LIST-WITH-MAP", 2, 0, false);
        declareFunction(me, "pph_phrase_consolidate_output_list", "PPH-PHRASE-CONSOLIDATE-OUTPUT-LIST", 1, 4, false);
        declareFunction(me, "pph_consolidate_output_items", "PPH-CONSOLIDATE-OUTPUT-ITEMS", 1, 7, false);
        declareFunction(me, "new_pph_phrase_output_list", "NEW-PPH-PHRASE-OUTPUT-LIST", 1, 3, false);
        declareFunction(me, "pph_phrase_agr", "PPH-PHRASE-AGR", 1, 0, false);
        declareFunction(me, "pph_phrase_absolute_agr_preds", "PPH-PHRASE-ABSOLUTE-AGR-PREDS", 1, 0, false);
        declareFunction(me, "pph_phrase_set_agr", "PPH-PHRASE-SET-AGR", 2, 1, false);
        declareFunction(me, "pph_phrase_clear_relative_agr", "PPH-PHRASE-CLEAR-RELATIVE-AGR", 1, 1, false);
        declareFunction(me, "pph_phrase_set_agr_constraint", "PPH-PHRASE-SET-AGR-CONSTRAINT", 2, 1, false);
        declareFunction(me, "pph_phrase_set_agr_pred", "PPH-PHRASE-SET-AGR-PRED", 2, 1, false);
        declareFunction(me, "pph_phrase_set_agr_pred_unless_nil", "PPH-PHRASE-SET-AGR-PRED-UNLESS-NIL", 2, 0, false);
        declareFunction(me, "pph_phrase_add_agr_pred", "PPH-PHRASE-ADD-AGR-PRED", 2, 0, false);
        declareFunction(me, "pph_phrase_add_agr_preds", "PPH-PHRASE-ADD-AGR-PREDS", 2, 1, false);
        declareFunction(me, "pph_add_agr_preds_to_phrase_agr", "PPH-ADD-AGR-PREDS-TO-PHRASE-AGR", 2, 0, false);
        declareFunction(me, "pph_add_agr_preds_to_agr_constraint", "PPH-ADD-AGR-PREDS-TO-AGR-CONSTRAINT", 2, 0, false);
        declareFunction(me, "pph_add_agr_preds_to_subject_verb", "PPH-ADD-AGR-PREDS-TO-SUBJECT-VERB", 2, 0, false);
        declareFunction(me, "pph_add_agr_preds_to_det_nbar", "PPH-ADD-AGR-PREDS-TO-DET-NBAR", 2, 0, false);
        declareFunction(me, "pph_add_agr_preds_to_relative_agr_constraint", "PPH-ADD-AGR-PREDS-TO-RELATIVE-AGR-CONSTRAINT", 2, 0, false);
        declareFunction(me, "pph_add_agr_preds_to_nl_preds", "PPH-ADD-AGR-PREDS-TO-NL-PREDS", 2, 0, false);
        declareFunction(me, "pph_add_agr_preds_to_pos_pred", "PPH-ADD-AGR-PREDS-TO-POS-PRED", 2, 0, false);
        declareFunction(me, "pph_phrase_set_absolute_agr_preds", "PPH-PHRASE-SET-ABSOLUTE-AGR-PREDS", 2, 0, false);
        declareFunction(me, "pph_phrase_update_agr_preds", "PPH-PHRASE-UPDATE-AGR-PREDS", 2, 1, false);
        declareFunction(me, "pph_phrase_set_agr_preds", "PPH-PHRASE-SET-AGR-PREDS", 2, 1, false);
        declareFunction(me, "pph_phrase_set_relative_agr_target", "PPH-PHRASE-SET-RELATIVE-AGR-TARGET", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_constraint_for_preds", "PPH-PHRASE-AGR-CONSTRAINT-FOR-PREDS", 1, 0, false);
        declareFunction(me, "pph_phrase_check_impossible", "PPH-PHRASE-CHECK-IMPOSSIBLE", 1, 1, false);
        declareFunction(me, "pph_phrase_impossible_p", "PPH-PHRASE-IMPOSSIBLE-P", 1, 1, false);
        declareFunction(me, "pph_phrase_get_absolute_agr_from_phrase", "PPH-PHRASE-GET-ABSOLUTE-AGR-FROM-PHRASE", 1, 0, false);
        declareFunction(me, "pph_phrase_set_absolute_agr_from_phrase", "PPH-PHRASE-SET-ABSOLUTE-AGR-FROM-PHRASE", 1, 0, false);
        declareFunction(me, "pph_phrase_has_agr_constraint_type_p", "PPH-PHRASE-HAS-AGR-CONSTRAINT-TYPE-P", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_constraint_of_type", "PPH-PHRASE-AGR-CONSTRAINT-OF-TYPE", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_target_of_type", "PPH-PHRASE-AGR-TARGET-OF-TYPE", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_pred", "PPH-PHRASE-AGR-PRED", 1, 0, false);
        declareFunction(me, "pph_phrase_category_unknown_p", "PPH-PHRASE-CATEGORY-UNKNOWN-P", 1, 0, false);
        declareFunction(me, "pph_phrase_agr_preds", "PPH-PHRASE-AGR-PREDS", 1, 1, false);
        declareFunction(me, "pph_phrase_agr_preds_from_agr", "PPH-PHRASE-AGR-PREDS-FROM-AGR", 1, 0, false);
        declareFunction(me, "pph_phrase_compatible_with_predsP", "PPH-PHRASE-COMPATIBLE-WITH-PREDS?", 2, 0, false);
        declareFunction(me, "pph_phrase_agr_preds_from_category", "PPH-PHRASE-AGR-PREDS-FROM-CATEGORY", 1, 0, false);
        declareFunction(me, "pph_agr_preds_from_category", "PPH-AGR-PREDS-FROM-CATEGORY", 2, 0, false);
        declareFunction(me, "clear_pph_agr_preds_from_category_cached", "CLEAR-PPH-AGR-PREDS-FROM-CATEGORY-CACHED", 0, 0, false);
        declareFunction(me, "remove_pph_agr_preds_from_category_cached", "REMOVE-PPH-AGR-PREDS-FROM-CATEGORY-CACHED", 1, 1, false);
        declareFunction(me, "pph_agr_preds_from_category_cached_internal", "PPH-AGR-PREDS-FROM-CATEGORY-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_agr_preds_from_category_cached", "PPH-AGR-PREDS-FROM-CATEGORY-CACHED", 1, 1, false);
        declareFunction(me, "pph_phrase_agr_preds_from_head", "PPH-PHRASE-AGR-PREDS-FROM-HEAD", 1, 0, false);
        declareFunction(me, "pph_conditional_phrase_agr_preds", "PPH-CONDITIONAL-PHRASE-AGR-PREDS", 1, 0, false);
        declareFunction(me, "pph_phrase_compatible_agr_preds", "PPH-PHRASE-COMPATIBLE-AGR-PREDS", 1, 0, false);
        declareFunction(me, "pph_phrase_wu", "PPH-PHRASE-WU", 1, 1, false);
        declareFunction(me, "pph_phrase_set_wu", "PPH-PHRASE-SET-WU", 2, 0, false);
        declareFunction(me, "pph_phrase_has_wu_onlyP", "PPH-PHRASE-HAS-WU-ONLY?", 1, 0, false);
        declareFunction(me, "pph_phrase_arg_position_map", "PPH-PHRASE-ARG-POSITION-MAP", 1, 0, false);
        declareFunction(me, "pph_phrase_arg_position_from_map", "PPH-PHRASE-ARG-POSITION-FROM-MAP", 1, 0, false);
        declareFunction(me, "pph_phrase_set_arg_position_map", "PPH-PHRASE-SET-ARG-POSITION-MAP", 2, 0, false);
        declareFunction(me, "pph_phrase_register_local_arg_positions", "PPH-PHRASE-REGISTER-LOCAL-ARG-POSITIONS", 2, 0, false);
        declareFunction(me, "pph_phrase_dtrs", "PPH-PHRASE-DTRS", 1, 0, false);
        declareFunction(me, "pph_phrase_dtr_count", "PPH-PHRASE-DTR-COUNT", 1, 0, false);
        declareFunction(me, "pph_phrase_unfinished_dtr_count", "PPH-PHRASE-UNFINISHED-DTR-COUNT", 1, 0, false);
        declareFunction(me, "pph_phrase_has_dtrsP", "PPH-PHRASE-HAS-DTRS?", 1, 0, false);
        declareFunction(me, "pph_phrase_set_dtrs", "PPH-PHRASE-SET-DTRS", 2, 0, false);
        declareFunction(me, "pph_phrase_set_only_dtr", "PPH-PHRASE-SET-ONLY-DTR", 2, 0, false);
        declareFunction(me, "pph_phrase_add_dtr_to_terminal", "PPH-PHRASE-ADD-DTR-TO-TERMINAL", 2, 0, false);
        declareFunction(me, "pph_phrase_last_dtr", "PPH-PHRASE-LAST-DTR", 1, 0, false);
        declareFunction(me, "pph_phrase_has_multiple_verbsP", "PPH-PHRASE-HAS-MULTIPLE-VERBS?", 1, 0, false);
        declareFunction(me, "pph_phrase_verb_count", "PPH-PHRASE-VERB-COUNT", 1, 1, false);
        declareFunction(me, "pph_phrase_count_if", "PPH-PHRASE-COUNT-IF", 2, 1, false);
        declareFunction(me, "pph_phrase_count_if_internal", "PPH-PHRASE-COUNT-IF-INTERNAL", 3, 0, false);
        declareFunction(me, "pph_phrase_find_nested_dtr_path", "PPH-PHRASE-FIND-NESTED-DTR-PATH", 2, 1, false);
        declareFunction(me, "pph_phrase_head_dtr_num", "PPH-PHRASE-HEAD-DTR-NUM", 1, 0, false);
        declareFunction(me, "pph_phrase_has_head_dtrP", "PPH-PHRASE-HAS-HEAD-DTR?", 1, 0, false);
        declareFunction(me, "pph_phrase_head_dtr_numP", "PPH-PHRASE-HEAD-DTR-NUM?", 2, 0, false);
        declareFunction(me, "pph_phrase_set_head_dtr_num", "PPH-PHRASE-SET-HEAD-DTR-NUM", 2, 0, false);
        declareFunction(me, "pph_phrase_nth_dtr", "PPH-PHRASE-NTH-DTR", 2, 0, false);
        declareFunction(me, "pph_phrase_head_dtr", "PPH-PHRASE-HEAD-DTR", 1, 0, false);
        declareFunction(me, "pph_phrase_head_dtr_genlP", "PPH-PHRASE-HEAD-DTR-GENL?", 2, 0, false);
        declareFunction(me, "pph_phrase_head_dtr_genl_other_thanP", "PPH-PHRASE-HEAD-DTR-GENL-OTHER-THAN?", 2, 0, false);
        declareFunction(me, "pph_phrase_lexical_head_dtr", "PPH-PHRASE-LEXICAL-HEAD-DTR", 1, 0, false);
        declareFunction(me, "pph_phrase_head_dtrP", "PPH-PHRASE-HEAD-DTR?", 1, 1, false);
        declareFunction(me, "pph_phrase_set_nth_dtr", "PPH-PHRASE-SET-NTH-DTR", 3, 0, false);
        declareFunction(me, "pph_phrase_nth_dtrP", "PPH-PHRASE-NTH-DTR?", 3, 0, false);
        declareFunction(me, "pph_phrase_head_verbP", "PPH-PHRASE-HEAD-VERB?", 1, 0, false);
        declareFunction(me, "pph_det_nbarP", "PPH-DET-NBAR?", 1, 0, false);
        declareFunction(me, "pph_justification_bundle", "PPH-JUSTIFICATION-BUNDLE", 1, 0, false);
        declareFunction(me, "pph_phrase_equal", "PPH-PHRASE-EQUAL", 2, 0, false);
        declareFunction(me, "new_pph_phrase_with_dtr_list", "NEW-PPH-PHRASE-WITH-DTR-LIST", 1, 0, false);
        declareFunction(me, "set_pph_phrase_dtrs_from_list", "SET-PPH-PHRASE-DTRS-FROM-LIST", 2, 1, false);
        declareFunction(me, "pph_phrase_remove_all_dtrs", "PPH-PHRASE-REMOVE-ALL-DTRS", 1, 0, false);
        declareFunction(me, "pph_phrase_push", "PPH-PHRASE-PUSH", 2, 0, false);
        declareFunction(me, "pph_phrase_append", "PPH-PHRASE-APPEND", 2, 0, false);
        declareFunction(me, "pph_phrase_insert_dtr", "PPH-PHRASE-INSERT-DTR", 3, 0, false);
        declareFunction(me, "pph_phrase_front_head_dtr", "PPH-PHRASE-FRONT-HEAD-DTR", 1, 0, false);
        declareFunction(me, "pph_phrase_front_subphrase", "PPH-PHRASE-FRONT-SUBPHRASE", 3, 0, false);
        declareFunction(me, "pph_phrase_remove_dtr", "PPH-PHRASE-REMOVE-DTR", 2, 0, false);
        declareFunction(me, "pph_phrase_extract_dtr_num", "PPH-PHRASE-EXTRACT-DTR-NUM", 2, 0, false);
        declareFunction(me, "update_pph_head_dtr_num_after_extraction", "UPDATE-PPH-HEAD-DTR-NUM-AFTER-EXTRACTION", 2, 0, false);
        declareFunction(me, "pph_phrase_decrement_head_dtr_num", "PPH-PHRASE-DECREMENT-HEAD-DTR-NUM", 1, 0, false);
        declareFunction(me, "pph_phrase_increment_head_dtr_num", "PPH-PHRASE-INCREMENT-HEAD-DTR-NUM", 1, 0, false);
        declareFunction(me, "update_pph_nth_phrases", "UPDATE-PPH-NTH-PHRASES", 1, 1, false);
        declareFunction(me, "pph_new_agr_num_from_old", "PPH-NEW-AGR-NUM-FROM-OLD", 2, 0, false);
        declareFunction(me, "similar_pph_nth_phrase_with_number", "SIMILAR-PPH-NTH-PHRASE-WITH-NUMBER", 2, 0, false);
        declareFunction(me, "pph_phrase_has_weak_justificationP", "PPH-PHRASE-HAS-WEAK-JUSTIFICATION?", 1, 0, false);
        declareFunction(me, "gather_weak_justifications", "GATHER-WEAK-JUSTIFICATIONS", 1, 1, false);
        declareFunction(me, "gather_all_justifications", "GATHER-ALL-JUSTIFICATIONS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_phrase_file() {
        defparameter("*PPH-PHRASE-DISPLAY-AGR?*", NIL);
        defparameter("*PPH-WARN-ABOUT-REVERTING-PHRASES?*", NIL);
        defparameter("*PPH-PHRASE-COPY-STACK*", NIL);
        defparameter("*PPH-PHRASE-COPY-NESTING-MAX*", $int$60);
        deflexical("*PPH-PHRASE-NONLOCAL-FEATURE-PROPERTIES*", $list58);
        deflexical("*PPH-SPECIAL-TYPES*", $list62);
        defparameter("*PPH-VARIABLE-BINDINGS*", NIL);
        defparameter("*PPH-SANITY-CHECK-PHRASE-DONENESS?*", NIL);
        deflexical("*PPH-PHRASE-DESTROYER-GRACE-PERIOD*", $int$600);
        deflexical("*PPH-PHRASE-DESTROYER*", SubLSystemTrampolineFile.maybeDefault($pph_phrase_destroyer$, $pph_phrase_destroyer$, () -> delayed_processor.new_delayed_processor($pph_phrase_destroyer_grace_period$.getGlobalValue(), VALID_PPH_PHRASE_P, DESTROY_PPH_PHRASE_LOW)));
        deflexical("*WARN-ABOUT-PPH-PHRASE-DESTRUCTION-CACHING-STATE*", NIL);
        defparameter("*WARN-ON-INVALID-PPH-INFERENCES?*", NIL);
        defparameter("*PPH-DO-ALTERNATIVES-MAX*", $int$500);
        defparameter("*PPH-ROOT-MOTHER-LIST*", NIL);
        defparameter("*PPH-VARIANT-LIST-MAX-COUNT*", TEN_INTEGER);
        defparameter("*PPH-PHRASE-CATEGORY-DEPTH*", ZERO_INTEGER);
        deflexical("*PPH-PHRASE-CATEGORY-MAX-DEPTH*", SubLSystemTrampolineFile.maybeDefault($pph_phrase_category_max_depth$, $pph_phrase_category_max_depth$, $int$99));
        defconstant("*PPH-UNKNOWN-CYCL*", $PPH_UNKNOWN_CYCL);
        defconstant("*PPH-EMPTY-CYCL*", $PPH_EMPTY_CYCL);
        deflexical("*PPH-AGR-PREDS-FROM-CATEGORY-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_phrase_file() {
        memoization_state.note_memoized_function(PPH_MAYBE_WARN_ABOUT_REVERTING_PHRASE);
        register_macro_helper(FIND_OR_CREATE_PPH_PHRASE_COPY_STACK, WITH_PPH_PHRASE_COPY_RECURSION_PROTECTION);
        memoization_state.note_memoized_function(PPH_VARIABLE_BINDINGS_AND_SUPPORTS_FROM_QUERY_EL_FORMULA);
        declare_defglobal($pph_phrase_destroyer$);
        note_funcall_helper_function(SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND);
        Storage.register_low_memory_callback(symbol_function(SMITE_DOOMED_PPH_PHRASES_NEXT_TIME_AROUND));
        memoization_state.note_globally_cached_function(WARN_ABOUT_PPH_PHRASE_DESTRUCTION);
        memoization_state.note_memoized_function($sym211$PPH_VARIANT_STRING__);
        memoization_state.note_memoized_function(PPH_VARIANT_STRING);
        declare_defglobal($pph_phrase_category_max_depth$);
        memoization_state.note_globally_cached_function(PPH_AGR_PREDS_FROM_CATEGORY_CACHED);
        sunit_external.define_test_category($$$PPH_Phrase, UNPROVIDED);
        sunit_external.define_test_suite($$$PPH_Phrase_Test_Suite, $list323, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_phrase_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_phrase_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_phrase_file();
    }

    

    public static final class $pph_phrase_output_list_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_output_list_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-OUTPUT-LIST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_output_list_p(arg1);
        }
    }

    public static final class $pph_phrase_set_suid$BinaryFunction extends BinaryFunction {
        public $pph_phrase_set_suid$BinaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-SET-SUID"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pph_phrase_set_suid(arg1, arg2);
        }
    }

    public static final class $pph_ancestor_phrase_or_self_p$BinaryFunction extends BinaryFunction {
        public $pph_ancestor_phrase_or_self_p$BinaryFunction() {
            super(extractFunctionNamed("PPH-ANCESTOR-PHRASE-OR-SELF-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pph_ancestor_phrase_or_self_p(arg1, arg2);
        }
    }
}

/**
 * Total time: 2575 ms synthetic
 */
