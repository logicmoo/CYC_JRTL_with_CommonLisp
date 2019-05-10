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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.file_vector_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.map_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class cardinality_estimates extends SubLTranslatedFile {

  //// Constructor

  private cardinality_estimates() {}
  public static final SubLFile me = new cardinality_estimates();
  public static final String myName = "com.cyc.cycjava_1.cycl.cardinality_estimates";

  //// Definitions

  /** Return an estimate of the number of instances of TERM. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 2934) 
  public static final SubLObject instance_cardinality(SubLObject v_term) {
    checkType(v_term, $sym1$FORT_P);
    return total_instance_cardinality(v_term);
  }

  /** Return an estimate of the number of generalizations of TERM. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 3294) 
  public static final SubLObject genl_cardinality(SubLObject v_term) {
    checkType(v_term, $sym0$FORT_OR_CHLMT_P);
    return total_genl_cardinality(v_term);
  }

  /** Return an estimate of the number of specializations of TERM. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 3474) 
  public static final SubLObject spec_cardinality(SubLObject v_term) {
    checkType(v_term, $sym0$FORT_OR_CHLMT_P);
    if ((NIL != hlmt.hlmt_naut_p(v_term))) {
      v_term = hlmt.hlmt_monad_mt(v_term);
    }
    return total_spec_cardinality(v_term);
  }

  /** Return an estimate of the number of uses generalized by TERM. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 3721) 
  public static final SubLObject use_cardinality(SubLObject v_term) {
    checkType(v_term, $sym0$FORT_OR_CHLMT_P);
    return Numbers.add(instance_cardinality(v_term), spec_cardinality(v_term));
  }

  public static final class $generality_estimate$UnaryFunction extends UnaryFunction {
    public $generality_estimate$UnaryFunction() { super(extractFunctionNamed("GENERALITY-ESTIMATE")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3913"); }
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 6732) 
  public static final SubLObject instance_iteration_cost(SubLObject v_term) {
    checkType(v_term, $sym1$FORT_P);
    return instance_cardinality(v_term);
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 7336) 
  private static SubLSymbol $local_instance_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 7839) 
  private static SubLSymbol $local_quoted_instance_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 8405) 
  private static SubLSymbol $local_spec_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 8726) 
  private static SubLSymbol $total_instance_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 8801) 
  public static final SubLObject total_instance_cardinality(SubLObject v_term) {
    return Hashtables.gethash_without_values(v_term, $total_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 9232) 
  private static SubLSymbol $total_quoted_instance_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 9320) 
  public static final SubLObject total_quoted_instance_cardinality(SubLObject v_term) {
    return Hashtables.gethash_without_values(v_term, $total_quoted_instance_cardinality$.getGlobalValue(), ZERO_INTEGER);
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 9800) 
  private static SubLSymbol $total_spec_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 9865) 
  public static final SubLObject total_spec_cardinality(SubLObject v_term) {
    return Hashtables.gethash_without_values(v_term, $total_spec_cardinality$.getGlobalValue(), ZERO_INTEGER);
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 9978) 
  public static final SubLObject set_total_spec_cardinality(SubLObject v_term, SubLObject count) {
    Hashtables.sethash(v_term, $total_spec_cardinality$.getGlobalValue(), count);
    return v_term;
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 10268) 
  private static SubLSymbol $total_genl_cardinality$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 10334) 
  public static final SubLObject total_genl_cardinality(SubLObject v_term) {
    return Hashtables.gethash_without_values(v_term, $total_genl_cardinality$.getGlobalValue(), ZERO_INTEGER);
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 10447) 
  public static final SubLObject set_total_genl_cardinality(SubLObject v_term, SubLObject count) {
    Hashtables.sethash(v_term, $total_genl_cardinality$.getGlobalValue(), count);
    return v_term;
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 10589) 
  private static SubLSymbol $generality_estimate_table$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 10916) 
  public static final SubLObject set_generality_estimate(SubLObject v_term, SubLObject estimate) {
    Hashtables.sethash(v_term, $generality_estimate_table$.getGlobalValue(), estimate);
    return v_term;
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 11064) 
  public static final SubLObject setup_cardinality_tables(SubLObject estimated_size) {
    {
      SubLObject local_instance_cardinality_size = Numbers.integerDivide(estimated_size, TEN_INTEGER);
      SubLObject total_instance_cardinality_size = local_instance_cardinality_size;
      SubLObject local_quoted_instance_cardinality_size = Numbers.integerDivide(estimated_size, TEN_INTEGER);
      SubLObject total_quoted_instance_cardinality_size = local_quoted_instance_cardinality_size;
      SubLObject local_spec_cardinality_size = Numbers.integerDivide(estimated_size, TEN_INTEGER);
      SubLObject total_spec_cardinality_size = local_spec_cardinality_size;
      SubLObject total_genl_cardinality_size = total_spec_cardinality_size;
      SubLObject generality_estimate_size = total_genl_cardinality_size;
      if ((!($local_instance_cardinality$.getGlobalValue().isHashtable()))) {
        $local_instance_cardinality$.setGlobalValue(Hashtables.make_hash_table(local_instance_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($total_instance_cardinality$.getGlobalValue().isHashtable()))) {
        $total_instance_cardinality$.setGlobalValue(Hashtables.make_hash_table(total_instance_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($local_quoted_instance_cardinality$.getGlobalValue().isHashtable()))) {
        $local_quoted_instance_cardinality$.setGlobalValue(Hashtables.make_hash_table(local_quoted_instance_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($total_quoted_instance_cardinality$.getGlobalValue().isHashtable()))) {
        $total_quoted_instance_cardinality$.setGlobalValue(Hashtables.make_hash_table(total_quoted_instance_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($local_spec_cardinality$.getGlobalValue().isHashtable()))) {
        $local_spec_cardinality$.setGlobalValue(Hashtables.make_hash_table(local_spec_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($total_spec_cardinality$.getGlobalValue().isHashtable()))) {
        $total_spec_cardinality$.setGlobalValue(Hashtables.make_hash_table(total_spec_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($total_genl_cardinality$.getGlobalValue().isHashtable()))) {
        $total_genl_cardinality$.setGlobalValue(Hashtables.make_hash_table(total_genl_cardinality_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
      if ((!($generality_estimate_table$.getGlobalValue().isHashtable()))) {
        $generality_estimate_table$.setGlobalValue(Hashtables.make_hash_table(generality_estimate_size, Symbols.symbol_function(EQ), control_vars.$table_area$.getGlobalValue()));
      }
    }
    return estimated_size;
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 23023) 
  public static final SubLObject load_cardinality_estimates_from_stream(SubLObject stream) {
    $local_instance_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $local_quoted_instance_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $local_spec_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $total_instance_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $total_quoted_instance_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $total_spec_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $total_genl_cardinality$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    $generality_estimate_table$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  /** Conservatively update the cardinality estimates of SPEC and GENL due to a new
link between them. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 23685) 
  public static final SubLObject update_cardinality_estimates_wrt_genls(SubLObject spec, SubLObject genl) {
    checkType(spec, $sym0$FORT_OR_CHLMT_P);
    checkType(genl, $sym0$FORT_OR_CHLMT_P);
    update_instance_cardinality(spec, genl);
    update_spec_cardinality(spec, genl);
    update_genl_cardinality(spec, genl);
    update_generality_estimate(spec);
    update_generality_estimate(genl);
    return NIL;
  }

  /** Remove TERM from any of the cardinality estimate tables */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 24210) 
  public static final SubLObject clear_cardinality_estimates(SubLObject v_term) {
    Hashtables.remhash(v_term, $local_instance_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $local_quoted_instance_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $local_spec_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $total_instance_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $total_quoted_instance_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $total_spec_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $total_genl_cardinality$.getGlobalValue());
    Hashtables.remhash(v_term, $generality_estimate_table$.getGlobalValue());
    return v_term;
  }

  /** Conservatively update the instance cardinality estimate due to SPEC GENL link. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 24785) 
  public static final SubLObject update_instance_cardinality(SubLObject spec, SubLObject genl) {
    {
      SubLObject spec_card = total_instance_cardinality(spec);
      SubLObject genl_card = total_instance_cardinality(genl);
      if (spec_card.numG(genl_card)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3953");
      }
    }
    {
      SubLObject spec_card = total_quoted_instance_cardinality(spec);
      SubLObject genl_card = total_quoted_instance_cardinality(genl);
      if (spec_card.numG(genl_card)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3954");
      }
    }
    return NIL;
  }

  /** Conservatively update the spec cardinality estimate due to SPEC GENL link. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 25409) 
  public static final SubLObject update_spec_cardinality(SubLObject spec, SubLObject genl) {
    {
      SubLObject spec_card = total_spec_cardinality(spec);
      SubLObject genl_card = total_spec_cardinality(genl);
      SubLObject conservative_new_genl_card = number_utilities.f_1X(spec_card);
      if (conservative_new_genl_card.numG(genl_card)) {
        set_total_spec_cardinality(genl, conservative_new_genl_card);
      }
    }
    return NIL;
  }

  /** Conservatively update the genl cardinality estimate due to SPEC GENL link. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 25938) 
  public static final SubLObject update_genl_cardinality(SubLObject spec, SubLObject genl) {
    {
      SubLObject spec_card = total_genl_cardinality(spec);
      SubLObject genl_card = total_genl_cardinality(genl);
      SubLObject conservative_new_spec_card = number_utilities.f_1X(genl_card);
      if (conservative_new_spec_card.numG(spec_card)) {
        set_total_genl_cardinality(spec, conservative_new_spec_card);
      }
    }
    return NIL;
  }

  /** Update the generality estimate for TERM. */
  @SubL(source = "cycl/cardinality-estimates.lisp", position = 26467) 
  public static final SubLObject update_generality_estimate(SubLObject v_term) {
    {
      SubLObject new_estimate = compute_generality_estimate(v_term);
      set_generality_estimate(v_term, new_estimate);
      return new_estimate;
    }
  }

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 26696) 
  private static SubLSymbol $generality_estimate_scale_factor$ = null;

  @SubL(source = "cycl/cardinality-estimates.lisp", position = 26759) 
  public static final SubLObject compute_generality_estimate(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject scale = $generality_estimate_scale_factor$.getDynamicValue(thread);
        SubLObject numerator = Numbers.multiply(scale, use_cardinality(v_term));
        SubLObject denominator = Numbers.max(genl_cardinality(v_term), ONE_INTEGER);
        return Values.values(Numbers.truncate(numerator, denominator));
      }
    }
  }

  public static final SubLObject declare_cardinality_estimates_file() {
    //declareFunction(myName, "cardinality_estimates_initializedP", "CARDINALITY-ESTIMATES-INITIALIZED?", 0, 0, false);
    //declareFunction(myName, "rebuild_cardinality_estimates", "REBUILD-CARDINALITY-ESTIMATES", 0, 0, false);
    //declareFunction(myName, "initialize_cardinalities", "INITIALIZE-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "isa_cardinality", "ISA-CARDINALITY", 1, 0, false);
    declareFunction(myName, "instance_cardinality", "INSTANCE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "quoted_instance_cardinality", "QUOTED-INSTANCE-CARDINALITY", 1, 0, false);
    declareFunction(myName, "genl_cardinality", "GENL-CARDINALITY", 1, 0, false);
    declareFunction(myName, "spec_cardinality", "SPEC-CARDINALITY", 1, 0, false);
    declareFunction(myName, "use_cardinality", "USE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "lightest_node", "LIGHTEST-NODE", 2, 0, false);
    //declareFunction(myName, "shallowest_node", "SHALLOWEST-NODE", 2, 0, false);
    //declareFunction(myName, "generality_estimate", "GENERALITY-ESTIMATE", 1, 0, false); new $generality_estimate$UnaryFunction();
    //declareFunction(myName, "sort_by_generality_estimate", "SORT-BY-GENERALITY-ESTIMATE", 1, 1, false);
    //declareFunction(myName, "stable_sort_by_generality_estimate", "STABLE-SORT-BY-GENERALITY-ESTIMATE", 1, 1, false);
    //declareFunction(myName, "generality_estimateL", "GENERALITY-ESTIMATE<", 2, 0, false);
    //declareFunction(myName, "generality_estimateG", "GENERALITY-ESTIMATE>", 2, 0, false);
    declareFunction(myName, "instance_iteration_cost", "INSTANCE-ITERATION-COST", 1, 0, false);
    //declareFunction(myName, "quoted_instance_iteration_cost", "QUOTED-INSTANCE-ITERATION-COST", 1, 0, false);
    //declareFunction(myName, "clear_cardinalities", "CLEAR-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "local_instance_cardinality", "LOCAL-INSTANCE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "set_local_instance_cardinality", "SET-LOCAL-INSTANCE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "increment_local_instance_cardinality", "INCREMENT-LOCAL-INSTANCE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "local_quoted_instance_cardinality", "LOCAL-QUOTED-INSTANCE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "set_local_quoted_instance_cardinality", "SET-LOCAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "increment_local_quoted_instance_cardinality", "INCREMENT-LOCAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "local_spec_cardinality", "LOCAL-SPEC-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "set_local_spec_cardinality", "SET-LOCAL-SPEC-CARDINALITY", 2, 0, false);
    declareFunction(myName, "total_instance_cardinality", "TOTAL-INSTANCE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "set_total_instance_cardinality", "SET-TOTAL-INSTANCE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "increment_total_instance_cardinality", "INCREMENT-TOTAL-INSTANCE-CARDINALITY", 2, 0, false);
    declareFunction(myName, "total_quoted_instance_cardinality", "TOTAL-QUOTED-INSTANCE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "set_total_quoted_instance_cardinality", "SET-TOTAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "increment_total_quoted_instance_cardinality", "INCREMENT-TOTAL-QUOTED-INSTANCE-CARDINALITY", 2, 0, false);
    declareFunction(myName, "total_spec_cardinality", "TOTAL-SPEC-CARDINALITY", 1, 0, false);
    declareFunction(myName, "set_total_spec_cardinality", "SET-TOTAL-SPEC-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "increment_total_spec_cardinality", "INCREMENT-TOTAL-SPEC-CARDINALITY", 2, 0, false);
    declareFunction(myName, "total_genl_cardinality", "TOTAL-GENL-CARDINALITY", 1, 0, false);
    declareFunction(myName, "set_total_genl_cardinality", "SET-TOTAL-GENL-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "get_generality_estimate", "GET-GENERALITY-ESTIMATE", 1, 0, false);
    declareFunction(myName, "set_generality_estimate", "SET-GENERALITY-ESTIMATE", 2, 0, false);
    declareFunction(myName, "setup_cardinality_tables", "SETUP-CARDINALITY-TABLES", 1, 0, false);
    //declareFunction(myName, "clear_local_cardinalities", "CLEAR-LOCAL-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_local_cardinalities", "INITIALIZE-LOCAL-CARDINALITIES", 0, 0, false);
    //declareMacro(myName, "do_sbhl_module_nodes", "DO-SBHL-MODULE-NODES");
    //declareFunction(myName, "get_sbhl_module_size", "GET-SBHL-MODULE-SIZE", 1, 0, false);
    //declareFunction(myName, "initialize_collection_local_spec_cardinalities", "INITIALIZE-COLLECTION-LOCAL-SPEC-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_collection_local_instance_cardinalities", "INITIALIZE-COLLECTION-LOCAL-INSTANCE-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_collection_local_quoted_instance_cardinalities", "INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_predicate_local_spec_cardinalities", "INITIALIZE-PREDICATE-LOCAL-SPEC-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_microtheory_local_spec_cardinalities", "INITIALIZE-MICROTHEORY-LOCAL-SPEC-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_other_local_instance_cardinalities", "INITIALIZE-OTHER-LOCAL-INSTANCE-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "clear_total_cardinalities", "CLEAR-TOTAL-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_total_cardinalities", "INITIALIZE-TOTAL-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_collection_total_cardinalities", "INITIALIZE-COLLECTION-TOTAL-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_predicate_total_cardinalities", "INITIALIZE-PREDICATE-TOTAL-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "initialize_microtheory_total_cardinalities", "INITIALIZE-MICROTHEORY-TOTAL-CARDINALITIES", 0, 0, false);
    //declareFunction(myName, "clear_generality_estimates", "CLEAR-GENERALITY-ESTIMATES", 0, 0, false);
    //declareFunction(myName, "initialize_generality_estimates", "INITIALIZE-GENERALITY-ESTIMATES", 0, 0, false);
    //declareFunction(myName, "dump_cardinality_estimates_to_stream", "DUMP-CARDINALITY-ESTIMATES-TO-STREAM", 1, 0, false);
    declareFunction(myName, "load_cardinality_estimates_from_stream", "LOAD-CARDINALITY-ESTIMATES-FROM-STREAM", 1, 0, false);
    declareFunction(myName, "update_cardinality_estimates_wrt_genls", "UPDATE-CARDINALITY-ESTIMATES-WRT-GENLS", 2, 0, false);
    declareFunction(myName, "clear_cardinality_estimates", "CLEAR-CARDINALITY-ESTIMATES", 1, 0, false);
    declareFunction(myName, "update_instance_cardinality", "UPDATE-INSTANCE-CARDINALITY", 2, 0, false);
    declareFunction(myName, "update_spec_cardinality", "UPDATE-SPEC-CARDINALITY", 2, 0, false);
    declareFunction(myName, "update_genl_cardinality", "UPDATE-GENL-CARDINALITY", 2, 0, false);
    declareFunction(myName, "update_generality_estimate", "UPDATE-GENERALITY-ESTIMATE", 1, 0, false);
    declareFunction(myName, "compute_generality_estimate", "COMPUTE-GENERALITY-ESTIMATE", 1, 0, false);
    //declareFunction(myName, "initialize_inference_test_cardinalities", "INITIALIZE-INFERENCE-TEST-CARDINALITIES", 1, 0, false);
    //declareFunction(myName, "disjointness_power", "DISJOINTNESS-POWER", 2, 0, false);
    //declareFunction(myName, "gt_inverse_cardinality", "GT-INVERSE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "gt_predicate_cardinality", "GT-PREDICATE-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "gt_pred_extent_cardinality", "GT-PRED-EXTENT-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "collection_and_specs_assertion_count", "COLLECTION-AND-SPECS-ASSERTION-COUNT", 1, 1, false);
    //declareFunction(myName, "terms_assertion_count", "TERMS-ASSERTION-COUNT", 1, 2, false);
    return NIL;
  }

  public static final SubLObject init_cardinality_estimates_file() {
    $local_instance_cardinality$ = deflexical("*LOCAL-INSTANCE-CARDINALITY*", maybeDefault( $sym7$_LOCAL_INSTANCE_CARDINALITY_, $local_instance_cardinality$, NIL));
    $local_quoted_instance_cardinality$ = deflexical("*LOCAL-QUOTED-INSTANCE-CARDINALITY*", maybeDefault( $sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_, $local_quoted_instance_cardinality$, NIL));
    $local_spec_cardinality$ = deflexical("*LOCAL-SPEC-CARDINALITY*", maybeDefault( $sym9$_LOCAL_SPEC_CARDINALITY_, $local_spec_cardinality$, NIL));
    $total_instance_cardinality$ = deflexical("*TOTAL-INSTANCE-CARDINALITY*", maybeDefault( $sym10$_TOTAL_INSTANCE_CARDINALITY_, $total_instance_cardinality$, NIL));
    $total_quoted_instance_cardinality$ = deflexical("*TOTAL-QUOTED-INSTANCE-CARDINALITY*", maybeDefault( $sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_, $total_quoted_instance_cardinality$, NIL));
    $total_spec_cardinality$ = deflexical("*TOTAL-SPEC-CARDINALITY*", maybeDefault( $sym12$_TOTAL_SPEC_CARDINALITY_, $total_spec_cardinality$, NIL));
    $total_genl_cardinality$ = deflexical("*TOTAL-GENL-CARDINALITY*", maybeDefault( $sym13$_TOTAL_GENL_CARDINALITY_, $total_genl_cardinality$, NIL));
    $generality_estimate_table$ = deflexical("*GENERALITY-ESTIMATE-TABLE*", maybeDefault( $sym14$_GENERALITY_ESTIMATE_TABLE_, $generality_estimate_table$, NIL));
    $generality_estimate_scale_factor$ = defparameter("*GENERALITY-ESTIMATE-SCALE-FACTOR*", $int58$100);
    return NIL;
  }

  public static final SubLObject setup_cardinality_estimates_file() {
    // CVS_ID("Id: cardinality-estimates.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym7$_LOCAL_INSTANCE_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym9$_LOCAL_SPEC_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym10$_TOTAL_INSTANCE_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym12$_TOTAL_SPEC_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym13$_TOTAL_GENL_CARDINALITY_);
    subl_macro_promotions.declare_defglobal($sym14$_GENERALITY_ESTIMATE_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FORT_OR_CHLMT_P = makeSymbol("FORT-OR-CHLMT-P");
  public static final SubLSymbol $sym1$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw2$ASCENDING = makeKeyword("ASCENDING");
  public static final SubLSymbol $sym3$_ = makeSymbol("<");
  public static final SubLSymbol $sym4$GENERALITY_ESTIMATE = makeSymbol("GENERALITY-ESTIMATE");
  public static final SubLSymbol $kw5$DESCENDING = makeKeyword("DESCENDING");
  public static final SubLSymbol $sym6$_ = makeSymbol(">");
  public static final SubLSymbol $sym7$_LOCAL_INSTANCE_CARDINALITY_ = makeSymbol("*LOCAL-INSTANCE-CARDINALITY*");
  public static final SubLSymbol $sym8$_LOCAL_QUOTED_INSTANCE_CARDINALITY_ = makeSymbol("*LOCAL-QUOTED-INSTANCE-CARDINALITY*");
  public static final SubLSymbol $sym9$_LOCAL_SPEC_CARDINALITY_ = makeSymbol("*LOCAL-SPEC-CARDINALITY*");
  public static final SubLSymbol $sym10$_TOTAL_INSTANCE_CARDINALITY_ = makeSymbol("*TOTAL-INSTANCE-CARDINALITY*");
  public static final SubLSymbol $sym11$_TOTAL_QUOTED_INSTANCE_CARDINALITY_ = makeSymbol("*TOTAL-QUOTED-INSTANCE-CARDINALITY*");
  public static final SubLSymbol $sym12$_TOTAL_SPEC_CARDINALITY_ = makeSymbol("*TOTAL-SPEC-CARDINALITY*");
  public static final SubLSymbol $sym13$_TOTAL_GENL_CARDINALITY_ = makeSymbol("*TOTAL-GENL-CARDINALITY*");
  public static final SubLSymbol $sym14$_GENERALITY_ESTIMATE_TABLE_ = makeSymbol("*GENERALITY-ESTIMATE-TABLE*");
  public static final SubLList $list15 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list16 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw17$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw18$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $kw19$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym20$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym21$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");
  public static final SubLSymbol $sym22$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym23$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym24$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym25$GET_SBHL_MODULE_SIZE = makeSymbol("GET-SBHL-MODULE-SIZE");
  public static final SubLList $list26 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym27$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym28$DO_SBHL_MODULE_NODES = makeSymbol("DO-SBHL-MODULE-NODES");
  public static final SubLSymbol $sym29$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLSymbol $sym30$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym31$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");
  public static final SubLSymbol $sym32$LINK_VAR = makeUninternedSymbol("LINK-VAR");
  public static final SubLSymbol $sym33$DO_SBHL_GRAPH_LINKS = makeSymbol("DO-SBHL-GRAPH-LINKS");
  public static final SubLSymbol $kw34$MODULE = makeKeyword("MODULE");
  public static final SubLSymbol $sym35$IGNORE = makeSymbol("IGNORE");
  public static final SubLString $str36$Calculating_collection_local_spec = makeString("Calculating collection local spec cardinalities");
  public static final SubLObject $const37$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym38$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const39$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLList $list40 = list(makeSymbol("TERM"), makeUninternedSymbol("IMPL-VALUE"));
  public static final SubLString $str41$Calculating_collection_local_inst = makeString("Calculating collection local instance cardinalities");
  public static final SubLObject $const42$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLString $str43$Calculating_collection_local_quot = makeString("Calculating collection local quoted instance cardinalities");
  public static final SubLObject $const44$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLString $str45$Calculating_predicate_local_spec_ = makeString("Calculating predicate local spec cardinalities");
  public static final SubLObject $const46$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLString $str47$Calculating_microtheory_local_spe = makeString("Calculating microtheory local spec cardinalities");
  public static final SubLObject $const48$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLString $str49$Calculating_other_local_instance_ = makeString("Calculating other local instance cardinalities");
  public static final SubLSymbol $kw50$SKIP = makeKeyword("SKIP");
  public static final SubLString $str51$Calculating_collection_total_card = makeString("Calculating collection total cardinalities");
  public static final SubLList $list52 = list(makeSymbol("COL"), makeUninternedSymbol("IMPL-VALUE"));
  public static final SubLString $str53$Calculating_predicate_total_cardi = makeString("Calculating predicate total cardinalities");
  public static final SubLList $list54 = list(makeSymbol("PREDICATE"), makeUninternedSymbol("IMPL-VALUE"));
  public static final SubLString $str55$Calculating_microtheory_total_car = makeString("Calculating microtheory total cardinalities");
  public static final SubLList $list56 = list(makeSymbol("MT"), makeUninternedSymbol("IMPL-VALUE"));
  public static final SubLString $str57$Calculating_generality_estimates = makeString("Calculating generality estimates");
  public static final SubLInteger $int58$100 = makeInteger(100);
  public static final SubLSymbol $kw59$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw60$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw61$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym62$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw63$ERROR = makeKeyword("ERROR");
  public static final SubLString $str64$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym65$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw66$CERROR = makeKeyword("CERROR");
  public static final SubLString $str67$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw68$WARN = makeKeyword("WARN");
  public static final SubLString $str69$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str70$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str71$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw72$BREADTH = makeKeyword("BREADTH");

  //// Initializers

  public void declareFunctions() {
    declare_cardinality_estimates_file();
  }

  public void initializeVariables() {
    init_cardinality_estimates_file();
  }

  public void runTopLevelForms() {
    setup_cardinality_estimates_file();
  }

}
