/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-MODULE-DECLARATIONS
 * source file: /cyc/top/cycl/sbhl/sbhl-module-declarations.lisp
 * created:     2019/07/03 17:37:27
 */
public final class sbhl_module_declarations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_module_declarations();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations";








    private static final SubLSymbol $NAUT_FORWARD_TRUE_GENERATORS = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");

    static private final SubLList $list5 = list(makeSymbol("SBHL-RESULT-GENL"), makeSymbol("RESULT-GENL-ARGS"), makeSymbol("RESULT-INTER-ARG-GENL"), makeSymbol("RESULT-INTER-ARG-GENL-RELN"), makeSymbol("RESULT-GENL-VIA-ARG-ARG-GENL"));



    private static final SubLSymbol $kw12$PATH_TERMINATING_MARK__FN = makeKeyword("PATH-TERMINATING-MARK?-FN");

    private static final SubLSymbol SBHL_MARKED_P = makeSymbol("SBHL-MARKED-P");

    private static final SubLSymbol SET_SBHL_MARKING_STATE_TO_MARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-MARKED");

    private static final SubLSymbol SET_SBHL_MARKING_STATE_TO_UNMARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-UNMARKED");





    private static final SubLSymbol $TRANSFERS_THROUGH_MODULE = makeKeyword("TRANSFERS-THROUGH-MODULE");

    private static final SubLSymbol $TRANSFERS_VIA_ARG = makeKeyword("TRANSFERS-VIA-ARG");



    static private final SubLList $list26 = list(makeSymbol("SBHL-RESULT-ISA"), makeSymbol("RESULT-ISA-ARGS"), makeSymbol("RESULT-INTER-ARG-ISA"), makeSymbol("RESULT-INTER-ARG-ISA-RELN"), makeSymbol("RESULT-ISA-VIA-ARG-ARG-ISA"), makeSymbol("RESULT-ISA-ARG-ISAS"), makeSymbol("RESULT-ISA-WHEN-ARG-ISA"), makeSymbol("RESULT-ISA-VIA-CLOSED-UNDER"));



    static private final SubLList $list29 = list(makeSymbol("SBHL-EVALUATION-RESULT-QUOTED-ISA"), makeSymbol("SBHL-RESULT-QUOTED-ISA"));



    static private final SubLList $list31 = list(makeSymbol("SBHL-NAUT-FORWARD-GENL-MTS"));









    private static final SubLSymbol $MODULE_INVERTS_ARGUMENTS = makeKeyword("MODULE-INVERTS-ARGUMENTS");



    private static final SubLSymbol SBHL_PREDICATE_PATH_TERMINATION_P = makeSymbol("SBHL-PREDICATE-PATH-TERMINATION-P");

    private static final SubLSymbol SBHL_PREDICATE_MARKING_FN = makeSymbol("SBHL-PREDICATE-MARKING-FN");

    private static final SubLSymbol SBHL_PREDICATE_UNMARKING_FN = makeSymbol("SBHL-PREDICATE-UNMARKING-FN");

    private static final SubLSymbol $PREDICATE_SEARCH_P = makeKeyword("PREDICATE-SEARCH-P");

    private static final SubLSymbol $ADD_NODE_TO_RESULT_TEST = makeKeyword("ADD-NODE-TO-RESULT-TEST");

    private static final SubLSymbol NOT_GENL_INVERSE_MODE_P = makeSymbol("NOT-GENL-INVERSE-MODE-P");

    private static final SubLSymbol $ACCESSIBLE_LINK_PREDS = makeKeyword("ACCESSIBLE-LINK-PREDS");

    private static final SubLList $list47 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"));

    private static final SubLSymbol $SIMPLE_NON_REFLEXIVE = makeKeyword("SIMPLE-NON-REFLEXIVE");

    private static final SubLSymbol $INVERTS_ARGUMENTS_OF_MODULE = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");



    private static final SubLSymbol GENL_INVERSE_MODE_P = makeSymbol("GENL-INVERSE-MODE-P");

    static private final SubLList $list52 = list(reader_make_constant_shell("genlInverse"), reader_make_constant_shell("genlPreds"));

    static private final SubLList $list53 = list(reader_make_constant_shell("negationPreds"), reader_make_constant_shell("negationInverse"));

    private static final SubLList $list54 = list(reader_make_constant_shell("negationInverse"), reader_make_constant_shell("negationPreds"));



    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell("weak-HL-TimePrecedence");

    private static final SubLSymbol SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P = makeSymbol("SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_ZERO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ZERO");

    private static final SubLSymbol SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P = makeSymbol("SBHL-NODE-VALID-FOR-TEMPORAL-SEARCH-RESULT-P");

    private static final SubLList $list64 = list(reader_make_constant_shell("successorStrict-HL-TimePrecedence"), reader_make_constant_shell("strict-HL-TimePrecedence"), reader_make_constant_shell("weak-HL-TimePrecedence"), reader_make_constant_shell("weakSuccessor-HL-TimePrecedence"));

    private static final SubLObject $$weakSuccessor_HL_TimePrecedence = reader_make_constant_shell("weakSuccessor-HL-TimePrecedence");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE");

    private static final SubLObject $$strict_HL_TimePrecedence = reader_make_constant_shell("strict-HL-TimePrecedence");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ONE");

    private static final SubLObject $$successorStrict_HL_TimePrecedence = reader_make_constant_shell("successorStrict-HL-TimePrecedence");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_TWO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-TWO");

    private static final SubLSymbol $sbhl_modules_initializedP$ = makeSymbol("*SBHL-MODULES-INITIALIZED?*");

    private static final SubLList $list77 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));

    private static final SubLString $str78$sbhl_module__A__graph__A__tt_modu = makeString("sbhl-module ~A: graph=~A  tt-module=~A~%");

    private static final SubLString $$$missing = makeString("missing");

    // Definitions
    public static final SubLObject initialize_genls_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$genls, list(new SubLObject[]{ list($LINK_PRED, $$genls), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list_alt5), list($MODULE_TYPE, $SIMPLE_REFLEXIVE), list($TYPE_TEST, COLLECTION_P), list($DISJOINS_MODULE, $$disjointWith), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($ROOT, $$Thing), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    // Definitions
    public static SubLObject initialize_genls_module() {
        sbhl_module_utilities.init_sbhl_module_data($$genls, list(new SubLObject[]{ list($LINK_PRED, $$genls), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list5), list($MODULE_TYPE, $SIMPLE_REFLEXIVE), list($TYPE_TEST, COLLECTION_P), list($DISJOINS_MODULE, $$disjointWith), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($ROOT, $$Thing), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_disjoint_with_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$disjointWith, list(new SubLObject[]{ list($LINK_PRED, $$disjointWith), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, COLLECTION_P), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genls), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_disjoint_with_module() {
        sbhl_module_utilities.init_sbhl_module_data($$disjointWith, list(new SubLObject[]{ list($LINK_PRED, $$disjointWith), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, COLLECTION_P), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genls), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_isa_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$isa, list(new SubLObject[]{ list($LINK_PRED, $$isa), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list_alt26), list($MODULE_TYPE, $TRANSFERS_THROUGH), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genls), list($TRANSFERS_VIA_ARG, TWO_INTEGER) }));
        sbhl_link_methods.initialize_isa_arg2_naut_table();
        return NIL;
    }

    public static SubLObject initialize_isa_module() {
        sbhl_module_utilities.init_sbhl_module_data($$isa, list(new SubLObject[]{ list($LINK_PRED, $$isa), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list26), list($MODULE_TYPE, $TRANSFERS_THROUGH), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genls), list($TRANSFERS_VIA_ARG, TWO_INTEGER) }));
        sbhl_link_methods.initialize_isa_arg2_naut_table();
        return NIL;
    }

    public static final SubLObject initialize_quoted_isa_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$quotedIsa, list(new SubLObject[]{ list($LINK_PRED, $$quotedIsa), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list_alt29), list($MODULE_TYPE, $TRANSFERS_THROUGH), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genls), list($TRANSFERS_VIA_ARG, TWO_INTEGER) }));
        sbhl_link_methods.initialize_quoted_isa_arg2_naut_table();
        return NIL;
    }

    public static SubLObject initialize_quoted_isa_module() {
        sbhl_module_utilities.init_sbhl_module_data($$quotedIsa, list(new SubLObject[]{ list($LINK_PRED, $$quotedIsa), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list29), list($MODULE_TYPE, $TRANSFERS_THROUGH), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genls), list($TRANSFERS_VIA_ARG, TWO_INTEGER) }));
        sbhl_link_methods.initialize_quoted_isa_arg2_naut_table();
        return NIL;
    }

    public static final SubLObject initialize_genl_mt_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$genlMt, list(new SubLObject[]{ list($LINK_PRED, $$genlMt), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list_alt31), list($MODULE_TYPE, $SIMPLE_REFLEXIVE), list($TYPE_TEST, MICROTHEORY_P), list($DISJOINS_MODULE, $$negationMt), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($ROOT, mt_vars.$mt_root$.getGlobalValue()), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_genl_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data($$genlMt, list(new SubLObject[]{ list($LINK_PRED, $$genlMt), list($LINK_STYLE, $$DirectedMultigraph), list($NAUT_FORWARD_TRUE_GENERATORS, $list31), list($MODULE_TYPE, $SIMPLE_REFLEXIVE), list($TYPE_TEST, MICROTHEORY_P), list($DISJOINS_MODULE, $$intensionallyIncompatibleMt), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($ROOT, mt_vars.$mt_root$.getGlobalValue()), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_negation_mt_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$negationMt, list(new SubLObject[]{ list($LINK_PRED, $$negationMt), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, MICROTHEORY_P), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlMt), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_negation_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data($$negationMt, list(new SubLObject[]{ list($LINK_PRED, $$negationMt), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, MICROTHEORY_P), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlMt), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_genl_preds_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$genlPreds, list(new SubLObject[]{ list($LINK_PRED, $$genlPreds), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $SIMPLE_REFLEXIVE), list($TYPE_TEST, PREDICATE_P), list($DISJOINS_MODULE, $$negationPreds), list($MODULE_INVERTS_ARGUMENTS, $$genlInverse), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, NOT_GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list_alt46), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_genl_preds_module() {
        sbhl_module_utilities.init_sbhl_module_data($$genlPreds, list(new SubLObject[]{ list($LINK_PRED, $$genlPreds), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $SIMPLE_REFLEXIVE), list($TYPE_TEST, PREDICATE_P), list($DISJOINS_MODULE, $$negationPreds), list($MODULE_INVERTS_ARGUMENTS, $$genlInverse), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, NOT_GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list47), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_genl_inverse_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$genlInverse, list(new SubLObject[]{ list($LINK_PRED, $$genlInverse), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $SIMPLE_NON_REFLEXIVE), list($TYPE_TEST, PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, $$genlPreds), list($DISJOINS_MODULE, $$negationInverse), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list_alt51), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_genl_inverse_module() {
        sbhl_module_utilities.init_sbhl_module_data($$genlInverse, list(new SubLObject[]{ list($LINK_PRED, $$genlInverse), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $SIMPLE_NON_REFLEXIVE), list($TYPE_TEST, PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, $$genlPreds), list($DISJOINS_MODULE, $$negationInverse), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list52), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_negation_preds_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$negationPreds, list(new SubLObject[]{ list($LINK_PRED, $$negationPreds), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, PREDICATE_P), list($MODULE_INVERTS_ARGUMENTS, $$negationInverse), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, NOT_GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list_alt52), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlPreds), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_negation_preds_module() {
        sbhl_module_utilities.init_sbhl_module_data($$negationPreds, list(new SubLObject[]{ list($LINK_PRED, $$negationPreds), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, PREDICATE_P), list($MODULE_INVERTS_ARGUMENTS, $$negationInverse), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, NOT_GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list53), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlPreds), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_negation_inverse_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$negationInverse, list(new SubLObject[]{ list($LINK_PRED, $$negationInverse), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, $$negationPreds), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list_alt53), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlPreds), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_negation_inverse_module() {
        sbhl_module_utilities.init_sbhl_module_data($$negationInverse, list(new SubLObject[]{ list($LINK_PRED, $$negationInverse), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, $$negationPreds), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_PREDICATE_PATH_TERMINATION_P), list($MARKING_FN, SBHL_PREDICATE_MARKING_FN), list($UNMARKING_FN, SBHL_PREDICATE_UNMARKING_FN), list($PREDICATE_SEARCH_P, T), list($ADD_NODE_TO_RESULT_TEST, GENL_INVERSE_MODE_P), list($ACCESSIBLE_LINK_PREDS, $list54), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlPreds), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_incompatible_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data($$incompatibleMt, list(new SubLObject[]{ list($LINK_PRED, $$incompatibleMt), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, MICROTHEORY_P), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlMt), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_intensionally_incompatible_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data($$intensionallyIncompatibleMt, list(new SubLObject[]{ list($LINK_PRED, $$intensionallyIncompatibleMt), list($LINK_STYLE, $$Multigraph), list($MODULE_TYPE, $DISJOINS), list($TYPE_TEST, MICROTHEORY_P), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_MARKED_P), list($MARKING_FN, SET_SBHL_MARKING_STATE_TO_MARKED), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($INDEX_ARG, ONE_INTEGER), list($TRANSFERS_THROUGH_MODULE, $$genlMt), list($TRANSFERS_VIA_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_weak_precedence_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$weak_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$weak_HL_TimePrecedence), list($MODULE_TAG, $WEAK), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_ZERO), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, ZERO_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list_alt62), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_weak_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data($$weak_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$weak_HL_TimePrecedence), list($MODULE_TAG, $WEAK), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_ZERO), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, ZERO_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list64), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_weak_successor_precedence_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$weakSuccessor_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$weakSuccessor_HL_TimePrecedence), list($MODULE_TAG, $WEAK_SUCCESSOR), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, MINUS_ONE_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list_alt62), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_weak_successor_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data($$weakSuccessor_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$weakSuccessor_HL_TimePrecedence), list($MODULE_TAG, $WEAK_SUCCESSOR), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, MINUS_ONE_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list64), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_strict_precedence_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$strict_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$strict_HL_TimePrecedence), list($MODULE_TAG, $STRICT), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_ONE), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, ONE_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list_alt62), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_strict_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data($$strict_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$strict_HL_TimePrecedence), list($MODULE_TAG, $STRICT), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_ONE), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, ONE_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list64), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject initialize_successor_strict_precedence_module_alt() {
        sbhl_module_utilities.init_sbhl_module_data($$successorStrict_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$successorStrict_HL_TimePrecedence), list($MODULE_TAG, $SUCCESSOR_STRICT), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_TWO), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, TWO_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list_alt62), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static SubLObject initialize_successor_strict_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data($$successorStrict_HL_TimePrecedence, list(new SubLObject[]{ list($LINK_PRED, $$successorStrict_HL_TimePrecedence), list($MODULE_TAG, $SUCCESSOR_STRICT), list($LINK_STYLE, $$DirectedMultigraph), list($MODULE_TYPE, $TIME), list($kw12$PATH_TERMINATING_MARK__FN, SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), list($MARKING_FN, INCREMENT_SBHL_MARKING_STATE_BY_TWO), list($UNMARKING_FN, SET_SBHL_MARKING_STATE_TO_UNMARKED), list($MARKING_INCREMENT, TWO_INTEGER), list($ADD_NODE_TO_RESULT_TEST, SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), list($ACCESSIBLE_LINK_PREDS, $list64), list($INDEX_ARG, ONE_INTEGER) }));
        return NIL;
    }

    public static final SubLObject sbhl_modules_initializedP_alt() {
        return $sbhl_modules_initializedP$.getGlobalValue();
    }

    public static SubLObject sbhl_modules_initializedP() {
        return $sbhl_modules_initializedP$.getGlobalValue();
    }

    public static final SubLObject note_sbhl_modules_initialized_alt() {
        $sbhl_modules_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static SubLObject note_sbhl_modules_initialized() {
        $sbhl_modules_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static final SubLObject initialize_sbhl_modules_alt(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        if ((NIL != forceP) || (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.sbhl_modules_initializedP())) {
            sbhl_module_vars.reset_sbhl_modules();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_genls_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_disjoint_with_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_isa_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_quoted_isa_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_genl_mt_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_negation_mt_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_genl_preds_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_genl_inverse_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_negation_preds_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_negation_inverse_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_weak_precedence_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_weak_successor_precedence_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_strict_precedence_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_successor_strict_precedence_module();
            com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.note_sbhl_modules_initialized();
        }
        return NIL;
    }

    public static SubLObject initialize_sbhl_modules(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        if ((NIL != forceP) || (NIL == sbhl_modules_initializedP())) {
            sbhl_module_vars.reset_sbhl_modules();
            initialize_genls_module();
            initialize_disjoint_with_module();
            initialize_isa_module();
            initialize_quoted_isa_module();
            initialize_genl_mt_module();
            initialize_intensionally_incompatible_mt_module();
            initialize_incompatible_mt_module();
            initialize_genl_preds_module();
            initialize_genl_inverse_module();
            initialize_negation_preds_module();
            initialize_negation_inverse_module();
            initialize_weak_precedence_module();
            initialize_weak_successor_precedence_module();
            initialize_strict_precedence_module();
            initialize_successor_strict_precedence_module();
            note_sbhl_modules_initialized();
        } else {
            sbhl_module_vars.check_sbhl_modules_store_for_legacy_format();
        }
        return NIL;
    }

    static private final SubLList $list_alt5 = list(makeSymbol("SBHL-RESULT-GENL"), makeSymbol("RESULT-GENL-ARGS"), makeSymbol("RESULT-INTER-ARG-GENL"), makeSymbol("RESULT-INTER-ARG-GENL-RELN"), makeSymbol("RESULT-GENL-VIA-ARG-ARG-GENL"));

    /**
     * This function must be called to get sbhl working on images that have world that thing sbhl modules are still dictionaries.  This funtion should get the useful parts of the legacy structures then init the nre structures.
     */
    @LispMethod(comment = "This function must be called to get sbhl working on images that have world that thing sbhl modules are still dictionaries.  This funtion should get the useful parts of the legacy structures then init the nre structures.")
    public static final SubLObject convert_legacy_sbhl_modules_to_structs_alt(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        {
            SubLObject sbhl_graph_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = sbhl_module_utilities.get_sbhl_predicates();
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    {
                        SubLObject legacy_module = sbhl_module_vars.get_sbhl_module(pred);
                        if (NIL != dictionary.dictionary_p(legacy_module)) {
                            dictionary.dictionary_enter(sbhl_graph_dictionary, pred, dictionary.dictionary_lookup(legacy_module, $SBHL_GRAPH, UNPROVIDED));
                        }
                    }
                }
            }
            if ((NIL == dictionary.dictionary_empty_p(sbhl_graph_dictionary)) || (NIL != forceP)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations.initialize_sbhl_modules(T);
                {
                    SubLObject cdolist_list_var = dictionary.dictionary_keys(sbhl_graph_dictionary);
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        {
                            SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                            SubLObject v_graph = dictionary.dictionary_lookup(sbhl_graph_dictionary, pred, UNPROVIDED);
                            if ((NIL != sbhl_module_vars.sbhl_module_p(module)) && (NIL == dictionary.dictionary_p(module))) {
                                sbhl_module_vars.set_sbhl_module_property(module, $GRAPH, v_graph);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * This function must be called to get sbhl working on images that have world that thing sbhl modules are still dictionaries.  This funtion should get the useful parts of the legacy structures then init the nre structures.
     */
    @LispMethod(comment = "This function must be called to get sbhl working on images that have world that thing sbhl modules are still dictionaries.  This funtion should get the useful parts of the legacy structures then init the nre structures.")
    public static SubLObject convert_legacy_sbhl_modules_to_structs(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        final SubLObject sbhl_graph_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = sbhl_module_utilities.get_sbhl_predicates();
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject legacy_module = sbhl_module_vars.get_sbhl_module(pred);
            if (NIL != dictionary.dictionary_p(legacy_module)) {
                dictionary.dictionary_enter(sbhl_graph_dictionary, pred, dictionary.dictionary_lookup(legacy_module, $SBHL_GRAPH, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        if ((NIL == dictionary.dictionary_empty_p(sbhl_graph_dictionary)) || (NIL != forceP)) {
            initialize_sbhl_modules(T);
            cdolist_list_var = dictionary.dictionary_keys(sbhl_graph_dictionary);
            pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                final SubLObject v_graph = dictionary.dictionary_lookup(sbhl_graph_dictionary, pred, UNPROVIDED);
                if ((NIL != sbhl_module_vars.sbhl_module_p(module)) && (NIL == dictionary.dictionary_p(module))) {
                    sbhl_module_vars.set_sbhl_module_property(module, $GRAPH, v_graph);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    static private final SubLList $list_alt26 = list(makeSymbol("SBHL-RESULT-ISA"), makeSymbol("RESULT-ISA-ARGS"), makeSymbol("RESULT-INTER-ARG-ISA"), makeSymbol("RESULT-INTER-ARG-ISA-RELN"), makeSymbol("RESULT-ISA-VIA-ARG-ARG-ISA"), makeSymbol("RESULT-ISA-ARG-ISAS"), makeSymbol("RESULT-ISA-VIA-CLOSED-UNDER"));

    static private final SubLList $list_alt29 = list(makeSymbol("SBHL-EVALUATION-RESULT-QUOTED-ISA"), makeSymbol("SBHL-RESULT-QUOTED-ISA"));

    static private final SubLList $list_alt31 = list(makeSymbol("SBHL-NAUT-FORWARD-GENL-MTS"));

    public static final SubLObject verify_sbhl_modules_alt(SubLObject auto_correctP) {
        if (auto_correctP == UNPROVIDED) {
            auto_correctP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt75$sbhl_module__A__graph__A__tt_modu, new SubLObject[]{ sbhl_module_utilities.get_sbhl_link_pred(module), sbhl_module_vars.get_sbhl_module_graph(module).isHashtable() ? ((SubLObject) (hash_table_count(sbhl_module_vars.get_sbhl_module_graph(module)))) : $$$missing, sbhl_module_utilities.get_sbhl_transfers_through_module(module) });
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    public static SubLObject verify_sbhl_modules(SubLObject auto_correctP) {
        if (auto_correctP == UNPROVIDED) {
            auto_correctP = NIL;
        }
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list77);
            key = current.first();
            current = module = current.rest();
            format(T, $str78$sbhl_module__A__graph__A__tt_modu, new SubLObject[]{ sbhl_module_utilities.get_sbhl_link_pred(module), sbhl_module_vars.get_sbhl_module_graph(module).isHashtable() ? hash_table_count(sbhl_module_vars.get_sbhl_module_graph(module)) : $$$missing, sbhl_module_utilities.get_sbhl_transfers_through_module(module) });
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt46 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"));

    public static SubLObject declare_sbhl_module_declarations_file() {
        declareFunction("initialize_genls_module", "INITIALIZE-GENLS-MODULE", 0, 0, false);
        declareFunction("initialize_disjoint_with_module", "INITIALIZE-DISJOINT-WITH-MODULE", 0, 0, false);
        declareFunction("initialize_isa_module", "INITIALIZE-ISA-MODULE", 0, 0, false);
        declareFunction("initialize_quoted_isa_module", "INITIALIZE-QUOTED-ISA-MODULE", 0, 0, false);
        declareFunction("initialize_genl_mt_module", "INITIALIZE-GENL-MT-MODULE", 0, 0, false);
        declareFunction("initialize_negation_mt_module", "INITIALIZE-NEGATION-MT-MODULE", 0, 0, false);
        declareFunction("initialize_genl_preds_module", "INITIALIZE-GENL-PREDS-MODULE", 0, 0, false);
        declareFunction("initialize_genl_inverse_module", "INITIALIZE-GENL-INVERSE-MODULE", 0, 0, false);
        declareFunction("initialize_negation_preds_module", "INITIALIZE-NEGATION-PREDS-MODULE", 0, 0, false);
        declareFunction("initialize_negation_inverse_module", "INITIALIZE-NEGATION-INVERSE-MODULE", 0, 0, false);
        declareFunction("initialize_incompatible_mt_module", "INITIALIZE-INCOMPATIBLE-MT-MODULE", 0, 0, false);
        declareFunction("initialize_intensionally_incompatible_mt_module", "INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE", 0, 0, false);
        declareFunction("initialize_weak_precedence_module", "INITIALIZE-WEAK-PRECEDENCE-MODULE", 0, 0, false);
        declareFunction("initialize_weak_successor_precedence_module", "INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE", 0, 0, false);
        declareFunction("initialize_strict_precedence_module", "INITIALIZE-STRICT-PRECEDENCE-MODULE", 0, 0, false);
        declareFunction("initialize_successor_strict_precedence_module", "INITIALIZE-SUCCESSOR-STRICT-PRECEDENCE-MODULE", 0, 0, false);
        declareFunction("sbhl_modules_initializedP", "SBHL-MODULES-INITIALIZED?", 0, 0, false);
        declareFunction("note_sbhl_modules_initialized", "NOTE-SBHL-MODULES-INITIALIZED", 0, 0, false);
        declareFunction("initialize_sbhl_modules", "INITIALIZE-SBHL-MODULES", 0, 1, false);
        declareFunction("convert_legacy_sbhl_modules_to_structs", "CONVERT-LEGACY-SBHL-MODULES-TO-STRUCTS", 0, 1, false);
        declareFunction("verify_sbhl_modules", "VERIFY-SBHL-MODULES", 0, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt51 = list(reader_make_constant_shell("genlInverse"), reader_make_constant_shell("genlPreds"));

    static private final SubLList $list_alt52 = list(reader_make_constant_shell("negationPreds"), reader_make_constant_shell("negationInverse"));

    static private final SubLList $list_alt53 = list(reader_make_constant_shell("negationInverse"), reader_make_constant_shell("negationPreds"));

    static private final SubLList $list_alt62 = list(reader_make_constant_shell("successorStrict-HL-TimePrecedence"), reader_make_constant_shell("strict-HL-TimePrecedence"), reader_make_constant_shell("weak-HL-TimePrecedence"), reader_make_constant_shell("weakSuccessor-HL-TimePrecedence"));

    public static final SubLObject init_sbhl_module_declarations_file_alt() {
        deflexical("*SBHL-MODULES-INITIALIZED?*", NIL != boundp($sbhl_modules_initializedP$) ? ((SubLObject) ($sbhl_modules_initializedP$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_sbhl_module_declarations_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SBHL-MODULES-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sbhl_modules_initializedP$, $sbhl_modules_initializedP$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-MODULES-INITIALIZED?*", NIL != boundp($sbhl_modules_initializedP$) ? ((SubLObject) ($sbhl_modules_initializedP$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_sbhl_module_declarations_file_Previous() {
        deflexical("*SBHL-MODULES-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sbhl_modules_initializedP$, $sbhl_modules_initializedP$, NIL));
        return NIL;
    }

    static private final SubLString $str_alt75$sbhl_module__A__graph__A__tt_modu = makeString("sbhl-module ~A: graph=~A  tt-module=~A~%");

    public static final SubLObject setup_sbhl_module_declarations_file_alt() {
        declare_defglobal($sbhl_modules_initializedP$);
        return NIL;
    }

    public static SubLObject setup_sbhl_module_declarations_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($sbhl_modules_initializedP$);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($sbhl_modules_initializedP$);
        }
        return NIL;
    }

    public static SubLObject setup_sbhl_module_declarations_file_Previous() {
        declare_defglobal($sbhl_modules_initializedP$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_module_declarations_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_module_declarations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_module_declarations_file();
    }

    static {
    }
}

/**
 * Total time: 136 ms
 */
