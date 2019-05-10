package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_sme_lexification_wizard
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_sme_lexification_wizard";
  public static final String myFingerPrint = "73c0875bfe49330d24ccf57d70cd1b2ae978a5ce486f44802d3438341b97ec3a";
  private static final SubLSymbol $sym0$XML_SME_LEXIFICATION_WIZARD;
  private static final SubLSymbol $sym1$SME_LEXIFICATION_WIZARD;
  private static final SubLSymbol $sym2$OBJECT;
  private static final SubLSymbol $sym3$INSTANCE_COUNT;
  private static final SubLSymbol $sym4$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS;
  private static final SubLSymbol $sym5$ISOLATED_P;
  private static final SubLSymbol $sym6$INSTANCE_NUMBER;
  private static final SubLSymbol $sym7$STATE;
  private static final SubLSymbol $sym8$NEXT_STATES;
  private static final SubLSymbol $sym9$LEXWIZ_PARAMETERS;
  private static final SubLSymbol $sym10$CURRENT_INTERACTION;
  private static final SubLSymbol $sym11$NEW_CURRENT_INTERACTION;
  private static final SubLSymbol $sym12$PROXY;
  private static final SubLSymbol $sym13$QUESTION_ANSWERING_AGENT_CLASS;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE;
  private static final SubLSymbol $sym15$INITIALIZE;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$XML_QUESTION_ANSWERING_AGENT;
  private static final SubLSymbol $sym19$XML_PROXY;
  private static final SubLSymbol $sym20$NEW;
  private static final SubLSymbol $sym21$XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD;
  private static final SubLSymbol $sym22$INTERFACE_PROXY;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE;
  private static final SubLSymbol $sym26$END_SESSION;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$XML_PROXY_END_SESSION_METHOD;
  private static final SubLSymbol $sym30$REPORT_RESULTS;
  private static final SubLList $list31;
  private static final SubLString $str32$lexificationDone;
  private static final SubLSymbol $kw33$ATOMIC;
  private static final SubLSymbol $kw34$UNINITIALIZED;
  private static final SubLSymbol $sym35$XML_PROXY_REPORT_RESULTS_METHOD;
  private static final SubLSymbol $sym36$INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM;
  private static final SubLSymbol $sym37$LEXIFY;
  private static final SubLSymbol $sym38$ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION;
  private static final SubLSymbol $sym39$INTERLOCUTOR_AGENT;
  private static final SubLSymbol $sym40$ANSWER_QUESTION;
  private static final SubLString $str41$_id_;
  private static final SubLString $str42$__id_;

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1011L)
  public static SubLObject subloop_reserved_initialize_xml_sme_lexification_wizard_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1011L)
  public static SubLObject subloop_reserved_initialize_xml_sme_lexification_wizard_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym7$STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym8$NEXT_STATES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym9$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym10$CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym11$NEW_CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym12$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SME_LEXIFICATION_WIZARD, $sym13$QUESTION_ANSWERING_AGENT_CLASS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1011L)
  public static SubLObject xml_sme_lexification_wizard_p(final SubLObject v_xml_sme_lexification_wizard)
  {
    return classes.subloop_instanceof_class( v_xml_sme_lexification_wizard, $sym0$XML_SME_LEXIFICATION_WIZARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1190L)
  public static SubLObject xml_sme_lexification_wizard_initialize_method(final SubLObject self)
  {
    SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class( self );
    SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    sme_lexification_wizard.sme_lexification_wizard_initialize_method( self );
    question_answering_agent_class = $sym18$XML_QUESTION_ANSWERING_AGENT;
    sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class( self, question_answering_agent_class );
    proxy = methods.funcall_class_method_with_0_args( $sym19$XML_PROXY, $sym20$NEW );
    sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1564L)
  public static SubLObject subloop_reserved_initialize_xml_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1564L)
  public static SubLObject subloop_reserved_initialize_xml_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1564L)
  public static SubLObject xml_proxy_p(final SubLObject xml_proxy)
  {
    return classes.subloop_instanceof_class( xml_proxy, $sym19$XML_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1758L)
  public static SubLObject xml_proxy_end_session_method(final SubLObject self)
  {
    xml_proxy_report_results_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1855L)
  public static SubLObject xml_proxy_report_results_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str32$lexificationDone, NIL, $kw33$ATOMIC, NIL, $kw34$UNINITIALIZED );
        final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
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
        final SubLObject _values = Values.getValuesAsVector();
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1975L)
  public static SubLObject invoke_xml_sme_lexification_wizard_for_term(final SubLObject v_term, SubLObject phrase, SubLObject mt)
  {
    if( phrase == UNPROVIDED )
    {
      phrase = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL == hlmt.hlmt_p( mt ) )
    {
      final SubLObject is_relational_termP = lexification_utilities.is_relationalP( v_term );
      mt = ( ( NIL != is_relational_termP ) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue( thread ) : lexicon_vars.$default_lexification_mt$.getDynamicValue( thread ) );
    }
    lexification_wizard.init_lexification_wizard( UNPROVIDED );
    final SubLObject params = lexification_wizard.$lexwiz_defaults$.getDynamicValue( thread );
    final SubLObject lexwiz = methods.funcall_class_method_with_0_args( $sym0$XML_SME_LEXIFICATION_WIZARD, $sym20$NEW );
    lexification_wizard._csetf_lexwiz_term( params, v_term );
    instances.set_slot( lexwiz, $sym9$LEXWIZ_PARAMETERS, params );
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        methods.funcall_instance_method_with_3_args( lexwiz, $sym37$LEXIFY, v_term, phrase, mt );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      ans = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    sme_lexification_wizard.reset_sme_lexification_parameters();
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 2770L)
  public static SubLObject answer_xml_sme_lexification_wizard_question(final SubLObject id, final SubLObject response)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject default_params = lexification_wizard.get_lexification_object( id );
    final SubLObject agent = instances.get_slot( default_params, $sym39$INTERLOCUTOR_AGENT );
    SubLObject ans = NIL;
    sme_lexification_wizard.lex_describe_instance( lexification_utilities.$lex_very_verbose$.getGlobalValue(), agent );
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        methods.funcall_instance_method_with_1_args( agent, $sym40$ANSWER_QUESTION, response );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      ans = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 3234L)
  public static SubLObject find_guid_in_sme_lexwiz_xml(final SubLObject reply)
  {
    final SubLObject start_tag_pos = Sequences.search( $str41$_id_, reply, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject id_start_pos = ( NIL != start_tag_pos ) ? Numbers.add( FOUR_INTEGER, start_tag_pos ) : NIL;
    final SubLObject end_tag_pos = Sequences.search( $str42$__id_, reply, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != id_start_pos && NIL != end_tag_pos ) ? string_utilities.substring( reply, id_start_pos, end_tag_pos ) : NIL;
  }

  public static SubLObject declare_xml_sme_lexification_wizard_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sme_lexification_wizard_p", "XML-SME-LEXIFICATION-WIZARD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sme_lexification_wizard_initialize_method", "XML-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_xml_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_proxy_p", "XML-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_proxy_end_session_method", "XML-PROXY-END-SESSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_proxy_report_results_method", "XML-PROXY-REPORT-RESULTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "invoke_xml_sme_lexification_wizard_for_term", "INVOKE-XML-SME-LEXIFICATION-WIZARD-FOR-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "answer_xml_sme_lexification_wizard_question", "ANSWER-XML-SME-LEXIFICATION-WIZARD-QUESTION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_guid_in_sme_lexwiz_xml", "FIND-GUID-IN-SME-LEXWIZ-XML", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_xml_sme_lexification_wizard_file()
  {
    return NIL;
  }

  public static SubLObject setup_xml_sme_lexification_wizard_file()
  {
    classes.subloop_new_class( $sym0$XML_SME_LEXIFICATION_WIZARD, $sym1$SME_LEXIFICATION_WIZARD, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym0$XML_SME_LEXIFICATION_WIZARD, NIL );
    classes.subloop_note_class_initialization_function( $sym0$XML_SME_LEXIFICATION_WIZARD, $sym4$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$XML_SME_LEXIFICATION_WIZARD, $sym14$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE );
    subloop_reserved_initialize_xml_sme_lexification_wizard_class( $sym0$XML_SME_LEXIFICATION_WIZARD );
    methods.methods_incorporate_instance_method( $sym15$INITIALIZE, $sym0$XML_SME_LEXIFICATION_WIZARD, $list16, NIL, $list17 );
    methods.subloop_register_instance_method( $sym0$XML_SME_LEXIFICATION_WIZARD, $sym15$INITIALIZE, $sym21$XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym19$XML_PROXY, $sym22$INTERFACE_PROXY, NIL, NIL, $list23 );
    classes.class_set_implements_slot_listeners( $sym19$XML_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym19$XML_PROXY, $sym24$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym19$XML_PROXY, $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE );
    subloop_reserved_initialize_xml_proxy_class( $sym19$XML_PROXY );
    methods.methods_incorporate_instance_method( $sym26$END_SESSION, $sym19$XML_PROXY, $list27, NIL, $list28 );
    methods.subloop_register_instance_method( $sym19$XML_PROXY, $sym26$END_SESSION, $sym29$XML_PROXY_END_SESSION_METHOD );
    methods.methods_incorporate_instance_method( $sym30$REPORT_RESULTS, $sym19$XML_PROXY, $list27, NIL, $list31 );
    methods.subloop_register_instance_method( $sym19$XML_PROXY, $sym30$REPORT_RESULTS, $sym35$XML_PROXY_REPORT_RESULTS_METHOD );
    access_macros.register_external_symbol( $sym36$INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM );
    access_macros.register_external_symbol( $sym38$ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_sme_lexification_wizard_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_sme_lexification_wizard_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_sme_lexification_wizard_file();
  }
  static
  {
    me = new xml_sme_lexification_wizard();
    $sym0$XML_SME_LEXIFICATION_WIZARD = makeSymbol( "XML-SME-LEXIFICATION-WIZARD" );
    $sym1$SME_LEXIFICATION_WIZARD = makeSymbol( "SME-LEXIFICATION-WIZARD" );
    $sym2$OBJECT = makeSymbol( "OBJECT" );
    $sym3$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym4$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-CLASS" );
    $sym5$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym6$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym7$STATE = makeSymbol( "STATE" );
    $sym8$NEXT_STATES = makeSymbol( "NEXT-STATES" );
    $sym9$LEXWIZ_PARAMETERS = makeSymbol( "LEXWIZ-PARAMETERS" );
    $sym10$CURRENT_INTERACTION = makeSymbol( "CURRENT-INTERACTION" );
    $sym11$NEW_CURRENT_INTERACTION = makeSymbol( "NEW-CURRENT-INTERACTION" );
    $sym12$PROXY = makeSymbol( "PROXY" );
    $sym13$QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-INSTANCE" );
    $sym15$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list16 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PROTECTED" ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "XML-QUESTION-ANSWERING-AGENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "XML-PROXY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym18$XML_QUESTION_ANSWERING_AGENT = makeSymbol( "XML-QUESTION-ANSWERING-AGENT" );
    $sym19$XML_PROXY = makeSymbol( "XML-PROXY" );
    $sym20$NEW = makeSymbol( "NEW" );
    $sym21$XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol( "XML-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD" );
    $sym22$INTERFACE_PROXY = makeSymbol( "INTERFACE-PROXY" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REPORT-RESULTS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym24$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-CLASS" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-INSTANCE" );
    $sym26$END_SESSION = makeSymbol( "END-SESSION" );
    $list27 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "REPORT-RESULTS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym29$XML_PROXY_END_SESSION_METHOD = makeSymbol( "XML-PROXY-END-SESSION-METHOD" );
    $sym30$REPORT_RESULTS = makeSymbol( "REPORT-RESULTS" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "XML-TAG" ), ConsesLow.list( makeString( "lexificationDone" ), NIL, makeKeyword( "ATOMIC" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str32$lexificationDone = makeString( "lexificationDone" );
    $kw33$ATOMIC = makeKeyword( "ATOMIC" );
    $kw34$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym35$XML_PROXY_REPORT_RESULTS_METHOD = makeSymbol( "XML-PROXY-REPORT-RESULTS-METHOD" );
    $sym36$INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM = makeSymbol( "INVOKE-XML-SME-LEXIFICATION-WIZARD-FOR-TERM" );
    $sym37$LEXIFY = makeSymbol( "LEXIFY" );
    $sym38$ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION = makeSymbol( "ANSWER-XML-SME-LEXIFICATION-WIZARD-QUESTION" );
    $sym39$INTERLOCUTOR_AGENT = makeSymbol( "INTERLOCUTOR-AGENT" );
    $sym40$ANSWER_QUESTION = makeSymbol( "ANSWER-QUESTION" );
    $str41$_id_ = makeString( "<id>" );
    $str42$__id_ = makeString( "</id>" );
  }
}
/*
 * 
 * Total time: 118 ms
 * 
 */