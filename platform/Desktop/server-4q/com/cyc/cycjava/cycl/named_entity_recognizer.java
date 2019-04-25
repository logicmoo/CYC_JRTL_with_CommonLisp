package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.quirk.answer;
import com.cyc.cycjava.cycl.quirk.question;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class named_entity_recognizer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.named_entity_recognizer";
  public static final String myFingerPrint = "0d7f251724304dff562b077d2d946abe6792daa0e6dea0ca4d8b7af496e5726b";
  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12201L)
  private static SubLSymbol $break_named_entityP$;
  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
  private static SubLSymbol $named_entityP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 17716L)
  public static SubLSymbol $stanford_ner_host$;
  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 17935L)
  public static SubLSymbol $stanford_ner_port$;
  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 20785L)
  private static SubLSymbol $resporator_to_cycl_map$;
  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 23670L)
  private static SubLSymbol $place_tightening_lexicon$;
  private static final SubLSymbol $sym0$NAMED_ENTITY;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CONFIDENCE;
  private static final SubLSymbol $sym4$CYC;
  private static final SubLSymbol $sym5$SOURCE;
  private static final SubLSymbol $sym6$TYPE;
  private static final SubLSymbol $sym7$STRING;
  private static final SubLSymbol $sym8$INSTANCE_COUNT;
  private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS;
  private static final SubLSymbol $sym10$ISOLATED_P;
  private static final SubLSymbol $sym11$INSTANCE_NUMBER;
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE;
  private static final SubLSymbol $sym13$PRINT;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
  private static final SubLString $str18$__NE__;
  private static final SubLString $str19$_;
  private static final SubLString $str20$_;
  private static final SubLSymbol $sym21$NAMED_ENTITY_PRINT_METHOD;
  private static final SubLSymbol $sym22$GET_STRING;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym26$NAMED_ENTITY_GET_STRING_METHOD;
  private static final SubLSymbol $sym27$GET_TYPE;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym30$NAMED_ENTITY_GET_TYPE_METHOD;
  private static final SubLSymbol $sym31$GET_CYC;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym34$NAMED_ENTITY_GET_CYC_METHOD;
  private static final SubLSymbol $sym35$GET_CONFIDENCE;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym38$NAMED_ENTITY_GET_CONFIDENCE_METHOD;
  private static final SubLSymbol $sym39$GET_SOURCE;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym42$NAMED_ENTITY_GET_SOURCE_METHOD;
  private static final SubLSymbol $sym43$CONTEXTUALIZED_NAMED_ENTITY;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$SUBTYPES;
  private static final SubLSymbol $sym46$OFFSETS;
  private static final SubLSymbol $sym47$CONTEXT;
  private static final SubLSymbol $sym48$LEXICON;
  private static final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS;
  private static final SubLSymbol $sym50$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE;
  private static final SubLSymbol $sym51$GET_LEXICON;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym54$IGNORE_CACHE;
  private static final SubLSymbol $sym55$CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD;
  private static final SubLSymbol $sym56$SET_LEXICON;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD;
  private static final SubLSymbol $sym60$CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD;
  private static final SubLSymbol $sym61$LISTP;
  private static final SubLSymbol $sym62$TIGHTEN_TYPE;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD;
  private static final SubLObject $const66$Person;
  private static final SubLString $str67$Who;
  private static final SubLString $str68$What;
  private static final SubLString $str69$is;
  private static final SubLString $str70$_;
  private static final SubLSymbol $sym71$PARSE;
  private static final SubLSymbol $sym72$DEFINITIONAL_QUESTION;
  private static final SubLSymbol $sym73$LEXIFY;
  private static final SubLSymbol $sym74$EXTRACT;
  private static final SubLObject $const75$Organization;
  private static final SubLSymbol $sym76$GET_CONTENT;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD;
  private static final SubLSymbol $sym79$GET_PARSE_TREE;
  private static final SubLSymbol $kw80$BEST_ONLY;
  private static final SubLSymbol $sym81$GET_HEAD_DAUGHTERS;
  private static final SubLSymbol $sym82$LEXIFY_SENTENCE;
  private static final SubLSymbol $sym83$DENOTS_OF_PS_HARVEST_NBARS;
  private static final SubLList $list84;
  private static final SubLSymbol $kw85$NONE;
  private static final SubLSymbol $sym86$NAMED_ENTITY_;
  private static final SubLSymbol $sym87$STRINGP;
  private static final SubLSymbol $sym88$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym89$STANFORD_NER;
  private static final SubLSymbol $sym90$O;
  private static final SubLSymbol $sym91$_EXIT;
  private static final SubLSymbol $sym92$RUN;
  private static final SubLString $str93$Error___S_occured_in_NAMED_ENTITY;
  private static final SubLSymbol $sym94$_NAMED_ENTITY__CACHING_STATE_;
  private static final SubLSymbol $sym95$NAMED_ENTITY_RECOGNIZER;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$KNOWN_CYC_TYPES;
  private static final SubLSymbol $sym100$TYPE_MAP;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS;
  private static final SubLSymbol $sym104$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE;
  private static final SubLSymbol $sym105$TO_CYC;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD;
  private static final SubLSymbol $sym109$STANFORD_NER_TO_CYC_METHOD;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$STANFORD_NER_RUN_METHOD;
  private static final SubLString $str113$;
  private static final SubLString $str114$_;
  private static final SubLSymbol $sym115$MERGE_CLUSTERS;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLObject $const118$Place;
  private static final SubLString $str119$_;
  private static final SubLString $str120$__;
  private static final SubLSymbol $sym121$LOCATION;
  private static final SubLSymbol $sym122$STANFORD_NER_MERGE_CLUSTERS_METHOD;
  private static final SubLSymbol $sym123$GET;
  private static final SubLSymbol $kw124$DENOT;
  private static final SubLObject $const125$State_US;
  private static final SubLObject $const126$InferencePSC;
  private static final SubLSymbol $sym127$_STANFORD_NER_HOST_;
  private static final SubLString $str128$localhost;
  private static final SubLSymbol $sym129$_STANFORD_NER_PORT_;
  private static final SubLInteger $int130$6666;
  private static final SubLString $str131$The_cat_sat_on_the_mat_;
  private static final SubLSymbol $kw132$PUBLIC;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$RESPORATOR;
  private static final SubLSymbol $sym135$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS;
  private static final SubLSymbol $sym136$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$NEXT_RESPORATOR_ENTITY;
  private static final SubLSymbol $sym139$RESPORATOR_RUN_METHOD;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD;
  private static final SubLInteger $int144$100;
  private static final SubLObject $const145$GuruQAMt;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$DATE;
  private static final SubLObject $const148$EnduringThing_Localized;
  private static final SubLObject $const149$InstanceNamedFn_Ternary;
  private static final SubLObject $const150$State_UnitedStates;
  private static final SubLObject $const151$GeopoliticalEntityNamedFn;
  private static final SubLSymbol $sym152$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw153$OFF;
  private static final SubLSymbol $sym154$SET_LEARNERS;
  private static final SubLSymbol $kw155$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym156$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym157$PATTERN_MATCHES_FORMULA;
  private static final SubLSymbol $sym158$NE_TEST_TIGHTEN_TYPE;
  private static final SubLSymbol $kw159$TEST;
  private static final SubLSymbol $sym160$NE_TEST_FUNC;
  private static final SubLSymbol $kw161$OWNER;
  private static final SubLSymbol $kw162$CLASSES;
  private static final SubLList $list163;
  private static final SubLSymbol $kw164$KB;
  private static final SubLSymbol $kw165$FULL;
  private static final SubLSymbol $kw166$WORKING_;
  private static final SubLList $list167;

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject get_named_entity_confidence(final SubLObject named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( named_entity, FIVE_INTEGER, $sym3$CONFIDENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject set_named_entity_confidence(final SubLObject named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( named_entity, value, FIVE_INTEGER, $sym3$CONFIDENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject get_named_entity_cyc(final SubLObject named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( named_entity, FOUR_INTEGER, $sym4$CYC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject set_named_entity_cyc(final SubLObject named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( named_entity, value, FOUR_INTEGER, $sym4$CYC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject get_named_entity_source(final SubLObject named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( named_entity, THREE_INTEGER, $sym5$SOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject set_named_entity_source(final SubLObject named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( named_entity, value, THREE_INTEGER, $sym5$SOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject get_named_entity_type(final SubLObject named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( named_entity, TWO_INTEGER, $sym6$TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject set_named_entity_type(final SubLObject named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( named_entity, value, TWO_INTEGER, $sym6$TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject get_named_entity_string(final SubLObject named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( named_entity, ONE_INTEGER, $sym7$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject set_named_entity_string(final SubLObject named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( named_entity, value, ONE_INTEGER, $sym7$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject subloop_reserved_initialize_named_entity_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject subloop_reserved_initialize_named_entity_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym7$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym6$TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym5$SOURCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym4$CYC, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym3$CONFIDENCE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
  public static SubLObject named_entity_p(final SubLObject named_entity)
  {
    return classes.subloop_instanceof_class( named_entity, $sym0$NAMED_ENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 1723L)
  public static SubLObject new_named_entity(final SubLObject string, final SubLObject type, SubLObject source, SubLObject confidence, SubLObject cyc)
  {
    if( confidence == UNPROVIDED )
    {
      confidence = NIL;
    }
    if( cyc == UNPROVIDED )
    {
      cyc = NIL;
    }
    final SubLObject ne = object.new_class_instance( $sym0$NAMED_ENTITY );
    instances.set_slot( ne, $sym7$STRING, string );
    instances.set_slot( ne, $sym6$TYPE, type );
    instances.set_slot( ne, $sym5$SOURCE, source );
    instances.set_slot( ne, $sym3$CONFIDENCE, confidence );
    instances.set_slot( ne, $sym4$CYC, cyc );
    return ne;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2218L)
  public static SubLObject named_entity_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_named_entity_method = NIL;
    final SubLObject type = get_named_entity_type( self );
    final SubLObject string = get_named_entity_string( self );
    try
    {
      thread.throwStack.push( $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
      try
      {
        streams_high.write_string( $str18$__NE__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( string, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str19$_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( type, stream );
        streams_high.write_string( $str20$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_named_entity_type( self, type );
          set_named_entity_string( self, string );
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
      catch_var_for_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2515L)
  public static SubLObject named_entity_get_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_named_entity_method = NIL;
    final SubLObject string = get_named_entity_string( self );
    try
    {
      thread.throwStack.push( $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, string );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_named_entity_string( self, string );
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
      catch_var_for_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2647L)
  public static SubLObject named_entity_get_type_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_named_entity_method = NIL;
    final SubLObject type = get_named_entity_type( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, type );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_named_entity_type( self, type );
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
      catch_var_for_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2777L)
  public static SubLObject named_entity_get_cyc_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_named_entity_method = NIL;
    final SubLObject cyc = get_named_entity_cyc( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, cyc );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_named_entity_cyc( self, cyc );
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
      catch_var_for_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2901L)
  public static SubLObject named_entity_get_confidence_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_named_entity_method = NIL;
    final SubLObject confidence = get_named_entity_confidence( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, confidence );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_named_entity_confidence( self, confidence );
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
      catch_var_for_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3041L)
  public static SubLObject named_entity_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_named_entity_method = NIL;
    final SubLObject source = get_named_entity_source( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, source );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_named_entity_source( self, source );
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
      catch_var_for_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject get_contextualized_named_entity_subtypes(final SubLObject contextualized_named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( contextualized_named_entity, NINE_INTEGER, $sym45$SUBTYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject set_contextualized_named_entity_subtypes(final SubLObject contextualized_named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( contextualized_named_entity, value, NINE_INTEGER, $sym45$SUBTYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject get_contextualized_named_entity_offsets(final SubLObject contextualized_named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( contextualized_named_entity, EIGHT_INTEGER, $sym46$OFFSETS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject set_contextualized_named_entity_offsets(final SubLObject contextualized_named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( contextualized_named_entity, value, EIGHT_INTEGER, $sym46$OFFSETS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject get_contextualized_named_entity_context(final SubLObject contextualized_named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( contextualized_named_entity, SEVEN_INTEGER, $sym47$CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject set_contextualized_named_entity_context(final SubLObject contextualized_named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( contextualized_named_entity, value, SEVEN_INTEGER, $sym47$CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject get_contextualized_named_entity_lexicon(final SubLObject contextualized_named_entity)
  {
    return classes.subloop_get_access_protected_instance_slot( contextualized_named_entity, SIX_INTEGER, $sym48$LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject set_contextualized_named_entity_lexicon(final SubLObject contextualized_named_entity, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( contextualized_named_entity, value, SIX_INTEGER, $sym48$LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject subloop_reserved_initialize_contextualized_named_entity_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject subloop_reserved_initialize_contextualized_named_entity_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym7$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym6$TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym5$SOURCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym4$CYC, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$NAMED_ENTITY, $sym3$CONFIDENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym48$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym47$CONTEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym46$OFFSETS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym45$SUBTYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
  public static SubLObject contextualized_named_entity_p(final SubLObject contextualized_named_entity)
  {
    return classes.subloop_instanceof_class( contextualized_named_entity, $sym43$CONTEXTUALIZED_NAMED_ENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3944L)
  public static SubLObject new_contextualized_named_entity(final SubLObject string, final SubLObject type, SubLObject source, final SubLObject v_context, final SubLObject offsets, SubLObject confidence, SubLObject cyc)
  {
    if( confidence == UNPROVIDED )
    {
      confidence = NIL;
    }
    if( cyc == UNPROVIDED )
    {
      cyc = NIL;
    }
    final SubLObject ne = object.new_class_instance( $sym43$CONTEXTUALIZED_NAMED_ENTITY );
    instances.set_slot( ne, $sym7$STRING, string );
    instances.set_slot( ne, $sym6$TYPE, type );
    instances.set_slot( ne, $sym5$SOURCE, source );
    instances.set_slot( ne, $sym47$CONTEXT, v_context );
    instances.set_slot( ne, $sym46$OFFSETS, offsets );
    instances.set_slot( ne, $sym3$CONFIDENCE, confidence );
    instances.set_slot( ne, $sym4$CYC, cyc );
    return ne;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 4584L)
  public static SubLObject contextualized_named_entity_get_lexicon_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_contextualized_named_entity_method = NIL;
    SubLObject lexicon = get_contextualized_named_entity_lexicon( self );
    try
    {
      thread.throwStack.push( $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD );
      try
      {
        if( NIL == lexicon )
        {
          lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
          methods.funcall_instance_method_with_0_args( lexicon, $sym54$IGNORE_CACHE );
        }
        Dynamic.sublisp_throw( $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, lexicon );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_contextualized_named_entity_lexicon( self, lexicon );
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
      catch_var_for_contextualized_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_contextualized_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 4831L)
  public static SubLObject contextualized_named_entity_set_lexicon_method(final SubLObject self, final SubLObject lex)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_contextualized_named_entity_method = NIL;
    SubLObject lexicon = get_contextualized_named_entity_lexicon( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD );
      try
      {
        lexicon = lex;
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, lexicon );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_contextualized_named_entity_lexicon( self, lexicon );
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
      catch_var_for_contextualized_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_contextualized_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 4979L)
  public static SubLObject denot_collections(final SubLObject denots, SubLObject base_collection)
  {
    if( base_collection == UNPROVIDED )
    {
      base_collection = NIL;
    }
    assert NIL != Types.listp( denots ) : denots;
    SubLObject results = NIL;
    SubLObject cdolist_list_var = denots;
    SubLObject denot = NIL;
    denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != fort_types_interface.isa_collectionP( denot, UNPROVIDED ) && NIL == disjoint_with.collections_disjointP( base_collection, denot, UNPROVIDED ) )
      {
        final SubLObject item_var = denot;
        if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          results = ConsesLow.cons( item_var, results );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      denot = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 5388L)
  public static SubLObject contextualized_named_entity_tighten_type_method(final SubLObject self, SubLObject respect_ner_typeP, SubLObject lexical_lookup_onlyP)
  {
    if( respect_ner_typeP == UNPROVIDED )
    {
      respect_ner_typeP = T;
    }
    if( lexical_lookup_onlyP == UNPROVIDED )
    {
      lexical_lookup_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_contextualized_named_entity_method = NIL;
    SubLObject subtypes = get_contextualized_named_entity_subtypes( self );
    final SubLObject v_context = get_contextualized_named_entity_context( self );
    final SubLObject lexicon = get_contextualized_named_entity_lexicon( self );
    final SubLObject cyc = get_named_entity_cyc( self );
    final SubLObject string = get_named_entity_string( self );
    try
    {
      thread.throwStack.push( $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD );
      try
      {
        final SubLObject v_parser = parser.new_stanford_parser( UNPROVIDED, UNPROVIDED );
        final SubLObject question_word = cyc.eql( $const66$Person ) ? $str67$Who : $str68$What;
        final SubLObject question_string = string_utilities.bunge( ConsesLow.list( question_word, $str69$is, Sequences.cconcatenate( string, $str70$_ ) ), UNPROVIDED );
        final SubLObject question_parse = methods.funcall_instance_method_with_1_args( v_parser, $sym71$PARSE, question_string );
        final SubLObject v_question = object.new_class_instance( $sym72$DEFINITIONAL_QUESTION );
        final SubLObject passage = search_engine.new_simple_passage( v_context );
        final SubLObject lexicon_$1 = methods.funcall_instance_method_with_0_args( self, $sym51$GET_LEXICON );
        SubLObject answers = NIL;
        SubLObject tighter_types = NIL;
        SubLObject answer_strings = NIL;
        final SubLObject entity_string = methods.funcall_instance_method_with_0_args( self, $sym22$GET_STRING );
        question.set_question_string( v_question, question_string );
        if( NIL != question_parse )
        {
          methods.funcall_instance_method_with_1_args( question_parse, $sym73$LEXIFY, lexicon_$1 );
        }
        question.set_question_parse( v_question, question_parse );
        answers = methods.funcall_instance_method_with_1_args( v_question, $sym74$EXTRACT, passage );
        if( !cyc.eql( $const75$Organization ) )
        {
          answers = ConsesLow.cons( answer.new_text_answer( v_question, entity_string, search_engine.new_simple_passage( entity_string ), ONE_INTEGER, UNPROVIDED ), answers );
        }
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject answer_string = methods.funcall_instance_method_with_0_args( v_answer, $sym76$GET_CONTENT );
              if( NIL != string_utilities.substringP( answer_string, entity_string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || ( NIL == string_utilities.ends_with_start_of( entity_string, answer_string, EQUAL, $list77 )
                  && NIL == string_utilities.ends_with_start_of( answer_string, entity_string, EQUAL, $list77 ) ) )
              {
                thread.resetMultipleValues();
                final SubLObject new_tighter_types = tighter_types_from_answer( v_answer, lexicon_$1, entity_string, ( NIL != respect_ner_typeP ) ? cyc : NIL, lexical_lookup_onlyP );
                final SubLObject answer_string_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                answer_strings = ConsesLow.cons( answer_string_$2, answer_strings );
                tighter_types = conses_high.union( tighter_types, new_tighter_types, UNPROVIDED, UNPROVIDED );
              }
              cdolist_list_var = cdolist_list_var.rest();
              v_answer = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
        }
        subtypes = tighter_types;
        Dynamic.sublisp_throw( $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, ConsesLow.list( tighter_types, answer_strings ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_contextualized_named_entity_subtypes( self, subtypes );
          set_contextualized_named_entity_context( self, v_context );
          set_contextualized_named_entity_lexicon( self, lexicon );
          set_named_entity_cyc( self, cyc );
          set_named_entity_string( self, string );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_contextualized_named_entity_method = Errors.handleThrowable( ccatch_env_var, $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_contextualized_named_entity_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 7327L)
  public static SubLObject tighter_types_from_answer(final SubLObject v_answer, final SubLObject lexicon, final SubLObject entity_string, final SubLObject cyc_type, SubLObject lexical_lookup_onlyP)
  {
    if( lexical_lookup_onlyP == UNPROVIDED )
    {
      lexical_lookup_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tighter_types = NIL;
    final SubLObject trees = get_trees_to_head( methods.funcall_instance_method_with_0_args( v_answer, $sym79$GET_PARSE_TREE ) );
    SubLObject type_string = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    try
    {
      parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
      parsing_vars.$psp_return_mode$.bind( $kw80$BEST_ONLY, thread );
      if( NIL == trees )
      {
        type_string = lexicon_utilities.strip_determiner( methods.funcall_instance_method_with_0_args( v_answer, $sym76$GET_CONTENT ), UNPROVIDED );
        tighter_types = tighter_types_from_string( type_string, lexicon, entity_string, cyc_type, lexical_lookup_onlyP );
      }
      else if( NIL == tighter_types )
      {
        SubLObject csome_list_var = trees;
        SubLObject tree = NIL;
        tree = csome_list_var.first();
        while ( NIL == tighter_types && NIL != csome_list_var)
        {
          final SubLObject answer_string = methods.funcall_instance_method_with_0_args( tree, $sym22$GET_STRING );
          type_string = lexicon_utilities.strip_determiner( answer_string, UNPROVIDED );
          tighter_types = tighter_types_from_string( type_string, lexicon, entity_string, cyc_type, lexical_lookup_onlyP );
          csome_list_var = csome_list_var.rest();
          tree = csome_list_var.first();
        }
      }
    }
    finally
    {
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_2, thread );
      parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( tighter_types, type_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 8628L)
  public static SubLObject tighter_types_from_string(final SubLObject type_string, final SubLObject lexicon, final SubLObject entity_string, final SubLObject cyc_type, final SubLObject lexical_lookup_onlyP)
  {
    SubLObject tighter_types = NIL;
    if( NIL == string_acceptably_short_for_ps_parseP( type_string, lexicon, UNPROVIDED ) || NIL != lexical_lookup_onlyP )
    {
      final SubLObject doc = document_annotation_widgets.new_tagged_document( type_string, lexicon, T, UNPROVIDED, UNPROVIDED );
      final SubLObject types = Sequences.remove_duplicates( concepts_from_document( doc ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      tighter_types = denot_collections( types, cyc_type );
    }
    else
    {
      final SubLObject v_psp_lexicon = psp_lexicon.new_psp_lexicon_from_term_lexicon( lexicon );
      tighter_types = denot_collections( denots_of_ps_harvest_nbars( type_string, NIL, entity_string, v_psp_lexicon ), cyc_type );
    }
    return tighter_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 9308L)
  public static SubLObject concepts_from_document(final SubLObject doc)
  {
    SubLObject result = NIL;
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$4;
    SubLObject backwardP_var_$5;
    SubLObject length_$6;
    SubLObject v_iteration_$7;
    SubLObject element_num_$8;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cdolist_list_var_$9;
    SubLObject cycl;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$4 = document.paragraph_sentences( paragraph );
      backwardP_var_$5 = NIL;
      for( length_$6 = Sequences.length( vector_var_$4 ), v_iteration_$7 = NIL, v_iteration_$7 = ZERO_INTEGER; v_iteration_$7.numL( length_$6 ); v_iteration_$7 = Numbers.add( v_iteration_$7, ONE_INTEGER ) )
      {
        element_num_$8 = ( ( NIL != backwardP_var_$5 ) ? Numbers.subtract( length_$6, v_iteration_$7, ONE_INTEGER ) : v_iteration_$7 );
        sentence = Vectors.aref( vector_var_$4, element_num_$8 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cdolist_list_var_$9 = document.word_cycls( word );
          cycl = NIL;
          cycl = cdolist_list_var_$9.first();
          while ( NIL != cdolist_list_var_$9)
          {
            result = ConsesLow.cons( cycl, result );
            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
            cycl = cdolist_list_var_$9.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 9489L)
  public static SubLObject get_trees_to_head(final SubLObject tree)
  {
    SubLObject nominals = ( NIL != tree ) ? ConsesLow.list( tree ) : NIL;
    SubLObject current_descendent;
    for( SubLObject descendents = ( NIL != parse_tree.phrase_tree_p( tree ) ) ? methods.funcall_instance_method_with_0_args( tree, $sym81$GET_HEAD_DAUGHTERS ) : NIL; NIL != descendents; descendents = Sequences
        .cconcatenate( descendents, methods.funcall_instance_method_with_0_args( current_descendent, $sym81$GET_HEAD_DAUGHTERS ) ) )
    {
      current_descendent = descendents.first();
      nominals = ConsesLow.cons( current_descendent, nominals );
      descendents = descendents.rest();
      if( NIL != parse_tree.phrase_tree_p( current_descendent ) )
      {
      }
    }
    return Sequences.nreverse( nominals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 10082L)
  public static SubLObject string_acceptably_short_for_ps_parseP(final SubLObject string, final SubLObject lexicon, SubLObject max_words)
  {
    if( max_words == UNPROVIDED )
    {
      max_words = FOUR_INTEGER;
    }
    final SubLObject sent = document.new_sentence( string, UNPROVIDED );
    final SubLObject lexified = methods.funcall_instance_method_with_1_args( lexicon, $sym82$LEXIFY_SENTENCE, sent );
    return Numbers.numLE( document.sentence_length( lexified ), max_words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 10327L)
  public static SubLObject denots_of_ps_harvest_nbars_internal(final SubLObject string, SubLObject non_trivialP, SubLObject forbidden_string, SubLObject lexicon)
  {
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = T;
    }
    if( forbidden_string == UNPROVIDED )
    {
      forbidden_string = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject base_result = NIL;
    final SubLObject v_psp_chart = psp_syntax.psp_chart_for_string( string, lexicon, UNPROVIDED, UNPROVIDED );
    SubLObject result_cycls = NIL;
    final SubLObject chart = v_psp_chart;
    final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject _prev_bind_0_$10 = parsing_vars.$psp_chart$.currentBinding( thread );
        try
        {
          parsing_vars.$psp_chart$.bind( chart, thread );
          base_result = psp_main.ps_harvest_nbars( string, non_trivialP, UNPROVIDED );
          final SubLObject max_length = Sequences.length( get_max_span_from_psp_result( base_result, ( NIL != string_utilities.substringP( string, forbidden_string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              ? forbidden_string
              : NIL ) );
          SubLObject cdolist_list_var = base_result;
          SubLObject span_and_answers = NIL;
          span_and_answers = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = span_and_answers;
            SubLObject span = NIL;
            SubLObject cycls = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
            cycls = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( Sequences.length( span ).numE( max_length ) )
              {
                result_cycls = Sequences.cconcatenate( result_cycls, cycls );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            span_and_answers = cdolist_list_var.first();
          }
        }
        finally
        {
          parsing_vars.$psp_chart$.rebind( _prev_bind_0_$10, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove_duplicates( result_cycls, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 10327L)
  public static SubLObject denots_of_ps_harvest_nbars(final SubLObject string, SubLObject non_trivialP, SubLObject forbidden_string, SubLObject lexicon)
  {
    if( non_trivialP == UNPROVIDED )
    {
      non_trivialP = T;
    }
    if( forbidden_string == UNPROVIDED )
    {
      forbidden_string = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return denots_of_ps_harvest_nbars_internal( string, non_trivialP, forbidden_string, lexicon );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym83$DENOTS_OF_PS_HARVEST_NBARS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym83$DENOTS_OF_PS_HARVEST_NBARS, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym83$DENOTS_OF_PS_HARVEST_NBARS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( string, non_trivialP, forbidden_string, lexicon );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( non_trivialP.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( forbidden_string.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && lexicon.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( denots_of_ps_harvest_nbars_internal( string, non_trivialP, forbidden_string, lexicon ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, non_trivialP, forbidden_string, lexicon ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 11240L)
  public static SubLObject get_max_span_from_psp_result(final SubLObject psp_result, final SubLObject forbidden_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject forbidden_span = NIL;
    if( NIL == psp_result )
    {
      return NIL;
    }
    if( NIL != forbidden_string )
    {
      final SubLObject chart_$12;
      final SubLObject chart = chart_$12 = psp_syntax.psp_chart_for_string( forbidden_string, psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED ), $kw85$NONE, NIL );
      final SubLObject local_state = psp_chart.psp_chart_memoization_state( chart_$12 );
      final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$13 = parsing_vars.$psp_chart$.currentBinding( thread );
          try
          {
            parsing_vars.$psp_chart$.bind( chart_$12, thread );
            forbidden_span = psp_main.psp_token_list_from_span( psp_chart.psp_chart_max_span() );
          }
          finally
          {
            parsing_vars.$psp_chart$.rebind( _prev_bind_0_$13, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject first_span = psp_result.first().first();
    if( !forbidden_span.equal( first_span ) )
    {
      return first_span;
    }
    return conses_high.second( psp_result ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
  public static SubLObject clear_named_entityP()
  {
    final SubLObject cs = $named_entityP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
  public static SubLObject remove_named_entityP(final SubLObject sent, final SubLObject ans)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $named_entityP_caching_state$.getGlobalValue(), ConsesLow.list( sent, ans ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
  public static SubLObject named_entityP_internal(final SubLObject sent, final SubLObject ans)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( sent ) : sent;
    assert NIL != Types.stringp( ans ) : ans;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym88$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL == string_utilities.empty_string_p( sent ) && NIL == string_utilities.empty_string_p( ans ) )
          {
            final SubLObject ner = object.new_class_instance( $sym89$STANFORD_NER );
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( ner, $sym92$RUN, sent );
            SubLObject named_entity_disjunction = NIL;
            named_entity_disjunction = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject cdolist_list_var_$15 = named_entity_disjunction;
              SubLObject named_entity = NIL;
              named_entity = cdolist_list_var_$15.first();
              while ( NIL != cdolist_list_var_$15)
              {
                if( !$sym90$O.eql( methods.funcall_instance_method_with_0_args( named_entity, $sym27$GET_TYPE ) ) && NIL != Strings.stringE( methods.funcall_instance_method_with_0_args( named_entity, $sym22$GET_STRING ),
                    ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  return methods.funcall_instance_method_with_0_args( named_entity, $sym31$GET_CYC );
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                named_entity = cdolist_list_var_$15.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              named_entity_disjunction = cdolist_list_var.first();
            }
          }
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
    if( NIL != error && NIL != $break_named_entityP$.getDynamicValue( thread ) )
    {
      Errors.sublisp_break( $str93$Error___S_occured_in_NAMED_ENTITY, new SubLObject[] { error
      } );
    }
    return Values.values( NIL, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
  public static SubLObject named_entityP(final SubLObject sent, final SubLObject ans)
  {
    SubLObject caching_state = $named_entityP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym86$NAMED_ENTITY_, $sym94$_NAMED_ENTITY__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sent, ans );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( sent.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ans.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( named_entityP_internal( sent, ans ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sent, ans ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13560L)
  public static SubLObject named_entity_recognizer_p(final SubLObject v_named_entity_recognizer)
  {
    return interfaces.subloop_instanceof_interface( v_named_entity_recognizer, $sym95$NAMED_ENTITY_RECOGNIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject get_stanford_ner_known_cyc_types(final SubLObject stanford_ner)
  {
    final SubLObject v_class = stanford_ner.isSymbol() ? classes.classes_retrieve_class( stanford_ner )
        : ( ( NIL != subloop_structures.class_p( stanford_ner ) ) ? stanford_ner : ( ( NIL != subloop_structures.instance_p( stanford_ner ) ) ? subloop_structures.instance_class( stanford_ner ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym99$KNOWN_CYC_TYPES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject set_stanford_ner_known_cyc_types(final SubLObject stanford_ner, final SubLObject value)
  {
    final SubLObject v_class = stanford_ner.isSymbol() ? classes.classes_retrieve_class( stanford_ner )
        : ( ( NIL != subloop_structures.class_p( stanford_ner ) ) ? stanford_ner : ( ( NIL != subloop_structures.instance_p( stanford_ner ) ) ? subloop_structures.instance_class( stanford_ner ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym99$KNOWN_CYC_TYPES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject get_stanford_ner_type_map(final SubLObject stanford_ner)
  {
    final SubLObject v_class = stanford_ner.isSymbol() ? classes.classes_retrieve_class( stanford_ner )
        : ( ( NIL != subloop_structures.class_p( stanford_ner ) ) ? stanford_ner : ( ( NIL != subloop_structures.instance_p( stanford_ner ) ) ? subloop_structures.instance_class( stanford_ner ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym100$TYPE_MAP, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject set_stanford_ner_type_map(final SubLObject stanford_ner, final SubLObject value)
  {
    final SubLObject v_class = stanford_ner.isSymbol() ? classes.classes_retrieve_class( stanford_ner )
        : ( ( NIL != subloop_structures.class_p( stanford_ner ) ) ? stanford_ner : ( ( NIL != subloop_structures.instance_p( stanford_ner ) ) ? subloop_structures.instance_class( stanford_ner ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym100$TYPE_MAP, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject subloop_reserved_initialize_stanford_ner_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym89$STANFORD_NER, $sym100$TYPE_MAP, $list101 );
    classes.subloop_initialize_slot( new_instance, $sym89$STANFORD_NER, $sym99$KNOWN_CYC_TYPES, $list102 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject subloop_reserved_initialize_stanford_ner_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
  public static SubLObject stanford_ner_p(final SubLObject stanford_ner)
  {
    return classes.subloop_instanceof_class( stanford_ner, $sym89$STANFORD_NER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 14258L)
  public static SubLObject stanford_ner_to_cyc_method(final SubLObject self, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_stanford_ner_method = NIL;
    final SubLObject type_map = get_stanford_ner_type_map( self );
    try
    {
      thread.throwStack.push( $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD, conses_high.assoc( type, type_map, UNPROVIDED, UNPROVIDED ).rest() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_stanford_ner_type_map( self, type_map );
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
      catch_var_for_stanford_ner_method = Errors.handleThrowable( ccatch_env_var, $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_stanford_ner_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 14354L)
  public static SubLObject stanford_ner_run_method(final SubLObject self, final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    final SubLObject stanford_tokens = stanford_ner( text, UNPROVIDED, UNPROVIDED );
    SubLObject latest_string = stanford_tokens.first();
    SubLObject latest_type = Packages.intern( conses_high.second( stanford_tokens ), UNPROVIDED );
    SubLObject entities = NIL;
    SubLObject tokens = NIL;
    SubLObject string = NIL;
    SubLObject type = NIL;
    tokens = conses_high.cddr( stanford_tokens );
    string = tokens.first();
    type = Packages.intern( conses_high.second( tokens ), UNPROVIDED );
    while ( NIL != tokens)
    {
      if( type.eql( latest_type ) && !$sym90$O.eql( type ) )
      {
        latest_string = build_mwl( latest_string, string );
      }
      else
      {
        entities = ConsesLow.cons( ConsesLow.list( new_contextualized_named_entity( latest_string, latest_type, self, text, NIL, NIL, methods.funcall_instance_method_with_1_args( self, $sym105$TO_CYC, latest_type ) ) ),
            entities );
        latest_string = string;
        latest_type = type;
      }
      tokens = conses_high.cddr( tokens );
      string = tokens.first();
      type = Packages.intern( conses_high.second( tokens ), UNPROVIDED );
    }
    entities = ConsesLow.cons( ConsesLow.list( new_contextualized_named_entity( latest_string, latest_type, self, text, NIL, NIL, methods.funcall_instance_method_with_1_args( self, $sym105$TO_CYC, latest_type ) ) ),
        entities );
    return Sequences.nreverse( entities );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 15787L)
  public static SubLObject build_mwl(final SubLObject s1, final SubLObject s3)
  {
    return Sequences.cconcatenate( s1, new SubLObject[] { ( NIL != string_utilities.punctuation_string_p( s3 ) ) ? $str113$ : $str114$_, s3
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 15946L)
  public static SubLObject stanford_ner_merge_clusters_method(final SubLObject self, final SubLObject clusters, final SubLObject lexicon)
  {
    SubLObject new_clusters = NIL;
    SubLObject prev_ne = NIL;
    SubLObject ante_prev_ne = NIL;
    SubLObject list_var = NIL;
    SubLObject cluster = NIL;
    SubLObject cluster_num = NIL;
    list_var = clusters;
    cluster = list_var.first();
    for( cluster_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), cluster = list_var.first(), cluster_num = Numbers.add( ONE_INTEGER, cluster_num ) )
    {
      final SubLObject ne = cluster.first();
      if( NIL != prev_ne && NIL != ante_prev_ne && methods.funcall_instance_method_with_0_args( ne, $sym31$GET_CYC ).equal( $const118$Place ) && $str119$_.equal( methods.funcall_instance_method_with_0_args( prev_ne,
          $sym22$GET_STRING ) ) && methods.funcall_instance_method_with_0_args( ante_prev_ne, $sym31$GET_CYC ).equal( $const118$Place ) && NIL != ne_has_state_denotP( lexicon, ne ) && NIL == ne_has_state_denotP( lexicon,
              ante_prev_ne ) )
      {
        final SubLObject new_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( methods.funcall_instance_method_with_0_args( ante_prev_ne, $sym22$GET_STRING ) ), new SubLObject[] { $str120$__, format_nil
            .format_nil_a_no_copy( methods.funcall_instance_method_with_0_args( ne, $sym22$GET_STRING ) )
        } );
        final SubLObject type = $sym121$LOCATION;
        final SubLObject text = instances.get_slot( ne, $sym47$CONTEXT );
        prev_ne = new_contextualized_named_entity( new_string, type, self, text, NIL, NIL, methods.funcall_instance_method_with_1_args( self, $sym105$TO_CYC, type ) );
        ante_prev_ne = conses_high.caar( new_clusters );
        new_clusters = new_clusters.rest();
      }
      else
      {
        if( NIL != ante_prev_ne )
        {
          new_clusters = ConsesLow.cons( ConsesLow.list( ante_prev_ne ), new_clusters );
        }
        ante_prev_ne = prev_ne;
        prev_ne = ne;
      }
    }
    if( NIL != ante_prev_ne )
    {
      new_clusters = ConsesLow.cons( ConsesLow.list( ante_prev_ne ), new_clusters );
    }
    if( NIL != prev_ne )
    {
      new_clusters = ConsesLow.cons( ConsesLow.list( prev_ne ), new_clusters );
    }
    return Sequences.nreverse( new_clusters );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 17461L)
  public static SubLObject ne_has_state_denotP(final SubLObject lexicon, final SubLObject ne)
  {
    final SubLObject string = methods.funcall_instance_method_with_0_args( ne, $sym22$GET_STRING );
    SubLObject cdolist_list_var;
    final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args( lexicon, $sym123$GET, string );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isaP( methods.funcall_instance_method_with_1_args( entry, $sym123$GET, $kw124$DENOT ), $const125$State_US, $const126$InferencePSC, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 18069L)
  public static SubLObject stanford_ner_ping(SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $stanford_ner_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $stanford_ner_port$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym88$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          stanford_ner( $str131$The_cat_sat_on_the_mat_, host, port );
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
    return makeBoolean( NIL == error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 18415L)
  public static SubLObject stanford_ner(final SubLObject string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $stanford_ner_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $stanford_ner_port$.getDynamicValue();
    }
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = subl_promotions.open_tcp_stream_with_timeout( host, port, NIL, $kw132$PUBLIC );
      if( NIL != subl_macro_promotions.validate_tcp_connection( stream, host, port ) )
      {
        print_high.princ( string, stream );
        streams_high.terpri( stream );
        streams_high.finish_output( stream );
        result = string_utilities.split_string( string_utilities.trim_whitespace( streams_high.read_line( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), $list133 );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != stream )
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19295L)
  public static SubLObject subloop_reserved_initialize_resporator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19295L)
  public static SubLObject subloop_reserved_initialize_resporator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19295L)
  public static SubLObject resporator_p(final SubLObject resporator)
  {
    return classes.subloop_instanceof_class( resporator, $sym134$RESPORATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19478L)
  public static SubLObject resporator_run_method(final SubLObject self, final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    SubLObject entities = NIL;
    SubLObject tokens = NIL;
    SubLObject entity = NIL;
    SubLObject card = NIL;
    tokens = external_interfaces.resporator( text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    entity = methods.funcall_instance_method_with_1_args( self, $sym138$NEXT_RESPORATOR_ENTITY, tokens );
    card = Sequences.length( entity );
    while ( NIL != entity)
    {
      entities = ConsesLow.cons( entity, entities );
      tokens = conses_high.nthcdr( card, tokens );
      entity = methods.funcall_instance_method_with_1_args( self, $sym138$NEXT_RESPORATOR_ENTITY, tokens );
      card = Sequences.length( entity );
    }
    return Sequences.nreverse( entities );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19915L)
  public static SubLObject resporator_next_resporator_entity_method(final SubLObject self, final SubLObject tokens)
  {
    if( NIL == tokens )
    {
      return NIL;
    }
    final SubLObject first = tokens.first();
    SubLObject disjunction = ConsesLow.list( new_named_entity( first.rest(), first.first(), self, NIL, resporator_to_cycl( first.first() ) ) );
    final SubLObject type = first.first();
    final SubLObject string = first.rest();
    SubLObject types_so_far = ConsesLow.list( type );
    SubLObject cdolist_list_var = tokens.rest();
    SubLObject typeXstring = NIL;
    typeXstring = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !typeXstring.rest().equal( string ) || NIL != conses_high.member( typeXstring.first(), types_so_far, UNPROVIDED, UNPROVIDED ) )
      {
        return disjunction;
      }
      disjunction = ConsesLow.cons( new_named_entity( typeXstring.rest(), typeXstring.first(), self, NIL, resporator_to_cycl( typeXstring.first() ) ), disjunction );
      types_so_far = ConsesLow.cons( typeXstring.first(), types_so_far );
      cdolist_list_var = cdolist_list_var.rest();
      typeXstring = cdolist_list_var.first();
    }
    return disjunction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 20851L)
  public static SubLObject build_resporator_to_cycl_map()
  {
    final SubLObject map = Hashtables.make_hash_table( $int144$100, Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = $list146;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$16 = kb_mapping.gather_predicate_extent_index( predicate, $const145$GuruQAMt, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var_$16.first();
      while ( NIL != cdolist_list_var_$16)
      {
        Hashtables.sethash( Packages.intern( string_utilities.strip_final( assertions_high.gaf_arg1( assertion ), UNPROVIDED ), UNPROVIDED ), map, assertions_high.gaf_arg2( assertion ) );
        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
        assertion = cdolist_list_var_$16.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21269L)
  public static SubLObject maybe_initialize_resporator_to_cycl_map()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $resporator_to_cycl_map$.getDynamicValue( thread ) )
    {
      $resporator_to_cycl_map$.setDynamicValue( build_resporator_to_cycl_map(), thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21446L)
  public static SubLObject resporator_to_cycl(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( type, $resporator_to_cycl_map$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21537L)
  public static SubLObject get_nament_instance_meaning(final SubLObject nament)
  {
    if( $sym147$DATE.eql( methods.funcall_instance_method_with_0_args( nament, $sym27$GET_TYPE ) ) )
    {
      return date_utilities.parse_date_from_string_fast( methods.funcall_instance_method_with_0_args( nament, $sym22$GET_STRING ), T, UNPROVIDED, UNPROVIDED );
    }
    if( $sym121$LOCATION.eql( methods.funcall_instance_method_with_0_args( nament, $sym27$GET_TYPE ) ) )
    {
      return get_specific_place_from_string( methods.funcall_instance_method_with_0_args( nament, $sym22$GET_STRING ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21893L)
  public static SubLObject get_specific_place_from_string(final SubLObject string)
  {
    SubLObject more_specific_places = NIL;
    final SubLObject lexicon = get_place_tightening_lexicon();
    final SubLObject entity_doc = document_annotation_widgets.new_tagged_document( string, lexicon, NIL, UNPROVIDED, UNPROVIDED );
    final SubLObject downcased_entity_doc = document_annotation_widgets.new_tagged_document( Strings.string_downcase( string, UNPROVIDED, UNPROVIDED ), lexicon, NIL, UNPROVIDED, UNPROVIDED );
    final SubLObject last_word_index = Numbers.subtract( document.document_word_length( entity_doc ), ONE_INTEGER );
    final SubLObject head_word = document.document_get_word( entity_doc, last_word_index );
    final SubLObject downcased_head_word = document.document_get_word( downcased_entity_doc, last_word_index );
    SubLObject cdolist_list_var;
    final SubLObject head_word_cycls = cdolist_list_var = Sequences.cconcatenate( document.word_cycls( downcased_head_word ), document.word_cycls( head_word ) );
    SubLObject head_word_cycl = NIL;
    head_word_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != genls.genlsP( head_word_cycl, $const148$EnduringThing_Localized, UNPROVIDED, UNPROVIDED ) )
      {
        more_specific_places = ConsesLow.cons( ConsesLow.list( $const149$InstanceNamedFn_Ternary, string, head_word_cycl, Guids.guid_to_string( Guids.new_guid() ) ), more_specific_places );
      }
      if( NIL != isa.isaP( head_word_cycl, $const150$State_UnitedStates, $const126$InferencePSC, UNPROVIDED ) && TWO_INTEGER.numGE( last_word_index ) && $str119$_.equal( document.word_string( document.document_get_word(
          entity_doc, Numbers.subtract( last_word_index, ONE_INTEGER ) ) ) ) )
      {
        final SubLObject place_name_string = document.sentence_reconstruct_substring( ZERO_INTEGER, Numbers.subtract( last_word_index, ONE_INTEGER ), document.word_mother( head_word ) );
        more_specific_places = ConsesLow.cons( ConsesLow.list( $const151$GeopoliticalEntityNamedFn, place_name_string, head_word_cycl ), more_specific_places );
      }
      cdolist_list_var = cdolist_list_var.rest();
      head_word_cycl = cdolist_list_var.first();
    }
    return more_specific_places;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 23725L)
  public static SubLObject clear_place_tightening_lexicon()
  {
    $place_tightening_lexicon$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 23830L)
  public static SubLObject get_place_tightening_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == term_lexicon.term_lexicon_p( $place_tightening_lexicon$.getDynamicValue( thread ) ) )
    {
      $place_tightening_lexicon$.setDynamicValue( concept_tagger.make_default_concept_tagger_lexicon(), thread );
      methods.funcall_instance_method_with_1_args( $place_tightening_lexicon$.getDynamicValue( thread ), $sym152$SET_CASE_SENSITIVITY, $kw153$OFF );
      methods.funcall_instance_method_with_1_args( $place_tightening_lexicon$.getDynamicValue( thread ), $sym154$SET_LEARNERS, NIL );
      methods.funcall_instance_method_with_0_args( $place_tightening_lexicon$.getDynamicValue( thread ), $sym54$IGNORE_CACHE );
    }
    return $place_tightening_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
  public static SubLObject ne_test_tighten_type(final SubLObject passage_string, final SubLObject term_string, final SubLObject base_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_types = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw155$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym156$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject start_pos = Sequences.search( term_string, passage_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject ne = new_contextualized_named_entity( term_string, base_type, NIL, passage_string, ConsesLow.list( start_pos ), UNPROVIDED, UNPROVIDED );
          result_types = methods.funcall_instance_method_with_0_args( ne, $sym62$TIGHTEN_TYPE ).first();
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw155$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return result_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
  public static SubLObject ne_test_tighten_type_undesired_return(final SubLObject passage_string, final SubLObject term_string, final SubLObject base_type)
  {
    return ne_test_tighten_type( passage_string, term_string, base_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
  public static SubLObject ne_test_func(final SubLObject thing1, final SubLObject thing2)
  {
    return conses_high.member( narts_high.nart_substitute( czer_main.canonicalize_term( thing2, UNPROVIDED ) ), czer_main.canonicalize_term( thing1, UNPROVIDED ), $sym157$PATTERN_MATCHES_FORMULA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
  public static SubLObject ne_test_func_not_member(final SubLObject thing1, final SubLObject thing2)
  {
    return makeBoolean( NIL == subl_promotions.memberP( narts_high.nart_substitute( czer_main.canonicalize_term( thing2, UNPROVIDED ) ), czer_main.canonicalize_term( thing1, UNPROVIDED ), EQUAL, UNPROVIDED ) );
  }

  public static SubLObject declare_named_entity_recognizer_file()
  {
    SubLFiles.declareFunction( me, "get_named_entity_confidence", "GET-NAMED-ENTITY-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_named_entity_confidence", "SET-NAMED-ENTITY-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_named_entity_cyc", "GET-NAMED-ENTITY-CYC", 1, 0, false );
    SubLFiles.declareFunction( me, "set_named_entity_cyc", "SET-NAMED-ENTITY-CYC", 2, 0, false );
    SubLFiles.declareFunction( me, "get_named_entity_source", "GET-NAMED-ENTITY-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_named_entity_source", "SET-NAMED-ENTITY-SOURCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_named_entity_type", "GET-NAMED-ENTITY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_named_entity_type", "SET-NAMED-ENTITY-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_named_entity_string", "GET-NAMED-ENTITY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_named_entity_string", "SET-NAMED-ENTITY-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_named_entity_class", "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_named_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "named_entity_p", "NAMED-ENTITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_named_entity", "NEW-NAMED-ENTITY", 3, 2, false );
    SubLFiles.declareFunction( me, "named_entity_print_method", "NAMED-ENTITY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "named_entity_get_string_method", "NAMED-ENTITY-GET-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "named_entity_get_type_method", "NAMED-ENTITY-GET-TYPE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "named_entity_get_cyc_method", "NAMED-ENTITY-GET-CYC-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "named_entity_get_confidence_method", "NAMED-ENTITY-GET-CONFIDENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "named_entity_get_source_method", "NAMED-ENTITY-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_contextualized_named_entity_subtypes", "GET-CONTEXTUALIZED-NAMED-ENTITY-SUBTYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contextualized_named_entity_subtypes", "SET-CONTEXTUALIZED-NAMED-ENTITY-SUBTYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_contextualized_named_entity_offsets", "GET-CONTEXTUALIZED-NAMED-ENTITY-OFFSETS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contextualized_named_entity_offsets", "SET-CONTEXTUALIZED-NAMED-ENTITY-OFFSETS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_contextualized_named_entity_context", "GET-CONTEXTUALIZED-NAMED-ENTITY-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contextualized_named_entity_context", "SET-CONTEXTUALIZED-NAMED-ENTITY-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_contextualized_named_entity_lexicon", "GET-CONTEXTUALIZED-NAMED-ENTITY-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contextualized_named_entity_lexicon", "SET-CONTEXTUALIZED-NAMED-ENTITY-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_contextualized_named_entity_class", "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_contextualized_named_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "contextualized_named_entity_p", "CONTEXTUALIZED-NAMED-ENTITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_contextualized_named_entity", "NEW-CONTEXTUALIZED-NAMED-ENTITY", 5, 2, false );
    SubLFiles.declareFunction( me, "contextualized_named_entity_get_lexicon_method", "CONTEXTUALIZED-NAMED-ENTITY-GET-LEXICON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "contextualized_named_entity_set_lexicon_method", "CONTEXTUALIZED-NAMED-ENTITY-SET-LEXICON-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "denot_collections", "DENOT-COLLECTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "contextualized_named_entity_tighten_type_method", "CONTEXTUALIZED-NAMED-ENTITY-TIGHTEN-TYPE-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "tighter_types_from_answer", "TIGHTER-TYPES-FROM-ANSWER", 4, 1, false );
    SubLFiles.declareFunction( me, "tighter_types_from_string", "TIGHTER-TYPES-FROM-STRING", 5, 0, false );
    SubLFiles.declareFunction( me, "concepts_from_document", "CONCEPTS-FROM-DOCUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_trees_to_head", "GET-TREES-TO-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "string_acceptably_short_for_ps_parseP", "STRING-ACCEPTABLY-SHORT-FOR-PS-PARSE?", 2, 1, false );
    SubLFiles.declareFunction( me, "denots_of_ps_harvest_nbars_internal", "DENOTS-OF-PS-HARVEST-NBARS-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "denots_of_ps_harvest_nbars", "DENOTS-OF-PS-HARVEST-NBARS", 1, 3, false );
    SubLFiles.declareFunction( me, "get_max_span_from_psp_result", "GET-MAX-SPAN-FROM-PSP-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_named_entityP", "CLEAR-NAMED-ENTITY?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_named_entityP", "REMOVE-NAMED-ENTITY?", 2, 0, false );
    SubLFiles.declareFunction( me, "named_entityP_internal", "NAMED-ENTITY?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "named_entityP", "NAMED-ENTITY?", 2, 0, false );
    SubLFiles.declareFunction( me, "named_entity_recognizer_p", "NAMED-ENTITY-RECOGNIZER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_stanford_ner_known_cyc_types", "GET-STANFORD-NER-KNOWN-CYC-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_stanford_ner_known_cyc_types", "SET-STANFORD-NER-KNOWN-CYC-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_stanford_ner_type_map", "GET-STANFORD-NER-TYPE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "set_stanford_ner_type_map", "SET-STANFORD-NER-TYPE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_stanford_ner_class", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_stanford_ner_instance", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "stanford_ner_p", "STANFORD-NER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "stanford_ner_to_cyc_method", "STANFORD-NER-TO-CYC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "stanford_ner_run_method", "STANFORD-NER-RUN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "build_mwl", "BUILD-MWL", 2, 0, false );
    SubLFiles.declareFunction( me, "stanford_ner_merge_clusters_method", "STANFORD-NER-MERGE-CLUSTERS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "ne_has_state_denotP", "NE-HAS-STATE-DENOT?", 2, 0, false );
    SubLFiles.declareFunction( me, "stanford_ner_ping", "STANFORD-NER-PING", 0, 2, false );
    SubLFiles.declareFunction( me, "stanford_ner", "STANFORD-NER", 1, 2, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_resporator_class", "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_resporator_instance", "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "resporator_p", "RESPORATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "resporator_run_method", "RESPORATOR-RUN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "resporator_next_resporator_entity_method", "RESPORATOR-NEXT-RESPORATOR-ENTITY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "build_resporator_to_cycl_map", "BUILD-RESPORATOR-TO-CYCL-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_resporator_to_cycl_map", "MAYBE-INITIALIZE-RESPORATOR-TO-CYCL-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "resporator_to_cycl", "RESPORATOR-TO-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_nament_instance_meaning", "GET-NAMENT-INSTANCE-MEANING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_specific_place_from_string", "GET-SPECIFIC-PLACE-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_place_tightening_lexicon", "CLEAR-PLACE-TIGHTENING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_place_tightening_lexicon", "GET-PLACE-TIGHTENING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "ne_test_tighten_type", "NE-TEST-TIGHTEN-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "ne_test_tighten_type_undesired_return", "NE-TEST-TIGHTEN-TYPE-UNDESIRED-RETURN", 3, 0, false );
    SubLFiles.declareFunction( me, "ne_test_func", "NE-TEST-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "ne_test_func_not_member", "NE-TEST-FUNC-NOT-MEMBER", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_named_entity_recognizer_file()
  {
    $break_named_entityP$ = SubLFiles.defparameter( "*BREAK-NAMED-ENTITY?*", NIL );
    $named_entityP_caching_state$ = SubLFiles.deflexical( "*NAMED-ENTITY?-CACHING-STATE*", NIL );
    $stanford_ner_host$ = SubLFiles.defparameter( "*STANFORD-NER-HOST*", $str128$localhost );
    $stanford_ner_port$ = SubLFiles.defparameter( "*STANFORD-NER-PORT*", $int130$6666 );
    $resporator_to_cycl_map$ = SubLFiles.defvar( "*RESPORATOR-TO-CYCL-MAP*", NIL );
    $place_tightening_lexicon$ = SubLFiles.defparameter( "*PLACE-TIGHTENING-LEXICON*", NIL );
    return NIL;
  }

  public static SubLObject setup_named_entity_recognizer_file()
  {
    classes.subloop_new_class( $sym0$NAMED_ENTITY, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$NAMED_ENTITY, NIL );
    classes.subloop_note_class_initialization_function( $sym0$NAMED_ENTITY, $sym9$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$NAMED_ENTITY, $sym12$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE );
    subloop_reserved_initialize_named_entity_class( $sym0$NAMED_ENTITY );
    methods.methods_incorporate_instance_method( $sym13$PRINT, $sym0$NAMED_ENTITY, $list14, $list15, $list16 );
    methods.subloop_register_instance_method( $sym0$NAMED_ENTITY, $sym13$PRINT, $sym21$NAMED_ENTITY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym22$GET_STRING, $sym0$NAMED_ENTITY, $list23, NIL, $list24 );
    methods.subloop_register_instance_method( $sym0$NAMED_ENTITY, $sym22$GET_STRING, $sym26$NAMED_ENTITY_GET_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym27$GET_TYPE, $sym0$NAMED_ENTITY, $list23, NIL, $list28 );
    methods.subloop_register_instance_method( $sym0$NAMED_ENTITY, $sym27$GET_TYPE, $sym30$NAMED_ENTITY_GET_TYPE_METHOD );
    methods.methods_incorporate_instance_method( $sym31$GET_CYC, $sym0$NAMED_ENTITY, $list23, NIL, $list32 );
    methods.subloop_register_instance_method( $sym0$NAMED_ENTITY, $sym31$GET_CYC, $sym34$NAMED_ENTITY_GET_CYC_METHOD );
    methods.methods_incorporate_instance_method( $sym35$GET_CONFIDENCE, $sym0$NAMED_ENTITY, $list23, NIL, $list36 );
    methods.subloop_register_instance_method( $sym0$NAMED_ENTITY, $sym35$GET_CONFIDENCE, $sym38$NAMED_ENTITY_GET_CONFIDENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym39$GET_SOURCE, $sym0$NAMED_ENTITY, $list23, NIL, $list40 );
    methods.subloop_register_instance_method( $sym0$NAMED_ENTITY, $sym39$GET_SOURCE, $sym42$NAMED_ENTITY_GET_SOURCE_METHOD );
    classes.subloop_new_class( $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym0$NAMED_ENTITY, NIL, NIL, $list44 );
    classes.class_set_implements_slot_listeners( $sym43$CONTEXTUALIZED_NAMED_ENTITY, NIL );
    classes.subloop_note_class_initialization_function( $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym49$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym50$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE );
    subloop_reserved_initialize_contextualized_named_entity_class( $sym43$CONTEXTUALIZED_NAMED_ENTITY );
    methods.methods_incorporate_class_method( $sym51$GET_LEXICON, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $list23, NIL, $list52 );
    methods.subloop_register_class_method( $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym51$GET_LEXICON, $sym55$CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD );
    methods.methods_incorporate_class_method( $sym56$SET_LEXICON, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $list23, $list57, $list58 );
    methods.subloop_register_class_method( $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym56$SET_LEXICON, $sym60$CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD );
    methods.methods_incorporate_instance_method( $sym62$TIGHTEN_TYPE, $sym43$CONTEXTUALIZED_NAMED_ENTITY, $list23, $list63, $list64 );
    methods.subloop_register_instance_method( $sym43$CONTEXTUALIZED_NAMED_ENTITY, $sym62$TIGHTEN_TYPE, $sym78$CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD );
    memoization_state.note_memoized_function( $sym83$DENOTS_OF_PS_HARVEST_NBARS );
    memoization_state.note_globally_cached_function( $sym86$NAMED_ENTITY_ );
    interfaces.new_interface( $sym95$NAMED_ENTITY_RECOGNIZER, NIL, NIL, $list96 );
    classes.subloop_new_class( $sym89$STANFORD_NER, $sym1$OBJECT, $list97, NIL, $list98 );
    classes.class_set_implements_slot_listeners( $sym89$STANFORD_NER, NIL );
    classes.subloop_note_class_initialization_function( $sym89$STANFORD_NER, $sym103$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym89$STANFORD_NER, $sym104$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE );
    subloop_reserved_initialize_stanford_ner_class( $sym89$STANFORD_NER );
    methods.methods_incorporate_class_method( $sym105$TO_CYC, $sym89$STANFORD_NER, $list14, $list106, $list107 );
    methods.subloop_register_class_method( $sym89$STANFORD_NER, $sym105$TO_CYC, $sym109$STANFORD_NER_TO_CYC_METHOD );
    methods.methods_incorporate_instance_method( $sym92$RUN, $sym89$STANFORD_NER, $list23, $list110, $list111 );
    methods.subloop_register_instance_method( $sym89$STANFORD_NER, $sym92$RUN, $sym112$STANFORD_NER_RUN_METHOD );
    methods.methods_incorporate_instance_method( $sym115$MERGE_CLUSTERS, $sym89$STANFORD_NER, $list23, $list116, $list117 );
    methods.subloop_register_instance_method( $sym89$STANFORD_NER, $sym115$MERGE_CLUSTERS, $sym122$STANFORD_NER_MERGE_CLUSTERS_METHOD );
    access_macros.register_external_symbol( $sym127$_STANFORD_NER_HOST_ );
    access_macros.register_external_symbol( $sym129$_STANFORD_NER_PORT_ );
    classes.subloop_new_class( $sym134$RESPORATOR, $sym1$OBJECT, $list97, NIL, $list96 );
    classes.class_set_implements_slot_listeners( $sym134$RESPORATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym134$RESPORATOR, $sym135$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym134$RESPORATOR, $sym136$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE );
    subloop_reserved_initialize_resporator_class( $sym134$RESPORATOR );
    methods.methods_incorporate_instance_method( $sym92$RUN, $sym134$RESPORATOR, $list23, $list110, $list137 );
    methods.subloop_register_instance_method( $sym134$RESPORATOR, $sym92$RUN, $sym139$RESPORATOR_RUN_METHOD );
    methods.methods_incorporate_instance_method( $sym138$NEXT_RESPORATOR_ENTITY, $sym134$RESPORATOR, $list140, $list141, $list142 );
    methods.subloop_register_instance_method( $sym134$RESPORATOR, $sym138$NEXT_RESPORATOR_ENTITY, $sym143$RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD );
    generic_testing.define_test_case_table_int( $sym158$NE_TEST_TIGHTEN_TYPE, ConsesLow.list( new SubLObject[] { $kw159$TEST, Symbols.symbol_function( $sym160$NE_TEST_FUNC ), $kw161$OWNER, NIL, $kw162$CLASSES, $list163,
      $kw164$KB, $kw165$FULL, $kw166$WORKING_, T
    } ), $list167 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_named_entity_recognizer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_named_entity_recognizer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_named_entity_recognizer_file();
  }
  static
  {
    me = new named_entity_recognizer();
    $break_named_entityP$ = null;
    $named_entityP_caching_state$ = null;
    $stanford_ner_host$ = null;
    $stanford_ner_port$ = null;
    $resporator_to_cycl_map$ = null;
    $place_tightening_lexicon$ = null;
    $sym0$NAMED_ENTITY = makeSymbol( "NAMED-ENTITY" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "STRING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SOURCE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CYC" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONFIDENCE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STRING" ), NIL,
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TYPE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "GET-SOURCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CYC" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONFIDENCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol(
                            "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym3$CONFIDENCE = makeSymbol( "CONFIDENCE" );
    $sym4$CYC = makeSymbol( "CYC" );
    $sym5$SOURCE = makeSymbol( "SOURCE" );
    $sym6$TYPE = makeSymbol( "TYPE" );
    $sym7$STRING = makeSymbol( "STRING" );
    $sym8$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym9$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-CLASS" );
    $sym10$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym11$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-INSTANCE" );
    $sym13$PRINT = makeSymbol( "PRINT" );
    $list14 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list15 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list16 = ConsesLow.list( makeString( "Prints this named entity to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString(
        "#<NE: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol( "STRING" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "/" ), makeSymbol(
            "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "TYPE" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list(
                makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NAMED-ENTITY-METHOD" );
    $str18$__NE__ = makeString( "#<NE: " );
    $str19$_ = makeString( "/" );
    $str20$_ = makeString( ">" );
    $sym21$NAMED_ENTITY_PRINT_METHOD = makeSymbol( "NAMED-ENTITY-PRINT-METHOD" );
    $sym22$GET_STRING = makeSymbol( "GET-STRING" );
    $list23 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list24 = ConsesLow.list( makeString( "@return stringp; the string of this named-entity" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STRING" ) ) );
    $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NAMED-ENTITY-METHOD" );
    $sym26$NAMED_ENTITY_GET_STRING_METHOD = makeSymbol( "NAMED-ENTITY-GET-STRING-METHOD" );
    $sym27$GET_TYPE = makeSymbol( "GET-TYPE" );
    $list28 = ConsesLow.list( makeString( "@return object; the native type of this named-entity" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TYPE" ) ) );
    $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NAMED-ENTITY-METHOD" );
    $sym30$NAMED_ENTITY_GET_TYPE_METHOD = makeSymbol( "NAMED-ENTITY-GET-TYPE-METHOD" );
    $sym31$GET_CYC = makeSymbol( "GET-CYC" );
    $list32 = ConsesLow.list( makeString( "@return stringp; the cyc type of this named-entity" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYC" ) ) );
    $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NAMED-ENTITY-METHOD" );
    $sym34$NAMED_ENTITY_GET_CYC_METHOD = makeSymbol( "NAMED-ENTITY-GET-CYC-METHOD" );
    $sym35$GET_CONFIDENCE = makeSymbol( "GET-CONFIDENCE" );
    $list36 = ConsesLow.list( makeString( "@return stringp; the confidence of this named-entity" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONFIDENCE" ) ) );
    $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NAMED-ENTITY-METHOD" );
    $sym38$NAMED_ENTITY_GET_CONFIDENCE_METHOD = makeSymbol( "NAMED-ENTITY-GET-CONFIDENCE-METHOD" );
    $sym39$GET_SOURCE = makeSymbol( "GET-SOURCE" );
    $list40 = ConsesLow.list( makeString( "@return named-entity-recognizer-p; the ner that created this named-entity" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SOURCE" ) ) );
    $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-NAMED-ENTITY-METHOD" );
    $sym42$NAMED_ENTITY_GET_SOURCE_METHOD = makeSymbol( "NAMED-ENTITY-GET-SOURCE-METHOD" );
    $sym43$CONTEXTUALIZED_NAMED_ENTITY = makeSymbol( "CONTEXTUALIZED-NAMED-ENTITY" );
    $list44 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LEXICON" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONTEXT" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "OFFSETS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUBTYPES" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LEXICON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SET-LEXICON" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OFFSETS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TIGHTEN-TYPE" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym45$SUBTYPES = makeSymbol( "SUBTYPES" );
    $sym46$OFFSETS = makeSymbol( "OFFSETS" );
    $sym47$CONTEXT = makeSymbol( "CONTEXT" );
    $sym48$LEXICON = makeSymbol( "LEXICON" );
    $sym49$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-CLASS" );
    $sym50$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-INSTANCE" );
    $sym51$GET_LEXICON = makeSymbol( "GET-LEXICON" );
    $list52 = ConsesLow.list( makeString( "@return the lexicon of this entity" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXICON" ),
        ConsesLow.list( makeSymbol( "NEW-CASE-SENSITIVITY-PREFERRED-TERM-LEXICON" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "IGNORE-CACHE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXICON" ) ) );
    $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD" );
    $sym54$IGNORE_CACHE = makeSymbol( "IGNORE-CACHE" );
    $sym55$CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD = makeSymbol( "CONTEXTUALIZED-NAMED-ENTITY-GET-LEXICON-METHOD" );
    $sym56$SET_LEXICON = makeSymbol( "SET-LEXICON" );
    $list57 = ConsesLow.list( makeSymbol( "LEX" ) );
    $list58 = ConsesLow.list( makeString( "@param LEXICON term-lexicon-p" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXICON" ), makeSymbol( "LEX" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "LEXICON" ) ) );
    $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD" );
    $sym60$CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD = makeSymbol( "CONTEXTUALIZED-NAMED-ENTITY-SET-LEXICON-METHOD" );
    $sym61$LISTP = makeSymbol( "LISTP" );
    $sym62$TIGHTEN_TYPE = makeSymbol( "TIGHTEN-TYPE" );
    $list63 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "RESPECT-NER-TYPE?" ), T ), makeSymbol( "LEXICAL-LOOKUP-ONLY?" ) );
    $list64 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "NEW-STANFORD-PARSER" ) ) ),
      ConsesLow.list( makeSymbol( "QUESTION-WORD" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( EQL, makeSymbol( "CYC" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), makeString(
          "Who" ), makeString( "What" ) ) ), ConsesLow.list( makeSymbol( "QUESTION-STRING" ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "QUESTION-WORD" ), makeString(
              "is" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "STRING" ), makeString( "?" ) ) ) ) ), ConsesLow.list( makeSymbol( "QUESTION-PARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                  "PARSER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), makeSymbol( "QUESTION-STRING" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol(
                      "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFINITIONAL-QUESTION" ) ) ) ), ConsesLow.list( makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol(
                          "NEW-SIMPLE-PASSAGE" ), makeSymbol( "CONTEXT" ) ) ), ConsesLow.list( makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                              makeSymbol( "GET-LEXICON" ) ) ) ), makeSymbol( "ANSWERS" ), makeSymbol( "TIGHTER-TYPES" ), makeSymbol( "ANSWER-STRINGS" ), ConsesLow.list( makeSymbol( "ENTITY-STRING" ), ConsesLow.list(
                                  makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) )
        } ), ConsesLow.list( makeSymbol( "SET-QUESTION-STRING" ), makeSymbol( "QUESTION" ), makeSymbol( "QUESTION-STRING" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "QUESTION-PARSE" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "QUESTION-PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "SET-QUESTION-PARSE" ),
                makeSymbol( "QUESTION" ), makeSymbol( "QUESTION-PARSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUESTION" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "EXTRACT" ) ), makeSymbol( "PASSAGE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQL, makeSymbol( "CYC" ),
                        constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "QUESTION" ),
                            makeSymbol( "ENTITY-STRING" ), ConsesLow.list( makeSymbol( "NEW-SIMPLE-PASSAGE" ), makeSymbol( "ENTITY-STRING" ) ), ONE_INTEGER ), makeSymbol( "ANSWERS" ) ) ), ConsesLow.list( makeSymbol(
                                "WITH-POSSIBLY-NEW-MEMOIZATION-STATE" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                    ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol(
                                            "SUBSTRING?" ), makeSymbol( "ANSWER-STRING" ), makeSymbol( "ENTITY-STRING" ) ) ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "ENDS-WITH-START-OF" ),
                                                makeSymbol( "ENTITY-STRING" ), makeSymbol( "ANSWER-STRING" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                                                    makeString( " " ) ) ) ), ConsesLow.list( makeSymbol( "ENDS-WITH-START-OF" ), makeSymbol( "ANSWER-STRING" ), makeSymbol( "ENTITY-STRING" ), ConsesLow.list( makeSymbol(
                                                        "QUOTE" ), EQUAL ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( " " ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ),
                                                            ConsesLow.list( makeSymbol( "NEW-TIGHTER-TYPES" ), makeSymbol( "ANSWER-STRING" ) ), ConsesLow.list( makeSymbol( "TIGHTER-TYPES-FROM-ANSWER" ), makeSymbol(
                                                                "ANSWER" ), makeSymbol( "LEXICON" ), makeSymbol( "ENTITY-STRING" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "RESPECT-NER-TYPE?" ), makeSymbol(
                                                                    "CYC" ) ), makeSymbol( "LEXICAL-LOOKUP-ONLY?" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ANSWER-STRING" ), makeSymbol(
                                                                        "ANSWER-STRINGS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIGHTER-TYPES" ), ConsesLow.list( makeSymbol( "UNION" ), makeSymbol(
                                                                            "TIGHTER-TYPES" ), makeSymbol( "NEW-TIGHTER-TYPES" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBTYPES" ), makeSymbol(
                                                                                "TIGHTER-TYPES" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "TIGHTER-TYPES" ), makeSymbol(
                                                                                    "ANSWER-STRINGS" ) ) )
    } ) );
    $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD" );
    $const66$Person = constant_handles.reader_make_constant_shell( makeString( "Person" ) );
    $str67$Who = makeString( "Who" );
    $str68$What = makeString( "What" );
    $str69$is = makeString( "is" );
    $str70$_ = makeString( "?" );
    $sym71$PARSE = makeSymbol( "PARSE" );
    $sym72$DEFINITIONAL_QUESTION = makeSymbol( "DEFINITIONAL-QUESTION" );
    $sym73$LEXIFY = makeSymbol( "LEXIFY" );
    $sym74$EXTRACT = makeSymbol( "EXTRACT" );
    $const75$Organization = constant_handles.reader_make_constant_shell( makeString( "Organization" ) );
    $sym76$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $list77 = ConsesLow.list( makeString( " " ) );
    $sym78$CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD = makeSymbol( "CONTEXTUALIZED-NAMED-ENTITY-TIGHTEN-TYPE-METHOD" );
    $sym79$GET_PARSE_TREE = makeSymbol( "GET-PARSE-TREE" );
    $kw80$BEST_ONLY = makeKeyword( "BEST-ONLY" );
    $sym81$GET_HEAD_DAUGHTERS = makeSymbol( "GET-HEAD-DAUGHTERS" );
    $sym82$LEXIFY_SENTENCE = makeSymbol( "LEXIFY-SENTENCE" );
    $sym83$DENOTS_OF_PS_HARVEST_NBARS = makeSymbol( "DENOTS-OF-PS-HARVEST-NBARS" );
    $list84 = ConsesLow.list( makeSymbol( "SPAN" ), makeSymbol( "CYCLS" ) );
    $kw85$NONE = makeKeyword( "NONE" );
    $sym86$NAMED_ENTITY_ = makeSymbol( "NAMED-ENTITY?" );
    $sym87$STRINGP = makeSymbol( "STRINGP" );
    $sym88$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym89$STANFORD_NER = makeSymbol( "STANFORD-NER" );
    $sym90$O = makeSymbol( "O" );
    $sym91$_EXIT = makeSymbol( "%EXIT" );
    $sym92$RUN = makeSymbol( "RUN" );
    $str93$Error___S_occured_in_NAMED_ENTITY = makeString( "Error: ~S occured in NAMED-ENTITY? ~%" );
    $sym94$_NAMED_ENTITY__CACHING_STATE_ = makeSymbol( "*NAMED-ENTITY?-CACHING-STATE*" );
    $sym95$NAMED_ENTITY_RECOGNIZER = makeSymbol( "NAMED-ENTITY-RECOGNIZER" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ) );
    $list97 = ConsesLow.list( makeSymbol( "NAMED-ENTITY-RECOGNIZER" ) );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "TYPE-MAP" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.cons(
        makeSymbol( "PERSON" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.cons( makeSymbol( "ORGANIZATION" ), constant_handles.reader_make_constant_shell( makeString(
            "Organization" ) ) ), ConsesLow.cons( makeSymbol( "LOCATION" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ), ConsesLow.cons( makeSymbol( "DATE" ), constant_handles
                .reader_make_constant_shell( makeString( "Date" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "KNOWN-CYC-TYPES" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ),
                        constant_handles.reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell( makeString( "Date" ) ) ) ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ),
                            makeSymbol( "TO-CYC" ), ConsesLow.list( makeSymbol( "TYPE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN" ), ConsesLow.list(
                                makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym99$KNOWN_CYC_TYPES = makeSymbol( "KNOWN-CYC-TYPES" );
    $sym100$TYPE_MAP = makeSymbol( "TYPE-MAP" );
    $list101 = ConsesLow.list( ConsesLow.cons( makeSymbol( "PERSON" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.cons( makeSymbol( "ORGANIZATION" ), constant_handles
        .reader_make_constant_shell( makeString( "Organization" ) ) ), ConsesLow.cons( makeSymbol( "LOCATION" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ), ConsesLow.cons( makeSymbol(
            "DATE" ), constant_handles.reader_make_constant_shell( makeString( "Date" ) ) ) );
    $list102 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell( makeString( "Date" ) ) );
    $sym103$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-CLASS" );
    $sym104$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-INSTANCE" );
    $sym105$TO_CYC = makeSymbol( "TO-CYC" );
    $list106 = ConsesLow.list( makeSymbol( "TYPE" ) );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "ASSOC" ), makeSymbol( "TYPE" ), makeSymbol( "TYPE-MAP" ) ) ) ) );
    $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STANFORD-NER-METHOD" );
    $sym109$STANFORD_NER_TO_CYC_METHOD = makeSymbol( "STANFORD-NER-TO-CYC-METHOD" );
    $list110 = ConsesLow.list( makeSymbol( "TEXT" ) );
    $list111 = ConsesLow.list( makeString( "Returns the entities recognized by this Stanford named-entity recognizer" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TEXT" ), makeSymbol( "STRINGP" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STANFORD-TOKENS" ), ConsesLow.list( makeSymbol( "STANFORD-NER" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol(
            "LATEST-STRING" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "STANFORD-TOKENS" ) ) ), ConsesLow.list( makeSymbol( "LATEST-TYPE" ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol(
                "SECOND" ), makeSymbol( "STANFORD-TOKENS" ) ) ) ), ConsesLow.list( makeSymbol( "ENTITIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENS" ), ConsesLow
                    .list( makeSymbol( "CDDR" ), makeSymbol( "STANFORD-TOKENS" ) ), ConsesLow.list( makeSymbol( "CDDR" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol(
                        "FIRST" ), makeSymbol( "TOKENS" ) ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow
                            .list( makeSymbol( "SECOND" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "TOKENS" ) ) ) ) ), ConsesLow.list(
                                ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQL,
                                    makeSymbol( "TYPE" ), makeSymbol( "LATEST-TYPE" ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "O" ) ), makeSymbol(
                                        "TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LATEST-STRING" ), ConsesLow.list( makeSymbol( "BUILD-MWL" ), makeSymbol( "LATEST-STRING" ), makeSymbol(
                                            "STRING" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol(
                                                "NEW-CONTEXTUALIZED-NAMED-ENTITY" ), makeSymbol( "LATEST-STRING" ), makeSymbol( "LATEST-TYPE" ), makeSymbol( "SELF" ), makeSymbol( "TEXT" ), NIL, NIL, ConsesLow.list(
                                                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TO-CYC" ) ), makeSymbol( "LATEST-TYPE" ) ) ) ), makeSymbol(
                                                        "ENTITIES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LATEST-STRING" ), makeSymbol( "STRING" ), makeSymbol( "LATEST-TYPE" ), makeSymbol(
                                                            "TYPE" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-CONTEXTUALIZED-NAMED-ENTITY" ),
                                                                makeSymbol( "LATEST-STRING" ), makeSymbol( "LATEST-TYPE" ), makeSymbol( "SELF" ), makeSymbol( "TEXT" ), NIL, NIL, ConsesLow.list( makeSymbol( "FIM" ),
                                                                    makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TO-CYC" ) ), makeSymbol( "LATEST-TYPE" ) ) ) ), makeSymbol( "ENTITIES" ) ),
            ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "ENTITIES" ) ) ) ) );
    $sym112$STANFORD_NER_RUN_METHOD = makeSymbol( "STANFORD-NER-RUN-METHOD" );
    $str113$ = makeString( "" );
    $str114$_ = makeString( " " );
    $sym115$MERGE_CLUSTERS = makeSymbol( "MERGE-CLUSTERS" );
    $list116 = ConsesLow.list( makeSymbol( "CLUSTERS" ), makeSymbol( "LEXICON" ) );
    $list117 = ConsesLow.list( makeString(
        "Merges clusters that the Stanford NER doesn't merge appropriately.  In particular, this merges \n   CITY, STATE cluster, since the NER returns <CITY/PLACE> <,/O> <STATE/PLACE> for things like\n   'Austin, Texas', and returns <CITY/PLACE> <,/O> <STATE/ORGANIZATION> for things like 'Austin, TX'" ),
        ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-CLUSTERS" ) ), makeSymbol( "PREV-NE" ), makeSymbol(
            "ANTE-PREV-NE" ) ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "CLUSTER" ), makeSymbol( "CLUSTER-NUM" ), makeSymbol( "CLUSTERS" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                ConsesLow.list( ConsesLow.list( makeSymbol( "NE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "CLUSTER" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "CAND" ), makeSymbol( "PREV-NE" ), makeSymbol( "ANTE-PREV-NE" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-CYC" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ), ConsesLow.list( EQUAL, makeString( "," ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PREV-NE" ),
                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANTE-PREV-NE" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "GET-CYC" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ), ConsesLow.list( makeSymbol( "NE-HAS-STATE-DENOT?" ), makeSymbol(
                                    "LEXICON" ), makeSymbol( "NE" ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NE-HAS-STATE-DENOT?" ), makeSymbol( "LEXICON" ), makeSymbol(
                                        "ANTE-PREV-NE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STRING" ), ConsesLow.list( makeSymbol( "FORMAT-NIL" ), makeString(
                                            "~A, ~A" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANTE-PREV-NE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list(
                                                makeSymbol( "FIM" ), makeSymbol( "NE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "TYPE" ), ConsesLow.list(
                                                    makeSymbol( "QUOTE" ), makeSymbol( "LOCATION" ) ) ), ConsesLow.list( makeSymbol( "TEXT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "NE" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), makeSymbol( "CONTEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREV-NE" ), ConsesLow.list( makeSymbol(
                                                            "NEW-CONTEXTUALIZED-NAMED-ENTITY" ), makeSymbol( "NEW-STRING" ), makeSymbol( "TYPE" ), makeSymbol( "SELF" ), makeSymbol( "TEXT" ), NIL, NIL, ConsesLow.list(
                                                                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TO-CYC" ) ), makeSymbol( "TYPE" ) ) ) ), ConsesLow.list(
                                                                    makeSymbol( "CSETQ" ), makeSymbol( "ANTE-PREV-NE" ), ConsesLow.list( makeSymbol( "CAAR" ), makeSymbol( "NEW-CLUSTERS" ) ) ), ConsesLow.list( makeSymbol(
                                                                        "CPOP" ), makeSymbol( "NEW-CLUSTERS" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ANTE-PREV-NE" ), ConsesLow
                                                                            .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ANTE-PREV-NE" ) ), makeSymbol( "NEW-CLUSTERS" ) ) ), ConsesLow
                                                                                .list( makeSymbol( "CSETQ" ), makeSymbol( "ANTE-PREV-NE" ), makeSymbol( "PREV-NE" ), makeSymbol( "PREV-NE" ), makeSymbol( "NE" ) ) ) ) ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ANTE-PREV-NE" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ANTE-PREV-NE" ) ), makeSymbol(
                "NEW-CLUSTERS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PREV-NE" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PREV-NE" ) ), makeSymbol(
                    "NEW-CLUSTERS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "NEW-CLUSTERS" ) ) ) ) );
    $const118$Place = constant_handles.reader_make_constant_shell( makeString( "Place" ) );
    $str119$_ = makeString( "," );
    $str120$__ = makeString( ", " );
    $sym121$LOCATION = makeSymbol( "LOCATION" );
    $sym122$STANFORD_NER_MERGE_CLUSTERS_METHOD = makeSymbol( "STANFORD-NER-MERGE-CLUSTERS-METHOD" );
    $sym123$GET = makeSymbol( "GET" );
    $kw124$DENOT = makeKeyword( "DENOT" );
    $const125$State_US = constant_handles.reader_make_constant_shell( makeString( "State-US" ) );
    $const126$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym127$_STANFORD_NER_HOST_ = makeSymbol( "*STANFORD-NER-HOST*" );
    $str128$localhost = makeString( "localhost" );
    $sym129$_STANFORD_NER_PORT_ = makeSymbol( "*STANFORD-NER-PORT*" );
    $int130$6666 = makeInteger( 6666 );
    $str131$The_cat_sat_on_the_mat_ = makeString( "The cat sat on the mat." );
    $kw132$PUBLIC = makeKeyword( "PUBLIC" );
    $list133 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_slash );
    $sym134$RESPORATOR = makeSymbol( "RESPORATOR" );
    $sym135$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-CLASS" );
    $sym136$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-INSTANCE" );
    $list137 = ConsesLow.list( makeString( "Returns the entities recognized by this resporator" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TEXT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ENTITIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENS" ), ConsesLow.list( makeSymbol(
            "RESPORATOR" ), makeSymbol( "TEXT" ) ), ConsesLow.list( makeSymbol( "NTHCDR" ), makeSymbol( "CARD" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "ENTITY" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT-RESPORATOR-ENTITY" ) ), makeSymbol( "TOKENS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "NEXT-RESPORATOR-ENTITY" ) ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "CARD" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "ENTITY" ) ),
                        ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "ENTITY" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "ENTITY" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                            makeSymbol( "ENTITY" ), makeSymbol( "ENTITIES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "ENTITIES" ) ) ) ) );
    $sym138$NEXT_RESPORATOR_ENTITY = makeSymbol( "NEXT-RESPORATOR-ENTITY" );
    $sym139$RESPORATOR_RUN_METHOD = makeSymbol( "RESPORATOR-RUN-METHOD" );
    $list140 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list141 = ConsesLow.list( makeSymbol( "TOKENS" ) );
    $list142 = ConsesLow.list( makeString(
        "@param TOKENS listp;\n   @return listp; a disjunctively interpreted list of named-entity, all with the same\n   string and different types, resulting from a single occurrence in the input text" ), ConsesLow
            .list( makeSymbol( "PUNLESS" ), makeSymbol( "TOKENS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow
                .list( makeSymbol( "FIRST" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list( makeSymbol( "DISJUNCTION" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-NAMED-ENTITY" ), ConsesLow
                    .list( makeSymbol( "CDR" ), makeSymbol( "FIRST" ) ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "FIRST" ) ), makeSymbol( "SELF" ), NIL, ConsesLow.list( makeSymbol( "RESPORATOR-TO-CYCL" ),
                        ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "FIRST" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "FIRST" ) ) ), ConsesLow.list(
                            makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "FIRST" ) ) ), ConsesLow.list( makeSymbol( "TYPES-SO-FAR" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                "TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TYPE.STRING" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TOKENS" ) ) ), ConsesLow.list(
                                    makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                                        "TYPE.STRING" ) ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TYPE.STRING" ) ), makeSymbol(
                                            "TYPES-SO-FAR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DISJUNCTION" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                "NEW-NAMED-ENTITY" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TYPE.STRING" ) ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TYPE.STRING" ) ), makeSymbol(
                                                    "SELF" ), NIL, ConsesLow.list( makeSymbol( "RESPORATOR-TO-CYCL" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TYPE.STRING" ) ) ) ), makeSymbol(
                                                        "DISJUNCTION" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TYPE.STRING" ) ), makeSymbol( "TYPES-SO-FAR" ) ) ),
                ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DISJUNCTION" ) ) ) );
    $sym143$RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD = makeSymbol( "RESPORATOR-NEXT-RESPORATOR-ENTITY-METHOD" );
    $int144$100 = makeInteger( 100 );
    $const145$GuruQAMt = constant_handles.reader_make_constant_shell( makeString( "GuruQAMt" ) );
    $list146 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "guruqaGenlsToken" ) ), constant_handles.reader_make_constant_shell( makeString( "guruqaTypeToken" ) ) );
    $sym147$DATE = makeSymbol( "DATE" );
    $const148$EnduringThing_Localized = constant_handles.reader_make_constant_shell( makeString( "EnduringThing-Localized" ) );
    $const149$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) );
    $const150$State_UnitedStates = constant_handles.reader_make_constant_shell( makeString( "State-UnitedStates" ) );
    $const151$GeopoliticalEntityNamedFn = constant_handles.reader_make_constant_shell( makeString( "GeopoliticalEntityNamedFn" ) );
    $sym152$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw153$OFF = makeKeyword( "OFF" );
    $sym154$SET_LEARNERS = makeSymbol( "SET-LEARNERS" );
    $kw155$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym156$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym157$PATTERN_MATCHES_FORMULA = makeSymbol( "PATTERN-MATCHES-FORMULA" );
    $sym158$NE_TEST_TIGHTEN_TYPE = makeSymbol( "NE-TEST-TIGHTEN-TYPE" );
    $kw159$TEST = makeKeyword( "TEST" );
    $sym160$NE_TEST_FUNC = makeSymbol( "NE-TEST-FUNC" );
    $kw161$OWNER = makeKeyword( "OWNER" );
    $kw162$CLASSES = makeKeyword( "CLASSES" );
    $list163 = ConsesLow.list( makeSymbol( "NL-PARSING-TEST-CASES" ) );
    $kw164$KB = makeKeyword( "KB" );
    $kw165$FULL = makeKeyword( "FULL" );
    $kw166$WORKING_ = makeKeyword( "WORKING?" );
    $list167 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "Canadian linguist George Lakoff lives in the woods" ), makeString( "George Lakoff" ), constant_handles
        .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), ConsesLow
            .list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CitizenFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Canada" ) ) ), constant_handles
                .reader_make_constant_shell( makeString( "CanadianPerson" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Linguist" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "CollectionIntersection2Fn" ) ), constant_handles.reader_make_constant_shell( makeString( "Linguist" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "CitizenFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Canada" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                            "CanadianPerson" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "British chef Paul Cunningham opened a new restaurant last week" ), makeString( "Paul Cunningham" ), constant_handles
                                .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "CollectionIntersection2Fn" ) ), constant_handles.reader_make_constant_shell( makeString( "BritishPerson" ) ), constant_handles.reader_make_constant_shell( makeString( "Chef" ) ) ),
                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), constant_handles.reader_make_constant_shell( makeString( "Chef" ) ), ConsesLow
                                        .list( constant_handles.reader_make_constant_shell( makeString( "CitizenFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                            "UnitedKingdomOfGreatBritainAndNorthernIreland" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), ConsesLow
                                                .list( constant_handles.reader_make_constant_shell( makeString( "CitizenFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                    "UnitedKingdomOfGreatBritainAndNorthernIreland" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Chef" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                        makeString( "Ranasinghe Premadasa - President of Sri Lanka - was assassinated." ), makeString( "Ranasinghe Premadasa" ), constant_handles
                                                            .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                "SubcollectionOfWithRelationFromFn" ) ), ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ),
                                                                    constant_handles.reader_make_constant_shell( makeString( "PresidentOfOrganization" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                        "president" ) ), constant_handles.reader_make_constant_shell( makeString( "SriLanka" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                            "Ranasinghe Premadasa, President of Sri Lanka, was assassinated." ), makeString( "Ranasinghe Premadasa" ), constant_handles
                                                                                .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                    "SubcollectionOfWithRelationFromFn" ) ), ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                        "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "PresidentOfOrganization" ) ) ), constant_handles
                                                                                            .reader_make_constant_shell( makeString( "president" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                "SriLanka" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                    "Ranasinghe Premadasa (President of Sri Lanka) was assassinated." ), makeString( "Ranasinghe Premadasa" ),
                                                                                                    constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) ), ConsesLow.list( makeKeyword(
                                                                                                            "OR" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "PresidentOfOrganization" ) ) ), constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "president" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                        makeString( "SriLanka" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                            "In 2004 he released Spooked, which was recorded with country/folk duo Gillian Welch and David Rawlings." ),
                                                                                                                            makeString( "country/folk duo" ), NIL ), ConsesLow.list( constant_handles
                                                                                                                                .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ),
                                                                                                                                constant_handles.reader_make_constant_shell( makeString( "Duo-MusicalPerformanceGroup" ) ),
                                                                                                                                constant_handles.reader_make_constant_shell( makeString( "institutionalFocus" ) ),
                                                                                                                                constant_handles.reader_make_constant_shell( makeString( "FolkMusic" ) ) ) ), ConsesLow
                                                                                                                                    .list( ConsesLow.list( makeString( "He is undergoing a medial septal myectomy." ),
                                                                                                                                        makeString( "medial septal myectomy" ), NIL ), constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "SeptalMyectomy" ) ) ), ConsesLow.list(
                                                                                                                                                ConsesLow.list( makeString(
                                                                                                                                                    "Salle Moulay Abdellah is an indoor sporting arena located in Rabat, Morocco. The capacity of the arena is 10,000 people." ),
                                                                                                                                                    makeString( "Salle Moulay Abdellah" ), NIL ), constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString( "Stadium" ) ) ), ConsesLow
                                                                                                                                                            .list( ConsesLow.list( makeString(
                                                                                                                                                                "The Hazaras even boasted a prime minister, Sultan Ali Keshtmand, in the mid-1980s." ),
                                                                                                                                                                makeString( "Sultan Ali Keshtmand" ), constant_handles
                                                                                                                                                                    .reader_make_constant_shell( makeString( "Person" ) ) ),
                                                                                                                                                                constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                    "PrimeMinister-HeadOfGovernment" ) ) ), ConsesLow.list(
                                                                                                                                                                        ConsesLow.list( makeString(
                                                                                                                                                                            "Assadullah Sarwari replaced him with a Banner leader, Sultan Ali Keshtmand." ),
                                                                                                                                                                            makeString( "Sultan Ali Keshtmand" ),
                                                                                                                                                                            constant_handles.reader_make_constant_shell(
                                                                                                                                                                                makeString( "Person" ) ) ), constant_handles
                                                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                                                        "Leader" ) ) )
    } );
  }
}
/*
 * 
 * Total time: 707 ms
 * 
 */