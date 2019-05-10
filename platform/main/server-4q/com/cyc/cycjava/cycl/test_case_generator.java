package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class test_case_generator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.test_case_generator";
  public static final String myFingerPrint = "f2b523af83910aacd935fe520254223fa8f68f4060f10c1d5e0b86fc9dc905e6";
  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18264L)
  private static SubLSymbol $parse_tree_test_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18453L)
  private static SubLSymbol $parse_tree_syntax_test_file$;
  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18592L)
  private static SubLSymbol $cyclifier_test_file$;
  private static final SubLSymbol $sym0$SYMBOLP;
  private static final SubLSymbol $sym1$STRINGP;
  private static final SubLSymbol $sym2$LISTP;
  private static final SubLString $str3$No_such_file___a;
  private static final SubLSymbol $kw4$APPEND;
  private static final SubLString $str5$Unable_to_open__S;
  private static final SubLString $str6$Appending_test_cases_to_;
  private static final SubLString $str7$___;
  private static final SubLSymbol $kw8$INPUT;
  private static final SubLString $str9$_;
  private static final SubLSymbol $sym10$NEW;
  private static final SubLSymbol $sym11$GET_TEST_CASE_DEF;
  private static final SubLSymbol $sym12$GET_TEST_CASE_COMMENT;
  private static final SubLString $str13$Appending_test_case_to_;
  private static final SubLSymbol $sym14$TEST_CASE_GENERATOR;
  private static final SubLSymbol $sym15$OBJECT;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$NAME;
  private static final SubLSymbol $sym18$DATUM;
  private static final SubLSymbol $sym19$CATEGORIES;
  private static final SubLSymbol $sym20$SYSTEM;
  private static final SubLSymbol $sym21$MODULE;
  private static final SubLSymbol $sym22$INSTANCE_COUNT;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS;
  private static final SubLSymbol $sym24$ISOLATED_P;
  private static final SubLSymbol $sym25$INSTANCE_NUMBER;
  private static final SubLSymbol $sym26$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$TEST_CASE_GENERATOR_NEW_METHOD;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$GET_METHOD_DEFS;
  private static final SubLSymbol $sym33$GET_METHOD_DECLS;
  private static final SubLSymbol $sym34$GET_TEST_CASE_DECL;
  private static final SubLSymbol $sym35$GET_SETUP_DEF;
  private static final SubLSymbol $sym36$GET_CLEANUP_DEF;
  private static final SubLSymbol $sym37$TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD;
  private static final SubLSymbol $sym41$DEF_SETUP_METHOD;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD;
  private static final SubLSymbol $sym46$DEF_CLEANUP_METHOD;
  private static final SubLSymbol $sym47$TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$DEF_INSTANCE_METHOD;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD;
  private static final SubLString $str55$_________TEST___a_____CATEGORIES_;
  private static final SubLSymbol $sym56$TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD;
  private static final SubLSymbol $sym57$CYCLIFIER_TEST_CASE_GENERATOR;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$PARSE_EXPRESSION;
  private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS;
  private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD;
  private static final SubLSymbol $sym67$DEFINE_TEST_CASE;
  private static final SubLSymbol $kw68$CATEGORIES;
  private static final SubLSymbol $sym69$QUOTE;
  private static final SubLSymbol $sym70$PARSE_TREE;
  private static final SubLSymbol $kw71$INSTANCE;
  private static final SubLSymbol $kw72$PRIVATE;
  private static final SubLSymbol $kw73$VALUE;
  private static final SubLSymbol $sym74$NEW_PARSE_TREE;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD;
  private static final SubLString $str80$TEST_1;
  private static final SubLSymbol $sym81$CYCLIFY;
  private static final SubLSymbol $sym82$FAIL_UNLESS_EQUAL;
  private static final SubLSymbol $sym83$SELF;
  private static final SubLList $list84;
  private static final SubLString $str85$_cyclify__;
  private static final SubLString $str86$_______;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$DEF_TEST_METHOD;
  private static final SubLSymbol $sym89$CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD;
  private static final SubLSymbol $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR;
  private static final SubLSymbol $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR;
  private static final SubLSymbol $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR;
  private static final SubLSymbol $sym93$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD;
  private static final SubLSymbol $kw96$CLASS;
  private static final SubLSymbol $sym97$PROCESS_MODIFIERS;
  private static final SubLSymbol $sym98$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD;
  private static final SubLList $list101;
  private static final SubLString $str102$TEST_;
  private static final SubLSymbol $sym103$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD;
  private static final SubLSymbol $sym104$FIM;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$LIST;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$GET_DESCENDANT;
  private static final SubLString $str109$_;
  private static final SubLString $str110$_;
  private static final SubLString $str111$__;
  private static final SubLSymbol $sym112$GET_CATEGORY;
  private static final SubLSymbol $sym113$GET_STRING;
  private static final SubLString $str114$_;
  private static final SubLString $str115$______;
  private static final SubLString $str116$_;
  private static final SubLString $str117$TEST_CASE_;
  private static final SubLSymbol $sym118$IMPLEMENTS_METHOD_P;
  private static final SubLSymbol $sym119$GET_PATH;
  private static final SubLSymbol $kw120$DFR2L;
  private static final SubLSymbol $kw121$DFL2R;
  private static final SubLString $str122$_S_is_not_one_of__S;
  private static final SubLSymbol $sym123$EVAL;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$EQUALS_EL_;
  private static final SubLString $str126$__cvs_head_cycorp_cyc_top_tests_;
  private static final SubLString $str127$_parse_tree_syntax_tests_lisp;
  private static final SubLString $str128$cyclifier_tests_lisp;
  private static final SubLList $list129;
  private static final SubLString $str130$parse_tree;
  private static final SubLString $str131$cycl;
  private static final SubLList $list132;

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 1530L)
  public static SubLObject add_test_cases(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject in_file, final SubLObject out_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.symbolp( generator_class ) : generator_class;
    assert NIL != Types.stringp( module ) : module;
    assert NIL != Types.stringp( system ) : system;
    assert NIL != Types.listp( categories ) : categories;
    assert NIL != Types.stringp( in_file ) : in_file;
    assert NIL != Types.stringp( out_file ) : out_file;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Filesys.probe_file( in_file ) )
    {
      Errors.error( $str3$No_such_file___a, in_file );
    }
    SubLObject i = ZERO_INTEGER;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( out_file, $kw4$APPEND );
      if( !stream.isStream() )
      {
        Errors.error( $str5$Unable_to_open__S, out_file );
      }
      final SubLObject out = stream;
      print_high.princ( $str6$Appending_test_cases_to_, UNPROVIDED );
      print_high.princ( out_file, UNPROVIDED );
      print_high.princ( $str7$___, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      SubLObject stream_$1 = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream_$1 = compatibility.open_text( in_file, $kw8$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream_$1.isStream() )
        {
          Errors.error( $str5$Unable_to_open__S, in_file );
        }
        final SubLObject infile = stream_$1;
        if( infile.isStream() )
        {
          SubLObject datum;
          SubLObject generator;
          SubLObject declaration;
          SubLObject definitions;
          for( datum = NIL, datum = file_utilities.cdolines_get_next_line( infile ); NIL != datum; datum = file_utilities.cdolines_get_next_line( infile ) )
          {
            if( NIL != string_utilities.whitespace_stringP( datum ) || NIL != string_utilities.starts_with( datum, $str9$_ ) )
            {
              print_high.prin1( datum, out );
              streams_high.terpri( out );
            }
            else
            {
              generator = methods.funcall_class_method_with_4_args( generator_class, $sym10$NEW, module, system, datum, categories );
              thread.resetMultipleValues();
              declaration = methods.funcall_instance_method_with_0_args( generator, $sym11$GET_TEST_CASE_DEF );
              definitions = thread.secondMultipleValue();
              thread.resetMultipleValues();
              print_high.princ( datum, UNPROVIDED );
              streams_high.terpri( UNPROVIDED );
              dump_test_case( methods.funcall_instance_method_with_0_args( generator, $sym12$GET_TEST_CASE_COMMENT ), declaration, definitions, out );
              i = Numbers.add( i, Numbers.subtract( Sequences.length( definitions ), TWO_INTEGER ) );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream_$1.isStream() )
          {
            streams_high.close( stream_$1, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 3311L)
  public static SubLObject add_test_case(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject datum, final SubLObject out_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.symbolp( generator_class ) : generator_class;
    assert NIL != Types.stringp( module ) : module;
    assert NIL != Types.stringp( system ) : system;
    assert NIL != Types.listp( categories ) : categories;
    assert NIL != Types.stringp( out_file ) : out_file;
    SubLObject i = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( out_file, $kw4$APPEND );
      if( !stream.isStream() )
      {
        Errors.error( $str5$Unable_to_open__S, out_file );
      }
      final SubLObject out = stream;
      print_high.princ( $str13$Appending_test_case_to_, UNPROVIDED );
      print_high.princ( out_file, UNPROVIDED );
      print_high.princ( $str7$___, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      final SubLObject generator = methods.funcall_class_method_with_4_args( generator_class, $sym10$NEW, module, system, datum, categories );
      thread.resetMultipleValues();
      final SubLObject declaration = methods.funcall_instance_method_with_0_args( generator, $sym11$GET_TEST_CASE_DEF );
      final SubLObject definitions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      print_high.princ( datum, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      dump_test_case( methods.funcall_instance_method_with_0_args( generator, $sym12$GET_TEST_CASE_COMMENT ), declaration, definitions, out );
      i = Numbers.subtract( Sequences.length( definitions ), TWO_INTEGER );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject get_test_case_generator_name(final SubLObject v_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( v_test_case_generator, FIVE_INTEGER, $sym17$NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject set_test_case_generator_name(final SubLObject v_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_test_case_generator, value, FIVE_INTEGER, $sym17$NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject get_test_case_generator_datum(final SubLObject v_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( v_test_case_generator, FOUR_INTEGER, $sym18$DATUM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject set_test_case_generator_datum(final SubLObject v_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_test_case_generator, value, FOUR_INTEGER, $sym18$DATUM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject get_test_case_generator_categories(final SubLObject v_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( v_test_case_generator, THREE_INTEGER, $sym19$CATEGORIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject set_test_case_generator_categories(final SubLObject v_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_test_case_generator, value, THREE_INTEGER, $sym19$CATEGORIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject get_test_case_generator_system(final SubLObject v_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( v_test_case_generator, TWO_INTEGER, $sym20$SYSTEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject set_test_case_generator_system(final SubLObject v_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_test_case_generator, value, TWO_INTEGER, $sym20$SYSTEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject get_test_case_generator_module(final SubLObject v_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( v_test_case_generator, ONE_INTEGER, $sym21$MODULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject set_test_case_generator_module(final SubLObject v_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_test_case_generator, value, ONE_INTEGER, $sym21$MODULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject subloop_reserved_initialize_test_case_generator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym22$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject subloop_reserved_initialize_test_case_generator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym24$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym25$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym21$MODULE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym20$SYSTEM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym19$CATEGORIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym18$DATUM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym17$NAME, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
  public static SubLObject test_case_generator_p(final SubLObject v_test_case_generator)
  {
    return classes.subloop_instanceof_class( v_test_case_generator, $sym14$TEST_CASE_GENERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 5441L)
  public static SubLObject test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0)
  {
    assert NIL != Types.listp( categories0 ) : categories0;
    final SubLObject generator = object.new_class_instance( self );
    set_test_case_generator_module( generator, module0 );
    set_test_case_generator_system( generator, system0 );
    set_test_case_generator_datum( generator, datum0 );
    set_test_case_generator_categories( generator, categories0 );
    set_test_case_generator_name( generator, new_test_case_name() );
    return generator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 6326L)
  public static SubLObject test_case_generator_get_test_case_def_method(final SubLObject self)
  {
    final SubLObject method_definitions = methods.funcall_instance_method_with_0_args( self, $sym32$GET_METHOD_DEFS );
    final SubLObject method_declarations = methods.funcall_instance_method_with_1_args( self, $sym33$GET_METHOD_DECLS, method_definitions );
    final SubLObject test_case_declaration = methods.funcall_instance_method_with_1_args( self, $sym34$GET_TEST_CASE_DECL, method_declarations );
    return Values.values( test_case_declaration, ConsesLow.cons( methods.funcall_instance_method_with_0_args( self, $sym35$GET_SETUP_DEF ), ConsesLow.cons( methods.funcall_instance_method_with_0_args( self,
        $sym36$GET_CLEANUP_DEF ), method_definitions ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 6887L)
  public static SubLObject test_case_generator_get_setup_def_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_case_generator_method = NIL;
    final SubLObject name = get_test_case_generator_name( self );
    try
    {
      thread.throwStack.push( $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, ConsesLow.listS( $sym41$DEF_SETUP_METHOD, reader.bq_cons( name, $list38 ), $list42 ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_case_generator_name( self, name );
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
      catch_var_for_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 7070L)
  public static SubLObject test_case_generator_get_cleanup_def_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_case_generator_method = NIL;
    final SubLObject name = get_test_case_generator_name( self );
    try
    {
      thread.throwStack.push( $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, ConsesLow.listS( $sym46$DEF_CLEANUP_METHOD, reader.bq_cons( name, $list38 ), $list42 ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_case_generator_name( self, name );
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
      catch_var_for_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 7261L)
  public static SubLObject test_case_generator_get_method_decls_method(final SubLObject self, final SubLObject method_definitions)
  {
    SubLObject declarations = NIL;
    SubLObject cdolist_list_var = method_definitions;
    SubLObject method_def = NIL;
    method_def = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject method_name = conses_high.second( method_def ).first();
      declarations = ConsesLow.cons( ConsesLow.listS( $sym50$DEF_INSTANCE_METHOD, method_name, $list51 ), declarations );
      cdolist_list_var = cdolist_list_var.rest();
      method_def = cdolist_list_var.first();
    }
    return Sequences.nreverse( declarations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 7686L)
  public static SubLObject test_case_generator_get_test_case_comment_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_case_generator_method = NIL;
    final SubLObject datum = get_test_case_generator_datum( self );
    final SubLObject categories = get_test_case_generator_categories( self );
    try
    {
      thread.throwStack.push( $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, PrintLow.format( NIL, $str55$_________TEST___a_____CATEGORIES_, new SubLObject[] { datum, categories, numeric_date_utilities
            .get_universal_date( UNPROVIDED, UNPROVIDED ), system_info.cyc_revision_string(), control_vars.kb_loaded(), operation_communication.remote_ops_processed(), Environment.get_user_name( UNPROVIDED )
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_case_generator_datum( self, datum );
          set_test_case_generator_categories( self, categories );
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
      catch_var_for_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
  public static SubLObject get_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( cyclifier_test_case_generator, SIX_INTEGER, $sym59$PARSE_EXPRESSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
  public static SubLObject set_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyclifier_test_case_generator, value, SIX_INTEGER, $sym59$PARSE_EXPRESSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
  public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym22$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
  public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym24$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym25$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym21$MODULE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym20$SYSTEM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym19$CATEGORIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym18$DATUM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym17$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym59$PARSE_EXPRESSION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
  public static SubLObject cyclifier_test_case_generator_p(final SubLObject cyclifier_test_case_generator)
  {
    return classes.subloop_instanceof_class( cyclifier_test_case_generator, $sym57$CYCLIFIER_TEST_CASE_GENERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8436L)
  public static SubLObject cyclifier_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0)
  {
    final SubLObject generator = methods.funcall_class_super_method_with_4_args( self, $sym10$NEW, module0, system0, datum0, categories0 );
    set_cyclifier_test_case_generator_parse_expression( generator, conses_high.second( parser.charniak_parse( datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first() ) );
    return generator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 9171L)
  public static SubLObject cyclifier_test_case_generator_get_test_case_decl_method(final SubLObject self, final SubLObject method_declarations)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclifier_test_case_generator_method = NIL;
    final SubLObject parse_expression = get_cyclifier_test_case_generator_parse_expression( self );
    final SubLObject name = get_test_case_generator_name( self );
    final SubLObject categories = get_test_case_generator_categories( self );
    final SubLObject system = get_test_case_generator_system( self );
    final SubLObject module = get_test_case_generator_module( self );
    try
    {
      thread.throwStack.push( $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, ConsesLow.listS( $sym67$DEFINE_TEST_CASE, ConsesLow.list( name, module, system, $kw68$CATEGORIES, ConsesLow.list( $sym69$QUOTE,
            categories ) ), ConsesLow.list( $sym70$PARSE_TREE, $kw71$INSTANCE, $kw72$PRIVATE, $kw73$VALUE, ConsesLow.list( $sym74$NEW_PARSE_TREE, ConsesLow.list( $sym69$QUOTE, parse_expression ) ) ), $list75, $list76,
            ConsesLow.append( method_declarations, NIL ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclifier_test_case_generator_parse_expression( self, parse_expression );
          set_test_case_generator_name( self, name );
          set_test_case_generator_categories( self, categories );
          set_test_case_generator_system( self, system );
          set_test_case_generator_module( self, module );
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
      catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclifier_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 9698L)
  public static SubLObject cyclifier_test_case_generator_get_method_defs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclifier_test_case_generator_method = NIL;
    final SubLObject parse_expression = get_cyclifier_test_case_generator_parse_expression( self );
    final SubLObject name = get_test_case_generator_name( self );
    final SubLObject datum = get_test_case_generator_datum( self );
    try
    {
      thread.throwStack.push( $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD );
      try
      {
        final SubLObject method_name = Packages.intern( $str80$TEST_1, UNPROVIDED );
        final SubLObject cycls = methods.funcall_instance_method_with_0_args( parse_tree.new_parse_tree( parse_expression, UNPROVIDED, UNPROVIDED ), $sym81$CYCLIFY );
        final SubLObject method_body = ConsesLow.listS( $sym82$FAIL_UNLESS_EQUAL, $sym83$SELF, ConsesLow.list( $sym69$QUOTE, cycls ), $list84, Sequences.cconcatenate( $str85$_cyclify__, new SubLObject[] { datum,
          $str86$_______, print_high.princ_to_string( cycls )
        } ), $list87 );
        Dynamic.sublisp_throw( $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, ConsesLow.list( ConsesLow.list( $sym88$DEF_TEST_METHOD, ConsesLow.listS( method_name, name, $list38 ), NIL, method_body ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclifier_test_case_generator_parse_expression( self, parse_expression );
          set_test_case_generator_name( self, name );
          set_test_case_generator_datum( self, datum );
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
      catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclifier_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
  public static SubLObject get_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator)
  {
    return classes.subloop_get_access_protected_instance_slot( parse_tree_syntax_test_case_generator, SIX_INTEGER, $sym59$PARSE_EXPRESSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
  public static SubLObject set_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( parse_tree_syntax_test_case_generator, value, SIX_INTEGER, $sym59$PARSE_EXPRESSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
  public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym22$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
  public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym24$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$OBJECT, $sym25$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym21$MODULE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym20$SYSTEM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym19$CATEGORIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym18$DATUM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$TEST_CASE_GENERATOR, $sym17$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym59$PARSE_EXPRESSION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
  public static SubLObject parse_tree_syntax_test_case_generator_p(final SubLObject parse_tree_syntax_test_case_generator)
  {
    return classes.subloop_instanceof_class( parse_tree_syntax_test_case_generator, $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10606L)
  public static SubLObject parse_tree_syntax_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0)
  {
    final SubLObject generator = methods.funcall_class_super_method_with_4_args( self, $sym10$NEW, module0, system0, datum0, categories0 );
    set_cyclifier_test_case_generator_parse_expression( generator, conses_high.second( parser.charniak_parse( datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first() ) );
    return generator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 11353L)
  public static SubLObject parse_tree_syntax_test_case_generator_get_test_case_decl_method(final SubLObject self, final SubLObject method_declarations)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = NIL;
    final SubLObject parse_expression = get_parse_tree_syntax_test_case_generator_parse_expression( self );
    final SubLObject name = get_test_case_generator_name( self );
    final SubLObject categories = get_test_case_generator_categories( self );
    final SubLObject system = get_test_case_generator_system( self );
    final SubLObject module = get_test_case_generator_module( self );
    try
    {
      thread.throwStack.push( $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, ConsesLow.listS( $sym67$DEFINE_TEST_CASE, ConsesLow.list( name, module, system, $kw68$CATEGORIES, ConsesLow.list(
            $sym69$QUOTE, categories ) ), ConsesLow.list( $sym70$PARSE_TREE, $kw96$CLASS, $kw72$PRIVATE, $kw73$VALUE, ConsesLow.list( $sym97$PROCESS_MODIFIERS, ConsesLow.list( $sym74$NEW_PARSE_TREE, ConsesLow.list(
                $sym69$QUOTE, parse_expression ) ) ) ), $list75, $list76, ConsesLow.append( method_declarations, NIL ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_syntax_test_case_generator_parse_expression( self, parse_expression );
          set_test_case_generator_name( self, name );
          set_test_case_generator_categories( self, categories );
          set_test_case_generator_system( self, system );
          set_test_case_generator_module( self, module );
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
      catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_syntax_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 11905L)
  public static SubLObject parse_tree_syntax_test_case_generator_get_method_defs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = NIL;
    final SubLObject parse_expression = get_parse_tree_syntax_test_case_generator_parse_expression( self );
    final SubLObject name = get_test_case_generator_name( self );
    try
    {
      thread.throwStack.push( $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD );
      try
      {
        final SubLObject v_parse_tree = parse_tree.process_modifiers( parse_tree.new_parse_tree( parse_expression, UNPROVIDED, UNPROVIDED ) );
        final SubLObject test_data = get_parse_tree_test_data_recursively( v_parse_tree, $list101 );
        SubLObject i = ZERO_INTEGER;
        SubLObject method_definitions = NIL;
        SubLObject cdolist_list_var = test_data;
        SubLObject test_datum = NIL;
        test_datum = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          i = Numbers.add( i, ONE_INTEGER );
          final SubLObject method_name = Packages.intern( Sequences.cconcatenate( $str102$TEST_, print_high.princ_to_string( i ) ), UNPROVIDED );
          final SubLObject method_body = new_fail_unless_call( test_datum, v_parse_tree );
          method_definitions = ConsesLow.cons( ConsesLow.list( $sym88$DEF_TEST_METHOD, ConsesLow.listS( method_name, name, $list38 ), NIL, method_body ), method_definitions );
          cdolist_list_var = cdolist_list_var.rest();
          test_datum = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, Sequences.nreverse( method_definitions ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_syntax_test_case_generator_parse_expression( self, parse_expression );
          set_test_case_generator_name( self, name );
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
      catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable( ccatch_env_var, $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_syntax_test_case_generator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 12683L)
  public static SubLObject new_fail_unless_call(final SubLObject test_datum, final SubLObject v_parse_tree)
  {
    final SubLObject tree_path = test_datum.first();
    final SubLObject method_call = conses_high.second( test_datum );
    final SubLObject method_name = method_call.first();
    final SubLObject method_args = method_call.rest();
    final SubLObject result_paths = conses_high.third( test_datum );
    SubLObject result_calls = NIL;
    SubLObject result = NIL;
    if( NIL == result_paths )
    {
      result = NIL;
    }
    else if( NIL != Sequences.find_if( $sym2$LISTP, result_paths, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = result_paths;
      SubLObject result_path = NIL;
      result_path = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result_calls = ConsesLow.cons( ConsesLow.list( $sym104$FIM, $sym70$PARSE_TREE, $list105, ConsesLow.list( $sym69$QUOTE, result_path ) ), result_calls );
        cdolist_list_var = cdolist_list_var.rest();
        result_path = cdolist_list_var.first();
      }
      result = Sequences.nreverse( result_calls );
      result = ConsesLow.cons( $sym106$LIST, result );
    }
    else
    {
      result = ConsesLow.list( $sym104$FIM, $sym70$PARSE_TREE, $list105, ConsesLow.list( $sym69$QUOTE, result_paths ) );
    }
    return ConsesLow.listS( $sym82$FAIL_UNLESS_EQUAL, $sym83$SELF, ConsesLow.listS( $sym104$FIM, ConsesLow.list( $sym104$FIM, $sym70$PARSE_TREE, $list105, ConsesLow.list( $sym69$QUOTE, tree_path ) ), ConsesLow.list(
        $sym69$QUOTE, method_name ), ConsesLow.append( method_args, NIL ) ), result, new_syntax_test_failure_explanation( tree_path, method_call, result_paths, v_parse_tree ), $list107 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 13730L)
  public static SubLObject new_syntax_test_failure_explanation(final SubLObject tree_path, final SubLObject method_call, final SubLObject result_paths, final SubLObject v_parse_tree)
  {
    final SubLObject tree = methods.funcall_instance_method_with_1_args( v_parse_tree, $sym108$GET_DESCENDANT, tree_path );
    final SubLObject method_name = method_call.first();
    final SubLObject args = method_call.rest();
    final SubLObject results = classes_utilities.apply_instance_method( tree, method_call.first(), method_call.rest() );
    SubLObject result_strings = NIL;
    SubLObject result_string = NIL;
    SubLObject explanation = Sequences.cconcatenate( $str109$_, print_high.princ_to_string( method_name ) );
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      explanation = Sequences.cconcatenate( explanation, new SubLObject[] { $str110$_, print_high.princ_to_string( arg )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    explanation = Sequences.cconcatenate( explanation, new SubLObject[] { $str111$__, print_high.princ_to_string( methods.funcall_instance_method_with_0_args( tree, $sym112$GET_CATEGORY ) ), $str110$_, methods
        .funcall_instance_method_with_0_args( tree, $sym113$GET_STRING ), $str114$_
    } );
    if( NIL != list_utilities.non_empty_list_p( results ) )
    {
      cdolist_list_var = results;
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result_strings = ConsesLow.cons( Sequences.cconcatenate( $str109$_, new SubLObject[] { print_high.princ_to_string( methods.funcall_instance_method_with_0_args( result, $sym112$GET_CATEGORY ) ), $str110$_, methods
            .funcall_instance_method_with_0_args( result, $sym113$GET_STRING ), $str114$_
        } ), result_strings );
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
      result_string = string_utilities.bunge( Sequences.nreverse( result_strings ), UNPROVIDED );
    }
    else if( NIL != parse_tree.parse_tree_p( results ) )
    {
      result_string = Sequences.cconcatenate( $str109$_, new SubLObject[] { print_high.princ_to_string( methods.funcall_instance_method_with_0_args( results, $sym112$GET_CATEGORY ) ), $str110$_, methods
          .funcall_instance_method_with_0_args( results, $sym113$GET_STRING ), $str114$_
      } );
    }
    else
    {
      result_string = print_high.princ_to_string( results );
    }
    explanation = Sequences.cconcatenate( explanation, new SubLObject[] { $str115$______, result_string, $str116$_
    } );
    return explanation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 15282L)
  public static SubLObject new_test_case_name()
  {
    return Packages.intern( Sequences.cconcatenate( $str117$TEST_CASE_, print_high.princ_to_string( Time.get_internal_real_time() ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 15515L)
  public static SubLObject get_parse_tree_test_data(final SubLObject v_parse_tree, final SubLObject method_calls)
  {
    SubLObject test_data = NIL;
    SubLObject cdolist_list_var = method_calls;
    SubLObject method_call = NIL;
    method_call = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject method = method_call.first();
      final SubLObject args = method_call.rest();
      SubLObject results = NIL;
      SubLObject returned = NIL;
      if( NIL != methods.funcall_instance_method_with_1_args( v_parse_tree, $sym118$IMPLEMENTS_METHOD_P, method ) )
      {
        returned = classes_utilities.apply_instance_method( v_parse_tree, method, args );
        if( returned.isList() )
        {
          SubLObject cdolist_list_var_$2 = returned;
          SubLObject result = NIL;
          result = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            results = ConsesLow.cons( methods.funcall_instance_method_with_0_args( result, $sym119$GET_PATH ), results );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            result = cdolist_list_var_$2.first();
          }
          results = Sequences.nreverse( results );
        }
        else
        {
          results = methods.funcall_instance_method_with_0_args( returned, $sym119$GET_PATH );
        }
        test_data = ConsesLow.cons( ConsesLow.list( methods.funcall_instance_method_with_0_args( v_parse_tree, $sym119$GET_PATH ), method_call, results ), test_data );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method_call = cdolist_list_var.first();
    }
    return test_data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 16582L)
  public static SubLObject get_parse_tree_test_data_recursively(final SubLObject v_parse_tree, final SubLObject method_calls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject test_data = NIL;
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw120$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw121$DFL2R, $kw120$DFR2L );
    SubLObject sub = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str122$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( v_parse_tree, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      sub = stacks.stack_pop( stack );
      test_data = ConsesLow.append( get_parse_tree_test_data( sub, method_calls ), test_data );
      if( NIL != parse_tree.phrase_tree_p( sub ) )
      {
        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( sub );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw121$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter, stack );
        }
      }
    }
    return test_data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 17294L)
  public static SubLObject eval_test_case(final SubLObject declaration, final SubLObject definitions)
  {
    Eval.eval( declaration );
    Mapping.mapcar( $sym123$EVAL, definitions );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 17522L)
  public static SubLObject dump_test_case(final SubLObject comment, final SubLObject declaration, final SubLObject definitions, final SubLObject out)
  {
    print_high.princ( comment, out );
    streams_high.terpri( out );
    print_high.princ( $list124, out );
    streams_high.terpri( out );
    streams_high.terpri( out );
    print_high.prin1( declaration, out );
    streams_high.terpri( out );
    streams_high.terpri( out );
    SubLObject cdolist_list_var = definitions;
    SubLObject definition = NIL;
    definition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.prin1( definition, out );
      streams_high.terpri( out );
      streams_high.terpri( out );
      cdolist_list_var = cdolist_list_var.rest();
      definition = cdolist_list_var.first();
    }
    streams_high.terpri( out );
    return Sequences.length( definitions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 17959L)
  public static SubLObject cycls_equal_p(final SubLObject cycls1, final SubLObject cycls2)
  {
    return makeBoolean( Sequences.length( cycls1 ).numE( Sequences.length( cycls2 ) ) && NIL != conses_high.subsetp( cycls1, cycls2, $sym125$EQUALS_EL_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18714L)
  public static SubLObject add_syntax_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories)
  {
    if( out_file == UNPROVIDED )
    {
      out_file = $parse_tree_syntax_test_file$.getDynamicValue();
    }
    if( categories == UNPROVIDED )
    {
      categories = $list129;
    }
    return add_test_cases( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str130$parse_tree, $str131$cycl, categories, in_file, out_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 19184L)
  public static SubLObject add_syntax_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories)
  {
    if( out_file == UNPROVIDED )
    {
      out_file = $parse_tree_syntax_test_file$.getDynamicValue();
    }
    if( categories == UNPROVIDED )
    {
      categories = $list129;
    }
    return add_test_case( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str130$parse_tree, $str131$cycl, categories, sentence, out_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 19638L)
  public static SubLObject add_cyclifier_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories)
  {
    if( out_file == UNPROVIDED )
    {
      out_file = $cyclifier_test_file$.getDynamicValue();
    }
    if( categories == UNPROVIDED )
    {
      categories = $list132;
    }
    return add_test_cases( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $str130$parse_tree, $str131$cycl, categories, in_file, out_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 20085L)
  public static SubLObject add_cyclifier_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories)
  {
    if( out_file == UNPROVIDED )
    {
      out_file = $cyclifier_test_file$.getDynamicValue();
    }
    if( categories == UNPROVIDED )
    {
      categories = $list132;
    }
    return add_test_case( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $str130$parse_tree, $str131$cycl, categories, sentence, out_file );
  }

  public static SubLObject declare_test_case_generator_file()
  {
    SubLFiles.declareFunction( me, "add_test_cases", "ADD-TEST-CASES", 6, 0, false );
    SubLFiles.declareFunction( me, "add_test_case", "ADD-TEST-CASE", 6, 0, false );
    SubLFiles.declareFunction( me, "get_test_case_generator_name", "GET-TEST-CASE-GENERATOR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_test_case_generator_name", "SET-TEST-CASE-GENERATOR-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_test_case_generator_datum", "GET-TEST-CASE-GENERATOR-DATUM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_test_case_generator_datum", "SET-TEST-CASE-GENERATOR-DATUM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_test_case_generator_categories", "GET-TEST-CASE-GENERATOR-CATEGORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_test_case_generator_categories", "SET-TEST-CASE-GENERATOR-CATEGORIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_test_case_generator_system", "GET-TEST-CASE-GENERATOR-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_test_case_generator_system", "SET-TEST-CASE-GENERATOR-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_test_case_generator_module", "GET-TEST-CASE-GENERATOR-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_test_case_generator_module", "SET-TEST-CASE-GENERATOR-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_p", "TEST-CASE-GENERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_new_method", "TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_get_test_case_def_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_get_setup_def_method", "TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_get_cleanup_def_method", "TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_get_method_decls_method", "TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "test_case_generator_get_test_case_comment_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_test_case_generator_parse_expression", "GET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_test_case_generator_parse_expression", "SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_test_case_generator_p", "CYCLIFIER-TEST-CASE-GENERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_test_case_generator_new_method", "CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_test_case_generator_get_test_case_decl_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_test_case_generator_get_method_defs_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_syntax_test_case_generator_parse_expression", "GET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_syntax_test_case_generator_parse_expression", "SET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_syntax_test_case_generator_p", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_syntax_test_case_generator_new_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_syntax_test_case_generator_get_test_case_decl_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_syntax_test_case_generator_get_method_defs_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_fail_unless_call", "NEW-FAIL-UNLESS-CALL", 2, 0, false );
    SubLFiles.declareFunction( me, "new_syntax_test_failure_explanation", "NEW-SYNTAX-TEST-FAILURE-EXPLANATION", 4, 0, false );
    SubLFiles.declareFunction( me, "new_test_case_name", "NEW-TEST-CASE-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_test_data", "GET-PARSE-TREE-TEST-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_test_data_recursively", "GET-PARSE-TREE-TEST-DATA-RECURSIVELY", 2, 0, false );
    SubLFiles.declareFunction( me, "eval_test_case", "EVAL-TEST-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_test_case", "DUMP-TEST-CASE", 4, 0, false );
    SubLFiles.declareFunction( me, "cycls_equal_p", "CYCLS-EQUAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "add_syntax_test_cases", "ADD-SYNTAX-TEST-CASES", 1, 2, false );
    SubLFiles.declareFunction( me, "add_syntax_test_case", "ADD-SYNTAX-TEST-CASE", 1, 2, false );
    SubLFiles.declareFunction( me, "add_cyclifier_test_cases", "ADD-CYCLIFIER-TEST-CASES", 1, 2, false );
    SubLFiles.declareFunction( me, "add_cyclifier_test_case", "ADD-CYCLIFIER-TEST-CASE", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_test_case_generator_file()
  {
    $parse_tree_test_directory$ = SubLFiles.defparameter( "*PARSE-TREE-TEST-DIRECTORY*", $str126$__cvs_head_cycorp_cyc_top_tests_ );
    $parse_tree_syntax_test_file$ = SubLFiles.defparameter( "*PARSE-TREE-SYNTAX-TEST-FILE*", Sequences.cconcatenate( $parse_tree_test_directory$.getDynamicValue(), $str127$_parse_tree_syntax_tests_lisp ) );
    $cyclifier_test_file$ = SubLFiles.defparameter( "*CYCLIFIER-TEST-FILE*", Sequences.cconcatenate( $parse_tree_test_directory$.getDynamicValue(), $str128$cyclifier_tests_lisp ) );
    return NIL;
  }

  public static SubLObject setup_test_case_generator_file()
  {
    classes.subloop_new_class( $sym14$TEST_CASE_GENERATOR, $sym15$OBJECT, NIL, T, $list16 );
    classes.class_set_implements_slot_listeners( $sym14$TEST_CASE_GENERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym14$TEST_CASE_GENERATOR, $sym23$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym14$TEST_CASE_GENERATOR, $sym26$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE );
    subloop_reserved_initialize_test_case_generator_class( $sym14$TEST_CASE_GENERATOR );
    methods.methods_incorporate_class_method( $sym10$NEW, $sym14$TEST_CASE_GENERATOR, $list27, $list28, $list29 );
    methods.subloop_register_class_method( $sym14$TEST_CASE_GENERATOR, $sym10$NEW, $sym30$TEST_CASE_GENERATOR_NEW_METHOD );
    methods.methods_incorporate_instance_method( $sym11$GET_TEST_CASE_DEF, $sym14$TEST_CASE_GENERATOR, $list27, NIL, $list31 );
    methods.subloop_register_instance_method( $sym14$TEST_CASE_GENERATOR, $sym11$GET_TEST_CASE_DEF, $sym37$TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD );
    methods.methods_incorporate_instance_method( $sym35$GET_SETUP_DEF, $sym14$TEST_CASE_GENERATOR, $list38, NIL, $list39 );
    methods.subloop_register_instance_method( $sym14$TEST_CASE_GENERATOR, $sym35$GET_SETUP_DEF, $sym43$TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD );
    methods.methods_incorporate_instance_method( $sym36$GET_CLEANUP_DEF, $sym14$TEST_CASE_GENERATOR, $list38, NIL, $list44 );
    methods.subloop_register_instance_method( $sym14$TEST_CASE_GENERATOR, $sym36$GET_CLEANUP_DEF, $sym47$TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD );
    methods.methods_incorporate_instance_method( $sym33$GET_METHOD_DECLS, $sym14$TEST_CASE_GENERATOR, $list38, $list48, $list49 );
    methods.subloop_register_instance_method( $sym14$TEST_CASE_GENERATOR, $sym33$GET_METHOD_DECLS, $sym52$TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD );
    methods.methods_incorporate_instance_method( $sym12$GET_TEST_CASE_COMMENT, $sym14$TEST_CASE_GENERATOR, $list38, NIL, $list53 );
    methods.subloop_register_instance_method( $sym14$TEST_CASE_GENERATOR, $sym12$GET_TEST_CASE_COMMENT, $sym56$TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD );
    classes.subloop_new_class( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym14$TEST_CASE_GENERATOR, NIL, NIL, $list58 );
    classes.class_set_implements_slot_listeners( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym60$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC );
    subloop_reserved_initialize_cyclifier_test_case_generator_class( $sym57$CYCLIFIER_TEST_CASE_GENERATOR );
    methods.methods_incorporate_class_method( $sym10$NEW, $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $list38, $list28, $list62 );
    methods.subloop_register_class_method( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym10$NEW, $sym63$CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_TEST_CASE_DECL, $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $list38, $list64, $list65 );
    methods.subloop_register_instance_method( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym34$GET_TEST_CASE_DECL, $sym77$CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD );
    methods.methods_incorporate_instance_method( $sym32$GET_METHOD_DEFS, $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $list38, NIL, $list78 );
    methods.subloop_register_instance_method( $sym57$CYCLIFIER_TEST_CASE_GENERATOR, $sym32$GET_METHOD_DEFS, $sym89$CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD );
    classes.subloop_new_class( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym14$TEST_CASE_GENERATOR, NIL, NIL, $list58 );
    classes.class_set_implements_slot_listeners( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR );
    classes.subloop_note_instance_initialization_function( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR );
    subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR );
    methods.methods_incorporate_class_method( $sym10$NEW, $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $list38, $list28, $list62 );
    methods.subloop_register_class_method( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym10$NEW, $sym93$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_TEST_CASE_DECL, $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $list38, $list64, $list94 );
    methods.subloop_register_instance_method( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym34$GET_TEST_CASE_DECL, $sym98$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD );
    methods.methods_incorporate_instance_method( $sym32$GET_METHOD_DEFS, $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $list38, NIL, $list99 );
    methods.subloop_register_instance_method( $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym32$GET_METHOD_DEFS, $sym103$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_test_case_generator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_test_case_generator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_test_case_generator_file();
  }
  static
  {
    me = new test_case_generator();
    $parse_tree_test_directory$ = null;
    $parse_tree_syntax_test_file$ = null;
    $cyclifier_test_file$ = null;
    $sym0$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym1$STRINGP = makeSymbol( "STRINGP" );
    $sym2$LISTP = makeSymbol( "LISTP" );
    $str3$No_such_file___a = makeString( "No such file: ~a" );
    $kw4$APPEND = makeKeyword( "APPEND" );
    $str5$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str6$Appending_test_cases_to_ = makeString( "Appending test cases to " );
    $str7$___ = makeString( "..." );
    $kw8$INPUT = makeKeyword( "INPUT" );
    $str9$_ = makeString( ";" );
    $sym10$NEW = makeSymbol( "NEW" );
    $sym11$GET_TEST_CASE_DEF = makeSymbol( "GET-TEST-CASE-DEF" );
    $sym12$GET_TEST_CASE_COMMENT = makeSymbol( "GET-TEST-CASE-COMMENT" );
    $str13$Appending_test_case_to_ = makeString( "Appending test case to " );
    $sym14$TEST_CASE_GENERATOR = makeSymbol( "TEST-CASE-GENERATOR" );
    $sym15$OBJECT = makeSymbol( "OBJECT" );
    $list16 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "MODULE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SYSTEM" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CATEGORIES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DATUM" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NAME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "NEW" ), ConsesLow.list(
                makeSymbol( "MODULE" ), makeSymbol( "SYSTEM" ), makeSymbol( "DATUM" ), makeSymbol( "CATEGORIES" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "GET-TEST-CASE-DEF" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SETUP-DEF" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CLEANUP-DEF" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-METHOD-DEFS" ), NIL,
                            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-METHOD-DECLS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TEST-CASE-DECL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TEST-CASE-COMMENT" ),
                                    NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym17$NAME = makeSymbol( "NAME" );
    $sym18$DATUM = makeSymbol( "DATUM" );
    $sym19$CATEGORIES = makeSymbol( "CATEGORIES" );
    $sym20$SYSTEM = makeSymbol( "SYSTEM" );
    $sym21$MODULE = makeSymbol( "MODULE" );
    $sym22$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS" );
    $sym24$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym25$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym26$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE" );
    $list27 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list28 = ConsesLow.list( makeSymbol( "MODULE0" ), makeSymbol( "SYSTEM0" ), makeSymbol( "DATUM0" ), makeSymbol( "CATEGORIES0" ) );
    $list29 = ConsesLow.list( makeString(
        "@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "CATEGORIES0" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GENERATOR" ), ConsesLow.list(
            makeSymbol( "NEW-CLASS-INSTANCE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "SET-TEST-CASE-GENERATOR-MODULE" ), makeSymbol( "GENERATOR" ), makeSymbol( "MODULE0" ) ), ConsesLow.list(
                makeSymbol( "SET-TEST-CASE-GENERATOR-SYSTEM" ), makeSymbol( "GENERATOR" ), makeSymbol( "SYSTEM0" ) ), ConsesLow.list( makeSymbol( "SET-TEST-CASE-GENERATOR-DATUM" ), makeSymbol( "GENERATOR" ), makeSymbol(
                    "DATUM0" ) ), ConsesLow.list( makeSymbol( "SET-TEST-CASE-GENERATOR-CATEGORIES" ), makeSymbol( "GENERATOR" ), makeSymbol( "CATEGORIES0" ) ), ConsesLow.list( makeSymbol(
                        "SET-TEST-CASE-GENERATOR-NAME" ), makeSymbol( "GENERATOR" ), ConsesLow.list( makeSymbol( "NEW-TEST-CASE-NAME" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GENERATOR" ) ) ) );
    $sym30$TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol( "TEST-CASE-GENERATOR-NEW-METHOD" );
    $list31 = ConsesLow.list( makeString( "@return values; 1. a declaration of the test case and methods\n                   2. a definition of the test case and methods" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-DEFINITIONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-METHOD-DEFS" ) ) ) ),
            ConsesLow.list( makeSymbol( "METHOD-DECLARATIONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-METHOD-DECLS" ) ), makeSymbol(
                "METHOD-DEFINITIONS" ) ) ), ConsesLow.list( makeSymbol( "TEST-CASE-DECLARATION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-TEST-CASE-DECL" ) ), makeSymbol( "METHOD-DECLARATIONS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), makeSymbol( "TEST-CASE-DECLARATION" ), ConsesLow.list(
                        makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SETUP-DEF" ) ) ), ConsesLow.list( makeSymbol( "CONS" ),
                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CLEANUP-DEF" ) ) ), makeSymbol( "METHOD-DEFINITIONS" ) ) ) ) ) ) );
    $sym32$GET_METHOD_DEFS = makeSymbol( "GET-METHOD-DEFS" );
    $sym33$GET_METHOD_DECLS = makeSymbol( "GET-METHOD-DECLS" );
    $sym34$GET_TEST_CASE_DECL = makeSymbol( "GET-TEST-CASE-DECL" );
    $sym35$GET_SETUP_DEF = makeSymbol( "GET-SETUP-DEF" );
    $sym36$GET_CLEANUP_DEF = makeSymbol( "GET-CLEANUP-DEF" );
    $sym37$TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD = makeSymbol( "TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD" );
    $list38 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list39 = ConsesLow.list( makeString( "@return listp; a definition of a setup method" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "DEF-SETUP-METHOD" ) ), ConsesLow.list( makeSymbol( "BQ-CONS" ), makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "PROTECTED" ) ) ) ), ConsesLow.list(
            makeSymbol( "QUOTE" ), ConsesLow.list( NIL, ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ) ) );
    $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD" );
    $sym41$DEF_SETUP_METHOD = makeSymbol( "DEF-SETUP-METHOD" );
    $list42 = ConsesLow.list( NIL, ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym43$TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD = makeSymbol( "TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD" );
    $list44 = ConsesLow.list( makeString( "@return listp; a definition of a cleanup method" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "DEF-CLEANUP-METHOD" ) ), ConsesLow.list( makeSymbol( "BQ-CONS" ), makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "PROTECTED" ) ) ) ), ConsesLow.list(
            makeSymbol( "QUOTE" ), ConsesLow.list( NIL, ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ) ) );
    $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD" );
    $sym46$DEF_CLEANUP_METHOD = makeSymbol( "DEF-CLEANUP-METHOD" );
    $sym47$TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD = makeSymbol( "TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD" );
    $list48 = ConsesLow.list( makeSymbol( "METHOD-DEFINITIONS" ) );
    $list49 = ConsesLow.list( makeString( "@return listp; a list of method declarations for each method in METHOD-DEFINITIONS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "DECLARATIONS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "METHOD-DEF" ), makeSymbol( "METHOD-DEFINITIONS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
            ConsesLow.list( makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "METHOD-DEF" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                .list( makeSymbol( "BQ-LIST*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEF-INSTANCE-METHOD" ) ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( NIL,
                    makeKeyword( "PROTECTED" ) ) ) ), makeSymbol( "DECLARATIONS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "DECLARATIONS" ) ) ) ) );
    $sym50$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $list51 = ConsesLow.list( NIL, makeKeyword( "PROTECTED" ) );
    $sym52$TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD = makeSymbol( "TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD" );
    $list53 = ConsesLow.list( makeString( "@return stringp; a comment string for the test case this generator generates" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( new SubLObject[] { makeSymbol( "FORMAT" ),
      NIL, makeString( ";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%" ), makeSymbol( "DATUM" ), makeSymbol( "CATEGORIES" ), ConsesLow.list( makeSymbol(
          "GET-UNIVERSAL-DATE" ) ), ConsesLow.list( makeSymbol( "CYC-REVISION-STRING" ) ), ConsesLow.list( makeSymbol( "KB-LOADED" ) ), ConsesLow.list( makeSymbol( "REMOTE-OPS-PROCESSED" ) ), ConsesLow.list( makeSymbol(
              "GET-USER-NAME" ) )
    } ) ) );
    $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD" );
    $str55$_________TEST___a_____CATEGORIES_ = makeString( ";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%" );
    $sym56$TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD = makeSymbol( "TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD" );
    $sym57$CYCLIFIER_TEST_CASE_GENERATOR = makeSymbol( "CYCLIFIER-TEST-CASE-GENERATOR" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARSE-EXPRESSION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "NEW" ), NIL,
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TEST-CASE-DECL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "GET-METHOD-DEFS" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym59$PARSE_EXPRESSION = makeSymbol( "PARSE-EXPRESSION" );
    $sym60$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS" );
    $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE" );
    $list62 = ConsesLow.list( makeString(
        "@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GENERATOR" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-SUPER-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "NEW" ) ), makeSymbol( "MODULE0" ), makeSymbol( "SYSTEM0" ), makeSymbol( "DATUM0" ), makeSymbol( "CATEGORIES0" ) ) ) ), ConsesLow.list( makeSymbol(
                "SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION" ), makeSymbol( "GENERATOR" ), ConsesLow.list( makeSymbol( "SECOND" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                    "CHARNIAK-PARSE" ), makeSymbol( "DATUM0" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GENERATOR" ) ) ) );
    $sym63$CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol( "CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD" );
    $list64 = ConsesLow.list( makeSymbol( "METHOD-DECLARATIONS" ) );
    $list65 = ConsesLow.list( makeString( "@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods" ), ConsesLow.list( makeSymbol( "RET" ),
        ConsesLow.list( makeSymbol( "BQ-LIST*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFINE-TEST-CASE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "NAME" ), makeSymbol( "MODULE" ),
            makeSymbol( "SYSTEM" ), makeKeyword( "CATEGORIES" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) ), makeSymbol( "CATEGORIES" ) ) ), ConsesLow.list(
                makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE-TREE" ) ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol(
                    "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW-PARSE-TREE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) ),
                        makeSymbol( "PARSE-EXPRESSION" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SETUP" ), NIL, makeKeyword( "PROTECTED" ) ) ),
            ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEANUP" ), NIL, makeKeyword( "PROTECTED" ) ) ), ConsesLow.list( makeSymbol( "BQ-APPEND" ), makeSymbol(
                "METHOD-DECLARATIONS" ), NIL ) ) ) );
    $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD" );
    $sym67$DEFINE_TEST_CASE = makeSymbol( "DEFINE-TEST-CASE" );
    $kw68$CATEGORIES = makeKeyword( "CATEGORIES" );
    $sym69$QUOTE = makeSymbol( "QUOTE" );
    $sym70$PARSE_TREE = makeSymbol( "PARSE-TREE" );
    $kw71$INSTANCE = makeKeyword( "INSTANCE" );
    $kw72$PRIVATE = makeKeyword( "PRIVATE" );
    $kw73$VALUE = makeKeyword( "VALUE" );
    $sym74$NEW_PARSE_TREE = makeSymbol( "NEW-PARSE-TREE" );
    $list75 = ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SETUP" ), NIL, makeKeyword( "PROTECTED" ) );
    $list76 = ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEANUP" ), NIL, makeKeyword( "PROTECTED" ) );
    $sym77$CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = makeSymbol( "CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD" );
    $list78 = ConsesLow.list( makeString( "@return listp; a list of definitions of all test methods" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-NAME" ), ConsesLow.list(
        makeSymbol( "INTERN" ), makeString( "TEST-1" ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "NEW-PARSE-TREE" ), makeSymbol( "PARSE-EXPRESSION" ) ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY" ) ) ) ), ConsesLow.list( makeSymbol( "METHOD-BODY" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "FAIL-UNLESS-EQUAL" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) ), makeSymbol(
                    "CYCLS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY" ) ) ) ), ConsesLow
                        .list( makeSymbol( "CCONCATENATE" ), makeString( "(cyclify \"" ), makeSymbol( "DATUM" ), makeString( "\") =/= " ), ConsesLow.list( makeSymbol( "PRINC-TO-STRING" ), makeSymbol( "CYCLS" ) ) ),
                ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLS-EQUAL-P" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                    "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEF-TEST-METHOD" ) ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), makeSymbol( "METHOD-NAME" ),
                        makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "PROTECTED" ) ) ) ), NIL, makeSymbol( "METHOD-BODY" ) ) ) ) ) );
    $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD" );
    $str80$TEST_1 = makeString( "TEST-1" );
    $sym81$CYCLIFY = makeSymbol( "CYCLIFY" );
    $sym82$FAIL_UNLESS_EQUAL = makeSymbol( "FAIL-UNLESS-EQUAL" );
    $sym83$SELF = makeSymbol( "SELF" );
    $list84 = ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY" ) ) );
    $str85$_cyclify__ = makeString( "(cyclify \"" );
    $str86$_______ = makeString( "\") =/= " );
    $list87 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLS-EQUAL-P" ) ) );
    $sym88$DEF_TEST_METHOD = makeSymbol( "DEF-TEST-METHOD" );
    $sym89$CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = makeSymbol( "CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD" );
    $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol( "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR" );
    $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS" );
    $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE" );
    $sym93$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol( "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD" );
    $list94 = ConsesLow.list( makeString( "@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods" ), ConsesLow.list( makeSymbol( "RET" ),
        ConsesLow.list( makeSymbol( "BQ-LIST*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEFINE-TEST-CASE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "NAME" ), makeSymbol( "MODULE" ),
            makeSymbol( "SYSTEM" ), makeKeyword( "CATEGORIES" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) ), makeSymbol( "CATEGORIES" ) ) ), ConsesLow.list(
                makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE-TREE" ) ), makeKeyword( "CLASS" ), makeKeyword( "PRIVATE" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol(
                    "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROCESS-MODIFIERS" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "NEW-PARSE-TREE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) ), makeSymbol( "PARSE-EXPRESSION" ) ) ) ) ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SETUP" ), NIL, makeKeyword( "PROTECTED" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEANUP" ), NIL, makeKeyword( "PROTECTED" ) ) ), ConsesLow.list( makeSymbol( "BQ-APPEND" ), makeSymbol( "METHOD-DECLARATIONS" ), NIL ) ) ) );
    $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD" );
    $kw96$CLASS = makeKeyword( "CLASS" );
    $sym97$PROCESS_MODIFIERS = makeSymbol( "PROCESS-MODIFIERS" );
    $sym98$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = makeSymbol( "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD" );
    $list99 = ConsesLow.list( makeString( "@return listp; a list of definitions of all test methods" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PARSE-TREE" ), ConsesLow.list(
        makeSymbol( "PROCESS-MODIFIERS" ), ConsesLow.list( makeSymbol( "NEW-PARSE-TREE" ), makeSymbol( "PARSE-EXPRESSION" ) ) ) ), ConsesLow.list( makeSymbol( "TEST-DATA" ), ConsesLow.list( makeSymbol(
            "GET-PARSE-TREE-TEST-DATA-RECURSIVELY" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GET-COMPLEMENTS" ) ), ConsesLow.list( makeSymbol(
                "GET-MODIFIERS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "I" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "METHOD-DEFINITIONS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                    makeSymbol( "TEST-DATUM" ), makeSymbol( "TEST-DATA" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "METHOD-NAME" ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "TEST-" ), ConsesLow.list( makeSymbol( "PRINC-TO-STRING" ), makeSymbol(
                            "I" ) ) ) ) ), ConsesLow.list( makeSymbol( "METHOD-BODY" ), ConsesLow.list( makeSymbol( "NEW-FAIL-UNLESS-CALL" ), makeSymbol( "TEST-DATUM" ), makeSymbol( "PARSE-TREE" ) ) ) ), ConsesLow.list(
                                makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEF-TEST-METHOD" ) ), ConsesLow.list( makeSymbol( "BQ-LIST*" ),
                                    makeSymbol( "METHOD-NAME" ), makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "PROTECTED" ) ) ) ), NIL, makeSymbol( "METHOD-BODY" ) ),
                                makeSymbol( "METHOD-DEFINITIONS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "METHOD-DEFINITIONS" ) ) ) ) );
    $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD" );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-COMPLEMENTS" ) ), ConsesLow.list( makeSymbol( "GET-MODIFIERS" ) ) );
    $str102$TEST_ = makeString( "TEST-" );
    $sym103$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = makeSymbol( "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD" );
    $sym104$FIM = makeSymbol( "FIM" );
    $list105 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) );
    $sym106$LIST = makeSymbol( "LIST" );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) );
    $sym108$GET_DESCENDANT = makeSymbol( "GET-DESCENDANT" );
    $str109$_ = makeString( "(" );
    $str110$_ = makeString( " " );
    $str111$__ = makeString( " (" );
    $sym112$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $sym113$GET_STRING = makeSymbol( "GET-STRING" );
    $str114$_ = makeString( ")" );
    $str115$______ = makeString( ") =/= " );
    $str116$_ = makeString( "." );
    $str117$TEST_CASE_ = makeString( "TEST-CASE-" );
    $sym118$IMPLEMENTS_METHOD_P = makeSymbol( "IMPLEMENTS-METHOD-P" );
    $sym119$GET_PATH = makeSymbol( "GET-PATH" );
    $kw120$DFR2L = makeKeyword( "DFR2L" );
    $kw121$DFL2R = makeKeyword( "DFL2R" );
    $str122$_S_is_not_one_of__S = makeString( "~S is not one of ~S" );
    $sym123$EVAL = makeSymbol( "EVAL" );
    $list124 = ConsesLow.list( makeSymbol( "IN-PACKAGE" ), makeString( "CYC" ) );
    $sym125$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $str126$__cvs_head_cycorp_cyc_top_tests_ = makeString( "~/cvs/head/cycorp/cyc/top/tests/" );
    $str127$_parse_tree_syntax_tests_lisp = makeString( "/parse-tree-syntax-tests.lisp" );
    $str128$cyclifier_tests_lisp = makeString( "cyclifier-tests.lisp" );
    $list129 = ConsesLow.list( makeString( "Parse Tree Syntax Test" ) );
    $str130$parse_tree = makeString( "parse-tree" );
    $str131$cycl = makeString( "cycl" );
    $list132 = ConsesLow.list( makeString( "Cyclifier Test" ) );
  }
}
/*
 * 
 * Total time: 498 ms
 * 
 */