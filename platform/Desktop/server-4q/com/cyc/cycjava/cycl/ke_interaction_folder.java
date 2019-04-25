package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_interaction_folder extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke_interaction_folder";
    public static final String myFingerPrint = "ff83af2267c7c56ae2cfc75a80aa1394fa463c0deb75b54e7f098539309c41b8";
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 916L)
    private static SubLSymbol $default_new_ke_interaction_folder_name$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLSymbol $dtp_ke_interaction_folder$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
    private static SubLSymbol $ke_interaction_folders_caching_state$;
    private static final SubLString $str0$New_Folder;
    private static final SubLSymbol $sym1$CREATE_NEW_SUBFOLDER;
    private static final SubLObject $const2$GeneralEnglishMt;
    private static final SubLSymbol $sym3$INDEXED_TERM_P;
    private static final SubLSymbol $sym4$POSSIBLY_HLMT_P;
    private static final SubLObject $const5$KEInteractionFolder;
    private static final SubLString $str6$_S_is_not_known_to_be_a_KE_intera;
    private static final SubLString $str7$UserCreatedFolder;
    private static final SubLObject $const8$UniversalVocabularyMt;
    private static final SubLSymbol $kw9$X;
    private static final SubLObject $const10$and;
    private static final SubLObject $const11$ist;
    private static final SubLObject $const12$subFolders;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$INFERENCE_MODE;
    private static final SubLSymbol $kw16$MINIMAL;
    private static final SubLString $str17$_;
    private static final SubLSymbol $sym18$RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT;
    private static final SubLSymbol $sym19$FORT_P;
    private static final SubLSymbol $sym20$STRINGP;
    private static final SubLObject $const21$folderTitle;
    private static final SubLSymbol $kw22$GAF;
    private static final SubLSymbol $kw23$TRUE;
    private static final SubLSymbol $sym24$MOVE_KE_INTERACTION_RESOURCE;
    private static final SubLSymbol $sym25$ADD_KE_INTERACTION_RESOURCE_TO_FOLDER;
    private static final SubLObject $const26$KEInteractionResource;
    private static final SubLString $str27$_S_is_not_known_to_be_a_KE_intera;
    private static final SubLObject $const28$FormulaTemplate;
    private static final SubLObject $const29$folderContainsTemplate;
    private static final SubLObject $const30$folderContainsResource;
    private static final SubLSymbol $sym31$REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER;
    private static final SubLString $str32$_S_is_not_known_to_be_in__S_in__S;
    private static final SubLSymbol $kw33$DEPTH;
    private static final SubLSymbol $kw34$STACK;
    private static final SubLSymbol $kw35$QUEUE;
    private static final SubLSymbol $sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw37$ERROR;
    private static final SubLString $str38$_A_is_not_a__A;
    private static final SubLSymbol $sym39$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw40$CERROR;
    private static final SubLString $str41$continue_anyway;
    private static final SubLSymbol $kw42$WARN;
    private static final SubLString $str43$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const44$genlPreds;
    private static final SubLString $str45$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str46$attempting_to_bind_direction_link;
    private static final SubLString $str47$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const48$KEInteractionResourceTestMt;
    private static final SubLSymbol $sym49$KE_INTERACTION_FOLDER;
    private static final SubLSymbol $sym50$KE_INTERACTION_FOLDER_P;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$PRINT_KE_INTERACTION_FOLDER;
    private static final SubLSymbol $sym56$KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$KE_INTERACTION_FOLDER_ID;
    private static final SubLSymbol $sym59$_CSETF_KE_INTERACTION_FOLDER_ID;
    private static final SubLSymbol $sym60$KE_INTERACTION_FOLDER_MT;
    private static final SubLSymbol $sym61$_CSETF_KE_INTERACTION_FOLDER_MT;
    private static final SubLSymbol $sym62$KE_INTERACTION_FOLDER_GLOSS;
    private static final SubLSymbol $sym63$_CSETF_KE_INTERACTION_FOLDER_GLOSS;
    private static final SubLSymbol $sym64$KE_INTERACTION_FOLDER_PARENT;
    private static final SubLSymbol $sym65$_CSETF_KE_INTERACTION_FOLDER_PARENT;
    private static final SubLSymbol $sym66$KE_INTERACTION_FOLDER_CHILDREN;
    private static final SubLSymbol $sym67$_CSETF_KE_INTERACTION_FOLDER_CHILDREN;
    private static final SubLSymbol $kw68$ID;
    private static final SubLSymbol $kw69$MT;
    private static final SubLSymbol $kw70$GLOSS;
    private static final SubLSymbol $kw71$PARENT;
    private static final SubLSymbol $kw72$CHILDREN;
    private static final SubLString $str73$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw74$BEGIN;
    private static final SubLSymbol $sym75$MAKE_KE_INTERACTION_FOLDER;
    private static final SubLSymbol $kw76$SLOT;
    private static final SubLSymbol $kw77$END;
    private static final SubLSymbol $sym78$VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD;
    private static final SubLString $str79$_A_in_mt___A__;
    private static final SubLSymbol $sym80$HLMT_P;
    private static final SubLSymbol $kw81$TITLE;
    private static final SubLList $list82;
    private static final SubLObject $const83$InferencePSC;
    private static final SubLSymbol $sym84$_CHILD;
    private static final SubLList $list85;
    private static final SubLString $str86$Cannot_handle_resource__A_at_this;
    private static final SubLSymbol $kw87$ANY;
    private static final SubLSymbol $sym88$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str89$Cannot_load_formula_template__A__;
    private static final SubLObject $const90$TemplateFromTestQueryFn;
    private static final SubLSymbol $sym91$KE_INTERACTION_FOLDERS;
    private static final SubLSymbol $sym92$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const93$EverythingPSC;
    private static final SubLObject $const94$isa;
    private static final SubLSymbol $kw95$BREADTH;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$_KE_INTERACTION_FOLDERS_CACHING_STATE_;
    private static final SubLSymbol $sym98$ADD_FOLDER_TITLE;
    private static final SubLSymbol $sym99$REMOVE_FOLDER_TITLE;
    private static final SubLList $list100;
    private static final SubLString $str101$folder;
    private static final SubLSymbol $kw102$UNINITIALIZED;
    private static final SubLString $str103$folderId;
    private static final SubLString $str104$parentFolderId;
    private static final SubLString $str105$folderTitle;
    private static final SubLString $str106$Cannot_interpret_resource__A__ski;
    private static final SubLString $str107$children;
    private static final SubLString $str108$Resource__A_slipped_through_but_c;
    private static final SubLSymbol $sym109$STRING_;
    private static final SubLSymbol $sym110$FORT_NAME;
    private static final SubLSymbol $sym111$QUERY_LIBRARY_FOR_TASK_;
    private static final SubLSymbol $sym112$QUERY_LIBRARY_FOR_NON_CYLIST_;
    private static final SubLObject $const113$GKEFormulaTemplatesMt;
    private static final SubLObject $const114$kEInteractionFolderOfUserForTaskW;
    private static final SubLObject $const115$kEInteractionFolderOfUserForTask;
    private static final SubLObject $const116$kEInteractionFolderOfUser;
    private static final SubLObject $const117$higherPriorityInFolder;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$NULL;
    private static final SubLSymbol $sym120$_;
    private static final SubLSymbol $sym121$KE_INTERACTION_FOLDER_SORT_KEY;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 992L)
    public static SubLObject create_new_subfolder(final SubLObject folder_id, SubLObject lex_mt) {
        if (lex_mt == ke_interaction_folder.UNPROVIDED) {
            lex_mt = ke_interaction_folder.$const2$GeneralEnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_interaction_folder.NIL != kb_indexing_datastructures.indexed_term_p(folder_id) : folder_id;
        assert ke_interaction_folder.NIL != hlmt.possibly_hlmt_p(lex_mt) : lex_mt;
        final SubLObject defining_mt = default_mt_for_ke_interaction_folder(folder_id);
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == isa.isaP(folder_id, ke_interaction_folder.$const5$KEInteractionFolder, defining_mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str6$_S_is_not_known_to_be_a_KE_intera, folder_id, defining_mt);
        }
        final SubLObject new_folder = rkf_term_utilities.create_new_constant((SubLObject)ke_interaction_folder.$str7$UserCreatedFolder, (SubLObject)ConsesLow.list(ke_interaction_folder.$const5$KEInteractionFolder), (SubLObject)ke_interaction_folder.NIL, ke_interaction_folder.$const8$UniversalVocabularyMt, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
        add_ke_interaction_resource_to_folder(new_folder, folder_id);
        SubLObject name;
        for (SubLObject name_stem = name = ke_interaction_folder.$default_new_ke_interaction_folder_name$.getGlobalValue(), suffix = (SubLObject)ke_interaction_folder.ZERO_INTEGER, existing = ask_utilities.query_variable((SubLObject)ke_interaction_folder.$kw9$X, (SubLObject)ConsesLow.listS(ke_interaction_folder.$const10$and, (SubLObject)ConsesLow.list(ke_interaction_folder.$const11$ist, defining_mt, (SubLObject)ConsesLow.listS(ke_interaction_folder.$const12$subFolders, folder_id, (SubLObject)ke_interaction_folder.$list13)), (SubLObject)ke_interaction_folder.$list14), lex_mt, (SubLObject)ConsesLow.list((SubLObject)ke_interaction_folder.$kw15$INFERENCE_MODE, (SubLObject)ke_interaction_folder.$kw16$MINIMAL)); ke_interaction_folder.NIL != conses_high.member(name, existing, Symbols.symbol_function((SubLObject)ke_interaction_folder.EQUAL), (SubLObject)ke_interaction_folder.UNPROVIDED); name = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name_stem), new SubLObject[] { ke_interaction_folder.$str17$_, format_nil.format_nil_d_no_copy(suffix) })) {
            suffix = Numbers.add(suffix, (SubLObject)ke_interaction_folder.ONE_INTEGER);
        }
        lexify_ke_interaction_folder_constant(new_folder, name, lex_mt);
        return new_folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 2154L)
    public static SubLObject relexify_ke_interaction_folder_constant(final SubLObject folder_id, final SubLObject new_name, SubLObject lex_mt) {
        if (lex_mt == ke_interaction_folder.UNPROVIDED) {
            lex_mt = ke_interaction_folder.$const2$GeneralEnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_interaction_folder.NIL != forts.fort_p(folder_id) : folder_id;
        assert ke_interaction_folder.NIL != Types.stringp(new_name) : new_name;
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == isa.isaP(folder_id, ke_interaction_folder.$const5$KEInteractionFolder, lex_mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str6$_S_is_not_known_to_be_a_KE_intera, folder_id, lex_mt);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lex_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = ke_interaction_folder.$const21$folderTitle;
            if (ke_interaction_folder.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(folder_id, (SubLObject)ke_interaction_folder.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(folder_id, (SubLObject)ke_interaction_folder.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)ke_interaction_folder.NIL;
                final SubLObject token_var = (SubLObject)ke_interaction_folder.NIL;
                while (ke_interaction_folder.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (ke_interaction_folder.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)ke_interaction_folder.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke_interaction_folder.$kw22$GAF, (SubLObject)ke_interaction_folder.$kw23$TRUE, (SubLObject)ke_interaction_folder.NIL);
                            SubLObject done_var_$1 = (SubLObject)ke_interaction_folder.NIL;
                            final SubLObject token_var_$2 = (SubLObject)ke_interaction_folder.NIL;
                            while (ke_interaction_folder.NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                if (ke_interaction_folder.NIL != valid_$3) {
                                    if (ke_interaction_folder.NIL != assertions_high.asserted_assertionP(assertion)) {
                                        ke.ke_unassert_assertion_now(assertion);
                                    }
                                    if (ke_interaction_folder.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                        ke.ke_blast_assertion(assertion);
                                    }
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == valid_$3);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (ke_interaction_folder.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return lexify_ke_interaction_folder_constant(folder_id, new_name, lex_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 2938L)
    public static SubLObject lexify_ke_interaction_folder_constant(final SubLObject folder, final SubLObject name, final SubLObject lex_mt) {
        return ke.ke_assert_now((SubLObject)ConsesLow.list(ke_interaction_folder.$const21$folderTitle, folder, name), lex_mt, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 3077L)
    public static SubLObject move_ke_interaction_resource(final SubLObject resource_id, final SubLObject from_folder_id, final SubLObject to_folder_id) {
        if (ke_interaction_folder.NIL != from_folder_id) {
            remove_ke_interaction_resource_from_folder(resource_id, from_folder_id);
        }
        add_ke_interaction_resource_to_folder(resource_id, to_folder_id);
        return to_folder_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 3414L)
    public static SubLObject add_ke_interaction_resource_to_folder(final SubLObject resource_id, final SubLObject to_folder_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_interaction_folder.NIL != kb_indexing_datastructures.indexed_term_p(resource_id) : resource_id;
        assert ke_interaction_folder.NIL != kb_indexing_datastructures.indexed_term_p(to_folder_id) : to_folder_id;
        final SubLObject mt = default_mt_for_ke_interaction_folder(to_folder_id);
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == isa.isaP(to_folder_id, ke_interaction_folder.$const5$KEInteractionFolder, mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str6$_S_is_not_known_to_be_a_KE_intera, to_folder_id, mt);
        }
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == isa.isaP(resource_id, ke_interaction_folder.$const26$KEInteractionResource, mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str27$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
        }
        final SubLObject preferred_pred = (ke_interaction_folder.NIL != isa.isaP(resource_id, ke_interaction_folder.$const5$KEInteractionFolder, mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) ? ke_interaction_folder.$const12$subFolders : ((ke_interaction_folder.NIL != isa.isaP(resource_id, ke_interaction_folder.$const28$FormulaTemplate, mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) ? ke_interaction_folder.$const29$folderContainsTemplate : ke_interaction_folder.$const30$folderContainsResource);
        ke.ke_assert_now(el_utilities.make_binary_formula(preferred_pred, to_folder_id, resource_id), mt, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
        return resource_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 4275L)
    public static SubLObject remove_ke_interaction_resource_from_folder(final SubLObject resource_id, final SubLObject from_folder_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_interaction_folder.NIL != kb_indexing_datastructures.indexed_term_p(resource_id) : resource_id;
        assert ke_interaction_folder.NIL != kb_indexing_datastructures.indexed_term_p(from_folder_id) : from_folder_id;
        final SubLObject mt = default_mt_for_ke_interaction_folder(from_folder_id);
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == isa.isaP(from_folder_id, ke_interaction_folder.$const5$KEInteractionFolder, mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str6$_S_is_not_known_to_be_a_KE_intera, from_folder_id, mt);
        }
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == isa.isaP(resource_id, ke_interaction_folder.$const26$KEInteractionResource, mt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str27$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
        }
        if (ke_interaction_folder.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ke_interaction_folder.NIL == subl_promotions.memberP(resource_id, get_ke_interaction_folder_contents_from_kb(from_folder_id, mt), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
            Errors.error((SubLObject)ke_interaction_folder.$str32$_S_is_not_known_to_be_in__S_in__S, resource_id, from_folder_id, mt);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = ke_interaction_folder.$const30$folderContainsResource;
            final SubLObject deck_type = (SubLObject)ke_interaction_folder.$kw35$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)ke_interaction_folder.NIL;
            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)ke_interaction_folder.NIL;
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((ke_interaction_folder.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((ke_interaction_folder.NIL != tv_var) ? ke_interaction_folder.$sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (ke_interaction_folder.NIL != tv_var && ke_interaction_folder.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && ke_interaction_folder.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw37$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw40$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$str41$continue_anyway, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw42$WARN)) {
                                Errors.warn((SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)ke_interaction_folder.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)ke_interaction_folder.$str41$continue_anyway, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_interaction_folder.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds), thread);
                            if (ke_interaction_folder.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || ke_interaction_folder.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(ke_interaction_folder.$const30$folderContainsResource, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_interaction_folder.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(ke_interaction_folder.$const30$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p()); ke_interaction_folder.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$14 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$14;
                                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            final SubLObject pred_var = spec_pred;
                                            if (ke_interaction_folder.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(resource_id, (SubLObject)((ke_interaction_folder.NIL != inverseP) ? ke_interaction_folder.ONE_INTEGER : ke_interaction_folder.TWO_INTEGER), pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(resource_id, (SubLObject)((ke_interaction_folder.NIL != inverseP) ? ke_interaction_folder.ONE_INTEGER : ke_interaction_folder.TWO_INTEGER), pred_var);
                                                SubLObject done_var = (SubLObject)ke_interaction_folder.NIL;
                                                final SubLObject token_var = (SubLObject)ke_interaction_folder.NIL;
                                                while (ke_interaction_folder.NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                    if (ke_interaction_folder.NIL != valid) {
                                                        SubLObject final_index_iterator = (SubLObject)ke_interaction_folder.NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke_interaction_folder.$kw22$GAF, (SubLObject)ke_interaction_folder.$kw23$TRUE, (SubLObject)ke_interaction_folder.NIL);
                                                            SubLObject done_var_$16 = (SubLObject)ke_interaction_folder.NIL;
                                                            final SubLObject token_var_$17 = (SubLObject)ke_interaction_folder.NIL;
                                                            while (ke_interaction_folder.NIL == done_var_$16) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                                                final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(assertion));
                                                                if (ke_interaction_folder.NIL != valid_$18 && from_folder_id.equal(assertions_high.gaf_arg(assertion, (SubLObject)((ke_interaction_folder.NIL != inverseP) ? ke_interaction_folder.TWO_INTEGER : ke_interaction_folder.ONE_INTEGER)))) {
                                                                    if (ke_interaction_folder.NIL != assertions_high.asserted_assertionP(assertion)) {
                                                                        ke.ke_unassert_assertion_now(assertion);
                                                                    }
                                                                    if (ke_interaction_folder.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                        ke.ke_blast_assertion(assertion);
                                                                    }
                                                                }
                                                                done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == valid_$18);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                if (ke_interaction_folder.NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == valid);
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds));
                                            SubLObject module_var = (SubLObject)ke_interaction_folder.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (ke_interaction_folder.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((ke_interaction_folder.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$14);
                                                    if (ke_interaction_folder.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                        if (ke_interaction_folder.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                            if (ke_interaction_folder.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$22 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (ke_interaction_folder.NIL != mt_relevance_macros.relevant_mtP(mt_$22)) {
                                                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$22, thread);
                                                                            SubLObject iteration_state_$24;
                                                                            for (iteration_state_$24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$24); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next(iteration_state_$24)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$24);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (ke_interaction_folder.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (ke_interaction_folder.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)ke_interaction_folder.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)ke_interaction_folder.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (ke_interaction_folder.NIL != csome_list_var) {
                                                                                                if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$24);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.FIVE_INTEGER, (SubLObject)ke_interaction_folder.$str46$attempting_to_bind_direction_link, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (ke_interaction_folder.NIL != obsolete.cnat_p(node, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$26;
                                                        final SubLObject new_list = cdolist_list_var_$26 = ((ke_interaction_folder.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)ke_interaction_folder.NIL;
                                                        generating_fn = cdolist_list_var_$26.first();
                                                        while (ke_interaction_folder.NIL != cdolist_list_var_$26) {
                                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (ke_interaction_folder.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)ke_interaction_folder.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)ke_interaction_folder.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (ke_interaction_folder.NIL != csome_list_var2) {
                                                                        if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                            }
                                                            cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                            generating_fn = cdolist_list_var_$26.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$11, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)ke_interaction_folder.TWO_INTEGER, (SubLObject)ke_interaction_folder.$str47$Node__a_does_not_pass_sbhl_type_t, ke_interaction_folder.$const30$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return resource_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5498L)
    public static SubLObject default_mt_for_ke_interaction_folder(final SubLObject v_ke_interaction_folder) {
        return ke_interaction_folder.$const48$KEInteractionResourceTestMt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ke_interaction_folder(v_object, stream, (SubLObject)ke_interaction_folder.ZERO_INTEGER);
        return (SubLObject)ke_interaction_folder.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ke_interaction_folder_native.class) ? ke_interaction_folder.T : ke_interaction_folder.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_id(final SubLObject v_object) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_mt(final SubLObject v_object) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_gloss(final SubLObject v_object) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_parent(final SubLObject v_object) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject ke_interaction_folder_children(final SubLObject v_object) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject _csetf_ke_interaction_folder_id(final SubLObject v_object, final SubLObject value) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject _csetf_ke_interaction_folder_mt(final SubLObject v_object, final SubLObject value) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject _csetf_ke_interaction_folder_gloss(final SubLObject v_object, final SubLObject value) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject _csetf_ke_interaction_folder_parent(final SubLObject v_object, final SubLObject value) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject _csetf_ke_interaction_folder_children(final SubLObject v_object, final SubLObject value) {
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject make_ke_interaction_folder(SubLObject arglist) {
        if (arglist == ke_interaction_folder.UNPROVIDED) {
            arglist = (SubLObject)ke_interaction_folder.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ke_interaction_folder_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)ke_interaction_folder.NIL, next = arglist; ke_interaction_folder.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw68$ID)) {
                _csetf_ke_interaction_folder_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw69$MT)) {
                _csetf_ke_interaction_folder_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw70$GLOSS)) {
                _csetf_ke_interaction_folder_gloss(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw71$PARENT)) {
                _csetf_ke_interaction_folder_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw72$CHILDREN)) {
                _csetf_ke_interaction_folder_children(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)ke_interaction_folder.$str73$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject visit_defstruct_ke_interaction_folder(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw74$BEGIN, (SubLObject)ke_interaction_folder.$sym75$MAKE_KE_INTERACTION_FOLDER, (SubLObject)ke_interaction_folder.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw76$SLOT, (SubLObject)ke_interaction_folder.$kw68$ID, ke_interaction_folder_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw76$SLOT, (SubLObject)ke_interaction_folder.$kw69$MT, ke_interaction_folder_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw76$SLOT, (SubLObject)ke_interaction_folder.$kw70$GLOSS, ke_interaction_folder_gloss(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw76$SLOT, (SubLObject)ke_interaction_folder.$kw71$PARENT, ke_interaction_folder_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw76$SLOT, (SubLObject)ke_interaction_folder.$kw72$CHILDREN, ke_interaction_folder_children(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ke_interaction_folder.$kw77$END, (SubLObject)ke_interaction_folder.$sym75$MAKE_KE_INTERACTION_FOLDER, (SubLObject)ke_interaction_folder.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
    public static SubLObject visit_defstruct_object_ke_interaction_folder_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ke_interaction_folder(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 6265L)
    public static SubLObject print_ke_interaction_folder(final SubLObject folder, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_interaction_folder.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(folder, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, folder, (SubLObject)ke_interaction_folder.T, (SubLObject)ke_interaction_folder.T);
            PrintLow.format(stream, (SubLObject)ke_interaction_folder.$str79$_A_in_mt___A__, ke_interaction_folder_id(folder), ke_interaction_folder_mt(folder));
            print_macros.print_unreadable_object_postamble(stream, folder, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL);
        }
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 6532L)
    public static SubLObject new_ke_interaction_folder(final SubLObject folder_id, final SubLObject folder_mt) {
        assert ke_interaction_folder.NIL != hlmt.hlmt_p(folder_mt) : folder_mt;
        assert ke_interaction_folder.NIL != forts.fort_p(folder_id) : folder_id;
        final SubLObject folder = make_ke_interaction_folder((SubLObject)ke_interaction_folder.UNPROVIDED);
        _csetf_ke_interaction_folder_id(folder, folder_id);
        _csetf_ke_interaction_folder_mt(folder, folder_mt);
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 6839L)
    public static SubLObject ke_interaction_folder_load_query_library(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == ke_interaction_folder.UNPROVIDED) {
            parent = (SubLObject)ke_interaction_folder.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        folder_id = hlmt_czer.canonicalize_hlmt(folder_id);
        assert ke_interaction_folder.NIL != forts.fort_p(folder_id) : folder_id;
        assert ke_interaction_folder.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
        _csetf_ke_interaction_folder_parent(folder, parent);
        _csetf_ke_interaction_folder_gloss(folder, ask_utilities.ask_variable((SubLObject)ke_interaction_folder.$kw81$TITLE, (SubLObject)ConsesLow.listS(ke_interaction_folder.$const21$folderTitle, folder_id, (SubLObject)ke_interaction_folder.$list82), ke_interaction_folder.$const83$InferencePSC, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED).first());
        final SubLObject child_var = (SubLObject)ke_interaction_folder.$sym84$_CHILD;
        final SubLObject sorting_information = ke_interact_obtain_ordering_info(folder_id, elmt);
        thread.resetMultipleValues();
        final SubLObject binding_lists = inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(ke_interaction_folder.$const30$folderContainsResource, folder_id, child_var, (SubLObject)ke_interaction_folder.$list85), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = binding_lists;
        SubLObject binding_list = (SubLObject)ke_interaction_folder.NIL;
        binding_list = cdolist_list_var.first();
        while (ke_interaction_folder.NIL != cdolist_list_var) {
            final SubLObject param = bindings.variable_lookup(child_var, binding_list);
            if (ke_interaction_folder.NIL != isa.isaP(param, ke_interaction_folder.$const5$KEInteractionFolder, elmt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                _csetf_ke_interaction_folder_children(folder, (SubLObject)ConsesLow.cons(ke_interaction_folder_load_query_library(param, elmt, folder), ke_interaction_folder_children(folder)));
            }
            else if (ke_interaction_folder.NIL != isa.isaP(param, ke_interaction_folder.$const28$FormulaTemplate, elmt, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                _csetf_ke_interaction_folder_children(folder, (SubLObject)ConsesLow.cons(formula_templates.load_formula_template_details_from_kb(param, elmt), ke_interaction_folder_children(folder)));
            }
            else {
                Errors.warn((SubLObject)ke_interaction_folder.$str86$Cannot_handle_resource__A_at_this, param);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        }
        ke_interact_apply_ordering_on_children(folder, elmt, sorting_information);
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 8586L)
    public static SubLObject update_folder_query_params_using_defaults(final SubLObject v_ke_interaction_folder, final SubLObject defaults) {
        SubLObject cdolist_list_var = ke_interaction_folder_children(v_ke_interaction_folder);
        SubLObject child = (SubLObject)ke_interaction_folder.NIL;
        child = cdolist_list_var.first();
        while (ke_interaction_folder.NIL != cdolist_list_var) {
            if (ke_interaction_folder.NIL != ke_interaction_folder_p(child)) {
                update_folder_query_params_using_defaults(child, defaults);
            }
            else if (ke_interaction_folder.NIL != formula_templates.valid_formula_template_p(child)) {
                final SubLObject query_spec = formula_templates.formula_template_query_specification(child);
                new_cycl_query_specification.update_query_spec_params_using_defaults(query_spec, defaults);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return v_ke_interaction_folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 9204L)
    public static SubLObject ke_interaction_folder_load_query_library_skeleton(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == ke_interaction_folder.UNPROVIDED) {
            parent = (SubLObject)ke_interaction_folder.NIL;
        }
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        folder_id = czer_main.canonicalize_term(folder_id, (SubLObject)ke_interaction_folder.UNPROVIDED);
        assert ke_interaction_folder.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
        SubLObject gloss = (SubLObject)ke_interaction_folder.NIL;
        _csetf_ke_interaction_folder_parent(folder, parent);
        gloss = ke_interaction_folder_get_gloss_for_folder_id(folder_id, elmt);
        _csetf_ke_interaction_folder_gloss(folder, gloss);
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 9922L)
    public static SubLObject ke_interaction_folder_get_gloss_for_folder_id(final SubLObject folder_id, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asserted_title = kb_mapping_utilities.fpred_value_in_any_mt(folder_id, ke_interaction_folder.$const21$folderTitle, (SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.TWO_INTEGER, (SubLObject)ke_interaction_folder.$kw23$TRUE);
        return (ke_interaction_folder.NIL != asserted_title) ? asserted_title : pph_main.generate_phrase(folder_id, (SubLObject)ke_interaction_folder.$kw87$ANY, (SubLObject)ke_interaction_folder.NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 10262L)
    public static SubLObject ke_interaction_folder_load_one_level(final SubLObject folder_id, final SubLObject elmt, SubLObject parent) {
        if (parent == ke_interaction_folder.UNPROVIDED) {
            parent = (SubLObject)ke_interaction_folder.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
        SubLObject gloss = (SubLObject)ke_interaction_folder.NIL;
        _csetf_ke_interaction_folder_parent(folder, parent);
        gloss = ke_interaction_folder_get_gloss_for_folder_id(folder_id, elmt);
        _csetf_ke_interaction_folder_gloss(folder, gloss);
        final SubLObject sorting_information = ke_interact_obtain_ordering_info(folder_id, elmt);
        SubLObject cdolist_list_var;
        final SubLObject params = cdolist_list_var = get_ke_interaction_folder_contents_from_kb(folder_id, elmt);
        SubLObject param = (SubLObject)ke_interaction_folder.NIL;
        param = cdolist_list_var.first();
        while (ke_interaction_folder.NIL != cdolist_list_var) {
            if (ke_interaction_folder.NIL != ke_interaction_folderP(param)) {
                _csetf_ke_interaction_folder_children(folder, (SubLObject)ConsesLow.cons(ke_interaction_folder_load_query_library_skeleton(param, elmt, folder), ke_interaction_folder_children(folder)));
            }
            else if (ke_interaction_folder.NIL != cycl_formula_templateP(param)) {
                SubLObject template_details = (SubLObject)ke_interaction_folder.NIL;
                SubLObject error_message = (SubLObject)ke_interaction_folder.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)ke_interaction_folder.$sym88$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            template_details = formula_templates.load_formula_template_details_from_kb(param, elmt);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)ke_interaction_folder.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (ke_interaction_folder.NIL != error_message) {
                    Errors.warn((SubLObject)ke_interaction_folder.$str89$Cannot_load_formula_template__A__, param, error_message);
                }
                else {
                    _csetf_ke_interaction_folder_children(folder, (SubLObject)ConsesLow.cons(template_details, ke_interaction_folder_children(folder)));
                }
            }
            else {
                Errors.warn((SubLObject)ke_interaction_folder.$str86$Cannot_handle_resource__A_at_this, param);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        ke_interact_apply_ordering_on_children(folder, elmt, sorting_information);
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12198L)
    public static SubLObject get_ke_interaction_folder_contents_from_kb(final SubLObject folder_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject contents = (SubLObject)ke_interaction_folder.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = ke_interaction_folder.$const30$folderContainsResource;
            final SubLObject deck_type = (SubLObject)ke_interaction_folder.$kw35$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)ke_interaction_folder.NIL;
            final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)ke_interaction_folder.NIL;
                    final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((ke_interaction_folder.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((ke_interaction_folder.NIL != tv_var) ? ke_interaction_folder.$sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (ke_interaction_folder.NIL != tv_var && ke_interaction_folder.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && ke_interaction_folder.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw37$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw40$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$str41$continue_anyway, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw42$WARN)) {
                                Errors.warn((SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)ke_interaction_folder.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)ke_interaction_folder.$str41$continue_anyway, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$34 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_interaction_folder.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds), thread);
                            if (ke_interaction_folder.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || ke_interaction_folder.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(ke_interaction_folder.$const30$folderContainsResource, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$32 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$33 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$35 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_interaction_folder.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(ke_interaction_folder.$const30$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p()); ke_interaction_folder.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$38 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$38;
                                        final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(folder_id, spec_pred, (SubLObject)((ke_interaction_folder.NIL != inverseP) ? ke_interaction_folder.TWO_INTEGER : ke_interaction_folder.ONE_INTEGER), (SubLObject)((ke_interaction_folder.NIL != inverseP) ? ke_interaction_folder.ONE_INTEGER : ke_interaction_folder.TWO_INTEGER), (SubLObject)ke_interaction_folder.UNPROVIDED);
                                            SubLObject item = (SubLObject)ke_interaction_folder.NIL;
                                            item = cdolist_list_var.first();
                                            while (ke_interaction_folder.NIL != cdolist_list_var) {
                                                final SubLObject item_var = item;
                                                if (ke_interaction_folder.NIL == conses_high.member(item_var, contents, Symbols.symbol_function((SubLObject)ke_interaction_folder.EQUAL), Symbols.symbol_function((SubLObject)ke_interaction_folder.IDENTITY))) {
                                                    contents = (SubLObject)ConsesLow.cons(item_var, contents);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                item = cdolist_list_var.first();
                                            }
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const44$genlPreds));
                                            SubLObject module_var = (SubLObject)ke_interaction_folder.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (ke_interaction_folder.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$34 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((ke_interaction_folder.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$38);
                                                    if (ke_interaction_folder.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                        if (ke_interaction_folder.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                            if (ke_interaction_folder.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (ke_interaction_folder.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$43;
                                                                            for (iteration_state_$43 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$43); iteration_state_$43 = dictionary_contents.do_dictionary_contents_next(iteration_state_$43)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$43);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (ke_interaction_folder.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (ke_interaction_folder.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)ke_interaction_folder.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)ke_interaction_folder.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (ke_interaction_folder.NIL != csome_list_var) {
                                                                                                if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$36, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$43);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$35, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.FIVE_INTEGER, (SubLObject)ke_interaction_folder.$str46$attempting_to_bind_direction_link, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (ke_interaction_folder.NIL != obsolete.cnat_p(node, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$45;
                                                        final SubLObject new_list = cdolist_list_var_$45 = ((ke_interaction_folder.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)ke_interaction_folder.NIL;
                                                        generating_fn = cdolist_list_var_$45.first();
                                                        while (ke_interaction_folder.NIL != cdolist_list_var_$45) {
                                                            final SubLObject _prev_bind_0_$37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (ke_interaction_folder.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)ke_interaction_folder.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)ke_interaction_folder.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (ke_interaction_folder.NIL != csome_list_var2) {
                                                                        if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$37, thread);
                                                            }
                                                            cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                                                            generating_fn = cdolist_list_var_$45.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$34, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$34, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$35, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$33, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$32, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)ke_interaction_folder.TWO_INTEGER, (SubLObject)ke_interaction_folder.$str47$Node__a_does_not_pass_sbhl_type_t, ke_interaction_folder.$const30$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$34, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$32, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$31, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$30, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$29, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12575L)
    public static SubLObject cycl_formula_templateP(final SubLObject v_object) {
        if (ke_interaction_folder.NIL != narts_high.nart_with_functor_p(ke_interaction_folder.$const90$TemplateFromTestQueryFn, v_object)) {
            return (SubLObject)ke_interaction_folder.T;
        }
        return isa.isa_in_any_mtP(v_object, ke_interaction_folder.$const28$FormulaTemplate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
    public static SubLObject clear_ke_interaction_folders() {
        final SubLObject cs = ke_interaction_folder.$ke_interaction_folders_caching_state$.getGlobalValue();
        if (ke_interaction_folder.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)ke_interaction_folder.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
    public static SubLObject remove_ke_interaction_folders() {
        return memoization_state.caching_state_remove_function_results_with_args(ke_interaction_folder.$ke_interaction_folders_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(ke_interaction_folder.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
    public static SubLObject ke_interaction_folders_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject folders = set.new_set((SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_interaction_folder.$sym92$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(ke_interaction_folder.$const93$EverythingPSC, thread);
            final SubLObject node_var = ke_interaction_folder.$const5$KEInteractionFolder;
            final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$49 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$50 = node_var;
                    final SubLObject deck_type = (SubLObject)ke_interaction_folder.$kw34$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)ke_interaction_folder.NIL;
                            final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((ke_interaction_folder.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((ke_interaction_folder.NIL != tv_var) ? ke_interaction_folder.$sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (ke_interaction_folder.NIL != tv_var && ke_interaction_folder.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && ke_interaction_folder.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw37$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw40$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$str41$continue_anyway, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)ke_interaction_folder.$kw42$WARN)) {
                                        Errors.warn((SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)ke_interaction_folder.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)ke_interaction_folder.$str41$continue_anyway, (SubLObject)ke_interaction_folder.$str38$_A_is_not_a__A, tv_var, (SubLObject)ke_interaction_folder.$sym39$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_interaction_folder.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa)), thread);
                                    if (ke_interaction_folder.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || ke_interaction_folder.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_interaction_folder.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$50, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                            while (ke_interaction_folder.NIL != node_var_$50) {
                                                final SubLObject tt_node_var = node_var_$50;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa));
                                                SubLObject module_var = (SubLObject)ke_interaction_folder.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (ke_interaction_folder.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((ke_interaction_folder.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (ke_interaction_folder.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                            if (ke_interaction_folder.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                                if (ke_interaction_folder.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (ke_interaction_folder.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$62;
                                                                                for (iteration_state_$62 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$62); iteration_state_$62 = dictionary_contents.do_dictionary_contents_next(iteration_state_$62)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$62);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (ke_interaction_folder.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (ke_interaction_folder.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject folder;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)ke_interaction_folder.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    folder = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state, folder) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (ke_interaction_folder.NIL != forts.fort_p(folder)) {
                                                                                                            set.set_add(folder, folders);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject folder2 = (SubLObject)ke_interaction_folder.NIL;
                                                                                                folder2 = csome_list_var.first();
                                                                                                while (ke_interaction_folder.NIL != csome_list_var) {
                                                                                                    if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (ke_interaction_folder.NIL != forts.fort_p(folder2)) {
                                                                                                            set.set_add(folder2, folders);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    folder2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$62);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.FIVE_INTEGER, (SubLObject)ke_interaction_folder.$str46$attempting_to_bind_direction_link, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                            }
                                                            if (ke_interaction_folder.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)ke_interaction_folder.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (ke_interaction_folder.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)ke_interaction_folder.NIL;
                                                                    SubLObject mt2 = (SubLObject)ke_interaction_folder.NIL;
                                                                    SubLObject tv2 = (SubLObject)ke_interaction_folder.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke_interaction_folder.$list96);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke_interaction_folder.$list96);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke_interaction_folder.$list96);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (ke_interaction_folder.NIL == current) {
                                                                        if (ke_interaction_folder.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (ke_interaction_folder.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (ke_interaction_folder.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject folder;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)ke_interaction_folder.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                folder = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state, folder) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (ke_interaction_folder.NIL != forts.fort_p(folder)) {
                                                                                                        set.set_add(folder, folders);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$66 = sol;
                                                                                            SubLObject folder2 = (SubLObject)ke_interaction_folder.NIL;
                                                                                            folder2 = csome_list_var_$66.first();
                                                                                            while (ke_interaction_folder.NIL != csome_list_var_$66) {
                                                                                                if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (ke_interaction_folder.NIL != forts.fort_p(folder2)) {
                                                                                                        set.set_add(folder2, folders);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$66 = csome_list_var_$66.rest();
                                                                                                folder2 = csome_list_var_$66.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$57, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$56, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ke_interaction_folder.$list96);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (ke_interaction_folder.NIL != obsolete.cnat_p(node, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$67;
                                                            final SubLObject new_list = cdolist_list_var_$67 = ((ke_interaction_folder.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)ke_interaction_folder.NIL;
                                                            generating_fn = cdolist_list_var_$67.first();
                                                            while (ke_interaction_folder.NIL != cdolist_list_var_$67) {
                                                                final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (ke_interaction_folder.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject folder3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)ke_interaction_folder.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            folder3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state2, folder3) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(folder3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (ke_interaction_folder.NIL != forts.fort_p(folder3)) {
                                                                                    set.set_add(folder3, folders);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject folder4 = (SubLObject)ke_interaction_folder.NIL;
                                                                        folder4 = csome_list_var3.first();
                                                                        while (ke_interaction_folder.NIL != csome_list_var3) {
                                                                            if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(folder4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (ke_interaction_folder.NIL != forts.fort_p(folder4)) {
                                                                                    set.set_add(folder4, folders);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            folder4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$58, thread);
                                                                }
                                                                cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                                                                generating_fn = cdolist_list_var_$67.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(ke_interaction_folder.$const94$isa)));
                                                SubLObject module_var2 = (SubLObject)ke_interaction_folder.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (ke_interaction_folder.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((ke_interaction_folder.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$50);
                                                        if (ke_interaction_folder.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                            if (ke_interaction_folder.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED));
                                                                if (ke_interaction_folder.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (ke_interaction_folder.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$63;
                                                                                for (iteration_state_$63 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); ke_interaction_folder.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$63); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next(iteration_state_$63)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$63);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (ke_interaction_folder.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (ke_interaction_folder.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)ke_interaction_folder.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)ke_interaction_folder.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (ke_interaction_folder.NIL != csome_list_var4) {
                                                                                                    if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$61, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$63);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$60, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)ke_interaction_folder.FIVE_INTEGER, (SubLObject)ke_interaction_folder.$str46$attempting_to_bind_direction_link, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (ke_interaction_folder.NIL != obsolete.cnat_p(node2, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$68;
                                                            final SubLObject new_list2 = cdolist_list_var_$68 = ((ke_interaction_folder.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)ke_interaction_folder.NIL;
                                                            generating_fn2 = cdolist_list_var_$68.first();
                                                            while (ke_interaction_folder.NIL != cdolist_list_var_$68) {
                                                                final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (ke_interaction_folder.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)ke_interaction_folder.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); ke_interaction_folder.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (ke_interaction_folder.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)ke_interaction_folder.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (ke_interaction_folder.NIL != csome_list_var5) {
                                                                            if (ke_interaction_folder.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)ke_interaction_folder.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)ke_interaction_folder.$str45$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$62, thread);
                                                                }
                                                                cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                                                                generating_fn2 = cdolist_list_var_$68.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$59, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$50 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$58, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$52, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$52, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)ke_interaction_folder.TWO_INTEGER, (SubLObject)ke_interaction_folder.$str47$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)ke_interaction_folder.UNPROVIDED)), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$51, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$51, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$50, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$49, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$49, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$48, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return folders;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
    public static SubLObject ke_interaction_folders() {
        SubLObject caching_state = ke_interaction_folder.$ke_interaction_folders_caching_state$.getGlobalValue();
        if (ke_interaction_folder.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)ke_interaction_folder.$sym91$KE_INTERACTION_FOLDERS, (SubLObject)ke_interaction_folder.$sym97$_KE_INTERACTION_FOLDERS_CACHING_STATE_, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.EQL, (SubLObject)ke_interaction_folder.ZERO_INTEGER, (SubLObject)ke_interaction_folder.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)ke_interaction_folder.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ke_interaction_folders_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)ke_interaction_folder.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13031L)
    public static SubLObject add_folder_title(final SubLObject argument, final SubLObject assertion) {
        return clear_ke_interaction_folders();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13161L)
    public static SubLObject remove_folder_title(final SubLObject argument, final SubLObject assertion) {
        return clear_ke_interaction_folders();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13296L)
    public static SubLObject ke_interaction_folderP(final SubLObject v_object) {
        if (ke_interaction_folder.NIL == forts.fort_p(v_object)) {
            return (SubLObject)ke_interaction_folder.NIL;
        }
        return set.set_memberP(v_object, ke_interaction_folders());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13498L)
    public static SubLObject templates_in_folder(final SubLObject folder_id, SubLObject elmt, SubLObject include_subfoldersP) {
        if (elmt == ke_interaction_folder.UNPROVIDED) {
            elmt = ke_interaction_folder.$const83$InferencePSC;
        }
        if (include_subfoldersP == ke_interaction_folder.UNPROVIDED) {
            include_subfoldersP = (SubLObject)ke_interaction_folder.T;
        }
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        assert ke_interaction_folder.NIL != forts.fort_p(folder_id) : folder_id;
        assert ke_interaction_folder.NIL != hlmt.hlmt_p(elmt) : elmt;
        SubLObject result = (SubLObject)ke_interaction_folder.NIL;
        SubLObject to_do_items = (SubLObject)ConsesLow.list(folder_id);
        while (ke_interaction_folder.NIL != to_do_items) {
            final SubLObject first_to_do = to_do_items.first();
            final SubLObject children = backward.removal_ask_variable((SubLObject)ke_interaction_folder.$kw72$CHILDREN, (SubLObject)ConsesLow.listS(ke_interaction_folder.$const30$folderContainsResource, first_to_do, (SubLObject)ke_interaction_folder.$list100), elmt, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
            to_do_items = to_do_items.rest();
            SubLObject cdolist_list_var = children;
            SubLObject child = (SubLObject)ke_interaction_folder.NIL;
            child = cdolist_list_var.first();
            while (ke_interaction_folder.NIL != cdolist_list_var) {
                if (ke_interaction_folder.NIL != include_subfoldersP && ke_interaction_folder.NIL != ke_interaction_folderP(child)) {
                    if (ke_interaction_folder.NIL == list_utilities.member_eqP(child, result)) {
                        to_do_items = (SubLObject)ConsesLow.cons(child, to_do_items);
                    }
                }
                else if (ke_interaction_folder.NIL != cycl_formula_templateP(child)) {
                    result = (SubLObject)ConsesLow.cons(child, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 14785L)
    public static SubLObject xml_serialize_ke_interaction_folder(final SubLObject folder, SubLObject stream) {
        if (stream == ke_interaction_folder.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_interaction_folder.NIL != ke_interaction_folder_p(folder) : folder;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)ke_interaction_folder.$str101$folder, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)ke_interaction_folder.$str103$folderId, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(ke_interaction_folder_id(folder));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$81, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)ke_interaction_folder.$str103$folderId);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                            }
                        }
                        if (ke_interaction_folder.NIL != ke_interaction_folder_p(ke_interaction_folder_parent(folder))) {
                            final SubLObject parent = ke_interaction_folder_parent(folder);
                            try {
                                final SubLObject _prev_bind_0_$83 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)ke_interaction_folder.$str104$parentFolderId, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(ke_interaction_folder_id(parent));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$84, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$82, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)ke_interaction_folder.$str104$parentFolderId);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                }
                            }
                        }
                        if (ke_interaction_folder.NIL != ke_interaction_folder_gloss(folder)) {
                            try {
                                final SubLObject _prev_bind_0_$86 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)ke_interaction_folder.$str105$folderTitle, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$87 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(ke_interaction_folder_gloss(folder));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$87, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$83, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$86, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)ke_interaction_folder.$str105$folderTitle);
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                                }
                            }
                        }
                        final SubLObject children = ke_interaction_folder_children(folder);
                        SubLObject valid_children = (SubLObject)ke_interaction_folder.NIL;
                        SubLObject cdolist_list_var = children;
                        SubLObject child = (SubLObject)ke_interaction_folder.NIL;
                        child = cdolist_list_var.first();
                        while (ke_interaction_folder.NIL != cdolist_list_var) {
                            if (ke_interaction_folder.NIL != ke_interaction_folder_p(child)) {
                                valid_children = (SubLObject)ConsesLow.cons(child, valid_children);
                            }
                            else if (ke_interaction_folder.NIL != formula_templates.valid_formula_template_p(child)) {
                                valid_children = (SubLObject)ConsesLow.cons(child, valid_children);
                            }
                            else {
                                Errors.warn((SubLObject)ke_interaction_folder.$str106$Cannot_interpret_resource__A__ski, child);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            child = cdolist_list_var.first();
                        }
                        if (ke_interaction_folder.NIL != valid_children) {
                            try {
                                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)ke_interaction_folder.$str107$children, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.NIL, (SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)ke_interaction_folder.$kw102$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var2 = Sequences.nreverse(valid_children);
                                        SubLObject child2 = (SubLObject)ke_interaction_folder.NIL;
                                        child2 = cdolist_list_var2.first();
                                        while (ke_interaction_folder.NIL != cdolist_list_var2) {
                                            if (ke_interaction_folder.NIL != ke_interaction_folder_p(child2)) {
                                                xml_serialize_ke_interaction_folder(child2, stream);
                                            }
                                            else if (ke_interaction_folder.NIL != formula_templates.formula_template_p(child2)) {
                                                formula_templates.xml_serialize_formula_template(child2, stream);
                                            }
                                            else {
                                                Errors.warn((SubLObject)ke_interaction_folder.$str108$Resource__A_slipped_through_but_c, child2);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            child2 = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$84, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)ke_interaction_folder.$str107$children);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$79, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$78, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_interaction_folder.T, thread);
                    final SubLObject _values5 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)ke_interaction_folder.$str101$folder);
                    Values.restoreValuesFromVector(_values5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16414L)
    public static SubLObject get_all_query_libraries() {
        return Sort.sort(isa.all_fort_instances(ke_interaction_folder.$const5$KEInteractionFolder, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym109$STRING_), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym110$FORT_NAME));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16558L)
    public static SubLObject remove_task_query_libraries(final SubLObject qls) {
        return Sequences.remove_if(Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym111$QUERY_LIBRARY_FOR_TASK_), qls, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16659L)
    public static SubLObject remove_non_cyclist_query_libraries(final SubLObject qls) {
        return Sequences.remove_if(Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym112$QUERY_LIBRARY_FOR_NON_CYLIST_), qls, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16773L)
    public static SubLObject get_all_query_library_mts() {
        return Sort.sort(genl_mts.all_spec_mts(ke_interaction_folder.$const113$GKEFormulaTemplatesMt, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym109$STRING_), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym110$FORT_NAME));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16956L)
    public static SubLObject query_library_for_taskP(final SubLObject ql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke_interaction_folder.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_interaction_folder.$sym92$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(ke_interaction_folder.$const93$EverythingPSC, thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL != kb_mapping_utilities.some_pred_value(ql, ke_interaction_folder.$const114$kEInteractionFolderOfUserForTaskW, (SubLObject)ke_interaction_folder.FOUR_INTEGER, (SubLObject)ke_interaction_folder.UNPROVIDED) || ke_interaction_folder.NIL != kb_mapping_utilities.some_pred_value(ql, ke_interaction_folder.$const115$kEInteractionFolderOfUserForTask, (SubLObject)ke_interaction_folder.THREE_INTEGER, (SubLObject)ke_interaction_folder.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 17243L)
    public static SubLObject query_library_for_non_cylistP(final SubLObject ql) {
        SubLObject users = kb_mapping_utilities.pred_values_in_any_mt(ql, ke_interaction_folder.$const114$kEInteractionFolderOfUserForTaskW, (SubLObject)ke_interaction_folder.FOUR_INTEGER, (SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.UNPROVIDED);
        SubLObject cyclist_found = (SubLObject)ke_interaction_folder.NIL;
        users = ConsesLow.nconc(users, kb_mapping_utilities.pred_values_in_any_mt(ql, ke_interaction_folder.$const115$kEInteractionFolderOfUserForTask, (SubLObject)ke_interaction_folder.THREE_INTEGER, (SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.UNPROVIDED));
        users = ConsesLow.nconc(users, kb_mapping_utilities.pred_values_in_any_mt(ql, ke_interaction_folder.$const116$kEInteractionFolderOfUser, (SubLObject)ke_interaction_folder.TWO_INTEGER, (SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.UNPROVIDED));
        users = Sequences.remove_duplicates(users, Symbols.symbol_function((SubLObject)ke_interaction_folder.EQUAL), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
        if (ke_interaction_folder.NIL == users) {
            return (SubLObject)ke_interaction_folder.NIL;
        }
        if (ke_interaction_folder.NIL == cyclist_found) {
            SubLObject csome_list_var = users;
            SubLObject user = (SubLObject)ke_interaction_folder.NIL;
            user = csome_list_var.first();
            while (ke_interaction_folder.NIL == cyclist_found && ke_interaction_folder.NIL != csome_list_var) {
                if (ke_interaction_folder.NIL != kb_accessors.cyclistP(user)) {
                    cyclist_found = (SubLObject)ke_interaction_folder.T;
                }
                csome_list_var = csome_list_var.rest();
                user = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_interaction_folder.NIL == cyclist_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 17897L)
    public static SubLObject ke_interact_obtain_ordering_info(final SubLObject folder_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordering_info = (SubLObject)ke_interaction_folder.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(folder_id, ke_interaction_folder.$const117$higherPriorityInFolder, (SubLObject)ke_interaction_folder.ONE_INTEGER, (SubLObject)ke_interaction_folder.$kw23$TRUE);
            SubLObject assertion = (SubLObject)ke_interaction_folder.NIL;
            assertion = cdolist_list_var.first();
            while (ke_interaction_folder.NIL != cdolist_list_var) {
                ordering_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.gaf_arg2(assertion), assertions_high.gaf_arg3(assertion)), ordering_info);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(ordering_info);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(high_to_low, low_to_high);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 20545L)
    public static SubLObject ke_interact_apply_ordering_on_children(final SubLObject folder, final SubLObject elmt, final SubLObject ordering) {
        SubLObject high_to_low = (SubLObject)ke_interaction_folder.NIL;
        SubLObject low_to_high = (SubLObject)ke_interaction_folder.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(ordering, ordering, (SubLObject)ke_interaction_folder.$list118);
        high_to_low = ordering.first();
        SubLObject current = ordering.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, ordering, (SubLObject)ke_interaction_folder.$list118);
        low_to_high = current.first();
        current = current.rest();
        if (ke_interaction_folder.NIL == current) {
            final SubLObject sorted_ids = formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
            final SubLObject children = ke_interaction_folder_children(folder);
            final SubLObject sorted = (SubLObject)ConsesLow.make_list(Sequences.length(sorted_ids), (SubLObject)ke_interaction_folder.UNPROVIDED);
            SubLObject unsorted_tail = (SubLObject)ke_interaction_folder.NIL;
            if (ke_interaction_folder.NIL == sorted_ids) {
                return folder;
            }
            SubLObject cdolist_list_var = children;
            SubLObject child = (SubLObject)ke_interaction_folder.NIL;
            child = cdolist_list_var.first();
            while (ke_interaction_folder.NIL != cdolist_list_var) {
                final SubLObject child_object = Sequences.find(ke_interaction_folder_object_id(child), sorted_ids, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                if (ke_interaction_folder.NIL == child_object) {
                    unsorted_tail = (SubLObject)ConsesLow.cons(child, unsorted_tail);
                }
                else {
                    final SubLObject spot = Sequences.position(ke_interaction_folder_object_id(child), sorted_ids, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED);
                    ConsesLow.set_nth(spot, sorted, child);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
            _csetf_ke_interaction_folder_children(folder, Sequences.delete_if(Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym119$NULL), Sequences.cconcatenate(sorted, Sort.sort(unsorted_tail, Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym120$_), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym121$KE_INTERACTION_FOLDER_SORT_KEY))), (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED, (SubLObject)ke_interaction_folder.UNPROVIDED));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(ordering, (SubLObject)ke_interaction_folder.$list118);
        }
        return folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 21790L)
    public static SubLObject ke_interaction_folder_sort_key(final SubLObject folder) {
        return misc_kb_utilities.get_term_id(ke_interaction_folder_object_id(folder));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 21911L)
    public static SubLObject ke_interaction_folder_object_id(final SubLObject v_object) {
        return (SubLObject)((ke_interaction_folder.NIL != ke_interaction_folder_p(v_object)) ? ke_interaction_folder_id(v_object) : ((ke_interaction_folder.NIL != formula_templates.formula_template_p(v_object)) ? formula_templates.formula_template_id(v_object) : ke_interaction_folder.NIL));
    }
    
    public static SubLObject declare_ke_interaction_folder_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "create_new_subfolder", "CREATE-NEW-SUBFOLDER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "relexify_ke_interaction_folder_constant", "RELEXIFY-KE-INTERACTION-FOLDER-CONSTANT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "lexify_ke_interaction_folder_constant", "LEXIFY-KE-INTERACTION-FOLDER-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "move_ke_interaction_resource", "MOVE-KE-INTERACTION-RESOURCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "add_ke_interaction_resource_to_folder", "ADD-KE-INTERACTION-RESOURCE-TO-FOLDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "remove_ke_interaction_resource_from_folder", "REMOVE-KE-INTERACTION-RESOURCE-FROM-FOLDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "default_mt_for_ke_interaction_folder", "DEFAULT-MT-FOR-KE-INTERACTION-FOLDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_print_function_trampoline", "KE-INTERACTION-FOLDER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_p", "KE-INTERACTION-FOLDER-P", 1, 0, false);
        new $ke_interaction_folder_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_id", "KE-INTERACTION-FOLDER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_mt", "KE-INTERACTION-FOLDER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_gloss", "KE-INTERACTION-FOLDER-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_parent", "KE-INTERACTION-FOLDER-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_children", "KE-INTERACTION-FOLDER-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "_csetf_ke_interaction_folder_id", "_CSETF-KE-INTERACTION-FOLDER-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "_csetf_ke_interaction_folder_mt", "_CSETF-KE-INTERACTION-FOLDER-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "_csetf_ke_interaction_folder_gloss", "_CSETF-KE-INTERACTION-FOLDER-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "_csetf_ke_interaction_folder_parent", "_CSETF-KE-INTERACTION-FOLDER-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "_csetf_ke_interaction_folder_children", "_CSETF-KE-INTERACTION-FOLDER-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "make_ke_interaction_folder", "MAKE-KE-INTERACTION-FOLDER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "visit_defstruct_ke_interaction_folder", "VISIT-DEFSTRUCT-KE-INTERACTION-FOLDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "visit_defstruct_object_ke_interaction_folder_method", "VISIT-DEFSTRUCT-OBJECT-KE-INTERACTION-FOLDER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "print_ke_interaction_folder", "PRINT-KE-INTERACTION-FOLDER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "new_ke_interaction_folder", "NEW-KE-INTERACTION-FOLDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_load_query_library", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "update_folder_query_params_using_defaults", "UPDATE-FOLDER-QUERY-PARAMS-USING-DEFAULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_load_query_library_skeleton", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-SKELETON", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_get_gloss_for_folder_id", "KE-INTERACTION-FOLDER-GET-GLOSS-FOR-FOLDER-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_load_one_level", "KE-INTERACTION-FOLDER-LOAD-ONE-LEVEL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "get_ke_interaction_folder_contents_from_kb", "GET-KE-INTERACTION-FOLDER-CONTENTS-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "cycl_formula_templateP", "CYCL-FORMULA-TEMPLATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "clear_ke_interaction_folders", "CLEAR-KE-INTERACTION-FOLDERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "remove_ke_interaction_folders", "REMOVE-KE-INTERACTION-FOLDERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folders_internal", "KE-INTERACTION-FOLDERS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folders", "KE-INTERACTION-FOLDERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "add_folder_title", "ADD-FOLDER-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "remove_folder_title", "REMOVE-FOLDER-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folderP", "KE-INTERACTION-FOLDER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "templates_in_folder", "TEMPLATES-IN-FOLDER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "xml_serialize_ke_interaction_folder", "XML-SERIALIZE-KE-INTERACTION-FOLDER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "get_all_query_libraries", "GET-ALL-QUERY-LIBRARIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "remove_task_query_libraries", "REMOVE-TASK-QUERY-LIBRARIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "remove_non_cyclist_query_libraries", "REMOVE-NON-CYCLIST-QUERY-LIBRARIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "get_all_query_library_mts", "GET-ALL-QUERY-LIBRARY-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "query_library_for_taskP", "QUERY-LIBRARY-FOR-TASK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "query_library_for_non_cylistP", "QUERY-LIBRARY-FOR-NON-CYLIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interact_obtain_ordering_info", "KE-INTERACT-OBTAIN-ORDERING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interact_apply_ordering_on_children", "KE-INTERACT-APPLY-ORDERING-ON-CHILDREN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_sort_key", "KE-INTERACTION-FOLDER-SORT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_interaction_folder", "ke_interaction_folder_object_id", "KE-INTERACTION-FOLDER-OBJECT-ID", 1, 0, false);
        return (SubLObject)ke_interaction_folder.NIL;
    }
    
    public static SubLObject init_ke_interaction_folder_file() {
        ke_interaction_folder.$default_new_ke_interaction_folder_name$ = SubLFiles.deflexical("*DEFAULT-NEW-KE-INTERACTION-FOLDER-NAME*", (SubLObject)ke_interaction_folder.$str0$New_Folder);
        ke_interaction_folder.$dtp_ke_interaction_folder$ = SubLFiles.defconstant("*DTP-KE-INTERACTION-FOLDER*", (SubLObject)ke_interaction_folder.$sym49$KE_INTERACTION_FOLDER);
        ke_interaction_folder.$ke_interaction_folders_caching_state$ = SubLFiles.deflexical("*KE-INTERACTION-FOLDERS-CACHING-STATE*", (SubLObject)ke_interaction_folder.NIL);
        return (SubLObject)ke_interaction_folder.NIL;
    }
    
    public static SubLObject setup_ke_interaction_folder_file() {
        access_macros.register_external_symbol((SubLObject)ke_interaction_folder.$sym1$CREATE_NEW_SUBFOLDER);
        access_macros.register_external_symbol((SubLObject)ke_interaction_folder.$sym18$RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT);
        access_macros.register_external_symbol((SubLObject)ke_interaction_folder.$sym24$MOVE_KE_INTERACTION_RESOURCE);
        access_macros.register_external_symbol((SubLObject)ke_interaction_folder.$sym25$ADD_KE_INTERACTION_RESOURCE_TO_FOLDER);
        access_macros.register_external_symbol((SubLObject)ke_interaction_folder.$sym31$REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), ke_interaction_folder.$dtp_ke_interaction_folder$.getGlobalValue(), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym56$KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)ke_interaction_folder.$list57);
        Structures.def_csetf((SubLObject)ke_interaction_folder.$sym58$KE_INTERACTION_FOLDER_ID, (SubLObject)ke_interaction_folder.$sym59$_CSETF_KE_INTERACTION_FOLDER_ID);
        Structures.def_csetf((SubLObject)ke_interaction_folder.$sym60$KE_INTERACTION_FOLDER_MT, (SubLObject)ke_interaction_folder.$sym61$_CSETF_KE_INTERACTION_FOLDER_MT);
        Structures.def_csetf((SubLObject)ke_interaction_folder.$sym62$KE_INTERACTION_FOLDER_GLOSS, (SubLObject)ke_interaction_folder.$sym63$_CSETF_KE_INTERACTION_FOLDER_GLOSS);
        Structures.def_csetf((SubLObject)ke_interaction_folder.$sym64$KE_INTERACTION_FOLDER_PARENT, (SubLObject)ke_interaction_folder.$sym65$_CSETF_KE_INTERACTION_FOLDER_PARENT);
        Structures.def_csetf((SubLObject)ke_interaction_folder.$sym66$KE_INTERACTION_FOLDER_CHILDREN, (SubLObject)ke_interaction_folder.$sym67$_CSETF_KE_INTERACTION_FOLDER_CHILDREN);
        Equality.identity((SubLObject)ke_interaction_folder.$sym49$KE_INTERACTION_FOLDER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), ke_interaction_folder.$dtp_ke_interaction_folder$.getGlobalValue(), Symbols.symbol_function((SubLObject)ke_interaction_folder.$sym78$VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)ke_interaction_folder.$sym91$KE_INTERACTION_FOLDERS);
        utilities_macros.register_kb_function((SubLObject)ke_interaction_folder.$sym98$ADD_FOLDER_TITLE);
        utilities_macros.register_kb_function((SubLObject)ke_interaction_folder.$sym99$REMOVE_FOLDER_TITLE);
        return (SubLObject)ke_interaction_folder.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ke_interaction_folder_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ke_interaction_folder_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ke_interaction_folder_file();
    }
    
    static {
        me = (SubLFile)new ke_interaction_folder();
        ke_interaction_folder.$default_new_ke_interaction_folder_name$ = null;
        ke_interaction_folder.$dtp_ke_interaction_folder$ = null;
        ke_interaction_folder.$ke_interaction_folders_caching_state$ = null;
        $str0$New_Folder = SubLObjectFactory.makeString("New Folder");
        $sym1$CREATE_NEW_SUBFOLDER = SubLObjectFactory.makeSymbol("CREATE-NEW-SUBFOLDER");
        $const2$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $sym3$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym4$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
        $const5$KEInteractionFolder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEInteractionFolder"));
        $str6$_S_is_not_known_to_be_a_KE_intera = SubLObjectFactory.makeString("~S is not known to be a KE interaction folder in ~S");
        $str7$UserCreatedFolder = SubLObjectFactory.makeString("UserCreatedFolder");
        $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw9$X = SubLObjectFactory.makeKeyword("X");
        $const10$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const11$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const12$subFolders = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subFolders"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FOLDER"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderTitle")), (SubLObject)SubLObjectFactory.makeSymbol("?FOLDER"), (SubLObject)SubLObjectFactory.makeKeyword("X")));
        $kw15$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw16$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $str17$_ = SubLObjectFactory.makeString("-");
        $sym18$RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT = SubLObjectFactory.makeSymbol("RELEXIFY-KE-INTERACTION-FOLDER-CONSTANT");
        $sym19$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym20$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $const21$folderTitle = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderTitle"));
        $kw22$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw23$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym24$MOVE_KE_INTERACTION_RESOURCE = SubLObjectFactory.makeSymbol("MOVE-KE-INTERACTION-RESOURCE");
        $sym25$ADD_KE_INTERACTION_RESOURCE_TO_FOLDER = SubLObjectFactory.makeSymbol("ADD-KE-INTERACTION-RESOURCE-TO-FOLDER");
        $const26$KEInteractionResource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEInteractionResource"));
        $str27$_S_is_not_known_to_be_a_KE_intera = SubLObjectFactory.makeString("~S is not known to be a KE interaction resource in ~S");
        $const28$FormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplate"));
        $const29$folderContainsTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderContainsTemplate"));
        $const30$folderContainsResource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderContainsResource"));
        $sym31$REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER = SubLObjectFactory.makeSymbol("REMOVE-KE-INTERACTION-RESOURCE-FROM-FOLDER");
        $str32$_S_is_not_known_to_be_in__S_in__S = SubLObjectFactory.makeString("~S is not known to be in ~S in ~S");
        $kw33$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw34$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw35$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw37$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str38$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym39$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw40$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str41$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw42$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str43$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const44$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str45$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str46$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str47$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const48$KEInteractionResourceTestMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEInteractionResourceTestMt"));
        $sym49$KE_INTERACTION_FOLDER = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER");
        $sym50$KE_INTERACTION_FOLDER_P = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-P");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("CHILDREN"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("GLOSS"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("CHILDREN"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-ID"), (SubLObject)SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-CHILDREN"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-CHILDREN"));
        $sym55$PRINT_KE_INTERACTION_FOLDER = SubLObjectFactory.makeSymbol("PRINT-KE-INTERACTION-FOLDER");
        $sym56$KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-PRINT-FUNCTION-TRAMPOLINE");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-P"));
        $sym58$KE_INTERACTION_FOLDER_ID = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-ID");
        $sym59$_CSETF_KE_INTERACTION_FOLDER_ID = SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-ID");
        $sym60$KE_INTERACTION_FOLDER_MT = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-MT");
        $sym61$_CSETF_KE_INTERACTION_FOLDER_MT = SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-MT");
        $sym62$KE_INTERACTION_FOLDER_GLOSS = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-GLOSS");
        $sym63$_CSETF_KE_INTERACTION_FOLDER_GLOSS = SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-GLOSS");
        $sym64$KE_INTERACTION_FOLDER_PARENT = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-PARENT");
        $sym65$_CSETF_KE_INTERACTION_FOLDER_PARENT = SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-PARENT");
        $sym66$KE_INTERACTION_FOLDER_CHILDREN = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-CHILDREN");
        $sym67$_CSETF_KE_INTERACTION_FOLDER_CHILDREN = SubLObjectFactory.makeSymbol("_CSETF-KE-INTERACTION-FOLDER-CHILDREN");
        $kw68$ID = SubLObjectFactory.makeKeyword("ID");
        $kw69$MT = SubLObjectFactory.makeKeyword("MT");
        $kw70$GLOSS = SubLObjectFactory.makeKeyword("GLOSS");
        $kw71$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw72$CHILDREN = SubLObjectFactory.makeKeyword("CHILDREN");
        $str73$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw74$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym75$MAKE_KE_INTERACTION_FOLDER = SubLObjectFactory.makeSymbol("MAKE-KE-INTERACTION-FOLDER");
        $kw76$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw77$END = SubLObjectFactory.makeKeyword("END");
        $sym78$VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KE-INTERACTION-FOLDER-METHOD");
        $str79$_A_in_mt___A__ = SubLObjectFactory.makeString("~A in mt: ~A~%");
        $sym80$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $kw81$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TITLE"));
        $const83$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym84$_CHILD = SubLObjectFactory.makeSymbol("?CHILD");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELMT"));
        $str86$Cannot_handle_resource__A_at_this = SubLObjectFactory.makeString("Cannot handle resource ~A at this point in time -- skipping.");
        $kw87$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym88$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str89$Cannot_load_formula_template__A__ = SubLObjectFactory.makeString("Cannot load formula template ~A -- skipping.~%~S");
        $const90$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $sym91$KE_INTERACTION_FOLDERS = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDERS");
        $sym92$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const93$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const94$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw95$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $sym97$_KE_INTERACTION_FOLDERS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*KE-INTERACTION-FOLDERS-CACHING-STATE*");
        $sym98$ADD_FOLDER_TITLE = SubLObjectFactory.makeSymbol("ADD-FOLDER-TITLE");
        $sym99$REMOVE_FOLDER_TITLE = SubLObjectFactory.makeSymbol("REMOVE-FOLDER-TITLE");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHILDREN"));
        $str101$folder = SubLObjectFactory.makeString("folder");
        $kw102$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str103$folderId = SubLObjectFactory.makeString("folderId");
        $str104$parentFolderId = SubLObjectFactory.makeString("parentFolderId");
        $str105$folderTitle = SubLObjectFactory.makeString("folderTitle");
        $str106$Cannot_interpret_resource__A__ski = SubLObjectFactory.makeString("Cannot interpret resource ~A, skipping.");
        $str107$children = SubLObjectFactory.makeString("children");
        $str108$Resource__A_slipped_through_but_c = SubLObjectFactory.makeString("Resource ~A slipped through but cannot be interpreted, skipping.");
        $sym109$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym110$FORT_NAME = SubLObjectFactory.makeSymbol("FORT-NAME");
        $sym111$QUERY_LIBRARY_FOR_TASK_ = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-FOR-TASK?");
        $sym112$QUERY_LIBRARY_FOR_NON_CYLIST_ = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-FOR-NON-CYLIST?");
        $const113$GKEFormulaTemplatesMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GKEFormulaTemplatesMt"));
        $const114$kEInteractionFolderOfUserForTaskW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kEInteractionFolderOfUserForTaskWRTConcept"));
        $const115$kEInteractionFolderOfUserForTask = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kEInteractionFolderOfUserForTask"));
        $const116$kEInteractionFolderOfUser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kEInteractionFolderOfUser"));
        $const117$higherPriorityInFolder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("higherPriorityInFolder"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIGH-TO-LOW"), (SubLObject)SubLObjectFactory.makeSymbol("LOW-TO-HIGH"));
        $sym119$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym120$_ = SubLObjectFactory.makeSymbol("<");
        $sym121$KE_INTERACTION_FOLDER_SORT_KEY = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-SORT-KEY");
    }
    
    public static final class $ke_interaction_folder_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $mt;
        public SubLObject $gloss;
        public SubLObject $parent;
        public SubLObject $children;
        private static final SubLStructDeclNative structDecl;
        
        public $ke_interaction_folder_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$gloss = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ke_interaction_folder_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$gloss;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$parent;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$children;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$gloss = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$parent = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$children = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ke_interaction_folder_native.class, ke_interaction_folder.$sym49$KE_INTERACTION_FOLDER, ke_interaction_folder.$sym50$KE_INTERACTION_FOLDER_P, ke_interaction_folder.$list51, ke_interaction_folder.$list52, new String[] { "$id", "$mt", "$gloss", "$parent", "$children" }, ke_interaction_folder.$list53, ke_interaction_folder.$list54, ke_interaction_folder.$sym55$PRINT_KE_INTERACTION_FOLDER);
        }
    }
    
    public static final class $ke_interaction_folder_p$UnaryFunction extends UnaryFunction
    {
        public $ke_interaction_folder_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KE-INTERACTION-FOLDER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return ke_interaction_folder.ke_interaction_folder_p(arg1);
        }
    }
}

/*

	Total time: 2300 ms
	
*/