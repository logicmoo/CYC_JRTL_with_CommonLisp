/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KE-INTERACTION-FOLDER
 * source file: /cyc/top/cycl/ke-interaction-folder.lisp
 * created:     2019/07/03 17:38:02
 */
public final class ke_interaction_folder extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ke_interaction_folder();

 public static final String myName = "com.cyc.cycjava.cycl.ke_interaction_folder";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_new_ke_interaction_folder_name$ = makeSymbol("*DEFAULT-NEW-KE-INTERACTION-FOLDER-NAME*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ke_interaction_folder$ = makeSymbol("*DTP-KE-INTERACTION-FOLDER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$New_Folder = makeString("New Folder");

    private static final SubLSymbol CREATE_NEW_SUBFOLDER = makeSymbol("CREATE-NEW-SUBFOLDER");





    static private final SubLString $str6$_S_is_not_known_to_be_a_KE_intera = makeString("~S is not known to be a KE interaction folder in ~S");

    static private final SubLString $$$UserCreatedFolder = makeString("UserCreatedFolder");









    static private final SubLList $list13 = list(makeSymbol("?FOLDER"));

    static private final SubLList $list14 = list(list(reader_make_constant_shell("folderTitle"), makeSymbol("?FOLDER"), makeKeyword("X")));

    static private final SubLString $str17$_ = makeString("-");

    private static final SubLSymbol RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT = makeSymbol("RELEXIFY-KE-INTERACTION-FOLDER-CONSTANT");



    private static final SubLSymbol MOVE_KE_INTERACTION_RESOURCE = makeSymbol("MOVE-KE-INTERACTION-RESOURCE");

    private static final SubLSymbol ADD_KE_INTERACTION_RESOURCE_TO_FOLDER = makeSymbol("ADD-KE-INTERACTION-RESOURCE-TO-FOLDER");



    private static final SubLString $str27$_S_is_not_known_to_be_a_KE_intera = makeString("~S is not known to be a KE interaction resource in ~S");







    private static final SubLSymbol REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER = makeSymbol("REMOVE-KE-INTERACTION-RESOURCE-FROM-FOLDER");

    private static final SubLString $str32$_S_is_not_known_to_be_in__S_in__S = makeString("~S is not known to be in ~S in ~S");

    private static final SubLString $str38$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str43$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str45$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str46$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str47$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    private static final SubLSymbol KE_INTERACTION_FOLDER = makeSymbol("KE-INTERACTION-FOLDER");

    private static final SubLSymbol KE_INTERACTION_FOLDER_P = makeSymbol("KE-INTERACTION-FOLDER-P");

    private static final SubLList $list51 = list(makeSymbol("ID"), makeSymbol("MT"), makeSymbol("GLOSS"), makeSymbol("PARENT"), makeSymbol("CHILDREN"));

    private static final SubLList $list52 = list(makeKeyword("ID"), makeKeyword("MT"), makeKeyword("GLOSS"), makeKeyword("PARENT"), makeKeyword("CHILDREN"));

    private static final SubLList $list53 = list(makeSymbol("KE-INTERACTION-FOLDER-ID"), makeSymbol("KE-INTERACTION-FOLDER-MT"), makeSymbol("KE-INTERACTION-FOLDER-GLOSS"), makeSymbol("KE-INTERACTION-FOLDER-PARENT"), makeSymbol("KE-INTERACTION-FOLDER-CHILDREN"));

    private static final SubLList $list54 = list(makeSymbol("_CSETF-KE-INTERACTION-FOLDER-ID"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-MT"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-GLOSS"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-PARENT"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-CHILDREN"));

    private static final SubLSymbol PRINT_KE_INTERACTION_FOLDER = makeSymbol("PRINT-KE-INTERACTION-FOLDER");

    private static final SubLSymbol KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KE-INTERACTION-FOLDER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list57 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KE-INTERACTION-FOLDER-P"));

    private static final SubLSymbol KE_INTERACTION_FOLDER_ID = makeSymbol("KE-INTERACTION-FOLDER-ID");

    private static final SubLSymbol _CSETF_KE_INTERACTION_FOLDER_ID = makeSymbol("_CSETF-KE-INTERACTION-FOLDER-ID");

    private static final SubLSymbol KE_INTERACTION_FOLDER_MT = makeSymbol("KE-INTERACTION-FOLDER-MT");

    private static final SubLSymbol _CSETF_KE_INTERACTION_FOLDER_MT = makeSymbol("_CSETF-KE-INTERACTION-FOLDER-MT");

    private static final SubLSymbol KE_INTERACTION_FOLDER_GLOSS = makeSymbol("KE-INTERACTION-FOLDER-GLOSS");

    private static final SubLSymbol _CSETF_KE_INTERACTION_FOLDER_GLOSS = makeSymbol("_CSETF-KE-INTERACTION-FOLDER-GLOSS");

    private static final SubLSymbol KE_INTERACTION_FOLDER_PARENT = makeSymbol("KE-INTERACTION-FOLDER-PARENT");

    private static final SubLSymbol _CSETF_KE_INTERACTION_FOLDER_PARENT = makeSymbol("_CSETF-KE-INTERACTION-FOLDER-PARENT");

    private static final SubLSymbol KE_INTERACTION_FOLDER_CHILDREN = makeSymbol("KE-INTERACTION-FOLDER-CHILDREN");

    private static final SubLSymbol _CSETF_KE_INTERACTION_FOLDER_CHILDREN = makeSymbol("_CSETF-KE-INTERACTION-FOLDER-CHILDREN");

    private static final SubLString $str73$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KE_INTERACTION_FOLDER = makeSymbol("MAKE-KE-INTERACTION-FOLDER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KE-INTERACTION-FOLDER-METHOD");

    private static final SubLString $str79$_A_in_mt___A__ = makeString("~A in mt: ~A~%");

    private static final SubLList $list82 = list(makeKeyword("TITLE"));



    private static final SubLSymbol $sym84$_CHILD = makeSymbol("?CHILD");

    private static final SubLList $list85 = list(makeSymbol("ELMT"));

    private static final SubLString $str86$Cannot_handle_resource__A_at_this = makeString("Cannot handle resource ~A at this point in time -- skipping.");

    private static final SubLString $str89$Cannot_load_formula_template__A__ = makeString("Cannot load formula template ~A -- skipping.~%~S");



    private static final SubLSymbol KE_INTERACTION_FOLDERS = makeSymbol("KE-INTERACTION-FOLDERS");





    private static final SubLList $list96 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLSymbol $ke_interaction_folders_caching_state$ = makeSymbol("*KE-INTERACTION-FOLDERS-CACHING-STATE*");

    private static final SubLSymbol ADD_FOLDER_TITLE = makeSymbol("ADD-FOLDER-TITLE");

    private static final SubLSymbol REMOVE_FOLDER_TITLE = makeSymbol("REMOVE-FOLDER-TITLE");

    private static final SubLList $list100 = list(makeKeyword("CHILDREN"));

    private static final SubLString $$$folder = makeString("folder");

    private static final SubLString $$$folderId = makeString("folderId");

    private static final SubLString $$$parentFolderId = makeString("parentFolderId");

    private static final SubLString $$$folderTitle = makeString("folderTitle");

    private static final SubLString $str106$Cannot_interpret_resource__A__ski = makeString("Cannot interpret resource ~A, skipping.");

    private static final SubLString $$$children = makeString("children");

    private static final SubLString $str108$Resource__A_slipped_through_but_c = makeString("Resource ~A slipped through but cannot be interpreted, skipping.");

    private static final SubLSymbol $sym109$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol $sym111$QUERY_LIBRARY_FOR_TASK_ = makeSymbol("QUERY-LIBRARY-FOR-TASK?");

    private static final SubLSymbol $sym112$QUERY_LIBRARY_FOR_NON_CYLIST_ = makeSymbol("QUERY-LIBRARY-FOR-NON-CYLIST?");



    private static final SubLObject $const114$kEInteractionFolderOfUserForTaskW = reader_make_constant_shell("kEInteractionFolderOfUserForTaskWRTConcept");







    private static final SubLList $list118 = list(makeSymbol("HIGH-TO-LOW"), makeSymbol("LOW-TO-HIGH"));

    private static final SubLSymbol $sym120$_ = makeSymbol("<");

    private static final SubLSymbol KE_INTERACTION_FOLDER_SORT_KEY = makeSymbol("KE-INTERACTION-FOLDER-SORT-KEY");

    /**
     * Create and return a new subfolder of FOLDER-ID, with a #$folderTitle assertion in LEX-MT.
     */
    @LispMethod(comment = "Create and return a new subfolder of FOLDER-ID, with a #$folderTitle assertion in LEX-MT.")
    public static final SubLObject create_new_subfolder_alt(SubLObject folder_id, SubLObject lex_mt) {
        if (lex_mt == UNPROVIDED) {
            lex_mt = $$GeneralEnglishMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(folder_id, INDEXED_TERM_P);
            SubLTrampolineFile.checkType(lex_mt, POSSIBLY_HLMT_P);
            {
                SubLObject defining_mt = default_mt_for_ke_interaction_folder(folder_id);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(folder_id, $$KEInteractionFolder, defining_mt, UNPROVIDED)) {
                        Errors.error($str_alt6$_S_is_not_known_to_be_a_KE_intera, folder_id, defining_mt);
                    }
                }
                {
                    SubLObject new_folder = rkf_term_utilities.create_new_constant($$$UserCreatedFolder, list($$KEInteractionFolder), NIL, $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    add_ke_interaction_resource_to_folder(new_folder, folder_id);
                    {
                        SubLObject name_stem = $default_new_ke_interaction_folder_name$.getGlobalValue();
                        SubLObject name = name_stem;
                        SubLObject suffix = ZERO_INTEGER;
                        SubLObject existing = ask_utilities.query_variable($X, listS($$and, list($$ist, defining_mt, listS($$subFolders, folder_id, $list_alt13)), $list_alt14), lex_mt, list($INFERENCE_MODE, $MINIMAL));
                        while (NIL != member(name, existing, symbol_function(EQUAL), UNPROVIDED)) {
                            suffix = add(suffix, ONE_INTEGER);
                            name = cconcatenate(format_nil.format_nil_a_no_copy(name_stem), new SubLObject[]{ $str_alt17$_, format_nil.format_nil_d_no_copy(suffix) });
                        } 
                        lexify_ke_interaction_folder_constant(new_folder, name, lex_mt);
                    }
                    return new_folder;
                }
            }
        }
    }

    /**
     * Create and return a new subfolder of FOLDER-ID, with a #$folderTitle assertion in LEX-MT.
     */
    @LispMethod(comment = "Create and return a new subfolder of FOLDER-ID, with a #$folderTitle assertion in LEX-MT.")
    public static SubLObject create_new_subfolder(final SubLObject folder_id, SubLObject lex_mt) {
        if (lex_mt == UNPROVIDED) {
            lex_mt = $$GeneralEnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(folder_id) : "! kb_indexing_datastructures.indexed_term_p(folder_id) " + ("kb_indexing_datastructures.indexed_term_p(folder_id) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(folder_id) ") + folder_id;
        assert NIL != hlmt.possibly_hlmt_p(lex_mt) : "! hlmt.possibly_hlmt_p(lex_mt) " + ("hlmt.possibly_hlmt_p(lex_mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(lex_mt) ") + lex_mt;
        final SubLObject defining_mt = default_mt_for_ke_interaction_folder(folder_id);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isaP(folder_id, $$KEInteractionFolder, defining_mt, UNPROVIDED))) {
            Errors.error($str6$_S_is_not_known_to_be_a_KE_intera, folder_id, defining_mt);
        }
        final SubLObject new_folder = rkf_term_utilities.create_new_constant($$$UserCreatedFolder, list($$KEInteractionFolder), NIL, $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        add_ke_interaction_resource_to_folder(new_folder, folder_id);
        SubLObject name;
        for (SubLObject name_stem = name = $default_new_ke_interaction_folder_name$.getGlobalValue(), suffix = ZERO_INTEGER, existing = ask_utilities.query_variable($X, listS($$and, list($$ist, defining_mt, listS($$subFolders, folder_id, $list13)), $list14), lex_mt, list($INFERENCE_MODE, $MINIMAL)); NIL != member(name, existing, symbol_function(EQUAL), UNPROVIDED); name = cconcatenate(format_nil.format_nil_a_no_copy(name_stem), new SubLObject[]{ $str17$_, format_nil.format_nil_d_no_copy(suffix) })) {
            suffix = add(suffix, ONE_INTEGER);
        }
        lexify_ke_interaction_folder_constant(new_folder, name, lex_mt);
        return new_folder;
    }

    /**
     * Relexify FOLDER-ID as NEW-NAME in LEX-MT.
     *
     * @return BOOLEANP; Non-NIL iff relexification was successful.
     */
    @LispMethod(comment = "Relexify FOLDER-ID as NEW-NAME in LEX-MT.\r\n\r\n@return BOOLEANP; Non-NIL iff relexification was successful.")
    public static final SubLObject relexify_ke_interaction_folder_constant_alt(SubLObject folder_id, SubLObject new_name, SubLObject lex_mt) {
        if (lex_mt == UNPROVIDED) {
            lex_mt = $$GeneralEnglishMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(folder_id, FORT_P);
            SubLTrampolineFile.checkType(new_name, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == isa.isaP(folder_id, $$KEInteractionFolder, lex_mt, UNPROVIDED)) {
                    Errors.error($str_alt6$_S_is_not_known_to_be_a_KE_intera, folder_id, lex_mt);
                }
            }
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lex_mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pred_var = $$folderTitle;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(folder_id, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(folder_id, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_1 = NIL;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                    if (NIL != valid_3) {
                                                                        if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                                                            ke.ke_unassert_assertion_now(assertion);
                                                                        }
                                                                        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                                            ke.ke_blast_assertion(assertion);
                                                                        }
                                                                    }
                                                                    done_var_1 = makeBoolean(NIL == valid_3);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return lexify_ke_interaction_folder_constant(folder_id, new_name, lex_mt);
        }
    }

    /**
     * Relexify FOLDER-ID as NEW-NAME in LEX-MT.
     *
     * @return BOOLEANP; Non-NIL iff relexification was successful.
     */
    @LispMethod(comment = "Relexify FOLDER-ID as NEW-NAME in LEX-MT.\r\n\r\n@return BOOLEANP; Non-NIL iff relexification was successful.")
    public static SubLObject relexify_ke_interaction_folder_constant(final SubLObject folder_id, final SubLObject new_name, SubLObject lex_mt) {
        if (lex_mt == UNPROVIDED) {
            lex_mt = $$GeneralEnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(folder_id) : "! forts.fort_p(folder_id) " + ("forts.fort_p(folder_id) " + "CommonSymbols.NIL != forts.fort_p(folder_id) ") + folder_id;
        assert NIL != stringp(new_name) : "! stringp(new_name) " + ("Types.stringp(new_name) " + "CommonSymbols.NIL != Types.stringp(new_name) ") + new_name;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isaP(folder_id, $$KEInteractionFolder, lex_mt, UNPROVIDED))) {
            Errors.error($str6$_S_is_not_known_to_be_a_KE_intera, folder_id, lex_mt);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lex_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$folderTitle;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(folder_id, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(folder_id, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = NIL;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                if (NIL != valid_$3) {
                                    if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                        ke.ke_unassert_assertion_now(assertion);
                                    }
                                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                        ke.ke_blast_assertion(assertion);
                                    }
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return lexify_ke_interaction_folder_constant(folder_id, new_name, lex_mt);
    }

    public static final SubLObject lexify_ke_interaction_folder_constant_alt(SubLObject folder, SubLObject name, SubLObject lex_mt) {
        return ke.ke_assert_now(list($$folderTitle, folder, name), lex_mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lexify_ke_interaction_folder_constant(final SubLObject folder, final SubLObject name, final SubLObject lex_mt) {
        return ke.ke_assert_now(list($$folderTitle, folder, name), lex_mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Move RESOURCE-ID from FROM-FOLDER-ID to TO-FOLDER-ID.
     */
    @LispMethod(comment = "Move RESOURCE-ID from FROM-FOLDER-ID to TO-FOLDER-ID.")
    public static final SubLObject move_ke_interaction_resource_alt(SubLObject resource_id, SubLObject from_folder_id, SubLObject to_folder_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(resource_id, INDEXED_TERM_P);
            SubLTrampolineFile.checkType(to_folder_id, INDEXED_TERM_P);
            {
                SubLObject mt = default_mt_for_ke_interaction_folder(to_folder_id);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(to_folder_id, $$KEInteractionFolder, mt, UNPROVIDED)) {
                        Errors.error($str_alt6$_S_is_not_known_to_be_a_KE_intera, to_folder_id, mt);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(resource_id, $$KEInteractionResource, mt, UNPROVIDED)) {
                        Errors.error($str_alt26$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
                    }
                }
                if (NIL != from_folder_id) {
                    SubLTrampolineFile.checkType(from_folder_id, INDEXED_TERM_P);
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == isa.isaP(from_folder_id, $$KEInteractionFolder, mt, UNPROVIDED)) {
                                        Errors.error($str_alt6$_S_is_not_known_to_be_a_KE_intera, from_folder_id, mt);
                                    }
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == subl_promotions.memberP(resource_id, get_ke_interaction_folder_contents_from_kb(from_folder_id, mt), UNPROVIDED, UNPROVIDED)) {
                                        Errors.error($str_alt27$_S_is_not_known_to_be_in__S_in__S, resource_id, from_folder_id, mt);
                                    }
                                }
                                {
                                    SubLObject node_var = $$folderContainsResource;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    SubLObject node_and_predicate_mode = NIL;
                                    {
                                        SubLObject _prev_bind_0_5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt39$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$folderContainsResource, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            node_and_predicate_mode = list($$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p());
                                                                            while (NIL != node_and_predicate_mode) {
                                                                                {
                                                                                    SubLObject node_var_14 = node_and_predicate_mode.first();
                                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                    SubLObject spec_pred = node_var_14;
                                                                                    {
                                                                                        SubLObject _prev_bind_0_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                            {
                                                                                                SubLObject inverseP = predicate_mode;
                                                                                                SubLObject pred_var = spec_pred;
                                                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(resource_id, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, pred_var)) {
                                                                                                    {
                                                                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(resource_id, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, pred_var);
                                                                                                        SubLObject done_var = NIL;
                                                                                                        SubLObject token_var = NIL;
                                                                                                        while (NIL == done_var) {
                                                                                                            {
                                                                                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                                if (NIL != valid) {
                                                                                                                    {
                                                                                                                        SubLObject final_index_iterator = NIL;
                                                                                                                        try {
                                                                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                                                            {
                                                                                                                                SubLObject done_var_16 = NIL;
                                                                                                                                SubLObject token_var_17 = NIL;
                                                                                                                                while (NIL == done_var_16) {
                                                                                                                                    {
                                                                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                                                                                                        SubLObject valid_18 = makeBoolean(token_var_17 != assertion);
                                                                                                                                        if (NIL != valid_18) {
                                                                                                                                            if (from_folder_id.equal(assertions_high.gaf_arg(assertion, NIL != inverseP ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER))) {
                                                                                                                                                if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                                                                                                                                    ke.ke_unassert_assertion_now(assertion);
                                                                                                                                                }
                                                                                                                                                if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                                                                                                                    ke.ke_blast_assertion(assertion);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        done_var_16 = makeBoolean(NIL == valid_18);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                    if (NIL != final_index_iterator) {
                                                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                done_var = makeBoolean(NIL == valid);
                                                                                                            }
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                                {
                                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                                    SubLObject module_var = NIL;
                                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                {
                                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_14);
                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                        {
                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != d_link) {
                                                                                                                                {
                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject mt_22 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_22)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_23 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_22, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject iteration_state_24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_24)) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_24);
                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                            SubLObject cdolist_list_var_26 = new_list;
                                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , node_vars_link_node = cdolist_list_var_26.first()) {
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_25, thread);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            iteration_state_24 = dictionary_contents.do_dictionary_contents_next(iteration_state_24);
                                                                                                                                                                        }
                                                                                                                                                                    } 
                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_24);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_23, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                SubLObject cdolist_list_var_27 = new_list;
                                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                                for (generating_fn = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , generating_fn = cdolist_list_var_27.first()) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_28 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_29 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject cdolist_list_var_30 = new_list_29;
                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                for (node_vars_link_node = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , node_vars_link_node = cdolist_list_var_30.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_28, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_21, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_20, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_13, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_12, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt42$Node__a_does_not_pass_sbhl_type_t, $$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_10, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_9, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_7, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                add_ke_interaction_resource_to_folder(resource_id, to_folder_id);
            }
            return to_folder_id;
        }
    }

    /**
     * Move RESOURCE-ID from FROM-FOLDER-ID to TO-FOLDER-ID.
     */
    @LispMethod(comment = "Move RESOURCE-ID from FROM-FOLDER-ID to TO-FOLDER-ID.")
    public static SubLObject move_ke_interaction_resource(final SubLObject resource_id, final SubLObject from_folder_id, final SubLObject to_folder_id) {
        if (NIL != from_folder_id) {
            remove_ke_interaction_resource_from_folder(resource_id, from_folder_id);
        }
        add_ke_interaction_resource_to_folder(resource_id, to_folder_id);
        return to_folder_id;
    }

    /**
     * Add RESOURCE-ID to TO-FOLDER-ID
     */
    @LispMethod(comment = "Add RESOURCE-ID to TO-FOLDER-ID")
    public static final SubLObject add_ke_interaction_resource_to_folder_alt(SubLObject resource_id, SubLObject to_folder_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(resource_id, INDEXED_TERM_P);
            SubLTrampolineFile.checkType(to_folder_id, INDEXED_TERM_P);
            {
                SubLObject mt = default_mt_for_ke_interaction_folder(to_folder_id);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(to_folder_id, $$KEInteractionFolder, mt, UNPROVIDED)) {
                        Errors.error($str_alt6$_S_is_not_known_to_be_a_KE_intera, to_folder_id, mt);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(resource_id, $$KEInteractionResource, mt, UNPROVIDED)) {
                        Errors.error($str_alt26$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
                    }
                }
                {
                    SubLObject preferred_pred = (NIL != isa.isaP(resource_id, $$KEInteractionFolder, mt, UNPROVIDED)) ? ((SubLObject) ($$subFolders)) : NIL != isa.isaP(resource_id, $$FormulaTemplate, mt, UNPROVIDED) ? ((SubLObject) ($$folderContainsTemplate)) : $$folderContainsResource;
                    ke.ke_assert_now(make_binary_formula(preferred_pred, to_folder_id, resource_id), mt, UNPROVIDED, UNPROVIDED);
                }
            }
            return resource_id;
        }
    }

    @LispMethod(comment = "Add RESOURCE-ID to TO-FOLDER-ID")
    public static SubLObject add_ke_interaction_resource_to_folder(final SubLObject resource_id, final SubLObject to_folder_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(resource_id) : "! kb_indexing_datastructures.indexed_term_p(resource_id) " + ("kb_indexing_datastructures.indexed_term_p(resource_id) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(resource_id) ") + resource_id;
        assert NIL != indexed_term_p(to_folder_id) : "! kb_indexing_datastructures.indexed_term_p(to_folder_id) " + ("kb_indexing_datastructures.indexed_term_p(to_folder_id) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(to_folder_id) ") + to_folder_id;
        final SubLObject mt = default_mt_for_ke_interaction_folder(to_folder_id);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isaP(to_folder_id, $$KEInteractionFolder, mt, UNPROVIDED))) {
            Errors.error($str6$_S_is_not_known_to_be_a_KE_intera, to_folder_id, mt);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isaP(resource_id, $$KEInteractionResource, mt, UNPROVIDED))) {
            Errors.error($str27$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
        }
        final SubLObject preferred_pred = (NIL != isa.isaP(resource_id, $$KEInteractionFolder, mt, UNPROVIDED)) ? $$subFolders : NIL != isa.isaP(resource_id, $$FormulaTemplate, mt, UNPROVIDED) ? $$folderContainsTemplate : $$folderContainsResource;
        ke.ke_assert_now(make_binary_formula(preferred_pred, to_folder_id, resource_id), mt, UNPROVIDED, UNPROVIDED);
        return resource_id;
    }/**
     * Add RESOURCE-ID to TO-FOLDER-ID
     */


    /**
     * Remove RESOURCE-ID from FROM-FOLDER-ID
     */
    @LispMethod(comment = "Remove RESOURCE-ID from FROM-FOLDER-ID")
    public static final SubLObject remove_ke_interaction_resource_from_folder_alt(SubLObject resource_id, SubLObject from_folder_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(resource_id, INDEXED_TERM_P);
            SubLTrampolineFile.checkType(from_folder_id, INDEXED_TERM_P);
            {
                SubLObject mt = default_mt_for_ke_interaction_folder(from_folder_id);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(from_folder_id, $$KEInteractionFolder, mt, UNPROVIDED)) {
                        Errors.error($str_alt6$_S_is_not_known_to_be_a_KE_intera, from_folder_id, mt);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == isa.isaP(resource_id, $$KEInteractionResource, mt, UNPROVIDED)) {
                        Errors.error($str_alt26$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$folderContainsResource, from_folder_id, resource_id), mt, list($INFERENCE_MODE, $MINIMAL)))) {
                        Errors.error($str_alt27$_S_is_not_known_to_be_in__S_in__S, resource_id, from_folder_id, mt);
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject node_var = $$folderContainsResource;
                                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                                SubLObject recur_deck = deck.create_deck(deck_type);
                                SubLObject node_and_predicate_mode = NIL;
                                {
                                    SubLObject _prev_bind_0_31 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject tv_var = NIL;
                                            {
                                                SubLObject _prev_bind_0_32 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                SubLObject _prev_bind_1_33 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (NIL != tv_var) {
                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                {
                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql($ERROR)) {
                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($CERROR)) {
                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($WARN)) {
                                                                                Errors.warn($str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            } else {
                                                                                Errors.warn($str_alt39$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                Errors.cerror($$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_34 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_35 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_36 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$folderContainsResource, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                {
                                                                    SubLObject _prev_bind_0_37 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_38 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_39 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                        node_and_predicate_mode = list($$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p());
                                                                        while (NIL != node_and_predicate_mode) {
                                                                            {
                                                                                SubLObject node_var_40 = node_and_predicate_mode.first();
                                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                SubLObject spec_pred = node_var_40;
                                                                                {
                                                                                    SubLObject _prev_bind_0_41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                        {
                                                                                            SubLObject inverseP = predicate_mode;
                                                                                            SubLObject pred_var = spec_pred;
                                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(resource_id, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, pred_var)) {
                                                                                                {
                                                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(resource_id, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, pred_var);
                                                                                                    SubLObject done_var = NIL;
                                                                                                    SubLObject token_var = NIL;
                                                                                                    while (NIL == done_var) {
                                                                                                        {
                                                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                            if (NIL != valid) {
                                                                                                                {
                                                                                                                    SubLObject final_index_iterator = NIL;
                                                                                                                    try {
                                                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                                                        {
                                                                                                                            SubLObject done_var_42 = NIL;
                                                                                                                            SubLObject token_var_43 = NIL;
                                                                                                                            while (NIL == done_var_42) {
                                                                                                                                {
                                                                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_43);
                                                                                                                                    SubLObject valid_44 = makeBoolean(token_var_43 != assertion);
                                                                                                                                    if (NIL != valid_44) {
                                                                                                                                        if (from_folder_id.equal(assertions_high.gaf_arg(assertion, NIL != inverseP ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER))) {
                                                                                                                                            ke.ke_unassert_assertion_now(assertion);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    done_var_42 = makeBoolean(NIL == valid_44);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                if (NIL != final_index_iterator) {
                                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_45, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            done_var = makeBoolean(NIL == valid);
                                                                                                        }
                                                                                                    } 
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_40);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt_48 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_48)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_48, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_50 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_50)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_50);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_51 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_52 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , node_vars_link_node = cdolist_list_var_52.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_51, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_50 = dictionary_contents.do_dictionary_contents_next(iteration_state_50);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_50);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_49, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_53 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_53.first(); NIL != cdolist_list_var_53; cdolist_list_var_53 = cdolist_list_var_53.rest() , generating_fn = cdolist_list_var_53.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_55 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_56 = new_list_55;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , node_vars_link_node = cdolist_list_var_56.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_54, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_47, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_46, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_41, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_39, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_38, thread);
                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_37, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt42$Node__a_does_not_pass_sbhl_type_t, $$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_36, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_35, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_34, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_33, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_32, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return resource_id;
        }
    }

    @LispMethod(comment = "Remove RESOURCE-ID from FROM-FOLDER-ID")
    public static SubLObject remove_ke_interaction_resource_from_folder(final SubLObject resource_id, final SubLObject from_folder_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(resource_id) : "! kb_indexing_datastructures.indexed_term_p(resource_id) " + ("kb_indexing_datastructures.indexed_term_p(resource_id) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(resource_id) ") + resource_id;
        assert NIL != indexed_term_p(from_folder_id) : "! kb_indexing_datastructures.indexed_term_p(from_folder_id) " + ("kb_indexing_datastructures.indexed_term_p(from_folder_id) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(from_folder_id) ") + from_folder_id;
        final SubLObject mt = default_mt_for_ke_interaction_folder(from_folder_id);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isaP(from_folder_id, $$KEInteractionFolder, mt, UNPROVIDED))) {
            Errors.error($str6$_S_is_not_known_to_be_a_KE_intera, from_folder_id, mt);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isaP(resource_id, $$KEInteractionResource, mt, UNPROVIDED))) {
            Errors.error($str27$_S_is_not_known_to_be_a_KE_intera, resource_id, mt);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(resource_id, get_ke_interaction_folder_contents_from_kb(from_folder_id, mt), UNPROVIDED, UNPROVIDED))) {
            Errors.error($str32$_S_is_not_known_to_be_in__S_in__S, resource_id, from_folder_id, mt);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = $$folderContainsResource;
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$folderContainsResource, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list($$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$14 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$14;
                                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            final SubLObject pred_var = spec_pred;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(resource_id, NIL != inverseP ? ONE_INTEGER : TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(resource_id, NIL != inverseP ? ONE_INTEGER : TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$16 = NIL;
                                                            final SubLObject token_var_$17 = NIL;
                                                            while (NIL == done_var_$16) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                                                final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(assertion));
                                                                if ((NIL != valid_$18) && from_folder_id.equal(assertions_high.gaf_arg(assertion, NIL != inverseP ? TWO_INTEGER : ONE_INTEGER))) {
                                                                    if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                                                        ke.ke_unassert_assertion_now(assertion);
                                                                    }
                                                                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                                        ke.ke_blast_assertion(assertion);
                                                                    }
                                                                }
                                                                done_var_$16 = makeBoolean(NIL == valid_$18);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$14);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$22 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$22)) {
                                                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$22, thread);
                                                                            SubLObject iteration_state_$24;
                                                                            for (iteration_state_$24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$24); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next(iteration_state_$24)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$24);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$24);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$26;
                                                            final SubLObject new_list = cdolist_list_var_$26 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$26.first();
                                                            while (NIL != cdolist_list_var_$26) {
                                                                final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                                }
                                                                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                                generating_fn = cdolist_list_var_$26.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$11, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str47$Node__a_does_not_pass_sbhl_type_t, $$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return resource_id;
    }/**
     * Remove RESOURCE-ID from FROM-FOLDER-ID
     */


    public static final SubLObject default_mt_for_ke_interaction_folder_alt(SubLObject v_ke_interaction_folder) {
        {
            SubLObject mt_var = variables.get_variable(ZERO_INTEGER);
            SubLObject allowed_module_spec = list($OR, $REMOVAL_LOOKUP_POS, $REMOVAL_GENLPREDS_LOOKUP_POS, $REMOVAL_GENLINVERSE_LOOKUP_POS);
            SubLObject first_mt = backward.removal_ask_variable(mt_var, list($$definingMt, v_ke_interaction_folder, mt_var), $$InferencePSC, $TRUE, list($MAX_NUMBER, ONE_INTEGER, $ALLOWED_MODULES, allowed_module_spec)).first();
            return NIL != first_mt ? ((SubLObject) (first_mt)) : $$KEInteractionResourceTestMt;
        }
    }

    public static SubLObject default_mt_for_ke_interaction_folder(final SubLObject v_ke_interaction_folder) {
        return $$KEInteractionResourceTestMt;
    }

    public static final SubLObject ke_interaction_folder_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ke_interaction_folder(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ke_interaction_folder_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ke_interaction_folder(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ke_interaction_folder_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ke_interaction_folder.$ke_interaction_folder_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ke_interaction_folder_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ke_interaction_folder.$ke_interaction_folder_native.class ? T : NIL;
    }

    public static final SubLObject ke_interaction_folder_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.getField2();
    }

    public static SubLObject ke_interaction_folder_id(final SubLObject v_object) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ke_interaction_folder_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.getField3();
    }

    public static SubLObject ke_interaction_folder_mt(final SubLObject v_object) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ke_interaction_folder_gloss_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.getField4();
    }

    public static SubLObject ke_interaction_folder_gloss(final SubLObject v_object) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ke_interaction_folder_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.getField5();
    }

    public static SubLObject ke_interaction_folder_parent(final SubLObject v_object) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ke_interaction_folder_children_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.getField6();
    }

    public static SubLObject ke_interaction_folder_children(final SubLObject v_object) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_ke_interaction_folder_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ke_interaction_folder_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ke_interaction_folder_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ke_interaction_folder_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ke_interaction_folder_gloss_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ke_interaction_folder_gloss(final SubLObject v_object, final SubLObject value) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ke_interaction_folder_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ke_interaction_folder_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ke_interaction_folder_children_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KE_INTERACTION_FOLDER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ke_interaction_folder_children(final SubLObject v_object, final SubLObject value) {
        assert NIL != ke_interaction_folder_p(v_object) : "! ke_interaction_folder.ke_interaction_folder_p(v_object) " + "ke_interaction_folder.ke_interaction_folder_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_ke_interaction_folder_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.ke_interaction_folder.$ke_interaction_folder_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ke_interaction_folder_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MT)) {
                            _csetf_ke_interaction_folder_mt(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GLOSS)) {
                                _csetf_ke_interaction_folder_gloss(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PARENT)) {
                                    _csetf_ke_interaction_folder_parent(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CHILDREN)) {
                                        _csetf_ke_interaction_folder_children(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt79$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ke_interaction_folder(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.ke_interaction_folder.$ke_interaction_folder_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ke_interaction_folder_id(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_ke_interaction_folder_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($GLOSS)) {
                        _csetf_ke_interaction_folder_gloss(v_new, current_value);
                    } else
                        if (pcase_var.eql($PARENT)) {
                            _csetf_ke_interaction_folder_parent(v_new, current_value);
                        } else
                            if (pcase_var.eql($CHILDREN)) {
                                _csetf_ke_interaction_folder_children(v_new, current_value);
                            } else {
                                Errors.error($str73$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ke_interaction_folder(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KE_INTERACTION_FOLDER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ke_interaction_folder_id(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, ke_interaction_folder_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOSS, ke_interaction_folder_gloss(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, ke_interaction_folder_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILDREN, ke_interaction_folder_children(obj));
        funcall(visitor_fn, obj, $END, MAKE_KE_INTERACTION_FOLDER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ke_interaction_folder_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ke_interaction_folder(obj, visitor_fn);
    }

    public static final SubLObject print_ke_interaction_folder_alt(SubLObject folder, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(folder, stream);
            } else {
                {
                    SubLObject v_object = folder;
                    SubLObject stream_57 = stream;
                    write_string($str_alt80$__, stream_57, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_57 });
                    write_char(CHAR_space, stream_57);
                    format(stream, $str_alt82$_A_in_mt___A__, ke_interaction_folder_id(folder), ke_interaction_folder_mt(folder));
                    write_char(CHAR_greater, stream_57);
                }
            }
            return folder;
        }
    }

    public static SubLObject print_ke_interaction_folder(final SubLObject folder, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(folder, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, folder, T, T);
            format(stream, $str79$_A_in_mt___A__, ke_interaction_folder_id(folder), ke_interaction_folder_mt(folder));
            print_macros.print_unreadable_object_postamble(stream, folder, NIL, NIL);
        }
        return folder;
    }

    public static final SubLObject new_ke_interaction_folder_alt(SubLObject folder_id, SubLObject folder_mt) {
        SubLTrampolineFile.checkType(folder_mt, HLMT_P);
        SubLTrampolineFile.checkType(folder_id, FORT_P);
        {
            SubLObject folder = make_ke_interaction_folder(UNPROVIDED);
            _csetf_ke_interaction_folder_id(folder, folder_id);
            _csetf_ke_interaction_folder_mt(folder, folder_mt);
            return folder;
        }
    }

    public static SubLObject new_ke_interaction_folder(final SubLObject folder_id, final SubLObject folder_mt) {
        assert NIL != hlmt.hlmt_p(folder_mt) : "! hlmt.hlmt_p(folder_mt) " + ("hlmt.hlmt_p(folder_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(folder_mt) ") + folder_mt;
        assert NIL != forts.fort_p(folder_id) : "! forts.fort_p(folder_id) " + ("forts.fort_p(folder_id) " + "CommonSymbols.NIL != forts.fort_p(folder_id) ") + folder_id;
        final SubLObject folder = make_ke_interaction_folder(UNPROVIDED);
        _csetf_ke_interaction_folder_id(folder, folder_id);
        _csetf_ke_interaction_folder_mt(folder, folder_mt);
        return folder;
    }

    /**
     * Given the FOLDER-ID and an ELMT, load the coresponding ke interaction
     * folder. @return KE-INTERACTION-FOLDER-P.
     */
    @LispMethod(comment = "Given the FOLDER-ID and an ELMT, load the coresponding ke interaction\r\nfolder. @return KE-INTERACTION-FOLDER-P.\nGiven the FOLDER-ID and an ELMT, load the coresponding ke interaction\nfolder. @return KE-INTERACTION-FOLDER-P.")
    public static final SubLObject ke_interaction_folder_load_query_library_alt(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            elmt = hlmt_czer.canonicalize_hlmt(elmt);
            folder_id = hlmt_czer.canonicalize_hlmt(folder_id);
            SubLTrampolineFile.checkType(folder_id, FORT_P);
            SubLTrampolineFile.checkType(elmt, HLMT_P);
            {
                SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
                _csetf_ke_interaction_folder_parent(folder, parent);
                _csetf_ke_interaction_folder_gloss(folder, ask_utilities.ask_variable($TITLE, listS($$folderTitle, folder_id, $list_alt86), $$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
                {
                    SubLObject child_var = $sym87$_CHILD;
                    SubLObject sorting_information = ke_interact_obtain_ordering_info(folder_id, elmt);
                    thread.resetMultipleValues();
                    {
                        SubLObject binding_lists = inference_kernel.new_cyc_query(listS($$folderContainsResource, folder_id, child_var, $list_alt88), UNPROVIDED, UNPROVIDED);
                        SubLObject v_answer = thread.secondMultipleValue();
                        SubLObject reason = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = binding_lists;
                            SubLObject binding_list = NIL;
                            for (binding_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_list = cdolist_list_var.first()) {
                                {
                                    SubLObject param = bindings.variable_lookup(child_var, binding_list);
                                    if (NIL != isa.isaP(param, $$KEInteractionFolder, elmt, UNPROVIDED)) {
                                        _csetf_ke_interaction_folder_children(folder, cons(ke_interaction_folder_load_query_library(param, elmt, folder), ke_interaction_folder_children(folder)));
                                    } else {
                                        if (NIL != isa.isaP(param, $$FormulaTemplate, elmt, UNPROVIDED)) {
                                            _csetf_ke_interaction_folder_children(folder, cons(formula_templates.load_formula_template_details_from_kb(param, elmt), ke_interaction_folder_children(folder)));
                                        } else {
                                            Errors.warn($str_alt89$Cannot_handle_resource__A_at_this, param);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ke_interact_apply_ordering_on_children(folder, elmt, sorting_information);
                }
                return folder;
            }
        }
    }

    @LispMethod(comment = "Given the FOLDER-ID and an ELMT, load the coresponding ke interaction\r\nfolder. @return KE-INTERACTION-FOLDER-P.\nGiven the FOLDER-ID and an ELMT, load the coresponding ke interaction\nfolder. @return KE-INTERACTION-FOLDER-P.")
    public static SubLObject ke_interaction_folder_load_query_library(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        folder_id = hlmt_czer.canonicalize_hlmt(folder_id);
        assert NIL != forts.fort_p(folder_id) : "! forts.fort_p(folder_id) " + ("forts.fort_p(folder_id) " + "CommonSymbols.NIL != forts.fort_p(folder_id) ") + folder_id;
        assert NIL != hlmt.hlmt_p(elmt) : "! hlmt.hlmt_p(elmt) " + ("hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) ") + elmt;
        final SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
        _csetf_ke_interaction_folder_parent(folder, parent);
        _csetf_ke_interaction_folder_gloss(folder, ask_utilities.ask_variable($TITLE, listS($$folderTitle, folder_id, $list82), $$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
        final SubLObject child_var = $sym84$_CHILD;
        final SubLObject sorting_information = ke_interact_obtain_ordering_info(folder_id, elmt);
        thread.resetMultipleValues();
        final SubLObject binding_lists = inference_kernel.new_cyc_query(listS($$folderContainsResource, folder_id, child_var, $list85), UNPROVIDED, UNPROVIDED);
        final SubLObject v_answer = thread.secondMultipleValue();
        final SubLObject reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = binding_lists;
        SubLObject binding_list = NIL;
        binding_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject param = bindings.variable_lookup(child_var, binding_list);
            if (NIL != isa.isaP(param, $$KEInteractionFolder, elmt, UNPROVIDED)) {
                _csetf_ke_interaction_folder_children(folder, cons(ke_interaction_folder_load_query_library(param, elmt, folder), ke_interaction_folder_children(folder)));
            } else
                if (NIL != isa.isaP(param, $$FormulaTemplate, elmt, UNPROVIDED)) {
                    _csetf_ke_interaction_folder_children(folder, cons(formula_templates.load_formula_template_details_from_kb(param, elmt), ke_interaction_folder_children(folder)));
                } else {
                    Errors.warn($str86$Cannot_handle_resource__A_at_this, param);
                }

            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        } 
        ke_interact_apply_ordering_on_children(folder, elmt, sorting_information);
        return folder;
    }/**
     * Given the FOLDER-ID and an ELMT, load the coresponding ke interaction
     * folder. @return KE-INTERACTION-FOLDER-P.
     */


    /**
     * Modify any inference parameters not specified on query specifications in KE-INTERACTION-FOLDER to the values in DEFAULTS.
     */
    @LispMethod(comment = "Modify any inference parameters not specified on query specifications in KE-INTERACTION-FOLDER to the values in DEFAULTS.")
    public static final SubLObject update_folder_query_params_using_defaults_alt(SubLObject v_ke_interaction_folder, SubLObject defaults) {
        {
            SubLObject cdolist_list_var = ke_interaction_folder_children(v_ke_interaction_folder);
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                if (NIL != ke_interaction_folder_p(child)) {
                    update_folder_query_params_using_defaults(child, defaults);
                } else {
                    if (NIL != formula_templates.valid_formula_template_p(child)) {
                        {
                            SubLObject query_spec = formula_templates.formula_template_query_specification(child);
                            new_cycl_query_specification.update_query_spec_params_using_defaults(query_spec, defaults);
                        }
                    }
                }
            }
        }
        return v_ke_interaction_folder;
    }

    @LispMethod(comment = "Modify any inference parameters not specified on query specifications in KE-INTERACTION-FOLDER to the values in DEFAULTS.")
    public static SubLObject update_folder_query_params_using_defaults(final SubLObject v_ke_interaction_folder, final SubLObject defaults) {
        SubLObject cdolist_list_var = ke_interaction_folder_children(v_ke_interaction_folder);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ke_interaction_folder_p(child)) {
                update_folder_query_params_using_defaults(child, defaults);
            } else
                if (NIL != formula_templates.valid_formula_template_p(child)) {
                    final SubLObject query_spec = formula_templates.formula_template_query_specification(child);
                    new_cycl_query_specification.update_query_spec_params_using_defaults(query_spec, defaults);
                }

            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return v_ke_interaction_folder;
    }/**
     * Modify any inference parameters not specified on query specifications in KE-INTERACTION-FOLDER to the values in DEFAULTS.
     */


    /**
     * Loads just the folder title of the query library.
     */
    @LispMethod(comment = "Loads just the folder title of the query library.")
    public static final SubLObject ke_interaction_folder_load_query_library_skeleton_alt(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        folder_id = czer_main.canonicalize_term(folder_id, UNPROVIDED);
        SubLTrampolineFile.checkType(elmt, HLMT_P);
        {
            SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
            SubLObject gloss = NIL;
            _csetf_ke_interaction_folder_parent(folder, parent);
            gloss = ke_interaction_folder_get_gloss_for_folder_id(folder_id, elmt);
            _csetf_ke_interaction_folder_gloss(folder, gloss);
            return folder;
        }
    }

    @LispMethod(comment = "Loads just the folder title of the query library.")
    public static SubLObject ke_interaction_folder_load_query_library_skeleton(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        folder_id = czer_main.canonicalize_term(folder_id, UNPROVIDED);
        assert NIL != hlmt.hlmt_p(elmt) : "! hlmt.hlmt_p(elmt) " + ("hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) ") + elmt;
        final SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
        SubLObject gloss = NIL;
        _csetf_ke_interaction_folder_parent(folder, parent);
        gloss = ke_interaction_folder_get_gloss_for_folder_id(folder_id, elmt);
        _csetf_ke_interaction_folder_gloss(folder, gloss);
        return folder;
    }/**
     * Loads just the folder title of the query library.
     */


    public static final SubLObject ke_interaction_folder_get_gloss_for_folder_id_alt(SubLObject folder_id, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asserted_title = kb_mapping_utilities.fpred_value_in_any_mt(folder_id, $$folderTitle, ONE_INTEGER, TWO_INTEGER, $TRUE);
                return NIL != asserted_title ? ((SubLObject) (asserted_title)) : pph_main.generate_phrase(folder_id, $ANY, NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject ke_interaction_folder_get_gloss_for_folder_id(final SubLObject folder_id, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asserted_title = kb_mapping_utilities.fpred_value_in_any_mt(folder_id, $$folderTitle, ONE_INTEGER, TWO_INTEGER, $TRUE);
        return NIL != asserted_title ? asserted_title : pph_main.generate_phrase(folder_id, $ANY, NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Loads and sorts the children for this ke interaction folder. (Non recursive... gets one level only.)
     *
     * @return KE-INTERACTION-FOLDER-P
     */
    @LispMethod(comment = "Loads and sorts the children for this ke interaction folder. (Non recursive... gets one level only.)\r\n\r\n@return KE-INTERACTION-FOLDER-P")
    public static final SubLObject ke_interaction_folder_load_one_level_alt(SubLObject folder_id, SubLObject elmt, SubLObject parent) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        {
            SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
            SubLObject gloss = NIL;
            _csetf_ke_interaction_folder_parent(folder, parent);
            gloss = ke_interaction_folder_get_gloss_for_folder_id(folder_id, elmt);
            _csetf_ke_interaction_folder_gloss(folder, gloss);
            {
                SubLObject sorting_information = ke_interact_obtain_ordering_info(folder_id, elmt);
                SubLObject params = get_ke_interaction_folder_contents_from_kb(folder_id, elmt);
                SubLObject cdolist_list_var = params;
                SubLObject param = NIL;
                for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                    if (NIL != ke_interaction_folderP(param)) {
                        _csetf_ke_interaction_folder_children(folder, cons(ke_interaction_folder_load_query_library_skeleton(param, elmt, folder), ke_interaction_folder_children(folder)));
                    } else {
                        if (NIL != cycl_formula_templateP(param)) {
                            {
                                SubLObject template_details = NIL;
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                        try {
                                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                            try {
                                                template_details = formula_templates.load_formula_template_details_from_kb(param, elmt);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            rebind(Errors.$error_handler$, _prev_bind_0);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    Errors.warn($str_alt92$Cannot_load_formula_template__A__, param, error_message);
                                } else {
                                    _csetf_ke_interaction_folder_children(folder, cons(template_details, ke_interaction_folder_children(folder)));
                                }
                            }
                        } else {
                            Errors.warn($str_alt89$Cannot_handle_resource__A_at_this, param);
                        }
                    }
                }
                ke_interact_apply_ordering_on_children(folder, elmt, sorting_information);
                return folder;
            }
        }
    }

    @LispMethod(comment = "Loads and sorts the children for this ke interaction folder. (Non recursive... gets one level only.)\r\n\r\n@return KE-INTERACTION-FOLDER-P")
    public static SubLObject ke_interaction_folder_load_one_level(final SubLObject folder_id, final SubLObject elmt, SubLObject parent) {
        if (parent == UNPROVIDED) {
            parent = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject folder = new_ke_interaction_folder(folder_id, elmt);
        SubLObject gloss = NIL;
        _csetf_ke_interaction_folder_parent(folder, parent);
        gloss = ke_interaction_folder_get_gloss_for_folder_id(folder_id, elmt);
        _csetf_ke_interaction_folder_gloss(folder, gloss);
        final SubLObject sorting_information = ke_interact_obtain_ordering_info(folder_id, elmt);
        SubLObject cdolist_list_var;
        final SubLObject params = cdolist_list_var = get_ke_interaction_folder_contents_from_kb(folder_id, elmt);
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ke_interaction_folderP(param)) {
                _csetf_ke_interaction_folder_children(folder, cons(ke_interaction_folder_load_query_library_skeleton(param, elmt, folder), ke_interaction_folder_children(folder)));
            } else
                if (NIL != cycl_formula_templateP(param)) {
                    SubLObject template_details = NIL;
                    SubLObject error_message = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                template_details = formula_templates.load_formula_template_details_from_kb(param, elmt);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error_message) {
                        Errors.warn($str89$Cannot_load_formula_template__A__, param, error_message);
                    } else {
                        _csetf_ke_interaction_folder_children(folder, cons(template_details, ke_interaction_folder_children(folder)));
                    }
                } else {
                    Errors.warn($str86$Cannot_handle_resource__A_at_this, param);
                }

            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        ke_interact_apply_ordering_on_children(folder, elmt, sorting_information);
        return folder;
    }/**
     * Loads and sorts the children for this ke interaction folder. (Non recursive... gets one level only.)
     *
     * @return KE-INTERACTION-FOLDER-P
     */


    public static final SubLObject get_ke_interaction_folder_contents_from_kb_alt(SubLObject folder_id, SubLObject elmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject contents = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject node_var = $$folderContainsResource;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0_58 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_59 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_60 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt39$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_61 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_62 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_63 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$folderContainsResource, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_64 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_65 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list($$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_67 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject spec_pred = node_var_67;
                                                                            {
                                                                                SubLObject _prev_bind_0_68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverseP = predicate_mode;
                                                                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(folder_id, spec_pred, NIL != inverseP ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, UNPROVIDED);
                                                                                        SubLObject item = NIL;
                                                                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject item_var = item;
                                                                                                if (NIL == member(item_var, contents, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                    contents = cons(item_var, contents);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_69 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_70 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_67);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_71 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_72 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_72)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_72);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_73 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_74 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_74.first(); NIL != cdolist_list_var_74; cdolist_list_var_74 = cdolist_list_var_74.rest() , node_vars_link_node = cdolist_list_var_74.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_73, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_72 = dictionary_contents.do_dictionary_contents_next(iteration_state_72);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_72);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_71, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_75 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_75.first(); NIL != cdolist_list_var_75; cdolist_list_var_75 = cdolist_list_var_75.rest() , generating_fn = cdolist_list_var_75.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_77 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_78 = new_list_77;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , node_vars_link_node = cdolist_list_var_78.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_76, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_70, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_69, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_68, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_66, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_65, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_64, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt42$Node__a_does_not_pass_sbhl_type_t, $$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_63, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_62, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_61, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_60, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_59, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_58, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return contents;
            }
        }
    }

    public static SubLObject get_ke_interaction_folder_contents_from_kb(final SubLObject folder_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject contents = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = $$folderContainsResource;
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$34 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$folderContainsResource, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$32 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$33 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$35 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list($$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$38 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$38;
                                        final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(folder_id, spec_pred, NIL != inverseP ? TWO_INTEGER : ONE_INTEGER, NIL != inverseP ? ONE_INTEGER : TWO_INTEGER, UNPROVIDED);
                                            SubLObject item = NIL;
                                            item = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject item_var = item;
                                                if (NIL == member(item_var, contents, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    contents = cons(item_var, contents);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                item = cdolist_list_var.first();
                                            } 
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$34 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$38);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$43;
                                                                            for (iteration_state_$43 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$43); iteration_state_$43 = dictionary_contents.do_dictionary_contents_next(iteration_state_$43)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$43);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$36, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$43);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$35, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$45;
                                                            final SubLObject new_list = cdolist_list_var_$45 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$45.first();
                                                            while (NIL != cdolist_list_var_$45) {
                                                                final SubLObject _prev_bind_0_$37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$37, thread);
                                                                }
                                                                cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                                                                generating_fn = cdolist_list_var_$45.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$34, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$34, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$35, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$33, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$32, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str47$Node__a_does_not_pass_sbhl_type_t, $$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$34, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$32, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$31, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$31, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$30, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$29, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return contents;
    }

    public static final SubLObject cycl_formula_templateP_alt(SubLObject v_object) {
        if (NIL != narts_high.nart_with_functor_p($$TemplateFromTestQueryFn, v_object)) {
            return T;
        }
        return isa.isa_in_any_mtP(v_object, $$FormulaTemplate);
    }

    public static SubLObject cycl_formula_templateP(final SubLObject v_object) {
        if (NIL != narts_high.nart_with_functor_p($$TemplateFromTestQueryFn, v_object)) {
            return T;
        }
        return isa.isa_in_any_mtP(v_object, $$FormulaTemplate);
    }

    public static final SubLObject clear_ke_interaction_folders_alt() {
        {
            SubLObject cs = $ke_interaction_folders_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_ke_interaction_folders() {
        final SubLObject cs = $ke_interaction_folders_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_ke_interaction_folders_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($ke_interaction_folders_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_ke_interaction_folders() {
        return memoization_state.caching_state_remove_function_results_with_args($ke_interaction_folders_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ke_interaction_folders_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject folders = new_set(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = $$KEInteractionFolder;
                            {
                                SubLObject _prev_bind_0_79 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_80 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_81 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_82 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_84 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt39$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt34$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_85 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_86 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_87 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_88 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_89 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_81, UNPROVIDED);
                                                                                while (NIL != node_var_81) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_81;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_90 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_91 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_92 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_93 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_93)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_93);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_95 = new_list;
                                                                                                                                                                                SubLObject folder = NIL;
                                                                                                                                                                                for (folder = cdolist_list_var_95.first(); NIL != cdolist_list_var_95; cdolist_list_var_95 = cdolist_list_var_95.rest() , folder = cdolist_list_var_95.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != fort_p(folder)) {
                                                                                                                                                                                            set_add(folder, folders);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_94, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_93 = dictionary_contents.do_dictionary_contents_next(iteration_state_93);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_93);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_92, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                {
                                                                                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                    SubLObject instance_tuple = NIL;
                                                                                                                    for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject datum = instance_tuple;
                                                                                                                            SubLObject current = datum;
                                                                                                                            SubLObject link_node = NIL;
                                                                                                                            SubLObject mt = NIL;
                                                                                                                            SubLObject tv = NIL;
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt99);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt99);
                                                                                                                            mt = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt99);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_96 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_97 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_98 = new_list;
                                                                                                                                                            SubLObject folder = NIL;
                                                                                                                                                            for (folder = cdolist_list_var_98.first(); NIL != cdolist_list_var_98; cdolist_list_var_98 = cdolist_list_var_98.rest() , folder = cdolist_list_var_98.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    if (NIL != fort_p(folder)) {
                                                                                                                                                                        set_add(folder, folders);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_97, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_96, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt99);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_99 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , generating_fn = cdolist_list_var_99.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_101 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_102 = new_list_101;
                                                                                                                                    SubLObject folder = NIL;
                                                                                                                                    for (folder = cdolist_list_var_102.first(); NIL != cdolist_list_var_102; cdolist_list_var_102 = cdolist_list_var_102.rest() , folder = cdolist_list_var_102.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            if (NIL != fort_p(folder)) {
                                                                                                                                                set_add(folder, folders);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_100, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_91, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_90, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_103 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_81);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_106 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_106)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_106);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_108 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , node_vars_link_node = cdolist_list_var_108.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_107, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_106 = dictionary_contents.do_dictionary_contents_next(iteration_state_106);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_106);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_105, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt41$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_109 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_109.first(); NIL != cdolist_list_var_109; cdolist_list_var_109 = cdolist_list_var_109.rest() , generating_fn = cdolist_list_var_109.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_110 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_111 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_112 = new_list_111;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_112.first(); NIL != cdolist_list_var_112; cdolist_list_var_112 = cdolist_list_var_112.rest() , node_vars_link_node = cdolist_list_var_112.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_110, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_104, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_103, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_81 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_89, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_88, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_87, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt42$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_86, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_85, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_84, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_83, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_82, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_80, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_79, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return folders;
            }
        }
    }

    public static SubLObject ke_interaction_folders_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject folders = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$KEInteractionFolder;
            final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$49 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$50 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$50, UNPROVIDED);
                                            while (NIL != node_var_$50) {
                                                final SubLObject tt_node_var = node_var_$50;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$62;
                                                                                for (iteration_state_$62 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$62); iteration_state_$62 = dictionary_contents.do_dictionary_contents_next(iteration_state_$62)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$62);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject folder;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    folder = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, folder)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(folder)) {
                                                                                                            set.set_add(folder, folders);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject folder2 = NIL;
                                                                                                    folder2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(folder2)) {
                                                                                                                set.set_add(folder2, folders);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        folder2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$62);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list96);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list96);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list96);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject folder;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                folder = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, folder)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(folder)) {
                                                                                                        set.set_add(folder, folders);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$66 = sol;
                                                                                                SubLObject folder2 = NIL;
                                                                                                folder2 = csome_list_var_$66.first();
                                                                                                while (NIL != csome_list_var_$66) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(folder2)) {
                                                                                                            set.set_add(folder2, folders);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$66 = csome_list_var_$66.rest();
                                                                                                    folder2 = csome_list_var_$66.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$57, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$56, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list96);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$67;
                                                                final SubLObject new_list = cdolist_list_var_$67 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$67.first();
                                                                while (NIL != cdolist_list_var_$67) {
                                                                    final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject folder3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                folder3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, folder3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(folder3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(folder3)) {
                                                                                        set.set_add(folder3, folders);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject folder4 = NIL;
                                                                                folder4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(folder4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(folder4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(folder4)) {
                                                                                            set.set_add(folder4, folders);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    folder4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$58, thread);
                                                                    }
                                                                    cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                                                                    generating_fn = cdolist_list_var_$67.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$50);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$63;
                                                                                for (iteration_state_$63 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$63); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next(iteration_state_$63)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$63);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$61, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$63);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$60, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$68;
                                                                final SubLObject new_list2 = cdolist_list_var_$68 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$68.first();
                                                                while (NIL != cdolist_list_var_$68) {
                                                                    final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str45$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$62, thread);
                                                                    }
                                                                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                                                                    generating_fn2 = cdolist_list_var_$68.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$59, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$50 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$58, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$52, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$52, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str47$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$51, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$51, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$50, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$49, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$49, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$48, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return folders;
    }

    public static final SubLObject ke_interaction_folders_alt() {
        {
            SubLObject caching_state = $ke_interaction_folders_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(KE_INTERACTION_FOLDERS, $ke_interaction_folders_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw101$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(ke_interaction_folders_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject ke_interaction_folders() {
        SubLObject caching_state = $ke_interaction_folders_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(KE_INTERACTION_FOLDERS, $ke_interaction_folders_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(ke_interaction_folders_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject add_folder_title_alt(SubLObject argument, SubLObject assertion) {
        return clear_ke_interaction_folders();
    }

    public static SubLObject add_folder_title(final SubLObject argument, final SubLObject assertion) {
        return clear_ke_interaction_folders();
    }

    public static final SubLObject remove_folder_title_alt(SubLObject argument, SubLObject assertion) {
        return clear_ke_interaction_folders();
    }

    public static SubLObject remove_folder_title(final SubLObject argument, final SubLObject assertion) {
        return clear_ke_interaction_folders();
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a #$KEInteractionFolder?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a #$KEInteractionFolder?")
    public static final SubLObject ke_interaction_folderP_alt(SubLObject v_object) {
        if (NIL == fort_p(v_object)) {
            return NIL;
        }
        return set_memberP(v_object, ke_interaction_folders());
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a #$KEInteractionFolder?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a #$KEInteractionFolder?")
    public static SubLObject ke_interaction_folderP(final SubLObject v_object) {
        if (NIL == forts.fort_p(v_object)) {
            return NIL;
        }
        return set.set_memberP(v_object, ke_interaction_folders());
    }

    /**
     *
     *
     * @param FOLDER-ID
     * 		fort; the fort corresponding to the root node in the tree from-which counting should start
     * @return list; a list of terms with are instances of #$FormulaTemplate
     */
    @LispMethod(comment = "@param FOLDER-ID\r\n\t\tfort; the fort corresponding to the root node in the tree from-which counting should start\r\n@return list; a list of terms with are instances of #$FormulaTemplate")
    public static final SubLObject templates_in_folder_alt(SubLObject folder_id, SubLObject elmt, SubLObject include_subfoldersP) {
        if (elmt == UNPROVIDED) {
            elmt = $$InferencePSC;
        }
        if (include_subfoldersP == UNPROVIDED) {
            include_subfoldersP = T;
        }
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        SubLTrampolineFile.checkType(folder_id, FORT_P);
        SubLTrampolineFile.checkType(elmt, HLMT_P);
        {
            SubLObject result = NIL;
            SubLObject to_do_items = list(folder_id);
            while (NIL != to_do_items) {
                {
                    SubLObject first_to_do = to_do_items.first();
                    SubLObject children = backward.removal_ask_variable($CHILDREN, listS($$folderContainsResource, first_to_do, $list_alt104), elmt, UNPROVIDED, UNPROVIDED);
                    to_do_items = to_do_items.rest();
                    {
                        SubLObject cdolist_list_var = children;
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            if ((NIL != include_subfoldersP) && (NIL != ke_interaction_folderP(child))) {
                                if (NIL == list_utilities.member_eqP(child, result)) {
                                    to_do_items = cons(child, to_do_items);
                                }
                            } else {
                                if (NIL != cycl_formula_templateP(child)) {
                                    result = cons(child, result);
                                }
                            }
                        }
                    }
                }
            } 
            return result;
        }
    }

    /**
     *
     *
     * @param FOLDER-ID
     * 		fort; the fort corresponding to the root node in the tree from-which counting should start
     * @return list; a list of terms with are instances of #$FormulaTemplate
     */
    @LispMethod(comment = "@param FOLDER-ID\r\n\t\tfort; the fort corresponding to the root node in the tree from-which counting should start\r\n@return list; a list of terms with are instances of #$FormulaTemplate")
    public static SubLObject templates_in_folder(final SubLObject folder_id, SubLObject elmt, SubLObject include_subfoldersP) {
        if (elmt == UNPROVIDED) {
            elmt = $$InferencePSC;
        }
        if (include_subfoldersP == UNPROVIDED) {
            include_subfoldersP = T;
        }
        elmt = hlmt_czer.canonicalize_hlmt(elmt);
        assert NIL != forts.fort_p(folder_id) : "! forts.fort_p(folder_id) " + ("forts.fort_p(folder_id) " + "CommonSymbols.NIL != forts.fort_p(folder_id) ") + folder_id;
        assert NIL != hlmt.hlmt_p(elmt) : "! hlmt.hlmt_p(elmt) " + ("hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) ") + elmt;
        SubLObject result = NIL;
        SubLObject to_do_items = list(folder_id);
        while (NIL != to_do_items) {
            final SubLObject first_to_do = to_do_items.first();
            final SubLObject children = backward.removal_ask_variable($CHILDREN, listS($$folderContainsResource, first_to_do, $list100), elmt, UNPROVIDED, UNPROVIDED);
            to_do_items = to_do_items.rest();
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != include_subfoldersP) && (NIL != ke_interaction_folderP(child))) {
                    if (NIL == list_utilities.member_eqP(child, result)) {
                        to_do_items = cons(child, to_do_items);
                    }
                } else
                    if (NIL != cycl_formula_templateP(child)) {
                        result = cons(child, result);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        } 
        return result;
    }

    public static final SubLObject xml_serialize_ke_interaction_folder_alt(SubLObject folder, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(folder, KE_INTERACTION_FOLDER_P);
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    {
                        SubLObject _prev_bind_0_113 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$folder, NIL, NIL);
                            {
                                SubLObject _prev_bind_0_114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_115 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$folderId, NIL, NIL);
                                    cycml.cycml_serialize_term(ke_interaction_folder_id(folder));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_115, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_114, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$folderId);
                            if (NIL != ke_interaction_folder_p(ke_interaction_folder_parent(folder))) {
                                {
                                    SubLObject parent = ke_interaction_folder_parent(folder);
                                    {
                                        SubLObject _prev_bind_0_116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_117 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$parentFolderId, NIL, NIL);
                                            cycml.cycml_serialize_term(ke_interaction_folder_id(parent));
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_117, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_116, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$parentFolderId);
                                }
                            }
                            if (NIL != ke_interaction_folder_gloss(folder)) {
                                {
                                    SubLObject _prev_bind_0_118 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_119 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$folderTitle, NIL, NIL);
                                        cycml.cycml_serialize_term(ke_interaction_folder_gloss(folder));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_119, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_118, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$folderTitle);
                            }
                            {
                                SubLObject children = ke_interaction_folder_children(folder);
                                SubLObject valid_children = NIL;
                                {
                                    SubLObject cdolist_list_var = children;
                                    SubLObject child = NIL;
                                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                        if (NIL != ke_interaction_folder_p(child)) {
                                            valid_children = cons(child, valid_children);
                                        } else {
                                            if (NIL != formula_templates.valid_formula_template_p(child)) {
                                                valid_children = cons(child, valid_children);
                                            } else {
                                                Errors.warn($str_alt109$Cannot_interpret_resource__A__ski, child);
                                            }
                                        }
                                    }
                                }
                                if (NIL != valid_children) {
                                    {
                                        SubLObject _prev_bind_0_120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_121 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$children, NIL, NIL);
                                            {
                                                SubLObject cdolist_list_var = nreverse(valid_children);
                                                SubLObject child = NIL;
                                                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                                    if (NIL != ke_interaction_folder_p(child)) {
                                                        xml_serialize_ke_interaction_folder(child, stream);
                                                    } else {
                                                        if (NIL != formula_templates.formula_template_p(child)) {
                                                            formula_templates.xml_serialize_formula_template(child, stream);
                                                        } else {
                                                            Errors.warn($str_alt111$Resource__A_slipped_through_but_c, child);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_121, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_120, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$children);
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_113, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$folder);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return folder;
        }
    }

    public static SubLObject xml_serialize_ke_interaction_folder(final SubLObject folder, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != ke_interaction_folder_p(folder) : "! ke_interaction_folder.ke_interaction_folder_p(folder) " + ("ke_interaction_folder.ke_interaction_folder_p(folder) " + "CommonSymbols.NIL != ke_interaction_folder.ke_interaction_folder_p(folder) ") + folder;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$folder, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$folderId, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(ke_interaction_folder_id(folder));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$81, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$81, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$80, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$folderId);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                            }
                        }
                        if (NIL != ke_interaction_folder_p(ke_interaction_folder_parent(folder))) {
                            final SubLObject parent = ke_interaction_folder_parent(folder);
                            try {
                                final SubLObject _prev_bind_0_$83 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$parentFolderId, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(ke_interaction_folder_id(parent));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$84, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$82, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$83, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$parentFolderId);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                }
                            }
                        }
                        if (NIL != ke_interaction_folder_gloss(folder)) {
                            try {
                                final SubLObject _prev_bind_0_$86 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$folderTitle, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$87 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(ke_interaction_folder_gloss(folder));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$87, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$83, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$86, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$folderTitle);
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                                }
                            }
                        }
                        final SubLObject children = ke_interaction_folder_children(folder);
                        SubLObject valid_children = NIL;
                        SubLObject cdolist_list_var = children;
                        SubLObject child = NIL;
                        child = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != ke_interaction_folder_p(child)) {
                                valid_children = cons(child, valid_children);
                            } else
                                if (NIL != formula_templates.valid_formula_template_p(child)) {
                                    valid_children = cons(child, valid_children);
                                } else {
                                    Errors.warn($str106$Cannot_interpret_resource__A__ski, child);
                                }

                            cdolist_list_var = cdolist_list_var.rest();
                            child = cdolist_list_var.first();
                        } 
                        if (NIL != valid_children) {
                            try {
                                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$children, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var2 = nreverse(valid_children);
                                        SubLObject child2 = NIL;
                                        child2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            if (NIL != ke_interaction_folder_p(child2)) {
                                                xml_serialize_ke_interaction_folder(child2, stream);
                                            } else
                                                if (NIL != formula_templates.formula_template_p(child2)) {
                                                    formula_templates.xml_serialize_formula_template(child2, stream);
                                                } else {
                                                    Errors.warn($str108$Resource__A_slipped_through_but_c, child2);
                                                }

                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            child2 = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$84, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$children);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$79, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$78, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$folder);
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return folder;
    }

    public static final SubLObject get_all_query_libraries_alt() {
        return Sort.sort(isa.all_fort_instances($$KEInteractionFolder, UNPROVIDED, UNPROVIDED), symbol_function($sym112$STRING_), symbol_function(FORT_NAME));
    }

    public static SubLObject get_all_query_libraries() {
        return Sort.sort(isa.all_fort_instances($$KEInteractionFolder, UNPROVIDED, UNPROVIDED), symbol_function($sym109$STRING_), symbol_function(FORT_NAME));
    }

    public static final SubLObject remove_task_query_libraries_alt(SubLObject qls) {
        return remove_if(symbol_function($sym114$QUERY_LIBRARY_FOR_TASK_), qls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_task_query_libraries(final SubLObject qls) {
        return remove_if(symbol_function($sym111$QUERY_LIBRARY_FOR_TASK_), qls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject remove_non_cyclist_query_libraries_alt(SubLObject qls) {
        return remove_if(symbol_function($sym115$QUERY_LIBRARY_FOR_NON_CYLIST_), qls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_non_cyclist_query_libraries(final SubLObject qls) {
        return remove_if(symbol_function($sym112$QUERY_LIBRARY_FOR_NON_CYLIST_), qls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown fix when there is a better collection available
     */
    @LispMethod(comment = "@unknown fix when there is a better collection available")
    public static final SubLObject get_all_query_library_mts_alt() {
        return Sort.sort(genl_mts.all_spec_mts($$GKEFormulaTemplatesMt, UNPROVIDED, UNPROVIDED), symbol_function($sym112$STRING_), symbol_function(FORT_NAME));
    }

    /**
     *
     *
     * @unknown fix when there is a better collection available
     */
    @LispMethod(comment = "@unknown fix when there is a better collection available")
    public static SubLObject get_all_query_library_mts() {
        return Sort.sort(genl_mts.all_spec_mts($$GKEFormulaTemplatesMt, UNPROVIDED, UNPROVIDED), symbol_function($sym109$STRING_), symbol_function(FORT_NAME));
    }

    public static final SubLObject query_library_for_taskP_alt(SubLObject ql) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = makeBoolean((NIL != kb_mapping_utilities.some_pred_value(ql, $const117$kEInteractionFolderOfUserForTaskW, FOUR_INTEGER, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value(ql, $$kEInteractionFolderOfUserForTask, THREE_INTEGER, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject query_library_for_taskP(final SubLObject ql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = makeBoolean((NIL != kb_mapping_utilities.some_pred_value(ql, $const114$kEInteractionFolderOfUserForTaskW, FOUR_INTEGER, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value(ql, $$kEInteractionFolderOfUserForTask, THREE_INTEGER, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Return T IFF all users associated with the folder are non-cyclists.
     */
    @LispMethod(comment = "Return T IFF all users associated with the folder are non-cyclists.")
    public static final SubLObject query_library_for_non_cylistP_alt(SubLObject ql) {
        {
            SubLObject users = kb_mapping_utilities.pred_values_in_any_mt(ql, $const117$kEInteractionFolderOfUserForTaskW, FOUR_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject cyclist_found = NIL;
            users = nconc(users, kb_mapping_utilities.pred_values_in_any_mt(ql, $$kEInteractionFolderOfUserForTask, THREE_INTEGER, ONE_INTEGER, UNPROVIDED));
            users = nconc(users, kb_mapping_utilities.pred_values_in_any_mt(ql, $$kEInteractionFolderOfUser, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
            users = remove_duplicates(users, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == users) {
                return NIL;
            }
            if (NIL == cyclist_found) {
                {
                    SubLObject csome_list_var = users;
                    SubLObject user = NIL;
                    for (user = csome_list_var.first(); !((NIL != cyclist_found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , user = csome_list_var.first()) {
                        if (NIL != kb_accessors.cyclistP(user)) {
                            cyclist_found = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == cyclist_found);
        }
    }

    @LispMethod(comment = "Return T IFF all users associated with the folder are non-cyclists.")
    public static SubLObject query_library_for_non_cylistP(final SubLObject ql) {
        SubLObject users = kb_mapping_utilities.pred_values_in_any_mt(ql, $const114$kEInteractionFolderOfUserForTaskW, FOUR_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject cyclist_found = NIL;
        users = nconc(users, kb_mapping_utilities.pred_values_in_any_mt(ql, $$kEInteractionFolderOfUserForTask, THREE_INTEGER, ONE_INTEGER, UNPROVIDED));
        users = nconc(users, kb_mapping_utilities.pred_values_in_any_mt(ql, $$kEInteractionFolderOfUser, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
        users = remove_duplicates(users, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == users) {
            return NIL;
        }
        if (NIL == cyclist_found) {
            SubLObject csome_list_var = users;
            SubLObject user = NIL;
            user = csome_list_var.first();
            while ((NIL == cyclist_found) && (NIL != csome_list_var)) {
                if (NIL != kb_accessors.cyclistP(user)) {
                    cyclist_found = T;
                }
                csome_list_var = csome_list_var.rest();
                user = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == cyclist_found);
    }/**
     * Return T IFF all users associated with the folder are non-cyclists.
     */


    public static final SubLObject ke_interact_obtain_ordering_info_alt(SubLObject folder_id, SubLObject elmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ordering_info = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject assertions = kb_mapping_utilities.pred_value_gafs(folder_id, $$higherPriorityInFolder, ONE_INTEGER, $TRUE);
                            SubLObject cdolist_list_var = assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                ordering_info = cons(list(assertions_high.gaf_arg2(assertion), assertions_high.gaf_arg3(assertion)), ordering_info);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(ordering_info);
                    SubLObject low_to_high = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list(high_to_low, low_to_high);
                }
            }
        }
    }

    public static SubLObject ke_interact_obtain_ordering_info(final SubLObject folder_id, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ordering_info = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(folder_id, $$higherPriorityInFolder, ONE_INTEGER, $TRUE);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ordering_info = cons(list(assertions_high.gaf_arg2(assertion), assertions_high.gaf_arg3(assertion)), ordering_info);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(ordering_info);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list(high_to_low, low_to_high);
    }

    public static final SubLObject ke_interact_apply_ordering_on_children_alt(SubLObject folder, SubLObject elmt, SubLObject ordering) {
        {
            SubLObject datum = ordering;
            SubLObject current = datum;
            SubLObject high_to_low = NIL;
            SubLObject low_to_high = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt121);
            high_to_low = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt121);
            low_to_high = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject sorted_ids = formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
                    SubLObject children = ke_interaction_folder_children(folder);
                    SubLObject sorted = make_list(length(sorted_ids), UNPROVIDED);
                    SubLObject unsorted_tail = NIL;
                    if (NIL == sorted_ids) {
                        return folder;
                    }
                    {
                        SubLObject cdolist_list_var = children;
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            {
                                SubLObject child_object = find(ke_interaction_folder_object_id(child), sorted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == child_object) {
                                    unsorted_tail = cons(child, unsorted_tail);
                                } else {
                                    {
                                        SubLObject spot = position(ke_interaction_folder_object_id(child), sorted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        set_nth(spot, sorted, child);
                                    }
                                }
                            }
                        }
                    }
                    _csetf_ke_interaction_folder_children(folder, delete_if(symbol_function(NULL), cconcatenate(sorted, Sort.sort(unsorted_tail, symbol_function($sym123$_), symbol_function(KE_INTERACTION_FOLDER_SORT_KEY))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt121);
            }
        }
        return folder;
    }

    public static SubLObject ke_interact_apply_ordering_on_children(final SubLObject folder, final SubLObject elmt, final SubLObject ordering) {
        SubLObject high_to_low = NIL;
        SubLObject low_to_high = NIL;
        destructuring_bind_must_consp(ordering, ordering, $list118);
        high_to_low = ordering.first();
        SubLObject current = ordering.rest();
        destructuring_bind_must_consp(current, ordering, $list118);
        low_to_high = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject sorted_ids = formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high);
            final SubLObject children = ke_interaction_folder_children(folder);
            final SubLObject sorted = make_list(length(sorted_ids), UNPROVIDED);
            SubLObject unsorted_tail = NIL;
            if (NIL == sorted_ids) {
                return folder;
            }
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject child_object = find(ke_interaction_folder_object_id(child), sorted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == child_object) {
                    unsorted_tail = cons(child, unsorted_tail);
                } else {
                    final SubLObject spot = position(ke_interaction_folder_object_id(child), sorted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    set_nth(spot, sorted, child);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
            _csetf_ke_interaction_folder_children(folder, delete_if(symbol_function(NULL), cconcatenate(sorted, Sort.sort(unsorted_tail, symbol_function($sym120$_), symbol_function(KE_INTERACTION_FOLDER_SORT_KEY))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            cdestructuring_bind_error(ordering, $list118);
        }
        return folder;
    }

    public static final SubLObject ke_interaction_folder_sort_key_alt(SubLObject folder) {
        return misc_kb_utilities.get_term_id(ke_interaction_folder_object_id(folder));
    }

    public static SubLObject ke_interaction_folder_sort_key(final SubLObject folder) {
        return misc_kb_utilities.get_term_id(ke_interaction_folder_object_id(folder));
    }

    public static final SubLObject ke_interaction_folder_object_id_alt(SubLObject v_object) {
        return NIL != ke_interaction_folder_p(v_object) ? ((SubLObject) (ke_interaction_folder_id(v_object))) : NIL != formula_templates.formula_template_p(v_object) ? ((SubLObject) (formula_templates.formula_template_id(v_object))) : NIL;
    }

    public static SubLObject ke_interaction_folder_object_id(final SubLObject v_object) {
        return NIL != ke_interaction_folder_p(v_object) ? ke_interaction_folder_id(v_object) : NIL != formula_templates.formula_template_p(v_object) ? formula_templates.formula_template_id(v_object) : NIL;
    }

    public static SubLObject declare_ke_interaction_folder_file() {
        declareFunction("create_new_subfolder", "CREATE-NEW-SUBFOLDER", 1, 1, false);
        declareFunction("relexify_ke_interaction_folder_constant", "RELEXIFY-KE-INTERACTION-FOLDER-CONSTANT", 2, 1, false);
        declareFunction("lexify_ke_interaction_folder_constant", "LEXIFY-KE-INTERACTION-FOLDER-CONSTANT", 3, 0, false);
        declareFunction("move_ke_interaction_resource", "MOVE-KE-INTERACTION-RESOURCE", 3, 0, false);
        declareFunction("add_ke_interaction_resource_to_folder", "ADD-KE-INTERACTION-RESOURCE-TO-FOLDER", 2, 0, false);
        declareFunction("remove_ke_interaction_resource_from_folder", "REMOVE-KE-INTERACTION-RESOURCE-FROM-FOLDER", 2, 0, false);
        declareFunction("default_mt_for_ke_interaction_folder", "DEFAULT-MT-FOR-KE-INTERACTION-FOLDER", 1, 0, false);
        declareFunction("ke_interaction_folder_print_function_trampoline", "KE-INTERACTION-FOLDER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ke_interaction_folder_p", "KE-INTERACTION-FOLDER-P", 1, 0, false);
        new ke_interaction_folder.$ke_interaction_folder_p$UnaryFunction();
        declareFunction("ke_interaction_folder_id", "KE-INTERACTION-FOLDER-ID", 1, 0, false);
        declareFunction("ke_interaction_folder_mt", "KE-INTERACTION-FOLDER-MT", 1, 0, false);
        declareFunction("ke_interaction_folder_gloss", "KE-INTERACTION-FOLDER-GLOSS", 1, 0, false);
        declareFunction("ke_interaction_folder_parent", "KE-INTERACTION-FOLDER-PARENT", 1, 0, false);
        declareFunction("ke_interaction_folder_children", "KE-INTERACTION-FOLDER-CHILDREN", 1, 0, false);
        declareFunction("_csetf_ke_interaction_folder_id", "_CSETF-KE-INTERACTION-FOLDER-ID", 2, 0, false);
        declareFunction("_csetf_ke_interaction_folder_mt", "_CSETF-KE-INTERACTION-FOLDER-MT", 2, 0, false);
        declareFunction("_csetf_ke_interaction_folder_gloss", "_CSETF-KE-INTERACTION-FOLDER-GLOSS", 2, 0, false);
        declareFunction("_csetf_ke_interaction_folder_parent", "_CSETF-KE-INTERACTION-FOLDER-PARENT", 2, 0, false);
        declareFunction("_csetf_ke_interaction_folder_children", "_CSETF-KE-INTERACTION-FOLDER-CHILDREN", 2, 0, false);
        declareFunction("make_ke_interaction_folder", "MAKE-KE-INTERACTION-FOLDER", 0, 1, false);
        declareFunction("visit_defstruct_ke_interaction_folder", "VISIT-DEFSTRUCT-KE-INTERACTION-FOLDER", 2, 0, false);
        declareFunction("visit_defstruct_object_ke_interaction_folder_method", "VISIT-DEFSTRUCT-OBJECT-KE-INTERACTION-FOLDER-METHOD", 2, 0, false);
        declareFunction("print_ke_interaction_folder", "PRINT-KE-INTERACTION-FOLDER", 3, 0, false);
        declareFunction("new_ke_interaction_folder", "NEW-KE-INTERACTION-FOLDER", 2, 0, false);
        declareFunction("ke_interaction_folder_load_query_library", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY", 2, 1, false);
        declareFunction("update_folder_query_params_using_defaults", "UPDATE-FOLDER-QUERY-PARAMS-USING-DEFAULTS", 2, 0, false);
        declareFunction("ke_interaction_folder_load_query_library_skeleton", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-SKELETON", 2, 1, false);
        declareFunction("ke_interaction_folder_get_gloss_for_folder_id", "KE-INTERACTION-FOLDER-GET-GLOSS-FOR-FOLDER-ID", 2, 0, false);
        declareFunction("ke_interaction_folder_load_one_level", "KE-INTERACTION-FOLDER-LOAD-ONE-LEVEL", 2, 1, false);
        declareFunction("get_ke_interaction_folder_contents_from_kb", "GET-KE-INTERACTION-FOLDER-CONTENTS-FROM-KB", 2, 0, false);
        declareFunction("cycl_formula_templateP", "CYCL-FORMULA-TEMPLATE?", 1, 0, false);
        declareFunction("clear_ke_interaction_folders", "CLEAR-KE-INTERACTION-FOLDERS", 0, 0, false);
        declareFunction("remove_ke_interaction_folders", "REMOVE-KE-INTERACTION-FOLDERS", 0, 0, false);
        declareFunction("ke_interaction_folders_internal", "KE-INTERACTION-FOLDERS-INTERNAL", 0, 0, false);
        declareFunction("ke_interaction_folders", "KE-INTERACTION-FOLDERS", 0, 0, false);
        declareFunction("add_folder_title", "ADD-FOLDER-TITLE", 2, 0, false);
        declareFunction("remove_folder_title", "REMOVE-FOLDER-TITLE", 2, 0, false);
        declareFunction("ke_interaction_folderP", "KE-INTERACTION-FOLDER?", 1, 0, false);
        declareFunction("templates_in_folder", "TEMPLATES-IN-FOLDER", 1, 2, false);
        declareFunction("xml_serialize_ke_interaction_folder", "XML-SERIALIZE-KE-INTERACTION-FOLDER", 1, 1, false);
        declareFunction("get_all_query_libraries", "GET-ALL-QUERY-LIBRARIES", 0, 0, false);
        declareFunction("remove_task_query_libraries", "REMOVE-TASK-QUERY-LIBRARIES", 1, 0, false);
        declareFunction("remove_non_cyclist_query_libraries", "REMOVE-NON-CYCLIST-QUERY-LIBRARIES", 1, 0, false);
        declareFunction("get_all_query_library_mts", "GET-ALL-QUERY-LIBRARY-MTS", 0, 0, false);
        declareFunction("query_library_for_taskP", "QUERY-LIBRARY-FOR-TASK?", 1, 0, false);
        declareFunction("query_library_for_non_cylistP", "QUERY-LIBRARY-FOR-NON-CYLIST?", 1, 0, false);
        declareFunction("ke_interact_obtain_ordering_info", "KE-INTERACT-OBTAIN-ORDERING-INFO", 2, 0, false);
        declareFunction("ke_interact_apply_ordering_on_children", "KE-INTERACT-APPLY-ORDERING-ON-CHILDREN", 3, 0, false);
        declareFunction("ke_interaction_folder_sort_key", "KE-INTERACTION-FOLDER-SORT-KEY", 1, 0, false);
        declareFunction("ke_interaction_folder_object_id", "KE-INTERACTION-FOLDER-OBJECT-ID", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_ke_interaction_folder_file() {
        deflexical("*DEFAULT-NEW-KE-INTERACTION-FOLDER-NAME*", $$$New_Folder);
        defconstant("*DTP-KE-INTERACTION-FOLDER*", KE_INTERACTION_FOLDER);
        deflexical("*KE-INTERACTION-FOLDERS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_ke_interaction_folder_file() {
        register_external_symbol(CREATE_NEW_SUBFOLDER);
        register_external_symbol(RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT);
        register_external_symbol(MOVE_KE_INTERACTION_RESOURCE);
        register_external_symbol(ADD_KE_INTERACTION_RESOURCE_TO_FOLDER);
        register_external_symbol(REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ke_interaction_folder$.getGlobalValue(), symbol_function(KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list57);
        def_csetf(KE_INTERACTION_FOLDER_ID, _CSETF_KE_INTERACTION_FOLDER_ID);
        def_csetf(KE_INTERACTION_FOLDER_MT, _CSETF_KE_INTERACTION_FOLDER_MT);
        def_csetf(KE_INTERACTION_FOLDER_GLOSS, _CSETF_KE_INTERACTION_FOLDER_GLOSS);
        def_csetf(KE_INTERACTION_FOLDER_PARENT, _CSETF_KE_INTERACTION_FOLDER_PARENT);
        def_csetf(KE_INTERACTION_FOLDER_CHILDREN, _CSETF_KE_INTERACTION_FOLDER_CHILDREN);
        identity(KE_INTERACTION_FOLDER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ke_interaction_folder$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD));
        memoization_state.note_globally_cached_function(KE_INTERACTION_FOLDERS);
        register_kb_function(ADD_FOLDER_TITLE);
        register_kb_function(REMOVE_FOLDER_TITLE);
        return NIL;
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
    }

    public static final class $ke_interaction_folder_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $mt;

        public SubLObject $gloss;

        public SubLObject $parent;

        public SubLObject $children;

        private static final SubLStructDeclNative structDecl;

        public $ke_interaction_folder_native() {
            ke_interaction_folder.$ke_interaction_folder_native.this.$id = Lisp.NIL;
            ke_interaction_folder.$ke_interaction_folder_native.this.$mt = Lisp.NIL;
            ke_interaction_folder.$ke_interaction_folder_native.this.$gloss = Lisp.NIL;
            ke_interaction_folder.$ke_interaction_folder_native.this.$parent = Lisp.NIL;
            ke_interaction_folder.$ke_interaction_folder_native.this.$children = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$mt;
        }

        @Override
        public SubLObject getField4() {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$gloss;
        }

        @Override
        public SubLObject getField5() {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$parent;
        }

        @Override
        public SubLObject getField6() {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$children;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$gloss = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$parent = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return ke_interaction_folder.$ke_interaction_folder_native.this.$children = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.ke_interaction_folder.$ke_interaction_folder_native.class, KE_INTERACTION_FOLDER, KE_INTERACTION_FOLDER_P, $list51, $list52, new String[]{ "$id", "$mt", "$gloss", "$parent", "$children" }, $list53, $list54, PRINT_KE_INTERACTION_FOLDER);
        }
    }

    public static final class $ke_interaction_folder_p$UnaryFunction extends UnaryFunction {
        public $ke_interaction_folder_p$UnaryFunction() {
            super(extractFunctionNamed("KE-INTERACTION-FOLDER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ke_interaction_folder_p(arg1);
        }
    }

    static private final SubLString $str_alt6$_S_is_not_known_to_be_a_KE_intera = makeString("~S is not known to be a KE interaction folder in ~S");

    static private final SubLList $list_alt13 = list(makeSymbol("?FOLDER"));

    static private final SubLList $list_alt14 = list(list(reader_make_constant_shell("folderTitle"), makeSymbol("?FOLDER"), makeKeyword("X")));

    static private final SubLString $str_alt17$_ = makeString("-");

    static private final SubLString $str_alt26$_S_is_not_known_to_be_a_KE_intera = makeString("~S is not known to be a KE interaction resource in ~S");

    static private final SubLString $str_alt27$_S_is_not_known_to_be_in__S_in__S = makeString("~S is not known to be in ~S in ~S");

    static private final SubLString $str_alt34$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt39$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt41$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt42$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");

    private static final SubLSymbol $REMOVAL_GENLPREDS_LOOKUP_POS = makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS");

    private static final SubLSymbol $REMOVAL_GENLINVERSE_LOOKUP_POS = makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS");



    static private final SubLList $list_alt58 = list(makeSymbol("ID"), makeSymbol("MT"), makeSymbol("GLOSS"), makeSymbol("PARENT"), makeSymbol("CHILDREN"));

    static private final SubLList $list_alt59 = list(makeKeyword("ID"), makeKeyword("MT"), makeKeyword("GLOSS"), makeKeyword("PARENT"), makeKeyword("CHILDREN"));

    static private final SubLList $list_alt60 = list(makeSymbol("KE-INTERACTION-FOLDER-ID"), makeSymbol("KE-INTERACTION-FOLDER-MT"), makeSymbol("KE-INTERACTION-FOLDER-GLOSS"), makeSymbol("KE-INTERACTION-FOLDER-PARENT"), makeSymbol("KE-INTERACTION-FOLDER-CHILDREN"));

    static private final SubLList $list_alt61 = list(makeSymbol("_CSETF-KE-INTERACTION-FOLDER-ID"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-MT"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-GLOSS"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-PARENT"), makeSymbol("_CSETF-KE-INTERACTION-FOLDER-CHILDREN"));

    static private final SubLString $str_alt79$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt80$__ = makeString("#<");

    static private final SubLString $str_alt82$_A_in_mt___A__ = makeString("~A in mt: ~A~%");

    static private final SubLList $list_alt86 = list(makeKeyword("TITLE"));

    static private final SubLSymbol $sym87$_CHILD = makeSymbol("?CHILD");

    static private final SubLList $list_alt88 = list(makeSymbol("ELMT"));

    static private final SubLString $str_alt89$Cannot_handle_resource__A_at_this = makeString("Cannot handle resource ~A at this point in time -- skipping.");

    static private final SubLString $str_alt92$Cannot_load_formula_template__A__ = makeString("Cannot load formula template ~A -- skipping.~%~S");

    static private final SubLList $list_alt99 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    public static final SubLSymbol $kw101$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt104 = list(makeKeyword("CHILDREN"));

    static private final SubLString $str_alt109$Cannot_interpret_resource__A__ski = makeString("Cannot interpret resource ~A, skipping.");

    static private final SubLString $str_alt111$Resource__A_slipped_through_but_c = makeString("Resource ~A slipped through but cannot be interpreted, skipping.");

    static private final SubLSymbol $sym112$STRING_ = makeSymbol("STRING<");

    static private final SubLSymbol $sym114$QUERY_LIBRARY_FOR_TASK_ = makeSymbol("QUERY-LIBRARY-FOR-TASK?");

    static private final SubLSymbol $sym115$QUERY_LIBRARY_FOR_NON_CYLIST_ = makeSymbol("QUERY-LIBRARY-FOR-NON-CYLIST?");

    public static final SubLObject $const117$kEInteractionFolderOfUserForTaskW = reader_make_constant_shell("kEInteractionFolderOfUserForTaskWRTConcept");

    static private final SubLList $list_alt121 = list(makeSymbol("HIGH-TO-LOW"), makeSymbol("LOW-TO-HIGH"));

    static private final SubLSymbol $sym123$_ = makeSymbol("<");
}

/**
 * Total time: 2300 ms
 */
