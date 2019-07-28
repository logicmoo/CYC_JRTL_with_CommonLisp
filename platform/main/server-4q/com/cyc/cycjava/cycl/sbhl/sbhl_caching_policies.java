package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.cache_utilities;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_caching_policies extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_caching_policies();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies";

    public static final String myFingerPrint = "e3f12b7b415b4e498c681a504284dac05a4aaea626360b9f55e48cdb0903fd7b";



    // deflexical
    // The list of valid SBHL caching instruction action verbs.
    public static final SubLSymbol $valid_sbhl_caching_instruction_verb$ = makeSymbol("*VALID-SBHL-CACHING-INSTRUCTION-VERB*");

    // deflexical
    // The list of the valid SBHL caching policy types.
    public static final SubLSymbol $valid_sbhl_caching_policy_types$ = makeSymbol("*VALID-SBHL-CACHING-POLICY-TYPES*");

    // Internal Constants
    public static final SubLSymbol $active_sbhl_caching_policies$ = makeSymbol("*ACTIVE-SBHL-CACHING-POLICIES*");

    public static final SubLList $list1 = list(makeKeyword("LINK-PREDICATE"), makeKeyword("POLICY"), makeKeyword("CAPACITY"), makeKeyword("EXEMPT"), makeKeyword("PREFETCH"));

    public static final SubLList $list2 = list(makeKeyword("STICKY"), makeKeyword("SWAPOUT"));

    public static final SubLSymbol VALID_SBHL_CACHING_POLICY_TYPE_P = makeSymbol("VALID-SBHL-CACHING-POLICY-TYPE-P");











    public static final SubLString $str9$Sticky_policy_does_not_support_ca = makeString("Sticky policy does not support capacity ~A, only :undefined.");





    public static final SubLString $str12$Invalid_exemption_specification__ = makeString("Invalid exemption specification ~A. Only :all is permitted for sticky policy.");





    public static final SubLString $str15$Invalid_prefetch_specification__A = makeString("Invalid prefetch specification ~A. Only :ALL or lists of FORT-P (incl NIL) are permitted.");





    public static final SubLString $str18$Swapout_policy_does_not_support_c = makeString("Swapout policy does not support capacity ~A, only positive integer capacities are supported.");

    public static final SubLString $str19$Invalid_exemption_specification__ = makeString("Invalid exemption specification ~A. Only lists of FORT-P (incl NIL) or :all are permitted.");

    public static final SubLString $str20$Invalid_prefetch_specification__A = makeString("Invalid prefetch specification ~A. Only lists of FORT-P (incl NIL) are permitted.");

    public static final SubLString $str21$Unknown_policy_type__A_____dont_k = makeString("Unknown policy type ~A ... dont know what to do.");





    public static final SubLString $str24$Caching_policy_of_type__A_not_yet = makeString("Caching policy of type ~A not yet implemented.");

    public static final SubLSymbol LIST_OF_FORT_P = makeSymbol("LIST-OF-FORT-P");





    private static final SubLString $$$Enforcing_SBHL_caching_policies = makeString("Enforcing SBHL caching policies");



    private static final SubLString $str30$__Skipping_invalid_SBHL_caching_p = makeString("~&Skipping invalid SBHL caching policies file ~A.~%Load attempt caused error: ~A.~%");

    private static final SubLString $str31$standard_kb_sbhl_caching_policies = makeString("standard-kb-sbhl-caching-policies");

    private static final SubLSymbol $sym32$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLList $list34 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));





    private static final SubLList $list37 = list(makeSymbol("MODULE"), makeSymbol("REF-COUNTS"));

    private static final SubLList $list38 = cons(makeSymbol("SBHL-MODULE"), makeSymbol("CACHE-STRATEGY"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLSymbol $sym41$_ = makeSymbol(">");

    private static final SubLSymbol $sym42$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLList $list45 = list(makeSymbol("TIME-STAMP"), makeSymbol("ACTION-TYPE"), makeSymbol("TERM"));

    public static SubLObject valid_sbhl_caching_instruction_verb_p(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != subl_promotions.memberP(v_object, $valid_sbhl_caching_instruction_verb$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_sbhl_caching_policy_type_p(final SubLObject policy_type) {
        return makeBoolean(policy_type.isKeyword() && (NIL != subl_promotions.memberP(policy_type, $valid_sbhl_caching_policy_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject new_sbhl_caching_policy(final SubLObject link_predicate, final SubLObject policy_type, SubLObject capacity, SubLObject exemptions, SubLObject prefetch) {
        if (capacity == UNPROVIDED) {
            capacity = sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue();
        }
        if (exemptions == UNPROVIDED) {
            exemptions = NIL;
        }
        if (prefetch == UNPROVIDED) {
            prefetch = NIL;
        }
        assert NIL != valid_sbhl_caching_policy_type_p(policy_type) : "sbhl_caching_policies.valid_sbhl_caching_policy_type_p(policy_type) " + "CommonSymbols.NIL != sbhl_caching_policies.valid_sbhl_caching_policy_type_p(policy_type) " + policy_type;
        SubLObject policy = NIL;
        policy = putf(policy, $LINK_PREDICATE, link_predicate);
        policy = putf(policy, $POLICY, policy_type);
        policy = flesh_out_sbhl_caching_policy(policy, capacity, exemptions, prefetch);
        return policy;
    }

    public static SubLObject flesh_out_sbhl_caching_policy(SubLObject policy, SubLObject capacity, SubLObject exemptions, final SubLObject prefetch) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject policy_type = pcase_var = getf(policy, $POLICY, $UNKNOWN);
        if (pcase_var.eql($STICKY)) {
            if (NIL == capacity) {
                capacity = $UNDEFINED;
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($UNDEFINED != capacity)) {
                Errors.error($str9$Sticky_policy_does_not_support_ca, capacity);
            }
            policy = putf(policy, $CAPACITY, capacity);
            if (NIL == exemptions) {
                exemptions = $ALL;
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ALL != exemptions)) {
                Errors.error($str12$Invalid_exemption_specification__, exemptions);
            }
            policy = putf(policy, $EXEMPT, exemptions);
            if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ALL != prefetch)) && (NIL == list_utilities.list_of_type_p(FORT_P, prefetch))) {
                Errors.error($str15$Invalid_prefetch_specification__A, prefetch);
            }
            policy = putf(policy, $PREFETCH, prefetch);
        } else
            if (pcase_var.eql($SWAPOUT)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.positive_integer_p(capacity))) {
                    Errors.error($str18$Swapout_policy_does_not_support_c, capacity);
                }
                policy = putf(policy, $CAPACITY, capacity);
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ALL != exemptions)) && (NIL == list_utilities.list_of_type_p(FORT_P, exemptions))) {
                    Errors.error($str19$Invalid_exemption_specification__, exemptions);
                }
                policy = putf(policy, $EXEMPT, exemptions);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.list_of_type_p(FORT_P, prefetch))) {
                    Errors.error($str20$Invalid_prefetch_specification__A, prefetch);
                }
                policy = putf(policy, $PREFETCH, prefetch);
            } else {
                Errors.error($str21$Unknown_policy_type__A_____dont_k, policy);
            }

        return policy;
    }

    public static SubLObject clone_sbhl_caching_policy(final SubLObject policy) {
        return copy_list(policy);
    }

    public static SubLObject get_sbhl_caching_policy_link_predicate(final SubLObject policy) {
        return getf(policy, $LINK_PREDICATE, UNPROVIDED);
    }

    public static SubLObject get_sbhl_caching_policy_type(final SubLObject policy) {
        return getf(policy, $POLICY, UNPROVIDED);
    }

    public static SubLObject get_sbhl_caching_policy_capacity(final SubLObject policy) {
        return getf(policy, $CAPACITY, UNPROVIDED);
    }

    public static SubLObject get_sbhl_caching_policy_terms_to_exempt(final SubLObject policy) {
        return getf(policy, $EXEMPT, UNPROVIDED);
    }

    public static SubLObject set_sbhl_caching_policy_terms_to_exempt(final SubLObject policy, final SubLObject exempt) {
        return putf(policy, $PREFETCH, exempt);
    }

    public static SubLObject get_sbhl_caching_policy_terms_to_prefetch(final SubLObject policy) {
        return getf(policy, $PREFETCH, UNPROVIDED);
    }

    public static SubLObject set_sbhl_caching_policy_terms_to_prefetch(final SubLObject policy, final SubLObject prefetches) {
        return putf(policy, $PREFETCH, prefetches);
    }

    public static SubLObject reset_sbhl_caching_policy(final SubLObject policy) {
        final SubLObject predicate = get_sbhl_caching_policy_link_predicate(policy);
        if (NIL != forts.valid_fortP(predicate)) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module(predicate);
            if (NIL != sbhl_module_vars.sbhl_module_p(module)) {
                sbhl_graphs.swap_out_all_pristine_graph_links(module);
                return implement_sbhl_caching_policy(policy);
            }
        }
        return NIL;
    }

    public static SubLObject implement_sbhl_caching_policy(final SubLObject policy) {
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject predicate = get_sbhl_caching_policy_link_predicate(policy);
            final SubLObject module = sbhl_module_vars.get_sbhl_module(predicate);
            final SubLObject pcase_var;
            final SubLObject policy_type = pcase_var = get_sbhl_caching_policy_type(policy);
            if (pcase_var.eql($STICKY)) {
                sbhl_graphs.set_cache_strategy_for_sbhl_module(module, $DONT_CACHE);
            } else
                if (pcase_var.eql($SWAPOUT)) {
                    final SubLObject capacity = get_sbhl_caching_policy_capacity(policy);
                    final SubLObject cache_strategy = sbhl_graphs.new_cache_strategy_for_sbhl_module(module, capacity);
                    sbhl_graphs.set_cache_strategy_for_sbhl_module(module, cache_strategy);
                    seed_sbhl_module_graph_cache_with_nodes(module, get_sbhl_caching_policy_terms_to_exempt(policy), $TOUCH);
                } else {
                    Errors.error($str24$Caching_policy_of_type__A_not_yet, policy_type);
                }

            seed_sbhl_module_graph_cache_with_nodes(module, get_sbhl_caching_policy_terms_to_prefetch(policy), UNPROVIDED);
            dictionary.dictionary_enter($active_sbhl_caching_policies$.getGlobalValue(), predicate, policy);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return policy;
    }

    public static SubLObject seed_sbhl_module_graph_cache_with_nodes(final SubLObject module, final SubLObject nodes, SubLObject touch_p) {
        if (touch_p == UNPROVIDED) {
            touch_p = NIL;
        }
        if (NIL == nodes) {
            return values(module, ZERO_INTEGER, touch_p);
        }
        SubLObject paged_in = ZERO_INTEGER;
        SubLObject term_list = nodes;
        if ($ALL == term_list) {
            term_list = get_all_nodes_for_sbhl_module_graph(module);
        }
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.valid_fortP(v_term)) {
                sbhl_graphs.get_sbhl_graph_link(v_term, module);
                paged_in = add(paged_in, ONE_INTEGER);
                if (NIL != touch_p) {
                    sbhl_graphs.touch_sbhl_graph_link(v_term, sbhl_graphs.get_sbhl_graph_link(v_term, module), module);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return values(module, paged_in, touch_p);
    }

    public static SubLObject get_all_nodes_for_sbhl_module_graph(final SubLObject module) {
        return map_utilities.map_keys(sbhl_module_utilities.get_sbhl_graph(module));
    }

    public static SubLObject create_sbhl_caching_policy_from_term_recommendation_list(final SubLObject link_predicate, final SubLObject policy_type, final SubLObject capacity, final SubLObject term_list, SubLObject exempt, SubLObject prefetch) {
        if (exempt == UNPROVIDED) {
            exempt = ZERO_INTEGER;
        }
        if (prefetch == UNPROVIDED) {
            prefetch = ZERO_INTEGER;
        }
        assert NIL != forts.list_of_fort_p(term_list) : "forts.list_of_fort_p(term_list) " + "CommonSymbols.NIL != forts.list_of_fort_p(term_list) " + term_list;
        assert NIL != forts.fort_p(link_predicate) : "forts.fort_p(link_predicate) " + "CommonSymbols.NIL != forts.fort_p(link_predicate) " + link_predicate;
        SubLObject exemptions = NIL;
        SubLObject prefetchers = NIL;
        if (exempt == $ALL) {
            exemptions = $ALL;
            if (prefetch == $ALL) {
                prefetchers = $ALL;
            } else {
                prefetchers = (prefetch.isFixnum()) ? list_utilities.first_n(prefetch, term_list) : NIL;
            }
        } else {
            exemptions = (exempt.isFixnum()) ? list_utilities.first_n(exempt, term_list) : NIL;
            prefetchers = (exempt.isFixnum() && prefetch.isFixnum()) ? list_utilities.last_n(prefetch, list_utilities.first_n(add(exempt, prefetch), term_list)) : NIL;
        }
        return new_sbhl_caching_policy(link_predicate, policy_type, capacity, exemptions, prefetchers);
    }

    public static SubLObject save_sbhl_caching_policies(final SubLObject policies, final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = T;
        }
        if (NIL != externalizedP) {
            cfasl_utilities.cfasl_save_externalized(policies, policies_file);
        } else {
            cfasl_utilities.cfasl_save(policies, policies_file);
        }
        return policies_file;
    }

    public static SubLObject load_sbhl_caching_policies(final SubLObject policies_file) {
        return cfasl_utilities.cfasl_load(policies_file);
    }

    public static SubLObject reset_sbhl_caching_policies(final SubLObject policies_file) {
        reset_sbhl_caching_policies_internal(load_sbhl_caching_policies(policies_file));
        return policies_file;
    }

    public static SubLObject reset_sbhl_caching_policies_internal(final SubLObject policies) {
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(NIL);
        dictionary.clear_dictionary($active_sbhl_caching_policies$.getGlobalValue());
        SubLObject cdolist_list_var = policies;
        SubLObject policy = NIL;
        policy = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reset_sbhl_caching_policy(policy);
            cdolist_list_var = cdolist_list_var.rest();
            policy = cdolist_list_var.first();
        } 
        return $RESET;
    }

    public static SubLObject enforce_monolithic_kb_sbhl_caching_policies() {
        final SubLObject policies = builder_utilities.propose_completely_cached_kb_sbhl_caching_policies(UNPROVIDED);
        reset_sbhl_caching_policies_internal(policies);
        return $ENFORCED;
    }

    public static SubLObject enforce_standard_kb_sbhl_caching_policies(final SubLObject dump_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = $$$Enforcing_SBHL_caching_policies;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
            final SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename(dump_directory);
            SubLObject policies = NIL;
            if (NIL != Filesys.probe_file(policies_file)) {
                SubLObject msg = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            policies = load_sbhl_caching_policies(policies_file);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (msg.isString()) {
                    Errors.warn($str30$__Skipping_invalid_SBHL_caching_p, policies_file, msg);
                }
            }
            if (NIL == list_utilities.sublisp_boolean(policies)) {
                policies = builder_utilities.propose_legacy_kb_sbhl_caching_policies(UNPROVIDED);
            }
            reset_sbhl_caching_policies_internal(policies);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return $ENFORCED;
    }

    public static SubLObject dump_active_kb_sbhl_caching_policies(final SubLObject dump_directory, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = NIL;
        }
        final SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename(dump_directory);
        final SubLObject policies = gather_active_kb_sbhl_caching_policies();
        save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }

    public static SubLObject get_standard_kb_sbhl_caching_policies_filename(final SubLObject dump_directory) {
        return dumper.kb_dump_file($str31$standard_kb_sbhl_caching_policies, dump_directory, UNPROVIDED);
    }

    public static SubLObject gather_active_kb_sbhl_caching_policies() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject policies = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($active_sbhl_caching_policies$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject policy = gather_one_active_kb_sbhl_caching_policy(predicate);
            policies = cons(policy, policies);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return policies;
    }

    public static SubLObject gather_one_active_kb_sbhl_caching_policy(final SubLObject predicate) {
        SubLObject policy = dictionary.dictionary_lookup($active_sbhl_caching_policies$.getGlobalValue(), predicate, UNPROVIDED);
        final SubLObject exemptions = get_sbhl_caching_policy_terms_to_exempt(policy);
        final SubLObject clean_exemptions = prepare_kb_sbhl_caching_policy_term_list_for_dumping(exemptions);
        final SubLObject prefetches = get_sbhl_caching_policy_terms_to_prefetch(policy);
        final SubLObject clean_prefetches = prepare_kb_sbhl_caching_policy_term_list_for_dumping(prefetches);
        if ((!exemptions.eql(clean_exemptions)) || (!prefetches.eql(clean_prefetches))) {
            policy = clone_sbhl_caching_policy(policy);
            policy = set_sbhl_caching_policy_terms_to_exempt(policy, clean_exemptions);
            policy = set_sbhl_caching_policy_terms_to_prefetch(policy, clean_prefetches);
        }
        return policy;
    }

    public static SubLObject prepare_kb_sbhl_caching_policy_term_list_for_dumping(final SubLObject term_list) {
        if (term_list.isList() && (NIL != list_utilities.sublisp_boolean(list_utilities.find_if_not($sym32$VALID_FORT_, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            return list_utilities.find_all_if($sym32$VALID_FORT_, term_list, UNPROVIDED);
        }
        return term_list;
    }

    public static SubLObject setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering() {
        sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(NIL);
        sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$.setDynamicValue($int$30);
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list34);
            key = current.first();
            current = module = current.rest();
            sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(facade_sbhl_module_cache_strategies_for_recording(UNPROVIDED));
        return $READY;
    }

    public static SubLObject setup_sbhl_graphs_for_sbhl_cache_tuning_experiment() {
        return $READY;
    }

    public static SubLObject tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment(final SubLObject ref_counts_map) {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list34);
            key = current.first();
            current = module = current.rest();
            final SubLObject cache_strategy = sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
            final SubLObject recordings = cache_utilities.recording_cache_strategy_facade_get_records(cache_strategy);
            final SubLObject ref_counts = map_utilities.map_get(ref_counts_map, module, UNPROVIDED);
            final SubLObject updated_ref_counts = count_references_in_sbhl_cache_strategy_recordings(recordings, ref_counts);
            map_utilities.map_put(ref_counts_map, module, updated_ref_counts);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static SubLObject contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment(final SubLObject cfasl_stream, final SubLObject ref_counts_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject alternate_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(ref_counts_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject module = NIL;
                SubLObject ref_counts = NIL;
                destructuring_bind_must_consp(current, datum, $list37);
                module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list37);
                ref_counts = current.first();
                current = current.rest();
                if (NIL == current) {
                    map_utilities.map_put(alternate_map, sbhl_module_vars.get_sbhl_module_link_pred(module), ref_counts);
                } else {
                    cdestructuring_bind_error(datum, $list37);
                }
            }
        }
        cfasl_output(alternate_map, cfasl_stream);
        return $DONE;
    }

    public static SubLObject tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering() {
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(unfacade_sbhl_module_cache_strategies_facaded_for_recording(UNPROVIDED));
        return $DONE;
    }

    public static SubLObject facade_sbhl_module_cache_strategies_for_recording(SubLObject old_strategy_list) {
        if (old_strategy_list == UNPROVIDED) {
            old_strategy_list = sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue();
        }
        final SubLObject time_stamper = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_strategy_list = NIL;
        SubLObject cdolist_list_var = old_strategy_list;
        SubLObject cache_tuple = NIL;
        cache_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_strategy = NIL;
            SubLObject current;
            final SubLObject datum = current = cache_tuple;
            SubLObject sbhl_module = NIL;
            SubLObject cache_strategy = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            sbhl_module = current.first();
            current = cache_strategy = current.rest();
            if (NIL != cache_utilities.recording_cache_strategy_facade_p(cache_strategy)) {
                new_strategy = cache_strategy;
            } else {
                new_strategy = cache_utilities.new_recording_cache_strategy_facade(cache_strategy, time_stamper);
            }
            new_strategy_list = list_utilities.alist_enter(new_strategy_list, sbhl_module, new_strategy, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cache_tuple = cdolist_list_var.first();
        } 
        return new_strategy_list;
    }

    public static SubLObject unfacade_sbhl_module_cache_strategies_facaded_for_recording(SubLObject old_strategy_list) {
        if (old_strategy_list == UNPROVIDED) {
            old_strategy_list = sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue();
        }
        SubLObject new_strategy_list = NIL;
        SubLObject cdolist_list_var = old_strategy_list;
        SubLObject cache_tuple = NIL;
        cache_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_strategy = NIL;
            SubLObject current;
            final SubLObject datum = current = cache_tuple;
            SubLObject sbhl_module = NIL;
            SubLObject cache_strategy = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            sbhl_module = current.first();
            current = cache_strategy = current.rest();
            if (NIL != cache_utilities.recording_cache_strategy_facade_p(cache_strategy)) {
                new_strategy = cache_utilities.recording_cache_strategy_facade_get_facaded_cache_strategy(cache_strategy);
            } else {
                new_strategy = cache_strategy;
            }
            new_strategy_list = list_utilities.alist_enter(new_strategy_list, sbhl_module, new_strategy, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cache_tuple = cdolist_list_var.first();
        } 
        return new_strategy_list;
    }

    public static SubLObject recommend_sbhl_caching_preference_term_list_from_recordings(final SubLObject recording, final SubLObject sbhl_module) {
        final SubLObject references = count_references_in_sbhl_cache_strategy_recordings(recording, UNPROVIDED);
        return recommend_sbhl_caching_preference_term_list_from_ref_counts(references, sbhl_module);
    }

    public static SubLObject recommend_sbhl_caching_preference_term_list_from_ref_counts(final SubLObject ref_counts, final SubLObject sbhl_module) {
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_module);
        if (pcase_var.eql($$genls) || pcase_var.eql($$genlInverse)) {
            final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, symbol_function($sym41$_), UNPROVIDED);
            final SubLObject generality_ranked = Sort.sort(copy_list(term_list), $sym42$GENERALITY_ESTIMATE_, UNPROVIDED);
            return list_utilities.rerank(generality_ranked, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($$genlPreds)) {
            final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, symbol_function($sym41$_), UNPROVIDED);
            final SubLObject generality_ranked = Sort.sort(copy_list(term_list), $sym42$GENERALITY_ESTIMATE_, UNPROVIDED);
            return list_utilities.rerank(generality_ranked, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($$genlMt)) {
            final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, symbol_function($sym41$_), UNPROVIDED);
            final SubLObject generality_ranked = Sort.sort(copy_list(term_list), $sym42$GENERALITY_ESTIMATE_, UNPROVIDED);
            return list_utilities.rerank(generality_ranked, term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, symbol_function($sym41$_), UNPROVIDED);
        return term_list;
    }

    public static SubLObject count_references_in_sbhl_cache_strategy_recordings(final SubLObject recording, SubLObject ref_counts) {
        if (ref_counts == UNPROVIDED) {
            ref_counts = NIL;
        }
        final SubLObject references = (NIL != dictionary.dictionary_p(ref_counts)) ? ref_counts : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = recording;
        SubLObject action = NIL;
        action = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = action;
            SubLObject time_stamp = NIL;
            SubLObject action_type = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            time_stamp = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != forts.valid_fortP(v_term)) {
                    dictionary_utilities.dictionary_increment(references, v_term, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list45);
            }
            cdolist_list_var = cdolist_list_var.rest();
            action = cdolist_list_var.first();
        } 
        return references;
    }

    public static SubLObject declare_sbhl_caching_policies_file() {
        declareFunction(me, "valid_sbhl_caching_instruction_verb_p", "VALID-SBHL-CACHING-INSTRUCTION-VERB-P", 1, 0, false);
        declareFunction(me, "valid_sbhl_caching_policy_type_p", "VALID-SBHL-CACHING-POLICY-TYPE-P", 1, 0, false);
        declareFunction(me, "new_sbhl_caching_policy", "NEW-SBHL-CACHING-POLICY", 2, 3, false);
        declareFunction(me, "flesh_out_sbhl_caching_policy", "FLESH-OUT-SBHL-CACHING-POLICY", 4, 0, false);
        declareFunction(me, "clone_sbhl_caching_policy", "CLONE-SBHL-CACHING-POLICY", 1, 0, false);
        declareFunction(me, "get_sbhl_caching_policy_link_predicate", "GET-SBHL-CACHING-POLICY-LINK-PREDICATE", 1, 0, false);
        declareFunction(me, "get_sbhl_caching_policy_type", "GET-SBHL-CACHING-POLICY-TYPE", 1, 0, false);
        declareFunction(me, "get_sbhl_caching_policy_capacity", "GET-SBHL-CACHING-POLICY-CAPACITY", 1, 0, false);
        declareFunction(me, "get_sbhl_caching_policy_terms_to_exempt", "GET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 1, 0, false);
        declareFunction(me, "set_sbhl_caching_policy_terms_to_exempt", "SET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 2, 0, false);
        declareFunction(me, "get_sbhl_caching_policy_terms_to_prefetch", "GET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 1, 0, false);
        declareFunction(me, "set_sbhl_caching_policy_terms_to_prefetch", "SET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 2, 0, false);
        declareFunction(me, "reset_sbhl_caching_policy", "RESET-SBHL-CACHING-POLICY", 1, 0, false);
        declareFunction(me, "implement_sbhl_caching_policy", "IMPLEMENT-SBHL-CACHING-POLICY", 1, 0, false);
        declareFunction(me, "seed_sbhl_module_graph_cache_with_nodes", "SEED-SBHL-MODULE-GRAPH-CACHE-WITH-NODES", 2, 1, false);
        declareFunction(me, "get_all_nodes_for_sbhl_module_graph", "GET-ALL-NODES-FOR-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction(me, "create_sbhl_caching_policy_from_term_recommendation_list", "CREATE-SBHL-CACHING-POLICY-FROM-TERM-RECOMMENDATION-LIST", 4, 2, false);
        declareFunction(me, "save_sbhl_caching_policies", "SAVE-SBHL-CACHING-POLICIES", 2, 1, false);
        declareFunction(me, "load_sbhl_caching_policies", "LOAD-SBHL-CACHING-POLICIES", 1, 0, false);
        declareFunction(me, "reset_sbhl_caching_policies", "RESET-SBHL-CACHING-POLICIES", 1, 0, false);
        declareFunction(me, "reset_sbhl_caching_policies_internal", "RESET-SBHL-CACHING-POLICIES-INTERNAL", 1, 0, false);
        declareFunction(me, "enforce_monolithic_kb_sbhl_caching_policies", "ENFORCE-MONOLITHIC-KB-SBHL-CACHING-POLICIES", 0, 0, false);
        declareFunction(me, "enforce_standard_kb_sbhl_caching_policies", "ENFORCE-STANDARD-KB-SBHL-CACHING-POLICIES", 1, 0, false);
        declareFunction(me, "dump_active_kb_sbhl_caching_policies", "DUMP-ACTIVE-KB-SBHL-CACHING-POLICIES", 1, 1, false);
        declareFunction(me, "get_standard_kb_sbhl_caching_policies_filename", "GET-STANDARD-KB-SBHL-CACHING-POLICIES-FILENAME", 1, 0, false);
        declareFunction(me, "gather_active_kb_sbhl_caching_policies", "GATHER-ACTIVE-KB-SBHL-CACHING-POLICIES", 0, 0, false);
        declareFunction(me, "gather_one_active_kb_sbhl_caching_policy", "GATHER-ONE-ACTIVE-KB-SBHL-CACHING-POLICY", 1, 0, false);
        declareFunction(me, "prepare_kb_sbhl_caching_policy_term_list_for_dumping", "PREPARE-KB-SBHL-CACHING-POLICY-TERM-LIST-FOR-DUMPING", 1, 0, false);
        declareFunction(me, "setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false);
        declareFunction(me, "setup_sbhl_graphs_for_sbhl_cache_tuning_experiment", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 0, 0, false);
        declareFunction(me, "tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 1, 0, false);
        declareFunction(me, "contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment", "CONTRIBUTE-SBHL-GRAPHS-DATA-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 2, 0, false);
        declareFunction(me, "tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false);
        declareFunction(me, "facade_sbhl_module_cache_strategies_for_recording", "FACADE-SBHL-MODULE-CACHE-STRATEGIES-FOR-RECORDING", 0, 1, false);
        declareFunction(me, "unfacade_sbhl_module_cache_strategies_facaded_for_recording", "UNFACADE-SBHL-MODULE-CACHE-STRATEGIES-FACADED-FOR-RECORDING", 0, 1, false);
        declareFunction(me, "recommend_sbhl_caching_preference_term_list_from_recordings", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-RECORDINGS", 2, 0, false);
        declareFunction(me, "recommend_sbhl_caching_preference_term_list_from_ref_counts", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-REF-COUNTS", 2, 0, false);
        declareFunction(me, "count_references_in_sbhl_cache_strategy_recordings", "COUNT-REFERENCES-IN-SBHL-CACHE-STRATEGY-RECORDINGS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_sbhl_caching_policies_file() {
        deflexical("*ACTIVE-SBHL-CACHING-POLICIES*", SubLTrampolineFile.maybeDefault($active_sbhl_caching_policies$, $active_sbhl_caching_policies$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*VALID-SBHL-CACHING-INSTRUCTION-VERB*", $list1);
        deflexical("*VALID-SBHL-CACHING-POLICY-TYPES*", $list2);
        return NIL;
    }

    public static SubLObject setup_sbhl_caching_policies_file() {
        declare_defglobal($active_sbhl_caching_policies$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_caching_policies_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_caching_policies_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_caching_policies_file();
    }

    static {


















































    }
}

/**
 * Total time: 180 ms
 */
