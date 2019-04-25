package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class glf_api_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.glf_api_widgets";
  public static final String myFingerPrint = "c4d0284782c580a5b548e831b264b36b6cdbdef80529fe2b54fcf27e4dfddc96";
  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 1685L)
  private static SubLSymbol $glf_success_for_kb_operations$;
  private static final SubLSymbol $sym0$GET_GLF_GRAPH_IN_XML;
  private static final SubLString $str1$glfGraph;
  private static final SubLString $str2$http___www_opencyc_org_xml_glf_dt;
  private static final SubLString $str3$All_KB_operations_completed_witho;
  private static final SubLSymbol $sym4$GLF_SUGGEST_NEW_NODE_NAME;
  private static final SubLString $str5$GLFNode;
  private static final SubLSymbol $sym6$GLF_ADD_NODE;
  private static final SubLObject $const7$GLFNode;
  private static final SubLString $str8$Invalid_graph_specified_;
  private static final SubLString $str9$;
  private static final SubLObject $const10$isa;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLObject $const13$nodeInSystem;
  private static final SubLSymbol $sym14$GLF_DROP_NODE;
  private static final SubLSymbol $sym15$GLF_ADD_NODE_SEMANTICS;
  private static final SubLSymbol $sym16$GLF_DROP_NODE_SEMANTICS;
  private static final SubLSymbol $sym17$GLF_ADD_NODE_LABEL;
  private static final SubLObject $const18$glfComponentLabel;
  private static final SubLSymbol $sym19$GLF_DROP_NODE_LABEL;
  private static final SubLSymbol $sym20$GLF_SUGGEST_NEW_ARC_NAME;
  private static final SubLString $str21$GLFArc;
  private static final SubLSymbol $sym22$GLF_ADD_ARC;
  private static final SubLObject $const23$GLFArc;
  private static final SubLObject $const24$linkInSystem;
  private static final SubLSymbol $sym25$GLF_DROP_ARC;
  private static final SubLSymbol $sym26$GLF_CONNECT_ARC_UP;
  private static final SubLString $str27$Multiple_from_nodes_are_currently;
  private static final SubLObject $const28$linkFromToInSystem;
  private static final SubLSymbol $sym29$GLF_DISCONNECT_ARC;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$_FROM;
  private static final SubLSymbol $sym32$_TO;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$GLF_ADD_ARC_LABEL;
  private static final SubLSymbol $sym35$GLF_DROP_ARC_LABEL;
  private static final SubLSymbol $sym36$GLF_ADD_ARC_SEMANTICS;
  private static final SubLSymbol $sym37$GLF_DROP_ARC_SEMANTICS;
  private static final SubLString $str38$_A__D;
  private static final SubLList $list39;
  private static final SubLObject $const40$glfNodeSemantics_Underspecified;
  private static final SubLObject $const41$variableMappingTableForGLFArcInDi;
  private static final SubLObject $const42$AISForFn;
  private static final SubLSymbol $kw43$PROPERTY;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$SEMANTICS;

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 923L)
  public static SubLObject get_glf_graph_in_xml(SubLObject graph_id, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    SubLObject glf_graph = NIL;
    SubLObject xml_string = NIL;
    glf_graph = graphic_library_format.load_glf_graph_from_kb( graph_id, mt );
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        xml_utilities.generate_valid_xml_header( stream );
        xml_utilities.generate_xml_header_entry_for_dtd( $str1$glfGraph, $str2$http___www_opencyc_org_xml_glf_dt, stream );
        xml_utilities.xml_terpri();
        graphic_library_format.xml_serialize_glf_graph( glf_graph, stream );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      xml_string = streams_high.get_output_stream_string( stream );
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
    return xml_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 1843L)
  public static SubLObject glf_suggest_new_node_name(SubLObject prefix)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str5$GLFNode;
    }
    return glf_suggest_new_name_for_component( prefix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 2171L)
  public static SubLObject glf_add_node(final SubLObject node_name, SubLObject graph_id, SubLObject mt, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $const7$GLFNode;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    SubLObject node = NIL;
    if( NIL == cycl_utilities.fort_or_naut_p( ais ) )
    {
      return Values.values( NIL, $str8$Invalid_graph_specified_ );
    }
    final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding( thread );
    try
    {
      rkf_term_utilities.$rkf_name_prefix$.bind( $str9$, thread );
      node = rkf_term_utilities.rkf_create( node_name, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      rkf_term_utilities.$rkf_name_prefix$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject successP = glf_assert_assertion_specifications( ConsesLow.list( reader.bq_cons( ConsesLow.listS( $const10$isa, node, $list11 ), $list12 ), ConsesLow.list( ConsesLow.list( $const10$isa, node, type ),
        mt ), ConsesLow.list( ConsesLow.list( $const13$nodeInSystem, node, ais ), mt ) ) );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      return Values.values( NIL, reason );
    }
    return Values.values( node, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 3206L)
  public static SubLObject glf_drop_node(final SubLObject node, final SubLObject graph_id, final SubLObject mt)
  {
    rkf_term_utilities.rkf_kill( node );
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 3568L)
  public static SubLObject glf_add_node_semantics(SubLObject node, SubLObject graph_id, SubLObject semantics, SubLObject mt)
  {
    node = czer_main.coerce_to_fort( node );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    semantics = czer_main.coerce_to_fort( semantics );
    return glf_assert_node_semantics( node, semantics, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 4124L)
  public static SubLObject glf_drop_node_semantics(SubLObject node, SubLObject graph_id, SubLObject mt)
  {
    node = czer_main.coerce_to_fort( node );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    return glf_unassert_all_node_semantics( node, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 4570L)
  public static SubLObject glf_add_node_label(SubLObject node, SubLObject graph_id, final SubLObject label, SubLObject mt)
  {
    node = czer_main.coerce_to_fort( node );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    return glf_assert_component_property( node, ais, $const18$glfComponentLabel, label, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 5134L)
  public static SubLObject glf_drop_node_label(SubLObject node, SubLObject graph_id, SubLObject mt)
  {
    node = czer_main.coerce_to_fort( node );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    return glf_unassert_all_property_instances_for_component( node, ais, $const18$glfComponentLabel, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 5673L)
  public static SubLObject glf_suggest_new_arc_name(SubLObject prefix)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str21$GLFArc;
    }
    return glf_suggest_new_name_for_component( prefix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 5997L)
  public static SubLObject glf_add_arc(final SubLObject arc_name, SubLObject graph_id, SubLObject mt, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $const23$GLFArc;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    SubLObject arc = NIL;
    if( NIL == cycl_utilities.fort_or_naut_p( ais ) )
    {
      return Values.values( NIL, $str8$Invalid_graph_specified_ );
    }
    final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding( thread );
    try
    {
      rkf_term_utilities.$rkf_name_prefix$.bind( $str9$, thread );
      arc = rkf_term_utilities.rkf_create( arc_name, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      rkf_term_utilities.$rkf_name_prefix$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject successP = glf_assert_assertion_specifications( ConsesLow.list( reader.bq_cons( ConsesLow.listS( $const10$isa, arc, $list11 ), $list12 ), ConsesLow.list( ConsesLow.list( $const10$isa, arc, type ),
        mt ), ConsesLow.list( ConsesLow.list( $const24$linkInSystem, arc, ais ), mt ) ) );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      return Values.values( NIL, reason );
    }
    return Values.values( arc, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 7017L)
  public static SubLObject glf_drop_arc(final SubLObject arc, final SubLObject graph_id, final SubLObject mt)
  {
    rkf_term_utilities.rkf_kill( arc );
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 7374L)
  public static SubLObject glf_connect_arc_up(SubLObject arc, SubLObject graph_id, final SubLObject from_set, final SubLObject to_set, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    arc = czer_main.coerce_to_fort( arc );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    if( NIL == from_set || NIL == to_set )
    {
      return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
    }
    if( NIL == list_utilities.singletonP( from_set ) )
    {
      return Values.values( NIL, $str27$Multiple_from_nodes_are_currently );
    }
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    SubLObject cdolist_list_var = from_set;
    SubLObject from = NIL;
    from = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = to_set;
      SubLObject to = NIL;
      to = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        thread.resetMultipleValues();
        final SubLObject successP = glf_assert_assertion_specifications( ConsesLow.list( ConsesLow.list( ConsesLow.list( $const28$linkFromToInSystem, arc, from, to, ais ), mt ) ) );
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == successP )
        {
          return Values.values( NIL, reason );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        to = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      from = cdolist_list_var.first();
    }
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 8615L)
  public static SubLObject glf_disconnect_arc(SubLObject arc, SubLObject graph_id, SubLObject mt)
  {
    arc = czer_main.coerce_to_fort( arc );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    SubLObject cdolist_list_var;
    final SubLObject node_sets_linked = cdolist_list_var = ask_utilities.ask_template( $list30, ConsesLow.list( $const28$linkFromToInSystem, arc, $sym31$_FROM, $sym32$_TO, ais ), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    SubLObject node_set_linked = NIL;
    node_set_linked = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = node_set_linked;
      SubLObject from = NIL;
      SubLObject to = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      from = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      to = current.first();
      current = current.rest();
      if( NIL == current )
      {
        rkf_assertion_utilities.rkf_unassert( ConsesLow.list( $const28$linkFromToInSystem, arc, from, to, ais ), mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      node_set_linked = cdolist_list_var.first();
    }
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 9450L)
  public static SubLObject glf_add_arc_label(SubLObject arc, SubLObject graph_id, final SubLObject label, SubLObject mt)
  {
    arc = czer_main.coerce_to_fort( arc );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    return glf_assert_component_property( arc, ais, $const18$glfComponentLabel, label, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 10015L)
  public static SubLObject glf_drop_arc_label(SubLObject arc, SubLObject graph_id, SubLObject mt)
  {
    arc = czer_main.coerce_to_fort( arc );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    return glf_unassert_all_property_instances_for_component( arc, ais, $const18$glfComponentLabel, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 10555L)
  public static SubLObject glf_add_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject semantics, SubLObject mt)
  {
    arc = czer_main.coerce_to_fort( arc );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    semantics = czer_main.coerce_to_fort( semantics );
    return glf_assert_arc_semantics( arc, semantics, graph_id, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 11108L)
  public static SubLObject glf_drop_arc_semantics(SubLObject arc, SubLObject graph_id, SubLObject mt)
  {
    arc = czer_main.coerce_to_fort( arc );
    graph_id = czer_main.coerce_to_fort( graph_id );
    mt = hlmt_czer.coerce_to_hlmt( mt );
    return glf_unassert_all_arc_semantics( arc, graph_id, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 11553L)
  public static SubLObject generic_suggest_new_name_for_component(final SubLObject prefix)
  {
    SubLObject term_name;
    for( term_name = NIL; NIL == term_name; term_name = NIL )
    {
      term_name = PrintLow.format( NIL, $str38$_A__D, prefix, random.random( Numbers.$most_positive_fixnum$.getGlobalValue() ) );
      if( NIL == constant_completion_high.constant_name_available( term_name ) )
      {
      }
    }
    return term_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 11885L)
  public static SubLObject generic_assert_assertion_specifications(final SubLObject assertion_specs, final SubLObject success)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = assertion_specs;
    SubLObject assertion_spec = NIL;
    assertion_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = assertion_spec;
      SubLObject sentence = NIL;
      SubLObject elmt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      sentence = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      elmt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assertion_utilities.rkf_assert_now( sentence, elmt );
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == successP )
        {
          return Values.values( NIL, reason );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion_spec = cdolist_list_var.first();
    }
    return Values.values( T, success );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12252L)
  public static SubLObject glf_suggest_new_name_for_component(final SubLObject prefix)
  {
    return generic_suggest_new_name_for_component( prefix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12371L)
  public static SubLObject glf_assert_assertion_specifications(final SubLObject assertion_specs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject successP = generic_assert_assertion_specifications( assertion_specs, $glf_success_for_kb_operations$.getGlobalValue() );
    final SubLObject message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( successP, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12620L)
  public static SubLObject glf_assert_component_property(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject property, final SubLObject mt)
  {
    return glf_assert_assertion_specifications( ConsesLow.list( ConsesLow.list( ConsesLow.list( prop_predicate, component, property, graph_ref ), mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12823L)
  public static SubLObject glf_assert_node_semantics(final SubLObject node, final SubLObject semantics, final SubLObject mt)
  {
    return glf_assert_assertion_specifications( ConsesLow.list( ConsesLow.list( ConsesLow.list( $const40$glfNodeSemantics_Underspecified, node, semantics ), mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 12996L)
  public static SubLObject glf_assert_arc_semantics(final SubLObject arc, final SubLObject semantics, final SubLObject graph_id, final SubLObject mt)
  {
    return glf_assert_assertion_specifications( ConsesLow.list( ConsesLow.list( ConsesLow.list( $const41$variableMappingTableForGLFArcInDi, semantics, arc, ConsesLow.list( $const42$AISForFn, graph_id ) ), mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 13205L)
  public static SubLObject glf_unassert_all_node_semantics(final SubLObject node, final SubLObject mt)
  {
    final SubLObject prop_predicate = $const40$glfNodeSemantics_Underspecified;
    SubLObject cdolist_list_var;
    final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable( $kw43$PROPERTY, ConsesLow.listS( prop_predicate, node, $list44 ), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject property_value = NIL;
    property_value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_assertion_utilities.rkf_unassert( ConsesLow.list( prop_predicate, node, property_value ), mt );
      cdolist_list_var = cdolist_list_var.rest();
      property_value = cdolist_list_var.first();
    }
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 13620L)
  public static SubLObject glf_unassert_all_arc_semantics(final SubLObject arc, final SubLObject graph_id, final SubLObject mt)
  {
    final SubLObject prop_predicate = $const41$variableMappingTableForGLFArcInDi;
    SubLObject cdolist_list_var;
    final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable( $kw45$SEMANTICS, ConsesLow.list( prop_predicate, $kw45$SEMANTICS, arc, ConsesLow.list( $const42$AISForFn, graph_id ) ), mt,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject property_value = NIL;
    property_value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_assertion_utilities.rkf_unassert( ConsesLow.list( prop_predicate, property_value, arc, ConsesLow.list( $const42$AISForFn, graph_id ) ), mt );
      cdolist_list_var = cdolist_list_var.rest();
      property_value = cdolist_list_var.first();
    }
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/glf-api-widgets.lisp", position = 14059L)
  public static SubLObject glf_unassert_all_property_instances_for_component(final SubLObject component, final SubLObject graph_ref, final SubLObject prop_predicate, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject property_values = cdolist_list_var = ask_utilities.ask_variable( $kw43$PROPERTY, ConsesLow.list( prop_predicate, component, $kw43$PROPERTY, graph_ref ), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    SubLObject property_value = NIL;
    property_value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_assertion_utilities.rkf_unassert( ConsesLow.list( prop_predicate, component, property_value, graph_ref ), mt );
      cdolist_list_var = cdolist_list_var.rest();
      property_value = cdolist_list_var.first();
    }
    return Values.values( T, $glf_success_for_kb_operations$.getGlobalValue() );
  }

  public static SubLObject declare_glf_api_widgets_file()
  {
    SubLFiles.declareFunction( me, "get_glf_graph_in_xml", "GET-GLF-GRAPH-IN-XML", 2, 0, false );
    SubLFiles.declareFunction( me, "glf_suggest_new_node_name", "GLF-SUGGEST-NEW-NODE-NAME", 0, 1, false );
    SubLFiles.declareFunction( me, "glf_add_node", "GLF-ADD-NODE", 3, 1, false );
    SubLFiles.declareFunction( me, "glf_drop_node", "GLF-DROP-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_add_node_semantics", "GLF-ADD-NODE-SEMANTICS", 4, 0, false );
    SubLFiles.declareFunction( me, "glf_drop_node_semantics", "GLF-DROP-NODE-SEMANTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_add_node_label", "GLF-ADD-NODE-LABEL", 4, 0, false );
    SubLFiles.declareFunction( me, "glf_drop_node_label", "GLF-DROP-NODE-LABEL", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_suggest_new_arc_name", "GLF-SUGGEST-NEW-ARC-NAME", 0, 1, false );
    SubLFiles.declareFunction( me, "glf_add_arc", "GLF-ADD-ARC", 3, 1, false );
    SubLFiles.declareFunction( me, "glf_drop_arc", "GLF-DROP-ARC", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_connect_arc_up", "GLF-CONNECT-ARC-UP", 5, 0, false );
    SubLFiles.declareFunction( me, "glf_disconnect_arc", "GLF-DISCONNECT-ARC", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_add_arc_label", "GLF-ADD-ARC-LABEL", 4, 0, false );
    SubLFiles.declareFunction( me, "glf_drop_arc_label", "GLF-DROP-ARC-LABEL", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_add_arc_semantics", "GLF-ADD-ARC-SEMANTICS", 4, 0, false );
    SubLFiles.declareFunction( me, "glf_drop_arc_semantics", "GLF-DROP-ARC-SEMANTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "generic_suggest_new_name_for_component", "GENERIC-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_assert_assertion_specifications", "GENERIC-ASSERT-ASSERTION-SPECIFICATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "glf_suggest_new_name_for_component", "GLF-SUGGEST-NEW-NAME-FOR-COMPONENT", 1, 0, false );
    SubLFiles.declareFunction( me, "glf_assert_assertion_specifications", "GLF-ASSERT-ASSERTION-SPECIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "glf_assert_component_property", "GLF-ASSERT-COMPONENT-PROPERTY", 5, 0, false );
    SubLFiles.declareFunction( me, "glf_assert_node_semantics", "GLF-ASSERT-NODE-SEMANTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_assert_arc_semantics", "GLF-ASSERT-ARC-SEMANTICS", 4, 0, false );
    SubLFiles.declareFunction( me, "glf_unassert_all_node_semantics", "GLF-UNASSERT-ALL-NODE-SEMANTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "glf_unassert_all_arc_semantics", "GLF-UNASSERT-ALL-ARC-SEMANTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "glf_unassert_all_property_instances_for_component", "GLF-UNASSERT-ALL-PROPERTY-INSTANCES-FOR-COMPONENT", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_glf_api_widgets_file()
  {
    $glf_success_for_kb_operations$ = SubLFiles.deflexical( "*GLF-SUCCESS-FOR-KB-OPERATIONS*", $str3$All_KB_operations_completed_witho );
    return NIL;
  }

  public static SubLObject setup_glf_api_widgets_file()
  {
    access_macros.register_external_symbol( $sym0$GET_GLF_GRAPH_IN_XML );
    access_macros.register_external_symbol( $sym4$GLF_SUGGEST_NEW_NODE_NAME );
    access_macros.register_external_symbol( $sym6$GLF_ADD_NODE );
    access_macros.register_external_symbol( $sym14$GLF_DROP_NODE );
    access_macros.register_external_symbol( $sym15$GLF_ADD_NODE_SEMANTICS );
    access_macros.register_external_symbol( $sym16$GLF_DROP_NODE_SEMANTICS );
    access_macros.register_external_symbol( $sym17$GLF_ADD_NODE_LABEL );
    access_macros.register_external_symbol( $sym19$GLF_DROP_NODE_LABEL );
    access_macros.register_external_symbol( $sym20$GLF_SUGGEST_NEW_ARC_NAME );
    access_macros.register_external_symbol( $sym22$GLF_ADD_ARC );
    access_macros.register_external_symbol( $sym25$GLF_DROP_ARC );
    access_macros.register_external_symbol( $sym26$GLF_CONNECT_ARC_UP );
    access_macros.register_external_symbol( $sym29$GLF_DISCONNECT_ARC );
    access_macros.register_external_symbol( $sym34$GLF_ADD_ARC_LABEL );
    access_macros.register_external_symbol( $sym35$GLF_DROP_ARC_LABEL );
    access_macros.register_external_symbol( $sym36$GLF_ADD_ARC_SEMANTICS );
    access_macros.register_external_symbol( $sym37$GLF_DROP_ARC_SEMANTICS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_glf_api_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_glf_api_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_glf_api_widgets_file();
  }
  static
  {
    me = new glf_api_widgets();
    $glf_success_for_kb_operations$ = null;
    $sym0$GET_GLF_GRAPH_IN_XML = makeSymbol( "GET-GLF-GRAPH-IN-XML" );
    $str1$glfGraph = makeString( "glfGraph" );
    $str2$http___www_opencyc_org_xml_glf_dt = makeString( "http://www.opencyc.org/xml/glf.dtd" );
    $str3$All_KB_operations_completed_witho = makeString( "All KB operations completed without error." );
    $sym4$GLF_SUGGEST_NEW_NODE_NAME = makeSymbol( "GLF-SUGGEST-NEW-NODE-NAME" );
    $str5$GLFNode = makeString( "GLFNode" );
    $sym6$GLF_ADD_NODE = makeSymbol( "GLF-ADD-NODE" );
    $const7$GLFNode = constant_handles.reader_make_constant_shell( makeString( "GLFNode" ) );
    $str8$Invalid_graph_specified_ = makeString( "Invalid graph specified." );
    $str9$ = makeString( "" );
    $const10$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) );
    $list12 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ) );
    $const13$nodeInSystem = constant_handles.reader_make_constant_shell( makeString( "nodeInSystem" ) );
    $sym14$GLF_DROP_NODE = makeSymbol( "GLF-DROP-NODE" );
    $sym15$GLF_ADD_NODE_SEMANTICS = makeSymbol( "GLF-ADD-NODE-SEMANTICS" );
    $sym16$GLF_DROP_NODE_SEMANTICS = makeSymbol( "GLF-DROP-NODE-SEMANTICS" );
    $sym17$GLF_ADD_NODE_LABEL = makeSymbol( "GLF-ADD-NODE-LABEL" );
    $const18$glfComponentLabel = constant_handles.reader_make_constant_shell( makeString( "glfComponentLabel" ) );
    $sym19$GLF_DROP_NODE_LABEL = makeSymbol( "GLF-DROP-NODE-LABEL" );
    $sym20$GLF_SUGGEST_NEW_ARC_NAME = makeSymbol( "GLF-SUGGEST-NEW-ARC-NAME" );
    $str21$GLFArc = makeString( "GLFArc" );
    $sym22$GLF_ADD_ARC = makeSymbol( "GLF-ADD-ARC" );
    $const23$GLFArc = constant_handles.reader_make_constant_shell( makeString( "GLFArc" ) );
    $const24$linkInSystem = constant_handles.reader_make_constant_shell( makeString( "linkInSystem" ) );
    $sym25$GLF_DROP_ARC = makeSymbol( "GLF-DROP-ARC" );
    $sym26$GLF_CONNECT_ARC_UP = makeSymbol( "GLF-CONNECT-ARC-UP" );
    $str27$Multiple_from_nodes_are_currently = makeString( "Multiple from-nodes are currently not supported." );
    $const28$linkFromToInSystem = constant_handles.reader_make_constant_shell( makeString( "linkFromToInSystem" ) );
    $sym29$GLF_DISCONNECT_ARC = makeSymbol( "GLF-DISCONNECT-ARC" );
    $list30 = ConsesLow.list( makeSymbol( "?FROM" ), makeSymbol( "?TO" ) );
    $sym31$_FROM = makeSymbol( "?FROM" );
    $sym32$_TO = makeSymbol( "?TO" );
    $list33 = ConsesLow.list( makeSymbol( "FROM" ), makeSymbol( "TO" ) );
    $sym34$GLF_ADD_ARC_LABEL = makeSymbol( "GLF-ADD-ARC-LABEL" );
    $sym35$GLF_DROP_ARC_LABEL = makeSymbol( "GLF-DROP-ARC-LABEL" );
    $sym36$GLF_ADD_ARC_SEMANTICS = makeSymbol( "GLF-ADD-ARC-SEMANTICS" );
    $sym37$GLF_DROP_ARC_SEMANTICS = makeSymbol( "GLF-DROP-ARC-SEMANTICS" );
    $str38$_A__D = makeString( "~A-~D" );
    $list39 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "ELMT" ) );
    $const40$glfNodeSemantics_Underspecified = constant_handles.reader_make_constant_shell( makeString( "glfNodeSemantics-Underspecified" ) );
    $const41$variableMappingTableForGLFArcInDi = constant_handles.reader_make_constant_shell( makeString( "variableMappingTableForGLFArcInDiagram" ) );
    $const42$AISForFn = constant_handles.reader_make_constant_shell( makeString( "AISForFn" ) );
    $kw43$PROPERTY = makeKeyword( "PROPERTY" );
    $list44 = ConsesLow.list( makeKeyword( "PROPERTY" ) );
    $kw45$SEMANTICS = makeKeyword( "SEMANTICS" );
  }
}
/*
 * 
 * Total time: 131 ms
 * 
 */