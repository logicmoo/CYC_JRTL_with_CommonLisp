package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wordnet_proxy
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.wordnet_proxy";
  public static final String myFingerPrint = "5258b0770107295d06e9b904c875b792da1d19e588b20b927bc5fed59248f6c8";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$DEF_INSTANCE_METHOD;
  private static final SubLSymbol $sym2$INITIALIZE;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$DEFAULT_INITIALIZER;
  private static final SubLSymbol $sym6$PROGN;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DEFINE_PUBLIC;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$RET;
  private static final SubLSymbol $sym11$FIM;
  private static final SubLSymbol $sym12$PROXY;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$WORDNET_PROXY;
  private static final SubLSymbol $sym15$OBJECT;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$INSTANCE_COUNT;
  private static final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_CLASS;
  private static final SubLSymbol $sym19$ISOLATED_P;
  private static final SubLSymbol $sym20$INSTANCE_NUMBER;
  private static final SubLSymbol $sym21$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_INSTANCE;
  private static final SubLSymbol $sym22$ABSOLUTE_KEY;
  private static final SubLList $list23;
  private static final SubLString $str24$class;
  private static final SubLSymbol $sym25$WN_CLASS;
  private static final SubLSymbol $sym26$RELATIVE_KEY;
  private static final SubLSymbol $sym27$WORDNET_PROXY_ABSOLUTE_KEY_METHOD;
  private static final SubLSymbol $sym28$SENSES;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$INVOKE;
  private static final SubLString $str31$getSenses;
  private static final SubLSymbol $sym32$WORDNET_PROXY_SENSES_METHOD;
  private static final SubLSymbol $sym33$SYNSETS;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$SYNSET;
  private static final SubLSymbol $sym36$WORDNET_PROXY_SYNSETS_METHOD;
  private static final SubLSymbol $sym37$LINKS;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLString $str40$getPointerTargets;
  private static final SubLString $str41$pointerType;
  private static final SubLSymbol $sym42$WORDNET_PROXY_LINKS_METHOD;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLString $str45$method;
  private static final SubLSymbol $sym46$WORDNET_PROXY_INVOKE_METHOD;
  private static final SubLSymbol $sym47$WORD_PROXY;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$POS;
  private static final SubLSymbol $sym50$FORM;
  private static final SubLSymbol $sym51$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_CLASS;
  private static final SubLSymbol $sym52$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_INSTANCE;
  private static final SubLList $list53;
  private static final SubLString $str54$word;
  private static final SubLSymbol $sym55$WORD_PROXY_WN_CLASS_METHOD;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
  private static final SubLString $str58$pos;
  private static final SubLString $str59$form;
  private static final SubLSymbol $sym60$WORD_PROXY_RELATIVE_KEY_METHOD;
  private static final SubLSymbol $sym61$PRINT;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
  private static final SubLString $str65$__WORD_PROXY_;
  private static final SubLString $str66$_;
  private static final SubLSymbol $sym67$WORD_PROXY_PRINT_METHOD;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$WORD_PROXY_LINKS_METHOD;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
  private static final SubLSymbol $sym73$WORD_PROXY_POS_METHOD;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
  private static final SubLSymbol $sym76$WORD_PROXY_FORM_METHOD;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
  private static final SubLSymbol $sym80$WORD_PROXY_EQUAL_METHOD;
  private static final SubLSymbol $sym81$SYNSET_PROXY;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$GLOSS;
  private static final SubLSymbol $sym84$OFFSET;
  private static final SubLSymbol $sym85$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_CLASS;
  private static final SubLSymbol $sym86$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_INSTANCE;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
  private static final SubLString $str89$__SYNSET_PROXY_;
  private static final SubLString $str90$_;
  private static final SubLSymbol $sym91$SYNSET_PROXY_PRINT_METHOD;
  private static final SubLList $list92;
  private static final SubLString $str93$synset;
  private static final SubLSymbol $sym94$SYNSET_PROXY_WN_CLASS_METHOD;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
  private static final SubLString $str97$offset;
  private static final SubLSymbol $sym98$SYNSET_PROXY_RELATIVE_KEY_METHOD;
  private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
  private static final SubLSymbol $sym100$SYNSET_PROXY_POS_METHOD;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
  private static final SubLSymbol $sym103$SYNSET_PROXY_OFFSET_METHOD;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
  private static final SubLSymbol $sym106$SYNSET_PROXY_GLOSS_METHOD;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
  private static final SubLSymbol $sym109$SYNSET_PROXY_EQUAL_METHOD;
  private static final SubLSymbol $sym110$SENSE_PROXY;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_CLASS;
  private static final SubLSymbol $sym113$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_INSTANCE;
  private static final SubLSymbol $sym114$SENSE_PROXY_P;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
  private static final SubLString $str117$__SENSE_PROXY_;
  private static final SubLSymbol $sym118$SENSE_PROXY_PRINT_METHOD;
  private static final SubLList $list119;
  private static final SubLString $str120$sense;
  private static final SubLSymbol $sym121$SENSE_PROXY_WN_CLASS_METHOD;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
  private static final SubLSymbol $sym124$SENSE_PROXY_RELATIVE_KEY_METHOD;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$SENSE_PROXY_SENSES_METHOD;
  private static final SubLSymbol $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
  private static final SubLSymbol $sym128$SENSE_PROXY_FORM_METHOD;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
  private static final SubLSymbol $sym131$SENSE_PROXY_POS_METHOD;
  private static final SubLSymbol $sym132$WORD;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
  private static final SubLSymbol $sym135$SENSE_PROXY_WORD_METHOD;
  private static final SubLSymbol $sym136$NUM;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$SENSE_PROXY_NUM_METHOD;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
  private static final SubLSymbol $sym141$SENSE_PROXY_EQUAL_METHOD;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$SYNSET_PROXY_INITIALIZE_METHOD;
  private static final SubLSymbol $sym144$SENSE_PROXY_INITIALIZE_METHOD;
  private static final SubLSymbol $sym145$WORD_PROXY_INITIALIZE_METHOD;
  private static final SubLSymbol $sym146$WORDNET_PROXY_INITIALIZE_METHOD;
  private static final SubLString $str147$gloss;
  private static final SubLString $str148$adjective;
  private static final SubLString $str149$noun;
  private static final SubLString $str150$verb;
  private static final SubLString $str151$adverb;
  private static final SubLString $str152$antonym;
  private static final SubLString $str153$hypernym;
  private static final SubLString $str154$hyponym;
  private static final SubLString $str155$attribute;
  private static final SubLString $str156$also_see;
  private static final SubLString $str157$entailment;
  private static final SubLString $str158$cause;
  private static final SubLString $str159$verb_group;
  private static final SubLString $str160$member_meronym;
  private static final SubLString $str161$substance_meronym;
  private static final SubLString $str162$part_meronym;
  private static final SubLString $str163$member_holonym;
  private static final SubLString $str164$substance_holonym;
  private static final SubLString $str165$part_holonym;
  private static final SubLString $str166$similar;
  private static final SubLString $str167$participle_of;
  private static final SubLString $str168$pertainym;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 1964L)
  public static SubLObject default_initializer(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_class = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.listS( $sym1$DEF_INSTANCE_METHOD, ConsesLow.listS( $sym2$INITIALIZE, v_class, $list3 ), $list4 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2134L)
  public static SubLObject default_initializers(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject v_classes;
    final SubLObject current = v_classes = datum;
    SubLObject defs = NIL;
    SubLObject cdolist_list_var = v_classes;
    SubLObject v_class = NIL;
    v_class = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      defs = ConsesLow.cons( ConsesLow.list( $sym5$DEFAULT_INITIALIZER, v_class ), defs );
      cdolist_list_var = cdolist_list_var.rest();
      v_class = cdolist_list_var.first();
    }
    return ConsesLow.cons( $sym6$PROGN, defs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2312L)
  public static SubLObject deflink(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    link = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym8$DEFINE_PUBLIC, function, $list9, ConsesLow.list( $sym10$RET, ConsesLow.list( $sym11$FIM, $sym12$PROXY, $list13, link ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2425L)
  public static SubLObject subloop_reserved_initialize_wordnet_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym17$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2425L)
  public static SubLObject subloop_reserved_initialize_wordnet_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym19$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym20$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2425L)
  public static SubLObject wordnet_proxy_p(final SubLObject v_wordnet_proxy)
  {
    return classes.subloop_instanceof_class( v_wordnet_proxy, $sym14$WORDNET_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3117L)
  public static SubLObject wordnet_proxy_absolute_key_method(final SubLObject self)
  {
    return ConsesLow.cons( ConsesLow.list( $str24$class, methods.funcall_instance_method_with_0_args( self, $sym25$WN_CLASS ) ), methods.funcall_instance_method_with_0_args( self, $sym26$RELATIVE_KEY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3264L)
  public static SubLObject wordnet_proxy_senses_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_1_args( self, $sym30$INVOKE, $str31$getSenses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3363L)
  public static SubLObject wordnet_proxy_synsets_method(final SubLObject self)
  {
    SubLObject synsets = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym28$SENSES );
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      synsets = ConsesLow.cons( instances.get_slot( sense, $sym35$SYNSET ), synsets );
      cdolist_list_var = cdolist_list_var.rest();
      sense = cdolist_list_var.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3675L)
  public static SubLObject wordnet_proxy_links_method(final SubLObject self, final SubLObject type)
  {
    return methods.funcall_instance_method_with_2_args( self, $sym30$INVOKE, $str40$getPointerTargets, ConsesLow.list( ConsesLow.list( $str41$pointerType, type ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3810L)
  public static SubLObject wordnet_proxy_invoke_method(final SubLObject self, final SubLObject method, SubLObject params)
  {
    if( params == UNPROVIDED )
    {
      params = NIL;
    }
    return Eval.eval( external_interfaces.invoke_wordnet( ConsesLow.append( methods.funcall_instance_method_with_0_args( self, $sym22$ABSOLUTE_KEY ), ConsesLow.list( ConsesLow.list( $str45$method, method ) ), params ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject get_word_proxy_pos(final SubLObject word_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( word_proxy, TWO_INTEGER, $sym49$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject set_word_proxy_pos(final SubLObject word_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_proxy, value, TWO_INTEGER, $sym49$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject get_word_proxy_form(final SubLObject word_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( word_proxy, ONE_INTEGER, $sym50$FORM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject set_word_proxy_form(final SubLObject word_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_proxy, value, ONE_INTEGER, $sym50$FORM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject subloop_reserved_initialize_word_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym17$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject subloop_reserved_initialize_word_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym19$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym20$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$WORD_PROXY, $sym50$FORM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$WORD_PROXY, $sym49$POS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
  public static SubLObject word_proxy_p(final SubLObject word_proxy)
  {
    return classes.subloop_instanceof_class( word_proxy, $sym47$WORD_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4430L)
  public static SubLObject word_proxy_wn_class_method(final SubLObject self)
  {
    return $str54$word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4504L)
  public static SubLObject word_proxy_relative_key_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_proxy_method = NIL;
    final SubLObject pos = get_word_proxy_pos( self );
    final SubLObject form = get_word_proxy_form( self );
    try
    {
      thread.throwStack.push( $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD, ConsesLow.list( ConsesLow.list( $str58$pos, pos ), ConsesLow.list( $str59$form, form ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_proxy_pos( self, pos );
          set_word_proxy_form( self, form );
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
      catch_var_for_word_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4606L)
  public static SubLObject word_proxy_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_proxy_method = NIL;
    final SubLObject form = get_word_proxy_form( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
      try
      {
        streams_high.write_string( $str65$__WORD_PROXY_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( form, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str66$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_proxy_form( self, form );
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
      catch_var_for_word_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4801L)
  public static SubLObject word_proxy_links_method(final SubLObject self, final SubLObject type)
  {
    SubLObject res = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym28$SENSES );
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      res = ConsesLow.append( methods.funcall_instance_method_with_1_args( sense, $sym37$LINKS, type ), res );
      cdolist_list_var = cdolist_list_var.rest();
      sense = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5006L)
  public static SubLObject word_proxy_pos_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_proxy_method = NIL;
    final SubLObject pos = get_word_proxy_pos( self );
    try
    {
      thread.throwStack.push( $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD, pos );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_proxy_pos( self, pos );
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
      catch_var_for_word_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5069L)
  public static SubLObject word_proxy_form_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_proxy_method = NIL;
    final SubLObject form = get_word_proxy_form( self );
    try
    {
      thread.throwStack.push( $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD, form );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_proxy_form( self, form );
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
      catch_var_for_word_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5134L)
  public static SubLObject word_proxy_equal_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_proxy_method = NIL;
    final SubLObject pos = get_word_proxy_pos( self );
    final SubLObject form = get_word_proxy_form( self );
    try
    {
      thread.throwStack.push( $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD, makeBoolean( NIL != word_proxy_p( v_object ) && form.equal( methods.funcall_instance_method_with_0_args( v_object, $sym50$FORM ) ) && pos.equal(
            methods.funcall_instance_method_with_0_args( v_object, $sym49$POS ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_proxy_pos( self, pos );
          set_word_proxy_form( self, form );
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
      catch_var_for_word_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject get_synset_proxy_gloss(final SubLObject synset_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( synset_proxy, THREE_INTEGER, $sym83$GLOSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject set_synset_proxy_gloss(final SubLObject synset_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( synset_proxy, value, THREE_INTEGER, $sym83$GLOSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject get_synset_proxy_offset(final SubLObject synset_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( synset_proxy, TWO_INTEGER, $sym84$OFFSET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject set_synset_proxy_offset(final SubLObject synset_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( synset_proxy, value, TWO_INTEGER, $sym84$OFFSET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject get_synset_proxy_pos(final SubLObject synset_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( synset_proxy, ONE_INTEGER, $sym49$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject set_synset_proxy_pos(final SubLObject synset_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( synset_proxy, value, ONE_INTEGER, $sym49$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject subloop_reserved_initialize_synset_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym17$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject subloop_reserved_initialize_synset_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym19$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym20$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym81$SYNSET_PROXY, $sym49$POS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym81$SYNSET_PROXY, $sym84$OFFSET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym81$SYNSET_PROXY, $sym83$GLOSS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
  public static SubLObject synset_proxy_p(final SubLObject synset_proxy)
  {
    return classes.subloop_instanceof_class( synset_proxy, $sym81$SYNSET_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5760L)
  public static SubLObject synset_proxy_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_synset_proxy_method = NIL;
    final SubLObject offset = get_synset_proxy_offset( self );
    final SubLObject pos = get_synset_proxy_pos( self );
    try
    {
      thread.throwStack.push( $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
      try
      {
        streams_high.write_string( $str89$__SYNSET_PROXY_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( pos, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str90$_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( offset, stream );
        streams_high.write_string( $str66$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_synset_proxy_offset( self, offset );
          set_synset_proxy_pos( self, pos );
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
      catch_var_for_synset_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_synset_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6010L)
  public static SubLObject synset_proxy_wn_class_method(final SubLObject self)
  {
    return $str93$synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6088L)
  public static SubLObject synset_proxy_relative_key_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_synset_proxy_method = NIL;
    final SubLObject offset = get_synset_proxy_offset( self );
    final SubLObject pos = get_synset_proxy_pos( self );
    try
    {
      thread.throwStack.push( $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, ConsesLow.list( ConsesLow.list( $str58$pos, pos ), ConsesLow.list( $str97$offset, offset ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_synset_proxy_offset( self, offset );
          set_synset_proxy_pos( self, pos );
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
      catch_var_for_synset_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_synset_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6196L)
  public static SubLObject synset_proxy_pos_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_synset_proxy_method = NIL;
    final SubLObject pos = get_synset_proxy_pos( self );
    try
    {
      thread.throwStack.push( $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, pos );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_synset_proxy_pos( self, pos );
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
      catch_var_for_synset_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_synset_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6261L)
  public static SubLObject synset_proxy_offset_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_synset_proxy_method = NIL;
    final SubLObject offset = get_synset_proxy_offset( self );
    try
    {
      thread.throwStack.push( $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, offset );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_synset_proxy_offset( self, offset );
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
      catch_var_for_synset_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_synset_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6332L)
  public static SubLObject synset_proxy_gloss_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_synset_proxy_method = NIL;
    final SubLObject gloss = get_synset_proxy_gloss( self );
    try
    {
      thread.throwStack.push( $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, gloss );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_synset_proxy_gloss( self, gloss );
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
      catch_var_for_synset_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_synset_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6401L)
  public static SubLObject synset_proxy_equal_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_synset_proxy_method = NIL;
    final SubLObject offset = get_synset_proxy_offset( self );
    final SubLObject pos = get_synset_proxy_pos( self );
    try
    {
      thread.throwStack.push( $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, makeBoolean( NIL != synset_proxy_p( v_object ) && offset.numE( methods.funcall_instance_method_with_0_args( v_object, $sym84$OFFSET ) ) && pos
            .equal( methods.funcall_instance_method_with_0_args( v_object, $sym49$POS ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_synset_proxy_offset( self, offset );
          set_synset_proxy_pos( self, pos );
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
      catch_var_for_synset_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_synset_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject get_sense_proxy_form(final SubLObject sense_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( sense_proxy, TWO_INTEGER, $sym50$FORM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject set_sense_proxy_form(final SubLObject sense_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sense_proxy, value, TWO_INTEGER, $sym50$FORM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject get_sense_proxy_synset(final SubLObject sense_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( sense_proxy, ONE_INTEGER, $sym35$SYNSET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject set_sense_proxy_synset(final SubLObject sense_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( sense_proxy, value, ONE_INTEGER, $sym35$SYNSET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject subloop_reserved_initialize_sense_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym17$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject subloop_reserved_initialize_sense_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym19$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym20$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym110$SENSE_PROXY, $sym35$SYNSET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym110$SENSE_PROXY, $sym50$FORM, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
  public static SubLObject sense_proxy_p(final SubLObject sense_proxy)
  {
    return classes.subloop_instanceof_class( sense_proxy, $sym110$SENSE_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7095L)
  public static SubLObject sense_proxy_equal(final SubLObject sense1, final SubLObject sense2)
  {
    assert NIL != sense_proxy_p( sense1 ) : sense1;
    return methods.funcall_instance_method_with_1_args( sense1, EQUAL, sense2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7346L)
  public static SubLObject sense_proxy_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sense_proxy_method = NIL;
    final SubLObject form = get_sense_proxy_form( self );
    final SubLObject synset = get_sense_proxy_synset( self );
    try
    {
      thread.throwStack.push( $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
      try
      {
        streams_high.write_string( $str117$__SENSE_PROXY_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( methods.funcall_instance_method_with_0_args( self, $sym50$FORM ), stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str90$_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( synset, stream );
        streams_high.write_string( $str66$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sense_proxy_form( self, form );
          set_sense_proxy_synset( self, synset );
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
      catch_var_for_sense_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sense_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7607L)
  public static SubLObject sense_proxy_wn_class_method(final SubLObject self)
  {
    return $str120$sense;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7683L)
  public static SubLObject sense_proxy_relative_key_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sense_proxy_method = NIL;
    final SubLObject form = get_sense_proxy_form( self );
    final SubLObject synset = get_sense_proxy_synset( self );
    try
    {
      thread.throwStack.push( $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, ConsesLow.cons( ConsesLow.list( $str59$form, form ), methods.funcall_instance_method_with_0_args( synset, $sym26$RELATIVE_KEY ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sense_proxy_form( self, form );
          set_sense_proxy_synset( self, synset );
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
      catch_var_for_sense_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sense_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7812L)
  public static SubLObject sense_proxy_senses_method(final SubLObject self)
  {
    return ConsesLow.list( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7890L)
  public static SubLObject sense_proxy_form_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sense_proxy_method = NIL;
    final SubLObject form = get_sense_proxy_form( self );
    try
    {
      thread.throwStack.push( $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, form );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sense_proxy_form( self, form );
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
      catch_var_for_sense_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sense_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7956L)
  public static SubLObject sense_proxy_pos_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sense_proxy_method = NIL;
    final SubLObject synset = get_sense_proxy_synset( self );
    try
    {
      thread.throwStack.push( $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, methods.funcall_instance_method_with_0_args( synset, $sym49$POS ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sense_proxy_synset( self, synset );
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
      catch_var_for_sense_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sense_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8034L)
  public static SubLObject sense_proxy_word_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sense_proxy_method = NIL;
    final SubLObject form = get_sense_proxy_form( self );
    try
    {
      thread.throwStack.push( $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, new_word_proxy( form, methods.funcall_instance_method_with_0_args( self, $sym49$POS ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sense_proxy_form( self, form );
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
      catch_var_for_sense_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sense_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8133L)
  public static SubLObject sense_proxy_num_method(final SubLObject self)
  {
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( self, $sym132$WORD ), $sym28$SENSES );
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      i = Numbers.add( i, ONE_INTEGER );
      if( NIL != methods.funcall_instance_method_with_1_args( self, EQUAL, sense ) )
      {
        return i;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8316L)
  public static SubLObject sense_proxy_equal_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sense_proxy_method = NIL;
    final SubLObject synset = get_sense_proxy_synset( self );
    try
    {
      thread.throwStack.push( $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, makeBoolean( NIL != sense_proxy_p( v_object ) && NIL != methods.funcall_instance_method_with_1_args( synset, EQUAL, methods
            .funcall_instance_method_with_0_args( v_object, $sym33$SYNSETS ).first() ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_sense_proxy_synset( self, synset );
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
      catch_var_for_sense_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sense_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
  public static SubLObject synset_proxy_initialize_method(final SubLObject self)
  {
    wordnet_proxy_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
  public static SubLObject sense_proxy_initialize_method(final SubLObject self)
  {
    wordnet_proxy_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
  public static SubLObject word_proxy_initialize_method(final SubLObject self)
  {
    wordnet_proxy_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
  public static SubLObject wordnet_proxy_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8583L)
  public static SubLObject new_word_proxy(final SubLObject form, final SubLObject pos)
  {
    final SubLObject proxy = object.new_class_instance( $sym47$WORD_PROXY );
    set_word_proxy_form( proxy, form );
    set_word_proxy_pos( proxy, pos );
    return proxy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8827L)
  public static SubLObject new_sense_proxy(final SubLObject synset, final SubLObject form)
  {
    final SubLObject proxy = object.new_class_instance( $sym110$SENSE_PROXY );
    set_sense_proxy_synset( proxy, synset );
    set_sense_proxy_form( proxy, form );
    return proxy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9026L)
  public static SubLObject new_synset_proxy(final SubLObject pos, final SubLObject offset, SubLObject gloss)
  {
    if( gloss == UNPROVIDED )
    {
      gloss = NIL;
    }
    final SubLObject proxy = object.new_class_instance( $sym81$SYNSET_PROXY );
    set_synset_proxy_pos( proxy, pos );
    set_synset_proxy_offset( proxy, offset );
    if( NIL == gloss )
    {
      gloss = methods.funcall_instance_method_with_1_args( proxy, $sym30$INVOKE, $str147$gloss );
    }
    set_synset_proxy_gloss( proxy, gloss );
    return proxy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9351L)
  public static SubLObject new_synset(final SubLObject pos, final SubLObject offset)
  {
    return new_synset_proxy( pos, offset, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9431L)
  public static SubLObject new_adjective(final SubLObject form)
  {
    return new_word_proxy( form, $str148$adjective );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9511L)
  public static SubLObject new_noun(final SubLObject form)
  {
    return new_word_proxy( form, $str149$noun );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9581L)
  public static SubLObject new_verb(final SubLObject form)
  {
    return new_word_proxy( form, $str150$verb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9651L)
  public static SubLObject new_adverb(final SubLObject form)
  {
    return new_word_proxy( form, $str151$adverb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9725L)
  public static SubLObject antonyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str152$antonym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9755L)
  public static SubLObject hypernyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str153$hypernym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9786L)
  public static SubLObject hyponyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str154$hyponym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9815L)
  public static SubLObject attributes(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str155$attribute );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9848L)
  public static SubLObject also_see(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str156$also_see );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9878L)
  public static SubLObject entailments(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str157$entailment );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9914L)
  public static SubLObject causes(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str158$cause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9940L)
  public static SubLObject verb_groups(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str159$verb_group );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9976L)
  public static SubLObject member_meronyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str160$member_meronym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10020L)
  public static SubLObject substance_meronyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str161$substance_meronym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10070L)
  public static SubLObject part_meronyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str162$part_meronym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10110L)
  public static SubLObject member_holonyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str163$member_holonym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10154L)
  public static SubLObject substance_holonyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str164$substance_holonym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10204L)
  public static SubLObject part_holonyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str165$part_holonym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10244L)
  public static SubLObject similar(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str166$similar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10273L)
  public static SubLObject participle_of(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str167$participle_of );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10314L)
  public static SubLObject pertainyms(final SubLObject proxy)
  {
    return methods.funcall_instance_method_with_1_args( proxy, $sym37$LINKS, $str168$pertainym );
  }

  public static SubLObject declare_wordnet_proxy_file()
  {
    SubLFiles.declareMacro( me, "default_initializer", "DEFAULT-INITIALIZER" );
    SubLFiles.declareMacro( me, "default_initializers", "DEFAULT-INITIALIZERS" );
    SubLFiles.declareMacro( me, "deflink", "DEFLINK" );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wordnet_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wordnet_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_p", "WORDNET-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_absolute_key_method", "WORDNET-PROXY-ABSOLUTE-KEY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_senses_method", "WORDNET-PROXY-SENSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_synsets_method", "WORDNET-PROXY-SYNSETS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_links_method", "WORDNET-PROXY-LINKS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_invoke_method", "WORDNET-PROXY-INVOKE-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "get_word_proxy_pos", "GET-WORD-PROXY-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_proxy_pos", "SET-WORD-PROXY-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_proxy_form", "GET-WORD-PROXY-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_proxy_form", "SET-WORD-PROXY-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_p", "WORD-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_wn_class_method", "WORD-PROXY-WN-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_relative_key_method", "WORD-PROXY-RELATIVE-KEY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_print_method", "WORD-PROXY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_links_method", "WORD-PROXY-LINKS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_pos_method", "WORD-PROXY-POS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_form_method", "WORD-PROXY-FORM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_equal_method", "WORD-PROXY-EQUAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_synset_proxy_gloss", "GET-SYNSET-PROXY-GLOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_synset_proxy_gloss", "SET-SYNSET-PROXY-GLOSS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_synset_proxy_offset", "GET-SYNSET-PROXY-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "set_synset_proxy_offset", "SET-SYNSET-PROXY-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_synset_proxy_pos", "GET-SYNSET-PROXY-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_synset_proxy_pos", "SET-SYNSET-PROXY-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_synset_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_synset_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_p", "SYNSET-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_print_method", "SYNSET-PROXY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_wn_class_method", "SYNSET-PROXY-WN-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_relative_key_method", "SYNSET-PROXY-RELATIVE-KEY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_pos_method", "SYNSET-PROXY-POS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_offset_method", "SYNSET-PROXY-OFFSET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_gloss_method", "SYNSET-PROXY-GLOSS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_equal_method", "SYNSET-PROXY-EQUAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sense_proxy_form", "GET-SENSE-PROXY-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sense_proxy_form", "SET-SENSE-PROXY-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sense_proxy_synset", "GET-SENSE-PROXY-SYNSET", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sense_proxy_synset", "SET-SENSE-PROXY-SYNSET", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sense_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sense_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_p", "SENSE-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_equal", "SENSE-PROXY-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_print_method", "SENSE-PROXY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_wn_class_method", "SENSE-PROXY-WN-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_relative_key_method", "SENSE-PROXY-RELATIVE-KEY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_senses_method", "SENSE-PROXY-SENSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_form_method", "SENSE-PROXY-FORM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_pos_method", "SENSE-PROXY-POS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_word_method", "SENSE-PROXY-WORD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_num_method", "SENSE-PROXY-NUM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_equal_method", "SENSE-PROXY-EQUAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "synset_proxy_initialize_method", "SYNSET-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_proxy_initialize_method", "SENSE-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_proxy_initialize_method", "WORD-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_proxy_initialize_method", "WORDNET-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_word_proxy", "NEW-WORD-PROXY", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sense_proxy", "NEW-SENSE-PROXY", 2, 0, false );
    SubLFiles.declareFunction( me, "new_synset_proxy", "NEW-SYNSET-PROXY", 2, 1, false );
    SubLFiles.declareFunction( me, "new_synset", "NEW-SYNSET", 2, 0, false );
    SubLFiles.declareFunction( me, "new_adjective", "NEW-ADJECTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_noun", "NEW-NOUN", 1, 0, false );
    SubLFiles.declareFunction( me, "new_verb", "NEW-VERB", 1, 0, false );
    SubLFiles.declareFunction( me, "new_adverb", "NEW-ADVERB", 1, 0, false );
    SubLFiles.declareFunction( me, "antonyms", "ANTONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "hypernyms", "HYPERNYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "hyponyms", "HYPONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "attributes", "ATTRIBUTES", 1, 0, false );
    SubLFiles.declareFunction( me, "also_see", "ALSO-SEE", 1, 0, false );
    SubLFiles.declareFunction( me, "entailments", "ENTAILMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "causes", "CAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "verb_groups", "VERB-GROUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "member_meronyms", "MEMBER-MERONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "substance_meronyms", "SUBSTANCE-MERONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "part_meronyms", "PART-MERONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "member_holonyms", "MEMBER-HOLONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "substance_holonyms", "SUBSTANCE-HOLONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "part_holonyms", "PART-HOLONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "similar", "SIMILAR", 1, 0, false );
    SubLFiles.declareFunction( me, "participle_of", "PARTICIPLE-OF", 1, 0, false );
    SubLFiles.declareFunction( me, "pertainyms", "PERTAINYMS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_wordnet_proxy_file()
  {
    return NIL;
  }

  public static SubLObject setup_wordnet_proxy_file()
  {
    classes.subloop_new_class( $sym14$WORDNET_PROXY, $sym15$OBJECT, NIL, T, $list16 );
    classes.class_set_implements_slot_listeners( $sym14$WORDNET_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym14$WORDNET_PROXY, $sym18$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym14$WORDNET_PROXY, $sym21$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_INSTANCE );
    subloop_reserved_initialize_wordnet_proxy_class( $sym14$WORDNET_PROXY );
    methods.methods_incorporate_instance_method( $sym22$ABSOLUTE_KEY, $sym14$WORDNET_PROXY, $list3, NIL, $list23 );
    methods.subloop_register_instance_method( $sym14$WORDNET_PROXY, $sym22$ABSOLUTE_KEY, $sym27$WORDNET_PROXY_ABSOLUTE_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym28$SENSES, $sym14$WORDNET_PROXY, $list3, NIL, $list29 );
    methods.subloop_register_instance_method( $sym14$WORDNET_PROXY, $sym28$SENSES, $sym32$WORDNET_PROXY_SENSES_METHOD );
    methods.methods_incorporate_instance_method( $sym33$SYNSETS, $sym14$WORDNET_PROXY, $list3, NIL, $list34 );
    methods.subloop_register_instance_method( $sym14$WORDNET_PROXY, $sym33$SYNSETS, $sym36$WORDNET_PROXY_SYNSETS_METHOD );
    methods.methods_incorporate_instance_method( $sym37$LINKS, $sym14$WORDNET_PROXY, $list3, $list38, $list39 );
    methods.subloop_register_instance_method( $sym14$WORDNET_PROXY, $sym37$LINKS, $sym42$WORDNET_PROXY_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym30$INVOKE, $sym14$WORDNET_PROXY, $list3, $list43, $list44 );
    methods.subloop_register_instance_method( $sym14$WORDNET_PROXY, $sym30$INVOKE, $sym46$WORDNET_PROXY_INVOKE_METHOD );
    classes.subloop_new_class( $sym47$WORD_PROXY, $sym14$WORDNET_PROXY, NIL, NIL, $list48 );
    classes.class_set_implements_slot_listeners( $sym47$WORD_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym47$WORD_PROXY, $sym51$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym47$WORD_PROXY, $sym52$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_INSTANCE );
    subloop_reserved_initialize_word_proxy_class( $sym47$WORD_PROXY );
    methods.methods_incorporate_instance_method( $sym25$WN_CLASS, $sym47$WORD_PROXY, $list3, NIL, $list53 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym25$WN_CLASS, $sym55$WORD_PROXY_WN_CLASS_METHOD );
    methods.methods_incorporate_instance_method( $sym26$RELATIVE_KEY, $sym47$WORD_PROXY, $list3, NIL, $list56 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym26$RELATIVE_KEY, $sym60$WORD_PROXY_RELATIVE_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym61$PRINT, $sym47$WORD_PROXY, $list3, $list62, $list63 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym61$PRINT, $sym67$WORD_PROXY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym37$LINKS, $sym47$WORD_PROXY, $list3, $list38, $list68 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym37$LINKS, $sym69$WORD_PROXY_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym49$POS, $sym47$WORD_PROXY, $list70, NIL, $list71 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym49$POS, $sym73$WORD_PROXY_POS_METHOD );
    methods.methods_incorporate_instance_method( $sym50$FORM, $sym47$WORD_PROXY, $list70, NIL, $list74 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym50$FORM, $sym76$WORD_PROXY_FORM_METHOD );
    methods.methods_incorporate_instance_method( EQUAL, $sym47$WORD_PROXY, $list70, $list77, $list78 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, EQUAL, $sym80$WORD_PROXY_EQUAL_METHOD );
    classes.subloop_new_class( $sym81$SYNSET_PROXY, $sym14$WORDNET_PROXY, NIL, NIL, $list82 );
    classes.class_set_implements_slot_listeners( $sym81$SYNSET_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym81$SYNSET_PROXY, $sym85$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym81$SYNSET_PROXY, $sym86$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_INSTANCE );
    subloop_reserved_initialize_synset_proxy_class( $sym81$SYNSET_PROXY );
    methods.methods_incorporate_instance_method( $sym61$PRINT, $sym81$SYNSET_PROXY, $list3, $list62, $list87 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym61$PRINT, $sym91$SYNSET_PROXY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym25$WN_CLASS, $sym81$SYNSET_PROXY, $list3, NIL, $list92 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym25$WN_CLASS, $sym94$SYNSET_PROXY_WN_CLASS_METHOD );
    methods.methods_incorporate_instance_method( $sym26$RELATIVE_KEY, $sym81$SYNSET_PROXY, $list3, NIL, $list95 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym26$RELATIVE_KEY, $sym98$SYNSET_PROXY_RELATIVE_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym49$POS, $sym81$SYNSET_PROXY, $list70, NIL, $list71 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym49$POS, $sym100$SYNSET_PROXY_POS_METHOD );
    methods.methods_incorporate_instance_method( $sym84$OFFSET, $sym81$SYNSET_PROXY, $list70, NIL, $list101 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym84$OFFSET, $sym103$SYNSET_PROXY_OFFSET_METHOD );
    methods.methods_incorporate_instance_method( $sym83$GLOSS, $sym81$SYNSET_PROXY, $list70, NIL, $list104 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym83$GLOSS, $sym106$SYNSET_PROXY_GLOSS_METHOD );
    methods.methods_incorporate_instance_method( EQUAL, $sym81$SYNSET_PROXY, $list70, $list77, $list107 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, EQUAL, $sym109$SYNSET_PROXY_EQUAL_METHOD );
    classes.subloop_new_class( $sym110$SENSE_PROXY, $sym14$WORDNET_PROXY, NIL, NIL, $list111 );
    classes.class_set_implements_slot_listeners( $sym110$SENSE_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym110$SENSE_PROXY, $sym112$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym110$SENSE_PROXY, $sym113$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_INSTANCE );
    subloop_reserved_initialize_sense_proxy_class( $sym110$SENSE_PROXY );
    methods.methods_incorporate_instance_method( $sym61$PRINT, $sym110$SENSE_PROXY, $list3, $list62, $list115 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym61$PRINT, $sym118$SENSE_PROXY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym25$WN_CLASS, $sym110$SENSE_PROXY, $list3, NIL, $list119 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym25$WN_CLASS, $sym121$SENSE_PROXY_WN_CLASS_METHOD );
    methods.methods_incorporate_instance_method( $sym26$RELATIVE_KEY, $sym110$SENSE_PROXY, $list3, NIL, $list122 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym26$RELATIVE_KEY, $sym124$SENSE_PROXY_RELATIVE_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym28$SENSES, $sym110$SENSE_PROXY, $list3, NIL, $list125 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym28$SENSES, $sym126$SENSE_PROXY_SENSES_METHOD );
    methods.methods_incorporate_instance_method( $sym50$FORM, $sym110$SENSE_PROXY, $list70, NIL, $list74 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym50$FORM, $sym128$SENSE_PROXY_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym49$POS, $sym110$SENSE_PROXY, $list70, NIL, $list129 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym49$POS, $sym131$SENSE_PROXY_POS_METHOD );
    methods.methods_incorporate_instance_method( $sym132$WORD, $sym110$SENSE_PROXY, $list70, NIL, $list133 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym132$WORD, $sym135$SENSE_PROXY_WORD_METHOD );
    methods.methods_incorporate_instance_method( $sym136$NUM, $sym110$SENSE_PROXY, $list70, NIL, $list137 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym136$NUM, $sym138$SENSE_PROXY_NUM_METHOD );
    methods.methods_incorporate_instance_method( EQUAL, $sym110$SENSE_PROXY, $list70, $list77, $list139 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, EQUAL, $sym141$SENSE_PROXY_EQUAL_METHOD );
    methods.methods_incorporate_instance_method( $sym2$INITIALIZE, $sym81$SYNSET_PROXY, $list3, NIL, $list142 );
    methods.subloop_register_instance_method( $sym81$SYNSET_PROXY, $sym2$INITIALIZE, $sym143$SYNSET_PROXY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym2$INITIALIZE, $sym110$SENSE_PROXY, $list3, NIL, $list142 );
    methods.subloop_register_instance_method( $sym110$SENSE_PROXY, $sym2$INITIALIZE, $sym144$SENSE_PROXY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym2$INITIALIZE, $sym47$WORD_PROXY, $list3, NIL, $list142 );
    methods.subloop_register_instance_method( $sym47$WORD_PROXY, $sym2$INITIALIZE, $sym145$WORD_PROXY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym2$INITIALIZE, $sym14$WORDNET_PROXY, $list3, NIL, $list142 );
    methods.subloop_register_instance_method( $sym14$WORDNET_PROXY, $sym2$INITIALIZE, $sym146$WORDNET_PROXY_INITIALIZE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wordnet_proxy_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wordnet_proxy_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wordnet_proxy_file();
  }
  static
  {
    me = new wordnet_proxy();
    $list0 = ConsesLow.list( makeSymbol( "CLASS" ) );
    $sym1$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $sym2$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list3 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list4 = ConsesLow.list( NIL, ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym5$DEFAULT_INITIALIZER = makeSymbol( "DEFAULT-INITIALIZER" );
    $sym6$PROGN = makeSymbol( "PROGN" );
    $list7 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "LINK" ) );
    $sym8$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $list9 = ConsesLow.list( makeSymbol( "PROXY" ) );
    $sym10$RET = makeSymbol( "RET" );
    $sym11$FIM = makeSymbol( "FIM" );
    $sym12$PROXY = makeSymbol( "PROXY" );
    $list13 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LINKS" ) );
    $sym14$WORDNET_PROXY = makeSymbol( "WORDNET-PROXY" );
    $sym15$OBJECT = makeSymbol( "OBJECT" );
    $list16 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "RELATIVE-KEY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ABSOLUTE-KEY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "WN-CLASS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LINKS" ), ConsesLow.list( makeSymbol( "TYPE" ) ),
                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INVOKE" ), ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PARAMS" ) ),
                    makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SENSES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "SYNSETS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym17$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym18$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-CLASS" );
    $sym19$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym20$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym21$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-INSTANCE" );
    $sym22$ABSOLUTE_KEY = makeSymbol( "ABSOLUTE-KEY" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "class" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WN-CLASS" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "RELATIVE-KEY" ) ) ) ) ) );
    $str24$class = makeString( "class" );
    $sym25$WN_CLASS = makeSymbol( "WN-CLASS" );
    $sym26$RELATIVE_KEY = makeSymbol( "RELATIVE-KEY" );
    $sym27$WORDNET_PROXY_ABSOLUTE_KEY_METHOD = makeSymbol( "WORDNET-PROXY-ABSOLUTE-KEY-METHOD" );
    $sym28$SENSES = makeSymbol( "SENSES" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVOKE" ) ), makeString(
        "getSenses" ) ) ) );
    $sym30$INVOKE = makeSymbol( "INVOKE" );
    $str31$getSenses = makeString( "getSenses" );
    $sym32$WORDNET_PROXY_SENSES_METHOD = makeSymbol( "WORDNET-PROXY-SENSES-METHOD" );
    $sym33$SYNSETS = makeSymbol( "SYNSETS" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SYNSETS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SENSE" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SENSES" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
            makeSymbol( "SENSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SYNSET" ) ) ), makeSymbol( "SYNSETS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SYNSETS" ) ) ) );
    $sym35$SYNSET = makeSymbol( "SYNSET" );
    $sym36$WORDNET_PROXY_SYNSETS_METHOD = makeSymbol( "WORDNET-PROXY-SYNSETS-METHOD" );
    $sym37$LINKS = makeSymbol( "LINKS" );
    $list38 = ConsesLow.list( makeSymbol( "TYPE" ) );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INVOKE" ) ), makeString(
        "getPointerTargets" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "pointerType" ), makeSymbol( "TYPE" ) ) ) ) ) );
    $str40$getPointerTargets = makeString( "getPointerTargets" );
    $str41$pointerType = makeString( "pointerType" );
    $sym42$WORDNET_PROXY_LINKS_METHOD = makeSymbol( "WORDNET-PROXY-LINKS-METHOD" );
    $list43 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PARAMS" ) );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "EVAL" ), ConsesLow.list( makeSymbol( "INVOKE-WORDNET" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ABSOLUTE-KEY" ) ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "method" ),
            makeSymbol( "METHOD" ) ) ), makeSymbol( "PARAMS" ) ) ) ) ) );
    $str45$method = makeString( "method" );
    $sym46$WORDNET_PROXY_INVOKE_METHOD = makeSymbol( "WORDNET-PROXY-INVOKE-METHOD" );
    $sym47$WORD_PROXY = makeSymbol( "WORD-PROXY" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "POS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RELATIVE-KEY" ), NIL,
            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "POS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FORM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    EQUAL, ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym49$POS = makeSymbol( "POS" );
    $sym50$FORM = makeSymbol( "FORM" );
    $sym51$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-CLASS" );
    $sym52$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-INSTANCE" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeString( "word" ) ) );
    $str54$word = makeString( "word" );
    $sym55$WORD_PROXY_WN_CLASS_METHOD = makeSymbol( "WORD-PROXY-WN-CLASS-METHOD" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "pos" ), makeSymbol( "POS" ) ), ConsesLow.list( makeSymbol(
        "BQ-LIST" ), makeString( "form" ), makeSymbol( "FORM" ) ) ) ) );
    $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-PROXY-METHOD" );
    $str58$pos = makeString( "pos" );
    $str59$form = makeString( "form" );
    $sym60$WORD_PROXY_RELATIVE_KEY_METHOD = makeSymbol( "WORD-PROXY-RELATIVE-KEY-METHOD" );
    $sym61$PRINT = makeSymbol( "PRINT" );
    $list62 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<WORD-PROXY " ), makeSymbol( "STREAM" ) ), ConsesLow.list(
        makeSymbol( "WRITE-STRING" ), makeSymbol( "FORM" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-PROXY-METHOD" );
    $str65$__WORD_PROXY_ = makeString( "#<WORD-PROXY " );
    $str66$_ = makeString( ">" );
    $sym67$WORD_PROXY_PRINT_METHOD = makeSymbol( "WORD-PROXY-PRINT-METHOD" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SENSE" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SENSES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), makeSymbol( "RES" ), ConsesLow.list( makeSymbol(
            "APPEND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SENSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LINKS" ) ), makeSymbol( "TYPE" ) ), makeSymbol( "RES" ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), makeSymbol( "RES" ) ) ) );
    $sym69$WORD_PROXY_LINKS_METHOD = makeSymbol( "WORD-PROXY-LINKS-METHOD" );
    $list70 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "POS" ) ) );
    $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-PROXY-METHOD" );
    $sym73$WORD_PROXY_POS_METHOD = makeSymbol( "WORD-PROXY-POS-METHOD" );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FORM" ) ) );
    $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-PROXY-METHOD" );
    $sym76$WORD_PROXY_FORM_METHOD = makeSymbol( "WORD-PROXY-FORM-METHOD" );
    $list77 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WORD-PROXY-P" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( EQUAL, makeSymbol(
        "FORM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORM" ) ) ) ), ConsesLow.list( EQUAL, makeSymbol( "POS" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS" ) ) ) ) ) ) );
    $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-PROXY-METHOD" );
    $sym80$WORD_PROXY_EQUAL_METHOD = makeSymbol( "WORD-PROXY-EQUAL-METHOD" );
    $sym81$SYNSET_PROXY = makeSymbol( "SYNSET-PROXY" );
    $list82 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "POS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "OFFSET" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "GLOSS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL,
            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RELATIVE-KEY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "POS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OFFSET" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GLOSS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), EQUAL, ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword(
                        "PUBLIC" ) )
    } );
    $sym83$GLOSS = makeSymbol( "GLOSS" );
    $sym84$OFFSET = makeSymbol( "OFFSET" );
    $sym85$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-CLASS" );
    $sym86$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-INSTANCE" );
    $list87 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<SYNSET-PROXY " ), makeSymbol( "STREAM" ) ), ConsesLow.list(
        makeSymbol( "WRITE-STRING" ), makeSymbol( "POS" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( " " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ),
            makeSymbol( "OFFSET" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SYNSET-PROXY-METHOD" );
    $str89$__SYNSET_PROXY_ = makeString( "#<SYNSET-PROXY " );
    $str90$_ = makeString( " " );
    $sym91$SYNSET_PROXY_PRINT_METHOD = makeSymbol( "SYNSET-PROXY-PRINT-METHOD" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeString( "synset" ) ) );
    $str93$synset = makeString( "synset" );
    $sym94$SYNSET_PROXY_WN_CLASS_METHOD = makeSymbol( "SYNSET-PROXY-WN-CLASS-METHOD" );
    $list95 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "pos" ), makeSymbol( "POS" ) ), ConsesLow.list( makeSymbol(
        "BQ-LIST" ), makeString( "offset" ), makeSymbol( "OFFSET" ) ) ) ) );
    $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SYNSET-PROXY-METHOD" );
    $str97$offset = makeString( "offset" );
    $sym98$SYNSET_PROXY_RELATIVE_KEY_METHOD = makeSymbol( "SYNSET-PROXY-RELATIVE-KEY-METHOD" );
    $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SYNSET-PROXY-METHOD" );
    $sym100$SYNSET_PROXY_POS_METHOD = makeSymbol( "SYNSET-PROXY-POS-METHOD" );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OFFSET" ) ) );
    $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SYNSET-PROXY-METHOD" );
    $sym103$SYNSET_PROXY_OFFSET_METHOD = makeSymbol( "SYNSET-PROXY-OFFSET-METHOD" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GLOSS" ) ) );
    $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SYNSET-PROXY-METHOD" );
    $sym106$SYNSET_PROXY_GLOSS_METHOD = makeSymbol( "SYNSET-PROXY-GLOSS-METHOD" );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SYNSET-PROXY-P" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "=" ),
        makeSymbol( "OFFSET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OFFSET" ) ) ) ), ConsesLow.list( EQUAL, makeSymbol( "POS" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS" ) ) ) ) ) ) );
    $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SYNSET-PROXY-METHOD" );
    $sym109$SYNSET_PROXY_EQUAL_METHOD = makeSymbol( "SYNSET-PROXY-EQUAL-METHOD" );
    $sym110$SENSE_PROXY = makeSymbol( "SENSE-PROXY" );
    $list111 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SYNSET" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "FORM" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "RELATIVE-KEY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FORM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "POS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ),
                    makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "WORD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "NUM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), EQUAL, ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword(
                            "PUBLIC" ) )
    } );
    $sym112$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-CLASS" );
    $sym113$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-INSTANCE" );
    $sym114$SENSE_PROXY_P = makeSymbol( "SENSE-PROXY-P" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<SENSE-PROXY " ), makeSymbol( "STREAM" ) ), ConsesLow.list(
        makeSymbol( "WRITE-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORM" ) ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
            "WRITE-STRING" ), makeString( " " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "SYNSET" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
                makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENSE-PROXY-METHOD" );
    $str117$__SENSE_PROXY_ = makeString( "#<SENSE-PROXY " );
    $sym118$SENSE_PROXY_PRINT_METHOD = makeSymbol( "SENSE-PROXY-PRINT-METHOD" );
    $list119 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeString( "sense" ) ) );
    $str120$sense = makeString( "sense" );
    $sym121$SENSE_PROXY_WN_CLASS_METHOD = makeSymbol( "SENSE-PROXY-WN-CLASS-METHOD" );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "form" ), makeSymbol( "FORM" ) ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SYNSET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELATIVE-KEY" ) ) ) ) ) );
    $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENSE-PROXY-METHOD" );
    $sym124$SENSE_PROXY_RELATIVE_KEY_METHOD = makeSymbol( "SENSE-PROXY-RELATIVE-KEY-METHOD" );
    $list125 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) );
    $sym126$SENSE_PROXY_SENSES_METHOD = makeSymbol( "SENSE-PROXY-SENSES-METHOD" );
    $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENSE-PROXY-METHOD" );
    $sym128$SENSE_PROXY_FORM_METHOD = makeSymbol( "SENSE-PROXY-FORM-METHOD" );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SYNSET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS" ) ) ) ) );
    $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENSE-PROXY-METHOD" );
    $sym131$SENSE_PROXY_POS_METHOD = makeSymbol( "SENSE-PROXY-POS-METHOD" );
    $sym132$WORD = makeSymbol( "WORD" );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NEW-WORD-PROXY" ), makeSymbol( "FORM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "POS" ) ) ) ) ) );
    $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENSE-PROXY-METHOD" );
    $sym135$SENSE_PROXY_WORD_METHOD = makeSymbol( "SENSE-PROXY-WORD-METHOD" );
    $sym136$NUM = makeSymbol( "NUM" );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "I" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SENSE" ),
        ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WORD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "SENSES" ) ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), EQUAL ), makeSymbol( "SENSE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "I" ) ) ) ) ) );
    $sym138$SENSE_PROXY_NUM_METHOD = makeSymbol( "SENSE-PROXY-NUM-METHOD" );
    $list139 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SENSE-PROXY-P" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SYNSET" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "SYNSETS" ) ) ) ) ) ) ) );
    $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENSE-PROXY-METHOD" );
    $sym141$SENSE_PROXY_EQUAL_METHOD = makeSymbol( "SENSE-PROXY-EQUAL-METHOD" );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym143$SYNSET_PROXY_INITIALIZE_METHOD = makeSymbol( "SYNSET-PROXY-INITIALIZE-METHOD" );
    $sym144$SENSE_PROXY_INITIALIZE_METHOD = makeSymbol( "SENSE-PROXY-INITIALIZE-METHOD" );
    $sym145$WORD_PROXY_INITIALIZE_METHOD = makeSymbol( "WORD-PROXY-INITIALIZE-METHOD" );
    $sym146$WORDNET_PROXY_INITIALIZE_METHOD = makeSymbol( "WORDNET-PROXY-INITIALIZE-METHOD" );
    $str147$gloss = makeString( "gloss" );
    $str148$adjective = makeString( "adjective" );
    $str149$noun = makeString( "noun" );
    $str150$verb = makeString( "verb" );
    $str151$adverb = makeString( "adverb" );
    $str152$antonym = makeString( "antonym" );
    $str153$hypernym = makeString( "hypernym" );
    $str154$hyponym = makeString( "hyponym" );
    $str155$attribute = makeString( "attribute" );
    $str156$also_see = makeString( "also see" );
    $str157$entailment = makeString( "entailment" );
    $str158$cause = makeString( "cause" );
    $str159$verb_group = makeString( "verb group" );
    $str160$member_meronym = makeString( "member meronym" );
    $str161$substance_meronym = makeString( "substance meronym" );
    $str162$part_meronym = makeString( "part meronym" );
    $str163$member_holonym = makeString( "member holonym" );
    $str164$substance_holonym = makeString( "substance holonym" );
    $str165$part_holonym = makeString( "part holonym" );
    $str166$similar = makeString( "similar" );
    $str167$participle_of = makeString( "participle of" );
    $str168$pertainym = makeString( "pertainym" );
  }
}
/*
 * 
 * Total time: 451 ms
 * 
 */