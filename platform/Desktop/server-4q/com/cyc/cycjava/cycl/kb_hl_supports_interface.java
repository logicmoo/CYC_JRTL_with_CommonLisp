package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_supports_interface extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_hl_supports_interface";
    public static final String myFingerPrint = "c62f5fd04970e3066938be2c199806787b756d8ef725cb0a3ed8f73b5eec0a80";
    private static final SubLSymbol $sym0$HL_SUPPORT_P;
    private static final SubLSymbol $sym1$HL_JUSTIFICATION_P;
    private static final SubLSymbol $sym2$KB_CREATE_KB_HL_SUPPORT;
    private static final SubLSymbol $sym3$_EXIT;
    private static final SubLList $list4;
    private static final SubLString $str5$Create_a_new_KB_HL_support_consis;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$KB_CREATE_KB_HL_SUPPORT_KB_STORE;
    private static final SubLSymbol $sym9$KB_HL_SUPPORT_P;
    private static final SubLSymbol $sym10$KB_REMOVE_KB_HL_SUPPORT;
    private static final SubLSymbol $sym11$QUOTE;
    private static final SubLList $list12;
    private static final SubLString $str13$Remove_KB_HL_SUPPORT_from_the_KB_;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$KB_LOOKUP_KB_HL_SUPPORT;
    private static final SubLList $list17;
    private static final SubLString $str18$Return_the_kb_hl_support_with_HL_;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$INDEXED_TERM_P;
    private static final SubLSymbol $sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM;
    private static final SubLList $list23;
    private static final SubLString $str24$Return_a_list_of_kb_hl_supports_m;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$KB_KB_HL_SUPPORT_ARGUMENT;
    private static final SubLString $str28$Return_the_argument_for_KB_HL_SUP;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$KB_KB_HL_SUPPORT_ARGUMENTS;
    private static final SubLString $str31$Return_the_arguments_for_KB_HL_SU;
    private static final SubLSymbol $sym32$KB_KB_HL_SUPPORT_DEPENDENTS;
    private static final SubLString $str33$Return_the_dependents_for_KB_HL_S;
    private static final SubLSymbol $sym34$KB_REJUSTIFY_KB_HL_SUPPORT;
    private static final SubLString $str35$Perform_TMS_on_KB_HL_SUPPORT_____;
    private static final SubLSymbol $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT;
    private static final SubLList $list37;
    private static final SubLString $str38$Replace_the_dependents_of_KB_HL_S;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT;
    private static final SubLList $list41;
    private static final SubLString $str42$Add_a_dependent_to_KB_HL_SUPPORT;
    private static final SubLSymbol $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS;
    private static final SubLList $list44;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 1188L)
    public static SubLObject kb_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        enforceType(hl_support, kb_hl_supports_interface.$sym0$HL_SUPPORT_P);
        enforceType(justification, kb_hl_supports_interface.$sym1$HL_JUSTIFICATION_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)kb_hl_supports_interface.$sym2$KB_CREATE_KB_HL_SUPPORT, hl_support, justification, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = (SubLObject)kb_hl_supports_interface.NIL;
            try {
                release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                final SubLObject kb_hl_support = (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_kb_hl_support_remote(hl_support, justification) : kb_create_kb_hl_support_local(hl_support, justification);
                kb_modification_event.post_kb_modify_create_new_kb_hl_support_event(hl_support, justification);
                hl_transcript_tracing.note_hlt_find_or_create_kb_hl_support(kb_hl_support);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return kb_hl_support;
            }
            finally {
                if (kb_hl_supports_interface.NIL != release) {
                    Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                }
            }
        }
        return (SubLObject)kb_hl_supports_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 1913L)
    public static SubLObject kb_create_kb_hl_support_remote(final SubLObject hl_support, final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym8$KB_CREATE_KB_HL_SUPPORT_KB_STORE, list_utilities.quotify(hl_support), list_utilities.quotify(justification)));
        SubLObject kb_hl_support = (SubLObject)kb_hl_supports_interface.NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)kb_hl_supports_interface.T, thread);
            kb_hl_support = kb_hl_supports_low.kb_create_kb_hl_support_cyc(internal_id);
            if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
                kb_hl_supports_low.kb_create_kb_hl_support_int(kb_hl_support, internal_id, hl_support, justification);
            }
        }
        finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 2383L)
    public static SubLObject kb_create_kb_hl_support_local(final SubLObject hl_support, final SubLObject justification) {
        final SubLObject internal_id = kb_hl_supports_low.kb_create_kb_hl_support_kb_store(hl_support, justification);
        return kb_hl_support_handles.find_kb_hl_support_by_id(internal_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 2897L)
    public static SubLObject kb_remove_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        SubLObject result = (SubLObject)kb_hl_supports_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)kb_hl_supports_interface.$sym10$KB_REMOVE_KB_HL_SUPPORT, kb_hl_support, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym10$KB_REMOVE_KB_HL_SUPPORT, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support)));
        }
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)kb_hl_supports_interface.T, thread);
                SubLObject release = (SubLObject)kb_hl_supports_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    kb_modification_event.post_kb_modify_remove_kb_hl_support_event(kb_hl_support);
                    kb_hl_supports_low.destroy_kb_hl_support_int(kb_hl_support);
                    return (SubLObject)kb_hl_supports_interface.NIL;
                }
                finally {
                    if (kb_hl_supports_interface.NIL != release) {
                        Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 3534L)
    public static SubLObject kb_lookup_kb_hl_support(final SubLObject hl_support) {
        enforceType(hl_support, kb_hl_supports_interface.$sym0$HL_SUPPORT_P);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym16$KB_LOOKUP_KB_HL_SUPPORT, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, hl_support)));
        }
        final SubLObject kb_hl_support = kb_hl_supports_low.find_kb_hl_support_during_creation_int(hl_support);
        return (kb_hl_supports_interface.NIL != kb_hl_support) ? kb_hl_support : kb_hl_supports_low.lookup_kb_hl_support_int(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 4232L)
    public static SubLObject kb_lookup_kb_hl_supports_mentioning_term(final SubLObject v_term) {
        enforceType(v_term, kb_hl_supports_interface.$sym21$INDEXED_TERM_P);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, v_term)));
        }
        return kb_hl_supports_low.lookup_kb_hl_supports_mentioning_term_int(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 4831L)
    public static SubLObject kb_kb_hl_support_argument(final SubLObject kb_hl_support) {
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym27$KB_KB_HL_SUPPORT_ARGUMENT, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support)));
        }
        return kb_hl_support_handles.kb_hl_support_argument_int(kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 5335L)
    public static SubLObject kb_kb_hl_support_arguments(final SubLObject kb_hl_support) {
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym30$KB_KB_HL_SUPPORT_ARGUMENTS, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support)));
        }
        return kb_hl_support_handles.kb_hl_support_arguments_int(kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 5885L)
    public static SubLObject kb_kb_hl_support_dependents(final SubLObject kb_hl_support) {
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym32$KB_KB_HL_SUPPORT_DEPENDENTS, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support)));
        }
        return kb_hl_support_handles.kb_hl_support_dependents_int(kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 6397L)
    public static SubLObject kb_rejustify_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        SubLObject result = (SubLObject)kb_hl_supports_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)kb_hl_supports_interface.$sym34$KB_REJUSTIFY_KB_HL_SUPPORT, kb_hl_support, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym34$KB_REJUSTIFY_KB_HL_SUPPORT, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support)));
        }
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)kb_hl_supports_interface.T, thread);
                SubLObject release = (SubLObject)kb_hl_supports_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    return kb_hl_supports_low.rejustify_kb_hl_support_int(kb_hl_support);
                }
                finally {
                    if (kb_hl_supports_interface.NIL != release) {
                        Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 6987L)
    public static SubLObject kb_kb_hl_support_set_argument(final SubLObject kb_hl_support, final SubLObject argument) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        SubLObject result = (SubLObject)kb_hl_supports_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)kb_hl_supports_interface.$sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT, kb_hl_support, argument, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support), (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, argument)));
        }
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)kb_hl_supports_interface.T, thread);
                SubLObject release = (SubLObject)kb_hl_supports_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    kb_hl_supports_low.kb_hl_support_reset_argument_int(kb_hl_support, argument);
                    return kb_hl_support;
                }
                finally {
                    if (kb_hl_supports_interface.NIL != release) {
                        Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 7531L)
    public static SubLObject kb_kb_hl_support_add_dependent(final SubLObject kb_hl_support, final SubLObject dependent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        SubLObject result = (SubLObject)kb_hl_supports_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)kb_hl_supports_interface.$sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT, kb_hl_support, dependent, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support), (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, dependent)));
        }
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)kb_hl_supports_interface.T, thread);
                SubLObject release = (SubLObject)kb_hl_supports_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    if (kb_hl_supports_interface.NIL != assertion_handles.assertion_p(dependent)) {
                        Errors.sublisp_break((SubLObject)kb_hl_supports_interface.UNPROVIDED, kb_hl_supports_interface.EMPTY_SUBL_OBJECT_ARRAY);
                    }
                    return kb_hl_supports_low.kb_hl_support_add_dependent_int(kb_hl_support, dependent);
                }
                finally {
                    if (kb_hl_supports_interface.NIL != release) {
                        Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 8149L)
    public static SubLObject kb_kb_hl_support_set_dependents(final SubLObject kb_hl_support, final SubLObject dependents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(kb_hl_support, kb_hl_supports_interface.$sym9$KB_HL_SUPPORT_P);
        SubLObject result = (SubLObject)kb_hl_supports_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)kb_hl_supports_interface.$sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS, kb_hl_support, dependents, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED, (SubLObject)kb_hl_supports_interface.UNPROVIDED);
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, kb_hl_support), (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_interface.$sym11$QUOTE, dependents)));
        }
        if (kb_hl_supports_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)kb_hl_supports_interface.T, thread);
                SubLObject release = (SubLObject)kb_hl_supports_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    kb_hl_supports_low.kb_hl_support_clear_dependents_int(kb_hl_support);
                    SubLObject cdolist_list_var = dependents;
                    SubLObject dependent = (SubLObject)kb_hl_supports_interface.NIL;
                    dependent = cdolist_list_var.first();
                    while (kb_hl_supports_interface.NIL != cdolist_list_var) {
                        if (kb_hl_supports_interface.NIL != assertion_handles.assertion_p(dependent)) {
                            Errors.sublisp_break((SubLObject)kb_hl_supports_interface.UNPROVIDED, kb_hl_supports_interface.EMPTY_SUBL_OBJECT_ARRAY);
                        }
                        kb_hl_supports_low.kb_hl_support_add_dependent_int(kb_hl_support, dependent);
                        cdolist_list_var = cdolist_list_var.rest();
                        dependent = cdolist_list_var.first();
                    }
                    return kb_hl_support;
                }
                finally {
                    if (kb_hl_supports_interface.NIL != release) {
                        Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    public static SubLObject declare_kb_hl_supports_interface_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_create_kb_hl_support", "KB-CREATE-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_create_kb_hl_support_remote", "KB-CREATE-KB-HL-SUPPORT-REMOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_create_kb_hl_support_local", "KB-CREATE-KB-HL-SUPPORT-LOCAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_remove_kb_hl_support", "KB-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_lookup_kb_hl_support", "KB-LOOKUP-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_lookup_kb_hl_supports_mentioning_term", "KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_kb_hl_support_argument", "KB-KB-HL-SUPPORT-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_kb_hl_support_arguments", "KB-KB-HL-SUPPORT-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_kb_hl_support_dependents", "KB-KB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_rejustify_kb_hl_support", "KB-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_kb_hl_support_set_argument", "KB-KB-HL-SUPPORT-SET-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_kb_hl_support_add_dependent", "KB-KB-HL-SUPPORT-ADD-DEPENDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_interface", "kb_kb_hl_support_set_dependents", "KB-KB-HL-SUPPORT-SET-DEPENDENTS", 2, 0, false);
        return (SubLObject)kb_hl_supports_interface.NIL;
    }
    
    public static SubLObject init_kb_hl_supports_interface_file() {
        return (SubLObject)kb_hl_supports_interface.NIL;
    }
    
    public static SubLObject setup_kb_hl_supports_interface_file() {
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym2$KB_CREATE_KB_HL_SUPPORT, (SubLObject)kb_hl_supports_interface.$list4, (SubLObject)kb_hl_supports_interface.$str5$Create_a_new_KB_HL_support_consis, (SubLObject)kb_hl_supports_interface.$list6, (SubLObject)kb_hl_supports_interface.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym10$KB_REMOVE_KB_HL_SUPPORT, (SubLObject)kb_hl_supports_interface.$list12, (SubLObject)kb_hl_supports_interface.$str13$Remove_KB_HL_SUPPORT_from_the_KB_, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list15);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym16$KB_LOOKUP_KB_HL_SUPPORT, (SubLObject)kb_hl_supports_interface.$list17, (SubLObject)kb_hl_supports_interface.$str18$Return_the_kb_hl_support_with_HL_, (SubLObject)kb_hl_supports_interface.$list19, (SubLObject)kb_hl_supports_interface.$list20);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM, (SubLObject)kb_hl_supports_interface.$list23, (SubLObject)kb_hl_supports_interface.$str24$Return_a_list_of_kb_hl_supports_m, (SubLObject)kb_hl_supports_interface.$list25, (SubLObject)kb_hl_supports_interface.$list26);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym27$KB_KB_HL_SUPPORT_ARGUMENT, (SubLObject)kb_hl_supports_interface.$list12, (SubLObject)kb_hl_supports_interface.$str28$Return_the_argument_for_KB_HL_SUP, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list29);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym30$KB_KB_HL_SUPPORT_ARGUMENTS, (SubLObject)kb_hl_supports_interface.$list12, (SubLObject)kb_hl_supports_interface.$str31$Return_the_arguments_for_KB_HL_SU, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list29);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym32$KB_KB_HL_SUPPORT_DEPENDENTS, (SubLObject)kb_hl_supports_interface.$list12, (SubLObject)kb_hl_supports_interface.$str33$Return_the_dependents_for_KB_HL_S, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list29);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym34$KB_REJUSTIFY_KB_HL_SUPPORT, (SubLObject)kb_hl_supports_interface.$list12, (SubLObject)kb_hl_supports_interface.$str35$Perform_TMS_on_KB_HL_SUPPORT_____, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT, (SubLObject)kb_hl_supports_interface.$list37, (SubLObject)kb_hl_supports_interface.$str38$Replace_the_dependents_of_KB_HL_S, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list39);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT, (SubLObject)kb_hl_supports_interface.$list41, (SubLObject)kb_hl_supports_interface.$str42$Add_a_dependent_to_KB_HL_SUPPORT, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list39);
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_supports_interface.$sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS, (SubLObject)kb_hl_supports_interface.$list44, (SubLObject)kb_hl_supports_interface.$str38$Replace_the_dependents_of_KB_HL_S, (SubLObject)kb_hl_supports_interface.$list14, (SubLObject)kb_hl_supports_interface.$list39);
        return (SubLObject)kb_hl_supports_interface.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_hl_supports_interface_file();
    }
    
    public void initializeVariables() {
        init_kb_hl_supports_interface_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_hl_supports_interface_file();
    }
    
    static {
        me = (SubLFile)new kb_hl_supports_interface();
        $sym0$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $sym1$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $sym2$KB_CREATE_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("KB-CREATE-KB-HL-SUPPORT");
        $sym3$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $str5$Create_a_new_KB_HL_support_consis = SubLObjectFactory.makeString("Create a new KB HL support consisting of JUSTIFICATION for HL-SUPPORT.");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P")));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P"));
        $sym8$KB_CREATE_KB_HL_SUPPORT_KB_STORE = SubLObjectFactory.makeSymbol("KB-CREATE-KB-HL-SUPPORT-KB-STORE");
        $sym9$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $sym10$KB_REMOVE_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("KB-REMOVE-KB-HL-SUPPORT");
        $sym11$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"));
        $str13$Remove_KB_HL_SUPPORT_from_the_KB_ = SubLObjectFactory.makeString("Remove KB-HL-SUPPORT from the KB, and unhook its indexing.");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P")));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $sym16$KB_LOOKUP_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("KB-LOOKUP-KB-HL-SUPPORT");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT"));
        $str18$Return_the_kb_hl_support_with_HL_ = SubLObjectFactory.makeString("Return the kb-hl-support with HL-SUPPORT and JUSTIFICATION if it exists.\n   Return NIL otherwise.");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-P")));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P")));
        $sym21$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM = SubLObjectFactory.makeSymbol("KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $str24$Return_a_list_of_kb_hl_supports_m = SubLObjectFactory.makeString("Return a list of kb-hl-supports mentioning TERM if any exists.\n   Return NIL otherwise.");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym27$KB_KB_HL_SUPPORT_ARGUMENT = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-ARGUMENT");
        $str28$Return_the_argument_for_KB_HL_SUP = SubLObjectFactory.makeString("Return the argument for KB-HL-SUPPORT.");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P"));
        $sym30$KB_KB_HL_SUPPORT_ARGUMENTS = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-ARGUMENTS");
        $str31$Return_the_arguments_for_KB_HL_SU = SubLObjectFactory.makeString("Return the arguments for KB-HL-SUPPORT.");
        $sym32$KB_KB_HL_SUPPORT_DEPENDENTS = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-DEPENDENTS");
        $str33$Return_the_dependents_for_KB_HL_S = SubLObjectFactory.makeString("Return the dependents for KB-HL-SUPPORT.");
        $sym34$KB_REJUSTIFY_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("KB-REJUSTIFY-KB-HL-SUPPORT");
        $str35$Perform_TMS_on_KB_HL_SUPPORT_____ = SubLObjectFactory.makeString("Perform TMS on KB-HL-SUPPORT\n   @return kb-hl-support-p or :unjustifiable");
        $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-SET-ARGUMENT");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"));
        $str38$Replace_the_dependents_of_KB_HL_S = SubLObjectFactory.makeString("Replace the dependents of KB-HL-SUPPORT");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN-P"));
        $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-ADD-DEPENDENT");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT"));
        $str42$Add_a_dependent_to_KB_HL_SUPPORT = SubLObjectFactory.makeString("Add a dependent to KB-HL-SUPPORT");
        $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-SET-DEPENDENTS");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENTS"));
    }
}

/*

	Total time: 171 ms
	
*/