//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constants_high
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constants_high";
  public static final String myFingerPrint = "841191859c8a0b679f830e1d25d1965e82a7c59af185c8b00ff928c275ae2ddd";
  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9380L)
  public static SubLSymbol $constant_external_id_equivalence_map$;
  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13439L)
  private static SubLSymbol $constant_legacy_guid_date$;
  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19292L)
  public static SubLSymbol $constant_dump_id_table$;
  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20144L)
  public static SubLSymbol $constant_name_obfuscation_fn$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$NUM;
  private static final SubLSymbol $kw4$PROGRESS_MESSAGE;
  private static final SubLString $str5$mapping_constants_for_sweep;
  private static final SubLSymbol $kw6$DONE;
  private static final SubLSymbol $sym7$PIF;
  private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym9$PROGRESS_CSOME;
  private static final SubLSymbol $sym10$CONSTANTS_AROUND;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$DO_CONSTANTS;
  private static final SubLSymbol $sym13$CONSTANT_NAME_SPEC_P;
  private static final SubLSymbol $sym14$CONSTANT_EXTERNAL_ID_P;
  private static final SubLSymbol $sym15$CREATE_CONSTANT;
  private static final SubLList $list16;
  private static final SubLString $str17$Return_a_new_constant_named_NAME_;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$STRINGP;
  private static final SubLSymbol $sym21$FIND_OR_CREATE_CONSTANT;
  private static final SubLString $str22$Return_the_constant_with_NAME_if_;
  private static final SubLList $list23;
  private static final SubLString $str24$TMP;
  private static final SubLString $str25$_A__A;
  private static final SubLSymbol $sym26$GENTEMP_CONSTANT;
  private static final SubLList $list27;
  private static final SubLString $str28$Create_and_return_a_temporary_con;
  private static final SubLList $list29;
  private static final SubLString $str30$;
  private static final SubLSymbol $kw31$UPCASE;
  private static final SubLSymbol $kw32$DOWNCASE;
  private static final SubLString $str33$T;
  private static final SubLString $str34$T_;
  private static final SubLSymbol $sym35$CONSTANT_P;
  private static final SubLSymbol $sym36$REMOVE_CONSTANT;
  private static final SubLList $list37;
  private static final SubLString $str38$Remove_CONSTANT_from_the_KB_;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$FIND_CONSTANT;
  private static final SubLList $list42;
  private static final SubLString $str43$Return_the_constant_with_NAME__or;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$CONSTANT_NAME;
  private static final SubLString $str46$Return_the_name_of_CONSTANT_or__u;
  private static final SubLSymbol $sym47$GUID_P;
  private static final SubLSymbol $sym48$GUID_STRING_P;
  private static final SubLSymbol $sym49$RENAME_CONSTANT;
  private static final SubLList $list50;
  private static final SubLString $str51$Rename_CONSTANT_to_have_NEW_NAME_;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$CONSTANT_INTERNAL_ID;
  private static final SubLString $str54$Return_the_internal_id_of_CONSTAN;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$CONSTANT_INTERNAL_ID_P;
  private static final SubLSymbol $sym57$FIND_CONSTANT_BY_INTERNAL_ID;
  private static final SubLList $list58;
  private static final SubLString $str59$Return_the_constant_with_internal;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$CLET;
  private static final SubLSymbol $sym63$_CONSTANT_EXTERNAL_ID_EQUIVALENCE_MAP_;
  private static final SubLSymbol $sym64$CONSTANT_EXTERNAL_ID;
  private static final SubLString $str65$Return_the_external_id_of_CONSTAN;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$FIND_CONSTANT_BY_EXTERNAL_ID;
  private static final SubLList $list68;
  private static final SubLString $str69$Return_the_constant_with_EXTERNAL;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$LISTP;
  private static final SubLSymbol $sym72$CONSTANT_INFO_FROM_GUID_STRINGS;
  private static final SubLList $list73;
  private static final SubLString $str74$Returns_a_list_of_constant_info_i;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$CONSTANT_INFO_FROM_NAME_STRINGS;
  private static final SubLList $list78;
  private static final SubLString $str79$Returns_a_list_of_constant_info_i;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$CONSTANT_LEGACY_ID_P;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLSymbol $kw85$UNNAMED;
  private static final SubLString $str86$cyc;
  private static final SubLSymbol $sym87$CONSTANT_NAMESPACE;
  private static final SubLString $str88$Return_the_namespace_to_which_the;
  private static final SubLSymbol $sym89$CONSTANT_NAME_WITHIN_NAMESPACE;
  private static final SubLString $str90$Return_the_constant_name_within_i;
  private static final SubLSymbol $sym91$TRUE;
  private static final SubLSymbol $sym92$RANDOM_CONSTANT;
  private static final SubLList $list93;
  private static final SubLString $str94$Return_a_randomly_chosen_constant;
  private static final SubLInteger $int95$500;
  private static final SubLSymbol $sym96$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym97$REGULAR_EXPRESSION_P;
  private static final SubLString $str98$Error__A___A__compiling_regular_e;
  private static final SubLSymbol $kw99$SKIP;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$WITH_CONSTANT_NAME_OBFUSCATION;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$_CONSTANT_NAME_OBFUSCATION_FN_;
  private static final SubLInteger $int105$100;
  private static final SubLSymbol $sym106$FIND_CONSTANT_BY_SUID;
  private static final boolean $find_renamed$ = false;

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 1074L)
  public static SubLObject do_recent_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject num_tail = cdestructuring_bind.property_list_member( $kw3$NUM, current );
    final SubLObject num = ( NIL != num_tail ) ? conses_high.cadr( num_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw4$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str5$mapping_constants_for_sweep;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym7$PIF, ConsesLow.list( $sym8$POSITIVE_INTEGER_P, num ), ConsesLow.listS( $sym9$PROGRESS_CSOME, ConsesLow.list( var, ConsesLow.list( $sym10$CONSTANTS_AROUND, $list11, num, num ),
        progress_message, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym12$DO_CONSTANTS, ConsesLow.list( var, progress_message, $kw6$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 1727L)
  public static SubLObject create_constant(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    enforceType( name, $sym13$CONSTANT_NAME_SPEC_P );
    if( NIL != external_id )
    {
      enforceType( external_id, $sym14$CONSTANT_EXTERNAL_ID_P );
    }
    if( NIL == external_id )
    {
      external_id = make_constant_external_id();
    }
    SubLObject result = NIL;
    result = constants_interface.kb_create_constant( name, external_id );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 2278L)
  public static SubLObject find_or_create_constant(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    enforceType( name, $sym20$STRINGP );
    final SubLObject constant = find_constant( name );
    if( NIL != installed_constant_p( constant ) )
    {
      return constant;
    }
    return create_constant( name, external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 2724L)
  public static SubLObject gentemp_constant(final SubLObject start_name, SubLObject prefix)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str24$TMP;
    }
    enforceType( start_name, $sym20$STRINGP );
    final SubLObject name = constant_completion_high.uniquify_constant_name( PrintLow.format( NIL, $str25$_A__A, prefix, start_name ), UNPROVIDED );
    final SubLObject constant = create_constant( name, UNPROVIDED );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 3084L)
  public static SubLObject suggest_constant_name(final SubLObject string, SubLObject prefix, SubLObject suffix, SubLObject initial_case, SubLObject uniquifyP, SubLObject sequentialP)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str30$;
    }
    if( suffix == UNPROVIDED )
    {
      suffix = $str30$;
    }
    if( initial_case == UNPROVIDED )
    {
      initial_case = $kw31$UPCASE;
    }
    if( uniquifyP == UNPROVIDED )
    {
      uniquifyP = T;
    }
    if( sequentialP == UNPROVIDED )
    {
      sequentialP = NIL;
    }
    SubLObject name = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject string_var = unicode_strings.utf8_string_to_subl_string( string );
      SubLObject end_var_$2;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      SubLObject valid_charP;
      for( end_var = ( end_var_$2 = Sequences.length( string_var ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$2 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string_var, char_num );
        valid_charP = constant_completion_high.valid_constant_name_char_p( v_char );
        if( v_char.eql( Characters.CHAR_space ) )
        {
          initial_case = $kw31$UPCASE;
        }
        else if( NIL != valid_charP && initial_case == $kw31$UPCASE )
        {
          print_high.princ( Characters.char_upcase( v_char ), stream );
          initial_case = NIL;
        }
        else if( NIL != valid_charP && initial_case == $kw32$DOWNCASE )
        {
          print_high.princ( Characters.char_downcase( v_char ), stream );
          initial_case = NIL;
        }
        else if( NIL != valid_charP )
        {
          print_high.princ( v_char, stream );
        }
      }
      name = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    if( name.equalp( $str33$T ) )
    {
      name = $str34$T_;
    }
    name = Sequences.cconcatenate( prefix, new SubLObject[] { name, suffix
    } );
    if( NIL != uniquifyP )
    {
      name = constant_completion_high.uniquify_constant_name( name, sequentialP );
    }
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 4275L)
  public static SubLObject remove_constant(final SubLObject constant)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    remove_everything_about_constant( constant );
    if( NIL != tms.tms_please_kill_this_term_for_me( constant ) )
    {
      return constant;
    }
    return constants_interface.kb_remove_constant( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 4621L)
  public static SubLObject remove_everything_about_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != constant_handles.constant_p( constant ) : constant;
    final SubLObject _prev_bind_0 = hl_macros.$forts_being_removed$.currentBinding( thread );
    try
    {
      hl_macros.$forts_being_removed$.bind( ConsesLow.cons( constant, hl_macros.$forts_being_removed$.getDynamicValue( thread ) ), thread );
      if( NIL != term.reified_skolem_fn_in_any_mtP( constant, T, T ) )
      {
        skolems.remove_defn_of_skolem( constant, UNPROVIDED );
      }
      if( NIL != kb_control_vars.time_kb_loaded_p() && NIL != sbhl_time_utilities.sbhl_temporality_term_p( constant ) )
      {
        sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures( constant );
      }
      narts_high.remove_dependent_narts( constant );
      bookkeeping_store.unassert_all_bookkeeping_gafs_on_term( constant );
      kb_indexing.remove_term_indices( constant );
      kb_hl_supports_high.tms_remove_kb_hl_supports_mentioning_term( constant );
      cardinality_estimates.clear_cardinality_estimates( constant );
    }
    finally
    {
      hl_macros.$forts_being_removed$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 5869L)
  public static SubLObject find_constant(final SubLObject name)
  {
    enforceType( name, $sym20$STRINGP );
    final SubLObject constant = constants_interface.kb_lookup_constant_by_name( name );
    if( $find_renamed$ && constant == NIL )
    {
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6116L)
  public static SubLObject constant_name(final SubLObject constant)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    return constants_interface.kb_constant_name( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6284L)
  public static SubLObject constant_guid(final SubLObject constant)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    return ( NIL != constant_handles.constant_handle_validP( constant ) ) ? constants_interface.kb_constant_guid( constant ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6477L)
  public static SubLObject constant_merged_guid(final SubLObject constant)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    return ( NIL != constant_handles.constant_handle_validP( constant ) ) ? constants_interface.kb_constant_merged_guid( constant ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6691L)
  public static SubLObject find_constant_by_guid(final SubLObject guid)
  {
    assert NIL != Guids.guid_p( guid ) : guid;
    return constants_interface.kb_lookup_constant_by_guid( guid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6866L)
  public static SubLObject find_constant_by_guid_string(final SubLObject guid_string)
  {
    assert NIL != Guids.guid_string_p( guid_string ) : guid_string;
    return find_constant_by_guid( Guids.string_to_guid( guid_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 7138L)
  public static SubLObject rename_constant(final SubLObject constant, final SubLObject new_name)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    enforceType( new_name, $sym20$STRINGP );
    return constants_interface.kb_rename_constant( constant, new_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 7462L)
  public static SubLObject constant_internal_id(final SubLObject constant)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    return constant_handles.constant_suid( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 7844L)
  public static SubLObject constant_internal_id_from_external_id(final SubLObject external_id)
  {
    final SubLObject constant = find_constant_by_external_id( external_id );
    return ( NIL != constant ) ? constant_internal_id( constant ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8037L)
  public static SubLObject find_constant_by_internal_id(final SubLObject id)
  {
    enforceType( id, $sym56$CONSTANT_INTERNAL_ID_P );
    return constant_handles.find_constant_by_suid( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8274L)
  public static SubLObject constant_internal_id_p(final SubLObject v_object)
  {
    return Types.integerp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8407L)
  public static SubLObject constant_internal_id_L(final SubLObject constant1, final SubLObject constant2)
  {
    final SubLObject suid_1 = constant_handles.constant_suid( constant1 );
    final SubLObject suid_2 = constant_handles.constant_suid( constant2 );
    if( NIL != suid_1 && NIL != suid_2 )
    {
      return Numbers.numL( suid_1, suid_2 );
    }
    if( NIL == suid_1 && NIL == suid_2 )
    {
      return NIL;
    }
    return Types.sublisp_null( suid_1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8873L)
  public static SubLObject installed_constant_p(final SubLObject v_object)
  {
    return constant_handles.valid_constant_handleP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9027L)
  public static SubLObject uninstalled_constant_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL == installed_constant_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9230L)
  public static SubLObject new_constant_internal_id_threshold()
  {
    return constant_handles.new_constant_suid_threshold();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9674L)
  public static SubLObject with_constant_external_id_equivalence_map(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject id_map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    id_map = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym62$CLET, ConsesLow.list( ConsesLow.list( $sym63$_CONSTANT_EXTERNAL_ID_EQUIVALENCE_MAP_, id_map ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9835L)
  public static SubLObject prefered_constant_external_id_wrt_equivalence(SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != map_utilities.map_p( $constant_external_id_equivalence_map$.getDynamicValue( thread ) ) )
    {
      external_id = map_utilities.map_get_without_values( $constant_external_id_equivalence_map$.getDynamicValue( thread ), external_id, external_id );
    }
    return external_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10102L)
  public static SubLObject constant_external_id(final SubLObject constant)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    return constant_guid( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10317L)
  public static SubLObject constant_name_from_internal_id(final SubLObject internal_id)
  {
    final SubLObject constant = find_constant_by_internal_id( internal_id );
    return ( NIL != constant_handles.constant_p( constant ) ) ? constant_name( constant ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10509L)
  public static SubLObject find_constant_by_external_id(SubLObject external_id)
  {
    enforceType( external_id, $sym14$CONSTANT_EXTERNAL_ID_P );
    external_id = prefered_constant_external_id_wrt_equivalence( external_id );
    return find_constant_by_guid( external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10855L)
  public static SubLObject constant_external_id_p(final SubLObject v_object)
  {
    return Guids.guid_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10986L)
  public static SubLObject constant_has_external_id(final SubLObject constant, final SubLObject external_id)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    assert NIL != constant_external_id_p( external_id ) : external_id;
    final SubLObject guid = constant_guid( constant );
    return Guids.guidE( guid, external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 11276L)
  public static SubLObject constant_external_id_L(final SubLObject constant1, final SubLObject constant2)
  {
    final SubLObject guid_1 = constant_guid( constant1 );
    final SubLObject guid_2 = constant_guid( constant2 );
    if( NIL != guid_1 && NIL != guid_2 )
    {
      return Guids.guidL( guid_1, guid_2 );
    }
    if( NIL == guid_1 && NIL == guid_2 )
    {
      return NIL;
    }
    return Types.sublisp_null( guid_1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 11746L)
  public static SubLObject constant_info_from_guid_strings(final SubLObject guid_string_list)
  {
    enforceType( guid_string_list, $sym71$LISTP );
    SubLObject constant_info_list = NIL;
    SubLObject constant = NIL;
    SubLObject cdolist_list_var = guid_string_list;
    SubLObject guid_string = NIL;
    guid_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      constant = find_constant_by_external_id( Guids.string_to_guid( guid_string ) );
      if( NIL != constant )
      {
        constant_info_list = ConsesLow.cons( ConsesLow.list( guid_string, constant_name( constant ) ), constant_info_list );
      }
      else
      {
        constant_info_list = ConsesLow.cons( NIL, constant_info_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      guid_string = cdolist_list_var.first();
    }
    return Sequences.nreverse( constant_info_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 12365L)
  public static SubLObject constant_info_from_name_strings(final SubLObject name_string_list)
  {
    enforceType( name_string_list, $sym71$LISTP );
    SubLObject constant_info_list = NIL;
    SubLObject constant = NIL;
    SubLObject cdolist_list_var = name_string_list;
    SubLObject name_string = NIL;
    name_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      constant = find_constant( name_string );
      if( NIL != constant )
      {
        constant_info_list = ConsesLow.cons( ConsesLow.list( constant_guid( constant ), constant_name( constant ) ), constant_info_list );
      }
      else
      {
        constant_info_list = ConsesLow.cons( NIL, constant_info_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      name_string = cdolist_list_var.first();
    }
    return Sequences.nreverse( constant_info_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 12965L)
  public static SubLObject make_constant_external_id()
  {
    return make_constant_guid();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13132L)
  public static SubLObject make_skolem_id()
  {
    return make_constant_external_id();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13380L)
  public static SubLObject make_constant_guid()
  {
    return Guids.new_guid();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13637L)
  public static SubLObject make_constant_legacy_guid(final SubLObject legacy_id)
  {
    assert NIL != constant_legacy_id_p( legacy_id ) : legacy_id;
    SubLObject current;
    final SubLObject datum = current = $constant_legacy_guid_date$.getGlobalValue();
    SubLObject month = NIL;
    SubLObject day = NIL;
    SubLObject year = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    month = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    day = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    year = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Guids.make_date_relative_guid( year, month, day, legacy_id );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13933L)
  public static SubLObject constant_guid_to_legacy_id(final SubLObject guid)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Guids.guid_p( guid ) : guid;
    if( NIL != Guids.date_relative_guid_p( guid ) )
    {
      thread.resetMultipleValues();
      final SubLObject given_year = Guids.crack_date_relative_guid( guid );
      final SubLObject given_month = thread.secondMultipleValue();
      final SubLObject given_day = thread.thirdMultipleValue();
      final SubLObject legacy_id = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      SubLObject current;
      final SubLObject datum = current = $constant_legacy_guid_date$.getGlobalValue();
      SubLObject legacy_month = NIL;
      SubLObject legacy_day = NIL;
      SubLObject legacy_year = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
      legacy_month = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
      legacy_day = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
      legacy_year = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( legacy_year.numE( given_year ) && legacy_month.numE( given_month ) && legacy_day.numE( given_day ) )
        {
          return legacy_id;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 14440L)
  public static SubLObject constant_legacy_id(final SubLObject constant)
  {
    return constant_guid_to_legacy_id( constant_guid( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 14821L)
  public static SubLObject find_constant_by_legacy_id(final SubLObject legacy_id)
  {
    return find_constant_by_guid( make_constant_legacy_guid( legacy_id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15011L)
  public static SubLObject constant_legacy_id_p(final SubLObject v_object)
  {
    return Types.integerp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15087L)
  public static SubLObject unnamed_constant_p(final SubLObject constant)
  {
    return makeBoolean( NIL != constant_handles.constant_p( constant ) && $kw85$UNNAMED == constant_name( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15331L)
  public static SubLObject constant_namespace(final SubLObject constant)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    final SubLObject delim = string_utilities.char_position( Characters.CHAR_colon, constant_name( constant ), UNPROVIDED );
    if( NIL != delim )
    {
      return Sequences.subseq( constant_name( constant ), ZERO_INTEGER, delim );
    }
    return $str86$cyc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15806L)
  public static SubLObject constant_name_within_namespace(final SubLObject constant)
  {
    enforceType( constant, $sym35$CONSTANT_P );
    final SubLObject delim = string_utilities.char_position( Characters.CHAR_colon, constant_name( constant ), UNPROVIDED );
    if( NIL != delim )
    {
      return Sequences.subseq( constant_name( constant ), Numbers.add( delim, ONE_INTEGER ), UNPROVIDED );
    }
    return constant_name( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 16254L)
  public static SubLObject random_constant(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym91$TRUE );
    }
    return constants_low.random_constant_internal( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 16929L)
  public static SubLObject sample_constants(SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int95$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym91$TRUE );
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL != allow_repeatsP )
    {
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( random_constant( test ), result );
      }
      return result;
    }
    SubLObject result;
    for( result = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( result ).numL( n ); result = set_contents.set_contents_add( random_constant( test ), result, Symbols
        .symbol_function( EQL ) ) )
    {
    }
    return set_contents.set_contents_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 17518L)
  public static SubLObject constant_grep(final SubLObject regular_expression, SubLObject comp_options, SubLObject match_options)
  {
    if( comp_options == UNPROVIDED )
    {
      comp_options = NIL;
    }
    if( match_options == UNPROVIDED )
    {
      match_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != regular_expressions.regular_expression_p( regular_expression ) : regular_expression;
    SubLObject matches = NIL;
    thread.resetMultipleValues();
    final SubLObject pattern = regular_expressions.compile_regular_expression( regular_expression, comp_options );
    final SubLObject error_code = thread.secondMultipleValue();
    final SubLObject error_offset = thread.thirdMultipleValue();
    final SubLObject error_msg = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    try
    {
      if( NIL == regular_expressions.regex_pattern_p( pattern ) )
      {
        Errors.error( $str98$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset
        } );
      }
      matches = constant_grep_pattern( pattern, match_options );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != regular_expressions.regex_pattern_p( pattern ) )
        {
          regular_expressions.discard_regular_expression_pattern( pattern );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 17518L)
  public static SubLObject constant_grep_pattern(final SubLObject pattern, SubLObject match_options)
  {
    if( match_options == UNPROVIDED )
    {
      match_options = NIL;
    }
    SubLObject matches = NIL;
    final SubLObject idx = constant_handles.do_constants_table();
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw99$SKIP ) )
    {
      final SubLObject idx_$3 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw99$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject constant;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          constant = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw99$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( constant ) )
            {
              constant = $kw99$SKIP;
            }
            if( NIL != list_utilities.sublisp_boolean( regular_expression_utilities.find_all_matches_within_string( pattern, constant_name( constant ), match_options, NIL, UNPROVIDED, UNPROVIDED ) ) )
            {
              matches = ConsesLow.cons( constant, matches );
            }
          }
        }
      }
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) || NIL == id_index.id_index_skip_tombstones_p( $kw99$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$4 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$4 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$4 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw99$SKIP ) ) ? NIL : $kw99$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( ( NIL == id_index.id_index_skip_tombstones_p( $kw99$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) ) && NIL != list_utilities.sublisp_boolean( regular_expression_utilities
              .find_all_matches_within_string( pattern, constant_name( constant2 ), match_options, NIL, UNPROVIDED, UNPROVIDED ) ) )
          {
            matches = ConsesLow.cons( constant2, matches );
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( matches );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 18435L)
  public static SubLObject constant_checkpoint_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != list_utilities.every_in_list( $sym96$NON_NEGATIVE_INTEGER_P,
        v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 18723L)
  public static SubLObject new_constant_checkpoint()
  {
    final SubLObject constant_count = constant_handles.constant_count();
    final SubLObject next_constant_id = constant_handles.next_constant_suid();
    return ConsesLow.list( constant_count, next_constant_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 18973L)
  public static SubLObject constant_checkpoint_currentP(final SubLObject constant_checkpoint)
  {
    SubLObject checkpoint_count = NIL;
    SubLObject checkpoint_next_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constant_checkpoint, constant_checkpoint, $list100 );
    checkpoint_count = constant_checkpoint.first();
    SubLObject current = constant_checkpoint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constant_checkpoint, $list100 );
    checkpoint_next_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( checkpoint_count.numE( constant_handles.constant_count() ) && checkpoint_next_id.numE( constant_handles.next_constant_suid() ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( constant_checkpoint, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19510L)
  public static SubLObject constant_dump_id(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = constant_internal_id( constant );
    final SubLObject dump_table = $constant_dump_id_table$.getDynamicValue( thread );
    if( NIL != dump_table )
    {
      id = id_index.id_index_lookup( dump_table, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19783L)
  public static SubLObject find_constant_by_dump_id(final SubLObject dump_id)
  {
    return find_constant_by_internal_id( dump_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19937L)
  public static SubLObject with_constant_dump_id_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym62$CLET, $list101, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20498L)
  public static SubLObject constant_dump_name(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $constant_name_obfuscation_fn$.getDynamicValue( thread ).isFunctionSpec() )
    {
      return Functions.funcall( $constant_name_obfuscation_fn$.getDynamicValue( thread ), constant );
    }
    return constant_name( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20703L)
  public static SubLObject with_constant_name_obfuscation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject obfuscate_fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    obfuscate_fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym62$CLET, ConsesLow.list( ConsesLow.list( $sym104$_CONSTANT_NAME_OBFUSCATION_FN_, obfuscate_fn ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20987L)
  public static SubLObject constants_around_constant(final SubLObject constant, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int105$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != constant_handles.constant_p( constant ) : constant;
    return constants_around( constant_handles.constant_suid( constant ), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 21474L)
  public static SubLObject constants_around(final SubLObject constant_id, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int105$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != subl_promotions.non_negative_integer_p( constant_id ) : constant_id;
    return assertions_high.kb_objects_around_id( $sym106$FIND_CONSTANT_BY_SUID, ZERO_INTEGER, constant_id, constant_handles.next_constant_suid(), total, before, after );
  }

  public static SubLObject declare_constants_high_file()
  {
    SubLFiles.declareMacro(me, "do_recent_constants", "DO-RECENT-CONSTANTS" );
    SubLFiles.declareFunction(me, "create_constant", "CREATE-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction(me, "find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction(me, "gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction(me, "suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 5, false );
    SubLFiles.declareFunction(me, "remove_constant", "REMOVE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction(me, "remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant", "FIND-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_name", "CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_guid", "CONSTANT-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false );
    SubLFiles.declareFunction(me, "rename_constant", "RENAME-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction(me, "constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false );
    SubLFiles.declareFunction(me, "installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction(me, "uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction(me, "new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false );
    SubLFiles.declareMacro(me, "with_constant_external_id_equivalence_map", "WITH-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP" );
    SubLFiles.declareFunction(me, "prefered_constant_external_id_wrt_equivalence", "PREFERED-CONSTANT-EXTERNAL-ID-WRT-EQUIVALENCE", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false );
    SubLFiles.declareFunction(me, "constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false );
    SubLFiles.declareFunction(me, "constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false );
    SubLFiles.declareFunction(me, "make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false );
    SubLFiles.declareFunction(me, "make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false );
    SubLFiles.declareFunction(me, "make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false );
    SubLFiles.declareFunction(me, "make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false );
    SubLFiles.declareFunction(me, "unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction(me, "random_constant", "RANDOM-CONSTANT", 0, 1, false );
    SubLFiles.declareFunction(me, "sample_constants", "SAMPLE-CONSTANTS", 0, 3, false );
    SubLFiles.declareFunction(me, "constant_grep", "CONSTANT-GREP", 1, 2, false );
    SubLFiles.declareFunction(me, "constant_grep_pattern", "CONSTANT-GREP-PATTERN", 1, 1, false );
    SubLFiles.declareFunction(me, "constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false );
    SubLFiles.declareFunction(me, "new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false );
    SubLFiles.declareFunction(me, "constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false );
    SubLFiles.declareMacro(me, "with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE" );
    SubLFiles.declareFunction(me, "constant_dump_name", "CONSTANT-DUMP-NAME", 1, 0, false );
    SubLFiles.declareMacro(me, "with_constant_name_obfuscation", "WITH-CONSTANT-NAME-OBFUSCATION" );
    SubLFiles.declareFunction(me, "constants_around_constant", "CONSTANTS-AROUND-CONSTANT", 1, 3, false );
    SubLFiles.declareFunction(me, "constants_around", "CONSTANTS-AROUND", 1, 3, false );
    return NIL;
  }

  public static SubLObject init_constants_high_file()
  {
    $constant_external_id_equivalence_map$ = SubLFiles.defparameter( "*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", NIL );
    $constant_legacy_guid_date$ = SubLFiles.deflexical( "*CONSTANT-LEGACY-GUID-DATE*", $list81 );
    $constant_dump_id_table$ = SubLFiles.defparameter( "*CONSTANT-DUMP-ID-TABLE*", NIL );
    $constant_name_obfuscation_fn$ = SubLFiles.defparameter( "*CONSTANT-NAME-OBFUSCATION-FN*", NIL );
    return NIL;
  }

  public static SubLObject setup_constants_high_file()
  {
    utilities_macros.register_cyc_api_function( $sym15$CREATE_CONSTANT, $list16, $str17$Return_a_new_constant_named_NAME_, $list18, $list19 );
    utilities_macros.register_cyc_api_function( $sym21$FIND_OR_CREATE_CONSTANT, $list16, $str22$Return_the_constant_with_NAME_if_, $list23, $list19 );
    utilities_macros.register_cyc_api_function( $sym26$GENTEMP_CONSTANT, $list27, $str28$Create_and_return_a_temporary_con, $list29, $list19 );
    utilities_macros.register_cyc_api_function( $sym36$REMOVE_CONSTANT, $list37, $str38$Remove_CONSTANT_from_the_KB_, $list39, $list40 );
    utilities_macros.register_cyc_api_function( $sym41$FIND_CONSTANT, $list42, $str43$Return_the_constant_with_NAME__or, $list23, $list44 );
    utilities_macros.register_cyc_api_function( $sym45$CONSTANT_NAME, $list37, $str46$Return_the_name_of_CONSTANT_or__u, $list39, NIL );
    utilities_macros.register_cyc_api_function( $sym49$RENAME_CONSTANT, $list50, $str51$Rename_CONSTANT_to_have_NEW_NAME_, $list52, $list19 );
    utilities_macros.register_cyc_api_function( $sym53$CONSTANT_INTERNAL_ID, $list37, $str54$Return_the_internal_id_of_CONSTAN, $list39, $list55 );
    utilities_macros.register_cyc_api_function( $sym57$FIND_CONSTANT_BY_INTERNAL_ID, $list58, $str59$Return_the_constant_with_internal, $list60, $list44 );
    utilities_macros.register_cyc_api_function( $sym64$CONSTANT_EXTERNAL_ID, $list37, $str65$Return_the_external_id_of_CONSTAN, $list39, $list66 );
    utilities_macros.register_cyc_api_function( $sym67$FIND_CONSTANT_BY_EXTERNAL_ID, $list68, $str69$Return_the_constant_with_EXTERNAL, $list70, $list44 );
    utilities_macros.register_cyc_api_function( $sym72$CONSTANT_INFO_FROM_GUID_STRINGS, $list73, $str74$Returns_a_list_of_constant_info_i, $list75, $list76 );
    utilities_macros.register_cyc_api_function( $sym77$CONSTANT_INFO_FROM_NAME_STRINGS, $list78, $str79$Returns_a_list_of_constant_info_i, $list80, $list76 );
    utilities_macros.register_cyc_api_function( $sym87$CONSTANT_NAMESPACE, $list37, $str88$Return_the_namespace_to_which_the, $list39, NIL );
    utilities_macros.register_cyc_api_function( $sym89$CONSTANT_NAME_WITHIN_NAMESPACE, $list37, $str90$Return_the_constant_name_within_i, $list39, NIL );
    utilities_macros.register_cyc_api_function( $sym92$RANDOM_CONSTANT, $list93, $str94$Return_a_randomly_chosen_constant, NIL, $list19 );
    access_macros.register_external_symbol( $sym102$WITH_CONSTANT_NAME_OBFUSCATION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constants_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constants_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constants_high_file();
  }
  static
  {
    me = new constants_high();
    $constant_external_id_equivalence_map$ = null;
    $constant_legacy_guid_date$ = null;
    $constant_dump_id_table$ = null;
    $constant_name_obfuscation_fn$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping constants for sweep" ) ),
        SubLObjectFactory.makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$NUM = makeKeyword( "NUM" );
    $kw4$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str5$mapping_constants_for_sweep = makeString( "mapping constants for sweep" );
    $kw6$DONE = makeKeyword( "DONE" );
    $sym7$PIF = makeSymbol( "PIF" );
    $sym8$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym9$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $sym10$CONSTANTS_AROUND = makeSymbol( "CONSTANTS-AROUND" );
    $list11 = ConsesLow.list( makeSymbol( "NEXT-CONSTANT-SUID" ) );
    $sym12$DO_CONSTANTS = makeSymbol( "DO-CONSTANTS" );
    $sym13$CONSTANT_NAME_SPEC_P = makeSymbol( "CONSTANT-NAME-SPEC-P" );
    $sym14$CONSTANT_EXTERNAL_ID_P = makeSymbol( "CONSTANT-EXTERNAL-ID-P" );
    $sym15$CREATE_CONSTANT = makeSymbol( "CREATE-CONSTANT" );
    $list16 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "EXTERNAL-ID" ) );
    $str17$Return_a_new_constant_named_NAME_ = makeString( "Return a new constant named NAME with EXTERNAL-ID as the external ID." );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "CONSTANT-NAME-SPEC-P" ) ), ConsesLow.list( makeSymbol( "EXTERNAL-ID" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
        "CONSTANT-EXTERNAL-ID-P" ) ) ) );
    $list19 = ConsesLow.list( makeSymbol( "CONSTANT-P" ) );
    $sym20$STRINGP = makeSymbol( "STRINGP" );
    $sym21$FIND_OR_CREATE_CONSTANT = makeSymbol( "FIND-OR-CREATE-CONSTANT" );
    $str22$Return_the_constant_with_NAME_if_ = makeString(
        "Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant." );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ) );
    $str24$TMP = makeString( "TMP" );
    $str25$_A__A = makeString( "~A-~A" );
    $sym26$GENTEMP_CONSTANT = makeSymbol( "GENTEMP-CONSTANT" );
    $list27 = ConsesLow.list( makeSymbol( "START-NAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PREFIX" ), makeString( "TMP" ) ) );
    $str28$Create_and_return_a_temporary_con = makeString( "Create and return a temporary constant whose name is based on START-NAME" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "START-NAME" ), makeSymbol( "STRINGP" ) ) );
    $str30$ = makeString( "" );
    $kw31$UPCASE = makeKeyword( "UPCASE" );
    $kw32$DOWNCASE = makeKeyword( "DOWNCASE" );
    $str33$T = makeString( "T" );
    $str34$T_ = makeString( "T-" );
    $sym35$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym36$REMOVE_CONSTANT = makeSymbol( "REMOVE-CONSTANT" );
    $list37 = ConsesLow.list( makeSymbol( "CONSTANT" ) );
    $str38$Remove_CONSTANT_from_the_KB_ = makeString( "Remove CONSTANT from the KB." );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ) );
    $list40 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym41$FIND_CONSTANT = makeSymbol( "FIND-CONSTANT" );
    $list42 = ConsesLow.list( makeSymbol( "NAME" ) );
    $str43$Return_the_constant_with_NAME__or = makeString( "Return the constant with NAME, or NIL if not present." );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-P" ) ) );
    $sym45$CONSTANT_NAME = makeSymbol( "CONSTANT-NAME" );
    $str46$Return_the_name_of_CONSTANT_or__u = makeString( "Return the name of CONSTANT or :unnamed." );
    $sym47$GUID_P = makeSymbol( "GUID-P" );
    $sym48$GUID_STRING_P = makeSymbol( "GUID-STRING-P" );
    $sym49$RENAME_CONSTANT = makeSymbol( "RENAME-CONSTANT" );
    $list50 = ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "NEW-NAME" ) );
    $str51$Rename_CONSTANT_to_have_NEW_NAME_ = makeString( "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned." );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ), ConsesLow.list( makeSymbol( "NEW-NAME" ), makeSymbol( "STRINGP" ) ) );
    $sym53$CONSTANT_INTERNAL_ID = makeSymbol( "CONSTANT-INTERNAL-ID" );
    $str54$Return_the_internal_id_of_CONSTAN = makeString( "Return the internal id of CONSTANT." );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-INTERNAL-ID-P" ) ) );
    $sym56$CONSTANT_INTERNAL_ID_P = makeSymbol( "CONSTANT-INTERNAL-ID-P" );
    $sym57$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" );
    $list58 = ConsesLow.list( makeSymbol( "ID" ) );
    $str59$Return_the_constant_with_internal = makeString( "Return the constant with internal ID, or NIL if not present." );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "CONSTANT-INTERNAL-ID-P" ) ) );
    $list61 = ConsesLow.list( makeSymbol( "ID-MAP" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym62$CLET = makeSymbol( "CLET" );
    $sym63$_CONSTANT_EXTERNAL_ID_EQUIVALENCE_MAP_ = makeSymbol( "*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*" );
    $sym64$CONSTANT_EXTERNAL_ID = makeSymbol( "CONSTANT-EXTERNAL-ID" );
    $str65$Return_the_external_id_of_CONSTAN = makeString( "Return the external id of CONSTANT." );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-EXTERNAL-ID-P" ) ) );
    $sym67$FIND_CONSTANT_BY_EXTERNAL_ID = makeSymbol( "FIND-CONSTANT-BY-EXTERNAL-ID" );
    $list68 = ConsesLow.list( makeSymbol( "EXTERNAL-ID" ) );
    $str69$Return_the_constant_with_EXTERNAL = makeString( "Return the constant with EXTERNAL-ID, or NIL if not present." );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "EXTERNAL-ID" ), makeSymbol( "CONSTANT-EXTERNAL-ID-P" ) ) );
    $sym71$LISTP = makeSymbol( "LISTP" );
    $sym72$CONSTANT_INFO_FROM_GUID_STRINGS = makeSymbol( "CONSTANT-INFO-FROM-GUID-STRINGS" );
    $list73 = ConsesLow.list( makeSymbol( "GUID-STRING-LIST" ) );
    $str74$Returns_a_list_of_constant_info_i = makeString( "Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name." );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "GUID-STRING-LIST" ), makeSymbol( "LISTP" ) ) );
    $list76 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym77$CONSTANT_INFO_FROM_NAME_STRINGS = makeSymbol( "CONSTANT-INFO-FROM-NAME-STRINGS" );
    $list78 = ConsesLow.list( makeSymbol( "NAME-STRING-LIST" ) );
    $str79$Returns_a_list_of_constant_info_i = makeString( "Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name." );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME-STRING-LIST" ), makeSymbol( "LISTP" ) ) );
    $list81 = ConsesLow.list( SEVEN_INTEGER, TWENTY_INTEGER, makeInteger( 1969 ) );
    $sym82$CONSTANT_LEGACY_ID_P = makeSymbol( "CONSTANT-LEGACY-ID-P" );
    $list83 = ConsesLow.list( makeSymbol( "MONTH" ), makeSymbol( "DAY" ), makeSymbol( "YEAR" ) );
    $list84 = ConsesLow.list( makeSymbol( "LEGACY-MONTH" ), makeSymbol( "LEGACY-DAY" ), makeSymbol( "LEGACY-YEAR" ) );
    $kw85$UNNAMED = makeKeyword( "UNNAMED" );
    $str86$cyc = makeString( "cyc" );
    $sym87$CONSTANT_NAMESPACE = makeSymbol( "CONSTANT-NAMESPACE" );
    $str88$Return_the_namespace_to_which_the = makeString( "Return the namespace to which the constant belongs." );
    $sym89$CONSTANT_NAME_WITHIN_NAMESPACE = makeSymbol( "CONSTANT-NAME-WITHIN-NAMESPACE" );
    $str90$Return_the_constant_name_within_i = makeString( "Return the constant name within its namespace." );
    $sym91$TRUE = makeSymbol( "TRUE" );
    $sym92$RANDOM_CONSTANT = makeSymbol( "RANDOM-CONSTANT" );
    $list93 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TRUE" ) ) ) );
    $str94$Return_a_randomly_chosen_constant = makeString( "Return a randomly chosen constant that satisfies TEST" );
    $int95$500 = makeInteger( 500 );
    $sym96$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym97$REGULAR_EXPRESSION_P = makeSymbol( "REGULAR-EXPRESSION-P" );
    $str98$Error__A___A__compiling_regular_e = makeString( "Error ~A (~A) compiling regular expression ~S at offset ~A." );
    $kw99$SKIP = makeKeyword( "SKIP" );
    $list100 = ConsesLow.list( makeSymbol( "CHECKPOINT-COUNT" ), makeSymbol( "CHECKPOINT-NEXT-ID" ) );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTANT-DUMP-ID-TABLE*" ), ConsesLow.list( makeSymbol( "CREATE-CONSTANT-DUMP-ID-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*CFASL-CONSTANT-HANDLE-FUNC*" ),
        ConsesLow.list( SubLObjectFactory.makeSymbol( "QUOTE" ), makeSymbol( "CONSTANT-DUMP-ID" ) ) ) );
    $sym102$WITH_CONSTANT_NAME_OBFUSCATION = makeSymbol( "WITH-CONSTANT-NAME-OBFUSCATION" );
    $list103 = ConsesLow.list( makeSymbol( "OBFUSCATE-FN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym104$_CONSTANT_NAME_OBFUSCATION_FN_ = makeSymbol( "*CONSTANT-NAME-OBFUSCATION-FN*" );
    $int105$100 = makeInteger( 100 );
    $sym106$FIND_CONSTANT_BY_SUID = makeSymbol( "FIND-CONSTANT-BY-SUID" );
  }
}
