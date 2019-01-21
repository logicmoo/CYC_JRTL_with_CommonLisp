// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
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

public final class constants_interface extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constants_interface";
    public static final String myFingerPrint = "2d7b06f67b648f832aefc136cf237bf02a1a0327c3ee539fc756754ec74c53da";
    private static final SubLSymbol $sym0$CONSTANT_NAME_SPEC_P;
    private static final SubLSymbol $sym1$CONSTANT_EXTERNAL_ID_P;
    private static final SubLSymbol $sym2$KB_CREATE_CONSTANT;
    private static final SubLSymbol $sym3$_EXIT;
    private static final SubLList $list4;
    private static final SubLString $str5$Return_a_new_constant_named_NAME_;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$KB_CREATE_CONSTANT_KB_STORE;
    private static final SubLSymbol $sym9$CONSTANT_P;
    private static final SubLSymbol $sym10$KB_REMOVE_CONSTANT;
    private static final SubLSymbol $sym11$QUOTE;
    private static final SubLList $list12;
    private static final SubLString $str13$Remove_CONSTANT_from_the_KB_;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$STRINGP;
    private static final SubLSymbol $sym17$KB_LOOKUP_CONSTANT_BY_NAME;
    private static final SubLList $list18;
    private static final SubLString $str19$Return_the_constant_named_NAME__i;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$KB_CONSTANT_NAME;
    private static final SubLString $str23$Return_the_name_for_CONSTANT_;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$GUID_P;
    private static final SubLSymbol $sym26$KB_LOOKUP_CONSTANT_BY_GUID;
    private static final SubLList $list27;
    private static final SubLString $str28$Return_the_constant_with_GUID__if;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$KB_CONSTANT_GUID;
    private static final SubLString $str31$Return_the_external_ID_for_CONSTA;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$KB_CONSTANT_MERGED_GUID;
    private static final SubLString $str34$Return_the_external_merged_ID_for;
    private static final SubLSymbol $sym35$VALID_CONSTANT_NAME_P;
    private static final SubLSymbol $sym36$KB_RENAME_CONSTANT;
    private static final SubLList $list37;
    private static final SubLString $str38$Rename_CONSTANT_to_have_NEW_NAME_;
    private static final SubLList $list39;
    private static final SubLList $list40;
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 857L)
    public static SubLObject kb_create_constant(final SubLObject name, final SubLObject external_id) {
        enforceType(name, constants_interface.$sym0$CONSTANT_NAME_SPEC_P);
        enforceType(external_id, constants_interface.$sym1$CONSTANT_EXTERNAL_ID_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)constants_interface.$sym2$KB_CREATE_CONSTANT, name, external_id, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = (SubLObject)constants_interface.NIL;
            try {
                release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                final SubLObject constant = (constants_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_constant_remote(name, external_id) : kb_create_constant_local(name, external_id);
                kb_modification_event.post_kb_modify_create_constant_event(name, external_id);
                hl_transcript_tracing.note_hlt_find_or_create(constant);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return constant;
            }
            finally {
                if (constants_interface.NIL != release) {
                    Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                }
            }
        }
        return (SubLObject)constants_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 1556L)
    public static SubLObject kb_create_constant_remote(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym8$KB_CREATE_CONSTANT_KB_STORE, list_utilities.quotify(name), list_utilities.quotify(external_id)));
        SubLObject constant = (SubLObject)constants_interface.NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)constants_interface.T, thread);
            constant = constants_low.kb_create_constant_cyc(name, internal_id);
            if (constants_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
                constants_low.kb_create_constant_int(constant, name, external_id);
            }
        }
        finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 1955L)
    public static SubLObject kb_create_constant_local(final SubLObject name, final SubLObject external_id) {
        final SubLObject internal_id = constants_low.kb_create_constant_kb_store(name, external_id);
        return constants_high.find_constant_by_internal_id(internal_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 2373L)
    public static SubLObject kb_remove_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(constant, constants_interface.$sym9$CONSTANT_P);
        SubLObject result = (SubLObject)constants_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)constants_interface.$sym10$KB_REMOVE_CONSTANT, constant, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym10$KB_REMOVE_CONSTANT, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, constant)));
        }
        if (constants_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)constants_interface.T, thread);
                SubLObject release = (SubLObject)constants_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    hl_transcript_tracing.note_hlt_remove_constant(constant);
                    kb_modification_event.post_kb_modify_remove_constant_event(constant);
                    return constants_low.kb_remove_constant_internal(constant);
                }
                finally {
                    if (constants_interface.NIL != release) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 2907L)
    public static SubLObject kb_lookup_constant_by_name(final SubLObject name) {
        enforceType(name, constants_interface.$sym16$STRINGP);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym17$KB_LOOKUP_CONSTANT_BY_NAME, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, name)));
        }
        return constant_completion_low.constant_shell_from_name(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 3443L)
    public static SubLObject kb_constant_name(final SubLObject constant) {
        enforceType(constant, constants_interface.$sym9$CONSTANT_P);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym22$KB_CONSTANT_NAME, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, constant)));
        }
        return constants_low.constant_name_internal(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 3713L)
    public static SubLObject kb_lookup_constant_by_guid(final SubLObject guid) {
        enforceType(guid, constants_interface.$sym25$GUID_P);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym26$KB_LOOKUP_CONSTANT_BY_GUID, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, guid)));
        }
        return constants_low.lookup_constant_by_guid(guid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 4142L)
    public static SubLObject kb_constant_guid(final SubLObject constant) {
        enforceType(constant, constants_interface.$sym9$CONSTANT_P);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym30$KB_CONSTANT_GUID, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, constant)));
        }
        return constants_low.constant_guid_internal(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 4540L)
    public static SubLObject kb_constant_merged_guid(final SubLObject constant) {
        enforceType(constant, constants_interface.$sym9$CONSTANT_P);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym33$KB_CONSTANT_MERGED_GUID, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, constant)));
        }
        return constants_low.constant_merged_guid_internal(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 4966L)
    public static SubLObject kb_rename_constant(final SubLObject constant, final SubLObject new_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(constant, constants_interface.$sym9$CONSTANT_P);
        enforceType(new_name, constants_interface.$sym35$VALID_CONSTANT_NAME_P);
        SubLObject result = (SubLObject)constants_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)constants_interface.$sym36$KB_RENAME_CONSTANT, constant, new_name, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED, (SubLObject)constants_interface.UNPROVIDED);
        if (constants_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym36$KB_RENAME_CONSTANT, (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, constant), (SubLObject)ConsesLow.list((SubLObject)constants_interface.$sym11$QUOTE, new_name)));
        }
        if (constants_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)constants_interface.T, thread);
                SubLObject release = (SubLObject)constants_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    final SubLObject old_name = constants_high.constant_name(constant);
                    SubLObject result_$1 = (SubLObject)constants_interface.NIL;
                    hl_transcript_tracing.note_hlt_rename(constant, new_name);
                    result_$1 = constants_low.kb_rename_constant_internal(constant, new_name);
                    kb_modification_event.post_kb_modify_rename_constant_event(constant, old_name, new_name);
                    return result_$1;
                }
                finally {
                    if (constants_interface.NIL != release) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 5914L)
    public static SubLObject kb_new_constant_info_iterator(SubLObject buffer_size) {
        if (buffer_size == constants_interface.UNPROVIDED) {
            buffer_size = (SubLObject)constants_interface.ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator((SubLObject)constants_interface.$list40, buffer_size);
    }
    
    public static SubLObject declare_constants_interface_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_create_constant", "KB-CREATE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_create_constant_remote", "KB-CREATE-CONSTANT-REMOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_create_constant_local", "KB-CREATE-CONSTANT-LOCAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_remove_constant", "KB-REMOVE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_lookup_constant_by_name", "KB-LOOKUP-CONSTANT-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_constant_name", "KB-CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_lookup_constant_by_guid", "KB-LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_constant_guid", "KB-CONSTANT-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_constant_merged_guid", "KB-CONSTANT-MERGED-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_rename_constant", "KB-RENAME-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_interface", "kb_new_constant_info_iterator", "KB-NEW-CONSTANT-INFO-ITERATOR", 0, 1, false);
        return (SubLObject)constants_interface.NIL;
    }
    
    public static SubLObject init_constants_interface_file() {
        return (SubLObject)constants_interface.NIL;
    }
    
    public static SubLObject setup_constants_interface_file() {
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym2$KB_CREATE_CONSTANT, (SubLObject)constants_interface.$list4, (SubLObject)constants_interface.$str5$Return_a_new_constant_named_NAME_, (SubLObject)constants_interface.$list6, (SubLObject)constants_interface.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym10$KB_REMOVE_CONSTANT, (SubLObject)constants_interface.$list12, (SubLObject)constants_interface.$str13$Remove_CONSTANT_from_the_KB_, (SubLObject)constants_interface.$list14, (SubLObject)constants_interface.$list15);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym17$KB_LOOKUP_CONSTANT_BY_NAME, (SubLObject)constants_interface.$list18, (SubLObject)constants_interface.$str19$Return_the_constant_named_NAME__i, (SubLObject)constants_interface.$list20, (SubLObject)constants_interface.$list21);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym22$KB_CONSTANT_NAME, (SubLObject)constants_interface.$list12, (SubLObject)constants_interface.$str23$Return_the_name_for_CONSTANT_, (SubLObject)constants_interface.$list14, (SubLObject)constants_interface.$list24);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym26$KB_LOOKUP_CONSTANT_BY_GUID, (SubLObject)constants_interface.$list27, (SubLObject)constants_interface.$str28$Return_the_constant_with_GUID__if, (SubLObject)constants_interface.$list29, (SubLObject)constants_interface.$list21);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym30$KB_CONSTANT_GUID, (SubLObject)constants_interface.$list12, (SubLObject)constants_interface.$str31$Return_the_external_ID_for_CONSTA, (SubLObject)constants_interface.$list14, (SubLObject)constants_interface.$list32);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym33$KB_CONSTANT_MERGED_GUID, (SubLObject)constants_interface.$list12, (SubLObject)constants_interface.$str34$Return_the_external_merged_ID_for, (SubLObject)constants_interface.$list14, (SubLObject)constants_interface.$list32);
        utilities_macros.register_cyc_api_function((SubLObject)constants_interface.$sym36$KB_RENAME_CONSTANT, (SubLObject)constants_interface.$list37, (SubLObject)constants_interface.$str38$Rename_CONSTANT_to_have_NEW_NAME_, (SubLObject)constants_interface.$list39, (SubLObject)constants_interface.$list7);
        return (SubLObject)constants_interface.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_constants_interface_file();
    }
    
    @Override
	public void initializeVariables() {
        init_constants_interface_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_constants_interface_file();
    }
    
    static {
        me = (SubLFile)new constants_interface();
        $sym0$CONSTANT_NAME_SPEC_P = SubLObjectFactory.makeSymbol("CONSTANT-NAME-SPEC-P");
        $sym1$CONSTANT_EXTERNAL_ID_P = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P");
        $sym2$KB_CREATE_CONSTANT = SubLObjectFactory.makeSymbol("KB-CREATE-CONSTANT");
        $sym3$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $str5$Return_a_new_constant_named_NAME_ = SubLObjectFactory.makeString("Return a new constant named NAME with EXTERNAL-ID.\n   If NAME is :unnamed, returns a constant with no name.");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P")));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $sym8$KB_CREATE_CONSTANT_KB_STORE = SubLObjectFactory.makeSymbol("KB-CREATE-CONSTANT-KB-STORE");
        $sym9$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym10$KB_REMOVE_CONSTANT = SubLObjectFactory.makeSymbol("KB-REMOVE-CONSTANT");
        $sym11$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"));
        $str13$Remove_CONSTANT_from_the_KB_ = SubLObjectFactory.makeString("Remove CONSTANT from the KB.");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $sym16$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym17$KB_LOOKUP_CONSTANT_BY_NAME = SubLObjectFactory.makeSymbol("KB-LOOKUP-CONSTANT-BY-NAME");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str19$Return_the_constant_named_NAME__i = SubLObjectFactory.makeString("Return the constant named NAME, if it exists.\n   Return NIL otherwise.");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $sym22$KB_CONSTANT_NAME = SubLObjectFactory.makeSymbol("KB-CONSTANT-NAME");
        $str23$Return_the_name_for_CONSTANT_ = SubLObjectFactory.makeString("Return the name for CONSTANT.");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME-SPEC-P"));
        $sym25$GUID_P = SubLObjectFactory.makeSymbol("GUID-P");
        $sym26$KB_LOOKUP_CONSTANT_BY_GUID = SubLObjectFactory.makeSymbol("KB-LOOKUP-CONSTANT-BY-GUID");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID"));
        $str28$Return_the_constant_with_GUID__if = SubLObjectFactory.makeString("Return the constant with GUID, if it exists.\n   Return NIL otherwise.");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-P")));
        $sym30$KB_CONSTANT_GUID = SubLObjectFactory.makeSymbol("KB-CONSTANT-GUID");
        $str31$Return_the_external_ID_for_CONSTA = SubLObjectFactory.makeString("Return the external ID for CONSTANT.");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P"));
        $sym33$KB_CONSTANT_MERGED_GUID = SubLObjectFactory.makeSymbol("KB-CONSTANT-MERGED-GUID");
        $str34$Return_the_external_merged_ID_for = SubLObjectFactory.makeString("Return the external merged ID for CONSTANT.");
        $sym35$VALID_CONSTANT_NAME_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P");
        $sym36$KB_RENAME_CONSTANT = SubLObjectFactory.makeSymbol("KB-RENAME-CONSTANT");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"));
        $str38$Rename_CONSTANT_to_have_NEW_NAME_ = SubLObjectFactory.makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL"));
    }
}
