package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_parameter_export
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_parameter_export";
  public static final String myFingerPrint = "c7e99ddb7744656f20457b5cd959197428ed2944e77824c79b8f84949e7fa08c";
  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 6355L)
  public static SubLSymbol $system_parameter_name_space$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 7533L)
  public static SubLSymbol $default_target_name_space$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 8238L)
  private static SubLSymbol $default_xsd_schema_attribute_list$;
  private static final SubLSymbol $kw0$OUTPUT;
  private static final SubLString $str1$Unable_to_open__S;
  private static final SubLSymbol $kw2$INCLUDE_FEATURES;
  private static final SubLString $str3$params;
  private static final SubLString $str4$xmlns;
  private static final SubLSymbol $kw5$UNINITIALIZED;
  private static final SubLList $list6;
  private static final SubLString $str7$param;
  private static final SubLList $list8;
  private static final SubLString $str9$doc;
  private static final SubLString $str10$Possible_Values__;
  private static final SubLSymbol $kw11$XML;
  private static final SubLString $str12$equiv;
  private static final SubLString $str13$name;
  private static final SubLString $str14$value;
  private static final SubLSymbol $sym15$UNDEFINED;
  private static final SubLSymbol $sym16$BOOLEAN;
  private static final SubLString $str17$true;
  private static final SubLString $str18$false;
  private static final SubLList $list19;
  private static final SubLString $str20$string;
  private static final SubLString $str21$undefined;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$OR;
  private static final SubLSymbol $sym25$AND;
  private static final SubLSymbol $sym26$MEMBER;
  private static final SubLString $str27$keyword;
  private static final SubLString $str28$Unsupported_operator__A_in_type__;
  private static final SubLString $str29$Unsupported_type_descriptor__A_;
  private static final SubLString $str30$UTF_8;
  private static final SubLString $str31$__generated_by_Cyc__A____A___;
  private static final SubLString $str32$____________at__A__;
  private static final SubLString $str33$__Features_of_generating_code___;
  private static final SubLString $str34$http___ws_opencyc_org_xsd_sysPara;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$ATT_LIST;
  private static final SubLSymbol $sym37$CLET;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$CSETQ;
  private static final SubLSymbol $sym40$XSD_ADD_TARGET_NAME_SPACE;
  private static final SubLSymbol $sym41$XML_TAG;
  private static final SubLString $str42$xsd_schema;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLString $str45$http___ws_opencyc_org_SystemParam;
  private static final SubLSymbol $sym46$GENERATE_SYSTEM_PARAMETER_TYPES_XSD;
  private static final SubLString $str47$xsd_import;
  private static final SubLString $str48$namespace;
  private static final SubLString $str49$http___www_w3_org_XML_1998_namesp;
  private static final SubLString $str50$schemaLocation;
  private static final SubLString $str51$http___www_w3_org_2001_xml_xsd;
  private static final SubLList $list52;
  private static final SubLString $str53$targetNameSpace;
  private static final SubLString $str54$xmlns_tns;
  private static final SubLString $str55$_definition_for_SYSTEM_PARAMETER_;
  private static final SubLString $str56$Dont_handle_recursive_types_yet_;

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 966L)
  public static SubLObject generate_system_parameter_xml_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw0$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str1$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        generate_xml_prolegomena( $kw2$INCLUDE_FEATURES );
        try
        {
          final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str3$params, ConsesLow.list( $str4$xmlns, $system_parameter_name_space$.getGlobalValue() ), NIL, NIL, $kw5$UNINITIALIZED );
            final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
              final SubLObject substitutions = $list6;
              SubLObject cdolist_list_var = system_parameters.all_system_parameter_definitions();
              SubLObject entry = NIL;
              entry = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                generate_one_system_parameter_in_xml( entry, substitutions );
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str3$params );
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
        xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 1873L)
  public static SubLObject generate_one_system_parameter_in_xml(final SubLObject entry, final SubLObject substitutions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xml_utilities.xml_terpri();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str7$param, NIL, NIL, NIL, $kw5$UNINITIALIZED );
        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
          SubLObject symbol = NIL;
          SubLObject v_default = NIL;
          SubLObject type = NIL;
          SubLObject description = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( entry, entry, $list8 );
          symbol = entry.first();
          SubLObject current = entry.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, entry, $list8 );
          v_default = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, entry, $list8 );
          type = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, entry, $list8 );
          description = current.first();
          current = current.rest();
          if( NIL == current )
          {
            xml_utilities.xml_terpri();
            try
            {
              final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str9$doc, NIL, NIL, NIL, $kw5$UNINITIALIZED );
                final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                  xml_utilities.xml_write_string( $str10$Possible_Values__, UNPROVIDED, UNPROVIDED );
                  final SubLObject possible_values = system_parameter_types.determine_system_parameter_type_possible_values_string( type, $kw11$XML );
                  final SubLObject localized = system_parameters.localize_boolean_description_lines( ConsesLow.list( possible_values ), substitutions, UNPROVIDED ).first();
                  xml_utilities.xml_write_string( localized, UNPROVIDED, UNPROVIDED );
                  SubLObject cdolist_list_var = system_parameters.get_parameter_description_lines( description, substitutions, UNPROVIDED );
                  SubLObject line = NIL;
                  line = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_write_string( line, UNPROVIDED, UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    line = cdolist_list_var.first();
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$6, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$6, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$5, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str9$doc );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
              }
            }
            final SubLObject symbol_name = Symbols.symbol_name( symbol );
            final SubLObject att_list = ConsesLow.list( $str12$equiv, symbol_name );
            final SubLObject param_name = gensysparam_symbol_name_to_parameter_name( symbol_name, UNPROVIDED );
            xml_utilities.xml_terpri();
            try
            {
              final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str13$name, att_list, NIL, NIL, $kw5$UNINITIALIZED );
                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                  xml_utilities.xml_write_string( param_name, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$7, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$8, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str13$name );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
              }
            }
            xml_utilities.xml_terpri();
            try
            {
              final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str14$value, NIL, NIL, NIL, $kw5$UNINITIALIZED );
                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                  final SubLObject tag_name = gensysparam_type_to_final_tag_name( type );
                  final SubLObject nested_elementsP = system_parameter_has_nested_elementsP( type );
                  try
                  {
                    final SubLObject _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                    try
                    {
                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                          thread );
                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                      xml_utilities.xml_start_tag_internal( tag_name, NIL, NIL, NIL, $kw5$UNINITIALIZED );
                      final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                      try
                      {
                        xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                        if( $sym15$UNDEFINED != type )
                        {
                          if( $sym16$BOOLEAN == type )
                          {
                            xml_utilities.xml_write_string( ( NIL != v_default ) ? $str17$true : $str18$false, UNPROVIDED, UNPROVIDED );
                          }
                          else if( $list19.equal( type ) )
                          {
                            if( v_default.isString() )
                            {
                              try
                              {
                                final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str20$string, NIL, NIL, NIL, $kw5$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                                    xml_utilities.xml_write_string( v_default, UNPROVIDED, UNPROVIDED );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$10, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$15, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values3 = Values.getValuesAsVector();
                                  xml_utilities.xml_end_tag_internal( $str20$string );
                                  Values.restoreValuesFromVector( _values3 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                                }
                              }
                            }
                            else
                            {
                              final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str21$undefined, NIL, T, NIL, $kw5$UNINITIALIZED );
                                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$19, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$11, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$18, thread );
                              }
                            }
                          }
                          else
                          {
                            xml_utilities.xml_write_string( string_utilities.to_string( v_default ), UNPROVIDED, UNPROVIDED );
                          }
                        }
                      }
                      finally
                      {
                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$14, thread );
                      }
                    }
                    finally
                    {
                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$9, thread );
                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$13, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values4 = Values.getValuesAsVector();
                      if( NIL != nested_elementsP )
                      {
                        xml_utilities.xml_terpri();
                      }
                      xml_utilities.xml_end_tag_internal( tag_name );
                      Values.restoreValuesFromVector( _values4 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                    }
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$12, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$8, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$11, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values5 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str14$value );
                Values.restoreValuesFromVector( _values5 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( entry, $list8 );
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values6 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str7$param );
        Values.restoreValuesFromVector( _values6 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 3786L)
  public static SubLObject system_parameter_has_nested_elementsP(final SubLObject type)
  {
    if( type.isCons() )
    {
      return subl_promotions.memberP( type.first(), $list22, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 3928L)
  public static SubLObject gensysparam_symbol_name_to_parameter_name(final SubLObject symbol_name, SubLObject downcase_firstP)
  {
    if( downcase_firstP == UNPROVIDED )
    {
      downcase_firstP = NIL;
    }
    SubLObject param_name = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject keptP = downcase_firstP;
      SubLObject cdotimes_end_var;
      SubLObject i;
      SubLObject curr_char;
      SubLObject result_char;
      for( cdotimes_end_var = Sequences.length( symbol_name ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        curr_char = Strings.sublisp_char( symbol_name, i );
        if( NIL != Characters.alphanumericp( curr_char ) )
        {
          result_char = ( ( NIL != keptP ) ? Characters.char_downcase( curr_char ) : Characters.char_upcase( curr_char ) );
          streams_high.write_char( result_char, s );
          keptP = T;
        }
        else
        {
          keptP = NIL;
        }
      }
      param_name = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return param_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 4558L)
  public static SubLObject gensysparam_type_to_final_tag_name(final SubLObject type)
  {
    final SubLObject result = gensysparam_type_to_tag_name( type );
    return string_utilities.uncapitalize_first( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 4713L)
  public static SubLObject gensysparam_type_to_tag_name(final SubLObject type)
  {
    SubLObject result = NIL;
    if( type.isCons() )
    {
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( type, type, $list23 );
      operator = type.first();
      final SubLObject sub_types;
      final SubLObject current = sub_types = type.rest();
      if( $sym24$OR == operator || $sym25$AND == operator )
      {
        final SubLObject op_name = gensysparam_symbol_name_to_parameter_name( Symbols.symbol_name( operator ), UNPROVIDED );
        SubLObject s = NIL;
        try
        {
          s = streams_high.make_private_string_output_stream();
          SubLObject list_var = NIL;
          SubLObject sub_type = NIL;
          SubLObject index = NIL;
          list_var = sub_types;
          sub_type = list_var.first();
          for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), sub_type = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
          {
            if( !index.isZero() )
            {
              streams_high.write_string( op_name, s, UNPROVIDED, UNPROVIDED );
            }
            streams_high.write_string( gensysparam_type_to_tag_name( sub_type ), s, UNPROVIDED, UNPROVIDED );
          }
          result = streams_high.get_output_stream_string( s );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( s, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
        }
      }
      else if( $sym26$MEMBER == operator )
      {
        result = $str27$keyword;
      }
      else
      {
        Errors.error( $str28$Unsupported_operator__A_in_type__, operator, type );
      }
    }
    else if( type.isSymbol() )
    {
      result = gensysparam_symbol_name_to_parameter_name( Symbols.symbol_name( type ), UNPROVIDED );
    }
    else
    {
      Errors.error( $str29$Unsupported_type_descriptor__A_, type );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 5732L)
  public static SubLObject generate_xml_prolegomena(SubLObject include_featuresP)
  {
    if( include_featuresP == UNPROVIDED )
    {
      include_featuresP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    xml_utilities.xml_header( xml_utilities.$xml_version$.getDynamicValue( thread ), $str30$UTF_8, NIL );
    SubLObject comment = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      PrintLow.format( s, $str31$__generated_by_Cyc__A____A___, system_info.cyc_revision_string(), Environment.lisp_implementation_type() );
      PrintLow.format( s, $str32$____________at__A__, numeric_date_utilities.timestring( UNPROVIDED ) );
      streams_high.terpri( s );
      if( NIL != include_featuresP )
      {
        PrintLow.format( s, $str33$__Features_of_generating_code___ );
        SubLObject cdolist_list_var = reader.$features$.getDynamicValue( thread );
        SubLObject feature = NIL;
        feature = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          string_utilities.indent( s, FOUR_INTEGER );
          print_high.prin1( feature, s );
          streams_high.terpri( s );
          cdolist_list_var = cdolist_list_var.rest();
          feature = cdolist_list_var.first();
        }
        streams_high.terpri( s );
      }
      comment = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    xml_utilities.xml_comment( comment );
    return xml_utilities.xml_terpri();
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 6548L)
  public static SubLObject with_xsd_schema(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject target_name_space = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    target_name_space = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject att_list = $sym36$ATT_LIST;
      return ConsesLow.list( $sym37$CLET, ConsesLow.list( reader.bq_cons( att_list, $list38 ) ), ConsesLow.list( $sym39$CSETQ, att_list, ConsesLow.list( $sym40$XSD_ADD_TARGET_NAME_SPACE, att_list, target_name_space ) ),
          ConsesLow.listS( $sym41$XML_TAG, ConsesLow.list( $str42$xsd_schema, att_list ), $list43, $list44, $list43, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 7736L)
  public static SubLObject generate_system_parameter_types_xsd(final SubLObject xsd_path, final SubLObject types)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( xsd_path, $kw0$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str1$Unable_to_open__S, xsd_path );
      }
      final SubLObject s = stream;
      final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        generate_xsd_prolegomena( UNPROVIDED );
        SubLObject att_list = compile_default_xsd_attribute_list();
        att_list = xsd_add_target_name_space( att_list, $default_target_name_space$.getDynamicValue( thread ) );
        try
        {
          final SubLObject _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str42$xsd_schema, att_list, NIL, NIL, $kw5$UNINITIALIZED );
            final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
              xml_utilities.xml_terpri();
              final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str47$xsd_import, ConsesLow.list( $str48$namespace, $str49$http___www_w3_org_XML_1998_namesp, $str50$schemaLocation, $str51$http___www_w3_org_2001_xml_xsd ), T, NIL,
                    $kw5$UNINITIALIZED );
                final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$31, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$31, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$30, thread );
              }
              xml_utilities.xml_terpri();
              final SubLObject set_contents_var = set.do_set_internal( types );
              SubLObject basis_object;
              SubLObject state;
              SubLObject type;
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                type = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, type ) )
                {
                  generate_xsd_definition_for_type( type );
                }
              }
              generate_xsd_epilogue();
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$29, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$28, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str42$xsd_schema );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return xsd_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 8602L)
  public static SubLObject compile_default_xsd_attribute_list()
  {
    return conses_high.copy_list( $default_xsd_schema_attribute_list$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 8714L)
  public static SubLObject xsd_add_target_name_space(final SubLObject att_list, final SubLObject target_name_space)
  {
    return ConsesLow.append( att_list, ConsesLow.list( $str53$targetNameSpace, target_name_space, $str54$xmlns_tns, target_name_space ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 8920L)
  public static SubLObject generate_xsd_prolegomena(SubLObject include_featuresP)
  {
    if( include_featuresP == UNPROVIDED )
    {
      include_featuresP = T;
    }
    return generate_xml_prolegomena( include_featuresP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 9050L)
  public static SubLObject generate_xsd_epilogue()
  {
    return xml_utilities.xml_terpri();
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-export.lisp", position = 9204L)
  public static SubLObject generate_xsd_definition_for_type(final SubLObject type)
  {
    xml_utilities.xml_comment( Sequences.cconcatenate( $str55$_definition_for_SYSTEM_PARAMETER_, format_nil.format_nil_a_no_copy( type ) ) );
    if( type.isCons() )
    {
      Errors.error( $str56$Dont_handle_recursive_types_yet_ );
    }
    else if( type.isSymbol() )
    {
    }
    return xml_utilities.xml_terpri();
  }

  public static SubLObject declare_system_parameter_export_file()
  {
    SubLFiles.declareFunction( me, "generate_system_parameter_xml_file", "GENERATE-SYSTEM-PARAMETER-XML-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_one_system_parameter_in_xml", "GENERATE-ONE-SYSTEM-PARAMETER-IN-XML", 2, 0, false );
    SubLFiles.declareFunction( me, "system_parameter_has_nested_elementsP", "SYSTEM-PARAMETER-HAS-NESTED-ELEMENTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "gensysparam_symbol_name_to_parameter_name", "GENSYSPARAM-SYMBOL-NAME-TO-PARAMETER-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "gensysparam_type_to_final_tag_name", "GENSYSPARAM-TYPE-TO-FINAL-TAG-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "gensysparam_type_to_tag_name", "GENSYSPARAM-TYPE-TO-TAG-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_prolegomena", "GENERATE-XML-PROLEGOMENA", 0, 1, false );
    SubLFiles.declareMacro( me, "with_xsd_schema", "WITH-XSD-SCHEMA" );
    SubLFiles.declareFunction( me, "generate_system_parameter_types_xsd", "GENERATE-SYSTEM-PARAMETER-TYPES-XSD", 2, 0, false );
    SubLFiles.declareFunction( me, "compile_default_xsd_attribute_list", "COMPILE-DEFAULT-XSD-ATTRIBUTE-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "xsd_add_target_name_space", "XSD-ADD-TARGET-NAME-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_xsd_prolegomena", "GENERATE-XSD-PROLEGOMENA", 0, 1, false );
    SubLFiles.declareFunction( me, "generate_xsd_epilogue", "GENERATE-XSD-EPILOGUE", 0, 0, false );
    SubLFiles.declareFunction( me, "generate_xsd_definition_for_type", "GENERATE-XSD-DEFINITION-FOR-TYPE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_system_parameter_export_file()
  {
    $system_parameter_name_space$ = SubLFiles.deflexical( "*SYSTEM-PARAMETER-NAME-SPACE*", $str34$http___ws_opencyc_org_xsd_sysPara );
    $default_target_name_space$ = SubLFiles.defparameter( "*DEFAULT-TARGET-NAME-SPACE*", $str45$http___ws_opencyc_org_SystemParam );
    $default_xsd_schema_attribute_list$ = SubLFiles.deflexical( "*DEFAULT-XSD-SCHEMA-ATTRIBUTE-LIST*", $list52 );
    return NIL;
  }

  public static SubLObject setup_system_parameter_export_file()
  {
    access_macros.register_external_symbol( $sym46$GENERATE_SYSTEM_PARAMETER_TYPES_XSD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_parameter_export_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_parameter_export_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_parameter_export_file();
  }
  static
  {
    me = new system_parameter_export();
    $system_parameter_name_space$ = null;
    $default_target_name_space$ = null;
    $default_xsd_schema_attribute_list$ = null;
    $kw0$OUTPUT = makeKeyword( "OUTPUT" );
    $str1$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw2$INCLUDE_FEATURES = makeKeyword( "INCLUDE-FEATURES" );
    $str3$params = makeString( "params" );
    $str4$xmlns = makeString( "xmlns" );
    $kw5$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list6 = ConsesLow.list( ConsesLow.cons( makeString( "true" ), makeString( "::TRUE::" ) ), ConsesLow.cons( makeString( "false" ), makeString( "::FALSE::" ) ) );
    $str7$param = makeString( "param" );
    $list8 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "DEFAULT" ), makeSymbol( "TYPE" ), makeSymbol( "DESCRIPTION" ) );
    $str9$doc = makeString( "doc" );
    $str10$Possible_Values__ = makeString( "Possible Values: " );
    $kw11$XML = makeKeyword( "XML" );
    $str12$equiv = makeString( "equiv" );
    $str13$name = makeString( "name" );
    $str14$value = makeString( "value" );
    $sym15$UNDEFINED = makeSymbol( "UNDEFINED" );
    $sym16$BOOLEAN = makeSymbol( "BOOLEAN" );
    $str17$true = makeString( "true" );
    $str18$false = makeString( "false" );
    $list19 = ConsesLow.list( makeSymbol( "OR" ), makeSymbol( "STRING" ), makeSymbol( "UNDEFINED" ) );
    $str20$string = makeString( "string" );
    $str21$undefined = makeString( "undefined" );
    $list22 = ConsesLow.list( makeSymbol( "AND" ), makeSymbol( "OR" ) );
    $list23 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "SUB-TYPES" ) );
    $sym24$OR = makeSymbol( "OR" );
    $sym25$AND = makeSymbol( "AND" );
    $sym26$MEMBER = makeSymbol( "MEMBER" );
    $str27$keyword = makeString( "keyword" );
    $str28$Unsupported_operator__A_in_type__ = makeString( "Unsupported operator ~A in type ~A." );
    $str29$Unsupported_type_descriptor__A_ = makeString( "Unsupported type descriptor ~A." );
    $str30$UTF_8 = makeString( "UTF-8" );
    $str31$__generated_by_Cyc__A____A___ = makeString( "  generated by Cyc ~A  (~A)~%" );
    $str32$____________at__A__ = makeString( "            at ~A~%" );
    $str33$__Features_of_generating_code___ = makeString( "  Features of generating code:~%" );
    $str34$http___ws_opencyc_org_xsd_sysPara = makeString( "http://ws.opencyc.org/xsd/sysParam/0.9" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "TARGET-NAME-SPACE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$ATT_LIST = makeUninternedSymbol( "ATT-LIST" );
    $sym37$CLET = makeSymbol( "CLET" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "COMPILE-DEFAULT-XSD-ATTRIBUTE-LIST" ) ) );
    $sym39$CSETQ = makeSymbol( "CSETQ" );
    $sym40$XSD_ADD_TARGET_NAME_SPACE = makeSymbol( "XSD-ADD-TARGET-NAME-SPACE" );
    $sym41$XML_TAG = makeSymbol( "XML-TAG" );
    $str42$xsd_schema = makeString( "xsd:schema" );
    $list43 = ConsesLow.list( makeSymbol( "XML-TERPRI" ) );
    $list44 = ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "xsd:import" ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "namespace" ), makeString( "http://www.w3.org/XML/1998/namespace" ),
        makeString( "schemaLocation" ), makeString( "http://www.w3.org/2001/xml.xsd" ) ), T, T ) );
    $str45$http___ws_opencyc_org_SystemParam = makeString( "http://ws.opencyc.org/SystemParameterType/0.9/" );
    $sym46$GENERATE_SYSTEM_PARAMETER_TYPES_XSD = makeSymbol( "GENERATE-SYSTEM-PARAMETER-TYPES-XSD" );
    $str47$xsd_import = makeString( "xsd:import" );
    $str48$namespace = makeString( "namespace" );
    $str49$http___www_w3_org_XML_1998_namesp = makeString( "http://www.w3.org/XML/1998/namespace" );
    $str50$schemaLocation = makeString( "schemaLocation" );
    $str51$http___www_w3_org_2001_xml_xsd = makeString( "http://www.w3.org/2001/xml.xsd" );
    $list52 = ConsesLow.list( makeString( "xmlns:xsd" ), makeString( "http://www.w3.org/2001/XMLSchema" ), makeString( "xmlns:xsi" ), makeString( "http://www.w3.org/2001/XMLSchema-instance" ), makeString(
        "xsi:schemaLocation" ), makeString( "http://www.w3.org/2001/XMLSchema http://www.w3.org/2001/XMLSchema.xsd" ), makeString( "xmlns:xml" ), makeString( "http://www.w3.org/XML/1998/namespace" ) );
    $str53$targetNameSpace = makeString( "targetNameSpace" );
    $str54$xmlns_tns = makeString( "xmlns:tns" );
    $str55$_definition_for_SYSTEM_PARAMETER_ = makeString( " definition for SYSTEM-PARAMETER type " );
    $str56$Dont_handle_recursive_types_yet_ = makeString( "Dont handle recursive types yet." );
  }
}
/*
 * 
 * Total time: 560 ms
 * 
 */