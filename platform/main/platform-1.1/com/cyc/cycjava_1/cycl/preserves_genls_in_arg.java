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

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class preserves_genls_in_arg extends SubLTranslatedFile {

  //// Constructor

  private preserves_genls_in_arg() {}
  public static final SubLFile me = new preserves_genls_in_arg();
  public static final String myName = "com.cyc.cycjava_1.cycl.preserves_genls_in_arg";

  //// Definitions

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 613) 
  private static SubLSymbol $pgia_fn$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1518) 
  private static SubLSymbol $pgia_gaf$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1556) 
  private static SubLSymbol $pgia_arg$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1594) 
  private static SubLSymbol $pgia_done$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1633) 
  private static SubLSymbol $pgia_nat$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1671) 
  private static SubLSymbol $pgia_nat_fort$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1714) 
  private static SubLSymbol $pgia_col$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1752) 
  private static SubLSymbol $pgia_genl$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1791) 
  private static SubLSymbol $pgia_genl_nat$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1834) 
  private static SubLSymbol $pgia_genl_nats$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1878) 
  private static SubLSymbol $pgia_spec$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1917) 
  private static SubLSymbol $pgia_spec_nat$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1960) 
  private static SubLSymbol $pgia_spec_nats$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2004) 
  private static SubLSymbol $candidate_pgia_genls$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2054) 
  private static SubLSymbol $candidate_pgia_specs$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2104) 
  private static SubLSymbol $consider_current_pgiaP$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2156) 
  private static SubLSymbol $current_pgia_genls$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2204) 
  private static SubLSymbol $current_pgia_specs$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2252) 
  public static SubLSymbol $pgia_mt$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2290) 
  private static SubLSymbol $pgia_rule$ = null;

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 5184) 
  public static final SubLObject pgia_after_adding_isa(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != control_vars.$pgia_activeP$.getDynamicValue(thread))) {
        if ((NIL == subl_promotions.memberP(argument, assertions_high.assertion_arguments(assertion), $sym13$NOT_EQ, UNPROVIDED))) {
          {
            SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            try {
              sbhl_link_vars.$added_source$.bind(argument, thread);
              if ((NIL != assertion_utilities.true_assertionP(assertion))) {
                {
                  SubLObject mt = assertions_high.assertion_mt(assertion);
                  SubLObject nat_fort = assertions_high.gaf_arg1(assertion);
                  SubLObject col_type = assertions_high.gaf_arg2(assertion);
                  SubLObject nat = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10747");
                  SubLObject redundantP = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2045");
                  if ((NIL == redundantP)) {
                    {
                      SubLObject _prev_bind_0_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$relevant_mt_function$.bind($sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($const7$EverythingPSC, thread);
                        redundantP = subl_promotions.memberP(col_type, Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3661"), $sym13$NOT_EQ, UNPROVIDED);
                      } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_5, thread);
                      }
                    }
                    if ((NIL == redundantP)) {
                      if (((NIL != nat)
                           && (NIL != genls.genlsP(col_type, $const15$Collection, mt, UNPROVIDED)))) {
                        {
                          SubLObject _prev_bind_0_6 = $pgia_fn$.currentBinding(thread);
                          SubLObject _prev_bind_1 = $pgia_nat_fort$.currentBinding(thread);
                          SubLObject _prev_bind_2 = $pgia_nat$.currentBinding(thread);
                          SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                          SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                          try {
                            $pgia_fn$.bind(cycl_utilities.nat_functor(nat), thread);
                            $pgia_nat_fort$.bind(nat_fort, thread);
                            $pgia_nat$.bind(nat, thread);
                            mt_relevance_macros.$relevant_mt_function$.bind($sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($const7$EverythingPSC, thread);
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9452");
                          } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                            $pgia_nat$.rebind(_prev_bind_2, thread);
                            $pgia_nat_fort$.rebind(_prev_bind_1, thread);
                            $pgia_fn$.rebind(_prev_bind_0_6, thread);
                          }
                        }
                      }
                    }
                  }
                }
              }
            } finally {
              sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $pgia_after_adding_isa$BinaryFunction extends BinaryFunction {
    public $pgia_after_adding_isa$BinaryFunction() { super(extractFunctionNamed("PGIA-AFTER-ADDING-ISA")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return pgia_after_adding_isa(arg1, arg2); }
  }

  @SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 7559) 
  public static final SubLObject pgia_after_removing_genls(SubLObject deduction, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != control_vars.$pgia_activeP$.getDynamicValue(thread))) {
        if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3748"))) {
          {
            SubLObject axiom = assertions_high.gaf_formula(assertion);
            SubLObject truth = assertions_high.assertion_truth(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            {
              SubLObject _prev_bind_0 = $pgia_spec$.currentBinding(thread);
              SubLObject _prev_bind_1 = $pgia_genl$.currentBinding(thread);
              try {
                $pgia_spec$.bind(conses_high.second(axiom), thread);
                $pgia_genl$.bind(conses_high.third(axiom), thread);
                if ((NIL == kb_accessors.assertion_still_thereP(assertion, truth))) {
                  {
                    SubLObject _prev_bind_0_8 = $pgia_spec_nat$.currentBinding(thread);
                    SubLObject _prev_bind_1_9 = $pgia_genl_nat$.currentBinding(thread);
                    try {
                      $pgia_spec_nat$.bind(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10748"), thread);
                      $pgia_genl_nat$.bind(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10749"), thread);
                      if (((NIL != $pgia_spec_nat$.getDynamicValue(thread))
                           && (NIL != $pgia_genl_nat$.getDynamicValue(thread)))) {
                        {
                          SubLObject _prev_bind_0_10 = $pgia_fn$.currentBinding(thread);
                          try {
                            $pgia_fn$.bind(cycl_utilities.nat_functor($pgia_spec_nat$.getDynamicValue(thread)), thread);
                            if (($pgia_fn$.getDynamicValue(thread) == cycl_utilities.nat_functor($pgia_genl_nat$.getDynamicValue(thread)))) {
                              {
                                SubLObject _prev_bind_0_11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_12 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                  mt_relevance_macros.$relevant_mt_function$.bind($sym3$RELEVANT_MT_IS_GENL_MT, thread);
                                  mt_relevance_macros.$mt$.bind(mt, thread);
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9453");
                                } finally {
                                  mt_relevance_macros.$mt$.rebind(_prev_bind_1_12, thread);
                                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_11, thread);
                                }
                              }
                            }
                          } finally {
                            $pgia_fn$.rebind(_prev_bind_0_10, thread);
                          }
                        }
                      }
                    } finally {
                      $pgia_genl_nat$.rebind(_prev_bind_1_9, thread);
                      $pgia_spec_nat$.rebind(_prev_bind_0_8, thread);
                    }
                  }
                }
              } finally {
                $pgia_genl$.rebind(_prev_bind_1, thread);
                $pgia_spec$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_preserves_genls_in_arg_file() {
    //declareFunction("pgia_after_adding_pgia", "PGIA-AFTER-ADDING-PGIA", 2, 0, false);
    //declareFunction("pgia_after_adding_pgia_1", "PGIA-AFTER-ADDING-PGIA-1", 1, 0, false);
    //declareFunction("pgia_after_adding_pgia_2", "PGIA-AFTER-ADDING-PGIA-2", 1, 0, false);
    //declareFunction("pgia_after_adding_pgia_3", "PGIA-AFTER-ADDING-PGIA-3", 1, 0, false);
    declareFunction("pgia_after_adding_isa", "PGIA-AFTER-ADDING-ISA", 2, 0, false); new $pgia_after_adding_isa$BinaryFunction();
    //declareFunction("pgia_after_adding_isa_1", "PGIA-AFTER-ADDING-ISA-1", 1, 0, false);
    //declareFunction("pgia_after_adding_isa_2", "PGIA-AFTER-ADDING-ISA-2", 1, 0, false);
    declareFunction("pgia_after_removing_genls", "PGIA-AFTER-REMOVING-GENLS", 2, 0, false);
    //declareFunction("pgia_after_removing_genls_1", "PGIA-AFTER-REMOVING-GENLS-1", 1, 0, false);
    //declareFunction("candidate_pgia", "CANDIDATE-PGIA", 5, 1, false);
    //declareFunction("pgia_true_in_mts", "PGIA-TRUE-IN-MTS", 3, 0, false);
    //declareFunction("recompute_functor_pgia", "RECOMPUTE-FUNCTOR-PGIA", 1, 0, false);
    //declareFunction("recompute_functor_pgia_1", "RECOMPUTE-FUNCTOR-PGIA-1", 1, 0, false);
    //declareFunction("recompute_nat_pgia", "RECOMPUTE-NAT-PGIA", 1, 0, false);
    //declareFunction("recompute_nat_pgia_1", "RECOMPUTE-NAT-PGIA-1", 1, 0, false);
    //declareFunction("current_pgia_specs", "CURRENT-PGIA-SPECS", 2, 0, false);
    //declareFunction("current_pgia_genls", "CURRENT-PGIA-GENLS", 2, 0, false);
    //declareFunction("gather_pgia", "GATHER-PGIA", 1, 0, false);
    //declareFunction("pgia_assertionP", "PGIA-ASSERTION?", 1, 1, false);
    //declareFunction("pgia_supportP", "PGIA-SUPPORT?", 1, 0, false);
    //declareFunction("pgia_deductionP", "PGIA-DEDUCTION?", 1, 1, false);
    //declareFunction("assert_candidate_pgia_genls", "ASSERT-CANDIDATE-PGIA-GENLS", 0, 0, false);
    //declareFunction("assert_candidate_pgia_specs", "ASSERT-CANDIDATE-PGIA-SPECS", 0, 0, false);
    //declareFunction("known_pgiaP", "KNOWN-PGIA?", 3, 0, false);
    //declareFunction("candidate_pgiaP", "CANDIDATE-PGIA?", 3, 0, false);
    //declareFunction("map_tous_of_fn_arg", "MAP-TOUS-OF-FN-ARG", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_preserves_genls_in_arg_file() {
    $pgia_fn$ = defparameter("*PGIA-FN*", NIL);
    $pgia_gaf$ = defparameter("*PGIA-GAF*", NIL);
    $pgia_arg$ = defparameter("*PGIA-ARG*", NIL);
    $pgia_done$ = defparameter("*PGIA-DONE*", NIL);
    $pgia_nat$ = defparameter("*PGIA-NAT*", NIL);
    $pgia_nat_fort$ = defparameter("*PGIA-NAT-FORT*", NIL);
    $pgia_col$ = defparameter("*PGIA-COL*", NIL);
    $pgia_genl$ = defparameter("*PGIA-GENL*", NIL);
    $pgia_genl_nat$ = defparameter("*PGIA-GENL-NAT*", NIL);
    $pgia_genl_nats$ = defparameter("*PGIA-GENL-NATS*", NIL);
    $pgia_spec$ = defparameter("*PGIA-SPEC*", NIL);
    $pgia_spec_nat$ = defparameter("*PGIA-SPEC-NAT*", NIL);
    $pgia_spec_nats$ = defparameter("*PGIA-SPEC-NATS*", NIL);
    $candidate_pgia_genls$ = defparameter("*CANDIDATE-PGIA-GENLS*", NIL);
    $candidate_pgia_specs$ = defparameter("*CANDIDATE-PGIA-SPECS*", NIL);
    $consider_current_pgiaP$ = defparameter("*CONSIDER-CURRENT-PGIA?*", NIL);
    $current_pgia_genls$ = defparameter("*CURRENT-PGIA-GENLS*", NIL);
    $current_pgia_specs$ = defparameter("*CURRENT-PGIA-SPECS*", NIL);
    $pgia_mt$ = deflexical("*PGIA-MT*", maybeDefault( $sym0$_PGIA_MT_, $pgia_mt$, ()-> ($const1$BaseKB)));
    $pgia_rule$ = defparameter("*PGIA-RULE*", $list2);
    return NIL;
  }

  public static final SubLObject setup_preserves_genls_in_arg_file() {
        subl_macro_promotions.declare_defglobal($sym0$_PGIA_MT_);
    mt_vars.note_mt_var($sym0$_PGIA_MT_, NIL);
    utilities_macros.register_kb_function($sym5$PGIA_AFTER_ADDING_PGIA);
    utilities_macros.register_kb_function($sym19$PGIA_AFTER_ADDING_ISA);
    utilities_macros.register_kb_function($sym22$PGIA_AFTER_REMOVING_GENLS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_PGIA_MT_ = makeSymbol("*PGIA-MT*");
  public static final SubLObject $const1$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLList $list2 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("preservesGenlsInArg")), list(constant_handles.reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeSymbol("?NAT-1")), makeSymbol("?ARG")), list(constant_handles.reader_make_constant_shell(makeString("equals")), list(constant_handles.reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeSymbol("?NAT-1")), list(constant_handles.reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeSymbol("?NAT-2"))), list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?NAT-1"), makeSymbol("?NAT-2")), list(constant_handles.reader_make_constant_shell(makeString("genls")), list(constant_handles.reader_make_constant_shell(makeString("FormulaArgFn")), makeSymbol("?ARG"), makeSymbol("?NAT-1")), list(constant_handles.reader_make_constant_shell(makeString("FormulaArgFn")), makeSymbol("?ARG"), makeSymbol("?NAT-2")))), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?NAT-1"), makeSymbol("?NAT-2")));
  public static final SubLSymbol $sym3$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym4$PGIA_AFTER_ADDING_PGIA_1 = makeSymbol("PGIA-AFTER-ADDING-PGIA-1");
  public static final SubLSymbol $sym5$PGIA_AFTER_ADDING_PGIA = makeSymbol("PGIA-AFTER-ADDING-PGIA");
  public static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const7$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym8$PGIA_AFTER_ADDING_PGIA_2 = makeSymbol("PGIA-AFTER-ADDING-PGIA-2");
  public static final SubLSymbol $sym9$SBHL_UNRECORDED_NODE_P = makeSymbol("SBHL-UNRECORDED-NODE-P");
  public static final SubLSymbol $sym10$PGIA_AFTER_ADDING_PGIA_3 = makeSymbol("PGIA-AFTER-ADDING-PGIA-3");
  public static final SubLObject $const11$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym13$NOT_EQ = makeSymbol("NOT-EQ");
  public static final SubLObject $const14$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const15$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLSymbol $sym16$PGIA_AFTER_ADDING_ISA_1 = makeSymbol("PGIA-AFTER-ADDING-ISA-1");
  public static final SubLObject $const17$preservesGenlsInArg = constant_handles.reader_make_constant_shell(makeString("preservesGenlsInArg"));
  public static final SubLSymbol $kw18$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym19$PGIA_AFTER_ADDING_ISA = makeSymbol("PGIA-AFTER-ADDING-ISA");
  public static final SubLSymbol $sym20$PGIA_AFTER_ADDING_ISA_2 = makeSymbol("PGIA-AFTER-ADDING-ISA-2");
  public static final SubLSymbol $sym21$PGIA_AFTER_REMOVING_GENLS_1 = makeSymbol("PGIA-AFTER-REMOVING-GENLS-1");
  public static final SubLSymbol $sym22$PGIA_AFTER_REMOVING_GENLS = makeSymbol("PGIA-AFTER-REMOVING-GENLS");
  public static final SubLSymbol $kw23$GENLS = makeKeyword("GENLS");
  public static final SubLString $str24$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLSymbol $kw25$SPECS = makeKeyword("SPECS");
  public static final SubLSymbol $sym26$RECOMPUTE_FUNCTOR_PGIA_1 = makeSymbol("RECOMPUTE-FUNCTOR-PGIA-1");
  public static final SubLSymbol $sym27$RECOMPUTE_NAT_PGIA_1 = makeSymbol("RECOMPUTE-NAT-PGIA-1");
  public static final SubLSymbol $sym28$GATHER_PGIA = makeSymbol("GATHER-PGIA");
  public static final SubLSymbol $kw29$CODE = makeKeyword("CODE");
  public static final SubLList $list30 = list(makeSymbol("GAF"), makeSymbol("GENL-COL"), makeSymbol("MT"));
  public static final SubLList $list31 = list(makeKeyword("DEFAULT"));
  public static final SubLSymbol $kw32$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLList $list33 = list(makeSymbol("GENL-NAT"), makeSymbol("GENL-COL"), makeSymbol("MT"));
  public static final SubLList $list34 = list(makeSymbol("GAF"), makeSymbol("SPEC-COL"), makeSymbol("MT"));
  public static final SubLList $list35 = list(makeSymbol("SPEC-NAT"), makeSymbol("SPEC-COL"), makeSymbol("MT"));
  public static final SubLList $list36 = list(makeSymbol("GAF"), makeSymbol("COL"), makeSymbol("MT"));
  public static final SubLList $list37 = list(makeSymbol("PRED"), makeSymbol("SPEC"), makeSymbol("GENL"));
  public static final SubLList $list38 = list(makeSymbol("KNOWN-NAT"), makeSymbol("KNOWN-COL"), makeSymbol("KNOWN-MT"));
  public static final SubLList $list39 = list(makeSymbol("KNOWN-NAT"), makeSymbol("KNOWN-MT"));

  //// Initializers

  public void declareFunctions() {
    declare_preserves_genls_in_arg_file();
  }

  public void initializeVariables() {
    init_preserves_genls_in_arg_file();
  }

  public void runTopLevelForms() {
    setup_preserves_genls_in_arg_file();
  }

}
