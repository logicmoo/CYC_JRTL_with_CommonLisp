/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$term_functional_complexity_cutoff$;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityL;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.referenced_variables;
import static com.cyc.cycjava.cycl.list_utilities.caddr;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.tree_find_if;
import static com.cyc.cycjava.cycl.list_utilities.tree_gather;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WFF-MODULES
 * source file: /cyc/top/cycl/wff-modules.lisp
 * created:     2019/07/03 17:37:29
 */
public final class wff_modules extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt17$ = makeString("");

    public static final SubLFile me = new wff_modules();



    // deflexical
    @LispMethod(comment = "should experimental support for suggesting fixes for wff violations be used?\ndeflexical")
    private static final SubLSymbol $use_experimental_wff_suggestionsP$ = makeSymbol("*USE-EXPERIMENTAL-WFF-SUGGESTIONS?*");

    static private final SubLList $list1 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-VARIABLES"), makeKeyword("COMMENT"), makeString("The sentence has at least one variable which is not a valid variable name."));

    private static final SubLList $list2 = list(makeSymbol("VARIABLES"), makeSymbol("SENTENCE"));

    static private final SubLString $str4$Sentence__s_contains_invalid_vari = makeString("Sentence ~s contains invalid variable~P: ~a ~% which do~[~;es~:;~] not satisfy the regular expression ~a~%");

    static private final SubLString $str6$__ = makeString(", ");

    static private final SubLString $str7$__and_ = makeString(", and ");





    static private final SubLList $list11 = list(reader_make_constant_shell("CycLVariable"));

    static private final SubLList $list14 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-SENTENCE"), makeKeyword("COMMENT"), makeString("Not a well-formed sentence."));

    private static final SubLList $list15 = list(makeSymbol("SENTENCE"), makeSymbol("MT"));

    private static final SubLString $str16$_s_is_not_a_well_formed_sentence_ = makeString("~s is not a well-formed sentence in ~s.~%");

    private static final SubLString $str17$Perhaps__s_is_insufficiently_defi = makeString("Perhaps ~s is insufficiently defined in mt ~s.~%");

    private static final SubLString $str18$ = makeString("");

    private static final SubLString $str19$_s_is_not_a_well_formed_sentence_ = makeString("~s is not a well-formed sentence.~%");

    private static final SubLString $str20$Perhaps__s_is_insufficiently_defi = makeString("Perhaps ~s is insufficiently defined.~%");







    private static final SubLSymbol $NOT_AN_ASCII_STRING = makeKeyword("NOT-AN-ASCII-STRING");

    static private final SubLList $list25 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-AN-ASCII-STRING"), makeKeyword("COMMENT"), makeString("The sentence references a non-ASCII string."));

    private static final SubLList $list26 = list(makeSymbol("STRING"));

    private static final SubLString $str27$String__s_contains_non_ASCII_char = makeString("String ~s contains non-ASCII characters.~%");

    private static final SubLList $list29 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-FORTS"), makeKeyword("COMMENT"), makeString("The sentence references invalid (undefined) Forts."));

    private static final SubLString $str30$References_invalid_forts___a___ = makeString("References invalid forts: ~a.~%");

    static private final SubLList $list32 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-FORT"), makeKeyword("COMMENT"), makeString("The sentence references an invalid (undefined) Fort."));

    private static final SubLList $list33 = list(makeSymbol("FORT"));

    private static final SubLString $str34$FORT__s_is_invalid___ = makeString("FORT ~s is invalid.~%");

    static private final SubLList $list36 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARITY"), makeKeyword("COMMENT"), makeString("The arity of a predicate is a Non-Negative Integer."));

    private static final SubLList $list37 = listS(makeSymbol("ARITY-PRED"), makeSymbol("RELATION"), makeSymbol("ARITY"), makeSymbol("DATA"));

    private static final SubLString $str38$The__s_of__s_should_be_a___NonNeg = makeString("The ~s of ~s should be a #$NonNegativeInteger is ~s.~%");



    private static final SubLList $list40 = list(reader_make_constant_shell("NonNegativeInteger"));

    static private final SubLList $list42 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-ARITY-MISMATCH"), makeKeyword("COMMENT"), makeString("The number of arguments applied to the relation in the sentence was different than the number of arguments it expected"));

    private static final SubLList $list43 = listS(makeSymbol("SENTENCE"), makeSymbol("RELATION"), makeSymbol("DESCRIPTION"), makeSymbol("EXPECTED-ARGNUM"), makeSymbol("GIVEN-ARGNUM"), makeSymbol("DATA"));

    private static final SubLString $str44$Arity_mismatch_in__A___A_is_a_n__ = makeString("Arity mismatch in ~A: ~A is a(n) ~A, so it expects ~D argument~:P, but it is being applied to ~D argument~:P.~%");

    static private final SubLList $list46 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-VIOLATED-ARITY"), makeKeyword("COMMENT"), makeString("The sentence contains use of a predicate which does not conform to the arity of the relation."));

    private static final SubLList $list47 = listS(makeSymbol("ARITY-PRED"), makeSymbol("RELATION"), makeSymbol("ARITY"), makeSymbol("SENTENCE"), makeSymbol("DATA"));

    private static final SubLString $str48$The__s_of__s_is__s___ = makeString("The ~s of ~s is ~s.~%");













    private static final SubLList $list56 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MISSING-ARITY"), makeKeyword("COMMENT"), makeString("The sentence uses a relation whose arity has not yet been defined."));

    private static final SubLList $list57 = listS(makeSymbol("RELATION"), makeSymbol("ARITY"), makeSymbol("SENTENCE"), makeSymbol("DATA"));

    private static final SubLString $str58$The_arity_of__s_is_unknown___ = makeString("The arity of ~s is unknown.~%");

    private static final SubLList $list60 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MALFORMED-ARGS"), makeKeyword("COMMENT"), makeString("The relation got malformed argument list"));

    private static final SubLList $list61 = list(makeSymbol("DESCRIPTION"), makeSymbol("RELATION"), makeSymbol("ARGS"));

    private static final SubLString $str62$The__A__A_got_the_malformed_argum = makeString("The ~A ~A got the malformed argument list ~%~A.~%");

    private static final SubLSymbol $NOT_A_DENOTATIONAL_TERM = makeKeyword("NOT-A-DENOTATIONAL-TERM");

    private static final SubLList $list64 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-A-DENOTATIONAL-TERM"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is not a denotational term"));

    private static final SubLString $str65$_A_is_not_a_denotational_term___ = makeString("~A is not a denotational term.~%");

    private static final SubLSymbol $NOT_A_TRUTH_FUNCTION = makeKeyword("NOT-A-TRUTH-FUNCTION");

    private static final SubLList $list67 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-A-TRUTH-FUNCTION"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is not a truth function in its arg0 position"));

    private static final SubLString $str68$Did_not_recognize__A_as_a_truth_f = makeString("Did not recognize ~A as a truth function (predicate, quantifier, or logical operator).~%");

    private static final SubLSymbol $NOT_AN_EL_FORMULA = makeKeyword("NOT-AN-EL-FORMULA");

    private static final SubLList $list70 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-AN-EL-FORMULA"), makeKeyword("COMMENT"), makeString("The formula given was not a EL formula"));

    private static final SubLString $str71$_A_is_not_an_EL_formula__and_is_n = makeString("~A is not an EL formula, and is not #$True, #$False, or an EL variable.~%");

    private static final SubLSymbol $NOT_AN_EL_VARIABLE = makeKeyword("NOT-AN-EL-VARIABLE");

    private static final SubLList $list73 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-AN-EL-VARIABLE"), makeKeyword("COMMENT"), makeString("The sentence does not contain an EL variable where an EL variable is expected"));

    private static final SubLString $str74$_A_is_not_an_EL_variable___ = makeString("~A is not an EL variable.~%");

    private static final SubLSymbol $NOT_A_LIST_OF_VARIABLES = makeKeyword("NOT-A-LIST-OF-VARIABLES");

    private static final SubLList $list76 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-A-LIST-OF-VARIABLES"), makeKeyword("COMMENT"), makeString("The sentence does not contain a list of EL variable where such a list is expected"));

    private static final SubLString $str77$_A_is_not_a_list_of_EL_variables_ = makeString("~A is not a list of EL variables.~%");

    private static final SubLSymbol $SEQUENCE_NON_VAR = makeKeyword("SEQUENCE-NON-VAR");

    static private final SubLList $list79 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-SEQUENCE-NON-VAR"), makeKeyword("COMMENT"), makeString("The formula contains an ill-formed sequence variable syntax"));

    private static final SubLList $list80 = list(makeSymbol("FORMULA"), makeSymbol("TERM"));

    private static final SubLString $str81$_A_contains_ill_formed_sequence_v = makeString("~A contains ill-formed sequence variable syntax; ~A is not a variable.~%");

    private static final SubLSymbol $EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1 = makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");

    private static final SubLList $list83 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1"), makeKeyword("COMMENT"), makeString("The sentence has (#$ExpandSubLFn SUBL-LIST-CONTAINING-NON-VARIABLE SUBL) where SUBL does not mention the non-variables in SUBL-LIST-CONTAINING-NON-VARIABLE."));

    static private final SubLList $list84 = list(makeSymbol("VIOLATING-NON-VARIABLES"), makeSymbol("SENTENCE"), makeSymbol("EXPAND-SUBL-FN"));

    private static final SubLString $str85$Sentence__s___has___ExpandSubLFn_ = makeString("Sentence ~s ~%has #$ExpandSubLFn formula ~s, ~%which contains the term~P ~a in arg1 ~s ~%not mentioned in its arg2 ~s.~%");



    private static final SubLSymbol TREE_FIND = makeSymbol("TREE-FIND");

    private static final SubLList $list89 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-MT"), makeKeyword("COMMENT"), makeString("The Mt specified for the sentence is not a #$Microtheory."));

    private static final SubLString $str90$Mt__s_is_invalid___ = makeString("Mt ~s is invalid.~%");

    private static final SubLSymbol $MAL_FN_NESTING = makeKeyword("MAL-FN-NESTING");

    private static final SubLList $list92 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-FUNCTION-NESTING"), makeKeyword("COMMENT"), makeString("The sentence contains a function term whose nesting levels exceeds the allowed limit."));

    private static final SubLString $str93$Term__s_______has__s_nesting_leve = makeString("Term ~s~%     has ~s nesting levels but only ~s are permitted.~%");

    private static final SubLSymbol $MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");

    private static final SubLList $list95 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-IFF-DEFNS"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$defnIff of some collection."));

    private static final SubLList $list96 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("PSN"), makeSymbol("COL"), makeSymbol("DEFNS"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLSymbol $VIA_GENL_PRED = makeKeyword("VIA-GENL-PRED");

    private static final SubLSymbol $VIA_GENL_INVERSE = makeKeyword("VIA-GENL-INVERSE");

    private static final SubLString $str99$Term__s__violates__s__s__of_colle = makeString("Term ~s~%violates ~s ~s~%of collection ~s~%");

    private static final SubLString $str100$applicable_to_arg__s_of__s__ = makeString("applicable to arg ~s of ~s~%");

    private static final SubLString $str101$_via__s___ = makeString("(via ~s)~%");

    private static final SubLString $str102$in_mt__s___ = makeString("in mt ~s.~%");









    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_IFF_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");

    private static final SubLList $list111 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$quotedDefnIff of some collection."));



    private static final SubLSymbol $MAL_ARG_WRT_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-SUF-DEFNS");

    private static final SubLList $list114 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-SUF-DEFNS"), makeKeyword("COMMENT"), makeString("The formula contains a term which violates #$defnSufficient of some Collection."));



    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");

    static private final SubLList $list117 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS"), makeKeyword("COMMENT"), makeString("The formula contains a term which violates #$quotedDefnSufficient of some Collection."));



    private static final SubLSymbol $MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");

    static private final SubLList $list120 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-NEC-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$defnNecessary of some Collection."));

    static private final SubLList $list121 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("PSN"), makeSymbol("COL"), makeSymbol("DEFN-COL"), makeSymbol("DEFN"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLString $str122$Term__s__violates__s__s___s___of_ = makeString("Term ~s~%violates ~s ~s (~s)~%of collection ~s~%");



    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_NEC_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");

    private static final SubLList $list125 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$quotedDefnNecessary of some Collection."));



    private static final SubLSymbol $MAL_ARG_WRT_COL_DEFN = makeKeyword("MAL-ARG-WRT-COL-DEFN");

    private static final SubLList $list128 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-COL-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates defns of argIsa to some Collection."));

    private static final SubLList $list129 = listS(makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA"));

    private static final SubLString $str130$Term__s_violates_defns_of__a__s__ = makeString("Term ~s violates defns of ~a ~s~%");

    private static final SubLString $str131$applicable_to_argument__s_of_rela = makeString("applicable to argument ~s of relation ~s~%");



    private static final SubLSymbol $MAL_ARG_WRT_COL_QUOTED_DEFN = makeKeyword("MAL-ARG-WRT-COL-QUOTED-DEFN");

    private static final SubLList $list134 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates quoted-defns of argQuotedIsa to some Collection."));

    private static final SubLSymbol $ARG_QUOTED_ISA = makeKeyword("ARG-QUOTED-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_ISA = makeKeyword("MAL-ARG-WRT-ARG-ISA");

    private static final SubLList $list137 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates argIsa constraint."));

    private static final SubLString $str138$arg_isa = makeString("arg-isa");

    private static final SubLSymbol $ARG_NOT_ISA = makeKeyword("ARG-NOT-ISA");

    private static final SubLString $str140$arg_not_isa = makeString("arg-not-isa");

    private static final SubLString $str141$arg_quoted_isa = makeString("arg-quoted-isa");

    private static final SubLString $str143$arg_genls = makeString("arg-genls");

    private static final SubLString $str144$isa_disjoint = makeString("isa-disjoint");

    private static final SubLString $str145$quoted_isa_disjoint = makeString("quoted-isa-disjoint");

    private static final SubLString $$$disjoint = makeString("disjoint");





    private static final SubLList $list149 = listS(makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA"));

    private static final SubLString $str150$Term__s_violates__a__s__ = makeString("Term ~s violates ~a ~s~%");

    private static final SubLList $list151 = list(makeKeyword("ARG-ISA"), makeKeyword("ARG-GENLS"));

    private static final SubLString $str152$Term__s_is__a_with__a__s__ = makeString("Term ~s is ~a with ~a ~s~%");

    private static final SubLString $str153$___ = makeString(".~%");

    private static final SubLSymbol $NL_TERM_MAP = makeKeyword("NL-TERM-MAP");







    static private final SubLList $list158 = list(reader_make_constant_shell("SpecsFn"), NIL);

    private static final SubLList $list159 = list(reader_make_constant_shell("SymbolPhraseFn"), reader_make_constant_shell("Comma-TheSymbol"));

    private static final SubLList $list160 = list(reader_make_constant_shell("PhraseFromStringFn"), makeString("but is"));



    static private final SubLList $list162 = list(reader_make_constant_shell("PhraseFromStringFn"), makeString("must be"));

    private static final SubLObject $$Np_DetNbarFn_Indefinite = reader_make_constant_shell("Np-DetNbarFn-Indefinite");

    static private final SubLList $list165 = list(reader_make_constant_shell("PhraseFromStringFn"), makeString("a specialization of"));

    private static final SubLList $list166 = listS(makeSymbol("WFF-MODULE"), new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLString $str167$Term__s_violates_arg_isa__s__ = makeString("Term ~s violates arg-isa ~s~%");

    private static final SubLSymbol $AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");





    private static final SubLSymbol $MAL_ARG_WRT_ARG_QUOTED_ISA = makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");

    static private final SubLList $list179 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates argQuotedIsa constraint."));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_GENL = makeKeyword("MAL-ARG-WRT-ARG-GENL");

    private static final SubLList $list181 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates a argGenl constraint."));



    private static final SubLString $str183$Term__s_violates_arg_genls__s__ = makeString("Term ~s violates arg-genls ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_ISA = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA");

    static private final SubLList $list185 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is an instance of a collection specified to be an argNotIsa."));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");

    private static final SubLList $list187 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is disjoint with the argIsa constraint."));

    private static final SubLString $str188$Term__s_is_isa_disjoint_with_arg_ = makeString("Term ~s is isa-disjoint with arg-isa ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");

    private static final SubLList $list190 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is disjoint with the argQuotedIsa constraint."));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");

    private static final SubLList $list192 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT..) which is disjoint with the argGenl contraint."));



    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");

    static private final SubLList $list195 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is violates interArgIsa constraints."));

    private static final SubLList $list196 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLString $str197$Term__s_violates_inter_arg_isa__s = makeString("Term ~s violates inter-arg-isa ~s~%");

    private static final SubLString $str198$when_argument__s___s__isa__s__ = makeString("when argument ~s, ~s, isa ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");

    private static final SubLList $list200 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is violates interArgNotIsa constraints."));

    private static final SubLString $str201$Term__s_violates_inter_arg_not_is = makeString("Term ~s violates inter-arg-not-isa ~s~%");

    private static final SubLString $str202$when_argument__s___s__not_isa__s_ = makeString("when argument ~s, ~s, not isa ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");

    private static final SubLList $list204 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates interArgGenl constraints."));

    private static final SubLList $list205 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-GENL"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLString $str206$Term__s_violates_inter_arg_genl__ = makeString("Term ~s violates inter-arg-genl ~s~%");

    private static final SubLString $str207$when_argument__s___s__genl__s__ = makeString("when argument ~s, ~s, genl ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_DEFN = makeKeyword("MAL-ARG-WRT-INTER-ARG-DEFN");

    private static final SubLList $list209 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLList $list210 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLString $str211$Term__s_violates_defns_of_inter_a = makeString("Term ~s violates defns of inter-arg-isa ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_DEFN = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-DEFN");

    private static final SubLList $list213 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str214$Term__s_violates_defns_of_inter_a = makeString("Term ~s violates defns of inter-arg-not-isa ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");

    private static final SubLList $list216 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT..) which is disjoint with the interArgIsa constraint."));

    private static final SubLString $str217$Term__s_is_isa_disjoint_with_inte = makeString("Term ~s is isa-disjoint with inter-arg-isa ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");

    private static final SubLList $list219 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT...) which is disjoint with the interArgGenl constraint."));

    private static final SubLList $list220 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-GENL"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLString $str221$Term__s_is_genl_disjoint_with_int = makeString("Term ~s is genl-disjoint with inter-arg-genl ~s~%");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA-GENL");

    private static final SubLList $list223 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT...) which violates the interArgIsaGenl constraint."));

    private static final SubLString $str224$Term__s_is_not_a_spec_of__s__viol = makeString("Term ~s is not a spec of ~s, violating inter-arg-isa-genl constraint~%");



    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_GENL_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL-ISA");

    private static final SubLList $list227 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT...) which violates the interArgGenlIsa constraint."));

    private static final SubLString $str228$Term__s_is_not_an_instance_of__s_ = makeString("Term ~s is not an instance of ~s, violating inter-arg-genl-isa constraint~%");

    private static final SubLString $str229$when_argument__s___s__genls__s__ = makeString("when argument ~s, ~s, genls ~s~%");



    private static final SubLSymbol $MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");

    static private final SubLList $list232 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-FORMAT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates argFormat constraint."));

    static private final SubLList $list233 = list(makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));

    private static final SubLString $str234$Term__s_violates_arg_format__s__ = makeString("Term ~s violates arg-format ~s~%");

    private static final SubLString $str235$__applicable_to_argument__s_of_re = makeString("  applicable to argument ~s of relation ~s~%");

    private static final SubLString $str236$___via__s___ = makeString("  (via ~s)~%");

    private static final SubLString $str237$__in_mt__s___ = makeString("  in mt ~s.~%");

    private static final SubLString $str238$______In_conflict__a_________a__ = makeString("  ~%  In conflict ~a: ~%    ~a~%");

    private static final SubLString $$$are = makeString("are");

    private static final SubLString $$$is = makeString("is");

    private static final SubLSymbol ASSERTION_FI_IST_FORMULA = makeSymbol("ASSERTION-FI-IST-FORMULA");

    private static final SubLString $str242$________ = makeString(", ~%    ");

    private static final SubLString $str243$__and_______ = makeString(", and ~%    ");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");

    private static final SubLList $list245 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates interArgFormat constraint."));

    private static final SubLList $list246 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLString $str247$Term__s_violates_inter_arg_format = makeString("Term ~s violates inter-arg-format ~s~%");

    private static final SubLString $str248$__when_argument__s___s__isa__s__ = makeString("  when argument ~s, ~s, isa ~s~%");

    private static final SubLString $str249$______In_conflict__a_________a = makeString("  ~%  In conflict ~a: ~%    ~a");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_DIFFERENT = makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");

    private static final SubLList $list251 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates interArgDifferent constraint."));

    static private final SubLList $list252 = list(makeSymbol("RELN"), makeSymbol("ARG1"), makeSymbol("PSN1"), makeSymbol("ARG2"), makeSymbol("PSN2"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));

    private static final SubLString $str253$Terms__s_and__s_are_equal__which_ = makeString("Terms ~s and ~s are equal, which violates the inter-arg-different constraint~%");

    private static final SubLString $str254$applicable_to_arguments__s_and__s = makeString("applicable to arguments ~s and ~s of relation ~s~%");





    private static final SubLSymbol $MAL_RELN_WRT_ARG_ISA_REQUIRED = makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");

    private static final SubLList $list258 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED"), makeKeyword("COMMENT"), makeString("The sentence contains a predicate for which argIsa is not defined when argIsa's are strictly required on a predicate before using it."));

    private static final SubLList $list259 = list(makeSymbol("RELATION"), makeSymbol("ARGNUM"), makeSymbol("MT"));

    private static final SubLString $str260$argument__s_of__s_has_no___argIsa = makeString("argument ~s of ~s has no #$argIsa constraint in mt ~s.~%");



    private static final SubLSymbol $sym262$_COL = makeSymbol("?COL");



    static private final SubLList $list264 = list(makeSymbol("?ARGNUM"), makeSymbol("?COL"));

    private static final SubLSymbol $CONFLICT_ASSERTING_TRUE_SBHL = makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");

    private static final SubLList $list266 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL"), makeKeyword("COMMENT"), makeString("The sentence contains sentences which violate the current sbhl information."));

    static private final SubLList $list267 = list(makeSymbol("ASENT"), makeSymbol("MT"));

    private static final SubLString $str268$sbhl_conflict___s__a__a________be = makeString("sbhl conflict: ~s ~a ~a~%      because: ~a~%");

    private static final SubLSymbol STRINGIFY_ITEMS = makeSymbol("STRINGIFY-ITEMS");

    private static final SubLString $str271$_________________ = makeString("               ~%");

    private static final SubLString $str272$_s_is_known_not_to_be__a__s_in_mt = makeString("~s is known not to be ~a ~s in mt ~s.  ~%~a~%");

    private static final SubLString $$$related_to = makeString("related to");

    private static final SubLString $$$an_instance_of = makeString("an instance of");

    private static final SubLString $$$a_spec_of = makeString("a spec of");



    private static final SubLString $$$a_spec_mt_of = makeString("a spec mt of");

    private static final SubLString $$$a_spec_pred_of = makeString("a spec pred of");

    private static final SubLString $$$a_spec_inverse_of = makeString("a spec inverse of");

    private static final SubLSymbol $CONFLICT_ASSERTING_FALSE_SBHL = makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");

    private static final SubLList $list281 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL"), makeKeyword("COMMENT"), makeString("The sentence contain sentences which negate the current sbhl information."));

    private static final SubLString $str282$sbhl_conflict___s__a__a________be = makeString("sbhl conflict: ~s ~a ~a~%      because: ~a ~%");

    private static final SubLString $str284$_s_is_known_to_be__a__s_in_mt__s_ = makeString("~s is known to be ~a ~s in mt ~s.  ~%~a~%");

    private static final SubLSymbol $DISJOINT_ARG_ISA = makeKeyword("DISJOINT-ARG-ISA");

    static private final SubLList $list286 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJOINTED-ARG-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is said to be #$isa of disjoint collections."));

    private static final SubLList $list287 = listS(makeSymbol("VAR"), makeSymbol("DISJOINT"), makeSymbol("MT"), makeSymbol("DATA"));

    private static final SubLString $str288$Variable__s_is_subject_to_disjoin = makeString("Variable ~s is subject to disjoint ~%isa constraints ~s in mt ~s.~%");



    private static final SubLSymbol $WFF_EXPANSION_FORMULA = makeKeyword("WFF-EXPANSION-FORMULA");

    private static final SubLSymbol $WFF_ORIGINAL_FORMULA = makeKeyword("WFF-ORIGINAL-FORMULA");

    private static final SubLString $str292$__Original_formula______s = makeString("~%Original formula: ~% ~s");

    private static final SubLString $str293$__Expansion_formula______s = makeString("~%Expansion formula: ~% ~s");

    private static final SubLString $str294$__WFF_checked_formula______s = makeString("~%WFF checked formula: ~% ~s");

    private static final SubLSymbol $DISJOINT_ARG_QUOTED_ISA = makeKeyword("DISJOINT-ARG-QUOTED-ISA");

    private static final SubLList $list296 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJOINTED-ARG-QUOTED-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is said to be #$quotedIsa of disjoint collections."));

    private static final SubLSymbol $DISJOINT_ARG_GENL = makeKeyword("DISJOINT-ARG-GENL");

    private static final SubLList $list298 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJOINTED-ARG-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is said to be #$genls of disjoint collections."));

    private static final SubLString $str299$Variable__s_is_subject_to_disjoin = makeString("Variable ~s is subject to disjoint ~%genl constraints ~s in mt ~s.~%");

    private static final SubLList $list301 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-ISOLATED-TERMS"), makeKeyword("COMMENT"), makeString("The sentence contains terms which are isolated when strict coherence is enforced."));

    private static final SubLList $list302 = list(makeSymbol("SENTENCE"), makeSymbol("TERMS"));

    private static final SubLString $str303$__s_is_an_isolated_term_in___s___ = makeString(" ~s is an isolated term in~%~s.~%");

    private static final SubLString $str304$__s__are_isolated_terms_in___s___ = makeString(" ~s~%are isolated terms in~%~s.~%");

    private static final SubLSymbol STR_BY_TYPE = makeSymbol("STR-BY-TYPE");

    static private final SubLList $list307 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-IRRELEVANT-LITERALS"), makeKeyword("COMMENT"), makeString("The sentence contains literals which become irrelevant when strict coherence is enforced. (Normally simplifier takes care of such cases and reduces them.  This violation will be generated in the above case only when simplifier is turned off and coherence checking is done.)."));

    static private final SubLList $list308 = list(makeSymbol("SENTENCE"), makeSymbol("IRRELEVANT"));

    private static final SubLString $str309$__s_is_irrelevant_in___s___ = makeString(" ~s is irrelevant in~%~s.~%");

    private static final SubLString $str310$__s__are_irrelevant_in___s___ = makeString(" ~s~%are irrelevant in~%~s.~%");

    private static final SubLSymbol $RESTRICTED_SKOLEM_ASSERTION = makeKeyword("RESTRICTED-SKOLEM-ASSERTION");

    private static final SubLList $list312 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-SKOLEM-ASSERTION"), makeKeyword("COMMENT"), makeString("The sentence attempts to state more about a skolem function, which is not allowed."));

    private static final SubLSymbol $sym313$REIFIED_SKOLEM_FN_IN_ANY_MT_ = makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?");

    private static final SubLString $str314$Asserting_a_sentence_that_referen = makeString("Asserting a sentence that references a skolem (e.g., ~s) ~%in a literal with predicate ~s is prohibited.~%");

    private static final SubLSymbol $RESTRICTED_PREDICATE_ASSERTION = makeKeyword("RESTRICTED-PREDICATE-ASSERTION");

    private static final SubLList $list316 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-PREDICATE-ASSERTION"), makeKeyword("COMMENT"), makeString("The sentence attempts to assert a literal with a predicate which is #$notAssertible."));

    private static final SubLString $str317$Asserting_a_literal_with_predicat = makeString("Asserting a literal with predicate ~s is prohibited in mt ~s.~%");



    private static final SubLSymbol $RESTRICTED_COLLECTION_ASSERTION = makeKeyword("RESTRICTED-COLLECTION-ASSERTION");

    private static final SubLList $list320 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-COLLECTION-ASSERTION"), makeKeyword("COMMENT"), makeString("The sentence attempts to assert members for a collection which is #$notAssertibleCollection."));

    private static final SubLString $str321$Asserting_an___isa_literal_with_c = makeString("Asserting an #$isa literal with collection ~s is prohibited in mt ~s.~%");



    private static final SubLSymbol $EVALUATABLE_LITERAL_FALSE = makeKeyword("EVALUATABLE-LITERAL-FALSE");

    private static final SubLList $list324 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EVALUATABLE-LITERAL-FALSE"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str325$Asserting_a_sentence_in_mt__s____ = makeString("Asserting a sentence in mt ~s ~%  that references a false evaluatable literal: ~%  ~s ~%  is prohibited.~%");

    private static final SubLSymbol $kw326$EXCEPT_FOR_W_O_SINGLETON_VAR = makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");

    private static final SubLList $list327 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str328$__exceptFor_sentence_arg2_must_ha = makeString("#$exceptFor sentence arg2 must have precisely one variable but has ~s~s~a.~%");

    private static final SubLString $str329$__ = makeString(": ");

    private static final SubLSymbol $INVALID_MT_FOR_TOU = makeKeyword("INVALID-MT-FOR-TOU");

    private static final SubLList $list331 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-MT-FOR-TOU"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str332$attempt_to_assert___termOfUnit_ga = makeString("attempt to assert #$termOfUnit gaf in mt ~s; it may only be asserted in mt ~s.~%");

    private static final SubLSymbol $NON_DEFN_PRED_IN_VOCAB_MT = makeKeyword("NON-DEFN-PRED-IN-VOCAB-MT");

    private static final SubLList $list334 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str335$attempt_to_assert_gaf_with_non_de = makeString("attempt to assert gaf with non-definitional predicate ~S in vocab mt ~s.~%");

    private static final SubLSymbol $PREDICATE_ISA_VIOLATION = makeKeyword("PREDICATE-ISA-VIOLATION");

    private static final SubLList $list337 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-PREDICATE-ISA-VIOLATION"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLList $list338 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));

    private static final SubLString $str339$___isa__s__s__in_mt__s__ = makeString("(#$isa ~s ~s) in mt ~s~%");

    private static final SubLSymbol $META_PREDICATE_VIOLATION = makeKeyword("META-PREDICATE-VIOLATION");

    static private final SubLList $list341 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-META-PREDICATE-VIOLATION"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLList $list342 = list(makeSymbol("PRED"), makeSymbol("META-PRED"), makeSymbol("META-PRED-VALUE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));

    private static final SubLString $str343$__s__s__s__in_mt__s__ = makeString("(~s ~s ~s) in mt ~s~%");

    private static final SubLList $list345 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-PRECANONICALIZATIONS"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str346$Uninformative_error_during_precan = makeString("Uninformative error during precanonicalization.~%~%");

    private static final SubLList $list348 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-EXPANSION"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLSymbol GENERIC_ARG_NUM = makeSymbol("GENERIC-ARG-NUM");

    private static final SubLString $str354$_A_has_arity__A__but_the_expansio = makeString("~A has arity ~A, but the expansion for ~A requires arity ~A, because it references the generic argument ~A.~%");

    private static final SubLString $str355$_A_does_not_fit_the_pattern_of_th = makeString("~A does not fit the pattern of the expansion of ~A, which is ~A.~%");

    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");

    private static final SubLList $list357 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RECURSION-LIMIT-EXCEEDED"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str358$Recursion_limit_exceeded__probabl = makeString("Recursion limit exceeded; probably trying to expand a recursive EL relation.~%~%");

    private static final SubLSymbol $EL_UNEVALUATABLE_EXPRESSION = makeKeyword("EL-UNEVALUATABLE-EXPRESSION");

    private static final SubLList $list360 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EL-UNEVALUATABLE-EXPRESSION"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str361$_was_marked_as___evaluateAtEL__bu = makeString(" was marked as #$evaluateAtEL, but was unevaluatable.");

    private static final SubLSymbol $QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");

    private static final SubLList $list363 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str364$The_variable__A_is_existentially_ = makeString("The variable ~A is existentially quantified and then used as a sequence variable in the sentence~%~A.~%See rule Q2 in the sequence variable specification.");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    private static final SubLList $list366 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str367$The_variables__A_were_used_as_seq = makeString("The variables ~A were used as sequence variables within the scope of the existentially quantified variable ~A.  Only one such sequence variable is permitted.  See rule Q3 in the sequence variable specification.");

    private static final SubLSymbol $AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");

    private static final SubLList $list369 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str370$The_variable__A_was_used_both_as_ = makeString("The variable ~A was used both as a sequence variable and a term variable within the scope of the existentially quantified variable ~A, in the sentence~%~A.~%See rule Q4 in the sequence variable specification.");

    private static final SubLSymbol $INHIBITED_SEQUENCE_VARIABLE = makeKeyword("INHIBITED-SEQUENCE-VARIABLE");

    private static final SubLList $list372 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INHIBITED-SEQUENCE-VARIABLE"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str373$The_variable__A_was_used_as_a_seq = makeString("The variable ~A was used as a sequence variable in the sentence ~A, which is not allowed because ~A is scoped.  See the section on scoping expressions in the sequence variable specification.");

    private static final SubLSymbol $TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");

    private static final SubLList $list375 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str376$In_conflict___a___No_more_than_on = makeString("In conflict: ~a.~%No more than one #$commutativeInArgsAndRest assertion is allowed.~%");

    private static final SubLSymbol $CYCLIC_COMMUTATIVE_IN_ARGS = makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");

    private static final SubLList $list378 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str379$An_assertion_of_partial_commutati = makeString("An assertion of partial commutativity has already been made about argument position ~a of relation ~a, namely:~%~a.~%");

    private static final SubLSymbol $DEFINING_MT_VIOLATION = makeKeyword("DEFINING-MT-VIOLATION");

    private static final SubLList $list381 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DEFINING-MT-VIOLATION"), makeKeyword("COMMENT"), makeString(""));

    private static final SubLString $str382$Term__a_was_referenced_in__a___bu = makeString("Term ~a was referenced in ~a ~%but is defined only in ~a.~%");

    private static final SubLSymbol $DISJUNCT_IN_PRAGMATIC_REQUIREMENT = makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");

    private static final SubLList $list384 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT"), makeKeyword("COMMENT"), makeString("The sentence is a pragmatic requirement which contains a disjunct.  e.g. (#$pragmaticRequirement (#$or (#$isa ?X #$Dog) (#$isa ?X #$Cat)) (#$implies (#$isa ?X #$DomesticPet) (#$relationInstanceAll #$loves ?X #$HumanChild)))"));

    private static final SubLList $list385 = list(makeSymbol("PRAGMATIC-CONDITION"), makeSymbol("SENTENCE"), makeSymbol("MT"));

    private static final SubLString $str386$Disjoint_condition__s_is_present_ = makeString("Disjoint condition ~s is present in ~%~s ~s. ~%Disjunct condition is not allowed in a pragmatic requirement sentence.~%");

    private static final SubLSymbol $BAD_EXPONENTIAL_DISJUNCTION = makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");

    private static final SubLList $list388 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION"), makeKeyword("COMMENT"), makeString("The sentence is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));

    private static final SubLList $list389 = list(makeSymbol("SENTENCE"));

    private static final SubLString $str390$_s_is_a_disjunction_of_conjunctio = makeString("~s is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");

    private static final SubLSymbol $BAD_EXPONENTIAL_CONJUNCTION = makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");

    private static final SubLList $list392 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION"), makeKeyword("COMMENT"), makeString("The sentence is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));

    private static final SubLString $str393$_s_is_a_conjunction_of_disjunctio = makeString("~s is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");

    private static final SubLSymbol $RESTRICTED_MT_ASSERTION = makeKeyword("RESTRICTED-MT-ASSERTION");

    private static final SubLList $list395 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-MT-ASSERTION"), makeKeyword("COMMENT"), makeString("The microtheory specified for the the sentence is a #$notAssertibleMt. For decontextualized collection / predicates the specified mt will be taken as the convention mt."));

    private static final SubLList $list396 = list(makeSymbol("MT"), makeSymbol("LITERAL"), makeSymbol("DECONTEXTUALIZED-LITERAL?"));

    private static final SubLString $str397$Asserting_the_decontextualized_li = makeString("Asserting the decontextualized literal ~s in its convention mt ~s is prohibited due to a #$notAssertibleMt assertion.");

    private static final SubLString $str398$Asserting_the_literal__s_in_micro = makeString("Asserting the literal ~s in microtheory ~s is prohibited due to a #$notAssertibleMt assertion.");











    private static final SubLSymbol $SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL = makeKeyword("SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL");

    private static final SubLList $list405 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL"), makeKeyword("COMMENT"), makeString("Formula has a literal that occurs in both the antecedent and consequent."));

    private static final SubLList $list406 = list(makeSymbol("LITERAL"));

    private static final SubLString $str407$Formula_simplifies_to_a_tautology = makeString("Formula simplifies to a tautology due to literal ~%~S being both a pos and neg lit.");

    private static final SubLSymbol $REIFIABLE_BUT_NOT_FORWARD_REIFIABLE = makeKeyword("REIFIABLE-BUT-NOT-FORWARD-REIFIABLE");

    private static final SubLList $list409 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE"), makeKeyword("COMMENT"), makeString("Don't assert unreified nats with reifiable functors.  non-skolemizeForward functors during forward inference are like notAssertible predicates, and they are both things that WFF needs to verify."));

    private static final SubLString $str410$Could_not_reify_nat__S____in_sent = makeString("Could not reify nat ~S~%  in sentence:~%  ~s~%  as the functor is reifiable but not forward refiable in mt ~s.");

    public static final SubLObject explain_invalid_variables_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject v_variables = NIL;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            v_variables = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject length = length(v_variables);
                    if (length.numE(ZERO_INTEGER)) {
                        return NIL;
                    }
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return format(NIL, $str_alt4$Sentence__s_contains_invalid_vari, new SubLObject[]{ sentence, length, string_utilities.stringify_items(v_variables, symbol_function(STR), $str_alt6$__, $str_alt7$__and_), length, cycl_variables.$valid_el_var_regular_expression$.getGlobalValue() });
                        } else {
                            if (pcase_var.eql($HL)) {
                                if (length.numG(ONE_INTEGER)) {
                                    {
                                        SubLObject hl_explanation = NIL;
                                        SubLObject cdolist_list_var = v_variables;
                                        SubLObject variable = NIL;
                                        for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                                            hl_explanation = cons(list($$not, listS($$quotedIsa, variable, $list_alt11)), hl_explanation);
                                        }
                                        return simplifier.conjoin(hl_explanation, UNPROVIDED);
                                    }
                                } else {
                                    {
                                        SubLObject variable = v_variables.first();
                                        return list($$not, listS($$quotedIsa, variable, $list_alt11));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject explain_invalid_variables(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject v_variables = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        v_variables = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject length = length(v_variables);
            if (length.numE(ZERO_INTEGER)) {
                return NIL;
            }
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return format(NIL, $str4$Sentence__s_contains_invalid_vari, new SubLObject[]{ sentence, length, string_utilities.stringify_items(v_variables, symbol_function(STR), $str6$__, $str7$__and_), length, cycl_variables.$valid_el_var_regular_expression$.getGlobalValue() });
            }
            if (pcase_var.eql($HL)) {
                if (length.numG(ONE_INTEGER)) {
                    SubLObject hl_explanation = NIL;
                    SubLObject cdolist_list_var = v_variables;
                    SubLObject variable = NIL;
                    variable = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        hl_explanation = cons(list($$not, listS($$quotedIsa, variable, $list11)), hl_explanation);
                        cdolist_list_var = cdolist_list_var.rest();
                        variable = cdolist_list_var.first();
                    } 
                    return simplifier.conjoin(hl_explanation, UNPROVIDED);
                }
                final SubLObject variable2 = v_variables.first();
                return list($$not, listS($$quotedIsa, variable2, $list11));
            }
        } else {
            cdestructuring_bind_error(datum, $list2);
        }
        return NIL;
    }

    public static final SubLObject explain_invalid_sentence_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = io_mode;
                    if (pcase_var.eql($NL)) {
                        if (NIL != mt) {
                            return cconcatenate(format(NIL, $str_alt15$_s_is_not_a_well_formed_sentence_, sentence, mt), sentence.isCons() ? ((SubLObject) (format(NIL, $str_alt16$Perhaps__s_is_insufficiently_defi, cycl_utilities.formula_operator(sentence), mt))) : $str_alt17$);
                        } else {
                            return cconcatenate(format(NIL, $str_alt18$_s_is_not_a_well_formed_sentence_, sentence), sentence.isCons() ? ((SubLObject) (format(NIL, $str_alt19$Perhaps__s_is_insufficiently_defi, cycl_utilities.formula_operator(sentence)))) : $str_alt17$);
                        }
                    } else {
                        if (pcase_var.eql($HL)) {
                            if (NIL != mt) {
                                return list($$ist, mt, list($$not, list($$admittedSentence, list($$SubLQuoteFn, sentence))));
                            } else {
                                return list($$not, list($$admittedSentence, list($$SubLQuoteFn, sentence)));
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt14);
            }
        }
        return NIL;
    }

    public static SubLObject explain_invalid_sentence(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                if (NIL != mt) {
                    return cconcatenate(format(NIL, $str16$_s_is_not_a_well_formed_sentence_, sentence, mt), sentence.isCons() ? format(NIL, $str17$Perhaps__s_is_insufficiently_defi, cycl_utilities.formula_operator(sentence), mt) : $str18$);
                }
                return cconcatenate(format(NIL, $str19$_s_is_not_a_well_formed_sentence_, sentence), sentence.isCons() ? format(NIL, $str20$Perhaps__s_is_insufficiently_defi, cycl_utilities.formula_operator(sentence)) : $str18$);
            } else
                if (pcase_var.eql($HL)) {
                    if (NIL != mt) {
                        return list($$ist, mt, list($$not, list($$admittedSentence, list($$SubLQuoteFn, sentence))));
                    }
                    return list($$not, list($$admittedSentence, list($$SubLQuoteFn, sentence)));
                }

        } else {
            cdestructuring_bind_error(datum, $list15);
        }
        return NIL;
    }

    public static final SubLObject explain_not_an_ascii_string_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    string = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt26$String__s_contains_non_ASCII_char, string);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt25);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_not_an_ascii_string(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list26);
            string = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str27$String__s_contains_non_ASCII_char, string);
            }
            cdestructuring_bind_error(datum, $list26);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_forts_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt29$References_invalid_forts___a___, string_utilities.stringify_items(cadr(why_not), symbol_function(STR), $str_alt6$__, $str_alt7$__and_));
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_forts(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str30$References_invalid_forts___a___, string_utilities.stringify_items(cadr(why_not), symbol_function(STR), $str6$__, $str7$__and_));
        }
        return NIL;
    }

    public static final SubLObject explain_mal_fort_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt32);
                    fort = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt33$FORT__s_is_invalid___, fort);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt32);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_fort(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject fort = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            fort = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str34$FORT__s_is_invalid___, fort);
            }
            cdestructuring_bind_error(datum, $list33);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arity_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arity_pred = NIL;
            SubLObject relation = NIL;
            SubLObject v_arity = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            arity_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            relation = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            v_arity = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt37$The__s_of__s_should_be_a___NonNeg, new SubLObject[]{ arity_pred, relation, v_arity }), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                } else {
                    if (pcase_var.eql($HL)) {
                        return simplifier.conjoin(list(czer_utilities.find_hl_gaf(list(arity_pred, relation, v_arity), UNPROVIDED), czer_utilities.find_hl_gaf(listS($$arg2Isa, arity_pred, $list_alt39), UNPROVIDED)), UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arity(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arity_pred = NIL;
        SubLObject relation = NIL;
        SubLObject v_arity = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        arity_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        v_arity = current.first();
        current = data = current.rest();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str38$The__s_of__s_should_be_a___NonNeg, new SubLObject[]{ arity_pred, relation, v_arity }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql($HL)) {
            return simplifier.conjoin(list(czer_utilities.find_hl_gaf(list(arity_pred, relation, v_arity), UNPROVIDED), czer_utilities.find_hl_gaf(listS($$arg2Isa, arity_pred, $list40), UNPROVIDED)), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_arity_mismatch_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject sentence = NIL;
            SubLObject relation = NIL;
            SubLObject description = NIL;
            SubLObject expected_argnum = NIL;
            SubLObject given_argnum = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            relation = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            description = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            expected_argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            given_argnum = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt43$Arity_mismatch_in__A___A_is_a_n__, new SubLObject[]{ sentence, relation, description, expected_argnum, given_argnum }), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_arity_mismatch(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject sentence = NIL;
        SubLObject relation = NIL;
        SubLObject description = NIL;
        SubLObject expected_argnum = NIL;
        SubLObject given_argnum = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        description = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        expected_argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        given_argnum = current.first();
        current = data = current.rest();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str44$Arity_mismatch_in__A___A_is_a_n__, new SubLObject[]{ sentence, relation, description, expected_argnum, given_argnum }), nl_explanation_of_verbose_data(data));
        }
        return NIL;
    }

    public static final SubLObject explain_violated_arity_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arity_pred = NIL;
            SubLObject relation = NIL;
            SubLObject v_arity = NIL;
            SubLObject sentence = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt46);
            arity_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt46);
            relation = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt46);
            v_arity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt46);
            sentence = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt47$The__s_of__s_is__s___, new SubLObject[]{ arity_pred, relation, v_arity }), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                } else {
                    if (pcase_var.eql($HL)) {
                        return simplifier.conjoin(list(czer_utilities.find_hl_gaf(list(arity_pred, relation, v_arity), UNPROVIDED), arity_pred == $$arityMin ? ((SubLObject) (czer_utilities.find_hl_gaf(list($$not, list($$greaterThanOrEqualTo, list($$FormulaArityFn, sentence), v_arity)), UNPROVIDED))) : arity_pred == $$arityMax ? ((SubLObject) (czer_utilities.find_hl_gaf(list($$not, list($$greaterThanOrEqualTo, v_arity, list($$FormulaArityFn, sentence))), UNPROVIDED))) : czer_utilities.find_hl_gaf(list($$not, list($$evaluate, v_arity, list($$FormulaArityFn, sentence))), UNPROVIDED)), UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_violated_arity(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arity_pred = NIL;
        SubLObject relation = NIL;
        SubLObject v_arity = NIL;
        SubLObject sentence = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        arity_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        v_arity = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        sentence = current.first();
        current = data = current.rest();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str48$The__s_of__s_is__s___, new SubLObject[]{ arity_pred, relation, v_arity }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql($HL)) {
            return simplifier.conjoin(list(czer_utilities.find_hl_gaf(list(arity_pred, relation, v_arity), UNPROVIDED), arity_pred.eql($$arityMin) ? czer_utilities.find_hl_gaf(list($$not, list($$greaterThanOrEqualTo, list($$FormulaArityFn, list($$Quote, sentence)), v_arity)), UNPROVIDED) : arity_pred.eql($$arityMax) ? czer_utilities.find_hl_gaf(list($$not, list($$greaterThanOrEqualTo, v_arity, list($$FormulaArityFn, list($$Quote, sentence)))), UNPROVIDED) : czer_utilities.find_hl_gaf(list($$not, list($$evaluate, v_arity, list($$FormulaArityFn, list($$Quote, sentence)))), UNPROVIDED)), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_missing_arity_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject relation = NIL;
                    SubLObject v_arity = NIL;
                    SubLObject sentence = NIL;
                    SubLObject data = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    relation = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    v_arity = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    sentence = current.first();
                    current = current.rest();
                    data = current;
                    return cconcatenate(format(NIL, $str_alt56$The_arity_of__s_is_unknown___, relation), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_missing_arity(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject relation = NIL;
            SubLObject v_arity = NIL;
            SubLObject sentence = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list57);
            relation = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list57);
            v_arity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list57);
            sentence = current.first();
            current = data = current.rest();
            return cconcatenate(format(NIL, $str58$The_arity_of__s_is_unknown___, relation), nl_explanation_of_verbose_data(data));
        }
        return NIL;
    }

    public static final SubLObject explain_malformed_args_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject description = NIL;
                    SubLObject relation = NIL;
                    SubLObject args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    description = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    relation = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    args = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt60$The__A__A_got_the_malformed_argum, new SubLObject[]{ description, relation, args });
                    } else {
                        cdestructuring_bind_error(datum, $list_alt59);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_malformed_args(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject description = NIL;
            SubLObject relation = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list61);
            description = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list61);
            relation = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list61);
            args = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str62$The__A__A_got_the_malformed_argum, new SubLObject[]{ description, relation, args });
            }
            cdestructuring_bind_error(datum, $list61);
        }
        return NIL;
    }

    public static final SubLObject explain_not_a_denotational_term_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject v_term = cadr(why_not);
                    return format(NIL, $str_alt63$_A_is_not_a_denotational_term___, v_term);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_not_a_denotational_term(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject v_term = cadr(why_not);
            return format(NIL, $str65$_A_is_not_a_denotational_term___, v_term);
        }
        return NIL;
    }

    public static final SubLObject explain_not_a_truth_function_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject v_term = cadr(why_not);
                    return format(NIL, $str_alt66$Did_not_recognize__A_as_a_truth_f, v_term);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_not_a_truth_function(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject v_term = cadr(why_not);
            return format(NIL, $str68$Did_not_recognize__A_as_a_truth_f, v_term);
        }
        return NIL;
    }

    public static final SubLObject explain_not_an_el_formula_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject formula = cadr(why_not);
                    return format(NIL, $str_alt69$_A_is_not_an_EL_formula__and_is_n, formula);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_not_an_el_formula(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject formula = cadr(why_not);
            return format(NIL, $str71$_A_is_not_an_EL_formula__and_is_n, formula);
        }
        return NIL;
    }

    public static final SubLObject explain_not_an_el_variable_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject v_term = cadr(why_not);
                    return format(NIL, $str_alt72$_A_is_not_an_EL_variable___, v_term);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_not_an_el_variable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject v_term = cadr(why_not);
            return format(NIL, $str74$_A_is_not_an_EL_variable___, v_term);
        }
        return NIL;
    }

    public static SubLObject explain_not_a_list_of_variables(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject v_term = cadr(why_not);
            return format(NIL, $str77$_A_is_not_a_list_of_EL_variables_, v_term);
        }
        return NIL;
    }

    public static final SubLObject explain_sequence_non_var_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject formula = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    formula = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    v_term = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt76$_A_contains_ill_formed_sequence_v, formula, v_term);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt75);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_sequence_non_var(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject formula = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list80);
            formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list80);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str81$_A_contains_ill_formed_sequence_v, formula, v_term);
            }
            cdestructuring_bind_error(datum, $list80);
        }
        return NIL;
    }

    public static final SubLObject explain_expand_subl_fn_irrelevant_term_in_arg1_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject violating_non_variables = NIL;
            SubLObject sentence = NIL;
            SubLObject expand_subl_fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            violating_non_variables = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            expand_subl_fn = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject length = length(violating_non_variables);
                    if (length.numE(ZERO_INTEGER)) {
                        return NIL;
                    }
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return format(NIL, $str_alt80$Sentence__s___has___ExpandSubLFn_, new SubLObject[]{ sentence, expand_subl_fn, length, string_utilities.stringify_items(violating_non_variables, symbol_function(STR), $str_alt6$__, $str_alt7$__and_), cycl_utilities.formula_arg1(expand_subl_fn, UNPROVIDED), cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                if (length.numG(ONE_INTEGER)) {
                                    {
                                        SubLObject formula_arg2 = cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED);
                                        SubLObject hl_explanation = NIL;
                                        SubLObject cdolist_list_var = violating_non_variables;
                                        SubLObject non_variable = NIL;
                                        for (non_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , non_variable = cdolist_list_var.first()) {
                                            hl_explanation = cons(list($$not, list($$trueSubL, list(TREE_FIND, non_variable, formula_arg2))), hl_explanation);
                                        }
                                        return simplifier.conjoin(hl_explanation, UNPROVIDED);
                                    }
                                } else {
                                    {
                                        SubLObject non_variable = violating_non_variables.first();
                                        return list($$not, list($$trueSubL, list(TREE_FIND, non_variable, cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED))));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt79);
            }
        }
        return NIL;
    }

    public static SubLObject explain_expand_subl_fn_irrelevant_term_in_arg1(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject violating_non_variables = NIL;
        SubLObject sentence = NIL;
        SubLObject expand_subl_fn = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        violating_non_variables = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        expand_subl_fn = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject length = length(violating_non_variables);
            if (length.numE(ZERO_INTEGER)) {
                return NIL;
            }
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return format(NIL, $str85$Sentence__s___has___ExpandSubLFn_, new SubLObject[]{ sentence, expand_subl_fn, length, string_utilities.stringify_items(violating_non_variables, symbol_function(STR), $str6$__, $str7$__and_), cycl_utilities.formula_arg1(expand_subl_fn, UNPROVIDED), cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED) });
            }
            if (pcase_var.eql($HL)) {
                if (length.numG(ONE_INTEGER)) {
                    final SubLObject formula_arg2 = cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED);
                    SubLObject hl_explanation = NIL;
                    SubLObject cdolist_list_var = violating_non_variables;
                    SubLObject non_variable = NIL;
                    non_variable = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        hl_explanation = cons(list($$not, list($$trueSubL, list(TREE_FIND, non_variable, formula_arg2))), hl_explanation);
                        cdolist_list_var = cdolist_list_var.rest();
                        non_variable = cdolist_list_var.first();
                    } 
                    return simplifier.conjoin(hl_explanation, UNPROVIDED);
                }
                final SubLObject non_variable2 = violating_non_variables.first();
                return list($$not, list($$trueSubL, list(TREE_FIND, non_variable2, cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED))));
            }
        } else {
            cdestructuring_bind_error(datum, $list84);
        }
        return NIL;
    }

    public static final SubLObject explain_invalid_mt_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt85$Mt__s_is_invalid___, cadr(why_not));
            }
        }
        return NIL;
    }

    public static SubLObject explain_invalid_mt(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str90$Mt__s_is_invalid___, cadr(why_not));
        }
        return NIL;
    }

    public static final SubLObject explain_mal_function_nesting_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    {
                        SubLObject fn_term = cadr(why_not);
                        SubLObject nesting = function_terms.term_functional_complexity(fn_term);
                        return format(NIL, $str_alt88$Term__s_______has__s_nesting_leve, new SubLObject[]{ fn_term, nesting, $term_functional_complexity_cutoff$.getDynamicValue(thread) });
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject explain_mal_function_nesting(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject fn_term = cadr(why_not);
            final SubLObject nesting = function_terms.term_functional_complexity(fn_term);
            return format(NIL, $str93$Term__s_______has__s_nesting_leve, new SubLObject[]{ fn_term, nesting, $term_functional_complexity_cutoff$.getDynamicValue(thread) });
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_defns_int_alt(SubLObject why_not, SubLObject pred, SubLObject io_mode) {
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject psn = NIL;
            SubLObject col = NIL;
            SubLObject v_defns = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt91);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt91);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt91);
            psn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt91);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt91);
            v_defns = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt91);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != via_genl_pred) ? ((SubLObject) (via_genl_pred)) : via_genl_inverse;
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    {
                        SubLObject message = format(NIL, $str_alt94$Term__s__violates__s__s__of_colle, new SubLObject[]{ arg, pred, v_defns.isList() ? ((SubLObject) (string_utilities.stringify_items(v_defns, symbol_function(STR), $str_alt6$__, $str_alt7$__and_))) : v_defns, col });
                        if ((NIL != reln) && (NIL != psn)) {
                            message = cconcatenate(message, format(NIL, $str_alt95$applicable_to_arg__s_of__s__, psn, reln));
                        }
                        if (NIL != via_genl) {
                            message = cconcatenate(message, format(NIL, $str_alt96$_via__s___, via_genl));
                        }
                        message = cconcatenate(message, format(NIL, $str_alt97$in_mt__s___, mt));
                        return message;
                    }
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject defn_gafs = NIL;
                            if (v_defns.isList()) {
                                {
                                    SubLObject cdolist_list_var = v_defns;
                                    SubLObject defn = NIL;
                                    for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                        defn_gafs = cons(czer_utilities.find_hl_gaf(list(pred, col, list($$SubLQuoteFn, defn)), mt), defn_gafs);
                                        defn_gafs = cons(czer_utilities.find_hl_gaf(list($$evaluate, $$False, list($$EvaluateSubLFn, list($$ExpandSubLFn, list(arg), list(defn, arg)))), mt), defn_gafs);
                                    }
                                }
                            } else {
                                defn_gafs = cons(czer_utilities.find_hl_gaf(list(pred, col, list($$SubLQuoteFn, v_defns)), mt), defn_gafs);
                                defn_gafs = cons(czer_utilities.find_hl_gaf(list($$evaluate, $$False, list($$EvaluateSubLFn, list($$ExpandSubLFn, list(arg), list(v_defns, arg)))), mt), defn_gafs);
                            }
                            return simplifier.conjoin(defn_gafs, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_defns_int(final SubLObject why_not, final SubLObject pred, final SubLObject v_properties) {
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject psn = NIL;
        SubLObject col = NIL;
        SubLObject v_defns = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list96);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        psn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        v_defns = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject message = format(NIL, $str99$Term__s__violates__s__s__of_colle, new SubLObject[]{ arg, pred, v_defns.isList() ? string_utilities.stringify_items(v_defns, symbol_function(STR), $str6$__, $str7$__and_) : v_defns, col });
            if ((NIL != reln) && (NIL != psn)) {
                message = cconcatenate(message, format(NIL, $str100$applicable_to_arg__s_of__s__, psn, reln));
            }
            if (NIL != via_genl) {
                message = cconcatenate(message, format(NIL, $str101$_via__s___, via_genl));
            }
            message = cconcatenate(message, format(NIL, $str102$in_mt__s___, mt));
            return message;
        }
        if (pcase_var.eql($HL)) {
            SubLObject defn_gafs = NIL;
            if (v_defns.isList()) {
                SubLObject cdolist_list_var = v_defns;
                SubLObject defn = NIL;
                defn = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    defn_gafs = cons(czer_utilities.find_hl_gaf(list(pred, col, list($$SubLQuoteFn, defn)), mt), defn_gafs);
                    defn_gafs = cons(czer_utilities.find_hl_gaf(list($$evaluate, $$False, list($$EvaluateSubLFn, list($$ExpandSubLFn, list(arg), list(defn, arg)))), mt), defn_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    defn = cdolist_list_var.first();
                } 
            } else {
                defn_gafs = cons(czer_utilities.find_hl_gaf(list(pred, col, list($$SubLQuoteFn, v_defns)), mt), defn_gafs);
                defn_gafs = cons(czer_utilities.find_hl_gaf(list($$evaluate, $$False, list($$EvaluateSubLFn, list($$ExpandSubLFn, list(arg), list(v_defns, arg)))), mt), defn_gafs);
            }
            return simplifier.conjoin(defn_gafs, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_iff_defns_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_defns_int(why_not, $$defnIff, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_iff_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (((wff_vars.get_wff_property(v_properties, $IO_MODE) == $NL) && (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE)) && (NIL != kb_control_vars.lexicon_kb_loaded_p())) {
            return nl_explanation_of_why_not_terse(why_not, $ARG_ISA, v_properties);
        }
        return explain_mal_arg_wrt_defns_int(why_not, $$defnIff, v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_quoted_iff_defns_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_defns_int(why_not, $$quotedDefnIff, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_quoted_iff_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_defns_int(why_not, $$quotedDefnIff, v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_suf_defns_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_defns_int(why_not, $$defnSufficient, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_suf_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (((wff_vars.get_wff_property(v_properties, $IO_MODE) == $NL) && (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE)) && (NIL != kb_control_vars.lexicon_kb_loaded_p())) {
            return nl_explanation_of_why_not_terse(why_not, $ARG_ISA, v_properties);
        }
        return explain_mal_arg_wrt_defns_int(why_not, $$defnSufficient, v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_quoted_suf_defns_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_defns_int(why_not, $$quotedDefnSufficient, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_quoted_suf_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_defns_int(why_not, $$quotedDefnSufficient, v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_nec_defn_int_alt(SubLObject why_not, SubLObject pred, SubLObject io_mode) {
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject psn = NIL;
            SubLObject col = NIL;
            SubLObject defn_col = NIL;
            SubLObject defn = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            psn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            defn_col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            defn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != via_genl_pred) ? ((SubLObject) (via_genl_pred)) : via_genl_inverse;
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    {
                        SubLObject message = format(NIL, $str_alt114$Term__s__violates__s__s___s___of_, new SubLObject[]{ arg, pred, defn_col, defn, col });
                        if ((NIL != reln) && (NIL != psn)) {
                            message = cconcatenate(message, format(NIL, $str_alt95$applicable_to_arg__s_of__s__, psn, reln));
                        }
                        if (NIL != via_genl) {
                            message = cconcatenate(message, format(NIL, $str_alt96$_via__s___, via_genl));
                        }
                        message = cconcatenate(message, format(NIL, $str_alt97$in_mt__s___, mt));
                        return message;
                    }
                } else {
                    if (pcase_var.eql($HL)) {
                        return simplifier.conjoin(list(czer_utilities.find_hl_gaf(list(pred, defn_col, list($$SubLQuoteFn, defn)), mt), czer_utilities.find_hl_gaf(list($$evaluate, $$False, list($$EvaluateSubLFn, list($$ExpandSubLFn, list(arg), list(defn, arg)))), mt)), UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_nec_defn_int(final SubLObject why_not, final SubLObject pred, final SubLObject io_mode) {
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject psn = NIL;
        SubLObject col = NIL;
        SubLObject defn_col = NIL;
        SubLObject defn = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        psn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        defn_col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        defn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        if (io_mode.eql($NL)) {
            SubLObject message = format(NIL, $str122$Term__s__violates__s__s___s___of_, new SubLObject[]{ arg, pred, defn_col, defn, col });
            if ((NIL != reln) && (NIL != psn)) {
                message = cconcatenate(message, format(NIL, $str100$applicable_to_arg__s_of__s__, psn, reln));
            }
            if (NIL != via_genl) {
                message = cconcatenate(message, format(NIL, $str101$_via__s___, via_genl));
            }
            message = cconcatenate(message, format(NIL, $str102$in_mt__s___, mt));
            return message;
        }
        if (io_mode.eql($HL)) {
            return simplifier.conjoin(list(czer_utilities.find_hl_gaf(list(pred, defn_col, list($$SubLQuoteFn, defn)), mt), czer_utilities.find_hl_gaf(list($$evaluate, $$False, list($$EvaluateSubLFn, list($$ExpandSubLFn, list(arg), list(defn, arg)))), mt)), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_nec_defn_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_nec_defn_int(why_not, $$defnNecessary, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_nec_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (((wff_vars.get_wff_property(v_properties, $IO_MODE) == $NL) && (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE)) && (NIL != kb_control_vars.lexicon_kb_loaded_p())) {
            return nl_explanation_of_why_not_terse(why_not, $ARG_ISA, v_properties);
        }
        return explain_mal_arg_wrt_nec_defn_int(why_not, $$defnNecessary, wff_vars.get_wff_property(v_properties, $IO_MODE));
    }

    public static final SubLObject explain_mal_arg_wrt_quoted_nec_defn_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_nec_defn_int(why_not, $$quotedDefnNecessary, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_quoted_nec_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_nec_defn_int(why_not, $$quotedDefnNecessary, wff_vars.get_wff_property(v_properties, $IO_MODE));
    }

    public static final SubLObject explain_mal_arg_wrt_col_defn_int_alt(SubLObject why_not, SubLObject v_arg_type, SubLObject pred, SubLObject io_mode) {
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt121);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt121);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt121);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt121);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt121);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != via_genl_pred) ? ((SubLObject) (via_genl_pred)) : via_genl_inverse;
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt122$Term__s_violates_defns_of__a__s__, new SubLObject[]{ arg, v_arg_type, col }), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, rel), NIL != via_genl ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, via_genl))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
                } else {
                    if (pcase_var.eql($HL)) {
                        return czer_utilities.find_hl_gaf(list($$not, list(pred, arg, col)), mt);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_col_defn_int(final SubLObject why_not, final SubLObject v_arg_type, final SubLObject pred, final SubLObject v_properties) {
        if (((wff_vars.get_wff_property(v_properties, $IO_MODE) == $NL) && (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE)) && (NIL != kb_control_vars.lexicon_kb_loaded_p())) {
            return nl_explanation_of_why_not_terse(why_not, v_arg_type, v_properties);
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list129);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str130$Term__s_violates_defns_of__a__s__, new SubLObject[]{ arg, Strings.string_downcase(string_utilities.to_string(v_arg_type), UNPROVIDED, UNPROVIDED), col }), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via_genl ? format(NIL, $str101$_via__s___, via_genl) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql($HL)) {
            return czer_utilities.find_hl_gaf(list($$not, list(pred, arg, col)), mt);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_col_defn_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_col_defn_int(why_not, $str_alt124$arg_isa, $$isa, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_col_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_col_defn_int(why_not, $ARG_ISA, $$isa, v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_col_quoted_defn_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_col_defn_int(why_not, $str_alt128$arg_quoted_isa, $$quotedIsa, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_col_quoted_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_col_defn_int(why_not, $ARG_QUOTED_ISA, $$quotedIsa, v_properties);
    }

    public static final SubLObject explanation_constraint_string_alt(SubLObject constraint_type) {
        {
            SubLObject pcase_var = constraint_type;
            if (pcase_var.eql($ARG_ISA)) {
                return $str_alt124$arg_isa;
            } else {
                if (pcase_var.eql($ARG_QUOTED_ISA)) {
                    return $str_alt128$arg_quoted_isa;
                } else {
                    if (pcase_var.eql($ARG_GENLS)) {
                        return $str_alt134$arg_genls;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explanation_constraint_string(final SubLObject constraint_type) {
        if (constraint_type.eql($ARG_ISA)) {
            return $str138$arg_isa;
        }
        if (constraint_type.eql($ARG_NOT_ISA)) {
            return $str140$arg_not_isa;
        }
        if (constraint_type.eql($ARG_QUOTED_ISA)) {
            return $str141$arg_quoted_isa;
        }
        if (constraint_type.eql($ARG_GENLS)) {
            return $str143$arg_genls;
        }
        return NIL;
    }

    public static final SubLObject explanation_disjoint_string_alt(SubLObject constraint_type) {
        {
            SubLObject pcase_var = constraint_type;
            if (pcase_var.eql($ARG_ISA)) {
                return $str_alt135$isa_disjoint;
            } else {
                if (pcase_var.eql($ARG_QUOTED_ISA)) {
                    return $str_alt136$quoted_isa_disjoint;
                } else {
                    if (pcase_var.eql($ARG_GENLS)) {
                        return $$$disjoint;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explanation_disjoint_string(final SubLObject constraint_type) {
        if (constraint_type.eql($ARG_ISA)) {
            return $str144$isa_disjoint;
        }
        if (constraint_type.eql($ARG_QUOTED_ISA)) {
            return $str145$quoted_isa_disjoint;
        }
        if (constraint_type.eql($ARG_GENLS)) {
            return $$$disjoint;
        }
        return NIL;
    }

    public static final SubLObject explanation_pred_from_type_alt(SubLObject constraint_type) {
        {
            SubLObject pcase_var = constraint_type;
            if (pcase_var.eql($ARG_ISA)) {
                return $$isa;
            } else {
                if (pcase_var.eql($ARG_QUOTED_ISA)) {
                    return $$quotedIsa;
                }
            }
        }
        return NIL;
    }

    public static SubLObject explanation_pred_from_type(final SubLObject constraint_type) {
        if (constraint_type.eql($ARG_ISA) || constraint_type.eql($ARG_NOT_ISA)) {
            return $$isa;
        }
        if (constraint_type.eql($ARG_QUOTED_ISA)) {
            return $$quotedIsa;
        }
        return NIL;
    }

    public static final SubLObject hl_explanation_via_genl_pred_alt(SubLObject constraint_type, SubLObject reln, SubLObject pos, SubLObject col, SubLObject genl_pred, SubLObject mt) {
        {
            SubLObject constraints = NIL;
            SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
            if (NIL != constraint_pred) {
                {
                    SubLObject var = czer_utilities.find_hl_gaf_if(list(constraint_pred, genl_pred, col), mt);
                    if (NIL != var) {
                        constraints = cons(var, constraints);
                    }
                }
                if (NIL != constraints) {
                    {
                        SubLObject var = czer_utilities.find_hl_gaf(list($$genlPreds, reln, genl_pred), mt);
                        if (NIL != var) {
                            constraints = cons(var, constraints);
                        }
                    }
                }
            }
            return constraints;
        }
    }

    public static SubLObject hl_explanation_via_genl_pred(final SubLObject constraint_type, final SubLObject reln, final SubLObject pos, final SubLObject col, final SubLObject genl_pred, final SubLObject mt) {
        SubLObject constraints = NIL;
        final SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
        if (NIL != constraint_pred) {
            SubLObject var = czer_utilities.find_hl_gaf_if(list(constraint_pred, genl_pred, col), mt);
            if (NIL != var) {
                constraints = cons(var, constraints);
            }
            if (NIL != constraints) {
                var = czer_utilities.find_hl_gaf(list($$genlPreds, reln, genl_pred), mt);
                if (NIL != var) {
                    constraints = cons(var, constraints);
                }
            }
        }
        return constraints;
    }

    public static final SubLObject hl_explanation_via_genl_inverse_alt(SubLObject constraint_type, SubLObject reln, SubLObject pos, SubLObject col, SubLObject genl_inverse, SubLObject mt) {
        {
            SubLObject constraints = NIL;
            SubLObject inverse_pred = at_routines.inverse_pred(constraint_type, pos, reln);
            if (NIL != inverse_pred) {
                {
                    SubLObject var = czer_utilities.find_hl_gaf_if(list(inverse_pred, genl_inverse, col), mt);
                    if (NIL != var) {
                        constraints = cons(var, constraints);
                    }
                }
                if (NIL != constraints) {
                    {
                        SubLObject var = czer_utilities.find_hl_gaf(list($$genlInverse, reln, genl_inverse), mt);
                        if (NIL != var) {
                            constraints = cons(var, constraints);
                        }
                    }
                }
            }
            return constraints;
        }
    }

    public static SubLObject hl_explanation_via_genl_inverse(final SubLObject constraint_type, final SubLObject reln, final SubLObject pos, final SubLObject col, final SubLObject genl_inverse, final SubLObject mt) {
        SubLObject constraints = NIL;
        final SubLObject inverse_pred = at_routines.inverse_pred(constraint_type, pos, reln);
        if (NIL != inverse_pred) {
            SubLObject var = czer_utilities.find_hl_gaf_if(list(inverse_pred, genl_inverse, col), mt);
            if (NIL != var) {
                constraints = cons(var, constraints);
            }
            if (NIL != constraints) {
                var = czer_utilities.find_hl_gaf(list($$genlInverse, reln, genl_inverse), mt);
                if (NIL != var) {
                    constraints = cons(var, constraints);
                }
            }
        }
        return constraints;
    }

    public static final SubLObject hl_explanation_for_pred_alt(SubLObject constraint_type, SubLObject pos, SubLObject reln, SubLObject col, SubLObject mt) {
        {
            SubLObject constraints = NIL;
            SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
            if (NIL != constraint_pred) {
                constraints = cons(czer_utilities.find_hl_gaf(list(constraint_pred, reln, col), mt), constraints);
            }
            return constraints;
        }
    }

    public static SubLObject hl_explanation_for_pred(final SubLObject constraint_type, final SubLObject pos, final SubLObject reln, final SubLObject col, final SubLObject mt) {
        SubLObject constraints = NIL;
        final SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
        if (NIL != constraint_pred) {
            constraints = cons(czer_utilities.find_hl_gaf(list(constraint_pred, reln, col), mt), constraints);
        }
        return constraints;
    }

    public static final SubLObject hl_explanation_from_why_not_alt(SubLObject why_not, SubLObject constraint_type, SubLObject defaultP) {
        if (defaultP == UNPROVIDED) {
            defaultP = T;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt140);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject constraints = NIL;
                if (NIL != genl_pred) {
                    constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_via_genl_pred(constraint_type, reln, pos, col, genl_pred, mt);
                } else {
                    if (NIL != genl_inverse) {
                        constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_via_genl_inverse(constraint_type, reln, pos, col, genl_inverse, mt);
                    } else {
                        if (NIL != defaultP) {
                            constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_for_pred(constraint_type, pos, reln, col, mt);
                        }
                    }
                }
                return constraints;
            }
        }
    }

    public static SubLObject hl_explanation_from_why_not(final SubLObject why_not, final SubLObject constraint_type, SubLObject defaultP) {
        if (defaultP == UNPROVIDED) {
            defaultP = T;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        mt = current.first();
        current = data = current.rest();
        final SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        SubLObject constraints = NIL;
        if (NIL != genl_pred) {
            constraints = hl_explanation_via_genl_pred(constraint_type, reln, pos, col, genl_pred, mt);
        } else
            if (NIL != genl_inverse) {
                constraints = hl_explanation_via_genl_inverse(constraint_type, reln, pos, col, genl_inverse, mt);
            } else
                if (NIL != defaultP) {
                    constraints = hl_explanation_for_pred(constraint_type, pos, reln, col, mt);
                }


        return constraints;
    }

    public static final SubLObject nl_explanation_from_why_not(SubLObject why_not, SubLObject constraint_type) {
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt140);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != genl_pred) ? ((SubLObject) (genl_pred)) : genl_inverse;
                SubLObject type_string = com.cyc.cycjava.cycl.wff_modules.explanation_constraint_string(constraint_type);
                return cconcatenate(format(NIL, $str_alt141$Term__s_violates__a__s__, new SubLObject[]{ arg, type_string, col }), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, via_genl))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
            }
        }
    }

    public static SubLObject nl_explanation_from_why_not(final SubLObject why_not, final SubLObject constraint_type, final SubLObject v_properties) {
        if (((wff_vars.get_wff_property(v_properties, $IO_MODE) == $NL) && (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE)) && (NIL != kb_control_vars.lexicon_kb_loaded_p())) {
            return nl_explanation_of_why_not_terse(why_not, constraint_type, v_properties);
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        mt = current.first();
        current = data = current.rest();
        final SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != genl_pred) ? genl_pred : genl_inverse;
        final SubLObject type_string = explanation_constraint_string(constraint_type);
        return cconcatenate(format(NIL, $str150$Term__s_violates__a__s__, new SubLObject[]{ arg, type_string, col }), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl ? format(NIL, $str101$_via__s___, via_genl) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
    }

    public static final SubLObject nl_explanation_from_why_not_with_disjoint(SubLObject why_not, SubLObject constraint_type) {
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt140);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != genl_pred) ? ((SubLObject) (genl_pred)) : genl_inverse;
                SubLObject disjoint_string = com.cyc.cycjava.cycl.wff_modules.explanation_disjoint_string(constraint_type);
                SubLObject type_string = com.cyc.cycjava.cycl.wff_modules.explanation_constraint_string(constraint_type);
                return cconcatenate(format(NIL, $str_alt142$Term__s_is__a_with__a__s__, new SubLObject[]{ arg, disjoint_string, type_string, col }), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, via_genl))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
            }
        }
    }

    public static SubLObject nl_explanation_from_why_not_with_disjoint(final SubLObject why_not, final SubLObject constraint_type, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if ((((wff_vars.get_wff_property(v_properties, $IO_MODE) == $NL) && (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE)) && (NIL != kb_control_vars.lexicon_kb_loaded_p())) && (NIL != subl_promotions.memberP(constraint_type, $list151, UNPROVIDED, UNPROVIDED))) {
            return nl_explanation_of_why_not_terse(why_not, constraint_type, v_properties);
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        mt = current.first();
        current = data = current.rest();
        final SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != genl_pred) ? genl_pred : genl_inverse;
        final SubLObject disjoint_string = explanation_disjoint_string(constraint_type);
        final SubLObject type_string = explanation_constraint_string(constraint_type);
        final SubLObject base_string = cconcatenate(format(NIL, $str152$Term__s_is__a_with__a__s__, new SubLObject[]{ arg, disjoint_string, type_string, col }), format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln));
        if (wff_vars.get_wff_property(v_properties, $NL_VERBOSITY) == $TERSE) {
            return cconcatenate(base_string, $str153$___);
        }
        return cconcatenate(base_string, new SubLObject[]{ NIL != via_genl ? format(NIL, $str101$_via__s___, via_genl) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
    }

    public static SubLObject nl_explanation_of_why_not_terse(final SubLObject why_not, final SubLObject constraint_type, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        mt = current.first();
        current = data = current.rest();
        final SubLObject term_map = getf(v_properties, $NL_TERM_MAP, UNPROVIDED);
        final SubLObject violator_phrase = (NIL != list_utilities.alist_lookup(term_map, arg, EQUAL, UNPROVIDED)) ? list($$ParaphraseFn, list_utilities.alist_lookup(term_map, arg, EQUAL, UNPROVIDED)) : list($$CycLPhraseFn, arg);
        final SubLObject known_type = (constraint_type == $ARG_ISA) ? isa.min_isa(arg, UNPROVIDED, UNPROVIDED).first() : list($$SpecsFn, genls.min_genls(arg, UNPROVIDED, UNPROVIDED).first());
        final SubLObject col_phrase = get_type_phrase(col, constraint_type);
        final SubLObject but_phrase = ((NIL != known_type) && (!known_type.equal($list158))) ? list($list159, $list160, get_type_phrase(known_type, constraint_type)) : NIL;
        return pph_main.generate_string_from_phrase_naut(listS($$ConcatenatePhrasesFn, violator_phrase, $list162, col_phrase, append(but_phrase, NIL)), pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), $DECLARATIVE);
    }

    public static SubLObject get_type_phrase(final SubLObject col, final SubLObject constraint_type) {
        return constraint_type == $ARG_ISA ? list($$Np_DetNbarFn_Indefinite, list($$CycLPhraseFn, col)) : list($$ConcatenatePhrasesFn, $list165, list($$CycLPhraseFn, col));
    }

    public static final SubLObject explain_mal_arg_wrt_arg_isa_int_alt(SubLObject why_not, SubLObject constraint_type, SubLObject mode) {
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($NL)) {
                return com.cyc.cycjava.cycl.wff_modules.nl_explanation_from_why_not(why_not, constraint_type);
            } else {
                if (pcase_var.eql($HL)) {
                    {
                        SubLObject datum = why_not.rest();
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        SubLObject reln = NIL;
                        SubLObject pos = NIL;
                        SubLObject col = NIL;
                        SubLObject mt = NIL;
                        SubLObject data = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        col = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        mt = current.first();
                        current = current.rest();
                        data = current;
                        {
                            SubLObject constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_from_why_not(why_not, constraint_type, UNPROVIDED);
                            SubLObject pred = com.cyc.cycjava.cycl.wff_modules.explanation_pred_from_type(constraint_type);
                            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list(pred, arg, col)), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_arg_isa_int(final SubLObject why_not, final SubLObject constraint_type, final SubLObject v_properties) {
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return nl_explanation_from_why_not(why_not, constraint_type, v_properties);
        }
        if (pcase_var.eql($HL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list149);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            mt = current.first();
            current = data = current.rest();
            final SubLObject constraints = hl_explanation_from_why_not(why_not, constraint_type, UNPROVIDED);
            final SubLObject pred = explanation_pred_from_type(constraint_type);
            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list(pred, arg, col)), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_arg_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        if (NIL != $use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return com.cyc.cycjava.cycl.wff_modules.new_explain_mal_arg_wrt_arg_isa(why_not, io_mode);
        } else {
            return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_arg_isa_int(why_not, $ARG_ISA, io_mode);
        }
    }

    public static SubLObject explain_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != $use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return new_explain_mal_arg_wrt_arg_isa(why_not, wff_vars.get_wff_property(v_properties, $IO_MODE));
        }
        return explain_mal_arg_wrt_arg_isa_int(why_not, $ARG_ISA, v_properties);
    }

    public static final SubLObject new_explain_mal_arg_wrt_arg_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not;
            SubLObject current = datum;
            SubLObject wff_module = NIL;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt143);
            wff_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != via_genl_pred) ? ((SubLObject) (via_genl_pred)) : via_genl_inverse;
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt144$Term__s_violates_arg_isa__s__, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl_pred ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, via_genl))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject at_constraint_gaf = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
                            SubLObject rejected_sentence = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
                            SubLObject term_violation = czer_utilities.find_hl_gaf(list($$unknownSentence, list($$isa, arg, col)), mt);
                            SubLObject result = list(wff_module);
                            SubLObject explanation = NIL;
                            SubLObject justification = NIL;
                            result = cons(list($ARGUMENTS, arg, reln, pos, col, mt), result);
                            if (NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                                justification = cons(at_constraint_gaf, justification);
                            }
                            if (NIL != forts.fort_p(via_genl_pred)) {
                                {
                                    SubLObject genl_preds_literal = list($$genlPreds, reln, via_genl_pred);
                                    SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
                                    if (NIL != genl_pred_support) {
                                        justification = cons(genl_pred_support, justification);
                                    }
                                }
                            } else {
                                if (NIL != forts.fort_p(via_genl_inverse)) {
                                    {
                                        SubLObject genl_inverse_literal = list($$genlInverse, reln, via_genl_pred);
                                        SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_inverse_literal, mt, UNPROVIDED);
                                        if (NIL != genl_pred_support) {
                                            justification = cons(genl_pred_support, justification);
                                        }
                                    }
                                }
                            }
                            if (NIL != term_violation) {
                                explanation = cons(term_violation, explanation);
                                justification = cons(term_violation, justification);
                            }
                            if (NIL != explanation) {
                                result = cons(bq_cons($EXPLANATION, append(explanation, NIL)), result);
                            }
                            if (NIL != rejected_sentence) {
                                result = cons(list($CONSEQUENCE, list($$rejectedSentence, rejected_sentence)), result);
                            }
                            if (NIL != justification) {
                                result = cons(bq_cons($JUSTIFICATION, append(nreverse(justification), NIL)), result);
                            }
                            if (NIL != wff.provide_wff_suggestionsP()) {
                                {
                                    SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_isa(why_not, UNPROVIDED);
                                    result = cons(cons($CANDIDATE_REPAIRS, suggestions), result);
                                }
                            }
                            return nreverse(result);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject new_explain_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        SubLObject wff_module = NIL;
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(why_not, why_not, $list166);
        wff_module = why_not.first();
        SubLObject current = why_not.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str167$Term__s_violates_arg_isa__s__, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl_pred ? format(NIL, $str101$_via__s___, via_genl) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql($HL)) {
            final SubLObject at_constraint_gaf = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
            final SubLObject rejected_sentence = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
            final SubLObject term_violation = czer_utilities.find_hl_gaf(list($$unknownSentence, list($$isa, arg, col)), mt);
            SubLObject result = list(wff_module);
            SubLObject explanation = NIL;
            SubLObject justification = NIL;
            result = cons(list($ARGUMENTS, arg, reln, pos, col, mt), result);
            if (NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                justification = cons(at_constraint_gaf, justification);
            }
            if (NIL != forts.fort_p(via_genl_pred)) {
                final SubLObject genl_preds_literal = list($$genlPreds, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
                if (NIL != genl_pred_support) {
                    justification = cons(genl_pred_support, justification);
                }
            } else
                if (NIL != forts.fort_p(via_genl_inverse)) {
                    final SubLObject genl_inverse_literal = list($$genlInverse, reln, via_genl_pred);
                    final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_inverse_literal, mt, UNPROVIDED);
                    if (NIL != genl_pred_support) {
                        justification = cons(genl_pred_support, justification);
                    }
                }

            if (NIL != term_violation) {
                explanation = cons(term_violation, explanation);
                justification = cons(term_violation, justification);
            }
            if (NIL != explanation) {
                result = cons(bq_cons($EXPLANATION, append(explanation, NIL)), result);
            }
            if (NIL != rejected_sentence) {
                result = cons(list($CONSEQUENCE, list($$rejectedSentence, rejected_sentence)), result);
            }
            if (NIL != justification) {
                result = cons(bq_cons($JUSTIFICATION, append(nreverse(justification), NIL)), result);
            }
            if (NIL != wff.provide_wff_suggestionsP()) {
                final SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_isa(why_not, UNPROVIDED);
                result = cons(cons($CANDIDATE_REPAIRS, suggestions), result);
            }
            return nreverse(result);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_arg_quoted_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_arg_isa_int(why_not, $ARG_QUOTED_ISA, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_arg_quoted_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_arg_isa_int(why_not, $ARG_QUOTED_ISA, v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_arg_genl_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        if (NIL != $use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return com.cyc.cycjava.cycl.wff_modules.new_explain_mal_arg_wrt_arg_genl(why_not, io_mode);
        } else {
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return com.cyc.cycjava.cycl.wff_modules.nl_explanation_from_why_not(why_not, $ARG_GENLS);
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_from_why_not(why_not, $ARG_GENLS, NIL);
                            SubLObject datum = why_not.rest();
                            SubLObject current = datum;
                            SubLObject arg = NIL;
                            SubLObject reln = NIL;
                            SubLObject pos = NIL;
                            SubLObject col = NIL;
                            SubLObject mt = NIL;
                            SubLObject data = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt140);
                            arg = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt140);
                            reln = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt140);
                            pos = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt140);
                            col = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt140);
                            mt = current.first();
                            current = current.rest();
                            data = current;
                            if (NIL == constraints) {
                                {
                                    SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                                    if (NIL != genl_pred) {
                                        constraints = cons(czer_utilities.find_hl_gaf(list(genl_pred, reln, col), mt), constraints);
                                    }
                                }
                            }
                            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list($$genls, arg, col)), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != $use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return new_explain_mal_arg_wrt_arg_genl(why_not, wff_vars.get_wff_property(v_properties, $IO_MODE));
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return nl_explanation_from_why_not(why_not, $ARG_GENLS, v_properties);
        }
        if (pcase_var.eql($HL)) {
            SubLObject constraints = hl_explanation_from_why_not(why_not, $ARG_GENLS, NIL);
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list149);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            mt = current.first();
            current = data = current.rest();
            if (NIL == constraints) {
                final SubLObject genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                if (NIL != genl_pred) {
                    constraints = cons(czer_utilities.find_hl_gaf(list(genl_pred, reln, col), mt), constraints);
                }
            }
            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list($$genls, arg, col)), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject new_explain_mal_arg_wrt_arg_genl_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not;
            SubLObject current = datum;
            SubLObject wff_module = NIL;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt143);
            wff_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != via_genl_pred) ? ((SubLObject) (via_genl_pred)) : via_genl_inverse;
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt160$Term__s_violates_arg_genls__s__, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl_pred ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, via_genl))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject at_constraint_gaf = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
                            SubLObject rejected_sentence = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
                            SubLObject term_violation = czer_utilities.find_hl_gaf(list($$unknownSentence, list($$genls, arg, col)), mt);
                            SubLObject result = list(wff_module);
                            SubLObject explanation = NIL;
                            SubLObject justification = NIL;
                            result = cons(list($ARGUMENTS, arg, reln, pos, col, mt), result);
                            if (NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                                justification = cons(at_constraint_gaf, justification);
                            }
                            if (NIL != forts.fort_p(via_genl_pred)) {
                                {
                                    SubLObject genl_preds_literal = list($$genlPreds, reln, via_genl_pred);
                                    SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
                                    if (NIL != genl_pred_support) {
                                        justification = cons(genl_pred_support, justification);
                                    }
                                }
                            } else {
                                if (NIL != forts.fort_p(via_genl_inverse)) {
                                    {
                                        SubLObject genl_inverse_literal = list($$genlInverse, reln, via_genl_inverse);
                                        SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_inverse_literal, mt, UNPROVIDED);
                                        if (NIL != genl_pred_support) {
                                            justification = cons(genl_pred_support, justification);
                                        }
                                    }
                                }
                            }
                            if (NIL != term_violation) {
                                explanation = cons(term_violation, explanation);
                                justification = cons(term_violation, justification);
                            }
                            if (NIL != explanation) {
                                result = cons(bq_cons($EXPLANATION, append(explanation, NIL)), result);
                            }
                            if (NIL != rejected_sentence) {
                                result = cons(list($CONSEQUENCE, list($$rejectedSentence, rejected_sentence)), result);
                            }
                            if (NIL != justification) {
                                result = cons(bq_cons($JUSTIFICATION, append(nreverse(justification), NIL)), result);
                            }
                            if (NIL != wff.provide_wff_suggestionsP()) {
                                {
                                    SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_genl(why_not, UNPROVIDED);
                                    result = cons(cons($CANDIDATE_REPAIRS, suggestions), result);
                                }
                            }
                            return nreverse(result);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject new_explain_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        SubLObject wff_module = NIL;
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(why_not, why_not, $list166);
        wff_module = why_not.first();
        SubLObject current = why_not.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str183$Term__s_violates_arg_genls__s__, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl_pred ? format(NIL, $str101$_via__s___, via_genl) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql($HL)) {
            final SubLObject at_constraint_gaf = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
            final SubLObject rejected_sentence = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
            final SubLObject term_violation = czer_utilities.find_hl_gaf(list($$unknownSentence, list($$genls, arg, col)), mt);
            SubLObject result = list(wff_module);
            SubLObject explanation = NIL;
            SubLObject justification = NIL;
            result = cons(list($ARGUMENTS, arg, reln, pos, col, mt), result);
            if (NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                justification = cons(at_constraint_gaf, justification);
            }
            if (NIL != forts.fort_p(via_genl_pred)) {
                final SubLObject genl_preds_literal = list($$genlPreds, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
                if (NIL != genl_pred_support) {
                    justification = cons(genl_pred_support, justification);
                }
            } else
                if (NIL != forts.fort_p(via_genl_inverse)) {
                    final SubLObject genl_inverse_literal = list($$genlInverse, reln, via_genl_inverse);
                    final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_inverse_literal, mt, UNPROVIDED);
                    if (NIL != genl_pred_support) {
                        justification = cons(genl_pred_support, justification);
                    }
                }

            if (NIL != term_violation) {
                explanation = cons(term_violation, explanation);
                justification = cons(term_violation, justification);
            }
            if (NIL != explanation) {
                result = cons(bq_cons($EXPLANATION, append(explanation, NIL)), result);
            }
            if (NIL != rejected_sentence) {
                result = cons(list($CONSEQUENCE, list($$rejectedSentence, rejected_sentence)), result);
            }
            if (NIL != justification) {
                result = cons(bq_cons($JUSTIFICATION, append(nreverse(justification), NIL)), result);
            }
            if (NIL != wff.provide_wff_suggestionsP()) {
                final SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_genl(why_not, UNPROVIDED);
                result = cons(cons($CANDIDATE_REPAIRS, suggestions), result);
            }
            return nreverse(result);
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_arg_not_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return nl_explanation_from_why_not(why_not, $ARG_NOT_ISA, v_properties);
        }
        if (pcase_var.eql($HL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list149);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            mt = current.first();
            current = data = current.rest();
            final SubLObject constraints = hl_explanation_from_why_not(why_not, $ARG_NOT_ISA, UNPROVIDED);
            final SubLObject pred = explanation_pred_from_type($ARG_NOT_ISA);
            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list(pred, arg, col), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_arg_not_isa_disjoint_int(SubLObject why_not, SubLObject constraint_type, SubLObject io_mode) {
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return com.cyc.cycjava.cycl.wff_modules.nl_explanation_from_why_not_with_disjoint(why_not, constraint_type);
            } else {
                if (pcase_var.eql($HL)) {
                    {
                        SubLObject constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_from_why_not(why_not, constraint_type, UNPROVIDED);
                        SubLObject datum = why_not.rest();
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        SubLObject reln = NIL;
                        SubLObject pos = NIL;
                        SubLObject col = NIL;
                        SubLObject mt = NIL;
                        SubLObject data = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        col = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        mt = current.first();
                        current = current.rest();
                        data = current;
                        {
                            SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
                            SubLObject pred = com.cyc.cycjava.cycl.wff_modules.explanation_pred_from_type(constraint_type);
                            if (NIL == constraints) {
                                if (NIL != constraint_pred) {
                                    constraints = cons(czer_utilities.find_hl_gaf(list(constraint_pred, reln, col), mt), constraints);
                                }
                            }
                            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list(pred, arg, col)), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_arg_not_isa_disjoint_int(final SubLObject why_not, final SubLObject constraint_type, final SubLObject io_mode, final SubLObject v_properties) {
        if (io_mode.eql($NL)) {
            return nl_explanation_from_why_not_with_disjoint(why_not, constraint_type, v_properties);
        }
        if (io_mode.eql($HL)) {
            SubLObject constraints = hl_explanation_from_why_not(why_not, constraint_type, UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list149);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            mt = current.first();
            current = data = current.rest();
            final SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
            final SubLObject pred = explanation_pred_from_type(constraint_type);
            if ((NIL == constraints) && (NIL != constraint_pred)) {
                constraints = cons(czer_utilities.find_hl_gaf(list(constraint_pred, reln, col), mt), constraints);
            }
            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list(pred, arg, col)), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_arg_not_isa_disjoint_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        if (NIL != $use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return com.cyc.cycjava.cycl.wff_modules.new_explain_mal_arg_wrt_arg_not_isa_disjoint(why_not, io_mode);
        } else {
            return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_arg_not_isa_disjoint_int(why_not, $ARG_ISA, io_mode);
        }
    }

    public static SubLObject explain_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != $use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return new_explain_mal_arg_wrt_arg_not_isa_disjoint(why_not, wff_vars.get_wff_property(v_properties, $IO_MODE));
        }
        return explain_mal_arg_wrt_arg_not_isa_disjoint_int(why_not, $ARG_ISA, wff_vars.get_wff_property(v_properties, $IO_MODE), v_properties);
    }

    public static final SubLObject new_explain_mal_arg_wrt_arg_not_isa_disjoint_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not;
            SubLObject current = datum;
            SubLObject wff_module = NIL;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt143);
            wff_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt143);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
                SubLObject via_genl = (NIL != via_genl_pred) ? ((SubLObject) (via_genl_pred)) : via_genl_inverse;
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt163$Term__s_is_isa_disjoint_with_arg_, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl_pred ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, via_genl))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject at_constraint_gaf = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
                            SubLObject rejected_sentence = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
                            SubLObject term_violation = czer_utilities.find_hl_gaf(list($$not, list($$isa, arg, col)), mt);
                            SubLObject result = list(wff_module);
                            SubLObject explanation = NIL;
                            SubLObject justification = NIL;
                            result = cons(list($ARGUMENTS, arg, reln, pos, col, mt), result);
                            if (NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                                justification = cons(at_constraint_gaf, justification);
                            }
                            if (NIL != forts.fort_p(via_genl_pred)) {
                                {
                                    SubLObject genl_preds_literal = list($$genlPreds, reln, via_genl_pred);
                                    SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
                                    if (NIL != genl_pred_support) {
                                        justification = cons(genl_pred_support, justification);
                                    }
                                }
                            } else {
                                if (NIL != forts.fort_p(via_genl_inverse)) {
                                    {
                                        SubLObject genl_inverse_literal = list($$genlInverse, reln, via_genl_pred);
                                        SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_inverse_literal, mt, UNPROVIDED);
                                        if (NIL != genl_pred_support) {
                                            justification = cons(genl_pred_support, justification);
                                        }
                                    }
                                }
                            }
                            if (NIL != term_violation) {
                                explanation = cons(term_violation, explanation);
                                justification = cons(term_violation, justification);
                            }
                            if (NIL != explanation) {
                                result = cons(bq_cons($EXPLANATION, append(explanation, NIL)), result);
                            }
                            if (NIL != rejected_sentence) {
                                result = cons(list($CONSEQUENCE, list($$rejectedSentence, rejected_sentence)), result);
                            }
                            if (NIL != justification) {
                                result = cons(bq_cons($JUSTIFICATION, append(nreverse(justification), NIL)), result);
                            }
                            if (NIL != wff.provide_wff_suggestionsP()) {
                                {
                                    SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_not_isa_disjoint(why_not, UNPROVIDED);
                                    result = cons(cons($CANDIDATE_REPAIRS, suggestions), result);
                                }
                            }
                            return nreverse(result);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject new_explain_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        SubLObject wff_module = NIL;
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(why_not, why_not, $list166);
        wff_module = why_not.first();
        SubLObject current = why_not.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, why_not, $list166);
        mt = current.first();
        current = data = current.rest();
        final SubLObject via_genl_pred = cadr(assoc($VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl_inverse = cadr(assoc($VIA_GENL_INVERSE, data, UNPROVIDED, UNPROVIDED));
        final SubLObject via_genl = (NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str188$Term__s_is_isa_disjoint_with_arg_, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via_genl_pred ? format(NIL, $str101$_via__s___, via_genl) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql($HL)) {
            final SubLObject at_constraint_gaf = cadr(assoc($AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED));
            final SubLObject rejected_sentence = cadr(assoc($WFF_FORMULA, data, UNPROVIDED, UNPROVIDED));
            final SubLObject term_violation = czer_utilities.find_hl_gaf(list($$not, list($$isa, arg, col)), mt);
            SubLObject result = list(wff_module);
            SubLObject explanation = NIL;
            SubLObject justification = NIL;
            result = cons(list($ARGUMENTS, arg, reln, pos, col, mt), result);
            if (NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                justification = cons(at_constraint_gaf, justification);
            }
            if (NIL != forts.fort_p(via_genl_pred)) {
                final SubLObject genl_preds_literal = list($$genlPreds, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_preds_literal, mt, UNPROVIDED);
                if (NIL != genl_pred_support) {
                    justification = cons(genl_pred_support, justification);
                }
            } else
                if (NIL != forts.fort_p(via_genl_inverse)) {
                    final SubLObject genl_inverse_literal = list($$genlInverse, reln, via_genl_pred);
                    final SubLObject genl_pred_support = arguments.make_hl_support($GENLPREDS, genl_inverse_literal, mt, UNPROVIDED);
                    if (NIL != genl_pred_support) {
                        justification = cons(genl_pred_support, justification);
                    }
                }

            if (NIL != term_violation) {
                explanation = cons(term_violation, explanation);
                justification = cons(term_violation, justification);
            }
            if (NIL != explanation) {
                result = cons(bq_cons($EXPLANATION, append(explanation, NIL)), result);
            }
            if (NIL != rejected_sentence) {
                result = cons(list($CONSEQUENCE, list($$rejectedSentence, rejected_sentence)), result);
            }
            if (NIL != justification) {
                result = cons(bq_cons($JUSTIFICATION, append(nreverse(justification), NIL)), result);
            }
            if (NIL != wff.provide_wff_suggestionsP()) {
                final SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_not_isa_disjoint(why_not, UNPROVIDED);
                result = cons(cons($CANDIDATE_REPAIRS, suggestions), result);
            }
            return nreverse(result);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_arg_not_quoted_isa_disjoint_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_arg_not_isa_disjoint_int(why_not, $ARG_ISA, io_mode);
    }

    public static SubLObject explain_mal_arg_wrt_arg_not_quoted_isa_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return explain_mal_arg_wrt_arg_not_isa_disjoint_int(why_not, $ARG_ISA, wff_vars.get_wff_property(v_properties, $IO_MODE), v_properties);
    }

    public static final SubLObject explain_mal_arg_wrt_arg_not_genls_disjoint_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return com.cyc.cycjava.cycl.wff_modules.nl_explanation_from_why_not_with_disjoint(why_not, $ARG_GENLS);
            } else {
                if (pcase_var.eql($HL)) {
                    {
                        SubLObject constraints = com.cyc.cycjava.cycl.wff_modules.hl_explanation_from_why_not(why_not, $ARG_GENLS, UNPROVIDED);
                        SubLObject datum = why_not.rest();
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        SubLObject reln = NIL;
                        SubLObject pos = NIL;
                        SubLObject col = NIL;
                        SubLObject mt = NIL;
                        SubLObject data = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        col = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        mt = current.first();
                        current = current.rest();
                        data = current;
                        if (NIL == constraints) {
                            {
                                SubLObject genl_pred = kb_accessors.arg_genl_pred(pos, UNPROVIDED, UNPROVIDED);
                                if (NIL != genl_pred) {
                                    constraints = cons(czer_utilities.find_hl_gaf(list(genl_pred, reln, col), mt), constraints);
                                }
                            }
                        }
                        return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$disjointWith, arg, col), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_arg_not_genls_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return nl_explanation_from_why_not_with_disjoint(why_not, $ARG_GENLS, v_properties);
        }
        if (pcase_var.eql($HL)) {
            SubLObject constraints = hl_explanation_from_why_not(why_not, $ARG_GENLS, UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list149);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            mt = current.first();
            current = data = current.rest();
            if (NIL == constraints) {
                final SubLObject genl_pred = kb_accessors.arg_genl_pred(pos, UNPROVIDED, UNPROVIDED);
                if (NIL != genl_pred) {
                    constraints = cons(czer_utilities.find_hl_gaf(list(genl_pred, reln, col), mt), constraints);
                }
            }
            return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$disjointWith, arg, col), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_isa = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt171);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            ind_arg_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt171);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt172$Term__s_violates_inter_arg_isa__s, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt173$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject isa_pred = at_utilities.inter_arg_isa_pred(ind_pos, pos);
                                    SubLObject constraints = NIL;
                                    if (NIL != via) {
                                        {
                                            SubLObject pcase_var_1 = via.first();
                                            if (pcase_var_1.eql($VIA_GENL_INVERSE)) {
                                                {
                                                    SubLObject isa_inverse = at_utilities.inter_arg_isa_inverse(ind_pos, pos);
                                                    SubLObject inverse = second(via);
                                                    SubLObject constraints_2 = NIL;
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list(isa_inverse, inverse, ind_arg_isa, col), mt);
                                                        if (NIL != var) {
                                                            constraints_2 = cons(var, constraints_2);
                                                        }
                                                    }
                                                    if (NIL != constraints_2) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, inverse), mt);
                                                            if (NIL != var) {
                                                                constraints_2 = cons(var, constraints_2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (pcase_var_1.eql($VIA_GENL_PRED)) {
                                                    if (NIL != isa_pred) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list(isa_pred, second(via), ind_arg_isa, col), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                        if (NIL != constraints) {
                                                            {
                                                                SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                                                if (NIL != var) {
                                                                    constraints = cons(var, constraints);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == constraints) {
                                        if (NIL != isa_pred) {
                                            constraints = cons(czer_utilities.find_hl_gaf(list(isa_pred, reln, ind_arg_isa, col), mt), constraints);
                                        }
                                    }
                                    return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list($$isa, arg, col)), mt), cons(czer_utilities.find_hl_gaf(list($$isa, ind_arg, ind_arg_isa), mt), constraints)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt171);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list196);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list196);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str197$Term__s_violates_inter_arg_isa__s, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str198$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                final SubLObject isa_pred = at_utilities.inter_arg_isa_pred(ind_pos, pos);
                SubLObject constraints = NIL;
                if (NIL != via) {
                    final SubLObject pcase_var_$1 = via.first();
                    if (pcase_var_$1.eql($VIA_GENL_INVERSE)) {
                        final SubLObject isa_inverse = at_utilities.inter_arg_isa_inverse(ind_pos, pos);
                        final SubLObject inverse = second(via);
                        SubLObject constraints_$2 = NIL;
                        SubLObject var = czer_utilities.find_hl_gaf_if(list(isa_inverse, inverse, ind_arg_isa, col), mt);
                        if (NIL != var) {
                            constraints_$2 = cons(var, constraints_$2);
                        }
                        if (NIL != constraints_$2) {
                            var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, inverse), mt);
                            if (NIL != var) {
                                constraints_$2 = cons(var, constraints_$2);
                            }
                        }
                    } else
                        if (pcase_var_$1.eql($VIA_GENL_PRED) && (NIL != isa_pred)) {
                            SubLObject var2 = czer_utilities.find_hl_gaf_if(list(isa_pred, second(via), ind_arg_isa, col), mt);
                            if (NIL != var2) {
                                constraints = cons(var2, constraints);
                            }
                            if (NIL != constraints) {
                                var2 = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                if (NIL != var2) {
                                    constraints = cons(var2, constraints);
                                }
                            }
                        }

                }
                if ((NIL == constraints) && (NIL != isa_pred)) {
                    constraints = cons(czer_utilities.find_hl_gaf(list(isa_pred, reln, ind_arg_isa, col), mt), constraints);
                }
                return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list($$isa, arg, col)), mt), cons(czer_utilities.find_hl_gaf(list($$isa, ind_arg, ind_arg_isa), mt), constraints)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list196);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_not_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_isa = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt171);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            ind_arg_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt171);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt171);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt176$Term__s_violates_inter_arg_not_is, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt177$when_argument__s___s__not_isa__s_, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject not_isa_pred = at_utilities.inter_arg_not_isa_pred(ind_pos, pos);
                                    SubLObject constraints = NIL;
                                    if (NIL != via) {
                                        {
                                            SubLObject pcase_var_3 = via.first();
                                            if (pcase_var_3.eql($VIA_GENL_INVERSE)) {
                                                {
                                                    SubLObject isa_inverse = at_utilities.inter_arg_not_isa_inverse(ind_pos, pos);
                                                    SubLObject inverse = second(via);
                                                    SubLObject constraints_4 = NIL;
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list(isa_inverse, inverse, ind_arg_isa, col), mt);
                                                        if (NIL != var) {
                                                            constraints_4 = cons(var, constraints_4);
                                                        }
                                                    }
                                                    if (NIL != constraints_4) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, inverse), mt);
                                                            if (NIL != var) {
                                                                constraints_4 = cons(var, constraints_4);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (pcase_var_3.eql($VIA_GENL_PRED)) {
                                                    if (NIL != not_isa_pred) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list(not_isa_pred, second(via), ind_arg_isa, col), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                        if (NIL != constraints) {
                                                            {
                                                                SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                                                if (NIL != var) {
                                                                    constraints = cons(var, constraints);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == constraints) {
                                        if (NIL != not_isa_pred) {
                                            constraints = cons(czer_utilities.find_hl_gaf(list(not_isa_pred, reln, ind_arg_isa, col), mt), constraints);
                                        }
                                    }
                                    return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$isa, arg, col), mt), cons(czer_utilities.find_hl_gaf(list($$isa, ind_arg, ind_arg_isa), mt), constraints)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt171);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_not_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list196);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list196);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str201$Term__s_violates_inter_arg_not_is, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str202$when_argument__s___s__not_isa__s_, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                final SubLObject not_isa_pred = at_utilities.inter_arg_not_isa_pred(ind_pos, pos);
                SubLObject constraints = NIL;
                if (NIL != via) {
                    final SubLObject pcase_var_$3 = via.first();
                    if (pcase_var_$3.eql($VIA_GENL_INVERSE)) {
                        final SubLObject isa_inverse = at_utilities.inter_arg_not_isa_inverse(ind_pos, pos);
                        final SubLObject inverse = second(via);
                        SubLObject constraints_$4 = NIL;
                        SubLObject var = czer_utilities.find_hl_gaf_if(list(isa_inverse, inverse, ind_arg_isa, col), mt);
                        if (NIL != var) {
                            constraints_$4 = cons(var, constraints_$4);
                        }
                        if (NIL != constraints_$4) {
                            var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, inverse), mt);
                            if (NIL != var) {
                                constraints_$4 = cons(var, constraints_$4);
                            }
                        }
                    } else
                        if (pcase_var_$3.eql($VIA_GENL_PRED) && (NIL != not_isa_pred)) {
                            SubLObject var2 = czer_utilities.find_hl_gaf_if(list(not_isa_pred, second(via), ind_arg_isa, col), mt);
                            if (NIL != var2) {
                                constraints = cons(var2, constraints);
                            }
                            if (NIL != constraints) {
                                var2 = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                if (NIL != var2) {
                                    constraints = cons(var2, constraints);
                                }
                            }
                        }

                }
                if ((NIL == constraints) && (NIL != not_isa_pred)) {
                    constraints = cons(czer_utilities.find_hl_gaf(list(not_isa_pred, reln, ind_arg_isa, col), mt), constraints);
                }
                return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$isa, arg, col), mt), cons(czer_utilities.find_hl_gaf(list($$isa, ind_arg, ind_arg_isa), mt), constraints)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list196);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_genl_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_genl = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt180);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            ind_arg_genl = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt180);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt181$Term__s_violates_inter_arg_genl__, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, reln), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt182$when_argument__s___s__genl__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_genl }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject genl_pred = at_utilities.inter_arg_genl_pred(ind_pos, pos);
                                    SubLObject constraints = NIL;
                                    if (NIL != via) {
                                        {
                                            SubLObject pcase_var_5 = via.first();
                                            if (pcase_var_5.eql($VIA_GENL_INVERSE)) {
                                                {
                                                    SubLObject genl_inverse = at_utilities.inter_arg_genl_inverse(ind_pos, pos);
                                                    SubLObject inverse = second(via);
                                                    SubLObject constraints_6 = NIL;
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list(genl_inverse, inverse, ind_arg_genl, col), mt);
                                                        if (NIL != var) {
                                                            constraints_6 = cons(var, constraints_6);
                                                        }
                                                    }
                                                    if (NIL != constraints_6) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, inverse), mt);
                                                            if (NIL != var) {
                                                                constraints_6 = cons(var, constraints_6);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (pcase_var_5.eql($VIA_GENL_PRED)) {
                                                    if (NIL != genl_pred) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list(genl_pred, second(via), ind_arg_genl, col), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                        if (NIL != constraints) {
                                                            {
                                                                SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                                                if (NIL != var) {
                                                                    constraints = cons(var, constraints);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == constraints) {
                                        if (NIL != genl_pred) {
                                            constraints = cons(czer_utilities.find_hl_gaf(list(genl_pred, reln, ind_arg_genl, col), mt), constraints);
                                        }
                                    }
                                    return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list($$genls, arg, col)), mt), cons(czer_utilities.find_hl_gaf(list($$genls, ind_arg, ind_arg_genl), mt), constraints)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt180);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_genl = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list205);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        ind_arg_genl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list205);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str206$Term__s_violates_inter_arg_genl__, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, reln), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str207$when_argument__s___s__genl__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_genl }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                final SubLObject genl_pred = at_utilities.inter_arg_genl_pred(ind_pos, pos);
                SubLObject constraints = NIL;
                if (NIL != via) {
                    final SubLObject pcase_var_$5 = via.first();
                    if (pcase_var_$5.eql($VIA_GENL_INVERSE)) {
                        final SubLObject genl_inverse = at_utilities.inter_arg_genl_inverse(ind_pos, pos);
                        final SubLObject inverse = second(via);
                        SubLObject constraints_$6 = NIL;
                        SubLObject var = czer_utilities.find_hl_gaf_if(list(genl_inverse, inverse, ind_arg_genl, col), mt);
                        if (NIL != var) {
                            constraints_$6 = cons(var, constraints_$6);
                        }
                        if (NIL != constraints_$6) {
                            var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, inverse), mt);
                            if (NIL != var) {
                                constraints_$6 = cons(var, constraints_$6);
                            }
                        }
                    } else
                        if (pcase_var_$5.eql($VIA_GENL_PRED) && (NIL != genl_pred)) {
                            SubLObject var2 = czer_utilities.find_hl_gaf_if(list(genl_pred, second(via), ind_arg_genl, col), mt);
                            if (NIL != var2) {
                                constraints = cons(var2, constraints);
                            }
                            if (NIL != constraints) {
                                var2 = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                if (NIL != var2) {
                                    constraints = cons(var2, constraints);
                                }
                            }
                        }

                }
                if ((NIL == constraints) && (NIL != genl_pred)) {
                    constraints = cons(czer_utilities.find_hl_gaf(list(genl_pred, reln, ind_arg_genl, col), mt), constraints);
                }
                return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$not, list($$genls, arg, col)), mt), cons(czer_utilities.find_hl_gaf(list($$genls, ind_arg, ind_arg_genl), mt), constraints)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list205);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_defn_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_isa = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt185);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_arg_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt185);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt186$Term__s_violates_defns_of_inter_a, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt173$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_inter_arg_isa(why_not, io_mode);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt185);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list210);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list210);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str211$Term__s_violates_defns_of_inter_a, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str198$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                return explain_mal_arg_wrt_inter_arg_isa(why_not, $HL);
            }
        } else {
            cdestructuring_bind_error(datum, $list210);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_not_defn_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_isa = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt185);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_arg_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt185);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt189$Term__s_violates_defns_of_inter_a, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt177$when_argument__s___s__not_isa__s_, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_inter_arg_not_isa(why_not, io_mode);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt185);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_not_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list210);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list210);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str214$Term__s_violates_defns_of_inter_a, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str202$when_argument__s___s__not_isa__s_, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                return explain_mal_arg_wrt_inter_arg_not_isa(why_not, $HL);
            }
        } else {
            cdestructuring_bind_error(datum, $list210);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_not_isa_disjoint_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_isa = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt185);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_arg_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt185);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt192$Term__s_is_isa_disjoint_with_inte, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt173$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_inter_arg_isa(why_not, io_mode);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt185);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_not_isa_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list210);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list210);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str217$Term__s_is_isa_disjoint_with_inte, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str198$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                return explain_mal_arg_wrt_inter_arg_isa(why_not, $HL);
            }
        } else {
            cdestructuring_bind_error(datum, $list210);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_not_genl_disjoint_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject col = NIL;
            SubLObject ind_arg_genl = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt195);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            ind_arg_genl = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt195);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt195);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt196$Term__s_is_genl_disjoint_with_int, arg, col), new SubLObject[]{ format(NIL, $str_alt123$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt173$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_genl }), format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                return com.cyc.cycjava.cycl.wff_modules.explain_mal_arg_wrt_inter_arg_genl(why_not, io_mode);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt195);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_not_genl_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_genl = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list220);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        ind_arg_genl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list220);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str221$Term__s_is_genl_disjoint_with_int, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str198$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_genl }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                return explain_mal_arg_wrt_inter_arg_genl(why_not, $HL);
            }
        } else {
            cdestructuring_bind_error(datum, $list220);
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_isa_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list210);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list210);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str224$Term__s_is_not_a_spec_of__s__viol, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str198$when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                return simplifier.conjoin(list(make_negation(make_binary_formula($$genls, arg, col)), make_binary_formula($$isa, ind_arg, ind_arg_isa), list($$interArgIsaGenl, rel, ind_pos, ind_arg_isa, pos, col)), UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list210);
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_genl_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject rel = NIL;
        SubLObject pos = NIL;
        SubLObject col = NIL;
        SubLObject ind_arg_genl = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list220);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        rel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        ind_arg_genl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list220);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str228$Term__s_is_not_an_instance_of__s_, arg, col), new SubLObject[]{ format(NIL, $str131$applicable_to_argument__s_of_rela, pos, rel), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str229$when_argument__s___s__genls__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_genl }), format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                return simplifier.conjoin(list(make_negation(make_binary_formula($$isa, arg, col)), make_binary_formula($$genl, ind_arg, ind_arg_genl), list($$interArgIsaGenl, rel, ind_pos, ind_arg_genl, pos, col)), UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list220);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_arg_format_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject format = NIL;
            SubLObject mt = NIL;
            SubLObject violations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt199);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt199);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt199);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt199);
            format = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt199);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt199);
            violations = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt199);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt200$Term__s_violates_arg_format__s__, arg, format), new SubLObject[]{ format(NIL, $str_alt201$__applicable_to_argument__s_of_re, pos, reln), NIL != via ? ((SubLObject) (format(NIL, $str_alt202$___via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt203$__in_mt__s___, mt), NIL != violations ? ((SubLObject) (format(NIL, $str_alt204$______In_conflict__a_________a__, NIL != violations.rest() ? ((SubLObject) ($$$are)) : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str_alt208$________, $str_alt209$__and_______)))) : $str_alt17$ });
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject constraints = NIL;
                                    SubLObject pcase_var_7 = via.first();
                                    if (pcase_var_7.eql($VIA_GENL_PRED)) {
                                        {
                                            SubLObject format_pred = kb_accessors.argn_format_pred(pos);
                                            if (NIL != format_pred) {
                                                {
                                                    SubLObject var = czer_utilities.find_hl_gaf_if(list(format_pred, second(via), format), mt);
                                                    if (NIL != var) {
                                                        constraints = cons(var, constraints);
                                                    }
                                                }
                                                if (NIL != constraints) {
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                                        if (NIL != var) {
                                                            constraints = cons(var, constraints);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (pcase_var_7.eql($VIA_GENL_INVERSE)) {
                                            {
                                                SubLObject format_inverse = kb_accessors.argn_format_inverse(pos);
                                                if (NIL != format_inverse) {
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list(format_inverse, second(via), format), mt);
                                                        if (NIL != var) {
                                                            constraints = cons(var, constraints);
                                                        }
                                                    }
                                                    if (NIL != constraints) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, second(via)), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject format_pred = kb_accessors.argn_format_pred(pos);
                                                constraints = cons(czer_utilities.find_hl_gaf(list(format_pred, reln, format), mt), constraints);
                                            }
                                        }
                                    }
                                    if ((NIL != constraints) && (NIL != violations)) {
                                        return simplifier.conjoin(append(constraints, violations), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt199);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_arg_format(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject format = NIL;
        SubLObject mt = NIL;
        SubLObject violations = NIL;
        destructuring_bind_must_consp(current, datum, $list233);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list233);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list233);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list233);
        format = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list233);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list233);
        violations = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list233);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str234$Term__s_violates_arg_format__s__, arg, format), new SubLObject[]{ format(NIL, $str235$__applicable_to_argument__s_of_re, pos, reln), NIL != via ? format(NIL, $str236$___via__s___, second(via)) : $str18$, format(NIL, $str237$__in_mt__s___, mt), NIL != violations ? format(NIL, $str238$______In_conflict__a_________a__, NIL != violations.rest() ? $$$are : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str242$________, $str243$__and_______)) : $str18$ });
            }
            if (pcase_var.eql($HL)) {
                SubLObject constraints = NIL;
                final SubLObject pcase_var_$7 = via.first();
                if (pcase_var_$7.eql($VIA_GENL_PRED)) {
                    final SubLObject format_pred = kb_accessors.argn_format_pred(pos);
                    if (NIL != format_pred) {
                        SubLObject var = czer_utilities.find_hl_gaf_if(list(format_pred, second(via), format), mt);
                        if (NIL != var) {
                            constraints = cons(var, constraints);
                        }
                        if (NIL != constraints) {
                            var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                            if (NIL != var) {
                                constraints = cons(var, constraints);
                            }
                        }
                    }
                } else
                    if (pcase_var_$7.eql($VIA_GENL_INVERSE)) {
                        final SubLObject format_inverse = kb_accessors.argn_format_inverse(pos);
                        if (NIL != format_inverse) {
                            SubLObject var = czer_utilities.find_hl_gaf_if(list(format_inverse, second(via), format), mt);
                            if (NIL != var) {
                                constraints = cons(var, constraints);
                            }
                            if (NIL != constraints) {
                                var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, second(via)), mt);
                                if (NIL != var) {
                                    constraints = cons(var, constraints);
                                }
                            }
                        }
                    } else {
                        final SubLObject format_pred = kb_accessors.argn_format_pred(pos);
                        constraints = cons(czer_utilities.find_hl_gaf(list(format_pred, reln, format), mt), constraints);
                    }

                if ((NIL != constraints) && (NIL != violations)) {
                    return simplifier.conjoin(append(constraints, violations), UNPROVIDED);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list233);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_format_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject pos = NIL;
            SubLObject format = NIL;
            SubLObject ind_arg_isa = NIL;
            SubLObject ind_pos = NIL;
            SubLObject ind_arg = NIL;
            SubLObject mt = NIL;
            SubLObject violations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt212);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            format = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            ind_arg_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            ind_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            ind_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt212);
            violations = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt212);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt213$Term__s_violates_inter_arg_format, arg, format), new SubLObject[]{ format(NIL, $str_alt201$__applicable_to_argument__s_of_re, pos, reln), NIL != via ? ((SubLObject) (format(NIL, $str_alt202$___via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt214$__when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str_alt203$__in_mt__s___, mt), NIL != violations ? ((SubLObject) (format(NIL, $str_alt215$______In_conflict__a_________a, NIL != violations.rest() ? ((SubLObject) ($$$are)) : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str_alt208$________, $str_alt209$__and_______)))) : $str_alt17$ });
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject format_pred = kb_accessors.inter_arg_format_pred(ind_pos, pos);
                                    SubLObject constraints = NIL;
                                    if (NIL != via) {
                                        {
                                            SubLObject pcase_var_8 = via.first();
                                            if (pcase_var_8.eql($VIA_GENL_INVERSE)) {
                                                {
                                                    SubLObject format_inverse = kb_accessors.inter_arg_format_inverse(ind_pos, pos);
                                                    if (NIL != format_inverse) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list(format_inverse, second(via), ind_arg_isa, format), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                        if (NIL != constraints) {
                                                            {
                                                                SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, second(via)), mt);
                                                                if (NIL != var) {
                                                                    constraints = cons(var, constraints);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (pcase_var_8.eql($VIA_GENL_PRED)) {
                                                    if (NIL != format_pred) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list(format_pred, second(via), ind_arg_isa, format), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                        if (NIL != constraints) {
                                                            {
                                                                SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                                                if (NIL != var) {
                                                                    constraints = cons(var, constraints);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == constraints) {
                                        if (NIL != format_pred) {
                                            constraints = cons(czer_utilities.find_hl_gaf(list(format_pred, reln, ind_arg_isa, format), mt), constraints);
                                        }
                                    }
                                    if ((NIL != constraints) && (NIL != violations)) {
                                        return simplifier.conjoin(append(constraints, violations), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt212);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_format(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject pos = NIL;
        SubLObject format = NIL;
        SubLObject ind_arg_isa = NIL;
        SubLObject ind_pos = NIL;
        SubLObject ind_arg = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list246);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        format = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        ind_arg_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        ind_pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        ind_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list246);
        current = current.rest();
        if (NIL == current) {
            final SubLObject violations = NIL;
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str247$Term__s_violates_inter_arg_format, arg, format), new SubLObject[]{ format(NIL, $str235$__applicable_to_argument__s_of_re, pos, reln), NIL != via ? format(NIL, $str236$___via__s___, second(via)) : $str18$, format(NIL, $str248$__when_argument__s___s__isa__s__, new SubLObject[]{ ind_pos, ind_arg, ind_arg_isa }), format(NIL, $str237$__in_mt__s___, mt), NIL != violations ? format(NIL, $str249$______In_conflict__a_________a, NIL != violations.rest() ? $$$are : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str242$________, $str243$__and_______)) : $str18$ });
            }
            if (pcase_var.eql($HL)) {
                final SubLObject format_pred = kb_accessors.inter_arg_format_pred(ind_pos, pos);
                SubLObject constraints = NIL;
                if (NIL != via) {
                    final SubLObject pcase_var_$8 = via.first();
                    if (pcase_var_$8.eql($VIA_GENL_INVERSE)) {
                        final SubLObject format_inverse = kb_accessors.inter_arg_format_inverse(ind_pos, pos);
                        if (NIL != format_inverse) {
                            SubLObject var = czer_utilities.find_hl_gaf_if(list(format_inverse, second(via), ind_arg_isa, format), mt);
                            if (NIL != var) {
                                constraints = cons(var, constraints);
                            }
                            if (NIL != constraints) {
                                var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, second(via)), mt);
                                if (NIL != var) {
                                    constraints = cons(var, constraints);
                                }
                            }
                        }
                    } else
                        if (pcase_var_$8.eql($VIA_GENL_PRED) && (NIL != format_pred)) {
                            SubLObject var2 = czer_utilities.find_hl_gaf_if(list(format_pred, second(via), ind_arg_isa, format), mt);
                            if (NIL != var2) {
                                constraints = cons(var2, constraints);
                            }
                            if (NIL != constraints) {
                                var2 = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                if (NIL != var2) {
                                    constraints = cons(var2, constraints);
                                }
                            }
                        }

                }
                if ((NIL == constraints) && (NIL != format_pred)) {
                    constraints = cons(czer_utilities.find_hl_gaf(list(format_pred, reln, ind_arg_isa, format), mt), constraints);
                }
                if ((NIL != constraints) && (NIL != violations)) {
                    return simplifier.conjoin(append(constraints, violations), UNPROVIDED);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list246);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_arg_wrt_inter_arg_different_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject reln = NIL;
            SubLObject arg1 = NIL;
            SubLObject psn1 = NIL;
            SubLObject arg2 = NIL;
            SubLObject psn2 = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt218);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            psn1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            arg2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            psn2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            mt = current.first();
            current = current.rest();
            {
                SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt218);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt219$Terms__s_and__s_are_equal__which_, arg1, arg2), new SubLObject[]{ format(NIL, $str_alt220$applicable_to_arguments__s_and__s, new SubLObject[]{ psn1, psn2, reln }), NIL != via ? ((SubLObject) (format(NIL, $str_alt96$_via__s___, second(via)))) : $str_alt17$, format(NIL, $str_alt97$in_mt__s___, mt) });
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject constraints = NIL;
                                    if (NIL != via) {
                                        {
                                            SubLObject pcase_var_9 = via.first();
                                            if (pcase_var_9.eql($VIA_GENL_INVERSE)) {
                                                {
                                                    SubLObject var = czer_utilities.find_hl_gaf_if(list($$interArgDifferent, second(via), psn2, psn1), mt);
                                                    if (NIL != var) {
                                                        constraints = cons(var, constraints);
                                                    }
                                                }
                                                if (NIL != constraints) {
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, second(via)), mt);
                                                        if (NIL != var) {
                                                            constraints = cons(var, constraints);
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (pcase_var_9.eql($VIA_GENL_PRED)) {
                                                    {
                                                        SubLObject var = czer_utilities.find_hl_gaf_if(list($$interArgDifferent, second(via), psn1, psn2), mt);
                                                        if (NIL != var) {
                                                            constraints = cons(var, constraints);
                                                        }
                                                    }
                                                    if (NIL != constraints) {
                                                        {
                                                            SubLObject var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                                            if (NIL != var) {
                                                                constraints = cons(var, constraints);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == constraints) {
                                        constraints = cons(czer_utilities.find_hl_gaf(list($$interArgDifferent, reln, psn1, psn2), mt), constraints);
                                    }
                                    return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$equals, arg1, arg2), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt218);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_arg_wrt_inter_arg_different(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject reln = NIL;
        SubLObject arg1 = NIL;
        SubLObject psn1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject psn2 = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list252);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list252);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list252);
        psn1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list252);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list252);
        psn2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list252);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list252);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str253$Terms__s_and__s_are_equal__which_, arg1, arg2), new SubLObject[]{ format(NIL, $str254$applicable_to_arguments__s_and__s, new SubLObject[]{ psn1, psn2, reln }), NIL != via ? format(NIL, $str101$_via__s___, second(via)) : $str18$, format(NIL, $str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql($HL)) {
                SubLObject constraints = NIL;
                if (NIL != via) {
                    final SubLObject pcase_var_$9 = via.first();
                    if (pcase_var_$9.eql($VIA_GENL_INVERSE)) {
                        SubLObject var = czer_utilities.find_hl_gaf_if(list($$interArgDifferent, second(via), psn2, psn1), mt);
                        if (NIL != var) {
                            constraints = cons(var, constraints);
                        }
                        if (NIL != constraints) {
                            var = czer_utilities.find_hl_gaf_if(list($$genlInverse, reln, second(via)), mt);
                            if (NIL != var) {
                                constraints = cons(var, constraints);
                            }
                        }
                    } else
                        if (pcase_var_$9.eql($VIA_GENL_PRED)) {
                            SubLObject var = czer_utilities.find_hl_gaf_if(list($$interArgDifferent, second(via), psn1, psn2), mt);
                            if (NIL != var) {
                                constraints = cons(var, constraints);
                            }
                            if (NIL != constraints) {
                                var = czer_utilities.find_hl_gaf_if(list($$genlPreds, reln, second(via)), mt);
                                if (NIL != var) {
                                    constraints = cons(var, constraints);
                                }
                            }
                        }

                }
                if (NIL == constraints) {
                    constraints = cons(czer_utilities.find_hl_gaf(list($$interArgDifferent, reln, psn1, psn2), mt), constraints);
                }
                return simplifier.conjoin(remove(NIL, cons(czer_utilities.find_hl_gaf(list($$equals, arg1, arg2), mt), constraints), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list252);
        }
        return NIL;
    }

    public static final SubLObject explain_mal_reln_wrt_arg_isa_required_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject relation = NIL;
            SubLObject argnum = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt225);
            relation = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt225);
            argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt225);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = io_mode;
                    if (pcase_var.eql($NL)) {
                        return format(NIL, $str_alt226$argument__s_of__s_has_no___argIsa, new SubLObject[]{ argnum, relation, mt });
                    } else {
                        if (pcase_var.eql($HL)) {
                            return list($$ist, mt, list($$unknownSentence, list($$thereExists, $sym228$_COL, listS($$argIsa, relation, $list_alt230))));
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt225);
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_reln_wrt_arg_isa_required(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject relation = NIL;
        SubLObject argnum = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list259);
        relation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list259);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list259);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return format(NIL, $str260$argument__s_of__s_has_no___argIsa, new SubLObject[]{ argnum, relation, mt });
            }
            if (pcase_var.eql($HL)) {
                return list($$ist, mt, list($$unknownSentence, list($$thereExists, $sym262$_COL, listS($$argIsa, relation, $list264))));
            }
        } else {
            cdestructuring_bind_error(datum, $list259);
        }
        return NIL;
    }

    public static final SubLObject explain_conflict_asserting_true_sbhl_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt233);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt233);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = literal_predicate(asent, UNPROVIDED);
                    SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
                    SubLObject why = NIL;
                    SubLObject detailed_explanation = $str_alt17$;
                    SubLObject pcase_var = io_mode;
                    if (pcase_var.eql($NL)) {
                        why = com.cyc.cycjava.cycl.wff_modules.why_sbhl_false(pred, arg1, arg2, mt);
                        if (NIL != why) {
                            detailed_explanation = format(NIL, $str_alt234$sbhl_conflict___s__a__a________be, new SubLObject[]{ asent, $TRUE, mt, string_utilities.stringify_items(why, STRINGIFY_ITEMS, $str_alt237$_________________, UNPROVIDED) });
                        }
                        return format(NIL, $str_alt238$_s_is_known_not_to_be__a__s_in_mt, new SubLObject[]{ arg1, com.cyc.cycjava.cycl.wff_modules.sbhl_nl_inverse(pred), arg2, mt, detailed_explanation });
                    } else {
                        if (pcase_var.eql($HL)) {
                            return list($$ist, mt, list($$not, list(pred, arg1, arg2)));
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt233);
            }
        }
        return NIL;
    }

    public static SubLObject explain_conflict_asserting_true_sbhl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list267);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list267);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = literal_predicate(asent, UNPROVIDED);
            final SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
            SubLObject why = NIL;
            SubLObject detailed_explanation = $str18$;
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                why = why_sbhl_false(pred, arg1, arg2, mt);
                if (NIL != why) {
                    detailed_explanation = format(NIL, $str268$sbhl_conflict___s__a__a________be, new SubLObject[]{ asent, $TRUE, mt, string_utilities.stringify_items(why, STRINGIFY_ITEMS, $str271$_________________, UNPROVIDED) });
                }
                return format(NIL, $str272$_s_is_known_not_to_be__a__s_in_mt, new SubLObject[]{ arg1, sbhl_nl_inverse(pred), arg2, mt, detailed_explanation });
            }
            if (pcase_var.eql($HL)) {
                return list($$ist, mt, list($$not, list(pred, arg1, arg2)));
            }
        } else {
            cdestructuring_bind_error(datum, $list267);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; explanation of why an (PRED ARG1 ARG2) is known to be false via sbhl inference
     */
    @LispMethod(comment = "@return listp; explanation of why an (PRED ARG1 ARG2) is known to be false via sbhl inference")
    public static final SubLObject why_sbhl_false_alt(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
            {
                SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    return sbhl_search_methods.why_sbhl_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
                } else {
                    return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; explanation of why an (PRED ARG1 ARG2) is known to be false via sbhl inference
     */
    @LispMethod(comment = "@return listp; explanation of why an (PRED ARG1 ARG2) is known to be false via sbhl inference")
    public static SubLObject why_sbhl_false(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
            return NIL;
        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            return sbhl_search_methods.why_sbhl_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
        }
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sbhl_nl_inverse_alt(SubLObject pred) {
        {
            SubLObject nl_inverse = $$$related_to;
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$isa)) {
                nl_inverse = $$$an_instance_of;
            } else {
                if (pcase_var.eql($$genls)) {
                    nl_inverse = $$$a_spec_of;
                } else {
                    if (pcase_var.eql($$genlMt)) {
                        nl_inverse = $$$a_spec_mt_of;
                    } else {
                        if (pcase_var.eql($$genlPreds)) {
                            nl_inverse = $$$a_spec_pred_of;
                        } else {
                            if (pcase_var.eql($$genlInverse)) {
                                nl_inverse = $$$a_spec_inverse_of;
                            }
                        }
                    }
                }
            }
            return nl_inverse;
        }
    }

    public static SubLObject sbhl_nl_inverse(final SubLObject pred) {
        SubLObject nl_inverse = $$$related_to;
        if (pred.eql($$isa)) {
            nl_inverse = $$$an_instance_of;
        } else
            if (pred.eql($$genls)) {
                nl_inverse = $$$a_spec_of;
            } else
                if (pred.eql($$genlMt)) {
                    nl_inverse = $$$a_spec_mt_of;
                } else
                    if (pred.eql($$genlPreds)) {
                        nl_inverse = $$$a_spec_pred_of;
                    } else
                        if (pred.eql($$genlInverse)) {
                            nl_inverse = $$$a_spec_inverse_of;
                        }




        return nl_inverse;
    }

    public static final SubLObject explain_conflict_asserting_false_sbhl_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt233);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt233);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = literal_predicate(asent, UNPROVIDED);
                    SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
                    SubLObject why = NIL;
                    SubLObject detailed_explanation = $str_alt17$;
                    SubLObject pcase_var = io_mode;
                    if (pcase_var.eql($NL)) {
                        why = com.cyc.cycjava.cycl.wff_modules.why_sbhl_true(pred, arg1, arg2, mt);
                        if (NIL != why) {
                            detailed_explanation = format(NIL, $str_alt248$sbhl_conflict___s__a__a________be, new SubLObject[]{ asent, $FALSE, mt, string_utilities.stringify_items(why, STRINGIFY_ITEMS, $str_alt237$_________________, UNPROVIDED) });
                        }
                        return format(NIL, $str_alt250$_s_is_known_to_be__a__s_in_mt__s_, new SubLObject[]{ arg1, com.cyc.cycjava.cycl.wff_modules.sbhl_nl_inverse(pred), arg2, mt, detailed_explanation });
                    } else {
                        if (pcase_var.eql($HL)) {
                            return list($$ist, mt, list(pred, arg1, arg2));
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt233);
            }
        }
        return NIL;
    }

    public static SubLObject explain_conflict_asserting_false_sbhl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list267);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list267);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = literal_predicate(asent, UNPROVIDED);
            final SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
            SubLObject why = NIL;
            SubLObject detailed_explanation = $str18$;
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                why = why_sbhl_true(pred, arg1, arg2, mt);
                if (NIL != why) {
                    detailed_explanation = format(NIL, $str282$sbhl_conflict___s__a__a________be, new SubLObject[]{ asent, $FALSE, mt, string_utilities.stringify_items(why, STRINGIFY_ITEMS, $str271$_________________, UNPROVIDED) });
                }
                return format(NIL, $str284$_s_is_known_to_be__a__s_in_mt__s_, new SubLObject[]{ arg1, sbhl_nl_inverse(pred), arg2, mt, detailed_explanation });
            }
            if (pcase_var.eql($HL)) {
                return list($$ist, mt, list(pred, arg1, arg2));
            }
        } else {
            cdestructuring_bind_error(datum, $list267);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; explanation of why (PRED ARG1 ARG2) is known to be true via sbhl inference
     */
    @LispMethod(comment = "@return listp; explanation of why (PRED ARG1 ARG2) is known to be true via sbhl inference")
    public static final SubLObject why_sbhl_true_alt(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
            return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; explanation of why (PRED ARG1 ARG2) is known to be true via sbhl inference
     */
    @LispMethod(comment = "@return listp; explanation of why (PRED ARG1 ARG2) is known to be true via sbhl inference")
    public static SubLObject why_sbhl_true(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
            return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject explain_disjointed_arg_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject disjoint = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt253);
            disjoint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt253);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt254$Variable__s_is_subject_to_disjoin, new SubLObject[]{ var, disjoint, mt }), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject isa_lits = NIL;
                            SubLObject cdolist_list_var = disjoint;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                isa_lits = cons(list($$isa, var, col), isa_lits);
                            }
                            return list($$ist, mt, list($$not, bq_cons($$and, append(isa_lits, NIL))));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_disjointed_arg_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject var = NIL;
        SubLObject disjoint = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        disjoint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        mt = current.first();
        current = data = current.rest();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str288$Variable__s_is_subject_to_disjoin, new SubLObject[]{ var, disjoint, mt }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql($HL)) {
            SubLObject isa_lits = NIL;
            SubLObject cdolist_list_var = disjoint;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                isa_lits = cons(list($$isa, var, col), isa_lits);
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            return list($$ist, mt, list($$not, bq_cons($$and, append(isa_lits, NIL))));
        }
        return NIL;
    }

    public static final SubLObject nl_explanation_of_verbose_data_alt(SubLObject data) {
        {
            SubLObject explanation_string = $str_alt17$;
            SubLObject wff_formula = NIL;
            SubLObject original_formula = NIL;
            SubLObject expansion_formula = NIL;
            SubLObject cdolist_list_var = data;
            SubLObject formula_type_formula = NIL;
            for (formula_type_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_type_formula = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = formula_type_formula.first();
                    if (pcase_var.eql($WFF_FORMULA)) {
                        wff_formula = second(formula_type_formula);
                    } else {
                        if (pcase_var.eql($WFF_EXPANSION_FORMULA)) {
                            expansion_formula = second(formula_type_formula);
                        } else {
                            if (pcase_var.eql($WFF_ORIGINAL_FORMULA)) {
                                original_formula = second(formula_type_formula);
                            }
                        }
                    }
                }
            }
            if (wff_formula.equal(original_formula)) {
                if ((NIL != wff_formula) && (NIL != expansion_formula)) {
                    explanation_string = cconcatenate(explanation_string, format(NIL, $str_alt258$__Original_formula______s, wff_formula));
                    explanation_string = cconcatenate(explanation_string, format(NIL, $str_alt259$__Expansion_formula______s, expansion_formula));
                }
            } else {
                if (NIL != original_formula) {
                    explanation_string = cconcatenate(explanation_string, format(NIL, $str_alt258$__Original_formula______s, original_formula));
                }
                if (NIL != wff_formula) {
                    explanation_string = cconcatenate(explanation_string, format(NIL, $str_alt260$__WFF_checked_formula______s, wff_formula));
                }
                if (NIL != expansion_formula) {
                    explanation_string = cconcatenate(explanation_string, format(NIL, $str_alt259$__Expansion_formula______s, expansion_formula));
                }
            }
            return explanation_string;
        }
    }

    public static SubLObject nl_explanation_of_verbose_data(final SubLObject data) {
        SubLObject explanation_string = $str18$;
        SubLObject wff_formula = NIL;
        SubLObject original_formula = NIL;
        SubLObject expansion_formula = NIL;
        SubLObject cdolist_list_var = data;
        SubLObject formula_type_formula = NIL;
        formula_type_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = formula_type_formula.first();
            if (pcase_var.eql($WFF_FORMULA)) {
                wff_formula = second(formula_type_formula);
            } else
                if (pcase_var.eql($WFF_EXPANSION_FORMULA)) {
                    expansion_formula = second(formula_type_formula);
                } else
                    if (pcase_var.eql($WFF_ORIGINAL_FORMULA)) {
                        original_formula = second(formula_type_formula);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            formula_type_formula = cdolist_list_var.first();
        } 
        if (wff_formula.equal(original_formula)) {
            if ((NIL != wff_formula) && (NIL != expansion_formula)) {
                explanation_string = cconcatenate(explanation_string, format(NIL, $str292$__Original_formula______s, wff_formula));
                explanation_string = cconcatenate(explanation_string, format(NIL, $str293$__Expansion_formula______s, expansion_formula));
            }
        } else {
            if (NIL != original_formula) {
                explanation_string = cconcatenate(explanation_string, format(NIL, $str292$__Original_formula______s, original_formula));
            }
            if (NIL != wff_formula) {
                explanation_string = cconcatenate(explanation_string, format(NIL, $str294$__WFF_checked_formula______s, wff_formula));
            }
            if (NIL != expansion_formula) {
                explanation_string = cconcatenate(explanation_string, format(NIL, $str293$__Expansion_formula______s, expansion_formula));
            }
        }
        return explanation_string;
    }

    public static final SubLObject explain_disjointed_arg_quoted_isa_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject disjoint = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt253);
            disjoint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt253);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt254$Variable__s_is_subject_to_disjoin, new SubLObject[]{ var, disjoint, mt }), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject quoted_isa_lits = NIL;
                            SubLObject cdolist_list_var = disjoint;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                quoted_isa_lits = cons(list($$quotedIsa, var, col), quoted_isa_lits);
                            }
                            return list($$ist, mt, list($$not, bq_cons($$and, append(quoted_isa_lits, NIL))));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_disjointed_arg_quoted_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject var = NIL;
        SubLObject disjoint = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        disjoint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        mt = current.first();
        current = data = current.rest();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str288$Variable__s_is_subject_to_disjoin, new SubLObject[]{ var, disjoint, mt }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql($HL)) {
            SubLObject quoted_isa_lits = NIL;
            SubLObject cdolist_list_var = disjoint;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                quoted_isa_lits = cons(list($$quotedIsa, var, col), quoted_isa_lits);
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            return list($$ist, mt, list($$not, bq_cons($$and, append(quoted_isa_lits, NIL))));
        }
        return NIL;
    }

    public static final SubLObject explain_disjointed_arg_genl_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject disjoint = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt253);
            disjoint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt253);
            mt = current.first();
            current = current.rest();
            data = current;
            {
                SubLObject pcase_var = io_mode;
                if (pcase_var.eql($NL)) {
                    return cconcatenate(format(NIL, $str_alt265$Variable__s_is_subject_to_disjoin, new SubLObject[]{ var, disjoint, mt }), com.cyc.cycjava.cycl.wff_modules.nl_explanation_of_verbose_data(data));
                } else {
                    if (pcase_var.eql($HL)) {
                        {
                            SubLObject genl_lits = NIL;
                            SubLObject cdolist_list_var = disjoint;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                genl_lits = cons(list($$genls, var, col), genl_lits);
                            }
                            return list($$ist, mt, list($$not, bq_cons($$and, append(genl_lits, NIL))));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_disjointed_arg_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject var = NIL;
        SubLObject disjoint = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        disjoint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        mt = current.first();
        current = data = current.rest();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format(NIL, $str299$Variable__s_is_subject_to_disjoin, new SubLObject[]{ var, disjoint, mt }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql($HL)) {
            SubLObject genl_lits = NIL;
            SubLObject cdolist_list_var = disjoint;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                genl_lits = cons(list($$genls, var, col), genl_lits);
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            return list($$ist, mt, list($$not, bq_cons($$and, append(genl_lits, NIL))));
        }
        return NIL;
    }

    public static final SubLObject explain_isolated_terms_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    SubLObject terms = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt268);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt268);
                    terms = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != singletonP(terms)) {
                            return format(NIL, $str_alt269$__s_is_an_isolated_term_in___s___, terms.first(), sentence);
                        } else {
                            return format(NIL, $str_alt270$__s__are_isolated_terms_in___s___, string_utilities.stringify_items(terms, symbol_function(STR_BY_TYPE), $str_alt6$__, $str_alt7$__and_), sentence);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt268);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_isolated_terms(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = NIL;
            SubLObject terms = NIL;
            destructuring_bind_must_consp(current, datum, $list302);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list302);
            terms = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != list_utilities.singletonP(terms)) {
                    return format(NIL, $str303$__s_is_an_isolated_term_in___s___, terms.first(), sentence);
                }
                return format(NIL, $str304$__s__are_isolated_terms_in___s___, string_utilities.stringify_items(terms, symbol_function(STR_BY_TYPE), $str6$__, $str7$__and_), sentence);
            } else {
                cdestructuring_bind_error(datum, $list302);
            }
        }
        return NIL;
    }

    public static final SubLObject explain_irrelevant_literals_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    SubLObject irrelevant = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt274);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt274);
                    irrelevant = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != singletonP(irrelevant)) {
                            return format(NIL, $str_alt275$__s_is_irrelevant_in___s___, irrelevant.first(), sentence);
                        } else {
                            return format(NIL, $str_alt276$__s__are_irrelevant_in___s___, string_utilities.stringify_items(irrelevant, symbol_function(STR_BY_TYPE), $str_alt6$__, $str_alt7$__and_), sentence);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt274);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_irrelevant_literals(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = NIL;
            SubLObject irrelevant = NIL;
            destructuring_bind_must_consp(current, datum, $list308);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list308);
            irrelevant = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != list_utilities.singletonP(irrelevant)) {
                    return format(NIL, $str309$__s_is_irrelevant_in___s___, irrelevant.first(), sentence);
                }
                return format(NIL, $str310$__s__are_irrelevant_in___s___, string_utilities.stringify_items(irrelevant, symbol_function(STR_BY_TYPE), $str6$__, $str7$__and_), sentence);
            } else {
                cdestructuring_bind_error(datum, $list308);
            }
        }
        return NIL;
    }

    public static final SubLObject explain_restricted_skolem_assertion_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject literal = cadr(why_not);
                    SubLObject pred = literal_predicate(literal, UNPROVIDED);
                    SubLObject sk = tree_find_if(symbol_function($sym279$REIFIED_SKOLEM_FN_IN_ANY_MT_), literal, UNPROVIDED);
                    return format(NIL, $str_alt280$Asserting_a_sentence_that_referen, sk, pred);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_restricted_skolem_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject literal = cadr(why_not);
            final SubLObject pred = literal_predicate(literal, UNPROVIDED);
            final SubLObject sk = list_utilities.tree_find_if(symbol_function($sym313$REIFIED_SKOLEM_FN_IN_ANY_MT_), literal, UNPROVIDED);
            return format(NIL, $str314$Asserting_a_sentence_that_referen, sk, pred);
        }
        return NIL;
    }

    public static final SubLObject explain_restricted_predicate_assertion_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject literal = second(why_not);
            SubLObject pred = literal_predicate(literal, UNPROVIDED);
            SubLObject mt = third(why_not);
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt283$Asserting_a_literal_with_predicat, pred, mt);
            } else {
                if (pcase_var.eql($HL)) {
                    return list($$ist, mt, list($$notAssertible, pred));
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_restricted_predicate_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject literal = second(why_not);
        final SubLObject pred = literal_predicate(literal, UNPROVIDED);
        final SubLObject mt = third(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str317$Asserting_a_literal_with_predicat, pred, mt);
        }
        if (pcase_var.eql($HL)) {
            return list($$ist, mt, list($$notAssertible, pred));
        }
        return NIL;
    }

    public static final SubLObject explain_restricted_collection_assertion_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject literal = second(why_not);
            SubLObject collection = literal_arg2(literal, UNPROVIDED);
            SubLObject mt = third(why_not);
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt287$Asserting_an___isa_literal_with_c, collection, mt);
            } else {
                if (pcase_var.eql($HL)) {
                    return list($$ist, mt, list($$notAssertibleCollection, collection));
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_restricted_collection_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject literal = second(why_not);
        final SubLObject collection = literal_arg2(literal, UNPROVIDED);
        final SubLObject mt = third(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str321$Asserting_an___isa_literal_with_c, collection, mt);
        }
        if (pcase_var.eql($HL)) {
            return list($$ist, mt, list($$notAssertibleCollection, collection));
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-VARIABLES"), makeKeyword("COMMENT"), makeString("The sentence has at least one variable which is not a valid variable name."));

    static private final SubLList $list_alt3 = list(makeSymbol("VARIABLES"), makeSymbol("SENTENCE"));

    public static final SubLObject explain_evaluatable_literal_false_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject literal = second(why_not);
            SubLObject mt = third(why_not);
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt291$Asserting_a_sentence_in_mt__s____, mt, literal);
            } else {
                if (pcase_var.eql($HL)) {
                    return list($$ist, mt, list($$not, literal));
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_evaluatable_literal_false(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject literal = second(why_not);
        final SubLObject mt = third(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str325$Asserting_a_sentence_in_mt__s____, mt, literal);
        }
        if (pcase_var.eql($HL)) {
            return list($$ist, mt, list($$not, literal));
        }
        return NIL;
    }

    static private final SubLString $str_alt4$Sentence__s_contains_invalid_vari = makeString("Sentence ~s contains invalid variable~P: ~a ~% which do~[~;es~:;~] not satisfy the regular expression ~a~%");

    static private final SubLString $str_alt6$__ = makeString(", ");

    static private final SubLString $str_alt7$__and_ = makeString(", and ");

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("CycLVariable"));

    public static final SubLObject explain_except_for_wXo_singleton_var_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject literal = cadr(why_not);
                    SubLObject vars = referenced_variables(literal_arg2(literal, UNPROVIDED), UNPROVIDED);
                    return format(NIL, $str_alt294$__exceptFor_sentence_arg2_must_ha, new SubLObject[]{ length(vars), NIL != vars ? ((SubLObject) ($str_alt295$__)) : $str_alt17$, string_utilities.stringify_items(vars, symbol_function(STR_BY_TYPE), $str_alt6$__, $str_alt7$__and_) });
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_except_for_wXo_singleton_var(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject literal = cadr(why_not);
            final SubLObject vars = referenced_variables(literal_arg2(literal, UNPROVIDED), UNPROVIDED);
            return format(NIL, $str328$__exceptFor_sentence_arg2_must_ha, new SubLObject[]{ length(vars), NIL != vars ? $str329$__ : $str18$, string_utilities.stringify_items(vars, symbol_function(STR_BY_TYPE), $str6$__, $str7$__and_) });
        }
        return NIL;
    }

    static private final SubLList $list_alt13 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-SENTENCE"), makeKeyword("COMMENT"), makeString("Not a well-formed sentence."));

    static private final SubLList $list_alt14 = list(makeSymbol("SENTENCE"), makeSymbol("MT"));

    static private final SubLString $str_alt15$_s_is_not_a_well_formed_sentence_ = makeString("~s is not a well-formed sentence in ~s.~%");

    static private final SubLString $str_alt16$Perhaps__s_is_insufficiently_defi = makeString("Perhaps ~s is insufficiently defined in mt ~s.~%");

    static private final SubLString $str_alt18$_s_is_not_a_well_formed_sentence_ = makeString("~s is not a well-formed sentence.~%");

    public static final SubLObject explain_invalid_mt_for_tou_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject mt = caddr(why_not);
                    return format(NIL, $str_alt298$attempt_to_assert___termOfUnit_ga, mt, mt_vars.$tou_mt$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_invalid_mt_for_tou(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject mt = list_utilities.caddr(why_not);
            return format(NIL, $str332$attempt_to_assert___termOfUnit_ga, mt, mt_vars.$tou_mt$.getGlobalValue());
        }
        return NIL;
    }

    static private final SubLString $str_alt19$Perhaps__s_is_insufficiently_defi = makeString("Perhaps ~s is insufficiently defined.~%");

    public static final SubLObject explain_non_defn_pred_in_vocab_mt_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject asent = second(why_not);
                    SubLObject pred = cycl_utilities.sentence_arg0(asent);
                    SubLObject mt = third(why_not);
                    return format(NIL, $str_alt301$attempt_to_assert_gaf_with_non_de, pred, mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_non_defn_pred_in_vocab_mt(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject asent = second(why_not);
            final SubLObject pred = cycl_utilities.sentence_arg0(asent);
            final SubLObject mt = third(why_not);
            return format(NIL, $str335$attempt_to_assert_gaf_with_non_de, pred, mt);
        }
        return NIL;
    }

    static private final SubLList $list_alt24 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-AN-ASCII-STRING"), makeKeyword("COMMENT"), makeString("The sentence references a non-ASCII string."));

    static private final SubLList $list_alt25 = list(makeSymbol("STRING"));

    static private final SubLString $str_alt26$String__s_contains_non_ASCII_char = makeString("String ~s contains non-ASCII characters.~%");

    static private final SubLList $list_alt28 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-FORTS"), makeKeyword("COMMENT"), makeString("The sentence references invalid (undefined) Forts."));

    public static final SubLObject explain_predicate_isa_violation_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt304);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt304);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt304);
            mt = current.first();
            current = current.rest();
            {
                SubLObject violations = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt304);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt305$___isa__s__s__in_mt__s__, new SubLObject[]{ pred, col, mt }), NIL != violations ? ((SubLObject) (format(NIL, $str_alt215$______In_conflict__a_________a, NIL != violations.rest() ? ((SubLObject) ($$$are)) : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str_alt208$________, $str_alt209$__and_______)))) : $str_alt17$);
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject constraint = czer_utilities.find_hl_gaf(list($$isa, pred, col), mt);
                                    if (NIL != constraint) {
                                        if (NIL != violations) {
                                            return simplifier.conjoin(cons(constraint, violations), UNPROVIDED);
                                        } else {
                                            return constraint;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt304);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_predicate_isa_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject pred = NIL;
        SubLObject col = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list338);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list338);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list338);
        mt = current.first();
        current = current.rest();
        final SubLObject violations = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list338);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str339$___isa__s__s__in_mt__s__, new SubLObject[]{ pred, col, mt }), NIL != violations ? format(NIL, $str249$______In_conflict__a_________a, NIL != violations.rest() ? $$$are : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str242$________, $str243$__and_______)) : $str18$);
            }
            if (pcase_var.eql($HL)) {
                final SubLObject constraint = czer_utilities.find_hl_gaf(list($$isa, pred, col), mt);
                if (NIL != constraint) {
                    if (NIL != violations) {
                        return simplifier.conjoin(cons(constraint, violations), UNPROVIDED);
                    }
                    return constraint;
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list338);
        }
        return NIL;
    }

    static private final SubLString $str_alt29$References_invalid_forts___a___ = makeString("References invalid forts: ~a.~%");

    static private final SubLList $list_alt31 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-FORT"), makeKeyword("COMMENT"), makeString("The sentence references an invalid (undefined) Fort."));

    static private final SubLList $list_alt32 = list(makeSymbol("FORT"));

    static private final SubLString $str_alt33$FORT__s_is_invalid___ = makeString("FORT ~s is invalid.~%");

    static private final SubLList $list_alt35 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARITY"), makeKeyword("COMMENT"), makeString("The arity of a predicate is a Non-Negative Integer."));

    static private final SubLList $list_alt36 = listS(makeSymbol("ARITY-PRED"), makeSymbol("RELATION"), makeSymbol("ARITY"), makeSymbol("DATA"));

    static private final SubLString $str_alt37$The__s_of__s_should_be_a___NonNeg = makeString("The ~s of ~s should be a #$NonNegativeInteger is ~s.~%");

    static private final SubLList $list_alt39 = list(reader_make_constant_shell("NonNegativeInteger"));

    static private final SubLList $list_alt41 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-ARITY-MISMATCH"), makeKeyword("COMMENT"), makeString("The number of arguments applied to the relation in the sentence was different than the number of arguments it expected"));

    static private final SubLList $list_alt42 = listS(makeSymbol("SENTENCE"), makeSymbol("RELATION"), makeSymbol("DESCRIPTION"), makeSymbol("EXPECTED-ARGNUM"), makeSymbol("GIVEN-ARGNUM"), makeSymbol("DATA"));

    static private final SubLString $str_alt43$Arity_mismatch_in__A___A_is_a_n__ = makeString("Arity mismatch in ~A: ~A is a(n) ~A, so it expects ~D argument~:P, but it is being applied to ~D argument~:P.~%");

    public static final SubLObject explain_meta_predicate_violation_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject meta_pred = NIL;
            SubLObject meta_pred_value = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt308);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt308);
            meta_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt308);
            meta_pred_value = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt308);
            mt = current.first();
            current = current.rest();
            {
                SubLObject violations = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt308);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = io_mode;
                        if (pcase_var.eql($NL)) {
                            return cconcatenate(format(NIL, $str_alt309$__s__s__s__in_mt__s__, new SubLObject[]{ meta_pred, pred, meta_pred_value, mt }), NIL != violations ? ((SubLObject) (format(NIL, $str_alt215$______In_conflict__a_________a, NIL != violations.rest() ? ((SubLObject) ($$$are)) : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str_alt208$________, $str_alt209$__and_______)))) : $str_alt17$);
                        } else {
                            if (pcase_var.eql($HL)) {
                                {
                                    SubLObject constraint = czer_utilities.find_hl_gaf(list(meta_pred, pred, meta_pred_value), mt);
                                    if ((NIL != constraint) && (NIL != violations)) {
                                        return simplifier.conjoin(cons(constraint, violations), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt308);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_meta_predicate_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject pred = NIL;
        SubLObject meta_pred = NIL;
        SubLObject meta_pred_value = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list342);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        meta_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        meta_pred_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        mt = current.first();
        current = current.rest();
        final SubLObject violations = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list342);
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return cconcatenate(format(NIL, $str343$__s__s__s__in_mt__s__, new SubLObject[]{ meta_pred, pred, meta_pred_value, mt }), NIL != violations ? format(NIL, $str249$______In_conflict__a_________a, NIL != violations.rest() ? $$$are : $$$is, string_utilities.stringify_items(violations, symbol_function(ASSERTION_FI_IST_FORMULA), $str242$________, $str243$__and_______)) : $str18$);
            }
            if (pcase_var.eql($HL)) {
                final SubLObject constraint = czer_utilities.find_hl_gaf(list(meta_pred, pred, meta_pred_value), mt);
                if ((NIL != constraint) && (NIL != violations)) {
                    return simplifier.conjoin(cons(constraint, violations), UNPROVIDED);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list342);
        }
        return NIL;
    }

    static private final SubLList $list_alt45 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-VIOLATED-ARITY"), makeKeyword("COMMENT"), makeString("The sentence contains use of a predicate which does not conform to the arity of the relation."));

    static private final SubLList $list_alt46 = listS(makeSymbol("ARITY-PRED"), makeSymbol("RELATION"), makeSymbol("ARITY"), makeSymbol("SENTENCE"), makeSymbol("DATA"));

    static private final SubLString $str_alt47$The__s_of__s_is__s___ = makeString("The ~s of ~s is ~s.~%");

    static private final SubLList $list_alt54 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MISSING-ARITY"), makeKeyword("COMMENT"), makeString("The sentence uses a relation whose arity has not yet been defined."));

    static private final SubLList $list_alt55 = listS(makeSymbol("RELATION"), makeSymbol("ARITY"), makeSymbol("SENTENCE"), makeSymbol("DATA"));

    static private final SubLString $str_alt56$The_arity_of__s_is_unknown___ = makeString("The arity of ~s is unknown.~%");

    static private final SubLList $list_alt58 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MALFORMED-ARGS"), makeKeyword("COMMENT"), makeString("The relation got malformed argument list"));

    static private final SubLList $list_alt59 = list(makeSymbol("DESCRIPTION"), makeSymbol("RELATION"), makeSymbol("ARGS"));

    static private final SubLString $str_alt60$The__A__A_got_the_malformed_argum = makeString("The ~A ~A got the malformed argument list ~%~A.~%");

    public static final SubLObject explain_mal_precanonicalizations_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt312$Uninformative_error_during_precan);
            }
        }
        return NIL;
    }

    public static SubLObject explain_mal_precanonicalizations(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str346$Uninformative_error_during_precan);
        }
        return NIL;
    }

    static private final SubLList $list_alt62 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-A-DENOTATIONAL-TERM"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is not a denotational term"));

    static private final SubLString $str_alt63$_A_is_not_a_denotational_term___ = makeString("~A is not a denotational term.~%");

    public static final SubLObject explain_invalid_expansion_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject invalid_sentence = second(why_not);
                    SubLObject invalid_operator = third(why_not);
                    SubLObject invalid_expansion = fourth(why_not);
                    SubLObject generic_arg_nums = (invalid_expansion.isCons()) ? ((SubLObject) (tree_gather(transform_list_utilities.ntransform(transform_list_utilities.transform(invalid_expansion, symbol_function(INTEGERP), symbol_function(NULL), UNPROVIDED), symbol_function(GENERIC_ARG_P), symbol_function(GENERIC_ARG_NUM), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(INTEGERP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                    SubLObject generic_args_max = (generic_arg_nums.isCons()) ? ((SubLObject) (apply(symbol_function(MAX), generic_arg_nums))) : NIL;
                    if (generic_args_max.isInteger() && (NIL != formula_arityL(invalid_sentence, generic_args_max, UNPROVIDED))) {
                        return format(NIL, $str_alt320$_A_has_arity__A__but_the_expansio, new SubLObject[]{ invalid_sentence, formula_arity(invalid_sentence, UNPROVIDED), invalid_operator, generic_args_max, at_utilities.get_generic_arg(generic_args_max) });
                    } else {
                        return format(NIL, $str_alt321$_A_does_not_fit_the_pattern_of_th, new SubLObject[]{ invalid_sentence, invalid_operator, invalid_expansion });
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_invalid_expansion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (!pcase_var.eql($NL)) {
            return NIL;
        }
        final SubLObject invalid_sentence = second(why_not);
        final SubLObject invalid_operator = third(why_not);
        final SubLObject invalid_expansion = fourth(why_not);
        final SubLObject generic_arg_nums = (invalid_expansion.isCons()) ? list_utilities.tree_gather(transform_list_utilities.ntransform(transform_list_utilities.transform(invalid_expansion, symbol_function(INTEGERP), symbol_function(NULL), UNPROVIDED), symbol_function(GENERIC_ARG_P), symbol_function(GENERIC_ARG_NUM), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(INTEGERP), UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject generic_args_max = (generic_arg_nums.isCons()) ? apply(symbol_function(MAX), generic_arg_nums) : NIL;
        if (generic_args_max.isInteger() && (NIL != formula_arityL(invalid_sentence, generic_args_max, UNPROVIDED))) {
            return format(NIL, $str354$_A_has_arity__A__but_the_expansio, new SubLObject[]{ invalid_sentence, formula_arity(invalid_sentence, UNPROVIDED), invalid_operator, generic_args_max, at_utilities.get_generic_arg(generic_args_max) });
        }
        return format(NIL, $str355$_A_does_not_fit_the_pattern_of_th, new SubLObject[]{ invalid_sentence, invalid_operator, invalid_expansion });
    }

    static private final SubLList $list_alt65 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-A-TRUTH-FUNCTION"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is not a truth function in its arg0 position"));

    static private final SubLString $str_alt66$Did_not_recognize__A_as_a_truth_f = makeString("Did not recognize ~A as a truth function (predicate, quantifier, or logical operator).~%");

    static private final SubLList $list_alt68 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-AN-EL-FORMULA"), makeKeyword("COMMENT"), makeString("The formula given was not a EL formula"));

    static private final SubLString $str_alt69$_A_is_not_an_EL_formula__and_is_n = makeString("~A is not an EL formula, and is not #$True, #$False, or an EL variable.~%");

    static private final SubLList $list_alt71 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NOT-AN-EL-VARIABLE"), makeKeyword("COMMENT"), makeString("The sentence does not contain an EL variable where an EL variable is expected"));

    static private final SubLString $str_alt72$_A_is_not_an_EL_variable___ = makeString("~A is not an EL variable.~%");

    static private final SubLList $list_alt74 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-SEQUENCE-NON-VAR"), makeKeyword("COMMENT"), makeString("The formula contains an ill-formed sequence variable syntax"));

    public static final SubLObject explain_recursion_limit_exceeded_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return format(NIL, $str_alt324$Recursion_limit_exceeded__probabl);
            }
        }
        return NIL;
    }

    public static SubLObject explain_recursion_limit_exceeded(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return format(NIL, $str358$Recursion_limit_exceeded__probabl);
        }
        return NIL;
    }

    static private final SubLList $list_alt75 = list(makeSymbol("FORMULA"), makeSymbol("TERM"));

    static private final SubLString $str_alt76$_A_contains_ill_formed_sequence_v = makeString("~A contains ill-formed sequence variable syntax; ~A is not a variable.~%");

    public static final SubLObject explain_el_unevaluatable_expression_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject expression = second(why_not);
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                return cconcatenate(format_nil.format_nil_s_no_copy(expression), new SubLObject[]{ $str_alt327$_was_marked_as___evaluateAtEL__bu, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue() });
            }
        }
        return NIL;
    }

    public static SubLObject explain_el_unevaluatable_expression(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject expression = second(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            return cconcatenate(format_nil.format_nil_s_no_copy(expression), new SubLObject[]{ $str361$_was_marked_as___evaluateAtEL__bu, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue() });
        }
        return NIL;
    }

    static private final SubLList $list_alt78 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1"), makeKeyword("COMMENT"), makeString("The sentence has (#$ExpandSubLFn SUBL-LIST-CONTAINING-NON-VARIABLE SUBL) where SUBL does not mention the non-variables in SUBL-LIST-CONTAINING-NON-VARIABLE."));

    static private final SubLList $list_alt79 = list(makeSymbol("VIOLATING-NON-VARIABLES"), makeSymbol("SENTENCE"), makeSymbol("EXPAND-SUBL-FN"));

    static private final SubLString $str_alt80$Sentence__s___has___ExpandSubLFn_ = makeString("Sentence ~s ~%has #$ExpandSubLFn formula ~s, ~%which contains the term~P ~a in arg1 ~s ~%not mentioned in its arg2 ~s.~%");

    public static final SubLObject explain_quantified_sequence_variable_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject quantified_var = second(why_not);
                    SubLObject sentence = third(why_not);
                    return format(NIL, $str_alt330$The_variable__A_is_existentially_, quantified_var, sentence);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_quantified_sequence_variable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject quantified_var = second(why_not);
            final SubLObject sentence = third(why_not);
            return format(NIL, $str364$The_variable__A_is_existentially_, quantified_var, sentence);
        }
        return NIL;
    }

    static private final SubLList $list_alt84 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-MT"), makeKeyword("COMMENT"), makeString("The Mt specified for the sentence is not a #$Microtheory."));

    static private final SubLString $str_alt85$Mt__s_is_invalid___ = makeString("Mt ~s is invalid.~%");

    public static final SubLObject explain_too_many_sequence_vars_in_skolem_scope_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject existential_var = second(why_not);
                    SubLObject sequence_vars = third(why_not);
                    return format(NIL, $str_alt333$The_variables__A_were_used_as_seq, sequence_vars, existential_var);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_too_many_sequence_vars_in_skolem_scope(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject existential_var = second(why_not);
            final SubLObject sequence_vars = third(why_not);
            return format(NIL, $str367$The_variables__A_were_used_as_seq, sequence_vars, existential_var);
        }
        return NIL;
    }

    static private final SubLList $list_alt87 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-FUNCTION-NESTING"), makeKeyword("COMMENT"), makeString("The sentence contains a function term whose nesting levels exceeds the allowed limit."));

    static private final SubLString $str_alt88$Term__s_______has__s_nesting_leve = makeString("Term ~s~%     has ~s nesting levels but only ~s are permitted.~%");

    public static final SubLObject explain_ambiguous_var_type_in_skolem_scope_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject ambiguous_var = second(why_not);
                    SubLObject sequence_var = third(why_not);
                    SubLObject sentence = fourth(why_not);
                    return format(NIL, $str_alt336$The_variable__A_was_used_both_as_, new SubLObject[]{ ambiguous_var, sequence_var, sentence });
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_ambiguous_var_type_in_skolem_scope(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject ambiguous_var = second(why_not);
            final SubLObject sequence_var = third(why_not);
            final SubLObject sentence = fourth(why_not);
            return format(NIL, $str370$The_variable__A_was_used_both_as_, new SubLObject[]{ ambiguous_var, sequence_var, sentence });
        }
        return NIL;
    }

    static private final SubLList $list_alt90 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-IFF-DEFNS"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$defnIff of some collection."));

    static private final SubLList $list_alt91 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("PSN"), makeSymbol("COL"), makeSymbol("DEFNS"), makeSymbol("MT"), makeSymbol("DATA") });

    static private final SubLString $str_alt94$Term__s__violates__s__s__of_colle = makeString("Term ~s~%violates ~s ~s~%of collection ~s~%");

    public static final SubLObject explain_inhibited_sequence_variable_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject inhibited_var = second(why_not);
                    SubLObject sentence = third(why_not);
                    return format(NIL, $str_alt339$The_variable__A_was_used_as_a_seq, new SubLObject[]{ inhibited_var, sentence, inhibited_var });
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_inhibited_sequence_variable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject inhibited_var = second(why_not);
            final SubLObject sentence = third(why_not);
            return format(NIL, $str373$The_variable__A_was_used_as_a_seq, new SubLObject[]{ inhibited_var, sentence, inhibited_var });
        }
        return NIL;
    }

    static private final SubLString $str_alt95$applicable_to_arg__s_of__s__ = makeString("applicable to arg ~s of ~s~%");

    static private final SubLString $str_alt96$_via__s___ = makeString("(via ~s)~%");

    static private final SubLString $str_alt97$in_mt__s___ = makeString("in mt ~s.~%");

    public static final SubLObject explain_too_many_commutative_in_args_and_rest_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject new_sentence = second(why_not);
                    SubLObject old_sentence = third(why_not);
                    return format(NIL, $str_alt342$In_conflict___a___No_more_than_on, new_sentence, old_sentence);
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_too_many_commutative_in_args_and_rest(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject new_sentence = second(why_not);
            final SubLObject old_sentence = third(why_not);
            return format(NIL, $str376$In_conflict___a___No_more_than_on, new_sentence, old_sentence);
        }
        return NIL;
    }

    static private final SubLList $list_alt103 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$quotedDefnIff of some collection."));

    public static final SubLObject explain_cyclic_commutative_in_args_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject new_sentence = second(why_not);
                    SubLObject commutative_relation = cycl_utilities.formula_arg1(new_sentence, UNPROVIDED);
                    SubLObject cia_arg = third(why_not);
                    SubLObject old_sentence = fourth(why_not);
                    return format(NIL, $str_alt345$An_assertion_of_partial_commutati, new SubLObject[]{ cia_arg, commutative_relation, old_sentence });
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_cyclic_commutative_in_args(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject new_sentence = second(why_not);
            final SubLObject commutative_relation = cycl_utilities.formula_arg1(new_sentence, UNPROVIDED);
            final SubLObject cia_arg = third(why_not);
            final SubLObject old_sentence = fourth(why_not);
            return format(NIL, $str379$An_assertion_of_partial_commutati, new SubLObject[]{ cia_arg, commutative_relation, old_sentence });
        }
        return NIL;
    }

    static private final SubLList $list_alt106 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-SUF-DEFNS"), makeKeyword("COMMENT"), makeString("The formula contains a term which violates #$defnSufficient of some Collection."));

    static private final SubLList $list_alt109 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS"), makeKeyword("COMMENT"), makeString("The formula contains a term which violates #$quotedDefnSufficient of some Collection."));

    public static final SubLObject explain_defining_mt_violation_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject fort = second(why_not);
                    SubLObject mt = third(why_not);
                    SubLObject mts = fourth(why_not);
                    return format(NIL, $str_alt348$Term__a_was_referenced_in__a___bu, new SubLObject[]{ fort, mt, string_utilities.stringify_items(mts, STR, $str_alt6$__, $str_alt7$__and_) });
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_defining_mt_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            final SubLObject fort = second(why_not);
            final SubLObject mt = third(why_not);
            final SubLObject mts = fourth(why_not);
            return format(NIL, $str382$Term__a_was_referenced_in__a___bu, new SubLObject[]{ fort, mt, string_utilities.stringify_items(mts, STR, $str6$__, $str7$__and_) });
        }
        return NIL;
    }

    static private final SubLList $list_alt112 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-NEC-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$defnNecessary of some Collection."));

    static private final SubLList $list_alt113 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("PSN"), makeSymbol("COL"), makeSymbol("DEFN-COL"), makeSymbol("DEFN"), makeSymbol("MT"), makeSymbol("DATA") });

    public static final SubLObject explain_disjunct_in_pragmatic_requirement_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject pragmatic_condition = NIL;
                    SubLObject sentence = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt351);
                    pragmatic_condition = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt351);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt351);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt352$Disjoint_condition__s_is_present_, new SubLObject[]{ pragmatic_condition, sentence, mt });
                    } else {
                        cdestructuring_bind_error(datum, $list_alt351);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_disjunct_in_pragmatic_requirement(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject pragmatic_condition = NIL;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list385);
            pragmatic_condition = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list385);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list385);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str386$Disjoint_condition__s_is_present_, new SubLObject[]{ pragmatic_condition, sentence, mt });
            }
            cdestructuring_bind_error(datum, $list385);
        }
        return NIL;
    }

    static private final SubLString $str_alt114$Term__s__violates__s__s___s___of_ = makeString("Term ~s~%violates ~s ~s (~s)~%of collection ~s~%");

    static private final SubLList $list_alt117 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates #$quotedDefnNecessary of some Collection."));

    static private final SubLList $list_alt120 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-COL-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates defns of argIsa to some Collection."));

    public static final SubLObject explain_bad_exponential_disjunction_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt355);
                    sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt356$_s_is_a_disjunction_of_conjunctio, sentence);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt355);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_bad_exponential_disjunction(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list389);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str390$_s_is_a_disjunction_of_conjunctio, sentence);
            }
            cdestructuring_bind_error(datum, $list389);
        }
        return NIL;
    }

    static private final SubLList $list_alt121 = listS(makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA"));

    static private final SubLString $str_alt122$Term__s_violates_defns_of__a__s__ = makeString("Term ~s violates defns of ~a ~s~%");

    static private final SubLString $str_alt123$applicable_to_argument__s_of_rela = makeString("applicable to argument ~s of relation ~s~%");

    static private final SubLString $str_alt124$arg_isa = makeString("arg-isa");

    static private final SubLList $list_alt127 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates quoted-defns of argQuotedIsa to some Collection."));

    public static final SubLObject explain_bad_exponential_conjunction_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject pcase_var = io_mode;
            if (pcase_var.eql($NL)) {
                {
                    SubLObject datum = why_not.rest();
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt355);
                    sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return format(NIL, $str_alt359$_s_is_a_conjunction_of_disjunctio, sentence);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt355);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject explain_bad_exponential_conjunction(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list389);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str393$_s_is_a_conjunction_of_disjunctio, sentence);
            }
            cdestructuring_bind_error(datum, $list389);
        }
        return NIL;
    }

    static private final SubLString $str_alt128$arg_quoted_isa = makeString("arg-quoted-isa");

    static private final SubLList $list_alt130 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates argIsa constraint."));

    static private final SubLString $str_alt134$arg_genls = makeString("arg-genls");

    static private final SubLString $str_alt135$isa_disjoint = makeString("isa-disjoint");

    public static final SubLObject explain_restricted_mt_assertion_alt(SubLObject why_not, SubLObject io_mode) {
        if (io_mode == UNPROVIDED) {
            io_mode = $NL;
        }
        {
            SubLObject datum = why_not.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject literal = NIL;
            SubLObject decontextualized_literalP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt362);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt362);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt362);
            decontextualized_literalP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = io_mode;
                    if (pcase_var.eql($NL)) {
                        if (NIL != decontextualized_literalP) {
                            return format(NIL, $str_alt363$Asserting_the_decontextualized_li, literal, mt);
                        } else {
                            return format(NIL, $str_alt364$Asserting_the_literal__s_in_micro, literal, mt);
                        }
                    } else {
                        if (pcase_var.eql($HL)) {
                            if (NIL != decontextualized_literalP) {
                                {
                                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(literal);
                                    if (NIL != kb_accessors.decontextualized_predicateP(pred)) {
                                        return list($$and, list($$decontextualizedPredicate, pred), list($$predicateConventionMt, pred, mt), list($$notAssertibleMt, mt));
                                    }
                                }
                                if (NIL != kb_accessors.decontextualized_collection_literalP(literal)) {
                                    {
                                        SubLObject col = cycl_utilities.atomic_sentence_arg2(literal, UNPROVIDED);
                                        return list($$and, list($$decontextualizedCollection, col), list($$collectionConventionMt, col, mt), list($$notAssertibleMt, mt));
                                    }
                                }
                            }
                            return list($$notAssertibleMt, mt);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt362);
            }
        }
        return NIL;
    }

    public static SubLObject explain_restricted_mt_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject mt = NIL;
        SubLObject literal = NIL;
        SubLObject decontextualized_literalP = NIL;
        destructuring_bind_must_consp(current, datum, $list396);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list396);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list396);
        decontextualized_literalP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                if (NIL != decontextualized_literalP) {
                    return format(NIL, $str397$Asserting_the_decontextualized_li, literal, mt);
                }
                return format(NIL, $str398$Asserting_the_literal__s_in_micro, literal, mt);
            } else
                if (pcase_var.eql($HL)) {
                    if (NIL != decontextualized_literalP) {
                        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(literal);
                        if (NIL != kb_accessors.decontextualized_predicateP(pred)) {
                            return list($$and, list($$decontextualizedPredicate, pred), list($$predicateConventionMt, pred, mt), list($$notAssertibleMt, mt));
                        }
                        if (NIL != kb_accessors.decontextualized_collection_literalP(literal)) {
                            final SubLObject col = cycl_utilities.atomic_sentence_arg2(literal, UNPROVIDED);
                            return list($$and, list($$decontextualizedCollection, col), list($$collectionConventionMt, col, mt), list($$notAssertibleMt, mt));
                        }
                    }
                    return list($$notAssertibleMt, mt);
                }

        } else {
            cdestructuring_bind_error(datum, $list396);
        }
        return NIL;
    }

    static private final SubLString $str_alt136$quoted_isa_disjoint = makeString("quoted-isa-disjoint");

    static private final SubLList $list_alt140 = listS(makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA"));

    static private final SubLString $str_alt141$Term__s_violates__a__s__ = makeString("Term ~s violates ~a ~s~%");

    static private final SubLString $str_alt142$Term__s_is__a_with__a__s__ = makeString("Term ~s is ~a with ~a ~s~%");

    static private final SubLList $list_alt143 = listS(makeSymbol("WFF-MODULE"), new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("DATA") });

    static private final SubLString $str_alt144$Term__s_violates_arg_isa__s__ = makeString("Term ~s violates arg-isa ~s~%");

    static private final SubLList $list_alt156 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates argQuotedIsa constraint."));

    static private final SubLList $list_alt158 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates a argGenl constraint."));

    static private final SubLString $str_alt160$Term__s_violates_arg_genls__s__ = makeString("Term ~s violates arg-genls ~s~%");

    public static SubLObject explain_simplification_to_tautology_due_to_pos_and_neg_literal(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject literal = NIL;
        destructuring_bind_must_consp(current, datum, $list406);
        literal = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
            if (pcase_var.eql($NL)) {
                return format(NIL, $str407$Formula_simplifies_to_a_tautology, literal);
            }
        } else {
            cdestructuring_bind_error(datum, $list406);
        }
        return NIL;
    }

    static private final SubLList $list_alt162 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is disjoint with the argIsa constraint."));

    static private final SubLString $str_alt163$Term__s_is_isa_disjoint_with_arg_ = makeString("Term ~s is isa-disjoint with arg-isa ~s~%");

    static private final SubLList $list_alt165 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is disjoint with the argQuotedIsa constraint."));

    public static SubLObject explain_reifiable_but_not_forward_reifiable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, $IO_MODE);
        if (pcase_var.eql($NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list15);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list15);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject nat = wff.contains_a_reifiable_but_not_forward_reifiable_natP(sentence, mt);
                return format(NIL, $str410$Could_not_reify_nat__S____in_sent, new SubLObject[]{ nat, sentence, mt });
            }
            cdestructuring_bind_error(datum, $list15);
        }
        return NIL;
    }

    static private final SubLList $list_alt167 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT..) which is disjoint with the argGenl contraint."));

    static private final SubLList $list_alt170 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is violates interArgIsa constraints."));

    static private final SubLList $list_alt171 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    public static final SubLObject declare_wff_modules_file_alt() {
        declareFunction("explain_invalid_variables", "EXPLAIN-INVALID-VARIABLES", 1, 1, false);
        declareFunction("explain_invalid_sentence", "EXPLAIN-INVALID-SENTENCE", 1, 1, false);
        declareFunction("explain_not_an_ascii_string", "EXPLAIN-NOT-AN-ASCII-STRING", 1, 1, false);
        declareFunction("explain_mal_forts", "EXPLAIN-MAL-FORTS", 1, 1, false);
        declareFunction("explain_mal_fort", "EXPLAIN-MAL-FORT", 1, 1, false);
        declareFunction("explain_mal_arity", "EXPLAIN-MAL-ARITY", 1, 1, false);
        declareFunction("explain_arity_mismatch", "EXPLAIN-ARITY-MISMATCH", 1, 1, false);
        declareFunction("explain_violated_arity", "EXPLAIN-VIOLATED-ARITY", 1, 1, false);
        declareFunction("explain_missing_arity", "EXPLAIN-MISSING-ARITY", 1, 1, false);
        declareFunction("explain_malformed_args", "EXPLAIN-MALFORMED-ARGS", 1, 1, false);
        declareFunction("explain_not_a_denotational_term", "EXPLAIN-NOT-A-DENOTATIONAL-TERM", 1, 1, false);
        declareFunction("explain_not_a_truth_function", "EXPLAIN-NOT-A-TRUTH-FUNCTION", 1, 1, false);
        declareFunction("explain_not_an_el_formula", "EXPLAIN-NOT-AN-EL-FORMULA", 1, 1, false);
        declareFunction("explain_not_an_el_variable", "EXPLAIN-NOT-AN-EL-VARIABLE", 1, 1, false);
        declareFunction("explain_sequence_non_var", "EXPLAIN-SEQUENCE-NON-VAR", 1, 1, false);
        declareFunction("explain_expand_subl_fn_irrelevant_term_in_arg1", "EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1", 1, 1, false);
        declareFunction("explain_invalid_mt", "EXPLAIN-INVALID-MT", 1, 1, false);
        declareFunction("explain_mal_function_nesting", "EXPLAIN-MAL-FUNCTION-NESTING", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_defns_int", "EXPLAIN-MAL-ARG-WRT-DEFNS-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_iff_defns", "EXPLAIN-MAL-ARG-WRT-IFF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_quoted_iff_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_suf_defns", "EXPLAIN-MAL-ARG-WRT-SUF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_quoted_suf_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_nec_defn_int", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_nec_defn", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_quoted_nec_defn", "EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_col_defn_int", "EXPLAIN-MAL-ARG-WRT-COL-DEFN-INT", 4, 0, false);
        declareFunction("explain_mal_arg_wrt_col_defn", "EXPLAIN-MAL-ARG-WRT-COL-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_col_quoted_defn", "EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN", 1, 1, false);
        declareFunction("explanation_constraint_string", "EXPLANATION-CONSTRAINT-STRING", 1, 0, false);
        declareFunction("explanation_disjoint_string", "EXPLANATION-DISJOINT-STRING", 1, 0, false);
        declareFunction("explanation_pred_from_type", "EXPLANATION-PRED-FROM-TYPE", 1, 0, false);
        declareFunction("hl_explanation_via_genl_pred", "HL-EXPLANATION-VIA-GENL-PRED", 6, 0, false);
        declareFunction("hl_explanation_via_genl_inverse", "HL-EXPLANATION-VIA-GENL-INVERSE", 6, 0, false);
        declareFunction("hl_explanation_for_pred", "HL-EXPLANATION-FOR-PRED", 5, 0, false);
        declareFunction("hl_explanation_from_why_not", "HL-EXPLANATION-FROM-WHY-NOT", 2, 1, false);
        declareFunction("nl_explanation_from_why_not", "NL-EXPLANATION-FROM-WHY-NOT", 2, 0, false);
        declareFunction("nl_explanation_from_why_not_with_disjoint", "NL-EXPLANATION-FROM-WHY-NOT-WITH-DISJOINT", 2, 0, false);
        declareFunction("explain_mal_arg_wrt_arg_isa_int", "EXPLAIN-MAL-ARG-WRT-ARG-ISA-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_arg_isa", "EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        declareFunction("new_explain_mal_arg_wrt_arg_isa", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_quoted_isa", "EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_genl", "EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        declareFunction("new_explain_mal_arg_wrt_arg_genl", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint_int", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction("new_explain_mal_arg_wrt_arg_not_isa_disjoint", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_quoted_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_genls_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_genl_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_format", "EXPLAIN-MAL-ARG-WRT-ARG-FORMAT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_format", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_different", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT", 1, 1, false);
        declareFunction("explain_mal_reln_wrt_arg_isa_required", "EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED", 1, 1, false);
        declareFunction("explain_conflict_asserting_true_sbhl", "EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL", 1, 1, false);
        declareFunction("why_sbhl_false", "WHY-SBHL-FALSE", 3, 1, false);
        declareFunction("sbhl_nl_inverse", "SBHL-NL-INVERSE", 1, 0, false);
        declareFunction("explain_conflict_asserting_false_sbhl", "EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL", 1, 1, false);
        declareFunction("why_sbhl_true", "WHY-SBHL-TRUE", 3, 1, false);
        declareFunction("explain_disjointed_arg_isa", "EXPLAIN-DISJOINTED-ARG-ISA", 1, 1, false);
        declareFunction("nl_explanation_of_verbose_data", "NL-EXPLANATION-OF-VERBOSE-DATA", 1, 0, false);
        declareFunction("explain_disjointed_arg_quoted_isa", "EXPLAIN-DISJOINTED-ARG-QUOTED-ISA", 1, 1, false);
        declareFunction("explain_disjointed_arg_genl", "EXPLAIN-DISJOINTED-ARG-GENL", 1, 1, false);
        declareFunction("explain_isolated_terms", "EXPLAIN-ISOLATED-TERMS", 1, 1, false);
        declareFunction("explain_irrelevant_literals", "EXPLAIN-IRRELEVANT-LITERALS", 1, 1, false);
        declareFunction("explain_restricted_skolem_assertion", "EXPLAIN-RESTRICTED-SKOLEM-ASSERTION", 1, 1, false);
        declareFunction("explain_restricted_predicate_assertion", "EXPLAIN-RESTRICTED-PREDICATE-ASSERTION", 1, 1, false);
        declareFunction("explain_restricted_collection_assertion", "EXPLAIN-RESTRICTED-COLLECTION-ASSERTION", 1, 1, false);
        declareFunction("explain_evaluatable_literal_false", "EXPLAIN-EVALUATABLE-LITERAL-FALSE", 1, 1, false);
        declareFunction("explain_except_for_wXo_singleton_var", "EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR", 1, 1, false);
        declareFunction("explain_invalid_mt_for_tou", "EXPLAIN-INVALID-MT-FOR-TOU", 1, 1, false);
        declareFunction("explain_non_defn_pred_in_vocab_mt", "EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT", 1, 1, false);
        declareFunction("explain_predicate_isa_violation", "EXPLAIN-PREDICATE-ISA-VIOLATION", 1, 1, false);
        declareFunction("explain_meta_predicate_violation", "EXPLAIN-META-PREDICATE-VIOLATION", 1, 1, false);
        declareFunction("explain_mal_precanonicalizations", "EXPLAIN-MAL-PRECANONICALIZATIONS", 1, 1, false);
        declareFunction("explain_invalid_expansion", "EXPLAIN-INVALID-EXPANSION", 1, 1, false);
        declareFunction("explain_recursion_limit_exceeded", "EXPLAIN-RECURSION-LIMIT-EXCEEDED", 1, 1, false);
        declareFunction("explain_el_unevaluatable_expression", "EXPLAIN-EL-UNEVALUATABLE-EXPRESSION", 1, 1, false);
        declareFunction("explain_quantified_sequence_variable", "EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE", 1, 1, false);
        declareFunction("explain_too_many_sequence_vars_in_skolem_scope", "EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE", 1, 1, false);
        declareFunction("explain_ambiguous_var_type_in_skolem_scope", "EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE", 1, 1, false);
        declareFunction("explain_inhibited_sequence_variable", "EXPLAIN-INHIBITED-SEQUENCE-VARIABLE", 1, 1, false);
        declareFunction("explain_too_many_commutative_in_args_and_rest", "EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST", 1, 1, false);
        declareFunction("explain_cyclic_commutative_in_args", "EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS", 1, 1, false);
        declareFunction("explain_defining_mt_violation", "EXPLAIN-DEFINING-MT-VIOLATION", 1, 1, false);
        declareFunction("explain_disjunct_in_pragmatic_requirement", "EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT", 1, 1, false);
        declareFunction("explain_bad_exponential_disjunction", "EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION", 1, 1, false);
        declareFunction("explain_bad_exponential_conjunction", "EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION", 1, 1, false);
        declareFunction("explain_restricted_mt_assertion", "EXPLAIN-RESTRICTED-MT-ASSERTION", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_wff_modules_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("explain_invalid_variables", "EXPLAIN-INVALID-VARIABLES", 1, 1, false);
            declareFunction("explain_invalid_sentence", "EXPLAIN-INVALID-SENTENCE", 1, 1, false);
            declareFunction("explain_not_an_ascii_string", "EXPLAIN-NOT-AN-ASCII-STRING", 1, 1, false);
            declareFunction("explain_mal_forts", "EXPLAIN-MAL-FORTS", 1, 1, false);
            declareFunction("explain_mal_fort", "EXPLAIN-MAL-FORT", 1, 1, false);
            declareFunction("explain_mal_arity", "EXPLAIN-MAL-ARITY", 1, 1, false);
            declareFunction("explain_arity_mismatch", "EXPLAIN-ARITY-MISMATCH", 1, 1, false);
            declareFunction("explain_violated_arity", "EXPLAIN-VIOLATED-ARITY", 1, 1, false);
            declareFunction("explain_missing_arity", "EXPLAIN-MISSING-ARITY", 1, 1, false);
            declareFunction("explain_malformed_args", "EXPLAIN-MALFORMED-ARGS", 1, 1, false);
            declareFunction("explain_not_a_denotational_term", "EXPLAIN-NOT-A-DENOTATIONAL-TERM", 1, 1, false);
            declareFunction("explain_not_a_truth_function", "EXPLAIN-NOT-A-TRUTH-FUNCTION", 1, 1, false);
            declareFunction("explain_not_an_el_formula", "EXPLAIN-NOT-AN-EL-FORMULA", 1, 1, false);
            declareFunction("explain_not_an_el_variable", "EXPLAIN-NOT-AN-EL-VARIABLE", 1, 1, false);
            declareFunction("explain_not_a_list_of_variables", "EXPLAIN-NOT-A-LIST-OF-VARIABLES", 1, 1, false);
            declareFunction("explain_sequence_non_var", "EXPLAIN-SEQUENCE-NON-VAR", 1, 1, false);
            declareFunction("explain_expand_subl_fn_irrelevant_term_in_arg1", "EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1", 1, 1, false);
            declareFunction("explain_invalid_mt", "EXPLAIN-INVALID-MT", 1, 1, false);
            declareFunction("explain_mal_function_nesting", "EXPLAIN-MAL-FUNCTION-NESTING", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_defns_int", "EXPLAIN-MAL-ARG-WRT-DEFNS-INT", 3, 0, false);
            declareFunction("explain_mal_arg_wrt_iff_defns", "EXPLAIN-MAL-ARG-WRT-IFF-DEFNS", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_quoted_iff_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_suf_defns", "EXPLAIN-MAL-ARG-WRT-SUF-DEFNS", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_quoted_suf_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_nec_defn_int", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN-INT", 3, 0, false);
            declareFunction("explain_mal_arg_wrt_nec_defn", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_quoted_nec_defn", "EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_col_defn_int", "EXPLAIN-MAL-ARG-WRT-COL-DEFN-INT", 4, 0, false);
            declareFunction("explain_mal_arg_wrt_col_defn", "EXPLAIN-MAL-ARG-WRT-COL-DEFN", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_col_quoted_defn", "EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN", 1, 1, false);
            declareFunction("explanation_constraint_string", "EXPLANATION-CONSTRAINT-STRING", 1, 0, false);
            declareFunction("explanation_disjoint_string", "EXPLANATION-DISJOINT-STRING", 1, 0, false);
            declareFunction("explanation_pred_from_type", "EXPLANATION-PRED-FROM-TYPE", 1, 0, false);
            declareFunction("hl_explanation_via_genl_pred", "HL-EXPLANATION-VIA-GENL-PRED", 6, 0, false);
            declareFunction("hl_explanation_via_genl_inverse", "HL-EXPLANATION-VIA-GENL-INVERSE", 6, 0, false);
            declareFunction("hl_explanation_for_pred", "HL-EXPLANATION-FOR-PRED", 5, 0, false);
            declareFunction("hl_explanation_from_why_not", "HL-EXPLANATION-FROM-WHY-NOT", 2, 1, false);
            declareFunction("nl_explanation_from_why_not", "NL-EXPLANATION-FROM-WHY-NOT", 3, 0, false);
            declareFunction("nl_explanation_from_why_not_with_disjoint", "NL-EXPLANATION-FROM-WHY-NOT-WITH-DISJOINT", 2, 1, false);
            declareFunction("nl_explanation_of_why_not_terse", "NL-EXPLANATION-OF-WHY-NOT-TERSE", 3, 0, false);
            declareFunction("get_type_phrase", "GET-TYPE-PHRASE", 2, 0, false);
            declareFunction("explain_mal_arg_wrt_arg_isa_int", "EXPLAIN-MAL-ARG-WRT-ARG-ISA-INT", 3, 0, false);
            declareFunction("explain_mal_arg_wrt_arg_isa", "EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
            declareFunction("new_explain_mal_arg_wrt_arg_isa", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_quoted_isa", "EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_genl", "EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
            declareFunction("new_explain_mal_arg_wrt_arg_genl", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint_int", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT-INT", 4, 0, false);
            declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
            declareFunction("new_explain_mal_arg_wrt_arg_not_isa_disjoint", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_not_quoted_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_not_genls_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_not_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_not_genl_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_isa_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA-GENL", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_genl_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL-ISA", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_arg_format", "EXPLAIN-MAL-ARG-WRT-ARG-FORMAT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_format", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT", 1, 1, false);
            declareFunction("explain_mal_arg_wrt_inter_arg_different", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT", 1, 1, false);
            declareFunction("explain_mal_reln_wrt_arg_isa_required", "EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED", 1, 1, false);
            declareFunction("explain_conflict_asserting_true_sbhl", "EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL", 1, 1, false);
            declareFunction("why_sbhl_false", "WHY-SBHL-FALSE", 3, 1, false);
            declareFunction("sbhl_nl_inverse", "SBHL-NL-INVERSE", 1, 0, false);
            declareFunction("explain_conflict_asserting_false_sbhl", "EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL", 1, 1, false);
            declareFunction("why_sbhl_true", "WHY-SBHL-TRUE", 3, 1, false);
            declareFunction("explain_disjointed_arg_isa", "EXPLAIN-DISJOINTED-ARG-ISA", 1, 1, false);
            declareFunction("nl_explanation_of_verbose_data", "NL-EXPLANATION-OF-VERBOSE-DATA", 1, 0, false);
            declareFunction("explain_disjointed_arg_quoted_isa", "EXPLAIN-DISJOINTED-ARG-QUOTED-ISA", 1, 1, false);
            declareFunction("explain_disjointed_arg_genl", "EXPLAIN-DISJOINTED-ARG-GENL", 1, 1, false);
            declareFunction("explain_isolated_terms", "EXPLAIN-ISOLATED-TERMS", 1, 1, false);
            declareFunction("explain_irrelevant_literals", "EXPLAIN-IRRELEVANT-LITERALS", 1, 1, false);
            declareFunction("explain_restricted_skolem_assertion", "EXPLAIN-RESTRICTED-SKOLEM-ASSERTION", 1, 1, false);
            declareFunction("explain_restricted_predicate_assertion", "EXPLAIN-RESTRICTED-PREDICATE-ASSERTION", 1, 1, false);
            declareFunction("explain_restricted_collection_assertion", "EXPLAIN-RESTRICTED-COLLECTION-ASSERTION", 1, 1, false);
            declareFunction("explain_evaluatable_literal_false", "EXPLAIN-EVALUATABLE-LITERAL-FALSE", 1, 1, false);
            declareFunction("explain_except_for_wXo_singleton_var", "EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR", 1, 1, false);
            declareFunction("explain_invalid_mt_for_tou", "EXPLAIN-INVALID-MT-FOR-TOU", 1, 1, false);
            declareFunction("explain_non_defn_pred_in_vocab_mt", "EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT", 1, 1, false);
            declareFunction("explain_predicate_isa_violation", "EXPLAIN-PREDICATE-ISA-VIOLATION", 1, 1, false);
            declareFunction("explain_meta_predicate_violation", "EXPLAIN-META-PREDICATE-VIOLATION", 1, 1, false);
            declareFunction("explain_mal_precanonicalizations", "EXPLAIN-MAL-PRECANONICALIZATIONS", 1, 1, false);
            declareFunction("explain_invalid_expansion", "EXPLAIN-INVALID-EXPANSION", 1, 1, false);
            declareFunction("explain_recursion_limit_exceeded", "EXPLAIN-RECURSION-LIMIT-EXCEEDED", 1, 1, false);
            declareFunction("explain_el_unevaluatable_expression", "EXPLAIN-EL-UNEVALUATABLE-EXPRESSION", 1, 1, false);
            declareFunction("explain_quantified_sequence_variable", "EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE", 1, 1, false);
            declareFunction("explain_too_many_sequence_vars_in_skolem_scope", "EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE", 1, 1, false);
            declareFunction("explain_ambiguous_var_type_in_skolem_scope", "EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE", 1, 1, false);
            declareFunction("explain_inhibited_sequence_variable", "EXPLAIN-INHIBITED-SEQUENCE-VARIABLE", 1, 1, false);
            declareFunction("explain_too_many_commutative_in_args_and_rest", "EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST", 1, 1, false);
            declareFunction("explain_cyclic_commutative_in_args", "EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS", 1, 1, false);
            declareFunction("explain_defining_mt_violation", "EXPLAIN-DEFINING-MT-VIOLATION", 1, 1, false);
            declareFunction("explain_disjunct_in_pragmatic_requirement", "EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT", 1, 1, false);
            declareFunction("explain_bad_exponential_disjunction", "EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION", 1, 1, false);
            declareFunction("explain_bad_exponential_conjunction", "EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION", 1, 1, false);
            declareFunction("explain_restricted_mt_assertion", "EXPLAIN-RESTRICTED-MT-ASSERTION", 1, 1, false);
            declareFunction("explain_simplification_to_tautology_due_to_pos_and_neg_literal", "EXPLAIN-SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL", 1, 1, false);
            declareFunction("explain_reifiable_but_not_forward_reifiable", "EXPLAIN-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("nl_explanation_from_why_not", "NL-EXPLANATION-FROM-WHY-NOT", 2, 0, false);
            declareFunction("nl_explanation_from_why_not_with_disjoint", "NL-EXPLANATION-FROM-WHY-NOT-WITH-DISJOINT", 2, 0, false);
            declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint_int", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT-INT", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_wff_modules_file_Previous() {
        declareFunction("explain_invalid_variables", "EXPLAIN-INVALID-VARIABLES", 1, 1, false);
        declareFunction("explain_invalid_sentence", "EXPLAIN-INVALID-SENTENCE", 1, 1, false);
        declareFunction("explain_not_an_ascii_string", "EXPLAIN-NOT-AN-ASCII-STRING", 1, 1, false);
        declareFunction("explain_mal_forts", "EXPLAIN-MAL-FORTS", 1, 1, false);
        declareFunction("explain_mal_fort", "EXPLAIN-MAL-FORT", 1, 1, false);
        declareFunction("explain_mal_arity", "EXPLAIN-MAL-ARITY", 1, 1, false);
        declareFunction("explain_arity_mismatch", "EXPLAIN-ARITY-MISMATCH", 1, 1, false);
        declareFunction("explain_violated_arity", "EXPLAIN-VIOLATED-ARITY", 1, 1, false);
        declareFunction("explain_missing_arity", "EXPLAIN-MISSING-ARITY", 1, 1, false);
        declareFunction("explain_malformed_args", "EXPLAIN-MALFORMED-ARGS", 1, 1, false);
        declareFunction("explain_not_a_denotational_term", "EXPLAIN-NOT-A-DENOTATIONAL-TERM", 1, 1, false);
        declareFunction("explain_not_a_truth_function", "EXPLAIN-NOT-A-TRUTH-FUNCTION", 1, 1, false);
        declareFunction("explain_not_an_el_formula", "EXPLAIN-NOT-AN-EL-FORMULA", 1, 1, false);
        declareFunction("explain_not_an_el_variable", "EXPLAIN-NOT-AN-EL-VARIABLE", 1, 1, false);
        declareFunction("explain_not_a_list_of_variables", "EXPLAIN-NOT-A-LIST-OF-VARIABLES", 1, 1, false);
        declareFunction("explain_sequence_non_var", "EXPLAIN-SEQUENCE-NON-VAR", 1, 1, false);
        declareFunction("explain_expand_subl_fn_irrelevant_term_in_arg1", "EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1", 1, 1, false);
        declareFunction("explain_invalid_mt", "EXPLAIN-INVALID-MT", 1, 1, false);
        declareFunction("explain_mal_function_nesting", "EXPLAIN-MAL-FUNCTION-NESTING", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_defns_int", "EXPLAIN-MAL-ARG-WRT-DEFNS-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_iff_defns", "EXPLAIN-MAL-ARG-WRT-IFF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_quoted_iff_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_suf_defns", "EXPLAIN-MAL-ARG-WRT-SUF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_quoted_suf_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_nec_defn_int", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_nec_defn", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_quoted_nec_defn", "EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_col_defn_int", "EXPLAIN-MAL-ARG-WRT-COL-DEFN-INT", 4, 0, false);
        declareFunction("explain_mal_arg_wrt_col_defn", "EXPLAIN-MAL-ARG-WRT-COL-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_col_quoted_defn", "EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN", 1, 1, false);
        declareFunction("explanation_constraint_string", "EXPLANATION-CONSTRAINT-STRING", 1, 0, false);
        declareFunction("explanation_disjoint_string", "EXPLANATION-DISJOINT-STRING", 1, 0, false);
        declareFunction("explanation_pred_from_type", "EXPLANATION-PRED-FROM-TYPE", 1, 0, false);
        declareFunction("hl_explanation_via_genl_pred", "HL-EXPLANATION-VIA-GENL-PRED", 6, 0, false);
        declareFunction("hl_explanation_via_genl_inverse", "HL-EXPLANATION-VIA-GENL-INVERSE", 6, 0, false);
        declareFunction("hl_explanation_for_pred", "HL-EXPLANATION-FOR-PRED", 5, 0, false);
        declareFunction("hl_explanation_from_why_not", "HL-EXPLANATION-FROM-WHY-NOT", 2, 1, false);
        declareFunction("nl_explanation_from_why_not", "NL-EXPLANATION-FROM-WHY-NOT", 3, 0, false);
        declareFunction("nl_explanation_from_why_not_with_disjoint", "NL-EXPLANATION-FROM-WHY-NOT-WITH-DISJOINT", 2, 1, false);
        declareFunction("nl_explanation_of_why_not_terse", "NL-EXPLANATION-OF-WHY-NOT-TERSE", 3, 0, false);
        declareFunction("get_type_phrase", "GET-TYPE-PHRASE", 2, 0, false);
        declareFunction("explain_mal_arg_wrt_arg_isa_int", "EXPLAIN-MAL-ARG-WRT-ARG-ISA-INT", 3, 0, false);
        declareFunction("explain_mal_arg_wrt_arg_isa", "EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        declareFunction("new_explain_mal_arg_wrt_arg_isa", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_quoted_isa", "EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_genl", "EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        declareFunction("new_explain_mal_arg_wrt_arg_genl", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint_int", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT-INT", 4, 0, false);
        declareFunction("explain_mal_arg_wrt_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction("new_explain_mal_arg_wrt_arg_not_isa_disjoint", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_quoted_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_not_genls_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_not_genl_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_isa_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA-GENL", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_genl_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL-ISA", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_arg_format", "EXPLAIN-MAL-ARG-WRT-ARG-FORMAT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_format", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT", 1, 1, false);
        declareFunction("explain_mal_arg_wrt_inter_arg_different", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT", 1, 1, false);
        declareFunction("explain_mal_reln_wrt_arg_isa_required", "EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED", 1, 1, false);
        declareFunction("explain_conflict_asserting_true_sbhl", "EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL", 1, 1, false);
        declareFunction("why_sbhl_false", "WHY-SBHL-FALSE", 3, 1, false);
        declareFunction("sbhl_nl_inverse", "SBHL-NL-INVERSE", 1, 0, false);
        declareFunction("explain_conflict_asserting_false_sbhl", "EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL", 1, 1, false);
        declareFunction("why_sbhl_true", "WHY-SBHL-TRUE", 3, 1, false);
        declareFunction("explain_disjointed_arg_isa", "EXPLAIN-DISJOINTED-ARG-ISA", 1, 1, false);
        declareFunction("nl_explanation_of_verbose_data", "NL-EXPLANATION-OF-VERBOSE-DATA", 1, 0, false);
        declareFunction("explain_disjointed_arg_quoted_isa", "EXPLAIN-DISJOINTED-ARG-QUOTED-ISA", 1, 1, false);
        declareFunction("explain_disjointed_arg_genl", "EXPLAIN-DISJOINTED-ARG-GENL", 1, 1, false);
        declareFunction("explain_isolated_terms", "EXPLAIN-ISOLATED-TERMS", 1, 1, false);
        declareFunction("explain_irrelevant_literals", "EXPLAIN-IRRELEVANT-LITERALS", 1, 1, false);
        declareFunction("explain_restricted_skolem_assertion", "EXPLAIN-RESTRICTED-SKOLEM-ASSERTION", 1, 1, false);
        declareFunction("explain_restricted_predicate_assertion", "EXPLAIN-RESTRICTED-PREDICATE-ASSERTION", 1, 1, false);
        declareFunction("explain_restricted_collection_assertion", "EXPLAIN-RESTRICTED-COLLECTION-ASSERTION", 1, 1, false);
        declareFunction("explain_evaluatable_literal_false", "EXPLAIN-EVALUATABLE-LITERAL-FALSE", 1, 1, false);
        declareFunction("explain_except_for_wXo_singleton_var", "EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR", 1, 1, false);
        declareFunction("explain_invalid_mt_for_tou", "EXPLAIN-INVALID-MT-FOR-TOU", 1, 1, false);
        declareFunction("explain_non_defn_pred_in_vocab_mt", "EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT", 1, 1, false);
        declareFunction("explain_predicate_isa_violation", "EXPLAIN-PREDICATE-ISA-VIOLATION", 1, 1, false);
        declareFunction("explain_meta_predicate_violation", "EXPLAIN-META-PREDICATE-VIOLATION", 1, 1, false);
        declareFunction("explain_mal_precanonicalizations", "EXPLAIN-MAL-PRECANONICALIZATIONS", 1, 1, false);
        declareFunction("explain_invalid_expansion", "EXPLAIN-INVALID-EXPANSION", 1, 1, false);
        declareFunction("explain_recursion_limit_exceeded", "EXPLAIN-RECURSION-LIMIT-EXCEEDED", 1, 1, false);
        declareFunction("explain_el_unevaluatable_expression", "EXPLAIN-EL-UNEVALUATABLE-EXPRESSION", 1, 1, false);
        declareFunction("explain_quantified_sequence_variable", "EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE", 1, 1, false);
        declareFunction("explain_too_many_sequence_vars_in_skolem_scope", "EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE", 1, 1, false);
        declareFunction("explain_ambiguous_var_type_in_skolem_scope", "EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE", 1, 1, false);
        declareFunction("explain_inhibited_sequence_variable", "EXPLAIN-INHIBITED-SEQUENCE-VARIABLE", 1, 1, false);
        declareFunction("explain_too_many_commutative_in_args_and_rest", "EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST", 1, 1, false);
        declareFunction("explain_cyclic_commutative_in_args", "EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS", 1, 1, false);
        declareFunction("explain_defining_mt_violation", "EXPLAIN-DEFINING-MT-VIOLATION", 1, 1, false);
        declareFunction("explain_disjunct_in_pragmatic_requirement", "EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT", 1, 1, false);
        declareFunction("explain_bad_exponential_disjunction", "EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION", 1, 1, false);
        declareFunction("explain_bad_exponential_conjunction", "EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION", 1, 1, false);
        declareFunction("explain_restricted_mt_assertion", "EXPLAIN-RESTRICTED-MT-ASSERTION", 1, 1, false);
        declareFunction("explain_simplification_to_tautology_due_to_pos_and_neg_literal", "EXPLAIN-SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL", 1, 1, false);
        declareFunction("explain_reifiable_but_not_forward_reifiable", "EXPLAIN-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE", 1, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt172$Term__s_violates_inter_arg_isa__s = makeString("Term ~s violates inter-arg-isa ~s~%");

    static private final SubLString $str_alt173$when_argument__s___s__isa__s__ = makeString("when argument ~s, ~s, isa ~s~%");

    static private final SubLList $list_alt175 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is violates interArgNotIsa constraints."));

    static private final SubLString $str_alt176$Term__s_violates_inter_arg_not_is = makeString("Term ~s violates inter-arg-not-isa ~s~%");

    static private final SubLString $str_alt177$when_argument__s___s__not_isa__s_ = makeString("when argument ~s, ~s, not isa ~s~%");

    static private final SubLList $list_alt179 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates interArgGenl constraints."));

    static private final SubLList $list_alt180 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-GENL"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    static private final SubLString $str_alt181$Term__s_violates_inter_arg_genl__ = makeString("Term ~s violates inter-arg-genl ~s~%");

    static private final SubLString $str_alt182$when_argument__s___s__genl__s__ = makeString("when argument ~s, ~s, genl ~s~%");

    static private final SubLList $list_alt184 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLList $list_alt185 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    static private final SubLString $str_alt186$Term__s_violates_defns_of_inter_a = makeString("Term ~s violates defns of inter-arg-isa ~s~%");

    static private final SubLList $list_alt188 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt189$Term__s_violates_defns_of_inter_a = makeString("Term ~s violates defns of inter-arg-not-isa ~s~%");

    static private final SubLList $list_alt191 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT..) which is disjoint with the interArgIsa constraint."));

    static private final SubLString $str_alt192$Term__s_is_isa_disjoint_with_inte = makeString("Term ~s is isa-disjoint with inter-arg-isa ~s~%");

    static private final SubLList $list_alt194 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT"), makeKeyword("COMMENT"), makeString("The sentence contains a term (NAT...) which is disjoint with the interArgGenl constraint."));

    static private final SubLList $list_alt195 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("COL"), makeSymbol("IND-ARG-GENL"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    static private final SubLString $str_alt196$Term__s_is_genl_disjoint_with_int = makeString("Term ~s is genl-disjoint with inter-arg-genl ~s~%");

    static private final SubLList $list_alt198 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-FORMAT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates argFormat constraint."));

    static private final SubLList $list_alt199 = list(makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));

    static private final SubLString $str_alt200$Term__s_violates_arg_format__s__ = makeString("Term ~s violates arg-format ~s~%");

    static private final SubLString $str_alt201$__applicable_to_argument__s_of_re = makeString("  applicable to argument ~s of relation ~s~%");

    static private final SubLString $str_alt202$___via__s___ = makeString("  (via ~s)~%");

    static private final SubLString $str_alt203$__in_mt__s___ = makeString("  in mt ~s.~%");

    static private final SubLString $str_alt204$______In_conflict__a_________a__ = makeString("  ~%  In conflict ~a: ~%    ~a~%");

    static private final SubLString $str_alt208$________ = makeString(", ~%    ");

    static private final SubLString $str_alt209$__and_______ = makeString(", and ~%    ");

    static private final SubLList $list_alt211 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates interArgFormat constraint."));

    static private final SubLList $list_alt212 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("RELN"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    static private final SubLString $str_alt213$Term__s_violates_inter_arg_format = makeString("Term ~s violates inter-arg-format ~s~%");

    static private final SubLString $str_alt214$__when_argument__s___s__isa__s__ = makeString("  when argument ~s, ~s, isa ~s~%");

    static private final SubLString $str_alt215$______In_conflict__a_________a = makeString("  ~%  In conflict ~a: ~%    ~a");

    static private final SubLList $list_alt217 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT"), makeKeyword("COMMENT"), makeString("The sentence contains a term which violates interArgDifferent constraint."));

    static private final SubLList $list_alt218 = list(makeSymbol("RELN"), makeSymbol("ARG1"), makeSymbol("PSN1"), makeSymbol("ARG2"), makeSymbol("PSN2"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));

    static private final SubLString $str_alt219$Terms__s_and__s_are_equal__which_ = makeString("Terms ~s and ~s are equal, which violates the inter-arg-different constraint~%");

    static private final SubLString $str_alt220$applicable_to_arguments__s_and__s = makeString("applicable to arguments ~s and ~s of relation ~s~%");

    static private final SubLList $list_alt224 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED"), makeKeyword("COMMENT"), makeString("The sentence contains a predicate for which argIsa is not defined when argIsa's are strictly required on a predicate before using it."));

    static private final SubLList $list_alt225 = list(makeSymbol("RELATION"), makeSymbol("ARGNUM"), makeSymbol("MT"));

    static private final SubLString $str_alt226$argument__s_of__s_has_no___argIsa = makeString("argument ~s of ~s has no #$argIsa constraint in mt ~s.~%");

    static private final SubLSymbol $sym228$_COL = makeSymbol("?COL");

    static private final SubLList $list_alt230 = list(makeSymbol("?ARGNUM"), makeSymbol("?COL"));

    static private final SubLList $list_alt232 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL"), makeKeyword("COMMENT"), makeString("The sentence contains sentences which violate the current sbhl information."));

    static private final SubLList $list_alt233 = list(makeSymbol("ASENT"), makeSymbol("MT"));

    static private final SubLString $str_alt234$sbhl_conflict___s__a__a________be = makeString("sbhl conflict: ~s ~a ~a~%      because: ~a~%");

    static private final SubLString $str_alt237$_________________ = makeString("               ~%");

    static private final SubLString $str_alt238$_s_is_known_not_to_be__a__s_in_mt = makeString("~s is known not to be ~a ~s in mt ~s.  ~%~a~%");

    static private final SubLList $list_alt247 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL"), makeKeyword("COMMENT"), makeString("The sentence contain sentences which negate the current sbhl information."));

    static private final SubLString $str_alt248$sbhl_conflict___s__a__a________be = makeString("sbhl conflict: ~s ~a ~a~%      because: ~a ~%");

    public static SubLObject init_wff_modules_file() {
        deflexical("*USE-EXPERIMENTAL-WFF-SUGGESTIONS?*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt250$_s_is_known_to_be__a__s_in_mt__s_ = makeString("~s is known to be ~a ~s in mt ~s.  ~%~a~%");

    public static final SubLObject setup_wff_modules_file_alt() {
        wff_module_datastructures.wff_violation_module($INVALID_VARIABLES, $list_alt1);
        wff_module_datastructures.wff_violation_module($INVALID_SENTENCE, $list_alt13);
        wff_module_datastructures.wff_violation_module($NOT_AN_ASCII_STRING, $list_alt24);
        wff_module_datastructures.wff_violation_module($MAL_FORTS, $list_alt28);
        wff_module_datastructures.wff_violation_module($MAL_FORT, $list_alt31);
        wff_module_datastructures.wff_violation_module($MAL_ARITY, $list_alt35);
        wff_module_datastructures.wff_violation_module($ARITY_MISMATCH, $list_alt41);
        wff_module_datastructures.wff_violation_module($VIOLATED_ARITY, $list_alt45);
        wff_module_datastructures.wff_violation_module($MISSING_ARITY, $list_alt54);
        wff_module_datastructures.wff_violation_module($MALFORMED_ARGS, $list_alt58);
        wff_module_datastructures.wff_violation_module($NOT_A_DENOTATIONAL_TERM, $list_alt62);
        wff_module_datastructures.wff_violation_module($NOT_A_TRUTH_FUNCTION, $list_alt65);
        wff_module_datastructures.wff_violation_module($NOT_AN_EL_FORMULA, $list_alt68);
        wff_module_datastructures.wff_violation_module($NOT_AN_EL_VARIABLE, $list_alt71);
        wff_module_datastructures.wff_violation_module($SEQUENCE_NON_VAR, $list_alt74);
        wff_module_datastructures.wff_violation_module($EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, $list_alt78);
        wff_module_datastructures.wff_violation_module($INVALID_MT, $list_alt84);
        wff_module_datastructures.wff_violation_module($MAL_FN_NESTING, $list_alt87);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_IFF_DEFN, $list_alt90);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_IFF_DEFN, $list_alt103);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_SUF_DEFNS, $list_alt106);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_SUF_DEFNS, $list_alt109);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_NEC_DEFN, $list_alt112);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_NEC_DEFN, $list_alt117);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_DEFN, $list_alt120);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_QUOTED_DEFN, $list_alt127);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_ISA, $list_alt130);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_QUOTED_ISA, $list_alt156);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_GENL, $list_alt158);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, $list_alt162);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, $list_alt165);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT, $list_alt167);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_ISA, $list_alt170);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA, $list_alt175);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_GENL, $list_alt179);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DEFN, $list_alt184);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_DEFN, $list_alt188);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, $list_alt191);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, $list_alt194);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_FORMAT, $list_alt198);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_FORMAT, $list_alt211);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DIFFERENT, $list_alt217);
        wff_module_datastructures.wff_violation_module($MAL_RELN_WRT_ARG_ISA_REQUIRED, $list_alt224);
        wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_TRUE_SBHL, $list_alt232);
        wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_FALSE_SBHL, $list_alt247);
        wff_module_datastructures.wff_violation_module($DISJOINT_ARG_ISA, $list_alt252);
        wff_module_datastructures.wff_violation_module($DISJOINT_ARG_QUOTED_ISA, $list_alt262);
        wff_module_datastructures.wff_violation_module($DISJOINT_ARG_GENL, $list_alt264);
        wff_module_datastructures.wff_violation_module($ISOLATED_TERMS, $list_alt267);
        wff_module_datastructures.wff_violation_module($IRRELEVANT_LITERALS, $list_alt273);
        wff_module_datastructures.wff_violation_module($RESTRICTED_SKOLEM_ASSERTION, $list_alt278);
        wff_module_datastructures.wff_violation_module($RESTRICTED_PREDICATE_ASSERTION, $list_alt282);
        wff_module_datastructures.wff_violation_module($RESTRICTED_COLLECTION_ASSERTION, $list_alt286);
        wff_module_datastructures.wff_violation_module($EVALUATABLE_LITERAL_FALSE, $list_alt290);
        wff_module_datastructures.wff_violation_module($kw292$EXCEPT_FOR_W_O_SINGLETON_VAR, $list_alt293);
        wff_module_datastructures.wff_violation_module($INVALID_MT_FOR_TOU, $list_alt297);
        wff_module_datastructures.wff_violation_module($NON_DEFN_PRED_IN_VOCAB_MT, $list_alt300);
        wff_module_datastructures.wff_violation_module($PREDICATE_ISA_VIOLATION, $list_alt303);
        wff_module_datastructures.wff_violation_module($META_PREDICATE_VIOLATION, $list_alt307);
        wff_module_datastructures.wff_violation_module($MAL_PRECANONICALIZATIONS, $list_alt311);
        wff_module_datastructures.wff_violation_module($INVALID_EXPANSION, $list_alt314);
        wff_module_datastructures.wff_violation_module($RECURSION_LIMIT_EXCEEDED, $list_alt323);
        wff_module_datastructures.wff_violation_module($EL_UNEVALUATABLE_EXPRESSION, $list_alt326);
        wff_module_datastructures.wff_violation_module($QUANTIFIED_SEQUENCE_VARIABLE, $list_alt329);
        wff_module_datastructures.wff_violation_module($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, $list_alt332);
        wff_module_datastructures.wff_violation_module($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, $list_alt335);
        wff_module_datastructures.wff_violation_module($INHIBITED_SEQUENCE_VARIABLE, $list_alt338);
        wff_module_datastructures.wff_violation_module($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, $list_alt341);
        wff_module_datastructures.wff_violation_module($CYCLIC_COMMUTATIVE_IN_ARGS, $list_alt344);
        wff_module_datastructures.wff_violation_module($DEFINING_MT_VIOLATION, $list_alt347);
        wff_module_datastructures.wff_violation_module($DISJUNCT_IN_PRAGMATIC_REQUIREMENT, $list_alt350);
        wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_DISJUNCTION, $list_alt354);
        wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_CONJUNCTION, $list_alt358);
        wff_module_datastructures.wff_violation_module($RESTRICTED_MT_ASSERTION, $list_alt361);
        return NIL;
    }

    public static SubLObject setup_wff_modules_file() {
        if (SubLFiles.USE_V1) {
            wff_module_datastructures.wff_violation_module($INVALID_VARIABLES, $list1);
            wff_module_datastructures.wff_violation_module($INVALID_SENTENCE, $list14);
            wff_module_datastructures.wff_violation_module($NOT_AN_ASCII_STRING, $list25);
            wff_module_datastructures.wff_violation_module($MAL_FORTS, $list29);
            wff_module_datastructures.wff_violation_module($MAL_FORT, $list32);
            wff_module_datastructures.wff_violation_module($MAL_ARITY, $list36);
            wff_module_datastructures.wff_violation_module($ARITY_MISMATCH, $list42);
            wff_module_datastructures.wff_violation_module($VIOLATED_ARITY, $list46);
            wff_module_datastructures.wff_violation_module($MISSING_ARITY, $list56);
            wff_module_datastructures.wff_violation_module($MALFORMED_ARGS, $list60);
            wff_module_datastructures.wff_violation_module($NOT_A_DENOTATIONAL_TERM, $list64);
            wff_module_datastructures.wff_violation_module($NOT_A_TRUTH_FUNCTION, $list67);
            wff_module_datastructures.wff_violation_module($NOT_AN_EL_FORMULA, $list70);
            wff_module_datastructures.wff_violation_module($NOT_AN_EL_VARIABLE, $list73);
            wff_module_datastructures.wff_violation_module($NOT_A_LIST_OF_VARIABLES, $list76);
            wff_module_datastructures.wff_violation_module($SEQUENCE_NON_VAR, $list79);
            wff_module_datastructures.wff_violation_module($EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, $list83);
            wff_module_datastructures.wff_violation_module($INVALID_MT, $list89);
            wff_module_datastructures.wff_violation_module($MAL_FN_NESTING, $list92);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_IFF_DEFN, $list95);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_IFF_DEFN, $list111);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_SUF_DEFNS, $list114);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_SUF_DEFNS, $list117);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_NEC_DEFN, $list120);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_NEC_DEFN, $list125);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_DEFN, $list128);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_QUOTED_DEFN, $list134);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_ISA, $list137);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_QUOTED_ISA, $list179);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_GENL, $list181);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_ISA, $list185);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, $list187);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, $list190);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT, $list192);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_ISA, $list195);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA, $list200);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_GENL, $list204);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DEFN, $list209);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_DEFN, $list213);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, $list216);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, $list219);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_ISA_GENL, $list223);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_GENL_ISA, $list227);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_FORMAT, $list232);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_FORMAT, $list245);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DIFFERENT, $list251);
            wff_module_datastructures.wff_violation_module($MAL_RELN_WRT_ARG_ISA_REQUIRED, $list258);
            wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_TRUE_SBHL, $list266);
            wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_FALSE_SBHL, $list281);
            wff_module_datastructures.wff_violation_module($DISJOINT_ARG_ISA, $list286);
            wff_module_datastructures.wff_violation_module($DISJOINT_ARG_QUOTED_ISA, $list296);
            wff_module_datastructures.wff_violation_module($DISJOINT_ARG_GENL, $list298);
            wff_module_datastructures.wff_violation_module($ISOLATED_TERMS, $list301);
            wff_module_datastructures.wff_violation_module($IRRELEVANT_LITERALS, $list307);
            wff_module_datastructures.wff_violation_module($RESTRICTED_SKOLEM_ASSERTION, $list312);
            wff_module_datastructures.wff_violation_module($RESTRICTED_PREDICATE_ASSERTION, $list316);
            wff_module_datastructures.wff_violation_module($RESTRICTED_COLLECTION_ASSERTION, $list320);
            wff_module_datastructures.wff_violation_module($EVALUATABLE_LITERAL_FALSE, $list324);
            wff_module_datastructures.wff_violation_module($kw326$EXCEPT_FOR_W_O_SINGLETON_VAR, $list327);
            wff_module_datastructures.wff_violation_module($INVALID_MT_FOR_TOU, $list331);
            wff_module_datastructures.wff_violation_module($NON_DEFN_PRED_IN_VOCAB_MT, $list334);
            wff_module_datastructures.wff_violation_module($PREDICATE_ISA_VIOLATION, $list337);
            wff_module_datastructures.wff_violation_module($META_PREDICATE_VIOLATION, $list341);
            wff_module_datastructures.wff_violation_module($MAL_PRECANONICALIZATIONS, $list345);
            wff_module_datastructures.wff_violation_module($INVALID_EXPANSION, $list348);
            wff_module_datastructures.wff_violation_module($RECURSION_LIMIT_EXCEEDED, $list357);
            wff_module_datastructures.wff_violation_module($EL_UNEVALUATABLE_EXPRESSION, $list360);
            wff_module_datastructures.wff_violation_module($QUANTIFIED_SEQUENCE_VARIABLE, $list363);
            wff_module_datastructures.wff_violation_module($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, $list366);
            wff_module_datastructures.wff_violation_module($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, $list369);
            wff_module_datastructures.wff_violation_module($INHIBITED_SEQUENCE_VARIABLE, $list372);
            wff_module_datastructures.wff_violation_module($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, $list375);
            wff_module_datastructures.wff_violation_module($CYCLIC_COMMUTATIVE_IN_ARGS, $list378);
            wff_module_datastructures.wff_violation_module($DEFINING_MT_VIOLATION, $list381);
            wff_module_datastructures.wff_violation_module($DISJUNCT_IN_PRAGMATIC_REQUIREMENT, $list384);
            wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_DISJUNCTION, $list388);
            wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_CONJUNCTION, $list392);
            wff_module_datastructures.wff_violation_module($RESTRICTED_MT_ASSERTION, $list395);
            wff_module_datastructures.wff_violation_module($SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL, $list405);
            wff_module_datastructures.wff_violation_module($REIFIABLE_BUT_NOT_FORWARD_REIFIABLE, $list409);
        }
        if (SubLFiles.USE_V2) {
            wff_module_datastructures.wff_violation_module($INVALID_SENTENCE, $list_alt13);
            wff_module_datastructures.wff_violation_module($NOT_AN_ASCII_STRING, $list_alt24);
            wff_module_datastructures.wff_violation_module($MAL_FORTS, $list_alt28);
            wff_module_datastructures.wff_violation_module($MAL_FORT, $list_alt31);
            wff_module_datastructures.wff_violation_module($MAL_ARITY, $list_alt35);
            wff_module_datastructures.wff_violation_module($ARITY_MISMATCH, $list_alt41);
            wff_module_datastructures.wff_violation_module($VIOLATED_ARITY, $list_alt45);
            wff_module_datastructures.wff_violation_module($MISSING_ARITY, $list_alt54);
            wff_module_datastructures.wff_violation_module($MALFORMED_ARGS, $list_alt58);
            wff_module_datastructures.wff_violation_module($NOT_A_DENOTATIONAL_TERM, $list_alt62);
            wff_module_datastructures.wff_violation_module($NOT_A_TRUTH_FUNCTION, $list_alt65);
            wff_module_datastructures.wff_violation_module($NOT_AN_EL_FORMULA, $list_alt68);
            wff_module_datastructures.wff_violation_module($NOT_AN_EL_VARIABLE, $list_alt71);
            wff_module_datastructures.wff_violation_module($SEQUENCE_NON_VAR, $list_alt74);
            wff_module_datastructures.wff_violation_module($EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, $list_alt78);
            wff_module_datastructures.wff_violation_module($INVALID_MT, $list_alt84);
            wff_module_datastructures.wff_violation_module($MAL_FN_NESTING, $list_alt87);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_IFF_DEFN, $list_alt90);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_IFF_DEFN, $list_alt103);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_SUF_DEFNS, $list_alt106);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_SUF_DEFNS, $list_alt109);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_NEC_DEFN, $list_alt112);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_NEC_DEFN, $list_alt117);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_DEFN, $list_alt120);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_QUOTED_DEFN, $list_alt127);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_ISA, $list_alt130);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_QUOTED_ISA, $list_alt156);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_GENL, $list_alt158);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, $list_alt162);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, $list_alt165);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT, $list_alt167);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_ISA, $list_alt170);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA, $list_alt175);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_GENL, $list_alt179);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DEFN, $list_alt184);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_DEFN, $list_alt188);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, $list_alt191);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, $list_alt194);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_FORMAT, $list_alt198);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_FORMAT, $list_alt211);
            wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DIFFERENT, $list_alt217);
            wff_module_datastructures.wff_violation_module($MAL_RELN_WRT_ARG_ISA_REQUIRED, $list_alt224);
            wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_TRUE_SBHL, $list_alt232);
            wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_FALSE_SBHL, $list_alt247);
            wff_module_datastructures.wff_violation_module($DISJOINT_ARG_ISA, $list_alt252);
            wff_module_datastructures.wff_violation_module($DISJOINT_ARG_QUOTED_ISA, $list_alt262);
            wff_module_datastructures.wff_violation_module($DISJOINT_ARG_GENL, $list_alt264);
            wff_module_datastructures.wff_violation_module($ISOLATED_TERMS, $list_alt267);
            wff_module_datastructures.wff_violation_module($IRRELEVANT_LITERALS, $list_alt273);
            wff_module_datastructures.wff_violation_module($RESTRICTED_SKOLEM_ASSERTION, $list_alt278);
            wff_module_datastructures.wff_violation_module($RESTRICTED_PREDICATE_ASSERTION, $list_alt282);
            wff_module_datastructures.wff_violation_module($RESTRICTED_COLLECTION_ASSERTION, $list_alt286);
            wff_module_datastructures.wff_violation_module($EVALUATABLE_LITERAL_FALSE, $list_alt290);
            wff_module_datastructures.wff_violation_module($kw292$EXCEPT_FOR_W_O_SINGLETON_VAR, $list_alt293);
            wff_module_datastructures.wff_violation_module($INVALID_MT_FOR_TOU, $list_alt297);
            wff_module_datastructures.wff_violation_module($NON_DEFN_PRED_IN_VOCAB_MT, $list_alt300);
            wff_module_datastructures.wff_violation_module($PREDICATE_ISA_VIOLATION, $list_alt303);
            wff_module_datastructures.wff_violation_module($META_PREDICATE_VIOLATION, $list_alt307);
            wff_module_datastructures.wff_violation_module($MAL_PRECANONICALIZATIONS, $list_alt311);
            wff_module_datastructures.wff_violation_module($INVALID_EXPANSION, $list_alt314);
            wff_module_datastructures.wff_violation_module($RECURSION_LIMIT_EXCEEDED, $list_alt323);
            wff_module_datastructures.wff_violation_module($EL_UNEVALUATABLE_EXPRESSION, $list_alt326);
            wff_module_datastructures.wff_violation_module($QUANTIFIED_SEQUENCE_VARIABLE, $list_alt329);
            wff_module_datastructures.wff_violation_module($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, $list_alt332);
            wff_module_datastructures.wff_violation_module($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, $list_alt335);
            wff_module_datastructures.wff_violation_module($INHIBITED_SEQUENCE_VARIABLE, $list_alt338);
            wff_module_datastructures.wff_violation_module($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, $list_alt341);
            wff_module_datastructures.wff_violation_module($CYCLIC_COMMUTATIVE_IN_ARGS, $list_alt344);
            wff_module_datastructures.wff_violation_module($DEFINING_MT_VIOLATION, $list_alt347);
            wff_module_datastructures.wff_violation_module($DISJUNCT_IN_PRAGMATIC_REQUIREMENT, $list_alt350);
            wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_DISJUNCTION, $list_alt354);
            wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_CONJUNCTION, $list_alt358);
            wff_module_datastructures.wff_violation_module($RESTRICTED_MT_ASSERTION, $list_alt361);
        }
        return NIL;
    }

    public static SubLObject setup_wff_modules_file_Previous() {
        wff_module_datastructures.wff_violation_module($INVALID_VARIABLES, $list1);
        wff_module_datastructures.wff_violation_module($INVALID_SENTENCE, $list14);
        wff_module_datastructures.wff_violation_module($NOT_AN_ASCII_STRING, $list25);
        wff_module_datastructures.wff_violation_module($MAL_FORTS, $list29);
        wff_module_datastructures.wff_violation_module($MAL_FORT, $list32);
        wff_module_datastructures.wff_violation_module($MAL_ARITY, $list36);
        wff_module_datastructures.wff_violation_module($ARITY_MISMATCH, $list42);
        wff_module_datastructures.wff_violation_module($VIOLATED_ARITY, $list46);
        wff_module_datastructures.wff_violation_module($MISSING_ARITY, $list56);
        wff_module_datastructures.wff_violation_module($MALFORMED_ARGS, $list60);
        wff_module_datastructures.wff_violation_module($NOT_A_DENOTATIONAL_TERM, $list64);
        wff_module_datastructures.wff_violation_module($NOT_A_TRUTH_FUNCTION, $list67);
        wff_module_datastructures.wff_violation_module($NOT_AN_EL_FORMULA, $list70);
        wff_module_datastructures.wff_violation_module($NOT_AN_EL_VARIABLE, $list73);
        wff_module_datastructures.wff_violation_module($NOT_A_LIST_OF_VARIABLES, $list76);
        wff_module_datastructures.wff_violation_module($SEQUENCE_NON_VAR, $list79);
        wff_module_datastructures.wff_violation_module($EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, $list83);
        wff_module_datastructures.wff_violation_module($INVALID_MT, $list89);
        wff_module_datastructures.wff_violation_module($MAL_FN_NESTING, $list92);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_IFF_DEFN, $list95);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_IFF_DEFN, $list111);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_SUF_DEFNS, $list114);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_SUF_DEFNS, $list117);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_NEC_DEFN, $list120);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_QUOTED_NEC_DEFN, $list125);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_DEFN, $list128);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_COL_QUOTED_DEFN, $list134);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_ISA, $list137);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_QUOTED_ISA, $list179);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_GENL, $list181);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_ISA, $list185);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, $list187);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, $list190);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT, $list192);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_ISA, $list195);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA, $list200);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_GENL, $list204);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DEFN, $list209);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_DEFN, $list213);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, $list216);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, $list219);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_ISA_GENL, $list223);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_GENL_ISA, $list227);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_ARG_FORMAT, $list232);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_FORMAT, $list245);
        wff_module_datastructures.wff_violation_module($MAL_ARG_WRT_INTER_ARG_DIFFERENT, $list251);
        wff_module_datastructures.wff_violation_module($MAL_RELN_WRT_ARG_ISA_REQUIRED, $list258);
        wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_TRUE_SBHL, $list266);
        wff_module_datastructures.wff_violation_module($CONFLICT_ASSERTING_FALSE_SBHL, $list281);
        wff_module_datastructures.wff_violation_module($DISJOINT_ARG_ISA, $list286);
        wff_module_datastructures.wff_violation_module($DISJOINT_ARG_QUOTED_ISA, $list296);
        wff_module_datastructures.wff_violation_module($DISJOINT_ARG_GENL, $list298);
        wff_module_datastructures.wff_violation_module($ISOLATED_TERMS, $list301);
        wff_module_datastructures.wff_violation_module($IRRELEVANT_LITERALS, $list307);
        wff_module_datastructures.wff_violation_module($RESTRICTED_SKOLEM_ASSERTION, $list312);
        wff_module_datastructures.wff_violation_module($RESTRICTED_PREDICATE_ASSERTION, $list316);
        wff_module_datastructures.wff_violation_module($RESTRICTED_COLLECTION_ASSERTION, $list320);
        wff_module_datastructures.wff_violation_module($EVALUATABLE_LITERAL_FALSE, $list324);
        wff_module_datastructures.wff_violation_module($kw326$EXCEPT_FOR_W_O_SINGLETON_VAR, $list327);
        wff_module_datastructures.wff_violation_module($INVALID_MT_FOR_TOU, $list331);
        wff_module_datastructures.wff_violation_module($NON_DEFN_PRED_IN_VOCAB_MT, $list334);
        wff_module_datastructures.wff_violation_module($PREDICATE_ISA_VIOLATION, $list337);
        wff_module_datastructures.wff_violation_module($META_PREDICATE_VIOLATION, $list341);
        wff_module_datastructures.wff_violation_module($MAL_PRECANONICALIZATIONS, $list345);
        wff_module_datastructures.wff_violation_module($INVALID_EXPANSION, $list348);
        wff_module_datastructures.wff_violation_module($RECURSION_LIMIT_EXCEEDED, $list357);
        wff_module_datastructures.wff_violation_module($EL_UNEVALUATABLE_EXPRESSION, $list360);
        wff_module_datastructures.wff_violation_module($QUANTIFIED_SEQUENCE_VARIABLE, $list363);
        wff_module_datastructures.wff_violation_module($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, $list366);
        wff_module_datastructures.wff_violation_module($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, $list369);
        wff_module_datastructures.wff_violation_module($INHIBITED_SEQUENCE_VARIABLE, $list372);
        wff_module_datastructures.wff_violation_module($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, $list375);
        wff_module_datastructures.wff_violation_module($CYCLIC_COMMUTATIVE_IN_ARGS, $list378);
        wff_module_datastructures.wff_violation_module($DEFINING_MT_VIOLATION, $list381);
        wff_module_datastructures.wff_violation_module($DISJUNCT_IN_PRAGMATIC_REQUIREMENT, $list384);
        wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_DISJUNCTION, $list388);
        wff_module_datastructures.wff_violation_module($BAD_EXPONENTIAL_CONJUNCTION, $list392);
        wff_module_datastructures.wff_violation_module($RESTRICTED_MT_ASSERTION, $list395);
        wff_module_datastructures.wff_violation_module($SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL, $list405);
        wff_module_datastructures.wff_violation_module($REIFIABLE_BUT_NOT_FORWARD_REIFIABLE, $list409);
        return NIL;
    }

    static private final SubLList $list_alt252 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJOINTED-ARG-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is said to be #$isa of disjoint collections."));

    static private final SubLList $list_alt253 = listS(makeSymbol("VAR"), makeSymbol("DISJOINT"), makeSymbol("MT"), makeSymbol("DATA"));

    static private final SubLString $str_alt254$Variable__s_is_subject_to_disjoin = makeString("Variable ~s is subject to disjoint ~%isa constraints ~s in mt ~s.~%");

    static private final SubLString $str_alt258$__Original_formula______s = makeString("~%Original formula: ~% ~s");

    static private final SubLString $str_alt259$__Expansion_formula______s = makeString("~%Expansion formula: ~% ~s");

    static private final SubLString $str_alt260$__WFF_checked_formula______s = makeString("~%WFF checked formula: ~% ~s");

    static private final SubLList $list_alt262 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJOINTED-ARG-QUOTED-ISA"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is said to be #$quotedIsa of disjoint collections."));

    static private final SubLList $list_alt264 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJOINTED-ARG-GENL"), makeKeyword("COMMENT"), makeString("The sentence contains a term which is said to be #$genls of disjoint collections."));

    static private final SubLString $str_alt265$Variable__s_is_subject_to_disjoin = makeString("Variable ~s is subject to disjoint ~%genl constraints ~s in mt ~s.~%");

    static private final SubLList $list_alt267 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-ISOLATED-TERMS"), makeKeyword("COMMENT"), makeString("The sentence contains terms which are isolated when strict coherence is enforced."));

    static private final SubLList $list_alt268 = list(makeSymbol("SENTENCE"), makeSymbol("TERMS"));

    static private final SubLString $str_alt269$__s_is_an_isolated_term_in___s___ = makeString(" ~s is an isolated term in~%~s.~%");

    static private final SubLString $str_alt270$__s__are_isolated_terms_in___s___ = makeString(" ~s~%are isolated terms in~%~s.~%");

    static private final SubLList $list_alt273 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-IRRELEVANT-LITERALS"), makeKeyword("COMMENT"), makeString("The sentence contains literals which become irrelevant when strict coherence is enforced. (Normally simplifier takes care of such cases and reduces them.  This violation will be generated in the above case only when simplifier is turned off and coherence checking is done.)."));

    static private final SubLList $list_alt274 = list(makeSymbol("SENTENCE"), makeSymbol("IRRELEVANT"));

    static private final SubLString $str_alt275$__s_is_irrelevant_in___s___ = makeString(" ~s is irrelevant in~%~s.~%");

    static private final SubLString $str_alt276$__s__are_irrelevant_in___s___ = makeString(" ~s~%are irrelevant in~%~s.~%");

    static private final SubLList $list_alt278 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-SKOLEM-ASSERTION"), makeKeyword("COMMENT"), makeString("The sentence attempts to state more about a skolem function, which is not allowed."));

    static private final SubLSymbol $sym279$REIFIED_SKOLEM_FN_IN_ANY_MT_ = makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?");

    static private final SubLString $str_alt280$Asserting_a_sentence_that_referen = makeString("Asserting a sentence that references a skolem (e.g., ~s) ~%in a literal with predicate ~s is prohibited.~%");

    static private final SubLList $list_alt282 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-PREDICATE-ASSERTION"), makeKeyword("COMMENT"), makeString("The sentence attempts to assert a literal with a predicate which is #$notAssertible."));

    static private final SubLString $str_alt283$Asserting_a_literal_with_predicat = makeString("Asserting a literal with predicate ~s is prohibited in mt ~s.~%");

    static private final SubLList $list_alt286 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-COLLECTION-ASSERTION"), makeKeyword("COMMENT"), makeString("The sentence attempts to assert members for a collection which is #$notAssertibleCollection."));

    static private final SubLString $str_alt287$Asserting_an___isa_literal_with_c = makeString("Asserting an #$isa literal with collection ~s is prohibited in mt ~s.~%");

    static private final SubLList $list_alt290 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EVALUATABLE-LITERAL-FALSE"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt291$Asserting_a_sentence_in_mt__s____ = makeString("Asserting a sentence in mt ~s ~%  that references a false evaluatable literal: ~%  ~s ~%  is prohibited.~%");

    public static final SubLSymbol $kw292$EXCEPT_FOR_W_O_SINGLETON_VAR = makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");

    static private final SubLList $list_alt293 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt294$__exceptFor_sentence_arg2_must_ha = makeString("#$exceptFor sentence arg2 must have precisely one variable but has ~s~s~a.~%");

    static private final SubLString $str_alt295$__ = makeString(": ");

    static private final SubLList $list_alt297 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-MT-FOR-TOU"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt298$attempt_to_assert___termOfUnit_ga = makeString("attempt to assert #$termOfUnit gaf in mt ~s; it may only be asserted in mt ~s.~%");

    static private final SubLList $list_alt300 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT"), makeKeyword("COMMENT"), makeString(""));

    @Override
    public void declareFunctions() {
        declare_wff_modules_file();
    }

    static private final SubLString $str_alt301$attempt_to_assert_gaf_with_non_de = makeString("attempt to assert gaf with non-definitional predicate ~S in vocab mt ~s.~%");

    @Override
    public void initializeVariables() {
        init_wff_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wff_modules_file();
    }

    static {
    }

    static private final SubLList $list_alt303 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-PREDICATE-ISA-VIOLATION"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLList $list_alt304 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));

    static private final SubLString $str_alt305$___isa__s__s__in_mt__s__ = makeString("(#$isa ~s ~s) in mt ~s~%");

    static private final SubLList $list_alt307 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-META-PREDICATE-VIOLATION"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLList $list_alt308 = list(makeSymbol("PRED"), makeSymbol("META-PRED"), makeSymbol("META-PRED-VALUE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));

    static private final SubLString $str_alt309$__s__s__s__in_mt__s__ = makeString("(~s ~s ~s) in mt ~s~%");

    static private final SubLList $list_alt311 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-MAL-PRECANONICALIZATIONS"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt312$Uninformative_error_during_precan = makeString("Uninformative error during precanonicalization.~%~%");

    static private final SubLList $list_alt314 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INVALID-EXPANSION"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt320$_A_has_arity__A__but_the_expansio = makeString("~A has arity ~A, but the expansion for ~A requires arity ~A, because it references the generic argument ~A.~%");

    static private final SubLString $str_alt321$_A_does_not_fit_the_pattern_of_th = makeString("~A does not fit the pattern of the expansion of ~A, which is ~A.~%");

    static private final SubLList $list_alt323 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RECURSION-LIMIT-EXCEEDED"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt324$Recursion_limit_exceeded__probabl = makeString("Recursion limit exceeded; probably trying to expand a recursive EL relation.~%~%");

    static private final SubLList $list_alt326 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-EL-UNEVALUATABLE-EXPRESSION"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt327$_was_marked_as___evaluateAtEL__bu = makeString(" was marked as #$evaluateAtEL, but was unevaluatable.");

    static private final SubLList $list_alt329 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt330$The_variable__A_is_existentially_ = makeString("The variable ~A is existentially quantified and then used as a sequence variable in the sentence~%~A.~%See rule Q2 in the sequence variable specification.");

    static private final SubLList $list_alt332 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt333$The_variables__A_were_used_as_seq = makeString("The variables ~A were used as sequence variables within the scope of the existentially quantified variable ~A.  Only one such sequence variable is permitted.  See rule Q3 in the sequence variable specification.");

    static private final SubLList $list_alt335 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt336$The_variable__A_was_used_both_as_ = makeString("The variable ~A was used both as a sequence variable and a term variable within the scope of the existentially quantified variable ~A, in the sentence~%~A.~%See rule Q4 in the sequence variable specification.");

    static private final SubLList $list_alt338 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-INHIBITED-SEQUENCE-VARIABLE"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt339$The_variable__A_was_used_as_a_seq = makeString("The variable ~A was used as a sequence variable in the sentence ~A, which is not allowed because ~A is scoped.  See the section on scoping expressions in the sequence variable specification.");

    static private final SubLList $list_alt341 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt342$In_conflict___a___No_more_than_on = makeString("In conflict: ~a.~%No more than one #$commutativeInArgsAndRest assertion is allowed.~%");

    static private final SubLList $list_alt344 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt345$An_assertion_of_partial_commutati = makeString("An assertion of partial commutativity has already been made about argument position ~a of relation ~a, namely:~%~a.~%");

    static private final SubLList $list_alt347 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DEFINING-MT-VIOLATION"), makeKeyword("COMMENT"), makeString(""));

    static private final SubLString $str_alt348$Term__a_was_referenced_in__a___bu = makeString("Term ~a was referenced in ~a ~%but is defined only in ~a.~%");

    static private final SubLList $list_alt350 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT"), makeKeyword("COMMENT"), makeString("The sentence is a pragmatic requirement which contains a disjunct.  e.g. (#$pragmaticRequirement (#$or (#$isa ?X #$Dog) (#$isa ?X #$Cat)) (#$implies (#$isa ?X #$DomesticPet) (#$relationInstanceAll #$loves ?X #$HumanChild)))"));

    static private final SubLList $list_alt351 = list(makeSymbol("PRAGMATIC-CONDITION"), makeSymbol("SENTENCE"), makeSymbol("MT"));

    static private final SubLString $str_alt352$Disjoint_condition__s_is_present_ = makeString("Disjoint condition ~s is present in ~%~s ~s. ~%Disjunct condition is not allowed in a pragmatic requirement sentence.~%");

    static private final SubLList $list_alt354 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION"), makeKeyword("COMMENT"), makeString("The sentence is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));

    static private final SubLList $list_alt355 = list(makeSymbol("SENTENCE"));

    static private final SubLString $str_alt356$_s_is_a_disjunction_of_conjunctio = makeString("~s is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");

    static private final SubLList $list_alt358 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION"), makeKeyword("COMMENT"), makeString("The sentence is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));

    static private final SubLString $str_alt359$_s_is_a_conjunction_of_disjunctio = makeString("~s is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");

    static private final SubLList $list_alt361 = list(makeKeyword("EXPLAIN-FUNC"), makeSymbol("EXPLAIN-RESTRICTED-MT-ASSERTION"), makeKeyword("COMMENT"), makeString("The microtheory specified for the the sentence is a #$notAssertibleMt. For decontextualized collection / predicates the specified mt will be taken as the convention mt."));

    static private final SubLList $list_alt362 = list(makeSymbol("MT"), makeSymbol("LITERAL"), makeSymbol("DECONTEXTUALIZED-LITERAL?"));

    static private final SubLString $str_alt363$Asserting_the_decontextualized_li = makeString("Asserting the decontextualized literal ~s in its convention mt ~s is prohibited.");

    static private final SubLString $str_alt364$Asserting_the_literal__s_in_micro = makeString("Asserting the literal ~s in microtherory ~s is prohibited.");
}

/**
 * Total time: 1501 ms
 */
