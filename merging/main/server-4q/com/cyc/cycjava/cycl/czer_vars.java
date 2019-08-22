/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_ask$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$fi_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CZER-VARS
 * source file: /cyc/top/cycl/czer-vars.lisp
 * created:     2019/07/03 17:37:19
 */
public final class czer_vars extends SubLTranslatedFile implements V12 {
    /**
     * If T, the simplifier will simplify #$equalSymbols literals with one variable argument and one bound argument by substituting the binding throughout the conjunction.  WARNING: this may cause scoping problems and has not been fully tested.
     */
    // defparameter
    @LispMethod(comment = "If T, the simplifier will simplify #$equalSymbols literals with one variable argument and one bound argument by substituting the binding throughout the conjunction.  WARNING: this may cause scoping problems and has not been fully tested.\ndefparameter")
    public static final SubLSymbol $simplify_equal_symbols_literalP$ = makeSymbol("*SIMPLIFY-EQUAL-SYMBOLS-LITERAL?*");

    public static final SubLFile me = new czer_vars();

 public static final String myName = "com.cyc.cycjava.cycl.czer_vars";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $required_arg_preds$ = makeSymbol("*REQUIRED-ARG-PREDS*");

    // deflexical
    @LispMethod(comment = "Integers denoting the most common arg positions of fixed-arity CycL relations.\ndeflexical")
    public static final SubLSymbol $arg_positions$ = makeSymbol("*ARG-POSITIONS*");

    // defparameter
    @LispMethod(comment = "suppresses resetting *arg-type-violations*\ndefparameter")
    public static final SubLSymbol $accumulating_semantic_violationsP$ = makeSymbol("*ACCUMULATING-SEMANTIC-VIOLATIONS?*");

    // defparameter
    // descriptions of how a relational expression is not semantically valid
    /**
     * descriptions of how a relational expression is not semantically valid
     */
    @LispMethod(comment = "descriptions of how a relational expression is not semantically valid\ndefparameter")
    public static final SubLSymbol $semantic_violations$ = makeSymbol("*SEMANTIC-VIOLATIONS*");

    // defparameter
    // which function to use when accessing the formula for an assertion
    /**
     * which function to use when accessing the formula for an assertion
     */
    @LispMethod(comment = "which function to use when accessing the formula for an assertion\ndefparameter")
    public static final SubLSymbol $assertion_key$ = makeSymbol("*ASSERTION-KEY*");

    // defparameter
    // which function to use when accessing the formula for a nart
    /**
     * which function to use when accessing the formula for a nart
     */
    @LispMethod(comment = "which function to use when accessing the formula for a nart\ndefparameter")
    public static final SubLSymbol $nart_key$ = makeSymbol("*NART-KEY*");

