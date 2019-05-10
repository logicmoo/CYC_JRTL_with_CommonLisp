package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class related_concepts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.related_concepts";
  public static final String myFingerPrint = "1d58c04bca941d129fb3d7df114294535f169877e0d448eaf0cc90217c892d0e";
  private static final SubLSymbol $sym0$RELATED_CONCEPTS_XML;
  private static final SubLObject $const1$InferencePSC;
  private static final SubLString $str2$meanings;
  private static final SubLSymbol $kw3$UNINITIALIZED;
  private static final SubLSymbol $kw4$MEANING_ID;
  private static final SubLString $str5$meaning;
  private static final SubLString $str6$openCycId;
  private static final SubLString $str7$nlString;
  private static final SubLSymbol $kw8$NL_STRINGS;
  private static final SubLString $str9$category;
  private static final SubLSymbol $kw10$CATEGORY_ID;
  private static final SubLString $str11$relatedTerm;
  private static final SubLSymbol $kw12$RELATED;
  private static final SubLSymbol $kw13$CATEGORIES;
  private static final SubLSymbol $sym14$RELATED_CONCEPTS;
  private static final SubLSymbol $sym15$GET;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$BLANKS;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$DEFAULT;
  private static final SubLSymbol $sym20$BINDINGS_VALUES;
  private static final SubLList $list21;

  @SubLTranslatedFile.SubL(source = "cycl/related-concepts.lisp", position = 922L)
  public static SubLObject related_concepts_xml(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sexpr_result = related_concepts( string, mt );
    SubLObject result_string = NIL;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( NIL, thread );
      try
      {
        xml_vars.$xml_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        try
        {
          final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str2$meanings, NIL, NIL, NIL, $kw3$UNINITIALIZED );
            final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
              SubLObject cdolist_list_var = sexpr_result;
              SubLObject meaning = NIL;
              meaning = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                xml_utilities.xml_terpri();
                final SubLObject term_id = conses_high.getf( meaning, $kw4$MEANING_ID, UNPROVIDED );
                try
                {
                  final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str5$meaning, ConsesLow.list( $str6$openCycId, term_id ), NIL, NIL, $kw3$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
                      SubLObject cdolist_list_var_$6 = conses_high.getf( meaning, $kw8$NL_STRINGS, UNPROVIDED );
                      SubLObject nl_string = NIL;
                      nl_string = cdolist_list_var_$6.first();
                      while ( NIL != cdolist_list_var_$6)
                      {
                        xml_utilities.xml_terpri();
                        try
                        {
                          final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str7$nlString, NIL, NIL, NIL, $kw3$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
                              xml_utilities.xml_print( nl_string, UNPROVIDED );
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$6, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$5, thread );
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
                            xml_utilities.xml_end_tag_internal( $str7$nlString );
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                          }
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        nl_string = cdolist_list_var_$6.first();
                      }
                      SubLObject cdolist_list_var_$7 = conses_high.getf( meaning, $kw13$CATEGORIES, UNPROVIDED );
                      SubLObject category = NIL;
                      category = cdolist_list_var_$7.first();
                      while ( NIL != cdolist_list_var_$7)
                      {
                        xml_utilities.xml_terpri();
                        try
                        {
                          final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str9$category, ConsesLow.list( $str7$nlString, conses_high.getf( category, $kw10$CATEGORY_ID, UNPROVIDED ) ), NIL, NIL, $kw3$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
                              SubLObject cdolist_list_var_$8 = conses_high.getf( category, $kw8$NL_STRINGS, UNPROVIDED );
                              SubLObject nl_string2 = NIL;
                              nl_string2 = cdolist_list_var_$8.first();
                              while ( NIL != cdolist_list_var_$8)
                              {
                                xml_utilities.xml_terpri();
                                try
                                {
                                  final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                  try
                                  {
                                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                        thread ) ), thread );
                                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                    xml_utilities.xml_start_tag_internal( $str7$nlString, NIL, NIL, NIL, $kw3$UNINITIALIZED );
                                    final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                    try
                                    {
                                      xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
                                      xml_utilities.xml_print( nl_string2, UNPROVIDED );
                                    }
                                    finally
                                    {
                                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$11, thread );
                                    }
                                  }
                                  finally
                                  {
                                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$7, thread );
                                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$10, thread );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal( $str7$nlString );
                                    Values.restoreValuesFromVector( _values2 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                                  }
                                }
                                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                nl_string2 = cdolist_list_var_$8.first();
                              }
                              SubLObject cdolist_list_var_$9 = conses_high.getf( category, $kw12$RELATED, UNPROVIDED );
                              SubLObject related_term = NIL;
                              related_term = cdolist_list_var_$9.first();
                              while ( NIL != cdolist_list_var_$9)
                              {
                                xml_utilities.xml_terpri();
                                try
                                {
                                  final SubLObject _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                  try
                                  {
                                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                        thread ) ), thread );
                                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                    xml_utilities.xml_start_tag_internal( $str11$relatedTerm, ConsesLow.list( $str6$openCycId, conses_high.getf( related_term, $kw4$MEANING_ID, UNPROVIDED ) ), NIL, NIL,
                                        $kw3$UNINITIALIZED );
                                    final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                    try
                                    {
                                      xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
                                      SubLObject cdolist_list_var_$10 = conses_high.getf( related_term, $kw8$NL_STRINGS, UNPROVIDED );
                                      SubLObject nl_string3 = NIL;
                                      nl_string3 = cdolist_list_var_$10.first();
                                      while ( NIL != cdolist_list_var_$10)
                                      {
                                        xml_utilities.xml_terpri();
                                        try
                                        {
                                          final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                          try
                                          {
                                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                .getDynamicValue( thread ) ), thread );
                                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                            xml_utilities.xml_start_tag_internal( $str7$nlString, NIL, NIL, NIL, $kw3$UNINITIALIZED );
                                            final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                            try
                                            {
                                              xml_vars.$xml_default_namespace$.bind( $kw3$UNINITIALIZED, thread );
                                              xml_utilities.xml_print( nl_string3, UNPROVIDED );
                                            }
                                            finally
                                            {
                                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
                                            }
                                          }
                                          finally
                                          {
                                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$9, thread );
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
                                            xml_utilities.xml_end_tag_internal( $str7$nlString );
                                            Values.restoreValuesFromVector( _values3 );
                                          }
                                          finally
                                          {
                                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                                          }
                                        }
                                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                        nl_string3 = cdolist_list_var_$10.first();
                                      }
                                    }
                                    finally
                                    {
                                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$14, thread );
                                    }
                                  }
                                  finally
                                  {
                                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$8, thread );
                                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$13, thread );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal( $str11$relatedTerm );
                                    Values.restoreValuesFromVector( _values4 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                                  }
                                }
                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                related_term = cdolist_list_var_$9.first();
                              }
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$6, thread );
                            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$8, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values5 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal( $str9$category );
                            Values.restoreValuesFromVector( _values5 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                          }
                        }
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        category = cdolist_list_var_$7.first();
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$4, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$3, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values6 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str5$meaning );
                    Values.restoreValuesFromVector( _values6 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                  }
                }
                cdolist_list_var = cdolist_list_var.rest();
                meaning = cdolist_list_var.first();
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values7 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str2$meanings );
            Values.restoreValuesFromVector( _values7 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
          }
        }
        result_string = streams_high.get_output_stream_string( xml_vars.$xml_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values8 = Values.getValuesAsVector();
          streams_high.close( xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values8 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return result_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/related-concepts.lisp", position = 2076L)
  public static SubLObject related_concepts(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    final SubLObject meanings = term_lexicon.denots_for_term_lexicon_entries( methods.funcall_instance_method_with_1_args( term_lexicon.new_term_lexicon(), $sym15$GET, string ) );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = meanings;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject meaning_result = ConsesLow.list( $kw4$MEANING_ID, kb_utilities.compact_hl_external_id_string( cycl ), $kw8$NL_STRINGS, nl_generation_api.cycl_term_to_nl_string_internal( cycl, nl_generation_api
          .new_pph_parameters( $list16 ) ) );
      final SubLObject fragments = fragments_mentioning_term( cycl, string, T, mt, $kw17$BLANKS, NIL );
      SubLObject meaning_categories = NIL;
      SubLObject cdolist_list_var_$34 = fragments;
      SubLObject fragment = NIL;
      fragment = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        SubLObject current;
        final SubLObject datum = current = fragment;
        SubLObject cycl_sentence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        cycl_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl_string = NIL;
        SubLObject args = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        nl_string = current.first();
        current = ( args = current.rest() );
        current = temp;
        SubLObject fragment_type = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        fragment_type = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject pred = cycl_utilities.formula_arg0( cycl_sentence );
          SubLObject fragment_result = ConsesLow.list( $kw10$CATEGORY_ID, nl_generation_api.cycl_term_to_nl_string_internal( pred, $kw19$DEFAULT ).first() );
          final SubLObject related_terms = Mapping.mapcan( $sym20$BINDINGS_VALUES, inference_kernel.new_cyc_query( cycl_sentence, mt, $list21 ), EMPTY_SUBL_OBJECT_ARRAY );
          SubLObject related_result = NIL;
          SubLObject cdolist_list_var_$35 = related_terms;
          SubLObject related = NIL;
          related = cdolist_list_var_$35.first();
          while ( NIL != cdolist_list_var_$35)
          {
            related_result = ConsesLow.cons( ConsesLow.list( $kw4$MEANING_ID, kb_utilities.compact_hl_external_id_string( related ), $kw8$NL_STRINGS, nl_generation_api.cycl_term_to_nl_string_internal( related,
                nl_generation_api.new_pph_parameters( $list16 ) ) ), related_result );
            cdolist_list_var_$35 = cdolist_list_var_$35.rest();
            related = cdolist_list_var_$35.first();
          }
          fragment_result = conses_high.putf( fragment_result, $kw12$RELATED, related_result );
          if( NIL != conses_high.getf( fragment_result, $kw12$RELATED, UNPROVIDED ) )
          {
            meaning_categories = ConsesLow.cons( fragment_result, meaning_categories );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
        }
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        fragment = cdolist_list_var_$34.first();
      }
      meaning_result = conses_high.putf( meaning_result, $kw13$CATEGORIES, meaning_categories );
      result = ConsesLow.cons( meaning_result, result );
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/related-concepts.lisp", position = 3969L)
  public static SubLObject fragments_mentioning_term(final SubLObject cycl, final SubLObject string, final SubLObject must_use_all_tokensP, final SubLObject mt, final SubLObject variable_format,
      final SubLObject tight_constraint_matching)
  {
    final SubLObject raw_fragments = cae_query_search.get_fragments_for_terms( ConsesLow.list( ConsesLow.list( string, cycl ) ), must_use_all_tokensP, mt, variable_format, tight_constraint_matching, UNPROVIDED );
    SubLObject fragments = NIL;
    SubLObject cdolist_list_var = raw_fragments;
    SubLObject fragment = NIL;
    fragment = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.expression_find( cycl, fragment.first(), NIL, EQUAL, UNPROVIDED ) )
      {
        fragments = ConsesLow.cons( fragment, fragments );
      }
      cdolist_list_var = cdolist_list_var.rest();
      fragment = cdolist_list_var.first();
    }
    return fragments;
  }

  public static SubLObject declare_related_concepts_file()
  {
    SubLFiles.declareFunction( me, "related_concepts_xml", "RELATED-CONCEPTS-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "related_concepts", "RELATED-CONCEPTS", 1, 1, false );
    SubLFiles.declareFunction( me, "fragments_mentioning_term", "FRAGMENTS-MENTIONING-TERM", 6, 0, false );
    return NIL;
  }

  public static SubLObject init_related_concepts_file()
  {
    return NIL;
  }

  public static SubLObject setup_related_concepts_file()
  {
    access_macros.register_external_symbol( $sym0$RELATED_CONCEPTS_XML );
    access_macros.register_external_symbol( $sym14$RELATED_CONCEPTS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_related_concepts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_related_concepts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_related_concepts_file();
  }
  static
  {
    me = new related_concepts();
    $sym0$RELATED_CONCEPTS_XML = makeSymbol( "RELATED-CONCEPTS-XML" );
    $const1$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str2$meanings = makeString( "meanings" );
    $kw3$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw4$MEANING_ID = makeKeyword( "MEANING-ID" );
    $str5$meaning = makeString( "meaning" );
    $str6$openCycId = makeString( "openCycId" );
    $str7$nlString = makeString( "nlString" );
    $kw8$NL_STRINGS = makeKeyword( "NL-STRINGS" );
    $str9$category = makeString( "category" );
    $kw10$CATEGORY_ID = makeKeyword( "CATEGORY-ID" );
    $str11$relatedTerm = makeString( "relatedTerm" );
    $kw12$RELATED = makeKeyword( "RELATED" );
    $kw13$CATEGORIES = makeKeyword( "CATEGORIES" );
    $sym14$RELATED_CONCEPTS = makeSymbol( "RELATED-CONCEPTS" );
    $sym15$GET = makeSymbol( "GET" );
    $list16 = ConsesLow.list( makeKeyword( "PPH-GENERATION-COUNT" ), makeKeyword( "POSITIVE-INFINITY" ) );
    $kw17$BLANKS = makeKeyword( "BLANKS" );
    $list18 = ConsesLow.list( makeSymbol( "CYCL-SENTENCE" ), ConsesLow.cons( makeSymbol( "NL-STRING" ), makeSymbol( "ARGS" ) ), makeSymbol( "FRAGMENT-TYPE" ) );
    $kw19$DEFAULT = makeKeyword( "DEFAULT" );
    $sym20$BINDINGS_VALUES = makeSymbol( "BINDINGS-VALUES" );
    $list21 = ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL );
  }
}
/*
 * 
 * Total time: 754 ms
 * 
 */