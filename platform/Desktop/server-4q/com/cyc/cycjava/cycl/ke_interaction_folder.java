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

public final class ke_interaction_folder
    extends
      SubLTranslatedFile
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
  public static SubLObject create_new_subfolder(final SubLObject folder_id, SubLObject lex_mt)
  {
    if( lex_mt == UNPROVIDED )
    {
      lex_mt = $const2$GeneralEnglishMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( folder_id ) : folder_id;
    assert NIL != hlmt.possibly_hlmt_p( lex_mt ) : lex_mt;
    final SubLObject defining_mt = default_mt_for_ke_interaction_folder( folder_id );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isa.isaP( folder_id, $const5$KEInteractionFolder, defining_mt, UNPROVIDED ) )
    {
      Errors.error( $str6$_S_is_not_known_to_be_a_KE_intera, folder_id, defining_mt );
    }
    final SubLObject new_folder = rkf_term_utilities.create_new_constant( $str7$UserCreatedFolder, ConsesLow.list( $const5$KEInteractionFolder ), NIL, $const8$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    add_ke_interaction_resource_to_folder( new_folder, folder_id );
    SubLObject name;
    for( SubLObject name_stem = name = $default_new_ke_interaction_folder_name$.getGlobalValue(), suffix = ZERO_INTEGER, existing = ask_utilities.query_variable( $kw9$X, ConsesLow.listS( $const10$and, ConsesLow.list(
        $const11$ist, defining_mt, ConsesLow.listS( $const12$subFolders, folder_id, $list13 ) ), $list14 ), lex_mt, ConsesLow.list( $kw15$INFERENCE_MODE, $kw16$MINIMAL ) ); NIL != conses_high.member( name, existing,
            Symbols.symbol_function( EQUAL ), UNPROVIDED ); name = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name_stem ), new SubLObject[]
            { $str17$_, format_nil.format_nil_d_no_copy( suffix )
    } ) )
    {
      suffix = Numbers.add( suffix, ONE_INTEGER );
    }
    lexify_ke_interaction_folder_constant( new_folder, name, lex_mt );
    return new_folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 2154L)
  public static SubLObject relexify_ke_interaction_folder_constant(final SubLObject folder_id, final SubLObject new_name, SubLObject lex_mt)
  {
    if( lex_mt == UNPROVIDED )
    {
      lex_mt = $const2$GeneralEnglishMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( folder_id ) : folder_id;
    assert NIL != Types.stringp( new_name ) : new_name;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isa.isaP( folder_id, $const5$KEInteractionFolder, lex_mt, UNPROVIDED ) )
    {
      Errors.error( $str6$_S_is_not_known_to_be_a_KE_intera, folder_id, lex_mt );
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lex_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const21$folderTitle;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( folder_id, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( folder_id, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw22$GAF, $kw23$TRUE, NIL );
              SubLObject done_var_$1 = NIL;
              final SubLObject token_var_$2 = NIL;
              while ( NIL == done_var_$1)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                if( NIL != valid_$3 )
                {
                  if( NIL != assertions_high.asserted_assertionP( assertion ) )
                  {
                    ke.ke_unassert_assertion_now( assertion );
                  }
                  if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
                  {
                    ke.ke_blast_assertion( assertion );
                  }
                }
                done_var_$1 = makeBoolean( NIL == valid_$3 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return lexify_ke_interaction_folder_constant( folder_id, new_name, lex_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 2938L)
  public static SubLObject lexify_ke_interaction_folder_constant(final SubLObject folder, final SubLObject name, final SubLObject lex_mt)
  {
    return ke.ke_assert_now( ConsesLow.list( $const21$folderTitle, folder, name ), lex_mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 3077L)
  public static SubLObject move_ke_interaction_resource(final SubLObject resource_id, final SubLObject from_folder_id, final SubLObject to_folder_id)
  {
    if( NIL != from_folder_id )
    {
      remove_ke_interaction_resource_from_folder( resource_id, from_folder_id );
    }
    add_ke_interaction_resource_to_folder( resource_id, to_folder_id );
    return to_folder_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 3414L)
  public static SubLObject add_ke_interaction_resource_to_folder(final SubLObject resource_id, final SubLObject to_folder_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( resource_id ) : resource_id;
    assert NIL != kb_indexing_datastructures.indexed_term_p( to_folder_id ) : to_folder_id;
    final SubLObject mt = default_mt_for_ke_interaction_folder( to_folder_id );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isa.isaP( to_folder_id, $const5$KEInteractionFolder, mt, UNPROVIDED ) )
    {
      Errors.error( $str6$_S_is_not_known_to_be_a_KE_intera, to_folder_id, mt );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isa.isaP( resource_id, $const26$KEInteractionResource, mt, UNPROVIDED ) )
    {
      Errors.error( $str27$_S_is_not_known_to_be_a_KE_intera, resource_id, mt );
    }
    final SubLObject preferred_pred = ( NIL != isa.isaP( resource_id, $const5$KEInteractionFolder, mt, UNPROVIDED ) ) ? $const12$subFolders
        : ( ( NIL != isa.isaP( resource_id, $const28$FormulaTemplate, mt, UNPROVIDED ) ) ? $const29$folderContainsTemplate : $const30$folderContainsResource );
    ke.ke_assert_now( el_utilities.make_binary_formula( preferred_pred, to_folder_id, resource_id ), mt, UNPROVIDED, UNPROVIDED );
    return resource_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 4275L)
  public static SubLObject remove_ke_interaction_resource_from_folder(final SubLObject resource_id, final SubLObject from_folder_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( resource_id ) : resource_id;
    assert NIL != kb_indexing_datastructures.indexed_term_p( from_folder_id ) : from_folder_id;
    final SubLObject mt = default_mt_for_ke_interaction_folder( from_folder_id );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isa.isaP( from_folder_id, $const5$KEInteractionFolder, mt, UNPROVIDED ) )
    {
      Errors.error( $str6$_S_is_not_known_to_be_a_KE_intera, from_folder_id, mt );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == isa.isaP( resource_id, $const26$KEInteractionResource, mt, UNPROVIDED ) )
    {
      Errors.error( $str27$_S_is_not_known_to_be_a_KE_intera, resource_id, mt );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( resource_id, get_ke_interaction_folder_contents_from_kb( from_folder_id, mt ), UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str32$_S_is_not_known_to_be_in__S_in__S, resource_id, from_folder_id, mt );
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject node_var = $const30$folderContainsResource;
      final SubLObject deck_type = $kw35$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw37$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw40$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str41$continue_anyway, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw42$WARN ) )
              {
                Errors.warn( $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str41$continue_anyway, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const30$folderContainsResource, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const44$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const30$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(
                      recur_deck ) )
                  {
                    final SubLObject node_var_$14 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject spec_pred = node_var_$14;
                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      final SubLObject inverseP = predicate_mode;
                      final SubLObject pred_var = spec_pred;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( resource_id, ( NIL != inverseP ) ? ONE_INTEGER : TWO_INTEGER, pred_var ) )
                      {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( resource_id, ( NIL != inverseP ) ? ONE_INTEGER : TWO_INTEGER, pred_var );
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while ( NIL == done_var)
                        {
                          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                          if( NIL != valid )
                          {
                            SubLObject final_index_iterator = NIL;
                            try
                            {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw22$GAF, $kw23$TRUE, NIL );
                              SubLObject done_var_$16 = NIL;
                              final SubLObject token_var_$17 = NIL;
                              while ( NIL == done_var_$16)
                              {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$17 );
                                final SubLObject valid_$18 = makeBoolean( !token_var_$17.eql( assertion ) );
                                if( NIL != valid_$18 && from_folder_id.equal( assertions_high.gaf_arg( assertion, ( NIL != inverseP ) ? TWO_INTEGER : ONE_INTEGER ) ) )
                                {
                                  if( NIL != assertions_high.asserted_assertionP( assertion ) )
                                  {
                                    ke.ke_unassert_assertion_now( assertion );
                                  }
                                  if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
                                  {
                                    ke.ke_blast_assertion( assertion );
                                  }
                                }
                                done_var_$16 = makeBoolean( NIL == valid_$18 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                if( NIL != final_index_iterator )
                                {
                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                }
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                              }
                            }
                          }
                          done_var = makeBoolean( NIL == valid );
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$14 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt_$22 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$22 ) )
                                  {
                                    final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$22, thread );
                                      SubLObject iteration_state_$24;
                                      for( iteration_state_$24 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$24 ); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next( iteration_state_$24 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$24 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$13, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$24 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$12, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$26;
                            final SubLObject new_list = cdolist_list_var_$26 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$26.first();
                            while ( NIL != cdolist_list_var_$26)
                            {
                              final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$14, thread );
                              }
                              cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                              generating_fn = cdolist_list_var_$26.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$10, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$11, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$11, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$9, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$8, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str47$Node__a_does_not_pass_sbhl_type_t, $const30$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$10, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$8, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$7, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$7, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$6, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return resource_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5498L)
  public static SubLObject default_mt_for_ke_interaction_folder(final SubLObject v_ke_interaction_folder)
  {
    return $const48$KEInteractionResourceTestMt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_ke_interaction_folder( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $ke_interaction_folder_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_id(final SubLObject v_object)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_mt(final SubLObject v_object)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_gloss(final SubLObject v_object)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_parent(final SubLObject v_object)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject ke_interaction_folder_children(final SubLObject v_object)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject _csetf_ke_interaction_folder_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject _csetf_ke_interaction_folder_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject _csetf_ke_interaction_folder_gloss(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject _csetf_ke_interaction_folder_parent(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject _csetf_ke_interaction_folder_children(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ke_interaction_folder_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject make_ke_interaction_folder(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $ke_interaction_folder_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw68$ID ) )
      {
        _csetf_ke_interaction_folder_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw69$MT ) )
      {
        _csetf_ke_interaction_folder_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw70$GLOSS ) )
      {
        _csetf_ke_interaction_folder_gloss( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$PARENT ) )
      {
        _csetf_ke_interaction_folder_parent( v_new, current_value );
      }
      else if( pcase_var.eql( $kw72$CHILDREN ) )
      {
        _csetf_ke_interaction_folder_children( v_new, current_value );
      }
      else
      {
        Errors.error( $str73$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject visit_defstruct_ke_interaction_folder(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw74$BEGIN, $sym75$MAKE_KE_INTERACTION_FOLDER, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw76$SLOT, $kw68$ID, ke_interaction_folder_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw76$SLOT, $kw69$MT, ke_interaction_folder_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw76$SLOT, $kw70$GLOSS, ke_interaction_folder_gloss( obj ) );
    Functions.funcall( visitor_fn, obj, $kw76$SLOT, $kw71$PARENT, ke_interaction_folder_parent( obj ) );
    Functions.funcall( visitor_fn, obj, $kw76$SLOT, $kw72$CHILDREN, ke_interaction_folder_children( obj ) );
    Functions.funcall( visitor_fn, obj, $kw77$END, $sym75$MAKE_KE_INTERACTION_FOLDER, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 5860L)
  public static SubLObject visit_defstruct_object_ke_interaction_folder_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_ke_interaction_folder( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 6265L)
  public static SubLObject print_ke_interaction_folder(final SubLObject folder, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( folder, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, folder, T, T );
      PrintLow.format( stream, $str79$_A_in_mt___A__, ke_interaction_folder_id( folder ), ke_interaction_folder_mt( folder ) );
      print_macros.print_unreadable_object_postamble( stream, folder, NIL, NIL );
    }
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 6532L)
  public static SubLObject new_ke_interaction_folder(final SubLObject folder_id, final SubLObject folder_mt)
  {
    assert NIL != hlmt.hlmt_p( folder_mt ) : folder_mt;
    assert NIL != forts.fort_p( folder_id ) : folder_id;
    final SubLObject folder = make_ke_interaction_folder( UNPROVIDED );
    _csetf_ke_interaction_folder_id( folder, folder_id );
    _csetf_ke_interaction_folder_mt( folder, folder_mt );
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 6839L)
  public static SubLObject ke_interaction_folder_load_query_library(SubLObject folder_id, SubLObject elmt, SubLObject parent)
  {
    if( parent == UNPROVIDED )
    {
      parent = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    elmt = hlmt_czer.canonicalize_hlmt( elmt );
    folder_id = hlmt_czer.canonicalize_hlmt( folder_id );
    assert NIL != forts.fort_p( folder_id ) : folder_id;
    assert NIL != hlmt.hlmt_p( elmt ) : elmt;
    final SubLObject folder = new_ke_interaction_folder( folder_id, elmt );
    _csetf_ke_interaction_folder_parent( folder, parent );
    _csetf_ke_interaction_folder_gloss( folder, ask_utilities.ask_variable( $kw81$TITLE, ConsesLow.listS( $const21$folderTitle, folder_id, $list82 ), $const83$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ).first() );
    final SubLObject child_var = $sym84$_CHILD;
    final SubLObject sorting_information = ke_interact_obtain_ordering_info( folder_id, elmt );
    thread.resetMultipleValues();
    final SubLObject binding_lists = inference_kernel.new_cyc_query( ConsesLow.listS( $const30$folderContainsResource, folder_id, child_var, $list85 ), UNPROVIDED, UNPROVIDED );
    final SubLObject v_answer = thread.secondMultipleValue();
    final SubLObject reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = binding_lists;
    SubLObject binding_list = NIL;
    binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject param = bindings.variable_lookup( child_var, binding_list );
      if( NIL != isa.isaP( param, $const5$KEInteractionFolder, elmt, UNPROVIDED ) )
      {
        _csetf_ke_interaction_folder_children( folder, ConsesLow.cons( ke_interaction_folder_load_query_library( param, elmt, folder ), ke_interaction_folder_children( folder ) ) );
      }
      else if( NIL != isa.isaP( param, $const28$FormulaTemplate, elmt, UNPROVIDED ) )
      {
        _csetf_ke_interaction_folder_children( folder, ConsesLow.cons( formula_templates.load_formula_template_details_from_kb( param, elmt ), ke_interaction_folder_children( folder ) ) );
      }
      else
      {
        Errors.warn( $str86$Cannot_handle_resource__A_at_this, param );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_list = cdolist_list_var.first();
    }
    ke_interact_apply_ordering_on_children( folder, elmt, sorting_information );
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 8586L)
  public static SubLObject update_folder_query_params_using_defaults(final SubLObject v_ke_interaction_folder, final SubLObject defaults)
  {
    SubLObject cdolist_list_var = ke_interaction_folder_children( v_ke_interaction_folder );
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != ke_interaction_folder_p( child ) )
      {
        update_folder_query_params_using_defaults( child, defaults );
      }
      else if( NIL != formula_templates.valid_formula_template_p( child ) )
      {
        final SubLObject query_spec = formula_templates.formula_template_query_specification( child );
        new_cycl_query_specification.update_query_spec_params_using_defaults( query_spec, defaults );
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return v_ke_interaction_folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 9204L)
  public static SubLObject ke_interaction_folder_load_query_library_skeleton(SubLObject folder_id, SubLObject elmt, SubLObject parent)
  {
    if( parent == UNPROVIDED )
    {
      parent = NIL;
    }
    elmt = hlmt_czer.canonicalize_hlmt( elmt );
    folder_id = czer_main.canonicalize_term( folder_id, UNPROVIDED );
    assert NIL != hlmt.hlmt_p( elmt ) : elmt;
    final SubLObject folder = new_ke_interaction_folder( folder_id, elmt );
    SubLObject gloss = NIL;
    _csetf_ke_interaction_folder_parent( folder, parent );
    gloss = ke_interaction_folder_get_gloss_for_folder_id( folder_id, elmt );
    _csetf_ke_interaction_folder_gloss( folder, gloss );
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 9922L)
  public static SubLObject ke_interaction_folder_get_gloss_for_folder_id(final SubLObject folder_id, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asserted_title = kb_mapping_utilities.fpred_value_in_any_mt( folder_id, $const21$folderTitle, ONE_INTEGER, TWO_INTEGER, $kw23$TRUE );
    return ( NIL != asserted_title ) ? asserted_title : pph_main.generate_phrase( folder_id, $kw87$ANY, NIL, pph_vars.$pph_language_mt$.getDynamicValue( thread ), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 10262L)
  public static SubLObject ke_interaction_folder_load_one_level(final SubLObject folder_id, final SubLObject elmt, SubLObject parent)
  {
    if( parent == UNPROVIDED )
    {
      parent = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject folder = new_ke_interaction_folder( folder_id, elmt );
    SubLObject gloss = NIL;
    _csetf_ke_interaction_folder_parent( folder, parent );
    gloss = ke_interaction_folder_get_gloss_for_folder_id( folder_id, elmt );
    _csetf_ke_interaction_folder_gloss( folder, gloss );
    final SubLObject sorting_information = ke_interact_obtain_ordering_info( folder_id, elmt );
    SubLObject cdolist_list_var;
    final SubLObject params = cdolist_list_var = get_ke_interaction_folder_contents_from_kb( folder_id, elmt );
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != ke_interaction_folderP( param ) )
      {
        _csetf_ke_interaction_folder_children( folder, ConsesLow.cons( ke_interaction_folder_load_query_library_skeleton( param, elmt, folder ), ke_interaction_folder_children( folder ) ) );
      }
      else if( NIL != cycl_formula_templateP( param ) )
      {
        SubLObject template_details = NIL;
        SubLObject error_message = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym88$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              template_details = formula_templates.load_formula_template_details_from_kb( param, elmt );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error_message )
        {
          Errors.warn( $str89$Cannot_load_formula_template__A__, param, error_message );
        }
        else
        {
          _csetf_ke_interaction_folder_children( folder, ConsesLow.cons( template_details, ke_interaction_folder_children( folder ) ) );
        }
      }
      else
      {
        Errors.warn( $str86$Cannot_handle_resource__A_at_this, param );
      }
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    ke_interact_apply_ordering_on_children( folder, elmt, sorting_information );
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12198L)
  public static SubLObject get_ke_interaction_folder_contents_from_kb(final SubLObject folder_id, final SubLObject elmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject contents = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( elmt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject node_var = $const30$folderContainsResource;
      final SubLObject deck_type = $kw35$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw37$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw40$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str41$continue_anyway, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw42$WARN ) )
              {
                Errors.warn( $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str41$continue_anyway, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$32 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$34 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const30$folderContainsResource, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$32 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$33 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$35 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const44$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const30$folderContainsResource, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(
                      recur_deck ) )
                  {
                    final SubLObject node_var_$38 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject spec_pred = node_var_$38;
                    final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      final SubLObject inverseP = predicate_mode;
                      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( folder_id, spec_pred, ( NIL != inverseP ) ? TWO_INTEGER : ONE_INTEGER, ( NIL != inverseP ) ? ONE_INTEGER : TWO_INTEGER, UNPROVIDED );
                      SubLObject item = NIL;
                      item = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject item_var = item;
                        if( NIL == conses_high.member( item_var, contents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          contents = ConsesLow.cons( item_var, contents );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                      }
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const44$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$34 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$38 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$43;
                                      for( iteration_state_$43 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$43 ); iteration_state_$43 = dictionary_contents.do_dictionary_contents_next( iteration_state_$43 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$43 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$36, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$43 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$35, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$45;
                            final SubLObject new_list = cdolist_list_var_$45 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$45.first();
                            while ( NIL != cdolist_list_var_$45)
                            {
                              final SubLObject _prev_bind_0_$37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$37, thread );
                              }
                              cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                              generating_fn = cdolist_list_var_$45.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$34, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$34, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$33, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$35, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$33, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$32, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str47$Node__a_does_not_pass_sbhl_type_t, $const30$folderContainsResource, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$34, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$32, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$31, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$31, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$30, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$29, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12575L)
  public static SubLObject cycl_formula_templateP(final SubLObject v_object)
  {
    if( NIL != narts_high.nart_with_functor_p( $const90$TemplateFromTestQueryFn, v_object ) )
    {
      return T;
    }
    return isa.isa_in_any_mtP( v_object, $const28$FormulaTemplate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
  public static SubLObject clear_ke_interaction_folders()
  {
    final SubLObject cs = $ke_interaction_folders_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
  public static SubLObject remove_ke_interaction_folders()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $ke_interaction_folders_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
  public static SubLObject ke_interaction_folders_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject folders = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym92$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const93$EverythingPSC, thread );
      final SubLObject node_var = $const5$KEInteractionFolder;
      final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_1_$49 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const94$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$50 = node_var;
          final SubLObject deck_type = $kw34$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw37$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw40$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str41$continue_anyway, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw42$WARN ) )
                  {
                    Errors.warn( $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str41$continue_anyway, $str38$_A_is_not_a__A, tv_var, $sym39$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const94$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const94$isa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const94$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const94$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const94$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$50, UNPROVIDED );
                      while ( NIL != node_var_$50)
                      {
                        final SubLObject tt_node_var = node_var_$50;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const94$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const94$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$62;
                                        for( iteration_state_$62 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$62 ); iteration_state_$62 = dictionary_contents.do_dictionary_contents_next( iteration_state_$62 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$62 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject folder;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  folder = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, folder ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( folder,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( folder ) )
                                                    {
                                                      set.set_add( folder, folders );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject folder2 = NIL;
                                                folder2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( folder2 ) )
                                                    {
                                                      set.set_add( folder2, folders );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  folder2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$55, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$62 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$54, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt2 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
                                  mt2 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject folder;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                folder = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, folder ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( folder,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( folder, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( folder ) )
                                                  {
                                                    set.set_add( folder, folders );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$66 = sol;
                                              SubLObject folder2 = NIL;
                                              folder2 = csome_list_var_$66.first();
                                              while ( NIL != csome_list_var_$66)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( folder2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( folder2 ) )
                                                  {
                                                    set.set_add( folder2, folders );
                                                  }
                                                }
                                                csome_list_var_$66 = csome_list_var_$66.rest();
                                                folder2 = csome_list_var_$66.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$57, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$56, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$67;
                              final SubLObject new_list = cdolist_list_var_$67 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const94$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const94$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$67.first();
                              while ( NIL != cdolist_list_var_$67)
                              {
                                final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject folder3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      folder3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, folder3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( folder3,
                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( folder3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( folder3 ) )
                                        {
                                          set.set_add( folder3, folders );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject folder4 = NIL;
                                    folder4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( folder4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( folder4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( folder4 ) )
                                        {
                                          set.set_add( folder4, folders );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      folder4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$58, thread );
                                }
                                cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                                generating_fn = cdolist_list_var_$67.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$53, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$53, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const94$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$50 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                    {
                                      final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                        SubLObject iteration_state_$63;
                                        for( iteration_state_$63 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$63 ); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next( iteration_state_$63 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$63 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$61, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$63 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$60, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str46$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$68;
                              final SubLObject new_list2 = cdolist_list_var_$68 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$68.first();
                              while ( NIL != cdolist_list_var_$68)
                              {
                                final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str45$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$62, thread );
                                }
                                cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                                generating_fn2 = cdolist_list_var_$68.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$54, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$59, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$50 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$58, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$52, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$52, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str47$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$51, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$51, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$50, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$50, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$49, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$49, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$48, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return folders;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 12808L)
  public static SubLObject ke_interaction_folders()
  {
    SubLObject caching_state = $ke_interaction_folders_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym91$KE_INTERACTION_FOLDERS, $sym97$_KE_INTERACTION_FOLDERS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ke_interaction_folders_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13031L)
  public static SubLObject add_folder_title(final SubLObject argument, final SubLObject assertion)
  {
    return clear_ke_interaction_folders();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13161L)
  public static SubLObject remove_folder_title(final SubLObject argument, final SubLObject assertion)
  {
    return clear_ke_interaction_folders();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13296L)
  public static SubLObject ke_interaction_folderP(final SubLObject v_object)
  {
    if( NIL == forts.fort_p( v_object ) )
    {
      return NIL;
    }
    return set.set_memberP( v_object, ke_interaction_folders() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 13498L)
  public static SubLObject templates_in_folder(final SubLObject folder_id, SubLObject elmt, SubLObject include_subfoldersP)
  {
    if( elmt == UNPROVIDED )
    {
      elmt = $const83$InferencePSC;
    }
    if( include_subfoldersP == UNPROVIDED )
    {
      include_subfoldersP = T;
    }
    elmt = hlmt_czer.canonicalize_hlmt( elmt );
    assert NIL != forts.fort_p( folder_id ) : folder_id;
    assert NIL != hlmt.hlmt_p( elmt ) : elmt;
    SubLObject result = NIL;
    SubLObject to_do_items = ConsesLow.list( folder_id );
    while ( NIL != to_do_items)
    {
      final SubLObject first_to_do = to_do_items.first();
      final SubLObject children = backward.removal_ask_variable( $kw72$CHILDREN, ConsesLow.listS( $const30$folderContainsResource, first_to_do, $list100 ), elmt, UNPROVIDED, UNPROVIDED );
      to_do_items = to_do_items.rest();
      SubLObject cdolist_list_var = children;
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != include_subfoldersP && NIL != ke_interaction_folderP( child ) )
        {
          if( NIL == list_utilities.member_eqP( child, result ) )
          {
            to_do_items = ConsesLow.cons( child, to_do_items );
          }
        }
        else if( NIL != cycl_formula_templateP( child ) )
        {
          result = ConsesLow.cons( child, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 14785L)
  public static SubLObject xml_serialize_ke_interaction_folder(final SubLObject folder, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != ke_interaction_folder_p( folder ) : folder;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      try
      {
        final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str101$folder, NIL, NIL, NIL, $kw102$UNINITIALIZED );
          final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw102$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str103$folderId, NIL, NIL, NIL, $kw102$UNINITIALIZED );
                final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw102$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( ke_interaction_folder_id( folder ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$81, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$81, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$80, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str103$folderId );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
              }
            }
            if( NIL != ke_interaction_folder_p( ke_interaction_folder_parent( folder ) ) )
            {
              final SubLObject parent = ke_interaction_folder_parent( folder );
              try
              {
                final SubLObject _prev_bind_0_$83 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str104$parentFolderId, NIL, NIL, NIL, $kw102$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw102$UNINITIALIZED, thread );
                    cycml.cycml_serialize_term( ke_interaction_folder_id( parent ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$84, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$82, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$83, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str104$parentFolderId );
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$85, thread );
                }
              }
            }
            if( NIL != ke_interaction_folder_gloss( folder ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$86 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str105$folderTitle, NIL, NIL, NIL, $kw102$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$87 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw102$UNINITIALIZED, thread );
                    cycml.cycml_serialize_term( ke_interaction_folder_gloss( folder ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$87, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$83, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$86, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str105$folderTitle );
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$88, thread );
                }
              }
            }
            final SubLObject children = ke_interaction_folder_children( folder );
            SubLObject valid_children = NIL;
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != ke_interaction_folder_p( child ) )
              {
                valid_children = ConsesLow.cons( child, valid_children );
              }
              else if( NIL != formula_templates.valid_formula_template_p( child ) )
              {
                valid_children = ConsesLow.cons( child, valid_children );
              }
              else
              {
                Errors.warn( $str106$Cannot_interpret_resource__A__ski, child );
              }
              cdolist_list_var = cdolist_list_var.rest();
              child = cdolist_list_var.first();
            }
            if( NIL != valid_children )
            {
              try
              {
                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str107$children, NIL, NIL, NIL, $kw102$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw102$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var2 = Sequences.nreverse( valid_children );
                    SubLObject child2 = NIL;
                    child2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      if( NIL != ke_interaction_folder_p( child2 ) )
                      {
                        xml_serialize_ke_interaction_folder( child2, stream );
                      }
                      else if( NIL != formula_templates.formula_template_p( child2 ) )
                      {
                        formula_templates.xml_serialize_formula_template( child2, stream );
                      }
                      else
                      {
                        Errors.warn( $str108$Resource__A_slipped_through_but_c, child2 );
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      child2 = cdolist_list_var2.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$90, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$84, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$89, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str107$children );
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
                }
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$79, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$78, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values5 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str101$folder );
          Values.restoreValuesFromVector( _values5 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16414L)
  public static SubLObject get_all_query_libraries()
  {
    return Sort.sort( isa.all_fort_instances( $const5$KEInteractionFolder, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym109$STRING_ ), Symbols.symbol_function( $sym110$FORT_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16558L)
  public static SubLObject remove_task_query_libraries(final SubLObject qls)
  {
    return Sequences.remove_if( Symbols.symbol_function( $sym111$QUERY_LIBRARY_FOR_TASK_ ), qls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16659L)
  public static SubLObject remove_non_cyclist_query_libraries(final SubLObject qls)
  {
    return Sequences.remove_if( Symbols.symbol_function( $sym112$QUERY_LIBRARY_FOR_NON_CYLIST_ ), qls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16773L)
  public static SubLObject get_all_query_library_mts()
  {
    return Sort.sort( genl_mts.all_spec_mts( $const113$GKEFormulaTemplatesMt, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym109$STRING_ ), Symbols.symbol_function( $sym110$FORT_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 16956L)
  public static SubLObject query_library_for_taskP(final SubLObject ql)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym92$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const93$EverythingPSC, thread );
      result = makeBoolean( NIL != kb_mapping_utilities.some_pred_value( ql, $const114$kEInteractionFolderOfUserForTaskW, FOUR_INTEGER, UNPROVIDED ) || NIL != kb_mapping_utilities.some_pred_value( ql,
          $const115$kEInteractionFolderOfUserForTask, THREE_INTEGER, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 17243L)
  public static SubLObject query_library_for_non_cylistP(final SubLObject ql)
  {
    SubLObject users = kb_mapping_utilities.pred_values_in_any_mt( ql, $const114$kEInteractionFolderOfUserForTaskW, FOUR_INTEGER, ONE_INTEGER, UNPROVIDED );
    SubLObject cyclist_found = NIL;
    users = ConsesLow.nconc( users, kb_mapping_utilities.pred_values_in_any_mt( ql, $const115$kEInteractionFolderOfUserForTask, THREE_INTEGER, ONE_INTEGER, UNPROVIDED ) );
    users = ConsesLow.nconc( users, kb_mapping_utilities.pred_values_in_any_mt( ql, $const116$kEInteractionFolderOfUser, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
    users = Sequences.remove_duplicates( users, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == users )
    {
      return NIL;
    }
    if( NIL == cyclist_found )
    {
      SubLObject csome_list_var = users;
      SubLObject user = NIL;
      user = csome_list_var.first();
      while ( NIL == cyclist_found && NIL != csome_list_var)
      {
        if( NIL != kb_accessors.cyclistP( user ) )
        {
          cyclist_found = T;
        }
        csome_list_var = csome_list_var.rest();
        user = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == cyclist_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 17897L)
  public static SubLObject ke_interact_obtain_ordering_info(final SubLObject folder_id, final SubLObject elmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ordering_info = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( elmt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( folder_id, $const117$higherPriorityInFolder, ONE_INTEGER, $kw23$TRUE );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ordering_info = ConsesLow.cons( ConsesLow.list( assertions_high.gaf_arg2( assertion ), assertions_high.gaf_arg3( assertion ) ), ordering_info );
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering( ordering_info );
    final SubLObject low_to_high = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( high_to_low, low_to_high );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 20545L)
  public static SubLObject ke_interact_apply_ordering_on_children(final SubLObject folder, final SubLObject elmt, final SubLObject ordering)
  {
    SubLObject high_to_low = NIL;
    SubLObject low_to_high = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( ordering, ordering, $list118 );
    high_to_low = ordering.first();
    SubLObject current = ordering.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, ordering, $list118 );
    low_to_high = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject sorted_ids = formula_templates.apply_prioritizing_ordering_to_kb_objects( high_to_low, low_to_high );
      final SubLObject children = ke_interaction_folder_children( folder );
      final SubLObject sorted = ConsesLow.make_list( Sequences.length( sorted_ids ), UNPROVIDED );
      SubLObject unsorted_tail = NIL;
      if( NIL == sorted_ids )
      {
        return folder;
      }
      SubLObject cdolist_list_var = children;
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject child_object = Sequences.find( ke_interaction_folder_object_id( child ), sorted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == child_object )
        {
          unsorted_tail = ConsesLow.cons( child, unsorted_tail );
        }
        else
        {
          final SubLObject spot = Sequences.position( ke_interaction_folder_object_id( child ), sorted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          ConsesLow.set_nth( spot, sorted, child );
        }
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
      _csetf_ke_interaction_folder_children( folder, Sequences.delete_if( Symbols.symbol_function( $sym119$NULL ), Sequences.cconcatenate( sorted, Sort.sort( unsorted_tail, Symbols.symbol_function( $sym120$_ ), Symbols
          .symbol_function( $sym121$KE_INTERACTION_FOLDER_SORT_KEY ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( ordering, $list118 );
    }
    return folder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 21790L)
  public static SubLObject ke_interaction_folder_sort_key(final SubLObject folder)
  {
    return misc_kb_utilities.get_term_id( ke_interaction_folder_object_id( folder ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-interaction-folder.lisp", position = 21911L)
  public static SubLObject ke_interaction_folder_object_id(final SubLObject v_object)
  {
    return ( NIL != ke_interaction_folder_p( v_object ) ) ? ke_interaction_folder_id( v_object )
        : ( ( NIL != formula_templates.formula_template_p( v_object ) ) ? formula_templates.formula_template_id( v_object ) : NIL );
  }

  public static SubLObject declare_ke_interaction_folder_file()
  {
    SubLFiles.declareFunction( me, "create_new_subfolder", "CREATE-NEW-SUBFOLDER", 1, 1, false );
    SubLFiles.declareFunction( me, "relexify_ke_interaction_folder_constant", "RELEXIFY-KE-INTERACTION-FOLDER-CONSTANT", 2, 1, false );
    SubLFiles.declareFunction( me, "lexify_ke_interaction_folder_constant", "LEXIFY-KE-INTERACTION-FOLDER-CONSTANT", 3, 0, false );
    SubLFiles.declareFunction( me, "move_ke_interaction_resource", "MOVE-KE-INTERACTION-RESOURCE", 3, 0, false );
    SubLFiles.declareFunction( me, "add_ke_interaction_resource_to_folder", "ADD-KE-INTERACTION-RESOURCE-TO-FOLDER", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_ke_interaction_resource_from_folder", "REMOVE-KE-INTERACTION-RESOURCE-FROM-FOLDER", 2, 0, false );
    SubLFiles.declareFunction( me, "default_mt_for_ke_interaction_folder", "DEFAULT-MT-FOR-KE-INTERACTION-FOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_print_function_trampoline", "KE-INTERACTION-FOLDER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_p", "KE-INTERACTION-FOLDER-P", 1, 0, false );
    new $ke_interaction_folder_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ke_interaction_folder_id", "KE-INTERACTION-FOLDER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_mt", "KE-INTERACTION-FOLDER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_gloss", "KE-INTERACTION-FOLDER-GLOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_parent", "KE-INTERACTION-FOLDER-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_children", "KE-INTERACTION-FOLDER-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ke_interaction_folder_id", "_CSETF-KE-INTERACTION-FOLDER-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ke_interaction_folder_mt", "_CSETF-KE-INTERACTION-FOLDER-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ke_interaction_folder_gloss", "_CSETF-KE-INTERACTION-FOLDER-GLOSS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ke_interaction_folder_parent", "_CSETF-KE-INTERACTION-FOLDER-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ke_interaction_folder_children", "_CSETF-KE-INTERACTION-FOLDER-CHILDREN", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ke_interaction_folder", "MAKE-KE-INTERACTION-FOLDER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_ke_interaction_folder", "VISIT-DEFSTRUCT-KE-INTERACTION-FOLDER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_ke_interaction_folder_method", "VISIT-DEFSTRUCT-OBJECT-KE-INTERACTION-FOLDER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_ke_interaction_folder", "PRINT-KE-INTERACTION-FOLDER", 3, 0, false );
    SubLFiles.declareFunction( me, "new_ke_interaction_folder", "NEW-KE-INTERACTION-FOLDER", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_load_query_library", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY", 2, 1, false );
    SubLFiles.declareFunction( me, "update_folder_query_params_using_defaults", "UPDATE-FOLDER-QUERY-PARAMS-USING-DEFAULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_load_query_library_skeleton", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-SKELETON", 2, 1, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_get_gloss_for_folder_id", "KE-INTERACTION-FOLDER-GET-GLOSS-FOR-FOLDER-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_load_one_level", "KE-INTERACTION-FOLDER-LOAD-ONE-LEVEL", 2, 1, false );
    SubLFiles.declareFunction( me, "get_ke_interaction_folder_contents_from_kb", "GET-KE-INTERACTION-FOLDER-CONTENTS-FROM-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_formula_templateP", "CYCL-FORMULA-TEMPLATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ke_interaction_folders", "CLEAR-KE-INTERACTION-FOLDERS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ke_interaction_folders", "REMOVE-KE-INTERACTION-FOLDERS", 0, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folders_internal", "KE-INTERACTION-FOLDERS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folders", "KE-INTERACTION-FOLDERS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_folder_title", "ADD-FOLDER-TITLE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_folder_title", "REMOVE-FOLDER-TITLE", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folderP", "KE-INTERACTION-FOLDER?", 1, 0, false );
    SubLFiles.declareFunction( me, "templates_in_folder", "TEMPLATES-IN-FOLDER", 1, 2, false );
    SubLFiles.declareFunction( me, "xml_serialize_ke_interaction_folder", "XML-SERIALIZE-KE-INTERACTION-FOLDER", 1, 1, false );
    SubLFiles.declareFunction( me, "get_all_query_libraries", "GET-ALL-QUERY-LIBRARIES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_task_query_libraries", "REMOVE-TASK-QUERY-LIBRARIES", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_non_cyclist_query_libraries", "REMOVE-NON-CYCLIST-QUERY-LIBRARIES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_query_library_mts", "GET-ALL-QUERY-LIBRARY-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "query_library_for_taskP", "QUERY-LIBRARY-FOR-TASK?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_for_non_cylistP", "QUERY-LIBRARY-FOR-NON-CYLIST?", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interact_obtain_ordering_info", "KE-INTERACT-OBTAIN-ORDERING-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_interact_apply_ordering_on_children", "KE-INTERACT-APPLY-ORDERING-ON-CHILDREN", 3, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_sort_key", "KE-INTERACTION-FOLDER-SORT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_interaction_folder_object_id", "KE-INTERACTION-FOLDER-OBJECT-ID", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_ke_interaction_folder_file()
  {
    $default_new_ke_interaction_folder_name$ = SubLFiles.deflexical( "*DEFAULT-NEW-KE-INTERACTION-FOLDER-NAME*", $str0$New_Folder );
    $dtp_ke_interaction_folder$ = SubLFiles.defconstant( "*DTP-KE-INTERACTION-FOLDER*", $sym49$KE_INTERACTION_FOLDER );
    $ke_interaction_folders_caching_state$ = SubLFiles.deflexical( "*KE-INTERACTION-FOLDERS-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_ke_interaction_folder_file()
  {
    access_macros.register_external_symbol( $sym1$CREATE_NEW_SUBFOLDER );
    access_macros.register_external_symbol( $sym18$RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT );
    access_macros.register_external_symbol( $sym24$MOVE_KE_INTERACTION_RESOURCE );
    access_macros.register_external_symbol( $sym25$ADD_KE_INTERACTION_RESOURCE_TO_FOLDER );
    access_macros.register_external_symbol( $sym31$REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_ke_interaction_folder$.getGlobalValue(), Symbols.symbol_function( $sym56$KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list57 );
    Structures.def_csetf( $sym58$KE_INTERACTION_FOLDER_ID, $sym59$_CSETF_KE_INTERACTION_FOLDER_ID );
    Structures.def_csetf( $sym60$KE_INTERACTION_FOLDER_MT, $sym61$_CSETF_KE_INTERACTION_FOLDER_MT );
    Structures.def_csetf( $sym62$KE_INTERACTION_FOLDER_GLOSS, $sym63$_CSETF_KE_INTERACTION_FOLDER_GLOSS );
    Structures.def_csetf( $sym64$KE_INTERACTION_FOLDER_PARENT, $sym65$_CSETF_KE_INTERACTION_FOLDER_PARENT );
    Structures.def_csetf( $sym66$KE_INTERACTION_FOLDER_CHILDREN, $sym67$_CSETF_KE_INTERACTION_FOLDER_CHILDREN );
    Equality.identity( $sym49$KE_INTERACTION_FOLDER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ke_interaction_folder$.getGlobalValue(), Symbols.symbol_function(
        $sym78$VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD ) );
    memoization_state.note_globally_cached_function( $sym91$KE_INTERACTION_FOLDERS );
    utilities_macros.register_kb_function( $sym98$ADD_FOLDER_TITLE );
    utilities_macros.register_kb_function( $sym99$REMOVE_FOLDER_TITLE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ke_interaction_folder_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ke_interaction_folder_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ke_interaction_folder_file();
  }
  static
  {
    me = new ke_interaction_folder();
    $default_new_ke_interaction_folder_name$ = null;
    $dtp_ke_interaction_folder$ = null;
    $ke_interaction_folders_caching_state$ = null;
    $str0$New_Folder = makeString( "New Folder" );
    $sym1$CREATE_NEW_SUBFOLDER = makeSymbol( "CREATE-NEW-SUBFOLDER" );
    $const2$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $sym3$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym4$POSSIBLY_HLMT_P = makeSymbol( "POSSIBLY-HLMT-P" );
    $const5$KEInteractionFolder = constant_handles.reader_make_constant_shell( makeString( "KEInteractionFolder" ) );
    $str6$_S_is_not_known_to_be_a_KE_intera = makeString( "~S is not known to be a KE interaction folder in ~S" );
    $str7$UserCreatedFolder = makeString( "UserCreatedFolder" );
    $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw9$X = makeKeyword( "X" );
    $const10$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const11$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const12$subFolders = constant_handles.reader_make_constant_shell( makeString( "subFolders" ) );
    $list13 = ConsesLow.list( makeSymbol( "?FOLDER" ) );
    $list14 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "folderTitle" ) ), makeSymbol( "?FOLDER" ), makeKeyword( "X" ) ) );
    $kw15$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw16$MINIMAL = makeKeyword( "MINIMAL" );
    $str17$_ = makeString( "-" );
    $sym18$RELEXIFY_KE_INTERACTION_FOLDER_CONSTANT = makeSymbol( "RELEXIFY-KE-INTERACTION-FOLDER-CONSTANT" );
    $sym19$FORT_P = makeSymbol( "FORT-P" );
    $sym20$STRINGP = makeSymbol( "STRINGP" );
    $const21$folderTitle = constant_handles.reader_make_constant_shell( makeString( "folderTitle" ) );
    $kw22$GAF = makeKeyword( "GAF" );
    $kw23$TRUE = makeKeyword( "TRUE" );
    $sym24$MOVE_KE_INTERACTION_RESOURCE = makeSymbol( "MOVE-KE-INTERACTION-RESOURCE" );
    $sym25$ADD_KE_INTERACTION_RESOURCE_TO_FOLDER = makeSymbol( "ADD-KE-INTERACTION-RESOURCE-TO-FOLDER" );
    $const26$KEInteractionResource = constant_handles.reader_make_constant_shell( makeString( "KEInteractionResource" ) );
    $str27$_S_is_not_known_to_be_a_KE_intera = makeString( "~S is not known to be a KE interaction resource in ~S" );
    $const28$FormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "FormulaTemplate" ) );
    $const29$folderContainsTemplate = constant_handles.reader_make_constant_shell( makeString( "folderContainsTemplate" ) );
    $const30$folderContainsResource = constant_handles.reader_make_constant_shell( makeString( "folderContainsResource" ) );
    $sym31$REMOVE_KE_INTERACTION_RESOURCE_FROM_FOLDER = makeSymbol( "REMOVE-KE-INTERACTION-RESOURCE-FROM-FOLDER" );
    $str32$_S_is_not_known_to_be_in__S_in__S = makeString( "~S is not known to be in ~S in ~S" );
    $kw33$DEPTH = makeKeyword( "DEPTH" );
    $kw34$STACK = makeKeyword( "STACK" );
    $kw35$QUEUE = makeKeyword( "QUEUE" );
    $sym36$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw37$ERROR = makeKeyword( "ERROR" );
    $str38$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym39$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw40$CERROR = makeKeyword( "CERROR" );
    $str41$continue_anyway = makeString( "continue anyway" );
    $kw42$WARN = makeKeyword( "WARN" );
    $str43$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const44$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str45$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str46$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str47$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const48$KEInteractionResourceTestMt = constant_handles.reader_make_constant_shell( makeString( "KEInteractionResourceTestMt" ) );
    $sym49$KE_INTERACTION_FOLDER = makeSymbol( "KE-INTERACTION-FOLDER" );
    $sym50$KE_INTERACTION_FOLDER_P = makeSymbol( "KE-INTERACTION-FOLDER-P" );
    $list51 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "MT" ), makeSymbol( "GLOSS" ), makeSymbol( "PARENT" ), makeSymbol( "CHILDREN" ) );
    $list52 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "MT" ), makeKeyword( "GLOSS" ), makeKeyword( "PARENT" ), makeKeyword( "CHILDREN" ) );
    $list53 = ConsesLow.list( makeSymbol( "KE-INTERACTION-FOLDER-ID" ), makeSymbol( "KE-INTERACTION-FOLDER-MT" ), makeSymbol( "KE-INTERACTION-FOLDER-GLOSS" ), makeSymbol( "KE-INTERACTION-FOLDER-PARENT" ), makeSymbol(
        "KE-INTERACTION-FOLDER-CHILDREN" ) );
    $list54 = ConsesLow.list( makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-ID" ), makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-MT" ), makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-GLOSS" ), makeSymbol(
        "_CSETF-KE-INTERACTION-FOLDER-PARENT" ), makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-CHILDREN" ) );
    $sym55$PRINT_KE_INTERACTION_FOLDER = makeSymbol( "PRINT-KE-INTERACTION-FOLDER" );
    $sym56$KE_INTERACTION_FOLDER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KE-INTERACTION-FOLDER-PRINT-FUNCTION-TRAMPOLINE" );
    $list57 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KE-INTERACTION-FOLDER-P" ) );
    $sym58$KE_INTERACTION_FOLDER_ID = makeSymbol( "KE-INTERACTION-FOLDER-ID" );
    $sym59$_CSETF_KE_INTERACTION_FOLDER_ID = makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-ID" );
    $sym60$KE_INTERACTION_FOLDER_MT = makeSymbol( "KE-INTERACTION-FOLDER-MT" );
    $sym61$_CSETF_KE_INTERACTION_FOLDER_MT = makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-MT" );
    $sym62$KE_INTERACTION_FOLDER_GLOSS = makeSymbol( "KE-INTERACTION-FOLDER-GLOSS" );
    $sym63$_CSETF_KE_INTERACTION_FOLDER_GLOSS = makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-GLOSS" );
    $sym64$KE_INTERACTION_FOLDER_PARENT = makeSymbol( "KE-INTERACTION-FOLDER-PARENT" );
    $sym65$_CSETF_KE_INTERACTION_FOLDER_PARENT = makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-PARENT" );
    $sym66$KE_INTERACTION_FOLDER_CHILDREN = makeSymbol( "KE-INTERACTION-FOLDER-CHILDREN" );
    $sym67$_CSETF_KE_INTERACTION_FOLDER_CHILDREN = makeSymbol( "_CSETF-KE-INTERACTION-FOLDER-CHILDREN" );
    $kw68$ID = makeKeyword( "ID" );
    $kw69$MT = makeKeyword( "MT" );
    $kw70$GLOSS = makeKeyword( "GLOSS" );
    $kw71$PARENT = makeKeyword( "PARENT" );
    $kw72$CHILDREN = makeKeyword( "CHILDREN" );
    $str73$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw74$BEGIN = makeKeyword( "BEGIN" );
    $sym75$MAKE_KE_INTERACTION_FOLDER = makeSymbol( "MAKE-KE-INTERACTION-FOLDER" );
    $kw76$SLOT = makeKeyword( "SLOT" );
    $kw77$END = makeKeyword( "END" );
    $sym78$VISIT_DEFSTRUCT_OBJECT_KE_INTERACTION_FOLDER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KE-INTERACTION-FOLDER-METHOD" );
    $str79$_A_in_mt___A__ = makeString( "~A in mt: ~A~%" );
    $sym80$HLMT_P = makeSymbol( "HLMT-P" );
    $kw81$TITLE = makeKeyword( "TITLE" );
    $list82 = ConsesLow.list( makeKeyword( "TITLE" ) );
    $const83$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym84$_CHILD = makeSymbol( "?CHILD" );
    $list85 = ConsesLow.list( makeSymbol( "ELMT" ) );
    $str86$Cannot_handle_resource__A_at_this = makeString( "Cannot handle resource ~A at this point in time -- skipping." );
    $kw87$ANY = makeKeyword( "ANY" );
    $sym88$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str89$Cannot_load_formula_template__A__ = makeString( "Cannot load formula template ~A -- skipping.~%~S" );
    $const90$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TemplateFromTestQueryFn" ) );
    $sym91$KE_INTERACTION_FOLDERS = makeSymbol( "KE-INTERACTION-FOLDERS" );
    $sym92$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const93$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const94$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw95$BREADTH = makeKeyword( "BREADTH" );
    $list96 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $sym97$_KE_INTERACTION_FOLDERS_CACHING_STATE_ = makeSymbol( "*KE-INTERACTION-FOLDERS-CACHING-STATE*" );
    $sym98$ADD_FOLDER_TITLE = makeSymbol( "ADD-FOLDER-TITLE" );
    $sym99$REMOVE_FOLDER_TITLE = makeSymbol( "REMOVE-FOLDER-TITLE" );
    $list100 = ConsesLow.list( makeKeyword( "CHILDREN" ) );
    $str101$folder = makeString( "folder" );
    $kw102$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str103$folderId = makeString( "folderId" );
    $str104$parentFolderId = makeString( "parentFolderId" );
    $str105$folderTitle = makeString( "folderTitle" );
    $str106$Cannot_interpret_resource__A__ski = makeString( "Cannot interpret resource ~A, skipping." );
    $str107$children = makeString( "children" );
    $str108$Resource__A_slipped_through_but_c = makeString( "Resource ~A slipped through but cannot be interpreted, skipping." );
    $sym109$STRING_ = makeSymbol( "STRING<" );
    $sym110$FORT_NAME = makeSymbol( "FORT-NAME" );
    $sym111$QUERY_LIBRARY_FOR_TASK_ = makeSymbol( "QUERY-LIBRARY-FOR-TASK?" );
    $sym112$QUERY_LIBRARY_FOR_NON_CYLIST_ = makeSymbol( "QUERY-LIBRARY-FOR-NON-CYLIST?" );
    $const113$GKEFormulaTemplatesMt = constant_handles.reader_make_constant_shell( makeString( "GKEFormulaTemplatesMt" ) );
    $const114$kEInteractionFolderOfUserForTaskW = constant_handles.reader_make_constant_shell( makeString( "kEInteractionFolderOfUserForTaskWRTConcept" ) );
    $const115$kEInteractionFolderOfUserForTask = constant_handles.reader_make_constant_shell( makeString( "kEInteractionFolderOfUserForTask" ) );
    $const116$kEInteractionFolderOfUser = constant_handles.reader_make_constant_shell( makeString( "kEInteractionFolderOfUser" ) );
    $const117$higherPriorityInFolder = constant_handles.reader_make_constant_shell( makeString( "higherPriorityInFolder" ) );
    $list118 = ConsesLow.list( makeSymbol( "HIGH-TO-LOW" ), makeSymbol( "LOW-TO-HIGH" ) );
    $sym119$NULL = makeSymbol( "NULL" );
    $sym120$_ = makeSymbol( "<" );
    $sym121$KE_INTERACTION_FOLDER_SORT_KEY = makeSymbol( "KE-INTERACTION-FOLDER-SORT-KEY" );
  }

  public static final class $ke_interaction_folder_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $mt;
    public SubLObject $gloss;
    public SubLObject $parent;
    public SubLObject $children;
    private static final SubLStructDeclNative structDecl;

    public $ke_interaction_folder_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$gloss = CommonSymbols.NIL;
      this.$parent = CommonSymbols.NIL;
      this.$children = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $ke_interaction_folder_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$gloss;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$parent;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$children;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$gloss = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$parent = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$children = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $ke_interaction_folder_native.class, $sym49$KE_INTERACTION_FOLDER, $sym50$KE_INTERACTION_FOLDER_P, $list51, $list52, new String[] { "$id", "$mt", "$gloss", "$parent",
        "$children"
      }, $list53, $list54, $sym55$PRINT_KE_INTERACTION_FOLDER );
    }
  }

  public static final class $ke_interaction_folder_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $ke_interaction_folder_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KE-INTERACTION-FOLDER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ke_interaction_folder_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2300 ms
 * 
 */