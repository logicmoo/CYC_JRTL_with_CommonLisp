package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.argumentation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class partitions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.partitions";
  public static final String myFingerPrint = "0fd71e1d71621c5aae2a6f638e89b5c2a2afb68719997c1ec4f9fc32dbf1d0c7";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1093L)
  private static SubLSymbol $partition_scope_completely_specifiedP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1687L)
  public static SubLSymbol $reset_sbhl_links$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3163L)
  private static SubLSymbol $partition_scope_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6196L)
  public static SubLSymbol $scope_partition_assertion_selective_test$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6676L)
  public static SubLSymbol $assertion_partition_fort_filter_function$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12335L)
  private static SubLSymbol $partition_constant_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12632L)
  private static SubLSymbol $partition_nart_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12691L)
  private static SubLSymbol $partition_assertion_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12750L)
  private static SubLSymbol $partition_meta_assertion_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12809L)
  private static SubLSymbol $partition_kb_hl_support_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12868L)
  private static SubLSymbol $partition_argument_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12927L)
  private static SubLSymbol $partition_max_nart_complexity$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12987L)
  private static SubLSymbol $partition_max_term_order$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13046L)
  private static SubLSymbol $partition_kb_hl_support_orders$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13110L)
  private static SubLSymbol $partition_max_kb_hl_support_order$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17286L)
  public static SubLSymbol $mark_partition_object_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26607L)
  public static SubLSymbol $current_archive_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35521L)
  private static SubLSymbol $dump_partition_format$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36082L)
  private static SubLSymbol $backwards_compatibility_pairs$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36340L)
  private static SubLSymbol $partition_section_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36400L)
  private static SubLSymbol $partition_asserted_argument_type_flag$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36473L)
  private static SubLSymbol $partition_special_objects$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48325L)
  private static SubLSymbol $partition_entire_kb_loadP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49519L)
  private static SubLSymbol $load_partition_invalid_missing_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53004L)
  private static SubLSymbol $load_partition_max_nart_complexity$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53071L)
  private static SubLSymbol $load_partition_max_term_order$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53137L)
  private static SubLSymbol $load_partition_max_kb_hl_support_order$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53203L)
  public static SubLSymbol $trace_partition_link_errors$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67151L)
  public static SubLSymbol $load_partition_weaken_hl_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68074L)
  private static SubLSymbol $preseeded_partition_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68379L)
  private static SubLSymbol $load_partition_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68690L)
  private static SubLSymbol $load_partition_scope_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68750L)
  private static SubLSymbol $load_partition_missing_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78835L)
  private static SubLSymbol $load_partition_narts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79153L)
  private static SubLSymbol $load_partition_scope_narts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79209L)
  private static SubLSymbol $load_partition_missing_narts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81883L)
  private static SubLSymbol $load_partition_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82229L)
  private static SubLSymbol $load_partition_missing_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84937L)
  private static SubLSymbol $load_partition_kb_hl_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85103L)
  private static SubLSymbol $load_partition_scope_kb_hl_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85168L)
  private static SubLSymbol $load_partition_missing_kb_hl_supports$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$KEYWORDP;
  private static final SubLSymbol $kw2$ONTOLOGY;
  private static final SubLSymbol $kw3$QUOTED_ONTOLOGY;
  private static final SubLSymbol $kw4$TERM;
  private static final SubLSymbol $kw5$DEFINITION;
  private static final SubLSymbol $kw6$FUNCTION;
  private static final SubLList $list7;
  private static final SubLString $str8$Unknown_scope_partition_function_;
  private static final SubLSymbol $kw9$ESTIMATED_ASSERTION_COUNT;
  private static final SubLSymbol $kw10$SCOPE_COMPLETELY_SPECIFIED_;
  private static final SubLString $str11$Unable_to_scope_partition_via__S_;
  private static final SubLInteger $int12$100;
  private static final SubLString $str13$Non_scope_object__A_not_allowed_;
  private static final SubLSymbol $sym14$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const15$EverythingPSC;
  private static final SubLSymbol $kw16$GAF;
  private static final SubLObject $const17$ResearchCycDefinitionalPredicate;
  private static final SubLSymbol $sym18$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym19$SCOPE_PARTITION_ASSERTION;
  private static final SubLSymbol $sym20$SCOPE_PARTITION_TERM;
  private static final SubLSymbol $sym21$FORT_P;
  private static final SubLString $str22$marking_partition_content;
  private static final SubLInteger $int23$256;
  private static final SubLSymbol $sym24$MARK_PARTITION_OBJECT_CONS_METHOD;
  private static final SubLSymbol $sym25$MARK_PARTITION_OBJECT_CONSTANT_METHOD;
  private static final SubLSymbol $sym26$MARK_PARTITION_OBJECT_NART_METHOD;
  private static final SubLSymbol $sym27$MARK_PARTITION_OBJECT_ASSERTION_METHOD;
  private static final SubLSymbol $sym28$MARK_PARTITION_OBJECT_DEDUCTION_METHOD;
  private static final SubLSymbol $sym29$MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD;
  private static final SubLSymbol $sym30$BELIEF_P;
  private static final SubLString $str31$_______S_constants;
  private static final SubLString $str32$___A_S;
  private static final SubLString $str33$___;
  private static final SubLString $str34$___;
  private static final SubLString $str35$______Max_NART_level____S;
  private static final SubLString $str36$______level__S_NARTs;
  private static final SubLString $str37$______Max_term_order___S;
  private static final SubLString $str38$_______S_assertions;
  private static final SubLString $str39$_______S_meta_assertions;
  private static final SubLString $str40$______order__S_meta_assertions;
  private static final SubLString $str41$_______S_arguments;
  private static final SubLString $str42$Deduction______S;
  private static final SubLString $str43$Beliefs_for____S;
  private static final SubLString $str44$Unknown________S;
  private static final SubLString $str45$______Max_KB_HL_support_level____;
  private static final SubLString $str46$_______S_KB_HL_supports;
  private static final SubLString $str47$______level__S_KB_HL_supports;
  private static final SubLString $str48$removing_partition_assertions;
  private static final SubLString $str49$removing_partition_NARTs;
  private static final SubLString $str50$removing_partition_constants;
  private static final SubLList $list51;
  private static final SubLString $str52$lisp;
  private static final SubLSymbol $sym53$ASSERTION_P;
  private static final SubLString $str54$_____FI_ASSERT___S__S__S__S_;
  private static final SubLString $str55$_____FI_CREATE__a_;
  private static final SubLSymbol $sym56$ARCHIVE_ASSERTION_IF_LOCAL;
  private static final SubLSymbol $kw57$APPEND;
  private static final SubLString $str58$Unable_to_open__S;
  private static final SubLString $str59$______Archive_saved_at__s____;
  private static final SubLSymbol $sym60$STRINGP;
  private static final SubLSymbol $kw61$OUTPUT;
  private static final SubLSymbol $sym62$CFASL_ENCODABLE_STREAM_P;
  private static final SubLSymbol $kw63$UNINITIALIZED;
  private static final SubLSymbol $sym64$DEDUCTION_P;
  private static final SubLSymbol $sym65$_;
  private static final SubLSymbol $sym66$CONSTANT_INTERNAL_ID;
  private static final SubLSymbol $sym67$NART_ID;
  private static final SubLSymbol $sym68$TERM_FUNCTIONAL_COMPLEXITY;
  private static final SubLSymbol $sym69$TERM_ORDER;
  private static final SubLSymbol $sym70$DEDUCTION_ID;
  private static final SubLSymbol $sym71$KB_HL_SUPPORT_ID;
  private static final SubLSymbol $kw72$NEW_CONSTANTS;
  private static final SubLSymbol $kw73$NEW_NARTS;
  private static final SubLSymbol $kw74$NEW_ASSERTIONS;
  private static final SubLSymbol $kw75$NEW_DEDUCTIONS;
  private static final SubLString $str76$2_2;
  private static final SubLList $list77;
  private static final SubLSymbol $kw78$SECTION;
  private static final SubLSymbol $kw79$ASSERTED;
  private static final SubLList $list80;
  private static final SubLFloat $float81$0_1;
  private static final SubLString $str82$_large__partition_constant_shells;
  private static final SubLSymbol $kw83$SKIP;
  private static final SubLString $str84$partition_constant_shells;
  private static final SubLString $str85$partition_level_;
  private static final SubLString $str86$_NART_shells;
  private static final SubLString $str87$_large__;
  private static final SubLString $str88$_large__partition_assertions;
  private static final SubLString $str89$partition_assertions;
  private static final SubLString $str90$partition_order_;
  private static final SubLString $str91$_meta_assertions;
  private static final SubLString $str92$_KB_HL_supports;
  private static final SubLString $str93$_large__partition_beliefs;
  private static final SubLString $str94$_large__partition_deductions;
  private static final SubLString $str95$_large__partition_bookkeeping_inf;
  private static final SubLString $str96$partition_arguments;
  private static final SubLString $str97$Unknown_argument_object__S;
  private static final SubLString $str98$Unable_to_dump_belief__S;
  private static final SubLList $list99;
  private static final SubLString $str100$cleaning_up_after_partition_load_;
  private static final SubLObject $const101$isa;
  private static final SubLSymbol $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_;
  private static final SubLString $str103$partition_load_KB_cleanup_removed;
  private static final SubLString $str104$__A_constants__;
  private static final SubLString $str105$__A_NARTs__;
  private static final SubLString $str106$__A_assertions__;
  private static final SubLSymbol $kw107$INPUT;
  private static final SubLSymbol $sym108$PARTITION_FIND_CONSTANT_BY_ID;
  private static final SubLSymbol $sym109$PARTITION_FIND_NART_BY_ID;
  private static final SubLSymbol $sym110$PARTITION_FIND_ASSERTION_BY_ID;
  private static final SubLSymbol $sym111$PARTITION_FIND_KB_HL_SUPPORT_BY_ID;
  private static final SubLSymbol $sym112$ATOM;
  private static final SubLSymbol $sym113$INTEGERP;
  private static final SubLString $str114$partition_format_is__A__not__A__a;
  private static final SubLSymbol $kw115$EOF;
  private static final SubLString $str116$malformed_partition_file;
  private static final SubLString $str117$loading_partition_constant_shells;
  private static final SubLSymbol $sym118$GUID_P;
  private static final SubLString $str119$loading_partition_level_;
  private static final SubLString $str120$_narts;
  private static final SubLSymbol $sym121$POSSIBLY_NAUT_P;
  private static final SubLString $str122$loading_partition_assertions;
  private static final SubLString $str123$loading_partition_order_;
  private static final SubLString $str124$_meta_assertions;
  private static final SubLString $str125$Skipping_assertion_with_bad_id__A;
  private static final SubLString $str126$Skipping_assertion_with_bad_cnf__;
  private static final SubLString $str127$Skipping_assertion_with_bad_mt__S;
  private static final SubLString $str128$Skipping_assertion_with_bad_direc;
  private static final SubLString $str129$Skipping_assertion_with_bad_vname;
  private static final SubLSymbol $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym133$CSETQ;
  private static final SubLString $str134$_A;
  private static final SubLSymbol $kw135$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym136$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym137$HL_SUPPORT_P;
  private static final SubLSymbol $sym138$HL_JUSTIFICATION_P;
  private static final SubLString $str139$loading_partition_arguments;
  private static final SubLString $str140$Skipping_asserted_argument_for_ba;
  private static final SubLString $str141$Skipping_asserted_argument_for_as;
  private static final SubLString $str142$Skipping_asserted_argument_for_as;
  private static final SubLString $str143$Skipping_deduction__id__A__with_b;
  private static final SubLString $str144$Skipping_deduction__id__A__with_b;
  private static final SubLString $str145$Skipping_deduction__id__A__with_b;
  private static final SubLSymbol $sym146$CNF_P;
  private static final SubLSymbol $sym147$POSSIBLY_HLMT_P;
  private static final SubLSymbol $sym148$EL_STRENGTH_P;
  private static final SubLSymbol $sym149$DIRECTION_P;
  private static final SubLSymbol $sym150$LISTP;
  private static final SubLString $str151$Did_not_find_constant__D_;
  private static final SubLSymbol $sym152$CONSTANT_P;
  private static final SubLSymbol $sym153$_EXIT;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLSymbol $kw156$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw157$EXPECTED_TOTAL;
  private static final SubLSymbol $kw158$SCOPED_MAP;
  private static final SubLSymbol $sym159$CLET;
  private static final SubLList $list160;
  private static final SubLSymbol $sym161$_LOAD_PARTITION_CONSTANTS_;
  private static final SubLSymbol $sym162$NEW_LOAD_PARTITION_CONSTANTS_STORE;
  private static final SubLSymbol $sym163$_LOAD_PARTITION_SCOPE_CONSTANTS_;
  private static final SubLSymbol $sym164$FWHEN;
  private static final SubLSymbol $sym165$HASH_TABLE_P;
  private static final SubLSymbol $sym166$NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE;
  private static final SubLSymbol $sym167$PRESEED_LOAD_PARTITION_CONSTANTS_STORE;
  private static final SubLString $str168$NAME_change_for__S___new_name_is_;
  private static final SubLString $str169$installing_ID__S_for__S;
  private static final SubLString $str170$NAME_clash_for__S___renaming_to__;
  private static final SubLString $str171$Constant_with_NAME__S_and_ID__S_m;
  private static final SubLString $str172$Non_scope_NART__S_not_found_;
  private static final SubLString $str173$Did_not_find_NART__D_;
  private static final SubLString $str174$Non_scope_assertion__S___S__not_f;
  private static final SubLString $str175$Did_not_find_assertion__D_;
  private static final SubLString $str176$Non_scope_KB_HL_support__S_not_fo;
  private static final SubLString $str177$Did_not_find_KB_HL_support__D;
  private static final SubLList $list178;
  private static final SubLString $str179$Could_not_assert__a_in__a_with_st;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1580L)
  public static SubLObject partition_scope_completely_specifiedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $partition_scope_completely_specifiedP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1961L)
  public static SubLObject scope_partition(final SubLObject partition)
  {
    clear_partition_scope();
    SubLObject cdolist_list_var = partition;
    SubLObject partition_item = NIL;
    partition_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = partition_item;
      SubLObject method = NIL;
      SubLObject term_spec = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      method = current.first();
      current = ( term_spec = current.rest() );
      assert NIL != Types.keywordp( method ) : method;
      final SubLObject pcase_var = method;
      if( pcase_var.eql( $kw2$ONTOLOGY ) )
      {
        scope_partition_ontology( partition_term_spec_to_term( term_spec ) );
      }
      else if( pcase_var.eql( $kw3$QUOTED_ONTOLOGY ) )
      {
        scope_partition_quoted_ontology( partition_term_spec_to_term( term_spec ) );
      }
      else if( pcase_var.eql( $kw4$TERM ) )
      {
        scope_partition_term( partition_term_spec_to_term( term_spec ) );
      }
      else if( pcase_var.eql( $kw5$DEFINITION ) )
      {
        scope_partition_definition( partition_term_spec_to_term( term_spec ) );
      }
      else if( pcase_var.eql( $kw6$FUNCTION ) )
      {
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = term_spec;
        SubLObject function = NIL;
        SubLObject args = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list7 );
        function = current_$2.first();
        current_$2 = ( args = current_$2.rest() );
        if( function.isFunctionSpec() )
        {
          Functions.apply( function, args );
        }
        else
        {
          Errors.warn( $str8$Unknown_scope_partition_function_, function );
        }
      }
      else if( !pcase_var.eql( $kw9$ESTIMATED_ASSERTION_COUNT ) )
      {
        if( !pcase_var.eql( $kw10$SCOPE_COMPLETELY_SPECIFIED_ ) )
        {
          Errors.warn( $str11$Unable_to_scope_partition_via__S_, partition_item );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      partition_item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3228L)
  public static SubLObject partition_scope_term_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( Hashtables.gethash_without_values( v_object, $partition_scope_hash$.getDynamicValue( thread ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3351L)
  public static SubLObject clear_partition_scope()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$partition_scope_hash$.getDynamicValue( thread ).isHashtable() )
    {
      final SubLObject size = Numbers.integerDivide( Numbers.add( assertion_handles.assertion_count(), forts.fort_count() ), $int12$100 );
      $partition_scope_hash$.setDynamicValue( Hashtables.make_hash_table( size, UNPROVIDED, UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $partition_scope_hash$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3737L)
  public static SubLObject partition_term_spec_to_term(final SubLObject term_spec)
  {
    if( term_spec.isAtom() )
    {
      return partition_term_spec_to_term_internal( term_spec );
    }
    return partition_term_spec_to_term_internal( term_spec.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4080L)
  public static SubLObject partition_term_spec_to_term_internal(final SubLObject term_spec)
  {
    SubLObject v_term = NIL;
    if( NIL != forts.fort_p( term_spec ) )
    {
      if( NIL != forts.valid_fortP( term_spec ) )
      {
        v_term = term_spec;
      }
    }
    else if( term_spec.isString() )
    {
      final SubLObject constant = constants_high.find_constant( term_spec );
      if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
      {
        v_term = constant;
      }
    }
    else if( NIL != constants_high.constant_external_id_p( term_spec ) )
    {
      final SubLObject constant = constants_high.find_constant_by_external_id( term_spec );
      if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
      {
        v_term = constant;
      }
    }
    else if( term_spec.isFixnum() )
    {
      final SubLObject constant = constants_high.find_constant_by_internal_id( term_spec );
      if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
      {
        v_term = constant;
      }
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4921L)
  public static SubLObject scope_partition_object_only(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Hashtables.gethash_without_values( v_object, $partition_scope_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      if( NIL != forts.fort_p( v_object ) || NIL != assertion_handles.assertion_p( v_object ) || NIL != deduction_handles.deduction_p( v_object ) || NIL != kb_hl_support_handles.kb_hl_support_p( v_object ) )
      {
        Hashtables.sethash( v_object, $partition_scope_hash$.getDynamicValue( thread ), v_object );
      }
      else
      {
        Errors.warn( $str13$Non_scope_object__A_not_allowed_ );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5496L)
  public static SubLObject scope_partition_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      Hashtables.sethash( assertion, $partition_scope_hash$.getDynamicValue( thread ), assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5757L)
  public static SubLObject scope_partition_assertion_and_meta_assertions(final SubLObject assertion)
  {
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      scope_partition_assertion( assertion );
      if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
      {
        SubLObject cdolist_list_var;
        final SubLObject meta_assertions = cdolist_list_var = assertion_utilities.all_meta_assertions( assertion );
        SubLObject meta_assertion = NIL;
        meta_assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          scope_partition_assertion( meta_assertion );
          cdolist_list_var = cdolist_list_var.rest();
          meta_assertion = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6269L)
  public static SubLObject scope_partition_assertion_selective(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( assertion ) && NIL != Functions.apply( $scope_partition_assertion_selective_test$.getDynamicValue( thread ), ConsesLow.list( assertion ) ) )
    {
      Hashtables.sethash( assertion, $partition_scope_hash$.getDynamicValue( thread ), assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6749L)
  public static SubLObject scope_partition_assertion_and_constituents(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      scope_partition_assertion( assertion );
      SubLObject cdolist_list_var = assertions_high.assertion_forts( assertion, T, T, T, UNPROVIDED );
      SubLObject fort = NIL;
      fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == $assertion_partition_fort_filter_function$.getDynamicValue( thread ) || NIL != Functions.funcall( $assertion_partition_fort_filter_function$.getDynamicValue( thread ), fort ) )
        {
          scope_partition_object_only( fort );
        }
        cdolist_list_var = cdolist_list_var.rest();
        fort = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7300L)
  public static SubLObject scope_partition_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL == Hashtables.gethash_without_values( v_term, $partition_scope_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( v_term, $partition_scope_hash$.getDynamicValue( thread ), v_term );
      if( NIL != forts.fort_p( v_term ) )
      {
        scope_partition_term_internal( v_term );
      }
      else
      {
        scope_partition_term_internal( v_term );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7777L)
  public static SubLObject scope_partition_definition(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw16$GAF, NIL, NIL );
                SubLObject done_var_$3 = NIL;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                  if( NIL != valid_$5 )
                  {
                    final SubLObject predicate = assertions_high.gaf_predicate( gaf );
                    if( NIL != isa.quoted_isa_in_any_mtP( predicate, $const17$ResearchCycDefinitionalPredicate ) )
                    {
                      scope_partition_term( gaf );
                    }
                  }
                  done_var_$3 = makeBoolean( NIL == valid_$5 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8188L)
  public static SubLObject scope_partition_term_and_narts(final SubLObject v_term)
  {
    if( NIL != forts.fort_p( v_term ) )
    {
      scope_partition_term( v_term );
      SubLObject cdolist_list_var = indexing_utilities.dependent_narts( v_term );
      SubLObject dependent_nart = NIL;
      dependent_nart = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        scope_partition_term( dependent_nart );
        cdolist_list_var = cdolist_list_var.rest();
        dependent_nart = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8469L)
  public static SubLObject scope_partition_term_in_mt(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL != fort_types_interface.mtP( mt ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        kb_mapping.map_term( Symbols.symbol_function( $sym19$SCOPE_PARTITION_ASSERTION ), v_term );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8721L)
  public static SubLObject scope_partition_rf(final SubLObject rf)
  {
    if( NIL != assertion_handles.assertion_p( rf ) )
    {
      return scope_partition_assertion( rf );
    }
    return scope_partition_term( rf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8890L)
  public static SubLObject scope_partition_rf_and_super_rfs(final SubLObject rf)
  {
    if( NIL != assertion_handles.assertion_p( rf ) )
    {
      return scope_partition_assertion_and_meta_assertions( rf );
    }
    return scope_partition_term_and_narts( rf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9086L)
  public static SubLObject selected_scope_partition_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL == Hashtables.gethash_without_values( v_term, $partition_scope_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( v_term, $partition_scope_hash$.getDynamicValue( thread ), v_term );
      if( NIL != forts.fort_p( v_term ) )
      {
        selected_scope_partition_term_internal( v_term );
      }
      else
      {
        selected_scope_partition_term_internal( v_term );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9592L)
  public static SubLObject scope_partition_ontology(final SubLObject ontology_start)
  {
    if( NIL != forts.fort_p( ontology_start ) )
    {
      scope_partition_term( ontology_start );
      SubLObject cdolist_list_var = isa.all_instances_in_all_mts( ontology_start );
      SubLObject instance = NIL;
      instance = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        scope_partition_term( instance );
        cdolist_list_var = cdolist_list_var.rest();
        instance = cdolist_list_var.first();
      }
      cdolist_list_var = genls.all_specs_in_all_mts( ontology_start, UNPROVIDED, UNPROVIDED );
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        scope_partition_term( spec );
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10018L)
  public static SubLObject scope_partition_quoted_ontology(final SubLObject quoted_ontology_start)
  {
    if( NIL != forts.fort_p( quoted_ontology_start ) )
    {
      scope_partition_term( quoted_ontology_start );
      SubLObject cdolist_list_var = isa.all_quoted_instances_in_all_mts( quoted_ontology_start );
      SubLObject quoted_instance = NIL;
      quoted_instance = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        scope_partition_term( quoted_instance );
        cdolist_list_var = cdolist_list_var.rest();
        quoted_instance = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10411L)
  public static SubLObject selected_scope_partition_ontology(final SubLObject ontology_start)
  {
    if( NIL != forts.fort_p( ontology_start ) )
    {
      selected_scope_partition_term( ontology_start );
      SubLObject cdolist_list_var = isa.all_instances_in_all_mts( ontology_start );
      SubLObject instance = NIL;
      instance = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        selected_scope_partition_term( instance );
        cdolist_list_var = cdolist_list_var.rest();
        instance = cdolist_list_var.first();
      }
      cdolist_list_var = genls.all_specs_in_all_mts( ontology_start, UNPROVIDED, UNPROVIDED );
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        selected_scope_partition_term( spec );
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10874L)
  public static SubLObject scope_partition_arg_index(final SubLObject v_term, final SubLObject arg, SubLObject pred, SubLObject mt, SubLObject truth)
  {
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
      kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym20$SCOPE_PARTITION_TERM ), v_term, arg, pred, truth, mt );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11108L)
  public static SubLObject scope_partition_predicate_rule_index(final SubLObject v_term, final SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
      kb_mapping.map_predicate_rule_index( Symbols.symbol_function( $sym20$SCOPE_PARTITION_TERM ), v_term, sense, direction, mt );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11362L)
  public static SubLObject scope_partition_mt_index(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
      kb_mapping.map_mt_index( Symbols.symbol_function( $sym20$SCOPE_PARTITION_TERM ), v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11490L)
  public static SubLObject scope_partition_other_index(final SubLObject v_term)
  {
    kb_mapping.map_other_index( Symbols.symbol_function( $sym20$SCOPE_PARTITION_TERM ), v_term, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11605L)
  public static SubLObject scope_partition_deduction(final SubLObject deduction)
  {
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      final SubLObject assertion = deductions_high.deduction_assertion( deduction );
      scope_partition_assertion( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11872L)
  public static SubLObject partition_scope()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return hash_table_utilities.hash_table_values( $partition_scope_hash$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11962L)
  public static SubLObject partition_forts()
  {
    return list_utilities.remove_if_not( $sym21$FORT_P, partition_scope(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12051L)
  public static SubLObject scope_partition_term_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
      kb_mapping.map_term( $sym20$SCOPE_PARTITION_TERM, v_term );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12191L)
  public static SubLObject selected_scope_partition_term_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
      kb_mapping.selected_map_term( $sym20$SCOPE_PARTITION_TERM, v_term, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13173L)
  public static SubLObject clear_partition_content(SubLObject estimated_assertion_count)
  {
    if( estimated_assertion_count == UNPROVIDED )
    {
      estimated_assertion_count = NIL;
    }
    if( NIL == estimated_assertion_count )
    {
      estimated_assertion_count = Numbers.integerDivide( assertion_handles.assertion_count(), TEN_INTEGER );
    }
    final SubLObject constant_table_size = Numbers.round( Numbers.divide( estimated_assertion_count, kb_utilities.estimated_assertions_per_constant() ), UNPROVIDED );
    $partition_constant_hash$.setDynamicValue( Hashtables.make_hash_table( constant_table_size, UNPROVIDED, UNPROVIDED ) );
    final SubLObject nart_table_size = Numbers.round( Numbers.divide( Numbers.divide( estimated_assertion_count, kb_utilities.estimated_assertions_per_constant() ), kb_utilities.estimated_constants_per_nart() ),
        UNPROVIDED );
    $partition_nart_hash$.setDynamicValue( Hashtables.make_hash_table( nart_table_size, UNPROVIDED, UNPROVIDED ) );
    final SubLObject assertion_table_size = estimated_assertion_count;
    $partition_assertion_hash$.setDynamicValue( Hashtables.make_hash_table( assertion_table_size, UNPROVIDED, UNPROVIDED ) );
    final SubLObject meta_assertion_table_size = Numbers.round( Numbers.divide( estimated_assertion_count, kb_utilities.estimated_assertions_per_meta_assertion() ), UNPROVIDED );
    $partition_meta_assertion_hash$.setDynamicValue( Hashtables.make_hash_table( meta_assertion_table_size, UNPROVIDED, UNPROVIDED ) );
    final SubLObject kb_hl_support_table_size = Numbers.round( Numbers.divide( estimated_assertion_count, kb_utilities.estimated_assertions_per_hl_support() ), UNPROVIDED );
    $partition_kb_hl_support_hash$.setDynamicValue( Hashtables.make_hash_table( kb_hl_support_table_size, UNPROVIDED, UNPROVIDED ) );
    final SubLObject argument_table_size = Numbers.round( Numbers.multiply( estimated_assertion_count, kb_utilities.estimated_arguments_per_assertion() ), UNPROVIDED );
    $partition_argument_hash$.setDynamicValue( Hashtables.make_hash_table( argument_table_size, UNPROVIDED, UNPROVIDED ) );
    $partition_max_nart_complexity$.setDynamicValue( ZERO_INTEGER );
    $partition_max_term_order$.setDynamicValue( ZERO_INTEGER );
    $partition_kb_hl_support_orders$.setDynamicValue( dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $partition_max_kb_hl_support_order$.setDynamicValue( ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15162L)
  public static SubLObject partition_estimated_assertion_count(final SubLObject partition)
  {
    final SubLObject cons = list_utilities.alist_lookup_without_values( partition, $kw9$ESTIMATED_ASSERTION_COUNT, Symbols.symbol_function( EQL ), NIL );
    if( cons.isCons() )
    {
      return cons.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15488L)
  public static SubLObject partition_scope_completely_specified_by_partitionP(final SubLObject partition)
  {
    final SubLObject cons = list_utilities.alist_lookup_without_values( partition, $kw10$SCOPE_COMPLETELY_SPECIFIED_, Symbols.symbol_function( EQL ), NIL );
    if( cons.isCons() )
    {
      return cons.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16044L)
  public static SubLObject mark_partition_content(final SubLObject partition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    scope_partition( partition );
    final SubLObject estimated_assertion_count = partition_estimated_assertion_count( partition );
    clear_partition_content( estimated_assertion_count );
    final SubLObject _prev_bind_0 = $partition_scope_completely_specifiedP$.currentBinding( thread );
    try
    {
      $partition_scope_completely_specifiedP$.bind( partition_scope_completely_specified_by_partitionP( partition ), thread );
      final SubLObject table_var = $partition_scope_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str22$marking_partition_content, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject v_term = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              v_term = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              mark_partition_object( v_term );
              if( NIL != constant_handles.constant_p( v_term ) )
              {
                mark_partition_bookkeeping_terms( v_term );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$7, thread );
      }
    }
    finally
    {
      $partition_scope_completely_specifiedP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16646L)
  public static SubLObject mark_partition_bookkeeping_terms(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( constant, $partition_argument_hash$.getDynamicValue( thread ), constant );
    mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant( constant );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17010L)
  public static SubLObject mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant(final SubLObject constant)
  {
    SubLObject cdolist_list_var;
    final SubLObject terms_to_mark = cdolist_list_var = bookkeeping_store.indexed_terms_mentioned_in_bookkeeping_assertions_of_term( constant );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      mark_partition_object( v_term );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17286L)
  public static SubLObject mark_partition_object(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $mark_partition_object_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17441L)
  public static SubLObject mark_partition_object_cons_method(final SubLObject v_object)
  {
    mark_partition_object( v_object.first() );
    mark_partition_object( v_object.rest() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17586L)
  public static SubLObject mark_partition_object_constant_method(final SubLObject v_object)
  {
    return mark_partition_object_constant( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17693L)
  public static SubLObject mark_partition_object_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) && NIL == Hashtables.gethash_without_values( constant, $partition_constant_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( constant, $partition_constant_hash$.getDynamicValue( thread ), constant );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18006L)
  public static SubLObject mark_partition_object_nart_method(final SubLObject v_object)
  {
    return mark_partition_object_nart( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18105L)
  public static SubLObject mark_partition_object_nart(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != nart_handles.valid_nartP( nart, UNPROVIDED ) && NIL == Hashtables.gethash_without_values( nart, $partition_nart_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( nart, $partition_nart_hash$.getDynamicValue( thread ), nart );
      final SubLObject level = function_terms.term_functional_complexity( nart );
      if( level.numG( $partition_max_nart_complexity$.getDynamicValue( thread ) ) )
      {
        $partition_max_nart_complexity$.setDynamicValue( level, thread );
      }
      final SubLObject assertion = function_terms.term_of_unit_assertion( nart );
      if( NIL != assertion_handles.assertion_p( assertion ) )
      {
        mark_partition_object( assertion );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18752L)
  public static SubLObject mark_partition_object_assertion_method(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.valid_assertionP( v_object, UNPROVIDED ) && NIL == Hashtables.gethash_without_values( v_object, $partition_assertion_hash$.getDynamicValue( thread ), UNPROVIDED ) && NIL == Hashtables
        .gethash_without_values( v_object, $partition_meta_assertion_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      final SubLObject order = kb_utilities.term_order( v_object );
      if( order.numG( $partition_max_term_order$.getDynamicValue( thread ) ) )
      {
        $partition_max_term_order$.setDynamicValue( order, thread );
      }
      if( order.numE( ONE_INTEGER ) )
      {
        Hashtables.sethash( v_object, $partition_assertion_hash$.getDynamicValue( thread ), v_object );
      }
      else
      {
        Hashtables.sethash( v_object, $partition_meta_assertion_hash$.getDynamicValue( thread ), v_object );
      }
      if( NIL == partition_scope_completely_specifiedP() )
      {
        mark_partition_object( assertions_high.assertion_cnf( v_object ) );
        mark_partition_object( assertions_high.assertion_mt( v_object ) );
      }
      mark_partition_assertion_beliefs( v_object );
      if( NIL == partition_scope_completely_specifiedP() )
      {
        SubLObject cdolist_list_var = assertions_high.assertion_arguments( v_object );
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != deduction_handles.deduction_p( argument ) )
          {
            mark_partition_assertion_deduction( argument );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argument = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19915L)
  public static SubLObject mark_partition_object_deduction_method(final SubLObject v_object)
  {
    return mark_partition_object_deduction( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20024L)
  public static SubLObject mark_partition_object_deduction(final SubLObject deduction)
  {
    return mark_partition_assertion_deduction( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20141L)
  public static SubLObject mark_partition_object_kb_hl_support_method(final SubLObject v_object)
  {
    return mark_partition_object_kb_hl_support( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20258L)
  public static SubLObject mark_partition_object_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, UNPROVIDED ) && NIL == Hashtables.gethash_without_values( kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue( thread ), kb_hl_support );
      note_partition_kb_hl_support_order( kb_hl_support );
      if( NIL == partition_scope_completely_specifiedP() )
      {
        mark_partition_object( kb_hl_supports_high.kb_hl_support_sentence( kb_hl_support ) );
        mark_partition_object( kb_hl_supports_high.kb_hl_support_mt( kb_hl_support ) );
        SubLObject cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification( kb_hl_support );
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          mark_partition_object( support );
          cdolist_list_var = cdolist_list_var.rest();
          support = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20892L)
  public static SubLObject mark_partition_assertion_beliefs(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Hashtables.gethash_without_values( assertion, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) && NIL != Sequences.find_if( Symbols.symbol_function( $sym30$BELIEF_P ), assertions_high
        .assertion_arguments( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Hashtables.sethash( assertion, $partition_argument_hash$.getDynamicValue( thread ), assertion );
      if( NIL == partition_scope_completely_specifiedP() )
      {
        mark_partition_object( assertions_high.asserted_by( assertion ) );
        mark_partition_object( assertions_high.asserted_why( assertion ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21412L)
  public static SubLObject mark_partition_assertion_deduction(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != deduction_handles.valid_deduction( deduction, UNPROVIDED ) && NIL == Hashtables.gethash_without_values( deduction, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( deduction, $partition_argument_hash$.getDynamicValue( thread ), deduction );
      if( NIL == partition_scope_completely_specifiedP() )
      {
        mark_partition_object( deductions_high.deduction_supported_object( deduction ) );
        SubLObject cdolist_list_var = deductions_high.deduction_supports( deduction );
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          mark_partition_object( support );
          cdolist_list_var = cdolist_list_var.rest();
          support = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21894L)
  public static SubLObject note_partition_kb_hl_support_order(final SubLObject kb_hl_support)
  {
    return list_utilities.sublisp_boolean( partition_kb_hl_support_order( kb_hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22027L)
  public static SubLObject partition_kb_hl_support_order(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject order = dictionary.dictionary_lookup( $partition_kb_hl_support_orders$.getDynamicValue( thread ), kb_hl_support, UNPROVIDED );
    if( NIL == order )
    {
      order = ONE_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject justification = cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification( kb_hl_support );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
        {
          final SubLObject sub_order = partition_kb_hl_support_order( support );
          if( order.numLE( sub_order ) )
          {
            order = Numbers.add( ONE_INTEGER, sub_order );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      dictionary.dictionary_enter( $partition_kb_hl_support_orders$.getDynamicValue( thread ), kb_hl_support, order );
      if( order.numG( $partition_max_kb_hl_support_order$.getDynamicValue( thread ) ) )
      {
        $partition_max_kb_hl_support_order$.setDynamicValue( order, thread );
      }
    }
    return order;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22705L)
  public static SubLObject display_partition_content()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str31$_______S_constants, Hashtables.hash_table_count( $partition_constant_hash$.getDynamicValue( thread ) ) );
    SubLObject cdohash_table = $partition_constant_hash$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject value = NIL;
    Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        PrintLow.format( T, $str32$___A_S, ( NIL != partition_scope_term_p( key ) ) ? $str33$___ : $str34$___, key );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    PrintLow.format( T, $str35$______Max_NART_level____S, $partition_max_nart_complexity$.getDynamicValue( thread ) );
    if( $partition_max_nart_complexity$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      SubLObject index;
      SubLObject nart_level;
      SubLObject cdohash_table2;
      SubLObject key2;
      SubLObject value2;
      Iterator cdohash_iterator2;
      Map.Entry cdohash_entry2;
      for( index = NIL, index = ZERO_INTEGER; index.numL( $partition_max_nart_complexity$.getDynamicValue( thread ) ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        nart_level = Numbers.add( index, ONE_INTEGER );
        PrintLow.format( T, $str36$______level__S_NARTs, nart_level );
        cdohash_table2 = $partition_nart_hash$.getDynamicValue( thread );
        key2 = NIL;
        value2 = NIL;
        cdohash_iterator2 = Hashtables.getEntrySetIterator( cdohash_table2 );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator2 ))
          {
            cdohash_entry2 = Hashtables.iteratorNextEntry( cdohash_iterator2 );
            key2 = Hashtables.getEntryKey( cdohash_entry2 );
            value2 = Hashtables.getEntryValue( cdohash_entry2 );
            if( function_terms.term_functional_complexity( key2 ).numE( nart_level ) )
            {
              PrintLow.format( T, $str32$___A_S, ( NIL != partition_scope_term_p( key2 ) ) ? $str33$___ : $str34$___, key2 );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator2 );
        }
      }
    }
    PrintLow.format( T, $str37$______Max_term_order___S, $partition_max_term_order$.getDynamicValue( thread ) );
    if( $partition_max_term_order$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      PrintLow.format( T, $str38$_______S_assertions, Hashtables.hash_table_count( $partition_assertion_hash$.getDynamicValue( thread ) ) );
      cdohash_table = $partition_assertion_hash$.getDynamicValue( thread );
      key = NIL;
      value = NIL;
      cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          value = Hashtables.getEntryValue( cdohash_entry );
          PrintLow.format( T, $str32$___A_S, ( NIL != partition_scope_term_p( key ) ) ? $str33$___ : $str34$___, key );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      if( $partition_max_term_order$.getDynamicValue( thread ).numG( ONE_INTEGER ) )
      {
        PrintLow.format( T, $str39$_______S_meta_assertions, Hashtables.hash_table_count( $partition_meta_assertion_hash$.getDynamicValue( thread ) ) );
        SubLObject cdotimes_end_var;
        SubLObject order;
        SubLObject meta_order;
        SubLObject cdohash_table3;
        SubLObject key3;
        SubLObject value3;
        Iterator cdohash_iterator3;
        Map.Entry cdohash_entry3;
        for( cdotimes_end_var = Numbers.subtract( $partition_max_term_order$.getDynamicValue( thread ), ONE_INTEGER ), order = NIL, order = ZERO_INTEGER; order.numL( cdotimes_end_var ); order = Numbers.add( order,
            ONE_INTEGER ) )
        {
          meta_order = Numbers.add( order, TWO_INTEGER );
          PrintLow.format( T, $str40$______order__S_meta_assertions, meta_order );
          cdohash_table3 = $partition_meta_assertion_hash$.getDynamicValue( thread );
          key3 = NIL;
          value3 = NIL;
          cdohash_iterator3 = Hashtables.getEntrySetIterator( cdohash_table3 );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator3 ))
            {
              cdohash_entry3 = Hashtables.iteratorNextEntry( cdohash_iterator3 );
              key3 = Hashtables.getEntryKey( cdohash_entry3 );
              value3 = Hashtables.getEntryValue( cdohash_entry3 );
              if( kb_utilities.term_order( key3 ).numE( meta_order ) )
              {
                PrintLow.format( T, $str32$___A_S, ( NIL != partition_scope_term_p( key3 ) ) ? $str33$___ : $str34$___, key3 );
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator3 );
          }
        }
      }
    }
    PrintLow.format( T, $str41$_______S_arguments, Hashtables.hash_table_count( $partition_argument_hash$.getDynamicValue( thread ) ) );
    cdohash_table = $partition_argument_hash$.getDynamicValue( thread );
    key = NIL;
    SubLObject v_object = NIL;
    cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        v_object = Hashtables.getEntryValue( cdohash_entry );
        streams_high.terpri( UNPROVIDED );
        if( NIL != deduction_handles.deduction_p( v_object ) )
        {
          PrintLow.format( T, $str42$Deduction______S, deductions_high.deduction_supported_object( v_object ) );
        }
        else if( NIL != assertion_handles.assertion_p( v_object ) )
        {
          PrintLow.format( T, $str43$Beliefs_for____S, v_object );
        }
        else
        {
          PrintLow.format( T, $str44$Unknown________S, v_object );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    PrintLow.format( T, $str45$______Max_KB_HL_support_level____, $partition_max_kb_hl_support_order$.getDynamicValue( thread ) );
    if( $partition_max_kb_hl_support_order$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      PrintLow.format( T, $str46$_______S_KB_HL_supports, Hashtables.hash_table_count( $partition_kb_hl_support_hash$.getDynamicValue( thread ) ) );
      SubLObject index;
      SubLObject cdohash_table2;
      SubLObject key2;
      SubLObject value2;
      Iterator cdohash_iterator2;
      Map.Entry cdohash_entry2;
      SubLObject kb_hl_support_order;
      for( index = NIL, index = ZERO_INTEGER; index.numL( $partition_max_kb_hl_support_order$.getDynamicValue( thread ) ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        kb_hl_support_order = Numbers.add( ONE_INTEGER, index );
        PrintLow.format( T, $str47$______level__S_KB_HL_supports, kb_hl_support_order );
        cdohash_table2 = $partition_kb_hl_support_hash$.getDynamicValue( thread );
        key2 = NIL;
        value2 = NIL;
        cdohash_iterator2 = Hashtables.getEntrySetIterator( cdohash_table2 );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator2 ))
          {
            cdohash_entry2 = Hashtables.iteratorNextEntry( cdohash_iterator2 );
            key2 = Hashtables.getEntryKey( cdohash_entry2 );
            value2 = Hashtables.getEntryValue( cdohash_entry2 );
            if( partition_kb_hl_support_order( key2 ).numE( kb_hl_support_order ) )
            {
              PrintLow.format( T, $str32$___A_S, ( NIL != partition_scope_term_p( key2 ) ) ? $str33$___ : $str34$___, key2 );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator2 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25389L)
  public static SubLObject remove_partition(final SubLObject partition)
  {
    if( NIL != partition )
    {
      scope_partition( partition );
      return remove_scoped_partition();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25765L)
  public static SubLObject remove_scoped_partition()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = Errors.$continue_cerrorP$.currentBinding( thread );
    final SubLObject _prev_bind_13 = Errors.$ignore_warnsP$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( NIL, thread );
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
      wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
      wff_utilities.$check_var_typesP$.bind( NIL, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      wff_vars.$validate_constantsP$.bind( NIL, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      Errors.$continue_cerrorP$.bind( T, thread );
      Errors.$ignore_warnsP$.bind( T, thread );
      SubLObject table_var = $partition_scope_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_1_$10 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2_$11 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_3_$12 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_4_$13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_5_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_6_$15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_7_$16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str48$removing_partition_assertions, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject key = NIL;
          SubLObject v_term = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              key = Hashtables.getEntryKey( cdohash_entry );
              v_term = Hashtables.getEntryValue( cdohash_entry );
              if( NIL != assertions_high.valid_assertion( v_term, UNPROVIDED ) )
              {
                tms.tms_remove_assertion( v_term );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_7_$16, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_6_$15, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_5_$14, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_4_$13, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_3_$12, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_2_$11, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$10, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$9, thread );
      }
      table_var = $partition_scope_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$11 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_1_$11 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2_$12 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_3_$13 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_4_$14 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_5_$15 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_6_$16 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_7_$17 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str49$removing_partition_NARTs, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject key = NIL;
          SubLObject v_term = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              key = Hashtables.getEntryKey( cdohash_entry );
              v_term = Hashtables.getEntryValue( cdohash_entry );
              if( NIL != nart_handles.valid_nartP( v_term, UNPROVIDED ) )
              {
                cyc_kernel.cyc_kill( v_term );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_7_$17, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_6_$16, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_5_$15, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_4_$14, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_3_$13, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_2_$12, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$11, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$11, thread );
      }
      table_var = $partition_scope_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$13 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_1_$12 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2_$13 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_3_$14 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_4_$15 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_5_$16 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_6_$17 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_7_$18 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str50$removing_partition_constants, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject key = NIL;
          SubLObject v_term = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              key = Hashtables.getEntryKey( cdohash_entry );
              v_term = Hashtables.getEntryValue( cdohash_entry );
              if( NIL != constant_handles.valid_constantP( v_term, UNPROVIDED ) )
              {
                cyc_kernel.cyc_kill( v_term );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_7_$18, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_6_$17, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_5_$16, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_4_$15, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_3_$14, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_2_$13, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$12, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$13, thread );
      }
    }
    finally
    {
      Errors.$ignore_warnsP$.rebind( _prev_bind_13, thread );
      Errors.$continue_cerrorP$.rebind( _prev_bind_12, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
      wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
      wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
      wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27703L)
  public static SubLObject make_archive_filename(final SubLObject archive_name)
  {
    return file_utilities.cyc_home_filename( $list51, archive_name, $str52$lisp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27819L)
  public static SubLObject archive_assertion_if_local(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      final SubLObject formula = fi.assertion_fi_formula( assertion, UNPROVIDED );
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      final SubLObject strength = assertions_high.assertion_strength( assertion );
      final SubLObject dir = assertions_high.assertion_direction( assertion );
      PrintLow.format( $current_archive_stream$.getDynamicValue( thread ), $str54$_____FI_ASSERT___S__S__S__S_, new SubLObject[] { formula, mt, strength, dir
      } );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28329L)
  public static SubLObject archive_term(final SubLObject v_term, SubLObject removeP)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( v_term ) : v_term;
    if( NIL != forts.valid_fortP( v_term ) )
    {
      if( NIL == nart_handles.nart_p( v_term ) )
      {
        PrintLow.format( $current_archive_stream$.getDynamicValue( thread ), $str55$_____FI_CREATE__a_, constants_high.constant_name( v_term ) );
      }
      kb_mapping.map_term( Symbols.symbol_function( $sym56$ARCHIVE_ASSERTION_IF_LOCAL ), v_term );
      if( NIL != removeP )
      {
        remove_partition_term( v_term );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28707L)
  public static SubLObject archive_ontology(final SubLObject ontology_start, SubLObject removeP)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    assert NIL != forts.fort_p( ontology_start ) : ontology_start;
    final SubLObject v_instances = isa.all_instances_in_all_mts( ontology_start );
    final SubLObject specs = genls.all_specs_in_all_mts( ontology_start, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = v_instances;
    SubLObject instance = NIL;
    instance = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      archive_term( instance, removeP );
      cdolist_list_var = cdolist_list_var.rest();
      instance = cdolist_list_var.first();
    }
    cdolist_list_var = specs;
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !spec.equal( ontology_start ) )
      {
        archive_term( spec, removeP );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return archive_term( ontology_start, removeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29275L)
  public static SubLObject archive_partition(final SubLObject partition, final SubLObject archive_name, SubLObject removeP)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject archive_file = make_archive_filename( archive_name );
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      control_vars.$use_transcriptP$.bind( NIL, thread );
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( archive_file, $kw57$APPEND );
        if( !stream.isStream() )
        {
          Errors.error( $str58$Unable_to_open__S, archive_file );
        }
        final SubLObject _prev_bind_0_$36 = $current_archive_stream$.currentBinding( thread );
        try
        {
          $current_archive_stream$.bind( stream, thread );
          PrintLow.format( $current_archive_stream$.getDynamicValue( thread ), $str59$______Archive_saved_at__s____, numeric_date_utilities.timestring( UNPROVIDED ) );
          SubLObject cdolist_list_var = partition;
          SubLObject partition_item = NIL;
          partition_item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = partition_item;
            SubLObject method = NIL;
            SubLObject term_spec = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
            method = current.first();
            current = ( term_spec = current.rest() );
            assert NIL != Types.keywordp( method ) : method;
            assert NIL != Types.stringp( term_spec ) : term_spec;
            final SubLObject item = fi.fi_find( term_spec );
            if( NIL != constant_handles.valid_constantP( item, UNPROVIDED ) )
            {
              final SubLObject pcase_var = method;
              if( pcase_var.eql( $kw2$ONTOLOGY ) )
              {
                archive_ontology( item, removeP );
              }
              else
              {
                archive_term( item, removeP );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            partition_item = cdolist_list_var.first();
          }
        }
        finally
        {
          $current_archive_stream$.rebind( _prev_bind_0_$36, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      control_vars.$use_transcriptP$.rebind( _prev_bind_2, thread );
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return archive_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30297L)
  public static SubLObject remove_partition_term(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    if( NIL != forts.valid_fortP( v_term ) )
    {
      fi.fi_kill( v_term );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30500L)
  public static SubLObject save_partition(final SubLObject filename, final SubLObject partition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw61$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str58$Unable_to_open__S, filename );
      }
      final SubLObject stream_$38 = stream;
      if( NIL != partition )
      {
        save_partition_to_stream( stream_$38, partition );
      }
      result = filename;
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32729L)
  public static SubLObject save_partition_to_stream(final SubLObject stream, final SubLObject partition)
  {
    assert NIL != cfasl.cfasl_encodable_stream_p( stream ) : stream;
    mark_partition_content( partition );
    dump_partition_to_stream( stream );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32925L)
  public static SubLObject excise_partition_to_stream(final SubLObject stream, final SubLObject partition)
  {
    assert NIL != cfasl.cfasl_encodable_stream_p( stream ) : stream;
    final SubLObject ret_val = save_partition_to_stream( stream, partition );
    remove_scoped_partition();
    return ret_val;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33262L)
  public static SubLObject save_partition_as_hl_transcript(final SubLObject filename, final SubLObject partition)
  {
    final SubLObject modification_spec = partition_spec_to_modification_spec( partition );
    final SubLObject content_summary = hl_transcripts.save_hl_transcript_from_modification_spec( filename, modification_spec );
    return Values.values( filename, content_summary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33804L)
  public static SubLObject partition_spec_to_modification_spec(final SubLObject partition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    mark_partition_content( partition );
    SubLObject partition_constants = hash_table_utilities.hash_table_keys( $partition_constant_hash$.getDynamicValue( thread ) );
    SubLObject partition_narts = hash_table_utilities.hash_table_keys( $partition_nart_hash$.getDynamicValue( thread ) );
    SubLObject simple_assertions = hash_table_utilities.hash_table_keys( $partition_assertion_hash$.getDynamicValue( thread ) );
    SubLObject meta_assertions = hash_table_utilities.hash_table_keys( $partition_meta_assertion_hash$.getDynamicValue( thread ) );
    SubLObject partition_assertions = $kw63$UNINITIALIZED;
    SubLObject partition_deductions = list_utilities.remove_if_not( Symbols.symbol_function( $sym64$DEDUCTION_P ), hash_table_utilities.hash_table_keys( $partition_argument_hash$.getDynamicValue( thread ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject partition_kb_hl_supports = hash_table_utilities.hash_table_keys( $partition_kb_hl_support_hash$.getDynamicValue( thread ) );
    partition_constants = Sort.sort( partition_constants, Symbols.symbol_function( $sym65$_ ), Symbols.symbol_function( $sym66$CONSTANT_INTERNAL_ID ) );
    partition_narts = Sort.sort( partition_narts, Symbols.symbol_function( $sym65$_ ), Symbols.symbol_function( $sym67$NART_ID ) );
    partition_narts = Sort.stable_sort( partition_narts, Symbols.symbol_function( $sym65$_ ), Symbols.symbol_function( $sym68$TERM_FUNCTIONAL_COMPLEXITY ) );
    simple_assertions = assertion_utilities.sort_assertions( simple_assertions );
    meta_assertions = assertion_utilities.sort_assertions( meta_assertions );
    meta_assertions = Sort.stable_sort( meta_assertions, Symbols.symbol_function( $sym65$_ ), Symbols.symbol_function( $sym69$TERM_ORDER ) );
    partition_assertions = ConsesLow.append( simple_assertions, meta_assertions );
    partition_deductions = Sort.sort( partition_deductions, Symbols.symbol_function( $sym65$_ ), Symbols.symbol_function( $sym70$DEDUCTION_ID ) );
    partition_kb_hl_supports = Sort.sort( partition_kb_hl_supports, Symbols.symbol_function( $sym65$_ ), Symbols.symbol_function( $sym71$KB_HL_SUPPORT_ID ) );
    final SubLObject modification_spec = ConsesLow.list( $kw72$NEW_CONSTANTS, partition_constants, $kw73$NEW_NARTS, partition_narts, $kw74$NEW_ASSERTIONS, partition_assertions, $kw75$NEW_DEDUCTIONS,
        partition_deductions );
    return modification_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36625L)
  public static SubLObject partition_common_symbols()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.append( dumper.kb_dump_common_symbols(), $partition_special_objects$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36803L)
  public static SubLObject dump_partition_to_stream(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_info( stream );
    final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_common_symbols$.bind( NIL, thread );
      cfasl.cfasl_set_common_symbols( partition_common_symbols() );
      dump_partition_constant_shells( stream );
      dump_partition_nart_shells( stream );
      dump_partition_assertions( stream );
      dump_partition_kb_hl_supports( stream );
      dump_partition_arguments( stream );
    }
    finally
    {
      cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37159L)
  public static SubLObject dump_partition_section_marker(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl.cfasl_output( $partition_section_marker$.getDynamicValue( thread ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37281L)
  public static SubLObject dump_partition_info(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = system_info.cyc_revision_numbers();
    SubLObject system_number = NIL;
    SubLObject patch_number = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    system_number = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    patch_number = current.first();
    final SubLObject branch_specifics;
    current = ( branch_specifics = current.rest() );
    cfasl.cfasl_output( misc_utilities.copyright_notice(), stream );
    cfasl.cfasl_output( $dump_partition_format$.getDynamicValue( thread ), stream );
    cfasl.cfasl_output( system_number, stream );
    cfasl.cfasl_output( patch_number, stream );
    cfasl.cfasl_output( numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ), stream );
    dumper.dump_special_objects_internal( partition_common_symbols(), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37761L)
  public static SubLObject large_partitionP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numGE( Numbers.divide( Hashtables.hash_table_count( $partition_constant_hash$.getDynamicValue( thread ) ), constant_handles.constant_count() ), $float81$0_1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37981L)
  public static SubLObject dump_partition_constant_shells(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_section_marker( stream );
    final SubLObject total = Hashtables.hash_table_count( $partition_constant_hash$.getDynamicValue( thread ) );
    cfasl.cfasl_output( total, stream );
    if( NIL != large_partitionP() )
    {
      final SubLObject idx = constant_handles.do_constants_table();
      final SubLObject mess = $str82$_large__partition_constant_shells;
      final SubLObject total_$39 = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$40 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$40, $kw83$SKIP ) )
          {
            final SubLObject idx_$41 = idx_$40;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$41, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$41 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject constant;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                constant = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( constant ) )
                  {
                    constant = $kw83$SKIP;
                  }
                  if( NIL != Hashtables.gethash_without_values( constant, $partition_constant_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_constant_shell( constant, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$39 );
                }
              }
            }
            final SubLObject idx_$42 = idx_$40;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$42 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$42 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$42 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$42 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
                {
                  if( NIL != Hashtables.gethash_without_values( constant2, $partition_constant_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_constant_shell( constant2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$39 );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject table_var = $partition_constant_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str84$partition_constant_shells, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject constant3 = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              constant3 = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              dump_partition_constant_shell( constant3, stream );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_8, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38570L)
  public static SubLObject dump_partition_constant_shell(final SubLObject constant, final SubLObject stream)
  {
    cfasl.cfasl_output( constants_high.constant_internal_id( constant ), stream );
    cfasl.cfasl_output( constants_high.constant_name( constant ), stream );
    cfasl.cfasl_output( constants_high.constant_guid( constant ), stream );
    cfasl.cfasl_output( partition_scope_term_p( constant ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38907L)
  public static SubLObject dump_partition_nart_shells(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl.cfasl_output( $partition_max_nart_complexity$.getDynamicValue( thread ), stream );
    SubLObject index;
    SubLObject nart_level;
    for( index = NIL, index = ZERO_INTEGER; index.numL( $partition_max_nart_complexity$.getDynamicValue( thread ) ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      nart_level = Numbers.add( index, ONE_INTEGER );
      dump_partition_nart_shells_at_level( nart_level, stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39198L)
  public static SubLObject dump_partition_nart_shells_at_level(final SubLObject nart_level, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_section_marker( stream );
    final SubLObject total = partition_nart_level_count( nart_level );
    cfasl.cfasl_output( total, stream );
    final SubLObject message = Sequences.cconcatenate( $str85$partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( nart_level ), $str86$_NART_shells
    } );
    if( NIL != large_partitionP() )
    {
      final SubLObject idx = nart_handles.do_narts_table();
      final SubLObject mess = Sequences.cconcatenate( $str87$_large__, format_nil.format_nil_a_no_copy( message ) );
      final SubLObject total_$45 = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$46 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$46, $kw83$SKIP ) )
          {
            final SubLObject idx_$47 = idx_$46;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$47, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$47 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject nart;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                nart = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( nart ) )
                  {
                    nart = $kw83$SKIP;
                  }
                  if( NIL != Hashtables.gethash_without_values( nart, $partition_nart_hash$.getDynamicValue( thread ), UNPROVIDED ) && function_terms.term_functional_complexity( nart ).numE( nart_level ) )
                  {
                    dump_partition_nart_shell( nart, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$45 );
                }
              }
            }
            final SubLObject idx_$48 = idx_$46;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$48 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$48 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$48 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$48 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( nart2 ) )
                {
                  if( NIL != Hashtables.gethash_without_values( nart2, $partition_nart_hash$.getDynamicValue( thread ), UNPROVIDED ) && function_terms.term_functional_complexity( nart2 ).numE( nart_level ) )
                  {
                    dump_partition_nart_shell( nart2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$45 );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject table_var = $partition_nart_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( message, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject nart3 = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              nart3 = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              if( function_terms.term_functional_complexity( nart3 ).numE( nart_level ) )
              {
                dump_partition_nart_shell( nart3, stream );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_8, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39955L)
  public static SubLObject partition_nart_level_count(final SubLObject nart_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject cdohash_table = $partition_nart_hash$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject nart = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        nart = Hashtables.getEntryValue( cdohash_entry );
        if( function_terms.term_functional_complexity( nart ).numE( nart_level ) )
        {
          total = Numbers.add( total, ONE_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40193L)
  public static SubLObject dump_partition_nart_shell(final SubLObject nart, final SubLObject stream)
  {
    cfasl.cfasl_output( nart_handles.nart_id( nart ), stream );
    cfasl.cfasl_output( narts_high.nart_hl_formula( nart ), stream );
    cfasl.cfasl_output( partition_scope_term_p( nart ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40403L)
  public static SubLObject dump_partition_assertions(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl.cfasl_output( $partition_max_term_order$.getDynamicValue( thread ), stream );
    SubLObject term_order;
    SubLObject meta_order;
    for( term_order = NIL, term_order = ZERO_INTEGER; term_order.numL( $partition_max_term_order$.getDynamicValue( thread ) ); term_order = Numbers.add( term_order, ONE_INTEGER ) )
    {
      meta_order = Numbers.add( term_order, ONE_INTEGER );
      if( meta_order.numE( ONE_INTEGER ) )
      {
        dump_partition_simple_assertions( stream );
      }
      else
      {
        dump_partition_meta_assertions( meta_order, stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40760L)
  public static SubLObject dump_partition_simple_assertions(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_section_marker( stream );
    final SubLObject total = Hashtables.hash_table_count( $partition_assertion_hash$.getDynamicValue( thread ) );
    cfasl.cfasl_output( total, stream );
    if( NIL != large_partitionP() )
    {
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = $str88$_large__partition_assertions;
      final SubLObject total_$51 = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$52 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$52, $kw83$SKIP ) )
          {
            final SubLObject idx_$53 = idx_$52;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$53, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$53 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw83$SKIP;
                  }
                  assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  if( NIL != Hashtables.gethash_without_values( assertion, $partition_assertion_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_assertion( assertion, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$51 );
                }
              }
            }
            final SubLObject idx_$54 = idx_$52;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$54 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$54 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$54 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$54 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  if( NIL != Hashtables.gethash_without_values( assertion2, $partition_assertion_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_assertion( assertion2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$51 );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject table_var = $partition_assertion_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str89$partition_assertions, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject assertion3 = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              assertion3 = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              dump_partition_assertion( assertion3, stream );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_8, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41340L)
  public static SubLObject dump_partition_meta_assertions(final SubLObject meta_order, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_section_marker( stream );
    final SubLObject total = partition_meta_assertion_order_count( meta_order );
    cfasl.cfasl_output( total, stream );
    final SubLObject message = Sequences.cconcatenate( $str90$partition_order_, new SubLObject[] { format_nil.format_nil_s_no_copy( meta_order ), $str91$_meta_assertions
    } );
    final SubLObject table_var = $partition_meta_assertion_hash$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( message, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject key = NIL;
        SubLObject assertion = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            assertion = Hashtables.getEntryValue( cdohash_entry );
            if( kb_utilities.term_order( assertion ).numE( meta_order ) )
            {
              dump_partition_assertion( assertion, stream );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41970L)
  public static SubLObject partition_meta_assertion_order_count(final SubLObject meta_order)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject cdohash_table = $partition_meta_assertion_hash$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject assertion = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        assertion = Hashtables.getEntryValue( cdohash_entry );
        if( kb_utilities.term_order( assertion ).numE( meta_order ) )
        {
          total = Numbers.add( total, ONE_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42222L)
  public static SubLObject dump_partition_assertion(final SubLObject assertion, final SubLObject stream)
  {
    cfasl.cfasl_output( assertion_handles.assertion_id( assertion ), stream );
    cfasl.cfasl_output( partition_scope_term_p( assertion ), stream );
    cfasl.cfasl_output( assertions_high.assertion_cnf( assertion ), stream );
    cfasl.cfasl_output( assertions_high.assertion_mt( assertion ), stream );
    cfasl.cfasl_output( assertions_high.assertion_direction( assertion ), stream );
    cfasl.cfasl_output( assertions_high.assertion_variable_names( assertion ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42620L)
  public static SubLObject dump_partition_kb_hl_supports(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl.cfasl_output( $partition_max_kb_hl_support_order$.getDynamicValue( thread ), stream );
    SubLObject index;
    SubLObject kb_hl_support_level;
    for( index = NIL, index = ZERO_INTEGER; index.numL( $partition_max_kb_hl_support_order$.getDynamicValue( thread ) ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      kb_hl_support_level = Numbers.add( ONE_INTEGER, index );
      dump_partition_kb_hl_supports_at_level( kb_hl_support_level, stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42946L)
  public static SubLObject dump_partition_kb_hl_supports_at_level(final SubLObject level, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_section_marker( stream );
    final SubLObject total = partition_kb_hl_support_level_count( level );
    cfasl.cfasl_output( total, stream );
    final SubLObject message = Sequences.cconcatenate( $str85$partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( level ), $str92$_KB_HL_supports
    } );
    if( NIL != large_partitionP() )
    {
      final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
      final SubLObject mess = Sequences.cconcatenate( $str87$_large__, format_nil.format_nil_a_no_copy( message ) );
      final SubLObject total_$58 = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$59 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$59, $kw83$SKIP ) )
          {
            final SubLObject idx_$60 = idx_$59;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$60, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$60 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject s_id;
              SubLObject s_handle;
              SubLObject kb_hl_support;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                s_handle = Vectors.aref( vector_var, s_id );
                if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                  {
                    s_handle = $kw83$SKIP;
                  }
                  kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                  if( NIL != Hashtables.gethash_without_values( kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue( thread ), UNPROVIDED ) && partition_kb_hl_support_order( kb_hl_support ).numE( level ) )
                  {
                    dump_partition_kb_hl_support( kb_hl_support, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$58 );
                }
              }
            }
            final SubLObject idx_$61 = idx_$59;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$61 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$61 );
              SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$61 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$61 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( s_id2.numL( end_id ))
              {
                final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
                {
                  final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                  if( NIL != Hashtables.gethash_without_values( kb_hl_support2, $partition_kb_hl_support_hash$.getDynamicValue( thread ), UNPROVIDED ) && partition_kb_hl_support_order( kb_hl_support2 ).numE( level ) )
                  {
                    dump_partition_kb_hl_support( kb_hl_support2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$58 );
                }
                s_id2 = Numbers.add( s_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject table_var = $partition_kb_hl_support_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( message, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject kb_hl_support3 = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              kb_hl_support3 = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              if( partition_kb_hl_support_order( kb_hl_support3 ).numE( level ) )
              {
                dump_partition_kb_hl_support( kb_hl_support3, stream );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_8, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43815L)
  public static SubLObject partition_kb_hl_support_level_count(final SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject cdohash_table = $partition_kb_hl_support_hash$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject kb_hl_support = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        kb_hl_support = Hashtables.getEntryValue( cdohash_entry );
        if( partition_kb_hl_support_order( kb_hl_support ).numE( level ) )
        {
          total = Numbers.add( total, ONE_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44082L)
  public static SubLObject dump_partition_kb_hl_support(final SubLObject kb_hl_support, final SubLObject stream)
  {
    final SubLObject id = kb_hl_support_handles.kb_hl_support_id( kb_hl_support );
    final SubLObject scopeP = partition_scope_term_p( kb_hl_support );
    final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support( kb_hl_support );
    final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification( kb_hl_support );
    cfasl.cfasl_output( id, stream );
    cfasl.cfasl_output( scopeP, stream );
    cfasl.cfasl_output( hl_support, stream );
    cfasl.cfasl_output( justification, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44541L)
  public static SubLObject dump_partition_arguments(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dump_partition_section_marker( stream );
    final SubLObject total = Hashtables.hash_table_count( $partition_argument_hash$.getDynamicValue( thread ) );
    cfasl.cfasl_output( total, stream );
    if( NIL != large_partitionP() )
    {
      SubLObject idx = assertion_handles.do_assertions_table();
      SubLObject mess = $str93$_large__partition_beliefs;
      final SubLObject total_$64 = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$65 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$65, $kw83$SKIP ) )
          {
            final SubLObject idx_$66 = idx_$65;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$66, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$66 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw83$SKIP;
                  }
                  assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  if( NIL != Hashtables.gethash_without_values( assertion, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_argument( assertion, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$64 );
                }
              }
            }
            final SubLObject idx_$67 = idx_$65;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$67 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$67 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$67 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$67 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  if( NIL != Hashtables.gethash_without_values( assertion2, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_argument( assertion2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$64 );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
      idx = deduction_handles.do_deductions_table();
      mess = $str94$_large__partition_deductions;
      final SubLObject total_$65 = id_index.id_index_count( idx );
      sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$68 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$68, $kw83$SKIP ) )
          {
            final SubLObject idx_$69 = idx_$68;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$69, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$69 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject d_id;
              SubLObject d_handle;
              SubLObject deduction;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                d_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                d_handle = Vectors.aref( vector_var, d_id );
                if( NIL == id_index.id_index_tombstone_p( d_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( d_handle ) )
                  {
                    d_handle = $kw83$SKIP;
                  }
                  deduction = deduction_handles.resolve_deduction_id_value_pair( d_id, d_handle );
                  if( NIL != Hashtables.gethash_without_values( deduction, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_argument( deduction, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$65 );
                }
              }
            }
            final SubLObject idx_$70 = idx_$68;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$70 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$70 );
              SubLObject d_id2 = id_index.id_index_sparse_id_threshold( idx_$70 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$70 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( d_id2.numL( end_id ))
              {
                final SubLObject d_handle2 = Hashtables.gethash_without_values( d_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( d_handle2 ) )
                {
                  final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair( d_id2, d_handle2 );
                  if( NIL != Hashtables.gethash_without_values( deduction2, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_argument( deduction2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$65 );
                }
                d_id2 = Numbers.add( d_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$69, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
      idx = constant_handles.do_constants_table();
      mess = $str95$_large__partition_bookkeeping_inf;
      final SubLObject total_$66 = id_index.id_index_count( idx );
      sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$71 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$71, $kw83$SKIP ) )
          {
            final SubLObject idx_$72 = idx_$71;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$72, $kw83$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$72 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject constant;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                constant = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( constant ) )
                  {
                    constant = $kw83$SKIP;
                  }
                  if( NIL != Hashtables.gethash_without_values( constant, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_argument( constant, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$66 );
                }
              }
            }
            final SubLObject idx_$73 = idx_$71;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$73 ) || NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$73 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$73 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$73 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw83$SKIP ) ) ? NIL : $kw83$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw83$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
                {
                  if( NIL != Hashtables.gethash_without_values( constant2, $partition_argument_hash$.getDynamicValue( thread ), UNPROVIDED ) )
                  {
                    dump_partition_argument( constant2, stream );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$66 );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject table_var = $partition_argument_hash$.getDynamicValue( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str96$partition_arguments, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject v_object = NIL;
          SubLObject value = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              v_object = Hashtables.getEntryKey( cdohash_entry );
              value = Hashtables.getEntryValue( cdohash_entry );
              dump_partition_argument( v_object, stream );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_8, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45512L)
  public static SubLObject dump_partition_argument(final SubLObject v_object, final SubLObject stream)
  {
    if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      dump_partition_beliefs( v_object, stream );
    }
    else if( NIL != deduction_handles.deduction_p( v_object ) )
    {
      dump_partition_deduction( v_object, stream );
    }
    else if( NIL != constant_handles.constant_p( v_object ) )
    {
      dump_partition_bookkeeping_assertions_for_term( v_object, stream );
    }
    else
    {
      Errors.error( $str97$Unknown_argument_object__S, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46039L)
  public static SubLObject dump_partition_deduction(final SubLObject deduction, final SubLObject stream)
  {
    cfasl.cfasl_output( deduction_handles.deduction_id( deduction ), stream );
    cfasl.cfasl_output( arguments.argument_tv( deduction ), stream );
    cfasl.cfasl_output( deductions_high.deduction_supported_object( deduction ), stream );
    cfasl.cfasl_output( deductions_high.deduction_supports( deduction ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46328L)
  public static SubLObject dump_partition_beliefs(final SubLObject assertion, final SubLObject stream)
  {
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( assertion, stream );
    final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
    final SubLObject total_beliefs = Sequences.count_if( Symbols.symbol_function( $sym30$BELIEF_P ), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cfasl.cfasl_output( total_beliefs, stream );
    SubLObject cdolist_list_var = v_arguments;
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != arguments.belief_p( argument ) )
      {
        dump_partition_belief( argument, assertion, stream );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46771L)
  public static SubLObject dump_partition_belief(final SubLObject argument, final SubLObject assertion, final SubLObject stream)
  {
    if( NIL != arguments.asserted_argument_p( argument ) )
    {
      dump_partition_asserted_argument( argument, assertion, stream );
    }
    else
    {
      Errors.error( $str98$Unable_to_dump_belief__S, argument );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47022L)
  public static SubLObject dump_partition_asserted_argument(final SubLObject argument, final SubLObject assertion, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl.cfasl_output( $partition_asserted_argument_type_flag$.getDynamicValue( thread ), stream );
    cfasl.cfasl_output( arguments.argument_tv( argument ), stream );
    cfasl.cfasl_output( assertions_low.assertion_assert_info( assertion ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47282L)
  public static SubLObject dump_partition_bookkeeping_assertions_for_term(final SubLObject v_term, final SubLObject stream)
  {
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    final SubLObject assertibles = bookkeeping_store.bookkeeping_assertibles_on_term( v_term );
    final SubLObject how_many = Sequences.length( assertibles );
    cfasl.cfasl_output( how_many, stream );
    SubLObject cdolist_list_var = assertibles;
    SubLObject assertible = NIL;
    assertible = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dump_partition_assertible( assertible, stream );
      cdolist_list_var = cdolist_list_var.rest();
      assertible = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48004L)
  public static SubLObject dump_partition_assertible(final SubLObject assertible, final SubLObject stream)
  {
    SubLObject cnf = NIL;
    SubLObject mt = NIL;
    SubLObject strength = NIL;
    SubLObject direction = NIL;
    SubLObject variable_map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( assertible, assertible, $list99 );
    cnf = assertible.first();
    SubLObject current = assertible.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, assertible, $list99 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, assertible, $list99 );
    strength = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, assertible, $list99 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, assertible, $list99 );
    variable_map = current.first();
    current = current.rest();
    if( NIL == current )
    {
      cfasl.cfasl_output( cnf, stream );
      cfasl.cfasl_output( mt, stream );
      cfasl.cfasl_output( strength, stream );
      cfasl.cfasl_output( direction, stream );
      cfasl.cfasl_output( variable_map, stream );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( assertible, $list99 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48625L)
  public static SubLObject load_entire_kb_partition(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $partition_entire_kb_loadP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = after_adding.$after_addings_disabledP$.currentBinding( thread );
    try
    {
      $partition_entire_kb_loadP$.bind( T, thread );
      after_adding.$after_addings_disabledP$.bind( T, thread );
      result = load_partition_clean( filename, UNPROVIDED );
    }
    finally
    {
      after_adding.$after_addings_disabledP$.rebind( _prev_bind_2, thread );
      $partition_entire_kb_loadP$.rebind( _prev_bind_0, thread );
    }
    clear_partition_loader_state();
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48931L)
  public static SubLObject load_partition_clean(final SubLObject partition_filename, SubLObject reset_sbhl_linksP)
  {
    if( reset_sbhl_linksP == UNPROVIDED )
    {
      reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
    }
    load_partition( partition_filename, reset_sbhl_linksP );
    return partition_load_kb_cleanup();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49226L)
  public static SubLObject load_partitions_clean(final SubLObject partition_filename_list)
  {
    SubLObject cdolist_list_var = partition_filename_list;
    SubLObject partition_filename = NIL;
    partition_filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      load_partition( partition_filename, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      partition_filename = cdolist_list_var.first();
    }
    return partition_load_kb_cleanup();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49600L)
  public static SubLObject partition_load_kb_cleanup()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $load_partition_invalid_missing_terms$.currentBinding( thread );
    try
    {
      $load_partition_invalid_missing_terms$.bind( keyhash.new_keyhash( partition_invalid_missing_terms_count(), UNPROVIDED ), thread );
      SubLObject removed_constant_count = ZERO_INTEGER;
      SubLObject removed_nart_count = ZERO_INTEGER;
      SubLObject removed_assertion_count = ZERO_INTEGER;
      PrintLow.format( T, $str100$cleaning_up_after_partition_load_ );
      final SubLObject _prev_bind_0_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym14$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const15$EverythingPSC, thread );
        SubLObject cdolist_list_var = gather_load_partition_missing_constants();
        SubLObject constant = NIL;
        constant = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( !kb_indexing.num_gaf_arg_index( constant, ONE_INTEGER, $const101$isa, UNPROVIDED ).isPositive() )
          {
            add_load_partition_invalid_missing_term( constant );
          }
          cdolist_list_var = cdolist_list_var.rest();
          constant = cdolist_list_var.first();
        }
        if( $load_partition_max_nart_complexity$.getDynamicValue( thread ).isNumber() )
        {
          SubLObject end_var;
          SubLObject complexity;
          SubLObject cdolist_list_var2;
          SubLObject nart;
          for( end_var = Numbers.add( $load_partition_max_nart_complexity$.getDynamicValue( thread ), ONE_INTEGER ), complexity = NIL, complexity = ONE_INTEGER; !complexity.numGE( end_var ); complexity = number_utilities
              .f_1X( complexity ) )
          {
            cdolist_list_var2 = gather_load_partition_missing_narts();
            nart = NIL;
            nart = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              if( complexity.eql( function_terms.term_functional_complexity( nart ) ) && ( !kb_indexing.num_gaf_arg_index( nart, ONE_INTEGER, $const101$isa, UNPROVIDED ).isPositive() || NIL != list_utilities
                  .tree_find_if( $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_, narts_high.nart_hl_formula( nart ), UNPROVIDED ) ) )
              {
                add_load_partition_invalid_missing_term( nart );
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              nart = cdolist_list_var2.first();
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$80, thread );
      }
      SubLObject cdolist_list_var;
      SubLObject end_var2;
      SubLObject term_order;
      SubLObject assertion;
      for( end_var2 = Numbers.add( $load_partition_max_term_order$.getDynamicValue( thread ), TWO_INTEGER ), term_order = NIL, term_order = ONE_INTEGER; !term_order.numGE( end_var2 ); term_order = number_utilities.f_1X(
          term_order ) )
      {
        cdolist_list_var = gather_load_partition_missing_assertions();
        assertion = NIL;
        assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( term_order.eql( kb_utilities.term_order( assertion ) ) && ( NIL != load_partition_invalid_missing_termP( hlmt.hlmt_monad_mt( assertions_high.assertion_mt( assertion ) ) ) || NIL != list_utilities
              .tree_find_if( $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_, assertions_high.assertion_cnf( assertion ), UNPROVIDED ) ) )
          {
            add_load_partition_invalid_missing_term( assertion );
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion = cdolist_list_var.first();
        }
      }
      SubLObject cdolist_list_var3 = gather_load_partition_missing_assertions();
      SubLObject assertion2 = NIL;
      assertion2 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        if( NIL != load_partition_invalid_missing_termP( assertion2 ) )
        {
          removed_assertion_count = Numbers.add( removed_assertion_count, ONE_INTEGER );
          tms.tms_remove_assertion( assertion2 );
        }
        cdolist_list_var3 = cdolist_list_var3.rest();
        assertion2 = cdolist_list_var3.first();
      }
      if( $load_partition_max_nart_complexity$.getDynamicValue( thread ).isNumber() )
      {
        SubLObject complexity2;
        SubLObject nart2;
        for( end_var2 = ZERO_INTEGER, complexity2 = NIL, complexity2 = $load_partition_max_nart_complexity$.getDynamicValue( thread ); !complexity2.numLE( end_var2 ); complexity2 = Numbers.add( complexity2,
            MINUS_ONE_INTEGER ) )
        {
          cdolist_list_var = gather_load_partition_missing_narts();
          nart2 = NIL;
          nart2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( complexity2.eql( function_terms.term_functional_complexity( nart2 ) ) && NIL != load_partition_invalid_missing_termP( nart2 ) )
            {
              removed_nart_count = Numbers.add( removed_nart_count, ONE_INTEGER );
              narts_high.remove_nart( nart2 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            nart2 = cdolist_list_var.first();
          }
        }
      }
      cdolist_list_var3 = gather_load_partition_missing_constants();
      SubLObject constant2 = NIL;
      constant2 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        if( NIL != load_partition_invalid_missing_termP( constant2 ) )
        {
          removed_constant_count = Numbers.add( removed_constant_count, ONE_INTEGER );
          constants_high.remove_constant( constant2 );
        }
        cdolist_list_var3 = cdolist_list_var3.rest();
        constant2 = cdolist_list_var3.first();
      }
      PrintLow.format( T, $str103$partition_load_KB_cleanup_removed );
      PrintLow.format( T, $str104$__A_constants__, removed_constant_count );
      PrintLow.format( T, $str105$__A_NARTs__, removed_nart_count );
      PrintLow.format( T, $str106$__A_assertions__, removed_assertion_count );
    }
    finally
    {
      $load_partition_invalid_missing_terms$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52209L)
  public static SubLObject partition_invalid_missing_terms_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.add( new SubLObject[] { $load_partition_constants$.getDynamicValue( thread ).isHashtable() ? Hashtables.hash_table_count( $load_partition_constants$.getDynamicValue( thread ) ) : ZERO_INTEGER,
      $load_partition_narts$.getDynamicValue( thread ).isHashtable() ? Hashtables.hash_table_count( $load_partition_narts$.getDynamicValue( thread ) ) : ZERO_INTEGER, $load_partition_assertions$.getDynamicValue( thread )
          .isHashtable() ? Hashtables.hash_table_count( $load_partition_assertions$.getDynamicValue( thread ) ) : ZERO_INTEGER, $load_partition_kb_hl_supports$.getDynamicValue( thread ).isHashtable() ? Hashtables
              .hash_table_count( $load_partition_kb_hl_supports$.getDynamicValue( thread ) ) : ZERO_INTEGER
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52741L)
  public static SubLObject load_partition_invalid_missing_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return keyhash.getkeyhash( v_term, $load_partition_invalid_missing_terms$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52868L)
  public static SubLObject add_load_partition_invalid_missing_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    keyhash.setkeyhash( v_term, $load_partition_invalid_missing_terms$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53255L)
  public static SubLObject load_partition(final SubLObject filename, SubLObject reset_sbhl_linksP)
  {
    if( reset_sbhl_linksP == UNPROVIDED )
    {
      reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject success = NIL;
    if( NIL != Filesys.probe_file( filename ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw107$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str58$Unable_to_open__S, filename );
        }
        final SubLObject stream_$81 = stream;
        if( ZERO_INTEGER.numE( streams_high.file_length( stream_$81 ) ) )
        {
          success = T;
        }
        else
        {
          success = load_partition_from_stream( stream_$81, reset_sbhl_linksP );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54063L)
  public static SubLObject load_partition_from_stream(final SubLObject stream, SubLObject reset_sbhl_linksP)
  {
    if( reset_sbhl_linksP == UNPROVIDED )
    {
      reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject success = NIL;
    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( SIX_INTEGER );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
      try
      {
        final SubLObject _prev_bind_0_$82 = control_vars.$bootstrapping_kbP$.currentBinding( thread );
        final SubLObject _prev_bind_1_$83 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
        final SubLObject _prev_bind_2_$84 = control_vars.$within_assert$.currentBinding( thread );
        final SubLObject _prev_bind_4 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_5 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
        final SubLObject _prev_bind_7 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = wff_utilities.$check_var_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_9 = czer_vars.$simplify_literalP$.currentBinding( thread );
        final SubLObject _prev_bind_10 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
        final SubLObject _prev_bind_11 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = wff_vars.$validate_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_13 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
        final SubLObject _prev_bind_14 = wff_utilities.$check_arityP$.currentBinding( thread );
        final SubLObject _prev_bind_15 = cycl_grammar.$grammar_uses_kbP$.currentBinding( thread );
        try
        {
          control_vars.$bootstrapping_kbP$.bind( T, thread );
          kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
          control_vars.$within_assert$.bind( NIL, thread );
          wff_utilities.$check_arg_typesP$.bind( NIL, thread );
          at_vars.$at_check_arg_typesP$.bind( NIL, thread );
          wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
          wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
          wff_utilities.$check_var_typesP$.bind( NIL, thread );
          czer_vars.$simplify_literalP$.bind( NIL, thread );
          at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
          at_vars.$at_check_arg_formatP$.bind( NIL, thread );
          wff_vars.$validate_constantsP$.bind( NIL, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
          wff_utilities.$check_arityP$.bind( NIL, thread );
          cycl_grammar.$grammar_uses_kbP$.bind( NIL, thread );
          final SubLObject format = load_partition_info( stream );
          final SubLObject _prev_bind_0_$83 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols( load_partition_special_objects( stream ) );
            final SubLObject _prev_bind_0_$84 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
            final SubLObject _prev_bind_1_$84 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
            final SubLObject _prev_bind_2_$85 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
            final SubLObject _prev_bind_3_$89 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
            try
            {
              api_control_vars.$cfasl_constant_handle_lookup_func$.bind( $sym108$PARTITION_FIND_CONSTANT_BY_ID, thread );
              api_control_vars.$cfasl_nart_handle_lookup_func$.bind( $sym109$PARTITION_FIND_NART_BY_ID, thread );
              api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( $sym110$PARTITION_FIND_ASSERTION_BY_ID, thread );
              api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( $sym111$PARTITION_FIND_KB_HL_SUPPORT_BY_ID, thread );
              load_partition_constant_shells( stream );
              load_partition_nart_shells( stream );
              if( NIL != $partition_entire_kb_loadP$.getDynamicValue( thread ) )
              {
                hl_storage_modules.reclassify_hl_storage_modules();
              }
              load_partition_assertions( stream );
              if( NIL != partition_formats_compatibleP( $str76$2_2, format ) )
              {
                load_partition_kb_hl_supports( stream );
              }
              load_partition_arguments( stream );
              if( NIL != reset_sbhl_linksP )
              {
                reset_sbhl_links_for_partition_forts();
              }
              success = T;
            }
            finally
            {
              api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_3_$89, thread );
              api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_2_$85, thread );
              api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_1_$84, thread );
              api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0_$84, thread );
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0_$83, thread );
          }
        }
        finally
        {
          cycl_grammar.$grammar_uses_kbP$.rebind( _prev_bind_15, thread );
          wff_utilities.$check_arityP$.rebind( _prev_bind_14, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_13, thread );
          wff_vars.$validate_constantsP$.rebind( _prev_bind_12, thread );
          at_vars.$at_check_arg_formatP$.rebind( _prev_bind_11, thread );
          at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_10, thread );
          czer_vars.$simplify_literalP$.rebind( _prev_bind_9, thread );
          wff_utilities.$check_var_typesP$.rebind( _prev_bind_8, thread );
          wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_7, thread );
          wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_6, thread );
          at_vars.$at_check_arg_typesP$.rebind( _prev_bind_5, thread );
          wff_utilities.$check_arg_typesP$.rebind( _prev_bind_4, thread );
          control_vars.$within_assert$.rebind( _prev_bind_2_$84, thread );
          kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_1_$83, thread );
          control_vars.$bootstrapping_kbP$.rebind( _prev_bind_0_$82, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$85, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0, thread );
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55436L)
  public static SubLObject load_partition_info(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject copyright_notice = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject format = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject system = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject patch_level = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject date = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.stringp( copyright_notice ) : copyright_notice;
    assert NIL != Types.atom( format ) : format;
    assert NIL != Types.integerp( system ) : system;
    assert NIL != Types.integerp( patch_level ) : patch_level;
    assert NIL != Types.integerp( date ) : date;
    if( NIL == partition_formats_compatibleP( format, $dump_partition_format$.getDynamicValue( thread ) ) )
    {
      Errors.error( $str114$partition_format_is__A__not__A__a, format, $dump_partition_format$.getDynamicValue( thread ) );
    }
    return format;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56047L)
  public static SubLObject partition_formats_compatibleP(final SubLObject file_format, final SubLObject code_format)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( file_format.equal( code_format ) || NIL != conses_high.member( ConsesLow.list( file_format, code_format ), $backwards_compatibility_pairs$.getDynamicValue( thread ), Symbols.symbol_function(
        EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56252L)
  public static SubLObject load_partition_section_marker(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw115$EOF;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject marker = cfasl.cfasl_input( stream, eof_error_p, eof_value );
    if( marker.eql( eof_value ) )
    {
      return eof_value;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !marker.eql( $partition_section_marker$.getDynamicValue( thread ) ) )
    {
      Errors.error( $str116$malformed_partition_file );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56569L)
  public static SubLObject load_partition_special_objects(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_common_symbols$.bind( NIL, thread );
      cfasl.cfasl_set_common_symbols( NIL );
      ans = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56733L)
  public static SubLObject reset_sbhl_links_for_partition_forts()
  {
    final SubLObject constants = gather_load_partition_scope_constants();
    final SubLObject narts = gather_load_partition_scope_narts();
    final SubLObject v_forts = ConsesLow.nconc( constants, narts );
    sbhl_link_methods.sbhl_recompute_links_of_nodes( v_forts );
    return Sequences.length( v_forts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57009L)
  public static SubLObject load_partition_constant_shells(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    load_partition_section_marker( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject total = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( total ) : total;
    clear_load_partition_constants( total );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str117$loading_partition_constant_shells, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( total, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          load_partition_constant_shell( stream );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57370L)
  public static SubLObject load_partition_constant_shell(final SubLObject stream)
  {
    final SubLObject id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject name = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject guid = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject scopeP = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( id ) : id;
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.atom( scopeP ) : scopeP;
    assert NIL != Guids.guid_p( guid ) : guid;
    link_partition_constant_shell( id, name, guid, scopeP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57751L)
  public static SubLObject load_partition_nart_shells(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_nart_level = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( max_nart_level ) : max_nart_level;
    if( max_nart_level.numG( $load_partition_max_nart_complexity$.getDynamicValue( thread ) ) )
    {
      $load_partition_max_nart_complexity$.setDynamicValue( max_nart_level, thread );
    }
    if( ZERO_INTEGER.numE( max_nart_level ) )
    {
      clear_load_partition_narts( $int12$100 );
    }
    else
    {
      SubLObject index;
      SubLObject nart_level;
      for( index = NIL, index = ZERO_INTEGER; index.numL( max_nart_level ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        nart_level = Numbers.add( index, ONE_INTEGER );
        load_partition_nart_order_set( nart_level, stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58369L)
  public static SubLObject load_partition_nart_order_set(final SubLObject nart_level, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    load_partition_section_marker( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject total = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( total ) : total;
    if( nart_level.numE( ONE_INTEGER ) )
    {
      clear_load_partition_narts( total );
    }
    final SubLObject message = Sequences.cconcatenate( $str119$loading_partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( nart_level ), $str120$_narts
    } );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( message, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( total, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          load_partition_nart_shell( stream );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58794L)
  public static SubLObject load_partition_nart_shell(final SubLObject stream)
  {
    final SubLObject id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject hl_formula = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject scopeP = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( id ) : id;
    assert NIL != el_utilities.possibly_naut_p( hl_formula ) : hl_formula;
    assert NIL != Types.atom( scopeP ) : scopeP;
    link_partition_nart_shell( id, hl_formula, scopeP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59133L)
  public static SubLObject load_partition_assertions(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_term_order = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( max_term_order ) : max_term_order;
    if( max_term_order.numG( $load_partition_max_term_order$.getDynamicValue( thread ) ) )
    {
      $load_partition_max_term_order$.setDynamicValue( max_term_order, thread );
    }
    SubLObject term_order;
    SubLObject meta_order;
    for( term_order = NIL, term_order = ZERO_INTEGER; term_order.numL( max_term_order ); term_order = Numbers.add( term_order, ONE_INTEGER ) )
    {
      meta_order = Numbers.add( term_order, ONE_INTEGER );
      if( meta_order.numE( ONE_INTEGER ) )
      {
        load_partition_simple_assertions( meta_order, stream );
      }
      else
      {
        load_partition_meta_assertions( meta_order, stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59657L)
  public static SubLObject load_partition_simple_assertions(final SubLObject meta_order, final SubLObject stream)
  {
    return load_partition_assertion_order_set( meta_order, $str122$loading_partition_assertions, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59824L)
  public static SubLObject load_partition_meta_assertions(final SubLObject meta_order, final SubLObject stream)
  {
    final SubLObject message = Sequences.cconcatenate( $str123$loading_partition_order_, new SubLObject[] { format_nil.format_nil_s_no_copy( meta_order ), $str124$_meta_assertions
    } );
    return load_partition_assertion_order_set( meta_order, message, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60060L)
  public static SubLObject load_partition_assertion_order_set(final SubLObject meta_order, final SubLObject message, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    load_partition_section_marker( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject total = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( total ) : total;
    if( meta_order.numE( ONE_INTEGER ) )
    {
      clear_load_partition_assertions( total );
    }
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( message, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( total, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          load_partition_assertion( stream );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$93, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60423L)
  public static SubLObject load_partition_assertion(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject scope_termP = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject cnf = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject mt = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject direction = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject vnames = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( !id.isInteger() )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str125$Skipping_assertion_with_bad_id__A, new SubLObject[] { id, scope_termP, cnf, mt, direction, vnames
        } );
      }
      return NIL;
    }
    if( NIL == clauses.cnf_p( cnf ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str126$Skipping_assertion_with_bad_cnf__, new SubLObject[] { cnf, id, scope_termP, mt, direction, vnames
        } );
      }
      return NIL;
    }
    if( NIL == hlmt.possibly_hlmt_p( mt ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str127$Skipping_assertion_with_bad_mt__S, new SubLObject[] { mt, id, scope_termP, cnf, direction, vnames
        } );
      }
      return NIL;
    }
    if( NIL == enumeration_types.direction_p( direction ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str128$Skipping_assertion_with_bad_direc, new SubLObject[] { direction, id, scope_termP, cnf, mt, vnames
        } );
      }
      return NIL;
    }
    if( !vnames.isList() )
    {
      Errors.warn( $str129$Skipping_assertion_with_bad_vname, new SubLObject[] { vnames, id, scope_termP, cnf, mt, direction
      } );
      return NIL;
    }
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      SubLObject message_var = NIL;
      final SubLObject was_appendingP = Eval.eval( $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list131 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym132$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              link_partition_assertion( id, cnf, mt, scope_termP, direction, vnames );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym133$CSETQ, $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str134$_A, message_var );
      }
    }
    else
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw135$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym136$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            link_partition_assertion( id, cnf, mt, scope_termP, direction, vnames );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_3, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw135$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62025L)
  public static SubLObject load_partition_kb_hl_supports(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_kb_hl_support_level = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( max_kb_hl_support_level ) : max_kb_hl_support_level;
    if( max_kb_hl_support_level.numG( $load_partition_max_kb_hl_support_order$.getDynamicValue( thread ) ) )
    {
      $load_partition_max_kb_hl_support_order$.setDynamicValue( max_kb_hl_support_level, thread );
    }
    if( ZERO_INTEGER.numE( max_kb_hl_support_level ) )
    {
      clear_load_partition_kb_hl_supports( $int12$100 );
    }
    else
    {
      SubLObject index;
      SubLObject kb_hl_support_level;
      for( index = NIL, index = ZERO_INTEGER; index.numL( max_kb_hl_support_level ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        kb_hl_support_level = Numbers.add( ONE_INTEGER, index );
        load_partition_kb_hl_support_order_set( kb_hl_support_level, stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62631L)
  public static SubLObject load_partition_kb_hl_support_order_set(final SubLObject level, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    load_partition_section_marker( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject total = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( total ) : total;
    if( level.numE( ONE_INTEGER ) )
    {
      clear_load_partition_kb_hl_supports( total );
    }
    final SubLObject message = Sequences.cconcatenate( $str119$loading_partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( level ), $str92$_KB_HL_supports
    } );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( message, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( total, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          load_partition_kb_hl_support( stream );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63071L)
  public static SubLObject load_partition_kb_hl_support(final SubLObject stream)
  {
    final SubLObject id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject scopeP = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject hl_support = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject justification = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( id ) : id;
    assert NIL != arguments.hl_support_p( hl_support ) : hl_support;
    assert NIL != arguments.hl_justification_p( justification ) : justification;
    link_partition_kb_hl_support( id, hl_support, justification, scopeP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63494L)
  public static SubLObject load_partition_arguments(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    load_partition_section_marker( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject total = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != Types.integerp( total ) : total;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str139$loading_partition_arguments, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( total, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          load_partition_argument( stream );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$95, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63788L)
  public static SubLObject load_partition_argument(final SubLObject stream)
  {
    final SubLObject id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL == id )
    {
      load_partition_beliefs( stream );
    }
    else
    {
      load_partition_deduction( stream, id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63981L)
  public static SubLObject load_partition_beliefs(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL == assertion )
    {
      load_some_partition_bookkeeping_assertions( stream );
    }
    else
    {
      final SubLObject total = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
      assert NIL != Types.integerp( total ) : total;
      SubLObject i;
      SubLObject type;
      for( i = NIL, i = ZERO_INTEGER; i.numL( total ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        type = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
        assert NIL != Types.keywordp( type ) : type;
        if( type.eql( $partition_asserted_argument_type_flag$.getDynamicValue( thread ) ) )
        {
          load_partition_asserted_argument( assertion, stream );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64508L)
  public static SubLObject load_partition_asserted_argument(final SubLObject assertion, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tv = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject assert_info = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL == assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str140$Skipping_asserted_argument_for_ba, assertion );
      }
      return NIL;
    }
    if( NIL == enumeration_types.tv_p( tv ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str141$Skipping_asserted_argument_for_as, assertion_handles.assertion_id( assertion ), tv, assertion );
      }
      return NIL;
    }
    if( !assert_info.isList() )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str142$Skipping_asserted_argument_for_as, assertion_handles.assertion_id( assertion ), assert_info, assertion );
      }
      return NIL;
    }
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      SubLObject message_var = NIL;
      final SubLObject was_appendingP = Eval.eval( $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list131 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym132$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              link_partition_asserted_argument( assertion, tv, assert_info );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym133$CSETQ, $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str134$_A, message_var );
      }
    }
    else
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw135$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym136$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            link_partition_asserted_argument( assertion, tv, assert_info );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_3, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw135$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65455L)
  public static SubLObject load_partition_deduction(final SubLObject stream, SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tv = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject assertion = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject supports = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL == enumeration_types.tv_p( tv ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str143$Skipping_deduction__id__A__with_b, new SubLObject[] { id, tv, assertion, supports
        } );
      }
      return NIL;
    }
    if( NIL == assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str144$Skipping_deduction__id__A__with_b, new SubLObject[] { id, assertion, tv, supports
        } );
      }
      return NIL;
    }
    if( !supports.isCons() )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str145$Skipping_deduction__id__A__with_b, new SubLObject[] { id, supports, tv, assertion
        } );
      }
      return NIL;
    }
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      SubLObject message_var = NIL;
      final SubLObject was_appendingP = Eval.eval( $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list131 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym132$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              supports = load_partition_possibly_weaken_hl_supports( supports );
              link_partition_deduction( assertion, supports, tv );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym133$CSETQ, $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str134$_A, message_var );
      }
    }
    else
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw135$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym136$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            supports = load_partition_possibly_weaken_hl_supports( supports );
            link_partition_deduction( assertion, supports, tv );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_3, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw135$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66450L)
  public static SubLObject load_some_partition_bookkeeping_assertions(final SubLObject stream)
  {
    SubLObject how_many;
    SubLObject i;
    for( how_many = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ), i = NIL, i = ZERO_INTEGER; i.numL( how_many ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      load_partition_assertible( stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66644L)
  public static SubLObject load_partition_assertible(final SubLObject stream)
  {
    final SubLObject cnf = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject mt = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject strength = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject direction = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject variable_map = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    assert NIL != hlmt.possibly_hlmt_p( mt ) : mt;
    assert NIL != enumeration_types.el_strength_p( strength ) : strength;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    assert NIL != Types.listp( variable_map ) : variable_map;
    return link_partition_assertible( cnf, mt, strength, direction, variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67335L)
  public static SubLObject load_partition_possibly_weaken_hl_supports(final SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $load_partition_weaken_hl_supports$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = supports;
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != arguments.hl_support_p( support ) )
        {
          final SubLObject module = arguments.hl_support_module( support );
          final SubLObject weaker_module = list_utilities.alist_lookup_without_values( $load_partition_weaken_hl_supports$.getDynamicValue( thread ), module, Symbols.symbol_function( EQL ), UNPROVIDED );
          if( NIL != weaker_module )
          {
            replace_hl_support_module( support, weaker_module );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67770L)
  public static SubLObject replace_hl_support_module(final SubLObject hl_support, final SubLObject new_module)
  {
    assert NIL != arguments.hl_support_p( hl_support ) : hl_support;
    ConsesLow.rplaca( hl_support, new_module );
    assert NIL != arguments.hl_support_p( hl_support ) : hl_support;
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68812L)
  public static SubLObject clear_load_partition_constants(final SubLObject total)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$load_partition_constants$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_constants$.setDynamicValue( new_load_partition_constants_store( total ), thread );
    }
    if( NIL == $preseeded_partition_constants$.getDynamicValue( thread ) )
    {
      Hashtables.clrhash( $load_partition_constants$.getDynamicValue( thread ) );
    }
    if( !$load_partition_scope_constants$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_scope_constants$.setDynamicValue( new_load_partition_scope_constants_store( total ), thread );
    }
    Hashtables.clrhash( $load_partition_scope_constants$.getDynamicValue( thread ) );
    if( !$load_partition_missing_constants$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_missing_constants$.setDynamicValue( new_load_paritition_missing_constants_store( total ), thread );
    }
    Hashtables.clrhash( $load_partition_missing_constants$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69597L)
  public static SubLObject new_load_partition_constants_store(final SubLObject total)
  {
    return Hashtables.make_hash_table( total, Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69698L)
  public static SubLObject new_load_partition_scope_constants_store(final SubLObject total)
  {
    return Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69813L)
  public static SubLObject new_load_paritition_missing_constants_store(final SubLObject total)
  {
    return Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 69937L)
  public static SubLObject gather_load_partition_scope_constants()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return hash_table_utilities.hash_table_values( $load_partition_scope_constants$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70058L)
  public static SubLObject gather_load_partition_missing_constants()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $load_partition_scope_constants$.getDynamicValue( thread ).isHashtable() )
    {
      return hash_table_utilities.hash_table_values( $load_partition_missing_constants$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70260L)
  public static SubLObject note_load_partition_constant(final SubLObject id, final SubLObject constant, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $preseeded_partition_constants$.getDynamicValue( thread ) || NIL == Hashtables.gethash_without_values( id, $load_partition_constants$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( id, $load_partition_constants$.getDynamicValue( thread ), constant );
    }
    if( NIL != scopeP )
    {
      Hashtables.sethash( id, $load_partition_scope_constants$.getDynamicValue( thread ), constant );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70646L)
  public static SubLObject note_load_partition_missing_constant(final SubLObject id, final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_missing_constants$.getDynamicValue( thread ), constant );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70809L)
  public static SubLObject partition_find_constant_by_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constant = Hashtables.gethash_without_values( id, $load_partition_constants$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == constant )
    {
      constant = partition_missing_constant_link_error( id );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71158L)
  public static SubLObject partition_missing_constant_link_error(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str151$Did_not_find_constant__D_, id );
    }
    final SubLObject invalid_constant = constant_handles.partition_create_invalid_constant();
    note_load_partition_constant( id, invalid_constant, NIL );
    note_load_partition_missing_constant( id, invalid_constant );
    return invalid_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 71516L)
  public static SubLObject link_partition_constant_shell(final SubLObject id, final SubLObject name, final SubLObject external_id, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      SubLObject constant = NIL;
      if( NIL != scopeP )
      {
        final SubLObject existing_by_id = constants_high.find_constant_by_external_id( external_id );
        final SubLObject existing_by_name = constants_high.find_constant( name );
        if( NIL != constant_handles.constant_p( existing_by_id ) )
        {
          if( NIL != constant_handles.constant_p( existing_by_name ) )
          {
            if( existing_by_id.eql( existing_by_name ) )
            {
              constant = existing_by_id;
            }
            else
            {
              constant = link_partition_constant_error_1( name, external_id );
            }
          }
          else
          {
            constant = link_partition_constant_error_2( name, external_id );
          }
        }
        else if( NIL != constant_handles.constant_p( existing_by_name ) )
        {
          constant = link_partition_constant_error_3( name, external_id );
        }
        else
        {
          constant = link_partition_create_constant( name, external_id );
        }
      }
      else
      {
        final SubLObject existing_by_id = constants_high.find_constant_by_external_id( external_id );
        final SubLObject existing_by_name = constants_high.find_constant( name );
        if( NIL != constant_handles.constant_p( existing_by_id ) )
        {
          if( NIL != constant_handles.constant_p( existing_by_name ) )
          {
            if( existing_by_id.eql( existing_by_name ) )
            {
              constant = existing_by_id;
            }
            else
            {
              constant = link_partition_constant_error_4( name, external_id );
            }
          }
          else
          {
            constant = link_partition_constant_error_5( name, external_id );
          }
        }
        else if( NIL != constant_handles.constant_p( existing_by_name ) )
        {
          constant = link_partition_constant_error_6( name, external_id );
          note_load_partition_missing_constant( id, constant );
        }
        else
        {
          constant = link_partition_constant_error_7( name, external_id );
          note_load_partition_missing_constant( id, constant );
        }
      }
      assert NIL != constant_handles.constant_p( constant ) : constant;
      note_load_partition_constant( id, constant, scopeP );
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73697L)
  public static SubLObject link_partition_create_constant(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      return constants_high.find_or_create_constant( name, external_id );
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73909L)
  public static SubLObject link_partition_install_constant_id(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      return constants_high.find_or_create_constant( name, external_id );
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74132L)
  public static SubLObject preseed_load_partition_constants_store(final SubLObject pre_seeding, SubLObject scoped_map)
  {
    if( scoped_map == UNPROVIDED )
    {
      scoped_map = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = NIL;
    SubLObject constant = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( pre_seeding );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        id = Hashtables.getEntryKey( cdohash_entry );
        constant = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject scopedP = scoped_map.isHashtable() ? Hashtables.gethash_without_values( id, scoped_map, UNPROVIDED ) : NIL;
        final SubLObject _prev_bind_0 = $preseeded_partition_constants$.currentBinding( thread );
        try
        {
          $preseeded_partition_constants$.bind( NIL, thread );
          note_load_partition_constant( id, constant, scopedP );
        }
        finally
        {
          $preseeded_partition_constants$.rebind( _prev_bind_0, thread );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74628L)
  public static SubLObject with_preseeded_partition_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pre_seeding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    pre_seeding = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$96 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list154 );
      current_$96 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list154 );
      if( NIL == conses_high.member( current_$96, $list155, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$96 == $kw156$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list154 );
    }
    final SubLObject expected_total_tail = cdestructuring_bind.property_list_member( $kw157$EXPECTED_TOTAL, current );
    final SubLObject expected_total = ( NIL != expected_total_tail ) ? conses_high.cadr( expected_total_tail ) : $int12$100;
    final SubLObject scoped_map_tail = cdestructuring_bind.property_list_member( $kw158$SCOPED_MAP, current );
    final SubLObject scoped_map = ( NIL != scoped_map_tail ) ? conses_high.cadr( scoped_map_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym159$CLET, ConsesLow.list( $list160, ConsesLow.list( $sym161$_LOAD_PARTITION_CONSTANTS_, ConsesLow.list( $sym162$NEW_LOAD_PARTITION_CONSTANTS_STORE, expected_total ) ), ConsesLow.list(
        $sym163$_LOAD_PARTITION_SCOPE_CONSTANTS_, ConsesLow.list( $sym164$FWHEN, ConsesLow.list( $sym165$HASH_TABLE_P, scoped_map ), ConsesLow.list( $sym166$NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE,
            expected_total ) ) ) ), ConsesLow.list( $sym167$PRESEED_LOAD_PARTITION_CONSTANTS_STORE, pre_seeding, scoped_map ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75187L)
  public static SubLObject load_partition_from_stream_with_preseeding(final SubLObject stream, final SubLObject preseeding, SubLObject reset_sbhl_linksP)
  {
    if( reset_sbhl_linksP == UNPROVIDED )
    {
      reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $preseeded_partition_constants$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $load_partition_constants$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $load_partition_scope_constants$.currentBinding( thread );
    try
    {
      $preseeded_partition_constants$.bind( T, thread );
      $load_partition_constants$.bind( new_load_partition_constants_store( $int12$100 ), thread );
      $load_partition_scope_constants$.bind( NIL.isHashtable() ? new_load_partition_scope_constants_store( $int12$100 ) : NIL, thread );
      preseed_load_partition_constants_store( preseeding, NIL );
      result = load_partition_from_stream( stream, reset_sbhl_linksP );
    }
    finally
    {
      $load_partition_scope_constants$.rebind( _prev_bind_3, thread );
      $load_partition_constants$.rebind( _prev_bind_2, thread );
      $preseeded_partition_constants$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75614L)
  public static SubLObject link_partition_constant_error_1(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing = constants_high.find_constant_by_external_id( external_id );
    final SubLObject new_name = constants_high.constant_name( existing );
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str168$NAME_change_for__S___new_name_is_, name, new_name );
    }
    return existing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76222L)
  public static SubLObject link_partition_constant_error_2(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing = constants_high.find_constant_by_external_id( external_id );
    final SubLObject new_name = constants_high.constant_name( existing );
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str168$NAME_change_for__S___new_name_is_, name, new_name );
    }
    return existing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76520L)
  public static SubLObject link_partition_constant_error_3(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constants_high.uninstalled_constant_p( constants_high.find_constant( name ) ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str169$installing_ID__S_for__S, external_id, name );
      }
      return link_partition_install_constant_id( name, external_id );
    }
    final SubLObject new_name = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str170$NAME_clash_for__S___renaming_to__, name, new_name );
    }
    return link_partition_create_constant( new_name, external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77121L)
  public static SubLObject link_partition_constant_error_4(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing = constants_high.find_constant_by_external_id( external_id );
    final SubLObject new_name = constants_high.constant_name( existing );
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str168$NAME_change_for__S___new_name_is_, name, new_name );
    }
    return existing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77699L)
  public static SubLObject link_partition_constant_error_5(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing = constants_high.find_constant_by_external_id( external_id );
    final SubLObject new_name = constants_high.constant_name( existing );
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str168$NAME_change_for__S___new_name_is_, name, new_name );
    }
    return existing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77997L)
  public static SubLObject link_partition_constant_error_6(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constants_high.uninstalled_constant_p( constants_high.find_constant( name ) ) )
    {
      if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
      {
        Errors.warn( $str169$installing_ID__S_for__S, external_id, name );
      }
      return link_partition_install_constant_id( name, external_id );
    }
    final SubLObject new_name = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str170$NAME_clash_for__S___renaming_to__, name, new_name );
    }
    return link_partition_create_constant( new_name, external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78598L)
  public static SubLObject link_partition_constant_error_7(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str171$Constant_with_NAME__S_and_ID__S_m, name, external_id );
    }
    return link_partition_create_constant( name, external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79267L)
  public static SubLObject clear_load_partition_narts(final SubLObject total)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$load_partition_narts$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_narts$.setDynamicValue( Hashtables.make_hash_table( total, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_narts$.getDynamicValue( thread ) );
    if( !$load_partition_scope_narts$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_scope_narts$.setDynamicValue( Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_scope_narts$.getDynamicValue( thread ) );
    if( !$load_partition_missing_narts$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_missing_narts$.setDynamicValue( Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), UNPROVIDED, UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_missing_narts$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79920L)
  public static SubLObject gather_load_partition_scope_narts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return hash_table_utilities.hash_table_values( $load_partition_scope_narts$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80032L)
  public static SubLObject gather_load_partition_missing_narts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $load_partition_missing_narts$.getDynamicValue( thread ).isHashtable() )
    {
      return hash_table_utilities.hash_table_values( $load_partition_missing_narts$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80224L)
  public static SubLObject note_load_partition_nart(final SubLObject id, final SubLObject nart, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_narts$.getDynamicValue( thread ), nart );
    if( NIL != scopeP )
    {
      Hashtables.sethash( id, $load_partition_scope_narts$.getDynamicValue( thread ), nart );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80453L)
  public static SubLObject note_load_partition_missing_nart(final SubLObject id, final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_missing_narts$.getDynamicValue( thread ), nart );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80600L)
  public static SubLObject partition_find_nart_by_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nart = Hashtables.gethash_without_values( id, $load_partition_narts$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == nart )
    {
      nart = partition_missing_nart_link_error( id );
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80917L)
  public static SubLObject link_partition_nart_shell(final SubLObject id, final SubLObject nart_hl_formula, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      SubLObject nart = narts_high.find_nart( nart_hl_formula );
      if( NIL == nart_handles.nart_p( nart ) )
      {
        if( NIL == scopeP && NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
        {
          Errors.warn( $str172$Non_scope_NART__S_not_found_, nart_hl_formula );
        }
        nart = link_partition_create_nart_shell( nart_hl_formula );
        note_load_partition_missing_nart( id, nart );
      }
      note_load_partition_nart( id, nart, scopeP );
      return nart;
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81404L)
  public static SubLObject link_partition_create_nart_shell(final SubLObject nart_hl_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      return narts_interface.kb_create_nart( nart_hl_formula );
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81561L)
  public static SubLObject partition_missing_nart_link_error(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str173$Did_not_find_NART__D_, id );
    }
    final SubLObject invalid_nart = nart_handles.partition_create_invalid_nart();
    note_load_partition_nart( id, invalid_nart, NIL );
    note_load_partition_missing_nart( id, invalid_nart );
    return invalid_nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82292L)
  public static SubLObject clear_load_partition_assertions(final SubLObject total)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$load_partition_assertions$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_assertions$.setDynamicValue( Hashtables.make_hash_table( total, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_assertions$.getDynamicValue( thread ) );
    if( !$load_partition_missing_assertions$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_missing_assertions$.setDynamicValue( Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), UNPROVIDED, UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_missing_assertions$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82774L)
  public static SubLObject gather_load_partition_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return hash_table_utilities.hash_table_values( $load_partition_assertions$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82884L)
  public static SubLObject gather_load_partition_missing_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $load_partition_missing_assertions$.getDynamicValue( thread ).isHashtable() )
    {
      return hash_table_utilities.hash_table_values( $load_partition_missing_assertions$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83091L)
  public static SubLObject note_load_partition_assertion(final SubLObject id, final SubLObject assertion, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_assertions$.getDynamicValue( thread ), assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83327L)
  public static SubLObject note_load_partition_missing_assertion(final SubLObject id, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_missing_assertions$.getDynamicValue( thread ), assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83494L)
  public static SubLObject partition_find_assertion_by_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertion = Hashtables.gethash_without_values( id, $load_partition_assertions$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == assertion )
    {
      assertion = partition_missing_assertion_link_error( id );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 83851L)
  public static SubLObject link_partition_assertion(final SubLObject id, final SubLObject cnf, final SubLObject mt, final SubLObject scopeP, final SubLObject direction, final SubLObject vnames)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      SubLObject assertion = kb_indexing.find_assertion( cnf, mt );
      if( NIL == assertion )
      {
        if( NIL == scopeP && NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
        {
          Errors.warn( $str174$Non_scope_assertion__S___S__not_f, cnf, mt );
        }
        assertion = link_partition_create_assertion_shell( cnf, mt, vnames, direction );
        note_load_partition_missing_assertion( id, assertion );
      }
      note_load_partition_assertion( id, assertion, scopeP );
      return assertion;
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84386L)
  public static SubLObject link_partition_create_assertion_shell(final SubLObject cnf, final SubLObject mt, final SubLObject vnames, final SubLObject direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      return assertions_high.create_assertion( cnf, mt, vnames, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 84566L)
  public static SubLObject partition_missing_assertion_link_error(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str175$Did_not_find_assertion__D_, id );
    }
    final SubLObject invalid_assertion = assertion_handles.partition_create_invalid_assertion();
    note_load_partition_assertion( id, invalid_assertion, NIL );
    note_load_partition_missing_assertion( id, invalid_assertion );
    return invalid_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85235L)
  public static SubLObject clear_load_partition_kb_hl_supports(final SubLObject total)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$load_partition_kb_hl_supports$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_kb_hl_supports$.setDynamicValue( Hashtables.make_hash_table( total, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_kb_hl_supports$.getDynamicValue( thread ) );
    if( !$load_partition_scope_kb_hl_supports$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_scope_kb_hl_supports$.setDynamicValue( Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    }
    if( !$load_partition_missing_kb_hl_supports$.getDynamicValue( thread ).isHashtable() )
    {
      $load_partition_missing_kb_hl_supports$.setDynamicValue( Hashtables.make_hash_table( Numbers.integerDivide( total, TEN_INTEGER ), Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $load_partition_missing_kb_hl_supports$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 85898L)
  public static SubLObject gather_load_partition_kb_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $load_partition_kb_hl_supports$.getDynamicValue( thread ).isHashtable() )
    {
      return hash_table_utilities.hash_table_values( $load_partition_kb_hl_supports$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86093L)
  public static SubLObject gather_load_partition_scope_kb_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $load_partition_scope_kb_hl_supports$.getDynamicValue( thread ).isHashtable() )
    {
      return hash_table_utilities.hash_table_values( $load_partition_scope_kb_hl_supports$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86306L)
  public static SubLObject gather_load_partition_missing_kb_hl_supports()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $load_partition_missing_kb_hl_supports$.getDynamicValue( thread ).isHashtable() )
    {
      return hash_table_utilities.hash_table_values( $load_partition_missing_kb_hl_supports$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86525L)
  public static SubLObject note_load_partition_kb_hl_support(final SubLObject id, final SubLObject kb_hl_support, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_kb_hl_supports$.getDynamicValue( thread ), kb_hl_support );
    if( NIL != scopeP )
    {
      Hashtables.sethash( id, $load_partition_scope_kb_hl_supports$.getDynamicValue( thread ), kb_hl_support );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86808L)
  public static SubLObject note_load_partition_missing_kb_hl_support(final SubLObject id, final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( id, $load_partition_missing_kb_hl_supports$.getDynamicValue( thread ), kb_hl_support );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86991L)
  public static SubLObject partition_find_kb_hl_support_by_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject kb_hl_support = Hashtables.gethash_without_values( id, $load_partition_kb_hl_supports$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == kb_hl_support )
    {
      kb_hl_support = partition_missing_kb_hl_support_link_error( id );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87264L)
  public static SubLObject link_partition_kb_hl_support(final SubLObject id, final SubLObject hl_support, final SubLObject justification, final SubLObject scopeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support( hl_support );
      if( NIL == kb_hl_support )
      {
        if( NIL == scopeP && NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
        {
          Errors.warn( $str176$Non_scope_KB_HL_support__S_not_fo, hl_support );
        }
        kb_hl_support = link_partition_create_kb_hl_support( hl_support, justification );
        note_load_partition_missing_kb_hl_support( id, kb_hl_support );
      }
      note_load_partition_kb_hl_support( id, kb_hl_support, scopeP );
      return kb_hl_support;
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87846L)
  public static SubLObject link_partition_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification)
  {
    return kb_hl_supports_high.find_or_create_kb_hl_support( hl_support, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 87991L)
  public static SubLObject partition_missing_kb_hl_support_link_error(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_partition_link_errors$.getDynamicValue( thread ) )
    {
      Errors.warn( $str177$Did_not_find_KB_HL_support__D, id );
    }
    final SubLObject invalid_kb_hl_support = kb_hl_support_handles.partition_create_invalid_kb_hl_support();
    note_load_partition_kb_hl_support( id, invalid_kb_hl_support, NIL );
    note_load_partition_missing_kb_hl_support( id, invalid_kb_hl_support );
    return invalid_kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 88393L)
  public static SubLObject link_partition_asserted_argument(final SubLObject assertion, final SubLObject tv, final SubLObject assert_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      SubLObject ans = NIL;
      final SubLObject _prev_bind_0_$97 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
        ans = tms.tms_possibly_replace_asserted_argument_with_tv( assertion, tv );
      }
      finally
      {
        kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0_$97, thread );
      }
      if( NIL != assert_info && NIL == assertions_low.asserted_assertion_timestampedP( assertion ) )
      {
        final SubLObject who = assert_info.isCons() ? assert_info.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( assert_info, assert_info, $list178 );
        SubLObject current = assert_info.rest();
        final SubLObject when = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, assert_info, $list178 );
        current = current.rest();
        final SubLObject why = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, assert_info, $list178 );
        current = current.rest();
        final SubLObject second = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, assert_info, $list178 );
        current = current.rest();
        if( NIL == current )
        {
          assertions_high.timestamp_asserted_assertion( assertion, who, when, why, second );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( assert_info, $list178 );
        }
      }
      return ans;
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 89068L)
  public static SubLObject link_partition_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject tv)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      SubLObject ans = NIL;
      final SubLObject _prev_bind_0_$98 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
      final SubLObject _prev_bind_1_$99 = argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
        argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.bind( T, thread );
        ans = tms.tms_add_deduction_for_assertion( assertion, supports, enumeration_types.tv_truth( tv ), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.rebind( _prev_bind_1_$99, thread );
        kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0_$98, thread );
      }
      return ans;
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 89541L)
  public static SubLObject link_partition_assertible(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject variable_map)
  {
    final SubLObject successP = hl_storage_modules.hl_assert( cnf, mt, strength, direction, variable_map );
    if( NIL == successP )
    {
      Errors.warn( $str179$Could_not_assert__a_in__a_with_st, new SubLObject[] { cnf, mt, strength, direction, variable_map
      } );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 89966L)
  public static SubLObject clear_partition_loader_state()
  {
    $load_partition_constants$.setDynamicValue( NIL );
    $load_partition_scope_constants$.setDynamicValue( NIL );
    $load_partition_missing_constants$.setDynamicValue( NIL );
    $load_partition_narts$.setDynamicValue( NIL );
    $load_partition_scope_narts$.setDynamicValue( NIL );
    $load_partition_missing_narts$.setDynamicValue( NIL );
    $load_partition_assertions$.setDynamicValue( NIL );
    $load_partition_missing_assertions$.setDynamicValue( NIL );
    $load_partition_kb_hl_supports$.setDynamicValue( NIL );
    $load_partition_scope_kb_hl_supports$.setDynamicValue( NIL );
    $load_partition_missing_kb_hl_supports$.setDynamicValue( NIL );
    $load_partition_max_nart_complexity$.setDynamicValue( ZERO_INTEGER );
    $load_partition_max_term_order$.setDynamicValue( ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject declare_partitions_file()
  {
    SubLFiles.declareFunction( me, "partition_scope_completely_specifiedP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED?", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_partition", "SCOPE-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_scope_term_p", "PARTITION-SCOPE-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_partition_scope", "CLEAR-PARTITION-SCOPE", 0, 0, false );
    SubLFiles.declareFunction( me, "partition_term_spec_to_term", "PARTITION-TERM-SPEC-TO-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_term_spec_to_term_internal", "PARTITION-TERM-SPEC-TO-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_object_only", "SCOPE-PARTITION-OBJECT-ONLY", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_assertion", "SCOPE-PARTITION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_assertion_and_meta_assertions", "SCOPE-PARTITION-ASSERTION-AND-META-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_assertion_selective", "SCOPE-PARTITION-ASSERTION-SELECTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_assertion_and_constituents", "SCOPE-PARTITION-ASSERTION-AND-CONSTITUENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_term", "SCOPE-PARTITION-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_definition", "SCOPE-PARTITION-DEFINITION", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_term_and_narts", "SCOPE-PARTITION-TERM-AND-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_term_in_mt", "SCOPE-PARTITION-TERM-IN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_rf", "SCOPE-PARTITION-RF", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_rf_and_super_rfs", "SCOPE-PARTITION-RF-AND-SUPER-RFS", 1, 0, false );
    SubLFiles.declareFunction( me, "selected_scope_partition_term", "SELECTED-SCOPE-PARTITION-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_ontology", "SCOPE-PARTITION-ONTOLOGY", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_quoted_ontology", "SCOPE-PARTITION-QUOTED-ONTOLOGY", 1, 0, false );
    SubLFiles.declareFunction( me, "selected_scope_partition_ontology", "SELECTED-SCOPE-PARTITION-ONTOLOGY", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_arg_index", "SCOPE-PARTITION-ARG-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "scope_partition_predicate_rule_index", "SCOPE-PARTITION-PREDICATE-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "scope_partition_mt_index", "SCOPE-PARTITION-MT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_other_index", "SCOPE-PARTITION-OTHER-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_deduction", "SCOPE-PARTITION-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_scope", "PARTITION-SCOPE", 0, 0, false );
    SubLFiles.declareFunction( me, "partition_forts", "PARTITION-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_term_internal", "SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "selected_scope_partition_term_internal", "SELECTED-SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_partition_content", "CLEAR-PARTITION-CONTENT", 0, 1, false );
    SubLFiles.declareFunction( me, "partition_estimated_assertion_count", "PARTITION-ESTIMATED-ASSERTION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_scope_completely_specified_by_partitionP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED-BY-PARTITION?", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_content", "MARK-PARTITION-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_bookkeeping_terms", "MARK-PARTITION-BOOKKEEPING-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant", "MARK-PARTITION-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object", "MARK-PARTITION-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_cons_method", "MARK-PARTITION-OBJECT-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_constant_method", "MARK-PARTITION-OBJECT-CONSTANT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_constant", "MARK-PARTITION-OBJECT-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_nart_method", "MARK-PARTITION-OBJECT-NART-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_nart", "MARK-PARTITION-OBJECT-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_assertion_method", "MARK-PARTITION-OBJECT-ASSERTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_deduction_method", "MARK-PARTITION-OBJECT-DEDUCTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_deduction", "MARK-PARTITION-OBJECT-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_kb_hl_support_method", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_object_kb_hl_support", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_assertion_beliefs", "MARK-PARTITION-ASSERTION-BELIEFS", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_partition_assertion_deduction", "MARK-PARTITION-ASSERTION-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "note_partition_kb_hl_support_order", "NOTE-PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_kb_hl_support_order", "PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "display_partition_content", "DISPLAY-PARTITION-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_partition", "REMOVE-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_scoped_partition", "REMOVE-SCOPED-PARTITION", 0, 0, false );
    SubLFiles.declareFunction( me, "make_archive_filename", "MAKE-ARCHIVE-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "archive_assertion_if_local", "ARCHIVE-ASSERTION-IF-LOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "archive_term", "ARCHIVE-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "archive_ontology", "ARCHIVE-ONTOLOGY", 1, 1, false );
    SubLFiles.declareFunction( me, "archive_partition", "ARCHIVE-PARTITION", 2, 1, false );
    SubLFiles.declareFunction( me, "remove_partition_term", "REMOVE-PARTITION-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "save_partition", "SAVE-PARTITION", 2, 0, false );
    SubLFiles.declareFunction( me, "save_partition_to_stream", "SAVE-PARTITION-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "excise_partition_to_stream", "EXCISE-PARTITION-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "save_partition_as_hl_transcript", "SAVE-PARTITION-AS-HL-TRANSCRIPT", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_spec_to_modification_spec", "PARTITION-SPEC-TO-MODIFICATION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_common_symbols", "PARTITION-COMMON-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_to_stream", "DUMP-PARTITION-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_section_marker", "DUMP-PARTITION-SECTION-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_info", "DUMP-PARTITION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "large_partitionP", "LARGE-PARTITION?", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_constant_shells", "DUMP-PARTITION-CONSTANT-SHELLS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_constant_shell", "DUMP-PARTITION-CONSTANT-SHELL", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_nart_shells", "DUMP-PARTITION-NART-SHELLS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_nart_shells_at_level", "DUMP-PARTITION-NART-SHELLS-AT-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_nart_level_count", "PARTITION-NART-LEVEL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_nart_shell", "DUMP-PARTITION-NART-SHELL", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_assertions", "DUMP-PARTITION-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_simple_assertions", "DUMP-PARTITION-SIMPLE-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_meta_assertions", "DUMP-PARTITION-META-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_meta_assertion_order_count", "PARTITION-META-ASSERTION-ORDER-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_assertion", "DUMP-PARTITION-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_kb_hl_supports", "DUMP-PARTITION-KB-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_kb_hl_supports_at_level", "DUMP-PARTITION-KB-HL-SUPPORTS-AT-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_kb_hl_support_level_count", "PARTITION-KB-HL-SUPPORT-LEVEL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_kb_hl_support", "DUMP-PARTITION-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_arguments", "DUMP-PARTITION-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_argument", "DUMP-PARTITION-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_deduction", "DUMP-PARTITION-DEDUCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_beliefs", "DUMP-PARTITION-BELIEFS", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_belief", "DUMP-PARTITION-BELIEF", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_asserted_argument", "DUMP-PARTITION-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_bookkeeping_assertions_for_term", "DUMP-PARTITION-BOOKKEEPING-ASSERTIONS-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_partition_assertible", "DUMP-PARTITION-ASSERTIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "load_entire_kb_partition", "LOAD-ENTIRE-KB-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_clean", "LOAD-PARTITION-CLEAN", 1, 1, false );
    SubLFiles.declareFunction( me, "load_partitions_clean", "LOAD-PARTITIONS-CLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_load_kb_cleanup", "PARTITION-LOAD-KB-CLEANUP", 0, 0, false );
    SubLFiles.declareFunction( me, "partition_invalid_missing_terms_count", "PARTITION-INVALID-MISSING-TERMS-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "load_partition_invalid_missing_termP", "LOAD-PARTITION-INVALID-MISSING-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "add_load_partition_invalid_missing_term", "ADD-LOAD-PARTITION-INVALID-MISSING-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition", "LOAD-PARTITION", 1, 1, false );
    SubLFiles.declareFunction( me, "load_partition_from_stream", "LOAD-PARTITION-FROM-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "load_partition_info", "LOAD-PARTITION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_formats_compatibleP", "PARTITION-FORMATS-COMPATIBLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "load_partition_section_marker", "LOAD-PARTITION-SECTION-MARKER", 1, 2, false );
    SubLFiles.declareFunction( me, "load_partition_special_objects", "LOAD-PARTITION-SPECIAL-OBJECTS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_sbhl_links_for_partition_forts", "RESET-SBHL-LINKS-FOR-PARTITION-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "load_partition_constant_shells", "LOAD-PARTITION-CONSTANT-SHELLS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_constant_shell", "LOAD-PARTITION-CONSTANT-SHELL", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_nart_shells", "LOAD-PARTITION-NART-SHELLS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_nart_order_set", "LOAD-PARTITION-NART-ORDER-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "load_partition_nart_shell", "LOAD-PARTITION-NART-SHELL", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_assertions", "LOAD-PARTITION-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_simple_assertions", "LOAD-PARTITION-SIMPLE-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "load_partition_meta_assertions", "LOAD-PARTITION-META-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "load_partition_assertion_order_set", "LOAD-PARTITION-ASSERTION-ORDER-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "load_partition_assertion", "LOAD-PARTITION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_kb_hl_supports", "LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_kb_hl_support_order_set", "LOAD-PARTITION-KB-HL-SUPPORT-ORDER-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "load_partition_kb_hl_support", "LOAD-PARTITION-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_arguments", "LOAD-PARTITION-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_argument", "LOAD-PARTITION-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_beliefs", "LOAD-PARTITION-BELIEFS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_asserted_argument", "LOAD-PARTITION-ASSERTED-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "load_partition_deduction", "LOAD-PARTITION-DEDUCTION", 1, 1, false );
    SubLFiles.declareFunction( me, "load_some_partition_bookkeeping_assertions", "LOAD-SOME-PARTITION-BOOKKEEPING-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_assertible", "LOAD-PARTITION-ASSERTIBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "load_partition_possibly_weaken_hl_supports", "LOAD-PARTITION-POSSIBLY-WEAKEN-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_hl_support_module", "REPLACE-HL-SUPPORT-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_load_partition_constants", "CLEAR-LOAD-PARTITION-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_load_partition_constants_store", "NEW-LOAD-PARTITION-CONSTANTS-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_load_partition_scope_constants_store", "NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_load_paritition_missing_constants_store", "NEW-LOAD-PARITITION-MISSING-CONSTANTS-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_scope_constants", "GATHER-LOAD-PARTITION-SCOPE-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_missing_constants", "GATHER-LOAD-PARTITION-MISSING-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_constant", "NOTE-LOAD-PARTITION-CONSTANT", 3, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_missing_constant", "NOTE-LOAD-PARTITION-MISSING-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_find_constant_by_id", "PARTITION-FIND-CONSTANT-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_missing_constant_link_error", "PARTITION-MISSING-CONSTANT-LINK-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_shell", "LINK-PARTITION-CONSTANT-SHELL", 4, 0, false );
    SubLFiles.declareFunction( me, "link_partition_create_constant", "LINK-PARTITION-CREATE-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_install_constant_id", "LINK-PARTITION-INSTALL-CONSTANT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "preseed_load_partition_constants_store", "PRESEED-LOAD-PARTITION-CONSTANTS-STORE", 1, 1, false );
    SubLFiles.declareMacro( me, "with_preseeded_partition_constants", "WITH-PRESEEDED-PARTITION-CONSTANTS" );
    SubLFiles.declareFunction( me, "load_partition_from_stream_with_preseeding", "LOAD-PARTITION-FROM-STREAM-WITH-PRESEEDING", 2, 1, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_1", "LINK-PARTITION-CONSTANT-ERROR-1", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_2", "LINK-PARTITION-CONSTANT-ERROR-2", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_3", "LINK-PARTITION-CONSTANT-ERROR-3", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_4", "LINK-PARTITION-CONSTANT-ERROR-4", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_5", "LINK-PARTITION-CONSTANT-ERROR-5", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_6", "LINK-PARTITION-CONSTANT-ERROR-6", 2, 0, false );
    SubLFiles.declareFunction( me, "link_partition_constant_error_7", "LINK-PARTITION-CONSTANT-ERROR-7", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_load_partition_narts", "CLEAR-LOAD-PARTITION-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_scope_narts", "GATHER-LOAD-PARTITION-SCOPE-NARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_missing_narts", "GATHER-LOAD-PARTITION-MISSING-NARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_nart", "NOTE-LOAD-PARTITION-NART", 3, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_missing_nart", "NOTE-LOAD-PARTITION-MISSING-NART", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_find_nart_by_id", "PARTITION-FIND-NART-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "link_partition_nart_shell", "LINK-PARTITION-NART-SHELL", 3, 0, false );
    SubLFiles.declareFunction( me, "link_partition_create_nart_shell", "LINK-PARTITION-CREATE-NART-SHELL", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_missing_nart_link_error", "PARTITION-MISSING-NART-LINK-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_load_partition_assertions", "CLEAR-LOAD-PARTITION-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_assertions", "GATHER-LOAD-PARTITION-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_missing_assertions", "GATHER-LOAD-PARTITION-MISSING-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_assertion", "NOTE-LOAD-PARTITION-ASSERTION", 3, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_missing_assertion", "NOTE-LOAD-PARTITION-MISSING-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_find_assertion_by_id", "PARTITION-FIND-ASSERTION-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "link_partition_assertion", "LINK-PARTITION-ASSERTION", 6, 0, false );
    SubLFiles.declareFunction( me, "link_partition_create_assertion_shell", "LINK-PARTITION-CREATE-ASSERTION-SHELL", 4, 0, false );
    SubLFiles.declareFunction( me, "partition_missing_assertion_link_error", "PARTITION-MISSING-ASSERTION-LINK-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_load_partition_kb_hl_supports", "CLEAR-LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_kb_hl_supports", "GATHER-LOAD-PARTITION-KB-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_scope_kb_hl_supports", "GATHER-LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_load_partition_missing_kb_hl_supports", "GATHER-LOAD-PARTITION-MISSING-KB-HL-SUPPORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_kb_hl_support", "NOTE-LOAD-PARTITION-KB-HL-SUPPORT", 3, 0, false );
    SubLFiles.declareFunction( me, "note_load_partition_missing_kb_hl_support", "NOTE-LOAD-PARTITION-MISSING-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_find_kb_hl_support_by_id", "PARTITION-FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "link_partition_kb_hl_support", "LINK-PARTITION-KB-HL-SUPPORT", 4, 0, false );
    SubLFiles.declareFunction( me, "link_partition_create_kb_hl_support", "LINK-PARTITION-CREATE-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_missing_kb_hl_support_link_error", "PARTITION-MISSING-KB-HL-SUPPORT-LINK-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "link_partition_asserted_argument", "LINK-PARTITION-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "link_partition_deduction", "LINK-PARTITION-DEDUCTION", 3, 0, false );
    SubLFiles.declareFunction( me, "link_partition_assertible", "LINK-PARTITION-ASSERTIBLE", 5, 0, false );
    SubLFiles.declareFunction( me, "clear_partition_loader_state", "CLEAR-PARTITION-LOADER-STATE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_partitions_file()
  {
    $partition_scope_completely_specifiedP$ = SubLFiles.defparameter( "*PARTITION-SCOPE-COMPLETELY-SPECIFIED?*", NIL );
    $reset_sbhl_links$ = SubLFiles.defparameter( "*RESET-SBHL-LINKS*", NIL );
    $partition_scope_hash$ = SubLFiles.defparameter( "*PARTITION-SCOPE-HASH*", NIL );
    $scope_partition_assertion_selective_test$ = SubLFiles.defparameter( "*SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*", NIL );
    $assertion_partition_fort_filter_function$ = SubLFiles.defparameter( "*ASSERTION-PARTITION-FORT-FILTER-FUNCTION*", NIL );
    $partition_constant_hash$ = SubLFiles.defparameter( "*PARTITION-CONSTANT-HASH*", NIL );
    $partition_nart_hash$ = SubLFiles.defparameter( "*PARTITION-NART-HASH*", NIL );
    $partition_assertion_hash$ = SubLFiles.defparameter( "*PARTITION-ASSERTION-HASH*", NIL );
    $partition_meta_assertion_hash$ = SubLFiles.defparameter( "*PARTITION-META-ASSERTION-HASH*", NIL );
    $partition_kb_hl_support_hash$ = SubLFiles.defparameter( "*PARTITION-KB-HL-SUPPORT-HASH*", NIL );
    $partition_argument_hash$ = SubLFiles.defparameter( "*PARTITION-ARGUMENT-HASH*", NIL );
    $partition_max_nart_complexity$ = SubLFiles.defparameter( "*PARTITION-MAX-NART-COMPLEXITY*", NIL );
    $partition_max_term_order$ = SubLFiles.defparameter( "*PARTITION-MAX-TERM-ORDER*", NIL );
    $partition_kb_hl_support_orders$ = SubLFiles.defparameter( "*PARTITION-KB-HL-SUPPORT-ORDERS*", NIL );
    $partition_max_kb_hl_support_order$ = SubLFiles.defparameter( "*PARTITION-MAX-KB-HL-SUPPORT-ORDER*", NIL );
    $mark_partition_object_method_table$ = SubLFiles.deflexical( "*MARK-PARTITION-OBJECT-METHOD-TABLE*", Vectors.make_vector( $int23$256, NIL ) );
    $current_archive_stream$ = SubLFiles.defparameter( "*CURRENT-ARCHIVE-STREAM*", T );
    $dump_partition_format$ = SubLFiles.defparameter( "*DUMP-PARTITION-FORMAT*", $str76$2_2 );
    $backwards_compatibility_pairs$ = SubLFiles.defparameter( "*BACKWARDS-COMPATIBILITY-PAIRS*", $list77 );
    $partition_section_marker$ = SubLFiles.defparameter( "*PARTITION-SECTION-MARKER*", $kw78$SECTION );
    $partition_asserted_argument_type_flag$ = SubLFiles.defparameter( "*PARTITION-ASSERTED-ARGUMENT-TYPE-FLAG*", $kw79$ASSERTED );
    $partition_special_objects$ = SubLFiles.defparameter( "*PARTITION-SPECIAL-OBJECTS*", ConsesLow.list( $partition_section_marker$.getDynamicValue(), $partition_asserted_argument_type_flag$.getDynamicValue() ) );
    $partition_entire_kb_loadP$ = SubLFiles.defparameter( "*PARTITION-ENTIRE-KB-LOAD?*", NIL );
    $load_partition_invalid_missing_terms$ = SubLFiles.defparameter( "*LOAD-PARTITION-INVALID-MISSING-TERMS*", NIL );
    $load_partition_max_nart_complexity$ = SubLFiles.defparameter( "*LOAD-PARTITION-MAX-NART-COMPLEXITY*", ZERO_INTEGER );
    $load_partition_max_term_order$ = SubLFiles.defparameter( "*LOAD-PARTITION-MAX-TERM-ORDER*", ZERO_INTEGER );
    $load_partition_max_kb_hl_support_order$ = SubLFiles.defparameter( "*LOAD-PARTITION-MAX-KB-HL-SUPPORT-ORDER*", ZERO_INTEGER );
    $trace_partition_link_errors$ = SubLFiles.defparameter( "*TRACE-PARTITION-LINK-ERRORS*", T );
    $load_partition_weaken_hl_supports$ = SubLFiles.defparameter( "*LOAD-PARTITION-WEAKEN-HL-SUPPORTS*", NIL );
    $preseeded_partition_constants$ = SubLFiles.defparameter( "*PRESEEDED-PARTITION-CONSTANTS*", NIL );
    $load_partition_constants$ = SubLFiles.defparameter( "*LOAD-PARTITION-CONSTANTS*", NIL );
    $load_partition_scope_constants$ = SubLFiles.defparameter( "*LOAD-PARTITION-SCOPE-CONSTANTS*", NIL );
    $load_partition_missing_constants$ = SubLFiles.defparameter( "*LOAD-PARTITION-MISSING-CONSTANTS*", NIL );
    $load_partition_narts$ = SubLFiles.defparameter( "*LOAD-PARTITION-NARTS*", NIL );
    $load_partition_scope_narts$ = SubLFiles.defparameter( "*LOAD-PARTITION-SCOPE-NARTS*", NIL );
    $load_partition_missing_narts$ = SubLFiles.defparameter( "*LOAD-PARTITION-MISSING-NARTS*", NIL );
    $load_partition_assertions$ = SubLFiles.defparameter( "*LOAD-PARTITION-ASSERTIONS*", NIL );
    $load_partition_missing_assertions$ = SubLFiles.defparameter( "*LOAD-PARTITION-MISSING-ASSERTIONS*", NIL );
    $load_partition_kb_hl_supports$ = SubLFiles.defparameter( "*LOAD-PARTITION-KB-HL-SUPPORTS*", NIL );
    $load_partition_scope_kb_hl_supports$ = SubLFiles.defparameter( "*LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS*", NIL );
    $load_partition_missing_kb_hl_supports$ = SubLFiles.defparameter( "*LOAD-PARTITION-MISSING-KB-HL-SUPPORTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_partitions_file()
  {
    Structures.register_method( $mark_partition_object_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym24$MARK_PARTITION_OBJECT_CONS_METHOD ) );
    Structures.register_method( $mark_partition_object_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym25$MARK_PARTITION_OBJECT_CONSTANT_METHOD ) );
    Structures.register_method( $mark_partition_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function( $sym26$MARK_PARTITION_OBJECT_NART_METHOD ) );
    Structures.register_method( $mark_partition_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function( $sym27$MARK_PARTITION_OBJECT_ASSERTION_METHOD ) );
    Structures.register_method( $mark_partition_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function( $sym28$MARK_PARTITION_OBJECT_DEDUCTION_METHOD ) );
    Structures.register_method( $mark_partition_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function(
        $sym29$MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_partitions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_partitions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_partitions_file();
  }
  static
  {
    me = new partitions();
    $partition_scope_completely_specifiedP$ = null;
    $reset_sbhl_links$ = null;
    $partition_scope_hash$ = null;
    $scope_partition_assertion_selective_test$ = null;
    $assertion_partition_fort_filter_function$ = null;
    $partition_constant_hash$ = null;
    $partition_nart_hash$ = null;
    $partition_assertion_hash$ = null;
    $partition_meta_assertion_hash$ = null;
    $partition_kb_hl_support_hash$ = null;
    $partition_argument_hash$ = null;
    $partition_max_nart_complexity$ = null;
    $partition_max_term_order$ = null;
    $partition_kb_hl_support_orders$ = null;
    $partition_max_kb_hl_support_order$ = null;
    $mark_partition_object_method_table$ = null;
    $current_archive_stream$ = null;
    $dump_partition_format$ = null;
    $backwards_compatibility_pairs$ = null;
    $partition_section_marker$ = null;
    $partition_asserted_argument_type_flag$ = null;
    $partition_special_objects$ = null;
    $partition_entire_kb_loadP$ = null;
    $load_partition_invalid_missing_terms$ = null;
    $load_partition_max_nart_complexity$ = null;
    $load_partition_max_term_order$ = null;
    $load_partition_max_kb_hl_support_order$ = null;
    $trace_partition_link_errors$ = null;
    $load_partition_weaken_hl_supports$ = null;
    $preseeded_partition_constants$ = null;
    $load_partition_constants$ = null;
    $load_partition_scope_constants$ = null;
    $load_partition_missing_constants$ = null;
    $load_partition_narts$ = null;
    $load_partition_scope_narts$ = null;
    $load_partition_missing_narts$ = null;
    $load_partition_assertions$ = null;
    $load_partition_missing_assertions$ = null;
    $load_partition_kb_hl_supports$ = null;
    $load_partition_scope_kb_hl_supports$ = null;
    $load_partition_missing_kb_hl_supports$ = null;
    $list0 = ConsesLow.cons( makeSymbol( "METHOD" ), makeSymbol( "TERM-SPEC" ) );
    $sym1$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw2$ONTOLOGY = makeKeyword( "ONTOLOGY" );
    $kw3$QUOTED_ONTOLOGY = makeKeyword( "QUOTED-ONTOLOGY" );
    $kw4$TERM = makeKeyword( "TERM" );
    $kw5$DEFINITION = makeKeyword( "DEFINITION" );
    $kw6$FUNCTION = makeKeyword( "FUNCTION" );
    $list7 = ConsesLow.cons( makeSymbol( "FUNCTION" ), makeSymbol( "ARGS" ) );
    $str8$Unknown_scope_partition_function_ = makeString( "Unknown scope partition function ~S" );
    $kw9$ESTIMATED_ASSERTION_COUNT = makeKeyword( "ESTIMATED-ASSERTION-COUNT" );
    $kw10$SCOPE_COMPLETELY_SPECIFIED_ = makeKeyword( "SCOPE-COMPLETELY-SPECIFIED?" );
    $str11$Unable_to_scope_partition_via__S_ = makeString( "Unable to scope partition via ~S partition spec" );
    $int12$100 = makeInteger( 100 );
    $str13$Non_scope_object__A_not_allowed_ = makeString( "Non-scope object ~A not allowed." );
    $sym14$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const15$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw16$GAF = makeKeyword( "GAF" );
    $const17$ResearchCycDefinitionalPredicate = constant_handles.reader_make_constant_shell( makeString( "ResearchCycDefinitionalPredicate" ) );
    $sym18$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym19$SCOPE_PARTITION_ASSERTION = makeSymbol( "SCOPE-PARTITION-ASSERTION" );
    $sym20$SCOPE_PARTITION_TERM = makeSymbol( "SCOPE-PARTITION-TERM" );
    $sym21$FORT_P = makeSymbol( "FORT-P" );
    $str22$marking_partition_content = makeString( "marking partition content" );
    $int23$256 = makeInteger( 256 );
    $sym24$MARK_PARTITION_OBJECT_CONS_METHOD = makeSymbol( "MARK-PARTITION-OBJECT-CONS-METHOD" );
    $sym25$MARK_PARTITION_OBJECT_CONSTANT_METHOD = makeSymbol( "MARK-PARTITION-OBJECT-CONSTANT-METHOD" );
    $sym26$MARK_PARTITION_OBJECT_NART_METHOD = makeSymbol( "MARK-PARTITION-OBJECT-NART-METHOD" );
    $sym27$MARK_PARTITION_OBJECT_ASSERTION_METHOD = makeSymbol( "MARK-PARTITION-OBJECT-ASSERTION-METHOD" );
    $sym28$MARK_PARTITION_OBJECT_DEDUCTION_METHOD = makeSymbol( "MARK-PARTITION-OBJECT-DEDUCTION-METHOD" );
    $sym29$MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD = makeSymbol( "MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD" );
    $sym30$BELIEF_P = makeSymbol( "BELIEF-P" );
    $str31$_______S_constants = makeString( "~%;;; ~S constants" );
    $str32$___A_S = makeString( "~%~A~S" );
    $str33$___ = makeString( "(*)" );
    $str34$___ = makeString( "   " );
    $str35$______Max_NART_level____S = makeString( "~%;;; Max NART level : ~S" );
    $str36$______level__S_NARTs = makeString( "~%;;; level ~S NARTs" );
    $str37$______Max_term_order___S = makeString( "~%;;; Max term order: ~S" );
    $str38$_______S_assertions = makeString( "~%;;; ~S assertions" );
    $str39$_______S_meta_assertions = makeString( "~%;;; ~S meta-assertions" );
    $str40$______order__S_meta_assertions = makeString( "~%;;; order ~S meta-assertions" );
    $str41$_______S_arguments = makeString( "~%;;; ~S arguments" );
    $str42$Deduction______S = makeString( "Deduction   : ~S" );
    $str43$Beliefs_for____S = makeString( "Beliefs for : ~S" );
    $str44$Unknown________S = makeString( "Unknown (?) : ~S" );
    $str45$______Max_KB_HL_support_level____ = makeString( "~%;;; Max KB HL support level : ~S" );
    $str46$_______S_KB_HL_supports = makeString( "~%;;; ~S KB HL supports" );
    $str47$______level__S_KB_HL_supports = makeString( "~%;;; level ~S KB HL supports" );
    $str48$removing_partition_assertions = makeString( "removing partition assertions" );
    $str49$removing_partition_NARTs = makeString( "removing partition NARTs" );
    $str50$removing_partition_constants = makeString( "removing partition constants" );
    $list51 = ConsesLow.list( makeString( "units" ), makeString( "archive" ) );
    $str52$lisp = makeString( "lisp" );
    $sym53$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str54$_____FI_ASSERT___S__S__S__S_ = makeString( "~%~%(FI-ASSERT '~S ~S ~S ~S)" );
    $str55$_____FI_CREATE__a_ = makeString( "~%~%(FI-CREATE ~a)" );
    $sym56$ARCHIVE_ASSERTION_IF_LOCAL = makeSymbol( "ARCHIVE-ASSERTION-IF-LOCAL" );
    $kw57$APPEND = makeKeyword( "APPEND" );
    $str58$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str59$______Archive_saved_at__s____ = makeString( "~%;;; Archive saved at ~s~%~%" );
    $sym60$STRINGP = makeSymbol( "STRINGP" );
    $kw61$OUTPUT = makeKeyword( "OUTPUT" );
    $sym62$CFASL_ENCODABLE_STREAM_P = makeSymbol( "CFASL-ENCODABLE-STREAM-P" );
    $kw63$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym64$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $sym65$_ = makeSymbol( "<" );
    $sym66$CONSTANT_INTERNAL_ID = makeSymbol( "CONSTANT-INTERNAL-ID" );
    $sym67$NART_ID = makeSymbol( "NART-ID" );
    $sym68$TERM_FUNCTIONAL_COMPLEXITY = makeSymbol( "TERM-FUNCTIONAL-COMPLEXITY" );
    $sym69$TERM_ORDER = makeSymbol( "TERM-ORDER" );
    $sym70$DEDUCTION_ID = makeSymbol( "DEDUCTION-ID" );
    $sym71$KB_HL_SUPPORT_ID = makeSymbol( "KB-HL-SUPPORT-ID" );
    $kw72$NEW_CONSTANTS = makeKeyword( "NEW-CONSTANTS" );
    $kw73$NEW_NARTS = makeKeyword( "NEW-NARTS" );
    $kw74$NEW_ASSERTIONS = makeKeyword( "NEW-ASSERTIONS" );
    $kw75$NEW_DEDUCTIONS = makeKeyword( "NEW-DEDUCTIONS" );
    $str76$2_2 = makeString( "2.2" );
    $list77 = ConsesLow.list( ConsesLow.list( makeString( "2.1" ), makeString( "2.1.2" ) ), ConsesLow.list( makeString( "2.1" ), makeString( "2.2" ) ), ConsesLow.list( makeString( "2.1.2" ), makeString( "2.2" ) ) );
    $kw78$SECTION = makeKeyword( "SECTION" );
    $kw79$ASSERTED = makeKeyword( "ASSERTED" );
    $list80 = ConsesLow.list( makeSymbol( "SYSTEM-NUMBER" ), makeSymbol( "PATCH-NUMBER" ), makeSymbol( "&REST" ), makeSymbol( "BRANCH-SPECIFICS" ) );
    $float81$0_1 = makeDouble( 0.1 );
    $str82$_large__partition_constant_shells = makeString( "(large) partition constant shells" );
    $kw83$SKIP = makeKeyword( "SKIP" );
    $str84$partition_constant_shells = makeString( "partition constant shells" );
    $str85$partition_level_ = makeString( "partition level " );
    $str86$_NART_shells = makeString( " NART shells" );
    $str87$_large__ = makeString( "(large) " );
    $str88$_large__partition_assertions = makeString( "(large) partition assertions" );
    $str89$partition_assertions = makeString( "partition assertions" );
    $str90$partition_order_ = makeString( "partition order " );
    $str91$_meta_assertions = makeString( " meta assertions" );
    $str92$_KB_HL_supports = makeString( " KB HL supports" );
    $str93$_large__partition_beliefs = makeString( "(large) partition beliefs" );
    $str94$_large__partition_deductions = makeString( "(large) partition deductions" );
    $str95$_large__partition_bookkeeping_inf = makeString( "(large) partition bookkeeping info" );
    $str96$partition_arguments = makeString( "partition arguments" );
    $str97$Unknown_argument_object__S = makeString( "Unknown argument object ~S" );
    $str98$Unable_to_dump_belief__S = makeString( "Unable to dump belief ~S" );
    $list99 = ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "MT" ), makeSymbol( "STRENGTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "VARIABLE-MAP" ) );
    $str100$cleaning_up_after_partition_load_ = makeString( "cleaning up after partition load...~%" );
    $const101$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_ = makeSymbol( "LOAD-PARTITION-INVALID-MISSING-TERM?" );
    $str103$partition_load_KB_cleanup_removed = makeString( "partition load KB cleanup removed:~%" );
    $str104$__A_constants__ = makeString( " ~A constants~%" );
    $str105$__A_NARTs__ = makeString( " ~A NARTs~%" );
    $str106$__A_assertions__ = makeString( " ~A assertions~%" );
    $kw107$INPUT = makeKeyword( "INPUT" );
    $sym108$PARTITION_FIND_CONSTANT_BY_ID = makeSymbol( "PARTITION-FIND-CONSTANT-BY-ID" );
    $sym109$PARTITION_FIND_NART_BY_ID = makeSymbol( "PARTITION-FIND-NART-BY-ID" );
    $sym110$PARTITION_FIND_ASSERTION_BY_ID = makeSymbol( "PARTITION-FIND-ASSERTION-BY-ID" );
    $sym111$PARTITION_FIND_KB_HL_SUPPORT_BY_ID = makeSymbol( "PARTITION-FIND-KB-HL-SUPPORT-BY-ID" );
    $sym112$ATOM = makeSymbol( "ATOM" );
    $sym113$INTEGERP = makeSymbol( "INTEGERP" );
    $str114$partition_format_is__A__not__A__a = makeString( "partition format is ~A, not ~A, and these versions are incompatible" );
    $kw115$EOF = makeKeyword( "EOF" );
    $str116$malformed_partition_file = makeString( "malformed partition file" );
    $str117$loading_partition_constant_shells = makeString( "loading partition constant shells" );
    $sym118$GUID_P = makeSymbol( "GUID-P" );
    $str119$loading_partition_level_ = makeString( "loading partition level " );
    $str120$_narts = makeString( " narts" );
    $sym121$POSSIBLY_NAUT_P = makeSymbol( "POSSIBLY-NAUT-P" );
    $str122$loading_partition_assertions = makeString( "loading partition assertions" );
    $str123$loading_partition_order_ = makeString( "loading partition order " );
    $str124$_meta_assertions = makeString( " meta-assertions" );
    $str125$Skipping_assertion_with_bad_id__A = makeString( "Skipping assertion with bad id=~A (scope-term?=~S cnf=~S mt=~S direction=~A vnames=~S)." );
    $str126$Skipping_assertion_with_bad_cnf__ = makeString( "Skipping assertion with bad cnf=~S (id=~A scope-term?=~S mt=~S direction=~A vnames=~S)." );
    $str127$Skipping_assertion_with_bad_mt__S = makeString( "Skipping assertion with bad mt=~S (id=~A scope-term?=~S cnf=~S direction=~A vnames=~S)." );
    $str128$Skipping_assertion_with_bad_direc = makeString( "Skipping assertion with bad direction=~A (id=~A scope-term?=~S cnf=~S mt=~S vnames=~S)." );
    $str129$Skipping_assertion_with_bad_vname = makeString( "Skipping assertion with bad vnames=~S (id=~A scope-term?=~S cnf=~S mt=~S direction=~A)." );
    $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list131 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym132$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym133$CSETQ = makeSymbol( "CSETQ" );
    $str134$_A = makeString( "~A" );
    $kw135$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym136$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym137$HL_SUPPORT_P = makeSymbol( "HL-SUPPORT-P" );
    $sym138$HL_JUSTIFICATION_P = makeSymbol( "HL-JUSTIFICATION-P" );
    $str139$loading_partition_arguments = makeString( "loading partition arguments" );
    $str140$Skipping_asserted_argument_for_ba = makeString( "Skipping asserted argument for bad assertion = ~S" );
    $str141$Skipping_asserted_argument_for_as = makeString( "Skipping asserted argument for assertion (id=~A) with bad tv = ~S (assertion=~S)." );
    $str142$Skipping_asserted_argument_for_as = makeString( "Skipping asserted argument for assertion (id=~A) with bad assert info = ~S (assertion=~S)." );
    $str143$Skipping_deduction__id__A__with_b = makeString( "Skipping deduction (id=~A) with bad tv = ~S (assertion=~S supports=~S)." );
    $str144$Skipping_deduction__id__A__with_b = makeString( "Skipping deduction (id=~A) with bad assertion = ~S (tv=~S supports=~S)." );
    $str145$Skipping_deduction__id__A__with_b = makeString( "Skipping deduction (id=~A) with bad supports = ~S (tv=~S assertion=~S)." );
    $sym146$CNF_P = makeSymbol( "CNF-P" );
    $sym147$POSSIBLY_HLMT_P = makeSymbol( "POSSIBLY-HLMT-P" );
    $sym148$EL_STRENGTH_P = makeSymbol( "EL-STRENGTH-P" );
    $sym149$DIRECTION_P = makeSymbol( "DIRECTION-P" );
    $sym150$LISTP = makeSymbol( "LISTP" );
    $str151$Did_not_find_constant__D_ = makeString( "Did not find constant ~D." );
    $sym152$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym153$_EXIT = makeSymbol( "%EXIT" );
    $list154 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRE-SEEDING" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "EXPECTED-TOTAL" ), makeInteger( 100 ) ), makeSymbol( "SCOPED-MAP" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list155 = ConsesLow.list( makeKeyword( "EXPECTED-TOTAL" ), makeKeyword( "SCOPED-MAP" ) );
    $kw156$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw157$EXPECTED_TOTAL = makeKeyword( "EXPECTED-TOTAL" );
    $kw158$SCOPED_MAP = makeKeyword( "SCOPED-MAP" );
    $sym159$CLET = makeSymbol( "CLET" );
    $list160 = ConsesLow.list( makeSymbol( "*PRESEEDED-PARTITION-CONSTANTS*" ), T );
    $sym161$_LOAD_PARTITION_CONSTANTS_ = makeSymbol( "*LOAD-PARTITION-CONSTANTS*" );
    $sym162$NEW_LOAD_PARTITION_CONSTANTS_STORE = makeSymbol( "NEW-LOAD-PARTITION-CONSTANTS-STORE" );
    $sym163$_LOAD_PARTITION_SCOPE_CONSTANTS_ = makeSymbol( "*LOAD-PARTITION-SCOPE-CONSTANTS*" );
    $sym164$FWHEN = makeSymbol( "FWHEN" );
    $sym165$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $sym166$NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE = makeSymbol( "NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE" );
    $sym167$PRESEED_LOAD_PARTITION_CONSTANTS_STORE = makeSymbol( "PRESEED-LOAD-PARTITION-CONSTANTS-STORE" );
    $str168$NAME_change_for__S___new_name_is_ = makeString( "NAME change for ~S ; new name is ~S" );
    $str169$installing_ID__S_for__S = makeString( "installing ID ~S for ~S" );
    $str170$NAME_clash_for__S___renaming_to__ = makeString( "NAME clash for ~S ; renaming to ~S" );
    $str171$Constant_with_NAME__S_and_ID__S_m = makeString( "Constant with NAME ~S and ID ~S missing" );
    $str172$Non_scope_NART__S_not_found_ = makeString( "Non-scope NART ~S not found." );
    $str173$Did_not_find_NART__D_ = makeString( "Did not find NART ~D." );
    $str174$Non_scope_assertion__S___S__not_f = makeString( "Non-scope assertion ~S (~S) not found." );
    $str175$Did_not_find_assertion__D_ = makeString( "Did not find assertion ~D." );
    $str176$Non_scope_KB_HL_support__S_not_fo = makeString( "Non-scope KB HL support ~S not found." );
    $str177$Did_not_find_KB_HL_support__D = makeString( "Did not find KB HL support ~D" );
    $list178 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "WHO" ), makeSymbol( "WHEN" ), makeSymbol( "WHY" ), makeSymbol( "SECOND" ) );
    $str179$Could_not_assert__a_in__a_with_st = makeString( "Could not assert ~a in ~a with strength ~s and direction ~s and variable-map ~s" );
  }
}
/*
 * 
 * Total time: 2114 ms
 * 
 */