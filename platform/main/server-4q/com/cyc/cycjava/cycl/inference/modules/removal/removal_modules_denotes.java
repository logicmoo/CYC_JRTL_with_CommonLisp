package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_denotes extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_denotes();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes";

    public static final String myFingerPrint = "98a64ca3dab6338fb1b2bf952ba73ce04c95926ef9b62684609f631e557f4a8f";

    private static final SubLObject $$means = reader_make_constant_shell(makeString("means"));

    private static final SubLSymbol $REMOVAL_NON_WFF_CHECK_NEG = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");





    private static final SubLSymbol $MEANS_UNIFY_ARG1_POS = makeKeyword("MEANS-UNIFY-ARG1-POS");

    public static final SubLList $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("means")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("means")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $MEANS_UNIFY_ARG1_NEG = makeKeyword("MEANS-UNIFY-ARG1-NEG");

    public static final SubLList $list7 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("means")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("means")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_MEANS_CHECK_POS = makeKeyword("REMOVAL-MEANS-CHECK-POS");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("means")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("means")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MEANS-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$means <fully-bound quoted term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$means (#$Quote #$Dog) #$Dog)\n(#$means #$MyFavoriteConstant #$Dog)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$means #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });



    private static final SubLList $list11 = list(reader_make_constant_shell(makeString("denotes")), reader_make_constant_shell(makeString("expresses")));

    private static final SubLObject $$expresses = reader_make_constant_shell(makeString("expresses"));

    private static final SubLObject $$denotes = reader_make_constant_shell(makeString("denotes"));

    private static final SubLObject $$QuasiQuote = reader_make_constant_shell(makeString("QuasiQuote"));

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));









    private static final SubLSymbol $REMOVAL_MEANS_UNIFY_ARG1_POS = makeKeyword("REMOVAL-MEANS-UNIFY-ARG1-POS");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("means")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("means")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MEANS-UNIFY-ARG1-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-UNIFY-ARG1-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$means <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$means <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$means ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n(#$means ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n") });

    private static final SubLSymbol $REMOVAL_MEANS_UNIFY_ARG2_POS = makeKeyword("REMOVAL-MEANS-UNIFY-ARG2-POS");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("means")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("means")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-UNIFY-ARG2-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$means <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$means (#$Quote #$Dog) ?X)\n(#$means #$MyFavoriteConstant ?X)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$means #$MyFavoriteSentence ?X)") });

    private static final SubLSymbol $REMOVAL_MEANS_NEG = makeKeyword("REMOVAL-MEANS-NEG");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("means")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("means")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$means <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$means #$Cat #$Dog))\n(#$not (#$means (#$Quote ?X) #$Dog))\n(#$not (#$means (#$Quote (#$EscapeQuote #$Cat)) #$Dog))\n(#$not (#$means #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });

    private static final SubLObject $$CycLTerm = reader_make_constant_shell(makeString("CycLTerm"));

    private static final SubLObject $$CycLDenotationalTerm = reader_make_constant_shell(makeString("CycLDenotationalTerm"));

    private static final SubLObject $$CycLSentence = reader_make_constant_shell(makeString("CycLSentence"));

    private static final SubLSymbol $DENOTES_UNIFY_ARG1_POS = makeKeyword("DENOTES-UNIFY-ARG1-POS");

    private static final SubLList $list30 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $DENOTES_UNIFY_ARG1_NEG = makeKeyword("DENOTES-UNIFY-ARG1-NEG");

    public static final SubLList $list32 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_DENOTES_CHECK_POS = makeKeyword("REMOVAL-DENOTES-CHECK-POS");

    public static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotes")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTES-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <fully-bound quoted term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotes (#$Quote #$Dog) #$Dog)\n(#$denotes #$MyFavoriteConstant #$Dog)") });

    private static final SubLSymbol $REMOVAL_DENOTES_UNIFY_ARG1_POS = makeKeyword("REMOVAL-DENOTES-UNIFY-ARG1-POS");

    public static final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTES-UNIFY-ARG1-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-UNIFY-ARG1-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$denotes <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotes ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n\n    (#$denotes ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)") });

    private static final SubLSymbol $REMOVAL_DENOTES_UNIFY_ARG2_POS = makeKeyword("REMOVAL-DENOTES-UNIFY-ARG2-POS");

    public static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotes")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-UNIFY-ARG2-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotes (#$Quote #$Dog) ?X)\n    (#$denotes #$MyFavoriteConstant ?X)") });

    private static final SubLSymbol $REMOVAL_DENOTES_NEG = makeKeyword("REMOVAL-DENOTES-NEG");

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotes")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$denotes <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$denotes #$Cat #$Dog))\n(#$not (#$denotes #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$denotes (#$Quote ?X) #$Dog))\n(#$not (#$denotes (#$Quote (#$EscapeQuote #$Cat)) #$Dog))") });

    private static final SubLSymbol $EXPRESSES_UNIFY_ARG1_POS = makeKeyword("EXPRESSES-UNIFY-ARG1-POS");

    public static final SubLList $list42 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expresses")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $EXPRESSES_UNIFY_ARG1_NEG = makeKeyword("EXPRESSES-UNIFY-ARG1-NEG");

    public static final SubLList $list44 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expresses")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_EXPRESSES_CHECK_POS = makeKeyword("REMOVAL-EXPRESSES-CHECK-POS");

    public static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expresses")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-EXPRESSES-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <fully-bound quoted term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });

    private static final SubLSymbol $REMOVAL_EXPRESSES_UNIFY_ARG1_POS = makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG1-POS");

    public static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expresses")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG1-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG1-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$expresses <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$expresses ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n\n(#$expresses ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))") });

    private static final SubLSymbol $REMOVAL_EXPRESSES_UNIFY_ARG2_POS = makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG2-POS");

    public static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expresses")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG2-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$expresses #$MyFavoriteSentence ?X)") });

    private static final SubLSymbol $REMOVAL_EXPRESSES_NEG = makeKeyword("REMOVAL-EXPRESSES-NEG");

    public static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expresses")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$expresses <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$expresses #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });

    public static SubLObject make_means_support(final SubLObject asent) {
        return arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_means_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return $hl_module_check_cost$.getDynamicValue(thread);
        }
        return removal_means_lookup_cost(asent, $POS);
    }

    public static SubLObject removal_means_lookup_cost(final SubLObject asent, final SubLObject sense) {
        SubLObject cost = inference_trampolines.inference_num_gaf_lookup_index(asent, sense);
        if ($$means.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject cdolist_list_var = $list11;
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cost = add(cost, inference_trampolines.inference_num_gaf_lookup_index(list(spec_pred, arg1, arg2), sense));
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        }
        return cost;
    }

    public static SubLObject removal_means_correct_arg2(final SubLObject pred, final SubLObject arg2) {
        if (pred.eql($$means)) {
            return cycl_grammar.cycl_term_p(arg2);
        }
        if (pred.eql($$expresses)) {
            return cycl_grammar.cycl_sentence_p(arg2);
        }
        if (pred.eql($$denotes)) {
            return cycl_grammar.cycl_denotational_term_p(arg2);
        }
        return NIL;
    }

    public static SubLObject removal_means_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == removal_means_correct_arg2(pred, arg2)) {
            return NIL;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_check_pos_quoted_expand(pred, arg1, arg2, NIL);
        }
        return removal_means_check_lookup_expand(asent, $POS);
    }

    public static SubLObject removal_means_check_pos_quoted_expand(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject use_quasiquoteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_term = (NIL != variables.variable_p(arg1)) ? arg1 : czer_main.canonicalize_quoted_term(arg1, T);
        final SubLObject quoted_term = (NIL != use_quasiquoteP) ? list($$QuasiQuote, arg2) : list($$Quote, arg2);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(canon_term, quoted_term, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject unified_term = bindings.subst_bindings(v_bindings, canon_term);
            final SubLObject unified_asent = list(pred, unified_term, arg2);
            return backward.removal_add_node(make_means_support(unified_asent), v_bindings, unify_justification);
        }
        return NIL;
    }

    public static SubLObject removal_means_check_lookup_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$1 = NIL;
                                    final SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (NIL != valid_$3) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    final SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$3 = NIL;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                        if (NIL != valid_$5) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (NIL != valid_$6) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                        if (NIL != valid_$7) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion2, asent);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense)))) {
                            removal_modules_lookup.removal_lookup_expand_internal(assertion3, asent);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        if ($$means.eql(pred)) {
            arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject cdolist_list_var = $list11;
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject spec_asent = list(spec_pred, arg1, arg2);
                final SubLObject l_index2 = inference_trampolines.inference_gaf_lookup_index(spec_asent, sense);
                final SubLObject pcase_var2;
                final SubLObject method2 = pcase_var2 = kb_mapping_macros.do_gli_extract_method(l_index2);
                if (pcase_var2.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index2);
                    final SubLObject argnum2 = thread.secondMultipleValue();
                    final SubLObject predicate2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != argnum2) {
                        if (NIL != predicate2) {
                            final SubLObject pred_var3 = predicate2;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var3)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var3);
                                SubLObject done_var2 = NIL;
                                final SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$6 = NIL;
                                            final SubLObject token_var_$7 = NIL;
                                            while (NIL == done_var_$6) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                                final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion2));
                                                if (NIL != valid_$8) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$6 = makeBoolean(NIL == valid_$8);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values6 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values6);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_13, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                } 
                            }
                        } else {
                            final SubLObject pred_var3 = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var3)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var3);
                                SubLObject done_var2 = NIL;
                                final SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$7 = NIL;
                                            final SubLObject token_var_$8 = NIL;
                                            while (NIL == done_var_$7) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion2));
                                                if (NIL != valid_$9) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$7 = makeBoolean(NIL == valid_$9);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values7 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values7);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_14, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                } 
                            }
                        }
                    } else
                        if (NIL != predicate2) {
                            final SubLObject pred_var3 = predicate2;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var3)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var3);
                                SubLObject done_var2 = NIL;
                                final SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$8 = NIL;
                                            final SubLObject token_var_$9 = NIL;
                                            while (NIL == done_var_$8) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$9);
                                                final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(assertion2));
                                                if (NIL != valid_$10) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$8 = makeBoolean(NIL == valid_$10);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values8 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values8);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_15, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                } 
                            }
                        } else {
                            final SubLObject pred_var3 = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var3)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var3);
                                SubLObject done_var2 = NIL;
                                final SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$9 = NIL;
                                            final SubLObject token_var_$10 = NIL;
                                            while (NIL == done_var_$9) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$10);
                                                final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion2));
                                                if (NIL != valid_$11) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$9 = makeBoolean(NIL == valid_$11);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values9 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values9);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                } 
                            }
                        }

                } else
                    if (pcase_var2.eql($PREDICATE_EXTENT)) {
                        final SubLObject pred_var4 = kb_mapping_macros.do_gli_vpe_extract_key(l_index2);
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var4)) {
                            final SubLObject str2 = NIL;
                            final SubLObject _prev_bind_17 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_18 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_19 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_20 = $progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_21 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_22 = $progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_23 = $is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_24 = $silent_progressP$.currentBinding(thread);
                            try {
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                $progress_count$.bind(ZERO_INTEGER, thread);
                                $is_noting_progressP$.bind(T, thread);
                                $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                noting_progress_preamble(str2);
                                final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var4);
                                SubLObject done_var3 = NIL;
                                final SubLObject token_var3 = NIL;
                                while (NIL == done_var3) {
                                    final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                    final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                    if (NIL != valid3) {
                                        note_progress();
                                        SubLObject final_index_iterator3 = NIL;
                                        try {
                                            final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$10 = NIL;
                                            final SubLObject token_var_$11 = NIL;
                                            while (NIL == done_var_$10) {
                                                final SubLObject assertion4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$11);
                                                final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion4));
                                                if (NIL != valid_$12) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion4, spec_asent);
                                                }
                                                done_var_$10 = makeBoolean(NIL == valid_$12);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values10 = getValuesAsVector();
                                                if (NIL != final_index_iterator3) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                                }
                                                restoreValuesFromVector(_values10);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    }
                                    done_var3 = makeBoolean(NIL == valid3);
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_24, thread);
                                $is_noting_progressP$.rebind(_prev_bind_23, thread);
                                $progress_count$.rebind(_prev_bind_22, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_21, thread);
                                $progress_notification_count$.rebind(_prev_bind_20, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_19, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_18, thread);
                                $progress_start_time$.rebind(_prev_bind_17, thread);
                            }
                        }
                    } else
                        if (pcase_var2.eql($OVERLAP)) {
                            SubLObject cdolist_list_var_$33 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index2), UNPROVIDED);
                            SubLObject assertion5 = NIL;
                            assertion5 = cdolist_list_var_$33.first();
                            while (NIL != cdolist_list_var_$33) {
                                if ((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion5, enumeration_types.sense_truth(sense)))) {
                                    removal_modules_lookup.removal_lookup_expand_internal(assertion5, spec_asent);
                                }
                                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                assertion5 = cdolist_list_var_$33.first();
                            } 
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index2, method2);
                        }


                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject removal_means_unify_arg1_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return ONE_INTEGER;
        }
        return add(ONE_INTEGER, removal_means_lookup_cost(asent, $POS));
    }

    public static SubLObject removal_means_unify_arg1_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == removal_means_correct_arg2(pred, arg2)) {
            return NIL;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            removal_means_check_pos_quoted_expand(pred, arg1, arg2, NIL);
        } else {
            if (NIL != variables.variable_p(arg1)) {
                removal_means_check_pos_quoted_expand(pred, arg1, arg2, NIL);
            } else {
                removal_means_check_pos_quoted_expand(pred, arg1, arg2, T);
            }
            removal_means_check_lookup_expand(asent, $POS);
        }
        return NIL;
    }

    public static SubLObject removal_means_unify_arg2_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_unify_arg2_pos_quoted_expand(pred, arg1, arg2);
        }
        return removal_means_check_lookup_expand(asent, $POS);
    }

    public static SubLObject removal_means_unify_arg2_pos_quoted_expand(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unquoted_term = cycl_utilities.formula_arg1(czer_main.canonicalize_quoted_term(arg1, UNPROVIDED), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(unquoted_term, arg2, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject unified_term = bindings.subst_bindings(v_bindings, arg2);
            SubLObject unified_asent = NIL;
            if (NIL != removal_means_correct_arg2(pred, unified_term)) {
                unified_asent = list(pred, arg1, unified_term);
                return backward.removal_add_node(make_means_support(unified_asent), v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    public static SubLObject removal_means_arg1_isaP(final SubLObject pred, final SubLObject arg1) {
        if (pred.eql($$means)) {
            return isa.isaP(arg1, $$CycLTerm, UNPROVIDED, UNPROVIDED);
        }
        if (pred.eql($$denotes)) {
            return isa.isaP(arg1, $$CycLDenotationalTerm, UNPROVIDED, UNPROVIDED);
        }
        if (pred.eql($$expresses)) {
            return isa.isaP(arg1, $$CycLSentence, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_means_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != variables.fully_bound_p(arg1)) && (NIL == removal_means_correct_arg2(pred, arg2))) {
            return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), NIL, UNPROVIDED);
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_neg_quoted_expand(asent, arg1, arg2);
        }
        if (NIL != removal_means_arg1_isaP(pred, arg1)) {
            return removal_means_check_lookup_expand(asent, $NEG);
        }
        return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), NIL, UNPROVIDED);
    }

    public static SubLObject removal_means_neg_quoted_expand(final SubLObject asent, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_term = czer_main.canonicalize_quoted_term(arg1, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(canon_term, list($$Quote, arg2), UNPROVIDED, UNPROVIDED);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == v_bindings) {
            return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), NIL, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_denotes_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_cost(asent, sense);
    }

    public static SubLObject removal_denotes_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_expand(asent, sense);
    }

    public static SubLObject removal_denotes_unify_arg1_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_cost(asent, sense);
    }

    public static SubLObject removal_denotes_unify_arg1_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_expand(asent, sense);
    }

    public static SubLObject removal_denotes_unify_arg2_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg2_pos_expand(asent, sense);
    }

    public static SubLObject removal_denotes_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_neg_expand(asent, sense);
    }

    public static SubLObject removal_expresses_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_cost(asent, sense);
    }

    public static SubLObject removal_expresses_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_expand(asent, sense);
    }

    public static SubLObject removal_expresses_unify_arg1_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_cost(asent, sense);
    }

    public static SubLObject removal_expresses_unify_arg1_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_expand(asent, sense);
    }

    public static SubLObject removal_expresses_unify_arg2_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg2_pos_expand(asent, sense);
    }

    public static SubLObject removal_expresses_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_neg_expand(asent, sense);
    }

    public static SubLObject declare_removal_modules_denotes_file() {
        declareFunction(me, "make_means_support", "MAKE-MEANS-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_means_check_pos_cost", "REMOVAL-MEANS-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_means_lookup_cost", "REMOVAL-MEANS-LOOKUP-COST", 2, 0, false);
        declareFunction(me, "removal_means_correct_arg2", "REMOVAL-MEANS-CORRECT-ARG2", 2, 0, false);
        declareFunction(me, "removal_means_check_pos_expand", "REMOVAL-MEANS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_means_check_pos_quoted_expand", "REMOVAL-MEANS-CHECK-POS-QUOTED-EXPAND", 4, 0, false);
        declareFunction(me, "removal_means_check_lookup_expand", "REMOVAL-MEANS-CHECK-LOOKUP-EXPAND", 2, 0, false);
        declareFunction(me, "removal_means_unify_arg1_pos_cost", "REMOVAL-MEANS-UNIFY-ARG1-POS-COST", 1, 1, false);
        declareFunction(me, "removal_means_unify_arg1_pos_expand", "REMOVAL-MEANS-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_means_unify_arg2_pos_expand", "REMOVAL-MEANS-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_means_unify_arg2_pos_quoted_expand", "REMOVAL-MEANS-UNIFY-ARG2-POS-QUOTED-EXPAND", 3, 0, false);
        declareFunction(me, "removal_means_arg1_isaP", "REMOVAL-MEANS-ARG1-ISA?", 2, 0, false);
        declareFunction(me, "removal_means_neg_expand", "REMOVAL-MEANS-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_means_neg_quoted_expand", "REMOVAL-MEANS-NEG-QUOTED-EXPAND", 3, 0, false);
        declareFunction(me, "removal_denotes_check_pos_cost", "REMOVAL-DENOTES-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_denotes_check_pos_expand", "REMOVAL-DENOTES-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_denotes_unify_arg1_pos_cost", "REMOVAL-DENOTES-UNIFY-ARG1-POS-COST", 1, 1, false);
        declareFunction(me, "removal_denotes_unify_arg1_pos_expand", "REMOVAL-DENOTES-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_denotes_unify_arg2_pos_expand", "REMOVAL-DENOTES-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_denotes_neg_expand", "REMOVAL-DENOTES-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_expresses_check_pos_cost", "REMOVAL-EXPRESSES-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_expresses_check_pos_expand", "REMOVAL-EXPRESSES-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_expresses_unify_arg1_pos_cost", "REMOVAL-EXPRESSES-UNIFY-ARG1-POS-COST", 1, 1, false);
        declareFunction(me, "removal_expresses_unify_arg1_pos_expand", "REMOVAL-EXPRESSES-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_expresses_unify_arg2_pos_expand", "REMOVAL-EXPRESSES-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_expresses_neg_expand", "REMOVAL-EXPRESSES-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_denotes_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_denotes_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$means);
        inference_modules.inference_removal_module_dont_use_universal($$means, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$means);
        preference_modules.doomed_unless_arg_bindable($NEG, $$means, TWO_INTEGER);
        preference_modules.inference_preference_module($MEANS_UNIFY_ARG1_POS, $list5);
        preference_modules.inference_preference_module($MEANS_UNIFY_ARG1_NEG, $list7);
        inference_modules.inference_removal_module($REMOVAL_MEANS_CHECK_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_MEANS_UNIFY_ARG1_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_MEANS_UNIFY_ARG2_POS, $list23);
        inference_modules.inference_removal_module($REMOVAL_MEANS_NEG, $list25);
        inference_modules.register_solely_specific_removal_module_predicate($$denotes);
        inference_modules.inference_removal_module_dont_use_universal($$denotes, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$denotes);
        preference_modules.doomed_unless_arg_bindable($NEG, $$denotes, TWO_INTEGER);
        preference_modules.inference_preference_module($DENOTES_UNIFY_ARG1_POS, $list30);
        preference_modules.inference_preference_module($DENOTES_UNIFY_ARG1_NEG, $list32);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_CHECK_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_UNIFY_ARG1_POS, $list36);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_UNIFY_ARG2_POS, $list38);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_NEG, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$expresses);
        inference_modules.inference_removal_module_dont_use_universal($$expresses, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$expresses);
        preference_modules.doomed_unless_arg_bindable($NEG, $$expresses, TWO_INTEGER);
        preference_modules.inference_preference_module($EXPRESSES_UNIFY_ARG1_POS, $list42);
        preference_modules.inference_preference_module($EXPRESSES_UNIFY_ARG1_NEG, $list44);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_CHECK_POS, $list46);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_UNIFY_ARG1_POS, $list48);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_UNIFY_ARG2_POS, $list50);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_NEG, $list52);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_denotes_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_denotes_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_denotes_file();
    }

    
}

/**
 * Total time: 1134 ms
 */
