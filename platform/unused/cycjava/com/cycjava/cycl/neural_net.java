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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class neural_net extends SubLTranslatedFile {

  //// Constructor

  private neural_net() {}
  public static final SubLFile me = new neural_net();
  public static final String myName = "com.cyc.cycjava.cycl.neural_net";

  //// Definitions

  public static final class $neural_net_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $input_nodes; }
    public SubLObject setField2(SubLObject value) { return $input_nodes = value; }
    public SubLObject $input_nodes = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($neural_net_native.class, $sym0$NEURAL_NET, $sym1$NEURAL_NET_P, $list2, $list3, new String[] {"$input_nodes"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/neural-net.lisp", position = 1510) 
  public static SubLSymbol $dtp_neural_net$ = null;

  @SubL(source = "cycl/neural-net.lisp", position = 1510) 
  public static final SubLObject neural_net_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $neural_net_p$UnaryFunction extends UnaryFunction {
    public $neural_net_p$UnaryFunction() { super(extractFunctionNamed("NEURAL-NET-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31301"); }
  }

  public static final class $nn_input_node_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $value; }
    public SubLObject getField3() { return $weights; }
    public SubLObject setField2(SubLObject value) { return $value = value; }
    public SubLObject setField3(SubLObject value) { return $weights = value; }
    public SubLObject $value = NIL;
    public SubLObject $weights = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($nn_input_node_native.class, $sym15$NN_INPUT_NODE, $sym16$NN_INPUT_NODE_P, $list17, $list18, new String[] {"$value", "$weights"}, $list19, $list20, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/neural-net.lisp", position = 4091) 
  public static SubLSymbol $dtp_nn_input_node$ = null;

  @SubL(source = "cycl/neural-net.lisp", position = 4091) 
  public static final SubLObject nn_input_node_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $nn_input_node_p$UnaryFunction extends UnaryFunction {
    public $nn_input_node_p$UnaryFunction() { super(extractFunctionNamed("NN-INPUT-NODE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31304"); }
  }

  /** From Champ0_19.gnm, with the first list of weights moved to the end (the bias node weights) */
  @SubL(source = "cycl/neural-net.lisp", position = 4995) 
  private static SubLSymbol $rl_tactician_neural_net_weights_list$ = null;

  @SubL(source = "cycl/neural-net.lisp", position = 6557) 
  private static SubLSymbol $rl_tactician_neural_net$ = null;

  public static final SubLObject declare_neural_net_file() {
    declareFunction(myName, "neural_net_print_function_trampoline", "NEURAL-NET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "neural_net_p", "NEURAL-NET-P", 1, 0, false); new $neural_net_p$UnaryFunction();
    declareFunction(myName, "nn_input_nodes", "NN-INPUT-NODES", 1, 0, false);
    declareFunction(myName, "_csetf_nn_input_nodes", "_CSETF-NN-INPUT-NODES", 2, 0, false);
    declareFunction(myName, "make_neural_net", "MAKE-NEURAL-NET", 0, 1, false);
    declareFunction(myName, "new_neural_net", "NEW-NEURAL-NET", 1, 0, false);
    declareFunction(myName, "neural_net_input_nodes", "NEURAL-NET-INPUT-NODES", 1, 0, false);
    declareFunction(myName, "neural_net_input_node_count", "NEURAL-NET-INPUT-NODE-COUNT", 1, 0, false);
    declareFunction(myName, "neural_net_set_inputs", "NEURAL-NET-SET-INPUTS", 2, 0, false);
    declareFunction(myName, "sigmoid", "SIGMOID", 1, 0, false);
    declareFunction(myName, "nn_input_node_print_function_trampoline", "NN-INPUT-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "nn_input_node_p", "NN-INPUT-NODE-P", 1, 0, false); new $nn_input_node_p$UnaryFunction();
    declareFunction(myName, "nnin_value", "NNIN-VALUE", 1, 0, false);
    declareFunction(myName, "nnin_weights", "NNIN-WEIGHTS", 1, 0, false);
    declareFunction(myName, "_csetf_nnin_value", "_CSETF-NNIN-VALUE", 2, 0, false);
    declareFunction(myName, "_csetf_nnin_weights", "_CSETF-NNIN-WEIGHTS", 2, 0, false);
    declareFunction(myName, "make_nn_input_node", "MAKE-NN-INPUT-NODE", 0, 1, false);
    declareFunction(myName, "new_nn_input_node", "NEW-NN-INPUT-NODE", 2, 0, false);
    declareFunction(myName, "nn_input_node_value", "NN-INPUT-NODE-VALUE", 1, 0, false);
    declareFunction(myName, "nn_input_node_weights", "NN-INPUT-NODE-WEIGHTS", 1, 0, false);
    declareFunction(myName, "nn_input_node_set_value", "NN-INPUT-NODE-SET-VALUE", 2, 0, false);
    declareFunction(myName, "rl_tactician_initialize_neural_net", "RL-TACTICIAN-INITIALIZE-NEURAL-NET", 0, 0, false);
    declareFunction(myName, "rl_tactician_neural_net", "RL-TACTICIAN-NEURAL-NET", 0, 0, false);
    declareFunction(myName, "rl_tactician_evaluate_neural_net", "RL-TACTICIAN-EVALUATE-NEURAL-NET", 4, 0, false);
    declareFunction(myName, "rl_tactician_set_neural_net_input_values", "RL-TACTICIAN-SET-NEURAL-NET-INPUT-VALUES", 5, 0, false);
    declareFunction(myName, "rl_tactician_compute_neural_net_input_values", "RL-TACTICIAN-COMPUTE-NEURAL-NET-INPUT-VALUES", 4, 0, false);
    declareFunction(myName, "rl_tactician_compute_neural_net_output", "RL-TACTICIAN-COMPUTE-NEURAL-NET-OUTPUT", 2, 0, false);
    declareFunction(myName, "rl_tactician_indexes_we_care_about", "RL-TACTICIAN-INDEXES-WE-CARE-ABOUT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_neural_net_file() {
    $dtp_neural_net$ = defconstant("*DTP-NEURAL-NET*", $sym0$NEURAL_NET);
    $dtp_nn_input_node$ = defconstant("*DTP-NN-INPUT-NODE*", $sym15$NN_INPUT_NODE);
    $rl_tactician_neural_net_weights_list$ = deflexical("*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*", $list30);
    $rl_tactician_neural_net$ = deflexical("*RL-TACTICIAN-NEURAL-NET*", ((NIL != Symbols.boundp($sym31$_RL_TACTICIAN_NEURAL_NET_)) ? ((SubLObject) $rl_tactician_neural_net$.getGlobalValue()) : NIL));
    return NIL;
  }

  public static final SubLObject setup_neural_net_file() {
    // CVS_ID("Id: neural-net.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), Symbols.symbol_function($sym7$NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$NN_INPUT_NODES, $sym9$_CSETF_NN_INPUT_NODES);
    Equality.identity($sym0$NEURAL_NET);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), Symbols.symbol_function($sym21$NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym22$NNIN_VALUE, $sym23$_CSETF_NNIN_VALUE);
    Structures.def_csetf($sym24$NNIN_WEIGHTS, $sym25$_CSETF_NNIN_WEIGHTS);
    Equality.identity($sym15$NN_INPUT_NODE);
    subl_macro_promotions.declare_defglobal($sym31$_RL_TACTICIAN_NEURAL_NET_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$NEURAL_NET = makeSymbol("NEURAL-NET");
  public static final SubLSymbol $sym1$NEURAL_NET_P = makeSymbol("NEURAL-NET-P");
  public static final SubLList $list2 = list(makeSymbol("INPUT-NODES"));
  public static final SubLList $list3 = list(makeKeyword("INPUT-NODES"));
  public static final SubLList $list4 = list(makeSymbol("NN-INPUT-NODES"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-NN-INPUT-NODES"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEURAL-NET-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$NN_INPUT_NODES = makeSymbol("NN-INPUT-NODES");
  public static final SubLSymbol $sym9$_CSETF_NN_INPUT_NODES = makeSymbol("_CSETF-NN-INPUT-NODES");
  public static final SubLSymbol $kw10$INPUT_NODES = makeKeyword("INPUT-NODES");
  public static final SubLString $str11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym12$CONSP = makeSymbol("CONSP");
  public static final SubLString $str13$Expected__s_to_be__a_elements_lon = makeString("Expected ~s to be ~a elements long.");
  public static final SubLFloat $float14$4_924273 = makeDouble(4.924273);
  public static final SubLSymbol $sym15$NN_INPUT_NODE = makeSymbol("NN-INPUT-NODE");
  public static final SubLSymbol $sym16$NN_INPUT_NODE_P = makeSymbol("NN-INPUT-NODE-P");
  public static final SubLList $list17 = list(makeSymbol("VALUE"), makeSymbol("WEIGHTS"));
  public static final SubLList $list18 = list(makeKeyword("VALUE"), makeKeyword("WEIGHTS"));
  public static final SubLList $list19 = list(makeSymbol("NNIN-VALUE"), makeSymbol("NNIN-WEIGHTS"));
  public static final SubLList $list20 = list(makeSymbol("_CSETF-NNIN-VALUE"), makeSymbol("_CSETF-NNIN-WEIGHTS"));
  public static final SubLSymbol $sym21$NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NN-INPUT-NODE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym22$NNIN_VALUE = makeSymbol("NNIN-VALUE");
  public static final SubLSymbol $sym23$_CSETF_NNIN_VALUE = makeSymbol("_CSETF-NNIN-VALUE");
  public static final SubLSymbol $sym24$NNIN_WEIGHTS = makeSymbol("NNIN-WEIGHTS");
  public static final SubLSymbol $sym25$_CSETF_NNIN_WEIGHTS = makeSymbol("_CSETF-NNIN-WEIGHTS");
  public static final SubLSymbol $kw26$VALUE = makeKeyword("VALUE");
  public static final SubLSymbol $kw27$WEIGHTS = makeKeyword("WEIGHTS");
  public static final SubLSymbol $sym28$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $sym29$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLList $list30 = list(new SubLObject[] {list(makeDouble(-0.227514), makeDouble(-0.395681), makeDouble(-0.392587), makeDouble(-0.304583), makeDouble(0.717281)), list(makeDouble(0.466911), makeDouble(-1.01181), makeDouble(0.515608), makeDouble(0.186695), makeDouble(-0.173123)), list(makeDouble(0.691837), makeDouble(-0.39004), makeDouble(1.27718), makeDouble(0.0985643), makeDouble(-0.459222)), list(makeDouble(-0.14361), makeDouble(-0.100166), makeDouble(-0.409217), makeDouble(0.703923), makeDouble(0.0986236)), list(makeDouble(-0.558941), makeDouble(-0.654273), makeDouble(0.875859), makeDouble(-0.547818), makeDouble(0.464239)), list(makeDouble(-0.0898241), makeDouble(1.16297), makeDouble(-0.140286), makeDouble(0.727112), makeDouble(-0.0571363)), list(makeDouble(0.33211), makeDouble(0.804213), makeDouble(-0.500794), makeDouble(0.0836377), makeDouble(-0.119423)), list(makeDouble(-0.27839), makeDouble(-0.424287), makeDouble(0.0972779), makeDouble(-0.0641412), makeDouble(-0.324519)), list(makeDouble(-0.04071), makeDouble(-1.03764), makeDouble(-1.1684), makeDouble(-0.285568), makeDouble(0.322287)), list(makeDouble(0.35157), makeDouble(-0.0978135), makeDouble(-0.649702), makeDouble(1.0535), makeDouble(0.83717)), list(makeDouble(-0.0862237), makeDouble(0.22735), makeDouble(-1.21319), makeDouble(-0.531121), makeDouble(-0.486909)), list(makeDouble(0.256012), makeDouble(0.852522), makeDouble(-0.7396), makeDouble(0.233292), makeDouble(-0.0850184)), list(makeDouble(0.704154), makeDouble(-0.182174), makeDouble(0.169152), makeDouble(-1.2787), makeDouble(-0.400246)), list(makeDouble(0.242133), makeDouble(-0.671766), makeDouble(-1.05614), makeDouble(-0.0740336), makeDouble(-0.0432617)), list(makeDouble(-0.871448), makeDouble(0.0101277), makeDouble(0.221434), makeDouble(-0.0241337), makeDouble(-0.717193)), list(makeDouble(-0.228881), makeDouble(-0.132546), makeDouble(-0.240634), makeDouble(0.935199), makeDouble(0.111408)), list(makeDouble(0.456088), makeDouble(-0.189828), makeDouble(0.06841), makeDouble(-0.112433), makeDouble(-0.254772)), list(makeDouble(0.0838212), makeDouble(-0.901167), makeDouble(0.555404), makeDouble(0.126584), makeDouble(-1.13132)), list(makeDouble(0.927022), makeDouble(-0.294691), makeDouble(0.735027), makeDouble(0.42247), makeDouble(0.263537)), list(makeDouble(0.229667), makeDouble(-0.76629), makeDouble(1.13279), makeDouble(0.0468138), makeDouble(-0.392014)), list(makeDouble(0.565153), makeDouble(-0.082501), makeDouble(0.208606), makeDouble(0.101688), makeDouble(-0.672053))});
  public static final SubLSymbol $sym31$_RL_TACTICIAN_NEURAL_NET_ = makeSymbol("*RL-TACTICIAN-NEURAL-NET*");
  public static final SubLInteger $int32$21 = makeInteger(21);
  public static final SubLFloat $float33$0_01 = makeDouble(0.01);
  public static final SubLFloat $float34$0_03 = makeDouble(0.03);
  public static final SubLFloat $float35$0_97 = makeDouble(0.97);

  //// Initializers

  public void declareFunctions() {
    declare_neural_net_file();
  }

  public void initializeVariables() {
    init_neural_net_file();
  }

  public void runTopLevelForms() {
    setup_neural_net_file();
  }

}
