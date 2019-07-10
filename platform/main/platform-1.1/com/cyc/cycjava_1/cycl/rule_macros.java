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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.skolems;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;

public  final class rule_macros extends SubLTranslatedFile {

  //// Constructor

  private rule_macros() {}
  public static final SubLFile me = new rule_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.rule_macros";

  //// Definitions

  /** If CLAUSES or its elements match certain hard-coded patterns, they are converted to rule macros.
   Otherwise they are left alone. */
  @SubL(source = "cycl/rule-macros.lisp", position = 1150) 
  public static final SubLObject canonicalize_clauses_wrt_rule_macros(SubLObject v_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == czer_vars.$express_as_rule_macroP$.getDynamicValue(thread))) {
        return v_clauses;
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3759"))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3755");
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3757"))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3754");
      } else {
        return Mapping.mapcar($sym0$CANONICALIZE_CLAUSE_WRT_RULE_MACROS, v_clauses);
      }
    }
  }

  public static final SubLObject declare_rule_macros_file() {
    declareFunction(myName, "canonicalize_clauses_wrt_rule_macros", "CANONICALIZE-CLAUSES-WRT-RULE-MACROS", 1, 0, false);
    //declareFunction(myName, "required_arg_pred_clausesP", "REQUIRED-ARG-PRED-CLAUSES?", 1, 1, false);
    //declareFunction(myName, "express_as_required_arg_pred", "EXPRESS-AS-REQUIRED-ARG-PRED", 1, 0, false);
    //declareFunction(myName, "required_arg_pred", "REQUIRED-ARG-PRED", 1, 0, false);
    //declareFunction(myName, "relation_type_clausesP", "RELATION-TYPE-CLAUSES?", 1, 1, false);
    //declareFunction(myName, "express_as_relation_type", "EXPRESS-AS-RELATION-TYPE", 1, 0, false);
    //declareFunction(myName, "relation_type_pred", "RELATION-TYPE-PRED", 1, 1, false);
    //declareFunction(myName, "relation_type_gaf", "RELATION-TYPE-GAF", 4, 1, false);
    //declareFunction(myName, "canonicalize_clause_wrt_rule_macros", "CANONICALIZE-CLAUSE-WRT-RULE-MACROS", 1, 0, false);
    //declareFunction(myName, "genls_clauseP", "GENLS-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_genls", "EXPRESS-AS-GENLS", 1, 0, false);
    //declareFunction(myName, "genl_predicates_clauseP", "GENL-PREDICATES-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_genl_predicates", "EXPRESS-AS-GENL-PREDICATES", 1, 0, false);
    //declareFunction(myName, "genl_inverse_clauseP", "GENL-INVERSE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_genl_inverse", "EXPRESS-AS-GENL-INVERSE", 1, 0, false);
    //declareFunction(myName, "arg_isa_clauseP", "ARG-ISA-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "relevant_arg_of_isa_clause", "RELEVANT-ARG-OF-ISA-CLAUSE", 2, 1, false);
    //declareFunction(myName, "express_as_arg_isa", "EXPRESS-AS-ARG-ISA", 1, 0, false);
    //declareFunction(myName, "arg_genl_clauseP", "ARG-GENL-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_arg_genl", "EXPRESS-AS-ARG-GENL", 1, 0, false);
    //declareFunction(myName, "inter_arg_isa_clauseP", "INTER-ARG-ISA-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_inter_arg_isa", "EXPRESS-AS-INTER-ARG-ISA", 1, 0, false);
    //declareFunction(myName, "disjoint_with_clauseP", "DISJOINT-WITH-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_disjoint_with", "EXPRESS-AS-DISJOINT-WITH", 1, 0, false);
    //declareFunction(myName, "negation_preds_clauseP", "NEGATION-PREDS-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_negation_preds", "EXPRESS-AS-NEGATION-PREDS", 1, 0, false);
    //declareFunction(myName, "negation_inverse_clauseP", "NEGATION-INVERSE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_negation_inverse", "EXPRESS-AS-NEGATION-INVERSE", 1, 0, false);
    //declareFunction(myName, "reflexive_predicate_clauseP", "REFLEXIVE-PREDICATE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "reflexive_neg_litsP", "REFLEXIVE-NEG-LITS?", 3, 1, false);
    //declareFunction(myName, "express_as_reflexive_predicate", "EXPRESS-AS-REFLEXIVE-PREDICATE", 1, 0, false);
    //declareFunction(myName, "irreflexive_predicate_clauseP", "IRREFLEXIVE-PREDICATE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_irreflexive_predicate", "EXPRESS-AS-IRREFLEXIVE-PREDICATE", 1, 0, false);
    //declareFunction(myName, "transitive_predicate_clauseP", "TRANSITIVE-PREDICATE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_transitive_predicate", "EXPRESS-AS-TRANSITIVE-PREDICATE", 1, 0, false);
    //declareFunction(myName, "symmetric_predicate_clauseP", "SYMMETRIC-PREDICATE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "symmetric_literalsP", "SYMMETRIC-LITERALS?", 2, 1, false);
    //declareFunction(myName, "express_as_symmetric_predicate", "EXPRESS-AS-SYMMETRIC-PREDICATE", 1, 0, false);
    //declareFunction(myName, "asymmetric_predicate_clauseP", "ASYMMETRIC-PREDICATE-CLAUSE?", 1, 1, false);
    //declareFunction(myName, "express_as_asymmetric_predicate", "EXPRESS-AS-ASYMMETRIC-PREDICATE", 1, 0, false);
    //declareFunction(myName, "make_rm_cnf", "MAKE-RM-CNF", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_rule_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_rule_macros_file() {
    // CVS_ID("Id: rule-macros.lisp 128423 2009-07-28 19:02:50Z goolsbey ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CANONICALIZE_CLAUSE_WRT_RULE_MACROS = makeSymbol("CANONICALIZE-CLAUSE-WRT-RULE-MACROS");
  public static final SubLSymbol $sym1$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLList $list2 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLList $list3 = list(list(list(list(makeSymbol("ISA"), makeSymbol("VAR"), makeSymbol("COL"))), list(makeSymbol("POS-LIT"))));
  public static final SubLObject $const4$requiredArg1Pred = constant_handles.reader_make_constant_shell(makeString("requiredArg1Pred"));
  public static final SubLObject $const5$requiredArg2Pred = constant_handles.reader_make_constant_shell(makeString("requiredArg2Pred"));
  public static final SubLString $str6$invalid_required_arg_pred_index__ = makeString("invalid required-arg-pred index: ~s");
  public static final SubLList $list7 = list(list(makeSymbol("NEG-LITS-1"), makeSymbol("POS-LITS-1")), list(makeSymbol("NEG-LITS-2"), makeSymbol("POS-LITS-2")));
  public static final SubLList $list8 = list(list(list(list(makeSymbol("ISA"), makeSymbol("VAR"), makeSymbol("COL"))), list(makeSymbol("POS-LIT-1"))), list(list(makeSymbol("NEG-LIT-2")), list(makeSymbol("POS-LIT-2"))));
  public static final SubLObject $const9$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));
  public static final SubLObject $const10$relationAllExistsCount = constant_handles.reader_make_constant_shell(makeString("relationAllExistsCount"));
  public static final SubLObject $const11$relationExistsAll = constant_handles.reader_make_constant_shell(makeString("relationExistsAll"));
  public static final SubLObject $const12$relationExistsCountAll = constant_handles.reader_make_constant_shell(makeString("relationExistsCountAll"));
  public static final SubLString $str13$invalid_relation_type_index___s = makeString("invalid relation-type index: ~s");
  public static final SubLString $str14$invalid_relation_type_rule_macro_ = makeString("invalid relation-type rule-macro-pred: ~s");
  public static final SubLObject $const15$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const16$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const17$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLList $list18 = list(makeSymbol("NEG-LITS"), list(list(makeSymbol("POS-ISA"), makeSymbol("POS-ISA-VAR"), makeSymbol("POS-ISA-COL"))));
  public static final SubLList $list19 = list(makeSymbol("NEG-ISA"), makeSymbol("NEG-ISA-VAR"), makeSymbol("NEG-ISA-COL"));
  public static final SubLObject $const20$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLObject $const21$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLObject $const22$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLObject $const23$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));
  public static final SubLObject $const24$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));
  public static final SubLObject $const25$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const26$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));
  public static final SubLObject $const27$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));
  public static final SubLObject $const28$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));
  public static final SubLObject $const29$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));
  public static final SubLObject $const30$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));

  //// Initializers

  public void declareFunctions() {
    declare_rule_macros_file();
  }

  public void initializeVariables() {
    init_rule_macros_file();
  }

  public void runTopLevelForms() {
    setup_rule_macros_file();
  }

}
