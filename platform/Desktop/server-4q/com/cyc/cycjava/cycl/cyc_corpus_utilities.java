package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_corpus_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_corpus_utilities";
  public static final String myFingerPrint = "5f849433fca50fee5203dba496dc0db8880f1e5705369d7aa91a154d1112c546";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 1626L)
  private static SubLSymbol $cyc_corpus_client_host$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 1828L)
  private static SubLSymbol $cyc_corpus_client_port$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 2387L)
  private static SubLSymbol $cyc_corpus_client$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 9734L)
  private static SubLSymbol $cyc_corpus_dump_task$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$_CYC_CORPUS_CLIENT_HOST_;
  private static final SubLString $str2$ir_cyc_com;
  private static final SubLSymbol $kw3$PARAMETER;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_CYC_CORPUS_CLIENT_PORT_;
  private static final SubLInteger $int6$6666;
  private static final SubLSymbol $sym7$TCP_CLIENT;
  private static final SubLSymbol $sym8$SET_HOST;
  private static final SubLSymbol $sym9$SET_PORT;
  private static final SubLSymbol $sym10$STRINGP;
  private static final SubLSymbol $sym11$INTEGERP;
  private static final SubLSymbol $sym12$CYC_IR_CLIENT_INTERACTION;
  private static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym14$SET_KEY;
  private static final SubLSymbol $sym15$SET_VALUE;
  private static final SubLSymbol $sym16$BUILD_ANSWER;
  private static final SubLSymbol $sym17$PERFORM_REQUEST;
  private static final SubLSymbol $sym18$REQUEST_STRING;
  private static final SubLSymbol $sym19$GET_ANSWER;
  private static final SubLInteger $int20$100;
  private static final SubLSymbol $sym21$SET_SEARCH_STRING;
  private static final SubLSymbol $sym22$SET_HITNUM;
  private static final SubLSymbol $sym23$OBJECT;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$ANSWER;
  private static final SubLSymbol $sym26$HIT_NUMBER;
  private static final SubLSymbol $sym27$SEARCH_STRING;
  private static final SubLSymbol $sym28$VALUE;
  private static final SubLSymbol $sym29$KEY;
  private static final SubLSymbol $sym30$INSTANCE_COUNT;
  private static final SubLSymbol $sym31$INDEX_DIRECTIVE_TAG;
  private static final SubLString $str32$index;
  private static final SubLSymbol $sym33$SEARCH_DIRECTIVE_TAG;
  private static final SubLString $str34$search;
  private static final SubLSymbol $sym35$SUBL_DIRECTIVE_TAG;
  private static final SubLString $str36$SubL;
  private static final SubLSymbol $sym37$QUERY_TAG;
  private static final SubLString $str38$request;
  private static final SubLSymbol $sym39$QUERY_TYPE_ATTR;
  private static final SubLString $str40$type;
  private static final SubLSymbol $sym41$QUERY_LANGUAGE_ATTR;
  private static final SubLString $str42$language;
  private static final SubLSymbol $sym43$INDEX_TAG;
  private static final SubLString $str44$to_index;
  private static final SubLSymbol $sym45$INDEX_TARGET_ATTR;
  private static final SubLString $str46$target;
  private static final SubLSymbol $sym47$HITNUM_ATTR;
  private static final SubLString $str48$hitnum;
  private static final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS;
  private static final SubLSymbol $sym50$ISOLATED_P;
  private static final SubLSymbol $sym51$INSTANCE_NUMBER;
  private static final SubLSymbol $sym52$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE;
  private static final SubLSymbol $sym53$INITIALIZE;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLSymbol $sym61$CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLSymbol $sym65$CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLSymbol $sym68$CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLSymbol $sym71$CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLString $str74$_a_is_not_a_positive_integer;
  private static final SubLSymbol $sym75$CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLSymbol $sym78$XML_WRITER;
  private static final SubLSymbol $sym79$SET_STREAM;
  private static final SubLSymbol $sym80$START_TAG;
  private static final SubLSymbol $sym81$XML_PRINT;
  private static final SubLSymbol $sym82$END_TAG;
  private static final SubLSymbol $sym83$CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
  private static final SubLSymbol $sym86$CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD;
  private static final SubLString $str87$mapping_Cyc_FORTs;
  private static final SubLSymbol $kw88$SKIP;
  private static final SubLString $str89$__Couldn_t_index__S;
  private static final SubLSymbol $kw90$DONE;
  private static final SubLInteger $int91$300;
  private static final SubLString $str92$_S_is_not_an_existing_directory;
  private static final SubLString $str93$_A_corpus_dump;
  private static final SubLSymbol $sym94$ALL_TERMS_INDEX_FILES_TO_DIR;
  private static final SubLSymbol $sym95$FORT_P;
  private static final SubLString $str96$;
  private static final SubLSymbol $sym97$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const98$EverythingPSC;
  private static final SubLString $str99$_;
  private static final SubLInteger $int100$999;
  private static final SubLSymbol $sym101$DICTIONARY_P;
  private static final SubLInteger $int102$250;
  private static final SubLString $str103$_S;
  private static final SubLInteger $int104$47;
  private static final SubLString $str105$_;
  private static final SubLString $str106$_;
  private static final SubLString $str107$_;
  private static final SubLString $str108$_;
  private static final SubLString $str109$_op_;
  private static final SubLString $str110$_;
  private static final SubLString $str111$_cp_;
  private static final SubLString $str112$_;
  private static final SubLSymbol $kw113$APPEND;
  private static final SubLString $str114$Unable_to_open__S;
  private static final SubLString $str115$_____S;
  private static final SubLString $str116$mapping_Cyc_constants;
  private static final SubLString $str117$mapping_Cyc_NARTs;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 2519L)
  public static SubLObject get_cyc_corpus_client()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $cyc_corpus_client$.getDynamicValue( thread ) && $cyc_corpus_client_host$.getDynamicValue( thread ).isString() && $cyc_corpus_client_port$.getDynamicValue( thread ).isInteger() )
    {
      $cyc_corpus_client$.setDynamicValue( object.new_class_instance( $sym7$TCP_CLIENT ), thread );
      methods.funcall_instance_method_with_1_args( $cyc_corpus_client$.getDynamicValue( thread ), $sym8$SET_HOST, $cyc_corpus_client_host$.getDynamicValue( thread ) );
      methods.funcall_instance_method_with_1_args( $cyc_corpus_client$.getDynamicValue( thread ), $sym9$SET_PORT, $cyc_corpus_client_port$.getDynamicValue( thread ) );
    }
    return $cyc_corpus_client$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 3034L)
  public static SubLObject reset_cyc_corpus_client(final SubLObject host, final SubLObject port)
  {
    assert NIL != Types.stringp( host ) : host;
    assert NIL != Types.integerp( port ) : port;
    $cyc_corpus_client$.setDynamicValue( NIL );
    $cyc_corpus_client_host$.setDynamicValue( host );
    $cyc_corpus_client_port$.setDynamicValue( port );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 3268L)
  public static SubLObject add_to_cyc_corpus_index(final SubLObject key, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject interaction = object.new_class_instance( $sym12$CYC_IR_CLIENT_INTERACTION );
    SubLObject result = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          methods.funcall_instance_method_with_1_args( interaction, $sym14$SET_KEY, key );
          methods.funcall_instance_method_with_1_args( interaction, $sym15$SET_VALUE, value );
          methods.funcall_instance_method_with_1_args( interaction, $sym16$BUILD_ANSWER, methods.funcall_instance_method_with_1_args( get_cyc_corpus_client(), $sym17$PERFORM_REQUEST, methods
              .funcall_instance_method_with_0_args( interaction, $sym18$REQUEST_STRING ) ) );
          result = methods.funcall_instance_method_with_0_args( interaction, $sym19$GET_ANSWER );
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == error || NIL != get_cyc_corpus_client() )
    {
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 4583L)
  public static SubLObject lookup_cyc_corpus_index(final SubLObject string_to_look_up, SubLObject number_of_hits)
  {
    if( number_of_hits == UNPROVIDED )
    {
      number_of_hits = $int20$100;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject interaction = object.new_class_instance( $sym12$CYC_IR_CLIENT_INTERACTION );
    SubLObject results = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          methods.funcall_instance_method_with_1_args( interaction, $sym21$SET_SEARCH_STRING, string_to_look_up );
          methods.funcall_instance_method_with_1_args( interaction, $sym22$SET_HITNUM, number_of_hits );
          methods.funcall_instance_method_with_1_args( interaction, $sym16$BUILD_ANSWER, methods.funcall_instance_method_with_1_args( get_cyc_corpus_client(), $sym17$PERFORM_REQUEST, methods
              .funcall_instance_method_with_0_args( interaction, $sym18$REQUEST_STRING ) ) );
          results = methods.funcall_instance_method_with_0_args( interaction, $sym19$GET_ANSWER );
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == error || NIL != get_cyc_corpus_client() )
    {
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( cyc_ir_client_interaction, FIVE_INTEGER, $sym25$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyc_ir_client_interaction, value, FIVE_INTEGER, $sym25$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( cyc_ir_client_interaction, FOUR_INTEGER, $sym26$HIT_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyc_ir_client_interaction, value, FOUR_INTEGER, $sym26$HIT_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( cyc_ir_client_interaction, THREE_INTEGER, $sym27$SEARCH_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyc_ir_client_interaction, value, THREE_INTEGER, $sym27$SEARCH_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( cyc_ir_client_interaction, TWO_INTEGER, $sym28$VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyc_ir_client_interaction, value, TWO_INTEGER, $sym28$VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( cyc_ir_client_interaction, ONE_INTEGER, $sym29$KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyc_ir_client_interaction, value, ONE_INTEGER, $sym29$KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject get_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject set_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class( cyc_ir_client_interaction )
        : ( ( NIL != subloop_structures.class_p( cyc_ir_client_interaction ) ) ? cyc_ir_client_interaction
            : ( ( NIL != subloop_structures.instance_p( cyc_ir_client_interaction ) ) ? subloop_structures.instance_class( cyc_ir_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym23$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym31$INDEX_DIRECTIVE_TAG, $str32$index );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym33$SEARCH_DIRECTIVE_TAG, $str34$search );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym35$SUBL_DIRECTIVE_TAG, $str36$SubL );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym37$QUERY_TAG, $str38$request );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym39$QUERY_TYPE_ATTR, $str40$type );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym41$QUERY_LANGUAGE_ATTR, $str42$language );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym43$INDEX_TAG, $str44$to_index );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym45$INDEX_TARGET_ATTR, $str46$target );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym47$HITNUM_ATTR, $str48$hitnum );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym23$OBJECT, $sym50$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$OBJECT, $sym51$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym29$KEY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym28$VALUE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym27$SEARCH_STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym26$HIT_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$CYC_IR_CLIENT_INTERACTION, $sym25$ANSWER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
  public static SubLObject cyc_ir_client_interaction_p(final SubLObject cyc_ir_client_interaction)
  {
    return classes.subloop_instanceof_class( cyc_ir_client_interaction, $sym12$CYC_IR_CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 7421L)
  public static SubLObject cyc_ir_client_interaction_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 7531L)
  public static SubLObject cyc_ir_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    SubLObject v_answer = get_cyc_ir_client_interaction_answer( self );
    try
    {
      thread.throwStack.push( $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject response = NIL;
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              response = reader.read_from_string( response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
          error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          Errors.warn( error );
          Dynamic.sublisp_throw( $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self );
        }
        v_answer = response;
        Dynamic.sublisp_throw( $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_answer( self, v_answer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var2, $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 7941L)
  public static SubLObject cyc_ir_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    SubLObject key = get_cyc_ir_client_interaction_key( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        key = v_object;
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_key( self, key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8081L)
  public static SubLObject cyc_ir_client_interaction_set_value_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    SubLObject value = get_cyc_ir_client_interaction_value( self );
    try
    {
      thread.throwStack.push( $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        value = v_object;
        Dynamic.sublisp_throw( $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_value( self, value );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8225L)
  public static SubLObject cyc_ir_client_interaction_set_search_string_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    SubLObject search_string = get_cyc_ir_client_interaction_search_string( self );
    try
    {
      thread.throwStack.push( $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        search_string = v_object;
        Dynamic.sublisp_throw( $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_search_string( self, search_string );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8385L)
  public static SubLObject cyc_ir_client_interaction_set_hitnum_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    SubLObject hit_number = get_cyc_ir_client_interaction_hit_number( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.integerp( v_object ) : v_object;
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !v_object.numG( ZERO_INTEGER ) )
        {
          Errors.error( $str74$_a_is_not_a_positive_integer, v_object );
        }
        hit_number = v_object;
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_hit_number( self, hit_number );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8596L)
  public static SubLObject cyc_ir_client_interaction_request_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    final SubLObject hitnum_attr = get_cyc_ir_client_interaction_hitnum_attr( self );
    final SubLObject index_target_attr = get_cyc_ir_client_interaction_index_target_attr( self );
    final SubLObject index_tag = get_cyc_ir_client_interaction_index_tag( self );
    final SubLObject query_language_attr = get_cyc_ir_client_interaction_query_language_attr( self );
    final SubLObject query_type_attr = get_cyc_ir_client_interaction_query_type_attr( self );
    final SubLObject query_tag = get_cyc_ir_client_interaction_query_tag( self );
    final SubLObject subl_directive_tag = get_cyc_ir_client_interaction_subl_directive_tag( self );
    final SubLObject search_directive_tag = get_cyc_ir_client_interaction_search_directive_tag( self );
    final SubLObject index_directive_tag = get_cyc_ir_client_interaction_index_directive_tag( self );
    final SubLObject hit_number = get_cyc_ir_client_interaction_hit_number( self );
    final SubLObject search_string = get_cyc_ir_client_interaction_search_string( self );
    final SubLObject value = get_cyc_ir_client_interaction_value( self );
    final SubLObject key = get_cyc_ir_client_interaction_key( self );
    try
    {
      thread.throwStack.push( $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        final SubLObject outstream = streams_high.make_string_output_stream();
        final SubLObject v_xml_writer = object.new_class_instance( $sym78$XML_WRITER );
        final SubLObject query_type_tag = ( NIL != search_string ) ? search_directive_tag : index_directive_tag;
        SubLObject attributes = ConsesLow.list( query_type_attr, query_type_tag, query_language_attr, subl_directive_tag );
        if( NIL != search_string )
        {
          attributes = ConsesLow.cons( hit_number, attributes );
          attributes = ConsesLow.cons( hitnum_attr, attributes );
        }
        methods.funcall_instance_method_with_1_args( v_xml_writer, $sym79$SET_STREAM, outstream );
        methods.funcall_instance_method_with_4_args( v_xml_writer, $sym80$START_TAG, query_tag, attributes, NIL, NIL );
        if( NIL != search_string )
        {
          methods.funcall_instance_method_with_2_args( v_xml_writer, $sym81$XML_PRINT, search_string, NIL );
        }
        else
        {
          methods.funcall_instance_method_with_4_args( v_xml_writer, $sym80$START_TAG, index_tag, ConsesLow.list( index_target_attr, key ), NIL, NIL );
          methods.funcall_instance_method_with_2_args( v_xml_writer, $sym81$XML_PRINT, value, NIL );
          methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, index_tag, NIL, NIL );
        }
        methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, query_tag, NIL, NIL );
        Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, streams_high.get_output_stream_string( outstream ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_hitnum_attr( self, hitnum_attr );
          set_cyc_ir_client_interaction_index_target_attr( self, index_target_attr );
          set_cyc_ir_client_interaction_index_tag( self, index_tag );
          set_cyc_ir_client_interaction_query_language_attr( self, query_language_attr );
          set_cyc_ir_client_interaction_query_type_attr( self, query_type_attr );
          set_cyc_ir_client_interaction_query_tag( self, query_tag );
          set_cyc_ir_client_interaction_subl_directive_tag( self, subl_directive_tag );
          set_cyc_ir_client_interaction_search_directive_tag( self, search_directive_tag );
          set_cyc_ir_client_interaction_index_directive_tag( self, index_directive_tag );
          set_cyc_ir_client_interaction_hit_number( self, hit_number );
          set_cyc_ir_client_interaction_search_string( self, search_string );
          set_cyc_ir_client_interaction_value( self, value );
          set_cyc_ir_client_interaction_key( self, key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 9641L)
  public static SubLObject cyc_ir_client_interaction_get_answer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
    final SubLObject v_answer = get_cyc_ir_client_interaction_answer( self );
    try
    {
      thread.throwStack.push( $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, v_answer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_ir_client_interaction_answer( self, v_answer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_ir_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 9999L)
  public static SubLObject cyc_corpus_dump_complete_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == process_utilities.task_p( $cyc_corpus_dump_task$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    final SubLObject status = process_utilities.task_completed( $cyc_corpus_dump_task$.getDynamicValue( thread ) );
    if( NIL != status )
    {
      $cyc_corpus_dump_task$.setDynamicValue( NIL, thread );
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 10415L)
  public static SubLObject all_terms_indexed()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str87$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw88$SKIP ) )
          {
            final SubLObject idx_$1 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw88$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject error;
              SubLObject _prev_bind_0_$2;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw88$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  error = NIL;
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        cyc_corpus_index_term( fort );
                      }
                      catch( final Throwable catch_var )
                      {
                        Errors.handleThrowable( catch_var, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                  if( NIL != error )
                  {
                    Errors.warn( $str89$__Couldn_t_index__S, fort );
                  }
                }
              }
            }
            final SubLObject idx_$2 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$2 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$2 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$2 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw88$SKIP ) ) ? NIL : $kw88$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  SubLObject error2 = NIL;
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        cyc_corpus_index_term( fort2 );
                      }
                      catch( final Throwable catch_var2 )
                      {
                        Errors.handleThrowable( catch_var2, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var2 )
                  {
                    error2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                  if( NIL != error2 )
                  {
                    Errors.warn( $str89$__Couldn_t_index__S, fort2 );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
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
    return $kw90$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 10877L)
  public static SubLObject all_terms_index_files_to_dir(final SubLObject corpus_dir, SubLObject module)
  {
    if( module == UNPROVIDED )
    {
      module = $int91$300;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.probe_file( corpus_dir ) || NIL == Filesys.directory_p( corpus_dir ) )
    {
      return Errors.warn( $str92$_S_is_not_an_existing_directory, corpus_dir );
    }
    SubLObject times = ZERO_INTEGER;
    final SubLObject registry = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject message = $str87$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw88$SKIP ) )
          {
            final SubLObject idx_$6 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw88$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject v_term;
              SubLObject error;
              SubLObject _prev_bind_0_$7;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                v_term = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( v_term ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( v_term ) )
                  {
                    v_term = $kw88$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( Numbers.mod( times, module ).numE( ZERO_INTEGER ) )
                  {
                    Storage.gc_ephemeral();
                  }
                  error = NIL;
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    _prev_bind_0_$7 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        cyc_corpus_index_term_to_file( v_term, corpus_dir, registry );
                      }
                      catch( final Throwable catch_var )
                      {
                        Errors.handleThrowable( catch_var, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$7, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                  if( NIL != error )
                  {
                    Errors.warn( $str89$__Couldn_t_index__S, v_term );
                  }
                  times = Numbers.add( times, ONE_INTEGER );
                }
              }
            }
            final SubLObject idx_$7 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$7 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$7 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$7 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw88$SKIP ) ) ? NIL : $kw88$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject v_term2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) || NIL == id_index.id_index_tombstone_p( v_term2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( Numbers.mod( times, module ).numE( ZERO_INTEGER ) )
                  {
                    Storage.gc_ephemeral();
                  }
                  SubLObject error2 = NIL;
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym13$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        cyc_corpus_index_term_to_file( v_term2, corpus_dir, registry );
                      }
                      catch( final Throwable catch_var2 )
                      {
                        Errors.handleThrowable( catch_var2, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$8, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var2 )
                  {
                    error2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                  if( NIL != error2 )
                  {
                    Errors.warn( $str89$__Couldn_t_index__S, v_term2 );
                  }
                  times = Numbers.add( times, ONE_INTEGER );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
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
    return times;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 11670L)
  public static SubLObject create_all_terms_index_files_to_dir_task(final SubLObject corpus_dir, SubLObject module)
  {
    if( module == UNPROVIDED )
    {
      module = $int91$300;
    }
    final SubLObject task_name = PrintLow.format( NIL, $str93$_A_corpus_dump, control_vars.cyc_image_id() );
    $cyc_corpus_dump_task$.setDynamicValue( process_utilities.new_task( task_name, $sym94$ALL_TERMS_INDEX_FILES_TO_DIR, ConsesLow.list( corpus_dir, module ), UNPROVIDED ) );
    return task_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 12525L)
  public static SubLObject cyc_corpus_index_term(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    final SubLObject index_key = kb_utilities.hl_external_id_string( v_term );
    final SubLObject index_value = cyc_corpus_build_index_body( v_term );
    if( !index_value.equal( $str96$ ) )
    {
      return add_to_cyc_corpus_index( index_key, index_value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 14221L)
  public static SubLObject cyc_corpus_build_index_body(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( v_term ) : v_term;
    SubLObject index_body = $str96$;
    final SubLObject generations = pph_methods_lexicon.all_phrases_for_term( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym97$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const98$EverythingPSC, thread );
      final SubLObject term_comment = kb_accessors.comment( v_term, UNPROVIDED );
      final SubLObject term_cyclist_notes = kb_accessors.cyclist_notes( v_term, UNPROVIDED );
      if( term_comment.isString() )
      {
        index_body = Sequences.cconcatenate( index_body, term_comment );
      }
      SubLObject cdolist_list_var = term_cyclist_notes;
      SubLObject note = NIL;
      note = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( note.isString() )
        {
          index_body = Sequences.cconcatenate( index_body, new SubLObject[] { $str99$_, note
          } );
        }
        cdolist_list_var = cdolist_list_var.rest();
        note = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = generations;
    SubLObject phrase = NIL;
    phrase = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( phrase.isString() )
      {
        index_body = Sequences.cconcatenate( index_body, new SubLObject[] { $str99$_, phrase
        } );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      phrase = cdolist_list_var2.first();
    }
    index_body = string_utilities.strip_chars_meeting_test( index_body, UNPROVIDED );
    return index_body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 15230L)
  public static SubLObject cyc_corpus_read_hits(final SubLObject lookup_string, SubLObject number_of_hits)
  {
    if( number_of_hits == UNPROVIDED )
    {
      number_of_hits = $int20$100;
    }
    final SubLObject hits_list = lookup_cyc_corpus_index( lookup_string, number_of_hits );
    SubLObject hits_forts = NIL;
    SubLObject cdolist_list_var = hits_list;
    SubLObject hit = NIL;
    hit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject id_string = hit.isString() ? hit : PrintLow.write_to_string( hit, EMPTY_SUBL_OBJECT_ARRAY );
      final SubLObject fort = ( NIL != kb_utilities.hl_external_id_string_p( id_string ) ) ? kb_utilities.find_object_by_hl_external_id_string( id_string ) : NIL;
      if( NIL != fort )
      {
        final SubLObject item_var = fort;
        if( NIL == conses_high.member( item_var, hits_forts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          hits_forts = ConsesLow.cons( item_var, hits_forts );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      hit = cdolist_list_var.first();
    }
    return hits_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 15879L)
  public static SubLObject truncate_and_make_unique_file_name(final SubLObject file_name, final SubLObject registry, SubLObject ceiling)
  {
    if( ceiling == UNPROVIDED )
    {
      ceiling = $int100$999;
    }
    assert NIL != Types.stringp( file_name ) : file_name;
    assert NIL != dictionary.dictionary_p( registry ) : registry;
    final SubLObject base = string_utilities.string_first_n( $int102$250, file_name );
    if( NIL == dictionary.dictionary_lookup( registry, base, UNPROVIDED ) )
    {
      dictionary.dictionary_enter( registry, base, T );
      return base;
    }
    SubLObject done = NIL;
    SubLObject result = NIL;
    while ( NIL == done)
    {
      final SubLObject suffix = PrintLow.format( NIL, $str103$_S, random.random( ceiling ) );
      result = Sequences.cconcatenate( base, suffix );
      if( NIL == dictionary.dictionary_lookup( registry, result, UNPROVIDED ) )
      {
        dictionary.dictionary_enter( registry, result, T );
        done = T;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 16988L)
  public static SubLObject index_file_name_for_term(final SubLObject v_term, final SubLObject path_prefix, SubLObject registry)
  {
    if( registry == UNPROVIDED )
    {
      registry = NIL;
    }
    SubLObject filename = kb_paths.fort_name( v_term );
    final SubLObject stripped = string_utilities.strip_final_if_char( path_prefix, Characters.code_char( $int104$47 ) );
    filename = string_utilities.string_substitute( $str105$_, $str99$_, filename, UNPROVIDED );
    filename = string_utilities.string_substitute( $str105$_, $str106$_, filename, UNPROVIDED );
    filename = string_utilities.string_substitute( $str105$_, $str107$_, filename, UNPROVIDED );
    filename = string_utilities.string_substitute( $str105$_, $str108$_, filename, UNPROVIDED );
    filename = string_utilities.string_substitute( $str109$_op_, $str110$_, filename, UNPROVIDED );
    filename = string_utilities.string_substitute( $str111$_cp_, $str112$_, filename, UNPROVIDED );
    if( NIL != registry )
    {
      filename = truncate_and_make_unique_file_name( filename, registry, UNPROVIDED );
    }
    filename = Sequences.cconcatenate( stripped, new SubLObject[] { $str106$_, filename
    } );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 17853L)
  public static SubLObject cyc_corpus_index_term_to_file(final SubLObject v_term, final SubLObject corpus_dir, SubLObject registry)
  {
    if( registry == UNPROVIDED )
    {
      registry = NIL;
    }
    SubLObject written = NIL;
    final SubLObject index_body = cyc_corpus_build_index_body( v_term );
    final SubLObject out_file = index_file_name_for_term( v_term, corpus_dir, registry );
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( out_file, $kw113$APPEND );
      if( !stream.isStream() )
      {
        Errors.error( $str114$Unable_to_open__S, out_file );
      }
      final SubLObject stream_$11 = stream;
      PrintLow.format( stream_$11, $str103$_S, kb_utilities.hl_external_id_string( v_term ) );
      PrintLow.format( stream_$11, $str115$_____S, index_body );
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 18743L)
  public static SubLObject all_constants_index_files(final SubLObject corpus_dir, SubLObject module)
  {
    if( module == UNPROVIDED )
    {
      module = $int91$300;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.probe_file( corpus_dir ) || NIL == Filesys.directory_p( corpus_dir ) )
    {
      return Errors.warn( $str92$_S_is_not_an_existing_directory, corpus_dir );
    }
    SubLObject times = ZERO_INTEGER;
    final SubLObject idx = constant_handles.do_constants_table();
    final SubLObject mess = $str116$mapping_Cyc_constants;
    final SubLObject total = id_index.id_index_count( idx );
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
        final SubLObject idx_$12 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$12, $kw88$SKIP ) )
        {
          final SubLObject idx_$13 = idx_$12;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$13, $kw88$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$13 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject constant;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              constant = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( constant ) )
                {
                  constant = $kw88$SKIP;
                }
                if( Numbers.mod( times, module ).numE( ZERO_INTEGER ) )
                {
                  Storage.gc_ephemeral();
                }
                cyc_corpus_index_term_to_file( constant, corpus_dir, UNPROVIDED );
                times = Numbers.add( times, ONE_INTEGER );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$14 = idx_$12;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$14 ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$14 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$14 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$14 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw88$SKIP ) ) ? NIL : $kw88$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
              {
                if( Numbers.mod( times, module ).numE( ZERO_INTEGER ) )
                {
                  Storage.gc_ephemeral();
                }
                cyc_corpus_index_term_to_file( constant2, corpus_dir, UNPROVIDED );
                times = Numbers.add( times, ONE_INTEGER );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
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
    return times;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 19347L)
  public static SubLObject all_narts_index_files(final SubLObject corpus_dir, SubLObject module)
  {
    if( module == UNPROVIDED )
    {
      module = $int91$300;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.probe_file( corpus_dir ) || NIL == Filesys.directory_p( corpus_dir ) )
    {
      return Errors.warn( $str92$_S_is_not_an_existing_directory, corpus_dir );
    }
    SubLObject times = ZERO_INTEGER;
    final SubLObject registry = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject idx = nart_handles.do_narts_table();
    final SubLObject mess = $str117$mapping_Cyc_NARTs;
    final SubLObject total = id_index.id_index_count( idx );
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
        final SubLObject idx_$16 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$16, $kw88$SKIP ) )
        {
          final SubLObject idx_$17 = idx_$16;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$17, $kw88$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$17 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject v_term;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              v_term = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( v_term ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( v_term ) )
                {
                  v_term = $kw88$SKIP;
                }
                if( Numbers.mod( times, module ).numE( ZERO_INTEGER ) )
                {
                  Storage.gc_ephemeral();
                }
                cyc_corpus_index_term_to_file( v_term, corpus_dir, registry );
                times = Numbers.add( times, ONE_INTEGER );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$18 = idx_$16;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$18 ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$18 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$18 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$18 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw88$SKIP ) ) ? NIL : $kw88$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject v_term2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) || NIL == id_index.id_index_tombstone_p( v_term2 ) )
              {
                if( Numbers.mod( times, module ).numE( ZERO_INTEGER ) )
                {
                  Storage.gc_ephemeral();
                }
                cyc_corpus_index_term_to_file( v_term2, corpus_dir, registry );
                times = Numbers.add( times, ONE_INTEGER );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
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
    return times;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 19851L)
  public static SubLObject all_narts_indexed()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = nart_handles.do_narts_table();
    final SubLObject mess = $str117$mapping_Cyc_NARTs;
    final SubLObject total = id_index.id_index_count( idx );
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
        final SubLObject idx_$20 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$20, $kw88$SKIP ) )
        {
          final SubLObject idx_$21 = idx_$20;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$21, $kw88$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$21 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject cycl_nart;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              cycl_nart = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( cycl_nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( cycl_nart ) )
                {
                  cycl_nart = $kw88$SKIP;
                }
                cyc_corpus_index_term( cycl_nart );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$22 = idx_$20;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$22 ) || NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$22 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$22 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$22 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw88$SKIP ) ) ? NIL : $kw88$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject cycl_nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw88$SKIP ) || NIL == id_index.id_index_tombstone_p( cycl_nart2 ) )
              {
                cyc_corpus_index_term( cycl_nart2 );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
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
    return $kw90$DONE;
  }

  public static SubLObject declare_cyc_corpus_utilities_file()
  {
    SubLFiles.declareFunction( me, "get_cyc_corpus_client", "GET-CYC-CORPUS-CLIENT", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_cyc_corpus_client", "RESET-CYC-CORPUS-CLIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "add_to_cyc_corpus_index", "ADD-TO-CYC-CORPUS-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "lookup_cyc_corpus_index", "LOOKUP-CYC-CORPUS-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_answer", "GET-CYC-IR-CLIENT-INTERACTION-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_answer", "SET-CYC-IR-CLIENT-INTERACTION-ANSWER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_hit_number", "GET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_hit_number", "SET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_search_string", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_search_string", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_value", "GET-CYC-IR-CLIENT-INTERACTION-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_value", "SET-CYC-IR-CLIENT-INTERACTION-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_key", "GET-CYC-IR-CLIENT-INTERACTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_key", "SET-CYC-IR-CLIENT-INTERACTION-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_hitnum_attr", "GET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_hitnum_attr", "SET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_index_target_attr", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_index_target_attr", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_index_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_index_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_query_language_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_query_language_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_query_type_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_query_type_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_query_tag", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_query_tag", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_subl_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_subl_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_search_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_search_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_ir_client_interaction_index_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_ir_client_interaction_index_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_ir_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_ir_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_p", "CYC-IR-CLIENT-INTERACTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_initialize_method", "CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_build_answer_method", "CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_set_key_method", "CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_set_value_method", "CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_set_search_string_method", "CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_set_hitnum_method", "CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_request_string_method", "CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_ir_client_interaction_get_answer_method", "CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_corpus_dump_complete_p", "CYC-CORPUS-DUMP-COMPLETE-P", 0, 0, false );
    SubLFiles.declareFunction( me, "all_terms_indexed", "ALL-TERMS-INDEXED", 0, 0, false );
    SubLFiles.declareFunction( me, "all_terms_index_files_to_dir", "ALL-TERMS-INDEX-FILES-TO-DIR", 1, 1, false );
    SubLFiles.declareFunction( me, "create_all_terms_index_files_to_dir_task", "CREATE-ALL-TERMS-INDEX-FILES-TO-DIR-TASK", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_corpus_index_term", "CYC-CORPUS-INDEX-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_corpus_build_index_body", "CYC-CORPUS-BUILD-INDEX-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_corpus_read_hits", "CYC-CORPUS-READ-HITS", 1, 1, false );
    SubLFiles.declareFunction( me, "truncate_and_make_unique_file_name", "TRUNCATE-AND-MAKE-UNIQUE-FILE-NAME", 2, 1, false );
    SubLFiles.declareFunction( me, "index_file_name_for_term", "INDEX-FILE-NAME-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_corpus_index_term_to_file", "CYC-CORPUS-INDEX-TERM-TO-FILE", 2, 1, false );
    SubLFiles.declareFunction( me, "all_constants_index_files", "ALL-CONSTANTS-INDEX-FILES", 1, 1, false );
    SubLFiles.declareFunction( me, "all_narts_index_files", "ALL-NARTS-INDEX-FILES", 1, 1, false );
    SubLFiles.declareFunction( me, "all_narts_indexed", "ALL-NARTS-INDEXED", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cyc_corpus_utilities_file()
  {
    $cyc_corpus_client_host$ = SubLFiles.defparameter( "*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper( $list0.isSymbol() ? Symbols.symbol_value( $list0 ) : $list0, $sym1$_CYC_CORPUS_CLIENT_HOST_,
        $str2$ir_cyc_com.isSymbol() ? Symbols.symbol_value( $str2$ir_cyc_com ) : $str2$ir_cyc_com, $kw3$PARAMETER, UNPROVIDED ) );
    $cyc_corpus_client_port$ = SubLFiles.defparameter( "*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper( $list4.isSymbol() ? Symbols.symbol_value( $list4 ) : $list4, $sym5$_CYC_CORPUS_CLIENT_PORT_,
        $int6$6666.isSymbol() ? Symbols.symbol_value( $int6$6666 ) : $int6$6666, $kw3$PARAMETER, UNPROVIDED ) );
    $cyc_corpus_client$ = SubLFiles.defparameter( "*CYC-CORPUS-CLIENT*", NIL );
    $cyc_corpus_dump_task$ = SubLFiles.defvar( "*CYC-CORPUS-DUMP-TASK*", NIL );
    return NIL;
  }

  public static SubLObject setup_cyc_corpus_utilities_file()
  {
    classes.subloop_new_class( $sym12$CYC_IR_CLIENT_INTERACTION, $sym23$OBJECT, NIL, NIL, $list24 );
    classes.class_set_implements_slot_listeners( $sym12$CYC_IR_CLIENT_INTERACTION, NIL );
    classes.subloop_note_class_initialization_function( $sym12$CYC_IR_CLIENT_INTERACTION, $sym49$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym12$CYC_IR_CLIENT_INTERACTION, $sym52$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE );
    subloop_reserved_initialize_cyc_ir_client_interaction_class( $sym12$CYC_IR_CLIENT_INTERACTION );
    methods.methods_incorporate_instance_method( $sym53$INITIALIZE, $sym12$CYC_IR_CLIENT_INTERACTION, $list54, NIL, $list55 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym53$INITIALIZE, $sym56$CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym16$BUILD_ANSWER, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, $list58, $list59 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym16$BUILD_ANSWER, $sym61$CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym14$SET_KEY, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list63 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym14$SET_KEY, $sym65$CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym15$SET_VALUE, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list66 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym15$SET_VALUE, $sym68$CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym21$SET_SEARCH_STRING, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list69 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym21$SET_SEARCH_STRING, $sym71$CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym22$SET_HITNUM, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list72 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym22$SET_HITNUM, $sym75$CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD );
    methods.methods_incorporate_instance_method( $sym18$REQUEST_STRING, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, NIL, $list76 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym18$REQUEST_STRING, $sym83$CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_ANSWER, $sym12$CYC_IR_CLIENT_INTERACTION, $list57, NIL, $list84 );
    methods.subloop_register_instance_method( $sym12$CYC_IR_CLIENT_INTERACTION, $sym19$GET_ANSWER, $sym86$CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_corpus_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_corpus_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_corpus_utilities_file();
  }
  static
  {
    me = new cyc_corpus_utilities();
    $cyc_corpus_client_host$ = null;
    $cyc_corpus_client_port$ = null;
    $cyc_corpus_client$ = null;
    $cyc_corpus_dump_task$ = null;
    $list0 = ConsesLow.list( makeString( "application.cyc-ir.cyc-corpus-client-host" ) );
    $sym1$_CYC_CORPUS_CLIENT_HOST_ = makeSymbol( "*CYC-CORPUS-CLIENT-HOST*" );
    $str2$ir_cyc_com = makeString( "ir.cyc.com" );
    $kw3$PARAMETER = makeKeyword( "PARAMETER" );
    $list4 = ConsesLow.list( makeString( "application.cyc-ir.cyc-corpus-client-port" ) );
    $sym5$_CYC_CORPUS_CLIENT_PORT_ = makeSymbol( "*CYC-CORPUS-CLIENT-PORT*" );
    $int6$6666 = makeInteger( 6666 );
    $sym7$TCP_CLIENT = makeSymbol( "TCP-CLIENT" );
    $sym8$SET_HOST = makeSymbol( "SET-HOST" );
    $sym9$SET_PORT = makeSymbol( "SET-PORT" );
    $sym10$STRINGP = makeSymbol( "STRINGP" );
    $sym11$INTEGERP = makeSymbol( "INTEGERP" );
    $sym12$CYC_IR_CLIENT_INTERACTION = makeSymbol( "CYC-IR-CLIENT-INTERACTION" );
    $sym13$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym14$SET_KEY = makeSymbol( "SET-KEY" );
    $sym15$SET_VALUE = makeSymbol( "SET-VALUE" );
    $sym16$BUILD_ANSWER = makeSymbol( "BUILD-ANSWER" );
    $sym17$PERFORM_REQUEST = makeSymbol( "PERFORM-REQUEST" );
    $sym18$REQUEST_STRING = makeSymbol( "REQUEST-STRING" );
    $sym19$GET_ANSWER = makeSymbol( "GET-ANSWER" );
    $int20$100 = makeInteger( 100 );
    $sym21$SET_SEARCH_STRING = makeSymbol( "SET-SEARCH-STRING" );
    $sym22$SET_HITNUM = makeSymbol( "SET-HITNUM" );
    $sym23$OBJECT = makeSymbol( "OBJECT" );
    $list24 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INDEX-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "index" ) ), ConsesLow.list(
        makeSymbol( "SEARCH-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "search" ) ), ConsesLow.list( makeSymbol( "SUBL-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ),
            makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "SubL" ) ), ConsesLow.list( makeSymbol( "QUERY-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString(
                "request" ) ), ConsesLow.list( makeSymbol( "QUERY-TYPE-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "type" ) ), ConsesLow.list( makeSymbol(
                    "QUERY-LANGUAGE-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "language" ) ), ConsesLow.list( makeSymbol( "INDEX-TAG" ), makeKeyword( "CLASS" ),
                        makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "to-index" ) ), ConsesLow.list( makeSymbol( "INDEX-TARGET-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword(
                            "VALUE" ), makeString( "target" ) ), ConsesLow.list( makeSymbol( "HITNUM-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "hitnum" ) ), ConsesLow
                                .list( makeSymbol( "KEY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "VALUE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow
                                    .list( makeSymbol( "SEARCH-STRING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "HIT-NUMBER" ), makeKeyword( "INSTANCE" ), makeKeyword(
                                        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "ANSWER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                            "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-KEY" ), ConsesLow.list( makeSymbol( "OBJECT" ) ),
                                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-VALUE" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword(
                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REQUEST-STRING" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym25$ANSWER = makeSymbol( "ANSWER" );
    $sym26$HIT_NUMBER = makeSymbol( "HIT-NUMBER" );
    $sym27$SEARCH_STRING = makeSymbol( "SEARCH-STRING" );
    $sym28$VALUE = makeSymbol( "VALUE" );
    $sym29$KEY = makeSymbol( "KEY" );
    $sym30$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym31$INDEX_DIRECTIVE_TAG = makeSymbol( "INDEX-DIRECTIVE-TAG" );
    $str32$index = makeString( "index" );
    $sym33$SEARCH_DIRECTIVE_TAG = makeSymbol( "SEARCH-DIRECTIVE-TAG" );
    $str34$search = makeString( "search" );
    $sym35$SUBL_DIRECTIVE_TAG = makeSymbol( "SUBL-DIRECTIVE-TAG" );
    $str36$SubL = makeString( "SubL" );
    $sym37$QUERY_TAG = makeSymbol( "QUERY-TAG" );
    $str38$request = makeString( "request" );
    $sym39$QUERY_TYPE_ATTR = makeSymbol( "QUERY-TYPE-ATTR" );
    $str40$type = makeString( "type" );
    $sym41$QUERY_LANGUAGE_ATTR = makeSymbol( "QUERY-LANGUAGE-ATTR" );
    $str42$language = makeString( "language" );
    $sym43$INDEX_TAG = makeSymbol( "INDEX-TAG" );
    $str44$to_index = makeString( "to-index" );
    $sym45$INDEX_TARGET_ATTR = makeSymbol( "INDEX-TARGET-ATTR" );
    $str46$target = makeString( "target" );
    $sym47$HITNUM_ATTR = makeSymbol( "HITNUM-ATTR" );
    $str48$hitnum = makeString( "hitnum" );
    $sym49$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS" );
    $sym50$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym51$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym52$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE" );
    $sym53$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list54 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym56$CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD" );
    $list57 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list58 = ConsesLow.list( makeSymbol( "RESPONSE-STRING" ) );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESPONSE" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol(
        "ERROR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "READ-FROM-STRING" ), makeSymbol( "RESPONSE-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
            makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "ANSWER" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $sym61$CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD" );
    $list62 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "KEY" ), makeSymbol( "OBJECT" ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $sym65$CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD" );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALUE" ), makeSymbol( "OBJECT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $sym68$CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD" );
    $list69 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEARCH-STRING" ), makeSymbol( "OBJECT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $sym71$CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol(
        "OBJECT" ), ZERO_INTEGER ), makeString( "~a is not a positive integer" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HIT-NUMBER" ), makeSymbol( "OBJECT" ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $str74$_a_is_not_a_positive_integer = makeString( "~a is not a positive integer" );
    $sym75$CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OUTSTREAM" ), ConsesLow.list( makeSymbol( "MAKE-STRING-OUTPUT-STREAM" ) ) ), ConsesLow.list( makeSymbol(
        "XML-WRITER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "XML-WRITER" ) ) ) ), ConsesLow.list( makeSymbol( "QUERY-TYPE-TAG" ), ConsesLow.list(
            makeSymbol( "FIF" ), makeSymbol( "SEARCH-STRING" ), makeSymbol( "SEARCH-DIRECTIVE-TAG" ), makeSymbol( "INDEX-DIRECTIVE-TAG" ) ) ), ConsesLow.list( makeSymbol( "ATTRIBUTES" ), ConsesLow.list( makeSymbol(
                "BQ-LIST" ), makeSymbol( "QUERY-TYPE-ATTR" ), makeSymbol( "QUERY-TYPE-TAG" ), makeSymbol( "QUERY-LANGUAGE-ATTR" ), makeSymbol( "SUBL-DIRECTIVE-TAG" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                    makeSymbol( "SEARCH-STRING" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "HIT-NUMBER" ), makeSymbol( "ATTRIBUTES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "HITNUM-ATTR" ),
                        makeSymbol( "ATTRIBUTES" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STREAM" ) ),
                            makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "START-TAG" ) ),
                                makeSymbol( "QUERY-TAG" ), makeSymbol( "ATTRIBUTES" ), NIL, NIL ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( makeSymbol( "SEARCH-STRING" ), ConsesLow.list( makeSymbol(
                                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "XML-PRINT" ) ), makeSymbol( "SEARCH-STRING" ), NIL ) ), ConsesLow.list( T,
                                        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "START-TAG" ) ), makeSymbol( "INDEX-TAG" ),
                                            ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "INDEX-TARGET-ATTR" ), makeSymbol( "KEY" ) ), NIL, NIL ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                                                makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "XML-PRINT" ) ), makeSymbol( "VALUE" ), NIL ), ConsesLow.list( makeSymbol(
                                                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "END-TAG" ) ), makeSymbol( "INDEX-TAG" ), NIL, NIL ) ) ),
        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "END-TAG" ) ), makeSymbol( "QUERY-TAG" ), NIL, NIL ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-OUTPUT-STREAM-STRING" ), makeSymbol( "OUTSTREAM" ) ) ) ) );
    $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $sym78$XML_WRITER = makeSymbol( "XML-WRITER" );
    $sym79$SET_STREAM = makeSymbol( "SET-STREAM" );
    $sym80$START_TAG = makeSymbol( "START-TAG" );
    $sym81$XML_PRINT = makeSymbol( "XML-PRINT" );
    $sym82$END_TAG = makeSymbol( "END-TAG" );
    $sym83$CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWER" ) ) );
    $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD" );
    $sym86$CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol( "CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD" );
    $str87$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $kw88$SKIP = makeKeyword( "SKIP" );
    $str89$__Couldn_t_index__S = makeString( "~%Couldn't index ~S" );
    $kw90$DONE = makeKeyword( "DONE" );
    $int91$300 = makeInteger( 300 );
    $str92$_S_is_not_an_existing_directory = makeString( "~S is not an existing directory" );
    $str93$_A_corpus_dump = makeString( "~A-corpus-dump" );
    $sym94$ALL_TERMS_INDEX_FILES_TO_DIR = makeSymbol( "ALL-TERMS-INDEX-FILES-TO-DIR" );
    $sym95$FORT_P = makeSymbol( "FORT-P" );
    $str96$ = makeString( "" );
    $sym97$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const98$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str99$_ = makeString( " " );
    $int100$999 = makeInteger( 999 );
    $sym101$DICTIONARY_P = makeSymbol( "DICTIONARY-P" );
    $int102$250 = makeInteger( 250 );
    $str103$_S = makeString( "~S" );
    $int104$47 = makeInteger( 47 );
    $str105$_ = makeString( "_" );
    $str106$_ = makeString( "/" );
    $str107$_ = makeString( ";" );
    $str108$_ = makeString( ":" );
    $str109$_op_ = makeString( "_op_" );
    $str110$_ = makeString( "(" );
    $str111$_cp_ = makeString( "_cp_" );
    $str112$_ = makeString( ")" );
    $kw113$APPEND = makeKeyword( "APPEND" );
    $str114$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str115$_____S = makeString( "~%~%~S" );
    $str116$mapping_Cyc_constants = makeString( "mapping Cyc constants" );
    $str117$mapping_Cyc_NARTs = makeString( "mapping Cyc NARTs" );
  }
}
/*
 * 
 * Total time: 703 ms
 * 
 */