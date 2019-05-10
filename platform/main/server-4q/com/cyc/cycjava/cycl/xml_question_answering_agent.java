package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_question_answering_agent
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_question_answering_agent";
  public static final String myFingerPrint = "d15409b8af4ef8d3e25732c474a78d89dca0acc19352d391f556118090e43099";
  private static final SubLSymbol $sym0$XML_QUESTION_ANSWERING_AGENT;
  private static final SubLSymbol $sym1$QUESTION_ANSWERING_AGENT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$INSTANCE_NUMBER;
  private static final SubLSymbol $sym8$ID;
  private static final SubLSymbol $sym9$TITLE;
  private static final SubLSymbol $sym10$QUESTION;
  private static final SubLSymbol $sym11$TIP;
  private static final SubLSymbol $sym12$QUESTION_TYPE;
  private static final SubLSymbol $sym13$ERROR_MESSAGE;
  private static final SubLSymbol $sym14$CHOICES;
  private static final SubLSymbol $sym15$DESCRIPTIONS;
  private static final SubLSymbol $sym16$VALUES;
  private static final SubLSymbol $sym17$DEFAULT;
  private static final SubLSymbol $sym18$ANSWER;
  private static final SubLSymbol $sym19$FIELD_WIDTH;
  private static final SubLSymbol $sym20$FIELD_LABELS;
  private static final SubLSymbol $sym21$PROXY;
  private static final SubLSymbol $sym22$CALLBACK_FUNCTION;
  private static final SubLSymbol $sym23$CLIENT_DATA;
  private static final SubLSymbol $sym24$USER_DATA;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE;
  private static final SubLSymbol $sym26$DISPLAY_QUESTION;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$DISPLAY_QUESTION_HEADER;
  private static final SubLSymbol $sym30$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
  private static final SubLList $list31;
  private static final SubLString $str32$US_ASCII;
  private static final SubLString $str33$termLexifier;
  private static final SubLString $str34$http___www_opencyc_org_xml_termLe;
  private static final SubLSymbol $sym35$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD;
  private static final SubLSymbol $sym36$DISPLAY_QUESTION_PROPER;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLString $str39$question;
  private static final SubLSymbol $kw40$UNINITIALIZED;
  private static final SubLString $str41$__;
  private static final SubLString $str42$id;
  private static final SubLString $str43$errorMessage;
  private static final SubLString $str44$text;
  private static final SubLSymbol $kw45$BOOLEAN;
  private static final SubLString $str46$boolean;
  private static final SubLString $str47$positiveChoice;
  private static final SubLString $str48$negativeChoice;
  private static final SubLSymbol $kw49$ENUMERATED;
  private static final SubLSymbol $sym50$LISTP;
  private static final SubLString $str51$enumerated;
  private static final SubLString $str52$choices;
  private static final SubLString $str53$choice;
  private static final SubLString $str54$label;
  private static final SubLString $str55$default;
  private static final SubLSymbol $kw56$ATOMIC;
  private static final SubLSymbol $kw57$MULTIPLE_SELECTION;
  private static final SubLString $str58$multipleSelection;
  private static final SubLSymbol $kw59$FREE_FORM;
  private static final SubLString $str60$freeForm;
  private static final SubLString $str61$fieldWidth;
  private static final SubLSymbol $kw62$MULTIPLE_FREE_FORM;
  private static final SubLString $str63$multipleFreeForm;
  private static final SubLString $str64$freeFormQuestionOfMultiple;
  private static final SubLString $str65$description;
  private static final SubLString $str66$Unknown_question_type__S;
  private static final SubLString $str67$tip;
  private static final SubLSymbol $sym68$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD;
  private static final SubLSymbol $sym69$ANSWER_QUESTION;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$ANSWER_FROM_RESPONSE;
  private static final SubLSymbol $sym74$NOTIFY_CLIENT;
  private static final SubLSymbol $kw75$INPUT_READY;
  private static final SubLSymbol $sym76$XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $sym79$STRINGP;
  private static final SubLSymbol $sym80$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym81$LIST_OF_NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym82$LIST_OF_STRING_P;
  private static final SubLString $str83$Unknown_question_type__S____Can_t;
  private static final SubLSymbol $sym84$XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 998L)
  public static SubLObject subloop_reserved_initialize_xml_question_answering_agent_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 998L)
  public static SubLObject subloop_reserved_initialize_xml_question_answering_agent_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym8$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym9$TITLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym10$QUESTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym11$TIP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym12$QUESTION_TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym13$ERROR_MESSAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym14$CHOICES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym15$DESCRIPTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym16$VALUES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym17$DEFAULT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym18$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym19$FIELD_WIDTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym20$FIELD_LABELS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym21$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym22$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym23$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION_ANSWERING_AGENT, $sym24$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 998L)
  public static SubLObject xml_question_answering_agent_p(final SubLObject v_xml_question_answering_agent)
  {
    return classes.subloop_instanceof_class( v_xml_question_answering_agent, $sym0$XML_QUESTION_ANSWERING_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 1519L)
  public static SubLObject xml_question_answering_agent_display_question_method(final SubLObject self)
  {
    methods.funcall_instance_method_with_0_args( self, $sym29$DISPLAY_QUESTION_HEADER );
    xml_question_answering_agent_display_question_proper_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 1749L)
  public static SubLObject xml_question_answering_agent_display_question_header_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xml_utilities.xml_header( xml_utilities.xml_version(), $str32$US_ASCII, NIL );
    xml_utilities.generate_xml_header_entry_for_dtd( $str33$termLexifier, $str34$http___www_opencyc_org_xml_termLe, xml_vars.$xml_stream$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 2060L)
  public static SubLObject xml_question_answering_agent_display_question_proper_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_question_answering_agent_method = NIL;
    final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels( self );
    final SubLObject field_width = sme_lexification_wizard.get_question_answering_agent_field_width( self );
    final SubLObject v_default = sme_lexification_wizard.get_question_answering_agent_default( self );
    final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values( self );
    final SubLObject descriptions = sme_lexification_wizard.get_question_answering_agent_descriptions( self );
    final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices( self );
    final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message( self );
    final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type( self );
    final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip( self );
    final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question( self );
    final SubLObject id = sme_lexification_wizard.get_question_answering_agent_id( self );
    try
    {
      thread.throwStack.push( $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        try
        {
          final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str39$question, NIL, NIL, NIL, $kw40$UNINITIALIZED );
            final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
              if( NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
              {
                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                cycml.cycml_indent();
                final SubLObject name_var = $str42$id;
                xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                  xml_utilities.xml_print( id, UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
                }
                xml_utilities.xml_end_tag_internal( name_var );
              }
              if( NIL != error_message && NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
              {
                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                cycml.cycml_indent();
                final SubLObject name_var = $str43$errorMessage;
                xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                  xml_utilities.xml_print( error_message, UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$3, thread );
                }
                xml_utilities.xml_end_tag_internal( name_var );
              }
              if( NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
              {
                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                cycml.cycml_indent();
                final SubLObject name_var = $str44$text;
                xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                  xml_utilities.xml_print( v_question, UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
                }
                xml_utilities.xml_end_tag_internal( name_var );
              }
              final SubLObject pcase_var = question_type;
              if( pcase_var.eql( $kw45$BOOLEAN ) )
              {
                try
                {
                  final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str46$boolean, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                      if( NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
                      {
                        PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                        cycml.cycml_indent();
                        final SubLObject name_var2 = $str47$positiveChoice;
                        xml_utilities.xml_start_tag_internal( name_var2, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                        final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                          xml_utilities.xml_print( sme_lexification_wizard.question_answering_agent_positive_choice_method( self ), UNPROVIDED );
                        }
                        finally
                        {
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$7, thread );
                        }
                        xml_utilities.xml_end_tag_internal( name_var2 );
                      }
                      if( NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
                      {
                        PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                        cycml.cycml_indent();
                        final SubLObject name_var2 = $str48$negativeChoice;
                        xml_utilities.xml_start_tag_internal( name_var2, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                        final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                          xml_utilities.xml_print( sme_lexification_wizard.question_answering_agent_negative_choice_method( self ), UNPROVIDED );
                        }
                        finally
                        {
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
                        }
                        xml_utilities.xml_end_tag_internal( name_var2 );
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
                  final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str46$boolean );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                  }
                }
              }
              else if( pcase_var.eql( $kw49$ENUMERATED ) )
              {
                assert NIL != Types.listp( choices ) : choices;
                try
                {
                  final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str51$enumerated, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str52$choices, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                            SubLObject list_var = NIL;
                            SubLObject choice = NIL;
                            SubLObject i = NIL;
                            list_var = choices;
                            choice = list_var.first();
                            for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), choice = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
                            {
                              try
                              {
                                final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str53$choice, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                    cycml.cycml_serialize_number( i, UNPROVIDED );
                                    if( NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
                                    {
                                      PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                                      cycml.cycml_indent();
                                      final SubLObject name_var3 = $str54$label;
                                      xml_utilities.xml_start_tag_internal( name_var3, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                                      final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                      try
                                      {
                                        xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                                        xml_utilities.xml_print( choice, UNPROVIDED );
                                      }
                                      finally
                                      {
                                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
                                      }
                                      xml_utilities.xml_end_tag_internal( name_var3 );
                                    }
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$15, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$9, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$14, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values2 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str53$choice );
                                  Values.restoreValuesFromVector( _values2 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                                }
                              }
                              if( !v_default.equal( choice ) )
                              {
                                if( !v_default.equal( ConsesLow.nth( i, values ) ) )
                                {
                                  continue;
                                }
                              }
                              try
                              {
                                final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str55$default, NIL, $kw56$ATOMIC, NIL, $kw40$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$19, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$10, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$18, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values3 = Values.getValuesAsVector();
                                  Values.restoreValuesFromVector( _values3 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$13, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$8, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$12, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values4 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str52$choices );
                          Values.restoreValuesFromVector( _values4 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                        }
                      }
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
                  final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str51$enumerated );
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
                  }
                }
              }
              else if( pcase_var.eql( $kw57$MULTIPLE_SELECTION ) )
              {
                assert NIL != Types.listp( choices ) : choices;
                try
                {
                  final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str58$multipleSelection, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str52$choices, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                            SubLObject list_var = NIL;
                            SubLObject choice = NIL;
                            SubLObject i = NIL;
                            list_var = choices;
                            choice = list_var.first();
                            for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), choice = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
                            {
                              try
                              {
                                final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$13 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str53$choice, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                    cycml.cycml_serialize_number( i, UNPROVIDED );
                                    if( NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
                                    {
                                      PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                                      cycml.cycml_indent();
                                      final SubLObject name_var3 = $str54$label;
                                      xml_utilities.xml_start_tag_internal( name_var3, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                                      final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                      try
                                      {
                                        xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                                        xml_utilities.xml_print( choice, UNPROVIDED );
                                      }
                                      finally
                                      {
                                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$29, thread );
                                      }
                                      xml_utilities.xml_end_tag_internal( name_var3 );
                                    }
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$28, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$13, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$27, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values6 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str53$choice );
                                  Values.restoreValuesFromVector( _values6 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                                }
                              }
                              if( NIL == subl_promotions.memberP( choice, v_default, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                              {
                                if( NIL == conses_high.member( ConsesLow.nth( i, values ), v_default, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                                {
                                  continue;
                                }
                              }
                              try
                              {
                                final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str55$default, NIL, $kw56$ATOMIC, NIL, $kw40$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$32, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$14, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$31, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values7 = Values.getValuesAsVector();
                                  Values.restoreValuesFromVector( _values7 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$26, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$12, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$25, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values8 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str52$choices );
                          Values.restoreValuesFromVector( _values8 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$24, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$11, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$23, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values9 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str58$multipleSelection );
                    Values.restoreValuesFromVector( _values9 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
                  }
                }
              }
              else if( pcase_var.eql( $kw59$FREE_FORM ) )
              {
                try
                {
                  final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$15 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str60$freeForm, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                      if( field_width.isNumber() )
                      {
                        try
                        {
                          final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str61$fieldWidth, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                              cycml.cycml_serialize_number( field_width, UNPROVIDED );
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$39, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$16, thread );
                            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$38, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values10 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal( $str61$fieldWidth );
                            Values.restoreValuesFromVector( _values10 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                          }
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$37, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$15, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$36, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values11 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str60$freeForm );
                    Values.restoreValuesFromVector( _values11 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
                  }
                }
              }
              else if( pcase_var.eql( $kw62$MULTIPLE_FREE_FORM ) )
              {
                try
                {
                  final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str63$multipleFreeForm, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                      if( field_width.isNumber() )
                      {
                        try
                        {
                          final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str61$fieldWidth, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                              cycml.cycml_serialize_number( field_width, UNPROVIDED );
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$45, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
                            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$44, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values12 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal( $str61$fieldWidth );
                            Values.restoreValuesFromVector( _values12 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
                          }
                        }
                      }
                      SubLObject list_var2 = NIL;
                      SubLObject label = NIL;
                      SubLObject j = NIL;
                      list_var2 = field_labels;
                      label = list_var2.first();
                      for( j = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest(), label = list_var2.first(), j = Numbers.add( ONE_INTEGER, j ) )
                      {
                        final SubLObject default_value = Sequences.elt( v_default, j );
                        final SubLObject optional_description = Sequences.elt( descriptions, j );
                        try
                        {
                          final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str64$freeFormQuestionOfMultiple, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                              try
                              {
                                final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str54$label, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                    xml_utilities.xml_print( label, UNPROVIDED );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$50, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$20, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$49, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values13 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str54$label );
                                  Values.restoreValuesFromVector( _values13 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
                                }
                              }
                              if( default_value.isString() )
                              {
                                try
                                {
                                  final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                  try
                                  {
                                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                        thread ) ), thread );
                                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                    xml_utilities.xml_start_tag_internal( $str55$default, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                                    final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                    try
                                    {
                                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                      xml_utilities.xml_print( default_value, UNPROVIDED );
                                    }
                                    finally
                                    {
                                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$53, thread );
                                    }
                                  }
                                  finally
                                  {
                                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$21, thread );
                                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$52, thread );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values14 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal( $str55$default );
                                    Values.restoreValuesFromVector( _values14 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
                                  }
                                }
                              }
                              if( NIL != string_utilities.non_empty_stringP( optional_description ) )
                              {
                                try
                                {
                                  final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                  try
                                  {
                                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                        thread ) ), thread );
                                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                    xml_utilities.xml_start_tag_internal( $str65$description, NIL, NIL, NIL, $kw40$UNINITIALIZED );
                                    final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                    try
                                    {
                                      xml_vars.$xml_default_namespace$.bind( $kw40$UNINITIALIZED, thread );
                                      xml_utilities.xml_print( optional_description, UNPROVIDED );
                                    }
                                    finally
                                    {
                                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$56, thread );
                                    }
                                  }
                                  finally
                                  {
                                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$22, thread );
                                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$55, thread );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values15 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal( $str65$description );
                                    Values.restoreValuesFromVector( _values15 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$48, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$19, thread );
                            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$47, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values16 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal( $str64$freeFormQuestionOfMultiple );
                            Values.restoreValuesFromVector( _values16 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
                          }
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$43, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$17, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$42, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values17 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str63$multipleFreeForm );
                    Values.restoreValuesFromVector( _values17 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$59, thread );
                  }
                }
              }
              else
              {
                Errors.error( $str66$Unknown_question_type__S, question_type );
              }
              if( tip.isString() && NIL != cycml.$cycml_indent_mode_on$.getDynamicValue( thread ) )
              {
                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str41$__ );
                cycml.cycml_indent();
                final SubLObject name_var = $str67$tip;
                xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, NIL, xml_vars.cycml_namespace() );
                final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( xml_vars.cycml_namespace(), thread );
                  xml_utilities.xml_print( tip, UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$60, thread );
                }
                xml_utilities.xml_end_tag_internal( name_var );
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$1, thread );
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
            final SubLObject _values18 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str39$question );
            Values.restoreValuesFromVector( _values18 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
        Dynamic.sublisp_throw( $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values19 = Values.getValuesAsVector();
          sme_lexification_wizard.set_question_answering_agent_field_labels( self, field_labels );
          sme_lexification_wizard.set_question_answering_agent_field_width( self, field_width );
          sme_lexification_wizard.set_question_answering_agent_default( self, v_default );
          sme_lexification_wizard.set_question_answering_agent_values( self, values );
          sme_lexification_wizard.set_question_answering_agent_descriptions( self, descriptions );
          sme_lexification_wizard.set_question_answering_agent_choices( self, choices );
          sme_lexification_wizard.set_question_answering_agent_error_message( self, error_message );
          sme_lexification_wizard.set_question_answering_agent_question_type( self, question_type );
          sme_lexification_wizard.set_question_answering_agent_tip( self, tip );
          sme_lexification_wizard.set_question_answering_agent_question( self, v_question );
          sme_lexification_wizard.set_question_answering_agent_id( self, id );
          Values.restoreValuesFromVector( _values19 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_xml_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 4746L)
  public static SubLObject xml_question_answering_agent_answer_question_method(final SubLObject self, final SubLObject response)
  {
    SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer( self );
    final SubLObject decoded_answer = v_answer = methods.funcall_instance_method_with_1_args( self, $sym73$ANSWER_FROM_RESPONSE, response );
    sme_lexification_wizard.set_question_answering_agent_answer( self, v_answer );
    methods.funcall_instance_method_with_1_args( self, $sym74$NOTIFY_CLIENT, $kw75$INPUT_READY );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 5106L)
  public static SubLObject xml_question_answering_agent_answer_from_response_method(final SubLObject self, final SubLObject response)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_xml_question_answering_agent_method = NIL;
    final SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer( self );
    final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values( self );
    final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices( self );
    final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type( self );
    try
    {
      thread.throwStack.push( $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        final SubLObject pcase_var = question_type;
        if( pcase_var.eql( $kw45$BOOLEAN ) )
        {
          assert NIL != Types.stringp( response ) : response;
          Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response );
        }
        else if( pcase_var.eql( $kw49$ENUMERATED ) )
        {
          assert NIL != subl_promotions.non_negative_integer_p( response ) : response;
          Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, ConsesLow.nth( response, ( NIL != values ) ? values : choices ) );
        }
        else if( pcase_var.eql( $kw57$MULTIPLE_SELECTION ) )
        {
          assert NIL != number_utilities.list_of_non_negative_integer_p( response ) : response;
          SubLObject v_answer_$78 = NIL;
          SubLObject cdolist_list_var = response;
          SubLObject pointer = NIL;
          pointer = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            v_answer_$78 = ConsesLow.cons( ConsesLow.nth( pointer, ( NIL != values ) ? values : choices ), v_answer_$78 );
            cdolist_list_var = cdolist_list_var.rest();
            pointer = cdolist_list_var.first();
          }
          Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, Sequences.nreverse( v_answer_$78 ) );
        }
        else if( pcase_var.eql( $kw59$FREE_FORM ) )
        {
          assert NIL != Types.stringp( response ) : response;
          Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response );
        }
        else if( pcase_var.eql( $kw62$MULTIPLE_FREE_FORM ) )
        {
          assert NIL != string_utilities.list_of_string_p( response ) : response;
          Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response );
        }
        else
        {
          Errors.error( $str83$Unknown_question_type__S____Can_t, question_type, response );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_question_answering_agent_answer( self, v_answer );
          sme_lexification_wizard.set_question_answering_agent_values( self, values );
          sme_lexification_wizard.set_question_answering_agent_choices( self, choices );
          sme_lexification_wizard.set_question_answering_agent_question_type( self, question_type );
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
      catch_var_for_xml_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_xml_question_answering_agent_method;
  }

  public static SubLObject declare_xml_question_answering_agent_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_question_answering_agent_p", "XML-QUESTION-ANSWERING-AGENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_question_answering_agent_display_question_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_question_answering_agent_display_question_header_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-HEADER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_question_answering_agent_display_question_proper_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_question_answering_agent_answer_question_method", "XML-QUESTION-ANSWERING-AGENT-ANSWER-QUESTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_question_answering_agent_answer_from_response_method", "XML-QUESTION-ANSWERING-AGENT-ANSWER-FROM-RESPONSE-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_xml_question_answering_agent_file()
  {
    return NIL;
  }

  public static SubLObject setup_xml_question_answering_agent_file()
  {
    classes.subloop_new_class( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym1$QUESTION_ANSWERING_AGENT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$XML_QUESTION_ANSWERING_AGENT, NIL );
    classes.subloop_note_class_initialization_function( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE );
    subloop_reserved_initialize_xml_question_answering_agent_class( $sym0$XML_QUESTION_ANSWERING_AGENT );
    methods.methods_incorporate_instance_method( $sym26$DISPLAY_QUESTION, $sym0$XML_QUESTION_ANSWERING_AGENT, $list27, NIL, $list28 );
    methods.subloop_register_instance_method( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym26$DISPLAY_QUESTION, $sym30$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym29$DISPLAY_QUESTION_HEADER, $sym0$XML_QUESTION_ANSWERING_AGENT, $list27, NIL, $list31 );
    methods.subloop_register_instance_method( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym29$DISPLAY_QUESTION_HEADER, $sym35$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD );
    methods.methods_incorporate_instance_method( $sym36$DISPLAY_QUESTION_PROPER, $sym0$XML_QUESTION_ANSWERING_AGENT, $list27, NIL, $list37 );
    methods.subloop_register_instance_method( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym36$DISPLAY_QUESTION_PROPER, $sym68$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD );
    methods.methods_incorporate_instance_method( $sym69$ANSWER_QUESTION, $sym0$XML_QUESTION_ANSWERING_AGENT, $list70, $list71, $list72 );
    methods.subloop_register_instance_method( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym69$ANSWER_QUESTION, $sym76$XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym73$ANSWER_FROM_RESPONSE, $sym0$XML_QUESTION_ANSWERING_AGENT, $list27, $list71, $list77 );
    methods.subloop_register_instance_method( $sym0$XML_QUESTION_ANSWERING_AGENT, $sym73$ANSWER_FROM_RESPONSE, $sym84$XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_question_answering_agent_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_question_answering_agent_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_question_answering_agent_file();
  }
  static
  {
    me = new xml_question_answering_agent();
    $sym0$XML_QUESTION_ANSWERING_AGENT = makeSymbol( "XML-QUESTION-ANSWERING-AGENT" );
    $sym1$QUESTION_ANSWERING_AGENT = makeSymbol( "QUESTION-ANSWERING-AGENT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-QUESTION-HEADER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "DISPLAY-QUESTION-PROPER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-TYPE-DEPENDENT-QUESTION-DATA" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-FROM-RESPONSE" ), ConsesLow.list( makeSymbol( "RESPONSE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "ANSWER-QUESTION" ), ConsesLow.list( makeSymbol( "RESPONSE" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym8$ID = makeSymbol( "ID" );
    $sym9$TITLE = makeSymbol( "TITLE" );
    $sym10$QUESTION = makeSymbol( "QUESTION" );
    $sym11$TIP = makeSymbol( "TIP" );
    $sym12$QUESTION_TYPE = makeSymbol( "QUESTION-TYPE" );
    $sym13$ERROR_MESSAGE = makeSymbol( "ERROR-MESSAGE" );
    $sym14$CHOICES = makeSymbol( "CHOICES" );
    $sym15$DESCRIPTIONS = makeSymbol( "DESCRIPTIONS" );
    $sym16$VALUES = makeSymbol( "VALUES" );
    $sym17$DEFAULT = makeSymbol( "DEFAULT" );
    $sym18$ANSWER = makeSymbol( "ANSWER" );
    $sym19$FIELD_WIDTH = makeSymbol( "FIELD-WIDTH" );
    $sym20$FIELD_LABELS = makeSymbol( "FIELD-LABELS" );
    $sym21$PROXY = makeSymbol( "PROXY" );
    $sym22$CALLBACK_FUNCTION = makeSymbol( "CALLBACK-FUNCTION" );
    $sym23$CLIENT_DATA = makeSymbol( "CLIENT-DATA" );
    $sym24$USER_DATA = makeSymbol( "USER-DATA" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-INSTANCE" );
    $sym26$DISPLAY_QUESTION = makeSymbol( "DISPLAY-QUESTION" );
    $list27 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DISPLAY-QUESTION-HEADER" ) ) ), ConsesLow.list( makeSymbol(
        "DISPLAY-QUESTION-PROPER" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym29$DISPLAY_QUESTION_HEADER = makeSymbol( "DISPLAY-QUESTION-HEADER" );
    $sym30$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol( "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD" );
    $list31 = ConsesLow.list( makeString( "Output suitable XML header to *XML-STREAM*." ), ConsesLow.list( makeSymbol( "XML-HEADER" ), ConsesLow.list( makeSymbol( "XML-VERSION" ) ), makeString( "US-ASCII" ), NIL ),
        ConsesLow.list( makeSymbol( "GENERATE-XML-HEADER-ENTRY-FOR-DTD" ), makeString( "termLexifier" ), makeString( "http://www.opencyc.org/xml/termLexifier.dtd" ), makeSymbol( "*XML-STREAM*" ) ), ConsesLow.list(
            makeSymbol( "RET" ), NIL ) );
    $str32$US_ASCII = makeString( "US-ASCII" );
    $str33$termLexifier = makeString( "termLexifier" );
    $str34$http___www_opencyc_org_xml_termLe = makeString( "http://www.opencyc.org/xml/termLexifier.dtd" );
    $sym35$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD = makeSymbol( "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-HEADER-METHOD" );
    $sym36$DISPLAY_QUESTION_PROPER = makeSymbol( "DISPLAY-QUESTION-PROPER" );
    $list37 = ConsesLow.list( makeString( "Outputs the question proper to *XML-STREAM*." ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "question" ) ), ConsesLow.list( makeSymbol(
        "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "id" ), NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), makeSymbol( "ID" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR-MESSAGE" ), ConsesLow
            .list( makeSymbol( "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "errorMessage" ), NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), makeSymbol( "ERROR-MESSAGE" ) ) ) ), ConsesLow.list( makeSymbol(
                "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "text" ), NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), makeSymbol( "QUESTION" ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol(
                    "QUESTION-TYPE" ), ConsesLow.list( makeKeyword( "BOOLEAN" ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "boolean" ) ), ConsesLow.list( makeSymbol(
                        "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "positiveChoice" ), NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), ConsesLow.list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ) ) ),
                        ConsesLow.list( makeSymbol( "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "negativeChoice" ), NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), ConsesLow.list( makeSymbol( "NEGATIVE-CHOICE" ),
                            makeSymbol( "SELF" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "ENUMERATED" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "CHOICES" ), makeSymbol( "LISTP" ) ), ConsesLow.list(
                                makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "enumerated" ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "choices" ) ), ConsesLow.list( makeSymbol(
                                    "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "CHOICE" ), makeSymbol( "I" ), makeSymbol( "CHOICES" ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString(
                                        "choice" ) ), ConsesLow.list( makeSymbol( "CYCML-SERIALIZE-NUMBER" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "label" ),
                                            NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), makeSymbol( "CHOICE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( EQUAL,
                                                makeSymbol( "DEFAULT" ), makeSymbol( "CHOICE" ) ), ConsesLow.list( EQUAL, makeSymbol( "DEFAULT" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "I" ), makeSymbol(
                                                    "VALUES" ) ) ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "default" ), NIL, makeKeyword( "ATOMIC" ) ) ) ) ) ) ) ), ConsesLow.list(
                                                        makeKeyword( "MULTIPLE-SELECTION" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "CHOICES" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol(
                                                            "XML-TAG" ), ConsesLow.list( makeString( "multipleSelection" ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "choices" ) ), ConsesLow
                                                                .list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "CHOICE" ), makeSymbol( "I" ), makeSymbol( "CHOICES" ) ), ConsesLow.list( makeSymbol(
                                                                    "XML-TAG" ), ConsesLow.list( makeString( "choice" ) ), ConsesLow.list( makeSymbol( "CYCML-SERIALIZE-NUMBER" ), makeSymbol( "I" ) ), ConsesLow.list(
                                                                        makeSymbol( "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "label" ), NIL, ConsesLow.list( makeSymbol( "XML-PRINT" ), makeSymbol(
                                                                            "CHOICE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                                                                                makeSymbol( "CHOICE" ), makeSymbol( "DEFAULT" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ), ConsesLow.list( makeSymbol(
                                                                                    "MEMBER" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "I" ), makeSymbol( "VALUES" ) ), makeSymbol( "DEFAULT" ), ConsesLow.list(
                                                                                        makeSymbol( "FUNCTION" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "default" ), NIL,
                                                                                            makeKeyword( "ATOMIC" ) ) ) ) ) ) ) ), ConsesLow.list( makeKeyword( "FREE-FORM" ), ConsesLow.list( makeSymbol( "XML-TAG" ),
                                                                                                ConsesLow.list( makeString( "freeForm" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NUMBERP" ),
                                                                                                    makeSymbol( "FIELD-WIDTH" ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "fieldWidth" ) ),
                                                                                                        ConsesLow.list( makeSymbol( "CYCML-SERIALIZE-NUMBER" ), makeSymbol( "FIELD-WIDTH" ) ) ) ) ) ), ConsesLow.list(
                                                                                                            makeKeyword( "MULTIPLE-FREE-FORM" ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString(
                                                                                                                "multipleFreeForm" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NUMBERP" ),
                                                                                                                    makeSymbol( "FIELD-WIDTH" ) ), ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString(
                                                                                                                        "fieldWidth" ) ), ConsesLow.list( makeSymbol( "CYCML-SERIALIZE-NUMBER" ), makeSymbol(
                                                                                                                            "FIELD-WIDTH" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list(
                                                                                                                                makeSymbol( "LABEL" ), makeSymbol( "I" ), makeSymbol( "FIELD-LABELS" ) ), ConsesLow.list(
                                                                                                                                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DEFAULT-VALUE" ),
                                                                                                                                        ConsesLow.list( makeSymbol( "ELT" ), makeSymbol( "DEFAULT" ), makeSymbol( "I" ) ) ),
                                                                                                                                        ConsesLow.list( makeSymbol( "OPTIONAL-DESCRIPTION" ), ConsesLow.list( makeSymbol(
                                                                                                                                            "ELT" ), makeSymbol( "DESCRIPTIONS" ), makeSymbol( "I" ) ) ) ), ConsesLow.list(
                                                                                                                                                makeSymbol( "XML-TAG" ), ConsesLow.list( makeString(
                                                                                                                                                    "freeFormQuestionOfMultiple" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                        "XML-TAG" ), ConsesLow.list( makeString( "label" ) ), ConsesLow
                                                                                                                                                            .list( makeSymbol( "XML-PRINT" ), makeSymbol( "LABEL" ) ) ),
                                                                                                                                                ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                                                                                                                    "STRINGP" ), makeSymbol( "DEFAULT-VALUE" ) ), ConsesLow.list(
                                                                                                                                                        makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "default" ) ),
                                                                                                                                                        ConsesLow.list( makeSymbol( "XML-PRINT" ), makeSymbol(
                                                                                                                                                            "DEFAULT-VALUE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                                                                                                                                ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ),
                                                                                                                                                                    makeSymbol( "OPTIONAL-DESCRIPTION" ) ), ConsesLow.list(
                                                                                                                                                                        makeSymbol( "XML-TAG" ), ConsesLow.list( makeString(
                                                                                                                                                                            "description" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                                "XML-PRINT" ), makeSymbol(
                                                                                                                                                                                    "OPTIONAL-DESCRIPTION" ) ) ) ) ) ) ) ) ),
                    ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Unknown question type ~S" ), makeSymbol( "QUESTION-TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                        ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "TIP" ) ), ConsesLow.list( makeSymbol( "CYCML-PRIMITIVE-INDENTED-ELEMENT" ), makeString( "tip" ), NIL, ConsesLow.list( makeSymbol(
                            "XML-PRINT" ), makeSymbol( "TIP" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-QUESTION-ANSWERING-AGENT-METHOD" );
    $str39$question = makeString( "question" );
    $kw40$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str41$__ = makeString( "~&" );
    $str42$id = makeString( "id" );
    $str43$errorMessage = makeString( "errorMessage" );
    $str44$text = makeString( "text" );
    $kw45$BOOLEAN = makeKeyword( "BOOLEAN" );
    $str46$boolean = makeString( "boolean" );
    $str47$positiveChoice = makeString( "positiveChoice" );
    $str48$negativeChoice = makeString( "negativeChoice" );
    $kw49$ENUMERATED = makeKeyword( "ENUMERATED" );
    $sym50$LISTP = makeSymbol( "LISTP" );
    $str51$enumerated = makeString( "enumerated" );
    $str52$choices = makeString( "choices" );
    $str53$choice = makeString( "choice" );
    $str54$label = makeString( "label" );
    $str55$default = makeString( "default" );
    $kw56$ATOMIC = makeKeyword( "ATOMIC" );
    $kw57$MULTIPLE_SELECTION = makeKeyword( "MULTIPLE-SELECTION" );
    $str58$multipleSelection = makeString( "multipleSelection" );
    $kw59$FREE_FORM = makeKeyword( "FREE-FORM" );
    $str60$freeForm = makeString( "freeForm" );
    $str61$fieldWidth = makeString( "fieldWidth" );
    $kw62$MULTIPLE_FREE_FORM = makeKeyword( "MULTIPLE-FREE-FORM" );
    $str63$multipleFreeForm = makeString( "multipleFreeForm" );
    $str64$freeFormQuestionOfMultiple = makeString( "freeFormQuestionOfMultiple" );
    $str65$description = makeString( "description" );
    $str66$Unknown_question_type__S = makeString( "Unknown question type ~S" );
    $str67$tip = makeString( "tip" );
    $sym68$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD = makeSymbol( "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD" );
    $sym69$ANSWER_QUESTION = makeSymbol( "ANSWER-QUESTION" );
    $list70 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PUBLIC" ) );
    $list71 = ConsesLow.list( makeSymbol( "RESPONSE" ) );
    $list72 = ConsesLow.list( makeString( "Send RESPONSE to the question posed by the agent." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DECODED-ANSWER" ), ConsesLow.list(
        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-FROM-RESPONSE" ) ), makeSymbol( "RESPONSE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
            makeSymbol( "ANSWER" ), makeSymbol( "DECODED-ANSWER" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOTIFY-CLIENT" ) ),
                makeKeyword( "INPUT-READY" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym73$ANSWER_FROM_RESPONSE = makeSymbol( "ANSWER-FROM-RESPONSE" );
    $sym74$NOTIFY_CLIENT = makeSymbol( "NOTIFY-CLIENT" );
    $kw75$INPUT_READY = makeKeyword( "INPUT-READY" );
    $sym76$XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD = makeSymbol( "XML-QUESTION-ANSWERING-AGENT-ANSWER-QUESTION-METHOD" );
    $list77 = ConsesLow.list( makeString( "Validate and decode RESPONSE into an appropriate answer to send to the client." ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "QUESTION-TYPE" ), ConsesLow.list(
        makeKeyword( "BOOLEAN" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "RESPONSE" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESPONSE" ) ) ), ConsesLow.list(
            makeKeyword( "ENUMERATED" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "RESPONSE" ), makeSymbol( "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "NTH" ), makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "FIRST-OF" ), makeSymbol( "VALUES" ), makeSymbol( "CHOICES" ) ) ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-SELECTION" ), ConsesLow.list(
                    makeSymbol( "CHECK-TYPE" ), makeSymbol( "RESPONSE" ), makeSymbol( "LIST-OF-NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER" ),
                        NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "POINTER" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NTH" ),
                            makeSymbol( "POINTER" ), ConsesLow.list( makeSymbol( "FIRST-OF" ), makeSymbol( "VALUES" ), makeSymbol( "CHOICES" ) ) ), makeSymbol( "ANSWER" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "ANSWER" ) ) ) ) ), ConsesLow.list( makeKeyword( "FREE-FORM" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "RESPONSE" ),
                                    makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESPONSE" ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-FREE-FORM" ), ConsesLow.list( makeSymbol(
                                        "CHECK-TYPE" ), makeSymbol( "RESPONSE" ), makeSymbol( "LIST-OF-STRING-P" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESPONSE" ) ) ), ConsesLow.list( makeSymbol(
                                            "OTHERWISE" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Unknown question type ~S.~% Can't extract answer from ~S~%" ), makeSymbol( "QUESTION-TYPE" ), makeSymbol(
                                                "RESPONSE" ) ) ) ) );
    $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-XML-QUESTION-ANSWERING-AGENT-METHOD" );
    $sym79$STRINGP = makeSymbol( "STRINGP" );
    $sym80$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym81$LIST_OF_NON_NEGATIVE_INTEGER_P = makeSymbol( "LIST-OF-NON-NEGATIVE-INTEGER-P" );
    $sym82$LIST_OF_STRING_P = makeSymbol( "LIST-OF-STRING-P" );
    $str83$Unknown_question_type__S____Can_t = makeString( "Unknown question type ~S.~% Can't extract answer from ~S~%" );
    $sym84$XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD = makeSymbol( "XML-QUESTION-ANSWERING-AGENT-ANSWER-FROM-RESPONSE-METHOD" );
  }
}
/*
 * 
 * Total time: 3393 ms
 * 
 */