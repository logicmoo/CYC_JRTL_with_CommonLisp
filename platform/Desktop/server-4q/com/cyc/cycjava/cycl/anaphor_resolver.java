package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class anaphor_resolver
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.anaphor_resolver";
  public static final String myFingerPrint = "4cabeac4907ffaccdedc00acd5319e006c9217aff48b9770491a4e8460635f99";
  private static final SubLSymbol $sym0$ANAPHOR_RESOLVER;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$COREF_DISCOURSE;
  private static final SubLSymbol $sym5$INSTANCE_COUNT;
  private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS;
  private static final SubLSymbol $sym7$ISOLATED_P;
  private static final SubLSymbol $sym8$INSTANCE_NUMBER;
  private static final SubLSymbol $sym9$NEW_DISCOURSE_EACH_RUN_;
  private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE;
  private static final SubLSymbol $sym11$RUN;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD;
  private static final SubLSymbol $sym16$GET_HEAD;
  private static final SubLSymbol $sym17$ANAPHOR_RESOLVER_RUN_METHOD;
  private static final SubLSymbol $sym18$NEW_DISCOURSE;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD;
  private static final SubLSymbol $sym21$ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject get_anaphor_resolver_coref_discourse(final SubLObject v_anaphor_resolver)
  {
    return classes.subloop_get_access_protected_instance_slot( v_anaphor_resolver, TWO_INTEGER, $sym4$COREF_DISCOURSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject set_anaphor_resolver_coref_discourse(final SubLObject v_anaphor_resolver, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_anaphor_resolver, value, TWO_INTEGER, $sym4$COREF_DISCOURSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject get_anaphor_resolver_new_discourse_each_runP(final SubLObject v_anaphor_resolver)
  {
    return classes.subloop_get_instance_slot( v_anaphor_resolver, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject set_anaphor_resolver_new_discourse_each_runP(final SubLObject v_anaphor_resolver, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_anaphor_resolver, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject subloop_reserved_initialize_anaphor_resolver_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject subloop_reserved_initialize_anaphor_resolver_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANAPHOR_RESOLVER, $sym9$NEW_DISCOURSE_EACH_RUN_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANAPHOR_RESOLVER, $sym4$COREF_DISCOURSE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
  public static SubLObject anaphor_resolver_p(final SubLObject v_anaphor_resolver)
  {
    return classes.subloop_instanceof_class( v_anaphor_resolver, $sym0$ANAPHOR_RESOLVER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 1148L)
  public static SubLObject anaphor_resolver_run_method(final SubLObject self, final SubLObject parse_trees)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_anaphor_resolver_method = NIL;
    SubLObject coref_discourse = get_anaphor_resolver_coref_discourse( self );
    final SubLObject new_discourse_each_runP = get_anaphor_resolver_new_discourse_each_runP( self );
    try
    {
      thread.throwStack.push( $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD );
      try
      {
        if( NIL != new_discourse_each_runP || NIL == coref_discourse )
        {
          coref_discourse = coreference_resolution.new_coref_discourse( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        coreference_resolution.resolve_coreferences_in_list_of_parse_trees( parse_trees, coref_discourse );
        final SubLObject coref_lists = coreference_resolution.coref_discourse_coreferring_expressions( coref_discourse );
        SubLObject coref_word_lists = NIL;
        SubLObject cdolist_list_var = coref_lists;
        SubLObject coref_list = NIL;
        coref_list = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject coref_word_list = NIL;
          SubLObject cdolist_list_var_$1 = coref_list;
          SubLObject v_parse_tree = NIL;
          v_parse_tree = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            final SubLObject v_word_tree = ( NIL != parse_tree.phrase_tree_p( v_parse_tree ) ) ? methods.funcall_instance_method_with_0_args( v_parse_tree, $sym16$GET_HEAD ) : v_parse_tree;
            coref_word_list = ConsesLow.cons( v_word_tree, coref_word_list );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            v_parse_tree = cdolist_list_var_$1.first();
          }
          coref_word_lists = ConsesLow.cons( Sequences.nreverse( coref_word_list ), coref_word_lists );
          cdolist_list_var = cdolist_list_var.rest();
          coref_list = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, Sequences.nreverse( coref_word_lists ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_anaphor_resolver_coref_discourse( self, coref_discourse );
          set_anaphor_resolver_new_discourse_each_runP( self, new_discourse_each_runP );
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
      catch_var_for_anaphor_resolver_method = Errors.handleThrowable( ccatch_env_var, $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_anaphor_resolver_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 1970L)
  public static SubLObject anaphor_resolver_new_discourse_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_anaphor_resolver_method = NIL;
    SubLObject coref_discourse = get_anaphor_resolver_coref_discourse( self );
    try
    {
      thread.throwStack.push( $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD );
      try
      {
        coref_discourse = coreference_resolution.new_coref_discourse( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_anaphor_resolver_coref_discourse( self, coref_discourse );
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
      catch_var_for_anaphor_resolver_method = Errors.handleThrowable( ccatch_env_var, $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_anaphor_resolver_method;
  }

  public static SubLObject declare_anaphor_resolver_file()
  {
    SubLFiles.declareFunction( me, "get_anaphor_resolver_coref_discourse", "GET-ANAPHOR-RESOLVER-COREF-DISCOURSE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_anaphor_resolver_coref_discourse", "SET-ANAPHOR-RESOLVER-COREF-DISCOURSE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_anaphor_resolver_new_discourse_each_runP", "GET-ANAPHOR-RESOLVER-NEW-DISCOURSE-EACH-RUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_anaphor_resolver_new_discourse_each_runP", "SET-ANAPHOR-RESOLVER-NEW-DISCOURSE-EACH-RUN?", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_anaphor_resolver_class", "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_anaphor_resolver_instance", "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "anaphor_resolver_p", "ANAPHOR-RESOLVER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "anaphor_resolver_run_method", "ANAPHOR-RESOLVER-RUN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "anaphor_resolver_new_discourse_method", "ANAPHOR-RESOLVER-NEW-DISCOURSE-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_anaphor_resolver_file()
  {
    return NIL;
  }

  public static SubLObject setup_anaphor_resolver_file()
  {
    classes.subloop_new_class( $sym0$ANAPHOR_RESOLVER, $sym1$OBJECT, $list2, NIL, $list3 );
    classes.class_set_implements_slot_listeners( $sym0$ANAPHOR_RESOLVER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$ANAPHOR_RESOLVER, $sym6$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$ANAPHOR_RESOLVER, $sym10$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE );
    subloop_reserved_initialize_anaphor_resolver_class( $sym0$ANAPHOR_RESOLVER );
    methods.methods_incorporate_instance_method( $sym11$RUN, $sym0$ANAPHOR_RESOLVER, $list12, $list13, $list14 );
    methods.subloop_register_instance_method( $sym0$ANAPHOR_RESOLVER, $sym11$RUN, $sym17$ANAPHOR_RESOLVER_RUN_METHOD );
    methods.methods_incorporate_instance_method( $sym18$NEW_DISCOURSE, $sym0$ANAPHOR_RESOLVER, $list12, NIL, $list19 );
    methods.subloop_register_instance_method( $sym0$ANAPHOR_RESOLVER, $sym18$NEW_DISCOURSE, $sym21$ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_anaphor_resolver_file();
  }

  @Override
  public void initializeVariables()
  {
    init_anaphor_resolver_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_anaphor_resolver_file();
  }
  static
  {
    me = new anaphor_resolver();
    $sym0$ANAPHOR_RESOLVER = makeSymbol( "ANAPHOR-RESOLVER" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( makeSymbol( "COREFERENCE-RESOLVER" ) );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-DISCOURSE-EACH-RUN?" ), makeKeyword( "INSTANCE" ), makeKeyword( "VALUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "COREF-DISCOURSE" ),
        makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEW-DISCOURSE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym4$COREF_DISCOURSE = makeSymbol( "COREF-DISCOURSE" );
    $sym5$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym6$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-CLASS" );
    $sym7$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym8$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym9$NEW_DISCOURSE_EACH_RUN_ = makeSymbol( "NEW-DISCOURSE-EACH-RUN?" );
    $sym10$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-INSTANCE" );
    $sym11$RUN = makeSymbol( "RUN" );
    $list12 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list13 = ConsesLow.list( makeSymbol( "PARSE-TREES" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "NEW-DISCOURSE-EACH-RUN?" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
        "COREF-DISCOURSE" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COREF-DISCOURSE" ), ConsesLow.list( makeSymbol( "NEW-COREF-DISCOURSE" ) ) ) ), ConsesLow.list( makeSymbol(
            "RESOLVE-COREFERENCES-IN-LIST-OF-PARSE-TREES" ), makeSymbol( "PARSE-TREES" ), makeSymbol( "COREF-DISCOURSE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "COREF-LISTS" ), ConsesLow.list( makeSymbol( "COREF-DISCOURSE-COREFERRING-EXPRESSIONS" ), makeSymbol( "COREF-DISCOURSE" ) ) ), ConsesLow.list( makeSymbol( "COREF-WORD-LISTS" ), NIL ) ), ConsesLow.list(
                    makeSymbol( "DO-LIST" ), ConsesLow.list( makeSymbol( "COREF-LIST" ), makeSymbol( "COREF-LISTS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "COREF-WORD-LIST" ), NIL ) ), ConsesLow.list( makeSymbol( "DO-LIST" ), ConsesLow.list( makeSymbol( "PARSE-TREE" ), makeSymbol( "COREF-LIST" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                            .list( ConsesLow.list( makeSymbol( "WORD-TREE" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "PARSE-TREE" ) ), ConsesLow.list( makeSymbol(
                                "FIM" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), makeSymbol( "PARSE-TREE" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                    makeSymbol( "WORD-TREE" ), makeSymbol( "COREF-WORD-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "COREF-WORD-LIST" ) ),
                                        makeSymbol( "COREF-WORD-LISTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "COREF-WORD-LISTS" ) ) ) ) );
    $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANAPHOR-RESOLVER-METHOD" );
    $sym16$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym17$ANAPHOR_RESOLVER_RUN_METHOD = makeSymbol( "ANAPHOR-RESOLVER-RUN-METHOD" );
    $sym18$NEW_DISCOURSE = makeSymbol( "NEW-DISCOURSE" );
    $list19 = ConsesLow.list( makeString( "Clear out any previous discourse that this instance has been run on." ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COREF-DISCOURSE" ), ConsesLow.list( makeSymbol(
        "NEW-COREF-DISCOURSE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANAPHOR-RESOLVER-METHOD" );
    $sym21$ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD = makeSymbol( "ANAPHOR-RESOLVER-NEW-DISCOURSE-METHOD" );
  }
}
/*
 * 
 * Total time: 71 ms
 * 
 */