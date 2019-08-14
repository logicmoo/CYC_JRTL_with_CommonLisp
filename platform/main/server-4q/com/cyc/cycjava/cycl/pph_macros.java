/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.format_nil.format_nil_s_no_copy;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.destroy_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.new_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_size;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.valid_problem_store_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$partial_results_accumulator$;
import static com.cyc.cycjava.cycl.utilities_macros.$partial_results_total_accumulator$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-MACROS
 * source file: /cyc/top/cycl/pph-macros.lisp
 * created:     2019/07/03 17:37:50
 */
public final class pph_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new pph_macros();

 public static final String myName = "com.cyc.cycjava.cycl.pph_macros";


    // defparameter
    /**
     * The current memoization state for calls from the paraphrase code to outside.
     */
    @LispMethod(comment = "The current memoization state for calls from the paraphrase code to outside.\ndefparameter")
    public static final SubLSymbol $pph_external_memoization_state$ = makeSymbol("*PPH-EXTERNAL-MEMOIZATION-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_pph_problem_store_pointer$ = makeSymbol("*DTP-PPH-PROBLEM-STORE-POINTER*");

    // defparameter
    @LispMethod(comment = "defparameter\ndeflexical")
    // deflexical
    public static final SubLSymbol $free_pph_problem_store_pointers$ = makeSymbol("*FREE-PPH-PROBLEM-STORE-POINTERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_pph_phrases$ = makeSymbol("*NEW-PPH-PHRASES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $destroy_new_pph_phrasesP$ = makeSymbol("*DESTROY-NEW-PPH-PHRASES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $creating_permanent_pph_phraseP$ = makeSymbol("*CREATING-PERMANENT-PPH-PHRASE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_pph_phrase_count$ = makeSymbol("*NEW-PPH-PHRASE-COUNT*");

    // defparameter
    /**
     * Bound during destruction of new phrases, to avoid destroying an old one
     * accidentally.
     */
    @LispMethod(comment = "Bound during destruction of new phrases, to avoid destroying an old one\r\naccidentally.\ndefparameter\nBound during destruction of new phrases, to avoid destroying an old one\naccidentally.")
    public static final SubLSymbol $inside_destroy_new_pph_phrasesP$ = makeSymbol("*INSIDE-DESTROY-NEW-PPH-PHRASES?*");



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pph_timeout_time_check_count$ = makeSymbol("*PPH-TIMEOUT-TIME-CHECK-COUNT*");

    // defparameter
    /**
     * Number of seconds allowed to paraphrase something, when we're allowed to time
     * out.
     */
    @LispMethod(comment = "Number of seconds allowed to paraphrase something, when we\'re allowed to time\r\nout.\ndefparameter\nNumber of seconds allowed to paraphrase something, when we\'re allowed to time\nout.")
    public static final SubLSymbol $pph_default_timeout$ = makeSymbol("*PPH-DEFAULT-TIMEOUT*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_var_types_counter$ = makeSymbol("*PPH-VAR-TYPES-COUNTER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $max_suspended_method_depth$ = makeSymbol("*MAX-SUSPENDED-METHOD-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $allow_handling_of_pph_method_failuresP$ = makeSymbol("*ALLOW-HANDLING-OF-PPH-METHOD-FAILURES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $handling_pph_method_failuresP$ = makeSymbol("*HANDLING-PPH-METHOD-FAILURES?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("MAPPINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list3 = list(makeSymbol("ALIST-P"));

    private static final SubLSymbol $pph_term_paraphrase_map$ = makeSymbol("*PPH-TERM-PARAPHRASE-MAP*");

    static private final SubLList $list7 = list(makeSymbol("VALID-PPH-BLACKLIST?"));

    private static final SubLSymbol $pph_term_paraphrase_blacklist$ = makeSymbol("*PPH-TERM-PARAPHRASE-BLACKLIST*");

    private static final SubLList $list9 = cons(makeSymbol("TERM"), makeSymbol("STRINGS"));

    static private final SubLList $list10 = list(makeSymbol("LEXICAL-ASSERTIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CHECK_LIST_TYPE = makeSymbol("CHECK-LIST-TYPE");

    static private final SubLList $list12 = list(makeSymbol("VALID-PPH-BLACKLIST-ASSERTION?"));

    private static final SubLSymbol $pph_lexical_assertion_blacklist$ = makeSymbol("*PPH-LEXICAL-ASSERTION-BLACKLIST*");

    static private final SubLList $list14 = list(list(makeSymbol("FROM-PREFIX"), makeSymbol("TO-PREFIX"), makeSymbol("MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list16 = list(list(makeSymbol("*PPH-AMBIGUOUS-STRINGS*"), list(makeSymbol("FIRST-OF"), makeSymbol("*PPH-AMBIGUOUS-STRINGS*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP)))));

    private static final SubLList $list17 = list(makeSymbol("PRECISION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list18 = list(makeSymbol("PPH-PRECISION-P"));

    private static final SubLSymbol $paraphrase_precision$ = makeSymbol("*PARAPHRASE-PRECISION*");

    private static final SubLList $list20 = list(list(makeSymbol("*PPH-TERSE-MODE?*"), T));

    private static final SubLSymbol WITH_PARAPHRASE_PRECISION = makeSymbol("WITH-PARAPHRASE-PRECISION");

    private static final SubLSymbol REMEMBERING_PPH_AMBIGUOUS_STRINGS = makeSymbol("REMEMBERING-PPH-AMBIGUOUS-STRINGS");

    static private final SubLList $list23 = list(makeSymbol("NESTED-ARG-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list24 = list(makeSymbol("PPH-NESTED-ARG-LIST-P"));

    private static final SubLList $list25 = list(makeSymbol("TERMS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $definite_description_licensed_terms$ = makeSymbol("*DEFINITE-DESCRIPTION-LICENSED-TERMS*");

    static private final SubLList $list28 = list(list(makeSymbol("*PPH-MAXIMIZE-LINKS?*"), T), list(makeSymbol("*PPH-LINK-ARG0?*"), T), list(makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), NIL));

    private static final SubLList $list29 = list(list(makeSymbol("ARG0")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym30$_PPH_CURRENT_ARG0_ = makeSymbol("*PPH-CURRENT-ARG0*");

    private static final SubLSymbol $sym32$PPH_OK_ARG0_FOR_LINKING_ = makeSymbol("PPH-OK-ARG0-FOR-LINKING?");

    static private final SubLList $list33 = list(makeKeyword("UNSPECIFIED"));

    private static final SubLSymbol PPH_POSSIBLY_BINDING_CURRENT_ARG0 = makeSymbol("PPH-POSSIBLY-BINDING-CURRENT-ARG0");

    static private final SubLList $list35 = list(list(makeSymbol("FUNCTION"), makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $constant_link_function$ = makeSymbol("*CONSTANT-LINK-FUNCTION*");

    static private final SubLList $list38 = list(makeSymbol("*CONSTANT-LINK-FUNCTION*"));

    private static final SubLSymbol $html_generation_target$ = makeSymbol("*HTML-GENERATION-TARGET*");

    static private final SubLList $list40 = list(makeSymbol("*HTML-GENERATION-TARGET*"));

    private static final SubLList $list41 = list(list(makeSymbol("FUNCTION-SPEC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $html_generation_term_id_function$ = makeSymbol("*HTML-GENERATION-TERM-ID-FUNCTION*");

    static private final SubLList $list43 = list(list(makeSymbol("*CONSTANT-LINK-FUNCTION*"), $NONE));

    private static final SubLList $list44 = list(list(makeSymbol("*ALLOW-UTF8-IN-PPH-TEXT-MODE*"), T));

    private static final SubLList $list45 = list(makeSymbol("FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__ = makeSymbol("*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*");

    private static final SubLList $list48 = list(makeSymbol("PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?"));

    private static final SubLSymbol $sym50$NEW_OR_REUSED = makeUninternedSymbol("NEW-OR-REUSED");

    private static final SubLSymbol WITH_PPH_PROBLEM_STORE = makeSymbol("WITH-PPH-PROBLEM-STORE");

    public static final SubLSymbol $pph_memoization_state$ = makeSymbol("*PPH-MEMOIZATION-STATE*");

    static private final SubLList $list54 = list(makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE"));

    static private final SubLList $list55 = list(list(makeSymbol("*PPH-EXTERNAL-MEMOIZATION-STATE*"), list(makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE"))));

    static private final SubLList $list57 = list(makeSymbol("*PPH-MEMOIZATION-STATE*"));

    private static final SubLList $list59 = list(makeKeyword("NEW"));

    private static final SubLList $list60 = list(list(makeSymbol("MEMOIZATION-STATE-P"), makeSymbol("*PPH-MEMOIZATION-STATE*")));

    private static final SubLList $list61 = list(list(makeSymbol("CLEAR-ALL-MEMOIZATION"), makeSymbol("*PPH-MEMOIZATION-STATE*")));

    private static final SubLList $list62 = list(list(makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE")));

    private static final SubLSymbol FIND_OR_CREATE_PPH_MEMOIZATION_STATE = makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");

    private static final SubLSymbol FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE = makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE");

    static private final SubLList $list68 = list(makeSymbol("WITH-PPH-MEMOIZATION"), makeSymbol("WITH-PPH-EXTERNAL-MEMOIZATION"));

    private static final SubLSymbol PPH_PROBLEM_STORE_POINTER = makeSymbol("PPH-PROBLEM-STORE-POINTER");

    private static final SubLSymbol PPH_PROBLEM_STORE_POINTER_P = makeSymbol("PPH-PROBLEM-STORE-POINTER-P");

    private static final SubLList $list71 = list(makeSymbol("STORE"));

    private static final SubLList $list72 = list(makeKeyword("STORE"));

    private static final SubLList $list73 = list(makeSymbol("PPH-PROBLEM-STORE-POINTER-STORE"));

    private static final SubLList $list74 = list(makeSymbol("_CSETF-PPH-PROBLEM-STORE-POINTER-STORE"));

    private static final SubLSymbol PPRINT_PPH_PROBLEM_STORE_POINTER = makeSymbol("PPRINT-PPH-PROBLEM-STORE-POINTER");

    private static final SubLSymbol PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-PROBLEM-STORE-POINTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list77 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-PROBLEM-STORE-POINTER-P"));

    private static final SubLSymbol PPH_PROBLEM_STORE_POINTER_STORE = makeSymbol("PPH-PROBLEM-STORE-POINTER-STORE");

    private static final SubLSymbol _CSETF_PPH_PROBLEM_STORE_POINTER_STORE = makeSymbol("_CSETF-PPH-PROBLEM-STORE-POINTER-STORE");

    private static final SubLString $str81$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PPH_PROBLEM_STORE_POINTER = makeSymbol("MAKE-PPH-PROBLEM-STORE-POINTER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PROBLEM-STORE-POINTER-METHOD");

    private static final SubLString $str87$_PPH_PSP__S_ = makeString("<PPH-PSP ~S>");

    private static final SubLSymbol FREE_PPH_PROBLEM_STORE_POINTER = makeSymbol("FREE-PPH-PROBLEM-STORE-POINTER");

    private static final SubLString $str91$__Initial_PPH_problem_store___S__ = makeString("~&Initial PPH problem store: ~S~%");

    private static final SubLSymbol $sym92$REUSE_ = makeUninternedSymbol("REUSE?");

    private static final SubLList $list93 = list(list(makeSymbol("*FREE-PPH-PROBLEM-STORE-POINTERS*"), NIL));

    public static final SubLSymbol $pph_problem_store_pointer$ = makeSymbol("*PPH-PROBLEM-STORE-POINTER*");

    private static final SubLList $list95 = list(makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER"));

    static private final SubLList $list98 = list(list(makeSymbol("FREE-PPH-PROBLEM-STORE-POINTER"), makeSymbol("*PPH-PROBLEM-STORE-POINTER*")));

    private static final SubLSymbol FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER = makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER");

    private static final SubLString $str100$Destroying_PPH_problem_store___S_ = makeString("Destroying PPH problem store: ~S~%");

    private static final SubLString $str101$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str102$__ = makeString(") ");

    private static final SubLString $str103$New_PPH_problem_store_is_not_ok__ = makeString("New PPH problem store is not ok: ~S");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    static private final SubLList $list105 = list(list(makeSymbol("*NEW-PPH-PHRASES*"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("*NEW-PPH-PHRASE-COUNT*"), ZERO_INTEGER), list(makeSymbol("*CREATING-PERMANENT-PPH-PHRASE?*"), T));

    private static final SubLSymbol DESTROY_NEW_PPH_PHRASES = makeSymbol("DESTROY-NEW-PPH-PHRASES");

    private static final SubLSymbol DESTROYING_NEW_PPH_PHRASES_WHEN_DONE = makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");

    private static final SubLString $str110$error_while_destroying_phrase___S = makeString("error while destroying phrase: ~S");

    private static final SubLString $str111$Destroyed__S_PPH_phrases____New_o = makeString("Destroyed ~S PPH phrases.~% New object count: ~S size: ~S");

    private static final SubLList $list112 = list(list(makeSymbol("*NEW-PPH-PHRASES*"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("*NEW-PPH-PHRASE-COUNT*"), list(makeSymbol("GET-NEW-PPH-PHRASE-COUNT"))), list(makeSymbol("*DESTROY-NEW-PPH-PHRASES?*"), T));

    private static final SubLList $list113 = list(list(makeSymbol("DESTROY-NEW-PPH-PHRASES")));

    private static final SubLSymbol GET_NEW_PPH_PHRASE_COUNT = makeSymbol("GET-NEW-PPH-PHRASE-COUNT");

    static private final SubLList $list115 = list(list(makeSymbol("DESTROY?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym116$MATRIX_NEW_PPH_PHRASES = makeUninternedSymbol("MATRIX-NEW-PPH-PHRASES");

    private static final SubLSymbol $sym117$PHRASE = makeUninternedSymbol("PHRASE");

    private static final SubLList $list118 = list(makeSymbol("*NEW-PPH-PHRASES*"));

    static private final SubLList $list119 = list(makeSymbol("*NEW-PPH-PHRASE-COUNT*"), list(makeSymbol("GET-NEW-PPH-PHRASE-COUNT")));

    private static final SubLList $list120 = list(makeSymbol("*NEW-PPH-PHRASES*"), list(makeSymbol("CREATE-STACK")));

    private static final SubLList $list121 = list(NIL);

    static private final SubLList $list123 = list(makeSymbol("DESTROY-NEW-PPH-PHRASES"));

    private static final SubLSymbol DO_STACK_ELEMENTS = makeSymbol("DO-STACK-ELEMENTS");

    private static final SubLList $list126 = list(makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?"));

    private static final SubLList $list127 = list(makeSymbol("PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS"));

    private static final SubLSymbol WITHIN_NEW_PPH_DISCOURSE_CONTEXT = makeSymbol("WITHIN-NEW-PPH-DISCOURSE-CONTEXT");

    private static final SubLSymbol ENSURING_PPH_DISCOURSE_CONTEXT = makeSymbol("ENSURING-PPH-DISCOURSE-CONTEXT");

    private static final SubLList $list130 = list(list(makeSymbol("*PPH-DISCOURSE-CONTEXT*"), list(makeSymbol("NEW-PPH-DISCOURSE-CONTEXT"))));

    static private final SubLList $list131 = list(makeSymbol("HERALD-NEW-DISCOURSE-CONTEXT"));

    private static final SubLList $list132 = list(list(makeSymbol("HERALD-END-OF-DISCOURSE-CONTEXT")), list(makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT")));

    private static final SubLSymbol HERALD_NEW_DISCOURSE_CONTEXT = makeSymbol("HERALD-NEW-DISCOURSE-CONTEXT");

    private static final SubLString $str134$__Entering_WITHIN_NEW_PPH_DISCOUR = makeString("~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");

    private static final SubLSymbol HERALD_END_OF_DISCOURSE_CONTEXT = makeSymbol("HERALD-END-OF-DISCOURSE-CONTEXT");

    private static final SubLString $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS = makeString("~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");

    private static final SubLSymbol $sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_ = makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?");

    private static final SubLSymbol CLEAR_PPH_DISCOURSE_CONTEXT = makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT");

    private static final SubLList $list139 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("NEW-RMS-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym141$MATRIX_RMS = makeUninternedSymbol("MATRIX-RMS");

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLSymbol NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT = makeSymbol("NOTE-LEAVING-SHADOWED-DISCOURSE-CONTEXT");

    private static final SubLSymbol $pph_discourse_context$ = makeSymbol("*PPH-DISCOURSE-CONTEXT*");

    private static final SubLList $list147 = list(list(makeSymbol("PPH-DISCOURSE-CONTEXT-RMS")));

    private static final SubLList $list148 = list(list(makeSymbol("*PPH-DISCOURSE-CONTEXT*"), list(makeSymbol("PPH-DISCOURSE-CONTEXT-COPY"))));

    private static final SubLList $list149 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Shadowing discourse context...~%"));

    private static final SubLSymbol WITH_SHADOWED_DISCOURSE_CONTEXT = makeSymbol("WITH-SHADOWED-DISCOURSE-CONTEXT");

    private static final SubLString $str151$__Leaving__S = makeString("~&Leaving ~S");

    private static final SubLString $str152$New_RMS___S = makeString("New RMS: ~S");

    static private final SubLList $list153 = list(list(makeSymbol("SPEAKER"), makeSymbol("ADDRESSEE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $pph_speaker$ = makeSymbol("*PPH-SPEAKER*");

    private static final SubLSymbol $pph_addressee$ = makeSymbol("*PPH-ADDRESSEE*");

    static private final SubLList $list156 = list(list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("OUTPUT-LIST"), makeSymbol("&KEY"), list(makeSymbol("PARANOID-ARG"), list(QUOTE, makeSymbol("PARANOID-ARG"))), list(makeSymbol("OUTPUT-ITEM"), list(QUOTE, makeSymbol("OUTPUT-ITEM"))), list(makeSymbol("ARG-POSITION"), list(QUOTE, makeSymbol("ARG-POSITION"))), list(makeSymbol("HTML-OPEN-TAG"), list(QUOTE, makeSymbol("HTML-OPEN-TAG"))), list(makeSymbol("HTML-CLOSE-TAG"), list(QUOTE, makeSymbol("HTML-CLOSE-TAG"))), list(makeSymbol("START-CHAR-INDEX"), list(QUOTE, makeSymbol("START-CHAR-INDEX"))), list(makeSymbol("WHOLE-STRING"), list(QUOTE, makeSymbol("WHOLE-STRING"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list157 = list(makeKeyword("PARANOID-ARG"), makeKeyword("OUTPUT-ITEM"), makeKeyword("ARG-POSITION"), makeKeyword("HTML-OPEN-TAG"), makeKeyword("HTML-CLOSE-TAG"), makeKeyword("START-CHAR-INDEX"), makeKeyword("WHOLE-STRING"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol PARANOID_ARG = makeSymbol("PARANOID-ARG");

    private static final SubLSymbol OUTPUT_ITEM = makeSymbol("OUTPUT-ITEM");

    private static final SubLSymbol $HTML_OPEN_TAG = makeKeyword("HTML-OPEN-TAG");

    private static final SubLSymbol HTML_OPEN_TAG = makeSymbol("HTML-OPEN-TAG");

    private static final SubLSymbol $HTML_CLOSE_TAG = makeKeyword("HTML-CLOSE-TAG");

    private static final SubLSymbol HTML_CLOSE_TAG = makeSymbol("HTML-CLOSE-TAG");

    private static final SubLSymbol $START_CHAR_INDEX = makeKeyword("START-CHAR-INDEX");

    private static final SubLSymbol START_CHAR_INDEX = makeSymbol("START-CHAR-INDEX");

    private static final SubLSymbol WHOLE_STRING = makeSymbol("WHOLE-STRING");

    private static final SubLSymbol $sym173$ITEM = makeUninternedSymbol("ITEM");

    private static final SubLSymbol $sym174$WHOLE_HTML_STRING = makeUninternedSymbol("WHOLE-HTML-STRING");

    private static final SubLSymbol $sym175$END_CHAR_INDEX = makeUninternedSymbol("END-CHAR-INDEX");

    private static final SubLSymbol $sym176$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLList $list177 = list(makeSymbol("PPH-PHRASE-OUTPUT-LIST-P"));

    private static final SubLList $list178 = list(ZERO_INTEGER);

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_STRING = makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");

    private static final SubLList $list180 = list(T);

    private static final SubLSymbol PPH_REMOVE_HTML_TAGS = makeSymbol("PPH-REMOVE-HTML-TAGS");

    private static final SubLSymbol NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR = makeSymbol("NEW-PPH-PHRASE-OUTPUT-LIST-ITERATOR");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P = makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-EMPTY-P");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT = makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-NEXT");

    private static final SubLSymbol DO_ONE_PPH_OUTPUT_LIST_ITEM = makeSymbol("DO-ONE-PPH-OUTPUT-LIST-ITEM");

    private static final SubLSymbol DO_PPH_OUTPUT_LIST = makeSymbol("DO-PPH-OUTPUT-LIST");

    private static final SubLList $list188 = list(list(new SubLObject[]{ makeSymbol("ITEM"), makeSymbol("STRING"), makeSymbol("ARG-POSITION"), makeSymbol("HTML-OPEN-TAG"), makeSymbol("HTML-CLOSE-TAG"), makeSymbol("PARANOID-ARG"), makeSymbol("OUTPUT-ITEM"), makeSymbol("WHOLE-STRING"), makeSymbol("START-CHAR-INDEX"), makeSymbol("END-CHAR-INDEX") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PPH_MAYBE_DO_SPACE_ITEM = makeSymbol("PPH-MAYBE-DO-SPACE-ITEM");

    private static final SubLSymbol WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS = makeSymbol("WITH-PPH-REGULAR-OUTPUT-ITEM-BINDINGS");

    private static final SubLSymbol $sym191$RAW_ITEM_STRING = makeUninternedSymbol("RAW-ITEM-STRING");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_GET_STRING = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-GET-STRING");

    private static final SubLSymbol PPH_OUTPUT_LIST_FIND_START_CHAR = makeSymbol("PPH-OUTPUT-LIST-FIND-START-CHAR");

    private static final SubLSymbol $sym194$_ = makeSymbol(">");

    private static final SubLSymbol PPH_MAKE_SPACE_STRING = makeSymbol("PPH-MAKE-SPACE-STRING");

    static private final SubLList $list196 = list(list(makeSymbol("PPH-UNKNOWN-ARG-POSITION")));

    static private final SubLList $list197 = list(list(makeSymbol("PPH-EMPTY-CYCL")));

    private static final SubLSymbol NEW_PPH_PHRASE_FILLER_ITEM = makeSymbol("NEW-PPH-PHRASE-FILLER-ITEM");

    private static final SubLSymbol PPH_UPDATE_END_CHAR_INDEX = makeSymbol("PPH-UPDATE-END-CHAR-INDEX");

    private static final SubLString $str200$Adding_space_string_of_length__S = makeString("Adding space string of length ~S");

    private static final SubLList $list201 = list(list(makeSymbol("ITEM"), makeSymbol("STRING"), makeSymbol("ARG-POSITION"), makeSymbol("HTML-OPEN-TAG"), makeSymbol("HTML-CLOSE-TAG"), makeSymbol("PARANOID-ARG"), makeSymbol("OUTPUT-ITEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-ARG-POSITION");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-HTML-OPEN-TAG");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-HTML-CLOSE-TAG");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_CYCL = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-CYCL");

    private static final SubLSymbol PPH_STRING_P = makeSymbol("PPH-STRING-P");

    private static final SubLSymbol $sym207$PPH_CHAR__ = makeSymbol("PPH-CHAR-=");

    private static final SubLString $str208$Couldn_t_find__S_in__S___ = makeString("Couldn't find ~S in ~S.~%");

    static private final SubLList $list209 = list(list(makeSymbol("ITEM"), makeSymbol("JAVALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list210 = list($DONE);

    private static final SubLSymbol PPH_NJAVALIST_ITEMS = makeSymbol("PPH-NJAVALIST-ITEMS");

    static private final SubLList $list215 = list(list(makeSymbol("ANS"), makeSymbol("THRESHOLD"), makeSymbol("NOTIFICATION-FUNCTION-SPEC"), makeSymbol("&KEY"), list(makeSymbol("RETURN-STYLE"), makeKeyword("JAVALISTS"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list216 = list(makeKeyword("RETURN-STYLE"));

    static private final SubLList $list219 = list(makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*"), list(QUOTE, makeSymbol("INITIALIZE-DISAMBIGUATION-PHRASES")));

    private static final SubLList $list220 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATION-FN*"), list(QUOTE, makeSymbol("ACCUMULATE-DISAMBIGUATION-PHRASES")));

    static private final SubLList $list221 = list(makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), list(QUOTE, makeSymbol("CONSOLIDATE-DISAMBIGUATION-PHRASES")));

    private static final SubLSymbol $partial_results_notification_fn$ = makeSymbol("*PARTIAL-RESULTS-NOTIFICATION-FN*");

    private static final SubLList $list223 = list(makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), list(QUOTE, makeSymbol("FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES")));

    public static final SubLSymbol $pph_disambiguation_mode_return_style$ = makeSymbol("*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*");

    private static final SubLSymbol WITH_PARTIAL_RESULTS_ACCUMULATION = makeSymbol("WITH-PARTIAL-RESULTS-ACCUMULATION");

    private static final SubLSymbol INCREMENTAL_PPH_DISAMBIGUATION_RESULT_P = makeSymbol("INCREMENTAL-PPH-DISAMBIGUATION-RESULT-P");

    private static final SubLString $str227$Don_t_know_how_to_accumulate__S_a = makeString("Don't know how to accumulate ~S answers.");

    private static final SubLSymbol $sym228$_ = makeSymbol("<");

    static private final SubLList $list229 = list(list(makeSymbol("PROBLEM-DICTIONARY-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym230$MATRIX_PROBLEM_DICTIONARY = makeUninternedSymbol("MATRIX-PROBLEM-DICTIONARY");

    static private final SubLList $list231 = list(list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQL)));

    static private final SubLList $list232 = list(makeSymbol("*PPH-PROBLEM-REPORTS*"));

    private static final SubLList $list233 = list(makeSymbol("*PPH-PROBLEM-REPORTING-MODE*"), list(makeSymbol("FIF"), list(makeSymbol("PPH-PROBLEM-REPORTING-ON-P")), makeSymbol("*PPH-PROBLEM-REPORTING-MODE*"), makeKeyword("QUIET")));

    private static final SubLSymbol $pph_problem_reports$ = makeSymbol("*PPH-PROBLEM-REPORTS*");

    private static final SubLSymbol PPH_MERGE_PROBLEM_DICTIONARY = makeSymbol("PPH-MERGE-PROBLEM-DICTIONARY");

    private static final SubLList $list237 = list(list(makeSymbol("TIMED-OUT?"), makeSymbol("&OPTIONAL"), list(makeSymbol("DELAY-IN-SECONDS"), list(makeSymbol("PPH-TIMEOUT")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list238 = list(makeSymbol("*PPH-TIMEOUT-TIME-CHECK-COUNT*"), ZERO_INTEGER);

    public static final SubLSymbol $pph_timeout_time$ = makeSymbol("*PPH-TIMEOUT-TIME*");

    private static final SubLSymbol PPH_COMPUTE_TIMEOUT_TIME = makeSymbol("PPH-COMPUTE-TIMEOUT-TIME");

    static private final SubLList $list241 = list(list(makeSymbol("*PPH-TIMEOUT-REACHED?*"), makeSymbol("*PPH-TIMEOUT-REACHED?*")));

    static private final SubLList $list242 = list(makeSymbol("CSETQ"), makeSymbol("*PPH-TIMEOUT-REACHED?*"), list(makeSymbol("PPH-TIMEOUT-TIME-REACHED?")));

    public static final SubLSymbol $pph_timeout_reachedP$ = makeSymbol("*PPH-TIMEOUT-REACHED?*");

    private static final SubLList $list244 = list(list(makeSymbol("PPH-TIMEOUT-TIME-REACHED?")));

    private static final SubLString $str245$PPH_timeout_reached_ = makeString("PPH timeout reached.");

    private static final SubLSymbol WITH_PPH_TIMEOUT = makeSymbol("WITH-PPH-TIMEOUT");

    private static final SubLSymbol PPH_TIMEOUT = makeSymbol("PPH-TIMEOUT");

    private static final SubLSymbol $sym248$ALREADY_INITIALIZED_ = makeUninternedSymbol("ALREADY-INITIALIZED?");

    private static final SubLList $list249 = list(list(makeSymbol("INITIALIZED-P"), makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*")));

    private static final SubLSymbol $pph_unexpressed_negations$ = makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*");

    private static final SubLList $list251 = list(makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL)));

    static private final SubLList $list253 = list(list(makeSymbol("SET-EMPTY?"), makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*")));

    static private final SubLList $list254 = list(list(makeSymbol("PPH-ERROR"), ONE_INTEGER, makeString("Abandoning unexpressed negations: ~S"), makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*")));

    private static final SubLList $list255 = list(makeSymbol("GENERATION-MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $pph_language_mt$ = makeSymbol("*PPH-LANGUAGE-MT*");

    private static final SubLSymbol PPH_CANONICALIZE_HLMT = makeSymbol("PPH-CANONICALIZE-HLMT");

    private static final SubLList $list258 = list(makeSymbol("*PPH-LANGUAGE-MT*"));

    private static final SubLList $list259 = list(makeSymbol("DOMAIN-MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $pph_domain_mt$ = makeSymbol("*PPH-DOMAIN-MT*");

    static private final SubLList $list261 = list(makeSymbol("*PPH-DOMAIN-MT*"));

    static private final SubLList $list262 = list(list(makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol POSSIBLY_WITH_PPH_LANGUAGE_MT = makeSymbol("POSSIBLY-WITH-PPH-LANGUAGE-MT");

    private static final SubLSymbol POSSIBLY_WITH_PPH_DOMAIN_MT = makeSymbol("POSSIBLY-WITH-PPH-DOMAIN-MT");

    private static final SubLList $list265 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("BROADEN?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym267$BROADENED_LANGUAGE_MT = makeUninternedSymbol("BROADENED-LANGUAGE-MT");

    private static final SubLSymbol WITH_PPH_LANGUAGE_MT_RELEVANCE = makeSymbol("WITH-PPH-LANGUAGE-MT-RELEVANCE");

    static private final SubLList $list269 = list(list(makeSymbol("PPH-BROADEN-LANGUAGE-MT")));

    private static final SubLSymbol $sym270$HLMT_EQUAL_ = makeSymbol("HLMT-EQUAL?");

    private static final SubLList $list271 = list(makeSymbol("PPH-WARN"), ONE_INTEGER, makeString("Broadening *PPH-LANGUAGE-MT* to ~S"), makeSymbol("*PPH-LANGUAGE-MT*"));

    private static final SubLList $list272 = list(makeSymbol("PPH-ENHANCED-DOMAIN-MT"));

    private static final SubLList $list273 = list(list(makeSymbol("FN"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list275 = list(makeSymbol("*PPH-PHRASE-FNS*"));

    static private final SubLList $list276 = list(list(QUOTE, makeSymbol("INIT-STATE")));

    static private final SubLList $list277 = list(list(makeSymbol("OK?"), makeSymbol("OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym278$SUSPEND_ = makeUninternedSymbol("SUSPEND?");

    private static final SubLSymbol $pph_use_bulleted_listsP$ = makeSymbol("*PPH-USE-BULLETED-LISTS?*");

    private static final SubLString $str281$__Suspending_bullet_use_for____S_ = makeString("~&Suspending bullet use for~% ~S~%");

    static private final SubLList $list282 = list(list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Turning bullet use back on.~%")));

    private static final SubLList $list283 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("CUTOFF"), makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PPH_CHECK_TYPE = makeSymbol("PPH-CHECK-TYPE");

    private static final SubLList $list285 = list(makeSymbol("VALID-PPH-DEMERIT-CUTOFF-P"));

    private static final SubLSymbol $pph_demerit_cutoff$ = makeSymbol("*PPH-DEMERIT-CUTOFF*");

    private static final SubLSymbol COMPUTE_NEW_PPH_DEMERIT_CUTOFF = makeSymbol("COMPUTE-NEW-PPH-DEMERIT-CUTOFF");

    private static final SubLSymbol WITH_MAXIMUM_PPH_DEMERIT_CUTOFF = makeSymbol("WITH-MAXIMUM-PPH-DEMERIT-CUTOFF");

    static private final SubLList $list290 = list(list(makeSymbol("SECONDS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym291$OLD_GRACE_PERIOD = makeUninternedSymbol("OLD-GRACE-PERIOD");

    static private final SubLList $list292 = list(list(makeSymbol("DELAYED-PROCESSOR-GET-DELAY-SECONDS"), list(makeSymbol("PPH-PHRASE-DESTROYER"))));

    private static final SubLSymbol SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD = makeSymbol("SET-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD");

    static private final SubLList $list295 = list(list(makeSymbol("*BYPASS-PPH-PHRASE-DESTROYER?*"), NIL));

    static private final SubLList $list296 = list(list(makeSymbol("*PPH-DISPLAYED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"))), list(makeSymbol("*PPH-JUSTIFIED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET"))));

    private static final SubLList $list297 = list(list(makeSymbol("INFERENCE-ANSWER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $pph_inference_answer$ = makeSymbol("*PPH-INFERENCE-ANSWER*");

    private static final SubLSymbol WITH_PPH_INFERENCE = makeSymbol("WITH-PPH-INFERENCE");

    private static final SubLSymbol INFERENCE_ANSWER_INFERENCE = makeSymbol("INFERENCE-ANSWER-INFERENCE");

    private static final SubLList $list301 = list(list(makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $pph_hypothetical_vars$ = makeSymbol("*PPH-HYPOTHETICAL-VARS*");

    private static final SubLSymbol INFERENCE_HYPOTHETICAL_BINDINGS = makeSymbol("INFERENCE-HYPOTHETICAL-BINDINGS");

    static private final SubLList $list304 = list(makeSymbol("*PPH-HANDLE-HYPOTHETICALS?*"), T);

    private static final SubLSymbol PPH_ENHANCED_DOMAIN_MT = makeSymbol("PPH-ENHANCED-DOMAIN-MT");

    private static final SubLSymbol PPH_GET_INFERENCE_MT = makeSymbol("PPH-GET-INFERENCE-MT");

    private static final SubLSymbol WITH_PPH_INFERENCE_ANSWER = makeSymbol("WITH-PPH-INFERENCE-ANSWER");

    private static final SubLList $list308 = list(list(makeSymbol("*PPH-USE-BULLETED-LISTS?*"), T), list(makeSymbol("*PPH-REPOSITIONED-PROOFS*"), NIL), list(makeSymbol("*PPH-DISPLAYED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"))), list(makeSymbol("*PPH-JUSTIFIED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET"))), list(makeSymbol("*PPH-PROOF-DEPTH*"), ZERO_INTEGER), list(makeSymbol("*PPH-DISPLAYED-SUPPORTS*"), NIL));

    private static final SubLSymbol POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS = makeSymbol("POSSIBLY-WITH-PPH-HTML-JUSTIFICATION-GENERATION-PARAMETERS");

    private static final SubLSymbol $sym310$LINK_FUNCTION = makeUninternedSymbol("LINK-FUNCTION");

    private static final SubLSymbol $sym311$HTML_TARGET = makeUninternedSymbol("HTML-TARGET");

    private static final SubLList $list312 = list(makeSymbol("PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET"));

    private static final SubLSymbol WITH_PPH_HTML_FUNCTION_AND_TARGET = makeSymbol("WITH-PPH-HTML-FUNCTION-AND-TARGET");

    private static final SubLSymbol PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET = makeSymbol("PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET");

    private static final SubLSymbol WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS = makeSymbol("WITH-PPH-JUSTIFICATION-GENERATION-PARAMETERS");

    private static final SubLList $list316 = list(list(makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym317$VAR_TYPES_SHADOW = makeUninternedSymbol("VAR-TYPES-SHADOW");

    private static final SubLList $list318 = list(list(makeSymbol("COPY-DICTIONARY"), makeSymbol("*PPH-VAR-TYPES*")));

    static private final SubLList $list319 = list(list(makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("*PPH-NOTED-VAR-TYPES*")), makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQL), SIXTEEN_INTEGER))), list(makeSymbol("*PPH-VAR-TYPES-COUNTER*"), list(makeSymbol("1+"), makeSymbol("*PPH-VAR-TYPES-COUNTER*"))));

    static private final SubLList $list320 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%"), makeSymbol("*PPH-VAR-TYPES-COUNTER*"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("*PPH-VAR-TYPES*")));

    private static final SubLSymbol $pph_var_types$ = makeSymbol("*PPH-VAR-TYPES*");

    private static final SubLList $list322 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). "), makeSymbol("*PPH-VAR-TYPES-COUNTER*"));

    private static final SubLSymbol $sym323$PPH_PHRASE_DONE_ = makeSymbol("PPH-PHRASE-DONE?");

    private static final SubLList $list324 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~& Output list: ~S~%"), list(makeSymbol("PPH-PHRASE-OUTPUT-LIST"), makeSymbol("PHRASE")));

    private static final SubLString $str325$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    private static final SubLSymbol PPH_RESET_VAR_TYPES = makeSymbol("PPH-RESET-VAR-TYPES");

    private static final SubLList $list328 = list(list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~% Leaving *PPH-VAR-TYPES* ~S"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("*PPH-VAR-TYPES*"))));

    private static final SubLSymbol PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL = makeSymbol("PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL");

    private static final SubLSymbol $sym330$OLD_PPH_VARS = makeUninternedSymbol("OLD-PPH-VARS");

    static private final SubLList $list331 = list(makeSymbol("*PPH-VAR-TYPES*"), list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("*PPH-VAR-TYPES*")), makeSymbol("*PPH-VAR-TYPES*"), list(makeSymbol("NEW-DICTIONARY"))));

    private static final SubLList $list332 = list(list(makeSymbol("PPH-REGISTERED-VARS")));

    static private final SubLList $list333 = list(list(makeSymbol("*PPH-DIFFERENT-VARS*"), makeSymbol("*PPH-DIFFERENT-VARS*")), list(makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("*PPH-NOTED-VAR-TYPES*")), makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQL), SIXTEEN_INTEGER))), list(makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), list(makeSymbol("1+"), makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"))));

    static private final SubLList $list334 = list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%"), makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("*PPH-VAR-TYPES*")));

    private static final SubLSymbol LOCAL_VARS = makeSymbol("LOCAL-VARS");

    private static final SubLList $list337 = list(makeSymbol("PPH-REGISTERED-VARS"));

    private static final SubLList $list338 = list(list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s "), makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), list(makeSymbol("PPH-REGISTERED-VARS"))), list(makeSymbol("PPH-HANDLE-LOCAL-VARS"), makeSymbol("LOCAL-VARS")), list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&... and *pph-var-types* are now ~S~%"), list(makeSymbol("PPH-REGISTERED-VARS"))));

    private static final SubLSymbol PPH_HANDLE_LOCAL_VARS = makeSymbol("PPH-HANDLE-LOCAL-VARS");

    private static final SubLSymbol PPH_POSSIBLY_BINDING_VARIABLES = makeSymbol("PPH-POSSIBLY-BINDING-VARIABLES");

    private static final SubLString $str341$__Deregistering__S__ = makeString("~&Deregistering ~S~%");

    private static final SubLList $list342 = list(list(makeSymbol("PERSON"), makeSymbol("NUMBER"), makeSymbol("GENDER")), makeSymbol("PRONOUN-AGR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list344 = list(list(makeSymbol("AGR-CONSTRAINT"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PPH_PHRASE_AGR = makeSymbol("PPH-PHRASE-AGR");

    private static final SubLList $list346 = list(list(new SubLObject[]{ makeSymbol("TEMPLATE"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("RELN"), list(makeSymbol("ARG-POSITION-MAP"), list(makeSymbol("PPH-NEW-EMPTY-MAP"))), list(makeSymbol("INVERSE?"), list(QUOTE, makeSymbol("IGNORE-ME"))), list(makeSymbol("NL-PREDS"), makeKeyword("ANY")), makeSymbol("FOCUS-ARGNUM"), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list347 = list($RELN, makeKeyword("ARG-POSITION-MAP"), makeKeyword("INVERSE?"), makeKeyword("NL-PREDS"), makeKeyword("FOCUS-ARGNUM"), $DONE);

    private static final SubLSymbol $ARG_POSITION_MAP = makeKeyword("ARG-POSITION-MAP");

    private static final SubLSymbol $sym355$GENERATOR = makeUninternedSymbol("GENERATOR");

    private static final SubLSymbol GET_PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol("GET-PPH-PHRASE-TEMPLATE-GENERATOR");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-DONE-P");

    private static final SubLSymbol PPH_PHRASE_TEMPLATE_GENERATOR_NEXT = makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-NEXT");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");

    private static final SubLSymbol FREE_PPH_PHRASE_TEMPLATE_GENERATOR = makeSymbol("FREE-PPH-PHRASE-TEMPLATE-GENERATOR");

    private static final SubLList $list361 = list(list(makeSymbol("PPH-PHRASE"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("FOCUS-ARG"), makeSymbol("ARG-POSITION-MAP"), list(makeSymbol("NL-PREDS"), makeKeyword("ANY")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list362 = list(makeKeyword("FOCUS-ARG"), makeKeyword("ARG-POSITION-MAP"), makeKeyword("NL-PREDS"), $DONE);

    private static final SubLSymbol $sym364$PHRASE_TEMPLATE = makeUninternedSymbol("PHRASE-TEMPLATE");

    private static final SubLSymbol DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA = makeSymbol("DO-PPH-PHRASE-TEMPLATES-FOR-FORMULA");

    private static final SubLSymbol PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER = makeSymbol("PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLSymbol MAX_SUSPENDED_METHOD_DEPTH = makeSymbol("MAX-SUSPENDED-METHOD-DEPTH");

    private static final SubLSymbol HANDLING_PPH_METHOD_FAILURES = makeSymbol("HANDLING-PPH-METHOD-FAILURES");

    private static final SubLSymbol $sym370$FAILED_METHOD = makeUninternedSymbol("FAILED-METHOD");

    private static final SubLSymbol $sym371$TRIED_ONE_ = makeUninternedSymbol("TRIED-ONE?");

    private static final SubLSymbol $sym372$TOP_LEVEL_ = makeUninternedSymbol("TOP-LEVEL?");

    private static final SubLList $list373 = list(list(makeSymbol("HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P")));

    public static final SubLSymbol $suspended_paraphrase_methods$ = makeSymbol("*SUSPENDED-PARAPHRASE-METHODS*");

    private static final SubLList $list375 = list(list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("MAX-SUSPENDED-METHOD-DEPTH"))), makeSymbol("*SUSPENDED-PARAPHRASE-METHODS*"));

    private static final SubLList $list376 = list(makeSymbol("*HANDLING-PPH-METHOD-FAILURES?*"), T);

    private static final SubLSymbol NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST = makeSymbol("NOTE-SUSPENDED-PARAPHRASE-METHOD-PLIST");

    private static final SubLSymbol $PPH_METHOD_FAILURE = makeKeyword("PPH-METHOD-FAILURE");

    private static final SubLSymbol HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P = makeSymbol("HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P");

    private static final SubLString $str382$Can_t_note_PPH_method_failure__no = makeString("Can't note PPH method failure; not in failure handling mode.");

    private static final SubLString $str383$_S___is_already_suspended_ = makeString("~S~% is already suspended.");

    private static final SubLString $str384$Over__S_suspended_methods____Curr = makeString("Over ~S suspended methods.~% Current plist:~% ~S");

    private static final SubLString $str386$Cleared__S_suspended_methods_for_ = makeString("Cleared ~S suspended methods for ~S");

    private static final SubLList $list387 = list(list(makeSymbol("METHOD-SYMBOL"), makeSymbol("&OPTIONAL"), makeSymbol("OBJECT-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym388$INFO = makeUninternedSymbol("INFO");

    private static final SubLSymbol PPH_METHOD_INFO = makeSymbol("PPH-METHOD-INFO");

    private static final SubLSymbol PPH_DEREGISTER_METHOD_INFO = makeSymbol("PPH-DEREGISTER-METHOD-INFO");

    private static final SubLSymbol PPH_REGISTER_METHOD_INFO = makeSymbol("PPH-REGISTER-METHOD-INFO");

    private static final SubLList $list392 = list(makeSymbol("METHODS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $select_string_methods_to_omit$ = makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*");

    private static final SubLSymbol $sym394$SAVE_CYCL = makeUninternedSymbol("SAVE-CYCL");

    private static final SubLSymbol PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE = makeSymbol("PPH-PHRASE-RESTRICT-CYCL-TO-MT-SCOPE");

    private static final SubLSymbol PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED = makeSymbol("PPH-PHRASE-RESTORE-AND-REPHRASE-CYCL-IF-MT-SCOPED");

    private static final SubLSymbol HANDLING_PPH_MT_SCOPE = makeSymbol("HANDLING-PPH-MT-SCOPE");

    private static final SubLString $str398$Removing_MT_scope_from__S = makeString("Removing MT scope from ~S");

    private static final SubLList $list399 = list(TWO_INTEGER);

    private static final SubLString $str400$Updating_agr_preds_to__S_based_on = makeString("Updating agr-preds to ~S based on mt scope.");

    private static final SubLString $str401$New_agr_preds___S = makeString("New agr preds: ~S");

    private static final SubLString $str402$Adding_Mt_scope_paraphrases_to___ = makeString("Adding Mt scope paraphrases to~% ~S");

    private static final SubLString $str403$Couldn_t_finish_temporal_phrase__ = makeString("Couldn't finish temporal phrase:~% ~S~%");

    private static final SubLList $list404 = list(makeSymbol("TEMPORAL"), makeSymbol("ETC"));

    private static final SubLString $str405$_ = makeString(",");

    private static final SubLString $str406$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLString $str408$Result_of_adding_Mt_scope_paraphr = makeString("Result of adding Mt scope paraphrases:~% ~S");

    private static final SubLList $list409 = list(reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("Now"));



    private static final SubLList $list411 = list(reader_make_constant_shell("nonPlural-Generic"), reader_make_constant_shell("nameString"));

    private static final SubLString $$$according_to = makeString("according to");



    private static final SubLString $str415$Ignoring__S___because_it_subsumes = makeString("Ignoring ~S~% because it subsumes #$Now.");

    private static final SubLList $list416 = list(reader_make_constant_shell("prepositionStrings"), reader_make_constant_shell("adverbStrings"));

    private static final SubLSymbol $sym417$ALREADY_MEMORY_MAPPED = makeUninternedSymbol("ALREADY-MEMORY-MAPPED");

    private static final SubLList $list418 = list(list(makeSymbol("NL-GENERATION-CACHE-MEMORY-MAPPED?")));

    private static final SubLList $list419 = list(makeSymbol("ENABLE-NL-GENERATION-CACHE-MEMORY-MAPPING"));

    private static final SubLList $list420 = list(list(makeSymbol("DISABLE-NL-GENERATION-CACHE-MEMORY-MAPPING")));

    // Definitions
    /**
     *
     *
     * @return STRINGP or NIL; The mapped string for TERM, if there is one.
     */
    @LispMethod(comment = "@return STRINGP or NIL; The mapped string for TERM, if there is one.")
    public static final SubLObject pph_mapped_string_for_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.alist_lookup(pph_vars.$pph_term_paraphrase_map$.getDynamicValue(thread), v_term, symbol_function(EQUAL), UNPROVIDED);
        }
    }

    // Definitions
    /**
     *
     *
     * @return STRINGP or NIL; The mapped string for TERM, if there is one.
     */
    @LispMethod(comment = "@return STRINGP or NIL; The mapped string for TERM, if there is one.")
    public static SubLObject pph_mapped_string_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(pph_vars.$pph_term_paraphrase_map$.getDynamicValue(thread), v_term, symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     *
     *
     * @param MAPPINGS;
     * 		ALIST-P of <term> -> <string> mappings. If a term is mentioned
     * 		more than once, only the first string for it will be used.
     * 		Execute BODY with *PPH-TERM-PARAPHRASE-MAP* bound to MAPPINGS.
     */
    @LispMethod(comment = "@param MAPPINGS;\r\n\t\tALIST-P of <term> -> <string> mappings. If a term is mentioned\r\n\t\tmore than once, only the first string for it will be used.\r\n\t\tExecute BODY with *PPH-TERM-PARAPHRASE-MAP* bound to MAPPINGS.")
    public static final SubLObject with_paraphrase_mappings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mappings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            mappings = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($pph_term_paraphrase_map$, mappings)), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @param MAPPINGS;
     * 		ALIST-P of <term> -> <string> mappings. If a term is mentioned
     * 		more than once, only the first string for it will be used.
     * 		Execute BODY with *PPH-TERM-PARAPHRASE-MAP* bound to MAPPINGS.
     */
    @LispMethod(comment = "@param MAPPINGS;\r\n\t\tALIST-P of <term> -> <string> mappings. If a term is mentioned\r\n\t\tmore than once, only the first string for it will be used.\r\n\t\tExecute BODY with *PPH-TERM-PARAPHRASE-MAP* bound to MAPPINGS.")
    public static SubLObject with_paraphrase_mappings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mappings = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        mappings = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(ENFORCE_TYPE, mappings, $list3), listS(CLET, list(list($pph_term_paraphrase_map$, mappings)), append(body, NIL)));
    }

    /**
     *
     *
     * @param MAPPINGS;
     * 		ALIST-P of <term> -> <string*> mappings.
     * 		Execute BODY with *PPH-TERM-PARAPHRASE-BLACKLIST* bound to MAPPINGS.
     */
    @LispMethod(comment = "@param MAPPINGS;\r\n\t\tALIST-P of <term> -> <string*> mappings.\r\n\t\tExecute BODY with *PPH-TERM-PARAPHRASE-BLACKLIST* bound to MAPPINGS.")
    public static final SubLObject with_paraphrase_blacklist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mappings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            mappings = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, mappings, $list_alt5), listS(CLET, list(list($pph_term_paraphrase_blacklist$, mappings)), append(body, NIL)));
            }
        }
    }

    /**
     *
     *
     * @param MAPPINGS;
     * 		ALIST-P of <term> -> <string*> mappings.
     * 		Execute BODY with *PPH-TERM-PARAPHRASE-BLACKLIST* bound to MAPPINGS.
     */
    @LispMethod(comment = "@param MAPPINGS;\r\n\t\tALIST-P of <term> -> <string*> mappings.\r\n\t\tExecute BODY with *PPH-TERM-PARAPHRASE-BLACKLIST* bound to MAPPINGS.")
    public static SubLObject with_paraphrase_blacklist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mappings = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        mappings = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, mappings, $list7), listS(CLET, list(list($pph_term_paraphrase_blacklist$, mappings)), append(body, NIL)));
    }

    public static final SubLObject valid_pph_blacklistP_alt(SubLObject v_object) {
        {
            SubLObject invalidP = makeBoolean(NIL == list_utilities.alist_p(v_object));
            SubLObject rest = NIL;
            for (rest = v_object; !((NIL != invalidP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject cons = rest.first();
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject v_term = NIL;
                    SubLObject strings = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    v_term = current.first();
                    current = current.rest();
                    strings = current;
                    invalidP = makeBoolean((NIL == cycl_grammar.cycl_term_p(v_term)) || (NIL == string_utilities.list_of_string_p(strings)));
                }
            }
            return makeBoolean(NIL == invalidP);
        }
    }

    public static SubLObject valid_pph_blacklistP(final SubLObject v_object) {
        SubLObject invalidP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject v_term;
        SubLObject strings;
        for (invalidP = makeBoolean(NIL == list_utilities.alist_p(v_object)), rest = NIL, rest = v_object; (NIL == invalidP) && (NIL != rest); invalidP = makeBoolean((NIL == cycl_grammar.cycl_term_p(v_term)) || (NIL == string_utilities.list_of_string_p(strings))) , rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            v_term = NIL;
            strings = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            v_term = current.first();
            current = strings = current.rest();
        }
        return makeBoolean(NIL == invalidP);
    }

    /**
     *
     *
     * @param LEXICAL-ASSERTIONS;
     * 		LISTP of lexical assertions to not use.
     * 		Execute BODY with LEXICAL-ASSERTIONS ignored.
     */
    @LispMethod(comment = "@param LEXICAL-ASSERTIONS;\r\n\t\tLISTP of lexical assertions to not use.\r\n\t\tExecute BODY with LEXICAL-ASSERTIONS ignored.")
    public static final SubLObject with_paraphrase_lexical_assertion_blacklist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject lexical_assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            lexical_assertions = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_LIST_TYPE, lexical_assertions, $list_alt10), listS(CLET, list(list($pph_lexical_assertion_blacklist$, lexical_assertions)), append(body, NIL)));
            }
        }
    }

    /**
     *
     *
     * @param LEXICAL-ASSERTIONS;
     * 		LISTP of lexical assertions to not use.
     * 		Execute BODY with LEXICAL-ASSERTIONS ignored.
     */
    @LispMethod(comment = "@param LEXICAL-ASSERTIONS;\r\n\t\tLISTP of lexical assertions to not use.\r\n\t\tExecute BODY with LEXICAL-ASSERTIONS ignored.")
    public static SubLObject with_paraphrase_lexical_assertion_blacklist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject lexical_assertions = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        lexical_assertions = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_LIST_TYPE, lexical_assertions, $list12), listS(CLET, list(list($pph_lexical_assertion_blacklist$, lexical_assertions)), append(body, NIL)));
    }

    public static final SubLObject valid_pph_blacklist_assertionP_alt(SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static SubLObject valid_pph_blacklist_assertionP(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static final SubLObject do_pph_arg_position_map_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject from_prefix = NIL;
                    SubLObject to_prefix = NIL;
                    SubLObject map = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    from_prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    to_prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    map = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_ALIST, list(from_prefix, to_prefix, map), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_pph_arg_position_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject from_prefix = NIL;
        SubLObject to_prefix = NIL;
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        from_prefix = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        to_prefix = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        map = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALIST, list(from_prefix, to_prefix, map), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list14);
        return NIL;
    }

    public static final SubLObject remembering_pph_ambiguous_strings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt14, append(body, NIL));
        }
    }

    public static SubLObject remembering_pph_ambiguous_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list16, append(body, NIL));
    }

    /**
     * Evaluate BODY with paraphrase precision set to PRECISION.
     *
     * @param PRECISION;
     * 		T, NIL, or PPH-NESTED-ARG-LIST-P.
     */
    @LispMethod(comment = "Evaluate BODY with paraphrase precision set to PRECISION.\r\n\r\n@param PRECISION;\r\n\t\tT, NIL, or PPH-NESTED-ARG-LIST-P.")
    public static final SubLObject with_paraphrase_precision_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject precision = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            precision = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, precision, $list_alt16), listS(CLET, list(list($paraphrase_precision$, precision)), append(body, NIL)));
            }
        }
    }

    /**
     * Evaluate BODY with paraphrase precision set to PRECISION.
     *
     * @param PRECISION;
     * 		T, NIL, or PPH-NESTED-ARG-LIST-P.
     */
    @LispMethod(comment = "Evaluate BODY with paraphrase precision set to PRECISION.\r\n\r\n@param PRECISION;\r\n\t\tT, NIL, or PPH-NESTED-ARG-LIST-P.")
    public static SubLObject with_paraphrase_precision(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject precision = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        precision = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, precision, $list18), listS(CLET, list(list($paraphrase_precision$, precision)), append(body, NIL)));
    }

    /**
     * Evaluate BODY with terse paraphrase on.
     */
    @LispMethod(comment = "Evaluate BODY with terse paraphrase on.")
    public static final SubLObject with_terse_paraphrase_on_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt18, append(body, NIL));
        }
    }

    /**
     * Evaluate BODY with terse paraphrase on.
     */
    @LispMethod(comment = "Evaluate BODY with terse paraphrase on.")
    public static SubLObject with_terse_paraphrase_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list20, append(body, NIL));
    }

    /**
     * Evaluate BODY with precise paraphrase on.
     */
    @LispMethod(comment = "Evaluate BODY with precise paraphrase on.")
    public static final SubLObject with_precise_paraphrase_on_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_PARAPHRASE_PRECISION, T, bq_cons(REMEMBERING_PPH_AMBIGUOUS_STRINGS, append(body, NIL)));
        }
    }

    /**
     * Evaluate BODY with precise paraphrase on.
     */
    @LispMethod(comment = "Evaluate BODY with precise paraphrase on.")
    public static SubLObject with_precise_paraphrase_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_PARAPHRASE_PRECISION, T, bq_cons(REMEMBERING_PPH_AMBIGUOUS_STRINGS, append(body, NIL)));
    }

    /**
     * Evaluate BODY with precise paraphrase off
     */
    @LispMethod(comment = "Evaluate BODY with precise paraphrase off")
    public static final SubLObject with_precise_paraphrase_off_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_PARAPHRASE_PRECISION, NIL, append(body, NIL));
        }
    }

    /**
     * Evaluate BODY with precise paraphrase off
     */
    @LispMethod(comment = "Evaluate BODY with precise paraphrase off")
    public static SubLObject with_precise_paraphrase_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_PARAPHRASE_PRECISION, NIL, append(body, NIL));
    }

    /**
     * Evaluate BODY with precise paraphrase for the args corresponding to NESTED-ARG-LIST.
     *
     * @param NESTED-ARG-LIST;
    PPH-NESTED-ARG-LISTP.
     * 		
     */
    @LispMethod(comment = "Evaluate BODY with precise paraphrase for the args corresponding to NESTED-ARG-LIST.\r\n\r\n@param NESTED-ARG-LIST;\nPPH-NESTED-ARG-LISTP.")
    public static final SubLObject with_precise_paraphrase_for_args_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject nested_arg_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            nested_arg_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, nested_arg_list, $list_alt22), listS(WITH_PARAPHRASE_PRECISION, nested_arg_list, append(body, NIL)));
            }
        }
    }

    /**
     * Evaluate BODY with precise paraphrase for the args corresponding to NESTED-ARG-LIST.
     *
     * @param NESTED-ARG-LIST;
    		PPH-NESTED-ARG-LISTP.
     * 		
     */
    @LispMethod(comment = "Evaluate BODY with precise paraphrase for the args corresponding to NESTED-ARG-LIST.\r\n\r\n@param NESTED-ARG-LIST;\n\t\tPPH-NESTED-ARG-LISTP.")
    public static SubLObject with_precise_paraphrase_for_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject nested_arg_list = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        nested_arg_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, nested_arg_list, $list24), listS(WITH_PARAPHRASE_PRECISION, nested_arg_list, append(body, NIL)));
    }

    public static SubLObject with_definite_descriptions_licensed_for_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject terms = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        terms = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($definite_description_licensed_terms$, list(APPEND, $definite_description_licensed_terms$, terms))), append(body, NIL));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a list of either integers or PPH-NESTED-ARG-LIST-P objects?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a list of either integers or PPH-NESTED-ARG-LIST-P objects?")
    public static final SubLObject pph_nested_arg_list_p_alt(SubLObject obj) {
        if (NIL == obj) {
            return T;
        } else {
            if (NIL == list_utilities.proper_list_p(obj)) {
                return NIL;
            } else {
                if (NIL != subl_promotions.memberP(NIL, obj, UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                } else {
                    {
                        SubLObject csome_list_var = obj;
                        SubLObject item = NIL;
                        for (item = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                            if (item.isInteger() && item.isNegative()) {
                                return NIL;
                            } else {
                                if (!(item.isInteger() || (NIL != pph_nested_arg_list_p(item)))) {
                                    return NIL;
                                }
                            }
                        }
                    }
                    return T;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a list of either integers or PPH-NESTED-ARG-LIST-P objects?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a list of either integers or PPH-NESTED-ARG-LIST-P objects?")
    public static SubLObject pph_nested_arg_list_p(final SubLObject obj) {
        if (NIL == obj) {
            return T;
        }
        if (NIL == list_utilities.proper_list_p(obj)) {
            return NIL;
        }
        if (NIL != subl_promotions.memberP(NIL, obj, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject csome_list_var = obj;
        SubLObject item = NIL;
        item = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (item.isInteger() && item.isNegative()) {
                return NIL;
            }
            if ((!item.isInteger()) && (NIL == pph_nested_arg_list_p(item))) {
                return NIL;
            }
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
        } 
        return T;
    }

    /**
     * Within BODY, link as much of paraphrase strings as possible to input CycL.
     * The tradeoff for this is typically terseness and readability.
     */
    @LispMethod(comment = "Within BODY, link as much of paraphrase strings as possible to input CycL.\r\nThe tradeoff for this is typically terseness and readability.\nWithin BODY, link as much of paraphrase strings as possible to input CycL.\nThe tradeoff for this is typically terseness and readability.")
    public static final SubLObject maximizing_pph_links_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt23, append(body, NIL));
        }
    }

    /**
     * Within BODY, link as much of paraphrase strings as possible to input CycL.
     * The tradeoff for this is typically terseness and readability.
     */
    @LispMethod(comment = "Within BODY, link as much of paraphrase strings as possible to input CycL.\r\nThe tradeoff for this is typically terseness and readability.\nWithin BODY, link as much of paraphrase strings as possible to input CycL.\nThe tradeoff for this is typically terseness and readability.")
    public static SubLObject maximizing_pph_links(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list28, append(body, NIL));
    }

    public static final SubLObject pph_possibly_binding_current_arg0_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arg0 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    arg0 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($sym25$_PPH_CURRENT_ARG0_, listS(FIF, list($sym27$PPH_OK_ARG0_FOR_LINKING_, arg0), arg0, $list_alt28))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt24);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject pph_possibly_binding_current_arg0(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg0 = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        arg0 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($sym30$_PPH_CURRENT_ARG0_, listS(FIF, list($sym32$PPH_OK_ARG0_FOR_LINKING_, arg0), arg0, $list33))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static final SubLObject pph_ok_arg0_for_linkingP_alt(SubLObject arg0) {
        return makeBoolean(NIL == fort_types_interface.logical_connective_p(arg0));
    }

    public static SubLObject pph_ok_arg0_for_linkingP(final SubLObject arg0) {
        return makeBoolean(NIL == fort_types_interface.logical_connective_p(arg0));
    }

    /**
     * Execute BODY using FUNCTION and TARGET for the HTML links. If either is nil, default
     * will be used.
     */
    @LispMethod(comment = "Execute BODY using FUNCTION and TARGET for the HTML links. If either is nil, default\r\nwill be used.\nExecute BODY using FUNCTION and TARGET for the HTML links. If either is nil, default\nwill be used.")
    public static final SubLObject with_pph_html_function_and_target_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject function = NIL;
                    SubLObject target = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    function = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    target = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($constant_link_function$, listS(FIRST_OF, function, $list_alt33)), list($html_generation_target$, listS(FIRST_OF, target, $list_alt35))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY using FUNCTION and TARGET for the HTML links. If either is nil, default
     * will be used.
     */
    @LispMethod(comment = "Execute BODY using FUNCTION and TARGET for the HTML links. If either is nil, default\r\nwill be used.\nExecute BODY using FUNCTION and TARGET for the HTML links. If either is nil, default\nwill be used.")
    public static SubLObject with_pph_html_function_and_target(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($constant_link_function$, listS(FIRST_OF, function, $list38)), list($html_generation_target$, listS(FIRST_OF, target, $list40))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    /**
     * Execute BODY using FUNCTION-SPEC to generate term-ids.
     */
    @LispMethod(comment = "Execute BODY using FUNCTION-SPEC to generate term-ids.")
    public static final SubLObject with_pph_html_term_id_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject function_spec = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt36);
                    function_spec = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($html_generation_term_id_function$, function_spec)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt36);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY using FUNCTION-SPEC to generate term-ids.
     */
    @LispMethod(comment = "Execute BODY using FUNCTION-SPEC to generate term-ids.")
    public static SubLObject with_pph_html_term_id_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        function_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($html_generation_term_id_function$, function_spec)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list41);
        return NIL;
    }

    /**
     * For HTML generation, omit hyperlinks, but generate formatting codes, etc.
     */
    @LispMethod(comment = "For HTML generation, omit hyperlinks, but generate formatting codes, etc.")
    public static final SubLObject omitting_hyperlinks_in_pph_html_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt38, append(body, NIL));
        }
    }

    /**
     * For HTML generation, omit hyperlinks, but generate formatting codes, etc.
     */
    @LispMethod(comment = "For HTML generation, omit hyperlinks, but generate formatting codes, etc.")
    public static SubLObject omitting_hyperlinks_in_pph_html_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list43, append(body, NIL));
    }

    /**
     * For text generation, allow HTML entities.
     */
    @LispMethod(comment = "For text generation, allow HTML entities.")
    public static final SubLObject allowing_utf8_in_pph_text_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt39, append(body, NIL));
        }
    }

    /**
     * For text generation, allow HTML entities.
     */
    @LispMethod(comment = "For text generation, allow HTML entities.")
    public static SubLObject allowing_utf8_in_pph_text_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list44, append(body, NIL));
    }

    /**
     * Turn off linking of unlinked phrases to the matrix arg0 during BODY if FORM is non-NIL.
     */
    @LispMethod(comment = "Turn off linking of unlinked phrases to the matrix arg0 during BODY if FORM is non-NIL.")
    public static final SubLObject dont_link_unlinked_phrases_to_matrix_arg_if_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            form = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sym41$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__, list(CAND, $list_alt43, list(CNOT, form)))), append(body, NIL));
            }
        }
    }

    /**
     * Turn off linking of unlinked phrases to the matrix arg0 during BODY if FORM is non-NIL.
     */
    @LispMethod(comment = "Turn off linking of unlinked phrases to the matrix arg0 during BODY if FORM is non-NIL.")
    public static SubLObject dont_link_unlinked_phrases_to_matrix_arg_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        form = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__, list(CAND, $list48, list(CNOT, form)))), append(body, NIL));
    }

    /**
     * Execute BODY using the memoization state associated with the outermost
     * use of this macro. Memoized paraphrase functions will not be cleared inside this macro.
     */
    @LispMethod(comment = "Execute BODY using the memoization state associated with the outermost\r\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.\nExecute BODY using the memoization state associated with the outermost\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.")
    public static final SubLObject with_pph_memoization_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject new_or_reused = $sym45$NEW_OR_REUSED;
            return list(WITH_PPH_PROBLEM_STORE, list(CMULTIPLE_VALUE_BIND, list($pph_memoization_state$, new_or_reused), $list_alt49, list(CLET, $list_alt50, listS(WITH_MEMOIZATION_STATE, $list_alt52, append(body, NIL))), listS(PWHEN, listS(CAND, listS(EQ, new_or_reused, $list_alt54), $list_alt55), $list_alt56)));
        }
    }

    /**
     * Execute BODY using the memoization state associated with the outermost
     * use of this macro. Memoized paraphrase functions will not be cleared inside this macro.
     */
    @LispMethod(comment = "Execute BODY using the memoization state associated with the outermost\r\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.\nExecute BODY using the memoization state associated with the outermost\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.")
    public static SubLObject with_pph_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject new_or_reused = $sym50$NEW_OR_REUSED;
        return list(WITH_PPH_PROBLEM_STORE, list(CMULTIPLE_VALUE_BIND, list($pph_memoization_state$, new_or_reused), $list54, list(CLET, $list55, listS(WITH_MEMOIZATION_STATE, $list57, append(body, NIL))), listS(PWHEN, listS(CAND, listS(EQ, new_or_reused, $list59), $list60), $list61)));
    }

    /**
     * Execute BODY using the memoization state associated with the memoization state from
     * outside the outermost use of WITH-PPH-MEMOIZATION. Memoized functions inside BODY will
     * not be memoized in *PPH-MEMOIZATION-STATE*, but in whatever memoization state they
     * would have been otherwise.
     */
    @LispMethod(comment = "Execute BODY using the memoization state associated with the memoization state from\r\noutside the outermost use of WITH-PPH-MEMOIZATION. Memoized functions inside BODY will\r\nnot be memoized in *PPH-MEMOIZATION-STATE*, but in whatever memoization state they\r\nwould have been otherwise.\nExecute BODY using the memoization state associated with the memoization state from\noutside the outermost use of WITH-PPH-MEMOIZATION. Memoized functions inside BODY will\nnot be memoized in *PPH-MEMOIZATION-STATE*, but in whatever memoization state they\nwould have been otherwise.")
    public static final SubLObject with_pph_external_memoization_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_MEMOIZATION_STATE, $list_alt57, append(body, NIL));
        }
    }

    /**
     * Execute BODY using the memoization state associated with the memoization state from
     * outside the outermost use of WITH-PPH-MEMOIZATION. Memoized functions inside BODY will
     * not be memoized in *PPH-MEMOIZATION-STATE*, but in whatever memoization state they
     * would have been otherwise.
     */
    @LispMethod(comment = "Execute BODY using the memoization state associated with the memoization state from\r\noutside the outermost use of WITH-PPH-MEMOIZATION. Memoized functions inside BODY will\r\nnot be memoized in *PPH-MEMOIZATION-STATE*, but in whatever memoization state they\r\nwould have been otherwise.\nExecute BODY using the memoization state associated with the memoization state from\noutside the outermost use of WITH-PPH-MEMOIZATION. Memoized functions inside BODY will\nnot be memoized in *PPH-MEMOIZATION-STATE*, but in whatever memoization state they\nwould have been otherwise.")
    public static SubLObject with_pph_external_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MEMOIZATION_STATE, $list62, append(body, NIL));
    }

    public static final SubLObject find_or_create_pph_memoization_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != memoization_state.memoization_state_p($pph_memoization_state$.getDynamicValue(thread))) {
                return values($pph_memoization_state$.getDynamicValue(thread), $REUSED);
            } else {
                return values(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $NEW);
            }
        }
    }

    public static SubLObject find_or_create_pph_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != memoization_state.memoization_state_p($pph_memoization_state$.getDynamicValue(thread))) {
            return values($pph_memoization_state$.getDynamicValue(thread), $REUSED);
        }
        return values(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $NEW);
    }

    public static final SubLObject find_or_create_pph_external_memoization_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != misc_utilities.uninitialized_p($pph_external_memoization_state$.getDynamicValue(thread)) ? ((SubLObject) (values(memoization_state.current_memoization_state(), $NEW))) : values($pph_external_memoization_state$.getDynamicValue(thread), $REUSED);
        }
    }

    public static SubLObject find_or_create_pph_external_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.uninitialized_p($pph_external_memoization_state$.getDynamicValue(thread)) ? values(memoization_state.current_memoization_state(), $NEW) : values($pph_external_memoization_state$.getDynamicValue(thread), $REUSED);
    }

    public static final SubLObject pph_problem_store_pointer_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_pph_problem_store_pointer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_problem_store_pointer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_problem_store_pointer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject pph_problem_store_pointer_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject pph_problem_store_pointer_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer_native.class ? T : NIL;
    }

    public static final SubLObject pph_problem_store_pointer_store_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_PROBLEM_STORE_POINTER_P);
        return v_object.getField2();
    }

    public static SubLObject pph_problem_store_pointer_store(final SubLObject v_object) {
        assert NIL != pph_problem_store_pointer_p(v_object) : "! pph_macros.pph_problem_store_pointer_p(v_object) " + "pph_macros.pph_problem_store_pointer_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_pph_problem_store_pointer_store_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_PROBLEM_STORE_POINTER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_problem_store_pointer_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_problem_store_pointer_p(v_object) : "! pph_macros.pph_problem_store_pointer_p(v_object) " + "pph_macros.pph_problem_store_pointer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_pph_problem_store_pointer_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STORE)) {
                        _csetf_pph_problem_store_pointer_store(v_new, current_value);
                    } else {
                        Errors.error($str_alt75$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_pph_problem_store_pointer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STORE)) {
                _csetf_pph_problem_store_pointer_store(v_new, current_value);
            } else {
                Errors.error($str81$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_problem_store_pointer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_PROBLEM_STORE_POINTER, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STORE, pph_problem_store_pointer_store(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_PROBLEM_STORE_POINTER, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_problem_store_pointer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_problem_store_pointer(obj, visitor_fn);
    }

    public static final SubLObject pprint_pph_problem_store_pointer_alt(SubLObject pointer, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt76$_PPH_PSP__S_, pph_problem_store_pointer_store(pointer));
        return NIL;
    }

    public static SubLObject pprint_pph_problem_store_pointer(final SubLObject pointer, final SubLObject stream, final SubLObject depth) {
        format(stream, $str87$_PPH_PSP__S_, pph_problem_store_pointer_store(pointer));
        return NIL;
    }

    public static SubLObject pph_maybe_destroy_problem_store(final SubLObject problem_store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$1);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        inference = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                                return NIL;
                            }
                        }
                    }
                }
                final SubLObject idx_$2 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            inference2 = getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_inference.inference_browsableP(inference2)) {
                                return NIL;
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        return T;
    }

    public static final SubLObject free_pph_problem_store_pointer_alt(SubLObject pointer) {
        SubLTrampolineFile.checkType(pointer, PPH_PROBLEM_STORE_POINTER_P);
        if (NIL != problem_store_p(pph_problem_store_pointer_store(pointer))) {
            destroy_problem_store(pph_problem_store_pointer_store(pointer));
        }
        pph_problem_store_pointer_set_store(pointer, $FREE);
        $free_pph_problem_store_pointers$.setGlobalValue(cons(pointer, $free_pph_problem_store_pointers$.getGlobalValue()));
        return $FREE;
    }

    public static SubLObject free_pph_problem_store_pointer(final SubLObject pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_problem_store_pointer_p(pointer)) {
            assert NIL != pph_problem_store_pointer_p(pointer) : "! pph_macros.pph_problem_store_pointer_p(pointer) " + ("pph_macros.pph_problem_store_pointer_p(pointer) " + "CommonSymbols.NIL != pph_macros.pph_problem_store_pointer_p(pointer) ") + pointer;
            if (NIL != inference_datastructures_problem_store.problem_store_p(pph_problem_store_pointer_store(pointer))) {
                pph_maybe_destroy_problem_store(pph_problem_store_pointer_store(pointer));
            }
            pph_problem_store_pointer_set_store(pointer, $FREE);
            $free_pph_problem_store_pointers$.setDynamicValue(cons(pointer, $free_pph_problem_store_pointers$.getDynamicValue(thread)), thread);
        }
        return $FREE;
    }

    public static final SubLObject pph_problem_store_pointer_set_store_alt(SubLObject pointer, SubLObject store) {
        SubLTrampolineFile.checkType(pointer, PPH_PROBLEM_STORE_POINTER_P);
        _csetf_pph_problem_store_pointer_store(pointer, store);
        return store;
    }

    public static SubLObject pph_problem_store_pointer_set_store(final SubLObject pointer, final SubLObject store) {
        assert NIL != pph_problem_store_pointer_p(pointer) : "! pph_macros.pph_problem_store_pointer_p(pointer) " + ("pph_macros.pph_problem_store_pointer_p(pointer) " + "CommonSymbols.NIL != pph_macros.pph_problem_store_pointer_p(pointer) ") + pointer;
        _csetf_pph_problem_store_pointer_store(pointer, store);
        return store;
    }

    public static final SubLObject new_problem_store_pointer_alt() {
        {
            SubLObject pointer = NIL;
            if (NIL != $free_pph_problem_store_pointers$.getGlobalValue()) {
                {
                    SubLObject datum_evaluated_var = $free_pph_problem_store_pointers$.getGlobalValue();
                    pointer = datum_evaluated_var.first();
                    $free_pph_problem_store_pointers$.setGlobalValue(datum_evaluated_var.rest());
                }
            } else {
                pointer = make_pph_problem_store_pointer(UNPROVIDED);
            }
            return pointer;
        }
    }

    public static SubLObject new_problem_store_pointer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pointer = NIL;
        if (NIL != list_utilities.non_empty_list_p($free_pph_problem_store_pointers$.getDynamicValue(thread))) {
            final SubLObject datum_evaluated_var = $free_pph_problem_store_pointers$.getDynamicValue(thread);
            pointer = datum_evaluated_var.first();
            $free_pph_problem_store_pointers$.setDynamicValue(datum_evaluated_var.rest(), thread);
        } else {
            pointer = make_pph_problem_store_pointer(UNPROVIDED);
        }
        return pointer;
    }

    public static final SubLObject replace_pph_problem_store_pointer_store_alt(SubLObject pointer) {
        SubLTrampolineFile.checkType(pointer, PPH_PROBLEM_STORE_POINTER_P);
        {
            SubLObject old_store = pph_problem_store_pointer_store(pointer);
            SubLObject new_store = new_problem_store(UNPROVIDED);
            if (NIL != problem_store_p(old_store)) {
                destroy_problem_store(old_store);
            }
            pph_problem_store_pointer_set_store(pointer, new_store);
        }
        return pointer;
    }

    public static SubLObject replace_pph_problem_store_pointer_store(final SubLObject pointer) {
        assert NIL != pph_problem_store_pointer_p(pointer) : "! pph_macros.pph_problem_store_pointer_p(pointer) " + ("pph_macros.pph_problem_store_pointer_p(pointer) " + "CommonSymbols.NIL != pph_macros.pph_problem_store_pointer_p(pointer) ") + pointer;
        final SubLObject old_store = pph_problem_store_pointer_store(pointer);
        final SubLObject new_store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
        if (NIL != inference_datastructures_problem_store.problem_store_p(old_store)) {
            inference_datastructures_problem_store.destroy_problem_store(old_store);
        }
        pph_problem_store_pointer_set_store(pointer, new_store);
        return pointer;
    }

    public static final SubLObject pph_problem_store_alt(SubLObject create_if_freeP) {
        if (create_if_freeP == UNPROVIDED) {
            create_if_freeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pointer = $pph_problem_store_pointer$.getDynamicValue(thread);
                SubLObject store = NIL;
                if (NIL != pph_problem_store_pointer_p(pointer)) {
                    store = pph_problem_store_pointer_store(pointer);
                    if (($FREE == store) && (NIL != create_if_freeP)) {
                        replace_pph_problem_store_pointer_store(pointer);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt79$__Initial_PPH_problem_store___S__, pph_problem_store_pointer_store(pointer));
                        }
                        store = pph_problem_store_pointer_store(pointer);
                    }
                }
                return NIL != store ? ((SubLObject) (store)) : NIL;
            }
        }
    }

    public static SubLObject pph_problem_store(SubLObject create_if_freeP) {
        if (create_if_freeP == UNPROVIDED) {
            create_if_freeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pointer = $pph_problem_store_pointer$.getDynamicValue(thread);
        SubLObject store = NIL;
        if (NIL != pph_problem_store_pointer_p(pointer)) {
            store = pph_problem_store_pointer_store(pointer);
            if (($FREE == store) && (NIL != create_if_freeP)) {
                replace_pph_problem_store_pointer_store(pointer);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str91$__Initial_PPH_problem_store___S__, pph_problem_store_pointer_store(pointer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                store = pph_problem_store_pointer_store(pointer);
            }
        }
        return NIL != store ? store : NIL;
    }

    public static final SubLObject with_pph_problem_store_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject reuseP = $sym80$REUSE_;
            return list(CMULTIPLE_VALUE_BIND, list($pph_problem_store_pointer$, reuseP), $list_alt82, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, reuseP, $list_alt85)));
        }
    }

    public static SubLObject with_pph_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reuseP = $sym92$REUSE_;
        return list(CLET, $list93, list(CMULTIPLE_VALUE_BIND, list($pph_problem_store_pointer$, reuseP), $list95, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, reuseP, $list98))));
    }

    public static final SubLObject find_or_create_pph_problem_store_pointer_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == pph_problem_store_pointer_p($pph_problem_store_pointer$.getDynamicValue(thread))) {
                {
                    SubLObject new_problem_store_pointer = new_problem_store_pointer();
                    return values(new_problem_store_pointer, NIL);
                }
            } else {
                if (NIL == pph_problem_store_okP()) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt87$Destroying_PPH_problem_store___S_, pph_problem_store(UNPROVIDED));
                    }
                    replace_pph_problem_store_pointer_store($pph_problem_store_pointer$.getDynamicValue(thread));
                    if (NIL == pph_problem_store_okP()) {
                        {
                            SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt90$New_PPH_problem_store_is_not_ok__) });
                            pph_error.pph_handle_error(new_format_string, list(pph_problem_store(UNPROVIDED)));
                        }
                    }
                    return values($pph_problem_store_pointer$.getDynamicValue(thread), T);
                } else {
                    return values($pph_problem_store_pointer$.getDynamicValue(thread), T);
                }
            }
        }
    }

    public static SubLObject find_or_create_pph_problem_store_pointer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_problem_store_pointer_p($pph_problem_store_pointer$.getDynamicValue(thread))) {
            final SubLObject new_problem_store_pointer = new_problem_store_pointer();
            return values(new_problem_store_pointer, NIL);
        }
        if (NIL == pph_problem_store_okP()) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str100$Destroying_PPH_problem_store___S_, pph_problem_store(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            replace_pph_problem_store_pointer_store($pph_problem_store_pointer$.getDynamicValue(thread));
            if (NIL == pph_problem_store_okP()) {
                final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str102$__, format_nil.format_nil_a_no_copy($str103$New_PPH_problem_store_is_not_ok__) });
                pph_error.pph_handle_error(new_format_string, list(pph_problem_store(UNPROVIDED)));
            }
            return values($pph_problem_store_pointer$.getDynamicValue(thread), T);
        }
        return values($pph_problem_store_pointer$.getDynamicValue(thread), T);
    }

    public static final SubLObject pph_problem_store_okP_alt() {
        {
            SubLObject store = pph_problem_store(UNPROVIDED);
            return makeBoolean(($FREE == store) || ((NIL != valid_problem_store_p(store)) && (NIL != pph_problem_store_size_okP(store))));
        }
    }

    public static SubLObject pph_problem_store_okP() {
        final SubLObject store = pph_problem_store(UNPROVIDED);
        return makeBoolean(($FREE == store) || ((NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) && (NIL != pph_problem_store_size_okP(store))));
    }

    public static final SubLObject pph_problem_store_size_okP_alt(SubLObject store) {
        return numL(problem_store_size(store), $int$100000);
    }

    public static SubLObject pph_problem_store_size_okP(final SubLObject store) {
        return numL(inference_datastructures_problem_store.problem_store_size(store), $int$100000);
    }

    public static final SubLObject creating_permanent_pph_phrases_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt92, append(body, NIL));
        }
    }

    public static SubLObject creating_permanent_pph_phrases(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list105, append(body, NIL));
    }

    public static final SubLObject note_new_pph_phrase_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            stacks.stack_push(phrase, $new_pph_phrases$.getDynamicValue(thread));
            $new_pph_phrase_count$.setDynamicValue(add($new_pph_phrase_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            return $NOTED;
        }
    }

    public static SubLObject note_new_pph_phrase(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        stacks.stack_push(phrase, $new_pph_phrases$.getDynamicValue(thread));
        $new_pph_phrase_count$.setDynamicValue(add($new_pph_phrase_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        return $NOTED;
    }

    public static final SubLObject new_pph_phrase_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != subl_promotions.non_negative_integer_p($new_pph_phrase_count$.getDynamicValue(thread)) ? ((SubLObject) ($new_pph_phrase_count$.getDynamicValue(thread))) : ZERO_INTEGER;
        }
    }

    public static SubLObject new_pph_phrase_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != subl_promotions.non_negative_integer_p($new_pph_phrase_count$.getDynamicValue(thread)) ? $new_pph_phrase_count$.getDynamicValue(thread) : ZERO_INTEGER;
    }

    public static final SubLObject destroy_new_pph_phrases_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                while (NIL == stacks.stack_empty_p($new_pph_phrases$.getDynamicValue(thread))) {
                    {
                        SubLObject _prev_bind_0 = $inside_destroy_new_pph_phrasesP$.currentBinding(thread);
                        try {
                            $inside_destroy_new_pph_phrasesP$.bind(T, thread);
                            {
                                SubLObject phrase = stacks.stack_peek($new_pph_phrases$.getDynamicValue(thread));
                                if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
                                    pph_phrase.destroy_pph_phrase(phrase, UNPROVIDED);
                                    count = add(count, ONE_INTEGER);
                                }
                                stacks.stack_pop($new_pph_phrases$.getDynamicValue(thread));
                            }
                        } finally {
                            $inside_destroy_new_pph_phrasesP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } 
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt96$Destroyed__S_PPH_phrases____New_o, new SubLObject[]{ count, pph_data_structures.pph_phrase_id_index_new_objects_count(), pph_data_structures.pph_phrase_id_index_new_objects_size() });
                }
                return count;
            }
        }
    }

    public static SubLObject destroy_new_pph_phrases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        while (NIL == stacks.stack_empty_p($new_pph_phrases$.getDynamicValue(thread))) {
            final SubLObject _prev_bind_0 = $inside_destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                $inside_destroy_new_pph_phrasesP$.bind(T, thread);
                final SubLObject phrase = stacks.stack_peek($new_pph_phrases$.getDynamicValue(thread));
                if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
                    SubLObject err = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                pph_phrase.destroy_pph_phrase(phrase, UNPROVIDED);
                                count = add(count, ONE_INTEGER);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (((NIL != err) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str110$error_while_destroying_phrase___S, err);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                }
                stacks.stack_pop($new_pph_phrases$.getDynamicValue(thread));
            } finally {
                $inside_destroy_new_pph_phrasesP$.rebind(_prev_bind_0, thread);
            }
        } 
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str111$Destroyed__S_PPH_phrases____New_o, count, pph_data_structures.pph_phrase_id_index_new_objects_count(), pph_data_structures.pph_phrase_id_index_new_objects_size(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return count;
    }

    /**
     * Execute BODY, then destroy any PPH phrases created during the execution of BODY.
     */
    @LispMethod(comment = "Execute BODY, then destroy any PPH phrases created during the execution of BODY.")
    public static final SubLObject destroying_new_pph_phrases_when_done_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt97, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list_alt98));
        }
    }

    /**
     * Execute BODY, then destroy any PPH phrases created during the execution of BODY.
     */
    @LispMethod(comment = "Execute BODY, then destroy any PPH phrases created during the execution of BODY.")
    public static SubLObject destroying_new_pph_phrases_when_done(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list112, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list113));
    }

    public static final SubLObject get_new_pph_phrase_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != misc_utilities.initialized_p($new_pph_phrase_count$.getDynamicValue(thread)) ? ((SubLObject) ($new_pph_phrase_count$.getDynamicValue(thread))) : ZERO_INTEGER;
        }
    }

    public static SubLObject get_new_pph_phrase_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p($new_pph_phrase_count$.getDynamicValue(thread)) ? $new_pph_phrase_count$.getDynamicValue(thread) : ZERO_INTEGER;
    }

    /**
     * Execute BODY, then destroy any PPH phrases created during the execution of BODY
     * if DESTROY? is non-NIL after the execution of BODY.
     */
    @LispMethod(comment = "Execute BODY, then destroy any PPH phrases created during the execution of BODY\r\nif DESTROY? is non-NIL after the execution of BODY.\nExecute BODY, then destroy any PPH phrases created during the execution of BODY\nif DESTROY? is non-NIL after the execution of BODY.")
    public static final SubLObject possibly_destroying_new_pph_phrases_when_done_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject destroyP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    destroyP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject matrix_new_pph_phrases = $sym101$MATRIX_NEW_PPH_PHRASES;
                            SubLObject phrase = $sym102$PHRASE;
                            return list(CLET, list(bq_cons(matrix_new_pph_phrases, $list_alt103), $list_alt104, bq_cons(destroyP, $list_alt105)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(PIF, destroyP, $list_alt107, list(DO_STACK_ELEMENTS, bq_cons(phrase, $list_alt103), list(STACK_PUSH, phrase, matrix_new_pph_phrases)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt100);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY, then destroy any PPH phrases created during the execution of BODY
     * if DESTROY? is non-NIL after the execution of BODY.
     */
    @LispMethod(comment = "Execute BODY, then destroy any PPH phrases created during the execution of BODY\r\nif DESTROY? is non-NIL after the execution of BODY.\nExecute BODY, then destroy any PPH phrases created during the execution of BODY\nif DESTROY? is non-NIL after the execution of BODY.")
    public static SubLObject possibly_destroying_new_pph_phrases_when_done(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject destroyP = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        destroyP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject matrix_new_pph_phrases = $sym116$MATRIX_NEW_PPH_PHRASES;
            final SubLObject phrase = $sym117$PHRASE;
            return list(CLET, list(bq_cons(matrix_new_pph_phrases, $list118), $list119, $list120, bq_cons(destroyP, $list121)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(PIF, destroyP, $list123, list(DO_STACK_ELEMENTS, bq_cons(phrase, $list118), list(STACK_PUSH, phrase, matrix_new_pph_phrases)))));
        }
        cdestructuring_bind_error(datum, $list115);
        return NIL;
    }

    /**
     * Make sure *PPH-DISCOURSE-CONTEXT* is initialized appropriately.
     */
    @LispMethod(comment = "Make sure *PPH-DISCOURSE-CONTEXT* is initialized appropriately.")
    public static final SubLObject ensuring_pph_discourse_context_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(PROGN, list(PIF, $list_alt110, listS(PROGN, $list_alt111, append(body, NIL)), bq_cons(WITHIN_NEW_PPH_DISCOURSE_CONTEXT, append(body, NIL))));
        }
    }

    /**
     * Make sure *PPH-DISCOURSE-CONTEXT* is initialized appropriately.
     */
    @LispMethod(comment = "Make sure *PPH-DISCOURSE-CONTEXT* is initialized appropriately.")
    public static SubLObject ensuring_pph_discourse_context(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, list(PIF, $list126, listS(PROGN, $list127, append(body, NIL)), bq_cons(WITHIN_NEW_PPH_DISCOURSE_CONTEXT, append(body, NIL))));
    }

    /**
     * Initialize and de-initialize *PPH-DISCOURSE-CONTEXT* appropriately.
     */
    @LispMethod(comment = "Initialize and de-initialize *PPH-DISCOURSE-CONTEXT* appropriately.")
    public static final SubLObject within_new_pph_discourse_context_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt114, $list_alt115, listS(CUNWIND_PROTECT, listS(PROGN, $list_alt111, append(body, NIL)), $list_alt116));
        }
    }

    /**
     * Initialize and de-initialize *PPH-DISCOURSE-CONTEXT* appropriately.
     */
    @LispMethod(comment = "Initialize and de-initialize *PPH-DISCOURSE-CONTEXT* appropriately.")
    public static SubLObject within_new_pph_discourse_context(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list130, $list131, listS(CUNWIND_PROTECT, listS(PROGN, $list127, append(body, NIL)), $list132));
    }

    public static SubLObject herald_new_discourse_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str134$__Entering_WITHIN_NEW_PPH_DISCOUR, pph_vars.$pph_discourse_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject herald_end_of_discourse_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS, pph_vars.$pph_discourse_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject pph_discourse_context_initializedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_drs.pph_discourse_context_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread));
        }
    }

    public static SubLObject pph_discourse_context_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_drs.pph_discourse_context_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread));
    }

    public static final SubLObject clear_pph_discourse_context_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            pph_vars.$pph_discourse_context$.setDynamicValue(NIL, thread);
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    public static SubLObject clear_pph_discourse_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_vars.$pph_discourse_context$.setDynamicValue(NIL, thread);
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }

    public static final SubLObject with_shadowed_discourse_context_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt119);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject new_rms_var = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt119);
                        new_rms_var = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != subl_promotions.memberP($CYC_LEXICON, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject matrix_rms = $sym121$MATRIX_RMS;
                                        return listS(CLET, bq_cons(bq_cons(matrix_rms, $list_alt122), $list_alt123), $list_alt124, append(body, list(list(CSETQ, new_rms_var, list(NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, $pph_discourse_context$, matrix_rms)))));
                                    }
                                } else {
                                    return bq_cons(PROGN, append(body, NIL));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt119);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject with_shadowed_discourse_context(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list139);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject new_rms_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list139);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list139);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (NIL != subl_promotions.memberP($CYC_LEXICON, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            final SubLObject matrix_rms = $sym141$MATRIX_RMS;
            final SubLObject last_clause = ($$$NIL.equal(symbol_name(new_rms_var))) ? list(IGNORE, matrix_rms) : list(CSETQ, new_rms_var, list(NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, $pph_discourse_context$, matrix_rms));
            return listS(CLET, bq_cons(bq_cons(matrix_rms, $list147), $list148), $list149, append(body, list(last_clause)));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static final SubLObject note_leaving_shadowed_discourse_context_alt(SubLObject v_context, SubLObject matrix_rms) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format(T, $str_alt129$__Leaving__S, v_context);
        }
        {
            SubLObject new_rms = NIL;
            new_rms = set_difference(pph_drs.pph_discourse_context_rms(v_context), matrix_rms, UNPROVIDED, UNPROVIDED);
            if (NIL != new_rms) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt130$New_RMS___S, new_rms);
                }
            }
            return new_rms;
        }
    }

    public static SubLObject note_leaving_shadowed_discourse_context(final SubLObject v_context, final SubLObject matrix_rms) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str151$__Leaving__S, v_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject new_rms = NIL;
        new_rms = set_difference(pph_drs.pph_discourse_context_rms(v_context), matrix_rms, UNPROVIDED, UNPROVIDED);
        if ((NIL != new_rms) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str152$New_RMS___S, new_rms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return new_rms;
    }

    /**
     * Execute BODY with the discourse participants of any generated speech acts
     * presumed to be SPEAKER and ADDRESSEE.
     */
    @LispMethod(comment = "Execute BODY with the discourse participants of any generated speech acts\r\npresumed to be SPEAKER and ADDRESSEE.\nExecute BODY with the discourse participants of any generated speech acts\npresumed to be SPEAKER and ADDRESSEE.")
    public static final SubLObject with_pph_speaker_and_addressee_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt131);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject speaker = NIL;
                    SubLObject addressee = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt131);
                    speaker = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt131);
                    addressee = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($pph_speaker$, speaker), list($pph_addressee$, addressee)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt131);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with the discourse participants of any generated speech acts
     * presumed to be SPEAKER and ADDRESSEE.
     */
    @LispMethod(comment = "Execute BODY with the discourse participants of any generated speech acts\r\npresumed to be SPEAKER and ADDRESSEE.\nExecute BODY with the discourse participants of any generated speech acts\npresumed to be SPEAKER and ADDRESSEE.")
    public static SubLObject with_pph_speaker_and_addressee(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list153);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject speaker = NIL;
        SubLObject addressee = NIL;
        destructuring_bind_must_consp(current, datum, $list153);
        speaker = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list153);
        addressee = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($pph_speaker$, speaker), list($pph_addressee$, addressee)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list153);
        return NIL;
    }

    /**
     * Evaluate BODY with STRING and ARG-POSITION bound iteratively to
     * the string and arg-position of each item on OUTPUT-LIST.
     * PARANOID-ARG will be bound to the original CycL argument of the formula,
     * as a sanity check.
     * HTML-OPEN-TAG and HTML-CLOSE-TAG will be bound to HTML tag strings or NIL.
     * START-CHAR-INDEX will be bound to the index in the (tagless) string for the
     * whole OUTPUT-LIST to the first character of STRING.
     */
    @LispMethod(comment = "Evaluate BODY with STRING and ARG-POSITION bound iteratively to\r\nthe string and arg-position of each item on OUTPUT-LIST.\r\nPARANOID-ARG will be bound to the original CycL argument of the formula,\r\nas a sanity check.\r\nHTML-OPEN-TAG and HTML-CLOSE-TAG will be bound to HTML tag strings or NIL.\r\nSTART-CHAR-INDEX will be bound to the index in the (tagless) string for the\r\nwhole OUTPUT-LIST to the first character of STRING.\nEvaluate BODY with STRING and ARG-POSITION bound iteratively to\nthe string and arg-position of each item on OUTPUT-LIST.\nPARANOID-ARG will be bound to the original CycL argument of the formula,\nas a sanity check.\nHTML-OPEN-TAG and HTML-CLOSE-TAG will be bound to HTML tag strings or NIL.\nSTART-CHAR-INDEX will be bound to the index in the (tagless) string for the\nwhole OUTPUT-LIST to the first character of STRING.")
    public static final SubLObject do_pph_output_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject string = NIL;
                    SubLObject output_list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    output_list = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            if (NIL == member(current_1, $list_alt135, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt134);
                        }
                        {
                            SubLObject paranoid_arg_tail = property_list_member($PARANOID_ARG, current);
                            SubLObject paranoid_arg = (NIL != paranoid_arg_tail) ? ((SubLObject) (cadr(paranoid_arg_tail))) : PARANOID_ARG;
                            SubLObject arg_position_tail = property_list_member($ARG_POSITION, current);
                            SubLObject arg_position = (NIL != arg_position_tail) ? ((SubLObject) (cadr(arg_position_tail))) : ARG_POSITION;
                            SubLObject html_open_tag_tail = property_list_member($HTML_OPEN_TAG, current);
                            SubLObject html_open_tag = (NIL != html_open_tag_tail) ? ((SubLObject) (cadr(html_open_tag_tail))) : HTML_OPEN_TAG;
                            SubLObject html_close_tag_tail = property_list_member($HTML_CLOSE_TAG, current);
                            SubLObject html_close_tag = (NIL != html_close_tag_tail) ? ((SubLObject) (cadr(html_close_tag_tail))) : HTML_CLOSE_TAG;
                            SubLObject start_char_index_tail = property_list_member($START_CHAR_INDEX, current);
                            SubLObject start_char_index = (NIL != start_char_index_tail) ? ((SubLObject) (cadr(start_char_index_tail))) : START_CHAR_INDEX;
                            SubLObject whole_string_tail = property_list_member($WHOLE_STRING, current);
                            SubLObject whole_string = (NIL != whole_string_tail) ? ((SubLObject) (cadr(whole_string_tail))) : WHOLE_STRING;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject item = $sym149$ITEM;
                                SubLObject whole_html_string = $sym150$WHOLE_HTML_STRING;
                                SubLObject end_char_index = $sym151$END_CHAR_INDEX;
                                SubLObject iterator = $sym152$ITERATOR;
                                return list(PROGN, listS(CHECK_TYPE, output_list, $list_alt153), list(CLET, list(bq_cons(start_char_index, $list_alt154), bq_cons(end_char_index, $list_alt154), list(whole_html_string, listS(PPH_PHRASE_OUTPUT_LIST_STRING, output_list, $list_alt156)), list(whole_string, listS(PPH_REMOVE_HTML_TAGS, whole_html_string, $list_alt105)), list(iterator, list(NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR, output_list))), list(UNTIL, list(PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P, iterator), list(CLET, list(list(item, list(PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT, iterator))), listS(DO_ONE_PPH_OUTPUT_LIST_ITEM, list(new SubLObject[]{ item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, whole_string, start_char_index, end_char_index }), append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Evaluate BODY with STRING and ARG-POSITION bound iteratively to
     * the string and arg-position of each item on OUTPUT-LIST.
     * PARANOID-ARG will be bound to the original CycL argument of the formula,
     * as a sanity check.
     * HTML-OPEN-TAG and HTML-CLOSE-TAG will be bound to HTML tag strings or NIL.
     * START-CHAR-INDEX will be bound to the index in the (tagless) string for the
     * whole OUTPUT-LIST to the first character of STRING.
     */
    @LispMethod(comment = "Evaluate BODY with STRING and ARG-POSITION bound iteratively to\r\nthe string and arg-position of each item on OUTPUT-LIST.\r\nPARANOID-ARG will be bound to the original CycL argument of the formula,\r\nas a sanity check.\r\nHTML-OPEN-TAG and HTML-CLOSE-TAG will be bound to HTML tag strings or NIL.\r\nSTART-CHAR-INDEX will be bound to the index in the (tagless) string for the\r\nwhole OUTPUT-LIST to the first character of STRING.\nEvaluate BODY with STRING and ARG-POSITION bound iteratively to\nthe string and arg-position of each item on OUTPUT-LIST.\nPARANOID-ARG will be bound to the original CycL argument of the formula,\nas a sanity check.\nHTML-OPEN-TAG and HTML-CLOSE-TAG will be bound to HTML tag strings or NIL.\nSTART-CHAR-INDEX will be bound to the index in the (tagless) string for the\nwhole OUTPUT-LIST to the first character of STRING.")
    public static SubLObject do_pph_output_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = NIL;
        SubLObject output_list = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        output_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list156);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list156);
            if (NIL == member(current_$4, $list157, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list156);
        }
        final SubLObject paranoid_arg_tail = property_list_member($PARANOID_ARG, current);
        final SubLObject paranoid_arg = (NIL != paranoid_arg_tail) ? cadr(paranoid_arg_tail) : PARANOID_ARG;
        final SubLObject output_item_tail = property_list_member($OUTPUT_ITEM, current);
        final SubLObject output_item = (NIL != output_item_tail) ? cadr(output_item_tail) : OUTPUT_ITEM;
        final SubLObject arg_position_tail = property_list_member($ARG_POSITION, current);
        final SubLObject arg_position = (NIL != arg_position_tail) ? cadr(arg_position_tail) : ARG_POSITION;
        final SubLObject html_open_tag_tail = property_list_member($HTML_OPEN_TAG, current);
        final SubLObject html_open_tag = (NIL != html_open_tag_tail) ? cadr(html_open_tag_tail) : HTML_OPEN_TAG;
        final SubLObject html_close_tag_tail = property_list_member($HTML_CLOSE_TAG, current);
        final SubLObject html_close_tag = (NIL != html_close_tag_tail) ? cadr(html_close_tag_tail) : HTML_CLOSE_TAG;
        final SubLObject start_char_index_tail = property_list_member($START_CHAR_INDEX, current);
        final SubLObject start_char_index = (NIL != start_char_index_tail) ? cadr(start_char_index_tail) : START_CHAR_INDEX;
        final SubLObject whole_string_tail = property_list_member($WHOLE_STRING, current);
        final SubLObject whole_string = (NIL != whole_string_tail) ? cadr(whole_string_tail) : WHOLE_STRING;
        final SubLObject body;
        current = body = temp;
        final SubLObject item = $sym173$ITEM;
        final SubLObject whole_html_string = $sym174$WHOLE_HTML_STRING;
        final SubLObject end_char_index = $sym175$END_CHAR_INDEX;
        final SubLObject iterator = $sym176$ITERATOR;
        return list(PROGN, listS(CHECK_TYPE, output_list, $list177), list(CLET, list(bq_cons(start_char_index, $list178), bq_cons(end_char_index, $list178), list(whole_html_string, listS(PPH_PHRASE_OUTPUT_LIST_STRING, output_list, $list180)), list(whole_string, listS(PPH_REMOVE_HTML_TAGS, whole_html_string, $list121)), list(iterator, list(NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR, output_list))), list(UNTIL, list(PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P, iterator), list(CLET, list(list(item, list(PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT, iterator))), listS(DO_ONE_PPH_OUTPUT_LIST_ITEM, list(new SubLObject[]{ item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item, whole_string, start_char_index, end_char_index }), append(body, NIL))))));
    }

    public static final SubLObject do_one_pph_output_list_item_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt164);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item = NIL;
                    SubLObject string = NIL;
                    SubLObject arg_position = NIL;
                    SubLObject html_open_tag = NIL;
                    SubLObject html_close_tag = NIL;
                    SubLObject paranoid_arg = NIL;
                    SubLObject whole_string = NIL;
                    SubLObject start_char_index = NIL;
                    SubLObject end_char_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    item = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    arg_position = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    html_open_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    html_close_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    paranoid_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    whole_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    start_char_index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    end_char_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(PPH_MAYBE_DO_SPACE_ITEM, list(new SubLObject[]{ item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, whole_string, start_char_index, end_char_index }), append(body, NIL)), listS(WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, list(item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt164);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_one_pph_output_list_item(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = NIL;
        SubLObject string = NIL;
        SubLObject arg_position = NIL;
        SubLObject html_open_tag = NIL;
        SubLObject html_close_tag = NIL;
        SubLObject paranoid_arg = NIL;
        SubLObject output_item = NIL;
        SubLObject whole_string = NIL;
        SubLObject start_char_index = NIL;
        SubLObject end_char_index = NIL;
        destructuring_bind_must_consp(current, datum, $list188);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        arg_position = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        html_open_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        html_close_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        paranoid_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        output_item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        whole_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        start_char_index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        end_char_index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(PPH_MAYBE_DO_SPACE_ITEM, list(new SubLObject[]{ item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item, whole_string, start_char_index, end_char_index }), append(body, NIL)), listS(WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, list(item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list188);
        return NIL;
    }

    public static final SubLObject pph_maybe_do_space_item_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt164);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item = NIL;
                    SubLObject string = NIL;
                    SubLObject arg_position = NIL;
                    SubLObject html_open_tag = NIL;
                    SubLObject html_close_tag = NIL;
                    SubLObject paranoid_arg = NIL;
                    SubLObject whole_string = NIL;
                    SubLObject start_char_index = NIL;
                    SubLObject end_char_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    item = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    arg_position = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    html_open_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    html_close_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    paranoid_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    whole_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    start_char_index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    end_char_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject raw_item_string = $sym167$RAW_ITEM_STRING;
                            return list(CLET, list(list(raw_item_string, listS(PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, $list_alt105))), list(CSETQ, start_char_index, list(PPH_OUTPUT_LIST_FIND_START_CHAR, raw_item_string, whole_string, end_char_index)), list(PWHEN, list($sym170$_, start_char_index, end_char_index), listS(CLET, list(list(string, list(PPH_MAKE_SPACE_STRING, start_char_index, end_char_index)), bq_cons(arg_position, $list_alt172), bq_cons(html_open_tag, $list_alt105), bq_cons(html_close_tag, $list_alt105), bq_cons(paranoid_arg, $list_alt173), list(start_char_index, end_char_index)), list(IGNORE, paranoid_arg, arg_position, html_open_tag, html_close_tag, start_char_index), append(body, NIL))), list(CSETQ, end_char_index, list(PPH_UPDATE_END_CHAR_INDEX, start_char_index, raw_item_string)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt164);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject pph_maybe_do_space_item(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = NIL;
        SubLObject string = NIL;
        SubLObject arg_position = NIL;
        SubLObject html_open_tag = NIL;
        SubLObject html_close_tag = NIL;
        SubLObject paranoid_arg = NIL;
        SubLObject output_item = NIL;
        SubLObject whole_string = NIL;
        SubLObject start_char_index = NIL;
        SubLObject end_char_index = NIL;
        destructuring_bind_must_consp(current, datum, $list188);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        arg_position = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        html_open_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        html_close_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        paranoid_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        output_item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        whole_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        start_char_index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        end_char_index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject raw_item_string = $sym191$RAW_ITEM_STRING;
            return list(CLET, list(list(raw_item_string, listS(PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, $list121))), list(CSETQ, start_char_index, list(PPH_OUTPUT_LIST_FIND_START_CHAR, raw_item_string, whole_string, end_char_index)), list(PWHEN, list($sym194$_, start_char_index, end_char_index), listS(CLET, list(list(string, list(PPH_MAKE_SPACE_STRING, start_char_index, end_char_index)), bq_cons(arg_position, $list196), bq_cons(html_open_tag, $list121), bq_cons(html_close_tag, $list121), bq_cons(paranoid_arg, $list197), list(output_item, list(NEW_PPH_PHRASE_FILLER_ITEM, string)), list(start_char_index, end_char_index)), list(IGNORE, paranoid_arg, output_item, arg_position, html_open_tag, html_close_tag, start_char_index), append(body, NIL))), list(CSETQ, end_char_index, list(PPH_UPDATE_END_CHAR_INDEX, start_char_index, raw_item_string)));
        }
        cdestructuring_bind_error(datum, $list188);
        return NIL;
    }

    public static final SubLObject pph_update_end_char_index_alt(SubLObject start_char_index, SubLObject raw_item_string) {
        return add(start_char_index, length(raw_item_string));
    }

    public static SubLObject pph_update_end_char_index(final SubLObject start_char_index, final SubLObject raw_item_string) {
        return add(start_char_index, length(raw_item_string));
    }

    public static final SubLObject pph_make_space_string_alt(SubLObject start_char_index, SubLObject end_char_index) {
        {
            SubLObject length = subtract(start_char_index, end_char_index);
            if (length.numG(ONE_INTEGER)) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt176$Adding_space_string_of_length__S) });
                    pph_error.pph_handle_error(new_format_string, list(length));
                }
            }
            return Strings.make_string(length, CHAR_space);
        }
    }

    public static SubLObject pph_make_space_string(final SubLObject start_char_index, final SubLObject end_char_index) {
        final SubLObject length = subtract(start_char_index, end_char_index);
        if (length.numG(ONE_INTEGER)) {
            final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str102$__, format_nil.format_nil_a_no_copy($str200$Adding_space_string_of_length__S) });
            pph_error.pph_handle_error(new_format_string, list(length));
        }
        return Strings.make_string(length, CHAR_space);
    }

    public static final SubLObject with_pph_regular_output_item_bindings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt177);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item = NIL;
                    SubLObject string = NIL;
                    SubLObject arg_position = NIL;
                    SubLObject html_open_tag = NIL;
                    SubLObject html_close_tag = NIL;
                    SubLObject paranoid_arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    item = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    arg_position = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    html_open_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    html_close_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    paranoid_arg = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list(string, listS(PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, $list_alt105)), list(arg_position, list(PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION, item)), list(html_open_tag, list(PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG, item)), list(html_close_tag, list(PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG, item)), list(paranoid_arg, list(PPH_PHRASE_OUTPUT_ITEM_CYCL, item))), list(IGNORE, paranoid_arg, arg_position, html_open_tag, html_close_tag), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt177);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_pph_regular_output_item_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = NIL;
        SubLObject string = NIL;
        SubLObject arg_position = NIL;
        SubLObject html_open_tag = NIL;
        SubLObject html_close_tag = NIL;
        SubLObject paranoid_arg = NIL;
        SubLObject output_item = NIL;
        destructuring_bind_must_consp(current, datum, $list201);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        arg_position = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        html_open_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        html_close_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        paranoid_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        output_item = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(string, listS(PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, $list121)), list(arg_position, list(PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION, item)), list(html_open_tag, list(PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG, item)), list(html_close_tag, list(PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG, item)), list(paranoid_arg, list(PPH_PHRASE_OUTPUT_ITEM_CYCL, item)), list(output_item, item)), list(IGNORE, paranoid_arg, output_item, arg_position, html_open_tag, html_close_tag), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list201);
        return NIL;
    }

    /**
     *
     *
     * @return INTEGERP; The starting point of STRING in WHOLE-STRING at or after PREVIOUS-END-CHAR-INDEX.
     */
    @LispMethod(comment = "@return INTEGERP; The starting point of STRING in WHOLE-STRING at or after PREVIOUS-END-CHAR-INDEX.")
    public static final SubLObject pph_output_list_find_start_char_alt(SubLObject string, SubLObject whole_string, SubLObject previous_end_char_index) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject tagless_string = pph_utilities.pph_remove_html_tags(string, UNPROVIDED);
            SubLObject ans = (NIL != list_utilities.lengthG(tagless_string, ZERO_INTEGER, UNPROVIDED)) ? ((SubLObject) (position(string_utilities.first_char(tagless_string), whole_string, symbol_function($sym183$CHAR_), symbol_function(IDENTITY), previous_end_char_index, UNPROVIDED))) : previous_end_char_index;
            if (!ans.isInteger()) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt184$Couldn_t_find__S_in__S___) });
                    pph_error.pph_handle_error(new_format_string, list(string, whole_string));
                }
            }
            if (NIL == string_utilities.substringP(tagless_string, whole_string, symbol_function(EQUAL), ans, UNPROVIDED)) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt185$Misidentified_start_of__S_in__S_a) });
                    pph_error.pph_handle_error(new_format_string, list(string, whole_string, ans));
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return INTEGERP; The starting point of STRING in WHOLE-STRING at or after PREVIOUS-END-CHAR-INDEX.
     */
    @LispMethod(comment = "@return INTEGERP; The starting point of STRING in WHOLE-STRING at or after PREVIOUS-END-CHAR-INDEX.")
    public static SubLObject pph_output_list_find_start_char(final SubLObject string, final SubLObject whole_string, final SubLObject previous_end_char_index) {
        assert NIL != pph_string.pph_string_p(string) : "! pph_string.pph_string_p(string) " + ("pph_string.pph_string_p(string) " + "CommonSymbols.NIL != pph_string.pph_string_p(string) ") + string;
        final SubLObject tagless_string = pph_utilities.pph_remove_html_tags(string, UNPROVIDED);
        final SubLObject ans = (NIL != list_utilities.lengthG(tagless_string, ZERO_INTEGER, UNPROVIDED)) ? pph_string.pph_string_position(pph_string.pph_string_char(tagless_string, ZERO_INTEGER), whole_string, symbol_function($sym207$PPH_CHAR__), symbol_function(IDENTITY), previous_end_char_index, UNPROVIDED) : previous_end_char_index;
        if (!ans.isInteger()) {
            final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str102$__, format_nil.format_nil_a_no_copy($str208$Couldn_t_find__S_in__S___) });
            pph_error.pph_handle_error(new_format_string, list(pph_string.pph_string_if_non_null_to_output_format(string, UNPROVIDED), pph_string.pph_string_if_non_null_to_output_format(pph_string.pph_substring(whole_string, previous_end_char_index, UNPROVIDED), UNPROVIDED)));
        }
        return ans;
    }

    public static final SubLObject do_pph_javalist_items_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt186);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item = NIL;
                    SubLObject javalist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt186);
                    item = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt186);
                    javalist = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt186);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt186);
                            if (NIL == member(current_2, $list_alt187, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt186);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(item, list(PPH_NJAVALIST_ITEMS, javalist), done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_pph_javalist_items(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list209);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = NIL;
        SubLObject javalist = NIL;
        destructuring_bind_must_consp(current, datum, $list209);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list209);
        javalist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list209);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list209);
            if (NIL == member(current_$5, $list210, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list209);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(item, list(PPH_NJAVALIST_ITEMS, javalist), done), append(body, NIL));
    }

    /**
     * Evaluate BODY gathering partial results incrementally, calling NOTIFICATION-FUNCTION-SPEC
     * after every THRESHOLDth result, and storing them when done in ANS.
     */
    @LispMethod(comment = "Evaluate BODY gathering partial results incrementally, calling NOTIFICATION-FUNCTION-SPEC\r\nafter every THRESHOLDth result, and storing them when done in ANS.\nEvaluate BODY gathering partial results incrementally, calling NOTIFICATION-FUNCTION-SPEC\nafter every THRESHOLDth result, and storing them when done in ANS.")
    public static final SubLObject with_pph_disambiguation_partial_results_accumulation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt192);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject ans = NIL;
                    SubLObject threshold = NIL;
                    SubLObject notification_function_spec = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt192);
                    ans = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt192);
                    threshold = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt192);
                    notification_function_spec = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt192);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt192);
                            if (NIL == member(current_3, $list_alt193, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt192);
                        }
                        {
                            SubLObject return_style_tail = property_list_member($RETURN_STYLE, current);
                            SubLObject return_style = (NIL != return_style_tail) ? ((SubLObject) (cadr(return_style_tail))) : $JAVALISTS;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list($list_alt196, $list_alt197, $list_alt198, list($partial_results_notification_fn$, notification_function_spec), $list_alt200, list($pph_disambiguation_mode_return_style$, return_style)), listS(WITH_PARTIAL_RESULTS_ACCUMULATION, list(ans, threshold), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Evaluate BODY gathering partial results incrementally, calling NOTIFICATION-FUNCTION-SPEC
     * after every THRESHOLDth result, and storing them when done in ANS.
     */
    @LispMethod(comment = "Evaluate BODY gathering partial results incrementally, calling NOTIFICATION-FUNCTION-SPEC\r\nafter every THRESHOLDth result, and storing them when done in ANS.\nEvaluate BODY gathering partial results incrementally, calling NOTIFICATION-FUNCTION-SPEC\nafter every THRESHOLDth result, and storing them when done in ANS.")
    public static SubLObject with_pph_disambiguation_partial_results_accumulation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list215);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ans = NIL;
        SubLObject threshold = NIL;
        SubLObject notification_function_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list215);
        ans = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list215);
        threshold = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list215);
        notification_function_spec = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list215);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list215);
            if (NIL == member(current_$6, $list216, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list215);
        }
        final SubLObject return_style_tail = property_list_member($RETURN_STYLE, current);
        final SubLObject return_style = (NIL != return_style_tail) ? cadr(return_style_tail) : $JAVALISTS;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list($list219, $list220, $list221, list($partial_results_notification_fn$, notification_function_spec), $list223, list($pph_disambiguation_mode_return_style$, return_style)), listS(WITH_PARTIAL_RESULTS_ACCUMULATION, list(ans, threshold), append(body, NIL)));
    }

    /**
     * Return value to which *PARTIAL-RESULTS-ACCUMULATOR* and *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*
     * should be initialized.
     */
    @LispMethod(comment = "Return value to which *PARTIAL-RESULTS-ACCUMULATOR* and *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*\r\nshould be initialized.\nReturn value to which *PARTIAL-RESULTS-ACCUMULATOR* and *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*\nshould be initialized.")
    public static final SubLObject initialize_disambiguation_phrases_alt() {
        return dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
    }

    /**
     * Return value to which *PARTIAL-RESULTS-ACCUMULATOR* and *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*
     * should be initialized.
     */
    @LispMethod(comment = "Return value to which *PARTIAL-RESULTS-ACCUMULATOR* and *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*\r\nshould be initialized.\nReturn value to which *PARTIAL-RESULTS-ACCUMULATOR* and *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*\nshould be initialized.")
    public static SubLObject initialize_disambiguation_phrases() {
        return dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
    }

    /**
     * Add RESULT to *PARTIAL-RESULTS-ACCUMULATOR*.
     */
    @LispMethod(comment = "Add RESULT to *PARTIAL-RESULTS-ACCUMULATOR*.")
    public static final SubLObject accumulate_disambiguation_phrases_alt(SubLObject result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(result, INCREMENTAL_PPH_DISAMBIGUATION_RESULT_P);
            {
                SubLObject index = pph_disambiguation.incremental_pph_disambiguation_result_index(result);
                SubLObject output_list = pph_disambiguation.incremental_pph_disambiguation_result_output_list(result);
                SubLObject formatted_result_value = NIL;
                SubLObject pcase_var = $pph_disambiguation_mode_return_style$.getDynamicValue(thread);
                if (pcase_var.eql($JAVALISTS)) {
                    formatted_result_value = pph_utilities.pph_output_list_to_javalist(output_list);
                } else {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy($str_alt204$Don_t_know_how_to_accumulate__S_a), $str_alt89$__, format_nil_a_no_copy($pph_disambiguation_mode_return_style$.getDynamicValue(thread)) });
                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                    }
                }
                add_pph_disambiguation_result_to_accumulator(index, formatted_result_value, $partial_results_accumulator$.getDynamicValue(thread));
            }
            return $partial_results_accumulator$.getDynamicValue(thread);
        }
    }

    /**
     * Add RESULT to *PARTIAL-RESULTS-ACCUMULATOR*.
     */
    @LispMethod(comment = "Add RESULT to *PARTIAL-RESULTS-ACCUMULATOR*.")
    public static SubLObject accumulate_disambiguation_phrases(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_disambiguation.incremental_pph_disambiguation_result_p(result) : "! pph_disambiguation.incremental_pph_disambiguation_result_p(result) " + ("pph_disambiguation.incremental_pph_disambiguation_result_p(result) " + "CommonSymbols.NIL != pph_disambiguation.incremental_pph_disambiguation_result_p(result) ") + result;
        final SubLObject index = pph_disambiguation.incremental_pph_disambiguation_result_index(result);
        final SubLObject output_list = pph_disambiguation.incremental_pph_disambiguation_result_output_list(result);
        SubLObject formatted_result_value = NIL;
        final SubLObject pcase_var = $pph_disambiguation_mode_return_style$.getDynamicValue(thread);
        if (pcase_var.eql($JAVALISTS)) {
            formatted_result_value = pph_utilities.pph_output_list_to_javalist(output_list);
        } else {
            final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy($str227$Don_t_know_how_to_accumulate__S_a), $str102$__, format_nil.format_nil_a_no_copy($pph_disambiguation_mode_return_style$.getDynamicValue(thread)) });
            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        add_pph_disambiguation_result_to_accumulator(index, formatted_result_value, $partial_results_accumulator$.getDynamicValue(thread));
        return $partial_results_accumulator$.getDynamicValue(thread);
    }

    public static final SubLObject add_pph_disambiguation_result_to_accumulator_alt(SubLObject index, SubLObject formatted_result_value, SubLObject accumulator) {
        dictionary.dictionary_enter(accumulator, index, formatted_result_value);
        return accumulator;
    }

    public static SubLObject add_pph_disambiguation_result_to_accumulator(final SubLObject index, final SubLObject formatted_result_value, final SubLObject accumulator) {
        dictionary.dictionary_enter(accumulator, index, formatted_result_value);
        return accumulator;
    }

    /**
     * Add ACCUMULATED-RESULTS to *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*.
     */
    @LispMethod(comment = "Add ACCUMULATED-RESULTS to *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*.")
    public static final SubLObject consolidate_disambiguation_phrases_alt(SubLObject accumulated_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(accumulated_results));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject formatted_result_value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        add_pph_disambiguation_result_to_accumulator(index, formatted_result_value, $partial_results_total_accumulator$.getDynamicValue(thread));
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * Add ACCUMULATED-RESULTS to *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*.
     */
    @LispMethod(comment = "Add ACCUMULATED-RESULTS to *PARTIAL-RESULTS-TOTAL-ACCUMULATOR*.")
    public static SubLObject consolidate_disambiguation_phrases(final SubLObject accumulated_results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(accumulated_results)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject formatted_result_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            add_pph_disambiguation_result_to_accumulator(index, formatted_result_value, $partial_results_total_accumulator$.getDynamicValue(thread));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     * Return the final disambiguation phrases answer from TOTAL-RESULTS.
     */
    @LispMethod(comment = "Return the final disambiguation phrases answer from TOTAL-RESULTS.")
    public static final SubLObject final_results_for_disambiguation_phrases_alt(SubLObject total_results) {
        return list_utilities.alist_values(dictionary_utilities.sort_dictionary_by_keys(total_results, symbol_function($sym205$_)));
    }

    /**
     * Return the final disambiguation phrases answer from TOTAL-RESULTS.
     */
    @LispMethod(comment = "Return the final disambiguation phrases answer from TOTAL-RESULTS.")
    public static SubLObject final_results_for_disambiguation_phrases(final SubLObject total_results) {
        return list_utilities.alist_values(dictionary_utilities.sort_dictionary_by_keys(total_results, symbol_function($sym228$_)));
    }

    /**
     * Execute BODY, gathering any PPH problems into PROBLEM-DICTIONARY-VAR.
     */
    @LispMethod(comment = "Execute BODY, gathering any PPH problems into PROBLEM-DICTIONARY-VAR.")
    public static final SubLObject gathering_pph_problems_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt206);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject problem_dictionary_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt206);
                    problem_dictionary_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject matrix_problem_dictionary = $sym207$MATRIX_PROBLEM_DICTIONARY;
                            return list(PROGN, listS(CSETQ, problem_dictionary_var, $list_alt208), listS(CLET, list(bq_cons(matrix_problem_dictionary, $list_alt209), $list_alt210, list($pph_problem_reports$, problem_dictionary_var)), append(body, list(list(PWHEN, list(DICTIONARY_P, matrix_problem_dictionary), list(PPH_MERGE_PROBLEM_DICTIONARY, $pph_problem_reports$, matrix_problem_dictionary))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt206);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY, gathering any PPH problems into PROBLEM-DICTIONARY-VAR.
     */
    @LispMethod(comment = "Execute BODY, gathering any PPH problems into PROBLEM-DICTIONARY-VAR.")
    public static SubLObject gathering_pph_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list229);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_dictionary_var = NIL;
        destructuring_bind_must_consp(current, datum, $list229);
        problem_dictionary_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject matrix_problem_dictionary = $sym230$MATRIX_PROBLEM_DICTIONARY;
            return list(PROGN, listS(CSETQ, problem_dictionary_var, $list231), listS(CLET, list(bq_cons(matrix_problem_dictionary, $list232), $list233, list($pph_problem_reports$, problem_dictionary_var)), append(body, list(list(PWHEN, list(DICTIONARY_P, matrix_problem_dictionary), list(PPH_MERGE_PROBLEM_DICTIONARY, $pph_problem_reports$, matrix_problem_dictionary))))));
        }
        cdestructuring_bind_error(datum, $list229);
        return NIL;
    }

    /**
     *
     *
     * @param DELAY-IN-SECONDS;
     * 		numberp of real- or run-time seconds or NIL.
     * 		The granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.
     * @param TIMED-OUT?;
     * 		a variable that is set to T if the timeout has been reached.
     */
    @LispMethod(comment = "@param DELAY-IN-SECONDS;\r\n\t\tnumberp of real- or run-time seconds or NIL.\r\n\t\tThe granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.\r\n@param TIMED-OUT?;\r\n\t\ta variable that is set to T if the timeout has been reached.")
    public static final SubLObject with_pph_timeout_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt214);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject timed_outP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt214);
                    timed_outP = current.first();
                    current = current.rest();
                    {
                        SubLObject delay_in_seconds = (current.isCons()) ? ((SubLObject) (current.first())) : pph_timeout();
                        destructuring_bind_must_listp(current, datum, $list_alt214);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, listS($list_alt215, list($pph_timeout_time$, list(PPH_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), $list_alt218), $list_alt219, listS(PUNLESS, $pph_timeout_reachedP$, append(body, NIL)), listS(CSETQ, timed_outP, $list_alt221));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt214);
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
     * @param DELAY-IN-SECONDS;
     * 		numberp of real- or run-time seconds or NIL.
     * 		The granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.
     * @param TIMED-OUT?;
     * 		a variable that is set to T if the timeout has been reached.
     */
    @LispMethod(comment = "@param DELAY-IN-SECONDS;\r\n\t\tnumberp of real- or run-time seconds or NIL.\r\n\t\tThe granularity is (/ 1 *INTERNAL-TIME-UNITS-PER-SECOND*) seconds.\r\n@param TIMED-OUT?;\r\n\t\ta variable that is set to T if the timeout has been reached.")
    public static SubLObject with_pph_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list237);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject timed_outP = NIL;
        destructuring_bind_must_consp(current, datum, $list237);
        timed_outP = current.first();
        current = current.rest();
        final SubLObject delay_in_seconds = (current.isCons()) ? current.first() : pph_timeout();
        destructuring_bind_must_listp(current, datum, $list237);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, listS($list238, list($pph_timeout_time$, list(PPH_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), $list241), $list242, listS(PUNLESS, $pph_timeout_reachedP$, append(body, NIL)), listS(CSETQ, timed_outP, $list244));
        }
        cdestructuring_bind_error(datum, $list237);
        return NIL;
    }

    /**
     *
     *
     * @return boolean; Has the allotted time expired?
     */
    @LispMethod(comment = "@return boolean; Has the allotted time expired?")
    public static final SubLObject pph_timeout_time_reachedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$pph_timeout_time$.getDynamicValue(thread).isNumber()) {
                return NIL;
            } else {
                if (NIL != $pph_timeout_reachedP$.getDynamicValue(thread)) {
                    return T;
                } else {
                    if (pph_timeout_current_time().numGE($pph_timeout_time$.getDynamicValue(thread))) {
                        $pph_timeout_reachedP$.setDynamicValue(T, thread);
                        Errors.warn($str_alt222$PPH_timeout_reached_);
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; Has the allotted time expired?
     */
    @LispMethod(comment = "@return boolean; Has the allotted time expired?")
    public static SubLObject pph_timeout_time_reachedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$pph_timeout_time$.getDynamicValue(thread).isNumber()) {
            return NIL;
        }
        if (NIL != $pph_timeout_reachedP$.getDynamicValue(thread)) {
            return T;
        }
        if (pph_timeout_current_time().numGE($pph_timeout_time$.getDynamicValue(thread))) {
            $pph_timeout_reachedP$.setDynamicValue(T, thread);
            Errors.warn($str245$PPH_timeout_reached_);
            return T;
        }
        return NIL;
    }

    public static final SubLObject pph_timeout_current_time_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $pph_timeout_time_check_count$.setDynamicValue(add($pph_timeout_time_check_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            return get_internal_real_time();
        }
    }

    public static SubLObject pph_timeout_current_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $pph_timeout_time_check_count$.setDynamicValue(add($pph_timeout_time_check_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        return get_internal_real_time();
    }

    public static final SubLObject pph_compute_timeout_time_alt(SubLObject delay_in_seconds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!delay_in_seconds.isNumber()) {
                return $pph_timeout_time$.getDynamicValue(thread);
            }
            {
                SubLObject current_time = pph_timeout_current_time();
                SubLObject offset = floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
                return number_utilities.minimum(remove(NIL, list($pph_timeout_time$.getDynamicValue(thread), add(current_time, offset)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            }
        }
    }

    public static SubLObject pph_compute_timeout_time(final SubLObject delay_in_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!delay_in_seconds.isNumber()) {
            return $pph_timeout_time$.getDynamicValue(thread);
        }
        final SubLObject current_time = pph_timeout_current_time();
        final SubLObject offset = floor(multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
        return number_utilities.minimum(remove(NIL, list($pph_timeout_time$.getDynamicValue(thread), add(current_time, offset)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject pph_timeout_alt() {
        {
            SubLObject allowable_time = pph_allowable_time();
            return NIL != number_utilities.positive_number_p(allowable_time) ? ((SubLObject) (allowable_time)) : NIL;
        }
    }

    public static SubLObject pph_timeout() {
        final SubLObject allowable_time = pph_allowable_time();
        return NIL != number_utilities.positive_number_p(allowable_time) ? allowable_time : NIL;
    }

    /**
     *
     *
     * @return POSITIVE-POTENTIALLY-INFINITE-NUMBER-P; number of seconds allowed for a single phrase.
     */
    @LispMethod(comment = "@return POSITIVE-POTENTIALLY-INFINITE-NUMBER-P; number of seconds allowed for a single phrase.")
    public static final SubLObject pph_allowable_time_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pph_vars.pph_failure_is_an_option_p()) {
                return $pph_default_timeout$.getDynamicValue(thread);
            } else {
                return number_utilities.positive_infinity();
            }
        }
    }

    /**
     *
     *
     * @return POSITIVE-POTENTIALLY-INFINITE-NUMBER-P; number of seconds allowed for a single phrase.
     */
    @LispMethod(comment = "@return POSITIVE-POTENTIALLY-INFINITE-NUMBER-P; number of seconds allowed for a single phrase.")
    public static SubLObject pph_allowable_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.pph_failure_is_an_option_p()) {
            return $pph_default_timeout$.getDynamicValue(thread);
        }
        return number_utilities.positive_infinity();
    }

    public static SubLObject noting_unexpressed_negations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject already_initializedP = $sym248$ALREADY_INITIALIZED_;
        return listS(CLET, list(bq_cons(already_initializedP, $list249), list($pph_unexpressed_negations$, listS(FIF, already_initializedP, $list251))), append(body, list(listS(PUNLESS, listS(COR, already_initializedP, $list253), $list254))));
    }

    public static final SubLObject possibly_with_pph_language_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject generation_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt225);
            generation_mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($pph_language_mt$, listS(FIF, generation_mt, list(PPH_CANONICALIZE_HLMT, generation_mt), $list_alt228))), append(body, NIL));
            }
        }
    }

    public static SubLObject possibly_with_pph_language_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject generation_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list255);
        generation_mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($pph_language_mt$, listS(FIF, generation_mt, list(PPH_CANONICALIZE_HLMT, generation_mt), $list258))), append(body, NIL));
    }

    public static final SubLObject possibly_with_pph_domain_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject domain_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt229);
            domain_mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($pph_domain_mt$, listS(FIF, domain_mt, list(PPH_CANONICALIZE_HLMT, domain_mt), $list_alt231))), append(body, NIL));
            }
        }
    }

    public static SubLObject possibly_with_pph_domain_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject domain_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list259);
        domain_mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($pph_domain_mt$, listS(FIF, domain_mt, list(PPH_CANONICALIZE_HLMT, domain_mt), $list261))), append(body, NIL));
    }

    public static final SubLObject with_language_and_domain_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt232);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject generation_mt = NIL;
                    SubLObject domain_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt232);
                    generation_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt232);
                    domain_mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(POSSIBLY_WITH_PPH_LANGUAGE_MT, generation_mt, listS(POSSIBLY_WITH_PPH_DOMAIN_MT, domain_mt, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt232);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_language_and_domain_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list262);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject generation_mt = NIL;
        SubLObject domain_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list262);
        generation_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list262);
        domain_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(POSSIBLY_WITH_PPH_LANGUAGE_MT, generation_mt, listS(POSSIBLY_WITH_PPH_DOMAIN_MT, domain_mt, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list262);
        return NIL;
    }

    /**
     * Evaluate BODY with inference/indexing relevance bound to *PPH-LANGUAGE-MT*.
     * If at that point BROADEN? is non-NIL, try to evaluate BODY again with a broader mt.
     */
    @LispMethod(comment = "Evaluate BODY with inference/indexing relevance bound to *PPH-LANGUAGE-MT*.\r\nIf at that point BROADEN? is non-NIL, try to evaluate BODY again with a broader mt.\nEvaluate BODY with inference/indexing relevance bound to *PPH-LANGUAGE-MT*.\nIf at that point BROADEN? is non-NIL, try to evaluate BODY again with a broader mt.")
    public static final SubLObject with_pph_language_mt_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt235);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject broadenP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt235);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            if (NIL == broadenP) {
                                return listS(WITH_INFERENCE_MT_RELEVANCE, $pph_language_mt$, append(body, NIL));
                            } else {
                                {
                                    SubLObject broadened_language_mt = $sym237$BROADENED_LANGUAGE_MT;
                                    return list(PROGN, listS(WITH_PPH_LANGUAGE_MT_RELEVANCE, NIL, append(body, NIL)), list(PWHEN, broadenP, list(CLET, list(bq_cons(broadened_language_mt, $list_alt239)), list(PUNLESS, listS($sym240$HLMT_EQUAL_, broadened_language_mt, $list_alt228), list(CLET, list(list($pph_language_mt$, broadened_language_mt)), $list_alt241, listS(WITH_INFERENCE_MT_RELEVANCE, $pph_language_mt$, append(body, NIL)))))));
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt235);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Evaluate BODY with inference/indexing relevance bound to *PPH-LANGUAGE-MT*.
     * If at that point BROADEN? is non-NIL, try to evaluate BODY again with a broader mt.
     */
    @LispMethod(comment = "Evaluate BODY with inference/indexing relevance bound to *PPH-LANGUAGE-MT*.\r\nIf at that point BROADEN? is non-NIL, try to evaluate BODY again with a broader mt.\nEvaluate BODY with inference/indexing relevance bound to *PPH-LANGUAGE-MT*.\nIf at that point BROADEN? is non-NIL, try to evaluate BODY again with a broader mt.")
    public static SubLObject with_pph_language_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list265);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject broadenP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list265);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list265);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (NIL == broadenP) {
            return listS(WITH_INFERENCE_MT_RELEVANCE, $pph_language_mt$, append(body, NIL));
        }
        final SubLObject broadened_language_mt = $sym267$BROADENED_LANGUAGE_MT;
        return list(PROGN, listS(WITH_PPH_LANGUAGE_MT_RELEVANCE, NIL, append(body, NIL)), list(PWHEN, broadenP, list(CLET, list(bq_cons(broadened_language_mt, $list269)), list(PUNLESS, listS($sym270$HLMT_EQUAL_, broadened_language_mt, $list258), list(CLET, list(list($pph_language_mt$, broadened_language_mt)), $list271, listS(WITH_INFERENCE_MT_RELEVANCE, $pph_language_mt$, append(body, NIL)))))));
    }

    /**
     * Evaluate BODY with inference/indexing relevance bound to the union of *PPH-LANGUAGE-MT* and *PPH-DOMAIN-MT*.
     */
    @LispMethod(comment = "Evaluate BODY with inference/indexing relevance bound to the union of *PPH-LANGUAGE-MT* and *PPH-DOMAIN-MT*.")
    public static final SubLObject with_pph_domain_and_language_mt_union_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_INFERENCE_MT_RELEVANCE, $list_alt242, append(body, NIL));
        }
    }

    /**
     * Evaluate BODY with inference/indexing relevance bound to the union of *PPH-LANGUAGE-MT* and *PPH-DOMAIN-MT*.
     */
    @LispMethod(comment = "Evaluate BODY with inference/indexing relevance bound to the union of *PPH-LANGUAGE-MT* and *PPH-DOMAIN-MT*.")
    public static SubLObject with_pph_domain_and_language_mt_union_relevance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_INFERENCE_MT_RELEVANCE, $list272, append(body, NIL));
    }

    public static final SubLObject do_pph_phrase_fns_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt243);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fn = NIL;
                    SubLObject mt = NIL;
                    SubLObject done = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt243);
                    fn = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt243);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt243);
                    done = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(DO_DICTIONARY, listS(fn, mt, $list_alt245), listS(PUNLESS, list(COR, done, listS(EQ, fn, $list_alt247)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt243);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_pph_phrase_fns(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fn = NIL;
        SubLObject mt = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list273);
        fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        done = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_DICTIONARY, listS(fn, mt, $list275), listS(PUNLESS, list(COR, done, listS(EQ, fn, $list276)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list273);
        return NIL;
    }

    public static final SubLObject possibly_suspending_pph_bullets_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt248);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject okP = NIL;
                    SubLObject v_object = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt248);
                    okP = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt248);
                    v_object = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject suspendP = $sym249$SUSPEND_;
                            return listS(CLET, list(list(suspendP, list(CAND, $pph_use_bulleted_listsP$, list(CNOT, okP))), list($pph_use_bulleted_listsP$, list(CAND, $pph_use_bulleted_listsP$, okP))), list(PWHEN, suspendP, list(PPH_NOTE, ONE_INTEGER, $str_alt252$__Suspending_bullet_use_for____S_, v_object)), append(body, list(listS(PWHEN, suspendP, $list_alt253))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt248);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_suspending_pph_bullets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list277);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject okP = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list277);
        okP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list277);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject suspendP = $sym278$SUSPEND_;
            return listS(CLET, list(list(suspendP, list(CAND, $pph_use_bulleted_listsP$, list(CNOT, okP))), list($pph_use_bulleted_listsP$, list(CAND, $pph_use_bulleted_listsP$, okP))), list(PWHEN, suspendP, list(PPH_NOTE, ONE_INTEGER, $str281$__Suspending_bullet_use_for____S_, v_object)), append(body, list(listS(PWHEN, suspendP, $list282))));
        }
        cdestructuring_bind_error(datum, $list277);
        return NIL;
    }

    /**
     * Execute BODY with a paraphrase demerit cutoff of CUTOFF. Paraphrases whose
     * demerit score are higher than CUTOFF will not be returned. NIL will be returned
     * instead of a string.
     */
    @LispMethod(comment = "Execute BODY with a paraphrase demerit cutoff of CUTOFF. Paraphrases whose\r\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\r\ninstead of a string.\nExecute BODY with a paraphrase demerit cutoff of CUTOFF. Paraphrases whose\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\ninstead of a string.")
    public static final SubLObject with_pph_demerit_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cutoff = (current.isCons()) ? ((SubLObject) (current.first())) : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
                    destructuring_bind_must_listp(current, datum, $list_alt254);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(PPH_CHECK_TYPE, cutoff, $list_alt256), listS(CLET, list(list($pph_demerit_cutoff$, cutoff)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt254);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with a paraphrase demerit cutoff of CUTOFF. Paraphrases whose
     * demerit score are higher than CUTOFF will not be returned. NIL will be returned
     * instead of a string.
     */
    @LispMethod(comment = "Execute BODY with a paraphrase demerit cutoff of CUTOFF. Paraphrases whose\r\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\r\ninstead of a string.\nExecute BODY with a paraphrase demerit cutoff of CUTOFF. Paraphrases whose\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\ninstead of a string.")
    public static SubLObject with_pph_demerit_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list283);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject cutoff = (current.isCons()) ? current.first() : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
        destructuring_bind_must_listp(current, datum, $list283);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(PPH_CHECK_TYPE, cutoff, $list285), listS(CLET, list(list($pph_demerit_cutoff$, cutoff)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list283);
        return NIL;
    }

    /**
     * Execute BODY with a paraphrase demerit cutoff of no more than CUTOFF, using
     * the existing cutoff if it is lower. Paraphrases whose
     * demerit score are higher than CUTOFF will not be returned. NIL will be returned
     * instead of a string.
     */
    @LispMethod(comment = "Execute BODY with a paraphrase demerit cutoff of no more than CUTOFF, using\r\nthe existing cutoff if it is lower. Paraphrases whose\r\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\r\ninstead of a string.\nExecute BODY with a paraphrase demerit cutoff of no more than CUTOFF, using\nthe existing cutoff if it is lower. Paraphrases whose\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\ninstead of a string.")
    public static final SubLObject with_maximum_pph_demerit_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cutoff = (current.isCons()) ? ((SubLObject) (current.first())) : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
                    destructuring_bind_must_listp(current, datum, $list_alt254);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(PPH_CHECK_TYPE, cutoff, $list_alt256), listS(CLET, list(list($pph_demerit_cutoff$, list(COMPUTE_NEW_PPH_DEMERIT_CUTOFF, cutoff))), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt254);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with a paraphrase demerit cutoff of no more than CUTOFF, using
     * the existing cutoff if it is lower. Paraphrases whose
     * demerit score are higher than CUTOFF will not be returned. NIL will be returned
     * instead of a string.
     */
    @LispMethod(comment = "Execute BODY with a paraphrase demerit cutoff of no more than CUTOFF, using\r\nthe existing cutoff if it is lower. Paraphrases whose\r\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\r\ninstead of a string.\nExecute BODY with a paraphrase demerit cutoff of no more than CUTOFF, using\nthe existing cutoff if it is lower. Paraphrases whose\ndemerit score are higher than CUTOFF will not be returned. NIL will be returned\ninstead of a string.")
    public static SubLObject with_maximum_pph_demerit_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list283);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject cutoff = (current.isCons()) ? current.first() : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
        destructuring_bind_must_listp(current, datum, $list283);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(PPH_CHECK_TYPE, cutoff, $list285), listS(CLET, list(list($pph_demerit_cutoff$, list(COMPUTE_NEW_PPH_DEMERIT_CUTOFF, cutoff))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list283);
        return NIL;
    }

    public static final SubLObject valid_pph_demerit_cutoff_p_alt(SubLObject v_object) {
        return number_utilities.non_negative_potentially_infinite_number_p(v_object);
    }

    public static SubLObject valid_pph_demerit_cutoff_p(final SubLObject v_object) {
        return number_utilities.non_negative_potentially_infinite_number_p(v_object);
    }

    public static final SubLObject compute_new_pph_demerit_cutoff_alt(SubLObject maximum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cutoffs = list_utilities.remove_if_not(symbol_function(INTEGERP), list(maximum, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL != cutoffs ? ((SubLObject) (number_utilities.minimum(cutoffs, UNPROVIDED))) : number_utilities.positive_infinity();
            }
        }
    }

    public static SubLObject compute_new_pph_demerit_cutoff(final SubLObject maximum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cutoffs = list_utilities.remove_if_not(symbol_function(INTEGERP), list(maximum, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != cutoffs ? number_utilities.minimum(cutoffs, UNPROVIDED) : number_utilities.positive_infinity();
    }

    public static SubLObject with_pph_phrase_destruction_grace_period(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject seconds = NIL;
        destructuring_bind_must_consp(current, datum, $list290);
        seconds = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject old_grace_period = $sym291$OLD_GRACE_PERIOD;
            return list(CLET, list(bq_cons(old_grace_period, $list292)), list(CUNWIND_PROTECT, list(PROGN, list(SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD, list(MAX, old_grace_period, seconds)), listS(CLET, $list295, append(body, NIL)))), list(SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD, old_grace_period));
        }
        cdestructuring_bind_error(datum, $list290);
        return NIL;
    }

    /**
     * Execute BODY while keeping track of proofs that have been displayed and/or justified,
     * to avoid doing so repeatedly.
     */
    @LispMethod(comment = "Execute BODY while keeping track of proofs that have been displayed and/or justified,\r\nto avoid doing so repeatedly.\nExecute BODY while keeping track of proofs that have been displayed and/or justified,\nto avoid doing so repeatedly.")
    public static final SubLObject remembering_pph_proofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt261, append(body, NIL));
        }
    }

    /**
     * Execute BODY while keeping track of proofs that have been displayed and/or justified,
     * to avoid doing so repeatedly.
     */
    @LispMethod(comment = "Execute BODY while keeping track of proofs that have been displayed and/or justified,\r\nto avoid doing so repeatedly.\nExecute BODY while keeping track of proofs that have been displayed and/or justified,\nto avoid doing so repeatedly.")
    public static SubLObject remembering_pph_proofs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list296, append(body, NIL));
    }

    public static SubLObject with_pph_inference_answer(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list297);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_answer = NIL;
        destructuring_bind_must_consp(current, datum, $list297);
        inference_answer = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list($pph_inference_answer$, inference_answer)), listS(WITH_PPH_INFERENCE, list(list(INFERENCE_ANSWER_INFERENCE, inference_answer)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list297);
        return NIL;
    }

    public static SubLObject with_pph_inference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list301);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list301);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($pph_hypothetical_vars$, list(INFERENCE_HYPOTHETICAL_BINDINGS, inference)), $list304, list($pph_domain_mt$, list(PPH_ENHANCED_DOMAIN_MT, list(PPH_GET_INFERENCE_MT, inference)))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list301);
        return NIL;
    }

    public static final SubLObject with_pph_justification_generation_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt262);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject inference_answer = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt262);
                    inference_answer = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject link_function = $sym263$LINK_FUNCTION;
                            SubLObject html_target = $sym264$HTML_TARGET;
                            return list(CLET, listS(list($pph_inference_answer$, inference_answer), list($pph_hypothetical_vars$, list(INFERENCE_HYPOTHETICAL_BINDINGS, list(INFERENCE_ANSWER_INFERENCE, inference_answer))), $list_alt269), list(CMULTIPLE_VALUE_BIND, list(link_function, html_target), $list_alt270, listS(WITH_PPH_HTML_FUNCTION_AND_TARGET, list(link_function, html_target), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt262);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_pph_justification_generation_parameters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list297);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_answer = NIL;
        destructuring_bind_must_consp(current, datum, $list297);
        inference_answer = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_PPH_INFERENCE_ANSWER, list(inference_answer), list(CLET, $list308, bq_cons(POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list297);
        return NIL;
    }

    public static SubLObject possibly_with_pph_html_justification_generation_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject link_function = $sym310$LINK_FUNCTION;
        final SubLObject html_target = $sym311$HTML_TARGET;
        return list(CMULTIPLE_VALUE_BIND, list(link_function, html_target), $list312, listS(WITH_PPH_HTML_FUNCTION_AND_TARGET, list(link_function, html_target), append(body, NIL)));
    }

    public static final SubLObject pph_possibly_enable_showXhide_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
            }
            return NIL;
        }
    }

    public static SubLObject pph_possibly_enable_showXhide() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
        }
        return NIL;
    }

    public static final SubLObject pph_justification_html_function_and_target_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject link_function = pph_vars.$constant_link_function$.getDynamicValue(thread);
                SubLObject target = pph_vars.$html_generation_target$.getDynamicValue(thread);
                if (NIL != pph_vars.$pph_use_cb_uia_display_methodsP$.getDynamicValue(thread)) {
                    link_function = uia_trampolines.uia_get_default_pph_link_function();
                    target = uia_trampolines.uia_get_default_pph_frame_name();
                }
                return values(link_function, target);
            }
        }
    }

    public static SubLObject pph_justification_html_function_and_target() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_function = pph_vars.$constant_link_function$.getDynamicValue(thread);
        final SubLObject target = pph_vars.$html_generation_target$.getDynamicValue(thread);
        return values(link_function, target);
    }

    /**
     * Execute BODY using a provisional stand-in for *PPH-VAR-TYPES*. If at the end
     * of BODY, PHRASE is done, then use the provisional var-types. Otherwise, revert
     * to what it was before entering BODY.
     */
    @LispMethod(comment = "Execute BODY using a provisional stand-in for *PPH-VAR-TYPES*. If at the end\r\nof BODY, PHRASE is done, then use the provisional var-types. Otherwise, revert\r\nto what it was before entering BODY.\nExecute BODY using a provisional stand-in for *PPH-VAR-TYPES*. If at the end\nof BODY, PHRASE is done, then use the provisional var-types. Otherwise, revert\nto what it was before entering BODY.")
    public static final SubLObject pph_setting_var_types_if_successful_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt274);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt274);
                    phrase = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject var_types_shadow = $sym275$VAR_TYPES_SHADOW;
                            return list(CLET, bq_cons(bq_cons(var_types_shadow, $list_alt276), $list_alt277), $list_alt278, list(CUNWIND_PROTECT, listS(CLET, list(list($pph_var_types$, var_types_shadow)), append(body, NIL)), $list_alt280, listS(PIF, list($sym281$PPH_PHRASE_DONE_, phrase), list(PROGN, $list_alt282, list(PPH_NOTE, ONE_INTEGER, $str_alt283$___Setting__S_to____S, $pph_var_types$, list(DICTIONARY_VALUES, var_types_shadow)), list(PPH_RESET_VAR_TYPES, var_types_shadow)), $list_alt286)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt274);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY using a provisional stand-in for *PPH-VAR-TYPES*. If at the end
     * of BODY, PHRASE is done, then use the provisional var-types. Otherwise, revert
     * to what it was before entering BODY.
     */
    @LispMethod(comment = "Execute BODY using a provisional stand-in for *PPH-VAR-TYPES*. If at the end\r\nof BODY, PHRASE is done, then use the provisional var-types. Otherwise, revert\r\nto what it was before entering BODY.\nExecute BODY using a provisional stand-in for *PPH-VAR-TYPES*. If at the end\nof BODY, PHRASE is done, then use the provisional var-types. Otherwise, revert\nto what it was before entering BODY.")
    public static SubLObject pph_setting_var_types_if_successful(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list316);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list316);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject var_types_shadow = $sym317$VAR_TYPES_SHADOW;
            return list(CLET, bq_cons(bq_cons(var_types_shadow, $list318), $list319), $list320, list(CUNWIND_PROTECT, listS(CLET, list(list($pph_var_types$, var_types_shadow)), append(body, NIL)), $list322, listS(PIF, list($sym323$PPH_PHRASE_DONE_, phrase), list(PROGN, $list324, list(PPH_NOTE, ONE_INTEGER, $str325$___Setting__S_to____S, $pph_var_types$, list(DICTIONARY_VALUES, var_types_shadow)), list(PPH_RESET_VAR_TYPES, var_types_shadow)), $list328)));
        }
        cdestructuring_bind_error(datum, $list316);
        return NIL;
    }

    public static final SubLObject pph_reset_var_types_alt(SubLObject var_types_shadow) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            pph_variable_handling.clear_pph_var_types();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_types_shadow));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject var_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, var_entry);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return pph_vars.$pph_var_types$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_reset_var_types(final SubLObject var_types_shadow) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_variable_handling.clear_pph_var_types();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_types_shadow)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject var_entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, var_entry);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static final SubLObject pph_possibly_binding_variables_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject old_pph_vars = $sym288$OLD_PPH_VARS;
            return list(CLET, listS($list_alt289, bq_cons(old_pph_vars, $list_alt290), $list_alt291), $list_alt292, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CLET, list(list(LOCAL_VARS, list(SET_DIFFERENCE, $list_alt295, old_pph_vars))), $list_alt296)));
        }
    }

    public static SubLObject pph_possibly_binding_variables(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject old_pph_vars = $sym330$OLD_PPH_VARS;
        return list(CLET, listS($list331, bq_cons(old_pph_vars, $list332), $list333), $list334, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CLET, list(list(LOCAL_VARS, list(SET_DIFFERENCE, $list337, old_pph_vars))), $list338)));
    }

    public static final SubLObject pph_handle_local_vars_alt(SubLObject local_vars) {
        {
            SubLObject cdolist_list_var = local_vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format(T, $str_alt299$_Deregistering__S__, var);
                }
                pph_variable_handling.pph_deregister_var(var);
                pph_drs.pph_remove_rm_with_cycl(var);
            }
        }
        return NIL;
    }

    public static SubLObject pph_handle_local_vars(final SubLObject local_vars) {
        SubLObject cdolist_list_var = local_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str341$__Deregistering__S__, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_variable_handling.pph_deregister_var(var);
            pph_drs.pph_remove_rm_with_cycl(var);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject destructure_pph_pronoun_agr_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt300);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject person = NIL;
                    SubLObject number = NIL;
                    SubLObject gender = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt300);
                    person = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt300);
                    number = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt300);
                    gender = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject pronoun_agr = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt300);
                            pronoun_agr = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CDESTRUCTURING_BIND, list(person, number, gender), pronoun_agr, append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt300);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_pph_pronoun_agr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject person = NIL;
        SubLObject number = NIL;
        SubLObject gender = NIL;
        destructuring_bind_must_consp(current, datum, $list342);
        person = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        gender = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject pronoun_agr = NIL;
            destructuring_bind_must_consp(current, datum, $list342);
            pronoun_agr = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(person, number, gender), pronoun_agr, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list342);
        return NIL;
    }

    public static final SubLObject pph_phrase_do_agr_constraints_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt302);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject agr_constraint = NIL;
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt302);
                    agr_constraint = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt302);
                    phrase = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list(agr_constraint, list(PPH_PHRASE_AGR, phrase))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt302);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject pph_phrase_do_agr_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list344);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject agr_constraint = NIL;
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list344);
        agr_constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list344);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(agr_constraint, list(PPH_PHRASE_AGR, phrase))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list344);
        return NIL;
    }

    /**
     * Iterate over the available phrase templates for FORMULA until DONE is non-nil.
     */
    @LispMethod(comment = "Iterate over the available phrase templates for FORMULA until DONE is non-nil.")
    public static final SubLObject do_pph_phrase_templates_for_formula_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt304);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject template = NIL;
                    SubLObject formula = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt304);
                    template = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt304);
                    formula = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt304);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt304);
                            if (NIL == member(current_4, $list_alt305, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt304);
                        }
                        {
                            SubLObject reln_tail = property_list_member($RELN, current);
                            SubLObject reln = (NIL != reln_tail) ? ((SubLObject) (cadr(reln_tail))) : NIL;
                            SubLObject arg_position_map_tail = property_list_member($ARG_POSITION_MAP, current);
                            SubLObject arg_position_map = (NIL != arg_position_map_tail) ? ((SubLObject) (cadr(arg_position_map_tail))) : pph_utilities.pph_new_empty_map();
                            SubLObject inverseP_tail = property_list_member($INVERSE_, current);
                            SubLObject inverseP = (NIL != inverseP_tail) ? ((SubLObject) (cadr(inverseP_tail))) : IGNORE_ME;
                            SubLObject nl_preds_tail = property_list_member($NL_PREDS, current);
                            SubLObject nl_preds = (NIL != nl_preds_tail) ? ((SubLObject) (cadr(nl_preds_tail))) : $ANY;
                            SubLObject wide_scope_argnum_tail = property_list_member($WIDE_SCOPE_ARGNUM, current);
                            SubLObject wide_scope_argnum = (NIL != wide_scope_argnum_tail) ? ((SubLObject) (cadr(wide_scope_argnum_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject generator = $sym313$GENERATOR;
                                return list(CLET, list(list(generator, list(GET_PPH_PHRASE_TEMPLATE_GENERATOR, formula, wide_scope_argnum, reln, nl_preds, arg_position_map))), list(CUNWIND_PROTECT, list(UNTIL, list(COR, done, list(PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P, generator)), list(CMULTIPLE_VALUE_BIND, list(template, inverseP), list(PPH_PHRASE_TEMPLATE_GENERATOR_NEXT, generator), list(IGNORE, inverseP), listS(PWHEN, list(PPH_PHRASE_P, template), append(body, NIL))))), list(FREE_PPH_PHRASE_TEMPLATE_GENERATOR, generator));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over the available phrase templates for FORMULA until DONE is non-nil.
     */
    @LispMethod(comment = "Iterate over the available phrase templates for FORMULA until DONE is non-nil.")
    public static SubLObject do_pph_phrase_templates_for_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list346);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject template = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list346);
        template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list346);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list346);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list346);
            if (NIL == member(current_$7, $list347, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list346);
        }
        final SubLObject reln_tail = property_list_member($RELN, current);
        final SubLObject reln = (NIL != reln_tail) ? cadr(reln_tail) : NIL;
        final SubLObject arg_position_map_tail = property_list_member($ARG_POSITION_MAP, current);
        final SubLObject arg_position_map = (NIL != arg_position_map_tail) ? cadr(arg_position_map_tail) : pph_utilities.pph_new_empty_map();
        final SubLObject inverseP_tail = property_list_member($INVERSE_, current);
        final SubLObject inverseP = (NIL != inverseP_tail) ? cadr(inverseP_tail) : IGNORE_ME;
        final SubLObject nl_preds_tail = property_list_member($NL_PREDS, current);
        final SubLObject nl_preds = (NIL != nl_preds_tail) ? cadr(nl_preds_tail) : $ANY;
        final SubLObject focus_argnum_tail = property_list_member($FOCUS_ARGNUM, current);
        final SubLObject focus_argnum = (NIL != focus_argnum_tail) ? cadr(focus_argnum_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject generator = $sym355$GENERATOR;
        return list(CLET, list(list(generator, list(GET_PPH_PHRASE_TEMPLATE_GENERATOR, formula, focus_argnum, reln, nl_preds, arg_position_map))), list(CUNWIND_PROTECT, list(UNTIL, list(COR, done, list(PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P, generator)), list(CMULTIPLE_VALUE_BIND, list(template, inverseP), list(PPH_PHRASE_TEMPLATE_GENERATOR_NEXT, generator), list(IGNORE, inverseP), listS(PWHEN, list(PPH_PHRASE_P, template), append(body, NIL))))), list(FREE_PPH_PHRASE_TEMPLATE_GENERATOR, generator));
    }

    /**
     * Iteratively bind PPH-PHRASE to phrases from the gen-template store appropriate and customized
     * for FORMULA.
     */
    @LispMethod(comment = "Iteratively bind PPH-PHRASE to phrases from the gen-template store appropriate and customized\r\nfor FORMULA.\nIteratively bind PPH-PHRASE to phrases from the gen-template store appropriate and customized\nfor FORMULA.")
    public static final SubLObject do_pph_phrases_for_formula_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt319);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_pph_phrase = NIL;
                    SubLObject formula = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt319);
                    v_pph_phrase = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt319);
                    formula = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt319);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt319);
                            if (NIL == member(current_5, $list_alt320, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt319);
                        }
                        {
                            SubLObject wide_scope_arg_tail = property_list_member($WIDE_SCOPE_ARG, current);
                            SubLObject wide_scope_arg = (NIL != wide_scope_arg_tail) ? ((SubLObject) (cadr(wide_scope_arg_tail))) : NIL;
                            SubLObject arg_position_map_tail = property_list_member($ARG_POSITION_MAP, current);
                            SubLObject arg_position_map = (NIL != arg_position_map_tail) ? ((SubLObject) (cadr(arg_position_map_tail))) : NIL;
                            SubLObject nl_preds_tail = property_list_member($NL_PREDS, current);
                            SubLObject nl_preds = (NIL != nl_preds_tail) ? ((SubLObject) (cadr(nl_preds_tail))) : $ANY;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject phrase_template = $sym322$PHRASE_TEMPLATE;
                                return list(DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA, list(new SubLObject[]{ phrase_template, formula, $WIDE_SCOPE_ARGNUM, wide_scope_arg, $ARG_POSITION_MAP, arg_position_map, $NL_PREDS, nl_preds, $DONE, done }), listS(CLET, list(list(v_pph_phrase, list(PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER, phrase_template, formula, arg_position_map, nl_preds))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iteratively bind PPH-PHRASE to phrases from the gen-template store appropriate and customized
     * for FORMULA.
     */
    @LispMethod(comment = "Iteratively bind PPH-PHRASE to phrases from the gen-template store appropriate and customized\r\nfor FORMULA.\nIteratively bind PPH-PHRASE to phrases from the gen-template store appropriate and customized\nfor FORMULA.")
    public static SubLObject do_pph_phrases_for_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list361);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_pph_phrase = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list361);
        v_pph_phrase = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list361);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list361);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list361);
            if (NIL == member(current_$8, $list362, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list361);
        }
        final SubLObject focus_arg_tail = property_list_member($FOCUS_ARG, current);
        final SubLObject focus_arg = (NIL != focus_arg_tail) ? cadr(focus_arg_tail) : NIL;
        final SubLObject arg_position_map_tail = property_list_member($ARG_POSITION_MAP, current);
        final SubLObject arg_position_map = (NIL != arg_position_map_tail) ? cadr(arg_position_map_tail) : NIL;
        final SubLObject nl_preds_tail = property_list_member($NL_PREDS, current);
        final SubLObject nl_preds = (NIL != nl_preds_tail) ? cadr(nl_preds_tail) : $ANY;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject phrase_template = $sym364$PHRASE_TEMPLATE;
        return list(DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA, list(new SubLObject[]{ phrase_template, formula, $FOCUS_ARGNUM, focus_arg, $ARG_POSITION_MAP, arg_position_map, $NL_PREDS, nl_preds, $DONE, done }), listS(CLET, list(list(v_pph_phrase, list(PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER, phrase_template, formula, arg_position_map, nl_preds))), append(body, NIL)));
    }

    public static final SubLObject max_suspended_method_depth_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $max_suspended_method_depth$.getDynamicValue(thread);
        }
    }

    public static SubLObject max_suspended_method_depth() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $max_suspended_method_depth$.getDynamicValue(thread);
    }

    public static final SubLObject handling_pph_method_failures_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = makeBoolean((NIL != $allow_handling_of_pph_method_failuresP$.getDynamicValue(thread)) && (NIL != $handling_pph_method_failuresP$.getDynamicValue(thread)));
                return ans;
            }
        }
    }

    public static SubLObject handling_pph_method_failures_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = makeBoolean((NIL != $allow_handling_of_pph_method_failuresP$.getDynamicValue(thread)) && (NIL != $handling_pph_method_failuresP$.getDynamicValue(thread)));
        return ans;
    }

    public static final SubLObject handling_pph_method_failures_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject failed_method = $sym328$FAILED_METHOD;
            SubLObject tried_oneP = $sym329$TRIED_ONE_;
            SubLObject top_levelP = $sym330$TOP_LEVEL_;
            return list(CLET, list(bq_cons(top_levelP, $list_alt331), list($suspended_paraphrase_methods$, listS(FIF, top_levelP, $list_alt333)), $list_alt334, bq_cons(failed_method, $list_alt105), bq_cons(tried_oneP, $list_alt105)), list(WHILE, list(COR, failed_method, list(CNOT, tried_oneP)), list(PWHEN, failed_method, list(NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, failed_method), listS(CSETQ, failed_method, $list_alt105)), listS(CCATCH, $PPH_METHOD_FAILURE, failed_method, append(body, NIL)), listS(CSETQ, tried_oneP, $list_alt156)));
        }
    }

    public static SubLObject handling_pph_method_failures(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject failed_method = $sym370$FAILED_METHOD;
        final SubLObject tried_oneP = $sym371$TRIED_ONE_;
        final SubLObject top_levelP = $sym372$TOP_LEVEL_;
        return list(CLET, list(bq_cons(top_levelP, $list373), list($suspended_paraphrase_methods$, listS(FIF, top_levelP, $list375)), $list376, bq_cons(failed_method, $list121), bq_cons(tried_oneP, $list121)), list(WHILE, list(COR, failed_method, list(CNOT, tried_oneP)), list(PWHEN, failed_method, list(NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, failed_method), listS(CSETQ, failed_method, $list121)), listS(CCATCH, $PPH_METHOD_FAILURE, failed_method, append(body, NIL)), listS(CSETQ, tried_oneP, $list180)));
    }

    public static final SubLObject handling_pph_method_failures_top_level_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = makeBoolean(NIL == $handling_pph_method_failuresP$.getDynamicValue(thread));
                return ans;
            }
        }
    }

    public static SubLObject handling_pph_method_failures_top_level_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = makeBoolean(NIL == $handling_pph_method_failuresP$.getDynamicValue(thread));
        return ans;
    }

    public static final SubLObject throw_pph_method_failure_alt(SubLObject data) {
        sublisp_throw($PPH_METHOD_FAILURE, data);
        return data;
    }

    public static SubLObject throw_pph_method_failure(final SubLObject data) {
        sublisp_throw($PPH_METHOD_FAILURE, data);
        return data;
    }

    public static final SubLObject note_suspended_paraphrase_method_plist_alt(SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == handling_pph_method_failures_p()) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt340$Can_t_note_PPH_method_failure__no) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL != set.set_memberP(plist, $suspended_paraphrase_methods$.getDynamicValue(thread))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt341$_S___is_already_suspended_) });
                    pph_error.pph_handle_error(new_format_string, list(plist));
                }
            }
            set.set_add(plist, $suspended_paraphrase_methods$.getDynamicValue(thread));
            if (set.set_size($suspended_paraphrase_methods$.getDynamicValue(thread)).numG($max_suspended_method_depth$.getDynamicValue(thread))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt88$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(TWO_INTEGER), $str_alt89$__, format_nil_a_no_copy($str_alt342$Over__S_suspended_methods____Curr) });
                    pph_error.pph_handle_error(new_format_string, list($max_suspended_method_depth$.getDynamicValue(thread), plist));
                }
            }
            return $suspended_paraphrase_methods$.getDynamicValue(thread);
        }
    }

    public static SubLObject note_suspended_paraphrase_method_plist(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == handling_pph_method_failures_p()) {
            final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str102$__, format_nil.format_nil_a_no_copy($str382$Can_t_note_PPH_method_failure__no) });
            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        if (NIL != set.set_memberP(plist, $suspended_paraphrase_methods$.getDynamicValue(thread))) {
            final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str102$__, format_nil.format_nil_a_no_copy($str383$_S___is_already_suspended_) });
            pph_error.pph_handle_error(new_format_string, list(plist));
        }
        set.set_add(plist, $suspended_paraphrase_methods$.getDynamicValue(thread));
        if (set.set_size($suspended_paraphrase_methods$.getDynamicValue(thread)).numG($max_suspended_method_depth$.getDynamicValue(thread))) {
            final SubLObject new_format_string = cconcatenate($str101$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(TWO_INTEGER), $str102$__, format_nil.format_nil_a_no_copy($str384$Over__S_suspended_methods____Curr) });
            pph_error.pph_handle_error(new_format_string, list($max_suspended_method_depth$.getDynamicValue(thread), plist));
        }
        return $suspended_paraphrase_methods$.getDynamicValue(thread);
    }

    public static final SubLObject clear_pph_suspended_methods_for_cycl_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL != $handling_pph_method_failuresP$.getDynamicValue(thread)) {
                    {
                        SubLObject doomed = NIL;
                        SubLObject set_contents_var = set.do_set_internal($suspended_paraphrase_methods$.getDynamicValue(thread));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject method = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, method)) {
                                    if (getf(method, $CYCL, UNPROVIDED).equal(cycl)) {
                                        doomed = cons(method, doomed);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = doomed;
                            SubLObject method = NIL;
                            for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                                count = add(count, ONE_INTEGER);
                                set.set_remove(method, $suspended_paraphrase_methods$.getDynamicValue(thread));
                            }
                        }
                    }
                    if (count.isPositive()) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt344$Cleared__S_suspended_methods_for_, count, cycl);
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject clear_pph_suspended_methods_for_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL != $handling_pph_method_failuresP$.getDynamicValue(thread)) {
            SubLObject doomed = NIL;
            final SubLObject set_contents_var = set.do_set_internal($suspended_paraphrase_methods$.getDynamicValue(thread));
            SubLObject basis_object;
            SubLObject state;
            SubLObject method;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                method = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, method)) && getf(method, $CYCL, UNPROVIDED).equal(cycl)) {
                    doomed = cons(method, doomed);
                }
            }
            SubLObject cdolist_list_var = doomed;
            SubLObject method2 = NIL;
            method2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, ONE_INTEGER);
                set.set_remove(method2, $suspended_paraphrase_methods$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                method2 = cdolist_list_var.first();
            } 
            if (count.isPositive() && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format_nil.force_format(T, $str386$Cleared__S_suspended_methods_for_, count, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return count;
    }

    /**
     * Execute BODY with the paraphrase method whose name is METHOD-SYMBOL for
     * OBJECT-TYPE, if specified, otherwise for all object types.
     */
    @LispMethod(comment = "Execute BODY with the paraphrase method whose name is METHOD-SYMBOL for\r\nOBJECT-TYPE, if specified, otherwise for all object types.\nExecute BODY with the paraphrase method whose name is METHOD-SYMBOL for\nOBJECT-TYPE, if specified, otherwise for all object types.")
    public static final SubLObject suspending_paraphrase_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt345);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_symbol = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt345);
                    method_symbol = current.first();
                    current = current.rest();
                    {
                        SubLObject object_type = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt345);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject info = $sym346$INFO;
                                return list(CLET, list(list(info, list(PPH_METHOD_INFO, method_symbol, object_type))), list(PPH_DEREGISTER_METHOD_INFO, method_symbol, info), bq_cons(CUNWIND_PROTECT, append(body, list(list(PPH_REGISTER_METHOD_INFO, method_symbol, info)))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt345);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with the paraphrase method whose name is METHOD-SYMBOL for
     * OBJECT-TYPE, if specified, otherwise for all object types.
     */
    @LispMethod(comment = "Execute BODY with the paraphrase method whose name is METHOD-SYMBOL for\r\nOBJECT-TYPE, if specified, otherwise for all object types.\nExecute BODY with the paraphrase method whose name is METHOD-SYMBOL for\nOBJECT-TYPE, if specified, otherwise for all object types.")
    public static SubLObject suspending_paraphrase_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list387);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_symbol = NIL;
        destructuring_bind_must_consp(current, datum, $list387);
        method_symbol = current.first();
        current = current.rest();
        final SubLObject object_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list387);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject info = $sym388$INFO;
            return list(CLET, list(list(info, list(PPH_METHOD_INFO, method_symbol, object_type))), list(PPH_DEREGISTER_METHOD_INFO, method_symbol, info), bq_cons(CUNWIND_PROTECT, append(body, list(list(PPH_REGISTER_METHOD_INFO, method_symbol, info)))));
        }
        cdestructuring_bind_error(datum, $list387);
        return NIL;
    }

    /**
     * Execute BODY without using METHODS for term paraphrase.
     */
    @LispMethod(comment = "Execute BODY without using METHODS for term paraphrase.")
    public static final SubLObject omitting_pph_select_string_methods_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_methods = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt350);
            v_methods = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($select_string_methods_to_omit$, v_methods)), append(body, NIL));
            }
        }
    }

    /**
     * Execute BODY without using METHODS for term paraphrase.
     */
    @LispMethod(comment = "Execute BODY without using METHODS for term paraphrase.")
    public static SubLObject omitting_pph_select_string_methods(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_methods = NIL;
        destructuring_bind_must_consp(current, datum, $list392);
        v_methods = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($select_string_methods_to_omit$, v_methods)), append(body, NIL));
    }

    public static final SubLObject handling_pph_mt_scope_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt274);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt274);
                    phrase = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject save_cycl = $sym352$SAVE_CYCL;
                            return list(CLET, list(list(save_cycl, list(PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, phrase))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, phrase, save_cycl)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt274);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject handling_pph_mt_scope(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list316);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list316);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject save_cycl = $sym394$SAVE_CYCL;
            return list(CLET, list(list(save_cycl, list(PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, phrase))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, phrase, save_cycl)));
        }
        cdestructuring_bind_error(datum, $list316);
        return NIL;
    }

    /**
     * If PHRASE's cycl is a formula with scope, reset the cycl and return the original
     */
    @LispMethod(comment = "If PHRASE\'s cycl is a formula with scope, reset the cycl and return the original")
    public static final SubLObject pph_phrase_restrict_cycl_to_mt_scope_alt(SubLObject phrase) {
        {
            SubLObject save_cycl = NIL;
            if (NIL != pph_utilities.pph_formula_wXmt_scopeP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
                save_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt356$Removing_MT_scope_from__S, save_cycl);
                }
                pph_phrase.pph_phrase_reset_cycl(phrase, pph_utilities.pph_cycl_template_from_arg_position($list_alt357));
                {
                    SubLObject old_agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                    SubLObject new_agr_preds = pph_utilities.pph_adjust_nl_preds_for_mt_scope(save_cycl, old_agr_preds);
                    if (!old_agr_preds.equal(new_agr_preds)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt358$Updating_agr_preds_to__S_based_on, new_agr_preds);
                        }
                        pph_phrase.pph_phrase_set_agr_preds(phrase, new_agr_preds, UNPROVIDED);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt359$New_agr_preds___S, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED));
                        }
                    }
                }
            }
            return save_cycl;
        }
    }

    /**
     * If PHRASE's cycl is a formula with scope, reset the cycl and return the original
     */
    @LispMethod(comment = "If PHRASE\'s cycl is a formula with scope, reset the cycl and return the original")
    public static SubLObject pph_phrase_restrict_cycl_to_mt_scope(final SubLObject phrase) {
        SubLObject save_cycl = NIL;
        if (NIL != pph_utilities.pph_formula_wXmt_scopeP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
            save_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str398$Removing_MT_scope_from__S, save_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_reset_cycl(phrase, pph_utilities.pph_cycl_template_from_arg_position($list399));
            final SubLObject old_agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
            final SubLObject new_agr_preds = pph_utilities.pph_adjust_nl_preds_for_mt_scope(save_cycl, old_agr_preds);
            if (!old_agr_preds.equal(new_agr_preds)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str400$Updating_agr_preds_to__S_based_on, new_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_preds(phrase, new_agr_preds, UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str401$New_agr_preds___S, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return save_cycl;
    }

    /**
     * Reset the CycL of PHRASE to its original, while attaching an mt-scope's phrase(s) to either side
     *
     * @unknown This defaults to suppressing generation of the non-temporal aspects when *pph-terse-mode?* is t
     * @unknown This will tend to produce bad results of the 'core' phrase hasn't set strings yet
     */
    @LispMethod(comment = "Reset the CycL of PHRASE to its original, while attaching an mt-scope\'s phrase(s) to either side\r\n\r\n@unknown This defaults to suppressing generation of the non-temporal aspects when *pph-terse-mode?* is t\r\n@unknown This will tend to produce bad results of the \'core\' phrase hasn\'t set strings yet")
    public static final SubLObject pph_phrase_restore_and_rephrase_cycl_if_mt_scoped_alt(SubLObject phrase, SubLObject cycl, SubLObject temporal_onlyP) {
        if (temporal_onlyP == UNPROVIDED) {
            temporal_onlyP = pph_vars.$pph_terse_mt_scopeP$.getDynamicValue();
        }
        if (NIL != pph_utilities.pph_formula_wXmt_scopeP(cycl)) {
            pph_phrase_restore_cycl(phrase, cycl);
            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                pph_phrase_add_mt_scope_paraphrases(phrase, pph_utilities.pph_mt_scope(cycl), temporal_onlyP);
                if (NIL != pph_phrase.pph_phrase_dtr_output_lists(phrase)) {
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                }
            }
        }
        return phrase;
    }

    /**
     * Reset the CycL of PHRASE to its original, while attaching an mt-scope's phrase(s) to either side
     *
     * @unknown This defaults to suppressing generation of the non-temporal aspects when *pph-terse-mode?* is t
     * @unknown This will tend to produce bad results of the 'core' phrase hasn't set strings yet
     */
    @LispMethod(comment = "Reset the CycL of PHRASE to its original, while attaching an mt-scope\'s phrase(s) to either side\r\n\r\n@unknown This defaults to suppressing generation of the non-temporal aspects when *pph-terse-mode?* is t\r\n@unknown This will tend to produce bad results of the \'core\' phrase hasn\'t set strings yet")
    public static SubLObject pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(final SubLObject phrase, final SubLObject cycl, SubLObject temporal_onlyP) {
        if (temporal_onlyP == UNPROVIDED) {
            temporal_onlyP = pph_vars.$pph_terse_mt_scopeP$.getDynamicValue();
        }
        if (NIL != pph_utilities.pph_formula_wXmt_scopeP(cycl)) {
            pph_phrase_restore_cycl(phrase, cycl);
            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                pph_phrase_add_mt_scope_paraphrases(phrase, pph_utilities.pph_mt_scope(cycl), temporal_onlyP);
                if (NIL != pph_phrase.pph_phrase_dtr_output_lists(phrase)) {
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                }
            }
        }
        return phrase;
    }

    /**
     *
     *
     * @param PPH-PHRASE-P
     * 		
     * @param LISTP
     * 		of MT's
     * @param TEMPORAL-ONLY?
     * 		- if non-NIL, skip non-temporal information from MT-SCOPE.
     * @return PPH-PHRASE-OUTPUT-LIST-P of PHRASE, with all MT's added to it (with generations).
     */
    @LispMethod(comment = "@param PPH-PHRASE-P\r\n\t\t\r\n@param LISTP\r\n\t\tof MT\'s\r\n@param TEMPORAL-ONLY?\r\n\t\t- if non-NIL, skip non-temporal information from MT-SCOPE.\r\n@return PPH-PHRASE-OUTPUT-LIST-P of PHRASE, with all MT\'s added to it (with generations).")
    public static final SubLObject pph_phrase_add_mt_scope_paraphrases_alt(SubLObject phrase, SubLObject mt_scope, SubLObject temporal_onlyP) {
        if (temporal_onlyP == UNPROVIDED) {
            temporal_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pph_utilities.pph_mt_scope_p(mt_scope)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt360$Adding_Mt_scope_paraphrases_to___, pph_phrase.pph_phrase_output_list(phrase));
                }
                {
                    SubLObject failedP = NIL;
                    SubLObject error_message = NIL;
                    {
                        SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                        try {
                            Errors.$continue_cerrorP$.bind(NIL, thread);
                            pph_error.$pph_error_handling_onP$.bind(T, thread);
                            if (NIL != pph_error.pph_break_on_errorP()) {
                                {
                                    SubLObject top_levelP = handling_pph_method_failures_top_level_p();
                                    {
                                        SubLObject _prev_bind_0_6 = $suspended_paraphrase_methods$.currentBinding(thread);
                                        SubLObject _prev_bind_1_7 = $handling_pph_method_failuresP$.currentBinding(thread);
                                        try {
                                            $suspended_paraphrase_methods$.bind(NIL != top_levelP ? ((SubLObject) (set.new_set(symbol_function(EQUAL), max_suspended_method_depth()))) : $suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                                            $handling_pph_method_failuresP$.bind(T, thread);
                                            {
                                                SubLObject failed_method = NIL;
                                                SubLObject tried_oneP = NIL;
                                                while ((NIL != failed_method) || (NIL == tried_oneP)) {
                                                    if (NIL != failed_method) {
                                                        note_suspended_paraphrase_method_plist(failed_method);
                                                        failed_method = NIL;
                                                    }
                                                    try {
                                                        if (NIL == failedP) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject phrase_lists = pph_phrase_get_mt_scope_phrases(phrase, mt_scope, temporal_onlyP);
                                                                SubLObject failed_phrase = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != failed_phrase) {
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                        Errors.warn($str_alt361$Couldn_t_finish_temporal_phrase__, failed_phrase);
                                                                    }
                                                                    pph_phrase.pph_phrase_set_output_list(phrase, NIL, UNPROVIDED);
                                                                    failedP = T;
                                                                }
                                                                {
                                                                    SubLObject temporals_at_endP = pph_temporals_at_endP(phrase);
                                                                    SubLObject datum = phrase_lists;
                                                                    SubLObject current = datum;
                                                                    SubLObject temporal = NIL;
                                                                    SubLObject etc = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt362);
                                                                    temporal = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt362);
                                                                    etc = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                                            {
                                                                                SubLObject cdolist_list_var = temporal;
                                                                                SubLObject mt_phrase = NIL;
                                                                                for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                    if (NIL != temporals_at_endP) {
                                                                                        pph_phrase.pph_phrase_append(mt_phrase, phrase);
                                                                                    } else {
                                                                                        pph_phrase.pph_phrase_push(pph_data_structures.new_pph_phrase($str_alt363$_, UNPROVIDED, UNPROVIDED), phrase);
                                                                                        pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject cdolist_list_var = reverse(etc);
                                                                                SubLObject mt_phrase = NIL;
                                                                                for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                    pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            {
                                                                                SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
                                                                                {
                                                                                    SubLObject cdolist_list_var = temporal;
                                                                                    SubLObject mt_phrase = NIL;
                                                                                    for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                        olist = (NIL != temporals_at_endP) ? ((SubLObject) (append(olist, pph_phrase.pph_phrase_output_list(mt_phrase)))) : append(pph_phrase.pph_phrase_output_list(mt_phrase), olist);
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject cdolist_list_var = reverse(etc);
                                                                                    SubLObject mt_phrase = NIL;
                                                                                    for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                        olist = append(pph_phrase.pph_phrase_output_list(mt_phrase), olist);
                                                                                    }
                                                                                }
                                                                                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt362);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable ccatch_env_var) {
                                                        failed_method = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                                                    }
                                                    tried_oneP = T;
                                                } 
                                            }
                                        } finally {
                                            $handling_pph_method_failuresP$.rebind(_prev_bind_1_7, thread);
                                            $suspended_paraphrase_methods$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                }
                            } else {
                                try {
                                    {
                                        SubLObject _prev_bind_0_8 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                {
                                                    SubLObject top_levelP = handling_pph_method_failures_top_level_p();
                                                    {
                                                        SubLObject _prev_bind_0_9 = $suspended_paraphrase_methods$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_10 = $handling_pph_method_failuresP$.currentBinding(thread);
                                                        try {
                                                            $suspended_paraphrase_methods$.bind(NIL != top_levelP ? ((SubLObject) (set.new_set(symbol_function(EQUAL), max_suspended_method_depth()))) : $suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                                                            $handling_pph_method_failuresP$.bind(T, thread);
                                                            {
                                                                SubLObject failed_method = NIL;
                                                                SubLObject tried_oneP = NIL;
                                                                while ((NIL != failed_method) || (NIL == tried_oneP)) {
                                                                    if (NIL != failed_method) {
                                                                        note_suspended_paraphrase_method_plist(failed_method);
                                                                        failed_method = NIL;
                                                                    }
                                                                    try {
                                                                        if (NIL == failedP) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject phrase_lists = pph_phrase_get_mt_scope_phrases(phrase, mt_scope, temporal_onlyP);
                                                                                SubLObject failed_phrase = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != failed_phrase) {
                                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                                        Errors.warn($str_alt361$Couldn_t_finish_temporal_phrase__, failed_phrase);
                                                                                    }
                                                                                    pph_phrase.pph_phrase_set_output_list(phrase, NIL, UNPROVIDED);
                                                                                    failedP = T;
                                                                                }
                                                                                {
                                                                                    SubLObject temporals_at_endP = pph_temporals_at_endP(phrase);
                                                                                    SubLObject datum = phrase_lists;
                                                                                    SubLObject current = datum;
                                                                                    SubLObject temporal = NIL;
                                                                                    SubLObject etc = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt362);
                                                                                    temporal = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt362);
                                                                                    etc = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = temporal;
                                                                                                SubLObject mt_phrase = NIL;
                                                                                                for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                                    if (NIL != temporals_at_endP) {
                                                                                                        pph_phrase.pph_phrase_append(mt_phrase, phrase);
                                                                                                    } else {
                                                                                                        pph_phrase.pph_phrase_push(pph_data_structures.new_pph_phrase($str_alt363$_, UNPROVIDED, UNPROVIDED), phrase);
                                                                                                        pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject cdolist_list_var = reverse(etc);
                                                                                                SubLObject mt_phrase = NIL;
                                                                                                for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                                    pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            {
                                                                                                SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = temporal;
                                                                                                    SubLObject mt_phrase = NIL;
                                                                                                    for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                                        olist = (NIL != temporals_at_endP) ? ((SubLObject) (append(olist, pph_phrase.pph_phrase_output_list(mt_phrase)))) : append(pph_phrase.pph_phrase_output_list(mt_phrase), olist);
                                                                                                    }
                                                                                                }
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = reverse(etc);
                                                                                                    SubLObject mt_phrase = NIL;
                                                                                                    for (mt_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_phrase = cdolist_list_var.first()) {
                                                                                                        olist = append(pph_phrase.pph_phrase_output_list(mt_phrase), olist);
                                                                                                    }
                                                                                                }
                                                                                                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt362);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable ccatch_env_var) {
                                                                        failed_method = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                                                                    }
                                                                    tried_oneP = T;
                                                                } 
                                                            }
                                                        } finally {
                                                            $handling_pph_method_failuresP$.rebind(_prev_bind_1_10, thread);
                                                            $suspended_paraphrase_methods$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                }
                                if (error_message.isString()) {
                                    Errors.warn(error_message);
                                }
                            }
                        } finally {
                            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1, thread);
                            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != failedP) {
                        return $FAILED;
                    }
                }
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt366$Result_of_adding_Mt_scope_paraphr, pph_phrase.pph_phrase_output_list(phrase));
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    /**
     *
     *
     * @param PPH-PHRASE-P
     * 		
     * @param LISTP
     * 		of MT's
     * @param TEMPORAL-ONLY?
     * 		- if non-NIL, skip non-temporal information from MT-SCOPE.
     * @return PPH-PHRASE-OUTPUT-LIST-P of PHRASE, with all MT's added to it (with generations).
     */
    @LispMethod(comment = "@param PPH-PHRASE-P\r\n\t\t\r\n@param LISTP\r\n\t\tof MT\'s\r\n@param TEMPORAL-ONLY?\r\n\t\t- if non-NIL, skip non-temporal information from MT-SCOPE.\r\n@return PPH-PHRASE-OUTPUT-LIST-P of PHRASE, with all MT\'s added to it (with generations).")
    public static SubLObject pph_phrase_add_mt_scope_paraphrases(final SubLObject phrase, final SubLObject mt_scope, SubLObject temporal_onlyP) {
        if (temporal_onlyP == UNPROVIDED) {
            temporal_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_utilities.pph_mt_scope_p(mt_scope)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str402$Adding_Mt_scope_paraphrases_to___, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            SubLObject failedP = NIL;
            SubLObject error_message = NIL;
            final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind(NIL, thread);
                pph_error.$pph_error_handling_onP$.bind(T, thread);
                if (NIL != pph_error.pph_break_on_errorP()) {
                    final SubLObject top_levelP = handling_pph_method_failures_top_level_p();
                    final SubLObject _prev_bind_0_$9 = $suspended_paraphrase_methods$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$10 = $handling_pph_method_failuresP$.currentBinding(thread);
                    try {
                        $suspended_paraphrase_methods$.bind(NIL != top_levelP ? set.new_set(symbol_function(EQUAL), max_suspended_method_depth()) : $suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                        $handling_pph_method_failuresP$.bind(T, thread);
                        for (SubLObject failed_method = NIL, tried_oneP = NIL; (NIL != failed_method) || (NIL == tried_oneP); tried_oneP = T) {
                            if (NIL != failed_method) {
                                note_suspended_paraphrase_method_plist(failed_method);
                                failed_method = NIL;
                            }
                            try {
                                thread.throwStack.push($PPH_METHOD_FAILURE);
                                if (NIL == failedP) {
                                    thread.resetMultipleValues();
                                    final SubLObject phrase_lists = pph_phrase_get_mt_scope_phrases(phrase, mt_scope, temporal_onlyP);
                                    final SubLObject failed_phrase = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != failed_phrase) {
                                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                            Errors.warn($str403$Couldn_t_finish_temporal_phrase__, failed_phrase);
                                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        pph_phrase.pph_phrase_set_output_list(phrase, NIL, UNPROVIDED);
                                        failedP = T;
                                    } else {
                                        final SubLObject temporals_at_endP = pph_temporals_at_endP(phrase);
                                        SubLObject current;
                                        final SubLObject datum = current = phrase_lists;
                                        SubLObject temporal = NIL;
                                        SubLObject etc = NIL;
                                        destructuring_bind_must_consp(current, datum, $list404);
                                        temporal = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list404);
                                        etc = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                SubLObject cdolist_list_var = temporal;
                                                SubLObject mt_phrase = NIL;
                                                mt_phrase = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    if (NIL != temporals_at_endP) {
                                                        pph_phrase.pph_phrase_append(mt_phrase, phrase);
                                                    } else {
                                                        pph_phrase.pph_phrase_push(pph_data_structures.new_pph_phrase($str405$_, UNPROVIDED, UNPROVIDED), phrase);
                                                        pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    mt_phrase = cdolist_list_var.first();
                                                } 
                                                cdolist_list_var = reverse(etc);
                                                mt_phrase = NIL;
                                                mt_phrase = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    mt_phrase = cdolist_list_var.first();
                                                } 
                                            } else {
                                                SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
                                                SubLObject cdolist_list_var2 = temporal;
                                                SubLObject mt_phrase2 = NIL;
                                                mt_phrase2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    olist = (NIL != temporals_at_endP) ? append(olist, pph_phrase.pph_phrase_output_list(mt_phrase2)) : append(pph_phrase.pph_phrase_output_list(mt_phrase2), olist);
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    mt_phrase2 = cdolist_list_var2.first();
                                                } 
                                                cdolist_list_var2 = reverse(etc);
                                                mt_phrase2 = NIL;
                                                mt_phrase2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    olist = append(pph_phrase.pph_phrase_output_list(mt_phrase2), olist);
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    mt_phrase2 = cdolist_list_var2.first();
                                                } 
                                                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list404);
                                        }
                                    }
                                }
                            } catch (final Throwable ccatch_env_var) {
                                failed_method = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        $handling_pph_method_failuresP$.rebind(_prev_bind_1_$10, thread);
                        $suspended_paraphrase_methods$.rebind(_prev_bind_0_$9, thread);
                    }
                } else {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject top_levelP2 = handling_pph_method_failures_top_level_p();
                                final SubLObject _prev_bind_0_$11 = $suspended_paraphrase_methods$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$11 = $handling_pph_method_failuresP$.currentBinding(thread);
                                try {
                                    $suspended_paraphrase_methods$.bind(NIL != top_levelP2 ? set.new_set(symbol_function(EQUAL), max_suspended_method_depth()) : $suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                                    $handling_pph_method_failuresP$.bind(T, thread);
                                    for (SubLObject failed_method2 = NIL, tried_oneP2 = NIL; (NIL != failed_method2) || (NIL == tried_oneP2); tried_oneP2 = T) {
                                        if (NIL != failed_method2) {
                                            note_suspended_paraphrase_method_plist(failed_method2);
                                            failed_method2 = NIL;
                                        }
                                        try {
                                            thread.throwStack.push($PPH_METHOD_FAILURE);
                                            if (NIL == failedP) {
                                                thread.resetMultipleValues();
                                                final SubLObject phrase_lists2 = pph_phrase_get_mt_scope_phrases(phrase, mt_scope, temporal_onlyP);
                                                final SubLObject failed_phrase2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != failed_phrase2) {
                                                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                        Errors.warn($str403$Couldn_t_finish_temporal_phrase__, failed_phrase2);
                                                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                    }
                                                    pph_phrase.pph_phrase_set_output_list(phrase, NIL, UNPROVIDED);
                                                    failedP = T;
                                                } else {
                                                    final SubLObject temporals_at_endP2 = pph_temporals_at_endP(phrase);
                                                    SubLObject current2;
                                                    final SubLObject datum2 = current2 = phrase_lists2;
                                                    SubLObject temporal2 = NIL;
                                                    SubLObject etc2 = NIL;
                                                    destructuring_bind_must_consp(current2, datum2, $list404);
                                                    temporal2 = current2.first();
                                                    current2 = current2.rest();
                                                    destructuring_bind_must_consp(current2, datum2, $list404);
                                                    etc2 = current2.first();
                                                    current2 = current2.rest();
                                                    if (NIL == current2) {
                                                        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                            SubLObject cdolist_list_var2 = temporal2;
                                                            SubLObject mt_phrase2 = NIL;
                                                            mt_phrase2 = cdolist_list_var2.first();
                                                            while (NIL != cdolist_list_var2) {
                                                                if (NIL != temporals_at_endP2) {
                                                                    pph_phrase.pph_phrase_append(mt_phrase2, phrase);
                                                                } else {
                                                                    pph_phrase.pph_phrase_push(pph_data_structures.new_pph_phrase($str405$_, UNPROVIDED, UNPROVIDED), phrase);
                                                                    pph_phrase.pph_phrase_push(mt_phrase2, phrase);
                                                                }
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                mt_phrase2 = cdolist_list_var2.first();
                                                            } 
                                                            cdolist_list_var2 = reverse(etc2);
                                                            mt_phrase2 = NIL;
                                                            mt_phrase2 = cdolist_list_var2.first();
                                                            while (NIL != cdolist_list_var2) {
                                                                pph_phrase.pph_phrase_push(mt_phrase2, phrase);
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                mt_phrase2 = cdolist_list_var2.first();
                                                            } 
                                                        } else {
                                                            SubLObject olist2 = pph_phrase.pph_phrase_output_list(phrase);
                                                            SubLObject cdolist_list_var3 = temporal2;
                                                            SubLObject mt_phrase3 = NIL;
                                                            mt_phrase3 = cdolist_list_var3.first();
                                                            while (NIL != cdolist_list_var3) {
                                                                olist2 = (NIL != temporals_at_endP2) ? append(olist2, pph_phrase.pph_phrase_output_list(mt_phrase3)) : append(pph_phrase.pph_phrase_output_list(mt_phrase3), olist2);
                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                mt_phrase3 = cdolist_list_var3.first();
                                                            } 
                                                            cdolist_list_var3 = reverse(etc2);
                                                            mt_phrase3 = NIL;
                                                            mt_phrase3 = cdolist_list_var3.first();
                                                            while (NIL != cdolist_list_var3) {
                                                                olist2 = append(pph_phrase.pph_phrase_output_list(mt_phrase3), olist2);
                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                mt_phrase3 = cdolist_list_var3.first();
                                                            } 
                                                            pph_phrase.pph_phrase_set_output_list(phrase, olist2, UNPROVIDED);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum2, $list404);
                                                    }
                                                }
                                            }
                                        } catch (final Throwable ccatch_env_var2) {
                                            failed_method2 = Errors.handleThrowable(ccatch_env_var2, $PPH_METHOD_FAILURE);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                } finally {
                                    $handling_pph_method_failuresP$.rebind(_prev_bind_1_$11, thread);
                                    $suspended_paraphrase_methods$.rebind(_prev_bind_0_$11, thread);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                        }
                    } catch (final Throwable ccatch_env_var3) {
                        error_message = Errors.handleThrowable(ccatch_env_var3, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str406$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            } finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
            }
            if (NIL != failedP) {
                return $FAILED;
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str408$Result_of_adding_Mt_scope_paraphr, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("MAPPINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(makeSymbol("VALID-PPH-BLACKLIST?"));

    /**
     *
     *
     * @return BOOLEANP; Should we add temporal adverbials to the end of PHRASE (rather than the beginning)?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we add temporal adverbials to the end of PHRASE (rather than the beginning)?")
    public static final SubLObject pph_temporals_at_endP_alt(SubLObject phrase) {
        if (NIL != pph_phrase.pph_phrase_has_multiple_verbsP(phrase)) {
            return NIL;
        } else {
            return T;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Should we add temporal adverbials to the end of PHRASE (rather than the beginning)?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we add temporal adverbials to the end of PHRASE (rather than the beginning)?")
    public static SubLObject pph_temporals_at_endP(final SubLObject phrase) {
        if (NIL != pph_phrase.pph_phrase_has_multiple_verbsP(phrase)) {
            return NIL;
        }
        return T;
    }

    static private final SubLList $list_alt7 = cons(makeSymbol("TERM"), makeSymbol("STRINGS"));

    static private final SubLList $list_alt8 = list(makeSymbol("LEXICAL-ASSERTIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     *
     *
     * @param PPH-PHRASE-P
     * 		
     * @param LISTP
     * 		of MT's
     * @param TEMPORAL-ONLY?
     * 		
     * @return 0 (LIST-OF-TEMPORAL-PPH-PHRASE-P'S LIST-OF-OTHER-PPH-PHRASE-P'S)
     * @return 1 PPH-PHRASE-P or NIL; the first phrase we failed to generate a string for.
     */
    @LispMethod(comment = "@param PPH-PHRASE-P\r\n\t\t\r\n@param LISTP\r\n\t\tof MT\'s\r\n@param TEMPORAL-ONLY?\r\n\t\t\r\n@return 0 (LIST-OF-TEMPORAL-PPH-PHRASE-P\'S LIST-OF-OTHER-PPH-PHRASE-P\'S)\r\n@return 1 PPH-PHRASE-P or NIL; the first phrase we failed to generate a string for.")
    public static final SubLObject pph_phrase_get_mt_scope_phrases_alt(SubLObject phrase, SubLObject mt_scope, SubLObject temporal_onlyP) {
        if (temporal_onlyP == UNPROVIDED) {
            temporal_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
                SubLObject temporal_phrases = NIL;
                SubLObject other_phrases = NIL;
                SubLObject failed_phrase = NIL;
                if (NIL != pph_utilities.pph_mt_scope_p(mt_scope)) {
                    {
                        SubLObject list_var = NIL;
                        SubLObject mt_in_scope = NIL;
                        SubLObject argnum = NIL;
                        for (list_var = mt_scope, mt_in_scope = list_var.first(), argnum = ZERO_INTEGER; !((NIL != failed_phrase) || (NIL == list_var)); list_var = list_var.rest() , mt_in_scope = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
                            if (mt_in_scope.equal($list_alt367)) {
                            } else {
                                if (NIL == pph_utilities.pph_isaP(mt_in_scope, $$TemporalMicrotheory, UNPROVIDED)) {
                                    if (NIL != temporal_onlyP) {
                                    } else {
                                        {
                                            SubLObject mt_phrase = pph_mt_in_scope_phrase(mt_scope, argnum, arg_position_map, $list_alt369);
                                            SubLObject acc_to_phrase = pph_data_structures.new_pph_phrase($$$according_to, UNPROVIDED, UNPROVIDED);
                                            SubLObject the_comma = pph_data_structures.new_pph_phrase($str_alt363$_, UNPROVIDED, UNPROVIDED);
                                            if (NIL == failed_phrase) {
                                                {
                                                    SubLObject csome_list_var = list(the_comma, mt_phrase, acc_to_phrase);
                                                    SubLObject other_phrase = NIL;
                                                    for (other_phrase = csome_list_var.first(); !((NIL != failed_phrase) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_phrase = csome_list_var.first()) {
                                                        pph_phrase_resolution.pph_phrase_get_string(other_phrase, $PHRASE_CYCL, phrase);
                                                        if (NIL != pph_phrase.pph_phrase_doneP(other_phrase)) {
                                                            other_phrases = cons(other_phrase, other_phrases);
                                                        } else {
                                                            failed_phrase = other_phrase;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if ((NIL == pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.getDynamicValue(thread)) && (NIL != pph_utilities.pph_time_interval_subsumesP(cycl_utilities.formula_arg1(mt_in_scope, UNPROVIDED), $$Now))) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format(T, $str_alt373$Ignoring__S___because_it_subsumes, mt_in_scope);
                                        }
                                    } else {
                                        {
                                            SubLObject mt_phrase = pph_mt_in_scope_phrase(mt_scope, argnum, arg_position_map, UNPROVIDED);
                                            pph_main.pph_phrase_generate(mt_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != pph_phrase.pph_phrase_doneP(mt_phrase)) {
                                                temporal_phrases = cons(mt_phrase, temporal_phrases);
                                            } else {
                                                failed_phrase = mt_phrase;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(list(temporal_phrases, other_phrases), failed_phrase);
            }
        }
    }

    /**
     *
     *
     * @param PPH-PHRASE-P
     * 		
     * @param LISTP
     * 		of MT's
     * @param TEMPORAL-ONLY?
     * 		
     * @return 0 (LIST-OF-TEMPORAL-PPH-PHRASE-P'S LIST-OF-OTHER-PPH-PHRASE-P'S)
     * @return 1 PPH-PHRASE-P or NIL; the first phrase we failed to generate a string for.
     */
    @LispMethod(comment = "@param PPH-PHRASE-P\r\n\t\t\r\n@param LISTP\r\n\t\tof MT\'s\r\n@param TEMPORAL-ONLY?\r\n\t\t\r\n@return 0 (LIST-OF-TEMPORAL-PPH-PHRASE-P\'S LIST-OF-OTHER-PPH-PHRASE-P\'S)\r\n@return 1 PPH-PHRASE-P or NIL; the first phrase we failed to generate a string for.")
    public static SubLObject pph_phrase_get_mt_scope_phrases(final SubLObject phrase, final SubLObject mt_scope, SubLObject temporal_onlyP) {
        if (temporal_onlyP == UNPROVIDED) {
            temporal_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
        SubLObject temporal_phrases = NIL;
        SubLObject other_phrases = NIL;
        SubLObject failed_phrase = NIL;
        if (NIL != pph_utilities.pph_mt_scope_p(mt_scope)) {
            SubLObject list_var = NIL;
            SubLObject mt_in_scope = NIL;
            SubLObject argnum = NIL;
            list_var = mt_scope;
            mt_in_scope = list_var.first();
            for (argnum = ZERO_INTEGER; (NIL == failed_phrase) && (NIL != list_var); list_var = list_var.rest() , mt_in_scope = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
                if (!mt_in_scope.equal($list409)) {
                    if (NIL == pph_utilities.pph_isaP(mt_in_scope, $$TemporalMicrotheory, UNPROVIDED)) {
                        if (NIL == temporal_onlyP) {
                            final SubLObject mt_phrase = pph_mt_in_scope_phrase(mt_scope, argnum, arg_position_map, $list411);
                            final SubLObject acc_to_phrase = pph_data_structures.new_pph_phrase($$$according_to, UNPROVIDED, UNPROVIDED);
                            final SubLObject the_comma = pph_data_structures.new_pph_phrase($str405$_, UNPROVIDED, UNPROVIDED);
                            if (NIL == failed_phrase) {
                                SubLObject csome_list_var = list(the_comma, mt_phrase, acc_to_phrase);
                                SubLObject other_phrase = NIL;
                                other_phrase = csome_list_var.first();
                                while ((NIL == failed_phrase) && (NIL != csome_list_var)) {
                                    pph_phrase_resolution.pph_phrase_get_string(other_phrase, $PHRASE_CYCL, phrase);
                                    if (NIL != pph_phrase.pph_phrase_doneP(other_phrase)) {
                                        other_phrases = cons(other_phrase, other_phrases);
                                    } else {
                                        failed_phrase = other_phrase;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    other_phrase = csome_list_var.first();
                                } 
                            }
                        }
                    } else
                        if ((NIL == pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.getDynamicValue(thread)) && (NIL != pph_utilities.pph_time_interval_subsumesP(cycl_utilities.formula_arg1(mt_in_scope, UNPROVIDED), $$Now))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str415$Ignoring__S___because_it_subsumes, mt_in_scope, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            final SubLObject mt_phrase = pph_mt_in_scope_phrase(mt_scope, argnum, arg_position_map, UNPROVIDED);
                            pph_main.pph_phrase_generate(mt_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != pph_phrase.pph_phrase_doneP(mt_phrase)) {
                                temporal_phrases = cons(mt_phrase, temporal_phrases);
                            } else {
                                failed_phrase = mt_phrase;
                            }
                        }

                }
            }
        }
        return values(list(temporal_phrases, other_phrases), failed_phrase);
    }

    static private final SubLList $list_alt10 = list(makeSymbol("VALID-PPH-BLACKLIST-ASSERTION?"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("FROM-PREFIX"), makeSymbol("TO-PREFIX"), makeSymbol("MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt14 = list(list(makeSymbol("*PPH-AMBIGUOUS-STRINGS*"), list(makeSymbol("FIRST-OF"), makeSymbol("*PPH-AMBIGUOUS-STRINGS*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP)))));

    static private final SubLList $list_alt15 = list(makeSymbol("PRECISION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt16 = list(makeSymbol("PPH-PRECISION-P"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("*PPH-TERSE-MODE?*"), T));

    static private final SubLList $list_alt21 = list(makeSymbol("NESTED-ARG-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeSymbol("PPH-NESTED-ARG-LIST-P"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("*PPH-MAXIMIZE-LINKS?*"), T), list(makeSymbol("*PPH-LINK-ARG0?*"), T), list(makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), NIL));

    static private final SubLList $list_alt24 = list(list(makeSymbol("ARG0")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym25$_PPH_CURRENT_ARG0_ = makeSymbol("*PPH-CURRENT-ARG0*");

    static private final SubLSymbol $sym27$PPH_OK_ARG0_FOR_LINKING_ = makeSymbol("PPH-OK-ARG0-FOR-LINKING?");

    static private final SubLList $list_alt28 = list(makeKeyword("UNSPECIFIED"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("FUNCTION"), makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt33 = list(makeSymbol("*CONSTANT-LINK-FUNCTION*"));

    static private final SubLList $list_alt35 = list(makeSymbol("*HTML-GENERATION-TARGET*"));

    static private final SubLList $list_alt36 = list(list(makeSymbol("FUNCTION-SPEC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("*CONSTANT-LINK-FUNCTION*"), $NONE));

    static private final SubLList $list_alt39 = list(list(makeSymbol("*ALLOW-UTF8-IN-PPH-TEXT-MODE*"), T));

    static private final SubLList $list_alt40 = list(makeSymbol("FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym41$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__ = makeSymbol("*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*");

    static private final SubLList $list_alt43 = list(makeSymbol("PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?"));

    static private final SubLSymbol $sym45$NEW_OR_REUSED = makeUninternedSymbol("NEW-OR-REUSED");

    public static final SubLObject pph_mt_in_scope_phrase_alt(SubLObject mt_scope, SubLObject argnum, SubLObject base_arg_position_map, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $list_alt374;
        }
        {
            SubLObject mt_in_scope = nth(argnum, mt_scope);
            SubLObject matrix_pos = pph_matrix_pos_from_mt_scope(mt_scope, argnum);
            SubLObject matrix_pos_template = pph_utilities.pph_cycl_template_from_arg_position(matrix_pos);
            SubLObject sub_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(base_arg_position_map, matrix_pos_template);
            SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(mt_in_scope, sub_arg_position_map, UNPROVIDED);
            pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
            return phrase;
        }
    }

    public static SubLObject pph_mt_in_scope_phrase(final SubLObject mt_scope, final SubLObject argnum, final SubLObject base_arg_position_map, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $list416;
        }
        final SubLObject mt_in_scope = nth(argnum, mt_scope);
        final SubLObject matrix_pos = pph_matrix_pos_from_mt_scope(mt_scope, argnum);
        final SubLObject matrix_pos_template = pph_utilities.pph_cycl_template_from_arg_position(matrix_pos);
        final SubLObject sub_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(base_arg_position_map, matrix_pos_template);
        final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(mt_in_scope, sub_arg_position_map, UNPROVIDED);
        pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
        return phrase;
    }

    static private final SubLList $list_alt49 = list(makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("*PPH-EXTERNAL-MEMOIZATION-STATE*"), list(makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE"))));

    static private final SubLList $list_alt52 = list(makeSymbol("*PPH-MEMOIZATION-STATE*"));

    static private final SubLList $list_alt54 = list(makeKeyword("NEW"));

    static private final SubLList $list_alt55 = list(list(makeSymbol("MEMOIZATION-STATE-P"), makeSymbol("*PPH-MEMOIZATION-STATE*")));

    static private final SubLList $list_alt56 = list(list(makeSymbol("CLEAR-ALL-MEMOIZATION"), makeSymbol("*PPH-MEMOIZATION-STATE*")));

    public static final SubLObject pph_matrix_pos_from_mt_scope_alt(SubLObject mt_scope, SubLObject argnum) {
        return NIL != list_utilities.lengthG(mt_scope, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) (list(ONE_INTEGER, number_utilities.f_1X(argnum)))) : list(ONE_INTEGER);
    }

    public static SubLObject pph_matrix_pos_from_mt_scope(final SubLObject mt_scope, final SubLObject argnum) {
        return NIL != list_utilities.lengthG(mt_scope, ONE_INTEGER, UNPROVIDED) ? list(ONE_INTEGER, number_utilities.f_1X(argnum)) : list(ONE_INTEGER);
    }

    static private final SubLList $list_alt57 = list(list(makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE")));

    /**
     * Reset the CycL of PHRASE to its original, while attaching an mt-scope's phrase(s) to either side
     *
     * @unknown This will tend to produce bad results of the 'core' phrase hasn't set strings yet
     */
    @LispMethod(comment = "Reset the CycL of PHRASE to its original, while attaching an mt-scope\'s phrase(s) to either side\r\n\r\n@unknown This will tend to produce bad results of the \'core\' phrase hasn\'t set strings yet")
    public static final SubLObject pph_phrase_restore_cycl_if_mt_scoped_alt(SubLObject phrase, SubLObject cycl) {
        if (NIL != pph_utilities.pph_formula_wXmt_scopeP(cycl)) {
            pph_phrase_restore_cycl(phrase, cycl);
        }
        return phrase;
    }

    /**
     * Reset the CycL of PHRASE to its original, while attaching an mt-scope's phrase(s) to either side
     *
     * @unknown This will tend to produce bad results of the 'core' phrase hasn't set strings yet
     */
    @LispMethod(comment = "Reset the CycL of PHRASE to its original, while attaching an mt-scope\'s phrase(s) to either side\r\n\r\n@unknown This will tend to produce bad results of the \'core\' phrase hasn\'t set strings yet")
    public static SubLObject pph_phrase_restore_cycl_if_mt_scoped(final SubLObject phrase, final SubLObject cycl) {
        if (NIL != pph_utilities.pph_formula_wXmt_scopeP(cycl)) {
            pph_phrase_restore_cycl(phrase, cycl);
        }
        return phrase;
    }

    public static final SubLObject pph_phrase_restore_cycl_alt(SubLObject phrase, SubLObject cycl) {
        return pph_phrase.pph_phrase_set_cycl(phrase, cycl);
    }

    public static SubLObject pph_phrase_restore_cycl(final SubLObject phrase, final SubLObject cycl) {
        return pph_phrase.pph_phrase_set_cycl(phrase, cycl);
    }

    static private final SubLList $list_alt63 = list(makeSymbol("WITH-PPH-MEMOIZATION"), makeSymbol("WITH-PPH-EXTERNAL-MEMOIZATION"));

    public static SubLObject with_nl_generation_fort_cache_memory_mapped(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject already_memory_mapped = $sym417$ALREADY_MEMORY_MAPPED;
        return list(CLET, list(bq_cons(already_memory_mapped, $list418)), list(CUNWIND_PROTECT, listS(PROGN, $list419, append(body, NIL)), listS(PUNLESS, already_memory_mapped, $list420)));
    }

    static private final SubLList $list_alt66 = list(makeSymbol("STORE"));

    static private final SubLList $list_alt67 = list(makeKeyword("STORE"));

    static private final SubLList $list_alt68 = list(makeSymbol("PPH-PROBLEM-STORE-POINTER-STORE"));

    static private final SubLList $list_alt69 = list(makeSymbol("_CSETF-PPH-PROBLEM-STORE-POINTER-STORE"));

    public static SubLObject declare_pph_macros_file() {
        declareFunction("pph_mapped_string_for_term", "PPH-MAPPED-STRING-FOR-TERM", 1, 0, false);
        declareMacro("with_paraphrase_mappings", "WITH-PARAPHRASE-MAPPINGS");
        declareMacro("with_paraphrase_blacklist", "WITH-PARAPHRASE-BLACKLIST");
        declareFunction("valid_pph_blacklistP", "VALID-PPH-BLACKLIST?", 1, 0, false);
        declareMacro("with_paraphrase_lexical_assertion_blacklist", "WITH-PARAPHRASE-LEXICAL-ASSERTION-BLACKLIST");
        declareFunction("valid_pph_blacklist_assertionP", "VALID-PPH-BLACKLIST-ASSERTION?", 1, 0, false);
        declareMacro("do_pph_arg_position_map", "DO-PPH-ARG-POSITION-MAP");
        declareMacro("remembering_pph_ambiguous_strings", "REMEMBERING-PPH-AMBIGUOUS-STRINGS");
        declareMacro("with_paraphrase_precision", "WITH-PARAPHRASE-PRECISION");
        declareMacro("with_terse_paraphrase_on", "WITH-TERSE-PARAPHRASE-ON");
        declareMacro("with_precise_paraphrase_on", "WITH-PRECISE-PARAPHRASE-ON");
        declareMacro("with_precise_paraphrase_off", "WITH-PRECISE-PARAPHRASE-OFF");
        declareMacro("with_precise_paraphrase_for_args", "WITH-PRECISE-PARAPHRASE-FOR-ARGS");
        declareMacro("with_definite_descriptions_licensed_for_terms", "WITH-DEFINITE-DESCRIPTIONS-LICENSED-FOR-TERMS");
        declareFunction("pph_nested_arg_list_p", "PPH-NESTED-ARG-LIST-P", 1, 0, false);
        declareMacro("maximizing_pph_links", "MAXIMIZING-PPH-LINKS");
        declareMacro("pph_possibly_binding_current_arg0", "PPH-POSSIBLY-BINDING-CURRENT-ARG0");
        declareFunction("pph_ok_arg0_for_linkingP", "PPH-OK-ARG0-FOR-LINKING?", 1, 0, false);
        declareMacro("with_pph_html_function_and_target", "WITH-PPH-HTML-FUNCTION-AND-TARGET");
        declareMacro("with_pph_html_term_id_fn", "WITH-PPH-HTML-TERM-ID-FN");
        declareMacro("omitting_hyperlinks_in_pph_html_mode", "OMITTING-HYPERLINKS-IN-PPH-HTML-MODE");
        declareMacro("allowing_utf8_in_pph_text_mode", "ALLOWING-UTF8-IN-PPH-TEXT-MODE");
        declareMacro("dont_link_unlinked_phrases_to_matrix_arg_if", "DONT-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG-IF");
        declareMacro("with_pph_memoization", "WITH-PPH-MEMOIZATION");
        declareMacro("with_pph_external_memoization", "WITH-PPH-EXTERNAL-MEMOIZATION");
        declareFunction("find_or_create_pph_memoization_state", "FIND-OR-CREATE-PPH-MEMOIZATION-STATE", 0, 0, false);
        declareFunction("find_or_create_pph_external_memoization_state", "FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE", 0, 0, false);
        declareFunction("pph_problem_store_pointer_print_function_trampoline", "PPH-PROBLEM-STORE-POINTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pph_problem_store_pointer_p", "PPH-PROBLEM-STORE-POINTER-P", 1, 0, false);
        new pph_macros.$pph_problem_store_pointer_p$UnaryFunction();
        declareFunction("pph_problem_store_pointer_store", "PPH-PROBLEM-STORE-POINTER-STORE", 1, 0, false);
        declareFunction("_csetf_pph_problem_store_pointer_store", "_CSETF-PPH-PROBLEM-STORE-POINTER-STORE", 2, 0, false);
        declareFunction("make_pph_problem_store_pointer", "MAKE-PPH-PROBLEM-STORE-POINTER", 0, 1, false);
        declareFunction("visit_defstruct_pph_problem_store_pointer", "VISIT-DEFSTRUCT-PPH-PROBLEM-STORE-POINTER", 2, 0, false);
        declareFunction("visit_defstruct_object_pph_problem_store_pointer_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PROBLEM-STORE-POINTER-METHOD", 2, 0, false);
        declareFunction("pprint_pph_problem_store_pointer", "PPRINT-PPH-PROBLEM-STORE-POINTER", 3, 0, false);
        declareFunction("pph_maybe_destroy_problem_store", "PPH-MAYBE-DESTROY-PROBLEM-STORE", 1, 0, false);
        declareFunction("free_pph_problem_store_pointer", "FREE-PPH-PROBLEM-STORE-POINTER", 1, 0, false);
        declareFunction("pph_problem_store_pointer_set_store", "PPH-PROBLEM-STORE-POINTER-SET-STORE", 2, 0, false);
        declareFunction("new_problem_store_pointer", "NEW-PROBLEM-STORE-POINTER", 0, 0, false);
        declareFunction("replace_pph_problem_store_pointer_store", "REPLACE-PPH-PROBLEM-STORE-POINTER-STORE", 1, 0, false);
        declareFunction("pph_problem_store", "PPH-PROBLEM-STORE", 0, 1, false);
        declareMacro("with_pph_problem_store", "WITH-PPH-PROBLEM-STORE");
        declareFunction("find_or_create_pph_problem_store_pointer", "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER", 0, 0, false);
        declareFunction("pph_problem_store_okP", "PPH-PROBLEM-STORE-OK?", 0, 0, false);
        declareFunction("pph_problem_store_size_okP", "PPH-PROBLEM-STORE-SIZE-OK?", 1, 0, false);
        declareMacro("creating_permanent_pph_phrases", "CREATING-PERMANENT-PPH-PHRASES");
        declareFunction("note_new_pph_phrase", "NOTE-NEW-PPH-PHRASE", 1, 0, false);
        declareFunction("new_pph_phrase_count", "NEW-PPH-PHRASE-COUNT", 0, 0, false);
        declareFunction("destroy_new_pph_phrases", "DESTROY-NEW-PPH-PHRASES", 0, 0, false);
        declareMacro("destroying_new_pph_phrases_when_done", "DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        declareFunction("get_new_pph_phrase_count", "GET-NEW-PPH-PHRASE-COUNT", 0, 0, false);
        declareMacro("possibly_destroying_new_pph_phrases_when_done", "POSSIBLY-DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        declareMacro("ensuring_pph_discourse_context", "ENSURING-PPH-DISCOURSE-CONTEXT");
        declareMacro("within_new_pph_discourse_context", "WITHIN-NEW-PPH-DISCOURSE-CONTEXT");
        declareFunction("herald_new_discourse_context", "HERALD-NEW-DISCOURSE-CONTEXT", 0, 0, false);
        declareFunction("herald_end_of_discourse_context", "HERALD-END-OF-DISCOURSE-CONTEXT", 0, 0, false);
        declareFunction("pph_discourse_context_initializedP", "PPH-DISCOURSE-CONTEXT-INITIALIZED?", 0, 0, false);
        declareFunction("clear_pph_discourse_context", "CLEAR-PPH-DISCOURSE-CONTEXT", 0, 0, false);
        declareMacro("with_shadowed_discourse_context", "WITH-SHADOWED-DISCOURSE-CONTEXT");
        declareFunction("note_leaving_shadowed_discourse_context", "NOTE-LEAVING-SHADOWED-DISCOURSE-CONTEXT", 2, 0, false);
        declareMacro("with_pph_speaker_and_addressee", "WITH-PPH-SPEAKER-AND-ADDRESSEE");
        declareMacro("do_pph_output_list", "DO-PPH-OUTPUT-LIST");
        declareMacro("do_one_pph_output_list_item", "DO-ONE-PPH-OUTPUT-LIST-ITEM");
        declareMacro("pph_maybe_do_space_item", "PPH-MAYBE-DO-SPACE-ITEM");
        declareFunction("pph_update_end_char_index", "PPH-UPDATE-END-CHAR-INDEX", 2, 0, false);
        declareFunction("pph_make_space_string", "PPH-MAKE-SPACE-STRING", 2, 0, false);
        declareMacro("with_pph_regular_output_item_bindings", "WITH-PPH-REGULAR-OUTPUT-ITEM-BINDINGS");
        declareFunction("pph_output_list_find_start_char", "PPH-OUTPUT-LIST-FIND-START-CHAR", 3, 0, false);
        declareMacro("do_pph_javalist_items", "DO-PPH-JAVALIST-ITEMS");
        declareMacro("with_pph_disambiguation_partial_results_accumulation", "WITH-PPH-DISAMBIGUATION-PARTIAL-RESULTS-ACCUMULATION");
        declareFunction("initialize_disambiguation_phrases", "INITIALIZE-DISAMBIGUATION-PHRASES", 0, 0, false);
        declareFunction("accumulate_disambiguation_phrases", "ACCUMULATE-DISAMBIGUATION-PHRASES", 1, 0, false);
        declareFunction("add_pph_disambiguation_result_to_accumulator", "ADD-PPH-DISAMBIGUATION-RESULT-TO-ACCUMULATOR", 3, 0, false);
        declareFunction("consolidate_disambiguation_phrases", "CONSOLIDATE-DISAMBIGUATION-PHRASES", 1, 0, false);
        declareFunction("final_results_for_disambiguation_phrases", "FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES", 1, 0, false);
        declareMacro("gathering_pph_problems", "GATHERING-PPH-PROBLEMS");
        declareMacro("with_pph_timeout", "WITH-PPH-TIMEOUT");
        declareFunction("pph_timeout_time_reachedP", "PPH-TIMEOUT-TIME-REACHED?", 0, 0, false);
        declareFunction("pph_timeout_current_time", "PPH-TIMEOUT-CURRENT-TIME", 0, 0, false);
        declareFunction("pph_compute_timeout_time", "PPH-COMPUTE-TIMEOUT-TIME", 1, 0, false);
        declareFunction("pph_timeout", "PPH-TIMEOUT", 0, 0, false);
        declareFunction("pph_allowable_time", "PPH-ALLOWABLE-TIME", 0, 0, false);
        declareMacro("noting_unexpressed_negations", "NOTING-UNEXPRESSED-NEGATIONS");
        declareMacro("possibly_with_pph_language_mt", "POSSIBLY-WITH-PPH-LANGUAGE-MT");
        declareMacro("possibly_with_pph_domain_mt", "POSSIBLY-WITH-PPH-DOMAIN-MT");
        declareMacro("with_language_and_domain_mts", "WITH-LANGUAGE-AND-DOMAIN-MTS");
        declareMacro("with_pph_language_mt_relevance", "WITH-PPH-LANGUAGE-MT-RELEVANCE");
        declareMacro("with_pph_domain_and_language_mt_union_relevance", "WITH-PPH-DOMAIN-AND-LANGUAGE-MT-UNION-RELEVANCE");
        declareMacro("do_pph_phrase_fns", "DO-PPH-PHRASE-FNS");
        declareMacro("possibly_suspending_pph_bullets", "POSSIBLY-SUSPENDING-PPH-BULLETS");
        declareMacro("with_pph_demerit_cutoff", "WITH-PPH-DEMERIT-CUTOFF");
        declareMacro("with_maximum_pph_demerit_cutoff", "WITH-MAXIMUM-PPH-DEMERIT-CUTOFF");
        declareFunction("valid_pph_demerit_cutoff_p", "VALID-PPH-DEMERIT-CUTOFF-P", 1, 0, false);
        declareFunction("compute_new_pph_demerit_cutoff", "COMPUTE-NEW-PPH-DEMERIT-CUTOFF", 1, 0, false);
        declareMacro("with_pph_phrase_destruction_grace_period", "WITH-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD");
        declareMacro("remembering_pph_proofs", "REMEMBERING-PPH-PROOFS");
        declareMacro("with_pph_inference_answer", "WITH-PPH-INFERENCE-ANSWER");
        declareMacro("with_pph_inference", "WITH-PPH-INFERENCE");
        declareMacro("with_pph_justification_generation_parameters", "WITH-PPH-JUSTIFICATION-GENERATION-PARAMETERS");
        declareMacro("possibly_with_pph_html_justification_generation_parameters", "POSSIBLY-WITH-PPH-HTML-JUSTIFICATION-GENERATION-PARAMETERS");
        declareFunction("pph_possibly_enable_showXhide", "PPH-POSSIBLY-ENABLE-SHOW/HIDE", 0, 0, false);
        declareFunction("pph_justification_html_function_and_target", "PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET", 0, 0, false);
        declareMacro("pph_setting_var_types_if_successful", "PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL");
        declareFunction("pph_reset_var_types", "PPH-RESET-VAR-TYPES", 1, 0, false);
        declareMacro("pph_possibly_binding_variables", "PPH-POSSIBLY-BINDING-VARIABLES");
        declareFunction("pph_handle_local_vars", "PPH-HANDLE-LOCAL-VARS", 1, 0, false);
        declareMacro("destructure_pph_pronoun_agr", "DESTRUCTURE-PPH-PRONOUN-AGR");
        declareMacro("pph_phrase_do_agr_constraints", "PPH-PHRASE-DO-AGR-CONSTRAINTS");
        declareMacro("do_pph_phrase_templates_for_formula", "DO-PPH-PHRASE-TEMPLATES-FOR-FORMULA");
        declareMacro("do_pph_phrases_for_formula", "DO-PPH-PHRASES-FOR-FORMULA");
        declareFunction("max_suspended_method_depth", "MAX-SUSPENDED-METHOD-DEPTH", 0, 0, false);
        declareFunction("handling_pph_method_failures_p", "HANDLING-PPH-METHOD-FAILURES-P", 0, 0, false);
        declareMacro("handling_pph_method_failures", "HANDLING-PPH-METHOD-FAILURES");
        declareFunction("handling_pph_method_failures_top_level_p", "HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P", 0, 0, false);
        declareFunction("throw_pph_method_failure", "THROW-PPH-METHOD-FAILURE", 1, 0, false);
        declareFunction("note_suspended_paraphrase_method_plist", "NOTE-SUSPENDED-PARAPHRASE-METHOD-PLIST", 1, 0, false);
        declareFunction("clear_pph_suspended_methods_for_cycl", "CLEAR-PPH-SUSPENDED-METHODS-FOR-CYCL", 1, 0, false);
        declareMacro("suspending_paraphrase_method", "SUSPENDING-PARAPHRASE-METHOD");
        declareMacro("omitting_pph_select_string_methods", "OMITTING-PPH-SELECT-STRING-METHODS");
        declareMacro("handling_pph_mt_scope", "HANDLING-PPH-MT-SCOPE");
        declareFunction("pph_phrase_restrict_cycl_to_mt_scope", "PPH-PHRASE-RESTRICT-CYCL-TO-MT-SCOPE", 1, 0, false);
        declareFunction("pph_phrase_restore_and_rephrase_cycl_if_mt_scoped", "PPH-PHRASE-RESTORE-AND-REPHRASE-CYCL-IF-MT-SCOPED", 2, 1, false);
        declareFunction("pph_phrase_add_mt_scope_paraphrases", "PPH-PHRASE-ADD-MT-SCOPE-PARAPHRASES", 2, 1, false);
        declareFunction("pph_temporals_at_endP", "PPH-TEMPORALS-AT-END?", 1, 0, false);
        declareFunction("pph_phrase_get_mt_scope_phrases", "PPH-PHRASE-GET-MT-SCOPE-PHRASES", 2, 1, false);
        declareFunction("pph_mt_in_scope_phrase", "PPH-MT-IN-SCOPE-PHRASE", 3, 1, false);
        declareFunction("pph_matrix_pos_from_mt_scope", "PPH-MATRIX-POS-FROM-MT-SCOPE", 2, 0, false);
        declareFunction("pph_phrase_restore_cycl_if_mt_scoped", "PPH-PHRASE-RESTORE-CYCL-IF-MT-SCOPED", 2, 0, false);
        declareFunction("pph_phrase_restore_cycl", "PPH-PHRASE-RESTORE-CYCL", 2, 0, false);
        declareMacro("with_nl_generation_fort_cache_memory_mapped", "WITH-NL-GENERATION-FORT-CACHE-MEMORY-MAPPED");
        return NIL;
    }

    static private final SubLString $str_alt75$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt76$_PPH_PSP__S_ = makeString("<PPH-PSP ~S>");

    static private final SubLString $str_alt79$__Initial_PPH_problem_store___S__ = makeString("~&Initial PPH problem store: ~S~%");

    static private final SubLSymbol $sym80$REUSE_ = makeUninternedSymbol("REUSE?");

    static private final SubLList $list_alt82 = list(makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("FREE-PPH-PROBLEM-STORE-POINTER"), makeSymbol("*PPH-PROBLEM-STORE-POINTER*")));

    static private final SubLString $str_alt87$Destroying_PPH_problem_store___S_ = makeString("Destroying PPH problem store: ~S~%");

    static private final SubLString $str_alt88$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt89$__ = makeString(") ");

    static private final SubLString $str_alt90$New_PPH_problem_store_is_not_ok__ = makeString("New PPH problem store is not ok: ~S");

    static private final SubLList $list_alt92 = list(list(makeSymbol("*NEW-PPH-PHRASES*"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("*NEW-PPH-PHRASE-COUNT*"), ZERO_INTEGER), list(makeSymbol("*CREATING-PERMANENT-PPH-PHRASE?*"), T));

    static private final SubLString $str_alt96$Destroyed__S_PPH_phrases____New_o = makeString("Destroyed ~S PPH phrases.~% New object count: ~S size: ~S");

    static private final SubLList $list_alt97 = list(list(makeSymbol("*NEW-PPH-PHRASES*"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("*NEW-PPH-PHRASE-COUNT*"), list(makeSymbol("GET-NEW-PPH-PHRASE-COUNT"))), list(makeSymbol("*DESTROY-NEW-PPH-PHRASES?*"), T));

    static private final SubLList $list_alt98 = list(list(makeSymbol("DESTROY-NEW-PPH-PHRASES")));

    static private final SubLList $list_alt100 = list(list(makeSymbol("DESTROY?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym101$MATRIX_NEW_PPH_PHRASES = makeUninternedSymbol("MATRIX-NEW-PPH-PHRASES");

    static private final SubLSymbol $sym102$PHRASE = makeUninternedSymbol("PHRASE");

    static private final SubLList $list_alt103 = list(makeSymbol("*NEW-PPH-PHRASES*"));

    static private final SubLList $list_alt104 = list(makeSymbol("*NEW-PPH-PHRASES*"), list(makeSymbol("CREATE-STACK")));

    static private final SubLList $list_alt105 = list(NIL);

    static private final SubLList $list_alt107 = list(makeSymbol("DESTROY-NEW-PPH-PHRASES"));

    static private final SubLList $list_alt110 = list(makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?"));

    static private final SubLList $list_alt111 = list(makeSymbol("PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("*PPH-DISCOURSE-CONTEXT*"), list(makeSymbol("NEW-PPH-DISCOURSE-CONTEXT"))));

    static private final SubLList $list_alt115 = list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%"), makeSymbol("*PPH-DISCOURSE-CONTEXT*"));

    static private final SubLList $list_alt116 = list(list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%"), makeSymbol("*PPH-DISCOURSE-CONTEXT*")), list(makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT")));

    static private final SubLSymbol $sym117$PPH_DISCOURSE_CONTEXT_INITIALIZED_ = makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?");

    static private final SubLList $list_alt119 = list(list(makeSymbol("NEW-RMS-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym121$MATRIX_RMS = makeUninternedSymbol("MATRIX-RMS");

    static private final SubLList $list_alt122 = list(list(makeSymbol("PPH-DISCOURSE-CONTEXT-RMS")));

    static private final SubLList $list_alt123 = list(list(makeSymbol("*PPH-DISCOURSE-CONTEXT*"), list(makeSymbol("PPH-DISCOURSE-CONTEXT-COPY"))));

    static private final SubLList $list_alt124 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Shadowing discourse context...~%"));

    static private final SubLString $str_alt129$__Leaving__S = makeString("~&Leaving ~S");

    static private final SubLString $str_alt130$New_RMS___S = makeString("New RMS: ~S");

    static private final SubLList $list_alt131 = list(list(makeSymbol("SPEAKER"), makeSymbol("ADDRESSEE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt134 = list(list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("OUTPUT-LIST"), makeSymbol("&KEY"), list(makeSymbol("PARANOID-ARG"), list(QUOTE, makeSymbol("PARANOID-ARG"))), list(makeSymbol("ARG-POSITION"), list(QUOTE, makeSymbol("ARG-POSITION"))), list(makeSymbol("HTML-OPEN-TAG"), list(QUOTE, makeSymbol("HTML-OPEN-TAG"))), list(makeSymbol("HTML-CLOSE-TAG"), list(QUOTE, makeSymbol("HTML-CLOSE-TAG"))), list(makeSymbol("START-CHAR-INDEX"), list(QUOTE, makeSymbol("START-CHAR-INDEX"))), list(makeSymbol("WHOLE-STRING"), list(QUOTE, makeSymbol("WHOLE-STRING"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt135 = list(makeKeyword("PARANOID-ARG"), makeKeyword("ARG-POSITION"), makeKeyword("HTML-OPEN-TAG"), makeKeyword("HTML-CLOSE-TAG"), makeKeyword("START-CHAR-INDEX"), makeKeyword("WHOLE-STRING"));

    static private final SubLSymbol $sym149$ITEM = makeUninternedSymbol("ITEM");

    static private final SubLSymbol $sym150$WHOLE_HTML_STRING = makeUninternedSymbol("WHOLE-HTML-STRING");

    static private final SubLSymbol $sym151$END_CHAR_INDEX = makeUninternedSymbol("END-CHAR-INDEX");

    static private final SubLSymbol $sym152$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLList $list_alt153 = list(makeSymbol("PPH-PHRASE-OUTPUT-LIST-P"));

    static private final SubLList $list_alt154 = list(ZERO_INTEGER);

    static private final SubLList $list_alt156 = list(T);

    static private final SubLList $list_alt164 = list(list(new SubLObject[]{ makeSymbol("ITEM"), makeSymbol("STRING"), makeSymbol("ARG-POSITION"), makeSymbol("HTML-OPEN-TAG"), makeSymbol("HTML-CLOSE-TAG"), makeSymbol("PARANOID-ARG"), makeSymbol("WHOLE-STRING"), makeSymbol("START-CHAR-INDEX"), makeSymbol("END-CHAR-INDEX") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym167$RAW_ITEM_STRING = makeUninternedSymbol("RAW-ITEM-STRING");

    static private final SubLSymbol $sym170$_ = makeSymbol(">");

    static private final SubLList $list_alt172 = list(list(makeSymbol("PPH-UNKNOWN-ARG-POSITION")));

    static private final SubLList $list_alt173 = list(list(makeSymbol("PPH-EMPTY-CYCL")));

    static private final SubLString $str_alt176$Adding_space_string_of_length__S = makeString("Adding space string of length ~S");

    static private final SubLList $list_alt177 = list(list(makeSymbol("ITEM"), makeSymbol("STRING"), makeSymbol("ARG-POSITION"), makeSymbol("HTML-OPEN-TAG"), makeSymbol("HTML-CLOSE-TAG"), makeSymbol("PARANOID-ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym183$CHAR_ = makeSymbol("CHAR=");

    static private final SubLString $str_alt184$Couldn_t_find__S_in__S___ = makeString("Couldn't find ~S in ~S.~%");

    static private final SubLString $str_alt185$Misidentified_start_of__S_in__S_a = makeString("Misidentified start of ~S in ~S as ~S.~%");

    static private final SubLList $list_alt186 = list(list(makeSymbol("ITEM"), makeSymbol("JAVALIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt187 = list($DONE);

    public static final SubLObject init_pph_macros_file_alt() {
        defparameter("*PPH-MEMOIZATION-STATE*", misc_utilities.uninitialized());
        defparameter("*PPH-EXTERNAL-MEMOIZATION-STATE*", misc_utilities.uninitialized());
        defconstant("*DTP-PPH-PROBLEM-STORE-POINTER*", PPH_PROBLEM_STORE_POINTER);
        deflexical("*FREE-PPH-PROBLEM-STORE-POINTERS*", NIL);
        defparameter("*PPH-PROBLEM-STORE-POINTER*", NIL);
        defparameter("*NEW-PPH-PHRASES*", misc_utilities.uninitialized());
        defparameter("*DESTROY-NEW-PPH-PHRASES?*", NIL);
        defparameter("*CREATING-PERMANENT-PPH-PHRASE?*", NIL);
        defparameter("*NEW-PPH-PHRASE-COUNT*", misc_utilities.uninitialized());
        defparameter("*INSIDE-DESTROY-NEW-PPH-PHRASES?*", NIL);
        defparameter("*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*", $PAIRS);
        defparameter("*PPH-TIMEOUT-TIME*", NIL);
        defparameter("*PPH-TIMEOUT-REACHED?*", NIL);
        defparameter("*PPH-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER);
        defparameter("*PPH-DEFAULT-TIMEOUT*", FIVE_INTEGER);
        defvar("*PPH-VAR-TYPES-COUNTER*", ZERO_INTEGER);
        defparameter("*MAX-SUSPENDED-METHOD-DEPTH*", $int$300);
        defparameter("*SUSPENDED-PARAPHRASE-METHODS*", NIL);
        defparameter("*ALLOW-HANDLING-OF-PPH-METHOD-FAILURES?*", T);
        defparameter("*HANDLING-PPH-METHOD-FAILURES?*", NIL);
        return NIL;
    }

    public static SubLObject init_pph_macros_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*PPH-MEMOIZATION-STATE*", misc_utilities.uninitialized());
            defparameter("*PPH-EXTERNAL-MEMOIZATION-STATE*", misc_utilities.uninitialized());
            defconstant("*DTP-PPH-PROBLEM-STORE-POINTER*", PPH_PROBLEM_STORE_POINTER);
            defparameter("*FREE-PPH-PROBLEM-STORE-POINTERS*", misc_utilities.uninitialized());
            defparameter("*PPH-PROBLEM-STORE-POINTER*", NIL);
            defparameter("*NEW-PPH-PHRASES*", misc_utilities.uninitialized());
            defparameter("*DESTROY-NEW-PPH-PHRASES?*", NIL);
            defparameter("*CREATING-PERMANENT-PPH-PHRASE?*", NIL);
            defparameter("*NEW-PPH-PHRASE-COUNT*", misc_utilities.uninitialized());
            defparameter("*INSIDE-DESTROY-NEW-PPH-PHRASES?*", NIL);
            defparameter("*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*", $PAIRS);
            defparameter("*PPH-TIMEOUT-TIME*", NIL);
            defparameter("*PPH-TIMEOUT-REACHED?*", NIL);
            defparameter("*PPH-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER);
            defparameter("*PPH-DEFAULT-TIMEOUT*", FIVE_INTEGER);
            defvar("*PPH-VAR-TYPES-COUNTER*", ZERO_INTEGER);
            defparameter("*MAX-SUSPENDED-METHOD-DEPTH*", $int$300);
            defparameter("*SUSPENDED-PARAPHRASE-METHODS*", NIL);
            defparameter("*ALLOW-HANDLING-OF-PPH-METHOD-FAILURES?*", T);
            defparameter("*HANDLING-PPH-METHOD-FAILURES?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*FREE-PPH-PROBLEM-STORE-POINTERS*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_pph_macros_file_Previous() {
        defparameter("*PPH-MEMOIZATION-STATE*", misc_utilities.uninitialized());
        defparameter("*PPH-EXTERNAL-MEMOIZATION-STATE*", misc_utilities.uninitialized());
        defconstant("*DTP-PPH-PROBLEM-STORE-POINTER*", PPH_PROBLEM_STORE_POINTER);
        defparameter("*FREE-PPH-PROBLEM-STORE-POINTERS*", misc_utilities.uninitialized());
        defparameter("*PPH-PROBLEM-STORE-POINTER*", NIL);
        defparameter("*NEW-PPH-PHRASES*", misc_utilities.uninitialized());
        defparameter("*DESTROY-NEW-PPH-PHRASES?*", NIL);
        defparameter("*CREATING-PERMANENT-PPH-PHRASE?*", NIL);
        defparameter("*NEW-PPH-PHRASE-COUNT*", misc_utilities.uninitialized());
        defparameter("*INSIDE-DESTROY-NEW-PPH-PHRASES?*", NIL);
        defparameter("*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*", $PAIRS);
        defparameter("*PPH-TIMEOUT-TIME*", NIL);
        defparameter("*PPH-TIMEOUT-REACHED?*", NIL);
        defparameter("*PPH-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER);
        defparameter("*PPH-DEFAULT-TIMEOUT*", FIVE_INTEGER);
        defvar("*PPH-VAR-TYPES-COUNTER*", ZERO_INTEGER);
        defparameter("*MAX-SUSPENDED-METHOD-DEPTH*", $int$300);
        defparameter("*SUSPENDED-PARAPHRASE-METHODS*", NIL);
        defparameter("*ALLOW-HANDLING-OF-PPH-METHOD-FAILURES?*", T);
        defparameter("*HANDLING-PPH-METHOD-FAILURES?*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt192 = list(list(makeSymbol("ANS"), makeSymbol("THRESHOLD"), makeSymbol("NOTIFICATION-FUNCTION-SPEC"), makeSymbol("&KEY"), list(makeSymbol("RETURN-STYLE"), makeKeyword("JAVALISTS"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt193 = list(makeKeyword("RETURN-STYLE"));

    static private final SubLList $list_alt196 = list(makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*"), list(QUOTE, makeSymbol("INITIALIZE-DISAMBIGUATION-PHRASES")));

    static private final SubLList $list_alt197 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATION-FN*"), list(QUOTE, makeSymbol("ACCUMULATE-DISAMBIGUATION-PHRASES")));

    static private final SubLList $list_alt198 = list(makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), list(QUOTE, makeSymbol("CONSOLIDATE-DISAMBIGUATION-PHRASES")));

    static private final SubLList $list_alt200 = list(makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), list(QUOTE, makeSymbol("FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES")));

    public static final SubLObject setup_pph_macros_file_alt() {
        register_macro_helper($sym27$PPH_OK_ARG0_FOR_LINKING_, PPH_POSSIBLY_BINDING_CURRENT_ARG0);
        register_macro_helper(FIND_OR_CREATE_PPH_MEMOIZATION_STATE, WITH_PPH_MEMOIZATION);
        register_macro_helper(FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE, $list_alt63);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), symbol_function(PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PPH_PROBLEM_STORE_POINTER_STORE, _CSETF_PPH_PROBLEM_STORE_POINTER_STORE);
        identity(PPH_PROBLEM_STORE_POINTER);
        register_macro_helper(FREE_PPH_PROBLEM_STORE_POINTER, WITH_PPH_PROBLEM_STORE);
        register_macro_helper(FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER, WITH_PPH_PROBLEM_STORE);
        register_macro_helper(DESTROY_NEW_PPH_PHRASES, DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
        register_macro_helper(GET_NEW_PPH_PHRASE_COUNT, DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
        register_macro_helper(WITHIN_NEW_PPH_DISCOURSE_CONTEXT, ENSURING_PPH_DISCOURSE_CONTEXT);
        register_macro_helper($sym117$PPH_DISCOURSE_CONTEXT_INITIALIZED_, ENSURING_PPH_DISCOURSE_CONTEXT);
        register_macro_helper(CLEAR_PPH_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        register_macro_helper(NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, WITH_SHADOWED_DISCOURSE_CONTEXT);
        register_macro_helper(DO_ONE_PPH_OUTPUT_LIST_ITEM, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_MAYBE_DO_SPACE_ITEM, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_UPDATE_END_CHAR_INDEX, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_MAKE_SPACE_STRING, PPH_MAYBE_DO_SPACE_ITEM);
        register_macro_helper(WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_OUTPUT_LIST_FIND_START_CHAR, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_COMPUTE_TIMEOUT_TIME, WITH_PPH_TIMEOUT);
        register_macro_helper(PPH_TIMEOUT, WITH_PPH_TIMEOUT);
        register_macro_helper(COMPUTE_NEW_PPH_DEMERIT_CUTOFF, WITH_MAXIMUM_PPH_DEMERIT_CUTOFF);
        register_macro_helper(PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET, WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS);
        register_macro_helper(PPH_RESET_VAR_TYPES, PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL);
        register_macro_helper(PPH_HANDLE_LOCAL_VARS, PPH_POSSIBLY_BINDING_VARIABLES);
        register_macro_helper(MAX_SUSPENDED_METHOD_DEPTH, HANDLING_PPH_METHOD_FAILURES);
        register_macro_helper(HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P, HANDLING_PPH_METHOD_FAILURES);
        register_macro_helper(NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, HANDLING_PPH_METHOD_FAILURES);
        register_macro_helper(PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, HANDLING_PPH_MT_SCOPE);
        register_macro_helper(PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, HANDLING_PPH_MT_SCOPE);
        return NIL;
    }

    public static SubLObject setup_pph_macros_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper($sym32$PPH_OK_ARG0_FOR_LINKING_, PPH_POSSIBLY_BINDING_CURRENT_ARG0);
            register_macro_helper(FIND_OR_CREATE_PPH_MEMOIZATION_STATE, WITH_PPH_MEMOIZATION);
            register_macro_helper(FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE, $list68);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), symbol_function(PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list77);
            def_csetf(PPH_PROBLEM_STORE_POINTER_STORE, _CSETF_PPH_PROBLEM_STORE_POINTER_STORE);
            identity(PPH_PROBLEM_STORE_POINTER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD));
            register_macro_helper(FREE_PPH_PROBLEM_STORE_POINTER, WITH_PPH_PROBLEM_STORE);
            register_macro_helper(FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER, WITH_PPH_PROBLEM_STORE);
            register_macro_helper(DESTROY_NEW_PPH_PHRASES, DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
            register_macro_helper(GET_NEW_PPH_PHRASE_COUNT, DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
            register_macro_helper(WITHIN_NEW_PPH_DISCOURSE_CONTEXT, ENSURING_PPH_DISCOURSE_CONTEXT);
            register_macro_helper(HERALD_NEW_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
            register_macro_helper(HERALD_END_OF_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
            register_macro_helper($sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_, ENSURING_PPH_DISCOURSE_CONTEXT);
            register_macro_helper(CLEAR_PPH_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
            register_macro_helper(NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, WITH_SHADOWED_DISCOURSE_CONTEXT);
            register_macro_helper(DO_ONE_PPH_OUTPUT_LIST_ITEM, DO_PPH_OUTPUT_LIST);
            register_macro_helper(PPH_MAYBE_DO_SPACE_ITEM, DO_PPH_OUTPUT_LIST);
            register_macro_helper(PPH_UPDATE_END_CHAR_INDEX, DO_PPH_OUTPUT_LIST);
            register_macro_helper(PPH_MAKE_SPACE_STRING, PPH_MAYBE_DO_SPACE_ITEM);
            register_macro_helper(WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, DO_PPH_OUTPUT_LIST);
            register_macro_helper(PPH_OUTPUT_LIST_FIND_START_CHAR, DO_PPH_OUTPUT_LIST);
            register_macro_helper(PPH_COMPUTE_TIMEOUT_TIME, WITH_PPH_TIMEOUT);
            register_macro_helper(PPH_TIMEOUT, WITH_PPH_TIMEOUT);
            register_macro_helper(COMPUTE_NEW_PPH_DEMERIT_CUTOFF, WITH_MAXIMUM_PPH_DEMERIT_CUTOFF);
            register_macro_helper(PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET, WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS);
            register_macro_helper(PPH_RESET_VAR_TYPES, PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL);
            register_macro_helper(PPH_HANDLE_LOCAL_VARS, PPH_POSSIBLY_BINDING_VARIABLES);
            register_macro_helper(MAX_SUSPENDED_METHOD_DEPTH, HANDLING_PPH_METHOD_FAILURES);
            register_macro_helper(HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P, HANDLING_PPH_METHOD_FAILURES);
            register_macro_helper(NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, HANDLING_PPH_METHOD_FAILURES);
            register_macro_helper(PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, HANDLING_PPH_MT_SCOPE);
            register_macro_helper(PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, HANDLING_PPH_MT_SCOPE);
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper($sym27$PPH_OK_ARG0_FOR_LINKING_, PPH_POSSIBLY_BINDING_CURRENT_ARG0);
            register_macro_helper(FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE, $list_alt63);
            register_macro_helper($sym117$PPH_DISCOURSE_CONTEXT_INITIALIZED_, ENSURING_PPH_DISCOURSE_CONTEXT);
        }
        return NIL;
    }

    public static SubLObject setup_pph_macros_file_Previous() {
        register_macro_helper($sym32$PPH_OK_ARG0_FOR_LINKING_, PPH_POSSIBLY_BINDING_CURRENT_ARG0);
        register_macro_helper(FIND_OR_CREATE_PPH_MEMOIZATION_STATE, WITH_PPH_MEMOIZATION);
        register_macro_helper(FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE, $list68);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), symbol_function(PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list77);
        def_csetf(PPH_PROBLEM_STORE_POINTER_STORE, _CSETF_PPH_PROBLEM_STORE_POINTER_STORE);
        identity(PPH_PROBLEM_STORE_POINTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_problem_store_pointer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD));
        register_macro_helper(FREE_PPH_PROBLEM_STORE_POINTER, WITH_PPH_PROBLEM_STORE);
        register_macro_helper(FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER, WITH_PPH_PROBLEM_STORE);
        register_macro_helper(DESTROY_NEW_PPH_PHRASES, DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
        register_macro_helper(GET_NEW_PPH_PHRASE_COUNT, DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
        register_macro_helper(WITHIN_NEW_PPH_DISCOURSE_CONTEXT, ENSURING_PPH_DISCOURSE_CONTEXT);
        register_macro_helper(HERALD_NEW_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        register_macro_helper(HERALD_END_OF_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        register_macro_helper($sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_, ENSURING_PPH_DISCOURSE_CONTEXT);
        register_macro_helper(CLEAR_PPH_DISCOURSE_CONTEXT, WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        register_macro_helper(NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, WITH_SHADOWED_DISCOURSE_CONTEXT);
        register_macro_helper(DO_ONE_PPH_OUTPUT_LIST_ITEM, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_MAYBE_DO_SPACE_ITEM, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_UPDATE_END_CHAR_INDEX, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_MAKE_SPACE_STRING, PPH_MAYBE_DO_SPACE_ITEM);
        register_macro_helper(WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_OUTPUT_LIST_FIND_START_CHAR, DO_PPH_OUTPUT_LIST);
        register_macro_helper(PPH_COMPUTE_TIMEOUT_TIME, WITH_PPH_TIMEOUT);
        register_macro_helper(PPH_TIMEOUT, WITH_PPH_TIMEOUT);
        register_macro_helper(COMPUTE_NEW_PPH_DEMERIT_CUTOFF, WITH_MAXIMUM_PPH_DEMERIT_CUTOFF);
        register_macro_helper(PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET, WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS);
        register_macro_helper(PPH_RESET_VAR_TYPES, PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL);
        register_macro_helper(PPH_HANDLE_LOCAL_VARS, PPH_POSSIBLY_BINDING_VARIABLES);
        register_macro_helper(MAX_SUSPENDED_METHOD_DEPTH, HANDLING_PPH_METHOD_FAILURES);
        register_macro_helper(HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P, HANDLING_PPH_METHOD_FAILURES);
        register_macro_helper(NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, HANDLING_PPH_METHOD_FAILURES);
        register_macro_helper(PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, HANDLING_PPH_MT_SCOPE);
        register_macro_helper(PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, HANDLING_PPH_MT_SCOPE);
        return NIL;
    }

    static private final SubLString $str_alt204$Don_t_know_how_to_accumulate__S_a = makeString("Don't know how to accumulate ~S answers.");

    static private final SubLSymbol $sym205$_ = makeSymbol("<");

    static private final SubLList $list_alt206 = list(list(makeSymbol("PROBLEM-DICTIONARY-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym207$MATRIX_PROBLEM_DICTIONARY = makeUninternedSymbol("MATRIX-PROBLEM-DICTIONARY");

    static private final SubLList $list_alt208 = list(list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQL)));

    static private final SubLList $list_alt209 = list(makeSymbol("*PPH-PROBLEM-REPORTS*"));

    static private final SubLList $list_alt210 = list(makeSymbol("*PPH-PROBLEM-REPORTING-MODE*"), list(makeSymbol("FIF"), list(makeSymbol("PPH-PROBLEM-REPORTING-ON-P")), makeSymbol("*PPH-PROBLEM-REPORTING-MODE*"), makeKeyword("QUIET")));

    static private final SubLList $list_alt214 = list(list(makeSymbol("TIMED-OUT?"), makeSymbol("&OPTIONAL"), list(makeSymbol("DELAY-IN-SECONDS"), list(makeSymbol("PPH-TIMEOUT")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt215 = list(makeSymbol("*PPH-TIMEOUT-TIME-CHECK-COUNT*"), ZERO_INTEGER);

    static private final SubLList $list_alt218 = list(list(makeSymbol("*PPH-TIMEOUT-REACHED?*"), makeSymbol("*PPH-TIMEOUT-REACHED?*")));

    static private final SubLList $list_alt219 = list(makeSymbol("CSETQ"), makeSymbol("*PPH-TIMEOUT-REACHED?*"), list(makeSymbol("PPH-TIMEOUT-TIME-REACHED?")));

    static private final SubLList $list_alt221 = list(list(makeSymbol("PPH-TIMEOUT-TIME-REACHED?")));

    static private final SubLString $str_alt222$PPH_timeout_reached_ = makeString("PPH timeout reached.");

    static private final SubLList $list_alt225 = list(makeSymbol("GENERATION-MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt228 = list(makeSymbol("*PPH-LANGUAGE-MT*"));

    static private final SubLList $list_alt229 = list(makeSymbol("DOMAIN-MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt231 = list(makeSymbol("*PPH-DOMAIN-MT*"));

    static private final SubLList $list_alt232 = list(list(makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void declareFunctions() {
        declare_pph_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt235 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("BROADEN?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym237$BROADENED_LANGUAGE_MT = makeUninternedSymbol("BROADENED-LANGUAGE-MT");

    static private final SubLList $list_alt239 = list(list(makeSymbol("PPH-BROADEN-LANGUAGE-MT")));

    static private final SubLSymbol $sym240$HLMT_EQUAL_ = makeSymbol("HLMT-EQUAL?");

    static private final SubLList $list_alt241 = list(makeSymbol("PPH-WARN"), ONE_INTEGER, makeString("Broadening *PPH-LANGUAGE-MT* to ~S"), makeSymbol("*PPH-LANGUAGE-MT*"));

    static private final SubLList $list_alt242 = list(makeSymbol("PPH-ENHANCED-DOMAIN-MT"));

    static private final SubLList $list_alt243 = list(list(makeSymbol("FN"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $pph_problem_store_pointer_native extends SubLStructNative {
        public SubLObject $store;

        private static final SubLStructDeclNative structDecl;

        public $pph_problem_store_pointer_native() {
            pph_macros.$pph_problem_store_pointer_native.this.$store = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return pph_macros.$pph_problem_store_pointer_native.this.$store;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return pph_macros.$pph_problem_store_pointer_native.this.$store = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer_native.class, PPH_PROBLEM_STORE_POINTER, PPH_PROBLEM_STORE_POINTER_P, $list71, $list72, new String[]{ "$store" }, $list73, $list74, PPRINT_PPH_PROBLEM_STORE_POINTER);
        }
    }

    static private final SubLList $list_alt245 = list(makeSymbol("*PPH-PHRASE-FNS*"));

    static private final SubLList $list_alt247 = list(list(QUOTE, makeSymbol("INIT-STATE")));

    static private final SubLList $list_alt248 = list(list(makeSymbol("OK?"), makeSymbol("OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym249$SUSPEND_ = makeUninternedSymbol("SUSPEND?");

    static private final SubLString $str_alt252$__Suspending_bullet_use_for____S_ = makeString("~&Suspending bullet use for~% ~S~%");

    static private final SubLList $list_alt253 = list(list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Turning bullet use back on.~%")));

    public static final class $pph_problem_store_pointer_p$UnaryFunction extends UnaryFunction {
        public $pph_problem_store_pointer_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PROBLEM-STORE-POINTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_problem_store_pointer_p(arg1);
        }
    }

    static private final SubLList $list_alt254 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("CUTOFF"), makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt256 = list(makeSymbol("VALID-PPH-DEMERIT-CUTOFF-P"));

    static private final SubLList $list_alt261 = list(list(makeSymbol("*PPH-DISPLAYED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"))), list(makeSymbol("*PPH-JUSTIFIED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET"))));

    static private final SubLList $list_alt262 = list(list(makeSymbol("INFERENCE-ANSWER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym263$LINK_FUNCTION = makeUninternedSymbol("LINK-FUNCTION");

    static private final SubLSymbol $sym264$HTML_TARGET = makeUninternedSymbol("HTML-TARGET");

    static private final SubLList $list_alt269 = list(list(makeSymbol("*PPH-HANDLE-HYPOTHETICALS?*"), T), list(makeSymbol("*PPH-USE-BULLETED-LISTS?*"), T), list(makeSymbol("*PPH-HANDLE-HYPOTHETICALS?*"), T), list(makeSymbol("*PPH-REPOSITIONED-PROOFS*"), NIL), list(makeSymbol("*PPH-DISPLAYED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"))), list(makeSymbol("*PPH-JUSTIFIED-PROOFS*"), list(makeSymbol("FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET"))), list(makeSymbol("*PPH-PROOF-DEPTH*"), ZERO_INTEGER), list(makeSymbol("*PPH-DISPLAYED-SUPPORTS*"), NIL));

    static private final SubLList $list_alt270 = list(makeSymbol("PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET"));

    static private final SubLList $list_alt274 = list(list(makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym275$VAR_TYPES_SHADOW = makeUninternedSymbol("VAR-TYPES-SHADOW");

    static private final SubLList $list_alt276 = list(list(makeSymbol("COPY-DICTIONARY"), makeSymbol("*PPH-VAR-TYPES*")));

    static private final SubLList $list_alt277 = list(list(makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("*PPH-NOTED-VAR-TYPES*")), makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQL), SIXTEEN_INTEGER))), list(makeSymbol("*PPH-VAR-TYPES-COUNTER*"), list(makeSymbol("1+"), makeSymbol("*PPH-VAR-TYPES-COUNTER*"))));

    static private final SubLList $list_alt278 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%"), makeSymbol("*PPH-VAR-TYPES-COUNTER*"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("*PPH-VAR-TYPES*")));

    static private final SubLList $list_alt280 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). "), makeSymbol("*PPH-VAR-TYPES-COUNTER*"));

    static private final SubLSymbol $sym281$PPH_PHRASE_DONE_ = makeSymbol("PPH-PHRASE-DONE?");

    static private final SubLList $list_alt282 = list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~& Output list: ~S~%"), list(makeSymbol("PPH-PHRASE-OUTPUT-LIST"), makeSymbol("PHRASE")));

    static private final SubLString $str_alt283$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    static private final SubLList $list_alt286 = list(list(makeSymbol("PPH-NOTE"), ONE_INTEGER, makeString("~% Leaving *PPH-VAR-TYPES* ~S"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("*PPH-VAR-TYPES*"))));

    static private final SubLSymbol $sym288$OLD_PPH_VARS = makeUninternedSymbol("OLD-PPH-VARS");

    static private final SubLList $list_alt289 = list(makeSymbol("*PPH-VAR-TYPES*"), list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("*PPH-VAR-TYPES*")), makeSymbol("*PPH-VAR-TYPES*"), list(makeSymbol("NEW-DICTIONARY"))));

    static private final SubLList $list_alt290 = list(list(makeSymbol("PPH-REGISTERED-VARS")));

    static private final SubLList $list_alt291 = list(list(makeSymbol("*PPH-DIFFERENT-VARS*"), makeSymbol("*PPH-DIFFERENT-VARS*")), list(makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("*PPH-NOTED-VAR-TYPES*")), makeSymbol("*PPH-NOTED-VAR-TYPES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQL), SIXTEEN_INTEGER))), list(makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), list(makeSymbol("1+"), makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"))));

    static private final SubLList $list_alt292 = list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%"), makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("*PPH-VAR-TYPES*")));

    static private final SubLList $list_alt295 = list(makeSymbol("PPH-REGISTERED-VARS"));

    static private final SubLList $list_alt296 = list(list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s "), makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), list(makeSymbol("PPH-REGISTERED-VARS"))), list(makeSymbol("PPH-HANDLE-LOCAL-VARS"), makeSymbol("LOCAL-VARS")), list(makeSymbol("PPH-NOTE"), TWO_INTEGER, makeString("~&... and *pph-var-types* are now ~S~%"), list(makeSymbol("PPH-REGISTERED-VARS"))));

    static private final SubLString $str_alt299$_Deregistering__S__ = makeString("&Deregistering ~S~%");

    static private final SubLList $list_alt300 = list(list(makeSymbol("PERSON"), makeSymbol("NUMBER"), makeSymbol("GENDER")), makeSymbol("PRONOUN-AGR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt302 = list(list(makeSymbol("AGR-CONSTRAINT"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt304 = list(list(new SubLObject[]{ makeSymbol("TEMPLATE"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("RELN"), list(makeSymbol("ARG-POSITION-MAP"), list(makeSymbol("PPH-NEW-EMPTY-MAP"))), list(makeSymbol("INVERSE?"), list(QUOTE, makeSymbol("IGNORE-ME"))), list(makeSymbol("NL-PREDS"), makeKeyword("ANY")), makeSymbol("WIDE-SCOPE-ARGNUM"), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt305 = list($RELN, makeKeyword("ARG-POSITION-MAP"), makeKeyword("INVERSE?"), makeKeyword("NL-PREDS"), makeKeyword("WIDE-SCOPE-ARGNUM"), $DONE);

    private static final SubLSymbol $WIDE_SCOPE_ARGNUM = makeKeyword("WIDE-SCOPE-ARGNUM");

    static private final SubLSymbol $sym313$GENERATOR = makeUninternedSymbol("GENERATOR");

    static private final SubLList $list_alt319 = list(list(makeSymbol("PPH-PHRASE"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("WIDE-SCOPE-ARG"), makeSymbol("ARG-POSITION-MAP"), list(makeSymbol("NL-PREDS"), makeKeyword("ANY")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt320 = list(makeKeyword("WIDE-SCOPE-ARG"), makeKeyword("ARG-POSITION-MAP"), makeKeyword("NL-PREDS"), $DONE);

    private static final SubLSymbol $WIDE_SCOPE_ARG = makeKeyword("WIDE-SCOPE-ARG");

    static private final SubLSymbol $sym322$PHRASE_TEMPLATE = makeUninternedSymbol("PHRASE-TEMPLATE");

    static private final SubLSymbol $sym328$FAILED_METHOD = makeUninternedSymbol("FAILED-METHOD");

    static private final SubLSymbol $sym329$TRIED_ONE_ = makeUninternedSymbol("TRIED-ONE?");

    static private final SubLSymbol $sym330$TOP_LEVEL_ = makeUninternedSymbol("TOP-LEVEL?");

    static private final SubLList $list_alt331 = list(list(makeSymbol("HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P")));

    static private final SubLList $list_alt333 = list(list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("MAX-SUSPENDED-METHOD-DEPTH"))), makeSymbol("*SUSPENDED-PARAPHRASE-METHODS*"));

    static private final SubLList $list_alt334 = list(makeSymbol("*HANDLING-PPH-METHOD-FAILURES?*"), T);

    static private final SubLString $str_alt340$Can_t_note_PPH_method_failure__no = makeString("Can't note PPH method failure; not in failure handling mode.");

    static private final SubLString $str_alt341$_S___is_already_suspended_ = makeString("~S~% is already suspended.");

    static private final SubLString $str_alt342$Over__S_suspended_methods____Curr = makeString("Over ~S suspended methods.~% Current plist:~% ~S");

    static private final SubLString $str_alt344$Cleared__S_suspended_methods_for_ = makeString("Cleared ~S suspended methods for ~S");

    static private final SubLList $list_alt345 = list(list(makeSymbol("METHOD-SYMBOL"), makeSymbol("&OPTIONAL"), makeSymbol("OBJECT-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym346$INFO = makeUninternedSymbol("INFO");

    static private final SubLList $list_alt350 = list(makeSymbol("METHODS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym352$SAVE_CYCL = makeUninternedSymbol("SAVE-CYCL");

    static private final SubLString $str_alt356$Removing_MT_scope_from__S = makeString("Removing MT scope from ~S");

    static private final SubLList $list_alt357 = list(TWO_INTEGER);

    static private final SubLString $str_alt358$Updating_agr_preds_to__S_based_on = makeString("Updating agr-preds to ~S based on mt scope.");

    static private final SubLString $str_alt359$New_agr_preds___S = makeString("New agr preds: ~S");

    static private final SubLString $str_alt360$Adding_Mt_scope_paraphrases_to___ = makeString("Adding Mt scope paraphrases to~% ~S");

    static private final SubLString $str_alt361$Couldn_t_finish_temporal_phrase__ = makeString("Couldn't finish temporal phrase:~% ~S~%");

    static private final SubLList $list_alt362 = list(makeSymbol("TEMPORAL"), makeSymbol("ETC"));

    static private final SubLString $str_alt363$_ = makeString(",");

    static private final SubLString $str_alt366$Result_of_adding_Mt_scope_paraphr = makeString("Result of adding Mt scope paraphrases:~% ~S");

    static private final SubLList $list_alt367 = list(reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("Now"));

    static private final SubLList $list_alt369 = list(reader_make_constant_shell("nonPlural-Generic"), reader_make_constant_shell("nameString"));

    static private final SubLString $str_alt373$Ignoring__S___because_it_subsumes = makeString("Ignoring ~S~% because it subsumes #$Now.");

    static private final SubLList $list_alt374 = list(reader_make_constant_shell("prepositionStrings"), reader_make_constant_shell("adverbStrings"));
}

/**
 * Total time: 1269 ms
 */
