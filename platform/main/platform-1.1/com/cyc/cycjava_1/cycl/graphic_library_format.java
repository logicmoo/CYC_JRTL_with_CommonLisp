/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.inference.ask_utilities;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.xml_utilities;

public  final class graphic_library_format extends SubLTranslatedFile {

  //// Constructor

  private graphic_library_format() {}
  public static final SubLFile me = new graphic_library_format();
  public static final String myName = "com.cyc.cycjava_1.cycl.graphic_library_format";

  //// Definitions

  public static final class $glf_graph_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $types; }
    public SubLObject getField4() { return $ais; }
    public SubLObject getField5() { return $nodes; }
    public SubLObject getField6() { return $node_types; }
    public SubLObject getField7() { return $source_node; }
    public SubLObject getField8() { return $arcs; }
    public SubLObject getField9() { return $arc_types; }
    public SubLObject getField10() { return $incoming_connectors; }
    public SubLObject getField11() { return $outgoing_connectors; }
    public SubLObject getField12() { return $incoming_connector_types; }
    public SubLObject getField13() { return $outgoing_connector_types; }
    public SubLObject getField14() { return $rendering_info; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $types = value; }
    public SubLObject setField4(SubLObject value) { return $ais = value; }
    public SubLObject setField5(SubLObject value) { return $nodes = value; }
    public SubLObject setField6(SubLObject value) { return $node_types = value; }
    public SubLObject setField7(SubLObject value) { return $source_node = value; }
    public SubLObject setField8(SubLObject value) { return $arcs = value; }
    public SubLObject setField9(SubLObject value) { return $arc_types = value; }
    public SubLObject setField10(SubLObject value) { return $incoming_connectors = value; }
    public SubLObject setField11(SubLObject value) { return $outgoing_connectors = value; }
    public SubLObject setField12(SubLObject value) { return $incoming_connector_types = value; }
    public SubLObject setField13(SubLObject value) { return $outgoing_connector_types = value; }
    public SubLObject setField14(SubLObject value) { return $rendering_info = value; }
    public SubLObject $id = NIL;
    public SubLObject $types = NIL;
    public SubLObject $ais = NIL;
    public SubLObject $nodes = NIL;
    public SubLObject $node_types = NIL;
    public SubLObject $source_node = NIL;
    public SubLObject $arcs = NIL;
    public SubLObject $arc_types = NIL;
    public SubLObject $incoming_connectors = NIL;
    public SubLObject $outgoing_connectors = NIL;
    public SubLObject $incoming_connector_types = NIL;
    public SubLObject $outgoing_connector_types = NIL;
    public SubLObject $rendering_info = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($glf_graph_native.class, $sym0$GLF_GRAPH, $sym1$GLF_GRAPH_P, $list2, $list3, new String[] {"$id", "$types", "$ais", "$nodes", "$node_types", "$source_node", "$arcs", "$arc_types", "$incoming_connectors", "$outgoing_connectors", "$incoming_connector_types", "$outgoing_connector_types", "$rendering_info"}, $list4, $list5, $sym6$GLFGRPH_PRINT);
  }

  @SubL(source = "cycl/graphic-library-format.lisp", position = 1027) 
  public static SubLSymbol $dtp_glf_graph$ = null;

  @SubL(source = "cycl/graphic-library-format.lisp", position = 1027) 
  public static final SubLObject glf_graph_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6536");
    return NIL;
  }

  public static final class $glf_graph_p$UnaryFunction extends UnaryFunction {
    public $glf_graph_p$UnaryFunction() { super(extractFunctionNamed("GLF-GRAPH-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6482"); }
  }

  public static final class $glf_node_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $types; }
    public SubLObject getField4() { return $parent; }
    public SubLObject getField5() { return $semantics; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $types = value; }
    public SubLObject setField4(SubLObject value) { return $parent = value; }
    public SubLObject setField5(SubLObject value) { return $semantics = value; }
    public SubLObject $id = NIL;
    public SubLObject $types = NIL;
    public SubLObject $parent = NIL;
    public SubLObject $semantics = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($glf_node_native.class, $sym110$GLF_NODE, $sym111$GLF_NODE_P, $list112, $list113, new String[] {"$id", "$types", "$parent", "$semantics"}, $list114, $list115, $sym116$GLFNODE_PRINT);
  }

  @SubL(source = "cycl/graphic-library-format.lisp", position = 14506) 
  public static SubLSymbol $dtp_glf_node$ = null;

  @SubL(source = "cycl/graphic-library-format.lisp", position = 14506) 
  public static final SubLObject glf_node_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6543");
    return NIL;
  }

  public static final class $glf_node_p$UnaryFunction extends UnaryFunction {
    public $glf_node_p$UnaryFunction() { super(extractFunctionNamed("GLF-NODE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6483"); }
  }

  public static final class $glf_arc_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $types; }
    public SubLObject getField4() { return $parent; }
    public SubLObject getField5() { return $from; }
    public SubLObject getField6() { return $to; }
    public SubLObject getField7() { return $semantics; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $types = value; }
    public SubLObject setField4(SubLObject value) { return $parent = value; }
    public SubLObject setField5(SubLObject value) { return $from = value; }
    public SubLObject setField6(SubLObject value) { return $to = value; }
    public SubLObject setField7(SubLObject value) { return $semantics = value; }
    public SubLObject $id = NIL;
    public SubLObject $types = NIL;
    public SubLObject $parent = NIL;
    public SubLObject $from = NIL;
    public SubLObject $to = NIL;
    public SubLObject $semantics = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($glf_arc_native.class, $sym134$GLF_ARC, $sym135$GLF_ARC_P, $list136, $list137, new String[] {"$id", "$types", "$parent", "$from", "$to", "$semantics"}, $list138, $list139, $sym140$GLFARC_PRINT);
  }

  @SubL(source = "cycl/graphic-library-format.lisp", position = 15939) 
  public static SubLSymbol $dtp_glf_arc$ = null;

  @SubL(source = "cycl/graphic-library-format.lisp", position = 15939) 
  public static final SubLObject glf_arc_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6492");
    return NIL;
  }

  public static final class $glf_arc_p$UnaryFunction extends UnaryFunction {
    public $glf_arc_p$UnaryFunction() { super(extractFunctionNamed("GLF-ARC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6481"); }
  }

  public static final class $glf_rendering_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $label; }
    public SubLObject setField2(SubLObject value) { return $label = value; }
    public SubLObject $label = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($glf_rendering_native.class, $sym167$GLF_RENDERING, $sym168$GLF_RENDERING_P, $list169, $list170, new String[] {"$label"}, $list171, $list172, $sym173$GLFRNDR_PRINT);
  }

  @SubL(source = "cycl/graphic-library-format.lisp", position = 18298) 
  public static SubLSymbol $dtp_glf_rendering$ = null;

  @SubL(source = "cycl/graphic-library-format.lisp", position = 18298) 
  public static final SubLObject glf_rendering_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6550");
    return NIL;
  }

  public static final class $glf_rendering_p$UnaryFunction extends UnaryFunction {
    public $glf_rendering_p$UnaryFunction() { super(extractFunctionNamed("GLF-RENDERING-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6484"); }
  }

  public static final SubLObject declare_graphic_library_format_file() {
    declareFunction(myName, "glf_graph_print_function_trampoline", "GLF-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "glf_graph_p", "GLF-GRAPH-P", 1, 0, false); new $glf_graph_p$UnaryFunction();
    //declareFunction(myName, "glfgrph_id", "GLFGRPH-ID", 1, 0, false);
    //declareFunction(myName, "glfgrph_types", "GLFGRPH-TYPES", 1, 0, false);
    //declareFunction(myName, "glfgrph_ais", "GLFGRPH-AIS", 1, 0, false);
    //declareFunction(myName, "glfgrph_nodes", "GLFGRPH-NODES", 1, 0, false);
    //declareFunction(myName, "glfgrph_node_types", "GLFGRPH-NODE-TYPES", 1, 0, false);
    //declareFunction(myName, "glfgrph_source_node", "GLFGRPH-SOURCE-NODE", 1, 0, false);
    //declareFunction(myName, "glfgrph_arcs", "GLFGRPH-ARCS", 1, 0, false);
    //declareFunction(myName, "glfgrph_arc_types", "GLFGRPH-ARC-TYPES", 1, 0, false);
    //declareFunction(myName, "glfgrph_incoming_connectors", "GLFGRPH-INCOMING-CONNECTORS", 1, 0, false);
    //declareFunction(myName, "glfgrph_outgoing_connectors", "GLFGRPH-OUTGOING-CONNECTORS", 1, 0, false);
    //declareFunction(myName, "glfgrph_incoming_connector_types", "GLFGRPH-INCOMING-CONNECTOR-TYPES", 1, 0, false);
    //declareFunction(myName, "glfgrph_outgoing_connector_types", "GLFGRPH-OUTGOING-CONNECTOR-TYPES", 1, 0, false);
    //declareFunction(myName, "glfgrph_rendering_info", "GLFGRPH-RENDERING-INFO", 1, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_id", "_CSETF-GLFGRPH-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_types", "_CSETF-GLFGRPH-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_ais", "_CSETF-GLFGRPH-AIS", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_nodes", "_CSETF-GLFGRPH-NODES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_node_types", "_CSETF-GLFGRPH-NODE-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_source_node", "_CSETF-GLFGRPH-SOURCE-NODE", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_arcs", "_CSETF-GLFGRPH-ARCS", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_arc_types", "_CSETF-GLFGRPH-ARC-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_incoming_connectors", "_CSETF-GLFGRPH-INCOMING-CONNECTORS", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_outgoing_connectors", "_CSETF-GLFGRPH-OUTGOING-CONNECTORS", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_incoming_connector_types", "_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_outgoing_connector_types", "_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfgrph_rendering_info", "_CSETF-GLFGRPH-RENDERING-INFO", 2, 0, false);
    //declareFunction(myName, "make_glf_graph", "MAKE-GLF-GRAPH", 0, 1, false);
    //declareFunction(myName, "glfgrph_has_node_typesP", "GLFGRPH-HAS-NODE-TYPES?", 1, 0, false);
    //declareFunction(myName, "glfgrph_has_arc_typesP", "GLFGRPH-HAS-ARC-TYPES?", 1, 0, false);
    //declareFunction(myName, "glfgrph_has_incoming_connector_typesP", "GLFGRPH-HAS-INCOMING-CONNECTOR-TYPES?", 1, 0, false);
    //declareFunction(myName, "glfgrph_has_outgoing_connector_typesP", "GLFGRPH-HAS-OUTGOING-CONNECTOR-TYPES?", 1, 0, false);
    //declareFunction(myName, "glfgrph_has_rendering_infoP", "GLFGRPH-HAS-RENDERING-INFO?", 1, 0, false);
    //declareFunction(myName, "glfgrph_has_nodesP", "GLFGRPH-HAS-NODES?", 1, 0, false);
    //declareFunction(myName, "glfgrph_has_arcsP", "GLFGRPH-HAS-ARCS?", 1, 0, false);
    //declareFunction(myName, "glfgrph_print", "GLFGRPH-PRINT", 3, 0, false);
    //declareFunction(myName, "xml_serialize_glf_graph", "XML-SERIALIZE-GLF-GRAPH", 1, 1, false);
    //declareFunction(myName, "xml_serialize_glf_graph_core", "XML-SERIALIZE-GLF-GRAPH-CORE", 2, 0, false);
    //declareFunction(myName, "xml_serialize_glf_graph_diagram", "XML-SERIALIZE-GLF-GRAPH-DIAGRAM", 2, 0, false);
    //declareFunction(myName, "xml_serialize_glf_graph_rendering", "XML-SERIALIZE-GLF-GRAPH-RENDERING", 2, 0, false);
    //declareFunction(myName, "xml_serialize_glf_graph_rendering_info", "XML-SERIALIZE-GLF-GRAPH-RENDERING-INFO", 2, 0, false);
    //declareFunction(myName, "xml_serialize_glf_graph_flow_model", "XML-SERIALIZE-GLF-GRAPH-FLOW-MODEL", 2, 0, false);
    //declareFunction(myName, "get_graph_defining_mt", "GET-GRAPH-DEFINING-MT", 1, 0, false);
    //declareFunction(myName, "load_glf_graph_from_kb", "LOAD-GLF-GRAPH-FROM-KB", 2, 0, false);
    //declareFunction(myName, "map_glf_graph_to_ais", "MAP-GLF-GRAPH-TO-AIS", 2, 0, false);
    //declareFunction(myName, "create_glf_graph_from_kb", "CREATE-GLF-GRAPH-FROM-KB", 2, 0, false);
    //declareFunction(myName, "initialize_glfgrph_node_types", "INITIALIZE-GLFGRPH-NODE-TYPES", 2, 0, false);
    //declareFunction(myName, "note_glf_graph_node_type", "NOTE-GLF-GRAPH-NODE-TYPE", 2, 0, false);
    //declareFunction(myName, "initialize_glfgrph_arc_types", "INITIALIZE-GLFGRPH-ARC-TYPES", 2, 0, false);
    //declareFunction(myName, "note_glf_graph_arc_type", "NOTE-GLF-GRAPH-ARC-TYPE", 2, 0, false);
    //declareFunction(myName, "load_all_glf_nodes_from_kb", "LOAD-ALL-GLF-NODES-FROM-KB", 2, 0, false);
    //declareFunction(myName, "load_one_glf_node_from_kb", "LOAD-ONE-GLF-NODE-FROM-KB", 3, 0, false);
    //declareFunction(myName, "load_all_glf_arcs_from_kb", "LOAD-ALL-GLF-ARCS-FROM-KB", 2, 0, false);
    //declareFunction(myName, "load_one_glf_arc_from_kb", "LOAD-ONE-GLF-ARC-FROM-KB", 3, 0, false);
    declareFunction(myName, "glf_node_print_function_trampoline", "GLF-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "glf_node_p", "GLF-NODE-P", 1, 0, false); new $glf_node_p$UnaryFunction();
    //declareFunction(myName, "glfnode_id", "GLFNODE-ID", 1, 0, false);
    //declareFunction(myName, "glfnode_types", "GLFNODE-TYPES", 1, 0, false);
    //declareFunction(myName, "glfnode_parent", "GLFNODE-PARENT", 1, 0, false);
    //declareFunction(myName, "glfnode_semantics", "GLFNODE-SEMANTICS", 1, 0, false);
    //declareFunction(myName, "_csetf_glfnode_id", "_CSETF-GLFNODE-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_glfnode_types", "_CSETF-GLFNODE-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfnode_parent", "_CSETF-GLFNODE-PARENT", 2, 0, false);
    //declareFunction(myName, "_csetf_glfnode_semantics", "_CSETF-GLFNODE-SEMANTICS", 2, 0, false);
    //declareFunction(myName, "make_glf_node", "MAKE-GLF-NODE", 0, 1, false);
    //declareFunction(myName, "glfnode_print", "GLFNODE-PRINT", 3, 0, false);
    //declareFunction(myName, "create_glf_node_from_kb", "CREATE-GLF-NODE-FROM-KB", 3, 0, false);
    declareFunction(myName, "glf_arc_print_function_trampoline", "GLF-ARC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "glf_arc_p", "GLF-ARC-P", 1, 0, false); new $glf_arc_p$UnaryFunction();
    //declareFunction(myName, "glfarc_id", "GLFARC-ID", 1, 0, false);
    //declareFunction(myName, "glfarc_types", "GLFARC-TYPES", 1, 0, false);
    //declareFunction(myName, "glfarc_parent", "GLFARC-PARENT", 1, 0, false);
    //declareFunction(myName, "glfarc_from", "GLFARC-FROM", 1, 0, false);
    //declareFunction(myName, "glfarc_to", "GLFARC-TO", 1, 0, false);
    //declareFunction(myName, "glfarc_semantics", "GLFARC-SEMANTICS", 1, 0, false);
    //declareFunction(myName, "_csetf_glfarc_id", "_CSETF-GLFARC-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_glfarc_types", "_CSETF-GLFARC-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_glfarc_parent", "_CSETF-GLFARC-PARENT", 2, 0, false);
    //declareFunction(myName, "_csetf_glfarc_from", "_CSETF-GLFARC-FROM", 2, 0, false);
    //declareFunction(myName, "_csetf_glfarc_to", "_CSETF-GLFARC-TO", 2, 0, false);
    //declareFunction(myName, "_csetf_glfarc_semantics", "_CSETF-GLFARC-SEMANTICS", 2, 0, false);
    //declareFunction(myName, "make_glf_arc", "MAKE-GLF-ARC", 0, 1, false);
    //declareFunction(myName, "glfarc_print", "GLFARC-PRINT", 3, 0, false);
    //declareFunction(myName, "create_glf_arc_from_kb", "CREATE-GLF-ARC-FROM-KB", 3, 0, false);
    declareFunction(myName, "glf_rendering_print_function_trampoline", "GLF-RENDERING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "glf_rendering_p", "GLF-RENDERING-P", 1, 0, false); new $glf_rendering_p$UnaryFunction();
    //declareFunction(myName, "glfrndr_label", "GLFRNDR-LABEL", 1, 0, false);
    //declareFunction(myName, "_csetf_glfrndr_label", "_CSETF-GLFRNDR-LABEL", 2, 0, false);
    //declareFunction(myName, "make_glf_rendering", "MAKE-GLF-RENDERING", 0, 1, false);
    //declareFunction(myName, "glfrndr_print", "GLFRNDR-PRINT", 3, 0, false);
    //declareFunction(myName, "create_glf_rendering_for_component_from_kb", "CREATE-GLF-RENDERING-FOR-COMPONENT-FROM-KB", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_graphic_library_format_file() {
    $dtp_glf_graph$ = defconstant("*DTP-GLF-GRAPH*", $sym0$GLF_GRAPH);
    $dtp_glf_node$ = defconstant("*DTP-GLF-NODE*", $sym110$GLF_NODE);
    $dtp_glf_arc$ = defconstant("*DTP-GLF-ARC*", $sym134$GLF_ARC);
    $dtp_glf_rendering$ = defconstant("*DTP-GLF-RENDERING*", $sym167$GLF_RENDERING);
    return NIL;
  }

  public static final SubLObject setup_graphic_library_format_file() {
    // CVS_ID("Id: graphic-library-format.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_glf_graph$.getGlobalValue(), Symbols.symbol_function($sym7$GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$GLFGRPH_ID, $sym9$_CSETF_GLFGRPH_ID);
    Structures.def_csetf($sym10$GLFGRPH_TYPES, $sym11$_CSETF_GLFGRPH_TYPES);
    Structures.def_csetf($sym12$GLFGRPH_AIS, $sym13$_CSETF_GLFGRPH_AIS);
    Structures.def_csetf($sym14$GLFGRPH_NODES, $sym15$_CSETF_GLFGRPH_NODES);
    Structures.def_csetf($sym16$GLFGRPH_NODE_TYPES, $sym17$_CSETF_GLFGRPH_NODE_TYPES);
    Structures.def_csetf($sym18$GLFGRPH_SOURCE_NODE, $sym19$_CSETF_GLFGRPH_SOURCE_NODE);
    Structures.def_csetf($sym20$GLFGRPH_ARCS, $sym21$_CSETF_GLFGRPH_ARCS);
    Structures.def_csetf($sym22$GLFGRPH_ARC_TYPES, $sym23$_CSETF_GLFGRPH_ARC_TYPES);
    Structures.def_csetf($sym24$GLFGRPH_INCOMING_CONNECTORS, $sym25$_CSETF_GLFGRPH_INCOMING_CONNECTORS);
    Structures.def_csetf($sym26$GLFGRPH_OUTGOING_CONNECTORS, $sym27$_CSETF_GLFGRPH_OUTGOING_CONNECTORS);
    Structures.def_csetf($sym28$GLFGRPH_INCOMING_CONNECTOR_TYPES, $sym29$_CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES);
    Structures.def_csetf($sym30$GLFGRPH_OUTGOING_CONNECTOR_TYPES, $sym31$_CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES);
    Structures.def_csetf($sym32$GLFGRPH_RENDERING_INFO, $sym33$_CSETF_GLFGRPH_RENDERING_INFO);
    Equality.identity($sym0$GLF_GRAPH);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_glf_node$.getGlobalValue(), Symbols.symbol_function($sym117$GLF_NODE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym118$GLFNODE_ID, $sym119$_CSETF_GLFNODE_ID);
    Structures.def_csetf($sym120$GLFNODE_TYPES, $sym121$_CSETF_GLFNODE_TYPES);
    Structures.def_csetf($sym122$GLFNODE_PARENT, $sym123$_CSETF_GLFNODE_PARENT);
    Structures.def_csetf($sym124$GLFNODE_SEMANTICS, $sym125$_CSETF_GLFNODE_SEMANTICS);
    Equality.identity($sym110$GLF_NODE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_glf_arc$.getGlobalValue(), Symbols.symbol_function($sym141$GLF_ARC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym142$GLFARC_ID, $sym143$_CSETF_GLFARC_ID);
    Structures.def_csetf($sym144$GLFARC_TYPES, $sym145$_CSETF_GLFARC_TYPES);
    Structures.def_csetf($sym146$GLFARC_PARENT, $sym147$_CSETF_GLFARC_PARENT);
    Structures.def_csetf($sym148$GLFARC_FROM, $sym149$_CSETF_GLFARC_FROM);
    Structures.def_csetf($sym150$GLFARC_TO, $sym151$_CSETF_GLFARC_TO);
    Structures.def_csetf($sym152$GLFARC_SEMANTICS, $sym153$_CSETF_GLFARC_SEMANTICS);
    Equality.identity($sym134$GLF_ARC);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_glf_rendering$.getGlobalValue(), Symbols.symbol_function($sym174$GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym175$GLFRNDR_LABEL, $sym176$_CSETF_GLFRNDR_LABEL);
    Equality.identity($sym167$GLF_RENDERING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$GLF_GRAPH = makeSymbol("GLF-GRAPH");
  public static final SubLSymbol $sym1$GLF_GRAPH_P = makeSymbol("GLF-GRAPH-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("AIS"), makeSymbol("NODES"), makeSymbol("NODE-TYPES"), makeSymbol("SOURCE-NODE"), makeSymbol("ARCS"), makeSymbol("ARC-TYPES"), makeSymbol("INCOMING-CONNECTORS"), makeSymbol("OUTGOING-CONNECTORS"), makeSymbol("INCOMING-CONNECTOR-TYPES"), makeSymbol("OUTGOING-CONNECTOR-TYPES"), makeSymbol("RENDERING-INFO")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("AIS"), makeKeyword("NODES"), makeKeyword("NODE-TYPES"), makeKeyword("SOURCE-NODE"), makeKeyword("ARCS"), makeKeyword("ARC-TYPES"), makeKeyword("INCOMING-CONNECTORS"), makeKeyword("OUTGOING-CONNECTORS"), makeKeyword("INCOMING-CONNECTOR-TYPES"), makeKeyword("OUTGOING-CONNECTOR-TYPES"), makeKeyword("RENDERING-INFO")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("GLFGRPH-ID"), makeSymbol("GLFGRPH-TYPES"), makeSymbol("GLFGRPH-AIS"), makeSymbol("GLFGRPH-NODES"), makeSymbol("GLFGRPH-NODE-TYPES"), makeSymbol("GLFGRPH-SOURCE-NODE"), makeSymbol("GLFGRPH-ARCS"), makeSymbol("GLFGRPH-ARC-TYPES"), makeSymbol("GLFGRPH-INCOMING-CONNECTORS"), makeSymbol("GLFGRPH-OUTGOING-CONNECTORS"), makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES"), makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES"), makeSymbol("GLFGRPH-RENDERING-INFO")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-GLFGRPH-ID"), makeSymbol("_CSETF-GLFGRPH-TYPES"), makeSymbol("_CSETF-GLFGRPH-AIS"), makeSymbol("_CSETF-GLFGRPH-NODES"), makeSymbol("_CSETF-GLFGRPH-NODE-TYPES"), makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE"), makeSymbol("_CSETF-GLFGRPH-ARCS"), makeSymbol("_CSETF-GLFGRPH-ARC-TYPES"), makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS"), makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS"), makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES"), makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES"), makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO")});
  public static final SubLSymbol $sym6$GLFGRPH_PRINT = makeSymbol("GLFGRPH-PRINT");
  public static final SubLSymbol $sym7$GLF_GRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-GRAPH-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$GLFGRPH_ID = makeSymbol("GLFGRPH-ID");
  public static final SubLSymbol $sym9$_CSETF_GLFGRPH_ID = makeSymbol("_CSETF-GLFGRPH-ID");
  public static final SubLSymbol $sym10$GLFGRPH_TYPES = makeSymbol("GLFGRPH-TYPES");
  public static final SubLSymbol $sym11$_CSETF_GLFGRPH_TYPES = makeSymbol("_CSETF-GLFGRPH-TYPES");
  public static final SubLSymbol $sym12$GLFGRPH_AIS = makeSymbol("GLFGRPH-AIS");
  public static final SubLSymbol $sym13$_CSETF_GLFGRPH_AIS = makeSymbol("_CSETF-GLFGRPH-AIS");
  public static final SubLSymbol $sym14$GLFGRPH_NODES = makeSymbol("GLFGRPH-NODES");
  public static final SubLSymbol $sym15$_CSETF_GLFGRPH_NODES = makeSymbol("_CSETF-GLFGRPH-NODES");
  public static final SubLSymbol $sym16$GLFGRPH_NODE_TYPES = makeSymbol("GLFGRPH-NODE-TYPES");
  public static final SubLSymbol $sym17$_CSETF_GLFGRPH_NODE_TYPES = makeSymbol("_CSETF-GLFGRPH-NODE-TYPES");
  public static final SubLSymbol $sym18$GLFGRPH_SOURCE_NODE = makeSymbol("GLFGRPH-SOURCE-NODE");
  public static final SubLSymbol $sym19$_CSETF_GLFGRPH_SOURCE_NODE = makeSymbol("_CSETF-GLFGRPH-SOURCE-NODE");
  public static final SubLSymbol $sym20$GLFGRPH_ARCS = makeSymbol("GLFGRPH-ARCS");
  public static final SubLSymbol $sym21$_CSETF_GLFGRPH_ARCS = makeSymbol("_CSETF-GLFGRPH-ARCS");
  public static final SubLSymbol $sym22$GLFGRPH_ARC_TYPES = makeSymbol("GLFGRPH-ARC-TYPES");
  public static final SubLSymbol $sym23$_CSETF_GLFGRPH_ARC_TYPES = makeSymbol("_CSETF-GLFGRPH-ARC-TYPES");
  public static final SubLSymbol $sym24$GLFGRPH_INCOMING_CONNECTORS = makeSymbol("GLFGRPH-INCOMING-CONNECTORS");
  public static final SubLSymbol $sym25$_CSETF_GLFGRPH_INCOMING_CONNECTORS = makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTORS");
  public static final SubLSymbol $sym26$GLFGRPH_OUTGOING_CONNECTORS = makeSymbol("GLFGRPH-OUTGOING-CONNECTORS");
  public static final SubLSymbol $sym27$_CSETF_GLFGRPH_OUTGOING_CONNECTORS = makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTORS");
  public static final SubLSymbol $sym28$GLFGRPH_INCOMING_CONNECTOR_TYPES = makeSymbol("GLFGRPH-INCOMING-CONNECTOR-TYPES");
  public static final SubLSymbol $sym29$_CSETF_GLFGRPH_INCOMING_CONNECTOR_TYPES = makeSymbol("_CSETF-GLFGRPH-INCOMING-CONNECTOR-TYPES");
  public static final SubLSymbol $sym30$GLFGRPH_OUTGOING_CONNECTOR_TYPES = makeSymbol("GLFGRPH-OUTGOING-CONNECTOR-TYPES");
  public static final SubLSymbol $sym31$_CSETF_GLFGRPH_OUTGOING_CONNECTOR_TYPES = makeSymbol("_CSETF-GLFGRPH-OUTGOING-CONNECTOR-TYPES");
  public static final SubLSymbol $sym32$GLFGRPH_RENDERING_INFO = makeSymbol("GLFGRPH-RENDERING-INFO");
  public static final SubLSymbol $sym33$_CSETF_GLFGRPH_RENDERING_INFO = makeSymbol("_CSETF-GLFGRPH-RENDERING-INFO");
  public static final SubLSymbol $kw34$ID = makeKeyword("ID");
  public static final SubLSymbol $kw35$TYPES = makeKeyword("TYPES");
  public static final SubLSymbol $kw36$AIS = makeKeyword("AIS");
  public static final SubLSymbol $kw37$NODES = makeKeyword("NODES");
  public static final SubLSymbol $kw38$NODE_TYPES = makeKeyword("NODE-TYPES");
  public static final SubLSymbol $kw39$SOURCE_NODE = makeKeyword("SOURCE-NODE");
  public static final SubLSymbol $kw40$ARCS = makeKeyword("ARCS");
  public static final SubLSymbol $kw41$ARC_TYPES = makeKeyword("ARC-TYPES");
  public static final SubLSymbol $kw42$INCOMING_CONNECTORS = makeKeyword("INCOMING-CONNECTORS");
  public static final SubLSymbol $kw43$OUTGOING_CONNECTORS = makeKeyword("OUTGOING-CONNECTORS");
  public static final SubLSymbol $kw44$INCOMING_CONNECTOR_TYPES = makeKeyword("INCOMING-CONNECTOR-TYPES");
  public static final SubLSymbol $kw45$OUTGOING_CONNECTOR_TYPES = makeKeyword("OUTGOING-CONNECTOR-TYPES");
  public static final SubLSymbol $kw46$RENDERING_INFO = makeKeyword("RENDERING-INFO");
  public static final SubLString $str47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str48$_GLF_Graph_ = makeString("<GLF-Graph ");
  public static final SubLString $str49$_of_types_ = makeString(" of types ");
  public static final SubLString $str50$_corresponding_AIS__ = makeString(" corresponding AIS: ");
  public static final SubLString $str51$_Types__ = makeString(" Types: ");
  public static final SubLString $str52$__Node_Types__ = makeString("  Node-Types: ");
  public static final SubLString $str53$__Arc_Types__ = makeString("  Arc-Types: ");
  public static final SubLString $str54$__In_Connectors__ = makeString("  In-Connectors: ");
  public static final SubLString $str55$__Out_Connectors__ = makeString("  Out-Connectors: ");
  public static final SubLString $str56$_no_information_available_ = makeString(" no information available ");
  public static final SubLString $str57$_Content__ = makeString(" Content: ");
  public static final SubLString $str58$__Nodes__first_is_source___ = makeString("  Nodes (first is source): ");
  public static final SubLString $str59$__Arcs__ = makeString("  Arcs: ");
  public static final SubLString $str60$_currently_empty_ = makeString(" currently empty ");
  public static final SubLString $str61$_Rendering_Information_ = makeString(" Rendering Information ");
  public static final SubLString $str62$__ = makeString("  ");
  public static final SubLString $str63$____ = makeString(" -> ");
  public static final SubLString $str64$__ = makeString("> ");
  public static final SubLString $str65$glfGraph = makeString("glfGraph");
  public static final SubLString $str66$glfCore = makeString("glfCore");
  public static final SubLString $str67$glfNodeTypes = makeString("glfNodeTypes");
  public static final SubLString $str68$glfNodeType = makeString("glfNodeType");
  public static final SubLString $str69$glfArcTypes = makeString("glfArcTypes");
  public static final SubLString $str70$glfArcType = makeString("glfArcType");
  public static final SubLString $str71$glfDiagram = makeString("glfDiagram");
  public static final SubLString $str72$glfId = makeString("glfId");
  public static final SubLString $str73$glfOwnsNodes = makeString("glfOwnsNodes");
  public static final SubLString $str74$glfOwnsNode = makeString("glfOwnsNode");
  public static final SubLString $str75$glfIsHeadNode = makeString("glfIsHeadNode");
  public static final SubLSymbol $kw76$ATOMIC = makeKeyword("ATOMIC");
  public static final SubLString $str77$glfHasTypes = makeString("glfHasTypes");
  public static final SubLString $str78$glfHasType = makeString("glfHasType");
  public static final SubLString $str79$glfOwnsArcs = makeString("glfOwnsArcs");
  public static final SubLString $str80$glfOwnsArc = makeString("glfOwnsArc");
  public static final SubLString $str81$glfFromSet = makeString("glfFromSet");
  public static final SubLString $str82$glfFrom = makeString("glfFrom");
  public static final SubLString $str83$glfToSet = makeString("glfToSet");
  public static final SubLString $str84$glfTo = makeString("glfTo");
  public static final SubLString $str85$glfRendering = makeString("glfRendering");
  public static final SubLString $str86$glfRenderNodes = makeString("glfRenderNodes");
  public static final SubLString $str87$glfRenderNode = makeString("glfRenderNode");
  public static final SubLString $str88$glfRenderArcs = makeString("glfRenderArcs");
  public static final SubLString $str89$glfRenderArc = makeString("glfRenderArc");
  public static final SubLString $str90$glfRenderInfo = makeString("glfRenderInfo");
  public static final SubLString $str91$glfRenderLabel = makeString("glfRenderLabel");
  public static final SubLString $str92$glfFlowModel = makeString("glfFlowModel");
  public static final SubLString $str93$glfSemanticForNodes = makeString("glfSemanticForNodes");
  public static final SubLString $str94$glfSemanticForNode = makeString("glfSemanticForNode");
  public static final SubLString $str95$glfHasSemantic = makeString("glfHasSemantic");
  public static final SubLString $str96$glfSemanticForArcs = makeString("glfSemanticForArcs");
  public static final SubLString $str97$glfSemanticForArc = makeString("glfSemanticForArc");
  public static final SubLObject $const98$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list99 = list(constant_handles.reader_make_constant_shell(makeString("Graph-CW")));
  public static final SubLObject $const100$correspondingAIS = constant_handles.reader_make_constant_shell(makeString("correspondingAIS"));
  public static final SubLList $list101 = list(makeKeyword("AIS"));
  public static final SubLObject $const102$GLFNode = constant_handles.reader_make_constant_shell(makeString("GLFNode"));
  public static final SubLObject $const103$GLFArc = constant_handles.reader_make_constant_shell(makeString("GLFArc"));
  public static final SubLSymbol $kw104$NODE = makeKeyword("NODE");
  public static final SubLObject $const105$nodeInSystem = constant_handles.reader_make_constant_shell(makeString("nodeInSystem"));
  public static final SubLSymbol $kw106$SOURCE = makeKeyword("SOURCE");
  public static final SubLObject $const107$sourceNodeInSystem = constant_handles.reader_make_constant_shell(makeString("sourceNodeInSystem"));
  public static final SubLSymbol $kw108$ARC = makeKeyword("ARC");
  public static final SubLObject $const109$linkInSystem = constant_handles.reader_make_constant_shell(makeString("linkInSystem"));
  public static final SubLSymbol $sym110$GLF_NODE = makeSymbol("GLF-NODE");
  public static final SubLSymbol $sym111$GLF_NODE_P = makeSymbol("GLF-NODE-P");
  public static final SubLList $list112 = list(makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("PARENT"), makeSymbol("SEMANTICS"));
  public static final SubLList $list113 = list(makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("PARENT"), makeKeyword("SEMANTICS"));
  public static final SubLList $list114 = list(makeSymbol("GLFNODE-ID"), makeSymbol("GLFNODE-TYPES"), makeSymbol("GLFNODE-PARENT"), makeSymbol("GLFNODE-SEMANTICS"));
  public static final SubLList $list115 = list(makeSymbol("_CSETF-GLFNODE-ID"), makeSymbol("_CSETF-GLFNODE-TYPES"), makeSymbol("_CSETF-GLFNODE-PARENT"), makeSymbol("_CSETF-GLFNODE-SEMANTICS"));
  public static final SubLSymbol $sym116$GLFNODE_PRINT = makeSymbol("GLFNODE-PRINT");
  public static final SubLSymbol $sym117$GLF_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-NODE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym118$GLFNODE_ID = makeSymbol("GLFNODE-ID");
  public static final SubLSymbol $sym119$_CSETF_GLFNODE_ID = makeSymbol("_CSETF-GLFNODE-ID");
  public static final SubLSymbol $sym120$GLFNODE_TYPES = makeSymbol("GLFNODE-TYPES");
  public static final SubLSymbol $sym121$_CSETF_GLFNODE_TYPES = makeSymbol("_CSETF-GLFNODE-TYPES");
  public static final SubLSymbol $sym122$GLFNODE_PARENT = makeSymbol("GLFNODE-PARENT");
  public static final SubLSymbol $sym123$_CSETF_GLFNODE_PARENT = makeSymbol("_CSETF-GLFNODE-PARENT");
  public static final SubLSymbol $sym124$GLFNODE_SEMANTICS = makeSymbol("GLFNODE-SEMANTICS");
  public static final SubLSymbol $sym125$_CSETF_GLFNODE_SEMANTICS = makeSymbol("_CSETF-GLFNODE-SEMANTICS");
  public static final SubLSymbol $kw126$PARENT = makeKeyword("PARENT");
  public static final SubLSymbol $kw127$SEMANTICS = makeKeyword("SEMANTICS");
  public static final SubLString $str128$_GLF_Node_ = makeString("<GLF-Node ");
  public static final SubLString $str129$_of_graph_ = makeString(" of graph ");
  public static final SubLString $str130$_with_semantics_ = makeString(" with semantics ");
  public static final SubLString $str131$_without_semantics_ = makeString(" without semantics ");
  public static final SubLObject $const132$glfNodeSemantics_Underspecified = constant_handles.reader_make_constant_shell(makeString("glfNodeSemantics-Underspecified"));
  public static final SubLList $list133 = list(makeKeyword("SEMANTICS"));
  public static final SubLSymbol $sym134$GLF_ARC = makeSymbol("GLF-ARC");
  public static final SubLSymbol $sym135$GLF_ARC_P = makeSymbol("GLF-ARC-P");
  public static final SubLList $list136 = list(makeSymbol("ID"), makeSymbol("TYPES"), makeSymbol("PARENT"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("SEMANTICS"));
  public static final SubLList $list137 = list(makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("PARENT"), makeKeyword("FROM"), makeKeyword("TO"), makeKeyword("SEMANTICS"));
  public static final SubLList $list138 = list(makeSymbol("GLFARC-ID"), makeSymbol("GLFARC-TYPES"), makeSymbol("GLFARC-PARENT"), makeSymbol("GLFARC-FROM"), makeSymbol("GLFARC-TO"), makeSymbol("GLFARC-SEMANTICS"));
  public static final SubLList $list139 = list(makeSymbol("_CSETF-GLFARC-ID"), makeSymbol("_CSETF-GLFARC-TYPES"), makeSymbol("_CSETF-GLFARC-PARENT"), makeSymbol("_CSETF-GLFARC-FROM"), makeSymbol("_CSETF-GLFARC-TO"), makeSymbol("_CSETF-GLFARC-SEMANTICS"));
  public static final SubLSymbol $sym140$GLFARC_PRINT = makeSymbol("GLFARC-PRINT");
  public static final SubLSymbol $sym141$GLF_ARC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-ARC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym142$GLFARC_ID = makeSymbol("GLFARC-ID");
  public static final SubLSymbol $sym143$_CSETF_GLFARC_ID = makeSymbol("_CSETF-GLFARC-ID");
  public static final SubLSymbol $sym144$GLFARC_TYPES = makeSymbol("GLFARC-TYPES");
  public static final SubLSymbol $sym145$_CSETF_GLFARC_TYPES = makeSymbol("_CSETF-GLFARC-TYPES");
  public static final SubLSymbol $sym146$GLFARC_PARENT = makeSymbol("GLFARC-PARENT");
  public static final SubLSymbol $sym147$_CSETF_GLFARC_PARENT = makeSymbol("_CSETF-GLFARC-PARENT");
  public static final SubLSymbol $sym148$GLFARC_FROM = makeSymbol("GLFARC-FROM");
  public static final SubLSymbol $sym149$_CSETF_GLFARC_FROM = makeSymbol("_CSETF-GLFARC-FROM");
  public static final SubLSymbol $sym150$GLFARC_TO = makeSymbol("GLFARC-TO");
  public static final SubLSymbol $sym151$_CSETF_GLFARC_TO = makeSymbol("_CSETF-GLFARC-TO");
  public static final SubLSymbol $sym152$GLFARC_SEMANTICS = makeSymbol("GLFARC-SEMANTICS");
  public static final SubLSymbol $sym153$_CSETF_GLFARC_SEMANTICS = makeSymbol("_CSETF-GLFARC-SEMANTICS");
  public static final SubLSymbol $kw154$FROM = makeKeyword("FROM");
  public static final SubLSymbol $kw155$TO = makeKeyword("TO");
  public static final SubLString $str156$_GLF_Arc_ = makeString("<GLF-Arc ");
  public static final SubLString $str157$_from__ = makeString(" from: ");
  public static final SubLString $str158$_to____ = makeString(" to:   ");
  public static final SubLString $str159$_meaning__ = makeString(" meaning: ");
  public static final SubLObject $const160$variableMappingTableForGLFArcInDi = constant_handles.reader_make_constant_shell(makeString("variableMappingTableForGLFArcInDiagram"));
  public static final SubLObject $const161$AISForFn = constant_handles.reader_make_constant_shell(makeString("AISForFn"));
  public static final SubLList $list162 = list(makeSymbol("?FROM"), makeSymbol("?TO"));
  public static final SubLObject $const163$linkFromToInSystem = constant_handles.reader_make_constant_shell(makeString("linkFromToInSystem"));
  public static final SubLSymbol $sym164$_FROM = makeSymbol("?FROM");
  public static final SubLSymbol $sym165$_TO = makeSymbol("?TO");
  public static final SubLList $list166 = list(makeSymbol("SOURCE"), makeSymbol("TARGET"));
  public static final SubLSymbol $sym167$GLF_RENDERING = makeSymbol("GLF-RENDERING");
  public static final SubLSymbol $sym168$GLF_RENDERING_P = makeSymbol("GLF-RENDERING-P");
  public static final SubLList $list169 = list(makeSymbol("LABEL"));
  public static final SubLList $list170 = list(makeKeyword("LABEL"));
  public static final SubLList $list171 = list(makeSymbol("GLFRNDR-LABEL"));
  public static final SubLList $list172 = list(makeSymbol("_CSETF-GLFRNDR-LABEL"));
  public static final SubLSymbol $sym173$GLFRNDR_PRINT = makeSymbol("GLFRNDR-PRINT");
  public static final SubLSymbol $sym174$GLF_RENDERING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLF-RENDERING-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym175$GLFRNDR_LABEL = makeSymbol("GLFRNDR-LABEL");
  public static final SubLSymbol $sym176$_CSETF_GLFRNDR_LABEL = makeSymbol("_CSETF-GLFRNDR-LABEL");
  public static final SubLSymbol $kw177$LABEL = makeKeyword("LABEL");
  public static final SubLString $str178$__GLF_Rendering_ = makeString("#<GLF-Rendering ");
  public static final SubLString $str179$_label__ = makeString(" label: ");
  public static final SubLObject $const180$glfComponentLabel = constant_handles.reader_make_constant_shell(makeString("glfComponentLabel"));

  //// Initializers

  public void declareFunctions() {
    declare_graphic_library_format_file();
  }

  public void initializeVariables() {
    init_graphic_library_format_file();
  }

  public void runTopLevelForms() {
    setup_graphic_library_format_file();
  }

}
