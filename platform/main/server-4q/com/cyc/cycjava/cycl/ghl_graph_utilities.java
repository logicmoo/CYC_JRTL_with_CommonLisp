package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_graph_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ghl_graph_utilities";
  public static final String myFingerPrint = "f42c6f4d74c0baa1377140570d99cc0713998fbfde3e3eff845eb65d520d0393";
  private static final SubLString $str0$Invalid_ghl_edge__a;

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 543L)
  public static SubLObject ghl_node_p(final SubLObject v_object)
  {
    return forts.fort_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 671L)
  public static SubLObject ghl_edge_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( v_object ) || NIL != arguments.hl_support_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 850L)
  public static SubLObject ghl_directed_edge_p(final SubLObject edge)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 1046L)
  public static SubLObject ghl_edge_label(final SubLObject edge)
  {
    if( NIL != assertions_high.gaf_assertionP( edge ) )
    {
      return assertions_high.gaf_predicate( edge );
    }
    if( NIL != arguments.hl_support_p( edge ) )
    {
      return hl_support_literal_predicate( edge );
    }
    ghl_search_vars.ghl_error( ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 1336L)
  public static SubLObject hl_support_literal_predicate(final SubLObject hl_support)
  {
    return cycl_utilities.atomic_sentence_predicate( arguments.support_sentence( hl_support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 1462L)
  public static SubLObject ghl_edge_start_node(final SubLObject edge)
  {
    if( NIL != assertions_high.gaf_assertionP( edge ) )
    {
      return assertions_high.gaf_arg1( edge );
    }
    if( NIL != arguments.hl_support_p( edge ) )
    {
      return cycl_utilities.atomic_sentence_arg1( arguments.support_sentence( edge ), UNPROVIDED );
    }
    ghl_search_vars.ghl_error( ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 1832L)
  public static SubLObject ghl_edge_end_node(final SubLObject edge)
  {
    if( NIL != assertions_high.gaf_assertionP( edge ) )
    {
      return assertions_high.gaf_arg2( edge );
    }
    if( NIL != arguments.hl_support_p( edge ) )
    {
      return cycl_utilities.atomic_sentence_arg2( arguments.support_sentence( edge ), UNPROVIDED );
    }
    ghl_search_vars.ghl_error( ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-graph-utilities.lisp", position = 2196L)
  public static SubLObject ghl_edge_mt(final SubLObject edge)
  {
    if( NIL != assertions_high.gaf_assertionP( edge ) )
    {
      return assertions_high.assertion_mt( edge );
    }
    if( NIL != arguments.hl_support_p( edge ) )
    {
      return arguments.support_mt( edge );
    }
    ghl_search_vars.ghl_error( ONE_INTEGER, $str0$Invalid_ghl_edge__a, edge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_ghl_graph_utilities_file()
  {
    SubLFiles.declareFunction( me, "ghl_node_p", "GHL-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_edge_p", "GHL-EDGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_directed_edge_p", "GHL-DIRECTED-EDGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_edge_label", "GHL-EDGE-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_literal_predicate", "HL-SUPPORT-LITERAL-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_edge_start_node", "GHL-EDGE-START-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_edge_end_node", "GHL-EDGE-END-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_edge_mt", "GHL-EDGE-MT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_ghl_graph_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_ghl_graph_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ghl_graph_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ghl_graph_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ghl_graph_utilities_file();
  }
  static
  {
    me = new ghl_graph_utilities();
    $str0$Invalid_ghl_edge__a = makeString( "Invalid ghl-edge ~a" );
  }
}
/*
 * 
 * Total time: 67 ms
 * 
 */