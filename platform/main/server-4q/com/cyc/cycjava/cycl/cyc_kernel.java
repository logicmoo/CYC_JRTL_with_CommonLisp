package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_kernel
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_kernel";
  public static final String myFingerPrint = "7862ead2c5cc34499478eadba8f9dec994372e0f8452aa91ea05f2ddc484c40c";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9221L)
  private static SubLSymbol $assert_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 21677L)
  private static SubLSymbol $closed_query_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23171L)
  private static SubLSymbol $closed_query_success_token$;
  private static final SubLSymbol $sym0$NEW_CONSTANT_NAME_SPEC_P;
  private static final SubLSymbol $sym1$FI_CREATE;
  private static final SubLSymbol $sym2$CYC_CREATE_NEW_PERMANENT;
  private static final SubLList $list3;
  private static final SubLString $str4$Creates_a_new_constant_with_name_;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CYC_CREATE_NEW_EPHEMERAL;
  private static final SubLString $str8$Creates_a_new_constant_with_name_;
  private static final SubLSymbol $sym9$CONSTANT_EXTERNAL_ID_P;
  private static final SubLSymbol $sym10$CYC_CREATE;
  private static final SubLList $list11;
  private static final SubLString $str12$Create_a_new_constant_with_id_EXT;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$VALID_CONSTANT_NAME_P;
  private static final SubLSymbol $sym15$CYC_FIND_OR_CREATE;
  private static final SubLString $str16$Return_constant_with_NAME_if_it_i;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$CONSTANT_P;
  private static final SubLSymbol $sym19$CYC_RENAME;
  private static final SubLList $list20;
  private static final SubLString $str21$Change_name_of_CONSTANT_to_NAME__;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$CYC_RECREATE;
  private static final SubLList $list25;
  private static final SubLString $str26$Doesn_t_unassert_the_bookkeeping_;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$UNNAMED;
  private static final SubLSymbol $sym29$FORT_P;
  private static final SubLSymbol $sym30$CYC_KILL;
  private static final SubLList $list31;
  private static final SubLString $str32$Kill_FORT_and_all_its_uses_from_t;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLString $str35$cyc_rewrite_is_not_implemented_ye;
  private static final SubLSymbol $sym36$CYC_REWRITE;
  private static final SubLList $list37;
  private static final SubLString $str38$_moves__all_asserted_arguments_fr;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$CYC_MERGE;
  private static final SubLList $list42;
  private static final SubLString $str43$Move_asserted_assertions_on_KILL_;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$ASSERT_PROPERTY_P;
  private static final SubLSymbol $sym47$POSSIBLY_SENTENCE_P;
  private static final SubLSymbol $sym48$POSSIBLY_MT_P;
  private static final SubLSymbol $sym49$ASSERT_PROPERTIES_P;
  private static final SubLSymbol $kw50$STRENGTH;
  private static final SubLSymbol $kw51$DEFAULT;
  private static final SubLSymbol $kw52$DIRECTION;
  private static final SubLSymbol $kw53$CHECK_WFF_;
  private static final SubLSymbol $kw54$FORWARD_RULES;
  private static final SubLSymbol $sym55$CYC_ASSERT;
  private static final SubLList $list56;
  private static final SubLString $str57$Assert_SENTENCE_in_the_specified_;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$CYC_DENY;
  private static final SubLString $str60$Deny_SENTENCE_in_the_specified_MT;
  private static final SubLSymbol $sym61$CYC_UNASSERT;
  private static final SubLList $list62;
  private static final SubLString $str63$Remove_the_assertions_canonicaliz;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$CYC_EDIT;
  private static final SubLList $list66;
  private static final SubLString $str67$Unassert_OLD_SENTENCE_in_OLD_MT__;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$LIST_OF_CYCL_SUPPORT_P;
  private static final SubLSymbol $sym70$BOOLEANP;
  private static final SubLSymbol $sym71$CYC_ADD_ARGUMENT;
  private static final SubLList $list72;
  private static final SubLString $str73$Tell_Cyc_to_conclude_SENTENCE__op;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$CYC_REMOVE_ARGUMENT;
  private static final SubLList $list76;
  private static final SubLString $str77$Remove_the_argument_for_SENTENCE_;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$CYC_REMOVE_ALL_ARGUMENTS;
  private static final SubLString $str80$Remove_all_arguments_for_SENTENCE;
  private static final SubLSymbol $sym81$LEGACY_QUERY_PROPERTIES_P;
  private static final SubLSymbol $kw82$BACKCHAIN;
  private static final SubLSymbol $kw83$NUMBER;
  private static final SubLSymbol $kw84$TIME;
  private static final SubLSymbol $kw85$DEPTH;
  private static final SubLSymbol $kw86$CONDITIONAL_SENTENCE;
  private static final SubLSymbol $sym87$CYC_QUERY;
  private static final SubLString $str88$Query_for_bindings_for_free_varia;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$CLOSED_QUERY_JUSTIFIED_BINDINGS_P;
  private static final SubLSymbol $kw92$LAST;
  private static final SubLSymbol $sym93$QUERY_ID_P;
  private static final SubLString $str94$cyc_continue_query_is_deprecated_;
  private static final SubLSymbol $sym95$CYC_CONTINUE_QUERY;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLString $str98$Continues_a_query_started_by__xre;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$CYC_TMS_RECONSIDER_SENTENCE;
  private static final SubLString $str101$Reconsider_all_arguments_for_SENT;
  private static final SubLSymbol $sym102$ALIST_P;
  private static final SubLSymbol $sym103$CYC_RENAME_VARIABLES;
  private static final SubLList $list104;
  private static final SubLString $str105$Rename_the_variables_in_SENTENCE_;
  private static final SubLList $list106;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 1964L)
  public static SubLObject cyc_create_new_permanent(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( name, $sym0$NEW_CONSTANT_NAME_SPEC_P );
    final SubLObject creation_form = ConsesLow.list( $sym1$FI_CREATE, name, constants_high.make_constant_external_id() );
    SubLObject constant = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      constant = eval_in_api.cyc_api_eval( creation_form );
    }
    finally
    {
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 3142L)
  public static SubLObject cyc_create_new_ephemeral(final SubLObject name)
  {
    enforceType( name, $sym0$NEW_CONSTANT_NAME_SPEC_P );
    return cyc_create( name, constants_high.make_constant_external_id() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 3541L)
  public static SubLObject cyc_create(final SubLObject name, final SubLObject external_id)
  {
    enforceType( name, $sym0$NEW_CONSTANT_NAME_SPEC_P );
    if( NIL != external_id )
    {
      enforceType( external_id, $sym9$CONSTANT_EXTERNAL_ID_P );
    }
    SubLObject result = NIL;
    result = fi.fi_create_int( name, external_id );
    cyc_bookkeeping.perform_constant_bookkeeping( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 3993L)
  public static SubLObject cyc_find_or_create(final SubLObject name, final SubLObject external_id)
  {
    enforceType( name, $sym14$VALID_CONSTANT_NAME_P );
    if( NIL != external_id )
    {
      enforceType( external_id, $sym9$CONSTANT_EXTERNAL_ID_P );
    }
    SubLObject result = NIL;
    result = fi.fi_find_int( name );
    if( NIL == result )
    {
      result = cyc_create( name, external_id );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 4530L)
  public static SubLObject cyc_find_or_create_new_permanent(final SubLObject name)
  {
    assert NIL != constant_completion_high.valid_constant_name_p( name ) : name;
    SubLObject result = NIL;
    result = fi.fi_find_int( name );
    if( NIL == result )
    {
      result = cyc_create_new_permanent( name );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 4990L)
  public static SubLObject cyc_rename(final SubLObject constant, final SubLObject name)
  {
    enforceType( constant, $sym18$CONSTANT_P );
    enforceType( name, $sym14$VALID_CONSTANT_NAME_P );
    return fi.fi_rename_int( constant, name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 6477L)
  public static SubLObject cyc_recreate(final SubLObject constant)
  {
    enforceType( constant, $sym18$CONSTANT_P );
    constants_high.remove_everything_about_constant( constant );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 7955L)
  public static SubLObject new_constant_name_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object == $kw28$UNNAMED || NIL != constant_completion_high.valid_constant_name_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 8078L)
  public static SubLObject cyc_kill(final SubLObject fort)
  {
    enforceType( fort, $sym29$FORT_P );
    SubLObject result = NIL;
    result = fi.fi_kill_int( fort );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 8521L)
  public static SubLObject cyc_rewrite(final SubLObject source_fort, final SubLObject target_fort)
  {
    enforceType( source_fort, $sym29$FORT_P );
    enforceType( target_fort, $sym29$FORT_P );
    Errors.error( $str35$cyc_rewrite_is_not_implemented_ye );
    return target_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 8849L)
  public static SubLObject cyc_merge(final SubLObject kill_fort, final SubLObject keep_fort)
  {
    enforceType( kill_fort, $sym29$FORT_P );
    enforceType( keep_fort, $sym29$FORT_P );
    return fi.fi_merge_int( kill_fort, keep_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9670L)
  public static SubLObject assert_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $assert_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9763L)
  public static SubLObject assert_properties_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym46$ASSERT_PROPERTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9862L)
  public static SubLObject get_assert_property(final SubLObject v_properties, final SubLObject indicator, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return conses_high.getf( v_properties, indicator, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9986L)
  public static SubLObject cyc_assert(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    enforceType( v_properties, $sym49$ASSERT_PROPERTIES_P );
    SubLObject result = NIL;
    final SubLObject strength = get_assert_property( v_properties, $kw50$STRENGTH, $kw51$DEFAULT );
    final SubLObject direction = get_assert_property( v_properties, $kw52$DIRECTION, UNPROVIDED );
    final SubLObject check_wffP = get_assert_property( v_properties, $kw53$CHECK_WFF_, makeBoolean( NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue( thread ) ) );
    final SubLObject forward_rules = get_assert_property( v_properties, $kw54$FORWARD_RULES, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue( thread ) );
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding( thread );
    try
    {
      fi.$assume_assert_sentence_is_wfP$.bind( makeBoolean( NIL == check_wffP ), thread );
      kb_control_vars.$forward_inference_allowed_rules$.bind( forward_rules, thread );
      result = fi.fi_assert_int( right_sentence, right_mt, strength, direction );
    }
    finally
    {
      kb_control_vars.$forward_inference_allowed_rules$.rebind( _prev_bind_2, thread );
      fi.$assume_assert_sentence_is_wfP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      cyc_bookkeeping.perform_assertion_bookkeeping( result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 11933L)
  public static SubLObject cyc_assert_wff(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    SubLObject result = NIL;
    final SubLObject new_properties = conses_high.putf( conses_high.copy_list( v_properties ), $kw53$CHECK_WFF_, NIL );
    result = cyc_assert( sentence, mt, new_properties );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 12236L)
  public static SubLObject cyc_deny(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    enforceType( v_properties, $sym49$ASSERT_PROPERTIES_P );
    SubLObject result = NIL;
    final SubLObject direction = get_assert_property( v_properties, $kw52$DIRECTION, UNPROVIDED );
    final SubLObject check_wffP = get_assert_property( v_properties, $kw53$CHECK_WFF_, makeBoolean( NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue( thread ) ) );
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding( thread );
    try
    {
      fi.$assume_assert_sentence_is_wfP$.bind( makeBoolean( NIL == check_wffP ), thread );
      result = fi.fi_deny_int( right_sentence, right_mt, direction );
    }
    finally
    {
      fi.$assume_assert_sentence_is_wfP$.rebind( _prev_bind_0, thread );
    }
    cyc_bookkeeping.perform_assertion_bookkeeping( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 13579L)
  public static SubLObject cyc_unassert(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = fi.fi_unassert_int( right_sentence, right_mt );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 14613L)
  public static SubLObject cyc_edit(final SubLObject old_sentence, final SubLObject new_sentence, SubLObject old_mt, SubLObject new_mt, SubLObject v_properties)
  {
    if( old_mt == UNPROVIDED )
    {
      old_mt = NIL;
    }
    if( new_mt == UNPROVIDED )
    {
      new_mt = old_mt;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( old_sentence, $sym47$POSSIBLY_SENTENCE_P );
    enforceType( new_sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != old_mt )
    {
      enforceType( old_mt, $sym48$POSSIBLY_MT_P );
    }
    if( NIL != new_mt )
    {
      enforceType( new_mt, $sym48$POSSIBLY_MT_P );
    }
    SubLObject result = NIL;
    final SubLObject strength = conses_high.getf( v_properties, $kw50$STRENGTH, UNPROVIDED );
    final SubLObject direction = conses_high.getf( v_properties, $kw52$DIRECTION, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject right_old_sentence = czer_utilities.unwrap_if_ist( old_sentence, old_mt, UNPROVIDED );
    final SubLObject right_old_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject right_new_sentence = czer_utilities.unwrap_if_ist( new_sentence, new_mt, UNPROVIDED );
    final SubLObject right_new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = fi.fi_edit_int( right_old_sentence, right_new_sentence, right_old_mt, right_new_mt, strength, direction );
    cyc_bookkeeping.perform_assertion_bookkeeping( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 15598L)
  public static SubLObject cyc_add_argument(final SubLObject sentence, final SubLObject cycl_supports, SubLObject mt, SubLObject v_properties, SubLObject verify_supports)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( verify_supports == UNPROVIDED )
    {
      verify_supports = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    enforceType( cycl_supports, $sym69$LIST_OF_CYCL_SUPPORT_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    enforceType( v_properties, $sym49$ASSERT_PROPERTIES_P );
    enforceType( verify_supports, $sym70$BOOLEANP );
    SubLObject result = NIL;
    final SubLObject direction = conses_high.getf( v_properties, $kw52$DIRECTION, UNPROVIDED );
    final SubLObject check_wffP = get_assert_property( v_properties, $kw53$CHECK_WFF_, makeBoolean( NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue( thread ) ) );
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding( thread );
    try
    {
      fi.$assume_assert_sentence_is_wfP$.bind( makeBoolean( NIL == check_wffP ), thread );
      result = fi.fi_add_argument_int( right_sentence, right_mt, cycl_supports, direction, verify_supports );
    }
    finally
    {
      fi.$assume_assert_sentence_is_wfP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 16964L)
  public static SubLObject cyc_remove_argument(final SubLObject sentence, final SubLObject cycl_supports, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    enforceType( cycl_supports, $sym69$LIST_OF_CYCL_SUPPORT_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = fi.fi_remove_argument_int( right_sentence, right_mt, cycl_supports, NIL );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 17467L)
  public static SubLObject cyc_remove_all_arguments(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = fi.fi_blast_int( right_sentence, right_mt );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 18084L)
  public static SubLObject legacy_query_properties_p(final SubLObject v_object)
  {
    return Types.listp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 18233L)
  public static SubLObject query_results_p(final SubLObject v_object)
  {
    return Types.listp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 18438L)
  public static SubLObject cyc_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    enforceType( v_properties, $sym81$LEGACY_QUERY_PROPERTIES_P );
    final SubLObject backchain = conses_high.getf( v_properties, $kw82$BACKCHAIN, UNPROVIDED );
    final SubLObject number = conses_high.getf( v_properties, $kw83$NUMBER, UNPROVIDED );
    final SubLObject time = conses_high.getf( v_properties, $kw84$TIME, UNPROVIDED );
    final SubLObject depth = conses_high.getf( v_properties, $kw85$DEPTH, UNPROVIDED );
    final SubLObject hypothesizeP = conses_high.getf( v_properties, $kw86$CONDITIONAL_SENTENCE, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    SubLObject result = ( NIL != hypothesizeP ) ? prove.fi_prove_int( right_sentence, right_mt, backchain, number, time, depth ) : fi.fi_ask_int( right_sentence, right_mt, backchain, number, time, depth );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != closed_query_success_result_p( result ) )
    {
      result = closed_query_success_token();
    }
    return Values.values( result, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 20932L)
  public static SubLObject query_success_result_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != open_query_success_result_p( v_object ) || NIL != closed_query_success_result_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 21275L)
  public static SubLObject open_query_result_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != bindings.binding_lists_p( v_object ) && NIL == closed_query_success_result_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 21420L)
  public static SubLObject open_query_success_result_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != open_query_result_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 22401L)
  public static SubLObject closed_query_bindings_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.equal( $closed_query_bindings$.getGlobalValue() ) || NIL != bindings.unification_success_token_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 22855L)
  public static SubLObject closed_query_justified_bindings_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != closed_query_bindings_p( v_object.first() ) && NIL != arguments
        .supports_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23253L)
  public static SubLObject closed_query_success_token()
  {
    return $closed_query_success_token$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23337L)
  public static SubLObject closed_query_success_token_p(final SubLObject v_object)
  {
    return Equality.equal( v_object, $closed_query_success_token$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23444L)
  public static SubLObject closed_query_success_result_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.singletonP( v_object ) && NIL != closed_query_bindings_p( v_object.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23861L)
  public static SubLObject closed_query_justified_success_result_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym91$CLOSED_QUERY_JUSTIFIED_BINDINGS_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 24287L)
  public static SubLObject query_id_p(final SubLObject v_object)
  {
    return Equality.eq( $kw92$LAST, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 24361L)
  public static SubLObject cyc_continue_query(SubLObject query_id, SubLObject v_properties)
  {
    if( query_id == UNPROVIDED )
    {
      query_id = $kw92$LAST;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    enforceType( query_id, $sym93$QUERY_ID_P );
    enforceType( v_properties, $sym81$LEGACY_QUERY_PROPERTIES_P );
    Errors.error( $str94$cyc_continue_query_is_deprecated_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 24856L)
  public static SubLObject cyc_tms_reconsider_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = fi.fi_tms_reconsider_formula_int( right_sentence, right_mt );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 26143L)
  public static SubLObject cyc_tms_reconsider_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fi.fi_tms_reconsider_term_int( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 26578L)
  public static SubLObject cyc_tms_reconsider_mt(final SubLObject mt)
  {
    return fi.fi_tms_reconsider_mt_int( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 26660L)
  public static SubLObject cyc_rename_variables(final SubLObject sentence, final SubLObject rename_variable_list, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( sentence, $sym47$POSSIBLY_SENTENCE_P );
    if( NIL != mt )
    {
      enforceType( mt, $sym48$POSSIBLY_MT_P );
    }
    enforceType( rename_variable_list, $sym102$ALIST_P );
    return fi.fi_rename_variables_int( sentence, mt, rename_variable_list );
  }

  public static SubLObject declare_cyc_kernel_file()
  {
    SubLFiles.declareFunction( me, "cyc_create_new_permanent", "CYC-CREATE-NEW-PERMANENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_create_new_ephemeral", "CYC-CREATE-NEW-EPHEMERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_create", "CYC-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_find_or_create", "CYC-FIND-OR-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_find_or_create_new_permanent", "CYC-FIND-OR-CREATE-NEW-PERMANENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_rename", "CYC-RENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_recreate", "CYC-RECREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_constant_name_spec_p", "NEW-CONSTANT-NAME-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_kill", "CYC-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_rewrite", "CYC-REWRITE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_merge", "CYC-MERGE", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_property_p", "ASSERT-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_properties_p", "ASSERT-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_assert_property", "GET-ASSERT-PROPERTY", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_assert", "CYC-ASSERT", 1, 2, false );
    SubLFiles.declareFunction( me, "cyc_assert_wff", "CYC-ASSERT-WFF", 1, 2, false );
    SubLFiles.declareFunction( me, "cyc_deny", "CYC-DENY", 1, 2, false );
    SubLFiles.declareFunction( me, "cyc_unassert", "CYC-UNASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_edit", "CYC-EDIT", 2, 3, false );
    SubLFiles.declareFunction( me, "cyc_add_argument", "CYC-ADD-ARGUMENT", 2, 3, false );
    SubLFiles.declareFunction( me, "cyc_remove_argument", "CYC-REMOVE-ARGUMENT", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_remove_all_arguments", "CYC-REMOVE-ALL-ARGUMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "legacy_query_properties_p", "LEGACY-QUERY-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_results_p", "QUERY-RESULTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_query", "CYC-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "query_success_result_p", "QUERY-SUCCESS-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "open_query_result_p", "OPEN-QUERY-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "open_query_success_result_p", "OPEN-QUERY-SUCCESS-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_query_bindings_p", "CLOSED-QUERY-BINDINGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_query_justified_bindings_p", "CLOSED-QUERY-JUSTIFIED-BINDINGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_query_success_token", "CLOSED-QUERY-SUCCESS-TOKEN", 0, 0, false );
    SubLFiles.declareFunction( me, "closed_query_success_token_p", "CLOSED-QUERY-SUCCESS-TOKEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_query_success_result_p", "CLOSED-QUERY-SUCCESS-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_query_justified_success_result_p", "CLOSED-QUERY-JUSTIFIED-SUCCESS-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_id_p", "QUERY-ID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_continue_query", "CYC-CONTINUE-QUERY", 0, 2, false );
    SubLFiles.declareFunction( me, "cyc_tms_reconsider_sentence", "CYC-TMS-RECONSIDER-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_tms_reconsider_term", "CYC-TMS-RECONSIDER-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_tms_reconsider_mt", "CYC-TMS-RECONSIDER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_rename_variables", "CYC-RENAME-VARIABLES", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_cyc_kernel_file()
  {
    $assert_properties$ = SubLFiles.deflexical( "*ASSERT-PROPERTIES*", $list45 );
    $closed_query_bindings$ = SubLFiles.deflexical( "*CLOSED-QUERY-BINDINGS*", NIL );
    $closed_query_success_token$ = SubLFiles.deflexical( "*CLOSED-QUERY-SUCCESS-TOKEN*", ConsesLow.list( $closed_query_bindings$.getGlobalValue() ) );
    return NIL;
  }

  public static SubLObject setup_cyc_kernel_file()
  {
    utilities_macros.register_cyc_api_function( $sym2$CYC_CREATE_NEW_PERMANENT, $list3, $str4$Creates_a_new_constant_with_name_, $list5, $list6 );
    utilities_macros.register_cyc_api_function( $sym7$CYC_CREATE_NEW_EPHEMERAL, $list3, $str8$Creates_a_new_constant_with_name_, $list5, $list6 );
    utilities_macros.register_cyc_api_function( $sym10$CYC_CREATE, $list11, $str12$Create_a_new_constant_with_id_EXT, $list13, $list6 );
    utilities_macros.register_cyc_api_function( $sym15$CYC_FIND_OR_CREATE, $list11, $str16$Return_constant_with_NAME_if_it_i, $list17, $list6 );
    utilities_macros.register_cyc_api_function( $sym19$CYC_RENAME, $list20, $str21$Change_name_of_CONSTANT_to_NAME__, $list22, $list23 );
    utilities_macros.register_cyc_api_function( $sym24$CYC_RECREATE, $list25, $str26$Doesn_t_unassert_the_bookkeeping_, $list27, $list6 );
    utilities_macros.register_cyc_api_function( $sym30$CYC_KILL, $list31, $str32$Kill_FORT_and_all_its_uses_from_t, $list33, $list34 );
    utilities_macros.register_cyc_api_function( $sym36$CYC_REWRITE, $list37, $str38$_moves__all_asserted_arguments_fr, $list39, $list40 );
    utilities_macros.register_cyc_api_function( $sym41$CYC_MERGE, $list42, $str43$Move_asserted_assertions_on_KILL_, $list44, $list40 );
    utilities_macros.register_cyc_api_function( $sym55$CYC_ASSERT, $list56, $str57$Assert_SENTENCE_in_the_specified_, $list58, $list34 );
    utilities_macros.register_cyc_api_function( $sym59$CYC_DENY, $list56, $str60$Deny_SENTENCE_in_the_specified_MT, $list58, $list34 );
    utilities_macros.register_cyc_api_function( $sym61$CYC_UNASSERT, $list62, $str63$Remove_the_assertions_canonicaliz, $list64, $list34 );
    utilities_macros.register_cyc_api_function( $sym65$CYC_EDIT, $list66, $str67$Unassert_OLD_SENTENCE_in_OLD_MT__, $list68, $list34 );
    utilities_macros.register_cyc_api_function( $sym71$CYC_ADD_ARGUMENT, $list72, $str73$Tell_Cyc_to_conclude_SENTENCE__op, $list74, $list34 );
    utilities_macros.register_cyc_api_function( $sym75$CYC_REMOVE_ARGUMENT, $list76, $str77$Remove_the_argument_for_SENTENCE_, $list78, $list34 );
    utilities_macros.register_cyc_api_function( $sym79$CYC_REMOVE_ALL_ARGUMENTS, $list62, $str80$Remove_all_arguments_for_SENTENCE, $list64, $list34 );
    utilities_macros.register_cyc_api_function( $sym87$CYC_QUERY, $list56, $str88$Query_for_bindings_for_free_varia, $list89, $list90 );
    utilities_macros.register_obsolete_cyc_api_function( $sym95$CYC_CONTINUE_QUERY, $list96, $list97, $str98$Continues_a_query_started_by__xre, $list99, $list90 );
    utilities_macros.register_cyc_api_function( $sym100$CYC_TMS_RECONSIDER_SENTENCE, $list62, $str101$Reconsider_all_arguments_for_SENT, $list64, $list34 );
    utilities_macros.register_cyc_api_function( $sym103$CYC_RENAME_VARIABLES, $list104, $str105$Rename_the_variables_in_SENTENCE_, $list106, $list34 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_kernel_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_kernel_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_kernel_file();
  }
  static
  {
    me = new cyc_kernel();
    $assert_properties$ = null;
    $closed_query_bindings$ = null;
    $closed_query_success_token$ = null;
    $sym0$NEW_CONSTANT_NAME_SPEC_P = makeSymbol( "NEW-CONSTANT-NAME-SPEC-P" );
    $sym1$FI_CREATE = makeSymbol( "FI-CREATE" );
    $sym2$CYC_CREATE_NEW_PERMANENT = makeSymbol( "CYC-CREATE-NEW-PERMANENT" );
    $list3 = ConsesLow.list( makeSymbol( "NAME" ) );
    $str4$Creates_a_new_constant_with_name_ = makeString( "Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue." );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "NEW-CONSTANT-NAME-SPEC-P" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "CONSTANT-P" ) );
    $sym7$CYC_CREATE_NEW_EPHEMERAL = makeSymbol( "CYC-CREATE-NEW-EPHEMERAL" );
    $str8$Creates_a_new_constant_with_name_ = makeString(
        "Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images." );
    $sym9$CONSTANT_EXTERNAL_ID_P = makeSymbol( "CONSTANT-EXTERNAL-ID-P" );
    $sym10$CYC_CREATE = makeSymbol( "CYC-CREATE" );
    $list11 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "EXTERNAL-ID" ) );
    $str12$Create_a_new_constant_with_id_EXT = makeString( "Create a new constant with id EXTERNAL-ID.\n   If NAME is anything other than :unnamed,\n   the new constant will be given the name NAME." );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "NEW-CONSTANT-NAME-SPEC-P" ) ), ConsesLow.list( makeSymbol( "EXTERNAL-ID" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "CONSTANT-EXTERNAL-ID-P" ) ) ) );
    $sym14$VALID_CONSTANT_NAME_P = makeSymbol( "VALID-CONSTANT-NAME-P" );
    $sym15$CYC_FIND_OR_CREATE = makeSymbol( "CYC-FIND-OR-CREATE" );
    $str16$Return_constant_with_NAME_if_it_i = makeString(
        "Return constant with NAME if it is present.  \n   If not present, then create constant with NAME, using EXTERNAL-ID if given.\n   If EXTERNAL-ID is not given, generate a new one for the new constant." );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "VALID-CONSTANT-NAME-P" ) ), ConsesLow.list( makeSymbol( "EXTERNAL-ID" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "CONSTANT-EXTERNAL-ID-P" ) ) ) );
    $sym18$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym19$CYC_RENAME = makeSymbol( "CYC-RENAME" );
    $list20 = ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "NAME" ) );
    $str21$Change_name_of_CONSTANT_to_NAME__ = makeString( "Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL." );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ), ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "VALID-CONSTANT-NAME-P" ) ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-P" ) ) );
    $sym24$CYC_RECREATE = makeSymbol( "CYC-RECREATE" );
    $list25 = ConsesLow.list( makeSymbol( "CONSTANT" ) );
    $str26$Doesn_t_unassert_the_bookkeeping_ = makeString( "Doesn't unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow." );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ) );
    $kw28$UNNAMED = makeKeyword( "UNNAMED" );
    $sym29$FORT_P = makeSymbol( "FORT-P" );
    $sym30$CYC_KILL = makeSymbol( "CYC-KILL" );
    $list31 = ConsesLow.list( makeSymbol( "FORT" ) );
    $str32$Kill_FORT_and_all_its_uses_from_t = makeString( "Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed." );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "FORT-P" ) ) );
    $list34 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $str35$cyc_rewrite_is_not_implemented_ye = makeString( "cyc-rewrite is not implemented yet" );
    $sym36$CYC_REWRITE = makeSymbol( "CYC-REWRITE" );
    $list37 = ConsesLow.list( makeSymbol( "SOURCE-FORT" ), makeSymbol( "TARGET-FORT" ) );
    $str38$_moves__all_asserted_arguments_fr = makeString( "'moves' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "SOURCE-FORT" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "TARGET-FORT" ), makeSymbol( "FORT-P" ) ) );
    $list40 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $sym41$CYC_MERGE = makeSymbol( "CYC-MERGE" );
    $list42 = ConsesLow.list( makeSymbol( "KILL-FORT" ), makeSymbol( "KEEP-FORT" ) );
    $str43$Move_asserted_assertions_on_KILL_ = makeString( "Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\n   @return fort-p; KEEP-FORT" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "KILL-FORT" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "KEEP-FORT" ), makeSymbol( "FORT-P" ) ) );
    $list45 = ConsesLow.list( makeKeyword( "STRENGTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "CHECK-WFF?" ), makeKeyword( "FORWARD-RULES" ) );
    $sym46$ASSERT_PROPERTY_P = makeSymbol( "ASSERT-PROPERTY-P" );
    $sym47$POSSIBLY_SENTENCE_P = makeSymbol( "POSSIBLY-SENTENCE-P" );
    $sym48$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym49$ASSERT_PROPERTIES_P = makeSymbol( "ASSERT-PROPERTIES-P" );
    $kw50$STRENGTH = makeKeyword( "STRENGTH" );
    $kw51$DEFAULT = makeKeyword( "DEFAULT" );
    $kw52$DIRECTION = makeKeyword( "DIRECTION" );
    $kw53$CHECK_WFF_ = makeKeyword( "CHECK-WFF?" );
    $kw54$FORWARD_RULES = makeKeyword( "FORWARD-RULES" );
    $sym55$CYC_ASSERT = makeSymbol( "CYC-ASSERT" );
    $list56 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "PROPERTIES" ) );
    $str57$Assert_SENTENCE_in_the_specified_ = makeString(
        "Assert SENTENCE in the specified MT.\n   properties; :strength el-strength-p (:default or :monotonic)\n               :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n               :forward-rules listp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   :forward-rules defaults to :all (unless *forward-inference-allowed-rules* is bound from outside)\n     and indicates which forward rules to use during post-assert processing.\n     NIL means 'do no forward inference at all.'\n   @return booleanp; t iff the assert succeeded.  If the assertion\n   already existed, it is considered a success." );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "POSSIBLY-MT-P" ) ) ), ConsesLow.list( makeSymbol( "PROPERTIES" ), makeSymbol( "ASSERT-PROPERTIES-P" ) ) );
    $sym59$CYC_DENY = makeSymbol( "CYC-DENY" );
    $str60$Deny_SENTENCE_in_the_specified_MT = makeString(
        "Deny SENTENCE in the specified MT.\n   properties; :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   @return booleanp; t iff the operation succeeded.  If the assertion\n   already existed, it is considered a success." );
    $sym61$CYC_UNASSERT = makeSymbol( "CYC-UNASSERT" );
    $list62 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str63$Remove_the_assertions_canonicaliz = makeString( "Remove the assertions canonicalized from FORMULA in the microtheory MT.\n   Return T if the operation succeeded, otherwise return NIL." );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "POSSIBLY-MT-P" ) ) ) );
    $sym65$CYC_EDIT = makeSymbol( "CYC-EDIT" );
    $list66 = ConsesLow.list( makeSymbol( "OLD-SENTENCE" ), makeSymbol( "NEW-SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "OLD-MT" ), ConsesLow.list( makeSymbol( "NEW-MT" ), makeSymbol( "OLD-MT" ) ), makeSymbol(
        "PROPERTIES" ) );
    $str67$Unassert_OLD_SENTENCE_in_OLD_MT__ = makeString( "Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\n   @see cyc-unassert and @xref cyc-assert" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "OLD-SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list(
        makeSymbol( "OLD-MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "POSSIBLY-MT-P" ) ) ), ConsesLow.list( makeSymbol( "NEW-MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
            "POSSIBLY-MT-P" ) ) ) );
    $sym69$LIST_OF_CYCL_SUPPORT_P = makeSymbol( "LIST-OF-CYCL-SUPPORT-P" );
    $sym70$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym71$CYC_ADD_ARGUMENT = makeSymbol( "CYC-ADD-ARGUMENT" );
    $list72 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "CYCL-SUPPORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "PROPERTIES" ), makeSymbol( "VERIFY-SUPPORTS" ) );
    $str73$Tell_Cyc_to_conclude_SENTENCE__op = makeString(
        "Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or \n   otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports \n   before making the assertion.\n   Properties: :direction :forward or :backward" );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "CYCL-SUPPORTS" ), makeSymbol( "LIST-OF-CYCL-SUPPORT-P" ) ), ConsesLow.list(
        makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "POSSIBLY-MT-P" ) ) ), ConsesLow.list( makeSymbol( "PROPERTIES" ), makeSymbol( "ASSERT-PROPERTIES-P" ) ), ConsesLow.list( makeSymbol(
            "VERIFY-SUPPORTS" ), makeSymbol( "BOOLEANP" ) ) );
    $sym75$CYC_REMOVE_ARGUMENT = makeSymbol( "CYC-REMOVE-ARGUMENT" );
    $list76 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "CYCL-SUPPORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str77$Remove_the_argument_for_SENTENCE_ = makeString( "Remove the argument for SENTENCE specified by CYCL-SUPPORTS." );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "CYCL-SUPPORTS" ), makeSymbol( "LIST-OF-CYCL-SUPPORT-P" ) ), ConsesLow.list(
        makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "POSSIBLY-MT-P" ) ) ) );
    $sym79$CYC_REMOVE_ALL_ARGUMENTS = makeSymbol( "CYC-REMOVE-ALL-ARGUMENTS" );
    $str80$Remove_all_arguments_for_SENTENCE = makeString(
        "Remove all arguments for SENTENCE within MT, including both those \n   arguments resulting the direct assertion of SENTENCE, and \n   those arguments supporting SENTENCE which were derived through inference.\n   Return T if successful, otherwise return NIL." );
    $sym81$LEGACY_QUERY_PROPERTIES_P = makeSymbol( "LEGACY-QUERY-PROPERTIES-P" );
    $kw82$BACKCHAIN = makeKeyword( "BACKCHAIN" );
    $kw83$NUMBER = makeKeyword( "NUMBER" );
    $kw84$TIME = makeKeyword( "TIME" );
    $kw85$DEPTH = makeKeyword( "DEPTH" );
    $kw86$CONDITIONAL_SENTENCE = makeKeyword( "CONDITIONAL-SENTENCE" );
    $sym87$CYC_QUERY = makeSymbol( "CYC-QUERY" );
    $str88$Query_for_bindings_for_free_varia = makeString(
        "Query for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\n   Properties: :backchain NIL or an integer or T\n               :number    NIL or an integer\n               :time      NIL or an integer\n               :depth     NIL or an integer\n               :conditional-sentence boolean\n   If :backchain is NIL, no backchaining is performed.\n   If :backchain is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If :backchain is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If :number is an integer, then at most that number of bindings are returned.\n   If :time is an integer, then at most that many seconds are consumed by the search for\n   bindings.\n   If :depth is an integer, then the inference paths are limited to that number of\n   total steps.\n   Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)\n   binding set.  In the case where the SENTENCE has no free variables,\n   the form (NIL), the empty binding set is returned, indicating that the gaf is either\n   directly asserted in the KB, or that it can be derived via rules in the KB.\n   If it fails to be proven, NIL will be returned.\n   The second return value indicates the reason why the query halted.\n   If SENTENCE is an implication, or an ist wrapped around an implication,\n   and the :conditional-sentence property is non-nil, cyc-query will attempt to\n   prove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "POSSIBLY-MT-P" ) ) ), ConsesLow.list( makeSymbol( "PROPERTIES" ), makeSymbol( "LEGACY-QUERY-PROPERTIES-P" ) ) );
    $list90 = ConsesLow.list( makeSymbol( "QUERY-RESULTS-P" ) );
    $sym91$CLOSED_QUERY_JUSTIFIED_BINDINGS_P = makeSymbol( "CLOSED-QUERY-JUSTIFIED-BINDINGS-P" );
    $kw92$LAST = makeKeyword( "LAST" );
    $sym93$QUERY_ID_P = makeSymbol( "QUERY-ID-P" );
    $str94$cyc_continue_query_is_deprecated_ = makeString( "cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead." );
    $sym95$CYC_CONTINUE_QUERY = makeSymbol( "CYC-CONTINUE-QUERY" );
    $list96 = ConsesLow.list( makeSymbol( "CONTINUE-INFERENCE" ) );
    $list97 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "QUERY-ID" ), makeKeyword( "LAST" ) ), makeSymbol( "PROPERTIES" ) );
    $str98$Continues_a_query_started_by__xre = makeString( "Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued." );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUERY-ID" ), makeSymbol( "QUERY-ID-P" ) ), ConsesLow.list( makeSymbol( "PROPERTIES" ), makeSymbol( "LEGACY-QUERY-PROPERTIES-P" ) ) );
    $sym100$CYC_TMS_RECONSIDER_SENTENCE = makeSymbol( "CYC-TMS-RECONSIDER-SENTENCE" );
    $str101$Reconsider_all_arguments_for_SENT = makeString( "Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error." );
    $sym102$ALIST_P = makeSymbol( "ALIST-P" );
    $sym103$CYC_RENAME_VARIABLES = makeSymbol( "CYC-RENAME-VARIABLES" );
    $list104 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "RENAME-VARIABLE-LIST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str105$Rename_the_variables_in_SENTENCE_ = makeString(
        "Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error." );
    $list106 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "POSSIBLY-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "POSSIBLY-MT-P" ) ) ), ConsesLow.list( makeSymbol( "RENAME-VARIABLE-LIST" ), makeSymbol( "ALIST-P" ) ) );
  }
}
/*
 * 
 * Total time: 236 ms
 * 
 */