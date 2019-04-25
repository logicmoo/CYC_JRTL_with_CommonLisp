package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_writer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_writer";
  public static final String myFingerPrint = "ab1cc8e02cfa7690d1b2545c4c8f5fb6dab8c697be35befb3c1f3ab9e9ad1471";
  private static final SubLSymbol $sym0$XML_WRITER;
  private static final SubLSymbol $sym1$TEXT_WRITER;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$INSTANCE_NUMBER;
  private static final SubLSymbol $sym8$SUBLOOP_WRITER;
  private static final SubLSymbol $sym9$OPEN_FN;
  private static final SubLSymbol $sym10$OUTSTREAM;
  private static final SubLSymbol $sym11$INDENT_NUM;
  private static final SubLSymbol $sym12$INDENT_INCREMENT;
  private static final SubLSymbol $sym13$VERSION;
  private static final SubLSymbol $sym14$ENCODING;
  private static final SubLSymbol $sym15$STANDALONE;
  private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE;
  private static final SubLSymbol $sym17$INITIALIZE;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLFloat $float21$1_0;
  private static final SubLString $str22$US_ASCII;
  private static final SubLSymbol $sym23$XML_WRITER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym24$HEADER;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLSymbol $sym28$XML_WRITER_HEADER_METHOD;
  private static final SubLSymbol $sym29$CDATA;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLSymbol $sym33$STRINGP;
  private static final SubLSymbol $sym34$XML_WRITER_CDATA_METHOD;
  private static final SubLSymbol $sym35$MARKUP;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLSymbol $sym38$XML_WRITER_MARKUP_METHOD;
  private static final SubLSymbol $sym39$COMMENT;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLSymbol $sym42$XML_WRITER_COMMENT_METHOD;
  private static final SubLSymbol $sym43$START_TAG;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$LISTP;
  private static final SubLSymbol $sym48$INCREASE_INDENT;
  private static final SubLSymbol $sym49$XML_WRITER_START_TAG_METHOD;
  private static final SubLSymbol $sym50$END_TAG;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$DECREASE_INDENT;
  private static final SubLSymbol $sym55$XML_WRITER_END_TAG_METHOD;
  private static final SubLSymbol $sym56$XML_PRINT;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLSymbol $sym60$XML_WRITER_XML_PRINT_METHOD;
  private static final SubLSymbol $sym61$XML_PRINT_LINE;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD;
  private static final SubLSymbol $sym64$XML_WRITER_XML_PRINT_LINE_METHOD;
  private static final SubLString $str65$cyc_constant;
  private static final SubLString $str66$guid;
  private static final SubLString $str67$name;

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject get_xml_writer_standalone(final SubLObject v_xml_writer)
  {
    return classes.subloop_get_instance_slot( v_xml_writer, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject set_xml_writer_standalone(final SubLObject v_xml_writer, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_xml_writer, value, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject get_xml_writer_encoding(final SubLObject v_xml_writer)
  {
    return classes.subloop_get_instance_slot( v_xml_writer, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject set_xml_writer_encoding(final SubLObject v_xml_writer, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_xml_writer, value, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject get_xml_writer_version(final SubLObject v_xml_writer)
  {
    return classes.subloop_get_instance_slot( v_xml_writer, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject set_xml_writer_version(final SubLObject v_xml_writer, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_xml_writer, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject subloop_reserved_initialize_xml_writer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject subloop_reserved_initialize_xml_writer_instance(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$SUBLOOP_WRITER, $sym9$OPEN_FN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$SUBLOOP_WRITER, $sym10$OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    classes.subloop_initialize_slot( new_instance, $sym8$SUBLOOP_WRITER, $sym11$INDENT_NUM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$SUBLOOP_WRITER, $sym12$INDENT_INCREMENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$XML_WRITER, $sym13$VERSION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$XML_WRITER, $sym14$ENCODING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$XML_WRITER, $sym15$STANDALONE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
  public static SubLObject xml_writer_p(final SubLObject v_xml_writer)
  {
    return classes.subloop_instanceof_class( v_xml_writer, $sym0$XML_WRITER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2188L)
  public static SubLObject xml_writer_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    SubLObject standalone = get_xml_writer_standalone( self );
    SubLObject encoding = get_xml_writer_encoding( self );
    SubLObject version = get_xml_writer_version( self );
    try
    {
      thread.throwStack.push( $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        subloop_writer.text_writer_initialize_method( self );
        version = $float21$1_0;
        encoding = $str22$US_ASCII;
        standalone = T;
        Dynamic.sublisp_throw( $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_xml_writer_standalone( self, standalone );
          set_xml_writer_encoding( self, encoding );
          set_xml_writer_version( self, version );
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
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2358L)
  public static SubLObject xml_writer_header_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    final SubLObject standalone = get_xml_writer_standalone( self );
    final SubLObject encoding = get_xml_writer_encoding( self );
    final SubLObject version = get_xml_writer_version( self );
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( outstream, thread );
          xml_utilities.xml_header( version, encoding, standalone );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_xml_writer_standalone( self, standalone );
          set_xml_writer_encoding( self, encoding );
          set_xml_writer_version( self, version );
          subloop_writer.set_subloop_writer_outstream( self, outstream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2506L)
  public static SubLObject xml_writer_cdata_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( outstream, thread );
          xml_utilities.xml_cdata( string );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_writer.set_subloop_writer_outstream( self, outstream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2667L)
  public static SubLObject xml_writer_markup_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( outstream, thread );
          xml_utilities.xml_markup( string );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_writer.set_subloop_writer_outstream( self, outstream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2830L)
  public static SubLObject xml_writer_comment_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( outstream, thread );
          xml_utilities.xml_comment( string );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_writer.set_subloop_writer_outstream( self, outstream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2995L)
  public static SubLObject xml_writer_start_tag_method(final SubLObject self, final SubLObject name, final SubLObject attributes, final SubLObject atomic, final SubLObject newline)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num( self );
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.listp( attributes ) : attributes;
    string_utilities.indent( outstream, indent_num );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( outstream, thread );
      xml_utilities.xml_start_tag_internal( name, attributes, atomic, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    if( NIL != newline )
    {
      streams_high.write_char( Characters.CHAR_newline, outstream );
    }
    if( NIL == atomic )
    {
      methods.funcall_instance_method_with_0_args( self, $sym48$INCREASE_INDENT );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 3406L)
  public static SubLObject xml_writer_end_tag_method(final SubLObject self, final SubLObject name, final SubLObject indent, SubLObject newline)
  {
    if( newline == UNPROVIDED )
    {
      newline = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( name ) : name;
    methods.funcall_instance_method_with_0_args( self, $sym54$DECREASE_INDENT );
    final SubLObject cur_stream = subloop_writer.get_subloop_writer_outstream( self );
    if( NIL != indent )
    {
      string_utilities.indent( cur_stream, subloop_writer.get_subloop_writer_indent_num( self ) );
    }
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( cur_stream, thread );
      xml_utilities.xml_end_tag_internal( name );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    if( NIL != newline )
    {
      streams_high.write_char( Characters.CHAR_newline, cur_stream );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 3878L)
  public static SubLObject xml_writer_xml_print_method(final SubLObject self, final SubLObject string, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num( self );
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        if( NIL != indent )
        {
          string_utilities.indent( outstream, indent_num );
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( outstream, thread );
          xml_utilities.xml_print( string, UNPROVIDED );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_writer.set_subloop_writer_indent_num( self, indent_num );
          subloop_writer.set_subloop_writer_outstream( self, outstream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 4097L)
  public static SubLObject xml_writer_xml_print_line_method(final SubLObject self, final SubLObject string, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_writer_method = NIL;
    final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num( self );
    final SubLObject outstream = subloop_writer.get_subloop_writer_outstream( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        if( NIL != indent )
        {
          string_utilities.indent( outstream, indent_num );
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( outstream, thread );
          xml_utilities.xml_print_line( string, UNPROVIDED );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_writer.set_subloop_writer_indent_num( self, indent_num );
          subloop_writer.set_subloop_writer_outstream( self, outstream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_writer_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_writer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 4326L)
  public static SubLObject constant_to_xml(final SubLObject constant, final SubLObject v_xml_writer)
  {
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym43$START_TAG, $str65$cyc_constant, NIL, NIL, T );
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym43$START_TAG, $str66$guid, NIL, NIL, NIL );
    methods.funcall_instance_method_with_2_args( v_xml_writer, $sym56$XML_PRINT, Guids.guid_to_string( constants_high.constant_guid( constant ) ), NIL );
    methods.funcall_instance_method_with_2_args( v_xml_writer, $sym50$END_TAG, $str66$guid, NIL );
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym43$START_TAG, $str67$name, NIL, NIL, NIL );
    methods.funcall_instance_method_with_2_args( v_xml_writer, $sym56$XML_PRINT, constants_high.constant_name( constant ), NIL );
    methods.funcall_instance_method_with_2_args( v_xml_writer, $sym50$END_TAG, $str67$name, NIL );
    methods.funcall_instance_method_with_2_args( v_xml_writer, $sym50$END_TAG, $str65$cyc_constant, T );
    return T;
  }

  public static SubLObject declare_xml_writer_file()
  {
    SubLFiles.declareFunction( me, "get_xml_writer_standalone", "GET-XML-WRITER-STANDALONE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_xml_writer_standalone", "SET-XML-WRITER-STANDALONE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_xml_writer_encoding", "GET-XML-WRITER-ENCODING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_xml_writer_encoding", "SET-XML-WRITER-ENCODING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_xml_writer_version", "GET-XML-WRITER-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_xml_writer_version", "SET-XML-WRITER-VERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_writer_class", "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_p", "XML-WRITER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_initialize_method", "XML-WRITER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_header_method", "XML-WRITER-HEADER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_cdata_method", "XML-WRITER-CDATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_markup_method", "XML-WRITER-MARKUP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_comment_method", "XML-WRITER-COMMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_start_tag_method", "XML-WRITER-START-TAG-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_end_tag_method", "XML-WRITER-END-TAG-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "xml_writer_xml_print_method", "XML-WRITER-XML-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_writer_xml_print_line_method", "XML-WRITER-XML-PRINT-LINE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "constant_to_xml", "CONSTANT-TO-XML", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_xml_writer_file()
  {
    return NIL;
  }

  public static SubLObject setup_xml_writer_file()
  {
    classes.subloop_new_class( $sym0$XML_WRITER, $sym1$TEXT_WRITER, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$XML_WRITER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$XML_WRITER, $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$XML_WRITER, $sym16$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE );
    subloop_reserved_initialize_xml_writer_class( $sym0$XML_WRITER );
    methods.methods_incorporate_instance_method( $sym17$INITIALIZE, $sym0$XML_WRITER, $list18, NIL, $list19 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym17$INITIALIZE, $sym23$XML_WRITER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym24$HEADER, $sym0$XML_WRITER, $list25, NIL, $list26 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym24$HEADER, $sym28$XML_WRITER_HEADER_METHOD );
    methods.methods_incorporate_instance_method( $sym29$CDATA, $sym0$XML_WRITER, $list25, $list30, $list31 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym29$CDATA, $sym34$XML_WRITER_CDATA_METHOD );
    methods.methods_incorporate_instance_method( $sym35$MARKUP, $sym0$XML_WRITER, $list25, $list30, $list36 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym35$MARKUP, $sym38$XML_WRITER_MARKUP_METHOD );
    methods.methods_incorporate_instance_method( $sym39$COMMENT, $sym0$XML_WRITER, $list25, $list30, $list40 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym39$COMMENT, $sym42$XML_WRITER_COMMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym43$START_TAG, $sym0$XML_WRITER, $list44, $list45, $list46 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym43$START_TAG, $sym49$XML_WRITER_START_TAG_METHOD );
    methods.methods_incorporate_instance_method( $sym50$END_TAG, $sym0$XML_WRITER, $list51, $list52, $list53 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym50$END_TAG, $sym55$XML_WRITER_END_TAG_METHOD );
    methods.methods_incorporate_instance_method( $sym56$XML_PRINT, $sym0$XML_WRITER, $list25, $list57, $list58 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym56$XML_PRINT, $sym60$XML_WRITER_XML_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym61$XML_PRINT_LINE, $sym0$XML_WRITER, $list25, $list57, $list62 );
    methods.subloop_register_instance_method( $sym0$XML_WRITER, $sym61$XML_PRINT_LINE, $sym64$XML_WRITER_XML_PRINT_LINE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_writer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_writer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_writer_file();
  }
  static
  {
    me = new xml_writer();
    $sym0$XML_WRITER = makeSymbol( "XML-WRITER" );
    $sym1$TEXT_WRITER = makeSymbol( "TEXT-WRITER" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "VERSION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "ENCODING" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "STANDALONE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HEADER" ), NIL,
            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CDATA" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "MARKUP" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMMENT" ),
                    ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "START-TAG" ), ConsesLow.list( makeSymbol( "NAME" ), makeSymbol(
                        "ATTRIBUTES" ), makeSymbol( "ATOMIC" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "END-TAG" ), ConsesLow.list( makeSymbol( "NAME" ) ),
                            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "XML-PRINT" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "INDENT" ) ), makeKeyword(
                                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "XML-PRINT-LINE" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "INDENT" ) ), makeKeyword(
                                    "PUBLIC" ) )
    } );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym8$SUBLOOP_WRITER = makeSymbol( "SUBLOOP-WRITER" );
    $sym9$OPEN_FN = makeSymbol( "OPEN-FN" );
    $sym10$OUTSTREAM = makeSymbol( "OUTSTREAM" );
    $sym11$INDENT_NUM = makeSymbol( "INDENT-NUM" );
    $sym12$INDENT_INCREMENT = makeSymbol( "INDENT-INCREMENT" );
    $sym13$VERSION = makeSymbol( "VERSION" );
    $sym14$ENCODING = makeSymbol( "ENCODING" );
    $sym15$STANDALONE = makeSymbol( "STANDALONE" );
    $sym16$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-INSTANCE" );
    $sym17$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list18 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VERSION" ), makeDouble( 1.0 ) ), ConsesLow.list( makeSymbol(
        "CSETQ" ), makeSymbol( "ENCODING" ), makeString( "US-ASCII" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STANDALONE" ), T ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $float21$1_0 = makeDouble( 1.0 );
    $str22$US_ASCII = makeString( "US-ASCII" );
    $sym23$XML_WRITER_INITIALIZE_METHOD = makeSymbol( "XML-WRITER-INITIALIZE-METHOD" );
    $sym24$HEADER = makeSymbol( "HEADER" );
    $list25 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-STREAM*" ), makeSymbol( "OUTSTREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-HEADER" ), makeSymbol(
        "VERSION" ), makeSymbol( "ENCODING" ), makeSymbol( "STANDALONE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $sym28$XML_WRITER_HEADER_METHOD = makeSymbol( "XML-WRITER-HEADER-METHOD" );
    $sym29$CDATA = makeSymbol( "CDATA" );
    $list30 = ConsesLow.list( makeSymbol( "STRING" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "*XML-STREAM*" ), makeSymbol( "OUTSTREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-CDATA" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $sym33$STRINGP = makeSymbol( "STRINGP" );
    $sym34$XML_WRITER_CDATA_METHOD = makeSymbol( "XML-WRITER-CDATA-METHOD" );
    $sym35$MARKUP = makeSymbol( "MARKUP" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "*XML-STREAM*" ), makeSymbol( "OUTSTREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-MARKUP" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $sym38$XML_WRITER_MARKUP_METHOD = makeSymbol( "XML-WRITER-MARKUP-METHOD" );
    $sym39$COMMENT = makeSymbol( "COMMENT" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "*XML-STREAM*" ), makeSymbol( "OUTSTREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-COMMENT" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $sym42$XML_WRITER_COMMENT_METHOD = makeSymbol( "XML-WRITER-COMMENT-METHOD" );
    $sym43$START_TAG = makeSymbol( "START-TAG" );
    $list44 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PUBLIC" ) );
    $list45 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "ATOMIC" ), makeSymbol( "NEWLINE" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "LISTP" ) ),
        ConsesLow.list( makeSymbol( "INDENT" ), makeSymbol( "OUTSTREAM" ), makeSymbol( "INDENT-NUM" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-STREAM*" ), makeSymbol(
            "OUTSTREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-START-TAG-INTERNAL" ), makeSymbol( "NAME" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "ATOMIC" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                "NEWLINE" ), ConsesLow.list( makeSymbol( "WRITE-CHAR" ), Characters.CHAR_newline, makeSymbol( "OUTSTREAM" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "ATOMIC" ), ConsesLow.list(
                    makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INCREASE-INDENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                        "SELF" ) ) );
    $sym47$LISTP = makeSymbol( "LISTP" );
    $sym48$INCREASE_INDENT = makeSymbol( "INCREASE-INDENT" );
    $sym49$XML_WRITER_START_TAG_METHOD = makeSymbol( "XML-WRITER-START-TAG-METHOD" );
    $sym50$END_TAG = makeSymbol( "END-TAG" );
    $list51 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list52 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "INDENT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NEWLINE" ), T ) );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "DECREASE-INDENT" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-STREAM" ), ConsesLow.list( makeSymbol(
            "GET-SUBLOOP-WRITER-OUTSTREAM" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INDENT" ), ConsesLow.list( makeSymbol( "INDENT" ), makeSymbol( "CUR-STREAM" ), ConsesLow.list(
                makeSymbol( "GET-SUBLOOP-WRITER-INDENT-NUM" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-STREAM*" ), makeSymbol(
                    "CUR-STREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-END-TAG-INTERNAL" ), makeSymbol( "NAME" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NEWLINE" ), ConsesLow.list( makeSymbol(
                        "WRITE-CHAR" ), Characters.CHAR_newline, makeSymbol( "CUR-STREAM" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym54$DECREASE_INDENT = makeSymbol( "DECREASE-INDENT" );
    $sym55$XML_WRITER_END_TAG_METHOD = makeSymbol( "XML-WRITER-END-TAG-METHOD" );
    $sym56$XML_PRINT = makeSymbol( "XML-PRINT" );
    $list57 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "INDENT" ) );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INDENT" ), ConsesLow.list( makeSymbol(
        "INDENT" ), makeSymbol( "OUTSTREAM" ), makeSymbol( "INDENT-NUM" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-STREAM*" ), makeSymbol( "OUTSTREAM" ) ) ), ConsesLow
            .list( makeSymbol( "XML-PRINT" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $sym60$XML_WRITER_XML_PRINT_METHOD = makeSymbol( "XML-WRITER-XML-PRINT-METHOD" );
    $sym61$XML_PRINT_LINE = makeSymbol( "XML-PRINT-LINE" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INDENT" ), ConsesLow.list( makeSymbol(
        "INDENT" ), makeSymbol( "OUTSTREAM" ), makeSymbol( "INDENT-NUM" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-STREAM*" ), makeSymbol( "OUTSTREAM" ) ) ), ConsesLow
            .list( makeSymbol( "XML-PRINT-LINE" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-WRITER-METHOD" );
    $sym64$XML_WRITER_XML_PRINT_LINE_METHOD = makeSymbol( "XML-WRITER-XML-PRINT-LINE-METHOD" );
    $str65$cyc_constant = makeString( "cyc-constant" );
    $str66$guid = makeString( "guid" );
    $str67$name = makeString( "name" );
  }
}
/*
 * 
 * Total time: 172 ms
 * 
 */