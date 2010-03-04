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

package  com.cyc.cycjava.cycl.inference.harness;

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
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class inference_worker_rewrite extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_rewrite() {}
  public static final SubLFile me = new inference_worker_rewrite();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite";

  //// Definitions

  public static final class $rewrite_link_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $hl_module; }
    public SubLObject getField3() { return $bindings; }
    public SubLObject getField4() { return $supports; }
    public SubLObject setField2(SubLObject value) { return $hl_module = value; }
    public SubLObject setField3(SubLObject value) { return $bindings = value; }
    public SubLObject setField4(SubLObject value) { return $supports = value; }
    public SubLObject $hl_module = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $supports = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($rewrite_link_data_native.class, $sym0$REWRITE_LINK_DATA, $sym1$REWRITE_LINK_DATA_P, $list2, $list3, new String[] {"$hl_module", "$bindings", "$supports"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1095) 
  public static SubLSymbol $dtp_rewrite_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 1095) 
  public static final SubLObject rewrite_link_data_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $rewrite_link_data_p$UnaryFunction extends UnaryFunction {
    public $rewrite_link_data_p$UnaryFunction() { super(extractFunctionNamed("REWRITE-LINK-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32963"); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6272) 
  public static final SubLObject rewrite_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw21$REWRITE == inference_datastructures_problem_link.problem_link_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 6417) 
  public static final SubLObject rewrite_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(tactic))
           && ($kw21$REWRITE == inference_datastructures_tactic.tactic_type(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 8732) 
  public static final SubLObject literal_level_rewrite_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != rewrite_tactic_p(tactic))
           && (NIL != inference_worker.literal_level_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-rewrite.lisp", position = 13792) 
  public static final SubLObject trigger_restriction_link_listeners(SubLObject link, SubLObject proof) {
    if ((NIL != inference_worker_restriction.restriction_listening_link_p(link))) {
      {
        SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject restricted_mapped_problem = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35684");
        SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        SubLObject restricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(restricted_problem);
        SubLObject cdolist_list_var = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35682");
        SubLObject tactic = NIL;
        for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
          {
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            SubLObject rewrite_closure_fn = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36424");
            SubLObject rewritten_closure = Functions.funcall(rewrite_closure_fn, restricted_asent);
            SubLObject cdolist_list_var_6 = rewritten_closure;
            SubLObject asent_and_supports = NIL;
            for (asent_and_supports = cdolist_list_var_6.first(); (NIL != cdolist_list_var_6); cdolist_list_var_6 = cdolist_list_var_6.rest(), asent_and_supports = cdolist_list_var_6.first()) {
              {
                SubLObject datum = asent_and_supports;
                SubLObject current = datum;
                SubLObject asent = NIL;
                SubLObject supports = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
                asent = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
                supports = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32960");
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list31);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_inference_worker_rewrite_file() {
    declareFunction(myName, "rewrite_link_data_print_function_trampoline", "REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "rewrite_link_data_p", "REWRITE-LINK-DATA-P", 1, 0, false); new $rewrite_link_data_p$UnaryFunction();
    declareFunction(myName, "rw_link_data_hl_module", "RW-LINK-DATA-HL-MODULE", 1, 0, false);
    declareFunction(myName, "rw_link_data_bindings", "RW-LINK-DATA-BINDINGS", 1, 0, false);
    declareFunction(myName, "rw_link_data_supports", "RW-LINK-DATA-SUPPORTS", 1, 0, false);
    declareFunction(myName, "_csetf_rw_link_data_hl_module", "_CSETF-RW-LINK-DATA-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_rw_link_data_bindings", "_CSETF-RW-LINK-DATA-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_rw_link_data_supports", "_CSETF-RW-LINK-DATA-SUPPORTS", 2, 0, false);
    declareFunction(myName, "make_rewrite_link_data", "MAKE-REWRITE-LINK-DATA", 0, 1, false);
    declareFunction(myName, "new_rewrite_link", "NEW-REWRITE-LINK", 4, 0, false);
    declareFunction(myName, "new_rewrite_link_int", "NEW-REWRITE-LINK-INT", 3, 0, false);
    declareFunction(myName, "new_rewrite_link_data", "NEW-REWRITE-LINK-DATA", 1, 0, false);
    declareFunction(myName, "destroy_rewrite_link", "DESTROY-REWRITE-LINK", 1, 0, false);
    declareFunction(myName, "rewrite_link_hl_module", "REWRITE-LINK-HL-MODULE", 1, 0, false);
    declareFunction(myName, "rewrite_link_bindings", "REWRITE-LINK-BINDINGS", 1, 0, false);
    declareFunction(myName, "rewrite_link_supports", "REWRITE-LINK-SUPPORTS", 1, 0, false);
    declareFunction(myName, "set_rewrite_link_hl_module", "SET-REWRITE-LINK-HL-MODULE", 2, 0, false);
    declareFunction(myName, "set_rewrite_link_bindings", "SET-REWRITE-LINK-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_rewrite_link_supports", "SET-REWRITE-LINK-SUPPORTS", 2, 0, false);
    declareFunction(myName, "rewrite_link_tactic", "REWRITE-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "rewrite_link_supporting_mapped_problem", "REWRITE-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "rewrite_link_supporting_variable_map", "REWRITE-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "rewrite_link_rewrite_mt", "REWRITE-LINK-REWRITE-MT", 1, 0, false);
    declareFunction(myName, "rewrite_link_p", "REWRITE-LINK-P", 1, 0, false);
    declareFunction(myName, "rewrite_tactic_p", "REWRITE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "rewrite_tactic_support", "REWRITE-TACTIC-SUPPORT", 1, 0, false);
    declareFunction(myName, "rewrite_proof_p", "REWRITE-PROOF-P", 1, 0, false);
    declareFunction(myName, "determine_new_literal_rewrite_tactics", "DETERMINE-NEW-LITERAL-REWRITE-TACTICS", 3, 1, false);
    declareFunction(myName, "literal_level_rewrite_tactic_p", "LITERAL-LEVEL-REWRITE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "maybe_new_rewrite_link", "MAYBE-NEW-REWRITE-LINK", 4, 0, false);
    declareFunction(myName, "new_rewrite_tactic", "NEW-REWRITE-TACTIC", 4, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_rewrite_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REWRITE-TACTIC", 2, 0, false);
    declareFunction(myName, "current_rewrite_mt", "CURRENT-REWRITE-MT", 0, 0, false);
    declareFunction(myName, "execute_literal_level_rewrite_tactic", "EXECUTE-LITERAL-LEVEL-REWRITE-TACTIC", 3, 0, false);
    declareFunction(myName, "rewrite_add_link", "REWRITE-ADD-LINK", 2, 0, false);
    declareFunction(myName, "compute_rewrite_bindings", "COMPUTE-REWRITE-BINDINGS", 1, 0, false);
    declareFunction(myName, "identity_variable_map_for_sentence", "IDENTITY-VARIABLE-MAP-FOR-SENTENCE", 1, 0, false);
    declareFunction(myName, "restriction_rewrite_add_link", "RESTRICTION-REWRITE-ADD-LINK", 2, 0, false);
    declareFunction(myName, "trigger_restriction_link_listeners", "TRIGGER-RESTRICTION-LINK-LISTENERS", 2, 0, false);
    declareFunction(myName, "maybe_add_restriction_rewrite_problem", "MAYBE-ADD-RESTRICTION-REWRITE-PROBLEM", 6, 0, false);
    declareFunction(myName, "structurally_redundant_restriction_rewrite_problemP", "STRUCTURALLY-REDUNDANT-RESTRICTION-REWRITE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "new_rewrite_proof", "NEW-REWRITE-PROOF", 3, 0, false);
    declareFunction(myName, "bubble_up_proof_to_rewrite_link", "BUBBLE-UP-PROOF-TO-REWRITE-LINK", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_rewrite_file() {
    $dtp_rewrite_link_data$ = defconstant("*DTP-REWRITE-LINK-DATA*", $sym0$REWRITE_LINK_DATA);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_rewrite_file() {
    // CVS_ID("Id: inference-worker-rewrite.lisp 128648 2009-08-27 17:23:55Z pace ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_rewrite_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$RW_LINK_DATA_HL_MODULE, $sym9$_CSETF_RW_LINK_DATA_HL_MODULE);
    Structures.def_csetf($sym10$RW_LINK_DATA_BINDINGS, $sym11$_CSETF_RW_LINK_DATA_BINDINGS);
    Structures.def_csetf($sym12$RW_LINK_DATA_SUPPORTS, $sym13$_CSETF_RW_LINK_DATA_SUPPORTS);
    Equality.identity($sym0$REWRITE_LINK_DATA);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$REWRITE_LINK_DATA = makeSymbol("REWRITE-LINK-DATA");
  public static final SubLSymbol $sym1$REWRITE_LINK_DATA_P = makeSymbol("REWRITE-LINK-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
  public static final SubLList $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));
  public static final SubLList $list4 = list(makeSymbol("RW-LINK-DATA-HL-MODULE"), makeSymbol("RW-LINK-DATA-BINDINGS"), makeSymbol("RW-LINK-DATA-SUPPORTS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$RW_LINK_DATA_HL_MODULE = makeSymbol("RW-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym9$_CSETF_RW_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym10$RW_LINK_DATA_BINDINGS = makeSymbol("RW-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym11$_CSETF_RW_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym12$RW_LINK_DATA_SUPPORTS = makeSymbol("RW-LINK-DATA-SUPPORTS");
  public static final SubLSymbol $sym13$_CSETF_RW_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS");
  public static final SubLSymbol $kw14$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw15$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw16$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym18$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym19$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
  public static final SubLSymbol $sym20$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $kw21$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $kw22$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $kw23$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym24$REWRITE_LINK_P = makeSymbol("REWRITE-LINK-P");
  public static final SubLString $str25$Bindings__a_are_not_valid_rewrite = makeString("Bindings ~a are not valid rewrite-link bindings.");
  public static final SubLSymbol $sym26$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLString $str27$No_tactic_found_for__S = makeString("No tactic found for ~S");
  public static final SubLSymbol $kw28$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw29$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym30$PROBLEM_QUERY_P = makeSymbol("PROBLEM-QUERY-P");
  public static final SubLList $list31 = list(makeSymbol("ASENT"), makeSymbol("SUPPORTS"));
  public static final SubLSymbol $sym32$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLSymbol $sym33$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_rewrite_file();
  }

  public void initializeVariables() {
    init_inference_worker_rewrite_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_rewrite_file();
  }

}
