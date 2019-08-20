/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OPTIMIZED-FUNCALL-DECLARATIONS
 * source file: /cyc/top/cycl/optimized-funcall-declarations.lisp
 * created:     2019/07/03 17:39:08
 */
public final class optimized_funcall_declarations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new optimized_funcall_declarations();



    private static final SubLObject $list0 = _constant_0_initializer();

    public static SubLObject declare_optimized_funcall_declarations_file() {
        return NIL;
    }

    public static SubLObject init_optimized_funcall_declarations_file() {
        return NIL;
    }

    public static SubLObject setup_optimized_funcall_declarations_file() {
        SubLSpecialOperatorDeclarations.proclaim($list0);
        return NIL;
    }

    private static SubLObject _constant_0_initializer() {
        return list(new SubLObject[]{ makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CLEAR-ARG-COLLECTIONS"), makeSymbol("CLEAR-AT-ARGN-INT-CACHED"), makeSymbol("CLEAR-CACHED-ALL-INSTANCES-AMONG"), makeSymbol("CLEAR-CACHED-EVALUATION-FUNCTION"), makeSymbol("CLEAR-CACHED-RELATION-ARG-OK?"), makeSymbol("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE"), makeSymbol("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE"), makeSymbol("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES"), makeSymbol("CLEAR-CACHED-UNION-ALL-SPECS-COUNT"), makeSymbol("CLEAR-CMLS-DECODING-TABLE"), makeSymbol("CLEAR-CONCEPT-FILTER-ALL-ISA"), makeSymbol("CLEAR-DATA-PARSER-ALL-ISA"), makeSymbol("CLEAR-EXTENSIONAL-SET?"), makeSymbol("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET"), makeSymbol("CLEAR-GET-AFFECTED-PARTS"), makeSymbol("CLEAR-GET-COOCCURRING-CONDITIONS"), makeSymbol("CLEAR-GET-TREATED-CONDITION"), makeSymbol("CLEAR-GET-TREATMENTS-FOR-CONDITION"), makeSymbol("CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME"), makeSymbol("CLEAR-INDETERMINATE-TERM-P"), makeSymbol("CLEAR-KEY-GAF-ARG-INDEX-CACHED"), makeSymbol("CLEAR-MAL-ACTUAL-ARITY-CACHED?"), makeSymbol("CLEAR-MAL-ARITY-CACHED?"), makeSymbol("CLEAR-META-RELATION-SOMEWHERE?"), makeSymbol("CLEAR-MONAD-GENL-MT-CACHED?"), makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER"), makeSymbol("CLEAR-POS-TO-SEMTRANS-PRED-CACHED"), makeSymbol("CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED"), makeSymbol("CLEAR-PREDS-FOR-LEXICON-EXCLUSION"), makeSymbol("CLEAR-SENTENTIAL-OPERATORS"), makeSymbol("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED"), makeSymbol("CLEAR-SKSI-CONTENT-MTS"), makeSymbol("INDEXICAL-NOW"), makeSymbol("ADMITTING-DEFN-ASSERTIONS"), makeSymbol("ALLOWED-MODULES-SPEC-P"), makeSymbol("ALPHANUMERICP"), makeSymbol("ARGUMENT-TYPE-PROPER-GENLS"), makeSymbol("ARITY"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"), makeSymbol("ASSERTED-ARGUMENT-P"), makeSymbol("ASSERTION-FORMULA"), makeSymbol("ASSERTION-MT"), makeSymbol("ASSERTION-P"), makeSymbol("ASSERTION-WITH-SEARCH-TERM"), makeSymbol("ATOMIC-SENTENCE-PREDICATE"), makeSymbol("BASE-VARIABLE-P"), makeSymbol("BINDING-P"), makeSymbol("CANON-VAR?"), makeSymbol("CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE"), makeSymbol("CANONICALIZE-CLAUSE-QUOTED-TERMS"), makeSymbol("CANONICALIZE-CLAUSE-SENTENCE-TERMS"), makeSymbol("CANONICALIZE-CLAUSE-TOU-TERMS"), makeSymbol("CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE"), makeSymbol("CANONICALIZE-LITERAL-SENTENCE-TERMS"), makeSymbol("CFASL-INPUT-ASSERTION"), makeSymbol("CFASL-INPUT-AVL-TREE-NODE"), makeSymbol("CFASL-INPUT-CHARACTER"), makeSymbol("CFASL-INPUT-COMMON-SYMBOL"), makeSymbol("CFASL-INPUT-CONSTANT"), makeSymbol("CFASL-INPUT-DEDUCTION"), makeSymbol("CFASL-INPUT-DICTIONARY"), makeSymbol("CFASL-INPUT-DOTTED-LIST"), makeSymbol("CFASL-INPUT-GENERAL-VECTOR"), makeSymbol("CFASL-INPUT-GENERATION-TEMPLATE"), makeSymbol("CFASL-INPUT-GUID"), makeSymbol("CFASL-INPUT-HL-END"), makeSymbol("CFASL-INPUT-HL-START"), makeSymbol("CFASL-INPUT-KB-HL-SUPPORT"), makeSymbol("CFASL-INPUT-KEYWORD"), makeSymbol("CFASL-INPUT-LIST"), makeSymbol("CFASL-INPUT-N-8BIT-INT"), makeSymbol("CFASL-INPUT-NART"), makeSymbol("CFASL-INPUT-NIL"), makeSymbol("CFASL-INPUT-NL-TRIE-WORD-STRUC"), makeSymbol("CFASL-INPUT-OTHER-SYMBOL"), makeSymbol("CFASL-INPUT-P-16BIT-INT"), makeSymbol("CFASL-INPUT-P-24BIT-INT"), makeSymbol("CFASL-INPUT-P-32BIT-INT"), makeSymbol("CFASL-INPUT-P-BIGNUM"), makeSymbol("CFASL-INPUT-P-FLOAT"), makeSymbol("CFASL-INPUT-PPH-OI"), makeSymbol("CFASL-INPUT-PPH-PHRASE-AGR"), makeSymbol("CFASL-INPUT-SBHL-DIRECTED-LINK"), makeSymbol("CFASL-INPUT-SET"), makeSymbol("CFASL-INPUT-STRING"), makeSymbol("CFASL-INPUT-VARIABLE"), makeSymbol("CFASL-INPUT-SBHL-UNDIRECTED-LINK"), makeSymbol("CFASL-INPUT-N-24BIT-INT"), makeSymbol("CFASL-INPUT-TEMPLATE-RULE"), makeSymbol("CFASL-INPUT-CLAUSE-STRUC"), makeSymbol("CFASL-INPUT-N-FLOAT"), makeSymbol("CLASS-NAME"), makeSymbol("CLOSED-HLMT-P"), makeSymbol("CLOSED-NAUT?"), makeSymbol("COL-DEFN-ADMITS?"), makeSymbol("COLLECTION-P"), makeSymbol("CONJUNCTIONS-IN"), makeSymbol("CORE-MICROTHEORY-P"), makeSymbol("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?"), makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P"), makeSymbol("CYC-ASCII-STRING-P"), makeSymbol("CYC-BIT-DATATYPE"), makeSymbol("CYC-GUID-STRING-P"), makeSymbol("CYC-IP4-ADDRESS"), makeSymbol("CYC-IP4-NETWORK-ADDRESS"), makeSymbol("CYC-LIST-IS-MINIMUM-LENGTH"), makeSymbol("CYC-LIST-OF-LISTS"), makeSymbol("CYC-NUMERIC-STRING-NECESSARY"), makeSymbol("CYC-STRING-IS-MINIMUM-LENGTH"), makeSymbol("CYC-SUBL-HL-SUPPORT-MODULE-P"), makeSymbol("CYC-SUBL-QUERY-PROPERTY-P"), makeSymbol("CYC-SUBL-TV-P"), makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?"), makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT"), makeSymbol("CYC-ZIP-CODE-NINE-DIGIT"), makeSymbol("CYC-1-BYTE-INTEGER"), makeSymbol("CYC-2-BYTE-INTEGER"), makeSymbol("CYC-4-BYTE-INTEGER"), makeSymbol("CYC-8-BYTE-INTEGER"), makeSymbol("CYC-DIFFERENT"), makeSymbol("CYC-EVALUATE-ARG"), makeSymbol("CYC-INDIVIDUAL-NECESSARY"), makeSymbol("CYC-LIST-OF-TYPE-NECESSARY"), makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT"), makeSymbol("CYC-STRING-IS-LENGTH"), makeSymbol("CYC-STRING-IS-MAXIMUM-LENGTH"), makeSymbol("CYC-VAR?"), makeSymbol("CYCL-CANONICALIZER-DIRECTIVE?"), makeSymbol("CYCL-SENTENCE-ASSERTIBLE?"), makeSymbol("CYCL-GENERALIZED-TENSED-LITERAL-P"), makeSymbol("CYCL-QUOTED-TERM-P"), makeSymbol("CYCL-VARIABLE-P"), makeSymbol("DATE-P-INTERNAL"), makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"), makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"), makeSymbol("DEFAULT-ITERATOR-DONE-P"), makeSymbol("DET-INVISIBLE-CHAR?"), makeSymbol("DIGIT-CHAR-P"), makeSymbol("DO-IMPLICATIONS"), makeSymbol("DO-NEGATIONS-DESTRUCTIVE"), makeSymbol("DO-PPH-EXPAND-PHRASE-NAUTS"), makeSymbol("DOTTED-LIST-P"), makeSymbol("EL-CONJUNCTION-P"), makeSymbol("EL-DISJUNCTION-P"), makeSymbol("EL-EVALUATABLE-EXPRESSION?"), makeSymbol("EL-FORMULA-P"), makeSymbol("EL-IMPLICIT-META-LITERAL-SENTENCE-P"), makeSymbol("EL-MEETS-PRAGMATIC-REQUIREMENT-P"), makeSymbol("EL-META-FORMULA?"), makeSymbol("EL-NEGATION-P"), makeSymbol("EL-VAR?"), makeSymbol("EL-VARIABLE-P"), makeSymbol("ERT-ID"), makeSymbol("ESCAPE-QUOTE-SYNTAX-P"), makeSymbol("EXPAND-SUBL-FN-P"), makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?"), makeSymbol("EXTRACT-LINK-NODES-INT"), makeSymbol("FAST-FI-NOT-EL-TERM?"), makeSymbol("FAST-NON-SKOLEM-INDETERMINATE-TERM?"), makeSymbol("FAST-REIFIED-SKOLEM?"), makeSymbol("FAST-SKOLEM-NAT?"), makeSymbol("FIND-ASSERTION-BY-ID"), makeSymbol("FLIP-CONS"), makeSymbol("FORMULA-WITH-SEQUENCE-TERM?"), makeSymbol("FORT-P"), makeSymbol("FORWARD-ASYMMETRIC-REQUIRED"), makeSymbol("FORWARD-EVAL-EXCLUSIVE-POS"), makeSymbol("FORWARD-GENLINVERSE-POS-RULE-SELECT"), makeSymbol("FORWARD-GENLPREDS-POS-RULE-SELECT"), makeSymbol("FORWARD-ISA-RULE-SELECT"), makeSymbol("FORWARD-IST-POS-RULE-SELECT"), makeSymbol("FORWARD-NEGATIONPREDS-REQUIRED"), makeSymbol("FORWARD-NEGATIONINVERSE-REQUIRED"), makeSymbol("FORWARD-NORMAL-POS-RULE-SELECT"), makeSymbol("FORWARD-SYMMETRIC-POS-RULE-SELECT"), makeSymbol("FORWARD-UNBOUND-PRED-POS-REQUIRED"), makeSymbol("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS"), makeSymbol("FORWARD-NON-TRIGGER-LITERAL-LIT?"), makeSymbol("FULLY-BOUND-P"), makeSymbol("FULLY-INDEXED-TERM-P"), makeSymbol("GAF?"), makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?"), makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT"), makeSymbol("GAF-FORMULA"), makeSymbol("GATHER-ASSERTIONS"), makeSymbol("GET-SBHL-MODULE"), makeSymbol("GEN-TEMPLATE-VERBOSITY"), makeSymbol("GENERALITY-ESTIMATE"), makeSymbol("GENERALIZED-IST-CLAUSE-P"), makeSymbol("GENERIC-ARG-P"), makeSymbol("GET-GEN-TEMPLATE-ASSERTION"), makeSymbol("GET-TERM-ID"), makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-NEXT"), makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE"), makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-DONE"), makeSymbol("GROUND-EL-META-FORMULA?"), makeSymbol("GT-REQUIRED-ARG-TYPE-P"), makeSymbol("HLMT?"), makeSymbol("HL-EXTERNAL-ID-STRING-P"), makeSymbol("HL-JUSTIFY-EVAL"), makeSymbol("HL-MODULE-SENSE"), makeSymbol("HL-STORE-ITERATOR-DESTROY"), makeSymbol("HL-STORE-ITERATOR-DONE?"), makeSymbol("HL-TERM-WITH-EL-COUNTERPART-P"), makeSymbol("HL-VAR?"), makeSymbol("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF"), makeSymbol("HL-VARIABLE-P"), makeSymbol("INDEXED-TERM-P"), makeSymbol("INDEXICAL-REFERENT-TERM-P"), makeSymbol("INFERENCE-BINDINGS-HL-TO-EL"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?"), makeSymbol("INFERENCE-BINDING-P"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P"), makeSymbol("INFERENCE-DYNAMIC-PROPERTY-P"), makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?"), makeSymbol("INFERENCE-PREDICATE-P"), makeSymbol("INFERENCE-QUERY-METRIC-P"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("INFERENCE-STATIC-PROPERTY-P"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?"), makeSymbol("INITIALIZE-SUFFIX-TABLE-FOR-VAR"), makeSymbol("INVALID-ASSERTION?"), makeSymbol("INVALID-CONSTANT?"), makeSymbol("INVALID-CONSTANT-NAME-CHAR-P"), makeSymbol("INVALID-FORT?"), makeSymbol("INVALID-INDEXED-TERM?"), makeSymbol("INVALID-VARIABLE-NAME-CHAR"), makeSymbol("ITERATE-KEYHASH-NECESSARY"), makeSymbol("ITERATE-LIST-DONE"), makeSymbol("ITERATE-LIST-NEXT"), makeSymbol("ITERATE-NON-NULL-SINGLETON-NEXT"), makeSymbol("ITERATE-NUMBER-DONE"), makeSymbol("ITERATE-VECTOR-NEXT"), makeSymbol("ITERATOR-ITERATOR-DONE"), makeSymbol("ITERATOR-ITERATOR-NEXT"), makeSymbol("KAPPA-PREDICATE-P"), makeSymbol("KB-ASSERTION?"), makeSymbol("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?"), makeSymbol("LENGTH-FIRST"), makeSymbol("LITERAL-QUANTIFIED-FN-TERMS"), makeSymbol("LITERAL-TERMS-TO-REIFY"), makeSymbol("M"), makeSymbol("MONAD-MT-P"), makeSymbol("MONAD-CYCL-MT?"), makeSymbol("MT-UNION-MTS-RECURSIVE-INT"), makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?"), makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT"), makeSymbol("NART-HL-FORMULA"), makeSymbol("NEGATED-TEST-FUNC"), makeSymbol("NESTED-COLLECTIONSUBSETFN-EXPRESSION?"), makeSymbol("NL-TRIE-BREAK-CHAR-P"), makeSymbol("NL-TRIE-INAPPROPRIATE-ENTRY?"), makeSymbol("NL-TRIE-NAME-STRING-PRED?"), makeSymbol("NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?"), makeSymbol("NL-TRIE-SYNTACTIC-PRED?"), makeSymbol("NON-CONTIGUOUS-HL-VAR?"), makeSymbol("NON-FIXED-VARIABLE-P"), makeSymbol("NON-HL-PREDICATE-P"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("NON-WF-FORT-P"), makeSymbol("NON-WF-VARIABLE-P"), makeSymbol("NOT-DIGIT-CHAR-P"), makeSymbol("NOT-FULLY-BOUND-P"), makeSymbol("NUM-INDEX"), makeSymbol("NUM-PREDICATE-EXTENT-INDEX"), makeSymbol("POSSIBLY-NEW-EXCEPTIONAL-VAR-P"), makeSymbol("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR"), makeSymbol("POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?"), makeSymbol("PPH-ARG-POSITION-SPECIFIER?"), makeSymbol("PPH-CURRENT-LIST-ITEM-FORMULA-P"), makeSymbol("PPH-DISCOURSE-PARTICIPANT-P"), makeSymbol("PPH-EXISTENTIAL-FORMULA-P"), makeSymbol("PPH-EXISTENTIAL-RMP-SENTENCE?"), makeSymbol("PPH-FIND-INDEXICAL-TEMPLATE-FOR-DATES"), makeSymbol("PPH-FINITE-VERB-PRED?"), makeSymbol("PPH-GPE?"), makeSymbol("PPH-HYPOTHETICAL?"), makeSymbol("PPH-IDENTITY-TEMPLATE-P"), makeSymbol("PPH-INDEXICAL-DATE-P"), makeSymbol("PPH-LEXICAL-WORD?"), makeSymbol("PPH-NAUT?"), makeSymbol("PPH-NON-PLURAL-NOUN-PRED?"), makeSymbol("PPH-NTH-PHRASE-NAUT-P"), makeSymbol("PPH-PHRASE-OUTPUT-ITEM-EMPTY-P"), makeSymbol("PPH-PHRASE-OUTPUT-ITEM-LOOSE-P"), makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING"), makeSymbol("PPH-PHRASE-OUTPUT-LIST-P"), makeSymbol("PPH-POSSIBLY-PROCESSABLE-INDEXICAL-P"), makeSymbol("PPH-RM-CYCL"), makeSymbol("PPH-VALID-VAR-TYPE?"), makeSymbol("PRAGMATIC-FILTER-ACTIVE?"), makeSymbol("PQ-COLLISION-EMPTY"), makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"), makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"), makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?"), makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT"), makeSymbol("PREDICATE-P"), makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"), makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"), makeSymbol("PREDICATE-WITH-PARSE-TREE-SUPPORT-P"), makeSymbol("PROBLEM-STORE-PROPERTY-P"), makeSymbol("PROOF-PROVEN?"), makeSymbol("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY"), makeSymbol("PRUNE-SKSI-ONLY-LITERAL-IMPOSSIBLE-APPLICABILITY"), makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY"), makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY"), makeSymbol("QUASI-QUOTE-SYNTAX-P"), makeSymbol("QUERY-DYNAMIC-PROPERTY-P"), makeSymbol("QUERY-STATIC-PROPERTY-P"), makeSymbol("QUOTED-TERM-WITH-HL-VAR?"), makeSymbol("QUOTIFY"), makeSymbol("RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?"), makeSymbol("RECURSIVELY-STANDARDIZE-VARIABLES"), makeSymbol("REFLEXIVE-ON-PREDICATE?"), makeSymbol("REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS"), makeSymbol("REIFIED-SKOLEM-CONSTANT-TERM?"), makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?"), makeSymbol("REMOVAL-GENLS-BETWEEN-APPLICABILITY"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"), makeSymbol("REMOVAL-LOOKUP-POS-COST"), makeSymbol("REMOVAL-LOOKUP-POS-ITERATOR"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY"), makeSymbol("REMOVAL-ABDUCTION-ALLOWED?"), makeSymbol("REMOVAL-ALL-INSTANCES-COST"), makeSymbol("REMOVAL-ALL-INSTANCES-COMPLETENESS"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-COST"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-COST"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR"), makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), makeSymbol("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?"), makeSymbol("REMOVAL-TRANSITIVE-ARG1-WALK-COST"), makeSymbol("REMOVAL-TVA-UNIFY-COST"), makeSymbol("RENAME-CLAUSE-VARS-INT"), makeSymbol("RENAMED-DEFAULT-EL-VAR-P"), makeSymbol("REUSABLE-ITERATOR-NEXT"), makeSymbol("SBHL-CHECK-CUTOFF"), makeSymbol("SBHL-CONSIDER-ANY-NODE"), makeSymbol("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES"), makeSymbol("SBHL-GATHER-SD-CANDIDATES"), makeSymbol("SBHL-MARK-CLOSURE-AS-MARKED"), makeSymbol("SBHL-MARK-SD-GENLS-ISAS"), makeSymbol("SBHL-MARKED-IN-TARGET-SPACE-P"), makeSymbol("SBHL-MAX-FLOOR-MTS"), makeSymbol("SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P"), makeSymbol("SBHL-PREDICATE-UNMARKING-FN"), makeSymbol("SBHL-PUSH-ONTO-RESULT-IF"), makeSymbol("SBHL-STEP-GATHER-DISJOINS"), makeSymbol("SBHL-STOP-AT-HORIZON"), makeSymbol("SBHL-TIME-PREDICATE-P"), makeSymbol("SCOPING-RELATION-EXPRESSION?"), makeSymbol("SCOPING-RELATION-P"), makeSymbol("SIBLING-DISJOINT-COLLECTION-P"), makeSymbol("SIMPLIFY-CYCL-SENTENCE-INT"), makeSymbol("SINGLE-DIMENSION-MT-DIMENSION"), makeSymbol("SKOLEM-CONSTANT?"), makeSymbol("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?"), makeSymbol("SOME-TRANSITIVE-VIA-ARG-ASSERTION?"), makeSymbol("SORT-CLAUSE-LITERALS"), makeSymbol("SPECIAL-CORE-LOOP-MT-P"), makeSymbol("SPECS-FN-NAT?"), makeSymbol("SPEECH-PART-PRED?"), makeSymbol("STRATEGY-DYNAMIC-PROPERTY-P"), makeSymbol("STRATEGY-STATIC-PROPERTY-P"), makeSymbol("STRING-W/O-CONTROL-CHARS?"), makeSymbol("SUBLISP-TRUE"), makeSymbol("SUPPORT-MT"), makeSymbol("SUPPORT-P"), makeSymbol("SXHASH-ASSERTION-METHOD"), makeSymbol("SXHASH-CONSTANT-METHOD"), makeSymbol("SXHASH-DEDUCTION-METHOD"), makeSymbol("SXHASH-GENERATION-TEMPLATE-METHOD"), makeSymbol("SXHASH-HL-END-METHOD"), makeSymbol("SXHASH-HL-MODULE-METHOD"), makeSymbol("SXHASH-HL-START-METHOD"), makeSymbol("SXHASH-INFERENCE-METHOD"), makeSymbol("SXHASH-KB-HL-SUPPORT-METHOD"), makeSymbol("SXHASH-NART-METHOD"), makeSymbol("SXHASH-NL-TRIE-WORD-STRUC-METHOD"), makeSymbol("SXHASH-PREFERENCE-MODULE-METHOD"), makeSymbol("SXHASH-PROBLEM-LINK-METHOD"), makeSymbol("SXHASH-PROBLEM-METHOD"), makeSymbol("SXHASH-PROOF-METHOD"), makeSymbol("SXHASH-STRATEGY-METHOD"), makeSymbol("SXHASH-TACTIC-METHOD"), makeSymbol("SXHASH-TEMPLATE-RULE-METHOD"), makeSymbol("SXHASH-VARIABLE-METHOD"), makeSymbol("SYMBOL-FUNCTION"), makeSymbol("TACTIC-POSSIBLE?"), makeSymbol("TACTIC-PROGRESS-DONE?"), makeSymbol("TACTIC-PROGRESS-FINALIZE"), makeSymbol("TACTIC-PROGRESS-NEXT"), makeSymbol("TEMPORAL-INDEXICAL-EXPAND"), makeSymbol("TEMPORAL-INDEXICAL-P"), makeSymbol("TEMPORAL-DIMENSION-MT-P"), makeSymbol("THING-TUPLE?"), makeSymbol("TL-TERM?"), makeSymbol("TOU-ATOMIC-SENTENCE?"), makeSymbol("TRANSFORMATION-TACTIC-P"), makeSymbol("TRANS-PREDICATE-POS-REQUIRED"), makeSymbol("TRANS-PREDICATE-POS-COST"), makeSymbol("TRANS-PREDICATE-POS-RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-COST"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-COST"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-COST"), makeSymbol("TVA-ASSERTION-P"), makeSymbol("UNIVERSALS-OUT"), makeSymbol("UNREIFIED-SKOLEM-TERM?"), makeSymbol("URL-P"), makeSymbol("VALID-ASSERTION"), makeSymbol("VALID-CONSTANT?"), makeSymbol("VALID-FORT-TYPE?"), makeSymbol("VAR-SPEC?"), makeSymbol("VARIABLE-BINDING-VALUE"), makeSymbol("VARIABLE-BINDING-VARIABLE"), makeSymbol("VARIABLE-NON-BASE-VERSION"), makeSymbol("VARIABLE-TERM-WRT-ARG-TYPE?"), makeSymbol("VARIABLE-TOKEN"), makeSymbol("AES-ABLE-TO-ATE"), makeSymbol("AES-ADD-E-BEFORE-S"), makeSymbol("AES-BLE-TO-BIL-BEFORE-ITY"), makeSymbol("AES-CHANGE-AIC-TO-AC"), makeSymbol("AES-CHANGE-CEIVE-TO-CEPT"), makeSymbol("AES-CHANGE-IE-TO-Y"), makeSymbol("AES-CHANGE-ISM-TO-IST"), makeSymbol("AES-CHANGE-Y-TO-I"), makeSymbol("AES-GEMINATE-LAST"), makeSymbol("AES-REMOVE-ABLE-LE-BEFORE-LY"), makeSymbol("AES-STRIP-FINAL-E"), makeSymbol("AES-STRIP-FINAL-VOWELS-BEFORE-IC"), makeSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER"), makeSymbol("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?"), makeSymbol("BQ-LIST"), makeSymbol("CLEAR-ISA-DEPENDENT-CACHES"), makeSymbol("COMMUTATIVE-TERMS-IN-ORDER?"), makeSymbol("CONSTANT-PRINT-FUNCTION-TRAMPOLINE"), makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P"), makeSymbol("FIMPLIES"), makeSymbol("FORM-SORT-PRED"), makeSymbol("FORWARD-ISA-EXPAND"), makeSymbol("FORWARD-IST-POS-EXPAND"), makeSymbol("FORWARD-NORMAL-POS-EXPAND"), makeSymbol("FORT-INTERNAL-ID"), makeSymbol("FORT-<"), makeSymbol("GENL-POS-PRED?"), makeSymbol("HAPPINESS->"), makeSymbol("HLMT-EQUAL"), makeSymbol("INFERENCE-CONTEXTUALIZED-ASENT-<"), makeSymbol("INFERENCE-REMOVE-UNIFY-DEFAULT"), makeSymbol("INSTANCEOF-AFTER-ADDING"), makeSymbol("INSTANCEOF-AFTER-REMOVING"), makeSymbol("JUSTIFICATION-EQUAL"), makeSymbol("LIT-<"), makeSymbol("LOAD-ASSERTION-DEF-FROM-CACHE"), makeSymbol("LOAD-DEDUCTION-DEF-FROM-CACHE"), makeSymbol("LOAD-NART-HL-FORMULA-FROM-CACHE"), makeSymbol("MAPPED-PROBLEM-EQUAL"), makeSymbol("MATCHES-PRAGMA-RULE-INDEX-TEST"), makeSymbol("NEITHER-DIRECTION?"), makeSymbol("NL-GENERATION-CACHE-METHOD"), makeSymbol("NUMERAL-PARSER-STRING="), makeSymbol("OPAQUE-ARG-WRT-QUOTING?"), makeSymbol("OTHER-INDEX-ASSERTION-MATCH-P"), makeSymbol("PATTERN-MATCHES-FORMULA"), makeSymbol("PATTERN-MATCHES-FORMULA-NAT-METHOD"), makeSymbol("PATTERN-MATCHES-TREE-RECURSIVE"), makeSymbol("PGIA-AFTER-ADDING-ISA"), makeSymbol("PPH-ANCESTOR-PHRASE-OR-SELF-P"), makeSymbol("PPH-ARG-POSITION-SUBSUMES?"), makeSymbol("PPH-DATE-MATCHES-INDEXICAL?"), makeSymbol("PPH-GENL-PREDICATE?"), makeSymbol("PPH-PHRASE-SET-SUID"), makeSymbol("PPH-PRED-LICENSED-BY-PRED?"), makeSymbol("PPH-PREFER-ASSERTION?"), makeSymbol("PPH-SPEC?"), makeSymbol("PPH-SPEC-PREDICATE?"), makeSymbol("PREFER-POS-PRED?"), makeSymbol("PREFERRED-GEN-UNIT-METHOD"), makeSymbol("PREFERRED-LEXIFICATION-METHOD"), makeSymbol("PQ-COLLISION-ENTER"), makeSymbol("PQ-COLLISION-REMOVE"), QUOTE, makeSymbol("RBP-RULE-<"), makeSymbol("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), makeSymbol("REMOVAL-EVAL-EXCLUSIVE"), makeSymbol("REMOVAL-EVAL-REQUIRED"), makeSymbol("REMOVAL-FCP-FIND-NAT-REQUIRED"), makeSymbol("REMOVAL-GENLPREDS-CHECK-EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"), makeSymbol("REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR"), makeSymbol("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND"), makeSymbol("REMOVAL-SUPERSET-EXPAND"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"), makeSymbol("REUSABLE-ITERATOR-DONE"), makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE"), makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT"), makeSymbol("SET-CONTENTS-SIZE"), makeSymbol("SHOP-EFFECT-REQUIRED"), makeSymbol("SORT-VIA-POSITION-EARLIER"), makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED"), makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS"), makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND"), makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR"), makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM"), makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"), makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT"), makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP"), makeSymbol("STRATEGY-SORT-PREDICATE?"), makeSymbol("SUBST-BINDINGS"), makeSymbol("SUPPORT-<"), makeSymbol("SUPPORT-EQUAL"), makeSymbol("TERM-<"), makeSymbol("TRANS-PREDICATE-POS-RULE-FILTER"), makeSymbol("TRANS-PREDICATE-POS-EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"), makeSymbol("UNION"), makeSymbol("VARIABLE-TOKEN"), makeSymbol("VARIABLE-<"), makeSymbol("ALL-INSTANCES-POS-PREFERENCE"), makeSymbol("ANY-SDC-WRT?"), makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?"), makeSymbol("RELATION-ALL-EXISTS-POS-PREFERENCE"), makeSymbol("RELATION-EXISTS-ALL-POS-PREFERENCE"), makeSymbol("SHARPSIGN-DOLLAR-RMF"), makeSymbol("SORT"), makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<"), makeSymbol("ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?"), makeSymbol("FINAL-INDEX-ITERATOR-FILTERED"), makeSymbol("UNIFY-CLAUSE"), makeSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER"), makeSymbol("ASSERTION-DIRECTION-HL-STORAGE-APPLICABLE?"), makeSymbol("CONSTANT-NAME-HL-STORAGE-APPLICABLE?"), makeSymbol("HL-ADD-AS-KB-ASSERTION"), makeSymbol("INDEXICAL-THE-USER-HL-STORAGE-APPLICABLE?"), makeSymbol("IST-ASSERTION-APPLICABLE?"), makeSymbol("MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?"), makeSymbol("MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?"), makeSymbol("MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?"), makeSymbol("MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?"), makeSymbol("MY-CREATION-DATE-HL-STORAGE-MODULE-APPLICABLE?"), makeSymbol("PERFORM-SUBL-HL-STORAGE-APPLICABLE?"), makeSymbol("REGULAR-KB-ASSERTION-APPLICABLE?"), makeSymbol("CADAR"), makeSymbol("CHAR-IN-CHAR-SET"), makeSymbol("CONTEXTUALIZED-ISA-X-Y-LIT?"), makeSymbol("DECODING-PHYSICAL-FIELD-INDEXICALS"), makeSymbol("DEFAULT-EL-VAR?"), makeSymbol("FIND-NART"), makeSymbol("FORMULA-TERM-SIGNATURE-VISIT"), makeSymbol("HL-TERM-TO-EL-TERM"), makeSymbol("HTML-URL-EXPAND-CHAR"), makeSymbol("LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P"), makeSymbol("LOGICAL-FIELD-INDEXICAL-P"), makeSymbol("NON-SKSI-EVALUATABLE-EXPRESSION?"), makeSymbol("PHYSICAL-FIELD-INDEXICAL-P"), makeSymbol("SKSI-COST-RECORDING-ITERATOR-DONE"), makeSymbol("SKSI-CRM-RESULT-ITERATOR-DONE"), makeSymbol("SKSI-SORT-ASENTS-BOUND-VAR-P"), makeSymbol("SKSI-SORT-ASENTS-UNBOUND-VAR-P"), makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-ARGUMENT-POSITION"), makeSymbol("WHITESPACEP"), makeSymbol("XML-TOKEN-MENTIONS"), makeSymbol("POS-SUBCLAUSE-SPEC->"), makeSymbol("SKSI-ASENT-BETTER-WRT-PRIMARY-CHARACTERICS"), makeSymbol("TERM-<"), makeSymbol("XML-TOKEN-MENTIONS"), makeSymbol("AGENDA-SHOULD-QUIT?"), makeSymbol("RESTART-AGENDA-FLAG?"), makeSymbol("SAVE-OPERATIONS?"), makeSymbol("WORRY-TRANSMIT-OPERATIONS?"), makeSymbol("RUN-AUXILIARY-OP?"), makeSymbol("RUN-LOCAL-OP?"), makeSymbol("NORMAL-TRANSMIT-OPERATIONS?"), makeSymbol("RUN-REMOTE-OP?"), makeSymbol("LOAD-OPERATIONS?"), makeSymbol("SAVE-EXPERIENCE?"), makeSymbol("AGENDA-SAVE-ASKED-QUERIES?"), makeSymbol("MONITOR-SKSI-GLOBAL-RESOURCING?"), makeSymbol("AGENDA-DAILY-GC-READY-P"), makeSymbol("AGENDA-WORK-TO-DO") });
    }

    @Override
    public void declareFunctions() {
        declare_optimized_funcall_declarations_file();
    }

    @Override
    public void initializeVariables() {
        init_optimized_funcall_declarations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_optimized_funcall_declarations_file();
    }

    static {
    }
}

/**
 * Total time: 164 ms
 */
