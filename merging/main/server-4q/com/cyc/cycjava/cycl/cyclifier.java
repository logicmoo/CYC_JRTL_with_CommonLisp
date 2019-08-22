/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_remove_unnecessary_existentials;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sentence_variables;
import static com.cyc.cycjava.cycl.el_utilities.string_to_el_var_name;
import static com.cyc.cycjava.cycl.el_utilities.variable_subst;
import static com.cyc.cycjava.cycl.simplifier.conjoin;
import static com.cyc.cycjava.cycl.simplifier.lift_conjuncts;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_implies;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyclifier extends SubLTranslatedFile implements V12 {
    public static final SubLObject var_counts(SubLObject cycl) {
        {
            SubLObject vars = cycl_utilities.expression_gather_with_duplicates(cycl, symbol_function($sym177$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject counts = make_hash_table(SEVENTEEN_INTEGER, EQL, UNPROVIDED);
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                sethash(var, counts, add(gethash(var, counts, ZERO_INTEGER), ONE_INTEGER));
            }
            return counts;
        }
    }

    /**
     *
     *
     * @param CYCL
    		el-formula-p;
     * 		
     * @return listp; all variables in CYCL mentioned more than once
     */
    @LispMethod(comment = "@param CYCL\n\t\tel-formula-p;\r\n\t\t\r\n@return listp; all variables in CYCL mentioned more than once")
    public static final SubLObject non_singleton_vars(SubLObject cycl) {
        {
            SubLObject non_singletons = NIL;
            SubLObject cdohash_table = com.cyc.cycjava.cycl.cyclifier.var_counts(cycl);
            SubLObject var = NIL;
            SubLObject count = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        var = getEntryKey(cdohash_entry);
                        count = getEntryValue(cdohash_entry);
                        if (count.numG(ONE_INTEGER)) {
                            non_singletons = cons(var, non_singletons);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return non_singletons;
        }
    }

    /**
     *
     *
     * @param CYCL
    		el-formula-p;
     * 		
     * @return listp; all variables in CYCL mentioned more than once
     */
    @LispMethod(comment = "@param CYCL\n\t\tel-formula-p;\r\n\t\t\r\n@return listp; all variables in CYCL mentioned more than once")
    public static final SubLObject non_singleton_free_vars(SubLObject cycl) {
        {
            SubLObject non_singletons = NIL;
            SubLObject cdohash_table = com.cyc.cycjava.cycl.cyclifier.var_counts(cycl);
            SubLObject var = NIL;
            SubLObject count = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        var = getEntryKey(cdohash_entry);
                        count = getEntryValue(cdohash_entry);
                        if (count.numG(ONE_INTEGER)) {
                            non_singletons = cons(var, non_singletons);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return intersection(sentence_free_variables(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED), non_singletons, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param CYCL
    		el-formula-p;
     * 		
     * @return el-formula-p; a version of CYCL with all equals statement folded in
     */
    @LispMethod(comment = "@param CYCL\n\t\tel-formula-p;\r\n\t\t\r\n@return el-formula-p; a version of CYCL with all equals statement folded in")
    public static final SubLObject fold_equals(SubLObject cycl) {
        {
            SubLObject folded = cycl;
            SubLObject v_bindings = com.cyc.cycjava.cycl.cyclifier.get_assignment(folded, com.cyc.cycjava.cycl.cyclifier.non_singleton_free_vars(folded));
            SubLObject new_bindings = v_bindings;
            SubLObject cdolist_list_var = new_bindings;
            SubLObject new_binding = NIL;
            for (new_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_binding = cdolist_list_var.first()) {
                rplacd(new_binding, bindings.apply_bindings(v_bindings, new_binding.rest()));
            }
            while (NIL != new_bindings) {
                folded = bindings.apply_bindings(new_bindings, folded);
                new_bindings = com.cyc.cycjava.cycl.cyclifier.get_assignment(folded, com.cyc.cycjava.cycl.cyclifier.non_singleton_free_vars(folded));
            } 
            if (folded.equal($list_alt176)) {
                folded = NIL;
            }
            return folded;
        }
    }

    public static final SubLFile me = new cyclifier();

 public static final String myName = "com.cyc.cycjava.cycl.cyclifier";


    // defparameter
    /**
     * Is the cyclifier being called in such a way that full-quantifier support is
     * desired (e.g. 'every X', ...)
     */
    @LispMethod(comment = "Is the cyclifier being called in such a way that full-quantifier support is\r\ndesired (e.g. \'every X\', ...)\ndefparameter\nIs the cyclifier being called in such a way that full-quantifier support is\ndesired (e.g. \'every X\', ...)")
    public static final SubLSymbol $full_cyclifier_quantifier_support$ = makeSymbol("*FULL-CYCLIFIER-QUANTIFIER-SUPPORT*");

    // defparameter
    // A list of currently existing cyclifiers
    /**
     * A list of currently existing cyclifiers
     */
    @LispMethod(comment = "A list of currently existing cyclifiers\ndefparameter")
    public static final SubLSymbol $cyclifiers$ = makeSymbol("*CYCLIFIERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cyclifier_catch_errorsP$ = makeSymbol("*CYCLIFIER-CATCH-ERRORS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_cyclifier_parser_factory$ = makeSymbol("*DEFAULT-CYCLIFIER-PARSER-FACTORY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cyclifier_test_sentences$ = makeSymbol("*CYCLIFIER-TEST-SENTENCES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$X = makeString("X");

    private static final SubLSymbol LF_LITERAL = makeSymbol("LF-LITERAL");

    static private final SubLList $list3 = list(new SubLObject[]{ list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ARGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARG"), list(makeSymbol("I")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNARY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BINARY-P"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE");

    static private final SubLList $list13 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list14 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list15 = list(makeString("Prints this literal to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeSymbol("PREDICATE"), makeSymbol("STREAM")), list(makeSymbol("WRITE-CHAR"), CHAR_lparen, makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("FIRST"), makeSymbol("ARGS")), makeSymbol("STREAM")), list(makeSymbol("CDOLIST"), list(makeSymbol("ARG"), list(makeSymbol("CDR"), makeSymbol("ARGS"))), list(makeSymbol("WRITE-STRING"), makeString(", "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("ARG"), makeSymbol("STREAM"))), list(makeSymbol("WRITE-CHAR"), CHAR_rparen, makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    static private final SubLString $str17$__ = makeString(", ");

    private static final SubLSymbol LF_LITERAL_PRINT_METHOD = makeSymbol("LF-LITERAL-PRINT-METHOD");

    static private final SubLList $list20 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list21 = list(makeString("@return stringp; the predicate of this literal"), list(RET, makeSymbol("PREDICATE")));

    static private final SubLSymbol $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    private static final SubLSymbol LF_LITERAL_GET_PREDICATE_METHOD = makeSymbol("LF-LITERAL-GET-PREDICATE-METHOD");

    static private final SubLList $list25 = list(makeString("@return listp; the list of arguments of this lf-literal"), list(RET, makeSymbol("ARGS")));

    static private final SubLSymbol $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    private static final SubLSymbol LF_LITERAL_GET_ARGS_METHOD = makeSymbol("LF-LITERAL-GET-ARGS-METHOD");

    static private final SubLList $list29 = list(makeSymbol("I"));

    static private final SubLList $list30 = list(makeString("@param i non-negative-integer; the argument index of the argument to be returned\n   @return lf-variable; the variable in argument position I of this literal, \n   nil if there is none"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("POSITIVE-INTEGER-P")), list(RET, list(makeSymbol("CAR"), list(makeSymbol("NTHCDR"), list(makeSymbol("1-"), makeSymbol("I")), makeSymbol("ARGS")))));

    static private final SubLSymbol $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    private static final SubLSymbol LF_LITERAL_GET_ARG_METHOD = makeSymbol("LF-LITERAL-GET-ARG-METHOD");

    private static final SubLSymbol GET_REF = makeSymbol("GET-REF");

    static private final SubLList $list35 = list(makeString("@return lf-variable; the referent of this literal"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ARG")), ZERO_INTEGER)));

    private static final SubLSymbol LF_LITERAL_GET_REF_METHOD = makeSymbol("LF-LITERAL-GET-REF-METHOD");

    private static final SubLSymbol GET_PARSE = makeSymbol("GET-PARSE");

    static private final SubLList $list38 = list(makeString("@return parse-tree-p; the parse tree whose logical form is this literal"), list(RET, makeSymbol("PARSE")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    private static final SubLSymbol LF_LITERAL_GET_PARSE_METHOD = makeSymbol("LF-LITERAL-GET-PARSE-METHOD");

    private static final SubLSymbol UNARY_P = makeSymbol("UNARY-P");

    static private final SubLList $list42 = list(makeString("@return boolean; t if this literal is unary, nil otherwise"), list(RET, list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("ARGS")), ONE_INTEGER)));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    private static final SubLSymbol LF_LITERAL_UNARY_P_METHOD = makeSymbol("LF-LITERAL-UNARY-P-METHOD");

    private static final SubLSymbol BINARY_P = makeSymbol("BINARY-P");

    static private final SubLList $list46 = list(makeString("@return boolean; t if this literal is binary, nil otherwise"), list(RET, list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("ARGS")), TWO_INTEGER)));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");

    private static final SubLSymbol LF_LITERAL_BINARY_P_METHOD = makeSymbol("LF-LITERAL-BINARY-P-METHOD");

    private static final SubLSymbol PHRASE_TREE = makeSymbol("PHRASE-TREE");

    static private final SubLList $list51 = list(makeString("@return listp; the logical form of this parse tree"), list(makeSymbol("CLET"), list(list(makeSymbol("LF"), NIL)), list(makeSymbol("CDOVECTOR"), list(makeSymbol("DAUGHTER"), makeSymbol("DAUGHTERS")), list(makeSymbol("CSETQ"), makeSymbol("LF"), list(makeSymbol("APPEND"), makeSymbol("LF"), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(QUOTE, makeSymbol("LOGICAL-FORM-INT")))))), list(RET, makeSymbol("LF"))));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");

    private static final SubLSymbol PHRASE_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("PHRASE-TREE-LOGICAL-FORM-INT-METHOD");

    private static final SubLSymbol GET_LF_PREDICATE = makeSymbol("GET-LF-PREDICATE");

    private static final SubLSymbol WORD_TREE = makeSymbol("WORD-TREE");

    static private final SubLList $list56 = list(makeString("@return stringp; the predicate name of this word tree"), list(makeSymbol("CLET"), list(makeSymbol("CLASS"), makeSymbol("POS")), list(makeSymbol("PCOND"), list(list(makeSymbol("NAME-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("NP")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("PROPER-NOUN"))), list(list(makeSymbol("NOMINAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("NN")), list(makeSymbol("CSETQ"), makeSymbol("POS"), $NOUN)), list(list(makeSymbol("VERBAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("VB")), list(makeSymbol("CSETQ"), makeSymbol("POS"), $VERB)), list(list(makeSymbol("ADJECTIVAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("JJ")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("ADJECTIVE"))), list(list(makeSymbol("ADVERBIAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("RB")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("ADVERB"))), list(list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("IN")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("PREPOSITION"))), list(T, list(makeSymbol("CSETQ"), makeSymbol("CLASS"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("CATEGORY"))))), list(RET, list(makeSymbol("CCONCATENATE"), list(makeSymbol("STRING-DOWNCASE"), list(makeSymbol("GET-ROOT"), makeSymbol("STRING"), makeSymbol("POS"))), makeString("_"), makeSymbol("CLASS")))));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    static private final SubLString $$$NP = makeString("NP");

    static private final SubLString $$$NN = makeString("NN");

    static private final SubLString $$$VB = makeString("VB");

    static private final SubLString $$$JJ = makeString("JJ");

    static private final SubLString $$$RB = makeString("RB");

    static private final SubLString $$$IN = makeString("IN");

    static private final SubLString $str70$_ = makeString("_");

    private static final SubLSymbol WORD_TREE_GET_LF_PREDICATE_METHOD = makeSymbol("WORD-TREE-GET-LF-PREDICATE-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE = makeSymbol("VERBAL-WORD-TREE");

    static private final SubLList $list73 = list(makeString("@return listp; the logical form of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), makeSymbol("REFS"))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("OBJECTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))), list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))), list(makeSymbol("CL-COMPLEMENTS"), list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("VERBAL-COMPLEMENT")))), list(makeSymbol("I"), ZERO_INTEGER)), list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBJ-REF"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("subj"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("SUBJ-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJECT"), makeSymbol("OBJECTS")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJ-REF"), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("CCONCATENATE"), makeString("obj"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("I"))), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("OBJ-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CL-COMPLEMENT"), makeSymbol("CL-COMPLEMENTS")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), list(makeSymbol("FIM"), makeSymbol("CL-COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("CCONCATENATE"), makeString("clause"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("I"))), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("COMP-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LF")))));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    static private final SubLString $$$subj = makeString("subj");

    static private final SubLString $$$obj = makeString("obj");

    static private final SubLString $$$clause = makeString("clause");

    private static final SubLSymbol VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD");

    private static final SubLSymbol MODIFIER_WORD_TREE = makeSymbol("MODIFIER-WORD-TREE");

    static private final SubLList $list84 = list(makeString("@return listp; the logical form of this modifier"), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("GET-LF-PREDICATE"), makeSymbol("SELF")), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIED"), makeSymbol("MODIFIEDS")), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIED-REF"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("modifies"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("MODIFIED-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLString $$$modifies = makeString("modifies");

    private static final SubLSymbol MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE = makeSymbol("NOMINAL-WORD-TREE");

    static private final SubLList $list89 = list(makeString("@return listp; the logical form of this noun"), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("I"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("CCONCATENATE"), makeString("arg"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("I"))), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("COMP-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLString $$$arg = makeString("arg");

    private static final SubLSymbol NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE");

    static private final SubLList $list94 = list(makeString("@return listp; the logical form of this preposition"), list(makeSymbol("PWHEN"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("of")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("COMPLEMENTS"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("MOD-REFS"), list(makeSymbol("FWHEN"), makeSymbol("MODIFIED"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-REFS")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD-REF"), makeSymbol("MOD-REFS")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("modifies"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("MOD-REF")), makeSymbol("SELF")), makeSymbol("LF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("arg"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("COMP-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLString $$$of = makeString("of");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD");

    private static final SubLSymbol POSSESSIVE_WORD_TREE = makeSymbol("POSSESSIVE-WORD-TREE");

    static private final SubLList $list100 = list(makeString("@return listp; the logical form of this possessive"), list(makeSymbol("CLET"), list(list(makeSymbol("LF"), NIL), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS"))))), list(makeSymbol("COMP-REFS"), list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))), list(makeSymbol("POSSESSION"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-INDEX"))))))), list(makeSymbol("POSS-REFS"), list(makeSymbol("FWHEN"), makeSymbol("POSSESSION"), list(makeSymbol("FIM"), makeSymbol("POSSESSION"), list(QUOTE, makeSymbol("GET-REFS")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), makeSymbol("COMP-REFS")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSS-REF"), makeSymbol("POSS-REFS")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("COMP-REF"), makeSymbol("POSS-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD");

    private static final SubLSymbol POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD");

    static private final SubLList $list109 = list(makeSymbol("&OPTIONAL"), makeSymbol("LEXICON"));

    static private final SubLList $list110 = list(makeString("@return listp; the logical form of this parse tree"), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LEXICON"), makeSymbol("ABSTRACT-LEXICON-P")), list(makeSymbol("PWHEN"), makeSymbol("LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-INT")), makeSymbol("LEXICON"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LOGICAL-FORM-INT")))));

    private static final SubLSymbol PARSE_TREE_LOGICAL_FORM_METHOD = makeSymbol("PARSE-TREE-LOGICAL-FORM-METHOD");

    private static final SubLSymbol GET_ROOT = makeSymbol("GET-ROOT");

    static private final SubLList $list123 = list(makeSymbol("ITERATOR-TEMPLATE"));

    static private final SubLList $list124 = list(new SubLObject[]{ list(makeSymbol("TREE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUBCYCLIFIER-POOL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WFF-CHECK?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RAW-CYCLIFIED?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RAW-CYCLIFICATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SCORE-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTPUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEXT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SCORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MEMOIZATION-STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SBHL-RESOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-NEXT?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WFF-CHECK"), list(makeSymbol("CYCL")), makeKeyword("PROTECTED")) });

    private static final SubLSymbol SBHL_RESOURCE = makeSymbol("SBHL-RESOURCE");

    static private final SubLSymbol $sym133$RAW_CYCLIFIED_ = makeSymbol("RAW-CYCLIFIED?");

    static private final SubLSymbol $sym134$WFF_CHECK_ = makeSymbol("WFF-CHECK?");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE");

    static private final SubLSymbol $sym139$HAS_NEXT_ = makeSymbol("HAS-NEXT?");

    static private final SubLList $list140 = list(makeString("@return boolean; t if there is another valid interpretation, nil otherwise"), list(makeSymbol("PUNLESS"), makeSymbol("RAW-CYCLIFIED?"), list(makeSymbol("CLET"), list(list(makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), NIL), list(makeSymbol("*CYCLIFICATION-COMPLETE*"), NIL), list(makeSymbol("*CYCLIFIERS*"), list(makeSymbol("CONS"), makeSymbol("SELF"), makeSymbol("*CYCLIFIERS*")))), list(makeSymbol("IGNORE"), makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), makeSymbol("*CYCLIFICATION-COMPLETE*"), makeSymbol("*CYCLIFIERS*")), list(makeSymbol("CSETQ"), makeSymbol("RAW-CYCLIFICATIONS"), list(makeSymbol("RANK-CYCLIFICATIONS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("CYCLIFY-INT"))), makeSymbol("SCORE-FUNCTION"))), list(makeSymbol("CSETQ"), makeSymbol("RAW-CYCLIFIED?"), T))), list(makeSymbol("UNTIL"), list(makeSymbol("COR"), makeSymbol("NEXT"), list(makeSymbol("CNOT"), makeSymbol("RAW-CYCLIFICATIONS"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("CAR"), list(makeSymbol("FIRST"), makeSymbol("RAW-CYCLIFICATIONS")))), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), list(makeSymbol("CDR"), list(makeSymbol("FIRST"), makeSymbol("RAW-CYCLIFICATIONS")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("EL-FORMULA")), makeSymbol("NEXT"))), list(makeSymbol("PWHEN"), list(makeSymbol("EL-FORMULA-P"), makeSymbol("NEXT")), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("EL-REMOVE-UNNECESSARY-EXISTENTIALS"), makeSymbol("NEXT"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FOLD-EQUALS"), makeSymbol("NEXT"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("TREE-DELETE"), makeKeyword("SCOPE"), list(makeSymbol("BEAUTIFY-CYCLIFICATION"), makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), makeSymbol("WFF-CHECK?"), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WFF-CHECK")), makeSymbol("NEXT")))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEXT")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("CYCLIFIABLE-QUESTION-P")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FIRST"), list(makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY"), makeSymbol("NEXT"), reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric")))))), list(makeSymbol("CSETQ"), makeSymbol("RAW-CYCLIFICATIONS"), list(makeSymbol("REST"), makeSymbol("RAW-CYCLIFICATIONS")))), list(RET, list(makeSymbol("BOOLEAN"), makeSymbol("NEXT"))));

    static private final SubLSymbol $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");

    private static final SubLSymbol WFF_CHECK = makeSymbol("WFF-CHECK");

    private static final SubLSymbol CYCLIFIABLE_QUESTION_P = makeSymbol("CYCLIFIABLE-QUESTION-P");

    private static final SubLObject $const147$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    static private final SubLSymbol $sym148$CYCLIFIER_HAS_NEXT__METHOD = makeSymbol("CYCLIFIER-HAS-NEXT?-METHOD");

    static private final SubLList $list149 = list(makeString("@return el-formula-p; the next interpretation of this iterator"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HAS-NEXT?"))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCL"), list(makeSymbol("GET-CYCLIFIER-NEXT"), makeSymbol("SELF"))), list(makeSymbol("S"), list(makeSymbol("GET-CYCLIFIER-SCORE"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), NIL), list(makeSymbol("PCASE"), makeSymbol("OUTPUT"), list(makeKeyword("BRIEF"), list(RET, makeSymbol("CYCL"))), list(makeKeyword("VERBOSE"), list(RET, list(makeSymbol("CONS"), makeSymbol("CYCL"), makeSymbol("S")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Illegal output format ~a"), makeSymbol("OUTPUT")))))));

    static private final SubLSymbol $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");

    static private final SubLString $str153$Illegal_output_format__a = makeString("Illegal output format ~a");

    private static final SubLSymbol CYCLIFIER_NEXT_METHOD = makeSymbol("CYCLIFIER-NEXT-METHOD");

    static private final SubLList $list155 = list(makeSymbol("CYCL"));

    static private final SubLList $list156 = list(list(makeSymbol("CLET"), list(list(makeSymbol("WFF?"), NIL)), list(makeSymbol("WITH-MEMOIZATION-STATE"), list(makeSymbol("MEMOIZATION-STATE")), list(makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE"), makeSymbol("SBHL-RESOURCE"), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("WFF?"), makeSymbol("CYCL")), list(makeSymbol("CYCLIFIER-WFF?"), list(makeSymbol("NART-SUBSTITUTE"), makeSymbol("CYCL")))))), list(RET, list(makeSymbol("FWHEN"), makeSymbol("WFF?"), makeSymbol("CYCL")))));

    static private final SubLSymbol $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");

    private static final SubLSymbol CYCLIFIER_WFF_CHECK_METHOD = makeSymbol("CYCLIFIER-WFF-CHECK-METHOD");

    private static final SubLList $list160 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("DataForNLMt"), reader_make_constant_shell("AnytimePSC"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str164$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str165$____original__S____output_cycl__S = makeString("~%(:original ~S~% :output-cycl ~S~% :wff? ~S :kb ~S)~%");

    private static final SubLList $list167 = list(makeSymbol("ERROR"));

    static private final SubLList $list168 = list(list(makeSymbol("PCASE"), makeSymbol("ERROR-HANDLING"), list(makeKeyword("THROW"), list(makeSymbol("ERROR"), makeSymbol("ERROR"))), list($WARN, list(makeSymbol("WARN"), makeSymbol("ERROR")))));

    private static final SubLSymbol $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");

    private static final SubLSymbol CYCLIFIER_HANDLE_ERROR_METHOD = makeSymbol("CYCLIFIER-HANDLE-ERROR-METHOD");



    private static final SubLSymbol BEAUTIFY_CYCLIFICATION = makeSymbol("BEAUTIFY-CYCLIFICATION");

    private static final SubLSymbol $sym175$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLList $list176 = list(reader_make_constant_shell("and"));



    private static final SubLList $list178 = list(reader_make_constant_shell("equalSymbols"), reader_make_constant_shell("equals"));

    private static final SubLSymbol GET_CYCL = makeSymbol("GET-CYCL");

    private static final SubLList $list181 = list(cons(makeKeyword("SUBJECT"), makeSymbol("?SUBJECT")));

    static private final SubLList $list182 = list(makeSymbol("?SUBJECT"));



    private static final SubLList $list185 = list(cons(makeKeyword("OBLIQUE-OBJECT"), makeKeyword("PREP-OBJECT")));

    private static final SubLSymbol NEW_STANFORD_PARSER = makeSymbol("NEW-STANFORD-PARSER");

    private static final SubLString $str195$Sentence__ = makeString("Sentence: ");

    private static final SubLSymbol CYCLIFY_PARSE = makeSymbol("CYCLIFY-PARSE");

    private static final SubLString $str198$__ = makeString("??");

    private static final SubLList $list199 = list(new SubLObject[]{ list(makeSymbol("CYCL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WORD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYCL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WORD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("EL-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SCORE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("FIND"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SUBSTITUTE"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE");

    private static final SubLList $list205 = list(makeString("@return el-formula-p; the cycl part of this string semantics"), list(RET, makeSymbol("CYCL")));

    private static final SubLSymbol $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    private static final SubLSymbol CYCLIFICATION_GET_CYCL_METHOD = makeSymbol("CYCLIFICATION-GET-CYCL-METHOD");

    private static final SubLList $list209 = list(makeString("@return stringp; the string of this cyclification"), list(RET, makeSymbol("WORD")));

    private static final SubLSymbol $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    private static final SubLSymbol CYCLIFICATION_GET_WORD_METHOD = makeSymbol("CYCLIFICATION-GET-WORD-METHOD");

    private static final SubLList $list213 = list(makeString("@return non-negative-integerp; the confidence that the lex entry of this cyclification\n   is the intended meaning of its word"), list(RET, makeSymbol("CONFIDENCE")));

    private static final SubLSymbol $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    private static final SubLSymbol CYCLIFICATION_GET_CONFIDENCE_METHOD = makeSymbol("CYCLIFICATION-GET-CONFIDENCE-METHOD");

    private static final SubLList $list217 = list(makeString("@return cyclification-p; a copy of this cyclification"), list(makeSymbol("CLET"), list(list(makeSymbol("COPY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYCLIFICATION"))))), list(makeSymbol("SET-CYCLIFICATION-CYCL"), makeSymbol("COPY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CYCL")))), list(makeSymbol("SET-CYCLIFICATION-WORD"), makeSymbol("COPY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-WORD")))), list(makeSymbol("SET-CYCLIFICATION-CONFIDENCE"), makeSymbol("COPY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))), list(RET, makeSymbol("COPY"))));

    private static final SubLSymbol CYCLIFICATION_COPY_METHOD = makeSymbol("CYCLIFICATION-COPY-METHOD");

    private static final SubLList $list219 = list(makeString("Pretty-prints this word semantics to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<CYCLIFICATION "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("CYCL"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    private static final SubLString $str221$__CYCLIFICATION_ = makeString("#<CYCLIFICATION ");

    private static final SubLString $str222$_ = makeString(">");

    private static final SubLSymbol CYCLIFICATION_PRINT_METHOD = makeSymbol("CYCLIFICATION-PRINT-METHOD");

    private static final SubLList $list224 = list(makeSymbol("CYCLIFICATION-FORMULA"));

    static private final SubLList $list225 = list(makeString("@return el-formula-p; the el-formula of CYCLIFICATION-FORMULA"), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("CYCLIFICATION-FORMULA")), list(makeSymbol("CDOLIST"), list(makeSymbol("E"), makeSymbol("CYCLIFICATION-FORMULA")), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("EL-FORMULA")), makeSymbol("E")), makeSymbol("RESULT")))), list(list(makeSymbol("CYCLIFICATION-P"), makeSymbol("CYCLIFICATION-FORMULA")), list(RET, list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("EL-FORMULA")), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION-FORMULA"), list(QUOTE, makeSymbol("GET-CYCL")))))), list(T, list(RET, makeSymbol("CYCLIFICATION-FORMULA")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("RESULT")))));

    private static final SubLSymbol CYCLIFICATION_EL_FORMULA_METHOD = makeSymbol("CYCLIFICATION-EL-FORMULA-METHOD");

    private static final SubLList $list228 = list(makeSymbol("CYCLIFICATION"), makeSymbol("ITEM"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)));

    static private final SubLList $list229 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("CSOME"), list(makeSymbol("E"), makeSymbol("CYCLIFICATION"), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("FIND")), makeSymbol("E"), makeSymbol("ITEM"), makeSymbol("TEST")))), list(RET, makeSymbol("RESULT")))), list(list(makeSymbol("CYCLIFICATION-P"), makeSymbol("CYCLIFICATION")), list(RET, list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("FIND")), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-CYCL"))), makeSymbol("ITEM"), makeSymbol("TEST")))), list(T, list(RET, list(makeSymbol("FUNCALL"), makeSymbol("TEST"), makeSymbol("CYCLIFICATION"), makeSymbol("ITEM"))))));

    private static final SubLSymbol CYCLIFICATION_FIND_METHOD = makeSymbol("CYCLIFICATION-FIND-METHOD");

    private static final SubLList $list232 = list(makeSymbol("CYCLIFICATION"), makeSymbol("NEW"), makeSymbol("OLD"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)));

    static private final SubLList $list233 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LIST"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("E"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("SUBSTITUTE")), makeSymbol("E"), makeSymbol("NEW"), makeSymbol("OLD")), makeSymbol("NEW-LIST"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("NEW-LIST"))))), list(list(makeSymbol("CYCLIFICATION-P"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYCLIFICATION"))))), list(makeSymbol("SET-CYCLIFICATION-CYCL"), makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("SUBSTITUTE")), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-CYCL"))), makeSymbol("NEW"), makeSymbol("OLD"))), list(makeSymbol("SET-CYCLIFICATION-WORD"), makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-WORD")))), list(makeSymbol("SET-CYCLIFICATION-CONFIDENCE"), makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))), list(RET, makeSymbol("NEW-CYCLIFICATION")))), list(T, list(RET, list(makeSymbol("FIF"), list(makeSymbol("FUNCALL"), makeSymbol("TEST"), makeSymbol("CYCLIFICATION"), makeSymbol("OLD")), makeSymbol("NEW"), makeSymbol("CYCLIFICATION"))))));

    private static final SubLSymbol CYCLIFICATION_SUBSTITUTE_METHOD = makeSymbol("CYCLIFICATION-SUBSTITUTE-METHOD");

    private static final SubLString $str235$illegal_cyclification__a = makeString("illegal cyclification ~a");

    private static final SubLString $str237$Illegal_cyclification__a = makeString("Illegal cyclification ~a");

    private static final SubLSymbol CYCLIFICATION_SCORE = makeSymbol("CYCLIFICATION-SCORE");

    private static final SubLSymbol $sym239$_ = makeSymbol(">");

    private static final SubLSymbol $sym241$_ = makeSymbol("<");

    private static final SubLSymbol QUANTIFIER_SCOPING_SCORE = makeSymbol("QUANTIFIER-SCOPING-SCORE");

    private static final SubLSymbol GET_ABS_INDEX = makeSymbol("GET-ABS-INDEX");

    private static final SubLList $list246 = list(new SubLObject[]{ makeString("What is the involvement of the armed forces in the chemical weapons process in Lybia?"), makeString("Who is Prime Minister?"), makeString("Has India used Chemical Weapons?"), makeString("Has India used Biological Weapons?"), makeString("What type of government does Lybia have?"), makeString("Who is Lybia?"), makeString("What is the population of Lybia?"), makeString("What are the major areas of economic growth in Lybia?"), makeString("What is Lybia's growth domestic product?"), makeString("Has Lybia used Chemical Weapons?"), makeString("Does Libya have access to chemical weapons research?"), makeString("Has Libya stockpiled chemical weapons?"), makeString("Has Libya used Chemical weapons?"), makeString("has Libya stored chemical weapons?"), makeString("Who are Iran's Chemical Weapons Scientists?"), makeString("what is the distance from Tehran to Baghdad?"), makeString("how far is Iran from Iraq?"), makeString("Where are Pakistan's chemical weapons?"), makeString("What are Pakistan delivery systems?"), makeString("Who are Pakistans scientists?"), makeString("Where are Pakistan's chemical facilities?"), makeString("Where are Pakistan's chemical plants?"), makeString("What chemicals does Pakistan have?"), makeString("Where are Pakistan's pesticide plants?"), makeString("Which scientists are involved in Russia's chemcial weapons program?"), makeString("What Russian weapons systems are capable of delivering chemical weapons?"), makeString("Which countries has Russia assisted in chemical weapons?"), makeString("What Russian NBC weapons facilities store what types of materials?"), makeString("Who are Russia's chemical scientists?"), makeString("What chemical weapons does Russia have?"), makeString("What happened to South Africa's chemical weapons scientists?"), makeString("What are the current and future development of chemicals in South Africa?"), makeString("Tell me about Egypt's biological weapons program."), makeString("Does Egypt possess old technology for biological weapons?") });

    private static final SubLString $str247$sentence___S__ = makeString("sentence: ~S~%");

    private static final SubLSymbol INFERENCE_FORMULA_FOLLOWS = makeSymbol("INFERENCE-FORMULA-FOLLOWS");



    private static final SubLSymbol $sym250$INSTANCEFN_NAT_ = makeSymbol("INSTANCEFN-NAT?");

    static final boolean assertionsDisabledSynth = true;

    // Definitions
    public static final SubLObject new_lf_variable_alt(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$X;
        }
        return cycl_variables.gentemp_el_var(string_to_el_var_name(prefix));
    }

    // Definitions
    public static SubLObject new_lf_variable(SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$X;
        }
        return cycl_variables.gentemp_el_var(string_to_el_var_name(prefix));
    }

    public static final SubLObject get_lf_literal_parse_alt(SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, THREE_INTEGER, PARSE);
    }

    public static SubLObject get_lf_literal_parse(final SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, THREE_INTEGER, PARSE);
    }

    public static final SubLObject set_lf_literal_parse_alt(SubLObject lf_literal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, THREE_INTEGER, PARSE);
    }

    public static SubLObject set_lf_literal_parse(final SubLObject lf_literal, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, THREE_INTEGER, PARSE);
    }

    public static final SubLObject get_lf_literal_args_alt(SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, TWO_INTEGER, ARGS);
    }

    public static SubLObject get_lf_literal_args(final SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, TWO_INTEGER, ARGS);
    }

    public static final SubLObject set_lf_literal_args_alt(SubLObject lf_literal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, TWO_INTEGER, ARGS);
    }

    public static SubLObject set_lf_literal_args(final SubLObject lf_literal, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, TWO_INTEGER, ARGS);
    }

    public static final SubLObject get_lf_literal_predicate_alt(SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, ONE_INTEGER, PREDICATE);
    }

    public static SubLObject get_lf_literal_predicate(final SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, ONE_INTEGER, PREDICATE);
    }

    public static final SubLObject set_lf_literal_predicate_alt(SubLObject lf_literal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, ONE_INTEGER, PREDICATE);
    }

    public static SubLObject set_lf_literal_predicate(final SubLObject lf_literal, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, ONE_INTEGER, PREDICATE);
    }

    public static final SubLObject subloop_reserved_initialize_lf_literal_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lf_literal_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_lf_literal_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LF_LITERAL, PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, LF_LITERAL, ARGS, NIL);
        classes.subloop_initialize_slot(new_instance, LF_LITERAL, PARSE, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lf_literal_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LF_LITERAL, PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, LF_LITERAL, ARGS, NIL);
        classes.subloop_initialize_slot(new_instance, LF_LITERAL, PARSE, NIL);
        return NIL;
    }

    public static final SubLObject lf_literal_p_alt(SubLObject lf_literal) {
        return classes.subloop_instanceof_class(lf_literal, LF_LITERAL);
    }

    public static SubLObject lf_literal_p(final SubLObject lf_literal) {
        return classes.subloop_instanceof_class(lf_literal, LF_LITERAL);
    }

    public static final SubLObject new_lf_literal_alt(SubLObject predicate, SubLObject v_arguments, SubLObject parse) {
        {
            SubLObject literal = object.new_class_instance(LF_LITERAL);
            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_predicate(literal, predicate);
            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_args(literal, v_arguments);
            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_parse(literal, parse);
            return literal;
        }
    }

    public static SubLObject new_lf_literal(final SubLObject predicate, final SubLObject v_arguments, final SubLObject parse) {
        final SubLObject literal = object.new_class_instance(LF_LITERAL);
        set_lf_literal_predicate(literal, predicate);
        set_lf_literal_args(literal, v_arguments);
        set_lf_literal_parse(literal, parse);
        return literal;
    }

    /**
     * Prints this literal to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this literal to STREAM, ignoring DEPTH")
    public static final SubLObject lf_literal_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject args = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_args(self);
            SubLObject predicate = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_predicate(self);
            try {
                try {
                    write_string(predicate, stream, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_lparen, stream);
                    princ(args.first(), stream);
                    {
                        SubLObject cdolist_list_var = args.rest();
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            write_string($str_alt17$__, stream, UNPROVIDED, UNPROVIDED);
                            princ(arg, stream);
                        }
                    }
                    write_char(CHAR_rparen, stream);
                    sublisp_throw($sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_args(self, args);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_predicate(self, predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     * Prints this literal to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this literal to STREAM, ignoring DEPTH")
    public static SubLObject lf_literal_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject args = get_lf_literal_args(self);
        final SubLObject predicate = get_lf_literal_predicate(self);
        try {
            thread.throwStack.push($sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                write_string(predicate, stream, UNPROVIDED, UNPROVIDED);
                write_char(CHAR_lparen, stream);
                princ(args.first(), stream);
                SubLObject cdolist_list_var = args.rest();
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    write_string($str17$__, stream, UNPROVIDED, UNPROVIDED);
                    princ(arg, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                write_char(CHAR_rparen, stream);
                sublisp_throw($sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_args(self, args);
                    set_lf_literal_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @return stringp; the predicate of this literal
     */
    @LispMethod(comment = "@return stringp; the predicate of this literal")
    public static final SubLObject lf_literal_get_predicate_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject predicate = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_predicate(self);
            try {
                try {
                    sublisp_throw($sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD, predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_predicate(self, predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     *
     *
     * @return stringp; the predicate of this literal
     */
    @LispMethod(comment = "@return stringp; the predicate of this literal")
    public static SubLObject lf_literal_get_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject predicate = get_lf_literal_predicate(self);
        try {
            thread.throwStack.push($sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                sublisp_throw($sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD, predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @return listp; the list of arguments of this lf-literal
     */
    @LispMethod(comment = "@return listp; the list of arguments of this lf-literal")
    public static final SubLObject lf_literal_get_args_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject args = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_args(self);
            try {
                try {
                    sublisp_throw($sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD, args);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_args(self, args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     *
     *
     * @return listp; the list of arguments of this lf-literal
     */
    @LispMethod(comment = "@return listp; the list of arguments of this lf-literal")
    public static SubLObject lf_literal_get_args_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push($sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                sublisp_throw($sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD, args);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_args(self, args);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @param i
     * 		non-negative-integer; the argument index of the argument to be returned
     * @return lf-variable; the variable in argument position I of this literal,
    nil if there is none
     */
    @LispMethod(comment = "@param i\r\n\t\tnon-negative-integer; the argument index of the argument to be returned\r\n@return lf-variable; the variable in argument position I of this literal,\r\nnil if there is none")
    public static final SubLObject lf_literal_get_arg_method_alt(SubLObject self, SubLObject i) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject args = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_args(self);
            try {
                try {
                    SubLTrampolineFile.checkType(i, POSITIVE_INTEGER_P);
                    sublisp_throw($sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD, nthcdr(number_utilities.f_1_(i), args).first());
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_args(self, args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     *
     *
     * @param i
     * 		non-negative-integer; the argument index of the argument to be returned
     * @return lf-variable; the variable in argument position I of this literal,
    nil if there is none
     */
    @LispMethod(comment = "@param i\r\n\t\tnon-negative-integer; the argument index of the argument to be returned\r\n@return lf-variable; the variable in argument position I of this literal,\r\nnil if there is none")
    public static SubLObject lf_literal_get_arg_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push($sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                assert NIL != subl_promotions.positive_integer_p(i) : "! subl_promotions.positive_integer_p(i) " + ("subl_promotions.positive_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(i) ") + i;
                sublisp_throw($sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD, nthcdr(number_utilities.f_1_(i), args).first());
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_args(self, args);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @return lf-variable; the referent of this literal
     */
    @LispMethod(comment = "@return lf-variable; the referent of this literal")
    public static final SubLObject lf_literal_get_ref_method_alt(SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, GET_ARG, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return lf-variable; the referent of this literal
     */
    @LispMethod(comment = "@return lf-variable; the referent of this literal")
    public static SubLObject lf_literal_get_ref_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, GET_ARG, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return parse-tree-p; the parse tree whose logical form is this literal
     */
    @LispMethod(comment = "@return parse-tree-p; the parse tree whose logical form is this literal")
    public static final SubLObject lf_literal_get_parse_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject parse = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_parse(self);
            try {
                try {
                    sublisp_throw($sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD, parse);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     *
     *
     * @return parse-tree-p; the parse tree whose logical form is this literal
     */
    @LispMethod(comment = "@return parse-tree-p; the parse tree whose logical form is this literal")
    public static SubLObject lf_literal_get_parse_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject parse = get_lf_literal_parse(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                sublisp_throw($sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD, parse);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @return boolean; t if this literal is unary, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this literal is unary, nil otherwise")
    public static final SubLObject lf_literal_unary_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject args = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_args(self);
            try {
                try {
                    sublisp_throw($sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD, numE(length(args), ONE_INTEGER));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_args(self, args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     *
     *
     * @return boolean; t if this literal is unary, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this literal is unary, nil otherwise")
    public static SubLObject lf_literal_unary_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push($sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                sublisp_throw($sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD, numE(length(args), ONE_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_args(self, args);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @return boolean; t if this literal is binary, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this literal is binary, nil otherwise")
    public static final SubLObject lf_literal_binary_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_lf_literal_method = NIL;
            SubLObject args = com.cyc.cycjava.cycl.cyclifier.get_lf_literal_args(self);
            try {
                try {
                    sublisp_throw($sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD, numE(length(args), TWO_INTEGER));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_lf_literal_args(self, args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            }
            return catch_var_for_lf_literal_method;
        }
    }

    /**
     *
     *
     * @return boolean; t if this literal is binary, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this literal is binary, nil otherwise")
    public static SubLObject lf_literal_binary_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push($sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                sublisp_throw($sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD, numE(length(args), TWO_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lf_literal_args(self, args);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }

    /**
     *
     *
     * @return listp; the logical form of this parse tree
     */
    @LispMethod(comment = "@return listp; the logical form of this parse tree")
    public static final SubLObject phrase_tree_logical_form_int_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_phrase_tree_method = NIL;
            SubLObject daughters = parse_tree.get_phrase_tree_daughters(self);
            try {
                try {
                    {
                        SubLObject lf = NIL;
                        SubLObject vector_var = daughters;
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject daughter = aref(vector_var, element_num);
                                lf = append(lf, methods.funcall_instance_method_with_0_args(daughter, LOGICAL_FORM_INT));
                            }
                        }
                        sublisp_throw($sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, lf);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            parse_tree.set_phrase_tree_daughters(self, daughters);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            }
            return catch_var_for_phrase_tree_method;
        }
    }

    /**
     *
     *
     * @return listp; the logical form of this parse tree
     */
    @LispMethod(comment = "@return listp; the logical form of this parse tree")
    public static SubLObject phrase_tree_logical_form_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = NIL;
        final SubLObject daughters = parse_tree.get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject lf = NIL;
                final SubLObject vector_var = daughters;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    lf = append(lf, methods.funcall_instance_method_with_0_args(daughter, LOGICAL_FORM_INT));
                }
                sublisp_throw($sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, lf);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    parse_tree.set_phrase_tree_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }

    /**
     *
     *
     * @return stringp; the predicate name of this word tree
     */
    @LispMethod(comment = "@return stringp; the predicate name of this word tree")
    public static final SubLObject word_tree_get_lf_predicate_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_tree_method = NIL;
            SubLObject category = parse_tree.get_parse_tree_category(self);
            SubLObject string = parse_tree.get_parse_tree_string(self);
            try {
                try {
                    {
                        SubLObject v_class = NIL;
                        SubLObject pos = NIL;
                        if (NIL != word_tree.name_word_tree_p(self)) {
                            v_class = $$$NP;
                            pos = $PROPER_NOUN;
                        } else {
                            if (NIL != word_tree.nominal_word_tree_p(self)) {
                                v_class = $$$NN;
                                pos = $NOUN;
                            } else {
                                if (NIL != word_tree.verbal_word_tree_p(self)) {
                                    v_class = $$$VB;
                                    pos = $VERB;
                                } else {
                                    if (NIL != word_tree.adjectival_word_tree_p(self)) {
                                        v_class = $$$JJ;
                                        pos = $ADJECTIVE;
                                    } else {
                                        if (NIL != word_tree.adverbial_word_tree_p(self)) {
                                            v_class = $$$RB;
                                            pos = $ADVERB;
                                        } else {
                                            if (NIL != word_tree.prepositional_or_particle_word_tree_p(self)) {
                                                v_class = $$$IN;
                                                pos = $PREPOSITION;
                                            } else {
                                                v_class = princ_to_string(category);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD, cconcatenate(Strings.string_downcase(morphology.get_root(string, pos), UNPROVIDED, UNPROVIDED), new SubLObject[]{ $str_alt70$_, v_class }));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            parse_tree.set_parse_tree_category(self, category);
                            parse_tree.set_parse_tree_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            }
            return catch_var_for_word_tree_method;
        }
    }

    /**
     *
     *
     * @return stringp; the predicate name of this word tree
     */
    @LispMethod(comment = "@return stringp; the predicate name of this word tree")
    public static SubLObject word_tree_get_lf_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        final SubLObject category = parse_tree.get_parse_tree_category(self);
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push($sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject v_class = NIL;
                SubLObject pos = NIL;
                if (NIL != word_tree.name_word_tree_p(self)) {
                    v_class = $$$NP;
                    pos = $PROPER_NOUN;
                } else
                    if (NIL != word_tree.nominal_word_tree_p(self)) {
                        v_class = $$$NN;
                        pos = $NOUN;
                    } else
                        if (NIL != word_tree.verbal_word_tree_p(self)) {
                            v_class = $$$VB;
                            pos = $VERB;
                        } else
                            if (NIL != word_tree.adjectival_word_tree_p(self)) {
                                v_class = $$$JJ;
                                pos = $ADJECTIVE;
                            } else
                                if (NIL != word_tree.adverbial_word_tree_p(self)) {
                                    v_class = $$$RB;
                                    pos = $ADVERB;
                                } else
                                    if (NIL != word_tree.prepositional_or_particle_word_tree_p(self)) {
                                        v_class = $$$IN;
                                        pos = $PREPOSITION;
                                    } else {
                                        v_class = princ_to_string(category);
                                    }





                sublisp_throw($sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD, cconcatenate(Strings.string_downcase(morphology.get_root(string, pos), UNPROVIDED, UNPROVIDED), new SubLObject[]{ $str70$_, v_class }));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    parse_tree.set_parse_tree_category(self, category);
                    parse_tree.set_parse_tree_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the logical form of this verb
     */
    @LispMethod(comment = "@return listp; the logical form of this verb")
    public static final SubLObject verbal_word_tree_logical_form_int_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_verbal_word_tree_method = NIL;
            SubLObject refs = word_tree.get_word_tree_refs(self);
            try {
                try {
                    {
                        SubLObject ref = refs.first();
                        SubLObject lf = list(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(ref), self));
                        SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
                        SubLObject objects = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_OBJECTS);
                        SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
                        SubLObject cl_complements = (NIL != verbal_complement) ? ((SubLObject) (list(verbal_complement))) : NIL;
                        SubLObject i = ZERO_INTEGER;
                        if (NIL != subject) {
                            {
                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(subject, GET_REFS);
                                SubLObject subj_ref = NIL;
                                for (subj_ref = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subj_ref = cdolist_list_var.first()) {
                                    lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal($$$subj, list(ref, subj_ref), self), lf);
                                }
                            }
                        }
                        i = ZERO_INTEGER;
                        {
                            SubLObject cdolist_list_var = objects;
                            SubLObject v_object = NIL;
                            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                                i = add(i, ONE_INTEGER);
                                {
                                    SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_0_args(v_object, GET_REFS);
                                    SubLObject obj_ref = NIL;
                                    for (obj_ref = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , obj_ref = cdolist_list_var_1.first()) {
                                        lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(cconcatenate($$$obj, write_to_string(i, EMPTY_SUBL_OBJECT_ARRAY)), list(ref, obj_ref), self), lf);
                                    }
                                }
                            }
                        }
                        i = ZERO_INTEGER;
                        {
                            SubLObject cdolist_list_var = cl_complements;
                            SubLObject cl_complement = NIL;
                            for (cl_complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cl_complement = cdolist_list_var.first()) {
                                i = add(i, ONE_INTEGER);
                                {
                                    SubLObject cdolist_list_var_2 = methods.funcall_instance_method_with_0_args(cl_complement, GET_REFS);
                                    SubLObject comp_ref = NIL;
                                    for (comp_ref = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , comp_ref = cdolist_list_var_2.first()) {
                                        lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(cconcatenate($$$clause, write_to_string(i, EMPTY_SUBL_OBJECT_ARRAY)), list(ref, comp_ref), self), lf);
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, nreverse(lf));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            word_tree.set_word_tree_refs(self, refs);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            }
            return catch_var_for_verbal_word_tree_method;
        }
    }

    /**
     *
     *
     * @return listp; the logical form of this verb
     */
    @LispMethod(comment = "@return listp; the logical form of this verb")
    public static SubLObject verbal_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = NIL;
        final SubLObject refs = word_tree.get_word_tree_refs(self);
        try {
            thread.throwStack.push($sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject ref = refs.first();
                SubLObject lf = list(new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(ref), self));
                final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
                final SubLObject objects = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_OBJECTS);
                final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
                final SubLObject cl_complements = (NIL != verbal_complement) ? list(verbal_complement) : NIL;
                SubLObject i = ZERO_INTEGER;
                if (NIL != subject) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(subject, GET_REFS);
                    SubLObject subj_ref = NIL;
                    subj_ref = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        lf = cons(new_lf_literal($$$subj, list(ref, subj_ref), self), lf);
                        cdolist_list_var = cdolist_list_var.rest();
                        subj_ref = cdolist_list_var.first();
                    } 
                }
                i = ZERO_INTEGER;
                SubLObject cdolist_list_var = objects;
                SubLObject v_object = NIL;
                v_object = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    i = add(i, ONE_INTEGER);
                    SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(v_object, GET_REFS);
                    SubLObject obj_ref = NIL;
                    obj_ref = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        lf = cons(new_lf_literal(cconcatenate($$$obj, write_to_string(i, EMPTY_SUBL_OBJECT_ARRAY)), list(ref, obj_ref), self), lf);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        obj_ref = cdolist_list_var_$1.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    v_object = cdolist_list_var.first();
                } 
                i = ZERO_INTEGER;
                cdolist_list_var = cl_complements;
                SubLObject cl_complement = NIL;
                cl_complement = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    i = add(i, ONE_INTEGER);
                    SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(cl_complement, GET_REFS);
                    SubLObject comp_ref = NIL;
                    comp_ref = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        lf = cons(new_lf_literal(cconcatenate($$$clause, write_to_string(i, EMPTY_SUBL_OBJECT_ARRAY)), list(ref, comp_ref), self), lf);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        comp_ref = cdolist_list_var_$2.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    cl_complement = cdolist_list_var.first();
                } 
                sublisp_throw($sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, nreverse(lf));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    word_tree.set_word_tree_refs(self, refs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the logical form of this modifier
     */
    @LispMethod(comment = "@return listp; the logical form of this modifier")
    public static final SubLObject modifier_word_tree_logical_form_int_method_alt(SubLObject self) {
        {
            SubLObject ref = methods.funcall_instance_method_with_0_args(self, GET_REFS).first();
            SubLObject lf = list(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(com.cyc.cycjava.cycl.cyclifier.word_tree_get_lf_predicate_method(self), list(ref), self));
            SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
            SubLObject cdolist_list_var = modifieds;
            SubLObject modified = NIL;
            for (modified = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modified = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_3 = methods.funcall_instance_method_with_0_args(modified, GET_REFS);
                    SubLObject modified_ref = NIL;
                    for (modified_ref = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , modified_ref = cdolist_list_var_3.first()) {
                        lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal($$$modifies, list(ref, modified_ref), self), lf);
                    }
                }
            }
            return lf;
        }
    }

    /**
     *
     *
     * @return listp; the logical form of this modifier
     */
    @LispMethod(comment = "@return listp; the logical form of this modifier")
    public static SubLObject modifier_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLObject ref = methods.funcall_instance_method_with_0_args(self, GET_REFS).first();
        SubLObject lf = list(new_lf_literal(word_tree_get_lf_predicate_method(self), list(ref), self));
        SubLObject cdolist_list_var;
        final SubLObject modifieds = cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
        SubLObject modified = NIL;
        modified = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_0_args(modified, GET_REFS);
            SubLObject modified_ref = NIL;
            modified_ref = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                lf = cons(new_lf_literal($$$modifies, list(ref, modified_ref), self), lf);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                modified_ref = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            modified = cdolist_list_var.first();
        } 
        return lf;
    }

    /**
     *
     *
     * @return listp; the logical form of this noun
     */
    @LispMethod(comment = "@return listp; the logical form of this noun")
    public static final SubLObject nominal_word_tree_logical_form_int_method_alt(SubLObject self) {
        {
            SubLObject complements = methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
            SubLObject ref = methods.funcall_instance_method_with_0_args(self, GET_REFS).first();
            SubLObject lf = list(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(ref), self));
            SubLObject i = ZERO_INTEGER;
            SubLObject cdolist_list_var = complements;
            SubLObject complement = NIL;
            for (complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , complement = cdolist_list_var.first()) {
                i = add(i, ONE_INTEGER);
                {
                    SubLObject cdolist_list_var_4 = methods.funcall_instance_method_with_0_args(complement, GET_REFS);
                    SubLObject comp_ref = NIL;
                    for (comp_ref = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , comp_ref = cdolist_list_var_4.first()) {
                        lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(cconcatenate($$$arg, write_to_string(i, EMPTY_SUBL_OBJECT_ARRAY)), list(ref, comp_ref), self), lf);
                    }
                }
            }
            return lf;
        }
    }

    /**
     *
     *
     * @return listp; the logical form of this noun
     */
    @LispMethod(comment = "@return listp; the logical form of this noun")
    public static SubLObject nominal_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLObject complements = methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
        final SubLObject ref = methods.funcall_instance_method_with_0_args(self, GET_REFS).first();
        SubLObject lf = list(new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(ref), self));
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = complements;
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            i = add(i, ONE_INTEGER);
            SubLObject cdolist_list_var_$4 = methods.funcall_instance_method_with_0_args(complement, GET_REFS);
            SubLObject comp_ref = NIL;
            comp_ref = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                lf = cons(new_lf_literal(cconcatenate($$$arg, write_to_string(i, EMPTY_SUBL_OBJECT_ARRAY)), list(ref, comp_ref), self), lf);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                comp_ref = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        } 
        return lf;
    }

    /**
     *
     *
     * @return listp; the logical form of this preposition
     */
    @LispMethod(comment = "@return listp; the logical form of this preposition")
    public static final SubLObject prepositional_or_particle_word_tree_logical_form_int_method_alt(SubLObject self) {
        if (methods.funcall_instance_method_with_0_args(self, GET_STRING).equalp($$$of)) {
            return NIL;
        }
        {
            SubLObject ref = methods.funcall_instance_method_with_0_args(self, GET_REFS).first();
            SubLObject lf = list(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(ref), self));
            SubLObject complements = list(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT));
            SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
            SubLObject mod_refs = (NIL != modified) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(modified, GET_REFS))) : NIL;
            {
                SubLObject cdolist_list_var = mod_refs;
                SubLObject mod_ref = NIL;
                for (mod_ref = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod_ref = cdolist_list_var.first()) {
                    lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal($$$modifies, list(ref, mod_ref), self), lf);
                }
            }
            {
                SubLObject cdolist_list_var = complements;
                SubLObject complement = NIL;
                for (complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , complement = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_5 = methods.funcall_instance_method_with_0_args(complement, GET_REFS);
                        SubLObject comp_ref = NIL;
                        for (comp_ref = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , comp_ref = cdolist_list_var_5.first()) {
                            lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal($$$arg, list(ref, comp_ref), self), lf);
                        }
                    }
                }
            }
            return lf;
        }
    }

    /**
     *
     *
     * @return listp; the logical form of this preposition
     */
    @LispMethod(comment = "@return listp; the logical form of this preposition")
    public static SubLObject prepositional_or_particle_word_tree_logical_form_int_method(final SubLObject self) {
        if (methods.funcall_instance_method_with_0_args(self, GET_STRING).equalp($$$of)) {
            return NIL;
        }
        final SubLObject ref = methods.funcall_instance_method_with_0_args(self, GET_REFS).first();
        SubLObject lf = list(new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(ref), self));
        final SubLObject complements = list(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT));
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        SubLObject cdolist_list_var;
        final SubLObject mod_refs = cdolist_list_var = (NIL != modified) ? methods.funcall_instance_method_with_0_args(modified, GET_REFS) : NIL;
        SubLObject mod_ref = NIL;
        mod_ref = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lf = cons(new_lf_literal($$$modifies, list(ref, mod_ref), self), lf);
            cdolist_list_var = cdolist_list_var.rest();
            mod_ref = cdolist_list_var.first();
        } 
        cdolist_list_var = complements;
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = methods.funcall_instance_method_with_0_args(complement, GET_REFS);
            SubLObject comp_ref = NIL;
            comp_ref = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                lf = cons(new_lf_literal($$$arg, list(ref, comp_ref), self), lf);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                comp_ref = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        } 
        return lf;
    }

    /**
     *
     *
     * @return listp; the logical form of this possessive
     */
    @LispMethod(comment = "@return listp; the logical form of this possessive")
    public static final SubLObject possessive_word_tree_logical_form_int_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_possessive_word_tree_method = NIL;
            SubLObject mother = parse_tree.get_parse_tree_mother(self);
            try {
                try {
                    {
                        SubLObject lf = NIL;
                        SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS).first();
                        SubLObject comp_refs = (NIL != complement) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(complement, GET_REFS))) : NIL;
                        SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
                        SubLObject possession = (NIL != grandmother) ? ((SubLObject) (methods.funcall_instance_method_with_2_args(grandmother, FIND_FIRST, NOMINAL_TREE_P, number_utilities.f_1X(methods.funcall_instance_method_with_0_args(mother, GET_INDEX))))) : NIL;
                        SubLObject poss_refs = (NIL != possession) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(possession, GET_REFS))) : NIL;
                        SubLObject cdolist_list_var = comp_refs;
                        SubLObject comp_ref = NIL;
                        for (comp_ref = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , comp_ref = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_6 = poss_refs;
                                SubLObject poss_ref = NIL;
                                for (poss_ref = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , poss_ref = cdolist_list_var_6.first()) {
                                    lf = cons(com.cyc.cycjava.cycl.cyclifier.new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(comp_ref, poss_ref), self), lf);
                                }
                            }
                        }
                        sublisp_throw($sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, lf);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            parse_tree.set_parse_tree_mother(self, mother);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
            }
            return catch_var_for_possessive_word_tree_method;
        }
    }

    /**
     *
     *
     * @return listp; the logical form of this possessive
     */
    @LispMethod(comment = "@return listp; the logical form of this possessive")
    public static SubLObject possessive_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_possessive_word_tree_method = NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push($sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
            try {
                SubLObject lf = NIL;
                final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS).first();
                final SubLObject comp_refs = (NIL != complement) ? methods.funcall_instance_method_with_0_args(complement, GET_REFS) : NIL;
                final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
                final SubLObject possession = (NIL != grandmother) ? methods.funcall_instance_method_with_2_args(grandmother, FIND_FIRST, NOMINAL_TREE_P, number_utilities.f_1X(methods.funcall_instance_method_with_0_args(mother, GET_INDEX))) : NIL;
                final SubLObject poss_refs = (NIL != possession) ? methods.funcall_instance_method_with_0_args(possession, GET_REFS) : NIL;
                SubLObject cdolist_list_var = comp_refs;
                SubLObject comp_ref = NIL;
                comp_ref = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$6 = poss_refs;
                    SubLObject poss_ref = NIL;
                    poss_ref = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        lf = cons(new_lf_literal(methods.funcall_instance_method_with_0_args(self, GET_LF_PREDICATE), list(comp_ref, poss_ref), self), lf);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        poss_ref = cdolist_list_var_$6.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    comp_ref = cdolist_list_var.first();
                } 
                sublisp_throw($sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, lf);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_possessive_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the logical form of this parse tree
     */
    @LispMethod(comment = "@return listp; the logical form of this parse tree")
    public static final SubLObject parse_tree_logical_form_method_alt(SubLObject self, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (NIL != lexicon) {
            SubLTrampolineFile.checkType(lexicon, ABSTRACT_LEXICON_P);
        }
        if (NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(self, LEXIFY_INT, lexicon);
        }
        return methods.funcall_instance_method_with_0_args(self, LOGICAL_FORM_INT);
    }

    /**
     *
     *
     * @return listp; the logical form of this parse tree
     */
    @LispMethod(comment = "@return listp; the logical form of this parse tree")
    public static SubLObject parse_tree_logical_form_method(final SubLObject self, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (((NIL != lexicon) && (!assertionsDisabledSynth)) && (NIL == abstract_lexicon.abstract_lexicon_p(lexicon))) {
            throw new AssertionError(lexicon);
        }
        if (NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(self, LEXIFY_INT, lexicon);
        }
        return methods.funcall_instance_method_with_0_args(self, LOGICAL_FORM_INT);
    }

    public static final SubLObject logical_form_alt(SubLObject english, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLTrampolineFile.checkType(english, STRINGP);
        if (NIL != lexicon) {
            SubLTrampolineFile.checkType(lexicon, ABSTRACT_LEXICON_P);
        }
        if (NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(lexicon, LEARN, english);
        }
        return methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_2_args(parser.new_charniak_parser(UNPROVIDED, UNPROVIDED), PARSE, english, lexicon), LOGICAL_FORM, lexicon);
    }

    public static SubLObject logical_form(final SubLObject english, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        assert NIL != stringp(english) : "! stringp(english) " + ("Types.stringp(english) " + "CommonSymbols.NIL != Types.stringp(english) ") + english;
        if (((NIL != lexicon) && (!assertionsDisabledSynth)) && (NIL == abstract_lexicon.abstract_lexicon_p(lexicon))) {
            throw new AssertionError(lexicon);
        }
        if (NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(lexicon, LEARN, english);
        }
        return methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_2_args(parser.new_charniak_parser(UNPROVIDED, UNPROVIDED), PARSE, english, lexicon), LOGICAL_FORM, lexicon);
    }

    /**
     *
     *
     * @return listp; all keywords occurring in FORMULA
     */
    @LispMethod(comment = "@return listp; all keywords occurring in FORMULA")
    public static final SubLObject formula_keywords_alt(SubLObject formula) {
        {
            SubLObject keywords = NIL;
            SubLObject stack = stacks.create_stack();
            SubLObject v_term = NIL;
            stacks.stack_push(formula, stack);
            while (NIL == stacks.stack_empty_p(stack)) {
                {
                    SubLObject entry = stacks.stack_pop(stack);
                    v_term = entry;
                    if (v_term.isKeyword()) {
                        {
                            SubLObject item_var = v_term;
                            if (NIL == member(item_var, keywords, symbol_function(EQL), symbol_function(IDENTITY))) {
                                keywords = cons(item_var, keywords);
                            }
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
            return keywords;
        }
    }

    /**
     *
     *
     * @return listp; all keywords occurring in FORMULA
     */
    @LispMethod(comment = "@return listp; all keywords occurring in FORMULA")
    public static SubLObject formula_keywords(final SubLObject formula) {
        SubLObject keywords = NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject v_term = NIL;
        stacks.stack_push(formula, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = v_term = stacks.stack_pop(stack);
            if (v_term.isKeyword()) {
                final SubLObject item_var = v_term;
                if (NIL == member(item_var, keywords, symbol_function(EQL), symbol_function(IDENTITY))) {
                    keywords = cons(item_var, keywords);
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
        return keywords;
    }

    /**
     *
     *
     * @param LEX
    lex-entry;
     * 		
     * @return listp; a list of keywords that constitute the context that LEX
    requires
     */
    @LispMethod(comment = "@param LEX\nlex-entry;\r\n\t\t\r\n@return listp; a list of keywords that constitute the context that LEX\r\nrequires")
    public static final SubLObject lexical_keywords_alt(SubLObject lex) {
        {
            SubLObject frame = methods.funcall_instance_method_with_1_args(lex, GET, $FRAME);
            SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
            return remove($ACTION, remove($SCOPE, remove_duplicates(com.cyc.cycjava.cycl.cyclifier.formula_keywords(com.cyc.cycjava.cycl.cyclifier.rename_variables(semtrans, com.cyc.cycjava.cycl.cyclifier.frame_renaming(frame))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param LEX
    lex-entry;
     * 		
     * @return listp; a list of keywords that constitute the context that LEX
    requires
     */
    @LispMethod(comment = "@param LEX\nlex-entry;\r\n\t\t\r\n@return listp; a list of keywords that constitute the context that LEX\r\nrequires")
    public static SubLObject lexical_keywords(final SubLObject lex) {
        final SubLObject frame = methods.funcall_instance_method_with_1_args(lex, GET, $FRAME);
        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
        return remove($ACTION, remove($SCOPE, remove_duplicates(formula_keywords(rename_variables(semtrans, frame_renaming(frame))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CYCLIFIABLE
    cyclifiable-p;
     * 		
     * @return subcyclifier-pool-p; the subcyclifier pool associated with CYCLIFIABLE
     */
    @LispMethod(comment = "@param CYCLIFIABLE\ncyclifiable-p;\r\n\t\t\r\n@return subcyclifier-pool-p; the subcyclifier pool associated with CYCLIFIABLE")
    public static final SubLObject get_subcyclifier_pool_alt(SubLObject tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $cyclifiers$.getDynamicValue(thread);
                SubLObject v_cyclifier = NIL;
                for (v_cyclifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cyclifier = cdolist_list_var.first()) {
                    if (methods.funcall_instance_method_with_0_args(tree, GET_ROOT) == com.cyc.cycjava.cycl.cyclifier.get_cyclifier_tree(v_cyclifier)) {
                        return com.cyc.cycjava.cycl.cyclifier.get_cyclifier_subcyclifier_pool(v_cyclifier);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCLIFIABLE
    cyclifiable-p;
     * 		
     * @return subcyclifier-pool-p; the subcyclifier pool associated with CYCLIFIABLE
     */
    @LispMethod(comment = "@param CYCLIFIABLE\ncyclifiable-p;\r\n\t\t\r\n@return subcyclifier-pool-p; the subcyclifier pool associated with CYCLIFIABLE")
    public static SubLObject get_subcyclifier_pool(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $cyclifiers$.getDynamicValue(thread);
        SubLObject v_cyclifier = NIL;
        v_cyclifier = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(tree, GET_ROOT).eql(get_cyclifier_tree(v_cyclifier))) {
                return get_cyclifier_subcyclifier_pool(v_cyclifier);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cyclifier = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject get_cyclifier_error_handling_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, TWELVE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject get_cyclifier_error_handling(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, TWELVE_INTEGER, ERROR_HANDLING);
    }

    public static final SubLObject set_cyclifier_error_handling_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, TWELVE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject set_cyclifier_error_handling(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, TWELVE_INTEGER, ERROR_HANDLING);
    }

    public static final SubLObject get_cyclifier_sbhl_resource_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, ELEVEN_INTEGER, SBHL_RESOURCE);
    }

    public static SubLObject get_cyclifier_sbhl_resource(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, ELEVEN_INTEGER, SBHL_RESOURCE);
    }

    public static final SubLObject set_cyclifier_sbhl_resource_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, ELEVEN_INTEGER, SBHL_RESOURCE);
    }

    public static SubLObject set_cyclifier_sbhl_resource(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, ELEVEN_INTEGER, SBHL_RESOURCE);
    }

    public static final SubLObject get_cyclifier_memoization_state_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, TEN_INTEGER, MEMOIZATION_STATE);
    }

    public static SubLObject get_cyclifier_memoization_state(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, TEN_INTEGER, MEMOIZATION_STATE);
    }

    public static final SubLObject set_cyclifier_memoization_state_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, TEN_INTEGER, MEMOIZATION_STATE);
    }

    public static SubLObject set_cyclifier_memoization_state(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, TEN_INTEGER, MEMOIZATION_STATE);
    }

    public static final SubLObject get_cyclifier_score_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, NINE_INTEGER, SCORE);
    }

    public static SubLObject get_cyclifier_score(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, NINE_INTEGER, SCORE);
    }

    public static final SubLObject set_cyclifier_score_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, NINE_INTEGER, SCORE);
    }

    public static SubLObject set_cyclifier_score(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, NINE_INTEGER, SCORE);
    }

    public static final SubLObject get_cyclifier_next_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, EIGHT_INTEGER, NEXT);
    }

    public static SubLObject get_cyclifier_next(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, EIGHT_INTEGER, NEXT);
    }

    public static final SubLObject set_cyclifier_next_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, EIGHT_INTEGER, NEXT);
    }

    public static SubLObject set_cyclifier_next(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, EIGHT_INTEGER, NEXT);
    }

    public static final SubLObject get_cyclifier_output_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, SEVEN_INTEGER, OUTPUT);
    }

    public static SubLObject get_cyclifier_output(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, SEVEN_INTEGER, OUTPUT);
    }

    public static final SubLObject set_cyclifier_output_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, SEVEN_INTEGER, OUTPUT);
    }

    public static SubLObject set_cyclifier_output(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, SEVEN_INTEGER, OUTPUT);
    }

    public static final SubLObject get_cyclifier_score_function_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, SIX_INTEGER, SCORE_FUNCTION);
    }

    public static SubLObject get_cyclifier_score_function(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, SIX_INTEGER, SCORE_FUNCTION);
    }

    public static final SubLObject set_cyclifier_score_function_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, SIX_INTEGER, SCORE_FUNCTION);
    }

    public static SubLObject set_cyclifier_score_function(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, SIX_INTEGER, SCORE_FUNCTION);
    }

    public static final SubLObject get_cyclifier_raw_cyclifications_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, FIVE_INTEGER, RAW_CYCLIFICATIONS);
    }

    public static SubLObject get_cyclifier_raw_cyclifications(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, FIVE_INTEGER, RAW_CYCLIFICATIONS);
    }

    public static final SubLObject set_cyclifier_raw_cyclifications_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, FIVE_INTEGER, RAW_CYCLIFICATIONS);
    }

    public static SubLObject set_cyclifier_raw_cyclifications(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, FIVE_INTEGER, RAW_CYCLIFICATIONS);
    }

    public static final SubLObject get_cyclifier_raw_cyclifiedP_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, FOUR_INTEGER, $sym133$RAW_CYCLIFIED_);
    }

    public static SubLObject get_cyclifier_raw_cyclifiedP(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, FOUR_INTEGER, $sym133$RAW_CYCLIFIED_);
    }

    public static final SubLObject set_cyclifier_raw_cyclifiedP_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, FOUR_INTEGER, $sym133$RAW_CYCLIFIED_);
    }

    public static SubLObject set_cyclifier_raw_cyclifiedP(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, FOUR_INTEGER, $sym133$RAW_CYCLIFIED_);
    }

    public static final SubLObject get_cyclifier_wff_checkP_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, THREE_INTEGER, $sym134$WFF_CHECK_);
    }

    public static SubLObject get_cyclifier_wff_checkP(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, THREE_INTEGER, $sym134$WFF_CHECK_);
    }

    public static final SubLObject set_cyclifier_wff_checkP_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, THREE_INTEGER, $sym134$WFF_CHECK_);
    }

    public static SubLObject set_cyclifier_wff_checkP(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, THREE_INTEGER, $sym134$WFF_CHECK_);
    }

    public static final SubLObject get_cyclifier_subcyclifier_pool_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, TWO_INTEGER, SUBCYCLIFIER_POOL);
    }

    public static SubLObject get_cyclifier_subcyclifier_pool(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, TWO_INTEGER, SUBCYCLIFIER_POOL);
    }

    public static final SubLObject set_cyclifier_subcyclifier_pool_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, TWO_INTEGER, SUBCYCLIFIER_POOL);
    }

    public static SubLObject set_cyclifier_subcyclifier_pool(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, TWO_INTEGER, SUBCYCLIFIER_POOL);
    }

    public static final SubLObject get_cyclifier_tree_alt(SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, ONE_INTEGER, TREE);
    }

    public static SubLObject get_cyclifier_tree(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, ONE_INTEGER, TREE);
    }

    public static final SubLObject set_cyclifier_tree_alt(SubLObject v_cyclifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, ONE_INTEGER, TREE);
    }

    public static SubLObject set_cyclifier_tree(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, ONE_INTEGER, TREE);
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, TREE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SUBCYCLIFIER_POOL, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, $sym134$WFF_CHECK_, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, $sym133$RAW_CYCLIFIED_, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, RAW_CYCLIFICATIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SCORE_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, OUTPUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, NEXT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SCORE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, MEMOIZATION_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SBHL_RESOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, ERROR_HANDLING, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, TREE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SUBCYCLIFIER_POOL, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, $sym134$WFF_CHECK_, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, $sym133$RAW_CYCLIFIED_, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, RAW_CYCLIFICATIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SCORE_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, OUTPUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, NEXT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SCORE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, MEMOIZATION_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, SBHL_RESOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER, ERROR_HANDLING, NIL);
        return NIL;
    }

    public static final SubLObject cyclifier_p_alt(SubLObject v_cyclifier) {
        return classes.subloop_instanceof_class(v_cyclifier, CYCLIFIER);
    }

    public static SubLObject cyclifier_p(final SubLObject v_cyclifier) {
        return classes.subloop_instanceof_class(v_cyclifier, CYCLIFIER);
    }

    /**
     *
     *
     * @return boolean; t if there is another valid interpretation, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if there is another valid interpretation, nil otherwise")
    public static final SubLObject cyclifier_has_nextP_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyclifier_method = NIL;
                SubLObject score = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_score(self);
                SubLObject next = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_next(self);
                SubLObject score_function = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_score_function(self);
                SubLObject raw_cyclifications = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_raw_cyclifications(self);
                SubLObject raw_cyclifiedP = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_raw_cyclifiedP(self);
                SubLObject wff_checkP = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_wff_checkP(self);
                SubLObject tree = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_tree(self);
                try {
                    try {
                        if (NIL == raw_cyclifiedP) {
                            {
                                SubLObject _prev_bind_0 = cyclifier_interface.$allow_duplicate_cyclificationsP$.currentBinding(thread);
                                SubLObject _prev_bind_1 = cyclifier_interface.$cyclification_complete$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $cyclifiers$.currentBinding(thread);
                                try {
                                    cyclifier_interface.$allow_duplicate_cyclificationsP$.bind(NIL, thread);
                                    cyclifier_interface.$cyclification_complete$.bind(NIL, thread);
                                    $cyclifiers$.bind(cons(self, $cyclifiers$.getDynamicValue(thread)), thread);
                                    raw_cyclifications = com.cyc.cycjava.cycl.cyclifier.rank_cyclifications(methods.funcall_instance_method_with_0_args(tree, CYCLIFY_INT), score_function);
                                    raw_cyclifiedP = T;
                                } finally {
                                    $cyclifiers$.rebind(_prev_bind_2, thread);
                                    cyclifier_interface.$cyclification_complete$.rebind(_prev_bind_1, thread);
                                    cyclifier_interface.$allow_duplicate_cyclificationsP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        while (!((NIL != next) || (NIL == raw_cyclifications))) {
                            next = raw_cyclifications.first().first();
                            score = raw_cyclifications.first().rest();
                            next = methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, next);
                            if (NIL != el_formula_p(next)) {
                                next = el_remove_unnecessary_existentials(next);
                                next = com.cyc.cycjava.cycl.cyclifier.fold_equals(next);
                                next = list_utilities.tree_delete($SCOPE, com.cyc.cycjava.cycl.cyclifier.beautify_cyclification(next), UNPROVIDED, UNPROVIDED);
                                if (NIL != wff_checkP) {
                                    next = methods.funcall_instance_method_with_1_args(self, WFF_CHECK, next);
                                }
                                if (!((NIL == next) || (NIL != methods.funcall_instance_method_with_0_args(tree, CYCLIFIABLE_QUESTION_P)))) {
                                    next = predicate_strengthener.typed_pred_strengthen_formula_unambiguously(next, $const147$CurrentWorldDataCollectorMt_NonHo, UNPROVIDED).first();
                                }
                            }
                            raw_cyclifications = raw_cyclifications.rest();
                        } 
                        sublisp_throw($sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD, list_utilities.sublisp_boolean(next));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_score(self, score);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_next(self, next);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_score_function(self, score_function);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_raw_cyclifications(self, raw_cyclifications);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_raw_cyclifiedP(self, raw_cyclifiedP);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_wff_checkP(self, wff_checkP);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_tree(self, tree);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
                }
                return catch_var_for_cyclifier_method;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t if there is another valid interpretation, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if there is another valid interpretation, nil otherwise")
    public static SubLObject cyclifier_has_nextP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = NIL;
        SubLObject score = get_cyclifier_score(self);
        SubLObject next = get_cyclifier_next(self);
        final SubLObject score_function = get_cyclifier_score_function(self);
        SubLObject raw_cyclifications = get_cyclifier_raw_cyclifications(self);
        SubLObject raw_cyclifiedP = get_cyclifier_raw_cyclifiedP(self);
        final SubLObject wff_checkP = get_cyclifier_wff_checkP(self);
        final SubLObject tree = get_cyclifier_tree(self);
        try {
            thread.throwStack.push($sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                if (NIL == raw_cyclifiedP) {
                    final SubLObject _prev_bind_0 = cyclifier_interface.$allow_duplicate_cyclificationsP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_complete$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $cyclifiers$.currentBinding(thread);
                    try {
                        cyclifier_interface.$allow_duplicate_cyclificationsP$.bind(NIL, thread);
                        cyclifier_interface.$cyclification_complete$.bind(NIL, thread);
                        $cyclifiers$.bind(cons(self, $cyclifiers$.getDynamicValue(thread)), thread);
                        raw_cyclifications = rank_cyclifications(methods.funcall_instance_method_with_0_args(tree, CYCLIFY_INT), score_function);
                        raw_cyclifiedP = T;
                    } finally {
                        $cyclifiers$.rebind(_prev_bind_3, thread);
                        cyclifier_interface.$cyclification_complete$.rebind(_prev_bind_2, thread);
                        cyclifier_interface.$allow_duplicate_cyclificationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                while ((NIL == next) && (NIL != raw_cyclifications)) {
                    next = raw_cyclifications.first().first();
                    score = raw_cyclifications.first().rest();
                    next = methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, next);
                    if (NIL != el_formula_p(next)) {
                        next = el_remove_unnecessary_existentials(next);
                        next = simplifier.fold_equals(next);
                        next = list_utilities.tree_delete($SCOPE, beautify_cyclification(next), UNPROVIDED, UNPROVIDED);
                        if (NIL != wff_checkP) {
                            next = methods.funcall_instance_method_with_1_args(self, WFF_CHECK, next);
                        }
                        if ((NIL != next) && (NIL == methods.funcall_instance_method_with_0_args(tree, CYCLIFIABLE_QUESTION_P))) {
                            next = predicate_strengthener.typed_pred_strengthen_formula_unambiguously(next, $const147$CurrentWorldDataCollectorMt_NonHo, UNPROVIDED).first();
                        }
                    }
                    raw_cyclifications = raw_cyclifications.rest();
                } 
                sublisp_throw($sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD, list_utilities.sublisp_boolean(next));
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclifier_score(self, score);
                    set_cyclifier_next(self, next);
                    set_cyclifier_score_function(self, score_function);
                    set_cyclifier_raw_cyclifications(self, raw_cyclifications);
                    set_cyclifier_raw_cyclifiedP(self, raw_cyclifiedP);
                    set_cyclifier_wff_checkP(self, wff_checkP);
                    set_cyclifier_tree(self, tree);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }

    /**
     *
     *
     * @return el-formula-p; the next interpretation of this iterator
     */
    @LispMethod(comment = "@return el-formula-p; the next interpretation of this iterator")
    public static final SubLObject cyclifier_next_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyclifier_method = NIL;
            SubLObject score = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_score(self);
            SubLObject next = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_next(self);
            SubLObject output = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_output(self);
            try {
                try {
                    if (NIL != methods.funcall_instance_method_with_0_args(self, $sym139$HAS_NEXT_)) {
                        {
                            SubLObject cycl = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_next(self);
                            SubLObject s = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_score(self);
                            next = NIL;
                            score = NIL;
                            {
                                SubLObject pcase_var = output;
                                if (pcase_var.eql($BRIEF)) {
                                    sublisp_throw($sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, cycl);
                                } else {
                                    if (pcase_var.eql($VERBOSE)) {
                                        sublisp_throw($sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, cons(cycl, s));
                                    } else {
                                        Errors.error($str_alt153$Illegal_output_format__a, output);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclifier_score(self, score);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclifier_next(self, next);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclifier_output(self, output);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            }
            return catch_var_for_cyclifier_method;
        }
    }

    /**
     *
     *
     * @return el-formula-p; the next interpretation of this iterator
     */
    @LispMethod(comment = "@return el-formula-p; the next interpretation of this iterator")
    public static SubLObject cyclifier_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = NIL;
        SubLObject score = get_cyclifier_score(self);
        SubLObject next = get_cyclifier_next(self);
        final SubLObject output = get_cyclifier_output(self);
        try {
            thread.throwStack.push($sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                if (NIL != methods.funcall_instance_method_with_0_args(self, $sym139$HAS_NEXT_)) {
                    final SubLObject cycl = get_cyclifier_next(self);
                    final SubLObject s = get_cyclifier_score(self);
                    next = NIL;
                    score = NIL;
                    final SubLObject pcase_var = output;
                    if (pcase_var.eql($BRIEF)) {
                        sublisp_throw($sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, cycl);
                    } else
                        if (pcase_var.eql($VERBOSE)) {
                            sublisp_throw($sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, cons(cycl, s));
                        } else {
                            Errors.error($str153$Illegal_output_format__a, output);
                        }

                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclifier_score(self, score);
                    set_cyclifier_next(self, next);
                    set_cyclifier_output(self, output);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }

    public static final SubLObject cyclifier_wff_check_method_alt(SubLObject self, SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyclifier_method = NIL;
                SubLObject sbhl_resource = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_sbhl_resource(self);
                SubLObject v_memoization_state = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_memoization_state(self);
                try {
                    try {
                        {
                            SubLObject wffP = NIL;
                            SubLObject local_state = v_memoization_state;
                            {
                                SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt158$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject _prev_bind_0_7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject wffP_8 = com.cyc.cycjava.cycl.cyclifier.cyclifier_wffP(narts_high.nart_substitute(cycl), UNPROVIDED);
                                                        SubLObject cycl_9 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        wffP = wffP_8;
                                                        cycl = cycl_9;
                                                    }
                                                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                                } finally {
                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                }
                            }
                            sublisp_throw($sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD, NIL != wffP ? ((SubLObject) (cycl)) : NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_sbhl_resource(self, sbhl_resource);
                                com.cyc.cycjava.cycl.cyclifier.set_cyclifier_memoization_state(self, v_memoization_state);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
                }
                return catch_var_for_cyclifier_method;
            }
        }
    }

    public static SubLObject cyclifier_wff_check_method(final SubLObject self, SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = NIL;
        SubLObject sbhl_resource = get_cyclifier_sbhl_resource(self);
        final SubLObject v_memoization_state = get_cyclifier_memoization_state(self);
        try {
            thread.throwStack.push($sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                SubLObject wffP = NIL;
                final SubLObject local_state = v_memoization_state;
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                            try {
                                thread.resetMultipleValues();
                                final SubLObject wffP_$8 = cyclifier_wffP(narts_high.nart_substitute(cycl), UNPROVIDED);
                                final SubLObject cycl_$9 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                wffP = wffP_$8;
                                cycl = cycl_$9;
                            } finally {
                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$7, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD, NIL != wffP ? cycl : NIL);
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    set_cyclifier_sbhl_resource(self, sbhl_resource);
                    set_cyclifier_memoization_state(self, v_memoization_state);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }

    public static final SubLObject storing_cyclifier_wff_resultsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (T == parsing_vars.$storing_cyclifier_wff_results$.getDynamicValue(thread)) {
            } else {
                if (NIL == parsing_vars.$storing_cyclifier_wff_results$.getDynamicValue(thread)) {
                } else {
                    if (($UNKNOWN == parsing_vars.$storing_cyclifier_wff_results$.getDynamicValue(thread)) && (NIL != file_utilities.file_existsP(parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread)))) {
                        parsing_vars.$storing_cyclifier_wff_results$.setDynamicValue(T, thread);
                    } else {
                        if ($UNKNOWN == parsing_vars.$storing_cyclifier_wff_results$.getDynamicValue(thread)) {
                            parsing_vars.$storing_cyclifier_wff_results$.setDynamicValue(NIL, thread);
                        }
                    }
                }
            }
            return parsing_vars.$storing_cyclifier_wff_results$.getDynamicValue(thread);
        }
    }

    public static SubLObject storing_cyclifier_wff_resultsP() {
        return NIL;
    }

    /**
     * Simplify and transform CYCL if WFF for the cyclifier.
     *
     * @return 0 nil or el-formula-p ; the transformed CYCL if WFF.
     * @return 1 booleanp ; whether or not CYCL was WFF.
     */
    @LispMethod(comment = "Simplify and transform CYCL if WFF for the cyclifier.\r\n\r\n@return 0 nil or el-formula-p ; the transformed CYCL if WFF.\r\n@return 1 booleanp ; whether or not CYCL was WFF.")
    public static final SubLObject cyclifier_wffP_alt(SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $list_alt161;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                if (NIL != cycl) {
                    {
                        SubLObject var_cycl = com.cyc.cycjava.cycl.cyclifier.subst_vars_for_instancefn(cycl);
                        if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclifier_wff_intP(var_cycl, mt)) {
                            wffP = T;
                        }
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.cyclifier.storing_cyclifier_wff_resultsP()) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject stream = NIL;
                                            try {
                                                stream = compatibility.open_text(parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread), $APPEND, NIL);
                                                if (!stream.isStream()) {
                                                    Errors.error($str_alt165$Unable_to_open__S, parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread));
                                                }
                                                {
                                                    SubLObject s = stream;
                                                    format(s, $str_alt166$____original__S____output_cycl__S, new SubLObject[]{ cycl, cycl, wffP, kb_loaded() });
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (stream.isStream()) {
                                                            close(stream, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                }
                return values(wffP, cycl);
            }
        }
    }

    /**
     * Simplify and transform CYCL if WFF for the cyclifier.
     *
     * @return 0 nil or el-formula-p ; the transformed CYCL if WFF.
     * @return 1 booleanp ; whether or not CYCL was WFF.
     */
    @LispMethod(comment = "Simplify and transform CYCL if WFF for the cyclifier.\r\n\r\n@return 0 nil or el-formula-p ; the transformed CYCL if WFF.\r\n@return 1 booleanp ; whether or not CYCL was WFF.")
    public static SubLObject cyclifier_wffP(final SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $list160;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        if (NIL != cycl) {
            final SubLObject var_cycl = subst_vars_for_instancefn(cycl);
            if (NIL != cyclifier_wff_intP(var_cycl, mt)) {
                wffP = T;
            }
        }
        if (NIL != storing_cyclifier_wff_resultsP()) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread), $APPEND);
                            if (!stream.isStream()) {
                                Errors.error($str164$Unable_to_open__S, parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread));
                            }
                            final SubLObject s = stream;
                            format(s, $str165$____original__S____output_cycl__S, new SubLObject[]{ cycl, cycl, wffP, kb_loaded() });
                        } finally {
                            final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return values(wffP, cycl);
    }

    public static final SubLObject cyclifier_handle_error_method_alt(SubLObject self, SubLObject error) {
        {
            SubLObject catch_var_for_cyclifier_method = NIL;
            SubLObject error_handling = com.cyc.cycjava.cycl.cyclifier.get_cyclifier_error_handling(self);
            try {
                try {
                    {
                        SubLObject pcase_var = error_handling;
                        if (pcase_var.eql($THROW)) {
                            Errors.error(error);
                        } else {
                            if (pcase_var.eql($WARN)) {
                                Errors.warn(error);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclifier_error_handling(self, error_handling);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            }
            return catch_var_for_cyclifier_method;
        }
    }

    public static SubLObject cyclifier_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = NIL;
        final SubLObject error_handling = get_cyclifier_error_handling(self);
        try {
            thread.throwStack.push($sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql($THROW)) {
                    Errors.error(error);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error);
                    }

            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclifier_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }

    public static final SubLObject subst_vars_for_instancefn_alt(SubLObject cycl) {
        return sublis(com.cyc.cycjava.cycl.cyclifier.create_term_to_var_mapping(cycl), cycl, EQUAL, UNPROVIDED);
    }

    public static SubLObject subst_vars_for_instancefn(final SubLObject cycl) {
        return sublis(create_term_to_var_mapping(cycl), cycl, EQUAL, UNPROVIDED);
    }

    public static final SubLObject create_term_to_var_mapping_alt(SubLObject cycl) {
        {
            SubLObject mapping = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyclifier.gather_instancefn_terms(cycl);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                mapping = cons(cons(v_term, com.cyc.cycjava.cycl.cyclifier.new_lf_variable(cycl_utilities.formula_arg1(v_term, UNPROVIDED))), mapping);
            }
            return mapping;
        }
    }

    public static SubLObject create_term_to_var_mapping(final SubLObject cycl) {
        SubLObject mapping = NIL;
        SubLObject cdolist_list_var = gather_instancefn_terms(cycl);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mapping = cons(cons(v_term, new_lf_variable(cycl_utilities.formula_arg1(v_term, UNPROVIDED))), mapping);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return mapping;
    }

    public static final SubLObject gather_instancefn_terms_alt(SubLObject cycl) {
        {
            SubLObject terms = NIL;
            SubLObject stack = stacks.create_stack();
            SubLObject arg = NIL;
            stacks.stack_push(cycl, stack);
            while (NIL == stacks.stack_empty_p(stack)) {
                {
                    SubLObject entry = stacks.stack_pop(stack);
                    arg = entry;
                    if (cycl_utilities.formula_operator(arg).eql($$InstanceFn)) {
                        {
                            SubLObject item_var = arg;
                            if (NIL == member(item_var, terms, EQUAL, symbol_function(IDENTITY))) {
                                terms = cons(item_var, terms);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
                        SubLObject arg_12 = NIL;
                        for (arg_12 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_12 = cdolist_list_var.first()) {
                            stacks.stack_push(arg_12, stack);
                        }
                    }
                }
            } 
            return terms;
        }
    }

    public static SubLObject gather_instancefn_terms(final SubLObject cycl) {
        SubLObject terms = NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject arg = NIL;
        stacks.stack_push(cycl, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = arg = stacks.stack_pop(stack);
            if (cycl_utilities.formula_operator(arg).eql($$InstanceFn)) {
                final SubLObject item_var = arg;
                if (NIL == member(item_var, terms, EQUAL, symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg_$13 = NIL;
            arg_$13 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                stacks.stack_push(arg_$13, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg_$13 = cdolist_list_var.first();
            } 
        } 
        return terms;
    }

    /**
     * - remove redundant #$and
     * - remove quantification of keywords
     */
    @LispMethod(comment = "- remove redundant #$and\r\n- remove quantification of keywords\n- remove redundant #$and\n- remove quantification of keywords")
    public static final SubLObject beautify_cyclification_alt(SubLObject cycl) {
        {
            SubLObject operator = cycl_utilities.formula_operator(cycl);
            if (NIL != el_conjunction_p(cycl)) {
                return conjoin(Mapping.mapcar(BEAUTIFY_CYCLIFICATION, lift_conjuncts(cycl_utilities.formula_args(cycl, UNPROVIDED))), UNPROVIDED);
            } else {
                if (NIL != fort_types_interface.quantifier_p(operator)) {
                    return append(butlast(cycl, UNPROVIDED), list(com.cyc.cycjava.cycl.cyclifier.beautify_cyclification(com.cyc.cycjava.cycl.cyclifier.quantified_formula(cycl))));
                } else {
                    if (NIL != fort_types_interface.logical_connective_p(operator)) {
                        return cons(operator, Mapping.mapcar(BEAUTIFY_CYCLIFICATION, cycl_utilities.formula_args(cycl, UNPROVIDED)));
                    } else {
                        return cycl;
                    }
                }
            }
        }
    }

    /**
     * - remove redundant #$and
     * - remove quantification of keywords
     */
    @LispMethod(comment = "- remove redundant #$and\r\n- remove quantification of keywords\n- remove redundant #$and\n- remove quantification of keywords")
    public static SubLObject beautify_cyclification(final SubLObject cycl) {
        final SubLObject operator = cycl_utilities.formula_operator(cycl);
        if (NIL != el_conjunction_p(cycl)) {
            return simplifier.conjoin(Mapping.mapcar(BEAUTIFY_CYCLIFICATION, simplifier.lift_conjuncts(cycl_utilities.formula_args(cycl, UNPROVIDED))), UNPROVIDED);
        }
        if (NIL != fort_types_interface.quantifier_p(operator)) {
            return append(butlast(cycl, UNPROVIDED), list(beautify_cyclification(quantified_formula(cycl))));
        }
        if (NIL != fort_types_interface.logical_connective_p(operator)) {
            return cons(operator, Mapping.mapcar(BEAUTIFY_CYCLIFICATION, cycl_utilities.formula_args(cycl, UNPROVIDED)));
        }
        return cycl;
    }

    public static final SubLObject quantified_quantifier_alt(SubLObject quantified) {
        return cycl_utilities.formula_operator(quantified);
    }

    public static SubLObject quantified_quantifier(final SubLObject quantified) {
        return cycl_utilities.formula_operator(quantified);
    }

    public static final SubLObject quantified_variable_alt(SubLObject quantified) {
        return nthcdr(subtract(length(quantified), TWO_INTEGER), quantified).first();
    }

    public static SubLObject quantified_variable(final SubLObject quantified) {
        return nthcdr(subtract(length(quantified), TWO_INTEGER), quantified).first();
    }

    public static final SubLObject quantified_formula_alt(SubLObject quantified) {
        return last(quantified, UNPROVIDED).first();
    }

    public static SubLObject quantified_formula(final SubLObject quantified) {
        return last(quantified, UNPROVIDED).first();
    }

    public static SubLObject apply_alist(final SubLObject alist, final SubLObject tree, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sublis(alist, tree, test, UNPROVIDED);
    }

    public static SubLObject non_singleton_possibly_equal_terms(final SubLObject cycl) {
        SubLObject terms = NIL;
        SubLObject non_singleton_terms = NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject clause = NIL;
        stacks.stack_push(cycl, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                clause = entry;
                if ((NIL != equals_clauseP(clause)) && (NIL != cycl_utilities.expression_find_if($sym175$CYC_VAR_, cycl_utilities.formula_arg1(clause, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                    SubLObject item_var = cycl_utilities.formula_arg1(clause, UNPROVIDED);
                    if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        terms = cons(item_var, terms);
                    }
                    if (NIL != cycl_utilities.expression_find_if($sym175$CYC_VAR_, cycl_utilities.formula_arg2(clause, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        item_var = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                        if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            terms = cons(item_var, terms);
                        }
                    }
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
        SubLObject cdolist_list_var2 = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != list_utilities.lengthG(cycl_utilities.arg_positions_bfs(v_term, cycl, symbol_function(EQUAL)), ONE_INTEGER, UNPROVIDED)) {
                non_singleton_terms = cons(v_term, non_singleton_terms);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_term = cdolist_list_var2.first();
        } 
        return non_singleton_terms;
    }

    /**
     *
     *
     * @param CYCL
    el-formula-p;
     * 		
     * @return listp; list of bindings generated from the #$equals statements of CYCL
     * @unknown those equal statements used in generating a binding are destructively
    deleted from CYCL
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p;\r\n\t\t\r\n@return listp; list of bindings generated from the #$equals statements of CYCL\r\n@unknown those equal statements used in generating a binding are destructively\r\ndeleted from CYCL")
    public static final SubLObject get_assignment_alt(SubLObject cycl, SubLObject vars) {
        if (vars == UNPROVIDED) {
            vars = sentence_variables(cycl, UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject v_bindings = NIL;
            SubLObject to_be_deleted = NIL;
            {
                SubLObject stack = stacks.create_stack();
                SubLObject clause = NIL;
                stacks.stack_push(cycl, stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject entry = stacks.stack_pop(stack);
                        if (NIL != literalP(entry)) {
                            clause = entry;
                            if (NIL != com.cyc.cycjava.cycl.cyclifier.equals_clauseP(clause)) {
                                if (cycl_utilities.formula_arg1(clause, UNPROVIDED).equal(cycl_utilities.formula_arg2(clause, UNPROVIDED))) {
                                    to_be_deleted = cons(clause, to_be_deleted);
                                } else {
                                    if (NIL != memberP(cycl_utilities.formula_arg1(clause, UNPROVIDED), vars, UNPROVIDED, UNPROVIDED)) {
                                        v_bindings = cons(bindings.make_variable_binding(cycl_utilities.formula_arg1(clause, UNPROVIDED), cycl_utilities.formula_arg2(clause, UNPROVIDED)), v_bindings);
                                    } else {
                                        if (NIL != memberP(cycl_utilities.formula_arg2(clause, UNPROVIDED), vars, UNPROVIDED, UNPROVIDED)) {
                                            v_bindings = cons(bindings.make_variable_binding(cycl_utilities.formula_arg2(clause, UNPROVIDED), cycl_utilities.formula_arg1(clause, UNPROVIDED)), v_bindings);
                                        }
                                    }
                                }
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
            {
                SubLObject cdolist_list_var = to_be_deleted;
                SubLObject clause = NIL;
                for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                    list_utilities.tree_delete(clause, cycl, EQUAL, UNPROVIDED);
                }
            }
            if (cycl.equal($list_alt176)) {
                delete($$and, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return v_bindings;
        }
    }

    /**
     *
     *
     * @param CYCL
    el-formula-p;
     * 		
     * @return listp; list of bindings generated from the #$equals statements of CYCL
     * @unknown those equal statements used in generating a binding are destructively
    deleted from CYCL
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p;\r\n\t\t\r\n@return listp; list of bindings generated from the #$equals statements of CYCL\r\n@unknown those equal statements used in generating a binding are destructively\r\ndeleted from CYCL")
    public static SubLObject get_assignment(final SubLObject cycl, SubLObject vars) {
        if (vars == UNPROVIDED) {
            vars = sentence_variables(cycl, UNPROVIDED, UNPROVIDED);
        }
        SubLObject v_bindings = NIL;
        SubLObject to_be_deleted = NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject clause = NIL;
        stacks.stack_push(cycl, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                clause = entry;
                if (NIL != equals_clauseP(clause)) {
                    if (cycl_utilities.formula_arg1(clause, UNPROVIDED).equal(cycl_utilities.formula_arg2(clause, UNPROVIDED))) {
                        to_be_deleted = cons(clause, to_be_deleted);
                    } else
                        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg1(clause, UNPROVIDED), vars, UNPROVIDED, UNPROVIDED)) {
                            v_bindings = cons(bindings.make_variable_binding(cycl_utilities.formula_arg1(clause, UNPROVIDED), cycl_utilities.formula_arg2(clause, UNPROVIDED)), v_bindings);
                        } else
                            if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg2(clause, UNPROVIDED), vars, UNPROVIDED, UNPROVIDED)) {
                                v_bindings = cons(bindings.make_variable_binding(cycl_utilities.formula_arg2(clause, UNPROVIDED), cycl_utilities.formula_arg1(clause, UNPROVIDED)), v_bindings);
                            }


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
        SubLObject cdolist_list_var2 = to_be_deleted;
        clause = NIL;
        clause = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            list_utilities.tree_delete(clause, cycl, EQUAL, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            clause = cdolist_list_var2.first();
        } 
        if (cycl.equal($list176)) {
            delete($$and, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_bindings;
    }

    /**
     *
     *
     * @param CYCL
    el-formula-p
     * 		
     * @return booleanp; returns t if CYCL is an equals clause
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p\r\n\t\t\r\n@return booleanp; returns t if CYCL is an equals clause")
    public static final SubLObject equals_clauseP_alt(SubLObject cycl) {
        return member(cycl_utilities.formula_operator(cycl), $list_alt179, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CYCL
    el-formula-p
     * 		
     * @return booleanp; returns t if CYCL is an equals clause
     */
    @LispMethod(comment = "@param CYCL\nel-formula-p\r\n\t\t\r\n@return booleanp; returns t if CYCL is an equals clause")
    public static SubLObject equals_clauseP(final SubLObject cycl) {
        return subl_promotions.memberP(cycl_utilities.formula_operator(cycl), $list178, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject quick_sentential_parse_wffP_alt(SubLObject cycl) {
        return com.cyc.cycjava.cycl.cyclifier.cyclifier_wff_intP(cycl, UNPROVIDED);
    }

    public static SubLObject quick_sentential_parse_wffP(final SubLObject cycl) {
        return cyclifier_wff_intP(cycl, UNPROVIDED);
    }

    public static final SubLObject cyclifier_wff_intP_alt(SubLObject var_cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $list_alt161;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
                    try {
                        wff_vars.$permit_keyword_variablesP$.bind(T, thread);
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        $use_transcriptP$.bind(NIL, thread);
                        {
                            SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                SubLObject _prev_bind_1_14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                SubLObject _prev_bind_2_15 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                    wffP = makeBoolean((NIL != com.cyc.cycjava.cycl.cyclifier.constant_arguments_okP(var_cycl, mt)) && (NIL != com.cyc.cycjava.cycl.cyclifier.variable_arguments_okP(var_cycl, mt)));
                                } finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_15, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_14, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                        }
                    } finally {
                        $use_transcriptP$.rebind(_prev_bind_2, thread);
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_1, thread);
                        wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject cyclifier_wff_intP(final SubLObject var_cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $list160;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $use_transcriptP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_2_$16 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                wffP = makeBoolean((NIL != constant_arguments_okP(var_cycl, mt)) && (NIL != variable_arguments_okP(var_cycl, mt)));
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$16, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$15, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$14, thread);
            }
        } finally {
            $use_transcriptP$.rebind(_prev_bind_3, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_2, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    /**
     *
     *
     * @return booleanp; t if the variables of CYCL meet all arg constraints, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if the variables of CYCL meet all arg constraints, nil otherwise")
    public static final SubLObject variable_arguments_okP_alt(SubLObject cycl, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                    try {
                        at_vars.$at_check_inter_arg_isaP$.bind(T, thread);
                        okP = at_var_types.inter_formula_var_types_okP(cycl, mt);
                    } finally {
                        at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return okP;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; t if the variables of CYCL meet all arg constraints, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if the variables of CYCL meet all arg constraints, nil otherwise")
    public static SubLObject variable_arguments_okP(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        try {
            at_vars.$at_check_inter_arg_isaP$.bind(T, thread);
            okP = at_var_types.inter_formula_var_types_okP(cycl, mt);
        } finally {
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    /**
     *
     *
     * @unknown the inner function overrides the settings of many WFF and AT vars
     */
    @LispMethod(comment = "@unknown the inner function overrides the settings of many WFF and AT vars")
    public static final SubLObject constant_arguments_okP_alt(SubLObject cycl, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = T;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        okP = at_admitted.admitted_sentence_wrt_asent_arg_constraintsP(cycl);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return okP;
            }
        }
    }

    /**
     *
     *
     * @unknown the inner function overrides the settings of many WFF and AT vars
     */
    @LispMethod(comment = "@unknown the inner function overrides the settings of many WFF and AT vars")
    public static SubLObject constant_arguments_okP(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            okP = at_admitted.admitted_sentence_wrt_asent_arg_constraintsP(cycl);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static final SubLObject quantify_implicit_subject_alt(SubLObject cyclification) {
        {
            SubLObject cycl = methods.funcall_instance_method_with_0_args(cyclification, GET_CYCL);
            if (NIL != memberP($SUBJECT, com.cyc.cycjava.cycl.cyclifier.formula_keywords(cycl), UNPROVIDED, UNPROVIDED)) {
                cycl = parse_tree.quantify_existentially(com.cyc.cycjava.cycl.cyclifier.rename_variables(cycl, $list_alt182), $list_alt183);
                instances.set_slot(cyclification, CYCL, cycl);
            }
            return cyclification;
        }
    }

    public static SubLObject quantify_implicit_subject(final SubLObject cyclification) {
        SubLObject cycl = methods.funcall_instance_method_with_0_args(cyclification, GET_CYCL);
        if (NIL != subl_promotions.memberP($SUBJECT, formula_keywords(cycl), UNPROVIDED, UNPROVIDED)) {
            cycl = parse_tree.quantify_existentially(rename_variables(cycl, $list181), $list182);
            instances.set_slot(cyclification, CYCL, cycl);
        }
        return cyclification;
    }

    /**
     *
     *
     * @param LEXES
     * 		listp; a list of lexical entries
     * @return listp; a list of all keywords occurring in the semtrans assertions
    of LEXES
     */
    @LispMethod(comment = "@param LEXES\r\n\t\tlistp; a list of lexical entries\r\n@return listp; a list of all keywords occurring in the semtrans assertions\r\nof LEXES")
    public static final SubLObject required_keywords_alt(SubLObject lexes) {
        {
            SubLObject keywords = NIL;
            SubLObject cdolist_list_var = lexes;
            SubLObject rle = NIL;
            for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rle = cdolist_list_var.first()) {
                keywords = append(com.cyc.cycjava.cycl.cyclifier.formula_keywords(methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.cyclifier.rle_lex(rle), GET, $SEMTRANS)), keywords);
            }
            return remove_duplicates(keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param LEXES
     * 		listp; a list of lexical entries
     * @return listp; a list of all keywords occurring in the semtrans assertions
    of LEXES
     */
    @LispMethod(comment = "@param LEXES\r\n\t\tlistp; a list of lexical entries\r\n@return listp; a list of all keywords occurring in the semtrans assertions\r\nof LEXES")
    public static SubLObject required_keywords(final SubLObject lexes) {
        SubLObject keywords = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            keywords = append(formula_keywords(methods.funcall_instance_method_with_1_args(rle_lex(rle), GET, $SEMTRANS)), keywords);
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
        } 
        return remove_duplicates(keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param FORMULA
     * 		el-formula-p; the formula whose variables are to be renamed
     * @param RENAMING
     * 		listp; an association list from old variable names to new ones
     */
    @LispMethod(comment = "@param FORMULA\r\n\t\tel-formula-p; the formula whose variables are to be renamed\r\n@param RENAMING\r\n\t\tlistp; an association list from old variable names to new ones")
    public static final SubLObject rename_variables_alt(SubLObject formula, SubLObject renaming) {
        {
            SubLObject cdolist_list_var = renaming;
            SubLObject oldXnew = NIL;
            for (oldXnew = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , oldXnew = cdolist_list_var.first()) {
                formula = variable_subst(oldXnew.rest(), oldXnew.first(), formula);
            }
        }
        return formula;
    }

    /**
     *
     *
     * @param FORMULA
     * 		el-formula-p; the formula whose variables are to be renamed
     * @param RENAMING
     * 		listp; an association list from old variable names to new ones
     */
    @LispMethod(comment = "@param FORMULA\r\n\t\tel-formula-p; the formula whose variables are to be renamed\r\n@param RENAMING\r\n\t\tlistp; an association list from old variable names to new ones")
    public static SubLObject rename_variables(SubLObject formula, final SubLObject renaming) {
        SubLObject cdolist_list_var = renaming;
        SubLObject oldXnew = NIL;
        oldXnew = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            formula = variable_subst(oldXnew.rest(), oldXnew.first(), formula);
            cdolist_list_var = cdolist_list_var.rest();
            oldXnew = cdolist_list_var.first();
        } 
        return formula;
    }

    public static final SubLObject frame_renaming_alt(SubLObject frame) {
        return (NIL != nart_handles.nart_p(frame)) && cycl_utilities.formula_operator(narts_high.nart_el_formula(frame)).eql($$PPCompFrameFn) ? ((SubLObject) ($list_alt186)) : NIL;
    }

    public static SubLObject frame_renaming(final SubLObject frame) {
        return (NIL != nart_handles.nart_p(frame)) && cycl_utilities.formula_operator(narts_high.nart_el_formula(frame)).eql($$PPCompFrameFn) ? $list185 : NIL;
    }

    public static final SubLObject cyclify_int_alt(SubLObject v_cyclifier) {
        {
            SubLObject cycls = NIL;
            SubLObject error_message = NIL;
            if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclifier_catch_errorsP()) {
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                if (NIL != v_cyclifier) {
                                    while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym139$HAS_NEXT_)) {
                                        cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
                                    } 
                                }
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
            } else {
                if (NIL != v_cyclifier) {
                    while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym139$HAS_NEXT_)) {
                        cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
                    } 
                }
            }
            if (NIL != error_message) {
                methods.funcall_instance_method_with_1_args(v_cyclifier, HANDLE_ERROR, error_message);
            }
            return nreverse(cycls);
        }
    }

    public static SubLObject cyclify_int(final SubLObject v_cyclifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        SubLObject error_message = NIL;
        if (NIL != cyclifier_catch_errorsP()) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != v_cyclifier) {
                            while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym139$HAS_NEXT_)) {
                                cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
                            } 
                        }
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
        } else
            if (NIL != v_cyclifier) {
                while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym139$HAS_NEXT_)) {
                    cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
                } 
            }

        if (NIL != error_message) {
            methods.funcall_instance_method_with_1_args(v_cyclifier, HANDLE_ERROR, error_message);
        }
        return nreverse(cycls);
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static final SubLObject cyclify_link_alt(SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(english, STRINGP);
            {
                SubLObject cyclifier_properties = putf(v_properties, $PARSER, parser.new_link_parser(linkage.$link_parse_options$.getDynamicValue(thread), $WARN, UNPROVIDED));
                cyclifier_properties = list_utilities.maybe_putf(cyclifier_properties, $LEXICON, object.new_class_instance(CYCLIFIER_LEXICON));
                {
                    SubLObject v_cyclifier = com.cyc.cycjava.cycl.cyclifier.new_cyclifier(english, cyclifier_properties);
                    return com.cyc.cycjava.cycl.cyclifier.cyclify_int(v_cyclifier);
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static SubLObject cyclify_link(final SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(english) : "! stringp(english) " + ("Types.stringp(english) " + "CommonSymbols.NIL != Types.stringp(english) ") + english;
        SubLObject cyclifier_properties = putf(v_properties, $PARSER, parser.new_link_parser(linkage.$link_parse_options$.getDynamicValue(thread), $WARN, UNPROVIDED));
        cyclifier_properties = list_utilities.maybe_putf(cyclifier_properties, $LEXICON, object.new_class_instance(CYCLIFIER_LEXICON));
        final SubLObject v_cyclifier = new_cyclifier(english, cyclifier_properties);
        return cyclify_int(v_cyclifier);
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static final SubLObject cyclify_charniak_alt(SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(english, STRINGP);
        {
            SubLObject v_parser = parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
            SubLObject v_cyclifier = com.cyc.cycjava.cycl.cyclifier.new_cyclifier(english, putf(v_properties, $PARSER, v_parser));
            return com.cyc.cycjava.cycl.cyclifier.cyclify_int(v_cyclifier);
        }
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static SubLObject cyclify_charniak(final SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != stringp(english) : "! stringp(english) " + ("Types.stringp(english) " + "CommonSymbols.NIL != Types.stringp(english) ") + english;
        final SubLObject v_parser = parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
        final SubLObject v_cyclifier = new_cyclifier(english, putf(v_properties, $PARSER, v_parser));
        return cyclify_int(v_cyclifier);
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static final SubLObject cyclify_stanford_alt(SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(english, STRINGP);
        {
            SubLObject v_cyclifier = com.cyc.cycjava.cycl.cyclifier.new_cyclifier(english, putf(v_properties, $PARSER, parser.new_stanford_parser(UNPROVIDED, UNPROVIDED)));
            return com.cyc.cycjava.cycl.cyclifier.cyclify_int(v_cyclifier);
        }
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static SubLObject cyclify_stanford(final SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != stringp(english) : "! stringp(english) " + ("Types.stringp(english) " + "CommonSymbols.NIL != Types.stringp(english) ") + english;
        final SubLObject v_cyclifier = new_cyclifier(english, putf(v_properties, $PARSER, parser.new_stanford_parser(UNPROVIDED, UNPROVIDED)));
        return cyclify_int(v_cyclifier);
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static final SubLObject cyclify_alt(SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(english, STRINGP);
        {
            SubLObject v_cyclifier = com.cyc.cycjava.cycl.cyclifier.new_cyclifier(english, v_properties);
            return com.cyc.cycjava.cycl.cyclifier.cyclify_int(v_cyclifier);
        }
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of ENGLISH
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of ENGLISH")
    public static SubLObject cyclify(final SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != stringp(english) : "! stringp(english) " + ("Types.stringp(english) " + "CommonSymbols.NIL != Types.stringp(english) ") + english;
        final SubLObject v_cyclifier = new_cyclifier(english, v_properties);
        return cyclify_int(v_cyclifier);
    }

    public static final SubLObject cyclifier_catch_errorsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($cyclifier_catch_errorsP$.getDynamicValue(thread));
        }
    }

    public static SubLObject cyclifier_catch_errorsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($cyclifier_catch_errorsP$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return cyclifier; an iterator that will return the next interpretation of
    ENGLISH with each call to its next method
     */
    @LispMethod(comment = "@return cyclifier; an iterator that will return the next interpretation of\r\nENGLISH with each call to its next method")
    public static final SubLObject new_cyclifier_alt(SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = v_properties;
                SubLObject current = datum;
                SubLObject lexicon_tail = property_list_member($LEXICON, current);
                SubLObject lexicon = (NIL != lexicon_tail) ? ((SubLObject) (cadr(lexicon_tail))) : object.new_class_instance(CYCLIFIER_LEXICON);
                SubLObject parser_tail = property_list_member($PARSER, current);
                SubLObject v_parser = (NIL != parser_tail) ? ((SubLObject) (cadr(parser_tail))) : funcall($default_cyclifier_parser_factory$.getDynamicValue(thread));
                SubLObject context_tail = property_list_member($CONTEXT, current);
                SubLObject v_context = (NIL != context_tail) ? ((SubLObject) (cadr(context_tail))) : object.new_class_instance(PARSE_TREE_CONTEXT);
                SubLTrampolineFile.checkType(english, STRINGP);
                methods.funcall_instance_method_with_1_args(lexicon, LEARN, english);
                {
                    SubLObject tree = methods.funcall_instance_method_with_3_args(v_parser, PARSE, english, lexicon, v_context);
                    SubLObject v_cyclifier = NIL;
                    SubLObject error = NIL;
                    if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclifier_catch_errorsP()) {
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        v_cyclifier = (NIL != tree) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, v_properties))) : NIL;
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                    } else {
                        v_cyclifier = (NIL != tree) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, v_properties))) : NIL;
                    }
                    if (NIL != error) {
                        methods.funcall_instance_method_with_1_args(v_parser, HANDLE_ERROR, cconcatenate(format_nil.format_nil_a_no_copy(error), new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $str_alt196$Sentence__, format_nil.format_nil_a_no_copy(english) }));
                    }
                    return v_cyclifier;
                }
            }
        }
    }

    /**
     *
     *
     * @return cyclifier; an iterator that will return the next interpretation of
    ENGLISH with each call to its next method
     */
    @LispMethod(comment = "@return cyclifier; an iterator that will return the next interpretation of\r\nENGLISH with each call to its next method")
    public static SubLObject new_cyclifier(final SubLObject english, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject lexicon_tail = property_list_member($LEXICON, current);
        final SubLObject lexicon = (NIL != lexicon_tail) ? cadr(lexicon_tail) : object.new_class_instance(CYCLIFIER_LEXICON);
        final SubLObject parser_tail = property_list_member($PARSER, current);
        final SubLObject v_parser = (NIL != parser_tail) ? cadr(parser_tail) : funcall($default_cyclifier_parser_factory$.getDynamicValue(thread));
        final SubLObject context_tail = property_list_member($CONTEXT, current);
        final SubLObject v_context = (NIL != context_tail) ? cadr(context_tail) : object.new_class_instance(PARSE_TREE_CONTEXT);
        assert NIL != stringp(english) : "! stringp(english) " + ("Types.stringp(english) " + "CommonSymbols.NIL != Types.stringp(english) ") + english;
        methods.funcall_instance_method_with_1_args(lexicon, LEARN, english);
        final SubLObject tree = methods.funcall_instance_method_with_3_args(v_parser, PARSE, english, lexicon, v_context);
        SubLObject v_cyclifier = NIL;
        SubLObject error = NIL;
        if (NIL != cyclifier_catch_errorsP()) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        v_cyclifier = (NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, v_properties) : NIL;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            v_cyclifier = (NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, v_properties) : NIL;
        }
        if (NIL != error) {
            methods.funcall_instance_method_with_1_args(v_parser, HANDLE_ERROR, cconcatenate(format_nil.format_nil_a_no_copy(error), new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $str195$Sentence__, format_nil.format_nil_a_no_copy(english) }));
        }
        return v_cyclifier;
    }

    /**
     *
     *
     * @return cyclifier; an iterator that will return the next interpretation of
    PARSE with each call to its next method
     */
    @LispMethod(comment = "@return cyclifier; an iterator that will return the next interpretation of\r\nPARSE with each call to its next method")
    public static final SubLObject new_parse_cyclifier_alt(SubLObject parse, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject datum = v_properties;
            SubLObject current = datum;
            SubLObject context_tail = property_list_member($CONTEXT, current);
            SubLObject v_context = (NIL != context_tail) ? ((SubLObject) (cadr(context_tail))) : object.new_class_instance(PARSE_TREE_CONTEXT);
            SubLTrampolineFile.checkType(parse, LISTP);
            {
                SubLObject tree = parse_tree.new_parse_tree(parser.retag(parser.strip_shell(parse)), NIL, v_context);
                return NIL != tree ? ((SubLObject) (methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, v_properties))) : NIL;
            }
        }
    }

    /**
     *
     *
     * @return cyclifier; an iterator that will return the next interpretation of
    PARSE with each call to its next method
     */
    @LispMethod(comment = "@return cyclifier; an iterator that will return the next interpretation of\r\nPARSE with each call to its next method")
    public static SubLObject new_parse_cyclifier(final SubLObject parse, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject context_tail = property_list_member($CONTEXT, current);
        final SubLObject v_context = (NIL != context_tail) ? cadr(context_tail) : object.new_class_instance(PARSE_TREE_CONTEXT);
        assert NIL != listp(parse) : "! listp(parse) " + ("Types.listp(parse) " + "CommonSymbols.NIL != Types.listp(parse) ") + parse;
        final SubLObject tree = parse_tree.new_parse_tree(parser.retag(parser.strip_shell(parse)), NIL, v_context);
        return NIL != tree ? methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, v_properties) : NIL;
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of the English sentence
    that is parsed to PARSE-STRING
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of the English sentence\r\nthat is parsed to PARSE-STRING")
    public static final SubLObject cyclify_parse_alt(SubLObject parse_string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(parse_string, STRINGP);
        {
            SubLObject parse = read_from_string(parse_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_cyclifier = com.cyc.cycjava.cycl.cyclifier.new_parse_cyclifier(parse, v_properties);
            return com.cyc.cycjava.cycl.cyclifier.cyclify_int(v_cyclifier);
        }
    }

    /**
     *
     *
     * @return listp; the CycL representation of the meaning of the English sentence
    that is parsed to PARSE-STRING
     */
    @LispMethod(comment = "@return listp; the CycL representation of the meaning of the English sentence\r\nthat is parsed to PARSE-STRING")
    public static SubLObject cyclify_parse(final SubLObject parse_string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != stringp(parse_string) : "! stringp(parse_string) " + ("Types.stringp(parse_string) " + "CommonSymbols.NIL != Types.stringp(parse_string) ") + parse_string;
        final SubLObject parse = read_from_string(parse_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_cyclifier = new_parse_cyclifier(parse, v_properties);
        return cyclify_int(v_cyclifier);
    }

    /**
     *
     *
     * @return boolean; t if KEYWORD is meant to be free, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if KEYWORD is meant to be free, nil otherwise")
    public static final SubLObject free_variable_p_alt(SubLObject keyword) {
        return string_utilities.starts_with(symbol_name(keyword), $str_alt199$__);
    }

    /**
     *
     *
     * @return boolean; t if KEYWORD is meant to be free, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if KEYWORD is meant to be free, nil otherwise")
    public static SubLObject free_variable_p(final SubLObject keyword) {
        return string_utilities.starts_with(symbol_name(keyword), $str198$__);
    }

    public static final SubLObject get_cyclification_confidence_alt(SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, THREE_INTEGER, CONFIDENCE);
    }

    public static SubLObject get_cyclification_confidence(final SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, THREE_INTEGER, CONFIDENCE);
    }

    public static final SubLObject set_cyclification_confidence_alt(SubLObject cyclification, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, THREE_INTEGER, CONFIDENCE);
    }

    public static SubLObject set_cyclification_confidence(final SubLObject cyclification, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, THREE_INTEGER, CONFIDENCE);
    }

    public static final SubLObject get_cyclification_word_alt(SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, TWO_INTEGER, WORD);
    }

    public static SubLObject get_cyclification_word(final SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, TWO_INTEGER, WORD);
    }

    public static final SubLObject set_cyclification_word_alt(SubLObject cyclification, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, TWO_INTEGER, WORD);
    }

    public static SubLObject set_cyclification_word(final SubLObject cyclification, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, TWO_INTEGER, WORD);
    }

    public static final SubLObject get_cyclification_cycl_alt(SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, ONE_INTEGER, CYCL);
    }

    public static SubLObject get_cyclification_cycl(final SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, ONE_INTEGER, CYCL);
    }

    public static final SubLObject set_cyclification_cycl_alt(SubLObject cyclification, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, ONE_INTEGER, CYCL);
    }

    public static SubLObject set_cyclification_cycl(final SubLObject cyclification, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, ONE_INTEGER, CYCL);
    }

    public static final SubLObject subloop_reserved_initialize_cyclification_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclification_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyclification_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFICATION, CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFICATION, WORD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFICATION, CONFIDENCE, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclification_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFICATION, CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFICATION, WORD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFICATION, CONFIDENCE, NIL);
        return NIL;
    }

    public static final SubLObject cyclification_p_alt(SubLObject cyclification) {
        return classes.subloop_instanceof_class(cyclification, CYCLIFICATION);
    }

    public static SubLObject cyclification_p(final SubLObject cyclification) {
        return classes.subloop_instanceof_class(cyclification, CYCLIFICATION);
    }

    public static final SubLObject new_cyclification_alt(SubLObject cycl, SubLObject word, SubLObject confidence) {
        SubLTrampolineFile.checkType(confidence, NUMBERP);
        {
            SubLObject cyclification = object.new_class_instance(CYCLIFICATION);
            com.cyc.cycjava.cycl.cyclifier.set_cyclification_cycl(cyclification, cycl);
            com.cyc.cycjava.cycl.cyclifier.set_cyclification_word(cyclification, word);
            com.cyc.cycjava.cycl.cyclifier.set_cyclification_confidence(cyclification, confidence);
            return cyclification;
        }
    }

    public static SubLObject new_cyclification(final SubLObject cycl, final SubLObject word, final SubLObject confidence) {
        assert NIL != numberp(confidence) : "! numberp(confidence) " + ("Types.numberp(confidence) " + "CommonSymbols.NIL != Types.numberp(confidence) ") + confidence;
        final SubLObject cyclification = object.new_class_instance(CYCLIFICATION);
        set_cyclification_cycl(cyclification, cycl);
        set_cyclification_word(cyclification, word);
        set_cyclification_confidence(cyclification, confidence);
        return cyclification;
    }

    /**
     *
     *
     * @return el-formula-p; the cycl part of this string semantics
     */
    @LispMethod(comment = "@return el-formula-p; the cycl part of this string semantics")
    public static final SubLObject cyclification_get_cycl_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyclification_method = NIL;
            SubLObject cycl = com.cyc.cycjava.cycl.cyclifier.get_cyclification_cycl(self);
            try {
                try {
                    sublisp_throw($sym207$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, cycl);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclification_cycl(self, cycl);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym207$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            }
            return catch_var_for_cyclification_method;
        }
    }

    /**
     *
     *
     * @return el-formula-p; the cycl part of this string semantics
     */
    @LispMethod(comment = "@return el-formula-p; the cycl part of this string semantics")
    public static SubLObject cyclification_get_cycl_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = NIL;
        final SubLObject cycl = get_cyclification_cycl(self);
        try {
            thread.throwStack.push($sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                sublisp_throw($sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, cycl);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclification_cycl(self, cycl);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }

    /**
     *
     *
     * @return stringp; the string of this cyclification
     */
    @LispMethod(comment = "@return stringp; the string of this cyclification")
    public static final SubLObject cyclification_get_word_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyclification_method = NIL;
            SubLObject word = com.cyc.cycjava.cycl.cyclifier.get_cyclification_word(self);
            try {
                try {
                    sublisp_throw($sym211$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, word);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclification_word(self, word);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            }
            return catch_var_for_cyclification_method;
        }
    }

    /**
     *
     *
     * @return stringp; the string of this cyclification
     */
    @LispMethod(comment = "@return stringp; the string of this cyclification")
    public static SubLObject cyclification_get_word_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = NIL;
        final SubLObject word = get_cyclification_word(self);
        try {
            thread.throwStack.push($sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                sublisp_throw($sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, word);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclification_word(self, word);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }

    /**
     *
     *
     * @return non-negative-integerp; the confidence that the lex entry of this cyclification
    is the intended meaning of its word
     */
    @LispMethod(comment = "@return non-negative-integerp; the confidence that the lex entry of this cyclification\r\nis the intended meaning of its word")
    public static final SubLObject cyclification_get_confidence_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyclification_method = NIL;
            SubLObject confidence = com.cyc.cycjava.cycl.cyclifier.get_cyclification_confidence(self);
            try {
                try {
                    sublisp_throw($sym215$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, confidence);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclification_confidence(self, confidence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym215$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            }
            return catch_var_for_cyclification_method;
        }
    }

    /**
     *
     *
     * @return non-negative-integerp; the confidence that the lex entry of this cyclification
    is the intended meaning of its word
     */
    @LispMethod(comment = "@return non-negative-integerp; the confidence that the lex entry of this cyclification\r\nis the intended meaning of its word")
    public static SubLObject cyclification_get_confidence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = NIL;
        final SubLObject confidence = get_cyclification_confidence(self);
        try {
            thread.throwStack.push($sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                sublisp_throw($sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, confidence);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclification_confidence(self, confidence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }

    /**
     *
     *
     * @return cyclification-p; a copy of this cyclification
     */
    @LispMethod(comment = "@return cyclification-p; a copy of this cyclification")
    public static final SubLObject cyclification_copy_method_alt(SubLObject self) {
        {
            SubLObject copy = object.new_class_instance(CYCLIFICATION);
            com.cyc.cycjava.cycl.cyclifier.set_cyclification_cycl(copy, methods.funcall_instance_method_with_0_args(self, GET_CYCL));
            com.cyc.cycjava.cycl.cyclifier.set_cyclification_word(copy, methods.funcall_instance_method_with_0_args(self, GET_WORD));
            com.cyc.cycjava.cycl.cyclifier.set_cyclification_confidence(copy, methods.funcall_instance_method_with_0_args(self, GET_CONFIDENCE));
            return copy;
        }
    }

    /**
     *
     *
     * @return cyclification-p; a copy of this cyclification
     */
    @LispMethod(comment = "@return cyclification-p; a copy of this cyclification")
    public static SubLObject cyclification_copy_method(final SubLObject self) {
        final SubLObject copy = object.new_class_instance(CYCLIFICATION);
        set_cyclification_cycl(copy, methods.funcall_instance_method_with_0_args(self, GET_CYCL));
        set_cyclification_word(copy, methods.funcall_instance_method_with_0_args(self, GET_WORD));
        set_cyclification_confidence(copy, methods.funcall_instance_method_with_0_args(self, GET_CONFIDENCE));
        return copy;
    }

    /**
     * Pretty-prints this word semantics to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-prints this word semantics to STREAM, ignoring DEPTH")
    public static final SubLObject cyclification_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyclification_method = NIL;
            SubLObject cycl = com.cyc.cycjava.cycl.cyclifier.get_cyclification_cycl(self);
            try {
                try {
                    write_string($str_alt222$__CYCLIFICATION_, stream, UNPROVIDED, UNPROVIDED);
                    princ(cycl, stream);
                    write_string($str_alt223$_, stream, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym221$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyclifier.set_cyclification_cycl(self, cycl);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            }
            return catch_var_for_cyclification_method;
        }
    }

    /**
     * Pretty-prints this word semantics to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-prints this word semantics to STREAM, ignoring DEPTH")
    public static SubLObject cyclification_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = NIL;
        final SubLObject cycl = get_cyclification_cycl(self);
        try {
            thread.throwStack.push($sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                write_string($str221$__CYCLIFICATION_, stream, UNPROVIDED, UNPROVIDED);
                princ(cycl, stream);
                write_string($str222$_, stream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclification_cycl(self, cycl);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }

    /**
     *
     *
     * @return el-formula-p; the el-formula of CYCLIFICATION-FORMULA
     */
    @LispMethod(comment = "@return el-formula-p; the el-formula of CYCLIFICATION-FORMULA")
    public static final SubLObject cyclification_el_formula_method_alt(SubLObject self, SubLObject cyclification_formula) {
        {
            SubLObject result = NIL;
            if (cyclification_formula.isList()) {
                {
                    SubLObject cdolist_list_var = cyclification_formula;
                    SubLObject e = NIL;
                    for (e = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , e = cdolist_list_var.first()) {
                        result = cons(methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, e), result);
                    }
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(cyclification_formula)) {
                    return methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, methods.funcall_instance_method_with_0_args(cyclification_formula, GET_CYCL));
                } else {
                    return cyclification_formula;
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return el-formula-p; the el-formula of CYCLIFICATION-FORMULA
     */
    @LispMethod(comment = "@return el-formula-p; the el-formula of CYCLIFICATION-FORMULA")
    public static SubLObject cyclification_el_formula_method(final SubLObject self, final SubLObject cyclification_formula) {
        SubLObject result = NIL;
        if (cyclification_formula.isList()) {
            SubLObject cdolist_list_var = cyclification_formula;
            SubLObject e = NIL;
            e = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, e), result);
                cdolist_list_var = cdolist_list_var.rest();
                e = cdolist_list_var.first();
            } 
            return nreverse(result);
        }
        if (NIL != cyclification_p(cyclification_formula)) {
            return methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, methods.funcall_instance_method_with_0_args(cyclification_formula, GET_CYCL));
        }
        return cyclification_formula;
    }

    public static final SubLObject cyclification_find_method_alt(SubLObject self, SubLObject cyclification, SubLObject item, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (cyclification.isList()) {
            {
                SubLObject result = NIL;
                if (NIL == result) {
                    {
                        SubLObject csome_list_var = cyclification;
                        SubLObject e = NIL;
                        for (e = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , e = csome_list_var.first()) {
                            result = methods.funcall_class_method_with_3_args(CYCLIFICATION, FIND, e, item, test);
                        }
                    }
                }
                return result;
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(cyclification)) {
                return methods.funcall_class_method_with_3_args(CYCLIFICATION, FIND, methods.funcall_instance_method_with_0_args(cyclification, GET_CYCL), item, test);
            } else {
                return funcall(test, cyclification, item);
            }
        }
    }

    public static SubLObject cyclification_find_method(final SubLObject self, final SubLObject cyclification, final SubLObject item, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (cyclification.isList()) {
            SubLObject result = NIL;
            if (NIL == result) {
                SubLObject csome_list_var;
                SubLObject e;
                for (csome_list_var = cyclification, e = NIL, e = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = methods.funcall_class_method_with_3_args(CYCLIFICATION, FIND, e, item, test) , csome_list_var = csome_list_var.rest() , e = csome_list_var.first()) {
                }
            }
            return result;
        }
        if (NIL != cyclification_p(cyclification)) {
            return methods.funcall_class_method_with_3_args(CYCLIFICATION, FIND, methods.funcall_instance_method_with_0_args(cyclification, GET_CYCL), item, test);
        }
        return funcall(test, cyclification, item);
    }

    public static final SubLObject cyclification_substitute_method_alt(SubLObject self, SubLObject cyclification, SubLObject v_new, SubLObject old, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (cyclification.isList()) {
            {
                SubLObject new_list = NIL;
                SubLObject cdolist_list_var = cyclification;
                SubLObject e = NIL;
                for (e = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , e = cdolist_list_var.first()) {
                    new_list = cons(methods.funcall_class_method_with_3_args(CYCLIFICATION, SUBSTITUTE, e, v_new, old), new_list);
                }
                return nreverse(new_list);
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(cyclification)) {
                {
                    SubLObject new_cyclification = object.new_class_instance(CYCLIFICATION);
                    com.cyc.cycjava.cycl.cyclifier.set_cyclification_cycl(new_cyclification, methods.funcall_class_method_with_3_args(CYCLIFICATION, SUBSTITUTE, methods.funcall_instance_method_with_0_args(cyclification, GET_CYCL), v_new, old));
                    com.cyc.cycjava.cycl.cyclifier.set_cyclification_word(new_cyclification, methods.funcall_instance_method_with_0_args(cyclification, GET_WORD));
                    com.cyc.cycjava.cycl.cyclifier.set_cyclification_confidence(new_cyclification, methods.funcall_instance_method_with_0_args(cyclification, GET_CONFIDENCE));
                    return new_cyclification;
                }
            } else {
                return NIL != funcall(test, cyclification, old) ? ((SubLObject) (v_new)) : cyclification;
            }
        }
    }

    public static SubLObject cyclification_substitute_method(final SubLObject self, final SubLObject cyclification, final SubLObject v_new, final SubLObject old, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (cyclification.isList()) {
            SubLObject new_list = NIL;
            SubLObject cdolist_list_var = cyclification;
            SubLObject e = NIL;
            e = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_list = cons(methods.funcall_class_method_with_3_args(CYCLIFICATION, SUBSTITUTE, e, v_new, old), new_list);
                cdolist_list_var = cdolist_list_var.rest();
                e = cdolist_list_var.first();
            } 
            return nreverse(new_list);
        }
        if (NIL != cyclification_p(cyclification)) {
            final SubLObject new_cyclification = object.new_class_instance(CYCLIFICATION);
            set_cyclification_cycl(new_cyclification, methods.funcall_class_method_with_3_args(CYCLIFICATION, SUBSTITUTE, methods.funcall_instance_method_with_0_args(cyclification, GET_CYCL), v_new, old));
            set_cyclification_word(new_cyclification, methods.funcall_instance_method_with_0_args(cyclification, GET_WORD));
            set_cyclification_confidence(new_cyclification, methods.funcall_instance_method_with_0_args(cyclification, GET_CONFIDENCE));
            return new_cyclification;
        }
        return NIL != funcall(test, cyclification, old) ? v_new : cyclification;
    }

    /**
     *
     *
     * @return non-negative-integerp; the confidence that the lex entry of this cyclification
    is the intended meaning of its word
     */
    @LispMethod(comment = "@return non-negative-integerp; the confidence that the lex entry of this cyclification\r\nis the intended meaning of its word")
    public static final SubLObject cyclification_score_alt(SubLObject sem) {
        if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(sem)) {
            return multiply(methods.funcall_instance_method_with_0_args(sem, GET_CONFIDENCE), com.cyc.cycjava.cycl.cyclifier.cyclification_score(methods.funcall_instance_method_with_0_args(sem, GET_CYCL)));
        } else {
            if (NIL != list_utilities.non_empty_list_p(sem)) {
                return ONE_INTEGER;
            } else {
                if (sem.isKeyword()) {
                    return ONE_INTEGER;
                } else {
                    if (NIL != fort_types_interface.logical_connective_p(sem.first())) {
                        {
                            SubLObject c = ONE_INTEGER;
                            SubLObject cdolist_list_var = sem.rest();
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                c = multiply(c, com.cyc.cycjava.cycl.cyclifier.cyclification_score(arg));
                            }
                            return c;
                        }
                    } else {
                        if (NIL != fort_types_interface.quantifier_p(sem.first())) {
                            return com.cyc.cycjava.cycl.cyclifier.cyclification_score(com.cyc.cycjava.cycl.cyclifier.quantified_formula(sem));
                        } else {
                            if (NIL != literalP(sem)) {
                                return ONE_INTEGER;
                            } else {
                                Errors.error($str_alt236$illegal_cyclification__a, sem);
                            }
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
     * @return non-negative-integerp; the confidence that the lex entry of this cyclification
    is the intended meaning of its word
     */
    @LispMethod(comment = "@return non-negative-integerp; the confidence that the lex entry of this cyclification\r\nis the intended meaning of its word")
    public static SubLObject cyclification_score(final SubLObject sem) {
        if (NIL != cyclification_p(sem)) {
            return multiply(methods.funcall_instance_method_with_0_args(sem, GET_CONFIDENCE), cyclification_score(methods.funcall_instance_method_with_0_args(sem, GET_CYCL)));
        }
        if (NIL != list_utilities.non_empty_list_p(sem)) {
            return ONE_INTEGER;
        }
        if (sem.isKeyword()) {
            return ONE_INTEGER;
        }
        if (NIL != fort_types_interface.logical_connective_p(sem.first())) {
            SubLObject c = ONE_INTEGER;
            SubLObject cdolist_list_var = sem.rest();
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                c = multiply(c, cyclification_score(arg));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            return c;
        }
        if (NIL != fort_types_interface.quantifier_p(sem.first())) {
            return cyclification_score(quantified_formula(sem));
        }
        if (NIL != literalP(sem)) {
            return ONE_INTEGER;
        }
        Errors.error($str235$illegal_cyclification__a, sem);
        return NIL;
    }

    /**
     *
     *
     * @return integer-p; an number between 0 and 1, the percentage of words contributing
    to SEM
     */
    @LispMethod(comment = "@return integer-p; an number between 0 and 1, the percentage of words contributing\r\nto SEM")
    public static final SubLObject cyclification_coverage_alt(SubLObject sem) {
        {
            SubLObject length = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyclifier.cyclification_yield(sem);
            SubLObject word = NIL;
            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                if (NIL == cyclifier_interface.punctuation_word_p(word)) {
                    length = add(length, ONE_INTEGER);
                }
            }
            return divide(com.cyc.cycjava.cycl.cyclifier.cyclification_coverage_int(sem), length);
        }
    }

    /**
     *
     *
     * @return integer-p; an number between 0 and 1, the percentage of words contributing
    to SEM
     */
    @LispMethod(comment = "@return integer-p; an number between 0 and 1, the percentage of words contributing\r\nto SEM")
    public static SubLObject cyclification_coverage(final SubLObject sem) {
        SubLObject length = ZERO_INTEGER;
        SubLObject cdolist_list_var = cyclification_yield(sem);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cyclifier_interface.punctuation_word_p(word)) {
                length = add(length, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return divide(cyclification_coverage_int(sem), length);
    }

    /**
     *
     *
     * @return listp; the list of words of the tree that generated SEM
     */
    @LispMethod(comment = "@return listp; the list of words of the tree that generated SEM")
    public static final SubLObject cyclification_yield_alt(SubLObject sem) {
        if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(sem)) {
            {
                SubLObject word = methods.funcall_instance_method_with_0_args(sem, GET_WORD);
                SubLObject tree = methods.funcall_instance_method_with_0_args(word, GET_ROOT);
                return methods.funcall_instance_method_with_0_args(tree, YIELD);
            }
        } else {
            if (NIL != fort_types_interface.logical_connective_p(sem.first())) {
                return com.cyc.cycjava.cycl.cyclifier.cyclification_yield(sem.rest().first());
            } else {
                Errors.error($str_alt238$Illegal_cyclification__a, sem);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the list of words of the tree that generated SEM
     */
    @LispMethod(comment = "@return listp; the list of words of the tree that generated SEM")
    public static SubLObject cyclification_yield(final SubLObject sem) {
        if (NIL != cyclification_p(sem)) {
            final SubLObject word = methods.funcall_instance_method_with_0_args(sem, GET_WORD);
            final SubLObject tree = methods.funcall_instance_method_with_0_args(word, GET_ROOT);
            return methods.funcall_instance_method_with_0_args(tree, YIELD);
        }
        if (NIL != fort_types_interface.logical_connective_p(sem.first())) {
            return cyclification_yield(sem.rest().first());
        }
        Errors.error($str237$Illegal_cyclification__a, sem);
        return NIL;
    }

    public static final SubLObject cyclification_coverage_int_alt(SubLObject sem) {
        if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(sem)) {
            {
                SubLObject new_sem = methods.funcall_instance_method_with_0_args(sem, GET_CYCL);
                if (NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_p(new_sem)) {
                    return com.cyc.cycjava.cycl.cyclifier.cyclification_coverage_int(new_sem);
                }
                return number_utilities.f_1X(com.cyc.cycjava.cycl.cyclifier.cyclification_coverage_int(methods.funcall_instance_method_with_0_args(sem, GET_CYCL)));
            }
        } else {
            if (sem.isKeyword()) {
                return ZERO_INTEGER;
            } else {
                if (NIL != fort_types_interface.logical_connective_p(sem.first())) {
                    {
                        SubLObject c = ZERO_INTEGER;
                        SubLObject cdolist_list_var = sem.rest();
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            c = add(c, com.cyc.cycjava.cycl.cyclifier.cyclification_coverage_int(arg));
                        }
                        return c;
                    }
                } else {
                    if (NIL != fort_types_interface.quantifier_p(sem.first())) {
                        return com.cyc.cycjava.cycl.cyclifier.cyclification_coverage_int(com.cyc.cycjava.cycl.cyclifier.quantified_formula(sem));
                    } else {
                        if (NIL != literalP(sem)) {
                            return ZERO_INTEGER;
                        } else {
                            Errors.error($str_alt236$illegal_cyclification__a, sem);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyclification_coverage_int(final SubLObject sem) {
        if (NIL != cyclification_p(sem)) {
            final SubLObject new_sem = methods.funcall_instance_method_with_0_args(sem, GET_CYCL);
            if (NIL != cyclification_p(new_sem)) {
                return cyclification_coverage_int(new_sem);
            }
            return number_utilities.f_1X(cyclification_coverage_int(methods.funcall_instance_method_with_0_args(sem, GET_CYCL)));
        } else {
            if (sem.isKeyword()) {
                return ZERO_INTEGER;
            }
            if (NIL != fort_types_interface.logical_connective_p(sem.first())) {
                SubLObject c = ZERO_INTEGER;
                SubLObject cdolist_list_var = sem.rest();
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    c = add(c, cyclification_coverage_int(arg));
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                return c;
            }
            if (NIL != fort_types_interface.quantifier_p(sem.first())) {
                return cyclification_coverage_int(quantified_formula(sem));
            }
            if (NIL != literalP(sem)) {
                return ZERO_INTEGER;
            }
            Errors.error($str235$illegal_cyclification__a, sem);
            return NIL;
        }
    }

    /**
     *
     *
     * @return listp; CYCLIFICATIONS ranked from highest to lowest score
     */
    @LispMethod(comment = "@return listp; CYCLIFICATIONS ranked from highest to lowest score")
    public static final SubLObject rank_cyclifications_alt(SubLObject cyclifications, SubLObject score_function) {
        if (score_function == UNPROVIDED) {
            score_function = CYCLIFICATION_SCORE;
        }
        {
            SubLObject scored = NIL;
            SubLObject cdolist_list_var = cyclifications;
            SubLObject cyclification = NIL;
            for (cyclification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cyclification = cdolist_list_var.first()) {
                scored = cons(cons(cyclification, funcall(score_function, cyclification)), scored);
            }
            return Sort.sort(scored, $sym240$_, CDR);
        }
    }

    /**
     *
     *
     * @return listp; CYCLIFICATIONS ranked from highest to lowest score
     */
    @LispMethod(comment = "@return listp; CYCLIFICATIONS ranked from highest to lowest score")
    public static SubLObject rank_cyclifications(final SubLObject cyclifications, SubLObject score_function) {
        if (score_function == UNPROVIDED) {
            score_function = CYCLIFICATION_SCORE;
        }
        SubLObject scored = NIL;
        SubLObject cdolist_list_var = cyclifications;
        SubLObject cyclification = NIL;
        cyclification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            scored = cons(cons(cyclification, funcall(score_function, cyclification)), scored);
            cdolist_list_var = cdolist_list_var.rest();
            cyclification = cdolist_list_var.first();
        } 
        return Sort.sort(scored, $sym239$_, CDR);
    }

    public static final SubLObject new_ranked_lex_entry_alt(SubLObject lex, SubLObject score) {
        if (score == UNPROVIDED) {
            score = ZERO_INTEGER;
        }
        return cons(lex, score);
    }

    public static SubLObject new_ranked_lex_entry(final SubLObject lex, SubLObject score) {
        if (score == UNPROVIDED) {
            score = ZERO_INTEGER;
        }
        return cons(lex, score);
    }

    public static final SubLObject rle_lex_alt(SubLObject rle) {
        return rle.first();
    }

    public static SubLObject rle_lex(final SubLObject rle) {
        return rle.first();
    }

    public static final SubLObject rle_confidence_alt(SubLObject rle) {
        return rle.rest();
    }

    public static SubLObject rle_confidence(final SubLObject rle) {
        return rle.rest();
    }

    public static final SubLObject rle_set_lex_alt(SubLObject rle, SubLObject lex) {
        return rplaca(rle, lex);
    }

    public static SubLObject rle_set_lex(final SubLObject rle, final SubLObject lex) {
        return rplaca(rle, lex);
    }

    public static final SubLObject rle_set_confidence_alt(SubLObject rle, SubLObject score) {
        return rplacd(rle, score);
    }

    public static SubLObject rle_set_confidence(final SubLObject rle, final SubLObject score) {
        return rplacd(rle, score);
    }

    public static final SubLObject rle_sem_equal_alt(SubLObject rle1, SubLObject rle2) {
        return equal(methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.cyclifier.rle_lex(rle1), GET, $SEMTRANS), methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.cyclifier.rle_lex(rle2), GET, $SEMTRANS));
    }

    public static SubLObject rle_sem_equal(final SubLObject rle1, final SubLObject rle2) {
        return equal(methods.funcall_instance_method_with_1_args(rle_lex(rle1), GET, $SEMTRANS), methods.funcall_instance_method_with_1_args(rle_lex(rle2), GET, $SEMTRANS));
    }

    public static final SubLObject ranked_lex_entry_p_alt(SubLObject obj) {
        return makeBoolean(obj.isCons() && obj.rest().isNumber());
    }

    public static SubLObject ranked_lex_entry_p(final SubLObject obj) {
        return makeBoolean(obj.isCons() && obj.rest().isNumber());
    }

    /**
     *
     *
     * @return listp; a list of <lex-entry> <confidence> conses, where all lexes have the
    same confidence
     */
    @LispMethod(comment = "@return listp; a list of <lex-entry> <confidence> conses, where all lexes have the\r\nsame confidence")
    public static final SubLObject new_even_lex_entry_distribution_alt(SubLObject lexes) {
        if (NIL == lexes) {
            return NIL;
        }
        {
            SubLObject distribution = NIL;
            SubLObject confidence = divide(ONE_INTEGER, length(lexes));
            SubLObject cdolist_list_var = lexes;
            SubLObject lex = NIL;
            for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                distribution = cons(com.cyc.cycjava.cycl.cyclifier.new_ranked_lex_entry(lex, confidence), distribution);
            }
            return distribution;
        }
    }

    /**
     *
     *
     * @return listp; a list of <lex-entry> <confidence> conses, where all lexes have the
    same confidence
     */
    @LispMethod(comment = "@return listp; a list of <lex-entry> <confidence> conses, where all lexes have the\r\nsame confidence")
    public static SubLObject new_even_lex_entry_distribution(final SubLObject lexes) {
        if (NIL == lexes) {
            return NIL;
        }
        SubLObject distribution = NIL;
        final SubLObject confidence = divide(ONE_INTEGER, length(lexes));
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            distribution = cons(new_ranked_lex_entry(lex, confidence), distribution);
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        return distribution;
    }

    public static final SubLObject instantiate_scope_alt(SubLObject unscoped) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject lambda_expressions = com.cyc.cycjava.cycl.cyclifier.partition_unscoped(unscoped);
                SubLObject non_lambda_expressions = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!length(non_lambda_expressions).numL(TWO_INTEGER)) {
                    non_lambda_expressions = list(conjoin(non_lambda_expressions, UNPROVIDED));
                }
                return com.cyc.cycjava.cycl.cyclifier.beta_reduce(NIL != non_lambda_expressions ? ((SubLObject) (non_lambda_expressions.first())) : NIL, reverse(com.cyc.cycjava.cycl.cyclifier.scope_quantifiers(lambda_expressions)));
            }
        }
    }

    public static SubLObject instantiate_scope(final SubLObject unscoped) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject lambda_expressions = partition_unscoped(unscoped);
        SubLObject non_lambda_expressions = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!length(non_lambda_expressions).numL(TWO_INTEGER)) {
            non_lambda_expressions = list(simplifier.conjoin(non_lambda_expressions, UNPROVIDED));
        }
        return beta_reduce(NIL != non_lambda_expressions ? non_lambda_expressions.first() : NIL, reverse(scope_quantifiers(lambda_expressions)));
    }

    /**
     *
     *
     * @return listp; LAMBDA-EXPRESSIONS reordered according to their scope
     */
    @LispMethod(comment = "@return listp; LAMBDA-EXPRESSIONS reordered according to their scope")
    public static final SubLObject scope_quantifiers_alt(SubLObject lambda_expressions) {
        return Sort.sort(lambda_expressions, $sym242$_, QUANTIFIER_SCOPING_SCORE);
    }

    /**
     *
     *
     * @return listp; LAMBDA-EXPRESSIONS reordered according to their scope
     */
    @LispMethod(comment = "@return listp; LAMBDA-EXPRESSIONS reordered according to their scope")
    public static SubLObject scope_quantifiers(final SubLObject lambda_expressions) {
        return Sort.sort(lambda_expressions, $sym241$_, QUANTIFIER_SCOPING_SCORE);
    }

    /**
     *
     *
     * @return positive-integer-p; the scoping score of LAMBDA-EXPRESSION, with higher
    scores indicating narrower scope
     */
    @LispMethod(comment = "@return positive-integer-p; the scoping score of LAMBDA-EXPRESSION, with higher\r\nscores indicating narrower scope")
    public static final SubLObject quantifier_scoping_score_alt(SubLObject lambda_expression) {
        {
            SubLObject index = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(lambda_expression, GET_WORD), GET_HEAD), GET_ABS_INDEX);
            return NIL != com.cyc.cycjava.cycl.cyclifier.cyclification_free_variables(lambda_expression) ? ((SubLObject) (multiply($int$100, index))) : index;
        }
    }

    /**
     *
     *
     * @return positive-integer-p; the scoping score of LAMBDA-EXPRESSION, with higher
    scores indicating narrower scope
     */
    @LispMethod(comment = "@return positive-integer-p; the scoping score of LAMBDA-EXPRESSION, with higher\r\nscores indicating narrower scope")
    public static SubLObject quantifier_scoping_score(final SubLObject lambda_expression) {
        final SubLObject index = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(lambda_expression, GET_WORD), GET_HEAD), GET_ABS_INDEX);
        return NIL != cyclification_free_variables(lambda_expression) ? multiply($int$100, index) : index;
    }

    /**
     *
     *
     * @return listp; the free variables of CYCLIFICATION
     */
    @LispMethod(comment = "@return listp; the free variables of CYCLIFICATION")
    public static final SubLObject cyclification_free_variables_alt(SubLObject cyclification) {
        return sentence_free_variables(com.cyc.cycjava.cycl.cyclifier.fold_equals(methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, cyclification)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the free variables of CYCLIFICATION
     */
    @LispMethod(comment = "@return listp; the free variables of CYCLIFICATION")
    public static SubLObject cyclification_free_variables(final SubLObject cyclification) {
        return sentence_free_variables(simplifier.fold_equals(methods.funcall_class_method_with_1_args(CYCLIFICATION, EL_FORMULA, cyclification)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject partition_unscoped_alt(SubLObject unscoped) {
        {
            SubLObject lambda_expressions = NIL;
            SubLObject non_lambda_expressions = NIL;
            SubLObject cdolist_list_var = unscoped;
            SubLObject e = NIL;
            for (e = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , e = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.cyclifier.lambda_expressionP(e)) {
                    lambda_expressions = cons(e, lambda_expressions);
                } else {
                    non_lambda_expressions = cons(e, non_lambda_expressions);
                }
            }
            return values(lambda_expressions, non_lambda_expressions);
        }
    }

    public static SubLObject partition_unscoped(final SubLObject unscoped) {
        SubLObject lambda_expressions = NIL;
        SubLObject non_lambda_expressions = NIL;
        SubLObject cdolist_list_var = unscoped;
        SubLObject e = NIL;
        e = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lambda_expressionP(e)) {
                lambda_expressions = cons(e, lambda_expressions);
            } else {
                non_lambda_expressions = cons(e, non_lambda_expressions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            e = cdolist_list_var.first();
        } 
        return values(lambda_expressions, non_lambda_expressions);
    }

    /**
     *
     *
     * @unknown inefficient; we might want to add an explicit (#$Lambda :SCOPE <sem>) instead
     */
    @LispMethod(comment = "@unknown inefficient; we might want to add an explicit (#$Lambda :SCOPE <sem>) instead")
    public static final SubLObject lambda_expressionP_alt(SubLObject sem) {
        return methods.funcall_class_method_with_3_args(CYCLIFICATION, FIND, sem, $SCOPE, EQL);
    }

    /**
     *
     *
     * @unknown inefficient; we might want to add an explicit (#$Lambda :SCOPE <sem>) instead
     */
    @LispMethod(comment = "@unknown inefficient; we might want to add an explicit (#$Lambda :SCOPE <sem>) instead")
    public static SubLObject lambda_expressionP(final SubLObject sem) {
        return methods.funcall_class_method_with_3_args(CYCLIFICATION, FIND, sem, $SCOPE, EQL);
    }

    public static final SubLObject beta_reduce_alt(SubLObject argument, SubLObject lambda_expressions) {
        {
            SubLObject l_term = lambda_expressions.first();
            SubLObject new_l_term = NIL;
            if (NIL == l_term) {
                return argument;
            }
            new_l_term = methods.funcall_instance_method_with_0_args(l_term, COPY);
            if (NIL != argument) {
                new_l_term = methods.funcall_class_method_with_3_args(CYCLIFICATION, SUBSTITUTE, new_l_term, argument, $SCOPE);
            }
            return com.cyc.cycjava.cycl.cyclifier.beta_reduce(new_l_term, lambda_expressions.rest());
        }
    }

    public static SubLObject beta_reduce(final SubLObject argument, final SubLObject lambda_expressions) {
        final SubLObject l_term = lambda_expressions.first();
        SubLObject new_l_term = NIL;
        if (NIL == l_term) {
            return argument;
        }
        new_l_term = methods.funcall_instance_method_with_0_args(l_term, COPY);
        if (NIL != argument) {
            new_l_term = methods.funcall_class_method_with_3_args(CYCLIFICATION, SUBSTITUTE, new_l_term, argument, $SCOPE);
        }
        return beta_reduce(new_l_term, lambda_expressions.rest());
    }

    public static final SubLObject cyclify_test_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexicon = object.new_class_instance(CYCLIFIER_LEXICON);
                SubLObject v_parser = parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
                SubLObject v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
                SubLObject result = NIL;
                memoization_state.clear_hl_store_dependent_caches();
                {
                    SubLObject state = memoization_state.possibly_new_memoization_state();
                    SubLObject local_state = state;
                    {
                        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            {
                                SubLObject original_memoization_process = NIL;
                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                    {
                                        SubLObject current_proc = current_process();
                                        if (NIL == original_memoization_process) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                        } else {
                                            if (original_memoization_process != current_proc) {
                                                Errors.error($str_alt158$Invalid_attempt_to_reuse_memoizat);
                                            }
                                        }
                                    }
                                }
                                try {
                                    {
                                        SubLObject cdolist_list_var = $cyclifier_test_sentences$.getDynamicValue(thread);
                                        SubLObject sentence = NIL;
                                        for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                            Errors.warn($str_alt248$sentence___S__, sentence);
                                            {
                                                SubLObject tree = methods.funcall_instance_method_with_3_args(v_parser, PARSE, sentence, lexicon, v_context);
                                                SubLObject cycls = NIL;
                                                if (NIL != tree) {
                                                    {
                                                        SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, list($LEXICON, lexicon));
                                                        while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym139$HAS_NEXT_)) {
                                                            cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
                                                        } 
                                                    }
                                                    result = cons(list(sentence, cycls), result);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cyclify_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon = object.new_class_instance(CYCLIFIER_LEXICON);
        final SubLObject v_parser = parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
        final SubLObject v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
        SubLObject result = NIL;
        memoization_state.clear_hl_store_dependent_caches();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = $cyclifier_test_sentences$.getDynamicValue(thread);
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    Errors.warn($str247$sentence___S__, sentence);
                    final SubLObject tree = methods.funcall_instance_method_with_3_args(v_parser, PARSE, sentence, lexicon, v_context);
                    SubLObject cycls = NIL;
                    if (NIL != tree) {
                        final SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args(tree, GET_CYCLIFIER, list($LEXICON, lexicon));
                        while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym139$HAS_NEXT_)) {
                            cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
                        } 
                        result = cons(list(sentence, cycls), result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ARGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARG"), list(makeSymbol("I")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNARY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BINARY-P"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt13 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt14 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt15 = list(makeString("Prints this literal to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeSymbol("PREDICATE"), makeSymbol("STREAM")), list(makeSymbol("WRITE-CHAR"), CHAR_lparen, makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("FIRST"), makeSymbol("ARGS")), makeSymbol("STREAM")), list(makeSymbol("CDOLIST"), list(makeSymbol("ARG"), list(makeSymbol("CDR"), makeSymbol("ARGS"))), list(makeSymbol("WRITE-STRING"), makeString(", "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("ARG"), makeSymbol("STREAM"))), list(makeSymbol("WRITE-CHAR"), CHAR_rparen, makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt17$__ = makeString(", ");

    static private final SubLList $list_alt20 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt21 = list(makeString("@return stringp; the predicate of this literal"), list(RET, makeSymbol("PREDICATE")));

    /**
     *
     *
     * @param SENTENCE
     * 		stringp; an English sentence
     * @param TARGET
     * 		listp; a disjunctively interpreted list of CycL sentences
     * @return list; a list of several values:
    1 the output of the cyclifier
    2 a boolean result value to indicate whether cyclifying SENTENCE met TARGET
    3 the kb
    4 the cyc revision string
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tstringp; an English sentence\r\n@param TARGET\r\n\t\tlistp; a disjunctively interpreted list of CycL sentences\r\n@return list; a list of several values:\r\n1 the output of the cyclifier\r\n2 a boolean result value to indicate whether cyclifying SENTENCE met TARGET\r\n3 the kb\r\n4 the cyc revision string")
    public static final SubLObject test_cyclify_alt(SubLObject sentence, SubLObject target) {
        SubLTrampolineFile.checkType(sentence, STRINGP);
        SubLTrampolineFile.checkType(target, STRINGP);
        {
            SubLObject output = com.cyc.cycjava.cycl.cyclifier.cyclify(sentence, list($PARSER, parser.new_charniak_parser(UNPROVIDED, UNPROVIDED)));
            SubLObject cycl = read_from_string(string_utilities.cyclify_string(target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = subsetp(cycl, output, INFERENCE_FORMULA_FOLLOWS, UNPROVIDED);
            SubLObject kb = kb_loaded();
            SubLObject revision = system_info.cyc_revision_string();
            return list(result, output, kb, revision);
        }
    }

    /**
     *
     *
     * @param SENTENCE
     * 		stringp; an English sentence
     * @param TARGET
     * 		listp; a disjunctively interpreted list of CycL sentences
     * @return list; a list of several values:
    1 the output of the cyclifier
    2 a boolean result value to indicate whether cyclifying SENTENCE met TARGET
    3 the kb
    4 the cyc revision string
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tstringp; an English sentence\r\n@param TARGET\r\n\t\tlistp; a disjunctively interpreted list of CycL sentences\r\n@return list; a list of several values:\r\n1 the output of the cyclifier\r\n2 a boolean result value to indicate whether cyclifying SENTENCE met TARGET\r\n3 the kb\r\n4 the cyc revision string")
    public static SubLObject test_cyclify(final SubLObject sentence, final SubLObject target) {
        assert NIL != stringp(sentence) : "! stringp(sentence) " + ("Types.stringp(sentence) " + "CommonSymbols.NIL != Types.stringp(sentence) ") + sentence;
        assert NIL != stringp(target) : "! stringp(target) " + ("Types.stringp(target) " + "CommonSymbols.NIL != Types.stringp(target) ") + target;
        final SubLObject output = cyclify(sentence, list($PARSER, parser.new_charniak_parser(UNPROVIDED, UNPROVIDED)));
        final SubLObject cycl = read_from_string(string_utilities.cyclify_string(target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject result = subsetp(cycl, output, INFERENCE_FORMULA_FOLLOWS, UNPROVIDED);
        final SubLObject kb = kb_loaded();
        final SubLObject revision = system_info.cyc_revision_string();
        return list(result, output, kb, revision);
    }

    static private final SubLList $list_alt25 = list(makeString("@return listp; the list of arguments of this lf-literal"), list(RET, makeSymbol("ARGS")));

    static private final SubLList $list_alt29 = list(makeSymbol("I"));

    static private final SubLList $list_alt30 = list(makeString("@param i non-negative-integer; the argument index of the argument to be returned\n   @return lf-variable; the variable in argument position I of this literal, \n   nil if there is none"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("POSITIVE-INTEGER-P")), list(RET, list(makeSymbol("CAR"), list(makeSymbol("NTHCDR"), list(makeSymbol("1-"), makeSymbol("I")), makeSymbol("ARGS")))));

    /**
     * for purposes of testing the cyclifer, does CONSEQUENT follow from ANTECEDENT?
     *
     * @unknown the use of (dnfs-el-formula (extract-el-clauses (canonicalize-ask SENT))) is an attempt to get around the fact that
    there's no easy way to get both sentences into a canonical form (which is required for inference-formula-implies to always
    work correctly, since it doesn't work on this pair:
    (thereExists ?X (and (likesAsFriend ?X ?Y) (nameString ?Y 'Fred')))
    (and (nameString ?Y 'Fred') (thereExists ?X (likesAsFriend ?X ?Y)))
    This workaround is known to be less than optimal, since it removes all existentials from the sentences.
    Thus, two sentences that differ only in the presence or absence of an existential binding will come back as exactly the same using this test.
     */
    @LispMethod(comment = "for purposes of testing the cyclifer, does CONSEQUENT follow from ANTECEDENT?\r\n\r\n@unknown the use of (dnfs-el-formula (extract-el-clauses (canonicalize-ask SENT))) is an attempt to get around the fact that\r\nthere\'s no easy way to get both sentences into a canonical form (which is required for inference-formula-implies to always\r\nwork correctly, since it doesn\'t work on this pair:\r\n(thereExists ?X (and (likesAsFriend ?X ?Y) (nameString ?Y \'Fred\')))\r\n(and (nameString ?Y \'Fred\') (thereExists ?X (likesAsFriend ?X ?Y)))\r\nThis workaround is known to be less than optimal, since it removes all existentials from the sentences.\r\nThus, two sentences that differ only in the presence or absence of an existential binding will come back as exactly the same using this test.")
    public static final SubLObject inference_formula_follows_alt(SubLObject consequent, SubLObject antecedent) {
        {
            SubLObject canonical_antecedent = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(czer_main.canonicalize_ask(com.cyc.cycjava.cycl.cyclifier.reformulate_instancefns_for_testing(antecedent), $$InferencePSC)), $$InferencePSC, UNPROVIDED);
            SubLObject canonical_consequent = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(czer_main.canonicalize_ask(com.cyc.cycjava.cycl.cyclifier.reformulate_instancefns_for_testing(consequent), $$InferencePSC)), $$InferencePSC, UNPROVIDED);
            return makeBoolean((NIL != removal_modules_formula_implies.inference_formula_implies(canonical_antecedent, canonical_consequent)) || (NIL != czer_utilities.equals_elP(antecedent, consequent, UNPROVIDED, UNPROVIDED)));
        }
    }

    @LispMethod(comment = "for purposes of testing the cyclifer, does CONSEQUENT follow from ANTECEDENT?\r\n\r\n@unknown the use of (dnfs-el-formula (extract-el-clauses (canonicalize-ask SENT))) is an attempt to get around the fact that\r\nthere\'s no easy way to get both sentences into a canonical form (which is required for inference-formula-implies to always\r\nwork correctly, since it doesn\'t work on this pair:\r\n(thereExists ?X (and (likesAsFriend ?X ?Y) (nameString ?Y \'Fred\')))\r\n(and (nameString ?Y \'Fred\') (thereExists ?X (likesAsFriend ?X ?Y)))\r\nThis workaround is known to be less than optimal, since it removes all existentials from the sentences.\r\nThus, two sentences that differ only in the presence or absence of an existential binding will come back as exactly the same using this test.")
    public static SubLObject inference_formula_follows(final SubLObject consequent, final SubLObject antecedent) {
        final SubLObject canonical_antecedent = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(czer_main.canonicalize_ask(reformulate_instancefns_for_testing(antecedent), $$InferencePSC)), $$InferencePSC, UNPROVIDED);
        final SubLObject canonical_consequent = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(czer_main.canonicalize_ask(reformulate_instancefns_for_testing(consequent), $$InferencePSC)), $$InferencePSC, UNPROVIDED);
        return makeBoolean((NIL != removal_modules_formula_implies.inference_formula_implies(canonical_antecedent, canonical_consequent)) || (NIL != czer_utilities.equals_elP(antecedent, consequent, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    static private final SubLList $list_alt35 = list(makeString("@return lf-variable; the referent of this literal"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ARG")), ZERO_INTEGER)));

    public static final SubLObject reformulate_instancefns_for_testing_alt(SubLObject sentence) {
        {
            SubLObject result = copy_list(sentence);
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(result, $sym251$INSTANCEFN_NAT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject instancefn = NIL;
            for (instancefn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instancefn = cdolist_list_var.first()) {
                {
                    SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(result, UNPROVIDED);
                    result = cycl_utilities.expression_subst(list($$InstanceFn, new_var), instancefn, result, EQUAL, UNPROVIDED);
                }
            }
            return result;
        }
    }

    public static SubLObject reformulate_instancefns_for_testing(final SubLObject sentence) {
        SubLObject result = copy_list(sentence);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(result, $sym250$INSTANCEFN_NAT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject instancefn = NIL;
        instancefn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(result, UNPROVIDED);
            result = cycl_utilities.expression_subst(list($$InstanceFn, new_var), instancefn, result, EQUAL, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            instancefn = cdolist_list_var.first();
        } 
        return result;
    }

    static private final SubLList $list_alt38 = list(makeString("@return parse-tree-p; the parse tree whose logical form is this literal"), list(RET, makeSymbol("PARSE")));

    static private final SubLList $list_alt42 = list(makeString("@return boolean; t if this literal is unary, nil otherwise"), list(RET, list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("ARGS")), ONE_INTEGER)));

    public static final SubLObject instancefn_natP_alt(SubLObject obj) {
        return eq(cycl_utilities.formula_arg0(obj), $$InstanceFn);
    }

    public static SubLObject instancefn_natP(final SubLObject obj) {
        return kb_utilities.kbeq(cycl_utilities.formula_arg0(obj), $$InstanceFn);
    }

    public static final SubLObject declare_cyclifier_file_alt() {
        declareFunction("new_lf_variable", "NEW-LF-VARIABLE", 0, 1, false);
        declareFunction("get_lf_literal_parse", "GET-LF-LITERAL-PARSE", 1, 0, false);
        declareFunction("set_lf_literal_parse", "SET-LF-LITERAL-PARSE", 2, 0, false);
        declareFunction("get_lf_literal_args", "GET-LF-LITERAL-ARGS", 1, 0, false);
        declareFunction("set_lf_literal_args", "SET-LF-LITERAL-ARGS", 2, 0, false);
        declareFunction("get_lf_literal_predicate", "GET-LF-LITERAL-PREDICATE", 1, 0, false);
        declareFunction("set_lf_literal_predicate", "SET-LF-LITERAL-PREDICATE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_lf_literal_class", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_lf_literal_instance", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE", 1, 0, false);
        declareFunction("lf_literal_p", "LF-LITERAL-P", 1, 0, false);
        declareFunction("new_lf_literal", "NEW-LF-LITERAL", 3, 0, false);
        declareFunction("lf_literal_print_method", "LF-LITERAL-PRINT-METHOD", 3, 0, false);
        declareFunction("lf_literal_get_predicate_method", "LF-LITERAL-GET-PREDICATE-METHOD", 1, 0, false);
        declareFunction("lf_literal_get_args_method", "LF-LITERAL-GET-ARGS-METHOD", 1, 0, false);
        declareFunction("lf_literal_get_arg_method", "LF-LITERAL-GET-ARG-METHOD", 2, 0, false);
        declareFunction("lf_literal_get_ref_method", "LF-LITERAL-GET-REF-METHOD", 1, 0, false);
        declareFunction("lf_literal_get_parse_method", "LF-LITERAL-GET-PARSE-METHOD", 1, 0, false);
        declareFunction("lf_literal_unary_p_method", "LF-LITERAL-UNARY-P-METHOD", 1, 0, false);
        declareFunction("lf_literal_binary_p_method", "LF-LITERAL-BINARY-P-METHOD", 1, 0, false);
        declareFunction("phrase_tree_logical_form_int_method", "PHRASE-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("word_tree_get_lf_predicate_method", "WORD-TREE-GET-LF-PREDICATE-METHOD", 1, 0, false);
        declareFunction("verbal_word_tree_logical_form_int_method", "VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("modifier_word_tree_logical_form_int_method", "MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("nominal_word_tree_logical_form_int_method", "NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("prepositional_or_particle_word_tree_logical_form_int_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("possessive_word_tree_logical_form_int_method", "POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("parse_tree_logical_form_method", "PARSE-TREE-LOGICAL-FORM-METHOD", 1, 1, false);
        declareFunction("logical_form", "LOGICAL-FORM", 1, 1, false);
        declareFunction("formula_keywords", "FORMULA-KEYWORDS", 1, 0, false);
        declareFunction("lexical_keywords", "LEXICAL-KEYWORDS", 1, 0, false);
        declareFunction("get_subcyclifier_pool", "GET-SUBCYCLIFIER-POOL", 1, 0, false);
        declareFunction("get_cyclifier_error_handling", "GET-CYCLIFIER-ERROR-HANDLING", 1, 0, false);
        declareFunction("set_cyclifier_error_handling", "SET-CYCLIFIER-ERROR-HANDLING", 2, 0, false);
        declareFunction("get_cyclifier_sbhl_resource", "GET-CYCLIFIER-SBHL-RESOURCE", 1, 0, false);
        declareFunction("set_cyclifier_sbhl_resource", "SET-CYCLIFIER-SBHL-RESOURCE", 2, 0, false);
        declareFunction("get_cyclifier_memoization_state", "GET-CYCLIFIER-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("set_cyclifier_memoization_state", "SET-CYCLIFIER-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("get_cyclifier_score", "GET-CYCLIFIER-SCORE", 1, 0, false);
        declareFunction("set_cyclifier_score", "SET-CYCLIFIER-SCORE", 2, 0, false);
        declareFunction("get_cyclifier_next", "GET-CYCLIFIER-NEXT", 1, 0, false);
        declareFunction("set_cyclifier_next", "SET-CYCLIFIER-NEXT", 2, 0, false);
        declareFunction("get_cyclifier_output", "GET-CYCLIFIER-OUTPUT", 1, 0, false);
        declareFunction("set_cyclifier_output", "SET-CYCLIFIER-OUTPUT", 2, 0, false);
        declareFunction("get_cyclifier_score_function", "GET-CYCLIFIER-SCORE-FUNCTION", 1, 0, false);
        declareFunction("set_cyclifier_score_function", "SET-CYCLIFIER-SCORE-FUNCTION", 2, 0, false);
        declareFunction("get_cyclifier_raw_cyclifications", "GET-CYCLIFIER-RAW-CYCLIFICATIONS", 1, 0, false);
        declareFunction("set_cyclifier_raw_cyclifications", "SET-CYCLIFIER-RAW-CYCLIFICATIONS", 2, 0, false);
        declareFunction("get_cyclifier_raw_cyclifiedP", "GET-CYCLIFIER-RAW-CYCLIFIED?", 1, 0, false);
        declareFunction("set_cyclifier_raw_cyclifiedP", "SET-CYCLIFIER-RAW-CYCLIFIED?", 2, 0, false);
        declareFunction("get_cyclifier_wff_checkP", "GET-CYCLIFIER-WFF-CHECK?", 1, 0, false);
        declareFunction("set_cyclifier_wff_checkP", "SET-CYCLIFIER-WFF-CHECK?", 2, 0, false);
        declareFunction("get_cyclifier_subcyclifier_pool", "GET-CYCLIFIER-SUBCYCLIFIER-POOL", 1, 0, false);
        declareFunction("set_cyclifier_subcyclifier_pool", "SET-CYCLIFIER-SUBCYCLIFIER-POOL", 2, 0, false);
        declareFunction("get_cyclifier_tree", "GET-CYCLIFIER-TREE", 1, 0, false);
        declareFunction("set_cyclifier_tree", "SET-CYCLIFIER-TREE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE", 1, 0, false);
        declareFunction("cyclifier_p", "CYCLIFIER-P", 1, 0, false);
        declareFunction("cyclifier_has_nextP_method", "CYCLIFIER-HAS-NEXT?-METHOD", 1, 0, false);
        declareFunction("cyclifier_next_method", "CYCLIFIER-NEXT-METHOD", 1, 0, false);
        declareFunction("cyclifier_wff_check_method", "CYCLIFIER-WFF-CHECK-METHOD", 2, 0, false);
        declareFunction("storing_cyclifier_wff_resultsP", "STORING-CYCLIFIER-WFF-RESULTS?", 0, 0, false);
        declareFunction("cyclifier_wffP", "CYCLIFIER-WFF?", 1, 1, false);
        declareFunction("cyclifier_handle_error_method", "CYCLIFIER-HANDLE-ERROR-METHOD", 2, 0, false);
        declareFunction("subst_vars_for_instancefn", "SUBST-VARS-FOR-INSTANCEFN", 1, 0, false);
        declareFunction("create_term_to_var_mapping", "CREATE-TERM-TO-VAR-MAPPING", 1, 0, false);
        declareFunction("gather_instancefn_terms", "GATHER-INSTANCEFN-TERMS", 1, 0, false);
        declareFunction("beautify_cyclification", "BEAUTIFY-CYCLIFICATION", 1, 0, false);
        declareFunction("quantified_quantifier", "QUANTIFIED-QUANTIFIER", 1, 0, false);
        declareFunction("quantified_variable", "QUANTIFIED-VARIABLE", 1, 0, false);
        declareFunction("quantified_formula", "QUANTIFIED-FORMULA", 1, 0, false);
        declareFunction("fold_equals", "FOLD-EQUALS", 1, 0, false);
        declareFunction("var_counts", "VAR-COUNTS", 1, 0, false);
        declareFunction("non_singleton_vars", "NON-SINGLETON-VARS", 1, 0, false);
        declareFunction("non_singleton_free_vars", "NON-SINGLETON-FREE-VARS", 1, 0, false);
        declareFunction("get_assignment", "GET-ASSIGNMENT", 1, 1, false);
        declareFunction("equals_clauseP", "EQUALS-CLAUSE?", 1, 0, false);
        declareFunction("quick_sentential_parse_wffP", "QUICK-SENTENTIAL-PARSE-WFF?", 1, 0, false);
        declareFunction("cyclifier_wff_intP", "CYCLIFIER-WFF-INT?", 1, 1, false);
        declareFunction("variable_arguments_okP", "VARIABLE-ARGUMENTS-OK?", 2, 0, false);
        declareFunction("constant_arguments_okP", "CONSTANT-ARGUMENTS-OK?", 2, 0, false);
        declareFunction("quantify_implicit_subject", "QUANTIFY-IMPLICIT-SUBJECT", 1, 0, false);
        declareFunction("required_keywords", "REQUIRED-KEYWORDS", 1, 0, false);
        declareFunction("rename_variables", "RENAME-VARIABLES", 2, 0, false);
        declareFunction("frame_renaming", "FRAME-RENAMING", 1, 0, false);
        declareFunction("cyclify_int", "CYCLIFY-INT", 1, 0, false);
        declareFunction("cyclify_link", "CYCLIFY-LINK", 1, 1, false);
        declareFunction("cyclify_charniak", "CYCLIFY-CHARNIAK", 1, 1, false);
        declareFunction("cyclify_stanford", "CYCLIFY-STANFORD", 1, 1, false);
        declareFunction("cyclify", "CYCLIFY", 1, 1, false);
        declareFunction("cyclifier_catch_errorsP", "CYCLIFIER-CATCH-ERRORS?", 0, 0, false);
        declareFunction("new_cyclifier", "NEW-CYCLIFIER", 1, 1, false);
        declareFunction("new_parse_cyclifier", "NEW-PARSE-CYCLIFIER", 1, 1, false);
        declareFunction("cyclify_parse", "CYCLIFY-PARSE", 1, 1, false);
        declareFunction("free_variable_p", "FREE-VARIABLE-P", 1, 0, false);
        declareFunction("get_cyclification_confidence", "GET-CYCLIFICATION-CONFIDENCE", 1, 0, false);
        declareFunction("set_cyclification_confidence", "SET-CYCLIFICATION-CONFIDENCE", 2, 0, false);
        declareFunction("get_cyclification_word", "GET-CYCLIFICATION-WORD", 1, 0, false);
        declareFunction("set_cyclification_word", "SET-CYCLIFICATION-WORD", 2, 0, false);
        declareFunction("get_cyclification_cycl", "GET-CYCLIFICATION-CYCL", 1, 0, false);
        declareFunction("set_cyclification_cycl", "SET-CYCLIFICATION-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyclification_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclification_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE", 1, 0, false);
        declareFunction("cyclification_p", "CYCLIFICATION-P", 1, 0, false);
        declareFunction("new_cyclification", "NEW-CYCLIFICATION", 3, 0, false);
        declareFunction("cyclification_get_cycl_method", "CYCLIFICATION-GET-CYCL-METHOD", 1, 0, false);
        declareFunction("cyclification_get_word_method", "CYCLIFICATION-GET-WORD-METHOD", 1, 0, false);
        declareFunction("cyclification_get_confidence_method", "CYCLIFICATION-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyclification_copy_method", "CYCLIFICATION-COPY-METHOD", 1, 0, false);
        declareFunction("cyclification_print_method", "CYCLIFICATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyclification_el_formula_method", "CYCLIFICATION-EL-FORMULA-METHOD", 2, 0, false);
        declareFunction("cyclification_find_method", "CYCLIFICATION-FIND-METHOD", 3, 1, false);
        declareFunction("cyclification_substitute_method", "CYCLIFICATION-SUBSTITUTE-METHOD", 4, 1, false);
        declareFunction("cyclification_score", "CYCLIFICATION-SCORE", 1, 0, false);
        declareFunction("cyclification_coverage", "CYCLIFICATION-COVERAGE", 1, 0, false);
        declareFunction("cyclification_yield", "CYCLIFICATION-YIELD", 1, 0, false);
        declareFunction("cyclification_coverage_int", "CYCLIFICATION-COVERAGE-INT", 1, 0, false);
        declareFunction("rank_cyclifications", "RANK-CYCLIFICATIONS", 1, 1, false);
        declareFunction("new_ranked_lex_entry", "NEW-RANKED-LEX-ENTRY", 1, 1, false);
        declareFunction("rle_lex", "RLE-LEX", 1, 0, false);
        declareFunction("rle_confidence", "RLE-CONFIDENCE", 1, 0, false);
        declareFunction("rle_set_lex", "RLE-SET-LEX", 2, 0, false);
        declareFunction("rle_set_confidence", "RLE-SET-CONFIDENCE", 2, 0, false);
        declareFunction("rle_sem_equal", "RLE-SEM-EQUAL", 2, 0, false);
        declareFunction("ranked_lex_entry_p", "RANKED-LEX-ENTRY-P", 1, 0, false);
        declareFunction("new_even_lex_entry_distribution", "NEW-EVEN-LEX-ENTRY-DISTRIBUTION", 1, 0, false);
        declareFunction("instantiate_scope", "INSTANTIATE-SCOPE", 1, 0, false);
        declareFunction("scope_quantifiers", "SCOPE-QUANTIFIERS", 1, 0, false);
        declareFunction("quantifier_scoping_score", "QUANTIFIER-SCOPING-SCORE", 1, 0, false);
        declareFunction("cyclification_free_variables", "CYCLIFICATION-FREE-VARIABLES", 1, 0, false);
        declareFunction("partition_unscoped", "PARTITION-UNSCOPED", 1, 0, false);
        declareFunction("lambda_expressionP", "LAMBDA-EXPRESSION?", 1, 0, false);
        declareFunction("beta_reduce", "BETA-REDUCE", 2, 0, false);
        declareFunction("cyclify_test", "CYCLIFY-TEST", 0, 0, false);
        declareFunction("test_cyclify", "TEST-CYCLIFY", 2, 0, false);
        declareFunction("inference_formula_follows", "INFERENCE-FORMULA-FOLLOWS", 2, 0, false);
        declareFunction("reformulate_instancefns_for_testing", "REFORMULATE-INSTANCEFNS-FOR-TESTING", 1, 0, false);
        declareFunction("instancefn_natP", "INSTANCEFN-NAT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cyclifier_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("new_lf_variable", "NEW-LF-VARIABLE", 0, 1, false);
            declareFunction("get_lf_literal_parse", "GET-LF-LITERAL-PARSE", 1, 0, false);
            declareFunction("set_lf_literal_parse", "SET-LF-LITERAL-PARSE", 2, 0, false);
            declareFunction("get_lf_literal_args", "GET-LF-LITERAL-ARGS", 1, 0, false);
            declareFunction("set_lf_literal_args", "SET-LF-LITERAL-ARGS", 2, 0, false);
            declareFunction("get_lf_literal_predicate", "GET-LF-LITERAL-PREDICATE", 1, 0, false);
            declareFunction("set_lf_literal_predicate", "SET-LF-LITERAL-PREDICATE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_lf_literal_class", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_lf_literal_instance", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE", 1, 0, false);
            declareFunction("lf_literal_p", "LF-LITERAL-P", 1, 0, false);
            declareFunction("new_lf_literal", "NEW-LF-LITERAL", 3, 0, false);
            declareFunction("lf_literal_print_method", "LF-LITERAL-PRINT-METHOD", 3, 0, false);
            declareFunction("lf_literal_get_predicate_method", "LF-LITERAL-GET-PREDICATE-METHOD", 1, 0, false);
            declareFunction("lf_literal_get_args_method", "LF-LITERAL-GET-ARGS-METHOD", 1, 0, false);
            declareFunction("lf_literal_get_arg_method", "LF-LITERAL-GET-ARG-METHOD", 2, 0, false);
            declareFunction("lf_literal_get_ref_method", "LF-LITERAL-GET-REF-METHOD", 1, 0, false);
            declareFunction("lf_literal_get_parse_method", "LF-LITERAL-GET-PARSE-METHOD", 1, 0, false);
            declareFunction("lf_literal_unary_p_method", "LF-LITERAL-UNARY-P-METHOD", 1, 0, false);
            declareFunction("lf_literal_binary_p_method", "LF-LITERAL-BINARY-P-METHOD", 1, 0, false);
            declareFunction("phrase_tree_logical_form_int_method", "PHRASE-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
            declareFunction("word_tree_get_lf_predicate_method", "WORD-TREE-GET-LF-PREDICATE-METHOD", 1, 0, false);
            declareFunction("verbal_word_tree_logical_form_int_method", "VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
            declareFunction("modifier_word_tree_logical_form_int_method", "MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
            declareFunction("nominal_word_tree_logical_form_int_method", "NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
            declareFunction("prepositional_or_particle_word_tree_logical_form_int_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
            declareFunction("possessive_word_tree_logical_form_int_method", "POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
            declareFunction("parse_tree_logical_form_method", "PARSE-TREE-LOGICAL-FORM-METHOD", 1, 1, false);
            declareFunction("logical_form", "LOGICAL-FORM", 1, 1, false);
            declareFunction("formula_keywords", "FORMULA-KEYWORDS", 1, 0, false);
            declareFunction("lexical_keywords", "LEXICAL-KEYWORDS", 1, 0, false);
            declareFunction("get_subcyclifier_pool", "GET-SUBCYCLIFIER-POOL", 1, 0, false);
            declareFunction("get_cyclifier_error_handling", "GET-CYCLIFIER-ERROR-HANDLING", 1, 0, false);
            declareFunction("set_cyclifier_error_handling", "SET-CYCLIFIER-ERROR-HANDLING", 2, 0, false);
            declareFunction("get_cyclifier_sbhl_resource", "GET-CYCLIFIER-SBHL-RESOURCE", 1, 0, false);
            declareFunction("set_cyclifier_sbhl_resource", "SET-CYCLIFIER-SBHL-RESOURCE", 2, 0, false);
            declareFunction("get_cyclifier_memoization_state", "GET-CYCLIFIER-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("set_cyclifier_memoization_state", "SET-CYCLIFIER-MEMOIZATION-STATE", 2, 0, false);
            declareFunction("get_cyclifier_score", "GET-CYCLIFIER-SCORE", 1, 0, false);
            declareFunction("set_cyclifier_score", "SET-CYCLIFIER-SCORE", 2, 0, false);
            declareFunction("get_cyclifier_next", "GET-CYCLIFIER-NEXT", 1, 0, false);
            declareFunction("set_cyclifier_next", "SET-CYCLIFIER-NEXT", 2, 0, false);
            declareFunction("get_cyclifier_output", "GET-CYCLIFIER-OUTPUT", 1, 0, false);
            declareFunction("set_cyclifier_output", "SET-CYCLIFIER-OUTPUT", 2, 0, false);
            declareFunction("get_cyclifier_score_function", "GET-CYCLIFIER-SCORE-FUNCTION", 1, 0, false);
            declareFunction("set_cyclifier_score_function", "SET-CYCLIFIER-SCORE-FUNCTION", 2, 0, false);
            declareFunction("get_cyclifier_raw_cyclifications", "GET-CYCLIFIER-RAW-CYCLIFICATIONS", 1, 0, false);
            declareFunction("set_cyclifier_raw_cyclifications", "SET-CYCLIFIER-RAW-CYCLIFICATIONS", 2, 0, false);
            declareFunction("get_cyclifier_raw_cyclifiedP", "GET-CYCLIFIER-RAW-CYCLIFIED?", 1, 0, false);
            declareFunction("set_cyclifier_raw_cyclifiedP", "SET-CYCLIFIER-RAW-CYCLIFIED?", 2, 0, false);
            declareFunction("get_cyclifier_wff_checkP", "GET-CYCLIFIER-WFF-CHECK?", 1, 0, false);
            declareFunction("set_cyclifier_wff_checkP", "SET-CYCLIFIER-WFF-CHECK?", 2, 0, false);
            declareFunction("get_cyclifier_subcyclifier_pool", "GET-CYCLIFIER-SUBCYCLIFIER-POOL", 1, 0, false);
            declareFunction("set_cyclifier_subcyclifier_pool", "SET-CYCLIFIER-SUBCYCLIFIER-POOL", 2, 0, false);
            declareFunction("get_cyclifier_tree", "GET-CYCLIFIER-TREE", 1, 0, false);
            declareFunction("set_cyclifier_tree", "SET-CYCLIFIER-TREE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE", 1, 0, false);
            declareFunction("cyclifier_p", "CYCLIFIER-P", 1, 0, false);
            declareFunction("cyclifier_has_nextP_method", "CYCLIFIER-HAS-NEXT?-METHOD", 1, 0, false);
            declareFunction("cyclifier_next_method", "CYCLIFIER-NEXT-METHOD", 1, 0, false);
            declareFunction("cyclifier_wff_check_method", "CYCLIFIER-WFF-CHECK-METHOD", 2, 0, false);
            declareFunction("storing_cyclifier_wff_resultsP", "STORING-CYCLIFIER-WFF-RESULTS?", 0, 0, false);
            declareFunction("cyclifier_wffP", "CYCLIFIER-WFF?", 1, 1, false);
            declareFunction("cyclifier_handle_error_method", "CYCLIFIER-HANDLE-ERROR-METHOD", 2, 0, false);
            declareFunction("subst_vars_for_instancefn", "SUBST-VARS-FOR-INSTANCEFN", 1, 0, false);
            declareFunction("create_term_to_var_mapping", "CREATE-TERM-TO-VAR-MAPPING", 1, 0, false);
            declareFunction("gather_instancefn_terms", "GATHER-INSTANCEFN-TERMS", 1, 0, false);
            declareFunction("beautify_cyclification", "BEAUTIFY-CYCLIFICATION", 1, 0, false);
            declareFunction("quantified_quantifier", "QUANTIFIED-QUANTIFIER", 1, 0, false);
            declareFunction("quantified_variable", "QUANTIFIED-VARIABLE", 1, 0, false);
            declareFunction("quantified_formula", "QUANTIFIED-FORMULA", 1, 0, false);
            declareFunction("apply_alist", "APPLY-ALIST", 2, 1, false);
            declareFunction("non_singleton_possibly_equal_terms", "NON-SINGLETON-POSSIBLY-EQUAL-TERMS", 1, 0, false);
            declareFunction("get_assignment", "GET-ASSIGNMENT", 1, 1, false);
            declareFunction("equals_clauseP", "EQUALS-CLAUSE?", 1, 0, false);
            declareFunction("quick_sentential_parse_wffP", "QUICK-SENTENTIAL-PARSE-WFF?", 1, 0, false);
            declareFunction("cyclifier_wff_intP", "CYCLIFIER-WFF-INT?", 1, 1, false);
            declareFunction("variable_arguments_okP", "VARIABLE-ARGUMENTS-OK?", 2, 0, false);
            declareFunction("constant_arguments_okP", "CONSTANT-ARGUMENTS-OK?", 2, 0, false);
            declareFunction("quantify_implicit_subject", "QUANTIFY-IMPLICIT-SUBJECT", 1, 0, false);
            declareFunction("required_keywords", "REQUIRED-KEYWORDS", 1, 0, false);
            declareFunction("rename_variables", "RENAME-VARIABLES", 2, 0, false);
            declareFunction("frame_renaming", "FRAME-RENAMING", 1, 0, false);
            declareFunction("cyclify_int", "CYCLIFY-INT", 1, 0, false);
            declareFunction("cyclify_link", "CYCLIFY-LINK", 1, 1, false);
            declareFunction("cyclify_charniak", "CYCLIFY-CHARNIAK", 1, 1, false);
            declareFunction("cyclify_stanford", "CYCLIFY-STANFORD", 1, 1, false);
            declareFunction("cyclify", "CYCLIFY", 1, 1, false);
            declareFunction("cyclifier_catch_errorsP", "CYCLIFIER-CATCH-ERRORS?", 0, 0, false);
            declareFunction("new_cyclifier", "NEW-CYCLIFIER", 1, 1, false);
            declareFunction("new_parse_cyclifier", "NEW-PARSE-CYCLIFIER", 1, 1, false);
            declareFunction("cyclify_parse", "CYCLIFY-PARSE", 1, 1, false);
            declareFunction("free_variable_p", "FREE-VARIABLE-P", 1, 0, false);
            declareFunction("get_cyclification_confidence", "GET-CYCLIFICATION-CONFIDENCE", 1, 0, false);
            declareFunction("set_cyclification_confidence", "SET-CYCLIFICATION-CONFIDENCE", 2, 0, false);
            declareFunction("get_cyclification_word", "GET-CYCLIFICATION-WORD", 1, 0, false);
            declareFunction("set_cyclification_word", "SET-CYCLIFICATION-WORD", 2, 0, false);
            declareFunction("get_cyclification_cycl", "GET-CYCLIFICATION-CYCL", 1, 0, false);
            declareFunction("set_cyclification_cycl", "SET-CYCLIFICATION-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_cyclification_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cyclification_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE", 1, 0, false);
            declareFunction("cyclification_p", "CYCLIFICATION-P", 1, 0, false);
            declareFunction("new_cyclification", "NEW-CYCLIFICATION", 3, 0, false);
            declareFunction("cyclification_get_cycl_method", "CYCLIFICATION-GET-CYCL-METHOD", 1, 0, false);
            declareFunction("cyclification_get_word_method", "CYCLIFICATION-GET-WORD-METHOD", 1, 0, false);
            declareFunction("cyclification_get_confidence_method", "CYCLIFICATION-GET-CONFIDENCE-METHOD", 1, 0, false);
            declareFunction("cyclification_copy_method", "CYCLIFICATION-COPY-METHOD", 1, 0, false);
            declareFunction("cyclification_print_method", "CYCLIFICATION-PRINT-METHOD", 3, 0, false);
            declareFunction("cyclification_el_formula_method", "CYCLIFICATION-EL-FORMULA-METHOD", 2, 0, false);
            declareFunction("cyclification_find_method", "CYCLIFICATION-FIND-METHOD", 3, 1, false);
            declareFunction("cyclification_substitute_method", "CYCLIFICATION-SUBSTITUTE-METHOD", 4, 1, false);
            declareFunction("cyclification_score", "CYCLIFICATION-SCORE", 1, 0, false);
            declareFunction("cyclification_coverage", "CYCLIFICATION-COVERAGE", 1, 0, false);
            declareFunction("cyclification_yield", "CYCLIFICATION-YIELD", 1, 0, false);
            declareFunction("cyclification_coverage_int", "CYCLIFICATION-COVERAGE-INT", 1, 0, false);
            declareFunction("rank_cyclifications", "RANK-CYCLIFICATIONS", 1, 1, false);
            declareFunction("new_ranked_lex_entry", "NEW-RANKED-LEX-ENTRY", 1, 1, false);
            declareFunction("rle_lex", "RLE-LEX", 1, 0, false);
            declareFunction("rle_confidence", "RLE-CONFIDENCE", 1, 0, false);
            declareFunction("rle_set_lex", "RLE-SET-LEX", 2, 0, false);
            declareFunction("rle_set_confidence", "RLE-SET-CONFIDENCE", 2, 0, false);
            declareFunction("rle_sem_equal", "RLE-SEM-EQUAL", 2, 0, false);
            declareFunction("ranked_lex_entry_p", "RANKED-LEX-ENTRY-P", 1, 0, false);
            declareFunction("new_even_lex_entry_distribution", "NEW-EVEN-LEX-ENTRY-DISTRIBUTION", 1, 0, false);
            declareFunction("instantiate_scope", "INSTANTIATE-SCOPE", 1, 0, false);
            declareFunction("scope_quantifiers", "SCOPE-QUANTIFIERS", 1, 0, false);
            declareFunction("quantifier_scoping_score", "QUANTIFIER-SCOPING-SCORE", 1, 0, false);
            declareFunction("cyclification_free_variables", "CYCLIFICATION-FREE-VARIABLES", 1, 0, false);
            declareFunction("partition_unscoped", "PARTITION-UNSCOPED", 1, 0, false);
            declareFunction("lambda_expressionP", "LAMBDA-EXPRESSION?", 1, 0, false);
            declareFunction("beta_reduce", "BETA-REDUCE", 2, 0, false);
            declareFunction("cyclify_test", "CYCLIFY-TEST", 0, 0, false);
            declareFunction("test_cyclify", "TEST-CYCLIFY", 2, 0, false);
            declareFunction("inference_formula_follows", "INFERENCE-FORMULA-FOLLOWS", 2, 0, false);
            declareFunction("reformulate_instancefns_for_testing", "REFORMULATE-INSTANCEFNS-FOR-TESTING", 1, 0, false);
            declareFunction("instancefn_natP", "INSTANCEFN-NAT?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("fold_equals", "FOLD-EQUALS", 1, 0, false);
            declareFunction("var_counts", "VAR-COUNTS", 1, 0, false);
            declareFunction("non_singleton_vars", "NON-SINGLETON-VARS", 1, 0, false);
            declareFunction("non_singleton_free_vars", "NON-SINGLETON-FREE-VARS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cyclifier_file_Previous() {
        declareFunction("new_lf_variable", "NEW-LF-VARIABLE", 0, 1, false);
        declareFunction("get_lf_literal_parse", "GET-LF-LITERAL-PARSE", 1, 0, false);
        declareFunction("set_lf_literal_parse", "SET-LF-LITERAL-PARSE", 2, 0, false);
        declareFunction("get_lf_literal_args", "GET-LF-LITERAL-ARGS", 1, 0, false);
        declareFunction("set_lf_literal_args", "SET-LF-LITERAL-ARGS", 2, 0, false);
        declareFunction("get_lf_literal_predicate", "GET-LF-LITERAL-PREDICATE", 1, 0, false);
        declareFunction("set_lf_literal_predicate", "SET-LF-LITERAL-PREDICATE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_lf_literal_class", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_lf_literal_instance", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE", 1, 0, false);
        declareFunction("lf_literal_p", "LF-LITERAL-P", 1, 0, false);
        declareFunction("new_lf_literal", "NEW-LF-LITERAL", 3, 0, false);
        declareFunction("lf_literal_print_method", "LF-LITERAL-PRINT-METHOD", 3, 0, false);
        declareFunction("lf_literal_get_predicate_method", "LF-LITERAL-GET-PREDICATE-METHOD", 1, 0, false);
        declareFunction("lf_literal_get_args_method", "LF-LITERAL-GET-ARGS-METHOD", 1, 0, false);
        declareFunction("lf_literal_get_arg_method", "LF-LITERAL-GET-ARG-METHOD", 2, 0, false);
        declareFunction("lf_literal_get_ref_method", "LF-LITERAL-GET-REF-METHOD", 1, 0, false);
        declareFunction("lf_literal_get_parse_method", "LF-LITERAL-GET-PARSE-METHOD", 1, 0, false);
        declareFunction("lf_literal_unary_p_method", "LF-LITERAL-UNARY-P-METHOD", 1, 0, false);
        declareFunction("lf_literal_binary_p_method", "LF-LITERAL-BINARY-P-METHOD", 1, 0, false);
        declareFunction("phrase_tree_logical_form_int_method", "PHRASE-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("word_tree_get_lf_predicate_method", "WORD-TREE-GET-LF-PREDICATE-METHOD", 1, 0, false);
        declareFunction("verbal_word_tree_logical_form_int_method", "VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("modifier_word_tree_logical_form_int_method", "MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("nominal_word_tree_logical_form_int_method", "NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("prepositional_or_particle_word_tree_logical_form_int_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("possessive_word_tree_logical_form_int_method", "POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        declareFunction("parse_tree_logical_form_method", "PARSE-TREE-LOGICAL-FORM-METHOD", 1, 1, false);
        declareFunction("logical_form", "LOGICAL-FORM", 1, 1, false);
        declareFunction("formula_keywords", "FORMULA-KEYWORDS", 1, 0, false);
        declareFunction("lexical_keywords", "LEXICAL-KEYWORDS", 1, 0, false);
        declareFunction("get_subcyclifier_pool", "GET-SUBCYCLIFIER-POOL", 1, 0, false);
        declareFunction("get_cyclifier_error_handling", "GET-CYCLIFIER-ERROR-HANDLING", 1, 0, false);
        declareFunction("set_cyclifier_error_handling", "SET-CYCLIFIER-ERROR-HANDLING", 2, 0, false);
        declareFunction("get_cyclifier_sbhl_resource", "GET-CYCLIFIER-SBHL-RESOURCE", 1, 0, false);
        declareFunction("set_cyclifier_sbhl_resource", "SET-CYCLIFIER-SBHL-RESOURCE", 2, 0, false);
        declareFunction("get_cyclifier_memoization_state", "GET-CYCLIFIER-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("set_cyclifier_memoization_state", "SET-CYCLIFIER-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("get_cyclifier_score", "GET-CYCLIFIER-SCORE", 1, 0, false);
        declareFunction("set_cyclifier_score", "SET-CYCLIFIER-SCORE", 2, 0, false);
        declareFunction("get_cyclifier_next", "GET-CYCLIFIER-NEXT", 1, 0, false);
        declareFunction("set_cyclifier_next", "SET-CYCLIFIER-NEXT", 2, 0, false);
        declareFunction("get_cyclifier_output", "GET-CYCLIFIER-OUTPUT", 1, 0, false);
        declareFunction("set_cyclifier_output", "SET-CYCLIFIER-OUTPUT", 2, 0, false);
        declareFunction("get_cyclifier_score_function", "GET-CYCLIFIER-SCORE-FUNCTION", 1, 0, false);
        declareFunction("set_cyclifier_score_function", "SET-CYCLIFIER-SCORE-FUNCTION", 2, 0, false);
        declareFunction("get_cyclifier_raw_cyclifications", "GET-CYCLIFIER-RAW-CYCLIFICATIONS", 1, 0, false);
        declareFunction("set_cyclifier_raw_cyclifications", "SET-CYCLIFIER-RAW-CYCLIFICATIONS", 2, 0, false);
        declareFunction("get_cyclifier_raw_cyclifiedP", "GET-CYCLIFIER-RAW-CYCLIFIED?", 1, 0, false);
        declareFunction("set_cyclifier_raw_cyclifiedP", "SET-CYCLIFIER-RAW-CYCLIFIED?", 2, 0, false);
        declareFunction("get_cyclifier_wff_checkP", "GET-CYCLIFIER-WFF-CHECK?", 1, 0, false);
        declareFunction("set_cyclifier_wff_checkP", "SET-CYCLIFIER-WFF-CHECK?", 2, 0, false);
        declareFunction("get_cyclifier_subcyclifier_pool", "GET-CYCLIFIER-SUBCYCLIFIER-POOL", 1, 0, false);
        declareFunction("set_cyclifier_subcyclifier_pool", "SET-CYCLIFIER-SUBCYCLIFIER-POOL", 2, 0, false);
        declareFunction("get_cyclifier_tree", "GET-CYCLIFIER-TREE", 1, 0, false);
        declareFunction("set_cyclifier_tree", "SET-CYCLIFIER-TREE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE", 1, 0, false);
        declareFunction("cyclifier_p", "CYCLIFIER-P", 1, 0, false);
        declareFunction("cyclifier_has_nextP_method", "CYCLIFIER-HAS-NEXT?-METHOD", 1, 0, false);
        declareFunction("cyclifier_next_method", "CYCLIFIER-NEXT-METHOD", 1, 0, false);
        declareFunction("cyclifier_wff_check_method", "CYCLIFIER-WFF-CHECK-METHOD", 2, 0, false);
        declareFunction("storing_cyclifier_wff_resultsP", "STORING-CYCLIFIER-WFF-RESULTS?", 0, 0, false);
        declareFunction("cyclifier_wffP", "CYCLIFIER-WFF?", 1, 1, false);
        declareFunction("cyclifier_handle_error_method", "CYCLIFIER-HANDLE-ERROR-METHOD", 2, 0, false);
        declareFunction("subst_vars_for_instancefn", "SUBST-VARS-FOR-INSTANCEFN", 1, 0, false);
        declareFunction("create_term_to_var_mapping", "CREATE-TERM-TO-VAR-MAPPING", 1, 0, false);
        declareFunction("gather_instancefn_terms", "GATHER-INSTANCEFN-TERMS", 1, 0, false);
        declareFunction("beautify_cyclification", "BEAUTIFY-CYCLIFICATION", 1, 0, false);
        declareFunction("quantified_quantifier", "QUANTIFIED-QUANTIFIER", 1, 0, false);
        declareFunction("quantified_variable", "QUANTIFIED-VARIABLE", 1, 0, false);
        declareFunction("quantified_formula", "QUANTIFIED-FORMULA", 1, 0, false);
        declareFunction("apply_alist", "APPLY-ALIST", 2, 1, false);
        declareFunction("non_singleton_possibly_equal_terms", "NON-SINGLETON-POSSIBLY-EQUAL-TERMS", 1, 0, false);
        declareFunction("get_assignment", "GET-ASSIGNMENT", 1, 1, false);
        declareFunction("equals_clauseP", "EQUALS-CLAUSE?", 1, 0, false);
        declareFunction("quick_sentential_parse_wffP", "QUICK-SENTENTIAL-PARSE-WFF?", 1, 0, false);
        declareFunction("cyclifier_wff_intP", "CYCLIFIER-WFF-INT?", 1, 1, false);
        declareFunction("variable_arguments_okP", "VARIABLE-ARGUMENTS-OK?", 2, 0, false);
        declareFunction("constant_arguments_okP", "CONSTANT-ARGUMENTS-OK?", 2, 0, false);
        declareFunction("quantify_implicit_subject", "QUANTIFY-IMPLICIT-SUBJECT", 1, 0, false);
        declareFunction("required_keywords", "REQUIRED-KEYWORDS", 1, 0, false);
        declareFunction("rename_variables", "RENAME-VARIABLES", 2, 0, false);
        declareFunction("frame_renaming", "FRAME-RENAMING", 1, 0, false);
        declareFunction("cyclify_int", "CYCLIFY-INT", 1, 0, false);
        declareFunction("cyclify_link", "CYCLIFY-LINK", 1, 1, false);
        declareFunction("cyclify_charniak", "CYCLIFY-CHARNIAK", 1, 1, false);
        declareFunction("cyclify_stanford", "CYCLIFY-STANFORD", 1, 1, false);
        declareFunction("cyclify", "CYCLIFY", 1, 1, false);
        declareFunction("cyclifier_catch_errorsP", "CYCLIFIER-CATCH-ERRORS?", 0, 0, false);
        declareFunction("new_cyclifier", "NEW-CYCLIFIER", 1, 1, false);
        declareFunction("new_parse_cyclifier", "NEW-PARSE-CYCLIFIER", 1, 1, false);
        declareFunction("cyclify_parse", "CYCLIFY-PARSE", 1, 1, false);
        declareFunction("free_variable_p", "FREE-VARIABLE-P", 1, 0, false);
        declareFunction("get_cyclification_confidence", "GET-CYCLIFICATION-CONFIDENCE", 1, 0, false);
        declareFunction("set_cyclification_confidence", "SET-CYCLIFICATION-CONFIDENCE", 2, 0, false);
        declareFunction("get_cyclification_word", "GET-CYCLIFICATION-WORD", 1, 0, false);
        declareFunction("set_cyclification_word", "SET-CYCLIFICATION-WORD", 2, 0, false);
        declareFunction("get_cyclification_cycl", "GET-CYCLIFICATION-CYCL", 1, 0, false);
        declareFunction("set_cyclification_cycl", "SET-CYCLIFICATION-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyclification_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclification_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE", 1, 0, false);
        declareFunction("cyclification_p", "CYCLIFICATION-P", 1, 0, false);
        declareFunction("new_cyclification", "NEW-CYCLIFICATION", 3, 0, false);
        declareFunction("cyclification_get_cycl_method", "CYCLIFICATION-GET-CYCL-METHOD", 1, 0, false);
        declareFunction("cyclification_get_word_method", "CYCLIFICATION-GET-WORD-METHOD", 1, 0, false);
        declareFunction("cyclification_get_confidence_method", "CYCLIFICATION-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyclification_copy_method", "CYCLIFICATION-COPY-METHOD", 1, 0, false);
        declareFunction("cyclification_print_method", "CYCLIFICATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyclification_el_formula_method", "CYCLIFICATION-EL-FORMULA-METHOD", 2, 0, false);
        declareFunction("cyclification_find_method", "CYCLIFICATION-FIND-METHOD", 3, 1, false);
        declareFunction("cyclification_substitute_method", "CYCLIFICATION-SUBSTITUTE-METHOD", 4, 1, false);
        declareFunction("cyclification_score", "CYCLIFICATION-SCORE", 1, 0, false);
        declareFunction("cyclification_coverage", "CYCLIFICATION-COVERAGE", 1, 0, false);
        declareFunction("cyclification_yield", "CYCLIFICATION-YIELD", 1, 0, false);
        declareFunction("cyclification_coverage_int", "CYCLIFICATION-COVERAGE-INT", 1, 0, false);
        declareFunction("rank_cyclifications", "RANK-CYCLIFICATIONS", 1, 1, false);
        declareFunction("new_ranked_lex_entry", "NEW-RANKED-LEX-ENTRY", 1, 1, false);
        declareFunction("rle_lex", "RLE-LEX", 1, 0, false);
        declareFunction("rle_confidence", "RLE-CONFIDENCE", 1, 0, false);
        declareFunction("rle_set_lex", "RLE-SET-LEX", 2, 0, false);
        declareFunction("rle_set_confidence", "RLE-SET-CONFIDENCE", 2, 0, false);
        declareFunction("rle_sem_equal", "RLE-SEM-EQUAL", 2, 0, false);
        declareFunction("ranked_lex_entry_p", "RANKED-LEX-ENTRY-P", 1, 0, false);
        declareFunction("new_even_lex_entry_distribution", "NEW-EVEN-LEX-ENTRY-DISTRIBUTION", 1, 0, false);
        declareFunction("instantiate_scope", "INSTANTIATE-SCOPE", 1, 0, false);
        declareFunction("scope_quantifiers", "SCOPE-QUANTIFIERS", 1, 0, false);
        declareFunction("quantifier_scoping_score", "QUANTIFIER-SCOPING-SCORE", 1, 0, false);
        declareFunction("cyclification_free_variables", "CYCLIFICATION-FREE-VARIABLES", 1, 0, false);
        declareFunction("partition_unscoped", "PARTITION-UNSCOPED", 1, 0, false);
        declareFunction("lambda_expressionP", "LAMBDA-EXPRESSION?", 1, 0, false);
        declareFunction("beta_reduce", "BETA-REDUCE", 2, 0, false);
        declareFunction("cyclify_test", "CYCLIFY-TEST", 0, 0, false);
        declareFunction("test_cyclify", "TEST-CYCLIFY", 2, 0, false);
        declareFunction("inference_formula_follows", "INFERENCE-FORMULA-FOLLOWS", 2, 0, false);
        declareFunction("reformulate_instancefns_for_testing", "REFORMULATE-INSTANCEFNS-FOR-TESTING", 1, 0, false);
        declareFunction("instancefn_natP", "INSTANCEFN-NAT?", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt46 = list(makeString("@return boolean; t if this literal is binary, nil otherwise"), list(RET, list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("ARGS")), TWO_INTEGER)));

    static private final SubLList $list_alt51 = list(makeString("@return listp; the logical form of this parse tree"), list(makeSymbol("CLET"), list(list(makeSymbol("LF"), NIL)), list(makeSymbol("CDOVECTOR"), list(makeSymbol("DAUGHTER"), makeSymbol("DAUGHTERS")), list(makeSymbol("CSETQ"), makeSymbol("LF"), list(makeSymbol("APPEND"), makeSymbol("LF"), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(QUOTE, makeSymbol("LOGICAL-FORM-INT")))))), list(RET, makeSymbol("LF"))));

    static private final SubLList $list_alt56 = list(makeString("@return stringp; the predicate name of this word tree"), list(makeSymbol("CLET"), list(makeSymbol("CLASS"), makeSymbol("POS")), list(makeSymbol("PCOND"), list(list(makeSymbol("NAME-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("NP")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("PROPER-NOUN"))), list(list(makeSymbol("NOMINAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("NN")), list(makeSymbol("CSETQ"), makeSymbol("POS"), $NOUN)), list(list(makeSymbol("VERBAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("VB")), list(makeSymbol("CSETQ"), makeSymbol("POS"), $VERB)), list(list(makeSymbol("ADJECTIVAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("JJ")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("ADJECTIVE"))), list(list(makeSymbol("ADVERBIAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("RB")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("ADVERB"))), list(list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CLASS"), makeString("IN")), list(makeSymbol("CSETQ"), makeSymbol("POS"), makeKeyword("PREPOSITION"))), list(T, list(makeSymbol("CSETQ"), makeSymbol("CLASS"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("CATEGORY"))))), list(RET, list(makeSymbol("CCONCATENATE"), list(makeSymbol("STRING-DOWNCASE"), list(makeSymbol("GET-ROOT"), makeSymbol("STRING"), makeSymbol("POS"))), makeString("_"), makeSymbol("CLASS")))));

    static private final SubLString $str_alt70$_ = makeString("_");

    static private final SubLList $list_alt73 = list(makeString("@return listp; the logical form of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), makeSymbol("REFS"))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("OBJECTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))), list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))), list(makeSymbol("CL-COMPLEMENTS"), list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("VERBAL-COMPLEMENT")))), list(makeSymbol("I"), ZERO_INTEGER)), list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBJ-REF"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("subj"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("SUBJ-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJECT"), makeSymbol("OBJECTS")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJ-REF"), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("CCONCATENATE"), makeString("obj"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("I"))), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("OBJ-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CL-COMPLEMENT"), makeSymbol("CL-COMPLEMENTS")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), list(makeSymbol("FIM"), makeSymbol("CL-COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("CCONCATENATE"), makeString("clause"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("I"))), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("COMP-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LF")))));

    static private final SubLList $list_alt84 = list(makeString("@return listp; the logical form of this modifier"), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("GET-LF-PREDICATE"), makeSymbol("SELF")), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIED"), makeSymbol("MODIFIEDS")), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIED-REF"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("modifies"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("MODIFIED-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLList $list_alt89 = list(makeString("@return listp; the logical form of this noun"), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("I"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("CCONCATENATE"), makeString("arg"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("I"))), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("COMP-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLList $list_alt94 = list(makeString("@return listp; the logical form of this preposition"), list(makeSymbol("PWHEN"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("of")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("LF"), list(makeSymbol("LIST"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("REF")), makeSymbol("SELF")))), list(makeSymbol("COMPLEMENTS"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("MOD-REFS"), list(makeSymbol("FWHEN"), makeSymbol("MODIFIED"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-REFS")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD-REF"), makeSymbol("MOD-REFS")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("modifies"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("MOD-REF")), makeSymbol("SELF")), makeSymbol("LF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), makeString("arg"), list(makeSymbol("LIST"), makeSymbol("REF"), makeSymbol("COMP-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    public static final SubLObject init_cyclifier_file_alt() {
        defparameter("*FULL-CYCLIFIER-QUANTIFIER-SUPPORT*", T);
        defparameter("*CYCLIFIERS*", NIL);
        defparameter("*CYCLIFIER-CATCH-ERRORS?*", T);
        defparameter("*DEFAULT-CYCLIFIER-PARSER-FACTORY*", NEW_STANFORD_PARSER);
        defparameter("*CYCLIFIER-TEST-SENTENCES*", $list_alt247);
        return NIL;
    }

    public static SubLObject init_cyclifier_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*FULL-CYCLIFIER-QUANTIFIER-SUPPORT*", T);
            defparameter("*CYCLIFIERS*", NIL);
            defparameter("*CYCLIFIER-CATCH-ERRORS?*", T);
            defparameter("*DEFAULT-CYCLIFIER-PARSER-FACTORY*", NEW_STANFORD_PARSER);
            defparameter("*CYCLIFIER-TEST-SENTENCES*", $list246);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CYCLIFIER-TEST-SENTENCES*", $list_alt247);
        }
        return NIL;
    }

    public static SubLObject init_cyclifier_file_Previous() {
        defparameter("*FULL-CYCLIFIER-QUANTIFIER-SUPPORT*", T);
        defparameter("*CYCLIFIERS*", NIL);
        defparameter("*CYCLIFIER-CATCH-ERRORS?*", T);
        defparameter("*DEFAULT-CYCLIFIER-PARSER-FACTORY*", NEW_STANFORD_PARSER);
        defparameter("*CYCLIFIER-TEST-SENTENCES*", $list246);
        return NIL;
    }

    public static final SubLObject setup_cyclifier_file_alt() {
        classes.subloop_new_class(LF_LITERAL, OBJECT, NIL, NIL, $list_alt3);
        classes.class_set_implements_slot_listeners(LF_LITERAL, NIL);
        classes.subloop_note_class_initialization_function(LF_LITERAL, SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS);
        classes.subloop_note_instance_initialization_function(LF_LITERAL, SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE);
        com.cyc.cycjava.cycl.cyclifier.subloop_reserved_initialize_lf_literal_class(LF_LITERAL);
        methods.methods_incorporate_instance_method(PRINT, LF_LITERAL, $list_alt13, $list_alt14, $list_alt15);
        methods.subloop_register_instance_method(LF_LITERAL, PRINT, LF_LITERAL_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PREDICATE, LF_LITERAL, $list_alt20, NIL, $list_alt21);
        methods.subloop_register_instance_method(LF_LITERAL, GET_PREDICATE, LF_LITERAL_GET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(GET_ARGS, LF_LITERAL, $list_alt20, NIL, $list_alt25);
        methods.subloop_register_instance_method(LF_LITERAL, GET_ARGS, LF_LITERAL_GET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ARG, LF_LITERAL, $list_alt20, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(LF_LITERAL, GET_ARG, LF_LITERAL_GET_ARG_METHOD);
        methods.methods_incorporate_instance_method(GET_REF, LF_LITERAL, $list_alt20, NIL, $list_alt35);
        methods.subloop_register_instance_method(LF_LITERAL, GET_REF, LF_LITERAL_GET_REF_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSE, LF_LITERAL, $list_alt20, NIL, $list_alt38);
        methods.subloop_register_instance_method(LF_LITERAL, GET_PARSE, LF_LITERAL_GET_PARSE_METHOD);
        methods.methods_incorporate_instance_method(UNARY_P, LF_LITERAL, $list_alt20, NIL, $list_alt42);
        methods.subloop_register_instance_method(LF_LITERAL, UNARY_P, LF_LITERAL_UNARY_P_METHOD);
        methods.methods_incorporate_instance_method(BINARY_P, LF_LITERAL, $list_alt20, NIL, $list_alt46);
        methods.subloop_register_instance_method(LF_LITERAL, BINARY_P, LF_LITERAL_BINARY_P_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, PHRASE_TREE, $list_alt13, NIL, $list_alt51);
        methods.subloop_register_instance_method(PHRASE_TREE, LOGICAL_FORM_INT, PHRASE_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(GET_LF_PREDICATE, WORD_TREE, $list_alt13, NIL, $list_alt56);
        methods.subloop_register_instance_method(WORD_TREE, GET_LF_PREDICATE, WORD_TREE_GET_LF_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, VERBAL_WORD_TREE, $list_alt13, NIL, $list_alt73);
        methods.subloop_register_instance_method(VERBAL_WORD_TREE, LOGICAL_FORM_INT, VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, MODIFIER_WORD_TREE, $list_alt13, NIL, $list_alt84);
        methods.subloop_register_instance_method(MODIFIER_WORD_TREE, LOGICAL_FORM_INT, MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, NOMINAL_WORD_TREE, $list_alt13, NIL, $list_alt89);
        methods.subloop_register_instance_method(NOMINAL_WORD_TREE, LOGICAL_FORM_INT, NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list_alt13, NIL, $list_alt94);
        methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, LOGICAL_FORM_INT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, POSSESSIVE_WORD_TREE, $list_alt13, NIL, $list_alt100);
        methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, LOGICAL_FORM_INT, POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM, PARSE_TREE, $list_alt20, $list_alt109, $list_alt110);
        methods.subloop_register_instance_method(PARSE_TREE, LOGICAL_FORM, PARSE_TREE_LOGICAL_FORM_METHOD);
        classes.subloop_new_class(CYCLIFIER, OBJECT, $list_alt123, NIL, $list_alt124);
        classes.class_set_implements_slot_listeners(CYCLIFIER, NIL);
        classes.subloop_note_class_initialization_function(CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS);
        classes.subloop_note_instance_initialization_function(CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE);
        com.cyc.cycjava.cycl.cyclifier.subloop_reserved_initialize_cyclifier_class(CYCLIFIER);
        methods.methods_incorporate_instance_method($sym139$HAS_NEXT_, CYCLIFIER, $list_alt20, NIL, $list_alt140);
        methods.subloop_register_instance_method(CYCLIFIER, $sym139$HAS_NEXT_, $sym148$CYCLIFIER_HAS_NEXT__METHOD);
        methods.methods_incorporate_instance_method(NEXT, CYCLIFIER, $list_alt20, NIL, $list_alt149);
        methods.subloop_register_instance_method(CYCLIFIER, NEXT, CYCLIFIER_NEXT_METHOD);
        methods.methods_incorporate_instance_method(WFF_CHECK, CYCLIFIER, $list_alt13, $list_alt155, $list_alt156);
        methods.subloop_register_instance_method(CYCLIFIER, WFF_CHECK, CYCLIFIER_WFF_CHECK_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_ERROR, CYCLIFIER, $list_alt13, $list_alt168, $list_alt169);
        methods.subloop_register_instance_method(CYCLIFIER, HANDLE_ERROR, CYCLIFIER_HANDLE_ERROR_METHOD);
        register_external_symbol(CYCLIFY);
        register_external_symbol(CYCLIFY_PARSE);
        classes.subloop_new_class(CYCLIFICATION, OBJECT, NIL, NIL, $list_alt200);
        classes.class_set_implements_slot_listeners(CYCLIFICATION, NIL);
        classes.subloop_note_class_initialization_function(CYCLIFICATION, SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS);
        classes.subloop_note_instance_initialization_function(CYCLIFICATION, SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE);
        com.cyc.cycjava.cycl.cyclifier.subloop_reserved_initialize_cyclification_class(CYCLIFICATION);
        methods.methods_incorporate_instance_method(GET_CYCL, CYCLIFICATION, $list_alt20, NIL, $list_alt206);
        methods.subloop_register_instance_method(CYCLIFICATION, GET_CYCL, CYCLIFICATION_GET_CYCL_METHOD);
        methods.methods_incorporate_instance_method(GET_WORD, CYCLIFICATION, $list_alt20, NIL, $list_alt210);
        methods.subloop_register_instance_method(CYCLIFICATION, GET_WORD, CYCLIFICATION_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYCLIFICATION, $list_alt20, NIL, $list_alt214);
        methods.subloop_register_instance_method(CYCLIFICATION, GET_CONFIDENCE, CYCLIFICATION_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(COPY, CYCLIFICATION, $list_alt20, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYCLIFICATION, COPY, CYCLIFICATION_COPY_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYCLIFICATION, $list_alt13, $list_alt14, $list_alt220);
        methods.subloop_register_instance_method(CYCLIFICATION, PRINT, CYCLIFICATION_PRINT_METHOD);
        methods.methods_incorporate_class_method(EL_FORMULA, CYCLIFICATION, $list_alt20, $list_alt225, $list_alt226);
        methods.subloop_register_class_method(CYCLIFICATION, EL_FORMULA, CYCLIFICATION_EL_FORMULA_METHOD);
        methods.methods_incorporate_class_method(FIND, CYCLIFICATION, $list_alt20, $list_alt229, $list_alt230);
        methods.subloop_register_class_method(CYCLIFICATION, FIND, CYCLIFICATION_FIND_METHOD);
        methods.methods_incorporate_class_method(SUBSTITUTE, CYCLIFICATION, $list_alt20, $list_alt233, $list_alt234);
        methods.subloop_register_class_method(CYCLIFICATION, SUBSTITUTE, CYCLIFICATION_SUBSTITUTE_METHOD);
        return NIL;
    }

    public static SubLObject setup_cyclifier_file() {
        if (SubLFiles.USE_V1) {
            classes.subloop_new_class(LF_LITERAL, OBJECT, NIL, NIL, $list3);
            classes.class_set_implements_slot_listeners(LF_LITERAL, NIL);
            classes.subloop_note_class_initialization_function(LF_LITERAL, SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS);
            classes.subloop_note_instance_initialization_function(LF_LITERAL, SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE);
            subloop_reserved_initialize_lf_literal_class(LF_LITERAL);
            methods.methods_incorporate_instance_method(PRINT, LF_LITERAL, $list13, $list14, $list15);
            methods.subloop_register_instance_method(LF_LITERAL, PRINT, LF_LITERAL_PRINT_METHOD);
            methods.methods_incorporate_instance_method(GET_PREDICATE, LF_LITERAL, $list20, NIL, $list21);
            methods.subloop_register_instance_method(LF_LITERAL, GET_PREDICATE, LF_LITERAL_GET_PREDICATE_METHOD);
            methods.methods_incorporate_instance_method(GET_ARGS, LF_LITERAL, $list20, NIL, $list25);
            methods.subloop_register_instance_method(LF_LITERAL, GET_ARGS, LF_LITERAL_GET_ARGS_METHOD);
            methods.methods_incorporate_instance_method(GET_ARG, LF_LITERAL, $list20, $list29, $list30);
            methods.subloop_register_instance_method(LF_LITERAL, GET_ARG, LF_LITERAL_GET_ARG_METHOD);
            methods.methods_incorporate_instance_method(GET_REF, LF_LITERAL, $list20, NIL, $list35);
            methods.subloop_register_instance_method(LF_LITERAL, GET_REF, LF_LITERAL_GET_REF_METHOD);
            methods.methods_incorporate_instance_method(GET_PARSE, LF_LITERAL, $list20, NIL, $list38);
            methods.subloop_register_instance_method(LF_LITERAL, GET_PARSE, LF_LITERAL_GET_PARSE_METHOD);
            methods.methods_incorporate_instance_method(UNARY_P, LF_LITERAL, $list20, NIL, $list42);
            methods.subloop_register_instance_method(LF_LITERAL, UNARY_P, LF_LITERAL_UNARY_P_METHOD);
            methods.methods_incorporate_instance_method(BINARY_P, LF_LITERAL, $list20, NIL, $list46);
            methods.subloop_register_instance_method(LF_LITERAL, BINARY_P, LF_LITERAL_BINARY_P_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, PHRASE_TREE, $list13, NIL, $list51);
            methods.subloop_register_instance_method(PHRASE_TREE, LOGICAL_FORM_INT, PHRASE_TREE_LOGICAL_FORM_INT_METHOD);
            methods.methods_incorporate_instance_method(GET_LF_PREDICATE, WORD_TREE, $list13, NIL, $list56);
            methods.subloop_register_instance_method(WORD_TREE, GET_LF_PREDICATE, WORD_TREE_GET_LF_PREDICATE_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, VERBAL_WORD_TREE, $list13, NIL, $list73);
            methods.subloop_register_instance_method(VERBAL_WORD_TREE, LOGICAL_FORM_INT, VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, MODIFIER_WORD_TREE, $list13, NIL, $list84);
            methods.subloop_register_instance_method(MODIFIER_WORD_TREE, LOGICAL_FORM_INT, MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, NOMINAL_WORD_TREE, $list13, NIL, $list89);
            methods.subloop_register_instance_method(NOMINAL_WORD_TREE, LOGICAL_FORM_INT, NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list13, NIL, $list94);
            methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, LOGICAL_FORM_INT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, POSSESSIVE_WORD_TREE, $list13, NIL, $list100);
            methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, LOGICAL_FORM_INT, POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
            methods.methods_incorporate_instance_method(LOGICAL_FORM, PARSE_TREE, $list20, $list109, $list110);
            methods.subloop_register_instance_method(PARSE_TREE, LOGICAL_FORM, PARSE_TREE_LOGICAL_FORM_METHOD);
            classes.subloop_new_class(CYCLIFIER, OBJECT, $list123, NIL, $list124);
            classes.class_set_implements_slot_listeners(CYCLIFIER, NIL);
            classes.subloop_note_class_initialization_function(CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS);
            classes.subloop_note_instance_initialization_function(CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE);
            subloop_reserved_initialize_cyclifier_class(CYCLIFIER);
            methods.methods_incorporate_instance_method($sym139$HAS_NEXT_, CYCLIFIER, $list20, NIL, $list140);
            methods.subloop_register_instance_method(CYCLIFIER, $sym139$HAS_NEXT_, $sym148$CYCLIFIER_HAS_NEXT__METHOD);
            methods.methods_incorporate_instance_method(NEXT, CYCLIFIER, $list20, NIL, $list149);
            methods.subloop_register_instance_method(CYCLIFIER, NEXT, CYCLIFIER_NEXT_METHOD);
            methods.methods_incorporate_instance_method(WFF_CHECK, CYCLIFIER, $list13, $list155, $list156);
            methods.subloop_register_instance_method(CYCLIFIER, WFF_CHECK, CYCLIFIER_WFF_CHECK_METHOD);
            methods.methods_incorporate_instance_method(HANDLE_ERROR, CYCLIFIER, $list13, $list167, $list168);
            methods.subloop_register_instance_method(CYCLIFIER, HANDLE_ERROR, CYCLIFIER_HANDLE_ERROR_METHOD);
            register_external_symbol(CYCLIFY);
            register_external_symbol(CYCLIFY_PARSE);
            classes.subloop_new_class(CYCLIFICATION, OBJECT, NIL, NIL, $list199);
            classes.class_set_implements_slot_listeners(CYCLIFICATION, NIL);
            classes.subloop_note_class_initialization_function(CYCLIFICATION, SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS);
            classes.subloop_note_instance_initialization_function(CYCLIFICATION, SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE);
            subloop_reserved_initialize_cyclification_class(CYCLIFICATION);
            methods.methods_incorporate_instance_method(GET_CYCL, CYCLIFICATION, $list20, NIL, $list205);
            methods.subloop_register_instance_method(CYCLIFICATION, GET_CYCL, CYCLIFICATION_GET_CYCL_METHOD);
            methods.methods_incorporate_instance_method(GET_WORD, CYCLIFICATION, $list20, NIL, $list209);
            methods.subloop_register_instance_method(CYCLIFICATION, GET_WORD, CYCLIFICATION_GET_WORD_METHOD);
            methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYCLIFICATION, $list20, NIL, $list213);
            methods.subloop_register_instance_method(CYCLIFICATION, GET_CONFIDENCE, CYCLIFICATION_GET_CONFIDENCE_METHOD);
            methods.methods_incorporate_instance_method(COPY, CYCLIFICATION, $list20, NIL, $list217);
            methods.subloop_register_instance_method(CYCLIFICATION, COPY, CYCLIFICATION_COPY_METHOD);
            methods.methods_incorporate_instance_method(PRINT, CYCLIFICATION, $list13, $list14, $list219);
            methods.subloop_register_instance_method(CYCLIFICATION, PRINT, CYCLIFICATION_PRINT_METHOD);
            methods.methods_incorporate_class_method(EL_FORMULA, CYCLIFICATION, $list20, $list224, $list225);
            methods.subloop_register_class_method(CYCLIFICATION, EL_FORMULA, CYCLIFICATION_EL_FORMULA_METHOD);
            methods.methods_incorporate_class_method(FIND, CYCLIFICATION, $list20, $list228, $list229);
            methods.subloop_register_class_method(CYCLIFICATION, FIND, CYCLIFICATION_FIND_METHOD);
            methods.methods_incorporate_class_method(SUBSTITUTE, CYCLIFICATION, $list20, $list232, $list233);
            methods.subloop_register_class_method(CYCLIFICATION, SUBSTITUTE, CYCLIFICATION_SUBSTITUTE_METHOD);
        }
        if (SubLFiles.USE_V2) {
            methods.methods_incorporate_instance_method(HANDLE_ERROR, CYCLIFIER, $list_alt13, $list_alt168, $list_alt169);
            classes.subloop_new_class(CYCLIFICATION, OBJECT, NIL, NIL, $list_alt200);
            methods.methods_incorporate_instance_method(GET_CYCL, CYCLIFICATION, $list_alt20, NIL, $list_alt206);
            methods.methods_incorporate_instance_method(GET_WORD, CYCLIFICATION, $list_alt20, NIL, $list_alt210);
            methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYCLIFICATION, $list_alt20, NIL, $list_alt214);
            methods.methods_incorporate_instance_method(COPY, CYCLIFICATION, $list_alt20, NIL, $list_alt218);
            methods.methods_incorporate_instance_method(PRINT, CYCLIFICATION, $list_alt13, $list_alt14, $list_alt220);
            methods.methods_incorporate_class_method(EL_FORMULA, CYCLIFICATION, $list_alt20, $list_alt225, $list_alt226);
            methods.methods_incorporate_class_method(FIND, CYCLIFICATION, $list_alt20, $list_alt229, $list_alt230);
            methods.methods_incorporate_class_method(SUBSTITUTE, CYCLIFICATION, $list_alt20, $list_alt233, $list_alt234);
        }
        return NIL;
    }

    public static SubLObject setup_cyclifier_file_Previous() {
        classes.subloop_new_class(LF_LITERAL, OBJECT, NIL, NIL, $list3);
        classes.class_set_implements_slot_listeners(LF_LITERAL, NIL);
        classes.subloop_note_class_initialization_function(LF_LITERAL, SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS);
        classes.subloop_note_instance_initialization_function(LF_LITERAL, SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE);
        subloop_reserved_initialize_lf_literal_class(LF_LITERAL);
        methods.methods_incorporate_instance_method(PRINT, LF_LITERAL, $list13, $list14, $list15);
        methods.subloop_register_instance_method(LF_LITERAL, PRINT, LF_LITERAL_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PREDICATE, LF_LITERAL, $list20, NIL, $list21);
        methods.subloop_register_instance_method(LF_LITERAL, GET_PREDICATE, LF_LITERAL_GET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(GET_ARGS, LF_LITERAL, $list20, NIL, $list25);
        methods.subloop_register_instance_method(LF_LITERAL, GET_ARGS, LF_LITERAL_GET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ARG, LF_LITERAL, $list20, $list29, $list30);
        methods.subloop_register_instance_method(LF_LITERAL, GET_ARG, LF_LITERAL_GET_ARG_METHOD);
        methods.methods_incorporate_instance_method(GET_REF, LF_LITERAL, $list20, NIL, $list35);
        methods.subloop_register_instance_method(LF_LITERAL, GET_REF, LF_LITERAL_GET_REF_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSE, LF_LITERAL, $list20, NIL, $list38);
        methods.subloop_register_instance_method(LF_LITERAL, GET_PARSE, LF_LITERAL_GET_PARSE_METHOD);
        methods.methods_incorporate_instance_method(UNARY_P, LF_LITERAL, $list20, NIL, $list42);
        methods.subloop_register_instance_method(LF_LITERAL, UNARY_P, LF_LITERAL_UNARY_P_METHOD);
        methods.methods_incorporate_instance_method(BINARY_P, LF_LITERAL, $list20, NIL, $list46);
        methods.subloop_register_instance_method(LF_LITERAL, BINARY_P, LF_LITERAL_BINARY_P_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, PHRASE_TREE, $list13, NIL, $list51);
        methods.subloop_register_instance_method(PHRASE_TREE, LOGICAL_FORM_INT, PHRASE_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(GET_LF_PREDICATE, WORD_TREE, $list13, NIL, $list56);
        methods.subloop_register_instance_method(WORD_TREE, GET_LF_PREDICATE, WORD_TREE_GET_LF_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, VERBAL_WORD_TREE, $list13, NIL, $list73);
        methods.subloop_register_instance_method(VERBAL_WORD_TREE, LOGICAL_FORM_INT, VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, MODIFIER_WORD_TREE, $list13, NIL, $list84);
        methods.subloop_register_instance_method(MODIFIER_WORD_TREE, LOGICAL_FORM_INT, MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, NOMINAL_WORD_TREE, $list13, NIL, $list89);
        methods.subloop_register_instance_method(NOMINAL_WORD_TREE, LOGICAL_FORM_INT, NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list13, NIL, $list94);
        methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, LOGICAL_FORM_INT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, POSSESSIVE_WORD_TREE, $list13, NIL, $list100);
        methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, LOGICAL_FORM_INT, POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method(LOGICAL_FORM, PARSE_TREE, $list20, $list109, $list110);
        methods.subloop_register_instance_method(PARSE_TREE, LOGICAL_FORM, PARSE_TREE_LOGICAL_FORM_METHOD);
        classes.subloop_new_class(CYCLIFIER, OBJECT, $list123, NIL, $list124);
        classes.class_set_implements_slot_listeners(CYCLIFIER, NIL);
        classes.subloop_note_class_initialization_function(CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS);
        classes.subloop_note_instance_initialization_function(CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE);
        subloop_reserved_initialize_cyclifier_class(CYCLIFIER);
        methods.methods_incorporate_instance_method($sym139$HAS_NEXT_, CYCLIFIER, $list20, NIL, $list140);
        methods.subloop_register_instance_method(CYCLIFIER, $sym139$HAS_NEXT_, $sym148$CYCLIFIER_HAS_NEXT__METHOD);
        methods.methods_incorporate_instance_method(NEXT, CYCLIFIER, $list20, NIL, $list149);
        methods.subloop_register_instance_method(CYCLIFIER, NEXT, CYCLIFIER_NEXT_METHOD);
        methods.methods_incorporate_instance_method(WFF_CHECK, CYCLIFIER, $list13, $list155, $list156);
        methods.subloop_register_instance_method(CYCLIFIER, WFF_CHECK, CYCLIFIER_WFF_CHECK_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_ERROR, CYCLIFIER, $list13, $list167, $list168);
        methods.subloop_register_instance_method(CYCLIFIER, HANDLE_ERROR, CYCLIFIER_HANDLE_ERROR_METHOD);
        register_external_symbol(CYCLIFY);
        register_external_symbol(CYCLIFY_PARSE);
        classes.subloop_new_class(CYCLIFICATION, OBJECT, NIL, NIL, $list199);
        classes.class_set_implements_slot_listeners(CYCLIFICATION, NIL);
        classes.subloop_note_class_initialization_function(CYCLIFICATION, SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS);
        classes.subloop_note_instance_initialization_function(CYCLIFICATION, SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE);
        subloop_reserved_initialize_cyclification_class(CYCLIFICATION);
        methods.methods_incorporate_instance_method(GET_CYCL, CYCLIFICATION, $list20, NIL, $list205);
        methods.subloop_register_instance_method(CYCLIFICATION, GET_CYCL, CYCLIFICATION_GET_CYCL_METHOD);
        methods.methods_incorporate_instance_method(GET_WORD, CYCLIFICATION, $list20, NIL, $list209);
        methods.subloop_register_instance_method(CYCLIFICATION, GET_WORD, CYCLIFICATION_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYCLIFICATION, $list20, NIL, $list213);
        methods.subloop_register_instance_method(CYCLIFICATION, GET_CONFIDENCE, CYCLIFICATION_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(COPY, CYCLIFICATION, $list20, NIL, $list217);
        methods.subloop_register_instance_method(CYCLIFICATION, COPY, CYCLIFICATION_COPY_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYCLIFICATION, $list13, $list14, $list219);
        methods.subloop_register_instance_method(CYCLIFICATION, PRINT, CYCLIFICATION_PRINT_METHOD);
        methods.methods_incorporate_class_method(EL_FORMULA, CYCLIFICATION, $list20, $list224, $list225);
        methods.subloop_register_class_method(CYCLIFICATION, EL_FORMULA, CYCLIFICATION_EL_FORMULA_METHOD);
        methods.methods_incorporate_class_method(FIND, CYCLIFICATION, $list20, $list228, $list229);
        methods.subloop_register_class_method(CYCLIFICATION, FIND, CYCLIFICATION_FIND_METHOD);
        methods.methods_incorporate_class_method(SUBSTITUTE, CYCLIFICATION, $list20, $list232, $list233);
        methods.subloop_register_class_method(CYCLIFICATION, SUBSTITUTE, CYCLIFICATION_SUBSTITUTE_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt100 = list(makeString("@return listp; the logical form of this possessive"), list(makeSymbol("CLET"), list(list(makeSymbol("LF"), NIL), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS"))))), list(makeSymbol("COMP-REFS"), list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))), list(makeSymbol("POSSESSION"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-INDEX"))))))), list(makeSymbol("POSS-REFS"), list(makeSymbol("FWHEN"), makeSymbol("POSSESSION"), list(makeSymbol("FIM"), makeSymbol("POSSESSION"), list(QUOTE, makeSymbol("GET-REFS")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-REF"), makeSymbol("COMP-REFS")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSS-REF"), makeSymbol("POSS-REFS")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LF-LITERAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LF-PREDICATE"))), list(makeSymbol("LIST"), makeSymbol("COMP-REF"), makeSymbol("POSS-REF")), makeSymbol("SELF")), makeSymbol("LF")))), list(RET, makeSymbol("LF"))));

    static private final SubLList $list_alt109 = list(makeSymbol("&OPTIONAL"), makeSymbol("LEXICON"));

    static private final SubLList $list_alt110 = list(makeString("@return listp; the logical form of this parse tree"), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LEXICON"), makeSymbol("ABSTRACT-LEXICON-P")), list(makeSymbol("PWHEN"), makeSymbol("LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-INT")), makeSymbol("LEXICON"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LOGICAL-FORM-INT")))));

    static private final SubLList $list_alt123 = list(makeSymbol("ITERATOR-TEMPLATE"));

    static private final SubLList $list_alt124 = list(new SubLObject[]{ list(makeSymbol("TREE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUBCYCLIFIER-POOL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WFF-CHECK?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RAW-CYCLIFIED?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RAW-CYCLIFICATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SCORE-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTPUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEXT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SCORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MEMOIZATION-STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SBHL-RESOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-NEXT?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WFF-CHECK"), list(makeSymbol("CYCL")), makeKeyword("PROTECTED")) });

    static private final SubLList $list_alt140 = list(makeString("@return boolean; t if there is another valid interpretation, nil otherwise"), list(makeSymbol("PUNLESS"), makeSymbol("RAW-CYCLIFIED?"), list(makeSymbol("CLET"), list(list(makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), NIL), list(makeSymbol("*CYCLIFICATION-COMPLETE*"), NIL), list(makeSymbol("*CYCLIFIERS*"), list(makeSymbol("CONS"), makeSymbol("SELF"), makeSymbol("*CYCLIFIERS*")))), list(makeSymbol("IGNORE"), makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), makeSymbol("*CYCLIFICATION-COMPLETE*"), makeSymbol("*CYCLIFIERS*")), list(makeSymbol("CSETQ"), makeSymbol("RAW-CYCLIFICATIONS"), list(makeSymbol("RANK-CYCLIFICATIONS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("CYCLIFY-INT"))), makeSymbol("SCORE-FUNCTION"))), list(makeSymbol("CSETQ"), makeSymbol("RAW-CYCLIFIED?"), T))), list(makeSymbol("UNTIL"), list(makeSymbol("COR"), makeSymbol("NEXT"), list(makeSymbol("CNOT"), makeSymbol("RAW-CYCLIFICATIONS"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("CAR"), list(makeSymbol("FIRST"), makeSymbol("RAW-CYCLIFICATIONS")))), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), list(makeSymbol("CDR"), list(makeSymbol("FIRST"), makeSymbol("RAW-CYCLIFICATIONS")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("EL-FORMULA")), makeSymbol("NEXT"))), list(makeSymbol("PWHEN"), list(makeSymbol("EL-FORMULA-P"), makeSymbol("NEXT")), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("EL-REMOVE-UNNECESSARY-EXISTENTIALS"), makeSymbol("NEXT"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FOLD-EQUALS"), makeSymbol("NEXT"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("TREE-DELETE"), makeKeyword("SCOPE"), list(makeSymbol("BEAUTIFY-CYCLIFICATION"), makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), makeSymbol("WFF-CHECK?"), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WFF-CHECK")), makeSymbol("NEXT")))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEXT")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("CYCLIFIABLE-QUESTION-P")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), list(makeSymbol("FIRST"), list(makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY"), makeSymbol("NEXT"), reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric")))))), list(makeSymbol("CSETQ"), makeSymbol("RAW-CYCLIFICATIONS"), list(makeSymbol("REST"), makeSymbol("RAW-CYCLIFICATIONS")))), list(RET, list(makeSymbol("BOOLEAN"), makeSymbol("NEXT"))));

    @Override
    public void declareFunctions() {
        declare_cyclifier_file();
    }

    @Override
    public void initializeVariables() {
        init_cyclifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyclifier_file();
    }

    

    static private final SubLList $list_alt149 = list(makeString("@return el-formula-p; the next interpretation of this iterator"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HAS-NEXT?"))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCL"), list(makeSymbol("GET-CYCLIFIER-NEXT"), makeSymbol("SELF"))), list(makeSymbol("S"), list(makeSymbol("GET-CYCLIFIER-SCORE"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), NIL), list(makeSymbol("PCASE"), makeSymbol("OUTPUT"), list(makeKeyword("BRIEF"), list(RET, makeSymbol("CYCL"))), list(makeKeyword("VERBOSE"), list(RET, list(makeSymbol("CONS"), makeSymbol("CYCL"), makeSymbol("S")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Illegal output format ~a"), makeSymbol("OUTPUT")))))));

    static private final SubLString $str_alt153$Illegal_output_format__a = makeString("Illegal output format ~a");

    static private final SubLList $list_alt155 = list(makeSymbol("CYCL"));

    static private final SubLList $list_alt156 = list(list(makeSymbol("CLET"), list(list(makeSymbol("WFF?"), NIL)), list(makeSymbol("WITH-MEMOIZATION-STATE"), list(makeSymbol("MEMOIZATION-STATE")), list(makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE"), makeSymbol("SBHL-RESOURCE"), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("WFF?"), makeSymbol("CYCL")), list(makeSymbol("CYCLIFIER-WFF?"), list(makeSymbol("NART-SUBSTITUTE"), makeSymbol("CYCL")))))), list(RET, list(makeSymbol("FWHEN"), makeSymbol("WFF?"), makeSymbol("CYCL")))));

    static private final SubLString $str_alt158$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt161 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("DataForNLMt"), reader_make_constant_shell("AnytimePSC"));

    static private final SubLString $str_alt165$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt166$____original__S____output_cycl__S = makeString("~%(:original ~S~% :output-cycl ~S~% :wff? ~S :kb ~S)~%");

    static private final SubLList $list_alt168 = list(makeSymbol("ERROR"));

    static private final SubLList $list_alt169 = list(list(makeSymbol("PCASE"), makeSymbol("ERROR-HANDLING"), list(makeKeyword("THROW"), list(makeSymbol("ERROR"), makeSymbol("ERROR"))), list($WARN, list(makeSymbol("WARN"), makeSymbol("ERROR")))));

    static private final SubLSymbol $sym170$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");

    static private final SubLList $list_alt176 = list(reader_make_constant_shell("and"));

    static private final SubLSymbol $sym177$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLList $list_alt179 = list(reader_make_constant_shell("equalSymbols"), reader_make_constant_shell("equals"));

    static private final SubLList $list_alt182 = list(cons(makeKeyword("SUBJECT"), makeSymbol("?SUBJECT")));

    static private final SubLList $list_alt183 = list(makeSymbol("?SUBJECT"));

    static private final SubLList $list_alt186 = list(cons(makeKeyword("OBLIQUE-OBJECT"), makeKeyword("PREP-OBJECT")));

    static private final SubLString $str_alt196$Sentence__ = makeString("Sentence: ");

    static private final SubLString $str_alt199$__ = makeString("??");

    static private final SubLList $list_alt200 = list(new SubLObject[]{ list(makeSymbol("CYCL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WORD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYCL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WORD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("EL-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SCORE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("FIND"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SUBSTITUTE"), NIL, makeKeyword("PROTECTED")) });

    static private final SubLList $list_alt206 = list(makeString("@return el-formula-p; the cycl part of this string semantics"), list(RET, makeSymbol("CYCL")));

    static private final SubLSymbol $sym207$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    static private final SubLList $list_alt210 = list(makeString("@return stringp; the string of this cyclification"), list(RET, makeSymbol("WORD")));

    static private final SubLSymbol $sym211$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    static private final SubLList $list_alt214 = list(makeString("@return non-negative-integerp; the confidence that the lex entry of this cyclification\n   is the intended meaning of its word"), list(RET, makeSymbol("CONFIDENCE")));

    static private final SubLSymbol $sym215$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    static private final SubLList $list_alt218 = list(makeString("@return cyclification-p; a copy of this cyclification"), list(makeSymbol("CLET"), list(list(makeSymbol("COPY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYCLIFICATION"))))), list(makeSymbol("SET-CYCLIFICATION-CYCL"), makeSymbol("COPY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CYCL")))), list(makeSymbol("SET-CYCLIFICATION-WORD"), makeSymbol("COPY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-WORD")))), list(makeSymbol("SET-CYCLIFICATION-CONFIDENCE"), makeSymbol("COPY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))), list(RET, makeSymbol("COPY"))));

    static private final SubLList $list_alt220 = list(makeString("Pretty-prints this word semantics to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<CYCLIFICATION "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("CYCL"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym221$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");

    static private final SubLString $str_alt222$__CYCLIFICATION_ = makeString("#<CYCLIFICATION ");

    static private final SubLString $str_alt223$_ = makeString(">");

    static private final SubLList $list_alt225 = list(makeSymbol("CYCLIFICATION-FORMULA"));

    static private final SubLList $list_alt226 = list(makeString("@return el-formula-p; the el-formula of CYCLIFICATION-FORMULA"), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("CYCLIFICATION-FORMULA")), list(makeSymbol("CDOLIST"), list(makeSymbol("E"), makeSymbol("CYCLIFICATION-FORMULA")), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("EL-FORMULA")), makeSymbol("E")), makeSymbol("RESULT")))), list(list(makeSymbol("CYCLIFICATION-P"), makeSymbol("CYCLIFICATION-FORMULA")), list(RET, list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("EL-FORMULA")), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION-FORMULA"), list(QUOTE, makeSymbol("GET-CYCL")))))), list(T, list(RET, makeSymbol("CYCLIFICATION-FORMULA")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("RESULT")))));

    static private final SubLList $list_alt229 = list(makeSymbol("CYCLIFICATION"), makeSymbol("ITEM"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)));

    static private final SubLList $list_alt230 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("CSOME"), list(makeSymbol("E"), makeSymbol("CYCLIFICATION"), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("FIND")), makeSymbol("E"), makeSymbol("ITEM"), makeSymbol("TEST")))), list(RET, makeSymbol("RESULT")))), list(list(makeSymbol("CYCLIFICATION-P"), makeSymbol("CYCLIFICATION")), list(RET, list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("FIND")), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-CYCL"))), makeSymbol("ITEM"), makeSymbol("TEST")))), list(T, list(RET, list(makeSymbol("FUNCALL"), makeSymbol("TEST"), makeSymbol("CYCLIFICATION"), makeSymbol("ITEM"))))));

    static private final SubLList $list_alt233 = list(makeSymbol("CYCLIFICATION"), makeSymbol("NEW"), makeSymbol("OLD"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(QUOTE, EQL)));

    static private final SubLList $list_alt234 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LIST"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("E"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("SUBSTITUTE")), makeSymbol("E"), makeSymbol("NEW"), makeSymbol("OLD")), makeSymbol("NEW-LIST"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("NEW-LIST"))))), list(list(makeSymbol("CYCLIFICATION-P"), makeSymbol("CYCLIFICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYCLIFICATION"))))), list(makeSymbol("SET-CYCLIFICATION-CYCL"), makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CYCLIFICATION")), list(QUOTE, makeSymbol("SUBSTITUTE")), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-CYCL"))), makeSymbol("NEW"), makeSymbol("OLD"))), list(makeSymbol("SET-CYCLIFICATION-WORD"), makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-WORD")))), list(makeSymbol("SET-CYCLIFICATION-CONFIDENCE"), makeSymbol("NEW-CYCLIFICATION"), list(makeSymbol("FIM"), makeSymbol("CYCLIFICATION"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))), list(RET, makeSymbol("NEW-CYCLIFICATION")))), list(T, list(RET, list(makeSymbol("FIF"), list(makeSymbol("FUNCALL"), makeSymbol("TEST"), makeSymbol("CYCLIFICATION"), makeSymbol("OLD")), makeSymbol("NEW"), makeSymbol("CYCLIFICATION"))))));

    static private final SubLString $str_alt236$illegal_cyclification__a = makeString("illegal cyclification ~a");

    static private final SubLString $str_alt238$Illegal_cyclification__a = makeString("Illegal cyclification ~a");

    static private final SubLSymbol $sym240$_ = makeSymbol(">");

    static private final SubLSymbol $sym242$_ = makeSymbol("<");

    static private final SubLList $list_alt247 = list(new SubLObject[]{ makeString("What is the involvement of the armed forces in the chemical weapons process in Lybia?"), makeString("Who is Prime Minister?"), makeString("Has India used Chemical Weapons?"), makeString("Has India used Biological Weapons?"), makeString("What type of government does Lybia have?"), makeString("Who is Lybia?"), makeString("What is the population of Lybia?"), makeString("What are the major areas of economic growth in Lybia?"), makeString("What is Lybia's growth domestic product?"), makeString("Has Lybia used Chemical Weapons?"), makeString("Does Libya have access to chemical weapons research?"), makeString("Has Libya stockpiled chemical weapons?"), makeString("Has Libya used Chemical weapons?"), makeString("has Libya stored chemical weapons?"), makeString("Who are Iran's Chemical Weapons Scientists?"), makeString("what is the distance from Tehran to Baghdad?"), makeString("how far is Iran from Iraq?"), makeString("Where are Pakistan's chemical weapons?"), makeString("What are Pakistan delivery systems?"), makeString("Who are Pakistans scientists?"), makeString("Where are Pakistan's chemical facilities?"), makeString("Where are Pakistan's chemical plants?"), makeString("What chemicals does Pakistan have?"), makeString("Where are Pakistan's pesticide plants?"), makeString("Which scientists are involved in Russia's chemcial weapons program?"), makeString("What Russian weapons systems are capable of delivering chemical weapons?"), makeString("Which countries has Russia assisted in chemical weapons?"), makeString("What Russian NBC weapons facilities store what types of materials?"), makeString("Who are Russia's chemical scientists?"), makeString("What chemical weapons does Russia have?"), makeString("What happened to South Africa's chemical weapons scientists?"), makeString("What are the current and future development of chemicals in South Africa?"), makeString("Tell me about Egypt's biological weapons program."), makeString("Does Egypt possess old technology for biological weapons?") });

    static private final SubLString $str_alt248$sentence___S__ = makeString("sentence: ~S~%");

    static private final SubLSymbol $sym251$INSTANCEFN_NAT_ = makeSymbol("INSTANCEFN-NAT?");
}

/**
 * Total time: 1299 ms synthetic
 */
