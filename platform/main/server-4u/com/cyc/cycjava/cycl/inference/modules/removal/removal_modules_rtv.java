/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.assertions_high.gaf_arg0;
import static com.cyc.cycjava.cycl.assertions_high.gaf_assertionP;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.formula_length;
import static com.cyc.cycjava.cycl.el_utilities.genls_litP;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.graphl_graph_utilities;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
 * module:      REMOVAL-MODULES-RTV
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-rtv.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_rtv extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_rtv();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rtv_default_search_plist$ = makeSymbol("*RTV-DEFAULT-SEARCH-PLIST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rtv_use_type_constraints_p$ = makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_rtv_cost$ = makeSymbol("*DEFAULT-RTV-COST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("PREDS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list3 = list(makeSymbol("LISTP"));

    public static final SubLSymbol $rtv_asent_set_o_preds$ = makeSymbol("*RTV-ASENT-SET-O-PREDS*");

    static private final SubLList $list6 = list(makeSymbol("DEPTH"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $rtv_depth_cutoff$ = makeSymbol("*RTV-DEPTH-CUTOFF*");

    static private final SubLString $str8$No_valid_hl_variable_in_asent____ = makeString("No valid hl-variable in asent : ~A");

    static private final SubLString $str9$No_initial_node_applicable_for_as = makeString("No initial node applicable for asent ~A~%");

    static private final SubLList $list10 = list(makeSymbol("ASENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $rtv_asent$ = makeSymbol("*RTV-ASENT*");

    public static final SubLSymbol $rtv_asent_pred$ = makeSymbol("*RTV-ASENT-PRED*");

    public static final SubLSymbol $rtv_term_argnums$ = makeSymbol("*RTV-TERM-ARGNUMS*");

    private static final SubLSymbol DETERMINE_RTV_TERM_ARGNUMS = makeSymbol("DETERMINE-RTV-TERM-ARGNUMS");

    public static final SubLSymbol $rtv_var_argnums$ = makeSymbol("*RTV-VAR-ARGNUMS*");

    private static final SubLSymbol DETERMINE_RTV_VAR_ARGNUMS = makeSymbol("DETERMINE-RTV-VAR-ARGNUMS");

    private static final SubLSymbol DETERMINE_RTV_ASENT_PREDS = makeSymbol("DETERMINE-RTV-ASENT-PREDS");

    private static final SubLSymbol DETERMINE_RTV_DEPTH_CUTOFF = makeSymbol("DETERMINE-RTV-DEPTH-CUTOFF");

    static private final SubLList $list20 = list($TYPE, makeKeyword("TRANSITIVE-REASONING"), makeKeyword("DIRECTION"), makeKeyword("ACCESSIBLE"), makeKeyword("MARKING"), makeKeyword("DEPTH-MARKING"));

    static private final SubLList $list21 = list(makeSymbol("SEARCH"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list24 = list(makeKeyword("MT"));

    private static final SubLSymbol WITH_GHL_SEARCH_INITIALIZED = makeSymbol("WITH-GHL-SEARCH-INITIALIZED");

    private static final SubLSymbol ADD_RTV_DEFAULT_SEARCH_PROPERTIES = makeSymbol("ADD-RTV-DEFAULT-SEARCH-PROPERTIES");

    static private final SubLList $list27 = list(list(makeSymbol("*RTV-ISA-CONSTRAINTS*"), NIL), list(makeSymbol("*RTV-GENLS-CONSTRAINTS*"), NIL), list(makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), T));

    static private final SubLList $list28 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym29$RTV_FORMULA = makeUninternedSymbol("RTV-FORMULA");

    static private final SubLSymbol $sym30$VAR = makeUninternedSymbol("VAR");

    private static final SubLSymbol FIND_IF = makeSymbol("FIND-IF");

    static private final SubLList $list32 = list(QUOTE, makeSymbol("RTV-CLAUSE-P"));

    static private final SubLSymbol $sym34$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLSymbol $rtv_isa_constraints$ = makeSymbol("*RTV-ISA-CONSTRAINTS*");

    private static final SubLSymbol FIND_RTV_ISA_CONSTRAINTS = makeSymbol("FIND-RTV-ISA-CONSTRAINTS");

    public static final SubLSymbol $rtv_genls_constraints$ = makeSymbol("*RTV-GENLS-CONSTRAINTS*");

    private static final SubLSymbol FIND_RTV_GENLS_CONSTRAINTS = makeSymbol("FIND-RTV-GENLS-CONSTRAINTS");

    static private final SubLList $list41 = list(list(makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), list(makeSymbol("COR"), makeSymbol("*RTV-ISA-CONSTRAINTS*"), makeSymbol("*RTV-GENLS-CONSTRAINTS*"))));

    private static final SubLSymbol ISA_CLAUSE_P = makeSymbol("ISA-CLAUSE-P");

    private static final SubLSymbol GENLS_CLAUSE_P = makeSymbol("GENLS-CLAUSE-P");







    static private final SubLList $list53 = list(makeKeyword("ADD-TO-RESULT?"), makeKeyword("NODES-ON-WIND"));

    private static final SubLSymbol $kw57$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");

    private static final SubLSymbol $EDGES_ON_UNWIND = makeKeyword("EDGES-ON-UNWIND");

    static private final SubLList $list60 = list(makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"), makeKeyword("JUSTIFY?"), makeKeyword("ALL"));

    private static final SubLList $list61 = list(makeKeyword("JUSTIFY?"), makeKeyword("ALL"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"));

    private static final SubLSymbol RTV_CLAUSE_P = makeSymbol("RTV-CLAUSE-P");

    private static final SubLSymbol RTV_NODE_MEETS_CONSTRAINTS_P = makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P");

    private static final SubLList $list65 = list(makeKeyword("SATISFY-FN"), makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P"), makeKeyword("JUSTIFY?"), makeKeyword("ALL"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"));





    private static final SubLList $list71 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("SOP"), makeSymbol("NUM"));

    private static final SubLSymbol $REMOVAL_RELATED_TO_VIA_CHECK = makeKeyword("REMOVAL-RELATED-TO-VIA-CHECK");

    private static final SubLList $list74 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("relatedToVia"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relatedToVia"), $FORT, $FORT, cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RTV-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RTV-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RTV-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <fort> <fort> <SOP> <num>)"), makeKeyword("EXAMPLE"), makeString("(#$relatedToVia #$KevinBacon #$KevinSpacey (#$TheSet #$costars) 2)") });

    private static final SubLSymbol $REMOVAL_RELATED_TO_VIA_GENERATE = makeKeyword("REMOVAL-RELATED-TO-VIA-GENERATE");

    private static final SubLList $list76 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("relatedToVia"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("relatedToVia"), $FORT, makeKeyword("VARIABLE"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER")), list(reader_make_constant_shell("relatedToVia"), makeKeyword("VARIABLE"), $FORT, cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RTV-GENERATE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RTV-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-RTV-GENERATE-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list($CALL, makeSymbol("TERM-UNIFY"), list($CALL, makeSymbol("GET-RTV-VAR-ARG"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("INPUT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("RTV"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <VAR> <fort> <SOP> <num>)\n    and\n    (#$relatedToVia <fort> <VAR> <SOP> <num>)"), makeKeyword("EXAMPLE"), makeString("(#$relatedToVia ?WHO #$KevinBacon (#$TheSet #$costars) 2)\n    and\n    (#$relatedToVia #$KevinBacon ?WHO (#$TheSet #$costars) 2)") });

    private static final SubLSymbol $RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE = makeKeyword("RELATED-TO-VIA-EITHER-ARG1-OR-ARG2-BINDABLE");

    private static final SubLList $list79 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("relatedToVia"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relatedToVia"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG2"));

    public static final SubLObject with_rtv_asent_set_o_preds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject preds = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            preds = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, preds, $list_alt3), listS(CLET, list(list($rtv_asent_set_o_preds$, preds)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_rtv_asent_set_o_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject preds = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        preds = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, preds, $list3), listS(CLET, list(list($rtv_asent_set_o_preds$, preds)), append(body, NIL)));
    }

    public static final SubLObject get_rtv_pred_set_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rtv_asent_set_o_preds$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_rtv_pred_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rtv_asent_set_o_preds$.getDynamicValue(thread);
    }

    public static final SubLObject get_rtv_depth_cutoff_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rtv_depth_cutoff$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_rtv_depth_cutoff() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rtv_depth_cutoff$.getDynamicValue(thread);
    }

    public static final SubLObject with_rtv_depth_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject depth = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            depth = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CLET, list(list($rtv_depth_cutoff$, depth)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_rtv_depth_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject depth = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        depth = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CLET, list(list($rtv_depth_cutoff$, depth)), append(body, NIL)));
    }

    /**
     *
     *
     * @return listp. Determines the argnums for each of the ground terms in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for each of the ground terms in ASENT.")
    public static final SubLObject determine_rtv_term_argnums_alt(SubLObject asent) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
            SubLObject num = NIL;
            for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                if (NIL == cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                    result = cons(num, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp. Determines the argnums for each of the ground terms in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for each of the ground terms in ASENT.")
    public static SubLObject determine_rtv_term_argnums(final SubLObject asent) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                result = cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @return listp. Determines the argnums for the hl-variable positions in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for the hl-variable positions in ASENT.")
    public static final SubLObject determine_rtv_var_argnums_alt(SubLObject asent) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
            SubLObject num = NIL;
            for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                    result = cons(num, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp. Determines the argnums for the hl-variable positions in ASENT.
     */
    @LispMethod(comment = "@return listp. Determines the argnums for the hl-variable positions in ASENT.")
    public static SubLObject determine_rtv_var_argnums(final SubLObject asent) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED))) {
                result = cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject get_rtv_var_arg_alt(SubLObject asent) {
        if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
        }
        ghl_search_vars.ghl_error($str_alt8$No_valid_hl_variable_in_asent____, asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_rtv_var_arg(final SubLObject asent) {
        if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        if (NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
        }
        ghl_search_vars.ghl_error($str8$No_valid_hl_variable_in_asent____, asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject determine_rtv_asent_preds_alt(SubLObject asent) {
        return cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg(asent, THREE_INTEGER, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject determine_rtv_asent_preds(final SubLObject asent) {
        return cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg(asent, THREE_INTEGER, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject determine_rtv_depth_cutoff_alt(SubLObject asent) {
        return cycl_utilities.atomic_sentence_arg(asent, FOUR_INTEGER, UNPROVIDED);
    }

    public static SubLObject determine_rtv_depth_cutoff(final SubLObject asent) {
        return cycl_utilities.atomic_sentence_arg(asent, FOUR_INTEGER, UNPROVIDED);
    }

    public static final SubLObject determine_rtv_initial_node_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_var_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
            } else {
                if ((NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_var_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                    return cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
                } else {
                    if ((NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                        return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
                    } else {
                        Errors.error($str_alt9$No_initial_node_applicable_for_as, asent);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject determine_rtv_initial_node(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_var_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        if ((NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_var_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, TWO_INTEGER, UNPROVIDED);
        }
        if ((NIL != subl_promotions.memberP(ONE_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(TWO_INTEGER, $rtv_term_argnums$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, ONE_INTEGER, UNPROVIDED);
        }
        Errors.error($str9$No_initial_node_applicable_for_as, asent);
        return NIL;
    }

    public static final SubLObject determine_rtv_goal_alt(SubLObject asent) {
        return third(asent);
    }

    public static SubLObject determine_rtv_goal(final SubLObject asent) {
        return third(asent);
    }

    public static final SubLObject bind_rtv_asent_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            asent = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($rtv_asent$, asent), list($rtv_asent_pred$, list(ATOMIC_SENTENCE_PREDICATE, asent)), list($rtv_term_argnums$, list(DETERMINE_RTV_TERM_ARGNUMS, asent)), list($rtv_var_argnums$, list(DETERMINE_RTV_VAR_ARGNUMS, asent)), list($rtv_asent_set_o_preds$, list(DETERMINE_RTV_ASENT_PREDS, asent)), list($rtv_depth_cutoff$, list(DETERMINE_RTV_DEPTH_CUTOFF, asent))), append(body, NIL));
            }
        }
    }

    public static SubLObject bind_rtv_asent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        asent = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($rtv_asent$, asent), list($rtv_asent_pred$, list(ATOMIC_SENTENCE_PREDICATE, asent)), list($rtv_term_argnums$, list(DETERMINE_RTV_TERM_ARGNUMS, asent)), list($rtv_var_argnums$, list(DETERMINE_RTV_VAR_ARGNUMS, asent)), list($rtv_asent_set_o_preds$, list(DETERMINE_RTV_ASENT_PREDS, asent)), list($rtv_depth_cutoff$, list(DETERMINE_RTV_DEPTH_CUTOFF, asent))), append(body, NIL));
    }

    public static final SubLObject add_rtv_default_search_properties_alt(SubLObject plist) {
        return append($rtv_default_search_plist$.getGlobalValue(), plist);
    }

    public static SubLObject add_rtv_default_search_properties(final SubLObject plist) {
        return append($rtv_default_search_plist$.getGlobalValue(), plist);
    }

    public static final SubLObject with_rtv_search_initialized_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_search = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            v_search = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt21);
            plist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, listS(GETF, plist, $list_alt24), listS(WITH_GHL_SEARCH_INITIALIZED, v_search, list(ADD_RTV_DEFAULT_SEARCH_PROPERTIES, plist), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_rtv_search_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_search = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        v_search = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        plist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, listS(GETF, plist, $list24), listS(WITH_GHL_SEARCH_INITIALIZED, v_search, list(ADD_RTV_DEFAULT_SEARCH_PROPERTIES, plist), append(body, NIL)));
    }

    public static final SubLObject with_new_rtv_type_constraints_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt27, append(body, NIL));
        }
    }

    public static SubLObject with_new_rtv_type_constraints(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list27, append(body, NIL));
    }

    public static final SubLObject with_rtv_constraints_from_formula_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject formula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            formula = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject rtv_formula = $sym29$RTV_FORMULA;
                SubLObject var = $sym30$VAR;
                return list(CLET, list(list(rtv_formula, list(FIND_IF, $list_alt32, formula)), list(var, list(FCOND, list(list($sym34$EL_VAR_, list(FORMULA_ARG1, rtv_formula)), list(FORMULA_ARG1, rtv_formula)), list(list($sym34$EL_VAR_, list(FORMULA_ARG2, rtv_formula)), list(FORMULA_ARG2, rtv_formula)))), list($rtv_isa_constraints$, list(FIND_RTV_ISA_CONSTRAINTS, formula, var)), list($rtv_genls_constraints$, list(FIND_RTV_GENLS_CONSTRAINTS, formula, var))), listS(CLET, $list_alt41, append(body, NIL)));
            }
        }
    }

    public static SubLObject with_rtv_constraints_from_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        formula = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject rtv_formula = $sym29$RTV_FORMULA;
        final SubLObject var = $sym30$VAR;
        return list(CLET, list(list(rtv_formula, list(FIND_IF, $list32, formula)), list(var, list(FCOND, list(list($sym34$EL_VAR_, list(FORMULA_ARG1, rtv_formula)), list(FORMULA_ARG1, rtv_formula)), list(list($sym34$EL_VAR_, list(FORMULA_ARG2, rtv_formula)), list(FORMULA_ARG2, rtv_formula)))), list($rtv_isa_constraints$, list(FIND_RTV_ISA_CONSTRAINTS, formula, var)), list($rtv_genls_constraints$, list(FIND_RTV_GENLS_CONSTRAINTS, formula, var))), listS(CLET, $list41, append(body, NIL)));
    }

    public static final SubLObject find_rtv_isa_constraints_alt(SubLObject formula, SubLObject var) {
        {
            SubLObject isa_clauses = list_utilities.tree_find_all_if(ISA_CLAUSE_P, formula, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = isa_clauses;
            SubLObject isa_clause = NIL;
            for (isa_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_clause = cdolist_list_var.first()) {
                if ((NIL == var) || (cycl_utilities.formula_arg1(isa_clause, UNPROVIDED) == var)) {
                    {
                        SubLObject col = cycl_utilities.formula_arg2(isa_clause, UNPROVIDED);
                        if (NIL != forts.fort_p(col)) {
                            result = cons(col, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject find_rtv_isa_constraints(final SubLObject formula, final SubLObject var) {
        final SubLObject isa_clauses = list_utilities.tree_find_all_if(ISA_CLAUSE_P, formula, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = isa_clauses;
        SubLObject isa_clause = NIL;
        isa_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == var) || cycl_utilities.formula_arg1(isa_clause, UNPROVIDED).eql(var)) {
                final SubLObject col = cycl_utilities.formula_arg2(isa_clause, UNPROVIDED);
                if (NIL != forts.fort_p(col)) {
                    result = cons(col, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_clause = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject find_rtv_genls_constraints_alt(SubLObject formula, SubLObject var) {
        {
            SubLObject genls_clauses = list_utilities.tree_find_all_if(GENLS_CLAUSE_P, formula, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = genls_clauses;
            SubLObject genls_clause = NIL;
            for (genls_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genls_clause = cdolist_list_var.first()) {
                if ((NIL == var) || (cycl_utilities.formula_arg1(genls_clause, UNPROVIDED) == var)) {
                    {
                        SubLObject col = cycl_utilities.formula_arg2(genls_clause, UNPROVIDED);
                        if (NIL != forts.fort_p(col)) {
                            result = cons(col, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject find_rtv_genls_constraints(final SubLObject formula, final SubLObject var) {
        final SubLObject genls_clauses = list_utilities.tree_find_all_if(GENLS_CLAUSE_P, formula, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = genls_clauses;
        SubLObject genls_clause = NIL;
        genls_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == var) || cycl_utilities.formula_arg1(genls_clause, UNPROVIDED).eql(var)) {
                final SubLObject col = cycl_utilities.formula_arg2(genls_clause, UNPROVIDED);
                if (NIL != forts.fort_p(col)) {
                    result = cons(col, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genls_clause = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject rtv_clause_p_alt(SubLObject formula) {
        return eq(cycl_utilities.formula_arg0(formula), $$relatedToVia);
    }

    public static SubLObject rtv_clause_p(final SubLObject formula) {
        return eql(cycl_utilities.formula_arg0(formula), $$relatedToVia);
    }

    public static final SubLObject isa_clause_p_alt(SubLObject formula) {
        return eq(cycl_utilities.formula_arg0(formula), $$isa);
    }

    public static SubLObject isa_clause_p(final SubLObject formula) {
        return eql(cycl_utilities.formula_arg0(formula), $$isa);
    }

    public static final SubLObject genls_clause_p_alt(SubLObject formula) {
        return eq(cycl_utilities.formula_arg0(formula), $$genls);
    }

    public static SubLObject genls_clause_p(final SubLObject formula) {
        return eql(cycl_utilities.formula_arg0(formula), $$genls);
    }

    public static final SubLObject rtv_use_type_constraints_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rtv_use_type_constraints_p$.getDynamicValue(thread);
        }
    }

    public static SubLObject rtv_use_type_constraints_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rtv_use_type_constraints_p$.getDynamicValue(thread);
    }

    public static final SubLObject rtv_node_meets_constraints_p_alt(SubLObject v_search, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = T;
                if (NIL != $rtv_isa_constraints$.getDynamicValue(thread)) {
                    if (NIL == isa.isa_anyP(node, $rtv_isa_constraints$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        successP = NIL;
                    }
                }
                if (NIL != $rtv_genls_constraints$.getDynamicValue(thread)) {
                    if (NIL == genls.any_genlP(node, $rtv_genls_constraints$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        successP = NIL;
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject rtv_node_meets_constraints_p(final SubLObject v_search, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = T;
        if ((NIL != $rtv_isa_constraints$.getDynamicValue(thread)) && (NIL == isa.isa_anyP(node, $rtv_isa_constraints$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
            successP = NIL;
        }
        if ((NIL != $rtv_genls_constraints$.getDynamicValue(thread)) && (NIL == genls.any_genlP(node, $rtv_genls_constraints$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
            successP = NIL;
        }
        return successP;
    }

    public static final SubLObject get_rtv_inference_node_constraints_alt() {
        return NIL;
    }

    public static SubLObject get_rtv_inference_node_constraints() {
        return NIL;
    }

    public static final SubLObject rtv_type_litP_alt(SubLObject literal) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.generate_instance_litP(literal)) || (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.generate_spec_litP(literal)));
    }

    public static SubLObject rtv_type_litP(final SubLObject literal) {
        return makeBoolean((NIL != generate_instance_litP(literal)) || (NIL != generate_spec_litP(literal)));
    }

    public static final SubLObject generate_spec_litP_alt(SubLObject literal) {
        return makeBoolean(((NIL != genls_litP(literal)) && (NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, UNPROVIDED))));
    }

    public static SubLObject generate_spec_litP(final SubLObject literal) {
        return makeBoolean(((NIL != genls_litP(literal)) && (NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, UNPROVIDED))));
    }

    public static final SubLObject generate_instance_litP_alt(SubLObject literal) {
        return makeBoolean(((NIL != isa_litP(literal)) && (NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, UNPROVIDED))));
    }

    public static SubLObject generate_instance_litP(final SubLObject literal) {
        return makeBoolean(((NIL != isa_litP(literal)) && (NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, UNPROVIDED)))) && (NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, UNPROVIDED))));
    }

    /**
     *
     *
     * @return listp; the list of nodes accessible to NODE via PRED-SET, within DEPTH distance.
     */
    @LispMethod(comment = "@return listp; the list of nodes accessible to NODE via PRED-SET, within DEPTH distance.")
    public static final SubLObject rtv_closure_alt(SubLObject node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $list_alt53 }), $MT, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $list_alt53 })));
                                        graphl_graph_utilities.reset_graphl_finished();
                                        ghl_search_methods.ghl_search(v_search, node);
                                        result = ghl_search_vars.ghl_result(v_search);
                                        ghl_search_vars.destroy_ghl_search(v_search);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the list of nodes accessible to NODE via PRED-SET, within DEPTH distance.
     */
    @LispMethod(comment = "@return listp; the list of nodes accessible to NODE via PRED-SET, within DEPTH distance.")
    public static SubLObject rtv_closure(final SubLObject node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $list53 }), $MT, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $list53 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the list of nodes accessible to NODE via PRED-SET such that each passes the test TEST-FN, all within DEPTH distance from NODE.  Only result nodes need to pass TEST-FN.  @xref rtv-closure-such-that if you want to prune nodes from search that do not pass TEST-FN
     */
    @LispMethod(comment = "@return listp; the list of nodes accessible to NODE via PRED-SET such that each passes the test TEST-FN, all within DEPTH distance from NODE.  Only result nodes need to pass TEST-FN.  @xref rtv-closure-such-that if you want to prune nodes from search that do not pass TEST-FN")
    public static final SubLObject rtv_closure_filtered_alt(SubLObject node, SubLObject pred_set, SubLObject test_fn, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_if_not(test_fn, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_closure(node, pred_set, depth, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the list of nodes accessible to NODE via PRED-SET such that each passes the test TEST-FN, all within DEPTH distance from NODE.  Only result nodes need to pass TEST-FN.  @xref rtv-closure-such-that if you want to prune nodes from search that do not pass TEST-FN
     */
    @LispMethod(comment = "@return listp; the list of nodes accessible to NODE via PRED-SET such that each passes the test TEST-FN, all within DEPTH distance from NODE.  Only result nodes need to pass TEST-FN.  @xref rtv-closure-such-that if you want to prune nodes from search that do not pass TEST-FN")
    public static SubLObject rtv_closure_filtered(final SubLObject node, final SubLObject pred_set, final SubLObject test_fn, final SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_if_not(test_fn, rtv_closure(node, pred_set, depth, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH distance.
     */
    @LispMethod(comment = "@return booleanp; whether GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH distance.")
    public static final SubLObject rtv_path_p_alt(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject mt_var = getf(list(new SubLObject[]{ $ORDER, $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $GOAL, goal_node }), $MT, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(list(new SubLObject[]{ $ORDER, $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $GOAL, goal_node })));
                                        graphl_graph_utilities.reset_graphl_finished();
                                        ghl_search_methods.ghl_search(v_search, start_node);
                                        result = ghl_search_vars.ghl_result(v_search);
                                        ghl_search_vars.destroy_ghl_search(v_search);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH distance.
     */
    @LispMethod(comment = "@return booleanp; whether GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH distance.")
    public static SubLObject rtv_path_p(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = getf(list(new SubLObject[]{ $ORDER, $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $GOAL, goal_node }), $MT, UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(list(new SubLObject[]{ $ORDER, $DEPTH_FIRST, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $GOAL, goal_node })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; a list of justifying assertions and hl-supports that explain now GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH.
     */
    @LispMethod(comment = "@return listp; a list of justifying assertions and hl-supports that explain now GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH.")
    public static final SubLObject rtv_justify_relation_alt(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                    try {
                        gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                        SubLTrampolineFile.checkType(pred_set, LISTP);
                        {
                            SubLObject _prev_bind_0_3 = $rtv_asent_set_o_preds$.currentBinding(thread);
                            try {
                                $rtv_asent_set_o_preds$.bind(pred_set, thread);
                                {
                                    SubLObject mt_var = getf(list(new SubLObject[]{ $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, T, $kw57$ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node }), $MT, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(list(new SubLObject[]{ $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, T, $kw57$ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node })));
                                                graphl_graph_utilities.reset_graphl_finished();
                                                ghl_search_methods.ghl_search(v_search, start_node);
                                                result = ghl_search_vars.ghl_result(v_search);
                                                ghl_search_vars.destroy_ghl_search(v_search);
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                }
                            } finally {
                                $rtv_asent_set_o_preds$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                    } finally {
                        gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of justifying assertions and hl-supports that explain now GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH.
     */
    @LispMethod(comment = "@return listp; a list of justifying assertions and hl-supports that explain now GOAL-NODE is accessible to START-NODE via PRED-SET within DEPTH.")
    public static SubLObject rtv_justify_relation(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
            assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
            final SubLObject _prev_bind_0_$3 = $rtv_asent_set_o_preds$.currentBinding(thread);
            try {
                $rtv_asent_set_o_preds$.bind(pred_set, thread);
                final SubLObject mt_var = getf(list(new SubLObject[]{ $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, T, $kw57$ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node }), $MT, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(list(new SubLObject[]{ $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, T, $kw57$ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, start_node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                $rtv_asent_set_o_preds$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rtv_justify_relation_union_all(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
            assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
            final SubLObject _prev_bind_0_$5 = $rtv_asent_set_o_preds$.currentBinding(thread);
            try {
                $rtv_asent_set_o_preds$.bind(pred_set, thread);
                final SubLObject mt_var = getf(list(new SubLObject[]{ $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, $ALL, $kw57$ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node }), $MT, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(list(new SubLObject[]{ $ORDER, $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, depth, $JUSTIFY_, $ALL, $kw57$ADD_TO_RESULT_, $EDGES_ON_UNWIND, $GOAL, goal_node })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, start_node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
                }
            } finally {
                $rtv_asent_set_o_preds$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the list of all nodes from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.
     */
    @LispMethod(comment = "@return listp; the list of all nodes from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.")
    public static final SubLObject rtv_all_nodes_from_node_alt(SubLObject node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_closure(node, pred_set, length, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the list of all nodes from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.
     */
    @LispMethod(comment = "@return listp; the list of all nodes from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.")
    public static SubLObject rtv_all_nodes_from_node(final SubLObject node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(rtv_closure(node, pred_set, length, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the list of all ghl-edges from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.
     */
    @LispMethod(comment = "@return listp; the list of all ghl-edges from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.")
    public static final SubLObject rtv_all_edges_from_node_alt(SubLObject node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $list_alt59 }), $MT, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $list_alt59 })));
                                        graphl_graph_utilities.reset_graphl_finished();
                                        ghl_search_methods.ghl_search(v_search, node);
                                        result = ghl_search_vars.ghl_result(v_search);
                                        ghl_search_vars.destroy_ghl_search(v_search);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the list of all ghl-edges from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.
     */
    @LispMethod(comment = "@return listp; the list of all ghl-edges from NODE via PRED-SET, such that no path from NODE is longer than LENGTH.")
    public static SubLObject rtv_all_edges_from_node(final SubLObject node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $list60 }), $MT, UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $list60 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * STUB. @hack - provides sufficient, but nowhere near tight, answer. @return listp; This returns a minimal list of edges such that all nodes in the closure of NODE are accessible.
     */
    @LispMethod(comment = "STUB. @hack - provides sufficient, but nowhere near tight, answer. @return listp; This returns a minimal list of edges such that all nodes in the closure of NODE are accessible.")
    public static final SubLObject rtv_paths_covering_node_closure_alt(SubLObject node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_all_edges_from_node(node, pred_set, length, mt);
    }

    /**
     * STUB. @hack - provides sufficient, but nowhere near tight, answer. @return listp; This returns a minimal list of edges such that all nodes in the closure of NODE are accessible.
     */
    @LispMethod(comment = "STUB. @hack - provides sufficient, but nowhere near tight, answer. @return listp; This returns a minimal list of edges such that all nodes in the closure of NODE are accessible.")
    public static SubLObject rtv_paths_covering_node_closure(final SubLObject node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_all_edges_from_node(node, pred_set, length, mt);
    }

    /**
     *
     *
     * @return listp; a list of ghl-edges connecting START-NODE to GOAL-NODE via PRED-SET, with maximal length of LENGTH. @xref rtv-justify-relation.
     */
    @LispMethod(comment = "@return listp; a list of ghl-edges connecting START-NODE to GOAL-NODE via PRED-SET, with maximal length of LENGTH. @xref rtv-justify-relation.")
    public static final SubLObject rtv_one_path_alt(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_justify_relation(start_node, goal_node, pred_set, length, mt);
    }

    /**
     *
     *
     * @return listp; a list of ghl-edges connecting START-NODE to GOAL-NODE via PRED-SET, with maximal length of LENGTH. @xref rtv-justify-relation.
     */
    @LispMethod(comment = "@return listp; a list of ghl-edges connecting START-NODE to GOAL-NODE via PRED-SET, with maximal length of LENGTH. @xref rtv-justify-relation.")
    public static SubLObject rtv_one_path(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_justify_relation(start_node, goal_node, pred_set, length, mt);
    }

    /**
     *
     *
     * @return listp; the list of all ghl-edges from START-NODE to GOAL-NODE via PRED-SET such that for each node FOO in the edge set, there is some path of length LENGTH from START-NODE to GOAL-NODE passing through FOO.
     */
    @LispMethod(comment = "@return listp; the list of all ghl-edges from START-NODE to GOAL-NODE via PRED-SET such that for each node FOO in the edge set, there is some path of length LENGTH from START-NODE to GOAL-NODE passing through FOO.")
    public static final SubLObject rtv_all_edges_from_node_to_node_alt(SubLObject start_node, SubLObject goal_node, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_node, $list_alt60 }), $MT, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_node, $list_alt60 })));
                                        graphl_graph_utilities.reset_graphl_finished();
                                        ghl_search_methods.ghl_search(v_search, start_node);
                                        result = ghl_search_vars.ghl_result(v_search);
                                        ghl_search_vars.destroy_ghl_search(v_search);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the list of all ghl-edges from START-NODE to GOAL-NODE via PRED-SET such that for each node FOO in the edge set, there is some path of length LENGTH from START-NODE to GOAL-NODE passing through FOO.
     */
    @LispMethod(comment = "@return listp; the list of all ghl-edges from START-NODE to GOAL-NODE via PRED-SET such that for each node FOO in the edge set, there is some path of length LENGTH from START-NODE to GOAL-NODE passing through FOO.")
    public static SubLObject rtv_all_edges_from_node_to_node(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_node, $list61 }), $MT, UNPROVIDED);
            final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_node, $list61 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rtv_all_edges_from_node_to_node_expanded(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject exemplars = rtv_all_edges_from_node_to_node(start_node, goal_node, pred_set, length, mt);
        return rtv_add_alternate_edges_to_exemplars(exemplars, pred_set, mt);
    }

    public static SubLObject rtv_add_alternate_edges_to_exemplars(final SubLObject exemplars, final SubLObject pred_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject included_set = set_utilities.make_set_from_list(exemplars, UNPROVIDED);
        SubLObject alternates = NIL;
        SubLObject cdolist_list_var = exemplars;
        SubLObject exemplar = NIL;
        exemplar = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node_1 = assertions_high.gaf_arg1(exemplar);
            final SubLObject node_2 = assertions_high.gaf_arg2(exemplar);
            SubLObject cdolist_list_var_$9 = pred_set;
            SubLObject pred = NIL;
            pred = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                SubLObject cdolist_list_var_$10;
                final SubLObject candidates = cdolist_list_var_$10 = rtv_all_edges_from_node_to_node(node_1, node_2, list(pred), ONE_INTEGER, mt);
                SubLObject candidate = NIL;
                candidate = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    if (NIL == set.set_memberP(candidate, included_set)) {
                        set.set_add(candidate, included_set);
                        alternates = cons(candidate, alternates);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    candidate = cdolist_list_var_$10.first();
                } 
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                pred = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            exemplar = cdolist_list_var.first();
        } 
        final SubLObject expanded = nconc(exemplars, nreverse(alternates));
        return expanded;
    }

    /**
     *
     *
     * @return listp; the list of ghl-edges from START-NODE to GOAL-NODES.
     */
    @LispMethod(comment = "@return listp; the list of ghl-edges from START-NODE to GOAL-NODES.")
    public static final SubLObject rtv_all_edges_from_node_to_nodes_alt(SubLObject start_node, SubLObject goal_nodes, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_nodes, $list_alt60 }), $MT, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_7 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_nodes, $list_alt60 })));
                                        graphl_graph_utilities.reset_graphl_finished();
                                        ghl_search_methods.ghl_search(v_search, start_node);
                                        result = ghl_search_vars.ghl_result(v_search);
                                        ghl_search_vars.destroy_ghl_search(v_search);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the list of ghl-edges from START-NODE to GOAL-NODES.
     */
    @LispMethod(comment = "@return listp; the list of ghl-edges from START-NODE to GOAL-NODES.")
    public static SubLObject rtv_all_edges_from_node_to_nodes(final SubLObject start_node, final SubLObject goal_nodes, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_nodes, $list61 }), $MT, UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $CUTOFF, length, $GOAL, goal_nodes, $list61 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$11, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rtv_all_edges_from_node_to_nodes_expanded(final SubLObject start_node, final SubLObject goal_nodes, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject exemplars = rtv_all_edges_from_node_to_nodes(start_node, goal_nodes, pred_set, length, mt);
        return rtv_add_alternate_edges_to_exemplars(exemplars, pred_set, mt);
    }

    /**
     *
     *
     * @return listp; the list of ghl-edges from NODE to nodes satisfying TEST-FN via PRED-SET within LENGTH distance away.
     */
    @LispMethod(comment = "@return listp; the list of ghl-edges from NODE to nodes satisfying TEST-FN via PRED-SET within LENGTH distance away.")
    public static final SubLObject rtv_all_edges_from_node_to_nodes_satisfying_alt(SubLObject node, SubLObject test_formula, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject rtv_formula = find_if(RTV_CLAUSE_P, test_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject var = (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) ? ((SubLObject) (cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) : NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED)) ? ((SubLObject) (cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED))) : NIL;
                            {
                                SubLObject _prev_bind_0_8 = $rtv_isa_constraints$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $rtv_genls_constraints$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $rtv_use_type_constraints_p$.currentBinding(thread);
                                try {
                                    $rtv_isa_constraints$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.find_rtv_isa_constraints(test_formula, var), thread);
                                    $rtv_genls_constraints$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.find_rtv_genls_constraints(test_formula, var), thread);
                                    $rtv_use_type_constraints_p$.bind(makeBoolean((NIL != $rtv_isa_constraints$.getDynamicValue(thread)) || (NIL != $rtv_genls_constraints$.getDynamicValue(thread))), thread);
                                    {
                                        SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $list_alt64 }), $MT, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_9 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1_10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2_11 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                {
                                                    SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $list_alt64 })));
                                                    graphl_graph_utilities.reset_graphl_finished();
                                                    ghl_search_methods.ghl_search(v_search, node);
                                                    result = ghl_search_vars.ghl_result(v_search);
                                                    ghl_search_vars.destroy_ghl_search(v_search);
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_11, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_10, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $rtv_use_type_constraints_p$.rebind(_prev_bind_2, thread);
                                    $rtv_genls_constraints$.rebind(_prev_bind_1, thread);
                                    $rtv_isa_constraints$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the list of ghl-edges from NODE to nodes satisfying TEST-FN via PRED-SET within LENGTH distance away.
     */
    @LispMethod(comment = "@return listp; the list of ghl-edges from NODE to nodes satisfying TEST-FN via PRED-SET within LENGTH distance away.")
    public static SubLObject rtv_all_edges_from_node_to_nodes_satisfying(final SubLObject node, final SubLObject test_formula, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject rtv_formula = find_if(RTV_CLAUSE_P, test_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject var = (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED) : NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED)) ? cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED) : NIL;
            final SubLObject _prev_bind_0_$12 = $rtv_isa_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $rtv_genls_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $rtv_use_type_constraints_p$.currentBinding(thread);
            try {
                $rtv_isa_constraints$.bind(find_rtv_isa_constraints(test_formula, var), thread);
                $rtv_genls_constraints$.bind(find_rtv_genls_constraints(test_formula, var), thread);
                $rtv_use_type_constraints_p$.bind(makeBoolean((NIL != $rtv_isa_constraints$.getDynamicValue(thread)) || (NIL != $rtv_genls_constraints$.getDynamicValue(thread))), thread);
                final SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $list65 }), $MT, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$15 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $list65 })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$15, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$14, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                }
            } finally {
                $rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
                $rtv_genls_constraints$.rebind(_prev_bind_2, thread);
                $rtv_isa_constraints$.rebind(_prev_bind_0_$12, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rtv_all_edges_from_node_to_goal_nodes_satisfying_alt(SubLObject node, SubLObject goal_nodes, SubLObject test_formula, SubLObject pred_set, SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(pred_set, LISTP);
                {
                    SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    try {
                        $rtv_asent_set_o_preds$.bind(pred_set, thread);
                        {
                            SubLObject rtv_formula = find_if(RTV_CLAUSE_P, test_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject var = (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) ? ((SubLObject) (cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) : NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED)) ? ((SubLObject) (cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED))) : NIL;
                            {
                                SubLObject _prev_bind_0_12 = $rtv_isa_constraints$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $rtv_genls_constraints$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $rtv_use_type_constraints_p$.currentBinding(thread);
                                try {
                                    $rtv_isa_constraints$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.find_rtv_isa_constraints(test_formula, var), thread);
                                    $rtv_genls_constraints$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.find_rtv_genls_constraints(test_formula, var), thread);
                                    $rtv_use_type_constraints_p$.bind(makeBoolean((NIL != $rtv_isa_constraints$.getDynamicValue(thread)) || (NIL != $rtv_genls_constraints$.getDynamicValue(thread))), thread);
                                    {
                                        SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $GOAL, goal_nodes, $list_alt64 }), $MT, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1_14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2_15 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                {
                                                    SubLObject v_search = ghl_search_vars.new_ghl_search(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $GOAL, goal_nodes, $list_alt64 })));
                                                    graphl_graph_utilities.reset_graphl_finished();
                                                    ghl_search_methods.ghl_search(v_search, node);
                                                    result = ghl_search_vars.ghl_result(v_search);
                                                    ghl_search_vars.destroy_ghl_search(v_search);
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_15, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_14, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $rtv_use_type_constraints_p$.rebind(_prev_bind_2, thread);
                                    $rtv_genls_constraints$.rebind(_prev_bind_1, thread);
                                    $rtv_isa_constraints$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rtv_all_edges_from_node_to_goal_nodes_satisfying(final SubLObject node, final SubLObject goal_nodes, final SubLObject test_formula, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        assert NIL != listp(pred_set) : "! listp(pred_set) " + ("Types.listp(pred_set) " + "CommonSymbols.NIL != Types.listp(pred_set) ") + pred_set;
        final SubLObject _prev_bind_0 = $rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            $rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject rtv_formula = find_if(RTV_CLAUSE_P, test_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject var = (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_formula, UNPROVIDED) : NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED)) ? cycl_utilities.formula_arg2(rtv_formula, UNPROVIDED) : NIL;
            final SubLObject _prev_bind_0_$16 = $rtv_isa_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $rtv_genls_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $rtv_use_type_constraints_p$.currentBinding(thread);
            try {
                $rtv_isa_constraints$.bind(find_rtv_isa_constraints(test_formula, var), thread);
                $rtv_genls_constraints$.bind(find_rtv_genls_constraints(test_formula, var), thread);
                $rtv_use_type_constraints_p$.bind(makeBoolean((NIL != $rtv_isa_constraints$.getDynamicValue(thread)) || (NIL != $rtv_genls_constraints$.getDynamicValue(thread))), thread);
                final SubLObject mt_var = getf(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $GOAL, goal_nodes, $list65 }), $MT, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$19 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties(listS($ORDER, new SubLObject[]{ $ITERATIVE_DEEPENING, $MT, mt, $PREDICATES, pred_set, $GOAL_FN, RTV_NODE_MEETS_CONSTRAINTS_P, $CUTOFF, length, $GOAL, goal_nodes, $list65 })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$19, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$18, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                $rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
                $rtv_genls_constraints$.rebind(_prev_bind_2, thread);
                $rtv_isa_constraints$.rebind(_prev_bind_0_$16, thread);
            }
        } finally {
            $rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the list of ghl-edges subordinate to PREDS via #$genlPreds and #$genlInverse
     */
    @LispMethod(comment = "@return listp; the list of ghl-edges subordinate to PREDS via #$genlPreds and #$genlInverse")
    public static final SubLObject all_edges_subsumed_by_preds_alt(SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                        try {
                            sbhl_search_methods.sbhl_union_simply_all_backward_true_edges(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, UNPROVIDED);
                        } finally {
                            {
                                SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_behavior$.bind($ASSERTION, thread);
                        just = sbhl_search_utilities.sbhl_assemble_justification(just, UNPROVIDED);
                    } finally {
                        sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0, thread);
                    }
                }
                return just;
            }
        }
    }

    /**
     *
     *
     * @return listp; the list of ghl-edges subordinate to PREDS via #$genlPreds and #$genlInverse
     */
    @LispMethod(comment = "@return listp; the list of ghl-edges subordinate to PREDS via #$genlPreds and #$genlInverse")
    public static SubLObject all_edges_subsumed_by_preds(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
            try {
                sbhl_search_methods.sbhl_union_simply_all_backward_true_edges(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_behavior$.bind($ASSERTION, thread);
            just = sbhl_search_utilities.sbhl_assemble_justification(just, UNPROVIDED);
        } finally {
            sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    /**
     *
     *
     * @return booleanp. whether ASENT can be proven with RTV reasoning.
     */
    @LispMethod(comment = "@return booleanp. whether ASENT can be proven with RTV reasoning.")
    public static final SubLObject inference_rtv_check_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rtv_asent_pred$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rtv_term_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $rtv_var_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $rtv_depth_cutoff$.currentBinding(thread);
                    try {
                        $rtv_asent$.bind(asent, thread);
                        $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                        $rtv_term_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_term_argnums(asent), thread);
                        $rtv_var_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_var_argnums(asent), thread);
                        $rtv_asent_set_o_preds$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_asent_preds(asent), thread);
                        $rtv_depth_cutoff$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_depth_cutoff(asent), thread);
                        result = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_path_p(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_initial_node(asent), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_goal(asent), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_pred_set(), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_depth_cutoff(), mt);
                    } finally {
                        $rtv_depth_cutoff$.rebind(_prev_bind_5, thread);
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_4, thread);
                        $rtv_var_argnums$.rebind(_prev_bind_3, thread);
                        $rtv_term_argnums$.rebind(_prev_bind_2, thread);
                        $rtv_asent_pred$.rebind(_prev_bind_1, thread);
                        $rtv_asent$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp. whether ASENT can be proven with RTV reasoning.
     */
    @LispMethod(comment = "@return booleanp. whether ASENT can be proven with RTV reasoning.")
    public static SubLObject inference_rtv_check(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            result = rtv_path_p(determine_rtv_initial_node(asent), determine_rtv_goal(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            $rtv_var_argnums$.rebind(_prev_bind_4, thread);
            $rtv_term_argnums$.rebind(_prev_bind_3, thread);
            $rtv_asent_pred$.rebind(_prev_bind_2, thread);
            $rtv_asent$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp. the list of bindings for the vars in ASENT as reasoned by RTV module.
     */
    @LispMethod(comment = "@return listp. the list of bindings for the vars in ASENT as reasoned by RTV module.")
    public static final SubLObject inference_rtv_unify_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rtv_asent_pred$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rtv_term_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $rtv_var_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $rtv_depth_cutoff$.currentBinding(thread);
                    try {
                        $rtv_asent$.bind(asent, thread);
                        $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                        $rtv_term_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_term_argnums(asent), thread);
                        $rtv_var_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_var_argnums(asent), thread);
                        $rtv_asent_set_o_preds$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_asent_preds(asent), thread);
                        $rtv_depth_cutoff$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_depth_cutoff(asent), thread);
                        result = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_closure(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_initial_node(asent), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_pred_set(), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_depth_cutoff(), mt);
                    } finally {
                        $rtv_depth_cutoff$.rebind(_prev_bind_5, thread);
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_4, thread);
                        $rtv_var_argnums$.rebind(_prev_bind_3, thread);
                        $rtv_term_argnums$.rebind(_prev_bind_2, thread);
                        $rtv_asent_pred$.rebind(_prev_bind_1, thread);
                        $rtv_asent$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp. the list of bindings for the vars in ASENT as reasoned by RTV module.
     */
    @LispMethod(comment = "@return listp. the list of bindings for the vars in ASENT as reasoned by RTV module.")
    public static SubLObject inference_rtv_unify(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            result = rtv_closure(determine_rtv_initial_node(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            $rtv_var_argnums$.rebind(_prev_bind_4, thread);
            $rtv_term_argnums$.rebind(_prev_bind_3, thread);
            $rtv_asent_pred$.rebind(_prev_bind_2, thread);
            $rtv_asent$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp. a list of justification steps.
     */
    @LispMethod(comment = "@return listp. a list of justification steps.")
    public static final SubLObject inference_rtv_justify_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                {
                    SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rtv_asent_pred$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rtv_term_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $rtv_var_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $rtv_depth_cutoff$.currentBinding(thread);
                    try {
                        $rtv_asent$.bind(asent, thread);
                        $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                        $rtv_term_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_term_argnums(asent), thread);
                        $rtv_var_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_var_argnums(asent), thread);
                        $rtv_asent_set_o_preds$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_asent_preds(asent), thread);
                        $rtv_depth_cutoff$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_depth_cutoff(asent), thread);
                        just = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_justify_relation(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_initial_node(asent), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_goal(asent), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_pred_set(), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_depth_cutoff(), mt);
                    } finally {
                        $rtv_depth_cutoff$.rebind(_prev_bind_5, thread);
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_4, thread);
                        $rtv_var_argnums$.rebind(_prev_bind_3, thread);
                        $rtv_term_argnums$.rebind(_prev_bind_2, thread);
                        $rtv_asent_pred$.rebind(_prev_bind_1, thread);
                        $rtv_asent$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != just) {
                    just = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_add_genl_predicate_justs(just, asent, mt);
                }
                return just;
            }
        }
    }

    /**
     *
     *
     * @return listp. a list of justification steps.
     */
    @LispMethod(comment = "@return listp. a list of justification steps.")
    public static SubLObject inference_rtv_justify(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = $rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            just = rtv_justify_relation(determine_rtv_initial_node(asent), determine_rtv_goal(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            $rtv_var_argnums$.rebind(_prev_bind_4, thread);
            $rtv_term_argnums$.rebind(_prev_bind_3, thread);
            $rtv_asent_pred$.rebind(_prev_bind_2, thread);
            $rtv_asent$.rebind(_prev_bind_0, thread);
        }
        if (NIL != just) {
            just = rtv_add_genl_predicate_justs(just, asent, mt);
        }
        return just;
    }

    public static final SubLObject inference_rtv_max_floor_mts_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(Mapping.mapcan(symbol_function(FIRST), forward.compute_all_mt_and_support_combinations(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.inference_rtv_justify(asent, mt)), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_rtv_max_floor_mts(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.fast_delete_duplicates(Mapping.mapcan(symbol_function(FIRST), forward.compute_all_mt_and_support_combinations(inference_rtv_justify(asent, mt), UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rtv_add_genl_predicate_justs_alt(SubLObject just, SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = just;
                SubLObject justified = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $rtv_asent$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $rtv_asent_pred$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $rtv_term_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_6 = $rtv_var_argnums$.currentBinding(thread);
                    SubLObject _prev_bind_7 = $rtv_asent_set_o_preds$.currentBinding(thread);
                    SubLObject _prev_bind_8 = $rtv_depth_cutoff$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        $rtv_asent$.bind(asent, thread);
                        $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                        $rtv_term_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_term_argnums(asent), thread);
                        $rtv_var_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_var_argnums(asent), thread);
                        $rtv_asent_set_o_preds$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_asent_preds(asent), thread);
                        $rtv_depth_cutoff$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_depth_cutoff(asent), thread);
                        {
                            SubLObject cdolist_list_var = just;
                            SubLObject just_ass = NIL;
                            for (just_ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just_ass = cdolist_list_var.first()) {
                                if (NIL != gaf_assertionP(just_ass)) {
                                    {
                                        SubLObject just_pred = gaf_arg0(just_ass);
                                        if (!((NIL != subl_promotions.memberP(just_pred, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_pred_set(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(just_pred, justified, UNPROVIDED, UNPROVIDED)))) {
                                            {
                                                SubLObject formula = NIL;
                                                if (NIL == formula) {
                                                    {
                                                        SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_pred_set();
                                                        SubLObject rtv_pred = NIL;
                                                        for (rtv_pred = csome_list_var.first(); !((NIL != formula) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rtv_pred = csome_list_var.first()) {
                                                            if (NIL != genl_predicates.genl_predicateP(just_pred, rtv_pred, UNPROVIDED, UNPROVIDED)) {
                                                                formula = list($$genlPreds, just_pred, rtv_pred);
                                                            } else {
                                                                if (NIL != genl_predicates.genl_inverseP(just_pred, rtv_pred, UNPROVIDED, UNPROVIDED)) {
                                                                    formula = list($$genlInverse, just_pred, rtv_pred);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL != formula) {
                                                    justified = cons(just_pred, justified);
                                                    result = append(result, list(arguments.make_hl_support($GENLPREDS, formula, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED)));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $rtv_depth_cutoff$.rebind(_prev_bind_8, thread);
                        $rtv_asent_set_o_preds$.rebind(_prev_bind_7, thread);
                        $rtv_var_argnums$.rebind(_prev_bind_6, thread);
                        $rtv_term_argnums$.rebind(_prev_bind_5, thread);
                        $rtv_asent_pred$.rebind(_prev_bind_4, thread);
                        $rtv_asent$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rtv_add_genl_predicate_justs(final SubLObject just, final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = just;
        SubLObject justified = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $rtv_depth_cutoff$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            $rtv_asent$.bind(asent, thread);
            $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            SubLObject cdolist_list_var = just;
            SubLObject just_ass = NIL;
            just_ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertions_high.gaf_assertionP(just_ass)) {
                    final SubLObject just_pred = assertions_high.gaf_arg0(just_ass);
                    if ((NIL == subl_promotions.memberP(just_pred, get_rtv_pred_set(), UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(just_pred, justified, UNPROVIDED, UNPROVIDED))) {
                        SubLObject formula = NIL;
                        if (NIL == formula) {
                            SubLObject csome_list_var = get_rtv_pred_set();
                            SubLObject rtv_pred = NIL;
                            rtv_pred = csome_list_var.first();
                            while ((NIL == formula) && (NIL != csome_list_var)) {
                                if (NIL != genl_predicates.genl_predicateP(just_pred, rtv_pred, UNPROVIDED, UNPROVIDED)) {
                                    formula = list($$genlPreds, just_pred, rtv_pred);
                                } else
                                    if (NIL != genl_predicates.genl_inverseP(just_pred, rtv_pred, UNPROVIDED, UNPROVIDED)) {
                                        formula = list($$genlInverse, just_pred, rtv_pred);
                                    }

                                csome_list_var = csome_list_var.rest();
                                rtv_pred = csome_list_var.first();
                            } 
                        }
                        if (NIL != formula) {
                            justified = cons(just_pred, justified);
                            result = append(result, list(arguments.make_hl_support($GENLPREDS, formula, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED)));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                just_ass = cdolist_list_var.first();
            } 
        } finally {
            $rtv_depth_cutoff$.rebind(_prev_bind_9, thread);
            $rtv_asent_set_o_preds$.rebind(_prev_bind_8, thread);
            $rtv_var_argnums$.rebind(_prev_bind_7, thread);
            $rtv_term_argnums$.rebind(_prev_bind_6, thread);
            $rtv_asent_pred$.rebind(_prev_bind_5, thread);
            $rtv_asent$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject removal_rtv_required_alt(SubLObject asent) {
        {
            SubLObject datum = asent;
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            SubLObject sop = NIL;
            SubLObject num = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt70);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt70);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt70);
            arg2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt70);
            sop = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt70);
            num = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == subl_promotions.non_negative_integer_p(num)) {
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt70);
            }
        }
        return T;
    }

    public static SubLObject removal_rtv_required(final SubLObject asent) {
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject sop = NIL;
        SubLObject num = NIL;
        destructuring_bind_must_consp(asent, asent, $list71);
        pred = asent.first();
        SubLObject current = asent.rest();
        destructuring_bind_must_consp(current, asent, $list71);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, asent, $list71);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, asent, $list71);
        sop = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, asent, $list71);
        num = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == subl_promotions.non_negative_integer_p(num)) {
                return NIL;
            }
        } else {
            cdestructuring_bind_error(asent, $list71);
        }
        return T;
    }

    public static final SubLObject make_rtv_support_alt(SubLObject asent) {
        return arguments.make_hl_support($RTV, asent, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_rtv_support(final SubLObject asent) {
        return arguments.make_hl_support($RTV, asent, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_rtv_check_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.removal_rtv_required(asent);
    }

    public static SubLObject removal_rtv_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_rtv_required(asent);
    }

    public static final SubLObject removal_rtv_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.inference_rtv_check(asent, UNPROVIDED)) {
            {
                SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.make_rtv_support(asent);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_rtv_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != inference_rtv_check(asent, UNPROVIDED)) {
            final SubLObject hl_support = make_rtv_support(asent);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_rtv_generate_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.removal_rtv_required(asent);
    }

    public static SubLObject removal_rtv_generate_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_rtv_required(asent);
    }

    public static final SubLObject removal_rtv_generate_iterator_alt(SubLObject asent) {
        {
            SubLObject constraints = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_inference_node_constraints();
            SubLObject unified_terms = NIL;
            if (NIL != constraints) {
                unified_terms = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.inference_rtv_constrained_unify(asent, constraints);
            } else {
                unified_terms = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.inference_rtv_unify(asent, UNPROVIDED);
            }
            return iteration.new_list_iterator(unified_terms);
        }
    }

    public static SubLObject removal_rtv_generate_iterator(final SubLObject asent) {
        final SubLObject constraints = get_rtv_inference_node_constraints();
        SubLObject unified_terms = NIL;
        if (NIL != constraints) {
            unified_terms = inference_rtv_constrained_unify(asent, constraints);
        } else {
            unified_terms = inference_rtv_unify(asent, UNPROVIDED);
        }
        return iteration.new_list_iterator(unified_terms);
    }

    public static final SubLObject inference_rtv_constrained_unify_alt(SubLObject asent, SubLObject constraints) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rtv_isa_constraints$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rtv_genls_constraints$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rtv_use_type_constraints_p$.currentBinding(thread);
                    try {
                        $rtv_isa_constraints$.bind(NIL, thread);
                        $rtv_genls_constraints$.bind(NIL, thread);
                        $rtv_use_type_constraints_p$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = constraints;
                            SubLObject constraint = NIL;
                            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                {
                                    SubLObject pred = cycl_utilities.formula_arg0(constraint);
                                    SubLObject col = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
                                    SubLObject pcase_var = pred;
                                    if (pcase_var.eql($$isa)) {
                                        $rtv_isa_constraints$.setDynamicValue(cons(col, $rtv_isa_constraints$.getDynamicValue(thread)), thread);
                                    } else {
                                        if (pcase_var.eql($$genls)) {
                                            $rtv_genls_constraints$.setDynamicValue(cons(col, $rtv_genls_constraints$.getDynamicValue(thread)), thread);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject _prev_bind_0_17 = $rtv_asent$.currentBinding(thread);
                                SubLObject _prev_bind_1_18 = $rtv_asent_pred$.currentBinding(thread);
                                SubLObject _prev_bind_2_19 = $rtv_term_argnums$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $rtv_var_argnums$.currentBinding(thread);
                                SubLObject _prev_bind_4 = $rtv_asent_set_o_preds$.currentBinding(thread);
                                SubLObject _prev_bind_5 = $rtv_depth_cutoff$.currentBinding(thread);
                                try {
                                    $rtv_asent$.bind(asent, thread);
                                    $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                                    $rtv_term_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_term_argnums(asent), thread);
                                    $rtv_var_argnums$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_var_argnums(asent), thread);
                                    $rtv_asent_set_o_preds$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_asent_preds(asent), thread);
                                    $rtv_depth_cutoff$.bind(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_depth_cutoff(asent), thread);
                                    result = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.rtv_closure_filtered(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.determine_rtv_initial_node(asent), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_pred_set(), RTV_NODE_MEETS_CONSTRAINTS_P, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv.get_rtv_depth_cutoff(), UNPROVIDED);
                                } finally {
                                    $rtv_depth_cutoff$.rebind(_prev_bind_5, thread);
                                    $rtv_asent_set_o_preds$.rebind(_prev_bind_4, thread);
                                    $rtv_var_argnums$.rebind(_prev_bind_3, thread);
                                    $rtv_term_argnums$.rebind(_prev_bind_2_19, thread);
                                    $rtv_asent_pred$.rebind(_prev_bind_1_18, thread);
                                    $rtv_asent$.rebind(_prev_bind_0_17, thread);
                                }
                            }
                        }
                    } finally {
                        $rtv_use_type_constraints_p$.rebind(_prev_bind_2, thread);
                        $rtv_genls_constraints$.rebind(_prev_bind_1, thread);
                        $rtv_isa_constraints$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject inference_rtv_constrained_unify(final SubLObject asent, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rtv_isa_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rtv_genls_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rtv_use_type_constraints_p$.currentBinding(thread);
        try {
            $rtv_isa_constraints$.bind(NIL, thread);
            $rtv_genls_constraints$.bind(NIL, thread);
            $rtv_use_type_constraints_p$.bind(T, thread);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred = cycl_utilities.formula_arg0(constraint);
                final SubLObject col = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
                final SubLObject pcase_var = pred;
                if (pcase_var.eql($$isa)) {
                    $rtv_isa_constraints$.setDynamicValue(cons(col, $rtv_isa_constraints$.getDynamicValue(thread)), thread);
                } else
                    if (pcase_var.eql($$genls)) {
                        $rtv_genls_constraints$.setDynamicValue(cons(col, $rtv_genls_constraints$.getDynamicValue(thread)), thread);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            final SubLObject _prev_bind_0_$21 = $rtv_asent$.currentBinding(thread);
            final SubLObject _prev_bind_1_$22 = $rtv_asent_pred$.currentBinding(thread);
            final SubLObject _prev_bind_2_$23 = $rtv_term_argnums$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $rtv_var_argnums$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $rtv_asent_set_o_preds$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $rtv_depth_cutoff$.currentBinding(thread);
            try {
                $rtv_asent$.bind(asent, thread);
                $rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                $rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
                $rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
                $rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
                $rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
                result = rtv_closure_filtered(determine_rtv_initial_node(asent), get_rtv_pred_set(), RTV_NODE_MEETS_CONSTRAINTS_P, get_rtv_depth_cutoff(), UNPROVIDED);
            } finally {
                $rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
                $rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
                $rtv_var_argnums$.rebind(_prev_bind_4, thread);
                $rtv_term_argnums$.rebind(_prev_bind_2_$23, thread);
                $rtv_asent_pred$.rebind(_prev_bind_1_$22, thread);
                $rtv_asent$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            $rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
            $rtv_genls_constraints$.rebind(_prev_bind_2, thread);
            $rtv_isa_constraints$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject declare_removal_modules_rtv_file() {
        declareMacro("with_rtv_asent_set_o_preds", "WITH-RTV-ASENT-SET-O-PREDS");
        declareFunction("get_rtv_pred_set", "GET-RTV-PRED-SET", 0, 0, false);
        declareFunction("get_rtv_depth_cutoff", "GET-RTV-DEPTH-CUTOFF", 0, 0, false);
        declareMacro("with_rtv_depth_cutoff", "WITH-RTV-DEPTH-CUTOFF");
        declareFunction("determine_rtv_term_argnums", "DETERMINE-RTV-TERM-ARGNUMS", 1, 0, false);
        declareFunction("determine_rtv_var_argnums", "DETERMINE-RTV-VAR-ARGNUMS", 1, 0, false);
        declareFunction("get_rtv_var_arg", "GET-RTV-VAR-ARG", 1, 0, false);
        declareFunction("determine_rtv_asent_preds", "DETERMINE-RTV-ASENT-PREDS", 1, 0, false);
        declareFunction("determine_rtv_depth_cutoff", "DETERMINE-RTV-DEPTH-CUTOFF", 1, 0, false);
        declareFunction("determine_rtv_initial_node", "DETERMINE-RTV-INITIAL-NODE", 1, 0, false);
        declareFunction("determine_rtv_goal", "DETERMINE-RTV-GOAL", 1, 0, false);
        declareMacro("bind_rtv_asent", "BIND-RTV-ASENT");
        declareFunction("add_rtv_default_search_properties", "ADD-RTV-DEFAULT-SEARCH-PROPERTIES", 1, 0, false);
        declareMacro("with_rtv_search_initialized", "WITH-RTV-SEARCH-INITIALIZED");
        declareMacro("with_new_rtv_type_constraints", "WITH-NEW-RTV-TYPE-CONSTRAINTS");
        declareMacro("with_rtv_constraints_from_formula", "WITH-RTV-CONSTRAINTS-FROM-FORMULA");
        declareFunction("find_rtv_isa_constraints", "FIND-RTV-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("find_rtv_genls_constraints", "FIND-RTV-GENLS-CONSTRAINTS", 2, 0, false);
        declareFunction("rtv_clause_p", "RTV-CLAUSE-P", 1, 0, false);
        declareFunction("isa_clause_p", "ISA-CLAUSE-P", 1, 0, false);
        declareFunction("genls_clause_p", "GENLS-CLAUSE-P", 1, 0, false);
        declareFunction("rtv_use_type_constraints_p", "RTV-USE-TYPE-CONSTRAINTS-P", 0, 0, false);
        declareFunction("rtv_node_meets_constraints_p", "RTV-NODE-MEETS-CONSTRAINTS-P", 2, 0, false);
        declareFunction("get_rtv_inference_node_constraints", "GET-RTV-INFERENCE-NODE-CONSTRAINTS", 0, 0, false);
        declareFunction("rtv_type_litP", "RTV-TYPE-LIT?", 1, 0, false);
        declareFunction("generate_spec_litP", "GENERATE-SPEC-LIT?", 1, 0, false);
        declareFunction("generate_instance_litP", "GENERATE-INSTANCE-LIT?", 1, 0, false);
        declareFunction("rtv_closure", "RTV-CLOSURE", 3, 1, false);
        declareFunction("rtv_closure_filtered", "RTV-CLOSURE-FILTERED", 4, 1, false);
        declareFunction("rtv_path_p", "RTV-PATH-P", 4, 1, false);
        declareFunction("rtv_justify_relation", "RTV-JUSTIFY-RELATION", 4, 1, false);
        declareFunction("rtv_justify_relation_union_all", "RTV-JUSTIFY-RELATION-UNION-ALL", 4, 1, false);
        declareFunction("rtv_all_nodes_from_node", "RTV-ALL-NODES-FROM-NODE", 3, 1, false);
        declareFunction("rtv_all_edges_from_node", "RTV-ALL-EDGES-FROM-NODE", 3, 1, false);
        declareFunction("rtv_paths_covering_node_closure", "RTV-PATHS-COVERING-NODE-CLOSURE", 3, 1, false);
        declareFunction("rtv_one_path", "RTV-ONE-PATH", 4, 1, false);
        declareFunction("rtv_all_edges_from_node_to_node", "RTV-ALL-EDGES-FROM-NODE-TO-NODE", 4, 1, false);
        declareFunction("rtv_all_edges_from_node_to_node_expanded", "RTV-ALL-EDGES-FROM-NODE-TO-NODE-EXPANDED", 4, 1, false);
        declareFunction("rtv_add_alternate_edges_to_exemplars", "RTV-ADD-ALTERNATE-EDGES-TO-EXEMPLARS", 2, 1, false);
        declareFunction("rtv_all_edges_from_node_to_nodes", "RTV-ALL-EDGES-FROM-NODE-TO-NODES", 4, 1, false);
        declareFunction("rtv_all_edges_from_node_to_nodes_expanded", "RTV-ALL-EDGES-FROM-NODE-TO-NODES-EXPANDED", 4, 1, false);
        declareFunction("rtv_all_edges_from_node_to_nodes_satisfying", "RTV-ALL-EDGES-FROM-NODE-TO-NODES-SATISFYING", 4, 1, false);
        declareFunction("rtv_all_edges_from_node_to_goal_nodes_satisfying", "RTV-ALL-EDGES-FROM-NODE-TO-GOAL-NODES-SATISFYING", 5, 1, false);
        declareFunction("all_edges_subsumed_by_preds", "ALL-EDGES-SUBSUMED-BY-PREDS", 1, 1, false);
        declareFunction("inference_rtv_check", "INFERENCE-RTV-CHECK", 1, 1, false);
        declareFunction("inference_rtv_unify", "INFERENCE-RTV-UNIFY", 1, 1, false);
        declareFunction("inference_rtv_justify", "INFERENCE-RTV-JUSTIFY", 1, 1, false);
        declareFunction("inference_rtv_max_floor_mts", "INFERENCE-RTV-MAX-FLOOR-MTS", 1, 1, false);
        declareFunction("rtv_add_genl_predicate_justs", "RTV-ADD-GENL-PREDICATE-JUSTS", 2, 1, false);
        declareFunction("removal_rtv_required", "REMOVAL-RTV-REQUIRED", 1, 0, false);
        declareFunction("make_rtv_support", "MAKE-RTV-SUPPORT", 1, 0, false);
        declareFunction("removal_rtv_check_required", "REMOVAL-RTV-CHECK-REQUIRED", 1, 1, false);
        declareFunction("removal_rtv_check_expand", "REMOVAL-RTV-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_rtv_generate_required", "REMOVAL-RTV-GENERATE-REQUIRED", 1, 1, false);
        declareFunction("removal_rtv_generate_iterator", "REMOVAL-RTV-GENERATE-ITERATOR", 1, 0, false);
        declareFunction("inference_rtv_constrained_unify", "INFERENCE-RTV-CONSTRAINED-UNIFY", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rtv_file() {
        defparameter("*RTV-ASENT*", NIL);
        defparameter("*RTV-ASENT-PRED*", NIL);
        defparameter("*RTV-TERM-ARGNUMS*", NIL);
        defparameter("*RTV-VAR-ARGNUMS*", NIL);
        defparameter("*RTV-ASENT-SET-O-PREDS*", NIL);
        defparameter("*RTV-DEPTH-CUTOFF*", NIL);
        deflexical("*RTV-DEFAULT-SEARCH-PLIST*", $list20);
        defparameter("*RTV-ISA-CONSTRAINTS*", NIL);
        defparameter("*RTV-GENLS-CONSTRAINTS*", NIL);
        defparameter("*RTV-USE-TYPE-CONSTRAINTS-P*", NIL);
        deflexical("*DEFAULT-RTV-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("PREDS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeSymbol("LISTP"));

    static private final SubLList $list_alt6 = list(makeSymbol("DEPTH"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt8$No_valid_hl_variable_in_asent____ = makeString("No valid hl-variable in asent : ~A");

    public static final SubLObject setup_removal_modules_rtv_file_alt() {
        inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_CHECK, $list_alt73);
        inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_GENERATE, $list_alt75);
        inference_modules.register_solely_specific_removal_module_predicate($$relatedToVia);
        return NIL;
    }

    public static SubLObject setup_removal_modules_rtv_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_CHECK, $list74);
            inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_GENERATE, $list76);
            inference_modules.register_solely_specific_removal_module_predicate($$relatedToVia);
            preference_modules.doomed_unless_arg_bindable($POS, $$relatedToVia, THREE_INTEGER);
            preference_modules.inference_preference_module($RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE, $list79);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_CHECK, $list_alt73);
            inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_GENERATE, $list_alt75);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_rtv_file_Previous() {
        inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_CHECK, $list74);
        inference_modules.inference_removal_module($REMOVAL_RELATED_TO_VIA_GENERATE, $list76);
        inference_modules.register_solely_specific_removal_module_predicate($$relatedToVia);
        preference_modules.doomed_unless_arg_bindable($POS, $$relatedToVia, THREE_INTEGER);
        preference_modules.inference_preference_module($RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE, $list79);
        return NIL;
    }

    static private final SubLString $str_alt9$No_initial_node_applicable_for_as = makeString("No initial node applicable for asent ~A~%");

    static private final SubLList $list_alt10 = list(makeSymbol("ASENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void declareFunctions() {
        declare_removal_modules_rtv_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_rtv_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_rtv_file();
    }

    static {
    }

    static private final SubLList $list_alt20 = list($TYPE, makeKeyword("TRANSITIVE-REASONING"), makeKeyword("DIRECTION"), makeKeyword("ACCESSIBLE"), makeKeyword("MARKING"), makeKeyword("DEPTH-MARKING"));

    static private final SubLList $list_alt21 = list(makeSymbol("SEARCH"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt24 = list(makeKeyword("MT"));

    static private final SubLList $list_alt27 = list(list(makeSymbol("*RTV-ISA-CONSTRAINTS*"), NIL), list(makeSymbol("*RTV-GENLS-CONSTRAINTS*"), NIL), list(makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), T));

    static private final SubLList $list_alt28 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt32 = list(QUOTE, makeSymbol("RTV-CLAUSE-P"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), list(makeSymbol("COR"), makeSymbol("*RTV-ISA-CONSTRAINTS*"), makeSymbol("*RTV-GENLS-CONSTRAINTS*"))));

    static private final SubLList $list_alt53 = list(makeKeyword("ADD-TO-RESULT?"), makeKeyword("NODES-ON-WIND"));

    static private final SubLList $list_alt59 = list(makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"), makeKeyword("JUSTIFY?"), makeKeyword("ALL"));

    static private final SubLList $list_alt60 = list(makeKeyword("JUSTIFY?"), makeKeyword("ALL"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"));

    static private final SubLList $list_alt64 = list(makeKeyword("SATISFY-FN"), makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P"), makeKeyword("JUSTIFY?"), makeKeyword("ALL"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("EDGES-ON-UNWIND"));

    static private final SubLList $list_alt70 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("SOP"), makeSymbol("NUM"));

    static private final SubLList $list_alt73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("relatedToVia"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relatedToVia"), $FORT, $FORT, cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RTV-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RTV-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RTV-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <fort> <fort> <SOP> <num>)"), makeKeyword("EXAMPLE"), makeString("(#$relatedToVia #$KevinBacon #$KevinSpacey (#$TheSet #$costars) 2)") });

    static private final SubLList $list_alt75 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("relatedToVia"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("relatedToVia"), $FORT, makeKeyword("VARIABLE"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER")), list(reader_make_constant_shell("relatedToVia"), makeKeyword("VARIABLE"), $FORT, cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("INTEGER"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RTV-GENERATE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RTV-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-RTV-GENERATE-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list($CALL, makeSymbol("TERM-UNIFY"), list($CALL, makeSymbol("GET-RTV-VAR-ARG"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("INPUT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("RTV"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <VAR> <fort> <SOP> <num>)\n    and\n    (#$relatedToVia <fort> <VAR> <SOP> <num>)"), makeKeyword("EXAMPLE"), makeString("(#$relatedToVia ?WHO #$KevinBacon (#$TheSet #$costars) 2)\n    and\n    (#$relatedToVia #$KevinBacon ?WHO (#$TheSet #$costars) 2)") });
}

/**
 * Total time: 396 ms
 */
