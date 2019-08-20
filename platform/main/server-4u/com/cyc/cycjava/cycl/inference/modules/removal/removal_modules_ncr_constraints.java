/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.noun_compound_parser;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.rbp_rule_bank;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-NCR-CONSTRAINTS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-ncr-constraints.lisp
 * created:     2019/07/03 17:38:25
 */
public final class removal_modules_ncr_constraints extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_ncr_constraints();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $excluded_nc_rules$ = makeSymbol("*EXCLUDED-NC-RULES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $basic_nc_rule_count$ = makeSymbol("*BASIC-NC-RULE-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $derived_nc_rule_count$ = makeSymbol("*DERIVED-NC-RULE-COUNT*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLObject $const0$satisfiesHeadSyntacticConstraints = reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR");

    private static final SubLSymbol $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-POS-UNIFY-ARG2");

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-BASIC-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, NIL, makeKeyword("ALL"), makeKeyword("SYNTACTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 ?NCRULE)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-POS-CHECK");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, NIL, makeKeyword("SYNTACTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <rule>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR)") });

    private static final SubLObject $const6$satisfiesHeadSemanticConstraintsF = reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR");

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARG2");

    static private final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DENOT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?RULE #$StormAsEvent)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARG-3");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), TWO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR ?DENOT)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3 = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-UNIFY-ARGS-2-AND-3");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), TWO_INTEGER, list(makeSymbol("GET-DERIVED-NC-RULE-COUNT"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DENOT"), makeSymbol("RULE")), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?NCRULE ?DENOT)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-POS-CHECK");

    static private final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("SEMANTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR #$StormAsEvent)") });

    private static final SubLObject $const15$satisfiesModifierSyntacticConstra = reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR");

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-POS-UNIFY-ARG2");

    static private final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), NIL, makeKeyword("ALL"), makeKeyword("SYNTACTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34  ?NCRULE)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-POS-CHECK");

    static private final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), NIL, makeKeyword("SYNTACTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <rule>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR)") });

    private static final SubLObject $const20$satisfiesModifierSemanticConstrai = reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR");

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2 = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARG2");

    static private final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DENOT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE #$CalendarSummer)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3 = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARG-3");

    static private final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), TWO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR ?DENOT)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3 = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-UNIFY-ARGS-2-AND-3");

    static private final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), TWO_INTEGER, list(makeSymbol("GET-DERIVED-NC-RULE-COUNT"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DENOT"), makeSymbol("RULE")), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE ?DENOT)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-POS-CHECK");

    static private final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("SEMANTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR #$CalendarSummer)") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-BASIC-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, NIL, makeKeyword("ALL"), makeKeyword("SYNTACTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 ?NCRULE)") });

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-HEAD-SYN-REQUIRE-ARG1-FULLY-BOUND");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, NIL, makeKeyword("SYNTACTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR <node> <rule>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSyntacticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR)") });

    static private final SubLList $list30 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-HEAD-SEM-REQUIRE-ARG1-FULLY-BOUND");

    static private final SubLList $list32 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-MOD-SYN-REQUIRE-ARG1-FULLY-BOUND");

    static private final SubLList $list34 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("NCR-NODE-SATISFIES-MOD-SEM-REQUIRE-ARG1-FULLY-BOUND");

    static private final SubLList $list36 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DENOT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?RULE #$StormAsEvent)") });





    static private final SubLSymbol $sym41$_WU = makeSymbol("?WU");

    static private final SubLSymbol $sym42$__POS_PRED = makeSymbol("??POS-PRED");

    static private final SubLSymbol $sym43$_RULE = makeSymbol("?RULE");

    static private final SubLList $list44 = list(reader_make_constant_shell("thereExists"), makeSymbol("?TERM"), list(reader_make_constant_shell("thereExists"), makeSymbol("?CONSTR"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ncRuleConstraint"), makeSymbol("?RULE"), makeSymbol("?CONSTR")), list(reader_make_constant_shell("argN"), makeSymbol("?TERM"), TWO_INTEGER, makeSymbol("?CONSTR")), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), reader_make_constant_shell("NounCompoundRuleIndexicalTerm-Direct")))));

    static private final SubLList $list45 = list(reader_make_constant_shell("isa"), makeSymbol("?RULE"), reader_make_constant_shell("NounCompoundRule"));

    static private final SubLList $list46 = list(reader_make_constant_shell("isa"), makeSymbol("?RULE"), reader_make_constant_shell("DerivedNounCompoundRule"));

    // Definitions
    public static final SubLObject check_potential_ncr_for_node_alt(SubLObject rule_cycl, SubLObject node, SubLObject o_type, SubLObject given_denot, SubLObject mode, SubLObject traced_rules) {
        if (given_denot == UNPROVIDED) {
            given_denot = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        {
            SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
            SubLObject results = NIL;
            if (NIL != rule) {
                results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_potential_ncrs_for_node_w_denot(node, o_type, given_denot, list(rule), mode, traced_rules);
            }
            return subl_promotions.memberP(rule_cycl, results, UNPROVIDED, UNPROVIDED);
        }
    }

    // Definitions
    public static SubLObject check_potential_ncr_for_node(final SubLObject rule_cycl, final SubLObject node, final SubLObject o_type, SubLObject given_denot, SubLObject mode, SubLObject traced_rules) {
        if (given_denot == UNPROVIDED) {
            given_denot = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
        SubLObject results = NIL;
        if (NIL != rule) {
            results = get_potential_ncrs_for_node_w_denot(node, o_type, given_denot, list(rule), mode, traced_rules);
        }
        return subl_promotions.memberP(rule_cycl, results, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), TWO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR ?DENOT)") });

    public static final SubLObject get_potential_ncrs_for_node_alt(SubLObject node, SubLObject o_type, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
                SubLObject mt = (NIL != content_mt) ? ((SubLObject) (content_mt)) : $$InferencePSC;
                SubLObject paired_results = NIL;
                SubLObject denot_list = parsing_utilities.syntactic_node_proposed_meanings(node, mt, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                    try {
                        parsing_vars.$parse_tree_mt$.bind(mt, thread);
                        {
                            SubLObject cdolist_list_var = denot_list;
                            SubLObject denot = NIL;
                            for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                {
                                    SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_potential_ncrs_for_node_w_denot_int(node, o_type, denot, rule_list, mode, traced_rules);
                                    SubLObject cdolist_list_var_1 = results;
                                    SubLObject rule = NIL;
                                    for (rule = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , rule = cdolist_list_var_1.first()) {
                                        paired_results = cons(list(denot, rule), paired_results);
                                    }
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return paired_results;
            }
        }
    }

    public static SubLObject get_potential_ncrs_for_node(final SubLObject node, final SubLObject o_type, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        final SubLObject mt = (NIL != content_mt) ? content_mt : $$InferencePSC;
        SubLObject paired_results = NIL;
        final SubLObject denot_list = parsing_utilities.syntactic_node_proposed_meanings(node, mt, UNPROVIDED);
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            SubLObject cdolist_list_var = denot_list;
            SubLObject denot = NIL;
            denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                final SubLObject results = cdolist_list_var_$1 = get_potential_ncrs_for_node_w_denot_int(node, o_type, denot, rule_list, mode, traced_rules);
                SubLObject rule = NIL;
                rule = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    paired_results = cons(list(denot, rule), paired_results);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    rule = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            } 
        } finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return paired_results;
    }

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), TWO_INTEGER, list(makeSymbol("GET-DERIVED-NC-RULE-COUNT"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DENOT"), makeSymbol("RULE")), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443  ?NCRULE ?DENOT)") });

    public static final SubLObject get_potential_ncrs_for_node_w_denot_alt(SubLObject node, SubLObject o_type, SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
                SubLObject mt = (NIL != content_mt) ? ((SubLObject) (content_mt)) : $$InferencePSC;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                    try {
                        parsing_vars.$parse_tree_mt$.bind(mt, thread);
                        ans = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_potential_ncrs_for_node_w_denot_int(node, o_type, given_denot, rule_list, mode, traced_rules);
                    } finally {
                        parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject get_potential_ncrs_for_node_w_denot(final SubLObject node, final SubLObject o_type, final SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        final SubLObject mt = (NIL != content_mt) ? content_mt : $$InferencePSC;
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            ans = get_potential_ncrs_for_node_w_denot_int(node, o_type, given_denot, rule_list, mode, traced_rules);
        } finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject get_potential_denots_for_node_w_rule_alt(SubLObject node, SubLObject o_type, SubLObject rule_cycl, SubLObject mode, SubLObject traced_rules) {
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject pair_list = NIL;
                SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
                SubLObject mt = (NIL != content_mt) ? ((SubLObject) (content_mt)) : $$InferencePSC;
                SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
                if (NIL != rule) {
                    {
                        SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                        try {
                            parsing_vars.$parse_tree_mt$.bind(mt, thread);
                            pair_list = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_potential_ncrs_for_node(node, o_type, list(rule), mode, traced_rules);
                        } finally {
                            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = pair_list;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            ans = cons(pair.first(), ans);
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject get_potential_denots_for_node_w_rule(final SubLObject node, final SubLObject o_type, final SubLObject rule_cycl, SubLObject mode, SubLObject traced_rules) {
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject pair_list = NIL;
        final SubLObject content_mt = parsing_utilities.syntactic_node_content_mt(node);
        final SubLObject mt = (NIL != content_mt) ? content_mt : $$InferencePSC;
        final SubLObject rule = rbp_rule_bank.rbp_find_rule_from_cycl_w_initialized_rb(rule_cycl);
        if (NIL != rule) {
            final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
            try {
                parsing_vars.$parse_tree_mt$.bind(mt, thread);
                pair_list = get_potential_ncrs_for_node(node, o_type, list(rule), mode, traced_rules);
            } finally {
                parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = pair_list;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(pair.first(), ans);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), $HEAD, list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("SEMANTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR <node> <rule> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesHeadSemanticConstraintsForNCR #$LinkageLexicalNode-443 #$WinterStorm-NCR #$StormAsEvent)") });

    public static final SubLObject get_potential_ncrs_for_node_w_denot_int_alt(SubLObject node, SubLObject o_type, SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject blocks = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_blocks_for_node_w_denot(node, given_denot, UNPROVIDED);
                SubLObject results = NIL;
                if ($excluded_nc_rules$.getDynamicValue(thread).equal($UNINITIALIZED)) {
                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_excluded_nc_rules();
                }
                {
                    SubLObject cdolist_list_var = blocks;
                    SubLObject block = NIL;
                    for (block = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , block = cdolist_list_var.first()) {
                        {
                            SubLObject rules = noun_compound_parser.inference_rbp_rb_search(block, o_type, rule_list, mode, traced_rules);
                            if (NIL != rules) {
                                {
                                    SubLObject cdolist_list_var_2 = rules;
                                    SubLObject rule = NIL;
                                    for (rule = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , rule = cdolist_list_var_2.first()) {
                                        {
                                            SubLObject rule_cycl = rbp_rule_bank.rbp_find_cycl_from_rule(rule);
                                            if (NIL == subl_promotions.memberP(rule_cycl, $excluded_nc_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                results = list_utilities.adjoin_to_end(rule_cycl, results, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject get_potential_ncrs_for_node_w_denot_int(final SubLObject node, final SubLObject o_type, final SubLObject given_denot, SubLObject rule_list, SubLObject mode, SubLObject traced_rules) {
        if (rule_list == UNPROVIDED) {
            rule_list = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $ALL;
        }
        if (traced_rules == UNPROVIDED) {
            traced_rules = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject blocks = get_blocks_for_node_w_denot(node, given_denot, UNPROVIDED);
        SubLObject results = NIL;
        if ($excluded_nc_rules$.getDynamicValue(thread).equal($UNINITIALIZED)) {
            get_excluded_nc_rules();
        }
        SubLObject cdolist_list_var = blocks;
        SubLObject block = NIL;
        block = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rules = noun_compound_parser.inference_rbp_rb_search(block, o_type, rule_list, mode, traced_rules);
            if (NIL != rules) {
                SubLObject cdolist_list_var_$2 = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject rule_cycl = rbp_rule_bank.rbp_find_cycl_from_rule(rule);
                    if (NIL == subl_promotions.memberP(rule_cycl, $excluded_nc_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        results = list_utilities.adjoin_to_end(rule_cycl, results, UNPROVIDED);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    rule = cdolist_list_var_$2.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            block = cdolist_list_var.first();
        } 
        return results;
    }

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), NIL, makeKeyword("ALL"), makeKeyword("SYNTACTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34  ?NCRULE)") });

    public static final SubLObject get_blocks_for_node_w_denot_alt(SubLObject node, SubLObject denot, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        {
            SubLObject string = parsing_utilities.syntactic_node_string(node);
            SubLObject index_1 = parsing_utilities.syntactic_node_start_offset(node);
            SubLObject index_2 = add(index_1, length(string));
            SubLObject pos = parsing_utilities.syntactic_node_category(node);
            SubLObject pos_pred = parsing_utilities.syntactic_node_agreement_pred(node);
            SubLObject new_blocks = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_blocks_from_node_info(string, denot, index_1, index_2, pos, pos_pred, mt);
            return new_blocks;
        }
    }

    public static SubLObject get_blocks_for_node_w_denot(final SubLObject node, final SubLObject denot, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        final SubLObject string = parsing_utilities.syntactic_node_string(node);
        final SubLObject index_1 = parsing_utilities.syntactic_node_start_offset(node);
        final SubLObject index_2 = add(index_1, length(string));
        final SubLObject pos = parsing_utilities.syntactic_node_category(node);
        final SubLObject pos_pred = parsing_utilities.syntactic_node_agreement_pred(node);
        final SubLObject new_blocks = get_blocks_from_node_info(string, denot, index_1, index_2, pos, pos_pred, mt);
        return new_blocks;
    }

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), NIL, makeKeyword("SYNTACTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR <node> <rule>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSyntacticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR)") });

    public static final SubLObject get_blocks_from_node_info_alt(SubLObject string, SubLObject denot, SubLObject index_1, SubLObject index_2, SubLObject pos, SubLObject pos_pred, SubLObject mt) {
        {
            SubLObject query_sentence = (NIL != pos_pred) ? ((SubLObject) (list($$wordForms, $sym41$_WU, pos_pred, string))) : list($$wordForms, $sym41$_WU, $sym42$__POS_PRED, string);
            SubLObject word_units = ask_utilities.query_variable($sym41$_WU, query_sentence, mt, UNPROVIDED);
            SubLObject new_blocks = NIL;
            if (NIL != list_utilities.empty_list_p(word_units)) {
                word_units = cons(NIL, word_units);
            }
            {
                SubLObject cdolist_list_var = word_units;
                SubLObject wu = NIL;
                for (wu = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , wu = cdolist_list_var.first()) {
                    {
                        SubLObject new_block = noun_compound_parser.inference_new_noun_compound_block(index_1, index_2, ONE_INTEGER, string, wu, NIL, denot, pos, pos_pred, NIL);
                        new_blocks = cons(new_block, new_blocks);
                    }
                }
            }
            return new_blocks;
        }
    }

    public static SubLObject get_blocks_from_node_info(final SubLObject string, final SubLObject denot, final SubLObject index_1, final SubLObject index_2, final SubLObject pos, final SubLObject pos_pred, final SubLObject mt) {
        final SubLObject query_sentence = (NIL != pos_pred) ? list($$wordForms, $sym41$_WU, pos_pred, string) : list($$wordForms, $sym41$_WU, $sym42$__POS_PRED, string);
        SubLObject word_units = ask_utilities.query_variable($sym41$_WU, query_sentence, mt, UNPROVIDED);
        SubLObject new_blocks = NIL;
        if (NIL != list_utilities.empty_list_p(word_units)) {
            word_units = cons(NIL, word_units);
        }
        SubLObject cdolist_list_var = word_units;
        SubLObject wu = NIL;
        wu = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_block = noun_compound_parser.inference_new_noun_compound_block(index_1, index_2, ONE_INTEGER, string, wu, NIL, denot, pos, pos_pred, NIL);
            new_blocks = cons(new_block, new_blocks);
            cdolist_list_var = cdolist_list_var.rest();
            wu = cdolist_list_var.first();
        } 
        return new_blocks;
    }

    public static final SubLObject get_excluded_nc_rules_alt() {
        {
            SubLObject rules = ask_utilities.query_variable($sym43$_RULE, $list_alt44, $$InferencePSC, UNPROVIDED);
            $excluded_nc_rules$.setDynamicValue(rules);
        }
        return T;
    }

    public static SubLObject get_excluded_nc_rules() {
        final SubLObject rules = ask_utilities.query_variable($sym43$_RULE, $list44, $$InferencePSC, UNPROVIDED);
        $excluded_nc_rules$.setDynamicValue(rules);
        return T;
    }

    public static final SubLObject get_basic_nc_rule_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($basic_nc_rule_count$.getDynamicValue(thread).equal($UNINITIALIZED)) {
                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.set_basic_nc_rule_count();
            }
            return $basic_nc_rule_count$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_basic_nc_rule_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($basic_nc_rule_count$.getDynamicValue(thread).equal($UNINITIALIZED)) {
            set_basic_nc_rule_count();
        }
        return $basic_nc_rule_count$.getDynamicValue(thread);
    }

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("GET-DERIVED-NC-RULE-COUNT")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DENOT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE #$CalendarSummer)") });

    public static final SubLObject set_basic_nc_rule_count_alt() {
        {
            SubLObject rule_count = length(ask_utilities.query_variable($sym43$_RULE, $list_alt45, $$InferencePSC, UNPROVIDED));
            SubLObject derived_rule_count = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.get_derived_nc_rule_count();
            SubLObject basic_rule_count = subtract(rule_count, derived_rule_count);
            $basic_nc_rule_count$.setDynamicValue(basic_rule_count);
        }
        return T;
    }

    public static SubLObject set_basic_nc_rule_count() {
        final SubLObject rule_count = length(ask_utilities.query_variable($sym43$_RULE, $list45, $$InferencePSC, UNPROVIDED));
        final SubLObject derived_rule_count = get_derived_nc_rule_count();
        final SubLObject basic_rule_count = subtract(rule_count, derived_rule_count);
        $basic_nc_rule_count$.setDynamicValue(basic_rule_count);
        return T;
    }

    public static final SubLObject get_derived_nc_rule_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($derived_nc_rule_count$.getDynamicValue(thread).equal($UNINITIALIZED)) {
                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.set_derived_nc_rule_count();
            }
            return $derived_nc_rule_count$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_derived_nc_rule_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($derived_nc_rule_count$.getDynamicValue(thread).equal($UNINITIALIZED)) {
            set_derived_nc_rule_count();
        }
        return $derived_nc_rule_count$.getDynamicValue(thread);
    }

    public static final SubLObject set_derived_nc_rule_count_alt() {
        {
            SubLObject derived_rule_count = length(ask_utilities.query_variable($sym43$_RULE, $list_alt46, $$InferencePSC, UNPROVIDED));
            $derived_nc_rule_count$.setDynamicValue(derived_rule_count);
        }
        return T;
    }

    public static SubLObject set_derived_nc_rule_count() {
        final SubLObject derived_rule_count = length(ask_utilities.query_variable($sym43$_RULE, $list46, $$InferencePSC, UNPROVIDED));
        $derived_nc_rule_count$.setDynamicValue(derived_rule_count);
        return T;
    }

    public static final SubLObject nc_parse_verify_general_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject pred = cycl_utilities.formula_arg0(asent);
            SubLObject node = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            SubLObject rule = cycl_utilities.formula_arg2(asent, UNPROVIDED);
            SubLObject pcase_var = pred;
            if (pcase_var.eql($const0$satisfiesHeadSyntacticConstraints)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.check_potential_ncr_for_node(rule, node, $HEAD, NIL, $SYNTACTIC, UNPROVIDED);
            } else {
                if (pcase_var.eql($const15$satisfiesModifierSyntacticConstra)) {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.check_potential_ncr_for_node(rule, node, $MODIFIER, NIL, $SYNTACTIC, UNPROVIDED);
                } else {
                    if (pcase_var.eql($const6$satisfiesHeadSemanticConstraintsF)) {
                        {
                            SubLObject denot = cycl_utilities.formula_arg3(asent, UNPROVIDED);
                            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.check_potential_ncr_for_node(rule, node, $HEAD, denot, $SEMANTIC, UNPROVIDED);
                        }
                    } else {
                        if (pcase_var.eql($const20$satisfiesModifierSemanticConstrai)) {
                            {
                                SubLObject denot = cycl_utilities.formula_arg3(asent, UNPROVIDED);
                                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints.check_potential_ncr_for_node(rule, node, $MODIFIER, denot, $SEMANTIC, UNPROVIDED);
                            }
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject nc_parse_verify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_arg0(asent);
        final SubLObject node = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject rule = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject pcase_var = pred;
        if (pcase_var.eql($const0$satisfiesHeadSyntacticConstraints)) {
            return check_potential_ncr_for_node(rule, node, $HEAD, NIL, $SYNTACTIC, UNPROVIDED);
        }
        if (pcase_var.eql($const15$satisfiesModifierSyntacticConstra)) {
            return check_potential_ncr_for_node(rule, node, $MODIFIER, NIL, $SYNTACTIC, UNPROVIDED);
        }
        if (pcase_var.eql($const6$satisfiesHeadSemanticConstraintsF)) {
            final SubLObject denot = cycl_utilities.formula_arg3(asent, UNPROVIDED);
            return check_potential_ncr_for_node(rule, node, $HEAD, denot, $SEMANTIC, UNPROVIDED);
        }
        if (pcase_var.eql($const20$satisfiesModifierSemanticConstrai)) {
            final SubLObject denot = cycl_utilities.formula_arg3(asent, UNPROVIDED);
            return check_potential_ncr_for_node(rule, node, $MODIFIER, denot, $SEMANTIC, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), TWO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR ?DENOT)") });

    public static final SubLObject nc_parse_justify_general_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject supports = NIL;
            return supports;
        }
    }

    public static SubLObject nc_parse_justify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject supports = NIL;
        return supports;
    }

    public static SubLObject declare_removal_modules_ncr_constraints_file() {
        declareFunction("check_potential_ncr_for_node", "CHECK-POTENTIAL-NCR-FOR-NODE", 3, 3, false);
        declareFunction("get_potential_ncrs_for_node", "GET-POTENTIAL-NCRS-FOR-NODE", 2, 3, false);
        declareFunction("get_potential_ncrs_for_node_w_denot", "GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT", 3, 3, false);
        declareFunction("get_potential_denots_for_node_w_rule", "GET-POTENTIAL-DENOTS-FOR-NODE-W-RULE", 3, 2, false);
        declareFunction("get_potential_ncrs_for_node_w_denot_int", "GET-POTENTIAL-NCRS-FOR-NODE-W-DENOT-INT", 3, 3, false);
        declareFunction("get_blocks_for_node_w_denot", "GET-BLOCKS-FOR-NODE-W-DENOT", 2, 1, false);
        declareFunction("get_blocks_from_node_info", "GET-BLOCKS-FROM-NODE-INFO", 7, 0, false);
        declareFunction("get_excluded_nc_rules", "GET-EXCLUDED-NC-RULES", 0, 0, false);
        declareFunction("get_basic_nc_rule_count", "GET-BASIC-NC-RULE-COUNT", 0, 0, false);
        declareFunction("set_basic_nc_rule_count", "SET-BASIC-NC-RULE-COUNT", 0, 0, false);
        declareFunction("get_derived_nc_rule_count", "GET-DERIVED-NC-RULE-COUNT", 0, 0, false);
        declareFunction("set_derived_nc_rule_count", "SET-DERIVED-NC-RULE-COUNT", 0, 0, false);
        declareFunction("nc_parse_verify_general", "NC-PARSE-VERIFY-GENERAL", 2, 0, false);
        declareFunction("nc_parse_justify_general", "NC-PARSE-JUSTIFY-GENERAL", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), TWO_INTEGER, list(makeSymbol("GET-DERIVED-NC-RULE-COUNT"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("NODE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-POTENTIAL-NCRS-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), makeKeyword("ALL"), makeKeyword("SEMANTIC")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DENOT"), makeSymbol("RULE")), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 ?NCRULE ?DENOT)") });

    public static SubLObject init_removal_modules_ncr_constraints_file() {
        defparameter("*EXCLUDED-NC-RULES*", $UNINITIALIZED);
        defparameter("*BASIC-NC-RULE-COUNT*", $UNINITIALIZED);
        defparameter("*DERIVED-NC-RULE-COUNT*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_removal_modules_ncr_constraints_file() {
        inference_modules.register_solely_specific_removal_module_predicate($const0$satisfiesHeadSyntacticConstraints);
        inference_modules.inference_removal_module_use_generic($const0$satisfiesHeadSyntacticConstraints, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SYN_POS_UNIFY_ARG2, $list3);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SYN_POS_CHECK, $list5);
        inference_modules.register_solely_specific_removal_module_predicate($const6$satisfiesHeadSemanticConstraintsF);
        inference_modules.inference_removal_module_use_generic($const6$satisfiesHeadSemanticConstraintsF, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG2, $list8);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARG_3, $list10);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_UNIFY_ARGS_2_AND_3, $list12);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_HEAD_SEM_POS_CHECK, $list14);
        inference_modules.register_solely_specific_removal_module_predicate($const15$satisfiesModifierSyntacticConstra);
        inference_modules.inference_removal_module_use_generic($const15$satisfiesModifierSyntacticConstra, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SYN_POS_UNIFY_ARG2, $list17);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SYN_POS_CHECK, $list19);
        inference_modules.register_solely_specific_removal_module_predicate($const20$satisfiesModifierSemanticConstrai);
        inference_modules.inference_removal_module_use_generic($const20$satisfiesModifierSemanticConstrai, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG2, $list22);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARG_3, $list24);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_UNIFY_ARGS_2_AND_3, $list26);
        inference_modules.inference_removal_module($NCR_NODE_SATISFIES_MOD_SEM_POS_CHECK, $list28);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_HEAD_SYN_REQUIRE_ARG1_FULLY_BOUND, $list30);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_HEAD_SEM_REQUIRE_ARG1_FULLY_BOUND, $list32);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_MOD_SYN_REQUIRE_ARG1_FULLY_BOUND, $list34);
        preference_modules.inference_preference_module($NCR_NODE_SATISFIES_MOD_SEM_REQUIRE_ARG1_FULLY_BOUND, $list36);
        return NIL;
    }

    static private final SubLList $list_alt28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), list($BIND, makeSymbol("NODE")), list($BIND, makeSymbol("RULE")), list($BIND, makeSymbol("DENOT"))), list(list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("DENOT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("CHECK-POTENTIAL-NCR-FOR-NODE"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("MODIFIER"), list(makeKeyword("VALUE"), makeSymbol("DENOT")), makeKeyword("SEMANTIC")), makeKeyword("SUPPORT-MODULE"), makeKeyword("NC-PARSE"), makeKeyword("DOCUMENTATION"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR <node> <rule> <denot>)"), makeKeyword("EXAMPLE"), makeString("(#$satisfiesModifierSemanticConstraintsForNCR #$LinkageLexicalNode-34 #$WinterStorm-NCR #$CalendarSummer)") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_ncr_constraints_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_ncr_constraints_file();
    }

    static private final SubLList $list_alt30 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSyntacticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_ncr_constraints_file();
    }

    static {
    }

    static private final SubLList $list_alt32 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesHeadSemanticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt34 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSyntacticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt36 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("satisfiesModifierSemanticConstraintsForNCR"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt44 = list(reader_make_constant_shell("thereExists"), makeSymbol("?TERM"), list(reader_make_constant_shell("thereExists"), makeSymbol("?CONSTR"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ncRuleConstraint"), makeSymbol("?RULE"), makeSymbol("?CONSTR")), list(reader_make_constant_shell("argN"), makeSymbol("?TERM"), TWO_INTEGER, makeSymbol("?CONSTR")), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), reader_make_constant_shell("NounCompoundRuleIndexicalTerm-Direct")))));

    static private final SubLList $list_alt45 = list(reader_make_constant_shell("isa"), makeSymbol("?RULE"), reader_make_constant_shell("NounCompoundRule"));

    static private final SubLList $list_alt46 = list(reader_make_constant_shell("isa"), makeSymbol("?RULE"), reader_make_constant_shell("DerivedNounCompoundRule"));
}

/**
 * Total time: 166 ms
 */