    // defparameter
    /**
     * which function to use when accessing the formula for a reified formula (the
     * genl of nart and assertion)
     */
    @LispMethod(comment = "which function to use when accessing the formula for a reified formula (the\r\ngenl of nart and assertion)\ndefparameter\nwhich function to use when accessing the formula for a reified formula (the\ngenl of nart and assertion)")
    public static final SubLSymbol $rf_key$ = makeSymbol("*RF-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $implication_operators$ = makeSymbol("*IMPLICATION-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $logical_operators$ = makeSymbol("*LOGICAL-OPERATORS*");

    // deflexical
    // cyc constants that denote functions whose ranges are skolem functions
    /**
     * cyc constants that denote functions whose ranges are skolem functions
     */
    @LispMethod(comment = "cyc constants that denote functions whose ranges are skolem functions\ndeflexical")
    public static final SubLSymbol $skolem_function_functions$ = makeSymbol("*SKOLEM-FUNCTION-FUNCTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_isa_binary_preds$ = makeSymbol("*ARG-ISA-BINARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_isa_ternary_preds$ = makeSymbol("*ARG-ISA-TERNARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_not_isa_binary_preds$ = makeSymbol("*ARG-NOT-ISA-BINARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_not_isa_ternary_preds$ = makeSymbol("*ARG-NOT-ISA-TERNARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_quoted_isa_binary_preds$ = makeSymbol("*ARG-QUOTED-ISA-BINARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_quoted_isa_ternary_preds$ = makeSymbol("*ARG-QUOTED-ISA-TERNARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_genl_binary_preds$ = makeSymbol("*ARG-GENL-BINARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_genl_ternary_preds$ = makeSymbol("*ARG-GENL-TERNARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_format_binary_preds$ = makeSymbol("*ARG-FORMAT-BINARY-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $arg_format_ternary_preds$ = makeSymbol("*ARG-FORMAT-TERNARY-PREDS*");

    // deflexical
    // arg-type for meta predicates
    /**
     * arg-type for meta predicates
     */
    @LispMethod(comment = "arg-type for meta predicates\ndeflexical")
    public static final SubLSymbol $meta_arg_type$ = makeSymbol("*META-ARG-TYPE*");

    // deflexical
    // arg-type for meta predicates
    /**
     * arg-type for meta predicates
     */
    @LispMethod(comment = "arg-type for meta predicates\ndeflexical")
    public static final SubLSymbol $possibly_meta_arg_type$ = makeSymbol("*POSSIBLY-META-ARG-TYPE*");

    // defparameter
    /**
     * a dynamic stack of variables that are currently not permitted to be used as
     * sequence variables (e.g. because they're scoped)
     */
    @LispMethod(comment = "a dynamic stack of variables that are currently not permitted to be used as\r\nsequence variables (e.g. because they\'re scoped)\ndefparameter\na dynamic stack of variables that are currently not permitted to be used as\nsequence variables (e.g. because they\'re scoped)")
    public static final SubLSymbol $variables_that_cannot_be_sequence_variables$ = makeSymbol("*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*");

    // defparameter
    // are sequence variables permitted?
    /**
     * are sequence variables permitted?
     */
    @LispMethod(comment = "are sequence variables permitted?\ndefparameter")
    public static final SubLSymbol $el_supports_dot_syntaxP$ = makeSymbol("*EL-SUPPORTS-DOT-SYNTAX?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $el_supports_variable_arity_skolemsP$ = makeSymbol("*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*");

    // defparameter
    // is support for contractions (inverse #$expansions) enabled?
    /**
     * is support for contractions (inverse #$expansions) enabled?
     */
    @LispMethod(comment = "is support for contractions (inverse #$expansions) enabled?\ndefparameter")
    public static final SubLSymbol $el_supports_contractionsP$ = makeSymbol("*EL-SUPPORTS-CONTRACTIONS?*");

    // defvar
    // Variable to keep track if we are inside a quote form
    /**
     * Variable to keep track if we are inside a quote form
     */
    @LispMethod(comment = "Variable to keep track if we are inside a quote form\ndefvar")
    public static final SubLSymbol $inside_quote$ = makeSymbol("*INSIDE-QUOTE*");

    // defparameter
    // Whether to use the code for the new canonicalizer
    /**
     * Whether to use the code for the new canonicalizer
     */
    @LispMethod(comment = "Whether to use the code for the new canonicalizer\ndefparameter")
    public static final SubLSymbol $new_canonicalizerP$ = makeSymbol("*NEW-CANONICALIZER?*");

    // defparameter
    /**
     * transient state variable; is t during the execution of canonicalizing
     * functions
     */
    @LispMethod(comment = "transient state variable; is t during the execution of canonicalizing\r\nfunctions\ndefparameter\ntransient state variable; is t during the execution of canonicalizing\nfunctions")
    public static final SubLSymbol $within_canonicalizerP$ = makeSymbol("*WITHIN-CANONICALIZER?*");

    // defparameter
    // canonicalizer state variable [:cnf :dnf]
    /**
     * canonicalizer state variable [:cnf :dnf]
     */
    @LispMethod(comment = "canonicalizer state variable [:cnf :dnf]\ndefparameter")
    public static final SubLSymbol $form_of_clausal_form$ = makeSymbol("*FORM-OF-CLAUSAL-FORM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $must_enforce_semanticsP$ = makeSymbol("*MUST-ENFORCE-SEMANTICS?*");

    // defparameter
    // controls tracing level for canonicalizer [0..5]
    /**
     * controls tracing level for canonicalizer [0..5]
     */
    @LispMethod(comment = "controls tracing level for canonicalizer [0..5]\ndefparameter")
    public static final SubLSymbol $el_trace_level$ = makeSymbol("*EL-TRACE-LEVEL*");

    // defparameter
    /**
     * controls whether the formula is printed after each step of canonicalization.
     * only set to t for debugging purposes.
     */
    @LispMethod(comment = "controls whether the formula is printed after each step of canonicalization.\r\nonly set to t for debugging purposes.\ndefparameter\ncontrols whether the formula is printed after each step of canonicalization.\nonly set to t for debugging purposes.")
    public static final SubLSymbol $canon_verboseP$ = makeSymbol("*CANON-VERBOSE?*");

    // defparameter
    // default predicate to identify variables
    /**
     * default predicate to identify variables
     */
    @LispMethod(comment = "default predicate to identify variables\ndefparameter")
    public static final SubLSymbol $varP$ = makeSymbol("*VAR?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $subordinate_fi_opsP$ = makeSymbol("*SUBORDINATE-FI-OPS?*");

    // defparameter
    // flag to break on error conditions
    /**
     * flag to break on error conditions
     */
    @LispMethod(comment = "flag to break on error conditions\ndefparameter")
    public static final SubLSymbol $cryP$ = makeSymbol("*CRY?*");

    // defparameter
    /**
     * should the canonicalizer include only free vars referenced in existentially
     * quantified formulas in argument lists of the resulting skolem functions?
     */
    @LispMethod(comment = "should the canonicalizer include only free vars referenced in existentially\r\nquantified formulas in argument lists of the resulting skolem functions?\ndefparameter\nshould the canonicalizer include only free vars referenced in existentially\nquantified formulas in argument lists of the resulting skolem functions?")
    public static final SubLSymbol $minimal_skolem_arityP$ = makeSymbol("*MINIMAL-SKOLEM-ARITY?*");

    // defparameter
    /**
     * should the canonicalizer translate existentially quantified vars into skolem
     * functions during asks?
     */
    @LispMethod(comment = "should the canonicalizer translate existentially quantified vars into skolem\r\nfunctions during asks?\ndefparameter\nshould the canonicalizer translate existentially quantified vars into skolem\nfunctions during asks?")
    public static final SubLSymbol $skolemize_during_asksP$ = makeSymbol("*SKOLEMIZE-DURING-ASKS?*");

    // defparameter
    /**
     * should the canonicalizer, when canonicalizing existentials, simply drop them
     * (like it does by default during asks)? This setting, if true, overrides the
     * combination of *within-ask* and *skolemize-during-asks?*, but does not
     * override the case of *turn-existentials-into-skolems?* being false, which
     * will cause no existential handling at all to be done.
     *
     * @see drop-all-existentials?
     * @see existentials-out
     */
    @LispMethod(comment = "should the canonicalizer, when canonicalizing existentials, simply drop them\r\n(like it does by default during asks)? This setting, if true, overrides the\r\ncombination of *within-ask* and *skolemize-during-asks?*, but does not\r\noverride the case of *turn-existentials-into-skolems?* being false, which\r\nwill cause no existential handling at all to be done.\r\n\r\n@see drop-all-existentials?\r\n@see existentials-out\ndefparameter\nshould the canonicalizer, when canonicalizing existentials, simply drop them\n(like it does by default during asks)? This setting, if true, overrides the\ncombination of *within-ask* and *skolemize-during-asks?*, but does not\noverride the case of *turn-existentials-into-skolems?* being false, which\nwill cause no existential handling at all to be done.")
    public static final SubLSymbol $drop_all_existentialsP$ = makeSymbol("*DROP-ALL-EXISTENTIALS?*");

    // defparameter
    /**
     * should the canonicalizer, when canonicalizing existentials that are not in
     * the scope of any other variable, simply drop them (like it does by default
     * during asks)? This setting, if true, overrides the combination of
     * within-ask* and *skolemize-during-asks?*, but does not override the case of
     * turn-existentials-into-skolems?* being false, which will cause no
     * existential handling at all to be done.
     *
     * @see leave-skolem-constants-alone?
     * @see existentials-out
     */
    @LispMethod(comment = "should the canonicalizer, when canonicalizing existentials that are not in\r\nthe scope of any other variable, simply drop them (like it does by default\r\nduring asks)? This setting, if true, overrides the combination of\r\nwithin-ask* and *skolemize-during-asks?*, but does not override the case of\r\nturn-existentials-into-skolems?* being false, which will cause no\r\nexistential handling at all to be done.\r\n\r\n@see leave-skolem-constants-alone?\r\n@see existentials-out\ndefparameter\nshould the canonicalizer, when canonicalizing existentials that are not in\nthe scope of any other variable, simply drop them (like it does by default\nduring asks)? This setting, if true, overrides the combination of\nwithin-ask* and *skolemize-during-asks?*, but does not override the case of\nturn-existentials-into-skolems?* being false, which will cause no\nexistential handling at all to be done.")
    public static final SubLSymbol $leave_skolem_constants_aloneP$ = makeSymbol("*LEAVE-SKOLEM-CONSTANTS-ALONE?*");

    // defparameter
    /**
     * Whether to enforce criterion Q2 in the Sequence Variable Specification,
     * namely: Q2: Within asserts, sequence variables can only be universally
     * quantified; using existentially quantified variables as sequence variables is
     * not permitted. If T, Q2 is enforced. If NIL, Q2 is not enforced. If
     * :assert-only, Q2 is enforced iff (within-assert?).
     */
    @LispMethod(comment = "Whether to enforce criterion Q2 in the Sequence Variable Specification,\r\nnamely: Q2: Within asserts, sequence variables can only be universally\r\nquantified; using existentially quantified variables as sequence variables is\r\nnot permitted. If T, Q2 is enforced. If NIL, Q2 is not enforced. If\r\n:assert-only, Q2 is enforced iff (within-assert?).\ndefparameter\nWhether to enforce criterion Q2 in the Sequence Variable Specification,\nnamely: Q2: Within asserts, sequence variables can only be universally\nquantified; using existentially quantified variables as sequence variables is\nnot permitted. If T, Q2 is enforced. If NIL, Q2 is not enforced. If\n:assert-only, Q2 is enforced iff (within-assert?).")
    public static final SubLSymbol $forbid_quantified_sequence_variablesP$ = makeSymbol("*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*");

    // defparameter
    /**
     * should the canonicalizer create and reference skolem constants instead of
     * zero-arity skolem functions?
     */
    @LispMethod(comment = "should the canonicalizer create and reference skolem constants instead of\r\nzero-arity skolem functions?\ndefparameter\nshould the canonicalizer create and reference skolem constants instead of\nzero-arity skolem functions?")
    public static final SubLSymbol $use_skolem_constantsP$ = makeSymbol("*USE-SKOLEM-CONSTANTS?*");

    // defparameter
    // should commutative terms of gafs be sorted?
    /**
     * should commutative terms of gafs be sorted?
     */
    @LispMethod(comment = "should commutative terms of gafs be sorted?\ndefparameter")
    public static final SubLSymbol $canonicalize_gaf_commutative_termsP$ = makeSymbol("*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*");

    // defparameter
    /**
     * The function that the canonicalizer uses internally to check whether
     * something is a variable. :default means that it will use the default
     * function @xref cyc-var? (this is slightly more efficient than just making the
     * default be #'cyc-var?)
     *
     * @see canon-var?
     */
    @LispMethod(comment = "The function that the canonicalizer uses internally to check whether\r\nsomething is a variable. :default means that it will use the default\r\nfunction @xref cyc-var? (this is slightly more efficient than just making the\r\ndefault be #\'cyc-var?)\r\n\r\n@see canon-var?\ndefparameter\nThe function that the canonicalizer uses internally to check whether\nsomething is a variable. :default means that it will use the default\nfunction @xref cyc-var? (this is slightly more efficient than just making the\ndefault be #\'cyc-var?)")
    public static final SubLSymbol $canon_var_function$ = makeSymbol("*CANON-VAR-FUNCTION*");

    // defparameter
    /**
     * determines the type of variables produced by the canonicalzer [:el-var
     * :kb-var]
     */
    @LispMethod(comment = "determines the type of variables produced by the canonicalzer [:el-var\r\n:kb-var]\ndefparameter\ndetermines the type of variables produced by the canonicalzer [:el-var\n:kb-var]")
    public static final SubLSymbol $canonical_variable_type$ = makeSymbol("*CANONICAL-VARIABLE-TYPE*");

    // defparameter
    /**
     * stores the variable rename mappings formed while standardizing variables
     * during canonicalization
     */
    @LispMethod(comment = "stores the variable rename mappings formed while standardizing variables\r\nduring canonicalization\ndefparameter\nstores the variable rename mappings formed while standardizing variables\nduring canonicalization")
    public static final SubLSymbol $standardize_variables_memory$ = makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*");

    // defparameter
    // is distributing meta-knowledge over multiple assertions permitted?
    /**
     * is distributing meta-knowledge over multiple assertions permitted?
     */
    @LispMethod(comment = "is distributing meta-knowledge over multiple assertions permitted?\ndefparameter")
    public static final SubLSymbol $distributing_meta_knowledgeP$ = makeSymbol("*DISTRIBUTING-META-KNOWLEDGE?*");

    // defparameter
    /**
     * should meta-knowledge distribute over multiple assertions when those
     * assertions all share a common el formula?
     */
    @LispMethod(comment = "should meta-knowledge distribute over multiple assertions when those\r\nassertions all share a common el formula?\ndefparameter\nshould meta-knowledge distribute over multiple assertions when those\nassertions all share a common el formula?")
    public static final SubLSymbol $distribute_meta_over_common_elP$ = makeSymbol("*DISTRIBUTE-META-OVER-COMMON-EL?*");

    // defparameter
    /**
     * If a decontextualized assertion is in the wrong mt, should the canonicalizer,
     * if asked to look up that assertion, find it? If T, it will find it. If NIL,
     * it will treat it like any other uncanonical assertion and fail to find it.
     */
    @LispMethod(comment = "If a decontextualized assertion is in the wrong mt, should the canonicalizer,\r\nif asked to look up that assertion, find it? If T, it will find it. If NIL,\r\nit will treat it like any other uncanonical assertion and fail to find it.\ndefparameter\nIf a decontextualized assertion is in the wrong mt, should the canonicalizer,\nif asked to look up that assertion, find it? If T, it will find it. If NIL,\nit will treat it like any other uncanonical assertion and fail to find it.")
    public static final SubLSymbol $find_uncanonical_decontextualized_assertionsP$ = makeSymbol("*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*");

    // defparameter
    /**
     * should EL variables in EL template args be canonicalized into HL variables
     * during asks? If t, then queries like (expansion genls (implies (isa ?OBJ
     * :ARG1) (isa ?OBJ :ARG2))) will not be interpreted as a boolean query, and
     * will return ((?OBJ . ?OBJ)) instead of ((T . T)). If it is set to nil, then
     * queries like (expansion genls ?WHAT) will be interpreted as a boolean query,
     * and will return NIL instead of the expansion of genls.
     */
    @LispMethod(comment = "should EL variables in EL template args be canonicalized into HL variables\r\nduring asks? If t, then queries like (expansion genls (implies (isa ?OBJ\r\n:ARG1) (isa ?OBJ :ARG2))) will not be interpreted as a boolean query, and\r\nwill return ((?OBJ . ?OBJ)) instead of ((T . T)). If it is set to nil, then\r\nqueries like (expansion genls ?WHAT) will be interpreted as a boolean query,\r\nand will return NIL instead of the expansion of genls.\ndefparameter\nshould EL variables in EL template args be canonicalized into HL variables\nduring asks? If t, then queries like (expansion genls (implies (isa ?OBJ\n:ARG1) (isa ?OBJ :ARG2))) will not be interpreted as a boolean query, and\nwill return ((?OBJ . ?OBJ)) instead of ((T . T)). If it is set to nil, then\nqueries like (expansion genls ?WHAT) will be interpreted as a boolean query,\nand will return NIL instead of the expansion of genls.")
    public static final SubLSymbol $canonicalize_el_template_vars_during_queriesP$ = makeSymbol("*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*");

    // defparameter
    /**
     * Controls whether, upon failing to find an assertion, a more thorough (and
     * more time-consuming) lookup is performed. You can set this to T or NIL if you
     * want to control its behavior.
     */
    @LispMethod(comment = "Controls whether, upon failing to find an assertion, a more thorough (and\r\nmore time-consuming) lookup is performed. You can set this to T or NIL if you\r\nwant to control its behavior.\ndefparameter\nControls whether, upon failing to find an assertion, a more thorough (and\nmore time-consuming) lookup is performed. You can set this to T or NIL if you\nwant to control its behavior.")
    public static final SubLSymbol $robust_assertion_lookup$ = makeSymbol("*ROBUST-ASSERTION-LOOKUP*");

    // defparameter
    /**
     * Controls whether, upon failing to find a nart, a more thorough (and more
     * time-consuming) lookup is performed. You can set this to T or NIL if you want
     * to control its behavior.
     */
    @LispMethod(comment = "Controls whether, upon failing to find a nart, a more thorough (and more\r\ntime-consuming) lookup is performed. You can set this to T or NIL if you want\r\nto control its behavior.\ndefparameter\nControls whether, upon failing to find a nart, a more thorough (and more\ntime-consuming) lookup is performed. You can set this to T or NIL if you want\nto control its behavior.")
    public static final SubLSymbol $robust_nart_lookup$ = makeSymbol("*ROBUST-NART-LOOKUP*");

    // defparameter
    // Dynamic variable set while recanonicalizing a nat for robust nart lookup.
    /**
     * Dynamic variable set while recanonicalizing a nat for robust nart lookup.
     */
    @LispMethod(comment = "Dynamic variable set while recanonicalizing a nat for robust nart lookup.\ndefparameter")
    public static final SubLSymbol $recanonicalizing_candidate_natP$ = makeSymbol("*RECANONICALIZING-CANDIDATE-NAT?*");

    // defparameter
    /**
     * stores the variable rename mappings formed while standardizing variables
     * during uncanonicalization
     */
    @LispMethod(comment = "stores the variable rename mappings formed while standardizing variables\r\nduring uncanonicalization\ndefparameter\nstores the variable rename mappings formed while standardizing variables\nduring uncanonicalization")
    public static final SubLSymbol $el_var_blist$ = makeSymbol("*EL-VAR-BLIST*");

    // defparameter
    // control var used to collect non-ground reifiable fn terms
    /**
     * control var used to collect non-ground reifiable fn terms
     */
    @LispMethod(comment = "control var used to collect non-ground reifiable fn terms\ndefparameter")
    public static final SubLSymbol $gathering_quantified_fn_termsP$ = makeSymbol("*GATHERING-QUANTIFIED-FN-TERMS?*");

    // defparameter
    // should #$ELRelations be automatically expanded by the precanonicalizer?
    /**
     * should #$ELRelations be automatically expanded by the precanonicalizer?
     */
    @LispMethod(comment = "should #$ELRelations be automatically expanded by the precanonicalizer?\ndefparameter")
    public static final SubLSymbol $expand_el_relationsP$ = makeSymbol("*EXPAND-EL-RELATIONS?*");

    // defparameter
    /**
     * should all sentence args (of literals or denotational functions) be
     * canonicalized into their el version?
     */
    @LispMethod(comment = "should all sentence args (of literals or denotational functions) be\r\ncanonicalized into their el version?\ndefparameter\nshould all sentence args (of literals or denotational functions) be\ncanonicalized into their el version?")
    public static final SubLSymbol $canonicalize_all_sentence_argsP$ = makeSymbol("*CANONICALIZE-ALL-SENTENCE-ARGS?*");

    // defparameter
    /**
     * should tensed literals be canonicalized into their time quantified version?
     */
    @LispMethod(comment = "should tensed literals be canonicalized into their time quantified version?\ndefparameter")
    public static final SubLSymbol $canonicalize_tensed_literalsP$ = makeSymbol("*CANONICALIZE-TENSED-LITERALS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $add_term_of_unit_litsP$ = makeSymbol("*ADD-TERM-OF-UNIT-LITS?*");

    // defparameter
    /**
     * If you set this to NIL, the canonicalizer will be severely crippled. Beware!
     */
    @LispMethod(comment = "If you set this to NIL, the canonicalizer will be severely crippled. Beware!\ndefparameter")
    public static final SubLSymbol $turn_existentials_into_skolemsP$ = makeSymbol("*TURN-EXISTENTIALS-INTO-SKOLEMS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reify_skolemsP$ = makeSymbol("*REIFY-SKOLEMS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $create_narts_regardless_of_whether_within_assertP$ = makeSymbol("*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $disable_create_narts_regardless_of_whether_within_assertP$ = makeSymbol("*DISABLE-CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $canonicalize_functionsP$ = makeSymbol("*CANONICALIZE-FUNCTIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $canonicalize_termsP$ = makeSymbol("*CANONICALIZE-TERMS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $canonicalize_literalsP$ = makeSymbol("*CANONICALIZE-LITERALS?*");

    // defparameter
    /**
     * whether to canonicalize a disjunction over a common predicate as an
     * #$elementOf expression
     */
    @LispMethod(comment = "whether to canonicalize a disjunction over a common predicate as an\r\n#$elementOf expression\ndefparameter\nwhether to canonicalize a disjunction over a common predicate as an\n#$elementOf expression")
    public static final SubLSymbol $canonicalize_disjunction_as_enumerationP$ = makeSymbol("*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $canonicalize_variablesP$ = makeSymbol("*CANONICALIZE-VARIABLES?*");

    // defparameter
    /**
     * whether to eliminate universals which could be removed and still maintain the
     * logical equivalence of the sentence if they are viewed as implicitly
     * encapsulating it.
     */
    @LispMethod(comment = "whether to eliminate universals which could be removed and still maintain the\r\nlogical equivalence of the sentence if they are viewed as implicitly\r\nencapsulating it.\ndefparameter\nwhether to eliminate universals which could be removed and still maintain the\nlogical equivalence of the sentence if they are viewed as implicitly\nencapsulating it.")
    public static final SubLSymbol $implicitify_universalsP$ = makeSymbol("*IMPLICITIFY-UNIVERSALS?*");

    // defparameter
    /**
     * whether the clausifier will assume that free variables are existentially
     * bound, as opposed to the default which is universally bound. This ought to be
     * the mode in which the clausifier is run for queries.
     */
    @LispMethod(comment = "whether the clausifier will assume that free variables are existentially\r\nbound, as opposed to the default which is universally bound. This ought to be\r\nthe mode in which the clausifier is run for queries.\ndefparameter\nwhether the clausifier will assume that free variables are existentially\nbound, as opposed to the default which is universally bound. This ought to be\nthe mode in which the clausifier is run for queries.")
    public static final SubLSymbol $assume_free_vars_are_existentially_boundP$ = makeSymbol("*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*");

    // defparameter
    /**
     * translate variables appearing as logical operators into encapsulated
     * literals?
     */
    @LispMethod(comment = "translate variables appearing as logical operators into encapsulated\r\nliterals?\ndefparameter\ntranslate variables appearing as logical operators into encapsulated\nliterals?")
    public static final SubLSymbol $encapsulate_var_formulaP$ = makeSymbol("*ENCAPSULATE-VAR-FORMULA?*");

    // defparameter
    /**
     * translate intensional (e.g., negated universally quantified) formulas into
     * encapsulated negative literals?
     */
    @LispMethod(comment = "translate intensional (e.g., negated universally quantified) formulas into\r\nencapsulated negative literals?\ndefparameter\ntranslate intensional (e.g., negated universally quantified) formulas into\nencapsulated negative literals?")
    public static final SubLSymbol $encapsulate_intensional_formulaP$ = makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*");

    // defparameter
    /**
     * If an expression fails to quiesce after 10 iterations, give up and deem it
     * ill-formed.
     */
    @LispMethod(comment = "If an expression fails to quiesce after 10 iterations, give up and deem it\r\nill-formed.\ndefparameter\nIf an expression fails to quiesce after 10 iterations, give up and deem it\nill-formed.")
    public static final SubLSymbol $czer_quiescence_iteration_limit$ = makeSymbol("*CZER-QUIESCENCE-ITERATION-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $clause_el_var_names$ = makeSymbol("*CLAUSE-EL-VAR-NAMES*");

    // defparameter
    // dynamic table of uniquifying el var suffixes
    /**
     * dynamic table of uniquifying el var suffixes
     */
    @LispMethod(comment = "dynamic table of uniquifying el var suffixes\ndefparameter")
    public static final SubLSymbol $el_symbol_suffix_table$ = makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*");

    // defparameter
    // is canonicalization occuring within scope of a negation?
    /**
     * is canonicalization occuring within scope of a negation?
     */
    @LispMethod(comment = "is canonicalization occuring within scope of a negation?\ndefparameter")
    public static final SubLSymbol $within_negationP$ = makeSymbol("*WITHIN-NEGATION?*");

    // deflexical
    // preferred order of preds wrt canonicalization
    /**
     * preferred order of preds wrt canonicalization
     */
    @LispMethod(comment = "preferred order of preds wrt canonicalization\ndeflexical")
    public static final SubLSymbol $hl_pred_order$ = makeSymbol("*HL-PRED-ORDER*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $controlP$ = makeSymbol("*CONTROL?*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_1$ = makeSymbol("*CONTROL-1*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_2$ = makeSymbol("*CONTROL-2*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_3$ = makeSymbol("*CONTROL-3*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_4$ = makeSymbol("*CONTROL-4*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_5$ = makeSymbol("*CONTROL-5*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_6$ = makeSymbol("*CONTROL-6*");

    // defparameter
    /**
     * temp: used to control canonicalizer to include (= nil) or exclude (= t)
     * experimental code
     */
    @LispMethod(comment = "temp: used to control canonicalizer to include (= nil) or exclude (= t)\r\nexperimental code\ndefparameter\ntemp: used to control canonicalizer to include (= nil) or exclude (= t)\nexperimental code")
    public static final SubLSymbol $control_ecaP$ = makeSymbol("*CONTROL-ECA?*");

    // defparameter
    // dynamically bound to a memoization state for the canonicalizer
    /**
     * dynamically bound to a memoization state for the canonicalizer
     */
    @LispMethod(comment = "dynamically bound to a memoization state for the canonicalizer\ndefparameter")
    public static final SubLSymbol $czer_memoization_state$ = makeSymbol("*CZER-MEMOIZATION-STATE*");

    // defparameter
    // whether to use czer-fort-types at all.
    /**
     * whether to use czer-fort-types at all.
     */
    @LispMethod(comment = "whether to use czer-fort-types at all.\ndefparameter")
    public static final SubLSymbol $use_czer_fort_typesP$ = makeSymbol("*USE-CZER-FORT-TYPES?*");

    // defparameter
    /**
     * whether to always use czer-fort types. If NIL, they will only be used within
     * the canonicalizer. If *use-czer-fort-types?* is NIL, this variable doesn't
     * matter.
     */
    @LispMethod(comment = "whether to always use czer-fort types. If NIL, they will only be used within\r\nthe canonicalizer. If *use-czer-fort-types?* is NIL, this variable doesn\'t\r\nmatter.\ndefparameter\nwhether to always use czer-fort types. If NIL, they will only be used within\nthe canonicalizer. If *use-czer-fort-types?* is NIL, this variable doesn\'t\nmatter.")
    public static final SubLSymbol $use_czer_fort_types_globallyP$ = makeSymbol("*USE-CZER-FORT-TYPES-GLOBALLY?*");

    // deflexical
    /**
     * The set of predicates which specify #$CanonicalizerDirectives. Not to be
     * confused with the set of all instances of #$CanonicalizerDirectivePredicate,
     * which is much broader.
     */
    @LispMethod(comment = "The set of predicates which specify #$CanonicalizerDirectives. Not to be\r\nconfused with the set of all instances of #$CanonicalizerDirectivePredicate,\r\nwhich is much broader.\ndeflexical\nThe set of predicates which specify #$CanonicalizerDirectives. Not to be\nconfused with the set of all instances of #$CanonicalizerDirectivePredicate,\nwhich is much broader.")
    public static final SubLSymbol $canonicalizer_directive_predicates$ = makeSymbol("*CANONICALIZER-DIRECTIVE-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $assume_hlmt_is_canonicalP$ = makeSymbol("*ASSUME-HLMT-IS-CANONICAL?*");

    // defparameter
    /**
     * Whether the uncanonicalizer should remove uniquifying numerical suffixes on
     * EL variables.
     */
    @LispMethod(comment = "Whether the uncanonicalizer should remove uniquifying numerical suffixes on\r\nEL variables.\ndefparameter\nWhether the uncanonicalizer should remove uniquifying numerical suffixes on\nEL variables.")
    public static final SubLSymbol $ununiquify_el_varsP$ = makeSymbol("*UNUNIQUIFY-EL-VARS?*");

    // defparameter
    /**
     * Whether the uncanonicalizer should insert #$forAlls around unquantified
     * variables.
     */
    @LispMethod(comment = "Whether the uncanonicalizer should insert #$forAlls around unquantified\r\nvariables.\ndefparameter\nWhether the uncanonicalizer should insert #$forAlls around unquantified\nvariables.")
    public static final SubLSymbol $unremove_universalsP$ = makeSymbol("*UNREMOVE-UNIVERSALS?*");

    // defparameter
    /**
     * Whether the uncanonicalizer should rephrase sentences in terms of #$was,
     * #$willBe, etc.
     */
    @LispMethod(comment = "Whether the uncanonicalizer should rephrase sentences in terms of #$was,\r\n#$willBe, etc.\ndefparameter\nWhether the uncanonicalizer should rephrase sentences in terms of #$was,\n#$willBe, etc.")
    public static final SubLSymbol $uncanonicalize_tensed_literalsP$ = makeSymbol("*UNCANONICALIZE-TENSED-LITERALS?*");

    // defparameter
    // is an existing assertion being recanonicalized?
    /**
     * is an existing assertion being recanonicalized?
     */
    @LispMethod(comment = "is an existing assertion being recanonicalized?\ndefparameter")
    public static final SubLSymbol $recanonicalizingP$ = makeSymbol("*RECANONICALIZING?*");

    // defparameter
    // used for recursion detection
    /**
     * used for recursion detection
     */
    @LispMethod(comment = "used for recursion detection\ndefparameter")
    public static final SubLSymbol $recanonicalizing_candidate_assertion_stack$ = makeSymbol("*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*");

    // defparameter
    /**
     * whether el-meta should set the value of @xref *recan-ill-formed-meta-args?*
     */
    @LispMethod(comment = "whether el-meta should set the value of @xref *recan-ill-formed-meta-args?*\ndefparameter")
    public static final SubLSymbol $noting_ill_formed_meta_argsP$ = makeSymbol("*NOTING-ILL-FORMED-META-ARGS?*");

    // defparameter
    /**
     * bound by el-meta when called from the recanonicalizer, so that the
     * recanonicalizer can correctly analyze problems with finding meta assertions
     * (which may be due to uncanonicality).
     */
    @LispMethod(comment = "bound by el-meta when called from the recanonicalizer, so that the\r\nrecanonicalizer can correctly analyze problems with finding meta assertions\r\n(which may be due to uncanonicality).\ndefparameter\nbound by el-meta when called from the recanonicalizer, so that the\nrecanonicalizer can correctly analyze problems with finding meta assertions\n(which may be due to uncanonicality).")
    public static final SubLSymbol $recan_ill_formed_meta_argsP$ = makeSymbol("*RECAN-ILL-FORMED-META-ARGS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $simplify_sentenceP$ = makeSymbol("*SIMPLIFY-SENTENCE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $simplify_literalP$ = makeSymbol("*SIMPLIFY-LITERAL?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $simplify_implicationP$ = makeSymbol("*SIMPLIFY-IMPLICATION?*");

    // defparameter
    // If t, non-wff literals will be reduced to #$False.
    /**
     * If t, non-wff literals will be reduced to #$False.
     */
    @LispMethod(comment = "If t, non-wff literals will be reduced to #$False.\ndefparameter")
    public static final SubLSymbol $simplify_non_wff_literalP$ = makeSymbol("*SIMPLIFY-NON-WFF-LITERAL?*");

    // defparameter
    /**
     * If t, non-wffs will be simplified to see if they become wff. This usually
     * only happens with sequence variables.
     */
    @LispMethod(comment = "If t, non-wffs will be simplified to see if they become wff. This usually\r\nonly happens with sequence variables.\ndefparameter\nIf t, non-wffs will be simplified to see if they become wff. This usually\nonly happens with sequence variables.")
    public static final SubLSymbol $try_to_simplify_non_wff_into_wffP$ = makeSymbol("*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*");

    // defparameter
    /**
     * transient state variable, t iff we're in the middle of trying to simplify a
     * non-wff into a wff
     */
    @LispMethod(comment = "transient state variable, t iff we\'re in the middle of trying to simplify a\r\nnon-wff into a wff\ndefparameter\ntransient state variable, t iff we\'re in the middle of trying to simplify a\nnon-wff into a wff")
    public static final SubLSymbol $trying_to_simplify_non_wff_into_wffP$ = makeSymbol("*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*");

    // defparameter
    /**
     * If nil, simplify-cycl-sentence will only perform syntactic simplifications.
     */
    @LispMethod(comment = "If nil, simplify-cycl-sentence will only perform syntactic simplifications.\ndefparameter")
    public static final SubLSymbol $simplify_using_semanticsP$ = makeSymbol("*SIMPLIFY-USING-SEMANTICS?*");

    // defparameter
    /**
     * If t, simplify-cycl-sentence will look for redundant literals and remove
     * them.
     */
    @LispMethod(comment = "If t, simplify-cycl-sentence will look for redundant literals and remove\r\nthem.\ndefparameter\nIf t, simplify-cycl-sentence will look for redundant literals and remove\nthem.")
    public static final SubLSymbol $simplify_redundanciesP$ = makeSymbol("*SIMPLIFY-REDUNDANCIES?*");

    // defparameter
    /**
     * If t, simplify-transitive-redundancies will look for transitive redundancies
     * and remove them.
     */
    @LispMethod(comment = "If t, simplify-transitive-redundancies will look for transitive redundancies\r\nand remove them.\ndefparameter\nIf t, simplify-transitive-redundancies will look for transitive redundancies\nand remove them.")
    public static final SubLSymbol $simplify_transitive_redundanciesP$ = makeSymbol("*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $simplify_contradictionsP$ = makeSymbol("*SIMPLIFY-CONTRADICTIONS?*");

    // defparameter
    /**
     * If t, simplify-sequence-vars will use arity information from the KB to
     * eliminate sequence variables or convert them to term variables when possible.
     * (It will always use the arity of logical operators to simplify.)
     */
    @LispMethod(comment = "If t, simplify-sequence-vars will use arity information from the KB to\r\neliminate sequence variables or convert them to term variables when possible.\r\n(It will always use the arity of logical operators to simplify.)\ndefparameter\nIf t, simplify-sequence-vars will use arity information from the KB to\neliminate sequence variables or convert them to term variables when possible.\n(It will always use the arity of logical operators to simplify.)")
    public static final SubLSymbol $simplify_sequence_vars_using_kb_arityP$ = makeSymbol("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*");

    // defparameter
    /**
     * The maximum number of term variables that a sequence variable can be split
     * into if we're using the arity information to simplify. If 0 or 1, no
     * splitting will be performed, except that EL relations will always be split,
     * no matter what the split limit is.
     */
    @LispMethod(comment = "The maximum number of term variables that a sequence variable can be split\r\ninto if we\'re using the arity information to simplify. If 0 or 1, no\r\nsplitting will be performed, except that EL relations will always be split,\r\nno matter what the split limit is.\ndefparameter\nThe maximum number of term variables that a sequence variable can be split\ninto if we\'re using the arity information to simplify. If 0 or 1, no\nsplitting will be performed, except that EL relations will always be split,\nno matter what the split limit is.")
    public static final SubLSymbol $sequence_variable_split_limit$ = makeSymbol("*SEQUENCE-VARIABLE-SPLIT-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $simplify_equality_literalsP$ = makeSymbol("*SIMPLIFY-EQUALITY-LITERALS?*");

    // defparameter
    /**
     * If T, the simplifier will be more zealous in simplifying #$trueSentence
     * literals away. WARNING: This may cause inference problems and has not been
     * fully tested.
     */
    @LispMethod(comment = "If T, the simplifier will be more zealous in simplifying #$trueSentence\r\nliterals away. WARNING: This may cause inference problems and has not been\r\nfully tested.\ndefparameter\nIf T, the simplifier will be more zealous in simplifying #$trueSentence\nliterals away. WARNING: This may cause inference problems and has not been\nfully tested.")
    public static final SubLSymbol $simplify_true_sentence_awayP$ = makeSymbol("*SIMPLIFY-TRUE-SENTENCE-AWAY?*");

    // defparameter
    /**
     * in the absence of explicit #$isa pos-lits, use applicable arg-isa constraints
     * to infer the #$resultIsa of a skolem?
     */
    @LispMethod(comment = "in the absence of explicit #$isa pos-lits, use applicable arg-isa constraints\r\nto infer the #$resultIsa of a skolem?\ndefparameter\nin the absence of explicit #$isa pos-lits, use applicable arg-isa constraints\nto infer the #$resultIsa of a skolem?")
    public static final SubLSymbol $infer_skolem_result_isa_via_arg_constraintsP$ = makeSymbol("*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*");

    // defparameter
    // should skolem arg-isa constraints be interpolated into a singleton set?
    /**
     * should skolem arg-isa constraints be interpolated into a singleton set?
     */
    @LispMethod(comment = "should skolem arg-isa constraints be interpolated into a singleton set?\ndefparameter")
    public static final SubLSymbol $interpolate_singleton_arg_isaP$ = makeSymbol("*INTERPOLATE-SINGLETON-ARG-ISA?*");

    // defparameter
    /**
     * should newly-created skolems have #$termDependsOn assertions asserted about
     * them. If NIL, we assume that the caller will assert the definitional
     * assertions of the newly-created skolems. If T, the czer will assert
     * #$termDependsOn assertions in lieu of having actual definitional assertions.
     * This is for use in testing code that calls canonicalize-assert directly.
     */
    @LispMethod(comment = "should newly-created skolems have #$termDependsOn assertions asserted about\r\nthem. If NIL, we assume that the caller will assert the definitional\r\nassertions of the newly-created skolems. If T, the czer will assert\r\n#$termDependsOn assertions in lieu of having actual definitional assertions.\r\nThis is for use in testing code that calls canonicalize-assert directly.\ndefparameter\nshould newly-created skolems have #$termDependsOn assertions asserted about\nthem. If NIL, we assume that the caller will assert the definitional\nassertions of the newly-created skolems. If T, the czer will assert\n#$termDependsOn assertions in lieu of having actual definitional assertions.\nThis is for use in testing code that calls canonicalize-assert directly.")
    public static final SubLSymbol $clothe_naked_skolemsP$ = makeSymbol("*CLOTHE-NAKED-SKOLEMS?*");

    // defparameter
    /**
     * predicates for gafs that reference skolem functions that may be computed and
     * asserted by the canonicalizer and may be manually edited
     */
    @LispMethod(comment = "predicates for gafs that reference skolem functions that may be computed and\r\nasserted by the canonicalizer and may be manually edited\ndefparameter\npredicates for gafs that reference skolem functions that may be computed and\nasserted by the canonicalizer and may be manually edited")
    public static final SubLSymbol $preds_of_computed_skolem_gafs$ = makeSymbol("*PREDS-OF-COMPUTED-SKOLEM-GAFS*");

    // deflexical
    /**
     * predicates for gafs that reference skolem functions that may be computed and
     * asserted by the canonicalizer, or the interface time-stamper, or may be
     * manually edited
     */
    @LispMethod(comment = "predicates for gafs that reference skolem functions that may be computed and\r\nasserted by the canonicalizer, or the interface time-stamper, or may be\r\nmanually edited\ndeflexical\npredicates for gafs that reference skolem functions that may be computed and\nasserted by the canonicalizer, or the interface time-stamper, or may be\nmanually edited")
    public static final SubLSymbol $preds_of_editable_skolem_gafs$ = makeSymbol("*PREDS-OF-EDITABLE-SKOLEM-GAFS*");

    // defparameter
    /**
     * skolems having no defining assertions encountered while reinitializing
     * skolem-axiom-table*
     */
    @LispMethod(comment = "skolems having no defining assertions encountered while reinitializing\r\nskolem-axiom-table*\ndefparameter\nskolems having no defining assertions encountered while reinitializing\nskolem-axiom-table*")
    public static final SubLSymbol $empty_skolems$ = makeSymbol("*EMPTY-SKOLEMS*");

    // defparameter
    /**
     * skolems diagnosed as having problems while reinitializing
     * skolem-axiom-table*
     */
    @LispMethod(comment = "skolems diagnosed as having problems while reinitializing\r\nskolem-axiom-table*\ndefparameter\nskolems diagnosed as having problems while reinitializing\nskolem-axiom-table*")
    public static final SubLSymbol $mal_skolems$ = makeSymbol("*MAL-SKOLEMS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_rule_macroP$ = makeSymbol("*EXPRESS-AS-RULE-MACRO?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_genlsP$ = makeSymbol("*EXPRESS-AS-GENLS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_arg_isaP$ = makeSymbol("*EXPRESS-AS-ARG-ISA?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_arg_genlP$ = makeSymbol("*EXPRESS-AS-ARG-GENL?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_genl_predicatesP$ = makeSymbol("*EXPRESS-AS-GENL-PREDICATES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_genl_inverseP$ = makeSymbol("*EXPRESS-AS-GENL-INVERSE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_inter_arg_isaP$ = makeSymbol("*EXPRESS-AS-INTER-ARG-ISA?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_disjoint_withP$ = makeSymbol("*EXPRESS-AS-DISJOINT-WITH?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_negation_predicatesP$ = makeSymbol("*EXPRESS-AS-NEGATION-PREDICATES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_negation_inverseP$ = makeSymbol("*EXPRESS-AS-NEGATION-INVERSE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_reflexiveP$ = makeSymbol("*EXPRESS-AS-REFLEXIVE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_symmetricP$ = makeSymbol("*EXPRESS-AS-SYMMETRIC?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_transitiveP$ = makeSymbol("*EXPRESS-AS-TRANSITIVE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_irreflexiveP$ = makeSymbol("*EXPRESS-AS-IRREFLEXIVE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_asymmetricP$ = makeSymbol("*EXPRESS-AS-ASYMMETRIC?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_relation_typeP$ = makeSymbol("*EXPRESS-AS-RELATION-TYPE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $express_as_required_arg_predP$ = makeSymbol("*EXPRESS-AS-REQUIRED-ARG-PRED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $tense_czer_mode$ = makeSymbol("*TENSE-CZER-MODE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_tense_czer_modes$ = makeSymbol("*VALID-TENSE-CZER-MODES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("requiredArg1Pred"), reader_make_constant_shell("requiredArg2Pred"));

    static private final SubLList $list1 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);

    private static final SubLSymbol NART_HL_FORMULA = makeSymbol("NART-HL-FORMULA");

    private static final SubLSymbol RF_FORMULA = makeSymbol("RF-FORMULA");

    static private final SubLList $list5 = list(reader_make_constant_shell("implies"));

    static private final SubLList $list6 = list(new SubLObject[]{ reader_make_constant_shell("not"), reader_make_constant_shell("or"), reader_make_constant_shell("xor"), reader_make_constant_shell("and"), reader_make_constant_shell("equiv"), reader_make_constant_shell("implies"), reader_make_constant_shell("exceptFor"), reader_make_constant_shell("exceptWhen"), reader_make_constant_shell("forAll"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("thereExistExactly"), reader_make_constant_shell("thereExistAtLeast"), reader_make_constant_shell("thereExistAtMost") });

    static private final SubLList $list7 = list(reader_make_constant_shell("SkolemFunctionFn"), reader_make_constant_shell("SkolemFuncNFn"));

    static private final SubLList $list8 = list(reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg6Isa"), reader_make_constant_shell("argsIsa"));

    static private final SubLList $list9 = list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("argAndRestIsa"));

    static private final SubLList $list10 = list(reader_make_constant_shell("arg1NotIsa"), reader_make_constant_shell("arg2NotIsa"), reader_make_constant_shell("arg3NotIsa"), reader_make_constant_shell("arg4NotIsa"), reader_make_constant_shell("arg5NotIsa"), reader_make_constant_shell("arg6NotIsa"), reader_make_constant_shell("argsNotIsa"));

    static private final SubLList $list11 = list(reader_make_constant_shell("argNotIsa"));

    static private final SubLList $list12 = list(reader_make_constant_shell("arg1QuotedIsa"), reader_make_constant_shell("arg2QuotedIsa"), reader_make_constant_shell("arg3QuotedIsa"), reader_make_constant_shell("arg4QuotedIsa"), reader_make_constant_shell("arg5QuotedIsa"), reader_make_constant_shell("arg6QuotedIsa"), reader_make_constant_shell("argsQuotedIsa"));

    static private final SubLList $list13 = list(reader_make_constant_shell("argQuotedIsa"), reader_make_constant_shell("argAndRestQuotedIsa"));

    static private final SubLList $list14 = list(reader_make_constant_shell("arg1Genl"), reader_make_constant_shell("arg2Genl"), reader_make_constant_shell("argsGenl"), reader_make_constant_shell("arg3Genl"), reader_make_constant_shell("arg4Genl"), reader_make_constant_shell("arg5Genl"), reader_make_constant_shell("arg6Genl"));

    static private final SubLList $list15 = list(reader_make_constant_shell("argGenl"), reader_make_constant_shell("argAndRestGenl"));

    private static final SubLList $list16 = list(reader_make_constant_shell("arg1Format"), reader_make_constant_shell("arg2Format"), reader_make_constant_shell("arg3Format"), reader_make_constant_shell("arg4Format"), reader_make_constant_shell("arg5Format"), reader_make_constant_shell("arg6Format"));

    private static final SubLList $list17 = list(reader_make_constant_shell("argFormat"));





    public static final SubLSymbol $fi_last_assertions_asserted$ = makeSymbol("*FI-LAST-ASSERTIONS-ASSERTED*");

    private static final SubLSymbol $sym21$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLList $list25 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list26 = list(reader_make_constant_shell("canonicalizerDirectiveForArg"), reader_make_constant_shell("canonicalizerDirectiveForAllArgs"), reader_make_constant_shell("canonicalizerDirectiveForArgAndRest"));

    public static final SubLSymbol $skolem_axiom_table$ = makeSymbol("*SKOLEM-AXIOM-TABLE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    static private final SubLList $list29 = list(new SubLObject[]{ reader_make_constant_shell("isa"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"), reader_make_constant_shell("arityMax"), reader_make_constant_shell("resultIsa"), reader_make_constant_shell("resultGenl"), reader_make_constant_shell("resultIsaArg"), reader_make_constant_shell("resultGenlArg"), reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg6Isa") });

    private static final SubLList $list30 = list(new SubLObject[]{ reader_make_constant_shell("isa"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"), reader_make_constant_shell("arityMax"), reader_make_constant_shell("resultIsa"), reader_make_constant_shell("resultGenl"), reader_make_constant_shell("resultIsaArg"), reader_make_constant_shell("resultGenlArg"), reader_make_constant_shell("resultQuotedIsa"), reader_make_constant_shell("evaluationResultQuotedIsa") });

    private static final SubLList $list31 = list(reader_make_constant_shell("myCreator"), reader_make_constant_shell("myCreationTime"), reader_make_constant_shell("myCreationSecond"), reader_make_constant_shell("comment"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("skolemizeForward"));

    private static final SubLList $list32 = list(makeKeyword("DEFAULT"), makeKeyword("QUERY"), makeKeyword("ASSERT"));

    private static final SubLString $str35$Canonicalizer_tense_mode_not_set_ = makeString("Canonicalizer tense mode not set.");

    public static final SubLObject valid_tense_czer_mode_p_alt(SubLObject mode) {
        return list_utilities.member_eqP(mode, $valid_tense_czer_modes$.getGlobalValue());
    }

    public static SubLObject valid_tense_czer_mode_p(final SubLObject mode) {
        return list_utilities.member_eqP(mode, $valid_tense_czer_modes$.getGlobalValue());
    }

    public static final SubLObject get_tense_czer_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($tense_czer_mode$.getDynamicValue(thread) == $DEFAULT) {
                if (NIL != $within_assert$.getDynamicValue(thread)) {
                    return $ASSERT;
                } else {
                    if (NIL != $within_ask$.getDynamicValue(thread)) {
                        return $QUERY;
                    } else {
                        Errors.warn($str_alt32$Canonicalizer_tense_mode_not_set_);
                        return $DEFAULT;
                    }
                }
            } else {
                return $tense_czer_mode$.getDynamicValue(thread);
            }
        }
    }

    public static SubLObject get_tense_czer_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($tense_czer_mode$.getDynamicValue(thread) != $DEFAULT) {
            return $tense_czer_mode$.getDynamicValue(thread);
        }
        if (NIL != $within_assert$.getDynamicValue(thread)) {
            return $ASSERT;
        }
        if (NIL != $within_ask$.getDynamicValue(thread)) {
            return $QUERY;
        }
        Errors.warn($str35$Canonicalizer_tense_mode_not_set_);
        return $DEFAULT;
    }

    public static final SubLObject within_assert_tense_czer_modeP_alt() {
        return eq(com.cyc.cycjava.cycl.czer_vars.get_tense_czer_mode(), $ASSERT);
    }

    public static SubLObject within_assert_tense_czer_modeP() {
        return eq(get_tense_czer_mode(), $ASSERT);
    }

    public static final SubLObject within_query_tense_czer_modeP_alt() {
        return eq(com.cyc.cycjava.cycl.czer_vars.get_tense_czer_mode(), $QUERY);
    }

    public static SubLObject within_query_tense_czer_modeP() {
        return eq(get_tense_czer_mode(), $QUERY);
    }

    public static SubLObject declare_czer_vars_file() {
        declareFunction("valid_tense_czer_mode_p", "VALID-TENSE-CZER-MODE-P", 1, 0, false);
        declareFunction("get_tense_czer_mode", "GET-TENSE-CZER-MODE", 0, 0, false);
        declareFunction("within_assert_tense_czer_modeP", "WITHIN-ASSERT-TENSE-CZER-MODE?", 0, 0, false);
        declareFunction("within_query_tense_czer_modeP", "WITHIN-QUERY-TENSE-CZER-MODE?", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_czer_vars_file_alt() {
        defparameter("*REQUIRED-ARG-PREDS*", $list_alt0);
        deflexical("*ARG-POSITIONS*", $list_alt1);
        defparameter("*ACCUMULATING-SEMANTIC-VIOLATIONS?*", NIL);
        defparameter("*SEMANTIC-VIOLATIONS*", NIL);
        defparameter("*ASSERTION-KEY*", ASSERTION_FORMULA);
        defparameter("*NART-KEY*", NART_HL_FORMULA);
        defparameter("*RF-KEY*", RF_FORMULA);
        deflexical("*IMPLICATION-OPERATORS*", $list_alt5);
        deflexical("*LOGICAL-OPERATORS*", $list_alt6);
        deflexical("*SKOLEM-FUNCTION-FUNCTIONS*", $list_alt7);
        deflexical("*ARG-ISA-BINARY-PREDS*", $list_alt8);
        deflexical("*ARG-ISA-TERNARY-PREDS*", $list_alt9);
        deflexical("*ARG-QUOTED-ISA-BINARY-PREDS*", $list_alt10);
        deflexical("*ARG-QUOTED-ISA-TERNARY-PREDS*", $list_alt11);
        deflexical("*ARG-GENL-BINARY-PREDS*", $list_alt12);
        deflexical("*ARG-GENL-TERNARY-PREDS*", $list_alt13);
        deflexical("*ARG-FORMAT-BINARY-PREDS*", $list_alt14);
        deflexical("*ARG-FORMAT-TERNARY-PREDS*", $list_alt15);
        deflexical("*META-ARG-TYPE*", $$CycLAssertion);
        deflexical("*POSSIBLY-META-ARG-TYPE*", $$CycLIndexedTerm);
        defparameter("*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*", NIL);
        defparameter("*EL-SUPPORTS-DOT-SYNTAX?*", T);
        deflexical("*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*", T);
        defparameter("*EL-SUPPORTS-CONTRACTIONS?*", NIL);
        defvar("*INSIDE-QUOTE*", NIL);
        defparameter("*NEW-CANONICALIZER?*", NIL);
        defparameter("*WITHIN-CANONICALIZER?*", NIL);
        defparameter("*FORM-OF-CLAUSAL-FORM*", NIL);
        defparameter("*MUST-ENFORCE-SEMANTICS?*", NIL);
        defparameter("*EL-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*CANON-VERBOSE?*", NIL);
        defparameter("*VAR?*", $sym18$EL_VAR_);
        defparameter("*SUBORDINATE-FI-OPS?*", NIL);
        defparameter("*CRY?*", T);
        defparameter("*MINIMAL-SKOLEM-ARITY?*", NIL);
        defparameter("*SKOLEMIZE-DURING-ASKS?*", NIL);
        defparameter("*DROP-ALL-EXISTENTIALS?*", NIL);
        defparameter("*LEAVE-SKOLEM-CONSTANTS-ALONE?*", NIL);
        defparameter("*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*", $ASSERT_ONLY);
        defparameter("*USE-SKOLEM-CONSTANTS?*", NIL);
        defparameter("*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*", T);
        defparameter("*CANON-VAR-FUNCTION*", $DEFAULT);
        defparameter("*CANONICAL-VARIABLE-TYPE*", $KB_VAR);
        defparameter("*STANDARDIZE-VARIABLES-MEMORY*", NIL);
        defparameter("*DISTRIBUTING-META-KNOWLEDGE?*", NIL);
        defparameter("*DISTRIBUTE-META-OVER-COMMON-EL?*", T);
        defparameter("*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*", T);
        defparameter("*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*", T);
        defparameter("*ROBUST-ASSERTION-LOOKUP*", $DEFAULT);
        defparameter("*ROBUST-NART-LOOKUP*", $DEFAULT);
        defparameter("*RECANONICALIZING-CANDIDATE-NAT?*", NIL);
        defparameter("*EL-VAR-BLIST*", NIL);
        defparameter("*GATHERING-QUANTIFIED-FN-TERMS?*", NIL);
        defparameter("*EXPAND-EL-RELATIONS?*", T);
        defparameter("*CANONICALIZE-ALL-SENTENCE-ARGS?*", NIL);
        defparameter("*CANONICALIZE-TENSED-LITERALS?*", T);
        defparameter("*ADD-TERM-OF-UNIT-LITS?*", T);
        defparameter("*TURN-EXISTENTIALS-INTO-SKOLEMS?*", T);
        defparameter("*REIFY-SKOLEMS?*", T);
        defparameter("*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL);
        defparameter("*CANONICALIZE-FUNCTIONS?*", T);
        defparameter("*CANONICALIZE-TERMS?*", T);
        defparameter("*CANONICALIZE-LITERALS?*", T);
        defparameter("*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*", NIL);
        defparameter("*CANONICALIZE-VARIABLES?*", T);
        defparameter("*IMPLICITIFY-UNIVERSALS?*", T);
        defparameter("*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*", NIL);
        defparameter("*ENCAPSULATE-VAR-FORMULA?*", T);
        defparameter("*ENCAPSULATE-INTENSIONAL-FORMULA?*", T);
        defparameter("*CZER-QUIESCENCE-ITERATION-LIMIT*", TEN_INTEGER);
        defparameter("*CLAUSE-EL-VAR-NAMES*", NIL);
        defparameter("*EL-SYMBOL-SUFFIX-TABLE*", NIL);
        defparameter("*WITHIN-NEGATION?*", NIL);
        deflexical("*HL-PRED-ORDER*", $list_alt22);
        defparameter("*CONTROL?*", NIL);
        defparameter("*CONTROL-1*", NIL);
        defparameter("*CONTROL-2*", NIL);
        defparameter("*CONTROL-3*", NIL);
        defparameter("*CONTROL-4*", NIL);
        defparameter("*CONTROL-5*", NIL);
        defparameter("*CONTROL-6*", NIL);
        defparameter("*CONTROL-ECA?*", NIL);
        defparameter("*CZER-MEMOIZATION-STATE*", NIL);
        defparameter("*USE-CZER-FORT-TYPES?*", T);
        defparameter("*USE-CZER-FORT-TYPES-GLOBALLY?*", T);
        deflexical("*CANONICALIZER-DIRECTIVE-PREDICATES*", $list_alt23);
        defparameter("*UNUNIQUIFY-EL-VARS?*", NIL);
        defparameter("*UNREMOVE-UNIVERSALS?*", T);
        defparameter("*UNCANONICALIZE-TENSED-LITERALS?*", T);
        defparameter("*RECANONICALIZING?*", NIL);
        defparameter("*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*", NIL);
        defparameter("*NOTING-ILL-FORMED-META-ARGS?*", NIL);
        defparameter("*RECAN-ILL-FORMED-META-ARGS?*", NIL);
        defparameter("*SIMPLIFY-SENTENCE?*", T);
        defparameter("*SIMPLIFY-LITERAL?*", T);
        defparameter("*SIMPLIFY-IMPLICATION?*", T);
        defparameter("*SIMPLIFY-NON-WFF-LITERAL?*", T);
        defparameter("*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", T);
        defparameter("*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", NIL);
        defparameter("*SIMPLIFY-USING-SEMANTICS?*", T);
        defparameter("*SIMPLIFY-REDUNDANCIES?*", NIL);
        defparameter("*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*", NIL);
        defparameter("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", T);
        defparameter("*SEQUENCE-VARIABLE-SPLIT-LIMIT*", FIVE_INTEGER);
        defparameter("*SIMPLIFY-EQUAL-SYMBOLS-LITERAL?*", NIL);
        defparameter("*SIMPLIFY-TRUE-SENTENCE-AWAY?*", NIL);
        deflexical("*SKOLEM-AXIOM-TABLE*", NIL != boundp($skolem_axiom_table$) ? ((SubLObject) ($skolem_axiom_table$.getGlobalValue())) : make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED));
        defparameter("*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*", T);
        defparameter("*INTERPOLATE-SINGLETON-ARG-ISA?*", NIL);
        defparameter("*CLOTHE-NAKED-SKOLEMS?*", NIL);
        defparameter("*PREDS-OF-COMPUTED-SKOLEM-GAFS*", $list_alt26);
        deflexical("*PREDS-OF-EDITABLE-SKOLEM-GAFS*", append(new SubLObject[]{ $list_alt27, $arg_isa_binary_preds$.getGlobalValue(), $arg_isa_ternary_preds$.getGlobalValue(), $arg_quoted_isa_binary_preds$.getGlobalValue(), $arg_quoted_isa_ternary_preds$.getGlobalValue(), $list_alt28 }));
        defparameter("*EMPTY-SKOLEMS*", NIL);
        defparameter("*MAL-SKOLEMS*", NIL);
        defparameter("*EXPRESS-AS-RULE-MACRO?*", NIL);
        defparameter("*EXPRESS-AS-GENLS?*", NIL);
        defparameter("*EXPRESS-AS-ARG-ISA?*", NIL);
        defparameter("*EXPRESS-AS-ARG-GENL?*", NIL);
        defparameter("*EXPRESS-AS-GENL-PREDICATES?*", NIL);
        defparameter("*EXPRESS-AS-GENL-INVERSE?*", NIL);
        defparameter("*EXPRESS-AS-INTER-ARG-ISA?*", NIL);
        defparameter("*EXPRESS-AS-DISJOINT-WITH?*", NIL);
        defparameter("*EXPRESS-AS-NEGATION-PREDICATES?*", NIL);
        defparameter("*EXPRESS-AS-NEGATION-INVERSE?*", NIL);
        defparameter("*EXPRESS-AS-REFLEXIVE?*", NIL);
        defparameter("*EXPRESS-AS-SYMMETRIC?*", NIL);
        defparameter("*EXPRESS-AS-TRANSITIVE?*", NIL);
        defparameter("*EXPRESS-AS-IRREFLEXIVE?*", NIL);
        defparameter("*EXPRESS-AS-ASYMMETRIC?*", NIL);
        defparameter("*EXPRESS-AS-RELATION-TYPE?*", NIL);
        defparameter("*EXPRESS-AS-REQUIRED-ARG-PRED?*", NIL);
        defparameter("*TENSE-CZER-MODE*", $DEFAULT);
        deflexical("*VALID-TENSE-CZER-MODES*", $list_alt29);
        return NIL;
    }

    public static SubLObject init_czer_vars_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*REQUIRED-ARG-PREDS*", $list0);
            deflexical("*ARG-POSITIONS*", $list1);
            defparameter("*ACCUMULATING-SEMANTIC-VIOLATIONS?*", NIL);
            defparameter("*SEMANTIC-VIOLATIONS*", NIL);
            defparameter("*ASSERTION-KEY*", ASSERTION_FORMULA);
            defparameter("*NART-KEY*", NART_HL_FORMULA);
            defparameter("*RF-KEY*", RF_FORMULA);
            deflexical("*IMPLICATION-OPERATORS*", $list5);
            deflexical("*LOGICAL-OPERATORS*", $list6);
            deflexical("*SKOLEM-FUNCTION-FUNCTIONS*", $list7);
            deflexical("*ARG-ISA-BINARY-PREDS*", $list8);
            deflexical("*ARG-ISA-TERNARY-PREDS*", $list9);
            deflexical("*ARG-NOT-ISA-BINARY-PREDS*", $list10);
            deflexical("*ARG-NOT-ISA-TERNARY-PREDS*", $list11);
            deflexical("*ARG-QUOTED-ISA-BINARY-PREDS*", $list12);
            deflexical("*ARG-QUOTED-ISA-TERNARY-PREDS*", $list13);
            deflexical("*ARG-GENL-BINARY-PREDS*", $list14);
            deflexical("*ARG-GENL-TERNARY-PREDS*", $list15);
            deflexical("*ARG-FORMAT-BINARY-PREDS*", $list16);
            deflexical("*ARG-FORMAT-TERNARY-PREDS*", $list17);
            deflexical("*META-ARG-TYPE*", $$CycLAssertion);
            deflexical("*POSSIBLY-META-ARG-TYPE*", $$CycLIndexedTerm);
            defparameter("*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*", NIL);
            defparameter("*EL-SUPPORTS-DOT-SYNTAX?*", T);
            deflexical("*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*", T);
            defparameter("*EL-SUPPORTS-CONTRACTIONS?*", NIL);
            defvar("*INSIDE-QUOTE*", NIL);
            defparameter("*FI-LAST-ASSERTIONS-ASSERTED*", NIL);
            defparameter("*NEW-CANONICALIZER?*", NIL);
            defparameter("*WITHIN-CANONICALIZER?*", NIL);
            defparameter("*FORM-OF-CLAUSAL-FORM*", NIL);
            defparameter("*MUST-ENFORCE-SEMANTICS?*", NIL);
            defparameter("*EL-TRACE-LEVEL*", ZERO_INTEGER);
            defparameter("*CANON-VERBOSE?*", NIL);
            defparameter("*VAR?*", $sym21$EL_VAR_);
            defparameter("*SUBORDINATE-FI-OPS?*", NIL);
            defparameter("*CRY?*", T);
            defparameter("*MINIMAL-SKOLEM-ARITY?*", NIL);
            defparameter("*SKOLEMIZE-DURING-ASKS?*", NIL);
            defparameter("*DROP-ALL-EXISTENTIALS?*", NIL);
            defparameter("*LEAVE-SKOLEM-CONSTANTS-ALONE?*", NIL);
            defparameter("*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*", $ASSERT_ONLY);
            defparameter("*USE-SKOLEM-CONSTANTS?*", NIL);
            defparameter("*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*", T);
            defparameter("*CANON-VAR-FUNCTION*", $DEFAULT);
            defparameter("*CANONICAL-VARIABLE-TYPE*", $KB_VAR);
            defparameter("*STANDARDIZE-VARIABLES-MEMORY*", NIL);
            defparameter("*DISTRIBUTING-META-KNOWLEDGE?*", NIL);
            defparameter("*DISTRIBUTE-META-OVER-COMMON-EL?*", T);
            defparameter("*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*", T);
            defparameter("*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*", T);
            defparameter("*ROBUST-ASSERTION-LOOKUP*", NIL);
            defparameter("*ROBUST-NART-LOOKUP*", $DEFAULT);
            defparameter("*RECANONICALIZING-CANDIDATE-NAT?*", NIL);
            defparameter("*EL-VAR-BLIST*", NIL);
            defparameter("*GATHERING-QUANTIFIED-FN-TERMS?*", NIL);
            defparameter("*EXPAND-EL-RELATIONS?*", T);
            defparameter("*CANONICALIZE-ALL-SENTENCE-ARGS?*", NIL);
            defparameter("*CANONICALIZE-TENSED-LITERALS?*", T);
            defparameter("*ADD-TERM-OF-UNIT-LITS?*", T);
            defparameter("*TURN-EXISTENTIALS-INTO-SKOLEMS?*", T);
            defparameter("*REIFY-SKOLEMS?*", T);
            defparameter("*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL);
            defparameter("*DISABLE-CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL);
            defparameter("*CANONICALIZE-FUNCTIONS?*", T);
            defparameter("*CANONICALIZE-TERMS?*", T);
            defparameter("*CANONICALIZE-LITERALS?*", T);
            defparameter("*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*", NIL);
            defparameter("*CANONICALIZE-VARIABLES?*", T);
            defparameter("*IMPLICITIFY-UNIVERSALS?*", T);
            defparameter("*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*", NIL);
            defparameter("*ENCAPSULATE-VAR-FORMULA?*", T);
            defparameter("*ENCAPSULATE-INTENSIONAL-FORMULA?*", T);
            defparameter("*CZER-QUIESCENCE-ITERATION-LIMIT*", TEN_INTEGER);
            defparameter("*CLAUSE-EL-VAR-NAMES*", NIL);
            defparameter("*EL-SYMBOL-SUFFIX-TABLE*", NIL);
            defparameter("*WITHIN-NEGATION?*", NIL);
            deflexical("*HL-PRED-ORDER*", $list25);
            defparameter("*CONTROL?*", NIL);
            defparameter("*CONTROL-1*", NIL);
            defparameter("*CONTROL-2*", NIL);
            defparameter("*CONTROL-3*", NIL);
            defparameter("*CONTROL-4*", NIL);
            defparameter("*CONTROL-5*", NIL);
            defparameter("*CONTROL-6*", NIL);
            defparameter("*CONTROL-ECA?*", NIL);
            defparameter("*CZER-MEMOIZATION-STATE*", NIL);
            defparameter("*USE-CZER-FORT-TYPES?*", T);
            defparameter("*USE-CZER-FORT-TYPES-GLOBALLY?*", T);
            deflexical("*CANONICALIZER-DIRECTIVE-PREDICATES*", $list26);
            defparameter("*ASSUME-HLMT-IS-CANONICAL?*", NIL);
            defparameter("*UNUNIQUIFY-EL-VARS?*", NIL);
            defparameter("*UNREMOVE-UNIVERSALS?*", T);
            defparameter("*UNCANONICALIZE-TENSED-LITERALS?*", T);
            defparameter("*RECANONICALIZING?*", NIL);
            defparameter("*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*", NIL);
            defparameter("*NOTING-ILL-FORMED-META-ARGS?*", NIL);
            defparameter("*RECAN-ILL-FORMED-META-ARGS?*", NIL);
            defparameter("*SIMPLIFY-SENTENCE?*", T);
            defparameter("*SIMPLIFY-LITERAL?*", T);
            defparameter("*SIMPLIFY-IMPLICATION?*", T);
            defparameter("*SIMPLIFY-NON-WFF-LITERAL?*", T);
            defparameter("*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", T);
            defparameter("*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", NIL);
            defparameter("*SIMPLIFY-USING-SEMANTICS?*", T);
            defparameter("*SIMPLIFY-REDUNDANCIES?*", NIL);
            defparameter("*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*", NIL);
            defparameter("*SIMPLIFY-CONTRADICTIONS?*", NIL);
            defparameter("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", T);
            defparameter("*SEQUENCE-VARIABLE-SPLIT-LIMIT*", FIVE_INTEGER);
            defparameter("*SIMPLIFY-EQUALITY-LITERALS?*", NIL);
            defparameter("*SIMPLIFY-TRUE-SENTENCE-AWAY?*", NIL);
            deflexical("*SKOLEM-AXIOM-TABLE*", SubLTrampolineFile.maybeDefault($skolem_axiom_table$, $skolem_axiom_table$, () -> make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED)));
            defparameter("*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*", T);
            defparameter("*INTERPOLATE-SINGLETON-ARG-ISA?*", NIL);
            defparameter("*CLOTHE-NAKED-SKOLEMS?*", NIL);
            defparameter("*PREDS-OF-COMPUTED-SKOLEM-GAFS*", $list29);
            deflexical("*PREDS-OF-EDITABLE-SKOLEM-GAFS*", append(new SubLObject[]{ $list30, $arg_isa_binary_preds$.getGlobalValue(), $arg_isa_ternary_preds$.getGlobalValue(), $arg_quoted_isa_binary_preds$.getGlobalValue(), $arg_quoted_isa_ternary_preds$.getGlobalValue(), $list31 }));
            defparameter("*EMPTY-SKOLEMS*", NIL);
            defparameter("*MAL-SKOLEMS*", NIL);
            defparameter("*EXPRESS-AS-RULE-MACRO?*", NIL);
            defparameter("*EXPRESS-AS-GENLS?*", NIL);
            defparameter("*EXPRESS-AS-ARG-ISA?*", NIL);
            defparameter("*EXPRESS-AS-ARG-GENL?*", NIL);
            defparameter("*EXPRESS-AS-GENL-PREDICATES?*", NIL);
            defparameter("*EXPRESS-AS-GENL-INVERSE?*", NIL);
            defparameter("*EXPRESS-AS-INTER-ARG-ISA?*", NIL);
            defparameter("*EXPRESS-AS-DISJOINT-WITH?*", NIL);
            defparameter("*EXPRESS-AS-NEGATION-PREDICATES?*", NIL);
            defparameter("*EXPRESS-AS-NEGATION-INVERSE?*", NIL);
            defparameter("*EXPRESS-AS-REFLEXIVE?*", NIL);
            defparameter("*EXPRESS-AS-SYMMETRIC?*", NIL);
            defparameter("*EXPRESS-AS-TRANSITIVE?*", NIL);
            defparameter("*EXPRESS-AS-IRREFLEXIVE?*", NIL);
            defparameter("*EXPRESS-AS-ASYMMETRIC?*", NIL);
            defparameter("*EXPRESS-AS-RELATION-TYPE?*", NIL);
            defparameter("*EXPRESS-AS-REQUIRED-ARG-PRED?*", NIL);
            defparameter("*TENSE-CZER-MODE*", $DEFAULT);
            deflexical("*VALID-TENSE-CZER-MODES*", $list32);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ARG-QUOTED-ISA-BINARY-PREDS*", $list_alt10);
            deflexical("*ARG-QUOTED-ISA-TERNARY-PREDS*", $list_alt11);
            deflexical("*ARG-GENL-BINARY-PREDS*", $list_alt12);
            deflexical("*ARG-GENL-TERNARY-PREDS*", $list_alt13);
            deflexical("*ARG-FORMAT-BINARY-PREDS*", $list_alt14);
            deflexical("*ARG-FORMAT-TERNARY-PREDS*", $list_alt15);
            defparameter("*VAR?*", $sym18$EL_VAR_);
            defparameter("*ROBUST-ASSERTION-LOOKUP*", $DEFAULT);
            deflexical("*HL-PRED-ORDER*", $list_alt22);
            deflexical("*CANONICALIZER-DIRECTIVE-PREDICATES*", $list_alt23);
            defparameter("*SIMPLIFY-EQUAL-SYMBOLS-LITERAL?*", NIL);
            deflexical("*SKOLEM-AXIOM-TABLE*", NIL != boundp($skolem_axiom_table$) ? ((SubLObject) ($skolem_axiom_table$.getGlobalValue())) : make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED));
            defparameter("*PREDS-OF-COMPUTED-SKOLEM-GAFS*", $list_alt26);
            deflexical("*PREDS-OF-EDITABLE-SKOLEM-GAFS*", append(new SubLObject[]{ $list_alt27, $arg_isa_binary_preds$.getGlobalValue(), $arg_isa_ternary_preds$.getGlobalValue(), $arg_quoted_isa_binary_preds$.getGlobalValue(), $arg_quoted_isa_ternary_preds$.getGlobalValue(), $list_alt28 }));
            deflexical("*VALID-TENSE-CZER-MODES*", $list_alt29);
        }
        return NIL;
    }

    public static SubLObject init_czer_vars_file_Previous() {
        defparameter("*REQUIRED-ARG-PREDS*", $list0);
        deflexical("*ARG-POSITIONS*", $list1);
        defparameter("*ACCUMULATING-SEMANTIC-VIOLATIONS?*", NIL);
        defparameter("*SEMANTIC-VIOLATIONS*", NIL);
        defparameter("*ASSERTION-KEY*", ASSERTION_FORMULA);
        defparameter("*NART-KEY*", NART_HL_FORMULA);
        defparameter("*RF-KEY*", RF_FORMULA);
        deflexical("*IMPLICATION-OPERATORS*", $list5);
        deflexical("*LOGICAL-OPERATORS*", $list6);
        deflexical("*SKOLEM-FUNCTION-FUNCTIONS*", $list7);
        deflexical("*ARG-ISA-BINARY-PREDS*", $list8);
        deflexical("*ARG-ISA-TERNARY-PREDS*", $list9);
        deflexical("*ARG-NOT-ISA-BINARY-PREDS*", $list10);
        deflexical("*ARG-NOT-ISA-TERNARY-PREDS*", $list11);
        deflexical("*ARG-QUOTED-ISA-BINARY-PREDS*", $list12);
        deflexical("*ARG-QUOTED-ISA-TERNARY-PREDS*", $list13);
        deflexical("*ARG-GENL-BINARY-PREDS*", $list14);
        deflexical("*ARG-GENL-TERNARY-PREDS*", $list15);
        deflexical("*ARG-FORMAT-BINARY-PREDS*", $list16);
        deflexical("*ARG-FORMAT-TERNARY-PREDS*", $list17);
        deflexical("*META-ARG-TYPE*", $$CycLAssertion);
        deflexical("*POSSIBLY-META-ARG-TYPE*", $$CycLIndexedTerm);
        defparameter("*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*", NIL);
        defparameter("*EL-SUPPORTS-DOT-SYNTAX?*", T);
        deflexical("*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*", T);
        defparameter("*EL-SUPPORTS-CONTRACTIONS?*", NIL);
        defvar("*INSIDE-QUOTE*", NIL);
        defparameter("*FI-LAST-ASSERTIONS-ASSERTED*", NIL);
        defparameter("*NEW-CANONICALIZER?*", NIL);
        defparameter("*WITHIN-CANONICALIZER?*", NIL);
        defparameter("*FORM-OF-CLAUSAL-FORM*", NIL);
        defparameter("*MUST-ENFORCE-SEMANTICS?*", NIL);
        defparameter("*EL-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*CANON-VERBOSE?*", NIL);
        defparameter("*VAR?*", $sym21$EL_VAR_);
        defparameter("*SUBORDINATE-FI-OPS?*", NIL);
        defparameter("*CRY?*", T);
        defparameter("*MINIMAL-SKOLEM-ARITY?*", NIL);
        defparameter("*SKOLEMIZE-DURING-ASKS?*", NIL);
        defparameter("*DROP-ALL-EXISTENTIALS?*", NIL);
        defparameter("*LEAVE-SKOLEM-CONSTANTS-ALONE?*", NIL);
        defparameter("*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*", $ASSERT_ONLY);
        defparameter("*USE-SKOLEM-CONSTANTS?*", NIL);
        defparameter("*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*", T);
        defparameter("*CANON-VAR-FUNCTION*", $DEFAULT);
        defparameter("*CANONICAL-VARIABLE-TYPE*", $KB_VAR);
        defparameter("*STANDARDIZE-VARIABLES-MEMORY*", NIL);
        defparameter("*DISTRIBUTING-META-KNOWLEDGE?*", NIL);
        defparameter("*DISTRIBUTE-META-OVER-COMMON-EL?*", T);
        defparameter("*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*", T);
        defparameter("*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*", T);
        defparameter("*ROBUST-ASSERTION-LOOKUP*", NIL);
        defparameter("*ROBUST-NART-LOOKUP*", $DEFAULT);
        defparameter("*RECANONICALIZING-CANDIDATE-NAT?*", NIL);
        defparameter("*EL-VAR-BLIST*", NIL);
        defparameter("*GATHERING-QUANTIFIED-FN-TERMS?*", NIL);
        defparameter("*EXPAND-EL-RELATIONS?*", T);
        defparameter("*CANONICALIZE-ALL-SENTENCE-ARGS?*", NIL);
        defparameter("*CANONICALIZE-TENSED-LITERALS?*", T);
        defparameter("*ADD-TERM-OF-UNIT-LITS?*", T);
        defparameter("*TURN-EXISTENTIALS-INTO-SKOLEMS?*", T);
        defparameter("*REIFY-SKOLEMS?*", T);
        defparameter("*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL);
        defparameter("*DISABLE-CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL);
        defparameter("*CANONICALIZE-FUNCTIONS?*", T);
        defparameter("*CANONICALIZE-TERMS?*", T);
        defparameter("*CANONICALIZE-LITERALS?*", T);
        defparameter("*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*", NIL);
        defparameter("*CANONICALIZE-VARIABLES?*", T);
        defparameter("*IMPLICITIFY-UNIVERSALS?*", T);
        defparameter("*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*", NIL);
        defparameter("*ENCAPSULATE-VAR-FORMULA?*", T);
        defparameter("*ENCAPSULATE-INTENSIONAL-FORMULA?*", T);
        defparameter("*CZER-QUIESCENCE-ITERATION-LIMIT*", TEN_INTEGER);
        defparameter("*CLAUSE-EL-VAR-NAMES*", NIL);
        defparameter("*EL-SYMBOL-SUFFIX-TABLE*", NIL);
        defparameter("*WITHIN-NEGATION?*", NIL);
        deflexical("*HL-PRED-ORDER*", $list25);
        defparameter("*CONTROL?*", NIL);
        defparameter("*CONTROL-1*", NIL);
        defparameter("*CONTROL-2*", NIL);
        defparameter("*CONTROL-3*", NIL);
        defparameter("*CONTROL-4*", NIL);
        defparameter("*CONTROL-5*", NIL);
        defparameter("*CONTROL-6*", NIL);
        defparameter("*CONTROL-ECA?*", NIL);
        defparameter("*CZER-MEMOIZATION-STATE*", NIL);
        defparameter("*USE-CZER-FORT-TYPES?*", T);
        defparameter("*USE-CZER-FORT-TYPES-GLOBALLY?*", T);
        deflexical("*CANONICALIZER-DIRECTIVE-PREDICATES*", $list26);
        defparameter("*ASSUME-HLMT-IS-CANONICAL?*", NIL);
        defparameter("*UNUNIQUIFY-EL-VARS?*", NIL);
        defparameter("*UNREMOVE-UNIVERSALS?*", T);
        defparameter("*UNCANONICALIZE-TENSED-LITERALS?*", T);
        defparameter("*RECANONICALIZING?*", NIL);
        defparameter("*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*", NIL);
        defparameter("*NOTING-ILL-FORMED-META-ARGS?*", NIL);
        defparameter("*RECAN-ILL-FORMED-META-ARGS?*", NIL);
        defparameter("*SIMPLIFY-SENTENCE?*", T);
        defparameter("*SIMPLIFY-LITERAL?*", T);
        defparameter("*SIMPLIFY-IMPLICATION?*", T);
        defparameter("*SIMPLIFY-NON-WFF-LITERAL?*", T);
        defparameter("*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", T);
        defparameter("*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", NIL);
        defparameter("*SIMPLIFY-USING-SEMANTICS?*", T);
        defparameter("*SIMPLIFY-REDUNDANCIES?*", NIL);
        defparameter("*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*", NIL);
        defparameter("*SIMPLIFY-CONTRADICTIONS?*", NIL);
        defparameter("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", T);
        defparameter("*SEQUENCE-VARIABLE-SPLIT-LIMIT*", FIVE_INTEGER);
        defparameter("*SIMPLIFY-EQUALITY-LITERALS?*", NIL);
        defparameter("*SIMPLIFY-TRUE-SENTENCE-AWAY?*", NIL);
        deflexical("*SKOLEM-AXIOM-TABLE*", SubLTrampolineFile.maybeDefault($skolem_axiom_table$, $skolem_axiom_table$, () -> make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*", T);
        defparameter("*INTERPOLATE-SINGLETON-ARG-ISA?*", NIL);
        defparameter("*CLOTHE-NAKED-SKOLEMS?*", NIL);
        defparameter("*PREDS-OF-COMPUTED-SKOLEM-GAFS*", $list29);
        deflexical("*PREDS-OF-EDITABLE-SKOLEM-GAFS*", append(new SubLObject[]{ $list30, $arg_isa_binary_preds$.getGlobalValue(), $arg_isa_ternary_preds$.getGlobalValue(), $arg_quoted_isa_binary_preds$.getGlobalValue(), $arg_quoted_isa_ternary_preds$.getGlobalValue(), $list31 }));
        defparameter("*EMPTY-SKOLEMS*", NIL);
        defparameter("*MAL-SKOLEMS*", NIL);
        defparameter("*EXPRESS-AS-RULE-MACRO?*", NIL);
        defparameter("*EXPRESS-AS-GENLS?*", NIL);
        defparameter("*EXPRESS-AS-ARG-ISA?*", NIL);
        defparameter("*EXPRESS-AS-ARG-GENL?*", NIL);
        defparameter("*EXPRESS-AS-GENL-PREDICATES?*", NIL);
        defparameter("*EXPRESS-AS-GENL-INVERSE?*", NIL);
        defparameter("*EXPRESS-AS-INTER-ARG-ISA?*", NIL);
        defparameter("*EXPRESS-AS-DISJOINT-WITH?*", NIL);
        defparameter("*EXPRESS-AS-NEGATION-PREDICATES?*", NIL);
        defparameter("*EXPRESS-AS-NEGATION-INVERSE?*", NIL);
        defparameter("*EXPRESS-AS-REFLEXIVE?*", NIL);
        defparameter("*EXPRESS-AS-SYMMETRIC?*", NIL);
        defparameter("*EXPRESS-AS-TRANSITIVE?*", NIL);
        defparameter("*EXPRESS-AS-IRREFLEXIVE?*", NIL);
        defparameter("*EXPRESS-AS-ASYMMETRIC?*", NIL);
        defparameter("*EXPRESS-AS-RELATION-TYPE?*", NIL);
        defparameter("*EXPRESS-AS-REQUIRED-ARG-PRED?*", NIL);
        defparameter("*TENSE-CZER-MODE*", $DEFAULT);
        deflexical("*VALID-TENSE-CZER-MODES*", $list32);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("requiredArg1Pred"), reader_make_constant_shell("requiredArg2Pred"));

    static private final SubLList $list_alt1 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);

    static private final SubLList $list_alt5 = list(reader_make_constant_shell("implies"));

    static private final SubLList $list_alt6 = list(new SubLObject[]{ reader_make_constant_shell("not"), reader_make_constant_shell("or"), reader_make_constant_shell("xor"), reader_make_constant_shell("and"), reader_make_constant_shell("equiv"), reader_make_constant_shell("implies"), reader_make_constant_shell("exceptFor"), reader_make_constant_shell("exceptWhen"), reader_make_constant_shell("forAll"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("thereExistExactly"), reader_make_constant_shell("thereExistAtLeast"), reader_make_constant_shell("thereExistAtMost") });

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("SkolemFunctionFn"), reader_make_constant_shell("SkolemFuncNFn"));

    static private final SubLList $list_alt8 = list(reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg6Isa"), reader_make_constant_shell("argsIsa"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("argAndRestIsa"));

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("arg1QuotedIsa"), reader_make_constant_shell("arg2QuotedIsa"), reader_make_constant_shell("arg3QuotedIsa"), reader_make_constant_shell("arg4QuotedIsa"), reader_make_constant_shell("arg5QuotedIsa"), reader_make_constant_shell("arg6QuotedIsa"), reader_make_constant_shell("argsQuotedIsa"));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("argQuotedIsa"), reader_make_constant_shell("argAndRestQuotedIsa"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("arg1Genl"), reader_make_constant_shell("arg2Genl"), reader_make_constant_shell("argsGenl"), reader_make_constant_shell("arg3Genl"), reader_make_constant_shell("arg4Genl"), reader_make_constant_shell("arg5Genl"), reader_make_constant_shell("arg6Genl"));

    static private final SubLList $list_alt13 = list(reader_make_constant_shell("argGenl"), reader_make_constant_shell("argAndRestGenl"));

    static private final SubLList $list_alt14 = list(reader_make_constant_shell("arg1Format"), reader_make_constant_shell("arg2Format"), reader_make_constant_shell("arg3Format"), reader_make_constant_shell("arg4Format"), reader_make_constant_shell("arg5Format"), reader_make_constant_shell("arg6Format"));

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("argFormat"));

    static private final SubLSymbol $sym18$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLList $list_alt22 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list_alt23 = list(reader_make_constant_shell("canonicalizerDirectiveForArg"), reader_make_constant_shell("canonicalizerDirectiveForAllArgs"), reader_make_constant_shell("canonicalizerDirectiveForArgAndRest"));

    static private final SubLList $list_alt26 = list(new SubLObject[]{ reader_make_constant_shell("isa"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"), reader_make_constant_shell("arityMax"), reader_make_constant_shell("resultIsa"), reader_make_constant_shell("resultGenl"), reader_make_constant_shell("resultIsaArg"), reader_make_constant_shell("resultGenlArg"), reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg6Isa") });

    static private final SubLList $list_alt27 = list(new SubLObject[]{ reader_make_constant_shell("isa"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"), reader_make_constant_shell("arityMax"), reader_make_constant_shell("resultIsa"), reader_make_constant_shell("resultGenl"), reader_make_constant_shell("resultIsaArg"), reader_make_constant_shell("resultGenlArg"), reader_make_constant_shell("resultQuotedIsa"), reader_make_constant_shell("evaluationResultQuotedIsa") });

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("myCreator"), reader_make_constant_shell("myCreationTime"), reader_make_constant_shell("myCreationSecond"), reader_make_constant_shell("comment"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("skolemizeForward"));

    public static SubLObject setup_czer_vars_file() {
        register_html_state_variable($fi_last_assertions_asserted$);
        final SubLObject item_var = $fi_last_assertions_asserted$;
        if (NIL == member(item_var, $fi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $fi_state_variables$.setGlobalValue(cons(item_var, $fi_state_variables$.getGlobalValue()));
        }
        declare_defglobal($skolem_axiom_table$);
        return NIL;
    }

    static private final SubLList $list_alt29 = list(makeKeyword("DEFAULT"), makeKeyword("QUERY"), makeKeyword("ASSERT"));

    static private final SubLString $str_alt32$Canonicalizer_tense_mode_not_set_ = makeString("Canonicalizer tense mode not set.");

    @Override
    public void declareFunctions() {
        declare_czer_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_vars_file();
    }

    
}

/**
 * Total time: 171 ms
 */
