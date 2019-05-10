package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_slurpers
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_slurpers";
  public static final String myFingerPrint = "48de595decd3832f167897097624b0dd45b0326fb85c4335038feec2edc36470";
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3948L)
  private static SubLSymbol $lexicon_slurper$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6248L)
  private static SubLSymbol $arc_lexicon_slurper$;
  private static final SubLSymbol $sym0$LEXICON_SLURPER_FILTER;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$GENLS_FILTERS;
  private static final SubLSymbol $sym4$ISA_FILTERS;
  private static final SubLSymbol $sym5$INSTANCE_COUNT;
  private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS;
  private static final SubLSymbol $sym7$ISOLATED_P;
  private static final SubLSymbol $sym8$INSTANCE_NUMBER;
  private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE;
  private static final SubLSymbol $sym10$MERGE;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD;
  private static final SubLSymbol $sym15$LEXICON_SLURPER_FILTER_P;
  private static final SubLSymbol $sym16$LEXICON_SLURPER_FILTER_MERGE_METHOD;
  private static final SubLSymbol $sym17$APPROVE;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD;
  private static final SubLSymbol $sym21$LEX_ENTRY_P;
  private static final SubLSymbol $sym22$GET;
  private static final SubLSymbol $kw23$DENOT;
  private static final SubLSymbol $sym24$LEXICON_SLURPER_FILTER_APPROVE_METHOD;
  private static final SubLSymbol $sym25$PROPRIETARY_SLURPER_FILTER;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS;
  private static final SubLSymbol $sym28$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE;
  private static final SubLSymbol $sym29$INITIALIZE;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym35$PERSON_SLURPER_FILTER;
  private static final SubLSymbol $sym36$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS;
  private static final SubLSymbol $sym37$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$PERSON_SLURPER_FILTER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym42$ARC_SLURPER_FILTER;
  private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS;
  private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$ARC_SLURPER_FILTER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym47$LEXICON_SLURPER;
  private static final SubLSymbol $sym48$HAS_NEXT;
  private static final SubLSymbol $sym49$NEXT;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CURRENT_KEY_VALUE;
  private static final SubLSymbol $sym52$SLURPER_FILTER;
  private static final SubLSymbol $sym53$LEXICON_ITERATOR;
  private static final SubLSymbol $sym54$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS;
  private static final SubLSymbol $sym55$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD;
  private static final SubLSymbol $sym58$QUIRK_LEXICON;
  private static final SubLSymbol $sym59$LEXICON_SLURPER_INITIALIZE_METHOD;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$LEXICON_SLURPER_HAS_NEXT_METHOD;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD;
  private static final SubLSymbol $sym65$LEXICON_SLURPER_NEXT_METHOD;
  private static final SubLSymbol $sym66$ARC_LEXICON_SLURPER;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$HEAD_VALUE;
  private static final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS;
  private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD;
  private static final SubLSymbol $sym73$ARC_LEXICON_SLURPER_INITIALIZE_METHOD;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD;
  private static final SubLSymbol $kw76$STRING;
  private static final SubLSymbol $sym77$ARC_LEXICON_SLURPER_NEXT_METHOD;
  private static final SubLString $str78$;
  private static final SubLString $str79$_;
  private static final SubLSymbol $kw80$CYC_POS;
  private static final SubLSymbol $kw81$INFLECTIONS;
  private static final SubLSymbol $kw82$NP;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject get_lexicon_slurper_filter_genls_filters(final SubLObject lexicon_slurper_filter)
  {
    return classes.subloop_get_access_protected_instance_slot( lexicon_slurper_filter, TWO_INTEGER, $sym3$GENLS_FILTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject set_lexicon_slurper_filter_genls_filters(final SubLObject lexicon_slurper_filter, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lexicon_slurper_filter, value, TWO_INTEGER, $sym3$GENLS_FILTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject get_lexicon_slurper_filter_isa_filters(final SubLObject lexicon_slurper_filter)
  {
    return classes.subloop_get_access_protected_instance_slot( lexicon_slurper_filter, ONE_INTEGER, $sym4$ISA_FILTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject set_lexicon_slurper_filter_isa_filters(final SubLObject lexicon_slurper_filter, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lexicon_slurper_filter, value, ONE_INTEGER, $sym4$ISA_FILTERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject subloop_reserved_initialize_lexicon_slurper_filter_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject subloop_reserved_initialize_lexicon_slurper_filter_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym4$ISA_FILTERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym3$GENLS_FILTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
  public static SubLObject lexicon_slurper_filter_p(final SubLObject lexicon_slurper_filter)
  {
    return classes.subloop_instanceof_class( lexicon_slurper_filter, $sym0$LEXICON_SLURPER_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2454L)
  public static SubLObject lexicon_slurper_filter_merge_method(final SubLObject self, final SubLObject other_filter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lexicon_slurper_filter_method = NIL;
    SubLObject genls_filters = get_lexicon_slurper_filter_genls_filters( self );
    SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters( self );
    try
    {
      thread.throwStack.push( $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD );
      try
      {
        assert NIL != lexicon_slurper_filter_p( other_filter ) : other_filter;
        isa_filters = conses_high.union( isa_filters, instances.get_slot( other_filter, $sym4$ISA_FILTERS ), UNPROVIDED, UNPROVIDED );
        genls_filters = conses_high.union( genls_filters, instances.get_slot( other_filter, $sym3$GENLS_FILTERS ), UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_filter_genls_filters( self, genls_filters );
          set_lexicon_slurper_filter_isa_filters( self, isa_filters );
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
      catch_var_for_lexicon_slurper_filter_method = Errors.handleThrowable( ccatch_env_var, $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lexicon_slurper_filter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2761L)
  public static SubLObject lexicon_slurper_filter_approve_method(final SubLObject self, final SubLObject lex_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lexicon_slurper_filter_method = NIL;
    final SubLObject genls_filters = get_lexicon_slurper_filter_genls_filters( self );
    final SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters( self );
    try
    {
      thread.throwStack.push( $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD );
      try
      {
        assert NIL != abstract_lexicon.lex_entry_p( lex_entry ) : lex_entry;
        final SubLObject denot = methods.funcall_instance_method_with_1_args( lex_entry, $sym22$GET, $kw23$DENOT );
        SubLObject fail = NIL;
        if( NIL == fail )
        {
          SubLObject csome_list_var = isa_filters;
          SubLObject collection = NIL;
          collection = csome_list_var.first();
          while ( NIL == fail && NIL != csome_list_var)
          {
            if( NIL != isa.isa_in_any_mtP( denot, collection ) )
            {
              fail = T;
            }
            csome_list_var = csome_list_var.rest();
            collection = csome_list_var.first();
          }
        }
        if( NIL == fail )
        {
          if( NIL == fail )
          {
            SubLObject csome_list_var = genls_filters;
            SubLObject collection = NIL;
            collection = csome_list_var.first();
            while ( NIL == fail && NIL != csome_list_var)
            {
              if( NIL != genls.genl_in_any_mtP( denot, collection ) )
              {
                fail = T;
              }
              csome_list_var = csome_list_var.rest();
              collection = csome_list_var.first();
            }
          }
          Dynamic.sublisp_throw( $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD, makeBoolean( NIL == fail ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_filter_genls_filters( self, genls_filters );
          set_lexicon_slurper_filter_isa_filters( self, isa_filters );
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
      catch_var_for_lexicon_slurper_filter_method = Errors.handleThrowable( ccatch_env_var, $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lexicon_slurper_filter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3188L)
  public static SubLObject subloop_reserved_initialize_proprietary_slurper_filter_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3188L)
  public static SubLObject subloop_reserved_initialize_proprietary_slurper_filter_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym4$ISA_FILTERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym3$GENLS_FILTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3188L)
  public static SubLObject proprietary_slurper_filter_p(final SubLObject proprietary_slurper_filter)
  {
    return classes.subloop_instanceof_class( proprietary_slurper_filter, $sym25$PROPRIETARY_SLURPER_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3342L)
  public static SubLObject proprietary_slurper_filter_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_proprietary_slurper_filter_method = NIL;
    SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD );
      try
      {
        object.object_initialize_method( self );
        isa_filters = $list33;
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_filter_isa_filters( self, isa_filters );
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
      catch_var_for_proprietary_slurper_filter_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_proprietary_slurper_filter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3500L)
  public static SubLObject subloop_reserved_initialize_person_slurper_filter_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3500L)
  public static SubLObject subloop_reserved_initialize_person_slurper_filter_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym4$ISA_FILTERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym3$GENLS_FILTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3500L)
  public static SubLObject person_slurper_filter_p(final SubLObject person_slurper_filter)
  {
    return classes.subloop_instanceof_class( person_slurper_filter, $sym35$PERSON_SLURPER_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3572L)
  public static SubLObject person_slurper_filter_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_person_slurper_filter_method = NIL;
    SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD );
      try
      {
        object.object_initialize_method( self );
        isa_filters = $list40;
        Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_filter_isa_filters( self, isa_filters );
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
      catch_var_for_person_slurper_filter_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_person_slurper_filter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3712L)
  public static SubLObject subloop_reserved_initialize_arc_slurper_filter_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3712L)
  public static SubLObject subloop_reserved_initialize_arc_slurper_filter_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym4$ISA_FILTERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$LEXICON_SLURPER_FILTER, $sym3$GENLS_FILTERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3712L)
  public static SubLObject arc_slurper_filter_p(final SubLObject arc_slurper_filter)
  {
    return classes.subloop_instanceof_class( arc_slurper_filter, $sym42$ARC_SLURPER_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3781L)
  public static SubLObject arc_slurper_filter_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    methods.funcall_instance_method_with_1_args( self, $sym10$MERGE, object.new_class_instance( $sym35$PERSON_SLURPER_FILTER ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4175L)
  public static SubLObject get_lexicon_slurper()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $lexicon_slurper$.getDynamicValue( thread ) )
    {
      $lexicon_slurper$.setDynamicValue( object.new_class_instance( $sym47$LEXICON_SLURPER ), thread );
    }
    return $lexicon_slurper$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4340L)
  public static SubLObject has_next_lexicon_entry()
  {
    return methods.funcall_instance_method_with_0_args( get_lexicon_slurper(), $sym48$HAS_NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4577L)
  public static SubLObject next_lexicon_entry()
  {
    return methods.funcall_instance_method_with_0_args( get_lexicon_slurper(), $sym49$NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4860L)
  public static SubLObject reset_lexicon_slurper()
  {
    $lexicon_slurper$.setDynamicValue( NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject get_lexicon_slurper_current_key_value(final SubLObject lexicon_slurper)
  {
    return classes.subloop_get_access_protected_instance_slot( lexicon_slurper, THREE_INTEGER, $sym51$CURRENT_KEY_VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject set_lexicon_slurper_current_key_value(final SubLObject lexicon_slurper, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lexicon_slurper, value, THREE_INTEGER, $sym51$CURRENT_KEY_VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject get_lexicon_slurper_slurper_filter(final SubLObject lexicon_slurper)
  {
    return classes.subloop_get_access_protected_instance_slot( lexicon_slurper, TWO_INTEGER, $sym52$SLURPER_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject set_lexicon_slurper_slurper_filter(final SubLObject lexicon_slurper, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lexicon_slurper, value, TWO_INTEGER, $sym52$SLURPER_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject get_lexicon_slurper_lexicon_iterator(final SubLObject lexicon_slurper)
  {
    return classes.subloop_get_access_protected_instance_slot( lexicon_slurper, ONE_INTEGER, $sym53$LEXICON_ITERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject set_lexicon_slurper_lexicon_iterator(final SubLObject lexicon_slurper, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lexicon_slurper, value, ONE_INTEGER, $sym53$LEXICON_ITERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject subloop_reserved_initialize_lexicon_slurper_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject subloop_reserved_initialize_lexicon_slurper_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$LEXICON_SLURPER, $sym53$LEXICON_ITERATOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$LEXICON_SLURPER, $sym52$SLURPER_FILTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$LEXICON_SLURPER, $sym51$CURRENT_KEY_VALUE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
  public static SubLObject lexicon_slurper_p(final SubLObject lexicon_slurper)
  {
    return classes.subloop_instanceof_class( lexicon_slurper, $sym47$LEXICON_SLURPER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5387L)
  public static SubLObject lexicon_slurper_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lexicon_slurper_method = NIL;
    SubLObject slurper_filter = get_lexicon_slurper_slurper_filter( self );
    SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator( self );
    try
    {
      thread.throwStack.push( $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD );
      try
      {
        object.object_initialize_method( self );
        lexicon_iterator = abstract_lexicon.new_lexicon_iterator( object.new_class_instance( $sym58$QUIRK_LEXICON ) );
        slurper_filter = object.new_class_instance( $sym25$PROPRIETARY_SLURPER_FILTER );
        Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_slurper_filter( self, slurper_filter );
          set_lexicon_slurper_lexicon_iterator( self, lexicon_iterator );
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
      catch_var_for_lexicon_slurper_method = Errors.handleThrowable( ccatch_env_var, $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lexicon_slurper_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5704L)
  public static SubLObject lexicon_slurper_has_next_method(final SubLObject self)
  {
    instances.set_slot( self, $sym51$CURRENT_KEY_VALUE, methods.funcall_instance_method_with_0_args( self, $sym49$NEXT ) );
    if( NIL != instances.get_slot( self, $sym51$CURRENT_KEY_VALUE ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6021L)
  public static SubLObject lexicon_slurper_next_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lexicon_slurper_method = NIL;
    final SubLObject slurper_filter = get_lexicon_slurper_slurper_filter( self );
    final SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD );
      try
      {
        SubLObject entry = NIL;
        for( SubLObject approved = NIL; NIL == approved; approved = methods.funcall_instance_method_with_0_args( slurper_filter, $sym17$APPROVE ) )
        {
          entry = iteration.iteration_next( lexicon_iterator );
        }
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD, entry );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_slurper_filter( self, slurper_filter );
          set_lexicon_slurper_lexicon_iterator( self, lexicon_iterator );
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
      catch_var_for_lexicon_slurper_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lexicon_slurper_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6536L)
  public static SubLObject get_arc_lexicon_slurper()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $arc_lexicon_slurper$.getDynamicValue( thread ) )
    {
      $arc_lexicon_slurper$.setDynamicValue( object.new_class_instance( $sym66$ARC_LEXICON_SLURPER ), thread );
    }
    return $arc_lexicon_slurper$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6721L)
  public static SubLObject has_next_arc_lexicon_entry()
  {
    return methods.funcall_instance_method_with_0_args( get_arc_lexicon_slurper(), $sym48$HAS_NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6970L)
  public static SubLObject next_arc_lexicon_entry()
  {
    return methods.funcall_instance_method_with_0_args( get_arc_lexicon_slurper(), $sym49$NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7417L)
  public static SubLObject reset_arc_lexicon_slurper()
  {
    $arc_lexicon_slurper$.setDynamicValue( NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
  public static SubLObject get_arc_lexicon_slurper_head_value(final SubLObject arc_lexicon_slurper)
  {
    return classes.subloop_get_access_protected_instance_slot( arc_lexicon_slurper, FOUR_INTEGER, $sym68$HEAD_VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
  public static SubLObject set_arc_lexicon_slurper_head_value(final SubLObject arc_lexicon_slurper, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( arc_lexicon_slurper, value, FOUR_INTEGER, $sym68$HEAD_VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
  public static SubLObject subloop_reserved_initialize_arc_lexicon_slurper_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
  public static SubLObject subloop_reserved_initialize_arc_lexicon_slurper_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$LEXICON_SLURPER, $sym53$LEXICON_ITERATOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$LEXICON_SLURPER, $sym52$SLURPER_FILTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$LEXICON_SLURPER, $sym51$CURRENT_KEY_VALUE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym66$ARC_LEXICON_SLURPER, $sym68$HEAD_VALUE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
  public static SubLObject arc_lexicon_slurper_p(final SubLObject arc_lexicon_slurper)
  {
    return classes.subloop_instanceof_class( arc_lexicon_slurper, $sym66$ARC_LEXICON_SLURPER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7794L)
  public static SubLObject arc_lexicon_slurper_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_arc_lexicon_slurper_method = NIL;
    SubLObject slurper_filter = get_lexicon_slurper_slurper_filter( self );
    SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator( self );
    try
    {
      thread.throwStack.push( $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD );
      try
      {
        lexicon_slurper_initialize_method( self );
        lexicon_iterator = abstract_lexicon.new_lexicon_iterator( object.new_class_instance( $sym58$QUIRK_LEXICON ) );
        slurper_filter = object.new_class_instance( $sym42$ARC_SLURPER_FILTER );
        Dynamic.sublisp_throw( $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_slurper_filter( self, slurper_filter );
          set_lexicon_slurper_lexicon_iterator( self, lexicon_iterator );
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
      catch_var_for_arc_lexicon_slurper_method = Errors.handleThrowable( ccatch_env_var, $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_arc_lexicon_slurper_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 8107L)
  public static SubLObject arc_lexicon_slurper_next_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_arc_lexicon_slurper_method = NIL;
    SubLObject current_key_value = get_lexicon_slurper_current_key_value( self );
    final SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator( self );
    try
    {
      thread.throwStack.push( $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD );
      try
      {
        if( NIL != current_key_value )
        {
          final SubLObject value = current_key_value;
          current_key_value = NIL;
          Dynamic.sublisp_throw( $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, value );
        }
        if( NIL != iteration.iteration_done( lexicon_iterator ) )
        {
          Dynamic.sublisp_throw( $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, NIL );
        }
        final SubLObject head_lex = iteration.iteration_next( lexicon_iterator );
        final SubLObject head_lex_string = methods.funcall_instance_method_with_1_args( head_lex, $sym22$GET, $kw76$STRING );
        SubLObject lexes = NIL;
        SubLObject new_head = NIL;
        while ( NIL == new_head && NIL == iteration.iteration_done( lexicon_iterator ))
        {
          final SubLObject next_value = iteration.iteration_next( lexicon_iterator );
          if( !head_lex_string.equalp( methods.funcall_instance_method_with_1_args( next_value, $sym22$GET, $kw76$STRING ) ) )
          {
            new_head = T;
          }
          if( NIL == new_head )
          {
            lexes = ConsesLow.cons( next_value, lexes );
          }
        }
        final SubLObject pos_denots_list = make_arc_pos_denots_list( ConsesLow.cons( head_lex, lexes ) );
        if( NIL != pos_denots_list )
        {
          final SubLObject safe_string = head_lex_string.isCons() ? make_safe_arc_key( head_lex_string ) : head_lex_string;
          Dynamic.sublisp_throw( $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, ConsesLow.list( safe_string, pos_denots_list ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, methods.funcall_instance_method_with_0_args( self, $sym49$NEXT ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lexicon_slurper_current_key_value( self, current_key_value );
          set_lexicon_slurper_lexicon_iterator( self, lexicon_iterator );
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
      catch_var_for_arc_lexicon_slurper_method = Errors.handleThrowable( ccatch_env_var, $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_arc_lexicon_slurper_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 9015L)
  public static SubLObject make_safe_arc_key(final SubLObject list_of_strings)
  {
    SubLObject safe = NIL;
    SubLObject cdolist_list_var = list_of_strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      safe = ConsesLow.cons( string_utilities.string_substitute( $str78$, $str79$_, string, UNPROVIDED ), safe );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return Sequences.nreverse( safe );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 9209L)
  public static SubLObject make_arc_pos_denots_list(final SubLObject lex_entries)
  {
    final SubLObject aux_hash = Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject pos_denots_list = NIL;
    SubLObject cdolist_list_var = lex_entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject denot = narts_high.nart_substitute( methods.funcall_instance_method_with_1_args( entry, $sym22$GET, $kw23$DENOT ) );
      final SubLObject pos = methods.funcall_instance_method_with_1_args( entry, $sym22$GET, $kw80$CYC_POS );
      SubLObject cdolist_list_var_$1;
      final SubLObject inflections = cdolist_list_var_$1 = methods.funcall_instance_method_with_1_args( entry, $sym22$GET, $kw81$INFLECTIONS );
      SubLObject infl = NIL;
      infl = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject penn_tag = ( NIL != pos ) ? abstract_lexicon.map_from_cyc_to_penn_pos( pos, infl ) : $kw82$NP;
        if( NIL != penn_tag )
        {
          Hashtables.sethash( penn_tag, aux_hash, ConsesLow.cons( denot, Hashtables.gethash( penn_tag, aux_hash, UNPROVIDED ) ) );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        infl = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    SubLObject k = NIL;
    SubLObject v = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( aux_hash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        k = Hashtables.getEntryKey( cdohash_entry );
        v = Hashtables.getEntryValue( cdohash_entry );
        pos_denots_list = ConsesLow.cons( ConsesLow.list( k, v ), pos_denots_list );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return pos_denots_list;
  }

  public static SubLObject declare_lexicon_slurpers_file()
  {
    SubLFiles.declareFunction( me, "get_lexicon_slurper_filter_genls_filters", "GET-LEXICON-SLURPER-FILTER-GENLS-FILTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lexicon_slurper_filter_genls_filters", "SET-LEXICON-SLURPER-FILTER-GENLS-FILTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lexicon_slurper_filter_isa_filters", "GET-LEXICON-SLURPER-FILTER-ISA-FILTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lexicon_slurper_filter_isa_filters", "SET-LEXICON-SLURPER-FILTER-ISA-FILTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lexicon_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lexicon_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_filter_p", "LEXICON-SLURPER-FILTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_filter_merge_method", "LEXICON-SLURPER-FILTER-MERGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_filter_approve_method", "LEXICON-SLURPER-FILTER-APPROVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_proprietary_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_proprietary_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "proprietary_slurper_filter_p", "PROPRIETARY-SLURPER-FILTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proprietary_slurper_filter_initialize_method", "PROPRIETARY-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_person_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_person_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "person_slurper_filter_p", "PERSON-SLURPER-FILTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "person_slurper_filter_initialize_method", "PERSON-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_arc_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_arc_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_slurper_filter_p", "ARC-SLURPER-FILTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_slurper_filter_initialize_method", "ARC-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_lexicon_slurper", "GET-LEXICON-SLURPER", 0, 0, false );
    SubLFiles.declareFunction( me, "has_next_lexicon_entry", "HAS-NEXT-LEXICON-ENTRY", 0, 0, false );
    SubLFiles.declareFunction( me, "next_lexicon_entry", "NEXT-LEXICON-ENTRY", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_lexicon_slurper", "RESET-LEXICON-SLURPER", 0, 0, false );
    SubLFiles.declareFunction( me, "get_lexicon_slurper_current_key_value", "GET-LEXICON-SLURPER-CURRENT-KEY-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lexicon_slurper_current_key_value", "SET-LEXICON-SLURPER-CURRENT-KEY-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lexicon_slurper_slurper_filter", "GET-LEXICON-SLURPER-SLURPER-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lexicon_slurper_slurper_filter", "SET-LEXICON-SLURPER-SLURPER-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lexicon_slurper_lexicon_iterator", "GET-LEXICON-SLURPER-LEXICON-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lexicon_slurper_lexicon_iterator", "SET-LEXICON-SLURPER-LEXICON-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lexicon_slurper_class", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lexicon_slurper_instance", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_p", "LEXICON-SLURPER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_initialize_method", "LEXICON-SLURPER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_has_next_method", "LEXICON-SLURPER-HAS-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_slurper_next_method", "LEXICON-SLURPER-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_arc_lexicon_slurper", "GET-ARC-LEXICON-SLURPER", 0, 0, false );
    SubLFiles.declareFunction( me, "has_next_arc_lexicon_entry", "HAS-NEXT-ARC-LEXICON-ENTRY", 0, 0, false );
    SubLFiles.declareFunction( me, "next_arc_lexicon_entry", "NEXT-ARC-LEXICON-ENTRY", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_arc_lexicon_slurper", "RESET-ARC-LEXICON-SLURPER", 0, 0, false );
    SubLFiles.declareFunction( me, "get_arc_lexicon_slurper_head_value", "GET-ARC-LEXICON-SLURPER-HEAD-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_arc_lexicon_slurper_head_value", "SET-ARC-LEXICON-SLURPER-HEAD-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_arc_lexicon_slurper_class", "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_arc_lexicon_slurper_instance", "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_lexicon_slurper_p", "ARC-LEXICON-SLURPER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_lexicon_slurper_initialize_method", "ARC-LEXICON-SLURPER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_lexicon_slurper_next_method", "ARC-LEXICON-SLURPER-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "make_safe_arc_key", "MAKE-SAFE-ARC-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "make_arc_pos_denots_list", "MAKE-ARC-POS-DENOTS-LIST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_lexicon_slurpers_file()
  {
    $lexicon_slurper$ = SubLFiles.defvar( "*LEXICON-SLURPER*", NIL );
    $arc_lexicon_slurper$ = SubLFiles.defvar( "*ARC-LEXICON-SLURPER*", NIL );
    return NIL;
  }

  public static SubLObject setup_lexicon_slurpers_file()
  {
    classes.subloop_new_class( $sym0$LEXICON_SLURPER_FILTER, $sym1$OBJECT, NIL, T, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$LEXICON_SLURPER_FILTER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$LEXICON_SLURPER_FILTER, $sym6$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$LEXICON_SLURPER_FILTER, $sym9$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE );
    subloop_reserved_initialize_lexicon_slurper_filter_class( $sym0$LEXICON_SLURPER_FILTER );
    methods.methods_incorporate_instance_method( $sym10$MERGE, $sym0$LEXICON_SLURPER_FILTER, $list11, $list12, $list13 );
    methods.subloop_register_instance_method( $sym0$LEXICON_SLURPER_FILTER, $sym10$MERGE, $sym16$LEXICON_SLURPER_FILTER_MERGE_METHOD );
    methods.methods_incorporate_instance_method( $sym17$APPROVE, $sym0$LEXICON_SLURPER_FILTER, $list11, $list18, $list19 );
    methods.subloop_register_instance_method( $sym0$LEXICON_SLURPER_FILTER, $sym17$APPROVE, $sym24$LEXICON_SLURPER_FILTER_APPROVE_METHOD );
    classes.subloop_new_class( $sym25$PROPRIETARY_SLURPER_FILTER, $sym0$LEXICON_SLURPER_FILTER, NIL, NIL, $list26 );
    classes.class_set_implements_slot_listeners( $sym25$PROPRIETARY_SLURPER_FILTER, NIL );
    classes.subloop_note_class_initialization_function( $sym25$PROPRIETARY_SLURPER_FILTER, $sym27$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym25$PROPRIETARY_SLURPER_FILTER, $sym28$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE );
    subloop_reserved_initialize_proprietary_slurper_filter_class( $sym25$PROPRIETARY_SLURPER_FILTER );
    methods.methods_incorporate_instance_method( $sym29$INITIALIZE, $sym25$PROPRIETARY_SLURPER_FILTER, $list30, NIL, $list31 );
    methods.subloop_register_instance_method( $sym25$PROPRIETARY_SLURPER_FILTER, $sym29$INITIALIZE, $sym34$PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym35$PERSON_SLURPER_FILTER, $sym0$LEXICON_SLURPER_FILTER, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym35$PERSON_SLURPER_FILTER, NIL );
    classes.subloop_note_class_initialization_function( $sym35$PERSON_SLURPER_FILTER, $sym36$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym35$PERSON_SLURPER_FILTER, $sym37$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE );
    subloop_reserved_initialize_person_slurper_filter_class( $sym35$PERSON_SLURPER_FILTER );
    methods.methods_incorporate_instance_method( $sym29$INITIALIZE, $sym35$PERSON_SLURPER_FILTER, $list30, NIL, $list38 );
    methods.subloop_register_instance_method( $sym35$PERSON_SLURPER_FILTER, $sym29$INITIALIZE, $sym41$PERSON_SLURPER_FILTER_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym42$ARC_SLURPER_FILTER, $sym0$LEXICON_SLURPER_FILTER, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym42$ARC_SLURPER_FILTER, NIL );
    classes.subloop_note_class_initialization_function( $sym42$ARC_SLURPER_FILTER, $sym43$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym42$ARC_SLURPER_FILTER, $sym44$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE );
    subloop_reserved_initialize_arc_slurper_filter_class( $sym42$ARC_SLURPER_FILTER );
    methods.methods_incorporate_instance_method( $sym29$INITIALIZE, $sym42$ARC_SLURPER_FILTER, $list30, NIL, $list45 );
    methods.subloop_register_instance_method( $sym42$ARC_SLURPER_FILTER, $sym29$INITIALIZE, $sym46$ARC_SLURPER_FILTER_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym47$LEXICON_SLURPER, $sym1$OBJECT, NIL, NIL, $list50 );
    classes.class_set_implements_slot_listeners( $sym47$LEXICON_SLURPER, NIL );
    classes.subloop_note_class_initialization_function( $sym47$LEXICON_SLURPER, $sym54$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym47$LEXICON_SLURPER, $sym55$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE );
    subloop_reserved_initialize_lexicon_slurper_class( $sym47$LEXICON_SLURPER );
    methods.methods_incorporate_instance_method( $sym29$INITIALIZE, $sym47$LEXICON_SLURPER, $list30, NIL, $list56 );
    methods.subloop_register_instance_method( $sym47$LEXICON_SLURPER, $sym29$INITIALIZE, $sym59$LEXICON_SLURPER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym48$HAS_NEXT, $sym47$LEXICON_SLURPER, $list60, NIL, $list61 );
    methods.subloop_register_instance_method( $sym47$LEXICON_SLURPER, $sym48$HAS_NEXT, $sym62$LEXICON_SLURPER_HAS_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym49$NEXT, $sym47$LEXICON_SLURPER, $list11, NIL, $list63 );
    methods.subloop_register_instance_method( $sym47$LEXICON_SLURPER, $sym49$NEXT, $sym65$LEXICON_SLURPER_NEXT_METHOD );
    classes.subloop_new_class( $sym66$ARC_LEXICON_SLURPER, $sym47$LEXICON_SLURPER, NIL, NIL, $list67 );
    classes.class_set_implements_slot_listeners( $sym66$ARC_LEXICON_SLURPER, NIL );
    classes.subloop_note_class_initialization_function( $sym66$ARC_LEXICON_SLURPER, $sym69$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym66$ARC_LEXICON_SLURPER, $sym70$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE );
    subloop_reserved_initialize_arc_lexicon_slurper_class( $sym66$ARC_LEXICON_SLURPER );
    methods.methods_incorporate_instance_method( $sym29$INITIALIZE, $sym66$ARC_LEXICON_SLURPER, $list30, NIL, $list71 );
    methods.subloop_register_instance_method( $sym66$ARC_LEXICON_SLURPER, $sym29$INITIALIZE, $sym73$ARC_LEXICON_SLURPER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym49$NEXT, $sym66$ARC_LEXICON_SLURPER, $list11, NIL, $list74 );
    methods.subloop_register_instance_method( $sym66$ARC_LEXICON_SLURPER, $sym49$NEXT, $sym77$ARC_LEXICON_SLURPER_NEXT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_slurpers_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_slurpers_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_slurpers_file();
  }
  static
  {
    me = new lexicon_slurpers();
    $lexicon_slurper$ = null;
    $arc_lexicon_slurper$ = null;
    $sym0$LEXICON_SLURPER_FILTER = makeSymbol( "LEXICON-SLURPER-FILTER" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-FILTERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "GENLS-FILTERS" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MERGE" ), ConsesLow.list( makeSymbol( "OTHER-FILTER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "APPROVE" ), ConsesLow.list( makeSymbol( "LEX-ENTRY" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym3$GENLS_FILTERS = makeSymbol( "GENLS-FILTERS" );
    $sym4$ISA_FILTERS = makeSymbol( "ISA-FILTERS" );
    $sym5$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym6$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-CLASS" );
    $sym7$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym8$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym9$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-INSTANCE" );
    $sym10$MERGE = makeSymbol( "MERGE" );
    $list11 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list12 = ConsesLow.list( makeSymbol( "OTHER-FILTER" ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OTHER-FILTER" ), makeSymbol( "LEXICON-SLURPER-FILTER-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ISA-FILTERS" ),
        ConsesLow.list( makeSymbol( "UNION" ), makeSymbol( "ISA-FILTERS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER-FILTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "ISA-FILTERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENLS-FILTERS" ), ConsesLow.list( makeSymbol( "UNION" ), makeSymbol( "GENLS-FILTERS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                makeSymbol( "OTHER-FILTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GENLS-FILTERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEXICON-SLURPER-FILTER-METHOD" );
    $sym15$LEXICON_SLURPER_FILTER_P = makeSymbol( "LEXICON-SLURPER-FILTER-P" );
    $sym16$LEXICON_SLURPER_FILTER_MERGE_METHOD = makeSymbol( "LEXICON-SLURPER-FILTER-MERGE-METHOD" );
    $sym17$APPROVE = makeSymbol( "APPROVE" );
    $list18 = ConsesLow.list( makeSymbol( "LEX-ENTRY" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRY-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "DENOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "DENOT" ) ) ), makeSymbol( "FAIL" ) ), ConsesLow.list(
            makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "ISA-FILTERS" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ISA-IN-ANY-MT?" ),
                makeSymbol( "DENOT" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), T ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ), ConsesLow.list(
                    makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "GENLS-FILTERS" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "GENL-IN-ANY-MT?" ), makeSymbol( "DENOT" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), T ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                            makeSymbol( "CNOT" ), makeSymbol( "FAIL" ) ) ) ) ) );
    $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEXICON-SLURPER-FILTER-METHOD" );
    $sym21$LEX_ENTRY_P = makeSymbol( "LEX-ENTRY-P" );
    $sym22$GET = makeSymbol( "GET" );
    $kw23$DENOT = makeKeyword( "DENOT" );
    $sym24$LEXICON_SLURPER_FILTER_APPROVE_METHOD = makeSymbol( "LEXICON-SLURPER-FILTER-APPROVE-METHOD" );
    $sym25$PROPRIETARY_SLURPER_FILTER = makeSymbol( "PROPRIETARY-SLURPER-FILTER" );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym27$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-CLASS" );
    $sym28$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-INSTANCE" );
    $sym29$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list30 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ISA-FILTERS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "ProprietaryConstant" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PROPRIETARY-SLURPER-FILTER-METHOD" );
    $list33 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ProprietaryConstant" ) ) );
    $sym34$PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD = makeSymbol( "PROPRIETARY-SLURPER-FILTER-INITIALIZE-METHOD" );
    $sym35$PERSON_SLURPER_FILTER = makeSymbol( "PERSON-SLURPER-FILTER" );
    $sym36$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-CLASS" );
    $sym37$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-INSTANCE" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ISA-FILTERS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PERSON-SLURPER-FILTER-METHOD" );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ) );
    $sym41$PERSON_SLURPER_FILTER_INITIALIZE_METHOD = makeSymbol( "PERSON-SLURPER-FILTER-INITIALIZE-METHOD" );
    $sym42$ARC_SLURPER_FILTER = makeSymbol( "ARC-SLURPER-FILTER" );
    $sym43$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-CLASS" );
    $sym44$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-INSTANCE" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "MERGE" ) ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PERSON-SLURPER-FILTER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym46$ARC_SLURPER_FILTER_INITIALIZE_METHOD = makeSymbol( "ARC-SLURPER-FILTER-INITIALIZE-METHOD" );
    $sym47$LEXICON_SLURPER = makeSymbol( "LEXICON-SLURPER" );
    $sym48$HAS_NEXT = makeSymbol( "HAS-NEXT" );
    $sym49$NEXT = makeSymbol( "NEXT" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEXICON-ITERATOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SLURPER-FILTER" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CURRENT-KEY-VALUE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HAS-NEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym51$CURRENT_KEY_VALUE = makeSymbol( "CURRENT-KEY-VALUE" );
    $sym52$SLURPER_FILTER = makeSymbol( "SLURPER-FILTER" );
    $sym53$LEXICON_ITERATOR = makeSymbol( "LEXICON-ITERATOR" );
    $sym54$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-CLASS" );
    $sym55$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-INSTANCE" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXICON-ITERATOR" ), ConsesLow.list( makeSymbol(
        "NEW-LEXICON-ITERATOR" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUIRK-LEXICON" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "SLURPER-FILTER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROPRIETARY-SLURPER-FILTER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "SELF" ) ) );
    $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEXICON-SLURPER-METHOD" );
    $sym58$QUIRK_LEXICON = makeSymbol( "QUIRK-LEXICON" );
    $sym59$LEXICON_SLURPER_INITIALIZE_METHOD = makeSymbol( "LEXICON-SLURPER-INITIALIZE-METHOD" );
    $list60 = ConsesLow.list( makeKeyword( "PUBLIC" ), makeKeyword( "NO-MEMBER-VARIABLES" ) );
    $list61 = ConsesLow.list( makeString( "@return BOOLEAN; T if slurper has a next element, NIL otherwise\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "CURRENT-KEY-VALUE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ),
        ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CURRENT-KEY-VALUE" ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), T ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym62$LEXICON_SLURPER_HAS_NEXT_METHOD = makeSymbol( "LEXICON-SLURPER-HAS-NEXT-METHOD" );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "APPROVED" ) ), ConsesLow.list( makeSymbol( "UNTIL" ), makeSymbol( "APPROVED" ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "ENTRY" ), ConsesLow.list( makeSymbol( "ITERATION-NEXT" ), makeSymbol( "LEXICON-ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "APPROVED" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "SLURPER-FILTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "APPROVE" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ENTRY" ) ) ) );
    $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEXICON-SLURPER-METHOD" );
    $sym65$LEXICON_SLURPER_NEXT_METHOD = makeSymbol( "LEXICON-SLURPER-NEXT-METHOD" );
    $sym66$ARC_LEXICON_SLURPER = makeSymbol( "ARC-LEXICON-SLURPER" );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD-VALUE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPLETE-HEAD-VALUE" ),
        NIL, makeKeyword( "PRIVATE" ) ) );
    $sym68$HEAD_VALUE = makeSymbol( "HEAD-VALUE" );
    $sym69$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-CLASS" );
    $sym70$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-INSTANCE" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXICON-ITERATOR" ), ConsesLow.list( makeSymbol(
        "NEW-LEXICON-ITERATOR" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUIRK-LEXICON" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "SLURPER-FILTER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ARC-SLURPER-FILTER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "SELF" ) ) );
    $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ARC-LEXICON-SLURPER-METHOD" );
    $sym73$ARC_LEXICON_SLURPER_INITIALIZE_METHOD = makeSymbol( "ARC-LEXICON-SLURPER-INITIALIZE-METHOD" );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CURRENT-KEY-VALUE" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol(
        "CURRENT-KEY-VALUE" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-KEY-VALUE" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VALUE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
            ConsesLow.list( makeSymbol( "ITERATION-DONE" ), makeSymbol( "LEXICON-ITERATOR" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                makeSymbol( "HEAD-LEX" ), ConsesLow.list( makeSymbol( "ITERATION-NEXT" ), makeSymbol( "LEXICON-ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "HEAD-LEX-STRING" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "HEAD-LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "STRING" ) ) ), makeSymbol( "LEXES" ), makeSymbol( "NEW-HEAD" ) ), ConsesLow.list( makeSymbol(
                        "UNTIL" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "NEW-HEAD" ), ConsesLow.list( makeSymbol( "ITERATION-DONE" ), makeSymbol( "LEXICON-ITERATOR" ) ) ), ConsesLow.list( makeSymbol(
                            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEXT-VALUE" ), ConsesLow.list( makeSymbol( "ITERATION-NEXT" ), makeSymbol( "LEXICON-ITERATOR" ) ) ) ), ConsesLow.list( makeSymbol(
                                "PUNLESS" ), ConsesLow.list( EQUALP, makeSymbol( "HEAD-LEX-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEXT-VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "GET" ) ), makeKeyword( "STRING" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-HEAD" ), T ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "NEW-HEAD" ),
                                        ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "NEXT-VALUE" ), makeSymbol( "LEXES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                            "POS-DENOTS-LIST" ), ConsesLow.list( makeSymbol( "MAKE-ARC-POS-DENOTS-LIST" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "HEAD-LEX" ), makeSymbol( "LEXES" ) ) ) ) ),
                                            ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "POS-DENOTS-LIST" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SAFE-STRING" ),
                                                ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "HEAD-LEX-STRING" ) ), ConsesLow.list( makeSymbol( "MAKE-SAFE-ARC-KEY" ),
                                                    makeSymbol( "HEAD-LEX-STRING" ) ), makeSymbol( "HEAD-LEX-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                                        "SAFE-STRING" ), makeSymbol( "POS-DENOTS-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ) ) ) );
    $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ARC-LEXICON-SLURPER-METHOD" );
    $kw76$STRING = makeKeyword( "STRING" );
    $sym77$ARC_LEXICON_SLURPER_NEXT_METHOD = makeSymbol( "ARC-LEXICON-SLURPER-NEXT-METHOD" );
    $str78$ = makeString( "" );
    $str79$_ = makeString( "\"" );
    $kw80$CYC_POS = makeKeyword( "CYC-POS" );
    $kw81$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $kw82$NP = makeKeyword( "NP" );
  }
}
/*
 * 
 * Total time: 300 ms
 * 
 */