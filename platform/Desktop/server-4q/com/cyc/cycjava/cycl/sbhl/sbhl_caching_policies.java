package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.cache_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_caching_policies extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies";
    public static final String myFingerPrint = "e3f12b7b415b4e498c681a504284dac05a4aaea626360b9f55e48cdb0903fd7b";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 1109L)
    public static SubLSymbol $active_sbhl_caching_policies$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 2701L)
    public static SubLSymbol $valid_sbhl_caching_instruction_verb$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 3843L)
    public static SubLSymbol $valid_sbhl_caching_policy_types$;
    private static final SubLSymbol $sym0$_ACTIVE_SBHL_CACHING_POLICIES_;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$VALID_SBHL_CACHING_POLICY_TYPE_P;
    private static final SubLSymbol $kw4$LINK_PREDICATE;
    private static final SubLSymbol $kw5$POLICY;
    private static final SubLSymbol $kw6$UNKNOWN;
    private static final SubLSymbol $kw7$STICKY;
    private static final SubLSymbol $kw8$UNDEFINED;
    private static final SubLString $str9$Sticky_policy_does_not_support_ca;
    private static final SubLSymbol $kw10$CAPACITY;
    private static final SubLSymbol $kw11$ALL;
    private static final SubLString $str12$Invalid_exemption_specification__;
    private static final SubLSymbol $kw13$EXEMPT;
    private static final SubLSymbol $sym14$FORT_P;
    private static final SubLString $str15$Invalid_prefetch_specification__A;
    private static final SubLSymbol $kw16$PREFETCH;
    private static final SubLSymbol $kw17$SWAPOUT;
    private static final SubLString $str18$Swapout_policy_does_not_support_c;
    private static final SubLString $str19$Invalid_exemption_specification__;
    private static final SubLString $str20$Invalid_prefetch_specification__A;
    private static final SubLString $str21$Unknown_policy_type__A_____dont_k;
    private static final SubLSymbol $kw22$DONT_CACHE;
    private static final SubLSymbol $kw23$TOUCH;
    private static final SubLString $str24$Caching_policy_of_type__A_not_yet;
    private static final SubLSymbol $sym25$LIST_OF_FORT_P;
    private static final SubLSymbol $kw26$RESET;
    private static final SubLSymbol $kw27$ENFORCED;
    private static final SubLString $str28$Enforcing_SBHL_caching_policies;
    private static final SubLSymbol $sym29$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str30$__Skipping_invalid_SBHL_caching_p;
    private static final SubLString $str31$standard_kb_sbhl_caching_policies;
    private static final SubLSymbol $sym32$VALID_FORT_;
    private static final SubLInteger $int33$30;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$READY;
    private static final SubLSymbol $kw36$DONE;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLObject $const39$genls;
    private static final SubLObject $const40$genlInverse;
    private static final SubLSymbol $sym41$_;
    private static final SubLSymbol $sym42$GENERALITY_ESTIMATE_;
    private static final SubLObject $const43$genlPreds;
    private static final SubLObject $const44$genlMt;
    private static final SubLList $list45;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 3674L)
    public static SubLObject valid_sbhl_caching_instruction_verb_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isKeyword() && sbhl_caching_policies.NIL != subl_promotions.memberP(v_object, sbhl_caching_policies.$valid_sbhl_caching_instruction_verb$.getGlobalValue(), (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 4184L)
    public static SubLObject valid_sbhl_caching_policy_type_p(final SubLObject policy_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(policy_type.isKeyword() && sbhl_caching_policies.NIL != subl_promotions.memberP(policy_type, sbhl_caching_policies.$valid_sbhl_caching_policy_types$.getGlobalValue(), (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 4359L)
    public static SubLObject new_sbhl_caching_policy(final SubLObject link_predicate, final SubLObject policy_type, SubLObject capacity, SubLObject exemptions, SubLObject prefetch) {
        if (capacity == sbhl_caching_policies.UNPROVIDED) {
            capacity = sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue();
        }
        if (exemptions == sbhl_caching_policies.UNPROVIDED) {
            exemptions = (SubLObject)sbhl_caching_policies.NIL;
        }
        if (prefetch == sbhl_caching_policies.UNPROVIDED) {
            prefetch = (SubLObject)sbhl_caching_policies.NIL;
        }
        assert sbhl_caching_policies.NIL != valid_sbhl_caching_policy_type_p(policy_type) : policy_type;
        SubLObject policy = (SubLObject)sbhl_caching_policies.NIL;
        policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw4$LINK_PREDICATE, link_predicate);
        policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw5$POLICY, policy_type);
        policy = flesh_out_sbhl_caching_policy(policy, capacity, exemptions, prefetch);
        return policy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 5024L)
    public static SubLObject flesh_out_sbhl_caching_policy(SubLObject policy, SubLObject capacity, SubLObject exemptions, final SubLObject prefetch) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject policy_type = pcase_var = conses_high.getf(policy, (SubLObject)sbhl_caching_policies.$kw5$POLICY, (SubLObject)sbhl_caching_policies.$kw6$UNKNOWN);
        if (pcase_var.eql((SubLObject)sbhl_caching_policies.$kw7$STICKY)) {
            if (sbhl_caching_policies.NIL == capacity) {
                capacity = (SubLObject)sbhl_caching_policies.$kw8$UNDEFINED;
            }
            if (sbhl_caching_policies.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sbhl_caching_policies.$kw8$UNDEFINED != capacity) {
                Errors.error((SubLObject)sbhl_caching_policies.$str9$Sticky_policy_does_not_support_ca, capacity);
            }
            policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw10$CAPACITY, capacity);
            if (sbhl_caching_policies.NIL == exemptions) {
                exemptions = (SubLObject)sbhl_caching_policies.$kw11$ALL;
            }
            if (sbhl_caching_policies.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sbhl_caching_policies.$kw11$ALL != exemptions) {
                Errors.error((SubLObject)sbhl_caching_policies.$str12$Invalid_exemption_specification__, exemptions);
            }
            policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw13$EXEMPT, exemptions);
            if (sbhl_caching_policies.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sbhl_caching_policies.$kw11$ALL != prefetch && sbhl_caching_policies.NIL == list_utilities.list_of_type_p((SubLObject)sbhl_caching_policies.$sym14$FORT_P, prefetch)) {
                Errors.error((SubLObject)sbhl_caching_policies.$str15$Invalid_prefetch_specification__A, prefetch);
            }
            policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw16$PREFETCH, prefetch);
        }
        else if (pcase_var.eql((SubLObject)sbhl_caching_policies.$kw17$SWAPOUT)) {
            if (sbhl_caching_policies.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sbhl_caching_policies.NIL == subl_promotions.positive_integer_p(capacity)) {
                Errors.error((SubLObject)sbhl_caching_policies.$str18$Swapout_policy_does_not_support_c, capacity);
            }
            policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw10$CAPACITY, capacity);
            if (sbhl_caching_policies.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sbhl_caching_policies.$kw11$ALL != exemptions && sbhl_caching_policies.NIL == list_utilities.list_of_type_p((SubLObject)sbhl_caching_policies.$sym14$FORT_P, exemptions)) {
                Errors.error((SubLObject)sbhl_caching_policies.$str19$Invalid_exemption_specification__, exemptions);
            }
            policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw13$EXEMPT, exemptions);
            if (sbhl_caching_policies.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sbhl_caching_policies.NIL == list_utilities.list_of_type_p((SubLObject)sbhl_caching_policies.$sym14$FORT_P, prefetch)) {
                Errors.error((SubLObject)sbhl_caching_policies.$str20$Invalid_prefetch_specification__A, prefetch);
            }
            policy = conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw16$PREFETCH, prefetch);
        }
        else {
            Errors.error((SubLObject)sbhl_caching_policies.$str21$Unknown_policy_type__A_____dont_k, policy);
        }
        return policy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7273L)
    public static SubLObject clone_sbhl_caching_policy(final SubLObject policy) {
        return conses_high.copy_list(policy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7356L)
    public static SubLObject get_sbhl_caching_policy_link_predicate(final SubLObject policy) {
        return conses_high.getf(policy, (SubLObject)sbhl_caching_policies.$kw4$LINK_PREDICATE, (SubLObject)sbhl_caching_policies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7463L)
    public static SubLObject get_sbhl_caching_policy_type(final SubLObject policy) {
        return conses_high.getf(policy, (SubLObject)sbhl_caching_policies.$kw5$POLICY, (SubLObject)sbhl_caching_policies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7552L)
    public static SubLObject get_sbhl_caching_policy_capacity(final SubLObject policy) {
        return conses_high.getf(policy, (SubLObject)sbhl_caching_policies.$kw10$CAPACITY, (SubLObject)sbhl_caching_policies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7647L)
    public static SubLObject get_sbhl_caching_policy_terms_to_exempt(final SubLObject policy) {
        return conses_high.getf(policy, (SubLObject)sbhl_caching_policies.$kw13$EXEMPT, (SubLObject)sbhl_caching_policies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7747L)
    public static SubLObject set_sbhl_caching_policy_terms_to_exempt(final SubLObject policy, final SubLObject exempt) {
        return conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw16$PREFETCH, exempt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7861L)
    public static SubLObject get_sbhl_caching_policy_terms_to_prefetch(final SubLObject policy) {
        return conses_high.getf(policy, (SubLObject)sbhl_caching_policies.$kw16$PREFETCH, (SubLObject)sbhl_caching_policies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7964L)
    public static SubLObject set_sbhl_caching_policy_terms_to_prefetch(final SubLObject policy, final SubLObject prefetches) {
        return conses_high.putf(policy, (SubLObject)sbhl_caching_policies.$kw16$PREFETCH, prefetches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 8088L)
    public static SubLObject reset_sbhl_caching_policy(final SubLObject policy) {
        final SubLObject predicate = get_sbhl_caching_policy_link_predicate(policy);
        if (sbhl_caching_policies.NIL != forts.valid_fortP(predicate)) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module(predicate);
            if (sbhl_caching_policies.NIL != sbhl_module_vars.sbhl_module_p(module)) {
                sbhl_graphs.swap_out_all_pristine_graph_links(module);
                return implement_sbhl_caching_policy(policy);
            }
        }
        return (SubLObject)sbhl_caching_policies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 8694L)
    public static SubLObject implement_sbhl_caching_policy(final SubLObject policy) {
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sbhl_caching_policies.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject predicate = get_sbhl_caching_policy_link_predicate(policy);
            final SubLObject module = sbhl_module_vars.get_sbhl_module(predicate);
            final SubLObject pcase_var;
            final SubLObject policy_type = pcase_var = get_sbhl_caching_policy_type(policy);
            if (pcase_var.eql((SubLObject)sbhl_caching_policies.$kw7$STICKY)) {
                sbhl_graphs.set_cache_strategy_for_sbhl_module(module, (SubLObject)sbhl_caching_policies.$kw22$DONT_CACHE);
            }
            else if (pcase_var.eql((SubLObject)sbhl_caching_policies.$kw17$SWAPOUT)) {
                final SubLObject capacity = get_sbhl_caching_policy_capacity(policy);
                final SubLObject cache_strategy = sbhl_graphs.new_cache_strategy_for_sbhl_module(module, capacity);
                sbhl_graphs.set_cache_strategy_for_sbhl_module(module, cache_strategy);
                seed_sbhl_module_graph_cache_with_nodes(module, get_sbhl_caching_policy_terms_to_exempt(policy), (SubLObject)sbhl_caching_policies.$kw23$TOUCH);
            }
            else {
                Errors.error((SubLObject)sbhl_caching_policies.$str24$Caching_policy_of_type__A_not_yet, policy_type);
            }
            seed_sbhl_module_graph_cache_with_nodes(module, get_sbhl_caching_policy_terms_to_prefetch(policy), (SubLObject)sbhl_caching_policies.UNPROVIDED);
            dictionary.dictionary_enter(sbhl_caching_policies.$active_sbhl_caching_policies$.getGlobalValue(), predicate, policy);
        }
        finally {
            if (sbhl_caching_policies.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return policy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 10118L)
    public static SubLObject seed_sbhl_module_graph_cache_with_nodes(final SubLObject module, final SubLObject nodes, SubLObject touch_p) {
        if (touch_p == sbhl_caching_policies.UNPROVIDED) {
            touch_p = (SubLObject)sbhl_caching_policies.NIL;
        }
        if (sbhl_caching_policies.NIL == nodes) {
            return Values.values(module, (SubLObject)sbhl_caching_policies.ZERO_INTEGER, touch_p);
        }
        SubLObject paged_in = (SubLObject)sbhl_caching_policies.ZERO_INTEGER;
        SubLObject term_list = nodes;
        if (sbhl_caching_policies.$kw11$ALL == term_list) {
            term_list = get_all_nodes_for_sbhl_module_graph(module);
        }
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = (SubLObject)sbhl_caching_policies.NIL;
        v_term = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            if (sbhl_caching_policies.NIL != forts.valid_fortP(v_term)) {
                sbhl_graphs.get_sbhl_graph_link(v_term, module);
                paged_in = Numbers.add(paged_in, (SubLObject)sbhl_caching_policies.ONE_INTEGER);
                if (sbhl_caching_policies.NIL != touch_p) {
                    sbhl_graphs.touch_sbhl_graph_link(v_term, sbhl_graphs.get_sbhl_graph_link(v_term, module), module);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Values.values(module, paged_in, touch_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 10938L)
    public static SubLObject get_all_nodes_for_sbhl_module_graph(final SubLObject module) {
        return map_utilities.map_keys(sbhl_module_utilities.get_sbhl_graph(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 11110L)
    public static SubLObject create_sbhl_caching_policy_from_term_recommendation_list(final SubLObject link_predicate, final SubLObject policy_type, final SubLObject capacity, final SubLObject term_list, SubLObject exempt, SubLObject prefetch) {
        if (exempt == sbhl_caching_policies.UNPROVIDED) {
            exempt = (SubLObject)sbhl_caching_policies.ZERO_INTEGER;
        }
        if (prefetch == sbhl_caching_policies.UNPROVIDED) {
            prefetch = (SubLObject)sbhl_caching_policies.ZERO_INTEGER;
        }
        assert sbhl_caching_policies.NIL != forts.list_of_fort_p(term_list) : term_list;
        assert sbhl_caching_policies.NIL != forts.fort_p(link_predicate) : link_predicate;
        SubLObject exemptions = (SubLObject)sbhl_caching_policies.NIL;
        SubLObject prefetchers = (SubLObject)sbhl_caching_policies.NIL;
        if (exempt == sbhl_caching_policies.$kw11$ALL) {
            exemptions = (SubLObject)sbhl_caching_policies.$kw11$ALL;
            if (prefetch == sbhl_caching_policies.$kw11$ALL) {
                prefetchers = (SubLObject)sbhl_caching_policies.$kw11$ALL;
            }
            else {
                prefetchers = (SubLObject)(prefetch.isFixnum() ? list_utilities.first_n(prefetch, term_list) : sbhl_caching_policies.NIL);
            }
        }
        else {
            exemptions = (SubLObject)(exempt.isFixnum() ? list_utilities.first_n(exempt, term_list) : sbhl_caching_policies.NIL);
            prefetchers = (SubLObject)((exempt.isFixnum() && prefetch.isFixnum()) ? list_utilities.last_n(prefetch, list_utilities.first_n(Numbers.add(exempt, prefetch), term_list)) : sbhl_caching_policies.NIL);
        }
        return new_sbhl_caching_policy(link_predicate, policy_type, capacity, exemptions, prefetchers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 12476L)
    public static SubLObject save_sbhl_caching_policies(final SubLObject policies, final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == sbhl_caching_policies.UNPROVIDED) {
            externalizedP = (SubLObject)sbhl_caching_policies.T;
        }
        if (sbhl_caching_policies.NIL != externalizedP) {
            cfasl_utilities.cfasl_save_externalized(policies, policies_file);
        }
        else {
            cfasl_utilities.cfasl_save(policies, policies_file);
        }
        return policies_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 12818L)
    public static SubLObject load_sbhl_caching_policies(final SubLObject policies_file) {
        return cfasl_utilities.cfasl_load(policies_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13013L)
    public static SubLObject reset_sbhl_caching_policies(final SubLObject policies_file) {
        reset_sbhl_caching_policies_internal(load_sbhl_caching_policies(policies_file));
        return policies_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13263L)
    public static SubLObject reset_sbhl_caching_policies_internal(final SubLObject policies) {
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue((SubLObject)sbhl_caching_policies.NIL);
        dictionary.clear_dictionary(sbhl_caching_policies.$active_sbhl_caching_policies$.getGlobalValue());
        SubLObject cdolist_list_var = policies;
        SubLObject policy = (SubLObject)sbhl_caching_policies.NIL;
        policy = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            reset_sbhl_caching_policy(policy);
            cdolist_list_var = cdolist_list_var.rest();
            policy = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_caching_policies.$kw26$RESET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13582L)
    public static SubLObject enforce_monolithic_kb_sbhl_caching_policies() {
        final SubLObject policies = builder_utilities.propose_completely_cached_kb_sbhl_caching_policies((SubLObject)sbhl_caching_policies.UNPROVIDED);
        reset_sbhl_caching_policies_internal(policies);
        return (SubLObject)sbhl_caching_policies.$kw27$ENFORCED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 14099L)
    public static SubLObject enforce_standard_kb_sbhl_caching_policies(final SubLObject dump_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)sbhl_caching_policies.$str28$Enforcing_SBHL_caching_policies;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)sbhl_caching_policies.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sbhl_caching_policies.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)sbhl_caching_policies.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)sbhl_caching_policies.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((sbhl_caching_policies.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sbhl_caching_policies.T), thread);
            utilities_macros.noting_progress_preamble(str);
            final SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename(dump_directory);
            SubLObject policies = (SubLObject)sbhl_caching_policies.NIL;
            if (sbhl_caching_policies.NIL != Filesys.probe_file(policies_file)) {
                SubLObject msg = (SubLObject)sbhl_caching_policies.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sbhl_caching_policies.$sym29$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            policies = load_sbhl_caching_policies(policies_file);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sbhl_caching_policies.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (msg.isString()) {
                    Errors.warn((SubLObject)sbhl_caching_policies.$str30$__Skipping_invalid_SBHL_caching_p, policies_file, msg);
                }
            }
            if (sbhl_caching_policies.NIL == list_utilities.sublisp_boolean(policies)) {
                policies = builder_utilities.propose_legacy_kb_sbhl_caching_policies((SubLObject)sbhl_caching_policies.UNPROVIDED);
            }
            reset_sbhl_caching_policies_internal(policies);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_caching_policies.$kw27$ENFORCED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15107L)
    public static SubLObject dump_active_kb_sbhl_caching_policies(final SubLObject dump_directory, SubLObject externalizedP) {
        if (externalizedP == sbhl_caching_policies.UNPROVIDED) {
            externalizedP = (SubLObject)sbhl_caching_policies.NIL;
        }
        final SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename(dump_directory);
        final SubLObject policies = gather_active_kb_sbhl_caching_policies();
        save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15532L)
    public static SubLObject get_standard_kb_sbhl_caching_policies_filename(final SubLObject dump_directory) {
        return dumper.kb_dump_file((SubLObject)sbhl_caching_policies.$str31$standard_kb_sbhl_caching_policies, dump_directory, (SubLObject)sbhl_caching_policies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15695L)
    public static SubLObject gather_active_kb_sbhl_caching_policies() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject policies = (SubLObject)sbhl_caching_policies.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_caching_policies.$active_sbhl_caching_policies$.getGlobalValue())); sbhl_caching_policies.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject policy = gather_one_active_kb_sbhl_caching_policy(predicate);
            policies = (SubLObject)ConsesLow.cons(policy, policies);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return policies;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 16099L)
    public static SubLObject gather_one_active_kb_sbhl_caching_policy(final SubLObject predicate) {
        SubLObject policy = dictionary.dictionary_lookup(sbhl_caching_policies.$active_sbhl_caching_policies$.getGlobalValue(), predicate, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        final SubLObject exemptions = get_sbhl_caching_policy_terms_to_exempt(policy);
        final SubLObject clean_exemptions = prepare_kb_sbhl_caching_policy_term_list_for_dumping(exemptions);
        final SubLObject prefetches = get_sbhl_caching_policy_terms_to_prefetch(policy);
        final SubLObject clean_prefetches = prepare_kb_sbhl_caching_policy_term_list_for_dumping(prefetches);
        if (!exemptions.eql(clean_exemptions) || !prefetches.eql(clean_prefetches)) {
            policy = clone_sbhl_caching_policy(policy);
            policy = set_sbhl_caching_policy_terms_to_exempt(policy, clean_exemptions);
            policy = set_sbhl_caching_policy_terms_to_prefetch(policy, clean_prefetches);
        }
        return policy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 17149L)
    public static SubLObject prepare_kb_sbhl_caching_policy_term_list_for_dumping(final SubLObject term_list) {
        if (term_list.isList() && sbhl_caching_policies.NIL != list_utilities.sublisp_boolean(list_utilities.find_if_not((SubLObject)sbhl_caching_policies.$sym32$VALID_FORT_, term_list, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED))) {
            return list_utilities.find_all_if((SubLObject)sbhl_caching_policies.$sym32$VALID_FORT_, term_list, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        }
        return term_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 17617L)
    public static SubLObject setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering() {
        sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue((SubLObject)sbhl_caching_policies.NIL);
        sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$.setDynamicValue((SubLObject)sbhl_caching_policies.$int33$30);
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_caching_policies.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject module = (SubLObject)sbhl_caching_policies.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list34);
            key = current.first();
            current = (module = current.rest());
            sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(facade_sbhl_module_cache_strategies_for_recording((SubLObject)sbhl_caching_policies.UNPROVIDED));
        return (SubLObject)sbhl_caching_policies.$kw35$READY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 18703L)
    public static SubLObject setup_sbhl_graphs_for_sbhl_cache_tuning_experiment() {
        return (SubLObject)sbhl_caching_policies.$kw35$READY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 18839L)
    public static SubLObject tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment(final SubLObject ref_counts_map) {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_caching_policies.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject module = (SubLObject)sbhl_caching_policies.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list34);
            key = current.first();
            current = (module = current.rest());
            final SubLObject cache_strategy = sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
            final SubLObject recordings = cache_utilities.recording_cache_strategy_facade_get_records(cache_strategy);
            final SubLObject ref_counts = map_utilities.map_get(ref_counts_map, module, (SubLObject)sbhl_caching_policies.UNPROVIDED);
            final SubLObject updated_ref_counts = count_references_in_sbhl_cache_strategy_recordings(recordings, ref_counts);
            map_utilities.map_put(ref_counts_map, module, updated_ref_counts);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_caching_policies.$kw36$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 19738L)
    public static SubLObject contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment(final SubLObject cfasl_stream, final SubLObject ref_counts_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject alternate_map = dictionary.new_dictionary((SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(ref_counts_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)sbhl_caching_policies.NIL; sbhl_caching_policies.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_caching_policies.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_caching_policies.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject module = (SubLObject)sbhl_caching_policies.NIL;
                SubLObject ref_counts = (SubLObject)sbhl_caching_policies.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list37);
                module = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list37);
                ref_counts = current.first();
                current = current.rest();
                if (sbhl_caching_policies.NIL == current) {
                    map_utilities.map_put(alternate_map, sbhl_module_vars.get_sbhl_module_link_pred(module), ref_counts);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_caching_policies.$list37);
                }
            }
        }
        cfasl.cfasl_output(alternate_map, cfasl_stream);
        return (SubLObject)sbhl_caching_policies.$kw36$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 20242L)
    public static SubLObject tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering() {
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(unfacade_sbhl_module_cache_strategies_facaded_for_recording((SubLObject)sbhl_caching_policies.UNPROVIDED));
        return (SubLObject)sbhl_caching_policies.$kw36$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 20538L)
    public static SubLObject facade_sbhl_module_cache_strategies_for_recording(SubLObject old_strategy_list) {
        if (old_strategy_list == sbhl_caching_policies.UNPROVIDED) {
            old_strategy_list = sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue();
        }
        final SubLObject time_stamper = integer_sequence_generator.new_integer_sequence_generator((SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        SubLObject new_strategy_list = (SubLObject)sbhl_caching_policies.NIL;
        SubLObject cdolist_list_var = old_strategy_list;
        SubLObject cache_tuple = (SubLObject)sbhl_caching_policies.NIL;
        cache_tuple = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            SubLObject new_strategy = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject current;
            final SubLObject datum = current = cache_tuple;
            SubLObject sbhl_module = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject cache_strategy = (SubLObject)sbhl_caching_policies.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list38);
            sbhl_module = current.first();
            current = (cache_strategy = current.rest());
            if (sbhl_caching_policies.NIL != cache_utilities.recording_cache_strategy_facade_p(cache_strategy)) {
                new_strategy = cache_strategy;
            }
            else {
                new_strategy = cache_utilities.new_recording_cache_strategy_facade(cache_strategy, time_stamper);
            }
            new_strategy_list = list_utilities.alist_enter(new_strategy_list, sbhl_module, new_strategy, (SubLObject)sbhl_caching_policies.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cache_tuple = cdolist_list_var.first();
        }
        return new_strategy_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 21615L)
    public static SubLObject unfacade_sbhl_module_cache_strategies_facaded_for_recording(SubLObject old_strategy_list) {
        if (old_strategy_list == sbhl_caching_policies.UNPROVIDED) {
            old_strategy_list = sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue();
        }
        SubLObject new_strategy_list = (SubLObject)sbhl_caching_policies.NIL;
        SubLObject cdolist_list_var = old_strategy_list;
        SubLObject cache_tuple = (SubLObject)sbhl_caching_policies.NIL;
        cache_tuple = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            SubLObject new_strategy = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject current;
            final SubLObject datum = current = cache_tuple;
            SubLObject sbhl_module = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject cache_strategy = (SubLObject)sbhl_caching_policies.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list38);
            sbhl_module = current.first();
            current = (cache_strategy = current.rest());
            if (sbhl_caching_policies.NIL != cache_utilities.recording_cache_strategy_facade_p(cache_strategy)) {
                new_strategy = cache_utilities.recording_cache_strategy_facade_get_facaded_cache_strategy(cache_strategy);
            }
            else {
                new_strategy = cache_strategy;
            }
            new_strategy_list = list_utilities.alist_enter(new_strategy_list, sbhl_module, new_strategy, (SubLObject)sbhl_caching_policies.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cache_tuple = cdolist_list_var.first();
        }
        return new_strategy_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 22748L)
    public static SubLObject recommend_sbhl_caching_preference_term_list_from_recordings(final SubLObject recording, final SubLObject sbhl_module) {
        final SubLObject references = count_references_in_sbhl_cache_strategy_recordings(recording, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        return recommend_sbhl_caching_preference_term_list_from_ref_counts(references, sbhl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 23650L)
    public static SubLObject recommend_sbhl_caching_preference_term_list_from_ref_counts(final SubLObject ref_counts, final SubLObject sbhl_module) {
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_module);
        if (pcase_var.eql(sbhl_caching_policies.$const39$genls) || pcase_var.eql(sbhl_caching_policies.$const40$genlInverse)) {
            final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, Symbols.symbol_function((SubLObject)sbhl_caching_policies.$sym41$_), (SubLObject)sbhl_caching_policies.UNPROVIDED);
            final SubLObject generality_ranked = Sort.sort(conses_high.copy_list(term_list), (SubLObject)sbhl_caching_policies.$sym42$GENERALITY_ESTIMATE_, (SubLObject)sbhl_caching_policies.UNPROVIDED);
            return list_utilities.rerank(generality_ranked, term_list, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        }
        if (pcase_var.eql(sbhl_caching_policies.$const43$genlPreds)) {
            final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, Symbols.symbol_function((SubLObject)sbhl_caching_policies.$sym41$_), (SubLObject)sbhl_caching_policies.UNPROVIDED);
            final SubLObject generality_ranked = Sort.sort(conses_high.copy_list(term_list), (SubLObject)sbhl_caching_policies.$sym42$GENERALITY_ESTIMATE_, (SubLObject)sbhl_caching_policies.UNPROVIDED);
            return list_utilities.rerank(generality_ranked, term_list, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        }
        if (pcase_var.eql(sbhl_caching_policies.$const44$genlMt)) {
            final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, Symbols.symbol_function((SubLObject)sbhl_caching_policies.$sym41$_), (SubLObject)sbhl_caching_policies.UNPROVIDED);
            final SubLObject generality_ranked = Sort.sort(conses_high.copy_list(term_list), (SubLObject)sbhl_caching_policies.$sym42$GENERALITY_ESTIMATE_, (SubLObject)sbhl_caching_policies.UNPROVIDED);
            return list_utilities.rerank(generality_ranked, term_list, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        }
        final SubLObject term_list = dictionary_utilities.dictionary_keys_sorted_by_values(ref_counts, Symbols.symbol_function((SubLObject)sbhl_caching_policies.$sym41$_), (SubLObject)sbhl_caching_policies.UNPROVIDED);
        return term_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 25405L)
    public static SubLObject count_references_in_sbhl_cache_strategy_recordings(final SubLObject recording, SubLObject ref_counts) {
        if (ref_counts == sbhl_caching_policies.UNPROVIDED) {
            ref_counts = (SubLObject)sbhl_caching_policies.NIL;
        }
        final SubLObject references = (sbhl_caching_policies.NIL != dictionary.dictionary_p(ref_counts)) ? ref_counts : dictionary.new_dictionary((SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED);
        SubLObject cdolist_list_var = recording;
        SubLObject action = (SubLObject)sbhl_caching_policies.NIL;
        action = cdolist_list_var.first();
        while (sbhl_caching_policies.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = action;
            SubLObject time_stamp = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject action_type = (SubLObject)sbhl_caching_policies.NIL;
            SubLObject v_term = (SubLObject)sbhl_caching_policies.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list45);
            time_stamp = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list45);
            action_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_caching_policies.$list45);
            v_term = current.first();
            current = current.rest();
            if (sbhl_caching_policies.NIL == current) {
                if (sbhl_caching_policies.NIL != forts.valid_fortP(v_term)) {
                    dictionary_utilities.dictionary_increment(references, v_term, (SubLObject)sbhl_caching_policies.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_caching_policies.$list45);
            }
            cdolist_list_var = cdolist_list_var.rest();
            action = cdolist_list_var.first();
        }
        return references;
    }
    
    public static SubLObject declare_sbhl_caching_policies_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "valid_sbhl_caching_instruction_verb_p", "VALID-SBHL-CACHING-INSTRUCTION-VERB-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "valid_sbhl_caching_policy_type_p", "VALID-SBHL-CACHING-POLICY-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "new_sbhl_caching_policy", "NEW-SBHL-CACHING-POLICY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "flesh_out_sbhl_caching_policy", "FLESH-OUT-SBHL-CACHING-POLICY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "clone_sbhl_caching_policy", "CLONE-SBHL-CACHING-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_sbhl_caching_policy_link_predicate", "GET-SBHL-CACHING-POLICY-LINK-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_sbhl_caching_policy_type", "GET-SBHL-CACHING-POLICY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_sbhl_caching_policy_capacity", "GET-SBHL-CACHING-POLICY-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_sbhl_caching_policy_terms_to_exempt", "GET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "set_sbhl_caching_policy_terms_to_exempt", "SET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_sbhl_caching_policy_terms_to_prefetch", "GET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "set_sbhl_caching_policy_terms_to_prefetch", "SET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "reset_sbhl_caching_policy", "RESET-SBHL-CACHING-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "implement_sbhl_caching_policy", "IMPLEMENT-SBHL-CACHING-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "seed_sbhl_module_graph_cache_with_nodes", "SEED-SBHL-MODULE-GRAPH-CACHE-WITH-NODES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_all_nodes_for_sbhl_module_graph", "GET-ALL-NODES-FOR-SBHL-MODULE-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "create_sbhl_caching_policy_from_term_recommendation_list", "CREATE-SBHL-CACHING-POLICY-FROM-TERM-RECOMMENDATION-LIST", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "save_sbhl_caching_policies", "SAVE-SBHL-CACHING-POLICIES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "load_sbhl_caching_policies", "LOAD-SBHL-CACHING-POLICIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "reset_sbhl_caching_policies", "RESET-SBHL-CACHING-POLICIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "reset_sbhl_caching_policies_internal", "RESET-SBHL-CACHING-POLICIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "enforce_monolithic_kb_sbhl_caching_policies", "ENFORCE-MONOLITHIC-KB-SBHL-CACHING-POLICIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "enforce_standard_kb_sbhl_caching_policies", "ENFORCE-STANDARD-KB-SBHL-CACHING-POLICIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "dump_active_kb_sbhl_caching_policies", "DUMP-ACTIVE-KB-SBHL-CACHING-POLICIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "get_standard_kb_sbhl_caching_policies_filename", "GET-STANDARD-KB-SBHL-CACHING-POLICIES-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "gather_active_kb_sbhl_caching_policies", "GATHER-ACTIVE-KB-SBHL-CACHING-POLICIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "gather_one_active_kb_sbhl_caching_policy", "GATHER-ONE-ACTIVE-KB-SBHL-CACHING-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "prepare_kb_sbhl_caching_policy_term_list_for_dumping", "PREPARE-KB-SBHL-CACHING-POLICY-TERM-LIST-FOR-DUMPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "setup_sbhl_graphs_for_sbhl_cache_tuning_experiment", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment", "CONTRIBUTE-SBHL-GRAPHS-DATA-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "facade_sbhl_module_cache_strategies_for_recording", "FACADE-SBHL-MODULE-CACHE-STRATEGIES-FOR-RECORDING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "unfacade_sbhl_module_cache_strategies_facaded_for_recording", "UNFACADE-SBHL-MODULE-CACHE-STRATEGIES-FACADED-FOR-RECORDING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "recommend_sbhl_caching_preference_term_list_from_recordings", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-RECORDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "recommend_sbhl_caching_preference_term_list_from_ref_counts", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-REF-COUNTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies", "count_references_in_sbhl_cache_strategy_recordings", "COUNT-REFERENCES-IN-SBHL-CACHE-STRATEGY-RECORDINGS", 1, 1, false);
        return (SubLObject)sbhl_caching_policies.NIL;
    }
    
    public static SubLObject init_sbhl_caching_policies_file() {
        sbhl_caching_policies.$active_sbhl_caching_policies$ = SubLFiles.deflexical("*ACTIVE-SBHL-CACHING-POLICIES*", (sbhl_caching_policies.NIL != Symbols.boundp((SubLObject)sbhl_caching_policies.$sym0$_ACTIVE_SBHL_CACHING_POLICIES_)) ? sbhl_caching_policies.$active_sbhl_caching_policies$.getGlobalValue() : dictionary.new_dictionary((SubLObject)sbhl_caching_policies.UNPROVIDED, (SubLObject)sbhl_caching_policies.UNPROVIDED));
        sbhl_caching_policies.$valid_sbhl_caching_instruction_verb$ = SubLFiles.deflexical("*VALID-SBHL-CACHING-INSTRUCTION-VERB*", (SubLObject)sbhl_caching_policies.$list1);
        sbhl_caching_policies.$valid_sbhl_caching_policy_types$ = SubLFiles.deflexical("*VALID-SBHL-CACHING-POLICY-TYPES*", (SubLObject)sbhl_caching_policies.$list2);
        return (SubLObject)sbhl_caching_policies.NIL;
    }
    
    public static SubLObject setup_sbhl_caching_policies_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_caching_policies.$sym0$_ACTIVE_SBHL_CACHING_POLICIES_);
        return (SubLObject)sbhl_caching_policies.NIL;
    }
    
    public void declareFunctions() {
        declare_sbhl_caching_policies_file();
    }
    
    public void initializeVariables() {
        init_sbhl_caching_policies_file();
    }
    
    public void runTopLevelForms() {
        setup_sbhl_caching_policies_file();
    }
    
    static {
        me = (SubLFile)new sbhl_caching_policies();
        sbhl_caching_policies.$active_sbhl_caching_policies$ = null;
        sbhl_caching_policies.$valid_sbhl_caching_instruction_verb$ = null;
        sbhl_caching_policies.$valid_sbhl_caching_policy_types$ = null;
        $sym0$_ACTIVE_SBHL_CACHING_POLICIES_ = SubLObjectFactory.makeSymbol("*ACTIVE-SBHL-CACHING-POLICIES*");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("POLICY"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("EXEMPT"), (SubLObject)SubLObjectFactory.makeKeyword("PREFETCH"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STICKY"), (SubLObject)SubLObjectFactory.makeKeyword("SWAPOUT"));
        $sym3$VALID_SBHL_CACHING_POLICY_TYPE_P = SubLObjectFactory.makeSymbol("VALID-SBHL-CACHING-POLICY-TYPE-P");
        $kw4$LINK_PREDICATE = SubLObjectFactory.makeKeyword("LINK-PREDICATE");
        $kw5$POLICY = SubLObjectFactory.makeKeyword("POLICY");
        $kw6$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw7$STICKY = SubLObjectFactory.makeKeyword("STICKY");
        $kw8$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
        $str9$Sticky_policy_does_not_support_ca = SubLObjectFactory.makeString("Sticky policy does not support capacity ~A, only :undefined.");
        $kw10$CAPACITY = SubLObjectFactory.makeKeyword("CAPACITY");
        $kw11$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str12$Invalid_exemption_specification__ = SubLObjectFactory.makeString("Invalid exemption specification ~A. Only :all is permitted for sticky policy.");
        $kw13$EXEMPT = SubLObjectFactory.makeKeyword("EXEMPT");
        $sym14$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str15$Invalid_prefetch_specification__A = SubLObjectFactory.makeString("Invalid prefetch specification ~A. Only :ALL or lists of FORT-P (incl NIL) are permitted.");
        $kw16$PREFETCH = SubLObjectFactory.makeKeyword("PREFETCH");
        $kw17$SWAPOUT = SubLObjectFactory.makeKeyword("SWAPOUT");
        $str18$Swapout_policy_does_not_support_c = SubLObjectFactory.makeString("Swapout policy does not support capacity ~A, only positive integer capacities are supported.");
        $str19$Invalid_exemption_specification__ = SubLObjectFactory.makeString("Invalid exemption specification ~A. Only lists of FORT-P (incl NIL) or :all are permitted.");
        $str20$Invalid_prefetch_specification__A = SubLObjectFactory.makeString("Invalid prefetch specification ~A. Only lists of FORT-P (incl NIL) are permitted.");
        $str21$Unknown_policy_type__A_____dont_k = SubLObjectFactory.makeString("Unknown policy type ~A ... dont know what to do.");
        $kw22$DONT_CACHE = SubLObjectFactory.makeKeyword("DONT-CACHE");
        $kw23$TOUCH = SubLObjectFactory.makeKeyword("TOUCH");
        $str24$Caching_policy_of_type__A_not_yet = SubLObjectFactory.makeString("Caching policy of type ~A not yet implemented.");
        $sym25$LIST_OF_FORT_P = SubLObjectFactory.makeSymbol("LIST-OF-FORT-P");
        $kw26$RESET = SubLObjectFactory.makeKeyword("RESET");
        $kw27$ENFORCED = SubLObjectFactory.makeKeyword("ENFORCED");
        $str28$Enforcing_SBHL_caching_policies = SubLObjectFactory.makeString("Enforcing SBHL caching policies");
        $sym29$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str30$__Skipping_invalid_SBHL_caching_p = SubLObjectFactory.makeString("~&Skipping invalid SBHL caching policies file ~A.~%Load attempt caused error: ~A.~%");
        $str31$standard_kb_sbhl_caching_policies = SubLObjectFactory.makeString("standard-kb-sbhl-caching-policies");
        $sym32$VALID_FORT_ = SubLObjectFactory.makeSymbol("VALID-FORT?");
        $int33$30 = SubLObjectFactory.makeInteger(30);
        $list34 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $kw35$READY = SubLObjectFactory.makeKeyword("READY");
        $kw36$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("REF-COUNTS"));
        $list38 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SBHL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-STRATEGY"));
        $const39$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const40$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym41$_ = SubLObjectFactory.makeSymbol(">");
        $sym42$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE>");
        $const43$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const44$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME-STAMP"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
    }
}

/*

	Total time: 180 ms
	
*/