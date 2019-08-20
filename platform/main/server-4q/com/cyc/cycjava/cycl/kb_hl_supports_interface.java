package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$hl_lock$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_hl_supports_interface extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new kb_hl_supports_interface();







    private static final SubLSymbol KB_CREATE_KB_HL_SUPPORT = makeSymbol("KB-CREATE-KB-HL-SUPPORT");

    private static final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list4 = list(makeSymbol("HL-SUPPORT"), makeSymbol("JUSTIFICATION"));

    private static final SubLString $str5$Create_a_new_KB_HL_support_consis = makeString("Create a new KB HL support consisting of JUSTIFICATION for HL-SUPPORT.");

    private static final SubLList $list6 = list(list(makeSymbol("HL-SUPPORT"), makeSymbol("HL-SUPPORT-P")), list(makeSymbol("JUSTIFICATION"), makeSymbol("HL-JUSTIFICATION-P")));

    private static final SubLList $list7 = list(makeSymbol("KB-HL-SUPPORT-P"));

    private static final SubLSymbol KB_CREATE_KB_HL_SUPPORT_KB_STORE = makeSymbol("KB-CREATE-KB-HL-SUPPORT-KB-STORE");



    private static final SubLSymbol KB_REMOVE_KB_HL_SUPPORT = makeSymbol("KB-REMOVE-KB-HL-SUPPORT");



    private static final SubLList $list12 = list(makeSymbol("KB-HL-SUPPORT"));

    private static final SubLString $str13$Remove_KB_HL_SUPPORT_from_the_KB_ = makeString("Remove KB-HL-SUPPORT from the KB, and unhook its indexing.");

    private static final SubLList $list14 = list(list(makeSymbol("KB-HL-SUPPORT"), makeSymbol("KB-HL-SUPPORT-P")));

    private static final SubLList $list15 = list(makeSymbol("NULL"));

    private static final SubLSymbol KB_LOOKUP_KB_HL_SUPPORT = makeSymbol("KB-LOOKUP-KB-HL-SUPPORT");

    private static final SubLList $list17 = list(makeSymbol("HL-SUPPORT"));

    private static final SubLString $str18$Return_the_kb_hl_support_with_HL_ = makeString("Return the kb-hl-support with HL-SUPPORT and JUSTIFICATION if it exists.\n   Return NIL otherwise.");

    private static final SubLList $list19 = list(list(makeSymbol("HL-SUPPORT"), makeSymbol("HL-SUPPORT-P")));

    private static final SubLList $list20 = list(list(makeSymbol("NIL-OR"), makeSymbol("KB-HL-SUPPORT-P")));



    private static final SubLSymbol KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM = makeSymbol("KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM");

    private static final SubLList $list23 = list(makeSymbol("TERM"));

    private static final SubLString $str24$Return_a_list_of_kb_hl_supports_m = makeString("Return a list of kb-hl-supports mentioning TERM if any exists.\n   Return NIL otherwise.");

    private static final SubLList $list25 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")));

    private static final SubLList $list26 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));

    private static final SubLSymbol KB_KB_HL_SUPPORT_ARGUMENT = makeSymbol("KB-KB-HL-SUPPORT-ARGUMENT");

    private static final SubLString $str28$Return_the_argument_for_KB_HL_SUP = makeString("Return the argument for KB-HL-SUPPORT.");

    private static final SubLList $list29 = list(makeSymbol("HL-JUSTIFICATION-P"));

    private static final SubLSymbol KB_KB_HL_SUPPORT_ARGUMENTS = makeSymbol("KB-KB-HL-SUPPORT-ARGUMENTS");

    private static final SubLString $str31$Return_the_arguments_for_KB_HL_SU = makeString("Return the arguments for KB-HL-SUPPORT.");

    private static final SubLSymbol KB_KB_HL_SUPPORT_DEPENDENTS = makeSymbol("KB-KB-HL-SUPPORT-DEPENDENTS");

    private static final SubLString $str33$Return_the_dependents_for_KB_HL_S = makeString("Return the dependents for KB-HL-SUPPORT.");

    private static final SubLSymbol KB_REJUSTIFY_KB_HL_SUPPORT = makeSymbol("KB-REJUSTIFY-KB-HL-SUPPORT");

    private static final SubLString $str35$Perform_TMS_on_KB_HL_SUPPORT_____ = makeString("Perform TMS on KB-HL-SUPPORT\n   @return kb-hl-support-p or :unjustifiable");

    private static final SubLSymbol KB_KB_HL_SUPPORT_SET_ARGUMENT = makeSymbol("KB-KB-HL-SUPPORT-SET-ARGUMENT");

    private static final SubLList $list37 = list(makeSymbol("KB-HL-SUPPORT"), makeSymbol("ARGUMENT"));

    private static final SubLString $str38$Replace_the_dependents_of_KB_HL_S = makeString("Replace the dependents of KB-HL-SUPPORT");

    private static final SubLList $list39 = list(makeSymbol("BOOLEAN-P"));

    private static final SubLSymbol KB_KB_HL_SUPPORT_ADD_DEPENDENT = makeSymbol("KB-KB-HL-SUPPORT-ADD-DEPENDENT");

    private static final SubLList $list41 = list(makeSymbol("KB-HL-SUPPORT"), makeSymbol("DEPENDENT"));

    private static final SubLString $str42$Add_a_dependent_to_KB_HL_SUPPORT = makeString("Add a dependent to KB-HL-SUPPORT");

    private static final SubLSymbol KB_KB_HL_SUPPORT_SET_DEPENDENTS = makeSymbol("KB-KB-HL-SUPPORT-SET-DEPENDENTS");

    private static final SubLList $list44 = list(makeSymbol("KB-HL-SUPPORT"), makeSymbol("DEPENDENTS"));

    public static SubLObject kb_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        SubLTrampolineFile.enforceType(hl_support, HL_SUPPORT_P);
        SubLTrampolineFile.enforceType(justification, HL_JUSTIFICATION_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_CREATE_KB_HL_SUPPORT, hl_support, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($hl_lock$.getGlobalValue());
                final SubLObject kb_hl_support = (NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_kb_hl_support_remote(hl_support, justification) : kb_create_kb_hl_support_local(hl_support, justification);
                kb_modification_event.post_kb_modify_create_new_kb_hl_support_event(hl_support, justification);
                hl_transcript_tracing.note_hlt_find_or_create_kb_hl_support(kb_hl_support);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return kb_hl_support;
            } finally {
                if (NIL != release) {
                    release_lock($hl_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_create_kb_hl_support_remote(final SubLObject hl_support, final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval(list(KB_CREATE_KB_HL_SUPPORT_KB_STORE, list_utilities.quotify(hl_support), list_utilities.quotify(justification)));
        SubLObject kb_hl_support = NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
            kb_hl_support = kb_hl_supports_low.kb_create_kb_hl_support_cyc(internal_id);
            if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                kb_hl_supports_low.kb_create_kb_hl_support_int(kb_hl_support, internal_id, hl_support, justification);
            }
        } finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return kb_hl_support;
    }

    public static SubLObject kb_create_kb_hl_support_local(final SubLObject hl_support, final SubLObject justification) {
        final SubLObject internal_id = kb_hl_supports_low.kb_create_kb_hl_support_kb_store(hl_support, justification);
        return kb_hl_support_handles.find_kb_hl_support_by_id(internal_id);
    }

    public static SubLObject kb_remove_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_REMOVE_KB_HL_SUPPORT, kb_hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REMOVE_KB_HL_SUPPORT, list(QUOTE, kb_hl_support)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    kb_modification_event.post_kb_modify_remove_kb_hl_support_event(kb_hl_support);
                    kb_hl_supports_low.destroy_kb_hl_support_int(kb_hl_support);
                    return NIL;
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject kb_lookup_kb_hl_support(final SubLObject hl_support) {
        SubLTrampolineFile.enforceType(hl_support, HL_SUPPORT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_KB_HL_SUPPORT, list(QUOTE, hl_support)));
        }
        final SubLObject kb_hl_support = kb_hl_supports_low.find_kb_hl_support_during_creation_int(hl_support);
        return NIL != kb_hl_support ? kb_hl_support : kb_hl_supports_low.lookup_kb_hl_support_int(hl_support);
    }

    public static SubLObject kb_lookup_kb_hl_supports_mentioning_term(final SubLObject v_term) {
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM, list(QUOTE, v_term)));
        }
        return kb_hl_supports_low.lookup_kb_hl_supports_mentioning_term_int(v_term);
    }

    public static SubLObject kb_kb_hl_support_argument(final SubLObject kb_hl_support) {
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_KB_HL_SUPPORT_ARGUMENT, list(QUOTE, kb_hl_support)));
        }
        return kb_hl_support_handles.kb_hl_support_argument_int(kb_hl_support);
    }

    public static SubLObject kb_kb_hl_support_arguments(final SubLObject kb_hl_support) {
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_KB_HL_SUPPORT_ARGUMENTS, list(QUOTE, kb_hl_support)));
        }
        return kb_hl_support_handles.kb_hl_support_arguments_int(kb_hl_support);
    }

    public static SubLObject kb_kb_hl_support_dependents(final SubLObject kb_hl_support) {
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_KB_HL_SUPPORT_DEPENDENTS, list(QUOTE, kb_hl_support)));
        }
        return kb_hl_support_handles.kb_hl_support_dependents_int(kb_hl_support);
    }

    public static SubLObject kb_rejustify_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_REJUSTIFY_KB_HL_SUPPORT, kb_hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REJUSTIFY_KB_HL_SUPPORT, list(QUOTE, kb_hl_support)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    return kb_hl_supports_low.rejustify_kb_hl_support_int(kb_hl_support);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject kb_kb_hl_support_set_argument(final SubLObject kb_hl_support, final SubLObject argument) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_KB_HL_SUPPORT_SET_ARGUMENT, kb_hl_support, argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_KB_HL_SUPPORT_SET_ARGUMENT, list(QUOTE, kb_hl_support), list(QUOTE, argument)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    kb_hl_supports_low.kb_hl_support_reset_argument_int(kb_hl_support, argument);
                    return kb_hl_support;
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject kb_kb_hl_support_add_dependent(final SubLObject kb_hl_support, final SubLObject dependent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_KB_HL_SUPPORT_ADD_DEPENDENT, kb_hl_support, dependent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_KB_HL_SUPPORT_ADD_DEPENDENT, list(QUOTE, kb_hl_support), list(QUOTE, dependent)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    if (NIL != assertion_handles.assertion_p(dependent)) {
                        Errors.sublisp_break(UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
                    }
                    return kb_hl_supports_low.kb_hl_support_add_dependent_int(kb_hl_support, dependent);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject kb_kb_hl_support_set_dependents(final SubLObject kb_hl_support, final SubLObject dependents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(kb_hl_support, KB_HL_SUPPORT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_KB_HL_SUPPORT_SET_DEPENDENTS, kb_hl_support, dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_KB_HL_SUPPORT_SET_DEPENDENTS, list(QUOTE, kb_hl_support), list(QUOTE, dependents)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    kb_hl_supports_low.kb_hl_support_clear_dependents_int(kb_hl_support);
                    SubLObject cdolist_list_var = dependents;
                    SubLObject dependent = NIL;
                    dependent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != assertion_handles.assertion_p(dependent)) {
                            Errors.sublisp_break(UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
                        }
                        kb_hl_supports_low.kb_hl_support_add_dependent_int(kb_hl_support, dependent);
                        cdolist_list_var = cdolist_list_var.rest();
                        dependent = cdolist_list_var.first();
                    } 
                    return kb_hl_support;
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject declare_kb_hl_supports_interface_file() {
        declareFunction("kb_create_kb_hl_support", "KB-CREATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("kb_create_kb_hl_support_remote", "KB-CREATE-KB-HL-SUPPORT-REMOTE", 2, 0, false);
        declareFunction("kb_create_kb_hl_support_local", "KB-CREATE-KB-HL-SUPPORT-LOCAL", 2, 0, false);
        declareFunction("kb_remove_kb_hl_support", "KB-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("kb_lookup_kb_hl_support", "KB-LOOKUP-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("kb_lookup_kb_hl_supports_mentioning_term", "KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        declareFunction("kb_kb_hl_support_argument", "KB-KB-HL-SUPPORT-ARGUMENT", 1, 0, false);
        declareFunction("kb_kb_hl_support_arguments", "KB-KB-HL-SUPPORT-ARGUMENTS", 1, 0, false);
        declareFunction("kb_kb_hl_support_dependents", "KB-KB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
        declareFunction("kb_rejustify_kb_hl_support", "KB-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("kb_kb_hl_support_set_argument", "KB-KB-HL-SUPPORT-SET-ARGUMENT", 2, 0, false);
        declareFunction("kb_kb_hl_support_add_dependent", "KB-KB-HL-SUPPORT-ADD-DEPENDENT", 2, 0, false);
        declareFunction("kb_kb_hl_support_set_dependents", "KB-KB-HL-SUPPORT-SET-DEPENDENTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_hl_supports_interface_file() {
        return NIL;
    }

    public static SubLObject setup_kb_hl_supports_interface_file() {
        register_cyc_api_function(KB_CREATE_KB_HL_SUPPORT, $list4, $str5$Create_a_new_KB_HL_support_consis, $list6, $list7);
        register_cyc_api_function(KB_REMOVE_KB_HL_SUPPORT, $list12, $str13$Remove_KB_HL_SUPPORT_from_the_KB_, $list14, $list15);
        register_cyc_api_function(KB_LOOKUP_KB_HL_SUPPORT, $list17, $str18$Return_the_kb_hl_support_with_HL_, $list19, $list20);
        register_cyc_api_function(KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM, $list23, $str24$Return_a_list_of_kb_hl_supports_m, $list25, $list26);
        register_cyc_api_function(KB_KB_HL_SUPPORT_ARGUMENT, $list12, $str28$Return_the_argument_for_KB_HL_SUP, $list14, $list29);
        register_cyc_api_function(KB_KB_HL_SUPPORT_ARGUMENTS, $list12, $str31$Return_the_arguments_for_KB_HL_SU, $list14, $list29);
        register_cyc_api_function(KB_KB_HL_SUPPORT_DEPENDENTS, $list12, $str33$Return_the_dependents_for_KB_HL_S, $list14, $list29);
        register_cyc_api_function(KB_REJUSTIFY_KB_HL_SUPPORT, $list12, $str35$Perform_TMS_on_KB_HL_SUPPORT_____, $list14, NIL);
        register_cyc_api_function(KB_KB_HL_SUPPORT_SET_ARGUMENT, $list37, $str38$Replace_the_dependents_of_KB_HL_S, $list14, $list39);
        register_cyc_api_function(KB_KB_HL_SUPPORT_ADD_DEPENDENT, $list41, $str42$Add_a_dependent_to_KB_HL_SUPPORT, $list14, $list39);
        register_cyc_api_function(KB_KB_HL_SUPPORT_SET_DEPENDENTS, $list44, $str38$Replace_the_dependents_of_KB_HL_S, $list14, $list39);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_hl_supports_interface_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_hl_supports_interface_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_hl_supports_interface_file();
    }

    static {














































    }
}

/**
 * Total time: 171 ms
 */
