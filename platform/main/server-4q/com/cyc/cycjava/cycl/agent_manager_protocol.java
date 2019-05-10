package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class agent_manager_protocol
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.agent_manager_protocol";
  public static final String myFingerPrint = "cbdbd2cff9a78bf789f40d04e777fa5d6b726bd1f611bb52560342893fd06e1b";
  private static final SubLSymbol $sym0$FIPA_TRANSPORT_MESSAGE;
  private static final SubLSymbol $sym1$LIST;
  private static final SubLSymbol $sym2$QUOTE;
  private static final SubLSymbol $sym3$ENVELOPE;
  private static final SubLSymbol $sym4$PAYLOAD;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$ASK_ALL;
  private static final SubLSymbol $kw7$SENDER;
  private static final SubLSymbol $sym8$A_SENDER;
  private static final SubLSymbol $kw9$RECEIVER;
  private static final SubLSymbol $sym10$A_RECEIVER;
  private static final SubLSymbol $kw11$REPLY_WITH;
  private static final SubLSymbol $sym12$A_REPLY_WITH;
  private static final SubLSymbol $kw13$IN_REPLY_TO;
  private static final SubLSymbol $sym14$AN_IN_REPLY_TO;
  private static final SubLSymbol $kw15$CONTENT;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$LANGUAGE;
  private static final SubLSymbol $sym18$AMP;
  private static final SubLSymbol $kw19$ONTOLOGY;
  private static final SubLSymbol $sym20$CYCL;
  private static final SubLSymbol $kw21$FORCE;
  private static final SubLString $str22$__amp_demo__S__;
  private static final SubLString $str23$amp_performative__S__;
  private static final SubLString $str24$amp_parm_value__sender__S__;

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 647L)
  public static SubLObject create_fipa_transport_message(final SubLObject envelope, final SubLObject payload)
  {
    return ConsesLow.list( $sym0$FIPA_TRANSPORT_MESSAGE, envelope, payload );
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 914L)
  public static SubLObject fipa_transport_message_envelope(final SubLObject fipa_transport_message)
  {
    return conses_high.second( fipa_transport_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 1083L)
  public static SubLObject fipa_tranport_message_payload(final SubLObject fipa_transport_message)
  {
    return conses_high.third( fipa_transport_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 1248L)
  public static SubLObject create_fipa_envelope(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    SubLObject parms;
    final SubLObject current = parms = datum;
    SubLObject envelope = ConsesLow.list( $sym1$LIST, ConsesLow.list( $sym2$QUOTE, $sym3$ENVELOPE ) );
    while ( NIL != parms)
    {
      envelope = ConsesLow.append( envelope, ConsesLow.list( ConsesLow.list( $sym2$QUOTE, parms.first() ), conses_high.cadr( parms ) ) );
      parms = conses_high.cddr( parms );
    }
    return envelope;
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 1772L)
  public static SubLObject fipa_envelope_value(final SubLObject envelope, final SubLObject parm)
  {
    for( SubLObject parms = envelope.rest(); NIL != parms; parms = conses_high.cddr( parms ) )
    {
      if( parms.first().eql( parm ) )
      {
        return conses_high.cadr( parms );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 2115L)
  public static SubLObject create_fipa_payload(final SubLObject amp)
  {
    return ConsesLow.list( $sym4$PAYLOAD, amp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 2262L)
  public static SubLObject fipa_payload_amp(final SubLObject payload)
  {
    return conses_high.second( payload );
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 2398L)
  public static SubLObject create_amp(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject performative = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    performative = current.first();
    SubLObject parms;
    current = ( parms = current.rest() );
    SubLObject amp = ConsesLow.list( $sym1$LIST, ConsesLow.list( $sym2$QUOTE, performative ) );
    while ( NIL != parms)
    {
      amp = ConsesLow.append( amp, ConsesLow.list( ConsesLow.list( $sym2$QUOTE, parms.first() ), conses_high.cadr( parms ) ) );
      parms = conses_high.cddr( parms );
    }
    return amp;
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 2878L)
  public static SubLObject amp_performative(final SubLObject amp)
  {
    return amp.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 2996L)
  public static SubLObject amp_parm_value(final SubLObject amp, final SubLObject parm)
  {
    for( SubLObject parms = amp.rest(); NIL != parms; parms = conses_high.cddr( parms ) )
    {
      if( parms.first().eql( parm ) )
      {
        return conses_high.cadr( parms );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/agent-manager-protocol.lisp", position = 3314L)
  public static SubLObject amp_demo()
  {
    SubLObject amp = NIL;
    amp = ConsesLow.list( new SubLObject[] { $sym6$ASK_ALL, $kw7$SENDER, $sym8$A_SENDER, $kw9$RECEIVER, $sym10$A_RECEIVER, $kw11$REPLY_WITH, $sym12$A_REPLY_WITH, $kw13$IN_REPLY_TO, $sym14$AN_IN_REPLY_TO, $kw15$CONTENT,
      $list16, $kw17$LANGUAGE, $sym18$AMP, $kw19$ONTOLOGY, $sym20$CYCL, $kw21$FORCE, T
    } );
    PrintLow.format( T, $str22$__amp_demo__S__, amp );
    PrintLow.format( T, $str23$amp_performative__S__, amp_performative( amp ) );
    PrintLow.format( T, $str24$amp_parm_value__sender__S__, amp_parm_value( amp, $kw7$SENDER ) );
    return NIL;
  }

  public static SubLObject declare_agent_manager_protocol_file()
  {
    SubLFiles.declareFunction( me, "create_fipa_transport_message", "CREATE-FIPA-TRANSPORT-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "fipa_transport_message_envelope", "FIPA-TRANSPORT-MESSAGE-ENVELOPE", 1, 0, false );
    SubLFiles.declareFunction( me, "fipa_tranport_message_payload", "FIPA-TRANPORT-MESSAGE-PAYLOAD", 1, 0, false );
    SubLFiles.declareMacro( me, "create_fipa_envelope", "CREATE-FIPA-ENVELOPE" );
    SubLFiles.declareFunction( me, "fipa_envelope_value", "FIPA-ENVELOPE-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "create_fipa_payload", "CREATE-FIPA-PAYLOAD", 1, 0, false );
    SubLFiles.declareFunction( me, "fipa_payload_amp", "FIPA-PAYLOAD-AMP", 1, 0, false );
    SubLFiles.declareMacro( me, "create_amp", "CREATE-AMP" );
    SubLFiles.declareFunction( me, "amp_performative", "AMP-PERFORMATIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "amp_parm_value", "AMP-PARM-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "amp_demo", "AMP-DEMO", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_agent_manager_protocol_file()
  {
    return NIL;
  }

  public static SubLObject setup_agent_manager_protocol_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_agent_manager_protocol_file();
  }

  @Override
  public void initializeVariables()
  {
    init_agent_manager_protocol_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_agent_manager_protocol_file();
  }
  static
  {
    me = new agent_manager_protocol();
    $sym0$FIPA_TRANSPORT_MESSAGE = makeSymbol( "FIPA-TRANSPORT-MESSAGE" );
    $sym1$LIST = makeSymbol( "LIST" );
    $sym2$QUOTE = makeSymbol( "QUOTE" );
    $sym3$ENVELOPE = makeSymbol( "ENVELOPE" );
    $sym4$PAYLOAD = makeSymbol( "PAYLOAD" );
    $list5 = ConsesLow.list( makeSymbol( "PERFORMATIVE" ), makeSymbol( "&REST" ), makeSymbol( "PARMS" ) );
    $sym6$ASK_ALL = makeSymbol( "ASK-ALL" );
    $kw7$SENDER = makeKeyword( "SENDER" );
    $sym8$A_SENDER = makeSymbol( "A-SENDER" );
    $kw9$RECEIVER = makeKeyword( "RECEIVER" );
    $sym10$A_RECEIVER = makeSymbol( "A-RECEIVER" );
    $kw11$REPLY_WITH = makeKeyword( "REPLY-WITH" );
    $sym12$A_REPLY_WITH = makeSymbol( "A-REPLY-WITH" );
    $kw13$IN_REPLY_TO = makeKeyword( "IN-REPLY-TO" );
    $sym14$AN_IN_REPLY_TO = makeSymbol( "AN-IN-REPLY-TO" );
    $kw15$CONTENT = makeKeyword( "CONTENT" );
    $list16 = ConsesLow.list( makeSymbol( "SOME" ), makeSymbol( "CONTENT" ) );
    $kw17$LANGUAGE = makeKeyword( "LANGUAGE" );
    $sym18$AMP = makeSymbol( "AMP" );
    $kw19$ONTOLOGY = makeKeyword( "ONTOLOGY" );
    $sym20$CYCL = makeSymbol( "CYCL" );
    $kw21$FORCE = makeKeyword( "FORCE" );
    $str22$__amp_demo__S__ = makeString( "~%amp-demo ~S~%" );
    $str23$amp_performative__S__ = makeString( "amp-performative ~S~%" );
    $str24$amp_parm_value__sender__S__ = makeString( "amp-parm-value :sender ~S~%" );
  }
}
/*
 * 
 * Total time: 27 ms
 * 
 */