package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.term;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.dictionary_contents;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graph
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.graph";
  public static final String myFingerPrint = "18095250d0f9b0e28d79bf844eb9fda36ae5ce517cab88c63dc5f44e0e5487a1";
  private static final SubLSymbol $sym0$GRAPH_NODE;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$LABEL;
  private static final SubLSymbol $sym4$ID;
  private static final SubLSymbol $sym5$CORE;
  private static final SubLSymbol $sym6$INSTANCE_COUNT;
  private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS;
  private static final SubLSymbol $sym8$ISOLATED_P;
  private static final SubLSymbol $sym9$INSTANCE_NUMBER;
  private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE;
  private static final SubLSymbol $sym11$INITIALIZE;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$GRAPH_NODE_INITIALIZE_METHOD;
  private static final SubLSymbol $sym15$SET_ID;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLSymbol $sym19$INTEGERP;
  private static final SubLSymbol $sym20$GRAPH_NODE_SET_ID_METHOD;
  private static final SubLSymbol $sym21$SET_CORE;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLSymbol $sym25$CORE_NODE_MAP;
  private static final SubLSymbol $sym26$GRAPH_NODE_SET_CORE_METHOD;
  private static final SubLSymbol $sym27$SET_LABEL;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLSymbol $sym31$STRINGP;
  private static final SubLSymbol $sym32$GRAPH_NODE_SET_LABEL_METHOD;
  private static final SubLSymbol $sym33$GET_LABEL;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLString $str36$;
  private static final SubLSymbol $sym37$GRAPH_NODE_GET_LABEL_METHOD;
  private static final SubLSymbol $sym38$GET_CORE;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLSymbol $sym41$GRAPH_NODE_GET_CORE_METHOD;
  private static final SubLSymbol $sym42$GET_ID;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLSymbol $sym45$GRAPH_NODE_GET_ID_METHOD;
  private static final SubLSymbol $sym46$PRINT;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD;
  private static final SubLString $str50$__;
  private static final SubLString $str51$_;
  private static final SubLString $str52$_D;
  private static final SubLString $str53$__;
  private static final SubLString $str54$_;
  private static final SubLSymbol $sym55$GRAPH_NODE_PRINT_METHOD;
  private static final SubLSymbol $sym56$GRAPH_EDGE;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$TO;
  private static final SubLSymbol $sym59$FROM;
  private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS;
  private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE;
  private static final SubLSymbol $sym62$MAKE_EDGE;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$GRAPH_NODE_P;
  private static final SubLSymbol $sym67$SET_FROM;
  private static final SubLSymbol $sym68$SET_TO;
  private static final SubLSymbol $sym69$GRAPH_EDGE_MAKE_EDGE_METHOD;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$GRAPH_EDGE_INITIALIZE_METHOD;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym74$GRAPH_EDGE_SET_FROM_METHOD;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym77$GRAPH_EDGE_SET_TO_METHOD;
  private static final SubLSymbol $sym78$GET_FROM;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym81$GRAPH_EDGE_GET_FROM_METHOD;
  private static final SubLSymbol $sym82$GET_TO;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym85$GRAPH_EDGE_GET_TO_METHOD;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym88$GRAPH_EDGE_SET_LABEL_METHOD;
  private static final SubLSymbol $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym90$GRAPH_EDGE_GET_LABEL_METHOD;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD;
  private static final SubLString $str93$__;
  private static final SubLString $str94$_A;
  private static final SubLString $str95$__;
  private static final SubLSymbol $sym96$GRAPH_EDGE_PRINT_METHOD;
  private static final SubLSymbol $sym97$GRAPH;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$EDGES_TARGET;
  private static final SubLSymbol $sym100$EDGES_SOURCE;
  private static final SubLSymbol $sym101$LABEL_EDGE_MAP;
  private static final SubLSymbol $sym102$NODES;
  private static final SubLSymbol $sym103$LABEL_NODE_MAP;
  private static final SubLSymbol $sym104$INTEGER_SEQUENCE_GENERATOR;
  private static final SubLSymbol $sym105$NAME;
  private static final SubLSymbol $sym106$SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS;
  private static final SubLSymbol $sym107$SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym110$GRAPH_INITIALIZE_METHOD;
  private static final SubLSymbol $sym111$ACCEPT_NODE;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$GRAPH_ACCEPT_NODE_METHOD;
  private static final SubLSymbol $sym115$ACCEPT_EDGE;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$GRAPH_ACCEPT_EDGE_METHOD;
  private static final SubLSymbol $sym119$ADD_NODE;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLString $str122$__Cannot_add_node__S;
  private static final SubLSymbol $sym123$GRAPH_ADD_NODE_METHOD;
  private static final SubLSymbol $sym124$GET_NODE_BY_ID;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym128$GRAPH_GET_NODE_BY_ID_METHOD;
  private static final SubLSymbol $sym129$GET_NODE_BY_LABEL;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym132$GRAPH_GET_NODE_BY_LABEL_METHOD;
  private static final SubLSymbol $sym133$GET_NODE_BY_CORE;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym137$GRAPH_GET_NODE_BY_CORE_METHOD;
  private static final SubLSymbol $sym138$ADD_EDGE;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLString $str141$__Cannot_add_edge__S;
  private static final SubLSymbol $sym142$GRAPH_ADD_EDGE_METHOD;
  private static final SubLSymbol $sym143$REMOVE_EDGE;
  private static final SubLList $list144;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym147$GRAPH_EDGE_P;
  private static final SubLSymbol $sym148$GRAPH_REMOVE_EDGE_METHOD;
  private static final SubLSymbol $sym149$GET_EDGES_FROM;
  private static final SubLList $list150;
  private static final SubLSymbol $sym151$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym152$GRAPH_GET_EDGES_FROM_METHOD;
  private static final SubLSymbol $sym153$GET_EDGES_TO;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym156$GRAPH_GET_EDGES_TO_METHOD;
  private static final SubLSymbol $sym157$GET_EDGES_FROM_NODE;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym161$GRAPH_GET_EDGES_FROM_NODE_METHOD;
  private static final SubLSymbol $sym162$GET_EDGES_TO_NODE;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym165$GRAPH_GET_EDGES_TO_NODE_METHOD;
  private static final SubLSymbol $sym166$GET_NODES_FROM_NODE;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym169$GRAPH_GET_NODES_FROM_NODE_METHOD;
  private static final SubLSymbol $sym170$GET_NODES_TO_NODE;
  private static final SubLList $list171;
  private static final SubLSymbol $sym172$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym173$GRAPH_GET_NODES_TO_NODE_METHOD;
  private static final SubLSymbol $sym174$GET_PATH_LABELS;
  private static final SubLList $list175;
  private static final SubLList $list176;
  private static final SubLSymbol $sym177$LISTP;
  private static final SubLSymbol $sym178$COLLECT_ALL_ASCENDING;
  private static final SubLSymbol $sym179$GRAPH_GET_PATH_LABELS_METHOD;
  private static final SubLSymbol $sym180$COLLECT_ASCENDING;
  private static final SubLList $list181;
  private static final SubLSymbol $sym182$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym183$GRAPH_COLLECT_ASCENDING_METHOD;
  private static final SubLList $list184;
  private static final SubLList $list185;
  private static final SubLSymbol $sym186$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLSymbol $sym187$GRAPH_COLLECT_ALL_ASCENDING_METHOD;
  private static final SubLList $list188;
  private static final SubLSymbol $sym189$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLString $str190$_nodes;
  private static final SubLSymbol $sym191$GRAPH_PRINT_METHOD;
  private static final SubLSymbol $sym192$PPRINT;
  private static final SubLList $list193;
  private static final SubLList $list194;
  private static final SubLSymbol $sym195$OUTER_CATCH_FOR_GRAPH_METHOD;
  private static final SubLString $str196$___;
  private static final SubLString $str197$_;
  private static final SubLSymbol $sym198$GRAPH_PPRINT_METHOD;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$GRAPH_VAR;
  private static final SubLSymbol $sym201$CLET;
  private static final SubLSymbol $sym202$DO_DICTIONARY;
  private static final SubLSymbol $sym203$KEY;
  private static final SubLSymbol $sym204$GET_SLOT;
  private static final SubLList $list205;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$CYC_GRAPH_NODE;
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS;
  private static final SubLSymbol $sym210$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE;
  private static final SubLSymbol $sym211$MAKE_NODE;
  private static final SubLList $list212;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$GENERATE_PHRASE;
  private static final SubLSymbol $sym215$CYC_GRAPH_NODE_MAKE_NODE_METHOD;
  private static final SubLList $list216;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$CLOSED_TERM_;
  private static final SubLSymbol $sym219$CYC_GRAPH_NODE_SET_CORE_METHOD;
  private static final SubLList $list220;
  private static final SubLSymbol $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD;
  private static final SubLSymbol $sym222$CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD;
  private static final SubLSymbol $sym223$CYC_GRAPH_EDGE;
  private static final SubLList $list224;
  private static final SubLSymbol $sym225$PREDICATE;
  private static final SubLSymbol $sym226$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS;
  private static final SubLSymbol $sym227$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE;
  private static final SubLList $list228;
  private static final SubLList $list229;
  private static final SubLObject $const230$genls;
  private static final SubLSymbol $sym231$CYC_GRAPH_NODE_P;
  private static final SubLSymbol $sym232$PREDICATE_;
  private static final SubLSymbol $sym233$SET_PREDICATE;
  private static final SubLSymbol $sym234$CYC_GRAPH_EDGE_MAKE_EDGE_METHOD;
  private static final SubLList $list235;
  private static final SubLList $list236;
  private static final SubLSymbol $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD;
  private static final SubLSymbol $sym238$CYC_GRAPH_EDGE_SET_PREDICATE_METHOD;
  private static final SubLSymbol $sym239$CYC_GRAPH;
  private static final SubLList $list240;
  private static final SubLSymbol $sym241$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS;
  private static final SubLSymbol $sym242$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE;
  private static final SubLObject $const243$isa;
  private static final SubLList $list244;
  private static final SubLSymbol $sym245$CYC_GRAPH_ACCEPT_NODE_METHOD;
  private static final SubLList $list246;
  private static final SubLSymbol $sym247$CYC_GRAPH_ACCEPT_EDGE_METHOD;
  private static final SubLSymbol $sym248$INTERPOLATE_NODE;
  private static final SubLList $list249;
  private static final SubLList $list250;
  private static final SubLSymbol $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD;
  private static final SubLObject $const252$EverythingPSC;
  private static final SubLSymbol $sym253$CYC_GRAPH_INTERPOLATE_NODE_METHOD;
  private static final SubLSymbol $sym254$INTERPOLATE_CYC_TERM;
  private static final SubLList $list255;
  private static final SubLList $list256;
  private static final SubLSymbol $sym257$CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject get_graph_node_label(final SubLObject graph_node)
  {
    return classes.subloop_get_access_protected_instance_slot( graph_node, THREE_INTEGER, $sym3$LABEL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject set_graph_node_label(final SubLObject graph_node, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( graph_node, value, THREE_INTEGER, $sym3$LABEL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject get_graph_node_id(final SubLObject graph_node)
  {
    return classes.subloop_get_access_protected_instance_slot( graph_node, TWO_INTEGER, $sym4$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject set_graph_node_id(final SubLObject graph_node, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( graph_node, value, TWO_INTEGER, $sym4$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject get_graph_node_core(final SubLObject graph_node)
  {
    return classes.subloop_get_access_protected_instance_slot( graph_node, ONE_INTEGER, $sym5$CORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject set_graph_node_core(final SubLObject graph_node, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( graph_node, value, ONE_INTEGER, $sym5$CORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject subloop_reserved_initialize_graph_node_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject subloop_reserved_initialize_graph_node_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$GRAPH_NODE, $sym5$CORE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$GRAPH_NODE, $sym4$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$GRAPH_NODE, $sym3$LABEL, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1977L)
  public static SubLObject graph_node_p(final SubLObject graph_node)
  {
    return classes.subloop_instanceof_class( graph_node, $sym0$GRAPH_NODE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2572L)
  public static SubLObject graph_node_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2696L)
  public static SubLObject graph_node_set_id_method(final SubLObject self, final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    SubLObject id = get_graph_node_id( self );
    try
    {
      thread.throwStack.push( $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        assert NIL != Types.integerp( num ) : num;
        id = num;
        Dynamic.sublisp_throw( $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_id( self, id );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2899L)
  public static SubLObject graph_node_set_core_method(final SubLObject self, final SubLObject v_object, SubLObject v_graph)
  {
    if( v_graph == UNPROVIDED )
    {
      v_graph = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    SubLObject v_core = get_graph_node_core( self );
    try
    {
      thread.throwStack.push( $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        v_core = v_object;
        if( NIL != graph_p( v_graph ) )
        {
          dictionary.dictionary_enter( instances.get_slot( v_graph, $sym25$CORE_NODE_MAP ), v_core, self );
        }
        Dynamic.sublisp_throw( $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_core( self, v_core );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3202L)
  public static SubLObject graph_node_set_label_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    SubLObject label = get_graph_node_label( self );
    try
    {
      thread.throwStack.push( $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        label = string;
        Dynamic.sublisp_throw( $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_label( self, label );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3427L)
  public static SubLObject graph_node_get_label_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    final SubLObject label = get_graph_node_label( self );
    try
    {
      thread.throwStack.push( $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        if( NIL != label )
        {
          Dynamic.sublisp_throw( $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, label );
        }
        else
        {
          Dynamic.sublisp_throw( $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, $str36$ );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_label( self, label );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3621L)
  public static SubLObject graph_node_get_core_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    final SubLObject v_core = get_graph_node_core( self );
    try
    {
      thread.throwStack.push( $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, v_core );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_core( self, v_core );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3778L)
  public static SubLObject graph_node_get_id_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    final SubLObject id = get_graph_node_id( self );
    try
    {
      thread.throwStack.push( $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, id );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_id( self, id );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3929L)
  public static SubLObject graph_node_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_node_method = NIL;
    final SubLObject label = get_graph_node_label( self );
    final SubLObject id = get_graph_node_id( self );
    try
    {
      thread.throwStack.push( $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
      try
      {
        streams_high.write_string( $str50$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( subloop_structures.class_name( subloop_structures.instance_class( self ) ), stream );
        if( id.isNumber() )
        {
          streams_high.write_string( Sequences.cconcatenate( $str51$_, PrintLow.format( NIL, $str52$_D, id ) ), stream, UNPROVIDED, UNPROVIDED );
        }
        streams_high.write_string( $str53$__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( label, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str54$_, stream, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_label( self, label );
          set_graph_node_id( self, id );
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
      catch_var_for_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject get_graph_edge_label(final SubLObject graph_edge)
  {
    return classes.subloop_get_access_protected_instance_slot( graph_edge, THREE_INTEGER, $sym3$LABEL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject set_graph_edge_label(final SubLObject graph_edge, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( graph_edge, value, THREE_INTEGER, $sym3$LABEL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject get_graph_edge_to(final SubLObject graph_edge)
  {
    return classes.subloop_get_access_protected_instance_slot( graph_edge, TWO_INTEGER, $sym58$TO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject set_graph_edge_to(final SubLObject graph_edge, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( graph_edge, value, TWO_INTEGER, $sym58$TO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject get_graph_edge_from(final SubLObject graph_edge)
  {
    return classes.subloop_get_access_protected_instance_slot( graph_edge, ONE_INTEGER, $sym59$FROM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject set_graph_edge_from(final SubLObject graph_edge, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( graph_edge, value, ONE_INTEGER, $sym59$FROM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject subloop_reserved_initialize_graph_edge_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject subloop_reserved_initialize_graph_edge_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym56$GRAPH_EDGE, $sym59$FROM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym56$GRAPH_EDGE, $sym58$TO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym56$GRAPH_EDGE, $sym3$LABEL, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4325L)
  public static SubLObject graph_edge_p(final SubLObject graph_edge)
  {
    return classes.subloop_instanceof_class( graph_edge, $sym56$GRAPH_EDGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4906L)
  public static SubLObject graph_edge_make_edge_method(final SubLObject self, final SubLObject from_node, final SubLObject to_node)
  {
    assert NIL != graph_node_p( to_node ) : to_node;
    assert NIL != graph_node_p( from_node ) : from_node;
    final SubLObject fid = instances.get_slot( from_node, $sym4$ID );
    final SubLObject tid = instances.get_slot( to_node, $sym4$ID );
    final SubLObject new_edge = object.new_class_instance( self );
    if( fid.isNumber() && tid.isNumber() )
    {
      methods.funcall_instance_method_with_1_args( new_edge, $sym67$SET_FROM, fid );
      methods.funcall_instance_method_with_1_args( new_edge, $sym68$SET_TO, tid );
      return new_edge;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5502L)
  public static SubLObject graph_edge_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5633L)
  public static SubLObject graph_edge_set_from_method(final SubLObject self, final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    SubLObject from = get_graph_edge_from( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        assert NIL != Types.integerp( num ) : num;
        from = num;
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_from( self, from );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5849L)
  public static SubLObject graph_edge_set_to_method(final SubLObject self, final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    SubLObject to = get_graph_edge_to( self );
    try
    {
      thread.throwStack.push( $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        assert NIL != Types.integerp( num ) : num;
        to = num;
        Dynamic.sublisp_throw( $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_to( self, to );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6059L)
  public static SubLObject graph_edge_get_from_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    final SubLObject from = get_graph_edge_from( self );
    try
    {
      thread.throwStack.push( $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, from );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_from( self, from );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6198L)
  public static SubLObject graph_edge_get_to_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    final SubLObject to = get_graph_edge_to( self );
    try
    {
      thread.throwStack.push( $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, to );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_to( self, to );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6331L)
  public static SubLObject graph_edge_set_label_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    SubLObject label = get_graph_edge_label( self );
    try
    {
      thread.throwStack.push( $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        label = string;
        Dynamic.sublisp_throw( $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_label( self, label );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6561L)
  public static SubLObject graph_edge_get_label_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    final SubLObject label = get_graph_edge_label( self );
    try
    {
      thread.throwStack.push( $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        if( NIL != label )
        {
          Dynamic.sublisp_throw( $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, label );
        }
        else
        {
          Dynamic.sublisp_throw( $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, $str36$ );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_label( self, label );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6755L)
  public static SubLObject graph_edge_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_edge_method = NIL;
    final SubLObject label = get_graph_edge_label( self );
    final SubLObject to = get_graph_edge_to( self );
    final SubLObject from = get_graph_edge_from( self );
    try
    {
      thread.throwStack.push( $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
      try
      {
        streams_high.write_string( $str50$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( subloop_structures.class_name( subloop_structures.instance_class( self ) ), stream );
        streams_high.write_string( $str53$__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( Sequences.cconcatenate( print_high.prin1_to_string( from ), $str93$__ ), stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( PrintLow.format( NIL, $str94$_A, label ), stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( Sequences.cconcatenate( $str95$__, print_high.prin1_to_string( to ) ), stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str54$_, stream, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edge_label( self, label );
          set_graph_edge_to( self, to );
          set_graph_edge_from( self, from );
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
      catch_var_for_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_core_node_map(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, EIGHT_INTEGER, $sym25$CORE_NODE_MAP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_core_node_map(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, EIGHT_INTEGER, $sym25$CORE_NODE_MAP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_edges_target(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, SEVEN_INTEGER, $sym99$EDGES_TARGET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_edges_target(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, SEVEN_INTEGER, $sym99$EDGES_TARGET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_edges_source(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, SIX_INTEGER, $sym100$EDGES_SOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_edges_source(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, SIX_INTEGER, $sym100$EDGES_SOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_label_edge_map(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, FIVE_INTEGER, $sym101$LABEL_EDGE_MAP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_label_edge_map(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, FIVE_INTEGER, $sym101$LABEL_EDGE_MAP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_nodes(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, FOUR_INTEGER, $sym102$NODES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_nodes(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, FOUR_INTEGER, $sym102$NODES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_label_node_map(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, THREE_INTEGER, $sym103$LABEL_NODE_MAP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_label_node_map(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, THREE_INTEGER, $sym103$LABEL_NODE_MAP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_integer_sequence_generator(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, TWO_INTEGER, $sym104$INTEGER_SEQUENCE_GENERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_integer_sequence_generator(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, TWO_INTEGER, $sym104$INTEGER_SEQUENCE_GENERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject get_graph_name(final SubLObject v_graph)
  {
    return classes.subloop_get_access_protected_instance_slot( v_graph, ONE_INTEGER, $sym105$NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject set_graph_name(final SubLObject v_graph, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_graph, value, ONE_INTEGER, $sym105$NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject subloop_reserved_initialize_graph_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject subloop_reserved_initialize_graph_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym105$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym104$INTEGER_SEQUENCE_GENERATOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym103$LABEL_NODE_MAP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym102$NODES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym101$LABEL_EDGE_MAP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym100$EDGES_SOURCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym99$EDGES_TARGET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym25$CORE_NODE_MAP, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7268L)
  public static SubLObject graph_p(final SubLObject v_graph)
  {
    return classes.subloop_instanceof_class( v_graph, $sym97$GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8400L)
  public static SubLObject new_graph(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    final SubLObject v_graph = object.new_class_instance( $sym97$GRAPH );
    instances.set_slot( v_graph, $sym105$NAME, name );
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8559L)
  public static SubLObject graph_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    SubLObject core_node_map = get_graph_core_node_map( self );
    SubLObject edges_target = get_graph_edges_target( self );
    SubLObject edges_source = get_graph_edges_source( self );
    SubLObject label_edge_map = get_graph_label_edge_map( self );
    SubLObject nodes = get_graph_nodes( self );
    SubLObject label_node_map = get_graph_label_node_map( self );
    SubLObject v_integer_sequence_generator = get_graph_integer_sequence_generator( self );
    try
    {
      thread.throwStack.push( $sym109$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        object.object_initialize_method( self );
        v_integer_sequence_generator = integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED );
        nodes = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
        edges_source = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
        edges_target = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
        label_node_map = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
        label_edge_map = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
        core_node_map = dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED );
        Dynamic.sublisp_throw( $sym109$OUTER_CATCH_FOR_GRAPH_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_core_node_map( self, core_node_map );
          set_graph_edges_target( self, edges_target );
          set_graph_edges_source( self, edges_source );
          set_graph_label_edge_map( self, label_edge_map );
          set_graph_nodes( self, nodes );
          set_graph_label_node_map( self, label_node_map );
          set_graph_integer_sequence_generator( self, v_integer_sequence_generator );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym109$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9015L)
  public static SubLObject graph_accept_node_method(final SubLObject self, final SubLObject new_node)
  {
    return graph_node_p( new_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9230L)
  public static SubLObject graph_accept_edge_method(final SubLObject self, final SubLObject new_edge)
  {
    return graph_edge_p( new_edge );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9445L)
  public static SubLObject graph_add_node_method(final SubLObject self, final SubLObject new_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject core_node_map = get_graph_core_node_map( self );
    final SubLObject nodes = get_graph_nodes( self );
    final SubLObject label_node_map = get_graph_label_node_map( self );
    final SubLObject v_integer_sequence_generator = get_graph_integer_sequence_generator( self );
    try
    {
      thread.throwStack.push( $sym121$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_1_args( self, $sym111$ACCEPT_NODE, new_node ) )
        {
          Errors.warn( $str122$__Cannot_add_node__S, new_node );
          Dynamic.sublisp_throw( $sym121$OUTER_CATCH_FOR_GRAPH_METHOD, NIL );
        }
        SubLObject node_id = instances.get_slot( new_node, $sym4$ID );
        final SubLObject node_label = methods.funcall_instance_method_with_0_args( new_node, $sym33$GET_LABEL );
        final SubLObject node_core = methods.funcall_instance_method_with_0_args( new_node, $sym38$GET_CORE );
        if( NIL == node_id )
        {
          node_id = integer_sequence_generator.integer_sequence_generator_next( v_integer_sequence_generator );
          methods.funcall_instance_method_with_1_args( new_node, $sym15$SET_ID, node_id );
        }
        dictionary.dictionary_enter( nodes, node_id, new_node );
        if( NIL != node_label )
        {
          dictionary.dictionary_enter( label_node_map, node_label, new_node );
        }
        if( NIL != node_core )
        {
          dictionary.dictionary_enter( core_node_map, node_core, new_node );
        }
        Dynamic.sublisp_throw( $sym121$OUTER_CATCH_FOR_GRAPH_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_core_node_map( self, core_node_map );
          set_graph_nodes( self, nodes );
          set_graph_label_node_map( self, label_node_map );
          set_graph_integer_sequence_generator( self, v_integer_sequence_generator );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym121$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10218L)
  public static SubLObject graph_get_node_by_id_method(final SubLObject self, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym127$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != Types.integerp( id ) : id;
        Dynamic.sublisp_throw( $sym127$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( nodes, id, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym127$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10454L)
  public static SubLObject graph_get_node_by_label_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject label_node_map = get_graph_label_node_map( self );
    try
    {
      thread.throwStack.push( $sym131$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        Dynamic.sublisp_throw( $sym131$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( label_node_map, string, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_label_node_map( self, label_node_map );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym131$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10723L)
  public static SubLObject graph_get_node_by_core_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject core_node_map = get_graph_core_node_map( self );
    try
    {
      thread.throwStack.push( $sym136$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym136$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( core_node_map, v_object, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_core_node_map( self, core_node_map );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym136$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10952L)
  public static SubLObject graph_add_edge_method(final SubLObject self, final SubLObject new_edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_target = get_graph_edges_target( self );
    final SubLObject edges_source = get_graph_edges_source( self );
    final SubLObject label_edge_map = get_graph_label_edge_map( self );
    try
    {
      thread.throwStack.push( $sym140$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_1_args( self, $sym115$ACCEPT_EDGE, new_edge ) )
        {
          Errors.warn( $str141$__Cannot_add_edge__S, new_edge );
          Dynamic.sublisp_throw( $sym140$OUTER_CATCH_FOR_GRAPH_METHOD, NIL );
        }
        final SubLObject label = methods.funcall_instance_method_with_0_args( new_edge, $sym33$GET_LABEL );
        final SubLObject source = instances.get_slot( new_edge, $sym59$FROM );
        final SubLObject target = instances.get_slot( new_edge, $sym58$TO );
        dictionary_utilities.dictionary_push( edges_source, source, new_edge );
        dictionary_utilities.dictionary_push( edges_target, target, new_edge );
        if( NIL == string_utilities.empty_string_p( label ) )
        {
          dictionary_utilities.dictionary_push( label_edge_map, label, new_edge );
        }
        Dynamic.sublisp_throw( $sym140$OUTER_CATCH_FOR_GRAPH_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_target( self, edges_target );
          set_graph_edges_source( self, edges_source );
          set_graph_label_edge_map( self, label_edge_map );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym140$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11522L)
  public static SubLObject graph_remove_edge_method(final SubLObject self, final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_target = get_graph_edges_target( self );
    final SubLObject edges_source = get_graph_edges_source( self );
    final SubLObject label_edge_map = get_graph_label_edge_map( self );
    try
    {
      thread.throwStack.push( $sym146$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != graph_edge_p( edge ) : edge;
        final SubLObject label = methods.funcall_instance_method_with_0_args( edge, $sym33$GET_LABEL );
        final SubLObject source = instances.get_slot( edge, $sym59$FROM );
        final SubLObject target = instances.get_slot( edge, $sym58$TO );
        dictionary.dictionary_remove( edges_source, source );
        dictionary.dictionary_remove( edges_target, target );
        dictionary.dictionary_remove( label_edge_map, label );
        Dynamic.sublisp_throw( $sym146$OUTER_CATCH_FOR_GRAPH_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_target( self, edges_target );
          set_graph_edges_source( self, edges_source );
          set_graph_label_edge_map( self, label_edge_map );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym146$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11949L)
  public static SubLObject graph_get_edges_from_method(final SubLObject self, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_source = get_graph_edges_source( self );
    try
    {
      thread.throwStack.push( $sym151$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != Types.integerp( id ) : id;
        Dynamic.sublisp_throw( $sym151$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( edges_source, id, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_source( self, edges_source );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym151$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12215L)
  public static SubLObject graph_get_edges_to_method(final SubLObject self, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_target = get_graph_edges_target( self );
    try
    {
      thread.throwStack.push( $sym155$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != Types.integerp( id ) : id;
        Dynamic.sublisp_throw( $sym155$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( edges_target, id, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_target( self, edges_target );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym155$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12478L)
  public static SubLObject graph_get_edges_from_node_method(final SubLObject self, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_source = get_graph_edges_source( self );
    try
    {
      thread.throwStack.push( $sym160$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != graph_node_p( node ) : node;
        final SubLObject node_id = methods.funcall_instance_method_with_0_args( node, $sym42$GET_ID );
        Dynamic.sublisp_throw( $sym160$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( edges_source, node_id, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_source( self, edges_source );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym160$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12809L)
  public static SubLObject graph_get_edges_to_node_method(final SubLObject self, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_target = get_graph_edges_target( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != graph_node_p( node ) : node;
        final SubLObject node_id = methods.funcall_instance_method_with_0_args( node, $sym42$GET_ID );
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup( edges_target, node_id, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_target( self, edges_target );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13132L)
  public static SubLObject graph_get_nodes_from_node_method(final SubLObject self, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym168$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != graph_node_p( node ) : node;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( self, $sym157$GET_EDGES_FROM_NODE, node );
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject node_id = methods.funcall_instance_method_with_0_args( edge, $sym82$GET_TO );
          result = ConsesLow.cons( dictionary.dictionary_lookup( nodes, node_id, UNPROVIDED ), result );
          cdolist_list_var = cdolist_list_var.rest();
          edge = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym168$OUTER_CATCH_FOR_GRAPH_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym168$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13567L)
  public static SubLObject graph_get_nodes_to_node_method(final SubLObject self, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym172$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != graph_node_p( node ) : node;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym162$GET_EDGES_TO_NODE );
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject node_id = methods.funcall_instance_method_with_0_args( edge, $sym82$GET_TO );
          result = ConsesLow.cons( dictionary.dictionary_lookup( nodes, node_id, UNPROVIDED ), result );
          cdolist_list_var = cdolist_list_var.rest();
          edge = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym172$OUTER_CATCH_FOR_GRAPH_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym172$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13994L)
  public static SubLObject graph_get_path_labels_method(final SubLObject self, final SubLObject terms)
  {
    assert NIL != Types.listp( terms ) : terms;
    SubLObject target_nodes = NIL;
    SubLObject ascending_labels = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = string_utilities.split_string( v_term, UNPROVIDED );
      SubLObject token = NIL;
      token = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject node = methods.funcall_instance_method_with_1_args( self, $sym129$GET_NODE_BY_LABEL, token );
        if( NIL != graph_node_p( node ) )
        {
          target_nodes = ConsesLow.cons( node, target_nodes );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        token = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    cdolist_list_var = methods.funcall_instance_method_with_1_args( self, $sym178$COLLECT_ALL_ASCENDING, target_nodes );
    SubLObject ascending = NIL;
    ascending = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ascending_labels = ConsesLow.cons( instances.get_slot( ascending, $sym3$LABEL ), ascending_labels );
      cdolist_list_var = cdolist_list_var.rest();
      ascending = cdolist_list_var.first();
    }
    return ascending_labels;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 14807L)
  public static SubLObject graph_collect_ascending_method(final SubLObject self, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_target = get_graph_edges_target( self );
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym182$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != graph_node_p( node ) : node;
        final SubLObject marks = Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED );
        final SubLObject node_id = instances.get_slot( node, $sym4$ID );
        SubLObject edges = dictionary.dictionary_lookup( edges_target, node_id, UNPROVIDED );
        SubLObject collected_nodes = NIL;
        Hashtables.sethash( node_id, marks, T );
        while ( NIL != edges)
        {
          final SubLObject top_edge = edges.first();
          final SubLObject other_edges = edges.rest();
          final SubLObject from_node_id = instances.get_slot( top_edge, $sym59$FROM );
          if( NIL != Hashtables.gethash( from_node_id, marks, UNPROVIDED ) )
          {
            edges = other_edges;
          }
          else
          {
            Hashtables.sethash( from_node_id, marks, T );
            edges = ConsesLow.append( dictionary.dictionary_lookup( edges_target, from_node_id, UNPROVIDED ), other_edges );
          }
        }
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( marks );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            collected_nodes = ConsesLow.cons( dictionary.dictionary_lookup( nodes, key, UNPROVIDED ), collected_nodes );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        Dynamic.sublisp_throw( $sym182$OUTER_CATCH_FOR_GRAPH_METHOD, collected_nodes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_target( self, edges_target );
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym182$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 15713L)
  public static SubLObject graph_collect_all_ascending_method(final SubLObject self, final SubLObject node_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_target = get_graph_edges_target( self );
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym186$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        assert NIL != Types.listp( node_list ) : node_list;
        final SubLObject marks = Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED );
        SubLObject edges = NIL;
        SubLObject collected_nodes = NIL;
        SubLObject cdolist_list_var = node_list;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != graph_node_p( node ) )
          {
            final SubLObject node_id = instances.get_slot( node, $sym4$ID );
            edges = ConsesLow.append( dictionary.dictionary_lookup( edges_target, node_id, UNPROVIDED ), edges );
            Hashtables.sethash( node_id, marks, T );
          }
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
        while ( NIL != edges)
        {
          final SubLObject top_edge = edges.first();
          final SubLObject other_edges = edges.rest();
          final SubLObject from_node_id = instances.get_slot( top_edge, $sym59$FROM );
          if( NIL != Hashtables.gethash( from_node_id, marks, UNPROVIDED ) )
          {
            edges = other_edges;
          }
          else
          {
            Hashtables.sethash( from_node_id, marks, T );
            edges = ConsesLow.append( dictionary.dictionary_lookup( edges_target, from_node_id, UNPROVIDED ), other_edges );
          }
        }
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( marks );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            collected_nodes = ConsesLow.cons( dictionary.dictionary_lookup( nodes, key, UNPROVIDED ), collected_nodes );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        Dynamic.sublisp_throw( $sym186$OUTER_CATCH_FOR_GRAPH_METHOD, collected_nodes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_target( self, edges_target );
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym186$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 16771L)
  public static SubLObject graph_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym189$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        streams_high.write_string( $str50$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( subloop_structures.class_name( subloop_structures.instance_class( self ) ), stream );
        streams_high.write_string( $str53$__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( print_high.prin1_to_string( dictionary.dictionary_length( nodes ) ), stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str190$_nodes, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str54$_, stream, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym189$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 17194L)
  public static SubLObject graph_pprint_method(final SubLObject self, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_graph_method = NIL;
    final SubLObject edges_source = get_graph_edges_source( self );
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym195$OUTER_CATCH_FOR_GRAPH_METHOD );
      try
      {
        streams_high.write_string( $str50$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( subloop_structures.class_name( subloop_structures.instance_class( self ) ), stream );
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( nodes ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject node_from = thread.secondMultipleValue();
          thread.resetMultipleValues();
          streams_high.write_string( string_utilities.$new_line_string$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED );
          methods.funcall_instance_method_with_2_args( node_from, $sym46$PRINT, stream, NIL );
          streams_high.write_string( Sequences.cconcatenate( string_utilities.$new_line_string$.getGlobalValue(), $str196$___ ), stream, UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var;
          final SubLObject edges = cdolist_list_var = dictionary.dictionary_lookup( edges_source, key, UNPROVIDED );
          SubLObject edge = NIL;
          edge = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject node_to = dictionary.dictionary_lookup( nodes, instances.get_slot( edge, $sym58$TO ), UNPROVIDED );
            streams_high.write_string( $str197$_, stream, UNPROVIDED, UNPROVIDED );
            methods.funcall_instance_method_with_2_args( node_to, $sym46$PRINT, stream, NIL );
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        streams_high.write_string( $str54$_, stream, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_edges_source( self, edges_source );
          set_graph_nodes( self, nodes );
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
      catch_var_for_graph_method = Errors.handleThrowable( ccatch_env_var, $sym195$OUTER_CATCH_FOR_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 17912L)
  public static SubLObject make_graph_from_string_lists(final SubLObject list)
  {
    final SubLObject v_graph = object.new_class_instance( $sym97$GRAPH );
    SubLObject cdolist_list_var = list;
    SubLObject node_list = NIL;
    node_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject from_string = node_list.first();
      SubLObject from_node = methods.funcall_instance_method_with_1_args( v_graph, $sym129$GET_NODE_BY_LABEL, from_string );
      final SubLObject to_strings = node_list.rest();
      if( NIL == from_node )
      {
        from_node = object.new_class_instance( $sym0$GRAPH_NODE );
        methods.funcall_instance_method_with_1_args( from_node, $sym27$SET_LABEL, from_string );
      }
      methods.funcall_instance_method_with_1_args( v_graph, $sym119$ADD_NODE, from_node );
      SubLObject cdolist_list_var_$2 = to_strings;
      SubLObject to_string = NIL;
      to_string = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        SubLObject to_node = methods.funcall_instance_method_with_1_args( v_graph, $sym129$GET_NODE_BY_LABEL, to_string );
        if( NIL == to_node )
        {
          to_node = object.new_class_instance( $sym0$GRAPH_NODE );
          methods.funcall_instance_method_with_1_args( to_node, $sym27$SET_LABEL, to_string );
        }
        methods.funcall_instance_method_with_1_args( v_graph, $sym119$ADD_NODE, to_node );
        methods.funcall_instance_method_with_1_args( v_graph, $sym138$ADD_EDGE, methods.funcall_class_method_with_2_args( $sym56$GRAPH_EDGE, $sym62$MAKE_EDGE, from_node, to_node ) );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        to_string = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      node_list = cdolist_list_var.first();
    }
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 18982L)
  public static SubLObject do_graph_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject node = NIL;
    SubLObject v_graph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    v_graph = current.first();
    current = current.rest();
    final SubLObject done = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list199 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject graph_var = $sym200$GRAPH_VAR;
      return ConsesLow.list( $sym201$CLET, ConsesLow.list( ConsesLow.list( graph_var, v_graph ) ), ConsesLow.listS( $sym202$DO_DICTIONARY, ConsesLow.list( $sym203$KEY, node, ConsesLow.listS( $sym204$GET_SLOT, graph_var,
          $list205 ), done ), $list206, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 19285L)
  public static SubLObject subloop_reserved_initialize_cyc_graph_node_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 19285L)
  public static SubLObject subloop_reserved_initialize_cyc_graph_node_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$GRAPH_NODE, $sym5$CORE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$GRAPH_NODE, $sym4$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$GRAPH_NODE, $sym3$LABEL, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 19285L)
  public static SubLObject cyc_graph_node_p(final SubLObject cyc_graph_node)
  {
    return classes.subloop_instanceof_class( cyc_graph_node, $sym207$CYC_GRAPH_NODE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 19600L)
  public static SubLObject cyc_graph_node_make_node_method(final SubLObject self, final SubLObject cyc_term)
  {
    final SubLObject new_node = object.new_class_instance( self );
    methods.funcall_instance_method_with_1_args( new_node, $sym21$SET_CORE, cyc_term );
    methods.funcall_instance_method_with_1_args( new_node, $sym27$SET_LABEL, methods.funcall_instance_method_with_0_args( new_node, $sym214$GENERATE_PHRASE ) );
    return new_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 19926L)
  public static SubLObject cyc_graph_node_set_core_method(final SubLObject self, final SubLObject cyc_term, SubLObject v_graph)
  {
    if( v_graph == UNPROVIDED )
    {
      v_graph = NIL;
    }
    assert NIL != term.closed_termP( cyc_term, UNPROVIDED ) : cyc_term;
    return methods.funcall_instance_super_method_with_2_args( self, $sym21$SET_CORE, cyc_term, v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20210L)
  public static SubLObject cyc_graph_node_generate_phrase_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_graph_node_method = NIL;
    final SubLObject v_core = get_graph_node_core( self );
    try
    {
      thread.throwStack.push( $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD, pph_main.generate_phrase( v_core, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_node_core( self, v_core );
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
      catch_var_for_cyc_graph_node_method = Errors.handleThrowable( ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_graph_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20397L)
  public static SubLObject get_cyc_graph_edge_predicate(final SubLObject cyc_graph_edge)
  {
    return classes.subloop_get_access_protected_instance_slot( cyc_graph_edge, FOUR_INTEGER, $sym225$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20397L)
  public static SubLObject set_cyc_graph_edge_predicate(final SubLObject cyc_graph_edge, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyc_graph_edge, value, FOUR_INTEGER, $sym225$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20397L)
  public static SubLObject subloop_reserved_initialize_cyc_graph_edge_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20397L)
  public static SubLObject subloop_reserved_initialize_cyc_graph_edge_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym56$GRAPH_EDGE, $sym59$FROM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym56$GRAPH_EDGE, $sym58$TO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym56$GRAPH_EDGE, $sym3$LABEL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym223$CYC_GRAPH_EDGE, $sym225$PREDICATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20397L)
  public static SubLObject cyc_graph_edge_p(final SubLObject cyc_graph_edge)
  {
    return classes.subloop_instanceof_class( cyc_graph_edge, $sym223$CYC_GRAPH_EDGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 20708L)
  public static SubLObject cyc_graph_edge_make_edge_method(final SubLObject self, final SubLObject from_node, final SubLObject to_node, SubLObject pred)
  {
    if( pred == UNPROVIDED )
    {
      pred = $const230$genls;
    }
    assert NIL != cyc_graph_node_p( to_node ) : to_node;
    assert NIL != cyc_graph_node_p( from_node ) : from_node;
    assert NIL != fort_types_interface.predicateP( pred ) : pred;
    final SubLObject fid = instances.get_slot( from_node, $sym4$ID );
    final SubLObject tid = instances.get_slot( to_node, $sym4$ID );
    final SubLObject new_edge = object.new_class_instance( $sym223$CYC_GRAPH_EDGE );
    if( fid.isNumber() && tid.isNumber() )
    {
      methods.funcall_instance_method_with_1_args( new_edge, $sym67$SET_FROM, fid );
      methods.funcall_instance_method_with_1_args( new_edge, $sym68$SET_TO, tid );
      methods.funcall_instance_method_with_1_args( new_edge, $sym233$SET_PREDICATE, pred );
      return new_edge;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 21530L)
  public static SubLObject cyc_graph_edge_set_predicate_method(final SubLObject self, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_graph_edge_method = NIL;
    SubLObject predicate = get_cyc_graph_edge_predicate( self );
    try
    {
      thread.throwStack.push( $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD );
      try
      {
        assert NIL != fort_types_interface.predicateP( pred ) : pred;
        predicate = pred;
        Dynamic.sublisp_throw( $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyc_graph_edge_predicate( self, predicate );
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
      catch_var_for_cyc_graph_edge_method = Errors.handleThrowable( ccatch_env_var, $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_graph_edge_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 21760L)
  public static SubLObject subloop_reserved_initialize_cyc_graph_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 21760L)
  public static SubLObject subloop_reserved_initialize_cyc_graph_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym105$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym104$INTEGER_SEQUENCE_GENERATOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym103$LABEL_NODE_MAP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym102$NODES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym101$LABEL_EDGE_MAP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym100$EDGES_SOURCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym99$EDGES_TARGET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym97$GRAPH, $sym25$CORE_NODE_MAP, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 21760L)
  public static SubLObject cyc_graph_p(final SubLObject cyc_graph)
  {
    return classes.subloop_instanceof_class( cyc_graph, $sym239$CYC_GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 22073L)
  public static SubLObject new_cyc_graph(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    final SubLObject v_graph = object.new_class_instance( $sym239$CYC_GRAPH );
    instances.set_slot( v_graph, $sym105$NAME, name );
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 22238L)
  public static SubLObject get_cyc_graph_ancestor_pruning_predicate(final SubLObject predicate)
  {
    assert NIL != fort_types_interface.predicateP( predicate ) : predicate;
    if( predicate.eql( $const230$genls ) )
    {
      return $const230$genls;
    }
    if( predicate.eql( $const243$isa ) )
    {
      return $const230$genls;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 22419L)
  public static SubLObject cyc_graph_accept_node_method(final SubLObject self, final SubLObject new_node)
  {
    return cyc_graph_node_p( new_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 22646L)
  public static SubLObject cyc_graph_accept_edge_method(final SubLObject self, final SubLObject new_edge)
  {
    return cyc_graph_edge_p( new_edge );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 22869L)
  public static SubLObject cyc_graph_interpolate_node_method(final SubLObject self, final SubLObject new_node, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = $const230$genls;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyc_graph_method = NIL;
    final SubLObject nodes = get_graph_nodes( self );
    try
    {
      thread.throwStack.push( $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD );
      try
      {
        if( NIL == methods.funcall_instance_method_with_1_args( self, $sym133$GET_NODE_BY_CORE, methods.funcall_instance_method_with_0_args( new_node, $sym38$GET_CORE ) ) )
        {
          methods.funcall_instance_method_with_1_args( self, $sym119$ADD_NODE, new_node );
          SubLObject adopted_children = NIL;
          SubLObject most_specific_ancestors = NIL;
          final SubLObject pruning_pred = get_cyc_graph_ancestor_pruning_predicate( predicate );
          SubLObject iteration_state;
          for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( nodes ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
              iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
          {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
            final SubLObject old_node = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( !old_node.eql( new_node ) )
            {
              final SubLObject arg_old = methods.funcall_instance_method_with_0_args( old_node, $sym38$GET_CORE );
              final SubLObject arg_new = methods.funcall_instance_method_with_0_args( new_node, $sym38$GET_CORE );
              final SubLObject candidate_ancestor = ( NIL != cyc_kernel.cyc_query( ConsesLow.list( predicate, arg_new, arg_old ), $const252$EverythingPSC, UNPROVIDED ) ) ? arg_old : NIL;
              final SubLObject candidate_adoptee = ( NIL != cyc_kernel.cyc_query( ConsesLow.list( predicate, arg_old, arg_new ), $const252$EverythingPSC, UNPROVIDED ) ) ? arg_old : NIL;
              most_specific_ancestors = challenge_set_wrt_predicate( most_specific_ancestors, candidate_ancestor, pruning_pred, UNPROVIDED );
              adopted_children = challenge_set_wrt_predicate( adopted_children, candidate_adoptee, pruning_pred, NIL );
            }
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          SubLObject cdolist_list_var = most_specific_ancestors;
          SubLObject ancestor = NIL;
          ancestor = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args( self, $sym157$GET_EDGES_FROM_NODE, methods.funcall_instance_method_with_1_args( self, $sym133$GET_NODE_BY_CORE, ancestor ) );
            SubLObject edge_from_ancestor = NIL;
            edge_from_ancestor = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              final SubLObject to_id = methods.funcall_instance_method_with_0_args( edge_from_ancestor, $sym82$GET_TO );
              SubLObject match = NIL;
              if( NIL == match )
              {
                SubLObject csome_list_var;
                SubLObject adoptee;
                for( csome_list_var = adopted_children, adoptee = NIL, adoptee = csome_list_var.first(); NIL == match && NIL != csome_list_var; match = Numbers.numE( to_id, instances.get_slot( methods
                    .funcall_instance_method_with_1_args( self, $sym133$GET_NODE_BY_CORE, adoptee ), $sym4$ID ) ), csome_list_var = csome_list_var.rest(), adoptee = csome_list_var.first() )
                {
                }
              }
              if( NIL != match )
              {
                methods.funcall_instance_method_with_1_args( self, $sym143$REMOVE_EDGE, edge_from_ancestor );
              }
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              edge_from_ancestor = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
          }
          cdolist_list_var = most_specific_ancestors;
          ancestor = NIL;
          ancestor = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject ancestor_node = methods.funcall_instance_method_with_1_args( self, $sym133$GET_NODE_BY_CORE, ancestor );
            methods.funcall_instance_method_with_1_args( self, $sym138$ADD_EDGE, methods.funcall_class_method_with_3_args( $sym223$CYC_GRAPH_EDGE, $sym62$MAKE_EDGE, ancestor_node, new_node, predicate ) );
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
          }
          cdolist_list_var = adopted_children;
          SubLObject adoptee2 = NIL;
          adoptee2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject adoptee_node = methods.funcall_instance_method_with_1_args( self, $sym133$GET_NODE_BY_CORE, adoptee2 );
            methods.funcall_instance_method_with_1_args( self, $sym138$ADD_EDGE, methods.funcall_class_method_with_3_args( $sym223$CYC_GRAPH_EDGE, $sym62$MAKE_EDGE, new_node, adoptee_node, predicate ) );
            cdolist_list_var = cdolist_list_var.rest();
            adoptee2 = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_graph_nodes( self, nodes );
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
      catch_var_for_cyc_graph_method = Errors.handleThrowable( ccatch_env_var, $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyc_graph_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 25723L)
  public static SubLObject cyc_graph_interpolate_cyc_term_method(final SubLObject self, final SubLObject cyc_term, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = $const230$genls;
    }
    final SubLObject new_node = methods.funcall_class_method_with_1_args( $sym207$CYC_GRAPH_NODE, $sym211$MAKE_NODE, cyc_term );
    methods.funcall_instance_method_with_2_args( self, $sym248$INTERPOLATE_NODE, new_node, predicate );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 26225L)
  public static SubLObject challenge_set_wrt_predicate(final SubLObject incumbents, final SubLObject challenger, final SubLObject predicate, SubLObject entrant_arg1P)
  {
    if( entrant_arg1P == UNPROVIDED )
    {
      entrant_arg1P = T;
    }
    if( NIL == challenger )
    {
      return incumbents;
    }
    if( NIL == incumbents )
    {
      return ConsesLow.list( challenger );
    }
    final SubLObject head = incumbents.first();
    final SubLObject tail = incumbents.rest();
    final SubLObject queries = ConsesLow.list( ConsesLow.list( predicate, challenger, head ), ConsesLow.list( predicate, head, challenger ) );
    final SubLObject new_head_query = ( NIL != entrant_arg1P ) ? queries.first() : conses_high.second( queries );
    final SubLObject survivor_query = ( NIL != entrant_arg1P ) ? conses_high.second( queries ) : queries.first();
    final SubLObject new_head = ( NIL != cyc_kernel.cyc_query( new_head_query, $const252$EverythingPSC, UNPROVIDED ) ) ? challenger : head;
    final SubLObject survivor = ( NIL != cyc_kernel.cyc_query( survivor_query, $const252$EverythingPSC, UNPROVIDED ) ) ? NIL : challenger;
    return Sequences.remove_duplicates( ConsesLow.cons( new_head, challenge_set_wrt_predicate( tail, survivor, predicate, entrant_arg1P ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_graph_file()
  {
    SubLFiles.declareFunction( me, "get_graph_node_label", "GET-GRAPH-NODE-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_node_label", "SET-GRAPH-NODE-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_node_id", "GET-GRAPH-NODE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_node_id", "SET-GRAPH-NODE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_node_core", "GET-GRAPH-NODE-CORE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_node_core", "SET-GRAPH-NODE-CORE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_graph_node_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_graph_node_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_node_p", "GRAPH-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_node_initialize_method", "GRAPH-NODE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_node_set_id_method", "GRAPH-NODE-SET-ID-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_node_set_core_method", "GRAPH-NODE-SET-CORE-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "graph_node_set_label_method", "GRAPH-NODE-SET-LABEL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_node_get_label_method", "GRAPH-NODE-GET-LABEL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_node_get_core_method", "GRAPH-NODE-GET-CORE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_node_get_id_method", "GRAPH-NODE-GET-ID-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_node_print_method", "GRAPH-NODE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "get_graph_edge_label", "GET-GRAPH-EDGE-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_edge_label", "SET-GRAPH-EDGE-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_edge_to", "GET-GRAPH-EDGE-TO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_edge_to", "SET-GRAPH-EDGE-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_edge_from", "GET-GRAPH-EDGE-FROM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_edge_from", "SET-GRAPH-EDGE-FROM", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_graph_edge_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_graph_edge_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_p", "GRAPH-EDGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_make_edge_method", "GRAPH-EDGE-MAKE-EDGE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_initialize_method", "GRAPH-EDGE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_set_from_method", "GRAPH-EDGE-SET-FROM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_set_to_method", "GRAPH-EDGE-SET-TO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_get_from_method", "GRAPH-EDGE-GET-FROM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_get_to_method", "GRAPH-EDGE-GET-TO-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_set_label_method", "GRAPH-EDGE-SET-LABEL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_get_label_method", "GRAPH-EDGE-GET-LABEL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_edge_print_method", "GRAPH-EDGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "get_graph_core_node_map", "GET-GRAPH-CORE-NODE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_core_node_map", "SET-GRAPH-CORE-NODE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_edges_target", "GET-GRAPH-EDGES-TARGET", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_edges_target", "SET-GRAPH-EDGES-TARGET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_edges_source", "GET-GRAPH-EDGES-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_edges_source", "SET-GRAPH-EDGES-SOURCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_label_edge_map", "GET-GRAPH-LABEL-EDGE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_label_edge_map", "SET-GRAPH-LABEL-EDGE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_nodes", "GET-GRAPH-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_nodes", "SET-GRAPH-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_label_node_map", "GET-GRAPH-LABEL-NODE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_label_node_map", "SET-GRAPH-LABEL-NODE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_integer_sequence_generator", "GET-GRAPH-INTEGER-SEQUENCE-GENERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_integer_sequence_generator", "SET-GRAPH-INTEGER-SEQUENCE-GENERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_graph_name", "GET-GRAPH-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_graph_name", "SET-GRAPH-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_graph_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_p", "GRAPH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_graph", "NEW-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_initialize_method", "GRAPH-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_accept_node_method", "GRAPH-ACCEPT-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_accept_edge_method", "GRAPH-ACCEPT-EDGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_add_node_method", "GRAPH-ADD-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_node_by_id_method", "GRAPH-GET-NODE-BY-ID-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_node_by_label_method", "GRAPH-GET-NODE-BY-LABEL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_node_by_core_method", "GRAPH-GET-NODE-BY-CORE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_add_edge_method", "GRAPH-ADD-EDGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_remove_edge_method", "GRAPH-REMOVE-EDGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_edges_from_method", "GRAPH-GET-EDGES-FROM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_edges_to_method", "GRAPH-GET-EDGES-TO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_edges_from_node_method", "GRAPH-GET-EDGES-FROM-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_edges_to_node_method", "GRAPH-GET-EDGES-TO-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_nodes_from_node_method", "GRAPH-GET-NODES-FROM-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_nodes_to_node_method", "GRAPH-GET-NODES-TO-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_get_path_labels_method", "GRAPH-GET-PATH-LABELS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_collect_ascending_method", "GRAPH-COLLECT-ASCENDING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_collect_all_ascending_method", "GRAPH-COLLECT-ALL-ASCENDING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_print_method", "GRAPH-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "graph_pprint_method", "GRAPH-PPRINT-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "make_graph_from_string_lists", "MAKE-GRAPH-FROM-STRING-LISTS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_graph_nodes", "DO-GRAPH-NODES" );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_graph_node_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_graph_node_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_node_p", "CYC-GRAPH-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_node_make_node_method", "CYC-GRAPH-NODE-MAKE-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_node_set_core_method", "CYC-GRAPH-NODE-SET-CORE-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_graph_node_generate_phrase_method", "CYC-GRAPH-NODE-GENERATE-PHRASE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_graph_edge_predicate", "GET-CYC-GRAPH-EDGE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_graph_edge_predicate", "SET-CYC-GRAPH-EDGE-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_graph_edge_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_graph_edge_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_edge_p", "CYC-GRAPH-EDGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_edge_make_edge_method", "CYC-GRAPH-EDGE-MAKE-EDGE-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "cyc_graph_edge_set_predicate_method", "CYC-GRAPH-EDGE-SET-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_graph_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyc_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_p", "CYC-GRAPH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_graph", "NEW-CYC-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_graph_ancestor_pruning_predicate", "GET-CYC-GRAPH-ANCESTOR-PRUNING-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_accept_node_method", "CYC-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_accept_edge_method", "CYC-GRAPH-ACCEPT-EDGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_graph_interpolate_node_method", "CYC-GRAPH-INTERPOLATE-NODE-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_graph_interpolate_cyc_term_method", "CYC-GRAPH-INTERPOLATE-CYC-TERM-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "challenge_set_wrt_predicate", "CHALLENGE-SET-WRT-PREDICATE", 3, 1, false );
    return NIL;
  }

  public static SubLObject init_graph_file()
  {
    return NIL;
  }

  public static SubLObject setup_graph_file()
  {
    classes.subloop_new_class( $sym0$GRAPH_NODE, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$GRAPH_NODE, NIL );
    classes.subloop_note_class_initialization_function( $sym0$GRAPH_NODE, $sym7$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$GRAPH_NODE, $sym10$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE );
    subloop_reserved_initialize_graph_node_class( $sym0$GRAPH_NODE );
    methods.methods_incorporate_instance_method( $sym11$INITIALIZE, $sym0$GRAPH_NODE, $list12, NIL, $list13 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym11$INITIALIZE, $sym14$GRAPH_NODE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym15$SET_ID, $sym0$GRAPH_NODE, $list12, $list16, $list17 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym15$SET_ID, $sym20$GRAPH_NODE_SET_ID_METHOD );
    methods.methods_incorporate_instance_method( $sym21$SET_CORE, $sym0$GRAPH_NODE, $list12, $list22, $list23 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym21$SET_CORE, $sym26$GRAPH_NODE_SET_CORE_METHOD );
    methods.methods_incorporate_instance_method( $sym27$SET_LABEL, $sym0$GRAPH_NODE, $list12, $list28, $list29 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym27$SET_LABEL, $sym32$GRAPH_NODE_SET_LABEL_METHOD );
    methods.methods_incorporate_instance_method( $sym33$GET_LABEL, $sym0$GRAPH_NODE, $list12, NIL, $list34 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym33$GET_LABEL, $sym37$GRAPH_NODE_GET_LABEL_METHOD );
    methods.methods_incorporate_instance_method( $sym38$GET_CORE, $sym0$GRAPH_NODE, $list12, NIL, $list39 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym38$GET_CORE, $sym41$GRAPH_NODE_GET_CORE_METHOD );
    methods.methods_incorporate_instance_method( $sym42$GET_ID, $sym0$GRAPH_NODE, $list12, NIL, $list43 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym42$GET_ID, $sym45$GRAPH_NODE_GET_ID_METHOD );
    methods.methods_incorporate_instance_method( $sym46$PRINT, $sym0$GRAPH_NODE, $list12, $list47, $list48 );
    methods.subloop_register_instance_method( $sym0$GRAPH_NODE, $sym46$PRINT, $sym55$GRAPH_NODE_PRINT_METHOD );
    classes.subloop_new_class( $sym56$GRAPH_EDGE, $sym1$OBJECT, NIL, NIL, $list57 );
    classes.class_set_implements_slot_listeners( $sym56$GRAPH_EDGE, NIL );
    classes.subloop_note_class_initialization_function( $sym56$GRAPH_EDGE, $sym60$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym56$GRAPH_EDGE, $sym61$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE );
    subloop_reserved_initialize_graph_edge_class( $sym56$GRAPH_EDGE );
    methods.methods_incorporate_class_method( $sym62$MAKE_EDGE, $sym56$GRAPH_EDGE, $list63, $list64, $list65 );
    methods.subloop_register_class_method( $sym56$GRAPH_EDGE, $sym62$MAKE_EDGE, $sym69$GRAPH_EDGE_MAKE_EDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym11$INITIALIZE, $sym56$GRAPH_EDGE, $list12, NIL, $list70 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym11$INITIALIZE, $sym71$GRAPH_EDGE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym67$SET_FROM, $sym56$GRAPH_EDGE, $list12, $list16, $list72 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym67$SET_FROM, $sym74$GRAPH_EDGE_SET_FROM_METHOD );
    methods.methods_incorporate_instance_method( $sym68$SET_TO, $sym56$GRAPH_EDGE, $list12, $list16, $list75 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym68$SET_TO, $sym77$GRAPH_EDGE_SET_TO_METHOD );
    methods.methods_incorporate_instance_method( $sym78$GET_FROM, $sym56$GRAPH_EDGE, $list12, NIL, $list79 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym78$GET_FROM, $sym81$GRAPH_EDGE_GET_FROM_METHOD );
    methods.methods_incorporate_instance_method( $sym82$GET_TO, $sym56$GRAPH_EDGE, $list12, NIL, $list83 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym82$GET_TO, $sym85$GRAPH_EDGE_GET_TO_METHOD );
    methods.methods_incorporate_instance_method( $sym27$SET_LABEL, $sym56$GRAPH_EDGE, $list12, $list28, $list86 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym27$SET_LABEL, $sym88$GRAPH_EDGE_SET_LABEL_METHOD );
    methods.methods_incorporate_instance_method( $sym33$GET_LABEL, $sym56$GRAPH_EDGE, $list12, NIL, $list34 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym33$GET_LABEL, $sym90$GRAPH_EDGE_GET_LABEL_METHOD );
    methods.methods_incorporate_instance_method( $sym46$PRINT, $sym56$GRAPH_EDGE, $list12, $list47, $list91 );
    methods.subloop_register_instance_method( $sym56$GRAPH_EDGE, $sym46$PRINT, $sym96$GRAPH_EDGE_PRINT_METHOD );
    classes.subloop_new_class( $sym97$GRAPH, $sym1$OBJECT, NIL, NIL, $list98 );
    classes.class_set_implements_slot_listeners( $sym97$GRAPH, NIL );
    classes.subloop_note_class_initialization_function( $sym97$GRAPH, $sym106$SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS );
    classes.subloop_note_instance_initialization_function( $sym97$GRAPH, $sym107$SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE );
    subloop_reserved_initialize_graph_class( $sym97$GRAPH );
    methods.methods_incorporate_instance_method( $sym11$INITIALIZE, $sym97$GRAPH, $list12, NIL, $list108 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym11$INITIALIZE, $sym110$GRAPH_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym111$ACCEPT_NODE, $sym97$GRAPH, $list12, $list112, $list113 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym111$ACCEPT_NODE, $sym114$GRAPH_ACCEPT_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym115$ACCEPT_EDGE, $sym97$GRAPH, $list12, $list116, $list117 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym115$ACCEPT_EDGE, $sym118$GRAPH_ACCEPT_EDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym119$ADD_NODE, $sym97$GRAPH, $list63, $list112, $list120 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym119$ADD_NODE, $sym123$GRAPH_ADD_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym124$GET_NODE_BY_ID, $sym97$GRAPH, $list63, $list125, $list126 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym124$GET_NODE_BY_ID, $sym128$GRAPH_GET_NODE_BY_ID_METHOD );
    methods.methods_incorporate_instance_method( $sym129$GET_NODE_BY_LABEL, $sym97$GRAPH, $list63, $list28, $list130 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym129$GET_NODE_BY_LABEL, $sym132$GRAPH_GET_NODE_BY_LABEL_METHOD );
    methods.methods_incorporate_instance_method( $sym133$GET_NODE_BY_CORE, $sym97$GRAPH, $list63, $list134, $list135 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym133$GET_NODE_BY_CORE, $sym137$GRAPH_GET_NODE_BY_CORE_METHOD );
    methods.methods_incorporate_instance_method( $sym138$ADD_EDGE, $sym97$GRAPH, $list63, $list116, $list139 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym138$ADD_EDGE, $sym142$GRAPH_ADD_EDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym143$REMOVE_EDGE, $sym97$GRAPH, $list63, $list144, $list145 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym143$REMOVE_EDGE, $sym148$GRAPH_REMOVE_EDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym149$GET_EDGES_FROM, $sym97$GRAPH, $list63, $list125, $list150 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym149$GET_EDGES_FROM, $sym152$GRAPH_GET_EDGES_FROM_METHOD );
    methods.methods_incorporate_instance_method( $sym153$GET_EDGES_TO, $sym97$GRAPH, $list63, $list125, $list154 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym153$GET_EDGES_TO, $sym156$GRAPH_GET_EDGES_TO_METHOD );
    methods.methods_incorporate_instance_method( $sym157$GET_EDGES_FROM_NODE, $sym97$GRAPH, $list63, $list158, $list159 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym157$GET_EDGES_FROM_NODE, $sym161$GRAPH_GET_EDGES_FROM_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym162$GET_EDGES_TO_NODE, $sym97$GRAPH, $list63, $list158, $list163 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym162$GET_EDGES_TO_NODE, $sym165$GRAPH_GET_EDGES_TO_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym166$GET_NODES_FROM_NODE, $sym97$GRAPH, $list63, $list158, $list167 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym166$GET_NODES_FROM_NODE, $sym169$GRAPH_GET_NODES_FROM_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym170$GET_NODES_TO_NODE, $sym97$GRAPH, $list63, $list158, $list171 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym170$GET_NODES_TO_NODE, $sym173$GRAPH_GET_NODES_TO_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym174$GET_PATH_LABELS, $sym97$GRAPH, $list63, $list175, $list176 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym174$GET_PATH_LABELS, $sym179$GRAPH_GET_PATH_LABELS_METHOD );
    methods.methods_incorporate_instance_method( $sym180$COLLECT_ASCENDING, $sym97$GRAPH, $list63, $list158, $list181 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym180$COLLECT_ASCENDING, $sym183$GRAPH_COLLECT_ASCENDING_METHOD );
    methods.methods_incorporate_instance_method( $sym178$COLLECT_ALL_ASCENDING, $sym97$GRAPH, $list63, $list184, $list185 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym178$COLLECT_ALL_ASCENDING, $sym187$GRAPH_COLLECT_ALL_ASCENDING_METHOD );
    methods.methods_incorporate_instance_method( $sym46$PRINT, $sym97$GRAPH, $list12, $list47, $list188 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym46$PRINT, $sym191$GRAPH_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym192$PPRINT, $sym97$GRAPH, $list63, $list193, $list194 );
    methods.subloop_register_instance_method( $sym97$GRAPH, $sym192$PPRINT, $sym198$GRAPH_PPRINT_METHOD );
    classes.subloop_new_class( $sym207$CYC_GRAPH_NODE, $sym0$GRAPH_NODE, NIL, NIL, $list208 );
    classes.class_set_implements_slot_listeners( $sym207$CYC_GRAPH_NODE, NIL );
    classes.subloop_note_class_initialization_function( $sym207$CYC_GRAPH_NODE, $sym209$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym207$CYC_GRAPH_NODE, $sym210$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE );
    subloop_reserved_initialize_cyc_graph_node_class( $sym207$CYC_GRAPH_NODE );
    methods.methods_incorporate_class_method( $sym211$MAKE_NODE, $sym207$CYC_GRAPH_NODE, $list63, $list212, $list213 );
    methods.subloop_register_class_method( $sym207$CYC_GRAPH_NODE, $sym211$MAKE_NODE, $sym215$CYC_GRAPH_NODE_MAKE_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym21$SET_CORE, $sym207$CYC_GRAPH_NODE, $list63, $list216, $list217 );
    methods.subloop_register_instance_method( $sym207$CYC_GRAPH_NODE, $sym21$SET_CORE, $sym219$CYC_GRAPH_NODE_SET_CORE_METHOD );
    methods.methods_incorporate_instance_method( $sym214$GENERATE_PHRASE, $sym207$CYC_GRAPH_NODE, $list63, NIL, $list220 );
    methods.subloop_register_instance_method( $sym207$CYC_GRAPH_NODE, $sym214$GENERATE_PHRASE, $sym222$CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD );
    classes.subloop_new_class( $sym223$CYC_GRAPH_EDGE, $sym56$GRAPH_EDGE, NIL, NIL, $list224 );
    classes.class_set_implements_slot_listeners( $sym223$CYC_GRAPH_EDGE, NIL );
    classes.subloop_note_class_initialization_function( $sym223$CYC_GRAPH_EDGE, $sym226$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym223$CYC_GRAPH_EDGE, $sym227$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE );
    subloop_reserved_initialize_cyc_graph_edge_class( $sym223$CYC_GRAPH_EDGE );
    methods.methods_incorporate_class_method( $sym62$MAKE_EDGE, $sym223$CYC_GRAPH_EDGE, $list63, $list228, $list229 );
    methods.subloop_register_class_method( $sym223$CYC_GRAPH_EDGE, $sym62$MAKE_EDGE, $sym234$CYC_GRAPH_EDGE_MAKE_EDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym233$SET_PREDICATE, $sym223$CYC_GRAPH_EDGE, $list63, $list235, $list236 );
    methods.subloop_register_instance_method( $sym223$CYC_GRAPH_EDGE, $sym233$SET_PREDICATE, $sym238$CYC_GRAPH_EDGE_SET_PREDICATE_METHOD );
    classes.subloop_new_class( $sym239$CYC_GRAPH, $sym97$GRAPH, NIL, NIL, $list240 );
    classes.class_set_implements_slot_listeners( $sym239$CYC_GRAPH, NIL );
    classes.subloop_note_class_initialization_function( $sym239$CYC_GRAPH, $sym241$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS );
    classes.subloop_note_instance_initialization_function( $sym239$CYC_GRAPH, $sym242$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE );
    subloop_reserved_initialize_cyc_graph_class( $sym239$CYC_GRAPH );
    methods.methods_incorporate_instance_method( $sym111$ACCEPT_NODE, $sym239$CYC_GRAPH, $list12, $list112, $list244 );
    methods.subloop_register_instance_method( $sym239$CYC_GRAPH, $sym111$ACCEPT_NODE, $sym245$CYC_GRAPH_ACCEPT_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym115$ACCEPT_EDGE, $sym239$CYC_GRAPH, $list12, $list116, $list246 );
    methods.subloop_register_instance_method( $sym239$CYC_GRAPH, $sym115$ACCEPT_EDGE, $sym247$CYC_GRAPH_ACCEPT_EDGE_METHOD );
    methods.methods_incorporate_instance_method( $sym248$INTERPOLATE_NODE, $sym239$CYC_GRAPH, $list63, $list249, $list250 );
    methods.subloop_register_instance_method( $sym239$CYC_GRAPH, $sym248$INTERPOLATE_NODE, $sym253$CYC_GRAPH_INTERPOLATE_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym254$INTERPOLATE_CYC_TERM, $sym239$CYC_GRAPH, $list63, $list255, $list256 );
    methods.subloop_register_instance_method( $sym239$CYC_GRAPH, $sym254$INTERPOLATE_CYC_TERM, $sym257$CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_graph_file();
  }

  @Override
  public void initializeVariables()
  {
    init_graph_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_graph_file();
  }
  static
  {
    me = new graph();
    $sym0$GRAPH_NODE = makeSymbol( "GRAPH-NODE" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "CORE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ID" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LABEL" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ID" ), ConsesLow.list(
            makeSymbol( "NUM" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CORE" ), ConsesLow.list( makeSymbol( "OBJ" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LABEL" ), ConsesLow.list( makeSymbol( "STR" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "GET-LABEL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CORE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ID" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym3$LABEL = makeSymbol( "LABEL" );
    $sym4$ID = makeSymbol( "ID" );
    $sym5$CORE = makeSymbol( "CORE" );
    $sym6$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym7$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-CLASS" );
    $sym8$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym9$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym10$SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-INSTANCE" );
    $sym11$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list12 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list13 = ConsesLow.list( makeString( "@return a new GRAPH-NODE" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym14$GRAPH_NODE_INITIALIZE_METHOD = makeSymbol( "GRAPH-NODE-INITIALIZE-METHOD" );
    $sym15$SET_ID = makeSymbol( "SET-ID" );
    $list16 = ConsesLow.list( makeSymbol( "NUM" ) );
    $list17 = ConsesLow.list( makeString( "@param NUM integerp\n   @return graph-node-p\n   Sets the id of this object to NUM" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUM" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ID" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $sym19$INTEGERP = makeSymbol( "INTEGERP" );
    $sym20$GRAPH_NODE_SET_ID_METHOD = makeSymbol( "GRAPH-NODE-SET-ID-METHOD" );
    $sym21$SET_CORE = makeSymbol( "SET-CORE" );
    $list22 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "GRAPH" ) );
    $list23 = ConsesLow.list( makeString( "@param OBJECT anything atall\n   @return graph-node-p\n   Sets the core of this object to OBJECT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CORE" ), makeSymbol(
        "OBJECT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "GRAPH-P" ), makeSymbol( "GRAPH" ) ), ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
            makeSymbol( "GRAPH" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORE-NODE-MAP" ) ) ), makeSymbol( "CORE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $sym25$CORE_NODE_MAP = makeSymbol( "CORE-NODE-MAP" );
    $sym26$GRAPH_NODE_SET_CORE_METHOD = makeSymbol( "GRAPH-NODE-SET-CORE-METHOD" );
    $sym27$SET_LABEL = makeSymbol( "SET-LABEL" );
    $list28 = ConsesLow.list( makeSymbol( "STRING" ) );
    $list29 = ConsesLow.list( makeString( "@param STRING stringp\n   @return graph-node-p\n   Sets the label of this object to STRING" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol(
        "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LABEL" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $sym31$STRINGP = makeSymbol( "STRINGP" );
    $sym32$GRAPH_NODE_SET_LABEL_METHOD = makeSymbol( "GRAPH-NODE-SET-LABEL-METHOD" );
    $sym33$GET_LABEL = makeSymbol( "GET-LABEL" );
    $list34 = ConsesLow.list( makeString( "@return stringp\n   Returns the label of this object if it has one, otherwise the empty string." ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "LABEL" ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "LABEL" ) ), ConsesLow.list( makeSymbol( "RET" ), makeString( "" ) ) ) );
    $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $str36$ = makeString( "" );
    $sym37$GRAPH_NODE_GET_LABEL_METHOD = makeSymbol( "GRAPH-NODE-GET-LABEL-METHOD" );
    $sym38$GET_CORE = makeSymbol( "GET-CORE" );
    $list39 = ConsesLow.list( makeString( "@return anything\n   Returns the core of this object if it has one, otherwise nil" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CORE" ) ) );
    $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $sym41$GRAPH_NODE_GET_CORE_METHOD = makeSymbol( "GRAPH-NODE-GET-CORE-METHOD" );
    $sym42$GET_ID = makeSymbol( "GET-ID" );
    $list43 = ConsesLow.list( makeString( "@return integerp\n   Returns the id of this object if it has one, otherwise nil" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ID" ) ) );
    $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $sym45$GRAPH_NODE_GET_ID_METHOD = makeSymbol( "GRAPH-NODE-GET-ID-METHOD" );
    $sym46$PRINT = makeSymbol( "PRINT" );
    $list47 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list48 = ConsesLow.list( makeString( "Prints GRAPH-NODE to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString(
        "#<" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), makeSymbol(
            "STREAM" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "ID" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ),
                makeString( "-" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~D" ), makeSymbol( "ID" ) ) ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ": " ),
                    makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol( "LABEL" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol(
                        "STREAM" ) ) );
    $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-NODE-METHOD" );
    $str50$__ = makeString( "#<" );
    $str51$_ = makeString( "-" );
    $str52$_D = makeString( "~D" );
    $str53$__ = makeString( ": " );
    $str54$_ = makeString( ">" );
    $sym55$GRAPH_NODE_PRINT_METHOD = makeSymbol( "GRAPH-NODE-PRINT-METHOD" );
    $sym56$GRAPH_EDGE = makeSymbol( "GRAPH-EDGE" );
    $list57 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "FROM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TO" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LABEL" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "MAKE-EDGE" ), ConsesLow.list(
            makeSymbol( "FROM-NODE" ), makeSymbol( "TO-NODE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FROM" ), ConsesLow.list( makeSymbol( "NUM" ) ),
                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TO" ), ConsesLow.list( makeSymbol( "NUM" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TO" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LABEL" ), ConsesLow.list( makeSymbol(
                        "STRING" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LABEL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), NIL, makeKeyword(
                                "PUBLIC" ) )
    } );
    $sym58$TO = makeSymbol( "TO" );
    $sym59$FROM = makeSymbol( "FROM" );
    $sym60$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-CLASS" );
    $sym61$SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-INSTANCE" );
    $sym62$MAKE_EDGE = makeSymbol( "MAKE-EDGE" );
    $list63 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list64 = ConsesLow.list( makeSymbol( "FROM-NODE" ), makeSymbol( "TO-NODE" ) );
    $list65 = ConsesLow.list( makeString(
        "@param TO-NODE graph-node-p\n   @param FROM-NODE graph-node-p\n   @return graph-edge-p if both nodes have appropriate ids and NIL otherwise.\n   Creates an edge object connecting TO-NODE to FROM-NODE" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TO-NODE" ), makeSymbol( "GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "FROM-NODE" ), makeSymbol( "GRAPH-NODE-P" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "FROM-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "ID" ) ) ) ), ConsesLow.list( makeSymbol( "TID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TO-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ) ), ConsesLow.list(
                makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                    makeSymbol( "NUMBERP" ), makeSymbol( "FID" ) ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "TID" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "SET-FROM" ) ), makeSymbol( "FID" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "SET-TO" ) ), makeSymbol( "TID" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-EDGE" ) ) ) ) );
    $sym66$GRAPH_NODE_P = makeSymbol( "GRAPH-NODE-P" );
    $sym67$SET_FROM = makeSymbol( "SET-FROM" );
    $sym68$SET_TO = makeSymbol( "SET-TO" );
    $sym69$GRAPH_EDGE_MAKE_EDGE_METHOD = makeSymbol( "GRAPH-EDGE-MAKE-EDGE-METHOD" );
    $list70 = ConsesLow.list( makeString( "@return a new graph-edge object" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym71$GRAPH_EDGE_INITIALIZE_METHOD = makeSymbol( "GRAPH-EDGE-INITIALIZE-METHOD" );
    $list72 = ConsesLow.list( makeString( "@param NUM integerp\n   @return graph-edge-p\n   Sets the 'from' slot of this object to NUM" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUM" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FROM" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $sym74$GRAPH_EDGE_SET_FROM_METHOD = makeSymbol( "GRAPH-EDGE-SET-FROM-METHOD" );
    $list75 = ConsesLow.list( makeString( "@param NUM integerp\n   @return graph-edge-p\n   Sets the 'to' slot of this object to NUM" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUM" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TO" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $sym77$GRAPH_EDGE_SET_TO_METHOD = makeSymbol( "GRAPH-EDGE-SET-TO-METHOD" );
    $sym78$GET_FROM = makeSymbol( "GET-FROM" );
    $list79 = ConsesLow.list( makeString( "@return integer-p; the id of the node at from-end of this edge" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FROM" ) ) );
    $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $sym81$GRAPH_EDGE_GET_FROM_METHOD = makeSymbol( "GRAPH-EDGE-GET-FROM-METHOD" );
    $sym82$GET_TO = makeSymbol( "GET-TO" );
    $list83 = ConsesLow.list( makeString( "@return integer-p; the id of the node at to-end of this edge" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TO" ) ) );
    $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $sym85$GRAPH_EDGE_GET_TO_METHOD = makeSymbol( "GRAPH-EDGE-GET-TO-METHOD" );
    $list86 = ConsesLow.list( makeString( "@param STRING stringp\n   @return graph-edge-p\n   Sets the label slot of this object to STRING" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ),
        makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LABEL" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $sym88$GRAPH_EDGE_SET_LABEL_METHOD = makeSymbol( "GRAPH-EDGE-SET-LABEL-METHOD" );
    $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $sym90$GRAPH_EDGE_GET_LABEL_METHOD = makeSymbol( "GRAPH-EDGE-GET-LABEL-METHOD" );
    $list91 = ConsesLow.list( new SubLObject[] { makeString( "@param STREAM streamp\n   @param DEPTH integerp\n   Prints this GRAPH-EDGE to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol(
        "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list(
            makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ": " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
                "WRITE-STRING" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), ConsesLow.list( makeSymbol( "PRIN1-TO-STRING" ), makeSymbol( "FROM" ) ), makeString( "--" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list(
                    makeSymbol( "WRITE-STRING" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~A" ), makeSymbol( "LABEL" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
                        ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "->" ), ConsesLow.list( makeSymbol( "PRIN1-TO-STRING" ), makeSymbol( "TO" ) ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
                            "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) )
    } );
    $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-EDGE-METHOD" );
    $str93$__ = makeString( "--" );
    $str94$_A = makeString( "~A" );
    $str95$__ = makeString( "->" );
    $sym96$GRAPH_EDGE_PRINT_METHOD = makeSymbol( "GRAPH-EDGE-PRINT-METHOD" );
    $sym97$GRAPH = makeSymbol( "GRAPH" );
    $list98 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "NAME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INTEGER-SEQUENCE-GENERATOR" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LABEL-NODE-MAP" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NODES" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LABEL-EDGE-MAP" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "EDGES-SOURCE" ), makeKeyword(
                "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "EDGES-TARGET" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CORE-NODE-MAP" ),
                    makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "ACCEPT-NODE" ), ConsesLow.list( makeSymbol( "NEW-NODE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "ACCEPT-EDGE" ), ConsesLow.list( makeSymbol( "NEW-NODE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-NODE" ), ConsesLow.list(
                                makeSymbol( "NEW-NODE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-EDGE" ), ConsesLow.list( makeSymbol( "EDGE" ) ), makeKeyword(
                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-EDGE" ), ConsesLow.list( makeSymbol( "EDGE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-EDGES-FROM" ), ConsesLow.list( makeSymbol( "ID" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-EDGES-TO" ), ConsesLow.list( makeSymbol( "ID" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                makeSymbol( "GET-EDGES-FROM-NODE" ), ConsesLow.list( makeSymbol( "NODE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                    "GET-EDGES-TO-NODE" ), ConsesLow.list( makeSymbol( "NODE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                        "GET-PATH-LABELS" ), ConsesLow.list( makeSymbol( "TERMS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                            "COLLECT-ASCENDING" ), ConsesLow.list( makeSymbol( "NODE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                "COLLECT-ALL-ASCENDING" ), ConsesLow.list( makeSymbol( "NODE-LIST" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym99$EDGES_TARGET = makeSymbol( "EDGES-TARGET" );
    $sym100$EDGES_SOURCE = makeSymbol( "EDGES-SOURCE" );
    $sym101$LABEL_EDGE_MAP = makeSymbol( "LABEL-EDGE-MAP" );
    $sym102$NODES = makeSymbol( "NODES" );
    $sym103$LABEL_NODE_MAP = makeSymbol( "LABEL-NODE-MAP" );
    $sym104$INTEGER_SEQUENCE_GENERATOR = makeSymbol( "INTEGER-SEQUENCE-GENERATOR" );
    $sym105$NAME = makeSymbol( "NAME" );
    $sym106$SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GRAPH-CLASS" );
    $sym107$SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GRAPH-INSTANCE" );
    $list108 = ConsesLow.list( new SubLObject[] { makeString( "@return a new graph object" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "INTEGER-SEQUENCE-GENERATOR" ), ConsesLow.list( makeSymbol( "NEW-INTEGER-SEQUENCE-GENERATOR" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NODES" ), ConsesLow.list( makeSymbol(
            "NEW-DICTIONARY" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "EDGES-SOURCE" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "EDGES-TARGET" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LABEL-NODE-MAP" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list(
                    makeSymbol( "FUNCTION" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LABEL-EDGE-MAP" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                        EQUAL ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CORE-NODE-MAP" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ) ), ConsesLow
                            .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } );
    $sym109$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym110$GRAPH_INITIALIZE_METHOD = makeSymbol( "GRAPH-INITIALIZE-METHOD" );
    $sym111$ACCEPT_NODE = makeSymbol( "ACCEPT-NODE" );
    $list112 = ConsesLow.list( makeSymbol( "NEW-NODE" ) );
    $list113 = ConsesLow.list( makeString( "@param NEW-NODE graph-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph object, NIL otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "GRAPH-NODE-P" ), makeSymbol( "NEW-NODE" ) ) ) );
    $sym114$GRAPH_ACCEPT_NODE_METHOD = makeSymbol( "GRAPH-ACCEPT-NODE-METHOD" );
    $sym115$ACCEPT_EDGE = makeSymbol( "ACCEPT-EDGE" );
    $list116 = ConsesLow.list( makeSymbol( "NEW-EDGE" ) );
    $list117 = ConsesLow.list( makeString( "@param NEW-EDGE graph-edge-p\n   @return boolean, T if NEW-EDGE is acceptable for this graph object, NIL otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "GRAPH-EDGE-P" ), makeSymbol( "NEW-EDGE" ) ) ) );
    $sym118$GRAPH_ACCEPT_EDGE_METHOD = makeSymbol( "GRAPH-ACCEPT-EDGE-METHOD" );
    $sym119$ADD_NODE = makeSymbol( "ADD-NODE" );
    $list120 = ConsesLow.list( makeString( "@param NEW-NODE graph-node-p\n   @return graph-p\n   Adds NEW-NODE to this graph object" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ACCEPT-NODE" ) ), makeSymbol( "NEW-NODE" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%Cannot add node ~S" ), makeSymbol(
            "NEW-NODE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ) ), ConsesLow.list( makeSymbol( "NODE-LABEL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-NODE" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LABEL" ) ) ) ), ConsesLow.list( makeSymbol( "NODE-CORE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-NODE" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "GET-CORE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NODE-ID" ), ConsesLow
                            .list( makeSymbol( "INTEGER-SEQUENCE-GENERATOR-NEXT" ), makeSymbol( "INTEGER-SEQUENCE-GENERATOR" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-NODE" ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "SET-ID" ) ), makeSymbol( "NODE-ID" ) ) ), ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "NODES" ), makeSymbol( "NODE-ID" ), makeSymbol(
                                    "NEW-NODE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NODE-LABEL" ), ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "LABEL-NODE-MAP" ), makeSymbol(
                                        "NODE-LABEL" ), makeSymbol( "NEW-NODE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NODE-CORE" ), ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol(
                                            "CORE-NODE-MAP" ), makeSymbol( "NODE-CORE" ), makeSymbol( "NEW-NODE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym121$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $str122$__Cannot_add_node__S = makeString( "~%Cannot add node ~S" );
    $sym123$GRAPH_ADD_NODE_METHOD = makeSymbol( "GRAPH-ADD-NODE-METHOD" );
    $sym124$GET_NODE_BY_ID = makeSymbol( "GET-NODE-BY-ID" );
    $list125 = ConsesLow.list( makeSymbol( "ID" ) );
    $list126 = ConsesLow.list( makeString( "@param ID integerp\n   @return graph-node-p\n   Returns the node in this graph which has ID as its id, if any." ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol(
        "ID" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "NODES" ), makeSymbol( "ID" ) ) ) );
    $sym127$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym128$GRAPH_GET_NODE_BY_ID_METHOD = makeSymbol( "GRAPH-GET-NODE-BY-ID-METHOD" );
    $sym129$GET_NODE_BY_LABEL = makeSymbol( "GET-NODE-BY-LABEL" );
    $list130 = ConsesLow.list( makeString( "@param STRING stringp\n   @return graph-node-p\n   Returns the node in this graph which has STRING as its label, if any." ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ),
        makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "LABEL-NODE-MAP" ), makeSymbol( "STRING" ) ) ) );
    $sym131$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym132$GRAPH_GET_NODE_BY_LABEL_METHOD = makeSymbol( "GRAPH-GET-NODE-BY-LABEL-METHOD" );
    $sym133$GET_NODE_BY_CORE = makeSymbol( "GET-NODE-BY-CORE" );
    $list134 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list135 = ConsesLow.list( makeString( "@param OBJECT\n   @return graph-node-p\n   Returns the node in this graph which has OBJECT as its core, if any." ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "CORE-NODE-MAP" ), makeSymbol( "OBJECT" ) ) ) );
    $sym136$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym137$GRAPH_GET_NODE_BY_CORE_METHOD = makeSymbol( "GRAPH-GET-NODE-BY-CORE-METHOD" );
    $sym138$ADD_EDGE = makeSymbol( "ADD-EDGE" );
    $list139 = ConsesLow.list( makeString( "@param NEW-EDGE graph-edge-p\n   @return graph-p\n   Adds NEW-EDGE to this " ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ACCEPT-EDGE" ) ), makeSymbol( "NEW-EDGE" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%Cannot add edge ~S" ), makeSymbol( "NEW-EDGE" ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LABEL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-EDGE" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LABEL" ) ) ) ), ConsesLow.list( makeSymbol( "SOURCE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "FROM" ) ) ) ), ConsesLow.list( makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "TO" ) ) ) ) ), ConsesLow.list( makeSymbol( "DICTIONARY-PUSH" ), makeSymbol( "EDGES-SOURCE" ), makeSymbol( "SOURCE" ), makeSymbol( "NEW-EDGE" ) ), ConsesLow.list( makeSymbol( "DICTIONARY-PUSH" ),
                        makeSymbol( "EDGES-TARGET" ), makeSymbol( "TARGET" ), makeSymbol( "NEW-EDGE" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "EMPTY-STRING-P" ), makeSymbol( "LABEL" ) ),
                            ConsesLow.list( makeSymbol( "DICTIONARY-PUSH" ), makeSymbol( "LABEL-EDGE-MAP" ), makeSymbol( "LABEL" ), makeSymbol( "NEW-EDGE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                "SELF" ) ) );
    $sym140$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $str141$__Cannot_add_edge__S = makeString( "~%Cannot add edge ~S" );
    $sym142$GRAPH_ADD_EDGE_METHOD = makeSymbol( "GRAPH-ADD-EDGE-METHOD" );
    $sym143$REMOVE_EDGE = makeSymbol( "REMOVE-EDGE" );
    $list144 = ConsesLow.list( makeSymbol( "EDGE" ) );
    $list145 = ConsesLow.list( makeString( "@param EDGE graph-edge-p\n   @return graph-p\n   Removes EDGE from this " ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "EDGE" ), makeSymbol( "GRAPH-EDGE-P" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LABEL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-LABEL" ) ) ) ), ConsesLow.list( makeSymbol( "SOURCE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FROM" ) ) ) ), ConsesLow.list(
                makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TO" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "DICTIONARY-REMOVE" ), makeSymbol( "EDGES-SOURCE" ), makeSymbol( "SOURCE" ) ), ConsesLow.list( makeSymbol( "DICTIONARY-REMOVE" ), makeSymbol( "EDGES-TARGET" ), makeSymbol( "TARGET" ) ), ConsesLow
                        .list( makeSymbol( "DICTIONARY-REMOVE" ), makeSymbol( "LABEL-EDGE-MAP" ), makeSymbol( "LABEL" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym146$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym147$GRAPH_EDGE_P = makeSymbol( "GRAPH-EDGE-P" );
    $sym148$GRAPH_REMOVE_EDGE_METHOD = makeSymbol( "GRAPH-REMOVE-EDGE-METHOD" );
    $sym149$GET_EDGES_FROM = makeSymbol( "GET-EDGES-FROM" );
    $list150 = ConsesLow.list( makeString( "@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph starting at node with id ID" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "ID" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "EDGES-SOURCE" ), makeSymbol( "ID" ) ) ) );
    $sym151$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym152$GRAPH_GET_EDGES_FROM_METHOD = makeSymbol( "GRAPH-GET-EDGES-FROM-METHOD" );
    $sym153$GET_EDGES_TO = makeSymbol( "GET-EDGES-TO" );
    $list154 = ConsesLow.list( makeString( "@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph pointing at node with id ID" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "ID" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "EDGES-TARGET" ), makeSymbol( "ID" ) ) ) );
    $sym155$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym156$GRAPH_GET_EDGES_TO_METHOD = makeSymbol( "GRAPH-GET-EDGES-TO-METHOD" );
    $sym157$GET_EDGES_FROM_NODE = makeSymbol( "GET-EDGES-FROM-NODE" );
    $list158 = ConsesLow.list( makeSymbol( "NODE" ) );
    $list159 = ConsesLow.list( makeString( "@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph starting at node with id ID" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "NODE" ), makeSymbol( "GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ID" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol(
                "EDGES-SOURCE" ), makeSymbol( "NODE-ID" ) ) ) ) );
    $sym160$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym161$GRAPH_GET_EDGES_FROM_NODE_METHOD = makeSymbol( "GRAPH-GET-EDGES-FROM-NODE-METHOD" );
    $sym162$GET_EDGES_TO_NODE = makeSymbol( "GET-EDGES-TO-NODE" );
    $list163 = ConsesLow.list( makeString( "@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph pointing at node with id ID" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "NODE" ), makeSymbol( "GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ID" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol(
                "EDGES-TARGET" ), makeSymbol( "NODE-ID" ) ) ) ) );
    $sym164$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym165$GRAPH_GET_EDGES_TO_NODE_METHOD = makeSymbol( "GRAPH-GET-EDGES-TO-NODE-METHOD" );
    $sym166$GET_NODES_FROM_NODE = makeSymbol( "GET-NODES-FROM-NODE" );
    $list167 = ConsesLow.list( makeString( "@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the child-nodes of this graph starting at node with id ID" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "NODE" ), makeSymbol( "GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
            ConsesLow.list( makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-EDGES-FROM-NODE" ) ), makeSymbol( "NODE" ) ) ),
            ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-TO" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "NODES" ), makeSymbol( "NODE-ID" ) ), makeSymbol( "RESULT" ) ) ) ), ConsesLow
                    .list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym168$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym169$GRAPH_GET_NODES_FROM_NODE_METHOD = makeSymbol( "GRAPH-GET-NODES-FROM-NODE-METHOD" );
    $sym170$GET_NODES_TO_NODE = makeSymbol( "GET-NODES-TO-NODE" );
    $list171 = ConsesLow.list( makeString( "@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the parent nodes of this graph starting at node with id ID" ), ConsesLow.list(
        makeSymbol( "CHECK-TYPE" ), makeSymbol( "NODE" ), makeSymbol( "GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol(
            "CDOLIST" ), ConsesLow.list( makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-EDGES-TO-NODE" ) ) ) ), ConsesLow.list(
                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-TO" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "NODES" ), makeSymbol( "NODE-ID" ) ), makeSymbol( "RESULT" ) ) ) ), ConsesLow
                        .list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym172$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym173$GRAPH_GET_NODES_TO_NODE_METHOD = makeSymbol( "GRAPH-GET-NODES-TO-NODE-METHOD" );
    $sym174$GET_PATH_LABELS = makeSymbol( "GET-PATH-LABELS" );
    $list175 = ConsesLow.list( makeSymbol( "TERMS" ) );
    $list176 = ConsesLow.list( makeString( "@param TERMS listp; a list of strings whose connecting graph labels are to be returned\n   @return listp; the list of strings that connect TERMS in this graph" ), ConsesLow
        .list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TERMS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TARGET-NODES" ), NIL ), ConsesLow.list(
            makeSymbol( "ASCENDING-LABELS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TERMS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                makeSymbol( "TOKEN" ), ConsesLow.list( makeSymbol( "SPLIT-STRING" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NODE" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NODE-BY-LABEL" ) ), makeSymbol( "TOKEN" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                        .list( makeSymbol( "GRAPH-NODE-P" ), makeSymbol( "NODE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "NODE" ), makeSymbol( "TARGET-NODES" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                            "CDOLIST" ), ConsesLow.list( makeSymbol( "ASCENDING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "COLLECT-ALL-ASCENDING" ) ), makeSymbol( "TARGET-NODES" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "ASCENDING" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "LABEL" ) ) ), makeSymbol( "ASCENDING-LABELS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ASCENDING-LABELS" ) ) ) );
    $sym177$LISTP = makeSymbol( "LISTP" );
    $sym178$COLLECT_ALL_ASCENDING = makeSymbol( "COLLECT-ALL-ASCENDING" );
    $sym179$GRAPH_GET_PATH_LABELS_METHOD = makeSymbol( "GRAPH-GET-PATH-LABELS-METHOD" );
    $sym180$COLLECT_ASCENDING = makeSymbol( "COLLECT-ASCENDING" );
    $list181 = ConsesLow.list( makeString( "@param NODE graph-node-p\n   @return list of graph-node-p\n   Returns the list of all nodes in this graph from which NODE can be reached\n   following the graph's edges." ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NODE" ), makeSymbol( "GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MARKS" ), ConsesLow.list(
            makeSymbol( "MAKE-HASH-TABLE" ), EIGHT_INTEGER ) ), ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "ID" ) ) ) ), ConsesLow.list( makeSymbol( "EDGES" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "EDGES-TARGET" ), makeSymbol( "NODE-ID" ) ) ), makeSymbol( "COLLECTED-NODES" ) ),
            ConsesLow.list( makeSymbol( "SETHASH" ), makeSymbol( "NODE-ID" ), makeSymbol( "MARKS" ), T ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "EDGES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                .list( ConsesLow.list( makeSymbol( "TOP-EDGE" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "EDGES" ) ) ), ConsesLow.list( makeSymbol( "OTHER-EDGES" ), ConsesLow.list( makeSymbol( "CDR" ),
                    makeSymbol( "EDGES" ) ) ), ConsesLow.list( makeSymbol( "FROM-NODE-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TOP-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "FROM" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "FROM-NODE-ID" ), makeSymbol( "MARKS" ) ), ConsesLow.list( makeSymbol(
                            "CSETQ" ), makeSymbol( "EDGES" ), makeSymbol( "OTHER-EDGES" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "SETHASH" ), makeSymbol( "FROM-NODE-ID" ), makeSymbol( "MARKS" ), T ),
                                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "EDGES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "EDGES-TARGET" ),
                                    makeSymbol( "FROM-NODE-ID" ) ), makeSymbol( "OTHER-EDGES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOHASH" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ),
                                        makeSymbol( "MARKS" ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ),
                                            makeSymbol( "NODES" ), makeSymbol( "KEY" ) ), makeSymbol( "COLLECTED-NODES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COLLECTED-NODES" ) ) ) );
    $sym182$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym183$GRAPH_COLLECT_ASCENDING_METHOD = makeSymbol( "GRAPH-COLLECT-ASCENDING-METHOD" );
    $list184 = ConsesLow.list( makeSymbol( "NODE-LIST" ) );
    $list185 = ConsesLow.list( makeString(
        "@param NODE-LIST listp of graph-node-p\n   @return list of graph-node-p\n   Returns the list of all nodes in this graph from which any NODE in NODE-LIST can be reached\n   following the graph's edges." ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NODE-LIST" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MARKS" ), ConsesLow.list(
            makeSymbol( "MAKE-HASH-TABLE" ), EIGHT_INTEGER ) ), ConsesLow.list( makeSymbol( "EDGES" ), NIL ), ConsesLow.list( makeSymbol( "COLLECTED-NODES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow
                .list( makeSymbol( "NODE" ), makeSymbol( "NODE-LIST" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "GRAPH-NODE-P" ), makeSymbol( "NODE" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ) ) ), ConsesLow
                        .list( makeSymbol( "CSETQ" ), makeSymbol( "EDGES" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "EDGES-TARGET" ), makeSymbol(
                            "NODE-ID" ) ), makeSymbol( "EDGES" ) ) ), ConsesLow.list( makeSymbol( "SETHASH" ), makeSymbol( "NODE-ID" ), makeSymbol( "MARKS" ), T ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol(
                                "EDGES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TOP-EDGE" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "EDGES" ) ) ), ConsesLow.list(
                                    makeSymbol( "OTHER-EDGES" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "EDGES" ) ) ), ConsesLow.list( makeSymbol( "FROM-NODE-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                                        makeSymbol( "TOP-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FROM" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                            "GETHASH" ), makeSymbol( "FROM-NODE-ID" ), makeSymbol( "MARKS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "EDGES" ), makeSymbol( "OTHER-EDGES" ) ) ), ConsesLow
                                                .list( T, ConsesLow.list( makeSymbol( "SETHASH" ), makeSymbol( "FROM-NODE-ID" ), makeSymbol( "MARKS" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "EDGES" ),
                                                    ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "EDGES-TARGET" ), makeSymbol( "FROM-NODE-ID" ) ), makeSymbol(
                                                        "OTHER-EDGES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOHASH" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "MARKS" ) ), ConsesLow
                                                            .list( makeSymbol( "IGNORE" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol(
                                                                "NODES" ), makeSymbol( "KEY" ) ), makeSymbol( "COLLECTED-NODES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COLLECTED-NODES" ) ) ) );
    $sym186$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $sym187$GRAPH_COLLECT_ALL_ASCENDING_METHOD = makeSymbol( "GRAPH-COLLECT-ALL-ASCENDING-METHOD" );
    $list188 = ConsesLow.list( makeString( "@param STREAM streamp\n   @param DEPTH integerp\n   Prints this GRAPH to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow
        .list( makeSymbol( "WRITE-STRING" ), makeString( "#<" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol(
            "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ": " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
                "WRITE-STRING" ), ConsesLow.list( makeSymbol( "PRIN1-TO-STRING" ), ConsesLow.list( makeSymbol( "DICTIONARY-LENGTH" ), makeSymbol( "NODES" ) ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
                    "WRITE-STRING" ), makeString( " nodes" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ) );
    $sym189$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $str190$_nodes = makeString( " nodes" );
    $sym191$GRAPH_PRINT_METHOD = makeSymbol( "GRAPH-PRINT-METHOD" );
    $sym192$PPRINT = makeSymbol( "PPRINT" );
    $list193 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STREAM" ), T ) );
    $list194 = ConsesLow.list( makeString( "@param STREAM streamp\n   Pretty prints this GRAPH to STREAM, showing the contents of its nodes\n   and how they link to one another." ), ConsesLow.list( makeSymbol(
        "WRITE-STRING" ), makeString( "#<" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol(
            "SELF" ) ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "DO-DICTIONARY" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "NODE-FROM" ), makeSymbol( "NODES" ) ), ConsesLow.list( makeSymbol(
                "WRITE-STRING" ), makeSymbol( "*NEW-LINE-STRING*" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NODE-FROM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "PRINT" ) ), makeSymbol( "STREAM" ), NIL ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "*NEW-LINE-STRING*" ), makeString( "   " ) ),
                        makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EDGES" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol(
                            "EDGES-SOURCE" ), makeSymbol( "KEY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "EDGE" ), makeSymbol( "EDGES" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-TO" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "NODES" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                                    "EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TO" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( " " ), makeSymbol( "STREAM" ) ), ConsesLow
                                        .list( makeSymbol( "FIM" ), makeSymbol( "NODE-TO" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRINT" ) ), makeSymbol( "STREAM" ), NIL ) ) ) ) ), ConsesLow.list(
                                            makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ) );
    $sym195$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GRAPH-METHOD" );
    $str196$___ = makeString( "   " );
    $str197$_ = makeString( " " );
    $sym198$GRAPH_PPRINT_METHOD = makeSymbol( "GRAPH-PPRINT-METHOD" );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "GRAPH" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym200$GRAPH_VAR = makeUninternedSymbol( "GRAPH-VAR" );
    $sym201$CLET = makeSymbol( "CLET" );
    $sym202$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym203$KEY = makeSymbol( "KEY" );
    $sym204$GET_SLOT = makeSymbol( "GET-SLOT" );
    $list205 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NODES" ) ) );
    $list206 = ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEY" ) );
    $sym207$CYC_GRAPH_NODE = makeSymbol( "CYC-GRAPH-NODE" );
    $list208 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "MAKE-NODE" ), ConsesLow.list( makeSymbol( "CYC-TERM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "GENERATE-PHRASE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym209$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-CLASS" );
    $sym210$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-INSTANCE" );
    $sym211$MAKE_NODE = makeSymbol( "MAKE-NODE" );
    $list212 = ConsesLow.list( makeSymbol( "CYC-TERM" ) );
    $list213 = ConsesLow.list( makeString( "@param CYC-TERM a Cyc term\n   @return cyc-graph-node-p, a node with CYC-TERM as its core" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "NEW-NODE" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "SET-CORE" ) ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-LABEL" ) ), ConsesLow.list( makeSymbol(
                "FIM" ), makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GENERATE-PHRASE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-NODE" ) ) ) );
    $sym214$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $sym215$CYC_GRAPH_NODE_MAKE_NODE_METHOD = makeSymbol( "CYC-GRAPH-NODE-MAKE-NODE-METHOD" );
    $list216 = ConsesLow.list( makeSymbol( "CYC-TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "GRAPH" ) );
    $list217 = ConsesLow.list( makeString( "@param CYC-TERM a Cyc term\n   @return cyc-graph-node-p, a node with CYC-TERM as its core" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "CYC-TERM" ), makeSymbol(
        "CLOSED-TERM?" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-CORE" ) ),
            makeSymbol( "CYC-TERM" ), makeSymbol( "GRAPH" ) ) ) );
    $sym218$CLOSED_TERM_ = makeSymbol( "CLOSED-TERM?" );
    $sym219$CYC_GRAPH_NODE_SET_CORE_METHOD = makeSymbol( "CYC-GRAPH-NODE-SET-CORE-METHOD" );
    $list220 = ConsesLow.list( makeString( "@return stringp, an English string denoting the concept at the core\n   of this node." ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GENERATE-PHRASE" ),
        makeSymbol( "CORE" ) ) ) );
    $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-GRAPH-NODE-METHOD" );
    $sym222$CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD = makeSymbol( "CYC-GRAPH-NODE-GENERATE-PHRASE-METHOD" );
    $sym223$CYC_GRAPH_EDGE = makeSymbol( "CYC-GRAPH-EDGE" );
    $list224 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "MAKE-EDGE" ), ConsesLow
        .list( makeSymbol( "FROM-NODE" ), makeSymbol( "TO-NODE" ), makeSymbol( "PRED" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym225$PREDICATE = makeSymbol( "PREDICATE" );
    $sym226$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-CLASS" );
    $sym227$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-INSTANCE" );
    $list228 = ConsesLow.list( makeSymbol( "FROM-NODE" ), makeSymbol( "TO-NODE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PRED" ), constant_handles.reader_make_constant_shell( makeString(
        "genls" ) ) ) );
    $list229 = ConsesLow.list( makeString(
        "@param TO-NODE cyc-graph-node-p\n   @param FROM-NODE cyc-graph-node-p\n   @param PREDICATE predicate-p, the CycL predicate that represents the semantics\n   of this edge\n   @return graph-edge-p if both nodes have appropriate ids and NIL otherwise.\n   Creates an edge object connecting TO-NODE to FROM-NODE" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TO-NODE" ), makeSymbol( "CYC-GRAPH-NODE-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "FROM-NODE" ), makeSymbol( "CYC-GRAPH-NODE-P" ) ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PRED" ), makeSymbol( "PREDICATE?" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FID" ), ConsesLow.list(
            makeSymbol( "GET-SLOT" ), makeSymbol( "FROM-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ) ), ConsesLow.list( makeSymbol( "TID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                "TO-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ) ), ConsesLow.list( makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "CYC-GRAPH-EDGE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "FID" ) ),
                        ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "TID" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-FROM" ) ),
                            makeSymbol( "FID" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-TO" ) ), makeSymbol( "TID" ) ), ConsesLow.list(
                                makeSymbol( "FIM" ), makeSymbol( "NEW-EDGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-PREDICATE" ) ), makeSymbol( "PRED" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                    makeSymbol( "NEW-EDGE" ) ) ) ) );
    $const230$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym231$CYC_GRAPH_NODE_P = makeSymbol( "CYC-GRAPH-NODE-P" );
    $sym232$PREDICATE_ = makeSymbol( "PREDICATE?" );
    $sym233$SET_PREDICATE = makeSymbol( "SET-PREDICATE" );
    $sym234$CYC_GRAPH_EDGE_MAKE_EDGE_METHOD = makeSymbol( "CYC-GRAPH-EDGE-MAKE-EDGE-METHOD" );
    $list235 = ConsesLow.list( makeSymbol( "PRED" ) );
    $list236 = ConsesLow.list( makeString( "@param PRED a predicate?\n   @return cyc-graph-edge-p\n   sets the predicate of this edge" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PRED" ), makeSymbol(
        "PREDICATE?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREDICATE" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-GRAPH-EDGE-METHOD" );
    $sym238$CYC_GRAPH_EDGE_SET_PREDICATE_METHOD = makeSymbol( "CYC-GRAPH-EDGE-SET-PREDICATE-METHOD" );
    $sym239$CYC_GRAPH = makeSymbol( "CYC-GRAPH" );
    $list240 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INTERPOLATE-NODE" ), ConsesLow.list( makeSymbol( "NEW-NODE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
        "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) ) ), makeKeyword( "PUBLIC" ) ) );
    $sym241$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-CLASS" );
    $sym242$SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-INSTANCE" );
    $const243$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list244 = ConsesLow.list( makeString( "@param NEW-NODE cyc-graph-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph object, NIL otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "CYC-GRAPH-NODE-P" ), makeSymbol( "NEW-NODE" ) ) ) );
    $sym245$CYC_GRAPH_ACCEPT_NODE_METHOD = makeSymbol( "CYC-GRAPH-ACCEPT-NODE-METHOD" );
    $list246 = ConsesLow.list( makeString( "@param NEW-EDGE graph-edge-p\n   @return boolean, T if NEW-EDGE is acceptable for this graph object, NIL otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "CYC-GRAPH-EDGE-P" ), makeSymbol( "NEW-EDGE" ) ) ) );
    $sym247$CYC_GRAPH_ACCEPT_EDGE_METHOD = makeSymbol( "CYC-GRAPH-ACCEPT-EDGE-METHOD" );
    $sym248$INTERPOLATE_NODE = makeSymbol( "INTERPOLATE-NODE" );
    $list249 = ConsesLow.list( makeSymbol( "NEW-NODE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) ) );
    $list250 = ConsesLow.list( makeString(
        "@param NEW-NODE, cyc-graph-node-p\n   @param PREDICATE, predicate?\n   @return cyc-graph-p\n   Finds all nodes of this graph whose cores are immediate ancestors of the core \n   of NEW-NODE and creates an edge from them to NEW-NODE. Finds all nodes of this \n   graph whose cores are immediate specs of the core of NEW-NODE and creates an \n   edge from NEW-NODE to them. Removes all edges from ancestors to specs that can\n   now be accounted by edges that run through NEW-NODE. The notion of ancestor is\n   parameterized by PREDICATE." ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NODE-BY-CORE" ) ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORE" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "ADD-NODE" ) ), makeSymbol( "NEW-NODE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADOPTED-CHILDREN" ), NIL ), ConsesLow.list( makeSymbol(
                    "MOST-SPECIFIC-ANCESTORS" ), NIL ), ConsesLow.list( makeSymbol( "PRUNING-PRED" ), ConsesLow.list( makeSymbol( "GET-CYC-GRAPH-ANCESTOR-PRUNING-PREDICATE" ), makeSymbol( "PREDICATE" ) ) ) ), ConsesLow
                        .list( makeSymbol( "DO-DICTIONARY" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "OLD-NODE" ), makeSymbol( "NODES" ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEY" ) ),
                            ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQL, makeSymbol( "OLD-NODE" ), makeSymbol( "NEW-NODE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                                makeSymbol( "ARG-OLD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OLD-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORE" ) ) ) ), ConsesLow.list( makeSymbol(
                                    "ARG-NEW" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORE" ) ) ) ), ConsesLow.list( makeSymbol(
                                        "CANDIDATE-ANCESTOR" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "PREDICATE" ),
                                            makeSymbol( "ARG-NEW" ), makeSymbol( "ARG-OLD" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), makeSymbol( "ARG-OLD" ) ) ), ConsesLow.list(
                                                makeSymbol( "CANDIDATE-ADOPTEE" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "CYC-QUERY" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol(
                                                    "PREDICATE" ), makeSymbol( "ARG-OLD" ), makeSymbol( "ARG-NEW" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), makeSymbol(
                                                        "ARG-OLD" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MOST-SPECIFIC-ANCESTORS" ), ConsesLow.list( makeSymbol( "CHALLENGE-SET-WRT-PREDICATE" ),
                                                            makeSymbol( "MOST-SPECIFIC-ANCESTORS" ), makeSymbol( "CANDIDATE-ANCESTOR" ), makeSymbol( "PRUNING-PRED" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                makeSymbol( "ADOPTED-CHILDREN" ), ConsesLow.list( makeSymbol( "CHALLENGE-SET-WRT-PREDICATE" ), makeSymbol( "ADOPTED-CHILDREN" ), makeSymbol(
                                                                    "CANDIDATE-ADOPTEE" ), makeSymbol( "PRUNING-PRED" ), NIL ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ),
                                                                        makeSymbol( "MOST-SPECIFIC-ANCESTORS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "EDGE-FROM-ANCESTOR" ), ConsesLow
                                                                            .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-EDGES-FROM-NODE" ) ), ConsesLow.list(
                                                                                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NODE-BY-CORE" ) ), makeSymbol(
                                                                                    "ANCESTOR" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TO-ID" ), ConsesLow.list(
                                                                                        makeSymbol( "FIM" ), makeSymbol( "EDGE-FROM-ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-TO" ) ) ) ),
                                                                                        makeSymbol( "MATCH" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ADOPTEE" ), makeSymbol(
                                                                                            "ADOPTED-CHILDREN" ), makeSymbol( "MATCH" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MATCH" ), ConsesLow.list(
                                                                                                makeSymbol( "=" ), makeSymbol( "TO-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                                    makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NODE-BY-CORE" ) ), makeSymbol(
                                                                                                        "ADOPTEE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ID" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                            "PWHEN" ), makeSymbol( "MATCH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                                                                                                makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-EDGE" ) ), makeSymbol( "EDGE-FROM-ANCESTOR" ) ) ) ) ) ),
                    ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), makeSymbol( "MOST-SPECIFIC-ANCESTORS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                        makeSymbol( "ANCESTOR-NODE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NODE-BY-CORE" ) ), makeSymbol( "ANCESTOR" ) ) ) ),
                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-EDGE" ) ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "CYC-GRAPH-EDGE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAKE-EDGE" ) ), makeSymbol( "ANCESTOR-NODE" ), makeSymbol( "NEW-NODE" ), makeSymbol(
                                "PREDICATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ADOPTEE" ), makeSymbol( "ADOPTED-CHILDREN" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                    .list( ConsesLow.list( makeSymbol( "ADOPTEE-NODE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-NODE-BY-CORE" ) ), makeSymbol( "ADOPTEE" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-EDGE" ) ),
                                            ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYC-GRAPH-EDGE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                "MAKE-EDGE" ) ), makeSymbol( "NEW-NODE" ), makeSymbol( "ADOPTEE-NODE" ), makeSymbol( "PREDICATE" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                    "SELF" ) ) );
    $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYC-GRAPH-METHOD" );
    $const252$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym253$CYC_GRAPH_INTERPOLATE_NODE_METHOD = makeSymbol( "CYC-GRAPH-INTERPOLATE-NODE-METHOD" );
    $sym254$INTERPOLATE_CYC_TERM = makeSymbol( "INTERPOLATE-CYC-TERM" );
    $list255 = ConsesLow.list( makeSymbol( "CYC-TERM" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) ) );
    $list256 = ConsesLow.list( makeString(
        "@param CYC-TERM, closed-term?\n   @param PREDICATE, predicate?\n   @return cyc-graph-p\n   Given CYC-TERM, creates a new cyc-graph-node-p with it at its core and\n   interpolates the new node in the graph according to the relationship\n   specified in PREDICATE." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYC-GRAPH-NODE" ) ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAKE-NODE" ) ), makeSymbol( "CYC-TERM" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "INTERPOLATE-NODE" ) ), makeSymbol( "NEW-NODE" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym257$CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD = makeSymbol( "CYC-GRAPH-INTERPOLATE-CYC-TERM-METHOD" );
  }
}
/*
 * 
 * Total time: 1617 ms
 * 
 */