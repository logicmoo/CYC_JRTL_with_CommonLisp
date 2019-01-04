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

public final class narts_interface extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.narts_interface";
    public static final String myFingerPrint = "5096c7b79213d9f24c421ef05c86f2d12d69676ed0353e68c4ac4d4b1d46806e";
    private static final SubLSymbol $sym0$NAT_FORMULA_P;
    private static final SubLSymbol $sym1$KB_CREATE_NART;
    private static final SubLSymbol $sym2$_EXIT;
    private static final SubLList $list3;
    private static final SubLString $str4$Create_a_new_NART_to_implement_NA;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$KB_CREATE_NART_KB_STORE;
    private static final SubLSymbol $sym8$NART_P;
    private static final SubLSymbol $sym9$KB_REMOVE_NART;
    private static final SubLSymbol $sym10$QUOTE;
    private static final SubLList $list11;
    private static final SubLString $str12$Remove_NART_from_the_KB_;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$KB_NART_HL_FORMULA;
    private static final SubLString $str16$Return_the_hl_formula_of_this_NAR;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$POSSIBLY_NAUT_P;
    private static final SubLSymbol $sym19$KB_LOOKUP_NART;
    private static final SubLString $str20$Return_the_NART_implementing_NART;
    private static final SubLList $list21;
    private static final SubLList $list22;
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 949L)
    public static SubLObject kb_create_nart(final SubLObject nart_hl_formula) {
        enforceType(nart_hl_formula, narts_interface.$sym0$NAT_FORMULA_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)narts_interface.$sym1$KB_CREATE_NART, nart_hl_formula, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED);
        if (narts_interface.NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = (SubLObject)narts_interface.NIL;
            try {
                release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                hl_transcript_tracing.note_hlt_find_or_create_nart(nart_hl_formula);
                final SubLObject nart = (narts_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_nart_remote(nart_hl_formula) : kb_create_nart_local(nart_hl_formula);
                kb_modification_event.post_kb_modify_create_nart_event(nart_hl_formula);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return nart;
            }
            finally {
                if (narts_interface.NIL != release) {
                    Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
                }
            }
        }
        return (SubLObject)narts_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 1498L)
    public static SubLObject kb_create_nart_remote(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym7$KB_CREATE_NART_KB_STORE, list_utilities.quotify(nart_hl_formula)));
        SubLObject nart = (SubLObject)narts_interface.NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)narts_interface.T, thread);
            nart = narts_low.kb_create_nart_cyc(internal_id);
            if (narts_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
                narts_low.kb_create_nart_int(nart, internal_id, nart_hl_formula);
            }
        }
        finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 1858L)
    public static SubLObject kb_create_nart_local(final SubLObject nart_hl_formula) {
        final SubLObject internal_id = narts_low.kb_create_nart_kb_store(nart_hl_formula);
        return nart_handles.find_nart_by_id(internal_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2062L)
    public static SubLObject kb_remove_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(nart, narts_interface.$sym8$NART_P);
        SubLObject result = (SubLObject)narts_interface.NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation((SubLObject)narts_interface.$sym9$KB_REMOVE_NART, nart, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED, (SubLObject)narts_interface.UNPROVIDED);
        if (narts_interface.NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym9$KB_REMOVE_NART, (SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym10$QUOTE, nart)));
        }
        if (narts_interface.NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)narts_interface.T, thread);
                SubLObject release = (SubLObject)narts_interface.NIL;
                try {
                    release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
                    hl_transcript_tracing.note_hlt_remove_nart(nart);
                    kb_modification_event.post_kb_modify_remove_nart_event(nart);
                    return narts_low.kb_remove_nart_internal(nart);
                }
                finally {
                    if (narts_interface.NIL != release) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2375L)
    public static SubLObject kb_nart_hl_formula(final SubLObject nart) {
        enforceType(nart, narts_interface.$sym8$NART_P);
        if (narts_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym15$KB_NART_HL_FORMULA, (SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym10$QUOTE, nart)));
        }
        return narts_low.nart_hl_formula_internal(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2608L)
    public static SubLObject kb_lookup_nart(final SubLObject nart_hl_formula) {
        enforceType(nart_hl_formula, narts_interface.$sym18$POSSIBLY_NAUT_P);
        if (narts_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym19$KB_LOOKUP_NART, (SubLObject)ConsesLow.list((SubLObject)narts_interface.$sym10$QUOTE, nart_hl_formula)));
        }
        return narts_low.lookup_nart_internal(nart_hl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2931L)
    public static SubLObject initialize_nart_hl_formulas() {
        return narts_low.initialize_nart_hl_formulas_internal();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 3244L)
    public static SubLObject rebuild_nart_hl_formulas() {
        return initialize_nart_hl_formulas();
    }
    
    public static SubLObject declare_narts_interface_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "kb_create_nart", "KB-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "kb_create_nart_remote", "KB-CREATE-NART-REMOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "kb_create_nart_local", "KB-CREATE-NART-LOCAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "kb_remove_nart", "KB-REMOVE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "kb_nart_hl_formula", "KB-NART-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "kb_lookup_nart", "KB-LOOKUP-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "initialize_nart_hl_formulas", "INITIALIZE-NART-HL-FORMULAS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_interface", "rebuild_nart_hl_formulas", "REBUILD-NART-HL-FORMULAS", 0, 0, false);
        return (SubLObject)narts_interface.NIL;
    }
    
    public static SubLObject init_narts_interface_file() {
        return (SubLObject)narts_interface.NIL;
    }
    
    public static SubLObject setup_narts_interface_file() {
        utilities_macros.register_cyc_api_function((SubLObject)narts_interface.$sym1$KB_CREATE_NART, (SubLObject)narts_interface.$list3, (SubLObject)narts_interface.$str4$Create_a_new_NART_to_implement_NA, (SubLObject)narts_interface.$list5, (SubLObject)narts_interface.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)narts_interface.$sym9$KB_REMOVE_NART, (SubLObject)narts_interface.$list11, (SubLObject)narts_interface.$str12$Remove_NART_from_the_KB_, (SubLObject)narts_interface.$list13, (SubLObject)narts_interface.$list14);
        utilities_macros.register_cyc_api_function((SubLObject)narts_interface.$sym15$KB_NART_HL_FORMULA, (SubLObject)narts_interface.$list11, (SubLObject)narts_interface.$str16$Return_the_hl_formula_of_this_NAR, (SubLObject)narts_interface.$list13, (SubLObject)narts_interface.$list17);
        utilities_macros.register_cyc_api_function((SubLObject)narts_interface.$sym19$KB_LOOKUP_NART, (SubLObject)narts_interface.$list3, (SubLObject)narts_interface.$str20$Return_the_NART_implementing_NART, (SubLObject)narts_interface.$list21, (SubLObject)narts_interface.$list22);
        return (SubLObject)narts_interface.NIL;
    }
    
    public void declareFunctions() {
        declare_narts_interface_file();
    }
    
    public void initializeVariables() {
        init_narts_interface_file();
    }
    
    public void runTopLevelForms() {
        setup_narts_interface_file();
    }
    
    static {
        me = (SubLFile)new narts_interface();
        $sym0$NAT_FORMULA_P = SubLObjectFactory.makeSymbol("NAT-FORMULA-P");
        $sym1$KB_CREATE_NART = SubLObjectFactory.makeSymbol("KB-CREATE-NART");
        $sym2$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"));
        $str4$Create_a_new_NART_to_implement_NA = SubLObjectFactory.makeString("Create a new NART to implement NART-HL-FORMULA.");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-FORMULA-P")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $sym7$KB_CREATE_NART_KB_STORE = SubLObjectFactory.makeSymbol("KB-CREATE-NART-KB-STORE");
        $sym8$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym9$KB_REMOVE_NART = SubLObjectFactory.makeSymbol("KB-REMOVE-NART");
        $sym10$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"));
        $str12$Remove_NART_from_the_KB_ = SubLObjectFactory.makeString("Remove NART from the KB.");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $sym15$KB_NART_HL_FORMULA = SubLObjectFactory.makeSymbol("KB-NART-HL-FORMULA");
        $str16$Return_the_hl_formula_of_this_NAR = SubLObjectFactory.makeString("Return the hl formula of this NART.");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")));
        $sym18$POSSIBLY_NAUT_P = SubLObjectFactory.makeSymbol("POSSIBLY-NAUT-P");
        $sym19$KB_LOOKUP_NART = SubLObjectFactory.makeSymbol("KB-LOOKUP-NART");
        $str20$Return_the_NART_implementing_NART = SubLObjectFactory.makeString("Return the NART implementing NART-HL-FORMULA, or NIL if none is present.\n   No substitutions for sub-NARTs are performed.");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-NAUT-P")));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
    }
}

/*

	Total time: 71 ms
	
*/