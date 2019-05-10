package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class word_linkage
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.word_linkage";
  public static final String myFingerPrint = "74f41c909befcfed3681910ffd3448fb453dae7f639d9343ad38ce0a5feb80bf";
  private static final SubLSymbol $sym0$WORD_LINKAGE_WORD;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$LEXES;
  private static final SubLSymbol $sym4$RIGHT_LINKS;
  private static final SubLSymbol $sym5$LEFT_LINKS;
  private static final SubLSymbol $sym6$INDEX;
  private static final SubLSymbol $sym7$POS;
  private static final SubLSymbol $sym8$STRING;
  private static final SubLSymbol $sym9$LINKAGE;
  private static final SubLSymbol $sym10$INSTANCE_COUNT;
  private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS;
  private static final SubLSymbol $sym12$ISOLATED_P;
  private static final SubLSymbol $sym13$INSTANCE_NUMBER;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE;
  private static final SubLSymbol $sym15$LINK_NAME;
  private static final SubLSymbol $sym16$PRINT;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLString $str21$__LW;
  private static final SubLString $str22$_;
  private static final SubLString $str23$___;
  private static final SubLString $str24$_;
  private static final SubLSymbol $sym25$WORD_LINKAGE_WORD_PRINT_METHOD;
  private static final SubLSymbol $sym26$GET_LINKAGE;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym30$WORD_LINKAGE_WORD_GET_LINKAGE_METHOD;
  private static final SubLSymbol $sym31$GET_STRING;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym34$WORD_LINKAGE_WORD_GET_STRING_METHOD;
  private static final SubLSymbol $sym35$GET_ABS_INDEX;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym38$WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD;
  private static final SubLSymbol $sym39$GET_POS;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym42$WORD_LINKAGE_WORD_GET_POS_METHOD;
  private static final SubLSymbol $sym43$GET_CATEGORY;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$WORD_LINKAGE_WORD_GET_CATEGORY_METHOD;
  private static final SubLSymbol $sym46$GET_INDEX;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym49$WORD_LINKAGE_WORD_GET_INDEX_METHOD;
  private static final SubLSymbol $sym50$GET_LEXES;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym53$WORD_LINKAGE_WORD_GET_LEXES_METHOD;
  private static final SubLSymbol $sym54$GET_LEFT_LINKS;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym58$REGEX_PATTERN_P;
  private static final SubLSymbol $sym59$WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD;
  private static final SubLSymbol $sym60$GET_RIGHT_LINKS;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $sym63$WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD;
  private static final SubLSymbol $sym64$GET_LINKS;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$WORD_LINKAGE_WORD_GET_LINKS_METHOD;
  private static final SubLSymbol $sym67$GET_DIRECTLY_RELATED;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$LEFT;
  private static final SubLSymbol $kw71$RIGHT;
  private static final SubLString $str72$Invalid_link_direction__a;
  private static final SubLSymbol $sym73$WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD;
  private static final SubLSymbol $sym74$GET_RELATED;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$WORD_LINKAGE_WORD_GET_RELATED_METHOD;
  private static final SubLSymbol $sym78$LEXIFY;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$GET;
  private static final SubLSymbol $sym83$POS_FILTER_LEXES;
  private static final SubLSymbol $sym84$WORD_LINKAGE_WORD_LEXIFY_METHOD;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
  private static final SubLSymbol $kw87$PENN_TAGS;
  private static final SubLSymbol $kw88$BACKOFF_PENN_TAGS;
  private static final SubLFloat $float89$0_75;
  private static final SubLSymbol $sym90$WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$WORD_LINKAGE;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$TREE_STRING;
  private static final SubLSymbol $sym95$DIAGRAM;
  private static final SubLSymbol $sym96$WORDS;
  private static final SubLSymbol $sym97$LINKS;
  private static final SubLSymbol $sym98$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS;
  private static final SubLSymbol $sym99$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE;
  private static final SubLString $str100$ID;
  private static final SubLSymbol $sym101$INCOMPLETE_LINK_;
  private static final SubLSymbol $sym102$VECTOR;
  private static final SubLString $str103$word_linkage;
  private static final SubLString $str104$_a_is_not_a_linkage_xml_string;
  private static final SubLString $str105$words;
  private static final SubLString $str106$links;
  private static final SubLString $str107$cat;
  private static final SubLString $str108$_;
  private static final SubLList $list109;
  private static final SubLList $list110;
  private static final SubLSymbol $kw111$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw112$OPTIONS;
  private static final SubLSymbol $kw113$LEXICON;
  private static final SubLSymbol $kw114$USE_STANDARDIZED_WORD_STRINGS_;
  private static final SubLSymbol $sym115$STRINGP;
  private static final SubLSymbol $sym116$LISTP;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
  private static final SubLSymbol $sym119$WORD_LINKAGE_PRINT_METHOD;
  private static final SubLSymbol $sym120$PRINT_DIAGRAM;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
  private static final SubLSymbol $sym123$WORD_LINKAGE_PRINT_DIAGRAM_METHOD;
  private static final SubLSymbol $sym124$XML;
  private static final SubLList $list125;
  private static final SubLString $str126$_word_linkage___;
  private static final SubLString $str127$_words___;
  private static final SubLString $str128$__words___;
  private static final SubLString $str129$__word_linkage___;
  private static final SubLSymbol $sym130$WORD_LINKAGE_XML_METHOD;
  private static final SubLString $str131$_word_cat___a___a__word___;
  private static final SubLSymbol $sym132$LENGTH;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
  private static final SubLSymbol $sym135$WORD_LINKAGE_LENGTH_METHOD;
  private static final SubLSymbol $sym136$GET_TREE_STRING;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
  private static final SubLSymbol $sym139$WORD_LINKAGE_GET_TREE_STRING_METHOD;
  private static final SubLSymbol $sym140$GET_WORD;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
  private static final SubLSymbol $sym144$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym145$WORD_LINKAGE_GET_WORD_METHOD;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$ABSTRACT_LEXICON_P;
  private static final SubLSymbol $sym148$WORD_LINKAGE_LEXIFY_METHOD;
  private static final SubLSymbol $sym149$YIELD;
  private static final SubLList $list150;
  private static final SubLSymbol $sym151$WORD_LINKAGE_YIELD_METHOD;
  private static final SubLSymbol $sym152$SEARCH;
  private static final SubLList $list153;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
  private static final SubLSymbol $sym156$WORD_LINKAGE_SEARCH_METHOD;
  private static final SubLSymbol $sym157$WORD_LINKAGE_P;
  private static final SubLList $list158;
  private static final SubLString $str159$Failure_causing_word___S_has_link;
  private static final SubLSymbol $sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_;
  private static final SubLSymbol $kw161$TEST;
  private static final SubLSymbol $kw162$OWNER;
  private static final SubLSymbol $kw163$CLASSES;
  private static final SubLSymbol $kw164$KB;
  private static final SubLSymbol $kw165$FULL;
  private static final SubLSymbol $kw166$WORKING_;
  private static final SubLList $list167;

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_lexes(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, SEVEN_INTEGER, $sym3$LEXES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_lexes(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, SEVEN_INTEGER, $sym3$LEXES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_right_links(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, SIX_INTEGER, $sym4$RIGHT_LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_right_links(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, SIX_INTEGER, $sym4$RIGHT_LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_left_links(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, FIVE_INTEGER, $sym5$LEFT_LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_left_links(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, FIVE_INTEGER, $sym5$LEFT_LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_index(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, FOUR_INTEGER, $sym6$INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_index(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, FOUR_INTEGER, $sym6$INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_pos(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, THREE_INTEGER, $sym7$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_pos(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, THREE_INTEGER, $sym7$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_string(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, TWO_INTEGER, $sym8$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_string(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, TWO_INTEGER, $sym8$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject get_word_linkage_word_linkage(final SubLObject word_linkage_word)
  {
    return classes.subloop_get_access_protected_instance_slot( word_linkage_word, ONE_INTEGER, $sym9$LINKAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject set_word_linkage_word_linkage(final SubLObject word_linkage_word, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( word_linkage_word, value, ONE_INTEGER, $sym9$LINKAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject subloop_reserved_initialize_word_linkage_word_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject subloop_reserved_initialize_word_linkage_word_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym12$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym13$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym9$LINKAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym8$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym7$POS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym6$INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym5$LEFT_LINKS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym4$RIGHT_LINKS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$WORD_LINKAGE_WORD, $sym3$LEXES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
  public static SubLObject word_linkage_word_p(final SubLObject word_linkage_word)
  {
    return classes.subloop_instanceof_class( word_linkage_word, $sym0$WORD_LINKAGE_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 2605L)
  public static SubLObject new_word_linkage_word(final SubLObject v_linkage, final SubLObject stringXpos, final SubLObject index, final SubLObject llinks, final SubLObject rlinks, final SubLObject penn_pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word = object.new_class_instance( $sym0$WORD_LINKAGE_WORD );
    thread.resetMultipleValues();
    final SubLObject string = linkage.split_link_word( stringXpos );
    final SubLObject link_pos = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject v_class = linkage.get_link_word_class( string, link_pos, Mapping.mapcar( $sym15$LINK_NAME, llinks ), Mapping.mapcar( $sym15$LINK_NAME, rlinks ), penn_pos );
    final SubLObject derived_pos = thread.secondMultipleValue();
    thread.resetMultipleValues();
    instances.set_slot( word, $sym9$LINKAGE, v_linkage );
    instances.set_slot( word, $sym8$STRING, string );
    instances.set_slot( word, $sym7$POS, derived_pos );
    instances.set_slot( word, $sym6$INDEX, index );
    instances.set_slot( word, $sym5$LEFT_LINKS, llinks );
    instances.set_slot( word, $sym4$RIGHT_LINKS, rlinks );
    SubLObject cdolist_list_var = llinks;
    SubLObject llink = NIL;
    llink = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      linkage._csetf_link_right_word( llink, word );
      cdolist_list_var = cdolist_list_var.rest();
      llink = cdolist_list_var.first();
    }
    cdolist_list_var = rlinks;
    SubLObject rlink = NIL;
    rlink = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      linkage._csetf_link_left_word( rlink, word );
      cdolist_list_var = cdolist_list_var.rest();
      rlink = cdolist_list_var.first();
    }
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 3692L)
  public static SubLObject word_linkage_word_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject pos = get_word_linkage_word_pos( self );
    final SubLObject string = get_word_linkage_word_string( self );
    try
    {
      thread.throwStack.push( $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        streams_high.write_string( $str21$__LW, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str22$_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( pos, stream );
        streams_high.write_string( $str23$___, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( string, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str24$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_pos( self, pos );
          set_word_linkage_word_string( self, string );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4018L)
  public static SubLObject word_linkage_word_get_linkage_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject v_linkage = get_word_linkage_word_linkage( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, v_linkage );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_linkage( self, v_linkage );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4163L)
  public static SubLObject word_linkage_word_get_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject string = get_word_linkage_word_string( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, string );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_string( self, string );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4295L)
  public static SubLObject word_linkage_word_get_abs_index_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject index = get_word_linkage_word_index( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_index( self, index );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4430L)
  public static SubLObject word_linkage_word_get_pos_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject pos = get_word_linkage_word_pos( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, pos );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_pos( self, pos );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4558L)
  public static SubLObject word_linkage_word_get_category_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_0_args( self, $sym39$GET_POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4707L)
  public static SubLObject word_linkage_word_get_index_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject index = get_word_linkage_word_index( self );
    try
    {
      thread.throwStack.push( $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_index( self, index );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4829L)
  public static SubLObject word_linkage_word_get_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject lexes = get_word_linkage_word_lexes( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_lexes( self, lexes );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4960L)
  public static SubLObject word_linkage_word_get_left_links_method(final SubLObject self, SubLObject link_pattern)
  {
    if( link_pattern == UNPROVIDED )
    {
      link_pattern = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject left_links = get_word_linkage_word_left_links( self );
    try
    {
      thread.throwStack.push( $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        if( NIL != link_pattern && !assertionsDisabledInClass && NIL == regular_expressions.regex_pattern_p( link_pattern ) )
        {
          throw new AssertionError( link_pattern );
        }
        if( NIL == link_pattern )
        {
          Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, left_links );
        }
        SubLObject links = NIL;
        SubLObject cdolist_list_var = left_links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != regular_expression_utilities.regex_matchP( link_pattern, linkage.link_name( link ) ) )
          {
            links = ConsesLow.cons( link, links );
          }
          cdolist_list_var = cdolist_list_var.rest();
          link = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_left_links( self, left_links );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 5305L)
  public static SubLObject word_linkage_word_get_right_links_method(final SubLObject self, SubLObject link_pattern)
  {
    if( link_pattern == UNPROVIDED )
    {
      link_pattern = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    final SubLObject right_links = get_word_linkage_word_right_links( self );
    try
    {
      thread.throwStack.push( $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        if( NIL != link_pattern && !assertionsDisabledInClass && NIL == regular_expressions.regex_pattern_p( link_pattern ) )
        {
          throw new AssertionError( link_pattern );
        }
        if( NIL == link_pattern )
        {
          Dynamic.sublisp_throw( $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, right_links );
        }
        SubLObject links = NIL;
        SubLObject cdolist_list_var = right_links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != regular_expression_utilities.regex_matchP( link_pattern, linkage.link_name( link ) ) )
          {
            links = ConsesLow.cons( link, links );
          }
          cdolist_list_var = cdolist_list_var.rest();
          link = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_right_links( self, right_links );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 5653L)
  public static SubLObject word_linkage_word_get_links_method(final SubLObject self, SubLObject link_pattern)
  {
    if( link_pattern == UNPROVIDED )
    {
      link_pattern = NIL;
    }
    if( NIL != link_pattern && !assertionsDisabledInClass && NIL == regular_expressions.regex_pattern_p( link_pattern ) )
    {
      throw new AssertionError( link_pattern );
    }
    return ConsesLow.append( methods.funcall_instance_method_with_1_args( self, $sym54$GET_LEFT_LINKS, link_pattern ), methods.funcall_instance_method_with_1_args( self, $sym60$GET_RIGHT_LINKS, link_pattern ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 5918L)
  public static SubLObject word_linkage_word_get_directly_related_method(final SubLObject self, final SubLObject pattern_keyword, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLObject link_pattern = linkage.get_link_pattern( pattern_keyword );
    final SubLObject link_getter = ( NIL == direction ) ? $sym64$GET_LINKS
        : ( direction.eql( $kw70$LEFT ) ? $sym54$GET_LEFT_LINKS : ( direction.eql( $kw71$RIGHT ) ? $sym60$GET_RIGHT_LINKS : Errors.error( $str72$Invalid_link_direction__a, direction ) ) );
    SubLObject words = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( self, link_getter, link_pattern );
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( linkage.link_left_word( link ).eql( self ) )
      {
        words = ConsesLow.cons( linkage.link_right_word( link ), words );
      }
      else
      {
        words = ConsesLow.cons( linkage.link_left_word( link ), words );
      }
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 6640L)
  public static SubLObject word_linkage_word_get_related_method(final SubLObject self, final SubLObject link_path)
  {
    if( NIL == link_path )
    {
      return ConsesLow.list( self );
    }
    SubLObject words = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( self, $sym67$GET_DIRECTLY_RELATED, link_path.first() );
    SubLObject related = NIL;
    related = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      words = ConsesLow.append( methods.funcall_instance_method_with_1_args( related, $sym74$GET_RELATED, link_path.rest() ), words );
      cdolist_list_var = cdolist_list_var.rest();
      related = cdolist_list_var.first();
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 7102L)
  public static SubLObject word_linkage_word_lexify_method(final SubLObject self, final SubLObject lexicon)
  {
    SubLObject filtered = NIL;
    final SubLObject string = instances.get_slot( self, $sym8$STRING );
    instances.set_slot( self, $sym3$LEXES, cyclifier.new_even_lex_entry_distribution( methods.funcall_instance_method_with_1_args( lexicon, $sym82$GET, string ) ) );
    if( NIL != instances.get_slot( self, $sym3$LEXES ) )
    {
      filtered = methods.funcall_instance_method_with_0_args( self, $sym83$POS_FILTER_LEXES );
    }
    instances.set_slot( self, $sym3$LEXES, filtered );
    return instances.get_slot( self, $sym3$LEXES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 7869L)
  public static SubLObject word_linkage_word_pos_filter_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_word_method = NIL;
    SubLObject lexes = get_word_linkage_word_lexes( self );
    final SubLObject pos = get_word_linkage_word_pos( self );
    try
    {
      thread.throwStack.push( $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
      try
      {
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != conses_high.member( instances.get_slot( self, $sym7$POS ), methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym82$GET, $kw87$PENN_TAGS ), UNPROVIDED, UNPROVIDED ) )
          {
            cyclifier.rle_set_confidence( rle, ONE_INTEGER );
            filtered = ConsesLow.cons( rle, filtered );
          }
          else if( NIL != conses_high.member( instances.get_slot( self, $sym7$POS ), methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym82$GET, $kw88$BACKOFF_PENN_TAGS ), UNPROVIDED,
              UNPROVIDED ) )
          {
            cyclifier.rle_set_confidence( rle, $float89$0_75 );
            filtered = ConsesLow.cons( rle, filtered );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        lexes = filtered;
        Dynamic.sublisp_throw( $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_word_lexes( self, lexes );
          set_word_linkage_word_pos( self, pos );
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
      catch_var_for_word_linkage_word_method = Errors.handleThrowable( ccatch_env_var, $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_word_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8409L)
  public static SubLObject wall_word_linkage_wordP(final SubLObject word)
  {
    return makeBoolean( NIL != word_linkage_word_p( word ) && NIL == methods.funcall_instance_method_with_0_args( word, $sym39$GET_POS ) && NIL != subl_promotions.memberP( methods.funcall_instance_method_with_0_args(
        word, $sym31$GET_STRING ), $list91, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject get_word_linkage_tree_string(final SubLObject v_word_linkage)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_linkage, FOUR_INTEGER, $sym94$TREE_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject set_word_linkage_tree_string(final SubLObject v_word_linkage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_linkage, value, FOUR_INTEGER, $sym94$TREE_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject get_word_linkage_diagram(final SubLObject v_word_linkage)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_linkage, THREE_INTEGER, $sym95$DIAGRAM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject set_word_linkage_diagram(final SubLObject v_word_linkage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_linkage, value, THREE_INTEGER, $sym95$DIAGRAM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject get_word_linkage_words(final SubLObject v_word_linkage)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_linkage, TWO_INTEGER, $sym96$WORDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject set_word_linkage_words(final SubLObject v_word_linkage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_linkage, value, TWO_INTEGER, $sym96$WORDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject get_word_linkage_links(final SubLObject v_word_linkage)
  {
    return classes.subloop_get_access_protected_instance_slot( v_word_linkage, ONE_INTEGER, $sym97$LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject set_word_linkage_links(final SubLObject v_word_linkage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_word_linkage, value, ONE_INTEGER, $sym97$LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject subloop_reserved_initialize_word_linkage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject subloop_reserved_initialize_word_linkage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym12$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym13$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$WORD_LINKAGE, $sym97$LINKS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$WORD_LINKAGE, $sym96$WORDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$WORD_LINKAGE, $sym95$DIAGRAM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym92$WORD_LINKAGE, $sym94$TREE_STRING, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
  public static SubLObject word_linkage_p(final SubLObject v_word_linkage)
  {
    return classes.subloop_instanceof_class( v_word_linkage, $sym92$WORD_LINKAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 9536L)
  public static SubLObject new_word_linkage_from_link_structure(final SubLObject link_structure, final SubLObject tagged_sent, final SubLObject input_sentence, final SubLObject respect_id_linksP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_linkage = object.new_class_instance( $sym92$WORD_LINKAGE );
    final SubLObject word_count = linkage.ls_number_of_words( link_structure );
    final SubLObject link_count = linkage.ls_number_of_links( link_structure );
    final SubLObject links = Vectors.make_vector( link_count, UNPROVIDED );
    final SubLObject word_links = Vectors.make_vector( word_count, UNPROVIDED );
    SubLObject idiom_offset = ZERO_INTEGER;
    final SubLObject tagged_sent_length = document.sentence_length( tagged_sent );
    SubLObject words = NIL;
    SubLObject idiom_word_ids = NIL;
    SubLObject idioms = NIL;
    SubLObject llinksXrlinks = NIL;
    SubLObject link_name = NIL;
    SubLObject index = NIL;
    SubLObject string = NIL;
    SubLObject pos = NIL;
    SubLObject wi;
    for( wi = NIL, wi = ZERO_INTEGER; wi.numL( word_count ); wi = Numbers.add( wi, ONE_INTEGER ) )
    {
      Vectors.set_aref( word_links, wi, ConsesLow.cons( NIL, NIL ) );
    }
    SubLObject li;
    for( li = NIL, li = ZERO_INTEGER; li.numL( link_count ); li = Numbers.add( li, ONE_INTEGER ) )
    {
      index = linkage.ls_lword_index_of_link( link_structure, li );
      llinksXrlinks = Vectors.aref( word_links, index );
      ConsesLow.rplacd( llinksXrlinks, ConsesLow.cons( li, llinksXrlinks.rest() ) );
      index = linkage.ls_rword_index_of_link( link_structure, li );
      llinksXrlinks = Vectors.aref( word_links, index );
      ConsesLow.rplaca( llinksXrlinks, ConsesLow.cons( li, llinksXrlinks.first() ) );
    }
    SubLObject llinks;
    SubLObject rlinks;
    SubLObject llink;
    SubLObject rlink;
    SubLObject string_$1;
    SubLObject idioms_$2;
    SubLObject cdolist_list_var;
    SubLObject llink_id;
    SubLObject rlink_id;
    for( wi = NIL, wi = ZERO_INTEGER; wi.numL( word_count ); wi = Numbers.add( wi, ONE_INTEGER ) )
    {
      if( NIL == subl_promotions.memberP( wi, idiom_word_ids, UNPROVIDED, UNPROVIDED ) )
      {
        llinks = NIL;
        rlinks = NIL;
        llink = NIL;
        rlink = NIL;
        thread.resetMultipleValues();
        string_$1 = retrieve_link_word( wi, link_structure, word_links, input_sentence );
        idioms_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$1;
        idioms = idioms_$2;
        idiom_word_ids = ConsesLow.append( idioms, idiom_word_ids );
        pos = ( wi.numL( ONE_INTEGER ) || wi.numG( tagged_sent_length ) ) ? NIL
            : document.word_category( document.sentence_get( tagged_sent, number_utilities.f_1_( ( NIL != idioms ) ? conses_high.last( idioms, UNPROVIDED ).first() : wi ) ) );
        if( NIL != idioms )
        {
          llinksXrlinks = get_idiom_links( idioms, word_links, link_structure );
        }
        else
        {
          llinksXrlinks = Vectors.aref( word_links, wi );
        }
        cdolist_list_var = llinksXrlinks.first();
        llink_id = NIL;
        llink_id = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          link_name = linkage.ls_name_of_link( link_structure, llink_id );
          llink = Vectors.aref( links, llink_id );
          if( NIL == llink )
          {
            llink = linkage.new_link( link_name );
            Vectors.set_aref( links, llink_id, llink );
          }
          llinks = ConsesLow.cons( llink, llinks );
          cdolist_list_var = cdolist_list_var.rest();
          llink_id = cdolist_list_var.first();
        }
        cdolist_list_var = llinksXrlinks.rest();
        rlink_id = NIL;
        rlink_id = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          link_name = linkage.ls_name_of_link( link_structure, rlink_id );
          if( NIL == string_utilities.starts_with( link_name, $str100$ID ) )
          {
            rlink = Vectors.aref( links, rlink_id );
            if( NIL == rlink )
            {
              rlink = linkage.new_link( link_name );
              Vectors.set_aref( links, rlink_id, rlink );
            }
            rlinks = ConsesLow.cons( rlink, rlinks );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rlink_id = cdolist_list_var.first();
        }
        words = ConsesLow.cons( new_word_linkage_word( v_linkage, string, Numbers.subtract( wi, idiom_offset ), llinks, rlinks, pos ), words );
        if( NIL != idioms )
        {
          idiom_offset = Numbers.add( idiom_offset, Numbers.subtract( conses_high.second( idioms ), idioms.first() ) );
        }
      }
    }
    SubLObject cdolist_list_var2 = words;
    SubLObject word = NIL;
    word = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      instances.set_slot( word, $sym5$LEFT_LINKS, Sequences.remove_if( $sym101$INCOMPLETE_LINK_, get_word_linkage_word_left_links( word ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      instances.set_slot( word, $sym4$RIGHT_LINKS, Sequences.remove_if( $sym101$INCOMPLETE_LINK_, get_word_linkage_word_right_links( word ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      cdolist_list_var2 = cdolist_list_var2.rest();
      word = cdolist_list_var2.first();
    }
    instances.set_slot( v_linkage, $sym95$DIAGRAM, linkage.ls_diagram( link_structure ) );
    instances.set_slot( v_linkage, $sym97$LINKS, Sequences.remove_if( $sym101$INCOMPLETE_LINK_, links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    instances.set_slot( v_linkage, $sym96$WORDS, Functions.apply( $sym102$VECTOR, Sequences.nreverse( words ) ) );
    instances.set_slot( v_linkage, $sym94$TREE_STRING, linkage.ls_tree( link_structure ) );
    return v_linkage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 13906L)
  public static SubLObject xml_to_word_linkage(final SubLObject xml)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sexpr = xml_parsing_utilities.xml_tokens_to_sexpr( xml_parsing_utilities.xml_string_tokenize( xml, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Strings.stringE( xml_parsing_utilities.xml_sexpr_type( sexpr ), $str103$word_linkage, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str104$_a_is_not_a_linkage_xml_string, sexpr );
    }
    final SubLObject v_linkage = object.new_class_instance( $sym92$WORD_LINKAGE );
    final SubLObject words_sexpr = xml_parsing_utilities.xml_sexpr_daughter( sexpr, $str105$words );
    final SubLObject words = words_sexpr_to_word_vector( words_sexpr );
    final SubLObject links_sexpr = xml_parsing_utilities.xml_sexpr_daughter( sexpr, $str106$links );
    SubLObject i = ZERO_INTEGER;
    SubLObject links = NIL;
    final SubLObject vector_var = words;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject word;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      word = Vectors.aref( vector_var, element_num );
      instances.set_slot( word, $sym9$LINKAGE, v_linkage );
      instances.set_slot( word, $sym6$INDEX, i );
      i = Numbers.add( i, ONE_INTEGER );
    }
    links = linkage.xml_sexpr_to_links( links_sexpr, words );
    instances.set_slot( v_linkage, $sym97$LINKS, links );
    instances.set_slot( v_linkage, $sym96$WORDS, words );
    return v_linkage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 14918L)
  public static SubLObject words_sexpr_to_word_vector(final SubLObject words_sexpr)
  {
    final SubLObject xml_words = xml_parsing_utilities.xml_sexpr_daughters( words_sexpr, UNPROVIDED );
    final SubLObject words = Vectors.make_vector( Sequences.length( xml_words ), UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = xml_words;
    SubLObject xml_word = NIL;
    xml_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lw = object.new_class_instance( $sym0$WORD_LINKAGE_WORD );
      instances.set_slot( lw, $sym8$STRING, xml_parsing_utilities.xml_sexpr_daughters( xml_word, UNPROVIDED ).first() );
      instances.set_slot( lw, $sym7$POS, Symbols.make_keyword( xml_parsing_utilities.xml_sexpr_attribute_value( xml_word, $str107$cat ) ) );
      Vectors.set_aref( words, i, lw );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      xml_word = cdolist_list_var.first();
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 15450L)
  public static SubLObject retrieve_link_word(final SubLObject word, final SubLObject link_structure, final SubLObject word_links, final SubLObject input_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rlinks = Vectors.aref( word_links, word ).rest();
    SubLObject idiom_link = find_link_id( $str100$ID, link_structure, rlinks );
    SubLObject string = NIL;
    SubLObject pos = NIL;
    SubLObject idioms = NIL;
    SubLObject idiom_parts = NIL;
    thread.resetMultipleValues();
    final SubLObject string_$3 = linkage.split_link_word( linkage.ls_word_of_linkage( link_structure, word ) );
    final SubLObject pos_$4 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    string = string_$3;
    pos = pos_$4;
    if( NIL != idiom_link )
    {
      idioms = ConsesLow.cons( word, idioms );
      idiom_parts = ConsesLow.cons( string, idiom_parts );
      while ( NIL != idiom_link)
      {
        final SubLObject wi = linkage.ls_rword_index_of_link( link_structure, idiom_link );
        idiom_parts = ConsesLow.cons( linkage.split_link_word( linkage.ls_word_of_linkage( link_structure, wi ) ), idiom_parts );
        rlinks = Vectors.aref( word_links, wi ).rest();
        idiom_link = find_link_id( $str100$ID, link_structure, rlinks );
        idioms = ConsesLow.cons( wi, idioms );
      }
      string = string_utilities.bunge_according_to_string( Sequences.nreverse( idiom_parts ), input_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != pos )
    {
      string = Sequences.cconcatenate( string, new SubLObject[] { $str108$_, print_high.princ_to_string( pos )
      } );
    }
    return Values.values( string, Sequences.nreverse( idioms ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 16826L)
  public static SubLObject find_link_id(final SubLObject link_name, final SubLObject link_structure, final SubLObject links)
  {
    SubLObject cdolist_list_var = links;
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.starts_with( linkage.ls_name_of_link( link_structure, link ), link_name ) )
      {
        return link;
      }
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 17006L)
  public static SubLObject get_idiom_links(final SubLObject idiom_ids, final SubLObject word_links, final SubLObject link_structure)
  {
    SubLObject llinks = NIL;
    SubLObject rlinks = NIL;
    SubLObject dup_link_id = NIL;
    SubLObject cdolist_list_var = idiom_ids;
    SubLObject word_id = NIL;
    word_id = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$5 = Vectors.aref( word_links, word_id ).first();
      SubLObject llink_id = NIL;
      llink_id = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        SubLObject internal_linkP;
        SubLObject remaining;
        SubLObject wi;
        for( internal_linkP = NIL, remaining = NIL, wi = NIL, remaining = idiom_ids, wi = remaining.first(); NIL == internal_linkP && !wi.numGE( word_id ); internal_linkP = makeBoolean( NIL != internal_linkP
            || NIL != conses_high.member( llink_id, Vectors.aref( word_links, wi ).rest(), UNPROVIDED, UNPROVIDED ) ), remaining = remaining.rest(), wi = remaining.first() )
        {
        }
        dup_link_id = link_member_p( llink_id, llinks, link_structure );
        if( NIL != dup_link_id )
        {
          Vectors.set_aref( linkage.ls_links( link_structure ), llink_id, NIL );
        }
        else if( NIL == internal_linkP )
        {
          llinks = ConsesLow.cons( llink_id, llinks );
        }
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        llink_id = cdolist_list_var_$5.first();
      }
      SubLObject cdolist_list_var_$6 = Vectors.aref( word_links, word_id ).rest();
      SubLObject rlink_id = NIL;
      rlink_id = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        SubLObject internal_linkP;
        SubLObject remaining;
        SubLObject wi;
        for( internal_linkP = NIL, remaining = NIL, wi = NIL, remaining = Sequences.reverse( idiom_ids ), wi = remaining.first(); NIL == internal_linkP && !wi.numLE( word_id ); internal_linkP = makeBoolean(
            NIL != internal_linkP || NIL != conses_high.member( rlink_id, Vectors.aref( word_links, wi ).first(), UNPROVIDED, UNPROVIDED ) ), remaining = remaining.rest(), wi = remaining.first() )
        {
        }
        dup_link_id = link_member_p( rlink_id, rlinks, link_structure );
        if( NIL != dup_link_id )
        {
          Vectors.set_aref( linkage.ls_links( link_structure ), rlink_id, NIL );
        }
        else if( NIL == internal_linkP )
        {
          rlinks = ConsesLow.cons( rlink_id, rlinks );
        }
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        rlink_id = cdolist_list_var_$6.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word_id = cdolist_list_var.first();
    }
    return ConsesLow.cons( llinks, rlinks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 19063L)
  public static SubLObject incomplete_linkP(final SubLObject link)
  {
    if( NIL != link )
    {
      return makeBoolean( NIL == linkage.link_left_word( link ) || NIL == linkage.link_right_word( link ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 19267L)
  public static SubLObject link_member_p(final SubLObject link_id, final SubLObject links, final SubLObject link_structure)
  {
    final SubLObject name = linkage.ls_name_of_link( link_structure, link_id );
    final SubLObject left_word = linkage.ls_lword_index_of_link( link_structure, link_id );
    final SubLObject right_word = linkage.ls_rword_index_of_link( link_structure, link_id );
    SubLObject cdolist_list_var = links;
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != name && NIL != linkage.ls_name_of_link( link_structure, link ) && NIL != Strings.stringE( name, linkage.ls_name_of_link( link_structure, link ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
          && ( left_word.numE( linkage.ls_lword_index_of_link( link_structure, link ) ) || right_word.numE( linkage.ls_rword_index_of_link( link_structure, link ) ) ) )
      {
        return linkage.ls_link( link_structure, link );
      }
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 19980L)
  public static SubLObject new_word_linkages(final SubLObject sentence, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = v_properties;
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list109 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list109 );
      if( NIL == conses_high.member( current_$7, $list110, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw111$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list109 );
    }
    final SubLObject options_tail = cdestructuring_bind.property_list_member( $kw112$OPTIONS, current );
    final SubLObject options = ( NIL != options_tail ) ? conses_high.cadr( options_tail ) : linkage.$link_parse_options$.getDynamicValue( thread );
    final SubLObject lexicon_tail = cdestructuring_bind.property_list_member( $kw113$LEXICON, current );
    final SubLObject lexicon = ( NIL != lexicon_tail ) ? conses_high.cadr( lexicon_tail ) : NIL;
    final SubLObject use_standardized_word_stringsP_tail = cdestructuring_bind.property_list_member( $kw114$USE_STANDARDIZED_WORD_STRINGS_, current );
    final SubLObject use_standardized_word_stringsP = ( NIL != use_standardized_word_stringsP_tail ) ? conses_high.cadr( use_standardized_word_stringsP_tail ) : T;
    assert NIL != Types.stringp( sentence ) : sentence;
    assert NIL != Types.listp( options ) : options;
    final SubLObject link_structures = linkage.link_parse( sentence, options, lexicon, use_standardized_word_stringsP );
    SubLObject linkages = NIL;
    SubLObject tagged_sent = NIL;
    if( NIL == link_structures )
    {
      return NIL;
    }
    tagged_sent = linkage.words_to_sentence( linkage.ls_words( link_structures.first() ) );
    pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), tagged_sent );
    linkage.auxify_sentence( tagged_sent );
    SubLObject cdolist_list_var = link_structures;
    SubLObject link_structure = NIL;
    link_structure = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      linkages = ConsesLow.cons( new_word_linkage_from_link_structure( link_structure, tagged_sent, sentence, ( NIL != lexicon ) ? T : NIL ), linkages );
      cdolist_list_var = cdolist_list_var.rest();
      link_structure = cdolist_list_var.first();
    }
    return linkages;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 21433L)
  public static SubLObject new_word_linkage(final SubLObject sentence, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    linkage.ensure_linkage_initialized();
    return new_word_linkages( sentence, v_properties ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 21766L)
  public static SubLObject word_linkage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_method = NIL;
    final SubLObject words = get_word_linkage_words( self );
    try
    {
      thread.throwStack.push( $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
      try
      {
        final SubLObject vector_var = words;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          word = Vectors.aref( vector_var, element_num );
          print_high.princ( word, stream );
          streams_high.terpri( stream );
        }
        Dynamic.sublisp_throw( $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_words( self, words );
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
      catch_var_for_word_linkage_method = Errors.handleThrowable( ccatch_env_var, $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 22034L)
  public static SubLObject word_linkage_print_diagram_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_method = NIL;
    final SubLObject diagram = get_word_linkage_diagram( self );
    try
    {
      thread.throwStack.push( $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
      try
      {
        print_high.princ( diagram, UNPROVIDED );
        Dynamic.sublisp_throw( $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_diagram( self, diagram );
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
      catch_var_for_word_linkage_method = Errors.handleThrowable( ccatch_env_var, $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 22166L)
  public static SubLObject word_linkage_xml_method(final SubLObject self)
  {
    SubLObject xml = NIL;
    final SubLObject indent = ZERO_INTEGER;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      PrintLow.format( stream, $str126$_word_linkage___ );
      string_utilities.tab( Numbers.add( indent, THREE_INTEGER ), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      PrintLow.format( stream, $str127$_words___ );
      SubLObject word = NIL;
      final SubLObject vector_var = instances.get_slot( self, $sym96$WORDS );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject w;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        w = ( word = Vectors.aref( vector_var, element_num ) );
        word_linkage_word_xml( word, stream, Numbers.add( indent, SIX_INTEGER ) );
      }
      string_utilities.tab( Numbers.add( indent, THREE_INTEGER ), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      PrintLow.format( stream, $str128$__words___ );
      linkage.links_xml( get_word_linkage_links( self ), stream, Numbers.add( indent, THREE_INTEGER ) );
      PrintLow.format( stream, $str129$__word_linkage___ );
      xml = streams_high.get_output_stream_string( stream );
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
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 22741L)
  public static SubLObject word_linkage_word_xml(final SubLObject lw, final SubLObject stream, final SubLObject indent)
  {
    string_utilities.tab( indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return PrintLow.format( stream, $str131$_word_cat___a___a__word___, methods.funcall_instance_method_with_0_args( lw, $sym43$GET_CATEGORY ), methods.funcall_instance_method_with_0_args( lw, $sym31$GET_STRING ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23021L)
  public static SubLObject word_linkage_length_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_method = NIL;
    final SubLObject words = get_word_linkage_words( self );
    try
    {
      thread.throwStack.push( $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, Numbers.subtract( Sequences.length( words ), TWO_INTEGER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_words( self, words );
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
      catch_var_for_word_linkage_method = Errors.handleThrowable( ccatch_env_var, $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23170L)
  public static SubLObject word_linkage_get_tree_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_method = NIL;
    final SubLObject tree_string = get_word_linkage_tree_string( self );
    try
    {
      thread.throwStack.push( $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, tree_string );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_tree_string( self, tree_string );
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
      catch_var_for_word_linkage_method = Errors.handleThrowable( ccatch_env_var, $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23319L)
  public static SubLObject word_linkage_get_word_method(final SubLObject self, final SubLObject i)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_method = NIL;
    final SubLObject words = get_word_linkage_words( self );
    try
    {
      thread.throwStack.push( $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
      try
      {
        assert NIL != subl_promotions.non_negative_integer_p( i ) : i;
        if( !i.numG( number_utilities.f_1_( Sequences.length( words ) ) ) )
        {
          Dynamic.sublisp_throw( $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, Vectors.aref( words, i ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_words( self, words );
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
      catch_var_for_word_linkage_method = Errors.handleThrowable( ccatch_env_var, $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23581L)
  public static SubLObject word_linkage_lexify_method(final SubLObject self, final SubLObject lexicon)
  {
    assert NIL != abstract_lexicon.abstract_lexicon_p( lexicon ) : lexicon;
    SubLObject word = NIL;
    final SubLObject vector_var = instances.get_slot( self, $sym96$WORDS );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject w;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      w = ( word = Vectors.aref( vector_var, element_num ) );
      methods.funcall_instance_method_with_1_args( word, $sym78$LEXIFY, lexicon );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23912L)
  public static SubLObject word_linkage_yield_method(final SubLObject self)
  {
    SubLObject yield = NIL;
    SubLObject word = NIL;
    final SubLObject vector_var = instances.get_slot( self, $sym96$WORDS );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject w;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      w = ( word = Vectors.aref( vector_var, element_num ) );
      yield = ConsesLow.cons( word, yield );
    }
    return Sequences.nreverse( yield );
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 24071L)
  public static SubLObject word_linkage_search_method(final SubLObject self, final SubLObject word_string, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_linkage_method = NIL;
    final SubLObject words = get_word_linkage_words( self );
    try
    {
      thread.throwStack.push( $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
      try
      {
        assert NIL != Types.stringp( word_string ) : word_string;
        assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
        SubLObject counter = ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for( cdotimes_end_var = Sequences.length( words ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( self, $sym140$GET_WORD, i ), $sym31$GET_STRING ).equalp( word_string ) )
          {
            counter = Numbers.add( counter, ONE_INTEGER );
            if( counter.numE( n ) )
            {
              Dynamic.sublisp_throw( $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, methods.funcall_instance_method_with_1_args( self, $sym140$GET_WORD, i ) );
            }
          }
        }
        Dynamic.sublisp_throw( $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_word_linkage_words( self, words );
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
      catch_var_for_word_linkage_method = Errors.handleThrowable( ccatch_env_var, $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_linkage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 24514L)
  public static SubLObject word_linkage_failedP(final SubLObject v_word_linkage, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    assert NIL != word_linkage_p( v_word_linkage ) : v_word_linkage;
    SubLObject word = NIL;
    final SubLObject vector_var = instances.get_slot( v_word_linkage, $sym96$WORDS );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject w;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      w = ( word = Vectors.aref( vector_var, element_num ) );
      if( NIL == subl_promotions.memberP( methods.funcall_instance_method_with_0_args( word, $sym39$GET_POS ), $list158, Symbols.symbol_function( EQ ), UNPROVIDED ) && NIL == methods.funcall_instance_method_with_0_args(
          word, $sym64$GET_LINKS ) )
      {
        if( NIL != verboseP )
        {
          PrintLow.format( T, $str159$Failure_causing_word___S_has_link, word, methods.funcall_instance_method_with_0_args( word, $sym64$GET_LINKS ) );
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 25118L)
  public static SubLObject word_linkage_with_retokenization_failedP(final SubLObject nl_sentence)
  {
    return word_linkage_failedP( new_word_linkage( nl_sentence, ConsesLow.list( $kw113$LEXICON, semtrans_lexicon.new_semtrans_lexicon() ) ), UNPROVIDED );
  }

  public static SubLObject declare_word_linkage_file()
  {
    SubLFiles.declareFunction( me, "get_word_linkage_word_lexes", "GET-WORD-LINKAGE-WORD-LEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_lexes", "SET-WORD-LINKAGE-WORD-LEXES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_word_right_links", "GET-WORD-LINKAGE-WORD-RIGHT-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_right_links", "SET-WORD-LINKAGE-WORD-RIGHT-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_word_left_links", "GET-WORD-LINKAGE-WORD-LEFT-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_left_links", "SET-WORD-LINKAGE-WORD-LEFT-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_word_index", "GET-WORD-LINKAGE-WORD-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_index", "SET-WORD-LINKAGE-WORD-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_word_pos", "GET-WORD-LINKAGE-WORD-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_pos", "SET-WORD-LINKAGE-WORD-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_word_string", "GET-WORD-LINKAGE-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_string", "SET-WORD-LINKAGE-WORD-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_word_linkage", "GET-WORD-LINKAGE-WORD-LINKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_word_linkage", "SET-WORD-LINKAGE-WORD-LINKAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_linkage_word_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_linkage_word_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_p", "WORD-LINKAGE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_word_linkage_word", "NEW-WORD-LINKAGE-WORD", 6, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_print_method", "WORD-LINKAGE-WORD-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_linkage_method", "WORD-LINKAGE-WORD-GET-LINKAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_string_method", "WORD-LINKAGE-WORD-GET-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_abs_index_method", "WORD-LINKAGE-WORD-GET-ABS-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_pos_method", "WORD-LINKAGE-WORD-GET-POS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_category_method", "WORD-LINKAGE-WORD-GET-CATEGORY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_index_method", "WORD-LINKAGE-WORD-GET-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_lexes_method", "WORD-LINKAGE-WORD-GET-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_left_links_method", "WORD-LINKAGE-WORD-GET-LEFT-LINKS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_right_links_method", "WORD-LINKAGE-WORD-GET-RIGHT-LINKS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_links_method", "WORD-LINKAGE-WORD-GET-LINKS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_directly_related_method", "WORD-LINKAGE-WORD-GET-DIRECTLY-RELATED-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_word_get_related_method", "WORD-LINKAGE-WORD-GET-RELATED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_lexify_method", "WORD-LINKAGE-WORD-LEXIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_pos_filter_lexes_method", "WORD-LINKAGE-WORD-POS-FILTER-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wall_word_linkage_wordP", "WALL-WORD-LINKAGE-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_tree_string", "GET-WORD-LINKAGE-TREE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_tree_string", "SET-WORD-LINKAGE-TREE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_diagram", "GET-WORD-LINKAGE-DIAGRAM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_diagram", "SET-WORD-LINKAGE-DIAGRAM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_words", "GET-WORD-LINKAGE-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_words", "SET-WORD-LINKAGE-WORDS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_word_linkage_links", "GET-WORD-LINKAGE-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_linkage_links", "SET-WORD-LINKAGE-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_linkage_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_word_linkage_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_p", "WORD-LINKAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_word_linkage_from_link_structure", "NEW-WORD-LINKAGE-FROM-LINK-STRUCTURE", 4, 0, false );
    SubLFiles.declareFunction( me, "xml_to_word_linkage", "XML-TO-WORD-LINKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "words_sexpr_to_word_vector", "WORDS-SEXPR-TO-WORD-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "retrieve_link_word", "RETRIEVE-LINK-WORD", 4, 0, false );
    SubLFiles.declareFunction( me, "find_link_id", "FIND-LINK-ID", 3, 0, false );
    SubLFiles.declareFunction( me, "get_idiom_links", "GET-IDIOM-LINKS", 3, 0, false );
    SubLFiles.declareFunction( me, "incomplete_linkP", "INCOMPLETE-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "link_member_p", "LINK-MEMBER-P", 3, 0, false );
    SubLFiles.declareFunction( me, "new_word_linkages", "NEW-WORD-LINKAGES", 1, 1, false );
    SubLFiles.declareFunction( me, "new_word_linkage", "NEW-WORD-LINKAGE", 1, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_print_method", "WORD-LINKAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_print_diagram_method", "WORD-LINKAGE-PRINT-DIAGRAM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_xml_method", "WORD-LINKAGE-XML-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_word_xml", "WORD-LINKAGE-WORD-XML", 3, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_length_method", "WORD-LINKAGE-LENGTH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_get_tree_string_method", "WORD-LINKAGE-GET-TREE-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_get_word_method", "WORD-LINKAGE-GET-WORD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_lexify_method", "WORD-LINKAGE-LEXIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_yield_method", "WORD-LINKAGE-YIELD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_linkage_search_method", "WORD-LINKAGE-SEARCH-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_failedP", "WORD-LINKAGE-FAILED?", 1, 1, false );
    SubLFiles.declareFunction( me, "word_linkage_with_retokenization_failedP", "WORD-LINKAGE-WITH-RETOKENIZATION-FAILED?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_word_linkage_file()
  {
    return NIL;
  }

  public static SubLObject setup_word_linkage_file()
  {
    classes.subloop_new_class( $sym0$WORD_LINKAGE_WORD, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$WORD_LINKAGE_WORD, NIL );
    classes.subloop_note_class_initialization_function( $sym0$WORD_LINKAGE_WORD, $sym11$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$WORD_LINKAGE_WORD, $sym14$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE );
    subloop_reserved_initialize_word_linkage_word_class( $sym0$WORD_LINKAGE_WORD );
    methods.methods_incorporate_instance_method( $sym16$PRINT, $sym0$WORD_LINKAGE_WORD, $list17, $list18, $list19 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym16$PRINT, $sym25$WORD_LINKAGE_WORD_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym26$GET_LINKAGE, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list28 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym26$GET_LINKAGE, $sym30$WORD_LINKAGE_WORD_GET_LINKAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym31$GET_STRING, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list32 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym31$GET_STRING, $sym34$WORD_LINKAGE_WORD_GET_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym35$GET_ABS_INDEX, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list36 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym35$GET_ABS_INDEX, $sym38$WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym39$GET_POS, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list40 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym39$GET_POS, $sym42$WORD_LINKAGE_WORD_GET_POS_METHOD );
    methods.methods_incorporate_instance_method( $sym43$GET_CATEGORY, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list44 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym43$GET_CATEGORY, $sym45$WORD_LINKAGE_WORD_GET_CATEGORY_METHOD );
    methods.methods_incorporate_instance_method( $sym46$GET_INDEX, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list47 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym46$GET_INDEX, $sym49$WORD_LINKAGE_WORD_GET_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym50$GET_LEXES, $sym0$WORD_LINKAGE_WORD, $list27, NIL, $list51 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym50$GET_LEXES, $sym53$WORD_LINKAGE_WORD_GET_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym54$GET_LEFT_LINKS, $sym0$WORD_LINKAGE_WORD, $list17, $list55, $list56 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym54$GET_LEFT_LINKS, $sym59$WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym60$GET_RIGHT_LINKS, $sym0$WORD_LINKAGE_WORD, $list17, $list55, $list61 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym60$GET_RIGHT_LINKS, $sym63$WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym64$GET_LINKS, $sym0$WORD_LINKAGE_WORD, $list17, $list55, $list65 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym64$GET_LINKS, $sym66$WORD_LINKAGE_WORD_GET_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym67$GET_DIRECTLY_RELATED, $sym0$WORD_LINKAGE_WORD, $list17, $list68, $list69 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym67$GET_DIRECTLY_RELATED, $sym73$WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD );
    methods.methods_incorporate_instance_method( $sym74$GET_RELATED, $sym0$WORD_LINKAGE_WORD, $list17, $list75, $list76 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym74$GET_RELATED, $sym77$WORD_LINKAGE_WORD_GET_RELATED_METHOD );
    methods.methods_incorporate_instance_method( $sym78$LEXIFY, $sym0$WORD_LINKAGE_WORD, $list79, $list80, $list81 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym78$LEXIFY, $sym84$WORD_LINKAGE_WORD_LEXIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym83$POS_FILTER_LEXES, $sym0$WORD_LINKAGE_WORD, $list17, NIL, $list85 );
    methods.subloop_register_instance_method( $sym0$WORD_LINKAGE_WORD, $sym83$POS_FILTER_LEXES, $sym90$WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD );
    classes.subloop_new_class( $sym92$WORD_LINKAGE, $sym1$OBJECT, NIL, NIL, $list93 );
    classes.class_set_implements_slot_listeners( $sym92$WORD_LINKAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym92$WORD_LINKAGE, $sym98$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym92$WORD_LINKAGE, $sym99$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE );
    subloop_reserved_initialize_word_linkage_class( $sym92$WORD_LINKAGE );
    methods.methods_incorporate_instance_method( $sym16$PRINT, $sym92$WORD_LINKAGE, $list27, $list18, $list117 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym16$PRINT, $sym119$WORD_LINKAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym120$PRINT_DIAGRAM, $sym92$WORD_LINKAGE, $list27, NIL, $list121 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym120$PRINT_DIAGRAM, $sym123$WORD_LINKAGE_PRINT_DIAGRAM_METHOD );
    methods.methods_incorporate_instance_method( $sym124$XML, $sym92$WORD_LINKAGE, $list27, NIL, $list125 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym124$XML, $sym130$WORD_LINKAGE_XML_METHOD );
    methods.methods_incorporate_instance_method( $sym132$LENGTH, $sym92$WORD_LINKAGE, $list27, NIL, $list133 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym132$LENGTH, $sym135$WORD_LINKAGE_LENGTH_METHOD );
    methods.methods_incorporate_instance_method( $sym136$GET_TREE_STRING, $sym92$WORD_LINKAGE, $list27, NIL, $list137 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym136$GET_TREE_STRING, $sym139$WORD_LINKAGE_GET_TREE_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym140$GET_WORD, $sym92$WORD_LINKAGE, $list27, $list141, $list142 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym140$GET_WORD, $sym145$WORD_LINKAGE_GET_WORD_METHOD );
    methods.methods_incorporate_instance_method( $sym78$LEXIFY, $sym92$WORD_LINKAGE, $list27, $list80, $list146 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym78$LEXIFY, $sym148$WORD_LINKAGE_LEXIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym149$YIELD, $sym92$WORD_LINKAGE, $list27, NIL, $list150 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym149$YIELD, $sym151$WORD_LINKAGE_YIELD_METHOD );
    methods.methods_incorporate_instance_method( $sym152$SEARCH, $sym92$WORD_LINKAGE, $list27, $list153, $list154 );
    methods.subloop_register_instance_method( $sym92$WORD_LINKAGE, $sym152$SEARCH, $sym156$WORD_LINKAGE_SEARCH_METHOD );
    generic_testing.define_test_case_table_int( $sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_, ConsesLow.list( new SubLObject[] { $kw161$TEST, EQ, $kw162$OWNER, NIL, $kw163$CLASSES, NIL, $kw164$KB, $kw165$FULL,
      $kw166$WORKING_, NIL
    } ), $list167 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_word_linkage_file();
  }

  @Override
  public void initializeVariables()
  {
    init_word_linkage_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_word_linkage_file();
  }
  static
  {
    me = new word_linkage();
    $sym0$WORD_LINKAGE_WORD = makeSymbol( "WORD-LINKAGE-WORD" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LINKAGE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "STRING" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "POS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEFT-LINKS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RIGHT-LINKS" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LEXES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LINKAGE" ), NIL,
                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STRING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "GET-ABS-INDEX" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-POS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CATEGORY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INDEX" ), NIL,
                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LEFT-LINKS" ), ConsesLow.list( makeSymbol( "LINK-NAME" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-RIGHT-LINKS" ), ConsesLow.list( makeSymbol( "LINK-NAME" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "GET-LINKS" ), ConsesLow.list( makeSymbol( "LINK-NAME" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTLY-RELATED" ), ConsesLow.list(
              makeSymbol( "LINK-NAME" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-RELATED" ), ConsesLow.list( makeSymbol( "LINK-PATH" ) ), makeKeyword(
                  "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                      "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LEXES" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POS-FILTER-LEXES" ), NIL, makeKeyword(
                          "PROTECTED" ) )
    } );
    $sym3$LEXES = makeSymbol( "LEXES" );
    $sym4$RIGHT_LINKS = makeSymbol( "RIGHT-LINKS" );
    $sym5$LEFT_LINKS = makeSymbol( "LEFT-LINKS" );
    $sym6$INDEX = makeSymbol( "INDEX" );
    $sym7$POS = makeSymbol( "POS" );
    $sym8$STRING = makeSymbol( "STRING" );
    $sym9$LINKAGE = makeSymbol( "LINKAGE" );
    $sym10$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym11$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-CLASS" );
    $sym12$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym13$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-INSTANCE" );
    $sym15$LINK_NAME = makeSymbol( "LINK-NAME" );
    $sym16$PRINT = makeSymbol( "PRINT" );
    $list17 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list18 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list19 = ConsesLow.list( new SubLObject[] { makeString( "Prints this link word to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol(
        "WRITE-STRING" ), makeString( "#<LW" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "(" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol(
            "POS" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "): " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol( "STRING" ),
                makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } );
    $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $str21$__LW = makeString( "#<LW" );
    $str22$_ = makeString( "(" );
    $str23$___ = makeString( "): " );
    $str24$_ = makeString( ">" );
    $sym25$WORD_LINKAGE_WORD_PRINT_METHOD = makeSymbol( "WORD-LINKAGE-WORD-PRINT-METHOD" );
    $sym26$GET_LINKAGE = makeSymbol( "GET-LINKAGE" );
    $list27 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list28 = ConsesLow.list( makeString( "@return word-linkage-p; the linkage this word is a part of" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LINKAGE" ) ) );
    $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym30$WORD_LINKAGE_WORD_GET_LINKAGE_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-LINKAGE-METHOD" );
    $sym31$GET_STRING = makeSymbol( "GET-STRING" );
    $list32 = ConsesLow.list( makeString( "@return string; the surface string of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STRING" ) ) );
    $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym34$WORD_LINKAGE_WORD_GET_STRING_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-STRING-METHOD" );
    $sym35$GET_ABS_INDEX = makeSymbol( "GET-ABS-INDEX" );
    $list36 = ConsesLow.list( makeString( "@return numberp; the absolute index of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INDEX" ) ) );
    $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym38$WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-ABS-INDEX-METHOD" );
    $sym39$GET_POS = makeSymbol( "GET-POS" );
    $list40 = ConsesLow.list( makeString( "@return keywordp; the part of speech of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "POS" ) ) );
    $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym42$WORD_LINKAGE_WORD_GET_POS_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-POS-METHOD" );
    $sym43$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $list44 = ConsesLow.list( makeString( "@return keywordp; the part of speech of this word" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-POS" ) ) ) ) );
    $sym45$WORD_LINKAGE_WORD_GET_CATEGORY_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-CATEGORY-METHOD" );
    $sym46$GET_INDEX = makeSymbol( "GET-INDEX" );
    $list47 = ConsesLow.list( makeString( "@return numberp; the index of this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INDEX" ) ) );
    $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym49$WORD_LINKAGE_WORD_GET_INDEX_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-INDEX-METHOD" );
    $sym50$GET_LEXES = makeSymbol( "GET-LEXES" );
    $list51 = ConsesLow.list( makeString( "@return numberp; the lexical items for this word" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) );
    $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym53$WORD_LINKAGE_WORD_GET_LEXES_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-LEXES-METHOD" );
    $sym54$GET_LEFT_LINKS = makeSymbol( "GET-LEFT-LINKS" );
    $list55 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "LINK-PATTERN" ) );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "LINK-PATTERN" ), makeSymbol( "REGEX-PATTERN-P" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LINK-PATTERN" ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEFT-LINKS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "LINKS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
            makeSymbol( "LINK" ), makeSymbol( "LEFT-LINKS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "REGEX-MATCH?" ), makeSymbol( "LINK-PATTERN" ), ConsesLow.list( makeSymbol(
                "LINK-NAME" ), makeSymbol( "LINK" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LINK" ), makeSymbol( "LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LINKS" ) ) ) );
    $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym58$REGEX_PATTERN_P = makeSymbol( "REGEX-PATTERN-P" );
    $sym59$WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-LEFT-LINKS-METHOD" );
    $sym60$GET_RIGHT_LINKS = makeSymbol( "GET-RIGHT-LINKS" );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "LINK-PATTERN" ), makeSymbol( "REGEX-PATTERN-P" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LINK-PATTERN" ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RIGHT-LINKS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "LINKS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
            makeSymbol( "LINK" ), makeSymbol( "RIGHT-LINKS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "REGEX-MATCH?" ), makeSymbol( "LINK-PATTERN" ), ConsesLow.list( makeSymbol(
                "LINK-NAME" ), makeSymbol( "LINK" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LINK" ), makeSymbol( "LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LINKS" ) ) ) );
    $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $sym63$WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-RIGHT-LINKS-METHOD" );
    $sym64$GET_LINKS = makeSymbol( "GET-LINKS" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "LINK-PATTERN" ), makeSymbol( "REGEX-PATTERN-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "APPEND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEFT-LINKS" ) ), makeSymbol( "LINK-PATTERN" ) ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RIGHT-LINKS" ) ), makeSymbol( "LINK-PATTERN" ) ) ) ) );
    $sym66$WORD_LINKAGE_WORD_GET_LINKS_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-LINKS-METHOD" );
    $sym67$GET_DIRECTLY_RELATED = makeSymbol( "GET-DIRECTLY-RELATED" );
    $list68 = ConsesLow.list( makeSymbol( "PATTERN-KEYWORD" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DIRECTION" ) );
    $list69 = ConsesLow.list( makeString( "@param PATTERN-KEYWORD keywordp;\n   @return list; the list of words that is related to this word via \n     PATTERN-KEYWORD" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
        .list( ConsesLow.list( makeSymbol( "LINK-PATTERN" ), ConsesLow.list( makeSymbol( "GET-LINK-PATTERN" ), makeSymbol( "PATTERN-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "LINK-GETTER" ), ConsesLow.list( makeSymbol(
            "FCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "DIRECTION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LINKS" ) ) ), ConsesLow.list( ConsesLow.list( EQL,
                makeSymbol( "DIRECTION" ), makeKeyword( "LEFT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEFT-LINKS" ) ) ), ConsesLow.list( ConsesLow.list( EQL, makeSymbol( "DIRECTION" ), makeKeyword(
                    "RIGHT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RIGHT-LINKS" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Invalid link direction ~a" ),
                        makeSymbol( "DIRECTION" ) ) ) ) ), makeSymbol( "WORDS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LINK" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                            "SELF" ), makeSymbol( "LINK-GETTER" ), makeSymbol( "LINK-PATTERN" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "LINK-LEFT-WORD" ), makeSymbol(
                                "LINK" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LINK-RIGHT-WORD" ), makeSymbol( "LINK" ) ), makeSymbol( "WORDS" ) ), ConsesLow.list(
                                    makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LINK-LEFT-WORD" ), makeSymbol( "LINK" ) ), makeSymbol( "WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                        "WORDS" ) ) ) );
    $kw70$LEFT = makeKeyword( "LEFT" );
    $kw71$RIGHT = makeKeyword( "RIGHT" );
    $str72$Invalid_link_direction__a = makeString( "Invalid link direction ~a" );
    $sym73$WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-DIRECTLY-RELATED-METHOD" );
    $sym74$GET_RELATED = makeSymbol( "GET-RELATED" );
    $list75 = ConsesLow.list( makeSymbol( "LINK-PATH" ) );
    $list76 = ConsesLow.list( makeString( "@param LINK-PATH list; a sequence of link-patterns\n   @return list; the list of words that is related to this word via LINK-PATH, \n      in that order" ), ConsesLow.list(
        makeSymbol( "PUNLESS" ), makeSymbol( "LINK-PATH" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
            makeSymbol( "WORDS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RELATED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-DIRECTLY-RELATED" ) ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "LINK-PATH" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WORDS" ), ConsesLow.list( makeSymbol(
                    "APPEND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "RELATED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RELATED" ) ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                        "LINK-PATH" ) ) ), makeSymbol( "WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "WORDS" ) ) ) );
    $sym77$WORD_LINKAGE_WORD_GET_RELATED_METHOD = makeSymbol( "WORD-LINKAGE-WORD-GET-RELATED-METHOD" );
    $sym78$LEXIFY = makeSymbol( "LEXIFY" );
    $list79 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PROTECTED" ) );
    $list80 = ConsesLow.list( makeSymbol( "LEXICON" ) );
    $list81 = ConsesLow.list( makeString(
        "@param LEXICON semtrans-lexicon-p; the lexicon to lexify this word with\n   @return listp; the list of lex entries used to lexify this word\n   @side-effects alters this word's lexes slot\n   see @xref link-word:lexify; this is a simpler version of that function" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ), ConsesLow
                .list( makeSymbol( "NEW-EVEN-LEX-ENTRY-DISTRIBUTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol(
                    "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ) ), ConsesLow
                        .list( makeSymbol( "CSETQ" ), makeSymbol( "FILTERED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS-FILTER-LEXES" ) ) ) ) ),
            ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ), makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXES" ) ) ) ) ) );
    $sym82$GET = makeSymbol( "GET" );
    $sym83$POS_FILTER_LEXES = makeSymbol( "POS-FILTER-LEXES" );
    $sym84$WORD_LINKAGE_WORD_LEXIFY_METHOD = makeSymbol( "WORD-LINKAGE-WORD-LEXIFY-METHOD" );
    $list85 = ConsesLow.list( makeString( "Removes any lexical entries that don't match the part-of-speech of this word" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ),
        NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ),
            ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ),
                makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), ONE_INTEGER ),
            ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "BACKOFF-PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), makeDouble( 0.75 ) ), ConsesLow.list( makeSymbol(
                        "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ),
                            makeSymbol( "LEXES" ) ) ) );
    $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD" );
    $kw87$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $kw88$BACKOFF_PENN_TAGS = makeKeyword( "BACKOFF-PENN-TAGS" );
    $float89$0_75 = makeDouble( 0.75 );
    $sym90$WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD = makeSymbol( "WORD-LINKAGE-WORD-POS-FILTER-LEXES-METHOD" );
    $list91 = ConsesLow.list( makeString( "LEFT-WALL" ), makeString( "RIGHT-WALL" ) );
    $sym92$WORD_LINKAGE = makeSymbol( "WORD-LINKAGE" );
    $list93 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LINKS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "WORDS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DIAGRAM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TREE-STRING" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-DIAGRAM" ),
                NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "XML" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "LENGTH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TREE-STRING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-WORD" ), ConsesLow.list( makeSymbol( "I" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LEXIFY" ),
                            ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "YIELD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SEARCH" ), ConsesLow.list( makeSymbol( "WORD-STRING" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym94$TREE_STRING = makeSymbol( "TREE-STRING" );
    $sym95$DIAGRAM = makeSymbol( "DIAGRAM" );
    $sym96$WORDS = makeSymbol( "WORDS" );
    $sym97$LINKS = makeSymbol( "LINKS" );
    $sym98$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-CLASS" );
    $sym99$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-INSTANCE" );
    $str100$ID = makeString( "ID" );
    $sym101$INCOMPLETE_LINK_ = makeSymbol( "INCOMPLETE-LINK?" );
    $sym102$VECTOR = makeSymbol( "VECTOR" );
    $str103$word_linkage = makeString( "word-linkage" );
    $str104$_a_is_not_a_linkage_xml_string = makeString( "~a is not a linkage xml string" );
    $str105$words = makeString( "words" );
    $str106$links = makeString( "links" );
    $str107$cat = makeString( "cat" );
    $str108$_ = makeString( "." );
    $list109 = ConsesLow.list( makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "OPTIONS" ), makeSymbol( "*LINK-PARSE-OPTIONS*" ) ), ConsesLow.list( makeSymbol( "LEXICON" ), NIL ), ConsesLow.list( makeSymbol(
        "USE-STANDARDIZED-WORD-STRINGS?" ), T ) );
    $list110 = ConsesLow.list( makeKeyword( "OPTIONS" ), makeKeyword( "LEXICON" ), makeKeyword( "USE-STANDARDIZED-WORD-STRINGS?" ) );
    $kw111$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw112$OPTIONS = makeKeyword( "OPTIONS" );
    $kw113$LEXICON = makeKeyword( "LEXICON" );
    $kw114$USE_STANDARDIZED_WORD_STRINGS_ = makeKeyword( "USE-STANDARDIZED-WORD-STRINGS?" );
    $sym115$STRINGP = makeSymbol( "STRINGP" );
    $sym116$LISTP = makeSymbol( "LISTP" );
    $list117 = ConsesLow.list( makeString( "Prints this word-linkage to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CDOVECTOR" ), ConsesLow
        .list( makeSymbol( "WORD" ), makeSymbol( "WORDS" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "WORD" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-METHOD" );
    $sym119$WORD_LINKAGE_PRINT_METHOD = makeSymbol( "WORD-LINKAGE-PRINT-METHOD" );
    $sym120$PRINT_DIAGRAM = makeSymbol( "PRINT-DIAGRAM" );
    $list121 = ConsesLow.list( makeString( "Prints this word-linkage's diagram" ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "DIAGRAM" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-METHOD" );
    $sym123$WORD_LINKAGE_PRINT_DIAGRAM_METHOD = makeSymbol( "WORD-LINKAGE-PRINT-DIAGRAM-METHOD" );
    $sym124$XML = makeSymbol( "XML" );
    $list125 = ConsesLow.list( makeString( "@return stringp; the XML string representation of this linkage" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "XML" ), ConsesLow.list( makeSymbol(
        "INDENT" ), ZERO_INTEGER ) ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "CWITH-OUTPUT-TO-STRING" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "XML" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "<word-linkage>~%" ) ),
          ConsesLow.list( makeSymbol( "TAB" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "INDENT" ), THREE_INTEGER ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
              makeString( "<words>~%" ) ), ConsesLow.list( makeSymbol( "DO-LINKAGE-WORDS" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "WORD-LINKAGE-WORD-XML" ),
                  makeSymbol( "WORD" ), makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "INDENT" ), SIX_INTEGER ) ) ), ConsesLow.list( makeSymbol( "TAB" ), ConsesLow.list( makeSymbol( "+" ),
                      makeSymbol( "INDENT" ), THREE_INTEGER ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "</words>~%" ) ), ConsesLow.list( makeSymbol(
                          "LINKS-XML" ), ConsesLow.list( makeSymbol( "GET-WORD-LINKAGE-LINKS" ), makeSymbol( "SELF" ) ), makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "INDENT" ),
                              THREE_INTEGER ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "</word-linkage>~%" ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "XML" ) ) ) );
    $str126$_word_linkage___ = makeString( "<word-linkage>~%" );
    $str127$_words___ = makeString( "<words>~%" );
    $str128$__words___ = makeString( "</words>~%" );
    $str129$__word_linkage___ = makeString( "</word-linkage>~%" );
    $sym130$WORD_LINKAGE_XML_METHOD = makeSymbol( "WORD-LINKAGE-XML-METHOD" );
    $str131$_word_cat___a___a__word___ = makeString( "<word cat=\"~a\">~a</word>~%" );
    $sym132$LENGTH = makeSymbol( "LENGTH" );
    $list133 = ConsesLow.list( makeString( "@return integerp; the number of words in this word-linkage" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "-" ), ConsesLow.list( makeSymbol( "LENGTH" ),
        makeSymbol( "WORDS" ) ), TWO_INTEGER ) ) );
    $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-METHOD" );
    $sym135$WORD_LINKAGE_LENGTH_METHOD = makeSymbol( "WORD-LINKAGE-LENGTH-METHOD" );
    $sym136$GET_TREE_STRING = makeSymbol( "GET-TREE-STRING" );
    $list137 = ConsesLow.list( makeString( "@return stringp; the tree of this word-linkage, as a string" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TREE-STRING" ) ) );
    $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-METHOD" );
    $sym139$WORD_LINKAGE_GET_TREE_STRING_METHOD = makeSymbol( "WORD-LINKAGE-GET-TREE-STRING-METHOD" );
    $sym140$GET_WORD = makeSymbol( "GET-WORD" );
    $list141 = ConsesLow.list( makeSymbol( "I" ) );
    $list142 = ConsesLow.list( makeString( "@param I non-negative-integer\n   @return word-linkage-word-p; the Ith word of this word-linkage" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "I" ), makeSymbol(
        "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "I" ), ConsesLow.list( makeSymbol( "1-" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol(
            "WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "WORDS" ), makeSymbol( "I" ) ) ) ) );
    $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-METHOD" );
    $sym144$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym145$WORD_LINKAGE_GET_WORD_METHOD = makeSymbol( "WORD-LINKAGE-GET-WORD-METHOD" );
    $list146 = ConsesLow.list( makeString( "@param LEXICON semtrans-lexicon-p; the lexicon to lexify with\n   @return word-linkage-p; this word-linkage destructively lexified with \n     lexicon" ), ConsesLow.list(
        makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEXICON" ), makeSymbol( "ABSTRACT-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "DO-LINKAGE-WORDS" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "SELF" ) ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol( "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym147$ABSTRACT_LEXICON_P = makeSymbol( "ABSTRACT-LEXICON-P" );
    $sym148$WORD_LINKAGE_LEXIFY_METHOD = makeSymbol( "WORD-LINKAGE-LEXIFY-METHOD" );
    $sym149$YIELD = makeSymbol( "YIELD" );
    $list150 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "YIELD" ) ), ConsesLow.list( makeSymbol( "DO-LINKAGE-WORDS" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol(
        "SELF" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "WORD" ), makeSymbol( "YIELD" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "YIELD" ) ) ) ) );
    $sym151$WORD_LINKAGE_YIELD_METHOD = makeSymbol( "WORD-LINKAGE-YIELD-METHOD" );
    $sym152$SEARCH = makeSymbol( "SEARCH" );
    $list153 = ConsesLow.list( makeSymbol( "WORD-STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "N" ), ONE_INTEGER ) );
    $list154 = ConsesLow.list( makeString( "@return word-linkage-word-p; the Nth word with string WORD-STRING" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "WORD-STRING" ), makeSymbol( "STRINGP" ) ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "N" ), makeSymbol( "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COUNTER" ),
            ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "WORDS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-WORD" ) ), makeSymbol(
                    "I" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "WORD-STRING" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "COUNTER" ) ), ConsesLow.list(
                        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "COUNTER" ), makeSymbol( "N" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-WORD" ) ), makeSymbol( "I" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-LINKAGE-METHOD" );
    $sym156$WORD_LINKAGE_SEARCH_METHOD = makeSymbol( "WORD-LINKAGE-SEARCH-METHOD" );
    $sym157$WORD_LINKAGE_P = makeSymbol( "WORD-LINKAGE-P" );
    $list158 = ConsesLow.list( makeKeyword( "CC" ), makeKeyword( "," ) );
    $str159$Failure_causing_word___S_has_link = makeString( "Failure-causing word: ~S has links: ~S~%" );
    $sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_ = makeSymbol( "WORD-LINKAGE-WITH-RETOKENIZATION-FAILED?" );
    $kw161$TEST = makeKeyword( "TEST" );
    $kw162$OWNER = makeKeyword( "OWNER" );
    $kw163$CLASSES = makeKeyword( "CLASSES" );
    $kw164$KB = makeKeyword( "KB" );
    $kw165$FULL = makeKeyword( "FULL" );
    $kw166$WORKING_ = makeKeyword( "WORKING?" );
    $list167 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "You are likely to find a grape in grocery store" ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
        "Canfor Corporation today reported net income of $18.9 million for the first quarter of 2006, or $0.13 per share on a diluted basis." ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString(
            "The man, the woman and the child slept" ) ), NIL ) );
  }
}
/*
 * 
 * Total time: 664 ms synthetic
 */