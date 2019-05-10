package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cfasl_kb_methods
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cfasl_kb_methods";
  public static final String myFingerPrint = "a085c9400e4481663941eb5956099c1e38cb191aa81992ca1d89b264bd518028";
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 839L)
  public static SubLSymbol $cfasl_reloc_side_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1111L)
  public static SubLSymbol $cfasl_reloc_last_address$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1273L)
  private static SubLSymbol $cfasl_reloc_eof_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1397L)
  private static SubLSymbol $cfasl_reloc_version_1p0a$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 4320L)
  public static SubLSymbol $report_cfasl_invalid_objectsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 4961L)
  public static SubLSymbol $within_complete_cfasl_objects$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 5875L)
  public static SubLSymbol $cfasl_externalized_constant_exceptions$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6311L)
  private static SubLSymbol $cfasl_opcode_constant$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6516L)
  private static SubLSymbol $cfasl_opcode_complete_constant$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 7567L)
  private static SubLSymbol $sample_invalid_constant$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 10856L)
  private static SubLSymbol $cfasl_opcode_nart$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11497L)
  private static SubLSymbol $sample_invalid_nart$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 13935L)
  private static SubLSymbol $cfasl_opcode_assertion$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14049L)
  public static SubLSymbol $cfasl_error_on_invalid_assertion_inputP$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14792L)
  private static SubLSymbol $sample_invalid_assertion$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 17951L)
  private static SubLSymbol $cfasl_opcode_deduction$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18687L)
  private static SubLSymbol $sample_invalid_deduction$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21858L)
  private static SubLSymbol $cfasl_opcode_kb_hl_support$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 22670L)
  private static SubLSymbol $sample_invalid_kb_hl_support$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 25332L)
  private static SubLSymbol $cfasl_opcode_clause_struc$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 26124L)
  private static SubLSymbol $sample_invalid_clause_struc$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 28874L)
  private static SubLSymbol $cfasl_opcode_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 28983L)
  private static SubLSymbol $cfasl_opcode_complete_variable$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 30193L)
  private static SubLSymbol $cfasl_opcode_sbhl_directed_link$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 31051L)
  private static SubLSymbol $cfasl_opcode_sbhl_undirected_link$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 31604L)
  private static SubLSymbol $cfasl_opcode_hl_start$;
  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 31830L)
  private static SubLSymbol $cfasl_opcode_hl_end$;
  private static final SubLInteger $int0$_101;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$_CFASL_RELOC_SIDE_STREAM_;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PROGN;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$STREAMVAR;
  private static final SubLSymbol $sym10$WITH_PRIVATE_BINARY_FILE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$WITH_CFASL_RELOC_SIDE_STREAM;
  private static final SubLSymbol $sym13$SHOW_CFASL_RELOCATION_INFORMATION;
  private static final SubLSymbol $kw14$INPUT;
  private static final SubLString $str15$Unable_to_open__S;
  private static final SubLString $str16$Unsupported_reloc_version__A_;
  private static final SubLString $str17$CFASL_Reloc_1_0a;
  private static final SubLString $str18$___EOF___;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$_CFASL_EXTERNALIZED_CONSTANT_EXCEPTIONS_;
  private static final SubLInteger $int22$30;
  private static final SubLSymbol $sym23$CFASL_INPUT_CONSTANT;
  private static final SubLInteger $int24$32;
  private static final SubLSymbol $sym25$CFASL_INPUT_COMPLETE_CONSTANT;
  private static final SubLSymbol $kw26$CONSTANT;
  private static final SubLSymbol $sym27$CFASL_OUTPUT_OBJECT_CONSTANT_METHOD;
  private static final SubLSymbol $sym28$_SAMPLE_INVALID_CONSTANT_;
  private static final SubLSymbol $sym29$CONSTANT_INTERNAL_ID;
  private static final SubLSymbol $sym30$CONSTANT_DUMP_ID;
  private static final SubLSymbol $sym31$FIND_CONSTANT_BY_INTERNAL_ID;
  private static final SubLSymbol $sym32$FIND_CONSTANT_BY_DUMP_ID;
  private static final SubLInteger $int33$31;
  private static final SubLSymbol $sym34$CFASL_INPUT_NART;
  private static final SubLSymbol $kw35$NART;
  private static final SubLSymbol $sym36$CFASL_OUTPUT_OBJECT_NART_METHOD;
  private static final SubLSymbol $sym37$_SAMPLE_INVALID_NART_;
  private static final SubLSymbol $kw38$NART_HL_FORMULA;
  private static final SubLSymbol $kw39$NIL;
  private static final SubLSymbol $sym40$NART_ID;
  private static final SubLSymbol $sym41$NART_DUMP_ID;
  private static final SubLSymbol $sym42$FIND_NART_BY_ID;
  private static final SubLSymbol $sym43$FIND_NART_BY_DUMP_ID;
  private static final SubLInteger $int44$33;
  private static final SubLSymbol $sym45$CFASL_INPUT_ASSERTION;
  private static final SubLSymbol $kw46$ASSERTION;
  private static final SubLSymbol $sym47$CFASL_OUTPUT_OBJECT_ASSERTION_METHOD;
  private static final SubLSymbol $sym48$_SAMPLE_INVALID_ASSERTION_;
  private static final SubLString $str49$Failed_to_input_assertion_with_CN;
  private static final SubLSymbol $kw50$NULL_CNF;
  private static final SubLSymbol $kw51$NULL_MT;
  private static final SubLString $str52$Failed_to_input_assertion_with_ha;
  private static final SubLSymbol $sym53$ASSERTION_ID;
  private static final SubLSymbol $sym54$ASSERTION_DUMP_ID;
  private static final SubLSymbol $sym55$FIND_ASSERTION_BY_ID;
  private static final SubLSymbol $sym56$FIND_ASSERTION_BY_DUMP_ID;
  private static final SubLInteger $int57$36;
  private static final SubLSymbol $sym58$CFASL_INPUT_DEDUCTION;
  private static final SubLSymbol $kw59$DEDUCTION;
  private static final SubLSymbol $sym60$CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD;
  private static final SubLSymbol $sym61$_SAMPLE_INVALID_DEDUCTION_;
  private static final SubLSymbol $kw62$NULL_SUPPORTED_OBJECT;
  private static final SubLSymbol $kw63$NULL_SUPPORTS;
  private static final SubLSymbol $kw64$NULL_TRUTH;
  private static final SubLSymbol $sym65$DEDUCTION_ID;
  private static final SubLSymbol $sym66$DEDUCTION_DUMP_ID;
  private static final SubLSymbol $sym67$FIND_DEDUCTION_BY_ID;
  private static final SubLSymbol $sym68$FIND_DEDUCTION_BY_DUMP_ID;
  private static final SubLInteger $int69$37;
  private static final SubLSymbol $sym70$CFASL_INPUT_KB_HL_SUPPORT;
  private static final SubLSymbol $kw71$KB_HL_SUPPORT;
  private static final SubLSymbol $sym72$CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD;
  private static final SubLSymbol $sym73$_SAMPLE_INVALID_KB_HL_SUPPORT_;
  private static final SubLSymbol $sym74$KB_HL_SUPPORT_ID;
  private static final SubLSymbol $sym75$KB_HL_SUPPORT_DUMP_ID;
  private static final SubLSymbol $sym76$FIND_KB_HL_SUPPORT_BY_ID;
  private static final SubLSymbol $sym77$FIND_KB_HL_SUPPORT_BY_DUMP_ID;
  private static final SubLInteger $int78$38;
  private static final SubLSymbol $sym79$CFASL_INPUT_CLAUSE_STRUC;
  private static final SubLSymbol $kw80$CLAUSE_STRUC;
  private static final SubLSymbol $sym81$CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD;
  private static final SubLSymbol $sym82$_SAMPLE_INVALID_CLAUSE_STRUC_;
  private static final SubLSymbol $sym83$CLAUSE_STRUC_ID;
  private static final SubLSymbol $sym84$CLAUSE_STRUC_DUMP_ID;
  private static final SubLSymbol $sym85$FIND_CLAUSE_STRUC_BY_ID;
  private static final SubLSymbol $sym86$FIND_CLAUSE_STRUC_BY_DUMP_ID;
  private static final SubLInteger $int87$40;
  private static final SubLSymbol $sym88$CFASL_INPUT_VARIABLE;
  private static final SubLInteger $int89$42;
  private static final SubLSymbol $sym90$CFASL_INPUT_COMPLETE_VARIABLE;
  private static final SubLSymbol $sym91$CFASL_OUTPUT_OBJECT_VARIABLE_METHOD;
  private static final SubLSymbol $sym92$CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD;
  private static final SubLInteger $int93$90;
  private static final SubLSymbol $sym94$CFASL_INPUT_SBHL_DIRECTED_LINK;
  private static final SubLSymbol $sym95$CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD;
  private static final SubLInteger $int96$91;
  private static final SubLSymbol $sym97$CFASL_INPUT_SBHL_UNDIRECTED_LINK;
  private static final SubLInteger $int98$94;
  private static final SubLSymbol $sym99$CFASL_INPUT_HL_START;
  private static final SubLInteger $int100$95;
  private static final SubLSymbol $sym101$CFASL_INPUT_HL_END;
  private static final SubLSymbol $sym102$CFASL_OUTPUT_OBJECT_HL_START_METHOD;
  private static final SubLSymbol $sym103$CFASL_OUTPUT_OBJECT_HL_END_METHOD;
  private static final SubLSymbol $sym104$CFASL_ENCODE;
  private static final SubLSymbol $kw105$TEST;
  private static final SubLSymbol $kw106$OWNER;
  private static final SubLSymbol $kw107$CLASSES;
  private static final SubLSymbol $kw108$KB;
  private static final SubLSymbol $kw109$TINY;
  private static final SubLSymbol $kw110$WORKING_;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$CFASL_DECODE;
  private static final SubLList $list113;

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1615L)
  public static SubLObject valid_cfasl_reloc_side_stream_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Types.streamp( $cfasl_reloc_side_stream$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 1775L)
  public static SubLObject cfasl_output_reloc_address(final SubLObject file_position)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject previous = $cfasl_reloc_last_address$.getDynamicValue( thread );
    final SubLObject delta = Numbers.subtract( file_position, previous );
    cfasl.cfasl_output( delta, $cfasl_reloc_side_stream$.getDynamicValue( thread ) );
    $cfasl_reloc_last_address$.setDynamicValue( file_position, thread );
    return delta;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2049L)
  public static SubLObject possibly_output_cfasl_reloc_position(final SubLObject stream)
  {
    if( NIL != valid_cfasl_reloc_side_stream_p() )
    {
      cfasl_output_reloc_address( streams_high.file_position( stream, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2227L)
  public static SubLObject possibly_output_adjusted_cfasl_reloc_position(final SubLObject stream, SubLObject adjustment)
  {
    if( adjustment == UNPROVIDED )
    {
      adjustment = MINUS_ONE_INTEGER;
    }
    if( NIL != valid_cfasl_reloc_side_stream_p() )
    {
      SubLObject address = streams_high.file_position( stream, UNPROVIDED );
      address = Numbers.add( address, adjustment );
      cfasl_output_reloc_address( address );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2718L)
  public static SubLObject cfasl_output_reloc_version_1p0a()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return cfasl.cfasl_output( $cfasl_reloc_version_1p0a$.getGlobalValue(), $cfasl_reloc_side_stream$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 2899L)
  public static SubLObject cfasl_output_reloc_footer()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return cfasl.cfasl_output( $cfasl_reloc_eof_marker$.getGlobalValue(), $cfasl_reloc_side_stream$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3058L)
  public static SubLObject with_cfasl_reloc_side_stream(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    stream = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym2$CLET, reader.bq_cons( ConsesLow.list( $sym3$_CFASL_RELOC_SIDE_STREAM_, stream ), $list4 ), $list5, reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) ), $list7 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3386L)
  public static SubLObject with_cfasl_reloc_side_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    filename = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject streamvar = $sym9$STREAMVAR;
      return ConsesLow.list( $sym10$WITH_PRIVATE_BINARY_FILE, ConsesLow.listS( streamvar, filename, $list11 ), ConsesLow.listS( $sym12$WITH_CFASL_RELOC_SIDE_STREAM, ConsesLow.list( streamvar ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 3697L)
  public static SubLObject show_cfasl_relocation_information(final SubLObject filename, SubLObject output)
  {
    if( output == UNPROVIDED )
    {
      output = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw14$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      final SubLObject version = cfasl.cfasl_input( s, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !version.numE( $cfasl_reloc_version_1p0a$.getGlobalValue() ) )
      {
        Errors.error( $str16$Unsupported_reloc_version__A_, version );
      }
      streams_high.write_string( $str17$CFASL_Reloc_1_0a, output, UNPROVIDED, UNPROVIDED );
      SubLObject address = ZERO_INTEGER;
      SubLObject offset;
      for( offset = NIL, offset = cfasl.cfasl_input( s, UNPROVIDED, UNPROVIDED ); offset.isPositive(); offset = cfasl.cfasl_input( s, UNPROVIDED, UNPROVIDED ) )
      {
        address = Numbers.add( address, offset );
        print_high.print( address, output );
      }
      streams_high.terpri( output );
      streams_high.write_string( $str18$___EOF___, output, UNPROVIDED, UNPROVIDED );
      streams_high.terpri( output );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 4614L)
  public static SubLObject with_cfasl_invalid_object_reporting(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list19, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 4837L)
  public static SubLObject report_cfasl_invalid_objectsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $report_cfasl_invalid_objectsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 5370L)
  public static SubLObject within_complete_cfasl_objects_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_complete_cfasl_objects$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 5594L)
  public static SubLObject with_cfasl_externalized_constant_exceptions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject constants = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    constants = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym21$_CFASL_EXTERNALIZED_CONSTANT_EXCEPTIONS_, constants ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6116L)
  public static SubLObject cfasl_externalized_constant_exception_p(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $cfasl_externalized_constant_exceptions$.getDynamicValue( thread ) && NIL != set.set_memberP( constant, $cfasl_externalized_constant_exceptions$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 6605L)
  public static SubLObject cfasl_output_constant(final SubLObject constant, final SubLObject stream)
  {
    if( NIL != report_cfasl_invalid_objectsP() && NIL == constant_handles.valid_constantP( constant, UNPROVIDED ) )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw26$CONSTANT, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != within_complete_cfasl_objects_p() )
    {
      cfasl.cfasl_raw_write_byte( $cfasl_opcode_complete_constant$.getGlobalValue(), stream );
      cfasl_output_constant_recipe( constant, stream );
      final SubLObject name = constants_high.constant_name( constant );
      if( name.isString() )
      {
        cfasl.cfasl_output_string( name, stream );
      }
      else
      {
        cfasl.cfasl_output( name, stream );
      }
    }
    else
    {
      cfasl.cfasl_raw_write_byte( $cfasl_opcode_constant$.getGlobalValue(), stream );
      if( NIL != cfasl.within_cfasl_externalization_p() )
      {
        cfasl_output_constant_recipe( constant, stream );
      }
      else
      {
        possibly_output_adjusted_cfasl_reloc_position( stream, UNPROVIDED );
        cfasl_output_constant_handle( constant, stream );
      }
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 7457L)
  public static SubLObject cfasl_output_object_constant_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_constant( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 7655L)
  public static SubLObject cfasl_invalid_constant()
  {
    return $sample_invalid_constant$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 7735L)
  public static SubLObject cfasl_input_constant(final SubLObject stream)
  {
    SubLObject constant = NIL;
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      constant = cfasl_input_constant_recipe( stream );
    }
    else
    {
      constant = cfasl_input_constant_handle( stream );
    }
    if( NIL == constant )
    {
      constant = $sample_invalid_constant$.getGlobalValue();
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8049L)
  public static SubLObject cfasl_input_complete_constant(final SubLObject stream)
  {
    SubLObject constant = NIL;
    constant = cfasl_input_constant_recipe( stream );
    cfasl.cfasl_input_object( stream );
    if( NIL == constant )
    {
      constant = $sample_invalid_constant$.getGlobalValue();
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8441L)
  public static SubLObject cfasl_output_constant_recipe(final SubLObject constant, final SubLObject stream)
  {
    if( NIL != cfasl_externalized_constant_exception_p( constant ) )
    {
      return cfasl_output_constant_handle( constant, stream );
    }
    final SubLObject external_id = constants_high.constant_external_id( constant );
    cfasl.cfasl_output( external_id, stream );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 8755L)
  public static SubLObject cfasl_input_constant_recipe(final SubLObject stream)
  {
    final SubLObject id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject constant = NIL;
    if( NIL != constants_high.constant_external_id_p( id ) )
    {
      constant = constants_high.find_constant_by_external_id( id );
    }
    else if( NIL != constants_high.constant_internal_id_p( id ) )
    {
      constant = cfasl_constant_handle_lookup( id );
    }
    if( NIL == constant && NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw26$CONSTANT, id, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 9330L)
  public static SubLObject cfasl_output_constant_handle(final SubLObject constant, final SubLObject stream)
  {
    cfasl.cfasl_output( cfasl_constant_handle( constant ), stream );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 9493L)
  public static SubLObject cfasl_input_constant_handle(final SubLObject stream)
  {
    final SubLObject handle = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject constant = cfasl_constant_handle_lookup( handle );
    if( ( NIL == constant || $sample_invalid_constant$.getGlobalValue().eql( constant ) ) && NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw26$CONSTANT, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 9871L)
  public static SubLObject cfasl_constant_handle(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constant_handles.invalid_constantP( constant, UNPROVIDED ) )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject method = api_control_vars.$cfasl_constant_handle_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return constants_high.constant_internal_id( constant );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym29$CONSTANT_INTERNAL_ID ) )
    {
      return constants_high.constant_internal_id( constant );
    }
    if( pcase_var.eql( $sym30$CONSTANT_DUMP_ID ) )
    {
      return constants_high.constant_dump_id( constant );
    }
    return Functions.funcall( method, constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 10350L)
  public static SubLObject cfasl_constant_handle_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.non_negative_integer_p( id ) )
    {
      return $sample_invalid_constant$.getGlobalValue();
    }
    final SubLObject method = api_control_vars.$cfasl_constant_handle_lookup_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return constants_high.find_constant_by_internal_id( id );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym31$FIND_CONSTANT_BY_INTERNAL_ID ) )
    {
      return constants_high.find_constant_by_internal_id( id );
    }
    if( pcase_var.eql( $sym32$FIND_CONSTANT_BY_DUMP_ID ) )
    {
      return constants_high.find_constant_by_dump_id( id );
    }
    return Functions.funcall( method, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 10945L)
  public static SubLObject cfasl_output_nart(final SubLObject nart, final SubLObject stream)
  {
    if( NIL != report_cfasl_invalid_objectsP() && NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw35$NART, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_nart$.getGlobalValue(), stream );
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      cfasl_output_nart_recipe( nart, stream );
    }
    else
    {
      possibly_output_adjusted_cfasl_reloc_position( stream, UNPROVIDED );
      cfasl_output_nart_handle( nart, stream );
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11395L)
  public static SubLObject cfasl_output_object_nart_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_nart( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11578L)
  public static SubLObject cfasl_invalid_nart()
  {
    return $sample_invalid_nart$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11723L)
  public static SubLObject cfasl_input_nart(final SubLObject stream)
  {
    SubLObject nart = NIL;
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      nart = cfasl_input_nart_recipe( stream );
    }
    else
    {
      nart = cfasl_input_nart_handle( stream );
    }
    if( NIL == nart )
    {
      nart = $sample_invalid_nart$.getGlobalValue();
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 11997L)
  public static SubLObject cfasl_output_nart_recipe(final SubLObject nart, final SubLObject stream)
  {
    final SubLObject hl_formula = narts_high.nart_hl_formula( nart );
    cfasl.cfasl_output( hl_formula, stream );
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 12170L)
  public static SubLObject cfasl_input_nart_recipe(final SubLObject stream)
  {
    final SubLObject hl_formula = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_formula )
    {
      final SubLObject nart = narts_high.nart_lookup( hl_formula );
      if( NIL == nart && NIL != report_cfasl_invalid_objectsP() )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw35$NART, hl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return nart;
    }
    if( NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw38$NART_HL_FORMULA, $kw39$NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 12604L)
  public static SubLObject cfasl_output_nart_handle(final SubLObject nart, final SubLObject stream)
  {
    cfasl.cfasl_output( cfasl_nart_handle( nart ), stream );
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 12742L)
  public static SubLObject cfasl_input_nart_handle(final SubLObject stream)
  {
    final SubLObject handle = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject nart = cfasl_nart_handle_lookup( handle );
    if( ( NIL == nart || $sample_invalid_nart$.getGlobalValue().eql( nart ) ) && NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw35$NART, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 13088L)
  public static SubLObject cfasl_nart_handle(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != narts_high.invalid_nartP( nart, UNPROVIDED ) )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject method = api_control_vars.$cfasl_nart_handle_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return nart_handles.nart_id( nart );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym40$NART_ID ) )
    {
      return nart_handles.nart_id( nart );
    }
    if( pcase_var.eql( $sym41$NART_DUMP_ID ) )
    {
      return narts_high.nart_dump_id( nart );
    }
    return Functions.funcall( method, nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 13488L)
  public static SubLObject cfasl_nart_handle_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.non_negative_integer_p( id ) )
    {
      return $sample_invalid_nart$.getGlobalValue();
    }
    final SubLObject method = api_control_vars.$cfasl_nart_handle_lookup_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return nart_handles.find_nart_by_id( id );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym42$FIND_NART_BY_ID ) )
    {
      return nart_handles.find_nart_by_id( id );
    }
    if( pcase_var.eql( $sym43$FIND_NART_BY_DUMP_ID ) )
    {
      return narts_high.find_nart_by_dump_id( id );
    }
    return Functions.funcall( method, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14170L)
  public static SubLObject cfasl_output_assertion(final SubLObject assertion, final SubLObject stream)
  {
    if( NIL != report_cfasl_invalid_objectsP() && NIL == assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw46$ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_assertion$.getGlobalValue(), stream );
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      cfasl_output_assertion_recipe( assertion, stream );
    }
    else
    {
      possibly_output_adjusted_cfasl_reloc_position( stream, UNPROVIDED );
      cfasl_output_assertion_handle( assertion, stream );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14680L)
  public static SubLObject cfasl_output_object_assertion_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_assertion( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14883L)
  public static SubLObject cfasl_invalid_assertion()
  {
    return $sample_invalid_assertion$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 14965L)
  public static SubLObject cfasl_input_assertion(final SubLObject stream)
  {
    SubLObject assertion = NIL;
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      assertion = cfasl_input_assertion_recipe( stream );
    }
    else
    {
      assertion = cfasl_input_assertion_handle( stream );
    }
    if( NIL == assertion )
    {
      assertion = $sample_invalid_assertion$.getGlobalValue();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 15289L)
  public static SubLObject cfasl_output_assertion_recipe(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    cfasl.cfasl_output( cnf, stream );
    cfasl.cfasl_output( mt, stream );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 15530L)
  public static SubLObject cfasl_input_assertion_recipe(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cnf = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject mt = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL != cnf && NIL != mt )
    {
      final SubLObject result = kb_indexing.find_assertion_internal( cnf, mt );
      if( NIL == result && NIL != report_cfasl_invalid_objectsP() )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw46$ASSERTION, ConsesLow.cons( cnf, mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != $cfasl_error_on_invalid_assertion_inputP$.getDynamicValue( thread ) )
      {
        Errors.error( $str49$Failed_to_input_assertion_with_CN, cnf, mt, stream );
      }
      return result;
    }
    if( NIL != report_cfasl_invalid_objectsP() )
    {
      if( NIL == cnf )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw46$ASSERTION, $kw50$NULL_CNF, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == mt )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw46$ASSERTION, $kw51$NULL_MT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 16317L)
  public static SubLObject cfasl_output_assertion_handle(final SubLObject assertion, final SubLObject stream)
  {
    cfasl.cfasl_output( cfasl_assertion_handle( assertion ), stream );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 16480L)
  public static SubLObject cfasl_input_assertion_handle(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject handle = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject result = cfasl_assertion_handle_lookup( handle );
    if( NIL == result )
    {
      if( NIL != report_cfasl_invalid_objectsP() )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw46$ASSERTION, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != $cfasl_error_on_invalid_assertion_inputP$.getDynamicValue( thread ) )
      {
        Errors.error( $str52$Failed_to_input_assertion_with_ha, handle, api_control_vars.$cfasl_assertion_handle_lookup_func$.getDynamicValue( thread ), stream );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 16999L)
  public static SubLObject cfasl_assertion_handle(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.invalid_assertion( assertion, UNPROVIDED ) )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject method = api_control_vars.$cfasl_assertion_handle_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return assertion_handles.assertion_id( assertion );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym53$ASSERTION_ID ) )
    {
      return assertion_handles.assertion_id( assertion );
    }
    if( pcase_var.eql( $sym54$ASSERTION_DUMP_ID ) )
    {
      return assertions_high.assertion_dump_id( assertion );
    }
    return Functions.funcall( method, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 17464L)
  public static SubLObject cfasl_assertion_handle_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.non_negative_integer_p( id ) )
    {
      return $sample_invalid_assertion$.getGlobalValue();
    }
    final SubLObject method = api_control_vars.$cfasl_assertion_handle_lookup_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return assertion_handles.find_assertion_by_id( id );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym55$FIND_ASSERTION_BY_ID ) )
    {
      return assertion_handles.find_assertion_by_id( id );
    }
    if( pcase_var.eql( $sym56$FIND_ASSERTION_BY_DUMP_ID ) )
    {
      return assertions_high.find_assertion_by_dump_id( id );
    }
    return Functions.funcall( method, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18065L)
  public static SubLObject cfasl_output_deduction(final SubLObject deduction, final SubLObject stream)
  {
    if( NIL != report_cfasl_invalid_objectsP() && NIL == deduction_handles.valid_deductionP( deduction, UNPROVIDED ) )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw59$DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_deduction$.getGlobalValue(), stream );
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      cfasl_output_deduction_recipe( deduction, stream );
    }
    else
    {
      possibly_output_adjusted_cfasl_reloc_position( stream, UNPROVIDED );
      cfasl_output_deduction_handle( deduction, stream );
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18575L)
  public static SubLObject cfasl_output_object_deduction_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_deduction( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18778L)
  public static SubLObject cfasl_invalid_deduction()
  {
    return $sample_invalid_deduction$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 18860L)
  public static SubLObject cfasl_input_deduction(final SubLObject stream)
  {
    SubLObject deduction = NIL;
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      deduction = cfasl_input_deduction_recipe( stream );
    }
    else
    {
      deduction = cfasl_input_deduction_handle( stream );
    }
    if( NIL == deduction )
    {
      deduction = $sample_invalid_deduction$.getGlobalValue();
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 19184L)
  public static SubLObject cfasl_output_deduction_recipe(final SubLObject deduction, final SubLObject stream)
  {
    final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
    final SubLObject supports = deductions_high.deduction_supports( deduction );
    final SubLObject truth = arguments.argument_truth( deduction );
    cfasl.cfasl_output( supported_object, stream );
    cfasl.cfasl_output( supports, stream );
    cfasl.cfasl_output( truth, stream );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 19558L)
  public static SubLObject cfasl_input_deduction_recipe(final SubLObject stream)
  {
    final SubLObject supported_object = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject supports = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject truth = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL != supported_object && NIL != supports && NIL != truth )
    {
      final SubLObject result = deductions_high.find_deduction( supported_object, supports, truth );
      if( NIL == result && NIL != report_cfasl_invalid_objectsP() )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw59$DEDUCTION, ConsesLow.list( supported_object, supports, truth ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return result;
    }
    if( NIL != report_cfasl_invalid_objectsP() )
    {
      if( NIL == supported_object )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw59$DEDUCTION, $kw62$NULL_SUPPORTED_OBJECT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == supports )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw59$DEDUCTION, $kw63$NULL_SUPPORTS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == truth )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw59$DEDUCTION, $kw64$NULL_TRUTH, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 20444L)
  public static SubLObject cfasl_output_deduction_handle(final SubLObject deduction, final SubLObject stream)
  {
    cfasl.cfasl_output( cfasl_deduction_handle( deduction ), stream );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 20607L)
  public static SubLObject cfasl_input_deduction_handle(final SubLObject stream)
  {
    final SubLObject handle = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject result = cfasl_deduction_handle_lookup( handle );
    if( NIL == result && NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw59$DEDUCTION, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 20906L)
  public static SubLObject cfasl_deduction_handle(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != deductions_high.invalid_deduction( deduction, UNPROVIDED ) )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject method = api_control_vars.$cfasl_deduction_handle_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return deduction_handles.deduction_id( deduction );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym65$DEDUCTION_ID ) )
    {
      return deduction_handles.deduction_id( deduction );
    }
    if( pcase_var.eql( $sym66$DEDUCTION_DUMP_ID ) )
    {
      return deductions_high.deduction_dump_id( deduction );
    }
    return Functions.funcall( method, deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21371L)
  public static SubLObject cfasl_deduction_handle_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.non_negative_integer_p( id ) )
    {
      return $sample_invalid_deduction$.getGlobalValue();
    }
    final SubLObject method = api_control_vars.$cfasl_deduction_handle_lookup_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return deduction_handles.find_deduction_by_id( id );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym67$FIND_DEDUCTION_BY_ID ) )
    {
      return deduction_handles.find_deduction_by_id( id );
    }
    if( pcase_var.eql( $sym68$FIND_DEDUCTION_BY_DUMP_ID ) )
    {
      return deductions_high.find_deduction_by_dump_id( id );
    }
    return Functions.funcall( method, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 21992L)
  public static SubLObject cfasl_output_kb_hl_support(final SubLObject kb_hl_support, final SubLObject stream)
  {
    if( NIL != report_cfasl_invalid_objectsP() && NIL == kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, UNPROVIDED ) )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw71$KB_HL_SUPPORT, kb_hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_kb_hl_support$.getGlobalValue(), stream );
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      cfasl_output_kb_hl_support_recipe( kb_hl_support, stream );
    }
    else
    {
      possibly_output_adjusted_cfasl_reloc_position( stream, UNPROVIDED );
      cfasl_output_kb_hl_support_handle( kb_hl_support, stream );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 22550L)
  public static SubLObject cfasl_output_object_kb_hl_support_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_kb_hl_support( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 22760L)
  public static SubLObject cfasl_invalid_kb_hl_support()
  {
    return $sample_invalid_kb_hl_support$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 22850L)
  public static SubLObject cfasl_input_kb_hl_support(final SubLObject stream)
  {
    SubLObject kb_hl_support = NIL;
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      kb_hl_support = cfasl_input_kb_hl_support_recipe( stream );
    }
    else
    {
      kb_hl_support = cfasl_input_kb_hl_support_handle( stream );
    }
    if( NIL == kb_hl_support )
    {
      kb_hl_support = $sample_invalid_kb_hl_support$.getGlobalValue();
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 23214L)
  public static SubLObject cfasl_output_kb_hl_support_recipe(final SubLObject kb_hl_support, final SubLObject stream)
  {
    final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support( kb_hl_support );
    cfasl.cfasl_output( hl_support, stream );
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 23432L)
  public static SubLObject cfasl_input_kb_hl_support_recipe(final SubLObject stream)
  {
    final SubLObject hl_support = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject kb_hl_support = NIL;
    if( NIL != arguments.hl_support_p( hl_support ) )
    {
      kb_hl_support = kb_hl_supports_high.find_kb_hl_support( hl_support );
      if( NIL == kb_hl_support && NIL != report_cfasl_invalid_objectsP() )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw71$KB_HL_SUPPORT, hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw71$KB_HL_SUPPORT, hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 23947L)
  public static SubLObject cfasl_output_kb_hl_support_handle(final SubLObject kb_hl_support, final SubLObject stream)
  {
    cfasl.cfasl_output( cfasl_kb_hl_support_handle( kb_hl_support ), stream );
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 24130L)
  public static SubLObject cfasl_input_kb_hl_support_handle(final SubLObject stream)
  {
    final SubLObject handle = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject kb_hl_support = cfasl_kb_hl_support_handle_lookup( handle );
    if( NIL == kb_hl_support && NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw71$KB_HL_SUPPORT, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 24470L)
  public static SubLObject cfasl_kb_hl_support_handle(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_hl_support_handles.valid_kb_hl_supportP( kb_hl_support, UNPROVIDED ) )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = ( NIL != api_control_vars.$cfasl_kb_hl_support_handle_func$.getDynamicValue( thread ) ) ? api_control_vars.$cfasl_kb_hl_support_handle_func$.getDynamicValue( thread )
        : $sym74$KB_HL_SUPPORT_ID;
    if( pcase_var.eql( $sym74$KB_HL_SUPPORT_ID ) )
    {
      return kb_hl_support_handles.kb_hl_support_id( kb_hl_support );
    }
    if( pcase_var.eql( $sym75$KB_HL_SUPPORT_DUMP_ID ) )
    {
      return kb_hl_supports_high.kb_hl_support_dump_id( kb_hl_support );
    }
    return Functions.funcall( method, kb_hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 24945L)
  public static SubLObject cfasl_kb_hl_support_handle_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = ( NIL != api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.getDynamicValue( thread ) ) ? api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.getDynamicValue(
        thread ) : $sym76$FIND_KB_HL_SUPPORT_BY_ID;
    if( pcase_var.eql( $sym76$FIND_KB_HL_SUPPORT_BY_ID ) )
    {
      return kb_hl_support_handles.find_kb_hl_support_by_id( id );
    }
    if( pcase_var.eql( $sym77$FIND_KB_HL_SUPPORT_BY_DUMP_ID ) )
    {
      return kb_hl_supports_high.find_kb_hl_support_by_dump_id( id );
    }
    return Functions.funcall( method, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 25461L)
  public static SubLObject cfasl_output_clause_struc(final SubLObject clause_struc, final SubLObject stream)
  {
    if( NIL != report_cfasl_invalid_objectsP() && NIL == clause_strucs.valid_clause_struc( clause_struc, UNPROVIDED ) )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw80$CLAUSE_STRUC, clause_struc, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_clause_struc$.getGlobalValue(), stream );
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      cfasl_output_clause_struc_recipe( clause_struc, stream );
    }
    else
    {
      possibly_output_adjusted_cfasl_reloc_position( stream, UNPROVIDED );
      cfasl_output_clause_struc_handle( clause_struc, stream );
    }
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 26006L)
  public static SubLObject cfasl_output_object_clause_struc_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_clause_struc( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 26221L)
  public static SubLObject cfasl_invalid_clause_struc()
  {
    return $sample_invalid_clause_struc$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 26309L)
  public static SubLObject cfasl_input_clause_struc(final SubLObject stream)
  {
    SubLObject clause_struc = NIL;
    if( NIL != cfasl.within_cfasl_externalization_p() )
    {
      clause_struc = cfasl_input_clause_struc_recipe( stream );
    }
    else
    {
      clause_struc = cfasl_input_clause_struc_handle( stream );
    }
    if( NIL == clause_struc )
    {
      clause_struc = $sample_invalid_clause_struc$.getGlobalValue();
    }
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 26663L)
  public static SubLObject cfasl_output_clause_struc_recipe(final SubLObject clause_struc, final SubLObject stream)
  {
    final SubLObject cnf = clause_strucs.clause_struc_cnf( clause_struc );
    cfasl.cfasl_output( cnf, stream );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 26855L)
  public static SubLObject cfasl_input_clause_struc_recipe(final SubLObject stream)
  {
    final SubLObject cnf = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL != cnf )
    {
      final SubLObject result = kb_indexing.find_clause_struc( cnf );
      if( NIL == result && NIL != report_cfasl_invalid_objectsP() )
      {
        kb_health_statistics.kb_health_note_problem_with( $kw80$CLAUSE_STRUC, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return result;
    }
    if( NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw80$CLAUSE_STRUC, $kw50$NULL_CNF, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 27291L)
  public static SubLObject cfasl_output_clause_struc_handle(final SubLObject clause_struc, final SubLObject stream)
  {
    cfasl.cfasl_output( cfasl_clause_struc_handle( clause_struc ), stream );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 27470L)
  public static SubLObject cfasl_input_clause_struc_handle(final SubLObject stream)
  {
    final SubLObject handle = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject result = cfasl_clause_struc_handle_lookup( handle );
    if( ( NIL == result || $sample_invalid_clause_struc$.getGlobalValue().eql( result ) ) && NIL != report_cfasl_invalid_objectsP() )
    {
      kb_health_statistics.kb_health_note_problem_with( $kw80$CLAUSE_STRUC, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 27856L)
  public static SubLObject cfasl_clause_struc_handle(final SubLObject clause_struc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != clause_strucs.invalid_clause_struc( clause_struc, UNPROVIDED ) )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject method = api_control_vars.$cfasl_clause_struc_handle_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return clause_strucs.clause_struc_id( clause_struc );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym83$CLAUSE_STRUC_ID ) )
    {
      return clause_strucs.clause_struc_id( clause_struc );
    }
    if( pcase_var.eql( $sym84$CLAUSE_STRUC_DUMP_ID ) )
    {
      return clause_strucs.clause_struc_dump_id( clause_struc );
    }
    return Functions.funcall( method, clause_struc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 28363L)
  public static SubLObject cfasl_clause_struc_handle_lookup(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_promotions.non_negative_integer_p( id ) )
    {
      return $sample_invalid_clause_struc$.getGlobalValue();
    }
    final SubLObject method = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.getDynamicValue( thread );
    if( NIL == method )
    {
      return clause_strucs.find_clause_struc_by_id( id );
    }
    final SubLObject pcase_var = method;
    if( pcase_var.eql( $sym85$FIND_CLAUSE_STRUC_BY_ID ) )
    {
      return clause_strucs.find_clause_struc_by_id( id );
    }
    if( pcase_var.eql( $sym86$FIND_CLAUSE_STRUC_BY_DUMP_ID ) )
    {
      return clause_strucs.find_clause_struc_by_dump_id( id );
    }
    return Functions.funcall( method, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 29072L)
  public static SubLObject cfasl_output_variable(final SubLObject variable, final SubLObject stream)
  {
    if( NIL != within_complete_cfasl_objects_p() )
    {
      cfasl.cfasl_raw_write_byte( $cfasl_opcode_complete_variable$.getGlobalValue(), stream );
      cfasl.cfasl_output( variables.variable_id( variable ), stream );
      cfasl.cfasl_output_string( string_utilities.to_string( variable ), stream );
    }
    else
    {
      cfasl.cfasl_raw_write_byte( $cfasl_opcode_variable$.getGlobalValue(), stream );
      cfasl.cfasl_output( variables.variable_id( variable ), stream );
    }
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 29486L)
  public static SubLObject cfasl_output_object_variable_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_variable( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 29596L)
  public static SubLObject cfasl_input_variable(final SubLObject stream)
  {
    return variables.find_variable_by_id( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 29696L)
  public static SubLObject cfasl_input_complete_variable(final SubLObject stream)
  {
    final SubLObject variable = variables.find_variable_by_id( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 29881L)
  public static SubLObject cfasl_output_object_sbhl_directed_link_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_sbhl_directed_link( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 30285L)
  public static SubLObject cfasl_output_sbhl_directed_link(final SubLObject d_link, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_sbhl_directed_link$.getGlobalValue(), stream );
    cfasl.cfasl_output( sbhl_links.sbhl_directed_link_predicate_links( d_link ), stream );
    cfasl.cfasl_output( sbhl_links.sbhl_directed_link_inverse_links( d_link ), stream );
    return d_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 30566L)
  public static SubLObject cfasl_input_sbhl_directed_link(final SubLObject stream)
  {
    SubLObject d_link = NIL;
    d_link = sbhl_links.make_sbhl_directed_link( UNPROVIDED );
    sbhl_links._csetf_sbhl_directed_link_predicate_links( d_link, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    sbhl_links._csetf_sbhl_directed_link_inverse_links( d_link, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return d_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 30891L)
  public static SubLObject cfasl_output_object_sbhl_undirected_link_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_sbhl_undirected_link( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 31147L)
  public static SubLObject cfasl_output_sbhl_undirected_link(final SubLObject d_link, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_sbhl_undirected_link$.getGlobalValue(), stream );
    cfasl.cfasl_output( sbhl_links.sbhl_undirected_link_links( d_link ), stream );
    return d_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 31358L)
  public static SubLObject cfasl_input_sbhl_undirected_link(final SubLObject stream)
  {
    SubLObject d_link = NIL;
    d_link = sbhl_links.make_sbhl_undirected_link( UNPROVIDED );
    sbhl_links._csetf_sbhl_undirected_link_links( d_link, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return d_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 31899L)
  public static SubLObject cfasl_input_hl_start(final SubLObject stream)
  {
    final SubLObject interval = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject hl_start = NIL;
    hl_start = sbhl_time_utilities.hl_start( interval );
    return hl_start;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 32123L)
  public static SubLObject cfasl_input_hl_end(final SubLObject stream)
  {
    final SubLObject interval = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject hl_end = NIL;
    hl_end = sbhl_time_utilities.hl_end( interval );
    return hl_end;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 32337L)
  public static SubLObject cfasl_output_object_hl_start_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_hl_start( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 32337L)
  public static SubLObject cfasl_output_object_hl_end_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_hl_end( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 32337L)
  public static SubLObject cfasl_output_hl_start(final SubLObject hl_start, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_hl_start$.getGlobalValue(), stream );
    cfasl.cfasl_output( sbhl_time_utilities.hl_interval_of_endpoint( hl_start ), stream );
    return hl_start;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cfasl-kb-methods.lisp", position = 32337L)
  public static SubLObject cfasl_output_hl_end(final SubLObject hl_end, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_hl_end$.getGlobalValue(), stream );
    cfasl.cfasl_output( sbhl_time_utilities.hl_interval_of_endpoint( hl_end ), stream );
    return hl_end;
  }

  public static SubLObject declare_cfasl_kb_methods_file()
  {
    SubLFiles.declareFunction( me, "valid_cfasl_reloc_side_stream_p", "VALID-CFASL-RELOC-SIDE-STREAM-P", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_reloc_address", "CFASL-OUTPUT-RELOC-ADDRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_output_cfasl_reloc_position", "POSSIBLY-OUTPUT-CFASL-RELOC-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_output_adjusted_cfasl_reloc_position", "POSSIBLY-OUTPUT-ADJUSTED-CFASL-RELOC-POSITION", 1, 1, false );
    SubLFiles.declareFunction( me, "cfasl_output_reloc_version_1p0a", "CFASL-OUTPUT-RELOC-VERSION-1P0A", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_reloc_footer", "CFASL-OUTPUT-RELOC-FOOTER", 0, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_reloc_side_stream", "WITH-CFASL-RELOC-SIDE-STREAM" );
    SubLFiles.declareMacro( me, "with_cfasl_reloc_side_file", "WITH-CFASL-RELOC-SIDE-FILE" );
    SubLFiles.declareFunction( me, "show_cfasl_relocation_information", "SHOW-CFASL-RELOCATION-INFORMATION", 1, 1, false );
    SubLFiles.declareMacro( me, "with_cfasl_invalid_object_reporting", "WITH-CFASL-INVALID-OBJECT-REPORTING" );
    SubLFiles.declareFunction( me, "report_cfasl_invalid_objectsP", "REPORT-CFASL-INVALID-OBJECTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "within_complete_cfasl_objects_p", "WITHIN-COMPLETE-CFASL-OBJECTS-P", 0, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_externalized_constant_exceptions", "WITH-CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS" );
    SubLFiles.declareFunction( me, "cfasl_externalized_constant_exception_p", "CFASL-EXTERNALIZED-CONSTANT-EXCEPTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_constant", "CFASL-OUTPUT-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_constant_method", "CFASL-OUTPUT-OBJECT-CONSTANT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_invalid_constant", "CFASL-INVALID-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_constant", "CFASL-INPUT-CONSTANT", 1, 0, false );
    new $cfasl_input_constant$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_complete_constant", "CFASL-INPUT-COMPLETE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_constant_recipe", "CFASL-OUTPUT-CONSTANT-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_constant_recipe", "CFASL-INPUT-CONSTANT-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_constant_handle", "CFASL-OUTPUT-CONSTANT-HANDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_constant_handle", "CFASL-INPUT-CONSTANT-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_constant_handle", "CFASL-CONSTANT-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_constant_handle_lookup", "CFASL-CONSTANT-HANDLE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_nart", "CFASL-OUTPUT-NART", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_nart_method", "CFASL-OUTPUT-OBJECT-NART-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_invalid_nart", "CFASL-INVALID-NART", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_nart", "CFASL-INPUT-NART", 1, 0, false );
    new $cfasl_input_nart$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_nart_recipe", "CFASL-OUTPUT-NART-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_nart_recipe", "CFASL-INPUT-NART-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_nart_handle", "CFASL-OUTPUT-NART-HANDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_nart_handle", "CFASL-INPUT-NART-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_nart_handle", "CFASL-NART-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_nart_handle_lookup", "CFASL-NART-HANDLE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_assertion", "CFASL-OUTPUT-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_assertion_method", "CFASL-OUTPUT-OBJECT-ASSERTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_invalid_assertion", "CFASL-INVALID-ASSERTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_assertion", "CFASL-INPUT-ASSERTION", 1, 0, false );
    new $cfasl_input_assertion$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_assertion_recipe", "CFASL-OUTPUT-ASSERTION-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_assertion_recipe", "CFASL-INPUT-ASSERTION-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_assertion_handle", "CFASL-OUTPUT-ASSERTION-HANDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_assertion_handle", "CFASL-INPUT-ASSERTION-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_assertion_handle", "CFASL-ASSERTION-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_assertion_handle_lookup", "CFASL-ASSERTION-HANDLE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_deduction", "CFASL-OUTPUT-DEDUCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_deduction_method", "CFASL-OUTPUT-OBJECT-DEDUCTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_invalid_deduction", "CFASL-INVALID-DEDUCTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_deduction", "CFASL-INPUT-DEDUCTION", 1, 0, false );
    new $cfasl_input_deduction$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_deduction_recipe", "CFASL-OUTPUT-DEDUCTION-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_deduction_recipe", "CFASL-INPUT-DEDUCTION-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_deduction_handle", "CFASL-OUTPUT-DEDUCTION-HANDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_deduction_handle", "CFASL-INPUT-DEDUCTION-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_deduction_handle", "CFASL-DEDUCTION-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_deduction_handle_lookup", "CFASL-DEDUCTION-HANDLE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_kb_hl_support", "CFASL-OUTPUT-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_kb_hl_support_method", "CFASL-OUTPUT-OBJECT-KB-HL-SUPPORT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_invalid_kb_hl_support", "CFASL-INVALID-KB-HL-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_kb_hl_support", "CFASL-INPUT-KB-HL-SUPPORT", 1, 0, false );
    new $cfasl_input_kb_hl_support$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_kb_hl_support_recipe", "CFASL-OUTPUT-KB-HL-SUPPORT-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_kb_hl_support_recipe", "CFASL-INPUT-KB-HL-SUPPORT-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_kb_hl_support_handle", "CFASL-OUTPUT-KB-HL-SUPPORT-HANDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_kb_hl_support_handle", "CFASL-INPUT-KB-HL-SUPPORT-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_kb_hl_support_handle", "CFASL-KB-HL-SUPPORT-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_kb_hl_support_handle_lookup", "CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_clause_struc", "CFASL-OUTPUT-CLAUSE-STRUC", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_clause_struc_method", "CFASL-OUTPUT-OBJECT-CLAUSE-STRUC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_invalid_clause_struc", "CFASL-INVALID-CLAUSE-STRUC", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_clause_struc", "CFASL-INPUT-CLAUSE-STRUC", 1, 0, false );
    new $cfasl_input_clause_struc$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_clause_struc_recipe", "CFASL-OUTPUT-CLAUSE-STRUC-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_clause_struc_recipe", "CFASL-INPUT-CLAUSE-STRUC-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_clause_struc_handle", "CFASL-OUTPUT-CLAUSE-STRUC-HANDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_clause_struc_handle", "CFASL-INPUT-CLAUSE-STRUC-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_clause_struc_handle", "CFASL-CLAUSE-STRUC-HANDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_clause_struc_handle_lookup", "CFASL-CLAUSE-STRUC-HANDLE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_variable", "CFASL-OUTPUT-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_variable_method", "CFASL-OUTPUT-OBJECT-VARIABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_variable", "CFASL-INPUT-VARIABLE", 1, 0, false );
    new $cfasl_input_variable$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_complete_variable", "CFASL-INPUT-COMPLETE-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_sbhl_directed_link_method", "CFASL-OUTPUT-OBJECT-SBHL-DIRECTED-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_sbhl_directed_link", "CFASL-OUTPUT-SBHL-DIRECTED-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_sbhl_directed_link", "CFASL-INPUT-SBHL-DIRECTED-LINK", 1, 0, false );
    new $cfasl_input_sbhl_directed_link$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_object_sbhl_undirected_link_method", "CFASL-OUTPUT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_sbhl_undirected_link", "CFASL-OUTPUT-SBHL-UNDIRECTED-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_sbhl_undirected_link", "CFASL-INPUT-SBHL-UNDIRECTED-LINK", 1, 0, false );
    new $cfasl_input_sbhl_undirected_link$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_hl_start", "CFASL-INPUT-HL-START", 1, 0, false );
    new $cfasl_input_hl_start$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_hl_end", "CFASL-INPUT-HL-END", 1, 0, false );
    new $cfasl_input_hl_end$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_object_hl_start_method", "CFASL-OUTPUT-OBJECT-HL-START-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_hl_end_method", "CFASL-OUTPUT-OBJECT-HL-END-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_hl_start", "CFASL-OUTPUT-HL-START", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_hl_end", "CFASL-OUTPUT-HL-END", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_cfasl_kb_methods_file()
  {
    $cfasl_reloc_side_stream$ = SubLFiles.defparameter( "*CFASL-RELOC-SIDE-STREAM*", NIL );
    $cfasl_reloc_last_address$ = SubLFiles.defparameter( "*CFASL-RELOC-LAST-ADDRESS*", ZERO_INTEGER );
    $cfasl_reloc_eof_marker$ = SubLFiles.deflexical( "*CFASL-RELOC-EOF-MARKER*", MINUS_ONE_INTEGER );
    $cfasl_reloc_version_1p0a$ = SubLFiles.deflexical( "*CFASL-RELOC-VERSION-1P0A*", $int0$_101 );
    $report_cfasl_invalid_objectsP$ = SubLFiles.defparameter( "*REPORT-CFASL-INVALID-OBJECTS?", NIL );
    $within_complete_cfasl_objects$ = SubLFiles.defparameter( "*WITHIN-COMPLETE-CFASL-OBJECTS*", NIL );
    $cfasl_externalized_constant_exceptions$ = SubLFiles.defparameter( "*CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS*", NIL );
    $cfasl_opcode_constant$ = SubLFiles.defconstant( "*CFASL-OPCODE-CONSTANT*", $int22$30 );
    $cfasl_opcode_complete_constant$ = SubLFiles.defconstant( "*CFASL-OPCODE-COMPLETE-CONSTANT*", $int24$32 );
    $sample_invalid_constant$ = SubLFiles.deflexical( "*SAMPLE-INVALID-CONSTANT*", maybeDefault( $sym28$_SAMPLE_INVALID_CONSTANT_, $sample_invalid_constant$, () -> ( constant_handles
        .create_sample_invalid_constant() ) ) );
    $cfasl_opcode_nart$ = SubLFiles.defconstant( "*CFASL-OPCODE-NART*", $int33$31 );
    $sample_invalid_nart$ = SubLFiles.deflexical( "*SAMPLE-INVALID-NART*", maybeDefault( $sym37$_SAMPLE_INVALID_NART_, $sample_invalid_nart$, () -> ( nart_handles.create_sample_invalid_nart() ) ) );
    $cfasl_opcode_assertion$ = SubLFiles.defconstant( "*CFASL-OPCODE-ASSERTION*", $int44$33 );
    $cfasl_error_on_invalid_assertion_inputP$ = SubLFiles.defparameter( "*CFASL-ERROR-ON-INVALID-ASSERTION-INPUT?*", NIL );
    $sample_invalid_assertion$ = SubLFiles.deflexical( "*SAMPLE-INVALID-ASSERTION*", maybeDefault( $sym48$_SAMPLE_INVALID_ASSERTION_, $sample_invalid_assertion$, () -> ( assertion_handles
        .create_sample_invalid_assertion() ) ) );
    $cfasl_opcode_deduction$ = SubLFiles.defconstant( "*CFASL-OPCODE-DEDUCTION*", $int57$36 );
    $sample_invalid_deduction$ = SubLFiles.deflexical( "*SAMPLE-INVALID-DEDUCTION*", maybeDefault( $sym61$_SAMPLE_INVALID_DEDUCTION_, $sample_invalid_deduction$, () -> ( deduction_handles
        .create_sample_invalid_deduction() ) ) );
    $cfasl_opcode_kb_hl_support$ = SubLFiles.defconstant( "*CFASL-OPCODE-KB-HL-SUPPORT*", $int69$37 );
    $sample_invalid_kb_hl_support$ = SubLFiles.deflexical( "*SAMPLE-INVALID-KB-HL-SUPPORT*", maybeDefault( $sym73$_SAMPLE_INVALID_KB_HL_SUPPORT_, $sample_invalid_kb_hl_support$, () -> ( kb_hl_support_handles
        .create_sample_invalid_kb_hl_support() ) ) );
    $cfasl_opcode_clause_struc$ = SubLFiles.defconstant( "*CFASL-OPCODE-CLAUSE-STRUC*", $int78$38 );
    $sample_invalid_clause_struc$ = SubLFiles.deflexical( "*SAMPLE-INVALID-CLAUSE-STRUC*", maybeDefault( $sym82$_SAMPLE_INVALID_CLAUSE_STRUC_, $sample_invalid_clause_struc$, () -> ( clause_strucs
        .create_sample_invalid_clause_struc() ) ) );
    $cfasl_opcode_variable$ = SubLFiles.defconstant( "*CFASL-OPCODE-VARIABLE*", $int87$40 );
    $cfasl_opcode_complete_variable$ = SubLFiles.defconstant( "*CFASL-OPCODE-COMPLETE-VARIABLE*", $int89$42 );
    $cfasl_opcode_sbhl_directed_link$ = SubLFiles.defconstant( "*CFASL-OPCODE-SBHL-DIRECTED-LINK*", $int93$90 );
    $cfasl_opcode_sbhl_undirected_link$ = SubLFiles.defconstant( "*CFASL-OPCODE-SBHL-UNDIRECTED-LINK*", $int96$91 );
    $cfasl_opcode_hl_start$ = SubLFiles.defconstant( "*CFASL-OPCODE-HL-START*", $int98$94 );
    $cfasl_opcode_hl_end$ = SubLFiles.defconstant( "*CFASL-OPCODE-HL-END*", $int100$95 );
    return NIL;
  }

  public static SubLObject setup_cfasl_kb_methods_file()
  {
    access_macros.register_external_symbol( $sym13$SHOW_CFASL_RELOCATION_INFORMATION );
    cfasl.register_cfasl_input_function( $cfasl_opcode_constant$.getGlobalValue(), $sym23$CFASL_INPUT_CONSTANT );
    cfasl.register_cfasl_input_function( $cfasl_opcode_complete_constant$.getGlobalValue(), $sym25$CFASL_INPUT_COMPLETE_CONSTANT );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym27$CFASL_OUTPUT_OBJECT_CONSTANT_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym28$_SAMPLE_INVALID_CONSTANT_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_nart$.getGlobalValue(), $sym34$CFASL_INPUT_NART );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function( $sym36$CFASL_OUTPUT_OBJECT_NART_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym37$_SAMPLE_INVALID_NART_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_assertion$.getGlobalValue(), $sym45$CFASL_INPUT_ASSERTION );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function( $sym47$CFASL_OUTPUT_OBJECT_ASSERTION_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym48$_SAMPLE_INVALID_ASSERTION_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_deduction$.getGlobalValue(), $sym58$CFASL_INPUT_DEDUCTION );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function( $sym60$CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym61$_SAMPLE_INVALID_DEDUCTION_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_kb_hl_support$.getGlobalValue(), $sym70$CFASL_INPUT_KB_HL_SUPPORT );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function(
        $sym72$CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym73$_SAMPLE_INVALID_KB_HL_SUPPORT_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_clause_struc$.getGlobalValue(), $sym79$CFASL_INPUT_CLAUSE_STRUC );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function( $sym81$CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym82$_SAMPLE_INVALID_CLAUSE_STRUC_ );
    cfasl.register_cfasl_input_function( $cfasl_opcode_variable$.getGlobalValue(), $sym88$CFASL_INPUT_VARIABLE );
    cfasl.register_cfasl_input_function( $cfasl_opcode_complete_variable$.getGlobalValue(), $sym90$CFASL_INPUT_COMPLETE_VARIABLE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function( $sym91$CFASL_OUTPUT_OBJECT_VARIABLE_METHOD ) );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), Symbols.symbol_function(
        $sym92$CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_sbhl_directed_link$.getGlobalValue(), $sym94$CFASL_INPUT_SBHL_DIRECTED_LINK );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), Symbols.symbol_function(
        $sym95$CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_sbhl_undirected_link$.getGlobalValue(), $sym97$CFASL_INPUT_SBHL_UNDIRECTED_LINK );
    cfasl.register_cfasl_input_function( $cfasl_opcode_hl_start$.getGlobalValue(), $sym99$CFASL_INPUT_HL_START );
    cfasl.register_cfasl_input_function( $cfasl_opcode_hl_end$.getGlobalValue(), $sym101$CFASL_INPUT_HL_END );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), Symbols.symbol_function( $sym102$CFASL_OUTPUT_OBJECT_HL_START_METHOD ) );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), Symbols.symbol_function( $sym103$CFASL_OUTPUT_OBJECT_HL_END_METHOD ) );
    generic_testing.define_test_case_table_int( $sym104$CFASL_ENCODE, ConsesLow.list( new SubLObject[] { $kw105$TEST, Symbols.symbol_function( EQUALP ), $kw106$OWNER, NIL, $kw107$CLASSES, NIL, $kw108$KB, $kw109$TINY,
      $kw110$WORKING_, T
    } ), $list111 );
    generic_testing.define_test_case_table_int( $sym112$CFASL_DECODE, ConsesLow.list( new SubLObject[] { $kw105$TEST, Symbols.symbol_function( EQUALP ), $kw106$OWNER, NIL, $kw107$CLASSES, NIL, $kw108$KB, $kw109$TINY,
      $kw110$WORKING_, T
    } ), $list113 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cfasl_kb_methods_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cfasl_kb_methods_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cfasl_kb_methods_file();
  }
  static
  {
    me = new cfasl_kb_methods();
    $cfasl_reloc_side_stream$ = null;
    $cfasl_reloc_last_address$ = null;
    $cfasl_reloc_eof_marker$ = null;
    $cfasl_reloc_version_1p0a$ = null;
    $report_cfasl_invalid_objectsP$ = null;
    $within_complete_cfasl_objects$ = null;
    $cfasl_externalized_constant_exceptions$ = null;
    $cfasl_opcode_constant$ = null;
    $cfasl_opcode_complete_constant$ = null;
    $sample_invalid_constant$ = null;
    $cfasl_opcode_nart$ = null;
    $sample_invalid_nart$ = null;
    $cfasl_opcode_assertion$ = null;
    $cfasl_error_on_invalid_assertion_inputP$ = null;
    $sample_invalid_assertion$ = null;
    $cfasl_opcode_deduction$ = null;
    $sample_invalid_deduction$ = null;
    $cfasl_opcode_kb_hl_support$ = null;
    $sample_invalid_kb_hl_support$ = null;
    $cfasl_opcode_clause_struc$ = null;
    $sample_invalid_clause_struc$ = null;
    $cfasl_opcode_variable$ = null;
    $cfasl_opcode_complete_variable$ = null;
    $cfasl_opcode_sbhl_directed_link$ = null;
    $cfasl_opcode_sbhl_undirected_link$ = null;
    $cfasl_opcode_hl_start$ = null;
    $cfasl_opcode_hl_end$ = null;
    $int0$_101 = makeInteger( -101 );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$_CFASL_RELOC_SIDE_STREAM_ = makeSymbol( "*CFASL-RELOC-SIDE-STREAM*" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CFASL-RELOC-LAST-ADDRESS*" ), ZERO_INTEGER ) );
    $list5 = ConsesLow.list( makeSymbol( "CFASL-OUTPUT-RELOC-VERSION-1P0A" ) );
    $sym6$PROGN = makeSymbol( "PROGN" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "CFASL-OUTPUT-RELOC-FOOTER" ) ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILENAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym9$STREAMVAR = makeUninternedSymbol( "STREAMVAR" );
    $sym10$WITH_PRIVATE_BINARY_FILE = makeSymbol( "WITH-PRIVATE-BINARY-FILE" );
    $list11 = ConsesLow.list( makeKeyword( "OUTPUT" ) );
    $sym12$WITH_CFASL_RELOC_SIDE_STREAM = makeSymbol( "WITH-CFASL-RELOC-SIDE-STREAM" );
    $sym13$SHOW_CFASL_RELOCATION_INFORMATION = makeSymbol( "SHOW-CFASL-RELOCATION-INFORMATION" );
    $kw14$INPUT = makeKeyword( "INPUT" );
    $str15$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str16$Unsupported_reloc_version__A_ = makeString( "Unsupported reloc version ~A." );
    $str17$CFASL_Reloc_1_0a = makeString( "CFASL Reloc 1.0a" );
    $str18$___EOF___ = makeString( "---EOF---" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "*REPORT-CFASL-INVALID-OBJECTS?" ), T ) );
    $list20 = ConsesLow.list( makeSymbol( "CONSTANTS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym21$_CFASL_EXTERNALIZED_CONSTANT_EXCEPTIONS_ = makeSymbol( "*CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS*" );
    $int22$30 = makeInteger( 30 );
    $sym23$CFASL_INPUT_CONSTANT = makeSymbol( "CFASL-INPUT-CONSTANT" );
    $int24$32 = makeInteger( 32 );
    $sym25$CFASL_INPUT_COMPLETE_CONSTANT = makeSymbol( "CFASL-INPUT-COMPLETE-CONSTANT" );
    $kw26$CONSTANT = makeKeyword( "CONSTANT" );
    $sym27$CFASL_OUTPUT_OBJECT_CONSTANT_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CONSTANT-METHOD" );
    $sym28$_SAMPLE_INVALID_CONSTANT_ = makeSymbol( "*SAMPLE-INVALID-CONSTANT*" );
    $sym29$CONSTANT_INTERNAL_ID = makeSymbol( "CONSTANT-INTERNAL-ID" );
    $sym30$CONSTANT_DUMP_ID = makeSymbol( "CONSTANT-DUMP-ID" );
    $sym31$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" );
    $sym32$FIND_CONSTANT_BY_DUMP_ID = makeSymbol( "FIND-CONSTANT-BY-DUMP-ID" );
    $int33$31 = makeInteger( 31 );
    $sym34$CFASL_INPUT_NART = makeSymbol( "CFASL-INPUT-NART" );
    $kw35$NART = makeKeyword( "NART" );
    $sym36$CFASL_OUTPUT_OBJECT_NART_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-NART-METHOD" );
    $sym37$_SAMPLE_INVALID_NART_ = makeSymbol( "*SAMPLE-INVALID-NART*" );
    $kw38$NART_HL_FORMULA = makeKeyword( "NART-HL-FORMULA" );
    $kw39$NIL = makeKeyword( "NIL" );
    $sym40$NART_ID = makeSymbol( "NART-ID" );
    $sym41$NART_DUMP_ID = makeSymbol( "NART-DUMP-ID" );
    $sym42$FIND_NART_BY_ID = makeSymbol( "FIND-NART-BY-ID" );
    $sym43$FIND_NART_BY_DUMP_ID = makeSymbol( "FIND-NART-BY-DUMP-ID" );
    $int44$33 = makeInteger( 33 );
    $sym45$CFASL_INPUT_ASSERTION = makeSymbol( "CFASL-INPUT-ASSERTION" );
    $kw46$ASSERTION = makeKeyword( "ASSERTION" );
    $sym47$CFASL_OUTPUT_OBJECT_ASSERTION_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-ASSERTION-METHOD" );
    $sym48$_SAMPLE_INVALID_ASSERTION_ = makeSymbol( "*SAMPLE-INVALID-ASSERTION*" );
    $str49$Failed_to_input_assertion_with_CN = makeString( "Failed to input assertion with CNF ~a and mt ~a from stream ~a" );
    $kw50$NULL_CNF = makeKeyword( "NULL-CNF" );
    $kw51$NULL_MT = makeKeyword( "NULL-MT" );
    $str52$Failed_to_input_assertion_with_ha = makeString( "Failed to input assertion with handle ~a and lookup function ~a from stream ~a" );
    $sym53$ASSERTION_ID = makeSymbol( "ASSERTION-ID" );
    $sym54$ASSERTION_DUMP_ID = makeSymbol( "ASSERTION-DUMP-ID" );
    $sym55$FIND_ASSERTION_BY_ID = makeSymbol( "FIND-ASSERTION-BY-ID" );
    $sym56$FIND_ASSERTION_BY_DUMP_ID = makeSymbol( "FIND-ASSERTION-BY-DUMP-ID" );
    $int57$36 = makeInteger( 36 );
    $sym58$CFASL_INPUT_DEDUCTION = makeSymbol( "CFASL-INPUT-DEDUCTION" );
    $kw59$DEDUCTION = makeKeyword( "DEDUCTION" );
    $sym60$CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-DEDUCTION-METHOD" );
    $sym61$_SAMPLE_INVALID_DEDUCTION_ = makeSymbol( "*SAMPLE-INVALID-DEDUCTION*" );
    $kw62$NULL_SUPPORTED_OBJECT = makeKeyword( "NULL-SUPPORTED-OBJECT" );
    $kw63$NULL_SUPPORTS = makeKeyword( "NULL-SUPPORTS" );
    $kw64$NULL_TRUTH = makeKeyword( "NULL-TRUTH" );
    $sym65$DEDUCTION_ID = makeSymbol( "DEDUCTION-ID" );
    $sym66$DEDUCTION_DUMP_ID = makeSymbol( "DEDUCTION-DUMP-ID" );
    $sym67$FIND_DEDUCTION_BY_ID = makeSymbol( "FIND-DEDUCTION-BY-ID" );
    $sym68$FIND_DEDUCTION_BY_DUMP_ID = makeSymbol( "FIND-DEDUCTION-BY-DUMP-ID" );
    $int69$37 = makeInteger( 37 );
    $sym70$CFASL_INPUT_KB_HL_SUPPORT = makeSymbol( "CFASL-INPUT-KB-HL-SUPPORT" );
    $kw71$KB_HL_SUPPORT = makeKeyword( "KB-HL-SUPPORT" );
    $sym72$CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-KB-HL-SUPPORT-METHOD" );
    $sym73$_SAMPLE_INVALID_KB_HL_SUPPORT_ = makeSymbol( "*SAMPLE-INVALID-KB-HL-SUPPORT*" );
    $sym74$KB_HL_SUPPORT_ID = makeSymbol( "KB-HL-SUPPORT-ID" );
    $sym75$KB_HL_SUPPORT_DUMP_ID = makeSymbol( "KB-HL-SUPPORT-DUMP-ID" );
    $sym76$FIND_KB_HL_SUPPORT_BY_ID = makeSymbol( "FIND-KB-HL-SUPPORT-BY-ID" );
    $sym77$FIND_KB_HL_SUPPORT_BY_DUMP_ID = makeSymbol( "FIND-KB-HL-SUPPORT-BY-DUMP-ID" );
    $int78$38 = makeInteger( 38 );
    $sym79$CFASL_INPUT_CLAUSE_STRUC = makeSymbol( "CFASL-INPUT-CLAUSE-STRUC" );
    $kw80$CLAUSE_STRUC = makeKeyword( "CLAUSE-STRUC" );
    $sym81$CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CLAUSE-STRUC-METHOD" );
    $sym82$_SAMPLE_INVALID_CLAUSE_STRUC_ = makeSymbol( "*SAMPLE-INVALID-CLAUSE-STRUC*" );
    $sym83$CLAUSE_STRUC_ID = makeSymbol( "CLAUSE-STRUC-ID" );
    $sym84$CLAUSE_STRUC_DUMP_ID = makeSymbol( "CLAUSE-STRUC-DUMP-ID" );
    $sym85$FIND_CLAUSE_STRUC_BY_ID = makeSymbol( "FIND-CLAUSE-STRUC-BY-ID" );
    $sym86$FIND_CLAUSE_STRUC_BY_DUMP_ID = makeSymbol( "FIND-CLAUSE-STRUC-BY-DUMP-ID" );
    $int87$40 = makeInteger( 40 );
    $sym88$CFASL_INPUT_VARIABLE = makeSymbol( "CFASL-INPUT-VARIABLE" );
    $int89$42 = makeInteger( 42 );
    $sym90$CFASL_INPUT_COMPLETE_VARIABLE = makeSymbol( "CFASL-INPUT-COMPLETE-VARIABLE" );
    $sym91$CFASL_OUTPUT_OBJECT_VARIABLE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-VARIABLE-METHOD" );
    $sym92$CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-SBHL-DIRECTED-LINK-METHOD" );
    $int93$90 = makeInteger( 90 );
    $sym94$CFASL_INPUT_SBHL_DIRECTED_LINK = makeSymbol( "CFASL-INPUT-SBHL-DIRECTED-LINK" );
    $sym95$CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD" );
    $int96$91 = makeInteger( 91 );
    $sym97$CFASL_INPUT_SBHL_UNDIRECTED_LINK = makeSymbol( "CFASL-INPUT-SBHL-UNDIRECTED-LINK" );
    $int98$94 = makeInteger( 94 );
    $sym99$CFASL_INPUT_HL_START = makeSymbol( "CFASL-INPUT-HL-START" );
    $int100$95 = makeInteger( 95 );
    $sym101$CFASL_INPUT_HL_END = makeSymbol( "CFASL-INPUT-HL-END" );
    $sym102$CFASL_OUTPUT_OBJECT_HL_START_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-HL-START-METHOD" );
    $sym103$CFASL_OUTPUT_OBJECT_HL_END_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-HL-END-METHOD" );
    $sym104$CFASL_ENCODE = makeSymbol( "CFASL-ENCODE" );
    $kw105$TEST = makeKeyword( "TEST" );
    $kw106$OWNER = makeKeyword( "OWNER" );
    $kw107$CLASSES = makeKeyword( "CLASSES" );
    $kw108$KB = makeKeyword( "KB" );
    $kw109$TINY = makeKeyword( "TINY" );
    $kw110$WORKING_ = makeKeyword( "WORKING?" );
    $list111 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeGuid( "bd5880f4-9c29-11b1-9dad-c379636f7270" ) ), Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger(
        98 ), makeInteger( 100 ), makeInteger( 53 ), makeInteger( 56 ), makeInteger( 56 ), makeInteger( 48 ), makeInteger( 102 ), makeInteger( 52 ), makeInteger( 45 ), makeInteger( 57 ), makeInteger( 99 ), makeInteger(
            50 ), makeInteger( 57 ), makeInteger( 45 ), makeInteger( 49 ), makeInteger( 49 ), makeInteger( 98 ), makeInteger( 49 ), makeInteger( 45 ), makeInteger( 57 ), makeInteger( 100 ), makeInteger( 97 ),
      makeInteger( 100 ), makeInteger( 45 ), makeInteger( 99 ), makeInteger( 51 ), makeInteger( 55 ), makeInteger( 57 ), makeInteger( 54 ), makeInteger( 51 ), makeInteger( 54 ), makeInteger( 102 ), makeInteger( 55 ),
      makeInteger( 50 ), makeInteger( 55 ), makeInteger( 48 )
    } ) ), ConsesLow.list( ConsesLow.list( makeGuid( "1bb5d971-e945-11dc-8241-00e08156aaa2" ) ), Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 49 ), makeInteger(
        98 ), makeInteger( 98 ), makeInteger( 53 ), makeInteger( 100 ), makeInteger( 57 ), makeInteger( 55 ), makeInteger( 49 ), makeInteger( 45 ), makeInteger( 101 ), makeInteger( 57 ), makeInteger( 52 ), makeInteger(
            53 ), makeInteger( 45 ), makeInteger( 49 ), makeInteger( 49 ), makeInteger( 100 ), makeInteger( 99 ), makeInteger( 45 ), makeInteger( 56 ), makeInteger( 50 ), makeInteger( 52 ), makeInteger( 49 ),
      makeInteger( 45 ), makeInteger( 48 ), makeInteger( 48 ), makeInteger( 101 ), makeInteger( 48 ), makeInteger( 56 ), makeInteger( 49 ), makeInteger( 53 ), makeInteger( 54 ), makeInteger( 97 ), makeInteger( 97 ),
      makeInteger( 97 ), makeInteger( 50 )
    } ) ), ConsesLow.list( ConsesLow.list( makeGuid( "8654b22c-e947-11dc-86ef-00e08156aaa2" ) ), Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 56 ), makeInteger(
        54 ), makeInteger( 53 ), makeInteger( 52 ), makeInteger( 98 ), makeInteger( 50 ), makeInteger( 50 ), makeInteger( 99 ), makeInteger( 45 ), makeInteger( 101 ), makeInteger( 57 ), makeInteger( 52 ), makeInteger(
            55 ), makeInteger( 45 ), makeInteger( 49 ), makeInteger( 49 ), makeInteger( 100 ), makeInteger( 99 ), makeInteger( 45 ), makeInteger( 56 ), makeInteger( 54 ), makeInteger( 101 ), makeInteger( 102 ),
      makeInteger( 45 ), makeInteger( 48 ), makeInteger( 48 ), makeInteger( 101 ), makeInteger( 48 ), makeInteger( 56 ), makeInteger( 49 ), makeInteger( 53 ), makeInteger( 54 ), makeInteger( 97 ), makeInteger( 97 ),
      makeInteger( 97 ), makeInteger( 50 )
    } ) ), ConsesLow.list( ConsesLow.list( makeGuid( "69ece82b-4224-40d6-8f55-268be97ba4e7" ) ), Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 54 ), makeInteger(
        57 ), makeInteger( 101 ), makeInteger( 99 ), makeInteger( 101 ), makeInteger( 56 ), makeInteger( 50 ), makeInteger( 98 ), makeInteger( 45 ), makeInteger( 52 ), makeInteger( 50 ), makeInteger( 50 ), makeInteger(
            52 ), makeInteger( 45 ), makeInteger( 52 ), makeInteger( 48 ), makeInteger( 100 ), makeInteger( 54 ), makeInteger( 45 ), makeInteger( 56 ), makeInteger( 102 ), makeInteger( 53 ), makeInteger( 53 ),
      makeInteger( 45 ), makeInteger( 50 ), makeInteger( 54 ), makeInteger( 56 ), makeInteger( 98 ), makeInteger( 101 ), makeInteger( 57 ), makeInteger( 55 ), makeInteger( 98 ), makeInteger( 97 ), makeInteger( 52 ),
      makeInteger( 101 ), makeInteger( 55 )
    } ) ) );
    $sym112$CFASL_DECODE = makeSymbol( "CFASL-DECODE" );
    $list113 = ConsesLow.list( ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 98 ), makeInteger( 100 ), makeInteger( 53 ),
      makeInteger( 56 ), makeInteger( 56 ), makeInteger( 48 ), makeInteger( 102 ), makeInteger( 52 ), makeInteger( 45 ), makeInteger( 57 ), makeInteger( 99 ), makeInteger( 50 ), makeInteger( 57 ), makeInteger( 45 ),
      makeInteger( 49 ), makeInteger( 49 ), makeInteger( 98 ), makeInteger( 49 ), makeInteger( 45 ), makeInteger( 57 ), makeInteger( 100 ), makeInteger( 97 ), makeInteger( 100 ), makeInteger( 45 ), makeInteger( 99 ),
      makeInteger( 51 ), makeInteger( 55 ), makeInteger( 57 ), makeInteger( 54 ), makeInteger( 51 ), makeInteger( 54 ), makeInteger( 102 ), makeInteger( 55 ), makeInteger( 50 ), makeInteger( 55 ), makeInteger( 48 )
    } ) ), makeGuid( "bd5880f4-9c29-11b1-9dad-c379636f7270" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 49 ), makeInteger(
        98 ), makeInteger( 98 ), makeInteger( 53 ), makeInteger( 100 ), makeInteger( 57 ), makeInteger( 55 ), makeInteger( 49 ), makeInteger( 45 ), makeInteger( 101 ), makeInteger( 57 ), makeInteger( 52 ), makeInteger(
            53 ), makeInteger( 45 ), makeInteger( 49 ), makeInteger( 49 ), makeInteger( 100 ), makeInteger( 99 ), makeInteger( 45 ), makeInteger( 56 ), makeInteger( 50 ), makeInteger( 52 ), makeInteger( 49 ),
      makeInteger( 45 ), makeInteger( 48 ), makeInteger( 48 ), makeInteger( 101 ), makeInteger( 48 ), makeInteger( 56 ), makeInteger( 49 ), makeInteger( 53 ), makeInteger( 54 ), makeInteger( 97 ), makeInteger( 97 ),
      makeInteger( 97 ), makeInteger( 50 )
    } ) ), makeGuid( "1bb5d971-e945-11dc-8241-00e08156aaa2" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 56 ), makeInteger(
        54 ), makeInteger( 53 ), makeInteger( 52 ), makeInteger( 98 ), makeInteger( 50 ), makeInteger( 50 ), makeInteger( 99 ), makeInteger( 45 ), makeInteger( 101 ), makeInteger( 57 ), makeInteger( 52 ), makeInteger(
            55 ), makeInteger( 45 ), makeInteger( 49 ), makeInteger( 49 ), makeInteger( 100 ), makeInteger( 99 ), makeInteger( 45 ), makeInteger( 56 ), makeInteger( 54 ), makeInteger( 101 ), makeInteger( 102 ),
      makeInteger( 45 ), makeInteger( 48 ), makeInteger( 48 ), makeInteger( 101 ), makeInteger( 48 ), makeInteger( 56 ), makeInteger( 49 ), makeInteger( 53 ), makeInteger( 54 ), makeInteger( 97 ), makeInteger( 97 ),
      makeInteger( 97 ), makeInteger( 50 )
    } ) ), makeGuid( "8654b22c-e947-11dc-86ef-00e08156aaa2" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 25 ), FIFTEEN_INTEGER, makeInteger( 164 ), makeInteger( 54 ), makeInteger(
        57 ), makeInteger( 101 ), makeInteger( 99 ), makeInteger( 101 ), makeInteger( 56 ), makeInteger( 50 ), makeInteger( 98 ), makeInteger( 45 ), makeInteger( 52 ), makeInteger( 50 ), makeInteger( 50 ), makeInteger(
            52 ), makeInteger( 45 ), makeInteger( 52 ), makeInteger( 48 ), makeInteger( 100 ), makeInteger( 54 ), makeInteger( 45 ), makeInteger( 56 ), makeInteger( 102 ), makeInteger( 53 ), makeInteger( 53 ),
      makeInteger( 45 ), makeInteger( 50 ), makeInteger( 54 ), makeInteger( 56 ), makeInteger( 98 ), makeInteger( 101 ), makeInteger( 57 ), makeInteger( 55 ), makeInteger( 98 ), makeInteger( 97 ), makeInteger( 52 ),
      makeInteger( 101 ), makeInteger( 55 )
    } ) ), makeGuid( "69ece82b-4224-40d6-8f55-268be97ba4e7" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 43 ), makeInteger( 189 ), makeInteger( 88 ), makeInteger( 128 ),
      makeInteger( 244 ), makeInteger( 156 ), makeInteger( 41 ), SEVENTEEN_INTEGER, makeInteger( 177 ), makeInteger( 157 ), makeInteger( 173 ), makeInteger( 195 ), makeInteger( 121 ), makeInteger( 99 ), makeInteger(
          111 ), makeInteger( 114 ), makeInteger( 112 )
    } ) ), makeGuid( "bd5880f4-9c29-11b1-9dad-c379636f7270" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 43 ), makeInteger( 27 ), makeInteger( 181 ), makeInteger( 217 ),
      makeInteger( 113 ), makeInteger( 233 ), makeInteger( 69 ), SEVENTEEN_INTEGER, makeInteger( 220 ), makeInteger( 130 ), makeInteger( 65 ), ZERO_INTEGER, makeInteger( 224 ), makeInteger( 129 ), makeInteger( 86 ),
      makeInteger( 170 ), makeInteger( 162 )
    } ) ), makeGuid( "1bb5d971-e945-11dc-8241-00e08156aaa2" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 43 ), makeInteger( 134 ), makeInteger( 84 ), makeInteger( 178 ),
      makeInteger( 44 ), makeInteger( 233 ), makeInteger( 71 ), SEVENTEEN_INTEGER, makeInteger( 220 ), makeInteger( 134 ), makeInteger( 239 ), ZERO_INTEGER, makeInteger( 224 ), makeInteger( 129 ), makeInteger( 86 ),
      makeInteger( 170 ), makeInteger( 162 )
    } ) ), makeGuid( "8654b22c-e947-11dc-86ef-00e08156aaa2" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 43 ), makeInteger( 105 ), makeInteger( 236 ), makeInteger( 232 ),
      makeInteger( 43 ), makeInteger( 66 ), makeInteger( 36 ), makeInteger( 64 ), makeInteger( 214 ), makeInteger( 143 ), makeInteger( 85 ), makeInteger( 38 ), makeInteger( 139 ), makeInteger( 233 ), makeInteger( 123 ),
      makeInteger( 164 ), makeInteger( 231 )
    } ) ), makeGuid( "69ece82b-4224-40d6-8f55-268be97ba4e7" ) ) );
  }

  public static final class $cfasl_input_constant$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_constant$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-CONSTANT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_constant( arg1 );
    }
  }

  public static final class $cfasl_input_nart$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_nart$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-NART" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_nart( arg1 );
    }
  }

  public static final class $cfasl_input_assertion$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_assertion$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-ASSERTION" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_assertion( arg1 );
    }
  }

  public static final class $cfasl_input_deduction$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_deduction$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-DEDUCTION" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_deduction( arg1 );
    }
  }

  public static final class $cfasl_input_kb_hl_support$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_kb_hl_support$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-KB-HL-SUPPORT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_kb_hl_support( arg1 );
    }
  }

  public static final class $cfasl_input_clause_struc$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_clause_struc$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-CLAUSE-STRUC" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_clause_struc( arg1 );
    }
  }

  public static final class $cfasl_input_variable$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_variable$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-VARIABLE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_variable( arg1 );
    }
  }

  public static final class $cfasl_input_sbhl_directed_link$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_sbhl_directed_link$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-SBHL-DIRECTED-LINK" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_sbhl_directed_link( arg1 );
    }
  }

  public static final class $cfasl_input_sbhl_undirected_link$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_sbhl_undirected_link$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-SBHL-UNDIRECTED-LINK" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_sbhl_undirected_link( arg1 );
    }
  }

  public static final class $cfasl_input_hl_start$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_hl_start$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-HL-START" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_hl_start( arg1 );
    }
  }

  public static final class $cfasl_input_hl_end$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_hl_end$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-HL-END" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_hl_end( arg1 );
    }
  }
}
/*
 * 
 * Total time: 330 ms
 * 
 */